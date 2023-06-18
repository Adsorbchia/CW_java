/**
 * Розыгрыш в магазине игрушек. В розыгрыше учавствуют игрушки чей вес неменее 100 гр и цена неболее 400 р
 */
package java_control.viev;
import java_control.controller.ToyController;
public class Main {public static void main(String[] args) {
    ToyController toyController =new ToyController();
    toyController.makingToyList();
    System.out.println("Список игрушек, учавствующих в розыгрыше");
    toyController.makingPrizes();
    System.out.println("1-ый розыгрыш игрушки");
    toyController.makingContest();
    System.out.println("2-ой розыгрыш игрушки " );
    System.out.println("Список игрушек, учавствующих в розыгрыше");
    toyController.correctQ();
    toyController.makeNewList();
    System.out.println("3-ий розыгрыш игрушки");
    System.out.println("Список игрушек, учавствующих в розыгрыше");
    toyController.correctQ();
    toyController.makeNewList();
}}
