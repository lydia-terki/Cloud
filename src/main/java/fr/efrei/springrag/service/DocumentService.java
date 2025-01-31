package fr.efrei.springrag.service;

import fr.efrei.springrag.domain.Document;
import fr.efrei.springrag.repository.DocumentRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
@Service
public class DocumentService {
    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public Optional<Document> findById(Long id){
        return documentRepository.findById(id);
    }

    public void deleteById(Long id){
        documentRepository.deleteById(id);
    }

    public List<Document> findAll(){
        return documentRepository.findAll();
    }

    private final DocumentRepository documentRepository;

}
