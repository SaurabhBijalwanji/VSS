package in.nic.dao;

import java.util.List;

import in.nic.dto.Category;

public interface CategpryDAO {

	public List<Category> list();
	public Category getCategory(int id);
}
