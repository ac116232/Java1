package money;

public class Wallet {

    private int wallet;
    private int totalWallet;
    private int cost;

    public Wallet (int wallet){
        this.wallet = wallet;
        totalWallet = wallet + totalWallet;
    }
    public void setWallet(){


    }
    public int getTotalWallet(){
        return totalWallet;
    }
    public void setCost(int c){

    }
}
