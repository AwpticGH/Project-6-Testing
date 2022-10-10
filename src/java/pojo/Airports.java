package pojo;
// Generated Oct 10, 2022 3:35:36 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Airports generated by hbm2java
 */
public class Airports  implements java.io.Serializable {


     private int id;
     private String code;
     private String name;
     private String province;
     private String city;
     private Set routesesForDestinationId = new HashSet(0);
     private Set routesesForDepartureId = new HashSet(0);

    public Airports() {
    }

	
    public Airports(int id, String code, String name, String province, String city) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.province = province;
        this.city = city;
    }
    public Airports(int id, String code, String name, String province, String city, Set routesesForDestinationId, Set routesesForDepartureId) {
       this.id = id;
       this.code = code;
       this.name = name;
       this.province = province;
       this.city = city;
       this.routesesForDestinationId = routesesForDestinationId;
       this.routesesForDepartureId = routesesForDepartureId;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getProvince() {
        return this.province;
    }
    
    public void setProvince(String province) {
        this.province = province;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public Set getRoutesesForDestinationId() {
        return this.routesesForDestinationId;
    }
    
    public void setRoutesesForDestinationId(Set routesesForDestinationId) {
        this.routesesForDestinationId = routesesForDestinationId;
    }
    public Set getRoutesesForDepartureId() {
        return this.routesesForDepartureId;
    }
    
    public void setRoutesesForDepartureId(Set routesesForDepartureId) {
        this.routesesForDepartureId = routesesForDepartureId;
    }




}


