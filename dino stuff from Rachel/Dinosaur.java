public class Dinosaur{
    //classes are real life concepts/objects
    //attributes = characteristics of a class
    double height;
    String species;
    int numOfLimbs;
    boolean hasWings;

    //class constuctors set default attributes
    //clas consturcor builds objects 
    //example =

    public Dinosaur(){
        height = 3;
        species = "T=rex";
    }

    public Dinosaur(double newHeight, int newNumOfLimbs){
        
        setHeight(newHeight);
        //setheight-5
        numOfLimbs = newNumOfLimbs;
    }

    //getter
    //methods are like functions
    //functions do stuff
    //getters get stuff

    //data type we are returning nameOfMethod(){ code }
    double getHeight(){
        return height;
    }

    String getSpecies(){
        return species;
    }

    int getNumOfLimbs(){
        return numOfLimbs;
    }

    boolean doesDinoHaveWings(){
        return hasWings;
    }

    //setters
    //setters set stuff
    //void = no return
    //parameter = newHeight  (placeholder (x))
    //argument = aactual value (3)
    void setHeight(double newHeight){
        if(newHeight < 0){
            System.out.println("your can't set it to less than zero!");
            height = 1;
        }
        else{
        height = newHeight;
        }
    }

    void setSpecies(String newSpecies){
        species = newSpecies;
    }

    void setNumOfLimbs(int newNumOfLimbs){
        numOfLimbs = newNumOfLimbs;
    }

    void setWings(boolean doesDinoHaveWings){
        hasWings = doesDinoHaveWings;
    }



//added something
    


}