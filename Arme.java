package afpa;

public class Joueur {
	private String nom;
	private int sante = 10;
	private int force;
	private int experience = 1;
	private Arme arme;
	private boolean living;

	static public int giveRandomInt() {
		int max = 10;
		int min = 5;
		int range = max - min + 1;
		int rand = (int) (Math.random() * range) + min;
//		System.out.println("rand: " +rand);
		return rand;
	}

	public Joueur(String nom) {
		this.force = giveRandomInt();
		this.sante = giveRandomInt();
		;
		this.experience = giveRandomInt();
		;
	}

	public Joueur(String nom, Arme arme) {
		if (sante < 0 || force < 0 || experience < 0) {
			throw new IllegalArgumentException();
		} else {
			this.force = giveRandomInt();
			this.sante = giveRandomInt();
			;
			this.experience = giveRandomInt();
			;
		}
		this.nom = nom;
		this.arme = arme;
		this.living = true;
	}
	
	static void fight(Joueur joueur1, Joueur joueur2) {
		if (joueur1.living && joueur2.living) {
			if (joueur1.getForce() * joueur1.getSante() * joueur1.getExperience() > joueur2.getForce()
					* joueur2.getSante() * joueur2.getExperience()) {
				System.out.println("Joueur1 vainqueur");
				joueur1.setForce(joueur1.getForce() + 1);
				if (joueur2.getSante() >= 1) {
					joueur2.setSante(joueur2.getSante() - 1);
				}
			} else {
				System.out.println("Joueur2 vainqueur");
				joueur2.setForce(joueur2.getForce() + 1);
				if (joueur1.getSante() >= 1) {
					joueur1.setSante(joueur1.getSante() - 1);
				}
			}
			joueur1.setExperience(joueur1.getExperience() + 1);
			joueur2.setExperience(joueur2.getExperience() + 1);
		} else {
			System.out.println("Impossible fight");
			return;
		}
		if (joueur1.getSante() == 0) {
			joueur1.setLiving(false);
			System.out.println("Joueur1 died...");

		}
		if (joueur2.getSante() == 0) {
			joueur2.setLiving(false);
			System.out.println("Joueur1 died...");
		}

		System.out.println("Joueur1:" + joueur1);
		System.out.println("Joueur2:" + joueur2);
	}

	public Arme getArme() {
		return arme;
	}

	public void setArme(Arme arme) {
		this.arme = arme;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getSante() {
		return sante;
	}

	public void setSante(int sante) {
		this.sante = sante;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public boolean isLiving() {
		return living;
	}

	public void setLiving(boolean living) {
		this.living = living;
	}

	@Override
	public String toString() {
		return "Joueur [nom=" + nom + ", sante=" + sante + ", force=" + force + ", experience=" + experience + ", arme="
				+ arme + "]";
	}

}
