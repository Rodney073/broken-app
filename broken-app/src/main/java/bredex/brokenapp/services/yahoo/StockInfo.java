package bredex.brokenapp.services.yahoo;


import java.io.IOException;

import org.springframework.stereotype.Service;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

@Service
public class StockInfo implements IStockInfo {

    @Override
    public Stock getStockInfo(String stockID) {
        Stock stock;
        try {
            stock = YahooFinance.get(stockID);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        return stock;
    }
}

