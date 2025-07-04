package com.poetry.service;

import com.poetry.entity.WebInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.poetry.vo.WebInfoVO;

/**
 * @author system
 * @since 2025-06-29 11:49:33
 */
public interface WebInfoService extends IService<WebInfo> {

  WebInfoVO getWebInfo();
}