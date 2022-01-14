package org.springframework.samples.petclinic.vacination;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.samples.petclinic.model.NamedEntity;
import org.springframework.samples.petclinic.pet.Pet;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "vaccinations")
public class Vaccination extends NamedEntity {

    @Column(name = "date") 
    @NotNull       
	@DateTimeFormat(pattern = "yyyy/MM/dd")
    LocalDate date;

    @ManyToOne
    @NotNull
	@JoinColumn(name = "vaccinated_pet_id")
    Pet vaccinatedPet;  

    @ManyToOne
    Vaccine vaccine; 
}
