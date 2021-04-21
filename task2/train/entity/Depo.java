package by.training.homeWork.task2.train.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Depo {
    private List<Train> trainList;

    public Depo() {
        this.trainList = new ArrayList<Train>();
    }

    public Depo(List<Train> trainList) {
        this.trainList = trainList;
    }

    public void addTrain(Train str){
        trainList.add(str);
    }

    public List<Train> getTrainList() {
        return trainList;
    }

    public void setTrainList(List<Train> trainList) {
        this.trainList = trainList;
    }
    public Train getTrain(int i){
        return trainList.get(i);
    }
    public void setTrain(int i, Train train){
        trainList.set(i,train);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Depo)) return false;
        Depo depo = (Depo) o;
        return getTrainList().equals(depo.getTrainList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTrainList());
    }

    @Override
    public String toString() {
        return "Depo{" +
                "trainList=" + trainList +
                '}';
    }
}
