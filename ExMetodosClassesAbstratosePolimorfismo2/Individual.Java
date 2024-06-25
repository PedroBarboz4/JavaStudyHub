class Indivudual extends Contribuintes{

    private Double healthExpeditures;

    public Indivudual(Double healthExpeditures) {
        this.healthExpeditures = healthExpeditures;
    }

    public Indivudual(String name, Double anualIncome, Double healthExpeditures) {
        super(name, anualIncome);
        this.healthExpeditures = healthExpeditures;
    }

    public Double getHealthExpeditures() {
        return healthExpeditures;
    }

    public void setHealthExpeditures(Double healthExpeditures) {
        this.healthExpeditures = healthExpeditures;
    }

    @Override
    public double tax(){

        double calcTax;

        if(getAnualIncome()<20000){
            calcTax = 0.15*getAnualIncome();
        }
        else{
            calcTax = 0.25*getAnualIncome();
        }

        healthExpeditures -= healthExpeditures*0.5;
        return calcTax + healthExpeditures;

    }
}