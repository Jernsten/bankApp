public class Wallet {
    private double saldo;
    private String owner;
    
    public Wallet(double saldo, String owner) {
        this.saldo = saldo;
        this.owner = owner;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public String getOwner() {
        return owner;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }
}