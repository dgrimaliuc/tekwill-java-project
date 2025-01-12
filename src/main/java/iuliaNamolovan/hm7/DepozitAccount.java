package main.java.iuliaNamolovan.hm7;

public class DepozitAccount extends BankAccount {
    double RataDobinzii;
    double SoldMinim;

    public DepozitAccount(String NT, double s, int NC, double RD, double SMin) {
        super(NT, s, NC);
        this.RataDobinzii = RD;
        this.SoldMinim = SMin;
    }

    public String toString() {
        return "DepozitAccount{" +
                "Nume Titular='" + NumeTitular + '\'' +
                ", Sold=" + Sold +
                ", Numar Cont=" + NumarCont +
                ", Rata Dobânzii=" + RataDobinzii +
                ", Sold Minim=" + SoldMinim +
                '}';
    }
}
