package com.xplorer.data;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

public class XFile {
	private String filename;
	private URI path;
	private String fileType;
	private String ext;
	private ArrayList<Tag> tags;
	
	public XFile(String filename) throws URISyntaxException {
		this.filename = filename;
		this.path = new URI("");
		this.fileType = "unknown";
		this.ext = "";
		this.tags = new ArrayList<>();
	}
	
	public XFile(String filename, URI path) {
		this.filename = filename;
		this.path = path;
		this.fileType = "unknown";
		this.ext = "";
		this.tags = new ArrayList<>();
	}
	
	public XFile(String filename, URI path, String fileType, String ext) {
		this.filename = filename;
		this.path = path;
		this.fileType = fileType;
		this.ext = ext;
		this.tags = new ArrayList<>();
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public URI getPath() {
		return path;
	}

	public void setPath(URI path) {
		this.path = path;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	public ArrayList<Tag> getTags() {
		return tags;
	}

	public void setTags(ArrayList<Tag> tags) {
		this.tags = tags;
	}
	
	public void setTag(Tag tag) {
		this.tags.add(tag);
	}
	
	public Tag getTag(int index) {
		return this.tags.get(index);
	}
	
	
	

}
