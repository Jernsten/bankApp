public class Main {
    public static void main(String[] args) {
        Wallet wallet = new Wallet(1000,"Kemangiessa");
        Transfer transfer = new Transfer();
        
        transfer.takeIn(wallet, 40);
    }
}
