package contactManager;

//The implementation of Contact Interface

public class ContactImpl implements Contact {
	private int ID;
	private String name;
	private String notes;
	
	public ContactImpl(int ID, String name) {
		this.ID = ID;
		this.name = name;
		this.notes = "";
	}

	public int getId() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public String getNotes() {
		return notes;
	}
	
	public void addNotes(String note) {
		notes = notes + "\n" + note;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((notes == null) ? 0 : notes.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		ContactImpl other = (ContactImpl) obj;
		if (ID != other.ID) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (notes == null) {
			if (other.notes != null) {
				return false;
			}
		} else if (!notes.equals(other.notes)) {
			return false;
		}
		return true;
	}	
	
/**	@Override
  public boolean equals(Object obj) {
     if (obj == null) {
      return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		ContactImpl contact = (ContactImpl) obj;
		if (this.ID != contact.getId()) {
			return false;
		}
		if (!this.name.equals(contact.getName())) {
			return false;
		}
		if (!this.notes.equals(contact.getNotes())) {
			return false;
		}
		return true;
	}
	*/
}	
		
	