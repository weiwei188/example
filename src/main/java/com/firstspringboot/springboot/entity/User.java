package com.firstspringboot.springboot.entity;

public class User {
    private Integer id=0;
    private String name=" ";
    private Integer sex=0;
    private String telephone=" ";
    private String registerAction=" ";
    private String thirdPartyId=" ";
    private Integer age=0;
    private String password=" ";

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getRegister_action() {
        return registerAction;
    }

    public void setRegister_action(String register_action) {
        this.registerAction = register_action;
    }

    public String getThird_party_id() {
        return thirdPartyId;
    }

    public void setThird_party_id(String third_party_id) {
        this.thirdPartyId = third_party_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "User{" +
                "userId='" + id + '\'' +
                ", userName='" + name + '\'' +
                ", userSex='" + sex + '\'' +
                ", userTelephone='" + telephone + '\'' +
                ", userRegister_action='" + registerAction + '\'' +
                ", userThird_party_id='" + thirdPartyId+ '\'' +
                ", userAge='" + age + '\'' +
                ", userPassword='" +  password+ '\'' +
                '}';
    }
}
