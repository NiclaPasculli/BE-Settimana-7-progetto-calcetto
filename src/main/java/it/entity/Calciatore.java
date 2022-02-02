package it.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
@NamedQuery(name="get.all.calciatori", query="SELECT c FROM Calciatore c")
@Entity
@Table(name = "calciatore")
public class Calciatore implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int idCalciatore;
	private String nome;
	private String cognome;
	private String ruolo;
	
	private Squadra squadra;
	
	@Id
	@Column(name = "id_calciatore")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getidCalciatore() {
		return idCalciatore;
	}
	@Column(name = "nome_calciatore")
	public String getNome() {
		return nome;
	}
	@Column(name = "cognome_giocatore")
	public String getCognome() {
		return cognome;
	}
	@Column(name = "ruolo")
	public String getRuolo() {
		return ruolo;
	}
	public void setidCalciatore(int idCalciatore) {
		this.idCalciatore = idCalciatore;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
	
	@ManyToOne
	@JoinColumn(name = "id_squadra")
	public Squadra getSquadra() {
		return squadra;
	}
	public void setSquadra(Squadra squadra) {
		this.squadra = squadra;
	}
	
	

}
