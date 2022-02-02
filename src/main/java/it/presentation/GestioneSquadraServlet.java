package it.presentation;

import java.io.IOException;

import it.actions.CalciatoreAggiungiSquadraAction;
import it.actions.CalciatoreInserisciAction;
import it.actions.ServletActionsFactory;
import it.business.GestioneSquadraEjb;
import it.entity.Calciatore;
import it.entity.Squadra;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/gestione/*")
public class GestioneSquadraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	GestioneSquadraEjb calcettoServ;
    
    public GestioneSquadraServlet() {
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getPathInfo();
		
		ServletActionsFactory.getIstance().create(action).esegui(request, response, calcettoServ);
	}
}
