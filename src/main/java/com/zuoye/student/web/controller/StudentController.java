package com.zuoye.student.web.controller;

import com.zuoye.student.bean.Student;
import com.zuoye.student.util.Message;
import com.zuoye.student.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@Api(description = "学生控制器")
public class StudentController {
    @PostMapping("/add")
    @ApiOperation(value = "添加")
    public Message add(Student student){
        /*Message<String> message=new Message<>();
        Date date=new Date();
        message.setTime(date.getTime());
        message.setStatus(200);
        message.setMessage("添加成功");*/
        return MessageUtil.success("添加成功");
    }
    @GetMapping("/delete")
    @ApiOperation(value = "删除")//对该方法进行说明
    //@ApiImplicitParam(name = "stuID",value="学号",paramType = "query",dataType = "int")//对delete(int stuID)一个参数进行说明
    @ApiImplicitParams({@ApiImplicitParam(name = "stuID",value="学号",paramType = "query",dataType = "int",required = true),
                        @ApiImplicitParam(name = "name",value="学生姓名",paramType = "query",dataType = "string")})
    //方法内有多个属性描述时，用ApiImplicitParams
    public Message delete(int stuID,String name){
        return MessageUtil.success("删除成功" );
    }
}
