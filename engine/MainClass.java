package engine;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApiContextInitializer.init();

		TelegramBotsApi botsApi = new TelegramBotsApi();

		try {
			botsApi.registerBot(new Niiles_bot());
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
		

	}

}
