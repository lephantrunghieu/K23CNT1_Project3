package k23cnt.lpthDay06Lab.repository;
import k23cnt.lpthDay06Lab.entity.lpthAuthor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface lpthAuthorRepository extends
        JpaRepository<lpthAuthor, Long> {
}