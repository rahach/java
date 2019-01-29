/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung.printer;

/**
 *
 * @author 2923201
 */
public class InsuranceContract implements Printable {
    
    private String data;
    
    public String printData(){
        return "InsuranceContract Data\n" 
                + this.getData();
    }

    public String getData() {
        return data;
    }

    public void setData(String inputData) {
        
        //StringBuilder sb = new StringBuilder(data);       
        //sb.append(inputData).append("\n");        
        //data = sb.toString();
        data = inputData;        
    }
    
    
    
    
    
}
