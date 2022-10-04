package com.example.schoolapibackend.service;

import com.example.schoolapibackend.client.SchoolFeignClient;
import com.example.schoolapibackend.domain.SchoolInfo;
import com.example.schoolapibackend.dto.SchoolInfoDto;
import com.example.schoolapibackend.repository.SchoolInfoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class SchoolFeignService {

    private final SchoolFeignClient schoolFeignClient;
    private final SchoolInfoRepository schoolInfoRepository;

    public void saveSchoolInfo() {
        int pSize = 100;
        SchoolInfoDto schoolInfoDto = this.getSchoolInfo("109d00c3cf35465f99a8ea341d822795", "json", 1, 1);
        int list_total_count = schoolInfoDto.getSchoolInfo().get(0).getHead().get(0).getList_total_count();

        for (int j = 1; j <= list_total_count / 100 + 1; j++) {
            if (j == list_total_count / 100 + 1) pSize = list_total_count % 100;
            schoolInfoDto = this.getSchoolInfo("109d00c3cf35465f99a8ea341d822795", "json", j, pSize);
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

    public SchoolInfoDto getSchoolInfo(String key, String type, int pIndex, int pSize) {
        SchoolInfoDto schoolInfo = schoolFeignClient.getSchoolInfo(key, type, pIndex, pSize);
        List<SchoolInfoDto.Row> row = schoolInfo.getSchoolInfo().get(1).getRow();

        return schoolFeignClient.getSchoolInfo(key, type, pIndex, pSize);
    }
}
