package day35_Encapsulation.encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Tatiana", 'F', 28, 110000);
        employee1.setName("Elvira");

        System.out.println(employee1);


    }
}
