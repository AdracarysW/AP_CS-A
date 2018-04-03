
public class Address {

	private String myName;
	private String myStreet;
	private String myCity;
	private String myState;
	private String myZip;

	//constructors
	public Address(String name, String street, String city, String state, String zip) {
		myName = name;
		myStreet = street;
		myCity = city;
		myState = state;
		myZip = zip;
	}

	//accessors
	public String getName()
	{ return myName; }
	public String getStreet()
	{ return myStreet; }
	public String getCity()
	{ return myCity; }
	public String getState()
	{ return myState; }
	public String getZip()
	{ return myZip; }
}