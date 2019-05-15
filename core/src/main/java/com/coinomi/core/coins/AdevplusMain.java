package com.coinomi.core.coins;

import com.coinomi.core.coins.families.BitFamily;

/**
 * @author main@m42.cx
 */
public class AdevplusMain extends BitFamily {
    private AdevplusMain() {
        id = "adevplus.main"; // Do not change this id as wallets serialize this string



        addressHeader = 23;
        p2shHeader = 24;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 151;

        name = "Adevplus";
        symbol = "ADV2";
        uriScheme = "adevplus";
        bip44Index = 0;
        unitExponent = 8;
        feeValue = value(10000);
        minNonDust = value(1000); // 0.00001 DASH mininput
        softDustLimit = value(5000); // 0.001 DASH
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
        signedMessageHeader = toBytes("Adevplus Signed Message:\n");

    }

    private static AdevplusMain instance = new AdevplusMain();
    public static synchronized CoinType get() {
        return instance;
    }
}
