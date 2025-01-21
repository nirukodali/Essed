package com.eseed.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

/**
*
* @author aruna
*/

@Component
public class MasterFunctions {

  public static String isBlank(String str) {
      str = str == null ? "" : str;
      str = str.replace('<', ' ');
      str = str.replace('>', ' ');
      str = str.replace('\'', ' ');
      str = str.replace('\"', ' ');
      str = str.replace('&', ' ');
      str = str.replace('%', ' ');


      //System.out.println("----"+str);
      return str;

  }

  public static String masterFunction(String value, String requsttype) {

      String response = null;
      String query = null;
      Connection con = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      try {

          RepDBUtil db = new RepDBUtil();
          con = db.getConnection();
          switch (requsttype) {
              case "dcode":
                  query = "SELECT dname FROM district_2011_cs  WHERE dcode=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setInt(1, Integer.parseInt(value));
                  break;
              
              case "mcode":
                  query = "SELECT mname FROM mandal_2011_cs  WHERE mcode=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setInt(1, Integer.parseInt(value));
                  break;
              case "vcode":
                  query = "SELECT vname FROM village_2011_cs  WHERE vcode=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setInt(1, Integer.parseInt(value));
                  break;
              case "productcode":
                  query = "SELECT name FROM productmast  WHERE productcode=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;
              case "subproductcode":
                  query = "SELECT name FROM subproductmast  WHERE subproductcode=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;
              case "varietycode":
                  query = "SELECT name FROM varietymast WHERE  varietycode::text=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;
              case "varietygroupcode":
                  query = "SELECT groupcode FROM varietymast WHERE  varietycode::text=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;
              case "season":
                  query = "SELECT seasonname FROM season WHERE season::text=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;
              case "usertype":
                  query = "SELECT  name FROM usertypes WHERE usertype::text=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;
              case "wbmandal":
                  query = "SELECT  wbmname FROM wbvillage_mst WHERE wbvcode::text=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;
              case "wbmandal1":
                  query = "SELECT  wbmname FROM wbvillage_mst WHERE wbmcode::text=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;
              case "wbdist":
                  query = "SELECT  wbdname FROM wbvillage_mst WHERE wbvcode::text=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;
              case "wbvillagemandal":
                  query = "SELECT  concat(wbvname,',',wbmname) FROM wbvillage_mst WHERE wbvcode::text=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;
              case "wbdist1":
                  query = "SELECT  wbdname FROM wbvillage_mst WHERE wbdcode::text=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;
              case "wbvillage":
                  query = "SELECT  wbvname FROM wbvillage_mst WHERE wbvcode::text=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;
              case "authentication":
                  query = "select description from authmast where authenticated_code::text=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;
              case "units":
                  query = "SELECT units FROM varietymast WHERE  varietycode::text=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;
              case "farmertype":
                  query = "select farmer_desc from farmertype_mst where farmertype::text=?;";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;
              case "quantityperbag":
                  query = "SELECT quantityperbag FROM product_price WHERE  varietycode::text=? and dcode::text=? and  cropyear::text=? and season=?";
                  String arr[] = value.split("@");
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, arr[0]);
                  pstmt.setString(2, arr[1]);
                  pstmt.setString(3, arr[2]);
                  pstmt.setString(4, arr[3]);
                  break;
              case "homemenu":
                  query = "SELECT homemenu FROM usertypes WHERE  type_user::text=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;
              case "wbdcode":
                  query = "select wbdcode from district_2011_cs where dcode::text=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;
             case "dcodefromwbdcode":
                  query = "select dcode from district_2011_cs where wbdcode=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setInt(1, (Integer.parseInt(value)));
                  break;
              case "countmandal":
                  query = "SELECT count(*) as countmandal FROM mandal_2011_cs  WHERE dcode::text=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;
              case "countvillage":
                  query = "  SELECT count(*)  as totalvillages  FROM village_2011_cs  WHERE mcode::text=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;

              case "errcode":
                  query = "SELECT reasons FROM uiderrors  WHERE errcode =  ?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;
              case "factor":
                  query = "SELECT factor FROM units WHERE  units::text=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;

              case "mdcode":
                  query = "SELECT dcode FROM mandal_2011_cs  WHERE mcode::text=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;
              case "wbmcode":
                  query = "SELECT wbmcode FROM mandal_2011_cs  WHERE mcode::text=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;    
              case "ttype":
                  query = "SELECT transactionname FROM transactionmast  WHERE type::text=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;

              case "agency":
                  query = "SELECT agencyname FROM agency_mst  WHERE agencycode::text=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;
              case "referenceid":
                  query = "SELECT referenceid FROM aadhaarreference  WHERE aadhaarno=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, value);
                  break;
              case "subproduct":
                  query = "SELECT name FROM subproductmast  WHERE subproductcode=substr(?,1,5)";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;
              case "croptype":
                  query = "SELECT typename FROM croptypes  WHERE typecode=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;
              case "mvkname":
                  query = "SELECT mvkname FROM mvk_mst  WHERE mvkcode::text=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, value);
                  break;
              case "fathername":
                  query = "SELECT fathername FROM farmers  WHERE aadharno=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, value);
                  break;
              case "transactionType":
                  query = "select transactionname from transactionmast  WHERE type=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setInt(1, Integer.parseInt(value));
                  break;
              case "schemeCode":
                  query = "select scheme_name from scheme_mst  WHERE scheme_code=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setInt(1, Integer.parseInt(value));
                  break;
               case "cropscheme":
                  query = "select cropschdesc from cropseed_scheme  WHERE cropschtype=?::text";
                  pstmt = con.prepareStatement(query);
                  pstmt.setInt(1, Integer.parseInt(value));
                  break;
              case "seedclasscode":
                  query = "select classname from seed_class  WHERE classcode=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setInt(1, Integer.parseInt(value));
                  break;
              case "repgrpcode":
                  query = "select groupname from seedgroup_mst  WHERE repgrpcode=? and active='A'";
                  pstmt = con.prepareStatement(query);
                  pstmt.setInt(1, Integer.parseInt(value));
                  break;
             case "role":
                  query = "select type_user from user_registration  where userid::text=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;
              case "userid":
                  query = "select type_user from user_registration  where userid::text=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;    
             case "cname":
                  query = "select cname from cluster_master  where cid::text=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;
             case "lgddcode":
                  query = "select dcode from wbvillage_mst  where lgddcode::text=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;
             case "lgdmcode":
                  query = "select mcode from wbvillage_mst  where lgdmcode::text=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;
             case "lgdvcode":
                  query = "select wbvcode from wbvillage_mst_lgd  where lgdvcode::text=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;
                  
                 
             case "lwbdcode":
                  query = "select wbdcode from wbvillage_mst  where dcode=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setInt(1, (Integer.parseInt(value)));
                  break;
             case "lwbmcode":
                  query = "select distinct wbmcode from wbvillage_mst  where mcode=? and wbdcode!=88";
                  pstmt = con.prepareStatement(query);
                  pstmt.setInt(1, (Integer.parseInt(value)));
                  break;
                  
             case "cropname":
                  query = "select cropname from cropnames where cropid=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setInt(1, (Integer.parseInt(value)));
                  break;
            case "cropgrp":
                  query = "select grpname from cropgroups  where cropgrpid=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setInt(1, (Integer.parseInt(value)));
                  break;  
            
               
            case "watersrc":
                  query = "select wsrcdesc from waterresources where  wsrcid=? and active='A'";
                  pstmt = con.prepareStatement(query);
                  pstmt.setInt(1, (Integer.parseInt(value)));
                  break;      
           case "wbdcodetodcode":
                  query = "select distinct dcode from wbvillage_mst  where wbdcode=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setInt(1, (Integer.parseInt(value)));
                  break;
             case "wbmcodetomcode":
                  query = "select distinct mcode from wbvillage_mst  where  wbdcode=? and wbmcode=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setInt(1, (Integer.parseInt(value.split("@")[0])));
                  pstmt.setInt(2, (Integer.parseInt(value.split("@")[1])));
                  break;
             case "wbdcodefromwbvcode":
                  query = "SELECT  wbdcode FROM wbvillage_mst WHERE wbvcode::text=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;  
              case "wbmcodefromwbvcode":
                  query = "SELECT  wbmcode FROM wbvillage_mst WHERE wbvcode::text=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, (value));
                  break;  
            
                  
              case "VSvillage":
                  query = "SELECT vname from vill_sec_det where   dcode=? and mcode=? and vcode=?";
                  
                  String dist=value.split("@")[0];                   
                  String mand=value.split("@")[1];
                  String vsvillcode=value.split("@")[2];
                  
                  pstmt.setInt(1, Integer.parseInt(dist));
                  pstmt.setInt(2, Integer.parseInt(mand));
                  pstmt.setInt(3, Integer.parseInt(vsvillcode));
                  pstmt = con.prepareStatement(query);

                  break;      
                  
              case "wbmnamefromdcode":
                  query = "SELECT  wbmname FROM wbvillage_mst WHERE dcode=? and wbmcode=?";
                  pstmt = con.prepareStatement(query);                    
                  pstmt.setInt(1, Integer.parseInt(value.split("@")[0]));
                  pstmt.setInt(2, Integer.parseInt( value.split("@")[1]));
                  break;  
              case "wbmnamefromwbdcode":
                  query = "SELECT  wbmname FROM wbvillage_mst WHERE wbdcode=? and wbmcode=?";
                  pstmt = con.prepareStatement(query);                    
                  pstmt.setInt(1, Integer.parseInt(value.split("@")[0]));
                  pstmt.setInt(2, Integer.parseInt( value.split("@")[1]));
                  break;     
                        
              case "VSName":
                  query = "SELECT vname from vill_sec_det where  vcode=?";    
                   pstmt = con.prepareStatement(query);
                  pstmt.setInt(1, Integer.parseInt(value));
                  break;      
             case "vscodeFromWbvcode":
                  query = "SELECT vscode from villsec_rev_v where  vcode=?";    
                   pstmt = con.prepareStatement(query);
                  pstmt.setInt(1, Integer.parseInt(value));
                  break;
            case "wbodyType":
                  query = "select tank_type_desc from fish_tank_types where tank_type_id=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setInt(1, Integer.parseInt(value));
                  break;

              case "wbodynamewithright":
                  query = "SELECT  concat(wbody_name,'-', fishing_right) FROM waterbody_master where wbodyid=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, value);
                  break;

              case "fcsname":
                  query = "select fcsname from fcs_master where fcscode=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, value);
                  break;

              case "flcname":
                  query = "select flc_name from flc_master where flc_code=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, value);
                  break;

              case "caste":
                  query = "select caste from caste_mst where castecode=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setString(1, value);
                  break;
		
             case "varietyName":
                  query = "SELECT varietyname FROM cr_variety_master WHERE  varietycode=?";
                  pstmt = con.prepareStatement(query);
                  pstmt.setInt(1, Integer.parseInt(value));
                  break;

             case "landCat":
                  query = "SELECT ownershipdesc FROM landownership_types where ownershiptype=?;";    
                   pstmt = con.prepareStatement(query);
                  pstmt.setString(1, value);
                  break;
          case "cropNo":
                  query = " select description from cropnumber where id=? ";
                  pstmt = con.prepareStatement(query);
                  pstmt.setInt(1, (Integer.parseInt(value)));
                  break; 
                  
            case "cropNat":
                  query = "select naturedesc from cropnature where id=? ";
                  pstmt = con.prepareStatement(query);
                  pstmt.setInt(1, (Integer.parseInt(value)));
                  break;  
					
				
              case "wholesrno":
                  query = "  Select count(*) from masters.vill_coords_p"+value.split("@")[0]+" where cr_vcode=? and cr_wsno=? ";
                  pstmt = con.prepareStatement(query);
                  pstmt.setInt(1, (Integer.parseInt(value.split("@")[1])));
                  pstmt.setInt(2, (Integer.parseInt(value.split("@")[2])));
                  break;
              case "lgdfromdcode":
                  query = "select lgddcode from district_2011_cs  where dcode=? ";
                  pstmt = con.prepareStatement(query);
                  pstmt.setInt(1, (Integer.parseInt(value)));
                  break;
                  
              case "reasoncode":
                  query = "select reason from authority_verify_reasons where active='A' and code=? ";
                  pstmt = con.prepareStatement(query);
                  pstmt.setInt(1, (Integer.parseInt(value)));
                  break;
				
                  default:
             
                  return "invalid request type";
                
          }


          rs = pstmt.executeQuery();
          if (rs.next()) {
              response = isBlank(rs.getString(1));
          }
      } catch (SQLException e) {

          return e.getMessage();
      } catch (Exception e) {

          return e.getMessage();
      } finally {

          try {
              if (rs != null) {
                  rs.close();
                  rs = null;
              }

              if (pstmt != null) {
                  pstmt.close();
                  pstmt = null;
              }

              if (con != null) {
                  con.close();
                  con = null;
              }
          } catch (SQLException e) {
          }

      }

      return response;
  }

   public static String getCasteCode(String caste) {
      String castecode ="";
      Connection con = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      SqlDBUtil test = new SqlDBUtil();
      try {
          con = test.getConnection();
          pstmt = con.prepareStatement("select castecode from caste_mst where caste::text=?");
          
          if(caste.trim().equalsIgnoreCase("BC") || caste.trim().equalsIgnoreCase("SC")  || caste.trim().equalsIgnoreCase("ST"))
          {            
          pstmt.setString(1, caste);
          
          }
         else if(caste.trim().equalsIgnoreCase("OC")){
            caste="General";  
            pstmt.setString(1, caste);  
          }
          else if(caste.trim().equalsIgnoreCase("Minority")){
            caste="Minorities";  
            pstmt.setString(1, caste);  
          }
          rs = pstmt.executeQuery();  
        
          if (rs.next()) {
              castecode = rs.getString(1);
             
          }          
      } catch (SQLException e) {
         
      } catch (Exception e) {
         
      } finally {
          try {
              if (rs != null) {
                  rs.close();
                  rs = null;
              }

              if (pstmt != null) {
                  pstmt.close();
                  pstmt = null;
              }

              if (con != null) {
                  con.close();
                  con = null;
              }
          } catch (SQLException e) {
          }
      }
      return castecode;
  }
  
  
  public static String district(int dcode) {
      String dname = null;
      Connection con = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      SqlDBUtil test = new SqlDBUtil();
      try {
          con = test.getConnection();
          pstmt = con.prepareStatement("SELECT dname FROM district_2011_cs  WHERE dcode=?");
          pstmt.setInt(1, dcode);
          rs = pstmt.executeQuery();
          if (rs.next()) {
              dname = rs.getString(1);
          }
      } catch (SQLException e) {
      } catch (Exception e) {
      } finally {
          try {
              if (rs != null) {
                  rs.close();
                  rs = null;
              }

              if (pstmt != null) {
                  pstmt.close();
                  pstmt = null;
              }

              if (con != null) {
                  con.close();
                  con = null;
              }
          } catch (SQLException e) {
          }
      }
      return dname;
  }

//  public static List<HashMap<String, String>> WebLandClient(String UID, String webLandDcode) {
//      Object soapResultAsObj;
//      List<HashMap<String, String>> memberMapList = null;
//      try {
//          String WSDL_TARGET_NAMESPACE = "http://tempuri.org/";
//          String SOAP_ACTION = null;
//          String SOAP_ADDRESS_statewise = "http://uatwebland.ap.gov.in/StateWiseSearchOnUID.asmx";
//          String OPERATION_NAME = "StateWiseSearchBasedonUID";
//          SOAP_ACTION = WSDL_TARGET_NAMESPACE + OPERATION_NAME;
//          SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE, OPERATION_NAME);
//          request.addProperty("UID", UID);
//          request.addProperty("Dcode", webLandDcode);
//          request.addProperty("usr_id", "WebLand");
//          request.addProperty("pwd", "WebLand@APNIC");
//          SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
//          envelope.dotNet = true;
//          envelope.setOutputSoapObject(request);
//          HttpTransportSE httpTransportSE = new HttpTransportSE(SOAP_ADDRESS_statewise);
//          httpTransportSE.debug = true;
//          //System.out.println("envelope : "+envelope);
//          httpTransportSE.call(SOAP_ACTION, envelope);
//          //System.out.println("Test2");
//          soapResultAsObj = envelope.getResponse();
//
//          String strXML = soapResultAsObj.toString();
//          // //========" + strXML);
//          DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//          DocumentBuilder db = dbf.newDocumentBuilder();
//          InputSource is = new InputSource();
//          is.setCharacterStream(new StringReader(strXML));
//          Document doc = db.parse(is);
//          NodeList cardNodeList = doc.getElementsByTagName("DocumentElement");
//
//          HashMap cardMap = new HashMap();
//          memberMapList = new ArrayList<HashMap<String, String>>();
//          if (cardNodeList.getLength() > 0) {
//              NodeList cardChildNodeList = cardNodeList.item(0).getChildNodes();
//              for (int xx = 0; xx < cardChildNodeList.getLength(); xx++) {
//                  cardMap.put(cardChildNodeList.item(xx).getNodeName(), cardChildNodeList.item(xx).getTextContent());
//              }
//
//              NodeList memberNodeList = doc.getElementsByTagName("AadharDetails");
//              for (int yy = 0; yy < memberNodeList.getLength(); yy++) {
//                  HashMap<String, String> memberMap = new HashMap();
//                  NodeList memberChildNodeList = memberNodeList.item(yy).getChildNodes();
//                  for (int xx = 0; xx < memberChildNodeList.getLength(); xx++) {
//                      memberMap.put(memberChildNodeList.item(xx).getNodeName(),
//                              memberChildNodeList.item(xx).getTextContent());
//                  }
//                  memberMapList.add(memberMap);
//              }
//          }
//
//
//      } catch (Exception e) {
//      }
//      return memberMapList;
//  }

  public static int getFid(String aadharno, int mcode) {
      int fid = 0;
      Connection con = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      SqlDBUtil test = new SqlDBUtil();
      try {
          con = test.getConnection();
          pstmt = con.prepareStatement("select fid from cmssfarmers where aadharno=? and mcode=? order by ts desc limit 1");
          pstmt.setString(1, aadharno);
          pstmt.setInt(2, mcode);
          rs = pstmt.executeQuery();
          if (rs.next()) {
              fid = rs.getInt("fid");
          }
      } catch (Exception e) {
          System.out.print(e.getMessage());
      } finally {
          try {
              if (rs != null) {
                  rs.close();
                  rs = null;
              }

              if (pstmt != null) {
                  pstmt.close();
                  pstmt = null;
              }

              if (con != null) {
                  con.close();
                  con = null;
              }
          } catch (SQLException e) {
          }
      }
      return fid;
  }

  public static String GetCheckAadhar(String uid, String cropyear, String season) {
      String aadhar = "";
      Connection con = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      SqlDBUtil test = new SqlDBUtil();
      try {
          con = test.getConnection();
          pstmt = con.prepareStatement("select aadharno from ben_distribution where aadharno=? and cropyear=? and season=?");
          pstmt.setString(1, uid);
          pstmt.setInt(2, Integer.parseInt(cropyear));
          pstmt.setString(3, season);
          rs = pstmt.executeQuery();
          if (rs.next()) {
              aadhar = rs.getString("aadharno");
          }
      } catch (Exception e) {
          System.out.print(e.getMessage());
      } finally {
          try {
              if (rs != null) {
                  rs.close();
                  rs = null;
              }

              if (pstmt != null) {
                  pstmt.close();
                  pstmt = null;
              }

              if (con != null) {
                  con.close();
                  con = null;
              }
          } catch (SQLException e) {
          }
      }
      return aadhar;
  }
//

//  public static String GetRationUID(String UID) {
//      String res = "";
//      Object soapResultAsObj;
//      //System.out.println("Uid "+UID);
//      try {
//
//          String SOAP_ACTION = null;
//          String WSDL_TARGET_NAMESPACE = "http://service.uid.rationcard/";
//          String OPERATION_NAME = "getUidRationcards";
//          //String SOAP_ADDRESS_statewise = "http://epdsap.ap.gov.in/UidRationCards/getUidRationCards?wsdl";
//          // String SOAP_ADDRESS_statewise = "https://epds2.ap.gov.in/UidRationCards/getUidRationCards?wsdl";
//          String SOAP_ADDRESS_statewise = "https://epds2.ap.gov.in/RationCardDetailsOnUID/getRationCardDetailsOnUid?wsdl";
//          SOAP_ACTION = "http://service.uid.rationcard/getUidRationcards";
//          //System.out.println("Rationcard Test 1");
//          SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE, OPERATION_NAME);
//          request.addProperty("Uid_No", UID);
//          request.addProperty("password", "6000c29b30b113dc4643b14a3f905d5f");
//          request.addProperty("hts", "12");
//          SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
//          //  envelope.dotNet = true;
//          envelope.setOutputSoapObject(request);
//          HttpTransportSE httpTransportSE = new HttpTransportSE(SOAP_ADDRESS_statewise);
//          //  httpTransportSE.debug = true;
//          httpTransportSE.call(SOAP_ACTION, envelope);
//
//          soapResultAsObj = envelope.getResponse();
//          res = envelope.toString();
//
//
//      } catch (Exception e) {
//          System.out.println("" + e.getMessage());
//      }
//      return res;
//  }

  //
//  public static String GetRationCard(String rationcard) {
//      String res = "";
//      Object soapResultAsObj;
//
//      try {
//
//          String SOAP_ACTION = null;
//          String WSDL_TARGET_NAMESPACE = "http://service.fetch.rationcard/";
//          String OPERATION_NAME = "getePDSRationCardDetails";
//          //String SOAP_ADDRESS_statewise = "http://epdsap.ap.gov.in/RationCardFetch/rationcardservice?wsdl";
//          String SOAP_ADDRESS_statewise = "https://epds2.ap.gov.in/RationCardFetch/rationcardservice?wsdl";
//          SOAP_ACTION = "http://service.fetch.rationcard/getePDSRationCardDetails";
//
//          SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE, OPERATION_NAME);
//          request.addProperty("existingRCNum", rationcard);
//          request.addProperty("password", "6000c29b30b113dc4643b14a3f905d5f");
//          request.addProperty("hts", "12");
//          SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
//          //  envelope.dotNet = true;
//          envelope.setOutputSoapObject(request);
//          HttpTransportSE httpTransportSE = new HttpTransportSE(SOAP_ADDRESS_statewise);
//          //  httpTransportSE.debug = true;
//          httpTransportSE.call(SOAP_ACTION, envelope);
//          soapResultAsObj = envelope.getResponse();
//          res = soapResultAsObj.toString();
//
//      } catch (Exception e) {
//          System.out.println("" + e.getMessage());
//      }
//      return res;
//  }

  public static int getFid(String aadharno, int mcode, int mvkcode) {
      int fid = 0;
      Connection con = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
       SqlDBUtil test = new  SqlDBUtil();
      try {
          con = test.getConnection();
          pstmt = con.prepareStatement("select fid from cmssfarmers where aadharno=? and mcode=? and mvkcode=? order by ts desc limit 1");
          pstmt.setString(1, aadharno);
          pstmt.setInt(2, mcode);
          pstmt.setInt(3, mvkcode);
          rs = pstmt.executeQuery();
          if (rs.next()) {
              fid = rs.getInt("fid");
          }
      } catch (Exception e) {
          System.out.print(e.getMessage());
      } finally {
          try {
              if (rs != null) {
                  rs.close();
                  rs = null;
              }

              if (pstmt != null) {
                  pstmt.close();
                  pstmt = null;
              }

              if (con != null) {
                  con.close();
                  con = null;
              }
          } catch (SQLException e) {
          }
      }
      return fid;
  }

  //
 // public static void main(String[] args) {

      //System.out.print(MasterFunctions.WebLandClient("539210218061", "11"));
      
      //System.out.println("caste::"+getCasteCode("General"));

//  }
  
  public static List<String> getActiveCropyearSeason(){
      SqlDBUtil dbUtil = new SqlDBUtil();
      
      Connection con = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      
      List<String> activeCropyearList = new ArrayList<String>();
      try{
            con = dbUtil.getConnection();
          
          String query = "select season,cropyear from activeseason where active='A'";
          pstmt = con.prepareStatement(query);
          rs = pstmt.executeQuery();
          String season = null;
          while(rs.next()){
              if(rs.getString("season").equals("K")){
                  season = "Kharif";
              }
              if(rs.getString("season").equals("R")){
                  season = "Rabi";
              }
              
              String cropyear = season+","+rs.getInt("cropyear");
              //System.out.println("cropyear : "+cropyear);
              activeCropyearList.add(cropyear);
          }
      } catch(Exception e){
          e.printStackTrace();
      }
      finally{
          try{
              if(rs != null){
                  rs.close();
              }
              if(pstmt != null){
                  pstmt.close();
              }
              if(con != null){
                  con.close();
              }
          } catch(SQLException e){
              e.printStackTrace();
          }
      }
      return activeCropyearList;
  }
  
  public static List<String> getAllDistricts(){
      SqlDBUtil dbUtil = new SqlDBUtil();
      
      Connection con = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      List distList = new ArrayList<String>();
      
      try{
          con = dbUtil.getConnection();
          String query = "select dcode, dname from district_2011_cs";
          pstmt = con.prepareStatement(query);
          
          rs = pstmt.executeQuery();
          
          while(rs.next()){
              distList.add(rs.getInt("dcode")+","+rs.getString("dname"));
              //System.out.println("Master Lst : "+rs.getInt("dcode")+","+rs.getString("dname"));
          }
      }catch(Exception e){
          e.printStackTrace();
      }
      return distList;
  }
  public static int quintalsToBags(String seedvariety, String cropyear, String season, String dcode, double qtyQuintals) throws SQLException{
      RepDBUtil sql = new RepDBUtil();
      Connection con = null;
      PreparedStatement pst = null;
      ResultSet rs = null;
      
      double qtyperbag = 0.0, factor = 0.0;
      int noofbags = 0;
      
      try{
          con = sql.getConnection();
          
          String qry = "select quantityperbag from product_price where varietycode=? and cropyear=? and season=? and dcode=?";
          pst = con.prepareStatement(qry);
          pst.setString(1, seedvariety);
          pst.setInt(2, Integer.parseInt(cropyear));
          pst.setString(3, season);
          pst.setInt(4, Integer.parseInt(dcode));
          
          rs = pst.executeQuery();
          //System.out.println("qtyperbag pst : "+pst);
          if(rs.next()){
              qtyperbag = rs.getInt("quantityperbag");
          }
          //System.out.println("qtyperbag : "+qtyperbag);
          rs.close();
          pst.close();
          
          qry = "select factor from units where units=(select units from varietymast where varietycode=?)";
          pst = con.prepareStatement(qry);
          pst.setString(1, seedvariety);
          
          rs = pst.executeQuery();
          //System.out.println("factor pst : "+pst);
          if(rs.next()){
              factor = rs.getDouble("factor");
          }
          //System.out.println("factor : "+factor);
          noofbags = (int) (qtyQuintals/(factor *qtyperbag));
          //System.out.println("qtykgs : "+noofbags);
          return noofbags;
      }catch(Exception e){
          e.printStackTrace();
      }
      finally{
          if(rs != null){
              rs.close();
          }
          if(pst != null){
              pst.close();
          }
          if(con != null){
              con.close();
          }
      }
      return noofbags;
  }
  
  public double getRemainingTarget(String seedVariety, String vcode, String cropyear, String season) {
	SqlDBUtil db = new SqlDBUtil();
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	double targetKgs = 0, issuedQtyKgs = 0;
	
	String qry = "select target from targets_mao_vs where season=? and cropyear=? and vscode=? and seedvariety=?";
	
	try {
		con = db.getConnection();
	
		pst = con.prepareStatement(qry);
		pst.setString(1, season);
		pst.setInt(2, Integer.parseInt(cropyear));
		pst.setInt(3, Integer.parseInt(vcode));
		pst.setString(4, seedVariety);
		//System.out.println("pst: "+pst);
		rs = pst.executeQuery();
		if (rs.next()) {
			targetKgs = Double.parseDouble(rs.getString("target"))*100;
		}
		
		qry = "select COALESCE(sum(qty_kgs), 0.00)::text as qty_kgs from ben_distribution where season=? and cropyear=? and vcode=? and seedvariety=?";
		
		pst = con.prepareStatement(qry);
		pst.setString(1, season);
		pst.setInt(2, Integer.parseInt(cropyear));
		pst.setInt(3, Integer.parseInt(vcode));
		pst.setString(4, seedVariety);
		//System.out.println("pst: "+pst);
		rs = pst.executeQuery();
		if (rs.next()) {
			issuedQtyKgs = Double.parseDouble(rs.getString("qty_kgs"));
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return (targetKgs-issuedQtyKgs)/100;
}
  
  public static String getCname(int cid) throws SQLException {
	SqlDBUtil db = new SqlDBUtil();
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	String cname = "";
	
	try {
		con = db.getConnection();
		String qry = "select cname from cluster_master where cid = ?";
		
		pst = con.prepareStatement(qry);
		pst.setInt(1, cid);
		
		rs = pst.executeQuery();
		
		if(rs.next()) {
			cname = rs.getString("cname");
		}
	} catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		if(rs != null) {
			rs.close();
		}
		if(pst != null) {
			pst.close();
		}
		if(con != null) {
			con.close();
		}
	}
	
	return cname;
}
  
  
  
   public static String getDownloadsts(String wbvcode) throws SQLException {
	SqlDBUtil db = new SqlDBUtil();
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	String dstatus = "";
	
	try {
		con = db.getConnection();
		String qry = "select distinct downloaded from cr_booking where cr_vcode = ?";
		
		pst = con.prepareStatement(qry);
		pst.setInt(1, Integer.parseInt(wbvcode));            		       
		rs = pst.executeQuery();
		
		if(rs.next()) {
			dstatus = rs.getString("downloaded");
                  
		}
	} catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		if(rs != null) {
			rs.close();
		}
		if(pst != null) {
			pst.close();
		}
		if(con != null) {
			con.close();
		}
	}
	
	return dstatus;
}
    public static String getDownloadsts(String wbdcode,String wbvcode,String cropyear,String tseason) throws SQLException {
	SqlDBUtil db = new SqlDBUtil();
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	String dstatus = "",tbname1="";
	try {
		con = db.getConnection();
              
               tbname1 = "ecrop2024.cr_booking_partition_" + tseason + wbdcode + cropyear;
		String qry = "select distinct downloaded from "+ tbname1+" where cr_vcode = ? and downloaded='Y'  ";
		
		pst = con.prepareStatement(qry);
		pst.setInt(1, Integer.parseInt(wbvcode));        		       
		rs = pst.executeQuery();
		
		if(rs.next()) {
			dstatus = rs.getString("downloaded");
                  
		}
           
	} catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		if(rs != null) {
			rs.close();
		}
		if(pst != null) {
			pst.close();
		}
		if(con != null) {
			con.close();
		}
	}
	
	return dstatus;
}
   
   

      public static List<String> getAllCropyearSeason(){
      SqlDBUtil dbUtil = new SqlDBUtil();
      
      Connection con = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      
      List<String> activeCropyearList = new ArrayList<String>();
      try{
            con = dbUtil.getConnection();
          
          String query = "select season,cropyear,status from activeseason ";
          pstmt = con.prepareStatement(query);
          rs = pstmt.executeQuery();
          String season = null;
          while(rs.next()){
              if(rs.getString("season").equals("K")){
                  season = "Kharif";
              }
              if(rs.getString("season").equals("R")){
                  season = "Rabi";
              }
              
              String cropyear = season+","+rs.getInt("cropyear")+","+rs.getString("status");
              //System.out.println("cropyear : "+cropyear);
              activeCropyearList.add(cropyear);
          }
      } catch(Exception e){
          e.printStackTrace();
      }
      finally{
          try{
              if(rs != null){
                  rs.close();
              }
              if(pstmt != null){
                  pstmt.close();
              }
              if(con != null){
                  con.close();
              }
          } catch(SQLException e){
              e.printStackTrace();
          }
      }
      return activeCropyearList;
  }
      
public static String getCropImage(String wbdcode,String bookingid,String cropyear,String tseason,String activeYear) throws SQLException {
	SqlDBUtil db = new SqlDBUtil();
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	String imgcode = "",tbname1="";
	try {
		con = db.getConnection();
              tbname1 = "cr_images";
              if(wbdcode.length()==0){
                  wbdcode="0"+wbdcode;
              }
              
              if(activeYear.equals(cropyear)){
                  tbname1 = "ecrop"+cropyear+"."+tbname1 +"_"+ tseason + wbdcode + cropyear; 
              }
             
               
		String qry = "select photo from "+tbname1+" where bookingid=? ";
		
		pst = con.prepareStatement(qry);
		pst.setLong(1, Long.parseLong(bookingid));        		       
		rs = pst.executeQuery(); 
		
		if(rs.next()) {
			imgcode = rs.getString("photo");
                  
		}
           
	} catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		if(rs != null) {
			rs.close();
		}
		if(pst != null) {
			pst.close();
		}
		if(con != null) {
			con.close();
		}
	}
	
	return imgcode;
}
         
   public static String getCropImageMao(String wbdcode, String bookingid, String cropyear, String tseason, String cr_crop,String activeYear)
          throws SQLException {
     // System.out.println("activeYear=========="+activeYear);
             // System.out.println("cropyear=========="+cropyear);

      SqlDBUtil db = new SqlDBUtil();
      Connection con = null;
      PreparedStatement pst = null;
      ResultSet rs = null;
  	String[] season = cropyear.split("@");
	String cseason = season[0];
	Integer Year = Integer.parseInt(season[1]);
      String imgcode = "", tbname1 = "";
          try {
			con = db.getConnection();
         tbname1 = "cr_images_" + tseason + wbdcode + cropyear;
          
          if(wbdcode.length()==1){
              wbdcode="0"+wbdcode;
          }
          if(Year == (Year)){
             tbname1 = "ecrop"+Year+".cr_images_" + tseason + wbdcode + Year;  
          }
         
          String qry = "select photo from " + tbname1 + " where bookingid=? and cr_crop=? limit 5";
          

          pst = con.prepareStatement(qry);
          pst.setLong(1, Long.parseLong(bookingid));
          pst.setLong(2, Integer.parseInt(cr_crop));
          rs = pst.executeQuery();

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
  
   
   public static String getCropImageMao1(
			String wbdcode, Integer bookingid, 
			String cropyear, String seasonType, 
			String cr_crop,Integer seasonYear)
           throws SQLException {
		
		System.out.println("wbdcode=>"+wbdcode);
		System.out.println("bookingid=>"+bookingid);
		System.out.println("cropyear=>"+cropyear);
		System.out.println("seasonType=>"+seasonType);
		System.out.println("cr_crop=>"+cr_crop);
		System.out.println("seasonYear=>"+seasonYear);
		
		String[] season = cropyear.split("@");
		System.out.println("season========="+season);
		 seasonType = season[0];
		System.out.println("cseason========="+seasonType);
		 seasonYear = Integer.parseInt(season[1]);
		System.out.println("seasonYear========="+seasonYear);
     

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
           tbname1 = "cr_images_" + seasonType + wbdcode + seasonYear;
           if((seasonYear).equals(2023)){
              tbname1 = "ecrop"+seasonYear+".cr_images_" + seasonType + wbdcode + seasonYear;  
           }
           System.out.println("tbname1=========>"+tbname1);
          
           String qry = "select photo from " + tbname1 + " where bookingid=? and cr_crop=?";
System.out.println("qry--------->"+qry);
           pst = con.prepareStatement(qry);
           pst.setLong(1, (bookingid));
           pst.setLong(2, Integer.parseInt(cr_crop));
           rs = pst.executeQuery();
           System.out.println("pst========>"+pst); 
           if (rs.next()) {
               imgcode = rs.getString("photo");
System.out.println("imgcode-------------"+imgcode);
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
      public static String getWholeSurveyNo(String wbdcode,String wbvcode,String surveyNo,String cropyear,String season,String activeYear) throws SQLException {
	SqlDBUtil db = new SqlDBUtil();
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	String wholeSrno = "",tbname1="";
	try {
		con = db.getConnection();
              tbname1 = "pattadarmast_wb_partition_";
              
              if(wbdcode.length()==0){
                  wbdcode="0"+wbdcode;
              }
           
            tbname1 = "ecrop"+cropyear+"."+tbname1 + season + wbdcode + cropyear;
              
               
		String qry = "select cr_wsno from "+tbname1+" where cr_vcode=? and cr_sno=? ";
		
		pst = con.prepareStatement(qry);
		pst.setInt(1, Integer.parseInt(wbvcode)); 
              pst.setString(2, new String(surveyNo.getBytes("8859_1"), "UTF-8"));            
		rs = pst.executeQuery();// System.out.println("pst::"+pst);
		
		if(rs.next()) {
			wholeSrno = rs.getString("cr_wsno"); //System.out.println("whoel srnO::"+wholeSrno);
                  
		}
           
	} catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		if(rs != null) {
			rs.close();
		}
		if(pst != null) {
			pst.close();
		}
		if(con != null) {
			con.close();
		}
	}
	
	return wholeSrno;
}
      public static String getCropImage(String wbdcode,Integer bookingid,String cropyear) throws SQLException {
			SqlDBUtil db = new SqlDBUtil();
			Connection con = null;
			PreparedStatement pst = null;
			ResultSet rs = null;
			String imgcode = "",tbname1="";
		 	try {
				con = db.getConnection();
		                tbname1 = "cr_images";
		                
		                if (wbdcode.length() == 0) {
		                    wbdcode = "0" + wbdcode;
		                }

		                
		                String[] season = cropyear.split("@");
		        		
		        		String cseason = season[0];
		        		//System.out.println("cseason========="+cseason);
		        		Integer Yearr = Integer.parseInt(season[1]);
		        		//System.out.println("Year========="+Yearr);
		                
		                
		                if(Yearr.equals(Yearr)){
		                    tbname1 = "ecrop"+Yearr+"."+tbname1 +"_"+ cseason + wbdcode + Yearr; 
		                }
		             // System.out.println("tbname1============"+tbname1);
		                 
				String qry = "select photo from "+tbname1+" where bookingid=? ";
				
				pst = con.prepareStatement(qry);
				pst.setLong(1, bookingid);        		       
				rs = pst.executeQuery(); 
				
				if(rs.next()) {
					imgcode = rs.getString("photo");
		                    
				}
		             
			} catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				if(rs != null) {
					rs.close();
				}
				if(pst != null) {
					pst.close();
				}
				if(con != null) {
					con.close();
				}
			}
			
			return imgcode;
		}

      
}

