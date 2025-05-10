-keepattributes 'EnclosingMethod'
-keepattributes 'InnerClasses'

-keepclasseswithmembers class org.drinkless.tdlib.TdApi {

    java.lang.String GIT_COMMIT_HASH;
    java.lang.String VERSION;

    <init>(...);

}

-keepclasseswithmembers class org.drinkless.tdlib.TdApi$Object {

    <init>(...);

    getConstructor();

}

-keepclasseswithmembers class org.drinkless.tdlib.TdApi$* extends org.drinkless.tdlib.TdApi$Object {

    <fields>;

}

-keepclasseswithmembers class org.drinkless.tdlib.TdApi$* extends org.drinkless.tdlib.TdApi$Object {

    <init>(...);

}

-keepclasseswithmembers class org.drinkless.tdlib.Client {

    native <methods>;

}

-keepclasseswithmembers class org.drinkless.tdlib.Client$LogMessageHandler {

    onLogMessage(...);

}