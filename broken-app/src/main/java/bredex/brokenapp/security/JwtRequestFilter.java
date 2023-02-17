package bredex.brokenapp.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class JwtRequestFilter extends OncePerRequestFilter {
	Logger logger = LoggerFactory.getLogger(JwtRequestFilter.class);

	@Autowired
	private JwtAuthenticationService jwtAuthenticationService;

	@Autowired
	private hu.bme.aut.forumapplicationbackend.services.UserService userService;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;


	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {

		final String requestTokenHeader = request.getHeader("Authorization");
		jwtAuthenticationService.authenticate(requestTokenHeader, request);
		chain.doFilter(request, response);
	}

}