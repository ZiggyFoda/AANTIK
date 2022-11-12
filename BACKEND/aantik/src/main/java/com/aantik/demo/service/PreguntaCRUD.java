package com.aantik.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aantik.demo.entidad.Preguntas_Dig;
import com.aantik.demo.entidad.Rubrica_preg_dg;
import com.aantik.demo.model.ModeloPregunta;
import com.aantik.demo.repositorio.RubricaRepositorio;
import com.aantik.demo.repositorio.PreguntaRepositorio;

@Service
public class PreguntaCRUD implements PreguntaCRUDLocal {
	
	@Autowired
	PreguntaRepositorio repPre;
	
	@Autowired
	RubricaRepositorio repRub;
	
	@Override
	public Preguntas_Dig getUserById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Preguntas_Dig crearPregunta(Preguntas_Dig preg) throws Exception {
		if(existe(preg)) {			
			System.out.println("INSERTANDO"+preg.getPregunta());
			repPre.save(preg);
			}
		//}
		return preg;
	}


	private boolean existe(Preguntas_Dig preg) {
		// TODO Auto-generated method stub
		Optional<Preguntas_Dig> pregEncontrado = repPre.findByPregunta(preg.getPregunta());
		if(pregEncontrado.isPresent()) {
			System.out.println("Nodo ya se encuentra registrado");
			return false;
		}
		return true;
	}


	@Override
	public void saveAll(ModeloPregunta[] preguntas, int cant5) throws Exception {
		// TODO Auto-generated method stub
		Preguntas_Dig pregunta=new Preguntas_Dig();
		Rubrica_preg_dg rub[]=new Rubrica_preg_dg[8];
		for(int i =0;i<cant5;i++) {
			pregunta=new Preguntas_Dig();
			pregunta.setCodigo(preguntas[i].codigo);
			pregunta.setPregunta(preguntas[i].pregunta);
			pregunta.setInsump(preguntas[i].insump);
			pregunta.setAutomatica(String.valueOf(preguntas[i].automatica));
			for(int j=0; j<preguntas[i].rub.length;j++) {
				if(preguntas[i].rub[j]==null)
					break;
				rub[j]=new Rubrica_preg_dg();
				rub[j].setCuanti(preguntas[i].rub[j].cuanti);
				rub[j].setRubrica(preguntas[i].rub[j].rubrica);
				rub[j].setActividad(preguntas[i].rub[j].actividad);
				//System.out.println("RUB: "+preguntas[i].rub[j].rubrica);
				//rub.setIdPreg();
			}
			System.out.println("PREGUNTA_"+pregunta.getPregunta());
			Preguntas_Dig insert=crearPregunta(pregunta);
			crearRubrica(insert.getId(),rub);
		}	
	}


	private void crearRubrica(Long id, Rubrica_preg_dg[] rub) {
		System.out.println(rub.length);
		for(int i=0;i<rub.length; i++) {
			if(rub[i] == null || rub[i].getRubrica()==null )
				break;
			if(rub[i].getRubrica().length() >1) {
				System.out.println(i+"RUB: "+rub[i].getRubrica());
				rub[i].setIdPreg(id);
				repRub.save(rub[i]);
			}else
				System.out.println(i+"else : "+rub[i].getRubrica());				
		}
	}


	public Iterable<Preguntas_Dig> getAll() {
		// TODO Auto-generated method stub
		Iterable<Preguntas_Dig> est=repPre.findAll();
		System.out.println(est);
		return est;
	}


	public int getCantidad() {
		// TODO Auto-generated method stub
		Iterable<Preguntas_Dig> est=repPre.findAll();
		int cant=0;
		for(Preguntas_Dig var: est)
			cant++;
		return cant;
	}

	public Iterable<Rubrica_preg_dg>  getRubrica(Long idPreg) {
		// TODO Auto-generated method stub
		Iterable<Rubrica_preg_dg> est=repRub.findByIdPreg(idPreg);
		
		return est;
	}


	@Override
	public int getCantidadRubrica(Long idPreg) {
		// TODO Auto-generated method stub
		Iterable<Rubrica_preg_dg> est=repRub.findByIdPreg(idPreg);
		int cantRub=0;
		for(Rubrica_preg_dg var: est)
			cantRub++;
		
		return cantRub;
	}

}