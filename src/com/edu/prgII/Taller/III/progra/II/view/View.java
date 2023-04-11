package view;

import java.util.Scanner;

public class View {
  private Scanner box = new Scanner(System.in);

  public void showMenu() {
    System.out.println(
            "Bienvenido a el hospital de los muñecos \n" +
            "======================================= \n" +
            "______Escoja la opcion que desea_______ \n" +
            "1. Crear habitacion \n" +
            "2. Crear un paciente \n" +
            "3. Mostrar historial de pacientes \n" +
            "4. Generar XML \n" +
            "5. Salir");
  }

  public void showMessage(String message) {
    System.out.println(message);
  }
  
  public char num(){
    char num=box.nextLine().charAt(0);
    return num;
  }


  public String readString(String message) {
    showMessage(message);
    return box.nextLine();
  }
  public int readInt(String message) {
    showMessage(message);
    int number = Integer.parseInt(box.nextLine());
    return number;

  }

  public boolean readBoolean (int number){
    boolean x = false;
    if(number==1){
      x = true;
      return x;
    }
    return x;
  }

}