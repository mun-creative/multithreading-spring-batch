package com.medha.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="record")
public class Record {

	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Record [id=" + id + "]";
	}
	
	
	
	
}
