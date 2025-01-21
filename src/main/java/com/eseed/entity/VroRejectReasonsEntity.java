package com.eseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cr_crop_det_new_v_k052023", schema = "ecrop2024")
public class VroRejectReasonsEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "bookingid")
        private int bookingId; 

        @Column(name = "kh_no")
        private int khathaNo;
        
        @Column(name = "cr_crop")
        private int cropCode;

        @Column(name = "cr_sno")
        private String surveyNo;

        @Column(name = "tot_extent")
        private double totalExtent;

        @Column(name = "cropname")
        private String cropName;

        @Column(name = "oc_name")
        private String farmerName;

		@Column(name = "oc_fname")
        private String farmerFatherName;

        @Column(name = "cr_no")
        private String cropNumber;

        @Column(name = "varietyname")
        private String varietyName;

		@Column(name = "cr_farmeruid")
        private String aadhaarNo;

		@Column(name = "cr_sow_date")
        private String sownDate;
        
        @Column(name = "variety")
        private String varietyCode;
        
        public VroRejectReasonsEntity() {
        }

		public VroRejectReasonsEntity(int bookingId, int khathaNo, int cropCode, String surveyNo, double totalExtent,
				String cropName, String farmerName, String farmerFatherName, String cropNumber, String varietyName,
				String aadhaarNo, String sownDate, String varietyCode) {
			this.bookingId = bookingId;
			this.khathaNo = khathaNo;
			this.cropCode = cropCode;
			this.surveyNo = surveyNo;
			this.totalExtent = totalExtent;
			this.cropName = cropName;
			this.farmerName = farmerName;
			this.farmerFatherName = farmerFatherName;
			this.cropNumber = cropNumber;
			this.varietyName = varietyName;
			this.aadhaarNo = aadhaarNo;
			this.sownDate = sownDate;
			this.varietyCode = varietyCode;
		}


		public int getBookingId() {
            return bookingId;
        }

        public void setBookingId(int bookingId) {
            this.bookingId = bookingId;
        }

        public int getKhathaNo() {
            return khathaNo;
        }

        public void setKhathaNo(int khathaNo) {
            this.khathaNo = khathaNo;
        }

        public String getSurveyNo() {
            return surveyNo;
        }

        public void setSurveyNo(String surveyNo) {
            this.surveyNo = surveyNo;
        }

        public double getTotalExtent() {
            return totalExtent;
        }

        public void setTotalExtent(double totalExtent) {
            this.totalExtent = totalExtent;
        }

        public String getCropName() {
            return cropName;
        }

        public void setCropName(String cropName) {
            this.cropName = cropName;
        }

        public String getFarmerName() {
            return farmerName;
        }

        public void setFarmerName(String farmerName) {
            this.farmerName = farmerName;
        }

        public String getFarmerFatherName() {
            return farmerFatherName;
        }

        public void setFarmerFatherName(String farmerFatherName) {
            this.farmerFatherName = farmerFatherName;
        }

        public String getCropNumber() {
            return cropNumber;
        }
//
        public void setCropNumber(String cropNumber) {
            this.cropNumber = cropNumber;
        }

        public String getVarietyName() {
            return varietyName;
        }

        public void setVarietyName(String varietyName) {
            this.varietyName = varietyName;
        }

        public String getAadhaarNo() {
            return aadhaarNo;
        }

        public void setAadhaarNo(String aadhaarNo) {
            this.aadhaarNo = aadhaarNo;
        }
        
        public int getCropCode() {
			return cropCode;
		}

		public void setCropCode(int cropCode) {
			this.cropCode = cropCode;
		}
		
		public String getSownDate() {
			return sownDate;
		}

		public void setSownDate(String sownDate) {
			this.sownDate = sownDate;
		}
		
		public String getVarietyCode() {
			return varietyCode;
		}

		public void setVarietyCode(String varietyCode) {
			this.varietyCode = varietyCode;
		}

        

        @Override
		public String toString() {
			return "VroRejectReasonsEntity [bookingId=" + bookingId + ", khathaNo=" + khathaNo + ", cropCode="
					+ cropCode + ", surveyNo=" + surveyNo + ", totalExtent=" + totalExtent + ", cropName=" + cropName
					+ ", farmerName=" + farmerName + ", farmerFatherName=" + farmerFatherName + ", cropNumber="
					+ cropNumber + ", varietyName=" + varietyName + ", aadhaarNo=" + aadhaarNo + ", sownDate="
					+ sownDate + ", varietyCode=" + varietyCode + "]";
		}
    
}
