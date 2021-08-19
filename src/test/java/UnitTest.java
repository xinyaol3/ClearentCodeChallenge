import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class UnitTest {
    public Person p1;
    public Person p2;
    public Person p3;
    public Person p4;
    Bank bank = new Bank();
    public UnitTest(){
        //testcase1 setting
        Card mc1= new MC(100);
        Card visa1 = new Visa(100);
        Card discover1 = new Discover(100);
        List<Card> cardList1 = new ArrayList<>();
        cardList1.add(mc1);
        cardList1.add(visa1);
        cardList1.add(discover1);
        Wallet wallet1 = new Wallet(cardList1);
        List<Wallet> walletList1 = new ArrayList<>();
        walletList1.add(wallet1);
        p1 = new Person(walletList1);
        //testcase2 setting
        List<Card> cardList2 = new ArrayList<>();
        cardList2.add(visa1);
        cardList2.add(discover1);
        Wallet wallet2 = new Wallet(cardList2);
        List<Card> cardList3 = new ArrayList<>();
        cardList3.add(mc1);
        Wallet wallet3 = new Wallet(cardList3);
        List<Wallet> walletList2 = new ArrayList<>();
        walletList2.add(wallet2);
        walletList2.add(wallet3);
        p2 = new Person(walletList2);
        //TestCase 3 setting
        Card mc2= new MC(100);
        Card visa2 = new Visa(100);
        List<Card> cardList4 = new ArrayList<>();
        cardList4.add(mc1);
        cardList4.add(visa1);
        cardList4.add(mc2);
        cardList4.add(visa2);
        Wallet wallet4 = new Wallet(cardList4);
        List<Wallet> walletList3 = new ArrayList<>();
        walletList3.add(wallet4);
        p3 = new Person(walletList3);
        List<Card> cardList5 = new ArrayList<>();
        cardList5.add(mc1);
        cardList5.add(visa1);
        Wallet wallet5 = new Wallet(cardList5);
        List<Wallet> walletList4 = new ArrayList<>();
        walletList4.add(wallet5);
        p4 = new Person(walletList4);
    }
    @Test
    public void testCase1() {
        //total interest for person who hold one wallet with 1 MC, 1 Visa, 1 Discover
        assertEquals(16.0,bank.getInterestByPerson(p1),0.001);
        //total interest for his MC card
        assertEquals(5.0,bank.getInterestByCard(p1.getPersonOwn().get(0).getWallet().get(0)),0.001);
        //total interest for his Visa card
        assertEquals(10.0,bank.getInterestByCard(p1.getPersonOwn().get(0).getWallet().get(1)),0.001);
        //total interest for his Discover card
        assertEquals(1.0,bank.getInterestByCard(p1.getPersonOwn().get(0).getWallet().get(2)),0.001);
    }
    @Test
    public void testCase2(){
        //total interest for person who hold 2 wallets, one with 1 Visa and 1 Discover, the other with 1 MC
        assertEquals(16.0,bank.getInterestByPerson(p2),0.001);
        //total interest for his first wallet with 1 Visa and 1 Discover
        assertEquals(11.0,bank.getInterestByWallet(p2.getPersonOwn().get(0)),0.001);
        //total interest for his second wallet with 1 MC
        assertEquals(5.0,bank.getInterestByWallet(p2.getPersonOwn().get(1)),0.001);
    }
    @Test
    public void testCase3(){
        //total interest for first person who hold 1 wallet with 2 MC and Visa
        assertEquals(30.0,bank.getInterestByPerson(p3),0.001);
        //total interest for first person's wallet
        assertEquals(30.0,bank.getInterestByWallet(p3.getPersonOwn().get(0)),0.001);
        //total interest for second person who hold 1 wallet with 1 MC and Visa
        assertEquals(15.0,bank.getInterestByPerson(p4),0.001);
        //total interest for second person's wallet
        assertEquals(15.0,bank.getInterestByWallet(p4.getPersonOwn().get(0)),0.001);
    }
}
