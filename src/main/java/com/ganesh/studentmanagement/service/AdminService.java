package com.ganesh.studentmanagement.service;

import com.ganesh.studentmanagement.dao.AdminDao;
import com.ganesh.studentmanagement.entity.Admin;

public class AdminService {
	public Admin Adminlogin(Admin admin)
	{
		AdminDao ad=new AdminDao();
		Admin adminresult=ad.AdminLogin(admin);
		if(adminresult != null)
		{
			return adminresult;
		}
		else
		{
			return null;
		}
	}

}
