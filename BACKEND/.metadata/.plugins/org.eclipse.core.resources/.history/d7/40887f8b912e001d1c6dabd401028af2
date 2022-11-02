package com.aantik.demo.control;

import java.net.URI;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.aantik.demo.api.UserAPI;
import com.aantik.demo.entidad.User;
import com.aantik.demo.entidad.UserCRUD;

@Controller
public class UserControl {

	@Autowired
	UserCRUD userService;
	
	@Autowired
	UserAPI userServiceApi;
	
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
}
