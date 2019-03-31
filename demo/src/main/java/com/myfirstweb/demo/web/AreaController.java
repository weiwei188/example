package com.myfirstweb.demo.web;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.myfirstweb.demo.entity.Area;
import com.myfirstweb.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParseException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
//返回字符串
//RestController就是@Controller和@ResponseBody这两个标签的组合
@RequestMapping("/demo")//指定一个根路由(注意路由最好都是要小写的)
public class AreaController {
    @Autowired
    private AreaService areaService;

    @RequestMapping(value="/xixi",method= RequestMethod.GET)

    private Map<String,Object> listArea(){//键值对
        Map<String,Object>modelMap=new HashMap<String,Object>();
        List<Area> list=areaService.getArealist();
        modelMap.put("areaList",list);
        return modelMap;

    }
    @RequestMapping(value="/getareabyid",method=RequestMethod.GET)
    private Map<String,Object> getAreaById(Integer areaId){
        Map<String,Object>modelMap=new HashMap<String,Object>();
        Area area=areaService.getAreaById(areaId);
        modelMap.put("area",area);
        return modelMap;
    }
    @RequestMapping(value="/addarea",method=RequestMethod.POST)
    private Map<String,Object> addArea(@RequestBody Area area){
        Map<String,Object>modelMap=new HashMap<String,Object>();
        modelMap.put("success",areaService.addArea(area));
        return modelMap;
    }
    @RequestMapping(value="/modifyarea",method=RequestMethod.POST)
    private Map<String,Object> modifyArea(@RequestBody Area area){
        Map<String,Object>modelMap=new HashMap<String,Object>();
        modelMap.put("success",areaService.modifyArea(area));
        return modelMap;
    }
    @RequestMapping(value="/removearea",method=RequestMethod.GET)
    private Map<String,Object> removeArea(Integer areaId){
        Map<String,Object>modelMap=new HashMap<String,Object>();
        //修改区域信息
        modelMap.put("success",areaService.deleteArea(areaId));
        return modelMap;
    }



}
