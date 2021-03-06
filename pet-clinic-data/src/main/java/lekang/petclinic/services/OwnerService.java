package lekang.petclinic.services;

import lekang.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findBySecondName(String secondName);

}
