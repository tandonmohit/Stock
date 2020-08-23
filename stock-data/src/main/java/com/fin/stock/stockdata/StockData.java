package com.fin.stock.stockdata;

import java.math.BigDecimal;


public class StockData {

    private Long id;
    private String symbol;
    private BigDecimal price;

    public StockData() {
    }

    public StockData(Long id, String symbol, BigDecimal price) {
        this.id = id;
        this.symbol = symbol;
        this.price = price;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


}