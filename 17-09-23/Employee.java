public class Employee {
    int salary;


    Employee(int salary){
        this.salary = salary;
    }

    void work(){
        System.out.println("Employee working...");
    }
    
    void getSalary(){
        System.out.println("Salary="+salary);
    }

}
