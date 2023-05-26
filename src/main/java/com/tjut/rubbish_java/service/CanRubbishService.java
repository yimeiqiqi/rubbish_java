package com.tjut.rubbish_java.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tjut.rubbish_java.domain.CanRubbish;

public interface CanRubbishService extends IService<CanRubbish> {
    Integer selectIdFromRubbish(String rubbishName);
}
