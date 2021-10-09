package e203b;

public class Main
{
    public static void main(String[] args)
    {
        // create SalariedEmployee objects
        SalariedEmployee example1 = new SalariedEmployee(650, "James", "Watt", "1234");
        SalariedEmployee example2 = new SalariedEmployee(656, "John", "Brown", "1234");
        
        // create HourlyEmployee objects
        HourlyEmployee example3 = new HourlyEmployee(40, 14, "John", "Elder", "1234");
        HourlyEmployee example4 = new HourlyEmployee(40, 15, "Ann", "Grant", "1234");        
       
        // testing ToString methods on SalariedEmployee
        System.out.println(example1);
        System.out.println(example2);
        
        // testing ToString methods on HourlyEmployee
        System.out.println(example3);
        System.out.println(example4);
        
        //testing earning on SalariedEmployee
        System.out.println(example1.earning());
        System.out.println(example2.earning());
        
        //testing earning on HourlyEmployee
        System.out.println(example3.earning());
        System.out.println(example4.earning());       
    }
 
}
