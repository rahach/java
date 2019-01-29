/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InitTest;

/**
 *
 * @author raik
 */
public class A {
    static String result = "";
    { result += "non static "; }
    static
    { result += "static "; }

}
