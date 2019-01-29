package de.cbw.scoutsfx.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author T.Lubowiecki
 */
public class Scout extends AbstractEntity implements Serializable {
    
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private List<Order> orders = new ArrayList<>();

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

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Scout) {
            Scout obj2 = (Scout) obj;
            return (firstName+lastName).equals(obj2.getFirstName()+obj2.getLastName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (firstName + lastName).hashCode();
    }
    
    
}
