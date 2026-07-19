package com.srb.Demo.repository;

import com.srb.Demo.model.FileMetaData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FileDataRepository extends MongoRepository<FileMetaData, String> {
}
