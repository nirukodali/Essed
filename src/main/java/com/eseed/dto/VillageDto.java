package com.eseed.dto;

public class VillageDto {

    private Integer vcode;
    private String vname;

    // Constructor
    
    public VillageDto() {
		// TODO Auto-generated constructor stub
	}
    public VillageDto(Integer vcode, String vname) {
        this.vcode = vcode;
        this.vname = vname;
    }

    // Getters and Setters
    public Integer getVcode() {
        return vcode;
    }

    public void setVcode(Integer vcode) {
        this.vcode = vcode;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }
}
