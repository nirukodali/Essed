package com.eseed.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import groovy.transform.ToString;

@Entity
@Table(name="agencycertificates")
public class CertificatesFAL{

				@Id
				
				private String certificate;
				
				
				CertificatesFAL(){}
				public String getCertificate() {
					return certificate;
				}
				public void setCertificate(String certificate) {
					this.certificate = certificate;
				}
				@Override
				public String toString() {
					return "CertificatesFAL [certificate=" + certificate + ", getCertificate()=" + getCertificate()
							+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
							+ super.toString() + "]";
				}
				
				
				
				
				
	}				
	