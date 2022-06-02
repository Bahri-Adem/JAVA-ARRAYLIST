package ex3;

public class Client extends Personne implements Homme {
	 private static int nb=0;
     private int numero;
     public Client(String nom,String prenom) {
   	  super(nom,prenom);
   	  this.numero=++nb;
     }
     public void identite() {
   	  System.out.print("Le numero du client: "+this.numero+" ");
   	  super.identite();
     }

}
