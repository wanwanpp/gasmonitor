package com.gasmonitor.controller.sys;import com.gasmonitor.dao.BasRoleRepository;import com.gasmonitor.entity.BasRole;import com.gasmonitor.vo.AjaxResult;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Controller;import org.springframework.web.bind.annotation.PathVariable;import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.ResponseBody;import java.util.List;/** * Created by saplmm on 2017/7/25. * 基础数据 */@Controller@RequestMapping(value = "bas/role")public class BaseDataRoleController {    @Autowired    private BasRoleRepository basRoleRepository;    @RequestMapping(value = "list")    public String unitList() {        return "bas/unit/list";    }    @ResponseBody    @RequestMapping(value = "ajax/list")    public AjaxResult<BasRole> unitAjaxList() {        List<BasRole> basRoles = basRoleRepository.findAll();        return AjaxResult.NewAjaxResult(basRoles);    }//    @ResponseBody//    @RequestMapping(value = "ajax/get")//    public AjaxResult<BasRole> unitAjaxGet(Long id) {//        BasRole basDeviceUnits = basDataUnitService.findOne(id);//        return AjaxResult.NewAjaxResult(basDeviceUnits);//    }    @ResponseBody    @RequestMapping(value = "ajax/new")    public AjaxResult<BasRole> unitNew(BasRole basDeviceUnit) {        basRoleRepository.save(basDeviceUnit);        return AjaxResult.SuccAjaxResult();    }    @ResponseBody    @RequestMapping(value = "update")    public AjaxResult<BasRole> unitUpdate(BasRole basDeviceUnit) {        basRoleRepository.save(basDeviceUnit);        return AjaxResult.SuccAjaxResult();    }    @ResponseBody    @RequestMapping(value = "ajax/delete/{id}")    public AjaxResult<BasRole> unitDelete(@PathVariable("id") Long id) {        basRoleRepository.delete(id);        return AjaxResult.SuccAjaxResult();    }//    @ResponseBody//    @RequestMapping(value = "ajax/selectoption")//    public AjaxResult<BasDeviceUnit> unitSelectOption() {//        List<BasDeviceUnit> list = basDataUnitService.selectOptions();//        return AjaxResult.NewAjaxResult(list);//    }}