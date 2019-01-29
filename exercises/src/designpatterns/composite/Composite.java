/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 2923201
 */
public class Composite {
    public static void main(String[] args) {
        BowMan bm = new BowMan();
        bm.move(20, 25);
        
        HorseMan hm = new HorseMan();
        hm.move(20, 25);        
        
        Group g1 = new Group();
        g1.add(bm);
        g1.add(hm);

        Group g2 = new Group();
        g1.add(new BowMan());
        g1.add(new BowMan());        
        
        Group g3 = new Group();
        g3.add(g1);
        g3.add(g2);
        g3.add(new HorseMan());        
        
        g3.move(20, 30);
    }
}

interface Moveable{
    void move(int x, int y);
}

class Group implements Moveable{
    
    List<Moveable> list = new ArrayList<>();
    
    void add(Moveable m){
        list.add(m);
    }
    
    @Override
    public void move(int x, int y){
        for(Moveable m: list)
            m.move(x, y);
    }    
}


abstract class Unit{

    private int x;
    private int y;
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    boolean checkXAndChange(int to, int speed){
        int x = getX();
    
        if(to == x)
            return true;
        if(to > x)
            setX(x += speed);
        if(to < x)
            setX(x -= speed);
        
        System.out.println("Bewegung nach x " + x);
        return false;
    }
    
    boolean checkYAndChange(int to, int speed){
        int y = getY();    
    
        if(to == y)
            return true;
        if(to > y)
            setY(y += speed);
        if(to < y)
            setY(y -= speed);

        System.out.println("Bewegung nach y " + y);
        return false;        
    }               
}

class BowMan extends Unit implements Moveable{
    
    @Override
    public void move(int x, int y) {
        System.out.println("BowMan: ");
        while(true){
            if(checkXAndChange(x, 1) & checkYAndChange(y, 1)){
                System.out.println("Ziel erreicht;");
                break;
            }
        }                        
    }   
}


class HorseMan extends Unit implements Moveable{
    
    @Override
    public void move(int x, int y) {
        System.out.println("HorseMan: ");
        while(true){
            if(checkXAndChange(x, 5) & checkYAndChange(y, 5)){
                System.out.println("Ziel erreicht;");
                break;
            }
        }                        
    }
}
