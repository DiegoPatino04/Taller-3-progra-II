package presenter;


import java.util.List;

import model.*;
import view.View;

public class Presenter {
  private Hospital hospital;
  private View view;
  private List<Patient> patient1;
  private Status status;

  public Presenter(){
    hospital=new Hospital();
    view = new View();
    Status status;
  }


  public void runCode() {
    view.showMenu();
    view.showMessage("A que opción deseas acceder ");
    char option = view.num();
    if (Character.isDigit(option)) {
      if ('1'== option || option == '2' || option == '3' || option == '4' || option == '5') {
        switch (option) {
          case '1':
            view.showMessage("escogiste crear habitacion");
            int numFloor = view.readInt("Ingresa el numero de piso");
            int numRoom = view.readInt("Ingrese el numero de la habitacion");
            int numId = view.readInt("Ingrese el id de la habitacion");
            int numBeds = view.readInt("Ingrese numero de camas en la habitacion");
            view.showMessage(numBeds + " " + numFloor + " " + numId + " " + numBeds);
            Room x = new Room(numBeds, numFloor, numId, numBeds);
            hospital.addRoom(x);
            view.showMessage("La habitacion ha sido agregada");
            runCode();
            break;
          case '2':
            view.showMessage("Escogiste crear paciente");
            int bedNumber = Integer.parseInt(view.readString("ingrese numero de cama"));
            int floorNumber = Integer.parseInt(view.readString("Ingrese numero de piso"));
            int id = Integer.parseInt(view.readString("Ingrese id"));
            int roomNumber = Integer.parseInt(view.readString("Ingrese numero de habitacion"));
            String Phonepat = view.readString("Ingrese numero telefonico de paciente:");
            String firtName = view.readString("Ingrese primer nombre:");
            String lastName = view.readString("Ingrese apellido");
            view.showMessage("¿El paciente se encuentra activo?");
            boolean st = view.readBoolean(view.readInt("1.Si \n2.No"));
            if(st == true){
              status = status.ACTIVE;
            }else{
              status = status.INACTIVE;
            }

            hospital.CreateXMLFile(hospital.createroom(bedNumber, floorNumber, id, roomNumber), hospital.createPatien(Phonepat, firtName, lastName, status));
            view.showMessage("El paciente ha sido creado");
            runCode();

            break;
          case '3':
            view.showMessage("Escogiste mostrar historial por paciente");

            break;
          case '4':
            view.showMessage("Escogiste generar XML");
            break;
          case '5':
            System.exit(0);
            break;
        }
      }else{
        view.showMessage("valor fuera del rango");
      }
    } else {
      view.showMessage("no valido, ingrese una opcion valida");
      runCode();
    }
  }
  public static void main(String[] args) {
    new Presenter().runCode();
  }
}