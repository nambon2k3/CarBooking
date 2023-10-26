package model;

public class Bus {
    private int id;
    private int seats;
    private String departureTime;
    private String source;
    private String destination;
    private String arrivalTime;

    public Bus() {
        // Default constructor
    }
    
    public Bus(int id, int seats, String departureTime, String source, String destination, String arrivalTime) {
        this.id = id;
        this.seats = seats;
        this.departureTime = departureTime;
        this.source = source;
        this.destination = destination;
        this.arrivalTime = arrivalTime;
    }

    public Bus(int seats, String departureTime, String source, String destination, String arrivalTime) {
        this.seats = seats;
        this.departureTime = departureTime;
        this.source = source;
        this.destination = destination;
        this.arrivalTime = arrivalTime;
    }

    // Getters and setters for all fields

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return "Bus{" + "id=" + id + ", seats=" + seats + ", departureTime=" + departureTime + ", source=" + source + ", destination=" + destination + ", arrivalTime=" + arrivalTime + '}';
    }
    
    
}

