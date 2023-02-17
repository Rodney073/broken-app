package bredex.brokenapp.model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShareDTO implements Serializable {

    private Date buyDate;
    private Integer buyPrice;
    private Integer buyCost;
    private Date sellDate;
    private Integer sellPrice;
    private Integer sellCost;
    private Integer userId;

    private List<StockDTO> stocks = new ArrayList<>();
}
