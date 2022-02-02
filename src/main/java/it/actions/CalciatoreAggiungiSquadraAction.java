package it.actions;

import java.io.IOException;

import it.business.GestioneSquadraEjb;
import it.entity.Calciatore;
import it.entity.Squadra;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CalciatoreAggiungiSquadraAction implements IServletActions {
	public void esegui(HttpServletRequest request, HttpServletResponse response, GestioneSquadraEjb gse) throws ServletException, IOException {
		Squadra s = new Squadra();
	      Calciatore c = new Calciatore();
	      c.setidCalciatore(3);
	      s.setIdSquadra(2);
	      //gse.getCalciatoreDao().calciatoreAggiungiSquadra(s, c);
	      System.out.println("Calciatore; " + c.getidCalciatore()+ "aggiunto alla squadra" +s.getIdSquadra());
	  }
}
