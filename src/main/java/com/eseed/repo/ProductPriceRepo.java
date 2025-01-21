package com.eseed.repo;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eseed.dto.AddSeedVarietyDto;
import com.eseed.dto.NewProductPriceDto;
import com.eseed.dto.ProductPriceDto;
import com.eseed.dto.SeasonDto;
import com.eseed.dto.VaritycodeDto;
import com.eseed.util.CommonMethods;
import com.eseed.util.SqlDBUtil;

@Component
public class ProductPriceRepo {

	@PersistenceContext
	EntityManager entityManager;
	
	@Autowired
	CommonMethods commonMethods;
	
	public List<SeasonDto> getSeasons() {
		
		String qry="select concat(a.season,'@',cropyear) as rcropyear,concat(b.seasonname,',',cropyear) as rseason from activeseason a,season b where a.active='A' "
				+ "and a.season=b.season order by a.cropyear,a.season ";
		List<SeasonDto> data = new ArrayList<>();
		Query sql = entityManager.createNativeQuery(qry);
		List<Object> objects = sql.getResultList();

		if (objects != null && objects.size() > 0) {

			for (Object patta : objects) {

				Object[] row = (Object[]) patta;

				SeasonDto seasonDto = new SeasonDto();

				seasonDto.setSeason(((String) row[0]));
				seasonDto.setSeasonname(((String) row[1]));
				data.add(seasonDto);
			}
		}
		
		return data;
		
		
	}

	@Transactional
public List<VaritycodeDto> varietycode(String season,String cropYear) {
		
		String qry="select distinct a.varietycode,b.name from product_price a join varietymast b on (a.varietycode=b.varietycode) where cropyear=? and season=? ";
		List<VaritycodeDto> data = new ArrayList<>();
		Query sql = entityManager.createNativeQuery(qry);
		
		sql.setParameter(1, Integer.parseInt(cropYear));
		sql.setParameter(2, season);
		
		List<Object> objects = sql.getResultList();

		if (objects != null && objects.size() > 0) {

			for (Object patta : objects) {

				Object[] row = (Object[]) patta;

				VaritycodeDto varitycodeDto = new VaritycodeDto();

				varitycodeDto.setVarietycode(((String) row[0]));
				varitycodeDto.setName(((String) row[1]));
				data.add(varitycodeDto);
			}
		}
		
		return data;
		
		
	}
	/*

SELECT  pp.newrateid,pp.dcode, pp.product_price, pp.subsidy_percent,pp.subsidy_amt,pp.nonsubsidy_amt,pp.fromdate,pp.todate,pp.active,pp.productid,
pp.quantityperbag,
d.dname FROM product_price pp JOIN public.district_2011_cs d  ON pp.dcode = d.dcode WHERE pp.cropyear = 2024 AND pp.varietycode = 'A0102734'AND
pp.season = 'K' AND pp.todate + 360 >= NOW()::DATE ORDER BY pp.dcode, pp.varietycode; TO_CHAR
	*/
	@Transactional
	public List<ProductPriceDto> productPrice(String season, Integer cropYear, String seedvariety) {

		String qry ="SELECT  pp.newrateid,pp.dcode,  pp.product_price,   COALESCE(pp.subsidy_percent, 0) AS subsidy_percent, pp.subsidy_amt, pp.nonsubsidy_amt, TO_CHAR(pp.fromdate,'dd/mm/yyyy') as fromdate, TO_CHAR(pp.todate,'dd/mm/yyyy') as todate, pp.active,"
				+ " pp.productid, pp.quantityperbag, d.dname,vm.name, TO_CHAR(pp.payment_from_dt,'dd/mm/yyyy') as payment_from_dt,TO_CHAR(pp.payment_close_dt,'dd/mm/yyyy')as payment_close_dt,"
				+ " TO_CHAR(pp.dist_from_dt,'dd/mm/yyyy')as dist_from_dt,TO_CHAR(pp.dist_close_dt,'dd/mm/yyyy') as dist_close_dt " + "FROM " + " product_price pp " + "JOIN "
				+ " public.district_2011_cs d " + "    ON pp.dcode = d.dcode " + "JOIN "
				+ " varietymast vm ON pp.varietycode = vm.varietycode " + "WHERE " + "  pp.cropyear = " + cropYear
				+ " AND pp.varietycode ='" + seedvariety + "' AND pp.season ='" + season + "' "
				+ " ORDER BY pp.dcode, pp.varietycode";
//	AND pp.todate + 360 >= NOW()::DATE
		System.out.println("qry===>" + qry);
		List<ProductPriceDto> data = new ArrayList<>();
		Query sql = entityManager.createNativeQuery(qry);

//	sql.setParameter(1, );,  , , ,
//	sql.setParameter(2, );  
//	sql.setParameter(3, );
		List<Object> objects = sql.getResultList();

		if (objects != null && objects.size() > 0) {

			for (Object patta : objects) {

				Object[] row = (Object[]) patta;

				ProductPriceDto productPriceDto = new ProductPriceDto();

				productPriceDto.setNewrateid(((Integer) row[0]));
				productPriceDto.setDcode(((Integer) row[1]));
				productPriceDto.setProduct_price(((Double) row[2]));
				productPriceDto.setSubsidy_percent(((Double) row[3]));
				productPriceDto.setSubsidy_amt(((Double) row[4]));
				productPriceDto.setNonsubsidy_amt(((Double) row[5]));
				productPriceDto.setFromdate((row[6]).toString());
				productPriceDto.setTodate(( row[7]).toString());
				productPriceDto.setActive(((Character) row[8]));
				;
				productPriceDto.setProductid(((Integer) row[9]));
				productPriceDto.setQuantityperbag(((Double) row[10]));
				productPriceDto.setDname(((String) row[11]));
				productPriceDto.setName(((String) row[12]));
				productPriceDto.setPayment_from_dt ((row[13]).toString());
				productPriceDto.setPayment_close_dt(( row[14]).toString());
				productPriceDto.setDist_from_dt((row[15]).toString());
				productPriceDto.setDist_close_dt((row[16]).toString());
				data.add(productPriceDto);

			}
		}

		return data;

	}
/*UPDATE product_price SET  product_price = ?,subsidy_amt = ?,nonsubsidy_amt = ? , fromdate = ?::date, todate = ?::date, quantityperbag = ? , subsidy_percent = ? ,"
+ "payment_from_dt= ?::date,payment_close_dt= ?::date,dist_from_dt= ?::date,dist_close_dt = ?::date where cropyear=? and season=? and dcode=? and varietycode=?";

	*/

@Transactional
public Integer getUpdateProductPrice(String season, Integer cropYear, String product_price, String SubsidyAmount,
		String NonSubsidyAmount, String fromDate, String toDate, String quantityPerBag, Integer dcode,
		String varietycode,String psd, String pcd, String dsd,String dcd) {

	String qry = "UPDATE product_price SET  product_price = ?,subsidy_amt = ?,nonsubsidy_amt = ? , fromdate = ?, todate = ?, quantityperbag = ?,payment_from_dt=?,payment_close_dt=?,dist_from_dt=?,dist_close_dt=?"
			+ " where cropyear=" + cropYear + " and season='" + season + "' and dcode=" + dcode
			+ " and varietycode='" + varietycode + "' ";
	
	System.out.println("qry==>" + qry);
	Query sql = entityManager.createNativeQuery(qry);

	sql.setParameter(1, Double.parseDouble(product_price));
	sql.setParameter(2, Double.parseDouble(SubsidyAmount));
	sql.setParameter(3, Double.parseDouble(NonSubsidyAmount));
	sql.setParameter(4, java.sql.Date.valueOf(fromDate));
	sql.setParameter(5, java.sql.Date.valueOf(toDate));
	sql.setParameter(6, Double.parseDouble(quantityPerBag));
	sql.setParameter(7, java.sql.Date.valueOf(psd));
	sql.setParameter(8, java.sql.Date.valueOf(pcd));		
	sql.setParameter(9, java.sql.Date.valueOf(dsd));
	sql.setParameter(10, java.sql.Date.valueOf(dcd));
	
	Integer update = sql.executeUpdate();

	System.out.println("update " + update);
	return update;

}



@Transactional
public Integer getActiveandInactive(String season, Integer cropYear,String varietycode,Integer dcode,String active) {

	String qry = "UPDATE product_price SET   active = ?"
			+ " where cropyear=" + cropYear + " and season='" + season + "' and dcode=" + dcode
			+ " and varietycode='" + varietycode + "' ";
	
	Query sql = entityManager.createNativeQuery(qry);

	sql.setParameter(1, active);
	
	/*
	 * sql.setParameter(7, cropYear); sql.setParameter(8, season);
	 * sql.setParameter(9,Integer.parseInt(dcode));
	 */

	Integer update = sql.executeUpdate();

	System.out.println("update " + update);
	return update;

}








//Jagadish code

	public List<SeasonDto> getSeasonsValues() {

		String qry = "select season,seasonname from season  where season in(SELECT season FROM activeseason WHERE active='A') ";
		List<SeasonDto> data = new ArrayList<>();
		Query sql = entityManager.createNativeQuery(qry);
		List<Object> objects = sql.getResultList();

		if (objects != null && objects.size() > 0) {

			for (Object patta : objects) {

				Object[] row = (Object[]) patta;

				SeasonDto seasonDto = new SeasonDto();

				seasonDto.setSeason(((Character) row[0]).toString());
				seasonDto.setSeasonname(((String) row[1]));
				data.add(seasonDto);
			}
		}

		return data;

	}

	@Transactional
	public List<AddSeedVarietyDto> getSeedVariety() {

		String qry = "select varietycode,concat(name,'-',units) as seedname from varietymast where active='A' "
				+ " and varietycode in (select varietycode from product_price) order by name ";
		List<AddSeedVarietyDto> data = new ArrayList<>();
		Query sql = entityManager.createNativeQuery(qry);
		List<Object> objects = sql.getResultList();

		if (objects != null && objects.size() > 0) {

			for (Object patta : objects) {

				Object[] row = (Object[]) patta;

				AddSeedVarietyDto addSeedVarietyDto = new AddSeedVarietyDto();

				addSeedVarietyDto.setVarietycode((String) row[0]);
				addSeedVarietyDto.setSeedname((String) row[1]);
				data.add(addSeedVarietyDto);
			}
		}

		return data;

	}

	@Transactional
	public List<NewProductPriceDto> getDataForNewPrice(Integer cropYear, String seedCode, String seasonCode) {

		String qry = "SELECT product_price,subsidy_percent,subsidy_amt,nonsubsidy_amt,fromdate,todate,"
				+ "active,productid,quantityperbag,dcode FROM product_price  " + "WHERE cropyear=" + cropYear
				+ " and varietycode='" + seedCode + "' and season='" + seasonCode + "'  and active='N' order by dcode "; // and
																															// dcode
																															// ="++"

		List<NewProductPriceDto> data = new ArrayList<>();
		Query sql = entityManager.createNativeQuery(qry);
		List<Object> objects = sql.getResultList();

		if (objects != null && objects.size() > 0) {

			for (Object patta : objects) {

				Object[] row = (Object[]) patta;

				NewProductPriceDto addSeedVarietyDto = new NewProductPriceDto();

				addSeedVarietyDto.setProduct_price((Double) row[0]);
				addSeedVarietyDto.setSubsidy_percent((Double) row[1]);
				addSeedVarietyDto.setSubsidy_amt((Double) row[2]);
				Double nonsubsidyAmt = (Double) row[3];
				if(nonsubsidyAmt != null) {
					nonsubsidyAmt = BigDecimal.valueOf(nonsubsidyAmt)
							.setScale(2, BigDecimal.ROUND_HALF_UP)
							.doubleValue();
				}
				addSeedVarietyDto.setNonsubsidy_amt(nonsubsidyAmt);
				addSeedVarietyDto.setFromdate((Date) row[4]);
				addSeedVarietyDto.setTodate((Date) row[5]);
				addSeedVarietyDto.setActive((Character) row[6]);
				addSeedVarietyDto.setProductid((int) row[7]);
				addSeedVarietyDto.setQuantityperbag((Double) row[8]);
				addSeedVarietyDto.setDcode((int) row[9]);
				addSeedVarietyDto.setVarietyCode((String) seedCode);
				if (row[9] != null) {
					int dcode = (int) row[9];
					String qry1 = "SELECT dname FROM district_2011_cs  WHERE dcode=" + dcode;
					Query sql1 = entityManager.createNativeQuery(qry1);
					String distName = (String) sql1.getSingleResult();
					addSeedVarietyDto.setDistName(distName);
				} else {
					addSeedVarietyDto.setDistName("");
				}

				if (seedCode != null) {

					String qry2 = "SELECT name FROM varietymast WHERE  varietycode::::text='" + seedCode + "'";
					Query sql2 = entityManager.createNativeQuery(qry2);
					String varietyName = (String) sql2.getSingleResult();
					addSeedVarietyDto.setVarietyName(varietyName);
				} else {
					addSeedVarietyDto.setVarietyName("");
				}

				data.add(addSeedVarietyDto);
			}
		}

		return data;

	}

	@Transactional
	public String updateNewProductPrice(HttpSession session, HttpServletRequest request, String varietycode,
			String dcode, String season, String cropyear, String ftime, String ttime, String product_price,
			String subsidy_amt, String quantityperbag, String SubsidyPercent) {
		
		int productid = 0, i = 0, j = 0, k = 0;
		String status = "";
		SqlDBUtil sql = new SqlDBUtil();
		Connection con = null;
		PreparedStatement pstmt = null, pstmt1 = null, pstmt2 = null, pstmt3 = null, pstmt4 = null;
		ResultSet rs = null, rs1 = null;

		Double nonsubsidy_amt = Double.parseDouble(product_price) - Double.parseDouble(subsidy_amt);
		String userid = (String) session.getAttribute("userid");
		try {
			con = sql.getConnection();
			con.setAutoCommit(false);
			String vflag = "";
			String role = session.getAttribute("role").toString();
			if (ftime.length() != 10 || ttime.length() != 10)
				vflag = "F";
			if (!vflag.equals("F")) {

				String qry = "";
				qry = "select varietycode from product_price where varietycode=? and dcode=? and (?::date between fromdate and todate or ?::date between fromdate and todate)";
				pstmt3 = con.prepareStatement(qry);
				pstmt3.setString(1, varietycode);
				pstmt3.setInt(2, Integer.parseInt(dcode));
				if (ftime.split("-")[0].length() == 4) {
					pstmt3.setString(3, ftime);
				} else {
					pstmt3.setString(3, commonMethods.ReverseDateString(ftime));
				}

				if (ttime.split("-")[0].length() == 4) {
					pstmt3.setString(4, ttime);
				} else {
					pstmt3.setString(4, commonMethods.ReverseDateString(ttime));
				}
				rs1 = pstmt3.executeQuery();

				if (rs1.next()) {
					status = "Already Period exists for this Variety/District";
					return status;
				} else {
					pstmt2 = con.prepareStatement("select productid from varietymast where varietycode =?");
					pstmt2.setString(1, varietycode);
					rs = pstmt2.executeQuery();
					if (rs.next()) {
						productid = rs.getInt("productid");
					}
					
					qry = "insert into product_price (productid,varietycode,product_price,subsidy_amt,nonsubsidy_amt,fromdate,todate,active,dcode,season,entereduserid,clientip,cropyear,quantityperbag,subsidy_percent) values (?,?,?,?,?,?::date,?::date,?,?,?,?,?,?,?,?)";
					
					
					pstmt1 = con.prepareStatement(qry);
					pstmt1.setInt(1, productid);
					pstmt1.setString(2, varietycode);
					pstmt1.setDouble(3, Double.parseDouble(product_price));
					pstmt1.setDouble(4, Double.parseDouble(subsidy_amt));
					pstmt1.setDouble(5, nonsubsidy_amt);
					
					
					if (ftime.split("-")[0].length() == 4) {
						pstmt1.setString(6, ftime);
					} else {
						pstmt1.setString(6, commonMethods.ReverseDateString(ftime));
					} 

					if (ttime.split("-")[0].length() == 4) {
						pstmt1.setString(7, ttime);
					} else {
						pstmt1.setString(7, commonMethods.ReverseDateString(ttime));
					}
					pstmt1.setString(8, "A");
					pstmt1.setInt(9, Integer.parseInt(dcode));
					pstmt1.setString(10, season);
					pstmt1.setString(11, userid);
					pstmt1.setString(12, request.getRemoteAddr());
					pstmt1.setInt(13, Integer.parseInt(cropyear));
					pstmt1.setDouble(14, Double.parseDouble(quantityperbag));
					pstmt1.setDouble(15, Double.parseDouble(SubsidyPercent));
					System.out.println("qry===>"+qry);
					i = pstmt1.executeUpdate();
					if (i == 1) {
						pstmt = con.prepareStatement(
								"UPDATE standards_qty SET ts=now(), fromdate= ? ::date,todate= ? ::date where cropyear=? and season=? and dcode=? and varietycode=? ");
						if (ftime.split("-")[0].length() == 4) {
							pstmt.setString(1, ftime);
						} else {
							pstmt.setString(1, commonMethods.ReverseDateString(ftime));
						}

						if (ttime.split("-")[0].length() == 4) {
							pstmt.setString(2, ttime);
						} else {
							pstmt.setString(2, commonMethods.ReverseDateString(ttime));
						}

						pstmt.setInt(3, Integer.parseInt(cropyear));
						pstmt.setString(4, season);
						pstmt.setInt(5, Integer.parseInt(dcode));
						pstmt.setString(6, varietycode);
						j = pstmt.executeUpdate();

						String statusss = "NewVarietyPrices Added";
						pstmt4 = con.prepareStatement(
								"insert into tracerweb (username,affecteduser,status,clientip,role) values (?,?,?,?,?)");
						pstmt4.setString(1, userid);
						pstmt4.setString(2, varietycode + "_" + dcode);
						pstmt4.setString(3, statusss);
						pstmt4.setString(4, request.getRemoteAddr());
						pstmt4.setString(5, role);
						k = pstmt4.executeUpdate();
						if (i > 0 && j > 0 && k > 0) {
							con.commit();
							
							status = "Updated Sucessfully !";
						} else {
							 con.rollback();
							
							status = "Failed to  Updated !";
						}

					} else {
						con.rollback();
						status = "Failed to Insert";
					}
				}
			} else {
				con.rollback();
				status = "Invalid Date";
			}
		} catch (Exception e) {
			try {
		        if (con != null) {
		            con.rollback(); // Rollback in case of error
		        }
		    } catch (SQLException se) {
		        se.printStackTrace();
		    }
		    e.printStackTrace();
		    status = "An unexpected error occurred: " + e.getMessage();
		} finally {
		    try {
		        if (con != null) {
		            con.close(); // Close connection
		        }
		    } catch (SQLException se) {
		        se.printStackTrace();
		    }
		}
		return status;
	}

}
