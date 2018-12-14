package com.baizhi.springbootjsp1.domain;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @JSONField(serialize = false)
    private Long id;
    private String name;
    private Integer age;
    private String sex;
    //以下两个注解是单一配置，也可以在yml中进行全局配置(这种情况实在实体类非常多的情况)
    //@JsonFormat(pattern = "yyyy-MM-dd")
    //@JSONField(format = "yyyy-MM-dd")
    private Date birthday;
}
