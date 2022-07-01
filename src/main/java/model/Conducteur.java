package model;

import java.util.ArrayList;

public class Conducteur {
	private static int count = 1;
	private int id;
	private String prenom;
	private String nom;
	private ArrayList listeConducteurs;
	
	public Conducteur() {
	}


	public Conducteur(String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
		this.id =count;
		count++;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public ArrayList ajouterConducteur(Conducteur nouveauConducteur, ArrayList listeConducteurs) {
		listeConducteurs.add(nouveauConducteur);
		return listeConducteurs;
	}


//	@Override
//	public String toString() {
//		return "Conducteur [id=" + id + ", prenom=" + prenom + ", nom=" + nom + "]";
//	}
	
	
}
