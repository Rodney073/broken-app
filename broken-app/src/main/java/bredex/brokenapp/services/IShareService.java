package bredex.brokenapp.services;


import java.util.List;

import org.springframework.stereotype.Service;

import bredex.brokenapp.model.ShareDTO;

@Service
public interface IShareService {

    List<ShareDTO> getShares(Integer userId);
}
