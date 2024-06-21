package com.oysterGame.domains;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public abstract class AbstractService<T, Long> {

    protected JpaRepository<T, Long> repository;

    public AbstractService(JpaRepository<T, Long> repository){
        this.repository = repository;
    }

    public List<T> getAll(){
        return repository.findAll();
    }

    public T getById(Long id){
        return repository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Could not find entity with that ID.")
        );
    }

    public T add(T newEntity){
        return repository.save(newEntity);
    }

    public abstract T update(T updateEntity, Long id);

    public void delete(Long id) { repository.deleteById(id);}
}
