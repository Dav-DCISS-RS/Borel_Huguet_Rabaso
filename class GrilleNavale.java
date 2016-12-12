package batailleNavale;

public class GrilleNavale {
	
	private Navire[] navires;
	private	int	nbNavires;
	private	int	taille;
	private	Coordonnee[] tirsRecus;
	private	int	nbTirsRecus;
	
	//--------------Constructeurs------------------------//
	
	
	public GrilleNavale(int taille, int[]taillesNavires){
		this.taille = taille;
		for (int i = 0; i < taille; i++){
			taillesNavires[i] = taillesNavires.length;
		}
		}
				
		
		
	//permet d'obtenir une grille navale vide de taille taille pouvant accueillir jusqu'à nbNavires
			
	public GrilleNavale(int taille, int nbNavires){
		this.taille = taille;
		this.nbNavires = nbNavires;
		//int [][] grille = new int [taillesNavires.length][taillesNavires.length];
			
	}
		
	//------------------Méthodes-----------------------------------------------//
	
	public String toString(){
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	}

}
}
