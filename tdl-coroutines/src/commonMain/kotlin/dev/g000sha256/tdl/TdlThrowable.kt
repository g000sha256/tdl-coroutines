package dev.g000sha256.tdl

/**
 * Exception type representing an error response from TDLib, intended for use with [Result].
 *
 * @property code The error code.
 * @property message A human-readable error message.
 *
 * @see TdlResult
 * @see toResult
 */
public class TdlThrowable internal constructor(
    public val code: Int,
    override val message: String,
) : Throwable(message = message)
