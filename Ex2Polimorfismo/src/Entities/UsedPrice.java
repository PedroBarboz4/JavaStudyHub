package Entities;

import java.sql.Date;

public class UsedPrice extends Product{

    private Date manufactureDate;

    public UsedPrice(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public UsedPrice(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return getName() + "(used) $ " + getPrice() + "(Manufecture date: "+ manufactureDate + ")";
    }
}
