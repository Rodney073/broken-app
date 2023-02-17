package bredex.brokenapp.services;

import yahoofinance.Stock;

public interface IStockInfo {

    Stock getStockInfo(String stockID);
}
