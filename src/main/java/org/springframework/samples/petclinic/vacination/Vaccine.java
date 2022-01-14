package org.springframework.samples.petclinic.vacination;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.samples.petclinic.model.NamedEntity;
import org.springframework.samples.petclinic.pet.PetType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "vaccines")
public class Vaccine extends NamedEntity{
    
    @Min(0)
    Double price;

    @ManyToOne(optional = false)
    @NotNull
	@JoinColumn(name = "pet_type_id")
    PetType petType;
}
