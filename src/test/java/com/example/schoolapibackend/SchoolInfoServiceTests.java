package com.example.schoolapibackend;

import com.example.schoolapibackend.domain.SchoolInfo;
import com.example.schoolapibackend.dto.SchoolInfoDto;
import com.example.schoolapibackend.service.SchoolFeignService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SchoolInfoServiceTests {

    @Autowired
    private SchoolFeignService schoolFeignService;

    @Test
    void test() {
        SchoolInfoDto json = schoolFeignService.getSchoolInfo("109d00c3cf35465f99a8ea341d822795", "json", 1, 100);
        System.out.println("json = " + json.toString());
        SchoolInfoDto.Row row = new SchoolInfoDto.Row();
        int list_total_count = json.getSchoolInfo().get(0).getHead().get(0).getList_total_count();
        System.out.println("list_total_count = " + list_total_count);
    }
}
