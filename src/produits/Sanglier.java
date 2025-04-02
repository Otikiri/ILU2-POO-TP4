package produits;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private int poids;
	private Gaulois chasseur;
	public Sanglier( int poids, Gaulois chasseur) {
		super("sanglier",Unite.KILOGRAMME);
		this.poids = poids;
		this.chasseur = chasseur;
	}
	
	@Override
	public void decrireProduit() {
		Unite unit = this.getUnite();
		System.out.println(this.getNom()+" de "+poids+" "+unit.toString()+" par "+chasseur.getNom());
	} 
	
	
}
