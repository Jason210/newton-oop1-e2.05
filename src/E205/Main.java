package E205;

public class Main
{
    public static void main(String[] args)
    {
        IPayable[] accounts = new IPayable[4];
        
        accounts[0] = new SalariedEmployee(650, "James", "Watt", "1234");
        accounts[1] = new SalariedEmployee(656, "John", "Brown", "1234");
        accounts[2] = new HourlyEmployee(40, 14, "John", "Elder", "1234");
        accounts[3] = new Invoice("A15", 45, 23); 
        
        for (IPayable acc : accounts)
        {
            System.out.println(acc.getPaymentAmount());
        }        
    }
}
