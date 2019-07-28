package com.myfirstweb.demo.config.dao;

import com.myfirstweb.demo.entity.Area;

import java.util.List;

public interface AreaDao {
    List<Area> queryArea();
    Area queryAreaById(int areaId);
    //增
    int insertArea(Area area);
    //改
    int updateArea(Area area);
    //删除
    int deleteArea(int areaId);

}
