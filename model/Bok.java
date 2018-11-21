package bokutlåning4.model;

public class Bok extends Media{
	
	
	private String författare;
	private String isbn;
	private int antalsidor;
	
	//Konstruktor
	public Bok(int id, String titel, String författare, String isbn, String plats, int antalsidor) {
		super(id, titel, plats);
		this.författare = författare;
		this.isbn = isbn;
		this.antalsidor = antalsidor;
	}

	public String getFörfattare() {
		return författare;
	}

	public String getIsbn() {
		return isbn;
	}

	@Override
	public int getLånePeriod() {
		return 21;
	}
	
	
	
	
}
