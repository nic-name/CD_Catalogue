import java.util.Objects;

public class CD {
	
	//fields for the CD class
	private String name;
	private String artist;
	private String yearReleased;
	private String recordLabel;

	//Constructor taking in 4 arguements 
	public CD(String name, String artist, String yearReleased, String recordLabel) {
		super();
		this.name = name;
		this.artist = artist;
		this.yearReleased = yearReleased;
		this.recordLabel = recordLabel;
	}

	//Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getYearReleased() {
		return yearReleased;
	}

	public void setYearReleased(String yearReleased) {
		this.yearReleased = yearReleased;
	}

	public String getRecordLabel() {
		return recordLabel;
	}

	public void setRecordLabel(String recordLabel) {
		this.recordLabel = recordLabel;
	}

	//Overriding toString
	@Override
	public String toString() {
		return "\nName: " + name + "\nArtist: " + artist + "\nYear Released: " + yearReleased + "\nRecord Label: "
				+ recordLabel;
	}
	
	//Overriding equals method
	@Override
	public boolean equals(Object obj){
		
		//check for null
		if (obj == null){
		return false;
		}
		
		//make sure the object is a CD
		if (getClass() != obj.getClass()){
		return false;
		}
		
		//cast the object as a CD
		final CD nameEntered = (CD) obj;
		
		//check the field
		if(!Objects.equals(this.name, nameEntered.name)){
			return false;
		}
		
		return true;

	}
}
