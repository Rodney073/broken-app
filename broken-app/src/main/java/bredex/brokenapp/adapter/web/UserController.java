package bredex.brokenapp.adapter.web;

import bredex.brokenapp.domain.UserLogin;
import bredex.brokenapp.domain.UserRegistartion;
import bredex.brokenapp.domain.UserToken;
import bredex.brokenapp.entity.BrokerUser;
import bredex.brokenapp.security.BrokerUserDetails;
import bredex.brokenapp.security.JwtTokenUtil;
import bredex.brokenapp.services.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@Validated
@RestController
public class UserController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserService userDetailsService;

    @PostMapping(value = "/authenticate")
    public ResponseEntity<?> createAuthenticationToken(HttpServletResponse response, HttpServletRequest request, @RequestBody UserLogin authenticationRequest) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.username, authenticationRequest.password));
        } catch (BadCredentialsException e) {
            throw new Exception("Authentication failed. Bad Credentials with username: " + authenticationRequest.username);
        }

        final BrokerUserDetails userDetails = (BrokerUserDetails) userDetailsService.loadUserByUsername(authenticationRequest.getUsername());

        final String token = jwtTokenUtil.generateToken(userDetails);

        final String refresh = "todo";

        return ResponseEntity.ok(new UserToken(token, refresh));
    }

    @PostMapping(value = "/register")
    public ResponseEntity<?> saveUser(@RequestBody UserRegistartion user) throws Exception {
        BrokerUser registeredUser = userDetailsService.saveUser(user);
        return ResponseEntity.ok(registeredUser);
    }


    @PostMapping(value = "/logoutUser",  produces="text/plain")
    @PreAuthorize("isAuthenticated()")
    public ResponseEntity<?> logout(){
        SecurityContextHolder.getContext().getAuthentication().setAuthenticated(false);
        return ResponseEntity.ok("Out you logged!");
    }
}