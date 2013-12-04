package cn.niot.controller;

import com.opensymphony.xwork2.ActionSupport;

import cn.niot.dao.*;
import cn.niot.rule.RuleFunction;

public class RecoAction extends ActionSupport {
	/**
	 * @return
	 */
	private String iotID;
	
	
	public String getIotID() {
		return iotID;
	}

	public void setIotID(String iotID) {
		this.iotID = iotID;
	}
	
	private String Msg;    // 添加一个变量


	public String getMsg() {    // 添加getter
	return Msg;
	}
	public String execute() {
		if (iotID.equals("123456")){
			Msg = "                   "+ iotID + " is ID type A";     // 逻辑运算
		} else{
			Msg = "                   "+ iotID + " is not ID type A";     // 逻辑运算
		}
		
//		RecoDao recodao = RecoDao.getRecoDao();
//		recodao.getAdminDivisionID("110114");
		
		char [] IDstr = new char[5];
		IDstr[0] = 'A';
		IDstr[1] = '0';
		IDstr[2] = '0';
		IDstr[3] = '2';
		IDstr[4] = '0';
		int [] index = new int[4];
		index[0] = 1;
		index[1] = 2;
		index[2] = 3;
		index[3] = 4;
		System.out.println(RuleFunction.CountryRegionCodeforCPC(IDstr, 4, index, 4));
		
		return "sucess"; //预定义常量
	} 

}