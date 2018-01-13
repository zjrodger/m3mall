package com.zjrodger.e3mall.common.pojo;

import java.io.Serializable;

/**
 * EasyUI的Tree控件的数据结构
 * @Author: jian.zhang
 * @Date 2018年1月13日
 */
public class EasyUITreeNode implements Serializable {
	
	private long id;
	private String text;
	private String state;
	public long getId() {
		return id;
	}
	public String getText() {
		return text;
	}
	public String getState() {
		return state;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setText(String text) {
		this.text = text;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
