package com.eseed.util;

import org.springframework.stereotype.Component;

import com.eseed.entity.SessionData;

import javax.servlet.http.HttpSession;
import java.time.Year;

@Component
public class ECropUtility {
    private static SessionData sessionData = null;
    
    public static Integer getActiveYear(){
        return Year.now().getValue();
    }
    
    public static String getSeason(){
        return null;
    }

    public static SessionData sessionData(HttpSession session){

        if(sessionData == null) {
            sessionData = new SessionData();
            sessionData.setWbedname(String.valueOf(session.getAttribute("wbedname")));
            sessionData.setWbemname(String.valueOf(session.getAttribute("wbemname")));
            sessionData.setDcode(String.valueOf(session.getAttribute("dcode")));
            sessionData.setMcode(String.valueOf(session.getAttribute("mcode")));
            sessionData.setWbdcode((Integer)session.getAttribute("wbdcode"));
            sessionData.setWbmcode(String.valueOf(session.getAttribute("wbmcode")));
            sessionData.setWbevname(String.valueOf(session.getAttribute("wbevname")));
            sessionData.setWbvcode(String.valueOf(session.getAttribute("wbvcode")));
            sessionData.setRole(String.valueOf(session.getAttribute("role")));
            sessionData.setName(String.valueOf(session.getAttribute("name")));
            sessionData.setUserid(String.valueOf(session.getAttribute("userid")));
            sessionData.setTypename(String.valueOf(session.getAttribute("typename")));
            sessionData.setUserType(String.valueOf(session.getAttribute("userType")));
            sessionData.setVsCode(String.valueOf(session.getAttribute("vscode")));
            sessionData.setSeason((String) session.getAttribute("season"));
            
            sessionData.setCurrentSeason(String.valueOf(session.getAttribute("CURRENT_SEASON")));
            sessionData.setCropYear((Integer)session.getAttribute("CROP_YEAR"));
        }

        return sessionData;
    }
    public static void setSessionData() {
        ECropUtility.sessionData = null;
    }

    public static String getDcode(Integer dcode){
        return (dcode !=null && dcode<10) ? "0"+dcode : String.valueOf(dcode);
    }

}
