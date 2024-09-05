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

        double lengthSquared = this.length * this.length;
        double widthSquared = this.width * this.width;
        double longestLine = Math.sqrt(lengthSquared + widthSquared); //this is what I found online but it doesent work. I think its because I have to import a library
        return longestLine;
        //throw new RuntimeException("Not implemented yet");
    }

    public String toString(){
        return "Rectangle area: "+calcArea()+"\t Lingest line in rectangle:"+longestLineWithin();
    }
    
}
