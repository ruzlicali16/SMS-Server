package com.smscaster.SMS.Caster.repositories;

import com.smscaster.SMS.Caster.models.Officer;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IOfficerRepository extends MongoRepository<Officer, String> {
  Officer findBy_id(ObjectId _id);
}
