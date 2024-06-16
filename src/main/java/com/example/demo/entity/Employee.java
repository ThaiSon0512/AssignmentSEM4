package com.example.demo.entity;

import lombok.*;
import com.example.demo.jpaRepository.annotation.Column;
import com.example.demo.jpaRepository.annotation.Entity;
import com.example.demo.jpaRepository.annotation.Id;

@Getter
@Setter
@Builder
//@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity(tableName = "employee")
public class Employee {

    @Id(name =  "id") // meaning id : primary key
    private Long id;
    @Column(columnName = "name")
    private String name;
    @Column(columnName = "dob")
    private String dob;
    @Column(columnName = "address")
    private String address;
    @Column(columnName = "salary")
    private String salary;
    @Column(columnName = "netsalary")
    private String netsalary;
    @Column(columnName = "bhxh")
    private String bhxh;
    @Column(columnName = "vitri")
    private String vitri;

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + dob + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
