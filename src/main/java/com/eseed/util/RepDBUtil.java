package com.eseed.util;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Component;
@Component
public class RepDBUtil implements Serializable {

      public Connection getConnection() throws Exception {
        Connection con = null;
        Class.forName("org.postgresql.Driver");
        //  con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/eseednew", "postgres", "SWATHI");
//    con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/eseeddev", "postgres", "SWATHI");
//        con = DriverManager.getConnection("jdbc:postgresql://10.72.4.33:5433/ekarshak", "postgres", "admin");
        //con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/ecrop_demo", "postgres", "root");
        //  con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/ecroplocal", "postgres", "root");

        //con = DriverManager.getConnection("jdbc:postgresql://172.19.150.49:5432/ekarshak", "postgres", "eKarshak@2012");
        //NIC DC Connection String
// con = DriverManager.getConnection("jdbc:postgresql://10.252.114.254:5432/ecrop", "postgres", "ecrop@pg$ql");
   //  con = DriverManager.getConnection("jdbc:postgresql://10.252.114.254:5432/ecrop", "postgres", "ecrop@pg$ql");
//        con = DriverManager.getConnection("jdbc:postgresql://10.160.6.217:5432/ecrop", "ecrop", "ecrop#6.216");
               //con = DriverManager.getConnection("jdbc:postgresql://10.160.6.216:5432/ecrop", "ecrop_read", "ecrop@1234");
               con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ecrop_local", "postgres", "2807");


        //con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/ecroplocal", "postgres", "root");

        //con = DriverManager.getConnection("jdbc:postgresql://192.168.148.149:5432/ekarshak", "postgres", "eKarshak@2012");
        return con;

    }

    public void closeConnection(Connection con) {

        if (con != null) {
            try {
                con.close();
            } catch (Exception e) {
                con = null;
            }

        }

    }

    public void closeStatements(PreparedStatement pst) {

        if (pst != null) {
            try {
                pst.close();
            } catch (Exception e) {
                pst = null;
            }

        }

    }

    public void closeResultSet(ResultSet rs) {

        if (rs != null) {
            try {
                rs.close();
            } catch (Exception e) {
                rs = null;
            }

        }

    }
}

