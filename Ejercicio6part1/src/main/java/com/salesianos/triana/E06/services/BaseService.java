package com.salesianos.triana.E06.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public class BaseService<T,ID, R extends JpaRepository<T,ID>> {

    @Autowired
    protected R repository;

    public List<T> findAll(){
        return repository.findAll();
    }
    public Optional<T> findById(ID id){
        return repository.findById(id);
    }
    public void delete(T t){
        repository.delete(t);
    }
    public void deleteById(ID id){
        repository.deleteById(id);
    }
    public void save(T t){
        repository.save(t);
    }
    public void edit(T t){
        repository.save(t);
    }
}
