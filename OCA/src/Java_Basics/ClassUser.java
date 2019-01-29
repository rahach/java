/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Basics;

/**
 *
 * @author raik
 */
class User{
    Bandwidth bw = new Bandwidth();
    
    public int consume(int bytesUsed){
        bw.addUsage(bytesUsed);
        return bw.getTotalUsage();
    }
    public static void main(String[] args) {
        User u = new User();
        
        System.out.println(u.consume(-100));
    }
 
}

class Bandwidth{
    private int totalUsage;
    private double totalBill;
    private double costPerByte;
    
   
    protected void addUsage(int bytesUsed){
        if(bytesUsed>0){
           totalUsage += bytesUsed;
           totalBill = totalBill + bytesUsed*costPerByte;
        }   
    }

    public int getTotalUsage(){
        return totalUsage;
    }
}
