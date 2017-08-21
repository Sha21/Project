/*package com.niit.Controllers;

//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Path;
//import java.nio.file.Paths;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.ResponseBody;

import com.niit.Service.CategoryService;
import com.niit.model.Addcategory;
import com.niit.model.Addproduct;





public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/admin/addcategory")
	@ResponseBody
	public String getaddcategory(Model model)
	
	{
		List<Addproduct> products=categoryService.getAllAddproducts();
		model.addAttribute("products", products);
		model.addAttribute("category", new Addcategory());
		return "addcategory";
	}
        @RequestMapping("/admin/addcategory/savecategory")
        public String savecategory( @ModelAttribute(name="category") Addcategory category)
        {
        	
        	categoryService.savecategory(category);
        	return "success";
        }
        @RequestMapping("/admin/addcategory/viewcategory")
        public String getAllAddcategory(Model model)
        {
        	List<Addcategory> categorys=categoryService.getAllAddcategories();
        	model.addAttribute("categorys", categorys);
        	return "categorylist";
        }
        @RequestMapping("/admin/addcategory/viewcategory/{id}")
        public String getAddcategoryById(@PathVariable int id,Model model)
        {
        Addcategory category=categoryService.getAddcategoryById(id);
        model.addAttribute("category", category);
        return "viewcategory";
        }
        
        @RequestMapping("/admin/addcategory/deletecategory/{id}")
        public String deletecategoryById(@PathVariable int id)
        {
        categoryService.deletecategory(id);
        
        return "redirect:/admin/addcategory/viewcategory";
        }
        
        @RequestMapping("/admin/addcategory/geteditform/{id}")
        public String getEditForm(@PathVariable int id,Model model)
        {
        	List<Addproduct> products=categoryService.getAllAddproducts();
        	model.addAttribute("products", products);
        Addcategory category=categoryService.getAddcategoryById(id);
        model.addAttribute("categoryObj", category);
        return "editcategory";
        }
        
        @RequestMapping("/admin/addcategory/editcategory")
        public String editcategory(@Valid @ModelAttribute(name="categoryObj") Addcategory category)
        {
        	
        categoryService.updatecategory(category);
        return "redirect:/admin/addcategory/viewcategory";
        }
        


}
*/