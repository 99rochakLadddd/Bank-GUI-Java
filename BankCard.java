 
/**
 * Write a description of class BankCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankCard 
{
    private int cardId;
    private String clientName; 
    private String issuerBank;
    private String bankAccount;
    private int balanceAmount;
    /* Here four parameters are inserted and each attributes are initialized with their specific parameter values*/
    public BankCard(int balanceAmount, int cardId, String bankAccount, String issuerBank) 
    {
        this.balanceAmount = balanceAmount;
        this.cardId = cardId;
        this.bankAccount = bankAccount;
        this.issuerBank = issuerBank;
        this.clientName = "";
    }
    //this is the accessor method for cardId//
    public int getCardId() 
    {
        return this.cardId;
    }
    //this is the accessor method for bankAccount//
    public String getBankAccount() 
    {
        return this.bankAccount;
    }
    //this is the accessor method for balanceAmount//
    public int getBalanceAmount() 
    {
        return this.balanceAmount;
    } 
    //this is the accessor method for clientName//
    public String getClientName() 
    {
        return this.clientName;
    }
    //this is the accessor method for issuerBank//
    public String getIssuerBank() 
    {
        return this.issuerBank;
    }
    //this mutator method clientName doesnt returns the name of client//
    public void setClientName(String clientName) 
    {
        this.clientName = clientName;
    }
    //this  mutator method balanceAmount doesnt returns the amount//
    public void setBalanceAmount(int amount)
    {
        this.balanceAmount = amount;
    }   
    //this is the display method//
    public void display() 
    {
        if (this.clientName.equals("")) 
        {
            System.out.println("Client name not assigned.");
        } 
        else 
        {
            System.out.println("Card ID is: " + this.cardId);
            System.out.println("Client name is : " + this.clientName);
            System.out.println("Issuer bank is : " + this.issuerBank);
            System.out.println("Bank account is : " + this.bankAccount);
            System.out.println("Balance amount is : " + this.balanceAmount);
        }
    }
}