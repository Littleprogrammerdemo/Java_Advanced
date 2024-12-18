package DefiningClasses.BankAccount.CarSalesman;

public class Car {
    private String model;
    private Engine engine;
    private final String DEFAULT_WEIGHT_STATE = "n/a";
    private String weight = DEFAULT_WEIGHT_STATE;
    private final String DEFAULT_COLOR_STATE = "n/a";
    private String color = DEFAULT_COLOR_STATE;
    public Car(String model, Engine engine){
        this.model = model;
        this.engine = engine;
    }
    public Car(String model, Engine engine, String weight,String color){
        this(model, engine);
        this.weight = weight;
        this.color = color;
    }
    public Car(String model, Engine engine, String weight){
        this(model, engine);
        this.weight = weight;
    }
    public Car(String model, String color, Engine engine){
        this(model, engine);
        this.color = color;
    }

    @Override
    public String toString(){
        StringBuilder output = new StringBuilder();
        output.append(getModel()).append(":");
        output.append(System.lineSeparator());
        output.append(getEngine().getModel()).append(":");
        output.append(System.lineSeparator());
        output.append("Power: ").append(getEngine().getPower());
        output.append(System.lineSeparator());
        if (getEngine().getDisplacement() == -1){
            output.append("Displacement: n/a");
        }else {
            String displacement = String.valueOf(this.getEngine().getDisplacement());
            output.append("Displacement: ").append(displacement);
        }
        output.append(System.lineSeparator());
        output.append("Efficiency: ").append(getEngine().getEfficiency());
        output.append(System.lineSeparator());
        output.append("Weight: ").append(getWeight());
        output.append(System.lineSeparator());
        output.append("Color: ").append(getColor());
        return output.toString();
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
