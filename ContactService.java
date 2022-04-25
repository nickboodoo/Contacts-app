package cs320_module3_contact_contactService;
import java.util.*;

public class ContactService {

	private ArrayList<Contact> listofContacts;
	public ContactService() {
		listofcontacts = new ArrayList<>();
	}

	//adding a contact
		public boolean addContact(Contact c) {
			boolean contactExist = false;

		//checks if contact exist
		for (Contact l: listofcontacts) { 
			if(l.equalsquals(c)) {
			contactExist = True;

			if(!contactExist) (
				listofcontacts.add(c);
				return true;

			else {
				return false;



	//deleting a contact
		public boolean deleteContact(String cid) {

			//checks to see if contact id exist for(Contact l:1istofContacts) {
				if(l.getContactID().equals(cid)) { 
					listofContacts.remove(1); 
					return true;
				}
				else {

					return false;
				}

	//update contact list
		public boolean updateContact(String cid, String fn, String ln, String pn, String addr) {

			for(Contact l:listofContacts) { 
				if(l.getContactID().equals(cid)) {
					//checks & update first name 
					if(!fn.equals("") && !(fn.length() > 10)) {
						l.setFirstName(fn);
					}

					//checks & update last name
					if(!ln.equals("") && !(ln.length() > 10)) {
						l.setLastName(ln);

					}
					//checks & update phone number
					if(!pn.equals("") && !(pn.length() > 10)) {
						l.setPhoneNumber(pn);
					}
					
					//checks & update address
					if(!addr.equals("") && !(addr.length() > 30)) {
						l.setAddress(addr);
					}
						return true;

			}
		}
	}
}
