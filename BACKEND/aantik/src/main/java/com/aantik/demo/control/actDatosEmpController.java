package com.aantik.demo.control;


import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

//import javax.validation.Valid;

import org.apache.logging.log4j.message.StringFormattedMessage;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.util.MultiValueMap;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

import net.bytebuddy.utility.RandomString;

import com.aantik.demo.model.ModBench;
import com.aantik.demo.model.Mpreinscrito;
import com.aantik.demo.model.encuestaPre;

@CrossOrigin(origins = "*", maxAge = 3600)

@RestController

//RequestMapping("/datos")

public class actDatosEmpController {
    @PostMapping("/datosEmp")
    public ResponseEntity<?> processForgotPassword(@RequestBody encuestaPre update) {

    System.out.println("Tel: " + update.getTelefono());

    System.out.println("Localidad: " + update.getLocalidad());
    return ResponseEntity.ok("ok");
    }
    
	@GetMapping("/benchGet")
	public ResponseEntity<ModBench[]> sendStudents() { 
	//public ResponseEntity<Mpreinscrito[],String>  sendStudents() {
		ModBench est[] = new ModBench[10];
		try {
			est[0]=new ModBench();
			est[1]=new ModBench();
			est[2]=new ModBench();
			est[3]=new ModBench();
			est[4]=new ModBench();
			est[5]=new ModBench();
			est[6]=new ModBench();
			est[7]=new ModBench();
			est[8]=new ModBench();
			est[9]=new ModBench();
			est[0].nombre="EFICACIA";
			est[0].puntaje=80;
			est[0].descripcion="Alcanzar las metas establecidas de la empresa durante un determinado periodo de tiempo.";
			System.out.println("Enviar estudiante: "+est[0].nombre);
			est[1].nombre="EFICIENCIA";
			est[1].puntaje=50;
			est[1].descripcion="El objetivo de cualquier empresa es prestar servicios o fabricar productos, cumpliendo con los objetivos de mínimo esfuerzo, gasto y desperdicio, los cuales reducen los costos y mejora lo que serían los resultados de la compañía.";
			System.out.println("Enviar estudiante: "+est[1].nombre);
			est[2].nombre="PRODUCTIVIDAD";
			est[2].puntaje=30;
			est[2].descripcion="Es el conjunto de acciones que se realizan para lograr cumplir los objetivos de la empresa, teniendo conocimiento previo de de la cantidad de recursos que se utilizan para ello.";
			est[3].nombre="COMPETITIVIDAD";
			est[3].puntaje=15;
			est[3].descripcion="Es la capacidad que tiene la empresa de hacer las cosas mejor que su competencia, ya sea en términos de producto, producción, costos, calidad, entre otras, pero al final obtener una ventaja sobre otros.";
			est[4].nombre="ESTRUCTURA DE COSTOS";
			est[4].puntaje=35;
			est[4].descripcion="Es el proceso mediante el cual se tiene como objetivo organizar de forma efectiva todos los costos de una empresa y así mejorar la toma de decisiones.";
			est[5].nombre="SERVICIO AL CLIENTE	";
			est[5].puntaje=55;
			est[5].descripcion="Es el servicio o atención que una empresa o negocio le brinda a sus clientes al momento de ofrecer productos y servicios correctos, además de responder preguntas y dar solución a problemas en el momento adecuado.";
			est[6].nombre="GESTIÓN DE INVENTARIOS";
			est[6].puntaje=63;
			est[6].descripcion="Es el seguimiento del inventario desde el momento de fabricación hasta los almacenes, y desde estas instalaciones hasta el punto de venta. El objetivo es tener los productos correctos en el lugar adecuado y en el momento preciso.";
			
			est[7].nombre="CONTROL DE CALIDAD";
			est[7].puntaje=34;
			est[7].descripcion="Es el conjunto de procedimientos destinados a garantizar que un producto fabricado o un servicio realizado cumpla con los criterios de calid.ad o con los requisitos del cliente.";
			est[8].nombre="RAPIDEZ";
			est[8].puntaje=33;
			est[8].descripcion="Es la velocidad con la que la empresa lleva a cabo sus objetivos propuestos previamente.";			
			est[9].nombre="PRECIO";
			est[9].puntaje=27;
			est[9].descripcion="El precio es la cantidad monetaria que se interpone a un producto y debe ser congruente para poder ofrecerlo al público de manera que sea competitivo con los demás en el mercado.";

			
			
			return new ResponseEntity<ModBench[]>  (est, HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Usuario no existe"+e);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

}
