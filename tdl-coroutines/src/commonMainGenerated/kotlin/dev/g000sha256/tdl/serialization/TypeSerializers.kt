/*
 * Copyright 2026 Georgii Ippolitov (g000sha256)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.g000sha256.tdl.serialization

import dev.g000sha256.tdl.dto.ActiveStoryState
import dev.g000sha256.tdl.dto.ActiveStoryStateLive
import dev.g000sha256.tdl.dto.ActiveStoryStateRead
import dev.g000sha256.tdl.dto.ActiveStoryStateUnread
import dev.g000sha256.tdl.dto.AffiliateProgramSortOrder
import dev.g000sha256.tdl.dto.AffiliateProgramSortOrderCreationDate
import dev.g000sha256.tdl.dto.AffiliateProgramSortOrderProfitability
import dev.g000sha256.tdl.dto.AffiliateProgramSortOrderRevenue
import dev.g000sha256.tdl.dto.AffiliateType
import dev.g000sha256.tdl.dto.AffiliateTypeBot
import dev.g000sha256.tdl.dto.AffiliateTypeChannel
import dev.g000sha256.tdl.dto.AffiliateTypeCurrentUser
import dev.g000sha256.tdl.dto.AuctionState
import dev.g000sha256.tdl.dto.AuctionStateActive
import dev.g000sha256.tdl.dto.AuctionStateFinished
import dev.g000sha256.tdl.dto.AuthenticationCodeType
import dev.g000sha256.tdl.dto.AuthenticationCodeTypeCall
import dev.g000sha256.tdl.dto.AuthenticationCodeTypeFirebaseAndroid
import dev.g000sha256.tdl.dto.AuthenticationCodeTypeFirebaseIos
import dev.g000sha256.tdl.dto.AuthenticationCodeTypeFlashCall
import dev.g000sha256.tdl.dto.AuthenticationCodeTypeFragment
import dev.g000sha256.tdl.dto.AuthenticationCodeTypeMissedCall
import dev.g000sha256.tdl.dto.AuthenticationCodeTypeSms
import dev.g000sha256.tdl.dto.AuthenticationCodeTypeSmsPhrase
import dev.g000sha256.tdl.dto.AuthenticationCodeTypeSmsWord
import dev.g000sha256.tdl.dto.AuthenticationCodeTypeTelegramMessage
import dev.g000sha256.tdl.dto.AuthorizationState
import dev.g000sha256.tdl.dto.AuthorizationStateClosed
import dev.g000sha256.tdl.dto.AuthorizationStateClosing
import dev.g000sha256.tdl.dto.AuthorizationStateLoggingOut
import dev.g000sha256.tdl.dto.AuthorizationStateReady
import dev.g000sha256.tdl.dto.AuthorizationStateWaitCode
import dev.g000sha256.tdl.dto.AuthorizationStateWaitEmailAddress
import dev.g000sha256.tdl.dto.AuthorizationStateWaitEmailCode
import dev.g000sha256.tdl.dto.AuthorizationStateWaitOtherDeviceConfirmation
import dev.g000sha256.tdl.dto.AuthorizationStateWaitPassword
import dev.g000sha256.tdl.dto.AuthorizationStateWaitPhoneNumber
import dev.g000sha256.tdl.dto.AuthorizationStateWaitPremiumPurchase
import dev.g000sha256.tdl.dto.AuthorizationStateWaitRegistration
import dev.g000sha256.tdl.dto.AuthorizationStateWaitTdlibParameters
import dev.g000sha256.tdl.dto.AutosaveSettingsScope
import dev.g000sha256.tdl.dto.AutosaveSettingsScopeChannelChats
import dev.g000sha256.tdl.dto.AutosaveSettingsScopeChat
import dev.g000sha256.tdl.dto.AutosaveSettingsScopeGroupChats
import dev.g000sha256.tdl.dto.AutosaveSettingsScopePrivateChats
import dev.g000sha256.tdl.dto.BackgroundFill
import dev.g000sha256.tdl.dto.BackgroundFillFreeformGradient
import dev.g000sha256.tdl.dto.BackgroundFillGradient
import dev.g000sha256.tdl.dto.BackgroundFillSolid
import dev.g000sha256.tdl.dto.BackgroundType
import dev.g000sha256.tdl.dto.BackgroundTypeChatTheme
import dev.g000sha256.tdl.dto.BackgroundTypeFill
import dev.g000sha256.tdl.dto.BackgroundTypePattern
import dev.g000sha256.tdl.dto.BackgroundTypeWallpaper
import dev.g000sha256.tdl.dto.BlockList
import dev.g000sha256.tdl.dto.BlockListMain
import dev.g000sha256.tdl.dto.BlockListStories
import dev.g000sha256.tdl.dto.BotCommandScope
import dev.g000sha256.tdl.dto.BotCommandScopeAllChatAdministrators
import dev.g000sha256.tdl.dto.BotCommandScopeAllGroupChats
import dev.g000sha256.tdl.dto.BotCommandScopeAllPrivateChats
import dev.g000sha256.tdl.dto.BotCommandScopeChat
import dev.g000sha256.tdl.dto.BotCommandScopeChatAdministrators
import dev.g000sha256.tdl.dto.BotCommandScopeChatMember
import dev.g000sha256.tdl.dto.BotCommandScopeDefault
import dev.g000sha256.tdl.dto.BotWriteAccessAllowReason
import dev.g000sha256.tdl.dto.BotWriteAccessAllowReasonAcceptedRequest
import dev.g000sha256.tdl.dto.BotWriteAccessAllowReasonAddedToAttachmentMenu
import dev.g000sha256.tdl.dto.BotWriteAccessAllowReasonConnectedWebsite
import dev.g000sha256.tdl.dto.BotWriteAccessAllowReasonLaunchedWebApp
import dev.g000sha256.tdl.dto.BuiltInTheme
import dev.g000sha256.tdl.dto.BuiltInThemeArctic
import dev.g000sha256.tdl.dto.BuiltInThemeClassic
import dev.g000sha256.tdl.dto.BuiltInThemeDay
import dev.g000sha256.tdl.dto.BuiltInThemeNight
import dev.g000sha256.tdl.dto.BuiltInThemeTinted
import dev.g000sha256.tdl.dto.BusinessAwayMessageSchedule
import dev.g000sha256.tdl.dto.BusinessAwayMessageScheduleAlways
import dev.g000sha256.tdl.dto.BusinessAwayMessageScheduleCustom
import dev.g000sha256.tdl.dto.BusinessAwayMessageScheduleOutsideOfOpeningHours
import dev.g000sha256.tdl.dto.BusinessFeature
import dev.g000sha256.tdl.dto.BusinessFeatureAccountLinks
import dev.g000sha256.tdl.dto.BusinessFeatureAwayMessage
import dev.g000sha256.tdl.dto.BusinessFeatureBots
import dev.g000sha256.tdl.dto.BusinessFeatureChatFolderTags
import dev.g000sha256.tdl.dto.BusinessFeatureEmojiStatus
import dev.g000sha256.tdl.dto.BusinessFeatureGreetingMessage
import dev.g000sha256.tdl.dto.BusinessFeatureLocation
import dev.g000sha256.tdl.dto.BusinessFeatureOpeningHours
import dev.g000sha256.tdl.dto.BusinessFeatureQuickReplies
import dev.g000sha256.tdl.dto.BusinessFeatureStartPage
import dev.g000sha256.tdl.dto.BusinessFeatureUpgradedStories
import dev.g000sha256.tdl.dto.ButtonStyle
import dev.g000sha256.tdl.dto.ButtonStyleDanger
import dev.g000sha256.tdl.dto.ButtonStyleDefault
import dev.g000sha256.tdl.dto.ButtonStylePrimary
import dev.g000sha256.tdl.dto.ButtonStyleSuccess
import dev.g000sha256.tdl.dto.CallDiscardReason
import dev.g000sha256.tdl.dto.CallDiscardReasonDeclined
import dev.g000sha256.tdl.dto.CallDiscardReasonDisconnected
import dev.g000sha256.tdl.dto.CallDiscardReasonEmpty
import dev.g000sha256.tdl.dto.CallDiscardReasonHungUp
import dev.g000sha256.tdl.dto.CallDiscardReasonMissed
import dev.g000sha256.tdl.dto.CallDiscardReasonUpgradeToGroupCall
import dev.g000sha256.tdl.dto.CallProblem
import dev.g000sha256.tdl.dto.CallProblemDistortedSpeech
import dev.g000sha256.tdl.dto.CallProblemDistortedVideo
import dev.g000sha256.tdl.dto.CallProblemDropped
import dev.g000sha256.tdl.dto.CallProblemEcho
import dev.g000sha256.tdl.dto.CallProblemInterruptions
import dev.g000sha256.tdl.dto.CallProblemNoise
import dev.g000sha256.tdl.dto.CallProblemPixelatedVideo
import dev.g000sha256.tdl.dto.CallProblemSilentLocal
import dev.g000sha256.tdl.dto.CallProblemSilentRemote
import dev.g000sha256.tdl.dto.CallServerType
import dev.g000sha256.tdl.dto.CallServerTypeTelegramReflector
import dev.g000sha256.tdl.dto.CallServerTypeWebrtc
import dev.g000sha256.tdl.dto.CallState
import dev.g000sha256.tdl.dto.CallStateDiscarded
import dev.g000sha256.tdl.dto.CallStateError
import dev.g000sha256.tdl.dto.CallStateExchangingKeys
import dev.g000sha256.tdl.dto.CallStateHangingUp
import dev.g000sha256.tdl.dto.CallStatePending
import dev.g000sha256.tdl.dto.CallStateReady
import dev.g000sha256.tdl.dto.CallbackQueryPayload
import dev.g000sha256.tdl.dto.CallbackQueryPayloadData
import dev.g000sha256.tdl.dto.CallbackQueryPayloadDataWithPassword
import dev.g000sha256.tdl.dto.CallbackQueryPayloadGame
import dev.g000sha256.tdl.dto.CanPostStoryResult
import dev.g000sha256.tdl.dto.CanPostStoryResultActiveStoryLimitExceeded
import dev.g000sha256.tdl.dto.CanPostStoryResultBoostNeeded
import dev.g000sha256.tdl.dto.CanPostStoryResultLiveStoryIsActive
import dev.g000sha256.tdl.dto.CanPostStoryResultMonthlyLimitExceeded
import dev.g000sha256.tdl.dto.CanPostStoryResultOk
import dev.g000sha256.tdl.dto.CanPostStoryResultPremiumNeeded
import dev.g000sha256.tdl.dto.CanPostStoryResultWeeklyLimitExceeded
import dev.g000sha256.tdl.dto.CanSendGiftResult
import dev.g000sha256.tdl.dto.CanSendGiftResultFail
import dev.g000sha256.tdl.dto.CanSendGiftResultOk
import dev.g000sha256.tdl.dto.CanSendMessageToUserResult
import dev.g000sha256.tdl.dto.CanSendMessageToUserResultOk
import dev.g000sha256.tdl.dto.CanSendMessageToUserResultUserHasPaidMessages
import dev.g000sha256.tdl.dto.CanSendMessageToUserResultUserIsDeleted
import dev.g000sha256.tdl.dto.CanSendMessageToUserResultUserRestrictsNewChats
import dev.g000sha256.tdl.dto.CanTransferOwnershipResult
import dev.g000sha256.tdl.dto.CanTransferOwnershipResultOk
import dev.g000sha256.tdl.dto.CanTransferOwnershipResultPasswordNeeded
import dev.g000sha256.tdl.dto.CanTransferOwnershipResultPasswordTooFresh
import dev.g000sha256.tdl.dto.CanTransferOwnershipResultSessionTooFresh
import dev.g000sha256.tdl.dto.ChatAction
import dev.g000sha256.tdl.dto.ChatActionBar
import dev.g000sha256.tdl.dto.ChatActionBarAddContact
import dev.g000sha256.tdl.dto.ChatActionBarInviteMembers
import dev.g000sha256.tdl.dto.ChatActionBarJoinRequest
import dev.g000sha256.tdl.dto.ChatActionBarReportAddBlock
import dev.g000sha256.tdl.dto.ChatActionBarReportSpam
import dev.g000sha256.tdl.dto.ChatActionBarSharePhoneNumber
import dev.g000sha256.tdl.dto.ChatActionCancel
import dev.g000sha256.tdl.dto.ChatActionChoosingContact
import dev.g000sha256.tdl.dto.ChatActionChoosingLocation
import dev.g000sha256.tdl.dto.ChatActionChoosingSticker
import dev.g000sha256.tdl.dto.ChatActionRecordingVideo
import dev.g000sha256.tdl.dto.ChatActionRecordingVideoNote
import dev.g000sha256.tdl.dto.ChatActionRecordingVoiceNote
import dev.g000sha256.tdl.dto.ChatActionStartPlayingGame
import dev.g000sha256.tdl.dto.ChatActionTyping
import dev.g000sha256.tdl.dto.ChatActionUploadingDocument
import dev.g000sha256.tdl.dto.ChatActionUploadingPhoto
import dev.g000sha256.tdl.dto.ChatActionUploadingVideo
import dev.g000sha256.tdl.dto.ChatActionUploadingVideoNote
import dev.g000sha256.tdl.dto.ChatActionUploadingVoiceNote
import dev.g000sha256.tdl.dto.ChatActionWatchingAnimations
import dev.g000sha256.tdl.dto.ChatAvailableReactions
import dev.g000sha256.tdl.dto.ChatAvailableReactionsAll
import dev.g000sha256.tdl.dto.ChatAvailableReactionsSome
import dev.g000sha256.tdl.dto.ChatBoostSource
import dev.g000sha256.tdl.dto.ChatBoostSourceGiftCode
import dev.g000sha256.tdl.dto.ChatBoostSourceGiveaway
import dev.g000sha256.tdl.dto.ChatBoostSourcePremium
import dev.g000sha256.tdl.dto.ChatEventAccentColorChanged
import dev.g000sha256.tdl.dto.ChatEventAction
import dev.g000sha256.tdl.dto.ChatEventActiveUsernamesChanged
import dev.g000sha256.tdl.dto.ChatEventAutomaticTranslationToggled
import dev.g000sha256.tdl.dto.ChatEventAvailableReactionsChanged
import dev.g000sha256.tdl.dto.ChatEventBackgroundChanged
import dev.g000sha256.tdl.dto.ChatEventCustomEmojiStickerSetChanged
import dev.g000sha256.tdl.dto.ChatEventDescriptionChanged
import dev.g000sha256.tdl.dto.ChatEventEmojiStatusChanged
import dev.g000sha256.tdl.dto.ChatEventForumTopicCreated
import dev.g000sha256.tdl.dto.ChatEventForumTopicDeleted
import dev.g000sha256.tdl.dto.ChatEventForumTopicEdited
import dev.g000sha256.tdl.dto.ChatEventForumTopicPinned
import dev.g000sha256.tdl.dto.ChatEventForumTopicToggleIsClosed
import dev.g000sha256.tdl.dto.ChatEventForumTopicToggleIsHidden
import dev.g000sha256.tdl.dto.ChatEventHasAggressiveAntiSpamEnabledToggled
import dev.g000sha256.tdl.dto.ChatEventHasProtectedContentToggled
import dev.g000sha256.tdl.dto.ChatEventInviteLinkDeleted
import dev.g000sha256.tdl.dto.ChatEventInviteLinkEdited
import dev.g000sha256.tdl.dto.ChatEventInviteLinkRevoked
import dev.g000sha256.tdl.dto.ChatEventInvitesToggled
import dev.g000sha256.tdl.dto.ChatEventIsAllHistoryAvailableToggled
import dev.g000sha256.tdl.dto.ChatEventIsForumToggled
import dev.g000sha256.tdl.dto.ChatEventLinkedChatChanged
import dev.g000sha256.tdl.dto.ChatEventLocationChanged
import dev.g000sha256.tdl.dto.ChatEventMemberInvited
import dev.g000sha256.tdl.dto.ChatEventMemberJoined
import dev.g000sha256.tdl.dto.ChatEventMemberJoinedByInviteLink
import dev.g000sha256.tdl.dto.ChatEventMemberJoinedByRequest
import dev.g000sha256.tdl.dto.ChatEventMemberLeft
import dev.g000sha256.tdl.dto.ChatEventMemberPromoted
import dev.g000sha256.tdl.dto.ChatEventMemberRestricted
import dev.g000sha256.tdl.dto.ChatEventMemberSubscriptionExtended
import dev.g000sha256.tdl.dto.ChatEventMemberTagChanged
import dev.g000sha256.tdl.dto.ChatEventMessageAutoDeleteTimeChanged
import dev.g000sha256.tdl.dto.ChatEventMessageDeleted
import dev.g000sha256.tdl.dto.ChatEventMessageEdited
import dev.g000sha256.tdl.dto.ChatEventMessagePinned
import dev.g000sha256.tdl.dto.ChatEventMessageUnpinned
import dev.g000sha256.tdl.dto.ChatEventPermissionsChanged
import dev.g000sha256.tdl.dto.ChatEventPhotoChanged
import dev.g000sha256.tdl.dto.ChatEventPollStopped
import dev.g000sha256.tdl.dto.ChatEventProfileAccentColorChanged
import dev.g000sha256.tdl.dto.ChatEventShowMessageSenderToggled
import dev.g000sha256.tdl.dto.ChatEventSignMessagesToggled
import dev.g000sha256.tdl.dto.ChatEventSlowModeDelayChanged
import dev.g000sha256.tdl.dto.ChatEventStickerSetChanged
import dev.g000sha256.tdl.dto.ChatEventTitleChanged
import dev.g000sha256.tdl.dto.ChatEventUsernameChanged
import dev.g000sha256.tdl.dto.ChatEventVideoChatCreated
import dev.g000sha256.tdl.dto.ChatEventVideoChatEnded
import dev.g000sha256.tdl.dto.ChatEventVideoChatMuteNewParticipantsToggled
import dev.g000sha256.tdl.dto.ChatEventVideoChatParticipantIsMutedToggled
import dev.g000sha256.tdl.dto.ChatEventVideoChatParticipantVolumeLevelChanged
import dev.g000sha256.tdl.dto.ChatJoinRequestResult
import dev.g000sha256.tdl.dto.ChatJoinRequestResultApproved
import dev.g000sha256.tdl.dto.ChatJoinRequestResultDeclined
import dev.g000sha256.tdl.dto.ChatJoinRequestResultQueued
import dev.g000sha256.tdl.dto.ChatJoinResult
import dev.g000sha256.tdl.dto.ChatJoinResultDeclined
import dev.g000sha256.tdl.dto.ChatJoinResultGuardBotApprovalRequired
import dev.g000sha256.tdl.dto.ChatJoinResultRequestSent
import dev.g000sha256.tdl.dto.ChatJoinResultSuccess
import dev.g000sha256.tdl.dto.ChatList
import dev.g000sha256.tdl.dto.ChatListArchive
import dev.g000sha256.tdl.dto.ChatListFolder
import dev.g000sha256.tdl.dto.ChatListMain
import dev.g000sha256.tdl.dto.ChatMemberStatus
import dev.g000sha256.tdl.dto.ChatMemberStatusAdministrator
import dev.g000sha256.tdl.dto.ChatMemberStatusBanned
import dev.g000sha256.tdl.dto.ChatMemberStatusCreator
import dev.g000sha256.tdl.dto.ChatMemberStatusLeft
import dev.g000sha256.tdl.dto.ChatMemberStatusMember
import dev.g000sha256.tdl.dto.ChatMemberStatusRestricted
import dev.g000sha256.tdl.dto.ChatMembersFilter
import dev.g000sha256.tdl.dto.ChatMembersFilterAdministrators
import dev.g000sha256.tdl.dto.ChatMembersFilterBanned
import dev.g000sha256.tdl.dto.ChatMembersFilterBots
import dev.g000sha256.tdl.dto.ChatMembersFilterContacts
import dev.g000sha256.tdl.dto.ChatMembersFilterMembers
import dev.g000sha256.tdl.dto.ChatMembersFilterMention
import dev.g000sha256.tdl.dto.ChatMembersFilterRestricted
import dev.g000sha256.tdl.dto.ChatPhotoStickerType
import dev.g000sha256.tdl.dto.ChatPhotoStickerTypeCustomEmoji
import dev.g000sha256.tdl.dto.ChatPhotoStickerTypeRegularOrMask
import dev.g000sha256.tdl.dto.ChatRevenueTransactionType
import dev.g000sha256.tdl.dto.ChatRevenueTransactionTypeFragmentRefund
import dev.g000sha256.tdl.dto.ChatRevenueTransactionTypeFragmentWithdrawal
import dev.g000sha256.tdl.dto.ChatRevenueTransactionTypeSponsoredMessageEarnings
import dev.g000sha256.tdl.dto.ChatRevenueTransactionTypeSuggestedPostEarnings
import dev.g000sha256.tdl.dto.ChatRevenueTransactionTypeUnsupported
import dev.g000sha256.tdl.dto.ChatSource
import dev.g000sha256.tdl.dto.ChatSourceMtprotoProxy
import dev.g000sha256.tdl.dto.ChatSourcePublicServiceAnnouncement
import dev.g000sha256.tdl.dto.ChatStatistics
import dev.g000sha256.tdl.dto.ChatStatisticsChannel
import dev.g000sha256.tdl.dto.ChatStatisticsObjectType
import dev.g000sha256.tdl.dto.ChatStatisticsObjectTypeMessage
import dev.g000sha256.tdl.dto.ChatStatisticsObjectTypeStory
import dev.g000sha256.tdl.dto.ChatStatisticsSupergroup
import dev.g000sha256.tdl.dto.ChatTheme
import dev.g000sha256.tdl.dto.ChatThemeEmoji
import dev.g000sha256.tdl.dto.ChatThemeGift
import dev.g000sha256.tdl.dto.ChatType
import dev.g000sha256.tdl.dto.ChatTypeBasicGroup
import dev.g000sha256.tdl.dto.ChatTypePrivate
import dev.g000sha256.tdl.dto.ChatTypeSecret
import dev.g000sha256.tdl.dto.ChatTypeSupergroup
import dev.g000sha256.tdl.dto.CheckChatUsernameResult
import dev.g000sha256.tdl.dto.CheckChatUsernameResultOk
import dev.g000sha256.tdl.dto.CheckChatUsernameResultPublicChatsTooMany
import dev.g000sha256.tdl.dto.CheckChatUsernameResultPublicGroupsUnavailable
import dev.g000sha256.tdl.dto.CheckChatUsernameResultUsernameInvalid
import dev.g000sha256.tdl.dto.CheckChatUsernameResultUsernameOccupied
import dev.g000sha256.tdl.dto.CheckChatUsernameResultUsernamePurchasable
import dev.g000sha256.tdl.dto.CheckStickerSetNameResult
import dev.g000sha256.tdl.dto.CheckStickerSetNameResultNameInvalid
import dev.g000sha256.tdl.dto.CheckStickerSetNameResultNameOccupied
import dev.g000sha256.tdl.dto.CheckStickerSetNameResultOk
import dev.g000sha256.tdl.dto.CollectibleItemType
import dev.g000sha256.tdl.dto.CollectibleItemTypePhoneNumber
import dev.g000sha256.tdl.dto.CollectibleItemTypeUsername
import dev.g000sha256.tdl.dto.CommunityMemberStatus
import dev.g000sha256.tdl.dto.CommunityMemberStatusAdministrator
import dev.g000sha256.tdl.dto.CommunityMemberStatusBanned
import dev.g000sha256.tdl.dto.CommunityMemberStatusCreator
import dev.g000sha256.tdl.dto.CommunityMemberStatusLeft
import dev.g000sha256.tdl.dto.CommunityMemberStatusMember
import dev.g000sha256.tdl.dto.ConnectionState
import dev.g000sha256.tdl.dto.ConnectionStateConnecting
import dev.g000sha256.tdl.dto.ConnectionStateConnectingToProxy
import dev.g000sha256.tdl.dto.ConnectionStateReady
import dev.g000sha256.tdl.dto.ConnectionStateUpdating
import dev.g000sha256.tdl.dto.ConnectionStateWaitingForNetwork
import dev.g000sha256.tdl.dto.CraftGiftResult
import dev.g000sha256.tdl.dto.CraftGiftResultFail
import dev.g000sha256.tdl.dto.CraftGiftResultInvalidGift
import dev.g000sha256.tdl.dto.CraftGiftResultSuccess
import dev.g000sha256.tdl.dto.CraftGiftResultTooEarly
import dev.g000sha256.tdl.dto.DateTimeFormattingType
import dev.g000sha256.tdl.dto.DateTimeFormattingTypeAbsolute
import dev.g000sha256.tdl.dto.DateTimeFormattingTypeRelative
import dev.g000sha256.tdl.dto.DateTimePartPrecision
import dev.g000sha256.tdl.dto.DateTimePartPrecisionLong
import dev.g000sha256.tdl.dto.DateTimePartPrecisionNone
import dev.g000sha256.tdl.dto.DateTimePartPrecisionShort
import dev.g000sha256.tdl.dto.DeviceToken
import dev.g000sha256.tdl.dto.DeviceTokenApplePush
import dev.g000sha256.tdl.dto.DeviceTokenApplePushVoIP
import dev.g000sha256.tdl.dto.DeviceTokenBlackBerryPush
import dev.g000sha256.tdl.dto.DeviceTokenFirebaseCloudMessaging
import dev.g000sha256.tdl.dto.DeviceTokenHuaweiPush
import dev.g000sha256.tdl.dto.DeviceTokenMicrosoftPush
import dev.g000sha256.tdl.dto.DeviceTokenMicrosoftPushVoIP
import dev.g000sha256.tdl.dto.DeviceTokenSimplePush
import dev.g000sha256.tdl.dto.DeviceTokenTizenPush
import dev.g000sha256.tdl.dto.DeviceTokenUbuntuPush
import dev.g000sha256.tdl.dto.DeviceTokenWebPush
import dev.g000sha256.tdl.dto.DeviceTokenWindowsPush
import dev.g000sha256.tdl.dto.DiceStickers
import dev.g000sha256.tdl.dto.DiceStickersRegular
import dev.g000sha256.tdl.dto.DiceStickersSlotMachine
import dev.g000sha256.tdl.dto.DiffEntityType
import dev.g000sha256.tdl.dto.DiffEntityTypeDelete
import dev.g000sha256.tdl.dto.DiffEntityTypeInsert
import dev.g000sha256.tdl.dto.DiffEntityTypeReplace
import dev.g000sha256.tdl.dto.DraftMessageContent
import dev.g000sha256.tdl.dto.DraftMessageContentRichMessage
import dev.g000sha256.tdl.dto.DraftMessageContentText
import dev.g000sha256.tdl.dto.DraftMessageContentVideoNote
import dev.g000sha256.tdl.dto.DraftMessageContentVoiceNote
import dev.g000sha256.tdl.dto.EmailAddressAuthentication
import dev.g000sha256.tdl.dto.EmailAddressAuthenticationAppleId
import dev.g000sha256.tdl.dto.EmailAddressAuthenticationCode
import dev.g000sha256.tdl.dto.EmailAddressAuthenticationGoogleId
import dev.g000sha256.tdl.dto.EmailAddressResetState
import dev.g000sha256.tdl.dto.EmailAddressResetStateAvailable
import dev.g000sha256.tdl.dto.EmailAddressResetStatePending
import dev.g000sha256.tdl.dto.EmojiCategorySource
import dev.g000sha256.tdl.dto.EmojiCategorySourcePremium
import dev.g000sha256.tdl.dto.EmojiCategorySourceSearch
import dev.g000sha256.tdl.dto.EmojiCategoryType
import dev.g000sha256.tdl.dto.EmojiCategoryTypeChatPhoto
import dev.g000sha256.tdl.dto.EmojiCategoryTypeDefault
import dev.g000sha256.tdl.dto.EmojiCategoryTypeEmojiStatus
import dev.g000sha256.tdl.dto.EmojiCategoryTypeRegularStickers
import dev.g000sha256.tdl.dto.EmojiStatusType
import dev.g000sha256.tdl.dto.EmojiStatusTypeCustomEmoji
import dev.g000sha256.tdl.dto.EmojiStatusTypeUpgradedGift
import dev.g000sha256.tdl.dto.FileType
import dev.g000sha256.tdl.dto.FileTypeAnimation
import dev.g000sha256.tdl.dto.FileTypeAudio
import dev.g000sha256.tdl.dto.FileTypeDocument
import dev.g000sha256.tdl.dto.FileTypeLivePhotoVideo
import dev.g000sha256.tdl.dto.FileTypeNone
import dev.g000sha256.tdl.dto.FileTypeNotificationSound
import dev.g000sha256.tdl.dto.FileTypePhoto
import dev.g000sha256.tdl.dto.FileTypePhotoStory
import dev.g000sha256.tdl.dto.FileTypeProfilePhoto
import dev.g000sha256.tdl.dto.FileTypeSecret
import dev.g000sha256.tdl.dto.FileTypeSecretThumbnail
import dev.g000sha256.tdl.dto.FileTypeSecure
import dev.g000sha256.tdl.dto.FileTypeSelfDestructingLivePhotoVideo
import dev.g000sha256.tdl.dto.FileTypeSelfDestructingPhoto
import dev.g000sha256.tdl.dto.FileTypeSelfDestructingVideo
import dev.g000sha256.tdl.dto.FileTypeSelfDestructingVideoNote
import dev.g000sha256.tdl.dto.FileTypeSelfDestructingVoiceNote
import dev.g000sha256.tdl.dto.FileTypeSticker
import dev.g000sha256.tdl.dto.FileTypeThumbnail
import dev.g000sha256.tdl.dto.FileTypeUnknown
import dev.g000sha256.tdl.dto.FileTypeVideo
import dev.g000sha256.tdl.dto.FileTypeVideoNote
import dev.g000sha256.tdl.dto.FileTypeVideoStory
import dev.g000sha256.tdl.dto.FileTypeVoiceNote
import dev.g000sha256.tdl.dto.FileTypeWallpaper
import dev.g000sha256.tdl.dto.FirebaseAuthenticationSettings
import dev.g000sha256.tdl.dto.FirebaseAuthenticationSettingsAndroid
import dev.g000sha256.tdl.dto.FirebaseAuthenticationSettingsIos
import dev.g000sha256.tdl.dto.FirebaseDeviceVerificationParameters
import dev.g000sha256.tdl.dto.FirebaseDeviceVerificationParametersPlayIntegrity
import dev.g000sha256.tdl.dto.FirebaseDeviceVerificationParametersSafetyNet
import dev.g000sha256.tdl.dto.GiftForResaleOrder
import dev.g000sha256.tdl.dto.GiftForResaleOrderNumber
import dev.g000sha256.tdl.dto.GiftForResaleOrderPrice
import dev.g000sha256.tdl.dto.GiftForResaleOrderPriceChangeDate
import dev.g000sha256.tdl.dto.GiftPurchaseOfferState
import dev.g000sha256.tdl.dto.GiftPurchaseOfferStateAccepted
import dev.g000sha256.tdl.dto.GiftPurchaseOfferStatePending
import dev.g000sha256.tdl.dto.GiftPurchaseOfferStateRejected
import dev.g000sha256.tdl.dto.GiftResalePrice
import dev.g000sha256.tdl.dto.GiftResalePriceGram
import dev.g000sha256.tdl.dto.GiftResalePriceStar
import dev.g000sha256.tdl.dto.GiftResaleResult
import dev.g000sha256.tdl.dto.GiftResaleResultOk
import dev.g000sha256.tdl.dto.GiftResaleResultPriceIncreased
import dev.g000sha256.tdl.dto.GiveawayInfo
import dev.g000sha256.tdl.dto.GiveawayInfoCompleted
import dev.g000sha256.tdl.dto.GiveawayInfoOngoing
import dev.g000sha256.tdl.dto.GiveawayParticipantStatus
import dev.g000sha256.tdl.dto.GiveawayParticipantStatusAdministrator
import dev.g000sha256.tdl.dto.GiveawayParticipantStatusAlreadyWasMember
import dev.g000sha256.tdl.dto.GiveawayParticipantStatusDisallowedCountry
import dev.g000sha256.tdl.dto.GiveawayParticipantStatusEligible
import dev.g000sha256.tdl.dto.GiveawayParticipantStatusParticipating
import dev.g000sha256.tdl.dto.GiveawayPrize
import dev.g000sha256.tdl.dto.GiveawayPrizePremium
import dev.g000sha256.tdl.dto.GiveawayPrizeStars
import dev.g000sha256.tdl.dto.GroupCallDataChannel
import dev.g000sha256.tdl.dto.GroupCallDataChannelMain
import dev.g000sha256.tdl.dto.GroupCallDataChannelScreenSharing
import dev.g000sha256.tdl.dto.GroupCallVideoQuality
import dev.g000sha256.tdl.dto.GroupCallVideoQualityFull
import dev.g000sha256.tdl.dto.GroupCallVideoQualityMedium
import dev.g000sha256.tdl.dto.GroupCallVideoQualityThumbnail
import dev.g000sha256.tdl.dto.InlineKeyboardButtonType
import dev.g000sha256.tdl.dto.InlineKeyboardButtonTypeBuy
import dev.g000sha256.tdl.dto.InlineKeyboardButtonTypeCallback
import dev.g000sha256.tdl.dto.InlineKeyboardButtonTypeCallbackGame
import dev.g000sha256.tdl.dto.InlineKeyboardButtonTypeCallbackWithPassword
import dev.g000sha256.tdl.dto.InlineKeyboardButtonTypeCopyText
import dev.g000sha256.tdl.dto.InlineKeyboardButtonTypeLoginUrl
import dev.g000sha256.tdl.dto.InlineKeyboardButtonTypeSwitchInline
import dev.g000sha256.tdl.dto.InlineKeyboardButtonTypeUrl
import dev.g000sha256.tdl.dto.InlineKeyboardButtonTypeUser
import dev.g000sha256.tdl.dto.InlineKeyboardButtonTypeWebApp
import dev.g000sha256.tdl.dto.InlineQueryResult
import dev.g000sha256.tdl.dto.InlineQueryResultAnimation
import dev.g000sha256.tdl.dto.InlineQueryResultArticle
import dev.g000sha256.tdl.dto.InlineQueryResultAudio
import dev.g000sha256.tdl.dto.InlineQueryResultContact
import dev.g000sha256.tdl.dto.InlineQueryResultDocument
import dev.g000sha256.tdl.dto.InlineQueryResultGame
import dev.g000sha256.tdl.dto.InlineQueryResultLocation
import dev.g000sha256.tdl.dto.InlineQueryResultPhoto
import dev.g000sha256.tdl.dto.InlineQueryResultSticker
import dev.g000sha256.tdl.dto.InlineQueryResultVenue
import dev.g000sha256.tdl.dto.InlineQueryResultVideo
import dev.g000sha256.tdl.dto.InlineQueryResultVoiceNote
import dev.g000sha256.tdl.dto.InlineQueryResultsButtonType
import dev.g000sha256.tdl.dto.InlineQueryResultsButtonTypeStartBot
import dev.g000sha256.tdl.dto.InlineQueryResultsButtonTypeWebApp
import dev.g000sha256.tdl.dto.InputBackground
import dev.g000sha256.tdl.dto.InputBackgroundLocal
import dev.g000sha256.tdl.dto.InputBackgroundPrevious
import dev.g000sha256.tdl.dto.InputBackgroundRemote
import dev.g000sha256.tdl.dto.InputCall
import dev.g000sha256.tdl.dto.InputCallDiscarded
import dev.g000sha256.tdl.dto.InputCallFromMessage
import dev.g000sha256.tdl.dto.InputChatPhoto
import dev.g000sha256.tdl.dto.InputChatPhotoAnimation
import dev.g000sha256.tdl.dto.InputChatPhotoPrevious
import dev.g000sha256.tdl.dto.InputChatPhotoStatic
import dev.g000sha256.tdl.dto.InputChatPhotoSticker
import dev.g000sha256.tdl.dto.InputChatTheme
import dev.g000sha256.tdl.dto.InputChatThemeEmoji
import dev.g000sha256.tdl.dto.InputChatThemeGift
import dev.g000sha256.tdl.dto.InputCredentials
import dev.g000sha256.tdl.dto.InputCredentialsApplePay
import dev.g000sha256.tdl.dto.InputCredentialsGooglePay
import dev.g000sha256.tdl.dto.InputCredentialsNew
import dev.g000sha256.tdl.dto.InputCredentialsSaved
import dev.g000sha256.tdl.dto.InputFile
import dev.g000sha256.tdl.dto.InputFileGenerated
import dev.g000sha256.tdl.dto.InputFileId
import dev.g000sha256.tdl.dto.InputFileLocal
import dev.g000sha256.tdl.dto.InputFileRemote
import dev.g000sha256.tdl.dto.InputGroupCall
import dev.g000sha256.tdl.dto.InputGroupCallLink
import dev.g000sha256.tdl.dto.InputGroupCallMessage
import dev.g000sha256.tdl.dto.InputInlineQueryResult
import dev.g000sha256.tdl.dto.InputInlineQueryResultAnimation
import dev.g000sha256.tdl.dto.InputInlineQueryResultArticle
import dev.g000sha256.tdl.dto.InputInlineQueryResultAudio
import dev.g000sha256.tdl.dto.InputInlineQueryResultContact
import dev.g000sha256.tdl.dto.InputInlineQueryResultDocument
import dev.g000sha256.tdl.dto.InputInlineQueryResultGame
import dev.g000sha256.tdl.dto.InputInlineQueryResultLocation
import dev.g000sha256.tdl.dto.InputInlineQueryResultPhoto
import dev.g000sha256.tdl.dto.InputInlineQueryResultSticker
import dev.g000sha256.tdl.dto.InputInlineQueryResultVenue
import dev.g000sha256.tdl.dto.InputInlineQueryResultVideo
import dev.g000sha256.tdl.dto.InputInlineQueryResultVoiceNote
import dev.g000sha256.tdl.dto.InputInvoice
import dev.g000sha256.tdl.dto.InputInvoiceMessage
import dev.g000sha256.tdl.dto.InputInvoiceName
import dev.g000sha256.tdl.dto.InputInvoiceTelegram
import dev.g000sha256.tdl.dto.InputMessageAnimation
import dev.g000sha256.tdl.dto.InputMessageAudio
import dev.g000sha256.tdl.dto.InputMessageChecklist
import dev.g000sha256.tdl.dto.InputMessageContact
import dev.g000sha256.tdl.dto.InputMessageContent
import dev.g000sha256.tdl.dto.InputMessageDice
import dev.g000sha256.tdl.dto.InputMessageDocument
import dev.g000sha256.tdl.dto.InputMessageForwarded
import dev.g000sha256.tdl.dto.InputMessageGame
import dev.g000sha256.tdl.dto.InputMessageInvoice
import dev.g000sha256.tdl.dto.InputMessageLiveLocation
import dev.g000sha256.tdl.dto.InputMessageLocation
import dev.g000sha256.tdl.dto.InputMessagePaidMedia
import dev.g000sha256.tdl.dto.InputMessagePhoto
import dev.g000sha256.tdl.dto.InputMessagePoll
import dev.g000sha256.tdl.dto.InputMessageReplyTo
import dev.g000sha256.tdl.dto.InputMessageReplyToEphemeralMessage
import dev.g000sha256.tdl.dto.InputMessageReplyToExternalMessage
import dev.g000sha256.tdl.dto.InputMessageReplyToMessage
import dev.g000sha256.tdl.dto.InputMessageReplyToStory
import dev.g000sha256.tdl.dto.InputMessageRichMessage
import dev.g000sha256.tdl.dto.InputMessageStakeDice
import dev.g000sha256.tdl.dto.InputMessageSticker
import dev.g000sha256.tdl.dto.InputMessageStory
import dev.g000sha256.tdl.dto.InputMessageText
import dev.g000sha256.tdl.dto.InputMessageVenue
import dev.g000sha256.tdl.dto.InputMessageVideo
import dev.g000sha256.tdl.dto.InputMessageVideoNote
import dev.g000sha256.tdl.dto.InputMessageVoiceNote
import dev.g000sha256.tdl.dto.InputPageBlock
import dev.g000sha256.tdl.dto.InputPageBlockAnchor
import dev.g000sha256.tdl.dto.InputPageBlockAnimation
import dev.g000sha256.tdl.dto.InputPageBlockAudio
import dev.g000sha256.tdl.dto.InputPageBlockBlockQuote
import dev.g000sha256.tdl.dto.InputPageBlockCollage
import dev.g000sha256.tdl.dto.InputPageBlockDetails
import dev.g000sha256.tdl.dto.InputPageBlockDivider
import dev.g000sha256.tdl.dto.InputPageBlockFooter
import dev.g000sha256.tdl.dto.InputPageBlockList
import dev.g000sha256.tdl.dto.InputPageBlockMap
import dev.g000sha256.tdl.dto.InputPageBlockMathematicalExpression
import dev.g000sha256.tdl.dto.InputPageBlockParagraph
import dev.g000sha256.tdl.dto.InputPageBlockPhoto
import dev.g000sha256.tdl.dto.InputPageBlockPreformatted
import dev.g000sha256.tdl.dto.InputPageBlockPullQuote
import dev.g000sha256.tdl.dto.InputPageBlockSectionHeading
import dev.g000sha256.tdl.dto.InputPageBlockSlideshow
import dev.g000sha256.tdl.dto.InputPageBlockTable
import dev.g000sha256.tdl.dto.InputPageBlockThinking
import dev.g000sha256.tdl.dto.InputPageBlockVideo
import dev.g000sha256.tdl.dto.InputPageBlockVoiceNote
import dev.g000sha256.tdl.dto.InputPaidMediaType
import dev.g000sha256.tdl.dto.InputPaidMediaTypePhoto
import dev.g000sha256.tdl.dto.InputPaidMediaTypeVideo
import dev.g000sha256.tdl.dto.InputPassportElement
import dev.g000sha256.tdl.dto.InputPassportElementAddress
import dev.g000sha256.tdl.dto.InputPassportElementBankStatement
import dev.g000sha256.tdl.dto.InputPassportElementDriverLicense
import dev.g000sha256.tdl.dto.InputPassportElementEmailAddress
import dev.g000sha256.tdl.dto.InputPassportElementErrorSource
import dev.g000sha256.tdl.dto.InputPassportElementErrorSourceDataField
import dev.g000sha256.tdl.dto.InputPassportElementErrorSourceFile
import dev.g000sha256.tdl.dto.InputPassportElementErrorSourceFiles
import dev.g000sha256.tdl.dto.InputPassportElementErrorSourceFrontSide
import dev.g000sha256.tdl.dto.InputPassportElementErrorSourceReverseSide
import dev.g000sha256.tdl.dto.InputPassportElementErrorSourceSelfie
import dev.g000sha256.tdl.dto.InputPassportElementErrorSourceTranslationFile
import dev.g000sha256.tdl.dto.InputPassportElementErrorSourceTranslationFiles
import dev.g000sha256.tdl.dto.InputPassportElementErrorSourceUnspecified
import dev.g000sha256.tdl.dto.InputPassportElementIdentityCard
import dev.g000sha256.tdl.dto.InputPassportElementInternalPassport
import dev.g000sha256.tdl.dto.InputPassportElementPassport
import dev.g000sha256.tdl.dto.InputPassportElementPassportRegistration
import dev.g000sha256.tdl.dto.InputPassportElementPersonalDetails
import dev.g000sha256.tdl.dto.InputPassportElementPhoneNumber
import dev.g000sha256.tdl.dto.InputPassportElementRentalAgreement
import dev.g000sha256.tdl.dto.InputPassportElementTemporaryRegistration
import dev.g000sha256.tdl.dto.InputPassportElementUtilityBill
import dev.g000sha256.tdl.dto.InputPollMedia
import dev.g000sha256.tdl.dto.InputPollMediaAnimation
import dev.g000sha256.tdl.dto.InputPollMediaAudio
import dev.g000sha256.tdl.dto.InputPollMediaDocument
import dev.g000sha256.tdl.dto.InputPollMediaLink
import dev.g000sha256.tdl.dto.InputPollMediaLocation
import dev.g000sha256.tdl.dto.InputPollMediaPhoto
import dev.g000sha256.tdl.dto.InputPollMediaSticker
import dev.g000sha256.tdl.dto.InputPollMediaVenue
import dev.g000sha256.tdl.dto.InputPollMediaVideo
import dev.g000sha256.tdl.dto.InputPollType
import dev.g000sha256.tdl.dto.InputPollTypeQuiz
import dev.g000sha256.tdl.dto.InputPollTypeRegular
import dev.g000sha256.tdl.dto.InputStoryAreaType
import dev.g000sha256.tdl.dto.InputStoryAreaTypeFoundVenue
import dev.g000sha256.tdl.dto.InputStoryAreaTypeLink
import dev.g000sha256.tdl.dto.InputStoryAreaTypeLocation
import dev.g000sha256.tdl.dto.InputStoryAreaTypeMessage
import dev.g000sha256.tdl.dto.InputStoryAreaTypePreviousVenue
import dev.g000sha256.tdl.dto.InputStoryAreaTypeSuggestedReaction
import dev.g000sha256.tdl.dto.InputStoryAreaTypeUpgradedGift
import dev.g000sha256.tdl.dto.InputStoryAreaTypeWeather
import dev.g000sha256.tdl.dto.InputStoryContent
import dev.g000sha256.tdl.dto.InputStoryContentPhoto
import dev.g000sha256.tdl.dto.InputStoryContentVideo
import dev.g000sha256.tdl.dto.InternalLinkType
import dev.g000sha256.tdl.dto.InternalLinkTypeAttachmentMenuBot
import dev.g000sha256.tdl.dto.InternalLinkTypeAuthenticationCode
import dev.g000sha256.tdl.dto.InternalLinkTypeBackground
import dev.g000sha256.tdl.dto.InternalLinkTypeBotAddToChannel
import dev.g000sha256.tdl.dto.InternalLinkTypeBotStart
import dev.g000sha256.tdl.dto.InternalLinkTypeBotStartInGroup
import dev.g000sha256.tdl.dto.InternalLinkTypeBusinessChat
import dev.g000sha256.tdl.dto.InternalLinkTypeCallsPage
import dev.g000sha256.tdl.dto.InternalLinkTypeChatAffiliateProgram
import dev.g000sha256.tdl.dto.InternalLinkTypeChatBoost
import dev.g000sha256.tdl.dto.InternalLinkTypeChatFolderInvite
import dev.g000sha256.tdl.dto.InternalLinkTypeChatInvite
import dev.g000sha256.tdl.dto.InternalLinkTypeChatSelection
import dev.g000sha256.tdl.dto.InternalLinkTypeContactsPage
import dev.g000sha256.tdl.dto.InternalLinkTypeDirectMessagesChat
import dev.g000sha256.tdl.dto.InternalLinkTypeGame
import dev.g000sha256.tdl.dto.InternalLinkTypeGiftAuction
import dev.g000sha256.tdl.dto.InternalLinkTypeGiftCollection
import dev.g000sha256.tdl.dto.InternalLinkTypeGroupCall
import dev.g000sha256.tdl.dto.InternalLinkTypeInstantView
import dev.g000sha256.tdl.dto.InternalLinkTypeInvoice
import dev.g000sha256.tdl.dto.InternalLinkTypeLanguagePack
import dev.g000sha256.tdl.dto.InternalLinkTypeLiveStory
import dev.g000sha256.tdl.dto.InternalLinkTypeMainWebApp
import dev.g000sha256.tdl.dto.InternalLinkTypeMessage
import dev.g000sha256.tdl.dto.InternalLinkTypeMessageDraft
import dev.g000sha256.tdl.dto.InternalLinkTypeMyProfilePage
import dev.g000sha256.tdl.dto.InternalLinkTypeNewChannelChat
import dev.g000sha256.tdl.dto.InternalLinkTypeNewGroupChat
import dev.g000sha256.tdl.dto.InternalLinkTypeNewPrivateChat
import dev.g000sha256.tdl.dto.InternalLinkTypeNewStory
import dev.g000sha256.tdl.dto.InternalLinkTypeOauth
import dev.g000sha256.tdl.dto.InternalLinkTypePassportDataRequest
import dev.g000sha256.tdl.dto.InternalLinkTypePhoneNumberConfirmation
import dev.g000sha256.tdl.dto.InternalLinkTypePremiumFeaturesPage
import dev.g000sha256.tdl.dto.InternalLinkTypePremiumGiftCode
import dev.g000sha256.tdl.dto.InternalLinkTypePremiumGiftPurchase
import dev.g000sha256.tdl.dto.InternalLinkTypeProxy
import dev.g000sha256.tdl.dto.InternalLinkTypePublicChat
import dev.g000sha256.tdl.dto.InternalLinkTypeQrCodeAuthentication
import dev.g000sha256.tdl.dto.InternalLinkTypeRequestManagedBot
import dev.g000sha256.tdl.dto.InternalLinkTypeRestorePurchases
import dev.g000sha256.tdl.dto.InternalLinkTypeSavedMessages
import dev.g000sha256.tdl.dto.InternalLinkTypeSearch
import dev.g000sha256.tdl.dto.InternalLinkTypeSettings
import dev.g000sha256.tdl.dto.InternalLinkTypeStarPurchase
import dev.g000sha256.tdl.dto.InternalLinkTypeStickerSet
import dev.g000sha256.tdl.dto.InternalLinkTypeStory
import dev.g000sha256.tdl.dto.InternalLinkTypeStoryAlbum
import dev.g000sha256.tdl.dto.InternalLinkTypeTextCompositionStyle
import dev.g000sha256.tdl.dto.InternalLinkTypeTheme
import dev.g000sha256.tdl.dto.InternalLinkTypeUnknownDeepLink
import dev.g000sha256.tdl.dto.InternalLinkTypeUpgradedGift
import dev.g000sha256.tdl.dto.InternalLinkTypeUserPhoneNumber
import dev.g000sha256.tdl.dto.InternalLinkTypeUserToken
import dev.g000sha256.tdl.dto.InternalLinkTypeVideoChat
import dev.g000sha256.tdl.dto.InternalLinkTypeWebApp
import dev.g000sha256.tdl.dto.InviteGroupCallParticipantResult
import dev.g000sha256.tdl.dto.InviteGroupCallParticipantResultSuccess
import dev.g000sha256.tdl.dto.InviteGroupCallParticipantResultUserAlreadyParticipant
import dev.g000sha256.tdl.dto.InviteGroupCallParticipantResultUserPrivacyRestricted
import dev.g000sha256.tdl.dto.InviteGroupCallParticipantResultUserWasBanned
import dev.g000sha256.tdl.dto.InviteLinkChatType
import dev.g000sha256.tdl.dto.InviteLinkChatTypeBasicGroup
import dev.g000sha256.tdl.dto.InviteLinkChatTypeChannel
import dev.g000sha256.tdl.dto.InviteLinkChatTypeSupergroup
import dev.g000sha256.tdl.dto.JsonValue
import dev.g000sha256.tdl.dto.JsonValueArray
import dev.g000sha256.tdl.dto.JsonValueBoolean
import dev.g000sha256.tdl.dto.JsonValueNull
import dev.g000sha256.tdl.dto.JsonValueNumber
import dev.g000sha256.tdl.dto.JsonValueObject
import dev.g000sha256.tdl.dto.JsonValueString
import dev.g000sha256.tdl.dto.KeyboardButtonSource
import dev.g000sha256.tdl.dto.KeyboardButtonSourceMessage
import dev.g000sha256.tdl.dto.KeyboardButtonSourceWebApp
import dev.g000sha256.tdl.dto.KeyboardButtonType
import dev.g000sha256.tdl.dto.KeyboardButtonTypeRequestChat
import dev.g000sha256.tdl.dto.KeyboardButtonTypeRequestLocation
import dev.g000sha256.tdl.dto.KeyboardButtonTypeRequestManagedBot
import dev.g000sha256.tdl.dto.KeyboardButtonTypeRequestPhoneNumber
import dev.g000sha256.tdl.dto.KeyboardButtonTypeRequestPoll
import dev.g000sha256.tdl.dto.KeyboardButtonTypeRequestUsers
import dev.g000sha256.tdl.dto.KeyboardButtonTypeText
import dev.g000sha256.tdl.dto.KeyboardButtonTypeWebApp
import dev.g000sha256.tdl.dto.LanguagePackStringValue
import dev.g000sha256.tdl.dto.LanguagePackStringValueDeleted
import dev.g000sha256.tdl.dto.LanguagePackStringValueOrdinary
import dev.g000sha256.tdl.dto.LanguagePackStringValuePluralized
import dev.g000sha256.tdl.dto.LinkPreviewAlbumMedia
import dev.g000sha256.tdl.dto.LinkPreviewAlbumMediaPhoto
import dev.g000sha256.tdl.dto.LinkPreviewAlbumMediaVideo
import dev.g000sha256.tdl.dto.LinkPreviewType
import dev.g000sha256.tdl.dto.LinkPreviewTypeAlbum
import dev.g000sha256.tdl.dto.LinkPreviewTypeAnimation
import dev.g000sha256.tdl.dto.LinkPreviewTypeApp
import dev.g000sha256.tdl.dto.LinkPreviewTypeArticle
import dev.g000sha256.tdl.dto.LinkPreviewTypeAudio
import dev.g000sha256.tdl.dto.LinkPreviewTypeBackground
import dev.g000sha256.tdl.dto.LinkPreviewTypeChannelBoost
import dev.g000sha256.tdl.dto.LinkPreviewTypeChat
import dev.g000sha256.tdl.dto.LinkPreviewTypeDirectMessagesChat
import dev.g000sha256.tdl.dto.LinkPreviewTypeDocument
import dev.g000sha256.tdl.dto.LinkPreviewTypeEmbeddedAnimationPlayer
import dev.g000sha256.tdl.dto.LinkPreviewTypeEmbeddedAudioPlayer
import dev.g000sha256.tdl.dto.LinkPreviewTypeEmbeddedVideoPlayer
import dev.g000sha256.tdl.dto.LinkPreviewTypeExternalAudio
import dev.g000sha256.tdl.dto.LinkPreviewTypeExternalVideo
import dev.g000sha256.tdl.dto.LinkPreviewTypeGiftAuction
import dev.g000sha256.tdl.dto.LinkPreviewTypeGiftCollection
import dev.g000sha256.tdl.dto.LinkPreviewTypeGroupCall
import dev.g000sha256.tdl.dto.LinkPreviewTypeInvoice
import dev.g000sha256.tdl.dto.LinkPreviewTypeLiveStory
import dev.g000sha256.tdl.dto.LinkPreviewTypeMessage
import dev.g000sha256.tdl.dto.LinkPreviewTypePhoto
import dev.g000sha256.tdl.dto.LinkPreviewTypePremiumGiftCode
import dev.g000sha256.tdl.dto.LinkPreviewTypeRequestManagedBot
import dev.g000sha256.tdl.dto.LinkPreviewTypeShareableChatFolder
import dev.g000sha256.tdl.dto.LinkPreviewTypeSticker
import dev.g000sha256.tdl.dto.LinkPreviewTypeStickerSet
import dev.g000sha256.tdl.dto.LinkPreviewTypeStory
import dev.g000sha256.tdl.dto.LinkPreviewTypeStoryAlbum
import dev.g000sha256.tdl.dto.LinkPreviewTypeSupergroupBoost
import dev.g000sha256.tdl.dto.LinkPreviewTypeTextCompositionStyle
import dev.g000sha256.tdl.dto.LinkPreviewTypeTheme
import dev.g000sha256.tdl.dto.LinkPreviewTypeUnsupported
import dev.g000sha256.tdl.dto.LinkPreviewTypeUpgradedGift
import dev.g000sha256.tdl.dto.LinkPreviewTypeUser
import dev.g000sha256.tdl.dto.LinkPreviewTypeVideo
import dev.g000sha256.tdl.dto.LinkPreviewTypeVideoChat
import dev.g000sha256.tdl.dto.LinkPreviewTypeVideoNote
import dev.g000sha256.tdl.dto.LinkPreviewTypeVoiceNote
import dev.g000sha256.tdl.dto.LinkPreviewTypeWebApp
import dev.g000sha256.tdl.dto.LogStream
import dev.g000sha256.tdl.dto.LogStreamDefault
import dev.g000sha256.tdl.dto.LogStreamEmpty
import dev.g000sha256.tdl.dto.LogStreamFile
import dev.g000sha256.tdl.dto.LoginUrlInfo
import dev.g000sha256.tdl.dto.LoginUrlInfoOpen
import dev.g000sha256.tdl.dto.LoginUrlInfoRequestConfirmation
import dev.g000sha256.tdl.dto.MaskPoint
import dev.g000sha256.tdl.dto.MaskPointChin
import dev.g000sha256.tdl.dto.MaskPointEyes
import dev.g000sha256.tdl.dto.MaskPointForehead
import dev.g000sha256.tdl.dto.MaskPointMouth
import dev.g000sha256.tdl.dto.MessageAnimatedEmoji
import dev.g000sha256.tdl.dto.MessageAnimation
import dev.g000sha256.tdl.dto.MessageAudio
import dev.g000sha256.tdl.dto.MessageBasicGroupChatCreate
import dev.g000sha256.tdl.dto.MessageBotWriteAccessAllowed
import dev.g000sha256.tdl.dto.MessageCall
import dev.g000sha256.tdl.dto.MessageChatAddMembers
import dev.g000sha256.tdl.dto.MessageChatAddedToCommunity
import dev.g000sha256.tdl.dto.MessageChatBoost
import dev.g000sha256.tdl.dto.MessageChatChangePhoto
import dev.g000sha256.tdl.dto.MessageChatChangeTitle
import dev.g000sha256.tdl.dto.MessageChatDeleteMember
import dev.g000sha256.tdl.dto.MessageChatDeletePhoto
import dev.g000sha256.tdl.dto.MessageChatHasProtectedContentDisableRequested
import dev.g000sha256.tdl.dto.MessageChatHasProtectedContentToggled
import dev.g000sha256.tdl.dto.MessageChatJoinByLink
import dev.g000sha256.tdl.dto.MessageChatJoinByRequest
import dev.g000sha256.tdl.dto.MessageChatOwnerChanged
import dev.g000sha256.tdl.dto.MessageChatOwnerLeft
import dev.g000sha256.tdl.dto.MessageChatRemovedFromCommunity
import dev.g000sha256.tdl.dto.MessageChatSetBackground
import dev.g000sha256.tdl.dto.MessageChatSetMessageAutoDeleteTime
import dev.g000sha256.tdl.dto.MessageChatSetTheme
import dev.g000sha256.tdl.dto.MessageChatShared
import dev.g000sha256.tdl.dto.MessageChatUpgradeFrom
import dev.g000sha256.tdl.dto.MessageChatUpgradeTo
import dev.g000sha256.tdl.dto.MessageChecklist
import dev.g000sha256.tdl.dto.MessageChecklistTasksAdded
import dev.g000sha256.tdl.dto.MessageChecklistTasksDone
import dev.g000sha256.tdl.dto.MessageContact
import dev.g000sha256.tdl.dto.MessageContactRegistered
import dev.g000sha256.tdl.dto.MessageContent
import dev.g000sha256.tdl.dto.MessageCustomServiceAction
import dev.g000sha256.tdl.dto.MessageDice
import dev.g000sha256.tdl.dto.MessageDirectMessagePriceChanged
import dev.g000sha256.tdl.dto.MessageDocument
import dev.g000sha256.tdl.dto.MessageEffectType
import dev.g000sha256.tdl.dto.MessageEffectTypeEmojiReaction
import dev.g000sha256.tdl.dto.MessageEffectTypePremiumSticker
import dev.g000sha256.tdl.dto.MessageExpiredPhoto
import dev.g000sha256.tdl.dto.MessageExpiredVideo
import dev.g000sha256.tdl.dto.MessageExpiredVideoNote
import dev.g000sha256.tdl.dto.MessageExpiredVoiceNote
import dev.g000sha256.tdl.dto.MessageFileType
import dev.g000sha256.tdl.dto.MessageFileTypeGroup
import dev.g000sha256.tdl.dto.MessageFileTypePrivate
import dev.g000sha256.tdl.dto.MessageFileTypeUnknown
import dev.g000sha256.tdl.dto.MessageForumTopicCreated
import dev.g000sha256.tdl.dto.MessageForumTopicEdited
import dev.g000sha256.tdl.dto.MessageForumTopicIsClosedToggled
import dev.g000sha256.tdl.dto.MessageForumTopicIsHiddenToggled
import dev.g000sha256.tdl.dto.MessageGame
import dev.g000sha256.tdl.dto.MessageGameScore
import dev.g000sha256.tdl.dto.MessageGift
import dev.g000sha256.tdl.dto.MessageGiftedPremium
import dev.g000sha256.tdl.dto.MessageGiftedStars
import dev.g000sha256.tdl.dto.MessageGiftedTon
import dev.g000sha256.tdl.dto.MessageGiveaway
import dev.g000sha256.tdl.dto.MessageGiveawayCompleted
import dev.g000sha256.tdl.dto.MessageGiveawayCreated
import dev.g000sha256.tdl.dto.MessageGiveawayPrizeStars
import dev.g000sha256.tdl.dto.MessageGiveawayWinners
import dev.g000sha256.tdl.dto.MessageGroupCall
import dev.g000sha256.tdl.dto.MessageInviteVideoChatParticipants
import dev.g000sha256.tdl.dto.MessageInvoice
import dev.g000sha256.tdl.dto.MessageLiveLocation
import dev.g000sha256.tdl.dto.MessageLocation
import dev.g000sha256.tdl.dto.MessageManagedBotCreated
import dev.g000sha256.tdl.dto.MessageOrigin
import dev.g000sha256.tdl.dto.MessageOriginChannel
import dev.g000sha256.tdl.dto.MessageOriginChat
import dev.g000sha256.tdl.dto.MessageOriginHiddenUser
import dev.g000sha256.tdl.dto.MessageOriginUser
import dev.g000sha256.tdl.dto.MessagePaidMedia
import dev.g000sha256.tdl.dto.MessagePaidMessagePriceChanged
import dev.g000sha256.tdl.dto.MessagePaidMessagesRefunded
import dev.g000sha256.tdl.dto.MessagePassportDataReceived
import dev.g000sha256.tdl.dto.MessagePassportDataSent
import dev.g000sha256.tdl.dto.MessagePaymentRefunded
import dev.g000sha256.tdl.dto.MessagePaymentSuccessful
import dev.g000sha256.tdl.dto.MessagePaymentSuccessfulBot
import dev.g000sha256.tdl.dto.MessagePhoto
import dev.g000sha256.tdl.dto.MessagePinMessage
import dev.g000sha256.tdl.dto.MessagePoll
import dev.g000sha256.tdl.dto.MessagePollOptionAdded
import dev.g000sha256.tdl.dto.MessagePollOptionDeleted
import dev.g000sha256.tdl.dto.MessagePremiumGiftCode
import dev.g000sha256.tdl.dto.MessageProximityAlertTriggered
import dev.g000sha256.tdl.dto.MessageReadDate
import dev.g000sha256.tdl.dto.MessageReadDateMyPrivacyRestricted
import dev.g000sha256.tdl.dto.MessageReadDateRead
import dev.g000sha256.tdl.dto.MessageReadDateTooOld
import dev.g000sha256.tdl.dto.MessageReadDateUnread
import dev.g000sha256.tdl.dto.MessageReadDateUserPrivacyRestricted
import dev.g000sha256.tdl.dto.MessageRefundedUpgradedGift
import dev.g000sha256.tdl.dto.MessageReplyTo
import dev.g000sha256.tdl.dto.MessageReplyToMessage
import dev.g000sha256.tdl.dto.MessageReplyToStory
import dev.g000sha256.tdl.dto.MessageRichMessage
import dev.g000sha256.tdl.dto.MessageSchedulingState
import dev.g000sha256.tdl.dto.MessageSchedulingStateSendAtDate
import dev.g000sha256.tdl.dto.MessageSchedulingStateSendWhenOnline
import dev.g000sha256.tdl.dto.MessageSchedulingStateSendWhenVideoProcessed
import dev.g000sha256.tdl.dto.MessageScreenshotTaken
import dev.g000sha256.tdl.dto.MessageSelfDestructType
import dev.g000sha256.tdl.dto.MessageSelfDestructTypeImmediately
import dev.g000sha256.tdl.dto.MessageSelfDestructTypeTimer
import dev.g000sha256.tdl.dto.MessageSender
import dev.g000sha256.tdl.dto.MessageSenderChat
import dev.g000sha256.tdl.dto.MessageSenderUser
import dev.g000sha256.tdl.dto.MessageSendingState
import dev.g000sha256.tdl.dto.MessageSendingStateFailed
import dev.g000sha256.tdl.dto.MessageSendingStatePending
import dev.g000sha256.tdl.dto.MessageSource
import dev.g000sha256.tdl.dto.MessageSourceChatEventLog
import dev.g000sha256.tdl.dto.MessageSourceChatHistory
import dev.g000sha256.tdl.dto.MessageSourceChatList
import dev.g000sha256.tdl.dto.MessageSourceDirectMessagesChatTopicHistory
import dev.g000sha256.tdl.dto.MessageSourceForumTopicHistory
import dev.g000sha256.tdl.dto.MessageSourceHistoryPreview
import dev.g000sha256.tdl.dto.MessageSourceMessageThreadHistory
import dev.g000sha256.tdl.dto.MessageSourceNotification
import dev.g000sha256.tdl.dto.MessageSourceOther
import dev.g000sha256.tdl.dto.MessageSourceScreenshot
import dev.g000sha256.tdl.dto.MessageSourceSearch
import dev.g000sha256.tdl.dto.MessageStakeDice
import dev.g000sha256.tdl.dto.MessageSticker
import dev.g000sha256.tdl.dto.MessageStory
import dev.g000sha256.tdl.dto.MessageSuggestBirthdate
import dev.g000sha256.tdl.dto.MessageSuggestProfilePhoto
import dev.g000sha256.tdl.dto.MessageSuggestedPostApprovalFailed
import dev.g000sha256.tdl.dto.MessageSuggestedPostApproved
import dev.g000sha256.tdl.dto.MessageSuggestedPostDeclined
import dev.g000sha256.tdl.dto.MessageSuggestedPostPaid
import dev.g000sha256.tdl.dto.MessageSuggestedPostRefunded
import dev.g000sha256.tdl.dto.MessageSupergroupChatCreate
import dev.g000sha256.tdl.dto.MessageText
import dev.g000sha256.tdl.dto.MessageTopic
import dev.g000sha256.tdl.dto.MessageTopicDirectMessages
import dev.g000sha256.tdl.dto.MessageTopicForum
import dev.g000sha256.tdl.dto.MessageTopicSavedMessages
import dev.g000sha256.tdl.dto.MessageTopicThread
import dev.g000sha256.tdl.dto.MessageUnsupported
import dev.g000sha256.tdl.dto.MessageUpgradedGift
import dev.g000sha256.tdl.dto.MessageUpgradedGiftPurchaseOffer
import dev.g000sha256.tdl.dto.MessageUpgradedGiftPurchaseOfferRejected
import dev.g000sha256.tdl.dto.MessageUsersShared
import dev.g000sha256.tdl.dto.MessageVenue
import dev.g000sha256.tdl.dto.MessageVideo
import dev.g000sha256.tdl.dto.MessageVideoChatEnded
import dev.g000sha256.tdl.dto.MessageVideoChatScheduled
import dev.g000sha256.tdl.dto.MessageVideoChatStarted
import dev.g000sha256.tdl.dto.MessageVideoNote
import dev.g000sha256.tdl.dto.MessageVoiceNote
import dev.g000sha256.tdl.dto.MessageWebAppDataReceived
import dev.g000sha256.tdl.dto.MessageWebAppDataSent
import dev.g000sha256.tdl.dto.NetworkStatisticsEntry
import dev.g000sha256.tdl.dto.NetworkStatisticsEntryCall
import dev.g000sha256.tdl.dto.NetworkStatisticsEntryFile
import dev.g000sha256.tdl.dto.NetworkType
import dev.g000sha256.tdl.dto.NetworkTypeMobile
import dev.g000sha256.tdl.dto.NetworkTypeMobileRoaming
import dev.g000sha256.tdl.dto.NetworkTypeNone
import dev.g000sha256.tdl.dto.NetworkTypeOther
import dev.g000sha256.tdl.dto.NetworkTypeWiFi
import dev.g000sha256.tdl.dto.NotificationGroupType
import dev.g000sha256.tdl.dto.NotificationGroupTypeCalls
import dev.g000sha256.tdl.dto.NotificationGroupTypeMentions
import dev.g000sha256.tdl.dto.NotificationGroupTypeMessages
import dev.g000sha256.tdl.dto.NotificationGroupTypeSecretChat
import dev.g000sha256.tdl.dto.NotificationSettingsScope
import dev.g000sha256.tdl.dto.NotificationSettingsScopeChannelChats
import dev.g000sha256.tdl.dto.NotificationSettingsScopeGroupChats
import dev.g000sha256.tdl.dto.NotificationSettingsScopePrivateChats
import dev.g000sha256.tdl.dto.NotificationType
import dev.g000sha256.tdl.dto.NotificationTypeNewCall
import dev.g000sha256.tdl.dto.NotificationTypeNewMessage
import dev.g000sha256.tdl.dto.NotificationTypeNewPushMessage
import dev.g000sha256.tdl.dto.NotificationTypeNewSecretChat
import dev.g000sha256.tdl.dto.OptionValue
import dev.g000sha256.tdl.dto.OptionValueBoolean
import dev.g000sha256.tdl.dto.OptionValueEmpty
import dev.g000sha256.tdl.dto.OptionValueInteger
import dev.g000sha256.tdl.dto.OptionValueString
import dev.g000sha256.tdl.dto.PageBlock
import dev.g000sha256.tdl.dto.PageBlockAnchor
import dev.g000sha256.tdl.dto.PageBlockAnimation
import dev.g000sha256.tdl.dto.PageBlockAudio
import dev.g000sha256.tdl.dto.PageBlockAuthorDate
import dev.g000sha256.tdl.dto.PageBlockBlockQuote
import dev.g000sha256.tdl.dto.PageBlockChatLink
import dev.g000sha256.tdl.dto.PageBlockCollage
import dev.g000sha256.tdl.dto.PageBlockCover
import dev.g000sha256.tdl.dto.PageBlockDetails
import dev.g000sha256.tdl.dto.PageBlockDivider
import dev.g000sha256.tdl.dto.PageBlockEmbedded
import dev.g000sha256.tdl.dto.PageBlockEmbeddedPost
import dev.g000sha256.tdl.dto.PageBlockFooter
import dev.g000sha256.tdl.dto.PageBlockHeader
import dev.g000sha256.tdl.dto.PageBlockHorizontalAlignment
import dev.g000sha256.tdl.dto.PageBlockHorizontalAlignmentCenter
import dev.g000sha256.tdl.dto.PageBlockHorizontalAlignmentLeft
import dev.g000sha256.tdl.dto.PageBlockHorizontalAlignmentRight
import dev.g000sha256.tdl.dto.PageBlockKicker
import dev.g000sha256.tdl.dto.PageBlockList
import dev.g000sha256.tdl.dto.PageBlockMap
import dev.g000sha256.tdl.dto.PageBlockMathematicalExpression
import dev.g000sha256.tdl.dto.PageBlockParagraph
import dev.g000sha256.tdl.dto.PageBlockPhoto
import dev.g000sha256.tdl.dto.PageBlockPreformatted
import dev.g000sha256.tdl.dto.PageBlockPullQuote
import dev.g000sha256.tdl.dto.PageBlockRelatedArticles
import dev.g000sha256.tdl.dto.PageBlockSectionHeading
import dev.g000sha256.tdl.dto.PageBlockSlideshow
import dev.g000sha256.tdl.dto.PageBlockSubheader
import dev.g000sha256.tdl.dto.PageBlockSubtitle
import dev.g000sha256.tdl.dto.PageBlockTable
import dev.g000sha256.tdl.dto.PageBlockThinking
import dev.g000sha256.tdl.dto.PageBlockTitle
import dev.g000sha256.tdl.dto.PageBlockVerticalAlignment
import dev.g000sha256.tdl.dto.PageBlockVerticalAlignmentBottom
import dev.g000sha256.tdl.dto.PageBlockVerticalAlignmentMiddle
import dev.g000sha256.tdl.dto.PageBlockVerticalAlignmentTop
import dev.g000sha256.tdl.dto.PageBlockVideo
import dev.g000sha256.tdl.dto.PageBlockVoiceNote
import dev.g000sha256.tdl.dto.PaidMedia
import dev.g000sha256.tdl.dto.PaidMediaPhoto
import dev.g000sha256.tdl.dto.PaidMediaPreview
import dev.g000sha256.tdl.dto.PaidMediaUnsupported
import dev.g000sha256.tdl.dto.PaidMediaVideo
import dev.g000sha256.tdl.dto.PaidReactionType
import dev.g000sha256.tdl.dto.PaidReactionTypeAnonymous
import dev.g000sha256.tdl.dto.PaidReactionTypeChat
import dev.g000sha256.tdl.dto.PaidReactionTypeRegular
import dev.g000sha256.tdl.dto.PassportElement
import dev.g000sha256.tdl.dto.PassportElementAddress
import dev.g000sha256.tdl.dto.PassportElementBankStatement
import dev.g000sha256.tdl.dto.PassportElementDriverLicense
import dev.g000sha256.tdl.dto.PassportElementEmailAddress
import dev.g000sha256.tdl.dto.PassportElementErrorSource
import dev.g000sha256.tdl.dto.PassportElementErrorSourceDataField
import dev.g000sha256.tdl.dto.PassportElementErrorSourceFile
import dev.g000sha256.tdl.dto.PassportElementErrorSourceFiles
import dev.g000sha256.tdl.dto.PassportElementErrorSourceFrontSide
import dev.g000sha256.tdl.dto.PassportElementErrorSourceReverseSide
import dev.g000sha256.tdl.dto.PassportElementErrorSourceSelfie
import dev.g000sha256.tdl.dto.PassportElementErrorSourceTranslationFile
import dev.g000sha256.tdl.dto.PassportElementErrorSourceTranslationFiles
import dev.g000sha256.tdl.dto.PassportElementErrorSourceUnspecified
import dev.g000sha256.tdl.dto.PassportElementIdentityCard
import dev.g000sha256.tdl.dto.PassportElementInternalPassport
import dev.g000sha256.tdl.dto.PassportElementPassport
import dev.g000sha256.tdl.dto.PassportElementPassportRegistration
import dev.g000sha256.tdl.dto.PassportElementPersonalDetails
import dev.g000sha256.tdl.dto.PassportElementPhoneNumber
import dev.g000sha256.tdl.dto.PassportElementRentalAgreement
import dev.g000sha256.tdl.dto.PassportElementTemporaryRegistration
import dev.g000sha256.tdl.dto.PassportElementType
import dev.g000sha256.tdl.dto.PassportElementTypeAddress
import dev.g000sha256.tdl.dto.PassportElementTypeBankStatement
import dev.g000sha256.tdl.dto.PassportElementTypeDriverLicense
import dev.g000sha256.tdl.dto.PassportElementTypeEmailAddress
import dev.g000sha256.tdl.dto.PassportElementTypeIdentityCard
import dev.g000sha256.tdl.dto.PassportElementTypeInternalPassport
import dev.g000sha256.tdl.dto.PassportElementTypePassport
import dev.g000sha256.tdl.dto.PassportElementTypePassportRegistration
import dev.g000sha256.tdl.dto.PassportElementTypePersonalDetails
import dev.g000sha256.tdl.dto.PassportElementTypePhoneNumber
import dev.g000sha256.tdl.dto.PassportElementTypeRentalAgreement
import dev.g000sha256.tdl.dto.PassportElementTypeTemporaryRegistration
import dev.g000sha256.tdl.dto.PassportElementTypeUtilityBill
import dev.g000sha256.tdl.dto.PassportElementUtilityBill
import dev.g000sha256.tdl.dto.PaymentFormType
import dev.g000sha256.tdl.dto.PaymentFormTypeRegular
import dev.g000sha256.tdl.dto.PaymentFormTypeStarSubscription
import dev.g000sha256.tdl.dto.PaymentFormTypeStars
import dev.g000sha256.tdl.dto.PaymentProvider
import dev.g000sha256.tdl.dto.PaymentProviderOther
import dev.g000sha256.tdl.dto.PaymentProviderSmartGlocal
import dev.g000sha256.tdl.dto.PaymentProviderStripe
import dev.g000sha256.tdl.dto.PaymentReceiptType
import dev.g000sha256.tdl.dto.PaymentReceiptTypeRegular
import dev.g000sha256.tdl.dto.PaymentReceiptTypeStars
import dev.g000sha256.tdl.dto.PhoneNumberCodeType
import dev.g000sha256.tdl.dto.PhoneNumberCodeTypeChange
import dev.g000sha256.tdl.dto.PhoneNumberCodeTypeConfirmOwnership
import dev.g000sha256.tdl.dto.PhoneNumberCodeTypeVerify
import dev.g000sha256.tdl.dto.PollMedia
import dev.g000sha256.tdl.dto.PollMediaAnimation
import dev.g000sha256.tdl.dto.PollMediaAudio
import dev.g000sha256.tdl.dto.PollMediaDocument
import dev.g000sha256.tdl.dto.PollMediaLink
import dev.g000sha256.tdl.dto.PollMediaLocation
import dev.g000sha256.tdl.dto.PollMediaPhoto
import dev.g000sha256.tdl.dto.PollMediaSticker
import dev.g000sha256.tdl.dto.PollMediaVenue
import dev.g000sha256.tdl.dto.PollMediaVideo
import dev.g000sha256.tdl.dto.PollType
import dev.g000sha256.tdl.dto.PollTypeQuiz
import dev.g000sha256.tdl.dto.PollTypeRegular
import dev.g000sha256.tdl.dto.PollVoteRestrictionReason
import dev.g000sha256.tdl.dto.PollVoteRestrictionReasonClosed
import dev.g000sha256.tdl.dto.PollVoteRestrictionReasonCountryRestricted
import dev.g000sha256.tdl.dto.PollVoteRestrictionReasonMembershipRequired
import dev.g000sha256.tdl.dto.PollVoteRestrictionReasonOther
import dev.g000sha256.tdl.dto.PollVoteRestrictionReasonScheduled
import dev.g000sha256.tdl.dto.PollVoteRestrictionReasonYetUnsent
import dev.g000sha256.tdl.dto.PremiumFeature
import dev.g000sha256.tdl.dto.PremiumFeatureAccentColor
import dev.g000sha256.tdl.dto.PremiumFeatureAdvancedChatManagement
import dev.g000sha256.tdl.dto.PremiumFeatureAnimatedProfilePhoto
import dev.g000sha256.tdl.dto.PremiumFeatureAppIcons
import dev.g000sha256.tdl.dto.PremiumFeatureBackgroundForBoth
import dev.g000sha256.tdl.dto.PremiumFeatureBusiness
import dev.g000sha256.tdl.dto.PremiumFeatureChatBoost
import dev.g000sha256.tdl.dto.PremiumFeatureChecklists
import dev.g000sha256.tdl.dto.PremiumFeatureCustomEmoji
import dev.g000sha256.tdl.dto.PremiumFeatureDisabledAds
import dev.g000sha256.tdl.dto.PremiumFeatureEmojiStatus
import dev.g000sha256.tdl.dto.PremiumFeatureForumTopicIcon
import dev.g000sha256.tdl.dto.PremiumFeatureImprovedDownloadSpeed
import dev.g000sha256.tdl.dto.PremiumFeatureIncreasedLimits
import dev.g000sha256.tdl.dto.PremiumFeatureIncreasedUploadFileSize
import dev.g000sha256.tdl.dto.PremiumFeatureLastSeenTimes
import dev.g000sha256.tdl.dto.PremiumFeatureMessageEffects
import dev.g000sha256.tdl.dto.PremiumFeatureMessagePrivacy
import dev.g000sha256.tdl.dto.PremiumFeaturePaidMessages
import dev.g000sha256.tdl.dto.PremiumFeatureProfileBadge
import dev.g000sha256.tdl.dto.PremiumFeatureProtectPrivateChatContent
import dev.g000sha256.tdl.dto.PremiumFeatureRealTimeChatTranslation
import dev.g000sha256.tdl.dto.PremiumFeatureRichMessages
import dev.g000sha256.tdl.dto.PremiumFeatureSavedMessagesTags
import dev.g000sha256.tdl.dto.PremiumFeatureTextComposition
import dev.g000sha256.tdl.dto.PremiumFeatureUniqueReactions
import dev.g000sha256.tdl.dto.PremiumFeatureUniqueStickers
import dev.g000sha256.tdl.dto.PremiumFeatureUpgradedStories
import dev.g000sha256.tdl.dto.PremiumFeatureVoiceRecognition
import dev.g000sha256.tdl.dto.PremiumLimitType
import dev.g000sha256.tdl.dto.PremiumLimitTypeActiveStoryCount
import dev.g000sha256.tdl.dto.PremiumLimitTypeBioLength
import dev.g000sha256.tdl.dto.PremiumLimitTypeCaptionLength
import dev.g000sha256.tdl.dto.PremiumLimitTypeChatFolderChosenChatCount
import dev.g000sha256.tdl.dto.PremiumLimitTypeChatFolderCount
import dev.g000sha256.tdl.dto.PremiumLimitTypeChatFolderInviteLinkCount
import dev.g000sha256.tdl.dto.PremiumLimitTypeCreatedPublicChatCount
import dev.g000sha256.tdl.dto.PremiumLimitTypeCustomTextCompositionStyleCount
import dev.g000sha256.tdl.dto.PremiumLimitTypeFavoriteStickerCount
import dev.g000sha256.tdl.dto.PremiumLimitTypeMessageTextLength
import dev.g000sha256.tdl.dto.PremiumLimitTypeMonthlyPostedStoryCount
import dev.g000sha256.tdl.dto.PremiumLimitTypeOwnedBotCount
import dev.g000sha256.tdl.dto.PremiumLimitTypePinnedArchivedChatCount
import dev.g000sha256.tdl.dto.PremiumLimitTypePinnedChatCount
import dev.g000sha256.tdl.dto.PremiumLimitTypePinnedSavedMessagesTopicCount
import dev.g000sha256.tdl.dto.PremiumLimitTypeSavedAnimationCount
import dev.g000sha256.tdl.dto.PremiumLimitTypeShareableChatFolderCount
import dev.g000sha256.tdl.dto.PremiumLimitTypeSimilarChatCount
import dev.g000sha256.tdl.dto.PremiumLimitTypeStoryCaptionLength
import dev.g000sha256.tdl.dto.PremiumLimitTypeStorySuggestedReactionAreaCount
import dev.g000sha256.tdl.dto.PremiumLimitTypeSupergroupCount
import dev.g000sha256.tdl.dto.PremiumLimitTypeWeeklyPostedStoryCount
import dev.g000sha256.tdl.dto.PremiumSource
import dev.g000sha256.tdl.dto.PremiumSourceBusinessFeature
import dev.g000sha256.tdl.dto.PremiumSourceFeature
import dev.g000sha256.tdl.dto.PremiumSourceLimitExceeded
import dev.g000sha256.tdl.dto.PremiumSourceLink
import dev.g000sha256.tdl.dto.PremiumSourceSettings
import dev.g000sha256.tdl.dto.PremiumSourceStoryFeature
import dev.g000sha256.tdl.dto.PremiumStoryFeature
import dev.g000sha256.tdl.dto.PremiumStoryFeatureCustomExpirationDuration
import dev.g000sha256.tdl.dto.PremiumStoryFeatureLinksAndFormatting
import dev.g000sha256.tdl.dto.PremiumStoryFeaturePermanentViewsHistory
import dev.g000sha256.tdl.dto.PremiumStoryFeaturePriorityOrder
import dev.g000sha256.tdl.dto.PremiumStoryFeatureSaveStories
import dev.g000sha256.tdl.dto.PremiumStoryFeatureStealthMode
import dev.g000sha256.tdl.dto.PremiumStoryFeatureVideoQuality
import dev.g000sha256.tdl.dto.ProfileTab
import dev.g000sha256.tdl.dto.ProfileTabFiles
import dev.g000sha256.tdl.dto.ProfileTabGifs
import dev.g000sha256.tdl.dto.ProfileTabGifts
import dev.g000sha256.tdl.dto.ProfileTabLinks
import dev.g000sha256.tdl.dto.ProfileTabMedia
import dev.g000sha256.tdl.dto.ProfileTabMusic
import dev.g000sha256.tdl.dto.ProfileTabPosts
import dev.g000sha256.tdl.dto.ProfileTabVoice
import dev.g000sha256.tdl.dto.ProxyType
import dev.g000sha256.tdl.dto.ProxyTypeHttp
import dev.g000sha256.tdl.dto.ProxyTypeMtproto
import dev.g000sha256.tdl.dto.ProxyTypeSocks5
import dev.g000sha256.tdl.dto.PublicChatType
import dev.g000sha256.tdl.dto.PublicChatTypeHasUsername
import dev.g000sha256.tdl.dto.PublicChatTypeIsLocationBased
import dev.g000sha256.tdl.dto.PublicForward
import dev.g000sha256.tdl.dto.PublicForwardMessage
import dev.g000sha256.tdl.dto.PublicForwardStory
import dev.g000sha256.tdl.dto.PushMessageContent
import dev.g000sha256.tdl.dto.PushMessageContentAnimation
import dev.g000sha256.tdl.dto.PushMessageContentAudio
import dev.g000sha256.tdl.dto.PushMessageContentBasicGroupChatCreate
import dev.g000sha256.tdl.dto.PushMessageContentChatAddMembers
import dev.g000sha256.tdl.dto.PushMessageContentChatChangePhoto
import dev.g000sha256.tdl.dto.PushMessageContentChatChangeTitle
import dev.g000sha256.tdl.dto.PushMessageContentChatDeleteMember
import dev.g000sha256.tdl.dto.PushMessageContentChatJoinByLink
import dev.g000sha256.tdl.dto.PushMessageContentChatJoinByRequest
import dev.g000sha256.tdl.dto.PushMessageContentChatSetBackground
import dev.g000sha256.tdl.dto.PushMessageContentChatSetTheme
import dev.g000sha256.tdl.dto.PushMessageContentChecklist
import dev.g000sha256.tdl.dto.PushMessageContentChecklistTasksAdded
import dev.g000sha256.tdl.dto.PushMessageContentChecklistTasksDone
import dev.g000sha256.tdl.dto.PushMessageContentContact
import dev.g000sha256.tdl.dto.PushMessageContentContactRegistered
import dev.g000sha256.tdl.dto.PushMessageContentDocument
import dev.g000sha256.tdl.dto.PushMessageContentGame
import dev.g000sha256.tdl.dto.PushMessageContentGameScore
import dev.g000sha256.tdl.dto.PushMessageContentGift
import dev.g000sha256.tdl.dto.PushMessageContentGiveaway
import dev.g000sha256.tdl.dto.PushMessageContentHidden
import dev.g000sha256.tdl.dto.PushMessageContentInviteVideoChatParticipants
import dev.g000sha256.tdl.dto.PushMessageContentInvoice
import dev.g000sha256.tdl.dto.PushMessageContentLocation
import dev.g000sha256.tdl.dto.PushMessageContentMediaAlbum
import dev.g000sha256.tdl.dto.PushMessageContentMessageForwards
import dev.g000sha256.tdl.dto.PushMessageContentPaidMedia
import dev.g000sha256.tdl.dto.PushMessageContentPhoto
import dev.g000sha256.tdl.dto.PushMessageContentPoll
import dev.g000sha256.tdl.dto.PushMessageContentPollOptionAdded
import dev.g000sha256.tdl.dto.PushMessageContentPremiumGiftCode
import dev.g000sha256.tdl.dto.PushMessageContentProximityAlertTriggered
import dev.g000sha256.tdl.dto.PushMessageContentRecurringPayment
import dev.g000sha256.tdl.dto.PushMessageContentScreenshotTaken
import dev.g000sha256.tdl.dto.PushMessageContentSticker
import dev.g000sha256.tdl.dto.PushMessageContentStory
import dev.g000sha256.tdl.dto.PushMessageContentSuggestBirthdate
import dev.g000sha256.tdl.dto.PushMessageContentSuggestProfilePhoto
import dev.g000sha256.tdl.dto.PushMessageContentText
import dev.g000sha256.tdl.dto.PushMessageContentUpgradedGift
import dev.g000sha256.tdl.dto.PushMessageContentVideo
import dev.g000sha256.tdl.dto.PushMessageContentVideoChatEnded
import dev.g000sha256.tdl.dto.PushMessageContentVideoChatStarted
import dev.g000sha256.tdl.dto.PushMessageContentVideoNote
import dev.g000sha256.tdl.dto.PushMessageContentVoiceNote
import dev.g000sha256.tdl.dto.ReactionNotificationSource
import dev.g000sha256.tdl.dto.ReactionNotificationSourceAll
import dev.g000sha256.tdl.dto.ReactionNotificationSourceContacts
import dev.g000sha256.tdl.dto.ReactionNotificationSourceNone
import dev.g000sha256.tdl.dto.ReactionType
import dev.g000sha256.tdl.dto.ReactionTypeCustomEmoji
import dev.g000sha256.tdl.dto.ReactionTypeEmoji
import dev.g000sha256.tdl.dto.ReactionTypePaid
import dev.g000sha256.tdl.dto.ReactionUnavailabilityReason
import dev.g000sha256.tdl.dto.ReactionUnavailabilityReasonAnonymousAdministrator
import dev.g000sha256.tdl.dto.ReactionUnavailabilityReasonGuest
import dev.g000sha256.tdl.dto.ReactionUnavailabilityReasonRestricted
import dev.g000sha256.tdl.dto.ReplyMarkup
import dev.g000sha256.tdl.dto.ReplyMarkupForceReply
import dev.g000sha256.tdl.dto.ReplyMarkupInlineKeyboard
import dev.g000sha256.tdl.dto.ReplyMarkupRemoveKeyboard
import dev.g000sha256.tdl.dto.ReplyMarkupShowKeyboard
import dev.g000sha256.tdl.dto.ReportChatResult
import dev.g000sha256.tdl.dto.ReportChatResultMessagesRequired
import dev.g000sha256.tdl.dto.ReportChatResultOk
import dev.g000sha256.tdl.dto.ReportChatResultOptionRequired
import dev.g000sha256.tdl.dto.ReportChatResultTextRequired
import dev.g000sha256.tdl.dto.ReportReason
import dev.g000sha256.tdl.dto.ReportReasonChildAbuse
import dev.g000sha256.tdl.dto.ReportReasonCopyright
import dev.g000sha256.tdl.dto.ReportReasonCustom
import dev.g000sha256.tdl.dto.ReportReasonFake
import dev.g000sha256.tdl.dto.ReportReasonIllegalDrugs
import dev.g000sha256.tdl.dto.ReportReasonPersonalDetails
import dev.g000sha256.tdl.dto.ReportReasonPornography
import dev.g000sha256.tdl.dto.ReportReasonSpam
import dev.g000sha256.tdl.dto.ReportReasonUnrelatedLocation
import dev.g000sha256.tdl.dto.ReportReasonViolence
import dev.g000sha256.tdl.dto.ReportSponsoredResult
import dev.g000sha256.tdl.dto.ReportSponsoredResultAdsHidden
import dev.g000sha256.tdl.dto.ReportSponsoredResultFailed
import dev.g000sha256.tdl.dto.ReportSponsoredResultOk
import dev.g000sha256.tdl.dto.ReportSponsoredResultOptionRequired
import dev.g000sha256.tdl.dto.ReportSponsoredResultPremiumRequired
import dev.g000sha256.tdl.dto.ReportStoryResult
import dev.g000sha256.tdl.dto.ReportStoryResultOk
import dev.g000sha256.tdl.dto.ReportStoryResultOptionRequired
import dev.g000sha256.tdl.dto.ReportStoryResultTextRequired
import dev.g000sha256.tdl.dto.ResendCodeReason
import dev.g000sha256.tdl.dto.ResendCodeReasonUserRequest
import dev.g000sha256.tdl.dto.ResendCodeReasonVerificationFailed
import dev.g000sha256.tdl.dto.ResetPasswordResult
import dev.g000sha256.tdl.dto.ResetPasswordResultDeclined
import dev.g000sha256.tdl.dto.ResetPasswordResultOk
import dev.g000sha256.tdl.dto.ResetPasswordResultPending
import dev.g000sha256.tdl.dto.RevenueWithdrawalState
import dev.g000sha256.tdl.dto.RevenueWithdrawalStateFailed
import dev.g000sha256.tdl.dto.RevenueWithdrawalStatePending
import dev.g000sha256.tdl.dto.RevenueWithdrawalStateSucceeded
import dev.g000sha256.tdl.dto.RichMessageSource
import dev.g000sha256.tdl.dto.RichMessageSourceBlocks
import dev.g000sha256.tdl.dto.RichMessageSourceHtml
import dev.g000sha256.tdl.dto.RichMessageSourceMarkdown
import dev.g000sha256.tdl.dto.RichText
import dev.g000sha256.tdl.dto.RichTextAnchor
import dev.g000sha256.tdl.dto.RichTextAnchorLink
import dev.g000sha256.tdl.dto.RichTextBankCardNumber
import dev.g000sha256.tdl.dto.RichTextBold
import dev.g000sha256.tdl.dto.RichTextBotCommand
import dev.g000sha256.tdl.dto.RichTextCashtag
import dev.g000sha256.tdl.dto.RichTextCustomEmoji
import dev.g000sha256.tdl.dto.RichTextDateTime
import dev.g000sha256.tdl.dto.RichTextDiff
import dev.g000sha256.tdl.dto.RichTextEmailAddress
import dev.g000sha256.tdl.dto.RichTextFixed
import dev.g000sha256.tdl.dto.RichTextHashtag
import dev.g000sha256.tdl.dto.RichTextIcon
import dev.g000sha256.tdl.dto.RichTextItalic
import dev.g000sha256.tdl.dto.RichTextMarked
import dev.g000sha256.tdl.dto.RichTextMathematicalExpression
import dev.g000sha256.tdl.dto.RichTextMention
import dev.g000sha256.tdl.dto.RichTextMentionName
import dev.g000sha256.tdl.dto.RichTextPhoneNumber
import dev.g000sha256.tdl.dto.RichTextPlain
import dev.g000sha256.tdl.dto.RichTextReference
import dev.g000sha256.tdl.dto.RichTextReferenceLink
import dev.g000sha256.tdl.dto.RichTextSpoiler
import dev.g000sha256.tdl.dto.RichTextStrikethrough
import dev.g000sha256.tdl.dto.RichTextSubscript
import dev.g000sha256.tdl.dto.RichTextSuperscript
import dev.g000sha256.tdl.dto.RichTextUnderline
import dev.g000sha256.tdl.dto.RichTextUrl
import dev.g000sha256.tdl.dto.RichTexts
import dev.g000sha256.tdl.dto.SavedMessagesTopicType
import dev.g000sha256.tdl.dto.SavedMessagesTopicTypeAuthorHidden
import dev.g000sha256.tdl.dto.SavedMessagesTopicTypeMyNotes
import dev.g000sha256.tdl.dto.SavedMessagesTopicTypeSavedFromChat
import dev.g000sha256.tdl.dto.SearchChatTypeFilter
import dev.g000sha256.tdl.dto.SearchChatTypeFilterBot
import dev.g000sha256.tdl.dto.SearchChatTypeFilterChannel
import dev.g000sha256.tdl.dto.SearchMessagesChatTypeFilter
import dev.g000sha256.tdl.dto.SearchMessagesChatTypeFilterChannel
import dev.g000sha256.tdl.dto.SearchMessagesChatTypeFilterGroup
import dev.g000sha256.tdl.dto.SearchMessagesChatTypeFilterPrivate
import dev.g000sha256.tdl.dto.SearchMessagesFilter
import dev.g000sha256.tdl.dto.SearchMessagesFilterAnimation
import dev.g000sha256.tdl.dto.SearchMessagesFilterAudio
import dev.g000sha256.tdl.dto.SearchMessagesFilterChatPhoto
import dev.g000sha256.tdl.dto.SearchMessagesFilterDocument
import dev.g000sha256.tdl.dto.SearchMessagesFilterEmpty
import dev.g000sha256.tdl.dto.SearchMessagesFilterFailedToSend
import dev.g000sha256.tdl.dto.SearchMessagesFilterMention
import dev.g000sha256.tdl.dto.SearchMessagesFilterPhoto
import dev.g000sha256.tdl.dto.SearchMessagesFilterPhotoAndVideo
import dev.g000sha256.tdl.dto.SearchMessagesFilterPinned
import dev.g000sha256.tdl.dto.SearchMessagesFilterPoll
import dev.g000sha256.tdl.dto.SearchMessagesFilterUnreadMention
import dev.g000sha256.tdl.dto.SearchMessagesFilterUnreadPollVote
import dev.g000sha256.tdl.dto.SearchMessagesFilterUnreadReaction
import dev.g000sha256.tdl.dto.SearchMessagesFilterUrl
import dev.g000sha256.tdl.dto.SearchMessagesFilterVideo
import dev.g000sha256.tdl.dto.SearchMessagesFilterVideoNote
import dev.g000sha256.tdl.dto.SearchMessagesFilterVoiceAndVideoNote
import dev.g000sha256.tdl.dto.SearchMessagesFilterVoiceNote
import dev.g000sha256.tdl.dto.SecretChatState
import dev.g000sha256.tdl.dto.SecretChatStateClosed
import dev.g000sha256.tdl.dto.SecretChatStatePending
import dev.g000sha256.tdl.dto.SecretChatStateReady
import dev.g000sha256.tdl.dto.SentGift
import dev.g000sha256.tdl.dto.SentGiftRegular
import dev.g000sha256.tdl.dto.SentGiftUpgraded
import dev.g000sha256.tdl.dto.SessionDeviceType
import dev.g000sha256.tdl.dto.SessionDeviceTypeAndroid
import dev.g000sha256.tdl.dto.SessionDeviceTypeApple
import dev.g000sha256.tdl.dto.SessionDeviceTypeBrave
import dev.g000sha256.tdl.dto.SessionDeviceTypeChrome
import dev.g000sha256.tdl.dto.SessionDeviceTypeEdge
import dev.g000sha256.tdl.dto.SessionDeviceTypeFirefox
import dev.g000sha256.tdl.dto.SessionDeviceTypeIpad
import dev.g000sha256.tdl.dto.SessionDeviceTypeIphone
import dev.g000sha256.tdl.dto.SessionDeviceTypeLinux
import dev.g000sha256.tdl.dto.SessionDeviceTypeMac
import dev.g000sha256.tdl.dto.SessionDeviceTypeOpera
import dev.g000sha256.tdl.dto.SessionDeviceTypeSafari
import dev.g000sha256.tdl.dto.SessionDeviceTypeUbuntu
import dev.g000sha256.tdl.dto.SessionDeviceTypeUnknown
import dev.g000sha256.tdl.dto.SessionDeviceTypeVivaldi
import dev.g000sha256.tdl.dto.SessionDeviceTypeWindows
import dev.g000sha256.tdl.dto.SessionDeviceTypeXbox
import dev.g000sha256.tdl.dto.SessionType
import dev.g000sha256.tdl.dto.SessionTypeConnectedBot
import dev.g000sha256.tdl.dto.SessionTypeDevice
import dev.g000sha256.tdl.dto.SettingsSection
import dev.g000sha256.tdl.dto.SettingsSectionAppearance
import dev.g000sha256.tdl.dto.SettingsSectionAskQuestion
import dev.g000sha256.tdl.dto.SettingsSectionBusiness
import dev.g000sha256.tdl.dto.SettingsSectionChatFolders
import dev.g000sha256.tdl.dto.SettingsSectionDataAndStorage
import dev.g000sha256.tdl.dto.SettingsSectionDevices
import dev.g000sha256.tdl.dto.SettingsSectionEditProfile
import dev.g000sha256.tdl.dto.SettingsSectionFaq
import dev.g000sha256.tdl.dto.SettingsSectionFeatures
import dev.g000sha256.tdl.dto.SettingsSectionInAppBrowser
import dev.g000sha256.tdl.dto.SettingsSectionLanguage
import dev.g000sha256.tdl.dto.SettingsSectionMyGrams
import dev.g000sha256.tdl.dto.SettingsSectionMyStars
import dev.g000sha256.tdl.dto.SettingsSectionNotifications
import dev.g000sha256.tdl.dto.SettingsSectionPowerSaving
import dev.g000sha256.tdl.dto.SettingsSectionPremium
import dev.g000sha256.tdl.dto.SettingsSectionPrivacyAndSecurity
import dev.g000sha256.tdl.dto.SettingsSectionPrivacyPolicy
import dev.g000sha256.tdl.dto.SettingsSectionQrCode
import dev.g000sha256.tdl.dto.SettingsSectionSearch
import dev.g000sha256.tdl.dto.SettingsSectionSendGift
import dev.g000sha256.tdl.dto.SpeechRecognitionResult
import dev.g000sha256.tdl.dto.SpeechRecognitionResultError
import dev.g000sha256.tdl.dto.SpeechRecognitionResultPending
import dev.g000sha256.tdl.dto.SpeechRecognitionResultText
import dev.g000sha256.tdl.dto.StarSubscriptionType
import dev.g000sha256.tdl.dto.StarSubscriptionTypeBot
import dev.g000sha256.tdl.dto.StarSubscriptionTypeChannel
import dev.g000sha256.tdl.dto.StarTransactionType
import dev.g000sha256.tdl.dto.StarTransactionTypeAffiliateProgramCommission
import dev.g000sha256.tdl.dto.StarTransactionTypeAppStoreDeposit
import dev.g000sha256.tdl.dto.StarTransactionTypeBotInvoicePurchase
import dev.g000sha256.tdl.dto.StarTransactionTypeBotInvoiceSale
import dev.g000sha256.tdl.dto.StarTransactionTypeBotPaidMediaPurchase
import dev.g000sha256.tdl.dto.StarTransactionTypeBotPaidMediaSale
import dev.g000sha256.tdl.dto.StarTransactionTypeBotSubscriptionPurchase
import dev.g000sha256.tdl.dto.StarTransactionTypeBotSubscriptionSale
import dev.g000sha256.tdl.dto.StarTransactionTypeBusinessBotTransferReceive
import dev.g000sha256.tdl.dto.StarTransactionTypeBusinessBotTransferSend
import dev.g000sha256.tdl.dto.StarTransactionTypeChannelPaidMediaPurchase
import dev.g000sha256.tdl.dto.StarTransactionTypeChannelPaidMediaSale
import dev.g000sha256.tdl.dto.StarTransactionTypeChannelPaidReactionReceive
import dev.g000sha256.tdl.dto.StarTransactionTypeChannelPaidReactionSend
import dev.g000sha256.tdl.dto.StarTransactionTypeChannelSubscriptionPurchase
import dev.g000sha256.tdl.dto.StarTransactionTypeChannelSubscriptionSale
import dev.g000sha256.tdl.dto.StarTransactionTypeFragmentDeposit
import dev.g000sha256.tdl.dto.StarTransactionTypeFragmentWithdrawal
import dev.g000sha256.tdl.dto.StarTransactionTypeGiftAuctionBid
import dev.g000sha256.tdl.dto.StarTransactionTypeGiftOriginalDetailsDrop
import dev.g000sha256.tdl.dto.StarTransactionTypeGiftPurchase
import dev.g000sha256.tdl.dto.StarTransactionTypeGiftPurchaseOffer
import dev.g000sha256.tdl.dto.StarTransactionTypeGiftSale
import dev.g000sha256.tdl.dto.StarTransactionTypeGiftTransfer
import dev.g000sha256.tdl.dto.StarTransactionTypeGiftUpgrade
import dev.g000sha256.tdl.dto.StarTransactionTypeGiftUpgradePurchase
import dev.g000sha256.tdl.dto.StarTransactionTypeGiveawayDeposit
import dev.g000sha256.tdl.dto.StarTransactionTypeGooglePlayDeposit
import dev.g000sha256.tdl.dto.StarTransactionTypePaidGroupCallMessageReceive
import dev.g000sha256.tdl.dto.StarTransactionTypePaidGroupCallMessageSend
import dev.g000sha256.tdl.dto.StarTransactionTypePaidGroupCallReactionReceive
import dev.g000sha256.tdl.dto.StarTransactionTypePaidGroupCallReactionSend
import dev.g000sha256.tdl.dto.StarTransactionTypePaidMessageReceive
import dev.g000sha256.tdl.dto.StarTransactionTypePaidMessageSend
import dev.g000sha256.tdl.dto.StarTransactionTypePremiumBotDeposit
import dev.g000sha256.tdl.dto.StarTransactionTypePremiumPurchase
import dev.g000sha256.tdl.dto.StarTransactionTypePublicPostSearch
import dev.g000sha256.tdl.dto.StarTransactionTypeSuggestedPostPaymentReceive
import dev.g000sha256.tdl.dto.StarTransactionTypeSuggestedPostPaymentSend
import dev.g000sha256.tdl.dto.StarTransactionTypeTelegramAdsWithdrawal
import dev.g000sha256.tdl.dto.StarTransactionTypeTelegramApiUsage
import dev.g000sha256.tdl.dto.StarTransactionTypeUnsupported
import dev.g000sha256.tdl.dto.StarTransactionTypeUpgradedGiftPurchase
import dev.g000sha256.tdl.dto.StarTransactionTypeUpgradedGiftSale
import dev.g000sha256.tdl.dto.StarTransactionTypeUserDeposit
import dev.g000sha256.tdl.dto.StartLiveStoryResult
import dev.g000sha256.tdl.dto.StartLiveStoryResultFail
import dev.g000sha256.tdl.dto.StartLiveStoryResultOk
import dev.g000sha256.tdl.dto.StatisticalGraph
import dev.g000sha256.tdl.dto.StatisticalGraphAsync
import dev.g000sha256.tdl.dto.StatisticalGraphData
import dev.g000sha256.tdl.dto.StatisticalGraphError
import dev.g000sha256.tdl.dto.StickerFormat
import dev.g000sha256.tdl.dto.StickerFormatTgs
import dev.g000sha256.tdl.dto.StickerFormatWebm
import dev.g000sha256.tdl.dto.StickerFormatWebp
import dev.g000sha256.tdl.dto.StickerFullType
import dev.g000sha256.tdl.dto.StickerFullTypeCustomEmoji
import dev.g000sha256.tdl.dto.StickerFullTypeMask
import dev.g000sha256.tdl.dto.StickerFullTypeRegular
import dev.g000sha256.tdl.dto.StickerType
import dev.g000sha256.tdl.dto.StickerTypeCustomEmoji
import dev.g000sha256.tdl.dto.StickerTypeMask
import dev.g000sha256.tdl.dto.StickerTypeRegular
import dev.g000sha256.tdl.dto.StorePaymentPurpose
import dev.g000sha256.tdl.dto.StorePaymentPurposeGiftedStars
import dev.g000sha256.tdl.dto.StorePaymentPurposePremiumGift
import dev.g000sha256.tdl.dto.StorePaymentPurposePremiumGiftCodes
import dev.g000sha256.tdl.dto.StorePaymentPurposePremiumGiveaway
import dev.g000sha256.tdl.dto.StorePaymentPurposePremiumSubscription
import dev.g000sha256.tdl.dto.StorePaymentPurposeStarGiveaway
import dev.g000sha256.tdl.dto.StorePaymentPurposeStars
import dev.g000sha256.tdl.dto.StoreTransaction
import dev.g000sha256.tdl.dto.StoreTransactionAppStore
import dev.g000sha256.tdl.dto.StoreTransactionGooglePlay
import dev.g000sha256.tdl.dto.StoryAreaType
import dev.g000sha256.tdl.dto.StoryAreaTypeLink
import dev.g000sha256.tdl.dto.StoryAreaTypeLocation
import dev.g000sha256.tdl.dto.StoryAreaTypeMessage
import dev.g000sha256.tdl.dto.StoryAreaTypeSuggestedReaction
import dev.g000sha256.tdl.dto.StoryAreaTypeUpgradedGift
import dev.g000sha256.tdl.dto.StoryAreaTypeVenue
import dev.g000sha256.tdl.dto.StoryAreaTypeWeather
import dev.g000sha256.tdl.dto.StoryContent
import dev.g000sha256.tdl.dto.StoryContentLive
import dev.g000sha256.tdl.dto.StoryContentPhoto
import dev.g000sha256.tdl.dto.StoryContentType
import dev.g000sha256.tdl.dto.StoryContentTypeLive
import dev.g000sha256.tdl.dto.StoryContentTypePhoto
import dev.g000sha256.tdl.dto.StoryContentTypeUnsupported
import dev.g000sha256.tdl.dto.StoryContentTypeVideo
import dev.g000sha256.tdl.dto.StoryContentUnsupported
import dev.g000sha256.tdl.dto.StoryContentVideo
import dev.g000sha256.tdl.dto.StoryInteractionType
import dev.g000sha256.tdl.dto.StoryInteractionTypeForward
import dev.g000sha256.tdl.dto.StoryInteractionTypeRepost
import dev.g000sha256.tdl.dto.StoryInteractionTypeView
import dev.g000sha256.tdl.dto.StoryList
import dev.g000sha256.tdl.dto.StoryListArchive
import dev.g000sha256.tdl.dto.StoryListMain
import dev.g000sha256.tdl.dto.StoryOrigin
import dev.g000sha256.tdl.dto.StoryOriginHiddenUser
import dev.g000sha256.tdl.dto.StoryOriginPublicStory
import dev.g000sha256.tdl.dto.StoryPrivacySettings
import dev.g000sha256.tdl.dto.StoryPrivacySettingsCloseFriends
import dev.g000sha256.tdl.dto.StoryPrivacySettingsContacts
import dev.g000sha256.tdl.dto.StoryPrivacySettingsEveryone
import dev.g000sha256.tdl.dto.StoryPrivacySettingsSelectedUsers
import dev.g000sha256.tdl.dto.SuggestedAction
import dev.g000sha256.tdl.dto.SuggestedActionAddLoginPasskey
import dev.g000sha256.tdl.dto.SuggestedActionCheckPassword
import dev.g000sha256.tdl.dto.SuggestedActionCheckPhoneNumber
import dev.g000sha256.tdl.dto.SuggestedActionConvertToBroadcastGroup
import dev.g000sha256.tdl.dto.SuggestedActionCustom
import dev.g000sha256.tdl.dto.SuggestedActionEnableArchiveAndMuteNewChats
import dev.g000sha256.tdl.dto.SuggestedActionExtendPremium
import dev.g000sha256.tdl.dto.SuggestedActionExtendStarSubscriptions
import dev.g000sha256.tdl.dto.SuggestedActionGiftPremiumForChristmas
import dev.g000sha256.tdl.dto.SuggestedActionRestorePremium
import dev.g000sha256.tdl.dto.SuggestedActionSetBirthdate
import dev.g000sha256.tdl.dto.SuggestedActionSetLoginEmailAddress
import dev.g000sha256.tdl.dto.SuggestedActionSetPassword
import dev.g000sha256.tdl.dto.SuggestedActionSetProfilePhoto
import dev.g000sha256.tdl.dto.SuggestedActionSubscribeToAnnualPremium
import dev.g000sha256.tdl.dto.SuggestedActionUpgradePremium
import dev.g000sha256.tdl.dto.SuggestedActionViewChecksHint
import dev.g000sha256.tdl.dto.SuggestedPostPrice
import dev.g000sha256.tdl.dto.SuggestedPostPriceGram
import dev.g000sha256.tdl.dto.SuggestedPostPriceStar
import dev.g000sha256.tdl.dto.SuggestedPostRefundReason
import dev.g000sha256.tdl.dto.SuggestedPostRefundReasonPaymentRefunded
import dev.g000sha256.tdl.dto.SuggestedPostRefundReasonPostDeleted
import dev.g000sha256.tdl.dto.SuggestedPostState
import dev.g000sha256.tdl.dto.SuggestedPostStateApproved
import dev.g000sha256.tdl.dto.SuggestedPostStateDeclined
import dev.g000sha256.tdl.dto.SuggestedPostStatePending
import dev.g000sha256.tdl.dto.SupergroupMembersFilter
import dev.g000sha256.tdl.dto.SupergroupMembersFilterAdministrators
import dev.g000sha256.tdl.dto.SupergroupMembersFilterBanned
import dev.g000sha256.tdl.dto.SupergroupMembersFilterBots
import dev.g000sha256.tdl.dto.SupergroupMembersFilterContacts
import dev.g000sha256.tdl.dto.SupergroupMembersFilterMention
import dev.g000sha256.tdl.dto.SupergroupMembersFilterRecent
import dev.g000sha256.tdl.dto.SupergroupMembersFilterRestricted
import dev.g000sha256.tdl.dto.SupergroupMembersFilterSearch
import dev.g000sha256.tdl.dto.TMeUrlType
import dev.g000sha256.tdl.dto.TMeUrlTypeChatInvite
import dev.g000sha256.tdl.dto.TMeUrlTypeStickerSet
import dev.g000sha256.tdl.dto.TMeUrlTypeSupergroup
import dev.g000sha256.tdl.dto.TMeUrlTypeUser
import dev.g000sha256.tdl.dto.TargetChat
import dev.g000sha256.tdl.dto.TargetChatChosen
import dev.g000sha256.tdl.dto.TargetChatCurrent
import dev.g000sha256.tdl.dto.TargetChatInternalLink
import dev.g000sha256.tdl.dto.TelegramPaymentPurpose
import dev.g000sha256.tdl.dto.TelegramPaymentPurposeGiftedStars
import dev.g000sha256.tdl.dto.TelegramPaymentPurposeJoinChat
import dev.g000sha256.tdl.dto.TelegramPaymentPurposePremiumGift
import dev.g000sha256.tdl.dto.TelegramPaymentPurposePremiumGiftCodes
import dev.g000sha256.tdl.dto.TelegramPaymentPurposePremiumGiveaway
import dev.g000sha256.tdl.dto.TelegramPaymentPurposeStarGiveaway
import dev.g000sha256.tdl.dto.TelegramPaymentPurposeStars
import dev.g000sha256.tdl.dto.TextEntityType
import dev.g000sha256.tdl.dto.TextEntityTypeBankCardNumber
import dev.g000sha256.tdl.dto.TextEntityTypeBlockQuote
import dev.g000sha256.tdl.dto.TextEntityTypeBold
import dev.g000sha256.tdl.dto.TextEntityTypeBotCommand
import dev.g000sha256.tdl.dto.TextEntityTypeCashtag
import dev.g000sha256.tdl.dto.TextEntityTypeCode
import dev.g000sha256.tdl.dto.TextEntityTypeCustomEmoji
import dev.g000sha256.tdl.dto.TextEntityTypeDateTime
import dev.g000sha256.tdl.dto.TextEntityTypeEmailAddress
import dev.g000sha256.tdl.dto.TextEntityTypeExpandableBlockQuote
import dev.g000sha256.tdl.dto.TextEntityTypeHashtag
import dev.g000sha256.tdl.dto.TextEntityTypeItalic
import dev.g000sha256.tdl.dto.TextEntityTypeMediaTimestamp
import dev.g000sha256.tdl.dto.TextEntityTypeMention
import dev.g000sha256.tdl.dto.TextEntityTypeMentionName
import dev.g000sha256.tdl.dto.TextEntityTypePhoneNumber
import dev.g000sha256.tdl.dto.TextEntityTypePre
import dev.g000sha256.tdl.dto.TextEntityTypePreCode
import dev.g000sha256.tdl.dto.TextEntityTypeSpoiler
import dev.g000sha256.tdl.dto.TextEntityTypeStrikethrough
import dev.g000sha256.tdl.dto.TextEntityTypeTextUrl
import dev.g000sha256.tdl.dto.TextEntityTypeUnderline
import dev.g000sha256.tdl.dto.TextEntityTypeUrl
import dev.g000sha256.tdl.dto.TextParseMode
import dev.g000sha256.tdl.dto.TextParseModeHTML
import dev.g000sha256.tdl.dto.TextParseModeMarkdown
import dev.g000sha256.tdl.dto.ThumbnailFormat
import dev.g000sha256.tdl.dto.ThumbnailFormatGif
import dev.g000sha256.tdl.dto.ThumbnailFormatJpeg
import dev.g000sha256.tdl.dto.ThumbnailFormatMpeg4
import dev.g000sha256.tdl.dto.ThumbnailFormatPng
import dev.g000sha256.tdl.dto.ThumbnailFormatTgs
import dev.g000sha256.tdl.dto.ThumbnailFormatWebm
import dev.g000sha256.tdl.dto.ThumbnailFormatWebp
import dev.g000sha256.tdl.dto.TonTransactionType
import dev.g000sha256.tdl.dto.TonTransactionTypeFragmentDeposit
import dev.g000sha256.tdl.dto.TonTransactionTypeFragmentWithdrawal
import dev.g000sha256.tdl.dto.TonTransactionTypeGiftPurchaseOffer
import dev.g000sha256.tdl.dto.TonTransactionTypeStakeDicePayout
import dev.g000sha256.tdl.dto.TonTransactionTypeStakeDiceStake
import dev.g000sha256.tdl.dto.TonTransactionTypeSuggestedPostPayment
import dev.g000sha256.tdl.dto.TonTransactionTypeUnsupported
import dev.g000sha256.tdl.dto.TonTransactionTypeUpgradedGiftPurchase
import dev.g000sha256.tdl.dto.TonTransactionTypeUpgradedGiftSale
import dev.g000sha256.tdl.dto.TopChatCategory
import dev.g000sha256.tdl.dto.TopChatCategoryBots
import dev.g000sha256.tdl.dto.TopChatCategoryCalls
import dev.g000sha256.tdl.dto.TopChatCategoryChannels
import dev.g000sha256.tdl.dto.TopChatCategoryForwardChats
import dev.g000sha256.tdl.dto.TopChatCategoryGroups
import dev.g000sha256.tdl.dto.TopChatCategoryGuestBots
import dev.g000sha256.tdl.dto.TopChatCategoryInlineBots
import dev.g000sha256.tdl.dto.TopChatCategoryUsers
import dev.g000sha256.tdl.dto.TopChatCategoryWebAppBots
import dev.g000sha256.tdl.dto.TransactionDirection
import dev.g000sha256.tdl.dto.TransactionDirectionIncoming
import dev.g000sha256.tdl.dto.TransactionDirectionOutgoing
import dev.g000sha256.tdl.dto.Update
import dev.g000sha256.tdl.dto.UpdateAccentColors
import dev.g000sha256.tdl.dto.UpdateActiveEmojiReactions
import dev.g000sha256.tdl.dto.UpdateActiveGiftAuctions
import dev.g000sha256.tdl.dto.UpdateActiveLiveLocationMessages
import dev.g000sha256.tdl.dto.UpdateActiveNotifications
import dev.g000sha256.tdl.dto.UpdateAgeVerificationParameters
import dev.g000sha256.tdl.dto.UpdateAnimatedEmojiMessageClicked
import dev.g000sha256.tdl.dto.UpdateAnimationSearchParameters
import dev.g000sha256.tdl.dto.UpdateApplicationRecaptchaVerificationRequired
import dev.g000sha256.tdl.dto.UpdateApplicationVerificationRequired
import dev.g000sha256.tdl.dto.UpdateAttachmentMenuBots
import dev.g000sha256.tdl.dto.UpdateAuthorizationState
import dev.g000sha256.tdl.dto.UpdateAutosaveSettings
import dev.g000sha256.tdl.dto.UpdateAvailableMessageEffects
import dev.g000sha256.tdl.dto.UpdateBasicGroup
import dev.g000sha256.tdl.dto.UpdateBasicGroupFullInfo
import dev.g000sha256.tdl.dto.UpdateBusinessConnection
import dev.g000sha256.tdl.dto.UpdateBusinessMessageEdited
import dev.g000sha256.tdl.dto.UpdateBusinessMessagesDeleted
import dev.g000sha256.tdl.dto.UpdateCall
import dev.g000sha256.tdl.dto.UpdateChatAccentColors
import dev.g000sha256.tdl.dto.UpdateChatAction
import dev.g000sha256.tdl.dto.UpdateChatActionBar
import dev.g000sha256.tdl.dto.UpdateChatActiveStories
import dev.g000sha256.tdl.dto.UpdateChatAddedToList
import dev.g000sha256.tdl.dto.UpdateChatAvailableReactions
import dev.g000sha256.tdl.dto.UpdateChatBackground
import dev.g000sha256.tdl.dto.UpdateChatBlockList
import dev.g000sha256.tdl.dto.UpdateChatBoost
import dev.g000sha256.tdl.dto.UpdateChatBusinessBotManageBar
import dev.g000sha256.tdl.dto.UpdateChatDefaultDisableNotification
import dev.g000sha256.tdl.dto.UpdateChatDraftMessage
import dev.g000sha256.tdl.dto.UpdateChatEmojiStatus
import dev.g000sha256.tdl.dto.UpdateChatFolders
import dev.g000sha256.tdl.dto.UpdateChatHasProtectedContent
import dev.g000sha256.tdl.dto.UpdateChatHasScheduledMessages
import dev.g000sha256.tdl.dto.UpdateChatIsMarkedAsUnread
import dev.g000sha256.tdl.dto.UpdateChatIsTranslatable
import dev.g000sha256.tdl.dto.UpdateChatJoinResult
import dev.g000sha256.tdl.dto.UpdateChatLastMessage
import dev.g000sha256.tdl.dto.UpdateChatMember
import dev.g000sha256.tdl.dto.UpdateChatMessageAutoDeleteTime
import dev.g000sha256.tdl.dto.UpdateChatMessageSender
import dev.g000sha256.tdl.dto.UpdateChatNotificationSettings
import dev.g000sha256.tdl.dto.UpdateChatOnlineMemberCount
import dev.g000sha256.tdl.dto.UpdateChatPendingJoinRequests
import dev.g000sha256.tdl.dto.UpdateChatPermissions
import dev.g000sha256.tdl.dto.UpdateChatPhoto
import dev.g000sha256.tdl.dto.UpdateChatPosition
import dev.g000sha256.tdl.dto.UpdateChatReadInbox
import dev.g000sha256.tdl.dto.UpdateChatReadOutbox
import dev.g000sha256.tdl.dto.UpdateChatRemovedFromList
import dev.g000sha256.tdl.dto.UpdateChatReplyMarkup
import dev.g000sha256.tdl.dto.UpdateChatRevenueAmount
import dev.g000sha256.tdl.dto.UpdateChatTheme
import dev.g000sha256.tdl.dto.UpdateChatTitle
import dev.g000sha256.tdl.dto.UpdateChatUnreadMentionCount
import dev.g000sha256.tdl.dto.UpdateChatUnreadPollVoteCount
import dev.g000sha256.tdl.dto.UpdateChatUnreadReactionCount
import dev.g000sha256.tdl.dto.UpdateChatVideoChat
import dev.g000sha256.tdl.dto.UpdateChatViewAsTopics
import dev.g000sha256.tdl.dto.UpdateCommunity
import dev.g000sha256.tdl.dto.UpdateConnectionState
import dev.g000sha256.tdl.dto.UpdateContactCloseBirthdays
import dev.g000sha256.tdl.dto.UpdateDefaultBackground
import dev.g000sha256.tdl.dto.UpdateDefaultPaidReactionType
import dev.g000sha256.tdl.dto.UpdateDefaultReactionType
import dev.g000sha256.tdl.dto.UpdateDeleteMessages
import dev.g000sha256.tdl.dto.UpdateDiceEmojis
import dev.g000sha256.tdl.dto.UpdateDirectMessagesChatTopic
import dev.g000sha256.tdl.dto.UpdateEmojiChatThemes
import dev.g000sha256.tdl.dto.UpdateFavoriteStickers
import dev.g000sha256.tdl.dto.UpdateFile
import dev.g000sha256.tdl.dto.UpdateFileAddedToDownloads
import dev.g000sha256.tdl.dto.UpdateFileDownload
import dev.g000sha256.tdl.dto.UpdateFileDownloads
import dev.g000sha256.tdl.dto.UpdateFileGenerationStart
import dev.g000sha256.tdl.dto.UpdateFileGenerationStop
import dev.g000sha256.tdl.dto.UpdateFileRemovedFromDownloads
import dev.g000sha256.tdl.dto.UpdateForumTopic
import dev.g000sha256.tdl.dto.UpdateForumTopicInfo
import dev.g000sha256.tdl.dto.UpdateFreezeState
import dev.g000sha256.tdl.dto.UpdateGiftAuctionState
import dev.g000sha256.tdl.dto.UpdateGramRevenueStatus
import dev.g000sha256.tdl.dto.UpdateGroupCall
import dev.g000sha256.tdl.dto.UpdateGroupCallMessageLevels
import dev.g000sha256.tdl.dto.UpdateGroupCallMessageSendFailed
import dev.g000sha256.tdl.dto.UpdateGroupCallMessagesDeleted
import dev.g000sha256.tdl.dto.UpdateGroupCallParticipant
import dev.g000sha256.tdl.dto.UpdateGroupCallParticipants
import dev.g000sha256.tdl.dto.UpdateGroupCallVerificationState
import dev.g000sha256.tdl.dto.UpdateHavePendingNotifications
import dev.g000sha256.tdl.dto.UpdateInstalledStickerSets
import dev.g000sha256.tdl.dto.UpdateLanguagePackStrings
import dev.g000sha256.tdl.dto.UpdateLiveStoryTopDonors
import dev.g000sha256.tdl.dto.UpdateManagedBot
import dev.g000sha256.tdl.dto.UpdateMessageContainsUnreadPollVotes
import dev.g000sha256.tdl.dto.UpdateMessageContent
import dev.g000sha256.tdl.dto.UpdateMessageContentOpened
import dev.g000sha256.tdl.dto.UpdateMessageEdited
import dev.g000sha256.tdl.dto.UpdateMessageFactCheck
import dev.g000sha256.tdl.dto.UpdateMessageInteractionInfo
import dev.g000sha256.tdl.dto.UpdateMessageIsPinned
import dev.g000sha256.tdl.dto.UpdateMessageLiveLocationViewed
import dev.g000sha256.tdl.dto.UpdateMessageMentionRead
import dev.g000sha256.tdl.dto.UpdateMessageReaction
import dev.g000sha256.tdl.dto.UpdateMessageReactions
import dev.g000sha256.tdl.dto.UpdateMessageSendAcknowledged
import dev.g000sha256.tdl.dto.UpdateMessageSendFailed
import dev.g000sha256.tdl.dto.UpdateMessageSendSucceeded
import dev.g000sha256.tdl.dto.UpdateMessageSuggestedPostInfo
import dev.g000sha256.tdl.dto.UpdateMessageUnreadReactions
import dev.g000sha256.tdl.dto.UpdateNewBusinessCallbackQuery
import dev.g000sha256.tdl.dto.UpdateNewBusinessMessage
import dev.g000sha256.tdl.dto.UpdateNewCallSignalingData
import dev.g000sha256.tdl.dto.UpdateNewCallbackQuery
import dev.g000sha256.tdl.dto.UpdateNewChat
import dev.g000sha256.tdl.dto.UpdateNewChatJoinRequest
import dev.g000sha256.tdl.dto.UpdateNewChosenInlineResult
import dev.g000sha256.tdl.dto.UpdateNewCustomEvent
import dev.g000sha256.tdl.dto.UpdateNewCustomQuery
import dev.g000sha256.tdl.dto.UpdateNewGroupCallMessage
import dev.g000sha256.tdl.dto.UpdateNewGroupCallPaidReaction
import dev.g000sha256.tdl.dto.UpdateNewGuestQuery
import dev.g000sha256.tdl.dto.UpdateNewInlineCallbackQuery
import dev.g000sha256.tdl.dto.UpdateNewInlineQuery
import dev.g000sha256.tdl.dto.UpdateNewMessage
import dev.g000sha256.tdl.dto.UpdateNewOauthRequest
import dev.g000sha256.tdl.dto.UpdateNewPreCheckoutQuery
import dev.g000sha256.tdl.dto.UpdateNewShippingQuery
import dev.g000sha256.tdl.dto.UpdateNotification
import dev.g000sha256.tdl.dto.UpdateNotificationGroup
import dev.g000sha256.tdl.dto.UpdateOption
import dev.g000sha256.tdl.dto.UpdateOwnedGramCount
import dev.g000sha256.tdl.dto.UpdateOwnedStarCount
import dev.g000sha256.tdl.dto.UpdatePaidMediaPurchased
import dev.g000sha256.tdl.dto.UpdatePendingMessage
import dev.g000sha256.tdl.dto.UpdatePoll
import dev.g000sha256.tdl.dto.UpdatePollAnswer
import dev.g000sha256.tdl.dto.UpdateProfileAccentColors
import dev.g000sha256.tdl.dto.UpdateQuickReplyShortcut
import dev.g000sha256.tdl.dto.UpdateQuickReplyShortcutDeleted
import dev.g000sha256.tdl.dto.UpdateQuickReplyShortcutMessages
import dev.g000sha256.tdl.dto.UpdateQuickReplyShortcuts
import dev.g000sha256.tdl.dto.UpdateReactionNotificationSettings
import dev.g000sha256.tdl.dto.UpdateRecentStickers
import dev.g000sha256.tdl.dto.UpdateSavedAnimations
import dev.g000sha256.tdl.dto.UpdateSavedMessagesTags
import dev.g000sha256.tdl.dto.UpdateSavedMessagesTopic
import dev.g000sha256.tdl.dto.UpdateSavedMessagesTopicCount
import dev.g000sha256.tdl.dto.UpdateSavedNotificationSounds
import dev.g000sha256.tdl.dto.UpdateScopeNotificationSettings
import dev.g000sha256.tdl.dto.UpdateSecretChat
import dev.g000sha256.tdl.dto.UpdateServiceNotification
import dev.g000sha256.tdl.dto.UpdateSpeechRecognitionTrial
import dev.g000sha256.tdl.dto.UpdateSpeedLimitNotification
import dev.g000sha256.tdl.dto.UpdateStakeDiceState
import dev.g000sha256.tdl.dto.UpdateStarRevenueStatus
import dev.g000sha256.tdl.dto.UpdateStickerSet
import dev.g000sha256.tdl.dto.UpdateStory
import dev.g000sha256.tdl.dto.UpdateStoryDeleted
import dev.g000sha256.tdl.dto.UpdateStoryListChatCount
import dev.g000sha256.tdl.dto.UpdateStoryPostFailed
import dev.g000sha256.tdl.dto.UpdateStoryPostSucceeded
import dev.g000sha256.tdl.dto.UpdateStoryStealthMode
import dev.g000sha256.tdl.dto.UpdateSuggestedActions
import dev.g000sha256.tdl.dto.UpdateSupergroup
import dev.g000sha256.tdl.dto.UpdateSupergroupFullInfo
import dev.g000sha256.tdl.dto.UpdateTermsOfService
import dev.g000sha256.tdl.dto.UpdateTextCompositionStyles
import dev.g000sha256.tdl.dto.UpdateTopicMessageCount
import dev.g000sha256.tdl.dto.UpdateTrendingStickerSets
import dev.g000sha256.tdl.dto.UpdateTrustedMiniAppBots
import dev.g000sha256.tdl.dto.UpdateUnconfirmedSession
import dev.g000sha256.tdl.dto.UpdateUnreadChatCount
import dev.g000sha256.tdl.dto.UpdateUnreadMessageCount
import dev.g000sha256.tdl.dto.UpdateUser
import dev.g000sha256.tdl.dto.UpdateUserFullInfo
import dev.g000sha256.tdl.dto.UpdateUserPrivacySettingRules
import dev.g000sha256.tdl.dto.UpdateUserStatus
import dev.g000sha256.tdl.dto.UpdateUserSubscription
import dev.g000sha256.tdl.dto.UpdateVideoPublished
import dev.g000sha256.tdl.dto.UpdateWebAppMessageSent
import dev.g000sha256.tdl.dto.UpdateWebBrowserSettings
import dev.g000sha256.tdl.dto.UpgradedGiftAttributeId
import dev.g000sha256.tdl.dto.UpgradedGiftAttributeIdBackdrop
import dev.g000sha256.tdl.dto.UpgradedGiftAttributeIdModel
import dev.g000sha256.tdl.dto.UpgradedGiftAttributeIdSymbol
import dev.g000sha256.tdl.dto.UpgradedGiftAttributeRarity
import dev.g000sha256.tdl.dto.UpgradedGiftAttributeRarityEpic
import dev.g000sha256.tdl.dto.UpgradedGiftAttributeRarityLegendary
import dev.g000sha256.tdl.dto.UpgradedGiftAttributeRarityPerMille
import dev.g000sha256.tdl.dto.UpgradedGiftAttributeRarityRare
import dev.g000sha256.tdl.dto.UpgradedGiftAttributeRarityUncommon
import dev.g000sha256.tdl.dto.UpgradedGiftOrigin
import dev.g000sha256.tdl.dto.UpgradedGiftOriginBlockchain
import dev.g000sha256.tdl.dto.UpgradedGiftOriginCraft
import dev.g000sha256.tdl.dto.UpgradedGiftOriginOffer
import dev.g000sha256.tdl.dto.UpgradedGiftOriginPrepaidUpgrade
import dev.g000sha256.tdl.dto.UpgradedGiftOriginResale
import dev.g000sha256.tdl.dto.UpgradedGiftOriginTransfer
import dev.g000sha256.tdl.dto.UpgradedGiftOriginUpgrade
import dev.g000sha256.tdl.dto.UserPrivacySetting
import dev.g000sha256.tdl.dto.UserPrivacySettingAllowCalls
import dev.g000sha256.tdl.dto.UserPrivacySettingAllowChatInvites
import dev.g000sha256.tdl.dto.UserPrivacySettingAllowFindingByPhoneNumber
import dev.g000sha256.tdl.dto.UserPrivacySettingAllowPeerToPeerCalls
import dev.g000sha256.tdl.dto.UserPrivacySettingAllowPrivateVoiceAndVideoNoteMessages
import dev.g000sha256.tdl.dto.UserPrivacySettingAllowUnpaidMessages
import dev.g000sha256.tdl.dto.UserPrivacySettingAutosaveGifts
import dev.g000sha256.tdl.dto.UserPrivacySettingRule
import dev.g000sha256.tdl.dto.UserPrivacySettingRuleAllowAll
import dev.g000sha256.tdl.dto.UserPrivacySettingRuleAllowBots
import dev.g000sha256.tdl.dto.UserPrivacySettingRuleAllowChatMembers
import dev.g000sha256.tdl.dto.UserPrivacySettingRuleAllowContacts
import dev.g000sha256.tdl.dto.UserPrivacySettingRuleAllowPremiumUsers
import dev.g000sha256.tdl.dto.UserPrivacySettingRuleAllowUsers
import dev.g000sha256.tdl.dto.UserPrivacySettingRuleRestrictAll
import dev.g000sha256.tdl.dto.UserPrivacySettingRuleRestrictBots
import dev.g000sha256.tdl.dto.UserPrivacySettingRuleRestrictChatMembers
import dev.g000sha256.tdl.dto.UserPrivacySettingRuleRestrictContacts
import dev.g000sha256.tdl.dto.UserPrivacySettingRuleRestrictUsers
import dev.g000sha256.tdl.dto.UserPrivacySettingShowBio
import dev.g000sha256.tdl.dto.UserPrivacySettingShowBirthdate
import dev.g000sha256.tdl.dto.UserPrivacySettingShowLinkInForwardedMessages
import dev.g000sha256.tdl.dto.UserPrivacySettingShowPhoneNumber
import dev.g000sha256.tdl.dto.UserPrivacySettingShowProfileAudio
import dev.g000sha256.tdl.dto.UserPrivacySettingShowProfilePhoto
import dev.g000sha256.tdl.dto.UserPrivacySettingShowStatus
import dev.g000sha256.tdl.dto.UserStatus
import dev.g000sha256.tdl.dto.UserStatusEmpty
import dev.g000sha256.tdl.dto.UserStatusLastMonth
import dev.g000sha256.tdl.dto.UserStatusLastWeek
import dev.g000sha256.tdl.dto.UserStatusOffline
import dev.g000sha256.tdl.dto.UserStatusOnline
import dev.g000sha256.tdl.dto.UserStatusRecently
import dev.g000sha256.tdl.dto.UserType
import dev.g000sha256.tdl.dto.UserTypeBot
import dev.g000sha256.tdl.dto.UserTypeDeleted
import dev.g000sha256.tdl.dto.UserTypeRegular
import dev.g000sha256.tdl.dto.UserTypeUnknown
import dev.g000sha256.tdl.dto.VectorPathCommand
import dev.g000sha256.tdl.dto.VectorPathCommandCubicBezierCurve
import dev.g000sha256.tdl.dto.VectorPathCommandLine
import dev.g000sha256.tdl.dto.WebAppOpenMode
import dev.g000sha256.tdl.dto.WebAppOpenModeCompact
import dev.g000sha256.tdl.dto.WebAppOpenModeFullScreen
import dev.g000sha256.tdl.dto.WebAppOpenModeFullSize
import dev.g000sha256.tdl.dto.WebBrowserType
import dev.g000sha256.tdl.dto.WebBrowserTypeExternal
import dev.g000sha256.tdl.dto.WebBrowserTypeInApp
import kotlinx.serialization.json.JsonElement

internal fun serialize(dto: AuthenticationCodeType): JsonElement {
    when(dto) {
        is AuthenticationCodeTypeTelegramMessage -> return serialize(dto = dto)
        is AuthenticationCodeTypeSms -> return serialize(dto = dto)
        is AuthenticationCodeTypeSmsWord -> return serialize(dto = dto)
        is AuthenticationCodeTypeSmsPhrase -> return serialize(dto = dto)
        is AuthenticationCodeTypeCall -> return serialize(dto = dto)
        is AuthenticationCodeTypeFlashCall -> return serialize(dto = dto)
        is AuthenticationCodeTypeMissedCall -> return serialize(dto = dto)
        is AuthenticationCodeTypeFragment -> return serialize(dto = dto)
        is AuthenticationCodeTypeFirebaseAndroid -> return serialize(dto = dto)
        is AuthenticationCodeTypeFirebaseIos -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: EmailAddressAuthentication): JsonElement {
    when(dto) {
        is EmailAddressAuthenticationCode -> return serialize(dto = dto)
        is EmailAddressAuthenticationAppleId -> return serialize(dto = dto)
        is EmailAddressAuthenticationGoogleId -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: EmailAddressResetState): JsonElement {
    when(dto) {
        is EmailAddressResetStateAvailable -> return serialize(dto = dto)
        is EmailAddressResetStatePending -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: RichMessageSource): JsonElement {
    when(dto) {
        is RichMessageSourceBlocks -> return serialize(dto = dto)
        is RichMessageSourceMarkdown -> return serialize(dto = dto)
        is RichMessageSourceHtml -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: AuthorizationState): JsonElement {
    when(dto) {
        is AuthorizationStateWaitTdlibParameters -> return serialize(dto = dto)
        is AuthorizationStateWaitPhoneNumber -> return serialize(dto = dto)
        is AuthorizationStateWaitPremiumPurchase -> return serialize(dto = dto)
        is AuthorizationStateWaitEmailAddress -> return serialize(dto = dto)
        is AuthorizationStateWaitEmailCode -> return serialize(dto = dto)
        is AuthorizationStateWaitCode -> return serialize(dto = dto)
        is AuthorizationStateWaitOtherDeviceConfirmation -> return serialize(dto = dto)
        is AuthorizationStateWaitRegistration -> return serialize(dto = dto)
        is AuthorizationStateWaitPassword -> return serialize(dto = dto)
        is AuthorizationStateReady -> return serialize(dto = dto)
        is AuthorizationStateLoggingOut -> return serialize(dto = dto)
        is AuthorizationStateClosing -> return serialize(dto = dto)
        is AuthorizationStateClosed -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: FirebaseDeviceVerificationParameters): JsonElement {
    when(dto) {
        is FirebaseDeviceVerificationParametersSafetyNet -> return serialize(dto = dto)
        is FirebaseDeviceVerificationParametersPlayIntegrity -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: InputFile): JsonElement {
    when(dto) {
        is InputFileId -> return serialize(dto = dto)
        is InputFileRemote -> return serialize(dto = dto)
        is InputFileLocal -> return serialize(dto = dto)
        is InputFileGenerated -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ThumbnailFormat): JsonElement {
    when(dto) {
        is ThumbnailFormatJpeg -> return serialize(dto = dto)
        is ThumbnailFormatGif -> return serialize(dto = dto)
        is ThumbnailFormatMpeg4 -> return serialize(dto = dto)
        is ThumbnailFormatPng -> return serialize(dto = dto)
        is ThumbnailFormatTgs -> return serialize(dto = dto)
        is ThumbnailFormatWebm -> return serialize(dto = dto)
        is ThumbnailFormatWebp -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: MaskPoint): JsonElement {
    when(dto) {
        is MaskPointForehead -> return serialize(dto = dto)
        is MaskPointEyes -> return serialize(dto = dto)
        is MaskPointMouth -> return serialize(dto = dto)
        is MaskPointChin -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: StickerFormat): JsonElement {
    when(dto) {
        is StickerFormatWebp -> return serialize(dto = dto)
        is StickerFormatTgs -> return serialize(dto = dto)
        is StickerFormatWebm -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: StickerType): JsonElement {
    when(dto) {
        is StickerTypeRegular -> return serialize(dto = dto)
        is StickerTypeMask -> return serialize(dto = dto)
        is StickerTypeCustomEmoji -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: StickerFullType): JsonElement {
    when(dto) {
        is StickerFullTypeRegular -> return serialize(dto = dto)
        is StickerFullTypeMask -> return serialize(dto = dto)
        is StickerFullTypeCustomEmoji -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: PollType): JsonElement {
    when(dto) {
        is PollTypeRegular -> return serialize(dto = dto)
        is PollTypeQuiz -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: InputPollType): JsonElement {
    when(dto) {
        is InputPollTypeRegular -> return serialize(dto = dto)
        is InputPollTypeQuiz -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: PollVoteRestrictionReason): JsonElement {
    when(dto) {
        is PollVoteRestrictionReasonClosed -> return serialize(dto = dto)
        is PollVoteRestrictionReasonYetUnsent -> return serialize(dto = dto)
        is PollVoteRestrictionReasonScheduled -> return serialize(dto = dto)
        is PollVoteRestrictionReasonCountryRestricted -> return serialize(dto = dto)
        is PollVoteRestrictionReasonMembershipRequired -> return serialize(dto = dto)
        is PollVoteRestrictionReasonOther -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ProfileTab): JsonElement {
    when(dto) {
        is ProfileTabPosts -> return serialize(dto = dto)
        is ProfileTabGifts -> return serialize(dto = dto)
        is ProfileTabMedia -> return serialize(dto = dto)
        is ProfileTabFiles -> return serialize(dto = dto)
        is ProfileTabLinks -> return serialize(dto = dto)
        is ProfileTabMusic -> return serialize(dto = dto)
        is ProfileTabVoice -> return serialize(dto = dto)
        is ProfileTabGifs -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: UserType): JsonElement {
    when(dto) {
        is UserTypeRegular -> return serialize(dto = dto)
        is UserTypeDeleted -> return serialize(dto = dto)
        is UserTypeBot -> return serialize(dto = dto)
        is UserTypeUnknown -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: BusinessAwayMessageSchedule): JsonElement {
    when(dto) {
        is BusinessAwayMessageScheduleAlways -> return serialize(dto = dto)
        is BusinessAwayMessageScheduleOutsideOfOpeningHours -> return serialize(dto = dto)
        is BusinessAwayMessageScheduleCustom -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ChatPhotoStickerType): JsonElement {
    when(dto) {
        is ChatPhotoStickerTypeRegularOrMask -> return serialize(dto = dto)
        is ChatPhotoStickerTypeCustomEmoji -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: InputChatPhoto): JsonElement {
    when(dto) {
        is InputChatPhotoPrevious -> return serialize(dto = dto)
        is InputChatPhotoStatic -> return serialize(dto = dto)
        is InputChatPhotoAnimation -> return serialize(dto = dto)
        is InputChatPhotoSticker -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: WebAppOpenMode): JsonElement {
    when(dto) {
        is WebAppOpenModeCompact -> return serialize(dto = dto)
        is WebAppOpenModeFullSize -> return serialize(dto = dto)
        is WebAppOpenModeFullScreen -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: GiftResalePrice): JsonElement {
    when(dto) {
        is GiftResalePriceStar -> return serialize(dto = dto)
        is GiftResalePriceGram -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: GiftPurchaseOfferState): JsonElement {
    when(dto) {
        is GiftPurchaseOfferStatePending -> return serialize(dto = dto)
        is GiftPurchaseOfferStateAccepted -> return serialize(dto = dto)
        is GiftPurchaseOfferStateRejected -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: SuggestedPostPrice): JsonElement {
    when(dto) {
        is SuggestedPostPriceStar -> return serialize(dto = dto)
        is SuggestedPostPriceGram -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: SuggestedPostState): JsonElement {
    when(dto) {
        is SuggestedPostStatePending -> return serialize(dto = dto)
        is SuggestedPostStateApproved -> return serialize(dto = dto)
        is SuggestedPostStateDeclined -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: SuggestedPostRefundReason): JsonElement {
    when(dto) {
        is SuggestedPostRefundReasonPostDeleted -> return serialize(dto = dto)
        is SuggestedPostRefundReasonPaymentRefunded -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: StarSubscriptionType): JsonElement {
    when(dto) {
        is StarSubscriptionTypeChannel -> return serialize(dto = dto)
        is StarSubscriptionTypeBot -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: AffiliateType): JsonElement {
    when(dto) {
        is AffiliateTypeCurrentUser -> return serialize(dto = dto)
        is AffiliateTypeBot -> return serialize(dto = dto)
        is AffiliateTypeChannel -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: AffiliateProgramSortOrder): JsonElement {
    when(dto) {
        is AffiliateProgramSortOrderProfitability -> return serialize(dto = dto)
        is AffiliateProgramSortOrderCreationDate -> return serialize(dto = dto)
        is AffiliateProgramSortOrderRevenue -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: CanSendGiftResult): JsonElement {
    when(dto) {
        is CanSendGiftResultOk -> return serialize(dto = dto)
        is CanSendGiftResultFail -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: UpgradedGiftOrigin): JsonElement {
    when(dto) {
        is UpgradedGiftOriginUpgrade -> return serialize(dto = dto)
        is UpgradedGiftOriginTransfer -> return serialize(dto = dto)
        is UpgradedGiftOriginResale -> return serialize(dto = dto)
        is UpgradedGiftOriginBlockchain -> return serialize(dto = dto)
        is UpgradedGiftOriginPrepaidUpgrade -> return serialize(dto = dto)
        is UpgradedGiftOriginOffer -> return serialize(dto = dto)
        is UpgradedGiftOriginCraft -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: UpgradedGiftAttributeRarity): JsonElement {
    when(dto) {
        is UpgradedGiftAttributeRarityPerMille -> return serialize(dto = dto)
        is UpgradedGiftAttributeRarityUncommon -> return serialize(dto = dto)
        is UpgradedGiftAttributeRarityRare -> return serialize(dto = dto)
        is UpgradedGiftAttributeRarityEpic -> return serialize(dto = dto)
        is UpgradedGiftAttributeRarityLegendary -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: CraftGiftResult): JsonElement {
    when(dto) {
        is CraftGiftResultSuccess -> return serialize(dto = dto)
        is CraftGiftResultTooEarly -> return serialize(dto = dto)
        is CraftGiftResultInvalidGift -> return serialize(dto = dto)
        is CraftGiftResultFail -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: UpgradedGiftAttributeId): JsonElement {
    when(dto) {
        is UpgradedGiftAttributeIdModel -> return serialize(dto = dto)
        is UpgradedGiftAttributeIdSymbol -> return serialize(dto = dto)
        is UpgradedGiftAttributeIdBackdrop -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: GiftForResaleOrder): JsonElement {
    when(dto) {
        is GiftForResaleOrderPrice -> return serialize(dto = dto)
        is GiftForResaleOrderPriceChangeDate -> return serialize(dto = dto)
        is GiftForResaleOrderNumber -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: GiftResaleResult): JsonElement {
    when(dto) {
        is GiftResaleResultOk -> return serialize(dto = dto)
        is GiftResaleResultPriceIncreased -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: SentGift): JsonElement {
    when(dto) {
        is SentGiftRegular -> return serialize(dto = dto)
        is SentGiftUpgraded -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: AuctionState): JsonElement {
    when(dto) {
        is AuctionStateActive -> return serialize(dto = dto)
        is AuctionStateFinished -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: TransactionDirection): JsonElement {
    when(dto) {
        is TransactionDirectionIncoming -> return serialize(dto = dto)
        is TransactionDirectionOutgoing -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: StarTransactionType): JsonElement {
    when(dto) {
        is StarTransactionTypePremiumBotDeposit -> return serialize(dto = dto)
        is StarTransactionTypeAppStoreDeposit -> return serialize(dto = dto)
        is StarTransactionTypeGooglePlayDeposit -> return serialize(dto = dto)
        is StarTransactionTypeFragmentDeposit -> return serialize(dto = dto)
        is StarTransactionTypeUserDeposit -> return serialize(dto = dto)
        is StarTransactionTypeGiveawayDeposit -> return serialize(dto = dto)
        is StarTransactionTypeFragmentWithdrawal -> return serialize(dto = dto)
        is StarTransactionTypeTelegramAdsWithdrawal -> return serialize(dto = dto)
        is StarTransactionTypeTelegramApiUsage -> return serialize(dto = dto)
        is StarTransactionTypeBotPaidMediaPurchase -> return serialize(dto = dto)
        is StarTransactionTypeBotPaidMediaSale -> return serialize(dto = dto)
        is StarTransactionTypeChannelPaidMediaPurchase -> return serialize(dto = dto)
        is StarTransactionTypeChannelPaidMediaSale -> return serialize(dto = dto)
        is StarTransactionTypeBotInvoicePurchase -> return serialize(dto = dto)
        is StarTransactionTypeBotInvoiceSale -> return serialize(dto = dto)
        is StarTransactionTypeBotSubscriptionPurchase -> return serialize(dto = dto)
        is StarTransactionTypeBotSubscriptionSale -> return serialize(dto = dto)
        is StarTransactionTypeChannelSubscriptionPurchase -> return serialize(dto = dto)
        is StarTransactionTypeChannelSubscriptionSale -> return serialize(dto = dto)
        is StarTransactionTypeGiftAuctionBid -> return serialize(dto = dto)
        is StarTransactionTypeGiftPurchase -> return serialize(dto = dto)
        is StarTransactionTypeGiftPurchaseOffer -> return serialize(dto = dto)
        is StarTransactionTypeGiftTransfer -> return serialize(dto = dto)
        is StarTransactionTypeGiftOriginalDetailsDrop -> return serialize(dto = dto)
        is StarTransactionTypeGiftSale -> return serialize(dto = dto)
        is StarTransactionTypeGiftUpgrade -> return serialize(dto = dto)
        is StarTransactionTypeGiftUpgradePurchase -> return serialize(dto = dto)
        is StarTransactionTypeUpgradedGiftPurchase -> return serialize(dto = dto)
        is StarTransactionTypeUpgradedGiftSale -> return serialize(dto = dto)
        is StarTransactionTypeChannelPaidReactionSend -> return serialize(dto = dto)
        is StarTransactionTypeChannelPaidReactionReceive -> return serialize(dto = dto)
        is StarTransactionTypeAffiliateProgramCommission -> return serialize(dto = dto)
        is StarTransactionTypePaidMessageSend -> return serialize(dto = dto)
        is StarTransactionTypePaidMessageReceive -> return serialize(dto = dto)
        is StarTransactionTypePaidGroupCallMessageSend -> return serialize(dto = dto)
        is StarTransactionTypePaidGroupCallMessageReceive -> return serialize(dto = dto)
        is StarTransactionTypePaidGroupCallReactionSend -> return serialize(dto = dto)
        is StarTransactionTypePaidGroupCallReactionReceive -> return serialize(dto = dto)
        is StarTransactionTypeSuggestedPostPaymentSend -> return serialize(dto = dto)
        is StarTransactionTypeSuggestedPostPaymentReceive -> return serialize(dto = dto)
        is StarTransactionTypePremiumPurchase -> return serialize(dto = dto)
        is StarTransactionTypeBusinessBotTransferSend -> return serialize(dto = dto)
        is StarTransactionTypeBusinessBotTransferReceive -> return serialize(dto = dto)
        is StarTransactionTypePublicPostSearch -> return serialize(dto = dto)
        is StarTransactionTypeUnsupported -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: TonTransactionType): JsonElement {
    when(dto) {
        is TonTransactionTypeFragmentDeposit -> return serialize(dto = dto)
        is TonTransactionTypeFragmentWithdrawal -> return serialize(dto = dto)
        is TonTransactionTypeSuggestedPostPayment -> return serialize(dto = dto)
        is TonTransactionTypeGiftPurchaseOffer -> return serialize(dto = dto)
        is TonTransactionTypeUpgradedGiftPurchase -> return serialize(dto = dto)
        is TonTransactionTypeUpgradedGiftSale -> return serialize(dto = dto)
        is TonTransactionTypeStakeDiceStake -> return serialize(dto = dto)
        is TonTransactionTypeStakeDicePayout -> return serialize(dto = dto)
        is TonTransactionTypeUnsupported -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ActiveStoryState): JsonElement {
    when(dto) {
        is ActiveStoryStateLive -> return serialize(dto = dto)
        is ActiveStoryStateUnread -> return serialize(dto = dto)
        is ActiveStoryStateRead -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: GiveawayParticipantStatus): JsonElement {
    when(dto) {
        is GiveawayParticipantStatusEligible -> return serialize(dto = dto)
        is GiveawayParticipantStatusParticipating -> return serialize(dto = dto)
        is GiveawayParticipantStatusAlreadyWasMember -> return serialize(dto = dto)
        is GiveawayParticipantStatusAdministrator -> return serialize(dto = dto)
        is GiveawayParticipantStatusDisallowedCountry -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: GiveawayInfo): JsonElement {
    when(dto) {
        is GiveawayInfoOngoing -> return serialize(dto = dto)
        is GiveawayInfoCompleted -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: GiveawayPrize): JsonElement {
    when(dto) {
        is GiveawayPrizePremium -> return serialize(dto = dto)
        is GiveawayPrizeStars -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: CommunityMemberStatus): JsonElement {
    when(dto) {
        is CommunityMemberStatusCreator -> return serialize(dto = dto)
        is CommunityMemberStatusAdministrator -> return serialize(dto = dto)
        is CommunityMemberStatusMember -> return serialize(dto = dto)
        is CommunityMemberStatusLeft -> return serialize(dto = dto)
        is CommunityMemberStatusBanned -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: EmojiStatusType): JsonElement {
    when(dto) {
        is EmojiStatusTypeCustomEmoji -> return serialize(dto = dto)
        is EmojiStatusTypeUpgradedGift -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ChatMemberStatus): JsonElement {
    when(dto) {
        is ChatMemberStatusCreator -> return serialize(dto = dto)
        is ChatMemberStatusAdministrator -> return serialize(dto = dto)
        is ChatMemberStatusMember -> return serialize(dto = dto)
        is ChatMemberStatusRestricted -> return serialize(dto = dto)
        is ChatMemberStatusLeft -> return serialize(dto = dto)
        is ChatMemberStatusBanned -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ChatMembersFilter): JsonElement {
    when(dto) {
        is ChatMembersFilterContacts -> return serialize(dto = dto)
        is ChatMembersFilterAdministrators -> return serialize(dto = dto)
        is ChatMembersFilterMembers -> return serialize(dto = dto)
        is ChatMembersFilterMention -> return serialize(dto = dto)
        is ChatMembersFilterRestricted -> return serialize(dto = dto)
        is ChatMembersFilterBanned -> return serialize(dto = dto)
        is ChatMembersFilterBots -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: SupergroupMembersFilter): JsonElement {
    when(dto) {
        is SupergroupMembersFilterRecent -> return serialize(dto = dto)
        is SupergroupMembersFilterContacts -> return serialize(dto = dto)
        is SupergroupMembersFilterAdministrators -> return serialize(dto = dto)
        is SupergroupMembersFilterSearch -> return serialize(dto = dto)
        is SupergroupMembersFilterRestricted -> return serialize(dto = dto)
        is SupergroupMembersFilterBanned -> return serialize(dto = dto)
        is SupergroupMembersFilterMention -> return serialize(dto = dto)
        is SupergroupMembersFilterBots -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ChatJoinResult): JsonElement {
    when(dto) {
        is ChatJoinResultSuccess -> return serialize(dto = dto)
        is ChatJoinResultRequestSent -> return serialize(dto = dto)
        is ChatJoinResultGuardBotApprovalRequired -> return serialize(dto = dto)
        is ChatJoinResultDeclined -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ChatJoinRequestResult): JsonElement {
    when(dto) {
        is ChatJoinRequestResultApproved -> return serialize(dto = dto)
        is ChatJoinRequestResultDeclined -> return serialize(dto = dto)
        is ChatJoinRequestResultQueued -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: InviteLinkChatType): JsonElement {
    when(dto) {
        is InviteLinkChatTypeBasicGroup -> return serialize(dto = dto)
        is InviteLinkChatTypeSupergroup -> return serialize(dto = dto)
        is InviteLinkChatTypeChannel -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: SecretChatState): JsonElement {
    when(dto) {
        is SecretChatStatePending -> return serialize(dto = dto)
        is SecretChatStateReady -> return serialize(dto = dto)
        is SecretChatStateClosed -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: MessageSender): JsonElement {
    when(dto) {
        is MessageSenderUser -> return serialize(dto = dto)
        is MessageSenderChat -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: MessageReadDate): JsonElement {
    when(dto) {
        is MessageReadDateRead -> return serialize(dto = dto)
        is MessageReadDateUnread -> return serialize(dto = dto)
        is MessageReadDateTooOld -> return serialize(dto = dto)
        is MessageReadDateUserPrivacyRestricted -> return serialize(dto = dto)
        is MessageReadDateMyPrivacyRestricted -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: MessageOrigin): JsonElement {
    when(dto) {
        is MessageOriginUser -> return serialize(dto = dto)
        is MessageOriginHiddenUser -> return serialize(dto = dto)
        is MessageOriginChat -> return serialize(dto = dto)
        is MessageOriginChannel -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ReactionType): JsonElement {
    when(dto) {
        is ReactionTypeEmoji -> return serialize(dto = dto)
        is ReactionTypeCustomEmoji -> return serialize(dto = dto)
        is ReactionTypePaid -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: PaidReactionType): JsonElement {
    when(dto) {
        is PaidReactionTypeRegular -> return serialize(dto = dto)
        is PaidReactionTypeAnonymous -> return serialize(dto = dto)
        is PaidReactionTypeChat -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: MessageTopic): JsonElement {
    when(dto) {
        is MessageTopicThread -> return serialize(dto = dto)
        is MessageTopicForum -> return serialize(dto = dto)
        is MessageTopicDirectMessages -> return serialize(dto = dto)
        is MessageTopicSavedMessages -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: MessageEffectType): JsonElement {
    when(dto) {
        is MessageEffectTypeEmojiReaction -> return serialize(dto = dto)
        is MessageEffectTypePremiumSticker -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: MessageSendingState): JsonElement {
    when(dto) {
        is MessageSendingStatePending -> return serialize(dto = dto)
        is MessageSendingStateFailed -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: MessageReplyTo): JsonElement {
    when(dto) {
        is MessageReplyToMessage -> return serialize(dto = dto)
        is MessageReplyToStory -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: InputMessageReplyTo): JsonElement {
    when(dto) {
        is InputMessageReplyToMessage -> return serialize(dto = dto)
        is InputMessageReplyToExternalMessage -> return serialize(dto = dto)
        is InputMessageReplyToStory -> return serialize(dto = dto)
        is InputMessageReplyToEphemeralMessage -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: MessageSource): JsonElement {
    when(dto) {
        is MessageSourceChatHistory -> return serialize(dto = dto)
        is MessageSourceMessageThreadHistory -> return serialize(dto = dto)
        is MessageSourceForumTopicHistory -> return serialize(dto = dto)
        is MessageSourceDirectMessagesChatTopicHistory -> return serialize(dto = dto)
        is MessageSourceHistoryPreview -> return serialize(dto = dto)
        is MessageSourceChatList -> return serialize(dto = dto)
        is MessageSourceSearch -> return serialize(dto = dto)
        is MessageSourceChatEventLog -> return serialize(dto = dto)
        is MessageSourceNotification -> return serialize(dto = dto)
        is MessageSourceScreenshot -> return serialize(dto = dto)
        is MessageSourceOther -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ReportSponsoredResult): JsonElement {
    when(dto) {
        is ReportSponsoredResultOk -> return serialize(dto = dto)
        is ReportSponsoredResultFailed -> return serialize(dto = dto)
        is ReportSponsoredResultOptionRequired -> return serialize(dto = dto)
        is ReportSponsoredResultAdsHidden -> return serialize(dto = dto)
        is ReportSponsoredResultPremiumRequired -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: NotificationSettingsScope): JsonElement {
    when(dto) {
        is NotificationSettingsScopePrivateChats -> return serialize(dto = dto)
        is NotificationSettingsScopeGroupChats -> return serialize(dto = dto)
        is NotificationSettingsScopeChannelChats -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ReactionNotificationSource): JsonElement {
    when(dto) {
        is ReactionNotificationSourceNone -> return serialize(dto = dto)
        is ReactionNotificationSourceContacts -> return serialize(dto = dto)
        is ReactionNotificationSourceAll -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: DraftMessageContent): JsonElement {
    when(dto) {
        is DraftMessageContentText -> return serialize(dto = dto)
        is DraftMessageContentRichMessage -> return serialize(dto = dto)
        is DraftMessageContentVideoNote -> return serialize(dto = dto)
        is DraftMessageContentVoiceNote -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ChatType): JsonElement {
    when(dto) {
        is ChatTypePrivate -> return serialize(dto = dto)
        is ChatTypeBasicGroup -> return serialize(dto = dto)
        is ChatTypeSupergroup -> return serialize(dto = dto)
        is ChatTypeSecret -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ChatList): JsonElement {
    when(dto) {
        is ChatListMain -> return serialize(dto = dto)
        is ChatListArchive -> return serialize(dto = dto)
        is ChatListFolder -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ChatSource): JsonElement {
    when(dto) {
        is ChatSourceMtprotoProxy -> return serialize(dto = dto)
        is ChatSourcePublicServiceAnnouncement -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ChatAvailableReactions): JsonElement {
    when(dto) {
        is ChatAvailableReactionsAll -> return serialize(dto = dto)
        is ChatAvailableReactionsSome -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: PublicChatType): JsonElement {
    when(dto) {
        is PublicChatTypeHasUsername -> return serialize(dto = dto)
        is PublicChatTypeIsLocationBased -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ChatActionBar): JsonElement {
    when(dto) {
        is ChatActionBarReportSpam -> return serialize(dto = dto)
        is ChatActionBarInviteMembers -> return serialize(dto = dto)
        is ChatActionBarReportAddBlock -> return serialize(dto = dto)
        is ChatActionBarAddContact -> return serialize(dto = dto)
        is ChatActionBarSharePhoneNumber -> return serialize(dto = dto)
        is ChatActionBarJoinRequest -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ButtonStyle): JsonElement {
    when(dto) {
        is ButtonStyleDefault -> return serialize(dto = dto)
        is ButtonStylePrimary -> return serialize(dto = dto)
        is ButtonStyleDanger -> return serialize(dto = dto)
        is ButtonStyleSuccess -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: KeyboardButtonType): JsonElement {
    when(dto) {
        is KeyboardButtonTypeText -> return serialize(dto = dto)
        is KeyboardButtonTypeRequestPhoneNumber -> return serialize(dto = dto)
        is KeyboardButtonTypeRequestLocation -> return serialize(dto = dto)
        is KeyboardButtonTypeRequestPoll -> return serialize(dto = dto)
        is KeyboardButtonTypeRequestUsers -> return serialize(dto = dto)
        is KeyboardButtonTypeRequestChat -> return serialize(dto = dto)
        is KeyboardButtonTypeRequestManagedBot -> return serialize(dto = dto)
        is KeyboardButtonTypeWebApp -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: InlineKeyboardButtonType): JsonElement {
    when(dto) {
        is InlineKeyboardButtonTypeUrl -> return serialize(dto = dto)
        is InlineKeyboardButtonTypeLoginUrl -> return serialize(dto = dto)
        is InlineKeyboardButtonTypeWebApp -> return serialize(dto = dto)
        is InlineKeyboardButtonTypeCallback -> return serialize(dto = dto)
        is InlineKeyboardButtonTypeCallbackWithPassword -> return serialize(dto = dto)
        is InlineKeyboardButtonTypeCallbackGame -> return serialize(dto = dto)
        is InlineKeyboardButtonTypeSwitchInline -> return serialize(dto = dto)
        is InlineKeyboardButtonTypeBuy -> return serialize(dto = dto)
        is InlineKeyboardButtonTypeUser -> return serialize(dto = dto)
        is InlineKeyboardButtonTypeCopyText -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: KeyboardButtonSource): JsonElement {
    when(dto) {
        is KeyboardButtonSourceMessage -> return serialize(dto = dto)
        is KeyboardButtonSourceWebApp -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ReplyMarkup): JsonElement {
    when(dto) {
        is ReplyMarkupRemoveKeyboard -> return serialize(dto = dto)
        is ReplyMarkupForceReply -> return serialize(dto = dto)
        is ReplyMarkupShowKeyboard -> return serialize(dto = dto)
        is ReplyMarkupInlineKeyboard -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: LoginUrlInfo): JsonElement {
    when(dto) {
        is LoginUrlInfoOpen -> return serialize(dto = dto)
        is LoginUrlInfoRequestConfirmation -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: SavedMessagesTopicType): JsonElement {
    when(dto) {
        is SavedMessagesTopicTypeMyNotes -> return serialize(dto = dto)
        is SavedMessagesTopicTypeAuthorHidden -> return serialize(dto = dto)
        is SavedMessagesTopicTypeSavedFromChat -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: BuiltInTheme): JsonElement {
    when(dto) {
        is BuiltInThemeClassic -> return serialize(dto = dto)
        is BuiltInThemeDay -> return serialize(dto = dto)
        is BuiltInThemeNight -> return serialize(dto = dto)
        is BuiltInThemeTinted -> return serialize(dto = dto)
        is BuiltInThemeArctic -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: RichText): JsonElement {
    when(dto) {
        is RichTextPlain -> return serialize(dto = dto)
        is RichTextBold -> return serialize(dto = dto)
        is RichTextItalic -> return serialize(dto = dto)
        is RichTextUnderline -> return serialize(dto = dto)
        is RichTextStrikethrough -> return serialize(dto = dto)
        is RichTextSpoiler -> return serialize(dto = dto)
        is RichTextSubscript -> return serialize(dto = dto)
        is RichTextSuperscript -> return serialize(dto = dto)
        is RichTextMarked -> return serialize(dto = dto)
        is RichTextDateTime -> return serialize(dto = dto)
        is RichTextMention -> return serialize(dto = dto)
        is RichTextHashtag -> return serialize(dto = dto)
        is RichTextCashtag -> return serialize(dto = dto)
        is RichTextBankCardNumber -> return serialize(dto = dto)
        is RichTextBotCommand -> return serialize(dto = dto)
        is RichTextFixed -> return serialize(dto = dto)
        is RichTextMentionName -> return serialize(dto = dto)
        is RichTextUrl -> return serialize(dto = dto)
        is RichTextEmailAddress -> return serialize(dto = dto)
        is RichTextPhoneNumber -> return serialize(dto = dto)
        is RichTextCustomEmoji -> return serialize(dto = dto)
        is RichTextIcon -> return serialize(dto = dto)
        is RichTextMathematicalExpression -> return serialize(dto = dto)
        is RichTextDiff -> return serialize(dto = dto)
        is RichTextReference -> return serialize(dto = dto)
        is RichTextReferenceLink -> return serialize(dto = dto)
        is RichTextAnchor -> return serialize(dto = dto)
        is RichTextAnchorLink -> return serialize(dto = dto)
        is RichTexts -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: PageBlockHorizontalAlignment): JsonElement {
    when(dto) {
        is PageBlockHorizontalAlignmentLeft -> return serialize(dto = dto)
        is PageBlockHorizontalAlignmentCenter -> return serialize(dto = dto)
        is PageBlockHorizontalAlignmentRight -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: PageBlockVerticalAlignment): JsonElement {
    when(dto) {
        is PageBlockVerticalAlignmentTop -> return serialize(dto = dto)
        is PageBlockVerticalAlignmentMiddle -> return serialize(dto = dto)
        is PageBlockVerticalAlignmentBottom -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: PageBlock): JsonElement {
    when(dto) {
        is PageBlockTitle -> return serialize(dto = dto)
        is PageBlockSubtitle -> return serialize(dto = dto)
        is PageBlockAuthorDate -> return serialize(dto = dto)
        is PageBlockHeader -> return serialize(dto = dto)
        is PageBlockSubheader -> return serialize(dto = dto)
        is PageBlockSectionHeading -> return serialize(dto = dto)
        is PageBlockKicker -> return serialize(dto = dto)
        is PageBlockParagraph -> return serialize(dto = dto)
        is PageBlockPreformatted -> return serialize(dto = dto)
        is PageBlockFooter -> return serialize(dto = dto)
        is PageBlockThinking -> return serialize(dto = dto)
        is PageBlockDivider -> return serialize(dto = dto)
        is PageBlockMathematicalExpression -> return serialize(dto = dto)
        is PageBlockAnchor -> return serialize(dto = dto)
        is PageBlockList -> return serialize(dto = dto)
        is PageBlockBlockQuote -> return serialize(dto = dto)
        is PageBlockPullQuote -> return serialize(dto = dto)
        is PageBlockAnimation -> return serialize(dto = dto)
        is PageBlockAudio -> return serialize(dto = dto)
        is PageBlockPhoto -> return serialize(dto = dto)
        is PageBlockVideo -> return serialize(dto = dto)
        is PageBlockVoiceNote -> return serialize(dto = dto)
        is PageBlockCover -> return serialize(dto = dto)
        is PageBlockEmbedded -> return serialize(dto = dto)
        is PageBlockEmbeddedPost -> return serialize(dto = dto)
        is PageBlockCollage -> return serialize(dto = dto)
        is PageBlockSlideshow -> return serialize(dto = dto)
        is PageBlockChatLink -> return serialize(dto = dto)
        is PageBlockTable -> return serialize(dto = dto)
        is PageBlockDetails -> return serialize(dto = dto)
        is PageBlockRelatedArticles -> return serialize(dto = dto)
        is PageBlockMap -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: LinkPreviewAlbumMedia): JsonElement {
    when(dto) {
        is LinkPreviewAlbumMediaPhoto -> return serialize(dto = dto)
        is LinkPreviewAlbumMediaVideo -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: LinkPreviewType): JsonElement {
    when(dto) {
        is LinkPreviewTypeAlbum -> return serialize(dto = dto)
        is LinkPreviewTypeAnimation -> return serialize(dto = dto)
        is LinkPreviewTypeApp -> return serialize(dto = dto)
        is LinkPreviewTypeArticle -> return serialize(dto = dto)
        is LinkPreviewTypeAudio -> return serialize(dto = dto)
        is LinkPreviewTypeBackground -> return serialize(dto = dto)
        is LinkPreviewTypeChannelBoost -> return serialize(dto = dto)
        is LinkPreviewTypeChat -> return serialize(dto = dto)
        is LinkPreviewTypeDirectMessagesChat -> return serialize(dto = dto)
        is LinkPreviewTypeDocument -> return serialize(dto = dto)
        is LinkPreviewTypeEmbeddedAnimationPlayer -> return serialize(dto = dto)
        is LinkPreviewTypeEmbeddedAudioPlayer -> return serialize(dto = dto)
        is LinkPreviewTypeEmbeddedVideoPlayer -> return serialize(dto = dto)
        is LinkPreviewTypeExternalAudio -> return serialize(dto = dto)
        is LinkPreviewTypeExternalVideo -> return serialize(dto = dto)
        is LinkPreviewTypeGiftAuction -> return serialize(dto = dto)
        is LinkPreviewTypeGiftCollection -> return serialize(dto = dto)
        is LinkPreviewTypeGroupCall -> return serialize(dto = dto)
        is LinkPreviewTypeInvoice -> return serialize(dto = dto)
        is LinkPreviewTypeLiveStory -> return serialize(dto = dto)
        is LinkPreviewTypeMessage -> return serialize(dto = dto)
        is LinkPreviewTypePhoto -> return serialize(dto = dto)
        is LinkPreviewTypePremiumGiftCode -> return serialize(dto = dto)
        is LinkPreviewTypeRequestManagedBot -> return serialize(dto = dto)
        is LinkPreviewTypeShareableChatFolder -> return serialize(dto = dto)
        is LinkPreviewTypeSticker -> return serialize(dto = dto)
        is LinkPreviewTypeStickerSet -> return serialize(dto = dto)
        is LinkPreviewTypeStory -> return serialize(dto = dto)
        is LinkPreviewTypeStoryAlbum -> return serialize(dto = dto)
        is LinkPreviewTypeSupergroupBoost -> return serialize(dto = dto)
        is LinkPreviewTypeTextCompositionStyle -> return serialize(dto = dto)
        is LinkPreviewTypeTheme -> return serialize(dto = dto)
        is LinkPreviewTypeUnsupported -> return serialize(dto = dto)
        is LinkPreviewTypeUpgradedGift -> return serialize(dto = dto)
        is LinkPreviewTypeUser -> return serialize(dto = dto)
        is LinkPreviewTypeVideo -> return serialize(dto = dto)
        is LinkPreviewTypeVideoChat -> return serialize(dto = dto)
        is LinkPreviewTypeVideoNote -> return serialize(dto = dto)
        is LinkPreviewTypeVoiceNote -> return serialize(dto = dto)
        is LinkPreviewTypeWebApp -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: CollectibleItemType): JsonElement {
    when(dto) {
        is CollectibleItemTypeUsername -> return serialize(dto = dto)
        is CollectibleItemTypePhoneNumber -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: InputCredentials): JsonElement {
    when(dto) {
        is InputCredentialsSaved -> return serialize(dto = dto)
        is InputCredentialsNew -> return serialize(dto = dto)
        is InputCredentialsApplePay -> return serialize(dto = dto)
        is InputCredentialsGooglePay -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: PaymentProvider): JsonElement {
    when(dto) {
        is PaymentProviderSmartGlocal -> return serialize(dto = dto)
        is PaymentProviderStripe -> return serialize(dto = dto)
        is PaymentProviderOther -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: PaymentFormType): JsonElement {
    when(dto) {
        is PaymentFormTypeRegular -> return serialize(dto = dto)
        is PaymentFormTypeStars -> return serialize(dto = dto)
        is PaymentFormTypeStarSubscription -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: PaymentReceiptType): JsonElement {
    when(dto) {
        is PaymentReceiptTypeRegular -> return serialize(dto = dto)
        is PaymentReceiptTypeStars -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: InputInvoice): JsonElement {
    when(dto) {
        is InputInvoiceMessage -> return serialize(dto = dto)
        is InputInvoiceName -> return serialize(dto = dto)
        is InputInvoiceTelegram -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: PaidMedia): JsonElement {
    when(dto) {
        is PaidMediaPreview -> return serialize(dto = dto)
        is PaidMediaPhoto -> return serialize(dto = dto)
        is PaidMediaVideo -> return serialize(dto = dto)
        is PaidMediaUnsupported -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: PassportElementType): JsonElement {
    when(dto) {
        is PassportElementTypePersonalDetails -> return serialize(dto = dto)
        is PassportElementTypePassport -> return serialize(dto = dto)
        is PassportElementTypeDriverLicense -> return serialize(dto = dto)
        is PassportElementTypeIdentityCard -> return serialize(dto = dto)
        is PassportElementTypeInternalPassport -> return serialize(dto = dto)
        is PassportElementTypeAddress -> return serialize(dto = dto)
        is PassportElementTypeUtilityBill -> return serialize(dto = dto)
        is PassportElementTypeBankStatement -> return serialize(dto = dto)
        is PassportElementTypeRentalAgreement -> return serialize(dto = dto)
        is PassportElementTypePassportRegistration -> return serialize(dto = dto)
        is PassportElementTypeTemporaryRegistration -> return serialize(dto = dto)
        is PassportElementTypePhoneNumber -> return serialize(dto = dto)
        is PassportElementTypeEmailAddress -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: PassportElement): JsonElement {
    when(dto) {
        is PassportElementPersonalDetails -> return serialize(dto = dto)
        is PassportElementPassport -> return serialize(dto = dto)
        is PassportElementDriverLicense -> return serialize(dto = dto)
        is PassportElementIdentityCard -> return serialize(dto = dto)
        is PassportElementInternalPassport -> return serialize(dto = dto)
        is PassportElementAddress -> return serialize(dto = dto)
        is PassportElementUtilityBill -> return serialize(dto = dto)
        is PassportElementBankStatement -> return serialize(dto = dto)
        is PassportElementRentalAgreement -> return serialize(dto = dto)
        is PassportElementPassportRegistration -> return serialize(dto = dto)
        is PassportElementTemporaryRegistration -> return serialize(dto = dto)
        is PassportElementPhoneNumber -> return serialize(dto = dto)
        is PassportElementEmailAddress -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: InputPassportElement): JsonElement {
    when(dto) {
        is InputPassportElementPersonalDetails -> return serialize(dto = dto)
        is InputPassportElementPassport -> return serialize(dto = dto)
        is InputPassportElementDriverLicense -> return serialize(dto = dto)
        is InputPassportElementIdentityCard -> return serialize(dto = dto)
        is InputPassportElementInternalPassport -> return serialize(dto = dto)
        is InputPassportElementAddress -> return serialize(dto = dto)
        is InputPassportElementUtilityBill -> return serialize(dto = dto)
        is InputPassportElementBankStatement -> return serialize(dto = dto)
        is InputPassportElementRentalAgreement -> return serialize(dto = dto)
        is InputPassportElementPassportRegistration -> return serialize(dto = dto)
        is InputPassportElementTemporaryRegistration -> return serialize(dto = dto)
        is InputPassportElementPhoneNumber -> return serialize(dto = dto)
        is InputPassportElementEmailAddress -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: PassportElementErrorSource): JsonElement {
    when(dto) {
        is PassportElementErrorSourceUnspecified -> return serialize(dto = dto)
        is PassportElementErrorSourceDataField -> return serialize(dto = dto)
        is PassportElementErrorSourceFrontSide -> return serialize(dto = dto)
        is PassportElementErrorSourceReverseSide -> return serialize(dto = dto)
        is PassportElementErrorSourceSelfie -> return serialize(dto = dto)
        is PassportElementErrorSourceTranslationFile -> return serialize(dto = dto)
        is PassportElementErrorSourceTranslationFiles -> return serialize(dto = dto)
        is PassportElementErrorSourceFile -> return serialize(dto = dto)
        is PassportElementErrorSourceFiles -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: InputPassportElementErrorSource): JsonElement {
    when(dto) {
        is InputPassportElementErrorSourceUnspecified -> return serialize(dto = dto)
        is InputPassportElementErrorSourceDataField -> return serialize(dto = dto)
        is InputPassportElementErrorSourceFrontSide -> return serialize(dto = dto)
        is InputPassportElementErrorSourceReverseSide -> return serialize(dto = dto)
        is InputPassportElementErrorSourceSelfie -> return serialize(dto = dto)
        is InputPassportElementErrorSourceTranslationFile -> return serialize(dto = dto)
        is InputPassportElementErrorSourceTranslationFiles -> return serialize(dto = dto)
        is InputPassportElementErrorSourceFile -> return serialize(dto = dto)
        is InputPassportElementErrorSourceFiles -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: PollMedia): JsonElement {
    when(dto) {
        is PollMediaAnimation -> return serialize(dto = dto)
        is PollMediaAudio -> return serialize(dto = dto)
        is PollMediaDocument -> return serialize(dto = dto)
        is PollMediaLink -> return serialize(dto = dto)
        is PollMediaLocation -> return serialize(dto = dto)
        is PollMediaPhoto -> return serialize(dto = dto)
        is PollMediaSticker -> return serialize(dto = dto)
        is PollMediaVenue -> return serialize(dto = dto)
        is PollMediaVideo -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: MessageContent): JsonElement {
    when(dto) {
        is MessageText -> return serialize(dto = dto)
        is MessageRichMessage -> return serialize(dto = dto)
        is MessageAnimation -> return serialize(dto = dto)
        is MessageAudio -> return serialize(dto = dto)
        is MessageDocument -> return serialize(dto = dto)
        is MessagePaidMedia -> return serialize(dto = dto)
        is MessagePhoto -> return serialize(dto = dto)
        is MessageSticker -> return serialize(dto = dto)
        is MessageVideo -> return serialize(dto = dto)
        is MessageVideoNote -> return serialize(dto = dto)
        is MessageVoiceNote -> return serialize(dto = dto)
        is MessageExpiredPhoto -> return serialize(dto = dto)
        is MessageExpiredVideo -> return serialize(dto = dto)
        is MessageExpiredVideoNote -> return serialize(dto = dto)
        is MessageExpiredVoiceNote -> return serialize(dto = dto)
        is MessageLiveLocation -> return serialize(dto = dto)
        is MessageLocation -> return serialize(dto = dto)
        is MessageVenue -> return serialize(dto = dto)
        is MessageContact -> return serialize(dto = dto)
        is MessageAnimatedEmoji -> return serialize(dto = dto)
        is MessageDice -> return serialize(dto = dto)
        is MessageGame -> return serialize(dto = dto)
        is MessagePoll -> return serialize(dto = dto)
        is MessageStakeDice -> return serialize(dto = dto)
        is MessageStory -> return serialize(dto = dto)
        is MessageChecklist -> return serialize(dto = dto)
        is MessageInvoice -> return serialize(dto = dto)
        is MessageCall -> return serialize(dto = dto)
        is MessageGroupCall -> return serialize(dto = dto)
        is MessageVideoChatScheduled -> return serialize(dto = dto)
        is MessageVideoChatStarted -> return serialize(dto = dto)
        is MessageVideoChatEnded -> return serialize(dto = dto)
        is MessageInviteVideoChatParticipants -> return serialize(dto = dto)
        is MessagePollOptionAdded -> return serialize(dto = dto)
        is MessagePollOptionDeleted -> return serialize(dto = dto)
        is MessageBasicGroupChatCreate -> return serialize(dto = dto)
        is MessageSupergroupChatCreate -> return serialize(dto = dto)
        is MessageChatChangeTitle -> return serialize(dto = dto)
        is MessageChatChangePhoto -> return serialize(dto = dto)
        is MessageChatDeletePhoto -> return serialize(dto = dto)
        is MessageChatOwnerLeft -> return serialize(dto = dto)
        is MessageChatOwnerChanged -> return serialize(dto = dto)
        is MessageChatHasProtectedContentToggled -> return serialize(dto = dto)
        is MessageChatHasProtectedContentDisableRequested -> return serialize(dto = dto)
        is MessageChatAddMembers -> return serialize(dto = dto)
        is MessageChatJoinByLink -> return serialize(dto = dto)
        is MessageChatJoinByRequest -> return serialize(dto = dto)
        is MessageChatDeleteMember -> return serialize(dto = dto)
        is MessageChatAddedToCommunity -> return serialize(dto = dto)
        is MessageChatRemovedFromCommunity -> return serialize(dto = dto)
        is MessageChatUpgradeTo -> return serialize(dto = dto)
        is MessageChatUpgradeFrom -> return serialize(dto = dto)
        is MessagePinMessage -> return serialize(dto = dto)
        is MessageScreenshotTaken -> return serialize(dto = dto)
        is MessageChatSetBackground -> return serialize(dto = dto)
        is MessageChatSetTheme -> return serialize(dto = dto)
        is MessageChatSetMessageAutoDeleteTime -> return serialize(dto = dto)
        is MessageChatBoost -> return serialize(dto = dto)
        is MessageForumTopicCreated -> return serialize(dto = dto)
        is MessageForumTopicEdited -> return serialize(dto = dto)
        is MessageForumTopicIsClosedToggled -> return serialize(dto = dto)
        is MessageForumTopicIsHiddenToggled -> return serialize(dto = dto)
        is MessageSuggestProfilePhoto -> return serialize(dto = dto)
        is MessageSuggestBirthdate -> return serialize(dto = dto)
        is MessageCustomServiceAction -> return serialize(dto = dto)
        is MessageGameScore -> return serialize(dto = dto)
        is MessageManagedBotCreated -> return serialize(dto = dto)
        is MessagePaymentSuccessful -> return serialize(dto = dto)
        is MessagePaymentSuccessfulBot -> return serialize(dto = dto)
        is MessagePaymentRefunded -> return serialize(dto = dto)
        is MessageGiftedPremium -> return serialize(dto = dto)
        is MessagePremiumGiftCode -> return serialize(dto = dto)
        is MessageGiveawayCreated -> return serialize(dto = dto)
        is MessageGiveaway -> return serialize(dto = dto)
        is MessageGiveawayCompleted -> return serialize(dto = dto)
        is MessageGiveawayWinners -> return serialize(dto = dto)
        is MessageGiftedStars -> return serialize(dto = dto)
        is MessageGiftedTon -> return serialize(dto = dto)
        is MessageGiveawayPrizeStars -> return serialize(dto = dto)
        is MessageGift -> return serialize(dto = dto)
        is MessageUpgradedGift -> return serialize(dto = dto)
        is MessageRefundedUpgradedGift -> return serialize(dto = dto)
        is MessageUpgradedGiftPurchaseOffer -> return serialize(dto = dto)
        is MessageUpgradedGiftPurchaseOfferRejected -> return serialize(dto = dto)
        is MessagePaidMessagesRefunded -> return serialize(dto = dto)
        is MessagePaidMessagePriceChanged -> return serialize(dto = dto)
        is MessageDirectMessagePriceChanged -> return serialize(dto = dto)
        is MessageChecklistTasksDone -> return serialize(dto = dto)
        is MessageChecklistTasksAdded -> return serialize(dto = dto)
        is MessageSuggestedPostApprovalFailed -> return serialize(dto = dto)
        is MessageSuggestedPostApproved -> return serialize(dto = dto)
        is MessageSuggestedPostDeclined -> return serialize(dto = dto)
        is MessageSuggestedPostPaid -> return serialize(dto = dto)
        is MessageSuggestedPostRefunded -> return serialize(dto = dto)
        is MessageContactRegistered -> return serialize(dto = dto)
        is MessageUsersShared -> return serialize(dto = dto)
        is MessageChatShared -> return serialize(dto = dto)
        is MessageBotWriteAccessAllowed -> return serialize(dto = dto)
        is MessageWebAppDataSent -> return serialize(dto = dto)
        is MessageWebAppDataReceived -> return serialize(dto = dto)
        is MessagePassportDataSent -> return serialize(dto = dto)
        is MessagePassportDataReceived -> return serialize(dto = dto)
        is MessageProximityAlertTriggered -> return serialize(dto = dto)
        is MessageUnsupported -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: DateTimePartPrecision): JsonElement {
    when(dto) {
        is DateTimePartPrecisionNone -> return serialize(dto = dto)
        is DateTimePartPrecisionShort -> return serialize(dto = dto)
        is DateTimePartPrecisionLong -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: DateTimeFormattingType): JsonElement {
    when(dto) {
        is DateTimeFormattingTypeRelative -> return serialize(dto = dto)
        is DateTimeFormattingTypeAbsolute -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: TextEntityType): JsonElement {
    when(dto) {
        is TextEntityTypeMention -> return serialize(dto = dto)
        is TextEntityTypeHashtag -> return serialize(dto = dto)
        is TextEntityTypeCashtag -> return serialize(dto = dto)
        is TextEntityTypeBotCommand -> return serialize(dto = dto)
        is TextEntityTypeUrl -> return serialize(dto = dto)
        is TextEntityTypeEmailAddress -> return serialize(dto = dto)
        is TextEntityTypePhoneNumber -> return serialize(dto = dto)
        is TextEntityTypeBankCardNumber -> return serialize(dto = dto)
        is TextEntityTypeBold -> return serialize(dto = dto)
        is TextEntityTypeItalic -> return serialize(dto = dto)
        is TextEntityTypeUnderline -> return serialize(dto = dto)
        is TextEntityTypeStrikethrough -> return serialize(dto = dto)
        is TextEntityTypeSpoiler -> return serialize(dto = dto)
        is TextEntityTypeCode -> return serialize(dto = dto)
        is TextEntityTypePre -> return serialize(dto = dto)
        is TextEntityTypePreCode -> return serialize(dto = dto)
        is TextEntityTypeBlockQuote -> return serialize(dto = dto)
        is TextEntityTypeExpandableBlockQuote -> return serialize(dto = dto)
        is TextEntityTypeTextUrl -> return serialize(dto = dto)
        is TextEntityTypeMentionName -> return serialize(dto = dto)
        is TextEntityTypeCustomEmoji -> return serialize(dto = dto)
        is TextEntityTypeMediaTimestamp -> return serialize(dto = dto)
        is TextEntityTypeDateTime -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: DiffEntityType): JsonElement {
    when(dto) {
        is DiffEntityTypeInsert -> return serialize(dto = dto)
        is DiffEntityTypeReplace -> return serialize(dto = dto)
        is DiffEntityTypeDelete -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: InputPaidMediaType): JsonElement {
    when(dto) {
        is InputPaidMediaTypePhoto -> return serialize(dto = dto)
        is InputPaidMediaTypeVideo -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: MessageSchedulingState): JsonElement {
    when(dto) {
        is MessageSchedulingStateSendAtDate -> return serialize(dto = dto)
        is MessageSchedulingStateSendWhenOnline -> return serialize(dto = dto)
        is MessageSchedulingStateSendWhenVideoProcessed -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: MessageSelfDestructType): JsonElement {
    when(dto) {
        is MessageSelfDestructTypeTimer -> return serialize(dto = dto)
        is MessageSelfDestructTypeImmediately -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: InputPollMedia): JsonElement {
    when(dto) {
        is InputPollMediaAnimation -> return serialize(dto = dto)
        is InputPollMediaAudio -> return serialize(dto = dto)
        is InputPollMediaDocument -> return serialize(dto = dto)
        is InputPollMediaLink -> return serialize(dto = dto)
        is InputPollMediaLocation -> return serialize(dto = dto)
        is InputPollMediaPhoto -> return serialize(dto = dto)
        is InputPollMediaSticker -> return serialize(dto = dto)
        is InputPollMediaVenue -> return serialize(dto = dto)
        is InputPollMediaVideo -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: InputPageBlock): JsonElement {
    when(dto) {
        is InputPageBlockSectionHeading -> return serialize(dto = dto)
        is InputPageBlockParagraph -> return serialize(dto = dto)
        is InputPageBlockPreformatted -> return serialize(dto = dto)
        is InputPageBlockFooter -> return serialize(dto = dto)
        is InputPageBlockThinking -> return serialize(dto = dto)
        is InputPageBlockDivider -> return serialize(dto = dto)
        is InputPageBlockMathematicalExpression -> return serialize(dto = dto)
        is InputPageBlockAnchor -> return serialize(dto = dto)
        is InputPageBlockList -> return serialize(dto = dto)
        is InputPageBlockBlockQuote -> return serialize(dto = dto)
        is InputPageBlockPullQuote -> return serialize(dto = dto)
        is InputPageBlockAnimation -> return serialize(dto = dto)
        is InputPageBlockAudio -> return serialize(dto = dto)
        is InputPageBlockPhoto -> return serialize(dto = dto)
        is InputPageBlockVideo -> return serialize(dto = dto)
        is InputPageBlockVoiceNote -> return serialize(dto = dto)
        is InputPageBlockCollage -> return serialize(dto = dto)
        is InputPageBlockSlideshow -> return serialize(dto = dto)
        is InputPageBlockTable -> return serialize(dto = dto)
        is InputPageBlockDetails -> return serialize(dto = dto)
        is InputPageBlockMap -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: InputMessageContent): JsonElement {
    when(dto) {
        is InputMessageText -> return serialize(dto = dto)
        is InputMessageRichMessage -> return serialize(dto = dto)
        is InputMessageAnimation -> return serialize(dto = dto)
        is InputMessageAudio -> return serialize(dto = dto)
        is InputMessageDocument -> return serialize(dto = dto)
        is InputMessagePaidMedia -> return serialize(dto = dto)
        is InputMessagePhoto -> return serialize(dto = dto)
        is InputMessageSticker -> return serialize(dto = dto)
        is InputMessageVideo -> return serialize(dto = dto)
        is InputMessageVideoNote -> return serialize(dto = dto)
        is InputMessageVoiceNote -> return serialize(dto = dto)
        is InputMessageLiveLocation -> return serialize(dto = dto)
        is InputMessageLocation -> return serialize(dto = dto)
        is InputMessageVenue -> return serialize(dto = dto)
        is InputMessageContact -> return serialize(dto = dto)
        is InputMessageDice -> return serialize(dto = dto)
        is InputMessageGame -> return serialize(dto = dto)
        is InputMessageInvoice -> return serialize(dto = dto)
        is InputMessagePoll -> return serialize(dto = dto)
        is InputMessageStakeDice -> return serialize(dto = dto)
        is InputMessageStory -> return serialize(dto = dto)
        is InputMessageChecklist -> return serialize(dto = dto)
        is InputMessageForwarded -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: SearchMessagesFilter): JsonElement {
    when(dto) {
        is SearchMessagesFilterEmpty -> return serialize(dto = dto)
        is SearchMessagesFilterAnimation -> return serialize(dto = dto)
        is SearchMessagesFilterAudio -> return serialize(dto = dto)
        is SearchMessagesFilterDocument -> return serialize(dto = dto)
        is SearchMessagesFilterPhoto -> return serialize(dto = dto)
        is SearchMessagesFilterPoll -> return serialize(dto = dto)
        is SearchMessagesFilterVideo -> return serialize(dto = dto)
        is SearchMessagesFilterVoiceNote -> return serialize(dto = dto)
        is SearchMessagesFilterPhotoAndVideo -> return serialize(dto = dto)
        is SearchMessagesFilterUrl -> return serialize(dto = dto)
        is SearchMessagesFilterChatPhoto -> return serialize(dto = dto)
        is SearchMessagesFilterVideoNote -> return serialize(dto = dto)
        is SearchMessagesFilterVoiceAndVideoNote -> return serialize(dto = dto)
        is SearchMessagesFilterMention -> return serialize(dto = dto)
        is SearchMessagesFilterUnreadMention -> return serialize(dto = dto)
        is SearchMessagesFilterUnreadReaction -> return serialize(dto = dto)
        is SearchMessagesFilterUnreadPollVote -> return serialize(dto = dto)
        is SearchMessagesFilterFailedToSend -> return serialize(dto = dto)
        is SearchMessagesFilterPinned -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: SearchMessagesChatTypeFilter): JsonElement {
    when(dto) {
        is SearchMessagesChatTypeFilterPrivate -> return serialize(dto = dto)
        is SearchMessagesChatTypeFilterGroup -> return serialize(dto = dto)
        is SearchMessagesChatTypeFilterChannel -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: SearchChatTypeFilter): JsonElement {
    when(dto) {
        is SearchChatTypeFilterBot -> return serialize(dto = dto)
        is SearchChatTypeFilterChannel -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ChatAction): JsonElement {
    when(dto) {
        is ChatActionTyping -> return serialize(dto = dto)
        is ChatActionRecordingVideo -> return serialize(dto = dto)
        is ChatActionUploadingVideo -> return serialize(dto = dto)
        is ChatActionRecordingVoiceNote -> return serialize(dto = dto)
        is ChatActionUploadingVoiceNote -> return serialize(dto = dto)
        is ChatActionUploadingPhoto -> return serialize(dto = dto)
        is ChatActionUploadingDocument -> return serialize(dto = dto)
        is ChatActionChoosingSticker -> return serialize(dto = dto)
        is ChatActionChoosingLocation -> return serialize(dto = dto)
        is ChatActionChoosingContact -> return serialize(dto = dto)
        is ChatActionStartPlayingGame -> return serialize(dto = dto)
        is ChatActionRecordingVideoNote -> return serialize(dto = dto)
        is ChatActionUploadingVideoNote -> return serialize(dto = dto)
        is ChatActionWatchingAnimations -> return serialize(dto = dto)
        is ChatActionCancel -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: UserStatus): JsonElement {
    when(dto) {
        is UserStatusEmpty -> return serialize(dto = dto)
        is UserStatusOnline -> return serialize(dto = dto)
        is UserStatusOffline -> return serialize(dto = dto)
        is UserStatusRecently -> return serialize(dto = dto)
        is UserStatusLastWeek -> return serialize(dto = dto)
        is UserStatusLastMonth -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: EmojiCategorySource): JsonElement {
    when(dto) {
        is EmojiCategorySourceSearch -> return serialize(dto = dto)
        is EmojiCategorySourcePremium -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: EmojiCategoryType): JsonElement {
    when(dto) {
        is EmojiCategoryTypeDefault -> return serialize(dto = dto)
        is EmojiCategoryTypeRegularStickers -> return serialize(dto = dto)
        is EmojiCategoryTypeEmojiStatus -> return serialize(dto = dto)
        is EmojiCategoryTypeChatPhoto -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: StoryAreaType): JsonElement {
    when(dto) {
        is StoryAreaTypeLocation -> return serialize(dto = dto)
        is StoryAreaTypeVenue -> return serialize(dto = dto)
        is StoryAreaTypeSuggestedReaction -> return serialize(dto = dto)
        is StoryAreaTypeMessage -> return serialize(dto = dto)
        is StoryAreaTypeLink -> return serialize(dto = dto)
        is StoryAreaTypeWeather -> return serialize(dto = dto)
        is StoryAreaTypeUpgradedGift -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: InputStoryAreaType): JsonElement {
    when(dto) {
        is InputStoryAreaTypeLocation -> return serialize(dto = dto)
        is InputStoryAreaTypeFoundVenue -> return serialize(dto = dto)
        is InputStoryAreaTypePreviousVenue -> return serialize(dto = dto)
        is InputStoryAreaTypeSuggestedReaction -> return serialize(dto = dto)
        is InputStoryAreaTypeMessage -> return serialize(dto = dto)
        is InputStoryAreaTypeLink -> return serialize(dto = dto)
        is InputStoryAreaTypeWeather -> return serialize(dto = dto)
        is InputStoryAreaTypeUpgradedGift -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: StoryContentType): JsonElement {
    when(dto) {
        is StoryContentTypePhoto -> return serialize(dto = dto)
        is StoryContentTypeVideo -> return serialize(dto = dto)
        is StoryContentTypeLive -> return serialize(dto = dto)
        is StoryContentTypeUnsupported -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: StoryContent): JsonElement {
    when(dto) {
        is StoryContentPhoto -> return serialize(dto = dto)
        is StoryContentVideo -> return serialize(dto = dto)
        is StoryContentLive -> return serialize(dto = dto)
        is StoryContentUnsupported -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: InputStoryContent): JsonElement {
    when(dto) {
        is InputStoryContentPhoto -> return serialize(dto = dto)
        is InputStoryContentVideo -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: StoryList): JsonElement {
    when(dto) {
        is StoryListMain -> return serialize(dto = dto)
        is StoryListArchive -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: StoryOrigin): JsonElement {
    when(dto) {
        is StoryOriginPublicStory -> return serialize(dto = dto)
        is StoryOriginHiddenUser -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: StoryInteractionType): JsonElement {
    when(dto) {
        is StoryInteractionTypeView -> return serialize(dto = dto)
        is StoryInteractionTypeForward -> return serialize(dto = dto)
        is StoryInteractionTypeRepost -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: PublicForward): JsonElement {
    when(dto) {
        is PublicForwardMessage -> return serialize(dto = dto)
        is PublicForwardStory -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ChatBoostSource): JsonElement {
    when(dto) {
        is ChatBoostSourceGiftCode -> return serialize(dto = dto)
        is ChatBoostSourceGiveaway -> return serialize(dto = dto)
        is ChatBoostSourcePremium -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ResendCodeReason): JsonElement {
    when(dto) {
        is ResendCodeReasonUserRequest -> return serialize(dto = dto)
        is ResendCodeReasonVerificationFailed -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: CallDiscardReason): JsonElement {
    when(dto) {
        is CallDiscardReasonEmpty -> return serialize(dto = dto)
        is CallDiscardReasonMissed -> return serialize(dto = dto)
        is CallDiscardReasonDeclined -> return serialize(dto = dto)
        is CallDiscardReasonDisconnected -> return serialize(dto = dto)
        is CallDiscardReasonHungUp -> return serialize(dto = dto)
        is CallDiscardReasonUpgradeToGroupCall -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: CallServerType): JsonElement {
    when(dto) {
        is CallServerTypeTelegramReflector -> return serialize(dto = dto)
        is CallServerTypeWebrtc -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: InputCall): JsonElement {
    when(dto) {
        is InputCallDiscarded -> return serialize(dto = dto)
        is InputCallFromMessage -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: CallState): JsonElement {
    when(dto) {
        is CallStatePending -> return serialize(dto = dto)
        is CallStateExchangingKeys -> return serialize(dto = dto)
        is CallStateReady -> return serialize(dto = dto)
        is CallStateHangingUp -> return serialize(dto = dto)
        is CallStateDiscarded -> return serialize(dto = dto)
        is CallStateError -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: GroupCallVideoQuality): JsonElement {
    when(dto) {
        is GroupCallVideoQualityThumbnail -> return serialize(dto = dto)
        is GroupCallVideoQualityMedium -> return serialize(dto = dto)
        is GroupCallVideoQualityFull -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: InviteGroupCallParticipantResult): JsonElement {
    when(dto) {
        is InviteGroupCallParticipantResultUserPrivacyRestricted -> return serialize(dto = dto)
        is InviteGroupCallParticipantResultUserAlreadyParticipant -> return serialize(dto = dto)
        is InviteGroupCallParticipantResultUserWasBanned -> return serialize(dto = dto)
        is InviteGroupCallParticipantResultSuccess -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: GroupCallDataChannel): JsonElement {
    when(dto) {
        is GroupCallDataChannelMain -> return serialize(dto = dto)
        is GroupCallDataChannelScreenSharing -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: InputGroupCall): JsonElement {
    when(dto) {
        is InputGroupCallLink -> return serialize(dto = dto)
        is InputGroupCallMessage -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: CallProblem): JsonElement {
    when(dto) {
        is CallProblemEcho -> return serialize(dto = dto)
        is CallProblemNoise -> return serialize(dto = dto)
        is CallProblemInterruptions -> return serialize(dto = dto)
        is CallProblemDistortedSpeech -> return serialize(dto = dto)
        is CallProblemSilentLocal -> return serialize(dto = dto)
        is CallProblemSilentRemote -> return serialize(dto = dto)
        is CallProblemDropped -> return serialize(dto = dto)
        is CallProblemDistortedVideo -> return serialize(dto = dto)
        is CallProblemPixelatedVideo -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: FirebaseAuthenticationSettings): JsonElement {
    when(dto) {
        is FirebaseAuthenticationSettingsAndroid -> return serialize(dto = dto)
        is FirebaseAuthenticationSettingsIos -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ReactionUnavailabilityReason): JsonElement {
    when(dto) {
        is ReactionUnavailabilityReasonAnonymousAdministrator -> return serialize(dto = dto)
        is ReactionUnavailabilityReasonGuest -> return serialize(dto = dto)
        is ReactionUnavailabilityReasonRestricted -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: DiceStickers): JsonElement {
    when(dto) {
        is DiceStickersRegular -> return serialize(dto = dto)
        is DiceStickersSlotMachine -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: SpeechRecognitionResult): JsonElement {
    when(dto) {
        is SpeechRecognitionResultPending -> return serialize(dto = dto)
        is SpeechRecognitionResultText -> return serialize(dto = dto)
        is SpeechRecognitionResultError -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: BotWriteAccessAllowReason): JsonElement {
    when(dto) {
        is BotWriteAccessAllowReasonConnectedWebsite -> return serialize(dto = dto)
        is BotWriteAccessAllowReasonAddedToAttachmentMenu -> return serialize(dto = dto)
        is BotWriteAccessAllowReasonLaunchedWebApp -> return serialize(dto = dto)
        is BotWriteAccessAllowReasonAcceptedRequest -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: TargetChat): JsonElement {
    when(dto) {
        is TargetChatCurrent -> return serialize(dto = dto)
        is TargetChatChosen -> return serialize(dto = dto)
        is TargetChatInternalLink -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: InputInlineQueryResult): JsonElement {
    when(dto) {
        is InputInlineQueryResultAnimation -> return serialize(dto = dto)
        is InputInlineQueryResultArticle -> return serialize(dto = dto)
        is InputInlineQueryResultAudio -> return serialize(dto = dto)
        is InputInlineQueryResultContact -> return serialize(dto = dto)
        is InputInlineQueryResultDocument -> return serialize(dto = dto)
        is InputInlineQueryResultGame -> return serialize(dto = dto)
        is InputInlineQueryResultLocation -> return serialize(dto = dto)
        is InputInlineQueryResultPhoto -> return serialize(dto = dto)
        is InputInlineQueryResultSticker -> return serialize(dto = dto)
        is InputInlineQueryResultVenue -> return serialize(dto = dto)
        is InputInlineQueryResultVideo -> return serialize(dto = dto)
        is InputInlineQueryResultVoiceNote -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: InlineQueryResult): JsonElement {
    when(dto) {
        is InlineQueryResultArticle -> return serialize(dto = dto)
        is InlineQueryResultContact -> return serialize(dto = dto)
        is InlineQueryResultLocation -> return serialize(dto = dto)
        is InlineQueryResultVenue -> return serialize(dto = dto)
        is InlineQueryResultGame -> return serialize(dto = dto)
        is InlineQueryResultAnimation -> return serialize(dto = dto)
        is InlineQueryResultAudio -> return serialize(dto = dto)
        is InlineQueryResultDocument -> return serialize(dto = dto)
        is InlineQueryResultPhoto -> return serialize(dto = dto)
        is InlineQueryResultSticker -> return serialize(dto = dto)
        is InlineQueryResultVideo -> return serialize(dto = dto)
        is InlineQueryResultVoiceNote -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: InlineQueryResultsButtonType): JsonElement {
    when(dto) {
        is InlineQueryResultsButtonTypeStartBot -> return serialize(dto = dto)
        is InlineQueryResultsButtonTypeWebApp -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: CallbackQueryPayload): JsonElement {
    when(dto) {
        is CallbackQueryPayloadData -> return serialize(dto = dto)
        is CallbackQueryPayloadDataWithPassword -> return serialize(dto = dto)
        is CallbackQueryPayloadGame -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ChatEventAction): JsonElement {
    when(dto) {
        is ChatEventMessageEdited -> return serialize(dto = dto)
        is ChatEventMessageDeleted -> return serialize(dto = dto)
        is ChatEventMessagePinned -> return serialize(dto = dto)
        is ChatEventMessageUnpinned -> return serialize(dto = dto)
        is ChatEventPollStopped -> return serialize(dto = dto)
        is ChatEventMemberJoined -> return serialize(dto = dto)
        is ChatEventMemberJoinedByInviteLink -> return serialize(dto = dto)
        is ChatEventMemberJoinedByRequest -> return serialize(dto = dto)
        is ChatEventMemberInvited -> return serialize(dto = dto)
        is ChatEventMemberLeft -> return serialize(dto = dto)
        is ChatEventMemberPromoted -> return serialize(dto = dto)
        is ChatEventMemberRestricted -> return serialize(dto = dto)
        is ChatEventMemberTagChanged -> return serialize(dto = dto)
        is ChatEventMemberSubscriptionExtended -> return serialize(dto = dto)
        is ChatEventAvailableReactionsChanged -> return serialize(dto = dto)
        is ChatEventBackgroundChanged -> return serialize(dto = dto)
        is ChatEventDescriptionChanged -> return serialize(dto = dto)
        is ChatEventEmojiStatusChanged -> return serialize(dto = dto)
        is ChatEventLinkedChatChanged -> return serialize(dto = dto)
        is ChatEventLocationChanged -> return serialize(dto = dto)
        is ChatEventMessageAutoDeleteTimeChanged -> return serialize(dto = dto)
        is ChatEventPermissionsChanged -> return serialize(dto = dto)
        is ChatEventPhotoChanged -> return serialize(dto = dto)
        is ChatEventSlowModeDelayChanged -> return serialize(dto = dto)
        is ChatEventStickerSetChanged -> return serialize(dto = dto)
        is ChatEventCustomEmojiStickerSetChanged -> return serialize(dto = dto)
        is ChatEventTitleChanged -> return serialize(dto = dto)
        is ChatEventUsernameChanged -> return serialize(dto = dto)
        is ChatEventActiveUsernamesChanged -> return serialize(dto = dto)
        is ChatEventAccentColorChanged -> return serialize(dto = dto)
        is ChatEventProfileAccentColorChanged -> return serialize(dto = dto)
        is ChatEventHasProtectedContentToggled -> return serialize(dto = dto)
        is ChatEventInvitesToggled -> return serialize(dto = dto)
        is ChatEventIsAllHistoryAvailableToggled -> return serialize(dto = dto)
        is ChatEventHasAggressiveAntiSpamEnabledToggled -> return serialize(dto = dto)
        is ChatEventSignMessagesToggled -> return serialize(dto = dto)
        is ChatEventShowMessageSenderToggled -> return serialize(dto = dto)
        is ChatEventAutomaticTranslationToggled -> return serialize(dto = dto)
        is ChatEventInviteLinkEdited -> return serialize(dto = dto)
        is ChatEventInviteLinkRevoked -> return serialize(dto = dto)
        is ChatEventInviteLinkDeleted -> return serialize(dto = dto)
        is ChatEventVideoChatCreated -> return serialize(dto = dto)
        is ChatEventVideoChatEnded -> return serialize(dto = dto)
        is ChatEventVideoChatMuteNewParticipantsToggled -> return serialize(dto = dto)
        is ChatEventVideoChatParticipantIsMutedToggled -> return serialize(dto = dto)
        is ChatEventVideoChatParticipantVolumeLevelChanged -> return serialize(dto = dto)
        is ChatEventIsForumToggled -> return serialize(dto = dto)
        is ChatEventForumTopicCreated -> return serialize(dto = dto)
        is ChatEventForumTopicEdited -> return serialize(dto = dto)
        is ChatEventForumTopicToggleIsClosed -> return serialize(dto = dto)
        is ChatEventForumTopicToggleIsHidden -> return serialize(dto = dto)
        is ChatEventForumTopicDeleted -> return serialize(dto = dto)
        is ChatEventForumTopicPinned -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: LanguagePackStringValue): JsonElement {
    when(dto) {
        is LanguagePackStringValueOrdinary -> return serialize(dto = dto)
        is LanguagePackStringValuePluralized -> return serialize(dto = dto)
        is LanguagePackStringValueDeleted -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: PremiumLimitType): JsonElement {
    when(dto) {
        is PremiumLimitTypeSupergroupCount -> return serialize(dto = dto)
        is PremiumLimitTypePinnedChatCount -> return serialize(dto = dto)
        is PremiumLimitTypeCreatedPublicChatCount -> return serialize(dto = dto)
        is PremiumLimitTypeSavedAnimationCount -> return serialize(dto = dto)
        is PremiumLimitTypeFavoriteStickerCount -> return serialize(dto = dto)
        is PremiumLimitTypeChatFolderCount -> return serialize(dto = dto)
        is PremiumLimitTypeChatFolderChosenChatCount -> return serialize(dto = dto)
        is PremiumLimitTypePinnedArchivedChatCount -> return serialize(dto = dto)
        is PremiumLimitTypePinnedSavedMessagesTopicCount -> return serialize(dto = dto)
        is PremiumLimitTypeMessageTextLength -> return serialize(dto = dto)
        is PremiumLimitTypeCaptionLength -> return serialize(dto = dto)
        is PremiumLimitTypeBioLength -> return serialize(dto = dto)
        is PremiumLimitTypeChatFolderInviteLinkCount -> return serialize(dto = dto)
        is PremiumLimitTypeShareableChatFolderCount -> return serialize(dto = dto)
        is PremiumLimitTypeActiveStoryCount -> return serialize(dto = dto)
        is PremiumLimitTypeWeeklyPostedStoryCount -> return serialize(dto = dto)
        is PremiumLimitTypeMonthlyPostedStoryCount -> return serialize(dto = dto)
        is PremiumLimitTypeStoryCaptionLength -> return serialize(dto = dto)
        is PremiumLimitTypeStorySuggestedReactionAreaCount -> return serialize(dto = dto)
        is PremiumLimitTypeSimilarChatCount -> return serialize(dto = dto)
        is PremiumLimitTypeOwnedBotCount -> return serialize(dto = dto)
        is PremiumLimitTypeCustomTextCompositionStyleCount -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: PremiumFeature): JsonElement {
    when(dto) {
        is PremiumFeatureIncreasedLimits -> return serialize(dto = dto)
        is PremiumFeatureIncreasedUploadFileSize -> return serialize(dto = dto)
        is PremiumFeatureImprovedDownloadSpeed -> return serialize(dto = dto)
        is PremiumFeatureVoiceRecognition -> return serialize(dto = dto)
        is PremiumFeatureDisabledAds -> return serialize(dto = dto)
        is PremiumFeatureUniqueReactions -> return serialize(dto = dto)
        is PremiumFeatureUniqueStickers -> return serialize(dto = dto)
        is PremiumFeatureCustomEmoji -> return serialize(dto = dto)
        is PremiumFeatureAdvancedChatManagement -> return serialize(dto = dto)
        is PremiumFeatureProfileBadge -> return serialize(dto = dto)
        is PremiumFeatureEmojiStatus -> return serialize(dto = dto)
        is PremiumFeatureAnimatedProfilePhoto -> return serialize(dto = dto)
        is PremiumFeatureForumTopicIcon -> return serialize(dto = dto)
        is PremiumFeatureAppIcons -> return serialize(dto = dto)
        is PremiumFeatureRealTimeChatTranslation -> return serialize(dto = dto)
        is PremiumFeatureUpgradedStories -> return serialize(dto = dto)
        is PremiumFeatureChatBoost -> return serialize(dto = dto)
        is PremiumFeatureAccentColor -> return serialize(dto = dto)
        is PremiumFeatureBackgroundForBoth -> return serialize(dto = dto)
        is PremiumFeatureSavedMessagesTags -> return serialize(dto = dto)
        is PremiumFeatureMessagePrivacy -> return serialize(dto = dto)
        is PremiumFeatureLastSeenTimes -> return serialize(dto = dto)
        is PremiumFeatureBusiness -> return serialize(dto = dto)
        is PremiumFeatureMessageEffects -> return serialize(dto = dto)
        is PremiumFeatureChecklists -> return serialize(dto = dto)
        is PremiumFeaturePaidMessages -> return serialize(dto = dto)
        is PremiumFeatureProtectPrivateChatContent -> return serialize(dto = dto)
        is PremiumFeatureTextComposition -> return serialize(dto = dto)
        is PremiumFeatureRichMessages -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: BusinessFeature): JsonElement {
    when(dto) {
        is BusinessFeatureLocation -> return serialize(dto = dto)
        is BusinessFeatureOpeningHours -> return serialize(dto = dto)
        is BusinessFeatureQuickReplies -> return serialize(dto = dto)
        is BusinessFeatureGreetingMessage -> return serialize(dto = dto)
        is BusinessFeatureAwayMessage -> return serialize(dto = dto)
        is BusinessFeatureAccountLinks -> return serialize(dto = dto)
        is BusinessFeatureStartPage -> return serialize(dto = dto)
        is BusinessFeatureBots -> return serialize(dto = dto)
        is BusinessFeatureEmojiStatus -> return serialize(dto = dto)
        is BusinessFeatureChatFolderTags -> return serialize(dto = dto)
        is BusinessFeatureUpgradedStories -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: PremiumStoryFeature): JsonElement {
    when(dto) {
        is PremiumStoryFeaturePriorityOrder -> return serialize(dto = dto)
        is PremiumStoryFeatureStealthMode -> return serialize(dto = dto)
        is PremiumStoryFeaturePermanentViewsHistory -> return serialize(dto = dto)
        is PremiumStoryFeatureCustomExpirationDuration -> return serialize(dto = dto)
        is PremiumStoryFeatureSaveStories -> return serialize(dto = dto)
        is PremiumStoryFeatureLinksAndFormatting -> return serialize(dto = dto)
        is PremiumStoryFeatureVideoQuality -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: PremiumSource): JsonElement {
    when(dto) {
        is PremiumSourceLimitExceeded -> return serialize(dto = dto)
        is PremiumSourceFeature -> return serialize(dto = dto)
        is PremiumSourceBusinessFeature -> return serialize(dto = dto)
        is PremiumSourceStoryFeature -> return serialize(dto = dto)
        is PremiumSourceLink -> return serialize(dto = dto)
        is PremiumSourceSettings -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: StorePaymentPurpose): JsonElement {
    when(dto) {
        is StorePaymentPurposePremiumSubscription -> return serialize(dto = dto)
        is StorePaymentPurposePremiumGift -> return serialize(dto = dto)
        is StorePaymentPurposePremiumGiftCodes -> return serialize(dto = dto)
        is StorePaymentPurposePremiumGiveaway -> return serialize(dto = dto)
        is StorePaymentPurposeStarGiveaway -> return serialize(dto = dto)
        is StorePaymentPurposeStars -> return serialize(dto = dto)
        is StorePaymentPurposeGiftedStars -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: StoreTransaction): JsonElement {
    when(dto) {
        is StoreTransactionAppStore -> return serialize(dto = dto)
        is StoreTransactionGooglePlay -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: TelegramPaymentPurpose): JsonElement {
    when(dto) {
        is TelegramPaymentPurposePremiumGift -> return serialize(dto = dto)
        is TelegramPaymentPurposePremiumGiftCodes -> return serialize(dto = dto)
        is TelegramPaymentPurposePremiumGiveaway -> return serialize(dto = dto)
        is TelegramPaymentPurposeStars -> return serialize(dto = dto)
        is TelegramPaymentPurposeGiftedStars -> return serialize(dto = dto)
        is TelegramPaymentPurposeStarGiveaway -> return serialize(dto = dto)
        is TelegramPaymentPurposeJoinChat -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: DeviceToken): JsonElement {
    when(dto) {
        is DeviceTokenFirebaseCloudMessaging -> return serialize(dto = dto)
        is DeviceTokenApplePush -> return serialize(dto = dto)
        is DeviceTokenApplePushVoIP -> return serialize(dto = dto)
        is DeviceTokenWindowsPush -> return serialize(dto = dto)
        is DeviceTokenMicrosoftPush -> return serialize(dto = dto)
        is DeviceTokenMicrosoftPushVoIP -> return serialize(dto = dto)
        is DeviceTokenWebPush -> return serialize(dto = dto)
        is DeviceTokenSimplePush -> return serialize(dto = dto)
        is DeviceTokenUbuntuPush -> return serialize(dto = dto)
        is DeviceTokenBlackBerryPush -> return serialize(dto = dto)
        is DeviceTokenTizenPush -> return serialize(dto = dto)
        is DeviceTokenHuaweiPush -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: BackgroundFill): JsonElement {
    when(dto) {
        is BackgroundFillSolid -> return serialize(dto = dto)
        is BackgroundFillGradient -> return serialize(dto = dto)
        is BackgroundFillFreeformGradient -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: BackgroundType): JsonElement {
    when(dto) {
        is BackgroundTypeWallpaper -> return serialize(dto = dto)
        is BackgroundTypePattern -> return serialize(dto = dto)
        is BackgroundTypeFill -> return serialize(dto = dto)
        is BackgroundTypeChatTheme -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: InputBackground): JsonElement {
    when(dto) {
        is InputBackgroundLocal -> return serialize(dto = dto)
        is InputBackgroundRemote -> return serialize(dto = dto)
        is InputBackgroundPrevious -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ChatTheme): JsonElement {
    when(dto) {
        is ChatThemeEmoji -> return serialize(dto = dto)
        is ChatThemeGift -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: InputChatTheme): JsonElement {
    when(dto) {
        is InputChatThemeEmoji -> return serialize(dto = dto)
        is InputChatThemeGift -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: CanPostStoryResult): JsonElement {
    when(dto) {
        is CanPostStoryResultOk -> return serialize(dto = dto)
        is CanPostStoryResultPremiumNeeded -> return serialize(dto = dto)
        is CanPostStoryResultBoostNeeded -> return serialize(dto = dto)
        is CanPostStoryResultActiveStoryLimitExceeded -> return serialize(dto = dto)
        is CanPostStoryResultWeeklyLimitExceeded -> return serialize(dto = dto)
        is CanPostStoryResultMonthlyLimitExceeded -> return serialize(dto = dto)
        is CanPostStoryResultLiveStoryIsActive -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: StartLiveStoryResult): JsonElement {
    when(dto) {
        is StartLiveStoryResultOk -> return serialize(dto = dto)
        is StartLiveStoryResultFail -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: CanTransferOwnershipResult): JsonElement {
    when(dto) {
        is CanTransferOwnershipResultOk -> return serialize(dto = dto)
        is CanTransferOwnershipResultPasswordNeeded -> return serialize(dto = dto)
        is CanTransferOwnershipResultPasswordTooFresh -> return serialize(dto = dto)
        is CanTransferOwnershipResultSessionTooFresh -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: CheckChatUsernameResult): JsonElement {
    when(dto) {
        is CheckChatUsernameResultOk -> return serialize(dto = dto)
        is CheckChatUsernameResultUsernameInvalid -> return serialize(dto = dto)
        is CheckChatUsernameResultUsernameOccupied -> return serialize(dto = dto)
        is CheckChatUsernameResultUsernamePurchasable -> return serialize(dto = dto)
        is CheckChatUsernameResultPublicChatsTooMany -> return serialize(dto = dto)
        is CheckChatUsernameResultPublicGroupsUnavailable -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: CheckStickerSetNameResult): JsonElement {
    when(dto) {
        is CheckStickerSetNameResultOk -> return serialize(dto = dto)
        is CheckStickerSetNameResultNameInvalid -> return serialize(dto = dto)
        is CheckStickerSetNameResultNameOccupied -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ResetPasswordResult): JsonElement {
    when(dto) {
        is ResetPasswordResultOk -> return serialize(dto = dto)
        is ResetPasswordResultPending -> return serialize(dto = dto)
        is ResetPasswordResultDeclined -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: MessageFileType): JsonElement {
    when(dto) {
        is MessageFileTypePrivate -> return serialize(dto = dto)
        is MessageFileTypeGroup -> return serialize(dto = dto)
        is MessageFileTypeUnknown -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: PushMessageContent): JsonElement {
    when(dto) {
        is PushMessageContentHidden -> return serialize(dto = dto)
        is PushMessageContentAnimation -> return serialize(dto = dto)
        is PushMessageContentAudio -> return serialize(dto = dto)
        is PushMessageContentContact -> return serialize(dto = dto)
        is PushMessageContentContactRegistered -> return serialize(dto = dto)
        is PushMessageContentDocument -> return serialize(dto = dto)
        is PushMessageContentGame -> return serialize(dto = dto)
        is PushMessageContentGameScore -> return serialize(dto = dto)
        is PushMessageContentInvoice -> return serialize(dto = dto)
        is PushMessageContentLocation -> return serialize(dto = dto)
        is PushMessageContentPaidMedia -> return serialize(dto = dto)
        is PushMessageContentPhoto -> return serialize(dto = dto)
        is PushMessageContentPoll -> return serialize(dto = dto)
        is PushMessageContentPremiumGiftCode -> return serialize(dto = dto)
        is PushMessageContentGiveaway -> return serialize(dto = dto)
        is PushMessageContentGift -> return serialize(dto = dto)
        is PushMessageContentUpgradedGift -> return serialize(dto = dto)
        is PushMessageContentScreenshotTaken -> return serialize(dto = dto)
        is PushMessageContentSticker -> return serialize(dto = dto)
        is PushMessageContentStory -> return serialize(dto = dto)
        is PushMessageContentText -> return serialize(dto = dto)
        is PushMessageContentChecklist -> return serialize(dto = dto)
        is PushMessageContentVideo -> return serialize(dto = dto)
        is PushMessageContentVideoNote -> return serialize(dto = dto)
        is PushMessageContentVoiceNote -> return serialize(dto = dto)
        is PushMessageContentBasicGroupChatCreate -> return serialize(dto = dto)
        is PushMessageContentVideoChatStarted -> return serialize(dto = dto)
        is PushMessageContentVideoChatEnded -> return serialize(dto = dto)
        is PushMessageContentInviteVideoChatParticipants -> return serialize(dto = dto)
        is PushMessageContentChatAddMembers -> return serialize(dto = dto)
        is PushMessageContentChatChangePhoto -> return serialize(dto = dto)
        is PushMessageContentChatChangeTitle -> return serialize(dto = dto)
        is PushMessageContentChatSetBackground -> return serialize(dto = dto)
        is PushMessageContentChatSetTheme -> return serialize(dto = dto)
        is PushMessageContentChatDeleteMember -> return serialize(dto = dto)
        is PushMessageContentChatJoinByLink -> return serialize(dto = dto)
        is PushMessageContentChatJoinByRequest -> return serialize(dto = dto)
        is PushMessageContentRecurringPayment -> return serialize(dto = dto)
        is PushMessageContentSuggestProfilePhoto -> return serialize(dto = dto)
        is PushMessageContentSuggestBirthdate -> return serialize(dto = dto)
        is PushMessageContentProximityAlertTriggered -> return serialize(dto = dto)
        is PushMessageContentChecklistTasksAdded -> return serialize(dto = dto)
        is PushMessageContentChecklistTasksDone -> return serialize(dto = dto)
        is PushMessageContentPollOptionAdded -> return serialize(dto = dto)
        is PushMessageContentMessageForwards -> return serialize(dto = dto)
        is PushMessageContentMediaAlbum -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: NotificationType): JsonElement {
    when(dto) {
        is NotificationTypeNewMessage -> return serialize(dto = dto)
        is NotificationTypeNewSecretChat -> return serialize(dto = dto)
        is NotificationTypeNewCall -> return serialize(dto = dto)
        is NotificationTypeNewPushMessage -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: NotificationGroupType): JsonElement {
    when(dto) {
        is NotificationGroupTypeMessages -> return serialize(dto = dto)
        is NotificationGroupTypeMentions -> return serialize(dto = dto)
        is NotificationGroupTypeSecretChat -> return serialize(dto = dto)
        is NotificationGroupTypeCalls -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: OptionValue): JsonElement {
    when(dto) {
        is OptionValueBoolean -> return serialize(dto = dto)
        is OptionValueEmpty -> return serialize(dto = dto)
        is OptionValueInteger -> return serialize(dto = dto)
        is OptionValueString -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: JsonValue): JsonElement {
    when(dto) {
        is JsonValueNull -> return serialize(dto = dto)
        is JsonValueBoolean -> return serialize(dto = dto)
        is JsonValueNumber -> return serialize(dto = dto)
        is JsonValueString -> return serialize(dto = dto)
        is JsonValueArray -> return serialize(dto = dto)
        is JsonValueObject -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: StoryPrivacySettings): JsonElement {
    when(dto) {
        is StoryPrivacySettingsEveryone -> return serialize(dto = dto)
        is StoryPrivacySettingsContacts -> return serialize(dto = dto)
        is StoryPrivacySettingsCloseFriends -> return serialize(dto = dto)
        is StoryPrivacySettingsSelectedUsers -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: UserPrivacySettingRule): JsonElement {
    when(dto) {
        is UserPrivacySettingRuleAllowAll -> return serialize(dto = dto)
        is UserPrivacySettingRuleAllowContacts -> return serialize(dto = dto)
        is UserPrivacySettingRuleAllowBots -> return serialize(dto = dto)
        is UserPrivacySettingRuleAllowPremiumUsers -> return serialize(dto = dto)
        is UserPrivacySettingRuleAllowUsers -> return serialize(dto = dto)
        is UserPrivacySettingRuleAllowChatMembers -> return serialize(dto = dto)
        is UserPrivacySettingRuleRestrictAll -> return serialize(dto = dto)
        is UserPrivacySettingRuleRestrictContacts -> return serialize(dto = dto)
        is UserPrivacySettingRuleRestrictBots -> return serialize(dto = dto)
        is UserPrivacySettingRuleRestrictUsers -> return serialize(dto = dto)
        is UserPrivacySettingRuleRestrictChatMembers -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: UserPrivacySetting): JsonElement {
    when(dto) {
        is UserPrivacySettingShowStatus -> return serialize(dto = dto)
        is UserPrivacySettingShowProfilePhoto -> return serialize(dto = dto)
        is UserPrivacySettingShowLinkInForwardedMessages -> return serialize(dto = dto)
        is UserPrivacySettingShowPhoneNumber -> return serialize(dto = dto)
        is UserPrivacySettingShowBio -> return serialize(dto = dto)
        is UserPrivacySettingShowBirthdate -> return serialize(dto = dto)
        is UserPrivacySettingShowProfileAudio -> return serialize(dto = dto)
        is UserPrivacySettingAllowChatInvites -> return serialize(dto = dto)
        is UserPrivacySettingAllowCalls -> return serialize(dto = dto)
        is UserPrivacySettingAllowPeerToPeerCalls -> return serialize(dto = dto)
        is UserPrivacySettingAllowFindingByPhoneNumber -> return serialize(dto = dto)
        is UserPrivacySettingAllowPrivateVoiceAndVideoNoteMessages -> return serialize(dto = dto)
        is UserPrivacySettingAutosaveGifts -> return serialize(dto = dto)
        is UserPrivacySettingAllowUnpaidMessages -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: CanSendMessageToUserResult): JsonElement {
    when(dto) {
        is CanSendMessageToUserResultOk -> return serialize(dto = dto)
        is CanSendMessageToUserResultUserHasPaidMessages -> return serialize(dto = dto)
        is CanSendMessageToUserResultUserIsDeleted -> return serialize(dto = dto)
        is CanSendMessageToUserResultUserRestrictsNewChats -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: SessionType): JsonElement {
    when(dto) {
        is SessionTypeDevice -> return serialize(dto = dto)
        is SessionTypeConnectedBot -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: SessionDeviceType): JsonElement {
    when(dto) {
        is SessionDeviceTypeAndroid -> return serialize(dto = dto)
        is SessionDeviceTypeApple -> return serialize(dto = dto)
        is SessionDeviceTypeBrave -> return serialize(dto = dto)
        is SessionDeviceTypeChrome -> return serialize(dto = dto)
        is SessionDeviceTypeEdge -> return serialize(dto = dto)
        is SessionDeviceTypeFirefox -> return serialize(dto = dto)
        is SessionDeviceTypeIpad -> return serialize(dto = dto)
        is SessionDeviceTypeIphone -> return serialize(dto = dto)
        is SessionDeviceTypeLinux -> return serialize(dto = dto)
        is SessionDeviceTypeMac -> return serialize(dto = dto)
        is SessionDeviceTypeOpera -> return serialize(dto = dto)
        is SessionDeviceTypeSafari -> return serialize(dto = dto)
        is SessionDeviceTypeUbuntu -> return serialize(dto = dto)
        is SessionDeviceTypeUnknown -> return serialize(dto = dto)
        is SessionDeviceTypeVivaldi -> return serialize(dto = dto)
        is SessionDeviceTypeWindows -> return serialize(dto = dto)
        is SessionDeviceTypeXbox -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ReportReason): JsonElement {
    when(dto) {
        is ReportReasonSpam -> return serialize(dto = dto)
        is ReportReasonViolence -> return serialize(dto = dto)
        is ReportReasonPornography -> return serialize(dto = dto)
        is ReportReasonChildAbuse -> return serialize(dto = dto)
        is ReportReasonCopyright -> return serialize(dto = dto)
        is ReportReasonUnrelatedLocation -> return serialize(dto = dto)
        is ReportReasonFake -> return serialize(dto = dto)
        is ReportReasonIllegalDrugs -> return serialize(dto = dto)
        is ReportReasonPersonalDetails -> return serialize(dto = dto)
        is ReportReasonCustom -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ReportChatResult): JsonElement {
    when(dto) {
        is ReportChatResultOk -> return serialize(dto = dto)
        is ReportChatResultOptionRequired -> return serialize(dto = dto)
        is ReportChatResultTextRequired -> return serialize(dto = dto)
        is ReportChatResultMessagesRequired -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ReportStoryResult): JsonElement {
    when(dto) {
        is ReportStoryResultOk -> return serialize(dto = dto)
        is ReportStoryResultOptionRequired -> return serialize(dto = dto)
        is ReportStoryResultTextRequired -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: SettingsSection): JsonElement {
    when(dto) {
        is SettingsSectionAppearance -> return serialize(dto = dto)
        is SettingsSectionAskQuestion -> return serialize(dto = dto)
        is SettingsSectionBusiness -> return serialize(dto = dto)
        is SettingsSectionChatFolders -> return serialize(dto = dto)
        is SettingsSectionDataAndStorage -> return serialize(dto = dto)
        is SettingsSectionDevices -> return serialize(dto = dto)
        is SettingsSectionEditProfile -> return serialize(dto = dto)
        is SettingsSectionFaq -> return serialize(dto = dto)
        is SettingsSectionFeatures -> return serialize(dto = dto)
        is SettingsSectionInAppBrowser -> return serialize(dto = dto)
        is SettingsSectionLanguage -> return serialize(dto = dto)
        is SettingsSectionMyStars -> return serialize(dto = dto)
        is SettingsSectionMyGrams -> return serialize(dto = dto)
        is SettingsSectionNotifications -> return serialize(dto = dto)
        is SettingsSectionPowerSaving -> return serialize(dto = dto)
        is SettingsSectionPremium -> return serialize(dto = dto)
        is SettingsSectionPrivacyAndSecurity -> return serialize(dto = dto)
        is SettingsSectionPrivacyPolicy -> return serialize(dto = dto)
        is SettingsSectionQrCode -> return serialize(dto = dto)
        is SettingsSectionSearch -> return serialize(dto = dto)
        is SettingsSectionSendGift -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: InternalLinkType): JsonElement {
    when(dto) {
        is InternalLinkTypeAttachmentMenuBot -> return serialize(dto = dto)
        is InternalLinkTypeAuthenticationCode -> return serialize(dto = dto)
        is InternalLinkTypeBackground -> return serialize(dto = dto)
        is InternalLinkTypeBotAddToChannel -> return serialize(dto = dto)
        is InternalLinkTypeBotStart -> return serialize(dto = dto)
        is InternalLinkTypeBotStartInGroup -> return serialize(dto = dto)
        is InternalLinkTypeBusinessChat -> return serialize(dto = dto)
        is InternalLinkTypeCallsPage -> return serialize(dto = dto)
        is InternalLinkTypeChatAffiliateProgram -> return serialize(dto = dto)
        is InternalLinkTypeChatBoost -> return serialize(dto = dto)
        is InternalLinkTypeChatFolderInvite -> return serialize(dto = dto)
        is InternalLinkTypeChatInvite -> return serialize(dto = dto)
        is InternalLinkTypeChatSelection -> return serialize(dto = dto)
        is InternalLinkTypeContactsPage -> return serialize(dto = dto)
        is InternalLinkTypeDirectMessagesChat -> return serialize(dto = dto)
        is InternalLinkTypeGame -> return serialize(dto = dto)
        is InternalLinkTypeGiftAuction -> return serialize(dto = dto)
        is InternalLinkTypeGiftCollection -> return serialize(dto = dto)
        is InternalLinkTypeGroupCall -> return serialize(dto = dto)
        is InternalLinkTypeInstantView -> return serialize(dto = dto)
        is InternalLinkTypeInvoice -> return serialize(dto = dto)
        is InternalLinkTypeLanguagePack -> return serialize(dto = dto)
        is InternalLinkTypeLiveStory -> return serialize(dto = dto)
        is InternalLinkTypeMainWebApp -> return serialize(dto = dto)
        is InternalLinkTypeMessage -> return serialize(dto = dto)
        is InternalLinkTypeMessageDraft -> return serialize(dto = dto)
        is InternalLinkTypeMyProfilePage -> return serialize(dto = dto)
        is InternalLinkTypeNewChannelChat -> return serialize(dto = dto)
        is InternalLinkTypeNewGroupChat -> return serialize(dto = dto)
        is InternalLinkTypeNewPrivateChat -> return serialize(dto = dto)
        is InternalLinkTypeNewStory -> return serialize(dto = dto)
        is InternalLinkTypeOauth -> return serialize(dto = dto)
        is InternalLinkTypePassportDataRequest -> return serialize(dto = dto)
        is InternalLinkTypePhoneNumberConfirmation -> return serialize(dto = dto)
        is InternalLinkTypePremiumFeaturesPage -> return serialize(dto = dto)
        is InternalLinkTypePremiumGiftCode -> return serialize(dto = dto)
        is InternalLinkTypePremiumGiftPurchase -> return serialize(dto = dto)
        is InternalLinkTypeProxy -> return serialize(dto = dto)
        is InternalLinkTypePublicChat -> return serialize(dto = dto)
        is InternalLinkTypeQrCodeAuthentication -> return serialize(dto = dto)
        is InternalLinkTypeRequestManagedBot -> return serialize(dto = dto)
        is InternalLinkTypeRestorePurchases -> return serialize(dto = dto)
        is InternalLinkTypeSavedMessages -> return serialize(dto = dto)
        is InternalLinkTypeSearch -> return serialize(dto = dto)
        is InternalLinkTypeSettings -> return serialize(dto = dto)
        is InternalLinkTypeStarPurchase -> return serialize(dto = dto)
        is InternalLinkTypeStickerSet -> return serialize(dto = dto)
        is InternalLinkTypeStory -> return serialize(dto = dto)
        is InternalLinkTypeStoryAlbum -> return serialize(dto = dto)
        is InternalLinkTypeTextCompositionStyle -> return serialize(dto = dto)
        is InternalLinkTypeTheme -> return serialize(dto = dto)
        is InternalLinkTypeUnknownDeepLink -> return serialize(dto = dto)
        is InternalLinkTypeUpgradedGift -> return serialize(dto = dto)
        is InternalLinkTypeUserPhoneNumber -> return serialize(dto = dto)
        is InternalLinkTypeUserToken -> return serialize(dto = dto)
        is InternalLinkTypeVideoChat -> return serialize(dto = dto)
        is InternalLinkTypeWebApp -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: BlockList): JsonElement {
    when(dto) {
        is BlockListMain -> return serialize(dto = dto)
        is BlockListStories -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: FileType): JsonElement {
    when(dto) {
        is FileTypeNone -> return serialize(dto = dto)
        is FileTypeAnimation -> return serialize(dto = dto)
        is FileTypeAudio -> return serialize(dto = dto)
        is FileTypeDocument -> return serialize(dto = dto)
        is FileTypeLivePhotoVideo -> return serialize(dto = dto)
        is FileTypeNotificationSound -> return serialize(dto = dto)
        is FileTypePhoto -> return serialize(dto = dto)
        is FileTypePhotoStory -> return serialize(dto = dto)
        is FileTypeProfilePhoto -> return serialize(dto = dto)
        is FileTypeSecret -> return serialize(dto = dto)
        is FileTypeSecretThumbnail -> return serialize(dto = dto)
        is FileTypeSecure -> return serialize(dto = dto)
        is FileTypeSelfDestructingLivePhotoVideo -> return serialize(dto = dto)
        is FileTypeSelfDestructingPhoto -> return serialize(dto = dto)
        is FileTypeSelfDestructingVideo -> return serialize(dto = dto)
        is FileTypeSelfDestructingVideoNote -> return serialize(dto = dto)
        is FileTypeSelfDestructingVoiceNote -> return serialize(dto = dto)
        is FileTypeSticker -> return serialize(dto = dto)
        is FileTypeThumbnail -> return serialize(dto = dto)
        is FileTypeUnknown -> return serialize(dto = dto)
        is FileTypeVideo -> return serialize(dto = dto)
        is FileTypeVideoNote -> return serialize(dto = dto)
        is FileTypeVideoStory -> return serialize(dto = dto)
        is FileTypeVoiceNote -> return serialize(dto = dto)
        is FileTypeWallpaper -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: NetworkType): JsonElement {
    when(dto) {
        is NetworkTypeNone -> return serialize(dto = dto)
        is NetworkTypeMobile -> return serialize(dto = dto)
        is NetworkTypeMobileRoaming -> return serialize(dto = dto)
        is NetworkTypeWiFi -> return serialize(dto = dto)
        is NetworkTypeOther -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: NetworkStatisticsEntry): JsonElement {
    when(dto) {
        is NetworkStatisticsEntryFile -> return serialize(dto = dto)
        is NetworkStatisticsEntryCall -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: AutosaveSettingsScope): JsonElement {
    when(dto) {
        is AutosaveSettingsScopePrivateChats -> return serialize(dto = dto)
        is AutosaveSettingsScopeGroupChats -> return serialize(dto = dto)
        is AutosaveSettingsScopeChannelChats -> return serialize(dto = dto)
        is AutosaveSettingsScopeChat -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: WebBrowserType): JsonElement {
    when(dto) {
        is WebBrowserTypeExternal -> return serialize(dto = dto)
        is WebBrowserTypeInApp -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ConnectionState): JsonElement {
    when(dto) {
        is ConnectionStateWaitingForNetwork -> return serialize(dto = dto)
        is ConnectionStateConnectingToProxy -> return serialize(dto = dto)
        is ConnectionStateConnecting -> return serialize(dto = dto)
        is ConnectionStateUpdating -> return serialize(dto = dto)
        is ConnectionStateReady -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: TopChatCategory): JsonElement {
    when(dto) {
        is TopChatCategoryUsers -> return serialize(dto = dto)
        is TopChatCategoryBots -> return serialize(dto = dto)
        is TopChatCategoryGroups -> return serialize(dto = dto)
        is TopChatCategoryChannels -> return serialize(dto = dto)
        is TopChatCategoryInlineBots -> return serialize(dto = dto)
        is TopChatCategoryGuestBots -> return serialize(dto = dto)
        is TopChatCategoryWebAppBots -> return serialize(dto = dto)
        is TopChatCategoryCalls -> return serialize(dto = dto)
        is TopChatCategoryForwardChats -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: TMeUrlType): JsonElement {
    when(dto) {
        is TMeUrlTypeUser -> return serialize(dto = dto)
        is TMeUrlTypeSupergroup -> return serialize(dto = dto)
        is TMeUrlTypeChatInvite -> return serialize(dto = dto)
        is TMeUrlTypeStickerSet -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: SuggestedAction): JsonElement {
    when(dto) {
        is SuggestedActionEnableArchiveAndMuteNewChats -> return serialize(dto = dto)
        is SuggestedActionCheckPassword -> return serialize(dto = dto)
        is SuggestedActionCheckPhoneNumber -> return serialize(dto = dto)
        is SuggestedActionViewChecksHint -> return serialize(dto = dto)
        is SuggestedActionConvertToBroadcastGroup -> return serialize(dto = dto)
        is SuggestedActionSetPassword -> return serialize(dto = dto)
        is SuggestedActionUpgradePremium -> return serialize(dto = dto)
        is SuggestedActionRestorePremium -> return serialize(dto = dto)
        is SuggestedActionSubscribeToAnnualPremium -> return serialize(dto = dto)
        is SuggestedActionGiftPremiumForChristmas -> return serialize(dto = dto)
        is SuggestedActionSetBirthdate -> return serialize(dto = dto)
        is SuggestedActionSetProfilePhoto -> return serialize(dto = dto)
        is SuggestedActionExtendPremium -> return serialize(dto = dto)
        is SuggestedActionExtendStarSubscriptions -> return serialize(dto = dto)
        is SuggestedActionCustom -> return serialize(dto = dto)
        is SuggestedActionSetLoginEmailAddress -> return serialize(dto = dto)
        is SuggestedActionAddLoginPasskey -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: TextParseMode): JsonElement {
    when(dto) {
        is TextParseModeMarkdown -> return serialize(dto = dto)
        is TextParseModeHTML -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ProxyType): JsonElement {
    when(dto) {
        is ProxyTypeSocks5 -> return serialize(dto = dto)
        is ProxyTypeHttp -> return serialize(dto = dto)
        is ProxyTypeMtproto -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: StatisticalGraph): JsonElement {
    when(dto) {
        is StatisticalGraphData -> return serialize(dto = dto)
        is StatisticalGraphAsync -> return serialize(dto = dto)
        is StatisticalGraphError -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ChatStatisticsObjectType): JsonElement {
    when(dto) {
        is ChatStatisticsObjectTypeMessage -> return serialize(dto = dto)
        is ChatStatisticsObjectTypeStory -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ChatStatistics): JsonElement {
    when(dto) {
        is ChatStatisticsSupergroup -> return serialize(dto = dto)
        is ChatStatisticsChannel -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: RevenueWithdrawalState): JsonElement {
    when(dto) {
        is RevenueWithdrawalStatePending -> return serialize(dto = dto)
        is RevenueWithdrawalStateSucceeded -> return serialize(dto = dto)
        is RevenueWithdrawalStateFailed -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: ChatRevenueTransactionType): JsonElement {
    when(dto) {
        is ChatRevenueTransactionTypeUnsupported -> return serialize(dto = dto)
        is ChatRevenueTransactionTypeSponsoredMessageEarnings -> return serialize(dto = dto)
        is ChatRevenueTransactionTypeSuggestedPostEarnings -> return serialize(dto = dto)
        is ChatRevenueTransactionTypeFragmentWithdrawal -> return serialize(dto = dto)
        is ChatRevenueTransactionTypeFragmentRefund -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: VectorPathCommand): JsonElement {
    when(dto) {
        is VectorPathCommandLine -> return serialize(dto = dto)
        is VectorPathCommandCubicBezierCurve -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: BotCommandScope): JsonElement {
    when(dto) {
        is BotCommandScopeDefault -> return serialize(dto = dto)
        is BotCommandScopeAllPrivateChats -> return serialize(dto = dto)
        is BotCommandScopeAllGroupChats -> return serialize(dto = dto)
        is BotCommandScopeAllChatAdministrators -> return serialize(dto = dto)
        is BotCommandScopeChat -> return serialize(dto = dto)
        is BotCommandScopeChatAdministrators -> return serialize(dto = dto)
        is BotCommandScopeChatMember -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: PhoneNumberCodeType): JsonElement {
    when(dto) {
        is PhoneNumberCodeTypeChange -> return serialize(dto = dto)
        is PhoneNumberCodeTypeVerify -> return serialize(dto = dto)
        is PhoneNumberCodeTypeConfirmOwnership -> return serialize(dto = dto)
    }
}

internal fun serialize(dto: Update): JsonElement {
    when(dto) {
        is UpdateAuthorizationState -> return serialize(dto = dto)
        is UpdateNewMessage -> return serialize(dto = dto)
        is UpdateMessageSendAcknowledged -> return serialize(dto = dto)
        is UpdateMessageSendSucceeded -> return serialize(dto = dto)
        is UpdateMessageSendFailed -> return serialize(dto = dto)
        is UpdateMessageContent -> return serialize(dto = dto)
        is UpdateMessageEdited -> return serialize(dto = dto)
        is UpdateMessageIsPinned -> return serialize(dto = dto)
        is UpdateMessageInteractionInfo -> return serialize(dto = dto)
        is UpdateMessageContentOpened -> return serialize(dto = dto)
        is UpdateMessageMentionRead -> return serialize(dto = dto)
        is UpdateMessageUnreadReactions -> return serialize(dto = dto)
        is UpdateMessageContainsUnreadPollVotes -> return serialize(dto = dto)
        is UpdateMessageFactCheck -> return serialize(dto = dto)
        is UpdateMessageSuggestedPostInfo -> return serialize(dto = dto)
        is UpdateMessageLiveLocationViewed -> return serialize(dto = dto)
        is UpdateVideoPublished -> return serialize(dto = dto)
        is UpdateNewChat -> return serialize(dto = dto)
        is UpdateChatTitle -> return serialize(dto = dto)
        is UpdateChatPhoto -> return serialize(dto = dto)
        is UpdateChatAccentColors -> return serialize(dto = dto)
        is UpdateChatPermissions -> return serialize(dto = dto)
        is UpdateChatLastMessage -> return serialize(dto = dto)
        is UpdateChatPosition -> return serialize(dto = dto)
        is UpdateChatAddedToList -> return serialize(dto = dto)
        is UpdateChatRemovedFromList -> return serialize(dto = dto)
        is UpdateChatReadInbox -> return serialize(dto = dto)
        is UpdateChatReadOutbox -> return serialize(dto = dto)
        is UpdateChatActionBar -> return serialize(dto = dto)
        is UpdateChatBusinessBotManageBar -> return serialize(dto = dto)
        is UpdateChatAvailableReactions -> return serialize(dto = dto)
        is UpdateChatDraftMessage -> return serialize(dto = dto)
        is UpdateChatEmojiStatus -> return serialize(dto = dto)
        is UpdateChatMessageSender -> return serialize(dto = dto)
        is UpdateChatMessageAutoDeleteTime -> return serialize(dto = dto)
        is UpdateChatNotificationSettings -> return serialize(dto = dto)
        is UpdateChatPendingJoinRequests -> return serialize(dto = dto)
        is UpdateChatReplyMarkup -> return serialize(dto = dto)
        is UpdateChatBackground -> return serialize(dto = dto)
        is UpdateChatTheme -> return serialize(dto = dto)
        is UpdateChatUnreadMentionCount -> return serialize(dto = dto)
        is UpdateChatUnreadReactionCount -> return serialize(dto = dto)
        is UpdateChatUnreadPollVoteCount -> return serialize(dto = dto)
        is UpdateChatVideoChat -> return serialize(dto = dto)
        is UpdateChatDefaultDisableNotification -> return serialize(dto = dto)
        is UpdateChatHasProtectedContent -> return serialize(dto = dto)
        is UpdateChatIsTranslatable -> return serialize(dto = dto)
        is UpdateChatIsMarkedAsUnread -> return serialize(dto = dto)
        is UpdateChatViewAsTopics -> return serialize(dto = dto)
        is UpdateChatBlockList -> return serialize(dto = dto)
        is UpdateChatHasScheduledMessages -> return serialize(dto = dto)
        is UpdateChatFolders -> return serialize(dto = dto)
        is UpdateChatOnlineMemberCount -> return serialize(dto = dto)
        is UpdateSavedMessagesTopic -> return serialize(dto = dto)
        is UpdateSavedMessagesTopicCount -> return serialize(dto = dto)
        is UpdateDirectMessagesChatTopic -> return serialize(dto = dto)
        is UpdateTopicMessageCount -> return serialize(dto = dto)
        is UpdateQuickReplyShortcut -> return serialize(dto = dto)
        is UpdateQuickReplyShortcutDeleted -> return serialize(dto = dto)
        is UpdateQuickReplyShortcuts -> return serialize(dto = dto)
        is UpdateQuickReplyShortcutMessages -> return serialize(dto = dto)
        is UpdateForumTopicInfo -> return serialize(dto = dto)
        is UpdateForumTopic -> return serialize(dto = dto)
        is UpdateScopeNotificationSettings -> return serialize(dto = dto)
        is UpdateReactionNotificationSettings -> return serialize(dto = dto)
        is UpdateNotification -> return serialize(dto = dto)
        is UpdateNotificationGroup -> return serialize(dto = dto)
        is UpdateActiveNotifications -> return serialize(dto = dto)
        is UpdateHavePendingNotifications -> return serialize(dto = dto)
        is UpdateDeleteMessages -> return serialize(dto = dto)
        is UpdateChatAction -> return serialize(dto = dto)
        is UpdatePendingMessage -> return serialize(dto = dto)
        is UpdateCommunity -> return serialize(dto = dto)
        is UpdateUserStatus -> return serialize(dto = dto)
        is UpdateUser -> return serialize(dto = dto)
        is UpdateBasicGroup -> return serialize(dto = dto)
        is UpdateSupergroup -> return serialize(dto = dto)
        is UpdateSecretChat -> return serialize(dto = dto)
        is UpdateUserFullInfo -> return serialize(dto = dto)
        is UpdateBasicGroupFullInfo -> return serialize(dto = dto)
        is UpdateSupergroupFullInfo -> return serialize(dto = dto)
        is UpdateServiceNotification -> return serialize(dto = dto)
        is UpdateNewOauthRequest -> return serialize(dto = dto)
        is UpdateFile -> return serialize(dto = dto)
        is UpdateFileGenerationStart -> return serialize(dto = dto)
        is UpdateFileGenerationStop -> return serialize(dto = dto)
        is UpdateFileDownloads -> return serialize(dto = dto)
        is UpdateFileAddedToDownloads -> return serialize(dto = dto)
        is UpdateFileDownload -> return serialize(dto = dto)
        is UpdateFileRemovedFromDownloads -> return serialize(dto = dto)
        is UpdateApplicationVerificationRequired -> return serialize(dto = dto)
        is UpdateApplicationRecaptchaVerificationRequired -> return serialize(dto = dto)
        is UpdateCall -> return serialize(dto = dto)
        is UpdateGroupCall -> return serialize(dto = dto)
        is UpdateGroupCallParticipant -> return serialize(dto = dto)
        is UpdateGroupCallParticipants -> return serialize(dto = dto)
        is UpdateGroupCallVerificationState -> return serialize(dto = dto)
        is UpdateNewGroupCallMessage -> return serialize(dto = dto)
        is UpdateNewGroupCallPaidReaction -> return serialize(dto = dto)
        is UpdateGroupCallMessageSendFailed -> return serialize(dto = dto)
        is UpdateGroupCallMessagesDeleted -> return serialize(dto = dto)
        is UpdateLiveStoryTopDonors -> return serialize(dto = dto)
        is UpdateNewCallSignalingData -> return serialize(dto = dto)
        is UpdateGiftAuctionState -> return serialize(dto = dto)
        is UpdateActiveGiftAuctions -> return serialize(dto = dto)
        is UpdateUserPrivacySettingRules -> return serialize(dto = dto)
        is UpdateUnreadMessageCount -> return serialize(dto = dto)
        is UpdateUnreadChatCount -> return serialize(dto = dto)
        is UpdateChatJoinResult -> return serialize(dto = dto)
        is UpdateStory -> return serialize(dto = dto)
        is UpdateStoryDeleted -> return serialize(dto = dto)
        is UpdateStoryPostSucceeded -> return serialize(dto = dto)
        is UpdateStoryPostFailed -> return serialize(dto = dto)
        is UpdateChatActiveStories -> return serialize(dto = dto)
        is UpdateStoryListChatCount -> return serialize(dto = dto)
        is UpdateStoryStealthMode -> return serialize(dto = dto)
        is UpdateTrustedMiniAppBots -> return serialize(dto = dto)
        is UpdateOption -> return serialize(dto = dto)
        is UpdateStickerSet -> return serialize(dto = dto)
        is UpdateInstalledStickerSets -> return serialize(dto = dto)
        is UpdateTrendingStickerSets -> return serialize(dto = dto)
        is UpdateRecentStickers -> return serialize(dto = dto)
        is UpdateFavoriteStickers -> return serialize(dto = dto)
        is UpdateSavedAnimations -> return serialize(dto = dto)
        is UpdateSavedNotificationSounds -> return serialize(dto = dto)
        is UpdateDefaultBackground -> return serialize(dto = dto)
        is UpdateEmojiChatThemes -> return serialize(dto = dto)
        is UpdateAccentColors -> return serialize(dto = dto)
        is UpdateProfileAccentColors -> return serialize(dto = dto)
        is UpdateWebBrowserSettings -> return serialize(dto = dto)
        is UpdateLanguagePackStrings -> return serialize(dto = dto)
        is UpdateConnectionState -> return serialize(dto = dto)
        is UpdateFreezeState -> return serialize(dto = dto)
        is UpdateAgeVerificationParameters -> return serialize(dto = dto)
        is UpdateTermsOfService -> return serialize(dto = dto)
        is UpdateUnconfirmedSession -> return serialize(dto = dto)
        is UpdateAttachmentMenuBots -> return serialize(dto = dto)
        is UpdateWebAppMessageSent -> return serialize(dto = dto)
        is UpdateActiveEmojiReactions -> return serialize(dto = dto)
        is UpdateAvailableMessageEffects -> return serialize(dto = dto)
        is UpdateDefaultReactionType -> return serialize(dto = dto)
        is UpdateDefaultPaidReactionType -> return serialize(dto = dto)
        is UpdateSavedMessagesTags -> return serialize(dto = dto)
        is UpdateActiveLiveLocationMessages -> return serialize(dto = dto)
        is UpdateOwnedStarCount -> return serialize(dto = dto)
        is UpdateOwnedGramCount -> return serialize(dto = dto)
        is UpdateChatRevenueAmount -> return serialize(dto = dto)
        is UpdateStarRevenueStatus -> return serialize(dto = dto)
        is UpdateGramRevenueStatus -> return serialize(dto = dto)
        is UpdateSpeechRecognitionTrial -> return serialize(dto = dto)
        is UpdateGroupCallMessageLevels -> return serialize(dto = dto)
        is UpdateDiceEmojis -> return serialize(dto = dto)
        is UpdateStakeDiceState -> return serialize(dto = dto)
        is UpdateAnimatedEmojiMessageClicked -> return serialize(dto = dto)
        is UpdateAnimationSearchParameters -> return serialize(dto = dto)
        is UpdateTextCompositionStyles -> return serialize(dto = dto)
        is UpdateSuggestedActions -> return serialize(dto = dto)
        is UpdateSpeedLimitNotification -> return serialize(dto = dto)
        is UpdateContactCloseBirthdays -> return serialize(dto = dto)
        is UpdateAutosaveSettings -> return serialize(dto = dto)
        is UpdateBusinessConnection -> return serialize(dto = dto)
        is UpdateNewBusinessMessage -> return serialize(dto = dto)
        is UpdateBusinessMessageEdited -> return serialize(dto = dto)
        is UpdateBusinessMessagesDeleted -> return serialize(dto = dto)
        is UpdateNewInlineQuery -> return serialize(dto = dto)
        is UpdateNewChosenInlineResult -> return serialize(dto = dto)
        is UpdateNewGuestQuery -> return serialize(dto = dto)
        is UpdateNewCallbackQuery -> return serialize(dto = dto)
        is UpdateNewInlineCallbackQuery -> return serialize(dto = dto)
        is UpdateNewBusinessCallbackQuery -> return serialize(dto = dto)
        is UpdateNewShippingQuery -> return serialize(dto = dto)
        is UpdateNewPreCheckoutQuery -> return serialize(dto = dto)
        is UpdateNewCustomEvent -> return serialize(dto = dto)
        is UpdateNewCustomQuery -> return serialize(dto = dto)
        is UpdateUserSubscription -> return serialize(dto = dto)
        is UpdatePoll -> return serialize(dto = dto)
        is UpdatePollAnswer -> return serialize(dto = dto)
        is UpdateManagedBot -> return serialize(dto = dto)
        is UpdateChatMember -> return serialize(dto = dto)
        is UpdateNewChatJoinRequest -> return serialize(dto = dto)
        is UpdateChatBoost -> return serialize(dto = dto)
        is UpdateMessageReaction -> return serialize(dto = dto)
        is UpdateMessageReactions -> return serialize(dto = dto)
        is UpdatePaidMediaPurchased -> return serialize(dto = dto)
        else -> error(message = "Unknown dto type: ${dto.toString()}")
    }
}

internal fun serialize(dto: LogStream): JsonElement {
    when(dto) {
        is LogStreamDefault -> return serialize(dto = dto)
        is LogStreamFile -> return serialize(dto = dto)
        is LogStreamEmpty -> return serialize(dto = dto)
    }
}
