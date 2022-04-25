package cs320_module3_contact_contactService;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;


class ContactServiceTest {

	@Test
	void testAdd() {
		ContactService cs = new ContactService();

		Contact cs1 = new
Contact("123456789","Faek","Lname","2155555555","123 Fake St Fake");
	assertEquals(true, cs.addContact(cs1));
	}
	@Test
	void testDelete() {
		ContactService cs = new ContactService();

		Contact cs1 = new
		Contact("123456789","Fake","Lname","2155555555","123 Fake St Fakeville");
		Contact cs2 = new Contact("987654321","Bobert","Barkers","2155556666","456 Kiss St Randomville");
		Contact cs3 = new
		Contact("112233445","Joe","Mama","2153335555","1 No St Randomville");
		Contact cs4 = new
		Contact("335577890","Frank","Sinatras","2158885555","123 Even St Random Creek");
		Contact cs5 = new
		Contact("224466789","God","Alweakly","2152225555","1 Fake St Holy City");

		assertEquals(true, cs.deleteContact("987654321"));
		assertEquals(false,cs.deleteContact("657489321"));
		assertEquals(false,cs.deleteContact("224466789"));
		}
	@Test
	void testUpdate() {
		ContactService cs = new ContactService();

		Contact cs1 = new
		Contact("123456789","Fake","OLname","2155555555","123 Fake St Fakeville");
		Contact cs2 = new Contact("987654321","Bobert","Barkers","2155556666","456 Kiss St Randomville");
		Contact cs3 = new
		Contact("112233445","Joe","Mama","2153335555","1 No St Randomville");
		Contact cs4 = new
		Contact("335577890","Frank","Sinatras","2158885555","123 Even St Random Creek");
		Contact cs5 = new
		Contact("224466789","God","Alweakly","2152225555","1 Fake St Holy City");

		cs.addContact(cs1);
		cs.addContact(cs2);
		cs.addContact(cs3);
		cs.addContact(cs4);
		cs.addContact(cs5);

		assertEquals(true,cs.updateContact("567123456", "Ether", "Moneymak3r", "2154565555", "123 Scam Ave"));
		assertEquals(false, cs.updateContact("987321000", "Doge", "Dog", "2159875555", "1 Cool Lakeshore Drive"));
	}
}
