package com.aantik.demo.control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.aantik.demo.cargaUsuarios.leerEntidades;
import com.aantik.demo.model.ModOrgSocial;
import com.aantik.demo.service.OrgSocialCRUD;

@Controller
public class orgSocController {
	@Autowired
	OrgSocialCRUD orgScService;
	
	@GetMapping("/orgSCargaM")
	public ResponseEntity<ModOrgSocial[]> cargaStu() {
		ModOrgSocial est[] = new ModOrgSocial[2];
		try {
			ModOrgSocial [] orgLista = new ModOrgSocial[50];
			leerEntidades excelOrg = new leerEntidades();
			FileInputStream fis2;
			try {
				fis2 = new FileInputStream(new File("Datos basicos-formato.xlsx"));			
				excelOrg.getEntidades(fis2,orgLista);
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				orgScService.saveAll(orgLista);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				return new ResponseEntity<ModOrgSocial[]>(est, HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Usuario no existe"+e);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
}
