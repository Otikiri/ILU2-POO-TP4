package produits;

public abstract class Produit {
	private String nom; 
	private Unite unite;
	
	public Produit(String nom, Unite unite) {
		this.nom = nom;
		this.unite = unite;
	}
	
	public String getNom() {
		return nom;
	}
	protected Unite getUnite(){
		return unite ;
	}
	
	public abstract void decrireProduit();
}
