package pojo;
// Generated Oct 10, 2022 3:35:36 PM by Hibernate Tools 4.3.1



/**
 * FirstClassSeats generated by hbm2java
 */
public class FirstClassSeats  implements java.io.Serializable {


     private Integer id;
     private Airplanes airplanes;
     private int row;
     private int number;

    public FirstClassSeats() {
    }

    public FirstClassSeats(Airplanes airplanes, int row, int number) {
       this.airplanes = airplanes;
       this.row = row;
       this.number = number;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Airplanes getAirplanes() {
        return this.airplanes;
    }
    
    public void setAirplanes(Airplanes airplanes) {
        this.airplanes = airplanes;
    }
    public int getRow() {
        return this.row;
    }
    
    public void setRow(int row) {
        this.row = row;
    }
    public int getNumber() {
        return this.number;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }




}


