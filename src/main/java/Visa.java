class Visa extends Card{
    public Visa(double balance){
        super.setType("Visa");
        super.setBalance(balance);
        super.setInterest(0.1);
    }
}
