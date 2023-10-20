package model;

public class Ticket {
    private int id;
    private String username;
    private int busId;
    private int seatNumber;

    public Ticket() {
        // Default constructor
    }

    public Ticket(String username, int busId, int seatNumber) {
        this.username = username;
        this.busId = busId;
        this.seatNumber = seatNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}
