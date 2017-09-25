/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thogakade.model;

import java.sql.Date;

/**
 *
 * @author linux
 */
public class Order {

    private String Or_id;
    private String Cus_id;
    private String date;
    
    public Order(){}

    public Order(String Or_id, String Cus_id, String date) {
        this.Or_id = Or_id;
        this.Cus_id = Cus_id;
        this.date = date;
    }

    public String getOr_id() {
        return Or_id;
    }

    public void setOr_id(String Or_id) {
        this.Or_id = Or_id;
    }

    public String getCus_id() {
        return Cus_id;
    }

    public void setCus_id(String Cus_id) {
        this.Cus_id = Cus_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
