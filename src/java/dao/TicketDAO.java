package dao;

import dal.DBContext;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Ticket;

public class TicketDAO extends DBContext {

    public TicketDAO() {
        super();
    }

    public void createTicket(Ticket ticket) {
        String query = "INSERT INTO ticket (username, busId, seatNumber) " +
                       "VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, ticket.getUsername());
            preparedStatement.setInt(2, ticket.getBusId());
            preparedStatement.setInt(3, ticket.getSeatNumber());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public List<Ticket> getAllTickets() {
        List<Ticket> tickets = new ArrayList<>();
        String query = "SELECT * FROM ticket";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                int busId = resultSet.getInt("busId");
                int seatNumber = resultSet.getInt("seatNumber");

                Ticket ticket = new Ticket();
                ticket.setId(id);
                ticket.setUsername(username);
                ticket.setBusId(busId);
                ticket.setSeatNumber(seatNumber);

                tickets.add(ticket);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return tickets;
    }

    public void updateTicket(Ticket ticket) {
        String query = "UPDATE ticket SET username = ?, busId = ?, seatNumber = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, ticket.getUsername());
            preparedStatement.setInt(2, ticket.getBusId());
            preparedStatement.setInt(3, ticket.getSeatNumber());
            preparedStatement.setInt(4, ticket.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void deleteTicket(int ticketId) {
        String query = "DELETE FROM ticket WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, ticketId);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

