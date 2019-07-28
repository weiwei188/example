package com.myfirstweb.demo.entity;
//创建实体类
import java.util.Date;

public class Area {
    //主键ID
    private Integer areaId;
    //名称
    private String areaName;
    //权重，越大越排前显示
    private Integer priority;
    //创建时间
    private Date createTime;
    //更新时间
    private Date lastEditTime;
//光标放在类里面，alt+insert,然后选择Getter and Setter,就可以给私有成员生成set和get方法了。
    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }
}
