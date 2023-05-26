package com.tjut.rubbish_java.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data
@TableName("can_rubbish")
public class CanRubbish extends Model<CanRubbish> {

    @TableId(type = IdType.AUTO)
    private Integer id;

    @TableField("can_id")
    private Integer canId;

    @TableField("rubbish_id")
    private Integer rubbishId;
}
