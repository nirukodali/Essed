//package com.ecrops;
//
//import java.nio.charset.StandardCharsets;
//import java.security.MessageDigest;
//import java.security.NoSuchAlgorithmException;
//
//import com.ecrops.config.CustomPasswordEncoder;
//
//public class TestJava {
//
//	public static void main(String as[])throws Exception {
////		CustomPasswordEncoder t=new CustomPasswordEncoder();
////		String str="8177da925c9dccb757ae4611dc3e58a4";
////		System.out.println(t.encode(str));
//
//		String originalString = "8177da925c9dccb757ae4611dc3e58a4";
//
//		final MessageDigest digest = MessageDigest.getInstance("SHA-256");
//		final byte[] hashbytes = digest.digest(originalString.getBytes(StandardCharsets.UTF_8));
//		String sha256hex = new String(bytesToHex(hashbytes));
//		
//		System.out.println(sha256hex);
//	}
//	
//	public String encryptSha256Str(String password) throws NoSuchAlgorithmException {
//		final MessageDigest digest = MessageDigest.getInstance("SHA-256");
//		final byte[] hashbytes = digest.digest(password.getBytes(StandardCharsets.UTF_8));
//		return new String(bytesToHex(hashbytes));
//	}
//
//	private static String bytesToHex(byte[] hash) {
//		StringBuilder hexString = new StringBuilder(2 * hash.length);
//		for (int i = 0; i < hash.length; i++) {
//			String hex = Integer.toHexString(0xff & hash[i]);
//			if (hex.length() == 1) {
//				hexString.append('0');
//			}
//			hexString.append(hex);
//		}
//		return hexString.toString();
//	}
//
//}
