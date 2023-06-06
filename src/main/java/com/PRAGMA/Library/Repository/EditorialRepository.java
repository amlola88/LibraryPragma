package com.PRAGMA.Library.Repository;

import com.PRAGMA.Library.Entity.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditorialRepository extends JpaRepository<Editorial,Integer> {
}
