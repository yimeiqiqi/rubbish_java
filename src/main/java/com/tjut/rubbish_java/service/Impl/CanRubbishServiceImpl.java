package com.tjut.rubbish_java.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tjut.rubbish_java.domain.CanRubbish;
import com.tjut.rubbish_java.mapper.CanRubbishMapper;
import com.tjut.rubbish_java.service.CanRubbishService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CanRubbishServiceImpl extends ServiceImpl<CanRubbishMapper, CanRubbish> implements CanRubbishService{

    @Resource
    private CanRubbishMapper canRubbishMapper;
    @Override
    public Integer selectIdFromRubbish(String rubbishName) {
        Integer rubbishId = canRubbishMapper.selectIdFromRubbish(rubbishName);
        return rubbishId;
    }
}
