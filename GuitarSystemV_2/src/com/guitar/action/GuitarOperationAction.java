package com.guitar.action;

import java.util.List;

import com.guitar.domain.Guitar;
import com.guitar.domain.Inventory;
import com.opensymphony.xwork2.Action;

public class GuitarOperationAction {
	
	Inventory inventory = new Inventory();
	//����Strutsʹ������������ȡ��������ҪGuitar��guitars�������������
	private Guitar guitar;
	private List<Guitar> guitars;
	
	//��Ӽ�������
	public String addGuitar() {
		int i = inventory.addGuitar(guitar.getSerialNumber(), guitar.getPrice(), guitar.getSpec());
		return i > 0 ? Action.SUCCESS : Action.ERROR;
	}
	//��ѯ��������
	public String searchGuitar() {
		guitars = inventory.searchGuitar("unused");//�˴��������Բ���ֵ��Ҳ���ǲ�ѯ��ʱ���������ѯ����
		return guitars.size() > 0 ? Action.SUCCESS : Action.ERROR;
	}
	//ɾ����������
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
