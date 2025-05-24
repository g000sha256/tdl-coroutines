-keepattributes 'EnclosingMethod'
-keepattributes 'InnerClasses'

-keepclasseswithmembers class org.drinkless.tdlib.TdApi {

    java.lang.String GIT_COMMIT_HASH;

    java.lang.String VERSION;

}

-keepclasseswithmembers class org.drinkless.tdlib.TdApi$Object {

    getConstructor();

}

-keep class org.drinkless.tdlib.TdApi$* extends org.drinkless.tdlib.TdApi$Object

-keepclassmembers class org.drinkless.tdlib.TdApi$* extends org.drinkless.tdlib.TdApi$Object {

    <fields>;

}

-keepclassmembers class org.drinkless.tdlib.TdApi$* extends org.drinkless.tdlib.TdApi$Object {

    <init>(...);

}

-keepclasseswithmembers class org.drinkless.tdlib.Client {

    native <methods>;

}

-keepclasseswithmembers class org.drinkless.tdlib.Client$LogMessageHandler {

    onLogMessage(int, java.lang.String);

}
