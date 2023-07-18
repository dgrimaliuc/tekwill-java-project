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

    public double convertFromToMDL(double amount, Currency toConvert) {
        if(toConvert == Currency.MDL){
            return amount / toConvert.index;
        }
        else{
            return (amount * index) / toConvert.index;
        }
    }
}
