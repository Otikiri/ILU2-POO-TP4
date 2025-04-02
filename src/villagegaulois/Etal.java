package villagegaulois;

import personnages.Gaulois;
import produit.Produit;

public class Etal <T extends Produit> {
	private Gaulois vendeur;
	private T produit;
	private int quantiteDebutMarche;
	private int quantite;
	private boolean etalOccupe = false;

	public boolean isEtalOccupe() {
		return etalOccupe;
	}

	public Gaulois getVendeur() {
		return vendeur;
	}

	public int getQuantite() {
		return quantite;
	}
	public int getQuantiteDebMarche() {
		return quantiteDebutMarche;
	}
	public Produit getProduit() {
		return produit;
	}
}
