package edu.ithaca.dragon.shapes;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        //throw new RuntimeException("Not implemented yet");
    }

    public double calcArea(){
        double s = (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        //double height = (2 * area) / sideA;
        return area;
       // throw new RuntimeException("Not implemented yet");
    }

    public double doubleSize(){

        double doubleBase = this.sideA * 2;
        double height = 
        double doubleArea = this.sideA;
        return doubleArea;
        //throw new RuntimeException("Not implemented yet");
    }

    public double longestLineWithin(){
        return Math.max(sideA, Math.max(sideB, sideC));
        //throw new RuntimeException("Not implemented yet");
    }

}
