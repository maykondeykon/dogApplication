package com.example.dog;

import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;

public interface DogRepository extends DatastoreRepository<Dog, Long> {
}
