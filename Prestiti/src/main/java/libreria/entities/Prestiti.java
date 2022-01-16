package libreria.entities;

import javax.persistence.Entity;

import javax.persistence.Table;

@Entity
@Table(name = "prestiti")

public class Prestiti implements Comparable<Prestiti>{
	
	
	private int id;
	private double dataInizio;
	private double dataFine;
	private String stringId;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getDataInizio() {
		return dataInizio;
	}
	public void setDataInizio(double dataInizio) {
		this.dataInizio = dataInizio;
	}
	public double getDataFine() {
		return dataFine;
	}
	public void setDataFine(double dataFine) {
		this.dataFine = dataFine;
	}
	
	
	public String getStringId() {
		return stringId;
	}
	public void setStringId(String stringId) {
		this.stringId = stringId;
	}
	
	@Override
	public String toString() {
		return "Prestiti [id=" + id + ", dataInizio=" + dataInizio + ", dataFine=" + dataFine + ", stringId=" + stringId
				+ "]";
	}
	
	@Override
	public int compareTo(Prestiti p) {
		
		return this.stringId.compareTo(p.stringId);
	}
	

	
	
	
	
}
