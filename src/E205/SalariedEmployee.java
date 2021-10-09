package E205;

public class SalariedEmployee extends Employee
{
    private double weeklySalary;

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

    @Override
    public double getPaymentAmount()
    {
        double grossPay = earning();
        grossPay = grossPay + grossPay * .3142;
        return grossPay;
    }
}
