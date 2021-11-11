package org.itstep.flowerShop;
/*
1. Цветочница. Определить иерархию цветов. Создать несколько объектов-
цветов. Собрать букет (используя аксессуары) с определением его стоимо-
сти. Провести сортировку цветов в букете на основе уровня свежести. Найти
цветок в букете, соответствующий заданному диапазону длин стеблей.
 */

/*
Запись в школьном дневнике: "Кормите ребенка лучше! Жует цветы в кабинетах!".

- Ты хрупкая как цветок!
- Нет, я хрупкая как граната!

Муж подарил цветы. Теперь вот думаю, или я хорошо себя вела, или он плохо.
 */
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlowerShop {
    public static void main(String[] args) throws ParseException {
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(new Rose("3.01.2001", 5.1, FlowerColors.RED, RoseSorts.Climbing, 30));
        bouquet.addFlower(new Rose("1.01.2001", 7.1, FlowerColors.YELLOW, RoseSorts.Floribunda, 40));
        bouquet.addFlower(new Rose("2.01.2001", 7.1, FlowerColors.ORANGE, RoseSorts.Floribunda, 20));
        bouquet.sort();
        System.out.println(bouquet.toString());

        ArrayList<Flower> flowersBetweenLength = bouquet.getFlowersBetweenLength(25,35);
        for (Flower flower:flowersBetweenLength)
            System.out.println(flower.toString());
    }
}

class Accessory{
    private String name;
    private double price;

    public Accessory(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Bouquet {
    private List<Flower> flowers = new ArrayList<>();
    private List<Accessory> accessories = new ArrayList<>();

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public void addAccessory(Accessory accessory) {
        accessories.add(accessory);
    }

    public double getPrice() {
        double sum = 0;
        for (Flower flower : flowers)
            sum += flower.getPrice();
        for (Accessory accessory : accessories)
            sum += accessory.getPrice();
        return sum;
    }

    public void sort() {
        Collections.sort(flowers);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bouquet: \n");
        for (Flower flower : flowers) {
            String sFlower = flower.toString();
            stringBuilder.append(sFlower);
        }
        return stringBuilder.toString();
    }

    public ArrayList<Flower> getFlowersBetweenLength(int minLength, int maxLength){
        ArrayList<Flower> flowersBetweenLength = new ArrayList<>();
        for (Flower flower:flowers)
            if (flower.getLength()>=minLength&&flower.getLength()<=maxLength)
                flowersBetweenLength.add(flower);
            return flowersBetweenLength;
    }
}


