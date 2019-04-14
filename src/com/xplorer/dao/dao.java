/**
 * 
 */
package com.xplorer.dao;

import java.util.ArrayList;

import com.xplorer.data.Tag;
import com.xplorer.data.XFile;
import com.xplorer.exceptions.DBException;
import com.xplorer.exceptions.QueryResultException;
import com.xplorer.exceptions.SQLException;
import com.xplorer.exceptions.TableException;
import com.xplorer.interfaces.IDao;

/**
 * @author Dhanush
 *
 */
public class dao implements IDao {

	@Override
	public void createTable(String tablename) throws DBException {
		// TODO Auto-generated method stub

	}

	@Override
	public void addToFileTable(XFile file) throws TableException {
		// TODO Auto-generated method stub

	}

	@Override
	public void addToTagsTable(Tag tag) throws TableException {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<XFile> getAllFiles() throws SQLException, QueryResultException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Tag> getAllTags() throws SQLException, QueryResultException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<XFile> getFilesByName(XFile file) throws SQLException, QueryResultException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<XFile> getFilesByType(String type) throws SQLException, QueryResultException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<XFile> getFilesByExt(String ext) throws SQLException, QueryResultException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<XFile> getFilesByName(String filename) throws SQLException, QueryResultException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<XFile> getFilesByTags(Tag tag) throws SQLException, QueryResultException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<XFile> getFilesByTags(String tagname) throws SQLException, QueryResultException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Tag> getFileTags(XFile file) throws SQLException, QueryResultException {
		// TODO Auto-generated method stub
		return null;
	}

}
