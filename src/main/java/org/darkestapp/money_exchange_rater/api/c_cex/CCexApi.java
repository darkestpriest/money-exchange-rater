package org.darkestapp.money_exchange_rater.api.c_cex;

import org.darkestapp.money_exchange_rater.interfaces.annotations.Api;
import org.darkestapp.money_exchange_rater.api.c_cex.enums.CCexCurrencyCode;
import org.darkestapp.money_exchange_rater.api.c_cex.exceptions.CCexApiException;
import org.darkestapp.money_exchange_rater.api.c_cex.processors.CCexObject;
import org.darkestapp.money_exchange_rater.api.c_cex.processors.JsonCCexParser;
import org.darkestapp.money_exchange_rater.api.c_cex.util.CCexCurrencyPair;
import org.darkestapp.money_exchange_rater.interfaces.*;

/**
 * Created by Manuel Perez P. (darkpriestrelative@gmail.com) on 17/04/17.
 */
@Api(enabled = true)
public class CCexApi extends AbstractExchangeRaterApi<CCexObject>
        implements ExchangeRaterApi<CCexObject> {

    private static final String CONTEXT = CCexApi.class.getSimpleName();
    private static final String API_SHORT_NAME = "CCEX";
    private static final String API_FRIENDLY_NAME = "C-Cex";

    public CCexApi() {
        super(CCexApi.class, CCexCurrencyCode.class);
    }

    @Override
    public CCexObject getApiObject(final CurrencyPair currencyPair)
            throws MoneyExchangeRaterException {

        try {
            JsonCCexParser parser = new JsonCCexParser(CCexApi.class);
            return parser.getApiObject(new CCexCurrencyPair(currencyPair));
        } catch (MoneyExchangeRaterException e) {
            throw new CCexApiException(
                    e,
                    CONTEXT,
                    "An exception has occurred getting the exchange rate from public API");
        } catch (Exception e) {
            throw new CCexApiException(
                    e,
                    CONTEXT,
                    "A generic exception has occurred getting the exchange rate from public API");
        }
    }

    @Override
    public ApiId getApiId() {

        return new ApiId(API_SHORT_NAME, API_FRIENDLY_NAME);
    }
}
