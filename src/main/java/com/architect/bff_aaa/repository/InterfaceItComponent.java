package com.architect.bff_aaa.repository;
import java.util.List;

import com.architect.bff_aaa.model.RelationConsumerApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.architect.bff_aaa.model.RelationItComponent;

@Repository
public interface InterfaceItComponent extends JpaRepository<RelationItComponent, Long>{
    List<RelationItComponent> findByName(@Param("id") Long id);
}
