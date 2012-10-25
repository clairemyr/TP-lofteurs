
public class Neuneu {
	protected int besoinsEnergetiques;
	protected int energie;
	protected int abs;
	protected int ord;
	protected Loft maison;
	
	
	public Neuneu( int besoinsE, int energie, int abs, int ord, Loft maison)
	{
		this.besoinsEnergetiques = besoinsE;
		this.energie = energie;
		this.abs = abs;
		this.ord = ord;
		this.maison = maison;		
	}

	public void seReproduire(Neuneu partenaire, Loft maison) {
		partenaire.setEnergie((int)(partenaire.getEnergie()-partenaire.getBesoinsEnergetiques()*0.5));
		this.setEnergie((int)(this.energie-this.besoinsEnergetiques*0.5));
		// on cree un nombre aleatoire entre 1 et 4  
		int nombre = (int)(1 + Math.random()*3);
		
		if (nombre==1){
			Vorace enfant = new Vorace(this.abs, this.ord, this.maison);
		}
		if (nombre==2){
			Erratique enfant = new Erratique(this.abs, this.ord, this.maison);
		}		
		if (nombre==3){
			Cannibale enfant = new Cannibale(this.abs, this.ord, this.maison);
		}
		else{
			Lapin enfant = new Lapin(this.abs, this.ord, this.maison);
		}
		
		this.maison.population.add(enfant);
	}
	
	public boolean estReproductible() {
		if (this.energie>0.5*this.besoinsEnergetiques) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getBesoinsEnergetiques() {
		return this.besoinsEnergetiques;
	}
	
	public int getEnergie() {
		return this.energie;
	}
	
	public void setEnergie(int nrj) {
		this.energie=nrj;
	}
	
	public int getAbs() {
		return this.abs;
	}
	
	public int getOrd() {
		return this.ord;
	}
	
}

