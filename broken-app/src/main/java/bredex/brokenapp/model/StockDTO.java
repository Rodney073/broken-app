package bredex.brokenapp.model;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public record StockDTO(String id, String name) implements Serializable {
}
