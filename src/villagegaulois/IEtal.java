package villagegaulois;

import personnages.Gaulois;
import produits.Produit;

public interface IEtal<T extends Produit> {

	boolean isEtalOccupe();

	Gaulois getVendeur();

	int getQuantite();

	int getQuantiteDebMarche();

	Produit getProduit();

}