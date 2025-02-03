// Hauptklasse mit der main-Methode zum Testen der Klassen
public class Main {
    public static void main(String[] args){
        // Erstellen eines Employee-Objekts mit Beispielwerten
        Employee employee = new Employee("Sara", "Marau", 23, "E984641", "S68446", 5620);
        employee.printAll(); // Ausgabe der aktuellen Mitarbeiterdaten

        System.out.println("\nNach Gehaltserhöhung: ");
        employee.salaryIncrease(); // Erhöhung des Gehalts
        employee.printAll(); // Erneute Ausgabe mit neuem Gehalt
    }
}
