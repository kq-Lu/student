package com.zuoye.student.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel
public class Student implements Serializable {
    @ApiModelProperty(value = "学生id",required = true)
    private int id;
    @ApiModelProperty(value = "学生姓名")
    private String name;
    @ApiModelProperty(value = "学生分数")
    private double score;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
