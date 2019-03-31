package com.myfirstweb.demo.service;

import com.myfirstweb.demo.entity.Area;

import java.util.List;

public interface AreaService {
    List<Area> getArealist();
    //通过区域id获取区域信息
    Area getAreaById(int areaId);
    //增加区域信息
    boolean addArea(Area area);
    //修改区域信息
    boolean modifyArea(Area area);
    //删除区域信息
    boolean deleteArea(int areaId);
}
