package com.Ferreira.Huerta.Luis.Angel.org.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.Ferreira.Huerta.Luis.Angel.org.Model.Vacante;
import com.Ferreira.Huerta.Luis.Angel.org.Repositorio.VacantesRepository;



@Service
@Primary
public class VacantesServceImp implements IntVacantes {
	
	@Autowired
	public VacantesRepository repoVacantes;
	@Override
	public List<Vacante> obtenerTodas() {
		return (List<Vacante>) repoVacantes.findAll();
	}

	@Override
	public void guardar(Vacante vaca) {
		repoVacantes.save(vaca);
		
	}

	@Override
	public void eliminar(Integer idVacante) {
		repoVacantes.deleteById(idVacante);
		
	}

	@Override
	public Vacante buscarPorId(Integer idVacante) {
		Optional<Vacante> optional= repoVacantes.findById(idVacante);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}
	
	@Override
	public int numVacantes() {
		return (int) repoVacantes.count();
	}


	@Override
	public Page<Vacante> buscarTodas(Pageable page) {
		// TODO Auto-generated method stub
		return repoVacantes.findAll(page);
	}

}
