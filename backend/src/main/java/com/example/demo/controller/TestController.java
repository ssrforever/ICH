package com.example.demo.controller;

import com.example.demo.model.Heritage;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.repository.HeritageRepository;
import javax.persistence.*;

//@RestController
//@RequestMapping("/api")
//@CrossOrigin
//public class TestController {
//    @GetMapping("/heritages")
//    public List<Heritage> getHeritages() {
//        List<Heritage> list = new ArrayList<>();
//        // 模拟几条数据，后续我们会换成数据库查询
//        list.add(new Heritage(1L, "昆曲", "传统戏剧", "江苏", "百戏之祖，婉转优美。"));
//        list.add(new Heritage(2L, "皮影戏", "传统美术", "陕西", "光影间的艺术传承。"));
//        list.add(new Heritage(3L, "剪纸", "传统技艺", "全国", "一把剪刀剪出大千世界。"));
//        return list;
//    }
//}

@RestController
@RequestMapping("/api")
@CrossOrigin
public class TestController {

    @Autowired
    private HeritageRepository heritageRepository;

    @GetMapping("/heritages")
    public List<Heritage> getHeritages() {
        return heritageRepository.findAll(); // 👈 直接从数据库查
    }
}