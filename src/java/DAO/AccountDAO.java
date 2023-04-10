/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Models.Account_HE161914;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenam
 */
public class AccountDAO extends DBContext {

    public List<Account_HE161914> getAllAcc() {
        List<Account_HE161914> list = new ArrayList<>();
        String sql = "select * from Account_HE161914";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Account_HE161914 a = new Account_HE161914();
                a.setId(rs.getInt("id"));
                a.setUsername(rs.getString("username"));
                a.setEmail(rs.getString("email"));
                a.setPass(rs.getString("pass"));
                a.setRole(rs.getInt("role"));
                a.setPhone(rs.getInt("phone"));
                a.setAddress(rs.getString("address"));
                a.setAvatar(rs.getString("avatar"));
                list.add(a);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public Account_HE161914 getAccount_HE161914byId(String id) {
        String sql = "SELECT *\n"
                + "  FROM [Account_HE161914]\n"
                + "  where id = ? ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Account_HE161914 a = new Account_HE161914();
                a.setId(rs.getInt("id"));
                a.setUsername(rs.getString("username"));
                a.setEmail(rs.getString("email"));
                a.setPass(rs.getString("pass"));
                a.setRole(rs.getInt("role"));
                a.setAddress(rs.getString("address"));
                a.setPhone(rs.getInt("phone"));
                a.setAvatar(rs.getString("avatar"));

                return a;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public void updateinfo(String username, String pass, String phone, String address, String avatar, String id) {
        String sql = "update [PRJ301_SE1650].[dbo].[Account_HE161914]\n"
                + "set\n"
                + "       [username] = ?\n"
                + "      ,[pass] = ?\n"
                + "      ,[phone] = ?\n"
                + "      ,[address] = ?\n"
                + "      ,[avatar] = ?\n"
                + "  where [id] = ? ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);

            st.setString(1, username);
            st.setString(2, pass);
            st.setString(3, phone);
            st.setString(4, address);
            st.setString(5, avatar);
            st.setString(6, id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void delete(String id) {
        String sql = "DELETE FROM [dbo].[Account_HE161914]\n"
                + "      WHERE id=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
        public void updaterole(int role, int id) {
        String sql = "update [PRJ301_SE1650].[dbo].[Account_HE161914]\n"
                + "set\n"

                + "      [role] = ?\n"
                + "  where [id] = ? ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);

            st.setInt(1, role);
            st.setInt(2, id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        AccountDAO a = new AccountDAO();
//        a.updateinfo("test3","pass3","0983682547","hanoi","avatar","21"); 
//        List<Account_HE161914> list = a.getAllAcc();
//        for (Account_HE161914 o : list) {
//            System.out.println(o);
//        }
        a.updaterole(0, 3);
    }
}
