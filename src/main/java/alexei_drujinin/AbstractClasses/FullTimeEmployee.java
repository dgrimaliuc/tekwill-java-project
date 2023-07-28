package alexei_drujinin.AbstractClasses;

public  class FullTimeEmployee extends Employee{
    private int dailyRate;
    private  int dayPerMount;
    public FullTimeEmployee(int dailyRate,int dayPerMount){
        this.dailyRate=dailyRate;
        this.dayPerMount=dayPerMount;
    }
    @Override
    public double calculateSalary(){
        return dailyRate*dayPerMount;
    }

}
