package homework.lesson9;

import homework.lesson9.Employee;

public class MainEmployee {
    public static void main (String [] args) {
        Employee arr [] = new Employee[3];
        arr [0] = new Employee(2015, 10000, "Anastasia", "str. Gherman Pântea, 102\n");
        arr [1] = new Employee(2017, 13000, "Ion", "str. Izvoarelor, 14\n");
        arr [2] = new Employee (2020, 11500,"Igor", "Busuiocesti, 16");

        for (Employee employee : arr) {
            employee.display();
        }
    }
}
