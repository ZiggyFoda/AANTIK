package test2;


import java.io.*;

public class Main {

 public static void main(String[] args) {
  
  //CSV = Comma-Separated Values 
  //   text file that uses a comma to separate values
  
  String file = "test.csv";
  BufferedReader reader = null;
  String line = "";
  int numLineas = 0;
  int numPreguntas = 0;

  String[] Arr = new String[195];
  String[][] Mat = new String[5][40];
  
  try {
   reader = new BufferedReader(new FileReader(file));
   reader.readLine();
   while((line = reader.readLine()) != null) {

    
    String[] row = line.split(",");
    //String[] row = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)"); 
//use this if your values already contain commas
    for(String index : row) {
    
     System.out.printf("%-10s", index);
     index = index.replaceAll("\"", "");
     Arr[numPreguntas] = (String)index;
	 numPreguntas++;
    }
    System.out.println();
    numLineas++;
   }
  }
  catch(Exception e) {
   e.printStackTrace();
  }
  finally {
   try {
    reader.close();
   } catch (IOException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
   }
  }
  System.out.println("Numero de lineas: " + numLineas);
  System.out.println("Numero de preguntas: " + numPreguntas/numLineas);
  System.out.println("Numero de datos: " + numPreguntas);
 /* for(int i=0;i<Arr.length;i++)
  {
      System.out.println(Arr[i]);
  }*/
  int k =0;
  for(int i = 0; i < 5; i++){
	  System.out.println("--------------------------------------------------");
	     for(int j = 0; j < 39; j++){
	         Mat[i][j] =  Arr[k] ;
	         k++;
	         System.out.println(Mat[i][j]);
	     }
 }
  //modificar disponibilidad
 
  for(int i = 0; i < 5; i++){
	  int f=0;
  System.out.println(Mat[i][24]);
  if((Mat[i][24]).contains("Lunes")){
	  Mat[i][24] = "LAM";
	  f++;
  }
  if((Mat[i][24]).contains("Martes")){
	  if(f == 0) {
		  Mat[i][24] = "MAM";
	  }else {
		  Mat[i][24] = Mat[i][24] + "MAM";
		  f++;
		  }
  }
  if((Mat[i][24]).contains("Miercoles")){
	  if(f == 0) {
		  Mat[i][24] = "WAM";
	  }else {
		  Mat[i][24] = Mat[i][24] + "WAM";
		  f++;
		  }
  }
  if((Mat[i][24]).contains("Jueves")){
	  if(f == 0) {
		  Mat[i][24] = "JAM";
	  }else {
		  Mat[i][24] = Mat[i][24] + "JAM";
		  f++;
		  }
  }
  if((Mat[i][24]).contains("Viernes")){
	  if(f == 0) {
		  Mat[i][24] = "VAM";
	  }else {
		  Mat[i][24] = Mat[i][24] + "VAM";
		  f++;
		  }
  }
  if((Mat[i][24]).contains("Sabado")){
	  if(f == 0) {
		  Mat[i][24] = "SAM";
	  }else {
		  Mat[i][24] = Mat[i][24] + "SAM";
		  f++;
		  }
  }
  if((Mat[i][24]).contains("Domingo")){
	  if(f == 0) {
		  Mat[i][24] = "DAM";
	  }else {
		  Mat[i][24] = Mat[i][24] + "DAM";
		  f++;
		  }
  }
  
  }
  System.out.println(Mat[0][24]);
  System.out.println(Mat[1][24]);
  System.out.println(Mat[2][24]);
  System.out.println(Mat[3][24]);
  

}
}
