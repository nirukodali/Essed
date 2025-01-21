package com.eseed.dto;



import java.util.List;

public class ProductPriceUpdateDto {
    private String seasonname;
    private String cropYear;
    private String seedvariety;
    private List<EditedRow> updatedData;

    // Getters and Setters
    public String getSeasonname() {
        return seasonname;
    }

    public void setSeasonname(String seasonname) {
        this.seasonname = seasonname;
    }

    
    public String getSeedvariety() {
		return seedvariety;
	}

	public void setSeedvariety(String seedvariety) {
		this.seedvariety = seedvariety;
	}

	public List<EditedRow> getUpdatedData() {
        return updatedData;
    }

    public void setUpdatedData(List<EditedRow> updatedData) {
        this.updatedData = updatedData;
    }

    
    
    
    public String getCropYear() {
		return cropYear;
	}

	public void setCropYear(String cropYear) {
		this.cropYear = cropYear;
	}




	// Inner class to represent each row that gets updated
    public static class EditedRow {
        private String product_price;
        private String subsidy_amt;
        private String nonsubsidy_amt;
        private String fromdate;
        private String todate;
      
        private String quantityperbag;
        private String active;
        private Integer dcode;
        private String varietycode;

        private String  payment_from_dt;
        private String   payment_close_dt;
        private String   dist_from_dt;
        private String     dist_close_dt;
        
        
        
        // Getters and Setters
        public String getProduct_price() {
            return product_price;
        }

        public void setProduct_price(String product_price) {
            this.product_price = product_price;
        }

        public String getSubsidy_amt() {
            return subsidy_amt;
        }

        public void setSubsidy_amt(String subsidy_amt) {
            this.subsidy_amt = subsidy_amt;
        }

        public String getNonsubsidy_amt() {
            return nonsubsidy_amt;
        }

        public void setNonsubsidy_amt(String nonsubsidy_amt) {
            this.nonsubsidy_amt = nonsubsidy_amt;
        }

        public String getFromdate() {
            return fromdate;
        }

        public void setFromdate(String fromdate) {
            this.fromdate = fromdate;
        }

        public String getTodate() {
            return todate;
        }

        public void setTodate(String todate) {
            this.todate = todate;
        }

        public String getQuantityperbag() {
            return quantityperbag;
        }

        public void setQuantityperbag(String quantityperbag) {
            this.quantityperbag = quantityperbag;
        }

        public String getActive() {
            return active;
        }

        public void setActive(String active) {
            this.active = active;
        }

		public Integer getDcode() {
			return dcode;
		}

		public void setDcode(Integer dcode) {
			this.dcode = dcode;
		}

		public String getVarietycode() {
			return varietycode;
		}

		public void setVarietycode(String varietycode) {
			this.varietycode = varietycode;
		}

		public String getPayment_from_dt() {
			return payment_from_dt;
		}

		public void setPayment_from_dt(String payment_from_dt) {
			this.payment_from_dt = payment_from_dt;
		}

		public String getPayment_close_dt() {
			return payment_close_dt;
		}

		public void setPayment_close_dt(String payment_close_dt) {
			this.payment_close_dt = payment_close_dt;
		}

		public String getDist_from_dt() {
			return dist_from_dt;
		}

		public void setDist_from_dt(String dist_from_dt) {
			this.dist_from_dt = dist_from_dt;
		}

		public String getDist_close_dt() {
			return dist_close_dt;
		}

		public void setDist_close_dt(String dist_close_dt) {
			this.dist_close_dt = dist_close_dt;
		}

		@Override
		public String toString() {
			return "EditedRow [product_price=" + product_price + ", subsidy_amt=" + subsidy_amt + ", nonsubsidy_amt="
					+ nonsubsidy_amt + ", fromdate=" + fromdate + ", todate=" + todate + ", quantityperbag="
					+ quantityperbag + ", active=" + active + ", dcode=" + dcode + ", varietycode=" + varietycode
					+ ", payment_from_dt=" + payment_from_dt + ", payment_close_dt=" + payment_close_dt
					+ ", dist_from_dt=" + dist_from_dt + ", dist_close_dt=" + dist_close_dt + ", getProduct_price()="
					+ getProduct_price() + ", getSubsidy_amt()=" + getSubsidy_amt() + ", getNonsubsidy_amt()="
					+ getNonsubsidy_amt() + ", getFromdate()=" + getFromdate() + ", getTodate()=" + getTodate()
					+ ", getQuantityperbag()=" + getQuantityperbag() + ", getActive()=" + getActive() + ", getDcode()="
					+ getDcode() + ", getVarietycode()=" + getVarietycode() + ", getPayment_from_dt()="
					+ getPayment_from_dt() + ", getPayment_close_dt()=" + getPayment_close_dt() + ", getDist_from_dt()="
					+ getDist_from_dt() + ", getDist_close_dt()=" + getDist_close_dt() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}

		
    }

	@Override
	public String toString() {
		return "ProductPriceUpdateDto [seasonname=" + seasonname + ", updatedData=" + updatedData + "]";
	}
    
    
}
