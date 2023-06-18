/**
 * Классв котором,реализовано 3 метода. 1-ый создаёт список призов по заданным критериям,2-ой
 * корректирует количество игрушек, после проведения конкурса, 3-ий корректирует список, сдвигая 1-ый элемент
 * списка в конец
 */

package java_control.server;
import java_control.model.Toy;
public class Creator {
    public void creator(ToyService e, Double num1, Double num2, ListOfPrizes c){
        for (Toy el: e.getToys()) {
            if((el.getWeight()>=num1) && (el.getPrice()<num2)){
                c.addToys(el);}}}
    public void correctQ(ToyService e,ListOfPrizes c){
        for (Toy el: e.getToys()) {
            if (el.getId()==c.getPrizes().get(0).getId()){
                el.setQuantity(el.getQuantity()-1);}}}

    public ListOfPrizes correctList(ListOfPrizes c){
        c.addToys(c.prizes.get(0));
        c.getPrizes().remove(0);
        return c;}

    }










