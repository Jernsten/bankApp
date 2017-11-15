public class Main {
    public static void main(String[] args) {
        Wallet wallet = new Wallet(1000,"Kemangiessa");
        
        Transfer.takeIn(wallet, 40);
        Transfer.swish(wallet,100,"0704431237");
        
    }
}
