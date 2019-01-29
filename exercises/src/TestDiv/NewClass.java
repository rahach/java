/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDiv;

/**
 *
 * @author 2923201
 */
class SwJava {
public static void main(String args[]) {
String[] shapes = {"Circle", "Square", "Triangle"};
switch (shapes) {
case "Square": System.out.println("Circle"); break;
case "Triangle": System.out.println("Square"); break;
case "Circle": System.out.println("Triangle"); break;
}
}
}
