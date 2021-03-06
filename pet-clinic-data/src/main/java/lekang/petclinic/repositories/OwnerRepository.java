package lekang.petclinic.repositories;

import lekang.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findBySecondName(String lastName);
}
