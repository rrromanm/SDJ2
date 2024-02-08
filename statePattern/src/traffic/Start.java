package traffic;

import dk.via.traffic.trafficlight.TrafficLight;

public class Start {
    public static void main(String[] args) throws InterruptedException {
        TrafficLight light = new TrafficLight();
        Car carA = new Car("A");
        Car carB = new Car("B");
        Car carC = new Car("C");
        Car carD = new Car("D");
        Car carE = new Car("E");
        Person personA = new Person("Roma");
        Driver driverA = new Driver(carA);
        Driver driverB = new Driver(carB);
        Driver driverC = new Driver(carC);
        TaxiDriver taxiA = new TaxiDriver(carD);
        SleepyDriver sleepy = new SleepyDriver(carE);
        Pedestrian pedestrian = new Pedestrian(personA);
        carA.start();
        carB.start();
        carC.start();
        carD.start();
        personA.walk();
        Thread.sleep(1000);
        light.addPropertyChangeListener(driverA);
        light.addPropertyChangeListener(driverB);
        light.addPropertyChangeListener(driverC);
        light.addPropertyChangeListener(taxiA);
        light.addPropertyChangeListener(sleepy);
        light.addPropertyChangeListener(pedestrian);
        light.next();
        Thread.sleep(1000);
        light.next();
        Thread.sleep(1000);
        light.addPropertyChangeListener(driverA);
        light.addPropertyChangeListener(driverB);
        light.addPropertyChangeListener(driverC);
        light.addPropertyChangeListener(taxiA);
        light.addPropertyChangeListener(sleepy);
        light.addPropertyChangeListener(pedestrian);
        light.next();
        Thread.sleep(1000);
        light.next();
        Thread.sleep(1000);
        light.next();
        Thread.sleep(1000);
        light.next();
    }
}
