package it.business;

import it.dao.ICalciatoreDao;
import it.dao.ISquadraDao;
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
		return calciatoreDao;
	}

	public ISquadraDao getSquadraDao() {
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
    
    

}

