package com.aantik.demo.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.aantik.demo.entidad.BenchmarkingIndica;
import com.aantik.demo.repositorio.BenchPregunRepository;
import com.aantik.demo.service.BenchmarkingExcelReader;
import com.aantik.demo.repositorio.PreguntasRepository;

@Service
public class BenchmarkingExcelService {
    
    @Autowired
    BenchPregunRepository repository;

    @Autowired
    PreguntasRepository Rerepository;

    public void save(MultipartFile file) {
        try {
          List<BenchmarkingIndica> tutorials = BenchmarkingExcelReader.excelToTutorials(file.getInputStream());
          repository.saveAll(tutorials);

        } catch (IOException e) {
          throw new RuntimeException("fail to store excel data: " + e.getMessage());
        }
      }
    
      public List<BenchmarkingIndica> getAllTutorials() {
        return repository.findAll();
      }


}
