package core;

/*Customer class*/
public class Customer {
	//Initialize variables to be used in Customer class.
	//@param name name, @param streetAddress street adress, 
	// @param city city, @param state state, @param zip zip (String values)
	//@param age age (integer value)
	String name;
	String streetAddress;
	String city;
	String state;
	String zip;
	int age;
	
	//Default constructor for Customer class sets all values to empty values.
	public Customer(){
		name = "none";
		streetAddress = "Uknown";
		city = "Unknown";
		state = "Uknown";
		zip = "Uknown";
		age = 0;
	}
	
	//Default constructor for Customer class sets all values to those set by user.
	public Customer(String n, String sA, String c, String s, String z, int a){
		name = n;
		streetAddress = sA;
		city = c;
		state = s;
		zip = z;
		age = a;
	}
	
	//Getter function getName returns name value.
	public String getName() {
		//@return name
		return name;
	}

	//Setter function setName assigns name value set by user.
	public void setName(String n) {
		name = n;
	}

	//Getter function getStreetAddress returns streetAddress value.
	public String getStreetAddress() {
		//@return streetAdress
		return streetAddress;
	}

	//Setter function setStreetAddress assigns streetAddress value set by user.
	public void setStreetAddress(String sA) {
		streetAddress = sA;
	}

	//Getter function getCity returns city value.
	//@return city
	public String getCity() {
		return city;
	}

	//Setter function setCity assigns city value set by user.
	public void setCity(String c) {
		city = c;
	}

	//Getter function getState returns state value.
	//@return state
	public String getState() {
		return state;
	}

	//Setter function setState assigns state value set by user.
	public void setState(String s) {
		state = s;
	}
	
	//Getter function getZip returns zip value
	//@return zip
	public String getZip() {
		return zip;
	}

	//Setter function setZip assigns zip value set by user.
	public void setZip(String z) {
		zip = z;
	}
	
	//Getter function getAge returns age value.
	//@return age
	public int getAge() {
		return age;
	}

	//Setter function setAge assigns age value set by user.
	public void setAge(int a) {
		age = a;
	}
	
	/* Method displayAddress returns the address as a String value*/
	//@return address
	public String displayAddress(){
		String address;
		//User getters to obtain values needed for address.
		address = "Address: " + getStreetAddress() + " " + getCity() + ", " + getState() + " " + getZip() ;
		return address;
	}
	
	/* Method displayAddressLabel returns the name and address as a String value*/
	//@return address label
	public String displayAddressLabel(){
		String addressLabel;
		//User getters to obtain values needed for address label.
		addressLabel = "Name: " + getName() + " Address: " + getStreetAddress() + " " + getCity() +", " + getState() + " " + getZip() ;
		return addressLabel;
	}
}