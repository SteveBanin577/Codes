package steve.com;

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}
 class Jews extends Movie{
    public Jews() {
        super("Jaws");
    }

     @Override
     public String plot() {
         return "A shark eats lots of people ";
     }
 }

 class IndependenceDay extends Movie{

    public IndependenceDay(){
        super("Independence Day");
    }

     @Override
     public String plot() {
         return "Alien attampt to make over planet earth" ;
     }
 }
 class MazeRunner extends Movie{
    public MazeRunner(){
        super("Maze Runner");
    }

     @Override
     public String plot() {
         return "Kids try and escape a maze";
     }
 }
 class starWar extends Movie{
    public starWar(){
        super("Star Wars");
    }

     @Override
     public String plot() {
         return "Imperial force try to take over the universe";
     }
 }
class forgattable extends Movie{
    public forgattable(){
        super("FOrgattable");
    }
}



public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + ":" + movie.getName()+ "\n" +"Plot:" + movie.plot()+"\n");
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int)(Math.random()*5)+1;
        System.out.println("Random number generated was: " +randomNumber);
        switch(randomNumber){
            case  1:
                return new Jews();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new starWar();
            case 5:
                return new forgattable();

        }
        return null;
    }
}
