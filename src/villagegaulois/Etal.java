package villagegaulois;

import personnages.Gaulois;
import produits.Produit;

public class Etal  <T extends Produit> implements IEtal<T> {
	private Gaulois vendeur;
	private T produit;
	private int quantiteDebutMarche;
	private int quantite;
	private boolean etalOccupe = false;

	@Override
	public boolean isEtalOccupe() {
		return etalOccupe;
	}

	@Override
	public Gaulois getVendeur() {
		return vendeur;
	}

	@Override
	public int getQuantite() {
		return quantite;
	}
	@Override
	public int getQuantiteDebMarche() {
		return quantiteDebutMarche;
	}
	@Override
	public Produit getProduit() {
		return produit;
	}
}
