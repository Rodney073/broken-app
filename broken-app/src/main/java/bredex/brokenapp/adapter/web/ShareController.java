package bredex.brokenapp.adapter.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bredex.brokenapp.model.ShareDTO;
import bredex.brokenapp.services.api.IShareService;

@RestController
@RequestMapping("/share")
public class ShareController {

    @Autowired
    private IShareService shareService;

    @GetMapping("/{userId}")
    ResponseEntity<List<ShareDTO>> getShares(@PathVariable Integer userId) {
        return new ResponseEntity<>(shareService.getShares(userId), HttpStatus.OK);
    }
}
