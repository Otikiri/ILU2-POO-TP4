package villagegaulois;

import personnages.Gaulois;
import produits.Produit;

public interface IVillage {
	<P extends Produit> boolean installerVendeur(IEtal<P> etal, Gaulois vendeur, P[] produit, int prix);

	void acheterProduit(String produit, int quantiteSouhaitee);
}
