/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Models.Guest;
import Utils.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tang Thanh Vui - CE180901
 */
public class ListGuestsDAO extends DBContext {

    public List<Guest> getAllGuests() {
        List<Guest> listGuests = new ArrayList<>();
        String sql = "select * from Guest";

        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Guest guest = new Guest(rs.getInt("GuestID"), rs.getInt("RoleID"),
                        rs.getString("FullName"), rs.getDate("DOB"), rs.getString("Gender"),
                        rs.getString("PhoneNo"), rs.getString("Email"), rs.getString("Password"),
                        rs.getString("Address"), rs.getString("City"), rs.getString("Country"));
                listGuests.add(guest);
            }

            return listGuests;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    
    public static void main(String[] args) {
        ListGuestsDAO lgd = new ListGuestsDAO();
        List<Guest> list = lgd.getAllGuests();
        System.out.println(list.get(0).getAddress());
    }
}
