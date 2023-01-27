import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		Uczen jas = new Uczen("Jan", "Kowalski", "5b", 4);
		Nauczyciel adam = new Nauczyciel("Adam", "Nowak", "matematyka", 2000);
		Osoba ktos = new Osoba("Gal", "Anonim");
    Dyrektor jarek = new Dyrektor("Jarek","Kowalschki","geografia",8000,"liceum");

    ArrayList<Uczen> uczniowie = new ArrayList<Uczen>();
    ArrayList<Nauczyciel> nauczyciele = new ArrayList<Nauczyciel>();
    ArrayList<Osoba> osoby = new ArrayList<Osoba>();
    uczniowie.add(jas);
    nauczyciele.add(adam);
    nauczyciele.add(jarek);
    /*for(Nauczyciel n : nauczyciele)
    {
      n.opis();
      System.out.println();
    }*/
    
    osoby.addAll(nauczyciele);
    osoby.addAll(uczniowie);
    osoby.add(ktos);
    for(Osoba o : osoby)
    {
      o.opis();
      System.out.println();
    }
	}
}

/* Zadania:
 *  1. Dodaj kolejna klase np. Dyrektor oraz uzyj jej w podobny sposob,
 *  jak mialo to miejsce z klasami Uczen oraz Nauczyciel.
 *  2. Utworz 2 listy: nauczycieli i uczniow, podobnie jak mialo to miejsce w przykladzie
 *  z figurami.
 *  3. Uzyj w programie tych list do przechowywania obiektow.
*/

