package bredex.brokenapp.services;


import bredex.brokenapp.model.StockDTO;

public interface IStockService {
    StockDTO getStocks(String stockID);
}
