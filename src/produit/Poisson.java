package produit;

public class Poisson extends Produit {
	private String date;

	
	public Poisson(String dateP) {
		super("poisson", Unite.PIECE);
		this.date = dateP;
	}

	@Override
	public void decrireProduit() {
		System.out.println(this.getNom()+" peches "+date);
	} 

}
