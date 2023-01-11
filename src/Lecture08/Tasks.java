package Lecture08;

import Lecture08.Employee;


public class Tasks {
        public static void main(String[] args) {
            Employee employee = new Employee(5, "Alex", "Krastev", 200);
            String name = employee.getName();
            double annualSalary = employee.getAnnualSalary();
            System.out.println(employee);

            double riseSalary = employee.riseSalary(10);

            System.out.println(employee);




        }
    }




