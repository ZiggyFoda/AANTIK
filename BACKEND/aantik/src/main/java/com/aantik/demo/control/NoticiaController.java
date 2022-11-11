package com.aantik.demo.control;


import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

//import javax.validation.Valid;

import org.apache.logging.log4j.message.StringFormattedMessage;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

import net.bytebuddy.utility.RandomString;

import com.aantik.demo.model.NoticiaEs;

@CrossOrigin(origins = "*", maxAge = 3600)

@Controller

//RequestMapping("/datos")

public class NoticiaController {
    @PostMapping("/noticiaEs")
    public ResponseEntity<?> processForgotPassword(@RequestBody NoticiaEs update) {

    System.out.println("Tit: " + update.getTitulo());
    
    
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
     String fecha = formatter.format(date);
    System.out.println("Current date: "+ fecha); 
    
    System.out.println("Encargado: " + update.getEncargado());
    
    update.setFecha(fecha);


    return ResponseEntity.ok("ok");
    }
    


}