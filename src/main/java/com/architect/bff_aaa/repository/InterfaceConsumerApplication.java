package com.architect.bff_aaa.repository;
import java.util.List;

import com.architect.bff_aaa.model.APInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.architect.bff_aaa.model.RelationConsumerApplication;

@Repository
public interface InterfaceConsumerApplication extends JpaRepository<RelationConsumerApplication, Long>{
    List<RelationConsumerApplication> findByName(@Param("id") Long id);
}
