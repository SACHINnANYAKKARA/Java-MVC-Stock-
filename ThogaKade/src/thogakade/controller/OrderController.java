/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thogakade.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import thogakade.db.DBConnection;
import thogakade.model.Order;

/**
 *
 * @author linux
 */
public class OrderController {

    public static int addOrder(Order order) throws ClassNotFoundException, SQLException {

        int res = 0;
        String sql = "insert into Orders values(?,?,?)";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, order.getOr_id());
        stm.setObject(2, order.getDate());
        stm.setObject(3, order.getCus_id());

        res = stm.executeUpdate();

        return res;
    }

    public static String getLastOrder() throws ClassNotFoundException, SQLException {

        String lastId = null;
        String sql="select * from Orders";
        Connection con=DBConnection.getDBConnection().getConnection();
        Statement stm=con.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        
        while(rst.next()){
            
            if(rst.last()){
            lastId=rst.getString(1);   
            
            }
            
             
        }
        
        return lastId;
    }

}
