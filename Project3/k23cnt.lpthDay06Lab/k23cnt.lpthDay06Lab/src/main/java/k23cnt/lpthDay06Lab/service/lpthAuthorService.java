package k23cnt.lpthDay06Lab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import k23cnt.lpthDay06Lab.entity.lpthAuthor;
import k23cnt.lpthDay06Lab.repository.lpthAuthorRepository;

@Service
public class lpthAuthorService {

    @Autowired
    private lpthAuthorRepository lpthauthorRepository;

    public List<lpthAuthor> getAllAuthors() {
        return lpthauthorRepository.findAll();
    }

    public lpthAuthor saveAuthor(lpthAuthor author) {
        return lpthauthorRepository.save(author);
    }

    public lpthAuthor getAuthorById(Long id) {
        return lpthauthorRepository.findById(id).orElse(null);
    }

    public void deleteAuthor(Long id) {
        lpthauthorRepository.deleteById(id);
    }

    public List<lpthAuthor> findAllById(List<Long> ids) {
        return lpthauthorRepository.findAllById(ids);
    }
}
