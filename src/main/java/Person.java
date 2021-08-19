import java.util.*;

class Person {
    private List<Wallet> personOwn;
    public Person(List<Wallet> personOwn){
        this.personOwn = personOwn;
    }
    public void addWallet(Wallet wallet){
        personOwn.add(wallet);
    }
    public List<Wallet> getPersonOwn(){
        return personOwn;
    }
}
