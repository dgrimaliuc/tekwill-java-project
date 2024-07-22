package main.java.PotoracMihai.task6_19_07_24;

public class Runner {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addFunds(100);
        bank.displayBalance();
        bank.withdrawFunds(50);
        bank.displayBalance();

        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.playSong("Song1");
        musicPlayer.addVolume();
        musicPlayer.addVolume();
        musicPlayer.reduceVolume();

        Employee employee = new Employee(1, "Mihai", 1000);
        System.out.println("Employee id: " + employee.getEmployeeId());

        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(10000);
        System.out.println("Balance: " + bankAccount.getBalance());


    }
}
