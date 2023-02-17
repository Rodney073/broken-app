package bredex.brokenapp.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bredex.brokenapp.model.StockDTO;
import yahoofinance.Stock;

@Service
public class StockService implements IStockService {

    @Autowired
    private IStockInfo stockInfo;

    @Override
    public StockDTO getStocks(String stockID) {
        final Stock info = stockInfo.getStockInfo(stockID);

        final StockDTO result = new StockDTO();
        result.setId(stockID);
        result.setName(info.getName());
        result.setPrice(info.getQuote().getPrice());
        result.setEarningPerShare(info.getStats().getEps());
        result.setPriceToEarning(info.getStats().getPe());

        return result;
    }
}
