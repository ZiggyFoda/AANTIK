package com.aantik.demo.control;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.aantik.demo.model.NoticiaEs;
import com.aantik.demo.entidad.Noticia;
import com.aantik.demo.repositorio.noticiaRepositorio;

@CrossOrigin(origins = "*", maxAge = 3600)

@Controller

//RequestMapping("/datos")

public class NoticiaController {
	@Autowired private noticiaRepositorio noticiaRepositorio;
    @PostMapping("/noticiaEs")
    public ResponseEntity<?> processForgotPassword(@RequestBody NoticiaEs update) {

    System.out.println("Tit: " + update.titulo);
    
    
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
     String fecha = formatter.format(date);
    System.out.println("Current date: "+ fecha); 
    
    System.out.println("Encargado: " + update.encargado);
    
    update.fecha=fecha;
    
    Noticia noticia = new Noticia(update.id, update.titulo, update.noticiaa, update.fuente, update.fecha, update.encargado,update.correo);

    noticiaRepositorio.save(noticia);
    
    return ResponseEntity.ok("ok");
    
    }
    


}