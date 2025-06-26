-keepattributes 'EnclosingMethod'
-keepattributes 'InnerClasses'

-keepclasseswithmembers class org.drinkless.tdlib.JsonClient {

    native <methods>;

}

-keepclasseswithmembers class org.drinkless.tdlib.JsonClient$LogMessageHandler {

    onLogMessage(int, java.lang.String);

}
