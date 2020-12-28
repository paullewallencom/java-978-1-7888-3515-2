package pkginstanceof;

public class Main {

    public static void main(String[] args) 
    {
       Person[] people = new Person[400]; // null, null, null, null
       people[0] = new Employee("Arkadiusz", "Włodarczyk", 100000000);
       people[1] = new Student("asfasf", "fasf"); 
     
       
       for (int i = 0; i < people.length; i++)
       {
           if (people[i] instanceof Employee)
           {
               Employee tmp = (Employee)people[i];
               
               tmp.work();
           }
           
           
           
           /*
            INSTRUCTIONS
           */
       }
      
       
    }
    
}

abstract class Person //super
{
    Person()
    {
        
    }
    Person(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }
    String name;
    String surname;
    
    abstract void getDescription();
}

class Employee extends Person //sub-clas
{
    double salary;

    public Employee(String name, String surname, double salary)
    {
        super(name, surname);
        this.salary = salary;
    }
    @Override
    void getDescription() 
    {
        System.out.println("I'm employee");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Salary: " + salary);
    }
    void work()
    {
        System.out.println("i'm working");
    }

}

class Student extends Person
{
   
    public Student(String name, String surname)
    {
        super(name, surname);
    }     
     @Override
    void getDescription() 
    {
        System.out.println("I'm student");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);       
    }
    
}