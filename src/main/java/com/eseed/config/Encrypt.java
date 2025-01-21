package com.eseed.config;
import java.security.MessageDigest;



import org.springframework.stereotype.Service;

@Service

public class Encrypt {

	private String passwd1;

	private String passwd2;

	private String setSha256Password;

	public String setSha256Password(String sha256Password) {

		this.setSha256Password = sha256Password;

		try {

			MessageDigest md = MessageDigest.getInstance("SHA-256");

			md.update(sha256Password.getBytes());

			byte byteData[] = md.digest();

			// convert the byte to hex format method 1

			StringBuffer hexString = new StringBuffer();

			for (int i = 0; i < byteData.length; i++) {

				hexString.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));

			}

			sha256Password = hexString.toString();

			System.out.println("sha--->" + sha256Password);

		} catch (java.security.NoSuchAlgorithmException e) {

		}

		return sha256Password;

	}

	public void setPasswd1(String passwd) {

		this.passwd1 = passwd;

		try {

			MessageDigest md = MessageDigest.getInstance("MD5");

			md.update(passwd.getBytes());

			byte[] digest = md.digest();

			StringBuffer hexString = new StringBuffer();

			for (int i = 0; i < digest.length; i++) {

				passwd = Integer.toHexString(0xFF & digest[i]);

				if (passwd.length() < 2) {

					passwd = "0" + passwd;

				}

				hexString.append(passwd);

			}

			passwd1 = hexString.toString();

		} catch (java.security.NoSuchAlgorithmException e) {

		}

	}

	public void setPasswd2(String passwd) {

		this.passwd2 = passwd;

		try {

			MessageDigest md = MessageDigest.getInstance("MD5");

			md.update(passwd.getBytes());

			byte[] digest = md.digest();

			StringBuffer hexString = new StringBuffer();

			for (int i = 0; i < digest.length; i++) {

				passwd = Integer.toHexString(0xFF & digest[i]);

				if (passwd.length() < 2) {

					passwd = "0" + passwd;

				}

				hexString.append(passwd);

			}

			passwd2 = hexString.toString();

		} catch (java.security.NoSuchAlgorithmException e) {

		}

	}

	public String getPasswd1() {

		return passwd1;

	}

	public String getPasswd2() {

		return passwd2;

	}

	public String getSetSha256Password() {

		return setSha256Password;

	}

}
