/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Important.Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author raik
 */

public class Climber {
    public static void main(String[] args) {
        boolean b = checkList(new ArrayList(), al -> al.isEmpty());
        System.out.println(b);
    }  


    public static boolean checkList(List list, Predicate<List> p){
        return p.test(list);
    }
}