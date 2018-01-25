package in.nic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import in.nic.dao.CategpryDAO;
import in.nic.dto.Category;
interface Drawable{  
    public void draw();  
} 
@Controller
public class PageController {

	@Autowired
	private CategpryDAO categoryDAO;
	
	@RequestMapping(value ={"/" ,"/home","/index" })
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("page");
         mv.addObject("Title", "Home ");
         mv.addObject("userClickhome", true);
         
         mv.addObject("categories", categoryDAO.list());
         
         int width=10;  
         
      /*   //without lambda, Drawable implementation using anonymous class  
         Drawable d=new Drawable(){  
             public void draw(){System.out.println("Drawing "+width);}  
         };  
         d.draw(); */ 
         
         //with lambda  
         Drawable d2=()->{  
             System.out.println("Drawing "+width);  
         };  
         d2.draw();  
		return mv;
	}
	
	@RequestMapping(value ={"/about" })
	public ModelAndView about()
	{
		ModelAndView mv = new ModelAndView("page");
         mv.addObject("Title", "About Us");
         mv.addObject("userClickabout", true);
		return mv;
	}
	
	
	@RequestMapping(value ="/service" )
	public ModelAndView service()
	{
		ModelAndView mv = new ModelAndView("page");
         mv.addObject("Title", "Service");
         mv.addObject("userClickservice", true);
		return mv;
	}
	@RequestMapping(value ="/contact" )
	public ModelAndView contact()
	{
		ModelAndView mv = new ModelAndView("page");
         mv.addObject("Title", "Contact Us");
         mv.addObject("userClickcontact", true);
		return mv;
	}
	@RequestMapping(value ="/issue" )
	public ModelAndView issue()
	{
		ModelAndView mv = new ModelAndView("page");
         mv.addObject("Title", "Issue Problem");
         mv.addObject("userClickissue", true);
		return mv;
	}

/*	@RequestMapping(value ={"we","/show/all/products"})
	public ModelAndView showAllProducts()
		{
		ModelAndView mv = new ModelAndView("page");
        
     
         
         // adding title category name
         mv.addObject("Title", "All Products");
         
         //adding list of category
         mv.addObject("categories", categoryDAO.list());
         
         mv.addObject("userClickAllProducts", true);
		return mv;
	}
	*/
	
	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts() {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("Title","All Products");
		
		//passing the list of categories
		mv.addObject("categories", categoryDAO.list());
		
		mv.addObject("userClickAllProducts",true);
		return mv;				
	}
	
	
	
	@RequestMapping(value ="/we3")
	public ModelAndView we()
		{
		ModelAndView mv = new ModelAndView("page");
        
       
         
         // adding title category name
         mv.addObject("Title", "All Products");
         
         //adding list of category
         mv.addObject("categories", categoryDAO.list());
         
         mv.addObject("onClickAllProducts", true);
		return mv;
	}
	
	@RequestMapping(value ="/show/category/{id}/products" )
	public ModelAndView showCategoryProducts(@PathVariable("id") int id )
		{
		ModelAndView mv = new ModelAndView("page");
        
       
         
         Category category = null;
         category = categoryDAO.getCategory(id);
         
         // adding title category name
         mv.addObject("Title", category.getName());
         
         //adding list of category
         mv.addObject("categories", categoryDAO.list());
         
         mv.addObject("userClickCategoryProducts", true);
		return mv;
	}
}
