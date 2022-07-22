package org.exam.controller;

import org.exam.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dept")
public class DeptController {

    @Autowired
    private IDeptService deptService;

    @GetMapping("ok/{id}")
    public String deptInfo_Ok(@PathVariable Integer id) {
        return deptService.deptInfo_Ok(id);
    }

    @GetMapping("out/{id}")
    public String deptInfo_Timeout(@PathVariable Integer id) {
        return deptService.deptInfo_Timeout(id);
    }
}
