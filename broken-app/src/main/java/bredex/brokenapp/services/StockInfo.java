package bredex.brokenapp.services;

import java.io.IOException;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class StockInfo implements IStockInfo {

    @Override
    public Stock getStockInfo(String stockID) {
        Stock stock;
        try {
            stock = YahooFinance.get(stockID);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return stock;
    }
}

