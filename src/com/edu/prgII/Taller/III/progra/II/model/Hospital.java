package model;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Hospital {
  private Patient patient;
  private List<Patient> patients;
  private List<Room> rooms;

  public Hospital(){
    patients = new ArrayList<Patient>();
    rooms = new ArrayList<Room>();
  }

  public void addRoom(Room room) {
    rooms.add( room);
  }

  public void addPatient(Patient patient){
    patients.add(patient);
  }

  /**
   * @return Patient return the patient
   */
  public Patient getPatient() {
    return patient;
  }

  /**
   * @param patient the patient to set
   */
  public void setPatient(Patient patient) {
    this.patient = patient;
  }


  /**
   * @return List<Patient> return the patient1
   */
  public List<Patient> getPatient1() {
    return patients;
  }

  /**
   * @param patient1 the patient1 to set
   */
  public void setPatient1(List<Patient> patient1) {
    this.patients = patients;
  }

  /**
   * @return List<Room> return the room
   */

  public List<Room> getRoom() {
    return rooms;
  }

  /**
   * @param room the room to set
   */
  public void setRoom(List<Room> room) {
    this.rooms = room;
  }


  public Room createroom(int bedNumbers, int floorNumbers, int id, int roomNumbers) {
    Room room1 = new Room(bedNumbers, floorNumbers, id, roomNumbers);
    rooms.add(room1);
    return room1;
  }

  public Patient createPatien(String contactPhoneNumber, String firstName, String lastName, Status status) {
    Patient patient = null;
    patients = new ArrayList<Patient>();
    patient = new Patient(contactPhoneNumber, firstName, lastName, status);
    patients.add(patient);
    return patient;
  }

  public void CreateXMLFile(Room room, Patient patient) {
    DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();
    try {
      DocumentBuilder builder = factory.newDocumentBuilder();
      DOMImplementation doc = builder.getDOMImplementation();

      Document document = doc.createDocument(null, "Hospital", null);
      document.setXmlVersion("1.0");
      Element Floors = document.createElement("Pisos");

      Element Floor = document.createElement("piso" + room.getFloorNumbers());
      Floor.setAttribute("Id", Integer.toString(room.getFloorNumbers()));

      Element betdNumber = document.createElement("Numero_de_cama");
      Text betNumberText = document.createTextNode(Integer.toString(room.getBedNumbers()));
      betdNumber.appendChild(betNumberText);

      Element floorNumber = document.createElement("Numero_de_piso");
      Text floorNumernText = document.createTextNode(Integer.toString(room.getFloorNumbers()));
      floorNumber.appendChild(floorNumernText);

      Element roomNumber = document.createElement("Numero_de_habitacion");
      Text roomNumberText = document.createTextNode(Integer.toString(room.getRoomNumbers()));
      roomNumber.appendChild(roomNumberText);

      Floor.appendChild(betdNumber);
      Floor.appendChild(floorNumber);
      Floor.appendChild(roomNumber);

      Element patient1 = document.createElement("Paciente");
      patient1.setAttribute("Id", Integer.toString(room.getId()));

      Element contactPhone = document.createElement("Numero_de_contacto");
      Text contactPhoneTex = document.createTextNode(patient.getContactPhoneNumber());
      contactPhone.appendChild(contactPhoneTex);

      Element fullName = document.createElement("Full_Name");
      Text fullNameText = document.createTextNode(patient.getFirstName() + " " + patient.getLastName());
      fullName.appendChild(fullNameText);

      Element status = document.createElement("Estado");
      Text statusText = document.createTextNode(patient.getStatus().toString());
      status.appendChild(statusText);

      patient1.appendChild(contactPhone);
      patient1.appendChild(fullName);
      patient1.appendChild(status);

      Floor.appendChild(patient1);
      Floors.appendChild(Floor);

      document.getDocumentElement().appendChild(Floors);

      Source source = new DOMSource(document);
      Result result = new StreamResult(
              new File("src/resources/paciente" + Integer.toString(room.getId())) + ".xml");

      Transformer transformer = TransformerFactory.newInstance().newTransformer();
      transformer.transform(source, result);

    } catch (Exception e) {
      // TODO: handle exception
    }
  }
}