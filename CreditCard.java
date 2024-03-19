 
/**
 * Write a description of class CreditCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreditCard extends BankCard 
{
    // instance variable is declared
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    // 8 parameters are created//
    public CreditCard(int cardId, String clientName, String issuerBank, String bankAccount, int balanceAmount, int cvcNumber, double interestRate, String expirationDate) {
        super(balanceAmount, cardId, bankAccount, issuerBank);
        this.cvcNumber = cvcNumber;
        this.expirationDate = expirationDate;
        this.interestRate = interestRate;
        this.isGranted = false;
        super.setClientName(clientName);
    }
    // this is accessor method//
    public int getCvcNumber() 
    {
        return this.cvcNumber;
    }
    public double getInterestRate() 
    {
        return this.interestRate;
    }
    public double getCreditLimit() 
    {
        return this.creditLimit;
    }
    public String getExpirationDate() 
    {
        return this.expirationDate;
    }
    public int getGracePeriod() 
    {
        return this.gracePeriod;
    }
    public boolean getIsGranted() 
    {
        return this.isGranted;
    }
        //this is the setter method with 2 parameter//
    public void setCreditLimit(double creditLimit, int gracePeriod) 
    {
        if (super.getBalanceAmount() * 2.5 >= creditLimit) 
        {
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod;
            this.isGranted = true;
        } else {
            System.out.println("Sorry!! Credit cannot be issued.");
        }
    }
    //cancelCreditCard method is created//
    public void cancelCreditCard() 
    {
        this.cvcNumber = 0;
        this.gracePeriod=0;
        this.creditLimit=0;
        this.isGranted= false;
    }
    //this method will help to display//
    public void display() 
    {
        System.out.println("Interest rate :" + this.interestRate);
        System.out.println("Expiration date :" + this.expirationDate);
        if (this.isGranted==true) 
        {
            super.display(); //this will call display method from super class//
            System.out.println("CVC number: " + this.cvcNumber);
            System.out.println("Credit limit: " + this.creditLimit);
            System.out.println("Grace period: " + this.gracePeriod);
        }
    }
}