abstract class Card {
    private String type;
    private double interest;
    private double balance;
    public void setType(String type){this.type = type;}
    public void setInterest(double interest){this.interest = interest;}
    public void setBalance(double balance){this.balance = balance;}
    public String getType(){return type;}
    public double getInterest(){return interest;}
    public double getBalance(){return balance;}
}
