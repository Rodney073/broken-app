package bredex.brokenapp.model;


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

    private Integer stockId;
    private String type;
    private Date buyDate;
    private Integer buyPrice;
    private Integer buyCost;
    private Date sellDate;
    private Integer sellPrice;
    private Integer sellCost;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    private ShareCurrency currency;
}
