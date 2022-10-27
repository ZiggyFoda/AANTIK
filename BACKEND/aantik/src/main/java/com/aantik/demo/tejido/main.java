package com.aantik.demo.tejido;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;

import com.aantik.demo.model.CIIU;
import com.aantik.demo.model.tejidoSocial;
import com.aantik.demo.service.CiiuCRUD;

public class main {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*leerExcel excel = new leerExcel();
		FileInputStream fis;
		try {
			fis = new FileInputStream(new File("Preinscritos.xlsx"));
			excel.excelToTutorials(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	//	MATRIZ ACTIVIDADES RELACIONES P

		tejidoSocial [] redTejido = new tejidoSocial[2000];
		leerExcelBench tejido = new leerExcelBench();
		FileInputStream fis2;
		try {
			fis2 = new FileInputStream(new File("Enfasis   Cadena de Suministro.xlsx"));
			int cant=tejido.leerTejido(fis2,redTejido);
			System.out.println("cantidad datos= "+redTejido[cant-1].emprenDest);
			System.out.println("cantidad datos= "+cant);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/		CIIU [] CIIUlista = new CIIU[500];
		leerExcelBench tejido = new leerExcelBench();
		FileInputStream fis2;
		try {
			fis2 = new FileInputStream(new File("Enfasis   Cadena de Suministro.xlsx"));
			//tejido.leerTejido(fis2,CIIUlista);
			int cant=tejido.getDatosCiiu(fis2,CIIUlista);
			fis2 = new FileInputStream(new File("Enfasis   Cadena de Suministro.xlsx"));
			tejido.getActividad(fis2,CIIUlista,cant);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println("CIU dato: "+CIIUlista[13].actividad+"-"+CIIUlista[13].agrupacion+"-"+CIIUlista[13].descripcion);
	}

}