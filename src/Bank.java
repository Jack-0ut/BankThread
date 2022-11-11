public class Bank {
    private int account;
    public Bank(int account){
        this.account = account;
    }
    public void increase(){
        for(; account <= 20000;account+=2){
            System.out.println("Inc: " + account);
        }
    }

    public void  decrease(){
        for(; account > 1;account--){
            System.out.println("Dec: " + account);
        }
    }

}
