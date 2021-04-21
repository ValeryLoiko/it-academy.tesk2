package by.training.homeWork.task2.train.logic;

import by.training.homeWork.task2.train.entity.Depo;
import by.training.homeWork.task2.train.entity.Train;

import java.util.Date;
import java.util.Scanner;

public class TrainLogic {

    public Train createTrain(int numberTrain, String destination, Date departuretime) {
        return new Train(numberTrain, destination, departuretime);
    }

    public Train findTrain(Depo depo, int number) {

        for (Train str : depo.getTrainList()) {
            if (str.getNumberTrain() == number)
                return str;
        }
        return null;
    }

    public void sortNumberTrain(Depo depo){
        for (int i = depo.getTrainList().size() - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if (depo.getTrainList().get(j).getNumberTrain() > depo.getTrainList().get(j + 1).getNumberTrain()){
                    swap(j, j + 1, depo);

                }
            }
        }
    }

    public void swap(int a, int b, Depo depo){
        Train tmp = depo.getTrainList().get(a);
        depo.setTrain(a, depo.getTrainList().get(b));
        depo.setTrain(b,tmp);
    }


}
