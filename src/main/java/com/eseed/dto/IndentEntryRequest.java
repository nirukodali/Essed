package com.eseed.dto;

import java.util.List;

public class IndentEntryRequest {
    private String variety;
    private String cropYear;
    private String productCode;
    private String subProductCode;
    private List<IndentEntryDto> districtData;   

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getCropYear() {
        return cropYear;
    }

    public void setCropYear(String cropYear) {
        this.cropYear = cropYear;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getSubProductCode() {
        return subProductCode;
    }

    public void setSubProductCode(String subProductCode) {
        this.subProductCode = subProductCode;
    }

    public List<IndentEntryDto> getDistrictData() {
        return districtData;
    }

    public void setDistrictData(List<IndentEntryDto> districtData) {
        this.districtData = districtData;
    }

	@Override
	public String toString() {
		return "IndentEntryRequest [variety=" + variety + ", cropYear=" + cropYear + ", productCode=" + productCode
				+ ", subProductCode=" + subProductCode + ", districtData=" + districtData + "]";
	}
}