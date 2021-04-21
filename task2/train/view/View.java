package by.training.homeWork.task2.train.view;

import by.training.homeWork.task2.train.entity.Depo;
import by.training.homeWork.task2.train.entity.Train;

public class View {

    public void printTrainsDepo(Depo depo) {
        for (Train str : depo.getTrainList()) {
            System.out.println(str);
        }
    }

    public void printInformationTrain(Train str) {
        System.out.println("Номер поезда : " + str.getNumberTrain() +
                ". Пункт назначения : " + str.getDestination() +
                ". Время отправления  : " + str.getDepartureTime());

    }
}
