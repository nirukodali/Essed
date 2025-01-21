package com.eseed.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;

@Entity
public class Cropnames {

    @Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
 // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cropnames_seq")
//    @SequenceGenerator(name = "cropnames_seq", sequenceName = "public.cropnames_seq", allocationSize = 1)
    private int cropid;

    //@NotNull(message="is required")      
    @Column(name="cropnature")
    private String cropnature;

   // @NotNull(message="is required")  
    @Column(name="croptype")
    private String croptype;

    //@NotNull(message="is required")  
    @Column(name="cropclass")
    private String cropclass;

    //@NotNull(message="is required")  
    @Column(name="grpcode")
    private int grpcode;

   
    @NotBlank(message="is required")  
    @Column(name = "cropname", columnDefinition = "VARCHAR(255) COLLATE utf8_general_ci")
    private String cropname;

    @NotBlank(message="is required")  
    @Column(name="cropnameeng")
    private String cropnameeng;

    public Cropnames() {
    }

	public Cropnames(String cropnature, String croptype, String cropclass, int grpcode, String cropname,
			String cropnameeng) {
		super();
		this.cropnature = cropnature;
		this.croptype = croptype;
		this.cropclass = cropclass;
		this.grpcode = grpcode;
		this.cropname = cropname;
		this.cropnameeng = cropnameeng;
	}

	public int getCropid() {
		return cropid;
	}
	public void setCropid(int cropid) {
		this.cropid = cropid;
	}

	public String getCropnature() {
		return cropnature;
	}
	public void setCropnature(String cropnature) {
		this.cropnature = cropnature;
	}

	public String getCroptype() {
		return croptype;
	}
	public void setCroptype(String croptype) {
		this.croptype = croptype;
	}

	public String getCropclass() {
		return cropclass;
	}
	public void setCropclass(String cropclass) {
		this.cropclass = cropclass;
	}

	public int getGrpcode() {
		return grpcode;
	}
	public void setGrpcode(int grpcode) {
		this.grpcode = grpcode;
	}

	public String getCropname() {
		return cropname;
	}
	public void setCropname(String cropname) {
		this.cropname = cropname;
	}

	public String getCropnameeng() {
		return cropnameeng;
	}
	public void setCropnameeng(String cropnameeng) {
		this.cropnameeng = cropnameeng;
	}

	@Override
    public String toString() {
        return "Cropnames [cropid=" + cropid + ", cropnature=" + cropnature + ", croptype=" + croptype + ", cropclass="
                + cropclass + ", grpcode=" + grpcode + ", cropname=" + cropname + ", cropnameeng=" + cropnameeng + "]";
    }
}

