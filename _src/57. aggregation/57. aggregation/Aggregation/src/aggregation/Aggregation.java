package aggregation;

public class Aggregation {

    public static void main(String[] args) 
    {
        Employee e = new Employee("Arek", new Address("Blabl;a", 24, "Poland"));
        
        System.out.println(e);
    }
    
}

class Employee
{
    String name;
    Address address; //aggregation
    Job job; //composition
    
    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return this.name + ": " + address.country;
    }
    
    
    
}