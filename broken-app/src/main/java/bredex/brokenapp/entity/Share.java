package bredex.brokenapp.entity;


import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Entity
@Getter
public class Share implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "share_id")
    private long id;

    @Column(name = "buy_date")
    private Date buyDate;
    @Column(name = "buy_price")
    private Integer buyPrice;
    @Column(name = "buy_cost")
    private Integer buyCost;
    @Column(name = "sell_date")
    private Date sellDate;
    @Column(name = "sell_price")
    private Integer sellPrice;
    @Column(name = "sell_cost")
    private Integer sellCost;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Integer userId;

    @Enumerated(EnumType.STRING)
    private ShareCurrency currency;
}