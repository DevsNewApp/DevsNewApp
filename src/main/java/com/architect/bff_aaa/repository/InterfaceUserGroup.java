package com.architect.bff_aaa.repository;
import java.util.List;

import com.architect.bff_aaa.model.RelationItComponent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.architect.bff_aaa.model.RelationUserGroup;

@Repository
public interface InterfaceUserGroup extends JpaRepository<RelationUserGroup , Long>{
    List<RelationUserGroup> findByName(@Param("id") Long id);
}
