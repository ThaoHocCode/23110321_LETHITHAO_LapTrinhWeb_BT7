package vn.iostar.Repository;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.iostar.Entity.CategoryEntity;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity,Long>{
	// tìm theo tên chứa
	List<CategoryEntity> findByNameContaining(String name);
	
	// tìm theo tên chứa với phân trang
	Page<CategoryEntity> findByNameContaining(String name, Pageable pageable);
	
	// tìm theo trạng thái
	List<CategoryEntity> findByStatus(Boolean status);
	
	// tìm theo trạng thái với phân trang
	Page<CategoryEntity> findByStatus(Boolean status, Pageable pageable);
	
	// tìm theo tên và trạng thái với phân trang
	Page<CategoryEntity> findByNameContainingAndStatus(String name, Boolean status, Pageable pageable);
}
