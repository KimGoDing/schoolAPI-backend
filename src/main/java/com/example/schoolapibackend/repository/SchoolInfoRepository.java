package com.example.schoolapibackend.repository;

import com.example.schoolapibackend.domain.SchoolInfo;
import com.example.schoolapibackend.dto.SchoolInfoDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

public interface SchoolInfoRepository extends CrudRepository<SchoolInfo, String> {

}
