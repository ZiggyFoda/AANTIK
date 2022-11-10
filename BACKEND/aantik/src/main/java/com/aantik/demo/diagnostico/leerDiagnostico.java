package com.aantik.demo.diagnostico;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.aantik.demo.model.ModConTable;
import com.aantik.demo.model.ModInfoPregunta;
import com.aantik.demo.model.ModRubrica;
import com.aantik.demo.model.ModeloPregunta;
import com.aantik.demo.model.convenciones;

public class leerDiagnostico {
	
	public int leerConvenciones(InputStream is, convenciones conven) {
	    try {	      
	      Workbook workbook = new XSSFWorkbook(is);
	      Sheet sheet = workbook.getSheetAt(2);
	      Iterator<Row> rows = sheet.iterator();
		  int colNumber = sheet.getRow(1).getPhysicalNumberOfCells();
		  int auxRow= sheet.getLastRowNum();
	      int rowNumber = 0, cant=0;
	      conven.AreaFuncional=new ModConTable[auxRow];
	      conven.CargoResp=new ModConTable[auxRow];
	      conven.VarOrga=new ModConTable[auxRow];
	      conven.NivelScor=new ModConTable[auxRow];
	      System.out.println("xcol: "+colNumber+" rows "+auxRow);	   	      
	      while (rows.hasNext()) {

		    
	        rowNumber++;
	        Row row=sheet.getRow(rowNumber);  //returns the logical row      
	          if(row==null) {
	        	  break;
	          }
	        Cell cell; 
	         //getting the cell representing the given column     //getting cell value  
	        int cellIdx = 0;
	        String value2;
		    conven.AreaFuncional[rowNumber-1]=new ModConTable();
		    conven.CargoResp[rowNumber-1]=new ModConTable();
		    conven.VarOrga[rowNumber-1]=new ModConTable();
		    conven.NivelScor[rowNumber-1]=new ModConTable();
	        while (cellIdx<colNumber) {
	          cell=row.getCell(cellIdx);
	          if(cell!=null) {
		          if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
		        	  value2= String.valueOf(cell.getNumericCellValue());
		          else
			  	      value2= String.valueOf(cell.getStringCellValue());
		          if(value2.length()!=0) {
		        	  
		        	  if (cellIdx==0 || cellIdx==1) {
		        		 // System.out.println("AREA FUNCIONAL");
		        	      if(cellIdx==0)
		        	    	 conven.AreaFuncional[rowNumber-1].id=(int) Double.parseDouble(value2);
		        	      else
		        	    	  conven.AreaFuncional[rowNumber-1].titulo=value2;		        	    	  
		        	  }else if (cellIdx==3 || cellIdx==4) {
		        		 // System.out.println("cargo");
		        		  if(cellIdx==3)
		        	    	 conven.CargoResp[rowNumber-1].id=(int) Double.parseDouble(value2);
		        	      else
		        	    	  conven.CargoResp[rowNumber-1].titulo=value2;	
		        	  }else if (cellIdx==6 || cellIdx==7) {
		        		 // System.out.println("variable org");
		        		  if(cellIdx==6)
		        	    	 conven.VarOrga[rowNumber-1].id=(int) Double.parseDouble(value2);
		        	      else
		        	    	  conven.VarOrga[rowNumber-1].titulo=value2;	
		        	  }else if (cellIdx==9 || cellIdx==10) {
		        		 // System.out.println("nivel scor");
		        		  if(cellIdx==9)
		        	    	 conven.NivelScor[rowNumber-1].id=(int) Double.parseDouble(value2);
		        	      else
		        	    	  conven.NivelScor[rowNumber-1].titulo=value2;	
		        	  }
		        	 // System.out.println("dato "+value2+" cant "+cellIdx+" row "+rowNumber);		        	  
		          }	           
	          }	    	  
	          cellIdx++;
	       }

	    }

    	 // System.out.println("CLOSE: "+cant);	
	      return auxRow;
	    } catch (IOException e) {
	      throw new RuntimeException("fail to parse Excel file: " + e.getMessage());
	    }
	  }

	public int leerInfoPreg(InputStream is, ModInfoPregunta[] infoPreg) {
		try {	      
		  Workbook workbook = new XSSFWorkbook(is);
		  Sheet sheet = workbook.getSheetAt(3);
		  Iterator<Row> rows = sheet.iterator();
		  int colNumber = sheet.getRow(1).getPhysicalNumberOfCells();
		  int auxRow= sheet.getLastRowNum();
		  int rowNumber = 0, cant=0;
		  infoPreg=new ModInfoPregunta[auxRow];
		  System.out.println("xcol: "+colNumber+" rows "+auxRow);	   	      
		  while (rows.hasNext()) {
		
		    
		    rowNumber++;
		    Row row=sheet.getRow(rowNumber);  //returns the logical row      
		  if(row==null) {
			  break;
		  }
		Cell cell; 
		 //getting the cell representing the given column     //getting cell value  
		int cellIdx = 0;
		String value2;
		infoPreg[rowNumber-1]=new ModInfoPregunta();
		while (cellIdx<colNumber) {
		  cell=row.getCell(cellIdx);
		  if(cell!=null) {
		      if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
		    	  value2= String.valueOf(cell.getNumericCellValue());
		      else
		  	      value2= String.valueOf(cell.getStringCellValue());
		      if(value2.length()!=0) {
		    	  
		    	  if (cellIdx==0) {
		    		  infoPreg[rowNumber-1].idAreaF=(int) Double.parseDouble(value2);        	    	  
				  }else if (cellIdx==2) {
		    		  infoPreg[rowNumber-1].idCargoR=(int) Double.parseDouble(value2);					  
				  }else if (cellIdx==4) {
		    		  infoPreg[rowNumber-1].idVarOrg=(int) Double.parseDouble(value2);		
				  }else if (cellIdx==6) {
		    		  infoPreg[rowNumber-1].idNivScor=(int) Double.parseDouble(value2);	
				  }else if (cellIdx==8) {
		    		  infoPreg[rowNumber-1].numeroPregunta=(int) Double.parseDouble(value2);	
				  }else if (cellIdx==11) {
		    		  infoPreg[rowNumber-1].pregunta=value2;	
				  }
		  //System.out.println("dato "+value2+" cant "+cellIdx+" row "+rowNumber);		        	  
		          }	           
		      }	    	  
		      cellIdx++;
		   }
		
		}
		 // System.out.println("CLOSE: "+cant);	
		  return auxRow;
		} catch (IOException e) {
		  throw new RuntimeException("fail to parse Excel file: " + e.getMessage());
		}
	}

	public int leerPreg(InputStream is, ModeloPregunta[] preguntas) {
		try {	      
		  Workbook workbook = new XSSFWorkbook(is);
		  Sheet sheet = workbook.getSheetAt(5);
		  Iterator<Row> rows = sheet.iterator();
		  int colNumber = sheet.getRow(1).getPhysicalNumberOfCells();
		  int auxRow= -1;
		  int rowNumber = 0, cant=0;
		  String codigo=null;	
		  System.out.println("xcol: "+colNumber);	   	      
		  while (rows.hasNext()) {
		
		    
		    rowNumber++;
		    Row row=sheet.getRow(rowNumber);  //returns the logical row      
		  if(row==null) {
			  break;
		  }
		Cell cell; 
		 //getting the cell representing the given column     //getting cell value  
		int cellIdx = 0;
		String value2;	//infoPreg[rowNumber-1]=new ModInfoPregunta();
		while (cellIdx<colNumber) {
		  cell=row.getCell(cellIdx);
		  if(cell!=null) {
		      if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
		    	  value2= String.valueOf(cell.getNumericCellValue());
		      else
		  	      value2= String.valueOf(cell.getStringCellValue());
		      if(String.valueOf(row.getCell(0).getStringCellValue()).length()!=0) {
		    	  codigo=String.valueOf(row.getCell(0).getStringCellValue());
		    	  cant=0;
		    	  if(cellIdx==0) {
		    		  auxRow++;
					 preguntas[auxRow]=new ModeloPregunta();
		    	  }
		    		  
		      }
		      if(value2.length()!=0) {
		    	  preguntas[auxRow].rub[cant]=new ModRubrica();
		    	  if (cellIdx==0) {
		    		  preguntas[auxRow].codigo=value2;        	    	  
				  }else if (cellIdx==1) {
					  preguntas[auxRow].pregunta=value2;					  
				  }else if (cellIdx==2) {
					  preguntas[auxRow].insump=value2;		
				  }else if (cellIdx==3) {
					  preguntas[auxRow].rub[cant].cuanti=(int) Double.parseDouble(value2);
					  if((int) Double.parseDouble(value2)==2)
					  	preguntas[auxRow].automatica=true;	
				  }else if (cellIdx==4) {
					  preguntas[auxRow].rub[cant].rubrica=value2;	
				  }else if (cellIdx==5) {
					  preguntas[auxRow].rub[cant].actividad=value2;
				  }
		    	  //System.out.println(codigo);
		  System.out.println("dato "+value2+" cant "+auxRow+" row "+cant);		        	  
	          }	           
	      }	    	  
		      cellIdx++;
	   }
		cant++;
	   }
		 // System.out.println("CLOSE: "+cant);	
		  return auxRow;
		} catch (IOException e) {
		  throw new RuntimeException("fail to parse Excel file: " + e.getMessage());
		}
	}
	
}
