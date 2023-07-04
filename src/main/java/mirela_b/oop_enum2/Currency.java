package mirela_b.oop_enum2;

public enum Currency {
    USD(18.41),
    EUR(20.05),
    GBP(23.42),
    MDL(1.0);

    private final double index;

    Currency(double convertingIndex) {
        this.index = convertingIndex;
    }

    public double convertFromMDL(double amount, Currency toConvert) {
        return amount / toConvert.index;
    }

    public double convertToMDL(double amount){
        return amount * index;
    }
}
