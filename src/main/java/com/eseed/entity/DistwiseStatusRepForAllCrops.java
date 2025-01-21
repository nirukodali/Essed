package com.eseed.entity;

import java.math.BigDecimal; 

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="distwisestat_")
public class DistwiseStatusRepForAllCrops {
            @Id
			private BigDecimal distcode;
			private String wbdname;
			private Long tmandals;
			private Long tvillages;
			private Long dagri_mandals;
			private Long dagri_villages;
			private BigDecimal dagri_ext;
			private Long dagri_farmers;
			private Long dhorti_mandals;
			private Long dhorti_villages;
			private BigDecimal dhorti_ext;
			private Long dhorti_farmers;
			private Long dseri_mandals;
			private Long dseri_villages;
			private BigDecimal dseri_ext;
			private Long dseri_farmers;
			private Long dsoc_mandals;
			private Long dsoc_villages;
			private BigDecimal dsoc_ext;
			private Long dsoc_farmers;
			public BigDecimal getDistcode() {
				return distcode;
			}
			public void setDistcode(BigDecimal distcode) {
				this.distcode = distcode;
			}
			public String getWbdname() {
				return wbdname;
			}
			public void setWbdname(String wbdname) {
				this.wbdname = wbdname;
			}
			public Long getTmandals() {
				return tmandals;
			}
			public void setTmandals(Long tmandals) {
				this.tmandals = tmandals;
			}
			public Long getTvillages() {
				return tvillages;
			}
			public void setTvillages(Long tvillages) {
				this.tvillages = tvillages;
			}
			public Long getDagri_mandals() {
				return dagri_mandals;
			}
			public void setDagri_mandals(Long dagri_mandals) {
				this.dagri_mandals = dagri_mandals;
			}
			public Long getDagri_villages() {
				return dagri_villages;
			}
			public void setDagri_villages(Long dagri_villages) {
				this.dagri_villages = dagri_villages;
			}
			public BigDecimal getDagri_ext() {
				return dagri_ext;
			}
			public void setDagri_ext(BigDecimal dagri_ext) {
				this.dagri_ext = dagri_ext;
			}
			public Long getDagri_farmers() {
				return dagri_farmers;
			}
			public void setDagri_farmers(Long dagri_farmers) {
				this.dagri_farmers = dagri_farmers;
			}
			public Long getDhorti_mandals() {
				return dhorti_mandals;
			}
			public void setDhorti_mandals(Long dhorti_mandals) {
				this.dhorti_mandals = dhorti_mandals;
			}
			public Long getDhorti_villages() {
				return dhorti_villages;
			}
			public void setDhorti_villages(Long dhorti_villages) {
				this.dhorti_villages = dhorti_villages;
			}
			public BigDecimal getDhorti_ext() {
				return dhorti_ext;
			}
			public void setDhorti_ext(BigDecimal dhorti_ext) {
				this.dhorti_ext = dhorti_ext;
			}
			public Long getDhorti_farmers() {
				return dhorti_farmers;
			}
			public void setDhorti_farmers(Long dhorti_farmers) {
				this.dhorti_farmers = dhorti_farmers;
			}
			public Long getDseri_mandals() {
				return dseri_mandals;
			}
			public void setDseri_mandals(Long dseri_mandals) {
				this.dseri_mandals = dseri_mandals;
			}
			public Long getDseri_villages() {
				return dseri_villages;
			}
			public void setDseri_villages(Long dseri_villages) {
				this.dseri_villages = dseri_villages;
			}
			public BigDecimal getDseri_ext() {
				return dseri_ext;
			}
			public void setDseri_ext(BigDecimal dseri_ext) {
				this.dseri_ext = dseri_ext;
			}
			public Long getDseri_farmers() {
				return dseri_farmers;
			}
			public void setDseri_farmers(Long dseri_farmers) {
				this.dseri_farmers = dseri_farmers;
			}
			public Long getDsoc_mandals() {
				return dsoc_mandals;
			}
			public void setDsoc_mandals(Long dsoc_mandals) {
				this.dsoc_mandals = dsoc_mandals;
			}
			public Long getDsoc_villages() {
				return dsoc_villages;
			}
			public void setDsoc_villages(Long dsoc_villages) {
				this.dsoc_villages = dsoc_villages;
			}
			public BigDecimal getDsoc_ext() {
				return dsoc_ext;
			}
			public void setDsoc_ext(BigDecimal dsoc_ext) {
				this.dsoc_ext = dsoc_ext;
			}
			public Long getDsoc_farmers() {
				return dsoc_farmers;
			}
			public void setDsoc_farmers(Long dsoc_farmers) {
				this.dsoc_farmers = dsoc_farmers;
			}
			
			
}			