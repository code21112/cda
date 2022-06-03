package afpa;

public class Arme {
	private String nomArme;
	private String typeArme;
	private int puissance;

	public Arme() {
	}

	public enum TypeArme {
		EPEE, COUTEAU, MASSE, PISTOLET, ARC;
	}

	public enum TypeArme2 {
		LOW("EPEE"), MEDIUM("MARTEAU"), HIGH("ARC");

		private String nomArme;

		TypeArme2(String s) {
			nomArme = s;
		}

		String giveNomArme() {
			return nomArme;
		}
	}

	public Arme(String nomArme, String level, int puissance) {
		if(level.equals("LOW")) {
			this.typeArme = TypeArme2.LOW.giveNomArme()  ;
		} else if(level.equals("MEDIUM")) {
			this.typeArme = TypeArme2.MEDIUM.giveNomArme()  ;
		} else {
			this.typeArme = TypeArme2.HIGH.giveNomArme()  ;
		}
		this.nomArme = nomArme;
		this.puissance = puissance;
	}

	public String getNomArme() {
		return nomArme;
	}

	public void setNomArme(String nomArme) {
		this.nomArme = nomArme;
	}

	public String getTypeArme() {
		return typeArme;
	}

	public void setTypeArme(String typeArme) {
		this.typeArme = typeArme;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	@Override
	public String toString() {
		return "Arme [nomArme=" + nomArme + ", typeArme=" + typeArme + ", puissance=" + puissance + "]";
	}

}
