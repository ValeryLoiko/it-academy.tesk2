package by.training.homeWork.task2.train.entity;

import java.util.Date;
import java.util.Objects;

public class Train {
    private String destination;
    private int numberTrain;
    private Date departureTime;

    public Train(int numberTrain, String destination, Date departureTime) {
        this.destination = destination;
        this.numberTrain = numberTrain;
        this.departureTime = departureTime;
    }

//    public void setTrain(int numberTrain, String destination, Date departureTime){
//        setNumberTrain(numberTrain);
//        setDestination(destination);
//        setDepartureTime(departureTime);
//    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumberTrain() {
        return numberTrain;
    }

    public void setNumberTrain(int numberTrain) {
        this.numberTrain = numberTrain;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Train)) return false;
        Train train = (Train) o;
        return getNumberTrain() == train.getNumberTrain() &&
                getDestination().equals(train.getDestination()) &&
                getDepartureTime().equals(train.getDepartureTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDestination(), getNumberTrain(), getDepartureTime());
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", numberTrain=" + numberTrain +
                ", departureTime=" + departureTime +
                '}';
    }
}
