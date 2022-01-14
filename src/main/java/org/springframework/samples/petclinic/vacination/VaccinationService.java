package org.springframework.samples.petclinic.vacination;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VaccinationService {
    @Autowired
    VaccinationRepository vaccinationRepository;

    public List<Vaccination> getAll(){
        return vaccinationRepository.findAll();
    }

    public List<Vaccine> getAllVaccines(){
        return null;
    }

    public Vaccine getVaccine(String typeName) {
        return vaccinationRepository.getVaccine(typeName);
    }

    public Vaccination save(Vaccination p) throws UnfeasibleVaccinationException {
        return null;       
    }

    
}
