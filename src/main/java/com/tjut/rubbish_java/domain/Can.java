package com.tjut.rubbish_java.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data
//@TableName("can") //数据库表名
public class Can extends Model<Can> {
    @TableId(type = IdType.AUTO) //设置主键自增
    private Integer canId;
//    @TableField("can_name")
    private String canName;
}
