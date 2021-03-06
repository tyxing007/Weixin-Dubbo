package com.cheng.weixin.web.mobile.controller;

import com.cheng.weixin.web.mobile.model.Response;
import com.cheng.weixin.web.mobile.param.RegDto;
import com.cheng.weixin.web.mobile.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Desc: 登录
 * Author: cheng
 * Date: 2016/7/8
 */
@RestController
public class LoginController extends BaseController {
    @Autowired
    private LoginService loginService;
    /** 发送验证码 **/
    @RequestMapping(value = "v1/sendMsgCode")
    public ResponseEntity<Response> sendMsgCode(HttpServletRequest request) {
        RegDto userDto = (RegDto) getDto(request, RegDto.class);
        loginService.sendRegMsgCode(userDto.getPhone());
        return success();
    }
    /** 验证验证码 **/
    @RequestMapping(value = "v1/checkCode")
    public ResponseEntity<Response> checkCode(HttpServletRequest request) {
        RegDto reg = (RegDto) getDto(request, RegDto.class);
        return success(loginService.checkCode(reg.getPhone(), reg.getValidate()));
    }

    /** 保存注册信息 **/
    @RequestMapping(value = "v1/register")
    public ResponseEntity<Response> register(HttpServletRequest request) {
        RegDto reg = (RegDto) getDto(request, RegDto.class);
        loginService.saveAccess(reg);
        return success();
    }
}
