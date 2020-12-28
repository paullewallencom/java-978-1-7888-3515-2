package whatareinterfaces;

import java.util.Arrays;
import java.util.Collections;

public class Main {


    public static void main(String[] args) 
    {
        Programmer[] p = new Programmer[3];
        p[0] = new Programmer(10000);
        p[1] = new Programmer(2000);
        p[2] = new Programmer(5000);
        
        
        for (Programmer programmer: p)
        {
            System.out.println(programmer.getSalary());
        }
        
        Arrays.sort(p, Collections.reverseOrder());

        for (Programmer programmer: p)
        {
            System.out.println(programmer.getSalary());
        }        
//        
//        int[] a = new int[3];
//        a[0] = 5;
//        a[1] = -55;
//        a[2] = 15;
//        
//        Arrays.sort(a);
        
        System.out.println(p[0].compareTo(p[1]));
        
        
    }
    
}

class Employee implements Comparable
{
    private double salary;
    
    public Employee(double salary)
    {
        this.salary = salary;
    }

    double getSalary()
    {
        return this.salary;
    }

    @Override
    public int compareTo(Object t) 
    {
        Employee tmp = (Employee)t;
        
        if (this.salary < tmp.salary)
            return -1;
        
        if (this.salary > tmp.salary)
            return 1;
        
        return 0;
    }
}

class Programmer extends Employee
{
    public Programmer(double salary)
    {
        super(salary);
    }
}