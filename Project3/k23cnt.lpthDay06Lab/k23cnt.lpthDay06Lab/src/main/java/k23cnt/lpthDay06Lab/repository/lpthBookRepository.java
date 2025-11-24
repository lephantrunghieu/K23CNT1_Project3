package k23cnt.lpthDay06Lab.repository;
import k23cnt.lpthDay06Lab.entity.lpthBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface lpthBookRepository extends JpaRepository<lpthBook,
        Long> {
}