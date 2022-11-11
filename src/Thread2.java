public class Thread2 implements Runnable{
    private Bank bank;
    public Thread2(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run(){
        int count = 0;
        for(int i = 1; i <= 1000;i++){
            System.out.println("Before Dec: " + this.bank.getAccount() + " D Count: " + count);
            bank.setAccount(bank.getAccount() - 1);
            count++;
            System.out.println("After Dec: " + this.bank.getAccount() + " D Count: " + count);
        }
        System.out.println("Dec: " + bank.getAccount() + " D C: " + count);
    }
}
