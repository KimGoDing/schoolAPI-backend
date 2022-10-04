package com.example.schoolapibackend.controller;

import com.example.schoolapibackend.domain.SchoolInfo;
import com.example.schoolapibackend.dto.SchoolInfoDto;
import com.example.schoolapibackend.service.SchoolFeignService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SchoolController {

    private final SchoolFeignService schoolFeignService;

    @GetMapping("/schoolInfo")
    public SchoolInfoDto getSchoolInfo(
            @RequestParam(value = "KEY") String key,
            @RequestParam(value = "Type") String type,
            @RequestParam(value = "pIndex") int pIndex,
            @RequestParam(value = "pSize") int pSize) {

        return schoolFeignService.getSchoolInfo(key, type, pIndex, pSize);
    }

    @PostMapping("/schoolInfo")
    public void saveSchoolInfo() {
        schoolFeignService.saveSchoolInfo();
    }
}
