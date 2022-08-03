package com.Ferreira.Huerta.Luis.Angel.org.Service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.Ferreira.Huerta.Luis.Angel.org.Model.Vacante;



public interface IntVacantes {
	
	public List<Vacante> obtenerTodas();
	public void guardar(Vacante vaca);
	public void eliminar(Integer idVacante);
	public Vacante buscarPorId(Integer idVacante);
	public int numVacantes();
	public Page<Vacante> buscarTodas(Pageable page);
}
