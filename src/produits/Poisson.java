package produits;

public class Poisson extends Produit {
	private String date;

	
	public Poisson(String dateP) {
		super("poisson", Unite.PIECE);
		this.date = dateP;
	}

	@Override
	public String decrireProduit() {
		return this.getNom()+" peches "+date;
	}

	@Override
	public int calculerPrix(int prix) {
		return prix;
	} 

}
