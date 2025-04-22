package produits;

public interface IProduit {
	String getNom();
	public Unite getUnite();
	String decrireProduit();
	int calculerPrix(int prix);
}