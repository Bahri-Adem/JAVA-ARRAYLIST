package ex3;
import java.util.ArrayList;
import java.util.Iterator;
public class Peuple {
	public ArrayList <Homme> pays;
	private int nbhommes;
	public Peuple() {
		this.nbhommes=0;
		pays=new ArrayList<Homme>();
	}
	public void naissance(Homme h) {
		pays.add(h);
		this.nbhommes ++ ;
	}
	public void explorer() {
		for(Iterator<Homme> h=pays.iterator();h.hasNext();)
			h.next().identite();
	}

}
