package com.aantik.demo.control;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.aantik.demo.HelperClassServices.ResponseMessage;
import com.aantik.demo.entidad.PreguntasModeloB;
import com.aantik.demo.service.BenchmarkingExcelReader;
import com.aantik.demo.service.BenchmarkingExcelService;
import com.aantik.demo.service.PreguntaExcelService;
import com.aantik.demo.service.PreguntasExcelReader;
import com.aantik.demo.repositorio.PreguntasRepository;

@CrossOrigin("http://localhost:8081")
@Controller
@RequestMapping("/api/benchmarking")
public class BenchmarkingController {
    
    @Autowired
    PreguntaExcelService fileService;

    @Autowired
    BenchmarkingExcelService BenfileService;

    @Autowired
    PreguntasRepository tt;

    @PostMapping("/upload")
  public ResponseEntity<ResponseMessage> uploadFileDef(@RequestParam("file") MultipartFile file) {
    String message = "";

    if (PreguntasExcelReader.hasExcelFormat(file)) {
      try {
        fileService.save(file);
        BenfileService.save(file);
        message = "Uploaded the file successfully: " + file.getOriginalFilename();
        return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
      } catch (Exception e) {
        message = "Could not upload the file: " + file.getOriginalFilename() + "!";
        return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
      }
    }

    message = "Please upload an excel file!";
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage(message));
  }

  @PostMapping("/uploadInd")
  public ResponseEntity<ResponseMessage> uploadFileInd(@RequestParam("file") MultipartFile file) {
    String message = "";

    if (PreguntasExcelReader.hasExcelFormat(file)) {
      try {
        BenfileService.save(file);

        message = "Uploaded the file successfully: " + file.getOriginalFilename();
        return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
      } catch (Exception e) {
        message = "Could not upload the file: " + file.getOriginalFilename() + "!";
        return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
      }
    }

    message = "Please upload an excel file!";
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage(message));
  }




  
}
