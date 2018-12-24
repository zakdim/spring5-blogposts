package guru.springframework.blog.interfacesegregationprinciple;

/**
 * Created by dmitri on 2018-12-24
 */
public class ToyPlane implements Toy, Movable, Flyable {
    double price;
    String color;

    @Override
    public void fly() {
        System.out.println("ToyPlane: Start flying plane.");
    }

    @Override
    public void move() {
        System.out.println("ToyPlane: Start moving plane.");
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return "ToyPlane: Moveable and flyable toy plane- Price: "+price+" Color: "+color;
    }
}
