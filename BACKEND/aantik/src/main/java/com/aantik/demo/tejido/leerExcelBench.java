package com.aantik.demo.tejido;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.springframework.web.multipart.MultipartFile;

public class leerExcelBench {
	public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
	  static String SHEET = "MATRIZ ACTIVIDADES RELACIONES P";

	  public static boolean hasExcelFormat(MultipartFile file) {

	    if (!TYPE.equals(file.getContentType())) {
	      return false;
	    }

	    return true;
	  }

	  public void excelToTutorials(InputStream is) {
	    try {
	      Workbook workbook = new XSSFWorkbook(is);
	      Sheet sheet = workbook.getSheetAt(3);
	      Iterator<Row> rows = sheet.iterator();
	      Sheet sheet2=workbook.getSheetAt(3);   //getting the XSSFSheet object at given index  
		  int colNumber = sheet2.getRow(1).getPhysicalNumberOfCells();
	      System.out.println("xcol: "+colNumber);	   
	      int rowNumber = 0;
	      while (rows.hasNext()) {

	        // skip header
	        rowNumber++;
	        Row row=sheet2.getRow(rowNumber);  //returns the logical row      
	          if(row==null) {
	        	  break;
	          }
	        Cell cell; 
	         //getting the cell representing the given column     //getting cell value  
	        int cellIdx = 0;
	        String value2;
	        while (cellIdx<colNumber) {
	          cell=row.getCell(cellIdx);

	          if(cell!=null) {
		          if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
		        	  value2= String.valueOf(cell.getNumericCellValue());
		          else
			  	      value2= String.valueOf(cell.getStringCellValue());
		          if(value2.length()!=0) {
		        	  if (value2.equals("x")||value2.equals("X"))
			        	  System.out.println("Origen: grupo: "+row.getCell(2)+
			        			  " codigo: "+row.getCell(3)+" destino: grupo:"
			        	  +sheet2.getRow(2).getCell(cellIdx)+
			        	  " codigo: "+sheet2.getRow(3).getCell(cellIdx)); 
		        	//  System.out.println("val---"+value2); 
		          }	          
	          }	        	  
	          cellIdx++;
	       }

	    }

    	  System.out.println("CLOSE: ");	
	      return;
	    } catch (IOException e) {
	      throw new RuntimeException("fail to parse Excel file: " + e.getMessage());
	    }
	  }
}
