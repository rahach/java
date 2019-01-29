/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scouts.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import scouts.App;

/**
 *
 * @author 2923201
 */
public class Scout extends AbstractEntity implements Serializable{
    
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    
    private List<Order> orders = new ArrayList<>();
    
// create setter + getter alt+einfg
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public List<Order> getOrders(){
        return orders;
    }

    public void addOrder(Order order){
        orders.add(order);
    }
    
    public String toString(){        
        StringBuilder sb = new StringBuilder();
        sb.append("Vorname: ").append(firstName).append("\n");
        sb.append("Nachname: ").append(lastName).append("\n");
        sb.append("Geburtsdatum: ")
                .append(App.DATE_FORMAT.format(birthDate))
                .append("\n");        
        return sb.toString();
    }
    
    public boolean equals(Object obj){
        if(obj instanceof Scout){
            Scout obj2 = (Scout) obj;
            return (firstName+lastName).equals(obj2.getFirstName()+obj2.getLastName());
        }
        return false;
    }
        
}