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

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TfFEmployee other = (TfFEmployee) that;
        return (this.getEmpId() == null ? other.getEmpId() == null : this.getEmpId().equals(other.getEmpId()))
            && (this.getDepartId() == null ? other.getDepartId() == null : this.getDepartId().equals(other.getDepartId()))
            && (this.getDepartName() == null ? other.getDepartName() == null : this.getDepartName().equals(other.getDepartName()))
            && (this.getEmpName() == null ? other.getEmpName() == null : this.getEmpName().equals(other.getEmpName()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getBirthDate() == null ? other.getBirthDate() == null : this.getBirthDate().equals(other.getBirthDate()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getGrade() == null ? other.getGrade() == null : this.getGrade().equals(other.getGrade()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEmpId() == null) ? 0 : getEmpId().hashCode());
        result = prime * result + ((getDepartId() == null) ? 0 : getDepartId().hashCode());
        result = prime * result + ((getDepartName() == null) ? 0 : getDepartName().hashCode());
        result = prime * result + ((getEmpName() == null) ? 0 : getEmpName().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getBirthDate() == null) ? 0 : getBirthDate().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getGrade() == null) ? 0 : getGrade().hashCode());
        return result;
    }
}