
public abstract class FormeGeometriche {
		
	protected abstract double area();
	
	protected abstract double perimetro();
	
	protected abstract String chiSono();
	
	public int riga;
	
	public int colonna;
	
	public char forma[] [];
	
/*	public FormeGeometriche(int riga, int colonna) {
		this.riga = riga;
		this.colonna = colonna;
		forma = new char[riga] [colonna];
	}
	
	
	protected void disegna() {
		
		setDisegno();
		
		for(int i = 0; i < riga; i++) {
			for(int j = 0; j < colonna; j++) {
				if(i == 0 || i == riga-1) {
					forma[i] [j] = '*';;
				} else if(j == 0 || j == colonna -1) {
					forma[i] [j] = '*';
				}
			}
		}
	}
	
	public abstract void setDisegno();
	
	*/
	
	
}
