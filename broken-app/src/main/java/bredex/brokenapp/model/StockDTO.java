package bredex.brokenapp.model;


import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StockDTO implements Serializable {

    private String id;
    private String name;
    private BigDecimal price;
    private BigDecimal earningPerShare;
    private BigDecimal priceToEarning;
}
