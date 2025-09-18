package vn.iostar.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import vn.iostar.Entity.CategoryEntity;

public interface ICategoryService {
    
    List<CategoryEntity> findByNameContaining(String name);
    
    Page<CategoryEntity> findByNameContaining(String name, Pageable pageable);
    
    // tìm theo trạng thái
    List<CategoryEntity> findByStatus(Boolean status);
    
    // tìm theo trạng thái với phân trang
    Page<CategoryEntity> findByStatus(Boolean status, Pageable pageable);
    
    // tìm theo tên và trạng thái với phân trang
    Page<CategoryEntity> findByNameContainingAndStatus(String name, Boolean status, Pageable pageable);
    
    <S extends CategoryEntity> Optional<S> findOne(Example<S> example);
    
    List<CategoryEntity> findAll(Sort sort);
    
    <S extends CategoryEntity> S save(S entity);
    
    Page<CategoryEntity> findAll(Pageable pageable);
    
    List<CategoryEntity> findAll();
    
    List<CategoryEntity> findAllById(Iterable<Long> ids);
    
    Optional<CategoryEntity> findById(Long id);
    
    long count();
    
    void deleteById(Long id);
    
    void delete(CategoryEntity entity);
    
    void deleteAll();
}
