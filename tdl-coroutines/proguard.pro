-repackageclasses 'dev.g000sha256.tdl.a'

-keepattributes 'EnclosingMethod'
-keepattributes 'InnerClasses'
-keepattributes 'RuntimeVisibleAnnotations'

-keepclasseswithmembers class dev.g000sha256.tdl.TdlClient {

    dev.g000sha256.tdl.TdlClient$Companion Companion;

    java.lang.String TDL_GIT_COMMIT_HASH;

    java.lang.String TDL_VERSION;

    <methods>;

}

-keepclasseswithmembers class dev.g000sha256.tdl.TdlClient$Companion {

    create();

}

-keep class dev.g000sha256.tdl.TdlResult

-keepclasseswithmembers class dev.g000sha256.tdl.TdlResult$Failure {

    getCode();

    getMessage();

}

-keepclasseswithmembers class dev.g000sha256.tdl.TdlResult$Success {

    getResult();

}

-keep class dev.g000sha256.tdl.dto.**

-keepclassmembers class dev.g000sha256.tdl.dto.** {

    <init>(...);

}

-keepclassmembers class dev.g000sha256.tdl.dto.** {

    <methods>;

}

-assumenosideeffects class kotlin.jvm.internal.Intrinsics {

    check*NotNull*(...);

}