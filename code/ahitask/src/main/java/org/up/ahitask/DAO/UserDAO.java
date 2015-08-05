package org.up.ahitask.DAO;

import org.up.ahitask.entities.User;


public interface UserDAO {
	public abstract int saveNewUser(User user);
	public abstract User findById(User user);
	public abstract User findByEMail(User user);

}
