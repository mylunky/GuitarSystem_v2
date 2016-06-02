package com.guitar.action;

import java.util.List;

import com.guitar.domain.Guitar;
import com.guitar.domain.Inventory;
import com.opensymphony.xwork2.Action;

public class GuitarOperationAction {
	
	Inventory inventory = new Inventory();
	//由于Struts使用属性驱动获取表单属性需要Guitar和guitars，因此做出引用
	private Guitar guitar;
	private List<Guitar> guitars;
	
	//添加吉他方法
	public String addGuitar() {
		int i = inventory.addGuitar(guitar.getSerialNumber(), guitar.getPrice(), guitar.getSpec());
		return i > 0 ? Action.SUCCESS : Action.ERROR;
	}
	//查询吉他方法
	public String searchGuitar() {
		guitars = inventory.searchGuitar("unused");//此处方法可以不传值，也就是查询的时候不用输入查询条件
		return guitars.size() > 0 ? Action.SUCCESS : Action.ERROR;
	}
	//删除吉他方法
	public String delGuitar() {
		int i = inventory.delGuitar(guitar.getSerialNumber());
		return i > 0 ? Action.SUCCESS : Action.ERROR;
	}

	public Inventory getInventory() {
		return inventory;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	public Guitar getGuitar() {
		return guitar;
	}
	public void setGuitar(Guitar guitar) {
		this.guitar = guitar;
	}

	public List<Guitar> getGuitars() {
		return guitars;
	}
	public void setGuitars(List<Guitar> guitars) {
		this.guitars = guitars;
	}
}
