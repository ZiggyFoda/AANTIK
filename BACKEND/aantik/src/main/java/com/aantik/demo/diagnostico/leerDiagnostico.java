package com.aantik.demo.diagnostico;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.aantik.demo.model.tejidoSocial;

public class leerDiagnostico {

	public int leerTejido(InputStream is,tejidoSocial[] lista) {
	    try {
	      Workbook workbook = new XSSFWorkbook(is);
	      Sheet sheet = workbook.getSheetAt(3);
	      Iterator<Row> rows = sheet.iterator();
	      Sheet sheet2=workbook.getSheetAt(3);   //getting the XSSFSheet object at given index  
		  int colNumber = sheet2.getRow(1).getPhysicalNumberOfCells();
	      //System.out.println("xcol: "+colNumber);	   
	      int rowNumber = 0, cant=0;	      
	      while (rows.hasNext()) {

		    
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
	          lista[cant]=new tejidoSocial();
	          if(cell!=null) {
		          if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
		        	  value2= String.valueOf(cell.getNumericCellValue());
		          else
			  	      value2= String.valueOf(cell.getStringCellValue());
		          if(value2.length()!=0) {
		        	  if (value2.equals("x")||value2.equals("X")) {
		        		  lista[cant].emprenOrigen= (long)(row.getCell(3).getNumericCellValue());
		        		  lista[cant].emprenDest=(long)(sheet2.getRow(3).getCell(cellIdx).getNumericCellValue());
		        		  String idpi=lista[cant].emprenOrigen.toString()+lista[cant].emprenDest.toString();
		        		  lista[cant].id=(long) Float.parseFloat(idpi);
		        		  //System.out.println("Origen: "+lista[cant].emprenOrigen+
			        			//  " destino: "+lista[cant].emprenDest+" id: "+lista[cant].id); 
		        		  cant++;
		        	  }
			        	  
		        	  
		          }	          
	          }	        	  
	          cellIdx++;
	       }

	    }

    	 // System.out.println("CLOSE: "+cant);	
	      return cant;
	    } catch (IOException e) {
	      throw new RuntimeException("fail to parse Excel file: " + e.getMessage());
	    }
	  }
	
}
