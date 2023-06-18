
package java_control.server;
import java_control.model.Toy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListOfPrizes implements Methods {
    protected List<Toy> prizes;
    public ListOfPrizes() {
        this.prizes = new ArrayList<>();
    }
    public List<Toy> getPrizes() {
        return prizes;}
    public void setPrizes(List<Toy> prizes) {
        this.prizes = prizes;}

    @Override
    public void addToys(Toy item) {
        prizes.add(item);}

    @Override
    public void deleteToy(int idToy) {
        Iterator<Toy> iterator = prizes.iterator();
        while (iterator.hasNext()){
            Toy e = iterator.next();
            if(e.getId()==idToy){
                iterator.remove();}}}


    @Override
    public void printToys() {
        if (prizes.size()==0){
            System.out.println("Увы,розыгрыш закончился");
        }
        else {
            Iterator<Toy>iterator=prizes.iterator();
            while (iterator.hasNext()){
            Toy e = iterator.next();
            System.out.println(e);}}
    }
}









