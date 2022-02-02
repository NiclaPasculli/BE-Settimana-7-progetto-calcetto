package it.actions;

import java.io.IOException;

import it.business.GestioneSquadraEjb;
import it.entity.Calciatore;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CalciatoreInserisciAction implements IServletActions {
	public void esegui(HttpServletRequest request, HttpServletResponse response, GestioneSquadraEjb gse) throws ServletException, IOException {
		 Calciatore c = new Calciatore();
		 String nomeC = "Pino"; 
		 String cognomeC ="Insegno";
		 if(!capitalCheck(nomeC) || !capitalCheck(cognomeC)) {
			 response.getWriter().append("Metti la maiuscola come prima lettera del nome e cognome");
			 return;
		 }
		
		 String ruolo ="Bomber";
		 c.setNome(nomeC);
		 c.setCognome(cognomeC);
		 c.setRuolo(ruolo);
		gse.getCalciatoreDao().inserisci(c);
		 System.out.println("Hai aggiunto calciatore" + c.getNome()+ " " + c.getCognome());
	}
	
	private boolean capitalCheck(String nomeC) {
		if(!Character.isUpperCase(nomeC.charAt(0))) {
			return false;
		}
		return true;
	}

}
