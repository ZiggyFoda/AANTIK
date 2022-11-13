package com.aantik.demo.control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.aantik.demo.cargaUsuarios.leerEmprendimientos;
import com.aantik.demo.model.ModEmprendimiento;
import com.aantik.demo.service.OrgSocialCRUD;

@Controller
public class orgSocController {
	@Autowired
	OrgSocialCRUD orgScService;
	
	@GetMapping("/orgSCargaM")
	public ResponseEntity<ModEmprendimiento[]> cargaStu() {
		ModEmprendimiento est[] = new ModEmprendimiento[2];
		try {
			ModEmprendimiento [] empLista = new ModEmprendimiento[500];
			leerEmprendimientos excelEmp = new leerEmprendimientos();
			FileInputStream fis2;
			try {
				fis2 = new FileInputStream(new File("Datos basicos-formato.xlsx"));
				excelEmp.getEmprendimientos(fis2,empLista);
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				orgScService.saveAll(empLista);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				return new ResponseEntity<ModEmprendimiento[]>(est, HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Usuario no existe"+e);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
}
