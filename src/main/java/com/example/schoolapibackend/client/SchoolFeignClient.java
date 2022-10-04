package com.example.schoolapibackend.client;

import com.example.schoolapibackend.config.FeignConfig;
import com.example.schoolapibackend.domain.SchoolInfo;
import com.example.schoolapibackend.dto.SchoolInfoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "schoolFeignClient", url = "https://open.neis.go.kr/hub", configuration = FeignConfig.class)
public interface SchoolFeignClient {
    @RequestMapping(method = RequestMethod.GET, value = "/schoolInfo")
    SchoolInfoDto getSchoolInfo(
            @RequestParam(value = "KEY") String key,
            @RequestParam(value = "Type") String type,
            @RequestParam(value = "pIndex") int pIndex,
            @RequestParam(value = "pSize") int pSize);
}
