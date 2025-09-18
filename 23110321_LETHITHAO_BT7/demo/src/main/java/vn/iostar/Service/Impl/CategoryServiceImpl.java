package vn.iostar.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import vn.iostar.Entity.CategoryEntity;
import vn.iostar.Repository.CategoryRepository;
import vn.iostar.Service.ICategoryService;

@Service
public class CategoryServiceImpl implements ICategoryService{
	@Autowired
	CategoryRepository categoryRepository;
	public CategoryServiceImpl(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	public List<CategoryEntity> findByNameContaining(String name) {
		return categoryRepository.findByNameContaining(name);
	}
	public Page<CategoryEntity> findByNameContaining(String name, Pageable pageable) {
		return categoryRepository.findByNameContaining(name, pageable);
	}
	
	public List<CategoryEntity> findByStatus(Boolean status) {
		return categoryRepository.findByStatus(status);
	}
	
	public Page<CategoryEntity> findByStatus(Boolean status, Pageable pageable) {
		return categoryRepository.findByStatus(status, pageable);
	}
	
	public Page<CategoryEntity> findByNameContainingAndStatus(String name, Boolean status, Pageable pageable) {
		return categoryRepository.findByNameContainingAndStatus(name, status, pageable);
	}
	
	public <S extends CategoryEntity> Optional<S> findOne(Example<S> example) {
		return categoryRepository.findOne(example);
	}
	public List<CategoryEntity> findAll(Sort sort) {
		return categoryRepository.findAll(sort);
	}
	public <S extends CategoryEntity> S save(S entity) {
		return categoryRepository.save(entity);
	}
	public Page<CategoryEntity> findAll(Pageable pageable) {
		return categoryRepository.findAll(pageable);
	}
	public List<CategoryEntity> findAll() {
		return categoryRepository.findAll();
	}
	public List<CategoryEntity> findAllById(Iterable<Long> ids) {
		return categoryRepository.findAllById(ids);
	}
	public Optional<CategoryEntity> findById(Long id) {
		return categoryRepository.findById(id);
	}
	public long count() {
		return categoryRepository.count();
	}
	public void deleteById(Long id) {
		categoryRepository.deleteById(id);
	}
	public void delete(CategoryEntity entity) {
		categoryRepository.delete(entity);
	}
	public void deleteAll() {
		categoryRepository.deleteAll();
	}
	
}