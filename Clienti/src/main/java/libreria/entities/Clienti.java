package libreria.entities;

//qui uso mongo come db
public class Clienti implements Comparable<Clienti>{
	

	
	private String id;
	private String Nome;
	private String Cognome;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCognome() {
		return Cognome;
	}
	public void setCognome(String cognome) {
		Cognome = cognome;
	}
	
	@Override
	public String toString() {
		return "Clienti [id=" + id + ", Nome=" + Nome + ", Cognome=" + Cognome + "]";
	}
	@Override
	public int compareTo(Clienti c) {
		return this.Nome.compareTo(c.Nome);
	}
	
	

}
