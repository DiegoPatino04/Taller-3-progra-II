package com.edu.prgII.Taller.III.progra.II.model;

import java.util.List;
/**
 * Andres barrera, javier lopez y Diego Patiño
 * @author Diego Patiño
 *
 */
public class Room {
	private int bedNumbers;
	private int floorNumbers;
	@SuppressWarnings("unused")
	private String id;
	private List<Patient> patient;
	private int roomNumbers;

	/**
	 * 
	 * @param bedNumbers
	 * @param floorNumbers
	 * @param roomNumbers
	 * @param patient
	 */
	public Room(int bedNumbers, int floorNumbers, int roomNumbers, Patient patient) {
		this.bedNumbers = bedNumbers;
		this.floorNumbers = floorNumbers;
		this.roomNumbers = roomNumbers;
		this.patient.add(patient);
	}

	/**
	 * 
	 * @param bedNumbers
	 * @param floorNumbers
	 * @param roomNumbers
	 */
	public Room(int bedNumbers, int floorNumbers, int roomNumbers) {
		this.bedNumbers = bedNumbers;
		this.floorNumbers = floorNumbers;
		this.roomNumbers = roomNumbers;
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
	public String getId() {
		return this.id = Integer.toString(this.floorNumbers) + Integer.toString(this.roomNumbers);
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return List<Patient> return the patient
	 */
	public List<Patient> getpatient() {
		return patient;
	}

	/**
	 * @param patient the patient to set
	 */
	public void setpatient(List<Patient> patient) {
		this.patient = patient;
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
		return "{" + " bedNumbers='" + getBedNumbers() + "'" + ", floorNumbers='" + getFloorNumbers() + "'" + ", id='"
				+ getId() + "'" + ", patient='" + getpatient() + "'" + ", roomNumbers='" + getRoomNumbers() + "'" + "}";
	}

	/**
	 * 
	 * @return
	 */
	public boolean veryfyBedNumbers(int bedNumbers) {
		if ((bedNumbers > 0 && bedNumbers <= 5)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * @return
	 */
	public boolean veryfyFloorNumbers(int floorNumbers) {
		if ((floorNumbers > 0 && floorNumbers <= 30)) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * 
	 * @return
	 */
	public boolean veryfyRoomNumbers(int roomNumbers) {
		if ((roomNumbers > 0 && roomNumbers <= 10)) {
			return true;
		} else {
			return false;
		}
	}
}
