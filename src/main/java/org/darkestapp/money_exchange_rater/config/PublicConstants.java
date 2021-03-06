package org.darkestapp.money_exchange_rater.config;

/**
 * Created by Manuel Perez P. (darkpriestrelative@gmail.com) on 16/04/17.
 */
public class PublicConstants {

    private PublicConstants() {
        //Just to avoid public instantiations.
    }

    //int values
    public static final int DEFAULT_READ_TIMEOUT = 5000;

    //String values
    public static final String API_CLASSPATH = "org.darkestapp.money_exchange_rater.api";
    public static final String API_INTERFACE_NAME = "ExchangeRaterApi";
    public static final String DEFAULT_USER_AGENT =
            "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:47.0) Gecko/20100101 Firefox/47.0";
    public static final String MARKET_PRICES_SEPARATOR = "-";
}
