package traffic.trafficlight;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class TrafficLight {
    private final Lights lights;
    private TrafficState state;
    private final PropertyChangeSupport support;

    public TrafficLight() {
        lights = new Lights();
        lights.turnOn(Lights.RED);
        lights.printLights();
        support = new PropertyChangeSupport(this);
        state = new Red();
    }

    public TrafficState getColor() {
        return state;
    }

    public void next() {
       state.next(this);
       lights.printLights();
    }

    public boolean isTurnedOn(String light) {
        return lights.isTurnedOn(light);
    }

    public String getStatus() {
        return lights.getStatus();
    }

    void turnOn(String... lights) {
        this.lights.turnOn(lights);
    }

    void turnOff(String... lights) {
        this.lights.turnOff(lights);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

    public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
        support.addPropertyChangeListener(propertyName, listener);
    }

    public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {
        support.removePropertyChangeListener(propertyName, listener);
    }

    void setState(TrafficState state){
        this.state = state;
    }
}
