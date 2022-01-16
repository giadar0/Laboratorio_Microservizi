package libreria.entities;

import javax.persistence.Entity;

import javax.persistence.Table;

@Entity 
@Table (name = "libri")

public class Libri implements Comparable<Libri> {
	
	
	private int id; //strin e non int perchè da errori
	
	private String titolo;
	private String autori;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutori() {
		return autori;
	}
	public void setAutori(String autori) {
		this.autori = autori;
	}
	
	
	@Override
	public String toString() {
		return "Libro [id=" + id + ", titolo=" + titolo + ", autori=" + autori + "]";
	}
	
	@Override
	public int compareTo(Libri o) {
		
		return this.titolo.compareTo(o.titolo);
	
}
}
