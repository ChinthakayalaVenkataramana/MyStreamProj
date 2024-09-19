package com.vnk.Base;
public class Movies {
private String movieName;
private String actorName;
private Byte actorAge;
private String actorPlace;
private Integer releaseYear;
private Integer collection;
public Movies(String movieName, String actorName, Byte actorAge, String actorPlace, Integer releaseYear,
		Integer collection) {
	super();
	this.movieName = movieName;
	this.actorName = actorName;
	this.actorAge = actorAge;
	this.actorPlace = actorPlace;
	this.releaseYear = releaseYear;
	this.collection = collection;
}

@Override
public String toString() {
	return "Movies [ "+movieName + "   " + actorName + "    " + actorAge + "    "
			+ actorPlace + "    " + releaseYear + "   " + collection + "cr]";
}

public String getMovieName() {
	return movieName;
}

public void setMovieName(String movieName) {
	this.movieName = movieName;
}

public String getActorName() {
	return actorName;
}

public void setActorName(String actorName) {
	this.actorName = actorName;
}

public Byte getActorAge() {
	return actorAge;
}

public void setActorAge(Byte actorAge) {
	this.actorAge = actorAge;
}

public String getActorPlace() {
	return actorPlace;
}

public void setActorPlace(String actorPlace) {
	this.actorPlace = actorPlace;
}

public Integer getReleaseYear() {
	return releaseYear;
}

public void setReleaseYear(Integer releaseYear) {
	this.releaseYear = releaseYear;
}

public Integer getCollection() {
	return collection;
}

public void setCollection(Integer collection) {
	this.collection = collection;
}


}
