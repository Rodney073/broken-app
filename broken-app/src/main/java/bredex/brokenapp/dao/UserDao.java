package bredex.brokenapp.dao;

import bredex.brokenapp.entity.BrokerUser;
import org.springframework.data.repository.CrudRepository;

import bredex.brokenapp.domain.Users;

import java.util.Optional;

public interface UserDao extends CrudRepository<BrokerUser, Integer> {
    Optional<BrokerUser> findByUsername(String username);
    Boolean existsByUsername(String username);
}
