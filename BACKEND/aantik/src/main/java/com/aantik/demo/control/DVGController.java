package com.aantik.demo.control;

import java.util.Optional;

import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.aantik.demo.entidad.Preguntas_Dig;
import com.aantik.demo.entidad.Rubrica_preg_dg;
import com.aantik.demo.model.ModBench;
import com.aantik.demo.model.ModRubrica;
import com.aantik.demo.model.ModeloPregunta;
import com.aantik.demo.service.PreguntaCRUD;

@Controller
public class DVGController {
	
	@Autowired
	PreguntaCRUD servPreg;
	
	@GetMapping("/dgvGet")
	public ResponseEntity<ModeloPregunta[]> sendStudents() { 
	//public ResponseEntity<Mpreinscrito[],String>  sendStudents() {
		Iterable<Preguntas_Dig> est = null;
		int cantidad=servPreg.getCantidad();
		ModeloPregunta[] est2=new ModeloPregunta[cantidad];
		try {
			est= servPreg.getAll();
			int i=0;
			for (Preguntas_Dig estA : est){
				est2[i]=new ModeloPregunta();
				est2[i].codigo=estA.getCodigo();
				est2[i].pregunta=estA.getPregunta();
				est2[i].insump=estA.getInsump();
				est2[i].automatica=Boolean.parseBoolean(estA.getAutomatica());
				int canR=servPreg.getCantidadRubrica(estA.getId());
				int j=0;
				est2[i].rub=new ModRubrica[canR];
				Iterable<Rubrica_preg_dg> rub=servPreg.getRubrica(estA.getId());
				for(Rubrica_preg_dg var: rub) {
					est2[i].rub[j]=new ModRubrica();
					est2[i].rub[j].cuanti=var.getCuanti();
					est2[i].rub[j].rubrica=var.getRubrica();
					est2[i].rub[j].actividad=var.getActividad();
					System.out.println(j+"---"+est2[i].rub[j].cuanti);
					j++;
				}
				i++;
				System.out.println(estA.getPregunta());
			}
			System.out.println(cantidad);
			return new ResponseEntity<ModeloPregunta[]>  (est2, HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Usuario no existe"+e);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
}
