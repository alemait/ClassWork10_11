package org.itstep.flowerShop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Flower implements Comparable< Flower >{
    protected String name = "";
    private Date date; // Когда срезали
    private String sDate;
    protected double price; // Стоимость
    private int length; // Длина стебля в см
    protected FlowerColors color;

    Flower(String sDate, double price, FlowerColors color, int length) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        this.date = dateFormat.parse(sDate);
        this.sDate = sDate;
        this.price = price;
        this.color = color;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    public FlowerColors getColor() {
        return color;
    }

    public int getLength() {
        return length;
    }

    @Override
    public int compareTo(Flower flower) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        Date date1 = getDate();
        Date date2 = flower.getDate();
        String sDate1 = dateFormat.format(date1);
        String sDate2 = dateFormat.format(date2);
        return sDate1.compareTo(sDate2);
    }

    public String getsDate() {
        return sDate;
    }

    public String toString(){
        return "";
    }
}