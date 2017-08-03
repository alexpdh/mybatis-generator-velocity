package com.generator.model;

import java.io.Serializable;
import java.util.Date;

public class TfFEmployee implements Serializable {
    /**
     * 员工ID
     *
     * @mbg.generated
     */
    private Long empId;

    /**
     * 部门ID
     *
     * @mbg.generated
     */
    private Long departId;

    /**
     * 部门名字
     *
     * @mbg.generated
     */
    private String departName;

    /**
     * 员工名字
     *
     * @mbg.generated
     */
    private String empName;

    /**
     * 性别 male:男, female:女
     *
     * @mbg.generated
     */
    private String gender;

    /**
     * 生日
     *
     * @mbg.generated
     */
    private Date birthDate;

    /**
     * 职位名称
     *
     * @mbg.generated
     */
    private String title;

    /**
     * 职位等级
     *
     * @mbg.generated
     */
    private String grade;

    private static final long serialVersionUID = 1L;

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public Long getDepartId() {
        return departId;
    }

    public void setDepartId(Long departId) {
        this.departId = departId;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", empId=").append(empId);
        sb.append(", departId=").append(departId);
        sb.append(", departName=").append(departName);
        sb.append(", empName=").append(empName);
        sb.append(", gender=").append(gender);
        sb.append(", birthDate=").append(birthDate);
        sb.append(", title=").append(title);
        sb.append(", grade=").append(grade);
        sb.append("]");
        return sb.toString();
    }
}