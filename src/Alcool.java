
public class Alcool extends Aliment {
	
	public void afficher() {
		
	}
	
	public Alcool(int nrj, int abs, int ord) {
		this.setEnergie(nrj);
		this.type=2;
		this.setAbs(abs);
		this.setOrd(ord);
	}
}
