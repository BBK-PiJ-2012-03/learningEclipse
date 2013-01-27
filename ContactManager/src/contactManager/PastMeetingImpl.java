package contactManager;

import java.util.Calendar;
import java.util.Set;
public class PastMeetingImpl extends MeetingImpl implements PastMeeting {
	private String notes;
	
	public PastMeetingImpl(int ID, Set<Contact> mySet, Calendar date, String notes) {
		super(ID, mySet, date);
		this.notes = notes;
	}

	public String getNotes() {
		return notes;
	}
}	