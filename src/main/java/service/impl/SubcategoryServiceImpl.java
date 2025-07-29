package service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dto.SubcategoryDTO;
import entity.Category;
import entity.Subcategory;
import mapper.Mapper;
import repository.SubcategoryRepository;
import service.SubcategoryService;

public class SubcategoryServiceImpl implements SubcategoryService{

	@Autowired
	private SubcategoryRepository subCatRepo;
	@Override
	public List<SubcategoryDTO> getAllSubcategories() {
	 	List<Subcategory> subcategories=subCatRepo.findAll();
	 	List<SubcategoryDTO> subCatDto = new ArrayList<>();
	 	for(Subcategory subcategory:subcategories) {
	 		SubcategoryDTO subDto = Mapper.MaptoCategoryDTO(subcategory)
	 		subCatDto.add(subDto)
	 	}
		return null;
	}

}
