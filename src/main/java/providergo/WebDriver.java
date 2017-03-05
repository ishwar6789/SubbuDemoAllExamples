package providergo;

import com.google.inject.Provider;

public class WebDriver implements Provider<WebTransactions> {

	public WebTransactions get() {
		WebTransactions web = new WebTransactions();
		web.setBrowser("Chrome");
		return web;
	}

}
