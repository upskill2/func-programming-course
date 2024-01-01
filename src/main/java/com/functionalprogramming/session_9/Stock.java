package com.functionalprogramming.session_9;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Stock {

    private String symbol;
    private double price;
    private double units;
}
