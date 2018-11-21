package bokutlåning4.model;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class BokKatalog {
	private Bok[] bokarray = new Bok[100];
	//Istället för att låta programmet löpa igenom hela arrayen
	private int nästaPosition = 0;
	
	//Metod för att returnera arrayen.
	public Bok[] getBokarray() {
		return bokarray;
	}
	
	//Metod som lägger till ny bok i arrayen
	public void läggTillBok(Bok nybok) {
		bokarray[nästaPosition] = nybok;
		nästaPosition++;
	}
	// Metod för att hitta bok
	public Bok hittaBok(String söksträng) throws BookNotFoundException{
		for (int i=0; i< nästaPosition; i++) {
			if (bokarray[i].getTitel().equalsIgnoreCase(söksträng)) {
				return bokarray[i];
			}
			else if (bokarray[i].getTitel().startsWith(söksträng)) {
				return bokarray[i];
			}
			else if (bokarray[i].getTitel().toLowerCase().contains(söksträng.toLowerCase())) {
				return bokarray[i];
			}
		}
		throw new BookNotFoundException();
		
	}
}
