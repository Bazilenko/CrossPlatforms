package Match;

import java.time.LocalDate;
import java.util.Date;

public class NfsMatch extends Match {
    String carName;
    double maxSpeed;
    int place;
    String map;

    public NfsMatch(LocalDate date, String result, String carName, double maxSpeed, int place, String map){
        super(date, result);
        this.setMap(map);
        this.setCarName(carName);
        this.setMaxSpeed(maxSpeed);
        this.setPlace(place);
        this.setMap(map);
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public int getPlace() {
        return place;
    }

    public String getCarName() {
        return carName;
    }

    public String getMap() {
        return map;
    }
}
