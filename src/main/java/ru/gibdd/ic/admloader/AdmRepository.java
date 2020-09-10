package ru.gibdd.ic.admloader;

import org.springframework.data.repository.CrudRepository;
import ru.gibdd.ic.admloader.entity.Admpractice;

public interface AdmRepository extends CrudRepository<Admpractice, Integer> {
}
