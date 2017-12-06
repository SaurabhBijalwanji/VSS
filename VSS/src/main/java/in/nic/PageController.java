package in.nic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import in.nic.dao.CategpryDAO;
import in.nic.dto.Category;

@Controller
public class PageController {

	@Autowired
	private CategpryDAO categoryDAO;
	
	@RequestMapping(value ={"/" ,"/home","/index" })
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("page");
         mv.addObject("Title", "Home ");
         mv.addObject("onClickhome", true);
         
         mv.addObject("categories", categoryDAO.list());
		return mv;
	}
	
	@RequestMapping(value ={"/about" })
	public ModelAndView about()
	{
		ModelAndView mv = new ModelAndView("page");
         mv.addObject("Title", "About Us");
         mv.addObject("onClickabout", true);
		return mv;
	}
	
	
	@RequestMapping(value ={"/service" })
	public ModelAndView service()
	{
		ModelAndView mv = new ModelAndView("page");
         mv.addObject("Title", "Service");
         mv.addObject("onClickservice", true);
		return mv;
	}
	@RequestMapping(value ={"/contact" })
	public ModelAndView contact()
	{
		ModelAndView mv = new ModelAndView("page");
         mv.addObject("Title", "Contact Us");
         mv.addObject("onClickcontact", true);
		return mv;
	}
	@RequestMapping(value ={"/issue" })
	public ModelAndView issue()
	{
		ModelAndView mv = new ModelAndView("page");
         mv.addObject("Title", "Issue Problem");
         mv.addObject("onClickissue", true);
		return mv;
	}

	@RequestMapping(value ={"/show/all/products"})
	public ModelAndView showAllProducts()
		{
		ModelAndView mv = new ModelAndView("page");
        
       System.out.println("Reached Here");
         
         // adding title category name
         mv.addObject("Title", "All Products");
         
         //adding list of category
         mv.addObject("categories", categoryDAO.list());
         
         mv.addObject("onClickAllProducts", true);
		return mv;
	}
	
	
	@RequestMapping(value ={"/we"})
	public ModelAndView we()
		{
		ModelAndView mv = new ModelAndView("page");
        
       System.out.println("Reached Here");
         
         // adding title category name
         mv.addObject("Title", "All Products");
         
         //adding list of category
         mv.addObject("categories", categoryDAO.list());
         
         mv.addObject("onClickAllProducts", true);
		return mv;
	}
	
	@RequestMapping(value ={"/show/category/{id}/products" })
	public ModelAndView showCategoryProducts(@PathVariable("id") int id )
		{
		ModelAndView mv = new ModelAndView("page");
        
       
         
         Category category = null;
         category = categoryDAO.getCategory(id);
         
         // adding title category name
         mv.addObject("Title", category.getName());
         
         //adding list of category
         mv.addObject("categories", categoryDAO.list());
         
         mv.addObject("onClickCategoryProducts", true);
		return mv;
	}
}
