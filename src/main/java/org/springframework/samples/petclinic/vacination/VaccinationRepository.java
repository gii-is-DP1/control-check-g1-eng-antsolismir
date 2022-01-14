package org.springframework.samples.petclinic.vacination;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface VaccinationRepository extends CrudRepository<Vaccination,Integer>{
    List<Vaccination> findAll();

    @Query("SELECT vac FROM Vaccine vac WHERE vac.name = :name")
    Vaccine getVaccine(String name);

    @Query("SELECT vac FROM Vaccine vac")
    List<Vaccine> findAllVaccines();

    Optional<Vaccination> findById(int id);
    Vaccination save(Vaccination p);
}
