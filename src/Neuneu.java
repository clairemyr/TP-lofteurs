
public class Neuneu {
	protected int besoinsEnergetiques;
	protected int energie;
	protected int abs;
	protected int ord;
	protected Loft maison;
	
	public void seReproduire(Neuneu partenaire, Loft maison) {
		
	}
	
	public boolean estReproductible() {
		if (this.energie>0.5*this.besoinsEnergetiques) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getEnergie() {
		return this.energie;
	}
	
	public void addEnergie(int nrj) {
		this.energie+=nrj;
	}
	
	public int getAbs() {
		return this.abs;
	}
	
	public int getOrd() {
		return this.ord;
	}



}

