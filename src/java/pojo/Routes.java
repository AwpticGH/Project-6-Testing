package pojo;
// Generated Oct 10, 2022 3:35:36 PM by Hibernate Tools 4.3.1


import dao.AirportsDao;
import dao.RoutesDao;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.faces.bean.ManagedBean;

/**
 * Routes generated by hbm2java
 */
@ManagedBean
public class Routes  implements java.io.Serializable {


     private Integer id;
     private int from;
     private int to;
     private Airports airportsByDestinationId;
     private Airports airportsByDepartureId;
     private int timeOfFlight;
     private Set flightses = new HashSet(0);
     
     RoutesDao dao = new RoutesDao();

    public Routes() {
    }

	
    public Routes(int id, Airports airportsByDestinationId, Airports airportsByDepartureId, int timeOfFlight) {
        this.id = id;
        this.airportsByDestinationId = airportsByDestinationId;
        this.airportsByDepartureId = airportsByDepartureId;
        this.timeOfFlight = timeOfFlight;
    }
    public Routes(int id, Airports airportsByDestinationId, Airports airportsByDepartureId, int timeOfFlight, Set flightses) {
        this.id = id;
        this.airportsByDestinationId = airportsByDestinationId;
        this.airportsByDepartureId = airportsByDepartureId;
        this.timeOfFlight = timeOfFlight;
        this.flightses = flightses;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Airports getAirportsByDestinationId() {
        return this.airportsByDestinationId;
    }
    
    public void setAirportsByDestinationId(Airports airportsByDestinationId) {
        this.airportsByDestinationId = airportsByDestinationId;
    }
    public Airports getAirportsByDepartureId() {
        return this.airportsByDepartureId;
    }
    
    public void setAirportsByDepartureId(Airports airportsByDepartureId) {
        this.airportsByDepartureId = airportsByDepartureId;
    }
    public int getTimeOfFlight() {
        return this.timeOfFlight;
    }
    
    public void setTimeOfFlight(int timeOfFlight) {
        this.timeOfFlight = timeOfFlight;
    }
    public Set getFlightses() {
        return this.flightses;
    }
    
    public void setFlightses(Set flightses) {
        this.flightses = flightses;
    }

    public List<Routes> getAll() {
        return dao.getAll();
    }
    
    public String getById() {
        Routes route = dao.getById(id);
        this.id = route.getId();
        this.from = route.getAirportsByDepartureId().getId();
        this.to = route.getAirportsByDestinationId().getId();
        this.timeOfFlight = route.getTimeOfFlight();
        
        return "./edit/edit_routes.xhtml";
    }

    public String create() {
        AirportsDao apDao = new AirportsDao();
        airportsByDepartureId = apDao.getById(from);
        airportsByDestinationId = apDao.getById(to);
        
        boolean isCreated = dao.create(this);
        
        return isCreated ? "../routes.xhtml" : "./create/create_routes.xhtml";
    }

    public String update() {
        AirportsDao apDao = new AirportsDao();
        airportsByDepartureId = apDao.getById(from);
        airportsByDestinationId = apDao.getById(to);
        
        boolean isUpdated = dao.update(this);
        
        return isUpdated ? "../routes.xhtml" : "./edit/edit_routes.xhtml";
    }
    
    public String delete() {
        boolean isDeleted = dao.delete(this);
        
        return isDeleted ? "../routes.xhtml" : "./edit/edit_routes.xhtml";
    }
}


