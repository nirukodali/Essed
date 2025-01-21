package com.ecrops;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class WeblandTestClass {

    public static void main(String[] args) {
        String rofrData = getWeblandData();
        System.out.println("webland Data: " + rofrData);
    }

    public static String getWeblandData() {
        try {
            String token = getKeyValue(); 

            URL url = new URL("http://103.129.75.175/Finalror/AOAV1/Agriculture");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization", "Bearer " + token);

            String inputData = "{\n" +
                    "    \"Ptype\":\"RC\",\n" +
                    "    \"VillageCode\":\"1701009\",\n" +
                    "    \"UserName\":\"NICTEST\",\n" +
                    "    \"Upassword\":\"NICtEST@123\"\n" +
                    "}";

            try (OutputStream os = connection.getOutputStream()) {
                byte[] inputBytes = inputData.getBytes(java.nio.charset.StandardCharsets.UTF_8);
                os.write(inputBytes, 0, inputBytes.length);
            }

            int responseCode = connection.getResponseCode();
            if (responseCode != HttpURLConnection.HTTP_OK) {
                throw new RuntimeException("Failed : HTTP error code : " + responseCode);
            }

            StringBuilder response = new StringBuilder();
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(connection.getInputStream(), java.nio.charset.StandardCharsets.UTF_8))) {
                String line;
                while ((line = br.readLine()) != null) {
                    response.append(line);
                }
            }

            return response.toString();
        } catch (Exception e) {
            throw new RuntimeException("Error fetching Webland data", e);
        }
    }

    public static String getKeyValue() {
        try {
            URL url = new URL("http://103.129.75.175/Finalror/api/Token");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            connection.setRequestProperty("Content-Type", "application/json");

            String input = "{\n" +
                    "    \"un\":\"NICTEST\",\n" +
                    "    \"up\":\"NICtEST@123\"\n" +
                    "}";

            try (OutputStream os = connection.getOutputStream()) {
                byte[] inputBytes = input.getBytes(java.nio.charset.StandardCharsets.UTF_8);
                os.write(inputBytes, 0, inputBytes.length);
            }

            int responseCode = connection.getResponseCode();
            if (responseCode != HttpURLConnection.HTTP_OK) {
                throw new RuntimeException("Failed : HTTP error code : " + responseCode);
            }

            StringBuilder response = new StringBuilder();
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream(), java.nio.charset.StandardCharsets.UTF_8))) {
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
            }

            
            System.out.println("Token API Response: " + response.toString());

            JSONObject json = new JSONObject(response.toString());

            
            if (json.has("Data")) {
                return json.getString("Data");
            } else {
                throw new RuntimeException("Token not found in response: " + response.toString());
            }
        } catch (Exception e) {
            throw new RuntimeException("Error fetching API key", e);
        }
    }
}
