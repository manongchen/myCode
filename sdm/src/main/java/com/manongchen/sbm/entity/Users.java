package com.manongchen.sbm.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * users(Users)实体类
 *
 * @author xingchen
 * @since 2020-07-31 13:36:07
 */
public class Users implements Serializable {
    private static final long serialVersionUID = 248685284319147370L;
    /**
    * 用户编号
    */
    private Integer userId;
    /**
    * 用户姓名
    */
    private String userName;
    /**
    * 手机号
    */
    private String phone;
    /**
    * 密码
    */
    private String password;
    /**
    * 创建人
    */
    private String createdBy;
    /**
    * 创建时间
    */
    private Date createdTime;
    /**
    * 更新人
    */
    private String updatedBy;
    /**
    * 更新时间
    */
    private Date updatedTime;

    
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    
    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
    
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
    
    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

}