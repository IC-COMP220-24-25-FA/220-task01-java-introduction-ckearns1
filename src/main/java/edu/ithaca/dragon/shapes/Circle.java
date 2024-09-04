package edu.ithaca.dragon.shapes;

public class Circle {
    private double radius;

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radius){
        this.radius = radius;
    }

    /**
     * @return the area of this circle
     */
    public double calcArea(){
        double pi = Math.PI;
        double radius = this.radius;
        double area = pi * radius * radius;
        return area;
        //throw new RuntimeException("Not implemented yet");
        //test comment
    }

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize(){
        // doubles radius
        this.radius = this.radius * 2;
        //throw new RuntimeException("Not implemented yet");
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin(){
        double radius = this.radius;
        double diamater = radius * 2;
        return diamater;
       // throw new RuntimeException("Not implemented yet");
    }
}
