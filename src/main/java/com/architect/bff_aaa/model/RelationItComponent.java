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
@Table(name = "RelationItComponent")
@EntityListeners(AuditingEntityListener.class)
public class RelationItComponent {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idApi;
    private String externalId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getIdApi() {
        return idApi;
    }

    public void setIdApi(Long idApi) {
        this.idApi = idApi;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public RelationItComponent(Long id, Long idApi, String externalId) {
        this.id = id;
        this.idApi = idApi;
        this.externalId = externalId;
    }

    @Override
    public String toString() {
        return "RelationItComponent{" +
                "id=" + id +
                ", idApi=" + idApi +
                ", externalId='" + externalId + '\'' +
                '}';
    }
}
