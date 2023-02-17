package bredex.brokenapp.services;


import java.util.List;

import bredex.brokenapp.model.StockDTO;

public interface IStockService {
    List<StockDTO> getStocks();
}
