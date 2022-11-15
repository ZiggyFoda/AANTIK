package com.aantik.demo.service;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aantik.demo.entidad.Diagnostico;
import com.aantik.demo.entidad.Preguntas_Dig;
import com.aantik.demo.model.ModDGV;
import com.aantik.demo.repositorio.DiagnosticoRepositorio;

@Service
public class DiagnosticoCRUD implements DiagnosticoCRUDLocal{
	
	@Autowired
	DiagnosticoRepositorio repDG;
	
	@PersistenceContext // or even @Autowired
    private EntityManager entityManager;
	@Override
	public Iterable<Diagnostico> getAll() {
		// TODO Auto-generated method stub
		Iterable<Diagnostico> lista = repDG.findAll();
		return lista;
	}

	@Override
	public void crearDiagnostico(ModDGV diag) throws Exception {
		// TODO Auto-generated method stub
		Diagnostico addDg =new Diagnostico();
		if(diag.puntajeS != null) {
			addDg.setCorreo(diag.correo);
			addDg.setPreguntaCod(diag.codigo);
			addDg.setPuntajeS(diag.puntajeS);
		 }else if(diag.puntajeN != 0) {
			addDg.setCorreo(diag.correo);
			addDg.setPreguntaCod(diag.codigo);
			addDg.setPuntajeN(diag.puntajeN);	    
		 }
		if(valida(addDg)) {
			repDG.save(addDg);
		}else {
			Diagnostico actualiza=repDG.getByPreguntaCod(addDg.getPreguntaCod());
			mapeo(actualiza,addDg);
			System.out.println("aCTUALIZANDO..."+actualiza.getPreguntaCod());
			repDG.save(actualiza);
		}
			
	}

	private void mapeo(Diagnostico actualiza, Diagnostico addDg) {
		// TODO Auto-generated method stub
		actualiza.setCorreo(addDg.getCorreo());
		actualiza.setPreguntaCod(addDg.getPreguntaCod());
		actualiza.setPuntajeN(addDg.getPuntajeN());
		actualiza.setPuntajeS(addDg.getPuntajeS());
		
	}

	private boolean valida(Diagnostico addDg) {
		// TODO Auto-generated method stub
		Optional<Diagnostico> docEncontrado = repDG.findByPreguntaCod(addDg.getPreguntaCod());
		if(docEncontrado.isPresent()) {
			System.out.println("Nodo ya se encuentra registrado");
			return false;
		}
		return true;
	}

	@Override
	public Iterable<Diagnostico> getNoRespondidas(Iterable<Preguntas_Dig> listaPreg, Diagnostico dg_actual) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getPuntaje(String codigo) {
		// TODO Auto-generated method stub
		Diagnostico aux=repDG.getByPreguntaCod(codigo);
		if(aux==null)
			return 0;
		return aux.getPuntajeN();
	}

}
