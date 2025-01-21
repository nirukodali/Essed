package com.eseed.service.impl;


import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.io.IOException;
import java.util.Base64;

@Service
public class FileUploadService {
    @PersistenceContext
    private EntityManager entityManager;

    public String convertToBase64(MultipartFile file) throws IOException {
        byte[] fileBytes = file.getBytes();
        return Base64.getEncoder().encodeToString(fileBytes);
    }

    @Transactional
    public String addUploadfiles(int dcode, int cropyear, String season, String ipaddress, String file, String userid) {
        String msg = "";
        String query1 = "INSERT INTO agencycertificates(dcode, cropyear, season, dt_crt, ipaddress, certificate, userid) " +
                "VALUES (?, ?, ?, now(), ?, ?, ?)";

        Query query = entityManager.createNativeQuery(query1);
        query.setParameter(1, dcode);
        query.setParameter(2, cropyear);
        query.setParameter(3, season);
        query.setParameter(4, ipaddress);
        query.setParameter(5, file);
        query.setParameter(6, userid);

        try {
            query.executeUpdate();
            msg = "File uploaded successfully.";
        } catch (Exception e) {
            msg = "Error uploading file: " + e.getMessage();
        }
        return msg;
    }
}
