package bredex.brokenapp.services.api;


import java.util.List;

import bredex.brokenapp.model.ShareDTO;

public interface IShareService {

    List<ShareDTO> getShares(Integer userId);
}
