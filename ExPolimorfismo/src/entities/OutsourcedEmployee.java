package entities;

public class OutsourcedEmployee extends Employee{

    private Double addicionalCharge;

    public OutsourcedEmployee(){}

    public OutsourcedEmployee(String name, Integer hours, Double valueperHour, Double addicionalCharge) {
        super(name, hours, valueperHour);
        this.addicionalCharge = addicionalCharge;
    }

    public Double getAddicionalCharge() {
        return addicionalCharge;
    }

    public void setAddicionalCharge(Double addicionalCharge) {
        this.addicionalCharge = addicionalCharge;
    }

    @Override
    public double payment(){
        return super.payment() + addicionalCharge*1.1;
    }

}

