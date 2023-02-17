package bredex.brokenapp.adapter.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bredex.brokenapp.model.ShareDTO;
import bredex.brokenapp.services.api.ShareService;

@RestController
@RequestMapping("/share")
public class ShareController {

    @Autowired
    private ShareService service;

    @RequestMapping(method = RequestMethod.GET, value = "/{userId}")
    public List<ShareDTO> get(
            @PathVariable("userId")
            Integer userId) {
        return service.getShares(userId);
    }
}
