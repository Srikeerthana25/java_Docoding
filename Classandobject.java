public class Classandobject{
    public static void main(String[] args){
        Classandobject sri = new Classandobject();
        sri.name = "Pulsar";
        sri.year = 2024;
        sri.display();

    }
}

class Classandobject{
    String name;
    int year;

    void display(){
        System.out.println("Name = " + name + "  " + "year = " + year);
    }
}