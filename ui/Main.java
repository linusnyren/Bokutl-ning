package bokutlåning4.ui;

import javax.swing.JOptionPane;

import bokutlåning4.model.Bok;
import bokutlåning4.model.BokKatalog;
import bokutlåning4.model.BookNotFoundException;
import bokutlåning4.model.DVD;
import bokutlåning4.model.Kund;
import bokutlåning4.util.KönTyp;

public class Main {

	public static void main(String[] args) {
		Kund kalle = new Kund("Herr", "Kalle", "Blomqvist", "Vägen 3", "0701233454", "Kalle@blomqvist.se", 12345, KönTyp.KVINNA);
		
		BokKatalog bokkatalog = new BokKatalog();
		
		Bok bok1 = new Bok(1, "En Introduktion till Java", "Linus Nyrén", "12345", "Hyllan", 2000);
		Bok bok2 = new Bok(2, "Bättre Java", "Kalle Jularbo", "23456", "Lådan", 2);
		
		DVD dvd1 = new DVD(3, "En episk film om Java", "intraweb", "Stefan spelberg", "99887", 120);
		
		bokkatalog.läggTillBok(bok1);
		bokkatalog.läggTillBok(bok2);
		
		UI ui = new UI();
		ui.skrivUtRubrik();

		// ui.skrivUtBok(bok1);
		// ui.skrivUtBok(bok2);
		ui.skrivUtBokKatalog(bokkatalog.getBokarray());
		
		String söksträng = "Bättre";
		try {
			Bok hittadBok = bokkatalog.hittaBok(söksträng);
			System.out.println(hittadBok.getTitel() +" hittades");
		} catch (BookNotFoundException e) {
			System.out.println("Boken hittades inte");
		}
//		if (hittadBok != null) {
//			System.out.println(hittadBok.getTitel() +" Skriven av " +hittadBok.getFörfattare());
//		}
//		else {
//			System.out.println("Boken hittades inte");
//		}
		System.out.println(dvd1.getTitel());
		System.out.println(dvd1.getLånePeriod());
		dvd1.lånaUt(kalle);
		System.out.println(bok1.getLånePeriod());
		System.out.println(dvd1.getId());
	}
}