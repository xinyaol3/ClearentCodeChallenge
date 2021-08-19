import java.util.*;

class Wallet {
    private List<Card> wallet;
    public Wallet(List<Card> wallet){
        this.wallet = wallet;
    }
    public void addCard(Card card){
        wallet.add(card);
    }
    public List<Card> getWallet(){
        return wallet;
    }
}
