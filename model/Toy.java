package java_control.model;

public class Toy {
    protected  Integer id;
    protected  String name;
    protected Double weight;
    protected Double price;
    protected Integer quantity;
    protected  Double percentageOfLoss;


    public Toy(Integer id, String name, Double weight, Double price, Integer quantity,Double percentageOfLoss) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.quantity = quantity;
        this.percentageOfLoss = percentageOfLoss;
    }

    public Toy(){}


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPercentageOfLoss() {
        return percentageOfLoss;
    }

    public void setPercentageOfLoss(Double percentageOfLoss) {
        this.percentageOfLoss = percentageOfLoss;
    }

    @Override
    public String toString() {
        return "{" +
                "id = " + id +
                ",имя = '" + name + '\'' +
                ", вес = " + weight +
                ", цена = " + price +
                ", наличие в магазине = " + quantity +
                '}';
    }
}

