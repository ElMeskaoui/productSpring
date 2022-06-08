package com.example.productspring.Repository;

import com.example.productspring.entities.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;

@CrossOrigin("*")
@RepositoryRestResource
public interface ProduitRepository extends JpaRepository<Produit, Long> {
    @RestResource(path = "/finbyDes")
    public List<Produit> findByDesContains(@Param("mc") String des);

    @RestResource(path = "/finbyDesPage")
    public Page<Produit> findByDesContains(@Param("mc") String des, Pageable pageable);
}
