package com.example.demo.dto;

import com.example.demo.jpaRepository.annotation.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDto {
    private Long id;
    private String name;
    private String dob;
    private String address;
    private String salary;
    private String netsalary;
    private String bhxh;
    private String vitri;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public String getBhxh() {
        return bhxh;
    }

    public void setBhxh(String bhxh) {
        this.bhxh = bhxh;
    }

    public String getNetsalary() {
        return netsalary;
    }

    public void setNetsalary(String netsalary) {
        this.netsalary = netsalary;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
