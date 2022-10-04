package com.example.schoolapibackend.domain;

import com.google.gson.annotations.SerializedName;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@NoArgsConstructor
@Getter
@AllArgsConstructor
@Setter
@ToString
public class SchoolInfo {

    @Id
    private String id;

    @Indexed
    private String educationOfficeCode;
    @Indexed
    private String educationOfficeName;
    @Indexed
    private String schoolCode;
    @Indexed
    private String schoolName;
    @Indexed
    private String schoolType;
    @Indexed
    private String locationName;
    @Indexed
    private String address;
    @Indexed
    private String addressDetail;
    @Indexed
    private String coeducationName;
    @Indexed
    private String highSchoolType;
    @Indexed
    private String industryClassExist;
    @Indexed
    private String highSchoolTypeDetail;
    @Indexed
    private String specialHighSchoolCurriculum;
    @Indexed
    private String entranceExamPeriod;
    @Indexed
    private String dayNightType;
    @Indexed
    private String establishmentDate;
    @Indexed
    private String schoolAnniversary;
}
