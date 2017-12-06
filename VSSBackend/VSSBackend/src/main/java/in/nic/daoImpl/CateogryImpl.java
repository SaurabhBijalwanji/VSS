package in.nic.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import in.nic.dao.CategpryDAO;
import in.nic.dto.Category;

@Repository("categoryDAO")
public class CateogryImpl implements CategpryDAO {

	private static List<Category> categories =new ArrayList<>();
	
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}
	@Override

	public Category getCategory(int id) {
	for (Category category : categories) {
		if(category.getId()==id)return category;
		
	}
			return null;
		}
	
	
	
	static
	{
		Category cat1 = new Category();
		cat1.setId(1);
		cat1.setDescription("This is description of Issues");
		cat1.setImageUrl("CAT_1.png");
		cat1.setName("VahanIssues");
		categories.add(cat1);
		
		cat1 = new Category();
		cat1.setId(2);
		cat1.setDescription("This is description of Issues");
		cat1.setImageUrl("CAT_2.png");
		cat1.setName("VahanIssues");
		categories.add(cat1);
		
		categories.add(cat1);
		cat1 = new Category();
		cat1.setId(3);
		cat1.setDescription("This is description of Issues");
		cat1.setImageUrl("CAT_3.png");
		cat1.setName("VahanIssues");
		
	}




	

}
