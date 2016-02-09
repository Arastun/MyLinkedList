/**
 * Created by Root on 09.02.2016.
 */
public class Smartphone {
    enum Manufacturer {SAMSUNG, APPLE, HTC, LG, SONY};
    Manufacturer manufacturer;
    int displaySize;
    int memory;
    String cpu;

    public Smartphone(Manufacturer manufacturer, int displaySize, int memory, String cpu) {
        this.manufacturer = manufacturer;
        this.displaySize = displaySize;
        this.memory = memory;
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return  "{" +
                "manufacturer=" + manufacturer +
                ", displaySize=" + displaySize +
                ", memory=" + memory +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
