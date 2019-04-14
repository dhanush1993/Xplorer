package com.xplorer.interfaces;

import java.util.ArrayList;

import com.xplorer.data.Tag;
import com.xplorer.data.XFile;
import com.xplorer.exceptions.DBException;
import com.xplorer.exceptions.QueryResultException;
import com.xplorer.exceptions.SQLException;
import com.xplorer.exceptions.TableException;

public interface IDao {
	
	public void createTable(String tablename)throws DBException;
	public void addToFileTable(XFile file)throws TableException;
	public void addToTagsTable(Tag tag)throws TableException;
	public ArrayList<XFile> getAllFiles()throws SQLException, QueryResultException;
	public ArrayList<Tag> getAllTags()throws SQLException, QueryResultException;
	public ArrayList<XFile> getFilesByName(XFile file)throws SQLException, QueryResultException;
	public ArrayList<XFile> getFilesByType(String type)throws SQLException, QueryResultException;
	public ArrayList<XFile> getFilesByExt(String ext)throws SQLException, QueryResultException;
	public ArrayList<XFile> getFilesByName(String filename)throws SQLException, QueryResultException;
	public ArrayList<XFile> getFilesByTags(Tag tag)throws SQLException, QueryResultException;
	public ArrayList<XFile> getFilesByTags(String tagname)throws SQLException, QueryResultException;
	public ArrayList<Tag> getFileTags(XFile file)throws SQLException, QueryResultException;

}
