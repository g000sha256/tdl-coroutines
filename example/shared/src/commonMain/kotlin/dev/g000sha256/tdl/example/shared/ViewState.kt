package dev.g000sha256.tdl.example.shared

public sealed class ViewState {

    public data object Loading : ViewState()

    public data class Content public constructor(
        public val status: String,
        public val showInput: Boolean,
        public val showButton: Boolean,
        public val error: String?,
    ) : ViewState()

}
