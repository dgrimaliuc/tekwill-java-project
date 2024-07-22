package RevaSadovnicova;

public class BankAccount {
    private Integer numberID;
    private double balance;
    private String holderName;

    public void Employee(Integer numberID,double balance,String holderName){
        this.numberID= numberID;
        this.balance = balance;
        this.holderName = holderName;
    }

    public Integer getNumberID(){
        return numberID;
    }

    public void setNumberID(){
         this.numberID = numberID;

    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(){
        this.balance=balance;
    }

    public String getHolderName(){
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
}
