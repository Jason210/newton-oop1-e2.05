package e203b;

public class SalariedEmployee extends Employee
{
    // fields
    private double weeklySalary;

    // constructor
    public SalariedEmployee(double weeklySalary, String firstName,
            String lastName, String ssn)
    {
        super(firstName, lastName, ssn);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earning()
    {
        return weeklySalary;
    }

    @Override
    public String toString()
    {
        return "Employee{" + "firstName=" + getFirstName() + ", lastName=" 
                + getLastName() + ", ssn=" + getSsn() + ", weeklySalary=" 
                + weeklySalary + '}';
    }


    
    
}
