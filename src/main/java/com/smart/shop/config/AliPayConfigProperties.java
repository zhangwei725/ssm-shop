package com.smart.shop.config;

public class AliPayConfigProperties {
//    public static final String APP_ID = "appId";
//    public static final String PRIVARY_KEY = "privateKey";
//    public static final String PUBLIC_KEY = "publicKey";
//    public static final String NOTIFY_URL = "notifyUrl";
//    public static final String RETURN_URL = "returnUrl";
//    public static final String SIGN_TYPE = "signType";
//    public static final String CHARSET = "charset";
//    public static final String GATEWAY_URL = "gatewayUrl";
//    public static final String LOG_PATH = "logPath";


    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号,开发时使用沙箱提供的APPID，生产环境改成自己的APPID
    public static String APP_ID = "2016072900120438";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String APP_PRIVATE_KEY = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCCWTUgamANOLrOfIeG9Wyhq2htjlPLddISQAMu4KWEcUIFxOhK5ipUyOFxw2g8ruQk+Bai1UoHpA2QJrgTDBNUUhUkRFAn1dilhqcbCdukj8nF5hWFdxvk+A61+DxdGDyrV6Psfx/421kjt56qj1YqydLtKTRi306zsTLZjdaiCl6tz3pOM3juwglvN8mw9ungicbPngyDelGswGJwBxTpVNXuMDLcgoudlhCARbbRgY5F3m6QAMuXFuS5dRhPlA1CYe40zLGWxPiMlzIo+D9VJ0JZFFovkNGvjyRruoC4Nye8rB6ULXpWDTkjY1r05oP0qdNEM0ohsEBidh0pM5QzAgMBAAECggEAT+7emmNBRbpdLBTHk2ZbWIThhBV8o088JH7mtM+EEMTXZOxMOuoMWXPadEYNXPEu7NDKKM69GBRtUNG9nciQ7etsFZJiyRrlQRRi0zznWXHnnRksZ20USQQpGUQB2GDti3EyD+whMh1o+3M1tIgzogej9lWHT357J8xpT2ogjbsIKctfg3hhFzIavGLlio8fUjf99go9n59BpdkhPB4VN4LFh0iXxo0p5tlM2Xq38nwQRJPkC/Xg9W9yvXPfwX2iX0zu97S/UZJm+smthyCdsrVZR3ZGrINDGCSmSiAH3ijI26khzCXWYN0y5WqPSAhxCD9HOFRPeE4ObgZG8bWn0QKBgQC4IKB0uX6gPC3utlpI8UgkKCI9XWN0tVukDEoPg+glZd/8dKOXxAzinSEM4nH9bgDEkQIuDHpJR+loz6D+nqbopL4vHfxstexk3IfNu5wONJPglU4H3xtmvgCX9VnL0dMv3//uLnS5lzJpekrhifsX6swrFvUrHvc6BtMRj7vDewKBgQC1OpaOZQdE+dMcCZ5sGDn7H5hI3I90eODp991zvQ7X1THyOLWQXiJM/QxDVGXG5eA0SjvKShHDEE996GXSwosCWjzdTCgsbbfZ6IgPzEOuf2KRxQAj6TCyBDC/xf49oPKy0NgBM3JF4N3H9JUY07myujIMfhElADQKxZOcegQYqQKBgCV5Lm7TGbxOwyJkJnfV81K4gE9w5D7qch4vChuiQurpku50Zp8KnXy5cfKHW5+ydaGLyZ/JllG3uv9D0oY/j8SlUreQKMGPPO9CGrl6R0Z02OvKNzlO5OrCHKjQnFfo+kwyEIpPFh53cSEabIb+aAX0GV1jrL377WD35pkaYaJlAoGAeGPDQDS874VGSInbQ9OUMM58S2q5oZXrU4HlCs283oQx+cbSVmUyRBKV4uRd+BMdLZ9iuK8bvYlIRUvs2GWEErv/UsMUrO72AzwFpvj6vSDCSjOkNDbksl02RS8yBZ61mzRBSgrzDpiivAIuSZ/c7G3kcYgNu5a2+7Dkrj4gGoECgYBlrVYafhyNzsc9tsf5W/0fKX+CCDG07mD16j8gpssi6YglzgegixL/66htNqIfzwPd4W9YFMkxpFZWKRjz2hirSeR/CFOPh9E4bxEiaYReOxrwTBvgA6RlaBislb4hgtnxOhzOIZrE5cnA8v0TDKtgI418HL8c0/N85ig+kxZFxA==";

    // 支付宝公钥,查看地址：对应APPID下的支付宝公钥。
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxigwxX2h/SYIttlcslO585rqM0ZuqF+9DJUWRS+P7NevCK+oOhm69/iSk/f/K7Mtna0VudlDBIqd1kJ57236Ln4+hoH9SquwoLzIkpt8oYJQ4pJ0J7fFhUdvvnAfpcbkOJnlBWUjD6oJGXkkI3aBzXWlTSuays8+nNIPavvnadjz9ynleBKHWb7/Bw4s2Zm4UT5xLwYPPf2vX8WSkv10PS2SzW2HxuKb8l++eiVmkb91rVzQ9TAtRHRA/q+5zCQHvhKW5HNKJTLayvKxxxIgvAPHsog+6ViIWbmEX1G4rby8E7MPawUlGozmEGoXlSzrUuuVZH97CPOeMAJvRjYnVQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String NOTIFY_URL = "http://localhost:8080/alipay/notify_url.html";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问(其实就是支付成功后返回的回调接口)
    public static String RETURN_URL = "http://localhost:8080/api/pay/ali/callback";

    // 签名方式
    public static String SIGN_TYPE = "RSA2";

    // 字符编码格式
    public static String CHARSET = "utf-8";
    public static String FORMAT = "json";

    // 支付宝网关，这是沙箱的网关
    public static String GATEWAY_URL = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝日志保存路径 .测试保存在d盘
    public static String LOG_PATH = "/Users/zhangwei/Documents/pay";
    // 支付宝app支付
    public static String PRODUCT_CODE = "FAST_INSTANT_TRADE_PAY";

}
