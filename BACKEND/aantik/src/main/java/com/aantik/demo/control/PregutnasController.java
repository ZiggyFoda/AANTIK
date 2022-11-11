package com.aantik.demo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.aantik.demo.service.PreguntaCRUD;

@Controller
public class PregutnasController {
	@Autowired
	PreguntaCRUD servPreg;
}
