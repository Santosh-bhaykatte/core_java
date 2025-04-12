package core_Java.practice;

abstract class Engine {
    private int id;
    private double capacity;
    private String type;
    private String size;
    public Engine(int id, double capacity, String type, String size) {
        this.id = id;
        this.capacity = capacity;
        this.type = type;
        this.size = size;
    }

    // getters & setters
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
    public double getCapacity() {
        return capacity;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getSize() {
        return size;
    }

    // engine methods
    public void startEngine() {
        System.out.println("Engine started");
    }
    @Override
    public String toString() {
        return "Engine [id = "+ id +", capacity = "+ capacity +", type = "+ type +", size = "+ size +"]";
    }
}

class Car {
    Engine engine;      // HAS-A relationship       [Car has a engine]
                        // IS-PART-OF relationship  [engine is part of Car]
    public Car(Engine engine) {
        this.engine = engine;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public Engine getEngine() {
        return engine;
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        Car car = new Car(new Engine(11, 120, "normal", "small") {
            @Override
            public void setId(int id) {
                super.setId(id);
            }
            @Override
            public void setCapacity(double capacity) {
                super.setCapacity(capacity);
            }
            @Override
            public void setType(String type) {
                super.setType(type);;
            }
            @Override
            public void setSize(String size) {
                super.setSize(size);
            }
        });

        Engine engine = car.getEngine();

        engine.startEngine();
        System.out.println(engine.toString());
    }
}
