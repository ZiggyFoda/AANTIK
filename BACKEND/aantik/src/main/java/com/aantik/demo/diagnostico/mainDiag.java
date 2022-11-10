package com.aantik.demo.diagnostico;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.aantik.demo.model.ModInfoPregunta;
import com.aantik.demo.model.ModeloPregunta;
import com.aantik.demo.model.convenciones;

public class mainDiag {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		convenciones conven = new convenciones();
		ModInfoPregunta infoPreg[] = null;
		leerDiagnostico DGV = new leerDiagnostico();
		FileInputStream fis2;
		ModeloPregunta preguntas[]= new ModeloPregunta[200];
		int cant = 0,cant2=0;
		try {
			fis2 = new FileInputStream(new File("DGV3 OCTUBRE 2022.xlsx"));
			/*cant=DGV.leerConvenciones(fis2,conven);
			System.out.println("cantidad datos= "+conven.AreaFuncional[0].id);
			System.out.println("cantidad datos= "+cant);
			System.out.println("AREA FUNCIONAL");
			for (int i=0;i<cant;i++) {
				if(conven.AreaFuncional[i].titulo!=null) {
					System.out.println(conven.AreaFuncional[i].id+" "+conven.AreaFuncional[i].titulo);
				}
			}
			System.out.println("CARGO QUE DEBERIA RESPONDER");
			for (int i=0;i<cant;i++) {
				if(conven.CargoResp[i].titulo!=null) {
					System.out.println(conven.CargoResp[i].id+" "+conven.CargoResp[i].titulo);
				}
			}
			System.out.println("VARIABLE ORGANIZACIONAL");
			for (int i=0;i<cant;i++) {
				if(conven.VarOrga[i].titulo!=null) {
					System.out.println(conven.VarOrga[i].id+" "+conven.VarOrga[i].titulo);
				}
			}
			System.out.println("NIVEL SCOR");
			for (int i=0;i<cant;i++) {
				if(conven.NivelScor[i].titulo!=null) {
					System.out.println(conven.NivelScor[i].id+" "+conven.NivelScor[i].titulo);
				}
			}*/
			fis2 = new FileInputStream(new File("DGV3 OCTUBRE 2022.xlsx"));
			cant2=DGV.leerInfoPreg(fis2,infoPreg);
			fis2 = new FileInputStream(new File("DGV3 OCTUBRE 2022.xlsx"));
			cant2=DGV.leerPreg(fis2,preguntas);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
