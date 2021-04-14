package streamOrnekler;

import java.util.ArrayList;
import java.util.List;

public class Stream01Integer {

    public static void main(String[] args) {
        List<Integer> rakamlar = new ArrayList<>();
        rakamlar.add(5);
        rakamlar.add(7);
        rakamlar.add(9);
        rakamlar.add(-1);
        rakamlar.add(2);
        rakamlar.add(4);
        rakamlar.add(-1000);
        rakamlar.add(4);

        System.out.println("=====TEK SAYILAR=====");
        rakamlar.stream().filter(t ->t%2!=0).forEach(t-> System.out.print(t+ " "));


        System.out.println("=====CIFT SAYILAR=======");
        rakamlar.stream().filter(t ->t%2==0).forEach(Stream01Integer:: yazdir);

        System.out.println("======METHOD REFERANCE=========");
        rakamlar.stream().filter(Stream01Integer::tekMi).forEach(Stream01Integer:: yazdir);

        System.out.println("\n=====CIFT SAYILAR(Method Referenace)=======");
        ciftleriYazdir(rakamlar);



    }

    public static void ciftleriYazdir(List<Integer> liste){

       // liste.stream().filter(x->x%2==0).forEach(x-> System.out.print(x+ " "));

        liste.stream().filter(Stream01Integer::ciftMi).forEach(System.out::println);


    }

    public static boolean ciftMi(int x){
        return x%2==0;
    }
    public static boolean tekMi(int x){
        return x%2!=0;
    }

    public static void yazdir(int x){
        System.out.print(x+ " ");
    }
}
