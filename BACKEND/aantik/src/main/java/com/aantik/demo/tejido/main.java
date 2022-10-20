package com.aantik.demo.tejido;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

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
		leerExcelBench bench = new leerExcelBench();
		FileInputStream fis2;
		try {
			fis2 = new FileInputStream(new File("Enfasis   Cadena de Suministro.xlsx"));
			bench.excelToTutorials(fis2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
