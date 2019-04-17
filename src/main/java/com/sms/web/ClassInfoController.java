package com.sms.web;

import com.sms.model.ClassInfo;
import com.sms.service.ClassInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/klass")
public class ClassInfoController {

    @Autowired
    private ClassInfoService service;

    @RequestMapping("/list")
    public String list(Model model){
        List<ClassInfo> classInfos = this.service.getClassInfos();
        model.addAttribute("klasses",classInfos);

        return "klass/list";
    }

    @RequestMapping("/delete")
    public String delete(long id){
        this.service.deleteClassInfo(id);
        return "redirect:/klass/list";
    }

    @RequestMapping(value="/add",method = RequestMethod.GET)
    public String add(){
        return "klass/add";
    }

    @RequestMapping(value="/add",method = RequestMethod.POST)
    public String add(ClassInfo klass){
        this.service.addClassInfo(klass);
        return "redirect:/klass/list";
    }

    @RequestMapping(value="/edit",method = RequestMethod.GET)
    public String edit(long id,Model model){
        ClassInfo klass = this.service.getClassInfo(id);
        model.addAttribute("klass",klass);

        return "klass/edit";
    }

    @RequestMapping(value="/edit",method = RequestMethod.POST)
    public String edit(ClassInfo klass){
        this.service.updateClassInfo(klass);
        return "redirect:/klass/list";
    }
}
