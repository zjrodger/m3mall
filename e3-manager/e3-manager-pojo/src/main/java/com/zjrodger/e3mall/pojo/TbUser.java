package com.zjrodger.e3mall.pojo;

import java.util.Date;

public class TbUser {
    /**
     * 
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码，加密存储
     */
    private String password;

    /**
     * 注册手机号
     */
    private String phone;

    /**
     * 注册邮箱
     */
    private String email;

    /**
     * 
     */
    private Date created;

    /**
     * 
     */
    private Date updated;

    /**
     * 
     * @return id 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 用户名
     * @return username 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 用户名
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 密码，加密存储
     * @return password 密码，加密存储
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码，加密存储
     * @param password 密码，加密存储
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 注册手机号
     * @return phone 注册手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 注册手机号
     * @param phone 注册手机号
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 注册邮箱
     * @return email 注册邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 注册邮箱
     * @param email 注册邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 
     * @return created 
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 
     * @param created 
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 
     * @return updated 
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 
     * @param updated 
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}