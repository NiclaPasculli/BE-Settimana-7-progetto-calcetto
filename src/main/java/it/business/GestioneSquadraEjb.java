package it.business;

import it.dao.CalciatoreDao;
import it.dao.ICalciatoreDao;
import it.dao.ISquadraDao;
import it.dao.SquadraDao;
import it.entity.Calciatore;
import it.entity.Squadra;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;


@Stateless
@LocalBean
public class GestioneSquadraEjb {
	
	@PersistenceContext(unitName = "calcettoPS")
    EntityManager em;
	
	private ICalciatoreDao calciatoreDao;
	private ISquadraDao squadraDao;
	
	
	public ICalciatoreDao getCalciatoreDao() {
		if(calciatoreDao == null) {
			calciatoreDao = new CalciatoreDao(em);
		}
		return calciatoreDao;
	}

	public ISquadraDao getSquadraDao() {
		if(squadraDao == null) {
			squadraDao = new SquadraDao(em);
		}
		return squadraDao;
	}
	public void setCalciatoreDao(ICalciatoreDao calciatoreDao) {
		this.calciatoreDao = calciatoreDao;
	}

	public void setSquadraDao(ISquadraDao squadraDao) {
		this.squadraDao = squadraDao;
	}

	

	public GestioneSquadraEjb() {
       
    }
	public void aggiornaCalciatore(Calciatore c) {
		getCalciatoreDao().update(c);
	}
	public void aggiornaCalciatore(String id, String nome, String cognome, String ruolo) {
		Calciatore c = new Calciatore();
		c.setidCalciatore(Integer.parseInt(id));
		c.setNome(nome);
		c.setCognome(cognome);
		c.setRuolo(ruolo);
		aggiornaCalciatore(c);
		
	}
    
    public void inserisciCalciatore(Calciatore c) {
    	getCalciatoreDao().inserisci(c);
    }
    public void inserisciCalciatore(String nome, String cognome, String ruolo) {
    	Calciatore c = new Calciatore();
		c.setNome(nome);
		c.setCognome(cognome);
		c.setRuolo(ruolo);
		inserisciCalciatore(c);
    }
    public void eliminaCalciatore(Calciatore c ) {
    	getCalciatoreDao().delete(c);
    }
    public void eliminaCalciatore(int id) {
    	Calciatore c = new Calciatore();
    	c.setidCalciatore(id);
    	eliminaCalciatore(c);
    }
    public void eliminaCalciatore(String id) {
    	Calciatore c = new Calciatore();
    	c.setidCalciatore(Integer.parseInt(id));
    	eliminaCalciatore(c);
    }
}

