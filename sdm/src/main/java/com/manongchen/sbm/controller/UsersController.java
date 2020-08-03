package com.manongchen.sbm.controller;

import com.manongchen.sbm.entity.Users;
import com.manongchen.sbm.service.UsersService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * users(Users)表控制层
 *
 * @author xingchen
 * @since 2020-07-31 13:37:58
 */
@RestController
@RequestMapping("users")
public class UsersController {
    /**
     * 服务对象
     */
    @Resource
    private UsersService usersService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne/{id}")
    public Users selectOne(@PathVariable Integer id) {
        return this.usersService.queryById(id);
    }

}