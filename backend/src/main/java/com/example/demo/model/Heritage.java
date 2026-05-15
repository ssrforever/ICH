package com.example.demo.model;
import javax.persistence.*;

@Entity
@Table(name = "cultural_heritage")
public class Heritage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;        // 非遗名称
    private String category;    // 类别：技艺、表演、民俗等
    private String province;    // 所属省份
    private String description; // 简介

    public Heritage() {}
    // 构造函数
    public Heritage(Long id, String name, String category, String province, String description) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.province = province;
        this.description = description;
    }

    // Getters and Setters (IDEA 可以按 Cmd+N 自动生成)
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public String getProvince() { return province; }
    public String getDescription() { return description; }
}