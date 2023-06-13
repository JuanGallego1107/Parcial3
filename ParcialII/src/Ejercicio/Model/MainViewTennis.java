package Ejercicio.Model;

import Ejercicio.Model.Repository.TennisListRepository;
import Ejercicio.Model.Repository.TennisRpository;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MainViewTennis {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String opc="1";
        TennisRpository tennisRpository = new TennisListRepository();

        do{
            Scanner x= new Scanner(System.in);
            System.out.println("Selecciona una: \n1.Guardar  \n2.Listar todos \n3.Modificar"+
                    "\n4.Borrar\n5.Listar uno \n6.Salir \n=>");
            opc = x.next();
            switch (opc){
                case "1": {
                    System.out.println("Id:  ");
                    String id = x.next();
                    System.out.println("Tennis Brand: ");
                    String br = x.next();
                    System.out.println("Tennis Model: ");
                    String mod = x.next();
                    System.out.println("Color: ");
                    String col = x.nextLine();
                    System.out.println("Price: ");
                    int pr =x.nextInt();
                    tennisRpository.add(new Tennis(id,br,mod,col,pr));
                    System.out.println("=========================");
                    break;
                }
                case "2" : {
                    List<Tennis> clientList = tennisRpository.obtainAll();
                    clientList.forEach(System.out::println);
                    System.out.println("=========================");
                    break;
                }
                case "3": {
                    System.out.println("Mantaining time.");
                    break;
                }
                case "4":{
                    System.out.println("Id to sign in.");
                    Integer id = x.nextInt();
                    tennisRpository.delete(id);
                    tennisRpository.obtainAll().forEach(System.out::println);
                    System.out.println("=========================");
                    break;
                }
                case "5": {
                    System.out.println("Wanted Id to search for");
                    Integer id =x.nextInt();
                    tennisRpository.obtainById(id);
                    System.out.println("=========================");
                    break;
                }
                case "6":{
                    opc = "6";
                    break;
                }

            }
        }while (opc != "6");
    }
}
