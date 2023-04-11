package com.edu.prgII.Taller.III.progra.II.presenter;

import java.io.File;

import com.edu.prgII.Taller.III.progra.II.model.Hospital;
import com.edu.prgII.Taller.III.progra.II.model.Room;
import com.edu.prgII.Taller.III.progra.II.model.Status;
import com.edu.prgII.Taller.III.progra.II.view.View;
/**
 * Andres barrera, javier lopez y Diego Patiño
 * @author Diego Patiño
 *
 */
public class Presenter {
	private Hospital hospital;
	private View view;
	private Status status;

	public Presenter() {
		hospital = new Hospital();
		view = new View();
	}

	public void runCode() {
		String Menu = "Bienvenido a el hospital de los muñecos \n" + "======================================= \n"
				+ "______Escoja la opcion que desea_______ \n" + "1. Crear paciente \n" + "2. Crear un paciente y guardarlo \n"
				+ "3. Eliminar paciente. \n" + "4. Mostrar historial de pacientes \n" + "5. Salir";
		view.showMessage("A que opción deseas acceder ");
		view.showMessage(Menu);
		char option = view.num();
		if (Character.isDigit(option)) {
			if ('1' == option || option == '2' || option == '3' || option == '4' || option == '5') {
				switch (option) {
				case '1':// crear habitacion.
					view.showMessage("escogiste crear habitacion");
					int numFloor = view.readInt("Ingresa el numero de piso");
					int numRoom = view.readInt("Ingrese el numero de la habitacion");
					int numId = view.readInt("Ingrese el id de la habitacion");
					int numBeds = view.readInt("Ingrese numero de camas en la habitacion");
					view.showMessage(numBeds + " " + numFloor + " " + numId + " " + numBeds);
					Room x = new Room(numBeds, numFloor, numRoom);
					hospital.addRoom(x);
					view.showMessage("La habitacion ha sido agregada");
					view.showMessage(Menu);
					runCode();
					break;
				case '2':// crea XML paciente.
					view.showMessage("Escogiste crear paciente y guardarlo");
					int bedNumber = Integer.parseInt(view.readString("ingrese numero de cama"));
					if (bedNumber > 0 && bedNumber <= 5) {
						int floorNumber = Integer.parseInt(view.readString("Ingrese numero de piso"));
						if (floorNumber > 0 && floorNumber <= 30) {
							int roomNumber = Integer.parseInt(view.readString("Ingrese numero de habitacion"));
							if (roomNumber > 0 && roomNumber <= 10) {
								String Phonepat = view.readString("Ingrese numero telefonico de paciente:");
								String firtName = view.readString("Ingrese primer nombre:");
								String lastName = view.readString("Ingrese apellido");
								view.showMessage("¿El paciente se encuentra activo?");
								boolean st = view.readBoolean(view.readInt("1.Si \n2.No"));
								if (st == true) {
									status = Status.ACTIVE;
								} else {
									status = Status.INACTIVE;
								}
								hospital.CreateXMLFile(hospital.createroom(bedNumber, floorNumber, roomNumber),
										hospital.createPatien(Phonepat, firtName, lastName, status));
								view.showMessage("El paciente ha sido creado");
								view.showMessage(Menu);
								runCode();
							} else {
								view.showMessage("habitacion no valida");
								runCode();
								view.showMessage(Menu);
							}
						} else {
							view.showMessage("Piso no valida");
							runCode();
							view.showMessage(Menu);
						}
					} else {
						view.showMessage("Cama no valida");
						runCode();
						view.showMessage(Menu);
					}
					break;
				case '3':// Eliminar XML paciente
					view.showMessage("Escogiste eliminar paciente");
					String patienS = view.readString("Ingrese nombre del archivo. ( sin extencion XML).");
					if (hospital.searchPatient(patienS)) {
						hospital.deletePatient(patienS);
						runCode();
						view.showMessage(Menu);
					} else {
						view.showMessage("Archivo no entontrado.");
						runCode();
						view.showMessage(Menu);
					}
					break;
				case '4':// historial
					view.showMessage("Escogiste mostrar historial.");
						String path = "src/resources";
						File files = new File(path);
						File[] folderfiles = files.listFiles();
						for (int i = 0; i < folderfiles.length; i++) {
							view.showMessage((i+1)+ ". "+folderfiles[i].getName());
					}
						runCode();
						view.showMessage(Menu);
					break;
				case '5':// salir
					System.exit(0);
					break;
				}
			} else {
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