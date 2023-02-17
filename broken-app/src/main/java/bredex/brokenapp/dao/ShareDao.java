package bredex.brokenapp.dao;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import bredex.brokenapp.entity.Share;

public interface ShareDao extends CrudRepository<Share, Long> {

    List<Share> findByUserId(Integer userId);
}
