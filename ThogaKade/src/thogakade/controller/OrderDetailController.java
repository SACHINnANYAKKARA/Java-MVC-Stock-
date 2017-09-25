/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thogakade.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import thogakade.db.DBConnection;
import thogakade.model.OrderDetail;

/**
 *
 * @author linux
 */
public class OrderDetailController {

    public static int addOrderDetail(OrderDetail orderDetail) throws ClassNotFoundException, SQLException {
        int res = 0;
        String sql = "insert into OrderDetail values(?,?,?,?)";
        Connection con = DBConnection.getDBConnection().getConnection();

        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, orderDetail.getOrderId());
        stm.setObject(2, orderDetail.getItemCode());
        stm.setObject(3, orderDetail.getQty());
        stm.setObject(4, orderDetail.getUnitPrice());

        res = stm.executeUpdate();
        return res;
    }

}
