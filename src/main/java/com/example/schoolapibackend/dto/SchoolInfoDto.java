package com.example.schoolapibackend.dto;

import com.example.schoolapibackend.domain.SchoolInfo;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@ToString
@Getter
public class SchoolInfoDto {

    private List<SchoolInfoResponse> schoolInfo;

    @ToString
    @Getter
    public static class SchoolInfoResponse {
        private List<Head> head;
        private List<Row> row;
    }

    @ToString
    @Getter
    public static class Row {
        /**
         * 시도교육청 코드
         */
        @SerializedName("ATPT_OFCDC_SC_CODE")
        private String educationOfficeCode;
        /**
         * 시도교육청명
         */
        @SerializedName("ATPT_OFCDC_SC_NM")
        private String educationOfficeName;
        /**
         * 표준학교코드
         */
        @SerializedName("SD_SCHUL_CODE")
        private String schoolCode;
        /**
         * 학교명
         */
        @SerializedName("SCHUL_NM")
        private String schoolName;
        /**
         * 영문학교명
         */
        @SerializedName("ENG_SCHUL_NM")
        private String EnglishSchoolName;
        /**
         * 학교종류명
         */
        @SerializedName("SCHUL_KND_SC_NM")
        private String schoolType;
        /**
         * 소재지명
         */
        @SerializedName("LCTN_SC_NM")
        private String locationName;
        /**
         * 관할조직명
         */
        @SerializedName("JU_ORG_NM")
        private String jurisdictionName;
        /**
         * 설립명
         */
        @SerializedName("FOND_SC_NM")
        private String establishmentName;
        /**
         * 도로명 우편번호
         */
        @SerializedName("ORG_RDNZC")
        private String postcode;
        /**
         * 도로명주소
         */
        @SerializedName("ORG_RDNMA")
        private String address;
        /**
         * 도로명상세주소
         */
        @SerializedName("ORG_RDNDA")
        private String addressDetail;
        /**
         * 전화번호
         */
        @SerializedName("ORG_TELNO")
        private String tellNumber;
        /**
         * 홈페이지 주소
         */
        @SerializedName("HMPG_ADRES")
        private String homepage;
        /**
         * 남녀공학 구분명
         */
        @SerializedName("COEDU_SC_NM")
        private String coeducationName;
        /**
         * 팩스 번호
         */
        @SerializedName("ORG_FAXNO")
        private String faxNumber;
        /**
         * 고등학교 구분명
         */
        @SerializedName("HS_SC_NM")
        private String highSchoolType;
        /**
         * 산업체 특별학급 존재여부
         */
        @SerializedName("INDST_SPECL_CCCCL_EXST_YN")
        private String industryClassExist;
        /**
         * 고등학교 일반/실업 구분명
         */
        @SerializedName("HS_GNRL_BUSNS_SC_NM")
        private String highSchoolTypeDetail;
        /**
         * 특수목적고등학교 계열명
         */
        @SerializedName("SPCLY_PURPS_HS_ORD_NM")
        private String specialHighSchoolCurriculum;
        /**
         * 입시전후 구분명
         */
        @SerializedName("ENE_BFE_SEHF_SC_NM")
        private String entranceExamPeriod;
        /**
         * 주/야 구분명
         */
        @SerializedName("DGHT_SC_NM")
        private String dayNightType;
        /**
         * 설립일자
         */
        @SerializedName("FOND_YMD")
        private String establishmentDate;
        /**
         * 개교기념일
         */
        @SerializedName("FOAS_MEMRD")
        private String schoolAnniversary;
        /**
         * 수정일
         */
        @SerializedName("LOAD_DTM")
        private String editDate;
    }

    @ToString
    @Getter
    public static class Head {
        private int list_total_count;
        private Result result;
    }

    @ToString
    @Getter
    public static class Result {
        private String code;
        private String message;
    }
}
