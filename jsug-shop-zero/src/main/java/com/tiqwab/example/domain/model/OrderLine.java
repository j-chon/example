package com.tiqwab.example.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderLine {

    private Goods goods;
    private Integer quantity;
    private Integer lineNo;

    public long getSubtotal() {
        return this.goods.getPrice() * quantity;
    }

}
