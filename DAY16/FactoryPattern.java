
interface Shape{
    String getDescription();
}

class Circle implements Shape {
    @Override
    public String getDescription() {
        return "This is a Circle";
    }
}

class Square implements Shape{
    @Override
    public String getDescription() {
        return "This is a square";
    }
}
class ShapeFactory{
    public static Shape createShape(String shapeType){
        if("square".equalsIgnoreCase(shapeType)){
            return new Square();
        }
        else if("circle".equalsIgnoreCase(shapeType)){
            return new Circle();
        }
        throw new IllegalArgumentException("Unknown Shape Type ");
    }

}


public class FactoryPattern {
    public static void main(String[] args) {
        Shape circleFactory = ShapeFactory.createShape("circle");
        System.out.println(circleFactory.getDescription());

        Shape squareFactory = ShapeFactory.createShape("square");
        System.out.println(squareFactory.getDescription());

    }
}
