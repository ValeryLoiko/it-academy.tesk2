package by.training.homeWork.task2.train.logic;

import by.training.homeWork.task2.train.entity.Train;

import java.util.Comparator;

public class SortDate implements Comparator<Train> {
    @Override
    public int compare(Train a, Train b) {
        return a.getDepartureTime().compareTo(b.getDepartureTime());
    }
}
