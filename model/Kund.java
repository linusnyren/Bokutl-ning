package bokutlåning4.model;

public class Kund {
	private String titel;
	private String förnamn;
	private String efternamn;
//	--------------------------
	private String adress;
	private String telefon;
	private String email;
	private int kundnr;
	private bokutlåning4.util.KönTyp kön;
	private boolean aktiv;

	public Kund(String titel, String förnamn, String efternamn, String adress, String telefon, String email, int kundnr, bokutlåning4.util.KönTyp kön) {
		setKund(titel, förnamn, efternamn);
		
		this.adress = adress;
		this.telefon = telefon;
		this.email = email;
		this.kundnr = kundnr;
		this.kön = kön;
		this.aktiv = true;
		
	}

	public void setKund(String titel, String förnamn, String efternamn) {
		this.titel = titel;
		this.förnamn = förnamn;
		this.efternamn = efternamn;
	}

	public String brevetikett() {
		return titel + " " + förnamn.substring(0, 1) + " " + efternamn;
	}

	enum KönTyp {
		MAN, KVINNA, OBESTÄMD
	}

	public String getObjEmail(Kund kund) {
		return kund.förnamn + " " + kund.efternamn + " " + kund.email;
	}

	public String getObjKön(Kund kund) {
		String s = kund.kön.toString();
		s = s.toLowerCase();
		return kund.förnamn + " " + kund.efternamn + " " + " " + s;
	}
}
