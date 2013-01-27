package contactManager;

import java.util.Calendar;
import java.util.Set;
public class FutureMeetingImpl extends MeetingImpl implements FutureMeeting  {

	public FutureMeetingImpl(int ID, Set<Contact> mySet, Calendar date) {
		super(ID, mySet, date);
	}
}