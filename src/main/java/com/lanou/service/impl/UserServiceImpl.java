package com.lanou.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lanou.entity.SysUser;
import com.lanou.mapper.SysUserMapper;
import com.lanou.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private SysUserMapper sysUserMapper;


	@Override
	public SysUser selectUserByNameAndPwd(String username, String password) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("username", username);
		map.put("password", password);
		SysUser s = sysUserMapper.selectUserByNameAndPwd(map);
		return s;
	}

}
