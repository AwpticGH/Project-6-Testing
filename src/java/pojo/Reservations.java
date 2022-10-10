package pojo;
// Generated Oct 10, 2022 3:35:36 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Reservations generated by hbm2java
 */
public class Reservations  implements java.io.Serializable {


     private Integer id;
     private Flights flights;
     private Users users;
     private boolean paid;
     private boolean active;
     private Set reservationsInfos = new HashSet(0);

    public Reservations() {
    }

	
    public Reservations(Flights flights, Users users, boolean paid, boolean active) {
        this.flights = flights;
        this.users = users;
        this.paid = paid;
        this.active = active;
    }
    public Reservations(Flights flights, Users users, boolean paid, boolean active, Set reservationsInfos) {
       this.flights = flights;
       this.users = users;
       this.paid = paid;
       this.active = active;
       this.reservationsInfos = reservationsInfos;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Flights getFlights() {
        return this.flights;
    }
    
    public void setFlights(Flights flights) {
        this.flights = flights;
    }
    public Users getUsers() {
        return this.users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
    }
    public boolean isPaid() {
        return this.paid;
    }
    
    public void setPaid(boolean paid) {
        this.paid = paid;
    }
    public boolean isActive() {
        return this.active;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }
    public Set getReservationsInfos() {
        return this.reservationsInfos;
    }
    
    public void setReservationsInfos(Set reservationsInfos) {
        this.reservationsInfos = reservationsInfos;
    }




}


