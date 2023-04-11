package com.edu.prgII.Taller.III.progra.II.model;
/**
 * Andres barrera, javier lopez y Diego Patiño
 * @author Diego Patiño
 *
 */
public class Patient {
	private String contactPhoneNumber;
	private String firstName;
	private String lastName;
	private Status status;

	public Patient(String contactPhoneNumber, String firstName, String lastName, Status status) {
		this.contactPhoneNumber = contactPhoneNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.status = status;
	}

	/**
	 * @return String return the contactPhoneNumber
	 */
	public String getContactPhoneNumber() {
		return contactPhoneNumber;
	}

	/**
	 * @param contactPhoneNumber the contactPhoneNumber to set
	 */
	public void setContactPhoneNumber(String contactPhoneNumber) {
		this.contactPhoneNumber = contactPhoneNumber;
	}

	/**
	 * @return String return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return String return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return Status return the status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "{" + " contactPhoneNumber='" + getContactPhoneNumber() + "'" + ", firstName='" + getFirstName() + "'"
				+ ", lastName='" + getLastName() + "'" + ", status='" + getStatus() + "'" + "}";
	}

}
