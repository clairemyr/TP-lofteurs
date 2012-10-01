
public class Nourriture extends Aliment {

	public void afficher() {
		
	}
	
	public Nourriture(int nrj, int abs, int ord) {
		this.setEnergie(nrj);
		this.type=1;
		this.setAbs(abs);
		this.setOrd(ord);
	}
}
