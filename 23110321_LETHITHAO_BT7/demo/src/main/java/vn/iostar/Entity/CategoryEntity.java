package vn.iostar.Entity;
import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Categories")

public class CategoryEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long categoryId;
	
	@Column(name="category_name", length=200, columnDefinition="nvarchar(200) not null")
	private String name;
	
	@Column(name="description", length=500, columnDefinition="nvarchar(500)")
	private String description;
	
	@Column(name="status")
	private Boolean status = true;
	
	/*
	 * @OneToMany(mappedBy ="category",cascade = CascadeType.ALL) private
	 * Set<ProductEntity> products;
	 */
	
}