package by.training.homeWork.task2.train.start;

import by.training.homeWork.task2.train.entity.Depo;
import by.training.homeWork.task2.train.entity.Train;
import by.training.homeWork.task2.train.logic.SortDate;
import by.training.homeWork.task2.train.logic.SortDestination;
import by.training.homeWork.task2.train.logic.TrainLogic;
import by.training.homeWork.task2.train.view.View;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Train> trainList = new ArrayList<Train>();
        Depo depo = new Depo(trainList);
        TrainLogic logic = new TrainLogic();
        View view = new View();

        Train train1 = logic.createTrain(2, "Minsk", new Date(2021, 03, 12, 13, 32));
        Train train2 = logic.createTrain(4, "Berlin", new Date(2021, 03, 13, 00, 00));
        Train train3 = logic.createTrain(1, "Warszawa", new Date(2021, 03, 14, 02, 00));
        Train train4 = logic.createTrain(3, "Wroclaw", new Date(2021, 03, 15, 05, 00));
        Train train5 = logic.createTrain(5, "Grodno", new Date(2021, 03, 21, 10, 00));

        depo.addTrain(train1);
        depo.addTrain(train2);
        depo.addTrain(train3);
        depo.addTrain(train4);
        depo.addTrain(train5);

        //   поезда которые находятся в дэпо
        view.printTrainsDepo(depo);
        System.out.println("////////////");
        System.out.println();


        // информация о поезде номер которого введен пользователем
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Train infoTrainNumber = logic.findTrain(depo, num);
        view.printInformationTrain(infoTrainNumber);
        System.out.println("////////////");
        System.out.println();

        //сортировка пузырьком (по номеру поезда)
        logic.sortNumberTrain(depo);
        view.printTrainsDepo(depo);
        System.out.println("////////////");
        System.out.println();


       /*  я пока не смог написать сортировку по двум параметрам вручную (((
         не делал этого раньше, и с "comparatorom" впервые сталкнулся
         сортировку пузырьком напишу на бумаге

        https://metanit.com/java/tutorial/5.6.php   */

        Comparator<Train> pcopm = new SortDestination().thenComparing(new SortDate());
        Collections.sort(depo.getTrainList(), pcopm);
        view.printTrainsDepo(depo);

    }
}
