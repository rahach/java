/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author 2923201
 */
public class App {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPAStartDb");

        EntityManager em = factory.createEntityManager();
        
        em.getTransaction().begin();

//        Location loc = new Location();
        Location loc = em.find(Location.class, 151L);    
        
//        Shop s = new Shop();
//        s.setName("Bobs Cafe");
//        s.setLocation(loc);        
//        em.persist(s);
//        
//        Shop s1 = new Shop();
//        s1.setName("Bobs Cafe 2");
//        s1.setLocation(loc);        
//        em.persist(s1);        
        
//        em.flush();
//        loc.setName("Hamburg");
//        loc.setDescription("Ist schon ganz gut");
//        em.persist(loc);      



        System.out.println(loc.getName() + " : " + loc.getDescription());

        Shop s = loc.getShop();
        System.out.println(s.getName());

        s.getCustomers().forEach((c)->System.out.println(c.getFirstName() + ", " + c.getLastName()));
        
//        Customer c1 = new Customer();
//        c1.setFirstName("Peter");
//        c1.setLastName("Lottermann");
//        c1.setBirthDay(new Date());
//        c1.setShop(s);
//        em.persist(c1);
//        
//        Customer c2 = new Customer();
//        c2.setFirstName("Harry");
//        c2.setLastName("Hirsch");      
//        c2.setBirthDay(new Date());
//        c2.setShop(s);
//        em.persist(c2);
//        
//        s.addCustomer(c1);
//        s.addCustomer(c2);
//
//       em.flush();        
        
        em.getTransaction().commit();
    
        System.out.println("ENDE ...");
    }
    
}
