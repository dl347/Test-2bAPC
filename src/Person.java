// Dina Schönbacher 03.02.2025
// Die Klasse Person stellt eine allgemeine Person mit Vor- und Nachnamen sowie Alter dar
public class Person {

    private String firstname;  // Vorname der Person
    private String lastname; // Nachname der Person
    public int age; // Alter der Person (öffentlich zugänglich)

    // Konstruktor zur Initialisierung der Person-Objekte
    public Person(String firstname, String lastname, int age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    // Methode zum Ändern des Namens der Person
    public void setName(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // Methode gibt den vollständigen Namen der Person zurück
    public String fullName(){
        return firstname + " " + lastname;
    }
}


