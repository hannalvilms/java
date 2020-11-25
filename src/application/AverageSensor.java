package application;

import java.util.*;

public class AverageSensor implements Sensor {

    private final List<Sensor> sensors;
    private final List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor additional) {
        this.sensors.add(additional);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : this.sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor sensor : this.sensors) {
            sensor.on();
        }
    }

    @Override
    public void off() {
        for (Sensor sensor : this.sensors) {
            sensor.off();
        }
    }

    @Override
    public int measure() {
        if (this.sensors.isEmpty()) {
            throw new IllegalStateException();
        }
        int sum = 0;
        for (Sensor sensor : this.sensors) {
            sum += sensor.measure();
        }
        int reading = sum / this.sensors.size();
        this.readings.add(reading);
        return reading;
    }

    public List<Integer> readings() {
        return this.readings;
    }
}
