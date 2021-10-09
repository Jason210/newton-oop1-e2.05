package e203b;

public class HourlyEmployee extends Employee
{
    private double hoursWorkedForWeek;
    private double hourlyRate;

    public HourlyEmployee(double hoursWorkedForWeek, double hourlyRate,
            String firstName, String lastName, String ssn)
    {
        super(firstName, lastName, ssn);
        this.hoursWorkedForWeek = hoursWorkedForWeek;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double earning()
    {
        return calcWeeklySalary();
    }

    @Override
    public String toString()
    {
                return "Employee{" + "firstName=" + getFirstName() + ", lastName=" 
                + getLastName() + ", ssn=" + getSsn() + ", weeklySalary=" 
                + calcWeeklySalary() + '}'; //To change body of generated methods, choose Tools | Templates.
    }

    private double calcWeeklySalary()
    {
        return hourlyRate * hoursWorkedForWeek;
    }  
}
