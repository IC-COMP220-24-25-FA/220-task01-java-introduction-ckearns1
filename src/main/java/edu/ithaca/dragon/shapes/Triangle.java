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
        return area;
       // throw new RuntimeException("Not implemented yet");
    }

    public double doubleSize() {
        //doubles the triangles area 
        double doubleBase = this.sideA * 2;
        double originalArea = calcArea();
        double height = (2 * originalArea) / this.sideA;
        double doubleArea = (0.5) * doubleBase * height;
        return doubleArea;
        //throw new RuntimeException("Not implemented yet");
    }

    public double longestLineWithin(){
        return Math.max(sideA, Math.max(sideB, sideC));
        //throw new RuntimeException("Not implemented yet");
    }
    public String toString(){
        return "Shape: Triangle \n Area: "+calcArea()+"\n Lingest line: "+longestLineWithin()+"\n Side A: "+this.sideA+"\n Side B: "+this.sideB+"Side C: "+this.sideC;
    }
}
