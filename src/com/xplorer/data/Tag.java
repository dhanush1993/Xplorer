package com.xplorer.data;

import java.util.HashMap;

public class Tag {
	
	private String tagName;
	private HashMap<String, String> assocExtFileType;
	
	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	public HashMap<String, String> getAssExtFileType() {
		return assocExtFileType;
	}
	public void setAssExtFileType(HashMap<String, String> assocExtFileType) {
		this.assocExtFileType = assocExtFileType;
	}

	

}
