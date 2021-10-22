import java.io.PrintStream;
import java.util.Scanner;

public class practicas2 {
    public static void main(String[] args) {
        // Menu
        OUTER:
        while(true){
            System.out.println("       Adivina el numero oculto \n"
                    + "************************************* \n"
                    + "1-Nivel -Facil \n"
                    + "2- Nivel-Medio \n"
                    + "3- Nivel-Dificil\n"
                    + "4- |***  Salir  ***|");
            Scanner leer = new Scanner(System.in);
            System.out.print("Elige una Opcion: ");
            int opcion = leer.nextInt();
            
            switch (opcion){
                case 1:
                    jugar(10);
                    break;
                case 2:
                    jugar(7);
                    break;
                case 3:
                    jugar(5);
                    break;
                case 4: 
                    System.out.println("|  Cerrando Juego.....   |");
                    break OUTER;
                default: 
                    System.out.println("Opcion Incorrecta");
            }
        }

 }
    //Funcion del juego
    static void jugar (int vidas){
        int numeroR=(int)(Math.random()*100);
        int numeroElegido= -1;
        // Bucle si no se cumple la condicion
        while(numeroR != numeroElegido){
            System.out.print("Ingrese un numero de 1 a 100 : ");
            Scanner numero= new Scanner(System.in);
            numeroElegido= numero.nextInt();
                    if(numeroElegido < numeroR){
                System.out.println("Es mas Alto ->");
             System.out.println("                                   ");

                vidas --;
            }else if(numeroElegido > numeroR){
                System.out.println("Es mas Bajo <-");
           System.out.println("                                   ");

            vidas --;
            }
            if(vidas == 0){
                                 System.out.println("                                   ");

                 System.out.println("**********************************");
                System.out.println("         GAME OVER :(  el numero era -> "+numeroR);
                 System.out.println("**********************************");
                 System.out.println("                                   ");

                break;
            }
            System.out.println("**********************************");
            System.out.printf("-----> Te quedan %d vidas <-----\n",vidas);
            System.out.println("**********************************");
            if(numeroElegido == numeroR){
                System.out.println("**********************************");
                System.out.println("|   GANASTE!!!!! el numero era -> |"+numeroR);
                System.out.println("**********************************");
            }
        }
    }
   
    
}
