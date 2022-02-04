package it.actions;

import java.io.IOException;

import it.business.GestioneSquadraEjb;
import it.entity.Calciatore;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CalciatoreInserisciAction implements IServletActions {
	public void esegui(HttpServletRequest request, HttpServletResponse response, GestioneSquadraEjb gse) throws ServletException, IOException {
		
		 String nomeC = request.getParameter("nome"); 
		 String cognomeC = request.getParameter("cognome");
		 
		 if(!capitalCheck(nomeC) || !capitalCheck(cognomeC)) {
			 response.getWriter().append("Metti la maiuscola come prima lettera del nome e cognome");
			 return;
		 }
		
		 String ruolo = request.getParameter("ruolo");
		
		gse.inserisciCalciatore(nomeC, cognomeC, ruolo);
		 System.out.println("Hai aggiunto calciatore" + nomeC+ " " + cognomeC);
		 new CalciatoriMostraTuttiAction().esegui(request, response, gse);
	}
	
	private boolean capitalCheck(String nomeC) {
		if(!Character.isUpperCase(nomeC.charAt(0))) {
			return false;
		}
		return true;
	}

}
