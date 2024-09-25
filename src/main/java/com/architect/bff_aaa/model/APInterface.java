package com.architect.bff_aaa.model;
import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "APInterface")
@EntityListeners(AuditingEntityListener.class)
public class APInterface {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name="version")
    private String release;
    private String cmdblink;
    private String description;
    private String category;

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

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getCmdblink() {
        return cmdblink;
    }

    public void setCmdblink(String cmdblink) {
        this.cmdblink = cmdblink;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public APInterface(){

    }

    public APInterface(Long id, String name, String release, String cmdblink, String description, String category) {
        this.id = id;
        this.name = name;
        this.release = release;
        this.cmdblink = cmdblink;
        this.description = description;
        this.category = category;
    }

    @Override
    public String toString() {
        return "APInterface{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", release='" + release + '\'' +
                ", cmdblink='" + cmdblink + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
