package contactManager;

import java.util.Calendar;
import java.util.Set;

public class MeetingImpl implements Meeting {
	private int ID;
	private Calendar date;
	private Set<Contact> mySet;
	
	public MeetingImpl(int ID, Set<Contact> mySet, Calendar date) {
		this.ID = ID;
		this.mySet = mySet;
		this.date = date;	
	}

	public int getId() {
		return ID;
	}

	public Calendar getDate() {
		return date;
	}

	public Set<Contact> getContacts() {
		return mySet;
	}
}	
		