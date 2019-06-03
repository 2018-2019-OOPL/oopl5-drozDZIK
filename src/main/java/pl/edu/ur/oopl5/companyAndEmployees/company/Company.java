package pl.edu.ur.oopl5.companyAndEmployees.company;

import pl.edu.ur.oopl5.companyAndEmployees.company.abstractClasses.AbstractCompany;
import pl.edu.ur.oopl5.companyAndEmployees.employee.Employee;

/**
 */
public class Company extends AbstractCompany {

    Employee[] tab = new Employee[100];
    static int i = 0;

    public Company(int n) {
        super(n);
    }

    @Override
    public void addEmployee(Employee e) {
        tab[i] = e;
        i++;
    }

    @Override
    public Employee[] getEmployees() {
        return tab;
    }

    @Override
    public void printEmployees() {
        for (int j = 0; j <= i; j++) {
            System.out.println(tab[j].getName());
            System.out.println(tab[j].getSurname());
            System.out.println(tab[j].getAge());
            System.out.println(tab[j].getPosition());
            System.out.println(i);
        }
    }
}