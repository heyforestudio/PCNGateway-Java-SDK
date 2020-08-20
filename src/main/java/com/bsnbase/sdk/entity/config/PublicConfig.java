package com.bsnbase.sdk.entity.config;

import com.bsnbase.sdk.util.enums.AlgorithmTypeEnum;

public class PublicConfig {

    private static final String PubK_SM = "-----BEGIN PUBLIC KEY-----\n" +
            "MFkwEwYHKoZIzj0CAQYIKoEcz1UBgi0DQgAEIlh1C0iWAdcKnM/yAaZZT/42NVzT\n" +
            "Vyr31H9MDhHbPkp+/B3gsp5iZOr6OTAGO9jpN10/YMIrxt2IMg5auIEvMA==\n" +
            "-----END PUBLIC KEY-----\n";

    private static final String PubK_R1 = "-----BEGIN CERTIFICATE-----" +
            "MIIC+zCCAqGgAwIBAgIUARhAfFSyhzcx9q4LdiYKl2UHo1YwCgYIKoZIzj0EAwIw" +
            "TjELMAkGA1UEBhMCQ04xEDAOBgNVBAgTB0JlaWppbmcxDDAKBgNVBAoTA0JTTjEP" +
            "MA0GA1UECxMGY2xpZW50MQ4wDAYDVQQDEwVic25jYTAgFw0xOTA5MjYxMDI0MDBa" +
            "GA8yMDk5MDkwNTAyMDQwMFowgZYxCzAJBgNVBAYTAkNOMREwDwYDVQQIEwhDaGFu" +
            "Z3NoYTEOMAwGA1UEChMFQ21QYXkxPTALBgNVBAsTBHVzZXIwEgYDVQQLEwtob25n" +
            "emFvbm9kZTAOBgNVBAsTB2JzbmJhc2UwCgYDVQQLEwNjb20xJTAjBgNVBAMMHG5v" +
            "ZGVAaG9uZ3phb25vZGUuYnNuYmFzZS5jb20wWTATBgcqhkjOPQIBBggqhkjOPQMB" +
            "BwNCAAQ/X2w5+pJoZXNCO81T4xMR+TxmFoYk6eG1kYML8HBPrUT6QflxtDXYsE9h" +
            "SzVAovq5DHww3vD8Xft/mxwsAXyuo4IBEDCCAQwwDgYDVR0PAQH/BAQDAgeAMAwG" +
            "A1UdEwEB/wQCMAAwHQYDVR0OBBYEFDPVPRqPANJavkNOg/WhPkUkH6wqMB8GA1Ud" +
            "IwQYMBaAFJuwcYba1G07p1ySkpzyes8L79OPMCUGA1UdEQQeMByCGmNhLmhvbmd6" +
            "YW9ub2RlLmJzbmJhc2UuY29tMIGEBggqAwQFBgcIAQR4eyJhdHRycyI6eyJoZi5B" +
            "ZmZpbGlhdGlvbiI6Imhvbmd6YW9ub2RlLmJzbmJhc2UuY29tIiwiaGYuRW5yb2xs" +
            "bWVudElEIjoibm9kZUBob25nemFvbm9kZS5ic25iYXNlLmNvbSIsImhmLlR5cGUi" +
            "OiJ1c2VyIn19MAoGCCqGSM49BAMCA0gAMEUCIQD7FBAQJsgS0uhaL4mjJgILdFfY" +
            "RKXvNutyKz/MqJ54RQIgNS67sSUCbOZRx1rWDqYEcBF1zypEFik25fNgY3zk5gM=" +
            "-----END CERTIFICATE-----";

    private static final String Pubk_K1 = "-----BEGIN PUBLIC KEY-----" +
            "MFYwEAYHKoZIzj0CAQYFK4EEAAoDQgAETXyl2gs9ChpfEIpJqgNj6ob6GrNp5Zax" +
            "TRpgP7zigIEEwAUEQNL8cQoMS+yzPXTFrWlZubE4GFWFoi/Nxk2jdA==" +
            "-----END PUBLIC KEY-----";



    public static String getPublicKey(AlgorithmTypeEnum algorithmTypeEnum) {
        switch (algorithmTypeEnum) {
            case AppAlgorithmType_SM2:
                return PubK_SM;
            case AppAlgorithmType_R1:
                return PubK_R1;
            case AppAlgorithmType_K1:
                return Pubk_K1;
            default:
        }
        return "";
    }
}
