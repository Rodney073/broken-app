package bredex.brokenapp.services;

import java.time.LocalDate;

import bredex.brokenapp.dao.UserDao;
import bredex.brokenapp.domain.UserRegistartion;
import bredex.brokenapp.entity.BrokerUser;
import bredex.brokenapp.security.BrokerUserDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService implements UserDetailsService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private PasswordEncoder bcryptEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) {
        BrokerUser user = userDao.findByUsername(username).orElseThrow();
        userDao.save(user);

        return new BrokerUserDetails(user);
    }

    public BrokerUser saveUser(UserRegistartion userRegistration) throws Exception {
        if(userDao.existsByUsername(userRegistration.getUsername())) {
            throw new Exception(userRegistration.getUsername());
        }

        if(userRegistration.password.compareTo(userRegistration.passwordAgain)!=0){
            throw new Exception();
        }

        BrokerUser newUser = new BrokerUser();
        newUser.setUsername(userRegistration.getUsername());
        newUser.setPassword(bcryptEncoder.encode(userRegistration.getPassword()));
        newUser.setEnabled(false);

        return userDao.save(newUser);
    }
}