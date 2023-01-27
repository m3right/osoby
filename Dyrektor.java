public class Dyrektor extends Nauczyciel{
  String szkola;
  public Dyrektor(String imie, String nazwisko, String przedmiot, int pensja, String szkola){
    super(imie,nazwisko,przedmiot,pensja);
    this.szkola=szkola;
  }
  public void opis() {
		super.opis();
		System.out.println("Jestem dyrektorem, moja szkola to " + szkola);
	}
}