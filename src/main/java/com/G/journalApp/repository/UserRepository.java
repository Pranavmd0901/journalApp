package com.G.journalApp.repository;

import com.G.journalApp.entity.JournalEntry;
import com.G.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {

    User findByUserName(String username);
    void deleteByUserName(String username);

}
