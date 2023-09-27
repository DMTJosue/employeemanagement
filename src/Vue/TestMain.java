package Vue;

import modele.Employe;
import modele.Journalier;


public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employe [] te = new Employe [5];
		
		te[0] = new Employe(1,"DIOP","Aminata","DERKLE",771870268,3500000);
		te[1] = new Employe(2,"KANE","Moustapha","OUAKAM",771880561,6400000);
		te[2] = new Employe(3,"BA","Amadou","LIBERTE6",771841268,8900000);
		te[3] = new Employe(4,"TOURE","Momo","LIBERTE5",771870762,1000000);
		te[4] = new Employe(5,"DIOME","Mamire","LIBERTE5",777870762,1800000);
		
		Journalier [] tj = new Journalier [8];
		
		tj[0] = new Journalier(1,"DIOP","Aminata","DERKLE",771870268,50,70000);
		tj[1] = new Journalier(2,"KANE","Moustapha","OUAKAM",771870268,80,80000);
		tj[2] = new Journalier(3,"BA","Amadou","LIBERTE6",771870268,90,90000);
		tj[3] = new Journalier(4,"BA","Amadou","LIBERTE6",771870268,100,10000);
		tj[4] = new Journalier(5,"TOURE","MOMO","LIBERTE5",771870268,125,11000);
		tj[5] = new Journalier(6,"DIOP","Aminan","DERKLE",771570268,150,12000);
		tj[6] = new Journalier(7,"DIOP","Mohamed","DERKLE",771970268,175,14000);
		tj[7] = new Journalier(8,"DIOP","Aboubacar","DERKLE",771370268,200,15000);
		
		
		for (Employe e : te) {
			e.afficher();
			System.out.println("-----------------------------------");
			
		}
		
		for (Journalier j : tj) {
			j.afficher();
			System.out.println("salaire : "+j.calculerSalaire());
			System.out.println("-----------------------------------");
			
		}
	}

}
