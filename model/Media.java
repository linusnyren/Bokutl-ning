package bokutlåning4.model;

public abstract class Media {
	
	private int id;
	private String titel, plats;
	private Kund låntagare;
	
	public Media(int id, String titel, String plats) {
		super();
		this.id = id;
		this.titel = titel;
		this.plats = plats;
	}

	public int getId() {
		return id;
	}
	
	public void omplacera(String plats) {
		this.plats = plats;
	}

	public boolean lånaUt(Kund låntagare) {
		if (låntagare == null) {
			this.låntagare = låntagare;
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getTitel() {
		return titel;
	}
	public abstract int getLånePeriod();
	
	
}
