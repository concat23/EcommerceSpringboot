package dev.concat.vab.ecommercespringboot.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "vab_categories")
public class Category extends BasicEntity{

    @Id
    @Override
    public Integer getId() {
        return super.getId();
    }
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;

}
