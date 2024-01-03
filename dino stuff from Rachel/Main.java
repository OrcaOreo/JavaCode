import javax.lang.model.element.QualifiedNameable;

public class Main {

//main method
//executes the code

public static void main (String[] args){
    /* 
    //munbers with out decimal point
    int numberOfTeeth = 3;
    //numbers with decimal point
    double age = 87.3;
    //has "" around it, stores characters, numbers, etc;
    String color = "red";
    //boolean = true or false
    boolean isOld = true;

    //if statement
    if(age < 50){
        System.out.println("your dinosaur is less than 50 years old");
    }
        */

    //instantiation = instance of class = object
    //an object = a copy of a class that you modify
    
    Dinosaur rachelDino = new Dinosaur(6.0, 3);
System.out.println(rachelDino.getHeight());
    rachelDino.setHeight(-5);
    System.out.println(rachelDino.getHeight());

    //className objectName = new classConstructor();
    Dinosaur aaronsDino = new Dinosaur();
    aaronsDino.setHeight(2);
    aaronsDino.setNumOfLimbs(1);
    aaronsDino.setSpecies("frog");
    aaronsDino.setWings(false);

    double aaronsHeight = aaronsDino.getHeight();
    //aarons height = 2
    int aaronsLimbCount = aaronsDino.getNumOfLimbs();
    String aaronsSpecies = aaronsDino.getSpecies();
    Boolean doesAaronHaveWings = aaronsDino.doesDinoHaveWings();

    System.out.println(aaronsHeight);
    System.out.println(aaronsLimbCount);
    System.out.println(aaronsSpecies);
    System.out.println(doesAaronHaveWings);





    
}



}