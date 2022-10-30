package com.aantik.demo.control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.aantik.demo.entidad.CIIU;
import com.aantik.demo.model.tejidoSocial;
import com.aantik.demo.model.ModCiiuXemp;
import com.aantik.demo.model.RedTejido;
import com.aantik.demo.service.CiiuCRUD;
import com.aantik.demo.service.TejidoCRUD;
import com.aantik.demo.tejido.leerExcelTejido;

@Controller
public class TejidoControl {
	@Autowired
	CiiuCRUD servCiiu;
	@Autowired
	TejidoCRUD servRed;
	
	@GetMapping("/prueba")
	public ResponseEntity<CIIU[]> sendCiiu() {
		CIIU est[] = new CIIU[2];
		try {
			com.aantik.demo.model.CIIU [] CIIUlista = new com.aantik.demo.model.CIIU[500];
			tejidoSocial [] redTejido = new tejidoSocial[2000];
			leerExcelTejido tejido = new leerExcelTejido();
			ModCiiuXemp[] cruzar=new ModCiiuXemp[500];
			FileInputStream fis2;
			int cant=0,cantRed=0,cant2 = 0;
			try {
				fis2 = new FileInputStream(new File("Enfasis   Cadena de Suministro.xlsx"));
				cant=tejido.getDatosCiiu(fis2,CIIUlista);
				fis2 = new FileInputStream(new File("Enfasis   Cadena de Suministro.xlsx"));
				tejido.getActividad(fis2,CIIUlista,cant);
				fis2 = new FileInputStream(new File("Enfasis   Cadena de Suministro.xlsx"));
				cantRed=tejido.leerTejido(fis2,redTejido);
				fis2 = new FileInputStream(new File("Enfasis   Cadena de Suministro.xlsx"));
				cant2=tejido.getCuzeInf(fis2,cruzar);
				System.out.println(cant2);
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				System.out.println("Actualizando "+cant+" datos cod CIIU");
				servCiiu.saveAll(CIIUlista,cant);
				System.out.println("Actualizando "+cant+" datos cod CIIU por emprendimineto");
				servCiiu.saveAll2(cruzar,cant2);
				System.out.println("Actualizando "+cantRed+" red tejido por codigos CIIU");
				servRed.saveAll(redTejido,cantRed);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				return new ResponseEntity<CIIU[]>(est, HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Usuario no existe"+e);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	

	@GetMapping("/pruebaRed")
	public ResponseEntity<RedTejido> hacerTejido() {
		RedTejido red = new RedTejido();
		try {
			com.aantik.demo.model.CIIU [] CIIUlista = new com.aantik.demo.model.CIIU[500];
			tejidoSocial [] redTejido = new tejidoSocial[2000];
			leerExcelTejido tejido = new leerExcelTejido();
			FileInputStream fis2;
			int cant=0,cantRed=0;
			try {
				fis2 = new FileInputStream(new File("Enfasis   Cadena de Suministro.xlsx"));
				cant=tejido.getDatosCiiu(fis2,CIIUlista);
				fis2 = new FileInputStream(new File("Enfasis   Cadena de Suministro.xlsx"));
				tejido.getActividad(fis2,CIIUlista,cant);
				fis2 = new FileInputStream(new File("Enfasis   Cadena de Suministro.xlsx"));
				cantRed=tejido.leerTejido(fis2,redTejido);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		try {
			System.out.println("Actualizando "+cant+" datos");
			servCiiu.saveAll(CIIUlista,cant);
			System.out.println("Actualizando "+cantRed+" red tejido");
			servRed.saveAll(redTejido,cantRed);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return new ResponseEntity<RedTejido>(red, HttpStatus.OK);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.out.println("Usuario no existe"+e);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
	}
	}
}
