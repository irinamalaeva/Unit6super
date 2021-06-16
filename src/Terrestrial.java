
public abstract class Terrestrial extends Transport {
    public int quantityWheel;
    public double fuelConsumption;

    public String describe() {
        super.describe();
        return super.describe() + "quantity of wheel = " + quantityWheel + "; consumption of fuel = "
                + fuelConsumption + " л/100км ;";
    }
}
