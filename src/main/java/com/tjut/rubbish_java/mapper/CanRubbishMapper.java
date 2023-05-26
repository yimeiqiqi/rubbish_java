package com.tjut.rubbish_java.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tjut.rubbish_java.domain.CanRubbish;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CanRubbishMapper extends BaseMapper<CanRubbish> {
    Integer selectIdFromRubbish(String rubbishName);
}
