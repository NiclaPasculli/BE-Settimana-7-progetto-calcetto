package it.dao;

import java.util.List;

import it.entity.Calciatore;
import it.entity.Squadra;

public interface ICalciatoreDao {
	
	public Calciatore inserisci(Calciatore c);
	public List<Calciatore> getAll();
	public Calciatore getByPrimaryKey(int id);
	public void update(Calciatore c);
	public void delete(Calciatore c);
	public List<Calciatore> getCalciatoreBySquadra(String nomeSq);
	public void calciatoreAggiungiSquadra(Squadra s, Calciatore c);
		

}
