public class Osoba {
	String imie;
	String nazwisko;

	public Osoba(String imie, String nazwisko) {
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

	public void opis() {
		System.out.println("Nazywam sie " + imie + " " + nazwisko);
	}
}
