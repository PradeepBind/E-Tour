package controller;

import repository.SubcategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.CategoryDTO;
import service.CategoryService;

@RestController
@RequestMapping("/api/subcategories")
@CrossOrigin(origins = "*") 
public class SubCategoryController {
	
	
	
//	public RespnseEntity<List<SubcategoryDTO>> getAllSubcategories(){
//		return ResponseEntity.ok()
//	}
	
}
