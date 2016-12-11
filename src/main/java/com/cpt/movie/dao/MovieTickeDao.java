package com.cpt.movie.dao;

import com.cpt.movie.pojo.MovieTicke;

/**
 * 电影票表持久层
 * Created by cpt72 on 2016/12/11.
 */
public interface MovieTickeDao {

    /**
     * 插入电影票
     * @param movieTicke 电影票对象
     * @return 电影票编号
     */
    int insert(MovieTicke movieTicke);

    /**
     * 更新电影票
     * @param movieTicke 电影票对象
     * @return 更新状态
     */
    boolean update(MovieTicke movieTicke);

    /**
     * 根据编号选择电影票
     * @param id 电影票编号
     * @return 电影票对象
     */
    MovieTicke selectById(int id);

}