package bredex.brokenapp.dao;

import org.springframework.data.repository.CrudRepository;

import bredex.brokenapp.entity.Share;

public interface ShareDao extends CrudRepository<Share, Long> {
}
