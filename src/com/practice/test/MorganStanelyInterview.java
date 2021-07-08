package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Employee
{
    public String name;
    public String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}

class Value
{
    public Employee employee;

    public Value(Employee employee) {
        this.employee = employee;
    }
}


public class MorganStanelyInterview {

    public static void main(String[] args) {
        ArrayList<Employee> employeeList=new ArrayList<>();
        Employee employee1=new Employee("amar","1");
        Employee employee2=new Employee("abhi","2");
        employeeList.add(employee1);
        employeeList.add(employee2);
        Map<Map<String,String>,Object> employeeLabelMap=new HashMap<>();

        ArrayList<Object> labelList=new ArrayList<>();


        for(Employee employee:employeeList)
        {
           /* employeeLabelMap.put(new HashMap("label",employee.name),new Value(employee));*/
            labelList.add(employeeLabelMap);
        }
        System.out.println(employeeLabelMap);
    }


}
