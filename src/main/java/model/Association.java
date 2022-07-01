package model;

public class Association {
	private static int count = 1;
	private int id;
	private int idConducteur;
	private int idVehicule;
	
	public Association() {
	}

	public Association(int idConducteur, int idVehicule) {
		this.idConducteur = idConducteur;
		this.idVehicule = idVehicule;
		this.id = count;
		count++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdConducteur() {
		return idConducteur;
	}

	public void setIdConducteur(int idConducteur) {
		this.idConducteur = idConducteur;
	}

	public int getIdVehicule() {
		return idVehicule;
	}

	public void setIdVehicule(int idVehicule) {
		this.idVehicule = idVehicule;
	}
}
