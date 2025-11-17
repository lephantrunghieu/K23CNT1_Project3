package k23cnt1.lephantrunghieu.respository;

import k23cnt1.lephantrunghieu.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CategoryRepository extends
        JpaRepository<Category, Long> {
}