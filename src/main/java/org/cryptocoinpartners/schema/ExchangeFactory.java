package org.cryptocoinpartners.schema;

import org.cryptocoinpartners.enumeration.FeeMethod;

import com.google.inject.assistedinject.Assisted;

public interface ExchangeFactory {

  Exchange create(String symbol);

  Exchange create(String symbol, int margin, @Assisted("makerFeeRate") double makerfeeRate, @Assisted("takerFeeRate") double takerfeeRate,
      FeeMethod feeMethod, boolean fillsProvided);

  Exchange create(String symbol, int margin, @Assisted("makerFeeRate") double makerfeeRate, @Assisted("takerFeeRate") double takerfeeRate,
      @Assisted("feeMethod") FeeMethod feeMethod, @Assisted("marginFeeRate") double marginFeeRate,
      @Assisted("marginFeeMethod") FeeMethod marginFeeMethod, boolean fillsProvided);

}