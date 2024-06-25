abstract class Contribuintes{
    private String name;
    private Double anualIncome;


    public Contribuintes() {
    }


    public Contribuintes(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return this.anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }


    public abstract double tax();


}