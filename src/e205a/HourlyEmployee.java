package e205a;

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
                + calcWeeklySalary() + '}';
    }

    private double calcWeeklySalary()
    {
        return hourlyRate * hoursWorkedForWeek;
    }

    @Override
    public double getPaymentAmount()
    {
        double grossPay = earning();
        grossPay = grossPay + grossPay * .3142;
        return grossPay;
    }

}
