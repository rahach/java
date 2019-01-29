package scouts.jpascoutmanagement;

import java.time.LocalDate;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPAScoutManagement_PU");
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();

        Scout scout = new Scout();
        
        scout.setFirstName("Peter");
        scout.setLastName("Parker");
        scout.setBirthDate(new Date());
        em.persist(scout);

        Camp camp = new Camp();
        camp.setName("Schöner Blick");
        camp.setLocation("Linsengericht");
        camp.setDescription("Hier ist es wirklich schön!");
        
//        Scout scout = em.find(Scout.class, 1L);
//        System.out.println(scout.getFirstName());
//        System.out.println(scout.getLastName());
//        System.out.println(scout.getBirthDate());
        

//        Scout scout = em.find(Scout.class, 1L);
//        Camp camp = em.find(Camp.class, 1L);
//        
        Booking booking = new Booking();
        booking.setStart(new Date());
        booking.setEnd(new Date());
        
        camp.addBooking(booking);
        scout.addBooking(booking);
        
        
        
        booking.setScout(scout);        
        booking.setCamp(camp);
        em.persist(scout);          

        em.flush();
        
        
        em.getTransaction().commit();        
        System.out.println("action completed");
    }
}
