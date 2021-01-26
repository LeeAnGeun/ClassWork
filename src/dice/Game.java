package dice;

import java.util.Scanner;

public class Game {
	int coin = 20;
	int r_sum=0;
	int u_sum=0;
	boolean re_game = true;
	
	// 컴퓨터의 random 주사위의 합
	void randomNumberSum() {
		int num1 = (int)(Math.random()*6)+1;
		int num2 = (int)(Math.random()*6)+1;
		
		r_sum = num1+num2;
		System.out.println("두 주사위의 합은? " + r_sum);
	}
	
	// user가 예측한 주사위의 합
	void myInputSum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("내가 예측한 두 주사위의 합은? ");
		u_sum = sc.nextInt();
	}
	
	// 비교
	public void game() {
		Scanner sc = new Scanner(System.in);
		

		while(re_game) {
			randomNumberSum();  // 주사위의 합
			int h_coin; // 배팅할 코인
			
		
			while(true) {
				System.out.print("배팅할 코인 수는? ");
				h_coin = sc.nextInt();  // 배팅 할 코인의 갯수
				if(h_coin > coin){ // 현재코인보다 배팅할 코인이 많을시 다시 입력
					System.out.println("현재 코인보다 많습니다. 다시 배팅하세요");
				}else break;
			}
			myInputSum(); // 내가 예측한 주사위의 합
			
			if(r_sum == u_sum) {
				if(r_sum==2 || r_sum==12) { // 2 또는 12를 제시 할수 없다
					System.out.println("2와 12는 제시할 수 없습니다");
					continue;
				}
				else if(r_sum==3 || r_sum==11) { // 3 또는 11을 맞출 시 18배
					coin += (h_coin * 18);
					System.out.println("축하합니다!! 18배입니다!!");
					System.out.println("형재남은 코인 수 : " + coin);
				}
				else if(r_sum==4 || r_sum==10) { // 4 또는 10을 맞출 시 10배
					coin += (h_coin * 12);
					System.out.println("축하합니다!! 12배입니다!!");
					System.out.println("형재남은 코인 수 : " + coin);
				}
				else if(r_sum==5 || r_sum==9) { // 5ㄸ 또는 9를 맞출 시 9배
					coin += (h_coin * 9);
					System.out.println("축하합니다!! 9배입니다!!");
					System.out.println("형재남은 코인 수 : " + coin);
				}
				else if(r_sum==6 || r_sum==8) { // 6 또는 8을 맞출 시 7 배
					coin += (h_coin * 7);
					System.out.println("축하합니다!! 7배입니다!!");
					System.out.println("형재남은 코인 수 : " + coin);
				}
				else if(r_sum==7) { // 7을 맞출 시 6배
					coin += (h_coin * 6);
					System.out.println("축하합니다!! 6배입니다!!");
					System.out.println("형재남은 코인 수 : " + coin);
				}
			}else { // 못 맞췃을 경우
				coin -= h_coin;		
				System.out.println("정답이 틀렸습니다... 현재 남은 코인의 갯수는 : " + coin + "입니다.");
			}
			
			if( coin == 0) { // 코인을 다썻을 경우
				break;
			}else { // 코인이 남았을 경우
				reStart(); // 다시 도전?을 묻는 메소드
				
			}
		}
	}
	
	// 다시 도전??
	void reStart() {
		Scanner sc = new Scanner(System.in);
		
		while(true) { // 잘못 입력했을 때를 대비
			System.out.print("게임을 계속 하시겠습니까? Yes(true)/No(false) : ");
			re_game = sc.nextBoolean();
			if(re_game == true || re_game == false) break;
			else continue;
		}
	}
	
	// 결과 출력
	public void resultPrint() {
		if(coin < 0) {
			System.out.println("모든 코인을 소진 하셨습니다...");
		}
		else {
			System.out.println("획득하신 coin 은 " + coin + "입니다.");
		}
	}
}
