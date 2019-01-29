/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Important.Interfaces;

/**
 *
 * @author raik
 */
public class Interfaces6 {



    
}

interface Roamable{}
class Phone {}
class Tablet extends Phone implements Roamable {
    Roamable r = (Roamable)new Phone();
}