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
		
		case "/calciatore/elimina":
			break;
		case "/calciatore/aggiorna":
			break;
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
