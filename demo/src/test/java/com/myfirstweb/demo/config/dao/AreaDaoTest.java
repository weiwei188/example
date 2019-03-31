package com.myfirstweb.demo.config.dao;

import com.myfirstweb.demo.entity.Area;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
//dao层开发
@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {
    @Autowired
    private AreaDao areaDao;

    @Test
    @Ignore
    public void queryArea() {
        List<Area> areaList=areaDao.queryArea();
        assertEquals(1,areaList.size());
    }

    @Test
    @Ignore//ignore标签运行时忽略当前测试
    public void queryAreaById() {
//        Area area=areaDao.queryAreaById(1);
//        assertEquals("东苑",area.getAreaName());
    }

    @Test
    @Ignore
    public void insertArea() {
//        Area area=new Area();
//        area.setAreaName("南苑");
//        area.setPriority(1);
//        int effectedNum=areaDao.insertArea(area);
//        assertEquals(1,effectedNum);
    }

    @Test
    @Ignore
    public void updateArea() {
       // Area area=
    }

    @Test
    @Ignore
    public void deleteArea() {
    }
}