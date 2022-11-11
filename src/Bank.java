public class Bank {
    private int account;
    public Bank(int account){
        this.account = account;
    }
    public void increase(){
        for(int i = 1; i <= 20000;i++){
            account+=2;
            System.out.println("Inc: " + account);
        }
    }

    public void  decrease(){
        for(int i = 1; i <= 20000;i++){
            account--;
            System.out.println("Dec: " + account);
        }
    }

}
