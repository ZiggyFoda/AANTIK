package com.aantik.demo.tejido;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.aantik.demo.model.CIIU;

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
		*/
		CIIU [] CIIUlista = new CIIU[500];
		leerExcelBench tejido = new leerExcelBench();
		FileInputStream fis2;
		try {
			fis2 = new FileInputStream(new File("Enfasis   Cadena de Suministro.xlsx"));
			//tejido.leerTejido(fis2,CIIUlista);
			tejido.getActividad(fis2,"302.0");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
