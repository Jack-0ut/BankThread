public class Bank {
    private int account;
    public Bank(int account){
        this.account = account;
    }
    public synchronized void increase(){
        for(; account <= 20000;account+=2){
            System.out.println("Inc: " + account);
        }
    }

    public synchronized void  decrease(){
        for(; account > 1;account--){
            System.out.println("Dec: " + account);
        }
    }

}
