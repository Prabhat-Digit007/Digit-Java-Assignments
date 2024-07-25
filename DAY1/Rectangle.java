package DAY1;

public class Rectangle {
    int length;
    int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    int area(){
        return getLength() * getWidth();
    }

    int parameter(){
        return 2*(length+width);
    }

    public static void main(String args[]){
        Rectangle r1 = new Rectangle();
        r1.setLength(12);
        r1.setWidth(12);
        System.out.println(r1.area());
        System.out.println(r1.parameter());
    }

}
