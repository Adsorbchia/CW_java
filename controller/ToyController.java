package java_control.controller;

import java_control.model.Toy;
import java_control.server.*;
;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ToyController {

    private ListOfPrizes prizes =new ListOfPrizes();
    private ToyService toyService = new ToyService();
    PrizeDrawing prizeDrawing =new PrizeDrawing();
    Creator creator =new Creator();
    ComparatorByWeight comparator = new ComparatorByWeight();


    Toy toy1 = new Toy(1,"Лисёнок",255.0, 300.0,12,25.5);
    Toy toy2 = new Toy(2,"Совенок",355.8, 400.0, 10,35.6);
    Toy toy3 = new Toy(3,"Слоненок",275.5, 350.8, 12,27.6);
    Toy toy4 = new Toy(4,"Паросенок",200.0, 250.0, 15,20.0);
    Toy toy5 = new Toy(5,"Утка",150.0, 300.0, 16,15.0);
    Toy toy6 = new Toy(6,"Кошка",230.2, 350.2, 17,23.2);
    Toy toy7 = new Toy(7,"Собачка",205.0, 200.8, 18,20.5);
    Toy toy8 = new Toy(8,"Медвежонок",455.0, 500.9, 10,45.5);
    Toy toy9 = new Toy(9,"Кенгуру",555.9, 600.0,6,55.6);

    public void makingToyList(){
        toyService.addToys(toy1);
        toyService.addToys(toy2);
        toyService.addToys(toy3);
        toyService.addToys(toy4);
        toyService.addToys(toy5);
        toyService.addToys(toy6);
        toyService.addToys(toy7);
        toyService.addToys(toy8);
        toyService.addToys(toy9);
    }

    public void makingPrizes(){
        creator.creator(toyService,100.0,400.0,prizes);
        prizes.printToys();
    }

    public void makingContest(){
        comparator.compare(toy1,toy2);
        comparator.sorting(prizes);
        prizeDrawing.prizeDrawing(prizes);
        }
    public void makeNewList(){
        creator.correctList(prizes);
        prizeDrawing.prizeDrawing(prizes);
    }


    public void correctQ(){
        creator.correctQ(toyService,prizes);
        prizes.printToys();
    }
}
