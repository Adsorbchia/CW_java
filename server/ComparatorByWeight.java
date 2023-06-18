/**
 * С помощью данного класса сортируем список с призами по весу от большего к меньшему
 */
package java_control.server;
import java_control.model.Toy;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorByWeight implements Comparator<Toy> {

    @Override
    public int compare(Toy o1, Toy o2) {
        return Double.compare(o1.getWeight(),o2.getWeight());
    }
    public void sorting(ListOfPrizes listP)
   {Collections.sort(listP.getPrizes(),new ComparatorByWeight().reversed());}



    }
