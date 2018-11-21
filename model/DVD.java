package bokutlåning4.model;

public class DVD extends Media{
	private String regissör, katalogNr;
	private int speltid;
	private boolean licensierad;
	
	public DVD(int id, String titel, String plats, String regissör, String katalogNr, int speltid) {
		super(id, titel, plats);
		this.regissör = regissör;
		this.katalogNr = katalogNr;
		this.speltid = speltid;
		this.licensierad = false;
	}
	
	@Override
	public boolean lånaUt(Kund kund) {
		if (licensierad) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int getLånePeriod() {
		return 7;
	}


}
