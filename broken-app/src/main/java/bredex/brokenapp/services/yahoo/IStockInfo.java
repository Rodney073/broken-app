package bredex.brokenapp.services.yahoo;


import yahoofinance.Stock;

public interface IStockInfo {

    Stock getStockInfo(String stockID);
}
