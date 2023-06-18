/**
 * в классе написан метод, отвечающий за проведение самого конкурса.Выпадать будет игрушка с болшим весом,
 * а так как список отсортитрован по весу по убыванию, то выпадать будет 1-ая в списке игрушка
 */
package java_control.server;
public class PrizeDrawing {
    public  void prizeDrawing(ListOfPrizes listP) {
      if (listP.getPrizes().size()!=0){
        System.out.println("Поздравляем, вы выйграли");
        System.out.println(listP.getPrizes().get(0));}

      else{
          System.out.println("Увы, розыгрыш закончился игрушек больше нет");}}


}





