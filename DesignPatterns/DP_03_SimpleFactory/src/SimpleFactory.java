interface Shape {}

class Circle implements Shape {}
class Square implements Shape {}

public class SimpleFactory {
    public static Shape create(String type){
        if(type.equals("circle")){
            return new Circle();
        }
        if(type.equals("square")){
            return new Square();
        }
        return null;
    }



//    Main
public static void main(String[] args) {
    Shape s = SimpleFactory.create("circle");
}
}
