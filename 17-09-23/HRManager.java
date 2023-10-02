public class HRManager extends Employee{

    HRManager(int salary){
        super(salary);
    }

    void work(){
        System.out.println("HRManager working...");
    }
    void addEmployee(String employee){
        System.out.println("New employee "+employee+" added");
    }
}
