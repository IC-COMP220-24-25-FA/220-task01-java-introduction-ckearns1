package edu.ithaca.dragon.shapes;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class ShapeMain {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Scanner scanner = new Scanner(System.in);
        ArrayList<Rectangle> myRectangles = new ArrayList<>();

        Rectangle rect1 = new Rectangle((Math.random()*21), (Math.random() * 11));
        Rectangle rect2 = new Rectangle((Math.random()*21), (Math.random() * 11));
        Rectangle rect3 = new Rectangle((Math.random()*21), (Math.random() * 11));
        Rectangle rect4 = new Rectangle((Math.random()*21), (Math.random() * 11));
        Rectangle rect5 = new Rectangle((Math.random()*21), (Math.random() * 11));

        myRectangles.add(rect1);
        myRectangles.add(rect2);
        myRectangles.add(rect3);
        myRectangles.add(rect4);
        myRectangles.add(rect5);

        for (int i = 0; i < myRectangles.size(); i++ ){
            System.out.print("Rectangle " + i);
            System.out.println(myRectangles.get(i));
        }
        System.out.print("Chose a rectangle to double the area of 1-5.");
        int choice = scanner.nextInt();

        Rectangle chosenRect = myRectangles.get(choice - 1);
        chosenRect.doubleSize();

        System.out.println("New rectangles:");
        for (int i = 0; i < myRectangles.size(); i++) {
                System.out.print("Rectangle " + (i + 1) + ": ");
                System.out.println(myRectangles.get(i));
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times               
    }

    ArrayList<Shape> myShapes = new ArrayList<>();
    ArrayList<Integer> randomNums = new ArrayList<>();
    
    Random random = new Random();
    for (int i = 0; i < 10; i++){
        int randomNum = random.nextInt(3) + 1;
        randomNums.add(randomNum);
    }
    // 1 = circle, 2 = rectangle, 3 = triangle 
    for (int i = 0; i < randomNums.size(); i++){
        int aNum = randomNums.get(i);
        if (aNum == 1){
            Circle circle = new Circle(5);
            myShapes.add(circle);
        }
        if (aNum == 2){
            Rectangle rectangle = new Rectangle(4,5);
            myShapes.add(rectangle);
        }
        if (aNum == 3){
            Triangle triangle = new Triangle(4,5,6);
            myShapes.add(triangle);
        }
        System.out.println(myShapes.get(i).toString());
    }
    System.out.println("DOUBLED SIZE OF SHAPES");
    for (int i = 0; i < 10; i++){
        Shape shape = myShapes.get(i);
        shape.doubleSize();
        System.out.println(shape.toString());
    }

}
}
