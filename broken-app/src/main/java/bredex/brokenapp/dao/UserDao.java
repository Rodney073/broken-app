package bredex.brokenapp.dao;

import org.springframework.data.repository.CrudRepository;

import bredex.brokenapp.domain.Users;

public interface UserDao extends CrudRepository<Users, Long> {
}
