package model;

import java.util.List;

public class Room {
  private int bedNumbers;
  private int floorNumbers;
  private int id;
  private List<Patient> patients;
  private int roomNumbers;

  public Room(int bedNumbers, int floorNumbers, int id, int roomNumbers) {
    this.bedNumbers = bedNumbers;
    this.floorNumbers = floorNumbers;
    this.id = id;
    this.roomNumbers = roomNumbers;
  }

  public Room(int bedNumbers, int floorNumbers, int id, int roomNumbers, List<Patient> patients ) {
    this.bedNumbers = bedNumbers;
    this.floorNumbers = floorNumbers;
    this.id = id;
    this.roomNumbers = roomNumbers;
    this.patients = patients;
  }



  /**
   * @return int return the bedNumbers
   */
  public int getBedNumbers() {
    return bedNumbers;
  }

  /**
   * @param bedNumbers the bedNumbers to set
   */
  public void setBedNumbers(int bedNumbers) {
    this.bedNumbers = bedNumbers;
  }

  /**
   * @return int return the floorNumbers
   */
  public int getFloorNumbers() {
    return floorNumbers;
  }

  /**
   * @param floorNumbers the floorNumbers to set
   */
  public void setFloorNumbers(int floorNumbers) {
    this.floorNumbers = floorNumbers;
  }

  /**
   * @return int return the id
   */
  public int getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * @return List<Patient> return the patient
   */
  public List<Patient> getpatient() {
    return patients;
  }

  /**
   * @param patient the patient to set
   */
  public void setpatient(List<Patient> patient) {
    this.patients = patient;
  }

  /**
   * @return int return the roomNumbers
   */
  public int getRoomNumbers() {
    return roomNumbers;
  }

  /**
   * @param roomNumbers the roomNumbers to set
   */
  public void setRoomNumbers(int roomNumbers) {
    this.roomNumbers = roomNumbers;
  }

  @Override
  public String toString() {
    return "{" +
        " bedNumbers='" + getBedNumbers() + "'" +
        ", floorNumbers='" + getFloorNumbers() + "'" +
        ", id='" + getId() + "'" +
        ", patient='" + getpatient() + "'" +
        ", roomNumbers='" + getRoomNumbers() + "'" +
        "}";
  }

}