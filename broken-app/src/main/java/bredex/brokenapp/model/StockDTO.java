package bredex.brokenapp.model;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class StockDTO implements Serializable {

    private final String id;
    private final String name;
}
