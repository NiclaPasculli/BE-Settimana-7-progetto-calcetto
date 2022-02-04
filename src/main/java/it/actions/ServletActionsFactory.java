package it.actions;

public class ServletActionsFactory {
	
	
	private ServletActionsFactory() {}
		
	private final static ServletActionsFactory servletActionsFactory = new ServletActionsFactory();
	
	
	
	
	public static ServletActionsFactory getIstance() {
		return servletActionsFactory;
	}




	public IServletActions create(String action) {
		switch(action) {
		case "/calciatore/inserisci":
			return new CalciatoreInserisciAction();
			
		case "/calciatore/aggiungisquadra":
			return new CalciatoreAggiungiSquadraAction();
		
		case "/calciatore/delete":
			return new CalciatoreDeleteAction();
		case "/calciatore/aggiorna":
			return new CalciatoreAggiornaAction();
		
		case "/calciatore/mostratutti":
			return new CalciatoriMostraTuttiAction();
		
		case "/calciatore/edit":
			return new CalciatoreEditAction();
		
		case "/calciatore/add":
			return new CalciatoreAddAction();
			
		case "/squadra/inserisci":
			break;
		case "/squadra/aggiungicalciatore":
			break;
		case "/squadra/elimina":
			break;
		case "/squadra/aggiorna":
			break;
		}
		return new WrongAction();
	}

		
	
}
