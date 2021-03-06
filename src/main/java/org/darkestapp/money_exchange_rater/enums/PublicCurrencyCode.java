package org.darkestapp.money_exchange_rater.enums;

import org.darkestapp.money_exchange_rater.interfaces.CurrencyData;

/**
 * Created by Manuel Perez P. (darkpriestrelative@gmail.com) on 15/04/17.
 */
public enum PublicCurrencyCode implements CurrencyData {

    ARS  ("ARS", "Peso Argentino"),
    BTC  ("BTC", "Bitcoin"),
    DOGE ("DOGE", "DogeCoin"),
    ETH  ("ETH", "Ethereum"),
    IOP  ("IOP", "Internet of People"),
    LTC  ("LTC", "Litecoin"),
    USD  ("USD", "American Dollar"),
    USDT ("USDT", "American Dollar");

    private String friendlyName;
    private String code;

    PublicCurrencyCode(String code, String friendlyName) {

        this.code = code;
        this.friendlyName = friendlyName;
    }

    public String getFriendlyName() {
        return this.friendlyName;
    }

    public String getCode() {
        return code;
    }

    public String getLowerCaseCode () {
        return this.getCode().toLowerCase();
    }
}