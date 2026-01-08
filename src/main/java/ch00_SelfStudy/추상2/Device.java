package ch00_SelfStudy.추상2;

public abstract class Device {
    public Device(String name) {
        this.name = name;
    }

    private String name;

    public abstract void operate();
}
