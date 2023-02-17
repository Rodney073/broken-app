package bredex.brokenapp.entity;


import java.io.Serializable;
import java.util.Date;

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
    private long id;

    private Date buyDate;
    private Integer buyPrice;
    private Integer buyCost;
    private Date sellDate;
    private Integer sellPrice;
    private Integer sellCost;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Integer userId;

    @Enumerated(EnumType.STRING)
    private ShareCurrency currency;
}
