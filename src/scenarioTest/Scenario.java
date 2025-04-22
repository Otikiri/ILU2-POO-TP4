package scenarioTest;

import personnages.Gaulois;
import produits.Poisson;
import produits.Produit;
import produits.Sanglier;
import villagegaulois.Etal;
import villagegaulois.IEtal;
import villagegaulois.IVillage;

public class Scenario {

	public static void main(String[] args) {

		IVillage village = new IVillage() {
			private IEtal[] marche = new IEtal[3];
			private int nbEtal = 0;
			
			@Override
			public <P extends Produit> boolean installerVendeur(Etal<P> etal, Gaulois vendeur, P[] produit, int prix) {
				marche[nbEtal] = etal;
				etal.installerVendeur(vendeur, produit, prix);
				nbEtal++;
				return true;
			}
			
			@Override
			public void acheterProduit(String produit, int quantiteSouhaitee) {
				int quantiteAcheteTotal = 0;
				int quantiteInit = quantiteSouhaitee;
				for (int i = 0; i < marche.length; i++) {
					int quantiteAchete = marche[i].contientProduit(produit, quantiteSouhaitee);
					if (quantiteAchete!=0) {
						System.out.println("A l'etal "+(i+1)+" j'achete "+quantiteAchete+" "
								+produit+ " et je paye "+marche[i].acheterProduit(quantiteAchete)+" sous.");
					}
					quantiteAcheteTotal += quantiteAchete;
					quantiteSouhaitee -= quantiteAchete;
				}
				System.out.println("Je voulais "+quantiteInit+", j'en ai achete "+quantiteAcheteTotal+"\n");
			}
			public String toString() {
				StringBuilder village = new StringBuilder();
				for (int i = 0; i < nbEtal; i++) {
					village.append(marche[i].etatEtal()+"\n");
				}
				return village.toString(); 
			}
		};

		Gaulois ordralfabetix = new Gaulois("Ordralfabétix", 9);
		Gaulois obelix = new Gaulois("Obélix", 20);
		Gaulois asterix = new Gaulois("Astérix", 6);

		Etal<Sanglier> etalSanglierObelix = new Etal<>();
		Etal<Sanglier> etalSanglierAsterix = new Etal<>();
		Etal<Poisson> etalPoisson = new Etal<>();

		Sanglier sanglier1 = new Sanglier(2000, obelix);
		Sanglier sanglier2 = new Sanglier(1500, obelix);
		Sanglier sanglier3 = new Sanglier(1000, asterix);
		Sanglier sanglier4 = new Sanglier(500, asterix);

		Sanglier[] sangliersObelix = { sanglier1, sanglier2 };
		Sanglier[] sangliersAsterix = { sanglier3, sanglier4 };

		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = { poisson1 };

		village.installerVendeur(etalSanglierAsterix, asterix, sangliersAsterix, 10);
		village.installerVendeur(etalSanglierObelix, obelix, sangliersObelix, 8);
		village.installerVendeur(etalPoisson, ordralfabetix, poissons, 5);

		System.out.println(village.toString());

		village.acheterProduit("sanglier", 3);

		System.out.println(village.toString());
	}

}
