package org.telegram.telegrambots.facilities;

import org.apache.http.config.Registry;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.telegram.telegrambots.bots.DefaultBotOptions;

/**
 * Created by bvn13 on 17.04.2018.
 */
public class TelegramHttpClientBuilder {

    public static CloseableHttpClient build(DefaultBotOptions options) {
       /*
        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create()
                .setSSLHostnameVerifier(new NoopHostnameVerifier())
                .setConnectionManager(createConnectionManager(options))
                .setConnectionTimeToLive(70, TimeUnit.SECONDS)
                .setMaxConnTotal(100);
        return httpClientBuilder.build();
        */
        return null;
    }

    private static HttpClientConnectionManager createConnectionManager(DefaultBotOptions options) {Registry<ConnectionSocketFactory> registry;
//        switch (options.getProxyType()) {
//            case NO_PROXY:
//                return null;
//            case HTTP:
//                registry = RegistryBuilder.<ConnectionSocketFactory> create()
//                        .register("http", new HttpConnectionSocketFactory())
//                        .register("https", new HttpSSLConnectionSocketFactory(SSLContexts.createSystemDefault())).build();
//                return new PoolingHttpClientConnectionManager(registry);
//            case SOCKS4:
//            case SOCKS5:
//                registry = RegistryBuilder.<ConnectionSocketFactory> create()
//                        .register("http", new SocksConnectionSocketFactory())
//                        .register("https", new SocksSSLConnectionSocketFactory(SSLContexts.createSystemDefault()))
//                        .build();
//                return new PoolingHttpClientConnectionManager(registry);
//        }
        return null;
    }

}
