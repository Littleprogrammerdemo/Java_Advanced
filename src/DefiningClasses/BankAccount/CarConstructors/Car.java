package DefiningClasses.BankAccount.CarConstructors;

public class Car {
    private String brand;
    private String model;
    private int horsePowers;
    public  Car(String brand){
        this.brand = brand;
        this.model = "unknown";
        this.horsePowers = -1;
    }
    public Car(String brand, String model, int horsePowers){
        this(brand);
        this.model = model;
        this.horsePowers = horsePowers;
    }
    public int getHorsePowers(){
        return this.horsePowers;
    }
    public String getBrand(){
        return this.brand;
    }
    public String getModel(){
        return this.model;
    }
    public void setHorsePowers(int horsePowers){
        this.horsePowers = horsePowers;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String carInfo(){
        return String.format("The car is: %s %s - %d HP.", this.brand, this.model, this.horsePowers);
    }
}