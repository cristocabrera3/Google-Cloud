package com.ecommerce.customer.model;



import javax.annotation.PostConstruct;
import javax.persistence.*;


@Entity
@Table(name = "categories", uniqueConstraints = @UniqueConstraint(columnNames = "name"))
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long id;
    private String name;
    private boolean is_deleted;
    private boolean is_activated;

    public Category(String name){
        this.name = name;
        this.is_activated = true;
        this.is_deleted = false;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean is_deleted() {
		return is_deleted;
	}

	public void set_deleted(boolean is_deleted) {
		this.is_deleted = is_deleted;
	}

	public boolean is_activated() {
		return is_activated;
	}

	public void set_activated(boolean is_activated) {
		this.is_activated = is_activated;
	}

	public Category(Long id, String name, boolean is_deleted, boolean is_activated) {
	
		this.id = id;
		this.name = name;
		this.is_deleted = is_deleted;
		this.is_activated = is_activated;
	}

	public Category() {

	}
    
    

}
