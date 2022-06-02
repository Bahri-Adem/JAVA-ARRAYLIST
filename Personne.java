package ex3;

public class Personne implements Homme {
	private String nom;
	private String prenom;
	public Personne(String nom,String prenom) {
		this.nom=nom;
		this.prenom=prenom;
	}
    public void identite() {
    	System.out.println("Cet personne s'appelle "+nom+" "+ prenom);
    }
}
