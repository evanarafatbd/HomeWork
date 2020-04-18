package Amazon;


import java.util.ArrayList;
import java.util.List;

public class AmazonTestData {

    public static String item1 = "java books";
    public static String item2 = "lysol";
    public static String item3 = "baby toys";
    public static String item4 = "laptop";
    public static String item5 = "Posters";

    //connect to Database, then read all the items name fr
    // om database

    public static List<String> checkListOfItems(){
        List<String> list = new ArrayList<String>();
        list.add(item1);
        list.add(item2); //you can use either variable reference name OR...
        list.add("baby toys");//....just use the String quotes and write it in.
        list.add(item4);
        list.add(item5);

        return list;
    }


}
