package java_control.server;
import java_control.model.Toy;
import java.util.ArrayList;
import java.util.Iterator;

public class ToyService implements Methods {

    protected ArrayList<Toy> toys;

    public ArrayList<Toy> getToys() {
        return toys;
    }

    public void setToys(ArrayList<Toy> toys) {
        this.toys = toys;
    }

    public ToyService() {
        this.toys = new ArrayList<Toy>();
    }



    @Override
    public void addToys(Toy item) {
        toys.add(item);}


    @Override
    public void deleteToy(int idToy) {
        Iterator<Toy> iterator = toys.iterator();
        while (iterator.hasNext()){
            Toy e = iterator.next();
            if(e.getId()==idToy){
                iterator.remove();
        }}}

    @Override
    public void printToys() {
        Iterator<Toy> iterator = toys.iterator();
        while (iterator.hasNext()){
            Toy e= iterator.next();
            System.out.println(e);}}

}
