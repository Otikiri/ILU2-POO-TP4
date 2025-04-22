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
	public String decrireProduit() {
		Unite unit = this.getUnite();
		return this.getNom()+" de "+poids+" "+unit.toString()+" par "+chasseur.getNom();
	}

	@Override
	public int calculerPrix(int prix) {
		return (int) Math.floor(((poids*prix)/1000));
	}

	
	
}
