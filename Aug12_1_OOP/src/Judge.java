
public class Judge {
	String[] rulebook = new String[] { " ", "����","����","��"};
	
	public void readRulebook() {
		System.out.println("=================");
		for (int i= 1; i < rulebook.length; i++) {
			System.out.printf("%d. %s\n", i, rulebook[i]);
		}
		System.out.println("===============");
	}
	
	//Overloading...!
	public int askAns(Maru m) {
		System.out.printf("���� �� ����? : ");
		int maruAns= m.fire();
		return (maruAns >= 1 && maruAns <=3) ? maruAns : askAns(m);
	}
	
	public int askAns(Brother b) {
		int broAns = b.fire();
		return broAns;
	}

	//���� �� �´���
	public void printHand(int broHand, int maruHand) {
		System.out.printf("����� %s\n",rulebook[maruHand] );
		System.out.printf("������ %s\n",rulebook[broHand] );
	}
	
	// ����
	public boolean judgeWin(int maruHand, int broHand, Maru m) {
		int result = maruHand - broHand;
		if (result == 0) {
			System.out.println("���� !");
			m.draw++;
		} else if(result == -1 || result ==2) {
			System.out.println("������ �̰�� !");
		} else {
			System.out.println("���簡 �̰�� !");
			m.win++;
		}
		return(result == -1 || result ==2);
	}
	public void sayMaryWin(Maru m) {
		System.out.printf("����� %d�� ����, %d���� ������ �����ž� !\n", m.draw, m.win);
	}
	
	
	
	// ����
	public void start(Maru m, Brother b) {
		readRulebook();
		int maruHand ;
		int broHand ;
		printHand(broHand, maruHand);
		while (true) {
			maruHand = askAns(m);
			broHand = askAns(b);
			printHand(broHand, maruHand);
			System.out.println("============");
			if (judgeWin(maruHand, broHand, m)) {
				sayMaryWin(m);
				break;
			}
			System.out.println("===========");
		}
	
	
	
	}
		
		
	}
	
	
	
	
	
	
	
	
	

