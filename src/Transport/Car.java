package Transport;

import Driver.Driver;
import Driver.Sponsor;

import java.util.*;


public abstract class Car {

    protected String brand;
    protected String model;
    protected double engine;
    private final Set<Driver> drivers=new HashSet<>();
    private final Set<Mechanic> mechanics=new HashSet<>();
    private final Set<Sponsor> sponsors=new HashSet<>();

    public Car(String brand, String model, double engine) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "Инфо отсуствует";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty()) {
            this.model = "Инфо отсуствует";
        } else {
            this.model = model;
        }
        setEngine(engine);
    }

    public void addDriver(Driver drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }
    public void addMechanic(Mechanic mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }
    public void addSponsor(Sponsor...sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }
    public final String getBrand() {
        return brand;
    }

    public final String getModel() {
        return model;
    }

    public final double getEngine() {
        return engine;
    }

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public Set<Mechanic> getMechanics() {
        return mechanics;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    protected final void setEngine(double engine) {
        if (engine <= 1) {
            this.engine = 2;
        } else {
            this.engine = engine;
        }
    }

    public void startMoving() {
        System.out.println("Начать движение");
    }

    public void stopMoving() {
        System.out.println("Закончить движение");
    }

    public void getInfoCar() {
        System.out.println("Название: " + getBrand() + ", модель: " + getModel() + ", объем двигателя: " + getEngine());
    }

    public abstract void printType();

    public abstract boolean diagnostic();

    public abstract void repair();
}
