
public class Judge {
	String[] rulebook = new String[] { " ", "가위","바위","보"};
	
	public void readRulebook() {
		System.out.println("=================");
		for (int i= 1; i < rulebook.length; i++) {
			System.out.printf("%d. %s\n", i, rulebook[i]);
		}
		System.out.println("===============");
	}
	
	//Overloading...!
	public int askAns(Maru m) {
		System.out.printf("마루 뭐 낼래? : ");
		int maruAns= m.fire();
		return (maruAns >= 1 && maruAns <=3) ? maruAns : askAns(m);
	}
	
	public int askAns(Brother b) {
		int broAns = b.fire();
		return broAns;
	}

	//누가 뭐 냈는지
	public void printHand(int broHand, int maruHand) {
		System.out.printf("마루는 %s\n",rulebook[maruHand] );
		System.out.printf("동생은 %s\n",rulebook[broHand] );
	}
	
	// 판정
	public boolean judgeWin(int maruHand, int broHand, Maru m) {
		int result = maruHand - broHand;
		if (result == 0) {
			System.out.println("비겼다 !");
			m.draw++;
		} else if(result == -1 || result ==2) {
			System.out.println("동생이 이겼다 !");
		} else {
			System.out.println("마루가 이겼다 !");
			m.win++;
		}
		return(result == -1 || result ==2);
	}
	public void sayMaryWin(Maru m) {
		System.out.printf("마루는 %d번 비겼고, %d개의 간식을 얻을거야 !\n", m.draw, m.win);
	}
	
	
	
	// 시작
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
	
	
	
	
	
	
	
	
	

