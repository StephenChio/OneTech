package com.OneTech.service.service;

import com.OneTech.common.service.IBaseService;
import com.OneTech.common.vo.FriendListVO;
import com.OneTech.model.model.CommentsBean;
import com.OneTech.model.model.UserInfoBean;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public interface CommentsService extends IBaseService<CommentsBean> {
    void clickLike(JSONObject requestJson) throws Exception;

    List<FriendListVO> selectLike(JSONObject requestJson) throws Exception;
}
