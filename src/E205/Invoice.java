package E205;

public class Invoice implements IPayable
{
    private String invoiceNumber;
    private int quantity;
    private double pricePerItem;

    public Invoice(String invoiceNumber, int quantity, double pricePerItem)
    {
        this.invoiceNumber = invoiceNumber;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double getPaymentAmount()
    {
        return pricePerItem * quantity;
    }  
}
