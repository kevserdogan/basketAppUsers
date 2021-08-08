package com.basketapp.basketuser.basketappuser.reposityory;


import com.basketapp.basketuser.basketappuser.entity.User;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CouchbaseRepository<User, String> {
}
