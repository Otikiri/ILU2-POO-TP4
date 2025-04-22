package villagegaulois;

import personnages.Gaulois;
import produits.IProduit;


public class Etal <T extends IProduit> implements IEtal{
	private Gaulois vendeur;
	private T[] produit;
	private int nbProduits = 0;
	private boolean etalOccupe = false;
	private int prix;
	
	@Override
	public Gaulois getVendeur() {
		return vendeur; 
	}
	@Override
	public int contientProduit(String produit, int quantiteSouhaitee) {
		int qtiteAVendre = 0; 
		if (nbProduits != 0 && this.produit[0].getNom().equals(produit)) {
			if (nbProduits>=quantiteSouhaitee) {
				qtiteAVendre = quantiteSouhaitee; 
			}
			else {
				qtiteAVendre = nbProduits;
			}
		}
		return qtiteAVendre;
	}
	@Override
	public int acheterProduit(int quantiteSouhaite) {
		int prixPaye = 0;
		for(int i = nbProduits-1; i>nbProduits-quantiteSouhaite-1|| i > 1 ; i--) {
			prixPaye += produit[i].calculerPrix(prix);
		}
		if (nbProduits>=quantiteSouhaite) {
			nbProduits-= quantiteSouhaite;
		}else {
			nbProduits = 0; 
		}
		return prixPaye;
	}
	@Override
	public String etatEtal() {
		StringBuilder chaine = new StringBuilder(vendeur.getNom());
		if (nbProduits>0) {
			chaine.append(" vend ");
			chaine.append(nbProduits+" produits :");
			for (int i = 0; i < nbProduits; i++) {
				chaine.append("\n- "+produit[i].decrireProduit());
			}
		} else {
			chaine.append(" n'a plus rien a vendre.");
		}
		chaine.append("\n");
		return chaine.toString();
	} 
	
	public void installerVendeur(Gaulois vendeur , T[] produit, int prix) {
		this.vendeur = vendeur; 
		this.produit = produit; 
		this.prix = prix; 
		this.etalOccupe = true;
		this.nbProduits = produit.length;
	}


}
