import java.util.*;

class Bank {
    public double getInterestByPerson(Person person){
        double total = 0;
        List<Wallet> walletList = person.getPersonOwn();
        for(int i = 0; i < walletList.size();i++){
            total+=getInterestByWallet(walletList.get(i));
        }
        return total;
    }
    public double getInterestByWallet(Wallet wallet){
        double total = 0;
        List<Card> cardList = wallet.getWallet();
        for(int i = 0; i < cardList.size();i++){
            total+=getInterestByCard(cardList.get(i));
        }
        return total;
    }
    public double getInterestByCard(Card card){
        return card.getBalance()*card.getInterest();
    }
}
