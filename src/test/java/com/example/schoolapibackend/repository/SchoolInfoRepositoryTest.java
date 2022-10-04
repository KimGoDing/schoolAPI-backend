package com.example.schoolapibackend.repository;

import com.example.schoolapibackend.domain.SchoolInfo;
import com.example.schoolapibackend.dto.SchoolInfoDto;
import com.example.schoolapibackend.service.SchoolFeignService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SchoolInfoRepositoryTest {

    @Autowired
    SchoolInfoRepository schoolInfoRepository;

    @Autowired
    SchoolFeignService schoolFeignService;

    @Test
    void test() {
        int pSize = 100;
        SchoolInfoDto schoolInfoDto = schoolFeignService.getSchoolInfo("109d00c3cf35465f99a8ea341d822795", "json", 1, 1);
        int list_total_count = schoolInfoDto.getSchoolInfo().get(0).getHead().get(0).getList_total_count();

        for (int j = 1; j <= list_total_count / 100 + 1; j++) {
            if (j == list_total_count / 100 + 1) pSize = list_total_count % 100;
            schoolInfoDto = schoolFeignService.getSchoolInfo("109d00c3cf35465f99a8ea341d822795", "json", j, pSize);
            for (int i = 0; i < pSize; i++) {
                List<SchoolInfoDto.Row> row = schoolInfoDto.getSchoolInfo().get(1).getRow();
                SchoolInfo schoolInfo = new SchoolInfo();
                schoolInfo.setAddress(row.get(i).getAddress());
                schoolInfo.setSchoolCode(row.get(i).getSchoolCode());
                schoolInfo.setSchoolName(row.get(i).getSchoolName());
                schoolInfoRepository.save(schoolInfo);
            }
        }
    }
}