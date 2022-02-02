package it.dao;

import java.util.List;


import it.entity.Squadra;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.Query;

public class SquadraDao implements ISquadraDao {

	private EntityManager em;

	public SquadraDao(EntityManager em) {
		this.em = em;
	}
	@Override
	public Squadra inserisci(Squadra s) {
		em.persist(s);
		return s;
	}

	@Override
	public List<Squadra> getAll() {
		Query q = em.createNamedQuery("get.all.squadre");
		List<Squadra> listaSquadre = q.getResultList();
		return listaSquadre;
	}

	@Override
	public Squadra getByPrimaryKey(int id) {
		Squadra s = em.find(Squadra.class, id);
		if ( s == null)
			throw new EntityNotFoundException("Non è stato trovato la suqadra con id" + id);
		return s ;
	}

	@Override
	public void update(Squadra s) {
		em.merge(s);
		
	}

	@Override
	public void delete(Squadra s) {
		em.remove(em.find(Squadra.class, s.getIdSquadra()));
		
	}
	public void delete(int id) {
		em.remove(em.find(Squadra.class, id));
		
	}
	
	
	

}