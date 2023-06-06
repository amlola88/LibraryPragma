package com.PRAGMA.Library.Repository;

import com.PRAGMA.Library.Entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AutorRepository extends JpaRepository<Autor,Integer> {
}
