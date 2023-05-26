package com.tjut.rubbish_java.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data
@TableName("rubbish")
public class Rubbish extends Model<Rubbish> {

    @TableId(type = IdType.AUTO)
    private Integer rubbishId;

    @TableField("rubbish_name")
    private String rubbishName;
}
