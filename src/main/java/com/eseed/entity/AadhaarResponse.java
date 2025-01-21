package com.eseed.entity;
import java.util.List;

public class AadhaarResponse {
    private List<CropDamagePojo> cr_sno;
    private List<CropDamagePojo> detailList;

    // Constructor
    public AadhaarResponse(List<CropDamagePojo> cr_sno, List<CropDamagePojo> detailList) {
        this.cr_sno = cr_sno;
        this.detailList = detailList;
    }

    // Getters and Setters
    public List<CropDamagePojo> getCr_sno() {
        return cr_sno;
    }

    public void setCr_sno(List<CropDamagePojo> cr_sno) {
        this.cr_sno = cr_sno;
    }

    public List<CropDamagePojo> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<CropDamagePojo> detailList) {
        this.detailList = detailList;
    }
}
