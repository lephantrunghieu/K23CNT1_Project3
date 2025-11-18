package k23cnt.lpthDay06Lab.service;

import k23cnt.lpthDay06Lab.respository.LpthAuthorRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LpthBookService {
    @Autowired
    private LpthAuthorRespository lpthAuthorRespository;
}
