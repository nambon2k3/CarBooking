package model;

import java.util.Date;

public class Ticket {
    private int id;
    private String username;
    private int busId;
    private int seatNumber;
    private Date bookedDate; // Add the bookedDate field
    private int numberSeat;

    public Ticket() {
        // Default constructor
    }

    public Ticket(int id, String username, int busId, int seatNumber, Date bookedDate) {
        this.id = id;
        this.username = username;
        this.busId = busId;
        this.seatNumber = seatNumber;
        this.bookedDate = bookedDate;
    }

    public Ticket(int id, String username, int busId, int seatNumber, Date bookedDate, int numberSeat) {
        this.id = id;
        this.username = username;
        this.busId = busId;
        this.seatNumber = seatNumber;
        this.bookedDate = bookedDate;
        this.numberSeat = numberSeat;
    }
    
    

    // Getters and setters for the new field
    public Date getBookedDate() {
        return bookedDate;
    }

    public int getNumberSeat() {
        return numberSeat;
    }

    public void setNumberSeat(int numberSeat) {
        this.numberSeat = numberSeat;
    }
    
    

    public void setBookedDate(Date bookedDate) {
        this.bookedDate = bookedDate;
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
