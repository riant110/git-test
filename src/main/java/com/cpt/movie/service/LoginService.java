package com.cpt.movie.service;

import com.cpt.movie.dto.MovieDTO;
import com.cpt.movie.dto.SnapMessageDto;
import com.cpt.movie.pojo.MovieTicke;

import java.util.List;

/**
 * 登录服务层接口
 * Created by cpt72 on 2016/12/11.
 */
public interface LoginService {

    /**
     * 使用电子邮箱登录
     * 如果不存在自动创建用户
     * @param email  电子邮箱
     * @return 用户编号
     */
    int loginByEmail(String email);

}