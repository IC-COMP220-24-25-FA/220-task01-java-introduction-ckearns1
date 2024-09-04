package edu.ithaca.dragon.shapes;

public class Rectangle {
    private double length;
    private double width;
    

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        //throw new RuntimeException("Not implemented yet");
    }

    public double calcArea(){
        double area = this.length * this.width;
        return area;
       // throw new RuntimeException("Not implemented yet");
    }

    public double doubleSize(){
        double doubledArea = this.length * this.width * 2; // is this alloud? Im not sure if im supposed to use the "this.length" here
        return doubledArea;
        //throw new RuntimeException("Not implemented yet");
    }

    public double longestLineWithin(){

        throw new RuntimeException("Not implemented yet");
    }
    
}
