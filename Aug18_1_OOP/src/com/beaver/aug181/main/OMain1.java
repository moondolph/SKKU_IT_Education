package com.beaver.aug181.main;

import com.beaver.aug181.human.Human;
import com.beaver.aug181.ironman.Ironman;
import com.beaver.aug181.planet.Planet;

public class OMain1 {
	public static void main(String[] args) {
		// ���� ���� ��.. 
		
		// �༺ (�̸�, ũ��, ���̴��� �Ⱥ��̴���) ��ü ���� 
		
		// ��� (�̸�) ��ü ����
		
		// �̸��� ������ �༺ ���� (�༺ �̸�)
		Planet p = new Planet("����");
		
		// �̸��� ???�� ��� ���� (��� �̸�)
		Human h = new Human("����");
		
		//�� �༺�� ����� ����
		p.add(h);
		
		//��� : interface
		//interface�� �λ�� �����
		//attack();�� �ݵ�� �����ϰ�!!
		//���̾�� - attack()�� �ݵ�� �ʿ�!
		//���̾�� ��ü - attack��� ����
		
		Ironman i = new Ironman();
		
		//�� ����� ���̾���� �ڱ� ���㿵������ ��!
		h.pick(i);
		
		//�� ����� ���ʹ޶�� �Ҹ�ħ !
		h.helpAaaaaa();
		
		//�� �༺����� 1000���� ����
		p.setSize(1000);
		
		//�� �༺�� ���̰� ����
		p.setVisible(true);
		
		
		
		
		
	}
}
