
public class Aliment {
	protected int type;
	protected int energie;
	protected int abs;
	protected int ord;
	
	public Aliment() {
		
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
	
	public void setAbs(int x) {
		this.abs=x;
	}
	
	public int getOrd()  {
		return this.ord;
	}
	
	public void setOrd(int y) {
		this.ord=y;
	}
}
