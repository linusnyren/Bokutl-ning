package bokutlåning4.ui;

import bokutlåning4.model.Bok;

public class UI {

	public void skrivUtRubrik() {
		System.out.println("BokId  Titel                Författare");
	}
	
	//Utvärderar huruvide en sträng skall förlängas eller trunkeras.
	//Beroende på ingångsvärde
	private String fixaStränglängd(String bokData, int längd) {
		if(bokData.length() >= längd) {
			return bokData.substring(0, längd);
		}
		else {
			while(bokData.length()<längd) {
				bokData += " ";
			}
			return bokData;
		}
		
	}
	
	private String fixaStränglängd(int bokDataInt, int längd) {
			String bokdata = String.valueOf(bokDataInt);
			return fixaStränglängd(bokdata, längd);
	}
	
	
	public void skrivUtBok(Bok bok) {
		//Lösning 1 på problemet med bokId som int
		//String bokidSträng = String.valueOf(bok.getBokid());
		//System.out.println(fixaStränglängd(bokidSträng, 6) +" " 
		//Lösning 2 skapa en metod fixaStärnglängd(int, int)och returnera fixaStränglängd(String, int)
//		System.out.println(fixaStränglängd(bok.getBokid(), 6) +" "
//		+fixaStränglängd(bok.getTitel(), 20) +" " 
//		+fixaStränglängd(bok.getFörfattare(), 20));
//		
		StringBuilder sb = new StringBuilder(fixaStränglängd(bok.getId(), 6));
		sb.append(" ");
		sb.append(fixaStränglängd(bok.getTitel(), 20));
		sb.append(" "); 
		sb.append(fixaStränglängd(bok.getFörfattare(), 20));
		System.out.println(sb);
	}
	public void skrivUtBokKatalog(Bok[] bokkatalog) {
	for (int i = 0; i < bokkatalog.length; i++) {
		if (bokkatalog[i] != null) {
			skrivUtBok(bokkatalog[i]);
		}
	}
	}
	
}
