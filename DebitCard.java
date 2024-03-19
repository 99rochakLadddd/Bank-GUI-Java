
/**
 * Write a description of class DebitCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DebitCard extends BankCard 
{
    //Declarating attributes of class DebitCard// 
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
     //constructor of DebitCard class used to initialize instance variables.//
    public DebitCard(int balanceAmount, int cardId, String bankAccount, String issuerBank, String clientName, int pinNumber) 
    {
        super(balanceAmount, cardId, bankAccount, issuerBank);        
        this.pinNumber = pinNumber;
        this.withdrawalAmount = 0;
        this.dateOfWithdrawal = "";
        this.hasWithdrawn = false;
        super.setClientName(clientName);
    }
    // this is the Accessor methods for each and every attributes//
    public int getPinNumber() 
    {
        return this.pinNumber;
    }
    public int getWithdrawalAmount() 
    {
        return this.withdrawalAmount;
    }
    public String getDateOfWithdrawal() 
    {
        return this.dateOfWithdrawal;
    }
    public boolean getHasWithdrawn() 
    {
        return this.hasWithdrawn;
    }
    // this is setter method for withdrawalAmount to set withdrawalAmount //
    public void setWithdrawalAmount(int withdrawalAmount) 
    {
        this.withdrawalAmount = withdrawalAmount;
    }
    // Before withdrawal process this is the method to withdraw amount and update balanceAmount & withdrawalAmount//
    public void withdraw(int withdrawalAmount, String dateOfWithdrawal, int pinNumber) 
    {
        //this will check whether inserted pinNumber, balanceAmount is accurate,sufficient or not respectively after withdrawal process//
        if (getPinNumber() == pinNumber) {
            if (getBalanceAmount() >= withdrawalAmount) {
                setWithdrawalAmount(withdrawalAmount);
                this.dateOfWithdrawal = dateOfWithdrawal;
                this.hasWithdrawn = true;
                setBalanceAmount(getBalanceAmount() - withdrawalAmount);
            } 
            else {
                System.out.println("You have insufficient balanceAmount.Sorry!! we cannot progress forward.");
            }
        } 
        else {
            System.out.println("You have inserted inappropriate PIN number. Please re-insert your appropriate PIN number.");
        }
    }
    //this display method will display the value of attributes//
    public void display() 
    {
        super.display();//this will call display method in superclass//
        if (this.hasWithdrawn==true) { //this will check if haswithdrawn is true.//
            System.out.println("Pin Number is " + pinNumber);
            System.out.println("Date of Withdrawal  :" + dateOfWithdrawal);
            System.out.println("You have successfully withdrawn amount" + this.withdrawalAmount);
        } 
        else {
            System.out.println("Your current balance amount is " +getBalanceAmount());
        }
    }
}