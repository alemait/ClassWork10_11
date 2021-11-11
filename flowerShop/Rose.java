package org.itstep.flowerShop;

import java.text.ParseException;
import java.util.Date;

enum RoseSorts {
    Climbing, English, Floribunda, Grandiflora, Groundcover, HybridTea, Miniature, Polyantha
}

public class Rose extends Flower {
    private RoseSorts sort;

    Rose(String sDate, double price, FlowerColors color, RoseSorts sort, int length) throws ParseException {
        super(sDate, price, color, length);
        this.name = "Rose";
        this.sort = sort;
    }

    public RoseSorts getSort() {
        return sort;
    }

    public String toString(){
        String result = String.format("[Flower: %s, color: %s, sort: %s, date:%s, price:%f, length:%d]%n",
                getName(), getColor().toString(), getSort().toString(),
                getsDate(), getPrice(), getLength());
        return result;
    }
}
