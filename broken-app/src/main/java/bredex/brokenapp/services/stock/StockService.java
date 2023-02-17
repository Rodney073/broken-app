package bredex.brokenapp.services.stock;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bredex.brokenapp.model.StockDTO;
import bredex.brokenapp.model.StockId;
import bredex.brokenapp.services.yahoo.IStockInfo;
import yahoofinance.Stock;

@Service
public class StockService implements IStockService {

    @Autowired
    private IStockInfo stockInfo;

    @Override
    public List<StockDTO> getStocks() {
        final List<String> stockIds = Arrays.stream(StockId.values()).map(StockId::getName).toList();
        return stockIds.stream().map(s -> map(stockInfo.getStockInfo(s), s)).collect(Collectors.toList());
    }

    private StockDTO map(Stock stock, String id) {
        final StockDTO result = new StockDTO();
        result.setId(id);
        result.setName(stock.getName());
        result.setPrice(stock.getQuote().getPrice());
        result.setEarningPerShare(stock.getStats().getEps());
        result.setPriceToEarning(stock.getStats().getPe());

        return result;
    }
}
