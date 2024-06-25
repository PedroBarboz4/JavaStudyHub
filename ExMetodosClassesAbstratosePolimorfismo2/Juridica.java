class Juridica extends Contribuintes{

    private  int numberofEmployees;

    public Juridica(int numberofEmployees) {
        this.numberofEmployees = numberofEmployees;
    }

    public Juridica(String name, Double anualIncome, int numberofEmployees) {
        super(name, anualIncome);
        this.numberofEmployees = numberofEmployees;
    }

    public int getNumberofEmployees() {
        return numberofEmployees;
    }

    public void setNumberofEmployees(int numberofEmployees) {
        this.numberofEmployees = numberofEmployees;
    }

    @Override
    public double tax(){

        double calcTax;

        if(numberofEmployees>10){
             calcTax = 0.14*getAnualIncome();
        }
        else{
             calcTax = 0.16*getAnualIncome();
        }

        return calcTax;
    }

}
