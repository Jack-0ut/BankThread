public class Thread1 implements Runnable{
    private Bank bank;

    public Thread1(Bank bank) {
        this.bank = bank;
    }
    @Override
    public void run(){
        int count = 0;
        for(int i = 1; i <= 1000;i++){
            System.out.println("Before Inc: " + this.bank.getAccount() + " I Count: " + count);
            bank.setAccount(bank.getAccount() + 2);
            count++;
            System.out.println("After Inc: " + this.bank.getAccount() + " I Count: " + count);
        }
        System.out.println("Inc: " + bank.getAccount() + " I C: " + count);
    }
}
