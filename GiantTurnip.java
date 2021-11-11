package org.itstep;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
PriorityQueue
 Для полного счастья недостаточно встать в очередь. Надо еще уметь постоять за себя.

 */
public class GiantTurnip {
    public static void main(String args[]){  
        FairyTale tale = new FairyTale();
        tale.tell();
    }
}

class Personage implements Comparable{
    private final String name;
    private final int strength;

    Personage(String name, int strength){
        this.name = name;
        this.strength = strength;
    }
    
    public String getName() {
        return name;
    }
   
    public int getStrength() {
        return strength;
    }

    @Override
    public int compareTo(Object o) {
        return (int) (this.getStrength() - ((Personage)o).getStrength());
    }
}

class FairyTale{
    private Queue<Personage> queue;
    FairyTale(){
    this.queue = new PriorityQueue<>(1);
    queue.add(new Personage("turnip",27));
    queue.add(new Personage("mouse",1));
    queue.add(new Personage("old man",10));
    queue.add(new Personage("old woman",7));
    queue.add(new Personage("granddaughter",5));
    queue.add(new Personage("dog",3));
    queue.add(new Personage("cat",2));
    //System.out.println(queue.size());    
    }
    
    public void tell(){
        /*
        while (!queue.isEmpty()) {
            Personage personage = queue.poll();
          System.out.println(personage.getName());
        }
*/
       int fullStrength = 0;
        Personage personage = queue.poll();
        Personage personNext = null;
        while (!queue.isEmpty()) {
            fullStrength+=personage.getStrength();
            personNext=queue.poll();
            System.out.println("The "+personage.getName()+" took hold of the "+personNext.getName());
            personage = personNext;
        }        
        if (fullStrength>personNext.getStrength()){
        System.out.println("They all pulled and pulled, and pulled some more - and finally out came the turnip!");
        }
        else
            System.out.println("They all pulled and pulled. But still they could not pull the turnip out.");
    }
    
        //Анонимный класс компаратора - для более сложных сравнений
    public Comparator<Personage> comparator = new Comparator<>(){
        @Override
        public int compare(Personage c1, Personage c2) {
            return (int) (c1.getStrength() - c2.getStrength());
    }
    };
}