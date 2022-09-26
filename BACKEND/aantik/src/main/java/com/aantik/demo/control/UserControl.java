package com.aantik.demo.control;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.ArrayList;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.aantik.demo.api.UserAPI;
import com.aantik.demo.entidad.Estudiante;
import com.aantik.demo.entidad.User;
import com.aantik.demo.service.UserCRUD;

@Controller
public class UserControl {

	@Autowired
	UserCRUD userService;
	
	@Autowired
	UserAPI userServiceApi;
	
	private final StorageService storageService = null;

	
	@GetMapping("/test")
    public ArrayList<User> obtenerUsuarios(){
		
        return (ArrayList<User>) userService.getAll();
    }

	
/*	@GetMapping("/test")
	public String ingresoAdm(Model model) {
		
		try {
			User usertest = userService.getUserById((long) 1);
			System.out.println("user name: "+usertest.getUsername());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "test";
	}*/
	
	@GetMapping({"/","/index","/index/{id}"})
	public String index(@PathVariable(required = false)Long id) {
		return "index";
	}

	@PostMapping("/save")
	public ResponseEntity<User> save(@RequestBody User persona) {
		System.out.println("RECIBE:  per"+persona.getUsername());
		User personaAux = new User();
		try {
			personaAux.setUsername("userrr");
			personaAux.setPassword("userrr");
			personaAux.setId((long) 1);
			if(userService.login(persona.getUsername(),persona.getPassword())==true) 
				return new ResponseEntity<User>(personaAux, HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Usuario no existe");
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		//return personaAux;
	}
	
	@PostMapping("/preinscritosFile")
	public void preinscritosFile(@RequestParam("file") MultipartFile fileM) {
		System.out.println(fileM.getSize());
		System.out.println(fileM.toString());
	}

	@GetMapping("/all")
	public ResponseEntity<Estudiante[]> sendStudents() {
		Estudiante est[] = new Estudiante[2];
		try {
			est[0]=new Estudiante();
			est[1]=new Estudiante();
			est[0].setNombre("Pepito Perez");
			est[0].setCorreo("pepitoPe@gmail.com");
			est[0].setTelefono("3123125");
			System.out.println("Enviar estudiante: "+est[0].getNombre());
			est[1].setNombre("Julia Perez");
			est[1].setCorreo("Julia@gmail.com");
			est[1].setTelefono("11122233");
			System.out.println("Enviar estudiante: "+est[1].getNombre());
				return new ResponseEntity<Estudiante[]>(est, HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Usuario no existe"+e);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
}
