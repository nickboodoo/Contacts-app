package cs320_module3_contact_contactService;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {
	//test ContactID
	@Test
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890000","Faek Lname","Lname","2155555555","678 Fake St Fakeville");
		};

	}
	@Test
	void testContactIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890000","Faek Lname","Lname","2155555555","678 Fake St Fakeville");
		};
	}
	//test firstName
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890000","Faek Lname","Lname","2155555555","678 Fake St Fakeville");
		};
	}
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890",null,"Lname", "2155555555","678 Fake St Fakeville");
		};
	}
	//test lastName
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890","Faek","Lnameeeeeeee", "2155555555","678 Fake St Fakeville");
		};
	}
	@Test
	void testLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890","Faek",null, "2155555555","678 Fake St Fakeville");
		};
	}


	//test phoneNumber
	@Test
	void testPhoneNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890","Faek","Lname", "2155555555888","678 Fake St Fakeville");
		};
	}
	@Test
	void testPhoneNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890","Faek","Lname", null,"678 Fake St Fakeville");
		};
	}
	//test address
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890","Faek","Lname", "2155555555","678 Fake St Lname PA 9062145667");
		};
	}
	@Test
	void testAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890","Faek","Lname", "2155555555",null);
		};
	}
}