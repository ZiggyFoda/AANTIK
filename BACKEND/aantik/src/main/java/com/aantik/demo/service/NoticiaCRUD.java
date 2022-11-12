package com.aantik.demo.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aantik.demo.entidad.Noticia;
import com.aantik.demo.model.NoticiaEs;
import com.aantik.demo.repositorio.noticiaRepositorio;


@Service
public class NoticiaCRUD implements NoticiaCRUDLocal{
	
	@Autowired
	noticiaRepositorio repository;

	@Override
	public Noticia crearNoticia(NoticiaEs noti) throws Exception {
		// TODO Auto-generated method stub
	    Date date = new Date();
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	    String fecha = formatter.format(date);
	    int i=0;

	        Noticia notici = new Noticia(noti.titulo, noti.noticia, noti.fuente, fecha, noti.encargado, noti.correo);

	        repository.save(notici);
	        i++;
	    
		
		return null;
	}

	@Override
	public Iterable<Noticia> getAll() {
		// TODO Auto-generated method stub
		Iterable<Noticia> noti =  repository.findAll();
		return noti;
	}

	

	

}
