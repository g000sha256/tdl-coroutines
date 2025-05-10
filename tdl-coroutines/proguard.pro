-repackageclasses 'dev.g000sha256.tdl.a'

-keepattributes 'EnclosingMethod'
-keepattributes 'InnerClasses'
-keepattributes 'RuntimeVisibleAnnotations'

-keepclasseswithmembers class dev.g000sha256.tdl.TdlClient {

    dev.g000sha256.tdl.TdlClient$Companion Companion;

    java.lang.String TDL_GIT_COMMIT_HASH;

    java.lang.String TDL_VERSION;

    abstract <methods>;

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

-keepclasseswithmembers class dev.g000sha256.tdl.dto.** {

    public <init>(...);

    public <methods>;

}

-assumenosideeffects class kotlin.jvm.internal.Intrinsics {

    check*NotNull*(...);

}