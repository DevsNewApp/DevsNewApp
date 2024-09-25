package com.architect.bff_aaa.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.architect.bff_aaa.model.APInterface;

@Repository
public interface APInterfaceRepository extends JpaRepository<APInterface, Long>{
    List<APInterface> findByName(@Param("name") String name);
}
