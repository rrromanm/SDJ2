package traffic;

import dk.via.traffic.trafficlight.Lights;
import dk.via.traffic.trafficlight.TrafficLight;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Pedestrian implements PropertyChangeListener {
    private final Person person;
    public Pedestrian(Person person){
        this.person = person;
    }
    private void onLightChange(TrafficLight light) {
        if(light.isTurnedOn(Lights.GREEN)){
            person.waiting();
        }
        else if(light.isTurnedOn(Lights.YELLOW)){
            person.running();
        }
        else if(light.isTurnedOn(Lights.GREEN)){
            person.walk();
        }
        else{
            person.waiting();
        }
    }
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        TrafficLight light = (TrafficLight) evt.getSource();
        onLightChange(light);
    }


}
