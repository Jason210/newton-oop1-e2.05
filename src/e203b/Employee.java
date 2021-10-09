package e203b;

public abstract class Employee
{
    // fields
    private String firstName;
    private String lastName;
    private String ssn;     

    // constructor
    public Employee(String firstName, String lastName, String ssn)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    // getters
    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getSsn()
    {
        return ssn;
    }
    
    // methods
    @Override
    public String toString()
    {
        return "Employee{" + "firstName=" + firstName + ", lastName=" + lastName + ", ssn=" + ssn + '}';
    }    
    
    public abstract double earning();
}
