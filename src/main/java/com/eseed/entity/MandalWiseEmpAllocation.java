package com.eseed.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class MandalWiseEmpAllocation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String vsdname;
	private String vsmname;
	private Long VAA;
	private Long VHA;
	private Long VSA;
	private Long AEO;
	private Long MPEO;
	private Long VFA;
	private Long ATM;
	private Long BTM;
	private Long NOPOST;
	
	public MandalWiseEmpAllocation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MandalWiseEmpAllocation(String vsdname, String vsmname, Long vAA, Long vHA, Long vSA, Long aEO, Long mPEO,
			Long vFA, Long aTM, Long bTM, Long nOPOST) {
		super();
		this.vsdname = vsdname;
		this.vsmname = vsmname;
		VAA = vAA;
		VHA = vHA;
		VSA = vSA;
		AEO = aEO;
		MPEO = mPEO;
		VFA = vFA;
		ATM = aTM;
		BTM = bTM;
		NOPOST = nOPOST;
	}

	public String getVsdname() {
		return vsdname;
	}

	public void setVsdname(String vsdname) {
		this.vsdname = vsdname;
	}

	public String getVsmname() {
		return vsmname;
	}

	public void setVsmname(String vsmname) {
		this.vsmname = vsmname;
	}

	public Long getVAA() {
		return VAA;
	}

	public void setVAA(Long vAA) {
		VAA = vAA;
	}

	public Long getVHA() {
		return VHA;
	}

	public void setVHA(Long vHA) {
		VHA = vHA;
	}

	public Long getVSA() {
		return VSA;
	}

	public void setVSA(Long vSA) {
		VSA = vSA;
	}

	public Long getAEO() {
		return AEO;
	}

	public void setAEO(Long aEO) {
		AEO = aEO;
	}

	public Long getMPEO() {
		return MPEO;
	}

	public void setMPEO(Long mPEO) {
		MPEO = mPEO;
	}

	public Long getVFA() {
		return VFA;
	}

	public void setVFA(Long vFA) {
		VFA = vFA;
	}

	public Long getATM() {
		return ATM;
	}

	public void setATM(Long aTM) {
		ATM = aTM;
	}

	public Long getBTM() {
		return BTM;
	}

	public void setBTM(Long bTM) {
		BTM = bTM;
	}

	public Long getNOPOST() {
		return NOPOST;
	}

	public void setNOPOST(Long nOPOST) {
		NOPOST = nOPOST;
	}

	@Override
	public String toString() {
		return "MandalWiseEmpAllocation [vsdname=" + vsdname + ", vsmname=" + vsmname + ", VAA=" + VAA + ", VHA=" + VHA
				+ ", VSA=" + VSA + ", AEO=" + AEO + ", MPEO=" + MPEO + ", VFA=" + VFA + ", ATM=" + ATM + ", BTM=" + BTM
				+ ", NOPOST=" + NOPOST + "]";
	}
	

}
