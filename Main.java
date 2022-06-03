package afpa;

import afpa.Arme.TypeArme;

public class Main {
	public static void main(String args[]) {

//Joueur joueur1 = new Joueur("test");
//System.out.println("joueur1:" + joueur1);
//
//Joueur joueur2 = new Joueur("test2", 4,44,55);
//System.out.println("joueur2:" + joueur2);

//Joueur joueur3 = new Joueur("test3", -4,44,55);
//System.out.println("joueur3:" + joueur3);

//Arme arme1 = new Arme();
//System.out.println("arme1:" + arme1);
//
//Arme arme2 = new Arme("test", "LOW",10);
//System.out.println("arme2:" + arme2);
//
//Arme arme3 = new Arme("test2", "MEIDUM",14);
//System.out.println("arme3:" + arme3);

Arme arme4 = new Arme("Excalibur", "LOW",8);
System.out.println("arme4:" + arme4);

Arme arme5 = new Arme("Marteau", "MEIDUM",14);
System.out.println("arme5:" + arme5);

Joueur joueur4 = new Joueur("Zelda",arme4);
System.out.println("joueur4:" + joueur4);

Joueur joueur5 = new Joueur("Mario",arme5);
System.out.println("joueur5:" + joueur5);


Joueur.fight(joueur4, joueur5);
Joueur.fight(joueur4, joueur5);
Joueur.fight(joueur4, joueur5);
Joueur.fight(joueur4, joueur5);
Joueur.fight(joueur4, joueur5);
Joueur.fight(joueur4, joueur5);
Joueur.fight(joueur4, joueur5);
Joueur.fight(joueur4, joueur5);
Joueur.fight(joueur4, joueur5);
Joueur.fight(joueur4, joueur5);
}
}