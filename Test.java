package ex3;

public class Test {
	public static void main(String[] args) {
		Peuple p=new Peuple();
		p.naissance(new Personne("Ben salah ","Ahmed"));
		p.naissance(new Personne("Mahfoudh ","Karim"));
		p.naissance(new Client("Gharbi ","Adem"));
		p.naissance(new Client("Salhi ","Sami"));
		p.explorer();
	}

}
