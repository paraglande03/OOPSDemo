import java.util.zip.ZipOutputStream;

public class Inheritance {

    public static void main(String[] args) {

        // Hiding the implementation showing the declaration to consumer

        factoryInterface f = new FactoryImplementation();

        f.getIceCream("Vanilla");
        String result  = f.getIceCream("asd");
        f.getIceCreamByName("name");

        System.out.println("Added fot git");
    }

}


interface factoryInterface{
    public String getIceCream(String a);
    public void getIceCreamByName(String abc);
}

class FactoryImplementation implements factoryInterface{

    public String getIceCream(String name){
       return  "Enjoy your IceCream"+name;
    }
    public void getIceCreamByName(String name){
        System.out.println("Enjoy your IceCream"+name);
    }
}