package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.util.Random;

public class FXMLLottoController {
	@FXML
	private Label num0, num1, num2, num3, num4, num5;
	int number[] = new int[6];

	@FXML
	private void handleButtonAction(ActionEvent event) {
		Random rand = new Random();
		
		//random함수 숫자 넣기
		for (int i = 0; i < number.length; i++) {
			number[i] = rand.nextInt(45) + 1;
			
			for (int j = 0; j < i; j++) {
				while (number[i] == number[j]) {
					number[i] = rand.nextInt(45) + 1;
				}
			}
		}
		//차례대로 정렬
		for(int k = 0; k< number.length; k++) {
			for(int l=0; l<number.length-1; l++) {
				if(number[l]>number[l+1]) {
					int temp = 0;
					temp = number[l];
					number[l] = number[l+1];
					number[l+1] = temp;
				}
			}
		}
		numberPrint();
	}

	void numberPrint() {

		num0.setText(String.valueOf(number[0]));
		num1.setText(String.valueOf(number[1]));
		num2.setText(String.valueOf(number[2]));
		num3.setText(String.valueOf(number[3]));
		num4.setText(String.valueOf(number[4]));
		num5.setText(String.valueOf(number[5]));
	}

}
