package com.vinaylogics.playwithjava.hibernate.hibernate_search.models;

import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.TermVector;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Indexed
@Table
public class Product implements Serializable {

    private static final long serialVersionUID = -7606524210523320393L;

    @Id
    private Long id;

    @Field(termVector = TermVector.YES)
    private String productName;

    @Field(termVector = TermVector.YES)
    private String description;

    @Field
    private int memory;

    public Product() {
    }

    public Product(Long id, String productName, String description, int memory) {
        this.id = id;
        this.productName = productName;
        this.description = description;
        this.memory = memory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return memory == product.memory &&
                Objects.equals(id, product.id) &&
                Objects.equals(productName, product.productName) &&
                Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productName, description, memory);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", memory=" + memory +
                '}';
    }
}
