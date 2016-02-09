/**
 * Created by Root on 09.02.2016.
 */
public class Car {
    enum Model {Mercedes, BMW, TOYOTA};
    Model model;
    int vin;
    String year;

    public Car(Model model, int vin, String year) {
        this.model = model;
        this.vin = vin;
        this.year = year;
    }

    @Override
    public String toString() {
        return  "{" +
                "model=" + model +
                ", vin=" + vin +
                ", year='" + year + '\'' +
                '}';
    }
}
