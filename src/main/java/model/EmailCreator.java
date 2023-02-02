/**
 * 
 */
package model;

/**
 * @author Brandon Thompson - Brandon Thompson
 *CIS175 - Spring 2023
 * Feb 1, 2023
 */
public class EmailCreator {
	String email; // variable declaration

	public EmailCreator() { // Default constructor
		
	}
	
	public EmailCreator(String userFName, String userLName) { // Constructor with args
		setEmail(createEmail(userFName, userLName));
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() { // getters and setters
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String createEmail(String fName, String lName) { // Takes the two names the user inputs and creates an email with them.
		String email;
		String firstName = fName.substring(0, 1);
		email = firstName + lName + "@email.com";
		
		return email;
	}
	
	@Override
	public String toString() { // Prints class info
		return "Your new email is: " + getEmail();
	}
	
}
