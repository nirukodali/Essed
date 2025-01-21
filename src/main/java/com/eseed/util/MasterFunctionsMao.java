package com.eseed.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Component;
@Component
public class MasterFunctionsMao {
	
	public static String getCropImageMao(
			String wbdcode, String bookingid, 
			String cropyear, String tseason, 
			String cr_crop,String Year)
            throws SQLException {
		
		System.out.println("wbdcode=>"+wbdcode);
		System.out.println("bookingid=>"+bookingid);
		System.out.println("cropyear=>"+cropyear);
		System.out.println("tseason=>"+tseason);
		System.out.println("cr_crop=>"+cr_crop);
		System.out.println("Year=>"+Year);
		
		String[] season = cropyear.split("@");
		System.out.println("season========="+season);
		String cseason = season[0];
		System.out.println("cseason========="+cseason);
		Integer Yearr = Integer.parseInt(season[1]);
		System.out.println("Year========="+Year);
      

        SqlDBUtil db = new SqlDBUtil();
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        String imgcode = "", tbname1 = "";
        try {
            con = db.getConnection();
           
            
            if(wbdcode.length()==1){
                wbdcode="0"+wbdcode;
            }
            tbname1 = "cr_images_" + tseason + wbdcode + Year;
            if(String.valueOf(Yearr).equals(Year)){
               tbname1 = "ecrop"+Year+".cr_images_" + tseason + wbdcode + Yearr;  
            }
            System.out.println("tbname1=========>"+tbname1);
           
            String qry = "select photo from " + tbname1 + " where bookingid=? and cr_crop=?";

            pst = con.prepareStatement(qry);
            pst.setLong(1, Long.parseLong(bookingid));
            pst.setLong(2, Integer.parseInt(cr_crop));
            rs = pst.executeQuery();
 System.out.println("pst========>"+pst); 
            if (rs.next()) {
                imgcode = rs.getString("photo");

            }
        
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (pst != null) {
                pst.close();
            }
            if (con != null) {
                con.close();
            }
        }

        return imgcode;
    }       
     

}
