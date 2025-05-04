package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		while (true) {
			String hand = scanner.next();
			if (!(hand.equals("r") || hand.equals("s") || hand.equals("p"))) {
				System.out.println("もう一度入力してください");
				continue;
			} else {
				return hand;
			}

		}
	}

	public String getRandom() {
		String[] janken = { "r", "s", "p" };
		int index = (int) Math.floor(Math.random() * 3);
		String hand = janken[index];
		return hand;
	}
	
	public void playGame() {
		HashMap<String, String> jyanken = new HashMap<String, String>();
		jyanken.put("r", "グー");
		jyanken.put("s", "チョキ");
		jyanken.put("p", "パー");
		
		String myChoice = getMyChoice();
		String randomChoice = getRandom();
		
		System.out.println("自分の手は" + jyanken.get(myChoice) + ",対戦相手の手は" + jyanken.get(randomChoice));
		
		if (myChoice.equals(randomChoice)) {
			System.out.println("あいこです");
		} else if ((myChoice.equals("r") && randomChoice.equals("s")) ||
				   (myChoice.equals("s") && randomChoice.equals("p")) ||
				   (myChoice.equals("p") && randomChoice.equals("r"))) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
			
	}
}

