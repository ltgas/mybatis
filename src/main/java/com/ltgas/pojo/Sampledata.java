package com.ltgas.pojo;

import java.io.Serializable;
import java.util.Date;

public class Sampledata implements Serializable {
    Integer id;
    Integer sid;
    String cName;
    String aliasName;
    Integer age;
    String eMail;
    String cid;
    Character gender;
    Boolean member;
    Float chineseScore;
    Float mathScore;
    Float englishScore;
    Float totalScore;
    String mobile;
    String address;
    Date joinDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Boolean getMember() {
        return member;
    }

    public void setMember(Boolean member) {
        this.member = member;
    }

    public Float getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(Float chineseScore) {
        this.chineseScore = chineseScore;
    }

    public Float getMathScore() {
        return mathScore;
    }

    public void setMathScore(Float mathScore) {
        this.mathScore = mathScore;
    }

    public Float getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(Float englishScore) {
        this.englishScore = englishScore;
    }

    public Float getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Float totalScore) {
        this.totalScore = totalScore;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public Sampledata(Integer id, Integer sid, String cName, String aliasName, Integer age, String eMail, String cid, Character gender, Boolean member, Float chineseScore, Float mathScore, Float englishScore, Float totalScore, String mobile, String address, Date joinDate) {
        this.id = id;
        this.sid = sid;
        this.cName = cName;
        this.aliasName = aliasName;
        this.age = age;
        this.eMail = eMail;
        this.cid = cid;
        this.gender = gender;
        this.member = member;
        this.chineseScore = chineseScore;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
        this.totalScore = totalScore;
        this.mobile = mobile;
        this.address = address;
        this.joinDate = joinDate;
    }

    // 为测试插入全部数据使用
    public Sampledata(Integer sid, String cName, String aliasName, Integer age, String eMail, String cid, Character gender, Boolean member, Float chineseScore, Float mathScore, Float englishScore, Float totalScore, String mobile, String address, Date joinDate) {
        this.sid = sid;
        this.cName = cName;
        this.aliasName = aliasName;
        this.age = age;
        this.eMail = eMail;
        this.cid = cid;
        this.gender = gender;
        this.member = member;
        this.chineseScore = chineseScore;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
        this.totalScore = totalScore;
        this.mobile = mobile;
        this.address = address;
        this.joinDate = joinDate;
    }

    // 为测试插入关键数据使用
    public Sampledata(Integer sid, String cName, Integer age, Character gender, Boolean member, Float chineseScore, Float mathScore, Float englishScore, Date joinDate) {
        this.sid = sid;
        this.cName = cName;
        this.age = age;
        this.gender = gender;
        this.member = member;
        this.chineseScore = chineseScore;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        return "Sampledata{" +
                "id=" + id +
                ", sid=" + sid +
                ", cName='" + cName + '\'' +
                ", aliasName='" + aliasName + '\'' +
                ", age=" + age +
                ", eMail='" + eMail + '\'' +
                ", cid='" + cid + '\'' +
                ", gender=" + gender +
                ", member=" + member +
                ", chineseScore=" + chineseScore +
                ", mathScore=" + mathScore +
                ", englishScore=" + englishScore +
                ", totalScore=" + totalScore +
                ", mobile='" + mobile + '\'' +
                ", address='" + address + '\'' +
                ", joinDate=" + joinDate +
                '}';
    }
}
