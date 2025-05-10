package org.drinkless.tdlib

import kotlin.Array
import kotlin.Boolean
import kotlin.ByteArray
import kotlin.Double
import kotlin.Int
import kotlin.IntArray
import kotlin.Long
import kotlin.LongArray
import kotlin.String
import kotlin.jvm.JvmField

internal class TdApi private constructor() {
    public companion object {
        public const val GIT_COMMIT_HASH: String = "b8b08b02dbbc0c05e7129e2f306c636c5b8ec04f"

        public const val VERSION: String = "1.8.48"
    }

    public abstract class Object() {
        external override fun toString(): String

        public abstract fun getConstructor(): Int
    }

    public abstract class Function<T : Object>() : Object()

    public class AccentColor(
        @JvmField
        public val id: Int,
        @JvmField
        public val builtInAccentColorId: Int,
        @JvmField
        public val lightThemeColors: IntArray,
        @JvmField
        public val darkThemeColors: IntArray,
        @JvmField
        public val minChannelChatBoostLevel: Int,
    ) : Object() {
        override fun getConstructor(): Int = -496_870_680
    }

    public class AcceptedGiftTypes(
        @JvmField
        public val unlimitedGifts: Boolean,
        @JvmField
        public val limitedGifts: Boolean,
        @JvmField
        public val upgradedGifts: Boolean,
        @JvmField
        public val premiumSubscription: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_783_521_300
    }

    public class AccountInfo(
        @JvmField
        public val registrationMonth: Int,
        @JvmField
        public val registrationYear: Int,
        @JvmField
        public val phoneNumberCountryCode: String,
        @JvmField
        public val lastNameChangeDate: Int,
        @JvmField
        public val lastPhotoChangeDate: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_803_492_711
    }

    public class AccountTtl(
        @JvmField
        public val days: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_324_495_492
    }

    public class AddedReaction(
        @JvmField
        public val type: ReactionType,
        @JvmField
        public val senderId: MessageSender,
        @JvmField
        public val isOutgoing: Boolean,
        @JvmField
        public val date: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_258_586_525
    }

    public class AddedReactions(
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val reactions: Array<AddedReaction>,
        @JvmField
        public val nextOffset: String,
    ) : Object() {
        override fun getConstructor(): Int = 226_352_304
    }

    public class Address(
        @JvmField
        public val countryCode: String,
        @JvmField
        public val state: String,
        @JvmField
        public val city: String,
        @JvmField
        public val streetLine1: String,
        @JvmField
        public val streetLine2: String,
        @JvmField
        public val postalCode: String,
    ) : Object() {
        override fun getConstructor(): Int = -2_043_654_342
    }

    public class AffiliateInfo(
        @JvmField
        public val commissionPerMille: Int,
        @JvmField
        public val affiliateChatId: Long,
        @JvmField
        public val starAmount: StarAmount,
    ) : Object() {
        override fun getConstructor(): Int = -1_312_695_046
    }

    public class AffiliateProgramInfo(
        @JvmField
        public val parameters: AffiliateProgramParameters,
        @JvmField
        public val endDate: Int,
        @JvmField
        public val dailyRevenuePerUserAmount: StarAmount,
    ) : Object() {
        override fun getConstructor(): Int = -1_761_810_251
    }

    public class AffiliateProgramParameters(
        @JvmField
        public val commissionPerMille: Int,
        @JvmField
        public val monthCount: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_642_662_996
    }

    public abstract class AffiliateProgramSortOrder() : Object()

    public class AffiliateProgramSortOrderProfitability() : AffiliateProgramSortOrder() {
        override fun getConstructor(): Int = -1_963_282_585
    }

    public class AffiliateProgramSortOrderCreationDate() : AffiliateProgramSortOrder() {
        override fun getConstructor(): Int = -1_558_628_083
    }

    public class AffiliateProgramSortOrderRevenue() : AffiliateProgramSortOrder() {
        override fun getConstructor(): Int = 1_923_269_304
    }

    public abstract class AffiliateType() : Object()

    public class AffiliateTypeCurrentUser() : AffiliateType() {
        override fun getConstructor(): Int = 1_453_785_589
    }

    public class AffiliateTypeBot(
        @JvmField
        public val userId: Long,
    ) : AffiliateType() {
        override fun getConstructor(): Int = -1_032_587_200
    }

    public class AffiliateTypeChannel(
        @JvmField
        public val chatId: Long,
    ) : AffiliateType() {
        override fun getConstructor(): Int = -683_939_735
    }

    public class AlternativeVideo(
        @JvmField
        public val id: Long,
        @JvmField
        public val width: Int,
        @JvmField
        public val height: Int,
        @JvmField
        public val codec: String,
        @JvmField
        public val hlsFile: File,
        @JvmField
        public val video: File,
    ) : Object() {
        override fun getConstructor(): Int = 483_379_470
    }

    public class AnimatedChatPhoto(
        @JvmField
        public val length: Int,
        @JvmField
        public val file: File,
        @JvmField
        public val mainFrameTimestamp: Double,
    ) : Object() {
        override fun getConstructor(): Int = 191_994_926
    }

    public class AnimatedEmoji(
        @JvmField
        public val sticker: Sticker?,
        @JvmField
        public val stickerWidth: Int,
        @JvmField
        public val stickerHeight: Int,
        @JvmField
        public val fitzpatrickType: Int,
        @JvmField
        public val sound: File?,
    ) : Object() {
        override fun getConstructor(): Int = 1_378_918_079
    }

    public class Animation(
        @JvmField
        public val duration: Int,
        @JvmField
        public val width: Int,
        @JvmField
        public val height: Int,
        @JvmField
        public val fileName: String,
        @JvmField
        public val mimeType: String,
        @JvmField
        public val hasStickers: Boolean,
        @JvmField
        public val minithumbnail: Minithumbnail?,
        @JvmField
        public val thumbnail: Thumbnail?,
        @JvmField
        public val animation: File,
    ) : Object() {
        override fun getConstructor(): Int = -872_359_106
    }

    public class Animations(
        @JvmField
        public val animations: Array<Animation>,
    ) : Object() {
        override fun getConstructor(): Int = 344_216_945
    }

    public class ArchiveChatListSettings(
        @JvmField
        public val archiveAndMuteNewChatsFromUnknownUsers: Boolean,
        @JvmField
        public val keepUnmutedChatsArchived: Boolean,
        @JvmField
        public val keepChatsFromFoldersArchived: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_058_499_236
    }

    public class AttachmentMenuBot(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val supportsSelfChat: Boolean,
        @JvmField
        public val supportsUserChats: Boolean,
        @JvmField
        public val supportsBotChats: Boolean,
        @JvmField
        public val supportsGroupChats: Boolean,
        @JvmField
        public val supportsChannelChats: Boolean,
        @JvmField
        public val requestWriteAccess: Boolean,
        @JvmField
        public val isAdded: Boolean,
        @JvmField
        public val showInAttachmentMenu: Boolean,
        @JvmField
        public val showInSideMenu: Boolean,
        @JvmField
        public val showDisclaimerInSideMenu: Boolean,
        @JvmField
        public val name: String,
        @JvmField
        public val nameColor: AttachmentMenuBotColor?,
        @JvmField
        public val defaultIcon: File?,
        @JvmField
        public val iosStaticIcon: File?,
        @JvmField
        public val iosAnimatedIcon: File?,
        @JvmField
        public val iosSideMenuIcon: File?,
        @JvmField
        public val androidIcon: File?,
        @JvmField
        public val androidSideMenuIcon: File?,
        @JvmField
        public val macosIcon: File?,
        @JvmField
        public val macosSideMenuIcon: File?,
        @JvmField
        public val iconColor: AttachmentMenuBotColor?,
        @JvmField
        public val webAppPlaceholder: File?,
    ) : Object() {
        override fun getConstructor(): Int = -1_183_966_273
    }

    public class AttachmentMenuBotColor(
        @JvmField
        public val lightColor: Int,
        @JvmField
        public val darkColor: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_680_039_612
    }

    public class Audio(
        @JvmField
        public val duration: Int,
        @JvmField
        public val title: String,
        @JvmField
        public val performer: String,
        @JvmField
        public val fileName: String,
        @JvmField
        public val mimeType: String,
        @JvmField
        public val albumCoverMinithumbnail: Minithumbnail?,
        @JvmField
        public val albumCoverThumbnail: Thumbnail?,
        @JvmField
        public val externalAlbumCovers: Array<Thumbnail>,
        @JvmField
        public val audio: File,
    ) : Object() {
        override fun getConstructor(): Int = -166_398_841
    }

    public class AuthenticationCodeInfo(
        @JvmField
        public val phoneNumber: String,
        @JvmField
        public val type: AuthenticationCodeType,
        @JvmField
        public val nextType: AuthenticationCodeType?,
        @JvmField
        public val timeout: Int,
    ) : Object() {
        override fun getConstructor(): Int = -860_345_416
    }

    public abstract class AuthenticationCodeType() : Object()

    public class AuthenticationCodeTypeTelegramMessage(
        @JvmField
        public val length: Int,
    ) : AuthenticationCodeType() {
        override fun getConstructor(): Int = 2_079_628_074
    }

    public class AuthenticationCodeTypeSms(
        @JvmField
        public val length: Int,
    ) : AuthenticationCodeType() {
        override fun getConstructor(): Int = 962_650_760
    }

    public class AuthenticationCodeTypeSmsWord(
        @JvmField
        public val firstLetter: String,
    ) : AuthenticationCodeType() {
        override fun getConstructor(): Int = -1_509_540_765
    }

    public class AuthenticationCodeTypeSmsPhrase(
        @JvmField
        public val firstWord: String,
    ) : AuthenticationCodeType() {
        override fun getConstructor(): Int = 784_108_753
    }

    public class AuthenticationCodeTypeCall(
        @JvmField
        public val length: Int,
    ) : AuthenticationCodeType() {
        override fun getConstructor(): Int = 1_636_265_063
    }

    public class AuthenticationCodeTypeFlashCall(
        @JvmField
        public val pattern: String,
    ) : AuthenticationCodeType() {
        override fun getConstructor(): Int = 1_395_882_402
    }

    public class AuthenticationCodeTypeMissedCall(
        @JvmField
        public val phoneNumberPrefix: String,
        @JvmField
        public val length: Int,
    ) : AuthenticationCodeType() {
        override fun getConstructor(): Int = 700_123_783
    }

    public class AuthenticationCodeTypeFragment(
        @JvmField
        public val url: String,
        @JvmField
        public val length: Int,
    ) : AuthenticationCodeType() {
        override fun getConstructor(): Int = -2_129_693_491
    }

    public class AuthenticationCodeTypeFirebaseAndroid(
        @JvmField
        public val deviceVerificationParameters: FirebaseDeviceVerificationParameters,
        @JvmField
        public val length: Int,
    ) : AuthenticationCodeType() {
        override fun getConstructor(): Int = 1_872_475_422
    }

    public class AuthenticationCodeTypeFirebaseIos(
        @JvmField
        public val receipt: String,
        @JvmField
        public val pushTimeout: Int,
        @JvmField
        public val length: Int,
    ) : AuthenticationCodeType() {
        override fun getConstructor(): Int = -11_162_989
    }

    public abstract class AuthorizationState() : Object()

    public class AuthorizationStateWaitTdlibParameters() : AuthorizationState() {
        override fun getConstructor(): Int = 904_720_988
    }

    public class AuthorizationStateWaitPhoneNumber() : AuthorizationState() {
        override fun getConstructor(): Int = 306_402_531
    }

    public class AuthorizationStateWaitPremiumPurchase(
        @JvmField
        public val storeProductId: String,
    ) : AuthorizationState() {
        override fun getConstructor(): Int = -862_487_743
    }

    public class AuthorizationStateWaitEmailAddress(
        @JvmField
        public val allowAppleId: Boolean,
        @JvmField
        public val allowGoogleId: Boolean,
    ) : AuthorizationState() {
        override fun getConstructor(): Int = 1_040_478_663
    }

    public class AuthorizationStateWaitEmailCode(
        @JvmField
        public val allowAppleId: Boolean,
        @JvmField
        public val allowGoogleId: Boolean,
        @JvmField
        public val codeInfo: EmailAddressAuthenticationCodeInfo,
        @JvmField
        public val emailAddressResetState: EmailAddressResetState?,
    ) : AuthorizationState() {
        override fun getConstructor(): Int = -1_868_627_365
    }

    public class AuthorizationStateWaitCode(
        @JvmField
        public val codeInfo: AuthenticationCodeInfo,
    ) : AuthorizationState() {
        override fun getConstructor(): Int = 52_643_073
    }

    public class AuthorizationStateWaitOtherDeviceConfirmation(
        @JvmField
        public val link: String,
    ) : AuthorizationState() {
        override fun getConstructor(): Int = 860_166_378
    }

    public class AuthorizationStateWaitRegistration(
        @JvmField
        public val termsOfService: TermsOfService,
    ) : AuthorizationState() {
        override fun getConstructor(): Int = 550_350_511
    }

    public class AuthorizationStateWaitPassword(
        @JvmField
        public val passwordHint: String,
        @JvmField
        public val hasRecoveryEmailAddress: Boolean,
        @JvmField
        public val hasPassportData: Boolean,
        @JvmField
        public val recoveryEmailAddressPattern: String,
    ) : AuthorizationState() {
        override fun getConstructor(): Int = 112_238_030
    }

    public class AuthorizationStateReady() : AuthorizationState() {
        override fun getConstructor(): Int = -1_834_871_737
    }

    public class AuthorizationStateLoggingOut() : AuthorizationState() {
        override fun getConstructor(): Int = 154_449_270
    }

    public class AuthorizationStateClosing() : AuthorizationState() {
        override fun getConstructor(): Int = 445_855_311
    }

    public class AuthorizationStateClosed() : AuthorizationState() {
        override fun getConstructor(): Int = 1_526_047_584
    }

    public class AutoDownloadSettings(
        @JvmField
        public val isAutoDownloadEnabled: Boolean,
        @JvmField
        public val maxPhotoFileSize: Int,
        @JvmField
        public val maxVideoFileSize: Long,
        @JvmField
        public val maxOtherFileSize: Long,
        @JvmField
        public val videoUploadBitrate: Int,
        @JvmField
        public val preloadLargeVideos: Boolean,
        @JvmField
        public val preloadNextAudio: Boolean,
        @JvmField
        public val preloadStories: Boolean,
        @JvmField
        public val useLessDataForCalls: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 991_433_696
    }

    public class AutoDownloadSettingsPresets(
        @JvmField
        public val low: AutoDownloadSettings,
        @JvmField
        public val medium: AutoDownloadSettings,
        @JvmField
        public val high: AutoDownloadSettings,
    ) : Object() {
        override fun getConstructor(): Int = -782_099_166
    }

    public class AutosaveSettings(
        @JvmField
        public val privateChatSettings: ScopeAutosaveSettings,
        @JvmField
        public val groupSettings: ScopeAutosaveSettings,
        @JvmField
        public val channelSettings: ScopeAutosaveSettings,
        @JvmField
        public val exceptions: Array<AutosaveSettingsException>,
    ) : Object() {
        override fun getConstructor(): Int = 1_629_412_502
    }

    public class AutosaveSettingsException(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val settings: ScopeAutosaveSettings,
    ) : Object() {
        override fun getConstructor(): Int = 1_483_470_280
    }

    public abstract class AutosaveSettingsScope() : Object()

    public class AutosaveSettingsScopePrivateChats() : AutosaveSettingsScope() {
        override fun getConstructor(): Int = 1_395_227_007
    }

    public class AutosaveSettingsScopeGroupChats() : AutosaveSettingsScope() {
        override fun getConstructor(): Int = 853_544_526
    }

    public class AutosaveSettingsScopeChannelChats() : AutosaveSettingsScope() {
        override fun getConstructor(): Int = -499_572_783
    }

    public class AutosaveSettingsScopeChat(
        @JvmField
        public val chatId: Long,
    ) : AutosaveSettingsScope() {
        override fun getConstructor(): Int = -1_632_255_255
    }

    public class AvailableReaction(
        @JvmField
        public val type: ReactionType,
        @JvmField
        public val needsPremium: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -117_292_153
    }

    public class AvailableReactions(
        @JvmField
        public val topReactions: Array<AvailableReaction>,
        @JvmField
        public val recentReactions: Array<AvailableReaction>,
        @JvmField
        public val popularReactions: Array<AvailableReaction>,
        @JvmField
        public val allowCustomEmoji: Boolean,
        @JvmField
        public val areTags: Boolean,
        @JvmField
        public val unavailabilityReason: ReactionUnavailabilityReason?,
    ) : Object() {
        override fun getConstructor(): Int = 912_529_522
    }

    public class Background(
        @JvmField
        public val id: Long,
        @JvmField
        public val isDefault: Boolean,
        @JvmField
        public val isDark: Boolean,
        @JvmField
        public val name: String,
        @JvmField
        public val document: Document?,
        @JvmField
        public val type: BackgroundType,
    ) : Object() {
        override fun getConstructor(): Int = -429_971_172
    }

    public abstract class BackgroundFill() : Object()

    public class BackgroundFillSolid(
        @JvmField
        public val color: Int,
    ) : BackgroundFill() {
        override fun getConstructor(): Int = 1_010_678_813
    }

    public class BackgroundFillGradient(
        @JvmField
        public val topColor: Int,
        @JvmField
        public val bottomColor: Int,
        @JvmField
        public val rotationAngle: Int,
    ) : BackgroundFill() {
        override fun getConstructor(): Int = -1_839_206_017
    }

    public class BackgroundFillFreeformGradient(
        @JvmField
        public val colors: IntArray,
    ) : BackgroundFill() {
        override fun getConstructor(): Int = -1_145_469_255
    }

    public abstract class BackgroundType() : Object()

    public class BackgroundTypeWallpaper(
        @JvmField
        public val isBlurred: Boolean,
        @JvmField
        public val isMoving: Boolean,
    ) : BackgroundType() {
        override fun getConstructor(): Int = 1_972_128_891
    }

    public class BackgroundTypePattern(
        @JvmField
        public val fill: BackgroundFill,
        @JvmField
        public val intensity: Int,
        @JvmField
        public val isInverted: Boolean,
        @JvmField
        public val isMoving: Boolean,
    ) : BackgroundType() {
        override fun getConstructor(): Int = 1_290_213_117
    }

    public class BackgroundTypeFill(
        @JvmField
        public val fill: BackgroundFill,
    ) : BackgroundType() {
        override fun getConstructor(): Int = 993_008_684
    }

    public class BackgroundTypeChatTheme(
        @JvmField
        public val themeName: String,
    ) : BackgroundType() {
        override fun getConstructor(): Int = 1_299_879_762
    }

    public class Backgrounds(
        @JvmField
        public val backgrounds: Array<Background>,
    ) : Object() {
        override fun getConstructor(): Int = 724_728_704
    }

    public class BankCardActionOpenUrl(
        @JvmField
        public val text: String,
        @JvmField
        public val url: String,
    ) : Object() {
        override fun getConstructor(): Int = -196_454_267
    }

    public class BankCardInfo(
        @JvmField
        public val title: String,
        @JvmField
        public val actions: Array<BankCardActionOpenUrl>,
    ) : Object() {
        override fun getConstructor(): Int = -2_116_647_730
    }

    public class BasicGroup(
        @JvmField
        public val id: Long,
        @JvmField
        public val memberCount: Int,
        @JvmField
        public val status: ChatMemberStatus,
        @JvmField
        public val isActive: Boolean,
        @JvmField
        public val upgradedToSupergroupId: Long,
    ) : Object() {
        override fun getConstructor(): Int = -194_767_217
    }

    public class BasicGroupFullInfo(
        @JvmField
        public val photo: ChatPhoto?,
        @JvmField
        public val description: String,
        @JvmField
        public val creatorUserId: Long,
        @JvmField
        public val members: Array<ChatMember>,
        @JvmField
        public val canHideMembers: Boolean,
        @JvmField
        public val canToggleAggressiveAntiSpam: Boolean,
        @JvmField
        public val inviteLink: ChatInviteLink?,
        @JvmField
        public val botCommands: Array<BotCommands>,
    ) : Object() {
        override fun getConstructor(): Int = -1_879_035_520
    }

    public class Birthdate(
        @JvmField
        public val day: Int,
        @JvmField
        public val month: Int,
        @JvmField
        public val year: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_644_064_030
    }

    public abstract class BlockList() : Object()

    public class BlockListMain() : BlockList() {
        override fun getConstructor(): Int = 1_352_930_172
    }

    public class BlockListStories() : BlockList() {
        override fun getConstructor(): Int = 103_323_228
    }

    public class BotCommand(
        @JvmField
        public val command: String,
        @JvmField
        public val description: String,
    ) : Object() {
        override fun getConstructor(): Int = -1_032_140_601
    }

    public abstract class BotCommandScope() : Object()

    public class BotCommandScopeDefault() : BotCommandScope() {
        override fun getConstructor(): Int = 795_652_779
    }

    public class BotCommandScopeAllPrivateChats() : BotCommandScope() {
        override fun getConstructor(): Int = -344_889_543
    }

    public class BotCommandScopeAllGroupChats() : BotCommandScope() {
        override fun getConstructor(): Int = -981_088_162
    }

    public class BotCommandScopeAllChatAdministrators() : BotCommandScope() {
        override fun getConstructor(): Int = 1_998_329_169
    }

    public class BotCommandScopeChat(
        @JvmField
        public val chatId: Long,
    ) : BotCommandScope() {
        override fun getConstructor(): Int = -430_234_971
    }

    public class BotCommandScopeChatAdministrators(
        @JvmField
        public val chatId: Long,
    ) : BotCommandScope() {
        override fun getConstructor(): Int = 1_119_682_126
    }

    public class BotCommandScopeChatMember(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val userId: Long,
    ) : BotCommandScope() {
        override fun getConstructor(): Int = -211_380_494
    }

    public class BotCommands(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val commands: Array<BotCommand>,
    ) : Object() {
        override fun getConstructor(): Int = 1_741_364_468
    }

    public class BotInfo(
        @JvmField
        public val shortDescription: String,
        @JvmField
        public val description: String,
        @JvmField
        public val photo: Photo?,
        @JvmField
        public val animation: Animation?,
        @JvmField
        public val menuButton: BotMenuButton?,
        @JvmField
        public val commands: Array<BotCommand>,
        @JvmField
        public val privacyPolicyUrl: String,
        @JvmField
        public val defaultGroupAdministratorRights: ChatAdministratorRights?,
        @JvmField
        public val defaultChannelAdministratorRights: ChatAdministratorRights?,
        @JvmField
        public val affiliateProgram: AffiliateProgramInfo?,
        @JvmField
        public val webAppBackgroundLightColor: Int,
        @JvmField
        public val webAppBackgroundDarkColor: Int,
        @JvmField
        public val webAppHeaderLightColor: Int,
        @JvmField
        public val webAppHeaderDarkColor: Int,
        @JvmField
        public val verificationParameters: BotVerificationParameters?,
        @JvmField
        public val canGetRevenueStatistics: Boolean,
        @JvmField
        public val canManageEmojiStatus: Boolean,
        @JvmField
        public val hasMediaPreviews: Boolean,
        @JvmField
        public val editCommandsLink: InternalLinkType?,
        @JvmField
        public val editDescriptionLink: InternalLinkType?,
        @JvmField
        public val editDescriptionMediaLink: InternalLinkType?,
        @JvmField
        public val editSettingsLink: InternalLinkType?,
    ) : Object() {
        override fun getConstructor(): Int = 1_771_886_272
    }

    public class BotMediaPreview(
        @JvmField
        public val date: Int,
        @JvmField
        public val content: StoryContent,
    ) : Object() {
        override fun getConstructor(): Int = -1_632_264_984
    }

    public class BotMediaPreviewInfo(
        @JvmField
        public val previews: Array<BotMediaPreview>,
        @JvmField
        public val languageCodes: Array<String>,
    ) : Object() {
        override fun getConstructor(): Int = -284_783_012
    }

    public class BotMediaPreviews(
        @JvmField
        public val previews: Array<BotMediaPreview>,
    ) : Object() {
        override fun getConstructor(): Int = -1_787_720_586
    }

    public class BotMenuButton(
        @JvmField
        public val text: String,
        @JvmField
        public val url: String,
    ) : Object() {
        override fun getConstructor(): Int = -944_407_322
    }

    public class BotVerification(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val iconCustomEmojiId: Long,
        @JvmField
        public val customDescription: FormattedText,
    ) : Object() {
        override fun getConstructor(): Int = -1_319_061_774
    }

    public class BotVerificationParameters(
        @JvmField
        public val iconCustomEmojiId: Long,
        @JvmField
        public val organizationName: String,
        @JvmField
        public val defaultCustomDescription: FormattedText?,
        @JvmField
        public val canSetCustomDescription: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -723_737_249
    }

    public abstract class BotWriteAccessAllowReason() : Object()

    public class BotWriteAccessAllowReasonConnectedWebsite(
        @JvmField
        public val domainName: String,
    ) : BotWriteAccessAllowReason() {
        override fun getConstructor(): Int = 2_016_325_603
    }

    public class BotWriteAccessAllowReasonAddedToAttachmentMenu() : BotWriteAccessAllowReason() {
        override fun getConstructor(): Int = -2_104_795_235
    }

    public class BotWriteAccessAllowReasonLaunchedWebApp(
        @JvmField
        public val webApp: WebApp,
    ) : BotWriteAccessAllowReason() {
        override fun getConstructor(): Int = -240_843_561
    }

    public class BotWriteAccessAllowReasonAcceptedRequest() : BotWriteAccessAllowReason() {
        override fun getConstructor(): Int = -1_983_497_220
    }

    public abstract class BusinessAwayMessageSchedule() : Object()

    public class BusinessAwayMessageScheduleAlways() : BusinessAwayMessageSchedule() {
        override fun getConstructor(): Int = -910_564_679
    }

    public class BusinessAwayMessageScheduleOutsideOfOpeningHours() : BusinessAwayMessageSchedule() {
        override fun getConstructor(): Int = -968_630_506
    }

    public class BusinessAwayMessageScheduleCustom(
        @JvmField
        public val startDate: Int,
        @JvmField
        public val endDate: Int,
    ) : BusinessAwayMessageSchedule() {
        override fun getConstructor(): Int = -1_967_108_654
    }

    public class BusinessAwayMessageSettings(
        @JvmField
        public val shortcutId: Int,
        @JvmField
        public val recipients: BusinessRecipients,
        @JvmField
        public val schedule: BusinessAwayMessageSchedule,
        @JvmField
        public val offlineOnly: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 353_084_137
    }

    public class BusinessBotManageBar(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val manageUrl: String,
        @JvmField
        public val isBotPaused: Boolean,
        @JvmField
        public val canBotReply: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -311_399_806
    }

    public class BusinessBotRights(
        @JvmField
        public val canReply: Boolean,
        @JvmField
        public val canReadMessages: Boolean,
        @JvmField
        public val canDeleteSentMessages: Boolean,
        @JvmField
        public val canDeleteAllMessages: Boolean,
        @JvmField
        public val canEditName: Boolean,
        @JvmField
        public val canEditBio: Boolean,
        @JvmField
        public val canEditProfilePhoto: Boolean,
        @JvmField
        public val canEditUsername: Boolean,
        @JvmField
        public val canViewGiftsAndStars: Boolean,
        @JvmField
        public val canSellGifts: Boolean,
        @JvmField
        public val canChangeGiftSettings: Boolean,
        @JvmField
        public val canTransferAndUpgradeGifts: Boolean,
        @JvmField
        public val canTransferStars: Boolean,
        @JvmField
        public val canManageStories: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_224_839_038
    }

    public class BusinessChatLink(
        @JvmField
        public val link: String,
        @JvmField
        public val text: FormattedText,
        @JvmField
        public val title: String,
        @JvmField
        public val viewCount: Int,
    ) : Object() {
        override fun getConstructor(): Int = -1_902_539_901
    }

    public class BusinessChatLinkInfo(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val text: FormattedText,
    ) : Object() {
        override fun getConstructor(): Int = -864_865_105
    }

    public class BusinessChatLinks(
        @JvmField
        public val links: Array<BusinessChatLink>,
    ) : Object() {
        override fun getConstructor(): Int = 79_067_036
    }

    public class BusinessConnectedBot(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val recipients: BusinessRecipients,
        @JvmField
        public val rights: BusinessBotRights,
    ) : Object() {
        override fun getConstructor(): Int = -1_815_439_021
    }

    public class BusinessConnection(
        @JvmField
        public val id: String,
        @JvmField
        public val userId: Long,
        @JvmField
        public val userChatId: Long,
        @JvmField
        public val date: Int,
        @JvmField
        public val rights: BusinessBotRights?,
        @JvmField
        public val isEnabled: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -995_703_933
    }

    public abstract class BusinessFeature() : Object()

    public class BusinessFeatureLocation() : BusinessFeature() {
        override fun getConstructor(): Int = -1_064_304_004
    }

    public class BusinessFeatureOpeningHours() : BusinessFeature() {
        override fun getConstructor(): Int = 461_054_701
    }

    public class BusinessFeatureQuickReplies() : BusinessFeature() {
        override fun getConstructor(): Int = -1_674_048_894
    }

    public class BusinessFeatureGreetingMessage() : BusinessFeature() {
        override fun getConstructor(): Int = 1_789_424_756
    }

    public class BusinessFeatureAwayMessage() : BusinessFeature() {
        override fun getConstructor(): Int = 1_090_119_901
    }

    public class BusinessFeatureAccountLinks() : BusinessFeature() {
        override fun getConstructor(): Int = 1_878_693_646
    }

    public class BusinessFeatureStartPage() : BusinessFeature() {
        override fun getConstructor(): Int = 401_471_457
    }

    public class BusinessFeatureBots() : BusinessFeature() {
        override fun getConstructor(): Int = 275_084_773
    }

    public class BusinessFeatureEmojiStatus() : BusinessFeature() {
        override fun getConstructor(): Int = -846_282_523
    }

    public class BusinessFeatureChatFolderTags() : BusinessFeature() {
        override fun getConstructor(): Int = -543_880_918
    }

    public class BusinessFeatureUpgradedStories() : BusinessFeature() {
        override fun getConstructor(): Int = -1_812_245_550
    }

    public class BusinessFeaturePromotionAnimation(
        @JvmField
        public val feature: BusinessFeature,
        @JvmField
        public val animation: Animation,
    ) : Object() {
        override fun getConstructor(): Int = 2_047_174_666
    }

    public class BusinessFeatures(
        @JvmField
        public val features: Array<BusinessFeature>,
    ) : Object() {
        override fun getConstructor(): Int = -1_532_468_184
    }

    public class BusinessGreetingMessageSettings(
        @JvmField
        public val shortcutId: Int,
        @JvmField
        public val recipients: BusinessRecipients,
        @JvmField
        public val inactivityDays: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_689_140_754
    }

    public class BusinessInfo(
        @JvmField
        public val location: BusinessLocation?,
        @JvmField
        public val openingHours: BusinessOpeningHours?,
        @JvmField
        public val localOpeningHours: BusinessOpeningHours?,
        @JvmField
        public val nextOpenIn: Int,
        @JvmField
        public val nextCloseIn: Int,
        @JvmField
        public val greetingMessageSettings: BusinessGreetingMessageSettings?,
        @JvmField
        public val awayMessageSettings: BusinessAwayMessageSettings?,
        @JvmField
        public val startPage: BusinessStartPage?,
    ) : Object() {
        override fun getConstructor(): Int = 1_428_179_342
    }

    public class BusinessLocation(
        @JvmField
        public val location: Location?,
        @JvmField
        public val address: String,
    ) : Object() {
        override fun getConstructor(): Int = -1_084_969_126
    }

    public class BusinessMessage(
        @JvmField
        public val message: Message,
        @JvmField
        public val replyToMessage: Message?,
    ) : Object() {
        override fun getConstructor(): Int = -94_353_850
    }

    public class BusinessMessages(
        @JvmField
        public val messages: Array<BusinessMessage>,
    ) : Object() {
        override fun getConstructor(): Int = -764_562_473
    }

    public class BusinessOpeningHours(
        @JvmField
        public val timeZoneId: String,
        @JvmField
        public val openingHours: Array<BusinessOpeningHoursInterval>,
    ) : Object() {
        override fun getConstructor(): Int = 816_603_700
    }

    public class BusinessOpeningHoursInterval(
        @JvmField
        public val startMinute: Int,
        @JvmField
        public val endMinute: Int,
    ) : Object() {
        override fun getConstructor(): Int = -1_108_322_732
    }

    public class BusinessRecipients(
        @JvmField
        public val chatIds: LongArray,
        @JvmField
        public val excludedChatIds: LongArray,
        @JvmField
        public val selectExistingChats: Boolean,
        @JvmField
        public val selectNewChats: Boolean,
        @JvmField
        public val selectContacts: Boolean,
        @JvmField
        public val selectNonContacts: Boolean,
        @JvmField
        public val excludeSelected: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 868_656_909
    }

    public class BusinessStartPage(
        @JvmField
        public val title: String,
        @JvmField
        public val message: String,
        @JvmField
        public val sticker: Sticker?,
    ) : Object() {
        override fun getConstructor(): Int = -1_616_709_681
    }

    public class Call(
        @JvmField
        public val id: Int,
        @JvmField
        public val userId: Long,
        @JvmField
        public val isOutgoing: Boolean,
        @JvmField
        public val isVideo: Boolean,
        @JvmField
        public val state: CallState,
    ) : Object() {
        override fun getConstructor(): Int = 920_360_804
    }

    public abstract class CallDiscardReason() : Object()

    public class CallDiscardReasonEmpty() : CallDiscardReason() {
        override fun getConstructor(): Int = -1_258_917_949
    }

    public class CallDiscardReasonMissed() : CallDiscardReason() {
        override fun getConstructor(): Int = 1_680_358_012
    }

    public class CallDiscardReasonDeclined() : CallDiscardReason() {
        override fun getConstructor(): Int = -1_729_926_094
    }

    public class CallDiscardReasonDisconnected() : CallDiscardReason() {
        override fun getConstructor(): Int = -1_342_872_670
    }

    public class CallDiscardReasonHungUp() : CallDiscardReason() {
        override fun getConstructor(): Int = 438_216_166
    }

    public class CallDiscardReasonUpgradeToGroupCall(
        @JvmField
        public val inviteLink: String,
    ) : CallDiscardReason() {
        override fun getConstructor(): Int = 1_254_509_319
    }

    public class CallId(
        @JvmField
        public val id: Int,
    ) : Object() {
        override fun getConstructor(): Int = 65_717_769
    }

    public abstract class CallProblem() : Object()

    public class CallProblemEcho() : CallProblem() {
        override fun getConstructor(): Int = 801_116_548
    }

    public class CallProblemNoise() : CallProblem() {
        override fun getConstructor(): Int = 1_053_065_359
    }

    public class CallProblemInterruptions() : CallProblem() {
        override fun getConstructor(): Int = 1_119_493_218
    }

    public class CallProblemDistortedSpeech() : CallProblem() {
        override fun getConstructor(): Int = 379_960_581
    }

    public class CallProblemSilentLocal() : CallProblem() {
        override fun getConstructor(): Int = 253_652_790
    }

    public class CallProblemSilentRemote() : CallProblem() {
        override fun getConstructor(): Int = 573_634_714
    }

    public class CallProblemDropped() : CallProblem() {
        override fun getConstructor(): Int = -1_207_311_487
    }

    public class CallProblemDistortedVideo() : CallProblem() {
        override fun getConstructor(): Int = 385_245_706
    }

    public class CallProblemPixelatedVideo() : CallProblem() {
        override fun getConstructor(): Int = 2_115_315_411
    }

    public class CallProtocol(
        @JvmField
        public val udpP2p: Boolean,
        @JvmField
        public val udpReflector: Boolean,
        @JvmField
        public val minLayer: Int,
        @JvmField
        public val maxLayer: Int,
        @JvmField
        public val libraryVersions: Array<String>,
    ) : Object() {
        override fun getConstructor(): Int = -1_075_562_897
    }

    public class CallServer(
        @JvmField
        public val id: Long,
        @JvmField
        public val ipAddress: String,
        @JvmField
        public val ipv6Address: String,
        @JvmField
        public val port: Int,
        @JvmField
        public val type: CallServerType,
    ) : Object() {
        override fun getConstructor(): Int = 1_865_932_695
    }

    public abstract class CallServerType() : Object()

    public class CallServerTypeTelegramReflector(
        @JvmField
        public val peerTag: ByteArray,
        @JvmField
        public val isTcp: Boolean,
    ) : CallServerType() {
        override fun getConstructor(): Int = 850_343_189
    }

    public class CallServerTypeWebrtc(
        @JvmField
        public val username: String,
        @JvmField
        public val password: String,
        @JvmField
        public val supportsTurn: Boolean,
        @JvmField
        public val supportsStun: Boolean,
    ) : CallServerType() {
        override fun getConstructor(): Int = 1_250_622_821
    }

    public abstract class CallState() : Object()

    public class CallStatePending(
        @JvmField
        public val isCreated: Boolean,
        @JvmField
        public val isReceived: Boolean,
    ) : CallState() {
        override fun getConstructor(): Int = 1_073_048_620
    }

    public class CallStateExchangingKeys() : CallState() {
        override fun getConstructor(): Int = -1_848_149_403
    }

    public class CallStateReady(
        @JvmField
        public val protocol: CallProtocol,
        @JvmField
        public val servers: Array<CallServer>,
        @JvmField
        public val config: String,
        @JvmField
        public val encryptionKey: ByteArray,
        @JvmField
        public val emojis: Array<String>,
        @JvmField
        public val allowP2p: Boolean,
        @JvmField
        public val isGroupCallSupported: Boolean,
        @JvmField
        public val customParameters: String,
    ) : CallState() {
        override fun getConstructor(): Int = -281_776_921
    }

    public class CallStateHangingUp() : CallState() {
        override fun getConstructor(): Int = -2_133_790_038
    }

    public class CallStateDiscarded(
        @JvmField
        public val reason: CallDiscardReason,
        @JvmField
        public val needRating: Boolean,
        @JvmField
        public val needDebugInformation: Boolean,
        @JvmField
        public val needLog: Boolean,
    ) : CallState() {
        override fun getConstructor(): Int = 1_394_310_213
    }

    public class CallStateError(
        @JvmField
        public val error: Error,
    ) : CallState() {
        override fun getConstructor(): Int = -975_215_467
    }

    public class CallbackQueryAnswer(
        @JvmField
        public val text: String,
        @JvmField
        public val showAlert: Boolean,
        @JvmField
        public val url: String,
    ) : Object() {
        override fun getConstructor(): Int = 360_867_933
    }

    public abstract class CallbackQueryPayload() : Object()

    public class CallbackQueryPayloadData(
        @JvmField
        public val data: ByteArray,
    ) : CallbackQueryPayload() {
        override fun getConstructor(): Int = -1_977_729_946
    }

    public class CallbackQueryPayloadDataWithPassword(
        @JvmField
        public val password: String,
        @JvmField
        public val data: ByteArray,
    ) : CallbackQueryPayload() {
        override fun getConstructor(): Int = 1_340_266_738
    }

    public class CallbackQueryPayloadGame(
        @JvmField
        public val gameShortName: String,
    ) : CallbackQueryPayload() {
        override fun getConstructor(): Int = 1_303_571_512
    }

    public abstract class CanPostStoryResult() : Object()

    public class CanPostStoryResultOk() : CanPostStoryResult() {
        override fun getConstructor(): Int = 1_419_900_186
    }

    public class CanPostStoryResultPremiumNeeded() : CanPostStoryResult() {
        override fun getConstructor(): Int = 935_130_501
    }

    public class CanPostStoryResultBoostNeeded() : CanPostStoryResult() {
        override fun getConstructor(): Int = 80_246_195
    }

    public class CanPostStoryResultActiveStoryLimitExceeded() : CanPostStoryResult() {
        override fun getConstructor(): Int = -1_640_759_002
    }

    public class CanPostStoryResultWeeklyLimitExceeded(
        @JvmField
        public val retryAfter: Int,
    ) : CanPostStoryResult() {
        override fun getConstructor(): Int = 552_858_605
    }

    public class CanPostStoryResultMonthlyLimitExceeded(
        @JvmField
        public val retryAfter: Int,
    ) : CanPostStoryResult() {
        override fun getConstructor(): Int = -784_208_562
    }

    public abstract class CanSendMessageToUserResult() : Object()

    public class CanSendMessageToUserResultOk() : CanSendMessageToUserResult() {
        override fun getConstructor(): Int = 1_530_583_042
    }

    public class CanSendMessageToUserResultUserHasPaidMessages(
        @JvmField
        public val outgoingPaidMessageStarCount: Long,
    ) : CanSendMessageToUserResult() {
        override fun getConstructor(): Int = -1_346_487_602
    }

    public class CanSendMessageToUserResultUserIsDeleted() : CanSendMessageToUserResult() {
        override fun getConstructor(): Int = -1_944_639_903
    }

    public class CanSendMessageToUserResultUserRestrictsNewChats() : CanSendMessageToUserResult() {
        override fun getConstructor(): Int = 1_929_699_797
    }

    public abstract class CanTransferOwnershipResult() : Object()

    public class CanTransferOwnershipResultOk() : CanTransferOwnershipResult() {
        override fun getConstructor(): Int = -89_881_021
    }

    public class CanTransferOwnershipResultPasswordNeeded() : CanTransferOwnershipResult() {
        override fun getConstructor(): Int = 1_548_372_703
    }

    public class CanTransferOwnershipResultPasswordTooFresh(
        @JvmField
        public val retryAfter: Int,
    ) : CanTransferOwnershipResult() {
        override fun getConstructor(): Int = 811_440_913
    }

    public class CanTransferOwnershipResultSessionTooFresh(
        @JvmField
        public val retryAfter: Int,
    ) : CanTransferOwnershipResult() {
        override fun getConstructor(): Int = 984_664_289
    }

    public class Chat(
        @JvmField
        public val id: Long,
        @JvmField
        public val type: ChatType,
        @JvmField
        public val title: String,
        @JvmField
        public val photo: ChatPhotoInfo?,
        @JvmField
        public val accentColorId: Int,
        @JvmField
        public val backgroundCustomEmojiId: Long,
        @JvmField
        public val profileAccentColorId: Int,
        @JvmField
        public val profileBackgroundCustomEmojiId: Long,
        @JvmField
        public val permissions: ChatPermissions,
        @JvmField
        public val lastMessage: Message?,
        @JvmField
        public val positions: Array<ChatPosition>,
        @JvmField
        public val chatLists: Array<ChatList>,
        @JvmField
        public val messageSenderId: MessageSender?,
        @JvmField
        public val blockList: BlockList?,
        @JvmField
        public val hasProtectedContent: Boolean,
        @JvmField
        public val isTranslatable: Boolean,
        @JvmField
        public val isMarkedAsUnread: Boolean,
        @JvmField
        public val viewAsTopics: Boolean,
        @JvmField
        public val hasScheduledMessages: Boolean,
        @JvmField
        public val canBeDeletedOnlyForSelf: Boolean,
        @JvmField
        public val canBeDeletedForAllUsers: Boolean,
        @JvmField
        public val canBeReported: Boolean,
        @JvmField
        public val defaultDisableNotification: Boolean,
        @JvmField
        public val unreadCount: Int,
        @JvmField
        public val lastReadInboxMessageId: Long,
        @JvmField
        public val lastReadOutboxMessageId: Long,
        @JvmField
        public val unreadMentionCount: Int,
        @JvmField
        public val unreadReactionCount: Int,
        @JvmField
        public val notificationSettings: ChatNotificationSettings,
        @JvmField
        public val availableReactions: ChatAvailableReactions,
        @JvmField
        public val messageAutoDeleteTime: Int,
        @JvmField
        public val emojiStatus: EmojiStatus?,
        @JvmField
        public val background: ChatBackground?,
        @JvmField
        public val themeName: String,
        @JvmField
        public val actionBar: ChatActionBar?,
        @JvmField
        public val businessBotManageBar: BusinessBotManageBar?,
        @JvmField
        public val videoChat: VideoChat,
        @JvmField
        public val pendingJoinRequests: ChatJoinRequestsInfo?,
        @JvmField
        public val replyMarkupMessageId: Long,
        @JvmField
        public val draftMessage: DraftMessage?,
        @JvmField
        public val clientData: String,
    ) : Object() {
        override fun getConstructor(): Int = 830_601_369
    }

    public abstract class ChatAction() : Object()

    public class ChatActionTyping() : ChatAction() {
        override fun getConstructor(): Int = 380_122_167
    }

    public class ChatActionRecordingVideo() : ChatAction() {
        override fun getConstructor(): Int = 216_553_362
    }

    public class ChatActionUploadingVideo(
        @JvmField
        public val progress: Int,
    ) : ChatAction() {
        override fun getConstructor(): Int = 1_234_185_270
    }

    public class ChatActionRecordingVoiceNote() : ChatAction() {
        override fun getConstructor(): Int = -808_850_058
    }

    public class ChatActionUploadingVoiceNote(
        @JvmField
        public val progress: Int,
    ) : ChatAction() {
        override fun getConstructor(): Int = -613_643_666
    }

    public class ChatActionUploadingPhoto(
        @JvmField
        public val progress: Int,
    ) : ChatAction() {
        override fun getConstructor(): Int = 654_240_583
    }

    public class ChatActionUploadingDocument(
        @JvmField
        public val progress: Int,
    ) : ChatAction() {
        override fun getConstructor(): Int = 167_884_362
    }

    public class ChatActionChoosingSticker() : ChatAction() {
        override fun getConstructor(): Int = 372_753_697
    }

    public class ChatActionChoosingLocation() : ChatAction() {
        override fun getConstructor(): Int = -2_017_893_596
    }

    public class ChatActionChoosingContact() : ChatAction() {
        override fun getConstructor(): Int = -1_222_507_496
    }

    public class ChatActionStartPlayingGame() : ChatAction() {
        override fun getConstructor(): Int = -865_884_164
    }

    public class ChatActionRecordingVideoNote() : ChatAction() {
        override fun getConstructor(): Int = 16_523_393
    }

    public class ChatActionUploadingVideoNote(
        @JvmField
        public val progress: Int,
    ) : ChatAction() {
        override fun getConstructor(): Int = 1_172_364_918
    }

    public class ChatActionWatchingAnimations(
        @JvmField
        public val emoji: String,
    ) : ChatAction() {
        override fun getConstructor(): Int = 2_052_990_641
    }

    public class ChatActionCancel() : ChatAction() {
        override fun getConstructor(): Int = 1_160_523_958
    }

    public abstract class ChatActionBar() : Object()

    public class ChatActionBarReportSpam(
        @JvmField
        public val canUnarchive: Boolean,
    ) : ChatActionBar() {
        override fun getConstructor(): Int = -1_312_758_246
    }

    public class ChatActionBarInviteMembers() : ChatActionBar() {
        override fun getConstructor(): Int = 1_985_313_904
    }

    public class ChatActionBarReportAddBlock(
        @JvmField
        public val canUnarchive: Boolean,
        @JvmField
        public val accountInfo: AccountInfo?,
    ) : ChatActionBar() {
        override fun getConstructor(): Int = -1_476_817_269
    }

    public class ChatActionBarAddContact() : ChatActionBar() {
        override fun getConstructor(): Int = -733_325_295
    }

    public class ChatActionBarSharePhoneNumber() : ChatActionBar() {
        override fun getConstructor(): Int = 35_188_697
    }

    public class ChatActionBarJoinRequest(
        @JvmField
        public val title: String,
        @JvmField
        public val isChannel: Boolean,
        @JvmField
        public val requestDate: Int,
    ) : ChatActionBar() {
        override fun getConstructor(): Int = 1_037_140_744
    }

    public class ChatActiveStories(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val list: StoryList?,
        @JvmField
        public val order: Long,
        @JvmField
        public val maxReadStoryId: Int,
        @JvmField
        public val stories: Array<StoryInfo>,
    ) : Object() {
        override fun getConstructor(): Int = -1_398_869_529
    }

    public class ChatAdministrator(
        @JvmField
        public val userId: Long,
        @JvmField
        public val customTitle: String,
        @JvmField
        public val isOwner: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_920_449_836
    }

    public class ChatAdministratorRights(
        @JvmField
        public val canManageChat: Boolean,
        @JvmField
        public val canChangeInfo: Boolean,
        @JvmField
        public val canPostMessages: Boolean,
        @JvmField
        public val canEditMessages: Boolean,
        @JvmField
        public val canDeleteMessages: Boolean,
        @JvmField
        public val canInviteUsers: Boolean,
        @JvmField
        public val canRestrictMembers: Boolean,
        @JvmField
        public val canPinMessages: Boolean,
        @JvmField
        public val canManageTopics: Boolean,
        @JvmField
        public val canPromoteMembers: Boolean,
        @JvmField
        public val canManageVideoChats: Boolean,
        @JvmField
        public val canPostStories: Boolean,
        @JvmField
        public val canEditStories: Boolean,
        @JvmField
        public val canDeleteStories: Boolean,
        @JvmField
        public val isAnonymous: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_599_049_796
    }

    public class ChatAdministrators(
        @JvmField
        public val administrators: Array<ChatAdministrator>,
    ) : Object() {
        override fun getConstructor(): Int = -2_126_186_435
    }

    public abstract class ChatAvailableReactions() : Object()

    public class ChatAvailableReactionsAll(
        @JvmField
        public val maxReactionCount: Int,
    ) : ChatAvailableReactions() {
        override fun getConstructor(): Int = 694_160_279
    }

    public class ChatAvailableReactionsSome(
        @JvmField
        public val reactions: Array<ReactionType>,
        @JvmField
        public val maxReactionCount: Int,
    ) : ChatAvailableReactions() {
        override fun getConstructor(): Int = 152_513_153
    }

    public class ChatBackground(
        @JvmField
        public val background: Background,
        @JvmField
        public val darkThemeDimming: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_653_152_104
    }

    public class ChatBoost(
        @JvmField
        public val id: String,
        @JvmField
        public val count: Int,
        @JvmField
        public val source: ChatBoostSource,
        @JvmField
        public val startDate: Int,
        @JvmField
        public val expirationDate: Int,
    ) : Object() {
        override fun getConstructor(): Int = -1_765_815_118
    }

    public class ChatBoostFeatures(
        @JvmField
        public val features: Array<ChatBoostLevelFeatures>,
        @JvmField
        public val minProfileBackgroundCustomEmojiBoostLevel: Int,
        @JvmField
        public val minBackgroundCustomEmojiBoostLevel: Int,
        @JvmField
        public val minEmojiStatusBoostLevel: Int,
        @JvmField
        public val minChatThemeBackgroundBoostLevel: Int,
        @JvmField
        public val minCustomBackgroundBoostLevel: Int,
        @JvmField
        public val minCustomEmojiStickerSetBoostLevel: Int,
        @JvmField
        public val minSpeechRecognitionBoostLevel: Int,
        @JvmField
        public val minSponsoredMessageDisableBoostLevel: Int,
    ) : Object() {
        override fun getConstructor(): Int = 866_182_642
    }

    public class ChatBoostLevelFeatures(
        @JvmField
        public val level: Int,
        @JvmField
        public val storyPerDayCount: Int,
        @JvmField
        public val customEmojiReactionCount: Int,
        @JvmField
        public val titleColorCount: Int,
        @JvmField
        public val profileAccentColorCount: Int,
        @JvmField
        public val canSetProfileBackgroundCustomEmoji: Boolean,
        @JvmField
        public val accentColorCount: Int,
        @JvmField
        public val canSetBackgroundCustomEmoji: Boolean,
        @JvmField
        public val canSetEmojiStatus: Boolean,
        @JvmField
        public val chatThemeBackgroundCount: Int,
        @JvmField
        public val canSetCustomBackground: Boolean,
        @JvmField
        public val canSetCustomEmojiStickerSet: Boolean,
        @JvmField
        public val canRecognizeSpeech: Boolean,
        @JvmField
        public val canDisableSponsoredMessages: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -189_458_156
    }

    public class ChatBoostLink(
        @JvmField
        public val link: String,
        @JvmField
        public val isPublic: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -1_253_999_503
    }

    public class ChatBoostLinkInfo(
        @JvmField
        public val isPublic: Boolean,
        @JvmField
        public val chatId: Long,
    ) : Object() {
        override fun getConstructor(): Int = -602_785_660
    }

    public class ChatBoostSlot(
        @JvmField
        public val slotId: Int,
        @JvmField
        public val currentlyBoostedChatId: Long,
        @JvmField
        public val startDate: Int,
        @JvmField
        public val expirationDate: Int,
        @JvmField
        public val cooldownUntilDate: Int,
    ) : Object() {
        override fun getConstructor(): Int = 123_206_343
    }

    public class ChatBoostSlots(
        @JvmField
        public val slots: Array<ChatBoostSlot>,
    ) : Object() {
        override fun getConstructor(): Int = 1_014_966_293
    }

    public abstract class ChatBoostSource() : Object()

    public class ChatBoostSourceGiftCode(
        @JvmField
        public val userId: Long,
        @JvmField
        public val giftCode: String,
    ) : ChatBoostSource() {
        override fun getConstructor(): Int = -98_299_206
    }

    public class ChatBoostSourceGiveaway(
        @JvmField
        public val userId: Long,
        @JvmField
        public val giftCode: String,
        @JvmField
        public val starCount: Long,
        @JvmField
        public val giveawayMessageId: Long,
        @JvmField
        public val isUnclaimed: Boolean,
    ) : ChatBoostSource() {
        override fun getConstructor(): Int = 1_918_145_690
    }

    public class ChatBoostSourcePremium(
        @JvmField
        public val userId: Long,
    ) : ChatBoostSource() {
        override fun getConstructor(): Int = 972_011
    }

    public class ChatBoostStatus(
        @JvmField
        public val boostUrl: String,
        @JvmField
        public val appliedSlotIds: IntArray,
        @JvmField
        public val level: Int,
        @JvmField
        public val giftCodeBoostCount: Int,
        @JvmField
        public val boostCount: Int,
        @JvmField
        public val currentLevelBoostCount: Int,
        @JvmField
        public val nextLevelBoostCount: Int,
        @JvmField
        public val premiumMemberCount: Int,
        @JvmField
        public val premiumMemberPercentage: Double,
        @JvmField
        public val prepaidGiveaways: Array<PrepaidGiveaway>,
    ) : Object() {
        override fun getConstructor(): Int = -1_050_332_618
    }

    public class ChatEvent(
        @JvmField
        public val id: Long,
        @JvmField
        public val date: Int,
        @JvmField
        public val memberId: MessageSender,
        @JvmField
        public val action: ChatEventAction,
    ) : Object() {
        override fun getConstructor(): Int = -652_102_704
    }

    public abstract class ChatEventAction() : Object()

    public class ChatEventMessageEdited(
        @JvmField
        public val oldMessage: Message,
        @JvmField
        public val newMessage: Message,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -430_967_304
    }

    public class ChatEventMessageDeleted(
        @JvmField
        public val message: Message,
        @JvmField
        public val canReportAntiSpamFalsePositive: Boolean,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 935_316_851
    }

    public class ChatEventMessagePinned(
        @JvmField
        public val message: Message,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 438_742_298
    }

    public class ChatEventMessageUnpinned(
        @JvmField
        public val message: Message,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -376_161_513
    }

    public class ChatEventPollStopped(
        @JvmField
        public val message: Message,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 2_009_893_861
    }

    public class ChatEventMemberJoined() : ChatEventAction() {
        override fun getConstructor(): Int = -235_468_508
    }

    public class ChatEventMemberJoinedByInviteLink(
        @JvmField
        public val inviteLink: ChatInviteLink,
        @JvmField
        public val viaChatFolderInviteLink: Boolean,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -1_445_536_390
    }

    public class ChatEventMemberJoinedByRequest(
        @JvmField
        public val approverUserId: Long,
        @JvmField
        public val inviteLink: ChatInviteLink?,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -1_647_804_865
    }

    public class ChatEventMemberInvited(
        @JvmField
        public val userId: Long,
        @JvmField
        public val status: ChatMemberStatus,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 953_663_433
    }

    public class ChatEventMemberLeft() : ChatEventAction() {
        override fun getConstructor(): Int = -948_420_593
    }

    public class ChatEventMemberPromoted(
        @JvmField
        public val userId: Long,
        @JvmField
        public val oldStatus: ChatMemberStatus,
        @JvmField
        public val newStatus: ChatMemberStatus,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 525_297_761
    }

    public class ChatEventMemberRestricted(
        @JvmField
        public val memberId: MessageSender,
        @JvmField
        public val oldStatus: ChatMemberStatus,
        @JvmField
        public val newStatus: ChatMemberStatus,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 1_603_608_069
    }

    public class ChatEventMemberSubscriptionExtended(
        @JvmField
        public val userId: Long,
        @JvmField
        public val oldStatus: ChatMemberStatus,
        @JvmField
        public val newStatus: ChatMemberStatus,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -1_141_198_846
    }

    public class ChatEventAvailableReactionsChanged(
        @JvmField
        public val oldAvailableReactions: ChatAvailableReactions,
        @JvmField
        public val newAvailableReactions: ChatAvailableReactions,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -1_749_491_521
    }

    public class ChatEventBackgroundChanged(
        @JvmField
        public val oldBackground: ChatBackground?,
        @JvmField
        public val newBackground: ChatBackground?,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -1_225_953_992
    }

    public class ChatEventDescriptionChanged(
        @JvmField
        public val oldDescription: String,
        @JvmField
        public val newDescription: String,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 39_112_478
    }

    public class ChatEventEmojiStatusChanged(
        @JvmField
        public val oldEmojiStatus: EmojiStatus?,
        @JvmField
        public val newEmojiStatus: EmojiStatus?,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -2_081_850_594
    }

    public class ChatEventLinkedChatChanged(
        @JvmField
        public val oldLinkedChatId: Long,
        @JvmField
        public val newLinkedChatId: Long,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 1_797_419_439
    }

    public class ChatEventLocationChanged(
        @JvmField
        public val oldLocation: ChatLocation?,
        @JvmField
        public val newLocation: ChatLocation?,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -405_930_674
    }

    public class ChatEventMessageAutoDeleteTimeChanged(
        @JvmField
        public val oldMessageAutoDeleteTime: Int,
        @JvmField
        public val newMessageAutoDeleteTime: Int,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 17_317_668
    }

    public class ChatEventPermissionsChanged(
        @JvmField
        public val oldPermissions: ChatPermissions,
        @JvmField
        public val newPermissions: ChatPermissions,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -1_311_557_720
    }

    public class ChatEventPhotoChanged(
        @JvmField
        public val oldPhoto: ChatPhoto?,
        @JvmField
        public val newPhoto: ChatPhoto?,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -811_572_541
    }

    public class ChatEventSlowModeDelayChanged(
        @JvmField
        public val oldSlowModeDelay: Int,
        @JvmField
        public val newSlowModeDelay: Int,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -1_653_195_765
    }

    public class ChatEventStickerSetChanged(
        @JvmField
        public val oldStickerSetId: Long,
        @JvmField
        public val newStickerSetId: Long,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -1_243_130_481
    }

    public class ChatEventCustomEmojiStickerSetChanged(
        @JvmField
        public val oldStickerSetId: Long,
        @JvmField
        public val newStickerSetId: Long,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 118_244_123
    }

    public class ChatEventTitleChanged(
        @JvmField
        public val oldTitle: String,
        @JvmField
        public val newTitle: String,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 1_134_103_250
    }

    public class ChatEventUsernameChanged(
        @JvmField
        public val oldUsername: String,
        @JvmField
        public val newUsername: String,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 1_728_558_443
    }

    public class ChatEventActiveUsernamesChanged(
        @JvmField
        public val oldUsernames: Array<String>,
        @JvmField
        public val newUsernames: Array<String>,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -1_508_790_810
    }

    public class ChatEventAccentColorChanged(
        @JvmField
        public val oldAccentColorId: Int,
        @JvmField
        public val oldBackgroundCustomEmojiId: Long,
        @JvmField
        public val newAccentColorId: Int,
        @JvmField
        public val newBackgroundCustomEmojiId: Long,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -427_591_885
    }

    public class ChatEventProfileAccentColorChanged(
        @JvmField
        public val oldProfileAccentColorId: Int,
        @JvmField
        public val oldProfileBackgroundCustomEmojiId: Long,
        @JvmField
        public val newProfileAccentColorId: Int,
        @JvmField
        public val newProfileBackgroundCustomEmojiId: Long,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -1_514_612_124
    }

    public class ChatEventHasProtectedContentToggled(
        @JvmField
        public val hasProtectedContent: Boolean,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -184_270_335
    }

    public class ChatEventInvitesToggled(
        @JvmField
        public val canInviteUsers: Boolean,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -62_548_373
    }

    public class ChatEventIsAllHistoryAvailableToggled(
        @JvmField
        public val isAllHistoryAvailable: Boolean,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -1_599_063_019
    }

    public class ChatEventHasAggressiveAntiSpamEnabledToggled(
        @JvmField
        public val hasAggressiveAntiSpamEnabled: Boolean,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -125_348_094
    }

    public class ChatEventSignMessagesToggled(
        @JvmField
        public val signMessages: Boolean,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -1_313_265_634
    }

    public class ChatEventShowMessageSenderToggled(
        @JvmField
        public val showMessageSender: Boolean,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -794_343_453
    }

    public class ChatEventInviteLinkEdited(
        @JvmField
        public val oldInviteLink: ChatInviteLink,
        @JvmField
        public val newInviteLink: ChatInviteLink,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -460_190_366
    }

    public class ChatEventInviteLinkRevoked(
        @JvmField
        public val inviteLink: ChatInviteLink,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -1_579_417_629
    }

    public class ChatEventInviteLinkDeleted(
        @JvmField
        public val inviteLink: ChatInviteLink,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -1_394_974_361
    }

    public class ChatEventVideoChatCreated(
        @JvmField
        public val groupCallId: Int,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 1_822_853_755
    }

    public class ChatEventVideoChatEnded(
        @JvmField
        public val groupCallId: Int,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 1_630_039_112
    }

    public class ChatEventVideoChatMuteNewParticipantsToggled(
        @JvmField
        public val muteNewParticipants: Boolean,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -126_547_970
    }

    public class ChatEventVideoChatParticipantIsMutedToggled(
        @JvmField
        public val participantId: MessageSender,
        @JvmField
        public val isMuted: Boolean,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 521_165_047
    }

    public class ChatEventVideoChatParticipantVolumeLevelChanged(
        @JvmField
        public val participantId: MessageSender,
        @JvmField
        public val volumeLevel: Int,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 1_131_385_534
    }

    public class ChatEventIsForumToggled(
        @JvmField
        public val isForum: Boolean,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 1_516_491_033
    }

    public class ChatEventForumTopicCreated(
        @JvmField
        public val topicInfo: ForumTopicInfo,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 2_005_269_314
    }

    public class ChatEventForumTopicEdited(
        @JvmField
        public val oldTopicInfo: ForumTopicInfo,
        @JvmField
        public val newTopicInfo: ForumTopicInfo,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 1_624_910_860
    }

    public class ChatEventForumTopicToggleIsClosed(
        @JvmField
        public val topicInfo: ForumTopicInfo,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -962_704_070
    }

    public class ChatEventForumTopicToggleIsHidden(
        @JvmField
        public val topicInfo: ForumTopicInfo,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -1_609_175_250
    }

    public class ChatEventForumTopicDeleted(
        @JvmField
        public val topicInfo: ForumTopicInfo,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -1_332_795_123
    }

    public class ChatEventForumTopicPinned(
        @JvmField
        public val oldTopicInfo: ForumTopicInfo?,
        @JvmField
        public val newTopicInfo: ForumTopicInfo?,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 2_143_626_222
    }

    public class ChatEventLogFilters(
        @JvmField
        public val messageEdits: Boolean,
        @JvmField
        public val messageDeletions: Boolean,
        @JvmField
        public val messagePins: Boolean,
        @JvmField
        public val memberJoins: Boolean,
        @JvmField
        public val memberLeaves: Boolean,
        @JvmField
        public val memberInvites: Boolean,
        @JvmField
        public val memberPromotions: Boolean,
        @JvmField
        public val memberRestrictions: Boolean,
        @JvmField
        public val infoChanges: Boolean,
        @JvmField
        public val settingChanges: Boolean,
        @JvmField
        public val inviteLinkChanges: Boolean,
        @JvmField
        public val videoChatChanges: Boolean,
        @JvmField
        public val forumChanges: Boolean,
        @JvmField
        public val subscriptionExtensions: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -1_032_965_711
    }

    public class ChatEvents(
        @JvmField
        public val events: Array<ChatEvent>,
    ) : Object() {
        override fun getConstructor(): Int = -585_329_664
    }

    public class ChatFolder(
        @JvmField
        public val name: ChatFolderName,
        @JvmField
        public val icon: ChatFolderIcon?,
        @JvmField
        public val colorId: Int,
        @JvmField
        public val isShareable: Boolean,
        @JvmField
        public val pinnedChatIds: LongArray,
        @JvmField
        public val includedChatIds: LongArray,
        @JvmField
        public val excludedChatIds: LongArray,
        @JvmField
        public val excludeMuted: Boolean,
        @JvmField
        public val excludeRead: Boolean,
        @JvmField
        public val excludeArchived: Boolean,
        @JvmField
        public val includeContacts: Boolean,
        @JvmField
        public val includeNonContacts: Boolean,
        @JvmField
        public val includeBots: Boolean,
        @JvmField
        public val includeGroups: Boolean,
        @JvmField
        public val includeChannels: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_596_164_696
    }

    public class ChatFolderIcon(
        @JvmField
        public val name: String,
    ) : Object() {
        override fun getConstructor(): Int = -146_104_090
    }

    public class ChatFolderInfo(
        @JvmField
        public val id: Int,
        @JvmField
        public val name: ChatFolderName,
        @JvmField
        public val icon: ChatFolderIcon,
        @JvmField
        public val colorId: Int,
        @JvmField
        public val isShareable: Boolean,
        @JvmField
        public val hasMyInviteLinks: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 815_535_117
    }

    public class ChatFolderInviteLink(
        @JvmField
        public val inviteLink: String,
        @JvmField
        public val name: String,
        @JvmField
        public val chatIds: LongArray,
    ) : Object() {
        override fun getConstructor(): Int = 493_969_661
    }

    public class ChatFolderInviteLinkInfo(
        @JvmField
        public val chatFolderInfo: ChatFolderInfo,
        @JvmField
        public val missingChatIds: LongArray,
        @JvmField
        public val addedChatIds: LongArray,
    ) : Object() {
        override fun getConstructor(): Int = 1_119_450_395
    }

    public class ChatFolderInviteLinks(
        @JvmField
        public val inviteLinks: Array<ChatFolderInviteLink>,
    ) : Object() {
        override fun getConstructor(): Int = 1_853_351_525
    }

    public class ChatFolderName(
        @JvmField
        public val text: FormattedText,
        @JvmField
        public val animateCustomEmoji: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -330_482_274
    }

    public class ChatInviteLink(
        @JvmField
        public val inviteLink: String,
        @JvmField
        public val name: String,
        @JvmField
        public val creatorUserId: Long,
        @JvmField
        public val date: Int,
        @JvmField
        public val editDate: Int,
        @JvmField
        public val expirationDate: Int,
        @JvmField
        public val subscriptionPricing: StarSubscriptionPricing?,
        @JvmField
        public val memberLimit: Int,
        @JvmField
        public val memberCount: Int,
        @JvmField
        public val expiredMemberCount: Int,
        @JvmField
        public val pendingJoinRequestCount: Int,
        @JvmField
        public val createsJoinRequest: Boolean,
        @JvmField
        public val isPrimary: Boolean,
        @JvmField
        public val isRevoked: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -957_651_664
    }

    public class ChatInviteLinkCount(
        @JvmField
        public val userId: Long,
        @JvmField
        public val inviteLinkCount: Int,
        @JvmField
        public val revokedInviteLinkCount: Int,
    ) : Object() {
        override fun getConstructor(): Int = -1_021_999_210
    }

    public class ChatInviteLinkCounts(
        @JvmField
        public val inviteLinkCounts: Array<ChatInviteLinkCount>,
    ) : Object() {
        override fun getConstructor(): Int = 920_326_637
    }

    public class ChatInviteLinkInfo(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val accessibleFor: Int,
        @JvmField
        public val type: InviteLinkChatType,
        @JvmField
        public val title: String,
        @JvmField
        public val photo: ChatPhotoInfo?,
        @JvmField
        public val accentColorId: Int,
        @JvmField
        public val description: String,
        @JvmField
        public val memberCount: Int,
        @JvmField
        public val memberUserIds: LongArray,
        @JvmField
        public val subscriptionInfo: ChatInviteLinkSubscriptionInfo?,
        @JvmField
        public val createsJoinRequest: Boolean,
        @JvmField
        public val isPublic: Boolean,
        @JvmField
        public val verificationStatus: VerificationStatus?,
    ) : Object() {
        override fun getConstructor(): Int = -1_145_310_535
    }

    public class ChatInviteLinkMember(
        @JvmField
        public val userId: Long,
        @JvmField
        public val joinedChatDate: Int,
        @JvmField
        public val viaChatFolderInviteLink: Boolean,
        @JvmField
        public val approverUserId: Long,
    ) : Object() {
        override fun getConstructor(): Int = 29_156_795
    }

    public class ChatInviteLinkMembers(
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val members: Array<ChatInviteLinkMember>,
    ) : Object() {
        override fun getConstructor(): Int = 315_635_051
    }

    public class ChatInviteLinkSubscriptionInfo(
        @JvmField
        public val pricing: StarSubscriptionPricing,
        @JvmField
        public val canReuse: Boolean,
        @JvmField
        public val formId: Long,
    ) : Object() {
        override fun getConstructor(): Int = 953_119_592
    }

    public class ChatInviteLinks(
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val inviteLinks: Array<ChatInviteLink>,
    ) : Object() {
        override fun getConstructor(): Int = 112_891_427
    }

    public class ChatJoinRequest(
        @JvmField
        public val userId: Long,
        @JvmField
        public val date: Int,
        @JvmField
        public val bio: String,
    ) : Object() {
        override fun getConstructor(): Int = 59_341_416
    }

    public class ChatJoinRequests(
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val requests: Array<ChatJoinRequest>,
    ) : Object() {
        override fun getConstructor(): Int = 1_291_680_519
    }

    public class ChatJoinRequestsInfo(
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val userIds: LongArray,
    ) : Object() {
        override fun getConstructor(): Int = 888_534_463
    }

    public abstract class ChatList() : Object()

    public class ChatListMain() : ChatList() {
        override fun getConstructor(): Int = -400_991_316
    }

    public class ChatListArchive() : ChatList() {
        override fun getConstructor(): Int = 362_770_115
    }

    public class ChatListFolder(
        @JvmField
        public val chatFolderId: Int,
    ) : ChatList() {
        override fun getConstructor(): Int = 385_760_856
    }

    public class ChatLists(
        @JvmField
        public val chatLists: Array<ChatList>,
    ) : Object() {
        override fun getConstructor(): Int = -258_292_771
    }

    public class ChatLocation(
        @JvmField
        public val location: Location,
        @JvmField
        public val address: String,
    ) : Object() {
        override fun getConstructor(): Int = -1_566_863_583
    }

    public class ChatMember(
        @JvmField
        public val memberId: MessageSender,
        @JvmField
        public val inviterUserId: Long,
        @JvmField
        public val joinedChatDate: Int,
        @JvmField
        public val status: ChatMemberStatus,
    ) : Object() {
        override fun getConstructor(): Int = 1_829_953_909
    }

    public abstract class ChatMemberStatus() : Object()

    public class ChatMemberStatusCreator(
        @JvmField
        public val customTitle: String,
        @JvmField
        public val isAnonymous: Boolean,
        @JvmField
        public val isMember: Boolean,
    ) : ChatMemberStatus() {
        override fun getConstructor(): Int = -160_019_714
    }

    public class ChatMemberStatusAdministrator(
        @JvmField
        public val customTitle: String,
        @JvmField
        public val canBeEdited: Boolean,
        @JvmField
        public val rights: ChatAdministratorRights,
    ) : ChatMemberStatus() {
        override fun getConstructor(): Int = -70_024_163
    }

    public class ChatMemberStatusMember(
        @JvmField
        public val memberUntilDate: Int,
    ) : ChatMemberStatus() {
        override fun getConstructor(): Int = -32_707_562
    }

    public class ChatMemberStatusRestricted(
        @JvmField
        public val isMember: Boolean,
        @JvmField
        public val restrictedUntilDate: Int,
        @JvmField
        public val permissions: ChatPermissions,
    ) : ChatMemberStatus() {
        override fun getConstructor(): Int = 1_661_432_998
    }

    public class ChatMemberStatusLeft() : ChatMemberStatus() {
        override fun getConstructor(): Int = -5_815_259
    }

    public class ChatMemberStatusBanned(
        @JvmField
        public val bannedUntilDate: Int,
    ) : ChatMemberStatus() {
        override fun getConstructor(): Int = -1_653_518_666
    }

    public class ChatMembers(
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val members: Array<ChatMember>,
    ) : Object() {
        override fun getConstructor(): Int = -497_558_622
    }

    public abstract class ChatMembersFilter() : Object()

    public class ChatMembersFilterContacts() : ChatMembersFilter() {
        override fun getConstructor(): Int = 1_774_485_671
    }

    public class ChatMembersFilterAdministrators() : ChatMembersFilter() {
        override fun getConstructor(): Int = -1_266_893_796
    }

    public class ChatMembersFilterMembers() : ChatMembersFilter() {
        override fun getConstructor(): Int = 670_504_342
    }

    public class ChatMembersFilterMention(
        @JvmField
        public val messageThreadId: Long,
    ) : ChatMembersFilter() {
        override fun getConstructor(): Int = 856_419_831
    }

    public class ChatMembersFilterRestricted() : ChatMembersFilter() {
        override fun getConstructor(): Int = 1_256_282_813
    }

    public class ChatMembersFilterBanned() : ChatMembersFilter() {
        override fun getConstructor(): Int = -1_863_102_648
    }

    public class ChatMembersFilterBots() : ChatMembersFilter() {
        override fun getConstructor(): Int = -1_422_567_288
    }

    public class ChatMessageSender(
        @JvmField
        public val sender: MessageSender,
        @JvmField
        public val needsPremium: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 760_590_010
    }

    public class ChatMessageSenders(
        @JvmField
        public val senders: Array<ChatMessageSender>,
    ) : Object() {
        override fun getConstructor(): Int = -1_866_230_970
    }

    public class ChatNotificationSettings(
        @JvmField
        public val useDefaultMuteFor: Boolean,
        @JvmField
        public val muteFor: Int,
        @JvmField
        public val useDefaultSound: Boolean,
        @JvmField
        public val soundId: Long,
        @JvmField
        public val useDefaultShowPreview: Boolean,
        @JvmField
        public val showPreview: Boolean,
        @JvmField
        public val useDefaultMuteStories: Boolean,
        @JvmField
        public val muteStories: Boolean,
        @JvmField
        public val useDefaultStorySound: Boolean,
        @JvmField
        public val storySoundId: Long,
        @JvmField
        public val useDefaultShowStoryPoster: Boolean,
        @JvmField
        public val showStoryPoster: Boolean,
        @JvmField
        public val useDefaultDisablePinnedMessageNotifications: Boolean,
        @JvmField
        public val disablePinnedMessageNotifications: Boolean,
        @JvmField
        public val useDefaultDisableMentionNotifications: Boolean,
        @JvmField
        public val disableMentionNotifications: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_459_533_846
    }

    public class ChatPermissions(
        @JvmField
        public val canSendBasicMessages: Boolean,
        @JvmField
        public val canSendAudios: Boolean,
        @JvmField
        public val canSendDocuments: Boolean,
        @JvmField
        public val canSendPhotos: Boolean,
        @JvmField
        public val canSendVideos: Boolean,
        @JvmField
        public val canSendVideoNotes: Boolean,
        @JvmField
        public val canSendVoiceNotes: Boolean,
        @JvmField
        public val canSendPolls: Boolean,
        @JvmField
        public val canSendOtherMessages: Boolean,
        @JvmField
        public val canAddLinkPreviews: Boolean,
        @JvmField
        public val canChangeInfo: Boolean,
        @JvmField
        public val canInviteUsers: Boolean,
        @JvmField
        public val canPinMessages: Boolean,
        @JvmField
        public val canCreateTopics: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -118_334_855
    }

    public class ChatPhoto(
        @JvmField
        public val id: Long,
        @JvmField
        public val addedDate: Int,
        @JvmField
        public val minithumbnail: Minithumbnail?,
        @JvmField
        public val sizes: Array<PhotoSize>,
        @JvmField
        public val animation: AnimatedChatPhoto?,
        @JvmField
        public val smallAnimation: AnimatedChatPhoto?,
        @JvmField
        public val sticker: ChatPhotoSticker?,
    ) : Object() {
        override fun getConstructor(): Int = -1_430_870_201
    }

    public class ChatPhotoInfo(
        @JvmField
        public val small: File,
        @JvmField
        public val big: File,
        @JvmField
        public val minithumbnail: Minithumbnail?,
        @JvmField
        public val hasAnimation: Boolean,
        @JvmField
        public val isPersonal: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 281_195_686
    }

    public class ChatPhotoSticker(
        @JvmField
        public val type: ChatPhotoStickerType,
        @JvmField
        public val backgroundFill: BackgroundFill,
    ) : Object() {
        override fun getConstructor(): Int = -1_459_387_485
    }

    public abstract class ChatPhotoStickerType() : Object()

    public class ChatPhotoStickerTypeRegularOrMask(
        @JvmField
        public val stickerSetId: Long,
        @JvmField
        public val stickerId: Long,
    ) : ChatPhotoStickerType() {
        override fun getConstructor(): Int = -415_147_620
    }

    public class ChatPhotoStickerTypeCustomEmoji(
        @JvmField
        public val customEmojiId: Long,
    ) : ChatPhotoStickerType() {
        override fun getConstructor(): Int = -266_224_943
    }

    public class ChatPhotos(
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val photos: Array<ChatPhoto>,
    ) : Object() {
        override fun getConstructor(): Int = -1_510_699_180
    }

    public class ChatPosition(
        @JvmField
        public val list: ChatList,
        @JvmField
        public val order: Long,
        @JvmField
        public val isPinned: Boolean,
        @JvmField
        public val source: ChatSource?,
    ) : Object() {
        override fun getConstructor(): Int = -622_557_355
    }

    public class ChatRevenueAmount(
        @JvmField
        public val cryptocurrency: String,
        @JvmField
        public val totalAmount: Long,
        @JvmField
        public val balanceAmount: Long,
        @JvmField
        public val availableAmount: Long,
        @JvmField
        public val withdrawalEnabled: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -1_505_178_024
    }

    public class ChatRevenueStatistics(
        @JvmField
        public val revenueByHourGraph: StatisticalGraph,
        @JvmField
        public val revenueGraph: StatisticalGraph,
        @JvmField
        public val revenueAmount: ChatRevenueAmount,
        @JvmField
        public val usdRate: Double,
    ) : Object() {
        override fun getConstructor(): Int = 1_667_438_779
    }

    public class ChatRevenueTransaction(
        @JvmField
        public val cryptocurrency: String,
        @JvmField
        public val cryptocurrencyAmount: Long,
        @JvmField
        public val type: ChatRevenueTransactionType,
    ) : Object() {
        override fun getConstructor(): Int = 80_192_767
    }

    public abstract class ChatRevenueTransactionType() : Object()

    public class ChatRevenueTransactionTypeEarnings(
        @JvmField
        public val startDate: Int,
        @JvmField
        public val endDate: Int,
    ) : ChatRevenueTransactionType() {
        override fun getConstructor(): Int = -400_776_056
    }

    public class ChatRevenueTransactionTypeWithdrawal(
        @JvmField
        public val withdrawalDate: Int,
        @JvmField
        public val provider: String,
        @JvmField
        public val state: RevenueWithdrawalState,
    ) : ChatRevenueTransactionType() {
        override fun getConstructor(): Int = 252_939_755
    }

    public class ChatRevenueTransactionTypeRefund(
        @JvmField
        public val refundDate: Int,
        @JvmField
        public val provider: String,
    ) : ChatRevenueTransactionType() {
        override fun getConstructor(): Int = 302_430_279
    }

    public class ChatRevenueTransactions(
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val transactions: Array<ChatRevenueTransaction>,
    ) : Object() {
        override fun getConstructor(): Int = -553_258_171
    }

    public abstract class ChatSource() : Object()

    public class ChatSourceMtprotoProxy() : ChatSource() {
        override fun getConstructor(): Int = 394_074_115
    }

    public class ChatSourcePublicServiceAnnouncement(
        @JvmField
        public val type: String,
        @JvmField
        public val text: String,
    ) : ChatSource() {
        override fun getConstructor(): Int = -328_571_244
    }

    public abstract class ChatStatistics() : Object()

    public class ChatStatisticsSupergroup(
        @JvmField
        public val period: DateRange,
        @JvmField
        public val memberCount: StatisticalValue,
        @JvmField
        public val messageCount: StatisticalValue,
        @JvmField
        public val viewerCount: StatisticalValue,
        @JvmField
        public val senderCount: StatisticalValue,
        @JvmField
        public val memberCountGraph: StatisticalGraph,
        @JvmField
        public val joinGraph: StatisticalGraph,
        @JvmField
        public val joinBySourceGraph: StatisticalGraph,
        @JvmField
        public val languageGraph: StatisticalGraph,
        @JvmField
        public val messageContentGraph: StatisticalGraph,
        @JvmField
        public val actionGraph: StatisticalGraph,
        @JvmField
        public val dayGraph: StatisticalGraph,
        @JvmField
        public val weekGraph: StatisticalGraph,
        @JvmField
        public val topSenders: Array<ChatStatisticsMessageSenderInfo>,
        @JvmField
        public val topAdministrators: Array<ChatStatisticsAdministratorActionsInfo>,
        @JvmField
        public val topInviters: Array<ChatStatisticsInviterInfo>,
    ) : ChatStatistics() {
        override fun getConstructor(): Int = -17_244_633
    }

    public class ChatStatisticsChannel(
        @JvmField
        public val period: DateRange,
        @JvmField
        public val memberCount: StatisticalValue,
        @JvmField
        public val meanMessageViewCount: StatisticalValue,
        @JvmField
        public val meanMessageShareCount: StatisticalValue,
        @JvmField
        public val meanMessageReactionCount: StatisticalValue,
        @JvmField
        public val meanStoryViewCount: StatisticalValue,
        @JvmField
        public val meanStoryShareCount: StatisticalValue,
        @JvmField
        public val meanStoryReactionCount: StatisticalValue,
        @JvmField
        public val enabledNotificationsPercentage: Double,
        @JvmField
        public val memberCountGraph: StatisticalGraph,
        @JvmField
        public val joinGraph: StatisticalGraph,
        @JvmField
        public val muteGraph: StatisticalGraph,
        @JvmField
        public val viewCountByHourGraph: StatisticalGraph,
        @JvmField
        public val viewCountBySourceGraph: StatisticalGraph,
        @JvmField
        public val joinBySourceGraph: StatisticalGraph,
        @JvmField
        public val languageGraph: StatisticalGraph,
        @JvmField
        public val messageInteractionGraph: StatisticalGraph,
        @JvmField
        public val messageReactionGraph: StatisticalGraph,
        @JvmField
        public val storyInteractionGraph: StatisticalGraph,
        @JvmField
        public val storyReactionGraph: StatisticalGraph,
        @JvmField
        public val instantViewInteractionGraph: StatisticalGraph,
        @JvmField
        public val recentInteractions: Array<ChatStatisticsInteractionInfo>,
    ) : ChatStatistics() {
        override fun getConstructor(): Int = -1_375_151_660
    }

    public class ChatStatisticsAdministratorActionsInfo(
        @JvmField
        public val userId: Long,
        @JvmField
        public val deletedMessageCount: Int,
        @JvmField
        public val bannedUserCount: Int,
        @JvmField
        public val restrictedUserCount: Int,
    ) : Object() {
        override fun getConstructor(): Int = -406_467_202
    }

    public class ChatStatisticsInteractionInfo(
        @JvmField
        public val objectType: ChatStatisticsObjectType,
        @JvmField
        public val viewCount: Int,
        @JvmField
        public val forwardCount: Int,
        @JvmField
        public val reactionCount: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_766_496_909
    }

    public class ChatStatisticsInviterInfo(
        @JvmField
        public val userId: Long,
        @JvmField
        public val addedMemberCount: Int,
    ) : Object() {
        override fun getConstructor(): Int = 629_396_619
    }

    public class ChatStatisticsMessageSenderInfo(
        @JvmField
        public val userId: Long,
        @JvmField
        public val sentMessageCount: Int,
        @JvmField
        public val averageCharacterCount: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_762_295_371
    }

    public abstract class ChatStatisticsObjectType() : Object()

    public class ChatStatisticsObjectTypeMessage(
        @JvmField
        public val messageId: Long,
    ) : ChatStatisticsObjectType() {
        override fun getConstructor(): Int = 1_872_700_662
    }

    public class ChatStatisticsObjectTypeStory(
        @JvmField
        public val storyId: Int,
    ) : ChatStatisticsObjectType() {
        override fun getConstructor(): Int = 364_575_152
    }

    public class ChatTheme(
        @JvmField
        public val name: String,
        @JvmField
        public val lightSettings: ThemeSettings,
        @JvmField
        public val darkSettings: ThemeSettings,
    ) : Object() {
        override fun getConstructor(): Int = -113_218_503
    }

    public abstract class ChatType() : Object()

    public class ChatTypePrivate(
        @JvmField
        public val userId: Long,
    ) : ChatType() {
        override fun getConstructor(): Int = 1_579_049_844
    }

    public class ChatTypeBasicGroup(
        @JvmField
        public val basicGroupId: Long,
    ) : ChatType() {
        override fun getConstructor(): Int = 973_884_508
    }

    public class ChatTypeSupergroup(
        @JvmField
        public val supergroupId: Long,
        @JvmField
        public val isChannel: Boolean,
    ) : ChatType() {
        override fun getConstructor(): Int = -1_472_570_774
    }

    public class ChatTypeSecret(
        @JvmField
        public val secretChatId: Int,
        @JvmField
        public val userId: Long,
    ) : ChatType() {
        override fun getConstructor(): Int = 862_366_513
    }

    public class Chats(
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val chatIds: LongArray,
    ) : Object() {
        override fun getConstructor(): Int = 1_809_654_812
    }

    public abstract class CheckChatUsernameResult() : Object()

    public class CheckChatUsernameResultOk() : CheckChatUsernameResult() {
        override fun getConstructor(): Int = -1_498_956_964
    }

    public class CheckChatUsernameResultUsernameInvalid() : CheckChatUsernameResult() {
        override fun getConstructor(): Int = -636_979_370
    }

    public class CheckChatUsernameResultUsernameOccupied() : CheckChatUsernameResult() {
        override fun getConstructor(): Int = 1_320_892_201
    }

    public class CheckChatUsernameResultUsernamePurchasable() : CheckChatUsernameResult() {
        override fun getConstructor(): Int = 5_885_529
    }

    public class CheckChatUsernameResultPublicChatsTooMany() : CheckChatUsernameResult() {
        override fun getConstructor(): Int = -659_264_388
    }

    public class CheckChatUsernameResultPublicGroupsUnavailable() : CheckChatUsernameResult() {
        override fun getConstructor(): Int = -51_833_641
    }

    public abstract class CheckStickerSetNameResult() : Object()

    public class CheckStickerSetNameResultOk() : CheckStickerSetNameResult() {
        override fun getConstructor(): Int = -1_404_308_904
    }

    public class CheckStickerSetNameResultNameInvalid() : CheckStickerSetNameResult() {
        override fun getConstructor(): Int = 177_992_244
    }

    public class CheckStickerSetNameResultNameOccupied() : CheckStickerSetNameResult() {
        override fun getConstructor(): Int = 1_012_980_872
    }

    public class CloseBirthdayUser(
        @JvmField
        public val userId: Long,
        @JvmField
        public val birthdate: Birthdate,
    ) : Object() {
        override fun getConstructor(): Int = -2_147_067_410
    }

    public class ClosedVectorPath(
        @JvmField
        public val commands: Array<VectorPathCommand>,
    ) : Object() {
        override fun getConstructor(): Int = 589_951_657
    }

    public class CollectibleItemInfo(
        @JvmField
        public val purchaseDate: Int,
        @JvmField
        public val currency: String,
        @JvmField
        public val amount: Long,
        @JvmField
        public val cryptocurrency: String,
        @JvmField
        public val cryptocurrencyAmount: Long,
        @JvmField
        public val url: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_460_640_717
    }

    public abstract class CollectibleItemType() : Object()

    public class CollectibleItemTypeUsername(
        @JvmField
        public val username: String,
    ) : CollectibleItemType() {
        override fun getConstructor(): Int = 458_680_273
    }

    public class CollectibleItemTypePhoneNumber(
        @JvmField
        public val phoneNumber: String,
    ) : CollectibleItemType() {
        override fun getConstructor(): Int = 1_256_251_714
    }

    public class ConnectedAffiliateProgram(
        @JvmField
        public val url: String,
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val parameters: AffiliateProgramParameters,
        @JvmField
        public val connectionDate: Int,
        @JvmField
        public val isDisconnected: Boolean,
        @JvmField
        public val userCount: Long,
        @JvmField
        public val revenueStarCount: Long,
    ) : Object() {
        override fun getConstructor(): Int = 1_488_942_101
    }

    public class ConnectedAffiliatePrograms(
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val programs: Array<ConnectedAffiliateProgram>,
        @JvmField
        public val nextOffset: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_505_880_847
    }

    public class ConnectedWebsite(
        @JvmField
        public val id: Long,
        @JvmField
        public val domainName: String,
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val browser: String,
        @JvmField
        public val platform: String,
        @JvmField
        public val logInDate: Int,
        @JvmField
        public val lastActiveDate: Int,
        @JvmField
        public val ipAddress: String,
        @JvmField
        public val location: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_978_115_978
    }

    public class ConnectedWebsites(
        @JvmField
        public val websites: Array<ConnectedWebsite>,
    ) : Object() {
        override fun getConstructor(): Int = -1_727_949_694
    }

    public abstract class ConnectionState() : Object()

    public class ConnectionStateWaitingForNetwork() : ConnectionState() {
        override fun getConstructor(): Int = 1_695_405_912
    }

    public class ConnectionStateConnectingToProxy() : ConnectionState() {
        override fun getConstructor(): Int = -93_187_239
    }

    public class ConnectionStateConnecting() : ConnectionState() {
        override fun getConstructor(): Int = -1_298_400_670
    }

    public class ConnectionStateUpdating() : ConnectionState() {
        override fun getConstructor(): Int = -188_104_009
    }

    public class ConnectionStateReady() : ConnectionState() {
        override fun getConstructor(): Int = 48_608_492
    }

    public class Contact(
        @JvmField
        public val phoneNumber: String,
        @JvmField
        public val firstName: String,
        @JvmField
        public val lastName: String,
        @JvmField
        public val vcard: String,
        @JvmField
        public val userId: Long,
    ) : Object() {
        override fun getConstructor(): Int = -1_993_844_876
    }

    public class Count(
        @JvmField
        public val count: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_295_577_348
    }

    public class Countries(
        @JvmField
        public val countries: Array<CountryInfo>,
    ) : Object() {
        override fun getConstructor(): Int = 1_854_211_813
    }

    public class CountryInfo(
        @JvmField
        public val countryCode: String,
        @JvmField
        public val name: String,
        @JvmField
        public val englishName: String,
        @JvmField
        public val isHidden: Boolean,
        @JvmField
        public val callingCodes: Array<String>,
    ) : Object() {
        override fun getConstructor(): Int = 1_617_195_722
    }

    public class CreatedBasicGroupChat(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val failedToAddMembers: FailedToAddMembers,
    ) : Object() {
        override fun getConstructor(): Int = -20_417_068
    }

    public class CurrentWeather(
        @JvmField
        public val temperature: Double,
        @JvmField
        public val emoji: String,
    ) : Object() {
        override fun getConstructor(): Int = -355_555_136
    }

    public class CustomRequestResult(
        @JvmField
        public val result: String,
    ) : Object() {
        override fun getConstructor(): Int = -2_009_960_452
    }

    public class Data(
        @JvmField
        public val data: ByteArray,
    ) : Object() {
        override fun getConstructor(): Int = 221_197_337
    }

    public class DatabaseStatistics(
        @JvmField
        public val statistics: String,
    ) : Object() {
        override fun getConstructor(): Int = -1_123_912_880
    }

    public class Date(
        @JvmField
        public val day: Int,
        @JvmField
        public val month: Int,
        @JvmField
        public val year: Int,
    ) : Object() {
        override fun getConstructor(): Int = -277_956_960
    }

    public class DateRange(
        @JvmField
        public val startDate: Int,
        @JvmField
        public val endDate: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_360_333_926
    }

    public class DatedFile(
        @JvmField
        public val file: File,
        @JvmField
        public val date: Int,
    ) : Object() {
        override fun getConstructor(): Int = -1_840_795_491
    }

    public class DeepLinkInfo(
        @JvmField
        public val text: FormattedText,
        @JvmField
        public val needUpdateApplication: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_864_081_662
    }

    public abstract class DeviceToken() : Object()

    public class DeviceTokenFirebaseCloudMessaging(
        @JvmField
        public val token: String,
        @JvmField
        public val encrypt: Boolean,
    ) : DeviceToken() {
        override fun getConstructor(): Int = -797_881_849
    }

    public class DeviceTokenApplePush(
        @JvmField
        public val deviceToken: String,
        @JvmField
        public val isAppSandbox: Boolean,
    ) : DeviceToken() {
        override fun getConstructor(): Int = 387_541_955
    }

    public class DeviceTokenApplePushVoIP(
        @JvmField
        public val deviceToken: String,
        @JvmField
        public val isAppSandbox: Boolean,
        @JvmField
        public val encrypt: Boolean,
    ) : DeviceToken() {
        override fun getConstructor(): Int = 804_275_689
    }

    public class DeviceTokenWindowsPush(
        @JvmField
        public val accessToken: String,
    ) : DeviceToken() {
        override fun getConstructor(): Int = -1_410_514_289
    }

    public class DeviceTokenMicrosoftPush(
        @JvmField
        public val channelUri: String,
    ) : DeviceToken() {
        override fun getConstructor(): Int = 1_224_269_900
    }

    public class DeviceTokenMicrosoftPushVoIP(
        @JvmField
        public val channelUri: String,
    ) : DeviceToken() {
        override fun getConstructor(): Int = -785_603_759
    }

    public class DeviceTokenWebPush(
        @JvmField
        public val endpoint: String,
        @JvmField
        public val p256dhBase64url: String,
        @JvmField
        public val authBase64url: String,
    ) : DeviceToken() {
        override fun getConstructor(): Int = -1_694_507_273
    }

    public class DeviceTokenSimplePush(
        @JvmField
        public val endpoint: String,
    ) : DeviceToken() {
        override fun getConstructor(): Int = 49_584_736
    }

    public class DeviceTokenUbuntuPush(
        @JvmField
        public val token: String,
    ) : DeviceToken() {
        override fun getConstructor(): Int = 1_782_320_422
    }

    public class DeviceTokenBlackBerryPush(
        @JvmField
        public val token: String,
    ) : DeviceToken() {
        override fun getConstructor(): Int = 1_559_167_234
    }

    public class DeviceTokenTizenPush(
        @JvmField
        public val regId: String,
    ) : DeviceToken() {
        override fun getConstructor(): Int = -1_359_947_213
    }

    public class DeviceTokenHuaweiPush(
        @JvmField
        public val token: String,
        @JvmField
        public val encrypt: Boolean,
    ) : DeviceToken() {
        override fun getConstructor(): Int = 1_989_103_142
    }

    public abstract class DiceStickers() : Object()

    public class DiceStickersRegular(
        @JvmField
        public val sticker: Sticker,
    ) : DiceStickers() {
        override fun getConstructor(): Int = -740_299_570
    }

    public class DiceStickersSlotMachine(
        @JvmField
        public val background: Sticker,
        @JvmField
        public val lever: Sticker,
        @JvmField
        public val leftReel: Sticker,
        @JvmField
        public val centerReel: Sticker,
        @JvmField
        public val rightReel: Sticker,
    ) : DiceStickers() {
        override fun getConstructor(): Int = -375_223_124
    }

    public class Document(
        @JvmField
        public val fileName: String,
        @JvmField
        public val mimeType: String,
        @JvmField
        public val minithumbnail: Minithumbnail?,
        @JvmField
        public val thumbnail: Thumbnail?,
        @JvmField
        public val document: File,
    ) : Object() {
        override fun getConstructor(): Int = -1_357_271_080
    }

    public class DownloadedFileCounts(
        @JvmField
        public val activeCount: Int,
        @JvmField
        public val pausedCount: Int,
        @JvmField
        public val completedCount: Int,
    ) : Object() {
        override fun getConstructor(): Int = -1_973_999_550
    }

    public class DraftMessage(
        @JvmField
        public val replyTo: InputMessageReplyTo?,
        @JvmField
        public val date: Int,
        @JvmField
        public val inputMessageText: InputMessageContent,
        @JvmField
        public val effectId: Long,
    ) : Object() {
        override fun getConstructor(): Int = 1_125_328_749
    }

    public abstract class EmailAddressAuthentication() : Object()

    public class EmailAddressAuthenticationCode(
        @JvmField
        public val code: String,
    ) : EmailAddressAuthentication() {
        override fun getConstructor(): Int = -993_257_022
    }

    public class EmailAddressAuthenticationAppleId(
        @JvmField
        public val token: String,
    ) : EmailAddressAuthentication() {
        override fun getConstructor(): Int = 633_948_265
    }

    public class EmailAddressAuthenticationGoogleId(
        @JvmField
        public val token: String,
    ) : EmailAddressAuthentication() {
        override fun getConstructor(): Int = -19_142_846
    }

    public class EmailAddressAuthenticationCodeInfo(
        @JvmField
        public val emailAddressPattern: String,
        @JvmField
        public val length: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_151_066_659
    }

    public abstract class EmailAddressResetState() : Object()

    public class EmailAddressResetStateAvailable(
        @JvmField
        public val waitPeriod: Int,
    ) : EmailAddressResetState() {
        override fun getConstructor(): Int = -1_917_177_600
    }

    public class EmailAddressResetStatePending(
        @JvmField
        public val resetIn: Int,
    ) : EmailAddressResetState() {
        override fun getConstructor(): Int = -1_885_966_805
    }

    public class EmojiCategories(
        @JvmField
        public val categories: Array<EmojiCategory>,
    ) : Object() {
        override fun getConstructor(): Int = -1_455_387_824
    }

    public class EmojiCategory(
        @JvmField
        public val name: String,
        @JvmField
        public val icon: Sticker,
        @JvmField
        public val source: EmojiCategorySource,
        @JvmField
        public val isGreeting: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 571_335_919
    }

    public abstract class EmojiCategorySource() : Object()

    public class EmojiCategorySourceSearch(
        @JvmField
        public val emojis: Array<String>,
    ) : EmojiCategorySource() {
        override fun getConstructor(): Int = -453_260_262
    }

    public class EmojiCategorySourcePremium() : EmojiCategorySource() {
        override fun getConstructor(): Int = -1_932_358_388
    }

    public abstract class EmojiCategoryType() : Object()

    public class EmojiCategoryTypeDefault() : EmojiCategoryType() {
        override fun getConstructor(): Int = 1_188_782_699
    }

    public class EmojiCategoryTypeRegularStickers() : EmojiCategoryType() {
        override fun getConstructor(): Int = -1_337_484_846
    }

    public class EmojiCategoryTypeEmojiStatus() : EmojiCategoryType() {
        override fun getConstructor(): Int = 1_381_282_631
    }

    public class EmojiCategoryTypeChatPhoto() : EmojiCategoryType() {
        override fun getConstructor(): Int = 1_059_063_081
    }

    public class EmojiKeyword(
        @JvmField
        public val emoji: String,
        @JvmField
        public val keyword: String,
    ) : Object() {
        override fun getConstructor(): Int = -2_112_285_985
    }

    public class EmojiKeywords(
        @JvmField
        public val emojiKeywords: Array<EmojiKeyword>,
    ) : Object() {
        override fun getConstructor(): Int = 689_723_339
    }

    public class EmojiReaction(
        @JvmField
        public val emoji: String,
        @JvmField
        public val title: String,
        @JvmField
        public val isActive: Boolean,
        @JvmField
        public val staticIcon: Sticker,
        @JvmField
        public val appearAnimation: Sticker,
        @JvmField
        public val selectAnimation: Sticker,
        @JvmField
        public val activateAnimation: Sticker,
        @JvmField
        public val effectAnimation: Sticker,
        @JvmField
        public val aroundAnimation: Sticker?,
        @JvmField
        public val centerAnimation: Sticker?,
    ) : Object() {
        override fun getConstructor(): Int = 1_616_063_583
    }

    public class EmojiStatus(
        @JvmField
        public val type: EmojiStatusType,
        @JvmField
        public val expirationDate: Int,
    ) : Object() {
        override fun getConstructor(): Int = 973_424_912
    }

    public class EmojiStatusCustomEmojis(
        @JvmField
        public val customEmojiIds: LongArray,
    ) : Object() {
        override fun getConstructor(): Int = 917_123_337
    }

    public abstract class EmojiStatusType() : Object()

    public class EmojiStatusTypeCustomEmoji(
        @JvmField
        public val customEmojiId: Long,
    ) : EmojiStatusType() {
        override fun getConstructor(): Int = -1_666_780_939
    }

    public class EmojiStatusTypeUpgradedGift(
        @JvmField
        public val upgradedGiftId: Long,
        @JvmField
        public val giftTitle: String,
        @JvmField
        public val giftName: String,
        @JvmField
        public val modelCustomEmojiId: Long,
        @JvmField
        public val symbolCustomEmojiId: Long,
        @JvmField
        public val backdropColors: UpgradedGiftBackdropColors,
    ) : EmojiStatusType() {
        override fun getConstructor(): Int = -837_921_804
    }

    public class EmojiStatuses(
        @JvmField
        public val emojiStatuses: Array<EmojiStatus>,
    ) : Object() {
        override fun getConstructor(): Int = 1_186_104_146
    }

    public class Emojis(
        @JvmField
        public val emojis: Array<String>,
    ) : Object() {
        override fun getConstructor(): Int = 950_339_552
    }

    public class EncryptedCredentials(
        @JvmField
        public val data: ByteArray,
        @JvmField
        public val hash: ByteArray,
        @JvmField
        public val secret: ByteArray,
    ) : Object() {
        override fun getConstructor(): Int = 1_331_106_766
    }

    public class EncryptedPassportElement(
        @JvmField
        public val type: PassportElementType,
        @JvmField
        public val data: ByteArray,
        @JvmField
        public val frontSide: DatedFile,
        @JvmField
        public val reverseSide: DatedFile?,
        @JvmField
        public val selfie: DatedFile?,
        @JvmField
        public val translation: Array<DatedFile>,
        @JvmField
        public val files: Array<DatedFile>,
        @JvmField
        public val value: String,
        @JvmField
        public val hash: String,
    ) : Object() {
        override fun getConstructor(): Int = 2_002_386_193
    }

    public class Error(
        @JvmField
        public val code: Int,
        @JvmField
        public val message: String,
    ) : Object() {
        override fun getConstructor(): Int = -1_679_978_726
    }

    public class FactCheck(
        @JvmField
        public val text: FormattedText,
        @JvmField
        public val countryCode: String,
    ) : Object() {
        override fun getConstructor(): Int = -1_048_184_552
    }

    public class FailedToAddMember(
        @JvmField
        public val userId: Long,
        @JvmField
        public val premiumWouldAllowInvite: Boolean,
        @JvmField
        public val premiumRequiredToSendMessages: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -282_891_070
    }

    public class FailedToAddMembers(
        @JvmField
        public val failedToAddMembers: Array<FailedToAddMember>,
    ) : Object() {
        override fun getConstructor(): Int = -272_587_152
    }

    public class File(
        @JvmField
        public val id: Int,
        @JvmField
        public val size: Long,
        @JvmField
        public val expectedSize: Long,
        @JvmField
        public val local: LocalFile,
        @JvmField
        public val remote: RemoteFile,
    ) : Object() {
        override fun getConstructor(): Int = 1_263_291_956
    }

    public class FileDownload(
        @JvmField
        public val fileId: Int,
        @JvmField
        public val message: Message,
        @JvmField
        public val addDate: Int,
        @JvmField
        public val completeDate: Int,
        @JvmField
        public val isPaused: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -2_092_100_780
    }

    public class FileDownloadedPrefixSize(
        @JvmField
        public val size: Long,
    ) : Object() {
        override fun getConstructor(): Int = -2_015_205_381
    }

    public abstract class FileType() : Object()

    public class FileTypeNone() : FileType() {
        override fun getConstructor(): Int = 2_003_009_189
    }

    public class FileTypeAnimation() : FileType() {
        override fun getConstructor(): Int = -290_816_582
    }

    public class FileTypeAudio() : FileType() {
        override fun getConstructor(): Int = -709_112_160
    }

    public class FileTypeDocument() : FileType() {
        override fun getConstructor(): Int = -564_722_929
    }

    public class FileTypeNotificationSound() : FileType() {
        override fun getConstructor(): Int = -1_020_289_271
    }

    public class FileTypePhoto() : FileType() {
        override fun getConstructor(): Int = -1_718_914_651
    }

    public class FileTypePhotoStory() : FileType() {
        override fun getConstructor(): Int = 2_018_995_956
    }

    public class FileTypeProfilePhoto() : FileType() {
        override fun getConstructor(): Int = 1_795_089_315
    }

    public class FileTypeSecret() : FileType() {
        override fun getConstructor(): Int = -1_871_899_401
    }

    public class FileTypeSecretThumbnail() : FileType() {
        override fun getConstructor(): Int = -1_401_326_026
    }

    public class FileTypeSecure() : FileType() {
        override fun getConstructor(): Int = -1_419_133_146
    }

    public class FileTypeSelfDestructingPhoto() : FileType() {
        override fun getConstructor(): Int = 2_077_176_475
    }

    public class FileTypeSelfDestructingVideo() : FileType() {
        override fun getConstructor(): Int = -1_223_900_123
    }

    public class FileTypeSelfDestructingVideoNote() : FileType() {
        override fun getConstructor(): Int = 1_495_274_177
    }

    public class FileTypeSelfDestructingVoiceNote() : FileType() {
        override fun getConstructor(): Int = 1_691_409_181
    }

    public class FileTypeSticker() : FileType() {
        override fun getConstructor(): Int = 475_233_385
    }

    public class FileTypeThumbnail() : FileType() {
        override fun getConstructor(): Int = -12_443_298
    }

    public class FileTypeUnknown() : FileType() {
        override fun getConstructor(): Int = -2_011_566_768
    }

    public class FileTypeVideo() : FileType() {
        override fun getConstructor(): Int = 1_430_816_539
    }

    public class FileTypeVideoNote() : FileType() {
        override fun getConstructor(): Int = -518_412_385
    }

    public class FileTypeVideoStory() : FileType() {
        override fun getConstructor(): Int = -2_146_754_143
    }

    public class FileTypeVoiceNote() : FileType() {
        override fun getConstructor(): Int = -588_681_661
    }

    public class FileTypeWallpaper() : FileType() {
        override fun getConstructor(): Int = 1_854_930_076
    }

    public abstract class FirebaseAuthenticationSettings() : Object()

    public class FirebaseAuthenticationSettingsAndroid() : FirebaseAuthenticationSettings() {
        override fun getConstructor(): Int = -1_771_112_932
    }

    public class FirebaseAuthenticationSettingsIos(
        @JvmField
        public val deviceToken: String,
        @JvmField
        public val isAppSandbox: Boolean,
    ) : FirebaseAuthenticationSettings() {
        override fun getConstructor(): Int = 222_930_116
    }

    public abstract class FirebaseDeviceVerificationParameters() : Object()

    public class FirebaseDeviceVerificationParametersSafetyNet(
        @JvmField
        public val nonce: ByteArray,
    ) : FirebaseDeviceVerificationParameters() {
        override fun getConstructor(): Int = 731_296_497
    }

    public class FirebaseDeviceVerificationParametersPlayIntegrity(
        @JvmField
        public val nonce: String,
        @JvmField
        public val cloudProjectNumber: Long,
    ) : FirebaseDeviceVerificationParameters() {
        override fun getConstructor(): Int = -889_936_502
    }

    public class FormattedText(
        @JvmField
        public val text: String,
        @JvmField
        public val entities: Array<TextEntity>,
    ) : Object() {
        override fun getConstructor(): Int = -252_624_564
    }

    public class ForumTopic(
        @JvmField
        public val info: ForumTopicInfo,
        @JvmField
        public val lastMessage: Message?,
        @JvmField
        public val order: Long,
        @JvmField
        public val isPinned: Boolean,
        @JvmField
        public val unreadCount: Int,
        @JvmField
        public val lastReadInboxMessageId: Long,
        @JvmField
        public val lastReadOutboxMessageId: Long,
        @JvmField
        public val unreadMentionCount: Int,
        @JvmField
        public val unreadReactionCount: Int,
        @JvmField
        public val notificationSettings: ChatNotificationSettings,
        @JvmField
        public val draftMessage: DraftMessage?,
    ) : Object() {
        override fun getConstructor(): Int = -2_094_608_976
    }

    public class ForumTopicIcon(
        @JvmField
        public val color: Int,
        @JvmField
        public val customEmojiId: Long,
    ) : Object() {
        override fun getConstructor(): Int = -818_765_421
    }

    public class ForumTopicInfo(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageThreadId: Long,
        @JvmField
        public val name: String,
        @JvmField
        public val icon: ForumTopicIcon,
        @JvmField
        public val creationDate: Int,
        @JvmField
        public val creatorId: MessageSender,
        @JvmField
        public val isGeneral: Boolean,
        @JvmField
        public val isOutgoing: Boolean,
        @JvmField
        public val isClosed: Boolean,
        @JvmField
        public val isHidden: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -654_857_606
    }

    public class ForumTopics(
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val topics: Array<ForumTopic>,
        @JvmField
        public val nextOffsetDate: Int,
        @JvmField
        public val nextOffsetMessageId: Long,
        @JvmField
        public val nextOffsetMessageThreadId: Long,
    ) : Object() {
        override fun getConstructor(): Int = 732_819_537
    }

    public class ForwardSource(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val senderId: MessageSender?,
        @JvmField
        public val senderName: String,
        @JvmField
        public val date: Int,
        @JvmField
        public val isOutgoing: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_795_337_929
    }

    public class FoundAffiliateProgram(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val info: AffiliateProgramInfo,
    ) : Object() {
        override fun getConstructor(): Int = -966_565_242
    }

    public class FoundAffiliatePrograms(
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val programs: Array<FoundAffiliateProgram>,
        @JvmField
        public val nextOffset: String,
    ) : Object() {
        override fun getConstructor(): Int = 186_317_057
    }

    public class FoundChatBoosts(
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val boosts: Array<ChatBoost>,
        @JvmField
        public val nextOffset: String,
    ) : Object() {
        override fun getConstructor(): Int = 51_457_680
    }

    public class FoundChatMessages(
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val messages: Array<Message>,
        @JvmField
        public val nextFromMessageId: Long,
    ) : Object() {
        override fun getConstructor(): Int = 427_484_196
    }

    public class FoundFileDownloads(
        @JvmField
        public val totalCounts: DownloadedFileCounts,
        @JvmField
        public val files: Array<FileDownload>,
        @JvmField
        public val nextOffset: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_395_890_392
    }

    public class FoundMessages(
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val messages: Array<Message>,
        @JvmField
        public val nextOffset: String,
    ) : Object() {
        override fun getConstructor(): Int = -529_809_608
    }

    public class FoundPosition(
        @JvmField
        public val position: Int,
    ) : Object() {
        override fun getConstructor(): Int = -1_886_724_216
    }

    public class FoundPositions(
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val positions: IntArray,
    ) : Object() {
        override fun getConstructor(): Int = -80_518_368
    }

    public class FoundStories(
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val stories: Array<Story>,
        @JvmField
        public val nextOffset: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_678_513_512
    }

    public class FoundUsers(
        @JvmField
        public val userIds: LongArray,
        @JvmField
        public val nextOffset: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_150_570_075
    }

    public class FoundWebApp(
        @JvmField
        public val webApp: WebApp,
        @JvmField
        public val requestWriteAccess: Boolean,
        @JvmField
        public val skipConfirmation: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -290_926_562
    }

    public class Game(
        @JvmField
        public val id: Long,
        @JvmField
        public val shortName: String,
        @JvmField
        public val title: String,
        @JvmField
        public val text: FormattedText,
        @JvmField
        public val description: String,
        @JvmField
        public val photo: Photo,
        @JvmField
        public val animation: Animation?,
    ) : Object() {
        override fun getConstructor(): Int = -1_565_597_752
    }

    public class GameHighScore(
        @JvmField
        public val position: Int,
        @JvmField
        public val userId: Long,
        @JvmField
        public val score: Int,
    ) : Object() {
        override fun getConstructor(): Int = 342_871_838
    }

    public class GameHighScores(
        @JvmField
        public val scores: Array<GameHighScore>,
    ) : Object() {
        override fun getConstructor(): Int = -725_770_727
    }

    public class Gift(
        @JvmField
        public val id: Long,
        @JvmField
        public val sticker: Sticker,
        @JvmField
        public val starCount: Long,
        @JvmField
        public val defaultSellStarCount: Long,
        @JvmField
        public val upgradeStarCount: Long,
        @JvmField
        public val isForBirthday: Boolean,
        @JvmField
        public val remainingCount: Int,
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val firstSendDate: Int,
        @JvmField
        public val lastSendDate: Int,
    ) : Object() {
        override fun getConstructor(): Int = 2_096_710_701
    }

    public class GiftSettings(
        @JvmField
        public val showGiftButton: Boolean,
        @JvmField
        public val acceptedGiftTypes: AcceptedGiftTypes,
    ) : Object() {
        override fun getConstructor(): Int = 45_783_168
    }

    public class GiftUpgradePreview(
        @JvmField
        public val models: Array<UpgradedGiftModel>,
        @JvmField
        public val symbols: Array<UpgradedGiftSymbol>,
        @JvmField
        public val backdrops: Array<UpgradedGiftBackdrop>,
    ) : Object() {
        override fun getConstructor(): Int = 729_908_218
    }

    public class Gifts(
        @JvmField
        public val gifts: Array<Gift>,
    ) : Object() {
        override fun getConstructor(): Int = 1_652_323_382
    }

    public abstract class GiveawayInfo() : Object()

    public class GiveawayInfoOngoing(
        @JvmField
        public val creationDate: Int,
        @JvmField
        public val status: GiveawayParticipantStatus,
        @JvmField
        public val isEnded: Boolean,
    ) : GiveawayInfo() {
        override fun getConstructor(): Int = 1_649_336_400
    }

    public class GiveawayInfoCompleted(
        @JvmField
        public val creationDate: Int,
        @JvmField
        public val actualWinnersSelectionDate: Int,
        @JvmField
        public val wasRefunded: Boolean,
        @JvmField
        public val isWinner: Boolean,
        @JvmField
        public val winnerCount: Int,
        @JvmField
        public val activationCount: Int,
        @JvmField
        public val giftCode: String,
        @JvmField
        public val wonStarCount: Long,
    ) : GiveawayInfo() {
        override fun getConstructor(): Int = 848_085_852
    }

    public class GiveawayParameters(
        @JvmField
        public val boostedChatId: Long,
        @JvmField
        public val additionalChatIds: LongArray,
        @JvmField
        public val winnersSelectionDate: Int,
        @JvmField
        public val onlyNewMembers: Boolean,
        @JvmField
        public val hasPublicWinners: Boolean,
        @JvmField
        public val countryCodes: Array<String>,
        @JvmField
        public val prizeDescription: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_171_549_354
    }

    public abstract class GiveawayParticipantStatus() : Object()

    public class GiveawayParticipantStatusEligible() : GiveawayParticipantStatus() {
        override fun getConstructor(): Int = 304_799_383
    }

    public class GiveawayParticipantStatusParticipating() : GiveawayParticipantStatus() {
        override fun getConstructor(): Int = 492_036_975
    }

    public class GiveawayParticipantStatusAlreadyWasMember(
        @JvmField
        public val joinedChatDate: Int,
    ) : GiveawayParticipantStatus() {
        override fun getConstructor(): Int = 301_577_632
    }

    public class GiveawayParticipantStatusAdministrator(
        @JvmField
        public val chatId: Long,
    ) : GiveawayParticipantStatus() {
        override fun getConstructor(): Int = -934_593_931
    }

    public class GiveawayParticipantStatusDisallowedCountry(
        @JvmField
        public val userCountryCode: String,
    ) : GiveawayParticipantStatus() {
        override fun getConstructor(): Int = 1_879_794_779
    }

    public abstract class GiveawayPrize() : Object()

    public class GiveawayPrizePremium(
        @JvmField
        public val monthCount: Int,
    ) : GiveawayPrize() {
        override fun getConstructor(): Int = 454_224_248
    }

    public class GiveawayPrizeStars(
        @JvmField
        public val starCount: Long,
    ) : GiveawayPrize() {
        override fun getConstructor(): Int = -1_790_173_276
    }

    public class GroupCall(
        @JvmField
        public val id: Int,
        @JvmField
        public val title: String,
        @JvmField
        public val inviteLink: String,
        @JvmField
        public val scheduledStartDate: Int,
        @JvmField
        public val enabledStartNotification: Boolean,
        @JvmField
        public val isActive: Boolean,
        @JvmField
        public val isVideoChat: Boolean,
        @JvmField
        public val isRtmpStream: Boolean,
        @JvmField
        public val isJoined: Boolean,
        @JvmField
        public val needRejoin: Boolean,
        @JvmField
        public val isOwned: Boolean,
        @JvmField
        public val canBeManaged: Boolean,
        @JvmField
        public val participantCount: Int,
        @JvmField
        public val hasHiddenListeners: Boolean,
        @JvmField
        public val loadedAllParticipants: Boolean,
        @JvmField
        public val recentSpeakers: Array<GroupCallRecentSpeaker>,
        @JvmField
        public val isMyVideoEnabled: Boolean,
        @JvmField
        public val isMyVideoPaused: Boolean,
        @JvmField
        public val canEnableVideo: Boolean,
        @JvmField
        public val muteNewParticipants: Boolean,
        @JvmField
        public val canToggleMuteNewParticipants: Boolean,
        @JvmField
        public val recordDuration: Int,
        @JvmField
        public val isVideoRecorded: Boolean,
        @JvmField
        public val duration: Int,
    ) : Object() {
        override fun getConstructor(): Int = -144_438_687
    }

    public abstract class GroupCallDataChannel() : Object()

    public class GroupCallDataChannelMain() : GroupCallDataChannel() {
        override fun getConstructor(): Int = -32_177_779
    }

    public class GroupCallDataChannelScreenSharing() : GroupCallDataChannel() {
        override fun getConstructor(): Int = -601_649_103
    }

    public class GroupCallId(
        @JvmField
        public val id: Int,
    ) : Object() {
        override fun getConstructor(): Int = 350_534_469
    }

    public class GroupCallInfo(
        @JvmField
        public val groupCallId: Int,
        @JvmField
        public val joinPayload: String,
    ) : Object() {
        override fun getConstructor(): Int = 892_575_956
    }

    public class GroupCallJoinParameters(
        @JvmField
        public val audioSourceId: Int,
        @JvmField
        public val payload: String,
        @JvmField
        public val isMuted: Boolean,
        @JvmField
        public val isMyVideoEnabled: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_763_438_054
    }

    public class GroupCallParticipant(
        @JvmField
        public val participantId: MessageSender,
        @JvmField
        public val audioSourceId: Int,
        @JvmField
        public val screenSharingAudioSourceId: Int,
        @JvmField
        public val videoInfo: GroupCallParticipantVideoInfo?,
        @JvmField
        public val screenSharingVideoInfo: GroupCallParticipantVideoInfo?,
        @JvmField
        public val bio: String,
        @JvmField
        public val isCurrentUser: Boolean,
        @JvmField
        public val isSpeaking: Boolean,
        @JvmField
        public val isHandRaised: Boolean,
        @JvmField
        public val canBeMutedForAllUsers: Boolean,
        @JvmField
        public val canBeUnmutedForAllUsers: Boolean,
        @JvmField
        public val canBeMutedForCurrentUser: Boolean,
        @JvmField
        public val canBeUnmutedForCurrentUser: Boolean,
        @JvmField
        public val isMutedForAllUsers: Boolean,
        @JvmField
        public val isMutedForCurrentUser: Boolean,
        @JvmField
        public val canUnmuteSelf: Boolean,
        @JvmField
        public val volumeLevel: Int,
        @JvmField
        public val order: String,
    ) : Object() {
        override fun getConstructor(): Int = 2_059_182_571
    }

    public class GroupCallParticipantVideoInfo(
        @JvmField
        public val sourceGroups: Array<GroupCallVideoSourceGroup>,
        @JvmField
        public val endpointId: String,
        @JvmField
        public val isPaused: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -14_294_645
    }

    public class GroupCallParticipants(
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val participantIds: Array<MessageSender>,
    ) : Object() {
        override fun getConstructor(): Int = -1_042_491_570
    }

    public class GroupCallRecentSpeaker(
        @JvmField
        public val participantId: MessageSender,
        @JvmField
        public val isSpeaking: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_819_519_436
    }

    public abstract class GroupCallVideoQuality() : Object()

    public class GroupCallVideoQualityThumbnail() : GroupCallVideoQuality() {
        override fun getConstructor(): Int = -379_186_304
    }

    public class GroupCallVideoQualityMedium() : GroupCallVideoQuality() {
        override fun getConstructor(): Int = 394_968_234
    }

    public class GroupCallVideoQualityFull() : GroupCallVideoQuality() {
        override fun getConstructor(): Int = -2_125_916_617
    }

    public class GroupCallVideoSourceGroup(
        @JvmField
        public val semantics: String,
        @JvmField
        public val sourceIds: IntArray,
    ) : Object() {
        override fun getConstructor(): Int = -1_190_900_785
    }

    public class Hashtags(
        @JvmField
        public val hashtags: Array<String>,
    ) : Object() {
        override fun getConstructor(): Int = 676_798_885
    }

    public class HttpUrl(
        @JvmField
        public val url: String,
    ) : Object() {
        override fun getConstructor(): Int = -2_018_019_930
    }

    public class IdentityDocument(
        @JvmField
        public val number: String,
        @JvmField
        public val expirationDate: Date?,
        @JvmField
        public val frontSide: DatedFile,
        @JvmField
        public val reverseSide: DatedFile?,
        @JvmField
        public val selfie: DatedFile?,
        @JvmField
        public val translation: Array<DatedFile>,
    ) : Object() {
        override fun getConstructor(): Int = 1_001_703_606
    }

    public class ImportedContacts(
        @JvmField
        public val userIds: LongArray,
        @JvmField
        public val importerCount: IntArray,
    ) : Object() {
        override fun getConstructor(): Int = 2_068_432_290
    }

    public class InlineKeyboardButton(
        @JvmField
        public val text: String,
        @JvmField
        public val type: InlineKeyboardButtonType,
    ) : Object() {
        override fun getConstructor(): Int = -372_105_704
    }

    public abstract class InlineKeyboardButtonType() : Object()

    public class InlineKeyboardButtonTypeUrl(
        @JvmField
        public val url: String,
    ) : InlineKeyboardButtonType() {
        override fun getConstructor(): Int = 1_130_741_420
    }

    public class InlineKeyboardButtonTypeLoginUrl(
        @JvmField
        public val url: String,
        @JvmField
        public val id: Long,
        @JvmField
        public val forwardText: String,
    ) : InlineKeyboardButtonType() {
        override fun getConstructor(): Int = -1_203_413_081
    }

    public class InlineKeyboardButtonTypeWebApp(
        @JvmField
        public val url: String,
    ) : InlineKeyboardButtonType() {
        override fun getConstructor(): Int = -1_767_471_672
    }

    public class InlineKeyboardButtonTypeCallback(
        @JvmField
        public val data: ByteArray,
    ) : InlineKeyboardButtonType() {
        override fun getConstructor(): Int = -1_127_515_139
    }

    public class InlineKeyboardButtonTypeCallbackWithPassword(
        @JvmField
        public val data: ByteArray,
    ) : InlineKeyboardButtonType() {
        override fun getConstructor(): Int = 908_018_248
    }

    public class InlineKeyboardButtonTypeCallbackGame() : InlineKeyboardButtonType() {
        override fun getConstructor(): Int = -383_429_528
    }

    public class InlineKeyboardButtonTypeSwitchInline(
        @JvmField
        public val query: String,
        @JvmField
        public val targetChat: TargetChat,
    ) : InlineKeyboardButtonType() {
        override fun getConstructor(): Int = 544_906_485
    }

    public class InlineKeyboardButtonTypeBuy() : InlineKeyboardButtonType() {
        override fun getConstructor(): Int = 1_360_739_440
    }

    public class InlineKeyboardButtonTypeUser(
        @JvmField
        public val userId: Long,
    ) : InlineKeyboardButtonType() {
        override fun getConstructor(): Int = 1_836_574_114
    }

    public class InlineKeyboardButtonTypeCopyText(
        @JvmField
        public val text: String,
    ) : InlineKeyboardButtonType() {
        override fun getConstructor(): Int = 68_883_206
    }

    public abstract class InlineQueryResult() : Object()

    public class InlineQueryResultArticle(
        @JvmField
        public val id: String,
        @JvmField
        public val url: String,
        @JvmField
        public val title: String,
        @JvmField
        public val description: String,
        @JvmField
        public val thumbnail: Thumbnail?,
    ) : InlineQueryResult() {
        override fun getConstructor(): Int = 269_930_522
    }

    public class InlineQueryResultContact(
        @JvmField
        public val id: String,
        @JvmField
        public val contact: Contact,
        @JvmField
        public val thumbnail: Thumbnail?,
    ) : InlineQueryResult() {
        override fun getConstructor(): Int = -181_960_174
    }

    public class InlineQueryResultLocation(
        @JvmField
        public val id: String,
        @JvmField
        public val location: Location,
        @JvmField
        public val title: String,
        @JvmField
        public val thumbnail: Thumbnail?,
    ) : InlineQueryResult() {
        override fun getConstructor(): Int = 466_004_752
    }

    public class InlineQueryResultVenue(
        @JvmField
        public val id: String,
        @JvmField
        public val venue: Venue,
        @JvmField
        public val thumbnail: Thumbnail?,
    ) : InlineQueryResult() {
        override fun getConstructor(): Int = 1_281_036_382
    }

    public class InlineQueryResultGame(
        @JvmField
        public val id: String,
        @JvmField
        public val game: Game,
    ) : InlineQueryResult() {
        override fun getConstructor(): Int = 1_706_916_987
    }

    public class InlineQueryResultAnimation(
        @JvmField
        public val id: String,
        @JvmField
        public val animation: Animation,
        @JvmField
        public val title: String,
    ) : InlineQueryResult() {
        override fun getConstructor(): Int = 2_009_984_267
    }

    public class InlineQueryResultAudio(
        @JvmField
        public val id: String,
        @JvmField
        public val audio: Audio,
    ) : InlineQueryResult() {
        override fun getConstructor(): Int = 842_650_360
    }

    public class InlineQueryResultDocument(
        @JvmField
        public val id: String,
        @JvmField
        public val document: Document,
        @JvmField
        public val title: String,
        @JvmField
        public val description: String,
    ) : InlineQueryResult() {
        override fun getConstructor(): Int = -1_491_268_539
    }

    public class InlineQueryResultPhoto(
        @JvmField
        public val id: String,
        @JvmField
        public val photo: Photo,
        @JvmField
        public val title: String,
        @JvmField
        public val description: String,
    ) : InlineQueryResult() {
        override fun getConstructor(): Int = 1_848_319_440
    }

    public class InlineQueryResultSticker(
        @JvmField
        public val id: String,
        @JvmField
        public val sticker: Sticker,
    ) : InlineQueryResult() {
        override fun getConstructor(): Int = -1_848_224_245
    }

    public class InlineQueryResultVideo(
        @JvmField
        public val id: String,
        @JvmField
        public val video: Video,
        @JvmField
        public val title: String,
        @JvmField
        public val description: String,
    ) : InlineQueryResult() {
        override fun getConstructor(): Int = -1_373_158_683
    }

    public class InlineQueryResultVoiceNote(
        @JvmField
        public val id: String,
        @JvmField
        public val voiceNote: VoiceNote,
        @JvmField
        public val title: String,
    ) : InlineQueryResult() {
        override fun getConstructor(): Int = -1_897_393_105
    }

    public class InlineQueryResults(
        @JvmField
        public val inlineQueryId: Long,
        @JvmField
        public val button: InlineQueryResultsButton?,
        @JvmField
        public val results: Array<InlineQueryResult>,
        @JvmField
        public val nextOffset: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_830_685_615
    }

    public class InlineQueryResultsButton(
        @JvmField
        public val text: String,
        @JvmField
        public val type: InlineQueryResultsButtonType,
    ) : Object() {
        override fun getConstructor(): Int = -790_689_618
    }

    public abstract class InlineQueryResultsButtonType() : Object()

    public class InlineQueryResultsButtonTypeStartBot(
        @JvmField
        public val parameter: String,
    ) : InlineQueryResultsButtonType() {
        override fun getConstructor(): Int = -23_400_235
    }

    public class InlineQueryResultsButtonTypeWebApp(
        @JvmField
        public val url: String,
    ) : InlineQueryResultsButtonType() {
        override fun getConstructor(): Int = -1_197_382_814
    }

    public abstract class InputBackground() : Object()

    public class InputBackgroundLocal(
        @JvmField
        public val background: InputFile,
    ) : InputBackground() {
        override fun getConstructor(): Int = -1_747_094_364
    }

    public class InputBackgroundRemote(
        @JvmField
        public val backgroundId: Long,
    ) : InputBackground() {
        override fun getConstructor(): Int = -274_976_231
    }

    public class InputBackgroundPrevious(
        @JvmField
        public val messageId: Long,
    ) : InputBackground() {
        override fun getConstructor(): Int = -351_905_954
    }

    public class InputBusinessChatLink(
        @JvmField
        public val text: FormattedText,
        @JvmField
        public val title: String,
    ) : Object() {
        override fun getConstructor(): Int = 237_858_296
    }

    public class InputBusinessStartPage(
        @JvmField
        public val title: String,
        @JvmField
        public val message: String,
        @JvmField
        public val sticker: InputFile?,
    ) : Object() {
        override fun getConstructor(): Int = -327_383_072
    }

    public abstract class InputChatPhoto() : Object()

    public class InputChatPhotoPrevious(
        @JvmField
        public val chatPhotoId: Long,
    ) : InputChatPhoto() {
        override fun getConstructor(): Int = 23_128_529
    }

    public class InputChatPhotoStatic(
        @JvmField
        public val photo: InputFile,
    ) : InputChatPhoto() {
        override fun getConstructor(): Int = 1_979_179_699
    }

    public class InputChatPhotoAnimation(
        @JvmField
        public val animation: InputFile,
        @JvmField
        public val mainFrameTimestamp: Double,
    ) : InputChatPhoto() {
        override fun getConstructor(): Int = 90_846_242
    }

    public class InputChatPhotoSticker(
        @JvmField
        public val sticker: ChatPhotoSticker,
    ) : InputChatPhoto() {
        override fun getConstructor(): Int = 1_315_861_341
    }

    public abstract class InputCredentials() : Object()

    public class InputCredentialsSaved(
        @JvmField
        public val savedCredentialsId: String,
    ) : InputCredentials() {
        override fun getConstructor(): Int = -2_034_385_364
    }

    public class InputCredentialsNew(
        @JvmField
        public val data: String,
        @JvmField
        public val allowSave: Boolean,
    ) : InputCredentials() {
        override fun getConstructor(): Int = -829_689_558
    }

    public class InputCredentialsApplePay(
        @JvmField
        public val data: String,
    ) : InputCredentials() {
        override fun getConstructor(): Int = -1_246_570_799
    }

    public class InputCredentialsGooglePay(
        @JvmField
        public val data: String,
    ) : InputCredentials() {
        override fun getConstructor(): Int = 844_384_100
    }

    public abstract class InputFile() : Object()

    public class InputFileId(
        @JvmField
        public val id: Int,
    ) : InputFile() {
        override fun getConstructor(): Int = 1_788_906_253
    }

    public class InputFileRemote(
        @JvmField
        public val id: String,
    ) : InputFile() {
        override fun getConstructor(): Int = -107_574_466
    }

    public class InputFileLocal(
        @JvmField
        public val path: String,
    ) : InputFile() {
        override fun getConstructor(): Int = 2_056_030_919
    }

    public class InputFileGenerated(
        @JvmField
        public val originalPath: String,
        @JvmField
        public val conversion: String,
        @JvmField
        public val expectedSize: Long,
    ) : InputFile() {
        override fun getConstructor(): Int = -1_333_385_216
    }

    public abstract class InputGroupCall() : Object()

    public class InputGroupCallLink(
        @JvmField
        public val link: String,
    ) : InputGroupCall() {
        override fun getConstructor(): Int = -812_157_480
    }

    public class InputGroupCallMessage(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
    ) : InputGroupCall() {
        override fun getConstructor(): Int = -341_793_768
    }

    public class InputIdentityDocument(
        @JvmField
        public val number: String,
        @JvmField
        public val expirationDate: Date?,
        @JvmField
        public val frontSide: InputFile,
        @JvmField
        public val reverseSide: InputFile?,
        @JvmField
        public val selfie: InputFile?,
        @JvmField
        public val translation: Array<InputFile>,
    ) : Object() {
        override fun getConstructor(): Int = 767_353_688
    }

    public abstract class InputInlineQueryResult() : Object()

    public class InputInlineQueryResultAnimation(
        @JvmField
        public val id: String,
        @JvmField
        public val title: String,
        @JvmField
        public val thumbnailUrl: String,
        @JvmField
        public val thumbnailMimeType: String,
        @JvmField
        public val videoUrl: String,
        @JvmField
        public val videoMimeType: String,
        @JvmField
        public val videoDuration: Int,
        @JvmField
        public val videoWidth: Int,
        @JvmField
        public val videoHeight: Int,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
        @JvmField
        public val inputMessageContent: InputMessageContent,
    ) : InputInlineQueryResult() {
        override fun getConstructor(): Int = -1_489_808_874
    }

    public class InputInlineQueryResultArticle(
        @JvmField
        public val id: String,
        @JvmField
        public val url: String,
        @JvmField
        public val title: String,
        @JvmField
        public val description: String,
        @JvmField
        public val thumbnailUrl: String,
        @JvmField
        public val thumbnailWidth: Int,
        @JvmField
        public val thumbnailHeight: Int,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
        @JvmField
        public val inputMessageContent: InputMessageContent,
    ) : InputInlineQueryResult() {
        override fun getConstructor(): Int = 1_983_218_620
    }

    public class InputInlineQueryResultAudio(
        @JvmField
        public val id: String,
        @JvmField
        public val title: String,
        @JvmField
        public val performer: String,
        @JvmField
        public val audioUrl: String,
        @JvmField
        public val audioDuration: Int,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
        @JvmField
        public val inputMessageContent: InputMessageContent,
    ) : InputInlineQueryResult() {
        override fun getConstructor(): Int = 1_260_139_988
    }

    public class InputInlineQueryResultContact(
        @JvmField
        public val id: String,
        @JvmField
        public val contact: Contact,
        @JvmField
        public val thumbnailUrl: String,
        @JvmField
        public val thumbnailWidth: Int,
        @JvmField
        public val thumbnailHeight: Int,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
        @JvmField
        public val inputMessageContent: InputMessageContent,
    ) : InputInlineQueryResult() {
        override fun getConstructor(): Int = 1_846_064_594
    }

    public class InputInlineQueryResultDocument(
        @JvmField
        public val id: String,
        @JvmField
        public val title: String,
        @JvmField
        public val description: String,
        @JvmField
        public val documentUrl: String,
        @JvmField
        public val mimeType: String,
        @JvmField
        public val thumbnailUrl: String,
        @JvmField
        public val thumbnailWidth: Int,
        @JvmField
        public val thumbnailHeight: Int,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
        @JvmField
        public val inputMessageContent: InputMessageContent,
    ) : InputInlineQueryResult() {
        override fun getConstructor(): Int = 578_801_869
    }

    public class InputInlineQueryResultGame(
        @JvmField
        public val id: String,
        @JvmField
        public val gameShortName: String,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
    ) : InputInlineQueryResult() {
        override fun getConstructor(): Int = 966_074_327
    }

    public class InputInlineQueryResultLocation(
        @JvmField
        public val id: String,
        @JvmField
        public val location: Location,
        @JvmField
        public val livePeriod: Int,
        @JvmField
        public val title: String,
        @JvmField
        public val thumbnailUrl: String,
        @JvmField
        public val thumbnailWidth: Int,
        @JvmField
        public val thumbnailHeight: Int,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
        @JvmField
        public val inputMessageContent: InputMessageContent,
    ) : InputInlineQueryResult() {
        override fun getConstructor(): Int = -1_887_650_218
    }

    public class InputInlineQueryResultPhoto(
        @JvmField
        public val id: String,
        @JvmField
        public val title: String,
        @JvmField
        public val description: String,
        @JvmField
        public val thumbnailUrl: String,
        @JvmField
        public val photoUrl: String,
        @JvmField
        public val photoWidth: Int,
        @JvmField
        public val photoHeight: Int,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
        @JvmField
        public val inputMessageContent: InputMessageContent,
    ) : InputInlineQueryResult() {
        override fun getConstructor(): Int = -1_123_338_721
    }

    public class InputInlineQueryResultSticker(
        @JvmField
        public val id: String,
        @JvmField
        public val thumbnailUrl: String,
        @JvmField
        public val stickerUrl: String,
        @JvmField
        public val stickerWidth: Int,
        @JvmField
        public val stickerHeight: Int,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
        @JvmField
        public val inputMessageContent: InputMessageContent,
    ) : InputInlineQueryResult() {
        override fun getConstructor(): Int = 274_007_129
    }

    public class InputInlineQueryResultVenue(
        @JvmField
        public val id: String,
        @JvmField
        public val venue: Venue,
        @JvmField
        public val thumbnailUrl: String,
        @JvmField
        public val thumbnailWidth: Int,
        @JvmField
        public val thumbnailHeight: Int,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
        @JvmField
        public val inputMessageContent: InputMessageContent,
    ) : InputInlineQueryResult() {
        override fun getConstructor(): Int = 541_704_509
    }

    public class InputInlineQueryResultVideo(
        @JvmField
        public val id: String,
        @JvmField
        public val title: String,
        @JvmField
        public val description: String,
        @JvmField
        public val thumbnailUrl: String,
        @JvmField
        public val videoUrl: String,
        @JvmField
        public val mimeType: String,
        @JvmField
        public val videoWidth: Int,
        @JvmField
        public val videoHeight: Int,
        @JvmField
        public val videoDuration: Int,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
        @JvmField
        public val inputMessageContent: InputMessageContent,
    ) : InputInlineQueryResult() {
        override fun getConstructor(): Int = 1_724_073_191
    }

    public class InputInlineQueryResultVoiceNote(
        @JvmField
        public val id: String,
        @JvmField
        public val title: String,
        @JvmField
        public val voiceNoteUrl: String,
        @JvmField
        public val voiceNoteDuration: Int,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
        @JvmField
        public val inputMessageContent: InputMessageContent,
    ) : InputInlineQueryResult() {
        override fun getConstructor(): Int = -1_790_072_503
    }

    public abstract class InputInvoice() : Object()

    public class InputInvoiceMessage(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
    ) : InputInvoice() {
        override fun getConstructor(): Int = 1_490_872_848
    }

    public class InputInvoiceName(
        @JvmField
        public val name: String,
    ) : InputInvoice() {
        override fun getConstructor(): Int = -1_312_155_917
    }

    public class InputInvoiceTelegram(
        @JvmField
        public val purpose: TelegramPaymentPurpose,
    ) : InputInvoice() {
        override fun getConstructor(): Int = -1_762_853_139
    }

    public abstract class InputMessageContent() : Object()

    public class InputMessageText(
        @JvmField
        public val text: FormattedText,
        @JvmField
        public val linkPreviewOptions: LinkPreviewOptions?,
        @JvmField
        public val clearDraft: Boolean,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = -212_805_484
    }

    public class InputMessageAnimation(
        @JvmField
        public val animation: InputFile,
        @JvmField
        public val thumbnail: InputThumbnail?,
        @JvmField
        public val addedStickerFileIds: IntArray,
        @JvmField
        public val duration: Int,
        @JvmField
        public val width: Int,
        @JvmField
        public val height: Int,
        @JvmField
        public val caption: FormattedText?,
        @JvmField
        public val showCaptionAboveMedia: Boolean,
        @JvmField
        public val hasSpoiler: Boolean,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = -210_404_059
    }

    public class InputMessageAudio(
        @JvmField
        public val audio: InputFile,
        @JvmField
        public val albumCoverThumbnail: InputThumbnail?,
        @JvmField
        public val duration: Int,
        @JvmField
        public val title: String,
        @JvmField
        public val performer: String,
        @JvmField
        public val caption: FormattedText?,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = -626_786_126
    }

    public class InputMessageDocument(
        @JvmField
        public val document: InputFile,
        @JvmField
        public val thumbnail: InputThumbnail?,
        @JvmField
        public val disableContentTypeDetection: Boolean,
        @JvmField
        public val caption: FormattedText?,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = 1_633_383_097
    }

    public class InputMessagePaidMedia(
        @JvmField
        public val starCount: Long,
        @JvmField
        public val paidMedia: Array<InputPaidMedia>,
        @JvmField
        public val caption: FormattedText?,
        @JvmField
        public val showCaptionAboveMedia: Boolean,
        @JvmField
        public val payload: String,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = -1_274_819_374
    }

    public class InputMessagePhoto(
        @JvmField
        public val photo: InputFile,
        @JvmField
        public val thumbnail: InputThumbnail?,
        @JvmField
        public val addedStickerFileIds: IntArray,
        @JvmField
        public val width: Int,
        @JvmField
        public val height: Int,
        @JvmField
        public val caption: FormattedText?,
        @JvmField
        public val showCaptionAboveMedia: Boolean,
        @JvmField
        public val selfDestructType: MessageSelfDestructType?,
        @JvmField
        public val hasSpoiler: Boolean,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = -810_129_442
    }

    public class InputMessageSticker(
        @JvmField
        public val sticker: InputFile,
        @JvmField
        public val thumbnail: InputThumbnail?,
        @JvmField
        public val width: Int,
        @JvmField
        public val height: Int,
        @JvmField
        public val emoji: String,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = 1_072_805_625
    }

    public class InputMessageVideo(
        @JvmField
        public val video: InputFile,
        @JvmField
        public val thumbnail: InputThumbnail?,
        @JvmField
        public val cover: InputFile?,
        @JvmField
        public val startTimestamp: Int,
        @JvmField
        public val addedStickerFileIds: IntArray,
        @JvmField
        public val duration: Int,
        @JvmField
        public val width: Int,
        @JvmField
        public val height: Int,
        @JvmField
        public val supportsStreaming: Boolean,
        @JvmField
        public val caption: FormattedText?,
        @JvmField
        public val showCaptionAboveMedia: Boolean,
        @JvmField
        public val selfDestructType: MessageSelfDestructType?,
        @JvmField
        public val hasSpoiler: Boolean,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = -605_958_271
    }

    public class InputMessageVideoNote(
        @JvmField
        public val videoNote: InputFile,
        @JvmField
        public val thumbnail: InputThumbnail?,
        @JvmField
        public val duration: Int,
        @JvmField
        public val length: Int,
        @JvmField
        public val selfDestructType: MessageSelfDestructType?,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = -714_598_691
    }

    public class InputMessageVoiceNote(
        @JvmField
        public val voiceNote: InputFile,
        @JvmField
        public val duration: Int,
        @JvmField
        public val waveform: ByteArray,
        @JvmField
        public val caption: FormattedText?,
        @JvmField
        public val selfDestructType: MessageSelfDestructType?,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = 1_461_977_004
    }

    public class InputMessageLocation(
        @JvmField
        public val location: Location,
        @JvmField
        public val livePeriod: Int,
        @JvmField
        public val heading: Int,
        @JvmField
        public val proximityAlertRadius: Int,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = 648_735_088
    }

    public class InputMessageVenue(
        @JvmField
        public val venue: Venue,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = 1_447_926_269
    }

    public class InputMessageContact(
        @JvmField
        public val contact: Contact,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = -982_446_849
    }

    public class InputMessageDice(
        @JvmField
        public val emoji: String,
        @JvmField
        public val clearDraft: Boolean,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = 841_574_313
    }

    public class InputMessageGame(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val gameShortName: String,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = 1_252_944_610
    }

    public class InputMessageInvoice(
        @JvmField
        public val invoice: Invoice,
        @JvmField
        public val title: String,
        @JvmField
        public val description: String,
        @JvmField
        public val photoUrl: String,
        @JvmField
        public val photoSize: Int,
        @JvmField
        public val photoWidth: Int,
        @JvmField
        public val photoHeight: Int,
        @JvmField
        public val payload: ByteArray,
        @JvmField
        public val providerToken: String,
        @JvmField
        public val providerData: String,
        @JvmField
        public val startParameter: String,
        @JvmField
        public val paidMedia: InputPaidMedia?,
        @JvmField
        public val paidMediaCaption: FormattedText?,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = -1_162_047_631
    }

    public class InputMessagePoll(
        @JvmField
        public val question: FormattedText,
        @JvmField
        public val options: Array<FormattedText>,
        @JvmField
        public val isAnonymous: Boolean,
        @JvmField
        public val type: PollType,
        @JvmField
        public val openPeriod: Int,
        @JvmField
        public val closeDate: Int,
        @JvmField
        public val isClosed: Boolean,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = -263_337_164
    }

    public class InputMessageStory(
        @JvmField
        public val storyPosterChatId: Long,
        @JvmField
        public val storyId: Int,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = -370_732_053
    }

    public class InputMessageForwarded(
        @JvmField
        public val fromChatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val inGameShare: Boolean,
        @JvmField
        public val replaceVideoStartTimestamp: Boolean,
        @JvmField
        public val newVideoStartTimestamp: Int,
        @JvmField
        public val copyOptions: MessageCopyOptions?,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = -1_076_506_316
    }

    public abstract class InputMessageReplyTo() : Object()

    public class InputMessageReplyToMessage(
        @JvmField
        public val messageId: Long,
        @JvmField
        public val quote: InputTextQuote?,
    ) : InputMessageReplyTo() {
        override fun getConstructor(): Int = -1_033_987_837
    }

    public class InputMessageReplyToExternalMessage(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val quote: InputTextQuote?,
    ) : InputMessageReplyTo() {
        override fun getConstructor(): Int = -1_993_530_582
    }

    public class InputMessageReplyToStory(
        @JvmField
        public val storyPosterChatId: Long,
        @JvmField
        public val storyId: Int,
    ) : InputMessageReplyTo() {
        override fun getConstructor(): Int = -1_723_842_320
    }

    public class InputPaidMedia(
        @JvmField
        public val type: InputPaidMediaType,
        @JvmField
        public val media: InputFile,
        @JvmField
        public val thumbnail: InputThumbnail?,
        @JvmField
        public val addedStickerFileIds: IntArray,
        @JvmField
        public val width: Int,
        @JvmField
        public val height: Int,
    ) : Object() {
        override fun getConstructor(): Int = 475_844_035
    }

    public abstract class InputPaidMediaType() : Object()

    public class InputPaidMediaTypePhoto() : InputPaidMediaType() {
        override fun getConstructor(): Int = -761_660_134
    }

    public class InputPaidMediaTypeVideo(
        @JvmField
        public val cover: InputFile?,
        @JvmField
        public val startTimestamp: Int,
        @JvmField
        public val duration: Int,
        @JvmField
        public val supportsStreaming: Boolean,
    ) : InputPaidMediaType() {
        override fun getConstructor(): Int = 1_793_741_625
    }

    public abstract class InputPassportElement() : Object()

    public class InputPassportElementPersonalDetails(
        @JvmField
        public val personalDetails: PersonalDetails,
    ) : InputPassportElement() {
        override fun getConstructor(): Int = 164_791_359
    }

    public class InputPassportElementPassport(
        @JvmField
        public val passport: InputIdentityDocument,
    ) : InputPassportElement() {
        override fun getConstructor(): Int = -497_011_356
    }

    public class InputPassportElementDriverLicense(
        @JvmField
        public val driverLicense: InputIdentityDocument,
    ) : InputPassportElement() {
        override fun getConstructor(): Int = 304_813_264
    }

    public class InputPassportElementIdentityCard(
        @JvmField
        public val identityCard: InputIdentityDocument,
    ) : InputPassportElement() {
        override fun getConstructor(): Int = -9_963_390
    }

    public class InputPassportElementInternalPassport(
        @JvmField
        public val internalPassport: InputIdentityDocument,
    ) : InputPassportElement() {
        override fun getConstructor(): Int = 715_360_043
    }

    public class InputPassportElementAddress(
        @JvmField
        public val address: Address,
    ) : InputPassportElement() {
        override fun getConstructor(): Int = 461_630_480
    }

    public class InputPassportElementUtilityBill(
        @JvmField
        public val utilityBill: InputPersonalDocument,
    ) : InputPassportElement() {
        override fun getConstructor(): Int = 1_389_203_841
    }

    public class InputPassportElementBankStatement(
        @JvmField
        public val bankStatement: InputPersonalDocument,
    ) : InputPassportElement() {
        override fun getConstructor(): Int = -26_585_208
    }

    public class InputPassportElementRentalAgreement(
        @JvmField
        public val rentalAgreement: InputPersonalDocument,
    ) : InputPassportElement() {
        override fun getConstructor(): Int = 1_736_154_155
    }

    public class InputPassportElementPassportRegistration(
        @JvmField
        public val passportRegistration: InputPersonalDocument,
    ) : InputPassportElement() {
        override fun getConstructor(): Int = 1_314_562_128
    }

    public class InputPassportElementTemporaryRegistration(
        @JvmField
        public val temporaryRegistration: InputPersonalDocument,
    ) : InputPassportElement() {
        override fun getConstructor(): Int = -1_913_238_047
    }

    public class InputPassportElementPhoneNumber(
        @JvmField
        public val phoneNumber: String,
    ) : InputPassportElement() {
        override fun getConstructor(): Int = 1_319_357_497
    }

    public class InputPassportElementEmailAddress(
        @JvmField
        public val emailAddress: String,
    ) : InputPassportElement() {
        override fun getConstructor(): Int = -248_605_659
    }

    public class InputPassportElementError(
        @JvmField
        public val type: PassportElementType,
        @JvmField
        public val message: String,
        @JvmField
        public val source: InputPassportElementErrorSource,
    ) : Object() {
        override fun getConstructor(): Int = 285_756_898
    }

    public abstract class InputPassportElementErrorSource() : Object()

    public class InputPassportElementErrorSourceUnspecified(
        @JvmField
        public val elementHash: ByteArray,
    ) : InputPassportElementErrorSource() {
        override fun getConstructor(): Int = 267_230_319
    }

    public class InputPassportElementErrorSourceDataField(
        @JvmField
        public val fieldName: String,
        @JvmField
        public val dataHash: ByteArray,
    ) : InputPassportElementErrorSource() {
        override fun getConstructor(): Int = -426_795_002
    }

    public class InputPassportElementErrorSourceFrontSide(
        @JvmField
        public val fileHash: ByteArray,
    ) : InputPassportElementErrorSource() {
        override fun getConstructor(): Int = 588_023_741
    }

    public class InputPassportElementErrorSourceReverseSide(
        @JvmField
        public val fileHash: ByteArray,
    ) : InputPassportElementErrorSource() {
        override fun getConstructor(): Int = 413_072_891
    }

    public class InputPassportElementErrorSourceSelfie(
        @JvmField
        public val fileHash: ByteArray,
    ) : InputPassportElementErrorSource() {
        override fun getConstructor(): Int = -773_575_528
    }

    public class InputPassportElementErrorSourceTranslationFile(
        @JvmField
        public val fileHash: ByteArray,
    ) : InputPassportElementErrorSource() {
        override fun getConstructor(): Int = 505_842_299
    }

    public class InputPassportElementErrorSourceTranslationFiles(
        @JvmField
        public val fileHashes: Array<ByteArray>,
    ) : InputPassportElementErrorSource() {
        override fun getConstructor(): Int = -527_254_048
    }

    public class InputPassportElementErrorSourceFile(
        @JvmField
        public val fileHash: ByteArray,
    ) : InputPassportElementErrorSource() {
        override fun getConstructor(): Int = -298_492_469
    }

    public class InputPassportElementErrorSourceFiles(
        @JvmField
        public val fileHashes: Array<ByteArray>,
    ) : InputPassportElementErrorSource() {
        override fun getConstructor(): Int = -2_008_541_640
    }

    public class InputPersonalDocument(
        @JvmField
        public val files: Array<InputFile>,
        @JvmField
        public val translation: Array<InputFile>,
    ) : Object() {
        override fun getConstructor(): Int = 1_676_966_826
    }

    public class InputSticker(
        @JvmField
        public val sticker: InputFile,
        @JvmField
        public val format: StickerFormat,
        @JvmField
        public val emojis: String,
        @JvmField
        public val maskPosition: MaskPosition?,
        @JvmField
        public val keywords: Array<String>,
    ) : Object() {
        override fun getConstructor(): Int = 1_589_392_402
    }

    public class InputStoryArea(
        @JvmField
        public val position: StoryAreaPosition,
        @JvmField
        public val type: InputStoryAreaType,
    ) : Object() {
        override fun getConstructor(): Int = 122_859_135
    }

    public abstract class InputStoryAreaType() : Object()

    public class InputStoryAreaTypeLocation(
        @JvmField
        public val location: Location,
        @JvmField
        public val address: LocationAddress?,
    ) : InputStoryAreaType() {
        override fun getConstructor(): Int = -1_433_714_887
    }

    public class InputStoryAreaTypeFoundVenue(
        @JvmField
        public val queryId: Long,
        @JvmField
        public val resultId: String,
    ) : InputStoryAreaType() {
        override fun getConstructor(): Int = -1_395_809_130
    }

    public class InputStoryAreaTypePreviousVenue(
        @JvmField
        public val venueProvider: String,
        @JvmField
        public val venueId: String,
    ) : InputStoryAreaType() {
        override fun getConstructor(): Int = 1_846_693_388
    }

    public class InputStoryAreaTypeSuggestedReaction(
        @JvmField
        public val reactionType: ReactionType,
        @JvmField
        public val isDark: Boolean,
        @JvmField
        public val isFlipped: Boolean,
    ) : InputStoryAreaType() {
        override fun getConstructor(): Int = 2_101_826_003
    }

    public class InputStoryAreaTypeMessage(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
    ) : InputStoryAreaType() {
        override fun getConstructor(): Int = -266_607_529
    }

    public class InputStoryAreaTypeLink(
        @JvmField
        public val url: String,
    ) : InputStoryAreaType() {
        override fun getConstructor(): Int = 1_408_441_160
    }

    public class InputStoryAreaTypeWeather(
        @JvmField
        public val temperature: Double,
        @JvmField
        public val emoji: String,
        @JvmField
        public val backgroundColor: Int,
    ) : InputStoryAreaType() {
        override fun getConstructor(): Int = -1_212_686_691
    }

    public class InputStoryAreaTypeUpgradedGift(
        @JvmField
        public val giftName: String,
    ) : InputStoryAreaType() {
        override fun getConstructor(): Int = 793_059_694
    }

    public class InputStoryAreas(
        @JvmField
        public val areas: Array<InputStoryArea>,
    ) : Object() {
        override fun getConstructor(): Int = -883_247_088
    }

    public abstract class InputStoryContent() : Object()

    public class InputStoryContentPhoto(
        @JvmField
        public val photo: InputFile,
        @JvmField
        public val addedStickerFileIds: IntArray,
    ) : InputStoryContent() {
        override fun getConstructor(): Int = -309_196_727
    }

    public class InputStoryContentVideo(
        @JvmField
        public val video: InputFile,
        @JvmField
        public val addedStickerFileIds: IntArray,
        @JvmField
        public val duration: Double,
        @JvmField
        public val coverFrameTimestamp: Double,
        @JvmField
        public val isAnimation: Boolean,
    ) : InputStoryContent() {
        override fun getConstructor(): Int = 3_809_243
    }

    public class InputTextQuote(
        @JvmField
        public val text: FormattedText,
        @JvmField
        public val position: Int,
    ) : Object() {
        override fun getConstructor(): Int = -1_219_859_172
    }

    public class InputThumbnail(
        @JvmField
        public val thumbnail: InputFile,
        @JvmField
        public val width: Int,
        @JvmField
        public val height: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_582_387_236
    }

    public abstract class InternalLinkType() : Object()

    public class InternalLinkTypeActiveSessions() : InternalLinkType() {
        override fun getConstructor(): Int = 1_886_108_589
    }

    public class InternalLinkTypeAttachmentMenuBot(
        @JvmField
        public val targetChat: TargetChat,
        @JvmField
        public val botUsername: String,
        @JvmField
        public val url: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 1_682_719_269
    }

    public class InternalLinkTypeAuthenticationCode(
        @JvmField
        public val code: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -209_235_982
    }

    public class InternalLinkTypeBackground(
        @JvmField
        public val backgroundName: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 185_411_848
    }

    public class InternalLinkTypeBotAddToChannel(
        @JvmField
        public val botUsername: String,
        @JvmField
        public val administratorRights: ChatAdministratorRights,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 1_401_602_752
    }

    public class InternalLinkTypeBotStart(
        @JvmField
        public val botUsername: String,
        @JvmField
        public val startParameter: String,
        @JvmField
        public val autostart: Boolean,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 1_066_950_637
    }

    public class InternalLinkTypeBotStartInGroup(
        @JvmField
        public val botUsername: String,
        @JvmField
        public val startParameter: String,
        @JvmField
        public val administratorRights: ChatAdministratorRights?,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -905_081_650
    }

    public class InternalLinkTypeBusinessChat(
        @JvmField
        public val linkName: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -1_606_751_785
    }

    public class InternalLinkTypeBuyStars(
        @JvmField
        public val starCount: Long,
        @JvmField
        public val purpose: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -1_454_587_065
    }

    public class InternalLinkTypeChangePhoneNumber() : InternalLinkType() {
        override fun getConstructor(): Int = -265_856_255
    }

    public class InternalLinkTypeChatAffiliateProgram(
        @JvmField
        public val username: String,
        @JvmField
        public val referrer: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 632_049_700
    }

    public class InternalLinkTypeChatBoost(
        @JvmField
        public val url: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -716_571_328
    }

    public class InternalLinkTypeChatFolderInvite(
        @JvmField
        public val inviteLink: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -1_984_804_546
    }

    public class InternalLinkTypeChatFolderSettings() : InternalLinkType() {
        override fun getConstructor(): Int = -1_073_805_988
    }

    public class InternalLinkTypeChatInvite(
        @JvmField
        public val inviteLink: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 428_621_017
    }

    public class InternalLinkTypeDefaultMessageAutoDeleteTimerSettings() : InternalLinkType() {
        override fun getConstructor(): Int = 732_625_201
    }

    public class InternalLinkTypeEditProfileSettings() : InternalLinkType() {
        override fun getConstructor(): Int = -1_022_472_090
    }

    public class InternalLinkTypeGame(
        @JvmField
        public val botUsername: String,
        @JvmField
        public val gameShortName: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -260_788_787
    }

    public class InternalLinkTypeGroupCall(
        @JvmField
        public val inviteLink: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 1_953_084_438
    }

    public class InternalLinkTypeInstantView(
        @JvmField
        public val url: String,
        @JvmField
        public val fallbackUrl: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 1_776_607_039
    }

    public class InternalLinkTypeInvoice(
        @JvmField
        public val invoiceName: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -213_094_996
    }

    public class InternalLinkTypeLanguagePack(
        @JvmField
        public val languagePackId: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -1_450_766_996
    }

    public class InternalLinkTypeLanguageSettings() : InternalLinkType() {
        override fun getConstructor(): Int = -1_340_479_770
    }

    public class InternalLinkTypeMainWebApp(
        @JvmField
        public val botUsername: String,
        @JvmField
        public val startParameter: String,
        @JvmField
        public val mode: WebAppOpenMode,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 1_574_925_033
    }

    public class InternalLinkTypeMessage(
        @JvmField
        public val url: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 978_541_650
    }

    public class InternalLinkTypeMessageDraft(
        @JvmField
        public val text: FormattedText,
        @JvmField
        public val containsLink: Boolean,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 661_633_749
    }

    public class InternalLinkTypePassportDataRequest(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val scope: String,
        @JvmField
        public val publicKey: String,
        @JvmField
        public val nonce: String,
        @JvmField
        public val callbackUrl: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -988_819_839
    }

    public class InternalLinkTypePhoneNumberConfirmation(
        @JvmField
        public val hash: String,
        @JvmField
        public val phoneNumber: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 1_757_375_254
    }

    public class InternalLinkTypePremiumFeatures(
        @JvmField
        public val referrer: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 1_216_892_745
    }

    public class InternalLinkTypePremiumGift(
        @JvmField
        public val referrer: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 1_523_936_577
    }

    public class InternalLinkTypePremiumGiftCode(
        @JvmField
        public val code: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -564_356_974
    }

    public class InternalLinkTypePrivacyAndSecuritySettings() : InternalLinkType() {
        override fun getConstructor(): Int = -1_386_255_665
    }

    public class InternalLinkTypeProxy(
        @JvmField
        public val server: String,
        @JvmField
        public val port: Int,
        @JvmField
        public val type: ProxyType,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -1_313_788_694
    }

    public class InternalLinkTypePublicChat(
        @JvmField
        public val chatUsername: String,
        @JvmField
        public val draftText: String,
        @JvmField
        public val openProfile: Boolean,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 1_769_614_592
    }

    public class InternalLinkTypeQrCodeAuthentication() : InternalLinkType() {
        override fun getConstructor(): Int = -1_089_332_956
    }

    public class InternalLinkTypeRestorePurchases() : InternalLinkType() {
        override fun getConstructor(): Int = 606_090_371
    }

    public class InternalLinkTypeSettings() : InternalLinkType() {
        override fun getConstructor(): Int = 393_561_524
    }

    public class InternalLinkTypeStickerSet(
        @JvmField
        public val stickerSetName: String,
        @JvmField
        public val expectCustomEmoji: Boolean,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -1_589_227_614
    }

    public class InternalLinkTypeStory(
        @JvmField
        public val storyPosterUsername: String,
        @JvmField
        public val storyId: Int,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 1_852_042_869
    }

    public class InternalLinkTypeTheme(
        @JvmField
        public val themeName: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -200_935_417
    }

    public class InternalLinkTypeThemeSettings() : InternalLinkType() {
        override fun getConstructor(): Int = -1_051_903_722
    }

    public class InternalLinkTypeUnknownDeepLink(
        @JvmField
        public val link: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 625_596_379
    }

    public class InternalLinkTypeUnsupportedProxy() : InternalLinkType() {
        override fun getConstructor(): Int = -566_649_079
    }

    public class InternalLinkTypeUpgradedGift(
        @JvmField
        public val name: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -708_405_605
    }

    public class InternalLinkTypeUserPhoneNumber(
        @JvmField
        public val phoneNumber: String,
        @JvmField
        public val draftText: String,
        @JvmField
        public val openProfile: Boolean,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 273_398_536
    }

    public class InternalLinkTypeUserToken(
        @JvmField
        public val token: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -1_462_248_615
    }

    public class InternalLinkTypeVideoChat(
        @JvmField
        public val chatUsername: String,
        @JvmField
        public val inviteHash: String,
        @JvmField
        public val isLiveStream: Boolean,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -2_020_149_068
    }

    public class InternalLinkTypeWebApp(
        @JvmField
        public val botUsername: String,
        @JvmField
        public val webAppShortName: String,
        @JvmField
        public val startParameter: String,
        @JvmField
        public val mode: WebAppOpenMode,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 2_062_112_045
    }

    public abstract class InviteGroupCallParticipantResult() : Object()

    public class InviteGroupCallParticipantResultUserPrivacyRestricted() : InviteGroupCallParticipantResult() {
        override fun getConstructor(): Int = 53_003_769
    }

    public class InviteGroupCallParticipantResultUserAlreadyParticipant() : InviteGroupCallParticipantResult() {
        override fun getConstructor(): Int = 661_526_151
    }

    public class InviteGroupCallParticipantResultUserWasBanned() : InviteGroupCallParticipantResult() {
        override fun getConstructor(): Int = -204_345_357
    }

    public class InviteGroupCallParticipantResultSuccess(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
    ) : InviteGroupCallParticipantResult() {
        override fun getConstructor(): Int = -1_914_309_427
    }

    public abstract class InviteLinkChatType() : Object()

    public class InviteLinkChatTypeBasicGroup() : InviteLinkChatType() {
        override fun getConstructor(): Int = 1_296_287_214
    }

    public class InviteLinkChatTypeSupergroup() : InviteLinkChatType() {
        override fun getConstructor(): Int = 1_038_640_984
    }

    public class InviteLinkChatTypeChannel() : InviteLinkChatType() {
        override fun getConstructor(): Int = 806_547_211
    }

    public class Invoice(
        @JvmField
        public val currency: String,
        @JvmField
        public val priceParts: Array<LabeledPricePart>,
        @JvmField
        public val subscriptionPeriod: Int,
        @JvmField
        public val maxTipAmount: Long,
        @JvmField
        public val suggestedTipAmounts: LongArray,
        @JvmField
        public val recurringPaymentTermsOfServiceUrl: String,
        @JvmField
        public val termsOfServiceUrl: String,
        @JvmField
        public val isTest: Boolean,
        @JvmField
        public val needName: Boolean,
        @JvmField
        public val needPhoneNumber: Boolean,
        @JvmField
        public val needEmailAddress: Boolean,
        @JvmField
        public val needShippingAddress: Boolean,
        @JvmField
        public val sendPhoneNumberToProvider: Boolean,
        @JvmField
        public val sendEmailAddressToProvider: Boolean,
        @JvmField
        public val isFlexible: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 113_204_876
    }

    public class JsonObjectMember(
        @JvmField
        public val key: String,
        @JvmField
        public val value: JsonValue,
    ) : Object() {
        override fun getConstructor(): Int = -1_803_309_418
    }

    public abstract class JsonValue() : Object()

    public class JsonValueNull() : JsonValue() {
        override fun getConstructor(): Int = -92_872_499
    }

    public class JsonValueBoolean(
        @JvmField
        public val value: Boolean,
    ) : JsonValue() {
        override fun getConstructor(): Int = -2_142_186_576
    }

    public class JsonValueNumber(
        @JvmField
        public val value: Double,
    ) : JsonValue() {
        override fun getConstructor(): Int = -1_010_822_033
    }

    public class JsonValueString(
        @JvmField
        public val value: String,
    ) : JsonValue() {
        override fun getConstructor(): Int = 1_597_947_313
    }

    public class JsonValueArray(
        @JvmField
        public val values: Array<JsonValue>,
    ) : JsonValue() {
        override fun getConstructor(): Int = -183_913_546
    }

    public class JsonValueObject(
        @JvmField
        public val members: Array<JsonObjectMember>,
    ) : JsonValue() {
        override fun getConstructor(): Int = 520_252_026
    }

    public class KeyboardButton(
        @JvmField
        public val text: String,
        @JvmField
        public val type: KeyboardButtonType,
    ) : Object() {
        override fun getConstructor(): Int = -2_069_836_172
    }

    public abstract class KeyboardButtonType() : Object()

    public class KeyboardButtonTypeText() : KeyboardButtonType() {
        override fun getConstructor(): Int = -1_773_037_256
    }

    public class KeyboardButtonTypeRequestPhoneNumber() : KeyboardButtonType() {
        override fun getConstructor(): Int = -1_529_235_527
    }

    public class KeyboardButtonTypeRequestLocation() : KeyboardButtonType() {
        override fun getConstructor(): Int = -125_661_955
    }

    public class KeyboardButtonTypeRequestPoll(
        @JvmField
        public val forceRegular: Boolean,
        @JvmField
        public val forceQuiz: Boolean,
    ) : KeyboardButtonType() {
        override fun getConstructor(): Int = 1_902_435_512
    }

    public class KeyboardButtonTypeRequestUsers(
        @JvmField
        public val id: Int,
        @JvmField
        public val restrictUserIsBot: Boolean,
        @JvmField
        public val userIsBot: Boolean,
        @JvmField
        public val restrictUserIsPremium: Boolean,
        @JvmField
        public val userIsPremium: Boolean,
        @JvmField
        public val maxQuantity: Int,
        @JvmField
        public val requestName: Boolean,
        @JvmField
        public val requestUsername: Boolean,
        @JvmField
        public val requestPhoto: Boolean,
    ) : KeyboardButtonType() {
        override fun getConstructor(): Int = -1_738_765_315
    }

    public class KeyboardButtonTypeRequestChat(
        @JvmField
        public val id: Int,
        @JvmField
        public val chatIsChannel: Boolean,
        @JvmField
        public val restrictChatIsForum: Boolean,
        @JvmField
        public val chatIsForum: Boolean,
        @JvmField
        public val restrictChatHasUsername: Boolean,
        @JvmField
        public val chatHasUsername: Boolean,
        @JvmField
        public val chatIsCreated: Boolean,
        @JvmField
        public val userAdministratorRights: ChatAdministratorRights?,
        @JvmField
        public val botAdministratorRights: ChatAdministratorRights?,
        @JvmField
        public val botIsMember: Boolean,
        @JvmField
        public val requestTitle: Boolean,
        @JvmField
        public val requestUsername: Boolean,
        @JvmField
        public val requestPhoto: Boolean,
    ) : KeyboardButtonType() {
        override fun getConstructor(): Int = 1_511_138_485
    }

    public class KeyboardButtonTypeWebApp(
        @JvmField
        public val url: String,
    ) : KeyboardButtonType() {
        override fun getConstructor(): Int = 1_892_220_770
    }

    public class LabeledPricePart(
        @JvmField
        public val label: String,
        @JvmField
        public val amount: Long,
    ) : Object() {
        override fun getConstructor(): Int = 552_789_798
    }

    public class LanguagePackInfo(
        @JvmField
        public val id: String,
        @JvmField
        public val baseLanguagePackId: String,
        @JvmField
        public val name: String,
        @JvmField
        public val nativeName: String,
        @JvmField
        public val pluralCode: String,
        @JvmField
        public val isOfficial: Boolean,
        @JvmField
        public val isRtl: Boolean,
        @JvmField
        public val isBeta: Boolean,
        @JvmField
        public val isInstalled: Boolean,
        @JvmField
        public val totalStringCount: Int,
        @JvmField
        public val translatedStringCount: Int,
        @JvmField
        public val localStringCount: Int,
        @JvmField
        public val translationUrl: String,
    ) : Object() {
        override fun getConstructor(): Int = 542_199_642
    }

    public class LanguagePackString(
        @JvmField
        public val key: String,
        @JvmField
        public val value: LanguagePackStringValue?,
    ) : Object() {
        override fun getConstructor(): Int = 1_307_632_736
    }

    public abstract class LanguagePackStringValue() : Object()

    public class LanguagePackStringValueOrdinary(
        @JvmField
        public val value: String,
    ) : LanguagePackStringValue() {
        override fun getConstructor(): Int = -249_256_352
    }

    public class LanguagePackStringValuePluralized(
        @JvmField
        public val zeroValue: String,
        @JvmField
        public val oneValue: String,
        @JvmField
        public val twoValue: String,
        @JvmField
        public val fewValue: String,
        @JvmField
        public val manyValue: String,
        @JvmField
        public val otherValue: String,
    ) : LanguagePackStringValue() {
        override fun getConstructor(): Int = 1_906_840_261
    }

    public class LanguagePackStringValueDeleted() : LanguagePackStringValue() {
        override fun getConstructor(): Int = 1_834_792_698
    }

    public class LanguagePackStrings(
        @JvmField
        public val strings: Array<LanguagePackString>,
    ) : Object() {
        override fun getConstructor(): Int = 1_172_082_922
    }

    public class LinkPreview(
        @JvmField
        public val url: String,
        @JvmField
        public val displayUrl: String,
        @JvmField
        public val siteName: String,
        @JvmField
        public val title: String,
        @JvmField
        public val description: FormattedText,
        @JvmField
        public val author: String,
        @JvmField
        public val type: LinkPreviewType,
        @JvmField
        public val hasLargeMedia: Boolean,
        @JvmField
        public val showLargeMedia: Boolean,
        @JvmField
        public val showMediaAboveDescription: Boolean,
        @JvmField
        public val skipConfirmation: Boolean,
        @JvmField
        public val showAboveText: Boolean,
        @JvmField
        public val instantViewVersion: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_729_417_714
    }

    public abstract class LinkPreviewAlbumMedia() : Object()

    public class LinkPreviewAlbumMediaPhoto(
        @JvmField
        public val photo: Photo,
    ) : LinkPreviewAlbumMedia() {
        override fun getConstructor(): Int = -935_480_434
    }

    public class LinkPreviewAlbumMediaVideo(
        @JvmField
        public val video: Video,
    ) : LinkPreviewAlbumMedia() {
        override fun getConstructor(): Int = 390_616_795
    }

    public class LinkPreviewOptions(
        @JvmField
        public val isDisabled: Boolean,
        @JvmField
        public val url: String,
        @JvmField
        public val forceSmallMedia: Boolean,
        @JvmField
        public val forceLargeMedia: Boolean,
        @JvmField
        public val showAboveText: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_046_590_451
    }

    public abstract class LinkPreviewType() : Object()

    public class LinkPreviewTypeAlbum(
        @JvmField
        public val media: Array<LinkPreviewAlbumMedia>,
        @JvmField
        public val caption: String,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -919_156_671
    }

    public class LinkPreviewTypeAnimation(
        @JvmField
        public val animation: Animation,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -1_386_429_132
    }

    public class LinkPreviewTypeApp(
        @JvmField
        public val photo: Photo,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -475_623_953
    }

    public class LinkPreviewTypeArticle(
        @JvmField
        public val photo: Photo?,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = 2_093_915_097
    }

    public class LinkPreviewTypeAudio(
        @JvmField
        public val audio: Audio,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = 1_977_878_482
    }

    public class LinkPreviewTypeBackground(
        @JvmField
        public val document: Document?,
        @JvmField
        public val backgroundType: BackgroundType?,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = 977_838_560
    }

    public class LinkPreviewTypeChannelBoost(
        @JvmField
        public val photo: ChatPhoto?,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -957_086_634
    }

    public class LinkPreviewTypeChat(
        @JvmField
        public val type: InviteLinkChatType,
        @JvmField
        public val photo: ChatPhoto?,
        @JvmField
        public val createsJoinRequest: Boolean,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -1_372_610_270
    }

    public class LinkPreviewTypeDocument(
        @JvmField
        public val document: Document,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -1_090_426_462
    }

    public class LinkPreviewTypeEmbeddedAnimationPlayer(
        @JvmField
        public val url: String,
        @JvmField
        public val thumbnail: Photo?,
        @JvmField
        public val duration: Int,
        @JvmField
        public val width: Int,
        @JvmField
        public val height: Int,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -1_436_887_547
    }

    public class LinkPreviewTypeEmbeddedAudioPlayer(
        @JvmField
        public val url: String,
        @JvmField
        public val thumbnail: Photo?,
        @JvmField
        public val duration: Int,
        @JvmField
        public val width: Int,
        @JvmField
        public val height: Int,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = 571_163_292
    }

    public class LinkPreviewTypeEmbeddedVideoPlayer(
        @JvmField
        public val url: String,
        @JvmField
        public val thumbnail: Photo?,
        @JvmField
        public val duration: Int,
        @JvmField
        public val width: Int,
        @JvmField
        public val height: Int,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -1_480_606_973
    }

    public class LinkPreviewTypeExternalAudio(
        @JvmField
        public val url: String,
        @JvmField
        public val mimeType: String,
        @JvmField
        public val duration: Int,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -1_971_126_291
    }

    public class LinkPreviewTypeExternalVideo(
        @JvmField
        public val url: String,
        @JvmField
        public val mimeType: String,
        @JvmField
        public val width: Int,
        @JvmField
        public val height: Int,
        @JvmField
        public val duration: Int,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = 1_367_198_616
    }

    public class LinkPreviewTypeGroupCall() : LinkPreviewType() {
        override fun getConstructor(): Int = -1_242_459_936
    }

    public class LinkPreviewTypeInvoice() : LinkPreviewType() {
        override fun getConstructor(): Int = -729_855_782
    }

    public class LinkPreviewTypeMessage() : LinkPreviewType() {
        override fun getConstructor(): Int = 435_470_750
    }

    public class LinkPreviewTypePhoto(
        @JvmField
        public val photo: Photo,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -1_362_122_068
    }

    public class LinkPreviewTypePremiumGiftCode() : LinkPreviewType() {
        override fun getConstructor(): Int = 1_309_507_761
    }

    public class LinkPreviewTypeShareableChatFolder() : LinkPreviewType() {
        override fun getConstructor(): Int = -2_141_539_524
    }

    public class LinkPreviewTypeSticker(
        @JvmField
        public val sticker: Sticker,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = 610_225_445
    }

    public class LinkPreviewTypeStickerSet(
        @JvmField
        public val stickers: Array<Sticker>,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -145_958_768
    }

    public class LinkPreviewTypeStory(
        @JvmField
        public val storyPosterChatId: Long,
        @JvmField
        public val storyId: Int,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = 1_045_709_531
    }

    public class LinkPreviewTypeSupergroupBoost(
        @JvmField
        public val photo: ChatPhoto?,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -1_873_345_418
    }

    public class LinkPreviewTypeTheme(
        @JvmField
        public val documents: Array<Document>,
        @JvmField
        public val settings: ThemeSettings?,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -226_118_489
    }

    public class LinkPreviewTypeUnsupported() : LinkPreviewType() {
        override fun getConstructor(): Int = 1_924_738_233
    }

    public class LinkPreviewTypeUpgradedGift(
        @JvmField
        public val gift: UpgradedGift,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = 293_249_807
    }

    public class LinkPreviewTypeUser(
        @JvmField
        public val photo: ChatPhoto?,
        @JvmField
        public val isBot: Boolean,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -1_465_024_132
    }

    public class LinkPreviewTypeVideo(
        @JvmField
        public val video: Video,
        @JvmField
        public val cover: Photo?,
        @JvmField
        public val startTimestamp: Int,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = 1_573_057_926
    }

    public class LinkPreviewTypeVideoChat(
        @JvmField
        public val photo: ChatPhoto?,
        @JvmField
        public val isLiveStream: Boolean,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = 420_015_635
    }

    public class LinkPreviewTypeVideoNote(
        @JvmField
        public val videoNote: VideoNote,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -814_687_391
    }

    public class LinkPreviewTypeVoiceNote(
        @JvmField
        public val voiceNote: VoiceNote,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -757_936_341
    }

    public class LinkPreviewTypeWebApp(
        @JvmField
        public val photo: Photo?,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -1_506_873_462
    }

    public class LocalFile(
        @JvmField
        public val path: String,
        @JvmField
        public val canBeDownloaded: Boolean,
        @JvmField
        public val canBeDeleted: Boolean,
        @JvmField
        public val isDownloadingActive: Boolean,
        @JvmField
        public val isDownloadingCompleted: Boolean,
        @JvmField
        public val downloadOffset: Long,
        @JvmField
        public val downloadedPrefixSize: Long,
        @JvmField
        public val downloadedSize: Long,
    ) : Object() {
        override fun getConstructor(): Int = -1_562_732_153
    }

    public class LocalizationTargetInfo(
        @JvmField
        public val languagePacks: Array<LanguagePackInfo>,
    ) : Object() {
        override fun getConstructor(): Int = -2_048_670_809
    }

    public class Location(
        @JvmField
        public val latitude: Double,
        @JvmField
        public val longitude: Double,
        @JvmField
        public val horizontalAccuracy: Double,
    ) : Object() {
        override fun getConstructor(): Int = -443_392_141
    }

    public class LocationAddress(
        @JvmField
        public val countryCode: String,
        @JvmField
        public val state: String,
        @JvmField
        public val city: String,
        @JvmField
        public val street: String,
    ) : Object() {
        override fun getConstructor(): Int = -1_545_940_190
    }

    public abstract class LogStream() : Object()

    public class LogStreamDefault() : LogStream() {
        override fun getConstructor(): Int = 1_390_581_436
    }

    public class LogStreamFile(
        @JvmField
        public val path: String,
        @JvmField
        public val maxFileSize: Long,
        @JvmField
        public val redirectStderr: Boolean,
    ) : LogStream() {
        override fun getConstructor(): Int = 1_532_136_933
    }

    public class LogStreamEmpty() : LogStream() {
        override fun getConstructor(): Int = -499_912_244
    }

    public class LogTags(
        @JvmField
        public val tags: Array<String>,
    ) : Object() {
        override fun getConstructor(): Int = -1_604_930_601
    }

    public class LogVerbosityLevel(
        @JvmField
        public val verbosityLevel: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_734_624_234
    }

    public abstract class LoginUrlInfo() : Object()

    public class LoginUrlInfoOpen(
        @JvmField
        public val url: String,
        @JvmField
        public val skipConfirmation: Boolean,
    ) : LoginUrlInfo() {
        override fun getConstructor(): Int = 837_282_306
    }

    public class LoginUrlInfoRequestConfirmation(
        @JvmField
        public val url: String,
        @JvmField
        public val domain: String,
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val requestWriteAccess: Boolean,
    ) : LoginUrlInfo() {
        override fun getConstructor(): Int = 2_128_290_863
    }

    public class MainWebApp(
        @JvmField
        public val url: String,
        @JvmField
        public val mode: WebAppOpenMode,
    ) : Object() {
        override fun getConstructor(): Int = 1_940_368_506
    }

    public abstract class MaskPoint() : Object()

    public class MaskPointForehead() : MaskPoint() {
        override fun getConstructor(): Int = 1_027_512_005
    }

    public class MaskPointEyes() : MaskPoint() {
        override fun getConstructor(): Int = 1_748_310_861
    }

    public class MaskPointMouth() : MaskPoint() {
        override fun getConstructor(): Int = 411_773_406
    }

    public class MaskPointChin() : MaskPoint() {
        override fun getConstructor(): Int = 534_995_335
    }

    public class MaskPosition(
        @JvmField
        public val point: MaskPoint,
        @JvmField
        public val xShift: Double,
        @JvmField
        public val yShift: Double,
        @JvmField
        public val scale: Double,
    ) : Object() {
        override fun getConstructor(): Int = -2_097_433_026
    }

    public class Message(
        @JvmField
        public val id: Long,
        @JvmField
        public val senderId: MessageSender,
        @JvmField
        public val chatId: Long,
        @JvmField
        public val sendingState: MessageSendingState?,
        @JvmField
        public val schedulingState: MessageSchedulingState?,
        @JvmField
        public val isOutgoing: Boolean,
        @JvmField
        public val isPinned: Boolean,
        @JvmField
        public val isFromOffline: Boolean,
        @JvmField
        public val canBeSaved: Boolean,
        @JvmField
        public val hasTimestampedMedia: Boolean,
        @JvmField
        public val isChannelPost: Boolean,
        @JvmField
        public val isTopicMessage: Boolean,
        @JvmField
        public val containsUnreadMention: Boolean,
        @JvmField
        public val date: Int,
        @JvmField
        public val editDate: Int,
        @JvmField
        public val forwardInfo: MessageForwardInfo?,
        @JvmField
        public val importInfo: MessageImportInfo?,
        @JvmField
        public val interactionInfo: MessageInteractionInfo?,
        @JvmField
        public val unreadReactions: Array<UnreadReaction>,
        @JvmField
        public val factCheck: FactCheck?,
        @JvmField
        public val replyTo: MessageReplyTo?,
        @JvmField
        public val messageThreadId: Long,
        @JvmField
        public val savedMessagesTopicId: Long,
        @JvmField
        public val selfDestructType: MessageSelfDestructType?,
        @JvmField
        public val selfDestructIn: Double,
        @JvmField
        public val autoDeleteIn: Double,
        @JvmField
        public val viaBotUserId: Long,
        @JvmField
        public val senderBusinessBotUserId: Long,
        @JvmField
        public val senderBoostCount: Int,
        @JvmField
        public val paidMessageStarCount: Long,
        @JvmField
        public val authorSignature: String,
        @JvmField
        public val mediaAlbumId: Long,
        @JvmField
        public val effectId: Long,
        @JvmField
        public val hasSensitiveContent: Boolean,
        @JvmField
        public val restrictionReason: String,
        @JvmField
        public val content: MessageContent,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
    ) : Object() {
        override fun getConstructor(): Int = 726_001_662
    }

    public class MessageAutoDeleteTime(
        @JvmField
        public val time: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_972_045_589
    }

    public class MessageCalendar(
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val days: Array<MessageCalendarDay>,
    ) : Object() {
        override fun getConstructor(): Int = -1_682_890_519
    }

    public class MessageCalendarDay(
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val message: Message,
    ) : Object() {
        override fun getConstructor(): Int = -376_467_614
    }

    public abstract class MessageContent() : Object()

    public class MessageText(
        @JvmField
        public val text: FormattedText,
        @JvmField
        public val linkPreview: LinkPreview?,
        @JvmField
        public val linkPreviewOptions: LinkPreviewOptions?,
    ) : MessageContent() {
        override fun getConstructor(): Int = 1_751_469_188
    }

    public class MessageAnimation(
        @JvmField
        public val animation: Animation,
        @JvmField
        public val caption: FormattedText,
        @JvmField
        public val showCaptionAboveMedia: Boolean,
        @JvmField
        public val hasSpoiler: Boolean,
        @JvmField
        public val isSecret: Boolean,
    ) : MessageContent() {
        override fun getConstructor(): Int = -1_899_294_424
    }

    public class MessageAudio(
        @JvmField
        public val audio: Audio,
        @JvmField
        public val caption: FormattedText,
    ) : MessageContent() {
        override fun getConstructor(): Int = 276_722_716
    }

    public class MessageDocument(
        @JvmField
        public val document: Document,
        @JvmField
        public val caption: FormattedText,
    ) : MessageContent() {
        override fun getConstructor(): Int = 596_945_783
    }

    public class MessagePaidMedia(
        @JvmField
        public val starCount: Long,
        @JvmField
        public val media: Array<PaidMedia>,
        @JvmField
        public val caption: FormattedText,
        @JvmField
        public val showCaptionAboveMedia: Boolean,
    ) : MessageContent() {
        override fun getConstructor(): Int = -724_750_073
    }

    public class MessagePhoto(
        @JvmField
        public val photo: Photo,
        @JvmField
        public val caption: FormattedText,
        @JvmField
        public val showCaptionAboveMedia: Boolean,
        @JvmField
        public val hasSpoiler: Boolean,
        @JvmField
        public val isSecret: Boolean,
    ) : MessageContent() {
        override fun getConstructor(): Int = 1_967_947_295
    }

    public class MessageSticker(
        @JvmField
        public val sticker: Sticker,
        @JvmField
        public val isPremium: Boolean,
    ) : MessageContent() {
        override fun getConstructor(): Int = -437_199_670
    }

    public class MessageVideo(
        @JvmField
        public val video: Video,
        @JvmField
        public val alternativeVideos: Array<AlternativeVideo>,
        @JvmField
        public val cover: Photo?,
        @JvmField
        public val startTimestamp: Int,
        @JvmField
        public val caption: FormattedText,
        @JvmField
        public val showCaptionAboveMedia: Boolean,
        @JvmField
        public val hasSpoiler: Boolean,
        @JvmField
        public val isSecret: Boolean,
    ) : MessageContent() {
        override fun getConstructor(): Int = 374_791_437
    }

    public class MessageVideoNote(
        @JvmField
        public val videoNote: VideoNote,
        @JvmField
        public val isViewed: Boolean,
        @JvmField
        public val isSecret: Boolean,
    ) : MessageContent() {
        override fun getConstructor(): Int = 963_323_014
    }

    public class MessageVoiceNote(
        @JvmField
        public val voiceNote: VoiceNote,
        @JvmField
        public val caption: FormattedText,
        @JvmField
        public val isListened: Boolean,
    ) : MessageContent() {
        override fun getConstructor(): Int = 527_777_781
    }

    public class MessageExpiredPhoto() : MessageContent() {
        override fun getConstructor(): Int = -1_404_641_801
    }

    public class MessageExpiredVideo() : MessageContent() {
        override fun getConstructor(): Int = -1_212_209_981
    }

    public class MessageExpiredVideoNote() : MessageContent() {
        override fun getConstructor(): Int = 599_540_711
    }

    public class MessageExpiredVoiceNote() : MessageContent() {
        override fun getConstructor(): Int = 143_684_989
    }

    public class MessageLocation(
        @JvmField
        public val location: Location,
        @JvmField
        public val livePeriod: Int,
        @JvmField
        public val expiresIn: Int,
        @JvmField
        public val heading: Int,
        @JvmField
        public val proximityAlertRadius: Int,
    ) : MessageContent() {
        override fun getConstructor(): Int = 303_973_492
    }

    public class MessageVenue(
        @JvmField
        public val venue: Venue,
    ) : MessageContent() {
        override fun getConstructor(): Int = -2_146_492_043
    }

    public class MessageContact(
        @JvmField
        public val contact: Contact,
    ) : MessageContent() {
        override fun getConstructor(): Int = -512_684_966
    }

    public class MessageAnimatedEmoji(
        @JvmField
        public val animatedEmoji: AnimatedEmoji,
        @JvmField
        public val emoji: String,
    ) : MessageContent() {
        override fun getConstructor(): Int = 908_195_298
    }

    public class MessageDice(
        @JvmField
        public val initialState: DiceStickers?,
        @JvmField
        public val finalState: DiceStickers?,
        @JvmField
        public val emoji: String,
        @JvmField
        public val value: Int,
        @JvmField
        public val successAnimationFrameNumber: Int,
    ) : MessageContent() {
        override fun getConstructor(): Int = 1_115_779_641
    }

    public class MessageGame(
        @JvmField
        public val game: Game,
    ) : MessageContent() {
        override fun getConstructor(): Int = -69_441_162
    }

    public class MessagePoll(
        @JvmField
        public val poll: Poll,
    ) : MessageContent() {
        override fun getConstructor(): Int = -662_130_099
    }

    public class MessageStory(
        @JvmField
        public val storyPosterChatId: Long,
        @JvmField
        public val storyId: Int,
        @JvmField
        public val viaMention: Boolean,
    ) : MessageContent() {
        override fun getConstructor(): Int = 1_514_236_353
    }

    public class MessageInvoice(
        @JvmField
        public val productInfo: ProductInfo,
        @JvmField
        public val currency: String,
        @JvmField
        public val totalAmount: Long,
        @JvmField
        public val startParameter: String,
        @JvmField
        public val isTest: Boolean,
        @JvmField
        public val needShippingAddress: Boolean,
        @JvmField
        public val receiptMessageId: Long,
        @JvmField
        public val paidMedia: PaidMedia?,
        @JvmField
        public val paidMediaCaption: FormattedText?,
    ) : MessageContent() {
        override fun getConstructor(): Int = 263_060_806
    }

    public class MessageCall(
        @JvmField
        public val isVideo: Boolean,
        @JvmField
        public val discardReason: CallDiscardReason,
        @JvmField
        public val duration: Int,
    ) : MessageContent() {
        override fun getConstructor(): Int = 538_893_824
    }

    public class MessageGroupCall(
        @JvmField
        public val isActive: Boolean,
        @JvmField
        public val wasMissed: Boolean,
        @JvmField
        public val isVideo: Boolean,
        @JvmField
        public val duration: Int,
        @JvmField
        public val otherParticipantIds: Array<MessageSender>,
    ) : MessageContent() {
        override fun getConstructor(): Int = 1_370_396_295
    }

    public class MessageVideoChatScheduled(
        @JvmField
        public val groupCallId: Int,
        @JvmField
        public val startDate: Int,
    ) : MessageContent() {
        override fun getConstructor(): Int = -1_855_185_481
    }

    public class MessageVideoChatStarted(
        @JvmField
        public val groupCallId: Int,
    ) : MessageContent() {
        override fun getConstructor(): Int = 521_225_561
    }

    public class MessageVideoChatEnded(
        @JvmField
        public val duration: Int,
    ) : MessageContent() {
        override fun getConstructor(): Int = 2_032_544_855
    }

    public class MessageInviteVideoChatParticipants(
        @JvmField
        public val groupCallId: Int,
        @JvmField
        public val userIds: LongArray,
    ) : MessageContent() {
        override fun getConstructor(): Int = -1_459_065_585
    }

    public class MessageBasicGroupChatCreate(
        @JvmField
        public val title: String,
        @JvmField
        public val memberUserIds: LongArray,
    ) : MessageContent() {
        override fun getConstructor(): Int = 795_404_060
    }

    public class MessageSupergroupChatCreate(
        @JvmField
        public val title: String,
    ) : MessageContent() {
        override fun getConstructor(): Int = -434_325_733
    }

    public class MessageChatChangeTitle(
        @JvmField
        public val title: String,
    ) : MessageContent() {
        override fun getConstructor(): Int = 748_272_449
    }

    public class MessageChatChangePhoto(
        @JvmField
        public val photo: ChatPhoto,
    ) : MessageContent() {
        override fun getConstructor(): Int = -813_415_093
    }

    public class MessageChatDeletePhoto() : MessageContent() {
        override fun getConstructor(): Int = -184_374_809
    }

    public class MessageChatAddMembers(
        @JvmField
        public val memberUserIds: LongArray,
    ) : MessageContent() {
        override fun getConstructor(): Int = 1_701_117_908
    }

    public class MessageChatJoinByLink() : MessageContent() {
        override fun getConstructor(): Int = 1_846_493_311
    }

    public class MessageChatJoinByRequest() : MessageContent() {
        override fun getConstructor(): Int = 1_195_428_732
    }

    public class MessageChatDeleteMember(
        @JvmField
        public val userId: Long,
    ) : MessageContent() {
        override fun getConstructor(): Int = 938_029_481
    }

    public class MessageChatUpgradeTo(
        @JvmField
        public val supergroupId: Long,
    ) : MessageContent() {
        override fun getConstructor(): Int = 104_813_723
    }

    public class MessageChatUpgradeFrom(
        @JvmField
        public val title: String,
        @JvmField
        public val basicGroupId: Long,
    ) : MessageContent() {
        override fun getConstructor(): Int = 325_954_268
    }

    public class MessagePinMessage(
        @JvmField
        public val messageId: Long,
    ) : MessageContent() {
        override fun getConstructor(): Int = 953_503_801
    }

    public class MessageScreenshotTaken() : MessageContent() {
        override fun getConstructor(): Int = -1_564_971_605
    }

    public class MessageChatSetBackground(
        @JvmField
        public val oldBackgroundMessageId: Long,
        @JvmField
        public val background: ChatBackground,
        @JvmField
        public val onlyForSelf: Boolean,
    ) : MessageContent() {
        override fun getConstructor(): Int = 1_029_536_832
    }

    public class MessageChatSetTheme(
        @JvmField
        public val themeName: String,
    ) : MessageContent() {
        override fun getConstructor(): Int = -1_716_612_088
    }

    public class MessageChatSetMessageAutoDeleteTime(
        @JvmField
        public val messageAutoDeleteTime: Int,
        @JvmField
        public val fromUserId: Long,
    ) : MessageContent() {
        override fun getConstructor(): Int = 1_637_745_966
    }

    public class MessageChatBoost(
        @JvmField
        public val boostCount: Int,
    ) : MessageContent() {
        override fun getConstructor(): Int = 1_583_310_219
    }

    public class MessageForumTopicCreated(
        @JvmField
        public val name: String,
        @JvmField
        public val icon: ForumTopicIcon,
    ) : MessageContent() {
        override fun getConstructor(): Int = -1_194_440_751
    }

    public class MessageForumTopicEdited(
        @JvmField
        public val name: String,
        @JvmField
        public val editIconCustomEmojiId: Boolean,
        @JvmField
        public val iconCustomEmojiId: Long,
    ) : MessageContent() {
        override fun getConstructor(): Int = 12_629_888
    }

    public class MessageForumTopicIsClosedToggled(
        @JvmField
        public val isClosed: Boolean,
    ) : MessageContent() {
        override fun getConstructor(): Int = 1_264_029_664
    }

    public class MessageForumTopicIsHiddenToggled(
        @JvmField
        public val isHidden: Boolean,
    ) : MessageContent() {
        override fun getConstructor(): Int = -1_751_936_002
    }

    public class MessageSuggestProfilePhoto(
        @JvmField
        public val photo: ChatPhoto,
    ) : MessageContent() {
        override fun getConstructor(): Int = -1_251_926_297
    }

    public class MessageCustomServiceAction(
        @JvmField
        public val text: String,
    ) : MessageContent() {
        override fun getConstructor(): Int = 1_435_879_282
    }

    public class MessageGameScore(
        @JvmField
        public val gameMessageId: Long,
        @JvmField
        public val gameId: Long,
        @JvmField
        public val score: Int,
    ) : MessageContent() {
        override fun getConstructor(): Int = 1_344_904_575
    }

    public class MessagePaymentSuccessful(
        @JvmField
        public val invoiceChatId: Long,
        @JvmField
        public val invoiceMessageId: Long,
        @JvmField
        public val currency: String,
        @JvmField
        public val totalAmount: Long,
        @JvmField
        public val subscriptionUntilDate: Int,
        @JvmField
        public val isRecurring: Boolean,
        @JvmField
        public val isFirstRecurring: Boolean,
        @JvmField
        public val invoiceName: String,
    ) : MessageContent() {
        override fun getConstructor(): Int = 1_046_878_481
    }

    public class MessagePaymentSuccessfulBot(
        @JvmField
        public val currency: String,
        @JvmField
        public val totalAmount: Long,
        @JvmField
        public val subscriptionUntilDate: Int,
        @JvmField
        public val isRecurring: Boolean,
        @JvmField
        public val isFirstRecurring: Boolean,
        @JvmField
        public val invoicePayload: ByteArray,
        @JvmField
        public val shippingOptionId: String,
        @JvmField
        public val orderInfo: OrderInfo?,
        @JvmField
        public val telegramPaymentChargeId: String,
        @JvmField
        public val providerPaymentChargeId: String,
    ) : MessageContent() {
        override fun getConstructor(): Int = -949_596_737
    }

    public class MessagePaymentRefunded(
        @JvmField
        public val ownerId: MessageSender,
        @JvmField
        public val currency: String,
        @JvmField
        public val totalAmount: Long,
        @JvmField
        public val invoicePayload: ByteArray,
        @JvmField
        public val telegramPaymentChargeId: String,
        @JvmField
        public val providerPaymentChargeId: String,
    ) : MessageContent() {
        override fun getConstructor(): Int = 297_580_787
    }

    public class MessageGiftedPremium(
        @JvmField
        public val gifterUserId: Long,
        @JvmField
        public val receiverUserId: Long,
        @JvmField
        public val text: FormattedText,
        @JvmField
        public val currency: String,
        @JvmField
        public val amount: Long,
        @JvmField
        public val cryptocurrency: String,
        @JvmField
        public val cryptocurrencyAmount: Long,
        @JvmField
        public val monthCount: Int,
        @JvmField
        public val sticker: Sticker?,
    ) : MessageContent() {
        override fun getConstructor(): Int = -456_073_094
    }

    public class MessagePremiumGiftCode(
        @JvmField
        public val creatorId: MessageSender?,
        @JvmField
        public val text: FormattedText,
        @JvmField
        public val isFromGiveaway: Boolean,
        @JvmField
        public val isUnclaimed: Boolean,
        @JvmField
        public val currency: String,
        @JvmField
        public val amount: Long,
        @JvmField
        public val cryptocurrency: String,
        @JvmField
        public val cryptocurrencyAmount: Long,
        @JvmField
        public val monthCount: Int,
        @JvmField
        public val sticker: Sticker?,
        @JvmField
        public val code: String,
    ) : MessageContent() {
        override fun getConstructor(): Int = 701_640_270
    }

    public class MessageGiveawayCreated(
        @JvmField
        public val starCount: Long,
    ) : MessageContent() {
        override fun getConstructor(): Int = 972_252_063
    }

    public class MessageGiveaway(
        @JvmField
        public val parameters: GiveawayParameters,
        @JvmField
        public val winnerCount: Int,
        @JvmField
        public val prize: GiveawayPrize,
        @JvmField
        public val sticker: Sticker?,
    ) : MessageContent() {
        override fun getConstructor(): Int = -345_908_568
    }

    public class MessageGiveawayCompleted(
        @JvmField
        public val giveawayMessageId: Long,
        @JvmField
        public val winnerCount: Int,
        @JvmField
        public val isStarGiveaway: Boolean,
        @JvmField
        public val unclaimedPrizeCount: Int,
    ) : MessageContent() {
        override fun getConstructor(): Int = -467_351_305
    }

    public class MessageGiveawayWinners(
        @JvmField
        public val boostedChatId: Long,
        @JvmField
        public val giveawayMessageId: Long,
        @JvmField
        public val additionalChatCount: Int,
        @JvmField
        public val actualWinnersSelectionDate: Int,
        @JvmField
        public val onlyNewMembers: Boolean,
        @JvmField
        public val wasRefunded: Boolean,
        @JvmField
        public val prize: GiveawayPrize,
        @JvmField
        public val prizeDescription: String,
        @JvmField
        public val winnerCount: Int,
        @JvmField
        public val winnerUserIds: LongArray,
        @JvmField
        public val unclaimedPrizeCount: Int,
    ) : MessageContent() {
        override fun getConstructor(): Int = 2_098_585_405
    }

    public class MessageGiftedStars(
        @JvmField
        public val gifterUserId: Long,
        @JvmField
        public val receiverUserId: Long,
        @JvmField
        public val currency: String,
        @JvmField
        public val amount: Long,
        @JvmField
        public val cryptocurrency: String,
        @JvmField
        public val cryptocurrencyAmount: Long,
        @JvmField
        public val starCount: Long,
        @JvmField
        public val transactionId: String,
        @JvmField
        public val sticker: Sticker?,
    ) : MessageContent() {
        override fun getConstructor(): Int = 1_102_954_151
    }

    public class MessageGiveawayPrizeStars(
        @JvmField
        public val starCount: Long,
        @JvmField
        public val transactionId: String,
        @JvmField
        public val boostedChatId: Long,
        @JvmField
        public val giveawayMessageId: Long,
        @JvmField
        public val isUnclaimed: Boolean,
        @JvmField
        public val sticker: Sticker?,
    ) : MessageContent() {
        override fun getConstructor(): Int = -1_441_833_501
    }

    public class MessageGift(
        @JvmField
        public val gift: Gift,
        @JvmField
        public val senderId: MessageSender,
        @JvmField
        public val receivedGiftId: String,
        @JvmField
        public val text: FormattedText,
        @JvmField
        public val sellStarCount: Long,
        @JvmField
        public val prepaidUpgradeStarCount: Long,
        @JvmField
        public val isPrivate: Boolean,
        @JvmField
        public val isSaved: Boolean,
        @JvmField
        public val canBeUpgraded: Boolean,
        @JvmField
        public val wasConverted: Boolean,
        @JvmField
        public val wasUpgraded: Boolean,
        @JvmField
        public val wasRefunded: Boolean,
        @JvmField
        public val upgradedReceivedGiftId: String,
    ) : MessageContent() {
        override fun getConstructor(): Int = 2_090_444_659
    }

    public class MessageUpgradedGift(
        @JvmField
        public val gift: UpgradedGift,
        @JvmField
        public val senderId: MessageSender?,
        @JvmField
        public val receivedGiftId: String,
        @JvmField
        public val isUpgrade: Boolean,
        @JvmField
        public val isSaved: Boolean,
        @JvmField
        public val canBeTransferred: Boolean,
        @JvmField
        public val wasTransferred: Boolean,
        @JvmField
        public val transferStarCount: Long,
        @JvmField
        public val exportDate: Int,
    ) : MessageContent() {
        override fun getConstructor(): Int = -1_068_647_053
    }

    public class MessageRefundedUpgradedGift(
        @JvmField
        public val gift: Gift,
        @JvmField
        public val senderId: MessageSender,
        @JvmField
        public val isUpgrade: Boolean,
    ) : MessageContent() {
        override fun getConstructor(): Int = -1_308_949_479
    }

    public class MessagePaidMessagesRefunded(
        @JvmField
        public val messageCount: Int,
        @JvmField
        public val starCount: Long,
    ) : MessageContent() {
        override fun getConstructor(): Int = 580_403_343
    }

    public class MessagePaidMessagePriceChanged(
        @JvmField
        public val paidMessageStarCount: Long,
    ) : MessageContent() {
        override fun getConstructor(): Int = -344_945_397
    }

    public class MessageContactRegistered() : MessageContent() {
        override fun getConstructor(): Int = -1_502_020_353
    }

    public class MessageUsersShared(
        @JvmField
        public val users: Array<SharedUser>,
        @JvmField
        public val buttonId: Int,
    ) : MessageContent() {
        override fun getConstructor(): Int = -842_442_318
    }

    public class MessageChatShared(
        @JvmField
        public val chat: SharedChat,
        @JvmField
        public val buttonId: Int,
    ) : MessageContent() {
        override fun getConstructor(): Int = -1_362_699_935
    }

    public class MessageBotWriteAccessAllowed(
        @JvmField
        public val reason: BotWriteAccessAllowReason,
    ) : MessageContent() {
        override fun getConstructor(): Int = -1_702_185_036
    }

    public class MessageWebAppDataSent(
        @JvmField
        public val buttonText: String,
    ) : MessageContent() {
        override fun getConstructor(): Int = -83_674_862
    }

    public class MessageWebAppDataReceived(
        @JvmField
        public val buttonText: String,
        @JvmField
        public val data: String,
    ) : MessageContent() {
        override fun getConstructor(): Int = -8_578_539
    }

    public class MessagePassportDataSent(
        @JvmField
        public val types: Array<PassportElementType>,
    ) : MessageContent() {
        override fun getConstructor(): Int = 1_017_405_171
    }

    public class MessagePassportDataReceived(
        @JvmField
        public val elements: Array<EncryptedPassportElement>,
        @JvmField
        public val credentials: EncryptedCredentials,
    ) : MessageContent() {
        override fun getConstructor(): Int = -1_367_863_624
    }

    public class MessageProximityAlertTriggered(
        @JvmField
        public val travelerId: MessageSender,
        @JvmField
        public val watcherId: MessageSender,
        @JvmField
        public val distance: Int,
    ) : MessageContent() {
        override fun getConstructor(): Int = 67_761_875
    }

    public class MessageUnsupported() : MessageContent() {
        override fun getConstructor(): Int = -1_816_726_139
    }

    public class MessageCopyOptions(
        @JvmField
        public val sendCopy: Boolean,
        @JvmField
        public val replaceCaption: Boolean,
        @JvmField
        public val newCaption: FormattedText?,
        @JvmField
        public val newShowCaptionAboveMedia: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_079_772_090
    }

    public class MessageEffect(
        @JvmField
        public val id: Long,
        @JvmField
        public val staticIcon: Sticker?,
        @JvmField
        public val emoji: String,
        @JvmField
        public val isPremium: Boolean,
        @JvmField
        public val type: MessageEffectType,
    ) : Object() {
        override fun getConstructor(): Int = -1_758_836_433
    }

    public abstract class MessageEffectType() : Object()

    public class MessageEffectTypeEmojiReaction(
        @JvmField
        public val selectAnimation: Sticker,
        @JvmField
        public val effectAnimation: Sticker,
    ) : MessageEffectType() {
        override fun getConstructor(): Int = 1_756_079_678
    }

    public class MessageEffectTypePremiumSticker(
        @JvmField
        public val sticker: Sticker,
    ) : MessageEffectType() {
        override fun getConstructor(): Int = 1_637_231_609
    }

    public abstract class MessageFileType() : Object()

    public class MessageFileTypePrivate(
        @JvmField
        public val name: String,
    ) : MessageFileType() {
        override fun getConstructor(): Int = -521_908_524
    }

    public class MessageFileTypeGroup(
        @JvmField
        public val title: String,
    ) : MessageFileType() {
        override fun getConstructor(): Int = -219_836_568
    }

    public class MessageFileTypeUnknown() : MessageFileType() {
        override fun getConstructor(): Int = 1_176_353_458
    }

    public class MessageForwardInfo(
        @JvmField
        public val origin: MessageOrigin,
        @JvmField
        public val date: Int,
        @JvmField
        public val source: ForwardSource?,
        @JvmField
        public val publicServiceAnnouncementType: String,
    ) : Object() {
        override fun getConstructor(): Int = -880_313_475
    }

    public class MessageImportInfo(
        @JvmField
        public val senderName: String,
        @JvmField
        public val date: Int,
    ) : Object() {
        override fun getConstructor(): Int = -421_549_105
    }

    public class MessageInteractionInfo(
        @JvmField
        public val viewCount: Int,
        @JvmField
        public val forwardCount: Int,
        @JvmField
        public val replyInfo: MessageReplyInfo?,
        @JvmField
        public val reactions: MessageReactions?,
    ) : Object() {
        override fun getConstructor(): Int = 733_797_893
    }

    public class MessageLink(
        @JvmField
        public val link: String,
        @JvmField
        public val isPublic: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -1_354_089_818
    }

    public class MessageLinkInfo(
        @JvmField
        public val isPublic: Boolean,
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageThreadId: Long,
        @JvmField
        public val message: Message?,
        @JvmField
        public val mediaTimestamp: Int,
        @JvmField
        public val forAlbum: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 731_315_024
    }

    public abstract class MessageOrigin() : Object()

    public class MessageOriginUser(
        @JvmField
        public val senderUserId: Long,
    ) : MessageOrigin() {
        override fun getConstructor(): Int = -1_677_684_669
    }

    public class MessageOriginHiddenUser(
        @JvmField
        public val senderName: String,
    ) : MessageOrigin() {
        override fun getConstructor(): Int = -317_971_494
    }

    public class MessageOriginChat(
        @JvmField
        public val senderChatId: Long,
        @JvmField
        public val authorSignature: String,
    ) : MessageOrigin() {
        override fun getConstructor(): Int = -205_824_332
    }

    public class MessageOriginChannel(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val authorSignature: String,
    ) : MessageOrigin() {
        override fun getConstructor(): Int = -1_451_535_938
    }

    public class MessagePosition(
        @JvmField
        public val position: Int,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val date: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_292_189_935
    }

    public class MessagePositions(
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val positions: Array<MessagePosition>,
    ) : Object() {
        override fun getConstructor(): Int = -1_930_466_649
    }

    public class MessageProperties(
        @JvmField
        public val canBeCopiedToSecretChat: Boolean,
        @JvmField
        public val canBeDeletedOnlyForSelf: Boolean,
        @JvmField
        public val canBeDeletedForAllUsers: Boolean,
        @JvmField
        public val canBeEdited: Boolean,
        @JvmField
        public val canBeForwarded: Boolean,
        @JvmField
        public val canBePaid: Boolean,
        @JvmField
        public val canBePinned: Boolean,
        @JvmField
        public val canBeReplied: Boolean,
        @JvmField
        public val canBeRepliedInAnotherChat: Boolean,
        @JvmField
        public val canBeSaved: Boolean,
        @JvmField
        public val canBeSharedInStory: Boolean,
        @JvmField
        public val canEditMedia: Boolean,
        @JvmField
        public val canEditSchedulingState: Boolean,
        @JvmField
        public val canGetEmbeddingCode: Boolean,
        @JvmField
        public val canGetLink: Boolean,
        @JvmField
        public val canGetMediaTimestampLinks: Boolean,
        @JvmField
        public val canGetMessageThread: Boolean,
        @JvmField
        public val canGetReadDate: Boolean,
        @JvmField
        public val canGetStatistics: Boolean,
        @JvmField
        public val canGetViewers: Boolean,
        @JvmField
        public val canRecognizeSpeech: Boolean,
        @JvmField
        public val canReportChat: Boolean,
        @JvmField
        public val canReportReactions: Boolean,
        @JvmField
        public val canReportSupergroupSpam: Boolean,
        @JvmField
        public val canSetFactCheck: Boolean,
        @JvmField
        public val needShowStatistics: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -27_014_655
    }

    public class MessageReaction(
        @JvmField
        public val type: ReactionType,
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val isChosen: Boolean,
        @JvmField
        public val usedSenderId: MessageSender?,
        @JvmField
        public val recentSenderIds: Array<MessageSender>,
    ) : Object() {
        override fun getConstructor(): Int = -1_093_994_369
    }

    public class MessageReactions(
        @JvmField
        public val reactions: Array<MessageReaction>,
        @JvmField
        public val areTags: Boolean,
        @JvmField
        public val paidReactors: Array<PaidReactor>,
        @JvmField
        public val canGetAddedReactions: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_475_966_817
    }

    public abstract class MessageReadDate() : Object()

    public class MessageReadDateRead(
        @JvmField
        public val readDate: Int,
    ) : MessageReadDate() {
        override fun getConstructor(): Int = 1_972_186_672
    }

    public class MessageReadDateUnread() : MessageReadDate() {
        override fun getConstructor(): Int = 397_549_868
    }

    public class MessageReadDateTooOld() : MessageReadDate() {
        override fun getConstructor(): Int = -1_233_773_024
    }

    public class MessageReadDateUserPrivacyRestricted() : MessageReadDate() {
        override fun getConstructor(): Int = -1_282_567_130
    }

    public class MessageReadDateMyPrivacyRestricted() : MessageReadDate() {
        override fun getConstructor(): Int = -693_971_852
    }

    public class MessageReplyInfo(
        @JvmField
        public val replyCount: Int,
        @JvmField
        public val recentReplierIds: Array<MessageSender>,
        @JvmField
        public val lastReadInboxMessageId: Long,
        @JvmField
        public val lastReadOutboxMessageId: Long,
        @JvmField
        public val lastMessageId: Long,
    ) : Object() {
        override fun getConstructor(): Int = -2_093_702_263
    }

    public abstract class MessageReplyTo() : Object()

    public class MessageReplyToMessage(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val quote: TextQuote?,
        @JvmField
        public val origin: MessageOrigin?,
        @JvmField
        public val originSendDate: Int,
        @JvmField
        public val content: MessageContent?,
    ) : MessageReplyTo() {
        override fun getConstructor(): Int = -300_918_393
    }

    public class MessageReplyToStory(
        @JvmField
        public val storyPosterChatId: Long,
        @JvmField
        public val storyId: Int,
    ) : MessageReplyTo() {
        override fun getConstructor(): Int = -674_492_596
    }

    public abstract class MessageSchedulingState() : Object()

    public class MessageSchedulingStateSendAtDate(
        @JvmField
        public val sendDate: Int,
    ) : MessageSchedulingState() {
        override fun getConstructor(): Int = -1_485_570_073
    }

    public class MessageSchedulingStateSendWhenOnline() : MessageSchedulingState() {
        override fun getConstructor(): Int = 2_092_947_464
    }

    public class MessageSchedulingStateSendWhenVideoProcessed(
        @JvmField
        public val sendDate: Int,
    ) : MessageSchedulingState() {
        override fun getConstructor(): Int = 2_101_578_734
    }

    public abstract class MessageSelfDestructType() : Object()

    public class MessageSelfDestructTypeTimer(
        @JvmField
        public val selfDestructTime: Int,
    ) : MessageSelfDestructType() {
        override fun getConstructor(): Int = 1_351_440_333
    }

    public class MessageSelfDestructTypeImmediately() : MessageSelfDestructType() {
        override fun getConstructor(): Int = -1_036_218_363
    }

    public class MessageSendOptions(
        @JvmField
        public val disableNotification: Boolean,
        @JvmField
        public val fromBackground: Boolean,
        @JvmField
        public val protectContent: Boolean,
        @JvmField
        public val allowPaidBroadcast: Boolean,
        @JvmField
        public val paidMessageStarCount: Long,
        @JvmField
        public val updateOrderOfInstalledStickerSets: Boolean,
        @JvmField
        public val schedulingState: MessageSchedulingState?,
        @JvmField
        public val effectId: Long,
        @JvmField
        public val sendingId: Int,
        @JvmField
        public val onlyPreview: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -128_496_262
    }

    public abstract class MessageSender() : Object()

    public class MessageSenderUser(
        @JvmField
        public val userId: Long,
    ) : MessageSender() {
        override fun getConstructor(): Int = -336_109_341
    }

    public class MessageSenderChat(
        @JvmField
        public val chatId: Long,
    ) : MessageSender() {
        override fun getConstructor(): Int = -239_660_751
    }

    public class MessageSenders(
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val senders: Array<MessageSender>,
    ) : Object() {
        override fun getConstructor(): Int = -690_158_467
    }

    public abstract class MessageSendingState() : Object()

    public class MessageSendingStatePending(
        @JvmField
        public val sendingId: Int,
    ) : MessageSendingState() {
        override fun getConstructor(): Int = -215_260_236
    }

    public class MessageSendingStateFailed(
        @JvmField
        public val error: Error,
        @JvmField
        public val canRetry: Boolean,
        @JvmField
        public val needAnotherSender: Boolean,
        @JvmField
        public val needAnotherReplyQuote: Boolean,
        @JvmField
        public val needDropReply: Boolean,
        @JvmField
        public val requiredPaidMessageStarCount: Long,
        @JvmField
        public val retryAfter: Double,
    ) : MessageSendingState() {
        override fun getConstructor(): Int = -777_630_522
    }

    public abstract class MessageSource() : Object()

    public class MessageSourceChatHistory() : MessageSource() {
        override fun getConstructor(): Int = -1_090_386_116
    }

    public class MessageSourceMessageThreadHistory() : MessageSource() {
        override fun getConstructor(): Int = 290_427_142
    }

    public class MessageSourceForumTopicHistory() : MessageSource() {
        override fun getConstructor(): Int = -1_518_064_457
    }

    public class MessageSourceHistoryPreview() : MessageSource() {
        override fun getConstructor(): Int = 1_024_254_993
    }

    public class MessageSourceChatList() : MessageSource() {
        override fun getConstructor(): Int = -2_047_406_102
    }

    public class MessageSourceSearch() : MessageSource() {
        override fun getConstructor(): Int = 1_921_333_105
    }

    public class MessageSourceChatEventLog() : MessageSource() {
        override fun getConstructor(): Int = -1_028_777_540
    }

    public class MessageSourceNotification() : MessageSource() {
        override fun getConstructor(): Int = -1_046_406_163
    }

    public class MessageSourceScreenshot() : MessageSource() {
        override fun getConstructor(): Int = 469_982_474
    }

    public class MessageSourceOther() : MessageSource() {
        override fun getConstructor(): Int = 901_818_114
    }

    public class MessageSponsor(
        @JvmField
        public val url: String,
        @JvmField
        public val photo: Photo?,
        @JvmField
        public val info: String,
    ) : Object() {
        override fun getConstructor(): Int = 2_009_223_646
    }

    public class MessageStatistics(
        @JvmField
        public val messageInteractionGraph: StatisticalGraph,
        @JvmField
        public val messageReactionGraph: StatisticalGraph,
    ) : Object() {
        override fun getConstructor(): Int = -1_563_537_657
    }

    public class MessageThreadInfo(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageThreadId: Long,
        @JvmField
        public val replyInfo: MessageReplyInfo?,
        @JvmField
        public val unreadMessageCount: Int,
        @JvmField
        public val messages: Array<Message>,
        @JvmField
        public val draftMessage: DraftMessage?,
    ) : Object() {
        override fun getConstructor(): Int = -248_536_056
    }

    public class MessageViewer(
        @JvmField
        public val userId: Long,
        @JvmField
        public val viewDate: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_458_639_309
    }

    public class MessageViewers(
        @JvmField
        public val viewers: Array<MessageViewer>,
    ) : Object() {
        override fun getConstructor(): Int = 2_116_480_287
    }

    public class Messages(
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val messages: Array<Message>?,
    ) : Object() {
        override fun getConstructor(): Int = -16_498_159
    }

    public class Minithumbnail(
        @JvmField
        public val width: Int,
        @JvmField
        public val height: Int,
        @JvmField
        public val data: ByteArray,
    ) : Object() {
        override fun getConstructor(): Int = -328_540_758
    }

    public class NetworkStatistics(
        @JvmField
        public val sinceDate: Int,
        @JvmField
        public val entries: Array<NetworkStatisticsEntry>,
    ) : Object() {
        override fun getConstructor(): Int = 1_615_554_212
    }

    public abstract class NetworkStatisticsEntry() : Object()

    public class NetworkStatisticsEntryFile(
        @JvmField
        public val fileType: FileType?,
        @JvmField
        public val networkType: NetworkType,
        @JvmField
        public val sentBytes: Long,
        @JvmField
        public val receivedBytes: Long,
    ) : NetworkStatisticsEntry() {
        override fun getConstructor(): Int = 188_452_706
    }

    public class NetworkStatisticsEntryCall(
        @JvmField
        public val networkType: NetworkType,
        @JvmField
        public val sentBytes: Long,
        @JvmField
        public val receivedBytes: Long,
        @JvmField
        public val duration: Double,
    ) : NetworkStatisticsEntry() {
        override fun getConstructor(): Int = 737_000_365
    }

    public abstract class NetworkType() : Object()

    public class NetworkTypeNone() : NetworkType() {
        override fun getConstructor(): Int = -1_971_691_759
    }

    public class NetworkTypeMobile() : NetworkType() {
        override fun getConstructor(): Int = 819_228_239
    }

    public class NetworkTypeMobileRoaming() : NetworkType() {
        override fun getConstructor(): Int = -1_435_199_760
    }

    public class NetworkTypeWiFi() : NetworkType() {
        override fun getConstructor(): Int = -633_872_070
    }

    public class NetworkTypeOther() : NetworkType() {
        override fun getConstructor(): Int = 1_942_128_539
    }

    public class NewChatPrivacySettings(
        @JvmField
        public val allowNewChatsFromUnknownUsers: Boolean,
        @JvmField
        public val incomingPaidMessageStarCount: Long,
    ) : Object() {
        override fun getConstructor(): Int = 123_716_192
    }

    public class Notification(
        @JvmField
        public val id: Int,
        @JvmField
        public val date: Int,
        @JvmField
        public val isSilent: Boolean,
        @JvmField
        public val type: NotificationType,
    ) : Object() {
        override fun getConstructor(): Int = 788_743_120
    }

    public class NotificationGroup(
        @JvmField
        public val id: Int,
        @JvmField
        public val type: NotificationGroupType,
        @JvmField
        public val chatId: Long,
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val notifications: Array<Notification>,
    ) : Object() {
        override fun getConstructor(): Int = 780_691_541
    }

    public abstract class NotificationGroupType() : Object()

    public class NotificationGroupTypeMessages() : NotificationGroupType() {
        override fun getConstructor(): Int = -1_702_481_123
    }

    public class NotificationGroupTypeMentions() : NotificationGroupType() {
        override fun getConstructor(): Int = -2_050_324_051
    }

    public class NotificationGroupTypeSecretChat() : NotificationGroupType() {
        override fun getConstructor(): Int = 1_390_759_476
    }

    public class NotificationGroupTypeCalls() : NotificationGroupType() {
        override fun getConstructor(): Int = 1_379_123_538
    }

    public abstract class NotificationSettingsScope() : Object()

    public class NotificationSettingsScopePrivateChats() : NotificationSettingsScope() {
        override fun getConstructor(): Int = 937_446_759
    }

    public class NotificationSettingsScopeGroupChats() : NotificationSettingsScope() {
        override fun getConstructor(): Int = 1_212_142_067
    }

    public class NotificationSettingsScopeChannelChats() : NotificationSettingsScope() {
        override fun getConstructor(): Int = 548_013_448
    }

    public class NotificationSound(
        @JvmField
        public val id: Long,
        @JvmField
        public val duration: Int,
        @JvmField
        public val date: Int,
        @JvmField
        public val title: String,
        @JvmField
        public val data: String,
        @JvmField
        public val sound: File,
    ) : Object() {
        override fun getConstructor(): Int = -185_638_601
    }

    public class NotificationSounds(
        @JvmField
        public val notificationSounds: Array<NotificationSound>,
    ) : Object() {
        override fun getConstructor(): Int = -630_813_169
    }

    public abstract class NotificationType() : Object()

    public class NotificationTypeNewMessage(
        @JvmField
        public val message: Message,
        @JvmField
        public val showPreview: Boolean,
    ) : NotificationType() {
        override fun getConstructor(): Int = -254_745_614
    }

    public class NotificationTypeNewSecretChat() : NotificationType() {
        override fun getConstructor(): Int = 1_198_638_768
    }

    public class NotificationTypeNewCall(
        @JvmField
        public val callId: Int,
    ) : NotificationType() {
        override fun getConstructor(): Int = 1_712_734_585
    }

    public class NotificationTypeNewPushMessage(
        @JvmField
        public val messageId: Long,
        @JvmField
        public val senderId: MessageSender,
        @JvmField
        public val senderName: String,
        @JvmField
        public val isOutgoing: Boolean,
        @JvmField
        public val content: PushMessageContent,
    ) : NotificationType() {
        override fun getConstructor(): Int = -711_680_462
    }

    public class Ok() : Object() {
        override fun getConstructor(): Int = -722_616_727
    }

    public abstract class OptionValue() : Object()

    public class OptionValueBoolean(
        @JvmField
        public val value: Boolean,
    ) : OptionValue() {
        override fun getConstructor(): Int = 63_135_518
    }

    public class OptionValueEmpty() : OptionValue() {
        override fun getConstructor(): Int = 918_955_155
    }

    public class OptionValueInteger(
        @JvmField
        public val value: Long,
    ) : OptionValue() {
        override fun getConstructor(): Int = -186_858_780
    }

    public class OptionValueString(
        @JvmField
        public val value: String,
    ) : OptionValue() {
        override fun getConstructor(): Int = 756_248_212
    }

    public class OrderInfo(
        @JvmField
        public val name: String,
        @JvmField
        public val phoneNumber: String,
        @JvmField
        public val emailAddress: String,
        @JvmField
        public val shippingAddress: Address?,
    ) : Object() {
        override fun getConstructor(): Int = 783_997_294
    }

    public class Outline(
        @JvmField
        public val paths: Array<ClosedVectorPath>,
    ) : Object() {
        override fun getConstructor(): Int = -161_506_702
    }

    public abstract class PageBlock() : Object()

    public class PageBlockTitle(
        @JvmField
        public val title: RichText,
    ) : PageBlock() {
        override fun getConstructor(): Int = 1_629_664_784
    }

    public class PageBlockSubtitle(
        @JvmField
        public val subtitle: RichText,
    ) : PageBlock() {
        override fun getConstructor(): Int = 264_524_263
    }

    public class PageBlockAuthorDate(
        @JvmField
        public val author: RichText,
        @JvmField
        public val publishDate: Int,
    ) : PageBlock() {
        override fun getConstructor(): Int = 1_300_231_184
    }

    public class PageBlockHeader(
        @JvmField
        public val header: RichText,
    ) : PageBlock() {
        override fun getConstructor(): Int = 1_402_854_811
    }

    public class PageBlockSubheader(
        @JvmField
        public val subheader: RichText,
    ) : PageBlock() {
        override fun getConstructor(): Int = 1_263_956_774
    }

    public class PageBlockKicker(
        @JvmField
        public val kicker: RichText,
    ) : PageBlock() {
        override fun getConstructor(): Int = 1_361_282_635
    }

    public class PageBlockParagraph(
        @JvmField
        public val text: RichText,
    ) : PageBlock() {
        override fun getConstructor(): Int = 1_182_402_406
    }

    public class PageBlockPreformatted(
        @JvmField
        public val text: RichText,
        @JvmField
        public val language: String,
    ) : PageBlock() {
        override fun getConstructor(): Int = -1_066_346_178
    }

    public class PageBlockFooter(
        @JvmField
        public val footer: RichText,
    ) : PageBlock() {
        override fun getConstructor(): Int = 886_429_480
    }

    public class PageBlockDivider() : PageBlock() {
        override fun getConstructor(): Int = -618_614_392
    }

    public class PageBlockAnchor(
        @JvmField
        public val name: String,
    ) : PageBlock() {
        override fun getConstructor(): Int = -837_994_576
    }

    public class PageBlockList(
        @JvmField
        public val items: Array<PageBlockListItem>,
    ) : PageBlock() {
        override fun getConstructor(): Int = -1_037_074_852
    }

    public class PageBlockBlockQuote(
        @JvmField
        public val text: RichText,
        @JvmField
        public val credit: RichText,
    ) : PageBlock() {
        override fun getConstructor(): Int = 1_657_834_142
    }

    public class PageBlockPullQuote(
        @JvmField
        public val text: RichText,
        @JvmField
        public val credit: RichText,
    ) : PageBlock() {
        override fun getConstructor(): Int = 490_242_317
    }

    public class PageBlockAnimation(
        @JvmField
        public val animation: Animation?,
        @JvmField
        public val caption: PageBlockCaption,
        @JvmField
        public val needAutoplay: Boolean,
    ) : PageBlock() {
        override fun getConstructor(): Int = 1_355_669_513
    }

    public class PageBlockAudio(
        @JvmField
        public val audio: Audio?,
        @JvmField
        public val caption: PageBlockCaption,
    ) : PageBlock() {
        override fun getConstructor(): Int = -63_371_245
    }

    public class PageBlockPhoto(
        @JvmField
        public val photo: Photo?,
        @JvmField
        public val caption: PageBlockCaption,
        @JvmField
        public val url: String,
    ) : PageBlock() {
        override fun getConstructor(): Int = 417_601_156
    }

    public class PageBlockVideo(
        @JvmField
        public val video: Video?,
        @JvmField
        public val caption: PageBlockCaption,
        @JvmField
        public val needAutoplay: Boolean,
        @JvmField
        public val isLooped: Boolean,
    ) : PageBlock() {
        override fun getConstructor(): Int = 510_041_394
    }

    public class PageBlockVoiceNote(
        @JvmField
        public val voiceNote: VoiceNote?,
        @JvmField
        public val caption: PageBlockCaption,
    ) : PageBlock() {
        override fun getConstructor(): Int = 1_823_310_463
    }

    public class PageBlockCover(
        @JvmField
        public val cover: PageBlock,
    ) : PageBlock() {
        override fun getConstructor(): Int = 972_174_080
    }

    public class PageBlockEmbedded(
        @JvmField
        public val url: String,
        @JvmField
        public val html: String,
        @JvmField
        public val posterPhoto: Photo?,
        @JvmField
        public val width: Int,
        @JvmField
        public val height: Int,
        @JvmField
        public val caption: PageBlockCaption,
        @JvmField
        public val isFullWidth: Boolean,
        @JvmField
        public val allowScrolling: Boolean,
    ) : PageBlock() {
        override fun getConstructor(): Int = -1_942_577_763
    }

    public class PageBlockEmbeddedPost(
        @JvmField
        public val url: String,
        @JvmField
        public val author: String,
        @JvmField
        public val authorPhoto: Photo?,
        @JvmField
        public val date: Int,
        @JvmField
        public val pageBlocks: Array<PageBlock>,
        @JvmField
        public val caption: PageBlockCaption,
    ) : PageBlock() {
        override fun getConstructor(): Int = 397_600_949
    }

    public class PageBlockCollage(
        @JvmField
        public val pageBlocks: Array<PageBlock>,
        @JvmField
        public val caption: PageBlockCaption,
    ) : PageBlock() {
        override fun getConstructor(): Int = 1_163_760_110
    }

    public class PageBlockSlideshow(
        @JvmField
        public val pageBlocks: Array<PageBlock>,
        @JvmField
        public val caption: PageBlockCaption,
    ) : PageBlock() {
        override fun getConstructor(): Int = 539_217_375
    }

    public class PageBlockChatLink(
        @JvmField
        public val title: String,
        @JvmField
        public val photo: ChatPhotoInfo?,
        @JvmField
        public val accentColorId: Int,
        @JvmField
        public val username: String,
    ) : PageBlock() {
        override fun getConstructor(): Int = 1_646_188_731
    }

    public class PageBlockTable(
        @JvmField
        public val caption: RichText,
        @JvmField
        public val cells: Array<Array<PageBlockTableCell>>,
        @JvmField
        public val isBordered: Boolean,
        @JvmField
        public val isStriped: Boolean,
    ) : PageBlock() {
        override fun getConstructor(): Int = -942_649_288
    }

    public class PageBlockDetails(
        @JvmField
        public val header: RichText,
        @JvmField
        public val pageBlocks: Array<PageBlock>,
        @JvmField
        public val isOpen: Boolean,
    ) : PageBlock() {
        override fun getConstructor(): Int = -1_599_869_809
    }

    public class PageBlockRelatedArticles(
        @JvmField
        public val header: RichText,
        @JvmField
        public val articles: Array<PageBlockRelatedArticle>,
    ) : PageBlock() {
        override fun getConstructor(): Int = -1_807_324_374
    }

    public class PageBlockMap(
        @JvmField
        public val location: Location,
        @JvmField
        public val zoom: Int,
        @JvmField
        public val width: Int,
        @JvmField
        public val height: Int,
        @JvmField
        public val caption: PageBlockCaption,
    ) : PageBlock() {
        override fun getConstructor(): Int = 1_510_961_171
    }

    public class PageBlockCaption(
        @JvmField
        public val text: RichText,
        @JvmField
        public val credit: RichText,
    ) : Object() {
        override fun getConstructor(): Int = -1_180_064_650
    }

    public abstract class PageBlockHorizontalAlignment() : Object()

    public class PageBlockHorizontalAlignmentLeft() : PageBlockHorizontalAlignment() {
        override fun getConstructor(): Int = 848_701_417
    }

    public class PageBlockHorizontalAlignmentCenter() : PageBlockHorizontalAlignment() {
        override fun getConstructor(): Int = -1_009_203_990
    }

    public class PageBlockHorizontalAlignmentRight() : PageBlockHorizontalAlignment() {
        override fun getConstructor(): Int = 1_371_369_214
    }

    public class PageBlockListItem(
        @JvmField
        public val label: String,
        @JvmField
        public val pageBlocks: Array<PageBlock>,
    ) : Object() {
        override fun getConstructor(): Int = 323_186_259
    }

    public class PageBlockRelatedArticle(
        @JvmField
        public val url: String,
        @JvmField
        public val title: String,
        @JvmField
        public val description: String,
        @JvmField
        public val photo: Photo?,
        @JvmField
        public val author: String,
        @JvmField
        public val publishDate: Int,
    ) : Object() {
        override fun getConstructor(): Int = 481_199_251
    }

    public class PageBlockTableCell(
        @JvmField
        public val text: RichText?,
        @JvmField
        public val isHeader: Boolean,
        @JvmField
        public val colspan: Int,
        @JvmField
        public val rowspan: Int,
        @JvmField
        public val align: PageBlockHorizontalAlignment,
        @JvmField
        public val valign: PageBlockVerticalAlignment,
    ) : Object() {
        override fun getConstructor(): Int = 1_417_658_214
    }

    public abstract class PageBlockVerticalAlignment() : Object()

    public class PageBlockVerticalAlignmentTop() : PageBlockVerticalAlignment() {
        override fun getConstructor(): Int = 195_500_454
    }

    public class PageBlockVerticalAlignmentMiddle() : PageBlockVerticalAlignment() {
        override fun getConstructor(): Int = -2_123_096_587
    }

    public class PageBlockVerticalAlignmentBottom() : PageBlockVerticalAlignment() {
        override fun getConstructor(): Int = 2_092_531_158
    }

    public abstract class PaidMedia() : Object()

    public class PaidMediaPreview(
        @JvmField
        public val width: Int,
        @JvmField
        public val height: Int,
        @JvmField
        public val duration: Int,
        @JvmField
        public val minithumbnail: Minithumbnail?,
    ) : PaidMedia() {
        override fun getConstructor(): Int = -1_128_151_948
    }

    public class PaidMediaPhoto(
        @JvmField
        public val photo: Photo,
    ) : PaidMedia() {
        override fun getConstructor(): Int = -1_165_863_654
    }

    public class PaidMediaVideo(
        @JvmField
        public val video: Video,
        @JvmField
        public val cover: Photo?,
        @JvmField
        public val startTimestamp: Int,
    ) : PaidMedia() {
        override fun getConstructor(): Int = 870_838_318
    }

    public class PaidMediaUnsupported() : PaidMedia() {
        override fun getConstructor(): Int = 112_999_974
    }

    public abstract class PaidReactionType() : Object()

    public class PaidReactionTypeRegular() : PaidReactionType() {
        override fun getConstructor(): Int = -1_199_187_333
    }

    public class PaidReactionTypeAnonymous() : PaidReactionType() {
        override fun getConstructor(): Int = 47_892_621
    }

    public class PaidReactionTypeChat(
        @JvmField
        public val chatId: Long,
    ) : PaidReactionType() {
        override fun getConstructor(): Int = -675_782_044
    }

    public class PaidReactor(
        @JvmField
        public val senderId: MessageSender?,
        @JvmField
        public val starCount: Int,
        @JvmField
        public val isTop: Boolean,
        @JvmField
        public val isMe: Boolean,
        @JvmField
        public val isAnonymous: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -1_657_303_032
    }

    public class PassportAuthorizationForm(
        @JvmField
        public val id: Int,
        @JvmField
        public val requiredElements: Array<PassportRequiredElement>,
        @JvmField
        public val privacyPolicyUrl: String,
    ) : Object() {
        override fun getConstructor(): Int = -1_070_673_218
    }

    public abstract class PassportElement() : Object()

    public class PassportElementPersonalDetails(
        @JvmField
        public val personalDetails: PersonalDetails,
    ) : PassportElement() {
        override fun getConstructor(): Int = 1_217_724_035
    }

    public class PassportElementPassport(
        @JvmField
        public val passport: IdentityDocument,
    ) : PassportElement() {
        override fun getConstructor(): Int = -263_985_373
    }

    public class PassportElementDriverLicense(
        @JvmField
        public val driverLicense: IdentityDocument,
    ) : PassportElement() {
        override fun getConstructor(): Int = 1_643_580_589
    }

    public class PassportElementIdentityCard(
        @JvmField
        public val identityCard: IdentityDocument,
    ) : PassportElement() {
        override fun getConstructor(): Int = 2_083_775_797
    }

    public class PassportElementInternalPassport(
        @JvmField
        public val internalPassport: IdentityDocument,
    ) : PassportElement() {
        override fun getConstructor(): Int = 36_220_295
    }

    public class PassportElementAddress(
        @JvmField
        public val address: Address,
    ) : PassportElement() {
        override fun getConstructor(): Int = -782_625_232
    }

    public class PassportElementUtilityBill(
        @JvmField
        public val utilityBill: PersonalDocument,
    ) : PassportElement() {
        override fun getConstructor(): Int = -234_611_246
    }

    public class PassportElementBankStatement(
        @JvmField
        public val bankStatement: PersonalDocument,
    ) : PassportElement() {
        override fun getConstructor(): Int = -366_464_408
    }

    public class PassportElementRentalAgreement(
        @JvmField
        public val rentalAgreement: PersonalDocument,
    ) : PassportElement() {
        override fun getConstructor(): Int = -290_141_400
    }

    public class PassportElementPassportRegistration(
        @JvmField
        public val passportRegistration: PersonalDocument,
    ) : PassportElement() {
        override fun getConstructor(): Int = 618_323_071
    }

    public class PassportElementTemporaryRegistration(
        @JvmField
        public val temporaryRegistration: PersonalDocument,
    ) : PassportElement() {
        override fun getConstructor(): Int = 1_237_626_864
    }

    public class PassportElementPhoneNumber(
        @JvmField
        public val phoneNumber: String,
    ) : PassportElement() {
        override fun getConstructor(): Int = -1_320_118_375
    }

    public class PassportElementEmailAddress(
        @JvmField
        public val emailAddress: String,
    ) : PassportElement() {
        override fun getConstructor(): Int = -1_528_129_531
    }

    public class PassportElementError(
        @JvmField
        public val type: PassportElementType,
        @JvmField
        public val message: String,
        @JvmField
        public val source: PassportElementErrorSource,
    ) : Object() {
        override fun getConstructor(): Int = -1_861_902_395
    }

    public abstract class PassportElementErrorSource() : Object()

    public class PassportElementErrorSourceUnspecified() : PassportElementErrorSource() {
        override fun getConstructor(): Int = -378_320_830
    }

    public class PassportElementErrorSourceDataField(
        @JvmField
        public val fieldName: String,
    ) : PassportElementErrorSource() {
        override fun getConstructor(): Int = -308_650_776
    }

    public class PassportElementErrorSourceFrontSide() : PassportElementErrorSource() {
        override fun getConstructor(): Int = 1_895_658_292
    }

    public class PassportElementErrorSourceReverseSide() : PassportElementErrorSource() {
        override fun getConstructor(): Int = 1_918_630_391
    }

    public class PassportElementErrorSourceSelfie() : PassportElementErrorSource() {
        override fun getConstructor(): Int = -797_043_672
    }

    public class PassportElementErrorSourceTranslationFile(
        @JvmField
        public val fileIndex: Int,
    ) : PassportElementErrorSource() {
        override fun getConstructor(): Int = -689_621_228
    }

    public class PassportElementErrorSourceTranslationFiles() : PassportElementErrorSource() {
        override fun getConstructor(): Int = 581_280_796
    }

    public class PassportElementErrorSourceFile(
        @JvmField
        public val fileIndex: Int,
    ) : PassportElementErrorSource() {
        override fun getConstructor(): Int = 2_020_358_960
    }

    public class PassportElementErrorSourceFiles() : PassportElementErrorSource() {
        override fun getConstructor(): Int = 1_894_164_178
    }

    public abstract class PassportElementType() : Object()

    public class PassportElementTypePersonalDetails() : PassportElementType() {
        override fun getConstructor(): Int = -1_032_136_365
    }

    public class PassportElementTypePassport() : PassportElementType() {
        override fun getConstructor(): Int = -436_360_376
    }

    public class PassportElementTypeDriverLicense() : PassportElementType() {
        override fun getConstructor(): Int = 1_827_298_379
    }

    public class PassportElementTypeIdentityCard() : PassportElementType() {
        override fun getConstructor(): Int = -502_356_132
    }

    public class PassportElementTypeInternalPassport() : PassportElementType() {
        override fun getConstructor(): Int = -793_781_959
    }

    public class PassportElementTypeAddress() : PassportElementType() {
        override fun getConstructor(): Int = 496_327_874
    }

    public class PassportElementTypeUtilityBill() : PassportElementType() {
        override fun getConstructor(): Int = 627_084_906
    }

    public class PassportElementTypeBankStatement() : PassportElementType() {
        override fun getConstructor(): Int = 574_095_667
    }

    public class PassportElementTypeRentalAgreement() : PassportElementType() {
        override fun getConstructor(): Int = -2_060_583_280
    }

    public class PassportElementTypePassportRegistration() : PassportElementType() {
        override fun getConstructor(): Int = -159_478_209
    }

    public class PassportElementTypeTemporaryRegistration() : PassportElementType() {
        override fun getConstructor(): Int = 1_092_498_527
    }

    public class PassportElementTypePhoneNumber() : PassportElementType() {
        override fun getConstructor(): Int = -995_361_172
    }

    public class PassportElementTypeEmailAddress() : PassportElementType() {
        override fun getConstructor(): Int = -79_321_405
    }

    public class PassportElements(
        @JvmField
        public val elements: Array<PassportElement>,
    ) : Object() {
        override fun getConstructor(): Int = 1_264_617_556
    }

    public class PassportElementsWithErrors(
        @JvmField
        public val elements: Array<PassportElement>,
        @JvmField
        public val errors: Array<PassportElementError>,
    ) : Object() {
        override fun getConstructor(): Int = 1_308_923_044
    }

    public class PassportRequiredElement(
        @JvmField
        public val suitableElements: Array<PassportSuitableElement>,
    ) : Object() {
        override fun getConstructor(): Int = -1_983_641_651
    }

    public class PassportSuitableElement(
        @JvmField
        public val type: PassportElementType,
        @JvmField
        public val isSelfieRequired: Boolean,
        @JvmField
        public val isTranslationRequired: Boolean,
        @JvmField
        public val isNativeNameRequired: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -789_019_876
    }

    public class PasswordState(
        @JvmField
        public val hasPassword: Boolean,
        @JvmField
        public val passwordHint: String,
        @JvmField
        public val hasRecoveryEmailAddress: Boolean,
        @JvmField
        public val hasPassportData: Boolean,
        @JvmField
        public val recoveryEmailAddressCodeInfo: EmailAddressAuthenticationCodeInfo?,
        @JvmField
        public val loginEmailAddressPattern: String,
        @JvmField
        public val pendingResetDate: Int,
    ) : Object() {
        override fun getConstructor(): Int = 483_801_128
    }

    public class PaymentForm(
        @JvmField
        public val id: Long,
        @JvmField
        public val type: PaymentFormType,
        @JvmField
        public val sellerBotUserId: Long,
        @JvmField
        public val productInfo: ProductInfo,
    ) : Object() {
        override fun getConstructor(): Int = 1_998_651_315
    }

    public abstract class PaymentFormType() : Object()

    public class PaymentFormTypeRegular(
        @JvmField
        public val invoice: Invoice,
        @JvmField
        public val paymentProviderUserId: Long,
        @JvmField
        public val paymentProvider: PaymentProvider,
        @JvmField
        public val additionalPaymentOptions: Array<PaymentOption>,
        @JvmField
        public val savedOrderInfo: OrderInfo?,
        @JvmField
        public val savedCredentials: Array<SavedCredentials>,
        @JvmField
        public val canSaveCredentials: Boolean,
        @JvmField
        public val needPassword: Boolean,
    ) : PaymentFormType() {
        override fun getConstructor(): Int = -615_089_778
    }

    public class PaymentFormTypeStars(
        @JvmField
        public val starCount: Long,
    ) : PaymentFormType() {
        override fun getConstructor(): Int = 90_938_685
    }

    public class PaymentFormTypeStarSubscription(
        @JvmField
        public val pricing: StarSubscriptionPricing,
    ) : PaymentFormType() {
        override fun getConstructor(): Int = 271_444_827
    }

    public class PaymentOption(
        @JvmField
        public val title: String,
        @JvmField
        public val url: String,
    ) : Object() {
        override fun getConstructor(): Int = -294_020_965
    }

    public abstract class PaymentProvider() : Object()

    public class PaymentProviderSmartGlocal(
        @JvmField
        public val publicToken: String,
        @JvmField
        public val tokenizeUrl: String,
    ) : PaymentProvider() {
        override fun getConstructor(): Int = -1_174_112_396
    }

    public class PaymentProviderStripe(
        @JvmField
        public val publishableKey: String,
        @JvmField
        public val needCountry: Boolean,
        @JvmField
        public val needPostalCode: Boolean,
        @JvmField
        public val needCardholderName: Boolean,
    ) : PaymentProvider() {
        override fun getConstructor(): Int = 370_467_227
    }

    public class PaymentProviderOther(
        @JvmField
        public val url: String,
    ) : PaymentProvider() {
        override fun getConstructor(): Int = -1_336_876_828
    }

    public class PaymentReceipt(
        @JvmField
        public val productInfo: ProductInfo,
        @JvmField
        public val date: Int,
        @JvmField
        public val sellerBotUserId: Long,
        @JvmField
        public val type: PaymentReceiptType,
    ) : Object() {
        override fun getConstructor(): Int = 758_199_186
    }

    public abstract class PaymentReceiptType() : Object()

    public class PaymentReceiptTypeRegular(
        @JvmField
        public val paymentProviderUserId: Long,
        @JvmField
        public val invoice: Invoice,
        @JvmField
        public val orderInfo: OrderInfo?,
        @JvmField
        public val shippingOption: ShippingOption?,
        @JvmField
        public val credentialsTitle: String,
        @JvmField
        public val tipAmount: Long,
    ) : PaymentReceiptType() {
        override fun getConstructor(): Int = -1_636_362_826
    }

    public class PaymentReceiptTypeStars(
        @JvmField
        public val starCount: Long,
        @JvmField
        public val transactionId: String,
    ) : PaymentReceiptType() {
        override fun getConstructor(): Int = 294_913_868
    }

    public class PaymentResult(
        @JvmField
        public val success: Boolean,
        @JvmField
        public val verificationUrl: String,
    ) : Object() {
        override fun getConstructor(): Int = -804_263_843
    }

    public class PersonalDetails(
        @JvmField
        public val firstName: String,
        @JvmField
        public val middleName: String,
        @JvmField
        public val lastName: String,
        @JvmField
        public val nativeFirstName: String,
        @JvmField
        public val nativeMiddleName: String,
        @JvmField
        public val nativeLastName: String,
        @JvmField
        public val birthdate: Date,
        @JvmField
        public val gender: String,
        @JvmField
        public val countryCode: String,
        @JvmField
        public val residenceCountryCode: String,
    ) : Object() {
        override fun getConstructor(): Int = -1_061_656_137
    }

    public class PersonalDocument(
        @JvmField
        public val files: Array<DatedFile>,
        @JvmField
        public val translation: Array<DatedFile>,
    ) : Object() {
        override fun getConstructor(): Int = -1_011_634_661
    }

    public class PhoneNumberAuthenticationSettings(
        @JvmField
        public val allowFlashCall: Boolean,
        @JvmField
        public val allowMissedCall: Boolean,
        @JvmField
        public val isCurrentPhoneNumber: Boolean,
        @JvmField
        public val hasUnknownPhoneNumber: Boolean,
        @JvmField
        public val allowSmsRetrieverApi: Boolean,
        @JvmField
        public val firebaseAuthenticationSettings: FirebaseAuthenticationSettings?,
        @JvmField
        public val authenticationTokens: Array<String>,
    ) : Object() {
        override fun getConstructor(): Int = 1_881_885_547
    }

    public abstract class PhoneNumberCodeType() : Object()

    public class PhoneNumberCodeTypeChange() : PhoneNumberCodeType() {
        override fun getConstructor(): Int = 87_144_986
    }

    public class PhoneNumberCodeTypeVerify() : PhoneNumberCodeType() {
        override fun getConstructor(): Int = -1_029_402_661
    }

    public class PhoneNumberCodeTypeConfirmOwnership(
        @JvmField
        public val hash: String,
    ) : PhoneNumberCodeType() {
        override fun getConstructor(): Int = -485_404_696
    }

    public class PhoneNumberInfo(
        @JvmField
        public val country: CountryInfo?,
        @JvmField
        public val countryCallingCode: String,
        @JvmField
        public val formattedPhoneNumber: String,
        @JvmField
        public val isAnonymous: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -758_933_343
    }

    public class Photo(
        @JvmField
        public val hasStickers: Boolean,
        @JvmField
        public val minithumbnail: Minithumbnail?,
        @JvmField
        public val sizes: Array<PhotoSize>,
    ) : Object() {
        override fun getConstructor(): Int = -2_022_871_583
    }

    public class PhotoSize(
        @JvmField
        public val type: String,
        @JvmField
        public val photo: File,
        @JvmField
        public val width: Int,
        @JvmField
        public val height: Int,
        @JvmField
        public val progressiveSizes: IntArray,
    ) : Object() {
        override fun getConstructor(): Int = 1_609_182_352
    }

    public class Point(
        @JvmField
        public val x: Double,
        @JvmField
        public val y: Double,
    ) : Object() {
        override fun getConstructor(): Int = 437_515_705
    }

    public class Poll(
        @JvmField
        public val id: Long,
        @JvmField
        public val question: FormattedText,
        @JvmField
        public val options: Array<PollOption>,
        @JvmField
        public val totalVoterCount: Int,
        @JvmField
        public val recentVoterIds: Array<MessageSender>,
        @JvmField
        public val isAnonymous: Boolean,
        @JvmField
        public val type: PollType,
        @JvmField
        public val openPeriod: Int,
        @JvmField
        public val closeDate: Int,
        @JvmField
        public val isClosed: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_913_016_502
    }

    public class PollOption(
        @JvmField
        public val text: FormattedText,
        @JvmField
        public val voterCount: Int,
        @JvmField
        public val votePercentage: Int,
        @JvmField
        public val isChosen: Boolean,
        @JvmField
        public val isBeingChosen: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_676_243_088
    }

    public abstract class PollType() : Object()

    public class PollTypeRegular(
        @JvmField
        public val allowMultipleAnswers: Boolean,
    ) : PollType() {
        override fun getConstructor(): Int = 641_265_698
    }

    public class PollTypeQuiz(
        @JvmField
        public val correctOptionId: Int,
        @JvmField
        public val explanation: FormattedText,
    ) : PollType() {
        override fun getConstructor(): Int = 657_013_913
    }

    public abstract class PremiumFeature() : Object()

    public class PremiumFeatureIncreasedLimits() : PremiumFeature() {
        override fun getConstructor(): Int = 1_785_455_031
    }

    public class PremiumFeatureIncreasedUploadFileSize() : PremiumFeature() {
        override fun getConstructor(): Int = 1_825_367_155
    }

    public class PremiumFeatureImprovedDownloadSpeed() : PremiumFeature() {
        override fun getConstructor(): Int = -267_695_554
    }

    public class PremiumFeatureVoiceRecognition() : PremiumFeature() {
        override fun getConstructor(): Int = 1_288_216_542
    }

    public class PremiumFeatureDisabledAds() : PremiumFeature() {
        override fun getConstructor(): Int = -2_008_587_702
    }

    public class PremiumFeatureUniqueReactions() : PremiumFeature() {
        override fun getConstructor(): Int = 766_750_743
    }

    public class PremiumFeatureUniqueStickers() : PremiumFeature() {
        override fun getConstructor(): Int = -2_101_773_312
    }

    public class PremiumFeatureCustomEmoji() : PremiumFeature() {
        override fun getConstructor(): Int = 1_332_599_628
    }

    public class PremiumFeatureAdvancedChatManagement() : PremiumFeature() {
        override fun getConstructor(): Int = 796_347_674
    }

    public class PremiumFeatureProfileBadge() : PremiumFeature() {
        override fun getConstructor(): Int = 233_648_322
    }

    public class PremiumFeatureEmojiStatus() : PremiumFeature() {
        override fun getConstructor(): Int = -36_516_639
    }

    public class PremiumFeatureAnimatedProfilePhoto() : PremiumFeature() {
        override fun getConstructor(): Int = -100_741_914
    }

    public class PremiumFeatureForumTopicIcon() : PremiumFeature() {
        override fun getConstructor(): Int = -823_172_286
    }

    public class PremiumFeatureAppIcons() : PremiumFeature() {
        override fun getConstructor(): Int = 1_585_050_761
    }

    public class PremiumFeatureRealTimeChatTranslation() : PremiumFeature() {
        override fun getConstructor(): Int = -1_143_471_488
    }

    public class PremiumFeatureUpgradedStories() : PremiumFeature() {
        override fun getConstructor(): Int = -1_878_522_597
    }

    public class PremiumFeatureChatBoost() : PremiumFeature() {
        override fun getConstructor(): Int = 1_576_574_747
    }

    public class PremiumFeatureAccentColor() : PremiumFeature() {
        override fun getConstructor(): Int = 907_724_190
    }

    public class PremiumFeatureBackgroundForBoth() : PremiumFeature() {
        override fun getConstructor(): Int = 575_074_042
    }

    public class PremiumFeatureSavedMessagesTags() : PremiumFeature() {
        override fun getConstructor(): Int = 1_003_219_334
    }

    public class PremiumFeatureMessagePrivacy() : PremiumFeature() {
        override fun getConstructor(): Int = 802_322_678
    }

    public class PremiumFeatureLastSeenTimes() : PremiumFeature() {
        override fun getConstructor(): Int = -762_230_129
    }

    public class PremiumFeatureBusiness() : PremiumFeature() {
        override fun getConstructor(): Int = -1_503_619_324
    }

    public class PremiumFeatureMessageEffects() : PremiumFeature() {
        override fun getConstructor(): Int = -723_300_255
    }

    public class PremiumFeaturePromotionAnimation(
        @JvmField
        public val feature: PremiumFeature,
        @JvmField
        public val animation: Animation,
    ) : Object() {
        override fun getConstructor(): Int = -1_986_155_748
    }

    public class PremiumFeatures(
        @JvmField
        public val features: Array<PremiumFeature>,
        @JvmField
        public val limits: Array<PremiumLimit>,
        @JvmField
        public val paymentLink: InternalLinkType?,
    ) : Object() {
        override fun getConstructor(): Int = 1_875_162_172
    }

    public class PremiumGiftCodeInfo(
        @JvmField
        public val creatorId: MessageSender?,
        @JvmField
        public val creationDate: Int,
        @JvmField
        public val isFromGiveaway: Boolean,
        @JvmField
        public val giveawayMessageId: Long,
        @JvmField
        public val monthCount: Int,
        @JvmField
        public val userId: Long,
        @JvmField
        public val useDate: Int,
    ) : Object() {
        override fun getConstructor(): Int = -1_198_544_674
    }

    public class PremiumGiftPaymentOption(
        @JvmField
        public val currency: String,
        @JvmField
        public val amount: Long,
        @JvmField
        public val starCount: Long,
        @JvmField
        public val discountPercentage: Int,
        @JvmField
        public val monthCount: Int,
        @JvmField
        public val storeProductId: String,
        @JvmField
        public val sticker: Sticker?,
    ) : Object() {
        override fun getConstructor(): Int = -338_085_027
    }

    public class PremiumGiftPaymentOptions(
        @JvmField
        public val options: Array<PremiumGiftPaymentOption>,
    ) : Object() {
        override fun getConstructor(): Int = -1_347_543_032
    }

    public class PremiumGiveawayPaymentOption(
        @JvmField
        public val currency: String,
        @JvmField
        public val amount: Long,
        @JvmField
        public val winnerCount: Int,
        @JvmField
        public val monthCount: Int,
        @JvmField
        public val storeProductId: String,
        @JvmField
        public val storeProductQuantity: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_099_221_896
    }

    public class PremiumGiveawayPaymentOptions(
        @JvmField
        public val options: Array<PremiumGiveawayPaymentOption>,
    ) : Object() {
        override fun getConstructor(): Int = -1_587_397_823
    }

    public class PremiumLimit(
        @JvmField
        public val type: PremiumLimitType,
        @JvmField
        public val defaultValue: Int,
        @JvmField
        public val premiumValue: Int,
    ) : Object() {
        override fun getConstructor(): Int = 2_127_786_726
    }

    public abstract class PremiumLimitType() : Object()

    public class PremiumLimitTypeSupergroupCount() : PremiumLimitType() {
        override fun getConstructor(): Int = -247_467_131
    }

    public class PremiumLimitTypePinnedChatCount() : PremiumLimitType() {
        override fun getConstructor(): Int = -998_947_871
    }

    public class PremiumLimitTypeCreatedPublicChatCount() : PremiumLimitType() {
        override fun getConstructor(): Int = 446_086_841
    }

    public class PremiumLimitTypeSavedAnimationCount() : PremiumLimitType() {
        override fun getConstructor(): Int = -19_759_735
    }

    public class PremiumLimitTypeFavoriteStickerCount() : PremiumLimitType() {
        override fun getConstructor(): Int = 639_754_787
    }

    public class PremiumLimitTypeChatFolderCount() : PremiumLimitType() {
        override fun getConstructor(): Int = 377_489_774
    }

    public class PremiumLimitTypeChatFolderChosenChatCount() : PremiumLimitType() {
        override fun getConstructor(): Int = 1_691_435_861
    }

    public class PremiumLimitTypePinnedArchivedChatCount() : PremiumLimitType() {
        override fun getConstructor(): Int = 1_485_515_276
    }

    public class PremiumLimitTypePinnedSavedMessagesTopicCount() : PremiumLimitType() {
        override fun getConstructor(): Int = -1_544_854_305
    }

    public class PremiumLimitTypeCaptionLength() : PremiumLimitType() {
        override fun getConstructor(): Int = 293_984_314
    }

    public class PremiumLimitTypeBioLength() : PremiumLimitType() {
        override fun getConstructor(): Int = -1_146_976_765
    }

    public class PremiumLimitTypeChatFolderInviteLinkCount() : PremiumLimitType() {
        override fun getConstructor(): Int = -128_702_950
    }

    public class PremiumLimitTypeShareableChatFolderCount() : PremiumLimitType() {
        override fun getConstructor(): Int = 1_612_625_095
    }

    public class PremiumLimitTypeActiveStoryCount() : PremiumLimitType() {
        override fun getConstructor(): Int = -1_926_486_372
    }

    public class PremiumLimitTypeWeeklyPostedStoryCount() : PremiumLimitType() {
        override fun getConstructor(): Int = -506_354_313
    }

    public class PremiumLimitTypeMonthlyPostedStoryCount() : PremiumLimitType() {
        override fun getConstructor(): Int = 26_329_490
    }

    public class PremiumLimitTypeStoryCaptionLength() : PremiumLimitType() {
        override fun getConstructor(): Int = -1_093_324_030
    }

    public class PremiumLimitTypeStorySuggestedReactionAreaCount() : PremiumLimitType() {
        override fun getConstructor(): Int = -1_170_032_633
    }

    public class PremiumLimitTypeSimilarChatCount() : PremiumLimitType() {
        override fun getConstructor(): Int = -1_563_549_935
    }

    public class PremiumPaymentOption(
        @JvmField
        public val currency: String,
        @JvmField
        public val amount: Long,
        @JvmField
        public val discountPercentage: Int,
        @JvmField
        public val monthCount: Int,
        @JvmField
        public val storeProductId: String,
        @JvmField
        public val paymentLink: InternalLinkType?,
    ) : Object() {
        override fun getConstructor(): Int = -1_945_346_126
    }

    public abstract class PremiumSource() : Object()

    public class PremiumSourceLimitExceeded(
        @JvmField
        public val limitType: PremiumLimitType,
    ) : PremiumSource() {
        override fun getConstructor(): Int = -2_052_159_742
    }

    public class PremiumSourceFeature(
        @JvmField
        public val feature: PremiumFeature,
    ) : PremiumSource() {
        override fun getConstructor(): Int = 445_813_541
    }

    public class PremiumSourceBusinessFeature(
        @JvmField
        public val feature: BusinessFeature?,
    ) : PremiumSource() {
        override fun getConstructor(): Int = -1_492_946_340
    }

    public class PremiumSourceStoryFeature(
        @JvmField
        public val feature: PremiumStoryFeature,
    ) : PremiumSource() {
        override fun getConstructor(): Int = -1_030_737_556
    }

    public class PremiumSourceLink(
        @JvmField
        public val referrer: String,
    ) : PremiumSource() {
        override fun getConstructor(): Int = 2_135_071_132
    }

    public class PremiumSourceSettings() : PremiumSource() {
        override fun getConstructor(): Int = -285_702_859
    }

    public class PremiumState(
        @JvmField
        public val state: FormattedText,
        @JvmField
        public val paymentOptions: Array<PremiumStatePaymentOption>,
        @JvmField
        public val animations: Array<PremiumFeaturePromotionAnimation>,
        @JvmField
        public val businessAnimations: Array<BusinessFeaturePromotionAnimation>,
    ) : Object() {
        override fun getConstructor(): Int = 1_772_082_178
    }

    public class PremiumStatePaymentOption(
        @JvmField
        public val paymentOption: PremiumPaymentOption,
        @JvmField
        public val isCurrent: Boolean,
        @JvmField
        public val isUpgrade: Boolean,
        @JvmField
        public val lastTransactionId: String,
    ) : Object() {
        override fun getConstructor(): Int = 2_097_591_673
    }

    public abstract class PremiumStoryFeature() : Object()

    public class PremiumStoryFeaturePriorityOrder() : PremiumStoryFeature() {
        override fun getConstructor(): Int = -1_880_001_849
    }

    public class PremiumStoryFeatureStealthMode() : PremiumStoryFeature() {
        override fun getConstructor(): Int = 1_194_605_988
    }

    public class PremiumStoryFeaturePermanentViewsHistory() : PremiumStoryFeature() {
        override fun getConstructor(): Int = -1_029_683_296
    }

    public class PremiumStoryFeatureCustomExpirationDuration() : PremiumStoryFeature() {
        override fun getConstructor(): Int = -593_229_162
    }

    public class PremiumStoryFeatureSaveStories() : PremiumStoryFeature() {
        override fun getConstructor(): Int = -1_501_286_467
    }

    public class PremiumStoryFeatureLinksAndFormatting() : PremiumStoryFeature() {
        override fun getConstructor(): Int = -622_623_753
    }

    public class PremiumStoryFeatureVideoQuality() : PremiumStoryFeature() {
        override fun getConstructor(): Int = -1_162_887_511
    }

    public class PrepaidGiveaway(
        @JvmField
        public val id: Long,
        @JvmField
        public val winnerCount: Int,
        @JvmField
        public val prize: GiveawayPrize,
        @JvmField
        public val boostCount: Int,
        @JvmField
        public val paymentDate: Int,
    ) : Object() {
        override fun getConstructor(): Int = -277_859_441
    }

    public class PreparedInlineMessage(
        @JvmField
        public val inlineQueryId: Long,
        @JvmField
        public val result: InlineQueryResult,
        @JvmField
        public val chatTypes: TargetChatTypes,
    ) : Object() {
        override fun getConstructor(): Int = -1_808_892_734
    }

    public class PreparedInlineMessageId(
        @JvmField
        public val id: String,
        @JvmField
        public val expirationDate: Int,
    ) : Object() {
        override fun getConstructor(): Int = 940_415_972
    }

    public class ProductInfo(
        @JvmField
        public val title: String,
        @JvmField
        public val description: FormattedText,
        @JvmField
        public val photo: Photo?,
    ) : Object() {
        override fun getConstructor(): Int = -2_015_069_020
    }

    public class ProfileAccentColor(
        @JvmField
        public val id: Int,
        @JvmField
        public val lightThemeColors: ProfileAccentColors,
        @JvmField
        public val darkThemeColors: ProfileAccentColors,
        @JvmField
        public val minSupergroupChatBoostLevel: Int,
        @JvmField
        public val minChannelChatBoostLevel: Int,
    ) : Object() {
        override fun getConstructor(): Int = 557_679_253
    }

    public class ProfileAccentColors(
        @JvmField
        public val paletteColors: IntArray,
        @JvmField
        public val backgroundColors: IntArray,
        @JvmField
        public val storyColors: IntArray,
    ) : Object() {
        override fun getConstructor(): Int = -596_042_431
    }

    public class ProfilePhoto(
        @JvmField
        public val id: Long,
        @JvmField
        public val small: File,
        @JvmField
        public val big: File,
        @JvmField
        public val minithumbnail: Minithumbnail?,
        @JvmField
        public val hasAnimation: Boolean,
        @JvmField
        public val isPersonal: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -1_025_754_018
    }

    public class Proxies(
        @JvmField
        public val proxies: Array<Proxy>,
    ) : Object() {
        override fun getConstructor(): Int = 1_200_447_205
    }

    public class Proxy(
        @JvmField
        public val id: Int,
        @JvmField
        public val server: String,
        @JvmField
        public val port: Int,
        @JvmField
        public val lastUsedDate: Int,
        @JvmField
        public val isEnabled: Boolean,
        @JvmField
        public val type: ProxyType,
    ) : Object() {
        override fun getConstructor(): Int = 196_049_779
    }

    public abstract class ProxyType() : Object()

    public class ProxyTypeSocks5(
        @JvmField
        public val username: String,
        @JvmField
        public val password: String,
    ) : ProxyType() {
        override fun getConstructor(): Int = -890_027_341
    }

    public class ProxyTypeHttp(
        @JvmField
        public val username: String,
        @JvmField
        public val password: String,
        @JvmField
        public val httpOnly: Boolean,
    ) : ProxyType() {
        override fun getConstructor(): Int = -1_547_188_361
    }

    public class ProxyTypeMtproto(
        @JvmField
        public val secret: String,
    ) : ProxyType() {
        override fun getConstructor(): Int = -1_964_826_627
    }

    public abstract class PublicChatType() : Object()

    public class PublicChatTypeHasUsername() : PublicChatType() {
        override fun getConstructor(): Int = 350_789_758
    }

    public class PublicChatTypeIsLocationBased() : PublicChatType() {
        override fun getConstructor(): Int = 1_183_735_952
    }

    public abstract class PublicForward() : Object()

    public class PublicForwardMessage(
        @JvmField
        public val message: Message,
    ) : PublicForward() {
        override fun getConstructor(): Int = 51_885_010
    }

    public class PublicForwardStory(
        @JvmField
        public val story: Story,
    ) : PublicForward() {
        override fun getConstructor(): Int = 2_145_330_863
    }

    public class PublicForwards(
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val forwards: Array<PublicForward>,
        @JvmField
        public val nextOffset: String,
    ) : Object() {
        override fun getConstructor(): Int = -2_011_272_719
    }

    public abstract class PushMessageContent() : Object()

    public class PushMessageContentHidden(
        @JvmField
        public val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -316_950_436
    }

    public class PushMessageContentAnimation(
        @JvmField
        public val animation: Animation?,
        @JvmField
        public val caption: String,
        @JvmField
        public val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = 1_034_215_396
    }

    public class PushMessageContentAudio(
        @JvmField
        public val audio: Audio?,
        @JvmField
        public val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = 381_581_426
    }

    public class PushMessageContentContact(
        @JvmField
        public val name: String,
        @JvmField
        public val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -12_219_820
    }

    public class PushMessageContentContactRegistered() : PushMessageContent() {
        override fun getConstructor(): Int = -303_962_720
    }

    public class PushMessageContentDocument(
        @JvmField
        public val document: Document?,
        @JvmField
        public val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -458_379_775
    }

    public class PushMessageContentGame(
        @JvmField
        public val title: String,
        @JvmField
        public val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -515_131_109
    }

    public class PushMessageContentGameScore(
        @JvmField
        public val title: String,
        @JvmField
        public val score: Int,
        @JvmField
        public val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = 901_303_688
    }

    public class PushMessageContentInvoice(
        @JvmField
        public val price: String,
        @JvmField
        public val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -1_731_687_492
    }

    public class PushMessageContentLocation(
        @JvmField
        public val isLive: Boolean,
        @JvmField
        public val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -1_288_005_709
    }

    public class PushMessageContentPaidMedia(
        @JvmField
        public val starCount: Long,
        @JvmField
        public val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -1_252_595_894
    }

    public class PushMessageContentPhoto(
        @JvmField
        public val photo: Photo?,
        @JvmField
        public val caption: String,
        @JvmField
        public val isSecret: Boolean,
        @JvmField
        public val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = 140_631_122
    }

    public class PushMessageContentPoll(
        @JvmField
        public val question: String,
        @JvmField
        public val isRegular: Boolean,
        @JvmField
        public val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -44_403_654
    }

    public class PushMessageContentPremiumGiftCode(
        @JvmField
        public val monthCount: Int,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = 413_224_997
    }

    public class PushMessageContentGiveaway(
        @JvmField
        public val winnerCount: Int,
        @JvmField
        public val prize: GiveawayPrize?,
        @JvmField
        public val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -700_547_186
    }

    public class PushMessageContentGift(
        @JvmField
        public val starCount: Long,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -2_069_312_245
    }

    public class PushMessageContentUpgradedGift(
        @JvmField
        public val isUpgrade: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -1_711_666_466
    }

    public class PushMessageContentScreenshotTaken() : PushMessageContent() {
        override fun getConstructor(): Int = 214_245_369
    }

    public class PushMessageContentSticker(
        @JvmField
        public val sticker: Sticker?,
        @JvmField
        public val emoji: String,
        @JvmField
        public val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = 1_553_513_939
    }

    public class PushMessageContentStory(
        @JvmField
        public val isMention: Boolean,
        @JvmField
        public val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = 599_622_223
    }

    public class PushMessageContentText(
        @JvmField
        public val text: String,
        @JvmField
        public val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = 274_587_305
    }

    public class PushMessageContentVideo(
        @JvmField
        public val video: Video?,
        @JvmField
        public val caption: String,
        @JvmField
        public val isSecret: Boolean,
        @JvmField
        public val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = 310_038_831
    }

    public class PushMessageContentVideoNote(
        @JvmField
        public val videoNote: VideoNote?,
        @JvmField
        public val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -1_122_764_417
    }

    public class PushMessageContentVoiceNote(
        @JvmField
        public val voiceNote: VoiceNote?,
        @JvmField
        public val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = 88_910_987
    }

    public class PushMessageContentBasicGroupChatCreate() : PushMessageContent() {
        override fun getConstructor(): Int = -2_114_855_172
    }

    public class PushMessageContentVideoChatStarted() : PushMessageContent() {
        override fun getConstructor(): Int = -566_547_393
    }

    public class PushMessageContentVideoChatEnded() : PushMessageContent() {
        override fun getConstructor(): Int = -1_250_265_885
    }

    public class PushMessageContentInviteVideoChatParticipants(
        @JvmField
        public val isCurrentUser: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = 517_620_365
    }

    public class PushMessageContentChatAddMembers(
        @JvmField
        public val memberName: String,
        @JvmField
        public val isCurrentUser: Boolean,
        @JvmField
        public val isReturned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -1_087_145_158
    }

    public class PushMessageContentChatChangePhoto() : PushMessageContent() {
        override fun getConstructor(): Int = -1_114_222_051
    }

    public class PushMessageContentChatChangeTitle(
        @JvmField
        public val title: String,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -1_964_902_749
    }

    public class PushMessageContentChatSetBackground(
        @JvmField
        public val isSame: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -1_490_331_933
    }

    public class PushMessageContentChatSetTheme(
        @JvmField
        public val themeName: String,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = 173_882_216
    }

    public class PushMessageContentChatDeleteMember(
        @JvmField
        public val memberName: String,
        @JvmField
        public val isCurrentUser: Boolean,
        @JvmField
        public val isLeft: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = 598_714_783
    }

    public class PushMessageContentChatJoinByLink() : PushMessageContent() {
        override fun getConstructor(): Int = 1_553_719_113
    }

    public class PushMessageContentChatJoinByRequest() : PushMessageContent() {
        override fun getConstructor(): Int = -205_823_627
    }

    public class PushMessageContentRecurringPayment(
        @JvmField
        public val amount: String,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = 1_619_211_802
    }

    public class PushMessageContentSuggestProfilePhoto() : PushMessageContent() {
        override fun getConstructor(): Int = 2_104_225_963
    }

    public class PushMessageContentProximityAlertTriggered(
        @JvmField
        public val distance: Int,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -264_601_594
    }

    public class PushMessageContentMessageForwards(
        @JvmField
        public val totalCount: Int,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -1_913_083_876
    }

    public class PushMessageContentMediaAlbum(
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val hasPhotos: Boolean,
        @JvmField
        public val hasVideos: Boolean,
        @JvmField
        public val hasAudios: Boolean,
        @JvmField
        public val hasDocuments: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -748_426_897
    }

    public class PushReceiverId(
        @JvmField
        public val id: Long,
    ) : Object() {
        override fun getConstructor(): Int = 371_056_428
    }

    public class QuickReplyMessage(
        @JvmField
        public val id: Long,
        @JvmField
        public val sendingState: MessageSendingState?,
        @JvmField
        public val canBeEdited: Boolean,
        @JvmField
        public val replyToMessageId: Long,
        @JvmField
        public val viaBotUserId: Long,
        @JvmField
        public val mediaAlbumId: Long,
        @JvmField
        public val content: MessageContent,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
    ) : Object() {
        override fun getConstructor(): Int = -1_090_965_757
    }

    public class QuickReplyMessages(
        @JvmField
        public val messages: Array<QuickReplyMessage>?,
    ) : Object() {
        override fun getConstructor(): Int = 743_214_375
    }

    public class QuickReplyShortcut(
        @JvmField
        public val id: Int,
        @JvmField
        public val name: String,
        @JvmField
        public val firstMessage: QuickReplyMessage,
        @JvmField
        public val messageCount: Int,
    ) : Object() {
        override fun getConstructor(): Int = -1_107_453_291
    }

    public class ReactionNotificationSettings(
        @JvmField
        public val messageReactionSource: ReactionNotificationSource,
        @JvmField
        public val storyReactionSource: ReactionNotificationSource,
        @JvmField
        public val soundId: Long,
        @JvmField
        public val showPreview: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 733_017_684
    }

    public abstract class ReactionNotificationSource() : Object()

    public class ReactionNotificationSourceNone() : ReactionNotificationSource() {
        override fun getConstructor(): Int = 366_374_940
    }

    public class ReactionNotificationSourceContacts() : ReactionNotificationSource() {
        override fun getConstructor(): Int = 555_501_621
    }

    public class ReactionNotificationSourceAll() : ReactionNotificationSource() {
        override fun getConstructor(): Int = 1_241_689_234
    }

    public abstract class ReactionType() : Object()

    public class ReactionTypeEmoji(
        @JvmField
        public val emoji: String,
    ) : ReactionType() {
        override fun getConstructor(): Int = -1_942_084_920
    }

    public class ReactionTypeCustomEmoji(
        @JvmField
        public val customEmojiId: Long,
    ) : ReactionType() {
        override fun getConstructor(): Int = -989_117_709
    }

    public class ReactionTypePaid() : ReactionType() {
        override fun getConstructor(): Int = 436_294_381
    }

    public abstract class ReactionUnavailabilityReason() : Object()

    public class ReactionUnavailabilityReasonAnonymousAdministrator() : ReactionUnavailabilityReason() {
        override fun getConstructor(): Int = -499_612_677
    }

    public class ReactionUnavailabilityReasonGuest() : ReactionUnavailabilityReason() {
        override fun getConstructor(): Int = 1_357_861_444
    }

    public class ReadDatePrivacySettings(
        @JvmField
        public val showReadDate: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_654_842_920
    }

    public class ReceivedGift(
        @JvmField
        public val receivedGiftId: String,
        @JvmField
        public val senderId: MessageSender?,
        @JvmField
        public val text: FormattedText,
        @JvmField
        public val isPrivate: Boolean,
        @JvmField
        public val isSaved: Boolean,
        @JvmField
        public val isPinned: Boolean,
        @JvmField
        public val canBeUpgraded: Boolean,
        @JvmField
        public val canBeTransferred: Boolean,
        @JvmField
        public val wasRefunded: Boolean,
        @JvmField
        public val date: Int,
        @JvmField
        public val gift: SentGift,
        @JvmField
        public val sellStarCount: Long,
        @JvmField
        public val prepaidUpgradeStarCount: Long,
        @JvmField
        public val transferStarCount: Long,
        @JvmField
        public val exportDate: Int,
    ) : Object() {
        override fun getConstructor(): Int = 553_476_056
    }

    public class ReceivedGifts(
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val gifts: Array<ReceivedGift>,
        @JvmField
        public val areNotificationsEnabled: Boolean,
        @JvmField
        public val nextOffset: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_237_114_400
    }

    public class RecommendedChatFolder(
        @JvmField
        public val folder: ChatFolder,
        @JvmField
        public val description: String,
    ) : Object() {
        override fun getConstructor(): Int = -2_116_569_930
    }

    public class RecommendedChatFolders(
        @JvmField
        public val chatFolders: Array<RecommendedChatFolder>,
    ) : Object() {
        override fun getConstructor(): Int = -739_217_656
    }

    public class RecoveryEmailAddress(
        @JvmField
        public val recoveryEmailAddress: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_290_526_187
    }

    public class RemoteFile(
        @JvmField
        public val id: String,
        @JvmField
        public val uniqueId: String,
        @JvmField
        public val isUploadingActive: Boolean,
        @JvmField
        public val isUploadingCompleted: Boolean,
        @JvmField
        public val uploadedSize: Long,
    ) : Object() {
        override fun getConstructor(): Int = 747_731_030
    }

    public abstract class ReplyMarkup() : Object()

    public class ReplyMarkupRemoveKeyboard(
        @JvmField
        public val isPersonal: Boolean,
    ) : ReplyMarkup() {
        override fun getConstructor(): Int = -691_252_879
    }

    public class ReplyMarkupForceReply(
        @JvmField
        public val isPersonal: Boolean,
        @JvmField
        public val inputFieldPlaceholder: String,
    ) : ReplyMarkup() {
        override fun getConstructor(): Int = 1_101_461_919
    }

    public class ReplyMarkupShowKeyboard(
        @JvmField
        public val rows: Array<Array<KeyboardButton>>,
        @JvmField
        public val isPersistent: Boolean,
        @JvmField
        public val resizeKeyboard: Boolean,
        @JvmField
        public val oneTime: Boolean,
        @JvmField
        public val isPersonal: Boolean,
        @JvmField
        public val inputFieldPlaceholder: String,
    ) : ReplyMarkup() {
        override fun getConstructor(): Int = -791_495_984
    }

    public class ReplyMarkupInlineKeyboard(
        @JvmField
        public val rows: Array<Array<InlineKeyboardButton>>,
    ) : ReplyMarkup() {
        override fun getConstructor(): Int = -619_317_658
    }

    public abstract class ReportChatResult() : Object()

    public class ReportChatResultOk() : ReportChatResult() {
        override fun getConstructor(): Int = 1_209_685_373
    }

    public class ReportChatResultOptionRequired(
        @JvmField
        public val title: String,
        @JvmField
        public val options: Array<ReportOption>,
    ) : ReportChatResult() {
        override fun getConstructor(): Int = -881_375_669
    }

    public class ReportChatResultTextRequired(
        @JvmField
        public val optionId: ByteArray,
        @JvmField
        public val isOptional: Boolean,
    ) : ReportChatResult() {
        override fun getConstructor(): Int = -1_949_552_447
    }

    public class ReportChatResultMessagesRequired() : ReportChatResult() {
        override fun getConstructor(): Int = 106_043_280
    }

    public class ReportOption(
        @JvmField
        public val id: ByteArray,
        @JvmField
        public val text: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_106_390_048
    }

    public abstract class ReportReason() : Object()

    public class ReportReasonSpam() : ReportReason() {
        override fun getConstructor(): Int = -1_207_032_897
    }

    public class ReportReasonViolence() : ReportReason() {
        override fun getConstructor(): Int = 2_038_679_353
    }

    public class ReportReasonPornography() : ReportReason() {
        override fun getConstructor(): Int = 1_306_467_575
    }

    public class ReportReasonChildAbuse() : ReportReason() {
        override fun getConstructor(): Int = 761_086_718
    }

    public class ReportReasonCopyright() : ReportReason() {
        override fun getConstructor(): Int = 1_474_441_135
    }

    public class ReportReasonUnrelatedLocation() : ReportReason() {
        override fun getConstructor(): Int = 87_562_288
    }

    public class ReportReasonFake() : ReportReason() {
        override fun getConstructor(): Int = 352_862_176
    }

    public class ReportReasonIllegalDrugs() : ReportReason() {
        override fun getConstructor(): Int = -61_599_200
    }

    public class ReportReasonPersonalDetails() : ReportReason() {
        override fun getConstructor(): Int = -1_588_882_414
    }

    public class ReportReasonCustom() : ReportReason() {
        override fun getConstructor(): Int = -1_380_459_917
    }

    public abstract class ReportSponsoredResult() : Object()

    public class ReportSponsoredResultOk() : ReportSponsoredResult() {
        override fun getConstructor(): Int = -128_473_456
    }

    public class ReportSponsoredResultFailed() : ReportSponsoredResult() {
        override fun getConstructor(): Int = 1_231_714_278
    }

    public class ReportSponsoredResultOptionRequired(
        @JvmField
        public val title: String,
        @JvmField
        public val options: Array<ReportOption>,
    ) : ReportSponsoredResult() {
        override fun getConstructor(): Int = -1_646_687_318
    }

    public class ReportSponsoredResultAdsHidden() : ReportSponsoredResult() {
        override fun getConstructor(): Int = -372_279_531
    }

    public class ReportSponsoredResultPremiumRequired() : ReportSponsoredResult() {
        override fun getConstructor(): Int = -55_411_887
    }

    public abstract class ReportStoryResult() : Object()

    public class ReportStoryResultOk() : ReportStoryResult() {
        override fun getConstructor(): Int = -1_405_328_461
    }

    public class ReportStoryResultOptionRequired(
        @JvmField
        public val title: String,
        @JvmField
        public val options: Array<ReportOption>,
    ) : ReportStoryResult() {
        override fun getConstructor(): Int = 1_632_974_839
    }

    public class ReportStoryResultTextRequired(
        @JvmField
        public val optionId: ByteArray,
        @JvmField
        public val isOptional: Boolean,
    ) : ReportStoryResult() {
        override fun getConstructor(): Int = 334_339_473
    }

    public abstract class ResendCodeReason() : Object()

    public class ResendCodeReasonUserRequest() : ResendCodeReason() {
        override fun getConstructor(): Int = -441_923_456
    }

    public class ResendCodeReasonVerificationFailed(
        @JvmField
        public val errorMessage: String,
    ) : ResendCodeReason() {
        override fun getConstructor(): Int = 529_870_273
    }

    public abstract class ResetPasswordResult() : Object()

    public class ResetPasswordResultOk() : ResetPasswordResult() {
        override fun getConstructor(): Int = -1_397_267_463
    }

    public class ResetPasswordResultPending(
        @JvmField
        public val pendingResetDate: Int,
    ) : ResetPasswordResult() {
        override fun getConstructor(): Int = 1_193_925_721
    }

    public class ResetPasswordResultDeclined(
        @JvmField
        public val retryDate: Int,
    ) : ResetPasswordResult() {
        override fun getConstructor(): Int = -1_202_200_373
    }

    public abstract class RevenueWithdrawalState() : Object()

    public class RevenueWithdrawalStatePending() : RevenueWithdrawalState() {
        override fun getConstructor(): Int = 1_563_512_741
    }

    public class RevenueWithdrawalStateSucceeded(
        @JvmField
        public val date: Int,
        @JvmField
        public val url: String,
    ) : RevenueWithdrawalState() {
        override fun getConstructor(): Int = 265_375_242
    }

    public class RevenueWithdrawalStateFailed() : RevenueWithdrawalState() {
        override fun getConstructor(): Int = -12_504_951
    }

    public abstract class RichText() : Object()

    public class RichTextPlain(
        @JvmField
        public val text: String,
    ) : RichText() {
        override fun getConstructor(): Int = 482_617_702
    }

    public class RichTextBold(
        @JvmField
        public val text: RichText,
    ) : RichText() {
        override fun getConstructor(): Int = 1_670_844_268
    }

    public class RichTextItalic(
        @JvmField
        public val text: RichText,
    ) : RichText() {
        override fun getConstructor(): Int = 1_853_354_047
    }

    public class RichTextUnderline(
        @JvmField
        public val text: RichText,
    ) : RichText() {
        override fun getConstructor(): Int = -536_019_572
    }

    public class RichTextStrikethrough(
        @JvmField
        public val text: RichText,
    ) : RichText() {
        override fun getConstructor(): Int = 723_413_585
    }

    public class RichTextFixed(
        @JvmField
        public val text: RichText,
    ) : RichText() {
        override fun getConstructor(): Int = -1_271_496_249
    }

    public class RichTextUrl(
        @JvmField
        public val text: RichText,
        @JvmField
        public val url: String,
        @JvmField
        public val isCached: Boolean,
    ) : RichText() {
        override fun getConstructor(): Int = 83_939_092
    }

    public class RichTextEmailAddress(
        @JvmField
        public val text: RichText,
        @JvmField
        public val emailAddress: String,
    ) : RichText() {
        override fun getConstructor(): Int = 40_018_679
    }

    public class RichTextSubscript(
        @JvmField
        public val text: RichText,
    ) : RichText() {
        override fun getConstructor(): Int = -868_197_812
    }

    public class RichTextSuperscript(
        @JvmField
        public val text: RichText,
    ) : RichText() {
        override fun getConstructor(): Int = -382_241_437
    }

    public class RichTextMarked(
        @JvmField
        public val text: RichText,
    ) : RichText() {
        override fun getConstructor(): Int = -1_271_999_614
    }

    public class RichTextPhoneNumber(
        @JvmField
        public val text: RichText,
        @JvmField
        public val phoneNumber: String,
    ) : RichText() {
        override fun getConstructor(): Int = 128_521_539
    }

    public class RichTextIcon(
        @JvmField
        public val document: Document,
        @JvmField
        public val width: Int,
        @JvmField
        public val height: Int,
    ) : RichText() {
        override fun getConstructor(): Int = -1_480_316_158
    }

    public class RichTextReference(
        @JvmField
        public val text: RichText,
        @JvmField
        public val anchorName: String,
        @JvmField
        public val url: String,
    ) : RichText() {
        override fun getConstructor(): Int = -1_147_530_634
    }

    public class RichTextAnchor(
        @JvmField
        public val name: String,
    ) : RichText() {
        override fun getConstructor(): Int = 1_316_950_068
    }

    public class RichTextAnchorLink(
        @JvmField
        public val text: RichText,
        @JvmField
        public val anchorName: String,
        @JvmField
        public val url: String,
    ) : RichText() {
        override fun getConstructor(): Int = -1_541_418_282
    }

    public class RichTexts(
        @JvmField
        public val texts: Array<RichText>,
    ) : RichText() {
        override fun getConstructor(): Int = 1_647_457_821
    }

    public class RtmpUrl(
        @JvmField
        public val url: String,
        @JvmField
        public val streamKey: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_009_302_613
    }

    public class SavedCredentials(
        @JvmField
        public val id: String,
        @JvmField
        public val title: String,
    ) : Object() {
        override fun getConstructor(): Int = -370_273_060
    }

    public class SavedMessagesTag(
        @JvmField
        public val tag: ReactionType,
        @JvmField
        public val label: String,
        @JvmField
        public val count: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_785_183_329
    }

    public class SavedMessagesTags(
        @JvmField
        public val tags: Array<SavedMessagesTag>,
    ) : Object() {
        override fun getConstructor(): Int = -1_749_291_430
    }

    public class SavedMessagesTopic(
        @JvmField
        public val id: Long,
        @JvmField
        public val type: SavedMessagesTopicType,
        @JvmField
        public val isPinned: Boolean,
        @JvmField
        public val order: Long,
        @JvmField
        public val lastMessage: Message?,
        @JvmField
        public val draftMessage: DraftMessage?,
    ) : Object() {
        override fun getConstructor(): Int = -760_684_124
    }

    public abstract class SavedMessagesTopicType() : Object()

    public class SavedMessagesTopicTypeMyNotes() : SavedMessagesTopicType() {
        override fun getConstructor(): Int = -1_282_784_779
    }

    public class SavedMessagesTopicTypeAuthorHidden() : SavedMessagesTopicType() {
        override fun getConstructor(): Int = 1_882_997_141
    }

    public class SavedMessagesTopicTypeSavedFromChat(
        @JvmField
        public val chatId: Long,
    ) : SavedMessagesTopicType() {
        override fun getConstructor(): Int = -1_723_880_104
    }

    public class ScopeAutosaveSettings(
        @JvmField
        public val autosavePhotos: Boolean,
        @JvmField
        public val autosaveVideos: Boolean,
        @JvmField
        public val maxVideoFileSize: Long,
    ) : Object() {
        override fun getConstructor(): Int = 1_546_821_427
    }

    public class ScopeNotificationSettings(
        @JvmField
        public val muteFor: Int,
        @JvmField
        public val soundId: Long,
        @JvmField
        public val showPreview: Boolean,
        @JvmField
        public val useDefaultMuteStories: Boolean,
        @JvmField
        public val muteStories: Boolean,
        @JvmField
        public val storySoundId: Long,
        @JvmField
        public val showStoryPoster: Boolean,
        @JvmField
        public val disablePinnedMessageNotifications: Boolean,
        @JvmField
        public val disableMentionNotifications: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 88_369_150
    }

    public abstract class SearchMessagesChatTypeFilter() : Object()

    public class SearchMessagesChatTypeFilterPrivate() : SearchMessagesChatTypeFilter() {
        override fun getConstructor(): Int = 1_169_248_975
    }

    public class SearchMessagesChatTypeFilterGroup() : SearchMessagesChatTypeFilter() {
        override fun getConstructor(): Int = -2_059_426_022
    }

    public class SearchMessagesChatTypeFilterChannel() : SearchMessagesChatTypeFilter() {
        override fun getConstructor(): Int = -773_540_139
    }

    public abstract class SearchMessagesFilter() : Object()

    public class SearchMessagesFilterEmpty() : SearchMessagesFilter() {
        override fun getConstructor(): Int = -869_395_657
    }

    public class SearchMessagesFilterAnimation() : SearchMessagesFilter() {
        override fun getConstructor(): Int = -155_713_339
    }

    public class SearchMessagesFilterAudio() : SearchMessagesFilter() {
        override fun getConstructor(): Int = 867_505_275
    }

    public class SearchMessagesFilterDocument() : SearchMessagesFilter() {
        override fun getConstructor(): Int = 1_526_331_215
    }

    public class SearchMessagesFilterPhoto() : SearchMessagesFilter() {
        override fun getConstructor(): Int = 925_932_293
    }

    public class SearchMessagesFilterVideo() : SearchMessagesFilter() {
        override fun getConstructor(): Int = 115_538_222
    }

    public class SearchMessagesFilterVoiceNote() : SearchMessagesFilter() {
        override fun getConstructor(): Int = 1_841_439_357
    }

    public class SearchMessagesFilterPhotoAndVideo() : SearchMessagesFilter() {
        override fun getConstructor(): Int = 1_352_130_963
    }

    public class SearchMessagesFilterUrl() : SearchMessagesFilter() {
        override fun getConstructor(): Int = -1_828_724_341
    }

    public class SearchMessagesFilterChatPhoto() : SearchMessagesFilter() {
        override fun getConstructor(): Int = -1_247_751_329
    }

    public class SearchMessagesFilterVideoNote() : SearchMessagesFilter() {
        override fun getConstructor(): Int = 564_323_321
    }

    public class SearchMessagesFilterVoiceAndVideoNote() : SearchMessagesFilter() {
        override fun getConstructor(): Int = 664_174_819
    }

    public class SearchMessagesFilterMention() : SearchMessagesFilter() {
        override fun getConstructor(): Int = 2_001_258_652
    }

    public class SearchMessagesFilterUnreadMention() : SearchMessagesFilter() {
        override fun getConstructor(): Int = -95_769_149
    }

    public class SearchMessagesFilterUnreadReaction() : SearchMessagesFilter() {
        override fun getConstructor(): Int = -1_379_651_328
    }

    public class SearchMessagesFilterFailedToSend() : SearchMessagesFilter() {
        override fun getConstructor(): Int = -596_322_564
    }

    public class SearchMessagesFilterPinned() : SearchMessagesFilter() {
        override fun getConstructor(): Int = 371_805_512
    }

    public class Seconds(
        @JvmField
        public val seconds: Double,
    ) : Object() {
        override fun getConstructor(): Int = 959_899_022
    }

    public class SecretChat(
        @JvmField
        public val id: Int,
        @JvmField
        public val userId: Long,
        @JvmField
        public val state: SecretChatState,
        @JvmField
        public val isOutbound: Boolean,
        @JvmField
        public val keyHash: ByteArray,
        @JvmField
        public val layer: Int,
    ) : Object() {
        override fun getConstructor(): Int = -676_918_325
    }

    public abstract class SecretChatState() : Object()

    public class SecretChatStatePending() : SecretChatState() {
        override fun getConstructor(): Int = -1_637_050_756
    }

    public class SecretChatStateReady() : SecretChatState() {
        override fun getConstructor(): Int = -1_611_352_087
    }

    public class SecretChatStateClosed() : SecretChatState() {
        override fun getConstructor(): Int = -1_945_106_707
    }

    public abstract class SentGift() : Object()

    public class SentGiftRegular(
        @JvmField
        public val gift: Gift,
    ) : SentGift() {
        override fun getConstructor(): Int = 594_062_617
    }

    public class SentGiftUpgraded(
        @JvmField
        public val gift: UpgradedGift,
    ) : SentGift() {
        override fun getConstructor(): Int = 627_524_736
    }

    public class SentWebAppMessage(
        @JvmField
        public val inlineMessageId: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_243_934_400
    }

    public class Session(
        @JvmField
        public val id: Long,
        @JvmField
        public val isCurrent: Boolean,
        @JvmField
        public val isPasswordPending: Boolean,
        @JvmField
        public val isUnconfirmed: Boolean,
        @JvmField
        public val canAcceptSecretChats: Boolean,
        @JvmField
        public val canAcceptCalls: Boolean,
        @JvmField
        public val type: SessionType,
        @JvmField
        public val apiId: Int,
        @JvmField
        public val applicationName: String,
        @JvmField
        public val applicationVersion: String,
        @JvmField
        public val isOfficialApplication: Boolean,
        @JvmField
        public val deviceModel: String,
        @JvmField
        public val platform: String,
        @JvmField
        public val systemVersion: String,
        @JvmField
        public val logInDate: Int,
        @JvmField
        public val lastActiveDate: Int,
        @JvmField
        public val ipAddress: String,
        @JvmField
        public val location: String,
    ) : Object() {
        override fun getConstructor(): Int = 158_702_140
    }

    public abstract class SessionType() : Object()

    public class SessionTypeAndroid() : SessionType() {
        override fun getConstructor(): Int = -2_071_764_840
    }

    public class SessionTypeApple() : SessionType() {
        override fun getConstructor(): Int = -1_818_635_701
    }

    public class SessionTypeBrave() : SessionType() {
        override fun getConstructor(): Int = -1_216_812_563
    }

    public class SessionTypeChrome() : SessionType() {
        override fun getConstructor(): Int = 1_573_464_425
    }

    public class SessionTypeEdge() : SessionType() {
        override fun getConstructor(): Int = -538_916_005
    }

    public class SessionTypeFirefox() : SessionType() {
        override fun getConstructor(): Int = 2_122_579_364
    }

    public class SessionTypeIpad() : SessionType() {
        override fun getConstructor(): Int = 1_294_647_023
    }

    public class SessionTypeIphone() : SessionType() {
        override fun getConstructor(): Int = 97_616_573
    }

    public class SessionTypeLinux() : SessionType() {
        override fun getConstructor(): Int = -1_487_422_871
    }

    public class SessionTypeMac() : SessionType() {
        override fun getConstructor(): Int = -612_250_975
    }

    public class SessionTypeOpera() : SessionType() {
        override fun getConstructor(): Int = -1_463_673_734
    }

    public class SessionTypeSafari() : SessionType() {
        override fun getConstructor(): Int = 710_646_873
    }

    public class SessionTypeUbuntu() : SessionType() {
        override fun getConstructor(): Int = 1_569_680_069
    }

    public class SessionTypeUnknown() : SessionType() {
        override fun getConstructor(): Int = 233_926_704
    }

    public class SessionTypeVivaldi() : SessionType() {
        override fun getConstructor(): Int = 1_120_503_279
    }

    public class SessionTypeWindows() : SessionType() {
        override fun getConstructor(): Int = -1_676_512_600
    }

    public class SessionTypeXbox() : SessionType() {
        override fun getConstructor(): Int = 1_856_216_492
    }

    public class Sessions(
        @JvmField
        public val sessions: Array<Session>,
        @JvmField
        public val inactiveSessionTtlDays: Int,
    ) : Object() {
        override fun getConstructor(): Int = 842_912_274
    }

    public class SharedChat(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val title: String,
        @JvmField
        public val username: String,
        @JvmField
        public val photo: Photo?,
    ) : Object() {
        override fun getConstructor(): Int = 1_250_406_426
    }

    public class SharedUser(
        @JvmField
        public val userId: Long,
        @JvmField
        public val firstName: String,
        @JvmField
        public val lastName: String,
        @JvmField
        public val username: String,
        @JvmField
        public val photo: Photo?,
    ) : Object() {
        override fun getConstructor(): Int = 293_020_919
    }

    public class ShippingOption(
        @JvmField
        public val id: String,
        @JvmField
        public val title: String,
        @JvmField
        public val priceParts: Array<LabeledPricePart>,
    ) : Object() {
        override fun getConstructor(): Int = 1_425_690_001
    }

    public abstract class SpeechRecognitionResult() : Object()

    public class SpeechRecognitionResultPending(
        @JvmField
        public val partialText: String,
    ) : SpeechRecognitionResult() {
        override fun getConstructor(): Int = -1_631_810_048
    }

    public class SpeechRecognitionResultText(
        @JvmField
        public val text: String,
    ) : SpeechRecognitionResult() {
        override fun getConstructor(): Int = -2_132_377_123
    }

    public class SpeechRecognitionResultError(
        @JvmField
        public val error: Error,
    ) : SpeechRecognitionResult() {
        override fun getConstructor(): Int = 164_774_908
    }

    public class SponsoredChat(
        @JvmField
        public val uniqueId: Long,
        @JvmField
        public val chatId: Long,
        @JvmField
        public val sponsorInfo: String,
        @JvmField
        public val additionalInfo: String,
    ) : Object() {
        override fun getConstructor(): Int = -325_763_489
    }

    public class SponsoredChats(
        @JvmField
        public val chats: Array<SponsoredChat>,
    ) : Object() {
        override fun getConstructor(): Int = 536_300_641
    }

    public class SponsoredMessage(
        @JvmField
        public val messageId: Long,
        @JvmField
        public val isRecommended: Boolean,
        @JvmField
        public val canBeReported: Boolean,
        @JvmField
        public val content: MessageContent,
        @JvmField
        public val sponsor: MessageSponsor,
        @JvmField
        public val title: String,
        @JvmField
        public val buttonText: String,
        @JvmField
        public val accentColorId: Int,
        @JvmField
        public val backgroundCustomEmojiId: Long,
        @JvmField
        public val additionalInfo: String,
    ) : Object() {
        override fun getConstructor(): Int = -1_215_476_699
    }

    public class SponsoredMessages(
        @JvmField
        public val messages: Array<SponsoredMessage>,
        @JvmField
        public val messagesBetween: Int,
    ) : Object() {
        override fun getConstructor(): Int = -537_674_389
    }

    public class StarAmount(
        @JvmField
        public val starCount: Long,
        @JvmField
        public val nanostarCount: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_863_216_512
    }

    public class StarCount(
        @JvmField
        public val starCount: Long,
    ) : Object() {
        override fun getConstructor(): Int = -1_566_395_144
    }

    public class StarGiveawayPaymentOption(
        @JvmField
        public val currency: String,
        @JvmField
        public val amount: Long,
        @JvmField
        public val starCount: Long,
        @JvmField
        public val storeProductId: String,
        @JvmField
        public val yearlyBoostCount: Int,
        @JvmField
        public val winnerOptions: Array<StarGiveawayWinnerOption>,
        @JvmField
        public val isDefault: Boolean,
        @JvmField
        public val isAdditional: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 565_089_625
    }

    public class StarGiveawayPaymentOptions(
        @JvmField
        public val options: Array<StarGiveawayPaymentOption>,
    ) : Object() {
        override fun getConstructor(): Int = -1_216_716_679
    }

    public class StarGiveawayWinnerOption(
        @JvmField
        public val winnerCount: Int,
        @JvmField
        public val wonStarCount: Long,
        @JvmField
        public val isDefault: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -865_888_761
    }

    public class StarPaymentOption(
        @JvmField
        public val currency: String,
        @JvmField
        public val amount: Long,
        @JvmField
        public val starCount: Long,
        @JvmField
        public val storeProductId: String,
        @JvmField
        public val isAdditional: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -1_364_056_047
    }

    public class StarPaymentOptions(
        @JvmField
        public val options: Array<StarPaymentOption>,
    ) : Object() {
        override fun getConstructor(): Int = -423_720_498
    }

    public class StarRevenueStatistics(
        @JvmField
        public val revenueByDayGraph: StatisticalGraph,
        @JvmField
        public val status: StarRevenueStatus,
        @JvmField
        public val usdRate: Double,
    ) : Object() {
        override fun getConstructor(): Int = -1_121_086_889
    }

    public class StarRevenueStatus(
        @JvmField
        public val totalAmount: StarAmount,
        @JvmField
        public val currentAmount: StarAmount,
        @JvmField
        public val availableAmount: StarAmount,
        @JvmField
        public val withdrawalEnabled: Boolean,
        @JvmField
        public val nextWithdrawalIn: Int,
    ) : Object() {
        override fun getConstructor(): Int = 2_006_266_600
    }

    public class StarSubscription(
        @JvmField
        public val id: String,
        @JvmField
        public val chatId: Long,
        @JvmField
        public val expirationDate: Int,
        @JvmField
        public val isCanceled: Boolean,
        @JvmField
        public val isExpiring: Boolean,
        @JvmField
        public val pricing: StarSubscriptionPricing,
        @JvmField
        public val type: StarSubscriptionType,
    ) : Object() {
        override fun getConstructor(): Int = 976_753_141
    }

    public class StarSubscriptionPricing(
        @JvmField
        public val period: Int,
        @JvmField
        public val starCount: Long,
    ) : Object() {
        override fun getConstructor(): Int = -1_767_733_162
    }

    public abstract class StarSubscriptionType() : Object()

    public class StarSubscriptionTypeChannel(
        @JvmField
        public val canReuse: Boolean,
        @JvmField
        public val inviteLink: String,
    ) : StarSubscriptionType() {
        override fun getConstructor(): Int = -1_030_048_011
    }

    public class StarSubscriptionTypeBot(
        @JvmField
        public val isCanceledByBot: Boolean,
        @JvmField
        public val title: String,
        @JvmField
        public val photo: Photo,
        @JvmField
        public val invoiceLink: String,
    ) : StarSubscriptionType() {
        override fun getConstructor(): Int = 226_024_914
    }

    public class StarSubscriptions(
        @JvmField
        public val starAmount: StarAmount,
        @JvmField
        public val subscriptions: Array<StarSubscription>,
        @JvmField
        public val requiredStarCount: Long,
        @JvmField
        public val nextOffset: String,
    ) : Object() {
        override fun getConstructor(): Int = 151_169_395
    }

    public class StarTransaction(
        @JvmField
        public val id: String,
        @JvmField
        public val starAmount: StarAmount,
        @JvmField
        public val isRefund: Boolean,
        @JvmField
        public val date: Int,
        @JvmField
        public val type: StarTransactionType,
    ) : Object() {
        override fun getConstructor(): Int = 2_139_228_816
    }

    public abstract class StarTransactionDirection() : Object()

    public class StarTransactionDirectionIncoming() : StarTransactionDirection() {
        override fun getConstructor(): Int = -1_295_335_866
    }

    public class StarTransactionDirectionOutgoing() : StarTransactionDirection() {
        override fun getConstructor(): Int = 1_854_125_472
    }

    public abstract class StarTransactionType() : Object()

    public class StarTransactionTypePremiumBotDeposit() : StarTransactionType() {
        override fun getConstructor(): Int = -663_156_466
    }

    public class StarTransactionTypeAppStoreDeposit() : StarTransactionType() {
        override fun getConstructor(): Int = 136_853_825
    }

    public class StarTransactionTypeGooglePlayDeposit() : StarTransactionType() {
        override fun getConstructor(): Int = -323_111_338
    }

    public class StarTransactionTypeFragmentDeposit() : StarTransactionType() {
        override fun getConstructor(): Int = 123_887_172
    }

    public class StarTransactionTypeUserDeposit(
        @JvmField
        public val userId: Long,
        @JvmField
        public val sticker: Sticker?,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = 204_085_481
    }

    public class StarTransactionTypeGiveawayDeposit(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val giveawayMessageId: Long,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = -1_318_977_338
    }

    public class StarTransactionTypeFragmentWithdrawal(
        @JvmField
        public val withdrawalState: RevenueWithdrawalState?,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = -1_355_142_766
    }

    public class StarTransactionTypeTelegramAdsWithdrawal() : StarTransactionType() {
        override fun getConstructor(): Int = -1_517_386_647
    }

    public class StarTransactionTypeTelegramApiUsage(
        @JvmField
        public val requestCount: Int,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = 665_332_478
    }

    public class StarTransactionTypeBotPaidMediaPurchase(
        @JvmField
        public val userId: Long,
        @JvmField
        public val media: Array<PaidMedia>,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = 976_645_509
    }

    public class StarTransactionTypeBotPaidMediaSale(
        @JvmField
        public val userId: Long,
        @JvmField
        public val media: Array<PaidMedia>,
        @JvmField
        public val payload: String,
        @JvmField
        public val affiliate: AffiliateInfo?,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = -1_034_408_372
    }

    public class StarTransactionTypeChannelPaidMediaPurchase(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val media: Array<PaidMedia>,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = -1_321_281_338
    }

    public class StarTransactionTypeChannelPaidMediaSale(
        @JvmField
        public val userId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val media: Array<PaidMedia>,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = 52_587_085
    }

    public class StarTransactionTypeBotInvoicePurchase(
        @JvmField
        public val userId: Long,
        @JvmField
        public val productInfo: ProductInfo,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = 501_066_764
    }

    public class StarTransactionTypeBotInvoiceSale(
        @JvmField
        public val userId: Long,
        @JvmField
        public val productInfo: ProductInfo,
        @JvmField
        public val invoicePayload: ByteArray,
        @JvmField
        public val affiliate: AffiliateInfo?,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = 1_534_954_799
    }

    public class StarTransactionTypeBotSubscriptionPurchase(
        @JvmField
        public val userId: Long,
        @JvmField
        public val subscriptionPeriod: Int,
        @JvmField
        public val productInfo: ProductInfo,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = 1_086_264_149
    }

    public class StarTransactionTypeBotSubscriptionSale(
        @JvmField
        public val userId: Long,
        @JvmField
        public val subscriptionPeriod: Int,
        @JvmField
        public val productInfo: ProductInfo,
        @JvmField
        public val invoicePayload: ByteArray,
        @JvmField
        public val affiliate: AffiliateInfo?,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = 526_936_201
    }

    public class StarTransactionTypeChannelSubscriptionPurchase(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val subscriptionPeriod: Int,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = 940_487_633
    }

    public class StarTransactionTypeChannelSubscriptionSale(
        @JvmField
        public val userId: Long,
        @JvmField
        public val subscriptionPeriod: Int,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = -32_342_910
    }

    public class StarTransactionTypeGiftPurchase(
        @JvmField
        public val ownerId: MessageSender,
        @JvmField
        public val gift: Gift,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = -1_819_045_664
    }

    public class StarTransactionTypeGiftTransfer(
        @JvmField
        public val ownerId: MessageSender,
        @JvmField
        public val gift: UpgradedGift,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = 9_835_767
    }

    public class StarTransactionTypeGiftSale(
        @JvmField
        public val userId: Long,
        @JvmField
        public val gift: Gift,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = 1_691_750_743
    }

    public class StarTransactionTypeGiftUpgrade(
        @JvmField
        public val userId: Long,
        @JvmField
        public val gift: UpgradedGift,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = -632_388_839
    }

    public class StarTransactionTypeChannelPaidReactionSend(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = -1_071_224_896
    }

    public class StarTransactionTypeChannelPaidReactionReceive(
        @JvmField
        public val userId: Long,
        @JvmField
        public val messageId: Long,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = 601_291_243
    }

    public class StarTransactionTypeAffiliateProgramCommission(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val commissionPerMille: Int,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = -1_704_757_901
    }

    public class StarTransactionTypePaidMessageSend(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageCount: Int,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = -1_709_611_931
    }

    public class StarTransactionTypePaidMessageReceive(
        @JvmField
        public val senderId: MessageSender,
        @JvmField
        public val messageCount: Int,
        @JvmField
        public val commissionPerMille: Int,
        @JvmField
        public val commissionStarAmount: StarAmount,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = -676_839_994
    }

    public class StarTransactionTypePremiumPurchase(
        @JvmField
        public val userId: Long,
        @JvmField
        public val monthCount: Int,
        @JvmField
        public val sticker: Sticker?,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = 998_094_851
    }

    public class StarTransactionTypeBusinessBotTransferSend(
        @JvmField
        public val userId: Long,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = 1_221_227_814
    }

    public class StarTransactionTypeBusinessBotTransferReceive(
        @JvmField
        public val userId: Long,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = 532_496_778
    }

    public class StarTransactionTypeUnsupported() : StarTransactionType() {
        override fun getConstructor(): Int = 1_993_329_330
    }

    public class StarTransactions(
        @JvmField
        public val starAmount: StarAmount,
        @JvmField
        public val transactions: Array<StarTransaction>,
        @JvmField
        public val nextOffset: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_218_437_859
    }

    public abstract class StatisticalGraph() : Object()

    public class StatisticalGraphData(
        @JvmField
        public val jsonData: String,
        @JvmField
        public val zoomToken: String,
    ) : StatisticalGraph() {
        override fun getConstructor(): Int = -1_988_940_244
    }

    public class StatisticalGraphAsync(
        @JvmField
        public val token: String,
    ) : StatisticalGraph() {
        override fun getConstructor(): Int = 435_891_103
    }

    public class StatisticalGraphError(
        @JvmField
        public val errorMessage: String,
    ) : StatisticalGraph() {
        override fun getConstructor(): Int = -1_006_788_526
    }

    public class StatisticalValue(
        @JvmField
        public val value: Double,
        @JvmField
        public val previousValue: Double,
        @JvmField
        public val growthRatePercentage: Double,
    ) : Object() {
        override fun getConstructor(): Int = 1_651_337_846
    }

    public class Sticker(
        @JvmField
        public val id: Long,
        @JvmField
        public val setId: Long,
        @JvmField
        public val width: Int,
        @JvmField
        public val height: Int,
        @JvmField
        public val emoji: String,
        @JvmField
        public val format: StickerFormat,
        @JvmField
        public val fullType: StickerFullType,
        @JvmField
        public val thumbnail: Thumbnail?,
        @JvmField
        public val sticker: File,
    ) : Object() {
        override fun getConstructor(): Int = -647_013_057
    }

    public abstract class StickerFormat() : Object()

    public class StickerFormatWebp() : StickerFormat() {
        override fun getConstructor(): Int = -2_123_043_040
    }

    public class StickerFormatTgs() : StickerFormat() {
        override fun getConstructor(): Int = 1_614_588_662
    }

    public class StickerFormatWebm() : StickerFormat() {
        override fun getConstructor(): Int = -2_070_162_097
    }

    public abstract class StickerFullType() : Object()

    public class StickerFullTypeRegular(
        @JvmField
        public val premiumAnimation: File?,
    ) : StickerFullType() {
        override fun getConstructor(): Int = -2_006_425_865
    }

    public class StickerFullTypeMask(
        @JvmField
        public val maskPosition: MaskPosition?,
    ) : StickerFullType() {
        override fun getConstructor(): Int = 652_197_687
    }

    public class StickerFullTypeCustomEmoji(
        @JvmField
        public val customEmojiId: Long,
        @JvmField
        public val needsRepainting: Boolean,
    ) : StickerFullType() {
        override fun getConstructor(): Int = -1_015_085_653
    }

    public class StickerSet(
        @JvmField
        public val id: Long,
        @JvmField
        public val title: String,
        @JvmField
        public val name: String,
        @JvmField
        public val thumbnail: Thumbnail?,
        @JvmField
        public val thumbnailOutline: Outline?,
        @JvmField
        public val isOwned: Boolean,
        @JvmField
        public val isInstalled: Boolean,
        @JvmField
        public val isArchived: Boolean,
        @JvmField
        public val isOfficial: Boolean,
        @JvmField
        public val stickerType: StickerType,
        @JvmField
        public val needsRepainting: Boolean,
        @JvmField
        public val isAllowedAsChatEmojiStatus: Boolean,
        @JvmField
        public val isViewed: Boolean,
        @JvmField
        public val stickers: Array<Sticker>,
        @JvmField
        public val emojis: Array<Emojis>,
    ) : Object() {
        override fun getConstructor(): Int = -1_783_150_210
    }

    public class StickerSetInfo(
        @JvmField
        public val id: Long,
        @JvmField
        public val title: String,
        @JvmField
        public val name: String,
        @JvmField
        public val thumbnail: Thumbnail?,
        @JvmField
        public val thumbnailOutline: Outline?,
        @JvmField
        public val isOwned: Boolean,
        @JvmField
        public val isInstalled: Boolean,
        @JvmField
        public val isArchived: Boolean,
        @JvmField
        public val isOfficial: Boolean,
        @JvmField
        public val stickerType: StickerType,
        @JvmField
        public val needsRepainting: Boolean,
        @JvmField
        public val isAllowedAsChatEmojiStatus: Boolean,
        @JvmField
        public val isViewed: Boolean,
        @JvmField
        public val size: Int,
        @JvmField
        public val covers: Array<Sticker>,
    ) : Object() {
        override fun getConstructor(): Int = -1_649_074_729
    }

    public class StickerSets(
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val sets: Array<StickerSetInfo>,
    ) : Object() {
        override fun getConstructor(): Int = -1_883_828_812
    }

    public abstract class StickerType() : Object()

    public class StickerTypeRegular() : StickerType() {
        override fun getConstructor(): Int = 56_345_973
    }

    public class StickerTypeMask() : StickerType() {
        override fun getConstructor(): Int = -1_765_394_796
    }

    public class StickerTypeCustomEmoji() : StickerType() {
        override fun getConstructor(): Int = -120_752_249
    }

    public class Stickers(
        @JvmField
        public val stickers: Array<Sticker>,
    ) : Object() {
        override fun getConstructor(): Int = 1_974_859_260
    }

    public class StorageStatistics(
        @JvmField
        public val size: Long,
        @JvmField
        public val count: Int,
        @JvmField
        public val byChat: Array<StorageStatisticsByChat>,
    ) : Object() {
        override fun getConstructor(): Int = 217_237_013
    }

    public class StorageStatisticsByChat(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val size: Long,
        @JvmField
        public val count: Int,
        @JvmField
        public val byFileType: Array<StorageStatisticsByFileType>,
    ) : Object() {
        override fun getConstructor(): Int = 635_434_531
    }

    public class StorageStatisticsByFileType(
        @JvmField
        public val fileType: FileType,
        @JvmField
        public val size: Long,
        @JvmField
        public val count: Int,
    ) : Object() {
        override fun getConstructor(): Int = 714_012_840
    }

    public class StorageStatisticsFast(
        @JvmField
        public val filesSize: Long,
        @JvmField
        public val fileCount: Int,
        @JvmField
        public val databaseSize: Long,
        @JvmField
        public val languagePackDatabaseSize: Long,
        @JvmField
        public val logSize: Long,
    ) : Object() {
        override fun getConstructor(): Int = -884_922_271
    }

    public abstract class StorePaymentPurpose() : Object()

    public class StorePaymentPurposePremiumSubscription(
        @JvmField
        public val isRestore: Boolean,
        @JvmField
        public val isUpgrade: Boolean,
    ) : StorePaymentPurpose() {
        override fun getConstructor(): Int = 1_263_894_804
    }

    public class StorePaymentPurposePremiumGift(
        @JvmField
        public val currency: String,
        @JvmField
        public val amount: Long,
        @JvmField
        public val userId: Long,
        @JvmField
        public val text: FormattedText,
    ) : StorePaymentPurpose() {
        override fun getConstructor(): Int = -39_502_443
    }

    public class StorePaymentPurposePremiumGiftCodes(
        @JvmField
        public val boostedChatId: Long,
        @JvmField
        public val currency: String,
        @JvmField
        public val amount: Long,
        @JvmField
        public val userIds: LongArray,
        @JvmField
        public val text: FormattedText,
    ) : StorePaymentPurpose() {
        override fun getConstructor(): Int = -1_072_286_736
    }

    public class StorePaymentPurposePremiumGiveaway(
        @JvmField
        public val parameters: GiveawayParameters,
        @JvmField
        public val currency: String,
        @JvmField
        public val amount: Long,
    ) : StorePaymentPurpose() {
        override fun getConstructor(): Int = 1_302_624_938
    }

    public class StorePaymentPurposeStarGiveaway(
        @JvmField
        public val parameters: GiveawayParameters,
        @JvmField
        public val currency: String,
        @JvmField
        public val amount: Long,
        @JvmField
        public val winnerCount: Int,
        @JvmField
        public val starCount: Long,
    ) : StorePaymentPurpose() {
        override fun getConstructor(): Int = 211_212_441
    }

    public class StorePaymentPurposeStars(
        @JvmField
        public val currency: String,
        @JvmField
        public val amount: Long,
        @JvmField
        public val starCount: Long,
    ) : StorePaymentPurpose() {
        override fun getConstructor(): Int = -1_803_497_708
    }

    public class StorePaymentPurposeGiftedStars(
        @JvmField
        public val userId: Long,
        @JvmField
        public val currency: String,
        @JvmField
        public val amount: Long,
        @JvmField
        public val starCount: Long,
    ) : StorePaymentPurpose() {
        override fun getConstructor(): Int = 893_691_428
    }

    public abstract class StoreTransaction() : Object()

    public class StoreTransactionAppStore(
        @JvmField
        public val receipt: ByteArray,
    ) : StoreTransaction() {
        override fun getConstructor(): Int = 1_625_562_441
    }

    public class StoreTransactionGooglePlay(
        @JvmField
        public val packageName: String,
        @JvmField
        public val storeProductId: String,
        @JvmField
        public val purchaseToken: String,
    ) : StoreTransaction() {
        override fun getConstructor(): Int = 1_094_018_617
    }

    public class Stories(
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val stories: Array<Story>,
        @JvmField
        public val pinnedStoryIds: IntArray,
    ) : Object() {
        override fun getConstructor(): Int = 670_157_595
    }

    public class Story(
        @JvmField
        public val id: Int,
        @JvmField
        public val posterChatId: Long,
        @JvmField
        public val posterId: MessageSender?,
        @JvmField
        public val date: Int,
        @JvmField
        public val isBeingPosted: Boolean,
        @JvmField
        public val isBeingEdited: Boolean,
        @JvmField
        public val isEdited: Boolean,
        @JvmField
        public val isPostedToChatPage: Boolean,
        @JvmField
        public val isVisibleOnlyForSelf: Boolean,
        @JvmField
        public val canBeDeleted: Boolean,
        @JvmField
        public val canBeEdited: Boolean,
        @JvmField
        public val canBeForwarded: Boolean,
        @JvmField
        public val canBeReplied: Boolean,
        @JvmField
        public val canToggleIsPostedToChatPage: Boolean,
        @JvmField
        public val canGetStatistics: Boolean,
        @JvmField
        public val canGetInteractions: Boolean,
        @JvmField
        public val hasExpiredViewers: Boolean,
        @JvmField
        public val repostInfo: StoryRepostInfo?,
        @JvmField
        public val interactionInfo: StoryInteractionInfo?,
        @JvmField
        public val chosenReactionType: ReactionType?,
        @JvmField
        public val privacySettings: StoryPrivacySettings,
        @JvmField
        public val content: StoryContent,
        @JvmField
        public val areas: Array<StoryArea>,
        @JvmField
        public val caption: FormattedText,
    ) : Object() {
        override fun getConstructor(): Int = 1_206_531_707
    }

    public class StoryArea(
        @JvmField
        public val position: StoryAreaPosition,
        @JvmField
        public val type: StoryAreaType,
    ) : Object() {
        override fun getConstructor(): Int = -906_033_314
    }

    public class StoryAreaPosition(
        @JvmField
        public val xPercentage: Double,
        @JvmField
        public val yPercentage: Double,
        @JvmField
        public val widthPercentage: Double,
        @JvmField
        public val heightPercentage: Double,
        @JvmField
        public val rotationAngle: Double,
        @JvmField
        public val cornerRadiusPercentage: Double,
    ) : Object() {
        override fun getConstructor(): Int = -1_533_023_124
    }

    public abstract class StoryAreaType() : Object()

    public class StoryAreaTypeLocation(
        @JvmField
        public val location: Location,
        @JvmField
        public val address: LocationAddress?,
    ) : StoryAreaType() {
        override fun getConstructor(): Int = -1_464_612_189
    }

    public class StoryAreaTypeVenue(
        @JvmField
        public val venue: Venue,
    ) : StoryAreaType() {
        override fun getConstructor(): Int = 414_076_166
    }

    public class StoryAreaTypeSuggestedReaction(
        @JvmField
        public val reactionType: ReactionType,
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val isDark: Boolean,
        @JvmField
        public val isFlipped: Boolean,
    ) : StoryAreaType() {
        override fun getConstructor(): Int = -111_177_092
    }

    public class StoryAreaTypeMessage(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
    ) : StoryAreaType() {
        override fun getConstructor(): Int = -1_074_825_548
    }

    public class StoryAreaTypeLink(
        @JvmField
        public val url: String,
    ) : StoryAreaType() {
        override fun getConstructor(): Int = -127_770_235
    }

    public class StoryAreaTypeWeather(
        @JvmField
        public val temperature: Double,
        @JvmField
        public val emoji: String,
        @JvmField
        public val backgroundColor: Int,
    ) : StoryAreaType() {
        override fun getConstructor(): Int = -1_504_150_082
    }

    public class StoryAreaTypeUpgradedGift(
        @JvmField
        public val giftName: String,
    ) : StoryAreaType() {
        override fun getConstructor(): Int = 760_281_479
    }

    public abstract class StoryContent() : Object()

    public class StoryContentPhoto(
        @JvmField
        public val photo: Photo,
    ) : StoryContent() {
        override fun getConstructor(): Int = -731_971_504
    }

    public class StoryContentVideo(
        @JvmField
        public val video: StoryVideo,
        @JvmField
        public val alternativeVideo: StoryVideo?,
    ) : StoryContent() {
        override fun getConstructor(): Int = -1_291_754_842
    }

    public class StoryContentUnsupported() : StoryContent() {
        override fun getConstructor(): Int = -2_033_715_858
    }

    public class StoryFullId(
        @JvmField
        public val posterChatId: Long,
        @JvmField
        public val storyId: Int,
    ) : Object() {
        override fun getConstructor(): Int = 765_952_419
    }

    public class StoryInfo(
        @JvmField
        public val storyId: Int,
        @JvmField
        public val date: Int,
        @JvmField
        public val isForCloseFriends: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -1_986_542_766
    }

    public class StoryInteraction(
        @JvmField
        public val actorId: MessageSender,
        @JvmField
        public val interactionDate: Int,
        @JvmField
        public val blockList: BlockList?,
        @JvmField
        public val type: StoryInteractionType,
    ) : Object() {
        override fun getConstructor(): Int = -702_229_982
    }

    public class StoryInteractionInfo(
        @JvmField
        public val viewCount: Int,
        @JvmField
        public val forwardCount: Int,
        @JvmField
        public val reactionCount: Int,
        @JvmField
        public val recentViewerUserIds: LongArray,
    ) : Object() {
        override fun getConstructor(): Int = -846_542_065
    }

    public abstract class StoryInteractionType() : Object()

    public class StoryInteractionTypeView(
        @JvmField
        public val chosenReactionType: ReactionType?,
    ) : StoryInteractionType() {
        override fun getConstructor(): Int = 1_407_399_888
    }

    public class StoryInteractionTypeForward(
        @JvmField
        public val message: Message,
    ) : StoryInteractionType() {
        override fun getConstructor(): Int = 668_089_599
    }

    public class StoryInteractionTypeRepost(
        @JvmField
        public val story: Story,
    ) : StoryInteractionType() {
        override fun getConstructor(): Int = -1_021_150_780
    }

    public class StoryInteractions(
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val totalForwardCount: Int,
        @JvmField
        public val totalReactionCount: Int,
        @JvmField
        public val interactions: Array<StoryInteraction>,
        @JvmField
        public val nextOffset: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_537_062_962
    }

    public abstract class StoryList() : Object()

    public class StoryListMain() : StoryList() {
        override fun getConstructor(): Int = -672_222_209
    }

    public class StoryListArchive() : StoryList() {
        override fun getConstructor(): Int = -41_900_223
    }

    public abstract class StoryOrigin() : Object()

    public class StoryOriginPublicStory(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val storyId: Int,
    ) : StoryOrigin() {
        override fun getConstructor(): Int = 741_842_878
    }

    public class StoryOriginHiddenUser(
        @JvmField
        public val posterName: String,
    ) : StoryOrigin() {
        override fun getConstructor(): Int = -96_348_585
    }

    public abstract class StoryPrivacySettings() : Object()

    public class StoryPrivacySettingsEveryone(
        @JvmField
        public val exceptUserIds: LongArray,
    ) : StoryPrivacySettings() {
        override fun getConstructor(): Int = 890_847_843
    }

    public class StoryPrivacySettingsContacts(
        @JvmField
        public val exceptUserIds: LongArray,
    ) : StoryPrivacySettings() {
        override fun getConstructor(): Int = 50_285_309
    }

    public class StoryPrivacySettingsCloseFriends() : StoryPrivacySettings() {
        override fun getConstructor(): Int = 2_097_122_144
    }

    public class StoryPrivacySettingsSelectedUsers(
        @JvmField
        public val userIds: LongArray,
    ) : StoryPrivacySettings() {
        override fun getConstructor(): Int = -1_885_772_602
    }

    public class StoryRepostInfo(
        @JvmField
        public val origin: StoryOrigin,
        @JvmField
        public val isContentModified: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -8_412_096
    }

    public class StoryStatistics(
        @JvmField
        public val storyInteractionGraph: StatisticalGraph,
        @JvmField
        public val storyReactionGraph: StatisticalGraph,
    ) : Object() {
        override fun getConstructor(): Int = 1_178_897_259
    }

    public class StoryVideo(
        @JvmField
        public val duration: Double,
        @JvmField
        public val width: Int,
        @JvmField
        public val height: Int,
        @JvmField
        public val hasStickers: Boolean,
        @JvmField
        public val isAnimation: Boolean,
        @JvmField
        public val minithumbnail: Minithumbnail?,
        @JvmField
        public val thumbnail: Thumbnail?,
        @JvmField
        public val preloadPrefixSize: Int,
        @JvmField
        public val coverFrameTimestamp: Double,
        @JvmField
        public val video: File,
    ) : Object() {
        override fun getConstructor(): Int = 1_445_661_253
    }

    public abstract class SuggestedAction() : Object()

    public class SuggestedActionEnableArchiveAndMuteNewChats() : SuggestedAction() {
        override fun getConstructor(): Int = 2_017_586_255
    }

    public class SuggestedActionCheckPassword() : SuggestedAction() {
        override fun getConstructor(): Int = 1_910_534_839
    }

    public class SuggestedActionCheckPhoneNumber() : SuggestedAction() {
        override fun getConstructor(): Int = 648_771_563
    }

    public class SuggestedActionViewChecksHint() : SuggestedAction() {
        override fun getConstructor(): Int = 891_303_239
    }

    public class SuggestedActionConvertToBroadcastGroup(
        @JvmField
        public val supergroupId: Long,
    ) : SuggestedAction() {
        override fun getConstructor(): Int = -965_071_304
    }

    public class SuggestedActionSetPassword(
        @JvmField
        public val authorizationDelay: Int,
    ) : SuggestedAction() {
        override fun getConstructor(): Int = 1_863_613_848
    }

    public class SuggestedActionUpgradePremium() : SuggestedAction() {
        override fun getConstructor(): Int = 1_890_220_539
    }

    public class SuggestedActionRestorePremium() : SuggestedAction() {
        override fun getConstructor(): Int = -385_229_468
    }

    public class SuggestedActionSubscribeToAnnualPremium() : SuggestedAction() {
        override fun getConstructor(): Int = 373_913_787
    }

    public class SuggestedActionGiftPremiumForChristmas() : SuggestedAction() {
        override fun getConstructor(): Int = -1_816_924_561
    }

    public class SuggestedActionSetBirthdate() : SuggestedAction() {
        override fun getConstructor(): Int = -356_672_766
    }

    public class SuggestedActionSetProfilePhoto() : SuggestedAction() {
        override fun getConstructor(): Int = -1_612_563_093
    }

    public class SuggestedActionExtendPremium(
        @JvmField
        public val managePremiumSubscriptionUrl: String,
    ) : SuggestedAction() {
        override fun getConstructor(): Int = -566_207_286
    }

    public class SuggestedActionExtendStarSubscriptions() : SuggestedAction() {
        override fun getConstructor(): Int = -47_000_234
    }

    public class Supergroup(
        @JvmField
        public val id: Long,
        @JvmField
        public val usernames: Usernames?,
        @JvmField
        public val date: Int,
        @JvmField
        public val status: ChatMemberStatus,
        @JvmField
        public val memberCount: Int,
        @JvmField
        public val boostLevel: Int,
        @JvmField
        public val hasLinkedChat: Boolean,
        @JvmField
        public val hasLocation: Boolean,
        @JvmField
        public val signMessages: Boolean,
        @JvmField
        public val showMessageSender: Boolean,
        @JvmField
        public val joinToSendMessages: Boolean,
        @JvmField
        public val joinByRequest: Boolean,
        @JvmField
        public val isSlowModeEnabled: Boolean,
        @JvmField
        public val isChannel: Boolean,
        @JvmField
        public val isBroadcastGroup: Boolean,
        @JvmField
        public val isForum: Boolean,
        @JvmField
        public val verificationStatus: VerificationStatus?,
        @JvmField
        public val hasSensitiveContent: Boolean,
        @JvmField
        public val restrictionReason: String,
        @JvmField
        public val paidMessageStarCount: Long,
        @JvmField
        public val hasActiveStories: Boolean,
        @JvmField
        public val hasUnreadActiveStories: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 992_231_696
    }

    public class SupergroupFullInfo(
        @JvmField
        public val photo: ChatPhoto?,
        @JvmField
        public val description: String,
        @JvmField
        public val memberCount: Int,
        @JvmField
        public val administratorCount: Int,
        @JvmField
        public val restrictedCount: Int,
        @JvmField
        public val bannedCount: Int,
        @JvmField
        public val linkedChatId: Long,
        @JvmField
        public val slowModeDelay: Int,
        @JvmField
        public val slowModeDelayExpiresIn: Double,
        @JvmField
        public val canEnablePaidMessages: Boolean,
        @JvmField
        public val canEnablePaidReaction: Boolean,
        @JvmField
        public val canGetMembers: Boolean,
        @JvmField
        public val hasHiddenMembers: Boolean,
        @JvmField
        public val canHideMembers: Boolean,
        @JvmField
        public val canSetStickerSet: Boolean,
        @JvmField
        public val canSetLocation: Boolean,
        @JvmField
        public val canGetStatistics: Boolean,
        @JvmField
        public val canGetRevenueStatistics: Boolean,
        @JvmField
        public val canGetStarRevenueStatistics: Boolean,
        @JvmField
        public val canSendGift: Boolean,
        @JvmField
        public val canToggleAggressiveAntiSpam: Boolean,
        @JvmField
        public val isAllHistoryAvailable: Boolean,
        @JvmField
        public val canHaveSponsoredMessages: Boolean,
        @JvmField
        public val hasAggressiveAntiSpamEnabled: Boolean,
        @JvmField
        public val hasPaidMediaAllowed: Boolean,
        @JvmField
        public val hasPinnedStories: Boolean,
        @JvmField
        public val giftCount: Int,
        @JvmField
        public val myBoostCount: Int,
        @JvmField
        public val unrestrictBoostCount: Int,
        @JvmField
        public val stickerSetId: Long,
        @JvmField
        public val customEmojiStickerSetId: Long,
        @JvmField
        public val location: ChatLocation?,
        @JvmField
        public val inviteLink: ChatInviteLink?,
        @JvmField
        public val botCommands: Array<BotCommands>,
        @JvmField
        public val botVerification: BotVerification?,
        @JvmField
        public val upgradedFromBasicGroupId: Long,
        @JvmField
        public val upgradedFromMaxMessageId: Long,
    ) : Object() {
        override fun getConstructor(): Int = 2_114_051_007
    }

    public abstract class SupergroupMembersFilter() : Object()

    public class SupergroupMembersFilterRecent() : SupergroupMembersFilter() {
        override fun getConstructor(): Int = 1_178_199_509
    }

    public class SupergroupMembersFilterContacts(
        @JvmField
        public val query: String,
    ) : SupergroupMembersFilter() {
        override fun getConstructor(): Int = -1_282_910_856
    }

    public class SupergroupMembersFilterAdministrators() : SupergroupMembersFilter() {
        override fun getConstructor(): Int = -2_097_380_265
    }

    public class SupergroupMembersFilterSearch(
        @JvmField
        public val query: String,
    ) : SupergroupMembersFilter() {
        override fun getConstructor(): Int = -1_696_358_469
    }

    public class SupergroupMembersFilterRestricted(
        @JvmField
        public val query: String,
    ) : SupergroupMembersFilter() {
        override fun getConstructor(): Int = -1_107_800_034
    }

    public class SupergroupMembersFilterBanned(
        @JvmField
        public val query: String,
    ) : SupergroupMembersFilter() {
        override fun getConstructor(): Int = -1_210_621_683
    }

    public class SupergroupMembersFilterMention(
        @JvmField
        public val query: String,
        @JvmField
        public val messageThreadId: Long,
    ) : SupergroupMembersFilter() {
        override fun getConstructor(): Int = 947_915_036
    }

    public class SupergroupMembersFilterBots() : SupergroupMembersFilter() {
        override fun getConstructor(): Int = 492_138_918
    }

    public class TMeUrl(
        @JvmField
        public val url: String,
        @JvmField
        public val type: TMeUrlType,
    ) : Object() {
        override fun getConstructor(): Int = -1_140_786_622
    }

    public abstract class TMeUrlType() : Object()

    public class TMeUrlTypeUser(
        @JvmField
        public val userId: Long,
    ) : TMeUrlType() {
        override fun getConstructor(): Int = 125_336_602
    }

    public class TMeUrlTypeSupergroup(
        @JvmField
        public val supergroupId: Long,
    ) : TMeUrlType() {
        override fun getConstructor(): Int = -1_353_369_944
    }

    public class TMeUrlTypeChatInvite(
        @JvmField
        public val info: ChatInviteLinkInfo,
    ) : TMeUrlType() {
        override fun getConstructor(): Int = 313_907_785
    }

    public class TMeUrlTypeStickerSet(
        @JvmField
        public val stickerSetId: Long,
    ) : TMeUrlType() {
        override fun getConstructor(): Int = 1_602_473_196
    }

    public class TMeUrls(
        @JvmField
        public val urls: Array<TMeUrl>,
    ) : Object() {
        override fun getConstructor(): Int = -1_130_595_098
    }

    public abstract class TargetChat() : Object()

    public class TargetChatCurrent() : TargetChat() {
        override fun getConstructor(): Int = -416_689_904
    }

    public class TargetChatChosen(
        @JvmField
        public val types: TargetChatTypes,
    ) : TargetChat() {
        override fun getConstructor(): Int = -1_392_978_522
    }

    public class TargetChatInternalLink(
        @JvmField
        public val link: InternalLinkType,
    ) : TargetChat() {
        override fun getConstructor(): Int = -579_301_408
    }

    public class TargetChatTypes(
        @JvmField
        public val allowUserChats: Boolean,
        @JvmField
        public val allowBotChats: Boolean,
        @JvmField
        public val allowGroupChats: Boolean,
        @JvmField
        public val allowChannelChats: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_513_098_833
    }

    public abstract class TelegramPaymentPurpose() : Object()

    public class TelegramPaymentPurposePremiumGift(
        @JvmField
        public val currency: String,
        @JvmField
        public val amount: Long,
        @JvmField
        public val userId: Long,
        @JvmField
        public val monthCount: Int,
        @JvmField
        public val text: FormattedText,
    ) : TelegramPaymentPurpose() {
        override fun getConstructor(): Int = -1_600_286_150
    }

    public class TelegramPaymentPurposePremiumGiftCodes(
        @JvmField
        public val boostedChatId: Long,
        @JvmField
        public val currency: String,
        @JvmField
        public val amount: Long,
        @JvmField
        public val userIds: LongArray,
        @JvmField
        public val monthCount: Int,
        @JvmField
        public val text: FormattedText,
    ) : TelegramPaymentPurpose() {
        override fun getConstructor(): Int = -1_863_495_348
    }

    public class TelegramPaymentPurposePremiumGiveaway(
        @JvmField
        public val parameters: GiveawayParameters,
        @JvmField
        public val currency: String,
        @JvmField
        public val amount: Long,
        @JvmField
        public val winnerCount: Int,
        @JvmField
        public val monthCount: Int,
    ) : TelegramPaymentPurpose() {
        override fun getConstructor(): Int = -760_757_441
    }

    public class TelegramPaymentPurposeStars(
        @JvmField
        public val currency: String,
        @JvmField
        public val amount: Long,
        @JvmField
        public val starCount: Long,
    ) : TelegramPaymentPurpose() {
        override fun getConstructor(): Int = -495_718_830
    }

    public class TelegramPaymentPurposeGiftedStars(
        @JvmField
        public val userId: Long,
        @JvmField
        public val currency: String,
        @JvmField
        public val amount: Long,
        @JvmField
        public val starCount: Long,
    ) : TelegramPaymentPurpose() {
        override fun getConstructor(): Int = -1_850_308_042
    }

    public class TelegramPaymentPurposeStarGiveaway(
        @JvmField
        public val parameters: GiveawayParameters,
        @JvmField
        public val currency: String,
        @JvmField
        public val amount: Long,
        @JvmField
        public val winnerCount: Int,
        @JvmField
        public val starCount: Long,
    ) : TelegramPaymentPurpose() {
        override fun getConstructor(): Int = 1_014_604_689
    }

    public class TelegramPaymentPurposeJoinChat(
        @JvmField
        public val inviteLink: String,
    ) : TelegramPaymentPurpose() {
        override fun getConstructor(): Int = -1_914_869_880
    }

    public class TemporaryPasswordState(
        @JvmField
        public val hasPassword: Boolean,
        @JvmField
        public val validFor: Int,
    ) : Object() {
        override fun getConstructor(): Int = 939_837_410
    }

    public class TermsOfService(
        @JvmField
        public val text: FormattedText,
        @JvmField
        public val minUserAge: Int,
        @JvmField
        public val showPopup: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 739_422_597
    }

    public class TestBytes(
        @JvmField
        public val value: ByteArray,
    ) : Object() {
        override fun getConstructor(): Int = -1_541_225_250
    }

    public class TestInt(
        @JvmField
        public val value: Int,
    ) : Object() {
        override fun getConstructor(): Int = -574_804_983
    }

    public class TestString(
        @JvmField
        public val value: String,
    ) : Object() {
        override fun getConstructor(): Int = -27_891_572
    }

    public class TestVectorInt(
        @JvmField
        public val value: IntArray,
    ) : Object() {
        override fun getConstructor(): Int = 593_682_027
    }

    public class TestVectorIntObject(
        @JvmField
        public val value: Array<TestInt>,
    ) : Object() {
        override fun getConstructor(): Int = 125_891_546
    }

    public class TestVectorString(
        @JvmField
        public val value: Array<String>,
    ) : Object() {
        override fun getConstructor(): Int = 79_339_995
    }

    public class TestVectorStringObject(
        @JvmField
        public val value: Array<TestString>,
    ) : Object() {
        override fun getConstructor(): Int = 80_780_537
    }

    public class Text(
        @JvmField
        public val text: String,
    ) : Object() {
        override fun getConstructor(): Int = 578_181_272
    }

    public class TextEntities(
        @JvmField
        public val entities: Array<TextEntity>,
    ) : Object() {
        override fun getConstructor(): Int = -933_199_172
    }

    public class TextEntity(
        @JvmField
        public val offset: Int,
        @JvmField
        public val length: Int,
        @JvmField
        public val type: TextEntityType,
    ) : Object() {
        override fun getConstructor(): Int = -1_951_688_280
    }

    public abstract class TextEntityType() : Object()

    public class TextEntityTypeMention() : TextEntityType() {
        override fun getConstructor(): Int = 934_535_013
    }

    public class TextEntityTypeHashtag() : TextEntityType() {
        override fun getConstructor(): Int = -1_023_958_307
    }

    public class TextEntityTypeCashtag() : TextEntityType() {
        override fun getConstructor(): Int = 1_222_915_915
    }

    public class TextEntityTypeBotCommand() : TextEntityType() {
        override fun getConstructor(): Int = -1_150_997_581
    }

    public class TextEntityTypeUrl() : TextEntityType() {
        override fun getConstructor(): Int = -1_312_762_756
    }

    public class TextEntityTypeEmailAddress() : TextEntityType() {
        override fun getConstructor(): Int = 1_425_545_249
    }

    public class TextEntityTypePhoneNumber() : TextEntityType() {
        override fun getConstructor(): Int = -1_160_140_246
    }

    public class TextEntityTypeBankCardNumber() : TextEntityType() {
        override fun getConstructor(): Int = 105_986_320
    }

    public class TextEntityTypeBold() : TextEntityType() {
        override fun getConstructor(): Int = -1_128_210_000
    }

    public class TextEntityTypeItalic() : TextEntityType() {
        override fun getConstructor(): Int = -118_253_987
    }

    public class TextEntityTypeUnderline() : TextEntityType() {
        override fun getConstructor(): Int = 792_317_842
    }

    public class TextEntityTypeStrikethrough() : TextEntityType() {
        override fun getConstructor(): Int = 961_529_082
    }

    public class TextEntityTypeSpoiler() : TextEntityType() {
        override fun getConstructor(): Int = 544_019_899
    }

    public class TextEntityTypeCode() : TextEntityType() {
        override fun getConstructor(): Int = -974_534_326
    }

    public class TextEntityTypePre() : TextEntityType() {
        override fun getConstructor(): Int = 1_648_958_606
    }

    public class TextEntityTypePreCode(
        @JvmField
        public val language: String,
    ) : TextEntityType() {
        override fun getConstructor(): Int = -945_325_397
    }

    public class TextEntityTypeBlockQuote() : TextEntityType() {
        override fun getConstructor(): Int = -1_003_999_032
    }

    public class TextEntityTypeExpandableBlockQuote() : TextEntityType() {
        override fun getConstructor(): Int = 36_572_261
    }

    public class TextEntityTypeTextUrl(
        @JvmField
        public val url: String,
    ) : TextEntityType() {
        override fun getConstructor(): Int = 445_719_651
    }

    public class TextEntityTypeMentionName(
        @JvmField
        public val userId: Long,
    ) : TextEntityType() {
        override fun getConstructor(): Int = -1_570_974_289
    }

    public class TextEntityTypeCustomEmoji(
        @JvmField
        public val customEmojiId: Long,
    ) : TextEntityType() {
        override fun getConstructor(): Int = 1_724_820_677
    }

    public class TextEntityTypeMediaTimestamp(
        @JvmField
        public val mediaTimestamp: Int,
    ) : TextEntityType() {
        override fun getConstructor(): Int = -1_841_898_992
    }

    public abstract class TextParseMode() : Object()

    public class TextParseModeMarkdown(
        @JvmField
        public val version: Int,
    ) : TextParseMode() {
        override fun getConstructor(): Int = 360_073_407
    }

    public class TextParseModeHTML() : TextParseMode() {
        override fun getConstructor(): Int = 1_660_208_627
    }

    public class TextQuote(
        @JvmField
        public val text: FormattedText,
        @JvmField
        public val position: Int,
        @JvmField
        public val isManual: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -2_039_105_358
    }

    public class ThemeParameters(
        @JvmField
        public val backgroundColor: Int,
        @JvmField
        public val secondaryBackgroundColor: Int,
        @JvmField
        public val headerBackgroundColor: Int,
        @JvmField
        public val bottomBarBackgroundColor: Int,
        @JvmField
        public val sectionBackgroundColor: Int,
        @JvmField
        public val sectionSeparatorColor: Int,
        @JvmField
        public val textColor: Int,
        @JvmField
        public val accentTextColor: Int,
        @JvmField
        public val sectionHeaderTextColor: Int,
        @JvmField
        public val subtitleTextColor: Int,
        @JvmField
        public val destructiveTextColor: Int,
        @JvmField
        public val hintColor: Int,
        @JvmField
        public val linkColor: Int,
        @JvmField
        public val buttonColor: Int,
        @JvmField
        public val buttonTextColor: Int,
    ) : Object() {
        override fun getConstructor(): Int = -276_589_137
    }

    public class ThemeSettings(
        @JvmField
        public val accentColor: Int,
        @JvmField
        public val background: Background?,
        @JvmField
        public val outgoingMessageFill: BackgroundFill,
        @JvmField
        public val animateOutgoingMessageFill: Boolean,
        @JvmField
        public val outgoingMessageAccentColor: Int,
    ) : Object() {
        override fun getConstructor(): Int = -62_120_942
    }

    public class Thumbnail(
        @JvmField
        public val format: ThumbnailFormat,
        @JvmField
        public val width: Int,
        @JvmField
        public val height: Int,
        @JvmField
        public val file: File,
    ) : Object() {
        override fun getConstructor(): Int = 1_243_275_371
    }

    public abstract class ThumbnailFormat() : Object()

    public class ThumbnailFormatJpeg() : ThumbnailFormat() {
        override fun getConstructor(): Int = -653_503_352
    }

    public class ThumbnailFormatGif() : ThumbnailFormat() {
        override fun getConstructor(): Int = 1_252_205_962
    }

    public class ThumbnailFormatMpeg4() : ThumbnailFormat() {
        override fun getConstructor(): Int = 278_616_062
    }

    public class ThumbnailFormatPng() : ThumbnailFormat() {
        override fun getConstructor(): Int = 1_577_490_421
    }

    public class ThumbnailFormatTgs() : ThumbnailFormat() {
        override fun getConstructor(): Int = 1_315_522_642
    }

    public class ThumbnailFormatWebm() : ThumbnailFormat() {
        override fun getConstructor(): Int = -660_084_953
    }

    public class ThumbnailFormatWebp() : ThumbnailFormat() {
        override fun getConstructor(): Int = -53_588_974
    }

    public class TimeZone(
        @JvmField
        public val id: String,
        @JvmField
        public val name: String,
        @JvmField
        public val utcTimeOffset: Int,
    ) : Object() {
        override fun getConstructor(): Int = -1_189_481_763
    }

    public class TimeZones(
        @JvmField
        public val timeZones: Array<TimeZone>,
    ) : Object() {
        override fun getConstructor(): Int = -334_655_570
    }

    public abstract class TopChatCategory() : Object()

    public class TopChatCategoryUsers() : TopChatCategory() {
        override fun getConstructor(): Int = 1_026_706_816
    }

    public class TopChatCategoryBots() : TopChatCategory() {
        override fun getConstructor(): Int = -1_577_129_195
    }

    public class TopChatCategoryGroups() : TopChatCategory() {
        override fun getConstructor(): Int = 1_530_056_846
    }

    public class TopChatCategoryChannels() : TopChatCategory() {
        override fun getConstructor(): Int = -500_825_885
    }

    public class TopChatCategoryInlineBots() : TopChatCategory() {
        override fun getConstructor(): Int = 377_023_356
    }

    public class TopChatCategoryWebAppBots() : TopChatCategory() {
        override fun getConstructor(): Int = 100_062_973
    }

    public class TopChatCategoryCalls() : TopChatCategory() {
        override fun getConstructor(): Int = 356_208_861
    }

    public class TopChatCategoryForwardChats() : TopChatCategory() {
        override fun getConstructor(): Int = 1_695_922_133
    }

    public class TrendingStickerSets(
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val sets: Array<StickerSetInfo>,
        @JvmField
        public val isPremium: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 41_028_940
    }

    public class UnconfirmedSession(
        @JvmField
        public val id: Long,
        @JvmField
        public val logInDate: Int,
        @JvmField
        public val deviceModel: String,
        @JvmField
        public val location: String,
    ) : Object() {
        override fun getConstructor(): Int = -2_062_726_663
    }

    public class UnreadReaction(
        @JvmField
        public val type: ReactionType,
        @JvmField
        public val senderId: MessageSender,
        @JvmField
        public val isBig: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -1_940_178_046
    }

    public abstract class Update() : Object()

    public class UpdateAuthorizationState(
        @JvmField
        public val authorizationState: AuthorizationState,
    ) : Update() {
        override fun getConstructor(): Int = 1_622_347_490
    }

    public class UpdateNewMessage(
        @JvmField
        public val message: Message,
    ) : Update() {
        override fun getConstructor(): Int = -563_105_266
    }

    public class UpdateMessageSendAcknowledged(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
    ) : Update() {
        override fun getConstructor(): Int = 1_302_843_961
    }

    public class UpdateMessageSendSucceeded(
        @JvmField
        public val message: Message,
        @JvmField
        public val oldMessageId: Long,
    ) : Update() {
        override fun getConstructor(): Int = 1_815_715_197
    }

    public class UpdateMessageSendFailed(
        @JvmField
        public val message: Message,
        @JvmField
        public val oldMessageId: Long,
        @JvmField
        public val error: Error,
    ) : Update() {
        override fun getConstructor(): Int = -635_701_017
    }

    public class UpdateMessageContent(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val newContent: MessageContent,
    ) : Update() {
        override fun getConstructor(): Int = 506_903_332
    }

    public class UpdateMessageEdited(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val editDate: Int,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
    ) : Update() {
        override fun getConstructor(): Int = -559_545_626
    }

    public class UpdateMessageIsPinned(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val isPinned: Boolean,
    ) : Update() {
        override fun getConstructor(): Int = 1_102_848_829
    }

    public class UpdateMessageInteractionInfo(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val interactionInfo: MessageInteractionInfo?,
    ) : Update() {
        override fun getConstructor(): Int = -1_417_659_394
    }

    public class UpdateMessageContentOpened(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
    ) : Update() {
        override fun getConstructor(): Int = -1_520_523_131
    }

    public class UpdateMessageMentionRead(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val unreadMentionCount: Int,
    ) : Update() {
        override fun getConstructor(): Int = -252_228_282
    }

    public class UpdateMessageUnreadReactions(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val unreadReactions: Array<UnreadReaction>,
        @JvmField
        public val unreadReactionCount: Int,
    ) : Update() {
        override fun getConstructor(): Int = 942_840_008
    }

    public class UpdateMessageFactCheck(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val factCheck: FactCheck,
    ) : Update() {
        override fun getConstructor(): Int = 1_014_561_538
    }

    public class UpdateMessageLiveLocationViewed(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
    ) : Update() {
        override fun getConstructor(): Int = -1_308_260_971
    }

    public class UpdateVideoPublished(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
    ) : Update() {
        override fun getConstructor(): Int = -352_575_406
    }

    public class UpdateNewChat(
        @JvmField
        public val chat: Chat,
    ) : Update() {
        override fun getConstructor(): Int = 2_075_757_773
    }

    public class UpdateChatTitle(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val title: String,
    ) : Update() {
        override fun getConstructor(): Int = -175_405_660
    }

    public class UpdateChatPhoto(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val photo: ChatPhotoInfo?,
    ) : Update() {
        override fun getConstructor(): Int = -324_713_921
    }

    public class UpdateChatAccentColors(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val accentColorId: Int,
        @JvmField
        public val backgroundCustomEmojiId: Long,
        @JvmField
        public val profileAccentColorId: Int,
        @JvmField
        public val profileBackgroundCustomEmojiId: Long,
    ) : Update() {
        override fun getConstructor(): Int = -1_212_614_407
    }

    public class UpdateChatPermissions(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val permissions: ChatPermissions,
    ) : Update() {
        override fun getConstructor(): Int = -1_622_010_003
    }

    public class UpdateChatLastMessage(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val lastMessage: Message?,
        @JvmField
        public val positions: Array<ChatPosition>,
    ) : Update() {
        override fun getConstructor(): Int = -923_244_537
    }

    public class UpdateChatPosition(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val position: ChatPosition,
    ) : Update() {
        override fun getConstructor(): Int = -8_979_849
    }

    public class UpdateChatAddedToList(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val chatList: ChatList,
    ) : Update() {
        override fun getConstructor(): Int = -1_418_722_068
    }

    public class UpdateChatRemovedFromList(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val chatList: ChatList,
    ) : Update() {
        override fun getConstructor(): Int = 1_294_647_836
    }

    public class UpdateChatReadInbox(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val lastReadInboxMessageId: Long,
        @JvmField
        public val unreadCount: Int,
    ) : Update() {
        override fun getConstructor(): Int = -797_952_281
    }

    public class UpdateChatReadOutbox(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val lastReadOutboxMessageId: Long,
    ) : Update() {
        override fun getConstructor(): Int = 708_334_213
    }

    public class UpdateChatActionBar(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val actionBar: ChatActionBar?,
    ) : Update() {
        override fun getConstructor(): Int = -643_671_870
    }

    public class UpdateChatBusinessBotManageBar(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val businessBotManageBar: BusinessBotManageBar?,
    ) : Update() {
        override fun getConstructor(): Int = -1_104_091_145
    }

    public class UpdateChatAvailableReactions(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val availableReactions: ChatAvailableReactions,
    ) : Update() {
        override fun getConstructor(): Int = -1_967_909_895
    }

    public class UpdateChatDraftMessage(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val draftMessage: DraftMessage?,
        @JvmField
        public val positions: Array<ChatPosition>,
    ) : Update() {
        override fun getConstructor(): Int = 1_455_190_380
    }

    public class UpdateChatEmojiStatus(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val emojiStatus: EmojiStatus?,
    ) : Update() {
        override fun getConstructor(): Int = 2_004_444_432
    }

    public class UpdateChatMessageSender(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageSenderId: MessageSender?,
    ) : Update() {
        override fun getConstructor(): Int = 2_003_849_793
    }

    public class UpdateChatMessageAutoDeleteTime(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageAutoDeleteTime: Int,
    ) : Update() {
        override fun getConstructor(): Int = 1_900_174_821
    }

    public class UpdateChatNotificationSettings(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val notificationSettings: ChatNotificationSettings,
    ) : Update() {
        override fun getConstructor(): Int = -803_163_050
    }

    public class UpdateChatPendingJoinRequests(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val pendingJoinRequests: ChatJoinRequestsInfo?,
    ) : Update() {
        override fun getConstructor(): Int = 348_578_785
    }

    public class UpdateChatReplyMarkup(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val replyMarkupMessageId: Long,
    ) : Update() {
        override fun getConstructor(): Int = 1_309_386_144
    }

    public class UpdateChatBackground(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val background: ChatBackground?,
    ) : Update() {
        override fun getConstructor(): Int = -6_473_549
    }

    public class UpdateChatTheme(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val themeName: String,
    ) : Update() {
        override fun getConstructor(): Int = 838_063_205
    }

    public class UpdateChatUnreadMentionCount(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val unreadMentionCount: Int,
    ) : Update() {
        override fun getConstructor(): Int = -2_131_461_348
    }

    public class UpdateChatUnreadReactionCount(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val unreadReactionCount: Int,
    ) : Update() {
        override fun getConstructor(): Int = -2_124_399_395
    }

    public class UpdateChatVideoChat(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val videoChat: VideoChat,
    ) : Update() {
        override fun getConstructor(): Int = 637_226_150
    }

    public class UpdateChatDefaultDisableNotification(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val defaultDisableNotification: Boolean,
    ) : Update() {
        override fun getConstructor(): Int = 464_087_707
    }

    public class UpdateChatHasProtectedContent(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val hasProtectedContent: Boolean,
    ) : Update() {
        override fun getConstructor(): Int = 1_800_406_811
    }

    public class UpdateChatIsTranslatable(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val isTranslatable: Boolean,
    ) : Update() {
        override fun getConstructor(): Int = 2_063_799_831
    }

    public class UpdateChatIsMarkedAsUnread(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val isMarkedAsUnread: Boolean,
    ) : Update() {
        override fun getConstructor(): Int = 1_468_347_188
    }

    public class UpdateChatViewAsTopics(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val viewAsTopics: Boolean,
    ) : Update() {
        override fun getConstructor(): Int = 1_543_444_029
    }

    public class UpdateChatBlockList(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val blockList: BlockList?,
    ) : Update() {
        override fun getConstructor(): Int = -2_027_228_018
    }

    public class UpdateChatHasScheduledMessages(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val hasScheduledMessages: Boolean,
    ) : Update() {
        override fun getConstructor(): Int = 2_064_958_167
    }

    public class UpdateChatFolders(
        @JvmField
        public val chatFolders: Array<ChatFolderInfo>,
        @JvmField
        public val mainChatListPosition: Int,
        @JvmField
        public val areTagsEnabled: Boolean,
    ) : Update() {
        override fun getConstructor(): Int = 1_998_101_395
    }

    public class UpdateChatOnlineMemberCount(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val onlineMemberCount: Int,
    ) : Update() {
        override fun getConstructor(): Int = 487_369_373
    }

    public class UpdateSavedMessagesTopic(
        @JvmField
        public val topic: SavedMessagesTopic,
    ) : Update() {
        override fun getConstructor(): Int = -1_618_855_120
    }

    public class UpdateSavedMessagesTopicCount(
        @JvmField
        public val topicCount: Int,
    ) : Update() {
        override fun getConstructor(): Int = -70_092_335
    }

    public class UpdateQuickReplyShortcut(
        @JvmField
        public val shortcut: QuickReplyShortcut,
    ) : Update() {
        override fun getConstructor(): Int = -963_430_193
    }

    public class UpdateQuickReplyShortcutDeleted(
        @JvmField
        public val shortcutId: Int,
    ) : Update() {
        override fun getConstructor(): Int = -390_480_838
    }

    public class UpdateQuickReplyShortcuts(
        @JvmField
        public val shortcutIds: IntArray,
    ) : Update() {
        override fun getConstructor(): Int = -1_994_849_731
    }

    public class UpdateQuickReplyShortcutMessages(
        @JvmField
        public val shortcutId: Int,
        @JvmField
        public val messages: Array<QuickReplyMessage>,
    ) : Update() {
        override fun getConstructor(): Int = -1_396_685_225
    }

    public class UpdateForumTopicInfo(
        @JvmField
        public val info: ForumTopicInfo,
    ) : Update() {
        override fun getConstructor(): Int = 1_420_762_696
    }

    public class UpdateForumTopic(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageThreadId: Long,
        @JvmField
        public val isPinned: Boolean,
        @JvmField
        public val lastReadInboxMessageId: Long,
        @JvmField
        public val lastReadOutboxMessageId: Long,
        @JvmField
        public val notificationSettings: ChatNotificationSettings,
    ) : Update() {
        override fun getConstructor(): Int = 266_794_534
    }

    public class UpdateScopeNotificationSettings(
        @JvmField
        public val scope: NotificationSettingsScope,
        @JvmField
        public val notificationSettings: ScopeNotificationSettings,
    ) : Update() {
        override fun getConstructor(): Int = -1_203_975_309
    }

    public class UpdateReactionNotificationSettings(
        @JvmField
        public val notificationSettings: ReactionNotificationSettings,
    ) : Update() {
        override fun getConstructor(): Int = -447_932_436
    }

    public class UpdateNotification(
        @JvmField
        public val notificationGroupId: Int,
        @JvmField
        public val notification: Notification,
    ) : Update() {
        override fun getConstructor(): Int = -1_897_496_876
    }

    public class UpdateNotificationGroup(
        @JvmField
        public val notificationGroupId: Int,
        @JvmField
        public val type: NotificationGroupType,
        @JvmField
        public val chatId: Long,
        @JvmField
        public val notificationSettingsChatId: Long,
        @JvmField
        public val notificationSoundId: Long,
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val addedNotifications: Array<Notification>,
        @JvmField
        public val removedNotificationIds: IntArray,
    ) : Update() {
        override fun getConstructor(): Int = 1_381_081_378
    }

    public class UpdateActiveNotifications(
        @JvmField
        public val groups: Array<NotificationGroup>,
    ) : Update() {
        override fun getConstructor(): Int = -1_306_672_221
    }

    public class UpdateHavePendingNotifications(
        @JvmField
        public val haveDelayedNotifications: Boolean,
        @JvmField
        public val haveUnreceivedNotifications: Boolean,
    ) : Update() {
        override fun getConstructor(): Int = 179_233_243
    }

    public class UpdateDeleteMessages(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageIds: LongArray,
        @JvmField
        public val isPermanent: Boolean,
        @JvmField
        public val fromCache: Boolean,
    ) : Update() {
        override fun getConstructor(): Int = 1_669_252_686
    }

    public class UpdateChatAction(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageThreadId: Long,
        @JvmField
        public val senderId: MessageSender,
        @JvmField
        public val action: ChatAction,
    ) : Update() {
        override fun getConstructor(): Int = -1_698_703_832
    }

    public class UpdateUserStatus(
        @JvmField
        public val userId: Long,
        @JvmField
        public val status: UserStatus,
    ) : Update() {
        override fun getConstructor(): Int = 958_468_625
    }

    public class UpdateUser(
        @JvmField
        public val user: User,
    ) : Update() {
        override fun getConstructor(): Int = 1_183_394_041
    }

    public class UpdateBasicGroup(
        @JvmField
        public val basicGroup: BasicGroup,
    ) : Update() {
        override fun getConstructor(): Int = -1_003_239_581
    }

    public class UpdateSupergroup(
        @JvmField
        public val supergroup: Supergroup,
    ) : Update() {
        override fun getConstructor(): Int = -76_782_300
    }

    public class UpdateSecretChat(
        @JvmField
        public val secretChat: SecretChat,
    ) : Update() {
        override fun getConstructor(): Int = -1_666_903_253
    }

    public class UpdateUserFullInfo(
        @JvmField
        public val userId: Long,
        @JvmField
        public val userFullInfo: UserFullInfo,
    ) : Update() {
        override fun getConstructor(): Int = -51_197_161
    }

    public class UpdateBasicGroupFullInfo(
        @JvmField
        public val basicGroupId: Long,
        @JvmField
        public val basicGroupFullInfo: BasicGroupFullInfo,
    ) : Update() {
        override fun getConstructor(): Int = 1_391_881_151
    }

    public class UpdateSupergroupFullInfo(
        @JvmField
        public val supergroupId: Long,
        @JvmField
        public val supergroupFullInfo: SupergroupFullInfo,
    ) : Update() {
        override fun getConstructor(): Int = 435_539_214
    }

    public class UpdateServiceNotification(
        @JvmField
        public val type: String,
        @JvmField
        public val content: MessageContent,
    ) : Update() {
        override fun getConstructor(): Int = 1_318_622_637
    }

    public class UpdateFile(
        @JvmField
        public val file: File,
    ) : Update() {
        override fun getConstructor(): Int = 114_132_831
    }

    public class UpdateFileGenerationStart(
        @JvmField
        public val generationId: Long,
        @JvmField
        public val originalPath: String,
        @JvmField
        public val destinationPath: String,
        @JvmField
        public val conversion: String,
    ) : Update() {
        override fun getConstructor(): Int = 216_817_388
    }

    public class UpdateFileGenerationStop(
        @JvmField
        public val generationId: Long,
    ) : Update() {
        override fun getConstructor(): Int = -1_894_449_685
    }

    public class UpdateFileDownloads(
        @JvmField
        public val totalSize: Long,
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val downloadedSize: Long,
    ) : Update() {
        override fun getConstructor(): Int = -389_213_497
    }

    public class UpdateFileAddedToDownloads(
        @JvmField
        public val fileDownload: FileDownload,
        @JvmField
        public val counts: DownloadedFileCounts,
    ) : Update() {
        override fun getConstructor(): Int = 1_609_929_242
    }

    public class UpdateFileDownload(
        @JvmField
        public val fileId: Int,
        @JvmField
        public val completeDate: Int,
        @JvmField
        public val isPaused: Boolean,
        @JvmField
        public val counts: DownloadedFileCounts,
    ) : Update() {
        override fun getConstructor(): Int = 875_529_162
    }

    public class UpdateFileRemovedFromDownloads(
        @JvmField
        public val fileId: Int,
        @JvmField
        public val counts: DownloadedFileCounts,
    ) : Update() {
        override fun getConstructor(): Int = 1_853_625_576
    }

    public class UpdateApplicationVerificationRequired(
        @JvmField
        public val verificationId: Long,
        @JvmField
        public val nonce: String,
        @JvmField
        public val cloudProjectNumber: Long,
    ) : Update() {
        override fun getConstructor(): Int = -979_607_081
    }

    public class UpdateApplicationRecaptchaVerificationRequired(
        @JvmField
        public val verificationId: Long,
        @JvmField
        public val action: String,
        @JvmField
        public val recaptchaKeyId: String,
    ) : Update() {
        override fun getConstructor(): Int = -1_796_351_554
    }

    public class UpdateCall(
        @JvmField
        public val call: Call,
    ) : Update() {
        override fun getConstructor(): Int = 1_337_184_477
    }

    public class UpdateGroupCall(
        @JvmField
        public val groupCall: GroupCall,
    ) : Update() {
        override fun getConstructor(): Int = 808_603_136
    }

    public class UpdateGroupCallParticipant(
        @JvmField
        public val groupCallId: Int,
        @JvmField
        public val participant: GroupCallParticipant,
    ) : Update() {
        override fun getConstructor(): Int = -803_128_071
    }

    public class UpdateGroupCallParticipants(
        @JvmField
        public val groupCallId: Int,
        @JvmField
        public val participantUserIds: LongArray,
    ) : Update() {
        override fun getConstructor(): Int = -1_874_006_374
    }

    public class UpdateGroupCallVerificationState(
        @JvmField
        public val groupCallId: Int,
        @JvmField
        public val generation: Int,
        @JvmField
        public val emojis: Array<String>,
    ) : Update() {
        override fun getConstructor(): Int = 682_965_060
    }

    public class UpdateNewCallSignalingData(
        @JvmField
        public val callId: Int,
        @JvmField
        public val data: ByteArray,
    ) : Update() {
        override fun getConstructor(): Int = 583_634_317
    }

    public class UpdateUserPrivacySettingRules(
        @JvmField
        public val setting: UserPrivacySetting,
        @JvmField
        public val rules: UserPrivacySettingRules,
    ) : Update() {
        override fun getConstructor(): Int = -912_960_778
    }

    public class UpdateUnreadMessageCount(
        @JvmField
        public val chatList: ChatList,
        @JvmField
        public val unreadCount: Int,
        @JvmField
        public val unreadUnmutedCount: Int,
    ) : Update() {
        override fun getConstructor(): Int = 78_987_721
    }

    public class UpdateUnreadChatCount(
        @JvmField
        public val chatList: ChatList,
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val unreadCount: Int,
        @JvmField
        public val unreadUnmutedCount: Int,
        @JvmField
        public val markedAsUnreadCount: Int,
        @JvmField
        public val markedAsUnreadUnmutedCount: Int,
    ) : Update() {
        override fun getConstructor(): Int = 1_994_494_530
    }

    public class UpdateStory(
        @JvmField
        public val story: Story,
    ) : Update() {
        override fun getConstructor(): Int = 419_845_935
    }

    public class UpdateStoryDeleted(
        @JvmField
        public val storyPosterChatId: Long,
        @JvmField
        public val storyId: Int,
    ) : Update() {
        override fun getConstructor(): Int = -582_743_166
    }

    public class UpdateStoryPostSucceeded(
        @JvmField
        public val story: Story,
        @JvmField
        public val oldStoryId: Int,
    ) : Update() {
        override fun getConstructor(): Int = -1_712_432_318
    }

    public class UpdateStoryPostFailed(
        @JvmField
        public val story: Story,
        @JvmField
        public val error: Error,
        @JvmField
        public val errorType: CanPostStoryResult?,
    ) : Update() {
        override fun getConstructor(): Int = 1_248_168_444
    }

    public class UpdateChatActiveStories(
        @JvmField
        public val activeStories: ChatActiveStories,
    ) : Update() {
        override fun getConstructor(): Int = 2_037_935_148
    }

    public class UpdateStoryListChatCount(
        @JvmField
        public val storyList: StoryList,
        @JvmField
        public val chatCount: Int,
    ) : Update() {
        override fun getConstructor(): Int = -2_009_871_041
    }

    public class UpdateStoryStealthMode(
        @JvmField
        public val activeUntilDate: Int,
        @JvmField
        public val cooldownUntilDate: Int,
    ) : Update() {
        override fun getConstructor(): Int = 1_878_506_778
    }

    public class UpdateOption(
        @JvmField
        public val name: String,
        @JvmField
        public val value: OptionValue,
    ) : Update() {
        override fun getConstructor(): Int = 900_822_020
    }

    public class UpdateStickerSet(
        @JvmField
        public val stickerSet: StickerSet,
    ) : Update() {
        override fun getConstructor(): Int = 1_879_268_812
    }

    public class UpdateInstalledStickerSets(
        @JvmField
        public val stickerType: StickerType,
        @JvmField
        public val stickerSetIds: LongArray,
    ) : Update() {
        override fun getConstructor(): Int = -1_735_084_182
    }

    public class UpdateTrendingStickerSets(
        @JvmField
        public val stickerType: StickerType,
        @JvmField
        public val stickerSets: TrendingStickerSets,
    ) : Update() {
        override fun getConstructor(): Int = 1_266_307_239
    }

    public class UpdateRecentStickers(
        @JvmField
        public val isAttached: Boolean,
        @JvmField
        public val stickerIds: IntArray,
    ) : Update() {
        override fun getConstructor(): Int = 1_906_403_540
    }

    public class UpdateFavoriteStickers(
        @JvmField
        public val stickerIds: IntArray,
    ) : Update() {
        override fun getConstructor(): Int = 1_662_240_999
    }

    public class UpdateSavedAnimations(
        @JvmField
        public val animationIds: IntArray,
    ) : Update() {
        override fun getConstructor(): Int = 65_563_814
    }

    public class UpdateSavedNotificationSounds(
        @JvmField
        public val notificationSoundIds: LongArray,
    ) : Update() {
        override fun getConstructor(): Int = 1_052_725_698
    }

    public class UpdateDefaultBackground(
        @JvmField
        public val forDarkTheme: Boolean,
        @JvmField
        public val background: Background?,
    ) : Update() {
        override fun getConstructor(): Int = -716_139_217
    }

    public class UpdateChatThemes(
        @JvmField
        public val chatThemes: Array<ChatTheme>,
    ) : Update() {
        override fun getConstructor(): Int = -1_588_098_376
    }

    public class UpdateAccentColors(
        @JvmField
        public val colors: Array<AccentColor>,
        @JvmField
        public val availableAccentColorIds: IntArray,
    ) : Update() {
        override fun getConstructor(): Int = -1_197_047_738
    }

    public class UpdateProfileAccentColors(
        @JvmField
        public val colors: Array<ProfileAccentColor>,
        @JvmField
        public val availableAccentColorIds: IntArray,
    ) : Update() {
        override fun getConstructor(): Int = 605_202_104
    }

    public class UpdateLanguagePackStrings(
        @JvmField
        public val localizationTarget: String,
        @JvmField
        public val languagePackId: String,
        @JvmField
        public val strings: Array<LanguagePackString>,
    ) : Update() {
        override fun getConstructor(): Int = -1_056_319_886
    }

    public class UpdateConnectionState(
        @JvmField
        public val state: ConnectionState,
    ) : Update() {
        override fun getConstructor(): Int = 1_469_292_078
    }

    public class UpdateFreezeState(
        @JvmField
        public val isFrozen: Boolean,
        @JvmField
        public val freezingDate: Int,
        @JvmField
        public val deletionDate: Int,
        @JvmField
        public val appealLink: String,
    ) : Update() {
        override fun getConstructor(): Int = 1_692_410_540
    }

    public class UpdateTermsOfService(
        @JvmField
        public val termsOfServiceId: String,
        @JvmField
        public val termsOfService: TermsOfService,
    ) : Update() {
        override fun getConstructor(): Int = -1_304_640_162
    }

    public class UpdateUnconfirmedSession(
        @JvmField
        public val session: UnconfirmedSession?,
    ) : Update() {
        override fun getConstructor(): Int = -22_673_268
    }

    public class UpdateAttachmentMenuBots(
        @JvmField
        public val bots: Array<AttachmentMenuBot>,
    ) : Update() {
        override fun getConstructor(): Int = 291_369_922
    }

    public class UpdateWebAppMessageSent(
        @JvmField
        public val webAppLaunchId: Long,
    ) : Update() {
        override fun getConstructor(): Int = 1_480_790_569
    }

    public class UpdateActiveEmojiReactions(
        @JvmField
        public val emojis: Array<String>,
    ) : Update() {
        override fun getConstructor(): Int = 77_556_818
    }

    public class UpdateAvailableMessageEffects(
        @JvmField
        public val reactionEffectIds: LongArray,
        @JvmField
        public val stickerEffectIds: LongArray,
    ) : Update() {
        override fun getConstructor(): Int = 1_964_701_061
    }

    public class UpdateDefaultReactionType(
        @JvmField
        public val reactionType: ReactionType,
    ) : Update() {
        override fun getConstructor(): Int = 1_264_668_933
    }

    public class UpdateDefaultPaidReactionType(
        @JvmField
        public val type: PaidReactionType,
    ) : Update() {
        override fun getConstructor(): Int = 38_198_599
    }

    public class UpdateSavedMessagesTags(
        @JvmField
        public val savedMessagesTopicId: Long,
        @JvmField
        public val tags: SavedMessagesTags,
    ) : Update() {
        override fun getConstructor(): Int = 1_938_178_634
    }

    public class UpdateActiveLiveLocationMessages(
        @JvmField
        public val messages: Array<Message>,
    ) : Update() {
        override fun getConstructor(): Int = -1_308_142_440
    }

    public class UpdateOwnedStarCount(
        @JvmField
        public val starAmount: StarAmount,
    ) : Update() {
        override fun getConstructor(): Int = -1_350_647_928
    }

    public class UpdateChatRevenueAmount(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val revenueAmount: ChatRevenueAmount,
    ) : Update() {
        override fun getConstructor(): Int = -959_857_468
    }

    public class UpdateStarRevenueStatus(
        @JvmField
        public val ownerId: MessageSender,
        @JvmField
        public val status: StarRevenueStatus,
    ) : Update() {
        override fun getConstructor(): Int = -280_232_757
    }

    public class UpdateSpeechRecognitionTrial(
        @JvmField
        public val maxMediaDuration: Int,
        @JvmField
        public val weeklyCount: Int,
        @JvmField
        public val leftCount: Int,
        @JvmField
        public val nextResetDate: Int,
    ) : Update() {
        override fun getConstructor(): Int = -11_600_703
    }

    public class UpdateDiceEmojis(
        @JvmField
        public val emojis: Array<String>,
    ) : Update() {
        override fun getConstructor(): Int = -1_069_066_940
    }

    public class UpdateAnimatedEmojiMessageClicked(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val sticker: Sticker,
    ) : Update() {
        override fun getConstructor(): Int = -1_558_809_595
    }

    public class UpdateAnimationSearchParameters(
        @JvmField
        public val provider: String,
        @JvmField
        public val emojis: Array<String>,
    ) : Update() {
        override fun getConstructor(): Int = -1_144_983_202
    }

    public class UpdateSuggestedActions(
        @JvmField
        public val addedActions: Array<SuggestedAction>,
        @JvmField
        public val removedActions: Array<SuggestedAction>,
    ) : Update() {
        override fun getConstructor(): Int = 1_459_452_346
    }

    public class UpdateSpeedLimitNotification(
        @JvmField
        public val isUpload: Boolean,
    ) : Update() {
        override fun getConstructor(): Int = -964_437_912
    }

    public class UpdateContactCloseBirthdays(
        @JvmField
        public val closeBirthdayUsers: Array<CloseBirthdayUser>,
    ) : Update() {
        override fun getConstructor(): Int = -36_007_873
    }

    public class UpdateAutosaveSettings(
        @JvmField
        public val scope: AutosaveSettingsScope,
        @JvmField
        public val settings: ScopeAutosaveSettings?,
    ) : Update() {
        override fun getConstructor(): Int = -634_958_069
    }

    public class UpdateBusinessConnection(
        @JvmField
        public val connection: BusinessConnection,
    ) : Update() {
        override fun getConstructor(): Int = -2_043_480_970
    }

    public class UpdateNewBusinessMessage(
        @JvmField
        public val connectionId: String,
        @JvmField
        public val message: BusinessMessage,
    ) : Update() {
        override fun getConstructor(): Int = -2_034_350_524
    }

    public class UpdateBusinessMessageEdited(
        @JvmField
        public val connectionId: String,
        @JvmField
        public val message: BusinessMessage,
    ) : Update() {
        override fun getConstructor(): Int = -2_119_799_415
    }

    public class UpdateBusinessMessagesDeleted(
        @JvmField
        public val connectionId: String,
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageIds: LongArray,
    ) : Update() {
        override fun getConstructor(): Int = -1_106_703_050
    }

    public class UpdateNewInlineQuery(
        @JvmField
        public val id: Long,
        @JvmField
        public val senderUserId: Long,
        @JvmField
        public val userLocation: Location?,
        @JvmField
        public val chatType: ChatType?,
        @JvmField
        public val query: String,
        @JvmField
        public val offset: String,
    ) : Update() {
        override fun getConstructor(): Int = 1_903_279_924
    }

    public class UpdateNewChosenInlineResult(
        @JvmField
        public val senderUserId: Long,
        @JvmField
        public val userLocation: Location?,
        @JvmField
        public val query: String,
        @JvmField
        public val resultId: String,
        @JvmField
        public val inlineMessageId: String,
    ) : Update() {
        override fun getConstructor(): Int = -884_191_395
    }

    public class UpdateNewCallbackQuery(
        @JvmField
        public val id: Long,
        @JvmField
        public val senderUserId: Long,
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val chatInstance: Long,
        @JvmField
        public val payload: CallbackQueryPayload,
    ) : Update() {
        override fun getConstructor(): Int = -1_989_881_762
    }

    public class UpdateNewInlineCallbackQuery(
        @JvmField
        public val id: Long,
        @JvmField
        public val senderUserId: Long,
        @JvmField
        public val inlineMessageId: String,
        @JvmField
        public val chatInstance: Long,
        @JvmField
        public val payload: CallbackQueryPayload,
    ) : Update() {
        override fun getConstructor(): Int = -319_212_358
    }

    public class UpdateNewBusinessCallbackQuery(
        @JvmField
        public val id: Long,
        @JvmField
        public val senderUserId: Long,
        @JvmField
        public val connectionId: String,
        @JvmField
        public val message: BusinessMessage,
        @JvmField
        public val chatInstance: Long,
        @JvmField
        public val payload: CallbackQueryPayload,
    ) : Update() {
        override fun getConstructor(): Int = 336_745_316
    }

    public class UpdateNewShippingQuery(
        @JvmField
        public val id: Long,
        @JvmField
        public val senderUserId: Long,
        @JvmField
        public val invoicePayload: String,
        @JvmField
        public val shippingAddress: Address,
    ) : Update() {
        override fun getConstructor(): Int = 693_651_058
    }

    public class UpdateNewPreCheckoutQuery(
        @JvmField
        public val id: Long,
        @JvmField
        public val senderUserId: Long,
        @JvmField
        public val currency: String,
        @JvmField
        public val totalAmount: Long,
        @JvmField
        public val invoicePayload: ByteArray,
        @JvmField
        public val shippingOptionId: String,
        @JvmField
        public val orderInfo: OrderInfo?,
    ) : Update() {
        override fun getConstructor(): Int = 708_342_217
    }

    public class UpdateNewCustomEvent(
        @JvmField
        public val event: String,
    ) : Update() {
        override fun getConstructor(): Int = 1_994_222_092
    }

    public class UpdateNewCustomQuery(
        @JvmField
        public val id: Long,
        @JvmField
        public val data: String,
        @JvmField
        public val timeout: Int,
    ) : Update() {
        override fun getConstructor(): Int = -687_670_874
    }

    public class UpdatePoll(
        @JvmField
        public val poll: Poll,
    ) : Update() {
        override fun getConstructor(): Int = -1_771_342_902
    }

    public class UpdatePollAnswer(
        @JvmField
        public val pollId: Long,
        @JvmField
        public val voterId: MessageSender,
        @JvmField
        public val optionIds: IntArray,
    ) : Update() {
        override fun getConstructor(): Int = 1_104_905_219
    }

    public class UpdateChatMember(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val actorUserId: Long,
        @JvmField
        public val date: Int,
        @JvmField
        public val inviteLink: ChatInviteLink?,
        @JvmField
        public val viaJoinRequest: Boolean,
        @JvmField
        public val viaChatFolderInviteLink: Boolean,
        @JvmField
        public val oldChatMember: ChatMember,
        @JvmField
        public val newChatMember: ChatMember,
    ) : Update() {
        override fun getConstructor(): Int = -1_736_025_145
    }

    public class UpdateNewChatJoinRequest(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val request: ChatJoinRequest,
        @JvmField
        public val userChatId: Long,
        @JvmField
        public val inviteLink: ChatInviteLink?,
    ) : Update() {
        override fun getConstructor(): Int = 2_118_694_979
    }

    public class UpdateChatBoost(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val boost: ChatBoost,
    ) : Update() {
        override fun getConstructor(): Int = 1_349_680_676
    }

    public class UpdateMessageReaction(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val actorId: MessageSender,
        @JvmField
        public val date: Int,
        @JvmField
        public val oldReactionTypes: Array<ReactionType>,
        @JvmField
        public val newReactionTypes: Array<ReactionType>,
    ) : Update() {
        override fun getConstructor(): Int = 1_084_895_706
    }

    public class UpdateMessageReactions(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val date: Int,
        @JvmField
        public val reactions: Array<MessageReaction>,
    ) : Update() {
        override fun getConstructor(): Int = 955_237_189
    }

    public class UpdatePaidMediaPurchased(
        @JvmField
        public val userId: Long,
        @JvmField
        public val payload: String,
    ) : Update() {
        override fun getConstructor(): Int = -1_542_396_325
    }

    public class Updates(
        @JvmField
        public val updates: Array<Update>,
    ) : Object() {
        override fun getConstructor(): Int = 475_842_347
    }

    public class UpgradeGiftResult(
        @JvmField
        public val gift: UpgradedGift,
        @JvmField
        public val receivedGiftId: String,
        @JvmField
        public val isSaved: Boolean,
        @JvmField
        public val canBeTransferred: Boolean,
        @JvmField
        public val transferStarCount: Long,
        @JvmField
        public val exportDate: Int,
    ) : Object() {
        override fun getConstructor(): Int = 664_437_354
    }

    public class UpgradedGift(
        @JvmField
        public val id: Long,
        @JvmField
        public val title: String,
        @JvmField
        public val name: String,
        @JvmField
        public val number: Int,
        @JvmField
        public val totalUpgradedCount: Int,
        @JvmField
        public val maxUpgradedCount: Int,
        @JvmField
        public val ownerId: MessageSender?,
        @JvmField
        public val ownerAddress: String,
        @JvmField
        public val ownerName: String,
        @JvmField
        public val giftAddress: String,
        @JvmField
        public val model: UpgradedGiftModel,
        @JvmField
        public val symbol: UpgradedGiftSymbol,
        @JvmField
        public val backdrop: UpgradedGiftBackdrop,
        @JvmField
        public val originalDetails: UpgradedGiftOriginalDetails?,
    ) : Object() {
        override fun getConstructor(): Int = -473_646_818
    }

    public class UpgradedGiftBackdrop(
        @JvmField
        public val name: String,
        @JvmField
        public val colors: UpgradedGiftBackdropColors,
        @JvmField
        public val rarityPerMille: Int,
    ) : Object() {
        override fun getConstructor(): Int = -334_899_886
    }

    public class UpgradedGiftBackdropColors(
        @JvmField
        public val centerColor: Int,
        @JvmField
        public val edgeColor: Int,
        @JvmField
        public val symbolColor: Int,
        @JvmField
        public val textColor: Int,
    ) : Object() {
        override fun getConstructor(): Int = 4_227_529
    }

    public class UpgradedGiftModel(
        @JvmField
        public val name: String,
        @JvmField
        public val sticker: Sticker,
        @JvmField
        public val rarityPerMille: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_360_156_751
    }

    public class UpgradedGiftOriginalDetails(
        @JvmField
        public val senderId: MessageSender?,
        @JvmField
        public val receiverId: MessageSender,
        @JvmField
        public val text: FormattedText,
        @JvmField
        public val date: Int,
    ) : Object() {
        override fun getConstructor(): Int = 55_247_728
    }

    public class UpgradedGiftSymbol(
        @JvmField
        public val name: String,
        @JvmField
        public val sticker: Sticker,
        @JvmField
        public val rarityPerMille: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_128_318_383
    }

    public class User(
        @JvmField
        public val id: Long,
        @JvmField
        public val firstName: String,
        @JvmField
        public val lastName: String,
        @JvmField
        public val usernames: Usernames?,
        @JvmField
        public val phoneNumber: String,
        @JvmField
        public val status: UserStatus,
        @JvmField
        public val profilePhoto: ProfilePhoto?,
        @JvmField
        public val accentColorId: Int,
        @JvmField
        public val backgroundCustomEmojiId: Long,
        @JvmField
        public val profileAccentColorId: Int,
        @JvmField
        public val profileBackgroundCustomEmojiId: Long,
        @JvmField
        public val emojiStatus: EmojiStatus?,
        @JvmField
        public val isContact: Boolean,
        @JvmField
        public val isMutualContact: Boolean,
        @JvmField
        public val isCloseFriend: Boolean,
        @JvmField
        public val verificationStatus: VerificationStatus?,
        @JvmField
        public val isPremium: Boolean,
        @JvmField
        public val isSupport: Boolean,
        @JvmField
        public val restrictionReason: String,
        @JvmField
        public val hasActiveStories: Boolean,
        @JvmField
        public val hasUnreadActiveStories: Boolean,
        @JvmField
        public val restrictsNewChats: Boolean,
        @JvmField
        public val paidMessageStarCount: Long,
        @JvmField
        public val haveAccess: Boolean,
        @JvmField
        public val type: UserType,
        @JvmField
        public val languageCode: String,
        @JvmField
        public val addedToAttachmentMenu: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -1_848_524_366
    }

    public class UserFullInfo(
        @JvmField
        public val personalPhoto: ChatPhoto?,
        @JvmField
        public val photo: ChatPhoto?,
        @JvmField
        public val publicPhoto: ChatPhoto?,
        @JvmField
        public val blockList: BlockList?,
        @JvmField
        public val canBeCalled: Boolean,
        @JvmField
        public val supportsVideoCalls: Boolean,
        @JvmField
        public val hasPrivateCalls: Boolean,
        @JvmField
        public val hasPrivateForwards: Boolean,
        @JvmField
        public val hasRestrictedVoiceAndVideoNoteMessages: Boolean,
        @JvmField
        public val hasPostedToProfileStories: Boolean,
        @JvmField
        public val hasSponsoredMessagesEnabled: Boolean,
        @JvmField
        public val needPhoneNumberPrivacyException: Boolean,
        @JvmField
        public val setChatBackground: Boolean,
        @JvmField
        public val bio: FormattedText?,
        @JvmField
        public val birthdate: Birthdate?,
        @JvmField
        public val personalChatId: Long,
        @JvmField
        public val giftCount: Int,
        @JvmField
        public val groupInCommonCount: Int,
        @JvmField
        public val incomingPaidMessageStarCount: Long,
        @JvmField
        public val outgoingPaidMessageStarCount: Long,
        @JvmField
        public val giftSettings: GiftSettings,
        @JvmField
        public val botVerification: BotVerification?,
        @JvmField
        public val businessInfo: BusinessInfo?,
        @JvmField
        public val botInfo: BotInfo?,
    ) : Object() {
        override fun getConstructor(): Int = -121_173_496
    }

    public class UserLink(
        @JvmField
        public val url: String,
        @JvmField
        public val expiresIn: Int,
    ) : Object() {
        override fun getConstructor(): Int = 498_138_872
    }

    public abstract class UserPrivacySetting() : Object()

    public class UserPrivacySettingShowStatus() : UserPrivacySetting() {
        override fun getConstructor(): Int = 1_862_829_310
    }

    public class UserPrivacySettingShowProfilePhoto() : UserPrivacySetting() {
        override fun getConstructor(): Int = 1_408_485_877
    }

    public class UserPrivacySettingShowLinkInForwardedMessages() : UserPrivacySetting() {
        override fun getConstructor(): Int = 592_688_870
    }

    public class UserPrivacySettingShowPhoneNumber() : UserPrivacySetting() {
        override fun getConstructor(): Int = -791_567_831
    }

    public class UserPrivacySettingShowBio() : UserPrivacySetting() {
        override fun getConstructor(): Int = 959_981_409
    }

    public class UserPrivacySettingShowBirthdate() : UserPrivacySetting() {
        override fun getConstructor(): Int = 1_167_504_607
    }

    public class UserPrivacySettingAllowChatInvites() : UserPrivacySetting() {
        override fun getConstructor(): Int = 1_271_668_007
    }

    public class UserPrivacySettingAllowCalls() : UserPrivacySetting() {
        override fun getConstructor(): Int = -906_967_291
    }

    public class UserPrivacySettingAllowPeerToPeerCalls() : UserPrivacySetting() {
        override fun getConstructor(): Int = 352_500_032
    }

    public class UserPrivacySettingAllowFindingByPhoneNumber() : UserPrivacySetting() {
        override fun getConstructor(): Int = -1_846_645_423
    }

    public class UserPrivacySettingAllowPrivateVoiceAndVideoNoteMessages() : UserPrivacySetting() {
        override fun getConstructor(): Int = 338_112_060
    }

    public class UserPrivacySettingAutosaveGifts() : UserPrivacySetting() {
        override fun getConstructor(): Int = 1_889_167_821
    }

    public class UserPrivacySettingAllowUnpaidMessages() : UserPrivacySetting() {
        override fun getConstructor(): Int = 1_430_051_047
    }

    public abstract class UserPrivacySettingRule() : Object()

    public class UserPrivacySettingRuleAllowAll() : UserPrivacySettingRule() {
        override fun getConstructor(): Int = -1_967_186_881
    }

    public class UserPrivacySettingRuleAllowContacts() : UserPrivacySettingRule() {
        override fun getConstructor(): Int = -1_892_733_680
    }

    public class UserPrivacySettingRuleAllowBots() : UserPrivacySettingRule() {
        override fun getConstructor(): Int = 1_404_208_925
    }

    public class UserPrivacySettingRuleAllowPremiumUsers() : UserPrivacySettingRule() {
        override fun getConstructor(): Int = 1_624_147_265
    }

    public class UserPrivacySettingRuleAllowUsers(
        @JvmField
        public val userIds: LongArray,
    ) : UserPrivacySettingRule() {
        override fun getConstructor(): Int = 1_110_988_334
    }

    public class UserPrivacySettingRuleAllowChatMembers(
        @JvmField
        public val chatIds: LongArray,
    ) : UserPrivacySettingRule() {
        override fun getConstructor(): Int = -2_048_749_863
    }

    public class UserPrivacySettingRuleRestrictAll() : UserPrivacySettingRule() {
        override fun getConstructor(): Int = -1_406_495_408
    }

    public class UserPrivacySettingRuleRestrictContacts() : UserPrivacySettingRule() {
        override fun getConstructor(): Int = 1_008_389_378
    }

    public class UserPrivacySettingRuleRestrictBots() : UserPrivacySettingRule() {
        override fun getConstructor(): Int = -1_902_547_363
    }

    public class UserPrivacySettingRuleRestrictUsers(
        @JvmField
        public val userIds: LongArray,
    ) : UserPrivacySettingRule() {
        override fun getConstructor(): Int = 622_796_522
    }

    public class UserPrivacySettingRuleRestrictChatMembers(
        @JvmField
        public val chatIds: LongArray,
    ) : UserPrivacySettingRule() {
        override fun getConstructor(): Int = 392_530_897
    }

    public class UserPrivacySettingRules(
        @JvmField
        public val rules: Array<UserPrivacySettingRule>,
    ) : Object() {
        override fun getConstructor(): Int = 322_477_541
    }

    public abstract class UserStatus() : Object()

    public class UserStatusEmpty() : UserStatus() {
        override fun getConstructor(): Int = 164_646_985
    }

    public class UserStatusOnline(
        @JvmField
        public val expires: Int,
    ) : UserStatus() {
        override fun getConstructor(): Int = -1_529_460_876
    }

    public class UserStatusOffline(
        @JvmField
        public val wasOnline: Int,
    ) : UserStatus() {
        override fun getConstructor(): Int = -759_984_891
    }

    public class UserStatusRecently(
        @JvmField
        public val byMyPrivacySettings: Boolean,
    ) : UserStatus() {
        override fun getConstructor(): Int = 262_824_117
    }

    public class UserStatusLastWeek(
        @JvmField
        public val byMyPrivacySettings: Boolean,
    ) : UserStatus() {
        override fun getConstructor(): Int = 310_385_495
    }

    public class UserStatusLastMonth(
        @JvmField
        public val byMyPrivacySettings: Boolean,
    ) : UserStatus() {
        override fun getConstructor(): Int = -1_194_644_996
    }

    public class UserSupportInfo(
        @JvmField
        public val message: FormattedText,
        @JvmField
        public val author: String,
        @JvmField
        public val date: Int,
    ) : Object() {
        override fun getConstructor(): Int = -1_257_366_487
    }

    public abstract class UserType() : Object()

    public class UserTypeRegular() : UserType() {
        override fun getConstructor(): Int = -598_644_325
    }

    public class UserTypeDeleted() : UserType() {
        override fun getConstructor(): Int = -1_807_729_372
    }

    public class UserTypeBot(
        @JvmField
        public val canBeEdited: Boolean,
        @JvmField
        public val canJoinGroups: Boolean,
        @JvmField
        public val canReadAllGroupMessages: Boolean,
        @JvmField
        public val hasMainWebApp: Boolean,
        @JvmField
        public val isInline: Boolean,
        @JvmField
        public val inlineQueryPlaceholder: String,
        @JvmField
        public val needLocation: Boolean,
        @JvmField
        public val canConnectToBusiness: Boolean,
        @JvmField
        public val canBeAddedToAttachmentMenu: Boolean,
        @JvmField
        public val activeUserCount: Int,
    ) : UserType() {
        override fun getConstructor(): Int = -1_952_199_642
    }

    public class UserTypeUnknown() : UserType() {
        override fun getConstructor(): Int = -724_541_123
    }

    public class Usernames(
        @JvmField
        public val activeUsernames: Array<String>,
        @JvmField
        public val disabledUsernames: Array<String>,
        @JvmField
        public val editableUsername: String,
    ) : Object() {
        override fun getConstructor(): Int = 799_608_565
    }

    public class Users(
        @JvmField
        public val totalCount: Int,
        @JvmField
        public val userIds: LongArray,
    ) : Object() {
        override fun getConstructor(): Int = 171_203_420
    }

    public class ValidatedOrderInfo(
        @JvmField
        public val orderInfoId: String,
        @JvmField
        public val shippingOptions: Array<ShippingOption>,
    ) : Object() {
        override fun getConstructor(): Int = 1_511_451_484
    }

    public abstract class VectorPathCommand() : Object()

    public class VectorPathCommandLine(
        @JvmField
        public val endPoint: Point,
    ) : VectorPathCommand() {
        override fun getConstructor(): Int = -614_056_822
    }

    public class VectorPathCommandCubicBezierCurve(
        @JvmField
        public val startControlPoint: Point,
        @JvmField
        public val endControlPoint: Point,
        @JvmField
        public val endPoint: Point,
    ) : VectorPathCommand() {
        override fun getConstructor(): Int = 1_229_733_434
    }

    public class Venue(
        @JvmField
        public val location: Location,
        @JvmField
        public val title: String,
        @JvmField
        public val address: String,
        @JvmField
        public val provider: String,
        @JvmField
        public val id: String,
        @JvmField
        public val type: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_070_406_393
    }

    public class VerificationStatus(
        @JvmField
        public val isVerified: Boolean,
        @JvmField
        public val isScam: Boolean,
        @JvmField
        public val isFake: Boolean,
        @JvmField
        public val botVerificationIconCustomEmojiId: Long,
    ) : Object() {
        override fun getConstructor(): Int = 988_193_164
    }

    public class Video(
        @JvmField
        public val duration: Int,
        @JvmField
        public val width: Int,
        @JvmField
        public val height: Int,
        @JvmField
        public val fileName: String,
        @JvmField
        public val mimeType: String,
        @JvmField
        public val hasStickers: Boolean,
        @JvmField
        public val supportsStreaming: Boolean,
        @JvmField
        public val minithumbnail: Minithumbnail?,
        @JvmField
        public val thumbnail: Thumbnail?,
        @JvmField
        public val video: File,
    ) : Object() {
        override fun getConstructor(): Int = 832_856_268
    }

    public class VideoChat(
        @JvmField
        public val groupCallId: Int,
        @JvmField
        public val hasParticipants: Boolean,
        @JvmField
        public val defaultParticipantId: MessageSender?,
    ) : Object() {
        override fun getConstructor(): Int = -1_374_319_320
    }

    public class VideoChatStream(
        @JvmField
        public val channelId: Int,
        @JvmField
        public val scale: Int,
        @JvmField
        public val timeOffset: Long,
    ) : Object() {
        override fun getConstructor(): Int = -1_151_707_172
    }

    public class VideoChatStreams(
        @JvmField
        public val streams: Array<VideoChatStream>,
    ) : Object() {
        override fun getConstructor(): Int = -434_622_720
    }

    public class VideoNote(
        @JvmField
        public val duration: Int,
        @JvmField
        public val waveform: ByteArray,
        @JvmField
        public val length: Int,
        @JvmField
        public val minithumbnail: Minithumbnail?,
        @JvmField
        public val thumbnail: Thumbnail?,
        @JvmField
        public val speechRecognitionResult: SpeechRecognitionResult?,
        @JvmField
        public val video: File,
    ) : Object() {
        override fun getConstructor(): Int = 2_062_096_581
    }

    public class VoiceNote(
        @JvmField
        public val duration: Int,
        @JvmField
        public val waveform: ByteArray,
        @JvmField
        public val mimeType: String,
        @JvmField
        public val speechRecognitionResult: SpeechRecognitionResult?,
        @JvmField
        public val voice: File,
    ) : Object() {
        override fun getConstructor(): Int = -1_175_302_923
    }

    public class WebApp(
        @JvmField
        public val shortName: String,
        @JvmField
        public val title: String,
        @JvmField
        public val description: String,
        @JvmField
        public val photo: Photo,
        @JvmField
        public val animation: Animation?,
    ) : Object() {
        override fun getConstructor(): Int = 1_616_619_763
    }

    public class WebAppInfo(
        @JvmField
        public val launchId: Long,
        @JvmField
        public val url: String,
    ) : Object() {
        override fun getConstructor(): Int = 788_378_344
    }

    public abstract class WebAppOpenMode() : Object()

    public class WebAppOpenModeCompact() : WebAppOpenMode() {
        override fun getConstructor(): Int = 1_711_603_675
    }

    public class WebAppOpenModeFullSize() : WebAppOpenMode() {
        override fun getConstructor(): Int = 189_320_513
    }

    public class WebAppOpenModeFullScreen() : WebAppOpenMode() {
        override fun getConstructor(): Int = 1_871_315_357
    }

    public class WebAppOpenParameters(
        @JvmField
        public val theme: ThemeParameters?,
        @JvmField
        public val applicationName: String,
        @JvmField
        public val mode: WebAppOpenMode?,
    ) : Object() {
        override fun getConstructor(): Int = 1_375_356_527
    }

    public class WebPageInstantView(
        @JvmField
        public val pageBlocks: Array<PageBlock>,
        @JvmField
        public val viewCount: Int,
        @JvmField
        public val version: Int,
        @JvmField
        public val isRtl: Boolean,
        @JvmField
        public val isFull: Boolean,
        @JvmField
        public val feedbackLink: InternalLinkType,
    ) : Object() {
        override fun getConstructor(): Int = 778_202_453
    }

    public class AcceptCall(
        @JvmField
        public val callId: Int,
        @JvmField
        public val protocol: CallProtocol,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -646_618_416
    }

    public class AcceptTermsOfService(
        @JvmField
        public val termsOfServiceId: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 2_130_576_356
    }

    public class ActivateStoryStealthMode() : Function<Ok>() {
        override fun getConstructor(): Int = -1_009_023_855
    }

    public class AddBotMediaPreview(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val languageCode: String,
        @JvmField
        public val content: InputStoryContent,
    ) : Function<BotMediaPreview>() {
        override fun getConstructor(): Int = 1_347_126_571
    }

    public class AddChatFolderByInviteLink(
        @JvmField
        public val inviteLink: String,
        @JvmField
        public val chatIds: LongArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -858_593_816
    }

    public class AddChatMember(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val userId: Long,
        @JvmField
        public val forwardLimit: Int,
    ) : Function<FailedToAddMembers>() {
        override fun getConstructor(): Int = 1_720_144_407
    }

    public class AddChatMembers(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val userIds: LongArray,
    ) : Function<FailedToAddMembers>() {
        override fun getConstructor(): Int = -1_675_991_329
    }

    public class AddChatToList(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val chatList: ChatList,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -80_523_595
    }

    public class AddContact(
        @JvmField
        public val contact: Contact,
        @JvmField
        public val sharePhoneNumber: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_869_640_000
    }

    public class AddCustomServerLanguagePack(
        @JvmField
        public val languagePackId: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 4_492_771
    }

    public class AddFavoriteSticker(
        @JvmField
        public val sticker: InputFile,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 324_504_799
    }

    public class AddFileToDownloads(
        @JvmField
        public val fileId: Int,
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val priority: Int,
    ) : Function<File>() {
        override fun getConstructor(): Int = 867_533_751
    }

    public class AddLocalMessage(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val senderId: MessageSender,
        @JvmField
        public val replyTo: InputMessageReplyTo?,
        @JvmField
        public val disableNotification: Boolean,
        @JvmField
        public val inputMessageContent: InputMessageContent,
    ) : Function<Message>() {
        override fun getConstructor(): Int = -166_217_823
    }

    public class AddLogMessage(
        @JvmField
        public val verbosityLevel: Int,
        @JvmField
        public val text: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_597_427_692
    }

    public class AddMessageReaction(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val reactionType: ReactionType,
        @JvmField
        public val isBig: Boolean,
        @JvmField
        public val updateRecentReactions: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_419_269_613
    }

    public class AddNetworkStatistics(
        @JvmField
        public val entry: NetworkStatisticsEntry,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_264_825_305
    }

    public class AddPendingPaidMessageReaction(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val starCount: Long,
        @JvmField
        public val type: PaidReactionType?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -342_110_765
    }

    public class AddProxy(
        @JvmField
        public val server: String,
        @JvmField
        public val port: Int,
        @JvmField
        public val enable: Boolean,
        @JvmField
        public val type: ProxyType,
    ) : Function<Proxy>() {
        override fun getConstructor(): Int = 331_529_432
    }

    public class AddQuickReplyShortcutInlineQueryResultMessage(
        @JvmField
        public val shortcutName: String,
        @JvmField
        public val replyToMessageId: Long,
        @JvmField
        public val queryId: Long,
        @JvmField
        public val resultId: String,
        @JvmField
        public val hideViaBot: Boolean,
    ) : Function<QuickReplyMessage>() {
        override fun getConstructor(): Int = -2_017_449_468
    }

    public class AddQuickReplyShortcutMessage(
        @JvmField
        public val shortcutName: String,
        @JvmField
        public val replyToMessageId: Long,
        @JvmField
        public val inputMessageContent: InputMessageContent,
    ) : Function<QuickReplyMessage>() {
        override fun getConstructor(): Int = 1_058_573_098
    }

    public class AddQuickReplyShortcutMessageAlbum(
        @JvmField
        public val shortcutName: String,
        @JvmField
        public val replyToMessageId: Long,
        @JvmField
        public val inputMessageContents: Array<InputMessageContent>,
    ) : Function<QuickReplyMessages>() {
        override fun getConstructor(): Int = 1_348_436_244
    }

    public class AddRecentSticker(
        @JvmField
        public val isAttached: Boolean,
        @JvmField
        public val sticker: InputFile,
    ) : Function<Stickers>() {
        override fun getConstructor(): Int = -1_478_109_026
    }

    public class AddRecentlyFoundChat(
        @JvmField
        public val chatId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_746_396_787
    }

    public class AddSavedAnimation(
        @JvmField
        public val animation: InputFile,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_538_525_088
    }

    public class AddSavedNotificationSound(
        @JvmField
        public val sound: InputFile,
    ) : Function<NotificationSound>() {
        override fun getConstructor(): Int = 1_043_956_975
    }

    public class AddStickerToSet(
        @JvmField
        public val userId: Long,
        @JvmField
        public val name: String,
        @JvmField
        public val sticker: InputSticker,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_457_266_235
    }

    public class AllowBotToSendMessages(
        @JvmField
        public val botUserId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_776_928_142
    }

    public class AllowUnpaidMessagesFromUser(
        @JvmField
        public val userId: Long,
        @JvmField
        public val refundPayments: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 803_569_495
    }

    public class AnswerCallbackQuery(
        @JvmField
        public val callbackQueryId: Long,
        @JvmField
        public val text: String,
        @JvmField
        public val showAlert: Boolean,
        @JvmField
        public val url: String,
        @JvmField
        public val cacheTime: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_153_028_490
    }

    public class AnswerCustomQuery(
        @JvmField
        public val customQueryId: Long,
        @JvmField
        public val data: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_293_603_521
    }

    public class AnswerInlineQuery(
        @JvmField
        public val inlineQueryId: Long,
        @JvmField
        public val isPersonal: Boolean,
        @JvmField
        public val button: InlineQueryResultsButton?,
        @JvmField
        public val results: Array<InputInlineQueryResult>,
        @JvmField
        public val cacheTime: Int,
        @JvmField
        public val nextOffset: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_343_853_844
    }

    public class AnswerPreCheckoutQuery(
        @JvmField
        public val preCheckoutQueryId: Long,
        @JvmField
        public val errorMessage: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_486_789_653
    }

    public class AnswerShippingQuery(
        @JvmField
        public val shippingQueryId: Long,
        @JvmField
        public val shippingOptions: Array<ShippingOption>,
        @JvmField
        public val errorMessage: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -434_601_324
    }

    public class AnswerWebAppQuery(
        @JvmField
        public val webAppQueryId: String,
        @JvmField
        public val result: InputInlineQueryResult,
    ) : Function<SentWebAppMessage>() {
        override fun getConstructor(): Int = -1_598_776_079
    }

    public class ApplyPremiumGiftCode(
        @JvmField
        public val code: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_347_138_530
    }

    public class AssignStoreTransaction(
        @JvmField
        public val transaction: StoreTransaction,
        @JvmField
        public val purpose: StorePaymentPurpose,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_046_202_900
    }

    public class BanChatMember(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val memberId: MessageSender,
        @JvmField
        public val bannedUntilDate: Int,
        @JvmField
        public val revokeMessages: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -888_111_748
    }

    public class BanGroupCallParticipants(
        @JvmField
        public val groupCallId: Int,
        @JvmField
        public val userIds: LongArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 624_883_173
    }

    public class BlockMessageSenderFromReplies(
        @JvmField
        public val messageId: Long,
        @JvmField
        public val deleteMessage: Boolean,
        @JvmField
        public val deleteAllMessages: Boolean,
        @JvmField
        public val reportSpam: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_214_384_757
    }

    public class BoostChat(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val slotIds: IntArray,
    ) : Function<ChatBoostSlots>() {
        override fun getConstructor(): Int = 1_945_750_252
    }

    public class CanBotSendMessages(
        @JvmField
        public val botUserId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 544_052_364
    }

    public class CanPostStory(
        @JvmField
        public val chatId: Long,
    ) : Function<CanPostStoryResult>() {
        override fun getConstructor(): Int = 668_621_518
    }

    public class CanPurchaseFromStore(
        @JvmField
        public val purpose: StorePaymentPurpose,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_017_811_816
    }

    public class CanSendMessageToUser(
        @JvmField
        public val userId: Long,
        @JvmField
        public val onlyLocal: Boolean,
    ) : Function<CanSendMessageToUserResult>() {
        override fun getConstructor(): Int = 1_529_489_462
    }

    public class CanTransferOwnership() : Function<CanTransferOwnershipResult>() {
        override fun getConstructor(): Int = 634_602_508
    }

    public class CancelDownloadFile(
        @JvmField
        public val fileId: Int,
        @JvmField
        public val onlyIfPending: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_954_524_450
    }

    public class CancelPasswordReset() : Function<Ok>() {
        override fun getConstructor(): Int = 940_733_538
    }

    public class CancelPreliminaryUploadFile(
        @JvmField
        public val fileId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 823_412_414
    }

    public class CancelRecoveryEmailAddressVerification() : Function<PasswordState>() {
        override fun getConstructor(): Int = -1_516_728_691
    }

    public class ChangeImportedContacts(
        @JvmField
        public val contacts: Array<Contact>,
    ) : Function<ImportedContacts>() {
        override fun getConstructor(): Int = 1_968_207_955
    }

    public class ChangeStickerSet(
        @JvmField
        public val setId: Long,
        @JvmField
        public val isInstalled: Boolean,
        @JvmField
        public val isArchived: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 449_357_293
    }

    public class CheckAuthenticationBotToken(
        @JvmField
        public val token: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 639_321_206
    }

    public class CheckAuthenticationCode(
        @JvmField
        public val code: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -302_103_382
    }

    public class CheckAuthenticationEmailCode(
        @JvmField
        public val code: EmailAddressAuthentication,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -582_827_361
    }

    public class CheckAuthenticationPassword(
        @JvmField
        public val password: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_025_698_400
    }

    public class CheckAuthenticationPasswordRecoveryCode(
        @JvmField
        public val recoveryCode: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -603_309_083
    }

    public class CheckAuthenticationPremiumPurchase(
        @JvmField
        public val currency: String,
        @JvmField
        public val amount: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_588_959_934
    }

    public class CheckChatFolderInviteLink(
        @JvmField
        public val inviteLink: String,
    ) : Function<ChatFolderInviteLinkInfo>() {
        override fun getConstructor(): Int = 522_557_851
    }

    public class CheckChatInviteLink(
        @JvmField
        public val inviteLink: String,
    ) : Function<ChatInviteLinkInfo>() {
        override fun getConstructor(): Int = -496_940_997
    }

    public class CheckChatUsername(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val username: String,
    ) : Function<CheckChatUsernameResult>() {
        override fun getConstructor(): Int = -119_119_344
    }

    public class CheckCreatedPublicChatsLimit(
        @JvmField
        public val type: PublicChatType,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -445_546_591
    }

    public class CheckEmailAddressVerificationCode(
        @JvmField
        public val code: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -426_386_685
    }

    public class CheckLoginEmailAddressCode(
        @JvmField
        public val code: EmailAddressAuthentication,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_454_244_766
    }

    public class CheckPasswordRecoveryCode(
        @JvmField
        public val recoveryCode: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -200_794_600
    }

    public class CheckPhoneNumberCode(
        @JvmField
        public val code: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -603_626_079
    }

    public class CheckPremiumGiftCode(
        @JvmField
        public val code: String,
    ) : Function<PremiumGiftCodeInfo>() {
        override fun getConstructor(): Int = -1_786_063_260
    }

    public class CheckQuickReplyShortcutName(
        @JvmField
        public val name: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 2_101_203_241
    }

    public class CheckRecoveryEmailAddressCode(
        @JvmField
        public val code: String,
    ) : Function<PasswordState>() {
        override fun getConstructor(): Int = -1_997_039_589
    }

    public class CheckStickerSetName(
        @JvmField
        public val name: String,
    ) : Function<CheckStickerSetNameResult>() {
        override fun getConstructor(): Int = -1_789_392_642
    }

    public class CheckWebAppFileDownload(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val fileName: String,
        @JvmField
        public val url: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -389_397_278
    }

    public class CleanFileName(
        @JvmField
        public val fileName: String,
    ) : Function<Text>() {
        override fun getConstructor(): Int = 967_964_667
    }

    public class ClearAllDraftMessages(
        @JvmField
        public val excludeSecretChats: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -46_369_573
    }

    public class ClearAutosaveSettingsExceptions() : Function<Ok>() {
        override fun getConstructor(): Int = 1_475_109_874
    }

    public class ClearImportedContacts() : Function<Ok>() {
        override fun getConstructor(): Int = 869_503_298
    }

    public class ClearRecentEmojiStatuses() : Function<Ok>() {
        override fun getConstructor(): Int = -428_749_986
    }

    public class ClearRecentReactions() : Function<Ok>() {
        override fun getConstructor(): Int = 1_298_253_650
    }

    public class ClearRecentStickers(
        @JvmField
        public val isAttached: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -321_242_684
    }

    public class ClearRecentlyFoundChats() : Function<Ok>() {
        override fun getConstructor(): Int = -285_582_542
    }

    public class ClearSearchedForTags(
        @JvmField
        public val clearCashtags: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 512_017_238
    }

    public class ClickAnimatedEmojiMessage(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
    ) : Function<Sticker>() {
        override fun getConstructor(): Int = 196_179_554
    }

    public class ClickChatSponsoredMessage(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val isMediaClick: Boolean,
        @JvmField
        public val fromFullscreen: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 971_995_671
    }

    public class ClickPremiumSubscriptionButton() : Function<Ok>() {
        override fun getConstructor(): Int = -369_319_162
    }

    public class Close() : Function<Ok>() {
        override fun getConstructor(): Int = -1_187_782_273
    }

    public class CloseChat(
        @JvmField
        public val chatId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 39_749_353
    }

    public class CloseSecretChat(
        @JvmField
        public val secretChatId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -471_006_133
    }

    public class CloseStory(
        @JvmField
        public val storyPosterChatId: Long,
        @JvmField
        public val storyId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_553_967_851
    }

    public class CloseWebApp(
        @JvmField
        public val webAppLaunchId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_755_391_174
    }

    public class CommitPendingPaidMessageReactions(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -171_354_618
    }

    public class ConfirmQrCodeAuthentication(
        @JvmField
        public val link: String,
    ) : Function<Session>() {
        override fun getConstructor(): Int = -376_199_379
    }

    public class ConfirmSession(
        @JvmField
        public val sessionId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -674_647_009
    }

    public class ConnectAffiliateProgram(
        @JvmField
        public val affiliate: AffiliateType,
        @JvmField
        public val botUserId: Long,
    ) : Function<ConnectedAffiliateProgram>() {
        override fun getConstructor(): Int = 1_661_392_684
    }

    public class CreateBasicGroupChat(
        @JvmField
        public val basicGroupId: Long,
        @JvmField
        public val force: Boolean,
    ) : Function<Chat>() {
        override fun getConstructor(): Int = 1_972_024_548
    }

    public class CreateBusinessChatLink(
        @JvmField
        public val linkInfo: InputBusinessChatLink,
    ) : Function<BusinessChatLink>() {
        override fun getConstructor(): Int = -1_861_018_304
    }

    public class CreateCall(
        @JvmField
        public val userId: Long,
        @JvmField
        public val protocol: CallProtocol,
        @JvmField
        public val isVideo: Boolean,
    ) : Function<CallId>() {
        override fun getConstructor(): Int = -1_104_663_024
    }

    public class CreateChatFolder(
        @JvmField
        public val folder: ChatFolder,
    ) : Function<ChatFolderInfo>() {
        override fun getConstructor(): Int = 1_015_399_680
    }

    public class CreateChatFolderInviteLink(
        @JvmField
        public val chatFolderId: Int,
        @JvmField
        public val name: String,
        @JvmField
        public val chatIds: LongArray,
    ) : Function<ChatFolderInviteLink>() {
        override fun getConstructor(): Int = -2_037_911_099
    }

    public class CreateChatInviteLink(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val name: String,
        @JvmField
        public val expirationDate: Int,
        @JvmField
        public val memberLimit: Int,
        @JvmField
        public val createsJoinRequest: Boolean,
    ) : Function<ChatInviteLink>() {
        override fun getConstructor(): Int = 287_744_833
    }

    public class CreateChatSubscriptionInviteLink(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val name: String,
        @JvmField
        public val subscriptionPricing: StarSubscriptionPricing,
    ) : Function<ChatInviteLink>() {
        override fun getConstructor(): Int = 2_255_717
    }

    public class CreateForumTopic(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val name: String,
        @JvmField
        public val icon: ForumTopicIcon,
    ) : Function<ForumTopicInfo>() {
        override fun getConstructor(): Int = -1_040_570_140
    }

    public class CreateGroupCall(
        @JvmField
        public val joinParameters: GroupCallJoinParameters?,
    ) : Function<GroupCallInfo>() {
        override fun getConstructor(): Int = 1_930_068_672
    }

    public class CreateInvoiceLink(
        @JvmField
        public val businessConnectionId: String,
        @JvmField
        public val invoice: InputMessageContent,
    ) : Function<HttpUrl>() {
        override fun getConstructor(): Int = -814_692_249
    }

    public class CreateNewBasicGroupChat(
        @JvmField
        public val userIds: LongArray,
        @JvmField
        public val title: String,
        @JvmField
        public val messageAutoDeleteTime: Int,
    ) : Function<CreatedBasicGroupChat>() {
        override fun getConstructor(): Int = 1_806_454_709
    }

    public class CreateNewSecretChat(
        @JvmField
        public val userId: Long,
    ) : Function<Chat>() {
        override fun getConstructor(): Int = -620_682_651
    }

    public class CreateNewStickerSet(
        @JvmField
        public val userId: Long,
        @JvmField
        public val title: String,
        @JvmField
        public val name: String,
        @JvmField
        public val stickerType: StickerType,
        @JvmField
        public val needsRepainting: Boolean,
        @JvmField
        public val stickers: Array<InputSticker>,
        @JvmField
        public val source: String,
    ) : Function<StickerSet>() {
        override fun getConstructor(): Int = -481_065_727
    }

    public class CreateNewSupergroupChat(
        @JvmField
        public val title: String,
        @JvmField
        public val isForum: Boolean,
        @JvmField
        public val isChannel: Boolean,
        @JvmField
        public val description: String,
        @JvmField
        public val location: ChatLocation?,
        @JvmField
        public val messageAutoDeleteTime: Int,
        @JvmField
        public val forImport: Boolean,
    ) : Function<Chat>() {
        override fun getConstructor(): Int = 804_058_822
    }

    public class CreatePrivateChat(
        @JvmField
        public val userId: Long,
        @JvmField
        public val force: Boolean,
    ) : Function<Chat>() {
        override fun getConstructor(): Int = -947_758_327
    }

    public class CreateSecretChat(
        @JvmField
        public val secretChatId: Int,
    ) : Function<Chat>() {
        override fun getConstructor(): Int = 1_930_285_615
    }

    public class CreateSupergroupChat(
        @JvmField
        public val supergroupId: Long,
        @JvmField
        public val force: Boolean,
    ) : Function<Chat>() {
        override fun getConstructor(): Int = 1_187_475_691
    }

    public class CreateTemporaryPassword(
        @JvmField
        public val password: String,
        @JvmField
        public val validFor: Int,
    ) : Function<TemporaryPasswordState>() {
        override fun getConstructor(): Int = -1_626_509_434
    }

    public class CreateVideoChat(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val title: String,
        @JvmField
        public val startDate: Int,
        @JvmField
        public val isRtmpStream: Boolean,
    ) : Function<GroupCallId>() {
        override fun getConstructor(): Int = 2_124_715_405
    }

    public class DeclineGroupCallInvitation(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_843_919_377
    }

    public class DecryptGroupCallData(
        @JvmField
        public val groupCallId: Int,
        @JvmField
        public val participantId: MessageSender,
        @JvmField
        public val dataChannel: GroupCallDataChannel?,
        @JvmField
        public val data: ByteArray,
    ) : Function<Data>() {
        override fun getConstructor(): Int = 1_781_743_076
    }

    public class DeleteAccount(
        @JvmField
        public val reason: String,
        @JvmField
        public val password: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_395_816_134
    }

    public class DeleteAllCallMessages(
        @JvmField
        public val revoke: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_466_445_325
    }

    public class DeleteAllRevokedChatInviteLinks(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val creatorUserId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_112_020_698
    }

    public class DeleteBotMediaPreviews(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val languageCode: String,
        @JvmField
        public val fileIds: IntArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_397_512_722
    }

    public class DeleteBusinessChatLink(
        @JvmField
        public val link: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_101_895_865
    }

    public class DeleteBusinessConnectedBot(
        @JvmField
        public val botUserId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_633_976_747
    }

    public class DeleteBusinessMessages(
        @JvmField
        public val businessConnectionId: String,
        @JvmField
        public val messageIds: LongArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_425_721_828
    }

    public class DeleteBusinessStory(
        @JvmField
        public val businessConnectionId: String,
        @JvmField
        public val storyId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_024_585_042
    }

    public class DeleteChat(
        @JvmField
        public val chatId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -171_253_666
    }

    public class DeleteChatBackground(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val restorePrevious: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 320_267_896
    }

    public class DeleteChatFolder(
        @JvmField
        public val chatFolderId: Int,
        @JvmField
        public val leaveChatIds: LongArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_956_364_551
    }

    public class DeleteChatFolderInviteLink(
        @JvmField
        public val chatFolderId: Int,
        @JvmField
        public val inviteLink: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -930_057_858
    }

    public class DeleteChatHistory(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val removeFromChatList: Boolean,
        @JvmField
        public val revoke: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_472_081_761
    }

    public class DeleteChatMessagesByDate(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val minDate: Int,
        @JvmField
        public val maxDate: Int,
        @JvmField
        public val revoke: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_639_653_185
    }

    public class DeleteChatMessagesBySender(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val senderId: MessageSender,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_164_235_161
    }

    public class DeleteChatReplyMarkup(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 100_637_531
    }

    public class DeleteCommands(
        @JvmField
        public val scope: BotCommandScope?,
        @JvmField
        public val languageCode: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_002_732_586
    }

    public class DeleteDefaultBackground(
        @JvmField
        public val forDarkTheme: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_297_814_210
    }

    public class DeleteFile(
        @JvmField
        public val fileId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_807_653_676
    }

    public class DeleteForumTopic(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageThreadId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_864_916_152
    }

    public class DeleteLanguagePack(
        @JvmField
        public val languagePackId: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_108_761_026
    }

    public class DeleteMessages(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageIds: LongArray,
        @JvmField
        public val revoke: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_130_090_173
    }

    public class DeletePassportElement(
        @JvmField
        public val type: PassportElementType,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_719_555_468
    }

    public class DeleteProfilePhoto(
        @JvmField
        public val profilePhotoId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_319_794_625
    }

    public class DeleteQuickReplyShortcut(
        @JvmField
        public val shortcutId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -246_911_978
    }

    public class DeleteQuickReplyShortcutMessages(
        @JvmField
        public val shortcutId: Int,
        @JvmField
        public val messageIds: LongArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -40_522_947
    }

    public class DeleteRevokedChatInviteLink(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val inviteLink: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_859_711_873
    }

    public class DeleteSavedCredentials() : Function<Ok>() {
        override fun getConstructor(): Int = 826_300_114
    }

    public class DeleteSavedMessagesTopicHistory(
        @JvmField
        public val savedMessagesTopicId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_776_237_930
    }

    public class DeleteSavedMessagesTopicMessagesByDate(
        @JvmField
        public val savedMessagesTopicId: Long,
        @JvmField
        public val minDate: Int,
        @JvmField
        public val maxDate: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_444_389
    }

    public class DeleteSavedOrderInfo() : Function<Ok>() {
        override fun getConstructor(): Int = 1_629_058_164
    }

    public class DeleteStickerSet(
        @JvmField
        public val name: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_577_745_325
    }

    public class DeleteStory(
        @JvmField
        public val storyPosterChatId: Long,
        @JvmField
        public val storyId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_020_144_472
    }

    public class Destroy() : Function<Ok>() {
        override fun getConstructor(): Int = 685_331_274
    }

    public class DisableAllSupergroupUsernames(
        @JvmField
        public val supergroupId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 843_511_216
    }

    public class DisableProxy() : Function<Ok>() {
        override fun getConstructor(): Int = -2_100_095_102
    }

    public class DiscardCall(
        @JvmField
        public val callId: Int,
        @JvmField
        public val isDisconnected: Boolean,
        @JvmField
        public val inviteLink: String,
        @JvmField
        public val duration: Int,
        @JvmField
        public val isVideo: Boolean,
        @JvmField
        public val connectionId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_545_983_346
    }

    public class DisconnectAffiliateProgram(
        @JvmField
        public val affiliate: AffiliateType,
        @JvmField
        public val url: String,
    ) : Function<ConnectedAffiliateProgram>() {
        override fun getConstructor(): Int = -105_831_172
    }

    public class DisconnectAllWebsites() : Function<Ok>() {
        override fun getConstructor(): Int = -1_082_985_981
    }

    public class DisconnectWebsite(
        @JvmField
        public val websiteId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -778_767_395
    }

    public class DownloadFile(
        @JvmField
        public val fileId: Int,
        @JvmField
        public val priority: Int,
        @JvmField
        public val offset: Long,
        @JvmField
        public val limit: Long,
        @JvmField
        public val synchronous: Boolean,
    ) : Function<File>() {
        override fun getConstructor(): Int = 1_059_402_292
    }

    public class EditBotMediaPreview(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val languageCode: String,
        @JvmField
        public val fileId: Int,
        @JvmField
        public val content: InputStoryContent,
    ) : Function<BotMediaPreview>() {
        override fun getConstructor(): Int = -2_037_031_582
    }

    public class EditBusinessChatLink(
        @JvmField
        public val link: String,
        @JvmField
        public val linkInfo: InputBusinessChatLink,
    ) : Function<BusinessChatLink>() {
        override fun getConstructor(): Int = 1_594_947_110
    }

    public class EditBusinessMessageCaption(
        @JvmField
        public val businessConnectionId: String,
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
        @JvmField
        public val caption: FormattedText?,
        @JvmField
        public val showCaptionAboveMedia: Boolean,
    ) : Function<BusinessMessage>() {
        override fun getConstructor(): Int = -1_071_562_045
    }

    public class EditBusinessMessageLiveLocation(
        @JvmField
        public val businessConnectionId: String,
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
        @JvmField
        public val location: Location?,
        @JvmField
        public val livePeriod: Int,
        @JvmField
        public val heading: Int,
        @JvmField
        public val proximityAlertRadius: Int,
    ) : Function<BusinessMessage>() {
        override fun getConstructor(): Int = 494_972_447
    }

    public class EditBusinessMessageMedia(
        @JvmField
        public val businessConnectionId: String,
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
        @JvmField
        public val inputMessageContent: InputMessageContent,
    ) : Function<BusinessMessage>() {
        override fun getConstructor(): Int = -60_733_576
    }

    public class EditBusinessMessageReplyMarkup(
        @JvmField
        public val businessConnectionId: String,
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
    ) : Function<BusinessMessage>() {
        override fun getConstructor(): Int = 701_787_159
    }

    public class EditBusinessMessageText(
        @JvmField
        public val businessConnectionId: String,
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
        @JvmField
        public val inputMessageContent: InputMessageContent,
    ) : Function<BusinessMessage>() {
        override fun getConstructor(): Int = -1_149_169_252
    }

    public class EditBusinessStory(
        @JvmField
        public val storyPosterChatId: Long,
        @JvmField
        public val storyId: Int,
        @JvmField
        public val content: InputStoryContent,
        @JvmField
        public val areas: InputStoryAreas,
        @JvmField
        public val caption: FormattedText,
        @JvmField
        public val privacySettings: StoryPrivacySettings,
    ) : Function<Story>() {
        override fun getConstructor(): Int = 472_538_940
    }

    public class EditChatFolder(
        @JvmField
        public val chatFolderId: Int,
        @JvmField
        public val folder: ChatFolder,
    ) : Function<ChatFolderInfo>() {
        override fun getConstructor(): Int = 53_672_754
    }

    public class EditChatFolderInviteLink(
        @JvmField
        public val chatFolderId: Int,
        @JvmField
        public val inviteLink: String,
        @JvmField
        public val name: String,
        @JvmField
        public val chatIds: LongArray,
    ) : Function<ChatFolderInviteLink>() {
        override fun getConstructor(): Int = -2_141_872_095
    }

    public class EditChatInviteLink(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val inviteLink: String,
        @JvmField
        public val name: String,
        @JvmField
        public val expirationDate: Int,
        @JvmField
        public val memberLimit: Int,
        @JvmField
        public val createsJoinRequest: Boolean,
    ) : Function<ChatInviteLink>() {
        override fun getConstructor(): Int = 1_320_303_996
    }

    public class EditChatSubscriptionInviteLink(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val inviteLink: String,
        @JvmField
        public val name: String,
    ) : Function<ChatInviteLink>() {
        override fun getConstructor(): Int = -951_826_989
    }

    public class EditCustomLanguagePackInfo(
        @JvmField
        public val info: LanguagePackInfo,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_320_751_257
    }

    public class EditForumTopic(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageThreadId: Long,
        @JvmField
        public val name: String,
        @JvmField
        public val editIconCustomEmoji: Boolean,
        @JvmField
        public val iconCustomEmojiId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_485_402_016
    }

    public class EditInlineMessageCaption(
        @JvmField
        public val inlineMessageId: String,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
        @JvmField
        public val caption: FormattedText?,
        @JvmField
        public val showCaptionAboveMedia: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_409_762_552
    }

    public class EditInlineMessageLiveLocation(
        @JvmField
        public val inlineMessageId: String,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
        @JvmField
        public val location: Location?,
        @JvmField
        public val livePeriod: Int,
        @JvmField
        public val heading: Int,
        @JvmField
        public val proximityAlertRadius: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 2_134_352_044
    }

    public class EditInlineMessageMedia(
        @JvmField
        public val inlineMessageId: String,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
        @JvmField
        public val inputMessageContent: InputMessageContent,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 23_553_921
    }

    public class EditInlineMessageReplyMarkup(
        @JvmField
        public val inlineMessageId: String,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -67_565_858
    }

    public class EditInlineMessageText(
        @JvmField
        public val inlineMessageId: String,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
        @JvmField
        public val inputMessageContent: InputMessageContent,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -855_457_307
    }

    public class EditMessageCaption(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
        @JvmField
        public val caption: FormattedText?,
        @JvmField
        public val showCaptionAboveMedia: Boolean,
    ) : Function<Message>() {
        override fun getConstructor(): Int = -2_020_117_951
    }

    public class EditMessageLiveLocation(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
        @JvmField
        public val location: Location?,
        @JvmField
        public val livePeriod: Int,
        @JvmField
        public val heading: Int,
        @JvmField
        public val proximityAlertRadius: Int,
    ) : Function<Message>() {
        override fun getConstructor(): Int = -1_890_511_980
    }

    public class EditMessageMedia(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
        @JvmField
        public val inputMessageContent: InputMessageContent,
    ) : Function<Message>() {
        override fun getConstructor(): Int = -1_152_678_125
    }

    public class EditMessageReplyMarkup(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
    ) : Function<Message>() {
        override fun getConstructor(): Int = 332_127_881
    }

    public class EditMessageSchedulingState(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val schedulingState: MessageSchedulingState?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_372_976_192
    }

    public class EditMessageText(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
        @JvmField
        public val inputMessageContent: InputMessageContent,
    ) : Function<Message>() {
        override fun getConstructor(): Int = 196_272_567
    }

    public class EditProxy(
        @JvmField
        public val proxyId: Int,
        @JvmField
        public val server: String,
        @JvmField
        public val port: Int,
        @JvmField
        public val enable: Boolean,
        @JvmField
        public val type: ProxyType,
    ) : Function<Proxy>() {
        override fun getConstructor(): Int = -1_605_883_821
    }

    public class EditQuickReplyMessage(
        @JvmField
        public val shortcutId: Int,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val inputMessageContent: InputMessageContent,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 80_517_006
    }

    public class EditStarSubscription(
        @JvmField
        public val subscriptionId: String,
        @JvmField
        public val isCanceled: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 2_048_538_904
    }

    public class EditStory(
        @JvmField
        public val storyPosterChatId: Long,
        @JvmField
        public val storyId: Int,
        @JvmField
        public val content: InputStoryContent?,
        @JvmField
        public val areas: InputStoryAreas?,
        @JvmField
        public val caption: FormattedText?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 355_296_788
    }

    public class EditStoryCover(
        @JvmField
        public val storyPosterChatId: Long,
        @JvmField
        public val storyId: Int,
        @JvmField
        public val coverFrameTimestamp: Double,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_035_823_266
    }

    public class EditUserStarSubscription(
        @JvmField
        public val userId: Long,
        @JvmField
        public val telegramPaymentChargeId: String,
        @JvmField
        public val isCanceled: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_370_582_665
    }

    public class EnableProxy(
        @JvmField
        public val proxyId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_494_450_838
    }

    public class EncryptGroupCallData(
        @JvmField
        public val groupCallId: Int,
        @JvmField
        public val dataChannel: GroupCallDataChannel,
        @JvmField
        public val data: ByteArray,
        @JvmField
        public val unencryptedPrefixSize: Int,
    ) : Function<Data>() {
        override fun getConstructor(): Int = -377_997_690
    }

    public class EndGroupCall(
        @JvmField
        public val groupCallId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 573_131_959
    }

    public class EndGroupCallRecording(
        @JvmField
        public val groupCallId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -75_799_927
    }

    public class EndGroupCallScreenSharing(
        @JvmField
        public val groupCallId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_047_599_540
    }

    public class FinishFileGeneration(
        @JvmField
        public val generationId: Long,
        @JvmField
        public val error: Error?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_055_060_835
    }

    public class ForwardMessages(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageThreadId: Long,
        @JvmField
        public val fromChatId: Long,
        @JvmField
        public val messageIds: LongArray,
        @JvmField
        public val options: MessageSendOptions?,
        @JvmField
        public val sendCopy: Boolean,
        @JvmField
        public val removeCaption: Boolean,
    ) : Function<Messages>() {
        override fun getConstructor(): Int = 966_156_347
    }

    public class GetAccountTtl() : Function<AccountTtl>() {
        override fun getConstructor(): Int = -443_905_161
    }

    public class GetActiveSessions() : Function<Sessions>() {
        override fun getConstructor(): Int = 1_119_710_526
    }

    public class GetAllPassportElements(
        @JvmField
        public val password: String,
    ) : Function<PassportElements>() {
        override fun getConstructor(): Int = -2_038_945_045
    }

    public class GetAllStickerEmojis(
        @JvmField
        public val stickerType: StickerType,
        @JvmField
        public val query: String,
        @JvmField
        public val chatId: Long,
        @JvmField
        public val returnOnlyMainEmoji: Boolean,
    ) : Function<Emojis>() {
        override fun getConstructor(): Int = 296_562_224
    }

    public class GetAnimatedEmoji(
        @JvmField
        public val emoji: String,
    ) : Function<AnimatedEmoji>() {
        override fun getConstructor(): Int = 1_065_635_702
    }

    public class GetApplicationConfig() : Function<JsonValue>() {
        override fun getConstructor(): Int = -1_823_144_318
    }

    public class GetApplicationDownloadLink() : Function<HttpUrl>() {
        override fun getConstructor(): Int = 112_013_252
    }

    public class GetArchiveChatListSettings() : Function<ArchiveChatListSettings>() {
        override fun getConstructor(): Int = -2_087_874_976
    }

    public class GetArchivedStickerSets(
        @JvmField
        public val stickerType: StickerType,
        @JvmField
        public val offsetStickerSetId: Long,
        @JvmField
        public val limit: Int,
    ) : Function<StickerSets>() {
        override fun getConstructor(): Int = 1_001_931_341
    }

    public class GetAttachedStickerSets(
        @JvmField
        public val fileId: Int,
    ) : Function<StickerSets>() {
        override fun getConstructor(): Int = 1_302_172_429
    }

    public class GetAttachmentMenuBot(
        @JvmField
        public val botUserId: Long,
    ) : Function<AttachmentMenuBot>() {
        override fun getConstructor(): Int = 1_034_248_699
    }

    public class GetAuthorizationState() : Function<AuthorizationState>() {
        override fun getConstructor(): Int = 1_949_154_877
    }

    public class GetAutoDownloadSettingsPresets() : Function<AutoDownloadSettingsPresets>() {
        override fun getConstructor(): Int = -1_721_088_201
    }

    public class GetAutosaveSettings() : Function<AutosaveSettings>() {
        override fun getConstructor(): Int = 2_136_207_914
    }

    public class GetAvailableChatBoostSlots() : Function<ChatBoostSlots>() {
        override fun getConstructor(): Int = 1_929_898_965
    }

    public class GetAvailableGifts() : Function<Gifts>() {
        override fun getConstructor(): Int = -153_786_901
    }

    public class GetBackgroundUrl(
        @JvmField
        public val name: String,
        @JvmField
        public val type: BackgroundType,
    ) : Function<HttpUrl>() {
        override fun getConstructor(): Int = 733_769_682
    }

    public class GetBankCardInfo(
        @JvmField
        public val bankCardNumber: String,
    ) : Function<BankCardInfo>() {
        override fun getConstructor(): Int = -1_310_515_792
    }

    public class GetBasicGroup(
        @JvmField
        public val basicGroupId: Long,
    ) : Function<BasicGroup>() {
        override fun getConstructor(): Int = -1_635_174_828
    }

    public class GetBasicGroupFullInfo(
        @JvmField
        public val basicGroupId: Long,
    ) : Function<BasicGroupFullInfo>() {
        override fun getConstructor(): Int = -1_822_039_253
    }

    public class GetBlockedMessageSenders(
        @JvmField
        public val blockList: BlockList,
        @JvmField
        public val offset: Int,
        @JvmField
        public val limit: Int,
    ) : Function<MessageSenders>() {
        override fun getConstructor(): Int = -1_931_137_258
    }

    public class GetBotInfoDescription(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val languageCode: String,
    ) : Function<Text>() {
        override fun getConstructor(): Int = -762_841_035
    }

    public class GetBotInfoShortDescription(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val languageCode: String,
    ) : Function<Text>() {
        override fun getConstructor(): Int = 1_243_358_740
    }

    public class GetBotMediaPreviewInfo(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val languageCode: String,
    ) : Function<BotMediaPreviewInfo>() {
        override fun getConstructor(): Int = 1_358_299_446
    }

    public class GetBotMediaPreviews(
        @JvmField
        public val botUserId: Long,
    ) : Function<BotMediaPreviews>() {
        override fun getConstructor(): Int = 577_131_608
    }

    public class GetBotName(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val languageCode: String,
    ) : Function<Text>() {
        override fun getConstructor(): Int = -1_707_118_036
    }

    public class GetBotSimilarBotCount(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val returnLocal: Boolean,
    ) : Function<Count>() {
        override fun getConstructor(): Int = -1_271_545_369
    }

    public class GetBotSimilarBots(
        @JvmField
        public val botUserId: Long,
    ) : Function<Users>() {
        override fun getConstructor(): Int = -825_139_275
    }

    public class GetBusinessAccountStarAmount(
        @JvmField
        public val businessConnectionId: String,
    ) : Function<StarAmount>() {
        override fun getConstructor(): Int = -1_817_136_693
    }

    public class GetBusinessChatLinkInfo(
        @JvmField
        public val linkName: String,
    ) : Function<BusinessChatLinkInfo>() {
        override fun getConstructor(): Int = 797_670_986
    }

    public class GetBusinessChatLinks() : Function<BusinessChatLinks>() {
        override fun getConstructor(): Int = 710_287_703
    }

    public class GetBusinessConnectedBot() : Function<BusinessConnectedBot>() {
        override fun getConstructor(): Int = 911_058_883
    }

    public class GetBusinessConnection(
        @JvmField
        public val connectionId: String,
    ) : Function<BusinessConnection>() {
        override fun getConstructor(): Int = -2_114_706_400
    }

    public class GetBusinessFeatures(
        @JvmField
        public val source: BusinessFeature?,
    ) : Function<BusinessFeatures>() {
        override fun getConstructor(): Int = -997_171_199
    }

    public class GetCallbackQueryAnswer(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val payload: CallbackQueryPayload,
    ) : Function<CallbackQueryAnswer>() {
        override fun getConstructor(): Int = 116_357_727
    }

    public class GetCallbackQueryMessage(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val callbackQueryId: Long,
    ) : Function<Message>() {
        override fun getConstructor(): Int = -1_121_939_086
    }

    public class GetChat(
        @JvmField
        public val chatId: Long,
    ) : Function<Chat>() {
        override fun getConstructor(): Int = 1_866_601_536
    }

    public class GetChatActiveStories(
        @JvmField
        public val chatId: Long,
    ) : Function<ChatActiveStories>() {
        override fun getConstructor(): Int = 776_993_781
    }

    public class GetChatAdministrators(
        @JvmField
        public val chatId: Long,
    ) : Function<ChatAdministrators>() {
        override fun getConstructor(): Int = 1_544_468_155
    }

    public class GetChatArchivedStories(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val fromStoryId: Int,
        @JvmField
        public val limit: Int,
    ) : Function<Stories>() {
        override fun getConstructor(): Int = -1_356_950_392
    }

    public class GetChatAvailableMessageSenders(
        @JvmField
        public val chatId: Long,
    ) : Function<ChatMessageSenders>() {
        override fun getConstructor(): Int = 1_158_670_635
    }

    public class GetChatAvailablePaidMessageReactionSenders(
        @JvmField
        public val chatId: Long,
    ) : Function<MessageSenders>() {
        override fun getConstructor(): Int = -1_244_619_639
    }

    public class GetChatBoostFeatures(
        @JvmField
        public val isChannel: Boolean,
    ) : Function<ChatBoostFeatures>() {
        override fun getConstructor(): Int = -389_994_336
    }

    public class GetChatBoostLevelFeatures(
        @JvmField
        public val isChannel: Boolean,
        @JvmField
        public val level: Int,
    ) : Function<ChatBoostLevelFeatures>() {
        override fun getConstructor(): Int = 1_172_717_195
    }

    public class GetChatBoostLink(
        @JvmField
        public val chatId: Long,
    ) : Function<ChatBoostLink>() {
        override fun getConstructor(): Int = 1_458_662_533
    }

    public class GetChatBoostLinkInfo(
        @JvmField
        public val url: String,
    ) : Function<ChatBoostLinkInfo>() {
        override fun getConstructor(): Int = 654_068_572
    }

    public class GetChatBoostStatus(
        @JvmField
        public val chatId: Long,
    ) : Function<ChatBoostStatus>() {
        override fun getConstructor(): Int = -810_775_857
    }

    public class GetChatBoosts(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val onlyGiftCodes: Boolean,
        @JvmField
        public val offset: String,
        @JvmField
        public val limit: Int,
    ) : Function<FoundChatBoosts>() {
        override fun getConstructor(): Int = -1_419_859_400
    }

    public class GetChatEventLog(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val query: String,
        @JvmField
        public val fromEventId: Long,
        @JvmField
        public val limit: Int,
        @JvmField
        public val filters: ChatEventLogFilters?,
        @JvmField
        public val userIds: LongArray,
    ) : Function<ChatEvents>() {
        override fun getConstructor(): Int = -1_281_344_669
    }

    public class GetChatFolder(
        @JvmField
        public val chatFolderId: Int,
    ) : Function<ChatFolder>() {
        override fun getConstructor(): Int = 92_809_880
    }

    public class GetChatFolderChatCount(
        @JvmField
        public val folder: ChatFolder,
    ) : Function<Count>() {
        override fun getConstructor(): Int = 2_111_097_790
    }

    public class GetChatFolderChatsToLeave(
        @JvmField
        public val chatFolderId: Int,
    ) : Function<Chats>() {
        override fun getConstructor(): Int = -1_916_672_337
    }

    public class GetChatFolderDefaultIconName(
        @JvmField
        public val folder: ChatFolder,
    ) : Function<ChatFolderIcon>() {
        override fun getConstructor(): Int = 754_425_959
    }

    public class GetChatFolderInviteLinks(
        @JvmField
        public val chatFolderId: Int,
    ) : Function<ChatFolderInviteLinks>() {
        override fun getConstructor(): Int = 329_079_776
    }

    public class GetChatFolderNewChats(
        @JvmField
        public val chatFolderId: Int,
    ) : Function<Chats>() {
        override fun getConstructor(): Int = 2_123_181_260
    }

    public class GetChatHistory(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val fromMessageId: Long,
        @JvmField
        public val offset: Int,
        @JvmField
        public val limit: Int,
        @JvmField
        public val onlyLocal: Boolean,
    ) : Function<Messages>() {
        override fun getConstructor(): Int = -799_960_451
    }

    public class GetChatInviteLink(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val inviteLink: String,
    ) : Function<ChatInviteLink>() {
        override fun getConstructor(): Int = -479_575_555
    }

    public class GetChatInviteLinkCounts(
        @JvmField
        public val chatId: Long,
    ) : Function<ChatInviteLinkCounts>() {
        override fun getConstructor(): Int = 890_299_025
    }

    public class GetChatInviteLinkMembers(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val inviteLink: String,
        @JvmField
        public val onlyWithExpiredSubscription: Boolean,
        @JvmField
        public val offsetMember: ChatInviteLinkMember?,
        @JvmField
        public val limit: Int,
    ) : Function<ChatInviteLinkMembers>() {
        override fun getConstructor(): Int = 1_728_376_124
    }

    public class GetChatInviteLinks(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val creatorUserId: Long,
        @JvmField
        public val isRevoked: Boolean,
        @JvmField
        public val offsetDate: Int,
        @JvmField
        public val offsetInviteLink: String,
        @JvmField
        public val limit: Int,
    ) : Function<ChatInviteLinks>() {
        override fun getConstructor(): Int = 883_252_396
    }

    public class GetChatJoinRequests(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val inviteLink: String,
        @JvmField
        public val query: String,
        @JvmField
        public val offsetRequest: ChatJoinRequest?,
        @JvmField
        public val limit: Int,
    ) : Function<ChatJoinRequests>() {
        override fun getConstructor(): Int = -388_428_126
    }

    public class GetChatListsToAddChat(
        @JvmField
        public val chatId: Long,
    ) : Function<ChatLists>() {
        override fun getConstructor(): Int = 654_956_193
    }

    public class GetChatMember(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val memberId: MessageSender,
    ) : Function<ChatMember>() {
        override fun getConstructor(): Int = -792_636_814
    }

    public class GetChatMessageByDate(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val date: Int,
    ) : Function<Message>() {
        override fun getConstructor(): Int = 1_062_564_150
    }

    public class GetChatMessageCalendar(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val filter: SearchMessagesFilter,
        @JvmField
        public val fromMessageId: Long,
        @JvmField
        public val savedMessagesTopicId: Long,
    ) : Function<MessageCalendar>() {
        override fun getConstructor(): Int = -2_119_225_929
    }

    public class GetChatMessageCount(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val filter: SearchMessagesFilter,
        @JvmField
        public val savedMessagesTopicId: Long,
        @JvmField
        public val returnLocal: Boolean,
    ) : Function<Count>() {
        override fun getConstructor(): Int = 955_746_569
    }

    public class GetChatMessagePosition(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val filter: SearchMessagesFilter,
        @JvmField
        public val messageThreadId: Long,
        @JvmField
        public val savedMessagesTopicId: Long,
    ) : Function<Count>() {
        override fun getConstructor(): Int = 136_051_911
    }

    public class GetChatNotificationSettingsExceptions(
        @JvmField
        public val scope: NotificationSettingsScope?,
        @JvmField
        public val compareSound: Boolean,
    ) : Function<Chats>() {
        override fun getConstructor(): Int = 201_199_121
    }

    public class GetChatPinnedMessage(
        @JvmField
        public val chatId: Long,
    ) : Function<Message>() {
        override fun getConstructor(): Int = 359_865_008
    }

    public class GetChatPostedToChatPageStories(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val fromStoryId: Int,
        @JvmField
        public val limit: Int,
    ) : Function<Stories>() {
        override fun getConstructor(): Int = -46_414_037
    }

    public class GetChatRevenueStatistics(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val isDark: Boolean,
    ) : Function<ChatRevenueStatistics>() {
        override fun getConstructor(): Int = 701_995_836
    }

    public class GetChatRevenueTransactions(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val offset: Int,
        @JvmField
        public val limit: Int,
    ) : Function<ChatRevenueTransactions>() {
        override fun getConstructor(): Int = 1_194_264_341
    }

    public class GetChatRevenueWithdrawalUrl(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val password: String,
    ) : Function<HttpUrl>() {
        override fun getConstructor(): Int = 506_595_104
    }

    public class GetChatScheduledMessages(
        @JvmField
        public val chatId: Long,
    ) : Function<Messages>() {
        override fun getConstructor(): Int = -549_638_149
    }

    public class GetChatSimilarChatCount(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val returnLocal: Boolean,
    ) : Function<Count>() {
        override fun getConstructor(): Int = 1_178_506_894
    }

    public class GetChatSimilarChats(
        @JvmField
        public val chatId: Long,
    ) : Function<Chats>() {
        override fun getConstructor(): Int = -1_152_348_285
    }

    public class GetChatSparseMessagePositions(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val filter: SearchMessagesFilter,
        @JvmField
        public val fromMessageId: Long,
        @JvmField
        public val limit: Int,
        @JvmField
        public val savedMessagesTopicId: Long,
    ) : Function<MessagePositions>() {
        override fun getConstructor(): Int = 994_389_757
    }

    public class GetChatSponsoredMessages(
        @JvmField
        public val chatId: Long,
    ) : Function<SponsoredMessages>() {
        override fun getConstructor(): Int = 1_353_203_864
    }

    public class GetChatStatistics(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val isDark: Boolean,
    ) : Function<ChatStatistics>() {
        override fun getConstructor(): Int = 327_057_816
    }

    public class GetChatStoryInteractions(
        @JvmField
        public val storyPosterChatId: Long,
        @JvmField
        public val storyId: Int,
        @JvmField
        public val reactionType: ReactionType?,
        @JvmField
        public val preferForwards: Boolean,
        @JvmField
        public val offset: String,
        @JvmField
        public val limit: Int,
    ) : Function<StoryInteractions>() {
        override fun getConstructor(): Int = 354_545_268
    }

    public class GetChats(
        @JvmField
        public val chatList: ChatList?,
        @JvmField
        public val limit: Int,
    ) : Function<Chats>() {
        override fun getConstructor(): Int = -972_768_574
    }

    public class GetChatsForChatFolderInviteLink(
        @JvmField
        public val chatFolderId: Int,
    ) : Function<Chats>() {
        override fun getConstructor(): Int = 1_873_561_929
    }

    public class GetChatsToPostStories() : Function<Chats>() {
        override fun getConstructor(): Int = 1_893_901_427
    }

    public class GetCloseFriends() : Function<Users>() {
        override fun getConstructor(): Int = -1_445_628_722
    }

    public class GetCollectibleItemInfo(
        @JvmField
        public val type: CollectibleItemType,
    ) : Function<CollectibleItemInfo>() {
        override fun getConstructor(): Int = -217_797_238
    }

    public class GetCommands(
        @JvmField
        public val scope: BotCommandScope?,
        @JvmField
        public val languageCode: String,
    ) : Function<BotCommands>() {
        override fun getConstructor(): Int = 1_488_621_559
    }

    public class GetConnectedAffiliateProgram(
        @JvmField
        public val affiliate: AffiliateType,
        @JvmField
        public val botUserId: Long,
    ) : Function<ConnectedAffiliateProgram>() {
        override fun getConstructor(): Int = -1_755_191_440
    }

    public class GetConnectedAffiliatePrograms(
        @JvmField
        public val affiliate: AffiliateType,
        @JvmField
        public val offset: String,
        @JvmField
        public val limit: Int,
    ) : Function<ConnectedAffiliatePrograms>() {
        override fun getConstructor(): Int = -1_960_029_582
    }

    public class GetConnectedWebsites() : Function<ConnectedWebsites>() {
        override fun getConstructor(): Int = -170_536_110
    }

    public class GetContacts() : Function<Users>() {
        override fun getConstructor(): Int = -1_417_722_768
    }

    public class GetCountries() : Function<Countries>() {
        override fun getConstructor(): Int = -51_902_050
    }

    public class GetCountryCode() : Function<Text>() {
        override fun getConstructor(): Int = 1_540_593_906
    }

    public class GetCountryFlagEmoji(
        @JvmField
        public val countryCode: String,
    ) : Function<Text>() {
        override fun getConstructor(): Int = 981_871_098
    }

    public class GetCreatedPublicChats(
        @JvmField
        public val type: PublicChatType,
    ) : Function<Chats>() {
        override fun getConstructor(): Int = 710_354_415
    }

    public class GetCurrentState() : Function<Updates>() {
        override fun getConstructor(): Int = -1_191_417_719
    }

    public class GetCurrentWeather(
        @JvmField
        public val location: Location,
    ) : Function<CurrentWeather>() {
        override fun getConstructor(): Int = -1_965_384_759
    }

    public class GetCustomEmojiReactionAnimations() : Function<Stickers>() {
        override fun getConstructor(): Int = 1_232_375_250
    }

    public class GetCustomEmojiStickers(
        @JvmField
        public val customEmojiIds: LongArray,
    ) : Function<Stickers>() {
        override fun getConstructor(): Int = -2_127_427_955
    }

    public class GetDatabaseStatistics() : Function<DatabaseStatistics>() {
        override fun getConstructor(): Int = -1_942_760_263
    }

    public class GetDeepLinkInfo(
        @JvmField
        public val link: String,
    ) : Function<DeepLinkInfo>() {
        override fun getConstructor(): Int = 680_673_150
    }

    public class GetDefaultBackgroundCustomEmojiStickers() : Function<Stickers>() {
        override fun getConstructor(): Int = 485_910_542
    }

    public class GetDefaultChatEmojiStatuses() : Function<EmojiStatusCustomEmojis>() {
        override fun getConstructor(): Int = 1_553_698_018
    }

    public class GetDefaultChatPhotoCustomEmojiStickers() : Function<Stickers>() {
        override fun getConstructor(): Int = -376_342_683
    }

    public class GetDefaultEmojiStatuses() : Function<EmojiStatusCustomEmojis>() {
        override fun getConstructor(): Int = -539_392_025
    }

    public class GetDefaultMessageAutoDeleteTime() : Function<MessageAutoDeleteTime>() {
        override fun getConstructor(): Int = -450_857_574
    }

    public class GetDefaultProfilePhotoCustomEmojiStickers() : Function<Stickers>() {
        override fun getConstructor(): Int = 1_280_041_655
    }

    public class GetDisallowedChatEmojiStatuses() : Function<EmojiStatusCustomEmojis>() {
        override fun getConstructor(): Int = -2_004_787_831
    }

    public class GetEmojiCategories(
        @JvmField
        public val type: EmojiCategoryType?,
    ) : Function<EmojiCategories>() {
        override fun getConstructor(): Int = 2_139_537_774
    }

    public class GetEmojiReaction(
        @JvmField
        public val emoji: String,
    ) : Function<EmojiReaction>() {
        override fun getConstructor(): Int = -449_572_388
    }

    public class GetEmojiSuggestionsUrl(
        @JvmField
        public val languageCode: String,
    ) : Function<HttpUrl>() {
        override fun getConstructor(): Int = -1_404_101_841
    }

    public class GetExternalLink(
        @JvmField
        public val link: String,
        @JvmField
        public val allowWriteAccess: Boolean,
    ) : Function<HttpUrl>() {
        override fun getConstructor(): Int = 1_586_688_235
    }

    public class GetExternalLinkInfo(
        @JvmField
        public val link: String,
    ) : Function<LoginUrlInfo>() {
        override fun getConstructor(): Int = 1_175_288_383
    }

    public class GetFavoriteStickers() : Function<Stickers>() {
        override fun getConstructor(): Int = -338_964_672
    }

    public class GetFile(
        @JvmField
        public val fileId: Int,
    ) : Function<File>() {
        override fun getConstructor(): Int = 1_553_923_406
    }

    public class GetFileDownloadedPrefixSize(
        @JvmField
        public val fileId: Int,
        @JvmField
        public val offset: Long,
    ) : Function<FileDownloadedPrefixSize>() {
        override fun getConstructor(): Int = 855_948_589
    }

    public class GetFileExtension(
        @JvmField
        public val mimeType: String,
    ) : Function<Text>() {
        override fun getConstructor(): Int = -106_055_372
    }

    public class GetFileMimeType(
        @JvmField
        public val fileName: String,
    ) : Function<Text>() {
        override fun getConstructor(): Int = -2_073_879_671
    }

    public class GetForumTopic(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageThreadId: Long,
    ) : Function<ForumTopic>() {
        override fun getConstructor(): Int = -442_761_663
    }

    public class GetForumTopicDefaultIcons() : Function<Stickers>() {
        override fun getConstructor(): Int = 1_479_898_332
    }

    public class GetForumTopicLink(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageThreadId: Long,
    ) : Function<MessageLink>() {
        override fun getConstructor(): Int = -914_650_933
    }

    public class GetForumTopics(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val query: String,
        @JvmField
        public val offsetDate: Int,
        @JvmField
        public val offsetMessageId: Long,
        @JvmField
        public val offsetMessageThreadId: Long,
        @JvmField
        public val limit: Int,
    ) : Function<ForumTopics>() {
        override fun getConstructor(): Int = -72_647_334
    }

    public class GetGameHighScores(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val userId: Long,
    ) : Function<GameHighScores>() {
        override fun getConstructor(): Int = 15_746_459
    }

    public class GetGiftUpgradePreview(
        @JvmField
        public val giftId: Long,
    ) : Function<GiftUpgradePreview>() {
        override fun getConstructor(): Int = -1_110_719_907
    }

    public class GetGiveawayInfo(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
    ) : Function<GiveawayInfo>() {
        override fun getConstructor(): Int = -1_215_852_357
    }

    public class GetGreetingStickers() : Function<Stickers>() {
        override fun getConstructor(): Int = 374_873_372
    }

    public class GetGrossingWebAppBots(
        @JvmField
        public val offset: String,
        @JvmField
        public val limit: Int,
    ) : Function<FoundUsers>() {
        override fun getConstructor(): Int = 1_696_779_802
    }

    public class GetGroupCall(
        @JvmField
        public val groupCallId: Int,
    ) : Function<GroupCall>() {
        override fun getConstructor(): Int = 1_468_491_406
    }

    public class GetGroupCallParticipants(
        @JvmField
        public val inputGroupCall: InputGroupCall,
        @JvmField
        public val limit: Int,
    ) : Function<GroupCallParticipants>() {
        override fun getConstructor(): Int = 1_986_739_394
    }

    public class GetGroupsInCommon(
        @JvmField
        public val userId: Long,
        @JvmField
        public val offsetChatId: Long,
        @JvmField
        public val limit: Int,
    ) : Function<Chats>() {
        override fun getConstructor(): Int = 381_539_178
    }

    public class GetImportedContactCount() : Function<Count>() {
        override fun getConstructor(): Int = -656_336_346
    }

    public class GetInactiveSupergroupChats() : Function<Chats>() {
        override fun getConstructor(): Int = -657_720_907
    }

    public class GetInlineGameHighScores(
        @JvmField
        public val inlineMessageId: String,
        @JvmField
        public val userId: Long,
    ) : Function<GameHighScores>() {
        override fun getConstructor(): Int = -533_107_798
    }

    public class GetInlineQueryResults(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val chatId: Long,
        @JvmField
        public val userLocation: Location?,
        @JvmField
        public val query: String,
        @JvmField
        public val offset: String,
    ) : Function<InlineQueryResults>() {
        override fun getConstructor(): Int = 2_044_524_652
    }

    public class GetInstalledBackgrounds(
        @JvmField
        public val forDarkTheme: Boolean,
    ) : Function<Backgrounds>() {
        override fun getConstructor(): Int = -1_051_406_241
    }

    public class GetInstalledStickerSets(
        @JvmField
        public val stickerType: StickerType,
    ) : Function<StickerSets>() {
        override fun getConstructor(): Int = 1_630_467_830
    }

    public class GetInternalLink(
        @JvmField
        public val type: InternalLinkType,
        @JvmField
        public val isHttp: Boolean,
    ) : Function<HttpUrl>() {
        override fun getConstructor(): Int = 962_654_640
    }

    public class GetInternalLinkType(
        @JvmField
        public val link: String,
    ) : Function<InternalLinkType>() {
        override fun getConstructor(): Int = -1_948_428_535
    }

    public class GetJsonString(
        @JvmField
        public val jsonValue: JsonValue,
    ) : Function<Text>() {
        override fun getConstructor(): Int = 663_458_849
    }

    public class GetJsonValue(
        @JvmField
        public val json: String,
    ) : Function<JsonValue>() {
        override fun getConstructor(): Int = -1_829_086_715
    }

    public class GetKeywordEmojis(
        @JvmField
        public val text: String,
        @JvmField
        public val inputLanguageCodes: Array<String>,
    ) : Function<Emojis>() {
        override fun getConstructor(): Int = -1_969_795_990
    }

    public class GetLanguagePackInfo(
        @JvmField
        public val languagePackId: String,
    ) : Function<LanguagePackInfo>() {
        override fun getConstructor(): Int = 2_077_809_320
    }

    public class GetLanguagePackString(
        @JvmField
        public val languagePackDatabasePath: String,
        @JvmField
        public val localizationTarget: String,
        @JvmField
        public val languagePackId: String,
        @JvmField
        public val key: String,
    ) : Function<LanguagePackStringValue>() {
        override fun getConstructor(): Int = 150_789_747
    }

    public class GetLanguagePackStrings(
        @JvmField
        public val languagePackId: String,
        @JvmField
        public val keys: Array<String>,
    ) : Function<LanguagePackStrings>() {
        override fun getConstructor(): Int = 1_246_259_088
    }

    public class GetLinkPreview(
        @JvmField
        public val text: FormattedText,
        @JvmField
        public val linkPreviewOptions: LinkPreviewOptions?,
    ) : Function<LinkPreview>() {
        override fun getConstructor(): Int = -1_039_572_191
    }

    public class GetLocalizationTargetInfo(
        @JvmField
        public val onlyLocal: Boolean,
    ) : Function<LocalizationTargetInfo>() {
        override fun getConstructor(): Int = 1_849_499_526
    }

    public class GetLogStream() : Function<LogStream>() {
        override fun getConstructor(): Int = 1_167_608_667
    }

    public class GetLogTagVerbosityLevel(
        @JvmField
        public val tag: String,
    ) : Function<LogVerbosityLevel>() {
        override fun getConstructor(): Int = 951_004_547
    }

    public class GetLogTags() : Function<LogTags>() {
        override fun getConstructor(): Int = -254_449_190
    }

    public class GetLogVerbosityLevel() : Function<LogVerbosityLevel>() {
        override fun getConstructor(): Int = 594_057_956
    }

    public class GetLoginUrl(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val buttonId: Long,
        @JvmField
        public val allowWriteAccess: Boolean,
    ) : Function<HttpUrl>() {
        override fun getConstructor(): Int = 791_844_305
    }

    public class GetLoginUrlInfo(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val buttonId: Long,
    ) : Function<LoginUrlInfo>() {
        override fun getConstructor(): Int = -859_202_125
    }

    public class GetMainWebApp(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val startParameter: String,
        @JvmField
        public val parameters: WebAppOpenParameters,
    ) : Function<MainWebApp>() {
        override fun getConstructor(): Int = 594_050_214
    }

    public class GetMapThumbnailFile(
        @JvmField
        public val location: Location,
        @JvmField
        public val zoom: Int,
        @JvmField
        public val width: Int,
        @JvmField
        public val height: Int,
        @JvmField
        public val scale: Int,
        @JvmField
        public val chatId: Long,
    ) : Function<File>() {
        override fun getConstructor(): Int = -152_660_070
    }

    public class GetMarkdownText(
        @JvmField
        public val text: FormattedText,
    ) : Function<FormattedText>() {
        override fun getConstructor(): Int = 164_524_584
    }

    public class GetMe() : Function<User>() {
        override fun getConstructor(): Int = -191_516_033
    }

    public class GetMenuButton(
        @JvmField
        public val userId: Long,
    ) : Function<BotMenuButton>() {
        override fun getConstructor(): Int = -437_324_736
    }

    public class GetMessage(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
    ) : Function<Message>() {
        override fun getConstructor(): Int = -1_821_196_160
    }

    public class GetMessageAddedReactions(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val reactionType: ReactionType?,
        @JvmField
        public val offset: String,
        @JvmField
        public val limit: Int,
    ) : Function<AddedReactions>() {
        override fun getConstructor(): Int = 2_110_172_754
    }

    public class GetMessageAvailableReactions(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val rowSize: Int,
    ) : Function<AvailableReactions>() {
        override fun getConstructor(): Int = 1_994_098_354
    }

    public class GetMessageEffect(
        @JvmField
        public val effectId: Long,
    ) : Function<MessageEffect>() {
        override fun getConstructor(): Int = -1_638_843_116
    }

    public class GetMessageEmbeddingCode(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val forAlbum: Boolean,
    ) : Function<Text>() {
        override fun getConstructor(): Int = 1_654_967_561
    }

    public class GetMessageFileType(
        @JvmField
        public val messageFileHead: String,
    ) : Function<MessageFileType>() {
        override fun getConstructor(): Int = -490_270_764
    }

    public class GetMessageImportConfirmationText(
        @JvmField
        public val chatId: Long,
    ) : Function<Text>() {
        override fun getConstructor(): Int = 390_627_752
    }

    public class GetMessageLink(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val mediaTimestamp: Int,
        @JvmField
        public val forAlbum: Boolean,
        @JvmField
        public val inMessageThread: Boolean,
    ) : Function<MessageLink>() {
        override fun getConstructor(): Int = -984_158_342
    }

    public class GetMessageLinkInfo(
        @JvmField
        public val url: String,
    ) : Function<MessageLinkInfo>() {
        override fun getConstructor(): Int = -700_533_672
    }

    public class GetMessageLocally(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
    ) : Function<Message>() {
        override fun getConstructor(): Int = -603_575_444
    }

    public class GetMessageProperties(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
    ) : Function<MessageProperties>() {
        override fun getConstructor(): Int = 773_382_571
    }

    public class GetMessagePublicForwards(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val offset: String,
        @JvmField
        public val limit: Int,
    ) : Function<PublicForwards>() {
        override fun getConstructor(): Int = 1_369_285_812
    }

    public class GetMessageReadDate(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
    ) : Function<MessageReadDate>() {
        override fun getConstructor(): Int = -1_484_455_101
    }

    public class GetMessageStatistics(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val isDark: Boolean,
    ) : Function<MessageStatistics>() {
        override fun getConstructor(): Int = 1_270_194_648
    }

    public class GetMessageThread(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
    ) : Function<MessageThreadInfo>() {
        override fun getConstructor(): Int = 2_062_695_998
    }

    public class GetMessageThreadHistory(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val fromMessageId: Long,
        @JvmField
        public val offset: Int,
        @JvmField
        public val limit: Int,
    ) : Function<Messages>() {
        override fun getConstructor(): Int = -1_808_411_608
    }

    public class GetMessageViewers(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
    ) : Function<MessageViewers>() {
        override fun getConstructor(): Int = -1_584_457_010
    }

    public class GetMessages(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageIds: LongArray,
    ) : Function<Messages>() {
        override fun getConstructor(): Int = 425_299_338
    }

    public class GetNetworkStatistics(
        @JvmField
        public val onlyCurrent: Boolean,
    ) : Function<NetworkStatistics>() {
        override fun getConstructor(): Int = -986_228_706
    }

    public class GetNewChatPrivacySettings() : Function<NewChatPrivacySettings>() {
        override fun getConstructor(): Int = -1_295_299_657
    }

    public class GetOption(
        @JvmField
        public val name: String,
    ) : Function<OptionValue>() {
        override fun getConstructor(): Int = -1_572_495_746
    }

    public class GetOwnedBots() : Function<Users>() {
        override fun getConstructor(): Int = -1_954_035_715
    }

    public class GetOwnedStickerSets(
        @JvmField
        public val offsetStickerSetId: Long,
        @JvmField
        public val limit: Int,
    ) : Function<StickerSets>() {
        override fun getConstructor(): Int = 1_493_074_208
    }

    public class GetPaidMessageRevenue(
        @JvmField
        public val userId: Long,
    ) : Function<StarCount>() {
        override fun getConstructor(): Int = 1_976_589_102
    }

    public class GetPassportAuthorizationForm(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val scope: String,
        @JvmField
        public val publicKey: String,
        @JvmField
        public val nonce: String,
    ) : Function<PassportAuthorizationForm>() {
        override fun getConstructor(): Int = 1_636_107_398
    }

    public class GetPassportAuthorizationFormAvailableElements(
        @JvmField
        public val authorizationFormId: Int,
        @JvmField
        public val password: String,
    ) : Function<PassportElementsWithErrors>() {
        override fun getConstructor(): Int = 1_068_700_924
    }

    public class GetPassportElement(
        @JvmField
        public val type: PassportElementType,
        @JvmField
        public val password: String,
    ) : Function<PassportElement>() {
        override fun getConstructor(): Int = -1_882_398_342
    }

    public class GetPasswordState() : Function<PasswordState>() {
        override fun getConstructor(): Int = -174_752_904
    }

    public class GetPaymentForm(
        @JvmField
        public val inputInvoice: InputInvoice,
        @JvmField
        public val theme: ThemeParameters?,
    ) : Function<PaymentForm>() {
        override fun getConstructor(): Int = -1_924_172_076
    }

    public class GetPaymentReceipt(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
    ) : Function<PaymentReceipt>() {
        override fun getConstructor(): Int = 1_013_758_294
    }

    public class GetPhoneNumberInfo(
        @JvmField
        public val phoneNumberPrefix: String,
    ) : Function<PhoneNumberInfo>() {
        override fun getConstructor(): Int = -1_608_344_583
    }

    public class GetPhoneNumberInfoSync(
        @JvmField
        public val languageCode: String,
        @JvmField
        public val phoneNumberPrefix: String,
    ) : Function<PhoneNumberInfo>() {
        override fun getConstructor(): Int = 547_061_048
    }

    public class GetPollVoters(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val optionId: Int,
        @JvmField
        public val offset: Int,
        @JvmField
        public val limit: Int,
    ) : Function<MessageSenders>() {
        override fun getConstructor(): Int = -1_000_625_748
    }

    public class GetPreferredCountryLanguage(
        @JvmField
        public val countryCode: String,
    ) : Function<Text>() {
        override fun getConstructor(): Int = -933_049_386
    }

    public class GetPremiumFeatures(
        @JvmField
        public val source: PremiumSource?,
    ) : Function<PremiumFeatures>() {
        override fun getConstructor(): Int = -1_260_640_695
    }

    public class GetPremiumGiftPaymentOptions() : Function<PremiumGiftPaymentOptions>() {
        override fun getConstructor(): Int = -480_334_244
    }

    public class GetPremiumGiveawayPaymentOptions(
        @JvmField
        public val boostedChatId: Long,
    ) : Function<PremiumGiveawayPaymentOptions>() {
        override fun getConstructor(): Int = 1_222_168_073
    }

    public class GetPremiumInfoSticker(
        @JvmField
        public val monthCount: Int,
    ) : Function<Sticker>() {
        override fun getConstructor(): Int = 2_043_562_651
    }

    public class GetPremiumLimit(
        @JvmField
        public val limitType: PremiumLimitType,
    ) : Function<PremiumLimit>() {
        override fun getConstructor(): Int = 1_075_313_898
    }

    public class GetPremiumState() : Function<PremiumState>() {
        override fun getConstructor(): Int = 663_632_610
    }

    public class GetPremiumStickerExamples() : Function<Stickers>() {
        override fun getConstructor(): Int = 1_399_442_328
    }

    public class GetPremiumStickers(
        @JvmField
        public val limit: Int,
    ) : Function<Stickers>() {
        override fun getConstructor(): Int = -280_950_192
    }

    public class GetPreparedInlineMessage(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val preparedMessageId: String,
    ) : Function<PreparedInlineMessage>() {
        override fun getConstructor(): Int = -83_179_701
    }

    public class GetProxies() : Function<Proxies>() {
        override fun getConstructor(): Int = -95_026_381
    }

    public class GetProxyLink(
        @JvmField
        public val proxyId: Int,
    ) : Function<HttpUrl>() {
        override fun getConstructor(): Int = -1_054_495_112
    }

    public class GetPushReceiverId(
        @JvmField
        public val payload: String,
    ) : Function<PushReceiverId>() {
        override fun getConstructor(): Int = -286_505_294
    }

    public class GetReadDatePrivacySettings() : Function<ReadDatePrivacySettings>() {
        override fun getConstructor(): Int = 451_435_451
    }

    public class GetReceivedGift(
        @JvmField
        public val receivedGiftId: String,
    ) : Function<ReceivedGift>() {
        override fun getConstructor(): Int = -446_535_239
    }

    public class GetReceivedGifts(
        @JvmField
        public val businessConnectionId: String,
        @JvmField
        public val ownerId: MessageSender,
        @JvmField
        public val excludeUnsaved: Boolean,
        @JvmField
        public val excludeSaved: Boolean,
        @JvmField
        public val excludeUnlimited: Boolean,
        @JvmField
        public val excludeLimited: Boolean,
        @JvmField
        public val excludeUpgraded: Boolean,
        @JvmField
        public val sortByPrice: Boolean,
        @JvmField
        public val offset: String,
        @JvmField
        public val limit: Int,
    ) : Function<ReceivedGifts>() {
        override fun getConstructor(): Int = -586_538_672
    }

    public class GetRecentEmojiStatuses() : Function<EmojiStatuses>() {
        override fun getConstructor(): Int = -1_371_914_967
    }

    public class GetRecentInlineBots() : Function<Users>() {
        override fun getConstructor(): Int = 1_437_823_548
    }

    public class GetRecentStickers(
        @JvmField
        public val isAttached: Boolean,
    ) : Function<Stickers>() {
        override fun getConstructor(): Int = -579_622_241
    }

    public class GetRecentlyOpenedChats(
        @JvmField
        public val limit: Int,
    ) : Function<Chats>() {
        override fun getConstructor(): Int = -1_924_156_893
    }

    public class GetRecentlyVisitedTMeUrls(
        @JvmField
        public val referrer: String,
    ) : Function<TMeUrls>() {
        override fun getConstructor(): Int = 806_754_961
    }

    public class GetRecommendedChatFolders() : Function<RecommendedChatFolders>() {
        override fun getConstructor(): Int = -145_540_217
    }

    public class GetRecommendedChats() : Function<Chats>() {
        override fun getConstructor(): Int = -649_884_303
    }

    public class GetRecoveryEmailAddress(
        @JvmField
        public val password: String,
    ) : Function<RecoveryEmailAddress>() {
        override fun getConstructor(): Int = -1_594_770_947
    }

    public class GetRemoteFile(
        @JvmField
        public val remoteFileId: String,
        @JvmField
        public val fileType: FileType?,
    ) : Function<File>() {
        override fun getConstructor(): Int = 2_137_204_530
    }

    public class GetRepliedMessage(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
    ) : Function<Message>() {
        override fun getConstructor(): Int = -641_918_531
    }

    public class GetSavedAnimations() : Function<Animations>() {
        override fun getConstructor(): Int = 7_051_032
    }

    public class GetSavedMessagesTags(
        @JvmField
        public val savedMessagesTopicId: Long,
    ) : Function<SavedMessagesTags>() {
        override fun getConstructor(): Int = -1_932_105_815
    }

    public class GetSavedMessagesTopicHistory(
        @JvmField
        public val savedMessagesTopicId: Long,
        @JvmField
        public val fromMessageId: Long,
        @JvmField
        public val offset: Int,
        @JvmField
        public val limit: Int,
    ) : Function<Messages>() {
        override fun getConstructor(): Int = 2_011_552_360
    }

    public class GetSavedMessagesTopicMessageByDate(
        @JvmField
        public val savedMessagesTopicId: Long,
        @JvmField
        public val date: Int,
    ) : Function<Message>() {
        override fun getConstructor(): Int = -1_050_786_176
    }

    public class GetSavedNotificationSound(
        @JvmField
        public val notificationSoundId: Long,
    ) : Function<NotificationSounds>() {
        override fun getConstructor(): Int = 459_569_431
    }

    public class GetSavedNotificationSounds() : Function<NotificationSounds>() {
        override fun getConstructor(): Int = -1_070_305_368
    }

    public class GetSavedOrderInfo() : Function<OrderInfo>() {
        override fun getConstructor(): Int = -1_152_016_675
    }

    public class GetScopeNotificationSettings(
        @JvmField
        public val scope: NotificationSettingsScope,
    ) : Function<ScopeNotificationSettings>() {
        override fun getConstructor(): Int = -995_613_361
    }

    public class GetSearchSponsoredChats(
        @JvmField
        public val query: String,
    ) : Function<SponsoredChats>() {
        override fun getConstructor(): Int = 1_568_505_164
    }

    public class GetSearchedForTags(
        @JvmField
        public val tagPrefix: String,
        @JvmField
        public val limit: Int,
    ) : Function<Hashtags>() {
        override fun getConstructor(): Int = -1_692_716_851
    }

    public class GetSecretChat(
        @JvmField
        public val secretChatId: Int,
    ) : Function<SecretChat>() {
        override fun getConstructor(): Int = 40_599_169
    }

    public class GetStarAdAccountUrl(
        @JvmField
        public val ownerId: MessageSender,
    ) : Function<HttpUrl>() {
        override fun getConstructor(): Int = 1_940_473_181
    }

    public class GetStarGiftPaymentOptions(
        @JvmField
        public val userId: Long,
    ) : Function<StarPaymentOptions>() {
        override fun getConstructor(): Int = -500_735_773
    }

    public class GetStarGiveawayPaymentOptions() : Function<StarGiveawayPaymentOptions>() {
        override fun getConstructor(): Int = -883_172_578
    }

    public class GetStarPaymentOptions() : Function<StarPaymentOptions>() {
        override fun getConstructor(): Int = 1_838_351_940
    }

    public class GetStarRevenueStatistics(
        @JvmField
        public val ownerId: MessageSender,
        @JvmField
        public val isDark: Boolean,
    ) : Function<StarRevenueStatistics>() {
        override fun getConstructor(): Int = -260_356_841
    }

    public class GetStarSubscriptions(
        @JvmField
        public val onlyExpiring: Boolean,
        @JvmField
        public val offset: String,
    ) : Function<StarSubscriptions>() {
        override fun getConstructor(): Int = -641_223_956
    }

    public class GetStarTransactions(
        @JvmField
        public val ownerId: MessageSender,
        @JvmField
        public val subscriptionId: String,
        @JvmField
        public val direction: StarTransactionDirection?,
        @JvmField
        public val offset: String,
        @JvmField
        public val limit: Int,
    ) : Function<StarTransactions>() {
        override fun getConstructor(): Int = -258_541_327
    }

    public class GetStarWithdrawalUrl(
        @JvmField
        public val ownerId: MessageSender,
        @JvmField
        public val starCount: Long,
        @JvmField
        public val password: String,
    ) : Function<HttpUrl>() {
        override fun getConstructor(): Int = -1_445_841_134
    }

    public class GetStatisticalGraph(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val token: String,
        @JvmField
        public val x: Long,
    ) : Function<StatisticalGraph>() {
        override fun getConstructor(): Int = 1_100_975_515
    }

    public class GetStickerEmojis(
        @JvmField
        public val sticker: InputFile,
    ) : Function<Emojis>() {
        override fun getConstructor(): Int = -1_895_508_665
    }

    public class GetStickerOutline(
        @JvmField
        public val stickerFileId: Int,
        @JvmField
        public val forAnimatedEmoji: Boolean,
        @JvmField
        public val forClickedAnimatedEmojiMessage: Boolean,
    ) : Function<Outline>() {
        override fun getConstructor(): Int = -1_550_504_539
    }

    public class GetStickerSet(
        @JvmField
        public val setId: Long,
    ) : Function<StickerSet>() {
        override fun getConstructor(): Int = 1_052_318_659
    }

    public class GetStickerSetName(
        @JvmField
        public val setId: Long,
    ) : Function<Text>() {
        override fun getConstructor(): Int = 1_039_849_089
    }

    public class GetStickers(
        @JvmField
        public val stickerType: StickerType,
        @JvmField
        public val query: String,
        @JvmField
        public val limit: Int,
        @JvmField
        public val chatId: Long,
    ) : Function<Stickers>() {
        override fun getConstructor(): Int = 1_158_058_819
    }

    public class GetStorageStatistics(
        @JvmField
        public val chatLimit: Int,
    ) : Function<StorageStatistics>() {
        override fun getConstructor(): Int = -853_193_929
    }

    public class GetStorageStatisticsFast() : Function<StorageStatisticsFast>() {
        override fun getConstructor(): Int = 61_368_066
    }

    public class GetStory(
        @JvmField
        public val storyPosterChatId: Long,
        @JvmField
        public val storyId: Int,
        @JvmField
        public val onlyLocal: Boolean,
    ) : Function<Story>() {
        override fun getConstructor(): Int = -2_011_076_366
    }

    public class GetStoryAvailableReactions(
        @JvmField
        public val rowSize: Int,
    ) : Function<AvailableReactions>() {
        override fun getConstructor(): Int = 595_938_619
    }

    public class GetStoryInteractions(
        @JvmField
        public val storyId: Int,
        @JvmField
        public val query: String,
        @JvmField
        public val onlyContacts: Boolean,
        @JvmField
        public val preferForwards: Boolean,
        @JvmField
        public val preferWithReaction: Boolean,
        @JvmField
        public val offset: String,
        @JvmField
        public val limit: Int,
    ) : Function<StoryInteractions>() {
        override fun getConstructor(): Int = 483_475_469
    }

    public class GetStoryNotificationSettingsExceptions() : Function<Chats>() {
        override fun getConstructor(): Int = 627_715_760
    }

    public class GetStoryPublicForwards(
        @JvmField
        public val storyPosterChatId: Long,
        @JvmField
        public val storyId: Int,
        @JvmField
        public val offset: String,
        @JvmField
        public val limit: Int,
    ) : Function<PublicForwards>() {
        override fun getConstructor(): Int = 1_810_378_546
    }

    public class GetStoryStatistics(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val storyId: Int,
        @JvmField
        public val isDark: Boolean,
    ) : Function<StoryStatistics>() {
        override fun getConstructor(): Int = 982_926_146
    }

    public class GetSuggestedFileName(
        @JvmField
        public val fileId: Int,
        @JvmField
        public val directory: String,
    ) : Function<Text>() {
        override fun getConstructor(): Int = -2_049_399_674
    }

    public class GetSuggestedStickerSetName(
        @JvmField
        public val title: String,
    ) : Function<Text>() {
        override fun getConstructor(): Int = -1_340_995_520
    }

    public class GetSuitableDiscussionChats() : Function<Chats>() {
        override fun getConstructor(): Int = 49_044_982
    }

    public class GetSuitablePersonalChats() : Function<Chats>() {
        override fun getConstructor(): Int = -1_870_357_515
    }

    public class GetSupergroup(
        @JvmField
        public val supergroupId: Long,
    ) : Function<Supergroup>() {
        override fun getConstructor(): Int = 989_663_458
    }

    public class GetSupergroupFullInfo(
        @JvmField
        public val supergroupId: Long,
    ) : Function<SupergroupFullInfo>() {
        override fun getConstructor(): Int = 1_099_776_056
    }

    public class GetSupergroupMembers(
        @JvmField
        public val supergroupId: Long,
        @JvmField
        public val filter: SupergroupMembersFilter?,
        @JvmField
        public val offset: Int,
        @JvmField
        public val limit: Int,
    ) : Function<ChatMembers>() {
        override fun getConstructor(): Int = -570_940_984
    }

    public class GetSupportName() : Function<Text>() {
        override fun getConstructor(): Int = 1_302_205_794
    }

    public class GetSupportUser() : Function<User>() {
        override fun getConstructor(): Int = -1_733_497_700
    }

    public class GetTemporaryPasswordState() : Function<TemporaryPasswordState>() {
        override fun getConstructor(): Int = -12_670_830
    }

    public class GetTextEntities(
        @JvmField
        public val text: String,
    ) : Function<TextEntities>() {
        override fun getConstructor(): Int = -341_490_693
    }

    public class GetThemeParametersJsonString(
        @JvmField
        public val theme: ThemeParameters,
    ) : Function<Text>() {
        override fun getConstructor(): Int = -1_850_145_288
    }

    public class GetThemedChatEmojiStatuses() : Function<EmojiStatusCustomEmojis>() {
        override fun getConstructor(): Int = 1_924_568_314
    }

    public class GetThemedEmojiStatuses() : Function<EmojiStatusCustomEmojis>() {
        override fun getConstructor(): Int = -1_468_220_543
    }

    public class GetTimeZones() : Function<TimeZones>() {
        override fun getConstructor(): Int = 1_340_268_632
    }

    public class GetTopChats(
        @JvmField
        public val category: TopChatCategory,
        @JvmField
        public val limit: Int,
    ) : Function<Chats>() {
        override fun getConstructor(): Int = -388_410_847
    }

    public class GetTrendingStickerSets(
        @JvmField
        public val stickerType: StickerType,
        @JvmField
        public val offset: Int,
        @JvmField
        public val limit: Int,
    ) : Function<TrendingStickerSets>() {
        override fun getConstructor(): Int = -531_085_986
    }

    public class GetUpgradedGift(
        @JvmField
        public val name: String,
    ) : Function<UpgradedGift>() {
        override fun getConstructor(): Int = -1_331_821_135
    }

    public class GetUpgradedGiftEmojiStatuses() : Function<EmojiStatuses>() {
        override fun getConstructor(): Int = -1_748_975_723
    }

    public class GetUpgradedGiftWithdrawalUrl(
        @JvmField
        public val receivedGiftId: String,
        @JvmField
        public val password: String,
    ) : Function<HttpUrl>() {
        override fun getConstructor(): Int = -784_331_188
    }

    public class GetUser(
        @JvmField
        public val userId: Long,
    ) : Function<User>() {
        override fun getConstructor(): Int = 1_117_363_211
    }

    public class GetUserChatBoosts(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val userId: Long,
    ) : Function<FoundChatBoosts>() {
        override fun getConstructor(): Int = -1_190_205_543
    }

    public class GetUserFullInfo(
        @JvmField
        public val userId: Long,
    ) : Function<UserFullInfo>() {
        override fun getConstructor(): Int = -776_823_720
    }

    public class GetUserLink() : Function<UserLink>() {
        override fun getConstructor(): Int = 1_226_839_270
    }

    public class GetUserPrivacySettingRules(
        @JvmField
        public val setting: UserPrivacySetting,
    ) : Function<UserPrivacySettingRules>() {
        override fun getConstructor(): Int = -2_077_223_311
    }

    public class GetUserProfilePhotos(
        @JvmField
        public val userId: Long,
        @JvmField
        public val offset: Int,
        @JvmField
        public val limit: Int,
    ) : Function<ChatPhotos>() {
        override fun getConstructor(): Int = -908_132_798
    }

    public class GetUserSupportInfo(
        @JvmField
        public val userId: Long,
    ) : Function<UserSupportInfo>() {
        override fun getConstructor(): Int = 1_957_008_133
    }

    public class GetVideoChatAvailableParticipants(
        @JvmField
        public val chatId: Long,
    ) : Function<MessageSenders>() {
        override fun getConstructor(): Int = -1_000_496_379
    }

    public class GetVideoChatInviteLink(
        @JvmField
        public val groupCallId: Int,
        @JvmField
        public val canSelfUnmute: Boolean,
    ) : Function<HttpUrl>() {
        override fun getConstructor(): Int = -1_394_707_321
    }

    public class GetVideoChatRtmpUrl(
        @JvmField
        public val chatId: Long,
    ) : Function<RtmpUrl>() {
        override fun getConstructor(): Int = 1_210_784_543
    }

    public class GetVideoChatStreamSegment(
        @JvmField
        public val groupCallId: Int,
        @JvmField
        public val timeOffset: Long,
        @JvmField
        public val scale: Int,
        @JvmField
        public val channelId: Int,
        @JvmField
        public val videoQuality: GroupCallVideoQuality?,
    ) : Function<Data>() {
        override fun getConstructor(): Int = 773_343_220
    }

    public class GetVideoChatStreams(
        @JvmField
        public val groupCallId: Int,
    ) : Function<VideoChatStreams>() {
        override fun getConstructor(): Int = 531_757_765
    }

    public class GetWebAppLinkUrl(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val webAppShortName: String,
        @JvmField
        public val startParameter: String,
        @JvmField
        public val allowWriteAccess: Boolean,
        @JvmField
        public val parameters: WebAppOpenParameters,
    ) : Function<HttpUrl>() {
        override fun getConstructor(): Int = 1_627_284_161
    }

    public class GetWebAppPlaceholder(
        @JvmField
        public val botUserId: Long,
    ) : Function<Outline>() {
        override fun getConstructor(): Int = 583_470_479
    }

    public class GetWebAppUrl(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val url: String,
        @JvmField
        public val parameters: WebAppOpenParameters,
    ) : Function<HttpUrl>() {
        override fun getConstructor(): Int = -1_526_784_188
    }

    public class GetWebPageInstantView(
        @JvmField
        public val url: String,
        @JvmField
        public val onlyLocal: Boolean,
    ) : Function<WebPageInstantView>() {
        override fun getConstructor(): Int = 1_741_395_197
    }

    public class GiftPremiumWithStars(
        @JvmField
        public val userId: Long,
        @JvmField
        public val starCount: Long,
        @JvmField
        public val monthCount: Int,
        @JvmField
        public val text: FormattedText,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_058_395_432
    }

    public class HideContactCloseBirthdays() : Function<Ok>() {
        override fun getConstructor(): Int = -1_163_065_221
    }

    public class HideSuggestedAction(
        @JvmField
        public val action: SuggestedAction,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_561_384_065
    }

    public class ImportContacts(
        @JvmField
        public val contacts: Array<Contact>,
    ) : Function<ImportedContacts>() {
        override fun getConstructor(): Int = -215_132_767
    }

    public class ImportMessages(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageFile: InputFile,
        @JvmField
        public val attachedFiles: Array<InputFile>,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_864_116_784
    }

    public class InviteGroupCallParticipant(
        @JvmField
        public val groupCallId: Int,
        @JvmField
        public val userId: Long,
        @JvmField
        public val isVideo: Boolean,
    ) : Function<InviteGroupCallParticipantResult>() {
        override fun getConstructor(): Int = -631_535_414
    }

    public class InviteVideoChatParticipants(
        @JvmField
        public val groupCallId: Int,
        @JvmField
        public val userIds: LongArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -473_149_298
    }

    public class JoinChat(
        @JvmField
        public val chatId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 326_769_313
    }

    public class JoinChatByInviteLink(
        @JvmField
        public val inviteLink: String,
    ) : Function<Chat>() {
        override fun getConstructor(): Int = -1_049_973_882
    }

    public class JoinGroupCall(
        @JvmField
        public val inputGroupCall: InputGroupCall,
        @JvmField
        public val joinParameters: GroupCallJoinParameters,
    ) : Function<GroupCallInfo>() {
        override fun getConstructor(): Int = -2_026_079_917
    }

    public class JoinVideoChat(
        @JvmField
        public val groupCallId: Int,
        @JvmField
        public val participantId: MessageSender?,
        @JvmField
        public val joinParameters: GroupCallJoinParameters,
        @JvmField
        public val inviteHash: String,
    ) : Function<Text>() {
        override fun getConstructor(): Int = 1_322_989_999
    }

    public class LaunchPrepaidGiveaway(
        @JvmField
        public val giveawayId: Long,
        @JvmField
        public val parameters: GiveawayParameters,
        @JvmField
        public val winnerCount: Int,
        @JvmField
        public val starCount: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 639_465_530
    }

    public class LeaveChat(
        @JvmField
        public val chatId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_825_080_735
    }

    public class LeaveGroupCall(
        @JvmField
        public val groupCallId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 980_152_233
    }

    public class LoadActiveStories(
        @JvmField
        public val storyList: StoryList,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 2_106_390_328
    }

    public class LoadChats(
        @JvmField
        public val chatList: ChatList?,
        @JvmField
        public val limit: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_885_635_205
    }

    public class LoadGroupCallParticipants(
        @JvmField
        public val groupCallId: Int,
        @JvmField
        public val limit: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 938_720_974
    }

    public class LoadQuickReplyShortcutMessages(
        @JvmField
        public val shortcutId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -46_092_588
    }

    public class LoadQuickReplyShortcuts() : Function<Ok>() {
        override fun getConstructor(): Int = -1_016_614_243
    }

    public class LoadSavedMessagesTopics(
        @JvmField
        public val limit: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 289_855_160
    }

    public class LogOut() : Function<Ok>() {
        override fun getConstructor(): Int = -1_581_923_301
    }

    public class OpenBotSimilarBot(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val openedBotUserId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -369_688_872
    }

    public class OpenChat(
        @JvmField
        public val chatId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -323_371_509
    }

    public class OpenChatSimilarChat(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val openedChatId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_884_883_949
    }

    public class OpenMessageContent(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -739_088_005
    }

    public class OpenSponsoredChat(
        @JvmField
        public val sponsoredChatUniqueId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 865_985_573
    }

    public class OpenStory(
        @JvmField
        public val storyPosterChatId: Long,
        @JvmField
        public val storyId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -696_723_005
    }

    public class OpenWebApp(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val url: String,
        @JvmField
        public val messageThreadId: Long,
        @JvmField
        public val replyTo: InputMessageReplyTo?,
        @JvmField
        public val parameters: WebAppOpenParameters,
    ) : Function<WebAppInfo>() {
        override fun getConstructor(): Int = 662_795_170
    }

    public class OptimizeStorage(
        @JvmField
        public val size: Long,
        @JvmField
        public val ttl: Int,
        @JvmField
        public val count: Int,
        @JvmField
        public val immunityDelay: Int,
        @JvmField
        public val fileTypes: Array<FileType>,
        @JvmField
        public val chatIds: LongArray,
        @JvmField
        public val excludeChatIds: LongArray,
        @JvmField
        public val returnDeletedFileStatistics: Boolean,
        @JvmField
        public val chatLimit: Int,
    ) : Function<StorageStatistics>() {
        override fun getConstructor(): Int = 853_186_759
    }

    public class ParseMarkdown(
        @JvmField
        public val text: FormattedText,
    ) : Function<FormattedText>() {
        override fun getConstructor(): Int = 756_366_063
    }

    public class ParseTextEntities(
        @JvmField
        public val text: String,
        @JvmField
        public val parseMode: TextParseMode,
    ) : Function<FormattedText>() {
        override fun getConstructor(): Int = -1_709_194_593
    }

    public class PinChatMessage(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val disableNotification: Boolean,
        @JvmField
        public val onlyForSelf: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 2_034_719_663
    }

    public class PingProxy(
        @JvmField
        public val proxyId: Int,
    ) : Function<Seconds>() {
        override fun getConstructor(): Int = -979_681_103
    }

    public class PostStory(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val content: InputStoryContent,
        @JvmField
        public val areas: InputStoryAreas?,
        @JvmField
        public val caption: FormattedText?,
        @JvmField
        public val privacySettings: StoryPrivacySettings,
        @JvmField
        public val activePeriod: Int,
        @JvmField
        public val fromStoryFullId: StoryFullId?,
        @JvmField
        public val isPostedToChatPage: Boolean,
        @JvmField
        public val protectContent: Boolean,
    ) : Function<Story>() {
        override fun getConstructor(): Int = -257_605_513
    }

    public class PreliminaryUploadFile(
        @JvmField
        public val file: InputFile,
        @JvmField
        public val fileType: FileType?,
        @JvmField
        public val priority: Int,
    ) : Function<File>() {
        override fun getConstructor(): Int = 1_894_239_129
    }

    public class ProcessChatFolderNewChats(
        @JvmField
        public val chatFolderId: Int,
        @JvmField
        public val addedChatIds: LongArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_498_280_672
    }

    public class ProcessChatJoinRequest(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val userId: Long,
        @JvmField
        public val approve: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_004_876_963
    }

    public class ProcessChatJoinRequests(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val inviteLink: String,
        @JvmField
        public val approve: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_048_722_894
    }

    public class ProcessPushNotification(
        @JvmField
        public val payload: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 786_679_952
    }

    public class RateSpeechRecognition(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val isGood: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -287_521_867
    }

    public class ReadAllChatMentions(
        @JvmField
        public val chatId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_357_558_453
    }

    public class ReadAllChatReactions(
        @JvmField
        public val chatId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_421_973_357
    }

    public class ReadAllMessageThreadMentions(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageThreadId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_323_136_341
    }

    public class ReadAllMessageThreadReactions(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageThreadId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -792_975_554
    }

    public class ReadBusinessMessage(
        @JvmField
        public val businessConnectionId: String,
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_723_531_538
    }

    public class ReadChatList(
        @JvmField
        public val chatList: ChatList,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_117_480_790
    }

    public class ReadFilePart(
        @JvmField
        public val fileId: Int,
        @JvmField
        public val offset: Long,
        @JvmField
        public val count: Long,
    ) : Function<Data>() {
        override fun getConstructor(): Int = -174_576_822
    }

    public class ReaddQuickReplyShortcutMessages(
        @JvmField
        public val shortcutName: String,
        @JvmField
        public val messageIds: LongArray,
    ) : Function<QuickReplyMessages>() {
        override fun getConstructor(): Int = 387_399_566
    }

    public class RecognizeSpeech(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_741_947_577
    }

    public class RecoverAuthenticationPassword(
        @JvmField
        public val recoveryCode: String,
        @JvmField
        public val newPassword: String,
        @JvmField
        public val newHint: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -131_001_053
    }

    public class RecoverPassword(
        @JvmField
        public val recoveryCode: String,
        @JvmField
        public val newPassword: String,
        @JvmField
        public val newHint: String,
    ) : Function<PasswordState>() {
        override fun getConstructor(): Int = -1_524_262_541
    }

    public class RefundStarPayment(
        @JvmField
        public val userId: Long,
        @JvmField
        public val telegramPaymentChargeId: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_804_165_035
    }

    public class RegisterDevice(
        @JvmField
        public val deviceToken: DeviceToken,
        @JvmField
        public val otherUserIds: LongArray,
    ) : Function<PushReceiverId>() {
        override fun getConstructor(): Int = 366_088_823
    }

    public class RegisterUser(
        @JvmField
        public val firstName: String,
        @JvmField
        public val lastName: String,
        @JvmField
        public val disableNotification: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_012_247_828
    }

    public class RemoveAllFilesFromDownloads(
        @JvmField
        public val onlyActive: Boolean,
        @JvmField
        public val onlyCompleted: Boolean,
        @JvmField
        public val deleteFromCache: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_186_433_402
    }

    public class RemoveBusinessConnectedBotFromChat(
        @JvmField
        public val chatId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 2_020_766_707
    }

    public class RemoveChatActionBar(
        @JvmField
        public val chatId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_650_968_070
    }

    public class RemoveContacts(
        @JvmField
        public val userIds: LongArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_943_858_054
    }

    public class RemoveFavoriteSticker(
        @JvmField
        public val sticker: InputFile,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_152_945_264
    }

    public class RemoveFileFromDownloads(
        @JvmField
        public val fileId: Int,
        @JvmField
        public val deleteFromCache: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_460_060_142
    }

    public class RemoveInstalledBackground(
        @JvmField
        public val backgroundId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_346_446_652
    }

    public class RemoveMessageReaction(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val reactionType: ReactionType,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_756_934_789
    }

    public class RemoveMessageSenderBotVerification(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val verifiedId: MessageSender,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_710_174_374
    }

    public class RemoveNotification(
        @JvmField
        public val notificationGroupId: Int,
        @JvmField
        public val notificationId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 862_630_734
    }

    public class RemoveNotificationGroup(
        @JvmField
        public val notificationGroupId: Int,
        @JvmField
        public val maxNotificationId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_713_005_454
    }

    public class RemovePendingPaidMessageReactions(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_100_258_555
    }

    public class RemoveProxy(
        @JvmField
        public val proxyId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_369_219_847
    }

    public class RemoveRecentHashtag(
        @JvmField
        public val hashtag: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_013_735_260
    }

    public class RemoveRecentSticker(
        @JvmField
        public val isAttached: Boolean,
        @JvmField
        public val sticker: InputFile,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_246_577_677
    }

    public class RemoveRecentlyFoundChat(
        @JvmField
        public val chatId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 717_340_444
    }

    public class RemoveSavedAnimation(
        @JvmField
        public val animation: InputFile,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -495_605_479
    }

    public class RemoveSavedNotificationSound(
        @JvmField
        public val notificationSoundId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -480_032_946
    }

    public class RemoveSearchedForTag(
        @JvmField
        public val tag: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 891_382_730
    }

    public class RemoveStickerFromSet(
        @JvmField
        public val sticker: InputFile,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_642_196_644
    }

    public class RemoveTopChat(
        @JvmField
        public val category: TopChatCategory,
        @JvmField
        public val chatId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_907_876_267
    }

    public class ReorderActiveUsernames(
        @JvmField
        public val usernames: Array<String>,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -455_399_375
    }

    public class ReorderBotActiveUsernames(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val usernames: Array<String>,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_602_301_664
    }

    public class ReorderBotMediaPreviews(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val languageCode: String,
        @JvmField
        public val fileIds: IntArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 630_851_043
    }

    public class ReorderChatFolders(
        @JvmField
        public val chatFolderIds: IntArray,
        @JvmField
        public val mainChatListPosition: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_665_299_546
    }

    public class ReorderInstalledStickerSets(
        @JvmField
        public val stickerType: StickerType,
        @JvmField
        public val stickerSetIds: LongArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_074_928_158
    }

    public class ReorderQuickReplyShortcuts(
        @JvmField
        public val shortcutIds: IntArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_052_799_232
    }

    public class ReorderSupergroupActiveUsernames(
        @JvmField
        public val supergroupId: Long,
        @JvmField
        public val usernames: Array<String>,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_962_466_095
    }

    public class ReplacePrimaryChatInviteLink(
        @JvmField
        public val chatId: Long,
    ) : Function<ChatInviteLink>() {
        override fun getConstructor(): Int = 1_067_350_941
    }

    public class ReplaceStickerInSet(
        @JvmField
        public val userId: Long,
        @JvmField
        public val name: String,
        @JvmField
        public val oldSticker: InputFile,
        @JvmField
        public val newSticker: InputSticker,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -406_311_399
    }

    public class ReplaceVideoChatRtmpUrl(
        @JvmField
        public val chatId: Long,
    ) : Function<RtmpUrl>() {
        override fun getConstructor(): Int = 558_862_304
    }

    public class ReportAuthenticationCodeMissing(
        @JvmField
        public val mobileNetworkCode: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_846_555_064
    }

    public class ReportChat(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val optionId: ByteArray,
        @JvmField
        public val messageIds: LongArray,
        @JvmField
        public val text: String,
    ) : Function<ReportChatResult>() {
        override fun getConstructor(): Int = 1_058_475_058
    }

    public class ReportChatPhoto(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val fileId: Int,
        @JvmField
        public val reason: ReportReason,
        @JvmField
        public val text: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -646_966_648
    }

    public class ReportChatSponsoredMessage(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val optionId: ByteArray,
    ) : Function<ReportSponsoredResult>() {
        override fun getConstructor(): Int = -979_984_820
    }

    public class ReportMessageReactions(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val senderId: MessageSender,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 919_111_719
    }

    public class ReportPhoneNumberCodeMissing(
        @JvmField
        public val mobileNetworkCode: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -895_175_341
    }

    public class ReportSponsoredChat(
        @JvmField
        public val sponsoredChatUniqueId: Long,
        @JvmField
        public val optionId: ByteArray,
    ) : Function<ReportSponsoredResult>() {
        override fun getConstructor(): Int = -902_673_019
    }

    public class ReportStory(
        @JvmField
        public val storyPosterChatId: Long,
        @JvmField
        public val storyId: Int,
        @JvmField
        public val optionId: ByteArray,
        @JvmField
        public val text: String,
    ) : Function<ReportStoryResult>() {
        override fun getConstructor(): Int = 1_823_256_372
    }

    public class ReportSupergroupAntiSpamFalsePositive(
        @JvmField
        public val supergroupId: Long,
        @JvmField
        public val messageId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -516_050_872
    }

    public class ReportSupergroupSpam(
        @JvmField
        public val supergroupId: Long,
        @JvmField
        public val messageIds: LongArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -94_825_000
    }

    public class RequestAuthenticationPasswordRecovery() : Function<Ok>() {
        override fun getConstructor(): Int = 1_393_896_118
    }

    public class RequestPasswordRecovery() : Function<EmailAddressAuthenticationCodeInfo>() {
        override fun getConstructor(): Int = -13_777_582
    }

    public class RequestQrCodeAuthentication(
        @JvmField
        public val otherUserIds: LongArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_363_496_527
    }

    public class ResendAuthenticationCode(
        @JvmField
        public val reason: ResendCodeReason?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_506_755_656
    }

    public class ResendEmailAddressVerificationCode() : Function<EmailAddressAuthenticationCodeInfo>() {
        override fun getConstructor(): Int = -1_872_416_732
    }

    public class ResendLoginEmailAddressCode() : Function<EmailAddressAuthenticationCodeInfo>() {
        override fun getConstructor(): Int = 292_966_933
    }

    public class ResendMessages(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageIds: LongArray,
        @JvmField
        public val quote: InputTextQuote?,
        @JvmField
        public val paidMessageStarCount: Long,
    ) : Function<Messages>() {
        override fun getConstructor(): Int = 526_374_678
    }

    public class ResendPhoneNumberCode(
        @JvmField
        public val reason: ResendCodeReason?,
    ) : Function<AuthenticationCodeInfo>() {
        override fun getConstructor(): Int = 1_808_704_551
    }

    public class ResendRecoveryEmailAddressCode() : Function<PasswordState>() {
        override fun getConstructor(): Int = 433_483_548
    }

    public class ResetAllNotificationSettings() : Function<Ok>() {
        override fun getConstructor(): Int = -174_020_359
    }

    public class ResetAuthenticationEmailAddress() : Function<Ok>() {
        override fun getConstructor(): Int = -415_075_796
    }

    public class ResetInstalledBackgrounds() : Function<Ok>() {
        override fun getConstructor(): Int = 1_884_553_559
    }

    public class ResetNetworkStatistics() : Function<Ok>() {
        override fun getConstructor(): Int = 1_646_452_102
    }

    public class ResetPassword() : Function<ResetPasswordResult>() {
        override fun getConstructor(): Int = -593_589_091
    }

    public class ReuseStarSubscription(
        @JvmField
        public val subscriptionId: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 778_531_905
    }

    public class RevokeChatInviteLink(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val inviteLink: String,
    ) : Function<ChatInviteLinks>() {
        override fun getConstructor(): Int = -776_514_135
    }

    public class RevokeGroupCallInviteLink(
        @JvmField
        public val groupCallId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 501_589_140
    }

    public class SaveApplicationLogEvent(
        @JvmField
        public val type: String,
        @JvmField
        public val chatId: Long,
        @JvmField
        public val data: JsonValue,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -811_154_930
    }

    public class SavePreparedInlineMessage(
        @JvmField
        public val userId: Long,
        @JvmField
        public val result: InputInlineQueryResult,
        @JvmField
        public val chatTypes: TargetChatTypes,
    ) : Function<PreparedInlineMessageId>() {
        override fun getConstructor(): Int = -954_963_751
    }

    public class SearchAffiliatePrograms(
        @JvmField
        public val affiliate: AffiliateType,
        @JvmField
        public val sortOrder: AffiliateProgramSortOrder,
        @JvmField
        public val offset: String,
        @JvmField
        public val limit: Int,
    ) : Function<FoundAffiliatePrograms>() {
        override fun getConstructor(): Int = 681_156_625
    }

    public class SearchBackground(
        @JvmField
        public val name: String,
    ) : Function<Background>() {
        override fun getConstructor(): Int = -2_130_996_959
    }

    public class SearchCallMessages(
        @JvmField
        public val offset: String,
        @JvmField
        public val limit: Int,
        @JvmField
        public val onlyMissed: Boolean,
    ) : Function<FoundMessages>() {
        override fun getConstructor(): Int = -1_942_229_221
    }

    public class SearchChatAffiliateProgram(
        @JvmField
        public val username: String,
        @JvmField
        public val referrer: String,
    ) : Function<Chat>() {
        override fun getConstructor(): Int = -1_339_291_206
    }

    public class SearchChatMembers(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val query: String,
        @JvmField
        public val limit: Int,
        @JvmField
        public val filter: ChatMembersFilter?,
    ) : Function<ChatMembers>() {
        override fun getConstructor(): Int = -445_823_291
    }

    public class SearchChatMessages(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val query: String,
        @JvmField
        public val senderId: MessageSender?,
        @JvmField
        public val fromMessageId: Long,
        @JvmField
        public val offset: Int,
        @JvmField
        public val limit: Int,
        @JvmField
        public val filter: SearchMessagesFilter?,
        @JvmField
        public val messageThreadId: Long,
        @JvmField
        public val savedMessagesTopicId: Long,
    ) : Function<FoundChatMessages>() {
        override fun getConstructor(): Int = -539_052_602
    }

    public class SearchChatRecentLocationMessages(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val limit: Int,
    ) : Function<Messages>() {
        override fun getConstructor(): Int = 950_238_950
    }

    public class SearchChats(
        @JvmField
        public val query: String,
        @JvmField
        public val limit: Int,
    ) : Function<Chats>() {
        override fun getConstructor(): Int = -1_879_787_060
    }

    public class SearchChatsOnServer(
        @JvmField
        public val query: String,
        @JvmField
        public val limit: Int,
    ) : Function<Chats>() {
        override fun getConstructor(): Int = -1_158_402_188
    }

    public class SearchContacts(
        @JvmField
        public val query: String,
        @JvmField
        public val limit: Int,
    ) : Function<Users>() {
        override fun getConstructor(): Int = -1_794_690_715
    }

    public class SearchEmojis(
        @JvmField
        public val text: String,
        @JvmField
        public val inputLanguageCodes: Array<String>,
    ) : Function<EmojiKeywords>() {
        override fun getConstructor(): Int = -1_456_187_668
    }

    public class SearchFileDownloads(
        @JvmField
        public val query: String,
        @JvmField
        public val onlyActive: Boolean,
        @JvmField
        public val onlyCompleted: Boolean,
        @JvmField
        public val offset: String,
        @JvmField
        public val limit: Int,
    ) : Function<FoundFileDownloads>() {
        override fun getConstructor(): Int = 706_611_286
    }

    public class SearchHashtags(
        @JvmField
        public val prefix: String,
        @JvmField
        public val limit: Int,
    ) : Function<Hashtags>() {
        override fun getConstructor(): Int = 1_043_637_617
    }

    public class SearchInstalledStickerSets(
        @JvmField
        public val stickerType: StickerType,
        @JvmField
        public val query: String,
        @JvmField
        public val limit: Int,
    ) : Function<StickerSets>() {
        override fun getConstructor(): Int = 2_120_122_276
    }

    public class SearchMessages(
        @JvmField
        public val chatList: ChatList?,
        @JvmField
        public val query: String,
        @JvmField
        public val offset: String,
        @JvmField
        public val limit: Int,
        @JvmField
        public val filter: SearchMessagesFilter?,
        @JvmField
        public val chatTypeFilter: SearchMessagesChatTypeFilter?,
        @JvmField
        public val minDate: Int,
        @JvmField
        public val maxDate: Int,
    ) : Function<FoundMessages>() {
        override fun getConstructor(): Int = 1_225_448_885
    }

    public class SearchOutgoingDocumentMessages(
        @JvmField
        public val query: String,
        @JvmField
        public val limit: Int,
    ) : Function<FoundMessages>() {
        override fun getConstructor(): Int = -1_071_397_762
    }

    public class SearchPublicChat(
        @JvmField
        public val username: String,
    ) : Function<Chat>() {
        override fun getConstructor(): Int = 857_135_533
    }

    public class SearchPublicChats(
        @JvmField
        public val query: String,
    ) : Function<Chats>() {
        override fun getConstructor(): Int = 970_385_337
    }

    public class SearchPublicMessagesByTag(
        @JvmField
        public val tag: String,
        @JvmField
        public val offset: String,
        @JvmField
        public val limit: Int,
    ) : Function<FoundMessages>() {
        override fun getConstructor(): Int = 630_680_746
    }

    public class SearchPublicStoriesByLocation(
        @JvmField
        public val address: LocationAddress,
        @JvmField
        public val offset: String,
        @JvmField
        public val limit: Int,
    ) : Function<FoundStories>() {
        override fun getConstructor(): Int = 1_596_709_256
    }

    public class SearchPublicStoriesByTag(
        @JvmField
        public val storyPosterChatId: Long,
        @JvmField
        public val tag: String,
        @JvmField
        public val offset: String,
        @JvmField
        public val limit: Int,
    ) : Function<FoundStories>() {
        override fun getConstructor(): Int = 1_778_102_602
    }

    public class SearchPublicStoriesByVenue(
        @JvmField
        public val venueProvider: String,
        @JvmField
        public val venueId: String,
        @JvmField
        public val offset: String,
        @JvmField
        public val limit: Int,
    ) : Function<FoundStories>() {
        override fun getConstructor(): Int = -686_136_790
    }

    public class SearchQuote(
        @JvmField
        public val text: FormattedText,
        @JvmField
        public val quote: FormattedText,
        @JvmField
        public val quotePosition: Int,
    ) : Function<FoundPosition>() {
        override fun getConstructor(): Int = 1_751_384_351
    }

    public class SearchRecentlyFoundChats(
        @JvmField
        public val query: String,
        @JvmField
        public val limit: Int,
    ) : Function<Chats>() {
        override fun getConstructor(): Int = 1_647_445_393
    }

    public class SearchSavedMessages(
        @JvmField
        public val savedMessagesTopicId: Long,
        @JvmField
        public val tag: ReactionType?,
        @JvmField
        public val query: String,
        @JvmField
        public val fromMessageId: Long,
        @JvmField
        public val offset: Int,
        @JvmField
        public val limit: Int,
    ) : Function<FoundChatMessages>() {
        override fun getConstructor(): Int = -1_969_512_554
    }

    public class SearchSecretMessages(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val query: String,
        @JvmField
        public val offset: String,
        @JvmField
        public val limit: Int,
        @JvmField
        public val filter: SearchMessagesFilter?,
    ) : Function<FoundMessages>() {
        override fun getConstructor(): Int = -852_865_892
    }

    public class SearchStickerSet(
        @JvmField
        public val name: String,
        @JvmField
        public val ignoreCache: Boolean,
    ) : Function<StickerSet>() {
        override fun getConstructor(): Int = 1_676_592_898
    }

    public class SearchStickerSets(
        @JvmField
        public val stickerType: StickerType,
        @JvmField
        public val query: String,
    ) : Function<StickerSets>() {
        override fun getConstructor(): Int = 262_801_004
    }

    public class SearchStickers(
        @JvmField
        public val stickerType: StickerType,
        @JvmField
        public val emojis: String,
        @JvmField
        public val query: String,
        @JvmField
        public val inputLanguageCodes: Array<String>,
        @JvmField
        public val offset: Int,
        @JvmField
        public val limit: Int,
    ) : Function<Stickers>() {
        override fun getConstructor(): Int = -1_856_294_754
    }

    public class SearchStringsByPrefix(
        @JvmField
        public val strings: Array<String>,
        @JvmField
        public val query: String,
        @JvmField
        public val limit: Int,
        @JvmField
        public val returnNoneForEmptyQuery: Boolean,
    ) : Function<FoundPositions>() {
        override fun getConstructor(): Int = -2_023_251_463
    }

    public class SearchUserByPhoneNumber(
        @JvmField
        public val phoneNumber: String,
        @JvmField
        public val onlyLocal: Boolean,
    ) : Function<User>() {
        override fun getConstructor(): Int = -343_757_368
    }

    public class SearchUserByToken(
        @JvmField
        public val token: String,
    ) : Function<User>() {
        override fun getConstructor(): Int = -666_766_282
    }

    public class SearchWebApp(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val webAppShortName: String,
    ) : Function<FoundWebApp>() {
        override fun getConstructor(): Int = -1_241_740_747
    }

    public class SellGift(
        @JvmField
        public val businessConnectionId: String,
        @JvmField
        public val receivedGiftId: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -298_298_375
    }

    public class SendAuthenticationFirebaseSms(
        @JvmField
        public val token: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 364_994_111
    }

    public class SendBotStartMessage(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val chatId: Long,
        @JvmField
        public val parameter: String,
    ) : Function<Message>() {
        override fun getConstructor(): Int = -1_435_877_650
    }

    public class SendBusinessMessage(
        @JvmField
        public val businessConnectionId: String,
        @JvmField
        public val chatId: Long,
        @JvmField
        public val replyTo: InputMessageReplyTo?,
        @JvmField
        public val disableNotification: Boolean,
        @JvmField
        public val protectContent: Boolean,
        @JvmField
        public val effectId: Long,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
        @JvmField
        public val inputMessageContent: InputMessageContent,
    ) : Function<BusinessMessage>() {
        override fun getConstructor(): Int = 159_888_387
    }

    public class SendBusinessMessageAlbum(
        @JvmField
        public val businessConnectionId: String,
        @JvmField
        public val chatId: Long,
        @JvmField
        public val replyTo: InputMessageReplyTo?,
        @JvmField
        public val disableNotification: Boolean,
        @JvmField
        public val protectContent: Boolean,
        @JvmField
        public val effectId: Long,
        @JvmField
        public val inputMessageContents: Array<InputMessageContent>,
    ) : Function<BusinessMessages>() {
        override fun getConstructor(): Int = 788_608_366
    }

    public class SendCallDebugInformation(
        @JvmField
        public val callId: Int,
        @JvmField
        public val debugInformation: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 2_019_243_839
    }

    public class SendCallLog(
        @JvmField
        public val callId: Int,
        @JvmField
        public val logFile: InputFile,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_057_638_353
    }

    public class SendCallRating(
        @JvmField
        public val callId: Int,
        @JvmField
        public val rating: Int,
        @JvmField
        public val comment: String,
        @JvmField
        public val problems: Array<CallProblem>,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_402_719_502
    }

    public class SendCallSignalingData(
        @JvmField
        public val callId: Int,
        @JvmField
        public val data: ByteArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_412_280_732
    }

    public class SendChatAction(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageThreadId: Long,
        @JvmField
        public val businessConnectionId: String,
        @JvmField
        public val action: ChatAction?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_010_910_050
    }

    public class SendCustomRequest(
        @JvmField
        public val method: String,
        @JvmField
        public val parameters: String,
    ) : Function<CustomRequestResult>() {
        override fun getConstructor(): Int = 285_045_153
    }

    public class SendEmailAddressVerificationCode(
        @JvmField
        public val emailAddress: String,
    ) : Function<EmailAddressAuthenticationCodeInfo>() {
        override fun getConstructor(): Int = -221_621_379
    }

    public class SendGift(
        @JvmField
        public val giftId: Long,
        @JvmField
        public val ownerId: MessageSender,
        @JvmField
        public val text: FormattedText,
        @JvmField
        public val isPrivate: Boolean,
        @JvmField
        public val payForUpgrade: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_199_356_118
    }

    public class SendInlineQueryResultMessage(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageThreadId: Long,
        @JvmField
        public val replyTo: InputMessageReplyTo?,
        @JvmField
        public val options: MessageSendOptions?,
        @JvmField
        public val queryId: Long,
        @JvmField
        public val resultId: String,
        @JvmField
        public val hideViaBot: Boolean,
    ) : Function<Message>() {
        override fun getConstructor(): Int = 1_182_553_208
    }

    public class SendMessage(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageThreadId: Long,
        @JvmField
        public val replyTo: InputMessageReplyTo?,
        @JvmField
        public val options: MessageSendOptions?,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
        @JvmField
        public val inputMessageContent: InputMessageContent,
    ) : Function<Message>() {
        override fun getConstructor(): Int = -533_921_303
    }

    public class SendMessageAlbum(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageThreadId: Long,
        @JvmField
        public val replyTo: InputMessageReplyTo?,
        @JvmField
        public val options: MessageSendOptions?,
        @JvmField
        public val inputMessageContents: Array<InputMessageContent>,
    ) : Function<Messages>() {
        override fun getConstructor(): Int = -1_985_013_029
    }

    public class SendPassportAuthorizationForm(
        @JvmField
        public val authorizationFormId: Int,
        @JvmField
        public val types: Array<PassportElementType>,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 652_160_701
    }

    public class SendPaymentForm(
        @JvmField
        public val inputInvoice: InputInvoice,
        @JvmField
        public val paymentFormId: Long,
        @JvmField
        public val orderInfoId: String,
        @JvmField
        public val shippingOptionId: String,
        @JvmField
        public val credentials: InputCredentials?,
        @JvmField
        public val tipAmount: Long,
    ) : Function<PaymentResult>() {
        override fun getConstructor(): Int = -965_855_094
    }

    public class SendPhoneNumberCode(
        @JvmField
        public val phoneNumber: String,
        @JvmField
        public val settings: PhoneNumberAuthenticationSettings?,
        @JvmField
        public val type: PhoneNumberCodeType,
    ) : Function<AuthenticationCodeInfo>() {
        override fun getConstructor(): Int = 1_084_112_144
    }

    public class SendPhoneNumberFirebaseSms(
        @JvmField
        public val token: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 261_910_660
    }

    public class SendQuickReplyShortcutMessages(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val shortcutId: Int,
        @JvmField
        public val sendingId: Int,
    ) : Function<Messages>() {
        override fun getConstructor(): Int = 232_068_765
    }

    public class SendWebAppCustomRequest(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val method: String,
        @JvmField
        public val parameters: String,
    ) : Function<CustomRequestResult>() {
        override fun getConstructor(): Int = 922_705_352
    }

    public class SendWebAppData(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val buttonText: String,
        @JvmField
        public val data: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_423_978_996
    }

    public class SetAccentColor(
        @JvmField
        public val accentColorId: Int,
        @JvmField
        public val backgroundCustomEmojiId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_669_974_841
    }

    public class SetAccountTtl(
        @JvmField
        public val ttl: AccountTtl,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 701_389_032
    }

    public class SetAlarm(
        @JvmField
        public val seconds: Double,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -873_497_067
    }

    public class SetApplicationVerificationToken(
        @JvmField
        public val verificationId: Long,
        @JvmField
        public val token: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 927_248_261
    }

    public class SetArchiveChatListSettings(
        @JvmField
        public val settings: ArchiveChatListSettings,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -884_650_998
    }

    public class SetAuthenticationEmailAddress(
        @JvmField
        public val emailAddress: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_773_323_522
    }

    public class SetAuthenticationPhoneNumber(
        @JvmField
        public val phoneNumber: String,
        @JvmField
        public val settings: PhoneNumberAuthenticationSettings?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 868_276_259
    }

    public class SetAuthenticationPremiumPurchaseTransaction(
        @JvmField
        public val transaction: StoreTransaction,
        @JvmField
        public val isRestore: Boolean,
        @JvmField
        public val currency: String,
        @JvmField
        public val amount: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -450_986_887
    }

    public class SetAutoDownloadSettings(
        @JvmField
        public val settings: AutoDownloadSettings,
        @JvmField
        public val type: NetworkType,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -353_671_948
    }

    public class SetAutosaveSettings(
        @JvmField
        public val scope: AutosaveSettingsScope,
        @JvmField
        public val settings: ScopeAutosaveSettings?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 6_846_656
    }

    public class SetBio(
        @JvmField
        public val bio: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_619_582_124
    }

    public class SetBirthdate(
        @JvmField
        public val birthdate: Birthdate?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_319_755_160
    }

    public class SetBotInfoDescription(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val languageCode: String,
        @JvmField
        public val description: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 693_574_984
    }

    public class SetBotInfoShortDescription(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val languageCode: String,
        @JvmField
        public val shortDescription: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 982_956_771
    }

    public class SetBotName(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val languageCode: String,
        @JvmField
        public val name: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -761_922_959
    }

    public class SetBotProfilePhoto(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val photo: InputChatPhoto?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_115_272_346
    }

    public class SetBotUpdatesStatus(
        @JvmField
        public val pendingUpdateCount: Int,
        @JvmField
        public val errorMessage: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_154_926_191
    }

    public class SetBusinessAccountBio(
        @JvmField
        public val businessConnectionId: String,
        @JvmField
        public val bio: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_698_538_041
    }

    public class SetBusinessAccountGiftSettings(
        @JvmField
        public val businessConnectionId: String,
        @JvmField
        public val settings: GiftSettings,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_757_763_090
    }

    public class SetBusinessAccountName(
        @JvmField
        public val businessConnectionId: String,
        @JvmField
        public val firstName: String,
        @JvmField
        public val lastName: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 999_582_546
    }

    public class SetBusinessAccountProfilePhoto(
        @JvmField
        public val businessConnectionId: String,
        @JvmField
        public val photo: InputChatPhoto?,
        @JvmField
        public val isPublic: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_174_440_149
    }

    public class SetBusinessAccountUsername(
        @JvmField
        public val businessConnectionId: String,
        @JvmField
        public val username: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_520_126_367
    }

    public class SetBusinessAwayMessageSettings(
        @JvmField
        public val awayMessageSettings: BusinessAwayMessageSettings?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_232_357_484
    }

    public class SetBusinessConnectedBot(
        @JvmField
        public val bot: BusinessConnectedBot,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_393_459_472
    }

    public class SetBusinessGreetingMessageSettings(
        @JvmField
        public val greetingMessageSettings: BusinessGreetingMessageSettings?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -873_120_707
    }

    public class SetBusinessLocation(
        @JvmField
        public val location: BusinessLocation?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -344_717_547
    }

    public class SetBusinessMessageIsPinned(
        @JvmField
        public val businessConnectionId: String,
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val isPinned: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -15_403_536
    }

    public class SetBusinessOpeningHours(
        @JvmField
        public val openingHours: BusinessOpeningHours?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -462_379_918
    }

    public class SetBusinessStartPage(
        @JvmField
        public val startPage: InputBusinessStartPage?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_628_616_290
    }

    public class SetChatAccentColor(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val accentColorId: Int,
        @JvmField
        public val backgroundCustomEmojiId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 882_857_930
    }

    public class SetChatActiveStoriesList(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val storyList: StoryList,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -521_970_415
    }

    public class SetChatAffiliateProgram(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val parameters: AffiliateProgramParameters?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 14_680_631
    }

    public class SetChatAvailableReactions(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val availableReactions: ChatAvailableReactions,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 267_075_078
    }

    public class SetChatBackground(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val background: InputBackground?,
        @JvmField
        public val type: BackgroundType?,
        @JvmField
        public val darkThemeDimming: Int,
        @JvmField
        public val onlyForSelf: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 246_727_678
    }

    public class SetChatClientData(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val clientData: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -827_119_811
    }

    public class SetChatDescription(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val description: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_957_213_277
    }

    public class SetChatDiscussionGroup(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val discussionChatId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -918_801_736
    }

    public class SetChatDraftMessage(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageThreadId: Long,
        @JvmField
        public val draftMessage: DraftMessage?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_683_889_946
    }

    public class SetChatEmojiStatus(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val emojiStatus: EmojiStatus?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_434_982_674
    }

    public class SetChatLocation(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val location: ChatLocation,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -767_091_286
    }

    public class SetChatMemberStatus(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val memberId: MessageSender,
        @JvmField
        public val status: ChatMemberStatus,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 81_794_847
    }

    public class SetChatMessageAutoDeleteTime(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageAutoDeleteTime: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_505_643_265
    }

    public class SetChatMessageSender(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageSenderId: MessageSender,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_421_513_858
    }

    public class SetChatNotificationSettings(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val notificationSettings: ChatNotificationSettings,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 777_199_614
    }

    public class SetChatPaidMessageStarCount(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val paidMessageStarCount: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_187_053_289
    }

    public class SetChatPermissions(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val permissions: ChatPermissions,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 2_138_507_006
    }

    public class SetChatPhoto(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val photo: InputChatPhoto?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -377_778_941
    }

    public class SetChatPinnedStories(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val storyIds: IntArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -669_062_355
    }

    public class SetChatProfileAccentColor(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val profileAccentColorId: Int,
        @JvmField
        public val profileBackgroundCustomEmojiId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_109_896_826
    }

    public class SetChatSlowModeDelay(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val slowModeDelay: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -540_350_914
    }

    public class SetChatTheme(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val themeName: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_895_234_925
    }

    public class SetChatTitle(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val title: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 164_282_047
    }

    public class SetCloseFriends(
        @JvmField
        public val userIds: LongArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_908_013_258
    }

    public class SetCommands(
        @JvmField
        public val scope: BotCommandScope?,
        @JvmField
        public val languageCode: String,
        @JvmField
        public val commands: Array<BotCommand>,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -907_165_606
    }

    public class SetCustomEmojiStickerSetThumbnail(
        @JvmField
        public val name: String,
        @JvmField
        public val customEmojiId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_122_836_246
    }

    public class SetCustomLanguagePack(
        @JvmField
        public val info: LanguagePackInfo,
        @JvmField
        public val strings: Array<LanguagePackString>,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -296_742_819
    }

    public class SetCustomLanguagePackString(
        @JvmField
        public val languagePackId: String,
        @JvmField
        public val newString: LanguagePackString,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_316_365_592
    }

    public class SetDatabaseEncryptionKey(
        @JvmField
        public val newEncryptionKey: ByteArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_204_599_371
    }

    public class SetDefaultBackground(
        @JvmField
        public val background: InputBackground?,
        @JvmField
        public val type: BackgroundType?,
        @JvmField
        public val forDarkTheme: Boolean,
    ) : Function<Background>() {
        override fun getConstructor(): Int = -1_982_748_511
    }

    public class SetDefaultChannelAdministratorRights(
        @JvmField
        public val defaultChannelAdministratorRights: ChatAdministratorRights?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -234_004_967
    }

    public class SetDefaultGroupAdministratorRights(
        @JvmField
        public val defaultGroupAdministratorRights: ChatAdministratorRights?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_700_231_016
    }

    public class SetDefaultMessageAutoDeleteTime(
        @JvmField
        public val messageAutoDeleteTime: MessageAutoDeleteTime,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_772_301_460
    }

    public class SetDefaultReactionType(
        @JvmField
        public val reactionType: ReactionType,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_694_730_813
    }

    public class SetEmojiStatus(
        @JvmField
        public val emojiStatus: EmojiStatus?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_829_224_867
    }

    public class SetFileGenerationProgress(
        @JvmField
        public val generationId: Long,
        @JvmField
        public val expectedSize: Long,
        @JvmField
        public val localPrefixSize: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_836_403_518
    }

    public class SetForumTopicNotificationSettings(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageThreadId: Long,
        @JvmField
        public val notificationSettings: ChatNotificationSettings,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 524_498_023
    }

    public class SetGameScore(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val editMessage: Boolean,
        @JvmField
        public val userId: Long,
        @JvmField
        public val score: Int,
        @JvmField
        public val force: Boolean,
    ) : Function<Message>() {
        override fun getConstructor(): Int = 2_127_359_430
    }

    public class SetGiftSettings(
        @JvmField
        public val settings: GiftSettings,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -519_330_046
    }

    public class SetGroupCallParticipantIsSpeaking(
        @JvmField
        public val groupCallId: Int,
        @JvmField
        public val audioSource: Int,
        @JvmField
        public val isSpeaking: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 927_506_917
    }

    public class SetGroupCallParticipantVolumeLevel(
        @JvmField
        public val groupCallId: Int,
        @JvmField
        public val participantId: MessageSender,
        @JvmField
        public val volumeLevel: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_753_769_944
    }

    public class SetInactiveSessionTtl(
        @JvmField
        public val inactiveSessionTtlDays: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_570_548_048
    }

    public class SetInlineGameScore(
        @JvmField
        public val inlineMessageId: String,
        @JvmField
        public val editMessage: Boolean,
        @JvmField
        public val userId: Long,
        @JvmField
        public val score: Int,
        @JvmField
        public val force: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -948_871_797
    }

    public class SetLogStream(
        @JvmField
        public val logStream: LogStream,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_364_199_535
    }

    public class SetLogTagVerbosityLevel(
        @JvmField
        public val tag: String,
        @JvmField
        public val newVerbosityLevel: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_095_589_738
    }

    public class SetLogVerbosityLevel(
        @JvmField
        public val newVerbosityLevel: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -303_429_678
    }

    public class SetLoginEmailAddress(
        @JvmField
        public val newLoginEmailAddress: String,
    ) : Function<EmailAddressAuthenticationCodeInfo>() {
        override fun getConstructor(): Int = 935_019_476
    }

    public class SetMenuButton(
        @JvmField
        public val userId: Long,
        @JvmField
        public val menuButton: BotMenuButton,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_269_841_599
    }

    public class SetMessageFactCheck(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val text: FormattedText?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -4_309_752
    }

    public class SetMessageReactions(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val reactionTypes: Array<ReactionType>,
        @JvmField
        public val isBig: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -372_524_900
    }

    public class SetMessageSenderBlockList(
        @JvmField
        public val senderId: MessageSender,
        @JvmField
        public val blockList: BlockList?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_987_355_503
    }

    public class SetMessageSenderBotVerification(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val verifiedId: MessageSender,
        @JvmField
        public val customDescription: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_262_364_086
    }

    public class SetName(
        @JvmField
        public val firstName: String,
        @JvmField
        public val lastName: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_711_693_584
    }

    public class SetNetworkType(
        @JvmField
        public val type: NetworkType?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -701_635_234
    }

    public class SetNewChatPrivacySettings(
        @JvmField
        public val settings: NewChatPrivacySettings,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_774_139_215
    }

    public class SetOption(
        @JvmField
        public val name: String,
        @JvmField
        public val value: OptionValue?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 2_114_670_322
    }

    public class SetPaidMessageReactionType(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val type: PaidReactionType,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -829_934_930
    }

    public class SetPassportElement(
        @JvmField
        public val element: InputPassportElement,
        @JvmField
        public val password: String,
    ) : Function<PassportElement>() {
        override fun getConstructor(): Int = 2_068_173_212
    }

    public class SetPassportElementErrors(
        @JvmField
        public val userId: Long,
        @JvmField
        public val errors: Array<InputPassportElementError>,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_056_754_881
    }

    public class SetPassword(
        @JvmField
        public val oldPassword: String,
        @JvmField
        public val newPassword: String,
        @JvmField
        public val newHint: String,
        @JvmField
        public val setRecoveryEmailAddress: Boolean,
        @JvmField
        public val newRecoveryEmailAddress: String,
    ) : Function<PasswordState>() {
        override fun getConstructor(): Int = -1_193_589_027
    }

    public class SetPersonalChat(
        @JvmField
        public val chatId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_068_782_668
    }

    public class SetPinnedChats(
        @JvmField
        public val chatList: ChatList,
        @JvmField
        public val chatIds: LongArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -695_640_000
    }

    public class SetPinnedForumTopics(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageThreadIds: LongArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -475_084_011
    }

    public class SetPinnedGifts(
        @JvmField
        public val ownerId: MessageSender,
        @JvmField
        public val receivedGiftIds: Array<String>,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_613_526_306
    }

    public class SetPinnedSavedMessagesTopics(
        @JvmField
        public val savedMessagesTopicIds: LongArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -194_818_924
    }

    public class SetPollAnswer(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val optionIds: IntArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_399_388_792
    }

    public class SetProfileAccentColor(
        @JvmField
        public val profileAccentColorId: Int,
        @JvmField
        public val profileBackgroundCustomEmojiId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_986_281_112
    }

    public class SetProfilePhoto(
        @JvmField
        public val photo: InputChatPhoto,
        @JvmField
        public val isPublic: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_048_260_627
    }

    public class SetQuickReplyShortcutName(
        @JvmField
        public val shortcutId: Int,
        @JvmField
        public val name: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 186_709_105
    }

    public class SetReactionNotificationSettings(
        @JvmField
        public val notificationSettings: ReactionNotificationSettings,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_186_124_949
    }

    public class SetReadDatePrivacySettings(
        @JvmField
        public val settings: ReadDatePrivacySettings,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 493_913_782
    }

    public class SetRecoveryEmailAddress(
        @JvmField
        public val password: String,
        @JvmField
        public val newRecoveryEmailAddress: String,
    ) : Function<PasswordState>() {
        override fun getConstructor(): Int = -1_981_836_385
    }

    public class SetSavedMessagesTagLabel(
        @JvmField
        public val tag: ReactionType,
        @JvmField
        public val label: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_338_323_696
    }

    public class SetScopeNotificationSettings(
        @JvmField
        public val scope: NotificationSettingsScope,
        @JvmField
        public val notificationSettings: ScopeNotificationSettings,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_049_984_966
    }

    public class SetStickerEmojis(
        @JvmField
        public val sticker: InputFile,
        @JvmField
        public val emojis: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -638_843_855
    }

    public class SetStickerKeywords(
        @JvmField
        public val sticker: InputFile,
        @JvmField
        public val keywords: Array<String>,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 137_223_565
    }

    public class SetStickerMaskPosition(
        @JvmField
        public val sticker: InputFile,
        @JvmField
        public val maskPosition: MaskPosition?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_202_280_912
    }

    public class SetStickerPositionInSet(
        @JvmField
        public val sticker: InputFile,
        @JvmField
        public val position: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 2_075_281_185
    }

    public class SetStickerSetThumbnail(
        @JvmField
        public val userId: Long,
        @JvmField
        public val name: String,
        @JvmField
        public val thumbnail: InputFile?,
        @JvmField
        public val format: StickerFormat?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_677_617_458
    }

    public class SetStickerSetTitle(
        @JvmField
        public val name: String,
        @JvmField
        public val title: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_693_004_706
    }

    public class SetStoryPrivacySettings(
        @JvmField
        public val storyId: Int,
        @JvmField
        public val privacySettings: StoryPrivacySettings,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -655_801_550
    }

    public class SetStoryReaction(
        @JvmField
        public val storyPosterChatId: Long,
        @JvmField
        public val storyId: Int,
        @JvmField
        public val reactionType: ReactionType?,
        @JvmField
        public val updateRecentReactions: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 250_731_529
    }

    public class SetSupergroupCustomEmojiStickerSet(
        @JvmField
        public val supergroupId: Long,
        @JvmField
        public val customEmojiStickerSetId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_328_894_639
    }

    public class SetSupergroupStickerSet(
        @JvmField
        public val supergroupId: Long,
        @JvmField
        public val stickerSetId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_056_344_215
    }

    public class SetSupergroupUnrestrictBoostCount(
        @JvmField
        public val supergroupId: Long,
        @JvmField
        public val unrestrictBoostCount: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 969_814_179
    }

    public class SetSupergroupUsername(
        @JvmField
        public val supergroupId: Long,
        @JvmField
        public val username: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_346_325_252
    }

    public class SetTdlibParameters(
        @JvmField
        public val useTestDc: Boolean,
        @JvmField
        public val databaseDirectory: String,
        @JvmField
        public val filesDirectory: String,
        @JvmField
        public val databaseEncryptionKey: ByteArray,
        @JvmField
        public val useFileDatabase: Boolean,
        @JvmField
        public val useChatInfoDatabase: Boolean,
        @JvmField
        public val useMessageDatabase: Boolean,
        @JvmField
        public val useSecretChats: Boolean,
        @JvmField
        public val apiId: Int,
        @JvmField
        public val apiHash: String,
        @JvmField
        public val systemLanguageCode: String,
        @JvmField
        public val deviceModel: String,
        @JvmField
        public val systemVersion: String,
        @JvmField
        public val applicationVersion: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -775_883_218
    }

    public class SetUserEmojiStatus(
        @JvmField
        public val userId: Long,
        @JvmField
        public val emojiStatus: EmojiStatus?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -451_519_541
    }

    public class SetUserPersonalProfilePhoto(
        @JvmField
        public val userId: Long,
        @JvmField
        public val photo: InputChatPhoto?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 464_136_438
    }

    public class SetUserPrivacySettingRules(
        @JvmField
        public val setting: UserPrivacySetting,
        @JvmField
        public val rules: UserPrivacySettingRules,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -473_812_741
    }

    public class SetUserSupportInfo(
        @JvmField
        public val userId: Long,
        @JvmField
        public val message: FormattedText,
    ) : Function<UserSupportInfo>() {
        override fun getConstructor(): Int = -2_088_986_621
    }

    public class SetUsername(
        @JvmField
        public val username: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 439_901_214
    }

    public class SetVideoChatDefaultParticipant(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val defaultParticipantId: MessageSender,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -240_749_901
    }

    public class SetVideoChatTitle(
        @JvmField
        public val groupCallId: Int,
        @JvmField
        public val title: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_915_482_994
    }

    public class ShareChatWithBot(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val buttonId: Int,
        @JvmField
        public val sharedChatId: Long,
        @JvmField
        public val onlyCheck: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_504_507_166
    }

    public class SharePhoneNumber(
        @JvmField
        public val userId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_097_130_069
    }

    public class ShareUsersWithBot(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val buttonId: Int,
        @JvmField
        public val sharedUserIds: LongArray,
        @JvmField
        public val onlyCheck: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_574_608_333
    }

    public class StartGroupCallRecording(
        @JvmField
        public val groupCallId: Int,
        @JvmField
        public val title: String,
        @JvmField
        public val recordVideo: Boolean,
        @JvmField
        public val usePortraitOrientation: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_757_774_971
    }

    public class StartGroupCallScreenSharing(
        @JvmField
        public val groupCallId: Int,
        @JvmField
        public val audioSourceId: Int,
        @JvmField
        public val payload: String,
    ) : Function<Text>() {
        override fun getConstructor(): Int = -884_068_051
    }

    public class StartScheduledVideoChat(
        @JvmField
        public val groupCallId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_300_829_822
    }

    public class StopBusinessPoll(
        @JvmField
        public val businessConnectionId: String,
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
    ) : Function<BusinessMessage>() {
        override fun getConstructor(): Int = -1_142_218_400
    }

    public class StopPoll(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val replyMarkup: ReplyMarkup?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_659_374_253
    }

    public class SuggestUserProfilePhoto(
        @JvmField
        public val userId: Long,
        @JvmField
        public val photo: InputChatPhoto,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_788_742_557
    }

    public class SynchronizeLanguagePack(
        @JvmField
        public val languagePackId: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_065_307_858
    }

    public class TerminateAllOtherSessions() : Function<Ok>() {
        override fun getConstructor(): Int = 1_874_485_523
    }

    public class TerminateSession(
        @JvmField
        public val sessionId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -407_385_812
    }

    public class TestCallBytes(
        @JvmField
        public val x: ByteArray,
    ) : Function<TestBytes>() {
        override fun getConstructor(): Int = -736_011_607
    }

    public class TestCallEmpty() : Function<Ok>() {
        override fun getConstructor(): Int = -627_291_626
    }

    public class TestCallString(
        @JvmField
        public val x: String,
    ) : Function<TestString>() {
        override fun getConstructor(): Int = -1_732_818_385
    }

    public class TestCallVectorInt(
        @JvmField
        public val x: IntArray,
    ) : Function<TestVectorInt>() {
        override fun getConstructor(): Int = -2_137_277_793
    }

    public class TestCallVectorIntObject(
        @JvmField
        public val x: Array<TestInt>,
    ) : Function<TestVectorIntObject>() {
        override fun getConstructor(): Int = 1_825_428_218
    }

    public class TestCallVectorString(
        @JvmField
        public val x: Array<String>,
    ) : Function<TestVectorString>() {
        override fun getConstructor(): Int = -408_600_900
    }

    public class TestCallVectorStringObject(
        @JvmField
        public val x: Array<TestString>,
    ) : Function<TestVectorStringObject>() {
        override fun getConstructor(): Int = 1_527_666_429
    }

    public class TestGetDifference() : Function<Ok>() {
        override fun getConstructor(): Int = 1_747_084_069
    }

    public class TestNetwork() : Function<Ok>() {
        override fun getConstructor(): Int = -1_343_998_901
    }

    public class TestProxy(
        @JvmField
        public val server: String,
        @JvmField
        public val port: Int,
        @JvmField
        public val type: ProxyType,
        @JvmField
        public val dcId: Int,
        @JvmField
        public val timeout: Double,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_197_366_626
    }

    public class TestReturnError(
        @JvmField
        public val error: Error,
    ) : Function<Error>() {
        override fun getConstructor(): Int = 455_179_506
    }

    public class TestSquareInt(
        @JvmField
        public val x: Int,
    ) : Function<TestInt>() {
        override fun getConstructor(): Int = -60_135_024
    }

    public class TestUseUpdate() : Function<Update>() {
        override fun getConstructor(): Int = 717_094_686
    }

    public class ToggleAllDownloadsArePaused(
        @JvmField
        public val arePaused: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_251_512_322
    }

    public class ToggleBotCanManageEmojiStatus(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val canManageEmojiStatus: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 622_495_770
    }

    public class ToggleBotIsAddedToAttachmentMenu(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val isAdded: Boolean,
        @JvmField
        public val allowWriteAccess: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_906_712_934
    }

    public class ToggleBotUsernameIsActive(
        @JvmField
        public val botUserId: Long,
        @JvmField
        public val username: String,
        @JvmField
        public val isActive: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 2_036_569_097
    }

    public class ToggleBusinessConnectedBotChatIsPaused(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val isPaused: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_328_957_509
    }

    public class ToggleChatDefaultDisableNotification(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val defaultDisableNotification: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 314_794_002
    }

    public class ToggleChatFolderTags(
        @JvmField
        public val areTagsEnabled: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_092_209_084
    }

    public class ToggleChatGiftNotifications(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val areEnabled: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_069_429_154
    }

    public class ToggleChatHasProtectedContent(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val hasProtectedContent: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 975_231_309
    }

    public class ToggleChatIsMarkedAsUnread(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val isMarkedAsUnread: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -986_129_697
    }

    public class ToggleChatIsPinned(
        @JvmField
        public val chatList: ChatList,
        @JvmField
        public val chatId: Long,
        @JvmField
        public val isPinned: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_485_429_186
    }

    public class ToggleChatIsTranslatable(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val isTranslatable: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_812_345_889
    }

    public class ToggleChatViewAsTopics(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val viewAsTopics: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 724_009_948
    }

    public class ToggleDownloadIsPaused(
        @JvmField
        public val fileId: Int,
        @JvmField
        public val isPaused: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -947_493_099
    }

    public class ToggleForumTopicIsClosed(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageThreadId: Long,
        @JvmField
        public val isClosed: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -949_712_141
    }

    public class ToggleForumTopicIsPinned(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageThreadId: Long,
        @JvmField
        public val isPinned: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_181_543_092
    }

    public class ToggleGeneralForumTopicIsHidden(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val isHidden: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_595_741_256
    }

    public class ToggleGiftIsSaved(
        @JvmField
        public val receivedGiftId: String,
        @JvmField
        public val isSaved: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 693_198_065
    }

    public class ToggleGroupCallIsMyVideoEnabled(
        @JvmField
        public val groupCallId: Int,
        @JvmField
        public val isMyVideoEnabled: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_624_289_030
    }

    public class ToggleGroupCallIsMyVideoPaused(
        @JvmField
        public val groupCallId: Int,
        @JvmField
        public val isMyVideoPaused: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -478_875_239
    }

    public class ToggleGroupCallParticipantIsHandRaised(
        @JvmField
        public val groupCallId: Int,
        @JvmField
        public val participantId: MessageSender,
        @JvmField
        public val isHandRaised: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_896_127_519
    }

    public class ToggleGroupCallParticipantIsMuted(
        @JvmField
        public val groupCallId: Int,
        @JvmField
        public val participantId: MessageSender,
        @JvmField
        public val isMuted: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_308_093_433
    }

    public class ToggleGroupCallScreenSharingIsPaused(
        @JvmField
        public val groupCallId: Int,
        @JvmField
        public val isPaused: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_602_530_464
    }

    public class ToggleHasSponsoredMessagesEnabled(
        @JvmField
        public val hasSponsoredMessagesEnabled: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_963_285_740
    }

    public class ToggleSavedMessagesTopicIsPinned(
        @JvmField
        public val savedMessagesTopicId: Long,
        @JvmField
        public val isPinned: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_588_378_164
    }

    public class ToggleSessionCanAcceptCalls(
        @JvmField
        public val sessionId: Long,
        @JvmField
        public val canAcceptCalls: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_819_027_208
    }

    public class ToggleSessionCanAcceptSecretChats(
        @JvmField
        public val sessionId: Long,
        @JvmField
        public val canAcceptSecretChats: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_000_843_390
    }

    public class ToggleStoryIsPostedToChatPage(
        @JvmField
        public val storyPosterChatId: Long,
        @JvmField
        public val storyId: Int,
        @JvmField
        public val isPostedToChatPage: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_141_806_228
    }

    public class ToggleSupergroupCanHaveSponsoredMessages(
        @JvmField
        public val supergroupId: Long,
        @JvmField
        public val canHaveSponsoredMessages: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_098_204_302
    }

    public class ToggleSupergroupHasAggressiveAntiSpamEnabled(
        @JvmField
        public val supergroupId: Long,
        @JvmField
        public val hasAggressiveAntiSpamEnabled: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_748_956_943
    }

    public class ToggleSupergroupHasHiddenMembers(
        @JvmField
        public val supergroupId: Long,
        @JvmField
        public val hasHiddenMembers: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_537_892_918
    }

    public class ToggleSupergroupIsAllHistoryAvailable(
        @JvmField
        public val supergroupId: Long,
        @JvmField
        public val isAllHistoryAvailable: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_155_110_478
    }

    public class ToggleSupergroupIsBroadcastGroup(
        @JvmField
        public val supergroupId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 884_089_365
    }

    public class ToggleSupergroupIsForum(
        @JvmField
        public val supergroupId: Long,
        @JvmField
        public val isForum: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_771_071_990
    }

    public class ToggleSupergroupJoinByRequest(
        @JvmField
        public val supergroupId: Long,
        @JvmField
        public val joinByRequest: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 2_111_807_454
    }

    public class ToggleSupergroupJoinToSendMessages(
        @JvmField
        public val supergroupId: Long,
        @JvmField
        public val joinToSendMessages: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -182_022_642
    }

    public class ToggleSupergroupSignMessages(
        @JvmField
        public val supergroupId: Long,
        @JvmField
        public val signMessages: Boolean,
        @JvmField
        public val showMessageSender: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 572_268_491
    }

    public class ToggleSupergroupUsernameIsActive(
        @JvmField
        public val supergroupId: Long,
        @JvmField
        public val username: String,
        @JvmField
        public val isActive: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_500_811_777
    }

    public class ToggleUsernameIsActive(
        @JvmField
        public val username: String,
        @JvmField
        public val isActive: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_244_098_019
    }

    public class ToggleVideoChatEnabledStartNotification(
        @JvmField
        public val groupCallId: Int,
        @JvmField
        public val enabledStartNotification: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_851_489_086
    }

    public class ToggleVideoChatMuteNewParticipants(
        @JvmField
        public val groupCallId: Int,
        @JvmField
        public val muteNewParticipants: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 987_023_756
    }

    public class TransferBusinessAccountStars(
        @JvmField
        public val businessConnectionId: String,
        @JvmField
        public val starCount: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 732_562_464
    }

    public class TransferChatOwnership(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val userId: Long,
        @JvmField
        public val password: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 2_006_977_043
    }

    public class TransferGift(
        @JvmField
        public val businessConnectionId: String,
        @JvmField
        public val receivedGiftId: String,
        @JvmField
        public val newOwnerId: MessageSender,
        @JvmField
        public val starCount: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_167_293_126
    }

    public class TranslateMessageText(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
        @JvmField
        public val toLanguageCode: String,
    ) : Function<FormattedText>() {
        override fun getConstructor(): Int = 1_405_427_410
    }

    public class TranslateText(
        @JvmField
        public val text: FormattedText,
        @JvmField
        public val toLanguageCode: String,
    ) : Function<FormattedText>() {
        override fun getConstructor(): Int = 623_011_058
    }

    public class UnpinAllChatMessages(
        @JvmField
        public val chatId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_437_805_385
    }

    public class UnpinAllMessageThreadMessages(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageThreadId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_211_719_936
    }

    public class UnpinChatMessage(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 2_065_448_670
    }

    public class UpgradeBasicGroupChatToSupergroupChat(
        @JvmField
        public val chatId: Long,
    ) : Function<Chat>() {
        override fun getConstructor(): Int = 300_488_122
    }

    public class UpgradeGift(
        @JvmField
        public val businessConnectionId: String,
        @JvmField
        public val receivedGiftId: String,
        @JvmField
        public val keepOriginalDetails: Boolean,
        @JvmField
        public val starCount: Long,
    ) : Function<UpgradeGiftResult>() {
        override fun getConstructor(): Int = -1_782_136_103
    }

    public class UploadStickerFile(
        @JvmField
        public val userId: Long,
        @JvmField
        public val stickerFormat: StickerFormat,
        @JvmField
        public val sticker: InputFile,
    ) : Function<File>() {
        override fun getConstructor(): Int = 647_385_283
    }

    public class ValidateOrderInfo(
        @JvmField
        public val inputInvoice: InputInvoice,
        @JvmField
        public val orderInfo: OrderInfo?,
        @JvmField
        public val allowSave: Boolean,
    ) : Function<ValidatedOrderInfo>() {
        override fun getConstructor(): Int = -1_248_305_201
    }

    public class ViewMessages(
        @JvmField
        public val chatId: Long,
        @JvmField
        public val messageIds: LongArray,
        @JvmField
        public val source: MessageSource?,
        @JvmField
        public val forceRead: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 960_236_656
    }

    public class ViewPremiumFeature(
        @JvmField
        public val feature: PremiumFeature,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 192_950_706
    }

    public class ViewSponsoredChat(
        @JvmField
        public val sponsoredChatUniqueId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_722_644_778
    }

    public class ViewTrendingStickerSets(
        @JvmField
        public val stickerSetIds: LongArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -952_416_520
    }

    public class WriteGeneratedFilePart(
        @JvmField
        public val generationId: Long,
        @JvmField
        public val offset: Long,
        @JvmField
        public val data: ByteArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 214_474_389
    }
}
