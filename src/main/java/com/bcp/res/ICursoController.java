package com.bcp.res;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bcp.repo.ICursosRepo;
import com.bcp.model.*;


@RestController
@RequestMapping("/Curso")
public class ICursoController {

	@Autowired
	private ICursosRepo Curso;
		
	@GetMapping // se utiliza para obtener los datos
	public List<Curso>listar(){
		return Curso.findAll();
	}
	
	@PutMapping //se utiliza para modificar datos
	public void modificar(@RequestBody Curso per){
		Curso.save(per);	
	}
	
	@PostMapping//se utiliza para ingresar datos
	public void insert(@RequestBody Curso per){
		Curso.save(per);	
	}
	
	
}
