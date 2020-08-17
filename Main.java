package sample;
import java.io.*;
import java.util.*;
// comment added
public class Main {
    public static void main(String [] args)throws IOException {
        Cake c=new Cake();
        Cake c1=new Cake();
        c.setName("Chocolate Brownie");
        c1.setName("Chocolate Maple");
        c.setPrice(250.0f);
        c1.setPrice(300.0f);

        ArrayList<String> n=new ArrayList();
        n.add(c.getName());
        n.add(c1.getName());
        ArrayList<Float> n1=new ArrayList();
        n1.add(c.getPrice());
        n1.add(c1.getPrice());
        Pastry p=new Pastry();
        Pastry p1=new Pastry();
        p.setName( "Black Forest");
        p1.setName("Choco Truﬄe");
        p.setPrice(35.0f);
        p1.setPrice(40.0f);
        ArrayList<String> n2=new ArrayList();
        n2.add(p.getName());
        n2.add(p1.getName());
        ArrayList<Float> n3=new ArrayList();
        n3.add(p.getPrice());
        n3.add(p1.getPrice());
        System.out.println("     Todays Special Menu");
        System.out.println("------------------------------");
        System.out.println();
        System.out.println("Special Cakes ");
        System.out.println("--------------------------");
        for(String s:n) {
            c.display();
            c1.display();
        }System.out.println();
        System.out.println("Special pastries ");
        System.out.println("--------------------------");
        for (String s1:n2) {
            p.display();
            p1.display();
        }


    }
}
