package vn.iostar.Controller.admin;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.validation.Valid;
import vn.iostar.Entity.CategoryEntity;
import vn.iostar.Model.CategoryModel;
import vn.iostar.Service.ICategoryService;

@Controller
@RequestMapping("/admin/categories")
public class CategoryController {
    
    @Autowired
    ICategoryService categoryService;
    
    @RequestMapping("")
    public String list(ModelMap model) {
        List<CategoryEntity> list = categoryService.findAll();
        model.addAttribute("categories", list);
        return "admin/categories/list";
    }
    
    @GetMapping("/searchpaginated")
    public String searchPaginated(ModelMap model,
            @RequestParam(name = "name", required = false) String name,
            @RequestParam("page") Optional<Integer> page,
            @RequestParam("size") Optional<Integer> size) {
        
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(5);
        
        Pageable pageable = PageRequest.of(currentPage - 1, pageSize, Sort.by("name"));
        Page<CategoryEntity> resultPage = null;
        
        if (StringUtils.hasText(name)) {
            resultPage = categoryService.findByNameContaining(name, pageable);
            model.addAttribute("name", name);
        } else {
            resultPage = categoryService.findAll(pageable);
        }
        
        model.addAttribute("categoryPage", resultPage);
        return "admin/categories/searchpaging";
    }
    
    @GetMapping("/add")
    public String add(ModelMap model) {
        CategoryModel cateModel = new CategoryModel();
        cateModel.setIsEdit(false);
        model.addAttribute("category", cateModel);
        return "admin/categories/addOrEdit";
    }
    
    @PostMapping("/saveOrUpdate")
    public ModelAndView saveOrUpdate(ModelMap model,
            @Valid @ModelAttribute("category") CategoryModel cateModel, BindingResult result) {
        
        if (result.hasErrors()) {
            return new ModelAndView("admin/categories/addOrEdit");
        }
        
        CategoryEntity entity = new CategoryEntity();
        // Copy properties from model to entity
        BeanUtils.copyProperties(cateModel, entity);
        
        // Call save method
        categoryService.save(entity);
        
        String message = "";
        if (cateModel.getIsEdit() == true) {
            message = "Category is Updated!";
        } else {
            message = "Category is Saved!";
        }
        model.addAttribute("message", message);
        return new ModelAndView("forward:/admin/categories/searchpaginated", model);
    }
    
    @GetMapping("/edit/{categoryId}")
    public ModelAndView edit(ModelMap model, @PathVariable("categoryId") Long categoryId) {
        Optional<CategoryEntity> optCategory = categoryService.findById(categoryId);
        CategoryModel cateModel = new CategoryModel();
        
        if (optCategory.isPresent()) {
            CategoryEntity entity = optCategory.get();
            // Copy properties from entity to model
            BeanUtils.copyProperties(entity, cateModel);
            cateModel.setIsEdit(true);
            
            model.addAttribute("category", cateModel);
            return new ModelAndView("admin/categories/addOrEdit", model);
        }
        
        model.addAttribute("message", "Category is not existed!");
        return new ModelAndView("forward:/admin/categories", model);
    }
    
    @GetMapping("/delete/{categoryId}")
    public ModelAndView delete(ModelMap model, @PathVariable("categoryId") Long categoryId) {
        try {
            categoryService.deleteById(categoryId);
            model.addAttribute("message", "Category is deleted!");
        } catch (Exception e) {
            model.addAttribute("message", "Error: " + e.getMessage());
        }
        return new ModelAndView("forward:/admin/categories/searchpaginated", model);
    }
    
    @GetMapping("/view/{categoryId}")
    public String view(@PathVariable("categoryId") Long categoryId, Model model) {
        Optional<CategoryEntity> optCategory = categoryService.findById(categoryId);
        if (optCategory.isPresent()) {
            model.addAttribute("category", optCategory.get());
            return "admin/categories/view";
        } else {
            model.addAttribute("message", "Category not found!");
            return "forward:/admin/categories";
        }
    }
}