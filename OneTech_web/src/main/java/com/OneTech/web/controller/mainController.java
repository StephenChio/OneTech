package com.OneTech.web.controller;

import com.OneTech.common.util.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.data.redis.core.RedisTemplate;
import com.OneTech.common.util.massageUtils.MassageUitls;
import com.OneTech.common.controller.CommonController;
import com.OneTech.common.constants.SystemConstants;
import com.OneTech.service.service.UserInfoService;
import com.OneTech.model.model.UserInfoBean;
import com.OneTech.common.vo.StatusBean;

@RestController
@RequestMapping(value = "/")
public class mainController extends CommonController {
    @Autowired
    UserInfoService userInfoService;
    @Autowired
    RedisTemplate<String, String> redisTemplate;
    @Autowired
    MassageUitls massageUitls;

    /**
     * 获取验证码
     */
    @PostMapping("getVerifiCode")
    public StatusBean<?> getVerifiCode() {
        StatusBean<UserInfoBean> statusBean = new StatusBean<>();
        if (massageUitls.sendMassageToSingle(getRequestJson())) {
            statusBean.setRespMsg("发送成功");
            statusBean.setRespCode(SystemConstants.RESPONSE_SUCCESS);
        } else {
            statusBean.setRespMsg("发送失败");
            statusBean.setRespCode(SystemConstants.RESPONSE_FAIL);
        }
        return statusBean;
    }

    /**
     * 用户登录
     *
     * @return
     */
    @PostMapping(value = "login")
    public StatusBean<?> login() {
        return userInfoService.login(getRequestJson());
    }

    /**
     * 查询手机是否被使用
     *
     * @return
     */
    @PostMapping("checkPhoneUsed")
    public StatusBean<?> checkPhoneUsed() {
        StatusBean<?> statusBean = new StatusBean<>();
        try {
            UserInfoBean userInfoBean = new UserInfoBean();
            userInfoBean.setPhone(getRequestJson().getString("phone"));
            userInfoBean = userInfoService.selectOne(userInfoBean);
            if (userInfoBean == null) {
                statusBean.setRespCode(SystemConstants.RESPONSE_SUCCESS);
                statusBean.setRespMsg("该手机未被使用");
            } else {
                statusBean.setRespCode(SystemConstants.RESPONSE_FAIL);
                statusBean.setRespMsg("该手机已被使用");
            }
        } catch (Exception e) {
            e.printStackTrace();
            statusBean.setRespCode(SystemConstants.RESPONSE_FAIL);
            statusBean.setRespMsg("查询!" + e);
        }
        statusBean.setToken(JwtTokenUtil.updateToken(getRequestJson()));
        return statusBean;
    }
}
