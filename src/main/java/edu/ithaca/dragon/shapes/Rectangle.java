package edu.ithaca.dragon.shapes;

public class Rectangle implements Shape{
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
        this.length = this.length*2; //this does double the area but it changes the length in the object. not sure weather to return what the doubled area would be or actually double the area within the object
        double doubledArea = this.length * this.width; // is this alloud? Im not sure if im supposed to use the "this.length" here
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
        return "Shape: Rectangle \n Area: "+calcArea()+"\n Lingest line in rectangle:"+longestLineWithin()+"\n Length: "+this.length+"\n Width: "+this.width;
    }
    
}
