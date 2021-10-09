package E205;

public abstract class Employee implements IPayable
{
    private String firstName;
    private String lastName;
    private String ssn;     

    public Employee(String firstName, String lastName, String ssn)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

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
