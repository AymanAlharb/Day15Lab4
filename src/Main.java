public class Main {
    public static void main(String[] args) {
        //Testing the Rectangle class
        System.out.println("Circle class: ");
        Circle circle = new Circle(5);
        System.out.println("\tA circle with a radius of: " + circle.getRadius() + "\n\tHas an area of: " + String.format("%.2f", circle.calculateArea()) +
                "\n\tAnd a circumference of:" + String.format("%.2f", circle.calculateCircumference()));
        System.out.println("Testing the setters: ");
        Circle circle1 = new Circle();
        circle1.setRadius(3);
        System.out.println("\tA circle with a radius of: " + circle1.getRadius() + "\n\tHas an area of: " + String.format("%.2f", circle1.calculateArea()) +
                "\n\tAnd a circumference of:" + String.format("%.2f", circle1.calculateCircumference()));


        System.out.println("----------------------------------------------------------------------------");

        //Testing the Rectangle class
        System.out.println("Rectangle class: ");
        Rectangle rectangle = new Rectangle(4, 3);
        System.out.println("\tA rectangle with a height of: " + rectangle.getHeight() + " And a width of: " + rectangle.getWidth() +
                "\n\tHas an area of: " + String.format("%.2f", rectangle.calculateArea()) + "\n\tAnd a perimeter of:" + String.format("%.2f", rectangle.calculateCircumference()));
        System.out.println("Testing the setters: ");
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setHeight(2);
        rectangle1.setWidth(4);
        System.out.println("\tA rectangle with a height of: " + rectangle1.getHeight() + " And a width of: " + rectangle1.getWidth() +
                "\n\tHas an area of: " + String.format("%.2f", rectangle1.calculateArea()) + "\n\tAnd a perimeter of:" + String.format("%.2f", rectangle1.calculateCircumference()));

        System.out.println("----------------------------------------------------------------------------");

        //Testing the Rectangle class
        System.out.println("Triangle class: ");
        Triangle triangle = new Triangle(5, 4);
        System.out.println("\tA triangle with a height of: " + triangle.getHeight() + " And a base of: " + triangle.getBase() +
                "\n\tHas an area of: " + String.format("%.2f", triangle.calculateArea()) + "\n\tAnd a perimeter of:" + String.format("%.2f", triangle.calculateCircumference()));
        System.out.println("Testing the setters: ");
        Triangle triangle1 = new Triangle();
        triangle1.setHeight(6);
        triangle1.setBase(5);
        System.out.println("\tA triangle with a height of: " + triangle1.getHeight() + " And a base of: " + triangle1.getBase() +
                "\n\tHas an area of: " + String.format("%.2f", triangle1.calculateArea()) + "\n\tAnd a perimeter of:" + String.format("%.2f", triangle1.calculateCircumference()));



    }
}