public class Transfer {
    
    public static void takeIn(Wallet wallet, int amount) {
        wallet.setSaldo(wallet.getSaldo() + amount);
    }
    
    public static void swish(Wallet wallet, int amount, String phoneNumber){
        //swishing away money to phoneNumber
        wallet.setSaldo(wallet.getSaldo()-amount);
    }
}
