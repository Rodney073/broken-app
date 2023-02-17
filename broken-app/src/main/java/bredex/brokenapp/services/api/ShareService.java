package bredex.brokenapp.services.api;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bredex.brokenapp.dao.ShareDao;
import bredex.brokenapp.entity.Share;
import bredex.brokenapp.model.ShareDTO;
import bredex.brokenapp.services.stock.IStockService;

@Service
public class ShareService implements IShareService {

    @Autowired
    private ShareDao shareDao;

    @Autowired
    IStockService stockService;

    @Override
    public List<ShareDTO> getShares(Integer userId) {
        final List<Share> shares = shareDao.findByUserId(userId);
        return shares.stream().map(this::map).collect(Collectors.toList());
    }

    private ShareDTO map(Share share) {
        final ShareDTO result = new ShareDTO();
        result.setBuyCost(share.getBuyCost());
        result.setBuyDate(share.getBuyDate());
        result.setBuyPrice(share.getBuyPrice());
        result.setSellCost(share.getSellCost());
        result.setSellPrice(share.getSellPrice());
        result.setSellDate(share.getSellDate());

        result.setUserId(share.getUserId());
        result.setStocks(stockService.getStocks());

        return result;
    }
}
