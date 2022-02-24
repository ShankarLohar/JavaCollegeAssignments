// 20BAI10040 Shankar Lohar CSE3002
class Shape {
    void draw() {
        System.out.println("Shape draw()");
    }

    void erase() {
        System.out.println("Shape erase()");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Circle draw()");
    }

    void erase() {
        System.out.println("Circle erase()");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Triangle draw()");
    }
    void erase() {
        System.out.println("Triangle erase()");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Square draw()");
    }

    void erase() {
        System.out.println("Square erase()");
    }
}

public class Shapes {

    public static Shape randomShape() {

        switch ((int) (Math.random() * 3)) {
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
            default:
                System.out.println("default");
                return new Shape();
        }
    }

    public static void main(String[] arg) {
        Shape[] shapes = new Shape[9];
        for (int i = 0; i < shapes.length; i++) shapes[i] = randomShape();
        for (Shape shape : shapes) shape.draw();
    }
}