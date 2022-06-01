package practise;

import lists.classes.Employee;

import java.util.ArrayList;
import java.util.List;

public class First {
    public static void main(String args[]){

        // add 3 numbers
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        int sum = x + y + z;
        System.out.println("sum of XYZ = " + sum);

        List<String> names = new ArrayList<String>();

        names.add("name");
        names.add("bob");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        List<Employee> employeeList = new ArrayList();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));
        employeeList.add(new Employee("Saad", "", 7777));
        System.out.println(employeeList.get(4));

        List<Integer> temp=new ArrayList<Integer>();
        temp.add(1);
        temp.add(2);
        temp.add(3);
        System.out.println(temp.size());
        for(Integer a:temp){
            System.out.println(a);
        }
        System.out.println("Hello everyone");

        employeeList.forEach(employee -> {System.out.println(employee.getId());});

        names.forEach(name -> {System.out.println(name);});
    }
}
