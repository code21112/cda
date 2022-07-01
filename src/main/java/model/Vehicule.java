package model;

import java.util.ArrayList;

public class Vehicule {
	private static int count = 1;
	private int id;
	private String marque;
	private String modele;
	private String couleur;
	private String immatriculation;
	private ArrayList listeVehicules;

	public Vehicule() {
	}

	public Vehicule(String marque, String modele, String couleur, String immatriculation) {
		super();
		this.marque = marque;
		this.modele = modele;
		this.couleur = couleur;
		this.immatriculation = immatriculation;
		this.id = count;
		count++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	
	public ArrayList ajouterConducteur(Vehicule nouveauVehicule, ArrayList listeVehicules) {
		listeVehicules.add(nouveauVehicule);
		return listeVehicules;
	}
	

}
