public class Office {
public static void main(String[] args){
    Employee employee1 = new Employee(40000);
    employee1.getSalary();
    HRManager hr1 = new HRManager(70000);
    hr1.getSalary();
    hr1.addEmployee("Sajit");
}    
}
