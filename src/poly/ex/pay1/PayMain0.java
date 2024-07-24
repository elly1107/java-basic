package poly.ex.pay1;

import java.util.Arrays;
import java.util.Scanner;

public class PayMain0 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("결제 수단을 입력하세요: ");
            String payOption=sc.nextLine();

            if (payOption.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }

            System.out.print("결제 금액을 입력하세요: ");
            int amount = sc.nextInt();
            sc.nextLine(); //\n이 남는다.
            payService.processPay(payOption, amount);
        }
    }
}