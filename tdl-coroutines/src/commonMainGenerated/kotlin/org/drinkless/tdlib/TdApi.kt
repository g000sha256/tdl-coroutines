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
    companion object {
        const val GIT_COMMIT_HASH: String = "bb474a201baa798784d696d2d9d762a9d2807f96"

        const val VERSION: String = "1.8.51"
    }

    abstract class Object {
        external override fun toString(): String

        abstract fun getConstructor(): Int
    }

    abstract class Function<T : Object> : Object() {
        external override fun toString(): String
    }

    class AccentColor(
        @JvmField
        val id: Int,
        @JvmField
        val builtInAccentColorId: Int,
        @JvmField
        val lightThemeColors: IntArray,
        @JvmField
        val darkThemeColors: IntArray,
        @JvmField
        val minChannelChatBoostLevel: Int,
    ) : Object() {
        override fun getConstructor(): Int = -496_870_680
    }

    class AcceptedGiftTypes(
        @JvmField
        val unlimitedGifts: Boolean,
        @JvmField
        val limitedGifts: Boolean,
        @JvmField
        val upgradedGifts: Boolean,
        @JvmField
        val premiumSubscription: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_783_521_300
    }

    class AccountInfo(
        @JvmField
        val registrationMonth: Int,
        @JvmField
        val registrationYear: Int,
        @JvmField
        val phoneNumberCountryCode: String,
        @JvmField
        val lastNameChangeDate: Int,
        @JvmField
        val lastPhotoChangeDate: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_803_492_711
    }

    class AccountTtl(
        @JvmField
        val days: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_324_495_492
    }

    class AddedReaction(
        @JvmField
        val type: ReactionType,
        @JvmField
        val senderId: MessageSender,
        @JvmField
        val isOutgoing: Boolean,
        @JvmField
        val date: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_258_586_525
    }

    class AddedReactions(
        @JvmField
        val totalCount: Int,
        @JvmField
        val reactions: Array<AddedReaction>,
        @JvmField
        val nextOffset: String,
    ) : Object() {
        override fun getConstructor(): Int = 226_352_304
    }

    class Address(
        @JvmField
        val countryCode: String,
        @JvmField
        val state: String,
        @JvmField
        val city: String,
        @JvmField
        val streetLine1: String,
        @JvmField
        val streetLine2: String,
        @JvmField
        val postalCode: String,
    ) : Object() {
        override fun getConstructor(): Int = -2_043_654_342
    }

    class AdvertisementSponsor(
        @JvmField
        val url: String,
        @JvmField
        val photo: Photo?,
        @JvmField
        val info: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_388_914_159
    }

    class AffiliateInfo(
        @JvmField
        val commissionPerMille: Int,
        @JvmField
        val affiliateChatId: Long,
        @JvmField
        val starAmount: StarAmount,
    ) : Object() {
        override fun getConstructor(): Int = -1_312_695_046
    }

    class AffiliateProgramInfo(
        @JvmField
        val parameters: AffiliateProgramParameters,
        @JvmField
        val endDate: Int,
        @JvmField
        val dailyRevenuePerUserAmount: StarAmount,
    ) : Object() {
        override fun getConstructor(): Int = -1_761_810_251
    }

    class AffiliateProgramParameters(
        @JvmField
        val commissionPerMille: Int,
        @JvmField
        val monthCount: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_642_662_996
    }

    abstract class AffiliateProgramSortOrder : Object()

    class AffiliateProgramSortOrderProfitability : AffiliateProgramSortOrder() {
        override fun getConstructor(): Int = -1_963_282_585
    }

    class AffiliateProgramSortOrderCreationDate : AffiliateProgramSortOrder() {
        override fun getConstructor(): Int = -1_558_628_083
    }

    class AffiliateProgramSortOrderRevenue : AffiliateProgramSortOrder() {
        override fun getConstructor(): Int = 1_923_269_304
    }

    abstract class AffiliateType : Object()

    class AffiliateTypeCurrentUser : AffiliateType() {
        override fun getConstructor(): Int = 1_453_785_589
    }

    class AffiliateTypeBot(
        @JvmField
        val userId: Long,
    ) : AffiliateType() {
        override fun getConstructor(): Int = -1_032_587_200
    }

    class AffiliateTypeChannel(
        @JvmField
        val chatId: Long,
    ) : AffiliateType() {
        override fun getConstructor(): Int = -683_939_735
    }

    class AlternativeVideo(
        @JvmField
        val id: Long,
        @JvmField
        val width: Int,
        @JvmField
        val height: Int,
        @JvmField
        val codec: String,
        @JvmField
        val hlsFile: File,
        @JvmField
        val video: File,
    ) : Object() {
        override fun getConstructor(): Int = 483_379_470
    }

    class AnimatedChatPhoto(
        @JvmField
        val length: Int,
        @JvmField
        val file: File,
        @JvmField
        val mainFrameTimestamp: Double,
    ) : Object() {
        override fun getConstructor(): Int = 191_994_926
    }

    class AnimatedEmoji(
        @JvmField
        val sticker: Sticker?,
        @JvmField
        val stickerWidth: Int,
        @JvmField
        val stickerHeight: Int,
        @JvmField
        val fitzpatrickType: Int,
        @JvmField
        val sound: File?,
    ) : Object() {
        override fun getConstructor(): Int = 1_378_918_079
    }

    class Animation(
        @JvmField
        val duration: Int,
        @JvmField
        val width: Int,
        @JvmField
        val height: Int,
        @JvmField
        val fileName: String,
        @JvmField
        val mimeType: String,
        @JvmField
        val hasStickers: Boolean,
        @JvmField
        val minithumbnail: Minithumbnail?,
        @JvmField
        val thumbnail: Thumbnail?,
        @JvmField
        val animation: File,
    ) : Object() {
        override fun getConstructor(): Int = -872_359_106
    }

    class Animations(
        @JvmField
        val animations: Array<Animation>,
    ) : Object() {
        override fun getConstructor(): Int = 344_216_945
    }

    class ArchiveChatListSettings(
        @JvmField
        val archiveAndMuteNewChatsFromUnknownUsers: Boolean,
        @JvmField
        val keepUnmutedChatsArchived: Boolean,
        @JvmField
        val keepChatsFromFoldersArchived: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_058_499_236
    }

    class AttachmentMenuBot(
        @JvmField
        val botUserId: Long,
        @JvmField
        val supportsSelfChat: Boolean,
        @JvmField
        val supportsUserChats: Boolean,
        @JvmField
        val supportsBotChats: Boolean,
        @JvmField
        val supportsGroupChats: Boolean,
        @JvmField
        val supportsChannelChats: Boolean,
        @JvmField
        val requestWriteAccess: Boolean,
        @JvmField
        val isAdded: Boolean,
        @JvmField
        val showInAttachmentMenu: Boolean,
        @JvmField
        val showInSideMenu: Boolean,
        @JvmField
        val showDisclaimerInSideMenu: Boolean,
        @JvmField
        val name: String,
        @JvmField
        val nameColor: AttachmentMenuBotColor?,
        @JvmField
        val defaultIcon: File?,
        @JvmField
        val iosStaticIcon: File?,
        @JvmField
        val iosAnimatedIcon: File?,
        @JvmField
        val iosSideMenuIcon: File?,
        @JvmField
        val androidIcon: File?,
        @JvmField
        val androidSideMenuIcon: File?,
        @JvmField
        val macosIcon: File?,
        @JvmField
        val macosSideMenuIcon: File?,
        @JvmField
        val iconColor: AttachmentMenuBotColor?,
        @JvmField
        val webAppPlaceholder: File?,
    ) : Object() {
        override fun getConstructor(): Int = -1_183_966_273
    }

    class AttachmentMenuBotColor(
        @JvmField
        val lightColor: Int,
        @JvmField
        val darkColor: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_680_039_612
    }

    class Audio(
        @JvmField
        val duration: Int,
        @JvmField
        val title: String,
        @JvmField
        val performer: String,
        @JvmField
        val fileName: String,
        @JvmField
        val mimeType: String,
        @JvmField
        val albumCoverMinithumbnail: Minithumbnail?,
        @JvmField
        val albumCoverThumbnail: Thumbnail?,
        @JvmField
        val externalAlbumCovers: Array<Thumbnail>,
        @JvmField
        val audio: File,
    ) : Object() {
        override fun getConstructor(): Int = -166_398_841
    }

    class AuthenticationCodeInfo(
        @JvmField
        val phoneNumber: String,
        @JvmField
        val type: AuthenticationCodeType,
        @JvmField
        val nextType: AuthenticationCodeType?,
        @JvmField
        val timeout: Int,
    ) : Object() {
        override fun getConstructor(): Int = -860_345_416
    }

    abstract class AuthenticationCodeType : Object()

    class AuthenticationCodeTypeTelegramMessage(
        @JvmField
        val length: Int,
    ) : AuthenticationCodeType() {
        override fun getConstructor(): Int = 2_079_628_074
    }

    class AuthenticationCodeTypeSms(
        @JvmField
        val length: Int,
    ) : AuthenticationCodeType() {
        override fun getConstructor(): Int = 962_650_760
    }

    class AuthenticationCodeTypeSmsWord(
        @JvmField
        val firstLetter: String,
    ) : AuthenticationCodeType() {
        override fun getConstructor(): Int = -1_509_540_765
    }

    class AuthenticationCodeTypeSmsPhrase(
        @JvmField
        val firstWord: String,
    ) : AuthenticationCodeType() {
        override fun getConstructor(): Int = 784_108_753
    }

    class AuthenticationCodeTypeCall(
        @JvmField
        val length: Int,
    ) : AuthenticationCodeType() {
        override fun getConstructor(): Int = 1_636_265_063
    }

    class AuthenticationCodeTypeFlashCall(
        @JvmField
        val pattern: String,
    ) : AuthenticationCodeType() {
        override fun getConstructor(): Int = 1_395_882_402
    }

    class AuthenticationCodeTypeMissedCall(
        @JvmField
        val phoneNumberPrefix: String,
        @JvmField
        val length: Int,
    ) : AuthenticationCodeType() {
        override fun getConstructor(): Int = 700_123_783
    }

    class AuthenticationCodeTypeFragment(
        @JvmField
        val url: String,
        @JvmField
        val length: Int,
    ) : AuthenticationCodeType() {
        override fun getConstructor(): Int = -2_129_693_491
    }

    class AuthenticationCodeTypeFirebaseAndroid(
        @JvmField
        val deviceVerificationParameters: FirebaseDeviceVerificationParameters,
        @JvmField
        val length: Int,
    ) : AuthenticationCodeType() {
        override fun getConstructor(): Int = 1_872_475_422
    }

    class AuthenticationCodeTypeFirebaseIos(
        @JvmField
        val receipt: String,
        @JvmField
        val pushTimeout: Int,
        @JvmField
        val length: Int,
    ) : AuthenticationCodeType() {
        override fun getConstructor(): Int = -11_162_989
    }

    abstract class AuthorizationState : Object()

    class AuthorizationStateWaitTdlibParameters : AuthorizationState() {
        override fun getConstructor(): Int = 904_720_988
    }

    class AuthorizationStateWaitPhoneNumber : AuthorizationState() {
        override fun getConstructor(): Int = 306_402_531
    }

    class AuthorizationStateWaitPremiumPurchase(
        @JvmField
        val storeProductId: String,
    ) : AuthorizationState() {
        override fun getConstructor(): Int = -862_487_743
    }

    class AuthorizationStateWaitEmailAddress(
        @JvmField
        val allowAppleId: Boolean,
        @JvmField
        val allowGoogleId: Boolean,
    ) : AuthorizationState() {
        override fun getConstructor(): Int = 1_040_478_663
    }

    class AuthorizationStateWaitEmailCode(
        @JvmField
        val allowAppleId: Boolean,
        @JvmField
        val allowGoogleId: Boolean,
        @JvmField
        val codeInfo: EmailAddressAuthenticationCodeInfo,
        @JvmField
        val emailAddressResetState: EmailAddressResetState?,
    ) : AuthorizationState() {
        override fun getConstructor(): Int = -1_868_627_365
    }

    class AuthorizationStateWaitCode(
        @JvmField
        val codeInfo: AuthenticationCodeInfo,
    ) : AuthorizationState() {
        override fun getConstructor(): Int = 52_643_073
    }

    class AuthorizationStateWaitOtherDeviceConfirmation(
        @JvmField
        val link: String,
    ) : AuthorizationState() {
        override fun getConstructor(): Int = 860_166_378
    }

    class AuthorizationStateWaitRegistration(
        @JvmField
        val termsOfService: TermsOfService,
    ) : AuthorizationState() {
        override fun getConstructor(): Int = 550_350_511
    }

    class AuthorizationStateWaitPassword(
        @JvmField
        val passwordHint: String,
        @JvmField
        val hasRecoveryEmailAddress: Boolean,
        @JvmField
        val hasPassportData: Boolean,
        @JvmField
        val recoveryEmailAddressPattern: String,
    ) : AuthorizationState() {
        override fun getConstructor(): Int = 112_238_030
    }

    class AuthorizationStateReady : AuthorizationState() {
        override fun getConstructor(): Int = -1_834_871_737
    }

    class AuthorizationStateLoggingOut : AuthorizationState() {
        override fun getConstructor(): Int = 154_449_270
    }

    class AuthorizationStateClosing : AuthorizationState() {
        override fun getConstructor(): Int = 445_855_311
    }

    class AuthorizationStateClosed : AuthorizationState() {
        override fun getConstructor(): Int = 1_526_047_584
    }

    class AutoDownloadSettings(
        @JvmField
        val isAutoDownloadEnabled: Boolean,
        @JvmField
        val maxPhotoFileSize: Int,
        @JvmField
        val maxVideoFileSize: Long,
        @JvmField
        val maxOtherFileSize: Long,
        @JvmField
        val videoUploadBitrate: Int,
        @JvmField
        val preloadLargeVideos: Boolean,
        @JvmField
        val preloadNextAudio: Boolean,
        @JvmField
        val preloadStories: Boolean,
        @JvmField
        val useLessDataForCalls: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 991_433_696
    }

    class AutoDownloadSettingsPresets(
        @JvmField
        val low: AutoDownloadSettings,
        @JvmField
        val medium: AutoDownloadSettings,
        @JvmField
        val high: AutoDownloadSettings,
    ) : Object() {
        override fun getConstructor(): Int = -782_099_166
    }

    class AutosaveSettings(
        @JvmField
        val privateChatSettings: ScopeAutosaveSettings,
        @JvmField
        val groupSettings: ScopeAutosaveSettings,
        @JvmField
        val channelSettings: ScopeAutosaveSettings,
        @JvmField
        val exceptions: Array<AutosaveSettingsException>,
    ) : Object() {
        override fun getConstructor(): Int = 1_629_412_502
    }

    class AutosaveSettingsException(
        @JvmField
        val chatId: Long,
        @JvmField
        val settings: ScopeAutosaveSettings,
    ) : Object() {
        override fun getConstructor(): Int = 1_483_470_280
    }

    abstract class AutosaveSettingsScope : Object()

    class AutosaveSettingsScopePrivateChats : AutosaveSettingsScope() {
        override fun getConstructor(): Int = 1_395_227_007
    }

    class AutosaveSettingsScopeGroupChats : AutosaveSettingsScope() {
        override fun getConstructor(): Int = 853_544_526
    }

    class AutosaveSettingsScopeChannelChats : AutosaveSettingsScope() {
        override fun getConstructor(): Int = -499_572_783
    }

    class AutosaveSettingsScopeChat(
        @JvmField
        val chatId: Long,
    ) : AutosaveSettingsScope() {
        override fun getConstructor(): Int = -1_632_255_255
    }

    class AvailableGift(
        @JvmField
        val gift: Gift,
        @JvmField
        val resaleCount: Int,
        @JvmField
        val minResaleStarCount: Long,
        @JvmField
        val title: String,
    ) : Object() {
        override fun getConstructor(): Int = 850_530_502
    }

    class AvailableGifts(
        @JvmField
        val gifts: Array<AvailableGift>,
    ) : Object() {
        override fun getConstructor(): Int = -1_450_341_886
    }

    class AvailableReaction(
        @JvmField
        val type: ReactionType,
        @JvmField
        val needsPremium: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -117_292_153
    }

    class AvailableReactions(
        @JvmField
        val topReactions: Array<AvailableReaction>,
        @JvmField
        val recentReactions: Array<AvailableReaction>,
        @JvmField
        val popularReactions: Array<AvailableReaction>,
        @JvmField
        val allowCustomEmoji: Boolean,
        @JvmField
        val areTags: Boolean,
        @JvmField
        val unavailabilityReason: ReactionUnavailabilityReason?,
    ) : Object() {
        override fun getConstructor(): Int = 912_529_522
    }

    class Background(
        @JvmField
        val id: Long,
        @JvmField
        val isDefault: Boolean,
        @JvmField
        val isDark: Boolean,
        @JvmField
        val name: String,
        @JvmField
        val document: Document?,
        @JvmField
        val type: BackgroundType,
    ) : Object() {
        override fun getConstructor(): Int = -429_971_172
    }

    abstract class BackgroundFill : Object()

    class BackgroundFillSolid(
        @JvmField
        val color: Int,
    ) : BackgroundFill() {
        override fun getConstructor(): Int = 1_010_678_813
    }

    class BackgroundFillGradient(
        @JvmField
        val topColor: Int,
        @JvmField
        val bottomColor: Int,
        @JvmField
        val rotationAngle: Int,
    ) : BackgroundFill() {
        override fun getConstructor(): Int = -1_839_206_017
    }

    class BackgroundFillFreeformGradient(
        @JvmField
        val colors: IntArray,
    ) : BackgroundFill() {
        override fun getConstructor(): Int = -1_145_469_255
    }

    abstract class BackgroundType : Object()

    class BackgroundTypeWallpaper(
        @JvmField
        val isBlurred: Boolean,
        @JvmField
        val isMoving: Boolean,
    ) : BackgroundType() {
        override fun getConstructor(): Int = 1_972_128_891
    }

    class BackgroundTypePattern(
        @JvmField
        val fill: BackgroundFill,
        @JvmField
        val intensity: Int,
        @JvmField
        val isInverted: Boolean,
        @JvmField
        val isMoving: Boolean,
    ) : BackgroundType() {
        override fun getConstructor(): Int = 1_290_213_117
    }

    class BackgroundTypeFill(
        @JvmField
        val fill: BackgroundFill,
    ) : BackgroundType() {
        override fun getConstructor(): Int = 993_008_684
    }

    class BackgroundTypeChatTheme(
        @JvmField
        val themeName: String,
    ) : BackgroundType() {
        override fun getConstructor(): Int = 1_299_879_762
    }

    class Backgrounds(
        @JvmField
        val backgrounds: Array<Background>,
    ) : Object() {
        override fun getConstructor(): Int = 724_728_704
    }

    class BankCardActionOpenUrl(
        @JvmField
        val text: String,
        @JvmField
        val url: String,
    ) : Object() {
        override fun getConstructor(): Int = -196_454_267
    }

    class BankCardInfo(
        @JvmField
        val title: String,
        @JvmField
        val actions: Array<BankCardActionOpenUrl>,
    ) : Object() {
        override fun getConstructor(): Int = -2_116_647_730
    }

    class BasicGroup(
        @JvmField
        val id: Long,
        @JvmField
        val memberCount: Int,
        @JvmField
        val status: ChatMemberStatus,
        @JvmField
        val isActive: Boolean,
        @JvmField
        val upgradedToSupergroupId: Long,
    ) : Object() {
        override fun getConstructor(): Int = -194_767_217
    }

    class BasicGroupFullInfo(
        @JvmField
        val photo: ChatPhoto?,
        @JvmField
        val description: String,
        @JvmField
        val creatorUserId: Long,
        @JvmField
        val members: Array<ChatMember>,
        @JvmField
        val canHideMembers: Boolean,
        @JvmField
        val canToggleAggressiveAntiSpam: Boolean,
        @JvmField
        val inviteLink: ChatInviteLink?,
        @JvmField
        val botCommands: Array<BotCommands>,
    ) : Object() {
        override fun getConstructor(): Int = -1_879_035_520
    }

    class Birthdate(
        @JvmField
        val day: Int,
        @JvmField
        val month: Int,
        @JvmField
        val year: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_644_064_030
    }

    abstract class BlockList : Object()

    class BlockListMain : BlockList() {
        override fun getConstructor(): Int = 1_352_930_172
    }

    class BlockListStories : BlockList() {
        override fun getConstructor(): Int = 103_323_228
    }

    class BotCommand(
        @JvmField
        val command: String,
        @JvmField
        val description: String,
    ) : Object() {
        override fun getConstructor(): Int = -1_032_140_601
    }

    abstract class BotCommandScope : Object()

    class BotCommandScopeDefault : BotCommandScope() {
        override fun getConstructor(): Int = 795_652_779
    }

    class BotCommandScopeAllPrivateChats : BotCommandScope() {
        override fun getConstructor(): Int = -344_889_543
    }

    class BotCommandScopeAllGroupChats : BotCommandScope() {
        override fun getConstructor(): Int = -981_088_162
    }

    class BotCommandScopeAllChatAdministrators : BotCommandScope() {
        override fun getConstructor(): Int = 1_998_329_169
    }

    class BotCommandScopeChat(
        @JvmField
        val chatId: Long,
    ) : BotCommandScope() {
        override fun getConstructor(): Int = -430_234_971
    }

    class BotCommandScopeChatAdministrators(
        @JvmField
        val chatId: Long,
    ) : BotCommandScope() {
        override fun getConstructor(): Int = 1_119_682_126
    }

    class BotCommandScopeChatMember(
        @JvmField
        val chatId: Long,
        @JvmField
        val userId: Long,
    ) : BotCommandScope() {
        override fun getConstructor(): Int = -211_380_494
    }

    class BotCommands(
        @JvmField
        val botUserId: Long,
        @JvmField
        val commands: Array<BotCommand>,
    ) : Object() {
        override fun getConstructor(): Int = 1_741_364_468
    }

    class BotInfo(
        @JvmField
        val shortDescription: String,
        @JvmField
        val description: String,
        @JvmField
        val photo: Photo?,
        @JvmField
        val animation: Animation?,
        @JvmField
        val menuButton: BotMenuButton?,
        @JvmField
        val commands: Array<BotCommand>,
        @JvmField
        val privacyPolicyUrl: String,
        @JvmField
        val defaultGroupAdministratorRights: ChatAdministratorRights?,
        @JvmField
        val defaultChannelAdministratorRights: ChatAdministratorRights?,
        @JvmField
        val affiliateProgram: AffiliateProgramInfo?,
        @JvmField
        val webAppBackgroundLightColor: Int,
        @JvmField
        val webAppBackgroundDarkColor: Int,
        @JvmField
        val webAppHeaderLightColor: Int,
        @JvmField
        val webAppHeaderDarkColor: Int,
        @JvmField
        val verificationParameters: BotVerificationParameters?,
        @JvmField
        val canGetRevenueStatistics: Boolean,
        @JvmField
        val canManageEmojiStatus: Boolean,
        @JvmField
        val hasMediaPreviews: Boolean,
        @JvmField
        val editCommandsLink: InternalLinkType?,
        @JvmField
        val editDescriptionLink: InternalLinkType?,
        @JvmField
        val editDescriptionMediaLink: InternalLinkType?,
        @JvmField
        val editSettingsLink: InternalLinkType?,
    ) : Object() {
        override fun getConstructor(): Int = 1_771_886_272
    }

    class BotMediaPreview(
        @JvmField
        val date: Int,
        @JvmField
        val content: StoryContent,
    ) : Object() {
        override fun getConstructor(): Int = -1_632_264_984
    }

    class BotMediaPreviewInfo(
        @JvmField
        val previews: Array<BotMediaPreview>,
        @JvmField
        val languageCodes: Array<String>,
    ) : Object() {
        override fun getConstructor(): Int = -284_783_012
    }

    class BotMediaPreviews(
        @JvmField
        val previews: Array<BotMediaPreview>,
    ) : Object() {
        override fun getConstructor(): Int = -1_787_720_586
    }

    class BotMenuButton(
        @JvmField
        val text: String,
        @JvmField
        val url: String,
    ) : Object() {
        override fun getConstructor(): Int = -944_407_322
    }

    class BotVerification(
        @JvmField
        val botUserId: Long,
        @JvmField
        val iconCustomEmojiId: Long,
        @JvmField
        val customDescription: FormattedText,
    ) : Object() {
        override fun getConstructor(): Int = -1_319_061_774
    }

    class BotVerificationParameters(
        @JvmField
        val iconCustomEmojiId: Long,
        @JvmField
        val organizationName: String,
        @JvmField
        val defaultCustomDescription: FormattedText?,
        @JvmField
        val canSetCustomDescription: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -723_737_249
    }

    abstract class BotWriteAccessAllowReason : Object()

    class BotWriteAccessAllowReasonConnectedWebsite(
        @JvmField
        val domainName: String,
    ) : BotWriteAccessAllowReason() {
        override fun getConstructor(): Int = 2_016_325_603
    }

    class BotWriteAccessAllowReasonAddedToAttachmentMenu : BotWriteAccessAllowReason() {
        override fun getConstructor(): Int = -2_104_795_235
    }

    class BotWriteAccessAllowReasonLaunchedWebApp(
        @JvmField
        val webApp: WebApp,
    ) : BotWriteAccessAllowReason() {
        override fun getConstructor(): Int = -240_843_561
    }

    class BotWriteAccessAllowReasonAcceptedRequest : BotWriteAccessAllowReason() {
        override fun getConstructor(): Int = -1_983_497_220
    }

    abstract class BusinessAwayMessageSchedule : Object()

    class BusinessAwayMessageScheduleAlways : BusinessAwayMessageSchedule() {
        override fun getConstructor(): Int = -910_564_679
    }

    class BusinessAwayMessageScheduleOutsideOfOpeningHours : BusinessAwayMessageSchedule() {
        override fun getConstructor(): Int = -968_630_506
    }

    class BusinessAwayMessageScheduleCustom(
        @JvmField
        val startDate: Int,
        @JvmField
        val endDate: Int,
    ) : BusinessAwayMessageSchedule() {
        override fun getConstructor(): Int = -1_967_108_654
    }

    class BusinessAwayMessageSettings(
        @JvmField
        val shortcutId: Int,
        @JvmField
        val recipients: BusinessRecipients,
        @JvmField
        val schedule: BusinessAwayMessageSchedule,
        @JvmField
        val offlineOnly: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 353_084_137
    }

    class BusinessBotManageBar(
        @JvmField
        val botUserId: Long,
        @JvmField
        val manageUrl: String,
        @JvmField
        val isBotPaused: Boolean,
        @JvmField
        val canBotReply: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -311_399_806
    }

    class BusinessBotRights(
        @JvmField
        val canReply: Boolean,
        @JvmField
        val canReadMessages: Boolean,
        @JvmField
        val canDeleteSentMessages: Boolean,
        @JvmField
        val canDeleteAllMessages: Boolean,
        @JvmField
        val canEditName: Boolean,
        @JvmField
        val canEditBio: Boolean,
        @JvmField
        val canEditProfilePhoto: Boolean,
        @JvmField
        val canEditUsername: Boolean,
        @JvmField
        val canViewGiftsAndStars: Boolean,
        @JvmField
        val canSellGifts: Boolean,
        @JvmField
        val canChangeGiftSettings: Boolean,
        @JvmField
        val canTransferAndUpgradeGifts: Boolean,
        @JvmField
        val canTransferStars: Boolean,
        @JvmField
        val canManageStories: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_224_839_038
    }

    class BusinessChatLink(
        @JvmField
        val link: String,
        @JvmField
        val text: FormattedText,
        @JvmField
        val title: String,
        @JvmField
        val viewCount: Int,
    ) : Object() {
        override fun getConstructor(): Int = -1_902_539_901
    }

    class BusinessChatLinkInfo(
        @JvmField
        val chatId: Long,
        @JvmField
        val text: FormattedText,
    ) : Object() {
        override fun getConstructor(): Int = -864_865_105
    }

    class BusinessChatLinks(
        @JvmField
        val links: Array<BusinessChatLink>,
    ) : Object() {
        override fun getConstructor(): Int = 79_067_036
    }

    class BusinessConnectedBot(
        @JvmField
        val botUserId: Long,
        @JvmField
        val recipients: BusinessRecipients,
        @JvmField
        val rights: BusinessBotRights,
    ) : Object() {
        override fun getConstructor(): Int = -1_815_439_021
    }

    class BusinessConnection(
        @JvmField
        val id: String,
        @JvmField
        val userId: Long,
        @JvmField
        val userChatId: Long,
        @JvmField
        val date: Int,
        @JvmField
        val rights: BusinessBotRights?,
        @JvmField
        val isEnabled: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -995_703_933
    }

    abstract class BusinessFeature : Object()

    class BusinessFeatureLocation : BusinessFeature() {
        override fun getConstructor(): Int = -1_064_304_004
    }

    class BusinessFeatureOpeningHours : BusinessFeature() {
        override fun getConstructor(): Int = 461_054_701
    }

    class BusinessFeatureQuickReplies : BusinessFeature() {
        override fun getConstructor(): Int = -1_674_048_894
    }

    class BusinessFeatureGreetingMessage : BusinessFeature() {
        override fun getConstructor(): Int = 1_789_424_756
    }

    class BusinessFeatureAwayMessage : BusinessFeature() {
        override fun getConstructor(): Int = 1_090_119_901
    }

    class BusinessFeatureAccountLinks : BusinessFeature() {
        override fun getConstructor(): Int = 1_878_693_646
    }

    class BusinessFeatureStartPage : BusinessFeature() {
        override fun getConstructor(): Int = 401_471_457
    }

    class BusinessFeatureBots : BusinessFeature() {
        override fun getConstructor(): Int = 275_084_773
    }

    class BusinessFeatureEmojiStatus : BusinessFeature() {
        override fun getConstructor(): Int = -846_282_523
    }

    class BusinessFeatureChatFolderTags : BusinessFeature() {
        override fun getConstructor(): Int = -543_880_918
    }

    class BusinessFeatureUpgradedStories : BusinessFeature() {
        override fun getConstructor(): Int = -1_812_245_550
    }

    class BusinessFeaturePromotionAnimation(
        @JvmField
        val feature: BusinessFeature,
        @JvmField
        val animation: Animation,
    ) : Object() {
        override fun getConstructor(): Int = 2_047_174_666
    }

    class BusinessFeatures(
        @JvmField
        val features: Array<BusinessFeature>,
    ) : Object() {
        override fun getConstructor(): Int = -1_532_468_184
    }

    class BusinessGreetingMessageSettings(
        @JvmField
        val shortcutId: Int,
        @JvmField
        val recipients: BusinessRecipients,
        @JvmField
        val inactivityDays: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_689_140_754
    }

    class BusinessInfo(
        @JvmField
        val location: BusinessLocation?,
        @JvmField
        val openingHours: BusinessOpeningHours?,
        @JvmField
        val localOpeningHours: BusinessOpeningHours?,
        @JvmField
        val nextOpenIn: Int,
        @JvmField
        val nextCloseIn: Int,
        @JvmField
        val greetingMessageSettings: BusinessGreetingMessageSettings?,
        @JvmField
        val awayMessageSettings: BusinessAwayMessageSettings?,
        @JvmField
        val startPage: BusinessStartPage?,
    ) : Object() {
        override fun getConstructor(): Int = 1_428_179_342
    }

    class BusinessLocation(
        @JvmField
        val location: Location?,
        @JvmField
        val address: String,
    ) : Object() {
        override fun getConstructor(): Int = -1_084_969_126
    }

    class BusinessMessage(
        @JvmField
        val message: Message,
        @JvmField
        val replyToMessage: Message?,
    ) : Object() {
        override fun getConstructor(): Int = -94_353_850
    }

    class BusinessMessages(
        @JvmField
        val messages: Array<BusinessMessage>,
    ) : Object() {
        override fun getConstructor(): Int = -764_562_473
    }

    class BusinessOpeningHours(
        @JvmField
        val timeZoneId: String,
        @JvmField
        val openingHours: Array<BusinessOpeningHoursInterval>,
    ) : Object() {
        override fun getConstructor(): Int = 816_603_700
    }

    class BusinessOpeningHoursInterval(
        @JvmField
        val startMinute: Int,
        @JvmField
        val endMinute: Int,
    ) : Object() {
        override fun getConstructor(): Int = -1_108_322_732
    }

    class BusinessRecipients(
        @JvmField
        val chatIds: LongArray,
        @JvmField
        val excludedChatIds: LongArray,
        @JvmField
        val selectExistingChats: Boolean,
        @JvmField
        val selectNewChats: Boolean,
        @JvmField
        val selectContacts: Boolean,
        @JvmField
        val selectNonContacts: Boolean,
        @JvmField
        val excludeSelected: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 868_656_909
    }

    class BusinessStartPage(
        @JvmField
        val title: String,
        @JvmField
        val message: String,
        @JvmField
        val sticker: Sticker?,
    ) : Object() {
        override fun getConstructor(): Int = -1_616_709_681
    }

    class Call(
        @JvmField
        val id: Int,
        @JvmField
        val userId: Long,
        @JvmField
        val isOutgoing: Boolean,
        @JvmField
        val isVideo: Boolean,
        @JvmField
        val state: CallState,
    ) : Object() {
        override fun getConstructor(): Int = 920_360_804
    }

    abstract class CallDiscardReason : Object()

    class CallDiscardReasonEmpty : CallDiscardReason() {
        override fun getConstructor(): Int = -1_258_917_949
    }

    class CallDiscardReasonMissed : CallDiscardReason() {
        override fun getConstructor(): Int = 1_680_358_012
    }

    class CallDiscardReasonDeclined : CallDiscardReason() {
        override fun getConstructor(): Int = -1_729_926_094
    }

    class CallDiscardReasonDisconnected : CallDiscardReason() {
        override fun getConstructor(): Int = -1_342_872_670
    }

    class CallDiscardReasonHungUp : CallDiscardReason() {
        override fun getConstructor(): Int = 438_216_166
    }

    class CallDiscardReasonUpgradeToGroupCall(
        @JvmField
        val inviteLink: String,
    ) : CallDiscardReason() {
        override fun getConstructor(): Int = 1_254_509_319
    }

    class CallId(
        @JvmField
        val id: Int,
    ) : Object() {
        override fun getConstructor(): Int = 65_717_769
    }

    abstract class CallProblem : Object()

    class CallProblemEcho : CallProblem() {
        override fun getConstructor(): Int = 801_116_548
    }

    class CallProblemNoise : CallProblem() {
        override fun getConstructor(): Int = 1_053_065_359
    }

    class CallProblemInterruptions : CallProblem() {
        override fun getConstructor(): Int = 1_119_493_218
    }

    class CallProblemDistortedSpeech : CallProblem() {
        override fun getConstructor(): Int = 379_960_581
    }

    class CallProblemSilentLocal : CallProblem() {
        override fun getConstructor(): Int = 253_652_790
    }

    class CallProblemSilentRemote : CallProblem() {
        override fun getConstructor(): Int = 573_634_714
    }

    class CallProblemDropped : CallProblem() {
        override fun getConstructor(): Int = -1_207_311_487
    }

    class CallProblemDistortedVideo : CallProblem() {
        override fun getConstructor(): Int = 385_245_706
    }

    class CallProblemPixelatedVideo : CallProblem() {
        override fun getConstructor(): Int = 2_115_315_411
    }

    class CallProtocol(
        @JvmField
        val udpP2p: Boolean,
        @JvmField
        val udpReflector: Boolean,
        @JvmField
        val minLayer: Int,
        @JvmField
        val maxLayer: Int,
        @JvmField
        val libraryVersions: Array<String>,
    ) : Object() {
        override fun getConstructor(): Int = -1_075_562_897
    }

    class CallServer(
        @JvmField
        val id: Long,
        @JvmField
        val ipAddress: String,
        @JvmField
        val ipv6Address: String,
        @JvmField
        val port: Int,
        @JvmField
        val type: CallServerType,
    ) : Object() {
        override fun getConstructor(): Int = 1_865_932_695
    }

    abstract class CallServerType : Object()

    class CallServerTypeTelegramReflector(
        @JvmField
        val peerTag: ByteArray,
        @JvmField
        val isTcp: Boolean,
    ) : CallServerType() {
        override fun getConstructor(): Int = 850_343_189
    }

    class CallServerTypeWebrtc(
        @JvmField
        val username: String,
        @JvmField
        val password: String,
        @JvmField
        val supportsTurn: Boolean,
        @JvmField
        val supportsStun: Boolean,
    ) : CallServerType() {
        override fun getConstructor(): Int = 1_250_622_821
    }

    abstract class CallState : Object()

    class CallStatePending(
        @JvmField
        val isCreated: Boolean,
        @JvmField
        val isReceived: Boolean,
    ) : CallState() {
        override fun getConstructor(): Int = 1_073_048_620
    }

    class CallStateExchangingKeys : CallState() {
        override fun getConstructor(): Int = -1_848_149_403
    }

    class CallStateReady(
        @JvmField
        val protocol: CallProtocol,
        @JvmField
        val servers: Array<CallServer>,
        @JvmField
        val config: String,
        @JvmField
        val encryptionKey: ByteArray,
        @JvmField
        val emojis: Array<String>,
        @JvmField
        val allowP2p: Boolean,
        @JvmField
        val isGroupCallSupported: Boolean,
        @JvmField
        val customParameters: String,
    ) : CallState() {
        override fun getConstructor(): Int = -281_776_921
    }

    class CallStateHangingUp : CallState() {
        override fun getConstructor(): Int = -2_133_790_038
    }

    class CallStateDiscarded(
        @JvmField
        val reason: CallDiscardReason,
        @JvmField
        val needRating: Boolean,
        @JvmField
        val needDebugInformation: Boolean,
        @JvmField
        val needLog: Boolean,
    ) : CallState() {
        override fun getConstructor(): Int = 1_394_310_213
    }

    class CallStateError(
        @JvmField
        val error: Error,
    ) : CallState() {
        override fun getConstructor(): Int = -975_215_467
    }

    class CallbackQueryAnswer(
        @JvmField
        val text: String,
        @JvmField
        val showAlert: Boolean,
        @JvmField
        val url: String,
    ) : Object() {
        override fun getConstructor(): Int = 360_867_933
    }

    abstract class CallbackQueryPayload : Object()

    class CallbackQueryPayloadData(
        @JvmField
        val data: ByteArray,
    ) : CallbackQueryPayload() {
        override fun getConstructor(): Int = -1_977_729_946
    }

    class CallbackQueryPayloadDataWithPassword(
        @JvmField
        val password: String,
        @JvmField
        val data: ByteArray,
    ) : CallbackQueryPayload() {
        override fun getConstructor(): Int = 1_340_266_738
    }

    class CallbackQueryPayloadGame(
        @JvmField
        val gameShortName: String,
    ) : CallbackQueryPayload() {
        override fun getConstructor(): Int = 1_303_571_512
    }

    abstract class CanPostStoryResult : Object()

    class CanPostStoryResultOk(
        @JvmField
        val storyCount: Int,
    ) : CanPostStoryResult() {
        override fun getConstructor(): Int = 2_083_205_610
    }

    class CanPostStoryResultPremiumNeeded : CanPostStoryResult() {
        override fun getConstructor(): Int = 935_130_501
    }

    class CanPostStoryResultBoostNeeded : CanPostStoryResult() {
        override fun getConstructor(): Int = 80_246_195
    }

    class CanPostStoryResultActiveStoryLimitExceeded : CanPostStoryResult() {
        override fun getConstructor(): Int = -1_640_759_002
    }

    class CanPostStoryResultWeeklyLimitExceeded(
        @JvmField
        val retryAfter: Int,
    ) : CanPostStoryResult() {
        override fun getConstructor(): Int = 552_858_605
    }

    class CanPostStoryResultMonthlyLimitExceeded(
        @JvmField
        val retryAfter: Int,
    ) : CanPostStoryResult() {
        override fun getConstructor(): Int = -784_208_562
    }

    abstract class CanSendMessageToUserResult : Object()

    class CanSendMessageToUserResultOk : CanSendMessageToUserResult() {
        override fun getConstructor(): Int = 1_530_583_042
    }

    class CanSendMessageToUserResultUserHasPaidMessages(
        @JvmField
        val outgoingPaidMessageStarCount: Long,
    ) : CanSendMessageToUserResult() {
        override fun getConstructor(): Int = -1_346_487_602
    }

    class CanSendMessageToUserResultUserIsDeleted : CanSendMessageToUserResult() {
        override fun getConstructor(): Int = -1_944_639_903
    }

    class CanSendMessageToUserResultUserRestrictsNewChats : CanSendMessageToUserResult() {
        override fun getConstructor(): Int = 1_929_699_797
    }

    abstract class CanTransferOwnershipResult : Object()

    class CanTransferOwnershipResultOk : CanTransferOwnershipResult() {
        override fun getConstructor(): Int = -89_881_021
    }

    class CanTransferOwnershipResultPasswordNeeded : CanTransferOwnershipResult() {
        override fun getConstructor(): Int = 1_548_372_703
    }

    class CanTransferOwnershipResultPasswordTooFresh(
        @JvmField
        val retryAfter: Int,
    ) : CanTransferOwnershipResult() {
        override fun getConstructor(): Int = 811_440_913
    }

    class CanTransferOwnershipResultSessionTooFresh(
        @JvmField
        val retryAfter: Int,
    ) : CanTransferOwnershipResult() {
        override fun getConstructor(): Int = 984_664_289
    }

    class Chat(
        @JvmField
        val id: Long,
        @JvmField
        val type: ChatType,
        @JvmField
        val title: String,
        @JvmField
        val photo: ChatPhotoInfo?,
        @JvmField
        val accentColorId: Int,
        @JvmField
        val backgroundCustomEmojiId: Long,
        @JvmField
        val profileAccentColorId: Int,
        @JvmField
        val profileBackgroundCustomEmojiId: Long,
        @JvmField
        val permissions: ChatPermissions,
        @JvmField
        val lastMessage: Message?,
        @JvmField
        val positions: Array<ChatPosition>,
        @JvmField
        val chatLists: Array<ChatList>,
        @JvmField
        val messageSenderId: MessageSender?,
        @JvmField
        val blockList: BlockList?,
        @JvmField
        val hasProtectedContent: Boolean,
        @JvmField
        val isTranslatable: Boolean,
        @JvmField
        val isMarkedAsUnread: Boolean,
        @JvmField
        val viewAsTopics: Boolean,
        @JvmField
        val hasScheduledMessages: Boolean,
        @JvmField
        val canBeDeletedOnlyForSelf: Boolean,
        @JvmField
        val canBeDeletedForAllUsers: Boolean,
        @JvmField
        val canBeReported: Boolean,
        @JvmField
        val defaultDisableNotification: Boolean,
        @JvmField
        val unreadCount: Int,
        @JvmField
        val lastReadInboxMessageId: Long,
        @JvmField
        val lastReadOutboxMessageId: Long,
        @JvmField
        val unreadMentionCount: Int,
        @JvmField
        val unreadReactionCount: Int,
        @JvmField
        val notificationSettings: ChatNotificationSettings,
        @JvmField
        val availableReactions: ChatAvailableReactions,
        @JvmField
        val messageAutoDeleteTime: Int,
        @JvmField
        val emojiStatus: EmojiStatus?,
        @JvmField
        val background: ChatBackground?,
        @JvmField
        val themeName: String,
        @JvmField
        val actionBar: ChatActionBar?,
        @JvmField
        val businessBotManageBar: BusinessBotManageBar?,
        @JvmField
        val videoChat: VideoChat,
        @JvmField
        val pendingJoinRequests: ChatJoinRequestsInfo?,
        @JvmField
        val replyMarkupMessageId: Long,
        @JvmField
        val draftMessage: DraftMessage?,
        @JvmField
        val clientData: String,
    ) : Object() {
        override fun getConstructor(): Int = 830_601_369
    }

    abstract class ChatAction : Object()

    class ChatActionTyping : ChatAction() {
        override fun getConstructor(): Int = 380_122_167
    }

    class ChatActionRecordingVideo : ChatAction() {
        override fun getConstructor(): Int = 216_553_362
    }

    class ChatActionUploadingVideo(
        @JvmField
        val progress: Int,
    ) : ChatAction() {
        override fun getConstructor(): Int = 1_234_185_270
    }

    class ChatActionRecordingVoiceNote : ChatAction() {
        override fun getConstructor(): Int = -808_850_058
    }

    class ChatActionUploadingVoiceNote(
        @JvmField
        val progress: Int,
    ) : ChatAction() {
        override fun getConstructor(): Int = -613_643_666
    }

    class ChatActionUploadingPhoto(
        @JvmField
        val progress: Int,
    ) : ChatAction() {
        override fun getConstructor(): Int = 654_240_583
    }

    class ChatActionUploadingDocument(
        @JvmField
        val progress: Int,
    ) : ChatAction() {
        override fun getConstructor(): Int = 167_884_362
    }

    class ChatActionChoosingSticker : ChatAction() {
        override fun getConstructor(): Int = 372_753_697
    }

    class ChatActionChoosingLocation : ChatAction() {
        override fun getConstructor(): Int = -2_017_893_596
    }

    class ChatActionChoosingContact : ChatAction() {
        override fun getConstructor(): Int = -1_222_507_496
    }

    class ChatActionStartPlayingGame : ChatAction() {
        override fun getConstructor(): Int = -865_884_164
    }

    class ChatActionRecordingVideoNote : ChatAction() {
        override fun getConstructor(): Int = 16_523_393
    }

    class ChatActionUploadingVideoNote(
        @JvmField
        val progress: Int,
    ) : ChatAction() {
        override fun getConstructor(): Int = 1_172_364_918
    }

    class ChatActionWatchingAnimations(
        @JvmField
        val emoji: String,
    ) : ChatAction() {
        override fun getConstructor(): Int = 2_052_990_641
    }

    class ChatActionCancel : ChatAction() {
        override fun getConstructor(): Int = 1_160_523_958
    }

    abstract class ChatActionBar : Object()

    class ChatActionBarReportSpam(
        @JvmField
        val canUnarchive: Boolean,
    ) : ChatActionBar() {
        override fun getConstructor(): Int = -1_312_758_246
    }

    class ChatActionBarInviteMembers : ChatActionBar() {
        override fun getConstructor(): Int = 1_985_313_904
    }

    class ChatActionBarReportAddBlock(
        @JvmField
        val canUnarchive: Boolean,
        @JvmField
        val accountInfo: AccountInfo?,
    ) : ChatActionBar() {
        override fun getConstructor(): Int = -1_476_817_269
    }

    class ChatActionBarAddContact : ChatActionBar() {
        override fun getConstructor(): Int = -733_325_295
    }

    class ChatActionBarSharePhoneNumber : ChatActionBar() {
        override fun getConstructor(): Int = 35_188_697
    }

    class ChatActionBarJoinRequest(
        @JvmField
        val title: String,
        @JvmField
        val isChannel: Boolean,
        @JvmField
        val requestDate: Int,
    ) : ChatActionBar() {
        override fun getConstructor(): Int = 1_037_140_744
    }

    class ChatActiveStories(
        @JvmField
        val chatId: Long,
        @JvmField
        val list: StoryList?,
        @JvmField
        val order: Long,
        @JvmField
        val maxReadStoryId: Int,
        @JvmField
        val stories: Array<StoryInfo>,
    ) : Object() {
        override fun getConstructor(): Int = -1_398_869_529
    }

    class ChatAdministrator(
        @JvmField
        val userId: Long,
        @JvmField
        val customTitle: String,
        @JvmField
        val isOwner: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_920_449_836
    }

    class ChatAdministratorRights(
        @JvmField
        val canManageChat: Boolean,
        @JvmField
        val canChangeInfo: Boolean,
        @JvmField
        val canPostMessages: Boolean,
        @JvmField
        val canEditMessages: Boolean,
        @JvmField
        val canDeleteMessages: Boolean,
        @JvmField
        val canInviteUsers: Boolean,
        @JvmField
        val canRestrictMembers: Boolean,
        @JvmField
        val canPinMessages: Boolean,
        @JvmField
        val canManageTopics: Boolean,
        @JvmField
        val canPromoteMembers: Boolean,
        @JvmField
        val canManageVideoChats: Boolean,
        @JvmField
        val canPostStories: Boolean,
        @JvmField
        val canEditStories: Boolean,
        @JvmField
        val canDeleteStories: Boolean,
        @JvmField
        val isAnonymous: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_599_049_796
    }

    class ChatAdministrators(
        @JvmField
        val administrators: Array<ChatAdministrator>,
    ) : Object() {
        override fun getConstructor(): Int = -2_126_186_435
    }

    abstract class ChatAvailableReactions : Object()

    class ChatAvailableReactionsAll(
        @JvmField
        val maxReactionCount: Int,
    ) : ChatAvailableReactions() {
        override fun getConstructor(): Int = 694_160_279
    }

    class ChatAvailableReactionsSome(
        @JvmField
        val reactions: Array<ReactionType>,
        @JvmField
        val maxReactionCount: Int,
    ) : ChatAvailableReactions() {
        override fun getConstructor(): Int = 152_513_153
    }

    class ChatBackground(
        @JvmField
        val background: Background,
        @JvmField
        val darkThemeDimming: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_653_152_104
    }

    class ChatBoost(
        @JvmField
        val id: String,
        @JvmField
        val count: Int,
        @JvmField
        val source: ChatBoostSource,
        @JvmField
        val startDate: Int,
        @JvmField
        val expirationDate: Int,
    ) : Object() {
        override fun getConstructor(): Int = -1_765_815_118
    }

    class ChatBoostFeatures(
        @JvmField
        val features: Array<ChatBoostLevelFeatures>,
        @JvmField
        val minProfileBackgroundCustomEmojiBoostLevel: Int,
        @JvmField
        val minBackgroundCustomEmojiBoostLevel: Int,
        @JvmField
        val minEmojiStatusBoostLevel: Int,
        @JvmField
        val minChatThemeBackgroundBoostLevel: Int,
        @JvmField
        val minCustomBackgroundBoostLevel: Int,
        @JvmField
        val minCustomEmojiStickerSetBoostLevel: Int,
        @JvmField
        val minAutomaticTranslationBoostLevel: Int,
        @JvmField
        val minSpeechRecognitionBoostLevel: Int,
        @JvmField
        val minSponsoredMessageDisableBoostLevel: Int,
    ) : Object() {
        override fun getConstructor(): Int = -940_531_367
    }

    class ChatBoostLevelFeatures(
        @JvmField
        val level: Int,
        @JvmField
        val storyPerDayCount: Int,
        @JvmField
        val customEmojiReactionCount: Int,
        @JvmField
        val titleColorCount: Int,
        @JvmField
        val profileAccentColorCount: Int,
        @JvmField
        val canSetProfileBackgroundCustomEmoji: Boolean,
        @JvmField
        val accentColorCount: Int,
        @JvmField
        val canSetBackgroundCustomEmoji: Boolean,
        @JvmField
        val canSetEmojiStatus: Boolean,
        @JvmField
        val chatThemeBackgroundCount: Int,
        @JvmField
        val canSetCustomBackground: Boolean,
        @JvmField
        val canSetCustomEmojiStickerSet: Boolean,
        @JvmField
        val canEnableAutomaticTranslation: Boolean,
        @JvmField
        val canRecognizeSpeech: Boolean,
        @JvmField
        val canDisableSponsoredMessages: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 975_439_470
    }

    class ChatBoostLink(
        @JvmField
        val link: String,
        @JvmField
        val isPublic: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -1_253_999_503
    }

    class ChatBoostLinkInfo(
        @JvmField
        val isPublic: Boolean,
        @JvmField
        val chatId: Long,
    ) : Object() {
        override fun getConstructor(): Int = -602_785_660
    }

    class ChatBoostSlot(
        @JvmField
        val slotId: Int,
        @JvmField
        val currentlyBoostedChatId: Long,
        @JvmField
        val startDate: Int,
        @JvmField
        val expirationDate: Int,
        @JvmField
        val cooldownUntilDate: Int,
    ) : Object() {
        override fun getConstructor(): Int = 123_206_343
    }

    class ChatBoostSlots(
        @JvmField
        val slots: Array<ChatBoostSlot>,
    ) : Object() {
        override fun getConstructor(): Int = 1_014_966_293
    }

    abstract class ChatBoostSource : Object()

    class ChatBoostSourceGiftCode(
        @JvmField
        val userId: Long,
        @JvmField
        val giftCode: String,
    ) : ChatBoostSource() {
        override fun getConstructor(): Int = -98_299_206
    }

    class ChatBoostSourceGiveaway(
        @JvmField
        val userId: Long,
        @JvmField
        val giftCode: String,
        @JvmField
        val starCount: Long,
        @JvmField
        val giveawayMessageId: Long,
        @JvmField
        val isUnclaimed: Boolean,
    ) : ChatBoostSource() {
        override fun getConstructor(): Int = 1_918_145_690
    }

    class ChatBoostSourcePremium(
        @JvmField
        val userId: Long,
    ) : ChatBoostSource() {
        override fun getConstructor(): Int = 972_011
    }

    class ChatBoostStatus(
        @JvmField
        val boostUrl: String,
        @JvmField
        val appliedSlotIds: IntArray,
        @JvmField
        val level: Int,
        @JvmField
        val giftCodeBoostCount: Int,
        @JvmField
        val boostCount: Int,
        @JvmField
        val currentLevelBoostCount: Int,
        @JvmField
        val nextLevelBoostCount: Int,
        @JvmField
        val premiumMemberCount: Int,
        @JvmField
        val premiumMemberPercentage: Double,
        @JvmField
        val prepaidGiveaways: Array<PrepaidGiveaway>,
    ) : Object() {
        override fun getConstructor(): Int = -1_050_332_618
    }

    class ChatEvent(
        @JvmField
        val id: Long,
        @JvmField
        val date: Int,
        @JvmField
        val memberId: MessageSender,
        @JvmField
        val action: ChatEventAction,
    ) : Object() {
        override fun getConstructor(): Int = -652_102_704
    }

    abstract class ChatEventAction : Object()

    class ChatEventMessageEdited(
        @JvmField
        val oldMessage: Message,
        @JvmField
        val newMessage: Message,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -430_967_304
    }

    class ChatEventMessageDeleted(
        @JvmField
        val message: Message,
        @JvmField
        val canReportAntiSpamFalsePositive: Boolean,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 935_316_851
    }

    class ChatEventMessagePinned(
        @JvmField
        val message: Message,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 438_742_298
    }

    class ChatEventMessageUnpinned(
        @JvmField
        val message: Message,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -376_161_513
    }

    class ChatEventPollStopped(
        @JvmField
        val message: Message,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 2_009_893_861
    }

    class ChatEventMemberJoined : ChatEventAction() {
        override fun getConstructor(): Int = -235_468_508
    }

    class ChatEventMemberJoinedByInviteLink(
        @JvmField
        val inviteLink: ChatInviteLink,
        @JvmField
        val viaChatFolderInviteLink: Boolean,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -1_445_536_390
    }

    class ChatEventMemberJoinedByRequest(
        @JvmField
        val approverUserId: Long,
        @JvmField
        val inviteLink: ChatInviteLink?,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -1_647_804_865
    }

    class ChatEventMemberInvited(
        @JvmField
        val userId: Long,
        @JvmField
        val status: ChatMemberStatus,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 953_663_433
    }

    class ChatEventMemberLeft : ChatEventAction() {
        override fun getConstructor(): Int = -948_420_593
    }

    class ChatEventMemberPromoted(
        @JvmField
        val userId: Long,
        @JvmField
        val oldStatus: ChatMemberStatus,
        @JvmField
        val newStatus: ChatMemberStatus,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 525_297_761
    }

    class ChatEventMemberRestricted(
        @JvmField
        val memberId: MessageSender,
        @JvmField
        val oldStatus: ChatMemberStatus,
        @JvmField
        val newStatus: ChatMemberStatus,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 1_603_608_069
    }

    class ChatEventMemberSubscriptionExtended(
        @JvmField
        val userId: Long,
        @JvmField
        val oldStatus: ChatMemberStatus,
        @JvmField
        val newStatus: ChatMemberStatus,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -1_141_198_846
    }

    class ChatEventAvailableReactionsChanged(
        @JvmField
        val oldAvailableReactions: ChatAvailableReactions,
        @JvmField
        val newAvailableReactions: ChatAvailableReactions,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -1_749_491_521
    }

    class ChatEventBackgroundChanged(
        @JvmField
        val oldBackground: ChatBackground?,
        @JvmField
        val newBackground: ChatBackground?,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -1_225_953_992
    }

    class ChatEventDescriptionChanged(
        @JvmField
        val oldDescription: String,
        @JvmField
        val newDescription: String,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 39_112_478
    }

    class ChatEventEmojiStatusChanged(
        @JvmField
        val oldEmojiStatus: EmojiStatus?,
        @JvmField
        val newEmojiStatus: EmojiStatus?,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -2_081_850_594
    }

    class ChatEventLinkedChatChanged(
        @JvmField
        val oldLinkedChatId: Long,
        @JvmField
        val newLinkedChatId: Long,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 1_797_419_439
    }

    class ChatEventLocationChanged(
        @JvmField
        val oldLocation: ChatLocation?,
        @JvmField
        val newLocation: ChatLocation?,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -405_930_674
    }

    class ChatEventMessageAutoDeleteTimeChanged(
        @JvmField
        val oldMessageAutoDeleteTime: Int,
        @JvmField
        val newMessageAutoDeleteTime: Int,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 17_317_668
    }

    class ChatEventPermissionsChanged(
        @JvmField
        val oldPermissions: ChatPermissions,
        @JvmField
        val newPermissions: ChatPermissions,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -1_311_557_720
    }

    class ChatEventPhotoChanged(
        @JvmField
        val oldPhoto: ChatPhoto?,
        @JvmField
        val newPhoto: ChatPhoto?,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -811_572_541
    }

    class ChatEventSlowModeDelayChanged(
        @JvmField
        val oldSlowModeDelay: Int,
        @JvmField
        val newSlowModeDelay: Int,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -1_653_195_765
    }

    class ChatEventStickerSetChanged(
        @JvmField
        val oldStickerSetId: Long,
        @JvmField
        val newStickerSetId: Long,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -1_243_130_481
    }

    class ChatEventCustomEmojiStickerSetChanged(
        @JvmField
        val oldStickerSetId: Long,
        @JvmField
        val newStickerSetId: Long,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 118_244_123
    }

    class ChatEventTitleChanged(
        @JvmField
        val oldTitle: String,
        @JvmField
        val newTitle: String,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 1_134_103_250
    }

    class ChatEventUsernameChanged(
        @JvmField
        val oldUsername: String,
        @JvmField
        val newUsername: String,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 1_728_558_443
    }

    class ChatEventActiveUsernamesChanged(
        @JvmField
        val oldUsernames: Array<String>,
        @JvmField
        val newUsernames: Array<String>,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -1_508_790_810
    }

    class ChatEventAccentColorChanged(
        @JvmField
        val oldAccentColorId: Int,
        @JvmField
        val oldBackgroundCustomEmojiId: Long,
        @JvmField
        val newAccentColorId: Int,
        @JvmField
        val newBackgroundCustomEmojiId: Long,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -427_591_885
    }

    class ChatEventProfileAccentColorChanged(
        @JvmField
        val oldProfileAccentColorId: Int,
        @JvmField
        val oldProfileBackgroundCustomEmojiId: Long,
        @JvmField
        val newProfileAccentColorId: Int,
        @JvmField
        val newProfileBackgroundCustomEmojiId: Long,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -1_514_612_124
    }

    class ChatEventHasProtectedContentToggled(
        @JvmField
        val hasProtectedContent: Boolean,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -184_270_335
    }

    class ChatEventInvitesToggled(
        @JvmField
        val canInviteUsers: Boolean,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -62_548_373
    }

    class ChatEventIsAllHistoryAvailableToggled(
        @JvmField
        val isAllHistoryAvailable: Boolean,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -1_599_063_019
    }

    class ChatEventHasAggressiveAntiSpamEnabledToggled(
        @JvmField
        val hasAggressiveAntiSpamEnabled: Boolean,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -125_348_094
    }

    class ChatEventSignMessagesToggled(
        @JvmField
        val signMessages: Boolean,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -1_313_265_634
    }

    class ChatEventShowMessageSenderToggled(
        @JvmField
        val showMessageSender: Boolean,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -794_343_453
    }

    class ChatEventAutomaticTranslationToggled(
        @JvmField
        val hasAutomaticTranslation: Boolean,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 194_147_926
    }

    class ChatEventInviteLinkEdited(
        @JvmField
        val oldInviteLink: ChatInviteLink,
        @JvmField
        val newInviteLink: ChatInviteLink,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -460_190_366
    }

    class ChatEventInviteLinkRevoked(
        @JvmField
        val inviteLink: ChatInviteLink,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -1_579_417_629
    }

    class ChatEventInviteLinkDeleted(
        @JvmField
        val inviteLink: ChatInviteLink,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -1_394_974_361
    }

    class ChatEventVideoChatCreated(
        @JvmField
        val groupCallId: Int,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 1_822_853_755
    }

    class ChatEventVideoChatEnded(
        @JvmField
        val groupCallId: Int,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 1_630_039_112
    }

    class ChatEventVideoChatMuteNewParticipantsToggled(
        @JvmField
        val muteNewParticipants: Boolean,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -126_547_970
    }

    class ChatEventVideoChatParticipantIsMutedToggled(
        @JvmField
        val participantId: MessageSender,
        @JvmField
        val isMuted: Boolean,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 521_165_047
    }

    class ChatEventVideoChatParticipantVolumeLevelChanged(
        @JvmField
        val participantId: MessageSender,
        @JvmField
        val volumeLevel: Int,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 1_131_385_534
    }

    class ChatEventIsForumToggled(
        @JvmField
        val isForum: Boolean,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 1_516_491_033
    }

    class ChatEventForumTopicCreated(
        @JvmField
        val topicInfo: ForumTopicInfo,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 2_005_269_314
    }

    class ChatEventForumTopicEdited(
        @JvmField
        val oldTopicInfo: ForumTopicInfo,
        @JvmField
        val newTopicInfo: ForumTopicInfo,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 1_624_910_860
    }

    class ChatEventForumTopicToggleIsClosed(
        @JvmField
        val topicInfo: ForumTopicInfo,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -962_704_070
    }

    class ChatEventForumTopicToggleIsHidden(
        @JvmField
        val topicInfo: ForumTopicInfo,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -1_609_175_250
    }

    class ChatEventForumTopicDeleted(
        @JvmField
        val topicInfo: ForumTopicInfo,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = -1_332_795_123
    }

    class ChatEventForumTopicPinned(
        @JvmField
        val oldTopicInfo: ForumTopicInfo?,
        @JvmField
        val newTopicInfo: ForumTopicInfo?,
    ) : ChatEventAction() {
        override fun getConstructor(): Int = 2_143_626_222
    }

    class ChatEventLogFilters(
        @JvmField
        val messageEdits: Boolean,
        @JvmField
        val messageDeletions: Boolean,
        @JvmField
        val messagePins: Boolean,
        @JvmField
        val memberJoins: Boolean,
        @JvmField
        val memberLeaves: Boolean,
        @JvmField
        val memberInvites: Boolean,
        @JvmField
        val memberPromotions: Boolean,
        @JvmField
        val memberRestrictions: Boolean,
        @JvmField
        val infoChanges: Boolean,
        @JvmField
        val settingChanges: Boolean,
        @JvmField
        val inviteLinkChanges: Boolean,
        @JvmField
        val videoChatChanges: Boolean,
        @JvmField
        val forumChanges: Boolean,
        @JvmField
        val subscriptionExtensions: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -1_032_965_711
    }

    class ChatEvents(
        @JvmField
        val events: Array<ChatEvent>,
    ) : Object() {
        override fun getConstructor(): Int = -585_329_664
    }

    class ChatFolder(
        @JvmField
        val name: ChatFolderName,
        @JvmField
        val icon: ChatFolderIcon?,
        @JvmField
        val colorId: Int,
        @JvmField
        val isShareable: Boolean,
        @JvmField
        val pinnedChatIds: LongArray,
        @JvmField
        val includedChatIds: LongArray,
        @JvmField
        val excludedChatIds: LongArray,
        @JvmField
        val excludeMuted: Boolean,
        @JvmField
        val excludeRead: Boolean,
        @JvmField
        val excludeArchived: Boolean,
        @JvmField
        val includeContacts: Boolean,
        @JvmField
        val includeNonContacts: Boolean,
        @JvmField
        val includeBots: Boolean,
        @JvmField
        val includeGroups: Boolean,
        @JvmField
        val includeChannels: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_596_164_696
    }

    class ChatFolderIcon(
        @JvmField
        val name: String,
    ) : Object() {
        override fun getConstructor(): Int = -146_104_090
    }

    class ChatFolderInfo(
        @JvmField
        val id: Int,
        @JvmField
        val name: ChatFolderName,
        @JvmField
        val icon: ChatFolderIcon,
        @JvmField
        val colorId: Int,
        @JvmField
        val isShareable: Boolean,
        @JvmField
        val hasMyInviteLinks: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 815_535_117
    }

    class ChatFolderInviteLink(
        @JvmField
        val inviteLink: String,
        @JvmField
        val name: String,
        @JvmField
        val chatIds: LongArray,
    ) : Object() {
        override fun getConstructor(): Int = 493_969_661
    }

    class ChatFolderInviteLinkInfo(
        @JvmField
        val chatFolderInfo: ChatFolderInfo,
        @JvmField
        val missingChatIds: LongArray,
        @JvmField
        val addedChatIds: LongArray,
    ) : Object() {
        override fun getConstructor(): Int = 1_119_450_395
    }

    class ChatFolderInviteLinks(
        @JvmField
        val inviteLinks: Array<ChatFolderInviteLink>,
    ) : Object() {
        override fun getConstructor(): Int = 1_853_351_525
    }

    class ChatFolderName(
        @JvmField
        val text: FormattedText,
        @JvmField
        val animateCustomEmoji: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -330_482_274
    }

    class ChatInviteLink(
        @JvmField
        val inviteLink: String,
        @JvmField
        val name: String,
        @JvmField
        val creatorUserId: Long,
        @JvmField
        val date: Int,
        @JvmField
        val editDate: Int,
        @JvmField
        val expirationDate: Int,
        @JvmField
        val subscriptionPricing: StarSubscriptionPricing?,
        @JvmField
        val memberLimit: Int,
        @JvmField
        val memberCount: Int,
        @JvmField
        val expiredMemberCount: Int,
        @JvmField
        val pendingJoinRequestCount: Int,
        @JvmField
        val createsJoinRequest: Boolean,
        @JvmField
        val isPrimary: Boolean,
        @JvmField
        val isRevoked: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -957_651_664
    }

    class ChatInviteLinkCount(
        @JvmField
        val userId: Long,
        @JvmField
        val inviteLinkCount: Int,
        @JvmField
        val revokedInviteLinkCount: Int,
    ) : Object() {
        override fun getConstructor(): Int = -1_021_999_210
    }

    class ChatInviteLinkCounts(
        @JvmField
        val inviteLinkCounts: Array<ChatInviteLinkCount>,
    ) : Object() {
        override fun getConstructor(): Int = 920_326_637
    }

    class ChatInviteLinkInfo(
        @JvmField
        val chatId: Long,
        @JvmField
        val accessibleFor: Int,
        @JvmField
        val type: InviteLinkChatType,
        @JvmField
        val title: String,
        @JvmField
        val photo: ChatPhotoInfo?,
        @JvmField
        val accentColorId: Int,
        @JvmField
        val description: String,
        @JvmField
        val memberCount: Int,
        @JvmField
        val memberUserIds: LongArray,
        @JvmField
        val subscriptionInfo: ChatInviteLinkSubscriptionInfo?,
        @JvmField
        val createsJoinRequest: Boolean,
        @JvmField
        val isPublic: Boolean,
        @JvmField
        val verificationStatus: VerificationStatus?,
    ) : Object() {
        override fun getConstructor(): Int = -1_145_310_535
    }

    class ChatInviteLinkMember(
        @JvmField
        val userId: Long,
        @JvmField
        val joinedChatDate: Int,
        @JvmField
        val viaChatFolderInviteLink: Boolean,
        @JvmField
        val approverUserId: Long,
    ) : Object() {
        override fun getConstructor(): Int = 29_156_795
    }

    class ChatInviteLinkMembers(
        @JvmField
        val totalCount: Int,
        @JvmField
        val members: Array<ChatInviteLinkMember>,
    ) : Object() {
        override fun getConstructor(): Int = 315_635_051
    }

    class ChatInviteLinkSubscriptionInfo(
        @JvmField
        val pricing: StarSubscriptionPricing,
        @JvmField
        val canReuse: Boolean,
        @JvmField
        val formId: Long,
    ) : Object() {
        override fun getConstructor(): Int = 953_119_592
    }

    class ChatInviteLinks(
        @JvmField
        val totalCount: Int,
        @JvmField
        val inviteLinks: Array<ChatInviteLink>,
    ) : Object() {
        override fun getConstructor(): Int = 112_891_427
    }

    class ChatJoinRequest(
        @JvmField
        val userId: Long,
        @JvmField
        val date: Int,
        @JvmField
        val bio: String,
    ) : Object() {
        override fun getConstructor(): Int = 59_341_416
    }

    class ChatJoinRequests(
        @JvmField
        val totalCount: Int,
        @JvmField
        val requests: Array<ChatJoinRequest>,
    ) : Object() {
        override fun getConstructor(): Int = 1_291_680_519
    }

    class ChatJoinRequestsInfo(
        @JvmField
        val totalCount: Int,
        @JvmField
        val userIds: LongArray,
    ) : Object() {
        override fun getConstructor(): Int = 888_534_463
    }

    abstract class ChatList : Object()

    class ChatListMain : ChatList() {
        override fun getConstructor(): Int = -400_991_316
    }

    class ChatListArchive : ChatList() {
        override fun getConstructor(): Int = 362_770_115
    }

    class ChatListFolder(
        @JvmField
        val chatFolderId: Int,
    ) : ChatList() {
        override fun getConstructor(): Int = 385_760_856
    }

    class ChatLists(
        @JvmField
        val chatLists: Array<ChatList>,
    ) : Object() {
        override fun getConstructor(): Int = -258_292_771
    }

    class ChatLocation(
        @JvmField
        val location: Location,
        @JvmField
        val address: String,
    ) : Object() {
        override fun getConstructor(): Int = -1_566_863_583
    }

    class ChatMember(
        @JvmField
        val memberId: MessageSender,
        @JvmField
        val inviterUserId: Long,
        @JvmField
        val joinedChatDate: Int,
        @JvmField
        val status: ChatMemberStatus,
    ) : Object() {
        override fun getConstructor(): Int = 1_829_953_909
    }

    abstract class ChatMemberStatus : Object()

    class ChatMemberStatusCreator(
        @JvmField
        val customTitle: String,
        @JvmField
        val isAnonymous: Boolean,
        @JvmField
        val isMember: Boolean,
    ) : ChatMemberStatus() {
        override fun getConstructor(): Int = -160_019_714
    }

    class ChatMemberStatusAdministrator(
        @JvmField
        val customTitle: String,
        @JvmField
        val canBeEdited: Boolean,
        @JvmField
        val rights: ChatAdministratorRights,
    ) : ChatMemberStatus() {
        override fun getConstructor(): Int = -70_024_163
    }

    class ChatMemberStatusMember(
        @JvmField
        val memberUntilDate: Int,
    ) : ChatMemberStatus() {
        override fun getConstructor(): Int = -32_707_562
    }

    class ChatMemberStatusRestricted(
        @JvmField
        val isMember: Boolean,
        @JvmField
        val restrictedUntilDate: Int,
        @JvmField
        val permissions: ChatPermissions,
    ) : ChatMemberStatus() {
        override fun getConstructor(): Int = 1_661_432_998
    }

    class ChatMemberStatusLeft : ChatMemberStatus() {
        override fun getConstructor(): Int = -5_815_259
    }

    class ChatMemberStatusBanned(
        @JvmField
        val bannedUntilDate: Int,
    ) : ChatMemberStatus() {
        override fun getConstructor(): Int = -1_653_518_666
    }

    class ChatMembers(
        @JvmField
        val totalCount: Int,
        @JvmField
        val members: Array<ChatMember>,
    ) : Object() {
        override fun getConstructor(): Int = -497_558_622
    }

    abstract class ChatMembersFilter : Object()

    class ChatMembersFilterContacts : ChatMembersFilter() {
        override fun getConstructor(): Int = 1_774_485_671
    }

    class ChatMembersFilterAdministrators : ChatMembersFilter() {
        override fun getConstructor(): Int = -1_266_893_796
    }

    class ChatMembersFilterMembers : ChatMembersFilter() {
        override fun getConstructor(): Int = 670_504_342
    }

    class ChatMembersFilterMention(
        @JvmField
        val messageThreadId: Long,
    ) : ChatMembersFilter() {
        override fun getConstructor(): Int = 856_419_831
    }

    class ChatMembersFilterRestricted : ChatMembersFilter() {
        override fun getConstructor(): Int = 1_256_282_813
    }

    class ChatMembersFilterBanned : ChatMembersFilter() {
        override fun getConstructor(): Int = -1_863_102_648
    }

    class ChatMembersFilterBots : ChatMembersFilter() {
        override fun getConstructor(): Int = -1_422_567_288
    }

    class ChatMessageSender(
        @JvmField
        val sender: MessageSender,
        @JvmField
        val needsPremium: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 760_590_010
    }

    class ChatMessageSenders(
        @JvmField
        val senders: Array<ChatMessageSender>,
    ) : Object() {
        override fun getConstructor(): Int = -1_866_230_970
    }

    class ChatNotificationSettings(
        @JvmField
        val useDefaultMuteFor: Boolean,
        @JvmField
        val muteFor: Int,
        @JvmField
        val useDefaultSound: Boolean,
        @JvmField
        val soundId: Long,
        @JvmField
        val useDefaultShowPreview: Boolean,
        @JvmField
        val showPreview: Boolean,
        @JvmField
        val useDefaultMuteStories: Boolean,
        @JvmField
        val muteStories: Boolean,
        @JvmField
        val useDefaultStorySound: Boolean,
        @JvmField
        val storySoundId: Long,
        @JvmField
        val useDefaultShowStoryPoster: Boolean,
        @JvmField
        val showStoryPoster: Boolean,
        @JvmField
        val useDefaultDisablePinnedMessageNotifications: Boolean,
        @JvmField
        val disablePinnedMessageNotifications: Boolean,
        @JvmField
        val useDefaultDisableMentionNotifications: Boolean,
        @JvmField
        val disableMentionNotifications: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_459_533_846
    }

    class ChatPermissions(
        @JvmField
        val canSendBasicMessages: Boolean,
        @JvmField
        val canSendAudios: Boolean,
        @JvmField
        val canSendDocuments: Boolean,
        @JvmField
        val canSendPhotos: Boolean,
        @JvmField
        val canSendVideos: Boolean,
        @JvmField
        val canSendVideoNotes: Boolean,
        @JvmField
        val canSendVoiceNotes: Boolean,
        @JvmField
        val canSendPolls: Boolean,
        @JvmField
        val canSendOtherMessages: Boolean,
        @JvmField
        val canAddLinkPreviews: Boolean,
        @JvmField
        val canChangeInfo: Boolean,
        @JvmField
        val canInviteUsers: Boolean,
        @JvmField
        val canPinMessages: Boolean,
        @JvmField
        val canCreateTopics: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -118_334_855
    }

    class ChatPhoto(
        @JvmField
        val id: Long,
        @JvmField
        val addedDate: Int,
        @JvmField
        val minithumbnail: Minithumbnail?,
        @JvmField
        val sizes: Array<PhotoSize>,
        @JvmField
        val animation: AnimatedChatPhoto?,
        @JvmField
        val smallAnimation: AnimatedChatPhoto?,
        @JvmField
        val sticker: ChatPhotoSticker?,
    ) : Object() {
        override fun getConstructor(): Int = -1_430_870_201
    }

    class ChatPhotoInfo(
        @JvmField
        val small: File,
        @JvmField
        val big: File,
        @JvmField
        val minithumbnail: Minithumbnail?,
        @JvmField
        val hasAnimation: Boolean,
        @JvmField
        val isPersonal: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 281_195_686
    }

    class ChatPhotoSticker(
        @JvmField
        val type: ChatPhotoStickerType,
        @JvmField
        val backgroundFill: BackgroundFill,
    ) : Object() {
        override fun getConstructor(): Int = -1_459_387_485
    }

    abstract class ChatPhotoStickerType : Object()

    class ChatPhotoStickerTypeRegularOrMask(
        @JvmField
        val stickerSetId: Long,
        @JvmField
        val stickerId: Long,
    ) : ChatPhotoStickerType() {
        override fun getConstructor(): Int = -415_147_620
    }

    class ChatPhotoStickerTypeCustomEmoji(
        @JvmField
        val customEmojiId: Long,
    ) : ChatPhotoStickerType() {
        override fun getConstructor(): Int = -266_224_943
    }

    class ChatPhotos(
        @JvmField
        val totalCount: Int,
        @JvmField
        val photos: Array<ChatPhoto>,
    ) : Object() {
        override fun getConstructor(): Int = -1_510_699_180
    }

    class ChatPosition(
        @JvmField
        val list: ChatList,
        @JvmField
        val order: Long,
        @JvmField
        val isPinned: Boolean,
        @JvmField
        val source: ChatSource?,
    ) : Object() {
        override fun getConstructor(): Int = -622_557_355
    }

    class ChatRevenueAmount(
        @JvmField
        val cryptocurrency: String,
        @JvmField
        val totalAmount: Long,
        @JvmField
        val balanceAmount: Long,
        @JvmField
        val availableAmount: Long,
        @JvmField
        val withdrawalEnabled: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -1_505_178_024
    }

    class ChatRevenueStatistics(
        @JvmField
        val revenueByHourGraph: StatisticalGraph,
        @JvmField
        val revenueGraph: StatisticalGraph,
        @JvmField
        val revenueAmount: ChatRevenueAmount,
        @JvmField
        val usdRate: Double,
    ) : Object() {
        override fun getConstructor(): Int = 1_667_438_779
    }

    class ChatRevenueTransaction(
        @JvmField
        val cryptocurrency: String,
        @JvmField
        val cryptocurrencyAmount: Long,
        @JvmField
        val type: ChatRevenueTransactionType,
    ) : Object() {
        override fun getConstructor(): Int = 80_192_767
    }

    abstract class ChatRevenueTransactionType : Object()

    class ChatRevenueTransactionTypeEarnings(
        @JvmField
        val startDate: Int,
        @JvmField
        val endDate: Int,
    ) : ChatRevenueTransactionType() {
        override fun getConstructor(): Int = -400_776_056
    }

    class ChatRevenueTransactionTypeWithdrawal(
        @JvmField
        val withdrawalDate: Int,
        @JvmField
        val provider: String,
        @JvmField
        val state: RevenueWithdrawalState,
    ) : ChatRevenueTransactionType() {
        override fun getConstructor(): Int = 252_939_755
    }

    class ChatRevenueTransactionTypeRefund(
        @JvmField
        val refundDate: Int,
        @JvmField
        val provider: String,
    ) : ChatRevenueTransactionType() {
        override fun getConstructor(): Int = 302_430_279
    }

    class ChatRevenueTransactions(
        @JvmField
        val totalCount: Int,
        @JvmField
        val transactions: Array<ChatRevenueTransaction>,
    ) : Object() {
        override fun getConstructor(): Int = -553_258_171
    }

    abstract class ChatSource : Object()

    class ChatSourceMtprotoProxy : ChatSource() {
        override fun getConstructor(): Int = 394_074_115
    }

    class ChatSourcePublicServiceAnnouncement(
        @JvmField
        val type: String,
        @JvmField
        val text: String,
    ) : ChatSource() {
        override fun getConstructor(): Int = -328_571_244
    }

    abstract class ChatStatistics : Object()

    class ChatStatisticsSupergroup(
        @JvmField
        val period: DateRange,
        @JvmField
        val memberCount: StatisticalValue,
        @JvmField
        val messageCount: StatisticalValue,
        @JvmField
        val viewerCount: StatisticalValue,
        @JvmField
        val senderCount: StatisticalValue,
        @JvmField
        val memberCountGraph: StatisticalGraph,
        @JvmField
        val joinGraph: StatisticalGraph,
        @JvmField
        val joinBySourceGraph: StatisticalGraph,
        @JvmField
        val languageGraph: StatisticalGraph,
        @JvmField
        val messageContentGraph: StatisticalGraph,
        @JvmField
        val actionGraph: StatisticalGraph,
        @JvmField
        val dayGraph: StatisticalGraph,
        @JvmField
        val weekGraph: StatisticalGraph,
        @JvmField
        val topSenders: Array<ChatStatisticsMessageSenderInfo>,
        @JvmField
        val topAdministrators: Array<ChatStatisticsAdministratorActionsInfo>,
        @JvmField
        val topInviters: Array<ChatStatisticsInviterInfo>,
    ) : ChatStatistics() {
        override fun getConstructor(): Int = -17_244_633
    }

    class ChatStatisticsChannel(
        @JvmField
        val period: DateRange,
        @JvmField
        val memberCount: StatisticalValue,
        @JvmField
        val meanMessageViewCount: StatisticalValue,
        @JvmField
        val meanMessageShareCount: StatisticalValue,
        @JvmField
        val meanMessageReactionCount: StatisticalValue,
        @JvmField
        val meanStoryViewCount: StatisticalValue,
        @JvmField
        val meanStoryShareCount: StatisticalValue,
        @JvmField
        val meanStoryReactionCount: StatisticalValue,
        @JvmField
        val enabledNotificationsPercentage: Double,
        @JvmField
        val memberCountGraph: StatisticalGraph,
        @JvmField
        val joinGraph: StatisticalGraph,
        @JvmField
        val muteGraph: StatisticalGraph,
        @JvmField
        val viewCountByHourGraph: StatisticalGraph,
        @JvmField
        val viewCountBySourceGraph: StatisticalGraph,
        @JvmField
        val joinBySourceGraph: StatisticalGraph,
        @JvmField
        val languageGraph: StatisticalGraph,
        @JvmField
        val messageInteractionGraph: StatisticalGraph,
        @JvmField
        val messageReactionGraph: StatisticalGraph,
        @JvmField
        val storyInteractionGraph: StatisticalGraph,
        @JvmField
        val storyReactionGraph: StatisticalGraph,
        @JvmField
        val instantViewInteractionGraph: StatisticalGraph,
        @JvmField
        val recentInteractions: Array<ChatStatisticsInteractionInfo>,
    ) : ChatStatistics() {
        override fun getConstructor(): Int = -1_375_151_660
    }

    class ChatStatisticsAdministratorActionsInfo(
        @JvmField
        val userId: Long,
        @JvmField
        val deletedMessageCount: Int,
        @JvmField
        val bannedUserCount: Int,
        @JvmField
        val restrictedUserCount: Int,
    ) : Object() {
        override fun getConstructor(): Int = -406_467_202
    }

    class ChatStatisticsInteractionInfo(
        @JvmField
        val objectType: ChatStatisticsObjectType,
        @JvmField
        val viewCount: Int,
        @JvmField
        val forwardCount: Int,
        @JvmField
        val reactionCount: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_766_496_909
    }

    class ChatStatisticsInviterInfo(
        @JvmField
        val userId: Long,
        @JvmField
        val addedMemberCount: Int,
    ) : Object() {
        override fun getConstructor(): Int = 629_396_619
    }

    class ChatStatisticsMessageSenderInfo(
        @JvmField
        val userId: Long,
        @JvmField
        val sentMessageCount: Int,
        @JvmField
        val averageCharacterCount: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_762_295_371
    }

    abstract class ChatStatisticsObjectType : Object()

    class ChatStatisticsObjectTypeMessage(
        @JvmField
        val messageId: Long,
    ) : ChatStatisticsObjectType() {
        override fun getConstructor(): Int = 1_872_700_662
    }

    class ChatStatisticsObjectTypeStory(
        @JvmField
        val storyId: Int,
    ) : ChatStatisticsObjectType() {
        override fun getConstructor(): Int = 364_575_152
    }

    class ChatTheme(
        @JvmField
        val name: String,
        @JvmField
        val lightSettings: ThemeSettings,
        @JvmField
        val darkSettings: ThemeSettings,
    ) : Object() {
        override fun getConstructor(): Int = -113_218_503
    }

    abstract class ChatType : Object()

    class ChatTypePrivate(
        @JvmField
        val userId: Long,
    ) : ChatType() {
        override fun getConstructor(): Int = 1_579_049_844
    }

    class ChatTypeBasicGroup(
        @JvmField
        val basicGroupId: Long,
    ) : ChatType() {
        override fun getConstructor(): Int = 973_884_508
    }

    class ChatTypeSupergroup(
        @JvmField
        val supergroupId: Long,
        @JvmField
        val isChannel: Boolean,
    ) : ChatType() {
        override fun getConstructor(): Int = -1_472_570_774
    }

    class ChatTypeSecret(
        @JvmField
        val secretChatId: Int,
        @JvmField
        val userId: Long,
    ) : ChatType() {
        override fun getConstructor(): Int = 862_366_513
    }

    class Chats(
        @JvmField
        val totalCount: Int,
        @JvmField
        val chatIds: LongArray,
    ) : Object() {
        override fun getConstructor(): Int = 1_809_654_812
    }

    abstract class CheckChatUsernameResult : Object()

    class CheckChatUsernameResultOk : CheckChatUsernameResult() {
        override fun getConstructor(): Int = -1_498_956_964
    }

    class CheckChatUsernameResultUsernameInvalid : CheckChatUsernameResult() {
        override fun getConstructor(): Int = -636_979_370
    }

    class CheckChatUsernameResultUsernameOccupied : CheckChatUsernameResult() {
        override fun getConstructor(): Int = 1_320_892_201
    }

    class CheckChatUsernameResultUsernamePurchasable : CheckChatUsernameResult() {
        override fun getConstructor(): Int = 5_885_529
    }

    class CheckChatUsernameResultPublicChatsTooMany : CheckChatUsernameResult() {
        override fun getConstructor(): Int = -659_264_388
    }

    class CheckChatUsernameResultPublicGroupsUnavailable : CheckChatUsernameResult() {
        override fun getConstructor(): Int = -51_833_641
    }

    abstract class CheckStickerSetNameResult : Object()

    class CheckStickerSetNameResultOk : CheckStickerSetNameResult() {
        override fun getConstructor(): Int = -1_404_308_904
    }

    class CheckStickerSetNameResultNameInvalid : CheckStickerSetNameResult() {
        override fun getConstructor(): Int = 177_992_244
    }

    class CheckStickerSetNameResultNameOccupied : CheckStickerSetNameResult() {
        override fun getConstructor(): Int = 1_012_980_872
    }

    class Checklist(
        @JvmField
        val title: FormattedText,
        @JvmField
        val tasks: Array<ChecklistTask>,
        @JvmField
        val othersCanAddTasks: Boolean,
        @JvmField
        val canAddTasks: Boolean,
        @JvmField
        val othersCanMarkTasksAsDone: Boolean,
        @JvmField
        val canMarkTasksAsDone: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -987_598_247
    }

    class ChecklistTask(
        @JvmField
        val id: Int,
        @JvmField
        val text: FormattedText,
        @JvmField
        val completedByUserId: Long,
        @JvmField
        val completionDate: Int,
    ) : Object() {
        override fun getConstructor(): Int = 772_992_512
    }

    class CloseBirthdayUser(
        @JvmField
        val userId: Long,
        @JvmField
        val birthdate: Birthdate,
    ) : Object() {
        override fun getConstructor(): Int = -2_147_067_410
    }

    class ClosedVectorPath(
        @JvmField
        val commands: Array<VectorPathCommand>,
    ) : Object() {
        override fun getConstructor(): Int = 589_951_657
    }

    class CollectibleItemInfo(
        @JvmField
        val purchaseDate: Int,
        @JvmField
        val currency: String,
        @JvmField
        val amount: Long,
        @JvmField
        val cryptocurrency: String,
        @JvmField
        val cryptocurrencyAmount: Long,
        @JvmField
        val url: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_460_640_717
    }

    abstract class CollectibleItemType : Object()

    class CollectibleItemTypeUsername(
        @JvmField
        val username: String,
    ) : CollectibleItemType() {
        override fun getConstructor(): Int = 458_680_273
    }

    class CollectibleItemTypePhoneNumber(
        @JvmField
        val phoneNumber: String,
    ) : CollectibleItemType() {
        override fun getConstructor(): Int = 1_256_251_714
    }

    class ConnectedAffiliateProgram(
        @JvmField
        val url: String,
        @JvmField
        val botUserId: Long,
        @JvmField
        val parameters: AffiliateProgramParameters,
        @JvmField
        val connectionDate: Int,
        @JvmField
        val isDisconnected: Boolean,
        @JvmField
        val userCount: Long,
        @JvmField
        val revenueStarCount: Long,
    ) : Object() {
        override fun getConstructor(): Int = 1_488_942_101
    }

    class ConnectedAffiliatePrograms(
        @JvmField
        val totalCount: Int,
        @JvmField
        val programs: Array<ConnectedAffiliateProgram>,
        @JvmField
        val nextOffset: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_505_880_847
    }

    class ConnectedWebsite(
        @JvmField
        val id: Long,
        @JvmField
        val domainName: String,
        @JvmField
        val botUserId: Long,
        @JvmField
        val browser: String,
        @JvmField
        val platform: String,
        @JvmField
        val logInDate: Int,
        @JvmField
        val lastActiveDate: Int,
        @JvmField
        val ipAddress: String,
        @JvmField
        val location: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_978_115_978
    }

    class ConnectedWebsites(
        @JvmField
        val websites: Array<ConnectedWebsite>,
    ) : Object() {
        override fun getConstructor(): Int = -1_727_949_694
    }

    abstract class ConnectionState : Object()

    class ConnectionStateWaitingForNetwork : ConnectionState() {
        override fun getConstructor(): Int = 1_695_405_912
    }

    class ConnectionStateConnectingToProxy : ConnectionState() {
        override fun getConstructor(): Int = -93_187_239
    }

    class ConnectionStateConnecting : ConnectionState() {
        override fun getConstructor(): Int = -1_298_400_670
    }

    class ConnectionStateUpdating : ConnectionState() {
        override fun getConstructor(): Int = -188_104_009
    }

    class ConnectionStateReady : ConnectionState() {
        override fun getConstructor(): Int = 48_608_492
    }

    class Contact(
        @JvmField
        val phoneNumber: String,
        @JvmField
        val firstName: String,
        @JvmField
        val lastName: String,
        @JvmField
        val vcard: String,
        @JvmField
        val userId: Long,
    ) : Object() {
        override fun getConstructor(): Int = -1_993_844_876
    }

    class Count(
        @JvmField
        val count: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_295_577_348
    }

    class Countries(
        @JvmField
        val countries: Array<CountryInfo>,
    ) : Object() {
        override fun getConstructor(): Int = 1_854_211_813
    }

    class CountryInfo(
        @JvmField
        val countryCode: String,
        @JvmField
        val name: String,
        @JvmField
        val englishName: String,
        @JvmField
        val isHidden: Boolean,
        @JvmField
        val callingCodes: Array<String>,
    ) : Object() {
        override fun getConstructor(): Int = 1_617_195_722
    }

    class CreatedBasicGroupChat(
        @JvmField
        val chatId: Long,
        @JvmField
        val failedToAddMembers: FailedToAddMembers,
    ) : Object() {
        override fun getConstructor(): Int = -20_417_068
    }

    class CurrentWeather(
        @JvmField
        val temperature: Double,
        @JvmField
        val emoji: String,
    ) : Object() {
        override fun getConstructor(): Int = -355_555_136
    }

    class CustomRequestResult(
        @JvmField
        val result: String,
    ) : Object() {
        override fun getConstructor(): Int = -2_009_960_452
    }

    class Data(
        @JvmField
        val data: ByteArray,
    ) : Object() {
        override fun getConstructor(): Int = 221_197_337
    }

    class DatabaseStatistics(
        @JvmField
        val statistics: String,
    ) : Object() {
        override fun getConstructor(): Int = -1_123_912_880
    }

    class Date(
        @JvmField
        val day: Int,
        @JvmField
        val month: Int,
        @JvmField
        val year: Int,
    ) : Object() {
        override fun getConstructor(): Int = -277_956_960
    }

    class DateRange(
        @JvmField
        val startDate: Int,
        @JvmField
        val endDate: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_360_333_926
    }

    class DatedFile(
        @JvmField
        val file: File,
        @JvmField
        val date: Int,
    ) : Object() {
        override fun getConstructor(): Int = -1_840_795_491
    }

    class DeepLinkInfo(
        @JvmField
        val text: FormattedText,
        @JvmField
        val needUpdateApplication: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_864_081_662
    }

    abstract class DeviceToken : Object()

    class DeviceTokenFirebaseCloudMessaging(
        @JvmField
        val token: String,
        @JvmField
        val encrypt: Boolean,
    ) : DeviceToken() {
        override fun getConstructor(): Int = -797_881_849
    }

    class DeviceTokenApplePush(
        @JvmField
        val deviceToken: String,
        @JvmField
        val isAppSandbox: Boolean,
    ) : DeviceToken() {
        override fun getConstructor(): Int = 387_541_955
    }

    class DeviceTokenApplePushVoIP(
        @JvmField
        val deviceToken: String,
        @JvmField
        val isAppSandbox: Boolean,
        @JvmField
        val encrypt: Boolean,
    ) : DeviceToken() {
        override fun getConstructor(): Int = 804_275_689
    }

    class DeviceTokenWindowsPush(
        @JvmField
        val accessToken: String,
    ) : DeviceToken() {
        override fun getConstructor(): Int = -1_410_514_289
    }

    class DeviceTokenMicrosoftPush(
        @JvmField
        val channelUri: String,
    ) : DeviceToken() {
        override fun getConstructor(): Int = 1_224_269_900
    }

    class DeviceTokenMicrosoftPushVoIP(
        @JvmField
        val channelUri: String,
    ) : DeviceToken() {
        override fun getConstructor(): Int = -785_603_759
    }

    class DeviceTokenWebPush(
        @JvmField
        val endpoint: String,
        @JvmField
        val p256dhBase64url: String,
        @JvmField
        val authBase64url: String,
    ) : DeviceToken() {
        override fun getConstructor(): Int = -1_694_507_273
    }

    class DeviceTokenSimplePush(
        @JvmField
        val endpoint: String,
    ) : DeviceToken() {
        override fun getConstructor(): Int = 49_584_736
    }

    class DeviceTokenUbuntuPush(
        @JvmField
        val token: String,
    ) : DeviceToken() {
        override fun getConstructor(): Int = 1_782_320_422
    }

    class DeviceTokenBlackBerryPush(
        @JvmField
        val token: String,
    ) : DeviceToken() {
        override fun getConstructor(): Int = 1_559_167_234
    }

    class DeviceTokenTizenPush(
        @JvmField
        val regId: String,
    ) : DeviceToken() {
        override fun getConstructor(): Int = -1_359_947_213
    }

    class DeviceTokenHuaweiPush(
        @JvmField
        val token: String,
        @JvmField
        val encrypt: Boolean,
    ) : DeviceToken() {
        override fun getConstructor(): Int = 1_989_103_142
    }

    abstract class DiceStickers : Object()

    class DiceStickersRegular(
        @JvmField
        val sticker: Sticker,
    ) : DiceStickers() {
        override fun getConstructor(): Int = -740_299_570
    }

    class DiceStickersSlotMachine(
        @JvmField
        val background: Sticker,
        @JvmField
        val lever: Sticker,
        @JvmField
        val leftReel: Sticker,
        @JvmField
        val centerReel: Sticker,
        @JvmField
        val rightReel: Sticker,
    ) : DiceStickers() {
        override fun getConstructor(): Int = -375_223_124
    }

    class DirectMessagesChatTopic(
        @JvmField
        val chatId: Long,
        @JvmField
        val id: Long,
        @JvmField
        val senderId: MessageSender,
        @JvmField
        val order: Long,
        @JvmField
        val canSendUnpaidMessages: Boolean,
        @JvmField
        val isMarkedAsUnread: Boolean,
        @JvmField
        val unreadCount: Long,
        @JvmField
        val lastReadInboxMessageId: Long,
        @JvmField
        val lastReadOutboxMessageId: Long,
        @JvmField
        val unreadReactionCount: Long,
        @JvmField
        val lastMessage: Message?,
        @JvmField
        val draftMessage: DraftMessage?,
    ) : Object() {
        override fun getConstructor(): Int = 1_778_377_757
    }

    class Document(
        @JvmField
        val fileName: String,
        @JvmField
        val mimeType: String,
        @JvmField
        val minithumbnail: Minithumbnail?,
        @JvmField
        val thumbnail: Thumbnail?,
        @JvmField
        val document: File,
    ) : Object() {
        override fun getConstructor(): Int = -1_357_271_080
    }

    class DownloadedFileCounts(
        @JvmField
        val activeCount: Int,
        @JvmField
        val pausedCount: Int,
        @JvmField
        val completedCount: Int,
    ) : Object() {
        override fun getConstructor(): Int = -1_973_999_550
    }

    class DraftMessage(
        @JvmField
        val replyTo: InputMessageReplyTo?,
        @JvmField
        val date: Int,
        @JvmField
        val inputMessageText: InputMessageContent,
        @JvmField
        val effectId: Long,
    ) : Object() {
        override fun getConstructor(): Int = 1_125_328_749
    }

    abstract class EmailAddressAuthentication : Object()

    class EmailAddressAuthenticationCode(
        @JvmField
        val code: String,
    ) : EmailAddressAuthentication() {
        override fun getConstructor(): Int = -993_257_022
    }

    class EmailAddressAuthenticationAppleId(
        @JvmField
        val token: String,
    ) : EmailAddressAuthentication() {
        override fun getConstructor(): Int = 633_948_265
    }

    class EmailAddressAuthenticationGoogleId(
        @JvmField
        val token: String,
    ) : EmailAddressAuthentication() {
        override fun getConstructor(): Int = -19_142_846
    }

    class EmailAddressAuthenticationCodeInfo(
        @JvmField
        val emailAddressPattern: String,
        @JvmField
        val length: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_151_066_659
    }

    abstract class EmailAddressResetState : Object()

    class EmailAddressResetStateAvailable(
        @JvmField
        val waitPeriod: Int,
    ) : EmailAddressResetState() {
        override fun getConstructor(): Int = -1_917_177_600
    }

    class EmailAddressResetStatePending(
        @JvmField
        val resetIn: Int,
    ) : EmailAddressResetState() {
        override fun getConstructor(): Int = -1_885_966_805
    }

    class EmojiCategories(
        @JvmField
        val categories: Array<EmojiCategory>,
    ) : Object() {
        override fun getConstructor(): Int = -1_455_387_824
    }

    class EmojiCategory(
        @JvmField
        val name: String,
        @JvmField
        val icon: Sticker,
        @JvmField
        val source: EmojiCategorySource,
        @JvmField
        val isGreeting: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 571_335_919
    }

    abstract class EmojiCategorySource : Object()

    class EmojiCategorySourceSearch(
        @JvmField
        val emojis: Array<String>,
    ) : EmojiCategorySource() {
        override fun getConstructor(): Int = -453_260_262
    }

    class EmojiCategorySourcePremium : EmojiCategorySource() {
        override fun getConstructor(): Int = -1_932_358_388
    }

    abstract class EmojiCategoryType : Object()

    class EmojiCategoryTypeDefault : EmojiCategoryType() {
        override fun getConstructor(): Int = 1_188_782_699
    }

    class EmojiCategoryTypeRegularStickers : EmojiCategoryType() {
        override fun getConstructor(): Int = -1_337_484_846
    }

    class EmojiCategoryTypeEmojiStatus : EmojiCategoryType() {
        override fun getConstructor(): Int = 1_381_282_631
    }

    class EmojiCategoryTypeChatPhoto : EmojiCategoryType() {
        override fun getConstructor(): Int = 1_059_063_081
    }

    class EmojiKeyword(
        @JvmField
        val emoji: String,
        @JvmField
        val keyword: String,
    ) : Object() {
        override fun getConstructor(): Int = -2_112_285_985
    }

    class EmojiKeywords(
        @JvmField
        val emojiKeywords: Array<EmojiKeyword>,
    ) : Object() {
        override fun getConstructor(): Int = 689_723_339
    }

    class EmojiReaction(
        @JvmField
        val emoji: String,
        @JvmField
        val title: String,
        @JvmField
        val isActive: Boolean,
        @JvmField
        val staticIcon: Sticker,
        @JvmField
        val appearAnimation: Sticker,
        @JvmField
        val selectAnimation: Sticker,
        @JvmField
        val activateAnimation: Sticker,
        @JvmField
        val effectAnimation: Sticker,
        @JvmField
        val aroundAnimation: Sticker?,
        @JvmField
        val centerAnimation: Sticker?,
    ) : Object() {
        override fun getConstructor(): Int = 1_616_063_583
    }

    class EmojiStatus(
        @JvmField
        val type: EmojiStatusType,
        @JvmField
        val expirationDate: Int,
    ) : Object() {
        override fun getConstructor(): Int = 973_424_912
    }

    class EmojiStatusCustomEmojis(
        @JvmField
        val customEmojiIds: LongArray,
    ) : Object() {
        override fun getConstructor(): Int = 917_123_337
    }

    abstract class EmojiStatusType : Object()

    class EmojiStatusTypeCustomEmoji(
        @JvmField
        val customEmojiId: Long,
    ) : EmojiStatusType() {
        override fun getConstructor(): Int = -1_666_780_939
    }

    class EmojiStatusTypeUpgradedGift(
        @JvmField
        val upgradedGiftId: Long,
        @JvmField
        val giftTitle: String,
        @JvmField
        val giftName: String,
        @JvmField
        val modelCustomEmojiId: Long,
        @JvmField
        val symbolCustomEmojiId: Long,
        @JvmField
        val backdropColors: UpgradedGiftBackdropColors,
    ) : EmojiStatusType() {
        override fun getConstructor(): Int = -837_921_804
    }

    class EmojiStatuses(
        @JvmField
        val emojiStatuses: Array<EmojiStatus>,
    ) : Object() {
        override fun getConstructor(): Int = 1_186_104_146
    }

    class Emojis(
        @JvmField
        val emojis: Array<String>,
    ) : Object() {
        override fun getConstructor(): Int = 950_339_552
    }

    class EncryptedCredentials(
        @JvmField
        val data: ByteArray,
        @JvmField
        val hash: ByteArray,
        @JvmField
        val secret: ByteArray,
    ) : Object() {
        override fun getConstructor(): Int = 1_331_106_766
    }

    class EncryptedPassportElement(
        @JvmField
        val type: PassportElementType,
        @JvmField
        val data: ByteArray,
        @JvmField
        val frontSide: DatedFile,
        @JvmField
        val reverseSide: DatedFile?,
        @JvmField
        val selfie: DatedFile?,
        @JvmField
        val translation: Array<DatedFile>,
        @JvmField
        val files: Array<DatedFile>,
        @JvmField
        val value: String,
        @JvmField
        val hash: String,
    ) : Object() {
        override fun getConstructor(): Int = 2_002_386_193
    }

    class Error(
        @JvmField
        val code: Int,
        @JvmField
        val message: String,
    ) : Object() {
        override fun getConstructor(): Int = -1_679_978_726
    }

    class FactCheck(
        @JvmField
        val text: FormattedText,
        @JvmField
        val countryCode: String,
    ) : Object() {
        override fun getConstructor(): Int = -1_048_184_552
    }

    class FailedToAddMember(
        @JvmField
        val userId: Long,
        @JvmField
        val premiumWouldAllowInvite: Boolean,
        @JvmField
        val premiumRequiredToSendMessages: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -282_891_070
    }

    class FailedToAddMembers(
        @JvmField
        val failedToAddMembers: Array<FailedToAddMember>,
    ) : Object() {
        override fun getConstructor(): Int = -272_587_152
    }

    class File(
        @JvmField
        val id: Int,
        @JvmField
        val size: Long,
        @JvmField
        val expectedSize: Long,
        @JvmField
        val local: LocalFile,
        @JvmField
        val remote: RemoteFile,
    ) : Object() {
        override fun getConstructor(): Int = 1_263_291_956
    }

    class FileDownload(
        @JvmField
        val fileId: Int,
        @JvmField
        val message: Message,
        @JvmField
        val addDate: Int,
        @JvmField
        val completeDate: Int,
        @JvmField
        val isPaused: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -2_092_100_780
    }

    class FileDownloadedPrefixSize(
        @JvmField
        val size: Long,
    ) : Object() {
        override fun getConstructor(): Int = -2_015_205_381
    }

    abstract class FileType : Object()

    class FileTypeNone : FileType() {
        override fun getConstructor(): Int = 2_003_009_189
    }

    class FileTypeAnimation : FileType() {
        override fun getConstructor(): Int = -290_816_582
    }

    class FileTypeAudio : FileType() {
        override fun getConstructor(): Int = -709_112_160
    }

    class FileTypeDocument : FileType() {
        override fun getConstructor(): Int = -564_722_929
    }

    class FileTypeNotificationSound : FileType() {
        override fun getConstructor(): Int = -1_020_289_271
    }

    class FileTypePhoto : FileType() {
        override fun getConstructor(): Int = -1_718_914_651
    }

    class FileTypePhotoStory : FileType() {
        override fun getConstructor(): Int = 2_018_995_956
    }

    class FileTypeProfilePhoto : FileType() {
        override fun getConstructor(): Int = 1_795_089_315
    }

    class FileTypeSecret : FileType() {
        override fun getConstructor(): Int = -1_871_899_401
    }

    class FileTypeSecretThumbnail : FileType() {
        override fun getConstructor(): Int = -1_401_326_026
    }

    class FileTypeSecure : FileType() {
        override fun getConstructor(): Int = -1_419_133_146
    }

    class FileTypeSelfDestructingPhoto : FileType() {
        override fun getConstructor(): Int = 2_077_176_475
    }

    class FileTypeSelfDestructingVideo : FileType() {
        override fun getConstructor(): Int = -1_223_900_123
    }

    class FileTypeSelfDestructingVideoNote : FileType() {
        override fun getConstructor(): Int = 1_495_274_177
    }

    class FileTypeSelfDestructingVoiceNote : FileType() {
        override fun getConstructor(): Int = 1_691_409_181
    }

    class FileTypeSticker : FileType() {
        override fun getConstructor(): Int = 475_233_385
    }

    class FileTypeThumbnail : FileType() {
        override fun getConstructor(): Int = -12_443_298
    }

    class FileTypeUnknown : FileType() {
        override fun getConstructor(): Int = -2_011_566_768
    }

    class FileTypeVideo : FileType() {
        override fun getConstructor(): Int = 1_430_816_539
    }

    class FileTypeVideoNote : FileType() {
        override fun getConstructor(): Int = -518_412_385
    }

    class FileTypeVideoStory : FileType() {
        override fun getConstructor(): Int = -2_146_754_143
    }

    class FileTypeVoiceNote : FileType() {
        override fun getConstructor(): Int = -588_681_661
    }

    class FileTypeWallpaper : FileType() {
        override fun getConstructor(): Int = 1_854_930_076
    }

    abstract class FirebaseAuthenticationSettings : Object()

    class FirebaseAuthenticationSettingsAndroid : FirebaseAuthenticationSettings() {
        override fun getConstructor(): Int = -1_771_112_932
    }

    class FirebaseAuthenticationSettingsIos(
        @JvmField
        val deviceToken: String,
        @JvmField
        val isAppSandbox: Boolean,
    ) : FirebaseAuthenticationSettings() {
        override fun getConstructor(): Int = 222_930_116
    }

    abstract class FirebaseDeviceVerificationParameters : Object()

    class FirebaseDeviceVerificationParametersSafetyNet(
        @JvmField
        val nonce: ByteArray,
    ) : FirebaseDeviceVerificationParameters() {
        override fun getConstructor(): Int = 731_296_497
    }

    class FirebaseDeviceVerificationParametersPlayIntegrity(
        @JvmField
        val nonce: String,
        @JvmField
        val cloudProjectNumber: Long,
    ) : FirebaseDeviceVerificationParameters() {
        override fun getConstructor(): Int = -889_936_502
    }

    class FormattedText(
        @JvmField
        val text: String,
        @JvmField
        val entities: Array<TextEntity>,
    ) : Object() {
        override fun getConstructor(): Int = -252_624_564
    }

    class ForumTopic(
        @JvmField
        val info: ForumTopicInfo,
        @JvmField
        val lastMessage: Message?,
        @JvmField
        val order: Long,
        @JvmField
        val isPinned: Boolean,
        @JvmField
        val unreadCount: Int,
        @JvmField
        val lastReadInboxMessageId: Long,
        @JvmField
        val lastReadOutboxMessageId: Long,
        @JvmField
        val unreadMentionCount: Int,
        @JvmField
        val unreadReactionCount: Int,
        @JvmField
        val notificationSettings: ChatNotificationSettings,
        @JvmField
        val draftMessage: DraftMessage?,
    ) : Object() {
        override fun getConstructor(): Int = -2_094_608_976
    }

    class ForumTopicIcon(
        @JvmField
        val color: Int,
        @JvmField
        val customEmojiId: Long,
    ) : Object() {
        override fun getConstructor(): Int = -818_765_421
    }

    class ForumTopicInfo(
        @JvmField
        val chatId: Long,
        @JvmField
        val forumTopicId: Long,
        @JvmField
        val messageThreadId: Long,
        @JvmField
        val name: String,
        @JvmField
        val icon: ForumTopicIcon,
        @JvmField
        val creationDate: Int,
        @JvmField
        val creatorId: MessageSender,
        @JvmField
        val isGeneral: Boolean,
        @JvmField
        val isOutgoing: Boolean,
        @JvmField
        val isClosed: Boolean,
        @JvmField
        val isHidden: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_573_650_873
    }

    class ForumTopics(
        @JvmField
        val totalCount: Int,
        @JvmField
        val topics: Array<ForumTopic>,
        @JvmField
        val nextOffsetDate: Int,
        @JvmField
        val nextOffsetMessageId: Long,
        @JvmField
        val nextOffsetMessageThreadId: Long,
    ) : Object() {
        override fun getConstructor(): Int = 732_819_537
    }

    class ForwardSource(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val senderId: MessageSender?,
        @JvmField
        val senderName: String,
        @JvmField
        val date: Int,
        @JvmField
        val isOutgoing: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_795_337_929
    }

    class FoundAffiliateProgram(
        @JvmField
        val botUserId: Long,
        @JvmField
        val info: AffiliateProgramInfo,
    ) : Object() {
        override fun getConstructor(): Int = -966_565_242
    }

    class FoundAffiliatePrograms(
        @JvmField
        val totalCount: Int,
        @JvmField
        val programs: Array<FoundAffiliateProgram>,
        @JvmField
        val nextOffset: String,
    ) : Object() {
        override fun getConstructor(): Int = 186_317_057
    }

    class FoundChatBoosts(
        @JvmField
        val totalCount: Int,
        @JvmField
        val boosts: Array<ChatBoost>,
        @JvmField
        val nextOffset: String,
    ) : Object() {
        override fun getConstructor(): Int = 51_457_680
    }

    class FoundChatMessages(
        @JvmField
        val totalCount: Int,
        @JvmField
        val messages: Array<Message>,
        @JvmField
        val nextFromMessageId: Long,
    ) : Object() {
        override fun getConstructor(): Int = 427_484_196
    }

    class FoundFileDownloads(
        @JvmField
        val totalCounts: DownloadedFileCounts,
        @JvmField
        val files: Array<FileDownload>,
        @JvmField
        val nextOffset: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_395_890_392
    }

    class FoundMessages(
        @JvmField
        val totalCount: Int,
        @JvmField
        val messages: Array<Message>,
        @JvmField
        val nextOffset: String,
    ) : Object() {
        override fun getConstructor(): Int = -529_809_608
    }

    class FoundPosition(
        @JvmField
        val position: Int,
    ) : Object() {
        override fun getConstructor(): Int = -1_886_724_216
    }

    class FoundPositions(
        @JvmField
        val totalCount: Int,
        @JvmField
        val positions: IntArray,
    ) : Object() {
        override fun getConstructor(): Int = -80_518_368
    }

    class FoundStories(
        @JvmField
        val totalCount: Int,
        @JvmField
        val stories: Array<Story>,
        @JvmField
        val nextOffset: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_678_513_512
    }

    class FoundUsers(
        @JvmField
        val userIds: LongArray,
        @JvmField
        val nextOffset: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_150_570_075
    }

    class FoundWebApp(
        @JvmField
        val webApp: WebApp,
        @JvmField
        val requestWriteAccess: Boolean,
        @JvmField
        val skipConfirmation: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -290_926_562
    }

    class Game(
        @JvmField
        val id: Long,
        @JvmField
        val shortName: String,
        @JvmField
        val title: String,
        @JvmField
        val text: FormattedText,
        @JvmField
        val description: String,
        @JvmField
        val photo: Photo,
        @JvmField
        val animation: Animation?,
    ) : Object() {
        override fun getConstructor(): Int = -1_565_597_752
    }

    class GameHighScore(
        @JvmField
        val position: Int,
        @JvmField
        val userId: Long,
        @JvmField
        val score: Int,
    ) : Object() {
        override fun getConstructor(): Int = 342_871_838
    }

    class GameHighScores(
        @JvmField
        val scores: Array<GameHighScore>,
    ) : Object() {
        override fun getConstructor(): Int = -725_770_727
    }

    class Gift(
        @JvmField
        val id: Long,
        @JvmField
        val sticker: Sticker,
        @JvmField
        val starCount: Long,
        @JvmField
        val defaultSellStarCount: Long,
        @JvmField
        val upgradeStarCount: Long,
        @JvmField
        val isForBirthday: Boolean,
        @JvmField
        val remainingCount: Int,
        @JvmField
        val totalCount: Int,
        @JvmField
        val firstSendDate: Int,
        @JvmField
        val lastSendDate: Int,
    ) : Object() {
        override fun getConstructor(): Int = 2_096_710_701
    }

    class GiftForResale(
        @JvmField
        val gift: UpgradedGift,
        @JvmField
        val receivedGiftId: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_130_990_515
    }

    abstract class GiftForResaleOrder : Object()

    class GiftForResaleOrderPrice : GiftForResaleOrder() {
        override fun getConstructor(): Int = 1_371_740_258
    }

    class GiftForResaleOrderPriceChangeDate : GiftForResaleOrder() {
        override fun getConstructor(): Int = -1_694_144_054
    }

    class GiftForResaleOrderNumber : GiftForResaleOrder() {
        override fun getConstructor(): Int = -1_301_157_632
    }

    class GiftSettings(
        @JvmField
        val showGiftButton: Boolean,
        @JvmField
        val acceptedGiftTypes: AcceptedGiftTypes,
    ) : Object() {
        override fun getConstructor(): Int = 45_783_168
    }

    class GiftUpgradePreview(
        @JvmField
        val models: Array<UpgradedGiftModel>,
        @JvmField
        val symbols: Array<UpgradedGiftSymbol>,
        @JvmField
        val backdrops: Array<UpgradedGiftBackdrop>,
    ) : Object() {
        override fun getConstructor(): Int = 729_908_218
    }

    class GiftsForResale(
        @JvmField
        val totalCount: Int,
        @JvmField
        val gifts: Array<GiftForResale>,
        @JvmField
        val models: Array<UpgradedGiftModelCount>,
        @JvmField
        val symbols: Array<UpgradedGiftSymbolCount>,
        @JvmField
        val backdrops: Array<UpgradedGiftBackdropCount>,
        @JvmField
        val nextOffset: String,
    ) : Object() {
        override fun getConstructor(): Int = 35_082_425
    }

    abstract class GiveawayInfo : Object()

    class GiveawayInfoOngoing(
        @JvmField
        val creationDate: Int,
        @JvmField
        val status: GiveawayParticipantStatus,
        @JvmField
        val isEnded: Boolean,
    ) : GiveawayInfo() {
        override fun getConstructor(): Int = 1_649_336_400
    }

    class GiveawayInfoCompleted(
        @JvmField
        val creationDate: Int,
        @JvmField
        val actualWinnersSelectionDate: Int,
        @JvmField
        val wasRefunded: Boolean,
        @JvmField
        val isWinner: Boolean,
        @JvmField
        val winnerCount: Int,
        @JvmField
        val activationCount: Int,
        @JvmField
        val giftCode: String,
        @JvmField
        val wonStarCount: Long,
    ) : GiveawayInfo() {
        override fun getConstructor(): Int = 848_085_852
    }

    class GiveawayParameters(
        @JvmField
        val boostedChatId: Long,
        @JvmField
        val additionalChatIds: LongArray,
        @JvmField
        val winnersSelectionDate: Int,
        @JvmField
        val onlyNewMembers: Boolean,
        @JvmField
        val hasPublicWinners: Boolean,
        @JvmField
        val countryCodes: Array<String>,
        @JvmField
        val prizeDescription: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_171_549_354
    }

    abstract class GiveawayParticipantStatus : Object()

    class GiveawayParticipantStatusEligible : GiveawayParticipantStatus() {
        override fun getConstructor(): Int = 304_799_383
    }

    class GiveawayParticipantStatusParticipating : GiveawayParticipantStatus() {
        override fun getConstructor(): Int = 492_036_975
    }

    class GiveawayParticipantStatusAlreadyWasMember(
        @JvmField
        val joinedChatDate: Int,
    ) : GiveawayParticipantStatus() {
        override fun getConstructor(): Int = 301_577_632
    }

    class GiveawayParticipantStatusAdministrator(
        @JvmField
        val chatId: Long,
    ) : GiveawayParticipantStatus() {
        override fun getConstructor(): Int = -934_593_931
    }

    class GiveawayParticipantStatusDisallowedCountry(
        @JvmField
        val userCountryCode: String,
    ) : GiveawayParticipantStatus() {
        override fun getConstructor(): Int = 1_879_794_779
    }

    abstract class GiveawayPrize : Object()

    class GiveawayPrizePremium(
        @JvmField
        val monthCount: Int,
    ) : GiveawayPrize() {
        override fun getConstructor(): Int = 454_224_248
    }

    class GiveawayPrizeStars(
        @JvmField
        val starCount: Long,
    ) : GiveawayPrize() {
        override fun getConstructor(): Int = -1_790_173_276
    }

    class GroupCall(
        @JvmField
        val id: Int,
        @JvmField
        val title: String,
        @JvmField
        val inviteLink: String,
        @JvmField
        val scheduledStartDate: Int,
        @JvmField
        val enabledStartNotification: Boolean,
        @JvmField
        val isActive: Boolean,
        @JvmField
        val isVideoChat: Boolean,
        @JvmField
        val isRtmpStream: Boolean,
        @JvmField
        val isJoined: Boolean,
        @JvmField
        val needRejoin: Boolean,
        @JvmField
        val isOwned: Boolean,
        @JvmField
        val canBeManaged: Boolean,
        @JvmField
        val participantCount: Int,
        @JvmField
        val hasHiddenListeners: Boolean,
        @JvmField
        val loadedAllParticipants: Boolean,
        @JvmField
        val recentSpeakers: Array<GroupCallRecentSpeaker>,
        @JvmField
        val isMyVideoEnabled: Boolean,
        @JvmField
        val isMyVideoPaused: Boolean,
        @JvmField
        val canEnableVideo: Boolean,
        @JvmField
        val muteNewParticipants: Boolean,
        @JvmField
        val canToggleMuteNewParticipants: Boolean,
        @JvmField
        val recordDuration: Int,
        @JvmField
        val isVideoRecorded: Boolean,
        @JvmField
        val duration: Int,
    ) : Object() {
        override fun getConstructor(): Int = -144_438_687
    }

    abstract class GroupCallDataChannel : Object()

    class GroupCallDataChannelMain : GroupCallDataChannel() {
        override fun getConstructor(): Int = -32_177_779
    }

    class GroupCallDataChannelScreenSharing : GroupCallDataChannel() {
        override fun getConstructor(): Int = -601_649_103
    }

    class GroupCallId(
        @JvmField
        val id: Int,
    ) : Object() {
        override fun getConstructor(): Int = 350_534_469
    }

    class GroupCallInfo(
        @JvmField
        val groupCallId: Int,
        @JvmField
        val joinPayload: String,
    ) : Object() {
        override fun getConstructor(): Int = 892_575_956
    }

    class GroupCallJoinParameters(
        @JvmField
        val audioSourceId: Int,
        @JvmField
        val payload: String,
        @JvmField
        val isMuted: Boolean,
        @JvmField
        val isMyVideoEnabled: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_763_438_054
    }

    class GroupCallParticipant(
        @JvmField
        val participantId: MessageSender,
        @JvmField
        val audioSourceId: Int,
        @JvmField
        val screenSharingAudioSourceId: Int,
        @JvmField
        val videoInfo: GroupCallParticipantVideoInfo?,
        @JvmField
        val screenSharingVideoInfo: GroupCallParticipantVideoInfo?,
        @JvmField
        val bio: String,
        @JvmField
        val isCurrentUser: Boolean,
        @JvmField
        val isSpeaking: Boolean,
        @JvmField
        val isHandRaised: Boolean,
        @JvmField
        val canBeMutedForAllUsers: Boolean,
        @JvmField
        val canBeUnmutedForAllUsers: Boolean,
        @JvmField
        val canBeMutedForCurrentUser: Boolean,
        @JvmField
        val canBeUnmutedForCurrentUser: Boolean,
        @JvmField
        val isMutedForAllUsers: Boolean,
        @JvmField
        val isMutedForCurrentUser: Boolean,
        @JvmField
        val canUnmuteSelf: Boolean,
        @JvmField
        val volumeLevel: Int,
        @JvmField
        val order: String,
    ) : Object() {
        override fun getConstructor(): Int = 2_059_182_571
    }

    class GroupCallParticipantVideoInfo(
        @JvmField
        val sourceGroups: Array<GroupCallVideoSourceGroup>,
        @JvmField
        val endpointId: String,
        @JvmField
        val isPaused: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -14_294_645
    }

    class GroupCallParticipants(
        @JvmField
        val totalCount: Int,
        @JvmField
        val participantIds: Array<MessageSender>,
    ) : Object() {
        override fun getConstructor(): Int = -1_042_491_570
    }

    class GroupCallRecentSpeaker(
        @JvmField
        val participantId: MessageSender,
        @JvmField
        val isSpeaking: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_819_519_436
    }

    abstract class GroupCallVideoQuality : Object()

    class GroupCallVideoQualityThumbnail : GroupCallVideoQuality() {
        override fun getConstructor(): Int = -379_186_304
    }

    class GroupCallVideoQualityMedium : GroupCallVideoQuality() {
        override fun getConstructor(): Int = 394_968_234
    }

    class GroupCallVideoQualityFull : GroupCallVideoQuality() {
        override fun getConstructor(): Int = -2_125_916_617
    }

    class GroupCallVideoSourceGroup(
        @JvmField
        val semantics: String,
        @JvmField
        val sourceIds: IntArray,
    ) : Object() {
        override fun getConstructor(): Int = -1_190_900_785
    }

    class Hashtags(
        @JvmField
        val hashtags: Array<String>,
    ) : Object() {
        override fun getConstructor(): Int = 676_798_885
    }

    class HttpUrl(
        @JvmField
        val url: String,
    ) : Object() {
        override fun getConstructor(): Int = -2_018_019_930
    }

    class IdentityDocument(
        @JvmField
        val number: String,
        @JvmField
        val expirationDate: Date?,
        @JvmField
        val frontSide: DatedFile,
        @JvmField
        val reverseSide: DatedFile?,
        @JvmField
        val selfie: DatedFile?,
        @JvmField
        val translation: Array<DatedFile>,
    ) : Object() {
        override fun getConstructor(): Int = 1_001_703_606
    }

    class ImportedContacts(
        @JvmField
        val userIds: LongArray,
        @JvmField
        val importerCount: IntArray,
    ) : Object() {
        override fun getConstructor(): Int = 2_068_432_290
    }

    class InlineKeyboardButton(
        @JvmField
        val text: String,
        @JvmField
        val type: InlineKeyboardButtonType,
    ) : Object() {
        override fun getConstructor(): Int = -372_105_704
    }

    abstract class InlineKeyboardButtonType : Object()

    class InlineKeyboardButtonTypeUrl(
        @JvmField
        val url: String,
    ) : InlineKeyboardButtonType() {
        override fun getConstructor(): Int = 1_130_741_420
    }

    class InlineKeyboardButtonTypeLoginUrl(
        @JvmField
        val url: String,
        @JvmField
        val id: Long,
        @JvmField
        val forwardText: String,
    ) : InlineKeyboardButtonType() {
        override fun getConstructor(): Int = -1_203_413_081
    }

    class InlineKeyboardButtonTypeWebApp(
        @JvmField
        val url: String,
    ) : InlineKeyboardButtonType() {
        override fun getConstructor(): Int = -1_767_471_672
    }

    class InlineKeyboardButtonTypeCallback(
        @JvmField
        val data: ByteArray,
    ) : InlineKeyboardButtonType() {
        override fun getConstructor(): Int = -1_127_515_139
    }

    class InlineKeyboardButtonTypeCallbackWithPassword(
        @JvmField
        val data: ByteArray,
    ) : InlineKeyboardButtonType() {
        override fun getConstructor(): Int = 908_018_248
    }

    class InlineKeyboardButtonTypeCallbackGame : InlineKeyboardButtonType() {
        override fun getConstructor(): Int = -383_429_528
    }

    class InlineKeyboardButtonTypeSwitchInline(
        @JvmField
        val query: String,
        @JvmField
        val targetChat: TargetChat,
    ) : InlineKeyboardButtonType() {
        override fun getConstructor(): Int = 544_906_485
    }

    class InlineKeyboardButtonTypeBuy : InlineKeyboardButtonType() {
        override fun getConstructor(): Int = 1_360_739_440
    }

    class InlineKeyboardButtonTypeUser(
        @JvmField
        val userId: Long,
    ) : InlineKeyboardButtonType() {
        override fun getConstructor(): Int = 1_836_574_114
    }

    class InlineKeyboardButtonTypeCopyText(
        @JvmField
        val text: String,
    ) : InlineKeyboardButtonType() {
        override fun getConstructor(): Int = 68_883_206
    }

    abstract class InlineQueryResult : Object()

    class InlineQueryResultArticle(
        @JvmField
        val id: String,
        @JvmField
        val url: String,
        @JvmField
        val title: String,
        @JvmField
        val description: String,
        @JvmField
        val thumbnail: Thumbnail?,
    ) : InlineQueryResult() {
        override fun getConstructor(): Int = 269_930_522
    }

    class InlineQueryResultContact(
        @JvmField
        val id: String,
        @JvmField
        val contact: Contact,
        @JvmField
        val thumbnail: Thumbnail?,
    ) : InlineQueryResult() {
        override fun getConstructor(): Int = -181_960_174
    }

    class InlineQueryResultLocation(
        @JvmField
        val id: String,
        @JvmField
        val location: Location,
        @JvmField
        val title: String,
        @JvmField
        val thumbnail: Thumbnail?,
    ) : InlineQueryResult() {
        override fun getConstructor(): Int = 466_004_752
    }

    class InlineQueryResultVenue(
        @JvmField
        val id: String,
        @JvmField
        val venue: Venue,
        @JvmField
        val thumbnail: Thumbnail?,
    ) : InlineQueryResult() {
        override fun getConstructor(): Int = 1_281_036_382
    }

    class InlineQueryResultGame(
        @JvmField
        val id: String,
        @JvmField
        val game: Game,
    ) : InlineQueryResult() {
        override fun getConstructor(): Int = 1_706_916_987
    }

    class InlineQueryResultAnimation(
        @JvmField
        val id: String,
        @JvmField
        val animation: Animation,
        @JvmField
        val title: String,
    ) : InlineQueryResult() {
        override fun getConstructor(): Int = 2_009_984_267
    }

    class InlineQueryResultAudio(
        @JvmField
        val id: String,
        @JvmField
        val audio: Audio,
    ) : InlineQueryResult() {
        override fun getConstructor(): Int = 842_650_360
    }

    class InlineQueryResultDocument(
        @JvmField
        val id: String,
        @JvmField
        val document: Document,
        @JvmField
        val title: String,
        @JvmField
        val description: String,
    ) : InlineQueryResult() {
        override fun getConstructor(): Int = -1_491_268_539
    }

    class InlineQueryResultPhoto(
        @JvmField
        val id: String,
        @JvmField
        val photo: Photo,
        @JvmField
        val title: String,
        @JvmField
        val description: String,
    ) : InlineQueryResult() {
        override fun getConstructor(): Int = 1_848_319_440
    }

    class InlineQueryResultSticker(
        @JvmField
        val id: String,
        @JvmField
        val sticker: Sticker,
    ) : InlineQueryResult() {
        override fun getConstructor(): Int = -1_848_224_245
    }

    class InlineQueryResultVideo(
        @JvmField
        val id: String,
        @JvmField
        val video: Video,
        @JvmField
        val title: String,
        @JvmField
        val description: String,
    ) : InlineQueryResult() {
        override fun getConstructor(): Int = -1_373_158_683
    }

    class InlineQueryResultVoiceNote(
        @JvmField
        val id: String,
        @JvmField
        val voiceNote: VoiceNote,
        @JvmField
        val title: String,
    ) : InlineQueryResult() {
        override fun getConstructor(): Int = -1_897_393_105
    }

    class InlineQueryResults(
        @JvmField
        val inlineQueryId: Long,
        @JvmField
        val button: InlineQueryResultsButton?,
        @JvmField
        val results: Array<InlineQueryResult>,
        @JvmField
        val nextOffset: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_830_685_615
    }

    class InlineQueryResultsButton(
        @JvmField
        val text: String,
        @JvmField
        val type: InlineQueryResultsButtonType,
    ) : Object() {
        override fun getConstructor(): Int = -790_689_618
    }

    abstract class InlineQueryResultsButtonType : Object()

    class InlineQueryResultsButtonTypeStartBot(
        @JvmField
        val parameter: String,
    ) : InlineQueryResultsButtonType() {
        override fun getConstructor(): Int = -23_400_235
    }

    class InlineQueryResultsButtonTypeWebApp(
        @JvmField
        val url: String,
    ) : InlineQueryResultsButtonType() {
        override fun getConstructor(): Int = -1_197_382_814
    }

    abstract class InputBackground : Object()

    class InputBackgroundLocal(
        @JvmField
        val background: InputFile,
    ) : InputBackground() {
        override fun getConstructor(): Int = -1_747_094_364
    }

    class InputBackgroundRemote(
        @JvmField
        val backgroundId: Long,
    ) : InputBackground() {
        override fun getConstructor(): Int = -274_976_231
    }

    class InputBackgroundPrevious(
        @JvmField
        val messageId: Long,
    ) : InputBackground() {
        override fun getConstructor(): Int = -351_905_954
    }

    class InputBusinessChatLink(
        @JvmField
        val text: FormattedText,
        @JvmField
        val title: String,
    ) : Object() {
        override fun getConstructor(): Int = 237_858_296
    }

    class InputBusinessStartPage(
        @JvmField
        val title: String,
        @JvmField
        val message: String,
        @JvmField
        val sticker: InputFile?,
    ) : Object() {
        override fun getConstructor(): Int = -327_383_072
    }

    abstract class InputChatPhoto : Object()

    class InputChatPhotoPrevious(
        @JvmField
        val chatPhotoId: Long,
    ) : InputChatPhoto() {
        override fun getConstructor(): Int = 23_128_529
    }

    class InputChatPhotoStatic(
        @JvmField
        val photo: InputFile,
    ) : InputChatPhoto() {
        override fun getConstructor(): Int = 1_979_179_699
    }

    class InputChatPhotoAnimation(
        @JvmField
        val animation: InputFile,
        @JvmField
        val mainFrameTimestamp: Double,
    ) : InputChatPhoto() {
        override fun getConstructor(): Int = 90_846_242
    }

    class InputChatPhotoSticker(
        @JvmField
        val sticker: ChatPhotoSticker,
    ) : InputChatPhoto() {
        override fun getConstructor(): Int = 1_315_861_341
    }

    class InputChecklist(
        @JvmField
        val title: FormattedText,
        @JvmField
        val tasks: Array<InputChecklistTask>,
        @JvmField
        val othersCanAddTasks: Boolean,
        @JvmField
        val othersCanMarkTasksAsDone: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -145_125_739
    }

    class InputChecklistTask(
        @JvmField
        val id: Int,
        @JvmField
        val text: FormattedText,
    ) : Object() {
        override fun getConstructor(): Int = 1_633_462_225
    }

    abstract class InputCredentials : Object()

    class InputCredentialsSaved(
        @JvmField
        val savedCredentialsId: String,
    ) : InputCredentials() {
        override fun getConstructor(): Int = -2_034_385_364
    }

    class InputCredentialsNew(
        @JvmField
        val data: String,
        @JvmField
        val allowSave: Boolean,
    ) : InputCredentials() {
        override fun getConstructor(): Int = -829_689_558
    }

    class InputCredentialsApplePay(
        @JvmField
        val data: String,
    ) : InputCredentials() {
        override fun getConstructor(): Int = -1_246_570_799
    }

    class InputCredentialsGooglePay(
        @JvmField
        val data: String,
    ) : InputCredentials() {
        override fun getConstructor(): Int = 844_384_100
    }

    abstract class InputFile : Object()

    class InputFileId(
        @JvmField
        val id: Int,
    ) : InputFile() {
        override fun getConstructor(): Int = 1_788_906_253
    }

    class InputFileRemote(
        @JvmField
        val id: String,
    ) : InputFile() {
        override fun getConstructor(): Int = -107_574_466
    }

    class InputFileLocal(
        @JvmField
        val path: String,
    ) : InputFile() {
        override fun getConstructor(): Int = 2_056_030_919
    }

    class InputFileGenerated(
        @JvmField
        val originalPath: String,
        @JvmField
        val conversion: String,
        @JvmField
        val expectedSize: Long,
    ) : InputFile() {
        override fun getConstructor(): Int = -1_333_385_216
    }

    abstract class InputGroupCall : Object()

    class InputGroupCallLink(
        @JvmField
        val link: String,
    ) : InputGroupCall() {
        override fun getConstructor(): Int = -812_157_480
    }

    class InputGroupCallMessage(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
    ) : InputGroupCall() {
        override fun getConstructor(): Int = -341_793_768
    }

    class InputIdentityDocument(
        @JvmField
        val number: String,
        @JvmField
        val expirationDate: Date?,
        @JvmField
        val frontSide: InputFile,
        @JvmField
        val reverseSide: InputFile?,
        @JvmField
        val selfie: InputFile?,
        @JvmField
        val translation: Array<InputFile>,
    ) : Object() {
        override fun getConstructor(): Int = 767_353_688
    }

    abstract class InputInlineQueryResult : Object()

    class InputInlineQueryResultAnimation(
        @JvmField
        val id: String,
        @JvmField
        val title: String,
        @JvmField
        val thumbnailUrl: String,
        @JvmField
        val thumbnailMimeType: String,
        @JvmField
        val videoUrl: String,
        @JvmField
        val videoMimeType: String,
        @JvmField
        val videoDuration: Int,
        @JvmField
        val videoWidth: Int,
        @JvmField
        val videoHeight: Int,
        @JvmField
        val replyMarkup: ReplyMarkup?,
        @JvmField
        val inputMessageContent: InputMessageContent,
    ) : InputInlineQueryResult() {
        override fun getConstructor(): Int = -1_489_808_874
    }

    class InputInlineQueryResultArticle(
        @JvmField
        val id: String,
        @JvmField
        val url: String,
        @JvmField
        val title: String,
        @JvmField
        val description: String,
        @JvmField
        val thumbnailUrl: String,
        @JvmField
        val thumbnailWidth: Int,
        @JvmField
        val thumbnailHeight: Int,
        @JvmField
        val replyMarkup: ReplyMarkup?,
        @JvmField
        val inputMessageContent: InputMessageContent,
    ) : InputInlineQueryResult() {
        override fun getConstructor(): Int = 1_983_218_620
    }

    class InputInlineQueryResultAudio(
        @JvmField
        val id: String,
        @JvmField
        val title: String,
        @JvmField
        val performer: String,
        @JvmField
        val audioUrl: String,
        @JvmField
        val audioDuration: Int,
        @JvmField
        val replyMarkup: ReplyMarkup?,
        @JvmField
        val inputMessageContent: InputMessageContent,
    ) : InputInlineQueryResult() {
        override fun getConstructor(): Int = 1_260_139_988
    }

    class InputInlineQueryResultContact(
        @JvmField
        val id: String,
        @JvmField
        val contact: Contact,
        @JvmField
        val thumbnailUrl: String,
        @JvmField
        val thumbnailWidth: Int,
        @JvmField
        val thumbnailHeight: Int,
        @JvmField
        val replyMarkup: ReplyMarkup?,
        @JvmField
        val inputMessageContent: InputMessageContent,
    ) : InputInlineQueryResult() {
        override fun getConstructor(): Int = 1_846_064_594
    }

    class InputInlineQueryResultDocument(
        @JvmField
        val id: String,
        @JvmField
        val title: String,
        @JvmField
        val description: String,
        @JvmField
        val documentUrl: String,
        @JvmField
        val mimeType: String,
        @JvmField
        val thumbnailUrl: String,
        @JvmField
        val thumbnailWidth: Int,
        @JvmField
        val thumbnailHeight: Int,
        @JvmField
        val replyMarkup: ReplyMarkup?,
        @JvmField
        val inputMessageContent: InputMessageContent,
    ) : InputInlineQueryResult() {
        override fun getConstructor(): Int = 578_801_869
    }

    class InputInlineQueryResultGame(
        @JvmField
        val id: String,
        @JvmField
        val gameShortName: String,
        @JvmField
        val replyMarkup: ReplyMarkup?,
    ) : InputInlineQueryResult() {
        override fun getConstructor(): Int = 966_074_327
    }

    class InputInlineQueryResultLocation(
        @JvmField
        val id: String,
        @JvmField
        val location: Location,
        @JvmField
        val livePeriod: Int,
        @JvmField
        val title: String,
        @JvmField
        val thumbnailUrl: String,
        @JvmField
        val thumbnailWidth: Int,
        @JvmField
        val thumbnailHeight: Int,
        @JvmField
        val replyMarkup: ReplyMarkup?,
        @JvmField
        val inputMessageContent: InputMessageContent,
    ) : InputInlineQueryResult() {
        override fun getConstructor(): Int = -1_887_650_218
    }

    class InputInlineQueryResultPhoto(
        @JvmField
        val id: String,
        @JvmField
        val title: String,
        @JvmField
        val description: String,
        @JvmField
        val thumbnailUrl: String,
        @JvmField
        val photoUrl: String,
        @JvmField
        val photoWidth: Int,
        @JvmField
        val photoHeight: Int,
        @JvmField
        val replyMarkup: ReplyMarkup?,
        @JvmField
        val inputMessageContent: InputMessageContent,
    ) : InputInlineQueryResult() {
        override fun getConstructor(): Int = -1_123_338_721
    }

    class InputInlineQueryResultSticker(
        @JvmField
        val id: String,
        @JvmField
        val thumbnailUrl: String,
        @JvmField
        val stickerUrl: String,
        @JvmField
        val stickerWidth: Int,
        @JvmField
        val stickerHeight: Int,
        @JvmField
        val replyMarkup: ReplyMarkup?,
        @JvmField
        val inputMessageContent: InputMessageContent,
    ) : InputInlineQueryResult() {
        override fun getConstructor(): Int = 274_007_129
    }

    class InputInlineQueryResultVenue(
        @JvmField
        val id: String,
        @JvmField
        val venue: Venue,
        @JvmField
        val thumbnailUrl: String,
        @JvmField
        val thumbnailWidth: Int,
        @JvmField
        val thumbnailHeight: Int,
        @JvmField
        val replyMarkup: ReplyMarkup?,
        @JvmField
        val inputMessageContent: InputMessageContent,
    ) : InputInlineQueryResult() {
        override fun getConstructor(): Int = 541_704_509
    }

    class InputInlineQueryResultVideo(
        @JvmField
        val id: String,
        @JvmField
        val title: String,
        @JvmField
        val description: String,
        @JvmField
        val thumbnailUrl: String,
        @JvmField
        val videoUrl: String,
        @JvmField
        val mimeType: String,
        @JvmField
        val videoWidth: Int,
        @JvmField
        val videoHeight: Int,
        @JvmField
        val videoDuration: Int,
        @JvmField
        val replyMarkup: ReplyMarkup?,
        @JvmField
        val inputMessageContent: InputMessageContent,
    ) : InputInlineQueryResult() {
        override fun getConstructor(): Int = 1_724_073_191
    }

    class InputInlineQueryResultVoiceNote(
        @JvmField
        val id: String,
        @JvmField
        val title: String,
        @JvmField
        val voiceNoteUrl: String,
        @JvmField
        val voiceNoteDuration: Int,
        @JvmField
        val replyMarkup: ReplyMarkup?,
        @JvmField
        val inputMessageContent: InputMessageContent,
    ) : InputInlineQueryResult() {
        override fun getConstructor(): Int = -1_790_072_503
    }

    abstract class InputInvoice : Object()

    class InputInvoiceMessage(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
    ) : InputInvoice() {
        override fun getConstructor(): Int = 1_490_872_848
    }

    class InputInvoiceName(
        @JvmField
        val name: String,
    ) : InputInvoice() {
        override fun getConstructor(): Int = -1_312_155_917
    }

    class InputInvoiceTelegram(
        @JvmField
        val purpose: TelegramPaymentPurpose,
    ) : InputInvoice() {
        override fun getConstructor(): Int = -1_762_853_139
    }

    abstract class InputMessageContent : Object()

    class InputMessageText(
        @JvmField
        val text: FormattedText,
        @JvmField
        val linkPreviewOptions: LinkPreviewOptions?,
        @JvmField
        val clearDraft: Boolean,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = -212_805_484
    }

    class InputMessageAnimation(
        @JvmField
        val animation: InputFile,
        @JvmField
        val thumbnail: InputThumbnail?,
        @JvmField
        val addedStickerFileIds: IntArray,
        @JvmField
        val duration: Int,
        @JvmField
        val width: Int,
        @JvmField
        val height: Int,
        @JvmField
        val caption: FormattedText?,
        @JvmField
        val showCaptionAboveMedia: Boolean,
        @JvmField
        val hasSpoiler: Boolean,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = -210_404_059
    }

    class InputMessageAudio(
        @JvmField
        val audio: InputFile,
        @JvmField
        val albumCoverThumbnail: InputThumbnail?,
        @JvmField
        val duration: Int,
        @JvmField
        val title: String,
        @JvmField
        val performer: String,
        @JvmField
        val caption: FormattedText?,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = -626_786_126
    }

    class InputMessageDocument(
        @JvmField
        val document: InputFile,
        @JvmField
        val thumbnail: InputThumbnail?,
        @JvmField
        val disableContentTypeDetection: Boolean,
        @JvmField
        val caption: FormattedText?,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = 1_633_383_097
    }

    class InputMessagePaidMedia(
        @JvmField
        val starCount: Long,
        @JvmField
        val paidMedia: Array<InputPaidMedia>,
        @JvmField
        val caption: FormattedText?,
        @JvmField
        val showCaptionAboveMedia: Boolean,
        @JvmField
        val payload: String,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = -1_274_819_374
    }

    class InputMessagePhoto(
        @JvmField
        val photo: InputFile,
        @JvmField
        val thumbnail: InputThumbnail?,
        @JvmField
        val addedStickerFileIds: IntArray,
        @JvmField
        val width: Int,
        @JvmField
        val height: Int,
        @JvmField
        val caption: FormattedText?,
        @JvmField
        val showCaptionAboveMedia: Boolean,
        @JvmField
        val selfDestructType: MessageSelfDestructType?,
        @JvmField
        val hasSpoiler: Boolean,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = -810_129_442
    }

    class InputMessageSticker(
        @JvmField
        val sticker: InputFile,
        @JvmField
        val thumbnail: InputThumbnail?,
        @JvmField
        val width: Int,
        @JvmField
        val height: Int,
        @JvmField
        val emoji: String,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = 1_072_805_625
    }

    class InputMessageVideo(
        @JvmField
        val video: InputFile,
        @JvmField
        val thumbnail: InputThumbnail?,
        @JvmField
        val cover: InputFile?,
        @JvmField
        val startTimestamp: Int,
        @JvmField
        val addedStickerFileIds: IntArray,
        @JvmField
        val duration: Int,
        @JvmField
        val width: Int,
        @JvmField
        val height: Int,
        @JvmField
        val supportsStreaming: Boolean,
        @JvmField
        val caption: FormattedText?,
        @JvmField
        val showCaptionAboveMedia: Boolean,
        @JvmField
        val selfDestructType: MessageSelfDestructType?,
        @JvmField
        val hasSpoiler: Boolean,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = -605_958_271
    }

    class InputMessageVideoNote(
        @JvmField
        val videoNote: InputFile,
        @JvmField
        val thumbnail: InputThumbnail?,
        @JvmField
        val duration: Int,
        @JvmField
        val length: Int,
        @JvmField
        val selfDestructType: MessageSelfDestructType?,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = -714_598_691
    }

    class InputMessageVoiceNote(
        @JvmField
        val voiceNote: InputFile,
        @JvmField
        val duration: Int,
        @JvmField
        val waveform: ByteArray,
        @JvmField
        val caption: FormattedText?,
        @JvmField
        val selfDestructType: MessageSelfDestructType?,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = 1_461_977_004
    }

    class InputMessageLocation(
        @JvmField
        val location: Location,
        @JvmField
        val livePeriod: Int,
        @JvmField
        val heading: Int,
        @JvmField
        val proximityAlertRadius: Int,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = 648_735_088
    }

    class InputMessageVenue(
        @JvmField
        val venue: Venue,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = 1_447_926_269
    }

    class InputMessageContact(
        @JvmField
        val contact: Contact,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = -982_446_849
    }

    class InputMessageDice(
        @JvmField
        val emoji: String,
        @JvmField
        val clearDraft: Boolean,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = 841_574_313
    }

    class InputMessageGame(
        @JvmField
        val botUserId: Long,
        @JvmField
        val gameShortName: String,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = 1_252_944_610
    }

    class InputMessageInvoice(
        @JvmField
        val invoice: Invoice,
        @JvmField
        val title: String,
        @JvmField
        val description: String,
        @JvmField
        val photoUrl: String,
        @JvmField
        val photoSize: Int,
        @JvmField
        val photoWidth: Int,
        @JvmField
        val photoHeight: Int,
        @JvmField
        val payload: ByteArray,
        @JvmField
        val providerToken: String,
        @JvmField
        val providerData: String,
        @JvmField
        val startParameter: String,
        @JvmField
        val paidMedia: InputPaidMedia?,
        @JvmField
        val paidMediaCaption: FormattedText?,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = -1_162_047_631
    }

    class InputMessagePoll(
        @JvmField
        val question: FormattedText,
        @JvmField
        val options: Array<FormattedText>,
        @JvmField
        val isAnonymous: Boolean,
        @JvmField
        val type: PollType,
        @JvmField
        val openPeriod: Int,
        @JvmField
        val closeDate: Int,
        @JvmField
        val isClosed: Boolean,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = -263_337_164
    }

    class InputMessageStory(
        @JvmField
        val storyPosterChatId: Long,
        @JvmField
        val storyId: Int,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = -370_732_053
    }

    class InputMessageChecklist(
        @JvmField
        val checklist: InputChecklist,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = -1_722_965_261
    }

    class InputMessageForwarded(
        @JvmField
        val fromChatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val inGameShare: Boolean,
        @JvmField
        val replaceVideoStartTimestamp: Boolean,
        @JvmField
        val newVideoStartTimestamp: Int,
        @JvmField
        val copyOptions: MessageCopyOptions?,
    ) : InputMessageContent() {
        override fun getConstructor(): Int = -1_076_506_316
    }

    abstract class InputMessageReplyTo : Object()

    class InputMessageReplyToMessage(
        @JvmField
        val messageId: Long,
        @JvmField
        val quote: InputTextQuote?,
    ) : InputMessageReplyTo() {
        override fun getConstructor(): Int = -1_033_987_837
    }

    class InputMessageReplyToExternalMessage(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val quote: InputTextQuote?,
    ) : InputMessageReplyTo() {
        override fun getConstructor(): Int = -1_993_530_582
    }

    class InputMessageReplyToStory(
        @JvmField
        val storyPosterChatId: Long,
        @JvmField
        val storyId: Int,
    ) : InputMessageReplyTo() {
        override fun getConstructor(): Int = -1_723_842_320
    }

    class InputPaidMedia(
        @JvmField
        val type: InputPaidMediaType,
        @JvmField
        val media: InputFile,
        @JvmField
        val thumbnail: InputThumbnail?,
        @JvmField
        val addedStickerFileIds: IntArray,
        @JvmField
        val width: Int,
        @JvmField
        val height: Int,
    ) : Object() {
        override fun getConstructor(): Int = 475_844_035
    }

    abstract class InputPaidMediaType : Object()

    class InputPaidMediaTypePhoto : InputPaidMediaType() {
        override fun getConstructor(): Int = -761_660_134
    }

    class InputPaidMediaTypeVideo(
        @JvmField
        val cover: InputFile?,
        @JvmField
        val startTimestamp: Int,
        @JvmField
        val duration: Int,
        @JvmField
        val supportsStreaming: Boolean,
    ) : InputPaidMediaType() {
        override fun getConstructor(): Int = 1_793_741_625
    }

    abstract class InputPassportElement : Object()

    class InputPassportElementPersonalDetails(
        @JvmField
        val personalDetails: PersonalDetails,
    ) : InputPassportElement() {
        override fun getConstructor(): Int = 164_791_359
    }

    class InputPassportElementPassport(
        @JvmField
        val passport: InputIdentityDocument,
    ) : InputPassportElement() {
        override fun getConstructor(): Int = -497_011_356
    }

    class InputPassportElementDriverLicense(
        @JvmField
        val driverLicense: InputIdentityDocument,
    ) : InputPassportElement() {
        override fun getConstructor(): Int = 304_813_264
    }

    class InputPassportElementIdentityCard(
        @JvmField
        val identityCard: InputIdentityDocument,
    ) : InputPassportElement() {
        override fun getConstructor(): Int = -9_963_390
    }

    class InputPassportElementInternalPassport(
        @JvmField
        val internalPassport: InputIdentityDocument,
    ) : InputPassportElement() {
        override fun getConstructor(): Int = 715_360_043
    }

    class InputPassportElementAddress(
        @JvmField
        val address: Address,
    ) : InputPassportElement() {
        override fun getConstructor(): Int = 461_630_480
    }

    class InputPassportElementUtilityBill(
        @JvmField
        val utilityBill: InputPersonalDocument,
    ) : InputPassportElement() {
        override fun getConstructor(): Int = 1_389_203_841
    }

    class InputPassportElementBankStatement(
        @JvmField
        val bankStatement: InputPersonalDocument,
    ) : InputPassportElement() {
        override fun getConstructor(): Int = -26_585_208
    }

    class InputPassportElementRentalAgreement(
        @JvmField
        val rentalAgreement: InputPersonalDocument,
    ) : InputPassportElement() {
        override fun getConstructor(): Int = 1_736_154_155
    }

    class InputPassportElementPassportRegistration(
        @JvmField
        val passportRegistration: InputPersonalDocument,
    ) : InputPassportElement() {
        override fun getConstructor(): Int = 1_314_562_128
    }

    class InputPassportElementTemporaryRegistration(
        @JvmField
        val temporaryRegistration: InputPersonalDocument,
    ) : InputPassportElement() {
        override fun getConstructor(): Int = -1_913_238_047
    }

    class InputPassportElementPhoneNumber(
        @JvmField
        val phoneNumber: String,
    ) : InputPassportElement() {
        override fun getConstructor(): Int = 1_319_357_497
    }

    class InputPassportElementEmailAddress(
        @JvmField
        val emailAddress: String,
    ) : InputPassportElement() {
        override fun getConstructor(): Int = -248_605_659
    }

    class InputPassportElementError(
        @JvmField
        val type: PassportElementType,
        @JvmField
        val message: String,
        @JvmField
        val source: InputPassportElementErrorSource,
    ) : Object() {
        override fun getConstructor(): Int = 285_756_898
    }

    abstract class InputPassportElementErrorSource : Object()

    class InputPassportElementErrorSourceUnspecified(
        @JvmField
        val elementHash: ByteArray,
    ) : InputPassportElementErrorSource() {
        override fun getConstructor(): Int = 267_230_319
    }

    class InputPassportElementErrorSourceDataField(
        @JvmField
        val fieldName: String,
        @JvmField
        val dataHash: ByteArray,
    ) : InputPassportElementErrorSource() {
        override fun getConstructor(): Int = -426_795_002
    }

    class InputPassportElementErrorSourceFrontSide(
        @JvmField
        val fileHash: ByteArray,
    ) : InputPassportElementErrorSource() {
        override fun getConstructor(): Int = 588_023_741
    }

    class InputPassportElementErrorSourceReverseSide(
        @JvmField
        val fileHash: ByteArray,
    ) : InputPassportElementErrorSource() {
        override fun getConstructor(): Int = 413_072_891
    }

    class InputPassportElementErrorSourceSelfie(
        @JvmField
        val fileHash: ByteArray,
    ) : InputPassportElementErrorSource() {
        override fun getConstructor(): Int = -773_575_528
    }

    class InputPassportElementErrorSourceTranslationFile(
        @JvmField
        val fileHash: ByteArray,
    ) : InputPassportElementErrorSource() {
        override fun getConstructor(): Int = 505_842_299
    }

    class InputPassportElementErrorSourceTranslationFiles(
        @JvmField
        val fileHashes: Array<ByteArray>,
    ) : InputPassportElementErrorSource() {
        override fun getConstructor(): Int = -527_254_048
    }

    class InputPassportElementErrorSourceFile(
        @JvmField
        val fileHash: ByteArray,
    ) : InputPassportElementErrorSource() {
        override fun getConstructor(): Int = -298_492_469
    }

    class InputPassportElementErrorSourceFiles(
        @JvmField
        val fileHashes: Array<ByteArray>,
    ) : InputPassportElementErrorSource() {
        override fun getConstructor(): Int = -2_008_541_640
    }

    class InputPersonalDocument(
        @JvmField
        val files: Array<InputFile>,
        @JvmField
        val translation: Array<InputFile>,
    ) : Object() {
        override fun getConstructor(): Int = 1_676_966_826
    }

    class InputSticker(
        @JvmField
        val sticker: InputFile,
        @JvmField
        val format: StickerFormat,
        @JvmField
        val emojis: String,
        @JvmField
        val maskPosition: MaskPosition?,
        @JvmField
        val keywords: Array<String>,
    ) : Object() {
        override fun getConstructor(): Int = 1_589_392_402
    }

    class InputStoryArea(
        @JvmField
        val position: StoryAreaPosition,
        @JvmField
        val type: InputStoryAreaType,
    ) : Object() {
        override fun getConstructor(): Int = 122_859_135
    }

    abstract class InputStoryAreaType : Object()

    class InputStoryAreaTypeLocation(
        @JvmField
        val location: Location,
        @JvmField
        val address: LocationAddress?,
    ) : InputStoryAreaType() {
        override fun getConstructor(): Int = -1_433_714_887
    }

    class InputStoryAreaTypeFoundVenue(
        @JvmField
        val queryId: Long,
        @JvmField
        val resultId: String,
    ) : InputStoryAreaType() {
        override fun getConstructor(): Int = -1_395_809_130
    }

    class InputStoryAreaTypePreviousVenue(
        @JvmField
        val venueProvider: String,
        @JvmField
        val venueId: String,
    ) : InputStoryAreaType() {
        override fun getConstructor(): Int = 1_846_693_388
    }

    class InputStoryAreaTypeSuggestedReaction(
        @JvmField
        val reactionType: ReactionType,
        @JvmField
        val isDark: Boolean,
        @JvmField
        val isFlipped: Boolean,
    ) : InputStoryAreaType() {
        override fun getConstructor(): Int = 2_101_826_003
    }

    class InputStoryAreaTypeMessage(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
    ) : InputStoryAreaType() {
        override fun getConstructor(): Int = -266_607_529
    }

    class InputStoryAreaTypeLink(
        @JvmField
        val url: String,
    ) : InputStoryAreaType() {
        override fun getConstructor(): Int = 1_408_441_160
    }

    class InputStoryAreaTypeWeather(
        @JvmField
        val temperature: Double,
        @JvmField
        val emoji: String,
        @JvmField
        val backgroundColor: Int,
    ) : InputStoryAreaType() {
        override fun getConstructor(): Int = -1_212_686_691
    }

    class InputStoryAreaTypeUpgradedGift(
        @JvmField
        val giftName: String,
    ) : InputStoryAreaType() {
        override fun getConstructor(): Int = 793_059_694
    }

    class InputStoryAreas(
        @JvmField
        val areas: Array<InputStoryArea>,
    ) : Object() {
        override fun getConstructor(): Int = -883_247_088
    }

    abstract class InputStoryContent : Object()

    class InputStoryContentPhoto(
        @JvmField
        val photo: InputFile,
        @JvmField
        val addedStickerFileIds: IntArray,
    ) : InputStoryContent() {
        override fun getConstructor(): Int = -309_196_727
    }

    class InputStoryContentVideo(
        @JvmField
        val video: InputFile,
        @JvmField
        val addedStickerFileIds: IntArray,
        @JvmField
        val duration: Double,
        @JvmField
        val coverFrameTimestamp: Double,
        @JvmField
        val isAnimation: Boolean,
    ) : InputStoryContent() {
        override fun getConstructor(): Int = 3_809_243
    }

    class InputTextQuote(
        @JvmField
        val text: FormattedText,
        @JvmField
        val position: Int,
    ) : Object() {
        override fun getConstructor(): Int = -1_219_859_172
    }

    class InputThumbnail(
        @JvmField
        val thumbnail: InputFile,
        @JvmField
        val width: Int,
        @JvmField
        val height: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_582_387_236
    }

    abstract class InternalLinkType : Object()

    class InternalLinkTypeActiveSessions : InternalLinkType() {
        override fun getConstructor(): Int = 1_886_108_589
    }

    class InternalLinkTypeAttachmentMenuBot(
        @JvmField
        val targetChat: TargetChat,
        @JvmField
        val botUsername: String,
        @JvmField
        val url: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 1_682_719_269
    }

    class InternalLinkTypeAuthenticationCode(
        @JvmField
        val code: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -209_235_982
    }

    class InternalLinkTypeBackground(
        @JvmField
        val backgroundName: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 185_411_848
    }

    class InternalLinkTypeBotAddToChannel(
        @JvmField
        val botUsername: String,
        @JvmField
        val administratorRights: ChatAdministratorRights,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 1_401_602_752
    }

    class InternalLinkTypeBotStart(
        @JvmField
        val botUsername: String,
        @JvmField
        val startParameter: String,
        @JvmField
        val autostart: Boolean,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 1_066_950_637
    }

    class InternalLinkTypeBotStartInGroup(
        @JvmField
        val botUsername: String,
        @JvmField
        val startParameter: String,
        @JvmField
        val administratorRights: ChatAdministratorRights?,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -905_081_650
    }

    class InternalLinkTypeBusinessChat(
        @JvmField
        val linkName: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -1_606_751_785
    }

    class InternalLinkTypeBuyStars(
        @JvmField
        val starCount: Long,
        @JvmField
        val purpose: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -1_454_587_065
    }

    class InternalLinkTypeChangePhoneNumber : InternalLinkType() {
        override fun getConstructor(): Int = -265_856_255
    }

    class InternalLinkTypeChatAffiliateProgram(
        @JvmField
        val username: String,
        @JvmField
        val referrer: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 632_049_700
    }

    class InternalLinkTypeChatBoost(
        @JvmField
        val url: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -716_571_328
    }

    class InternalLinkTypeChatFolderInvite(
        @JvmField
        val inviteLink: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -1_984_804_546
    }

    class InternalLinkTypeChatFolderSettings : InternalLinkType() {
        override fun getConstructor(): Int = -1_073_805_988
    }

    class InternalLinkTypeChatInvite(
        @JvmField
        val inviteLink: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 428_621_017
    }

    class InternalLinkTypeDefaultMessageAutoDeleteTimerSettings : InternalLinkType() {
        override fun getConstructor(): Int = 732_625_201
    }

    class InternalLinkTypeEditProfileSettings : InternalLinkType() {
        override fun getConstructor(): Int = -1_022_472_090
    }

    class InternalLinkTypeGame(
        @JvmField
        val botUsername: String,
        @JvmField
        val gameShortName: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -260_788_787
    }

    class InternalLinkTypeGroupCall(
        @JvmField
        val inviteLink: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 1_953_084_438
    }

    class InternalLinkTypeInstantView(
        @JvmField
        val url: String,
        @JvmField
        val fallbackUrl: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 1_776_607_039
    }

    class InternalLinkTypeInvoice(
        @JvmField
        val invoiceName: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -213_094_996
    }

    class InternalLinkTypeLanguagePack(
        @JvmField
        val languagePackId: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -1_450_766_996
    }

    class InternalLinkTypeLanguageSettings : InternalLinkType() {
        override fun getConstructor(): Int = -1_340_479_770
    }

    class InternalLinkTypeMainWebApp(
        @JvmField
        val botUsername: String,
        @JvmField
        val startParameter: String,
        @JvmField
        val mode: WebAppOpenMode,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 1_574_925_033
    }

    class InternalLinkTypeMessage(
        @JvmField
        val url: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 978_541_650
    }

    class InternalLinkTypeMessageDraft(
        @JvmField
        val text: FormattedText,
        @JvmField
        val containsLink: Boolean,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 661_633_749
    }

    class InternalLinkTypeMyStars : InternalLinkType() {
        override fun getConstructor(): Int = 1_613_887_070
    }

    class InternalLinkTypePassportDataRequest(
        @JvmField
        val botUserId: Long,
        @JvmField
        val scope: String,
        @JvmField
        val publicKey: String,
        @JvmField
        val nonce: String,
        @JvmField
        val callbackUrl: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -988_819_839
    }

    class InternalLinkTypePhoneNumberConfirmation(
        @JvmField
        val hash: String,
        @JvmField
        val phoneNumber: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 1_757_375_254
    }

    class InternalLinkTypePremiumFeatures(
        @JvmField
        val referrer: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 1_216_892_745
    }

    class InternalLinkTypePremiumGift(
        @JvmField
        val referrer: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 1_523_936_577
    }

    class InternalLinkTypePremiumGiftCode(
        @JvmField
        val code: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -564_356_974
    }

    class InternalLinkTypePrivacyAndSecuritySettings : InternalLinkType() {
        override fun getConstructor(): Int = -1_386_255_665
    }

    class InternalLinkTypeProxy(
        @JvmField
        val server: String,
        @JvmField
        val port: Int,
        @JvmField
        val type: ProxyType,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -1_313_788_694
    }

    class InternalLinkTypePublicChat(
        @JvmField
        val chatUsername: String,
        @JvmField
        val draftText: String,
        @JvmField
        val openProfile: Boolean,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 1_769_614_592
    }

    class InternalLinkTypeQrCodeAuthentication : InternalLinkType() {
        override fun getConstructor(): Int = -1_089_332_956
    }

    class InternalLinkTypeRestorePurchases : InternalLinkType() {
        override fun getConstructor(): Int = 606_090_371
    }

    class InternalLinkTypeSettings : InternalLinkType() {
        override fun getConstructor(): Int = 393_561_524
    }

    class InternalLinkTypeStickerSet(
        @JvmField
        val stickerSetName: String,
        @JvmField
        val expectCustomEmoji: Boolean,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -1_589_227_614
    }

    class InternalLinkTypeStory(
        @JvmField
        val storyPosterUsername: String,
        @JvmField
        val storyId: Int,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 1_852_042_869
    }

    class InternalLinkTypeTheme(
        @JvmField
        val themeName: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -200_935_417
    }

    class InternalLinkTypeThemeSettings : InternalLinkType() {
        override fun getConstructor(): Int = -1_051_903_722
    }

    class InternalLinkTypeUnknownDeepLink(
        @JvmField
        val link: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 625_596_379
    }

    class InternalLinkTypeUnsupportedProxy : InternalLinkType() {
        override fun getConstructor(): Int = -566_649_079
    }

    class InternalLinkTypeUpgradedGift(
        @JvmField
        val name: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -708_405_605
    }

    class InternalLinkTypeUserPhoneNumber(
        @JvmField
        val phoneNumber: String,
        @JvmField
        val draftText: String,
        @JvmField
        val openProfile: Boolean,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 273_398_536
    }

    class InternalLinkTypeUserToken(
        @JvmField
        val token: String,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -1_462_248_615
    }

    class InternalLinkTypeVideoChat(
        @JvmField
        val chatUsername: String,
        @JvmField
        val inviteHash: String,
        @JvmField
        val isLiveStream: Boolean,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = -2_020_149_068
    }

    class InternalLinkTypeWebApp(
        @JvmField
        val botUsername: String,
        @JvmField
        val webAppShortName: String,
        @JvmField
        val startParameter: String,
        @JvmField
        val mode: WebAppOpenMode,
    ) : InternalLinkType() {
        override fun getConstructor(): Int = 2_062_112_045
    }

    abstract class InviteGroupCallParticipantResult : Object()

    class InviteGroupCallParticipantResultUserPrivacyRestricted : InviteGroupCallParticipantResult() {
        override fun getConstructor(): Int = 53_003_769
    }

    class InviteGroupCallParticipantResultUserAlreadyParticipant : InviteGroupCallParticipantResult() {
        override fun getConstructor(): Int = 661_526_151
    }

    class InviteGroupCallParticipantResultUserWasBanned : InviteGroupCallParticipantResult() {
        override fun getConstructor(): Int = -204_345_357
    }

    class InviteGroupCallParticipantResultSuccess(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
    ) : InviteGroupCallParticipantResult() {
        override fun getConstructor(): Int = -1_914_309_427
    }

    abstract class InviteLinkChatType : Object()

    class InviteLinkChatTypeBasicGroup : InviteLinkChatType() {
        override fun getConstructor(): Int = 1_296_287_214
    }

    class InviteLinkChatTypeSupergroup : InviteLinkChatType() {
        override fun getConstructor(): Int = 1_038_640_984
    }

    class InviteLinkChatTypeChannel : InviteLinkChatType() {
        override fun getConstructor(): Int = 806_547_211
    }

    class Invoice(
        @JvmField
        val currency: String,
        @JvmField
        val priceParts: Array<LabeledPricePart>,
        @JvmField
        val subscriptionPeriod: Int,
        @JvmField
        val maxTipAmount: Long,
        @JvmField
        val suggestedTipAmounts: LongArray,
        @JvmField
        val recurringPaymentTermsOfServiceUrl: String,
        @JvmField
        val termsOfServiceUrl: String,
        @JvmField
        val isTest: Boolean,
        @JvmField
        val needName: Boolean,
        @JvmField
        val needPhoneNumber: Boolean,
        @JvmField
        val needEmailAddress: Boolean,
        @JvmField
        val needShippingAddress: Boolean,
        @JvmField
        val sendPhoneNumberToProvider: Boolean,
        @JvmField
        val sendEmailAddressToProvider: Boolean,
        @JvmField
        val isFlexible: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 113_204_876
    }

    class JsonObjectMember(
        @JvmField
        val key: String,
        @JvmField
        val value: JsonValue,
    ) : Object() {
        override fun getConstructor(): Int = -1_803_309_418
    }

    abstract class JsonValue : Object()

    class JsonValueNull : JsonValue() {
        override fun getConstructor(): Int = -92_872_499
    }

    class JsonValueBoolean(
        @JvmField
        val value: Boolean,
    ) : JsonValue() {
        override fun getConstructor(): Int = -2_142_186_576
    }

    class JsonValueNumber(
        @JvmField
        val value: Double,
    ) : JsonValue() {
        override fun getConstructor(): Int = -1_010_822_033
    }

    class JsonValueString(
        @JvmField
        val value: String,
    ) : JsonValue() {
        override fun getConstructor(): Int = 1_597_947_313
    }

    class JsonValueArray(
        @JvmField
        val values: Array<JsonValue>,
    ) : JsonValue() {
        override fun getConstructor(): Int = -183_913_546
    }

    class JsonValueObject(
        @JvmField
        val members: Array<JsonObjectMember>,
    ) : JsonValue() {
        override fun getConstructor(): Int = 520_252_026
    }

    class KeyboardButton(
        @JvmField
        val text: String,
        @JvmField
        val type: KeyboardButtonType,
    ) : Object() {
        override fun getConstructor(): Int = -2_069_836_172
    }

    abstract class KeyboardButtonType : Object()

    class KeyboardButtonTypeText : KeyboardButtonType() {
        override fun getConstructor(): Int = -1_773_037_256
    }

    class KeyboardButtonTypeRequestPhoneNumber : KeyboardButtonType() {
        override fun getConstructor(): Int = -1_529_235_527
    }

    class KeyboardButtonTypeRequestLocation : KeyboardButtonType() {
        override fun getConstructor(): Int = -125_661_955
    }

    class KeyboardButtonTypeRequestPoll(
        @JvmField
        val forceRegular: Boolean,
        @JvmField
        val forceQuiz: Boolean,
    ) : KeyboardButtonType() {
        override fun getConstructor(): Int = 1_902_435_512
    }

    class KeyboardButtonTypeRequestUsers(
        @JvmField
        val id: Int,
        @JvmField
        val restrictUserIsBot: Boolean,
        @JvmField
        val userIsBot: Boolean,
        @JvmField
        val restrictUserIsPremium: Boolean,
        @JvmField
        val userIsPremium: Boolean,
        @JvmField
        val maxQuantity: Int,
        @JvmField
        val requestName: Boolean,
        @JvmField
        val requestUsername: Boolean,
        @JvmField
        val requestPhoto: Boolean,
    ) : KeyboardButtonType() {
        override fun getConstructor(): Int = -1_738_765_315
    }

    class KeyboardButtonTypeRequestChat(
        @JvmField
        val id: Int,
        @JvmField
        val chatIsChannel: Boolean,
        @JvmField
        val restrictChatIsForum: Boolean,
        @JvmField
        val chatIsForum: Boolean,
        @JvmField
        val restrictChatHasUsername: Boolean,
        @JvmField
        val chatHasUsername: Boolean,
        @JvmField
        val chatIsCreated: Boolean,
        @JvmField
        val userAdministratorRights: ChatAdministratorRights?,
        @JvmField
        val botAdministratorRights: ChatAdministratorRights?,
        @JvmField
        val botIsMember: Boolean,
        @JvmField
        val requestTitle: Boolean,
        @JvmField
        val requestUsername: Boolean,
        @JvmField
        val requestPhoto: Boolean,
    ) : KeyboardButtonType() {
        override fun getConstructor(): Int = 1_511_138_485
    }

    class KeyboardButtonTypeWebApp(
        @JvmField
        val url: String,
    ) : KeyboardButtonType() {
        override fun getConstructor(): Int = 1_892_220_770
    }

    class LabeledPricePart(
        @JvmField
        val label: String,
        @JvmField
        val amount: Long,
    ) : Object() {
        override fun getConstructor(): Int = 552_789_798
    }

    class LanguagePackInfo(
        @JvmField
        val id: String,
        @JvmField
        val baseLanguagePackId: String,
        @JvmField
        val name: String,
        @JvmField
        val nativeName: String,
        @JvmField
        val pluralCode: String,
        @JvmField
        val isOfficial: Boolean,
        @JvmField
        val isRtl: Boolean,
        @JvmField
        val isBeta: Boolean,
        @JvmField
        val isInstalled: Boolean,
        @JvmField
        val totalStringCount: Int,
        @JvmField
        val translatedStringCount: Int,
        @JvmField
        val localStringCount: Int,
        @JvmField
        val translationUrl: String,
    ) : Object() {
        override fun getConstructor(): Int = 542_199_642
    }

    class LanguagePackString(
        @JvmField
        val key: String,
        @JvmField
        val value: LanguagePackStringValue?,
    ) : Object() {
        override fun getConstructor(): Int = 1_307_632_736
    }

    abstract class LanguagePackStringValue : Object()

    class LanguagePackStringValueOrdinary(
        @JvmField
        val value: String,
    ) : LanguagePackStringValue() {
        override fun getConstructor(): Int = -249_256_352
    }

    class LanguagePackStringValuePluralized(
        @JvmField
        val zeroValue: String,
        @JvmField
        val oneValue: String,
        @JvmField
        val twoValue: String,
        @JvmField
        val fewValue: String,
        @JvmField
        val manyValue: String,
        @JvmField
        val otherValue: String,
    ) : LanguagePackStringValue() {
        override fun getConstructor(): Int = 1_906_840_261
    }

    class LanguagePackStringValueDeleted : LanguagePackStringValue() {
        override fun getConstructor(): Int = 1_834_792_698
    }

    class LanguagePackStrings(
        @JvmField
        val strings: Array<LanguagePackString>,
    ) : Object() {
        override fun getConstructor(): Int = 1_172_082_922
    }

    class LinkPreview(
        @JvmField
        val url: String,
        @JvmField
        val displayUrl: String,
        @JvmField
        val siteName: String,
        @JvmField
        val title: String,
        @JvmField
        val description: FormattedText,
        @JvmField
        val author: String,
        @JvmField
        val type: LinkPreviewType,
        @JvmField
        val hasLargeMedia: Boolean,
        @JvmField
        val showLargeMedia: Boolean,
        @JvmField
        val showMediaAboveDescription: Boolean,
        @JvmField
        val skipConfirmation: Boolean,
        @JvmField
        val showAboveText: Boolean,
        @JvmField
        val instantViewVersion: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_729_417_714
    }

    abstract class LinkPreviewAlbumMedia : Object()

    class LinkPreviewAlbumMediaPhoto(
        @JvmField
        val photo: Photo,
    ) : LinkPreviewAlbumMedia() {
        override fun getConstructor(): Int = -935_480_434
    }

    class LinkPreviewAlbumMediaVideo(
        @JvmField
        val video: Video,
    ) : LinkPreviewAlbumMedia() {
        override fun getConstructor(): Int = 390_616_795
    }

    class LinkPreviewOptions(
        @JvmField
        val isDisabled: Boolean,
        @JvmField
        val url: String,
        @JvmField
        val forceSmallMedia: Boolean,
        @JvmField
        val forceLargeMedia: Boolean,
        @JvmField
        val showAboveText: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_046_590_451
    }

    abstract class LinkPreviewType : Object()

    class LinkPreviewTypeAlbum(
        @JvmField
        val media: Array<LinkPreviewAlbumMedia>,
        @JvmField
        val caption: String,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -919_156_671
    }

    class LinkPreviewTypeAnimation(
        @JvmField
        val animation: Animation,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -1_386_429_132
    }

    class LinkPreviewTypeApp(
        @JvmField
        val photo: Photo,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -475_623_953
    }

    class LinkPreviewTypeArticle(
        @JvmField
        val photo: Photo?,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = 2_093_915_097
    }

    class LinkPreviewTypeAudio(
        @JvmField
        val audio: Audio,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = 1_977_878_482
    }

    class LinkPreviewTypeBackground(
        @JvmField
        val document: Document?,
        @JvmField
        val backgroundType: BackgroundType?,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = 977_838_560
    }

    class LinkPreviewTypeChannelBoost(
        @JvmField
        val photo: ChatPhoto?,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -957_086_634
    }

    class LinkPreviewTypeChat(
        @JvmField
        val type: InviteLinkChatType,
        @JvmField
        val photo: ChatPhoto?,
        @JvmField
        val createsJoinRequest: Boolean,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -1_372_610_270
    }

    class LinkPreviewTypeDocument(
        @JvmField
        val document: Document,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -1_090_426_462
    }

    class LinkPreviewTypeEmbeddedAnimationPlayer(
        @JvmField
        val url: String,
        @JvmField
        val thumbnail: Photo?,
        @JvmField
        val duration: Int,
        @JvmField
        val width: Int,
        @JvmField
        val height: Int,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -1_436_887_547
    }

    class LinkPreviewTypeEmbeddedAudioPlayer(
        @JvmField
        val url: String,
        @JvmField
        val thumbnail: Photo?,
        @JvmField
        val duration: Int,
        @JvmField
        val width: Int,
        @JvmField
        val height: Int,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = 571_163_292
    }

    class LinkPreviewTypeEmbeddedVideoPlayer(
        @JvmField
        val url: String,
        @JvmField
        val thumbnail: Photo?,
        @JvmField
        val duration: Int,
        @JvmField
        val width: Int,
        @JvmField
        val height: Int,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -1_480_606_973
    }

    class LinkPreviewTypeExternalAudio(
        @JvmField
        val url: String,
        @JvmField
        val mimeType: String,
        @JvmField
        val duration: Int,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -1_971_126_291
    }

    class LinkPreviewTypeExternalVideo(
        @JvmField
        val url: String,
        @JvmField
        val mimeType: String,
        @JvmField
        val width: Int,
        @JvmField
        val height: Int,
        @JvmField
        val duration: Int,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = 1_367_198_616
    }

    class LinkPreviewTypeGroupCall : LinkPreviewType() {
        override fun getConstructor(): Int = -1_242_459_936
    }

    class LinkPreviewTypeInvoice : LinkPreviewType() {
        override fun getConstructor(): Int = -729_855_782
    }

    class LinkPreviewTypeMessage : LinkPreviewType() {
        override fun getConstructor(): Int = 435_470_750
    }

    class LinkPreviewTypePhoto(
        @JvmField
        val photo: Photo,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -1_362_122_068
    }

    class LinkPreviewTypePremiumGiftCode : LinkPreviewType() {
        override fun getConstructor(): Int = 1_309_507_761
    }

    class LinkPreviewTypeShareableChatFolder : LinkPreviewType() {
        override fun getConstructor(): Int = -2_141_539_524
    }

    class LinkPreviewTypeSticker(
        @JvmField
        val sticker: Sticker,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = 610_225_445
    }

    class LinkPreviewTypeStickerSet(
        @JvmField
        val stickers: Array<Sticker>,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -145_958_768
    }

    class LinkPreviewTypeStory(
        @JvmField
        val storyPosterChatId: Long,
        @JvmField
        val storyId: Int,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = 1_045_709_531
    }

    class LinkPreviewTypeSupergroupBoost(
        @JvmField
        val photo: ChatPhoto?,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -1_873_345_418
    }

    class LinkPreviewTypeTheme(
        @JvmField
        val documents: Array<Document>,
        @JvmField
        val settings: ThemeSettings?,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -226_118_489
    }

    class LinkPreviewTypeUnsupported : LinkPreviewType() {
        override fun getConstructor(): Int = 1_924_738_233
    }

    class LinkPreviewTypeUpgradedGift(
        @JvmField
        val gift: UpgradedGift,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = 293_249_807
    }

    class LinkPreviewTypeUser(
        @JvmField
        val photo: ChatPhoto?,
        @JvmField
        val isBot: Boolean,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -1_465_024_132
    }

    class LinkPreviewTypeVideo(
        @JvmField
        val video: Video,
        @JvmField
        val cover: Photo?,
        @JvmField
        val startTimestamp: Int,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = 1_573_057_926
    }

    class LinkPreviewTypeVideoChat(
        @JvmField
        val photo: ChatPhoto?,
        @JvmField
        val isLiveStream: Boolean,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = 420_015_635
    }

    class LinkPreviewTypeVideoNote(
        @JvmField
        val videoNote: VideoNote,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -814_687_391
    }

    class LinkPreviewTypeVoiceNote(
        @JvmField
        val voiceNote: VoiceNote,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -757_936_341
    }

    class LinkPreviewTypeWebApp(
        @JvmField
        val photo: Photo?,
    ) : LinkPreviewType() {
        override fun getConstructor(): Int = -1_506_873_462
    }

    class LocalFile(
        @JvmField
        val path: String,
        @JvmField
        val canBeDownloaded: Boolean,
        @JvmField
        val canBeDeleted: Boolean,
        @JvmField
        val isDownloadingActive: Boolean,
        @JvmField
        val isDownloadingCompleted: Boolean,
        @JvmField
        val downloadOffset: Long,
        @JvmField
        val downloadedPrefixSize: Long,
        @JvmField
        val downloadedSize: Long,
    ) : Object() {
        override fun getConstructor(): Int = -1_562_732_153
    }

    class LocalizationTargetInfo(
        @JvmField
        val languagePacks: Array<LanguagePackInfo>,
    ) : Object() {
        override fun getConstructor(): Int = -2_048_670_809
    }

    class Location(
        @JvmField
        val latitude: Double,
        @JvmField
        val longitude: Double,
        @JvmField
        val horizontalAccuracy: Double,
    ) : Object() {
        override fun getConstructor(): Int = -443_392_141
    }

    class LocationAddress(
        @JvmField
        val countryCode: String,
        @JvmField
        val state: String,
        @JvmField
        val city: String,
        @JvmField
        val street: String,
    ) : Object() {
        override fun getConstructor(): Int = -1_545_940_190
    }

    abstract class LogStream : Object()

    class LogStreamDefault : LogStream() {
        override fun getConstructor(): Int = 1_390_581_436
    }

    class LogStreamFile(
        @JvmField
        val path: String,
        @JvmField
        val maxFileSize: Long,
        @JvmField
        val redirectStderr: Boolean,
    ) : LogStream() {
        override fun getConstructor(): Int = 1_532_136_933
    }

    class LogStreamEmpty : LogStream() {
        override fun getConstructor(): Int = -499_912_244
    }

    class LogTags(
        @JvmField
        val tags: Array<String>,
    ) : Object() {
        override fun getConstructor(): Int = -1_604_930_601
    }

    class LogVerbosityLevel(
        @JvmField
        val verbosityLevel: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_734_624_234
    }

    abstract class LoginUrlInfo : Object()

    class LoginUrlInfoOpen(
        @JvmField
        val url: String,
        @JvmField
        val skipConfirmation: Boolean,
    ) : LoginUrlInfo() {
        override fun getConstructor(): Int = 837_282_306
    }

    class LoginUrlInfoRequestConfirmation(
        @JvmField
        val url: String,
        @JvmField
        val domain: String,
        @JvmField
        val botUserId: Long,
        @JvmField
        val requestWriteAccess: Boolean,
    ) : LoginUrlInfo() {
        override fun getConstructor(): Int = 2_128_290_863
    }

    class MainWebApp(
        @JvmField
        val url: String,
        @JvmField
        val mode: WebAppOpenMode,
    ) : Object() {
        override fun getConstructor(): Int = 1_940_368_506
    }

    abstract class MaskPoint : Object()

    class MaskPointForehead : MaskPoint() {
        override fun getConstructor(): Int = 1_027_512_005
    }

    class MaskPointEyes : MaskPoint() {
        override fun getConstructor(): Int = 1_748_310_861
    }

    class MaskPointMouth : MaskPoint() {
        override fun getConstructor(): Int = 411_773_406
    }

    class MaskPointChin : MaskPoint() {
        override fun getConstructor(): Int = 534_995_335
    }

    class MaskPosition(
        @JvmField
        val point: MaskPoint,
        @JvmField
        val xShift: Double,
        @JvmField
        val yShift: Double,
        @JvmField
        val scale: Double,
    ) : Object() {
        override fun getConstructor(): Int = -2_097_433_026
    }

    class Message(
        @JvmField
        val id: Long,
        @JvmField
        val senderId: MessageSender,
        @JvmField
        val chatId: Long,
        @JvmField
        val sendingState: MessageSendingState?,
        @JvmField
        val schedulingState: MessageSchedulingState?,
        @JvmField
        val isOutgoing: Boolean,
        @JvmField
        val isPinned: Boolean,
        @JvmField
        val isFromOffline: Boolean,
        @JvmField
        val canBeSaved: Boolean,
        @JvmField
        val hasTimestampedMedia: Boolean,
        @JvmField
        val isChannelPost: Boolean,
        @JvmField
        val containsUnreadMention: Boolean,
        @JvmField
        val date: Int,
        @JvmField
        val editDate: Int,
        @JvmField
        val forwardInfo: MessageForwardInfo?,
        @JvmField
        val importInfo: MessageImportInfo?,
        @JvmField
        val interactionInfo: MessageInteractionInfo?,
        @JvmField
        val unreadReactions: Array<UnreadReaction>,
        @JvmField
        val factCheck: FactCheck?,
        @JvmField
        val replyTo: MessageReplyTo?,
        @JvmField
        val messageThreadId: Long,
        @JvmField
        val topicId: MessageTopic?,
        @JvmField
        val selfDestructType: MessageSelfDestructType?,
        @JvmField
        val selfDestructIn: Double,
        @JvmField
        val autoDeleteIn: Double,
        @JvmField
        val viaBotUserId: Long,
        @JvmField
        val senderBusinessBotUserId: Long,
        @JvmField
        val senderBoostCount: Int,
        @JvmField
        val paidMessageStarCount: Long,
        @JvmField
        val authorSignature: String,
        @JvmField
        val mediaAlbumId: Long,
        @JvmField
        val effectId: Long,
        @JvmField
        val hasSensitiveContent: Boolean,
        @JvmField
        val restrictionReason: String,
        @JvmField
        val content: MessageContent,
        @JvmField
        val replyMarkup: ReplyMarkup?,
    ) : Object() {
        override fun getConstructor(): Int = -1_108_402_734
    }

    class MessageAutoDeleteTime(
        @JvmField
        val time: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_972_045_589
    }

    class MessageCalendar(
        @JvmField
        val totalCount: Int,
        @JvmField
        val days: Array<MessageCalendarDay>,
    ) : Object() {
        override fun getConstructor(): Int = -1_682_890_519
    }

    class MessageCalendarDay(
        @JvmField
        val totalCount: Int,
        @JvmField
        val message: Message,
    ) : Object() {
        override fun getConstructor(): Int = -376_467_614
    }

    abstract class MessageContent : Object()

    class MessageText(
        @JvmField
        val text: FormattedText,
        @JvmField
        val linkPreview: LinkPreview?,
        @JvmField
        val linkPreviewOptions: LinkPreviewOptions?,
    ) : MessageContent() {
        override fun getConstructor(): Int = 1_751_469_188
    }

    class MessageAnimation(
        @JvmField
        val animation: Animation,
        @JvmField
        val caption: FormattedText,
        @JvmField
        val showCaptionAboveMedia: Boolean,
        @JvmField
        val hasSpoiler: Boolean,
        @JvmField
        val isSecret: Boolean,
    ) : MessageContent() {
        override fun getConstructor(): Int = -1_899_294_424
    }

    class MessageAudio(
        @JvmField
        val audio: Audio,
        @JvmField
        val caption: FormattedText,
    ) : MessageContent() {
        override fun getConstructor(): Int = 276_722_716
    }

    class MessageDocument(
        @JvmField
        val document: Document,
        @JvmField
        val caption: FormattedText,
    ) : MessageContent() {
        override fun getConstructor(): Int = 596_945_783
    }

    class MessagePaidMedia(
        @JvmField
        val starCount: Long,
        @JvmField
        val media: Array<PaidMedia>,
        @JvmField
        val caption: FormattedText,
        @JvmField
        val showCaptionAboveMedia: Boolean,
    ) : MessageContent() {
        override fun getConstructor(): Int = -724_750_073
    }

    class MessagePhoto(
        @JvmField
        val photo: Photo,
        @JvmField
        val caption: FormattedText,
        @JvmField
        val showCaptionAboveMedia: Boolean,
        @JvmField
        val hasSpoiler: Boolean,
        @JvmField
        val isSecret: Boolean,
    ) : MessageContent() {
        override fun getConstructor(): Int = 1_967_947_295
    }

    class MessageSticker(
        @JvmField
        val sticker: Sticker,
        @JvmField
        val isPremium: Boolean,
    ) : MessageContent() {
        override fun getConstructor(): Int = -437_199_670
    }

    class MessageVideo(
        @JvmField
        val video: Video,
        @JvmField
        val alternativeVideos: Array<AlternativeVideo>,
        @JvmField
        val storyboards: Array<VideoStoryboard>,
        @JvmField
        val cover: Photo?,
        @JvmField
        val startTimestamp: Int,
        @JvmField
        val caption: FormattedText,
        @JvmField
        val showCaptionAboveMedia: Boolean,
        @JvmField
        val hasSpoiler: Boolean,
        @JvmField
        val isSecret: Boolean,
    ) : MessageContent() {
        override fun getConstructor(): Int = 952_522_912
    }

    class MessageVideoNote(
        @JvmField
        val videoNote: VideoNote,
        @JvmField
        val isViewed: Boolean,
        @JvmField
        val isSecret: Boolean,
    ) : MessageContent() {
        override fun getConstructor(): Int = 963_323_014
    }

    class MessageVoiceNote(
        @JvmField
        val voiceNote: VoiceNote,
        @JvmField
        val caption: FormattedText,
        @JvmField
        val isListened: Boolean,
    ) : MessageContent() {
        override fun getConstructor(): Int = 527_777_781
    }

    class MessageExpiredPhoto : MessageContent() {
        override fun getConstructor(): Int = -1_404_641_801
    }

    class MessageExpiredVideo : MessageContent() {
        override fun getConstructor(): Int = -1_212_209_981
    }

    class MessageExpiredVideoNote : MessageContent() {
        override fun getConstructor(): Int = 599_540_711
    }

    class MessageExpiredVoiceNote : MessageContent() {
        override fun getConstructor(): Int = 143_684_989
    }

    class MessageLocation(
        @JvmField
        val location: Location,
        @JvmField
        val livePeriod: Int,
        @JvmField
        val expiresIn: Int,
        @JvmField
        val heading: Int,
        @JvmField
        val proximityAlertRadius: Int,
    ) : MessageContent() {
        override fun getConstructor(): Int = 303_973_492
    }

    class MessageVenue(
        @JvmField
        val venue: Venue,
    ) : MessageContent() {
        override fun getConstructor(): Int = -2_146_492_043
    }

    class MessageContact(
        @JvmField
        val contact: Contact,
    ) : MessageContent() {
        override fun getConstructor(): Int = -512_684_966
    }

    class MessageAnimatedEmoji(
        @JvmField
        val animatedEmoji: AnimatedEmoji,
        @JvmField
        val emoji: String,
    ) : MessageContent() {
        override fun getConstructor(): Int = 908_195_298
    }

    class MessageDice(
        @JvmField
        val initialState: DiceStickers?,
        @JvmField
        val finalState: DiceStickers?,
        @JvmField
        val emoji: String,
        @JvmField
        val value: Int,
        @JvmField
        val successAnimationFrameNumber: Int,
    ) : MessageContent() {
        override fun getConstructor(): Int = 1_115_779_641
    }

    class MessageGame(
        @JvmField
        val game: Game,
    ) : MessageContent() {
        override fun getConstructor(): Int = -69_441_162
    }

    class MessagePoll(
        @JvmField
        val poll: Poll,
    ) : MessageContent() {
        override fun getConstructor(): Int = -662_130_099
    }

    class MessageStory(
        @JvmField
        val storyPosterChatId: Long,
        @JvmField
        val storyId: Int,
        @JvmField
        val viaMention: Boolean,
    ) : MessageContent() {
        override fun getConstructor(): Int = 1_514_236_353
    }

    class MessageChecklist(
        @JvmField
        val list: Checklist,
    ) : MessageContent() {
        override fun getConstructor(): Int = 609_926_697
    }

    class MessageInvoice(
        @JvmField
        val productInfo: ProductInfo,
        @JvmField
        val currency: String,
        @JvmField
        val totalAmount: Long,
        @JvmField
        val startParameter: String,
        @JvmField
        val isTest: Boolean,
        @JvmField
        val needShippingAddress: Boolean,
        @JvmField
        val receiptMessageId: Long,
        @JvmField
        val paidMedia: PaidMedia?,
        @JvmField
        val paidMediaCaption: FormattedText?,
    ) : MessageContent() {
        override fun getConstructor(): Int = 263_060_806
    }

    class MessageCall(
        @JvmField
        val isVideo: Boolean,
        @JvmField
        val discardReason: CallDiscardReason,
        @JvmField
        val duration: Int,
    ) : MessageContent() {
        override fun getConstructor(): Int = 538_893_824
    }

    class MessageGroupCall(
        @JvmField
        val isActive: Boolean,
        @JvmField
        val wasMissed: Boolean,
        @JvmField
        val isVideo: Boolean,
        @JvmField
        val duration: Int,
        @JvmField
        val otherParticipantIds: Array<MessageSender>,
    ) : MessageContent() {
        override fun getConstructor(): Int = 1_370_396_295
    }

    class MessageVideoChatScheduled(
        @JvmField
        val groupCallId: Int,
        @JvmField
        val startDate: Int,
    ) : MessageContent() {
        override fun getConstructor(): Int = -1_855_185_481
    }

    class MessageVideoChatStarted(
        @JvmField
        val groupCallId: Int,
    ) : MessageContent() {
        override fun getConstructor(): Int = 521_225_561
    }

    class MessageVideoChatEnded(
        @JvmField
        val duration: Int,
    ) : MessageContent() {
        override fun getConstructor(): Int = 2_032_544_855
    }

    class MessageInviteVideoChatParticipants(
        @JvmField
        val groupCallId: Int,
        @JvmField
        val userIds: LongArray,
    ) : MessageContent() {
        override fun getConstructor(): Int = -1_459_065_585
    }

    class MessageBasicGroupChatCreate(
        @JvmField
        val title: String,
        @JvmField
        val memberUserIds: LongArray,
    ) : MessageContent() {
        override fun getConstructor(): Int = 795_404_060
    }

    class MessageSupergroupChatCreate(
        @JvmField
        val title: String,
    ) : MessageContent() {
        override fun getConstructor(): Int = -434_325_733
    }

    class MessageChatChangeTitle(
        @JvmField
        val title: String,
    ) : MessageContent() {
        override fun getConstructor(): Int = 748_272_449
    }

    class MessageChatChangePhoto(
        @JvmField
        val photo: ChatPhoto,
    ) : MessageContent() {
        override fun getConstructor(): Int = -813_415_093
    }

    class MessageChatDeletePhoto : MessageContent() {
        override fun getConstructor(): Int = -184_374_809
    }

    class MessageChatAddMembers(
        @JvmField
        val memberUserIds: LongArray,
    ) : MessageContent() {
        override fun getConstructor(): Int = 1_701_117_908
    }

    class MessageChatJoinByLink : MessageContent() {
        override fun getConstructor(): Int = 1_846_493_311
    }

    class MessageChatJoinByRequest : MessageContent() {
        override fun getConstructor(): Int = 1_195_428_732
    }

    class MessageChatDeleteMember(
        @JvmField
        val userId: Long,
    ) : MessageContent() {
        override fun getConstructor(): Int = 938_029_481
    }

    class MessageChatUpgradeTo(
        @JvmField
        val supergroupId: Long,
    ) : MessageContent() {
        override fun getConstructor(): Int = 104_813_723
    }

    class MessageChatUpgradeFrom(
        @JvmField
        val title: String,
        @JvmField
        val basicGroupId: Long,
    ) : MessageContent() {
        override fun getConstructor(): Int = 325_954_268
    }

    class MessagePinMessage(
        @JvmField
        val messageId: Long,
    ) : MessageContent() {
        override fun getConstructor(): Int = 953_503_801
    }

    class MessageScreenshotTaken : MessageContent() {
        override fun getConstructor(): Int = -1_564_971_605
    }

    class MessageChatSetBackground(
        @JvmField
        val oldBackgroundMessageId: Long,
        @JvmField
        val background: ChatBackground,
        @JvmField
        val onlyForSelf: Boolean,
    ) : MessageContent() {
        override fun getConstructor(): Int = 1_029_536_832
    }

    class MessageChatSetTheme(
        @JvmField
        val themeName: String,
    ) : MessageContent() {
        override fun getConstructor(): Int = -1_716_612_088
    }

    class MessageChatSetMessageAutoDeleteTime(
        @JvmField
        val messageAutoDeleteTime: Int,
        @JvmField
        val fromUserId: Long,
    ) : MessageContent() {
        override fun getConstructor(): Int = 1_637_745_966
    }

    class MessageChatBoost(
        @JvmField
        val boostCount: Int,
    ) : MessageContent() {
        override fun getConstructor(): Int = 1_583_310_219
    }

    class MessageForumTopicCreated(
        @JvmField
        val name: String,
        @JvmField
        val icon: ForumTopicIcon,
    ) : MessageContent() {
        override fun getConstructor(): Int = -1_194_440_751
    }

    class MessageForumTopicEdited(
        @JvmField
        val name: String,
        @JvmField
        val editIconCustomEmojiId: Boolean,
        @JvmField
        val iconCustomEmojiId: Long,
    ) : MessageContent() {
        override fun getConstructor(): Int = 12_629_888
    }

    class MessageForumTopicIsClosedToggled(
        @JvmField
        val isClosed: Boolean,
    ) : MessageContent() {
        override fun getConstructor(): Int = 1_264_029_664
    }

    class MessageForumTopicIsHiddenToggled(
        @JvmField
        val isHidden: Boolean,
    ) : MessageContent() {
        override fun getConstructor(): Int = -1_751_936_002
    }

    class MessageSuggestProfilePhoto(
        @JvmField
        val photo: ChatPhoto,
    ) : MessageContent() {
        override fun getConstructor(): Int = -1_251_926_297
    }

    class MessageCustomServiceAction(
        @JvmField
        val text: String,
    ) : MessageContent() {
        override fun getConstructor(): Int = 1_435_879_282
    }

    class MessageGameScore(
        @JvmField
        val gameMessageId: Long,
        @JvmField
        val gameId: Long,
        @JvmField
        val score: Int,
    ) : MessageContent() {
        override fun getConstructor(): Int = 1_344_904_575
    }

    class MessagePaymentSuccessful(
        @JvmField
        val invoiceChatId: Long,
        @JvmField
        val invoiceMessageId: Long,
        @JvmField
        val currency: String,
        @JvmField
        val totalAmount: Long,
        @JvmField
        val subscriptionUntilDate: Int,
        @JvmField
        val isRecurring: Boolean,
        @JvmField
        val isFirstRecurring: Boolean,
        @JvmField
        val invoiceName: String,
    ) : MessageContent() {
        override fun getConstructor(): Int = 1_046_878_481
    }

    class MessagePaymentSuccessfulBot(
        @JvmField
        val currency: String,
        @JvmField
        val totalAmount: Long,
        @JvmField
        val subscriptionUntilDate: Int,
        @JvmField
        val isRecurring: Boolean,
        @JvmField
        val isFirstRecurring: Boolean,
        @JvmField
        val invoicePayload: ByteArray,
        @JvmField
        val shippingOptionId: String,
        @JvmField
        val orderInfo: OrderInfo?,
        @JvmField
        val telegramPaymentChargeId: String,
        @JvmField
        val providerPaymentChargeId: String,
    ) : MessageContent() {
        override fun getConstructor(): Int = -949_596_737
    }

    class MessagePaymentRefunded(
        @JvmField
        val ownerId: MessageSender,
        @JvmField
        val currency: String,
        @JvmField
        val totalAmount: Long,
        @JvmField
        val invoicePayload: ByteArray,
        @JvmField
        val telegramPaymentChargeId: String,
        @JvmField
        val providerPaymentChargeId: String,
    ) : MessageContent() {
        override fun getConstructor(): Int = 297_580_787
    }

    class MessageGiftedPremium(
        @JvmField
        val gifterUserId: Long,
        @JvmField
        val receiverUserId: Long,
        @JvmField
        val text: FormattedText,
        @JvmField
        val currency: String,
        @JvmField
        val amount: Long,
        @JvmField
        val cryptocurrency: String,
        @JvmField
        val cryptocurrencyAmount: Long,
        @JvmField
        val monthCount: Int,
        @JvmField
        val sticker: Sticker?,
    ) : MessageContent() {
        override fun getConstructor(): Int = -456_073_094
    }

    class MessagePremiumGiftCode(
        @JvmField
        val creatorId: MessageSender?,
        @JvmField
        val text: FormattedText,
        @JvmField
        val isFromGiveaway: Boolean,
        @JvmField
        val isUnclaimed: Boolean,
        @JvmField
        val currency: String,
        @JvmField
        val amount: Long,
        @JvmField
        val cryptocurrency: String,
        @JvmField
        val cryptocurrencyAmount: Long,
        @JvmField
        val monthCount: Int,
        @JvmField
        val sticker: Sticker?,
        @JvmField
        val code: String,
    ) : MessageContent() {
        override fun getConstructor(): Int = 701_640_270
    }

    class MessageGiveawayCreated(
        @JvmField
        val starCount: Long,
    ) : MessageContent() {
        override fun getConstructor(): Int = 972_252_063
    }

    class MessageGiveaway(
        @JvmField
        val parameters: GiveawayParameters,
        @JvmField
        val winnerCount: Int,
        @JvmField
        val prize: GiveawayPrize,
        @JvmField
        val sticker: Sticker?,
    ) : MessageContent() {
        override fun getConstructor(): Int = -345_908_568
    }

    class MessageGiveawayCompleted(
        @JvmField
        val giveawayMessageId: Long,
        @JvmField
        val winnerCount: Int,
        @JvmField
        val isStarGiveaway: Boolean,
        @JvmField
        val unclaimedPrizeCount: Int,
    ) : MessageContent() {
        override fun getConstructor(): Int = -467_351_305
    }

    class MessageGiveawayWinners(
        @JvmField
        val boostedChatId: Long,
        @JvmField
        val giveawayMessageId: Long,
        @JvmField
        val additionalChatCount: Int,
        @JvmField
        val actualWinnersSelectionDate: Int,
        @JvmField
        val onlyNewMembers: Boolean,
        @JvmField
        val wasRefunded: Boolean,
        @JvmField
        val prize: GiveawayPrize,
        @JvmField
        val prizeDescription: String,
        @JvmField
        val winnerCount: Int,
        @JvmField
        val winnerUserIds: LongArray,
        @JvmField
        val unclaimedPrizeCount: Int,
    ) : MessageContent() {
        override fun getConstructor(): Int = 2_098_585_405
    }

    class MessageGiftedStars(
        @JvmField
        val gifterUserId: Long,
        @JvmField
        val receiverUserId: Long,
        @JvmField
        val currency: String,
        @JvmField
        val amount: Long,
        @JvmField
        val cryptocurrency: String,
        @JvmField
        val cryptocurrencyAmount: Long,
        @JvmField
        val starCount: Long,
        @JvmField
        val transactionId: String,
        @JvmField
        val sticker: Sticker?,
    ) : MessageContent() {
        override fun getConstructor(): Int = 1_102_954_151
    }

    class MessageGiveawayPrizeStars(
        @JvmField
        val starCount: Long,
        @JvmField
        val transactionId: String,
        @JvmField
        val boostedChatId: Long,
        @JvmField
        val giveawayMessageId: Long,
        @JvmField
        val isUnclaimed: Boolean,
        @JvmField
        val sticker: Sticker?,
    ) : MessageContent() {
        override fun getConstructor(): Int = -1_441_833_501
    }

    class MessageGift(
        @JvmField
        val gift: Gift,
        @JvmField
        val senderId: MessageSender,
        @JvmField
        val receiverId: MessageSender,
        @JvmField
        val receivedGiftId: String,
        @JvmField
        val text: FormattedText,
        @JvmField
        val sellStarCount: Long,
        @JvmField
        val prepaidUpgradeStarCount: Long,
        @JvmField
        val isPrivate: Boolean,
        @JvmField
        val isSaved: Boolean,
        @JvmField
        val canBeUpgraded: Boolean,
        @JvmField
        val wasConverted: Boolean,
        @JvmField
        val wasUpgraded: Boolean,
        @JvmField
        val wasRefunded: Boolean,
        @JvmField
        val upgradedReceivedGiftId: String,
    ) : MessageContent() {
        override fun getConstructor(): Int = 608_387_671
    }

    class MessageUpgradedGift(
        @JvmField
        val gift: UpgradedGift,
        @JvmField
        val senderId: MessageSender?,
        @JvmField
        val receiverId: MessageSender,
        @JvmField
        val receivedGiftId: String,
        @JvmField
        val isUpgrade: Boolean,
        @JvmField
        val isSaved: Boolean,
        @JvmField
        val canBeTransferred: Boolean,
        @JvmField
        val wasTransferred: Boolean,
        @JvmField
        val lastResaleStarCount: Long,
        @JvmField
        val transferStarCount: Long,
        @JvmField
        val nextTransferDate: Int,
        @JvmField
        val nextResaleDate: Int,
        @JvmField
        val exportDate: Int,
    ) : MessageContent() {
        override fun getConstructor(): Int = 200_921_321
    }

    class MessageRefundedUpgradedGift(
        @JvmField
        val gift: Gift,
        @JvmField
        val senderId: MessageSender,
        @JvmField
        val receiverId: MessageSender,
        @JvmField
        val isUpgrade: Boolean,
    ) : MessageContent() {
        override fun getConstructor(): Int = -1_881_697_169
    }

    class MessagePaidMessagesRefunded(
        @JvmField
        val messageCount: Int,
        @JvmField
        val starCount: Long,
    ) : MessageContent() {
        override fun getConstructor(): Int = 580_403_343
    }

    class MessagePaidMessagePriceChanged(
        @JvmField
        val paidMessageStarCount: Long,
    ) : MessageContent() {
        override fun getConstructor(): Int = -344_945_397
    }

    class MessageDirectMessagePriceChanged(
        @JvmField
        val isEnabled: Boolean,
        @JvmField
        val paidMessageStarCount: Long,
    ) : MessageContent() {
        override fun getConstructor(): Int = 1_320_832_439
    }

    class MessageChecklistTasksDone(
        @JvmField
        val checklistMessageId: Long,
        @JvmField
        val markedAsDoneTaskIds: IntArray,
        @JvmField
        val markedAsNotDoneTaskIds: IntArray,
    ) : MessageContent() {
        override fun getConstructor(): Int = -716_083_401
    }

    class MessageChecklistTasksAdded(
        @JvmField
        val checklistMessageId: Long,
        @JvmField
        val tasks: Array<ChecklistTask>,
    ) : MessageContent() {
        override fun getConstructor(): Int = 2_057_538_984
    }

    class MessageContactRegistered : MessageContent() {
        override fun getConstructor(): Int = -1_502_020_353
    }

    class MessageUsersShared(
        @JvmField
        val users: Array<SharedUser>,
        @JvmField
        val buttonId: Int,
    ) : MessageContent() {
        override fun getConstructor(): Int = -842_442_318
    }

    class MessageChatShared(
        @JvmField
        val chat: SharedChat,
        @JvmField
        val buttonId: Int,
    ) : MessageContent() {
        override fun getConstructor(): Int = -1_362_699_935
    }

    class MessageBotWriteAccessAllowed(
        @JvmField
        val reason: BotWriteAccessAllowReason,
    ) : MessageContent() {
        override fun getConstructor(): Int = -1_702_185_036
    }

    class MessageWebAppDataSent(
        @JvmField
        val buttonText: String,
    ) : MessageContent() {
        override fun getConstructor(): Int = -83_674_862
    }

    class MessageWebAppDataReceived(
        @JvmField
        val buttonText: String,
        @JvmField
        val data: String,
    ) : MessageContent() {
        override fun getConstructor(): Int = -8_578_539
    }

    class MessagePassportDataSent(
        @JvmField
        val types: Array<PassportElementType>,
    ) : MessageContent() {
        override fun getConstructor(): Int = 1_017_405_171
    }

    class MessagePassportDataReceived(
        @JvmField
        val elements: Array<EncryptedPassportElement>,
        @JvmField
        val credentials: EncryptedCredentials,
    ) : MessageContent() {
        override fun getConstructor(): Int = -1_367_863_624
    }

    class MessageProximityAlertTriggered(
        @JvmField
        val travelerId: MessageSender,
        @JvmField
        val watcherId: MessageSender,
        @JvmField
        val distance: Int,
    ) : MessageContent() {
        override fun getConstructor(): Int = 67_761_875
    }

    class MessageUnsupported : MessageContent() {
        override fun getConstructor(): Int = -1_816_726_139
    }

    class MessageCopyOptions(
        @JvmField
        val sendCopy: Boolean,
        @JvmField
        val replaceCaption: Boolean,
        @JvmField
        val newCaption: FormattedText?,
        @JvmField
        val newShowCaptionAboveMedia: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_079_772_090
    }

    class MessageEffect(
        @JvmField
        val id: Long,
        @JvmField
        val staticIcon: Sticker?,
        @JvmField
        val emoji: String,
        @JvmField
        val isPremium: Boolean,
        @JvmField
        val type: MessageEffectType,
    ) : Object() {
        override fun getConstructor(): Int = -1_758_836_433
    }

    abstract class MessageEffectType : Object()

    class MessageEffectTypeEmojiReaction(
        @JvmField
        val selectAnimation: Sticker,
        @JvmField
        val effectAnimation: Sticker,
    ) : MessageEffectType() {
        override fun getConstructor(): Int = 1_756_079_678
    }

    class MessageEffectTypePremiumSticker(
        @JvmField
        val sticker: Sticker,
    ) : MessageEffectType() {
        override fun getConstructor(): Int = 1_637_231_609
    }

    abstract class MessageFileType : Object()

    class MessageFileTypePrivate(
        @JvmField
        val name: String,
    ) : MessageFileType() {
        override fun getConstructor(): Int = -521_908_524
    }

    class MessageFileTypeGroup(
        @JvmField
        val title: String,
    ) : MessageFileType() {
        override fun getConstructor(): Int = -219_836_568
    }

    class MessageFileTypeUnknown : MessageFileType() {
        override fun getConstructor(): Int = 1_176_353_458
    }

    class MessageForwardInfo(
        @JvmField
        val origin: MessageOrigin,
        @JvmField
        val date: Int,
        @JvmField
        val source: ForwardSource?,
        @JvmField
        val publicServiceAnnouncementType: String,
    ) : Object() {
        override fun getConstructor(): Int = -880_313_475
    }

    class MessageImportInfo(
        @JvmField
        val senderName: String,
        @JvmField
        val date: Int,
    ) : Object() {
        override fun getConstructor(): Int = -421_549_105
    }

    class MessageInteractionInfo(
        @JvmField
        val viewCount: Int,
        @JvmField
        val forwardCount: Int,
        @JvmField
        val replyInfo: MessageReplyInfo?,
        @JvmField
        val reactions: MessageReactions?,
    ) : Object() {
        override fun getConstructor(): Int = 733_797_893
    }

    class MessageLink(
        @JvmField
        val link: String,
        @JvmField
        val isPublic: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -1_354_089_818
    }

    class MessageLinkInfo(
        @JvmField
        val isPublic: Boolean,
        @JvmField
        val chatId: Long,
        @JvmField
        val messageThreadId: Long,
        @JvmField
        val message: Message?,
        @JvmField
        val mediaTimestamp: Int,
        @JvmField
        val forAlbum: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 731_315_024
    }

    abstract class MessageOrigin : Object()

    class MessageOriginUser(
        @JvmField
        val senderUserId: Long,
    ) : MessageOrigin() {
        override fun getConstructor(): Int = -1_677_684_669
    }

    class MessageOriginHiddenUser(
        @JvmField
        val senderName: String,
    ) : MessageOrigin() {
        override fun getConstructor(): Int = -317_971_494
    }

    class MessageOriginChat(
        @JvmField
        val senderChatId: Long,
        @JvmField
        val authorSignature: String,
    ) : MessageOrigin() {
        override fun getConstructor(): Int = -205_824_332
    }

    class MessageOriginChannel(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val authorSignature: String,
    ) : MessageOrigin() {
        override fun getConstructor(): Int = -1_451_535_938
    }

    class MessagePosition(
        @JvmField
        val position: Int,
        @JvmField
        val messageId: Long,
        @JvmField
        val date: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_292_189_935
    }

    class MessagePositions(
        @JvmField
        val totalCount: Int,
        @JvmField
        val positions: Array<MessagePosition>,
    ) : Object() {
        override fun getConstructor(): Int = -1_930_466_649
    }

    class MessageProperties(
        @JvmField
        val canAddTasks: Boolean,
        @JvmField
        val canBeCopied: Boolean,
        @JvmField
        val canBeCopiedToSecretChat: Boolean,
        @JvmField
        val canBeDeletedOnlyForSelf: Boolean,
        @JvmField
        val canBeDeletedForAllUsers: Boolean,
        @JvmField
        val canBeEdited: Boolean,
        @JvmField
        val canBeForwarded: Boolean,
        @JvmField
        val canBePaid: Boolean,
        @JvmField
        val canBePinned: Boolean,
        @JvmField
        val canBeReplied: Boolean,
        @JvmField
        val canBeRepliedInAnotherChat: Boolean,
        @JvmField
        val canBeSaved: Boolean,
        @JvmField
        val canBeSharedInStory: Boolean,
        @JvmField
        val canEditMedia: Boolean,
        @JvmField
        val canEditSchedulingState: Boolean,
        @JvmField
        val canGetAuthor: Boolean,
        @JvmField
        val canGetEmbeddingCode: Boolean,
        @JvmField
        val canGetLink: Boolean,
        @JvmField
        val canGetMediaTimestampLinks: Boolean,
        @JvmField
        val canGetMessageThread: Boolean,
        @JvmField
        val canGetReadDate: Boolean,
        @JvmField
        val canGetStatistics: Boolean,
        @JvmField
        val canGetVideoAdvertisements: Boolean,
        @JvmField
        val canGetViewers: Boolean,
        @JvmField
        val canMarkTasksAsDone: Boolean,
        @JvmField
        val canRecognizeSpeech: Boolean,
        @JvmField
        val canReportChat: Boolean,
        @JvmField
        val canReportReactions: Boolean,
        @JvmField
        val canReportSupergroupSpam: Boolean,
        @JvmField
        val canSetFactCheck: Boolean,
        @JvmField
        val needShowStatistics: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_122_190_783
    }

    class MessageReaction(
        @JvmField
        val type: ReactionType,
        @JvmField
        val totalCount: Int,
        @JvmField
        val isChosen: Boolean,
        @JvmField
        val usedSenderId: MessageSender?,
        @JvmField
        val recentSenderIds: Array<MessageSender>,
    ) : Object() {
        override fun getConstructor(): Int = -1_093_994_369
    }

    class MessageReactions(
        @JvmField
        val reactions: Array<MessageReaction>,
        @JvmField
        val areTags: Boolean,
        @JvmField
        val paidReactors: Array<PaidReactor>,
        @JvmField
        val canGetAddedReactions: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_475_966_817
    }

    abstract class MessageReadDate : Object()

    class MessageReadDateRead(
        @JvmField
        val readDate: Int,
    ) : MessageReadDate() {
        override fun getConstructor(): Int = 1_972_186_672
    }

    class MessageReadDateUnread : MessageReadDate() {
        override fun getConstructor(): Int = 397_549_868
    }

    class MessageReadDateTooOld : MessageReadDate() {
        override fun getConstructor(): Int = -1_233_773_024
    }

    class MessageReadDateUserPrivacyRestricted : MessageReadDate() {
        override fun getConstructor(): Int = -1_282_567_130
    }

    class MessageReadDateMyPrivacyRestricted : MessageReadDate() {
        override fun getConstructor(): Int = -693_971_852
    }

    class MessageReplyInfo(
        @JvmField
        val replyCount: Int,
        @JvmField
        val recentReplierIds: Array<MessageSender>,
        @JvmField
        val lastReadInboxMessageId: Long,
        @JvmField
        val lastReadOutboxMessageId: Long,
        @JvmField
        val lastMessageId: Long,
    ) : Object() {
        override fun getConstructor(): Int = -2_093_702_263
    }

    abstract class MessageReplyTo : Object()

    class MessageReplyToMessage(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val quote: TextQuote?,
        @JvmField
        val origin: MessageOrigin?,
        @JvmField
        val originSendDate: Int,
        @JvmField
        val content: MessageContent?,
    ) : MessageReplyTo() {
        override fun getConstructor(): Int = -300_918_393
    }

    class MessageReplyToStory(
        @JvmField
        val storyPosterChatId: Long,
        @JvmField
        val storyId: Int,
    ) : MessageReplyTo() {
        override fun getConstructor(): Int = -674_492_596
    }

    abstract class MessageSchedulingState : Object()

    class MessageSchedulingStateSendAtDate(
        @JvmField
        val sendDate: Int,
    ) : MessageSchedulingState() {
        override fun getConstructor(): Int = -1_485_570_073
    }

    class MessageSchedulingStateSendWhenOnline : MessageSchedulingState() {
        override fun getConstructor(): Int = 2_092_947_464
    }

    class MessageSchedulingStateSendWhenVideoProcessed(
        @JvmField
        val sendDate: Int,
    ) : MessageSchedulingState() {
        override fun getConstructor(): Int = 2_101_578_734
    }

    abstract class MessageSelfDestructType : Object()

    class MessageSelfDestructTypeTimer(
        @JvmField
        val selfDestructTime: Int,
    ) : MessageSelfDestructType() {
        override fun getConstructor(): Int = 1_351_440_333
    }

    class MessageSelfDestructTypeImmediately : MessageSelfDestructType() {
        override fun getConstructor(): Int = -1_036_218_363
    }

    class MessageSendOptions(
        @JvmField
        val directMessagesChatTopicId: Long,
        @JvmField
        val disableNotification: Boolean,
        @JvmField
        val fromBackground: Boolean,
        @JvmField
        val protectContent: Boolean,
        @JvmField
        val allowPaidBroadcast: Boolean,
        @JvmField
        val paidMessageStarCount: Long,
        @JvmField
        val updateOrderOfInstalledStickerSets: Boolean,
        @JvmField
        val schedulingState: MessageSchedulingState?,
        @JvmField
        val effectId: Long,
        @JvmField
        val sendingId: Int,
        @JvmField
        val onlyPreview: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_944_319_036
    }

    abstract class MessageSender : Object()

    class MessageSenderUser(
        @JvmField
        val userId: Long,
    ) : MessageSender() {
        override fun getConstructor(): Int = -336_109_341
    }

    class MessageSenderChat(
        @JvmField
        val chatId: Long,
    ) : MessageSender() {
        override fun getConstructor(): Int = -239_660_751
    }

    class MessageSenders(
        @JvmField
        val totalCount: Int,
        @JvmField
        val senders: Array<MessageSender>,
    ) : Object() {
        override fun getConstructor(): Int = -690_158_467
    }

    abstract class MessageSendingState : Object()

    class MessageSendingStatePending(
        @JvmField
        val sendingId: Int,
    ) : MessageSendingState() {
        override fun getConstructor(): Int = -215_260_236
    }

    class MessageSendingStateFailed(
        @JvmField
        val error: Error,
        @JvmField
        val canRetry: Boolean,
        @JvmField
        val needAnotherSender: Boolean,
        @JvmField
        val needAnotherReplyQuote: Boolean,
        @JvmField
        val needDropReply: Boolean,
        @JvmField
        val requiredPaidMessageStarCount: Long,
        @JvmField
        val retryAfter: Double,
    ) : MessageSendingState() {
        override fun getConstructor(): Int = -777_630_522
    }

    abstract class MessageSource : Object()

    class MessageSourceChatHistory : MessageSource() {
        override fun getConstructor(): Int = -1_090_386_116
    }

    class MessageSourceMessageThreadHistory : MessageSource() {
        override fun getConstructor(): Int = 290_427_142
    }

    class MessageSourceForumTopicHistory : MessageSource() {
        override fun getConstructor(): Int = -1_518_064_457
    }

    class MessageSourceDirectMessagesChatTopicHistory : MessageSource() {
        override fun getConstructor(): Int = 1_869_256_503
    }

    class MessageSourceHistoryPreview : MessageSource() {
        override fun getConstructor(): Int = 1_024_254_993
    }

    class MessageSourceChatList : MessageSource() {
        override fun getConstructor(): Int = -2_047_406_102
    }

    class MessageSourceSearch : MessageSource() {
        override fun getConstructor(): Int = 1_921_333_105
    }

    class MessageSourceChatEventLog : MessageSource() {
        override fun getConstructor(): Int = -1_028_777_540
    }

    class MessageSourceNotification : MessageSource() {
        override fun getConstructor(): Int = -1_046_406_163
    }

    class MessageSourceScreenshot : MessageSource() {
        override fun getConstructor(): Int = 469_982_474
    }

    class MessageSourceOther : MessageSource() {
        override fun getConstructor(): Int = 901_818_114
    }

    class MessageStatistics(
        @JvmField
        val messageInteractionGraph: StatisticalGraph,
        @JvmField
        val messageReactionGraph: StatisticalGraph,
    ) : Object() {
        override fun getConstructor(): Int = -1_563_537_657
    }

    class MessageThreadInfo(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageThreadId: Long,
        @JvmField
        val replyInfo: MessageReplyInfo?,
        @JvmField
        val unreadMessageCount: Int,
        @JvmField
        val messages: Array<Message>,
        @JvmField
        val draftMessage: DraftMessage?,
    ) : Object() {
        override fun getConstructor(): Int = -248_536_056
    }

    abstract class MessageTopic : Object()

    class MessageTopicForum(
        @JvmField
        val forumTopicId: Long,
    ) : MessageTopic() {
        override fun getConstructor(): Int = 1_997_025_385
    }

    class MessageTopicDirectMessages(
        @JvmField
        val directMessagesChatTopicId: Long,
    ) : MessageTopic() {
        override fun getConstructor(): Int = -1_285_378_599
    }

    class MessageTopicSavedMessages(
        @JvmField
        val savedMessagesTopicId: Long,
    ) : MessageTopic() {
        override fun getConstructor(): Int = 588_026_991
    }

    class MessageViewer(
        @JvmField
        val userId: Long,
        @JvmField
        val viewDate: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_458_639_309
    }

    class MessageViewers(
        @JvmField
        val viewers: Array<MessageViewer>,
    ) : Object() {
        override fun getConstructor(): Int = 2_116_480_287
    }

    class Messages(
        @JvmField
        val totalCount: Int,
        @JvmField
        val messages: Array<Message>?,
    ) : Object() {
        override fun getConstructor(): Int = -16_498_159
    }

    class Minithumbnail(
        @JvmField
        val width: Int,
        @JvmField
        val height: Int,
        @JvmField
        val data: ByteArray,
    ) : Object() {
        override fun getConstructor(): Int = -328_540_758
    }

    class NetworkStatistics(
        @JvmField
        val sinceDate: Int,
        @JvmField
        val entries: Array<NetworkStatisticsEntry>,
    ) : Object() {
        override fun getConstructor(): Int = 1_615_554_212
    }

    abstract class NetworkStatisticsEntry : Object()

    class NetworkStatisticsEntryFile(
        @JvmField
        val fileType: FileType?,
        @JvmField
        val networkType: NetworkType,
        @JvmField
        val sentBytes: Long,
        @JvmField
        val receivedBytes: Long,
    ) : NetworkStatisticsEntry() {
        override fun getConstructor(): Int = 188_452_706
    }

    class NetworkStatisticsEntryCall(
        @JvmField
        val networkType: NetworkType,
        @JvmField
        val sentBytes: Long,
        @JvmField
        val receivedBytes: Long,
        @JvmField
        val duration: Double,
    ) : NetworkStatisticsEntry() {
        override fun getConstructor(): Int = 737_000_365
    }

    abstract class NetworkType : Object()

    class NetworkTypeNone : NetworkType() {
        override fun getConstructor(): Int = -1_971_691_759
    }

    class NetworkTypeMobile : NetworkType() {
        override fun getConstructor(): Int = 819_228_239
    }

    class NetworkTypeMobileRoaming : NetworkType() {
        override fun getConstructor(): Int = -1_435_199_760
    }

    class NetworkTypeWiFi : NetworkType() {
        override fun getConstructor(): Int = -633_872_070
    }

    class NetworkTypeOther : NetworkType() {
        override fun getConstructor(): Int = 1_942_128_539
    }

    class NewChatPrivacySettings(
        @JvmField
        val allowNewChatsFromUnknownUsers: Boolean,
        @JvmField
        val incomingPaidMessageStarCount: Long,
    ) : Object() {
        override fun getConstructor(): Int = 123_716_192
    }

    class Notification(
        @JvmField
        val id: Int,
        @JvmField
        val date: Int,
        @JvmField
        val isSilent: Boolean,
        @JvmField
        val type: NotificationType,
    ) : Object() {
        override fun getConstructor(): Int = 788_743_120
    }

    class NotificationGroup(
        @JvmField
        val id: Int,
        @JvmField
        val type: NotificationGroupType,
        @JvmField
        val chatId: Long,
        @JvmField
        val totalCount: Int,
        @JvmField
        val notifications: Array<Notification>,
    ) : Object() {
        override fun getConstructor(): Int = 780_691_541
    }

    abstract class NotificationGroupType : Object()

    class NotificationGroupTypeMessages : NotificationGroupType() {
        override fun getConstructor(): Int = -1_702_481_123
    }

    class NotificationGroupTypeMentions : NotificationGroupType() {
        override fun getConstructor(): Int = -2_050_324_051
    }

    class NotificationGroupTypeSecretChat : NotificationGroupType() {
        override fun getConstructor(): Int = 1_390_759_476
    }

    class NotificationGroupTypeCalls : NotificationGroupType() {
        override fun getConstructor(): Int = 1_379_123_538
    }

    abstract class NotificationSettingsScope : Object()

    class NotificationSettingsScopePrivateChats : NotificationSettingsScope() {
        override fun getConstructor(): Int = 937_446_759
    }

    class NotificationSettingsScopeGroupChats : NotificationSettingsScope() {
        override fun getConstructor(): Int = 1_212_142_067
    }

    class NotificationSettingsScopeChannelChats : NotificationSettingsScope() {
        override fun getConstructor(): Int = 548_013_448
    }

    class NotificationSound(
        @JvmField
        val id: Long,
        @JvmField
        val duration: Int,
        @JvmField
        val date: Int,
        @JvmField
        val title: String,
        @JvmField
        val data: String,
        @JvmField
        val sound: File,
    ) : Object() {
        override fun getConstructor(): Int = -185_638_601
    }

    class NotificationSounds(
        @JvmField
        val notificationSounds: Array<NotificationSound>,
    ) : Object() {
        override fun getConstructor(): Int = -630_813_169
    }

    abstract class NotificationType : Object()

    class NotificationTypeNewMessage(
        @JvmField
        val message: Message,
        @JvmField
        val showPreview: Boolean,
    ) : NotificationType() {
        override fun getConstructor(): Int = -254_745_614
    }

    class NotificationTypeNewSecretChat : NotificationType() {
        override fun getConstructor(): Int = 1_198_638_768
    }

    class NotificationTypeNewCall(
        @JvmField
        val callId: Int,
    ) : NotificationType() {
        override fun getConstructor(): Int = 1_712_734_585
    }

    class NotificationTypeNewPushMessage(
        @JvmField
        val messageId: Long,
        @JvmField
        val senderId: MessageSender,
        @JvmField
        val senderName: String,
        @JvmField
        val isOutgoing: Boolean,
        @JvmField
        val content: PushMessageContent,
    ) : NotificationType() {
        override fun getConstructor(): Int = -711_680_462
    }

    class Ok : Object() {
        override fun getConstructor(): Int = -722_616_727
    }

    abstract class OptionValue : Object()

    class OptionValueBoolean(
        @JvmField
        val value: Boolean,
    ) : OptionValue() {
        override fun getConstructor(): Int = 63_135_518
    }

    class OptionValueEmpty : OptionValue() {
        override fun getConstructor(): Int = 918_955_155
    }

    class OptionValueInteger(
        @JvmField
        val value: Long,
    ) : OptionValue() {
        override fun getConstructor(): Int = -186_858_780
    }

    class OptionValueString(
        @JvmField
        val value: String,
    ) : OptionValue() {
        override fun getConstructor(): Int = 756_248_212
    }

    class OrderInfo(
        @JvmField
        val name: String,
        @JvmField
        val phoneNumber: String,
        @JvmField
        val emailAddress: String,
        @JvmField
        val shippingAddress: Address?,
    ) : Object() {
        override fun getConstructor(): Int = 783_997_294
    }

    class Outline(
        @JvmField
        val paths: Array<ClosedVectorPath>,
    ) : Object() {
        override fun getConstructor(): Int = -161_506_702
    }

    abstract class PageBlock : Object()

    class PageBlockTitle(
        @JvmField
        val title: RichText,
    ) : PageBlock() {
        override fun getConstructor(): Int = 1_629_664_784
    }

    class PageBlockSubtitle(
        @JvmField
        val subtitle: RichText,
    ) : PageBlock() {
        override fun getConstructor(): Int = 264_524_263
    }

    class PageBlockAuthorDate(
        @JvmField
        val author: RichText,
        @JvmField
        val publishDate: Int,
    ) : PageBlock() {
        override fun getConstructor(): Int = 1_300_231_184
    }

    class PageBlockHeader(
        @JvmField
        val header: RichText,
    ) : PageBlock() {
        override fun getConstructor(): Int = 1_402_854_811
    }

    class PageBlockSubheader(
        @JvmField
        val subheader: RichText,
    ) : PageBlock() {
        override fun getConstructor(): Int = 1_263_956_774
    }

    class PageBlockKicker(
        @JvmField
        val kicker: RichText,
    ) : PageBlock() {
        override fun getConstructor(): Int = 1_361_282_635
    }

    class PageBlockParagraph(
        @JvmField
        val text: RichText,
    ) : PageBlock() {
        override fun getConstructor(): Int = 1_182_402_406
    }

    class PageBlockPreformatted(
        @JvmField
        val text: RichText,
        @JvmField
        val language: String,
    ) : PageBlock() {
        override fun getConstructor(): Int = -1_066_346_178
    }

    class PageBlockFooter(
        @JvmField
        val footer: RichText,
    ) : PageBlock() {
        override fun getConstructor(): Int = 886_429_480
    }

    class PageBlockDivider : PageBlock() {
        override fun getConstructor(): Int = -618_614_392
    }

    class PageBlockAnchor(
        @JvmField
        val name: String,
    ) : PageBlock() {
        override fun getConstructor(): Int = -837_994_576
    }

    class PageBlockList(
        @JvmField
        val items: Array<PageBlockListItem>,
    ) : PageBlock() {
        override fun getConstructor(): Int = -1_037_074_852
    }

    class PageBlockBlockQuote(
        @JvmField
        val text: RichText,
        @JvmField
        val credit: RichText,
    ) : PageBlock() {
        override fun getConstructor(): Int = 1_657_834_142
    }

    class PageBlockPullQuote(
        @JvmField
        val text: RichText,
        @JvmField
        val credit: RichText,
    ) : PageBlock() {
        override fun getConstructor(): Int = 490_242_317
    }

    class PageBlockAnimation(
        @JvmField
        val animation: Animation?,
        @JvmField
        val caption: PageBlockCaption,
        @JvmField
        val needAutoplay: Boolean,
    ) : PageBlock() {
        override fun getConstructor(): Int = 1_355_669_513
    }

    class PageBlockAudio(
        @JvmField
        val audio: Audio?,
        @JvmField
        val caption: PageBlockCaption,
    ) : PageBlock() {
        override fun getConstructor(): Int = -63_371_245
    }

    class PageBlockPhoto(
        @JvmField
        val photo: Photo?,
        @JvmField
        val caption: PageBlockCaption,
        @JvmField
        val url: String,
    ) : PageBlock() {
        override fun getConstructor(): Int = 417_601_156
    }

    class PageBlockVideo(
        @JvmField
        val video: Video?,
        @JvmField
        val caption: PageBlockCaption,
        @JvmField
        val needAutoplay: Boolean,
        @JvmField
        val isLooped: Boolean,
    ) : PageBlock() {
        override fun getConstructor(): Int = 510_041_394
    }

    class PageBlockVoiceNote(
        @JvmField
        val voiceNote: VoiceNote?,
        @JvmField
        val caption: PageBlockCaption,
    ) : PageBlock() {
        override fun getConstructor(): Int = 1_823_310_463
    }

    class PageBlockCover(
        @JvmField
        val cover: PageBlock,
    ) : PageBlock() {
        override fun getConstructor(): Int = 972_174_080
    }

    class PageBlockEmbedded(
        @JvmField
        val url: String,
        @JvmField
        val html: String,
        @JvmField
        val posterPhoto: Photo?,
        @JvmField
        val width: Int,
        @JvmField
        val height: Int,
        @JvmField
        val caption: PageBlockCaption,
        @JvmField
        val isFullWidth: Boolean,
        @JvmField
        val allowScrolling: Boolean,
    ) : PageBlock() {
        override fun getConstructor(): Int = -1_942_577_763
    }

    class PageBlockEmbeddedPost(
        @JvmField
        val url: String,
        @JvmField
        val author: String,
        @JvmField
        val authorPhoto: Photo?,
        @JvmField
        val date: Int,
        @JvmField
        val pageBlocks: Array<PageBlock>,
        @JvmField
        val caption: PageBlockCaption,
    ) : PageBlock() {
        override fun getConstructor(): Int = 397_600_949
    }

    class PageBlockCollage(
        @JvmField
        val pageBlocks: Array<PageBlock>,
        @JvmField
        val caption: PageBlockCaption,
    ) : PageBlock() {
        override fun getConstructor(): Int = 1_163_760_110
    }

    class PageBlockSlideshow(
        @JvmField
        val pageBlocks: Array<PageBlock>,
        @JvmField
        val caption: PageBlockCaption,
    ) : PageBlock() {
        override fun getConstructor(): Int = 539_217_375
    }

    class PageBlockChatLink(
        @JvmField
        val title: String,
        @JvmField
        val photo: ChatPhotoInfo?,
        @JvmField
        val accentColorId: Int,
        @JvmField
        val username: String,
    ) : PageBlock() {
        override fun getConstructor(): Int = 1_646_188_731
    }

    class PageBlockTable(
        @JvmField
        val caption: RichText,
        @JvmField
        val cells: Array<Array<PageBlockTableCell>>,
        @JvmField
        val isBordered: Boolean,
        @JvmField
        val isStriped: Boolean,
    ) : PageBlock() {
        override fun getConstructor(): Int = -942_649_288
    }

    class PageBlockDetails(
        @JvmField
        val header: RichText,
        @JvmField
        val pageBlocks: Array<PageBlock>,
        @JvmField
        val isOpen: Boolean,
    ) : PageBlock() {
        override fun getConstructor(): Int = -1_599_869_809
    }

    class PageBlockRelatedArticles(
        @JvmField
        val header: RichText,
        @JvmField
        val articles: Array<PageBlockRelatedArticle>,
    ) : PageBlock() {
        override fun getConstructor(): Int = -1_807_324_374
    }

    class PageBlockMap(
        @JvmField
        val location: Location,
        @JvmField
        val zoom: Int,
        @JvmField
        val width: Int,
        @JvmField
        val height: Int,
        @JvmField
        val caption: PageBlockCaption,
    ) : PageBlock() {
        override fun getConstructor(): Int = 1_510_961_171
    }

    class PageBlockCaption(
        @JvmField
        val text: RichText,
        @JvmField
        val credit: RichText,
    ) : Object() {
        override fun getConstructor(): Int = -1_180_064_650
    }

    abstract class PageBlockHorizontalAlignment : Object()

    class PageBlockHorizontalAlignmentLeft : PageBlockHorizontalAlignment() {
        override fun getConstructor(): Int = 848_701_417
    }

    class PageBlockHorizontalAlignmentCenter : PageBlockHorizontalAlignment() {
        override fun getConstructor(): Int = -1_009_203_990
    }

    class PageBlockHorizontalAlignmentRight : PageBlockHorizontalAlignment() {
        override fun getConstructor(): Int = 1_371_369_214
    }

    class PageBlockListItem(
        @JvmField
        val label: String,
        @JvmField
        val pageBlocks: Array<PageBlock>,
    ) : Object() {
        override fun getConstructor(): Int = 323_186_259
    }

    class PageBlockRelatedArticle(
        @JvmField
        val url: String,
        @JvmField
        val title: String,
        @JvmField
        val description: String,
        @JvmField
        val photo: Photo?,
        @JvmField
        val author: String,
        @JvmField
        val publishDate: Int,
    ) : Object() {
        override fun getConstructor(): Int = 481_199_251
    }

    class PageBlockTableCell(
        @JvmField
        val text: RichText?,
        @JvmField
        val isHeader: Boolean,
        @JvmField
        val colspan: Int,
        @JvmField
        val rowspan: Int,
        @JvmField
        val align: PageBlockHorizontalAlignment,
        @JvmField
        val valign: PageBlockVerticalAlignment,
    ) : Object() {
        override fun getConstructor(): Int = 1_417_658_214
    }

    abstract class PageBlockVerticalAlignment : Object()

    class PageBlockVerticalAlignmentTop : PageBlockVerticalAlignment() {
        override fun getConstructor(): Int = 195_500_454
    }

    class PageBlockVerticalAlignmentMiddle : PageBlockVerticalAlignment() {
        override fun getConstructor(): Int = -2_123_096_587
    }

    class PageBlockVerticalAlignmentBottom : PageBlockVerticalAlignment() {
        override fun getConstructor(): Int = 2_092_531_158
    }

    abstract class PaidMedia : Object()

    class PaidMediaPreview(
        @JvmField
        val width: Int,
        @JvmField
        val height: Int,
        @JvmField
        val duration: Int,
        @JvmField
        val minithumbnail: Minithumbnail?,
    ) : PaidMedia() {
        override fun getConstructor(): Int = -1_128_151_948
    }

    class PaidMediaPhoto(
        @JvmField
        val photo: Photo,
    ) : PaidMedia() {
        override fun getConstructor(): Int = -1_165_863_654
    }

    class PaidMediaVideo(
        @JvmField
        val video: Video,
        @JvmField
        val cover: Photo?,
        @JvmField
        val startTimestamp: Int,
    ) : PaidMedia() {
        override fun getConstructor(): Int = 870_838_318
    }

    class PaidMediaUnsupported : PaidMedia() {
        override fun getConstructor(): Int = 112_999_974
    }

    abstract class PaidReactionType : Object()

    class PaidReactionTypeRegular : PaidReactionType() {
        override fun getConstructor(): Int = -1_199_187_333
    }

    class PaidReactionTypeAnonymous : PaidReactionType() {
        override fun getConstructor(): Int = 47_892_621
    }

    class PaidReactionTypeChat(
        @JvmField
        val chatId: Long,
    ) : PaidReactionType() {
        override fun getConstructor(): Int = -675_782_044
    }

    class PaidReactor(
        @JvmField
        val senderId: MessageSender?,
        @JvmField
        val starCount: Int,
        @JvmField
        val isTop: Boolean,
        @JvmField
        val isMe: Boolean,
        @JvmField
        val isAnonymous: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -1_657_303_032
    }

    class PassportAuthorizationForm(
        @JvmField
        val id: Int,
        @JvmField
        val requiredElements: Array<PassportRequiredElement>,
        @JvmField
        val privacyPolicyUrl: String,
    ) : Object() {
        override fun getConstructor(): Int = -1_070_673_218
    }

    abstract class PassportElement : Object()

    class PassportElementPersonalDetails(
        @JvmField
        val personalDetails: PersonalDetails,
    ) : PassportElement() {
        override fun getConstructor(): Int = 1_217_724_035
    }

    class PassportElementPassport(
        @JvmField
        val passport: IdentityDocument,
    ) : PassportElement() {
        override fun getConstructor(): Int = -263_985_373
    }

    class PassportElementDriverLicense(
        @JvmField
        val driverLicense: IdentityDocument,
    ) : PassportElement() {
        override fun getConstructor(): Int = 1_643_580_589
    }

    class PassportElementIdentityCard(
        @JvmField
        val identityCard: IdentityDocument,
    ) : PassportElement() {
        override fun getConstructor(): Int = 2_083_775_797
    }

    class PassportElementInternalPassport(
        @JvmField
        val internalPassport: IdentityDocument,
    ) : PassportElement() {
        override fun getConstructor(): Int = 36_220_295
    }

    class PassportElementAddress(
        @JvmField
        val address: Address,
    ) : PassportElement() {
        override fun getConstructor(): Int = -782_625_232
    }

    class PassportElementUtilityBill(
        @JvmField
        val utilityBill: PersonalDocument,
    ) : PassportElement() {
        override fun getConstructor(): Int = -234_611_246
    }

    class PassportElementBankStatement(
        @JvmField
        val bankStatement: PersonalDocument,
    ) : PassportElement() {
        override fun getConstructor(): Int = -366_464_408
    }

    class PassportElementRentalAgreement(
        @JvmField
        val rentalAgreement: PersonalDocument,
    ) : PassportElement() {
        override fun getConstructor(): Int = -290_141_400
    }

    class PassportElementPassportRegistration(
        @JvmField
        val passportRegistration: PersonalDocument,
    ) : PassportElement() {
        override fun getConstructor(): Int = 618_323_071
    }

    class PassportElementTemporaryRegistration(
        @JvmField
        val temporaryRegistration: PersonalDocument,
    ) : PassportElement() {
        override fun getConstructor(): Int = 1_237_626_864
    }

    class PassportElementPhoneNumber(
        @JvmField
        val phoneNumber: String,
    ) : PassportElement() {
        override fun getConstructor(): Int = -1_320_118_375
    }

    class PassportElementEmailAddress(
        @JvmField
        val emailAddress: String,
    ) : PassportElement() {
        override fun getConstructor(): Int = -1_528_129_531
    }

    class PassportElementError(
        @JvmField
        val type: PassportElementType,
        @JvmField
        val message: String,
        @JvmField
        val source: PassportElementErrorSource,
    ) : Object() {
        override fun getConstructor(): Int = -1_861_902_395
    }

    abstract class PassportElementErrorSource : Object()

    class PassportElementErrorSourceUnspecified : PassportElementErrorSource() {
        override fun getConstructor(): Int = -378_320_830
    }

    class PassportElementErrorSourceDataField(
        @JvmField
        val fieldName: String,
    ) : PassportElementErrorSource() {
        override fun getConstructor(): Int = -308_650_776
    }

    class PassportElementErrorSourceFrontSide : PassportElementErrorSource() {
        override fun getConstructor(): Int = 1_895_658_292
    }

    class PassportElementErrorSourceReverseSide : PassportElementErrorSource() {
        override fun getConstructor(): Int = 1_918_630_391
    }

    class PassportElementErrorSourceSelfie : PassportElementErrorSource() {
        override fun getConstructor(): Int = -797_043_672
    }

    class PassportElementErrorSourceTranslationFile(
        @JvmField
        val fileIndex: Int,
    ) : PassportElementErrorSource() {
        override fun getConstructor(): Int = -689_621_228
    }

    class PassportElementErrorSourceTranslationFiles : PassportElementErrorSource() {
        override fun getConstructor(): Int = 581_280_796
    }

    class PassportElementErrorSourceFile(
        @JvmField
        val fileIndex: Int,
    ) : PassportElementErrorSource() {
        override fun getConstructor(): Int = 2_020_358_960
    }

    class PassportElementErrorSourceFiles : PassportElementErrorSource() {
        override fun getConstructor(): Int = 1_894_164_178
    }

    abstract class PassportElementType : Object()

    class PassportElementTypePersonalDetails : PassportElementType() {
        override fun getConstructor(): Int = -1_032_136_365
    }

    class PassportElementTypePassport : PassportElementType() {
        override fun getConstructor(): Int = -436_360_376
    }

    class PassportElementTypeDriverLicense : PassportElementType() {
        override fun getConstructor(): Int = 1_827_298_379
    }

    class PassportElementTypeIdentityCard : PassportElementType() {
        override fun getConstructor(): Int = -502_356_132
    }

    class PassportElementTypeInternalPassport : PassportElementType() {
        override fun getConstructor(): Int = -793_781_959
    }

    class PassportElementTypeAddress : PassportElementType() {
        override fun getConstructor(): Int = 496_327_874
    }

    class PassportElementTypeUtilityBill : PassportElementType() {
        override fun getConstructor(): Int = 627_084_906
    }

    class PassportElementTypeBankStatement : PassportElementType() {
        override fun getConstructor(): Int = 574_095_667
    }

    class PassportElementTypeRentalAgreement : PassportElementType() {
        override fun getConstructor(): Int = -2_060_583_280
    }

    class PassportElementTypePassportRegistration : PassportElementType() {
        override fun getConstructor(): Int = -159_478_209
    }

    class PassportElementTypeTemporaryRegistration : PassportElementType() {
        override fun getConstructor(): Int = 1_092_498_527
    }

    class PassportElementTypePhoneNumber : PassportElementType() {
        override fun getConstructor(): Int = -995_361_172
    }

    class PassportElementTypeEmailAddress : PassportElementType() {
        override fun getConstructor(): Int = -79_321_405
    }

    class PassportElements(
        @JvmField
        val elements: Array<PassportElement>,
    ) : Object() {
        override fun getConstructor(): Int = 1_264_617_556
    }

    class PassportElementsWithErrors(
        @JvmField
        val elements: Array<PassportElement>,
        @JvmField
        val errors: Array<PassportElementError>,
    ) : Object() {
        override fun getConstructor(): Int = 1_308_923_044
    }

    class PassportRequiredElement(
        @JvmField
        val suitableElements: Array<PassportSuitableElement>,
    ) : Object() {
        override fun getConstructor(): Int = -1_983_641_651
    }

    class PassportSuitableElement(
        @JvmField
        val type: PassportElementType,
        @JvmField
        val isSelfieRequired: Boolean,
        @JvmField
        val isTranslationRequired: Boolean,
        @JvmField
        val isNativeNameRequired: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -789_019_876
    }

    class PasswordState(
        @JvmField
        val hasPassword: Boolean,
        @JvmField
        val passwordHint: String,
        @JvmField
        val hasRecoveryEmailAddress: Boolean,
        @JvmField
        val hasPassportData: Boolean,
        @JvmField
        val recoveryEmailAddressCodeInfo: EmailAddressAuthenticationCodeInfo?,
        @JvmField
        val loginEmailAddressPattern: String,
        @JvmField
        val pendingResetDate: Int,
    ) : Object() {
        override fun getConstructor(): Int = 483_801_128
    }

    class PaymentForm(
        @JvmField
        val id: Long,
        @JvmField
        val type: PaymentFormType,
        @JvmField
        val sellerBotUserId: Long,
        @JvmField
        val productInfo: ProductInfo,
    ) : Object() {
        override fun getConstructor(): Int = 1_998_651_315
    }

    abstract class PaymentFormType : Object()

    class PaymentFormTypeRegular(
        @JvmField
        val invoice: Invoice,
        @JvmField
        val paymentProviderUserId: Long,
        @JvmField
        val paymentProvider: PaymentProvider,
        @JvmField
        val additionalPaymentOptions: Array<PaymentOption>,
        @JvmField
        val savedOrderInfo: OrderInfo?,
        @JvmField
        val savedCredentials: Array<SavedCredentials>,
        @JvmField
        val canSaveCredentials: Boolean,
        @JvmField
        val needPassword: Boolean,
    ) : PaymentFormType() {
        override fun getConstructor(): Int = -615_089_778
    }

    class PaymentFormTypeStars(
        @JvmField
        val starCount: Long,
    ) : PaymentFormType() {
        override fun getConstructor(): Int = 90_938_685
    }

    class PaymentFormTypeStarSubscription(
        @JvmField
        val pricing: StarSubscriptionPricing,
    ) : PaymentFormType() {
        override fun getConstructor(): Int = 271_444_827
    }

    class PaymentOption(
        @JvmField
        val title: String,
        @JvmField
        val url: String,
    ) : Object() {
        override fun getConstructor(): Int = -294_020_965
    }

    abstract class PaymentProvider : Object()

    class PaymentProviderSmartGlocal(
        @JvmField
        val publicToken: String,
        @JvmField
        val tokenizeUrl: String,
    ) : PaymentProvider() {
        override fun getConstructor(): Int = -1_174_112_396
    }

    class PaymentProviderStripe(
        @JvmField
        val publishableKey: String,
        @JvmField
        val needCountry: Boolean,
        @JvmField
        val needPostalCode: Boolean,
        @JvmField
        val needCardholderName: Boolean,
    ) : PaymentProvider() {
        override fun getConstructor(): Int = 370_467_227
    }

    class PaymentProviderOther(
        @JvmField
        val url: String,
    ) : PaymentProvider() {
        override fun getConstructor(): Int = -1_336_876_828
    }

    class PaymentReceipt(
        @JvmField
        val productInfo: ProductInfo,
        @JvmField
        val date: Int,
        @JvmField
        val sellerBotUserId: Long,
        @JvmField
        val type: PaymentReceiptType,
    ) : Object() {
        override fun getConstructor(): Int = 758_199_186
    }

    abstract class PaymentReceiptType : Object()

    class PaymentReceiptTypeRegular(
        @JvmField
        val paymentProviderUserId: Long,
        @JvmField
        val invoice: Invoice,
        @JvmField
        val orderInfo: OrderInfo?,
        @JvmField
        val shippingOption: ShippingOption?,
        @JvmField
        val credentialsTitle: String,
        @JvmField
        val tipAmount: Long,
    ) : PaymentReceiptType() {
        override fun getConstructor(): Int = -1_636_362_826
    }

    class PaymentReceiptTypeStars(
        @JvmField
        val starCount: Long,
        @JvmField
        val transactionId: String,
    ) : PaymentReceiptType() {
        override fun getConstructor(): Int = 294_913_868
    }

    class PaymentResult(
        @JvmField
        val success: Boolean,
        @JvmField
        val verificationUrl: String,
    ) : Object() {
        override fun getConstructor(): Int = -804_263_843
    }

    class PersonalDetails(
        @JvmField
        val firstName: String,
        @JvmField
        val middleName: String,
        @JvmField
        val lastName: String,
        @JvmField
        val nativeFirstName: String,
        @JvmField
        val nativeMiddleName: String,
        @JvmField
        val nativeLastName: String,
        @JvmField
        val birthdate: Date,
        @JvmField
        val gender: String,
        @JvmField
        val countryCode: String,
        @JvmField
        val residenceCountryCode: String,
    ) : Object() {
        override fun getConstructor(): Int = -1_061_656_137
    }

    class PersonalDocument(
        @JvmField
        val files: Array<DatedFile>,
        @JvmField
        val translation: Array<DatedFile>,
    ) : Object() {
        override fun getConstructor(): Int = -1_011_634_661
    }

    class PhoneNumberAuthenticationSettings(
        @JvmField
        val allowFlashCall: Boolean,
        @JvmField
        val allowMissedCall: Boolean,
        @JvmField
        val isCurrentPhoneNumber: Boolean,
        @JvmField
        val hasUnknownPhoneNumber: Boolean,
        @JvmField
        val allowSmsRetrieverApi: Boolean,
        @JvmField
        val firebaseAuthenticationSettings: FirebaseAuthenticationSettings?,
        @JvmField
        val authenticationTokens: Array<String>,
    ) : Object() {
        override fun getConstructor(): Int = 1_881_885_547
    }

    abstract class PhoneNumberCodeType : Object()

    class PhoneNumberCodeTypeChange : PhoneNumberCodeType() {
        override fun getConstructor(): Int = 87_144_986
    }

    class PhoneNumberCodeTypeVerify : PhoneNumberCodeType() {
        override fun getConstructor(): Int = -1_029_402_661
    }

    class PhoneNumberCodeTypeConfirmOwnership(
        @JvmField
        val hash: String,
    ) : PhoneNumberCodeType() {
        override fun getConstructor(): Int = -485_404_696
    }

    class PhoneNumberInfo(
        @JvmField
        val country: CountryInfo?,
        @JvmField
        val countryCallingCode: String,
        @JvmField
        val formattedPhoneNumber: String,
        @JvmField
        val isAnonymous: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -758_933_343
    }

    class Photo(
        @JvmField
        val hasStickers: Boolean,
        @JvmField
        val minithumbnail: Minithumbnail?,
        @JvmField
        val sizes: Array<PhotoSize>,
    ) : Object() {
        override fun getConstructor(): Int = -2_022_871_583
    }

    class PhotoSize(
        @JvmField
        val type: String,
        @JvmField
        val photo: File,
        @JvmField
        val width: Int,
        @JvmField
        val height: Int,
        @JvmField
        val progressiveSizes: IntArray,
    ) : Object() {
        override fun getConstructor(): Int = 1_609_182_352
    }

    class Point(
        @JvmField
        val x: Double,
        @JvmField
        val y: Double,
    ) : Object() {
        override fun getConstructor(): Int = 437_515_705
    }

    class Poll(
        @JvmField
        val id: Long,
        @JvmField
        val question: FormattedText,
        @JvmField
        val options: Array<PollOption>,
        @JvmField
        val totalVoterCount: Int,
        @JvmField
        val recentVoterIds: Array<MessageSender>,
        @JvmField
        val isAnonymous: Boolean,
        @JvmField
        val type: PollType,
        @JvmField
        val openPeriod: Int,
        @JvmField
        val closeDate: Int,
        @JvmField
        val isClosed: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_913_016_502
    }

    class PollOption(
        @JvmField
        val text: FormattedText,
        @JvmField
        val voterCount: Int,
        @JvmField
        val votePercentage: Int,
        @JvmField
        val isChosen: Boolean,
        @JvmField
        val isBeingChosen: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_676_243_088
    }

    abstract class PollType : Object()

    class PollTypeRegular(
        @JvmField
        val allowMultipleAnswers: Boolean,
    ) : PollType() {
        override fun getConstructor(): Int = 641_265_698
    }

    class PollTypeQuiz(
        @JvmField
        val correctOptionId: Int,
        @JvmField
        val explanation: FormattedText,
    ) : PollType() {
        override fun getConstructor(): Int = 657_013_913
    }

    abstract class PremiumFeature : Object()

    class PremiumFeatureIncreasedLimits : PremiumFeature() {
        override fun getConstructor(): Int = 1_785_455_031
    }

    class PremiumFeatureIncreasedUploadFileSize : PremiumFeature() {
        override fun getConstructor(): Int = 1_825_367_155
    }

    class PremiumFeatureImprovedDownloadSpeed : PremiumFeature() {
        override fun getConstructor(): Int = -267_695_554
    }

    class PremiumFeatureVoiceRecognition : PremiumFeature() {
        override fun getConstructor(): Int = 1_288_216_542
    }

    class PremiumFeatureDisabledAds : PremiumFeature() {
        override fun getConstructor(): Int = -2_008_587_702
    }

    class PremiumFeatureUniqueReactions : PremiumFeature() {
        override fun getConstructor(): Int = 766_750_743
    }

    class PremiumFeatureUniqueStickers : PremiumFeature() {
        override fun getConstructor(): Int = -2_101_773_312
    }

    class PremiumFeatureCustomEmoji : PremiumFeature() {
        override fun getConstructor(): Int = 1_332_599_628
    }

    class PremiumFeatureAdvancedChatManagement : PremiumFeature() {
        override fun getConstructor(): Int = 796_347_674
    }

    class PremiumFeatureProfileBadge : PremiumFeature() {
        override fun getConstructor(): Int = 233_648_322
    }

    class PremiumFeatureEmojiStatus : PremiumFeature() {
        override fun getConstructor(): Int = -36_516_639
    }

    class PremiumFeatureAnimatedProfilePhoto : PremiumFeature() {
        override fun getConstructor(): Int = -100_741_914
    }

    class PremiumFeatureForumTopicIcon : PremiumFeature() {
        override fun getConstructor(): Int = -823_172_286
    }

    class PremiumFeatureAppIcons : PremiumFeature() {
        override fun getConstructor(): Int = 1_585_050_761
    }

    class PremiumFeatureRealTimeChatTranslation : PremiumFeature() {
        override fun getConstructor(): Int = -1_143_471_488
    }

    class PremiumFeatureUpgradedStories : PremiumFeature() {
        override fun getConstructor(): Int = -1_878_522_597
    }

    class PremiumFeatureChatBoost : PremiumFeature() {
        override fun getConstructor(): Int = 1_576_574_747
    }

    class PremiumFeatureAccentColor : PremiumFeature() {
        override fun getConstructor(): Int = 907_724_190
    }

    class PremiumFeatureBackgroundForBoth : PremiumFeature() {
        override fun getConstructor(): Int = 575_074_042
    }

    class PremiumFeatureSavedMessagesTags : PremiumFeature() {
        override fun getConstructor(): Int = 1_003_219_334
    }

    class PremiumFeatureMessagePrivacy : PremiumFeature() {
        override fun getConstructor(): Int = 802_322_678
    }

    class PremiumFeatureLastSeenTimes : PremiumFeature() {
        override fun getConstructor(): Int = -762_230_129
    }

    class PremiumFeatureBusiness : PremiumFeature() {
        override fun getConstructor(): Int = -1_503_619_324
    }

    class PremiumFeatureMessageEffects : PremiumFeature() {
        override fun getConstructor(): Int = -723_300_255
    }

    class PremiumFeatureChecklists : PremiumFeature() {
        override fun getConstructor(): Int = -1_128_709_251
    }

    class PremiumFeaturePromotionAnimation(
        @JvmField
        val feature: PremiumFeature,
        @JvmField
        val animation: Animation,
    ) : Object() {
        override fun getConstructor(): Int = -1_986_155_748
    }

    class PremiumFeatures(
        @JvmField
        val features: Array<PremiumFeature>,
        @JvmField
        val limits: Array<PremiumLimit>,
        @JvmField
        val paymentLink: InternalLinkType?,
    ) : Object() {
        override fun getConstructor(): Int = 1_875_162_172
    }

    class PremiumGiftCodeInfo(
        @JvmField
        val creatorId: MessageSender?,
        @JvmField
        val creationDate: Int,
        @JvmField
        val isFromGiveaway: Boolean,
        @JvmField
        val giveawayMessageId: Long,
        @JvmField
        val monthCount: Int,
        @JvmField
        val userId: Long,
        @JvmField
        val useDate: Int,
    ) : Object() {
        override fun getConstructor(): Int = -1_198_544_674
    }

    class PremiumGiftPaymentOption(
        @JvmField
        val currency: String,
        @JvmField
        val amount: Long,
        @JvmField
        val starCount: Long,
        @JvmField
        val discountPercentage: Int,
        @JvmField
        val monthCount: Int,
        @JvmField
        val storeProductId: String,
        @JvmField
        val sticker: Sticker?,
    ) : Object() {
        override fun getConstructor(): Int = -338_085_027
    }

    class PremiumGiftPaymentOptions(
        @JvmField
        val options: Array<PremiumGiftPaymentOption>,
    ) : Object() {
        override fun getConstructor(): Int = -1_347_543_032
    }

    class PremiumGiveawayPaymentOption(
        @JvmField
        val currency: String,
        @JvmField
        val amount: Long,
        @JvmField
        val winnerCount: Int,
        @JvmField
        val monthCount: Int,
        @JvmField
        val storeProductId: String,
        @JvmField
        val storeProductQuantity: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_099_221_896
    }

    class PremiumGiveawayPaymentOptions(
        @JvmField
        val options: Array<PremiumGiveawayPaymentOption>,
    ) : Object() {
        override fun getConstructor(): Int = -1_587_397_823
    }

    class PremiumLimit(
        @JvmField
        val type: PremiumLimitType,
        @JvmField
        val defaultValue: Int,
        @JvmField
        val premiumValue: Int,
    ) : Object() {
        override fun getConstructor(): Int = 2_127_786_726
    }

    abstract class PremiumLimitType : Object()

    class PremiumLimitTypeSupergroupCount : PremiumLimitType() {
        override fun getConstructor(): Int = -247_467_131
    }

    class PremiumLimitTypePinnedChatCount : PremiumLimitType() {
        override fun getConstructor(): Int = -998_947_871
    }

    class PremiumLimitTypeCreatedPublicChatCount : PremiumLimitType() {
        override fun getConstructor(): Int = 446_086_841
    }

    class PremiumLimitTypeSavedAnimationCount : PremiumLimitType() {
        override fun getConstructor(): Int = -19_759_735
    }

    class PremiumLimitTypeFavoriteStickerCount : PremiumLimitType() {
        override fun getConstructor(): Int = 639_754_787
    }

    class PremiumLimitTypeChatFolderCount : PremiumLimitType() {
        override fun getConstructor(): Int = 377_489_774
    }

    class PremiumLimitTypeChatFolderChosenChatCount : PremiumLimitType() {
        override fun getConstructor(): Int = 1_691_435_861
    }

    class PremiumLimitTypePinnedArchivedChatCount : PremiumLimitType() {
        override fun getConstructor(): Int = 1_485_515_276
    }

    class PremiumLimitTypePinnedSavedMessagesTopicCount : PremiumLimitType() {
        override fun getConstructor(): Int = -1_544_854_305
    }

    class PremiumLimitTypeCaptionLength : PremiumLimitType() {
        override fun getConstructor(): Int = 293_984_314
    }

    class PremiumLimitTypeBioLength : PremiumLimitType() {
        override fun getConstructor(): Int = -1_146_976_765
    }

    class PremiumLimitTypeChatFolderInviteLinkCount : PremiumLimitType() {
        override fun getConstructor(): Int = -128_702_950
    }

    class PremiumLimitTypeShareableChatFolderCount : PremiumLimitType() {
        override fun getConstructor(): Int = 1_612_625_095
    }

    class PremiumLimitTypeActiveStoryCount : PremiumLimitType() {
        override fun getConstructor(): Int = -1_926_486_372
    }

    class PremiumLimitTypeWeeklyPostedStoryCount : PremiumLimitType() {
        override fun getConstructor(): Int = -506_354_313
    }

    class PremiumLimitTypeMonthlyPostedStoryCount : PremiumLimitType() {
        override fun getConstructor(): Int = 26_329_490
    }

    class PremiumLimitTypeStoryCaptionLength : PremiumLimitType() {
        override fun getConstructor(): Int = -1_093_324_030
    }

    class PremiumLimitTypeStorySuggestedReactionAreaCount : PremiumLimitType() {
        override fun getConstructor(): Int = -1_170_032_633
    }

    class PremiumLimitTypeSimilarChatCount : PremiumLimitType() {
        override fun getConstructor(): Int = -1_563_549_935
    }

    class PremiumPaymentOption(
        @JvmField
        val currency: String,
        @JvmField
        val amount: Long,
        @JvmField
        val discountPercentage: Int,
        @JvmField
        val monthCount: Int,
        @JvmField
        val storeProductId: String,
        @JvmField
        val paymentLink: InternalLinkType?,
    ) : Object() {
        override fun getConstructor(): Int = -1_945_346_126
    }

    abstract class PremiumSource : Object()

    class PremiumSourceLimitExceeded(
        @JvmField
        val limitType: PremiumLimitType,
    ) : PremiumSource() {
        override fun getConstructor(): Int = -2_052_159_742
    }

    class PremiumSourceFeature(
        @JvmField
        val feature: PremiumFeature,
    ) : PremiumSource() {
        override fun getConstructor(): Int = 445_813_541
    }

    class PremiumSourceBusinessFeature(
        @JvmField
        val feature: BusinessFeature?,
    ) : PremiumSource() {
        override fun getConstructor(): Int = -1_492_946_340
    }

    class PremiumSourceStoryFeature(
        @JvmField
        val feature: PremiumStoryFeature,
    ) : PremiumSource() {
        override fun getConstructor(): Int = -1_030_737_556
    }

    class PremiumSourceLink(
        @JvmField
        val referrer: String,
    ) : PremiumSource() {
        override fun getConstructor(): Int = 2_135_071_132
    }

    class PremiumSourceSettings : PremiumSource() {
        override fun getConstructor(): Int = -285_702_859
    }

    class PremiumState(
        @JvmField
        val state: FormattedText,
        @JvmField
        val paymentOptions: Array<PremiumStatePaymentOption>,
        @JvmField
        val animations: Array<PremiumFeaturePromotionAnimation>,
        @JvmField
        val businessAnimations: Array<BusinessFeaturePromotionAnimation>,
    ) : Object() {
        override fun getConstructor(): Int = 1_772_082_178
    }

    class PremiumStatePaymentOption(
        @JvmField
        val paymentOption: PremiumPaymentOption,
        @JvmField
        val isCurrent: Boolean,
        @JvmField
        val isUpgrade: Boolean,
        @JvmField
        val lastTransactionId: String,
    ) : Object() {
        override fun getConstructor(): Int = 2_097_591_673
    }

    abstract class PremiumStoryFeature : Object()

    class PremiumStoryFeaturePriorityOrder : PremiumStoryFeature() {
        override fun getConstructor(): Int = -1_880_001_849
    }

    class PremiumStoryFeatureStealthMode : PremiumStoryFeature() {
        override fun getConstructor(): Int = 1_194_605_988
    }

    class PremiumStoryFeaturePermanentViewsHistory : PremiumStoryFeature() {
        override fun getConstructor(): Int = -1_029_683_296
    }

    class PremiumStoryFeatureCustomExpirationDuration : PremiumStoryFeature() {
        override fun getConstructor(): Int = -593_229_162
    }

    class PremiumStoryFeatureSaveStories : PremiumStoryFeature() {
        override fun getConstructor(): Int = -1_501_286_467
    }

    class PremiumStoryFeatureLinksAndFormatting : PremiumStoryFeature() {
        override fun getConstructor(): Int = -622_623_753
    }

    class PremiumStoryFeatureVideoQuality : PremiumStoryFeature() {
        override fun getConstructor(): Int = -1_162_887_511
    }

    class PrepaidGiveaway(
        @JvmField
        val id: Long,
        @JvmField
        val winnerCount: Int,
        @JvmField
        val prize: GiveawayPrize,
        @JvmField
        val boostCount: Int,
        @JvmField
        val paymentDate: Int,
    ) : Object() {
        override fun getConstructor(): Int = -277_859_441
    }

    class PreparedInlineMessage(
        @JvmField
        val inlineQueryId: Long,
        @JvmField
        val result: InlineQueryResult,
        @JvmField
        val chatTypes: TargetChatTypes,
    ) : Object() {
        override fun getConstructor(): Int = -1_808_892_734
    }

    class PreparedInlineMessageId(
        @JvmField
        val id: String,
        @JvmField
        val expirationDate: Int,
    ) : Object() {
        override fun getConstructor(): Int = 940_415_972
    }

    class ProductInfo(
        @JvmField
        val title: String,
        @JvmField
        val description: FormattedText,
        @JvmField
        val photo: Photo?,
    ) : Object() {
        override fun getConstructor(): Int = -2_015_069_020
    }

    class ProfileAccentColor(
        @JvmField
        val id: Int,
        @JvmField
        val lightThemeColors: ProfileAccentColors,
        @JvmField
        val darkThemeColors: ProfileAccentColors,
        @JvmField
        val minSupergroupChatBoostLevel: Int,
        @JvmField
        val minChannelChatBoostLevel: Int,
    ) : Object() {
        override fun getConstructor(): Int = 557_679_253
    }

    class ProfileAccentColors(
        @JvmField
        val paletteColors: IntArray,
        @JvmField
        val backgroundColors: IntArray,
        @JvmField
        val storyColors: IntArray,
    ) : Object() {
        override fun getConstructor(): Int = -596_042_431
    }

    class ProfilePhoto(
        @JvmField
        val id: Long,
        @JvmField
        val small: File,
        @JvmField
        val big: File,
        @JvmField
        val minithumbnail: Minithumbnail?,
        @JvmField
        val hasAnimation: Boolean,
        @JvmField
        val isPersonal: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -1_025_754_018
    }

    class Proxies(
        @JvmField
        val proxies: Array<Proxy>,
    ) : Object() {
        override fun getConstructor(): Int = 1_200_447_205
    }

    class Proxy(
        @JvmField
        val id: Int,
        @JvmField
        val server: String,
        @JvmField
        val port: Int,
        @JvmField
        val lastUsedDate: Int,
        @JvmField
        val isEnabled: Boolean,
        @JvmField
        val type: ProxyType,
    ) : Object() {
        override fun getConstructor(): Int = 196_049_779
    }

    abstract class ProxyType : Object()

    class ProxyTypeSocks5(
        @JvmField
        val username: String,
        @JvmField
        val password: String,
    ) : ProxyType() {
        override fun getConstructor(): Int = -890_027_341
    }

    class ProxyTypeHttp(
        @JvmField
        val username: String,
        @JvmField
        val password: String,
        @JvmField
        val httpOnly: Boolean,
    ) : ProxyType() {
        override fun getConstructor(): Int = -1_547_188_361
    }

    class ProxyTypeMtproto(
        @JvmField
        val secret: String,
    ) : ProxyType() {
        override fun getConstructor(): Int = -1_964_826_627
    }

    abstract class PublicChatType : Object()

    class PublicChatTypeHasUsername : PublicChatType() {
        override fun getConstructor(): Int = 350_789_758
    }

    class PublicChatTypeIsLocationBased : PublicChatType() {
        override fun getConstructor(): Int = 1_183_735_952
    }

    abstract class PublicForward : Object()

    class PublicForwardMessage(
        @JvmField
        val message: Message,
    ) : PublicForward() {
        override fun getConstructor(): Int = 51_885_010
    }

    class PublicForwardStory(
        @JvmField
        val story: Story,
    ) : PublicForward() {
        override fun getConstructor(): Int = 2_145_330_863
    }

    class PublicForwards(
        @JvmField
        val totalCount: Int,
        @JvmField
        val forwards: Array<PublicForward>,
        @JvmField
        val nextOffset: String,
    ) : Object() {
        override fun getConstructor(): Int = -2_011_272_719
    }

    abstract class PushMessageContent : Object()

    class PushMessageContentHidden(
        @JvmField
        val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -316_950_436
    }

    class PushMessageContentAnimation(
        @JvmField
        val animation: Animation?,
        @JvmField
        val caption: String,
        @JvmField
        val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = 1_034_215_396
    }

    class PushMessageContentAudio(
        @JvmField
        val audio: Audio?,
        @JvmField
        val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = 381_581_426
    }

    class PushMessageContentContact(
        @JvmField
        val name: String,
        @JvmField
        val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -12_219_820
    }

    class PushMessageContentContactRegistered : PushMessageContent() {
        override fun getConstructor(): Int = -303_962_720
    }

    class PushMessageContentDocument(
        @JvmField
        val document: Document?,
        @JvmField
        val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -458_379_775
    }

    class PushMessageContentGame(
        @JvmField
        val title: String,
        @JvmField
        val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -515_131_109
    }

    class PushMessageContentGameScore(
        @JvmField
        val title: String,
        @JvmField
        val score: Int,
        @JvmField
        val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = 901_303_688
    }

    class PushMessageContentInvoice(
        @JvmField
        val price: String,
        @JvmField
        val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -1_731_687_492
    }

    class PushMessageContentLocation(
        @JvmField
        val isLive: Boolean,
        @JvmField
        val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -1_288_005_709
    }

    class PushMessageContentPaidMedia(
        @JvmField
        val starCount: Long,
        @JvmField
        val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -1_252_595_894
    }

    class PushMessageContentPhoto(
        @JvmField
        val photo: Photo?,
        @JvmField
        val caption: String,
        @JvmField
        val isSecret: Boolean,
        @JvmField
        val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = 140_631_122
    }

    class PushMessageContentPoll(
        @JvmField
        val question: String,
        @JvmField
        val isRegular: Boolean,
        @JvmField
        val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -44_403_654
    }

    class PushMessageContentPremiumGiftCode(
        @JvmField
        val monthCount: Int,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = 413_224_997
    }

    class PushMessageContentGiveaway(
        @JvmField
        val winnerCount: Int,
        @JvmField
        val prize: GiveawayPrize?,
        @JvmField
        val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -700_547_186
    }

    class PushMessageContentGift(
        @JvmField
        val starCount: Long,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -2_069_312_245
    }

    class PushMessageContentUpgradedGift(
        @JvmField
        val isUpgrade: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -1_711_666_466
    }

    class PushMessageContentScreenshotTaken : PushMessageContent() {
        override fun getConstructor(): Int = 214_245_369
    }

    class PushMessageContentSticker(
        @JvmField
        val sticker: Sticker?,
        @JvmField
        val emoji: String,
        @JvmField
        val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = 1_553_513_939
    }

    class PushMessageContentStory(
        @JvmField
        val isMention: Boolean,
        @JvmField
        val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = 599_622_223
    }

    class PushMessageContentText(
        @JvmField
        val text: String,
        @JvmField
        val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = 274_587_305
    }

    class PushMessageContentChecklist(
        @JvmField
        val title: String,
        @JvmField
        val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = 212_274_252
    }

    class PushMessageContentVideo(
        @JvmField
        val video: Video?,
        @JvmField
        val caption: String,
        @JvmField
        val isSecret: Boolean,
        @JvmField
        val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = 310_038_831
    }

    class PushMessageContentVideoNote(
        @JvmField
        val videoNote: VideoNote?,
        @JvmField
        val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -1_122_764_417
    }

    class PushMessageContentVoiceNote(
        @JvmField
        val voiceNote: VoiceNote?,
        @JvmField
        val isPinned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = 88_910_987
    }

    class PushMessageContentBasicGroupChatCreate : PushMessageContent() {
        override fun getConstructor(): Int = -2_114_855_172
    }

    class PushMessageContentVideoChatStarted : PushMessageContent() {
        override fun getConstructor(): Int = -566_547_393
    }

    class PushMessageContentVideoChatEnded : PushMessageContent() {
        override fun getConstructor(): Int = -1_250_265_885
    }

    class PushMessageContentInviteVideoChatParticipants(
        @JvmField
        val isCurrentUser: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = 517_620_365
    }

    class PushMessageContentChatAddMembers(
        @JvmField
        val memberName: String,
        @JvmField
        val isCurrentUser: Boolean,
        @JvmField
        val isReturned: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -1_087_145_158
    }

    class PushMessageContentChatChangePhoto : PushMessageContent() {
        override fun getConstructor(): Int = -1_114_222_051
    }

    class PushMessageContentChatChangeTitle(
        @JvmField
        val title: String,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -1_964_902_749
    }

    class PushMessageContentChatSetBackground(
        @JvmField
        val isSame: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -1_490_331_933
    }

    class PushMessageContentChatSetTheme(
        @JvmField
        val themeName: String,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = 173_882_216
    }

    class PushMessageContentChatDeleteMember(
        @JvmField
        val memberName: String,
        @JvmField
        val isCurrentUser: Boolean,
        @JvmField
        val isLeft: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = 598_714_783
    }

    class PushMessageContentChatJoinByLink : PushMessageContent() {
        override fun getConstructor(): Int = 1_553_719_113
    }

    class PushMessageContentChatJoinByRequest : PushMessageContent() {
        override fun getConstructor(): Int = -205_823_627
    }

    class PushMessageContentRecurringPayment(
        @JvmField
        val amount: String,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = 1_619_211_802
    }

    class PushMessageContentSuggestProfilePhoto : PushMessageContent() {
        override fun getConstructor(): Int = 2_104_225_963
    }

    class PushMessageContentProximityAlertTriggered(
        @JvmField
        val distance: Int,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -264_601_594
    }

    class PushMessageContentChecklistTasksAdded(
        @JvmField
        val taskCount: Int,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -2_141_595_022
    }

    class PushMessageContentChecklistTasksDone(
        @JvmField
        val taskCount: Int,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = 1_187_614_554
    }

    class PushMessageContentMessageForwards(
        @JvmField
        val totalCount: Int,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -1_913_083_876
    }

    class PushMessageContentMediaAlbum(
        @JvmField
        val totalCount: Int,
        @JvmField
        val hasPhotos: Boolean,
        @JvmField
        val hasVideos: Boolean,
        @JvmField
        val hasAudios: Boolean,
        @JvmField
        val hasDocuments: Boolean,
    ) : PushMessageContent() {
        override fun getConstructor(): Int = -748_426_897
    }

    class PushReceiverId(
        @JvmField
        val id: Long,
    ) : Object() {
        override fun getConstructor(): Int = 371_056_428
    }

    class QuickReplyMessage(
        @JvmField
        val id: Long,
        @JvmField
        val sendingState: MessageSendingState?,
        @JvmField
        val canBeEdited: Boolean,
        @JvmField
        val replyToMessageId: Long,
        @JvmField
        val viaBotUserId: Long,
        @JvmField
        val mediaAlbumId: Long,
        @JvmField
        val content: MessageContent,
        @JvmField
        val replyMarkup: ReplyMarkup?,
    ) : Object() {
        override fun getConstructor(): Int = -1_090_965_757
    }

    class QuickReplyMessages(
        @JvmField
        val messages: Array<QuickReplyMessage>?,
    ) : Object() {
        override fun getConstructor(): Int = 743_214_375
    }

    class QuickReplyShortcut(
        @JvmField
        val id: Int,
        @JvmField
        val name: String,
        @JvmField
        val firstMessage: QuickReplyMessage,
        @JvmField
        val messageCount: Int,
    ) : Object() {
        override fun getConstructor(): Int = -1_107_453_291
    }

    class ReactionNotificationSettings(
        @JvmField
        val messageReactionSource: ReactionNotificationSource,
        @JvmField
        val storyReactionSource: ReactionNotificationSource,
        @JvmField
        val soundId: Long,
        @JvmField
        val showPreview: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 733_017_684
    }

    abstract class ReactionNotificationSource : Object()

    class ReactionNotificationSourceNone : ReactionNotificationSource() {
        override fun getConstructor(): Int = 366_374_940
    }

    class ReactionNotificationSourceContacts : ReactionNotificationSource() {
        override fun getConstructor(): Int = 555_501_621
    }

    class ReactionNotificationSourceAll : ReactionNotificationSource() {
        override fun getConstructor(): Int = 1_241_689_234
    }

    abstract class ReactionType : Object()

    class ReactionTypeEmoji(
        @JvmField
        val emoji: String,
    ) : ReactionType() {
        override fun getConstructor(): Int = -1_942_084_920
    }

    class ReactionTypeCustomEmoji(
        @JvmField
        val customEmojiId: Long,
    ) : ReactionType() {
        override fun getConstructor(): Int = -989_117_709
    }

    class ReactionTypePaid : ReactionType() {
        override fun getConstructor(): Int = 436_294_381
    }

    abstract class ReactionUnavailabilityReason : Object()

    class ReactionUnavailabilityReasonAnonymousAdministrator : ReactionUnavailabilityReason() {
        override fun getConstructor(): Int = -499_612_677
    }

    class ReactionUnavailabilityReasonGuest : ReactionUnavailabilityReason() {
        override fun getConstructor(): Int = 1_357_861_444
    }

    class ReadDatePrivacySettings(
        @JvmField
        val showReadDate: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_654_842_920
    }

    class ReceivedGift(
        @JvmField
        val receivedGiftId: String,
        @JvmField
        val senderId: MessageSender?,
        @JvmField
        val text: FormattedText,
        @JvmField
        val isPrivate: Boolean,
        @JvmField
        val isSaved: Boolean,
        @JvmField
        val isPinned: Boolean,
        @JvmField
        val canBeUpgraded: Boolean,
        @JvmField
        val canBeTransferred: Boolean,
        @JvmField
        val wasRefunded: Boolean,
        @JvmField
        val date: Int,
        @JvmField
        val gift: SentGift,
        @JvmField
        val sellStarCount: Long,
        @JvmField
        val prepaidUpgradeStarCount: Long,
        @JvmField
        val transferStarCount: Long,
        @JvmField
        val nextTransferDate: Int,
        @JvmField
        val nextResaleDate: Int,
        @JvmField
        val exportDate: Int,
    ) : Object() {
        override fun getConstructor(): Int = 61_550_296
    }

    class ReceivedGifts(
        @JvmField
        val totalCount: Int,
        @JvmField
        val gifts: Array<ReceivedGift>,
        @JvmField
        val areNotificationsEnabled: Boolean,
        @JvmField
        val nextOffset: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_237_114_400
    }

    class RecommendedChatFolder(
        @JvmField
        val folder: ChatFolder,
        @JvmField
        val description: String,
    ) : Object() {
        override fun getConstructor(): Int = -2_116_569_930
    }

    class RecommendedChatFolders(
        @JvmField
        val chatFolders: Array<RecommendedChatFolder>,
    ) : Object() {
        override fun getConstructor(): Int = -739_217_656
    }

    class RecoveryEmailAddress(
        @JvmField
        val recoveryEmailAddress: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_290_526_187
    }

    class RemoteFile(
        @JvmField
        val id: String,
        @JvmField
        val uniqueId: String,
        @JvmField
        val isUploadingActive: Boolean,
        @JvmField
        val isUploadingCompleted: Boolean,
        @JvmField
        val uploadedSize: Long,
    ) : Object() {
        override fun getConstructor(): Int = 747_731_030
    }

    abstract class ReplyMarkup : Object()

    class ReplyMarkupRemoveKeyboard(
        @JvmField
        val isPersonal: Boolean,
    ) : ReplyMarkup() {
        override fun getConstructor(): Int = -691_252_879
    }

    class ReplyMarkupForceReply(
        @JvmField
        val isPersonal: Boolean,
        @JvmField
        val inputFieldPlaceholder: String,
    ) : ReplyMarkup() {
        override fun getConstructor(): Int = 1_101_461_919
    }

    class ReplyMarkupShowKeyboard(
        @JvmField
        val rows: Array<Array<KeyboardButton>>,
        @JvmField
        val isPersistent: Boolean,
        @JvmField
        val resizeKeyboard: Boolean,
        @JvmField
        val oneTime: Boolean,
        @JvmField
        val isPersonal: Boolean,
        @JvmField
        val inputFieldPlaceholder: String,
    ) : ReplyMarkup() {
        override fun getConstructor(): Int = -791_495_984
    }

    class ReplyMarkupInlineKeyboard(
        @JvmField
        val rows: Array<Array<InlineKeyboardButton>>,
    ) : ReplyMarkup() {
        override fun getConstructor(): Int = -619_317_658
    }

    abstract class ReportChatResult : Object()

    class ReportChatResultOk : ReportChatResult() {
        override fun getConstructor(): Int = 1_209_685_373
    }

    class ReportChatResultOptionRequired(
        @JvmField
        val title: String,
        @JvmField
        val options: Array<ReportOption>,
    ) : ReportChatResult() {
        override fun getConstructor(): Int = -881_375_669
    }

    class ReportChatResultTextRequired(
        @JvmField
        val optionId: ByteArray,
        @JvmField
        val isOptional: Boolean,
    ) : ReportChatResult() {
        override fun getConstructor(): Int = -1_949_552_447
    }

    class ReportChatResultMessagesRequired : ReportChatResult() {
        override fun getConstructor(): Int = 106_043_280
    }

    class ReportOption(
        @JvmField
        val id: ByteArray,
        @JvmField
        val text: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_106_390_048
    }

    abstract class ReportReason : Object()

    class ReportReasonSpam : ReportReason() {
        override fun getConstructor(): Int = -1_207_032_897
    }

    class ReportReasonViolence : ReportReason() {
        override fun getConstructor(): Int = 2_038_679_353
    }

    class ReportReasonPornography : ReportReason() {
        override fun getConstructor(): Int = 1_306_467_575
    }

    class ReportReasonChildAbuse : ReportReason() {
        override fun getConstructor(): Int = 761_086_718
    }

    class ReportReasonCopyright : ReportReason() {
        override fun getConstructor(): Int = 1_474_441_135
    }

    class ReportReasonUnrelatedLocation : ReportReason() {
        override fun getConstructor(): Int = 87_562_288
    }

    class ReportReasonFake : ReportReason() {
        override fun getConstructor(): Int = 352_862_176
    }

    class ReportReasonIllegalDrugs : ReportReason() {
        override fun getConstructor(): Int = -61_599_200
    }

    class ReportReasonPersonalDetails : ReportReason() {
        override fun getConstructor(): Int = -1_588_882_414
    }

    class ReportReasonCustom : ReportReason() {
        override fun getConstructor(): Int = -1_380_459_917
    }

    abstract class ReportSponsoredResult : Object()

    class ReportSponsoredResultOk : ReportSponsoredResult() {
        override fun getConstructor(): Int = -128_473_456
    }

    class ReportSponsoredResultFailed : ReportSponsoredResult() {
        override fun getConstructor(): Int = 1_231_714_278
    }

    class ReportSponsoredResultOptionRequired(
        @JvmField
        val title: String,
        @JvmField
        val options: Array<ReportOption>,
    ) : ReportSponsoredResult() {
        override fun getConstructor(): Int = -1_646_687_318
    }

    class ReportSponsoredResultAdsHidden : ReportSponsoredResult() {
        override fun getConstructor(): Int = -372_279_531
    }

    class ReportSponsoredResultPremiumRequired : ReportSponsoredResult() {
        override fun getConstructor(): Int = -55_411_887
    }

    abstract class ReportStoryResult : Object()

    class ReportStoryResultOk : ReportStoryResult() {
        override fun getConstructor(): Int = -1_405_328_461
    }

    class ReportStoryResultOptionRequired(
        @JvmField
        val title: String,
        @JvmField
        val options: Array<ReportOption>,
    ) : ReportStoryResult() {
        override fun getConstructor(): Int = 1_632_974_839
    }

    class ReportStoryResultTextRequired(
        @JvmField
        val optionId: ByteArray,
        @JvmField
        val isOptional: Boolean,
    ) : ReportStoryResult() {
        override fun getConstructor(): Int = 334_339_473
    }

    abstract class ResendCodeReason : Object()

    class ResendCodeReasonUserRequest : ResendCodeReason() {
        override fun getConstructor(): Int = -441_923_456
    }

    class ResendCodeReasonVerificationFailed(
        @JvmField
        val errorMessage: String,
    ) : ResendCodeReason() {
        override fun getConstructor(): Int = 529_870_273
    }

    abstract class ResetPasswordResult : Object()

    class ResetPasswordResultOk : ResetPasswordResult() {
        override fun getConstructor(): Int = -1_397_267_463
    }

    class ResetPasswordResultPending(
        @JvmField
        val pendingResetDate: Int,
    ) : ResetPasswordResult() {
        override fun getConstructor(): Int = 1_193_925_721
    }

    class ResetPasswordResultDeclined(
        @JvmField
        val retryDate: Int,
    ) : ResetPasswordResult() {
        override fun getConstructor(): Int = -1_202_200_373
    }

    abstract class RevenueWithdrawalState : Object()

    class RevenueWithdrawalStatePending : RevenueWithdrawalState() {
        override fun getConstructor(): Int = 1_563_512_741
    }

    class RevenueWithdrawalStateSucceeded(
        @JvmField
        val date: Int,
        @JvmField
        val url: String,
    ) : RevenueWithdrawalState() {
        override fun getConstructor(): Int = 265_375_242
    }

    class RevenueWithdrawalStateFailed : RevenueWithdrawalState() {
        override fun getConstructor(): Int = -12_504_951
    }

    abstract class RichText : Object()

    class RichTextPlain(
        @JvmField
        val text: String,
    ) : RichText() {
        override fun getConstructor(): Int = 482_617_702
    }

    class RichTextBold(
        @JvmField
        val text: RichText,
    ) : RichText() {
        override fun getConstructor(): Int = 1_670_844_268
    }

    class RichTextItalic(
        @JvmField
        val text: RichText,
    ) : RichText() {
        override fun getConstructor(): Int = 1_853_354_047
    }

    class RichTextUnderline(
        @JvmField
        val text: RichText,
    ) : RichText() {
        override fun getConstructor(): Int = -536_019_572
    }

    class RichTextStrikethrough(
        @JvmField
        val text: RichText,
    ) : RichText() {
        override fun getConstructor(): Int = 723_413_585
    }

    class RichTextFixed(
        @JvmField
        val text: RichText,
    ) : RichText() {
        override fun getConstructor(): Int = -1_271_496_249
    }

    class RichTextUrl(
        @JvmField
        val text: RichText,
        @JvmField
        val url: String,
        @JvmField
        val isCached: Boolean,
    ) : RichText() {
        override fun getConstructor(): Int = 83_939_092
    }

    class RichTextEmailAddress(
        @JvmField
        val text: RichText,
        @JvmField
        val emailAddress: String,
    ) : RichText() {
        override fun getConstructor(): Int = 40_018_679
    }

    class RichTextSubscript(
        @JvmField
        val text: RichText,
    ) : RichText() {
        override fun getConstructor(): Int = -868_197_812
    }

    class RichTextSuperscript(
        @JvmField
        val text: RichText,
    ) : RichText() {
        override fun getConstructor(): Int = -382_241_437
    }

    class RichTextMarked(
        @JvmField
        val text: RichText,
    ) : RichText() {
        override fun getConstructor(): Int = -1_271_999_614
    }

    class RichTextPhoneNumber(
        @JvmField
        val text: RichText,
        @JvmField
        val phoneNumber: String,
    ) : RichText() {
        override fun getConstructor(): Int = 128_521_539
    }

    class RichTextIcon(
        @JvmField
        val document: Document,
        @JvmField
        val width: Int,
        @JvmField
        val height: Int,
    ) : RichText() {
        override fun getConstructor(): Int = -1_480_316_158
    }

    class RichTextReference(
        @JvmField
        val text: RichText,
        @JvmField
        val anchorName: String,
        @JvmField
        val url: String,
    ) : RichText() {
        override fun getConstructor(): Int = -1_147_530_634
    }

    class RichTextAnchor(
        @JvmField
        val name: String,
    ) : RichText() {
        override fun getConstructor(): Int = 1_316_950_068
    }

    class RichTextAnchorLink(
        @JvmField
        val text: RichText,
        @JvmField
        val anchorName: String,
        @JvmField
        val url: String,
    ) : RichText() {
        override fun getConstructor(): Int = -1_541_418_282
    }

    class RichTexts(
        @JvmField
        val texts: Array<RichText>,
    ) : RichText() {
        override fun getConstructor(): Int = 1_647_457_821
    }

    class RtmpUrl(
        @JvmField
        val url: String,
        @JvmField
        val streamKey: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_009_302_613
    }

    class SavedCredentials(
        @JvmField
        val id: String,
        @JvmField
        val title: String,
    ) : Object() {
        override fun getConstructor(): Int = -370_273_060
    }

    class SavedMessagesTag(
        @JvmField
        val tag: ReactionType,
        @JvmField
        val label: String,
        @JvmField
        val count: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_785_183_329
    }

    class SavedMessagesTags(
        @JvmField
        val tags: Array<SavedMessagesTag>,
    ) : Object() {
        override fun getConstructor(): Int = -1_749_291_430
    }

    class SavedMessagesTopic(
        @JvmField
        val id: Long,
        @JvmField
        val type: SavedMessagesTopicType,
        @JvmField
        val isPinned: Boolean,
        @JvmField
        val order: Long,
        @JvmField
        val lastMessage: Message?,
        @JvmField
        val draftMessage: DraftMessage?,
    ) : Object() {
        override fun getConstructor(): Int = -760_684_124
    }

    abstract class SavedMessagesTopicType : Object()

    class SavedMessagesTopicTypeMyNotes : SavedMessagesTopicType() {
        override fun getConstructor(): Int = -1_282_784_779
    }

    class SavedMessagesTopicTypeAuthorHidden : SavedMessagesTopicType() {
        override fun getConstructor(): Int = 1_882_997_141
    }

    class SavedMessagesTopicTypeSavedFromChat(
        @JvmField
        val chatId: Long,
    ) : SavedMessagesTopicType() {
        override fun getConstructor(): Int = -1_723_880_104
    }

    class ScopeAutosaveSettings(
        @JvmField
        val autosavePhotos: Boolean,
        @JvmField
        val autosaveVideos: Boolean,
        @JvmField
        val maxVideoFileSize: Long,
    ) : Object() {
        override fun getConstructor(): Int = 1_546_821_427
    }

    class ScopeNotificationSettings(
        @JvmField
        val muteFor: Int,
        @JvmField
        val soundId: Long,
        @JvmField
        val showPreview: Boolean,
        @JvmField
        val useDefaultMuteStories: Boolean,
        @JvmField
        val muteStories: Boolean,
        @JvmField
        val storySoundId: Long,
        @JvmField
        val showStoryPoster: Boolean,
        @JvmField
        val disablePinnedMessageNotifications: Boolean,
        @JvmField
        val disableMentionNotifications: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 88_369_150
    }

    abstract class SearchMessagesChatTypeFilter : Object()

    class SearchMessagesChatTypeFilterPrivate : SearchMessagesChatTypeFilter() {
        override fun getConstructor(): Int = 1_169_248_975
    }

    class SearchMessagesChatTypeFilterGroup : SearchMessagesChatTypeFilter() {
        override fun getConstructor(): Int = -2_059_426_022
    }

    class SearchMessagesChatTypeFilterChannel : SearchMessagesChatTypeFilter() {
        override fun getConstructor(): Int = -773_540_139
    }

    abstract class SearchMessagesFilter : Object()

    class SearchMessagesFilterEmpty : SearchMessagesFilter() {
        override fun getConstructor(): Int = -869_395_657
    }

    class SearchMessagesFilterAnimation : SearchMessagesFilter() {
        override fun getConstructor(): Int = -155_713_339
    }

    class SearchMessagesFilterAudio : SearchMessagesFilter() {
        override fun getConstructor(): Int = 867_505_275
    }

    class SearchMessagesFilterDocument : SearchMessagesFilter() {
        override fun getConstructor(): Int = 1_526_331_215
    }

    class SearchMessagesFilterPhoto : SearchMessagesFilter() {
        override fun getConstructor(): Int = 925_932_293
    }

    class SearchMessagesFilterVideo : SearchMessagesFilter() {
        override fun getConstructor(): Int = 115_538_222
    }

    class SearchMessagesFilterVoiceNote : SearchMessagesFilter() {
        override fun getConstructor(): Int = 1_841_439_357
    }

    class SearchMessagesFilterPhotoAndVideo : SearchMessagesFilter() {
        override fun getConstructor(): Int = 1_352_130_963
    }

    class SearchMessagesFilterUrl : SearchMessagesFilter() {
        override fun getConstructor(): Int = -1_828_724_341
    }

    class SearchMessagesFilterChatPhoto : SearchMessagesFilter() {
        override fun getConstructor(): Int = -1_247_751_329
    }

    class SearchMessagesFilterVideoNote : SearchMessagesFilter() {
        override fun getConstructor(): Int = 564_323_321
    }

    class SearchMessagesFilterVoiceAndVideoNote : SearchMessagesFilter() {
        override fun getConstructor(): Int = 664_174_819
    }

    class SearchMessagesFilterMention : SearchMessagesFilter() {
        override fun getConstructor(): Int = 2_001_258_652
    }

    class SearchMessagesFilterUnreadMention : SearchMessagesFilter() {
        override fun getConstructor(): Int = -95_769_149
    }

    class SearchMessagesFilterUnreadReaction : SearchMessagesFilter() {
        override fun getConstructor(): Int = -1_379_651_328
    }

    class SearchMessagesFilterFailedToSend : SearchMessagesFilter() {
        override fun getConstructor(): Int = -596_322_564
    }

    class SearchMessagesFilterPinned : SearchMessagesFilter() {
        override fun getConstructor(): Int = 371_805_512
    }

    class Seconds(
        @JvmField
        val seconds: Double,
    ) : Object() {
        override fun getConstructor(): Int = 959_899_022
    }

    class SecretChat(
        @JvmField
        val id: Int,
        @JvmField
        val userId: Long,
        @JvmField
        val state: SecretChatState,
        @JvmField
        val isOutbound: Boolean,
        @JvmField
        val keyHash: ByteArray,
        @JvmField
        val layer: Int,
    ) : Object() {
        override fun getConstructor(): Int = -676_918_325
    }

    abstract class SecretChatState : Object()

    class SecretChatStatePending : SecretChatState() {
        override fun getConstructor(): Int = -1_637_050_756
    }

    class SecretChatStateReady : SecretChatState() {
        override fun getConstructor(): Int = -1_611_352_087
    }

    class SecretChatStateClosed : SecretChatState() {
        override fun getConstructor(): Int = -1_945_106_707
    }

    abstract class SentGift : Object()

    class SentGiftRegular(
        @JvmField
        val gift: Gift,
    ) : SentGift() {
        override fun getConstructor(): Int = 594_062_617
    }

    class SentGiftUpgraded(
        @JvmField
        val gift: UpgradedGift,
    ) : SentGift() {
        override fun getConstructor(): Int = 627_524_736
    }

    class SentWebAppMessage(
        @JvmField
        val inlineMessageId: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_243_934_400
    }

    class Session(
        @JvmField
        val id: Long,
        @JvmField
        val isCurrent: Boolean,
        @JvmField
        val isPasswordPending: Boolean,
        @JvmField
        val isUnconfirmed: Boolean,
        @JvmField
        val canAcceptSecretChats: Boolean,
        @JvmField
        val canAcceptCalls: Boolean,
        @JvmField
        val type: SessionType,
        @JvmField
        val apiId: Int,
        @JvmField
        val applicationName: String,
        @JvmField
        val applicationVersion: String,
        @JvmField
        val isOfficialApplication: Boolean,
        @JvmField
        val deviceModel: String,
        @JvmField
        val platform: String,
        @JvmField
        val systemVersion: String,
        @JvmField
        val logInDate: Int,
        @JvmField
        val lastActiveDate: Int,
        @JvmField
        val ipAddress: String,
        @JvmField
        val location: String,
    ) : Object() {
        override fun getConstructor(): Int = 158_702_140
    }

    abstract class SessionType : Object()

    class SessionTypeAndroid : SessionType() {
        override fun getConstructor(): Int = -2_071_764_840
    }

    class SessionTypeApple : SessionType() {
        override fun getConstructor(): Int = -1_818_635_701
    }

    class SessionTypeBrave : SessionType() {
        override fun getConstructor(): Int = -1_216_812_563
    }

    class SessionTypeChrome : SessionType() {
        override fun getConstructor(): Int = 1_573_464_425
    }

    class SessionTypeEdge : SessionType() {
        override fun getConstructor(): Int = -538_916_005
    }

    class SessionTypeFirefox : SessionType() {
        override fun getConstructor(): Int = 2_122_579_364
    }

    class SessionTypeIpad : SessionType() {
        override fun getConstructor(): Int = 1_294_647_023
    }

    class SessionTypeIphone : SessionType() {
        override fun getConstructor(): Int = 97_616_573
    }

    class SessionTypeLinux : SessionType() {
        override fun getConstructor(): Int = -1_487_422_871
    }

    class SessionTypeMac : SessionType() {
        override fun getConstructor(): Int = -612_250_975
    }

    class SessionTypeOpera : SessionType() {
        override fun getConstructor(): Int = -1_463_673_734
    }

    class SessionTypeSafari : SessionType() {
        override fun getConstructor(): Int = 710_646_873
    }

    class SessionTypeUbuntu : SessionType() {
        override fun getConstructor(): Int = 1_569_680_069
    }

    class SessionTypeUnknown : SessionType() {
        override fun getConstructor(): Int = 233_926_704
    }

    class SessionTypeVivaldi : SessionType() {
        override fun getConstructor(): Int = 1_120_503_279
    }

    class SessionTypeWindows : SessionType() {
        override fun getConstructor(): Int = -1_676_512_600
    }

    class SessionTypeXbox : SessionType() {
        override fun getConstructor(): Int = 1_856_216_492
    }

    class Sessions(
        @JvmField
        val sessions: Array<Session>,
        @JvmField
        val inactiveSessionTtlDays: Int,
    ) : Object() {
        override fun getConstructor(): Int = 842_912_274
    }

    class SharedChat(
        @JvmField
        val chatId: Long,
        @JvmField
        val title: String,
        @JvmField
        val username: String,
        @JvmField
        val photo: Photo?,
    ) : Object() {
        override fun getConstructor(): Int = 1_250_406_426
    }

    class SharedUser(
        @JvmField
        val userId: Long,
        @JvmField
        val firstName: String,
        @JvmField
        val lastName: String,
        @JvmField
        val username: String,
        @JvmField
        val photo: Photo?,
    ) : Object() {
        override fun getConstructor(): Int = 293_020_919
    }

    class ShippingOption(
        @JvmField
        val id: String,
        @JvmField
        val title: String,
        @JvmField
        val priceParts: Array<LabeledPricePart>,
    ) : Object() {
        override fun getConstructor(): Int = 1_425_690_001
    }

    abstract class SpeechRecognitionResult : Object()

    class SpeechRecognitionResultPending(
        @JvmField
        val partialText: String,
    ) : SpeechRecognitionResult() {
        override fun getConstructor(): Int = -1_631_810_048
    }

    class SpeechRecognitionResultText(
        @JvmField
        val text: String,
    ) : SpeechRecognitionResult() {
        override fun getConstructor(): Int = -2_132_377_123
    }

    class SpeechRecognitionResultError(
        @JvmField
        val error: Error,
    ) : SpeechRecognitionResult() {
        override fun getConstructor(): Int = 164_774_908
    }

    class SponsoredChat(
        @JvmField
        val uniqueId: Long,
        @JvmField
        val chatId: Long,
        @JvmField
        val sponsorInfo: String,
        @JvmField
        val additionalInfo: String,
    ) : Object() {
        override fun getConstructor(): Int = -325_763_489
    }

    class SponsoredChats(
        @JvmField
        val chats: Array<SponsoredChat>,
    ) : Object() {
        override fun getConstructor(): Int = 536_300_641
    }

    class SponsoredMessage(
        @JvmField
        val messageId: Long,
        @JvmField
        val isRecommended: Boolean,
        @JvmField
        val canBeReported: Boolean,
        @JvmField
        val content: MessageContent,
        @JvmField
        val sponsor: AdvertisementSponsor,
        @JvmField
        val title: String,
        @JvmField
        val buttonText: String,
        @JvmField
        val accentColorId: Int,
        @JvmField
        val backgroundCustomEmojiId: Long,
        @JvmField
        val additionalInfo: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_521_782_216
    }

    class SponsoredMessages(
        @JvmField
        val messages: Array<SponsoredMessage>,
        @JvmField
        val messagesBetween: Int,
    ) : Object() {
        override fun getConstructor(): Int = -537_674_389
    }

    class StarAmount(
        @JvmField
        val starCount: Long,
        @JvmField
        val nanostarCount: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_863_216_512
    }

    class StarCount(
        @JvmField
        val starCount: Long,
    ) : Object() {
        override fun getConstructor(): Int = -1_566_395_144
    }

    class StarGiveawayPaymentOption(
        @JvmField
        val currency: String,
        @JvmField
        val amount: Long,
        @JvmField
        val starCount: Long,
        @JvmField
        val storeProductId: String,
        @JvmField
        val yearlyBoostCount: Int,
        @JvmField
        val winnerOptions: Array<StarGiveawayWinnerOption>,
        @JvmField
        val isDefault: Boolean,
        @JvmField
        val isAdditional: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 565_089_625
    }

    class StarGiveawayPaymentOptions(
        @JvmField
        val options: Array<StarGiveawayPaymentOption>,
    ) : Object() {
        override fun getConstructor(): Int = -1_216_716_679
    }

    class StarGiveawayWinnerOption(
        @JvmField
        val winnerCount: Int,
        @JvmField
        val wonStarCount: Long,
        @JvmField
        val isDefault: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -865_888_761
    }

    class StarPaymentOption(
        @JvmField
        val currency: String,
        @JvmField
        val amount: Long,
        @JvmField
        val starCount: Long,
        @JvmField
        val storeProductId: String,
        @JvmField
        val isAdditional: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -1_364_056_047
    }

    class StarPaymentOptions(
        @JvmField
        val options: Array<StarPaymentOption>,
    ) : Object() {
        override fun getConstructor(): Int = -423_720_498
    }

    class StarRevenueStatistics(
        @JvmField
        val revenueByDayGraph: StatisticalGraph,
        @JvmField
        val status: StarRevenueStatus,
        @JvmField
        val usdRate: Double,
    ) : Object() {
        override fun getConstructor(): Int = -1_121_086_889
    }

    class StarRevenueStatus(
        @JvmField
        val totalAmount: StarAmount,
        @JvmField
        val currentAmount: StarAmount,
        @JvmField
        val availableAmount: StarAmount,
        @JvmField
        val withdrawalEnabled: Boolean,
        @JvmField
        val nextWithdrawalIn: Int,
    ) : Object() {
        override fun getConstructor(): Int = 2_006_266_600
    }

    class StarSubscription(
        @JvmField
        val id: String,
        @JvmField
        val chatId: Long,
        @JvmField
        val expirationDate: Int,
        @JvmField
        val isCanceled: Boolean,
        @JvmField
        val isExpiring: Boolean,
        @JvmField
        val pricing: StarSubscriptionPricing,
        @JvmField
        val type: StarSubscriptionType,
    ) : Object() {
        override fun getConstructor(): Int = 976_753_141
    }

    class StarSubscriptionPricing(
        @JvmField
        val period: Int,
        @JvmField
        val starCount: Long,
    ) : Object() {
        override fun getConstructor(): Int = -1_767_733_162
    }

    abstract class StarSubscriptionType : Object()

    class StarSubscriptionTypeChannel(
        @JvmField
        val canReuse: Boolean,
        @JvmField
        val inviteLink: String,
    ) : StarSubscriptionType() {
        override fun getConstructor(): Int = -1_030_048_011
    }

    class StarSubscriptionTypeBot(
        @JvmField
        val isCanceledByBot: Boolean,
        @JvmField
        val title: String,
        @JvmField
        val photo: Photo,
        @JvmField
        val invoiceLink: String,
    ) : StarSubscriptionType() {
        override fun getConstructor(): Int = 226_024_914
    }

    class StarSubscriptions(
        @JvmField
        val starAmount: StarAmount,
        @JvmField
        val subscriptions: Array<StarSubscription>,
        @JvmField
        val requiredStarCount: Long,
        @JvmField
        val nextOffset: String,
    ) : Object() {
        override fun getConstructor(): Int = 151_169_395
    }

    class StarTransaction(
        @JvmField
        val id: String,
        @JvmField
        val starAmount: StarAmount,
        @JvmField
        val isRefund: Boolean,
        @JvmField
        val date: Int,
        @JvmField
        val type: StarTransactionType,
    ) : Object() {
        override fun getConstructor(): Int = 2_139_228_816
    }

    abstract class StarTransactionDirection : Object()

    class StarTransactionDirectionIncoming : StarTransactionDirection() {
        override fun getConstructor(): Int = -1_295_335_866
    }

    class StarTransactionDirectionOutgoing : StarTransactionDirection() {
        override fun getConstructor(): Int = 1_854_125_472
    }

    abstract class StarTransactionType : Object()

    class StarTransactionTypePremiumBotDeposit : StarTransactionType() {
        override fun getConstructor(): Int = -663_156_466
    }

    class StarTransactionTypeAppStoreDeposit : StarTransactionType() {
        override fun getConstructor(): Int = 136_853_825
    }

    class StarTransactionTypeGooglePlayDeposit : StarTransactionType() {
        override fun getConstructor(): Int = -323_111_338
    }

    class StarTransactionTypeFragmentDeposit : StarTransactionType() {
        override fun getConstructor(): Int = 123_887_172
    }

    class StarTransactionTypeUserDeposit(
        @JvmField
        val userId: Long,
        @JvmField
        val sticker: Sticker?,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = 204_085_481
    }

    class StarTransactionTypeGiveawayDeposit(
        @JvmField
        val chatId: Long,
        @JvmField
        val giveawayMessageId: Long,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = -1_318_977_338
    }

    class StarTransactionTypeFragmentWithdrawal(
        @JvmField
        val withdrawalState: RevenueWithdrawalState?,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = -1_355_142_766
    }

    class StarTransactionTypeTelegramAdsWithdrawal : StarTransactionType() {
        override fun getConstructor(): Int = -1_517_386_647
    }

    class StarTransactionTypeTelegramApiUsage(
        @JvmField
        val requestCount: Int,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = 665_332_478
    }

    class StarTransactionTypeBotPaidMediaPurchase(
        @JvmField
        val userId: Long,
        @JvmField
        val media: Array<PaidMedia>,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = 976_645_509
    }

    class StarTransactionTypeBotPaidMediaSale(
        @JvmField
        val userId: Long,
        @JvmField
        val media: Array<PaidMedia>,
        @JvmField
        val payload: String,
        @JvmField
        val affiliate: AffiliateInfo?,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = -1_034_408_372
    }

    class StarTransactionTypeChannelPaidMediaPurchase(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val media: Array<PaidMedia>,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = -1_321_281_338
    }

    class StarTransactionTypeChannelPaidMediaSale(
        @JvmField
        val userId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val media: Array<PaidMedia>,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = 52_587_085
    }

    class StarTransactionTypeBotInvoicePurchase(
        @JvmField
        val userId: Long,
        @JvmField
        val productInfo: ProductInfo,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = 501_066_764
    }

    class StarTransactionTypeBotInvoiceSale(
        @JvmField
        val userId: Long,
        @JvmField
        val productInfo: ProductInfo,
        @JvmField
        val invoicePayload: ByteArray,
        @JvmField
        val affiliate: AffiliateInfo?,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = 1_534_954_799
    }

    class StarTransactionTypeBotSubscriptionPurchase(
        @JvmField
        val userId: Long,
        @JvmField
        val subscriptionPeriod: Int,
        @JvmField
        val productInfo: ProductInfo,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = 1_086_264_149
    }

    class StarTransactionTypeBotSubscriptionSale(
        @JvmField
        val userId: Long,
        @JvmField
        val subscriptionPeriod: Int,
        @JvmField
        val productInfo: ProductInfo,
        @JvmField
        val invoicePayload: ByteArray,
        @JvmField
        val affiliate: AffiliateInfo?,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = 526_936_201
    }

    class StarTransactionTypeChannelSubscriptionPurchase(
        @JvmField
        val chatId: Long,
        @JvmField
        val subscriptionPeriod: Int,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = 940_487_633
    }

    class StarTransactionTypeChannelSubscriptionSale(
        @JvmField
        val userId: Long,
        @JvmField
        val subscriptionPeriod: Int,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = -32_342_910
    }

    class StarTransactionTypeGiftPurchase(
        @JvmField
        val ownerId: MessageSender,
        @JvmField
        val gift: Gift,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = -1_819_045_664
    }

    class StarTransactionTypeGiftTransfer(
        @JvmField
        val ownerId: MessageSender,
        @JvmField
        val gift: UpgradedGift,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = 9_835_767
    }

    class StarTransactionTypeGiftSale(
        @JvmField
        val userId: Long,
        @JvmField
        val gift: Gift,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = 1_691_750_743
    }

    class StarTransactionTypeGiftUpgrade(
        @JvmField
        val userId: Long,
        @JvmField
        val gift: UpgradedGift,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = -632_388_839
    }

    class StarTransactionTypeUpgradedGiftPurchase(
        @JvmField
        val userId: Long,
        @JvmField
        val gift: UpgradedGift,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = -59_050_247
    }

    class StarTransactionTypeUpgradedGiftSale(
        @JvmField
        val userId: Long,
        @JvmField
        val gift: UpgradedGift,
        @JvmField
        val affiliate: AffiliateInfo,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = 2_041_948_603
    }

    class StarTransactionTypeChannelPaidReactionSend(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = -1_071_224_896
    }

    class StarTransactionTypeChannelPaidReactionReceive(
        @JvmField
        val userId: Long,
        @JvmField
        val messageId: Long,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = 601_291_243
    }

    class StarTransactionTypeAffiliateProgramCommission(
        @JvmField
        val chatId: Long,
        @JvmField
        val commissionPerMille: Int,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = -1_704_757_901
    }

    class StarTransactionTypePaidMessageSend(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageCount: Int,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = -1_709_611_931
    }

    class StarTransactionTypePaidMessageReceive(
        @JvmField
        val senderId: MessageSender,
        @JvmField
        val messageCount: Int,
        @JvmField
        val commissionPerMille: Int,
        @JvmField
        val commissionStarAmount: StarAmount,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = -676_839_994
    }

    class StarTransactionTypePremiumPurchase(
        @JvmField
        val userId: Long,
        @JvmField
        val monthCount: Int,
        @JvmField
        val sticker: Sticker?,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = 998_094_851
    }

    class StarTransactionTypeBusinessBotTransferSend(
        @JvmField
        val userId: Long,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = 1_221_227_814
    }

    class StarTransactionTypeBusinessBotTransferReceive(
        @JvmField
        val userId: Long,
    ) : StarTransactionType() {
        override fun getConstructor(): Int = 532_496_778
    }

    class StarTransactionTypeUnsupported : StarTransactionType() {
        override fun getConstructor(): Int = 1_993_329_330
    }

    class StarTransactions(
        @JvmField
        val starAmount: StarAmount,
        @JvmField
        val transactions: Array<StarTransaction>,
        @JvmField
        val nextOffset: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_218_437_859
    }

    abstract class StatisticalGraph : Object()

    class StatisticalGraphData(
        @JvmField
        val jsonData: String,
        @JvmField
        val zoomToken: String,
    ) : StatisticalGraph() {
        override fun getConstructor(): Int = -1_988_940_244
    }

    class StatisticalGraphAsync(
        @JvmField
        val token: String,
    ) : StatisticalGraph() {
        override fun getConstructor(): Int = 435_891_103
    }

    class StatisticalGraphError(
        @JvmField
        val errorMessage: String,
    ) : StatisticalGraph() {
        override fun getConstructor(): Int = -1_006_788_526
    }

    class StatisticalValue(
        @JvmField
        val value: Double,
        @JvmField
        val previousValue: Double,
        @JvmField
        val growthRatePercentage: Double,
    ) : Object() {
        override fun getConstructor(): Int = 1_651_337_846
    }

    class Sticker(
        @JvmField
        val id: Long,
        @JvmField
        val setId: Long,
        @JvmField
        val width: Int,
        @JvmField
        val height: Int,
        @JvmField
        val emoji: String,
        @JvmField
        val format: StickerFormat,
        @JvmField
        val fullType: StickerFullType,
        @JvmField
        val thumbnail: Thumbnail?,
        @JvmField
        val sticker: File,
    ) : Object() {
        override fun getConstructor(): Int = -647_013_057
    }

    abstract class StickerFormat : Object()

    class StickerFormatWebp : StickerFormat() {
        override fun getConstructor(): Int = -2_123_043_040
    }

    class StickerFormatTgs : StickerFormat() {
        override fun getConstructor(): Int = 1_614_588_662
    }

    class StickerFormatWebm : StickerFormat() {
        override fun getConstructor(): Int = -2_070_162_097
    }

    abstract class StickerFullType : Object()

    class StickerFullTypeRegular(
        @JvmField
        val premiumAnimation: File?,
    ) : StickerFullType() {
        override fun getConstructor(): Int = -2_006_425_865
    }

    class StickerFullTypeMask(
        @JvmField
        val maskPosition: MaskPosition?,
    ) : StickerFullType() {
        override fun getConstructor(): Int = 652_197_687
    }

    class StickerFullTypeCustomEmoji(
        @JvmField
        val customEmojiId: Long,
        @JvmField
        val needsRepainting: Boolean,
    ) : StickerFullType() {
        override fun getConstructor(): Int = -1_015_085_653
    }

    class StickerSet(
        @JvmField
        val id: Long,
        @JvmField
        val title: String,
        @JvmField
        val name: String,
        @JvmField
        val thumbnail: Thumbnail?,
        @JvmField
        val thumbnailOutline: Outline?,
        @JvmField
        val isOwned: Boolean,
        @JvmField
        val isInstalled: Boolean,
        @JvmField
        val isArchived: Boolean,
        @JvmField
        val isOfficial: Boolean,
        @JvmField
        val stickerType: StickerType,
        @JvmField
        val needsRepainting: Boolean,
        @JvmField
        val isAllowedAsChatEmojiStatus: Boolean,
        @JvmField
        val isViewed: Boolean,
        @JvmField
        val stickers: Array<Sticker>,
        @JvmField
        val emojis: Array<Emojis>,
    ) : Object() {
        override fun getConstructor(): Int = -1_783_150_210
    }

    class StickerSetInfo(
        @JvmField
        val id: Long,
        @JvmField
        val title: String,
        @JvmField
        val name: String,
        @JvmField
        val thumbnail: Thumbnail?,
        @JvmField
        val thumbnailOutline: Outline?,
        @JvmField
        val isOwned: Boolean,
        @JvmField
        val isInstalled: Boolean,
        @JvmField
        val isArchived: Boolean,
        @JvmField
        val isOfficial: Boolean,
        @JvmField
        val stickerType: StickerType,
        @JvmField
        val needsRepainting: Boolean,
        @JvmField
        val isAllowedAsChatEmojiStatus: Boolean,
        @JvmField
        val isViewed: Boolean,
        @JvmField
        val size: Int,
        @JvmField
        val covers: Array<Sticker>,
    ) : Object() {
        override fun getConstructor(): Int = -1_649_074_729
    }

    class StickerSets(
        @JvmField
        val totalCount: Int,
        @JvmField
        val sets: Array<StickerSetInfo>,
    ) : Object() {
        override fun getConstructor(): Int = -1_883_828_812
    }

    abstract class StickerType : Object()

    class StickerTypeRegular : StickerType() {
        override fun getConstructor(): Int = 56_345_973
    }

    class StickerTypeMask : StickerType() {
        override fun getConstructor(): Int = -1_765_394_796
    }

    class StickerTypeCustomEmoji : StickerType() {
        override fun getConstructor(): Int = -120_752_249
    }

    class Stickers(
        @JvmField
        val stickers: Array<Sticker>,
    ) : Object() {
        override fun getConstructor(): Int = 1_974_859_260
    }

    class StorageStatistics(
        @JvmField
        val size: Long,
        @JvmField
        val count: Int,
        @JvmField
        val byChat: Array<StorageStatisticsByChat>,
    ) : Object() {
        override fun getConstructor(): Int = 217_237_013
    }

    class StorageStatisticsByChat(
        @JvmField
        val chatId: Long,
        @JvmField
        val size: Long,
        @JvmField
        val count: Int,
        @JvmField
        val byFileType: Array<StorageStatisticsByFileType>,
    ) : Object() {
        override fun getConstructor(): Int = 635_434_531
    }

    class StorageStatisticsByFileType(
        @JvmField
        val fileType: FileType,
        @JvmField
        val size: Long,
        @JvmField
        val count: Int,
    ) : Object() {
        override fun getConstructor(): Int = 714_012_840
    }

    class StorageStatisticsFast(
        @JvmField
        val filesSize: Long,
        @JvmField
        val fileCount: Int,
        @JvmField
        val databaseSize: Long,
        @JvmField
        val languagePackDatabaseSize: Long,
        @JvmField
        val logSize: Long,
    ) : Object() {
        override fun getConstructor(): Int = -884_922_271
    }

    abstract class StorePaymentPurpose : Object()

    class StorePaymentPurposePremiumSubscription(
        @JvmField
        val isRestore: Boolean,
        @JvmField
        val isUpgrade: Boolean,
    ) : StorePaymentPurpose() {
        override fun getConstructor(): Int = 1_263_894_804
    }

    class StorePaymentPurposePremiumGift(
        @JvmField
        val currency: String,
        @JvmField
        val amount: Long,
        @JvmField
        val userId: Long,
        @JvmField
        val text: FormattedText,
    ) : StorePaymentPurpose() {
        override fun getConstructor(): Int = -39_502_443
    }

    class StorePaymentPurposePremiumGiftCodes(
        @JvmField
        val boostedChatId: Long,
        @JvmField
        val currency: String,
        @JvmField
        val amount: Long,
        @JvmField
        val userIds: LongArray,
        @JvmField
        val text: FormattedText,
    ) : StorePaymentPurpose() {
        override fun getConstructor(): Int = -1_072_286_736
    }

    class StorePaymentPurposePremiumGiveaway(
        @JvmField
        val parameters: GiveawayParameters,
        @JvmField
        val currency: String,
        @JvmField
        val amount: Long,
    ) : StorePaymentPurpose() {
        override fun getConstructor(): Int = 1_302_624_938
    }

    class StorePaymentPurposeStarGiveaway(
        @JvmField
        val parameters: GiveawayParameters,
        @JvmField
        val currency: String,
        @JvmField
        val amount: Long,
        @JvmField
        val winnerCount: Int,
        @JvmField
        val starCount: Long,
    ) : StorePaymentPurpose() {
        override fun getConstructor(): Int = 211_212_441
    }

    class StorePaymentPurposeStars(
        @JvmField
        val currency: String,
        @JvmField
        val amount: Long,
        @JvmField
        val starCount: Long,
    ) : StorePaymentPurpose() {
        override fun getConstructor(): Int = -1_803_497_708
    }

    class StorePaymentPurposeGiftedStars(
        @JvmField
        val userId: Long,
        @JvmField
        val currency: String,
        @JvmField
        val amount: Long,
        @JvmField
        val starCount: Long,
    ) : StorePaymentPurpose() {
        override fun getConstructor(): Int = 893_691_428
    }

    abstract class StoreTransaction : Object()

    class StoreTransactionAppStore(
        @JvmField
        val receipt: ByteArray,
    ) : StoreTransaction() {
        override fun getConstructor(): Int = 1_625_562_441
    }

    class StoreTransactionGooglePlay(
        @JvmField
        val packageName: String,
        @JvmField
        val storeProductId: String,
        @JvmField
        val purchaseToken: String,
    ) : StoreTransaction() {
        override fun getConstructor(): Int = 1_094_018_617
    }

    class Stories(
        @JvmField
        val totalCount: Int,
        @JvmField
        val stories: Array<Story>,
        @JvmField
        val pinnedStoryIds: IntArray,
    ) : Object() {
        override fun getConstructor(): Int = 670_157_595
    }

    class Story(
        @JvmField
        val id: Int,
        @JvmField
        val posterChatId: Long,
        @JvmField
        val posterId: MessageSender?,
        @JvmField
        val date: Int,
        @JvmField
        val isBeingPosted: Boolean,
        @JvmField
        val isBeingEdited: Boolean,
        @JvmField
        val isEdited: Boolean,
        @JvmField
        val isPostedToChatPage: Boolean,
        @JvmField
        val isVisibleOnlyForSelf: Boolean,
        @JvmField
        val canBeDeleted: Boolean,
        @JvmField
        val canBeEdited: Boolean,
        @JvmField
        val canBeForwarded: Boolean,
        @JvmField
        val canBeReplied: Boolean,
        @JvmField
        val canToggleIsPostedToChatPage: Boolean,
        @JvmField
        val canGetStatistics: Boolean,
        @JvmField
        val canGetInteractions: Boolean,
        @JvmField
        val hasExpiredViewers: Boolean,
        @JvmField
        val repostInfo: StoryRepostInfo?,
        @JvmField
        val interactionInfo: StoryInteractionInfo?,
        @JvmField
        val chosenReactionType: ReactionType?,
        @JvmField
        val privacySettings: StoryPrivacySettings,
        @JvmField
        val content: StoryContent,
        @JvmField
        val areas: Array<StoryArea>,
        @JvmField
        val caption: FormattedText,
    ) : Object() {
        override fun getConstructor(): Int = 1_206_531_707
    }

    class StoryArea(
        @JvmField
        val position: StoryAreaPosition,
        @JvmField
        val type: StoryAreaType,
    ) : Object() {
        override fun getConstructor(): Int = -906_033_314
    }

    class StoryAreaPosition(
        @JvmField
        val xPercentage: Double,
        @JvmField
        val yPercentage: Double,
        @JvmField
        val widthPercentage: Double,
        @JvmField
        val heightPercentage: Double,
        @JvmField
        val rotationAngle: Double,
        @JvmField
        val cornerRadiusPercentage: Double,
    ) : Object() {
        override fun getConstructor(): Int = -1_533_023_124
    }

    abstract class StoryAreaType : Object()

    class StoryAreaTypeLocation(
        @JvmField
        val location: Location,
        @JvmField
        val address: LocationAddress?,
    ) : StoryAreaType() {
        override fun getConstructor(): Int = -1_464_612_189
    }

    class StoryAreaTypeVenue(
        @JvmField
        val venue: Venue,
    ) : StoryAreaType() {
        override fun getConstructor(): Int = 414_076_166
    }

    class StoryAreaTypeSuggestedReaction(
        @JvmField
        val reactionType: ReactionType,
        @JvmField
        val totalCount: Int,
        @JvmField
        val isDark: Boolean,
        @JvmField
        val isFlipped: Boolean,
    ) : StoryAreaType() {
        override fun getConstructor(): Int = -111_177_092
    }

    class StoryAreaTypeMessage(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
    ) : StoryAreaType() {
        override fun getConstructor(): Int = -1_074_825_548
    }

    class StoryAreaTypeLink(
        @JvmField
        val url: String,
    ) : StoryAreaType() {
        override fun getConstructor(): Int = -127_770_235
    }

    class StoryAreaTypeWeather(
        @JvmField
        val temperature: Double,
        @JvmField
        val emoji: String,
        @JvmField
        val backgroundColor: Int,
    ) : StoryAreaType() {
        override fun getConstructor(): Int = -1_504_150_082
    }

    class StoryAreaTypeUpgradedGift(
        @JvmField
        val giftName: String,
    ) : StoryAreaType() {
        override fun getConstructor(): Int = 760_281_479
    }

    abstract class StoryContent : Object()

    class StoryContentPhoto(
        @JvmField
        val photo: Photo,
    ) : StoryContent() {
        override fun getConstructor(): Int = -731_971_504
    }

    class StoryContentVideo(
        @JvmField
        val video: StoryVideo,
        @JvmField
        val alternativeVideo: StoryVideo?,
    ) : StoryContent() {
        override fun getConstructor(): Int = -1_291_754_842
    }

    class StoryContentUnsupported : StoryContent() {
        override fun getConstructor(): Int = -2_033_715_858
    }

    class StoryFullId(
        @JvmField
        val posterChatId: Long,
        @JvmField
        val storyId: Int,
    ) : Object() {
        override fun getConstructor(): Int = 765_952_419
    }

    class StoryInfo(
        @JvmField
        val storyId: Int,
        @JvmField
        val date: Int,
        @JvmField
        val isForCloseFriends: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -1_986_542_766
    }

    class StoryInteraction(
        @JvmField
        val actorId: MessageSender,
        @JvmField
        val interactionDate: Int,
        @JvmField
        val blockList: BlockList?,
        @JvmField
        val type: StoryInteractionType,
    ) : Object() {
        override fun getConstructor(): Int = -702_229_982
    }

    class StoryInteractionInfo(
        @JvmField
        val viewCount: Int,
        @JvmField
        val forwardCount: Int,
        @JvmField
        val reactionCount: Int,
        @JvmField
        val recentViewerUserIds: LongArray,
    ) : Object() {
        override fun getConstructor(): Int = -846_542_065
    }

    abstract class StoryInteractionType : Object()

    class StoryInteractionTypeView(
        @JvmField
        val chosenReactionType: ReactionType?,
    ) : StoryInteractionType() {
        override fun getConstructor(): Int = 1_407_399_888
    }

    class StoryInteractionTypeForward(
        @JvmField
        val message: Message,
    ) : StoryInteractionType() {
        override fun getConstructor(): Int = 668_089_599
    }

    class StoryInteractionTypeRepost(
        @JvmField
        val story: Story,
    ) : StoryInteractionType() {
        override fun getConstructor(): Int = -1_021_150_780
    }

    class StoryInteractions(
        @JvmField
        val totalCount: Int,
        @JvmField
        val totalForwardCount: Int,
        @JvmField
        val totalReactionCount: Int,
        @JvmField
        val interactions: Array<StoryInteraction>,
        @JvmField
        val nextOffset: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_537_062_962
    }

    abstract class StoryList : Object()

    class StoryListMain : StoryList() {
        override fun getConstructor(): Int = -672_222_209
    }

    class StoryListArchive : StoryList() {
        override fun getConstructor(): Int = -41_900_223
    }

    abstract class StoryOrigin : Object()

    class StoryOriginPublicStory(
        @JvmField
        val chatId: Long,
        @JvmField
        val storyId: Int,
    ) : StoryOrigin() {
        override fun getConstructor(): Int = 741_842_878
    }

    class StoryOriginHiddenUser(
        @JvmField
        val posterName: String,
    ) : StoryOrigin() {
        override fun getConstructor(): Int = -96_348_585
    }

    abstract class StoryPrivacySettings : Object()

    class StoryPrivacySettingsEveryone(
        @JvmField
        val exceptUserIds: LongArray,
    ) : StoryPrivacySettings() {
        override fun getConstructor(): Int = 890_847_843
    }

    class StoryPrivacySettingsContacts(
        @JvmField
        val exceptUserIds: LongArray,
    ) : StoryPrivacySettings() {
        override fun getConstructor(): Int = 50_285_309
    }

    class StoryPrivacySettingsCloseFriends : StoryPrivacySettings() {
        override fun getConstructor(): Int = 2_097_122_144
    }

    class StoryPrivacySettingsSelectedUsers(
        @JvmField
        val userIds: LongArray,
    ) : StoryPrivacySettings() {
        override fun getConstructor(): Int = -1_885_772_602
    }

    class StoryRepostInfo(
        @JvmField
        val origin: StoryOrigin,
        @JvmField
        val isContentModified: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -8_412_096
    }

    class StoryStatistics(
        @JvmField
        val storyInteractionGraph: StatisticalGraph,
        @JvmField
        val storyReactionGraph: StatisticalGraph,
    ) : Object() {
        override fun getConstructor(): Int = 1_178_897_259
    }

    class StoryVideo(
        @JvmField
        val duration: Double,
        @JvmField
        val width: Int,
        @JvmField
        val height: Int,
        @JvmField
        val hasStickers: Boolean,
        @JvmField
        val isAnimation: Boolean,
        @JvmField
        val minithumbnail: Minithumbnail?,
        @JvmField
        val thumbnail: Thumbnail?,
        @JvmField
        val preloadPrefixSize: Int,
        @JvmField
        val coverFrameTimestamp: Double,
        @JvmField
        val video: File,
    ) : Object() {
        override fun getConstructor(): Int = 1_445_661_253
    }

    abstract class SuggestedAction : Object()

    class SuggestedActionEnableArchiveAndMuteNewChats : SuggestedAction() {
        override fun getConstructor(): Int = 2_017_586_255
    }

    class SuggestedActionCheckPassword : SuggestedAction() {
        override fun getConstructor(): Int = 1_910_534_839
    }

    class SuggestedActionCheckPhoneNumber : SuggestedAction() {
        override fun getConstructor(): Int = 648_771_563
    }

    class SuggestedActionViewChecksHint : SuggestedAction() {
        override fun getConstructor(): Int = 891_303_239
    }

    class SuggestedActionConvertToBroadcastGroup(
        @JvmField
        val supergroupId: Long,
    ) : SuggestedAction() {
        override fun getConstructor(): Int = -965_071_304
    }

    class SuggestedActionSetPassword(
        @JvmField
        val authorizationDelay: Int,
    ) : SuggestedAction() {
        override fun getConstructor(): Int = 1_863_613_848
    }

    class SuggestedActionUpgradePremium : SuggestedAction() {
        override fun getConstructor(): Int = 1_890_220_539
    }

    class SuggestedActionRestorePremium : SuggestedAction() {
        override fun getConstructor(): Int = -385_229_468
    }

    class SuggestedActionSubscribeToAnnualPremium : SuggestedAction() {
        override fun getConstructor(): Int = 373_913_787
    }

    class SuggestedActionGiftPremiumForChristmas : SuggestedAction() {
        override fun getConstructor(): Int = -1_816_924_561
    }

    class SuggestedActionSetBirthdate : SuggestedAction() {
        override fun getConstructor(): Int = -356_672_766
    }

    class SuggestedActionSetProfilePhoto : SuggestedAction() {
        override fun getConstructor(): Int = -1_612_563_093
    }

    class SuggestedActionExtendPremium(
        @JvmField
        val managePremiumSubscriptionUrl: String,
    ) : SuggestedAction() {
        override fun getConstructor(): Int = -566_207_286
    }

    class SuggestedActionExtendStarSubscriptions : SuggestedAction() {
        override fun getConstructor(): Int = -47_000_234
    }

    class SuggestedActionCustom(
        @JvmField
        val name: String,
        @JvmField
        val title: FormattedText,
        @JvmField
        val description: FormattedText,
        @JvmField
        val url: String,
    ) : SuggestedAction() {
        override fun getConstructor(): Int = 2_092_876_611
    }

    class Supergroup(
        @JvmField
        val id: Long,
        @JvmField
        val usernames: Usernames?,
        @JvmField
        val date: Int,
        @JvmField
        val status: ChatMemberStatus,
        @JvmField
        val memberCount: Int,
        @JvmField
        val boostLevel: Int,
        @JvmField
        val hasAutomaticTranslation: Boolean,
        @JvmField
        val hasLinkedChat: Boolean,
        @JvmField
        val hasLocation: Boolean,
        @JvmField
        val signMessages: Boolean,
        @JvmField
        val showMessageSender: Boolean,
        @JvmField
        val joinToSendMessages: Boolean,
        @JvmField
        val joinByRequest: Boolean,
        @JvmField
        val isSlowModeEnabled: Boolean,
        @JvmField
        val isChannel: Boolean,
        @JvmField
        val isBroadcastGroup: Boolean,
        @JvmField
        val isForum: Boolean,
        @JvmField
        val isDirectMessagesGroup: Boolean,
        @JvmField
        val isAdministeredDirectMessagesGroup: Boolean,
        @JvmField
        val verificationStatus: VerificationStatus?,
        @JvmField
        val hasDirectMessagesGroup: Boolean,
        @JvmField
        val hasForumTabs: Boolean,
        @JvmField
        val hasSensitiveContent: Boolean,
        @JvmField
        val restrictionReason: String,
        @JvmField
        val paidMessageStarCount: Long,
        @JvmField
        val hasActiveStories: Boolean,
        @JvmField
        val hasUnreadActiveStories: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -90_094_017
    }

    class SupergroupFullInfo(
        @JvmField
        val photo: ChatPhoto?,
        @JvmField
        val description: String,
        @JvmField
        val memberCount: Int,
        @JvmField
        val administratorCount: Int,
        @JvmField
        val restrictedCount: Int,
        @JvmField
        val bannedCount: Int,
        @JvmField
        val linkedChatId: Long,
        @JvmField
        val directMessagesChatId: Long,
        @JvmField
        val slowModeDelay: Int,
        @JvmField
        val slowModeDelayExpiresIn: Double,
        @JvmField
        val canEnablePaidMessages: Boolean,
        @JvmField
        val canEnablePaidReaction: Boolean,
        @JvmField
        val canGetMembers: Boolean,
        @JvmField
        val hasHiddenMembers: Boolean,
        @JvmField
        val canHideMembers: Boolean,
        @JvmField
        val canSetStickerSet: Boolean,
        @JvmField
        val canSetLocation: Boolean,
        @JvmField
        val canGetStatistics: Boolean,
        @JvmField
        val canGetRevenueStatistics: Boolean,
        @JvmField
        val canGetStarRevenueStatistics: Boolean,
        @JvmField
        val canSendGift: Boolean,
        @JvmField
        val canToggleAggressiveAntiSpam: Boolean,
        @JvmField
        val isAllHistoryAvailable: Boolean,
        @JvmField
        val canHaveSponsoredMessages: Boolean,
        @JvmField
        val hasAggressiveAntiSpamEnabled: Boolean,
        @JvmField
        val hasPaidMediaAllowed: Boolean,
        @JvmField
        val hasPinnedStories: Boolean,
        @JvmField
        val giftCount: Int,
        @JvmField
        val myBoostCount: Int,
        @JvmField
        val unrestrictBoostCount: Int,
        @JvmField
        val outgoingPaidMessageStarCount: Long,
        @JvmField
        val stickerSetId: Long,
        @JvmField
        val customEmojiStickerSetId: Long,
        @JvmField
        val location: ChatLocation?,
        @JvmField
        val inviteLink: ChatInviteLink?,
        @JvmField
        val botCommands: Array<BotCommands>,
        @JvmField
        val botVerification: BotVerification?,
        @JvmField
        val upgradedFromBasicGroupId: Long,
        @JvmField
        val upgradedFromMaxMessageId: Long,
    ) : Object() {
        override fun getConstructor(): Int = -726_503_465
    }

    abstract class SupergroupMembersFilter : Object()

    class SupergroupMembersFilterRecent : SupergroupMembersFilter() {
        override fun getConstructor(): Int = 1_178_199_509
    }

    class SupergroupMembersFilterContacts(
        @JvmField
        val query: String,
    ) : SupergroupMembersFilter() {
        override fun getConstructor(): Int = -1_282_910_856
    }

    class SupergroupMembersFilterAdministrators : SupergroupMembersFilter() {
        override fun getConstructor(): Int = -2_097_380_265
    }

    class SupergroupMembersFilterSearch(
        @JvmField
        val query: String,
    ) : SupergroupMembersFilter() {
        override fun getConstructor(): Int = -1_696_358_469
    }

    class SupergroupMembersFilterRestricted(
        @JvmField
        val query: String,
    ) : SupergroupMembersFilter() {
        override fun getConstructor(): Int = -1_107_800_034
    }

    class SupergroupMembersFilterBanned(
        @JvmField
        val query: String,
    ) : SupergroupMembersFilter() {
        override fun getConstructor(): Int = -1_210_621_683
    }

    class SupergroupMembersFilterMention(
        @JvmField
        val query: String,
        @JvmField
        val messageThreadId: Long,
    ) : SupergroupMembersFilter() {
        override fun getConstructor(): Int = 947_915_036
    }

    class SupergroupMembersFilterBots : SupergroupMembersFilter() {
        override fun getConstructor(): Int = 492_138_918
    }

    class TMeUrl(
        @JvmField
        val url: String,
        @JvmField
        val type: TMeUrlType,
    ) : Object() {
        override fun getConstructor(): Int = -1_140_786_622
    }

    abstract class TMeUrlType : Object()

    class TMeUrlTypeUser(
        @JvmField
        val userId: Long,
    ) : TMeUrlType() {
        override fun getConstructor(): Int = 125_336_602
    }

    class TMeUrlTypeSupergroup(
        @JvmField
        val supergroupId: Long,
    ) : TMeUrlType() {
        override fun getConstructor(): Int = -1_353_369_944
    }

    class TMeUrlTypeChatInvite(
        @JvmField
        val info: ChatInviteLinkInfo,
    ) : TMeUrlType() {
        override fun getConstructor(): Int = 313_907_785
    }

    class TMeUrlTypeStickerSet(
        @JvmField
        val stickerSetId: Long,
    ) : TMeUrlType() {
        override fun getConstructor(): Int = 1_602_473_196
    }

    class TMeUrls(
        @JvmField
        val urls: Array<TMeUrl>,
    ) : Object() {
        override fun getConstructor(): Int = -1_130_595_098
    }

    abstract class TargetChat : Object()

    class TargetChatCurrent : TargetChat() {
        override fun getConstructor(): Int = -416_689_904
    }

    class TargetChatChosen(
        @JvmField
        val types: TargetChatTypes,
    ) : TargetChat() {
        override fun getConstructor(): Int = -1_392_978_522
    }

    class TargetChatInternalLink(
        @JvmField
        val link: InternalLinkType,
    ) : TargetChat() {
        override fun getConstructor(): Int = -579_301_408
    }

    class TargetChatTypes(
        @JvmField
        val allowUserChats: Boolean,
        @JvmField
        val allowBotChats: Boolean,
        @JvmField
        val allowGroupChats: Boolean,
        @JvmField
        val allowChannelChats: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 1_513_098_833
    }

    abstract class TelegramPaymentPurpose : Object()

    class TelegramPaymentPurposePremiumGift(
        @JvmField
        val currency: String,
        @JvmField
        val amount: Long,
        @JvmField
        val userId: Long,
        @JvmField
        val monthCount: Int,
        @JvmField
        val text: FormattedText,
    ) : TelegramPaymentPurpose() {
        override fun getConstructor(): Int = -1_600_286_150
    }

    class TelegramPaymentPurposePremiumGiftCodes(
        @JvmField
        val boostedChatId: Long,
        @JvmField
        val currency: String,
        @JvmField
        val amount: Long,
        @JvmField
        val userIds: LongArray,
        @JvmField
        val monthCount: Int,
        @JvmField
        val text: FormattedText,
    ) : TelegramPaymentPurpose() {
        override fun getConstructor(): Int = -1_863_495_348
    }

    class TelegramPaymentPurposePremiumGiveaway(
        @JvmField
        val parameters: GiveawayParameters,
        @JvmField
        val currency: String,
        @JvmField
        val amount: Long,
        @JvmField
        val winnerCount: Int,
        @JvmField
        val monthCount: Int,
    ) : TelegramPaymentPurpose() {
        override fun getConstructor(): Int = -760_757_441
    }

    class TelegramPaymentPurposeStars(
        @JvmField
        val currency: String,
        @JvmField
        val amount: Long,
        @JvmField
        val starCount: Long,
    ) : TelegramPaymentPurpose() {
        override fun getConstructor(): Int = -495_718_830
    }

    class TelegramPaymentPurposeGiftedStars(
        @JvmField
        val userId: Long,
        @JvmField
        val currency: String,
        @JvmField
        val amount: Long,
        @JvmField
        val starCount: Long,
    ) : TelegramPaymentPurpose() {
        override fun getConstructor(): Int = -1_850_308_042
    }

    class TelegramPaymentPurposeStarGiveaway(
        @JvmField
        val parameters: GiveawayParameters,
        @JvmField
        val currency: String,
        @JvmField
        val amount: Long,
        @JvmField
        val winnerCount: Int,
        @JvmField
        val starCount: Long,
    ) : TelegramPaymentPurpose() {
        override fun getConstructor(): Int = 1_014_604_689
    }

    class TelegramPaymentPurposeJoinChat(
        @JvmField
        val inviteLink: String,
    ) : TelegramPaymentPurpose() {
        override fun getConstructor(): Int = -1_914_869_880
    }

    class TemporaryPasswordState(
        @JvmField
        val hasPassword: Boolean,
        @JvmField
        val validFor: Int,
    ) : Object() {
        override fun getConstructor(): Int = 939_837_410
    }

    class TermsOfService(
        @JvmField
        val text: FormattedText,
        @JvmField
        val minUserAge: Int,
        @JvmField
        val showPopup: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 739_422_597
    }

    class TestBytes(
        @JvmField
        val value: ByteArray,
    ) : Object() {
        override fun getConstructor(): Int = -1_541_225_250
    }

    class TestInt(
        @JvmField
        val value: Int,
    ) : Object() {
        override fun getConstructor(): Int = -574_804_983
    }

    class TestString(
        @JvmField
        val value: String,
    ) : Object() {
        override fun getConstructor(): Int = -27_891_572
    }

    class TestVectorInt(
        @JvmField
        val value: IntArray,
    ) : Object() {
        override fun getConstructor(): Int = 593_682_027
    }

    class TestVectorIntObject(
        @JvmField
        val value: Array<TestInt>,
    ) : Object() {
        override fun getConstructor(): Int = 125_891_546
    }

    class TestVectorString(
        @JvmField
        val value: Array<String>,
    ) : Object() {
        override fun getConstructor(): Int = 79_339_995
    }

    class TestVectorStringObject(
        @JvmField
        val value: Array<TestString>,
    ) : Object() {
        override fun getConstructor(): Int = 80_780_537
    }

    class Text(
        @JvmField
        val text: String,
    ) : Object() {
        override fun getConstructor(): Int = 578_181_272
    }

    class TextEntities(
        @JvmField
        val entities: Array<TextEntity>,
    ) : Object() {
        override fun getConstructor(): Int = -933_199_172
    }

    class TextEntity(
        @JvmField
        val offset: Int,
        @JvmField
        val length: Int,
        @JvmField
        val type: TextEntityType,
    ) : Object() {
        override fun getConstructor(): Int = -1_951_688_280
    }

    abstract class TextEntityType : Object()

    class TextEntityTypeMention : TextEntityType() {
        override fun getConstructor(): Int = 934_535_013
    }

    class TextEntityTypeHashtag : TextEntityType() {
        override fun getConstructor(): Int = -1_023_958_307
    }

    class TextEntityTypeCashtag : TextEntityType() {
        override fun getConstructor(): Int = 1_222_915_915
    }

    class TextEntityTypeBotCommand : TextEntityType() {
        override fun getConstructor(): Int = -1_150_997_581
    }

    class TextEntityTypeUrl : TextEntityType() {
        override fun getConstructor(): Int = -1_312_762_756
    }

    class TextEntityTypeEmailAddress : TextEntityType() {
        override fun getConstructor(): Int = 1_425_545_249
    }

    class TextEntityTypePhoneNumber : TextEntityType() {
        override fun getConstructor(): Int = -1_160_140_246
    }

    class TextEntityTypeBankCardNumber : TextEntityType() {
        override fun getConstructor(): Int = 105_986_320
    }

    class TextEntityTypeBold : TextEntityType() {
        override fun getConstructor(): Int = -1_128_210_000
    }

    class TextEntityTypeItalic : TextEntityType() {
        override fun getConstructor(): Int = -118_253_987
    }

    class TextEntityTypeUnderline : TextEntityType() {
        override fun getConstructor(): Int = 792_317_842
    }

    class TextEntityTypeStrikethrough : TextEntityType() {
        override fun getConstructor(): Int = 961_529_082
    }

    class TextEntityTypeSpoiler : TextEntityType() {
        override fun getConstructor(): Int = 544_019_899
    }

    class TextEntityTypeCode : TextEntityType() {
        override fun getConstructor(): Int = -974_534_326
    }

    class TextEntityTypePre : TextEntityType() {
        override fun getConstructor(): Int = 1_648_958_606
    }

    class TextEntityTypePreCode(
        @JvmField
        val language: String,
    ) : TextEntityType() {
        override fun getConstructor(): Int = -945_325_397
    }

    class TextEntityTypeBlockQuote : TextEntityType() {
        override fun getConstructor(): Int = -1_003_999_032
    }

    class TextEntityTypeExpandableBlockQuote : TextEntityType() {
        override fun getConstructor(): Int = 36_572_261
    }

    class TextEntityTypeTextUrl(
        @JvmField
        val url: String,
    ) : TextEntityType() {
        override fun getConstructor(): Int = 445_719_651
    }

    class TextEntityTypeMentionName(
        @JvmField
        val userId: Long,
    ) : TextEntityType() {
        override fun getConstructor(): Int = -1_570_974_289
    }

    class TextEntityTypeCustomEmoji(
        @JvmField
        val customEmojiId: Long,
    ) : TextEntityType() {
        override fun getConstructor(): Int = 1_724_820_677
    }

    class TextEntityTypeMediaTimestamp(
        @JvmField
        val mediaTimestamp: Int,
    ) : TextEntityType() {
        override fun getConstructor(): Int = -1_841_898_992
    }

    abstract class TextParseMode : Object()

    class TextParseModeMarkdown(
        @JvmField
        val version: Int,
    ) : TextParseMode() {
        override fun getConstructor(): Int = 360_073_407
    }

    class TextParseModeHTML : TextParseMode() {
        override fun getConstructor(): Int = 1_660_208_627
    }

    class TextQuote(
        @JvmField
        val text: FormattedText,
        @JvmField
        val position: Int,
        @JvmField
        val isManual: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -2_039_105_358
    }

    class ThemeParameters(
        @JvmField
        val backgroundColor: Int,
        @JvmField
        val secondaryBackgroundColor: Int,
        @JvmField
        val headerBackgroundColor: Int,
        @JvmField
        val bottomBarBackgroundColor: Int,
        @JvmField
        val sectionBackgroundColor: Int,
        @JvmField
        val sectionSeparatorColor: Int,
        @JvmField
        val textColor: Int,
        @JvmField
        val accentTextColor: Int,
        @JvmField
        val sectionHeaderTextColor: Int,
        @JvmField
        val subtitleTextColor: Int,
        @JvmField
        val destructiveTextColor: Int,
        @JvmField
        val hintColor: Int,
        @JvmField
        val linkColor: Int,
        @JvmField
        val buttonColor: Int,
        @JvmField
        val buttonTextColor: Int,
    ) : Object() {
        override fun getConstructor(): Int = -276_589_137
    }

    class ThemeSettings(
        @JvmField
        val accentColor: Int,
        @JvmField
        val background: Background?,
        @JvmField
        val outgoingMessageFill: BackgroundFill,
        @JvmField
        val animateOutgoingMessageFill: Boolean,
        @JvmField
        val outgoingMessageAccentColor: Int,
    ) : Object() {
        override fun getConstructor(): Int = -62_120_942
    }

    class Thumbnail(
        @JvmField
        val format: ThumbnailFormat,
        @JvmField
        val width: Int,
        @JvmField
        val height: Int,
        @JvmField
        val file: File,
    ) : Object() {
        override fun getConstructor(): Int = 1_243_275_371
    }

    abstract class ThumbnailFormat : Object()

    class ThumbnailFormatJpeg : ThumbnailFormat() {
        override fun getConstructor(): Int = -653_503_352
    }

    class ThumbnailFormatGif : ThumbnailFormat() {
        override fun getConstructor(): Int = 1_252_205_962
    }

    class ThumbnailFormatMpeg4 : ThumbnailFormat() {
        override fun getConstructor(): Int = 278_616_062
    }

    class ThumbnailFormatPng : ThumbnailFormat() {
        override fun getConstructor(): Int = 1_577_490_421
    }

    class ThumbnailFormatTgs : ThumbnailFormat() {
        override fun getConstructor(): Int = 1_315_522_642
    }

    class ThumbnailFormatWebm : ThumbnailFormat() {
        override fun getConstructor(): Int = -660_084_953
    }

    class ThumbnailFormatWebp : ThumbnailFormat() {
        override fun getConstructor(): Int = -53_588_974
    }

    class TimeZone(
        @JvmField
        val id: String,
        @JvmField
        val name: String,
        @JvmField
        val utcTimeOffset: Int,
    ) : Object() {
        override fun getConstructor(): Int = -1_189_481_763
    }

    class TimeZones(
        @JvmField
        val timeZones: Array<TimeZone>,
    ) : Object() {
        override fun getConstructor(): Int = -334_655_570
    }

    abstract class TopChatCategory : Object()

    class TopChatCategoryUsers : TopChatCategory() {
        override fun getConstructor(): Int = 1_026_706_816
    }

    class TopChatCategoryBots : TopChatCategory() {
        override fun getConstructor(): Int = -1_577_129_195
    }

    class TopChatCategoryGroups : TopChatCategory() {
        override fun getConstructor(): Int = 1_530_056_846
    }

    class TopChatCategoryChannels : TopChatCategory() {
        override fun getConstructor(): Int = -500_825_885
    }

    class TopChatCategoryInlineBots : TopChatCategory() {
        override fun getConstructor(): Int = 377_023_356
    }

    class TopChatCategoryWebAppBots : TopChatCategory() {
        override fun getConstructor(): Int = 100_062_973
    }

    class TopChatCategoryCalls : TopChatCategory() {
        override fun getConstructor(): Int = 356_208_861
    }

    class TopChatCategoryForwardChats : TopChatCategory() {
        override fun getConstructor(): Int = 1_695_922_133
    }

    class TrendingStickerSets(
        @JvmField
        val totalCount: Int,
        @JvmField
        val sets: Array<StickerSetInfo>,
        @JvmField
        val isPremium: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = 41_028_940
    }

    class UnconfirmedSession(
        @JvmField
        val id: Long,
        @JvmField
        val logInDate: Int,
        @JvmField
        val deviceModel: String,
        @JvmField
        val location: String,
    ) : Object() {
        override fun getConstructor(): Int = -2_062_726_663
    }

    class UnreadReaction(
        @JvmField
        val type: ReactionType,
        @JvmField
        val senderId: MessageSender,
        @JvmField
        val isBig: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -1_940_178_046
    }

    abstract class Update : Object()

    class UpdateAuthorizationState(
        @JvmField
        val authorizationState: AuthorizationState,
    ) : Update() {
        override fun getConstructor(): Int = 1_622_347_490
    }

    class UpdateNewMessage(
        @JvmField
        val message: Message,
    ) : Update() {
        override fun getConstructor(): Int = -563_105_266
    }

    class UpdateMessageSendAcknowledged(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
    ) : Update() {
        override fun getConstructor(): Int = 1_302_843_961
    }

    class UpdateMessageSendSucceeded(
        @JvmField
        val message: Message,
        @JvmField
        val oldMessageId: Long,
    ) : Update() {
        override fun getConstructor(): Int = 1_815_715_197
    }

    class UpdateMessageSendFailed(
        @JvmField
        val message: Message,
        @JvmField
        val oldMessageId: Long,
        @JvmField
        val error: Error,
    ) : Update() {
        override fun getConstructor(): Int = -635_701_017
    }

    class UpdateMessageContent(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val newContent: MessageContent,
    ) : Update() {
        override fun getConstructor(): Int = 506_903_332
    }

    class UpdateMessageEdited(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val editDate: Int,
        @JvmField
        val replyMarkup: ReplyMarkup?,
    ) : Update() {
        override fun getConstructor(): Int = -559_545_626
    }

    class UpdateMessageIsPinned(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val isPinned: Boolean,
    ) : Update() {
        override fun getConstructor(): Int = 1_102_848_829
    }

    class UpdateMessageInteractionInfo(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val interactionInfo: MessageInteractionInfo?,
    ) : Update() {
        override fun getConstructor(): Int = -1_417_659_394
    }

    class UpdateMessageContentOpened(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
    ) : Update() {
        override fun getConstructor(): Int = -1_520_523_131
    }

    class UpdateMessageMentionRead(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val unreadMentionCount: Int,
    ) : Update() {
        override fun getConstructor(): Int = -252_228_282
    }

    class UpdateMessageUnreadReactions(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val unreadReactions: Array<UnreadReaction>,
        @JvmField
        val unreadReactionCount: Int,
    ) : Update() {
        override fun getConstructor(): Int = 942_840_008
    }

    class UpdateMessageFactCheck(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val factCheck: FactCheck,
    ) : Update() {
        override fun getConstructor(): Int = 1_014_561_538
    }

    class UpdateMessageLiveLocationViewed(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
    ) : Update() {
        override fun getConstructor(): Int = -1_308_260_971
    }

    class UpdateVideoPublished(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
    ) : Update() {
        override fun getConstructor(): Int = -352_575_406
    }

    class UpdateNewChat(
        @JvmField
        val chat: Chat,
    ) : Update() {
        override fun getConstructor(): Int = 2_075_757_773
    }

    class UpdateChatTitle(
        @JvmField
        val chatId: Long,
        @JvmField
        val title: String,
    ) : Update() {
        override fun getConstructor(): Int = -175_405_660
    }

    class UpdateChatPhoto(
        @JvmField
        val chatId: Long,
        @JvmField
        val photo: ChatPhotoInfo?,
    ) : Update() {
        override fun getConstructor(): Int = -324_713_921
    }

    class UpdateChatAccentColors(
        @JvmField
        val chatId: Long,
        @JvmField
        val accentColorId: Int,
        @JvmField
        val backgroundCustomEmojiId: Long,
        @JvmField
        val profileAccentColorId: Int,
        @JvmField
        val profileBackgroundCustomEmojiId: Long,
    ) : Update() {
        override fun getConstructor(): Int = -1_212_614_407
    }

    class UpdateChatPermissions(
        @JvmField
        val chatId: Long,
        @JvmField
        val permissions: ChatPermissions,
    ) : Update() {
        override fun getConstructor(): Int = -1_622_010_003
    }

    class UpdateChatLastMessage(
        @JvmField
        val chatId: Long,
        @JvmField
        val lastMessage: Message?,
        @JvmField
        val positions: Array<ChatPosition>,
    ) : Update() {
        override fun getConstructor(): Int = -923_244_537
    }

    class UpdateChatPosition(
        @JvmField
        val chatId: Long,
        @JvmField
        val position: ChatPosition,
    ) : Update() {
        override fun getConstructor(): Int = -8_979_849
    }

    class UpdateChatAddedToList(
        @JvmField
        val chatId: Long,
        @JvmField
        val chatList: ChatList,
    ) : Update() {
        override fun getConstructor(): Int = -1_418_722_068
    }

    class UpdateChatRemovedFromList(
        @JvmField
        val chatId: Long,
        @JvmField
        val chatList: ChatList,
    ) : Update() {
        override fun getConstructor(): Int = 1_294_647_836
    }

    class UpdateChatReadInbox(
        @JvmField
        val chatId: Long,
        @JvmField
        val lastReadInboxMessageId: Long,
        @JvmField
        val unreadCount: Int,
    ) : Update() {
        override fun getConstructor(): Int = -797_952_281
    }

    class UpdateChatReadOutbox(
        @JvmField
        val chatId: Long,
        @JvmField
        val lastReadOutboxMessageId: Long,
    ) : Update() {
        override fun getConstructor(): Int = 708_334_213
    }

    class UpdateChatActionBar(
        @JvmField
        val chatId: Long,
        @JvmField
        val actionBar: ChatActionBar?,
    ) : Update() {
        override fun getConstructor(): Int = -643_671_870
    }

    class UpdateChatBusinessBotManageBar(
        @JvmField
        val chatId: Long,
        @JvmField
        val businessBotManageBar: BusinessBotManageBar?,
    ) : Update() {
        override fun getConstructor(): Int = -1_104_091_145
    }

    class UpdateChatAvailableReactions(
        @JvmField
        val chatId: Long,
        @JvmField
        val availableReactions: ChatAvailableReactions,
    ) : Update() {
        override fun getConstructor(): Int = -1_967_909_895
    }

    class UpdateChatDraftMessage(
        @JvmField
        val chatId: Long,
        @JvmField
        val draftMessage: DraftMessage?,
        @JvmField
        val positions: Array<ChatPosition>,
    ) : Update() {
        override fun getConstructor(): Int = 1_455_190_380
    }

    class UpdateChatEmojiStatus(
        @JvmField
        val chatId: Long,
        @JvmField
        val emojiStatus: EmojiStatus?,
    ) : Update() {
        override fun getConstructor(): Int = 2_004_444_432
    }

    class UpdateChatMessageSender(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageSenderId: MessageSender?,
    ) : Update() {
        override fun getConstructor(): Int = 2_003_849_793
    }

    class UpdateChatMessageAutoDeleteTime(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageAutoDeleteTime: Int,
    ) : Update() {
        override fun getConstructor(): Int = 1_900_174_821
    }

    class UpdateChatNotificationSettings(
        @JvmField
        val chatId: Long,
        @JvmField
        val notificationSettings: ChatNotificationSettings,
    ) : Update() {
        override fun getConstructor(): Int = -803_163_050
    }

    class UpdateChatPendingJoinRequests(
        @JvmField
        val chatId: Long,
        @JvmField
        val pendingJoinRequests: ChatJoinRequestsInfo?,
    ) : Update() {
        override fun getConstructor(): Int = 348_578_785
    }

    class UpdateChatReplyMarkup(
        @JvmField
        val chatId: Long,
        @JvmField
        val replyMarkupMessageId: Long,
    ) : Update() {
        override fun getConstructor(): Int = 1_309_386_144
    }

    class UpdateChatBackground(
        @JvmField
        val chatId: Long,
        @JvmField
        val background: ChatBackground?,
    ) : Update() {
        override fun getConstructor(): Int = -6_473_549
    }

    class UpdateChatTheme(
        @JvmField
        val chatId: Long,
        @JvmField
        val themeName: String,
    ) : Update() {
        override fun getConstructor(): Int = 838_063_205
    }

    class UpdateChatUnreadMentionCount(
        @JvmField
        val chatId: Long,
        @JvmField
        val unreadMentionCount: Int,
    ) : Update() {
        override fun getConstructor(): Int = -2_131_461_348
    }

    class UpdateChatUnreadReactionCount(
        @JvmField
        val chatId: Long,
        @JvmField
        val unreadReactionCount: Int,
    ) : Update() {
        override fun getConstructor(): Int = -2_124_399_395
    }

    class UpdateChatVideoChat(
        @JvmField
        val chatId: Long,
        @JvmField
        val videoChat: VideoChat,
    ) : Update() {
        override fun getConstructor(): Int = 637_226_150
    }

    class UpdateChatDefaultDisableNotification(
        @JvmField
        val chatId: Long,
        @JvmField
        val defaultDisableNotification: Boolean,
    ) : Update() {
        override fun getConstructor(): Int = 464_087_707
    }

    class UpdateChatHasProtectedContent(
        @JvmField
        val chatId: Long,
        @JvmField
        val hasProtectedContent: Boolean,
    ) : Update() {
        override fun getConstructor(): Int = 1_800_406_811
    }

    class UpdateChatIsTranslatable(
        @JvmField
        val chatId: Long,
        @JvmField
        val isTranslatable: Boolean,
    ) : Update() {
        override fun getConstructor(): Int = 2_063_799_831
    }

    class UpdateChatIsMarkedAsUnread(
        @JvmField
        val chatId: Long,
        @JvmField
        val isMarkedAsUnread: Boolean,
    ) : Update() {
        override fun getConstructor(): Int = 1_468_347_188
    }

    class UpdateChatViewAsTopics(
        @JvmField
        val chatId: Long,
        @JvmField
        val viewAsTopics: Boolean,
    ) : Update() {
        override fun getConstructor(): Int = 1_543_444_029
    }

    class UpdateChatBlockList(
        @JvmField
        val chatId: Long,
        @JvmField
        val blockList: BlockList?,
    ) : Update() {
        override fun getConstructor(): Int = -2_027_228_018
    }

    class UpdateChatHasScheduledMessages(
        @JvmField
        val chatId: Long,
        @JvmField
        val hasScheduledMessages: Boolean,
    ) : Update() {
        override fun getConstructor(): Int = 2_064_958_167
    }

    class UpdateChatFolders(
        @JvmField
        val chatFolders: Array<ChatFolderInfo>,
        @JvmField
        val mainChatListPosition: Int,
        @JvmField
        val areTagsEnabled: Boolean,
    ) : Update() {
        override fun getConstructor(): Int = 1_998_101_395
    }

    class UpdateChatOnlineMemberCount(
        @JvmField
        val chatId: Long,
        @JvmField
        val onlineMemberCount: Int,
    ) : Update() {
        override fun getConstructor(): Int = 487_369_373
    }

    class UpdateSavedMessagesTopic(
        @JvmField
        val topic: SavedMessagesTopic,
    ) : Update() {
        override fun getConstructor(): Int = -1_618_855_120
    }

    class UpdateSavedMessagesTopicCount(
        @JvmField
        val topicCount: Int,
    ) : Update() {
        override fun getConstructor(): Int = -70_092_335
    }

    class UpdateDirectMessagesChatTopic(
        @JvmField
        val topic: DirectMessagesChatTopic,
    ) : Update() {
        override fun getConstructor(): Int = -683_346_963
    }

    class UpdateTopicMessageCount(
        @JvmField
        val chatId: Long,
        @JvmField
        val topicId: MessageTopic,
        @JvmField
        val messageCount: Int,
    ) : Update() {
        override fun getConstructor(): Int = -1_591_525_479
    }

    class UpdateQuickReplyShortcut(
        @JvmField
        val shortcut: QuickReplyShortcut,
    ) : Update() {
        override fun getConstructor(): Int = -963_430_193
    }

    class UpdateQuickReplyShortcutDeleted(
        @JvmField
        val shortcutId: Int,
    ) : Update() {
        override fun getConstructor(): Int = -390_480_838
    }

    class UpdateQuickReplyShortcuts(
        @JvmField
        val shortcutIds: IntArray,
    ) : Update() {
        override fun getConstructor(): Int = -1_994_849_731
    }

    class UpdateQuickReplyShortcutMessages(
        @JvmField
        val shortcutId: Int,
        @JvmField
        val messages: Array<QuickReplyMessage>,
    ) : Update() {
        override fun getConstructor(): Int = -1_396_685_225
    }

    class UpdateForumTopicInfo(
        @JvmField
        val info: ForumTopicInfo,
    ) : Update() {
        override fun getConstructor(): Int = 1_420_762_696
    }

    class UpdateForumTopic(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageThreadId: Long,
        @JvmField
        val isPinned: Boolean,
        @JvmField
        val lastReadInboxMessageId: Long,
        @JvmField
        val lastReadOutboxMessageId: Long,
        @JvmField
        val unreadMentionCount: Int,
        @JvmField
        val unreadReactionCount: Int,
        @JvmField
        val notificationSettings: ChatNotificationSettings,
    ) : Update() {
        override fun getConstructor(): Int = -534_120_613
    }

    class UpdateScopeNotificationSettings(
        @JvmField
        val scope: NotificationSettingsScope,
        @JvmField
        val notificationSettings: ScopeNotificationSettings,
    ) : Update() {
        override fun getConstructor(): Int = -1_203_975_309
    }

    class UpdateReactionNotificationSettings(
        @JvmField
        val notificationSettings: ReactionNotificationSettings,
    ) : Update() {
        override fun getConstructor(): Int = -447_932_436
    }

    class UpdateNotification(
        @JvmField
        val notificationGroupId: Int,
        @JvmField
        val notification: Notification,
    ) : Update() {
        override fun getConstructor(): Int = -1_897_496_876
    }

    class UpdateNotificationGroup(
        @JvmField
        val notificationGroupId: Int,
        @JvmField
        val type: NotificationGroupType,
        @JvmField
        val chatId: Long,
        @JvmField
        val notificationSettingsChatId: Long,
        @JvmField
        val notificationSoundId: Long,
        @JvmField
        val totalCount: Int,
        @JvmField
        val addedNotifications: Array<Notification>,
        @JvmField
        val removedNotificationIds: IntArray,
    ) : Update() {
        override fun getConstructor(): Int = 1_381_081_378
    }

    class UpdateActiveNotifications(
        @JvmField
        val groups: Array<NotificationGroup>,
    ) : Update() {
        override fun getConstructor(): Int = -1_306_672_221
    }

    class UpdateHavePendingNotifications(
        @JvmField
        val haveDelayedNotifications: Boolean,
        @JvmField
        val haveUnreceivedNotifications: Boolean,
    ) : Update() {
        override fun getConstructor(): Int = 179_233_243
    }

    class UpdateDeleteMessages(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageIds: LongArray,
        @JvmField
        val isPermanent: Boolean,
        @JvmField
        val fromCache: Boolean,
    ) : Update() {
        override fun getConstructor(): Int = 1_669_252_686
    }

    class UpdateChatAction(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageThreadId: Long,
        @JvmField
        val senderId: MessageSender,
        @JvmField
        val action: ChatAction,
    ) : Update() {
        override fun getConstructor(): Int = -1_698_703_832
    }

    class UpdateUserStatus(
        @JvmField
        val userId: Long,
        @JvmField
        val status: UserStatus,
    ) : Update() {
        override fun getConstructor(): Int = 958_468_625
    }

    class UpdateUser(
        @JvmField
        val user: User,
    ) : Update() {
        override fun getConstructor(): Int = 1_183_394_041
    }

    class UpdateBasicGroup(
        @JvmField
        val basicGroup: BasicGroup,
    ) : Update() {
        override fun getConstructor(): Int = -1_003_239_581
    }

    class UpdateSupergroup(
        @JvmField
        val supergroup: Supergroup,
    ) : Update() {
        override fun getConstructor(): Int = -76_782_300
    }

    class UpdateSecretChat(
        @JvmField
        val secretChat: SecretChat,
    ) : Update() {
        override fun getConstructor(): Int = -1_666_903_253
    }

    class UpdateUserFullInfo(
        @JvmField
        val userId: Long,
        @JvmField
        val userFullInfo: UserFullInfo,
    ) : Update() {
        override fun getConstructor(): Int = -51_197_161
    }

    class UpdateBasicGroupFullInfo(
        @JvmField
        val basicGroupId: Long,
        @JvmField
        val basicGroupFullInfo: BasicGroupFullInfo,
    ) : Update() {
        override fun getConstructor(): Int = 1_391_881_151
    }

    class UpdateSupergroupFullInfo(
        @JvmField
        val supergroupId: Long,
        @JvmField
        val supergroupFullInfo: SupergroupFullInfo,
    ) : Update() {
        override fun getConstructor(): Int = 435_539_214
    }

    class UpdateServiceNotification(
        @JvmField
        val type: String,
        @JvmField
        val content: MessageContent,
    ) : Update() {
        override fun getConstructor(): Int = 1_318_622_637
    }

    class UpdateFile(
        @JvmField
        val file: File,
    ) : Update() {
        override fun getConstructor(): Int = 114_132_831
    }

    class UpdateFileGenerationStart(
        @JvmField
        val generationId: Long,
        @JvmField
        val originalPath: String,
        @JvmField
        val destinationPath: String,
        @JvmField
        val conversion: String,
    ) : Update() {
        override fun getConstructor(): Int = 216_817_388
    }

    class UpdateFileGenerationStop(
        @JvmField
        val generationId: Long,
    ) : Update() {
        override fun getConstructor(): Int = -1_894_449_685
    }

    class UpdateFileDownloads(
        @JvmField
        val totalSize: Long,
        @JvmField
        val totalCount: Int,
        @JvmField
        val downloadedSize: Long,
    ) : Update() {
        override fun getConstructor(): Int = -389_213_497
    }

    class UpdateFileAddedToDownloads(
        @JvmField
        val fileDownload: FileDownload,
        @JvmField
        val counts: DownloadedFileCounts,
    ) : Update() {
        override fun getConstructor(): Int = 1_609_929_242
    }

    class UpdateFileDownload(
        @JvmField
        val fileId: Int,
        @JvmField
        val completeDate: Int,
        @JvmField
        val isPaused: Boolean,
        @JvmField
        val counts: DownloadedFileCounts,
    ) : Update() {
        override fun getConstructor(): Int = 875_529_162
    }

    class UpdateFileRemovedFromDownloads(
        @JvmField
        val fileId: Int,
        @JvmField
        val counts: DownloadedFileCounts,
    ) : Update() {
        override fun getConstructor(): Int = 1_853_625_576
    }

    class UpdateApplicationVerificationRequired(
        @JvmField
        val verificationId: Long,
        @JvmField
        val nonce: String,
        @JvmField
        val cloudProjectNumber: Long,
    ) : Update() {
        override fun getConstructor(): Int = -979_607_081
    }

    class UpdateApplicationRecaptchaVerificationRequired(
        @JvmField
        val verificationId: Long,
        @JvmField
        val action: String,
        @JvmField
        val recaptchaKeyId: String,
    ) : Update() {
        override fun getConstructor(): Int = -1_796_351_554
    }

    class UpdateCall(
        @JvmField
        val call: Call,
    ) : Update() {
        override fun getConstructor(): Int = 1_337_184_477
    }

    class UpdateGroupCall(
        @JvmField
        val groupCall: GroupCall,
    ) : Update() {
        override fun getConstructor(): Int = 808_603_136
    }

    class UpdateGroupCallParticipant(
        @JvmField
        val groupCallId: Int,
        @JvmField
        val participant: GroupCallParticipant,
    ) : Update() {
        override fun getConstructor(): Int = -803_128_071
    }

    class UpdateGroupCallParticipants(
        @JvmField
        val groupCallId: Int,
        @JvmField
        val participantUserIds: LongArray,
    ) : Update() {
        override fun getConstructor(): Int = -1_874_006_374
    }

    class UpdateGroupCallVerificationState(
        @JvmField
        val groupCallId: Int,
        @JvmField
        val generation: Int,
        @JvmField
        val emojis: Array<String>,
    ) : Update() {
        override fun getConstructor(): Int = 682_965_060
    }

    class UpdateNewCallSignalingData(
        @JvmField
        val callId: Int,
        @JvmField
        val data: ByteArray,
    ) : Update() {
        override fun getConstructor(): Int = 583_634_317
    }

    class UpdateUserPrivacySettingRules(
        @JvmField
        val setting: UserPrivacySetting,
        @JvmField
        val rules: UserPrivacySettingRules,
    ) : Update() {
        override fun getConstructor(): Int = -912_960_778
    }

    class UpdateUnreadMessageCount(
        @JvmField
        val chatList: ChatList,
        @JvmField
        val unreadCount: Int,
        @JvmField
        val unreadUnmutedCount: Int,
    ) : Update() {
        override fun getConstructor(): Int = 78_987_721
    }

    class UpdateUnreadChatCount(
        @JvmField
        val chatList: ChatList,
        @JvmField
        val totalCount: Int,
        @JvmField
        val unreadCount: Int,
        @JvmField
        val unreadUnmutedCount: Int,
        @JvmField
        val markedAsUnreadCount: Int,
        @JvmField
        val markedAsUnreadUnmutedCount: Int,
    ) : Update() {
        override fun getConstructor(): Int = 1_994_494_530
    }

    class UpdateStory(
        @JvmField
        val story: Story,
    ) : Update() {
        override fun getConstructor(): Int = 419_845_935
    }

    class UpdateStoryDeleted(
        @JvmField
        val storyPosterChatId: Long,
        @JvmField
        val storyId: Int,
    ) : Update() {
        override fun getConstructor(): Int = -582_743_166
    }

    class UpdateStoryPostSucceeded(
        @JvmField
        val story: Story,
        @JvmField
        val oldStoryId: Int,
    ) : Update() {
        override fun getConstructor(): Int = -1_712_432_318
    }

    class UpdateStoryPostFailed(
        @JvmField
        val story: Story,
        @JvmField
        val error: Error,
        @JvmField
        val errorType: CanPostStoryResult?,
    ) : Update() {
        override fun getConstructor(): Int = 1_248_168_444
    }

    class UpdateChatActiveStories(
        @JvmField
        val activeStories: ChatActiveStories,
    ) : Update() {
        override fun getConstructor(): Int = 2_037_935_148
    }

    class UpdateStoryListChatCount(
        @JvmField
        val storyList: StoryList,
        @JvmField
        val chatCount: Int,
    ) : Update() {
        override fun getConstructor(): Int = -2_009_871_041
    }

    class UpdateStoryStealthMode(
        @JvmField
        val activeUntilDate: Int,
        @JvmField
        val cooldownUntilDate: Int,
    ) : Update() {
        override fun getConstructor(): Int = 1_878_506_778
    }

    class UpdateOption(
        @JvmField
        val name: String,
        @JvmField
        val value: OptionValue,
    ) : Update() {
        override fun getConstructor(): Int = 900_822_020
    }

    class UpdateStickerSet(
        @JvmField
        val stickerSet: StickerSet,
    ) : Update() {
        override fun getConstructor(): Int = 1_879_268_812
    }

    class UpdateInstalledStickerSets(
        @JvmField
        val stickerType: StickerType,
        @JvmField
        val stickerSetIds: LongArray,
    ) : Update() {
        override fun getConstructor(): Int = -1_735_084_182
    }

    class UpdateTrendingStickerSets(
        @JvmField
        val stickerType: StickerType,
        @JvmField
        val stickerSets: TrendingStickerSets,
    ) : Update() {
        override fun getConstructor(): Int = 1_266_307_239
    }

    class UpdateRecentStickers(
        @JvmField
        val isAttached: Boolean,
        @JvmField
        val stickerIds: IntArray,
    ) : Update() {
        override fun getConstructor(): Int = 1_906_403_540
    }

    class UpdateFavoriteStickers(
        @JvmField
        val stickerIds: IntArray,
    ) : Update() {
        override fun getConstructor(): Int = 1_662_240_999
    }

    class UpdateSavedAnimations(
        @JvmField
        val animationIds: IntArray,
    ) : Update() {
        override fun getConstructor(): Int = 65_563_814
    }

    class UpdateSavedNotificationSounds(
        @JvmField
        val notificationSoundIds: LongArray,
    ) : Update() {
        override fun getConstructor(): Int = 1_052_725_698
    }

    class UpdateDefaultBackground(
        @JvmField
        val forDarkTheme: Boolean,
        @JvmField
        val background: Background?,
    ) : Update() {
        override fun getConstructor(): Int = -716_139_217
    }

    class UpdateChatThemes(
        @JvmField
        val chatThemes: Array<ChatTheme>,
    ) : Update() {
        override fun getConstructor(): Int = -1_588_098_376
    }

    class UpdateAccentColors(
        @JvmField
        val colors: Array<AccentColor>,
        @JvmField
        val availableAccentColorIds: IntArray,
    ) : Update() {
        override fun getConstructor(): Int = -1_197_047_738
    }

    class UpdateProfileAccentColors(
        @JvmField
        val colors: Array<ProfileAccentColor>,
        @JvmField
        val availableAccentColorIds: IntArray,
    ) : Update() {
        override fun getConstructor(): Int = 605_202_104
    }

    class UpdateLanguagePackStrings(
        @JvmField
        val localizationTarget: String,
        @JvmField
        val languagePackId: String,
        @JvmField
        val strings: Array<LanguagePackString>,
    ) : Update() {
        override fun getConstructor(): Int = -1_056_319_886
    }

    class UpdateConnectionState(
        @JvmField
        val state: ConnectionState,
    ) : Update() {
        override fun getConstructor(): Int = 1_469_292_078
    }

    class UpdateFreezeState(
        @JvmField
        val isFrozen: Boolean,
        @JvmField
        val freezingDate: Int,
        @JvmField
        val deletionDate: Int,
        @JvmField
        val appealLink: String,
    ) : Update() {
        override fun getConstructor(): Int = 1_692_410_540
    }

    class UpdateTermsOfService(
        @JvmField
        val termsOfServiceId: String,
        @JvmField
        val termsOfService: TermsOfService,
    ) : Update() {
        override fun getConstructor(): Int = -1_304_640_162
    }

    class UpdateUnconfirmedSession(
        @JvmField
        val session: UnconfirmedSession?,
    ) : Update() {
        override fun getConstructor(): Int = -22_673_268
    }

    class UpdateAttachmentMenuBots(
        @JvmField
        val bots: Array<AttachmentMenuBot>,
    ) : Update() {
        override fun getConstructor(): Int = 291_369_922
    }

    class UpdateWebAppMessageSent(
        @JvmField
        val webAppLaunchId: Long,
    ) : Update() {
        override fun getConstructor(): Int = 1_480_790_569
    }

    class UpdateActiveEmojiReactions(
        @JvmField
        val emojis: Array<String>,
    ) : Update() {
        override fun getConstructor(): Int = 77_556_818
    }

    class UpdateAvailableMessageEffects(
        @JvmField
        val reactionEffectIds: LongArray,
        @JvmField
        val stickerEffectIds: LongArray,
    ) : Update() {
        override fun getConstructor(): Int = 1_964_701_061
    }

    class UpdateDefaultReactionType(
        @JvmField
        val reactionType: ReactionType,
    ) : Update() {
        override fun getConstructor(): Int = 1_264_668_933
    }

    class UpdateDefaultPaidReactionType(
        @JvmField
        val type: PaidReactionType,
    ) : Update() {
        override fun getConstructor(): Int = 38_198_599
    }

    class UpdateSavedMessagesTags(
        @JvmField
        val savedMessagesTopicId: Long,
        @JvmField
        val tags: SavedMessagesTags,
    ) : Update() {
        override fun getConstructor(): Int = 1_938_178_634
    }

    class UpdateActiveLiveLocationMessages(
        @JvmField
        val messages: Array<Message>,
    ) : Update() {
        override fun getConstructor(): Int = -1_308_142_440
    }

    class UpdateOwnedStarCount(
        @JvmField
        val starAmount: StarAmount,
    ) : Update() {
        override fun getConstructor(): Int = -1_350_647_928
    }

    class UpdateChatRevenueAmount(
        @JvmField
        val chatId: Long,
        @JvmField
        val revenueAmount: ChatRevenueAmount,
    ) : Update() {
        override fun getConstructor(): Int = -959_857_468
    }

    class UpdateStarRevenueStatus(
        @JvmField
        val ownerId: MessageSender,
        @JvmField
        val status: StarRevenueStatus,
    ) : Update() {
        override fun getConstructor(): Int = -280_232_757
    }

    class UpdateSpeechRecognitionTrial(
        @JvmField
        val maxMediaDuration: Int,
        @JvmField
        val weeklyCount: Int,
        @JvmField
        val leftCount: Int,
        @JvmField
        val nextResetDate: Int,
    ) : Update() {
        override fun getConstructor(): Int = -11_600_703
    }

    class UpdateDiceEmojis(
        @JvmField
        val emojis: Array<String>,
    ) : Update() {
        override fun getConstructor(): Int = -1_069_066_940
    }

    class UpdateAnimatedEmojiMessageClicked(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val sticker: Sticker,
    ) : Update() {
        override fun getConstructor(): Int = -1_558_809_595
    }

    class UpdateAnimationSearchParameters(
        @JvmField
        val provider: String,
        @JvmField
        val emojis: Array<String>,
    ) : Update() {
        override fun getConstructor(): Int = -1_144_983_202
    }

    class UpdateSuggestedActions(
        @JvmField
        val addedActions: Array<SuggestedAction>,
        @JvmField
        val removedActions: Array<SuggestedAction>,
    ) : Update() {
        override fun getConstructor(): Int = 1_459_452_346
    }

    class UpdateSpeedLimitNotification(
        @JvmField
        val isUpload: Boolean,
    ) : Update() {
        override fun getConstructor(): Int = -964_437_912
    }

    class UpdateContactCloseBirthdays(
        @JvmField
        val closeBirthdayUsers: Array<CloseBirthdayUser>,
    ) : Update() {
        override fun getConstructor(): Int = -36_007_873
    }

    class UpdateAutosaveSettings(
        @JvmField
        val scope: AutosaveSettingsScope,
        @JvmField
        val settings: ScopeAutosaveSettings?,
    ) : Update() {
        override fun getConstructor(): Int = -634_958_069
    }

    class UpdateBusinessConnection(
        @JvmField
        val connection: BusinessConnection,
    ) : Update() {
        override fun getConstructor(): Int = -2_043_480_970
    }

    class UpdateNewBusinessMessage(
        @JvmField
        val connectionId: String,
        @JvmField
        val message: BusinessMessage,
    ) : Update() {
        override fun getConstructor(): Int = -2_034_350_524
    }

    class UpdateBusinessMessageEdited(
        @JvmField
        val connectionId: String,
        @JvmField
        val message: BusinessMessage,
    ) : Update() {
        override fun getConstructor(): Int = -2_119_799_415
    }

    class UpdateBusinessMessagesDeleted(
        @JvmField
        val connectionId: String,
        @JvmField
        val chatId: Long,
        @JvmField
        val messageIds: LongArray,
    ) : Update() {
        override fun getConstructor(): Int = -1_106_703_050
    }

    class UpdateNewInlineQuery(
        @JvmField
        val id: Long,
        @JvmField
        val senderUserId: Long,
        @JvmField
        val userLocation: Location?,
        @JvmField
        val chatType: ChatType?,
        @JvmField
        val query: String,
        @JvmField
        val offset: String,
    ) : Update() {
        override fun getConstructor(): Int = 1_903_279_924
    }

    class UpdateNewChosenInlineResult(
        @JvmField
        val senderUserId: Long,
        @JvmField
        val userLocation: Location?,
        @JvmField
        val query: String,
        @JvmField
        val resultId: String,
        @JvmField
        val inlineMessageId: String,
    ) : Update() {
        override fun getConstructor(): Int = -884_191_395
    }

    class UpdateNewCallbackQuery(
        @JvmField
        val id: Long,
        @JvmField
        val senderUserId: Long,
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val chatInstance: Long,
        @JvmField
        val payload: CallbackQueryPayload,
    ) : Update() {
        override fun getConstructor(): Int = -1_989_881_762
    }

    class UpdateNewInlineCallbackQuery(
        @JvmField
        val id: Long,
        @JvmField
        val senderUserId: Long,
        @JvmField
        val inlineMessageId: String,
        @JvmField
        val chatInstance: Long,
        @JvmField
        val payload: CallbackQueryPayload,
    ) : Update() {
        override fun getConstructor(): Int = -319_212_358
    }

    class UpdateNewBusinessCallbackQuery(
        @JvmField
        val id: Long,
        @JvmField
        val senderUserId: Long,
        @JvmField
        val connectionId: String,
        @JvmField
        val message: BusinessMessage,
        @JvmField
        val chatInstance: Long,
        @JvmField
        val payload: CallbackQueryPayload,
    ) : Update() {
        override fun getConstructor(): Int = 336_745_316
    }

    class UpdateNewShippingQuery(
        @JvmField
        val id: Long,
        @JvmField
        val senderUserId: Long,
        @JvmField
        val invoicePayload: String,
        @JvmField
        val shippingAddress: Address,
    ) : Update() {
        override fun getConstructor(): Int = 693_651_058
    }

    class UpdateNewPreCheckoutQuery(
        @JvmField
        val id: Long,
        @JvmField
        val senderUserId: Long,
        @JvmField
        val currency: String,
        @JvmField
        val totalAmount: Long,
        @JvmField
        val invoicePayload: ByteArray,
        @JvmField
        val shippingOptionId: String,
        @JvmField
        val orderInfo: OrderInfo?,
    ) : Update() {
        override fun getConstructor(): Int = 708_342_217
    }

    class UpdateNewCustomEvent(
        @JvmField
        val event: String,
    ) : Update() {
        override fun getConstructor(): Int = 1_994_222_092
    }

    class UpdateNewCustomQuery(
        @JvmField
        val id: Long,
        @JvmField
        val data: String,
        @JvmField
        val timeout: Int,
    ) : Update() {
        override fun getConstructor(): Int = -687_670_874
    }

    class UpdatePoll(
        @JvmField
        val poll: Poll,
    ) : Update() {
        override fun getConstructor(): Int = -1_771_342_902
    }

    class UpdatePollAnswer(
        @JvmField
        val pollId: Long,
        @JvmField
        val voterId: MessageSender,
        @JvmField
        val optionIds: IntArray,
    ) : Update() {
        override fun getConstructor(): Int = 1_104_905_219
    }

    class UpdateChatMember(
        @JvmField
        val chatId: Long,
        @JvmField
        val actorUserId: Long,
        @JvmField
        val date: Int,
        @JvmField
        val inviteLink: ChatInviteLink?,
        @JvmField
        val viaJoinRequest: Boolean,
        @JvmField
        val viaChatFolderInviteLink: Boolean,
        @JvmField
        val oldChatMember: ChatMember,
        @JvmField
        val newChatMember: ChatMember,
    ) : Update() {
        override fun getConstructor(): Int = -1_736_025_145
    }

    class UpdateNewChatJoinRequest(
        @JvmField
        val chatId: Long,
        @JvmField
        val request: ChatJoinRequest,
        @JvmField
        val userChatId: Long,
        @JvmField
        val inviteLink: ChatInviteLink?,
    ) : Update() {
        override fun getConstructor(): Int = 2_118_694_979
    }

    class UpdateChatBoost(
        @JvmField
        val chatId: Long,
        @JvmField
        val boost: ChatBoost,
    ) : Update() {
        override fun getConstructor(): Int = 1_349_680_676
    }

    class UpdateMessageReaction(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val actorId: MessageSender,
        @JvmField
        val date: Int,
        @JvmField
        val oldReactionTypes: Array<ReactionType>,
        @JvmField
        val newReactionTypes: Array<ReactionType>,
    ) : Update() {
        override fun getConstructor(): Int = 1_084_895_706
    }

    class UpdateMessageReactions(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val date: Int,
        @JvmField
        val reactions: Array<MessageReaction>,
    ) : Update() {
        override fun getConstructor(): Int = 955_237_189
    }

    class UpdatePaidMediaPurchased(
        @JvmField
        val userId: Long,
        @JvmField
        val payload: String,
    ) : Update() {
        override fun getConstructor(): Int = -1_542_396_325
    }

    class Updates(
        @JvmField
        val updates: Array<Update>,
    ) : Object() {
        override fun getConstructor(): Int = 475_842_347
    }

    class UpgradeGiftResult(
        @JvmField
        val gift: UpgradedGift,
        @JvmField
        val receivedGiftId: String,
        @JvmField
        val isSaved: Boolean,
        @JvmField
        val canBeTransferred: Boolean,
        @JvmField
        val transferStarCount: Long,
        @JvmField
        val nextTransferDate: Int,
        @JvmField
        val nextResaleDate: Int,
        @JvmField
        val exportDate: Int,
    ) : Object() {
        override fun getConstructor(): Int = 233_376_346
    }

    class UpgradedGift(
        @JvmField
        val id: Long,
        @JvmField
        val title: String,
        @JvmField
        val name: String,
        @JvmField
        val number: Int,
        @JvmField
        val totalUpgradedCount: Int,
        @JvmField
        val maxUpgradedCount: Int,
        @JvmField
        val ownerId: MessageSender?,
        @JvmField
        val ownerAddress: String,
        @JvmField
        val ownerName: String,
        @JvmField
        val giftAddress: String,
        @JvmField
        val model: UpgradedGiftModel,
        @JvmField
        val symbol: UpgradedGiftSymbol,
        @JvmField
        val backdrop: UpgradedGiftBackdrop,
        @JvmField
        val originalDetails: UpgradedGiftOriginalDetails?,
        @JvmField
        val resaleStarCount: Long,
    ) : Object() {
        override fun getConstructor(): Int = 992_832_410
    }

    abstract class UpgradedGiftAttributeId : Object()

    class UpgradedGiftAttributeIdModel(
        @JvmField
        val stickerId: Long,
    ) : UpgradedGiftAttributeId() {
        override fun getConstructor(): Int = 1_053_287_307
    }

    class UpgradedGiftAttributeIdSymbol(
        @JvmField
        val stickerId: Long,
    ) : UpgradedGiftAttributeId() {
        override fun getConstructor(): Int = 1_188_205_608
    }

    class UpgradedGiftAttributeIdBackdrop(
        @JvmField
        val backdropId: Int,
    ) : UpgradedGiftAttributeId() {
        override fun getConstructor(): Int = 1_461_997_935
    }

    class UpgradedGiftBackdrop(
        @JvmField
        val id: Int,
        @JvmField
        val name: String,
        @JvmField
        val colors: UpgradedGiftBackdropColors,
        @JvmField
        val rarityPerMille: Int,
    ) : Object() {
        override fun getConstructor(): Int = -378_289_242
    }

    class UpgradedGiftBackdropColors(
        @JvmField
        val centerColor: Int,
        @JvmField
        val edgeColor: Int,
        @JvmField
        val symbolColor: Int,
        @JvmField
        val textColor: Int,
    ) : Object() {
        override fun getConstructor(): Int = 4_227_529
    }

    class UpgradedGiftBackdropCount(
        @JvmField
        val backdrop: UpgradedGiftBackdrop,
        @JvmField
        val totalCount: Int,
    ) : Object() {
        override fun getConstructor(): Int = -562_274_120
    }

    class UpgradedGiftModel(
        @JvmField
        val name: String,
        @JvmField
        val sticker: Sticker,
        @JvmField
        val rarityPerMille: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_360_156_751
    }

    class UpgradedGiftModelCount(
        @JvmField
        val model: UpgradedGiftModel,
        @JvmField
        val totalCount: Int,
    ) : Object() {
        override fun getConstructor(): Int = -1_127_238_023
    }

    class UpgradedGiftOriginalDetails(
        @JvmField
        val senderId: MessageSender?,
        @JvmField
        val receiverId: MessageSender,
        @JvmField
        val text: FormattedText,
        @JvmField
        val date: Int,
    ) : Object() {
        override fun getConstructor(): Int = 55_247_728
    }

    class UpgradedGiftSymbol(
        @JvmField
        val name: String,
        @JvmField
        val sticker: Sticker,
        @JvmField
        val rarityPerMille: Int,
    ) : Object() {
        override fun getConstructor(): Int = 1_128_318_383
    }

    class UpgradedGiftSymbolCount(
        @JvmField
        val symbol: UpgradedGiftSymbol,
        @JvmField
        val totalCount: Int,
    ) : Object() {
        override fun getConstructor(): Int = -773_579_874
    }

    class User(
        @JvmField
        val id: Long,
        @JvmField
        val firstName: String,
        @JvmField
        val lastName: String,
        @JvmField
        val usernames: Usernames?,
        @JvmField
        val phoneNumber: String,
        @JvmField
        val status: UserStatus,
        @JvmField
        val profilePhoto: ProfilePhoto?,
        @JvmField
        val accentColorId: Int,
        @JvmField
        val backgroundCustomEmojiId: Long,
        @JvmField
        val profileAccentColorId: Int,
        @JvmField
        val profileBackgroundCustomEmojiId: Long,
        @JvmField
        val emojiStatus: EmojiStatus?,
        @JvmField
        val isContact: Boolean,
        @JvmField
        val isMutualContact: Boolean,
        @JvmField
        val isCloseFriend: Boolean,
        @JvmField
        val verificationStatus: VerificationStatus?,
        @JvmField
        val isPremium: Boolean,
        @JvmField
        val isSupport: Boolean,
        @JvmField
        val restrictionReason: String,
        @JvmField
        val hasActiveStories: Boolean,
        @JvmField
        val hasUnreadActiveStories: Boolean,
        @JvmField
        val restrictsNewChats: Boolean,
        @JvmField
        val paidMessageStarCount: Long,
        @JvmField
        val haveAccess: Boolean,
        @JvmField
        val type: UserType,
        @JvmField
        val languageCode: String,
        @JvmField
        val addedToAttachmentMenu: Boolean,
    ) : Object() {
        override fun getConstructor(): Int = -1_848_524_366
    }

    class UserFullInfo(
        @JvmField
        val personalPhoto: ChatPhoto?,
        @JvmField
        val photo: ChatPhoto?,
        @JvmField
        val publicPhoto: ChatPhoto?,
        @JvmField
        val blockList: BlockList?,
        @JvmField
        val canBeCalled: Boolean,
        @JvmField
        val supportsVideoCalls: Boolean,
        @JvmField
        val hasPrivateCalls: Boolean,
        @JvmField
        val hasPrivateForwards: Boolean,
        @JvmField
        val hasRestrictedVoiceAndVideoNoteMessages: Boolean,
        @JvmField
        val hasPostedToProfileStories: Boolean,
        @JvmField
        val hasSponsoredMessagesEnabled: Boolean,
        @JvmField
        val needPhoneNumberPrivacyException: Boolean,
        @JvmField
        val setChatBackground: Boolean,
        @JvmField
        val bio: FormattedText?,
        @JvmField
        val birthdate: Birthdate?,
        @JvmField
        val personalChatId: Long,
        @JvmField
        val giftCount: Int,
        @JvmField
        val groupInCommonCount: Int,
        @JvmField
        val incomingPaidMessageStarCount: Long,
        @JvmField
        val outgoingPaidMessageStarCount: Long,
        @JvmField
        val giftSettings: GiftSettings,
        @JvmField
        val botVerification: BotVerification?,
        @JvmField
        val businessInfo: BusinessInfo?,
        @JvmField
        val botInfo: BotInfo?,
    ) : Object() {
        override fun getConstructor(): Int = -121_173_496
    }

    class UserLink(
        @JvmField
        val url: String,
        @JvmField
        val expiresIn: Int,
    ) : Object() {
        override fun getConstructor(): Int = 498_138_872
    }

    abstract class UserPrivacySetting : Object()

    class UserPrivacySettingShowStatus : UserPrivacySetting() {
        override fun getConstructor(): Int = 1_862_829_310
    }

    class UserPrivacySettingShowProfilePhoto : UserPrivacySetting() {
        override fun getConstructor(): Int = 1_408_485_877
    }

    class UserPrivacySettingShowLinkInForwardedMessages : UserPrivacySetting() {
        override fun getConstructor(): Int = 592_688_870
    }

    class UserPrivacySettingShowPhoneNumber : UserPrivacySetting() {
        override fun getConstructor(): Int = -791_567_831
    }

    class UserPrivacySettingShowBio : UserPrivacySetting() {
        override fun getConstructor(): Int = 959_981_409
    }

    class UserPrivacySettingShowBirthdate : UserPrivacySetting() {
        override fun getConstructor(): Int = 1_167_504_607
    }

    class UserPrivacySettingAllowChatInvites : UserPrivacySetting() {
        override fun getConstructor(): Int = 1_271_668_007
    }

    class UserPrivacySettingAllowCalls : UserPrivacySetting() {
        override fun getConstructor(): Int = -906_967_291
    }

    class UserPrivacySettingAllowPeerToPeerCalls : UserPrivacySetting() {
        override fun getConstructor(): Int = 352_500_032
    }

    class UserPrivacySettingAllowFindingByPhoneNumber : UserPrivacySetting() {
        override fun getConstructor(): Int = -1_846_645_423
    }

    class UserPrivacySettingAllowPrivateVoiceAndVideoNoteMessages : UserPrivacySetting() {
        override fun getConstructor(): Int = 338_112_060
    }

    class UserPrivacySettingAutosaveGifts : UserPrivacySetting() {
        override fun getConstructor(): Int = 1_889_167_821
    }

    class UserPrivacySettingAllowUnpaidMessages : UserPrivacySetting() {
        override fun getConstructor(): Int = 1_430_051_047
    }

    abstract class UserPrivacySettingRule : Object()

    class UserPrivacySettingRuleAllowAll : UserPrivacySettingRule() {
        override fun getConstructor(): Int = -1_967_186_881
    }

    class UserPrivacySettingRuleAllowContacts : UserPrivacySettingRule() {
        override fun getConstructor(): Int = -1_892_733_680
    }

    class UserPrivacySettingRuleAllowBots : UserPrivacySettingRule() {
        override fun getConstructor(): Int = 1_404_208_925
    }

    class UserPrivacySettingRuleAllowPremiumUsers : UserPrivacySettingRule() {
        override fun getConstructor(): Int = 1_624_147_265
    }

    class UserPrivacySettingRuleAllowUsers(
        @JvmField
        val userIds: LongArray,
    ) : UserPrivacySettingRule() {
        override fun getConstructor(): Int = 1_110_988_334
    }

    class UserPrivacySettingRuleAllowChatMembers(
        @JvmField
        val chatIds: LongArray,
    ) : UserPrivacySettingRule() {
        override fun getConstructor(): Int = -2_048_749_863
    }

    class UserPrivacySettingRuleRestrictAll : UserPrivacySettingRule() {
        override fun getConstructor(): Int = -1_406_495_408
    }

    class UserPrivacySettingRuleRestrictContacts : UserPrivacySettingRule() {
        override fun getConstructor(): Int = 1_008_389_378
    }

    class UserPrivacySettingRuleRestrictBots : UserPrivacySettingRule() {
        override fun getConstructor(): Int = -1_902_547_363
    }

    class UserPrivacySettingRuleRestrictUsers(
        @JvmField
        val userIds: LongArray,
    ) : UserPrivacySettingRule() {
        override fun getConstructor(): Int = 622_796_522
    }

    class UserPrivacySettingRuleRestrictChatMembers(
        @JvmField
        val chatIds: LongArray,
    ) : UserPrivacySettingRule() {
        override fun getConstructor(): Int = 392_530_897
    }

    class UserPrivacySettingRules(
        @JvmField
        val rules: Array<UserPrivacySettingRule>,
    ) : Object() {
        override fun getConstructor(): Int = 322_477_541
    }

    abstract class UserStatus : Object()

    class UserStatusEmpty : UserStatus() {
        override fun getConstructor(): Int = 164_646_985
    }

    class UserStatusOnline(
        @JvmField
        val expires: Int,
    ) : UserStatus() {
        override fun getConstructor(): Int = -1_529_460_876
    }

    class UserStatusOffline(
        @JvmField
        val wasOnline: Int,
    ) : UserStatus() {
        override fun getConstructor(): Int = -759_984_891
    }

    class UserStatusRecently(
        @JvmField
        val byMyPrivacySettings: Boolean,
    ) : UserStatus() {
        override fun getConstructor(): Int = 262_824_117
    }

    class UserStatusLastWeek(
        @JvmField
        val byMyPrivacySettings: Boolean,
    ) : UserStatus() {
        override fun getConstructor(): Int = 310_385_495
    }

    class UserStatusLastMonth(
        @JvmField
        val byMyPrivacySettings: Boolean,
    ) : UserStatus() {
        override fun getConstructor(): Int = -1_194_644_996
    }

    class UserSupportInfo(
        @JvmField
        val message: FormattedText,
        @JvmField
        val author: String,
        @JvmField
        val date: Int,
    ) : Object() {
        override fun getConstructor(): Int = -1_257_366_487
    }

    abstract class UserType : Object()

    class UserTypeRegular : UserType() {
        override fun getConstructor(): Int = -598_644_325
    }

    class UserTypeDeleted : UserType() {
        override fun getConstructor(): Int = -1_807_729_372
    }

    class UserTypeBot(
        @JvmField
        val canBeEdited: Boolean,
        @JvmField
        val canJoinGroups: Boolean,
        @JvmField
        val canReadAllGroupMessages: Boolean,
        @JvmField
        val hasMainWebApp: Boolean,
        @JvmField
        val isInline: Boolean,
        @JvmField
        val inlineQueryPlaceholder: String,
        @JvmField
        val needLocation: Boolean,
        @JvmField
        val canConnectToBusiness: Boolean,
        @JvmField
        val canBeAddedToAttachmentMenu: Boolean,
        @JvmField
        val activeUserCount: Int,
    ) : UserType() {
        override fun getConstructor(): Int = -1_952_199_642
    }

    class UserTypeUnknown : UserType() {
        override fun getConstructor(): Int = -724_541_123
    }

    class Usernames(
        @JvmField
        val activeUsernames: Array<String>,
        @JvmField
        val disabledUsernames: Array<String>,
        @JvmField
        val editableUsername: String,
    ) : Object() {
        override fun getConstructor(): Int = 799_608_565
    }

    class Users(
        @JvmField
        val totalCount: Int,
        @JvmField
        val userIds: LongArray,
    ) : Object() {
        override fun getConstructor(): Int = 171_203_420
    }

    class ValidatedOrderInfo(
        @JvmField
        val orderInfoId: String,
        @JvmField
        val shippingOptions: Array<ShippingOption>,
    ) : Object() {
        override fun getConstructor(): Int = 1_511_451_484
    }

    abstract class VectorPathCommand : Object()

    class VectorPathCommandLine(
        @JvmField
        val endPoint: Point,
    ) : VectorPathCommand() {
        override fun getConstructor(): Int = -614_056_822
    }

    class VectorPathCommandCubicBezierCurve(
        @JvmField
        val startControlPoint: Point,
        @JvmField
        val endControlPoint: Point,
        @JvmField
        val endPoint: Point,
    ) : VectorPathCommand() {
        override fun getConstructor(): Int = 1_229_733_434
    }

    class Venue(
        @JvmField
        val location: Location,
        @JvmField
        val title: String,
        @JvmField
        val address: String,
        @JvmField
        val provider: String,
        @JvmField
        val id: String,
        @JvmField
        val type: String,
    ) : Object() {
        override fun getConstructor(): Int = 1_070_406_393
    }

    class VerificationStatus(
        @JvmField
        val isVerified: Boolean,
        @JvmField
        val isScam: Boolean,
        @JvmField
        val isFake: Boolean,
        @JvmField
        val botVerificationIconCustomEmojiId: Long,
    ) : Object() {
        override fun getConstructor(): Int = 988_193_164
    }

    class Video(
        @JvmField
        val duration: Int,
        @JvmField
        val width: Int,
        @JvmField
        val height: Int,
        @JvmField
        val fileName: String,
        @JvmField
        val mimeType: String,
        @JvmField
        val hasStickers: Boolean,
        @JvmField
        val supportsStreaming: Boolean,
        @JvmField
        val minithumbnail: Minithumbnail?,
        @JvmField
        val thumbnail: Thumbnail?,
        @JvmField
        val video: File,
    ) : Object() {
        override fun getConstructor(): Int = 832_856_268
    }

    class VideoChat(
        @JvmField
        val groupCallId: Int,
        @JvmField
        val hasParticipants: Boolean,
        @JvmField
        val defaultParticipantId: MessageSender?,
    ) : Object() {
        override fun getConstructor(): Int = -1_374_319_320
    }

    class VideoChatStream(
        @JvmField
        val channelId: Int,
        @JvmField
        val scale: Int,
        @JvmField
        val timeOffset: Long,
    ) : Object() {
        override fun getConstructor(): Int = -1_151_707_172
    }

    class VideoChatStreams(
        @JvmField
        val streams: Array<VideoChatStream>,
    ) : Object() {
        override fun getConstructor(): Int = -434_622_720
    }

    class VideoMessageAdvertisement(
        @JvmField
        val uniqueId: Long,
        @JvmField
        val text: String,
        @JvmField
        val minDisplayDuration: Int,
        @JvmField
        val maxDisplayDuration: Int,
        @JvmField
        val canBeReported: Boolean,
        @JvmField
        val sponsor: AdvertisementSponsor,
        @JvmField
        val title: String,
        @JvmField
        val additionalInfo: String,
    ) : Object() {
        override fun getConstructor(): Int = -112_391_535
    }

    class VideoMessageAdvertisements(
        @JvmField
        val advertisements: Array<VideoMessageAdvertisement>,
        @JvmField
        val startDelay: Int,
        @JvmField
        val betweenDelay: Int,
    ) : Object() {
        override fun getConstructor(): Int = -1_776_370_217
    }

    class VideoNote(
        @JvmField
        val duration: Int,
        @JvmField
        val waveform: ByteArray,
        @JvmField
        val length: Int,
        @JvmField
        val minithumbnail: Minithumbnail?,
        @JvmField
        val thumbnail: Thumbnail?,
        @JvmField
        val speechRecognitionResult: SpeechRecognitionResult?,
        @JvmField
        val video: File,
    ) : Object() {
        override fun getConstructor(): Int = 2_062_096_581
    }

    class VideoStoryboard(
        @JvmField
        val storyboardFile: File,
        @JvmField
        val width: Int,
        @JvmField
        val height: Int,
        @JvmField
        val mapFile: File,
    ) : Object() {
        override fun getConstructor(): Int = 1_731_320_034
    }

    class VoiceNote(
        @JvmField
        val duration: Int,
        @JvmField
        val waveform: ByteArray,
        @JvmField
        val mimeType: String,
        @JvmField
        val speechRecognitionResult: SpeechRecognitionResult?,
        @JvmField
        val voice: File,
    ) : Object() {
        override fun getConstructor(): Int = -1_175_302_923
    }

    class WebApp(
        @JvmField
        val shortName: String,
        @JvmField
        val title: String,
        @JvmField
        val description: String,
        @JvmField
        val photo: Photo,
        @JvmField
        val animation: Animation?,
    ) : Object() {
        override fun getConstructor(): Int = 1_616_619_763
    }

    class WebAppInfo(
        @JvmField
        val launchId: Long,
        @JvmField
        val url: String,
    ) : Object() {
        override fun getConstructor(): Int = 788_378_344
    }

    abstract class WebAppOpenMode : Object()

    class WebAppOpenModeCompact : WebAppOpenMode() {
        override fun getConstructor(): Int = 1_711_603_675
    }

    class WebAppOpenModeFullSize : WebAppOpenMode() {
        override fun getConstructor(): Int = 189_320_513
    }

    class WebAppOpenModeFullScreen : WebAppOpenMode() {
        override fun getConstructor(): Int = 1_871_315_357
    }

    class WebAppOpenParameters(
        @JvmField
        val theme: ThemeParameters?,
        @JvmField
        val applicationName: String,
        @JvmField
        val mode: WebAppOpenMode?,
    ) : Object() {
        override fun getConstructor(): Int = 1_375_356_527
    }

    class WebPageInstantView(
        @JvmField
        val pageBlocks: Array<PageBlock>,
        @JvmField
        val viewCount: Int,
        @JvmField
        val version: Int,
        @JvmField
        val isRtl: Boolean,
        @JvmField
        val isFull: Boolean,
        @JvmField
        val feedbackLink: InternalLinkType,
    ) : Object() {
        override fun getConstructor(): Int = 778_202_453
    }

    class AcceptCall(
        @JvmField
        val callId: Int,
        @JvmField
        val protocol: CallProtocol,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -646_618_416
    }

    class AcceptTermsOfService(
        @JvmField
        val termsOfServiceId: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 2_130_576_356
    }

    class ActivateStoryStealthMode : Function<Ok>() {
        override fun getConstructor(): Int = -1_009_023_855
    }

    class AddBotMediaPreview(
        @JvmField
        val botUserId: Long,
        @JvmField
        val languageCode: String,
        @JvmField
        val content: InputStoryContent,
    ) : Function<BotMediaPreview>() {
        override fun getConstructor(): Int = 1_347_126_571
    }

    class AddChatFolderByInviteLink(
        @JvmField
        val inviteLink: String,
        @JvmField
        val chatIds: LongArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -858_593_816
    }

    class AddChatMember(
        @JvmField
        val chatId: Long,
        @JvmField
        val userId: Long,
        @JvmField
        val forwardLimit: Int,
    ) : Function<FailedToAddMembers>() {
        override fun getConstructor(): Int = 1_720_144_407
    }

    class AddChatMembers(
        @JvmField
        val chatId: Long,
        @JvmField
        val userIds: LongArray,
    ) : Function<FailedToAddMembers>() {
        override fun getConstructor(): Int = -1_675_991_329
    }

    class AddChatToList(
        @JvmField
        val chatId: Long,
        @JvmField
        val chatList: ChatList,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -80_523_595
    }

    class AddChecklistTasks(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val tasks: Array<InputChecklistTask>,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_554_619_499
    }

    class AddContact(
        @JvmField
        val contact: Contact,
        @JvmField
        val sharePhoneNumber: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_869_640_000
    }

    class AddCustomServerLanguagePack(
        @JvmField
        val languagePackId: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 4_492_771
    }

    class AddFavoriteSticker(
        @JvmField
        val sticker: InputFile,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 324_504_799
    }

    class AddFileToDownloads(
        @JvmField
        val fileId: Int,
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val priority: Int,
    ) : Function<File>() {
        override fun getConstructor(): Int = 867_533_751
    }

    class AddLocalMessage(
        @JvmField
        val chatId: Long,
        @JvmField
        val senderId: MessageSender,
        @JvmField
        val replyTo: InputMessageReplyTo?,
        @JvmField
        val disableNotification: Boolean,
        @JvmField
        val inputMessageContent: InputMessageContent,
    ) : Function<Message>() {
        override fun getConstructor(): Int = -166_217_823
    }

    class AddLogMessage(
        @JvmField
        val verbosityLevel: Int,
        @JvmField
        val text: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_597_427_692
    }

    class AddMessageReaction(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val reactionType: ReactionType,
        @JvmField
        val isBig: Boolean,
        @JvmField
        val updateRecentReactions: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_419_269_613
    }

    class AddNetworkStatistics(
        @JvmField
        val entry: NetworkStatisticsEntry,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_264_825_305
    }

    class AddPendingPaidMessageReaction(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val starCount: Long,
        @JvmField
        val type: PaidReactionType?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -342_110_765
    }

    class AddProxy(
        @JvmField
        val server: String,
        @JvmField
        val port: Int,
        @JvmField
        val enable: Boolean,
        @JvmField
        val type: ProxyType,
    ) : Function<Proxy>() {
        override fun getConstructor(): Int = 331_529_432
    }

    class AddQuickReplyShortcutInlineQueryResultMessage(
        @JvmField
        val shortcutName: String,
        @JvmField
        val replyToMessageId: Long,
        @JvmField
        val queryId: Long,
        @JvmField
        val resultId: String,
        @JvmField
        val hideViaBot: Boolean,
    ) : Function<QuickReplyMessage>() {
        override fun getConstructor(): Int = -2_017_449_468
    }

    class AddQuickReplyShortcutMessage(
        @JvmField
        val shortcutName: String,
        @JvmField
        val replyToMessageId: Long,
        @JvmField
        val inputMessageContent: InputMessageContent,
    ) : Function<QuickReplyMessage>() {
        override fun getConstructor(): Int = 1_058_573_098
    }

    class AddQuickReplyShortcutMessageAlbum(
        @JvmField
        val shortcutName: String,
        @JvmField
        val replyToMessageId: Long,
        @JvmField
        val inputMessageContents: Array<InputMessageContent>,
    ) : Function<QuickReplyMessages>() {
        override fun getConstructor(): Int = 1_348_436_244
    }

    class AddRecentSticker(
        @JvmField
        val isAttached: Boolean,
        @JvmField
        val sticker: InputFile,
    ) : Function<Stickers>() {
        override fun getConstructor(): Int = -1_478_109_026
    }

    class AddRecentlyFoundChat(
        @JvmField
        val chatId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_746_396_787
    }

    class AddSavedAnimation(
        @JvmField
        val animation: InputFile,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_538_525_088
    }

    class AddSavedNotificationSound(
        @JvmField
        val sound: InputFile,
    ) : Function<NotificationSound>() {
        override fun getConstructor(): Int = 1_043_956_975
    }

    class AddStickerToSet(
        @JvmField
        val userId: Long,
        @JvmField
        val name: String,
        @JvmField
        val sticker: InputSticker,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_457_266_235
    }

    class AllowBotToSendMessages(
        @JvmField
        val botUserId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_776_928_142
    }

    class AllowUnpaidMessagesFromUser(
        @JvmField
        val userId: Long,
        @JvmField
        val refundPayments: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 803_569_495
    }

    class AnswerCallbackQuery(
        @JvmField
        val callbackQueryId: Long,
        @JvmField
        val text: String,
        @JvmField
        val showAlert: Boolean,
        @JvmField
        val url: String,
        @JvmField
        val cacheTime: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_153_028_490
    }

    class AnswerCustomQuery(
        @JvmField
        val customQueryId: Long,
        @JvmField
        val data: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_293_603_521
    }

    class AnswerInlineQuery(
        @JvmField
        val inlineQueryId: Long,
        @JvmField
        val isPersonal: Boolean,
        @JvmField
        val button: InlineQueryResultsButton?,
        @JvmField
        val results: Array<InputInlineQueryResult>,
        @JvmField
        val cacheTime: Int,
        @JvmField
        val nextOffset: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_343_853_844
    }

    class AnswerPreCheckoutQuery(
        @JvmField
        val preCheckoutQueryId: Long,
        @JvmField
        val errorMessage: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_486_789_653
    }

    class AnswerShippingQuery(
        @JvmField
        val shippingQueryId: Long,
        @JvmField
        val shippingOptions: Array<ShippingOption>,
        @JvmField
        val errorMessage: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -434_601_324
    }

    class AnswerWebAppQuery(
        @JvmField
        val webAppQueryId: String,
        @JvmField
        val result: InputInlineQueryResult,
    ) : Function<SentWebAppMessage>() {
        override fun getConstructor(): Int = -1_598_776_079
    }

    class ApplyPremiumGiftCode(
        @JvmField
        val code: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_347_138_530
    }

    class AssignStoreTransaction(
        @JvmField
        val transaction: StoreTransaction,
        @JvmField
        val purpose: StorePaymentPurpose,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_046_202_900
    }

    class BanChatMember(
        @JvmField
        val chatId: Long,
        @JvmField
        val memberId: MessageSender,
        @JvmField
        val bannedUntilDate: Int,
        @JvmField
        val revokeMessages: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -888_111_748
    }

    class BanGroupCallParticipants(
        @JvmField
        val groupCallId: Int,
        @JvmField
        val userIds: LongArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 624_883_173
    }

    class BlockMessageSenderFromReplies(
        @JvmField
        val messageId: Long,
        @JvmField
        val deleteMessage: Boolean,
        @JvmField
        val deleteAllMessages: Boolean,
        @JvmField
        val reportSpam: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_214_384_757
    }

    class BoostChat(
        @JvmField
        val chatId: Long,
        @JvmField
        val slotIds: IntArray,
    ) : Function<ChatBoostSlots>() {
        override fun getConstructor(): Int = 1_945_750_252
    }

    class CanBotSendMessages(
        @JvmField
        val botUserId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 544_052_364
    }

    class CanPostStory(
        @JvmField
        val chatId: Long,
    ) : Function<CanPostStoryResult>() {
        override fun getConstructor(): Int = 668_621_518
    }

    class CanPurchaseFromStore(
        @JvmField
        val purpose: StorePaymentPurpose,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_017_811_816
    }

    class CanSendMessageToUser(
        @JvmField
        val userId: Long,
        @JvmField
        val onlyLocal: Boolean,
    ) : Function<CanSendMessageToUserResult>() {
        override fun getConstructor(): Int = 1_529_489_462
    }

    class CanTransferOwnership : Function<CanTransferOwnershipResult>() {
        override fun getConstructor(): Int = 634_602_508
    }

    class CancelDownloadFile(
        @JvmField
        val fileId: Int,
        @JvmField
        val onlyIfPending: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_954_524_450
    }

    class CancelPasswordReset : Function<Ok>() {
        override fun getConstructor(): Int = 940_733_538
    }

    class CancelPreliminaryUploadFile(
        @JvmField
        val fileId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 823_412_414
    }

    class CancelRecoveryEmailAddressVerification : Function<PasswordState>() {
        override fun getConstructor(): Int = -1_516_728_691
    }

    class ChangeImportedContacts(
        @JvmField
        val contacts: Array<Contact>,
    ) : Function<ImportedContacts>() {
        override fun getConstructor(): Int = 1_968_207_955
    }

    class ChangeStickerSet(
        @JvmField
        val setId: Long,
        @JvmField
        val isInstalled: Boolean,
        @JvmField
        val isArchived: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 449_357_293
    }

    class CheckAuthenticationBotToken(
        @JvmField
        val token: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 639_321_206
    }

    class CheckAuthenticationCode(
        @JvmField
        val code: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -302_103_382
    }

    class CheckAuthenticationEmailCode(
        @JvmField
        val code: EmailAddressAuthentication,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -582_827_361
    }

    class CheckAuthenticationPassword(
        @JvmField
        val password: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_025_698_400
    }

    class CheckAuthenticationPasswordRecoveryCode(
        @JvmField
        val recoveryCode: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -603_309_083
    }

    class CheckAuthenticationPremiumPurchase(
        @JvmField
        val currency: String,
        @JvmField
        val amount: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_588_959_934
    }

    class CheckChatFolderInviteLink(
        @JvmField
        val inviteLink: String,
    ) : Function<ChatFolderInviteLinkInfo>() {
        override fun getConstructor(): Int = 522_557_851
    }

    class CheckChatInviteLink(
        @JvmField
        val inviteLink: String,
    ) : Function<ChatInviteLinkInfo>() {
        override fun getConstructor(): Int = -496_940_997
    }

    class CheckChatUsername(
        @JvmField
        val chatId: Long,
        @JvmField
        val username: String,
    ) : Function<CheckChatUsernameResult>() {
        override fun getConstructor(): Int = -119_119_344
    }

    class CheckCreatedPublicChatsLimit(
        @JvmField
        val type: PublicChatType,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -445_546_591
    }

    class CheckEmailAddressVerificationCode(
        @JvmField
        val code: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -426_386_685
    }

    class CheckLoginEmailAddressCode(
        @JvmField
        val code: EmailAddressAuthentication,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_454_244_766
    }

    class CheckPasswordRecoveryCode(
        @JvmField
        val recoveryCode: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -200_794_600
    }

    class CheckPhoneNumberCode(
        @JvmField
        val code: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -603_626_079
    }

    class CheckPremiumGiftCode(
        @JvmField
        val code: String,
    ) : Function<PremiumGiftCodeInfo>() {
        override fun getConstructor(): Int = -1_786_063_260
    }

    class CheckQuickReplyShortcutName(
        @JvmField
        val name: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 2_101_203_241
    }

    class CheckRecoveryEmailAddressCode(
        @JvmField
        val code: String,
    ) : Function<PasswordState>() {
        override fun getConstructor(): Int = -1_997_039_589
    }

    class CheckStickerSetName(
        @JvmField
        val name: String,
    ) : Function<CheckStickerSetNameResult>() {
        override fun getConstructor(): Int = -1_789_392_642
    }

    class CheckWebAppFileDownload(
        @JvmField
        val botUserId: Long,
        @JvmField
        val fileName: String,
        @JvmField
        val url: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -389_397_278
    }

    class CleanFileName(
        @JvmField
        val fileName: String,
    ) : Function<Text>() {
        override fun getConstructor(): Int = 967_964_667
    }

    class ClearAllDraftMessages(
        @JvmField
        val excludeSecretChats: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -46_369_573
    }

    class ClearAutosaveSettingsExceptions : Function<Ok>() {
        override fun getConstructor(): Int = 1_475_109_874
    }

    class ClearImportedContacts : Function<Ok>() {
        override fun getConstructor(): Int = 869_503_298
    }

    class ClearRecentEmojiStatuses : Function<Ok>() {
        override fun getConstructor(): Int = -428_749_986
    }

    class ClearRecentReactions : Function<Ok>() {
        override fun getConstructor(): Int = 1_298_253_650
    }

    class ClearRecentStickers(
        @JvmField
        val isAttached: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -321_242_684
    }

    class ClearRecentlyFoundChats : Function<Ok>() {
        override fun getConstructor(): Int = -285_582_542
    }

    class ClearSearchedForTags(
        @JvmField
        val clearCashtags: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 512_017_238
    }

    class ClickAnimatedEmojiMessage(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
    ) : Function<Sticker>() {
        override fun getConstructor(): Int = 196_179_554
    }

    class ClickChatSponsoredMessage(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val isMediaClick: Boolean,
        @JvmField
        val fromFullscreen: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 971_995_671
    }

    class ClickPremiumSubscriptionButton : Function<Ok>() {
        override fun getConstructor(): Int = -369_319_162
    }

    class ClickVideoMessageAdvertisement(
        @JvmField
        val advertisementUniqueId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_367_156_622
    }

    class Close : Function<Ok>() {
        override fun getConstructor(): Int = -1_187_782_273
    }

    class CloseChat(
        @JvmField
        val chatId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 39_749_353
    }

    class CloseSecretChat(
        @JvmField
        val secretChatId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -471_006_133
    }

    class CloseStory(
        @JvmField
        val storyPosterChatId: Long,
        @JvmField
        val storyId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_553_967_851
    }

    class CloseWebApp(
        @JvmField
        val webAppLaunchId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_755_391_174
    }

    class CommitPendingPaidMessageReactions(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -171_354_618
    }

    class ConfirmQrCodeAuthentication(
        @JvmField
        val link: String,
    ) : Function<Session>() {
        override fun getConstructor(): Int = -376_199_379
    }

    class ConfirmSession(
        @JvmField
        val sessionId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -674_647_009
    }

    class ConnectAffiliateProgram(
        @JvmField
        val affiliate: AffiliateType,
        @JvmField
        val botUserId: Long,
    ) : Function<ConnectedAffiliateProgram>() {
        override fun getConstructor(): Int = 1_661_392_684
    }

    class CreateBasicGroupChat(
        @JvmField
        val basicGroupId: Long,
        @JvmField
        val force: Boolean,
    ) : Function<Chat>() {
        override fun getConstructor(): Int = 1_972_024_548
    }

    class CreateBusinessChatLink(
        @JvmField
        val linkInfo: InputBusinessChatLink,
    ) : Function<BusinessChatLink>() {
        override fun getConstructor(): Int = -1_861_018_304
    }

    class CreateCall(
        @JvmField
        val userId: Long,
        @JvmField
        val protocol: CallProtocol,
        @JvmField
        val isVideo: Boolean,
    ) : Function<CallId>() {
        override fun getConstructor(): Int = -1_104_663_024
    }

    class CreateChatFolder(
        @JvmField
        val folder: ChatFolder,
    ) : Function<ChatFolderInfo>() {
        override fun getConstructor(): Int = 1_015_399_680
    }

    class CreateChatFolderInviteLink(
        @JvmField
        val chatFolderId: Int,
        @JvmField
        val name: String,
        @JvmField
        val chatIds: LongArray,
    ) : Function<ChatFolderInviteLink>() {
        override fun getConstructor(): Int = -2_037_911_099
    }

    class CreateChatInviteLink(
        @JvmField
        val chatId: Long,
        @JvmField
        val name: String,
        @JvmField
        val expirationDate: Int,
        @JvmField
        val memberLimit: Int,
        @JvmField
        val createsJoinRequest: Boolean,
    ) : Function<ChatInviteLink>() {
        override fun getConstructor(): Int = 287_744_833
    }

    class CreateChatSubscriptionInviteLink(
        @JvmField
        val chatId: Long,
        @JvmField
        val name: String,
        @JvmField
        val subscriptionPricing: StarSubscriptionPricing,
    ) : Function<ChatInviteLink>() {
        override fun getConstructor(): Int = 2_255_717
    }

    class CreateForumTopic(
        @JvmField
        val chatId: Long,
        @JvmField
        val name: String,
        @JvmField
        val icon: ForumTopicIcon,
    ) : Function<ForumTopicInfo>() {
        override fun getConstructor(): Int = -1_040_570_140
    }

    class CreateGroupCall(
        @JvmField
        val joinParameters: GroupCallJoinParameters?,
    ) : Function<GroupCallInfo>() {
        override fun getConstructor(): Int = 1_930_068_672
    }

    class CreateInvoiceLink(
        @JvmField
        val businessConnectionId: String,
        @JvmField
        val invoice: InputMessageContent,
    ) : Function<HttpUrl>() {
        override fun getConstructor(): Int = -814_692_249
    }

    class CreateNewBasicGroupChat(
        @JvmField
        val userIds: LongArray,
        @JvmField
        val title: String,
        @JvmField
        val messageAutoDeleteTime: Int,
    ) : Function<CreatedBasicGroupChat>() {
        override fun getConstructor(): Int = 1_806_454_709
    }

    class CreateNewSecretChat(
        @JvmField
        val userId: Long,
    ) : Function<Chat>() {
        override fun getConstructor(): Int = -620_682_651
    }

    class CreateNewStickerSet(
        @JvmField
        val userId: Long,
        @JvmField
        val title: String,
        @JvmField
        val name: String,
        @JvmField
        val stickerType: StickerType,
        @JvmField
        val needsRepainting: Boolean,
        @JvmField
        val stickers: Array<InputSticker>,
        @JvmField
        val source: String,
    ) : Function<StickerSet>() {
        override fun getConstructor(): Int = -481_065_727
    }

    class CreateNewSupergroupChat(
        @JvmField
        val title: String,
        @JvmField
        val isForum: Boolean,
        @JvmField
        val isChannel: Boolean,
        @JvmField
        val description: String,
        @JvmField
        val location: ChatLocation?,
        @JvmField
        val messageAutoDeleteTime: Int,
        @JvmField
        val forImport: Boolean,
    ) : Function<Chat>() {
        override fun getConstructor(): Int = 804_058_822
    }

    class CreatePrivateChat(
        @JvmField
        val userId: Long,
        @JvmField
        val force: Boolean,
    ) : Function<Chat>() {
        override fun getConstructor(): Int = -947_758_327
    }

    class CreateSecretChat(
        @JvmField
        val secretChatId: Int,
    ) : Function<Chat>() {
        override fun getConstructor(): Int = 1_930_285_615
    }

    class CreateSupergroupChat(
        @JvmField
        val supergroupId: Long,
        @JvmField
        val force: Boolean,
    ) : Function<Chat>() {
        override fun getConstructor(): Int = 1_187_475_691
    }

    class CreateTemporaryPassword(
        @JvmField
        val password: String,
        @JvmField
        val validFor: Int,
    ) : Function<TemporaryPasswordState>() {
        override fun getConstructor(): Int = -1_626_509_434
    }

    class CreateVideoChat(
        @JvmField
        val chatId: Long,
        @JvmField
        val title: String,
        @JvmField
        val startDate: Int,
        @JvmField
        val isRtmpStream: Boolean,
    ) : Function<GroupCallId>() {
        override fun getConstructor(): Int = 2_124_715_405
    }

    class DeclineGroupCallInvitation(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_843_919_377
    }

    class DecryptGroupCallData(
        @JvmField
        val groupCallId: Int,
        @JvmField
        val participantId: MessageSender,
        @JvmField
        val dataChannel: GroupCallDataChannel?,
        @JvmField
        val data: ByteArray,
    ) : Function<Data>() {
        override fun getConstructor(): Int = 1_781_743_076
    }

    class DeleteAccount(
        @JvmField
        val reason: String,
        @JvmField
        val password: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_395_816_134
    }

    class DeleteAllCallMessages(
        @JvmField
        val revoke: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_466_445_325
    }

    class DeleteAllRevokedChatInviteLinks(
        @JvmField
        val chatId: Long,
        @JvmField
        val creatorUserId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_112_020_698
    }

    class DeleteBotMediaPreviews(
        @JvmField
        val botUserId: Long,
        @JvmField
        val languageCode: String,
        @JvmField
        val fileIds: IntArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_397_512_722
    }

    class DeleteBusinessChatLink(
        @JvmField
        val link: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_101_895_865
    }

    class DeleteBusinessConnectedBot(
        @JvmField
        val botUserId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_633_976_747
    }

    class DeleteBusinessMessages(
        @JvmField
        val businessConnectionId: String,
        @JvmField
        val messageIds: LongArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_425_721_828
    }

    class DeleteBusinessStory(
        @JvmField
        val businessConnectionId: String,
        @JvmField
        val storyId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_024_585_042
    }

    class DeleteChat(
        @JvmField
        val chatId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -171_253_666
    }

    class DeleteChatBackground(
        @JvmField
        val chatId: Long,
        @JvmField
        val restorePrevious: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 320_267_896
    }

    class DeleteChatFolder(
        @JvmField
        val chatFolderId: Int,
        @JvmField
        val leaveChatIds: LongArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_956_364_551
    }

    class DeleteChatFolderInviteLink(
        @JvmField
        val chatFolderId: Int,
        @JvmField
        val inviteLink: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -930_057_858
    }

    class DeleteChatHistory(
        @JvmField
        val chatId: Long,
        @JvmField
        val removeFromChatList: Boolean,
        @JvmField
        val revoke: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_472_081_761
    }

    class DeleteChatMessagesByDate(
        @JvmField
        val chatId: Long,
        @JvmField
        val minDate: Int,
        @JvmField
        val maxDate: Int,
        @JvmField
        val revoke: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_639_653_185
    }

    class DeleteChatMessagesBySender(
        @JvmField
        val chatId: Long,
        @JvmField
        val senderId: MessageSender,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_164_235_161
    }

    class DeleteChatReplyMarkup(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 100_637_531
    }

    class DeleteCommands(
        @JvmField
        val scope: BotCommandScope?,
        @JvmField
        val languageCode: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_002_732_586
    }

    class DeleteDefaultBackground(
        @JvmField
        val forDarkTheme: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_297_814_210
    }

    class DeleteDirectMessagesChatTopicHistory(
        @JvmField
        val chatId: Long,
        @JvmField
        val topicId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_906_080_196
    }

    class DeleteDirectMessagesChatTopicMessagesByDate(
        @JvmField
        val chatId: Long,
        @JvmField
        val topicId: Long,
        @JvmField
        val minDate: Int,
        @JvmField
        val maxDate: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 945_080_841
    }

    class DeleteFile(
        @JvmField
        val fileId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_807_653_676
    }

    class DeleteForumTopic(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageThreadId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_864_916_152
    }

    class DeleteLanguagePack(
        @JvmField
        val languagePackId: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_108_761_026
    }

    class DeleteMessages(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageIds: LongArray,
        @JvmField
        val revoke: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_130_090_173
    }

    class DeletePassportElement(
        @JvmField
        val type: PassportElementType,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_719_555_468
    }

    class DeleteProfilePhoto(
        @JvmField
        val profilePhotoId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_319_794_625
    }

    class DeleteQuickReplyShortcut(
        @JvmField
        val shortcutId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -246_911_978
    }

    class DeleteQuickReplyShortcutMessages(
        @JvmField
        val shortcutId: Int,
        @JvmField
        val messageIds: LongArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -40_522_947
    }

    class DeleteRevokedChatInviteLink(
        @JvmField
        val chatId: Long,
        @JvmField
        val inviteLink: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_859_711_873
    }

    class DeleteSavedCredentials : Function<Ok>() {
        override fun getConstructor(): Int = 826_300_114
    }

    class DeleteSavedMessagesTopicHistory(
        @JvmField
        val savedMessagesTopicId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_776_237_930
    }

    class DeleteSavedMessagesTopicMessagesByDate(
        @JvmField
        val savedMessagesTopicId: Long,
        @JvmField
        val minDate: Int,
        @JvmField
        val maxDate: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_444_389
    }

    class DeleteSavedOrderInfo : Function<Ok>() {
        override fun getConstructor(): Int = 1_629_058_164
    }

    class DeleteStickerSet(
        @JvmField
        val name: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_577_745_325
    }

    class DeleteStory(
        @JvmField
        val storyPosterChatId: Long,
        @JvmField
        val storyId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_020_144_472
    }

    class Destroy : Function<Ok>() {
        override fun getConstructor(): Int = 685_331_274
    }

    class DisableAllSupergroupUsernames(
        @JvmField
        val supergroupId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 843_511_216
    }

    class DisableProxy : Function<Ok>() {
        override fun getConstructor(): Int = -2_100_095_102
    }

    class DiscardCall(
        @JvmField
        val callId: Int,
        @JvmField
        val isDisconnected: Boolean,
        @JvmField
        val inviteLink: String,
        @JvmField
        val duration: Int,
        @JvmField
        val isVideo: Boolean,
        @JvmField
        val connectionId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_545_983_346
    }

    class DisconnectAffiliateProgram(
        @JvmField
        val affiliate: AffiliateType,
        @JvmField
        val url: String,
    ) : Function<ConnectedAffiliateProgram>() {
        override fun getConstructor(): Int = -105_831_172
    }

    class DisconnectAllWebsites : Function<Ok>() {
        override fun getConstructor(): Int = -1_082_985_981
    }

    class DisconnectWebsite(
        @JvmField
        val websiteId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -778_767_395
    }

    class DownloadFile(
        @JvmField
        val fileId: Int,
        @JvmField
        val priority: Int,
        @JvmField
        val offset: Long,
        @JvmField
        val limit: Long,
        @JvmField
        val synchronous: Boolean,
    ) : Function<File>() {
        override fun getConstructor(): Int = 1_059_402_292
    }

    class EditBotMediaPreview(
        @JvmField
        val botUserId: Long,
        @JvmField
        val languageCode: String,
        @JvmField
        val fileId: Int,
        @JvmField
        val content: InputStoryContent,
    ) : Function<BotMediaPreview>() {
        override fun getConstructor(): Int = -2_037_031_582
    }

    class EditBusinessChatLink(
        @JvmField
        val link: String,
        @JvmField
        val linkInfo: InputBusinessChatLink,
    ) : Function<BusinessChatLink>() {
        override fun getConstructor(): Int = 1_594_947_110
    }

    class EditBusinessMessageCaption(
        @JvmField
        val businessConnectionId: String,
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val replyMarkup: ReplyMarkup?,
        @JvmField
        val caption: FormattedText?,
        @JvmField
        val showCaptionAboveMedia: Boolean,
    ) : Function<BusinessMessage>() {
        override fun getConstructor(): Int = -1_071_562_045
    }

    class EditBusinessMessageChecklist(
        @JvmField
        val businessConnectionId: String,
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val replyMarkup: ReplyMarkup?,
        @JvmField
        val checklist: InputChecklist,
    ) : Function<BusinessMessage>() {
        override fun getConstructor(): Int = -445_013_904
    }

    class EditBusinessMessageLiveLocation(
        @JvmField
        val businessConnectionId: String,
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val replyMarkup: ReplyMarkup?,
        @JvmField
        val location: Location?,
        @JvmField
        val livePeriod: Int,
        @JvmField
        val heading: Int,
        @JvmField
        val proximityAlertRadius: Int,
    ) : Function<BusinessMessage>() {
        override fun getConstructor(): Int = 494_972_447
    }

    class EditBusinessMessageMedia(
        @JvmField
        val businessConnectionId: String,
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val replyMarkup: ReplyMarkup?,
        @JvmField
        val inputMessageContent: InputMessageContent,
    ) : Function<BusinessMessage>() {
        override fun getConstructor(): Int = -60_733_576
    }

    class EditBusinessMessageReplyMarkup(
        @JvmField
        val businessConnectionId: String,
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val replyMarkup: ReplyMarkup?,
    ) : Function<BusinessMessage>() {
        override fun getConstructor(): Int = 701_787_159
    }

    class EditBusinessMessageText(
        @JvmField
        val businessConnectionId: String,
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val replyMarkup: ReplyMarkup?,
        @JvmField
        val inputMessageContent: InputMessageContent,
    ) : Function<BusinessMessage>() {
        override fun getConstructor(): Int = -1_149_169_252
    }

    class EditBusinessStory(
        @JvmField
        val storyPosterChatId: Long,
        @JvmField
        val storyId: Int,
        @JvmField
        val content: InputStoryContent,
        @JvmField
        val areas: InputStoryAreas,
        @JvmField
        val caption: FormattedText,
        @JvmField
        val privacySettings: StoryPrivacySettings,
    ) : Function<Story>() {
        override fun getConstructor(): Int = 472_538_940
    }

    class EditChatFolder(
        @JvmField
        val chatFolderId: Int,
        @JvmField
        val folder: ChatFolder,
    ) : Function<ChatFolderInfo>() {
        override fun getConstructor(): Int = 53_672_754
    }

    class EditChatFolderInviteLink(
        @JvmField
        val chatFolderId: Int,
        @JvmField
        val inviteLink: String,
        @JvmField
        val name: String,
        @JvmField
        val chatIds: LongArray,
    ) : Function<ChatFolderInviteLink>() {
        override fun getConstructor(): Int = -2_141_872_095
    }

    class EditChatInviteLink(
        @JvmField
        val chatId: Long,
        @JvmField
        val inviteLink: String,
        @JvmField
        val name: String,
        @JvmField
        val expirationDate: Int,
        @JvmField
        val memberLimit: Int,
        @JvmField
        val createsJoinRequest: Boolean,
    ) : Function<ChatInviteLink>() {
        override fun getConstructor(): Int = 1_320_303_996
    }

    class EditChatSubscriptionInviteLink(
        @JvmField
        val chatId: Long,
        @JvmField
        val inviteLink: String,
        @JvmField
        val name: String,
    ) : Function<ChatInviteLink>() {
        override fun getConstructor(): Int = -951_826_989
    }

    class EditCustomLanguagePackInfo(
        @JvmField
        val info: LanguagePackInfo,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_320_751_257
    }

    class EditForumTopic(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageThreadId: Long,
        @JvmField
        val name: String,
        @JvmField
        val editIconCustomEmoji: Boolean,
        @JvmField
        val iconCustomEmojiId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_485_402_016
    }

    class EditInlineMessageCaption(
        @JvmField
        val inlineMessageId: String,
        @JvmField
        val replyMarkup: ReplyMarkup?,
        @JvmField
        val caption: FormattedText?,
        @JvmField
        val showCaptionAboveMedia: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_409_762_552
    }

    class EditInlineMessageLiveLocation(
        @JvmField
        val inlineMessageId: String,
        @JvmField
        val replyMarkup: ReplyMarkup?,
        @JvmField
        val location: Location?,
        @JvmField
        val livePeriod: Int,
        @JvmField
        val heading: Int,
        @JvmField
        val proximityAlertRadius: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 2_134_352_044
    }

    class EditInlineMessageMedia(
        @JvmField
        val inlineMessageId: String,
        @JvmField
        val replyMarkup: ReplyMarkup?,
        @JvmField
        val inputMessageContent: InputMessageContent,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 23_553_921
    }

    class EditInlineMessageReplyMarkup(
        @JvmField
        val inlineMessageId: String,
        @JvmField
        val replyMarkup: ReplyMarkup?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -67_565_858
    }

    class EditInlineMessageText(
        @JvmField
        val inlineMessageId: String,
        @JvmField
        val replyMarkup: ReplyMarkup?,
        @JvmField
        val inputMessageContent: InputMessageContent,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -855_457_307
    }

    class EditMessageCaption(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val replyMarkup: ReplyMarkup?,
        @JvmField
        val caption: FormattedText?,
        @JvmField
        val showCaptionAboveMedia: Boolean,
    ) : Function<Message>() {
        override fun getConstructor(): Int = -2_020_117_951
    }

    class EditMessageChecklist(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val replyMarkup: ReplyMarkup?,
        @JvmField
        val checklist: InputChecklist,
    ) : Function<Message>() {
        override fun getConstructor(): Int = 1_497_856_700
    }

    class EditMessageLiveLocation(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val replyMarkup: ReplyMarkup?,
        @JvmField
        val location: Location?,
        @JvmField
        val livePeriod: Int,
        @JvmField
        val heading: Int,
        @JvmField
        val proximityAlertRadius: Int,
    ) : Function<Message>() {
        override fun getConstructor(): Int = -1_890_511_980
    }

    class EditMessageMedia(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val replyMarkup: ReplyMarkup?,
        @JvmField
        val inputMessageContent: InputMessageContent,
    ) : Function<Message>() {
        override fun getConstructor(): Int = -1_152_678_125
    }

    class EditMessageReplyMarkup(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val replyMarkup: ReplyMarkup?,
    ) : Function<Message>() {
        override fun getConstructor(): Int = 332_127_881
    }

    class EditMessageSchedulingState(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val schedulingState: MessageSchedulingState?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_372_976_192
    }

    class EditMessageText(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val replyMarkup: ReplyMarkup?,
        @JvmField
        val inputMessageContent: InputMessageContent,
    ) : Function<Message>() {
        override fun getConstructor(): Int = 196_272_567
    }

    class EditProxy(
        @JvmField
        val proxyId: Int,
        @JvmField
        val server: String,
        @JvmField
        val port: Int,
        @JvmField
        val enable: Boolean,
        @JvmField
        val type: ProxyType,
    ) : Function<Proxy>() {
        override fun getConstructor(): Int = -1_605_883_821
    }

    class EditQuickReplyMessage(
        @JvmField
        val shortcutId: Int,
        @JvmField
        val messageId: Long,
        @JvmField
        val inputMessageContent: InputMessageContent,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 80_517_006
    }

    class EditStarSubscription(
        @JvmField
        val subscriptionId: String,
        @JvmField
        val isCanceled: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 2_048_538_904
    }

    class EditStory(
        @JvmField
        val storyPosterChatId: Long,
        @JvmField
        val storyId: Int,
        @JvmField
        val content: InputStoryContent?,
        @JvmField
        val areas: InputStoryAreas?,
        @JvmField
        val caption: FormattedText?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 355_296_788
    }

    class EditStoryCover(
        @JvmField
        val storyPosterChatId: Long,
        @JvmField
        val storyId: Int,
        @JvmField
        val coverFrameTimestamp: Double,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_035_823_266
    }

    class EditUserStarSubscription(
        @JvmField
        val userId: Long,
        @JvmField
        val telegramPaymentChargeId: String,
        @JvmField
        val isCanceled: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_370_582_665
    }

    class EnableProxy(
        @JvmField
        val proxyId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_494_450_838
    }

    class EncryptGroupCallData(
        @JvmField
        val groupCallId: Int,
        @JvmField
        val dataChannel: GroupCallDataChannel,
        @JvmField
        val data: ByteArray,
        @JvmField
        val unencryptedPrefixSize: Int,
    ) : Function<Data>() {
        override fun getConstructor(): Int = -377_997_690
    }

    class EndGroupCall(
        @JvmField
        val groupCallId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 573_131_959
    }

    class EndGroupCallRecording(
        @JvmField
        val groupCallId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -75_799_927
    }

    class EndGroupCallScreenSharing(
        @JvmField
        val groupCallId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_047_599_540
    }

    class FinishFileGeneration(
        @JvmField
        val generationId: Long,
        @JvmField
        val error: Error?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_055_060_835
    }

    class ForwardMessages(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageThreadId: Long,
        @JvmField
        val fromChatId: Long,
        @JvmField
        val messageIds: LongArray,
        @JvmField
        val options: MessageSendOptions?,
        @JvmField
        val sendCopy: Boolean,
        @JvmField
        val removeCaption: Boolean,
    ) : Function<Messages>() {
        override fun getConstructor(): Int = 966_156_347
    }

    class GetAccountTtl : Function<AccountTtl>() {
        override fun getConstructor(): Int = -443_905_161
    }

    class GetActiveSessions : Function<Sessions>() {
        override fun getConstructor(): Int = 1_119_710_526
    }

    class GetAllPassportElements(
        @JvmField
        val password: String,
    ) : Function<PassportElements>() {
        override fun getConstructor(): Int = -2_038_945_045
    }

    class GetAllStickerEmojis(
        @JvmField
        val stickerType: StickerType,
        @JvmField
        val query: String,
        @JvmField
        val chatId: Long,
        @JvmField
        val returnOnlyMainEmoji: Boolean,
    ) : Function<Emojis>() {
        override fun getConstructor(): Int = 296_562_224
    }

    class GetAnimatedEmoji(
        @JvmField
        val emoji: String,
    ) : Function<AnimatedEmoji>() {
        override fun getConstructor(): Int = 1_065_635_702
    }

    class GetApplicationConfig : Function<JsonValue>() {
        override fun getConstructor(): Int = -1_823_144_318
    }

    class GetApplicationDownloadLink : Function<HttpUrl>() {
        override fun getConstructor(): Int = 112_013_252
    }

    class GetArchiveChatListSettings : Function<ArchiveChatListSettings>() {
        override fun getConstructor(): Int = -2_087_874_976
    }

    class GetArchivedStickerSets(
        @JvmField
        val stickerType: StickerType,
        @JvmField
        val offsetStickerSetId: Long,
        @JvmField
        val limit: Int,
    ) : Function<StickerSets>() {
        override fun getConstructor(): Int = 1_001_931_341
    }

    class GetAttachedStickerSets(
        @JvmField
        val fileId: Int,
    ) : Function<StickerSets>() {
        override fun getConstructor(): Int = 1_302_172_429
    }

    class GetAttachmentMenuBot(
        @JvmField
        val botUserId: Long,
    ) : Function<AttachmentMenuBot>() {
        override fun getConstructor(): Int = 1_034_248_699
    }

    class GetAuthorizationState : Function<AuthorizationState>() {
        override fun getConstructor(): Int = 1_949_154_877
    }

    class GetAutoDownloadSettingsPresets : Function<AutoDownloadSettingsPresets>() {
        override fun getConstructor(): Int = -1_721_088_201
    }

    class GetAutosaveSettings : Function<AutosaveSettings>() {
        override fun getConstructor(): Int = 2_136_207_914
    }

    class GetAvailableChatBoostSlots : Function<ChatBoostSlots>() {
        override fun getConstructor(): Int = 1_929_898_965
    }

    class GetAvailableGifts : Function<AvailableGifts>() {
        override fun getConstructor(): Int = -4_559_695
    }

    class GetBackgroundUrl(
        @JvmField
        val name: String,
        @JvmField
        val type: BackgroundType,
    ) : Function<HttpUrl>() {
        override fun getConstructor(): Int = 733_769_682
    }

    class GetBankCardInfo(
        @JvmField
        val bankCardNumber: String,
    ) : Function<BankCardInfo>() {
        override fun getConstructor(): Int = -1_310_515_792
    }

    class GetBasicGroup(
        @JvmField
        val basicGroupId: Long,
    ) : Function<BasicGroup>() {
        override fun getConstructor(): Int = -1_635_174_828
    }

    class GetBasicGroupFullInfo(
        @JvmField
        val basicGroupId: Long,
    ) : Function<BasicGroupFullInfo>() {
        override fun getConstructor(): Int = -1_822_039_253
    }

    class GetBlockedMessageSenders(
        @JvmField
        val blockList: BlockList,
        @JvmField
        val offset: Int,
        @JvmField
        val limit: Int,
    ) : Function<MessageSenders>() {
        override fun getConstructor(): Int = -1_931_137_258
    }

    class GetBotInfoDescription(
        @JvmField
        val botUserId: Long,
        @JvmField
        val languageCode: String,
    ) : Function<Text>() {
        override fun getConstructor(): Int = -762_841_035
    }

    class GetBotInfoShortDescription(
        @JvmField
        val botUserId: Long,
        @JvmField
        val languageCode: String,
    ) : Function<Text>() {
        override fun getConstructor(): Int = 1_243_358_740
    }

    class GetBotMediaPreviewInfo(
        @JvmField
        val botUserId: Long,
        @JvmField
        val languageCode: String,
    ) : Function<BotMediaPreviewInfo>() {
        override fun getConstructor(): Int = 1_358_299_446
    }

    class GetBotMediaPreviews(
        @JvmField
        val botUserId: Long,
    ) : Function<BotMediaPreviews>() {
        override fun getConstructor(): Int = 577_131_608
    }

    class GetBotName(
        @JvmField
        val botUserId: Long,
        @JvmField
        val languageCode: String,
    ) : Function<Text>() {
        override fun getConstructor(): Int = -1_707_118_036
    }

    class GetBotSimilarBotCount(
        @JvmField
        val botUserId: Long,
        @JvmField
        val returnLocal: Boolean,
    ) : Function<Count>() {
        override fun getConstructor(): Int = -1_271_545_369
    }

    class GetBotSimilarBots(
        @JvmField
        val botUserId: Long,
    ) : Function<Users>() {
        override fun getConstructor(): Int = -825_139_275
    }

    class GetBusinessAccountStarAmount(
        @JvmField
        val businessConnectionId: String,
    ) : Function<StarAmount>() {
        override fun getConstructor(): Int = -1_817_136_693
    }

    class GetBusinessChatLinkInfo(
        @JvmField
        val linkName: String,
    ) : Function<BusinessChatLinkInfo>() {
        override fun getConstructor(): Int = 797_670_986
    }

    class GetBusinessChatLinks : Function<BusinessChatLinks>() {
        override fun getConstructor(): Int = 710_287_703
    }

    class GetBusinessConnectedBot : Function<BusinessConnectedBot>() {
        override fun getConstructor(): Int = 911_058_883
    }

    class GetBusinessConnection(
        @JvmField
        val connectionId: String,
    ) : Function<BusinessConnection>() {
        override fun getConstructor(): Int = -2_114_706_400
    }

    class GetBusinessFeatures(
        @JvmField
        val source: BusinessFeature?,
    ) : Function<BusinessFeatures>() {
        override fun getConstructor(): Int = -997_171_199
    }

    class GetCallbackQueryAnswer(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val payload: CallbackQueryPayload,
    ) : Function<CallbackQueryAnswer>() {
        override fun getConstructor(): Int = 116_357_727
    }

    class GetCallbackQueryMessage(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val callbackQueryId: Long,
    ) : Function<Message>() {
        override fun getConstructor(): Int = -1_121_939_086
    }

    class GetChat(
        @JvmField
        val chatId: Long,
    ) : Function<Chat>() {
        override fun getConstructor(): Int = 1_866_601_536
    }

    class GetChatActiveStories(
        @JvmField
        val chatId: Long,
    ) : Function<ChatActiveStories>() {
        override fun getConstructor(): Int = 776_993_781
    }

    class GetChatAdministrators(
        @JvmField
        val chatId: Long,
    ) : Function<ChatAdministrators>() {
        override fun getConstructor(): Int = 1_544_468_155
    }

    class GetChatArchivedStories(
        @JvmField
        val chatId: Long,
        @JvmField
        val fromStoryId: Int,
        @JvmField
        val limit: Int,
    ) : Function<Stories>() {
        override fun getConstructor(): Int = -1_356_950_392
    }

    class GetChatAvailableMessageSenders(
        @JvmField
        val chatId: Long,
    ) : Function<ChatMessageSenders>() {
        override fun getConstructor(): Int = 1_158_670_635
    }

    class GetChatAvailablePaidMessageReactionSenders(
        @JvmField
        val chatId: Long,
    ) : Function<MessageSenders>() {
        override fun getConstructor(): Int = -1_244_619_639
    }

    class GetChatBoostFeatures(
        @JvmField
        val isChannel: Boolean,
    ) : Function<ChatBoostFeatures>() {
        override fun getConstructor(): Int = -389_994_336
    }

    class GetChatBoostLevelFeatures(
        @JvmField
        val isChannel: Boolean,
        @JvmField
        val level: Int,
    ) : Function<ChatBoostLevelFeatures>() {
        override fun getConstructor(): Int = 1_172_717_195
    }

    class GetChatBoostLink(
        @JvmField
        val chatId: Long,
    ) : Function<ChatBoostLink>() {
        override fun getConstructor(): Int = 1_458_662_533
    }

    class GetChatBoostLinkInfo(
        @JvmField
        val url: String,
    ) : Function<ChatBoostLinkInfo>() {
        override fun getConstructor(): Int = 654_068_572
    }

    class GetChatBoostStatus(
        @JvmField
        val chatId: Long,
    ) : Function<ChatBoostStatus>() {
        override fun getConstructor(): Int = -810_775_857
    }

    class GetChatBoosts(
        @JvmField
        val chatId: Long,
        @JvmField
        val onlyGiftCodes: Boolean,
        @JvmField
        val offset: String,
        @JvmField
        val limit: Int,
    ) : Function<FoundChatBoosts>() {
        override fun getConstructor(): Int = -1_419_859_400
    }

    class GetChatEventLog(
        @JvmField
        val chatId: Long,
        @JvmField
        val query: String,
        @JvmField
        val fromEventId: Long,
        @JvmField
        val limit: Int,
        @JvmField
        val filters: ChatEventLogFilters?,
        @JvmField
        val userIds: LongArray,
    ) : Function<ChatEvents>() {
        override fun getConstructor(): Int = -1_281_344_669
    }

    class GetChatFolder(
        @JvmField
        val chatFolderId: Int,
    ) : Function<ChatFolder>() {
        override fun getConstructor(): Int = 92_809_880
    }

    class GetChatFolderChatCount(
        @JvmField
        val folder: ChatFolder,
    ) : Function<Count>() {
        override fun getConstructor(): Int = 2_111_097_790
    }

    class GetChatFolderChatsToLeave(
        @JvmField
        val chatFolderId: Int,
    ) : Function<Chats>() {
        override fun getConstructor(): Int = -1_916_672_337
    }

    class GetChatFolderDefaultIconName(
        @JvmField
        val folder: ChatFolder,
    ) : Function<ChatFolderIcon>() {
        override fun getConstructor(): Int = 754_425_959
    }

    class GetChatFolderInviteLinks(
        @JvmField
        val chatFolderId: Int,
    ) : Function<ChatFolderInviteLinks>() {
        override fun getConstructor(): Int = 329_079_776
    }

    class GetChatFolderNewChats(
        @JvmField
        val chatFolderId: Int,
    ) : Function<Chats>() {
        override fun getConstructor(): Int = 2_123_181_260
    }

    class GetChatHistory(
        @JvmField
        val chatId: Long,
        @JvmField
        val fromMessageId: Long,
        @JvmField
        val offset: Int,
        @JvmField
        val limit: Int,
        @JvmField
        val onlyLocal: Boolean,
    ) : Function<Messages>() {
        override fun getConstructor(): Int = -799_960_451
    }

    class GetChatInviteLink(
        @JvmField
        val chatId: Long,
        @JvmField
        val inviteLink: String,
    ) : Function<ChatInviteLink>() {
        override fun getConstructor(): Int = -479_575_555
    }

    class GetChatInviteLinkCounts(
        @JvmField
        val chatId: Long,
    ) : Function<ChatInviteLinkCounts>() {
        override fun getConstructor(): Int = 890_299_025
    }

    class GetChatInviteLinkMembers(
        @JvmField
        val chatId: Long,
        @JvmField
        val inviteLink: String,
        @JvmField
        val onlyWithExpiredSubscription: Boolean,
        @JvmField
        val offsetMember: ChatInviteLinkMember?,
        @JvmField
        val limit: Int,
    ) : Function<ChatInviteLinkMembers>() {
        override fun getConstructor(): Int = 1_728_376_124
    }

    class GetChatInviteLinks(
        @JvmField
        val chatId: Long,
        @JvmField
        val creatorUserId: Long,
        @JvmField
        val isRevoked: Boolean,
        @JvmField
        val offsetDate: Int,
        @JvmField
        val offsetInviteLink: String,
        @JvmField
        val limit: Int,
    ) : Function<ChatInviteLinks>() {
        override fun getConstructor(): Int = 883_252_396
    }

    class GetChatJoinRequests(
        @JvmField
        val chatId: Long,
        @JvmField
        val inviteLink: String,
        @JvmField
        val query: String,
        @JvmField
        val offsetRequest: ChatJoinRequest?,
        @JvmField
        val limit: Int,
    ) : Function<ChatJoinRequests>() {
        override fun getConstructor(): Int = -388_428_126
    }

    class GetChatListsToAddChat(
        @JvmField
        val chatId: Long,
    ) : Function<ChatLists>() {
        override fun getConstructor(): Int = 654_956_193
    }

    class GetChatMember(
        @JvmField
        val chatId: Long,
        @JvmField
        val memberId: MessageSender,
    ) : Function<ChatMember>() {
        override fun getConstructor(): Int = -792_636_814
    }

    class GetChatMessageByDate(
        @JvmField
        val chatId: Long,
        @JvmField
        val date: Int,
    ) : Function<Message>() {
        override fun getConstructor(): Int = 1_062_564_150
    }

    class GetChatMessageCalendar(
        @JvmField
        val chatId: Long,
        @JvmField
        val topicId: MessageTopic?,
        @JvmField
        val filter: SearchMessagesFilter,
        @JvmField
        val fromMessageId: Long,
    ) : Function<MessageCalendar>() {
        override fun getConstructor(): Int = 1_644_001_372
    }

    class GetChatMessageCount(
        @JvmField
        val chatId: Long,
        @JvmField
        val topicId: MessageTopic?,
        @JvmField
        val filter: SearchMessagesFilter,
        @JvmField
        val returnLocal: Boolean,
    ) : Function<Count>() {
        override fun getConstructor(): Int = 1_641_001_101
    }

    class GetChatMessagePosition(
        @JvmField
        val chatId: Long,
        @JvmField
        val topicId: MessageTopic?,
        @JvmField
        val filter: SearchMessagesFilter,
        @JvmField
        val messageId: Long,
    ) : Function<Count>() {
        override fun getConstructor(): Int = -1_468_174_577
    }

    class GetChatNotificationSettingsExceptions(
        @JvmField
        val scope: NotificationSettingsScope?,
        @JvmField
        val compareSound: Boolean,
    ) : Function<Chats>() {
        override fun getConstructor(): Int = 201_199_121
    }

    class GetChatPinnedMessage(
        @JvmField
        val chatId: Long,
    ) : Function<Message>() {
        override fun getConstructor(): Int = 359_865_008
    }

    class GetChatPostedToChatPageStories(
        @JvmField
        val chatId: Long,
        @JvmField
        val fromStoryId: Int,
        @JvmField
        val limit: Int,
    ) : Function<Stories>() {
        override fun getConstructor(): Int = -46_414_037
    }

    class GetChatRevenueStatistics(
        @JvmField
        val chatId: Long,
        @JvmField
        val isDark: Boolean,
    ) : Function<ChatRevenueStatistics>() {
        override fun getConstructor(): Int = 701_995_836
    }

    class GetChatRevenueTransactions(
        @JvmField
        val chatId: Long,
        @JvmField
        val offset: Int,
        @JvmField
        val limit: Int,
    ) : Function<ChatRevenueTransactions>() {
        override fun getConstructor(): Int = 1_194_264_341
    }

    class GetChatRevenueWithdrawalUrl(
        @JvmField
        val chatId: Long,
        @JvmField
        val password: String,
    ) : Function<HttpUrl>() {
        override fun getConstructor(): Int = 506_595_104
    }

    class GetChatScheduledMessages(
        @JvmField
        val chatId: Long,
    ) : Function<Messages>() {
        override fun getConstructor(): Int = -549_638_149
    }

    class GetChatSimilarChatCount(
        @JvmField
        val chatId: Long,
        @JvmField
        val returnLocal: Boolean,
    ) : Function<Count>() {
        override fun getConstructor(): Int = 1_178_506_894
    }

    class GetChatSimilarChats(
        @JvmField
        val chatId: Long,
    ) : Function<Chats>() {
        override fun getConstructor(): Int = -1_152_348_285
    }

    class GetChatSparseMessagePositions(
        @JvmField
        val chatId: Long,
        @JvmField
        val filter: SearchMessagesFilter,
        @JvmField
        val fromMessageId: Long,
        @JvmField
        val limit: Int,
        @JvmField
        val savedMessagesTopicId: Long,
    ) : Function<MessagePositions>() {
        override fun getConstructor(): Int = 994_389_757
    }

    class GetChatSponsoredMessages(
        @JvmField
        val chatId: Long,
    ) : Function<SponsoredMessages>() {
        override fun getConstructor(): Int = 1_353_203_864
    }

    class GetChatStatistics(
        @JvmField
        val chatId: Long,
        @JvmField
        val isDark: Boolean,
    ) : Function<ChatStatistics>() {
        override fun getConstructor(): Int = 327_057_816
    }

    class GetChatStoryInteractions(
        @JvmField
        val storyPosterChatId: Long,
        @JvmField
        val storyId: Int,
        @JvmField
        val reactionType: ReactionType?,
        @JvmField
        val preferForwards: Boolean,
        @JvmField
        val offset: String,
        @JvmField
        val limit: Int,
    ) : Function<StoryInteractions>() {
        override fun getConstructor(): Int = 354_545_268
    }

    class GetChats(
        @JvmField
        val chatList: ChatList?,
        @JvmField
        val limit: Int,
    ) : Function<Chats>() {
        override fun getConstructor(): Int = -972_768_574
    }

    class GetChatsForChatFolderInviteLink(
        @JvmField
        val chatFolderId: Int,
    ) : Function<Chats>() {
        override fun getConstructor(): Int = 1_873_561_929
    }

    class GetChatsToPostStories : Function<Chats>() {
        override fun getConstructor(): Int = 1_893_901_427
    }

    class GetCloseFriends : Function<Users>() {
        override fun getConstructor(): Int = -1_445_628_722
    }

    class GetCollectibleItemInfo(
        @JvmField
        val type: CollectibleItemType,
    ) : Function<CollectibleItemInfo>() {
        override fun getConstructor(): Int = -217_797_238
    }

    class GetCommands(
        @JvmField
        val scope: BotCommandScope?,
        @JvmField
        val languageCode: String,
    ) : Function<BotCommands>() {
        override fun getConstructor(): Int = 1_488_621_559
    }

    class GetConnectedAffiliateProgram(
        @JvmField
        val affiliate: AffiliateType,
        @JvmField
        val botUserId: Long,
    ) : Function<ConnectedAffiliateProgram>() {
        override fun getConstructor(): Int = -1_755_191_440
    }

    class GetConnectedAffiliatePrograms(
        @JvmField
        val affiliate: AffiliateType,
        @JvmField
        val offset: String,
        @JvmField
        val limit: Int,
    ) : Function<ConnectedAffiliatePrograms>() {
        override fun getConstructor(): Int = -1_960_029_582
    }

    class GetConnectedWebsites : Function<ConnectedWebsites>() {
        override fun getConstructor(): Int = -170_536_110
    }

    class GetContacts : Function<Users>() {
        override fun getConstructor(): Int = -1_417_722_768
    }

    class GetCountries : Function<Countries>() {
        override fun getConstructor(): Int = -51_902_050
    }

    class GetCountryCode : Function<Text>() {
        override fun getConstructor(): Int = 1_540_593_906
    }

    class GetCountryFlagEmoji(
        @JvmField
        val countryCode: String,
    ) : Function<Text>() {
        override fun getConstructor(): Int = 981_871_098
    }

    class GetCreatedPublicChats(
        @JvmField
        val type: PublicChatType,
    ) : Function<Chats>() {
        override fun getConstructor(): Int = 710_354_415
    }

    class GetCurrentState : Function<Updates>() {
        override fun getConstructor(): Int = -1_191_417_719
    }

    class GetCurrentWeather(
        @JvmField
        val location: Location,
    ) : Function<CurrentWeather>() {
        override fun getConstructor(): Int = -1_965_384_759
    }

    class GetCustomEmojiReactionAnimations : Function<Stickers>() {
        override fun getConstructor(): Int = 1_232_375_250
    }

    class GetCustomEmojiStickers(
        @JvmField
        val customEmojiIds: LongArray,
    ) : Function<Stickers>() {
        override fun getConstructor(): Int = -2_127_427_955
    }

    class GetDatabaseStatistics : Function<DatabaseStatistics>() {
        override fun getConstructor(): Int = -1_942_760_263
    }

    class GetDeepLinkInfo(
        @JvmField
        val link: String,
    ) : Function<DeepLinkInfo>() {
        override fun getConstructor(): Int = 680_673_150
    }

    class GetDefaultBackgroundCustomEmojiStickers : Function<Stickers>() {
        override fun getConstructor(): Int = 485_910_542
    }

    class GetDefaultChatEmojiStatuses : Function<EmojiStatusCustomEmojis>() {
        override fun getConstructor(): Int = 1_553_698_018
    }

    class GetDefaultChatPhotoCustomEmojiStickers : Function<Stickers>() {
        override fun getConstructor(): Int = -376_342_683
    }

    class GetDefaultEmojiStatuses : Function<EmojiStatusCustomEmojis>() {
        override fun getConstructor(): Int = -539_392_025
    }

    class GetDefaultMessageAutoDeleteTime : Function<MessageAutoDeleteTime>() {
        override fun getConstructor(): Int = -450_857_574
    }

    class GetDefaultProfilePhotoCustomEmojiStickers : Function<Stickers>() {
        override fun getConstructor(): Int = 1_280_041_655
    }

    class GetDirectMessagesChatTopic(
        @JvmField
        val chatId: Long,
        @JvmField
        val topicId: Long,
    ) : Function<DirectMessagesChatTopic>() {
        override fun getConstructor(): Int = 1_990_530_052
    }

    class GetDirectMessagesChatTopicHistory(
        @JvmField
        val chatId: Long,
        @JvmField
        val topicId: Long,
        @JvmField
        val fromMessageId: Long,
        @JvmField
        val offset: Int,
        @JvmField
        val limit: Int,
    ) : Function<Messages>() {
        override fun getConstructor(): Int = 1_035_221_188
    }

    class GetDirectMessagesChatTopicMessageByDate(
        @JvmField
        val chatId: Long,
        @JvmField
        val topicId: Long,
        @JvmField
        val date: Int,
    ) : Function<Message>() {
        override fun getConstructor(): Int = 1_837_500_879
    }

    class GetDirectMessagesChatTopicRevenue(
        @JvmField
        val chatId: Long,
        @JvmField
        val topicId: Long,
    ) : Function<StarCount>() {
        override fun getConstructor(): Int = -792_382_961
    }

    class GetDisallowedChatEmojiStatuses : Function<EmojiStatusCustomEmojis>() {
        override fun getConstructor(): Int = -2_004_787_831
    }

    class GetEmojiCategories(
        @JvmField
        val type: EmojiCategoryType?,
    ) : Function<EmojiCategories>() {
        override fun getConstructor(): Int = 2_139_537_774
    }

    class GetEmojiReaction(
        @JvmField
        val emoji: String,
    ) : Function<EmojiReaction>() {
        override fun getConstructor(): Int = -449_572_388
    }

    class GetEmojiSuggestionsUrl(
        @JvmField
        val languageCode: String,
    ) : Function<HttpUrl>() {
        override fun getConstructor(): Int = -1_404_101_841
    }

    class GetExternalLink(
        @JvmField
        val link: String,
        @JvmField
        val allowWriteAccess: Boolean,
    ) : Function<HttpUrl>() {
        override fun getConstructor(): Int = 1_586_688_235
    }

    class GetExternalLinkInfo(
        @JvmField
        val link: String,
    ) : Function<LoginUrlInfo>() {
        override fun getConstructor(): Int = 1_175_288_383
    }

    class GetFavoriteStickers : Function<Stickers>() {
        override fun getConstructor(): Int = -338_964_672
    }

    class GetFile(
        @JvmField
        val fileId: Int,
    ) : Function<File>() {
        override fun getConstructor(): Int = 1_553_923_406
    }

    class GetFileDownloadedPrefixSize(
        @JvmField
        val fileId: Int,
        @JvmField
        val offset: Long,
    ) : Function<FileDownloadedPrefixSize>() {
        override fun getConstructor(): Int = 855_948_589
    }

    class GetFileExtension(
        @JvmField
        val mimeType: String,
    ) : Function<Text>() {
        override fun getConstructor(): Int = -106_055_372
    }

    class GetFileMimeType(
        @JvmField
        val fileName: String,
    ) : Function<Text>() {
        override fun getConstructor(): Int = -2_073_879_671
    }

    class GetForumTopic(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageThreadId: Long,
    ) : Function<ForumTopic>() {
        override fun getConstructor(): Int = -442_761_663
    }

    class GetForumTopicDefaultIcons : Function<Stickers>() {
        override fun getConstructor(): Int = 1_479_898_332
    }

    class GetForumTopicLink(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageThreadId: Long,
    ) : Function<MessageLink>() {
        override fun getConstructor(): Int = -914_650_933
    }

    class GetForumTopics(
        @JvmField
        val chatId: Long,
        @JvmField
        val query: String,
        @JvmField
        val offsetDate: Int,
        @JvmField
        val offsetMessageId: Long,
        @JvmField
        val offsetMessageThreadId: Long,
        @JvmField
        val limit: Int,
    ) : Function<ForumTopics>() {
        override fun getConstructor(): Int = -72_647_334
    }

    class GetGameHighScores(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val userId: Long,
    ) : Function<GameHighScores>() {
        override fun getConstructor(): Int = 15_746_459
    }

    class GetGiftUpgradePreview(
        @JvmField
        val giftId: Long,
    ) : Function<GiftUpgradePreview>() {
        override fun getConstructor(): Int = -1_110_719_907
    }

    class GetGiveawayInfo(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
    ) : Function<GiveawayInfo>() {
        override fun getConstructor(): Int = -1_215_852_357
    }

    class GetGreetingStickers : Function<Stickers>() {
        override fun getConstructor(): Int = 374_873_372
    }

    class GetGrossingWebAppBots(
        @JvmField
        val offset: String,
        @JvmField
        val limit: Int,
    ) : Function<FoundUsers>() {
        override fun getConstructor(): Int = 1_696_779_802
    }

    class GetGroupCall(
        @JvmField
        val groupCallId: Int,
    ) : Function<GroupCall>() {
        override fun getConstructor(): Int = 1_468_491_406
    }

    class GetGroupCallParticipants(
        @JvmField
        val inputGroupCall: InputGroupCall,
        @JvmField
        val limit: Int,
    ) : Function<GroupCallParticipants>() {
        override fun getConstructor(): Int = 1_986_739_394
    }

    class GetGroupsInCommon(
        @JvmField
        val userId: Long,
        @JvmField
        val offsetChatId: Long,
        @JvmField
        val limit: Int,
    ) : Function<Chats>() {
        override fun getConstructor(): Int = 381_539_178
    }

    class GetImportedContactCount : Function<Count>() {
        override fun getConstructor(): Int = -656_336_346
    }

    class GetInactiveSupergroupChats : Function<Chats>() {
        override fun getConstructor(): Int = -657_720_907
    }

    class GetInlineGameHighScores(
        @JvmField
        val inlineMessageId: String,
        @JvmField
        val userId: Long,
    ) : Function<GameHighScores>() {
        override fun getConstructor(): Int = -533_107_798
    }

    class GetInlineQueryResults(
        @JvmField
        val botUserId: Long,
        @JvmField
        val chatId: Long,
        @JvmField
        val userLocation: Location?,
        @JvmField
        val query: String,
        @JvmField
        val offset: String,
    ) : Function<InlineQueryResults>() {
        override fun getConstructor(): Int = 2_044_524_652
    }

    class GetInstalledBackgrounds(
        @JvmField
        val forDarkTheme: Boolean,
    ) : Function<Backgrounds>() {
        override fun getConstructor(): Int = -1_051_406_241
    }

    class GetInstalledStickerSets(
        @JvmField
        val stickerType: StickerType,
    ) : Function<StickerSets>() {
        override fun getConstructor(): Int = 1_630_467_830
    }

    class GetInternalLink(
        @JvmField
        val type: InternalLinkType,
        @JvmField
        val isHttp: Boolean,
    ) : Function<HttpUrl>() {
        override fun getConstructor(): Int = 962_654_640
    }

    class GetInternalLinkType(
        @JvmField
        val link: String,
    ) : Function<InternalLinkType>() {
        override fun getConstructor(): Int = -1_948_428_535
    }

    class GetJsonString(
        @JvmField
        val jsonValue: JsonValue,
    ) : Function<Text>() {
        override fun getConstructor(): Int = 663_458_849
    }

    class GetJsonValue(
        @JvmField
        val json: String,
    ) : Function<JsonValue>() {
        override fun getConstructor(): Int = -1_829_086_715
    }

    class GetKeywordEmojis(
        @JvmField
        val text: String,
        @JvmField
        val inputLanguageCodes: Array<String>,
    ) : Function<Emojis>() {
        override fun getConstructor(): Int = -1_969_795_990
    }

    class GetLanguagePackInfo(
        @JvmField
        val languagePackId: String,
    ) : Function<LanguagePackInfo>() {
        override fun getConstructor(): Int = 2_077_809_320
    }

    class GetLanguagePackString(
        @JvmField
        val languagePackDatabasePath: String,
        @JvmField
        val localizationTarget: String,
        @JvmField
        val languagePackId: String,
        @JvmField
        val key: String,
    ) : Function<LanguagePackStringValue>() {
        override fun getConstructor(): Int = 150_789_747
    }

    class GetLanguagePackStrings(
        @JvmField
        val languagePackId: String,
        @JvmField
        val keys: Array<String>,
    ) : Function<LanguagePackStrings>() {
        override fun getConstructor(): Int = 1_246_259_088
    }

    class GetLinkPreview(
        @JvmField
        val text: FormattedText,
        @JvmField
        val linkPreviewOptions: LinkPreviewOptions?,
    ) : Function<LinkPreview>() {
        override fun getConstructor(): Int = -1_039_572_191
    }

    class GetLocalizationTargetInfo(
        @JvmField
        val onlyLocal: Boolean,
    ) : Function<LocalizationTargetInfo>() {
        override fun getConstructor(): Int = 1_849_499_526
    }

    class GetLogStream : Function<LogStream>() {
        override fun getConstructor(): Int = 1_167_608_667
    }

    class GetLogTagVerbosityLevel(
        @JvmField
        val tag: String,
    ) : Function<LogVerbosityLevel>() {
        override fun getConstructor(): Int = 951_004_547
    }

    class GetLogTags : Function<LogTags>() {
        override fun getConstructor(): Int = -254_449_190
    }

    class GetLogVerbosityLevel : Function<LogVerbosityLevel>() {
        override fun getConstructor(): Int = 594_057_956
    }

    class GetLoginUrl(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val buttonId: Long,
        @JvmField
        val allowWriteAccess: Boolean,
    ) : Function<HttpUrl>() {
        override fun getConstructor(): Int = 791_844_305
    }

    class GetLoginUrlInfo(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val buttonId: Long,
    ) : Function<LoginUrlInfo>() {
        override fun getConstructor(): Int = -859_202_125
    }

    class GetMainWebApp(
        @JvmField
        val chatId: Long,
        @JvmField
        val botUserId: Long,
        @JvmField
        val startParameter: String,
        @JvmField
        val parameters: WebAppOpenParameters,
    ) : Function<MainWebApp>() {
        override fun getConstructor(): Int = 594_050_214
    }

    class GetMapThumbnailFile(
        @JvmField
        val location: Location,
        @JvmField
        val zoom: Int,
        @JvmField
        val width: Int,
        @JvmField
        val height: Int,
        @JvmField
        val scale: Int,
        @JvmField
        val chatId: Long,
    ) : Function<File>() {
        override fun getConstructor(): Int = -152_660_070
    }

    class GetMarkdownText(
        @JvmField
        val text: FormattedText,
    ) : Function<FormattedText>() {
        override fun getConstructor(): Int = 164_524_584
    }

    class GetMe : Function<User>() {
        override fun getConstructor(): Int = -191_516_033
    }

    class GetMenuButton(
        @JvmField
        val userId: Long,
    ) : Function<BotMenuButton>() {
        override fun getConstructor(): Int = -437_324_736
    }

    class GetMessage(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
    ) : Function<Message>() {
        override fun getConstructor(): Int = -1_821_196_160
    }

    class GetMessageAddedReactions(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val reactionType: ReactionType?,
        @JvmField
        val offset: String,
        @JvmField
        val limit: Int,
    ) : Function<AddedReactions>() {
        override fun getConstructor(): Int = 2_110_172_754
    }

    class GetMessageAuthor(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
    ) : Function<User>() {
        override fun getConstructor(): Int = 1_890_166_449
    }

    class GetMessageAvailableReactions(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val rowSize: Int,
    ) : Function<AvailableReactions>() {
        override fun getConstructor(): Int = 1_994_098_354
    }

    class GetMessageEffect(
        @JvmField
        val effectId: Long,
    ) : Function<MessageEffect>() {
        override fun getConstructor(): Int = -1_638_843_116
    }

    class GetMessageEmbeddingCode(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val forAlbum: Boolean,
    ) : Function<Text>() {
        override fun getConstructor(): Int = 1_654_967_561
    }

    class GetMessageFileType(
        @JvmField
        val messageFileHead: String,
    ) : Function<MessageFileType>() {
        override fun getConstructor(): Int = -490_270_764
    }

    class GetMessageImportConfirmationText(
        @JvmField
        val chatId: Long,
    ) : Function<Text>() {
        override fun getConstructor(): Int = 390_627_752
    }

    class GetMessageLink(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val mediaTimestamp: Int,
        @JvmField
        val forAlbum: Boolean,
        @JvmField
        val inMessageThread: Boolean,
    ) : Function<MessageLink>() {
        override fun getConstructor(): Int = -984_158_342
    }

    class GetMessageLinkInfo(
        @JvmField
        val url: String,
    ) : Function<MessageLinkInfo>() {
        override fun getConstructor(): Int = -700_533_672
    }

    class GetMessageLocally(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
    ) : Function<Message>() {
        override fun getConstructor(): Int = -603_575_444
    }

    class GetMessageProperties(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
    ) : Function<MessageProperties>() {
        override fun getConstructor(): Int = 773_382_571
    }

    class GetMessagePublicForwards(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val offset: String,
        @JvmField
        val limit: Int,
    ) : Function<PublicForwards>() {
        override fun getConstructor(): Int = 1_369_285_812
    }

    class GetMessageReadDate(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
    ) : Function<MessageReadDate>() {
        override fun getConstructor(): Int = -1_484_455_101
    }

    class GetMessageStatistics(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val isDark: Boolean,
    ) : Function<MessageStatistics>() {
        override fun getConstructor(): Int = 1_270_194_648
    }

    class GetMessageThread(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
    ) : Function<MessageThreadInfo>() {
        override fun getConstructor(): Int = 2_062_695_998
    }

    class GetMessageThreadHistory(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val fromMessageId: Long,
        @JvmField
        val offset: Int,
        @JvmField
        val limit: Int,
    ) : Function<Messages>() {
        override fun getConstructor(): Int = -1_808_411_608
    }

    class GetMessageViewers(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
    ) : Function<MessageViewers>() {
        override fun getConstructor(): Int = -1_584_457_010
    }

    class GetMessages(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageIds: LongArray,
    ) : Function<Messages>() {
        override fun getConstructor(): Int = 425_299_338
    }

    class GetNetworkStatistics(
        @JvmField
        val onlyCurrent: Boolean,
    ) : Function<NetworkStatistics>() {
        override fun getConstructor(): Int = -986_228_706
    }

    class GetNewChatPrivacySettings : Function<NewChatPrivacySettings>() {
        override fun getConstructor(): Int = -1_295_299_657
    }

    class GetOption(
        @JvmField
        val name: String,
    ) : Function<OptionValue>() {
        override fun getConstructor(): Int = -1_572_495_746
    }

    class GetOwnedBots : Function<Users>() {
        override fun getConstructor(): Int = -1_954_035_715
    }

    class GetOwnedStickerSets(
        @JvmField
        val offsetStickerSetId: Long,
        @JvmField
        val limit: Int,
    ) : Function<StickerSets>() {
        override fun getConstructor(): Int = 1_493_074_208
    }

    class GetPaidMessageRevenue(
        @JvmField
        val userId: Long,
    ) : Function<StarCount>() {
        override fun getConstructor(): Int = 1_976_589_102
    }

    class GetPassportAuthorizationForm(
        @JvmField
        val botUserId: Long,
        @JvmField
        val scope: String,
        @JvmField
        val publicKey: String,
        @JvmField
        val nonce: String,
    ) : Function<PassportAuthorizationForm>() {
        override fun getConstructor(): Int = 1_636_107_398
    }

    class GetPassportAuthorizationFormAvailableElements(
        @JvmField
        val authorizationFormId: Int,
        @JvmField
        val password: String,
    ) : Function<PassportElementsWithErrors>() {
        override fun getConstructor(): Int = 1_068_700_924
    }

    class GetPassportElement(
        @JvmField
        val type: PassportElementType,
        @JvmField
        val password: String,
    ) : Function<PassportElement>() {
        override fun getConstructor(): Int = -1_882_398_342
    }

    class GetPasswordState : Function<PasswordState>() {
        override fun getConstructor(): Int = -174_752_904
    }

    class GetPaymentForm(
        @JvmField
        val inputInvoice: InputInvoice,
        @JvmField
        val theme: ThemeParameters?,
    ) : Function<PaymentForm>() {
        override fun getConstructor(): Int = -1_924_172_076
    }

    class GetPaymentReceipt(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
    ) : Function<PaymentReceipt>() {
        override fun getConstructor(): Int = 1_013_758_294
    }

    class GetPhoneNumberInfo(
        @JvmField
        val phoneNumberPrefix: String,
    ) : Function<PhoneNumberInfo>() {
        override fun getConstructor(): Int = -1_608_344_583
    }

    class GetPhoneNumberInfoSync(
        @JvmField
        val languageCode: String,
        @JvmField
        val phoneNumberPrefix: String,
    ) : Function<PhoneNumberInfo>() {
        override fun getConstructor(): Int = 547_061_048
    }

    class GetPollVoters(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val optionId: Int,
        @JvmField
        val offset: Int,
        @JvmField
        val limit: Int,
    ) : Function<MessageSenders>() {
        override fun getConstructor(): Int = -1_000_625_748
    }

    class GetPreferredCountryLanguage(
        @JvmField
        val countryCode: String,
    ) : Function<Text>() {
        override fun getConstructor(): Int = -933_049_386
    }

    class GetPremiumFeatures(
        @JvmField
        val source: PremiumSource?,
    ) : Function<PremiumFeatures>() {
        override fun getConstructor(): Int = -1_260_640_695
    }

    class GetPremiumGiftPaymentOptions : Function<PremiumGiftPaymentOptions>() {
        override fun getConstructor(): Int = -480_334_244
    }

    class GetPremiumGiveawayPaymentOptions(
        @JvmField
        val boostedChatId: Long,
    ) : Function<PremiumGiveawayPaymentOptions>() {
        override fun getConstructor(): Int = 1_222_168_073
    }

    class GetPremiumInfoSticker(
        @JvmField
        val monthCount: Int,
    ) : Function<Sticker>() {
        override fun getConstructor(): Int = 2_043_562_651
    }

    class GetPremiumLimit(
        @JvmField
        val limitType: PremiumLimitType,
    ) : Function<PremiumLimit>() {
        override fun getConstructor(): Int = 1_075_313_898
    }

    class GetPremiumState : Function<PremiumState>() {
        override fun getConstructor(): Int = 663_632_610
    }

    class GetPremiumStickerExamples : Function<Stickers>() {
        override fun getConstructor(): Int = 1_399_442_328
    }

    class GetPremiumStickers(
        @JvmField
        val limit: Int,
    ) : Function<Stickers>() {
        override fun getConstructor(): Int = -280_950_192
    }

    class GetPreparedInlineMessage(
        @JvmField
        val botUserId: Long,
        @JvmField
        val preparedMessageId: String,
    ) : Function<PreparedInlineMessage>() {
        override fun getConstructor(): Int = -83_179_701
    }

    class GetProxies : Function<Proxies>() {
        override fun getConstructor(): Int = -95_026_381
    }

    class GetProxyLink(
        @JvmField
        val proxyId: Int,
    ) : Function<HttpUrl>() {
        override fun getConstructor(): Int = -1_054_495_112
    }

    class GetPushReceiverId(
        @JvmField
        val payload: String,
    ) : Function<PushReceiverId>() {
        override fun getConstructor(): Int = -286_505_294
    }

    class GetReadDatePrivacySettings : Function<ReadDatePrivacySettings>() {
        override fun getConstructor(): Int = 451_435_451
    }

    class GetReceivedGift(
        @JvmField
        val receivedGiftId: String,
    ) : Function<ReceivedGift>() {
        override fun getConstructor(): Int = -446_535_239
    }

    class GetReceivedGifts(
        @JvmField
        val businessConnectionId: String,
        @JvmField
        val ownerId: MessageSender,
        @JvmField
        val excludeUnsaved: Boolean,
        @JvmField
        val excludeSaved: Boolean,
        @JvmField
        val excludeUnlimited: Boolean,
        @JvmField
        val excludeLimited: Boolean,
        @JvmField
        val excludeUpgraded: Boolean,
        @JvmField
        val sortByPrice: Boolean,
        @JvmField
        val offset: String,
        @JvmField
        val limit: Int,
    ) : Function<ReceivedGifts>() {
        override fun getConstructor(): Int = -586_538_672
    }

    class GetRecentEmojiStatuses : Function<EmojiStatuses>() {
        override fun getConstructor(): Int = -1_371_914_967
    }

    class GetRecentInlineBots : Function<Users>() {
        override fun getConstructor(): Int = 1_437_823_548
    }

    class GetRecentStickers(
        @JvmField
        val isAttached: Boolean,
    ) : Function<Stickers>() {
        override fun getConstructor(): Int = -579_622_241
    }

    class GetRecentlyOpenedChats(
        @JvmField
        val limit: Int,
    ) : Function<Chats>() {
        override fun getConstructor(): Int = -1_924_156_893
    }

    class GetRecentlyVisitedTMeUrls(
        @JvmField
        val referrer: String,
    ) : Function<TMeUrls>() {
        override fun getConstructor(): Int = 806_754_961
    }

    class GetRecommendedChatFolders : Function<RecommendedChatFolders>() {
        override fun getConstructor(): Int = -145_540_217
    }

    class GetRecommendedChats : Function<Chats>() {
        override fun getConstructor(): Int = -649_884_303
    }

    class GetRecoveryEmailAddress(
        @JvmField
        val password: String,
    ) : Function<RecoveryEmailAddress>() {
        override fun getConstructor(): Int = -1_594_770_947
    }

    class GetRemoteFile(
        @JvmField
        val remoteFileId: String,
        @JvmField
        val fileType: FileType?,
    ) : Function<File>() {
        override fun getConstructor(): Int = 2_137_204_530
    }

    class GetRepliedMessage(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
    ) : Function<Message>() {
        override fun getConstructor(): Int = -641_918_531
    }

    class GetSavedAnimations : Function<Animations>() {
        override fun getConstructor(): Int = 7_051_032
    }

    class GetSavedMessagesTags(
        @JvmField
        val savedMessagesTopicId: Long,
    ) : Function<SavedMessagesTags>() {
        override fun getConstructor(): Int = -1_932_105_815
    }

    class GetSavedMessagesTopicHistory(
        @JvmField
        val savedMessagesTopicId: Long,
        @JvmField
        val fromMessageId: Long,
        @JvmField
        val offset: Int,
        @JvmField
        val limit: Int,
    ) : Function<Messages>() {
        override fun getConstructor(): Int = 2_011_552_360
    }

    class GetSavedMessagesTopicMessageByDate(
        @JvmField
        val savedMessagesTopicId: Long,
        @JvmField
        val date: Int,
    ) : Function<Message>() {
        override fun getConstructor(): Int = -1_050_786_176
    }

    class GetSavedNotificationSound(
        @JvmField
        val notificationSoundId: Long,
    ) : Function<NotificationSounds>() {
        override fun getConstructor(): Int = 459_569_431
    }

    class GetSavedNotificationSounds : Function<NotificationSounds>() {
        override fun getConstructor(): Int = -1_070_305_368
    }

    class GetSavedOrderInfo : Function<OrderInfo>() {
        override fun getConstructor(): Int = -1_152_016_675
    }

    class GetScopeNotificationSettings(
        @JvmField
        val scope: NotificationSettingsScope,
    ) : Function<ScopeNotificationSettings>() {
        override fun getConstructor(): Int = -995_613_361
    }

    class GetSearchSponsoredChats(
        @JvmField
        val query: String,
    ) : Function<SponsoredChats>() {
        override fun getConstructor(): Int = 1_568_505_164
    }

    class GetSearchedForTags(
        @JvmField
        val tagPrefix: String,
        @JvmField
        val limit: Int,
    ) : Function<Hashtags>() {
        override fun getConstructor(): Int = -1_692_716_851
    }

    class GetSecretChat(
        @JvmField
        val secretChatId: Int,
    ) : Function<SecretChat>() {
        override fun getConstructor(): Int = 40_599_169
    }

    class GetStarAdAccountUrl(
        @JvmField
        val ownerId: MessageSender,
    ) : Function<HttpUrl>() {
        override fun getConstructor(): Int = 1_940_473_181
    }

    class GetStarGiftPaymentOptions(
        @JvmField
        val userId: Long,
    ) : Function<StarPaymentOptions>() {
        override fun getConstructor(): Int = -500_735_773
    }

    class GetStarGiveawayPaymentOptions : Function<StarGiveawayPaymentOptions>() {
        override fun getConstructor(): Int = -883_172_578
    }

    class GetStarPaymentOptions : Function<StarPaymentOptions>() {
        override fun getConstructor(): Int = 1_838_351_940
    }

    class GetStarRevenueStatistics(
        @JvmField
        val ownerId: MessageSender,
        @JvmField
        val isDark: Boolean,
    ) : Function<StarRevenueStatistics>() {
        override fun getConstructor(): Int = -260_356_841
    }

    class GetStarSubscriptions(
        @JvmField
        val onlyExpiring: Boolean,
        @JvmField
        val offset: String,
    ) : Function<StarSubscriptions>() {
        override fun getConstructor(): Int = -641_223_956
    }

    class GetStarTransactions(
        @JvmField
        val ownerId: MessageSender,
        @JvmField
        val subscriptionId: String,
        @JvmField
        val direction: StarTransactionDirection?,
        @JvmField
        val offset: String,
        @JvmField
        val limit: Int,
    ) : Function<StarTransactions>() {
        override fun getConstructor(): Int = -258_541_327
    }

    class GetStarWithdrawalUrl(
        @JvmField
        val ownerId: MessageSender,
        @JvmField
        val starCount: Long,
        @JvmField
        val password: String,
    ) : Function<HttpUrl>() {
        override fun getConstructor(): Int = -1_445_841_134
    }

    class GetStatisticalGraph(
        @JvmField
        val chatId: Long,
        @JvmField
        val token: String,
        @JvmField
        val x: Long,
    ) : Function<StatisticalGraph>() {
        override fun getConstructor(): Int = 1_100_975_515
    }

    class GetStickerEmojis(
        @JvmField
        val sticker: InputFile,
    ) : Function<Emojis>() {
        override fun getConstructor(): Int = -1_895_508_665
    }

    class GetStickerOutline(
        @JvmField
        val stickerFileId: Int,
        @JvmField
        val forAnimatedEmoji: Boolean,
        @JvmField
        val forClickedAnimatedEmojiMessage: Boolean,
    ) : Function<Outline>() {
        override fun getConstructor(): Int = -1_550_504_539
    }

    class GetStickerSet(
        @JvmField
        val setId: Long,
    ) : Function<StickerSet>() {
        override fun getConstructor(): Int = 1_052_318_659
    }

    class GetStickerSetName(
        @JvmField
        val setId: Long,
    ) : Function<Text>() {
        override fun getConstructor(): Int = 1_039_849_089
    }

    class GetStickers(
        @JvmField
        val stickerType: StickerType,
        @JvmField
        val query: String,
        @JvmField
        val limit: Int,
        @JvmField
        val chatId: Long,
    ) : Function<Stickers>() {
        override fun getConstructor(): Int = 1_158_058_819
    }

    class GetStorageStatistics(
        @JvmField
        val chatLimit: Int,
    ) : Function<StorageStatistics>() {
        override fun getConstructor(): Int = -853_193_929
    }

    class GetStorageStatisticsFast : Function<StorageStatisticsFast>() {
        override fun getConstructor(): Int = 61_368_066
    }

    class GetStory(
        @JvmField
        val storyPosterChatId: Long,
        @JvmField
        val storyId: Int,
        @JvmField
        val onlyLocal: Boolean,
    ) : Function<Story>() {
        override fun getConstructor(): Int = -2_011_076_366
    }

    class GetStoryAvailableReactions(
        @JvmField
        val rowSize: Int,
    ) : Function<AvailableReactions>() {
        override fun getConstructor(): Int = 595_938_619
    }

    class GetStoryInteractions(
        @JvmField
        val storyId: Int,
        @JvmField
        val query: String,
        @JvmField
        val onlyContacts: Boolean,
        @JvmField
        val preferForwards: Boolean,
        @JvmField
        val preferWithReaction: Boolean,
        @JvmField
        val offset: String,
        @JvmField
        val limit: Int,
    ) : Function<StoryInteractions>() {
        override fun getConstructor(): Int = 483_475_469
    }

    class GetStoryNotificationSettingsExceptions : Function<Chats>() {
        override fun getConstructor(): Int = 627_715_760
    }

    class GetStoryPublicForwards(
        @JvmField
        val storyPosterChatId: Long,
        @JvmField
        val storyId: Int,
        @JvmField
        val offset: String,
        @JvmField
        val limit: Int,
    ) : Function<PublicForwards>() {
        override fun getConstructor(): Int = 1_810_378_546
    }

    class GetStoryStatistics(
        @JvmField
        val chatId: Long,
        @JvmField
        val storyId: Int,
        @JvmField
        val isDark: Boolean,
    ) : Function<StoryStatistics>() {
        override fun getConstructor(): Int = 982_926_146
    }

    class GetSuggestedFileName(
        @JvmField
        val fileId: Int,
        @JvmField
        val directory: String,
    ) : Function<Text>() {
        override fun getConstructor(): Int = -2_049_399_674
    }

    class GetSuggestedStickerSetName(
        @JvmField
        val title: String,
    ) : Function<Text>() {
        override fun getConstructor(): Int = -1_340_995_520
    }

    class GetSuitableDiscussionChats : Function<Chats>() {
        override fun getConstructor(): Int = 49_044_982
    }

    class GetSuitablePersonalChats : Function<Chats>() {
        override fun getConstructor(): Int = -1_870_357_515
    }

    class GetSupergroup(
        @JvmField
        val supergroupId: Long,
    ) : Function<Supergroup>() {
        override fun getConstructor(): Int = 989_663_458
    }

    class GetSupergroupFullInfo(
        @JvmField
        val supergroupId: Long,
    ) : Function<SupergroupFullInfo>() {
        override fun getConstructor(): Int = 1_099_776_056
    }

    class GetSupergroupMembers(
        @JvmField
        val supergroupId: Long,
        @JvmField
        val filter: SupergroupMembersFilter?,
        @JvmField
        val offset: Int,
        @JvmField
        val limit: Int,
    ) : Function<ChatMembers>() {
        override fun getConstructor(): Int = -570_940_984
    }

    class GetSupportName : Function<Text>() {
        override fun getConstructor(): Int = 1_302_205_794
    }

    class GetSupportUser : Function<User>() {
        override fun getConstructor(): Int = -1_733_497_700
    }

    class GetTemporaryPasswordState : Function<TemporaryPasswordState>() {
        override fun getConstructor(): Int = -12_670_830
    }

    class GetTextEntities(
        @JvmField
        val text: String,
    ) : Function<TextEntities>() {
        override fun getConstructor(): Int = -341_490_693
    }

    class GetThemeParametersJsonString(
        @JvmField
        val theme: ThemeParameters,
    ) : Function<Text>() {
        override fun getConstructor(): Int = -1_850_145_288
    }

    class GetThemedChatEmojiStatuses : Function<EmojiStatusCustomEmojis>() {
        override fun getConstructor(): Int = 1_924_568_314
    }

    class GetThemedEmojiStatuses : Function<EmojiStatusCustomEmojis>() {
        override fun getConstructor(): Int = -1_468_220_543
    }

    class GetTimeZones : Function<TimeZones>() {
        override fun getConstructor(): Int = 1_340_268_632
    }

    class GetTopChats(
        @JvmField
        val category: TopChatCategory,
        @JvmField
        val limit: Int,
    ) : Function<Chats>() {
        override fun getConstructor(): Int = -388_410_847
    }

    class GetTrendingStickerSets(
        @JvmField
        val stickerType: StickerType,
        @JvmField
        val offset: Int,
        @JvmField
        val limit: Int,
    ) : Function<TrendingStickerSets>() {
        override fun getConstructor(): Int = -531_085_986
    }

    class GetUpgradedGift(
        @JvmField
        val name: String,
    ) : Function<UpgradedGift>() {
        override fun getConstructor(): Int = -1_331_821_135
    }

    class GetUpgradedGiftEmojiStatuses : Function<EmojiStatuses>() {
        override fun getConstructor(): Int = -1_748_975_723
    }

    class GetUpgradedGiftWithdrawalUrl(
        @JvmField
        val receivedGiftId: String,
        @JvmField
        val password: String,
    ) : Function<HttpUrl>() {
        override fun getConstructor(): Int = -784_331_188
    }

    class GetUser(
        @JvmField
        val userId: Long,
    ) : Function<User>() {
        override fun getConstructor(): Int = 1_117_363_211
    }

    class GetUserChatBoosts(
        @JvmField
        val chatId: Long,
        @JvmField
        val userId: Long,
    ) : Function<FoundChatBoosts>() {
        override fun getConstructor(): Int = -1_190_205_543
    }

    class GetUserFullInfo(
        @JvmField
        val userId: Long,
    ) : Function<UserFullInfo>() {
        override fun getConstructor(): Int = -776_823_720
    }

    class GetUserLink : Function<UserLink>() {
        override fun getConstructor(): Int = 1_226_839_270
    }

    class GetUserPrivacySettingRules(
        @JvmField
        val setting: UserPrivacySetting,
    ) : Function<UserPrivacySettingRules>() {
        override fun getConstructor(): Int = -2_077_223_311
    }

    class GetUserProfilePhotos(
        @JvmField
        val userId: Long,
        @JvmField
        val offset: Int,
        @JvmField
        val limit: Int,
    ) : Function<ChatPhotos>() {
        override fun getConstructor(): Int = -908_132_798
    }

    class GetUserSupportInfo(
        @JvmField
        val userId: Long,
    ) : Function<UserSupportInfo>() {
        override fun getConstructor(): Int = 1_957_008_133
    }

    class GetVideoChatAvailableParticipants(
        @JvmField
        val chatId: Long,
    ) : Function<MessageSenders>() {
        override fun getConstructor(): Int = -1_000_496_379
    }

    class GetVideoChatInviteLink(
        @JvmField
        val groupCallId: Int,
        @JvmField
        val canSelfUnmute: Boolean,
    ) : Function<HttpUrl>() {
        override fun getConstructor(): Int = -1_394_707_321
    }

    class GetVideoChatRtmpUrl(
        @JvmField
        val chatId: Long,
    ) : Function<RtmpUrl>() {
        override fun getConstructor(): Int = 1_210_784_543
    }

    class GetVideoChatStreamSegment(
        @JvmField
        val groupCallId: Int,
        @JvmField
        val timeOffset: Long,
        @JvmField
        val scale: Int,
        @JvmField
        val channelId: Int,
        @JvmField
        val videoQuality: GroupCallVideoQuality?,
    ) : Function<Data>() {
        override fun getConstructor(): Int = 773_343_220
    }

    class GetVideoChatStreams(
        @JvmField
        val groupCallId: Int,
    ) : Function<VideoChatStreams>() {
        override fun getConstructor(): Int = 531_757_765
    }

    class GetVideoMessageAdvertisements(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
    ) : Function<VideoMessageAdvertisements>() {
        override fun getConstructor(): Int = -285_681_331
    }

    class GetWebAppLinkUrl(
        @JvmField
        val chatId: Long,
        @JvmField
        val botUserId: Long,
        @JvmField
        val webAppShortName: String,
        @JvmField
        val startParameter: String,
        @JvmField
        val allowWriteAccess: Boolean,
        @JvmField
        val parameters: WebAppOpenParameters,
    ) : Function<HttpUrl>() {
        override fun getConstructor(): Int = 1_627_284_161
    }

    class GetWebAppPlaceholder(
        @JvmField
        val botUserId: Long,
    ) : Function<Outline>() {
        override fun getConstructor(): Int = 583_470_479
    }

    class GetWebAppUrl(
        @JvmField
        val botUserId: Long,
        @JvmField
        val url: String,
        @JvmField
        val parameters: WebAppOpenParameters,
    ) : Function<HttpUrl>() {
        override fun getConstructor(): Int = -1_526_784_188
    }

    class GetWebPageInstantView(
        @JvmField
        val url: String,
        @JvmField
        val onlyLocal: Boolean,
    ) : Function<WebPageInstantView>() {
        override fun getConstructor(): Int = 1_741_395_197
    }

    class GiftPremiumWithStars(
        @JvmField
        val userId: Long,
        @JvmField
        val starCount: Long,
        @JvmField
        val monthCount: Int,
        @JvmField
        val text: FormattedText,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_058_395_432
    }

    class HideContactCloseBirthdays : Function<Ok>() {
        override fun getConstructor(): Int = -1_163_065_221
    }

    class HideSuggestedAction(
        @JvmField
        val action: SuggestedAction,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_561_384_065
    }

    class ImportContacts(
        @JvmField
        val contacts: Array<Contact>,
    ) : Function<ImportedContacts>() {
        override fun getConstructor(): Int = -215_132_767
    }

    class ImportMessages(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageFile: InputFile,
        @JvmField
        val attachedFiles: Array<InputFile>,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_864_116_784
    }

    class InviteGroupCallParticipant(
        @JvmField
        val groupCallId: Int,
        @JvmField
        val userId: Long,
        @JvmField
        val isVideo: Boolean,
    ) : Function<InviteGroupCallParticipantResult>() {
        override fun getConstructor(): Int = -631_535_414
    }

    class InviteVideoChatParticipants(
        @JvmField
        val groupCallId: Int,
        @JvmField
        val userIds: LongArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -473_149_298
    }

    class JoinChat(
        @JvmField
        val chatId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 326_769_313
    }

    class JoinChatByInviteLink(
        @JvmField
        val inviteLink: String,
    ) : Function<Chat>() {
        override fun getConstructor(): Int = -1_049_973_882
    }

    class JoinGroupCall(
        @JvmField
        val inputGroupCall: InputGroupCall,
        @JvmField
        val joinParameters: GroupCallJoinParameters,
    ) : Function<GroupCallInfo>() {
        override fun getConstructor(): Int = -2_026_079_917
    }

    class JoinVideoChat(
        @JvmField
        val groupCallId: Int,
        @JvmField
        val participantId: MessageSender?,
        @JvmField
        val joinParameters: GroupCallJoinParameters,
        @JvmField
        val inviteHash: String,
    ) : Function<Text>() {
        override fun getConstructor(): Int = 1_322_989_999
    }

    class LaunchPrepaidGiveaway(
        @JvmField
        val giveawayId: Long,
        @JvmField
        val parameters: GiveawayParameters,
        @JvmField
        val winnerCount: Int,
        @JvmField
        val starCount: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 639_465_530
    }

    class LeaveChat(
        @JvmField
        val chatId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_825_080_735
    }

    class LeaveGroupCall(
        @JvmField
        val groupCallId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 980_152_233
    }

    class LoadActiveStories(
        @JvmField
        val storyList: StoryList,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 2_106_390_328
    }

    class LoadChats(
        @JvmField
        val chatList: ChatList?,
        @JvmField
        val limit: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_885_635_205
    }

    class LoadDirectMessagesChatTopics(
        @JvmField
        val chatId: Long,
        @JvmField
        val limit: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_488_065_975
    }

    class LoadGroupCallParticipants(
        @JvmField
        val groupCallId: Int,
        @JvmField
        val limit: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 938_720_974
    }

    class LoadQuickReplyShortcutMessages(
        @JvmField
        val shortcutId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -46_092_588
    }

    class LoadQuickReplyShortcuts : Function<Ok>() {
        override fun getConstructor(): Int = -1_016_614_243
    }

    class LoadSavedMessagesTopics(
        @JvmField
        val limit: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 289_855_160
    }

    class LogOut : Function<Ok>() {
        override fun getConstructor(): Int = -1_581_923_301
    }

    class MarkChecklistTasksAsDone(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val markedAsDoneTaskIds: IntArray,
        @JvmField
        val markedAsNotDoneTaskIds: IntArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 386_950_739
    }

    class OpenBotSimilarBot(
        @JvmField
        val botUserId: Long,
        @JvmField
        val openedBotUserId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -369_688_872
    }

    class OpenChat(
        @JvmField
        val chatId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -323_371_509
    }

    class OpenChatSimilarChat(
        @JvmField
        val chatId: Long,
        @JvmField
        val openedChatId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_884_883_949
    }

    class OpenMessageContent(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -739_088_005
    }

    class OpenSponsoredChat(
        @JvmField
        val sponsoredChatUniqueId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 865_985_573
    }

    class OpenStory(
        @JvmField
        val storyPosterChatId: Long,
        @JvmField
        val storyId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -696_723_005
    }

    class OpenWebApp(
        @JvmField
        val chatId: Long,
        @JvmField
        val botUserId: Long,
        @JvmField
        val url: String,
        @JvmField
        val messageThreadId: Long,
        @JvmField
        val directMessagesChatTopicId: Long,
        @JvmField
        val replyTo: InputMessageReplyTo?,
        @JvmField
        val parameters: WebAppOpenParameters,
    ) : Function<WebAppInfo>() {
        override fun getConstructor(): Int = -2_103_994_738
    }

    class OptimizeStorage(
        @JvmField
        val size: Long,
        @JvmField
        val ttl: Int,
        @JvmField
        val count: Int,
        @JvmField
        val immunityDelay: Int,
        @JvmField
        val fileTypes: Array<FileType>,
        @JvmField
        val chatIds: LongArray,
        @JvmField
        val excludeChatIds: LongArray,
        @JvmField
        val returnDeletedFileStatistics: Boolean,
        @JvmField
        val chatLimit: Int,
    ) : Function<StorageStatistics>() {
        override fun getConstructor(): Int = 853_186_759
    }

    class ParseMarkdown(
        @JvmField
        val text: FormattedText,
    ) : Function<FormattedText>() {
        override fun getConstructor(): Int = 756_366_063
    }

    class ParseTextEntities(
        @JvmField
        val text: String,
        @JvmField
        val parseMode: TextParseMode,
    ) : Function<FormattedText>() {
        override fun getConstructor(): Int = -1_709_194_593
    }

    class PinChatMessage(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val disableNotification: Boolean,
        @JvmField
        val onlyForSelf: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 2_034_719_663
    }

    class PingProxy(
        @JvmField
        val proxyId: Int,
    ) : Function<Seconds>() {
        override fun getConstructor(): Int = -979_681_103
    }

    class PostStory(
        @JvmField
        val chatId: Long,
        @JvmField
        val content: InputStoryContent,
        @JvmField
        val areas: InputStoryAreas?,
        @JvmField
        val caption: FormattedText?,
        @JvmField
        val privacySettings: StoryPrivacySettings,
        @JvmField
        val activePeriod: Int,
        @JvmField
        val fromStoryFullId: StoryFullId?,
        @JvmField
        val isPostedToChatPage: Boolean,
        @JvmField
        val protectContent: Boolean,
    ) : Function<Story>() {
        override fun getConstructor(): Int = -257_605_513
    }

    class PreliminaryUploadFile(
        @JvmField
        val file: InputFile,
        @JvmField
        val fileType: FileType?,
        @JvmField
        val priority: Int,
    ) : Function<File>() {
        override fun getConstructor(): Int = 1_894_239_129
    }

    class ProcessChatFolderNewChats(
        @JvmField
        val chatFolderId: Int,
        @JvmField
        val addedChatIds: LongArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_498_280_672
    }

    class ProcessChatJoinRequest(
        @JvmField
        val chatId: Long,
        @JvmField
        val userId: Long,
        @JvmField
        val approve: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_004_876_963
    }

    class ProcessChatJoinRequests(
        @JvmField
        val chatId: Long,
        @JvmField
        val inviteLink: String,
        @JvmField
        val approve: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_048_722_894
    }

    class ProcessPushNotification(
        @JvmField
        val payload: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 786_679_952
    }

    class RateSpeechRecognition(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val isGood: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -287_521_867
    }

    class ReadAllChatMentions(
        @JvmField
        val chatId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_357_558_453
    }

    class ReadAllChatReactions(
        @JvmField
        val chatId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_421_973_357
    }

    class ReadAllDirectMessagesChatTopicReactions(
        @JvmField
        val chatId: Long,
        @JvmField
        val topicId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_154_665_542
    }

    class ReadAllMessageThreadMentions(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageThreadId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_323_136_341
    }

    class ReadAllMessageThreadReactions(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageThreadId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -792_975_554
    }

    class ReadBusinessMessage(
        @JvmField
        val businessConnectionId: String,
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_723_531_538
    }

    class ReadChatList(
        @JvmField
        val chatList: ChatList,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_117_480_790
    }

    class ReadFilePart(
        @JvmField
        val fileId: Int,
        @JvmField
        val offset: Long,
        @JvmField
        val count: Long,
    ) : Function<Data>() {
        override fun getConstructor(): Int = -174_576_822
    }

    class ReaddQuickReplyShortcutMessages(
        @JvmField
        val shortcutName: String,
        @JvmField
        val messageIds: LongArray,
    ) : Function<QuickReplyMessages>() {
        override fun getConstructor(): Int = 387_399_566
    }

    class RecognizeSpeech(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_741_947_577
    }

    class RecoverAuthenticationPassword(
        @JvmField
        val recoveryCode: String,
        @JvmField
        val newPassword: String,
        @JvmField
        val newHint: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -131_001_053
    }

    class RecoverPassword(
        @JvmField
        val recoveryCode: String,
        @JvmField
        val newPassword: String,
        @JvmField
        val newHint: String,
    ) : Function<PasswordState>() {
        override fun getConstructor(): Int = -1_524_262_541
    }

    class RefundStarPayment(
        @JvmField
        val userId: Long,
        @JvmField
        val telegramPaymentChargeId: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_804_165_035
    }

    class RegisterDevice(
        @JvmField
        val deviceToken: DeviceToken,
        @JvmField
        val otherUserIds: LongArray,
    ) : Function<PushReceiverId>() {
        override fun getConstructor(): Int = 366_088_823
    }

    class RegisterUser(
        @JvmField
        val firstName: String,
        @JvmField
        val lastName: String,
        @JvmField
        val disableNotification: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_012_247_828
    }

    class RemoveAllFilesFromDownloads(
        @JvmField
        val onlyActive: Boolean,
        @JvmField
        val onlyCompleted: Boolean,
        @JvmField
        val deleteFromCache: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_186_433_402
    }

    class RemoveBusinessConnectedBotFromChat(
        @JvmField
        val chatId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 2_020_766_707
    }

    class RemoveChatActionBar(
        @JvmField
        val chatId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_650_968_070
    }

    class RemoveContacts(
        @JvmField
        val userIds: LongArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_943_858_054
    }

    class RemoveFavoriteSticker(
        @JvmField
        val sticker: InputFile,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_152_945_264
    }

    class RemoveFileFromDownloads(
        @JvmField
        val fileId: Int,
        @JvmField
        val deleteFromCache: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_460_060_142
    }

    class RemoveInstalledBackground(
        @JvmField
        val backgroundId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_346_446_652
    }

    class RemoveMessageReaction(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val reactionType: ReactionType,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_756_934_789
    }

    class RemoveMessageSenderBotVerification(
        @JvmField
        val botUserId: Long,
        @JvmField
        val verifiedId: MessageSender,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_710_174_374
    }

    class RemoveNotification(
        @JvmField
        val notificationGroupId: Int,
        @JvmField
        val notificationId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 862_630_734
    }

    class RemoveNotificationGroup(
        @JvmField
        val notificationGroupId: Int,
        @JvmField
        val maxNotificationId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_713_005_454
    }

    class RemovePendingPaidMessageReactions(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_100_258_555
    }

    class RemoveProxy(
        @JvmField
        val proxyId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_369_219_847
    }

    class RemoveRecentHashtag(
        @JvmField
        val hashtag: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_013_735_260
    }

    class RemoveRecentSticker(
        @JvmField
        val isAttached: Boolean,
        @JvmField
        val sticker: InputFile,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_246_577_677
    }

    class RemoveRecentlyFoundChat(
        @JvmField
        val chatId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 717_340_444
    }

    class RemoveSavedAnimation(
        @JvmField
        val animation: InputFile,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -495_605_479
    }

    class RemoveSavedNotificationSound(
        @JvmField
        val notificationSoundId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -480_032_946
    }

    class RemoveSearchedForTag(
        @JvmField
        val tag: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 891_382_730
    }

    class RemoveStickerFromSet(
        @JvmField
        val sticker: InputFile,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_642_196_644
    }

    class RemoveTopChat(
        @JvmField
        val category: TopChatCategory,
        @JvmField
        val chatId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_907_876_267
    }

    class ReorderActiveUsernames(
        @JvmField
        val usernames: Array<String>,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -455_399_375
    }

    class ReorderBotActiveUsernames(
        @JvmField
        val botUserId: Long,
        @JvmField
        val usernames: Array<String>,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_602_301_664
    }

    class ReorderBotMediaPreviews(
        @JvmField
        val botUserId: Long,
        @JvmField
        val languageCode: String,
        @JvmField
        val fileIds: IntArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 630_851_043
    }

    class ReorderChatFolders(
        @JvmField
        val chatFolderIds: IntArray,
        @JvmField
        val mainChatListPosition: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_665_299_546
    }

    class ReorderInstalledStickerSets(
        @JvmField
        val stickerType: StickerType,
        @JvmField
        val stickerSetIds: LongArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_074_928_158
    }

    class ReorderQuickReplyShortcuts(
        @JvmField
        val shortcutIds: IntArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_052_799_232
    }

    class ReorderSupergroupActiveUsernames(
        @JvmField
        val supergroupId: Long,
        @JvmField
        val usernames: Array<String>,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_962_466_095
    }

    class ReplacePrimaryChatInviteLink(
        @JvmField
        val chatId: Long,
    ) : Function<ChatInviteLink>() {
        override fun getConstructor(): Int = 1_067_350_941
    }

    class ReplaceStickerInSet(
        @JvmField
        val userId: Long,
        @JvmField
        val name: String,
        @JvmField
        val oldSticker: InputFile,
        @JvmField
        val newSticker: InputSticker,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -406_311_399
    }

    class ReplaceVideoChatRtmpUrl(
        @JvmField
        val chatId: Long,
    ) : Function<RtmpUrl>() {
        override fun getConstructor(): Int = 558_862_304
    }

    class ReportAuthenticationCodeMissing(
        @JvmField
        val mobileNetworkCode: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_846_555_064
    }

    class ReportChat(
        @JvmField
        val chatId: Long,
        @JvmField
        val optionId: ByteArray,
        @JvmField
        val messageIds: LongArray,
        @JvmField
        val text: String,
    ) : Function<ReportChatResult>() {
        override fun getConstructor(): Int = 1_058_475_058
    }

    class ReportChatPhoto(
        @JvmField
        val chatId: Long,
        @JvmField
        val fileId: Int,
        @JvmField
        val reason: ReportReason,
        @JvmField
        val text: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -646_966_648
    }

    class ReportChatSponsoredMessage(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val optionId: ByteArray,
    ) : Function<ReportSponsoredResult>() {
        override fun getConstructor(): Int = -979_984_820
    }

    class ReportMessageReactions(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val senderId: MessageSender,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 919_111_719
    }

    class ReportPhoneNumberCodeMissing(
        @JvmField
        val mobileNetworkCode: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -895_175_341
    }

    class ReportSponsoredChat(
        @JvmField
        val sponsoredChatUniqueId: Long,
        @JvmField
        val optionId: ByteArray,
    ) : Function<ReportSponsoredResult>() {
        override fun getConstructor(): Int = -902_673_019
    }

    class ReportStory(
        @JvmField
        val storyPosterChatId: Long,
        @JvmField
        val storyId: Int,
        @JvmField
        val optionId: ByteArray,
        @JvmField
        val text: String,
    ) : Function<ReportStoryResult>() {
        override fun getConstructor(): Int = 1_823_256_372
    }

    class ReportSupergroupAntiSpamFalsePositive(
        @JvmField
        val supergroupId: Long,
        @JvmField
        val messageId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -516_050_872
    }

    class ReportSupergroupSpam(
        @JvmField
        val supergroupId: Long,
        @JvmField
        val messageIds: LongArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -94_825_000
    }

    class ReportVideoMessageAdvertisement(
        @JvmField
        val advertisementUniqueId: Long,
        @JvmField
        val optionId: ByteArray,
    ) : Function<ReportSponsoredResult>() {
        override fun getConstructor(): Int = 617_137_942
    }

    class RequestAuthenticationPasswordRecovery : Function<Ok>() {
        override fun getConstructor(): Int = 1_393_896_118
    }

    class RequestPasswordRecovery : Function<EmailAddressAuthenticationCodeInfo>() {
        override fun getConstructor(): Int = -13_777_582
    }

    class RequestQrCodeAuthentication(
        @JvmField
        val otherUserIds: LongArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_363_496_527
    }

    class ResendAuthenticationCode(
        @JvmField
        val reason: ResendCodeReason?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_506_755_656
    }

    class ResendEmailAddressVerificationCode : Function<EmailAddressAuthenticationCodeInfo>() {
        override fun getConstructor(): Int = -1_872_416_732
    }

    class ResendLoginEmailAddressCode : Function<EmailAddressAuthenticationCodeInfo>() {
        override fun getConstructor(): Int = 292_966_933
    }

    class ResendMessages(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageIds: LongArray,
        @JvmField
        val quote: InputTextQuote?,
        @JvmField
        val paidMessageStarCount: Long,
    ) : Function<Messages>() {
        override fun getConstructor(): Int = 526_374_678
    }

    class ResendPhoneNumberCode(
        @JvmField
        val reason: ResendCodeReason?,
    ) : Function<AuthenticationCodeInfo>() {
        override fun getConstructor(): Int = 1_808_704_551
    }

    class ResendRecoveryEmailAddressCode : Function<PasswordState>() {
        override fun getConstructor(): Int = 433_483_548
    }

    class ResetAllNotificationSettings : Function<Ok>() {
        override fun getConstructor(): Int = -174_020_359
    }

    class ResetAuthenticationEmailAddress : Function<Ok>() {
        override fun getConstructor(): Int = -415_075_796
    }

    class ResetInstalledBackgrounds : Function<Ok>() {
        override fun getConstructor(): Int = 1_884_553_559
    }

    class ResetNetworkStatistics : Function<Ok>() {
        override fun getConstructor(): Int = 1_646_452_102
    }

    class ResetPassword : Function<ResetPasswordResult>() {
        override fun getConstructor(): Int = -593_589_091
    }

    class ReuseStarSubscription(
        @JvmField
        val subscriptionId: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 778_531_905
    }

    class RevokeChatInviteLink(
        @JvmField
        val chatId: Long,
        @JvmField
        val inviteLink: String,
    ) : Function<ChatInviteLinks>() {
        override fun getConstructor(): Int = -776_514_135
    }

    class RevokeGroupCallInviteLink(
        @JvmField
        val groupCallId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 501_589_140
    }

    class SaveApplicationLogEvent(
        @JvmField
        val type: String,
        @JvmField
        val chatId: Long,
        @JvmField
        val data: JsonValue,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -811_154_930
    }

    class SavePreparedInlineMessage(
        @JvmField
        val userId: Long,
        @JvmField
        val result: InputInlineQueryResult,
        @JvmField
        val chatTypes: TargetChatTypes,
    ) : Function<PreparedInlineMessageId>() {
        override fun getConstructor(): Int = -954_963_751
    }

    class SearchAffiliatePrograms(
        @JvmField
        val affiliate: AffiliateType,
        @JvmField
        val sortOrder: AffiliateProgramSortOrder,
        @JvmField
        val offset: String,
        @JvmField
        val limit: Int,
    ) : Function<FoundAffiliatePrograms>() {
        override fun getConstructor(): Int = 681_156_625
    }

    class SearchBackground(
        @JvmField
        val name: String,
    ) : Function<Background>() {
        override fun getConstructor(): Int = -2_130_996_959
    }

    class SearchCallMessages(
        @JvmField
        val offset: String,
        @JvmField
        val limit: Int,
        @JvmField
        val onlyMissed: Boolean,
    ) : Function<FoundMessages>() {
        override fun getConstructor(): Int = -1_942_229_221
    }

    class SearchChatAffiliateProgram(
        @JvmField
        val username: String,
        @JvmField
        val referrer: String,
    ) : Function<Chat>() {
        override fun getConstructor(): Int = -1_339_291_206
    }

    class SearchChatMembers(
        @JvmField
        val chatId: Long,
        @JvmField
        val query: String,
        @JvmField
        val limit: Int,
        @JvmField
        val filter: ChatMembersFilter?,
    ) : Function<ChatMembers>() {
        override fun getConstructor(): Int = -445_823_291
    }

    class SearchChatMessages(
        @JvmField
        val chatId: Long,
        @JvmField
        val topicId: MessageTopic?,
        @JvmField
        val query: String,
        @JvmField
        val senderId: MessageSender?,
        @JvmField
        val fromMessageId: Long,
        @JvmField
        val offset: Int,
        @JvmField
        val limit: Int,
        @JvmField
        val filter: SearchMessagesFilter?,
    ) : Function<FoundChatMessages>() {
        override fun getConstructor(): Int = 1_072_442_212
    }

    class SearchChatRecentLocationMessages(
        @JvmField
        val chatId: Long,
        @JvmField
        val limit: Int,
    ) : Function<Messages>() {
        override fun getConstructor(): Int = 950_238_950
    }

    class SearchChats(
        @JvmField
        val query: String,
        @JvmField
        val limit: Int,
    ) : Function<Chats>() {
        override fun getConstructor(): Int = -1_879_787_060
    }

    class SearchChatsOnServer(
        @JvmField
        val query: String,
        @JvmField
        val limit: Int,
    ) : Function<Chats>() {
        override fun getConstructor(): Int = -1_158_402_188
    }

    class SearchContacts(
        @JvmField
        val query: String,
        @JvmField
        val limit: Int,
    ) : Function<Users>() {
        override fun getConstructor(): Int = -1_794_690_715
    }

    class SearchEmojis(
        @JvmField
        val text: String,
        @JvmField
        val inputLanguageCodes: Array<String>,
    ) : Function<EmojiKeywords>() {
        override fun getConstructor(): Int = -1_456_187_668
    }

    class SearchFileDownloads(
        @JvmField
        val query: String,
        @JvmField
        val onlyActive: Boolean,
        @JvmField
        val onlyCompleted: Boolean,
        @JvmField
        val offset: String,
        @JvmField
        val limit: Int,
    ) : Function<FoundFileDownloads>() {
        override fun getConstructor(): Int = 706_611_286
    }

    class SearchGiftsForResale(
        @JvmField
        val giftId: Long,
        @JvmField
        val order: GiftForResaleOrder,
        @JvmField
        val attributes: Array<UpgradedGiftAttributeId>,
        @JvmField
        val offset: String,
        @JvmField
        val limit: Int,
    ) : Function<GiftsForResale>() {
        override fun getConstructor(): Int = 1_659_300_894
    }

    class SearchHashtags(
        @JvmField
        val prefix: String,
        @JvmField
        val limit: Int,
    ) : Function<Hashtags>() {
        override fun getConstructor(): Int = 1_043_637_617
    }

    class SearchInstalledStickerSets(
        @JvmField
        val stickerType: StickerType,
        @JvmField
        val query: String,
        @JvmField
        val limit: Int,
    ) : Function<StickerSets>() {
        override fun getConstructor(): Int = 2_120_122_276
    }

    class SearchMessages(
        @JvmField
        val chatList: ChatList?,
        @JvmField
        val query: String,
        @JvmField
        val offset: String,
        @JvmField
        val limit: Int,
        @JvmField
        val filter: SearchMessagesFilter?,
        @JvmField
        val chatTypeFilter: SearchMessagesChatTypeFilter?,
        @JvmField
        val minDate: Int,
        @JvmField
        val maxDate: Int,
    ) : Function<FoundMessages>() {
        override fun getConstructor(): Int = 1_225_448_885
    }

    class SearchOutgoingDocumentMessages(
        @JvmField
        val query: String,
        @JvmField
        val limit: Int,
    ) : Function<FoundMessages>() {
        override fun getConstructor(): Int = -1_071_397_762
    }

    class SearchPublicChat(
        @JvmField
        val username: String,
    ) : Function<Chat>() {
        override fun getConstructor(): Int = 857_135_533
    }

    class SearchPublicChats(
        @JvmField
        val query: String,
    ) : Function<Chats>() {
        override fun getConstructor(): Int = 970_385_337
    }

    class SearchPublicMessagesByTag(
        @JvmField
        val tag: String,
        @JvmField
        val offset: String,
        @JvmField
        val limit: Int,
    ) : Function<FoundMessages>() {
        override fun getConstructor(): Int = 630_680_746
    }

    class SearchPublicStoriesByLocation(
        @JvmField
        val address: LocationAddress,
        @JvmField
        val offset: String,
        @JvmField
        val limit: Int,
    ) : Function<FoundStories>() {
        override fun getConstructor(): Int = 1_596_709_256
    }

    class SearchPublicStoriesByTag(
        @JvmField
        val storyPosterChatId: Long,
        @JvmField
        val tag: String,
        @JvmField
        val offset: String,
        @JvmField
        val limit: Int,
    ) : Function<FoundStories>() {
        override fun getConstructor(): Int = 1_778_102_602
    }

    class SearchPublicStoriesByVenue(
        @JvmField
        val venueProvider: String,
        @JvmField
        val venueId: String,
        @JvmField
        val offset: String,
        @JvmField
        val limit: Int,
    ) : Function<FoundStories>() {
        override fun getConstructor(): Int = -686_136_790
    }

    class SearchQuote(
        @JvmField
        val text: FormattedText,
        @JvmField
        val quote: FormattedText,
        @JvmField
        val quotePosition: Int,
    ) : Function<FoundPosition>() {
        override fun getConstructor(): Int = 1_751_384_351
    }

    class SearchRecentlyFoundChats(
        @JvmField
        val query: String,
        @JvmField
        val limit: Int,
    ) : Function<Chats>() {
        override fun getConstructor(): Int = 1_647_445_393
    }

    class SearchSavedMessages(
        @JvmField
        val savedMessagesTopicId: Long,
        @JvmField
        val tag: ReactionType?,
        @JvmField
        val query: String,
        @JvmField
        val fromMessageId: Long,
        @JvmField
        val offset: Int,
        @JvmField
        val limit: Int,
    ) : Function<FoundChatMessages>() {
        override fun getConstructor(): Int = -1_969_512_554
    }

    class SearchSecretMessages(
        @JvmField
        val chatId: Long,
        @JvmField
        val query: String,
        @JvmField
        val offset: String,
        @JvmField
        val limit: Int,
        @JvmField
        val filter: SearchMessagesFilter?,
    ) : Function<FoundMessages>() {
        override fun getConstructor(): Int = -852_865_892
    }

    class SearchStickerSet(
        @JvmField
        val name: String,
        @JvmField
        val ignoreCache: Boolean,
    ) : Function<StickerSet>() {
        override fun getConstructor(): Int = 1_676_592_898
    }

    class SearchStickerSets(
        @JvmField
        val stickerType: StickerType,
        @JvmField
        val query: String,
    ) : Function<StickerSets>() {
        override fun getConstructor(): Int = 262_801_004
    }

    class SearchStickers(
        @JvmField
        val stickerType: StickerType,
        @JvmField
        val emojis: String,
        @JvmField
        val query: String,
        @JvmField
        val inputLanguageCodes: Array<String>,
        @JvmField
        val offset: Int,
        @JvmField
        val limit: Int,
    ) : Function<Stickers>() {
        override fun getConstructor(): Int = -1_856_294_754
    }

    class SearchStringsByPrefix(
        @JvmField
        val strings: Array<String>,
        @JvmField
        val query: String,
        @JvmField
        val limit: Int,
        @JvmField
        val returnNoneForEmptyQuery: Boolean,
    ) : Function<FoundPositions>() {
        override fun getConstructor(): Int = -2_023_251_463
    }

    class SearchUserByPhoneNumber(
        @JvmField
        val phoneNumber: String,
        @JvmField
        val onlyLocal: Boolean,
    ) : Function<User>() {
        override fun getConstructor(): Int = -343_757_368
    }

    class SearchUserByToken(
        @JvmField
        val token: String,
    ) : Function<User>() {
        override fun getConstructor(): Int = -666_766_282
    }

    class SearchWebApp(
        @JvmField
        val botUserId: Long,
        @JvmField
        val webAppShortName: String,
    ) : Function<FoundWebApp>() {
        override fun getConstructor(): Int = -1_241_740_747
    }

    class SellGift(
        @JvmField
        val businessConnectionId: String,
        @JvmField
        val receivedGiftId: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -298_298_375
    }

    class SendAuthenticationFirebaseSms(
        @JvmField
        val token: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 364_994_111
    }

    class SendBotStartMessage(
        @JvmField
        val botUserId: Long,
        @JvmField
        val chatId: Long,
        @JvmField
        val parameter: String,
    ) : Function<Message>() {
        override fun getConstructor(): Int = -1_435_877_650
    }

    class SendBusinessMessage(
        @JvmField
        val businessConnectionId: String,
        @JvmField
        val chatId: Long,
        @JvmField
        val replyTo: InputMessageReplyTo?,
        @JvmField
        val disableNotification: Boolean,
        @JvmField
        val protectContent: Boolean,
        @JvmField
        val effectId: Long,
        @JvmField
        val replyMarkup: ReplyMarkup?,
        @JvmField
        val inputMessageContent: InputMessageContent,
    ) : Function<BusinessMessage>() {
        override fun getConstructor(): Int = 159_888_387
    }

    class SendBusinessMessageAlbum(
        @JvmField
        val businessConnectionId: String,
        @JvmField
        val chatId: Long,
        @JvmField
        val replyTo: InputMessageReplyTo?,
        @JvmField
        val disableNotification: Boolean,
        @JvmField
        val protectContent: Boolean,
        @JvmField
        val effectId: Long,
        @JvmField
        val inputMessageContents: Array<InputMessageContent>,
    ) : Function<BusinessMessages>() {
        override fun getConstructor(): Int = 788_608_366
    }

    class SendCallDebugInformation(
        @JvmField
        val callId: Int,
        @JvmField
        val debugInformation: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 2_019_243_839
    }

    class SendCallLog(
        @JvmField
        val callId: Int,
        @JvmField
        val logFile: InputFile,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_057_638_353
    }

    class SendCallRating(
        @JvmField
        val callId: Int,
        @JvmField
        val rating: Int,
        @JvmField
        val comment: String,
        @JvmField
        val problems: Array<CallProblem>,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_402_719_502
    }

    class SendCallSignalingData(
        @JvmField
        val callId: Int,
        @JvmField
        val data: ByteArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_412_280_732
    }

    class SendChatAction(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageThreadId: Long,
        @JvmField
        val businessConnectionId: String,
        @JvmField
        val action: ChatAction?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_010_910_050
    }

    class SendCustomRequest(
        @JvmField
        val method: String,
        @JvmField
        val parameters: String,
    ) : Function<CustomRequestResult>() {
        override fun getConstructor(): Int = 285_045_153
    }

    class SendEmailAddressVerificationCode(
        @JvmField
        val emailAddress: String,
    ) : Function<EmailAddressAuthenticationCodeInfo>() {
        override fun getConstructor(): Int = -221_621_379
    }

    class SendGift(
        @JvmField
        val giftId: Long,
        @JvmField
        val ownerId: MessageSender,
        @JvmField
        val text: FormattedText,
        @JvmField
        val isPrivate: Boolean,
        @JvmField
        val payForUpgrade: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_199_356_118
    }

    class SendInlineQueryResultMessage(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageThreadId: Long,
        @JvmField
        val replyTo: InputMessageReplyTo?,
        @JvmField
        val options: MessageSendOptions?,
        @JvmField
        val queryId: Long,
        @JvmField
        val resultId: String,
        @JvmField
        val hideViaBot: Boolean,
    ) : Function<Message>() {
        override fun getConstructor(): Int = 1_182_553_208
    }

    class SendMessage(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageThreadId: Long,
        @JvmField
        val replyTo: InputMessageReplyTo?,
        @JvmField
        val options: MessageSendOptions?,
        @JvmField
        val replyMarkup: ReplyMarkup?,
        @JvmField
        val inputMessageContent: InputMessageContent,
    ) : Function<Message>() {
        override fun getConstructor(): Int = -533_921_303
    }

    class SendMessageAlbum(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageThreadId: Long,
        @JvmField
        val replyTo: InputMessageReplyTo?,
        @JvmField
        val options: MessageSendOptions?,
        @JvmField
        val inputMessageContents: Array<InputMessageContent>,
    ) : Function<Messages>() {
        override fun getConstructor(): Int = -1_985_013_029
    }

    class SendPassportAuthorizationForm(
        @JvmField
        val authorizationFormId: Int,
        @JvmField
        val types: Array<PassportElementType>,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 652_160_701
    }

    class SendPaymentForm(
        @JvmField
        val inputInvoice: InputInvoice,
        @JvmField
        val paymentFormId: Long,
        @JvmField
        val orderInfoId: String,
        @JvmField
        val shippingOptionId: String,
        @JvmField
        val credentials: InputCredentials?,
        @JvmField
        val tipAmount: Long,
    ) : Function<PaymentResult>() {
        override fun getConstructor(): Int = -965_855_094
    }

    class SendPhoneNumberCode(
        @JvmField
        val phoneNumber: String,
        @JvmField
        val settings: PhoneNumberAuthenticationSettings?,
        @JvmField
        val type: PhoneNumberCodeType,
    ) : Function<AuthenticationCodeInfo>() {
        override fun getConstructor(): Int = 1_084_112_144
    }

    class SendPhoneNumberFirebaseSms(
        @JvmField
        val token: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 261_910_660
    }

    class SendQuickReplyShortcutMessages(
        @JvmField
        val chatId: Long,
        @JvmField
        val shortcutId: Int,
        @JvmField
        val sendingId: Int,
    ) : Function<Messages>() {
        override fun getConstructor(): Int = 232_068_765
    }

    class SendResoldGift(
        @JvmField
        val giftName: String,
        @JvmField
        val ownerId: MessageSender,
        @JvmField
        val starCount: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_284_812_948
    }

    class SendWebAppCustomRequest(
        @JvmField
        val botUserId: Long,
        @JvmField
        val method: String,
        @JvmField
        val parameters: String,
    ) : Function<CustomRequestResult>() {
        override fun getConstructor(): Int = 922_705_352
    }

    class SendWebAppData(
        @JvmField
        val botUserId: Long,
        @JvmField
        val buttonText: String,
        @JvmField
        val data: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_423_978_996
    }

    class SetAccentColor(
        @JvmField
        val accentColorId: Int,
        @JvmField
        val backgroundCustomEmojiId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_669_974_841
    }

    class SetAccountTtl(
        @JvmField
        val ttl: AccountTtl,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 701_389_032
    }

    class SetAlarm(
        @JvmField
        val seconds: Double,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -873_497_067
    }

    class SetApplicationVerificationToken(
        @JvmField
        val verificationId: Long,
        @JvmField
        val token: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 927_248_261
    }

    class SetArchiveChatListSettings(
        @JvmField
        val settings: ArchiveChatListSettings,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -884_650_998
    }

    class SetAuthenticationEmailAddress(
        @JvmField
        val emailAddress: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_773_323_522
    }

    class SetAuthenticationPhoneNumber(
        @JvmField
        val phoneNumber: String,
        @JvmField
        val settings: PhoneNumberAuthenticationSettings?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 868_276_259
    }

    class SetAuthenticationPremiumPurchaseTransaction(
        @JvmField
        val transaction: StoreTransaction,
        @JvmField
        val isRestore: Boolean,
        @JvmField
        val currency: String,
        @JvmField
        val amount: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -450_986_887
    }

    class SetAutoDownloadSettings(
        @JvmField
        val settings: AutoDownloadSettings,
        @JvmField
        val type: NetworkType,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -353_671_948
    }

    class SetAutosaveSettings(
        @JvmField
        val scope: AutosaveSettingsScope,
        @JvmField
        val settings: ScopeAutosaveSettings?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 6_846_656
    }

    class SetBio(
        @JvmField
        val bio: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_619_582_124
    }

    class SetBirthdate(
        @JvmField
        val birthdate: Birthdate?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_319_755_160
    }

    class SetBotInfoDescription(
        @JvmField
        val botUserId: Long,
        @JvmField
        val languageCode: String,
        @JvmField
        val description: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 693_574_984
    }

    class SetBotInfoShortDescription(
        @JvmField
        val botUserId: Long,
        @JvmField
        val languageCode: String,
        @JvmField
        val shortDescription: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 982_956_771
    }

    class SetBotName(
        @JvmField
        val botUserId: Long,
        @JvmField
        val languageCode: String,
        @JvmField
        val name: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -761_922_959
    }

    class SetBotProfilePhoto(
        @JvmField
        val botUserId: Long,
        @JvmField
        val photo: InputChatPhoto?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_115_272_346
    }

    class SetBotUpdatesStatus(
        @JvmField
        val pendingUpdateCount: Int,
        @JvmField
        val errorMessage: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_154_926_191
    }

    class SetBusinessAccountBio(
        @JvmField
        val businessConnectionId: String,
        @JvmField
        val bio: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_698_538_041
    }

    class SetBusinessAccountGiftSettings(
        @JvmField
        val businessConnectionId: String,
        @JvmField
        val settings: GiftSettings,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_757_763_090
    }

    class SetBusinessAccountName(
        @JvmField
        val businessConnectionId: String,
        @JvmField
        val firstName: String,
        @JvmField
        val lastName: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 999_582_546
    }

    class SetBusinessAccountProfilePhoto(
        @JvmField
        val businessConnectionId: String,
        @JvmField
        val photo: InputChatPhoto?,
        @JvmField
        val isPublic: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_174_440_149
    }

    class SetBusinessAccountUsername(
        @JvmField
        val businessConnectionId: String,
        @JvmField
        val username: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_520_126_367
    }

    class SetBusinessAwayMessageSettings(
        @JvmField
        val awayMessageSettings: BusinessAwayMessageSettings?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_232_357_484
    }

    class SetBusinessConnectedBot(
        @JvmField
        val bot: BusinessConnectedBot,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_393_459_472
    }

    class SetBusinessGreetingMessageSettings(
        @JvmField
        val greetingMessageSettings: BusinessGreetingMessageSettings?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -873_120_707
    }

    class SetBusinessLocation(
        @JvmField
        val location: BusinessLocation?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -344_717_547
    }

    class SetBusinessMessageIsPinned(
        @JvmField
        val businessConnectionId: String,
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val isPinned: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -15_403_536
    }

    class SetBusinessOpeningHours(
        @JvmField
        val openingHours: BusinessOpeningHours?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -462_379_918
    }

    class SetBusinessStartPage(
        @JvmField
        val startPage: InputBusinessStartPage?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_628_616_290
    }

    class SetChatAccentColor(
        @JvmField
        val chatId: Long,
        @JvmField
        val accentColorId: Int,
        @JvmField
        val backgroundCustomEmojiId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 882_857_930
    }

    class SetChatActiveStoriesList(
        @JvmField
        val chatId: Long,
        @JvmField
        val storyList: StoryList,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -521_970_415
    }

    class SetChatAffiliateProgram(
        @JvmField
        val chatId: Long,
        @JvmField
        val parameters: AffiliateProgramParameters?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 14_680_631
    }

    class SetChatAvailableReactions(
        @JvmField
        val chatId: Long,
        @JvmField
        val availableReactions: ChatAvailableReactions,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 267_075_078
    }

    class SetChatBackground(
        @JvmField
        val chatId: Long,
        @JvmField
        val background: InputBackground?,
        @JvmField
        val type: BackgroundType?,
        @JvmField
        val darkThemeDimming: Int,
        @JvmField
        val onlyForSelf: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 246_727_678
    }

    class SetChatClientData(
        @JvmField
        val chatId: Long,
        @JvmField
        val clientData: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -827_119_811
    }

    class SetChatDescription(
        @JvmField
        val chatId: Long,
        @JvmField
        val description: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_957_213_277
    }

    class SetChatDirectMessagesGroup(
        @JvmField
        val chatId: Long,
        @JvmField
        val isEnabled: Boolean,
        @JvmField
        val paidMessageStarCount: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_633_150_115
    }

    class SetChatDiscussionGroup(
        @JvmField
        val chatId: Long,
        @JvmField
        val discussionChatId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -918_801_736
    }

    class SetChatDraftMessage(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageThreadId: Long,
        @JvmField
        val draftMessage: DraftMessage?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_683_889_946
    }

    class SetChatEmojiStatus(
        @JvmField
        val chatId: Long,
        @JvmField
        val emojiStatus: EmojiStatus?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_434_982_674
    }

    class SetChatLocation(
        @JvmField
        val chatId: Long,
        @JvmField
        val location: ChatLocation,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -767_091_286
    }

    class SetChatMemberStatus(
        @JvmField
        val chatId: Long,
        @JvmField
        val memberId: MessageSender,
        @JvmField
        val status: ChatMemberStatus,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 81_794_847
    }

    class SetChatMessageAutoDeleteTime(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageAutoDeleteTime: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_505_643_265
    }

    class SetChatMessageSender(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageSenderId: MessageSender,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_421_513_858
    }

    class SetChatNotificationSettings(
        @JvmField
        val chatId: Long,
        @JvmField
        val notificationSettings: ChatNotificationSettings,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 777_199_614
    }

    class SetChatPaidMessageStarCount(
        @JvmField
        val chatId: Long,
        @JvmField
        val paidMessageStarCount: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_187_053_289
    }

    class SetChatPermissions(
        @JvmField
        val chatId: Long,
        @JvmField
        val permissions: ChatPermissions,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 2_138_507_006
    }

    class SetChatPhoto(
        @JvmField
        val chatId: Long,
        @JvmField
        val photo: InputChatPhoto?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -377_778_941
    }

    class SetChatPinnedStories(
        @JvmField
        val chatId: Long,
        @JvmField
        val storyIds: IntArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -669_062_355
    }

    class SetChatProfileAccentColor(
        @JvmField
        val chatId: Long,
        @JvmField
        val profileAccentColorId: Int,
        @JvmField
        val profileBackgroundCustomEmojiId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_109_896_826
    }

    class SetChatSlowModeDelay(
        @JvmField
        val chatId: Long,
        @JvmField
        val slowModeDelay: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -540_350_914
    }

    class SetChatTheme(
        @JvmField
        val chatId: Long,
        @JvmField
        val themeName: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_895_234_925
    }

    class SetChatTitle(
        @JvmField
        val chatId: Long,
        @JvmField
        val title: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 164_282_047
    }

    class SetCloseFriends(
        @JvmField
        val userIds: LongArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_908_013_258
    }

    class SetCommands(
        @JvmField
        val scope: BotCommandScope?,
        @JvmField
        val languageCode: String,
        @JvmField
        val commands: Array<BotCommand>,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -907_165_606
    }

    class SetCustomEmojiStickerSetThumbnail(
        @JvmField
        val name: String,
        @JvmField
        val customEmojiId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_122_836_246
    }

    class SetCustomLanguagePack(
        @JvmField
        val info: LanguagePackInfo,
        @JvmField
        val strings: Array<LanguagePackString>,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -296_742_819
    }

    class SetCustomLanguagePackString(
        @JvmField
        val languagePackId: String,
        @JvmField
        val newString: LanguagePackString,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_316_365_592
    }

    class SetDatabaseEncryptionKey(
        @JvmField
        val newEncryptionKey: ByteArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_204_599_371
    }

    class SetDefaultBackground(
        @JvmField
        val background: InputBackground?,
        @JvmField
        val type: BackgroundType?,
        @JvmField
        val forDarkTheme: Boolean,
    ) : Function<Background>() {
        override fun getConstructor(): Int = -1_982_748_511
    }

    class SetDefaultChannelAdministratorRights(
        @JvmField
        val defaultChannelAdministratorRights: ChatAdministratorRights?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -234_004_967
    }

    class SetDefaultGroupAdministratorRights(
        @JvmField
        val defaultGroupAdministratorRights: ChatAdministratorRights?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_700_231_016
    }

    class SetDefaultMessageAutoDeleteTime(
        @JvmField
        val messageAutoDeleteTime: MessageAutoDeleteTime,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_772_301_460
    }

    class SetDefaultReactionType(
        @JvmField
        val reactionType: ReactionType,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_694_730_813
    }

    class SetDirectMessagesChatTopicDraftMessage(
        @JvmField
        val chatId: Long,
        @JvmField
        val topicId: Long,
        @JvmField
        val draftMessage: DraftMessage?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 603_635_002
    }

    class SetDirectMessagesChatTopicIsMarkedAsUnread(
        @JvmField
        val chatId: Long,
        @JvmField
        val topicId: Long,
        @JvmField
        val isMarkedAsUnread: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_569_655_059
    }

    class SetEmojiStatus(
        @JvmField
        val emojiStatus: EmojiStatus?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_829_224_867
    }

    class SetFileGenerationProgress(
        @JvmField
        val generationId: Long,
        @JvmField
        val expectedSize: Long,
        @JvmField
        val localPrefixSize: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_836_403_518
    }

    class SetForumTopicNotificationSettings(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageThreadId: Long,
        @JvmField
        val notificationSettings: ChatNotificationSettings,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 524_498_023
    }

    class SetGameScore(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val editMessage: Boolean,
        @JvmField
        val userId: Long,
        @JvmField
        val score: Int,
        @JvmField
        val force: Boolean,
    ) : Function<Message>() {
        override fun getConstructor(): Int = 2_127_359_430
    }

    class SetGiftResalePrice(
        @JvmField
        val receivedGiftId: String,
        @JvmField
        val resaleStarCount: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_430_492_787
    }

    class SetGiftSettings(
        @JvmField
        val settings: GiftSettings,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -519_330_046
    }

    class SetGroupCallParticipantIsSpeaking(
        @JvmField
        val groupCallId: Int,
        @JvmField
        val audioSource: Int,
        @JvmField
        val isSpeaking: Boolean,
    ) : Function<MessageSender>() {
        override fun getConstructor(): Int = -1_019_676_164
    }

    class SetGroupCallParticipantVolumeLevel(
        @JvmField
        val groupCallId: Int,
        @JvmField
        val participantId: MessageSender,
        @JvmField
        val volumeLevel: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_753_769_944
    }

    class SetInactiveSessionTtl(
        @JvmField
        val inactiveSessionTtlDays: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_570_548_048
    }

    class SetInlineGameScore(
        @JvmField
        val inlineMessageId: String,
        @JvmField
        val editMessage: Boolean,
        @JvmField
        val userId: Long,
        @JvmField
        val score: Int,
        @JvmField
        val force: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -948_871_797
    }

    class SetLogStream(
        @JvmField
        val logStream: LogStream,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_364_199_535
    }

    class SetLogTagVerbosityLevel(
        @JvmField
        val tag: String,
        @JvmField
        val newVerbosityLevel: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_095_589_738
    }

    class SetLogVerbosityLevel(
        @JvmField
        val newVerbosityLevel: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -303_429_678
    }

    class SetLoginEmailAddress(
        @JvmField
        val newLoginEmailAddress: String,
    ) : Function<EmailAddressAuthenticationCodeInfo>() {
        override fun getConstructor(): Int = 935_019_476
    }

    class SetMenuButton(
        @JvmField
        val userId: Long,
        @JvmField
        val menuButton: BotMenuButton,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_269_841_599
    }

    class SetMessageFactCheck(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val text: FormattedText?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -4_309_752
    }

    class SetMessageReactions(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val reactionTypes: Array<ReactionType>,
        @JvmField
        val isBig: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -372_524_900
    }

    class SetMessageSenderBlockList(
        @JvmField
        val senderId: MessageSender,
        @JvmField
        val blockList: BlockList?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_987_355_503
    }

    class SetMessageSenderBotVerification(
        @JvmField
        val botUserId: Long,
        @JvmField
        val verifiedId: MessageSender,
        @JvmField
        val customDescription: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_262_364_086
    }

    class SetName(
        @JvmField
        val firstName: String,
        @JvmField
        val lastName: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_711_693_584
    }

    class SetNetworkType(
        @JvmField
        val type: NetworkType?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -701_635_234
    }

    class SetNewChatPrivacySettings(
        @JvmField
        val settings: NewChatPrivacySettings,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_774_139_215
    }

    class SetOption(
        @JvmField
        val name: String,
        @JvmField
        val value: OptionValue?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 2_114_670_322
    }

    class SetPaidMessageReactionType(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val type: PaidReactionType,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -829_934_930
    }

    class SetPassportElement(
        @JvmField
        val element: InputPassportElement,
        @JvmField
        val password: String,
    ) : Function<PassportElement>() {
        override fun getConstructor(): Int = 2_068_173_212
    }

    class SetPassportElementErrors(
        @JvmField
        val userId: Long,
        @JvmField
        val errors: Array<InputPassportElementError>,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_056_754_881
    }

    class SetPassword(
        @JvmField
        val oldPassword: String,
        @JvmField
        val newPassword: String,
        @JvmField
        val newHint: String,
        @JvmField
        val setRecoveryEmailAddress: Boolean,
        @JvmField
        val newRecoveryEmailAddress: String,
    ) : Function<PasswordState>() {
        override fun getConstructor(): Int = -1_193_589_027
    }

    class SetPersonalChat(
        @JvmField
        val chatId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_068_782_668
    }

    class SetPinnedChats(
        @JvmField
        val chatList: ChatList,
        @JvmField
        val chatIds: LongArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -695_640_000
    }

    class SetPinnedForumTopics(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageThreadIds: LongArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -475_084_011
    }

    class SetPinnedGifts(
        @JvmField
        val ownerId: MessageSender,
        @JvmField
        val receivedGiftIds: Array<String>,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_613_526_306
    }

    class SetPinnedSavedMessagesTopics(
        @JvmField
        val savedMessagesTopicIds: LongArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -194_818_924
    }

    class SetPollAnswer(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val optionIds: IntArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_399_388_792
    }

    class SetProfileAccentColor(
        @JvmField
        val profileAccentColorId: Int,
        @JvmField
        val profileBackgroundCustomEmojiId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_986_281_112
    }

    class SetProfilePhoto(
        @JvmField
        val photo: InputChatPhoto,
        @JvmField
        val isPublic: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_048_260_627
    }

    class SetQuickReplyShortcutName(
        @JvmField
        val shortcutId: Int,
        @JvmField
        val name: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 186_709_105
    }

    class SetReactionNotificationSettings(
        @JvmField
        val notificationSettings: ReactionNotificationSettings,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_186_124_949
    }

    class SetReadDatePrivacySettings(
        @JvmField
        val settings: ReadDatePrivacySettings,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 493_913_782
    }

    class SetRecoveryEmailAddress(
        @JvmField
        val password: String,
        @JvmField
        val newRecoveryEmailAddress: String,
    ) : Function<PasswordState>() {
        override fun getConstructor(): Int = -1_981_836_385
    }

    class SetSavedMessagesTagLabel(
        @JvmField
        val tag: ReactionType,
        @JvmField
        val label: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_338_323_696
    }

    class SetScopeNotificationSettings(
        @JvmField
        val scope: NotificationSettingsScope,
        @JvmField
        val notificationSettings: ScopeNotificationSettings,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_049_984_966
    }

    class SetStickerEmojis(
        @JvmField
        val sticker: InputFile,
        @JvmField
        val emojis: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -638_843_855
    }

    class SetStickerKeywords(
        @JvmField
        val sticker: InputFile,
        @JvmField
        val keywords: Array<String>,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 137_223_565
    }

    class SetStickerMaskPosition(
        @JvmField
        val sticker: InputFile,
        @JvmField
        val maskPosition: MaskPosition?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_202_280_912
    }

    class SetStickerPositionInSet(
        @JvmField
        val sticker: InputFile,
        @JvmField
        val position: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 2_075_281_185
    }

    class SetStickerSetThumbnail(
        @JvmField
        val userId: Long,
        @JvmField
        val name: String,
        @JvmField
        val thumbnail: InputFile?,
        @JvmField
        val format: StickerFormat?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_677_617_458
    }

    class SetStickerSetTitle(
        @JvmField
        val name: String,
        @JvmField
        val title: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_693_004_706
    }

    class SetStoryPrivacySettings(
        @JvmField
        val storyId: Int,
        @JvmField
        val privacySettings: StoryPrivacySettings,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -655_801_550
    }

    class SetStoryReaction(
        @JvmField
        val storyPosterChatId: Long,
        @JvmField
        val storyId: Int,
        @JvmField
        val reactionType: ReactionType?,
        @JvmField
        val updateRecentReactions: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 250_731_529
    }

    class SetSupergroupCustomEmojiStickerSet(
        @JvmField
        val supergroupId: Long,
        @JvmField
        val customEmojiStickerSetId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_328_894_639
    }

    class SetSupergroupStickerSet(
        @JvmField
        val supergroupId: Long,
        @JvmField
        val stickerSetId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_056_344_215
    }

    class SetSupergroupUnrestrictBoostCount(
        @JvmField
        val supergroupId: Long,
        @JvmField
        val unrestrictBoostCount: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 969_814_179
    }

    class SetSupergroupUsername(
        @JvmField
        val supergroupId: Long,
        @JvmField
        val username: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_346_325_252
    }

    class SetTdlibParameters(
        @JvmField
        val useTestDc: Boolean,
        @JvmField
        val databaseDirectory: String,
        @JvmField
        val filesDirectory: String,
        @JvmField
        val databaseEncryptionKey: ByteArray,
        @JvmField
        val useFileDatabase: Boolean,
        @JvmField
        val useChatInfoDatabase: Boolean,
        @JvmField
        val useMessageDatabase: Boolean,
        @JvmField
        val useSecretChats: Boolean,
        @JvmField
        val apiId: Int,
        @JvmField
        val apiHash: String,
        @JvmField
        val systemLanguageCode: String,
        @JvmField
        val deviceModel: String,
        @JvmField
        val systemVersion: String,
        @JvmField
        val applicationVersion: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -775_883_218
    }

    class SetUserEmojiStatus(
        @JvmField
        val userId: Long,
        @JvmField
        val emojiStatus: EmojiStatus?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -451_519_541
    }

    class SetUserPersonalProfilePhoto(
        @JvmField
        val userId: Long,
        @JvmField
        val photo: InputChatPhoto?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 464_136_438
    }

    class SetUserPrivacySettingRules(
        @JvmField
        val setting: UserPrivacySetting,
        @JvmField
        val rules: UserPrivacySettingRules,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -473_812_741
    }

    class SetUserSupportInfo(
        @JvmField
        val userId: Long,
        @JvmField
        val message: FormattedText,
    ) : Function<UserSupportInfo>() {
        override fun getConstructor(): Int = -2_088_986_621
    }

    class SetUsername(
        @JvmField
        val username: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 439_901_214
    }

    class SetVideoChatDefaultParticipant(
        @JvmField
        val chatId: Long,
        @JvmField
        val defaultParticipantId: MessageSender,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -240_749_901
    }

    class SetVideoChatTitle(
        @JvmField
        val groupCallId: Int,
        @JvmField
        val title: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_915_482_994
    }

    class ShareChatWithBot(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val buttonId: Int,
        @JvmField
        val sharedChatId: Long,
        @JvmField
        val onlyCheck: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_504_507_166
    }

    class SharePhoneNumber(
        @JvmField
        val userId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_097_130_069
    }

    class ShareUsersWithBot(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val buttonId: Int,
        @JvmField
        val sharedUserIds: LongArray,
        @JvmField
        val onlyCheck: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_574_608_333
    }

    class StartGroupCallRecording(
        @JvmField
        val groupCallId: Int,
        @JvmField
        val title: String,
        @JvmField
        val recordVideo: Boolean,
        @JvmField
        val usePortraitOrientation: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_757_774_971
    }

    class StartGroupCallScreenSharing(
        @JvmField
        val groupCallId: Int,
        @JvmField
        val audioSourceId: Int,
        @JvmField
        val payload: String,
    ) : Function<Text>() {
        override fun getConstructor(): Int = -884_068_051
    }

    class StartScheduledVideoChat(
        @JvmField
        val groupCallId: Int,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_300_829_822
    }

    class StopBusinessPoll(
        @JvmField
        val businessConnectionId: String,
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val replyMarkup: ReplyMarkup?,
    ) : Function<BusinessMessage>() {
        override fun getConstructor(): Int = -1_142_218_400
    }

    class StopPoll(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val replyMarkup: ReplyMarkup?,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_659_374_253
    }

    class SuggestUserProfilePhoto(
        @JvmField
        val userId: Long,
        @JvmField
        val photo: InputChatPhoto,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_788_742_557
    }

    class SynchronizeLanguagePack(
        @JvmField
        val languagePackId: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_065_307_858
    }

    class TerminateAllOtherSessions : Function<Ok>() {
        override fun getConstructor(): Int = 1_874_485_523
    }

    class TerminateSession(
        @JvmField
        val sessionId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -407_385_812
    }

    class TestCallBytes(
        @JvmField
        val x: ByteArray,
    ) : Function<TestBytes>() {
        override fun getConstructor(): Int = -736_011_607
    }

    class TestCallEmpty : Function<Ok>() {
        override fun getConstructor(): Int = -627_291_626
    }

    class TestCallString(
        @JvmField
        val x: String,
    ) : Function<TestString>() {
        override fun getConstructor(): Int = -1_732_818_385
    }

    class TestCallVectorInt(
        @JvmField
        val x: IntArray,
    ) : Function<TestVectorInt>() {
        override fun getConstructor(): Int = -2_137_277_793
    }

    class TestCallVectorIntObject(
        @JvmField
        val x: Array<TestInt>,
    ) : Function<TestVectorIntObject>() {
        override fun getConstructor(): Int = 1_825_428_218
    }

    class TestCallVectorString(
        @JvmField
        val x: Array<String>,
    ) : Function<TestVectorString>() {
        override fun getConstructor(): Int = -408_600_900
    }

    class TestCallVectorStringObject(
        @JvmField
        val x: Array<TestString>,
    ) : Function<TestVectorStringObject>() {
        override fun getConstructor(): Int = 1_527_666_429
    }

    class TestGetDifference : Function<Ok>() {
        override fun getConstructor(): Int = 1_747_084_069
    }

    class TestNetwork : Function<Ok>() {
        override fun getConstructor(): Int = -1_343_998_901
    }

    class TestProxy(
        @JvmField
        val server: String,
        @JvmField
        val port: Int,
        @JvmField
        val type: ProxyType,
        @JvmField
        val dcId: Int,
        @JvmField
        val timeout: Double,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_197_366_626
    }

    class TestReturnError(
        @JvmField
        val error: Error,
    ) : Function<Error>() {
        override fun getConstructor(): Int = 455_179_506
    }

    class TestSquareInt(
        @JvmField
        val x: Int,
    ) : Function<TestInt>() {
        override fun getConstructor(): Int = -60_135_024
    }

    class TestUseUpdate : Function<Update>() {
        override fun getConstructor(): Int = 717_094_686
    }

    class ToggleAllDownloadsArePaused(
        @JvmField
        val arePaused: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_251_512_322
    }

    class ToggleBotCanManageEmojiStatus(
        @JvmField
        val botUserId: Long,
        @JvmField
        val canManageEmojiStatus: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 622_495_770
    }

    class ToggleBotIsAddedToAttachmentMenu(
        @JvmField
        val botUserId: Long,
        @JvmField
        val isAdded: Boolean,
        @JvmField
        val allowWriteAccess: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_906_712_934
    }

    class ToggleBotUsernameIsActive(
        @JvmField
        val botUserId: Long,
        @JvmField
        val username: String,
        @JvmField
        val isActive: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 2_036_569_097
    }

    class ToggleBusinessConnectedBotChatIsPaused(
        @JvmField
        val chatId: Long,
        @JvmField
        val isPaused: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_328_957_509
    }

    class ToggleChatDefaultDisableNotification(
        @JvmField
        val chatId: Long,
        @JvmField
        val defaultDisableNotification: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 314_794_002
    }

    class ToggleChatFolderTags(
        @JvmField
        val areTagsEnabled: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_092_209_084
    }

    class ToggleChatGiftNotifications(
        @JvmField
        val chatId: Long,
        @JvmField
        val areEnabled: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_069_429_154
    }

    class ToggleChatHasProtectedContent(
        @JvmField
        val chatId: Long,
        @JvmField
        val hasProtectedContent: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 975_231_309
    }

    class ToggleChatIsMarkedAsUnread(
        @JvmField
        val chatId: Long,
        @JvmField
        val isMarkedAsUnread: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -986_129_697
    }

    class ToggleChatIsPinned(
        @JvmField
        val chatList: ChatList,
        @JvmField
        val chatId: Long,
        @JvmField
        val isPinned: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_485_429_186
    }

    class ToggleChatIsTranslatable(
        @JvmField
        val chatId: Long,
        @JvmField
        val isTranslatable: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_812_345_889
    }

    class ToggleChatViewAsTopics(
        @JvmField
        val chatId: Long,
        @JvmField
        val viewAsTopics: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 724_009_948
    }

    class ToggleDirectMessagesChatTopicCanSendUnpaidMessages(
        @JvmField
        val chatId: Long,
        @JvmField
        val topicId: Long,
        @JvmField
        val canSendUnpaidMessages: Boolean,
        @JvmField
        val refundPayments: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -335_898_703
    }

    class ToggleDownloadIsPaused(
        @JvmField
        val fileId: Int,
        @JvmField
        val isPaused: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -947_493_099
    }

    class ToggleForumTopicIsClosed(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageThreadId: Long,
        @JvmField
        val isClosed: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -949_712_141
    }

    class ToggleForumTopicIsPinned(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageThreadId: Long,
        @JvmField
        val isPinned: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_181_543_092
    }

    class ToggleGeneralForumTopicIsHidden(
        @JvmField
        val chatId: Long,
        @JvmField
        val isHidden: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_595_741_256
    }

    class ToggleGiftIsSaved(
        @JvmField
        val receivedGiftId: String,
        @JvmField
        val isSaved: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 693_198_065
    }

    class ToggleGroupCallIsMyVideoEnabled(
        @JvmField
        val groupCallId: Int,
        @JvmField
        val isMyVideoEnabled: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_624_289_030
    }

    class ToggleGroupCallIsMyVideoPaused(
        @JvmField
        val groupCallId: Int,
        @JvmField
        val isMyVideoPaused: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -478_875_239
    }

    class ToggleGroupCallParticipantIsHandRaised(
        @JvmField
        val groupCallId: Int,
        @JvmField
        val participantId: MessageSender,
        @JvmField
        val isHandRaised: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_896_127_519
    }

    class ToggleGroupCallParticipantIsMuted(
        @JvmField
        val groupCallId: Int,
        @JvmField
        val participantId: MessageSender,
        @JvmField
        val isMuted: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_308_093_433
    }

    class ToggleGroupCallScreenSharingIsPaused(
        @JvmField
        val groupCallId: Int,
        @JvmField
        val isPaused: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_602_530_464
    }

    class ToggleHasSponsoredMessagesEnabled(
        @JvmField
        val hasSponsoredMessagesEnabled: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_963_285_740
    }

    class ToggleSavedMessagesTopicIsPinned(
        @JvmField
        val savedMessagesTopicId: Long,
        @JvmField
        val isPinned: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_588_378_164
    }

    class ToggleSessionCanAcceptCalls(
        @JvmField
        val sessionId: Long,
        @JvmField
        val canAcceptCalls: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_819_027_208
    }

    class ToggleSessionCanAcceptSecretChats(
        @JvmField
        val sessionId: Long,
        @JvmField
        val canAcceptSecretChats: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_000_843_390
    }

    class ToggleStoryIsPostedToChatPage(
        @JvmField
        val storyPosterChatId: Long,
        @JvmField
        val storyId: Int,
        @JvmField
        val isPostedToChatPage: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -2_141_806_228
    }

    class ToggleSupergroupCanHaveSponsoredMessages(
        @JvmField
        val supergroupId: Long,
        @JvmField
        val canHaveSponsoredMessages: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_098_204_302
    }

    class ToggleSupergroupHasAggressiveAntiSpamEnabled(
        @JvmField
        val supergroupId: Long,
        @JvmField
        val hasAggressiveAntiSpamEnabled: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_748_956_943
    }

    class ToggleSupergroupHasAutomaticTranslation(
        @JvmField
        val supergroupId: Long,
        @JvmField
        val hasAutomaticTranslation: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -184_993_048
    }

    class ToggleSupergroupHasHiddenMembers(
        @JvmField
        val supergroupId: Long,
        @JvmField
        val hasHiddenMembers: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_537_892_918
    }

    class ToggleSupergroupIsAllHistoryAvailable(
        @JvmField
        val supergroupId: Long,
        @JvmField
        val isAllHistoryAvailable: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_155_110_478
    }

    class ToggleSupergroupIsBroadcastGroup(
        @JvmField
        val supergroupId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 884_089_365
    }

    class ToggleSupergroupIsForum(
        @JvmField
        val supergroupId: Long,
        @JvmField
        val isForum: Boolean,
        @JvmField
        val hasForumTabs: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 371_064_337
    }

    class ToggleSupergroupJoinByRequest(
        @JvmField
        val supergroupId: Long,
        @JvmField
        val joinByRequest: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 2_111_807_454
    }

    class ToggleSupergroupJoinToSendMessages(
        @JvmField
        val supergroupId: Long,
        @JvmField
        val joinToSendMessages: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -182_022_642
    }

    class ToggleSupergroupSignMessages(
        @JvmField
        val supergroupId: Long,
        @JvmField
        val signMessages: Boolean,
        @JvmField
        val showMessageSender: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 572_268_491
    }

    class ToggleSupergroupUsernameIsActive(
        @JvmField
        val supergroupId: Long,
        @JvmField
        val username: String,
        @JvmField
        val isActive: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_500_811_777
    }

    class ToggleUsernameIsActive(
        @JvmField
        val username: String,
        @JvmField
        val isActive: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_244_098_019
    }

    class ToggleVideoChatEnabledStartNotification(
        @JvmField
        val groupCallId: Int,
        @JvmField
        val enabledStartNotification: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_851_489_086
    }

    class ToggleVideoChatMuteNewParticipants(
        @JvmField
        val groupCallId: Int,
        @JvmField
        val muteNewParticipants: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 987_023_756
    }

    class TransferBusinessAccountStars(
        @JvmField
        val businessConnectionId: String,
        @JvmField
        val starCount: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 732_562_464
    }

    class TransferChatOwnership(
        @JvmField
        val chatId: Long,
        @JvmField
        val userId: Long,
        @JvmField
        val password: String,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 2_006_977_043
    }

    class TransferGift(
        @JvmField
        val businessConnectionId: String,
        @JvmField
        val receivedGiftId: String,
        @JvmField
        val newOwnerId: MessageSender,
        @JvmField
        val starCount: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_167_293_126
    }

    class TranslateMessageText(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
        @JvmField
        val toLanguageCode: String,
    ) : Function<FormattedText>() {
        override fun getConstructor(): Int = 1_405_427_410
    }

    class TranslateText(
        @JvmField
        val text: FormattedText,
        @JvmField
        val toLanguageCode: String,
    ) : Function<FormattedText>() {
        override fun getConstructor(): Int = 623_011_058
    }

    class UnpinAllChatMessages(
        @JvmField
        val chatId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_437_805_385
    }

    class UnpinAllDirectMessagesChatTopicMessages(
        @JvmField
        val chatId: Long,
        @JvmField
        val topicId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 89_671_100
    }

    class UnpinAllMessageThreadMessages(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageThreadId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -1_211_719_936
    }

    class UnpinChatMessage(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 2_065_448_670
    }

    class UpgradeBasicGroupChatToSupergroupChat(
        @JvmField
        val chatId: Long,
    ) : Function<Chat>() {
        override fun getConstructor(): Int = 300_488_122
    }

    class UpgradeGift(
        @JvmField
        val businessConnectionId: String,
        @JvmField
        val receivedGiftId: String,
        @JvmField
        val keepOriginalDetails: Boolean,
        @JvmField
        val starCount: Long,
    ) : Function<UpgradeGiftResult>() {
        override fun getConstructor(): Int = -1_782_136_103
    }

    class UploadStickerFile(
        @JvmField
        val userId: Long,
        @JvmField
        val stickerFormat: StickerFormat,
        @JvmField
        val sticker: InputFile,
    ) : Function<File>() {
        override fun getConstructor(): Int = 647_385_283
    }

    class ValidateOrderInfo(
        @JvmField
        val inputInvoice: InputInvoice,
        @JvmField
        val orderInfo: OrderInfo?,
        @JvmField
        val allowSave: Boolean,
    ) : Function<ValidatedOrderInfo>() {
        override fun getConstructor(): Int = -1_248_305_201
    }

    class ViewMessages(
        @JvmField
        val chatId: Long,
        @JvmField
        val messageIds: LongArray,
        @JvmField
        val source: MessageSource?,
        @JvmField
        val forceRead: Boolean,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 960_236_656
    }

    class ViewPremiumFeature(
        @JvmField
        val feature: PremiumFeature,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 192_950_706
    }

    class ViewSponsoredChat(
        @JvmField
        val sponsoredChatUniqueId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 1_722_644_778
    }

    class ViewTrendingStickerSets(
        @JvmField
        val stickerSetIds: LongArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -952_416_520
    }

    class ViewVideoMessageAdvertisement(
        @JvmField
        val advertisementUniqueId: Long,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = -808_563_006
    }

    class WriteGeneratedFilePart(
        @JvmField
        val generationId: Long,
        @JvmField
        val offset: Long,
        @JvmField
        val data: ByteArray,
    ) : Function<Ok>() {
        override fun getConstructor(): Int = 214_474_389
    }
}
