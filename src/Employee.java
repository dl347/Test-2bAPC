// Die Unterklasse Employee erbt von der Klasse Person und erweitert diese um zusätzliche Attribute.
class Employee extends Person{
    private String employeeId; // Mitarbeiter-ID
    private String  supervisorID; // Vorgesetzten-ID
    public int salary; // Gehalt (öffentlich zugänglich)

    // Konstruktor für Employee, der auch die Attribute der Superklasse initialisiert
    public Employee(String firstname, String lastname, int age, String employeeId, String supervisorId, int salary){
        super(firstname, lastname, age); // Aufruf des Konstruktors der Elternklasse
        this.employeeId = employeeId;
        this.supervisorID = supervisorId;
        this.salary = salary;

    }

    // Setzt das Gehalt des Mitarbeiters
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Setzt die Mitarbeiter-ID
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    // Setzt die Vorgesetzten-ID
    public void setSupervisorID(String supervisorID) {
        this.supervisorID = supervisorID;
    }

    // Erhöht das Gehalt um 1000€
    public void salaryIncrease(){
        this.salary = salary + 1000;
    }

    // Gibt alle Informationen zum Mitarbeiter aus
    public void printAll() {
        System.out.println("Name: " + fullName()); // Verwendet die Methode der Elternklasse
        System.out.println("Alter: " + age);
        System.out.println("Supervisor ID: " + supervisorID);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Gehalt: " + salary + " €");
    }
}