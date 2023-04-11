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
