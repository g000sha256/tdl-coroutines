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

import dev.g000sha256.tdl.dto.AccentColor
import dev.g000sha256.tdl.dto.AcceptedGiftTypes
import dev.g000sha256.tdl.dto.AccountInfo
import dev.g000sha256.tdl.dto.AccountTtl
import dev.g000sha256.tdl.dto.ActiveStoryStateLive
import dev.g000sha256.tdl.dto.ActiveStoryStateRead
import dev.g000sha256.tdl.dto.ActiveStoryStateUnread
import dev.g000sha256.tdl.dto.AddedProxies
import dev.g000sha256.tdl.dto.AddedProxy
import dev.g000sha256.tdl.dto.AddedReaction
import dev.g000sha256.tdl.dto.AddedReactions
import dev.g000sha256.tdl.dto.Address
import dev.g000sha256.tdl.dto.AdvertisementSponsor
import dev.g000sha256.tdl.dto.AffiliateInfo
import dev.g000sha256.tdl.dto.AffiliateProgramInfo
import dev.g000sha256.tdl.dto.AffiliateProgramParameters
import dev.g000sha256.tdl.dto.AffiliateProgramSortOrderCreationDate
import dev.g000sha256.tdl.dto.AffiliateProgramSortOrderProfitability
import dev.g000sha256.tdl.dto.AffiliateProgramSortOrderRevenue
import dev.g000sha256.tdl.dto.AffiliateTypeBot
import dev.g000sha256.tdl.dto.AffiliateTypeChannel
import dev.g000sha256.tdl.dto.AffiliateTypeCurrentUser
import dev.g000sha256.tdl.dto.AgeVerificationParameters
import dev.g000sha256.tdl.dto.AlternativeVideo
import dev.g000sha256.tdl.dto.AnimatedChatPhoto
import dev.g000sha256.tdl.dto.AnimatedEmoji
import dev.g000sha256.tdl.dto.Animation
import dev.g000sha256.tdl.dto.Animations
import dev.g000sha256.tdl.dto.ArchiveChatListSettings
import dev.g000sha256.tdl.dto.AttachmentMenuBot
import dev.g000sha256.tdl.dto.AttachmentMenuBotColor
import dev.g000sha256.tdl.dto.AttributeCraftPersistenceProbability
import dev.g000sha256.tdl.dto.AuctionBid
import dev.g000sha256.tdl.dto.AuctionRound
import dev.g000sha256.tdl.dto.AuctionStateActive
import dev.g000sha256.tdl.dto.AuctionStateFinished
import dev.g000sha256.tdl.dto.Audio
import dev.g000sha256.tdl.dto.Audios
import dev.g000sha256.tdl.dto.AuthenticationCodeInfo
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
import dev.g000sha256.tdl.dto.AutoDownloadSettings
import dev.g000sha256.tdl.dto.AutoDownloadSettingsPresets
import dev.g000sha256.tdl.dto.AutosaveSettings
import dev.g000sha256.tdl.dto.AutosaveSettingsException
import dev.g000sha256.tdl.dto.AutosaveSettingsScopeChannelChats
import dev.g000sha256.tdl.dto.AutosaveSettingsScopeChat
import dev.g000sha256.tdl.dto.AutosaveSettingsScopeGroupChats
import dev.g000sha256.tdl.dto.AutosaveSettingsScopePrivateChats
import dev.g000sha256.tdl.dto.AvailableGift
import dev.g000sha256.tdl.dto.AvailableGifts
import dev.g000sha256.tdl.dto.AvailableReaction
import dev.g000sha256.tdl.dto.AvailableReactions
import dev.g000sha256.tdl.dto.Background
import dev.g000sha256.tdl.dto.BackgroundFillFreeformGradient
import dev.g000sha256.tdl.dto.BackgroundFillGradient
import dev.g000sha256.tdl.dto.BackgroundFillSolid
import dev.g000sha256.tdl.dto.BackgroundTypeChatTheme
import dev.g000sha256.tdl.dto.BackgroundTypeFill
import dev.g000sha256.tdl.dto.BackgroundTypePattern
import dev.g000sha256.tdl.dto.BackgroundTypeWallpaper
import dev.g000sha256.tdl.dto.Backgrounds
import dev.g000sha256.tdl.dto.BankCardActionOpenUrl
import dev.g000sha256.tdl.dto.BankCardInfo
import dev.g000sha256.tdl.dto.BasicGroup
import dev.g000sha256.tdl.dto.BasicGroupFullInfo
import dev.g000sha256.tdl.dto.Birthdate
import dev.g000sha256.tdl.dto.BlockListMain
import dev.g000sha256.tdl.dto.BlockListStories
import dev.g000sha256.tdl.dto.BotAccessSettings
import dev.g000sha256.tdl.dto.BotCommand
import dev.g000sha256.tdl.dto.BotCommandScopeAllChatAdministrators
import dev.g000sha256.tdl.dto.BotCommandScopeAllGroupChats
import dev.g000sha256.tdl.dto.BotCommandScopeAllPrivateChats
import dev.g000sha256.tdl.dto.BotCommandScopeChat
import dev.g000sha256.tdl.dto.BotCommandScopeChatAdministrators
import dev.g000sha256.tdl.dto.BotCommandScopeChatMember
import dev.g000sha256.tdl.dto.BotCommandScopeDefault
import dev.g000sha256.tdl.dto.BotCommands
import dev.g000sha256.tdl.dto.BotInfo
import dev.g000sha256.tdl.dto.BotMediaPreview
import dev.g000sha256.tdl.dto.BotMediaPreviewInfo
import dev.g000sha256.tdl.dto.BotMediaPreviews
import dev.g000sha256.tdl.dto.BotMenuButton
import dev.g000sha256.tdl.dto.BotVerification
import dev.g000sha256.tdl.dto.BotVerificationParameters
import dev.g000sha256.tdl.dto.BotWriteAccessAllowReasonAcceptedRequest
import dev.g000sha256.tdl.dto.BotWriteAccessAllowReasonAddedToAttachmentMenu
import dev.g000sha256.tdl.dto.BotWriteAccessAllowReasonConnectedWebsite
import dev.g000sha256.tdl.dto.BotWriteAccessAllowReasonLaunchedWebApp
import dev.g000sha256.tdl.dto.BuiltInThemeArctic
import dev.g000sha256.tdl.dto.BuiltInThemeClassic
import dev.g000sha256.tdl.dto.BuiltInThemeDay
import dev.g000sha256.tdl.dto.BuiltInThemeNight
import dev.g000sha256.tdl.dto.BuiltInThemeTinted
import dev.g000sha256.tdl.dto.BusinessAwayMessageScheduleAlways
import dev.g000sha256.tdl.dto.BusinessAwayMessageScheduleCustom
import dev.g000sha256.tdl.dto.BusinessAwayMessageScheduleOutsideOfOpeningHours
import dev.g000sha256.tdl.dto.BusinessAwayMessageSettings
import dev.g000sha256.tdl.dto.BusinessBotManageBar
import dev.g000sha256.tdl.dto.BusinessBotRights
import dev.g000sha256.tdl.dto.BusinessChatLink
import dev.g000sha256.tdl.dto.BusinessChatLinkInfo
import dev.g000sha256.tdl.dto.BusinessChatLinks
import dev.g000sha256.tdl.dto.BusinessConnectedBot
import dev.g000sha256.tdl.dto.BusinessConnectedBotInfo
import dev.g000sha256.tdl.dto.BusinessConnection
import dev.g000sha256.tdl.dto.BusinessFeatureAccountLinks
import dev.g000sha256.tdl.dto.BusinessFeatureAwayMessage
import dev.g000sha256.tdl.dto.BusinessFeatureBots
import dev.g000sha256.tdl.dto.BusinessFeatureChatFolderTags
import dev.g000sha256.tdl.dto.BusinessFeatureEmojiStatus
import dev.g000sha256.tdl.dto.BusinessFeatureGreetingMessage
import dev.g000sha256.tdl.dto.BusinessFeatureLocation
import dev.g000sha256.tdl.dto.BusinessFeatureOpeningHours
import dev.g000sha256.tdl.dto.BusinessFeaturePromotionAnimation
import dev.g000sha256.tdl.dto.BusinessFeatureQuickReplies
import dev.g000sha256.tdl.dto.BusinessFeatureStartPage
import dev.g000sha256.tdl.dto.BusinessFeatureUpgradedStories
import dev.g000sha256.tdl.dto.BusinessFeatures
import dev.g000sha256.tdl.dto.BusinessGreetingMessageSettings
import dev.g000sha256.tdl.dto.BusinessInfo
import dev.g000sha256.tdl.dto.BusinessLocation
import dev.g000sha256.tdl.dto.BusinessMessage
import dev.g000sha256.tdl.dto.BusinessMessages
import dev.g000sha256.tdl.dto.BusinessOpeningHours
import dev.g000sha256.tdl.dto.BusinessOpeningHoursInterval
import dev.g000sha256.tdl.dto.BusinessRecipients
import dev.g000sha256.tdl.dto.BusinessStartPage
import dev.g000sha256.tdl.dto.ButtonStyleDanger
import dev.g000sha256.tdl.dto.ButtonStyleDefault
import dev.g000sha256.tdl.dto.ButtonStylePrimary
import dev.g000sha256.tdl.dto.ButtonStyleSuccess
import dev.g000sha256.tdl.dto.Call
import dev.g000sha256.tdl.dto.CallDiscardReasonDeclined
import dev.g000sha256.tdl.dto.CallDiscardReasonDisconnected
import dev.g000sha256.tdl.dto.CallDiscardReasonEmpty
import dev.g000sha256.tdl.dto.CallDiscardReasonHungUp
import dev.g000sha256.tdl.dto.CallDiscardReasonMissed
import dev.g000sha256.tdl.dto.CallDiscardReasonUpgradeToGroupCall
import dev.g000sha256.tdl.dto.CallId
import dev.g000sha256.tdl.dto.CallProblemDistortedSpeech
import dev.g000sha256.tdl.dto.CallProblemDistortedVideo
import dev.g000sha256.tdl.dto.CallProblemDropped
import dev.g000sha256.tdl.dto.CallProblemEcho
import dev.g000sha256.tdl.dto.CallProblemInterruptions
import dev.g000sha256.tdl.dto.CallProblemNoise
import dev.g000sha256.tdl.dto.CallProblemPixelatedVideo
import dev.g000sha256.tdl.dto.CallProblemSilentLocal
import dev.g000sha256.tdl.dto.CallProblemSilentRemote
import dev.g000sha256.tdl.dto.CallProtocol
import dev.g000sha256.tdl.dto.CallServer
import dev.g000sha256.tdl.dto.CallServerTypeTelegramReflector
import dev.g000sha256.tdl.dto.CallServerTypeWebrtc
import dev.g000sha256.tdl.dto.CallStateDiscarded
import dev.g000sha256.tdl.dto.CallStateError
import dev.g000sha256.tdl.dto.CallStateExchangingKeys
import dev.g000sha256.tdl.dto.CallStateHangingUp
import dev.g000sha256.tdl.dto.CallStatePending
import dev.g000sha256.tdl.dto.CallStateReady
import dev.g000sha256.tdl.dto.CallbackQueryAnswer
import dev.g000sha256.tdl.dto.CallbackQueryPayloadData
import dev.g000sha256.tdl.dto.CallbackQueryPayloadDataWithPassword
import dev.g000sha256.tdl.dto.CallbackQueryPayloadGame
import dev.g000sha256.tdl.dto.CanPostStoryResultActiveStoryLimitExceeded
import dev.g000sha256.tdl.dto.CanPostStoryResultBoostNeeded
import dev.g000sha256.tdl.dto.CanPostStoryResultLiveStoryIsActive
import dev.g000sha256.tdl.dto.CanPostStoryResultMonthlyLimitExceeded
import dev.g000sha256.tdl.dto.CanPostStoryResultOk
import dev.g000sha256.tdl.dto.CanPostStoryResultPremiumNeeded
import dev.g000sha256.tdl.dto.CanPostStoryResultWeeklyLimitExceeded
import dev.g000sha256.tdl.dto.CanSendGiftResultFail
import dev.g000sha256.tdl.dto.CanSendGiftResultOk
import dev.g000sha256.tdl.dto.CanSendMessageToUserResultOk
import dev.g000sha256.tdl.dto.CanSendMessageToUserResultUserHasPaidMessages
import dev.g000sha256.tdl.dto.CanSendMessageToUserResultUserIsDeleted
import dev.g000sha256.tdl.dto.CanSendMessageToUserResultUserRestrictsNewChats
import dev.g000sha256.tdl.dto.CanTransferOwnershipResultOk
import dev.g000sha256.tdl.dto.CanTransferOwnershipResultPasswordNeeded
import dev.g000sha256.tdl.dto.CanTransferOwnershipResultPasswordTooFresh
import dev.g000sha256.tdl.dto.CanTransferOwnershipResultSessionTooFresh
import dev.g000sha256.tdl.dto.Chat
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
import dev.g000sha256.tdl.dto.ChatActiveStories
import dev.g000sha256.tdl.dto.ChatAdministrator
import dev.g000sha256.tdl.dto.ChatAdministratorRights
import dev.g000sha256.tdl.dto.ChatAdministrators
import dev.g000sha256.tdl.dto.ChatAvailableReactionsAll
import dev.g000sha256.tdl.dto.ChatAvailableReactionsSome
import dev.g000sha256.tdl.dto.ChatBackground
import dev.g000sha256.tdl.dto.ChatBoost
import dev.g000sha256.tdl.dto.ChatBoostFeatures
import dev.g000sha256.tdl.dto.ChatBoostLevelFeatures
import dev.g000sha256.tdl.dto.ChatBoostLink
import dev.g000sha256.tdl.dto.ChatBoostLinkInfo
import dev.g000sha256.tdl.dto.ChatBoostSlot
import dev.g000sha256.tdl.dto.ChatBoostSlots
import dev.g000sha256.tdl.dto.ChatBoostSourceGiftCode
import dev.g000sha256.tdl.dto.ChatBoostSourceGiveaway
import dev.g000sha256.tdl.dto.ChatBoostSourcePremium
import dev.g000sha256.tdl.dto.ChatBoostStatus
import dev.g000sha256.tdl.dto.ChatEvent
import dev.g000sha256.tdl.dto.ChatEventAccentColorChanged
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
import dev.g000sha256.tdl.dto.ChatEventLogFilters
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
import dev.g000sha256.tdl.dto.ChatEvents
import dev.g000sha256.tdl.dto.ChatFolder
import dev.g000sha256.tdl.dto.ChatFolderIcon
import dev.g000sha256.tdl.dto.ChatFolderInfo
import dev.g000sha256.tdl.dto.ChatFolderInviteLink
import dev.g000sha256.tdl.dto.ChatFolderInviteLinkInfo
import dev.g000sha256.tdl.dto.ChatFolderInviteLinks
import dev.g000sha256.tdl.dto.ChatFolderName
import dev.g000sha256.tdl.dto.ChatInviteLink
import dev.g000sha256.tdl.dto.ChatInviteLinkCount
import dev.g000sha256.tdl.dto.ChatInviteLinkCounts
import dev.g000sha256.tdl.dto.ChatInviteLinkInfo
import dev.g000sha256.tdl.dto.ChatInviteLinkMember
import dev.g000sha256.tdl.dto.ChatInviteLinkMembers
import dev.g000sha256.tdl.dto.ChatInviteLinkSubscriptionInfo
import dev.g000sha256.tdl.dto.ChatInviteLinks
import dev.g000sha256.tdl.dto.ChatJoinRequest
import dev.g000sha256.tdl.dto.ChatJoinRequestResultApproved
import dev.g000sha256.tdl.dto.ChatJoinRequestResultDeclined
import dev.g000sha256.tdl.dto.ChatJoinRequestResultQueued
import dev.g000sha256.tdl.dto.ChatJoinRequests
import dev.g000sha256.tdl.dto.ChatJoinRequestsInfo
import dev.g000sha256.tdl.dto.ChatJoinResultDeclined
import dev.g000sha256.tdl.dto.ChatJoinResultGuardBotApprovalRequired
import dev.g000sha256.tdl.dto.ChatJoinResultRequestSent
import dev.g000sha256.tdl.dto.ChatJoinResultSuccess
import dev.g000sha256.tdl.dto.ChatListArchive
import dev.g000sha256.tdl.dto.ChatListFolder
import dev.g000sha256.tdl.dto.ChatListMain
import dev.g000sha256.tdl.dto.ChatLists
import dev.g000sha256.tdl.dto.ChatLocation
import dev.g000sha256.tdl.dto.ChatMember
import dev.g000sha256.tdl.dto.ChatMemberStatusAdministrator
import dev.g000sha256.tdl.dto.ChatMemberStatusBanned
import dev.g000sha256.tdl.dto.ChatMemberStatusCreator
import dev.g000sha256.tdl.dto.ChatMemberStatusLeft
import dev.g000sha256.tdl.dto.ChatMemberStatusMember
import dev.g000sha256.tdl.dto.ChatMemberStatusRestricted
import dev.g000sha256.tdl.dto.ChatMembers
import dev.g000sha256.tdl.dto.ChatMembersFilterAdministrators
import dev.g000sha256.tdl.dto.ChatMembersFilterBanned
import dev.g000sha256.tdl.dto.ChatMembersFilterBots
import dev.g000sha256.tdl.dto.ChatMembersFilterContacts
import dev.g000sha256.tdl.dto.ChatMembersFilterMembers
import dev.g000sha256.tdl.dto.ChatMembersFilterMention
import dev.g000sha256.tdl.dto.ChatMembersFilterRestricted
import dev.g000sha256.tdl.dto.ChatMessageSender
import dev.g000sha256.tdl.dto.ChatMessageSenders
import dev.g000sha256.tdl.dto.ChatNotificationSettings
import dev.g000sha256.tdl.dto.ChatPermissions
import dev.g000sha256.tdl.dto.ChatPhoto
import dev.g000sha256.tdl.dto.ChatPhotoInfo
import dev.g000sha256.tdl.dto.ChatPhotoSticker
import dev.g000sha256.tdl.dto.ChatPhotoStickerTypeCustomEmoji
import dev.g000sha256.tdl.dto.ChatPhotoStickerTypeRegularOrMask
import dev.g000sha256.tdl.dto.ChatPhotos
import dev.g000sha256.tdl.dto.ChatPosition
import dev.g000sha256.tdl.dto.ChatRevenueAmount
import dev.g000sha256.tdl.dto.ChatRevenueStatistics
import dev.g000sha256.tdl.dto.ChatRevenueTransaction
import dev.g000sha256.tdl.dto.ChatRevenueTransactionTypeFragmentRefund
import dev.g000sha256.tdl.dto.ChatRevenueTransactionTypeFragmentWithdrawal
import dev.g000sha256.tdl.dto.ChatRevenueTransactionTypeSponsoredMessageEarnings
import dev.g000sha256.tdl.dto.ChatRevenueTransactionTypeSuggestedPostEarnings
import dev.g000sha256.tdl.dto.ChatRevenueTransactionTypeUnsupported
import dev.g000sha256.tdl.dto.ChatRevenueTransactions
import dev.g000sha256.tdl.dto.ChatSourceMtprotoProxy
import dev.g000sha256.tdl.dto.ChatSourcePublicServiceAnnouncement
import dev.g000sha256.tdl.dto.ChatStatisticsAdministratorActionsInfo
import dev.g000sha256.tdl.dto.ChatStatisticsChannel
import dev.g000sha256.tdl.dto.ChatStatisticsInteractionInfo
import dev.g000sha256.tdl.dto.ChatStatisticsInviterInfo
import dev.g000sha256.tdl.dto.ChatStatisticsMessageSenderInfo
import dev.g000sha256.tdl.dto.ChatStatisticsObjectTypeMessage
import dev.g000sha256.tdl.dto.ChatStatisticsObjectTypeStory
import dev.g000sha256.tdl.dto.ChatStatisticsSupergroup
import dev.g000sha256.tdl.dto.ChatThemeEmoji
import dev.g000sha256.tdl.dto.ChatThemeGift
import dev.g000sha256.tdl.dto.ChatTypeBasicGroup
import dev.g000sha256.tdl.dto.ChatTypePrivate
import dev.g000sha256.tdl.dto.ChatTypeSecret
import dev.g000sha256.tdl.dto.ChatTypeSupergroup
import dev.g000sha256.tdl.dto.Chats
import dev.g000sha256.tdl.dto.CheckChatUsernameResultOk
import dev.g000sha256.tdl.dto.CheckChatUsernameResultPublicChatsTooMany
import dev.g000sha256.tdl.dto.CheckChatUsernameResultPublicGroupsUnavailable
import dev.g000sha256.tdl.dto.CheckChatUsernameResultUsernameInvalid
import dev.g000sha256.tdl.dto.CheckChatUsernameResultUsernameOccupied
import dev.g000sha256.tdl.dto.CheckChatUsernameResultUsernamePurchasable
import dev.g000sha256.tdl.dto.CheckStickerSetNameResultNameInvalid
import dev.g000sha256.tdl.dto.CheckStickerSetNameResultNameOccupied
import dev.g000sha256.tdl.dto.CheckStickerSetNameResultOk
import dev.g000sha256.tdl.dto.Checklist
import dev.g000sha256.tdl.dto.ChecklistTask
import dev.g000sha256.tdl.dto.CloseBirthdayUser
import dev.g000sha256.tdl.dto.ClosedVectorPath
import dev.g000sha256.tdl.dto.CollectibleItemInfo
import dev.g000sha256.tdl.dto.CollectibleItemTypePhoneNumber
import dev.g000sha256.tdl.dto.CollectibleItemTypeUsername
import dev.g000sha256.tdl.dto.Community
import dev.g000sha256.tdl.dto.CommunityAdministratorRights
import dev.g000sha256.tdl.dto.CommunityMemberStatusAdministrator
import dev.g000sha256.tdl.dto.CommunityMemberStatusBanned
import dev.g000sha256.tdl.dto.CommunityMemberStatusCreator
import dev.g000sha256.tdl.dto.CommunityMemberStatusLeft
import dev.g000sha256.tdl.dto.CommunityMemberStatusMember
import dev.g000sha256.tdl.dto.CommunityPermissions
import dev.g000sha256.tdl.dto.ConnectedAffiliateProgram
import dev.g000sha256.tdl.dto.ConnectedAffiliatePrograms
import dev.g000sha256.tdl.dto.ConnectedWebsite
import dev.g000sha256.tdl.dto.ConnectedWebsites
import dev.g000sha256.tdl.dto.ConnectionStateConnecting
import dev.g000sha256.tdl.dto.ConnectionStateConnectingToProxy
import dev.g000sha256.tdl.dto.ConnectionStateReady
import dev.g000sha256.tdl.dto.ConnectionStateUpdating
import dev.g000sha256.tdl.dto.ConnectionStateWaitingForNetwork
import dev.g000sha256.tdl.dto.Contact
import dev.g000sha256.tdl.dto.Count
import dev.g000sha256.tdl.dto.Countries
import dev.g000sha256.tdl.dto.CountryInfo
import dev.g000sha256.tdl.dto.CraftGiftResultFail
import dev.g000sha256.tdl.dto.CraftGiftResultInvalidGift
import dev.g000sha256.tdl.dto.CraftGiftResultSuccess
import dev.g000sha256.tdl.dto.CraftGiftResultTooEarly
import dev.g000sha256.tdl.dto.CreatedBasicGroupChat
import dev.g000sha256.tdl.dto.CurrentWeather
import dev.g000sha256.tdl.dto.CustomRequestResult
import dev.g000sha256.tdl.dto.Data
import dev.g000sha256.tdl.dto.DatabaseStatistics
import dev.g000sha256.tdl.dto.Date
import dev.g000sha256.tdl.dto.DateRange
import dev.g000sha256.tdl.dto.DateTimeFormattingTypeAbsolute
import dev.g000sha256.tdl.dto.DateTimeFormattingTypeRelative
import dev.g000sha256.tdl.dto.DateTimePartPrecisionLong
import dev.g000sha256.tdl.dto.DateTimePartPrecisionNone
import dev.g000sha256.tdl.dto.DateTimePartPrecisionShort
import dev.g000sha256.tdl.dto.DatedFile
import dev.g000sha256.tdl.dto.DeepLinkInfo
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
import dev.g000sha256.tdl.dto.DiceStickersRegular
import dev.g000sha256.tdl.dto.DiceStickersSlotMachine
import dev.g000sha256.tdl.dto.DiffEntity
import dev.g000sha256.tdl.dto.DiffEntityTypeDelete
import dev.g000sha256.tdl.dto.DiffEntityTypeInsert
import dev.g000sha256.tdl.dto.DiffEntityTypeReplace
import dev.g000sha256.tdl.dto.DiffText
import dev.g000sha256.tdl.dto.DirectMessagesChatTopic
import dev.g000sha256.tdl.dto.Document
import dev.g000sha256.tdl.dto.DownloadedFileCounts
import dev.g000sha256.tdl.dto.DraftMessage
import dev.g000sha256.tdl.dto.DraftMessageContentRichMessage
import dev.g000sha256.tdl.dto.DraftMessageContentText
import dev.g000sha256.tdl.dto.DraftMessageContentVideoNote
import dev.g000sha256.tdl.dto.DraftMessageContentVoiceNote
import dev.g000sha256.tdl.dto.EmailAddressAuthenticationAppleId
import dev.g000sha256.tdl.dto.EmailAddressAuthenticationCode
import dev.g000sha256.tdl.dto.EmailAddressAuthenticationCodeInfo
import dev.g000sha256.tdl.dto.EmailAddressAuthenticationGoogleId
import dev.g000sha256.tdl.dto.EmailAddressResetStateAvailable
import dev.g000sha256.tdl.dto.EmailAddressResetStatePending
import dev.g000sha256.tdl.dto.EmojiCategories
import dev.g000sha256.tdl.dto.EmojiCategory
import dev.g000sha256.tdl.dto.EmojiCategorySourcePremium
import dev.g000sha256.tdl.dto.EmojiCategorySourceSearch
import dev.g000sha256.tdl.dto.EmojiCategoryTypeChatPhoto
import dev.g000sha256.tdl.dto.EmojiCategoryTypeDefault
import dev.g000sha256.tdl.dto.EmojiCategoryTypeEmojiStatus
import dev.g000sha256.tdl.dto.EmojiCategoryTypeRegularStickers
import dev.g000sha256.tdl.dto.EmojiChatTheme
import dev.g000sha256.tdl.dto.EmojiKeyword
import dev.g000sha256.tdl.dto.EmojiKeywords
import dev.g000sha256.tdl.dto.EmojiReaction
import dev.g000sha256.tdl.dto.EmojiStatus
import dev.g000sha256.tdl.dto.EmojiStatusCustomEmojis
import dev.g000sha256.tdl.dto.EmojiStatusTypeCustomEmoji
import dev.g000sha256.tdl.dto.EmojiStatusTypeUpgradedGift
import dev.g000sha256.tdl.dto.EmojiStatuses
import dev.g000sha256.tdl.dto.Emojis
import dev.g000sha256.tdl.dto.EncryptedCredentials
import dev.g000sha256.tdl.dto.EncryptedPassportElement
import dev.g000sha256.tdl.dto.Error
import dev.g000sha256.tdl.dto.FactCheck
import dev.g000sha256.tdl.dto.FailedToAddMember
import dev.g000sha256.tdl.dto.FailedToAddMembers
import dev.g000sha256.tdl.dto.File
import dev.g000sha256.tdl.dto.FileDownload
import dev.g000sha256.tdl.dto.FileDownloadedPrefixSize
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
import dev.g000sha256.tdl.dto.FirebaseAuthenticationSettingsAndroid
import dev.g000sha256.tdl.dto.FirebaseAuthenticationSettingsIos
import dev.g000sha256.tdl.dto.FirebaseDeviceVerificationParametersPlayIntegrity
import dev.g000sha256.tdl.dto.FirebaseDeviceVerificationParametersSafetyNet
import dev.g000sha256.tdl.dto.FixedText
import dev.g000sha256.tdl.dto.FormattedText
import dev.g000sha256.tdl.dto.ForumTopic
import dev.g000sha256.tdl.dto.ForumTopicIcon
import dev.g000sha256.tdl.dto.ForumTopicInfo
import dev.g000sha256.tdl.dto.ForumTopics
import dev.g000sha256.tdl.dto.ForwardSource
import dev.g000sha256.tdl.dto.FoundAffiliateProgram
import dev.g000sha256.tdl.dto.FoundAffiliatePrograms
import dev.g000sha256.tdl.dto.FoundChatBoosts
import dev.g000sha256.tdl.dto.FoundChatMessages
import dev.g000sha256.tdl.dto.FoundFileDownloads
import dev.g000sha256.tdl.dto.FoundMessages
import dev.g000sha256.tdl.dto.FoundPosition
import dev.g000sha256.tdl.dto.FoundPositions
import dev.g000sha256.tdl.dto.FoundPublicPosts
import dev.g000sha256.tdl.dto.FoundStories
import dev.g000sha256.tdl.dto.FoundUsers
import dev.g000sha256.tdl.dto.FoundWebApp
import dev.g000sha256.tdl.dto.Game
import dev.g000sha256.tdl.dto.GameHighScore
import dev.g000sha256.tdl.dto.GameHighScores
import dev.g000sha256.tdl.dto.Gift
import dev.g000sha256.tdl.dto.GiftAuction
import dev.g000sha256.tdl.dto.GiftAuctionAcquiredGift
import dev.g000sha256.tdl.dto.GiftAuctionAcquiredGifts
import dev.g000sha256.tdl.dto.GiftAuctionState
import dev.g000sha256.tdl.dto.GiftBackground
import dev.g000sha256.tdl.dto.GiftChatTheme
import dev.g000sha256.tdl.dto.GiftChatThemes
import dev.g000sha256.tdl.dto.GiftCollection
import dev.g000sha256.tdl.dto.GiftCollections
import dev.g000sha256.tdl.dto.GiftForResale
import dev.g000sha256.tdl.dto.GiftForResaleOrderNumber
import dev.g000sha256.tdl.dto.GiftForResaleOrderPrice
import dev.g000sha256.tdl.dto.GiftForResaleOrderPriceChangeDate
import dev.g000sha256.tdl.dto.GiftPurchaseLimits
import dev.g000sha256.tdl.dto.GiftPurchaseOfferStateAccepted
import dev.g000sha256.tdl.dto.GiftPurchaseOfferStatePending
import dev.g000sha256.tdl.dto.GiftPurchaseOfferStateRejected
import dev.g000sha256.tdl.dto.GiftResaleParameters
import dev.g000sha256.tdl.dto.GiftResalePriceGram
import dev.g000sha256.tdl.dto.GiftResalePriceStar
import dev.g000sha256.tdl.dto.GiftResaleResultOk
import dev.g000sha256.tdl.dto.GiftResaleResultPriceIncreased
import dev.g000sha256.tdl.dto.GiftSettings
import dev.g000sha256.tdl.dto.GiftUpgradePreview
import dev.g000sha256.tdl.dto.GiftUpgradePrice
import dev.g000sha256.tdl.dto.GiftUpgradeVariants
import dev.g000sha256.tdl.dto.GiftsForCrafting
import dev.g000sha256.tdl.dto.GiftsForResale
import dev.g000sha256.tdl.dto.GiveawayInfoCompleted
import dev.g000sha256.tdl.dto.GiveawayInfoOngoing
import dev.g000sha256.tdl.dto.GiveawayParameters
import dev.g000sha256.tdl.dto.GiveawayParticipantStatusAdministrator
import dev.g000sha256.tdl.dto.GiveawayParticipantStatusAlreadyWasMember
import dev.g000sha256.tdl.dto.GiveawayParticipantStatusDisallowedCountry
import dev.g000sha256.tdl.dto.GiveawayParticipantStatusEligible
import dev.g000sha256.tdl.dto.GiveawayParticipantStatusParticipating
import dev.g000sha256.tdl.dto.GiveawayPrizePremium
import dev.g000sha256.tdl.dto.GiveawayPrizeStars
import dev.g000sha256.tdl.dto.GramRevenueStatistics
import dev.g000sha256.tdl.dto.GramRevenueStatus
import dev.g000sha256.tdl.dto.GroupCall
import dev.g000sha256.tdl.dto.GroupCallDataChannelMain
import dev.g000sha256.tdl.dto.GroupCallDataChannelScreenSharing
import dev.g000sha256.tdl.dto.GroupCallId
import dev.g000sha256.tdl.dto.GroupCallInfo
import dev.g000sha256.tdl.dto.GroupCallJoinParameters
import dev.g000sha256.tdl.dto.GroupCallMessage
import dev.g000sha256.tdl.dto.GroupCallMessageLevel
import dev.g000sha256.tdl.dto.GroupCallParticipant
import dev.g000sha256.tdl.dto.GroupCallParticipantVideoInfo
import dev.g000sha256.tdl.dto.GroupCallParticipants
import dev.g000sha256.tdl.dto.GroupCallRecentSpeaker
import dev.g000sha256.tdl.dto.GroupCallStream
import dev.g000sha256.tdl.dto.GroupCallStreams
import dev.g000sha256.tdl.dto.GroupCallVideoQualityFull
import dev.g000sha256.tdl.dto.GroupCallVideoQualityMedium
import dev.g000sha256.tdl.dto.GroupCallVideoQualityThumbnail
import dev.g000sha256.tdl.dto.GroupCallVideoSourceGroup
import dev.g000sha256.tdl.dto.Hashtags
import dev.g000sha256.tdl.dto.HttpUrl
import dev.g000sha256.tdl.dto.IdentityDocument
import dev.g000sha256.tdl.dto.ImportedContact
import dev.g000sha256.tdl.dto.ImportedContacts
import dev.g000sha256.tdl.dto.InlineKeyboardButton
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
import dev.g000sha256.tdl.dto.InlineMessageId
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
import dev.g000sha256.tdl.dto.InlineQueryResults
import dev.g000sha256.tdl.dto.InlineQueryResultsButton
import dev.g000sha256.tdl.dto.InlineQueryResultsButtonTypeStartBot
import dev.g000sha256.tdl.dto.InlineQueryResultsButtonTypeWebApp
import dev.g000sha256.tdl.dto.InputAnimation
import dev.g000sha256.tdl.dto.InputAudio
import dev.g000sha256.tdl.dto.InputBackgroundLocal
import dev.g000sha256.tdl.dto.InputBackgroundPrevious
import dev.g000sha256.tdl.dto.InputBackgroundRemote
import dev.g000sha256.tdl.dto.InputBusinessChatLink
import dev.g000sha256.tdl.dto.InputBusinessStartPage
import dev.g000sha256.tdl.dto.InputCallDiscarded
import dev.g000sha256.tdl.dto.InputCallFromMessage
import dev.g000sha256.tdl.dto.InputChatPhotoAnimation
import dev.g000sha256.tdl.dto.InputChatPhotoPrevious
import dev.g000sha256.tdl.dto.InputChatPhotoStatic
import dev.g000sha256.tdl.dto.InputChatPhotoSticker
import dev.g000sha256.tdl.dto.InputChatThemeEmoji
import dev.g000sha256.tdl.dto.InputChatThemeGift
import dev.g000sha256.tdl.dto.InputChecklist
import dev.g000sha256.tdl.dto.InputChecklistTask
import dev.g000sha256.tdl.dto.InputCredentialsApplePay
import dev.g000sha256.tdl.dto.InputCredentialsGooglePay
import dev.g000sha256.tdl.dto.InputCredentialsNew
import dev.g000sha256.tdl.dto.InputCredentialsSaved
import dev.g000sha256.tdl.dto.InputDocument
import dev.g000sha256.tdl.dto.InputFileGenerated
import dev.g000sha256.tdl.dto.InputFileId
import dev.g000sha256.tdl.dto.InputFileLocal
import dev.g000sha256.tdl.dto.InputFileRemote
import dev.g000sha256.tdl.dto.InputGroupCallLink
import dev.g000sha256.tdl.dto.InputGroupCallMessage
import dev.g000sha256.tdl.dto.InputIdentityDocument
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
import dev.g000sha256.tdl.dto.InputInvoiceMessage
import dev.g000sha256.tdl.dto.InputInvoiceName
import dev.g000sha256.tdl.dto.InputInvoiceTelegram
import dev.g000sha256.tdl.dto.InputMessageAnimation
import dev.g000sha256.tdl.dto.InputMessageAudio
import dev.g000sha256.tdl.dto.InputMessageChecklist
import dev.g000sha256.tdl.dto.InputMessageContact
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
import dev.g000sha256.tdl.dto.InputPageBlockAnchor
import dev.g000sha256.tdl.dto.InputPageBlockAnimation
import dev.g000sha256.tdl.dto.InputPageBlockAudio
import dev.g000sha256.tdl.dto.InputPageBlockBlockQuote
import dev.g000sha256.tdl.dto.InputPageBlockCollage
import dev.g000sha256.tdl.dto.InputPageBlockDetails
import dev.g000sha256.tdl.dto.InputPageBlockDivider
import dev.g000sha256.tdl.dto.InputPageBlockFooter
import dev.g000sha256.tdl.dto.InputPageBlockList
import dev.g000sha256.tdl.dto.InputPageBlockListItem
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
import dev.g000sha256.tdl.dto.InputPaidMedia
import dev.g000sha256.tdl.dto.InputPaidMediaTypePhoto
import dev.g000sha256.tdl.dto.InputPaidMediaTypeVideo
import dev.g000sha256.tdl.dto.InputPassportElementAddress
import dev.g000sha256.tdl.dto.InputPassportElementBankStatement
import dev.g000sha256.tdl.dto.InputPassportElementDriverLicense
import dev.g000sha256.tdl.dto.InputPassportElementEmailAddress
import dev.g000sha256.tdl.dto.InputPassportElementError
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
import dev.g000sha256.tdl.dto.InputPersonalDocument
import dev.g000sha256.tdl.dto.InputPhoto
import dev.g000sha256.tdl.dto.InputPollMediaAnimation
import dev.g000sha256.tdl.dto.InputPollMediaAudio
import dev.g000sha256.tdl.dto.InputPollMediaDocument
import dev.g000sha256.tdl.dto.InputPollMediaLink
import dev.g000sha256.tdl.dto.InputPollMediaLocation
import dev.g000sha256.tdl.dto.InputPollMediaPhoto
import dev.g000sha256.tdl.dto.InputPollMediaSticker
import dev.g000sha256.tdl.dto.InputPollMediaVenue
import dev.g000sha256.tdl.dto.InputPollMediaVideo
import dev.g000sha256.tdl.dto.InputPollOption
import dev.g000sha256.tdl.dto.InputPollTypeQuiz
import dev.g000sha256.tdl.dto.InputPollTypeRegular
import dev.g000sha256.tdl.dto.InputRichMessage
import dev.g000sha256.tdl.dto.InputRichMessageMedia
import dev.g000sha256.tdl.dto.InputSticker
import dev.g000sha256.tdl.dto.InputStoryArea
import dev.g000sha256.tdl.dto.InputStoryAreaTypeFoundVenue
import dev.g000sha256.tdl.dto.InputStoryAreaTypeLink
import dev.g000sha256.tdl.dto.InputStoryAreaTypeLocation
import dev.g000sha256.tdl.dto.InputStoryAreaTypeMessage
import dev.g000sha256.tdl.dto.InputStoryAreaTypePreviousVenue
import dev.g000sha256.tdl.dto.InputStoryAreaTypeSuggestedReaction
import dev.g000sha256.tdl.dto.InputStoryAreaTypeUpgradedGift
import dev.g000sha256.tdl.dto.InputStoryAreaTypeWeather
import dev.g000sha256.tdl.dto.InputStoryAreas
import dev.g000sha256.tdl.dto.InputStoryContentPhoto
import dev.g000sha256.tdl.dto.InputStoryContentVideo
import dev.g000sha256.tdl.dto.InputSuggestedPostInfo
import dev.g000sha256.tdl.dto.InputTextQuote
import dev.g000sha256.tdl.dto.InputThumbnail
import dev.g000sha256.tdl.dto.InputVideo
import dev.g000sha256.tdl.dto.InputVideoNote
import dev.g000sha256.tdl.dto.InputVoiceNote
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
import dev.g000sha256.tdl.dto.InviteGroupCallParticipantResultSuccess
import dev.g000sha256.tdl.dto.InviteGroupCallParticipantResultUserAlreadyParticipant
import dev.g000sha256.tdl.dto.InviteGroupCallParticipantResultUserPrivacyRestricted
import dev.g000sha256.tdl.dto.InviteGroupCallParticipantResultUserWasBanned
import dev.g000sha256.tdl.dto.InviteLinkChatTypeBasicGroup
import dev.g000sha256.tdl.dto.InviteLinkChatTypeChannel
import dev.g000sha256.tdl.dto.InviteLinkChatTypeSupergroup
import dev.g000sha256.tdl.dto.Invoice
import dev.g000sha256.tdl.dto.JsonObjectMember
import dev.g000sha256.tdl.dto.JsonValueArray
import dev.g000sha256.tdl.dto.JsonValueBoolean
import dev.g000sha256.tdl.dto.JsonValueNull
import dev.g000sha256.tdl.dto.JsonValueNumber
import dev.g000sha256.tdl.dto.JsonValueObject
import dev.g000sha256.tdl.dto.JsonValueString
import dev.g000sha256.tdl.dto.KeyboardButton
import dev.g000sha256.tdl.dto.KeyboardButtonSourceMessage
import dev.g000sha256.tdl.dto.KeyboardButtonSourceWebApp
import dev.g000sha256.tdl.dto.KeyboardButtonTypeRequestChat
import dev.g000sha256.tdl.dto.KeyboardButtonTypeRequestLocation
import dev.g000sha256.tdl.dto.KeyboardButtonTypeRequestManagedBot
import dev.g000sha256.tdl.dto.KeyboardButtonTypeRequestPhoneNumber
import dev.g000sha256.tdl.dto.KeyboardButtonTypeRequestPoll
import dev.g000sha256.tdl.dto.KeyboardButtonTypeRequestUsers
import dev.g000sha256.tdl.dto.KeyboardButtonTypeText
import dev.g000sha256.tdl.dto.KeyboardButtonTypeWebApp
import dev.g000sha256.tdl.dto.LabeledPricePart
import dev.g000sha256.tdl.dto.LanguagePackInfo
import dev.g000sha256.tdl.dto.LanguagePackString
import dev.g000sha256.tdl.dto.LanguagePackStringValueDeleted
import dev.g000sha256.tdl.dto.LanguagePackStringValueOrdinary
import dev.g000sha256.tdl.dto.LanguagePackStringValuePluralized
import dev.g000sha256.tdl.dto.LanguagePackStrings
import dev.g000sha256.tdl.dto.LinkPreview
import dev.g000sha256.tdl.dto.LinkPreviewAlbumMediaPhoto
import dev.g000sha256.tdl.dto.LinkPreviewAlbumMediaVideo
import dev.g000sha256.tdl.dto.LinkPreviewOptions
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
import dev.g000sha256.tdl.dto.LiveLocation
import dev.g000sha256.tdl.dto.LiveStoryDonors
import dev.g000sha256.tdl.dto.LocalFile
import dev.g000sha256.tdl.dto.LocalizationTargetInfo
import dev.g000sha256.tdl.dto.Location
import dev.g000sha256.tdl.dto.LocationAddress
import dev.g000sha256.tdl.dto.LogStreamDefault
import dev.g000sha256.tdl.dto.LogStreamEmpty
import dev.g000sha256.tdl.dto.LogStreamFile
import dev.g000sha256.tdl.dto.LogTags
import dev.g000sha256.tdl.dto.LogVerbosityLevel
import dev.g000sha256.tdl.dto.LoginUrlInfoOpen
import dev.g000sha256.tdl.dto.LoginUrlInfoRequestConfirmation
import dev.g000sha256.tdl.dto.MainWebApp
import dev.g000sha256.tdl.dto.MaskPointChin
import dev.g000sha256.tdl.dto.MaskPointEyes
import dev.g000sha256.tdl.dto.MaskPointForehead
import dev.g000sha256.tdl.dto.MaskPointMouth
import dev.g000sha256.tdl.dto.MaskPosition
import dev.g000sha256.tdl.dto.Message
import dev.g000sha256.tdl.dto.MessageAnimatedEmoji
import dev.g000sha256.tdl.dto.MessageAnimation
import dev.g000sha256.tdl.dto.MessageAudio
import dev.g000sha256.tdl.dto.MessageAutoDeleteTime
import dev.g000sha256.tdl.dto.MessageBasicGroupChatCreate
import dev.g000sha256.tdl.dto.MessageBotWriteAccessAllowed
import dev.g000sha256.tdl.dto.MessageCalendar
import dev.g000sha256.tdl.dto.MessageCalendarDay
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
import dev.g000sha256.tdl.dto.MessageCopyOptions
import dev.g000sha256.tdl.dto.MessageCustomServiceAction
import dev.g000sha256.tdl.dto.MessageDice
import dev.g000sha256.tdl.dto.MessageDirectMessagePriceChanged
import dev.g000sha256.tdl.dto.MessageDocument
import dev.g000sha256.tdl.dto.MessageEffect
import dev.g000sha256.tdl.dto.MessageEffectTypeEmojiReaction
import dev.g000sha256.tdl.dto.MessageEffectTypePremiumSticker
import dev.g000sha256.tdl.dto.MessageExpiredPhoto
import dev.g000sha256.tdl.dto.MessageExpiredVideo
import dev.g000sha256.tdl.dto.MessageExpiredVideoNote
import dev.g000sha256.tdl.dto.MessageExpiredVoiceNote
import dev.g000sha256.tdl.dto.MessageFileTypeGroup
import dev.g000sha256.tdl.dto.MessageFileTypePrivate
import dev.g000sha256.tdl.dto.MessageFileTypeUnknown
import dev.g000sha256.tdl.dto.MessageForumTopicCreated
import dev.g000sha256.tdl.dto.MessageForumTopicEdited
import dev.g000sha256.tdl.dto.MessageForumTopicIsClosedToggled
import dev.g000sha256.tdl.dto.MessageForumTopicIsHiddenToggled
import dev.g000sha256.tdl.dto.MessageForwardInfo
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
import dev.g000sha256.tdl.dto.MessageImportInfo
import dev.g000sha256.tdl.dto.MessageInteractionInfo
import dev.g000sha256.tdl.dto.MessageInviteVideoChatParticipants
import dev.g000sha256.tdl.dto.MessageInvoice
import dev.g000sha256.tdl.dto.MessageLink
import dev.g000sha256.tdl.dto.MessageLinkInfo
import dev.g000sha256.tdl.dto.MessageLiveLocation
import dev.g000sha256.tdl.dto.MessageLocation
import dev.g000sha256.tdl.dto.MessageManagedBotCreated
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
import dev.g000sha256.tdl.dto.MessagePosition
import dev.g000sha256.tdl.dto.MessagePositions
import dev.g000sha256.tdl.dto.MessagePremiumGiftCode
import dev.g000sha256.tdl.dto.MessageProperties
import dev.g000sha256.tdl.dto.MessageProximityAlertTriggered
import dev.g000sha256.tdl.dto.MessageReaction
import dev.g000sha256.tdl.dto.MessageReactions
import dev.g000sha256.tdl.dto.MessageReadDateMyPrivacyRestricted
import dev.g000sha256.tdl.dto.MessageReadDateRead
import dev.g000sha256.tdl.dto.MessageReadDateTooOld
import dev.g000sha256.tdl.dto.MessageReadDateUnread
import dev.g000sha256.tdl.dto.MessageReadDateUserPrivacyRestricted
import dev.g000sha256.tdl.dto.MessageRefundedUpgradedGift
import dev.g000sha256.tdl.dto.MessageReplyInfo
import dev.g000sha256.tdl.dto.MessageReplyToMessage
import dev.g000sha256.tdl.dto.MessageReplyToStory
import dev.g000sha256.tdl.dto.MessageRichMessage
import dev.g000sha256.tdl.dto.MessageSchedulingStateSendAtDate
import dev.g000sha256.tdl.dto.MessageSchedulingStateSendWhenOnline
import dev.g000sha256.tdl.dto.MessageSchedulingStateSendWhenVideoProcessed
import dev.g000sha256.tdl.dto.MessageScreenshotTaken
import dev.g000sha256.tdl.dto.MessageSelfDestructTypeImmediately
import dev.g000sha256.tdl.dto.MessageSelfDestructTypeTimer
import dev.g000sha256.tdl.dto.MessageSendOptions
import dev.g000sha256.tdl.dto.MessageSenderChat
import dev.g000sha256.tdl.dto.MessageSenderUser
import dev.g000sha256.tdl.dto.MessageSenders
import dev.g000sha256.tdl.dto.MessageSendingStateFailed
import dev.g000sha256.tdl.dto.MessageSendingStatePending
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
import dev.g000sha256.tdl.dto.MessageStatistics
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
import dev.g000sha256.tdl.dto.MessageThreadInfo
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
import dev.g000sha256.tdl.dto.MessageViewer
import dev.g000sha256.tdl.dto.MessageViewers
import dev.g000sha256.tdl.dto.MessageVoiceNote
import dev.g000sha256.tdl.dto.MessageWebAppDataReceived
import dev.g000sha256.tdl.dto.MessageWebAppDataSent
import dev.g000sha256.tdl.dto.Messages
import dev.g000sha256.tdl.dto.Minithumbnail
import dev.g000sha256.tdl.dto.NetworkStatistics
import dev.g000sha256.tdl.dto.NetworkStatisticsEntryCall
import dev.g000sha256.tdl.dto.NetworkStatisticsEntryFile
import dev.g000sha256.tdl.dto.NetworkTypeMobile
import dev.g000sha256.tdl.dto.NetworkTypeMobileRoaming
import dev.g000sha256.tdl.dto.NetworkTypeNone
import dev.g000sha256.tdl.dto.NetworkTypeOther
import dev.g000sha256.tdl.dto.NetworkTypeWiFi
import dev.g000sha256.tdl.dto.NewChatPrivacySettings
import dev.g000sha256.tdl.dto.NewSticker
import dev.g000sha256.tdl.dto.Notification
import dev.g000sha256.tdl.dto.NotificationGroup
import dev.g000sha256.tdl.dto.NotificationGroupTypeCalls
import dev.g000sha256.tdl.dto.NotificationGroupTypeMentions
import dev.g000sha256.tdl.dto.NotificationGroupTypeMessages
import dev.g000sha256.tdl.dto.NotificationGroupTypeSecretChat
import dev.g000sha256.tdl.dto.NotificationSettingsScopeChannelChats
import dev.g000sha256.tdl.dto.NotificationSettingsScopeGroupChats
import dev.g000sha256.tdl.dto.NotificationSettingsScopePrivateChats
import dev.g000sha256.tdl.dto.NotificationSound
import dev.g000sha256.tdl.dto.NotificationSounds
import dev.g000sha256.tdl.dto.NotificationTypeNewCall
import dev.g000sha256.tdl.dto.NotificationTypeNewMessage
import dev.g000sha256.tdl.dto.NotificationTypeNewPushMessage
import dev.g000sha256.tdl.dto.NotificationTypeNewSecretChat
import dev.g000sha256.tdl.dto.OauthLinkInfo
import dev.g000sha256.tdl.dto.Ok
import dev.g000sha256.tdl.dto.OptionValueBoolean
import dev.g000sha256.tdl.dto.OptionValueEmpty
import dev.g000sha256.tdl.dto.OptionValueInteger
import dev.g000sha256.tdl.dto.OptionValueString
import dev.g000sha256.tdl.dto.OrderInfo
import dev.g000sha256.tdl.dto.Outline
import dev.g000sha256.tdl.dto.PageBlockAnchor
import dev.g000sha256.tdl.dto.PageBlockAnimation
import dev.g000sha256.tdl.dto.PageBlockAudio
import dev.g000sha256.tdl.dto.PageBlockAuthorDate
import dev.g000sha256.tdl.dto.PageBlockBlockQuote
import dev.g000sha256.tdl.dto.PageBlockCaption
import dev.g000sha256.tdl.dto.PageBlockChatLink
import dev.g000sha256.tdl.dto.PageBlockCollage
import dev.g000sha256.tdl.dto.PageBlockCover
import dev.g000sha256.tdl.dto.PageBlockDetails
import dev.g000sha256.tdl.dto.PageBlockDivider
import dev.g000sha256.tdl.dto.PageBlockEmbedded
import dev.g000sha256.tdl.dto.PageBlockEmbeddedPost
import dev.g000sha256.tdl.dto.PageBlockFooter
import dev.g000sha256.tdl.dto.PageBlockHeader
import dev.g000sha256.tdl.dto.PageBlockHorizontalAlignmentCenter
import dev.g000sha256.tdl.dto.PageBlockHorizontalAlignmentLeft
import dev.g000sha256.tdl.dto.PageBlockHorizontalAlignmentRight
import dev.g000sha256.tdl.dto.PageBlockKicker
import dev.g000sha256.tdl.dto.PageBlockList
import dev.g000sha256.tdl.dto.PageBlockListItem
import dev.g000sha256.tdl.dto.PageBlockMap
import dev.g000sha256.tdl.dto.PageBlockMathematicalExpression
import dev.g000sha256.tdl.dto.PageBlockParagraph
import dev.g000sha256.tdl.dto.PageBlockPhoto
import dev.g000sha256.tdl.dto.PageBlockPreformatted
import dev.g000sha256.tdl.dto.PageBlockPullQuote
import dev.g000sha256.tdl.dto.PageBlockRelatedArticle
import dev.g000sha256.tdl.dto.PageBlockRelatedArticles
import dev.g000sha256.tdl.dto.PageBlockSectionHeading
import dev.g000sha256.tdl.dto.PageBlockSlideshow
import dev.g000sha256.tdl.dto.PageBlockSubheader
import dev.g000sha256.tdl.dto.PageBlockSubtitle
import dev.g000sha256.tdl.dto.PageBlockTable
import dev.g000sha256.tdl.dto.PageBlockTableCell
import dev.g000sha256.tdl.dto.PageBlockThinking
import dev.g000sha256.tdl.dto.PageBlockTitle
import dev.g000sha256.tdl.dto.PageBlockVerticalAlignmentBottom
import dev.g000sha256.tdl.dto.PageBlockVerticalAlignmentMiddle
import dev.g000sha256.tdl.dto.PageBlockVerticalAlignmentTop
import dev.g000sha256.tdl.dto.PageBlockVideo
import dev.g000sha256.tdl.dto.PageBlockVoiceNote
import dev.g000sha256.tdl.dto.PaidMediaPhoto
import dev.g000sha256.tdl.dto.PaidMediaPreview
import dev.g000sha256.tdl.dto.PaidMediaUnsupported
import dev.g000sha256.tdl.dto.PaidMediaVideo
import dev.g000sha256.tdl.dto.PaidReactionTypeAnonymous
import dev.g000sha256.tdl.dto.PaidReactionTypeChat
import dev.g000sha256.tdl.dto.PaidReactionTypeRegular
import dev.g000sha256.tdl.dto.PaidReactor
import dev.g000sha256.tdl.dto.Passkey
import dev.g000sha256.tdl.dto.Passkeys
import dev.g000sha256.tdl.dto.PassportAuthorizationForm
import dev.g000sha256.tdl.dto.PassportElementAddress
import dev.g000sha256.tdl.dto.PassportElementBankStatement
import dev.g000sha256.tdl.dto.PassportElementDriverLicense
import dev.g000sha256.tdl.dto.PassportElementEmailAddress
import dev.g000sha256.tdl.dto.PassportElementError
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
import dev.g000sha256.tdl.dto.PassportElements
import dev.g000sha256.tdl.dto.PassportElementsWithErrors
import dev.g000sha256.tdl.dto.PassportRequiredElement
import dev.g000sha256.tdl.dto.PassportSuitableElement
import dev.g000sha256.tdl.dto.PasswordState
import dev.g000sha256.tdl.dto.PaymentForm
import dev.g000sha256.tdl.dto.PaymentFormTypeRegular
import dev.g000sha256.tdl.dto.PaymentFormTypeStarSubscription
import dev.g000sha256.tdl.dto.PaymentFormTypeStars
import dev.g000sha256.tdl.dto.PaymentOption
import dev.g000sha256.tdl.dto.PaymentProviderOther
import dev.g000sha256.tdl.dto.PaymentProviderSmartGlocal
import dev.g000sha256.tdl.dto.PaymentProviderStripe
import dev.g000sha256.tdl.dto.PaymentReceipt
import dev.g000sha256.tdl.dto.PaymentReceiptTypeRegular
import dev.g000sha256.tdl.dto.PaymentReceiptTypeStars
import dev.g000sha256.tdl.dto.PaymentResult
import dev.g000sha256.tdl.dto.PersonalDetails
import dev.g000sha256.tdl.dto.PersonalDocument
import dev.g000sha256.tdl.dto.PhoneNumberAuthenticationSettings
import dev.g000sha256.tdl.dto.PhoneNumberCodeTypeChange
import dev.g000sha256.tdl.dto.PhoneNumberCodeTypeConfirmOwnership
import dev.g000sha256.tdl.dto.PhoneNumberCodeTypeVerify
import dev.g000sha256.tdl.dto.PhoneNumberInfo
import dev.g000sha256.tdl.dto.Photo
import dev.g000sha256.tdl.dto.PhotoSize
import dev.g000sha256.tdl.dto.Point
import dev.g000sha256.tdl.dto.Poll
import dev.g000sha256.tdl.dto.PollMediaAnimation
import dev.g000sha256.tdl.dto.PollMediaAudio
import dev.g000sha256.tdl.dto.PollMediaDocument
import dev.g000sha256.tdl.dto.PollMediaLink
import dev.g000sha256.tdl.dto.PollMediaLocation
import dev.g000sha256.tdl.dto.PollMediaPhoto
import dev.g000sha256.tdl.dto.PollMediaSticker
import dev.g000sha256.tdl.dto.PollMediaVenue
import dev.g000sha256.tdl.dto.PollMediaVideo
import dev.g000sha256.tdl.dto.PollOption
import dev.g000sha256.tdl.dto.PollOptionProperties
import dev.g000sha256.tdl.dto.PollTypeQuiz
import dev.g000sha256.tdl.dto.PollTypeRegular
import dev.g000sha256.tdl.dto.PollVoteRestrictionReasonClosed
import dev.g000sha256.tdl.dto.PollVoteRestrictionReasonCountryRestricted
import dev.g000sha256.tdl.dto.PollVoteRestrictionReasonMembershipRequired
import dev.g000sha256.tdl.dto.PollVoteRestrictionReasonOther
import dev.g000sha256.tdl.dto.PollVoteRestrictionReasonScheduled
import dev.g000sha256.tdl.dto.PollVoteRestrictionReasonYetUnsent
import dev.g000sha256.tdl.dto.PollVoteStatistics
import dev.g000sha256.tdl.dto.PollVoter
import dev.g000sha256.tdl.dto.PollVoters
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
import dev.g000sha256.tdl.dto.PremiumFeaturePromotionAnimation
import dev.g000sha256.tdl.dto.PremiumFeatureProtectPrivateChatContent
import dev.g000sha256.tdl.dto.PremiumFeatureRealTimeChatTranslation
import dev.g000sha256.tdl.dto.PremiumFeatureRichMessages
import dev.g000sha256.tdl.dto.PremiumFeatureSavedMessagesTags
import dev.g000sha256.tdl.dto.PremiumFeatureTextComposition
import dev.g000sha256.tdl.dto.PremiumFeatureUniqueReactions
import dev.g000sha256.tdl.dto.PremiumFeatureUniqueStickers
import dev.g000sha256.tdl.dto.PremiumFeatureUpgradedStories
import dev.g000sha256.tdl.dto.PremiumFeatureVoiceRecognition
import dev.g000sha256.tdl.dto.PremiumFeatures
import dev.g000sha256.tdl.dto.PremiumGiftCodeInfo
import dev.g000sha256.tdl.dto.PremiumGiftPaymentOption
import dev.g000sha256.tdl.dto.PremiumGiftPaymentOptions
import dev.g000sha256.tdl.dto.PremiumGiveawayPaymentOption
import dev.g000sha256.tdl.dto.PremiumGiveawayPaymentOptions
import dev.g000sha256.tdl.dto.PremiumLimit
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
import dev.g000sha256.tdl.dto.PremiumPaymentOption
import dev.g000sha256.tdl.dto.PremiumSourceBusinessFeature
import dev.g000sha256.tdl.dto.PremiumSourceFeature
import dev.g000sha256.tdl.dto.PremiumSourceLimitExceeded
import dev.g000sha256.tdl.dto.PremiumSourceLink
import dev.g000sha256.tdl.dto.PremiumSourceSettings
import dev.g000sha256.tdl.dto.PremiumSourceStoryFeature
import dev.g000sha256.tdl.dto.PremiumState
import dev.g000sha256.tdl.dto.PremiumStatePaymentOption
import dev.g000sha256.tdl.dto.PremiumStoryFeatureCustomExpirationDuration
import dev.g000sha256.tdl.dto.PremiumStoryFeatureLinksAndFormatting
import dev.g000sha256.tdl.dto.PremiumStoryFeaturePermanentViewsHistory
import dev.g000sha256.tdl.dto.PremiumStoryFeaturePriorityOrder
import dev.g000sha256.tdl.dto.PremiumStoryFeatureSaveStories
import dev.g000sha256.tdl.dto.PremiumStoryFeatureStealthMode
import dev.g000sha256.tdl.dto.PremiumStoryFeatureVideoQuality
import dev.g000sha256.tdl.dto.PrepaidGiveaway
import dev.g000sha256.tdl.dto.PreparedInlineMessage
import dev.g000sha256.tdl.dto.PreparedInlineMessageId
import dev.g000sha256.tdl.dto.ProductInfo
import dev.g000sha256.tdl.dto.ProfileAccentColor
import dev.g000sha256.tdl.dto.ProfileAccentColors
import dev.g000sha256.tdl.dto.ProfilePhoto
import dev.g000sha256.tdl.dto.ProfileTabFiles
import dev.g000sha256.tdl.dto.ProfileTabGifs
import dev.g000sha256.tdl.dto.ProfileTabGifts
import dev.g000sha256.tdl.dto.ProfileTabLinks
import dev.g000sha256.tdl.dto.ProfileTabMedia
import dev.g000sha256.tdl.dto.ProfileTabMusic
import dev.g000sha256.tdl.dto.ProfileTabPosts
import dev.g000sha256.tdl.dto.ProfileTabVoice
import dev.g000sha256.tdl.dto.Proxy
import dev.g000sha256.tdl.dto.ProxyTypeHttp
import dev.g000sha256.tdl.dto.ProxyTypeMtproto
import dev.g000sha256.tdl.dto.ProxyTypeSocks5
import dev.g000sha256.tdl.dto.PublicChatTypeHasUsername
import dev.g000sha256.tdl.dto.PublicChatTypeIsLocationBased
import dev.g000sha256.tdl.dto.PublicForwardMessage
import dev.g000sha256.tdl.dto.PublicForwardStory
import dev.g000sha256.tdl.dto.PublicForwards
import dev.g000sha256.tdl.dto.PublicPostSearchLimits
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
import dev.g000sha256.tdl.dto.PushReceiverId
import dev.g000sha256.tdl.dto.QuickReplyMessage
import dev.g000sha256.tdl.dto.QuickReplyMessages
import dev.g000sha256.tdl.dto.QuickReplyShortcut
import dev.g000sha256.tdl.dto.ReactionNotificationSettings
import dev.g000sha256.tdl.dto.ReactionNotificationSourceAll
import dev.g000sha256.tdl.dto.ReactionNotificationSourceContacts
import dev.g000sha256.tdl.dto.ReactionNotificationSourceNone
import dev.g000sha256.tdl.dto.ReactionTypeCustomEmoji
import dev.g000sha256.tdl.dto.ReactionTypeEmoji
import dev.g000sha256.tdl.dto.ReactionTypePaid
import dev.g000sha256.tdl.dto.ReactionUnavailabilityReasonAnonymousAdministrator
import dev.g000sha256.tdl.dto.ReactionUnavailabilityReasonGuest
import dev.g000sha256.tdl.dto.ReactionUnavailabilityReasonRestricted
import dev.g000sha256.tdl.dto.ReadDatePrivacySettings
import dev.g000sha256.tdl.dto.ReceivedGift
import dev.g000sha256.tdl.dto.ReceivedGifts
import dev.g000sha256.tdl.dto.RecommendedChatFolder
import dev.g000sha256.tdl.dto.RecommendedChatFolders
import dev.g000sha256.tdl.dto.RecoveryEmailAddress
import dev.g000sha256.tdl.dto.RemoteFile
import dev.g000sha256.tdl.dto.ReplyMarkupForceReply
import dev.g000sha256.tdl.dto.ReplyMarkupInlineKeyboard
import dev.g000sha256.tdl.dto.ReplyMarkupRemoveKeyboard
import dev.g000sha256.tdl.dto.ReplyMarkupShowKeyboard
import dev.g000sha256.tdl.dto.ReportChatResultMessagesRequired
import dev.g000sha256.tdl.dto.ReportChatResultOk
import dev.g000sha256.tdl.dto.ReportChatResultOptionRequired
import dev.g000sha256.tdl.dto.ReportChatResultTextRequired
import dev.g000sha256.tdl.dto.ReportOption
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
import dev.g000sha256.tdl.dto.ReportSponsoredResultAdsHidden
import dev.g000sha256.tdl.dto.ReportSponsoredResultFailed
import dev.g000sha256.tdl.dto.ReportSponsoredResultOk
import dev.g000sha256.tdl.dto.ReportSponsoredResultOptionRequired
import dev.g000sha256.tdl.dto.ReportSponsoredResultPremiumRequired
import dev.g000sha256.tdl.dto.ReportStoryResultOk
import dev.g000sha256.tdl.dto.ReportStoryResultOptionRequired
import dev.g000sha256.tdl.dto.ReportStoryResultTextRequired
import dev.g000sha256.tdl.dto.ResendCodeReasonUserRequest
import dev.g000sha256.tdl.dto.ResendCodeReasonVerificationFailed
import dev.g000sha256.tdl.dto.ResetPasswordResultDeclined
import dev.g000sha256.tdl.dto.ResetPasswordResultOk
import dev.g000sha256.tdl.dto.ResetPasswordResultPending
import dev.g000sha256.tdl.dto.RestrictionInfo
import dev.g000sha256.tdl.dto.RevenueWithdrawalStateFailed
import dev.g000sha256.tdl.dto.RevenueWithdrawalStatePending
import dev.g000sha256.tdl.dto.RevenueWithdrawalStateSucceeded
import dev.g000sha256.tdl.dto.RichMessage
import dev.g000sha256.tdl.dto.RichMessageSourceBlocks
import dev.g000sha256.tdl.dto.RichMessageSourceHtml
import dev.g000sha256.tdl.dto.RichMessageSourceMarkdown
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
import dev.g000sha256.tdl.dto.RtmpUrl
import dev.g000sha256.tdl.dto.SavedCredentials
import dev.g000sha256.tdl.dto.SavedMessagesTag
import dev.g000sha256.tdl.dto.SavedMessagesTags
import dev.g000sha256.tdl.dto.SavedMessagesTopic
import dev.g000sha256.tdl.dto.SavedMessagesTopicTypeAuthorHidden
import dev.g000sha256.tdl.dto.SavedMessagesTopicTypeMyNotes
import dev.g000sha256.tdl.dto.SavedMessagesTopicTypeSavedFromChat
import dev.g000sha256.tdl.dto.ScopeAutosaveSettings
import dev.g000sha256.tdl.dto.ScopeNotificationSettings
import dev.g000sha256.tdl.dto.SearchChatTypeFilterBot
import dev.g000sha256.tdl.dto.SearchChatTypeFilterChannel
import dev.g000sha256.tdl.dto.SearchMessagesChatTypeFilterChannel
import dev.g000sha256.tdl.dto.SearchMessagesChatTypeFilterGroup
import dev.g000sha256.tdl.dto.SearchMessagesChatTypeFilterPrivate
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
import dev.g000sha256.tdl.dto.Seconds
import dev.g000sha256.tdl.dto.SecretChat
import dev.g000sha256.tdl.dto.SecretChatStateClosed
import dev.g000sha256.tdl.dto.SecretChatStatePending
import dev.g000sha256.tdl.dto.SecretChatStateReady
import dev.g000sha256.tdl.dto.SentGiftRegular
import dev.g000sha256.tdl.dto.SentGiftUpgraded
import dev.g000sha256.tdl.dto.Session
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
import dev.g000sha256.tdl.dto.SessionTypeConnectedBot
import dev.g000sha256.tdl.dto.SessionTypeDevice
import dev.g000sha256.tdl.dto.Sessions
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
import dev.g000sha256.tdl.dto.SharedChat
import dev.g000sha256.tdl.dto.SharedUser
import dev.g000sha256.tdl.dto.ShippingOption
import dev.g000sha256.tdl.dto.SpeechRecognitionResultError
import dev.g000sha256.tdl.dto.SpeechRecognitionResultPending
import dev.g000sha256.tdl.dto.SpeechRecognitionResultText
import dev.g000sha256.tdl.dto.SponsoredChat
import dev.g000sha256.tdl.dto.SponsoredChats
import dev.g000sha256.tdl.dto.SponsoredMessage
import dev.g000sha256.tdl.dto.SponsoredMessages
import dev.g000sha256.tdl.dto.StakeDiceState
import dev.g000sha256.tdl.dto.StarAmount
import dev.g000sha256.tdl.dto.StarCount
import dev.g000sha256.tdl.dto.StarGiveawayPaymentOption
import dev.g000sha256.tdl.dto.StarGiveawayPaymentOptions
import dev.g000sha256.tdl.dto.StarGiveawayWinnerOption
import dev.g000sha256.tdl.dto.StarPaymentOption
import dev.g000sha256.tdl.dto.StarPaymentOptions
import dev.g000sha256.tdl.dto.StarRevenueStatistics
import dev.g000sha256.tdl.dto.StarRevenueStatus
import dev.g000sha256.tdl.dto.StarSubscription
import dev.g000sha256.tdl.dto.StarSubscriptionPricing
import dev.g000sha256.tdl.dto.StarSubscriptionTypeBot
import dev.g000sha256.tdl.dto.StarSubscriptionTypeChannel
import dev.g000sha256.tdl.dto.StarSubscriptions
import dev.g000sha256.tdl.dto.StarTransaction
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
import dev.g000sha256.tdl.dto.StarTransactions
import dev.g000sha256.tdl.dto.StartLiveStoryResultFail
import dev.g000sha256.tdl.dto.StartLiveStoryResultOk
import dev.g000sha256.tdl.dto.StatisticalGraphAsync
import dev.g000sha256.tdl.dto.StatisticalGraphData
import dev.g000sha256.tdl.dto.StatisticalGraphError
import dev.g000sha256.tdl.dto.StatisticalValue
import dev.g000sha256.tdl.dto.Sticker
import dev.g000sha256.tdl.dto.StickerFormatTgs
import dev.g000sha256.tdl.dto.StickerFormatWebm
import dev.g000sha256.tdl.dto.StickerFormatWebp
import dev.g000sha256.tdl.dto.StickerFullTypeCustomEmoji
import dev.g000sha256.tdl.dto.StickerFullTypeMask
import dev.g000sha256.tdl.dto.StickerFullTypeRegular
import dev.g000sha256.tdl.dto.StickerSet
import dev.g000sha256.tdl.dto.StickerSetInfo
import dev.g000sha256.tdl.dto.StickerSets
import dev.g000sha256.tdl.dto.StickerTypeCustomEmoji
import dev.g000sha256.tdl.dto.StickerTypeMask
import dev.g000sha256.tdl.dto.StickerTypeRegular
import dev.g000sha256.tdl.dto.Stickers
import dev.g000sha256.tdl.dto.StorageStatistics
import dev.g000sha256.tdl.dto.StorageStatisticsByChat
import dev.g000sha256.tdl.dto.StorageStatisticsByFileType
import dev.g000sha256.tdl.dto.StorageStatisticsFast
import dev.g000sha256.tdl.dto.StorePaymentPurposeGiftedStars
import dev.g000sha256.tdl.dto.StorePaymentPurposePremiumGift
import dev.g000sha256.tdl.dto.StorePaymentPurposePremiumGiftCodes
import dev.g000sha256.tdl.dto.StorePaymentPurposePremiumGiveaway
import dev.g000sha256.tdl.dto.StorePaymentPurposePremiumSubscription
import dev.g000sha256.tdl.dto.StorePaymentPurposeStarGiveaway
import dev.g000sha256.tdl.dto.StorePaymentPurposeStars
import dev.g000sha256.tdl.dto.StoreTransactionAppStore
import dev.g000sha256.tdl.dto.StoreTransactionGooglePlay
import dev.g000sha256.tdl.dto.Stories
import dev.g000sha256.tdl.dto.Story
import dev.g000sha256.tdl.dto.StoryAlbum
import dev.g000sha256.tdl.dto.StoryAlbums
import dev.g000sha256.tdl.dto.StoryArea
import dev.g000sha256.tdl.dto.StoryAreaPosition
import dev.g000sha256.tdl.dto.StoryAreaTypeLink
import dev.g000sha256.tdl.dto.StoryAreaTypeLocation
import dev.g000sha256.tdl.dto.StoryAreaTypeMessage
import dev.g000sha256.tdl.dto.StoryAreaTypeSuggestedReaction
import dev.g000sha256.tdl.dto.StoryAreaTypeUpgradedGift
import dev.g000sha256.tdl.dto.StoryAreaTypeVenue
import dev.g000sha256.tdl.dto.StoryAreaTypeWeather
import dev.g000sha256.tdl.dto.StoryContentLive
import dev.g000sha256.tdl.dto.StoryContentPhoto
import dev.g000sha256.tdl.dto.StoryContentTypeLive
import dev.g000sha256.tdl.dto.StoryContentTypePhoto
import dev.g000sha256.tdl.dto.StoryContentTypeUnsupported
import dev.g000sha256.tdl.dto.StoryContentTypeVideo
import dev.g000sha256.tdl.dto.StoryContentUnsupported
import dev.g000sha256.tdl.dto.StoryContentVideo
import dev.g000sha256.tdl.dto.StoryFullId
import dev.g000sha256.tdl.dto.StoryInfo
import dev.g000sha256.tdl.dto.StoryInteraction
import dev.g000sha256.tdl.dto.StoryInteractionInfo
import dev.g000sha256.tdl.dto.StoryInteractionTypeForward
import dev.g000sha256.tdl.dto.StoryInteractionTypeRepost
import dev.g000sha256.tdl.dto.StoryInteractionTypeView
import dev.g000sha256.tdl.dto.StoryInteractions
import dev.g000sha256.tdl.dto.StoryListArchive
import dev.g000sha256.tdl.dto.StoryListMain
import dev.g000sha256.tdl.dto.StoryOriginHiddenUser
import dev.g000sha256.tdl.dto.StoryOriginPublicStory
import dev.g000sha256.tdl.dto.StoryPrivacySettingsCloseFriends
import dev.g000sha256.tdl.dto.StoryPrivacySettingsContacts
import dev.g000sha256.tdl.dto.StoryPrivacySettingsEveryone
import dev.g000sha256.tdl.dto.StoryPrivacySettingsSelectedUsers
import dev.g000sha256.tdl.dto.StoryRepostInfo
import dev.g000sha256.tdl.dto.StoryStatistics
import dev.g000sha256.tdl.dto.StoryVideo
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
import dev.g000sha256.tdl.dto.SuggestedPostInfo
import dev.g000sha256.tdl.dto.SuggestedPostPriceGram
import dev.g000sha256.tdl.dto.SuggestedPostPriceStar
import dev.g000sha256.tdl.dto.SuggestedPostRefundReasonPaymentRefunded
import dev.g000sha256.tdl.dto.SuggestedPostRefundReasonPostDeleted
import dev.g000sha256.tdl.dto.SuggestedPostStateApproved
import dev.g000sha256.tdl.dto.SuggestedPostStateDeclined
import dev.g000sha256.tdl.dto.SuggestedPostStatePending
import dev.g000sha256.tdl.dto.Supergroup
import dev.g000sha256.tdl.dto.SupergroupFullInfo
import dev.g000sha256.tdl.dto.SupergroupMembersFilterAdministrators
import dev.g000sha256.tdl.dto.SupergroupMembersFilterBanned
import dev.g000sha256.tdl.dto.SupergroupMembersFilterBots
import dev.g000sha256.tdl.dto.SupergroupMembersFilterContacts
import dev.g000sha256.tdl.dto.SupergroupMembersFilterMention
import dev.g000sha256.tdl.dto.SupergroupMembersFilterRecent
import dev.g000sha256.tdl.dto.SupergroupMembersFilterRestricted
import dev.g000sha256.tdl.dto.SupergroupMembersFilterSearch
import dev.g000sha256.tdl.dto.TMeUrl
import dev.g000sha256.tdl.dto.TMeUrlTypeChatInvite
import dev.g000sha256.tdl.dto.TMeUrlTypeStickerSet
import dev.g000sha256.tdl.dto.TMeUrlTypeSupergroup
import dev.g000sha256.tdl.dto.TMeUrlTypeUser
import dev.g000sha256.tdl.dto.TMeUrls
import dev.g000sha256.tdl.dto.TargetChatChosen
import dev.g000sha256.tdl.dto.TargetChatCurrent
import dev.g000sha256.tdl.dto.TargetChatInternalLink
import dev.g000sha256.tdl.dto.TargetChatTypes
import dev.g000sha256.tdl.dto.TelegramPaymentPurposeGiftedStars
import dev.g000sha256.tdl.dto.TelegramPaymentPurposeJoinChat
import dev.g000sha256.tdl.dto.TelegramPaymentPurposePremiumGift
import dev.g000sha256.tdl.dto.TelegramPaymentPurposePremiumGiftCodes
import dev.g000sha256.tdl.dto.TelegramPaymentPurposePremiumGiveaway
import dev.g000sha256.tdl.dto.TelegramPaymentPurposeStarGiveaway
import dev.g000sha256.tdl.dto.TelegramPaymentPurposeStars
import dev.g000sha256.tdl.dto.TemporaryPasswordState
import dev.g000sha256.tdl.dto.TermsOfService
import dev.g000sha256.tdl.dto.TestBytes
import dev.g000sha256.tdl.dto.TestInt
import dev.g000sha256.tdl.dto.TestString
import dev.g000sha256.tdl.dto.TestVectorInt
import dev.g000sha256.tdl.dto.TestVectorIntObject
import dev.g000sha256.tdl.dto.TestVectorString
import dev.g000sha256.tdl.dto.TestVectorStringObject
import dev.g000sha256.tdl.dto.Text
import dev.g000sha256.tdl.dto.TextCompositionStyle
import dev.g000sha256.tdl.dto.TextCompositionStyleExample
import dev.g000sha256.tdl.dto.TextEntities
import dev.g000sha256.tdl.dto.TextEntity
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
import dev.g000sha256.tdl.dto.TextParseModeHTML
import dev.g000sha256.tdl.dto.TextParseModeMarkdown
import dev.g000sha256.tdl.dto.TextQuote
import dev.g000sha256.tdl.dto.ThemeParameters
import dev.g000sha256.tdl.dto.ThemeSettings
import dev.g000sha256.tdl.dto.Thumbnail
import dev.g000sha256.tdl.dto.ThumbnailFormatGif
import dev.g000sha256.tdl.dto.ThumbnailFormatJpeg
import dev.g000sha256.tdl.dto.ThumbnailFormatMpeg4
import dev.g000sha256.tdl.dto.ThumbnailFormatPng
import dev.g000sha256.tdl.dto.ThumbnailFormatTgs
import dev.g000sha256.tdl.dto.ThumbnailFormatWebm
import dev.g000sha256.tdl.dto.ThumbnailFormatWebp
import dev.g000sha256.tdl.dto.TimeZone
import dev.g000sha256.tdl.dto.TimeZones
import dev.g000sha256.tdl.dto.TonTransaction
import dev.g000sha256.tdl.dto.TonTransactionTypeFragmentDeposit
import dev.g000sha256.tdl.dto.TonTransactionTypeFragmentWithdrawal
import dev.g000sha256.tdl.dto.TonTransactionTypeGiftPurchaseOffer
import dev.g000sha256.tdl.dto.TonTransactionTypeStakeDicePayout
import dev.g000sha256.tdl.dto.TonTransactionTypeStakeDiceStake
import dev.g000sha256.tdl.dto.TonTransactionTypeSuggestedPostPayment
import dev.g000sha256.tdl.dto.TonTransactionTypeUnsupported
import dev.g000sha256.tdl.dto.TonTransactionTypeUpgradedGiftPurchase
import dev.g000sha256.tdl.dto.TonTransactionTypeUpgradedGiftSale
import dev.g000sha256.tdl.dto.TonTransactions
import dev.g000sha256.tdl.dto.TopChatCategoryBots
import dev.g000sha256.tdl.dto.TopChatCategoryCalls
import dev.g000sha256.tdl.dto.TopChatCategoryChannels
import dev.g000sha256.tdl.dto.TopChatCategoryForwardChats
import dev.g000sha256.tdl.dto.TopChatCategoryGroups
import dev.g000sha256.tdl.dto.TopChatCategoryGuestBots
import dev.g000sha256.tdl.dto.TopChatCategoryInlineBots
import dev.g000sha256.tdl.dto.TopChatCategoryUsers
import dev.g000sha256.tdl.dto.TopChatCategoryWebAppBots
import dev.g000sha256.tdl.dto.TransactionDirectionIncoming
import dev.g000sha256.tdl.dto.TransactionDirectionOutgoing
import dev.g000sha256.tdl.dto.TrendingStickerSets
import dev.g000sha256.tdl.dto.UnconfirmedSession
import dev.g000sha256.tdl.dto.UnreadReaction
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
import dev.g000sha256.tdl.dto.Updates
import dev.g000sha256.tdl.dto.UpgradeGiftResult
import dev.g000sha256.tdl.dto.UpgradedGift
import dev.g000sha256.tdl.dto.UpgradedGiftAttributeIdBackdrop
import dev.g000sha256.tdl.dto.UpgradedGiftAttributeIdModel
import dev.g000sha256.tdl.dto.UpgradedGiftAttributeIdSymbol
import dev.g000sha256.tdl.dto.UpgradedGiftAttributeRarityEpic
import dev.g000sha256.tdl.dto.UpgradedGiftAttributeRarityLegendary
import dev.g000sha256.tdl.dto.UpgradedGiftAttributeRarityPerMille
import dev.g000sha256.tdl.dto.UpgradedGiftAttributeRarityRare
import dev.g000sha256.tdl.dto.UpgradedGiftAttributeRarityUncommon
import dev.g000sha256.tdl.dto.UpgradedGiftBackdrop
import dev.g000sha256.tdl.dto.UpgradedGiftBackdropColors
import dev.g000sha256.tdl.dto.UpgradedGiftBackdropCount
import dev.g000sha256.tdl.dto.UpgradedGiftColors
import dev.g000sha256.tdl.dto.UpgradedGiftModel
import dev.g000sha256.tdl.dto.UpgradedGiftModelCount
import dev.g000sha256.tdl.dto.UpgradedGiftOriginBlockchain
import dev.g000sha256.tdl.dto.UpgradedGiftOriginCraft
import dev.g000sha256.tdl.dto.UpgradedGiftOriginOffer
import dev.g000sha256.tdl.dto.UpgradedGiftOriginPrepaidUpgrade
import dev.g000sha256.tdl.dto.UpgradedGiftOriginResale
import dev.g000sha256.tdl.dto.UpgradedGiftOriginTransfer
import dev.g000sha256.tdl.dto.UpgradedGiftOriginUpgrade
import dev.g000sha256.tdl.dto.UpgradedGiftOriginalDetails
import dev.g000sha256.tdl.dto.UpgradedGiftSymbol
import dev.g000sha256.tdl.dto.UpgradedGiftSymbolCount
import dev.g000sha256.tdl.dto.UpgradedGiftValueInfo
import dev.g000sha256.tdl.dto.User
import dev.g000sha256.tdl.dto.UserAuctionBid
import dev.g000sha256.tdl.dto.UserFullInfo
import dev.g000sha256.tdl.dto.UserLink
import dev.g000sha256.tdl.dto.UserPrivacySettingAllowCalls
import dev.g000sha256.tdl.dto.UserPrivacySettingAllowChatInvites
import dev.g000sha256.tdl.dto.UserPrivacySettingAllowFindingByPhoneNumber
import dev.g000sha256.tdl.dto.UserPrivacySettingAllowPeerToPeerCalls
import dev.g000sha256.tdl.dto.UserPrivacySettingAllowPrivateVoiceAndVideoNoteMessages
import dev.g000sha256.tdl.dto.UserPrivacySettingAllowUnpaidMessages
import dev.g000sha256.tdl.dto.UserPrivacySettingAutosaveGifts
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
import dev.g000sha256.tdl.dto.UserPrivacySettingRules
import dev.g000sha256.tdl.dto.UserPrivacySettingShowBio
import dev.g000sha256.tdl.dto.UserPrivacySettingShowBirthdate
import dev.g000sha256.tdl.dto.UserPrivacySettingShowLinkInForwardedMessages
import dev.g000sha256.tdl.dto.UserPrivacySettingShowPhoneNumber
import dev.g000sha256.tdl.dto.UserPrivacySettingShowProfileAudio
import dev.g000sha256.tdl.dto.UserPrivacySettingShowProfilePhoto
import dev.g000sha256.tdl.dto.UserPrivacySettingShowStatus
import dev.g000sha256.tdl.dto.UserRating
import dev.g000sha256.tdl.dto.UserStatusEmpty
import dev.g000sha256.tdl.dto.UserStatusLastMonth
import dev.g000sha256.tdl.dto.UserStatusLastWeek
import dev.g000sha256.tdl.dto.UserStatusOffline
import dev.g000sha256.tdl.dto.UserStatusOnline
import dev.g000sha256.tdl.dto.UserStatusRecently
import dev.g000sha256.tdl.dto.UserSupportInfo
import dev.g000sha256.tdl.dto.UserTypeBot
import dev.g000sha256.tdl.dto.UserTypeDeleted
import dev.g000sha256.tdl.dto.UserTypeRegular
import dev.g000sha256.tdl.dto.UserTypeUnknown
import dev.g000sha256.tdl.dto.Usernames
import dev.g000sha256.tdl.dto.Users
import dev.g000sha256.tdl.dto.ValidatedOrderInfo
import dev.g000sha256.tdl.dto.VectorPathCommandCubicBezierCurve
import dev.g000sha256.tdl.dto.VectorPathCommandLine
import dev.g000sha256.tdl.dto.Venue
import dev.g000sha256.tdl.dto.VerificationStatus
import dev.g000sha256.tdl.dto.Video
import dev.g000sha256.tdl.dto.VideoChat
import dev.g000sha256.tdl.dto.VideoMessageAdvertisement
import dev.g000sha256.tdl.dto.VideoMessageAdvertisements
import dev.g000sha256.tdl.dto.VideoNote
import dev.g000sha256.tdl.dto.VideoStoryboard
import dev.g000sha256.tdl.dto.VoiceNote
import dev.g000sha256.tdl.dto.WebApp
import dev.g000sha256.tdl.dto.WebAppInfo
import dev.g000sha256.tdl.dto.WebAppOpenModeCompact
import dev.g000sha256.tdl.dto.WebAppOpenModeFullScreen
import dev.g000sha256.tdl.dto.WebAppOpenModeFullSize
import dev.g000sha256.tdl.dto.WebAppOpenParameters
import dev.g000sha256.tdl.dto.WebAppUrl
import dev.g000sha256.tdl.dto.WebBrowserSettings
import dev.g000sha256.tdl.dto.WebBrowserTypeExternal
import dev.g000sha256.tdl.dto.WebBrowserTypeInApp
import dev.g000sha256.tdl.dto.WebDomainException
import dev.g000sha256.tdl.dto.WebPageInstantView
import dev.g000sha256.tdl.util.put
import dev.g000sha256.tdl.util.putNullable
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.buildJsonObject

internal fun serialize(dto: Error): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "error")
        put(key = "code", int = dto.code)
        put(key = "message", string = dto.message)
    }
}

internal fun serialize(dto: Ok): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "ok")
    }
}

internal fun serialize(dto: AuthenticationCodeTypeTelegramMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "authenticationCodeTypeTelegramMessage")
        put(key = "length", int = dto.length)
    }
}

internal fun serialize(dto: AuthenticationCodeTypeSms): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "authenticationCodeTypeSms")
        put(key = "length", int = dto.length)
    }
}

internal fun serialize(dto: AuthenticationCodeTypeSmsWord): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "authenticationCodeTypeSmsWord")
        put(key = "first_letter", string = dto.firstLetter)
    }
}

internal fun serialize(dto: AuthenticationCodeTypeSmsPhrase): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "authenticationCodeTypeSmsPhrase")
        put(key = "first_word", string = dto.firstWord)
    }
}

internal fun serialize(dto: AuthenticationCodeTypeCall): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "authenticationCodeTypeCall")
        put(key = "length", int = dto.length)
    }
}

internal fun serialize(dto: AuthenticationCodeTypeFlashCall): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "authenticationCodeTypeFlashCall")
        put(key = "pattern", string = dto.pattern)
    }
}

internal fun serialize(dto: AuthenticationCodeTypeMissedCall): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "authenticationCodeTypeMissedCall")
        put(key = "phone_number_prefix", string = dto.phoneNumberPrefix)
        put(key = "length", int = dto.length)
    }
}

internal fun serialize(dto: AuthenticationCodeTypeFragment): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "authenticationCodeTypeFragment")
        put(key = "url", string = dto.url)
        put(key = "length", int = dto.length)
    }
}

internal fun serialize(dto: AuthenticationCodeTypeFirebaseAndroid): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "authenticationCodeTypeFirebaseAndroid")
        put(key = "device_verification_parameters", value = dto.deviceVerificationParameters) { data -> serialize(dto = data) }
        put(key = "length", int = dto.length)
    }
}

internal fun serialize(dto: AuthenticationCodeTypeFirebaseIos): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "authenticationCodeTypeFirebaseIos")
        put(key = "receipt", string = dto.receipt)
        put(key = "push_timeout", int = dto.pushTimeout)
        put(key = "length", int = dto.length)
    }
}

internal fun serialize(dto: AuthenticationCodeInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "authenticationCodeInfo")
        put(key = "phone_number", string = dto.phoneNumber)
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
        put(key = "next_type", value = dto.nextType) { data -> serialize(dto = data) }
        put(key = "timeout", int = dto.timeout)
    }
}

internal fun serialize(dto: EmailAddressAuthenticationCodeInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "emailAddressAuthenticationCodeInfo")
        put(key = "email_address_pattern", string = dto.emailAddressPattern)
        put(key = "length", int = dto.length)
    }
}

internal fun serialize(dto: EmailAddressAuthenticationCode): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "emailAddressAuthenticationCode")
        put(key = "code", string = dto.code)
    }
}

internal fun serialize(dto: EmailAddressAuthenticationAppleId): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "emailAddressAuthenticationAppleId")
        put(key = "token", string = dto.token)
    }
}

internal fun serialize(dto: EmailAddressAuthenticationGoogleId): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "emailAddressAuthenticationGoogleId")
        put(key = "token", string = dto.token)
    }
}

internal fun serialize(dto: EmailAddressResetStateAvailable): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "emailAddressResetStateAvailable")
        put(key = "wait_period", int = dto.waitPeriod)
    }
}

internal fun serialize(dto: EmailAddressResetStatePending): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "emailAddressResetStatePending")
        put(key = "reset_in", int = dto.resetIn)
    }
}

internal fun serialize(dto: TextEntity): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "textEntity")
        put(key = "offset", int = dto.offset)
        put(key = "length", int = dto.length)
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: TextEntities): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "textEntities")
        put(key = "entities", objects = dto.entities) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: FormattedText): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "formattedText")
        put(key = "text", string = dto.text)
        put(key = "entities", objects = dto.entities) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: RichMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richMessage")
        put(key = "blocks", objects = dto.blocks) { data -> serialize(dto = data) }
        put(key = "is_rtl", boolean = dto.isRtl)
        put(key = "is_full", boolean = dto.isFull)
    }
}

internal fun serialize(dto: InputRichMessageMedia): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputRichMessageMedia")
        put(key = "id", string = dto.id)
        put(key = "media", value = dto.media) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: RichMessageSourceBlocks): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richMessageSourceBlocks")
        put(key = "blocks", objects = dto.blocks) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: RichMessageSourceMarkdown): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richMessageSourceMarkdown")
        put(key = "text", string = dto.text)
        put(key = "media", objects = dto.media) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: RichMessageSourceHtml): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richMessageSourceHtml")
        put(key = "text", string = dto.text)
        put(key = "media", objects = dto.media) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputRichMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputRichMessage")
        put(key = "source", value = dto.source) { data -> serialize(dto = data) }
        put(key = "is_rtl", boolean = dto.isRtl)
        put(key = "detect_automatic_blocks", boolean = dto.detectAutomaticBlocks)
    }
}

internal fun serialize(dto: DiffEntity): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "diffEntity")
        put(key = "offset", int = dto.offset)
        put(key = "length", int = dto.length)
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: DiffText): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "diffText")
        put(key = "text", string = dto.text)
        put(key = "entities", objects = dto.entities) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: FixedText): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "fixedText")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "diff_text", value = dto.diffText) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: TextCompositionStyleExample): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "textCompositionStyleExample")
        put(key = "source_text", value = dto.sourceText) { data -> serialize(dto = data) }
        put(key = "result_text", value = dto.resultText) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: TextCompositionStyle): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "textCompositionStyle")
        put(key = "name", string = dto.name)
        put(key = "custom_emoji_id", long = dto.customEmojiId)
        put(key = "title", string = dto.title)
        put(key = "is_custom", boolean = dto.isCustom)
        put(key = "is_creator", boolean = dto.isCreator)
        put(key = "install_count", int = dto.installCount)
        put(key = "prompt", string = dto.prompt)
        put(key = "creator_user_id", long = dto.creatorUserId)
        put(key = "english_example", value = dto.englishExample) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: TermsOfService): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "termsOfService")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "min_user_age", int = dto.minUserAge)
        put(key = "show_popup", boolean = dto.showPopup)
    }
}

internal fun serialize(dto: Passkey): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passkey")
        put(key = "id", string = dto.id)
        put(key = "name", string = dto.name)
        put(key = "addition_date", int = dto.additionDate)
        put(key = "last_usage_date", int = dto.lastUsageDate)
        put(key = "software_icon_custom_emoji_id", long = dto.softwareIconCustomEmojiId)
    }
}

internal fun serialize(dto: Passkeys): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passkeys")
        put(key = "passkeys", objects = dto.passkeys) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: AuthorizationStateWaitTdlibParameters): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "authorizationStateWaitTdlibParameters")
    }
}

internal fun serialize(dto: AuthorizationStateWaitPhoneNumber): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "authorizationStateWaitPhoneNumber")
    }
}

internal fun serialize(dto: AuthorizationStateWaitPremiumPurchase): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "authorizationStateWaitPremiumPurchase")
        put(key = "store_product_id", string = dto.storeProductId)
        put(key = "premium_day_count", int = dto.premiumDayCount)
        put(key = "support_email_address", string = dto.supportEmailAddress)
        put(key = "support_email_subject", string = dto.supportEmailSubject)
    }
}

internal fun serialize(dto: AuthorizationStateWaitEmailAddress): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "authorizationStateWaitEmailAddress")
        put(key = "allow_apple_id", boolean = dto.allowAppleId)
        put(key = "allow_google_id", boolean = dto.allowGoogleId)
    }
}

internal fun serialize(dto: AuthorizationStateWaitEmailCode): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "authorizationStateWaitEmailCode")
        put(key = "allow_apple_id", boolean = dto.allowAppleId)
        put(key = "allow_google_id", boolean = dto.allowGoogleId)
        put(key = "code_info", value = dto.codeInfo) { data -> serialize(dto = data) }
        put(key = "email_address_reset_state", value = dto.emailAddressResetState) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: AuthorizationStateWaitCode): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "authorizationStateWaitCode")
        put(key = "code_info", value = dto.codeInfo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: AuthorizationStateWaitOtherDeviceConfirmation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "authorizationStateWaitOtherDeviceConfirmation")
        put(key = "link", string = dto.link)
    }
}

internal fun serialize(dto: AuthorizationStateWaitRegistration): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "authorizationStateWaitRegistration")
        put(key = "terms_of_service", value = dto.termsOfService) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: AuthorizationStateWaitPassword): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "authorizationStateWaitPassword")
        put(key = "password_hint", string = dto.passwordHint)
        put(key = "has_recovery_email_address", boolean = dto.hasRecoveryEmailAddress)
        put(key = "has_passport_data", boolean = dto.hasPassportData)
        put(key = "recovery_email_address_pattern", string = dto.recoveryEmailAddressPattern)
    }
}

internal fun serialize(dto: AuthorizationStateReady): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "authorizationStateReady")
    }
}

internal fun serialize(dto: AuthorizationStateLoggingOut): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "authorizationStateLoggingOut")
    }
}

internal fun serialize(dto: AuthorizationStateClosing): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "authorizationStateClosing")
    }
}

internal fun serialize(dto: AuthorizationStateClosed): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "authorizationStateClosed")
    }
}

internal fun serialize(dto: FirebaseDeviceVerificationParametersSafetyNet): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "firebaseDeviceVerificationParametersSafetyNet")
        put(key = "nonce", bytes = dto.nonce)
    }
}

internal fun serialize(dto: FirebaseDeviceVerificationParametersPlayIntegrity): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "firebaseDeviceVerificationParametersPlayIntegrity")
        put(key = "nonce", string = dto.nonce)
        put(key = "cloud_project_number", long = dto.cloudProjectNumber)
    }
}

internal fun serialize(dto: PasswordState): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passwordState")
        put(key = "has_password", boolean = dto.hasPassword)
        put(key = "password_hint", string = dto.passwordHint)
        put(key = "has_recovery_email_address", boolean = dto.hasRecoveryEmailAddress)
        put(key = "has_passport_data", boolean = dto.hasPassportData)
        put(key = "recovery_email_address_code_info", value = dto.recoveryEmailAddressCodeInfo) { data -> serialize(dto = data) }
        put(key = "login_email_address_pattern", string = dto.loginEmailAddressPattern)
        put(key = "pending_reset_date", int = dto.pendingResetDate)
    }
}

internal fun serialize(dto: RecoveryEmailAddress): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "recoveryEmailAddress")
        put(key = "recovery_email_address", string = dto.recoveryEmailAddress)
    }
}

internal fun serialize(dto: TemporaryPasswordState): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "temporaryPasswordState")
        put(key = "has_password", boolean = dto.hasPassword)
        put(key = "valid_for", int = dto.validFor)
    }
}

internal fun serialize(dto: LocalFile): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "localFile")
        put(key = "path", string = dto.path)
        put(key = "can_be_downloaded", boolean = dto.canBeDownloaded)
        put(key = "can_be_deleted", boolean = dto.canBeDeleted)
        put(key = "is_downloading_active", boolean = dto.isDownloadingActive)
        put(key = "is_downloading_completed", boolean = dto.isDownloadingCompleted)
        put(key = "download_offset", long = dto.downloadOffset)
        put(key = "downloaded_prefix_size", long = dto.downloadedPrefixSize)
        put(key = "downloaded_size", long = dto.downloadedSize)
    }
}

internal fun serialize(dto: RemoteFile): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "remoteFile")
        put(key = "id", string = dto.id)
        put(key = "unique_id", string = dto.uniqueId)
        put(key = "is_uploading_active", boolean = dto.isUploadingActive)
        put(key = "is_uploading_completed", boolean = dto.isUploadingCompleted)
        put(key = "uploaded_size", long = dto.uploadedSize)
    }
}

internal fun serialize(dto: File): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "file")
        put(key = "id", int = dto.id)
        put(key = "size", long = dto.size)
        put(key = "expected_size", long = dto.expectedSize)
        put(key = "local", value = dto.local) { data -> serialize(dto = data) }
        put(key = "remote", value = dto.remote) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputFileId): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputFileId")
        put(key = "id", int = dto.id)
    }
}

internal fun serialize(dto: InputFileRemote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputFileRemote")
        put(key = "id", string = dto.id)
    }
}

internal fun serialize(dto: InputFileLocal): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputFileLocal")
        put(key = "path", string = dto.path)
    }
}

internal fun serialize(dto: InputFileGenerated): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputFileGenerated")
        put(key = "original_path", string = dto.originalPath)
        put(key = "conversion", string = dto.conversion)
        put(key = "expected_size", long = dto.expectedSize)
    }
}

internal fun serialize(dto: PhotoSize): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "photoSize")
        put(key = "type", string = dto.type)
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
        put(key = "width", int = dto.width)
        put(key = "height", int = dto.height)
        put(key = "progressive_sizes", ints = dto.progressiveSizes)
    }
}

internal fun serialize(dto: Minithumbnail): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "minithumbnail")
        put(key = "width", int = dto.width)
        put(key = "height", int = dto.height)
        put(key = "data", bytes = dto.data)
    }
}

internal fun serialize(dto: ThumbnailFormatJpeg): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "thumbnailFormatJpeg")
    }
}

internal fun serialize(dto: ThumbnailFormatGif): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "thumbnailFormatGif")
    }
}

internal fun serialize(dto: ThumbnailFormatMpeg4): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "thumbnailFormatMpeg4")
    }
}

internal fun serialize(dto: ThumbnailFormatPng): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "thumbnailFormatPng")
    }
}

internal fun serialize(dto: ThumbnailFormatTgs): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "thumbnailFormatTgs")
    }
}

internal fun serialize(dto: ThumbnailFormatWebm): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "thumbnailFormatWebm")
    }
}

internal fun serialize(dto: ThumbnailFormatWebp): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "thumbnailFormatWebp")
    }
}

internal fun serialize(dto: Thumbnail): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "thumbnail")
        put(key = "format", value = dto.format) { data -> serialize(dto = data) }
        put(key = "width", int = dto.width)
        put(key = "height", int = dto.height)
        put(key = "file", value = dto.file) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MaskPointForehead): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "maskPointForehead")
    }
}

internal fun serialize(dto: MaskPointEyes): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "maskPointEyes")
    }
}

internal fun serialize(dto: MaskPointMouth): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "maskPointMouth")
    }
}

internal fun serialize(dto: MaskPointChin): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "maskPointChin")
    }
}

internal fun serialize(dto: MaskPosition): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "maskPosition")
        put(key = "point", value = dto.point) { data -> serialize(dto = data) }
        put(key = "x_shift", double = dto.xShift)
        put(key = "y_shift", double = dto.yShift)
        put(key = "scale", double = dto.scale)
    }
}

internal fun serialize(dto: StickerFormatWebp): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "stickerFormatWebp")
    }
}

internal fun serialize(dto: StickerFormatTgs): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "stickerFormatTgs")
    }
}

internal fun serialize(dto: StickerFormatWebm): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "stickerFormatWebm")
    }
}

internal fun serialize(dto: StickerTypeRegular): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "stickerTypeRegular")
    }
}

internal fun serialize(dto: StickerTypeMask): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "stickerTypeMask")
    }
}

internal fun serialize(dto: StickerTypeCustomEmoji): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "stickerTypeCustomEmoji")
    }
}

internal fun serialize(dto: StickerFullTypeRegular): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "stickerFullTypeRegular")
        put(key = "premium_animation", value = dto.premiumAnimation) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StickerFullTypeMask): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "stickerFullTypeMask")
        put(key = "mask_position", value = dto.maskPosition) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StickerFullTypeCustomEmoji): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "stickerFullTypeCustomEmoji")
        put(key = "custom_emoji_id", long = dto.customEmojiId)
        put(key = "needs_repainting", boolean = dto.needsRepainting)
    }
}

internal fun serialize(dto: ClosedVectorPath): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "closedVectorPath")
        put(key = "commands", objects = dto.commands) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: Outline): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "outline")
        put(key = "paths", objects = dto.paths) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PollOption): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pollOption")
        put(key = "id", string = dto.id)
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "media", value = dto.media) { data -> serialize(dto = data) }
        put(key = "voter_count", int = dto.voterCount)
        put(key = "vote_percentage", int = dto.votePercentage)
        put(key = "recent_voter_ids", objects = dto.recentVoterIds) { data -> serialize(dto = data) }
        put(key = "is_chosen", boolean = dto.isChosen)
        put(key = "is_being_chosen", boolean = dto.isBeingChosen)
        put(key = "author", value = dto.author) { data -> serialize(dto = data) }
        put(key = "addition_date", int = dto.additionDate)
    }
}

internal fun serialize(dto: InputPollOption): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPollOption")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "media", value = dto.media) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PollTypeRegular): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pollTypeRegular")
    }
}

internal fun serialize(dto: PollTypeQuiz): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pollTypeQuiz")
        put(key = "correct_option_ids", ints = dto.correctOptionIds)
        put(key = "explanation", value = dto.explanation) { data -> serialize(dto = data) }
        put(key = "explanation_media", value = dto.explanationMedia) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputPollTypeRegular): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPollTypeRegular")
        put(key = "allow_adding_options", boolean = dto.allowAddingOptions)
    }
}

internal fun serialize(dto: InputPollTypeQuiz): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPollTypeQuiz")
        put(key = "correct_option_ids", ints = dto.correctOptionIds)
        put(key = "explanation", value = dto.explanation) { data -> serialize(dto = data) }
        put(key = "explanation_media", value = dto.explanationMedia) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PollVoteRestrictionReasonClosed): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pollVoteRestrictionReasonClosed")
    }
}

internal fun serialize(dto: PollVoteRestrictionReasonYetUnsent): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pollVoteRestrictionReasonYetUnsent")
    }
}

internal fun serialize(dto: PollVoteRestrictionReasonScheduled): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pollVoteRestrictionReasonScheduled")
    }
}

internal fun serialize(dto: PollVoteRestrictionReasonCountryRestricted): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pollVoteRestrictionReasonCountryRestricted")
        put(key = "country_code", string = dto.countryCode)
    }
}

internal fun serialize(dto: PollVoteRestrictionReasonMembershipRequired): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pollVoteRestrictionReasonMembershipRequired")
        put(key = "chat_id", long = dto.chatId)
    }
}

internal fun serialize(dto: PollVoteRestrictionReasonOther): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pollVoteRestrictionReasonOther")
    }
}

internal fun serialize(dto: ChecklistTask): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "checklistTask")
        put(key = "id", int = dto.id)
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "completed_by", value = dto.completedBy) { data -> serialize(dto = data) }
        put(key = "completion_date", int = dto.completionDate)
    }
}

internal fun serialize(dto: InputChecklistTask): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputChecklistTask")
        put(key = "id", int = dto.id)
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: Checklist): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "checklist")
        put(key = "title", value = dto.title) { data -> serialize(dto = data) }
        put(key = "tasks", objects = dto.tasks) { data -> serialize(dto = data) }
        put(key = "others_can_add_tasks", boolean = dto.othersCanAddTasks)
        put(key = "can_add_tasks", boolean = dto.canAddTasks)
        put(key = "others_can_mark_tasks_as_done", boolean = dto.othersCanMarkTasksAsDone)
        put(key = "can_mark_tasks_as_done", boolean = dto.canMarkTasksAsDone)
    }
}

internal fun serialize(dto: InputChecklist): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputChecklist")
        put(key = "title", value = dto.title) { data -> serialize(dto = data) }
        put(key = "tasks", objects = dto.tasks) { data -> serialize(dto = data) }
        put(key = "others_can_add_tasks", boolean = dto.othersCanAddTasks)
        put(key = "others_can_mark_tasks_as_done", boolean = dto.othersCanMarkTasksAsDone)
    }
}

internal fun serialize(dto: Animation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "animation")
        put(key = "duration", int = dto.duration)
        put(key = "width", int = dto.width)
        put(key = "height", int = dto.height)
        put(key = "file_name", string = dto.fileName)
        put(key = "mime_type", string = dto.mimeType)
        put(key = "has_stickers", boolean = dto.hasStickers)
        put(key = "minithumbnail", value = dto.minithumbnail) { data -> serialize(dto = data) }
        put(key = "thumbnail", value = dto.thumbnail) { data -> serialize(dto = data) }
        put(key = "animation", value = dto.animation) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: Audio): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "audio")
        put(key = "duration", int = dto.duration)
        put(key = "title", string = dto.title)
        put(key = "performer", string = dto.performer)
        put(key = "file_name", string = dto.fileName)
        put(key = "mime_type", string = dto.mimeType)
        put(key = "album_cover_minithumbnail", value = dto.albumCoverMinithumbnail) { data -> serialize(dto = data) }
        put(key = "album_cover_thumbnail", value = dto.albumCoverThumbnail) { data -> serialize(dto = data) }
        put(key = "external_album_covers", objects = dto.externalAlbumCovers) { data -> serialize(dto = data) }
        put(key = "audio", value = dto.audio) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: Audios): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "audios")
        put(key = "total_count", int = dto.totalCount)
        put(key = "audios", objects = dto.audios) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: Document): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "document")
        put(key = "file_name", string = dto.fileName)
        put(key = "mime_type", string = dto.mimeType)
        put(key = "minithumbnail", value = dto.minithumbnail) { data -> serialize(dto = data) }
        put(key = "thumbnail", value = dto.thumbnail) { data -> serialize(dto = data) }
        put(key = "document", value = dto.document) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: Photo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "photo")
        put(key = "has_stickers", boolean = dto.hasStickers)
        put(key = "minithumbnail", value = dto.minithumbnail) { data -> serialize(dto = data) }
        put(key = "sizes", objects = dto.sizes) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: Sticker): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "sticker")
        put(key = "id", long = dto.id)
        put(key = "set_id", long = dto.setId)
        put(key = "width", int = dto.width)
        put(key = "height", int = dto.height)
        put(key = "emoji", string = dto.emoji)
        put(key = "format", value = dto.format) { data -> serialize(dto = data) }
        put(key = "full_type", value = dto.fullType) { data -> serialize(dto = data) }
        put(key = "thumbnail", value = dto.thumbnail) { data -> serialize(dto = data) }
        put(key = "sticker", value = dto.sticker) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: Video): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "video")
        put(key = "duration", int = dto.duration)
        put(key = "width", int = dto.width)
        put(key = "height", int = dto.height)
        put(key = "file_name", string = dto.fileName)
        put(key = "mime_type", string = dto.mimeType)
        put(key = "has_stickers", boolean = dto.hasStickers)
        put(key = "supports_streaming", boolean = dto.supportsStreaming)
        put(key = "minithumbnail", value = dto.minithumbnail) { data -> serialize(dto = data) }
        put(key = "thumbnail", value = dto.thumbnail) { data -> serialize(dto = data) }
        put(key = "video", value = dto.video) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: VideoNote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "videoNote")
        put(key = "duration", int = dto.duration)
        put(key = "waveform", bytes = dto.waveform)
        put(key = "length", int = dto.length)
        put(key = "minithumbnail", value = dto.minithumbnail) { data -> serialize(dto = data) }
        put(key = "thumbnail", value = dto.thumbnail) { data -> serialize(dto = data) }
        put(key = "speech_recognition_result", value = dto.speechRecognitionResult) { data -> serialize(dto = data) }
        put(key = "video", value = dto.video) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: VoiceNote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "voiceNote")
        put(key = "duration", int = dto.duration)
        put(key = "waveform", bytes = dto.waveform)
        put(key = "mime_type", string = dto.mimeType)
        put(key = "speech_recognition_result", value = dto.speechRecognitionResult) { data -> serialize(dto = data) }
        put(key = "voice", value = dto.voice) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: AnimatedEmoji): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "animatedEmoji")
        put(key = "sticker", value = dto.sticker) { data -> serialize(dto = data) }
        put(key = "sticker_width", int = dto.stickerWidth)
        put(key = "sticker_height", int = dto.stickerHeight)
        put(key = "fitzpatrick_type", int = dto.fitzpatrickType)
        put(key = "sound", value = dto.sound) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: Contact): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "contact")
        put(key = "phone_number", string = dto.phoneNumber)
        put(key = "first_name", string = dto.firstName)
        put(key = "last_name", string = dto.lastName)
        put(key = "vcard", string = dto.vcard)
        put(key = "user_id", long = dto.userId)
    }
}

internal fun serialize(dto: Location): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "location")
        put(key = "latitude", double = dto.latitude)
        put(key = "longitude", double = dto.longitude)
        put(key = "horizontal_accuracy", double = dto.horizontalAccuracy)
    }
}

internal fun serialize(dto: LiveLocation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "liveLocation")
        put(key = "location", value = dto.location) { data -> serialize(dto = data) }
        put(key = "live_period", int = dto.livePeriod)
        put(key = "heading", int = dto.heading)
        put(key = "proximity_alert_radius", int = dto.proximityAlertRadius)
    }
}

internal fun serialize(dto: Venue): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "venue")
        put(key = "location", value = dto.location) { data -> serialize(dto = data) }
        put(key = "title", string = dto.title)
        put(key = "address", string = dto.address)
        put(key = "provider", string = dto.provider)
        put(key = "id", string = dto.id)
        put(key = "type", string = dto.type)
    }
}

internal fun serialize(dto: Game): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "game")
        put(key = "id", long = dto.id)
        put(key = "short_name", string = dto.shortName)
        put(key = "title", string = dto.title)
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "description", string = dto.description)
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
        put(key = "animation", value = dto.animation) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StakeDiceState): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "stakeDiceState")
        put(key = "state_hash", string = dto.stateHash)
        put(key = "stake_gram_amount", long = dto.stakeGramAmount)
        put(key = "suggested_stake_gram_amounts", longs = dto.suggestedStakeGramAmounts)
        put(key = "current_streak", int = dto.currentStreak)
        put(key = "prize_per_mille", ints = dto.prizePerMille)
        put(key = "streak_prize_per_mille", int = dto.streakPrizePerMille)
    }
}

internal fun serialize(dto: WebApp): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "webApp")
        put(key = "short_name", string = dto.shortName)
        put(key = "title", string = dto.title)
        put(key = "description", string = dto.description)
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
        put(key = "animation", value = dto.animation) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: Poll): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "poll")
        put(key = "id", long = dto.id)
        put(key = "question", value = dto.question) { data -> serialize(dto = data) }
        put(key = "options", objects = dto.options) { data -> serialize(dto = data) }
        put(key = "total_voter_count", int = dto.totalVoterCount)
        put(key = "recent_voter_ids", objects = dto.recentVoterIds) { data -> serialize(dto = data) }
        put(key = "can_get_voters", boolean = dto.canGetVoters)
        put(key = "can_see_results", boolean = dto.canSeeResults)
        put(key = "is_anonymous", boolean = dto.isAnonymous)
        put(key = "allows_multiple_answers", boolean = dto.allowsMultipleAnswers)
        put(key = "allows_revoting", boolean = dto.allowsRevoting)
        put(key = "members_only", boolean = dto.membersOnly)
        put(key = "country_codes", strings = dto.countryCodes)
        put(key = "option_order", ints = dto.optionOrder)
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
        put(key = "open_period", int = dto.openPeriod)
        put(key = "close_date", int = dto.closeDate)
        put(key = "is_closed", boolean = dto.isClosed)
        put(key = "vote_restriction_reason", value = dto.voteRestrictionReason) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: AlternativeVideo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "alternativeVideo")
        put(key = "id", long = dto.id)
        put(key = "width", int = dto.width)
        put(key = "height", int = dto.height)
        put(key = "codec", string = dto.codec)
        put(key = "hls_file", value = dto.hlsFile) { data -> serialize(dto = data) }
        put(key = "video", value = dto.video) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: VideoStoryboard): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "videoStoryboard")
        put(key = "storyboard_file", value = dto.storyboardFile) { data -> serialize(dto = data) }
        put(key = "width", int = dto.width)
        put(key = "height", int = dto.height)
        put(key = "map_file", value = dto.mapFile) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: Background): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "background")
        put(key = "id", long = dto.id)
        put(key = "is_default", boolean = dto.isDefault)
        put(key = "is_dark", boolean = dto.isDark)
        put(key = "name", string = dto.name)
        put(key = "document", value = dto.document) { data -> serialize(dto = data) }
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: Backgrounds): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "backgrounds")
        put(key = "backgrounds", objects = dto.backgrounds) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatBackground): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatBackground")
        put(key = "background", value = dto.background) { data -> serialize(dto = data) }
        put(key = "dark_theme_dimming", int = dto.darkThemeDimming)
    }
}

internal fun serialize(dto: ProfilePhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "profilePhoto")
        put(key = "id", long = dto.id)
        put(key = "small", value = dto.small) { data -> serialize(dto = data) }
        put(key = "big", value = dto.big) { data -> serialize(dto = data) }
        put(key = "minithumbnail", value = dto.minithumbnail) { data -> serialize(dto = data) }
        put(key = "has_animation", boolean = dto.hasAnimation)
        put(key = "is_personal", boolean = dto.isPersonal)
    }
}

internal fun serialize(dto: ChatPhotoInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatPhotoInfo")
        put(key = "small", value = dto.small) { data -> serialize(dto = data) }
        put(key = "big", value = dto.big) { data -> serialize(dto = data) }
        put(key = "minithumbnail", value = dto.minithumbnail) { data -> serialize(dto = data) }
        put(key = "has_animation", boolean = dto.hasAnimation)
        put(key = "is_personal", boolean = dto.isPersonal)
    }
}

internal fun serialize(dto: ProfileTabPosts): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "profileTabPosts")
    }
}

internal fun serialize(dto: ProfileTabGifts): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "profileTabGifts")
    }
}

internal fun serialize(dto: ProfileTabMedia): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "profileTabMedia")
    }
}

internal fun serialize(dto: ProfileTabFiles): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "profileTabFiles")
    }
}

internal fun serialize(dto: ProfileTabLinks): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "profileTabLinks")
    }
}

internal fun serialize(dto: ProfileTabMusic): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "profileTabMusic")
    }
}

internal fun serialize(dto: ProfileTabVoice): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "profileTabVoice")
    }
}

internal fun serialize(dto: ProfileTabGifs): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "profileTabGifs")
    }
}

internal fun serialize(dto: UserTypeRegular): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userTypeRegular")
    }
}

internal fun serialize(dto: UserTypeDeleted): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userTypeDeleted")
    }
}

internal fun serialize(dto: UserTypeBot): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userTypeBot")
        put(key = "can_be_edited", boolean = dto.canBeEdited)
        put(key = "can_join_groups", boolean = dto.canJoinGroups)
        put(key = "can_read_all_group_messages", boolean = dto.canReadAllGroupMessages)
        put(key = "has_main_web_app", boolean = dto.hasMainWebApp)
        put(key = "has_topics", boolean = dto.hasTopics)
        put(key = "allows_users_to_create_topics", boolean = dto.allowsUsersToCreateTopics)
        put(key = "can_manage_bots", boolean = dto.canManageBots)
        put(key = "is_inline", boolean = dto.isInline)
        put(key = "inline_query_placeholder", string = dto.inlineQueryPlaceholder)
        put(key = "supports_guest_queries", boolean = dto.supportsGuestQueries)
        put(key = "is_guard", boolean = dto.isGuard)
        put(key = "need_location", boolean = dto.needLocation)
        put(key = "can_connect_to_business", boolean = dto.canConnectToBusiness)
        put(key = "can_be_added_to_attachment_menu", boolean = dto.canBeAddedToAttachmentMenu)
        put(key = "active_user_count", int = dto.activeUserCount)
    }
}

internal fun serialize(dto: UserTypeUnknown): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userTypeUnknown")
    }
}

internal fun serialize(dto: BotCommand): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "botCommand")
        put(key = "command", string = dto.command)
        put(key = "description", string = dto.description)
        put(key = "is_ephemeral", boolean = dto.isEphemeral)
    }
}

internal fun serialize(dto: BotCommands): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "botCommands")
        put(key = "bot_user_id", long = dto.botUserId)
        put(key = "commands", objects = dto.commands) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: BotMenuButton): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "botMenuButton")
        put(key = "text", string = dto.text)
        put(key = "url", string = dto.url)
    }
}

internal fun serialize(dto: BotAccessSettings): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "botAccessSettings")
        put(key = "is_restricted", boolean = dto.isRestricted)
        put(key = "added_user_ids", longs = dto.addedUserIds)
    }
}

internal fun serialize(dto: BotVerificationParameters): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "botVerificationParameters")
        put(key = "icon_custom_emoji_id", long = dto.iconCustomEmojiId)
        put(key = "organization_name", string = dto.organizationName)
        put(key = "default_custom_description", value = dto.defaultCustomDescription) { data -> serialize(dto = data) }
        put(key = "can_set_custom_description", boolean = dto.canSetCustomDescription)
    }
}

internal fun serialize(dto: BotVerification): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "botVerification")
        put(key = "bot_user_id", long = dto.botUserId)
        put(key = "icon_custom_emoji_id", long = dto.iconCustomEmojiId)
        put(key = "custom_description", value = dto.customDescription) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: VerificationStatus): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "verificationStatus")
        put(key = "is_verified", boolean = dto.isVerified)
        put(key = "is_scam", boolean = dto.isScam)
        put(key = "is_fake", boolean = dto.isFake)
        put(key = "bot_verification_icon_custom_emoji_id", long = dto.botVerificationIconCustomEmojiId)
    }
}

internal fun serialize(dto: ChatLocation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatLocation")
        put(key = "location", value = dto.location) { data -> serialize(dto = data) }
        put(key = "address", string = dto.address)
    }
}

internal fun serialize(dto: Birthdate): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "birthdate")
        put(key = "day", int = dto.day)
        put(key = "month", int = dto.month)
        put(key = "year", int = dto.year)
    }
}

internal fun serialize(dto: CloseBirthdayUser): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "closeBirthdayUser")
        put(key = "user_id", long = dto.userId)
        put(key = "birthdate", value = dto.birthdate) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: BusinessAwayMessageScheduleAlways): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessAwayMessageScheduleAlways")
    }
}

internal fun serialize(dto: BusinessAwayMessageScheduleOutsideOfOpeningHours): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessAwayMessageScheduleOutsideOfOpeningHours")
    }
}

internal fun serialize(dto: BusinessAwayMessageScheduleCustom): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessAwayMessageScheduleCustom")
        put(key = "start_date", int = dto.startDate)
        put(key = "end_date", int = dto.endDate)
    }
}

internal fun serialize(dto: BusinessLocation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessLocation")
        put(key = "location", value = dto.location) { data -> serialize(dto = data) }
        put(key = "address", string = dto.address)
    }
}

internal fun serialize(dto: BusinessRecipients): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessRecipients")
        put(key = "chat_ids", longs = dto.chatIds)
        put(key = "excluded_chat_ids", longs = dto.excludedChatIds)
        put(key = "select_existing_chats", boolean = dto.selectExistingChats)
        put(key = "select_new_chats", boolean = dto.selectNewChats)
        put(key = "select_contacts", boolean = dto.selectContacts)
        put(key = "select_non_contacts", boolean = dto.selectNonContacts)
        put(key = "exclude_selected", boolean = dto.excludeSelected)
    }
}

internal fun serialize(dto: BusinessAwayMessageSettings): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessAwayMessageSettings")
        put(key = "shortcut_id", int = dto.shortcutId)
        put(key = "recipients", value = dto.recipients) { data -> serialize(dto = data) }
        put(key = "schedule", value = dto.schedule) { data -> serialize(dto = data) }
        put(key = "offline_only", boolean = dto.offlineOnly)
    }
}

internal fun serialize(dto: BusinessGreetingMessageSettings): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessGreetingMessageSettings")
        put(key = "shortcut_id", int = dto.shortcutId)
        put(key = "recipients", value = dto.recipients) { data -> serialize(dto = data) }
        put(key = "inactivity_days", int = dto.inactivityDays)
    }
}

internal fun serialize(dto: BusinessBotRights): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessBotRights")
        put(key = "can_reply", boolean = dto.canReply)
        put(key = "can_read_messages", boolean = dto.canReadMessages)
        put(key = "can_delete_sent_messages", boolean = dto.canDeleteSentMessages)
        put(key = "can_delete_all_messages", boolean = dto.canDeleteAllMessages)
        put(key = "can_edit_name", boolean = dto.canEditName)
        put(key = "can_edit_bio", boolean = dto.canEditBio)
        put(key = "can_edit_profile_photo", boolean = dto.canEditProfilePhoto)
        put(key = "can_edit_username", boolean = dto.canEditUsername)
        put(key = "can_view_gifts_and_stars", boolean = dto.canViewGiftsAndStars)
        put(key = "can_sell_gifts", boolean = dto.canSellGifts)
        put(key = "can_change_gift_settings", boolean = dto.canChangeGiftSettings)
        put(key = "can_transfer_and_upgrade_gifts", boolean = dto.canTransferAndUpgradeGifts)
        put(key = "can_transfer_stars", boolean = dto.canTransferStars)
        put(key = "can_manage_stories", boolean = dto.canManageStories)
    }
}

internal fun serialize(dto: BusinessConnectedBot): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessConnectedBot")
        put(key = "bot_user_id", long = dto.botUserId)
        put(key = "recipients", value = dto.recipients) { data -> serialize(dto = data) }
        put(key = "rights", value = dto.rights) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: BusinessConnectedBotInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessConnectedBotInfo")
        put(key = "bot", value = dto.bot) { data -> serialize(dto = data) }
        put(key = "connection_date", int = dto.connectionDate)
        put(key = "device_model", string = dto.deviceModel)
        put(key = "location", string = dto.location)
    }
}

internal fun serialize(dto: BusinessStartPage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessStartPage")
        put(key = "title", string = dto.title)
        put(key = "message", string = dto.message)
        put(key = "sticker", value = dto.sticker) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputBusinessStartPage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputBusinessStartPage")
        put(key = "title", string = dto.title)
        put(key = "message", string = dto.message)
        put(key = "sticker", value = dto.sticker) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: BusinessOpeningHoursInterval): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessOpeningHoursInterval")
        put(key = "start_minute", int = dto.startMinute)
        put(key = "end_minute", int = dto.endMinute)
    }
}

internal fun serialize(dto: BusinessOpeningHours): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessOpeningHours")
        put(key = "time_zone_id", string = dto.timeZoneId)
        put(key = "opening_hours", objects = dto.openingHours) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: BusinessInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessInfo")
        put(key = "location", value = dto.location) { data -> serialize(dto = data) }
        put(key = "opening_hours", value = dto.openingHours) { data -> serialize(dto = data) }
        put(key = "local_opening_hours", value = dto.localOpeningHours) { data -> serialize(dto = data) }
        put(key = "next_open_in", int = dto.nextOpenIn)
        put(key = "next_close_in", int = dto.nextCloseIn)
        put(key = "greeting_message_settings", value = dto.greetingMessageSettings) { data -> serialize(dto = data) }
        put(key = "away_message_settings", value = dto.awayMessageSettings) { data -> serialize(dto = data) }
        put(key = "start_page", value = dto.startPage) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: BusinessChatLink): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessChatLink")
        put(key = "link", string = dto.link)
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "title", string = dto.title)
        put(key = "view_count", int = dto.viewCount)
    }
}

internal fun serialize(dto: BusinessChatLinks): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessChatLinks")
        put(key = "links", objects = dto.links) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputBusinessChatLink): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputBusinessChatLink")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "title", string = dto.title)
    }
}

internal fun serialize(dto: BusinessChatLinkInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessChatLinkInfo")
        put(key = "chat_id", long = dto.chatId)
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatPhotoStickerTypeRegularOrMask): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatPhotoStickerTypeRegularOrMask")
        put(key = "sticker_set_id", long = dto.stickerSetId)
        put(key = "sticker_id", long = dto.stickerId)
    }
}

internal fun serialize(dto: ChatPhotoStickerTypeCustomEmoji): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatPhotoStickerTypeCustomEmoji")
        put(key = "custom_emoji_id", long = dto.customEmojiId)
    }
}

internal fun serialize(dto: ChatPhotoSticker): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatPhotoSticker")
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
        put(key = "background_fill", value = dto.backgroundFill) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: AnimatedChatPhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "animatedChatPhoto")
        put(key = "length", int = dto.length)
        put(key = "file", value = dto.file) { data -> serialize(dto = data) }
        put(key = "main_frame_timestamp", double = dto.mainFrameTimestamp)
    }
}

internal fun serialize(dto: ChatPhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatPhoto")
        put(key = "id", long = dto.id)
        put(key = "added_date", int = dto.addedDate)
        put(key = "minithumbnail", value = dto.minithumbnail) { data -> serialize(dto = data) }
        put(key = "sizes", objects = dto.sizes) { data -> serialize(dto = data) }
        put(key = "animation", value = dto.animation) { data -> serialize(dto = data) }
        put(key = "small_animation", value = dto.smallAnimation) { data -> serialize(dto = data) }
        put(key = "sticker", value = dto.sticker) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatPhotos): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatPhotos")
        put(key = "total_count", int = dto.totalCount)
        put(key = "photos", objects = dto.photos) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputChatPhotoPrevious): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputChatPhotoPrevious")
        put(key = "chat_photo_id", long = dto.chatPhotoId)
    }
}

internal fun serialize(dto: InputChatPhotoStatic): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputChatPhotoStatic")
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputChatPhotoAnimation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputChatPhotoAnimation")
        put(key = "animation", value = dto.animation) { data -> serialize(dto = data) }
        put(key = "main_frame_timestamp", double = dto.mainFrameTimestamp)
    }
}

internal fun serialize(dto: InputChatPhotoSticker): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputChatPhotoSticker")
        put(key = "sticker", value = dto.sticker) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatPermissions): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatPermissions")
        put(key = "can_send_basic_messages", boolean = dto.canSendBasicMessages)
        put(key = "can_send_audios", boolean = dto.canSendAudios)
        put(key = "can_send_documents", boolean = dto.canSendDocuments)
        put(key = "can_send_photos", boolean = dto.canSendPhotos)
        put(key = "can_send_videos", boolean = dto.canSendVideos)
        put(key = "can_send_video_notes", boolean = dto.canSendVideoNotes)
        put(key = "can_send_voice_notes", boolean = dto.canSendVoiceNotes)
        put(key = "can_send_polls", boolean = dto.canSendPolls)
        put(key = "can_send_other_messages", boolean = dto.canSendOtherMessages)
        put(key = "can_add_link_previews", boolean = dto.canAddLinkPreviews)
        put(key = "can_react_to_messages", boolean = dto.canReactToMessages)
        put(key = "can_edit_tag", boolean = dto.canEditTag)
        put(key = "can_change_info", boolean = dto.canChangeInfo)
        put(key = "can_invite_users", boolean = dto.canInviteUsers)
        put(key = "can_pin_messages", boolean = dto.canPinMessages)
        put(key = "can_create_topics", boolean = dto.canCreateTopics)
    }
}

internal fun serialize(dto: ChatAdministratorRights): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatAdministratorRights")
        put(key = "can_manage_chat", boolean = dto.canManageChat)
        put(key = "can_change_info", boolean = dto.canChangeInfo)
        put(key = "can_post_messages", boolean = dto.canPostMessages)
        put(key = "can_edit_messages", boolean = dto.canEditMessages)
        put(key = "can_delete_messages", boolean = dto.canDeleteMessages)
        put(key = "can_invite_users", boolean = dto.canInviteUsers)
        put(key = "can_restrict_members", boolean = dto.canRestrictMembers)
        put(key = "can_pin_messages", boolean = dto.canPinMessages)
        put(key = "can_manage_topics", boolean = dto.canManageTopics)
        put(key = "can_promote_members", boolean = dto.canPromoteMembers)
        put(key = "can_manage_video_chats", boolean = dto.canManageVideoChats)
        put(key = "can_post_stories", boolean = dto.canPostStories)
        put(key = "can_edit_stories", boolean = dto.canEditStories)
        put(key = "can_delete_stories", boolean = dto.canDeleteStories)
        put(key = "can_manage_direct_messages", boolean = dto.canManageDirectMessages)
        put(key = "can_manage_tags", boolean = dto.canManageTags)
        put(key = "is_anonymous", boolean = dto.isAnonymous)
    }
}

internal fun serialize(dto: ThemeParameters): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "themeParameters")
        put(key = "background_color", int = dto.backgroundColor)
        put(key = "secondary_background_color", int = dto.secondaryBackgroundColor)
        put(key = "header_background_color", int = dto.headerBackgroundColor)
        put(key = "bottom_bar_background_color", int = dto.bottomBarBackgroundColor)
        put(key = "section_background_color", int = dto.sectionBackgroundColor)
        put(key = "section_separator_color", int = dto.sectionSeparatorColor)
        put(key = "text_color", int = dto.textColor)
        put(key = "accent_text_color", int = dto.accentTextColor)
        put(key = "section_header_text_color", int = dto.sectionHeaderTextColor)
        put(key = "subtitle_text_color", int = dto.subtitleTextColor)
        put(key = "destructive_text_color", int = dto.destructiveTextColor)
        put(key = "hint_color", int = dto.hintColor)
        put(key = "link_color", int = dto.linkColor)
        put(key = "button_color", int = dto.buttonColor)
        put(key = "button_text_color", int = dto.buttonTextColor)
    }
}

internal fun serialize(dto: WebAppOpenModeCompact): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "webAppOpenModeCompact")
    }
}

internal fun serialize(dto: WebAppOpenModeFullSize): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "webAppOpenModeFullSize")
    }
}

internal fun serialize(dto: WebAppOpenModeFullScreen): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "webAppOpenModeFullScreen")
    }
}

internal fun serialize(dto: FoundWebApp): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "foundWebApp")
        put(key = "web_app", value = dto.webApp) { data -> serialize(dto = data) }
        put(key = "request_write_access", boolean = dto.requestWriteAccess)
        put(key = "skip_confirmation", boolean = dto.skipConfirmation)
    }
}

internal fun serialize(dto: WebAppUrl): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "webAppUrl")
        put(key = "url", string = dto.url)
        put(key = "require_same_origin", boolean = dto.requireSameOrigin)
    }
}

internal fun serialize(dto: WebAppInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "webAppInfo")
        put(key = "launch_id", long = dto.launchId)
        put(key = "url", value = dto.url) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MainWebApp): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "mainWebApp")
        put(key = "url", value = dto.url) { data -> serialize(dto = data) }
        put(key = "mode", value = dto.mode) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: WebAppOpenParameters): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "webAppOpenParameters")
        put(key = "theme", value = dto.theme) { data -> serialize(dto = data) }
        put(key = "application_name", string = dto.applicationName)
        put(key = "mode", value = dto.mode) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: GiftResalePriceStar): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giftResalePriceStar")
        put(key = "star_count", long = dto.starCount)
    }
}

internal fun serialize(dto: GiftResalePriceGram): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giftResalePriceGram")
        put(key = "gram_cent_count", long = dto.gramCentCount)
    }
}

internal fun serialize(dto: GiftPurchaseOfferStatePending): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giftPurchaseOfferStatePending")
    }
}

internal fun serialize(dto: GiftPurchaseOfferStateAccepted): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giftPurchaseOfferStateAccepted")
    }
}

internal fun serialize(dto: GiftPurchaseOfferStateRejected): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giftPurchaseOfferStateRejected")
    }
}

internal fun serialize(dto: SuggestedPostPriceStar): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "suggestedPostPriceStar")
        put(key = "star_count", long = dto.starCount)
    }
}

internal fun serialize(dto: SuggestedPostPriceGram): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "suggestedPostPriceGram")
        put(key = "gram_cent_count", long = dto.gramCentCount)
    }
}

internal fun serialize(dto: SuggestedPostStatePending): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "suggestedPostStatePending")
    }
}

internal fun serialize(dto: SuggestedPostStateApproved): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "suggestedPostStateApproved")
    }
}

internal fun serialize(dto: SuggestedPostStateDeclined): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "suggestedPostStateDeclined")
    }
}

internal fun serialize(dto: SuggestedPostInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "suggestedPostInfo")
        put(key = "price", value = dto.price) { data -> serialize(dto = data) }
        put(key = "send_date", int = dto.sendDate)
        put(key = "state", value = dto.state) { data -> serialize(dto = data) }
        put(key = "can_be_approved", boolean = dto.canBeApproved)
        put(key = "can_be_declined", boolean = dto.canBeDeclined)
    }
}

internal fun serialize(dto: InputSuggestedPostInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputSuggestedPostInfo")
        put(key = "price", value = dto.price) { data -> serialize(dto = data) }
        put(key = "send_date", int = dto.sendDate)
    }
}

internal fun serialize(dto: SuggestedPostRefundReasonPostDeleted): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "suggestedPostRefundReasonPostDeleted")
    }
}

internal fun serialize(dto: SuggestedPostRefundReasonPaymentRefunded): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "suggestedPostRefundReasonPaymentRefunded")
    }
}

internal fun serialize(dto: StarAmount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starAmount")
        put(key = "star_count", long = dto.starCount)
        put(key = "nanostar_count", int = dto.nanostarCount)
    }
}

internal fun serialize(dto: StarSubscriptionTypeChannel): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starSubscriptionTypeChannel")
        put(key = "can_reuse", boolean = dto.canReuse)
        put(key = "invite_link", string = dto.inviteLink)
    }
}

internal fun serialize(dto: StarSubscriptionTypeBot): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starSubscriptionTypeBot")
        put(key = "is_canceled_by_bot", boolean = dto.isCanceledByBot)
        put(key = "title", string = dto.title)
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
        put(key = "invoice_link", string = dto.invoiceLink)
    }
}

internal fun serialize(dto: StarSubscriptionPricing): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starSubscriptionPricing")
        put(key = "period", int = dto.period)
        put(key = "star_count", long = dto.starCount)
    }
}

internal fun serialize(dto: StarSubscription): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starSubscription")
        put(key = "id", string = dto.id)
        put(key = "chat_id", long = dto.chatId)
        put(key = "expiration_date", int = dto.expirationDate)
        put(key = "is_canceled", boolean = dto.isCanceled)
        put(key = "is_expiring", boolean = dto.isExpiring)
        put(key = "pricing", value = dto.pricing) { data -> serialize(dto = data) }
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StarSubscriptions): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starSubscriptions")
        put(key = "star_amount", value = dto.starAmount) { data -> serialize(dto = data) }
        put(key = "subscriptions", objects = dto.subscriptions) { data -> serialize(dto = data) }
        put(key = "required_star_count", long = dto.requiredStarCount)
        put(key = "next_offset", string = dto.nextOffset)
    }
}

internal fun serialize(dto: AffiliateTypeCurrentUser): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "affiliateTypeCurrentUser")
    }
}

internal fun serialize(dto: AffiliateTypeBot): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "affiliateTypeBot")
        put(key = "user_id", long = dto.userId)
    }
}

internal fun serialize(dto: AffiliateTypeChannel): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "affiliateTypeChannel")
        put(key = "chat_id", long = dto.chatId)
    }
}

internal fun serialize(dto: AffiliateProgramSortOrderProfitability): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "affiliateProgramSortOrderProfitability")
    }
}

internal fun serialize(dto: AffiliateProgramSortOrderCreationDate): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "affiliateProgramSortOrderCreationDate")
    }
}

internal fun serialize(dto: AffiliateProgramSortOrderRevenue): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "affiliateProgramSortOrderRevenue")
    }
}

internal fun serialize(dto: AffiliateProgramParameters): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "affiliateProgramParameters")
        put(key = "commission_per_mille", int = dto.commissionPerMille)
        put(key = "month_count", int = dto.monthCount)
    }
}

internal fun serialize(dto: AffiliateProgramInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "affiliateProgramInfo")
        put(key = "parameters", value = dto.parameters) { data -> serialize(dto = data) }
        put(key = "end_date", int = dto.endDate)
        put(key = "daily_revenue_per_user_amount", value = dto.dailyRevenuePerUserAmount) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: AffiliateInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "affiliateInfo")
        put(key = "commission_per_mille", int = dto.commissionPerMille)
        put(key = "affiliate_chat_id", long = dto.affiliateChatId)
        put(key = "star_amount", value = dto.starAmount) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: FoundAffiliateProgram): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "foundAffiliateProgram")
        put(key = "bot_user_id", long = dto.botUserId)
        put(key = "info", value = dto.info) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: FoundAffiliatePrograms): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "foundAffiliatePrograms")
        put(key = "total_count", int = dto.totalCount)
        put(key = "programs", objects = dto.programs) { data -> serialize(dto = data) }
        put(key = "next_offset", string = dto.nextOffset)
    }
}

internal fun serialize(dto: ConnectedAffiliateProgram): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "connectedAffiliateProgram")
        put(key = "url", string = dto.url)
        put(key = "bot_user_id", long = dto.botUserId)
        put(key = "parameters", value = dto.parameters) { data -> serialize(dto = data) }
        put(key = "connection_date", int = dto.connectionDate)
        put(key = "is_disconnected", boolean = dto.isDisconnected)
        put(key = "user_count", long = dto.userCount)
        put(key = "revenue_star_count", long = dto.revenueStarCount)
    }
}

internal fun serialize(dto: ConnectedAffiliatePrograms): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "connectedAffiliatePrograms")
        put(key = "total_count", int = dto.totalCount)
        put(key = "programs", objects = dto.programs) { data -> serialize(dto = data) }
        put(key = "next_offset", string = dto.nextOffset)
    }
}

internal fun serialize(dto: ProductInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "productInfo")
        put(key = "title", string = dto.title)
        put(key = "description", value = dto.description) { data -> serialize(dto = data) }
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PremiumPaymentOption): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumPaymentOption")
        put(key = "currency", string = dto.currency)
        put(key = "amount", long = dto.amount)
        put(key = "discount_percentage", int = dto.discountPercentage)
        put(key = "month_count", int = dto.monthCount)
        put(key = "store_product_id", string = dto.storeProductId)
        put(key = "payment_link", value = dto.paymentLink) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PremiumStatePaymentOption): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumStatePaymentOption")
        put(key = "payment_option", value = dto.paymentOption) { data -> serialize(dto = data) }
        put(key = "is_current", boolean = dto.isCurrent)
        put(key = "is_upgrade", boolean = dto.isUpgrade)
        put(key = "last_transaction_id", string = dto.lastTransactionId)
    }
}

internal fun serialize(dto: PremiumGiftPaymentOption): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumGiftPaymentOption")
        put(key = "currency", string = dto.currency)
        put(key = "amount", long = dto.amount)
        put(key = "star_count", long = dto.starCount)
        put(key = "discount_percentage", int = dto.discountPercentage)
        put(key = "month_count", int = dto.monthCount)
        put(key = "store_product_id", string = dto.storeProductId)
        put(key = "sticker", value = dto.sticker) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PremiumGiftPaymentOptions): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumGiftPaymentOptions")
        put(key = "options", objects = dto.options) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PremiumGiveawayPaymentOption): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumGiveawayPaymentOption")
        put(key = "currency", string = dto.currency)
        put(key = "amount", long = dto.amount)
        put(key = "winner_count", int = dto.winnerCount)
        put(key = "month_count", int = dto.monthCount)
        put(key = "store_product_id", string = dto.storeProductId)
        put(key = "store_product_quantity", int = dto.storeProductQuantity)
    }
}

internal fun serialize(dto: PremiumGiveawayPaymentOptions): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumGiveawayPaymentOptions")
        put(key = "options", objects = dto.options) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PremiumGiftCodeInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumGiftCodeInfo")
        put(key = "creator_id", value = dto.creatorId) { data -> serialize(dto = data) }
        put(key = "creation_date", int = dto.creationDate)
        put(key = "is_from_giveaway", boolean = dto.isFromGiveaway)
        put(key = "giveaway_message_id", long = dto.giveawayMessageId)
        put(key = "month_count", int = dto.monthCount)
        put(key = "day_count", int = dto.dayCount)
        put(key = "user_id", long = dto.userId)
        put(key = "use_date", int = dto.useDate)
    }
}

internal fun serialize(dto: StarPaymentOption): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starPaymentOption")
        put(key = "currency", string = dto.currency)
        put(key = "amount", long = dto.amount)
        put(key = "star_count", long = dto.starCount)
        put(key = "store_product_id", string = dto.storeProductId)
        put(key = "is_additional", boolean = dto.isAdditional)
    }
}

internal fun serialize(dto: StarPaymentOptions): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starPaymentOptions")
        put(key = "options", objects = dto.options) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StarGiveawayWinnerOption): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starGiveawayWinnerOption")
        put(key = "winner_count", int = dto.winnerCount)
        put(key = "won_star_count", long = dto.wonStarCount)
        put(key = "is_default", boolean = dto.isDefault)
    }
}

internal fun serialize(dto: StarGiveawayPaymentOption): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starGiveawayPaymentOption")
        put(key = "currency", string = dto.currency)
        put(key = "amount", long = dto.amount)
        put(key = "star_count", long = dto.starCount)
        put(key = "store_product_id", string = dto.storeProductId)
        put(key = "yearly_boost_count", int = dto.yearlyBoostCount)
        put(key = "winner_options", objects = dto.winnerOptions) { data -> serialize(dto = data) }
        put(key = "is_default", boolean = dto.isDefault)
        put(key = "is_additional", boolean = dto.isAdditional)
    }
}

internal fun serialize(dto: StarGiveawayPaymentOptions): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starGiveawayPaymentOptions")
        put(key = "options", objects = dto.options) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: AcceptedGiftTypes): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "acceptedGiftTypes")
        put(key = "unlimited_gifts", boolean = dto.unlimitedGifts)
        put(key = "limited_gifts", boolean = dto.limitedGifts)
        put(key = "upgraded_gifts", boolean = dto.upgradedGifts)
        put(key = "gifts_from_channels", boolean = dto.giftsFromChannels)
        put(key = "premium_subscription", boolean = dto.premiumSubscription)
    }
}

internal fun serialize(dto: GiftSettings): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giftSettings")
        put(key = "show_gift_button", boolean = dto.showGiftButton)
        put(key = "accepted_gift_types", value = dto.acceptedGiftTypes) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: GiftAuction): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giftAuction")
        put(key = "id", string = dto.id)
        put(key = "gifts_per_round", int = dto.giftsPerRound)
        put(key = "start_date", int = dto.startDate)
    }
}

internal fun serialize(dto: GiftBackground): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giftBackground")
        put(key = "center_color", int = dto.centerColor)
        put(key = "edge_color", int = dto.edgeColor)
        put(key = "text_color", int = dto.textColor)
    }
}

internal fun serialize(dto: GiftPurchaseLimits): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giftPurchaseLimits")
        put(key = "total_count", int = dto.totalCount)
        put(key = "remaining_count", int = dto.remainingCount)
    }
}

internal fun serialize(dto: GiftResaleParameters): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giftResaleParameters")
        put(key = "star_count", long = dto.starCount)
        put(key = "gram_cent_count", long = dto.gramCentCount)
        put(key = "gram_only", boolean = dto.gramOnly)
    }
}

internal fun serialize(dto: GiftCollection): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giftCollection")
        put(key = "id", int = dto.id)
        put(key = "name", string = dto.name)
        put(key = "icon", value = dto.icon) { data -> serialize(dto = data) }
        put(key = "gift_count", int = dto.giftCount)
    }
}

internal fun serialize(dto: GiftCollections): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giftCollections")
        put(key = "collections", objects = dto.collections) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: CanSendGiftResultOk): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "canSendGiftResultOk")
    }
}

internal fun serialize(dto: CanSendGiftResultFail): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "canSendGiftResultFail")
        put(key = "reason", value = dto.reason) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpgradedGiftOriginUpgrade): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "upgradedGiftOriginUpgrade")
        put(key = "gift_message_id", long = dto.giftMessageId)
    }
}

internal fun serialize(dto: UpgradedGiftOriginTransfer): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "upgradedGiftOriginTransfer")
    }
}

internal fun serialize(dto: UpgradedGiftOriginResale): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "upgradedGiftOriginResale")
        put(key = "price", value = dto.price) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpgradedGiftOriginBlockchain): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "upgradedGiftOriginBlockchain")
    }
}

internal fun serialize(dto: UpgradedGiftOriginPrepaidUpgrade): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "upgradedGiftOriginPrepaidUpgrade")
    }
}

internal fun serialize(dto: UpgradedGiftOriginOffer): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "upgradedGiftOriginOffer")
        put(key = "price", value = dto.price) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpgradedGiftOriginCraft): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "upgradedGiftOriginCraft")
    }
}

internal fun serialize(dto: UpgradedGiftAttributeRarityPerMille): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "upgradedGiftAttributeRarityPerMille")
        put(key = "per_mille", int = dto.perMille)
    }
}

internal fun serialize(dto: UpgradedGiftAttributeRarityUncommon): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "upgradedGiftAttributeRarityUncommon")
    }
}

internal fun serialize(dto: UpgradedGiftAttributeRarityRare): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "upgradedGiftAttributeRarityRare")
    }
}

internal fun serialize(dto: UpgradedGiftAttributeRarityEpic): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "upgradedGiftAttributeRarityEpic")
    }
}

internal fun serialize(dto: UpgradedGiftAttributeRarityLegendary): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "upgradedGiftAttributeRarityLegendary")
    }
}

internal fun serialize(dto: UpgradedGiftModel): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "upgradedGiftModel")
        put(key = "name", string = dto.name)
        put(key = "sticker", value = dto.sticker) { data -> serialize(dto = data) }
        put(key = "rarity", value = dto.rarity) { data -> serialize(dto = data) }
        put(key = "is_crafted", boolean = dto.isCrafted)
    }
}

internal fun serialize(dto: UpgradedGiftSymbol): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "upgradedGiftSymbol")
        put(key = "name", string = dto.name)
        put(key = "sticker", value = dto.sticker) { data -> serialize(dto = data) }
        put(key = "rarity", value = dto.rarity) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpgradedGiftBackdropColors): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "upgradedGiftBackdropColors")
        put(key = "center_color", int = dto.centerColor)
        put(key = "edge_color", int = dto.edgeColor)
        put(key = "symbol_color", int = dto.symbolColor)
        put(key = "text_color", int = dto.textColor)
    }
}

internal fun serialize(dto: UpgradedGiftBackdrop): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "upgradedGiftBackdrop")
        put(key = "id", int = dto.id)
        put(key = "name", string = dto.name)
        put(key = "colors", value = dto.colors) { data -> serialize(dto = data) }
        put(key = "rarity", value = dto.rarity) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpgradedGiftOriginalDetails): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "upgradedGiftOriginalDetails")
        put(key = "sender_id", value = dto.senderId) { data -> serialize(dto = data) }
        put(key = "receiver_id", value = dto.receiverId) { data -> serialize(dto = data) }
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "date", int = dto.date)
    }
}

internal fun serialize(dto: UpgradedGiftColors): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "upgradedGiftColors")
        put(key = "id", long = dto.id)
        put(key = "model_custom_emoji_id", long = dto.modelCustomEmojiId)
        put(key = "symbol_custom_emoji_id", long = dto.symbolCustomEmojiId)
        put(key = "light_theme_accent_color", int = dto.lightThemeAccentColor)
        put(key = "light_theme_colors", ints = dto.lightThemeColors)
        put(key = "dark_theme_accent_color", int = dto.darkThemeAccentColor)
        put(key = "dark_theme_colors", ints = dto.darkThemeColors)
    }
}

internal fun serialize(dto: Gift): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "gift")
        put(key = "id", long = dto.id)
        put(key = "publisher_chat_id", long = dto.publisherChatId)
        put(key = "sticker", value = dto.sticker) { data -> serialize(dto = data) }
        put(key = "star_count", long = dto.starCount)
        put(key = "default_sell_star_count", long = dto.defaultSellStarCount)
        put(key = "upgrade_star_count", long = dto.upgradeStarCount)
        put(key = "upgrade_variant_count", int = dto.upgradeVariantCount)
        put(key = "has_colors", boolean = dto.hasColors)
        put(key = "is_for_birthday", boolean = dto.isForBirthday)
        put(key = "is_premium", boolean = dto.isPremium)
        put(key = "auction_info", value = dto.auctionInfo) { data -> serialize(dto = data) }
        put(key = "next_send_date", int = dto.nextSendDate)
        put(key = "user_limits", value = dto.userLimits) { data -> serialize(dto = data) }
        put(key = "overall_limits", value = dto.overallLimits) { data -> serialize(dto = data) }
        put(key = "background", value = dto.background) { data -> serialize(dto = data) }
        put(key = "first_send_date", int = dto.firstSendDate)
        put(key = "last_send_date", int = dto.lastSendDate)
    }
}

internal fun serialize(dto: UpgradedGift): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "upgradedGift")
        put(key = "id", long = dto.id)
        put(key = "regular_gift_id", long = dto.regularGiftId)
        put(key = "publisher_chat_id", long = dto.publisherChatId)
        put(key = "title", string = dto.title)
        put(key = "name", string = dto.name)
        put(key = "number", int = dto.number)
        put(key = "total_upgraded_count", int = dto.totalUpgradedCount)
        put(key = "max_upgraded_count", int = dto.maxUpgradedCount)
        put(key = "is_burned", boolean = dto.isBurned)
        put(key = "is_crafted", boolean = dto.isCrafted)
        put(key = "is_premium", boolean = dto.isPremium)
        put(key = "is_theme_available", boolean = dto.isThemeAvailable)
        put(key = "used_theme_chat_id", long = dto.usedThemeChatId)
        put(key = "host_id", value = dto.hostId) { data -> serialize(dto = data) }
        put(key = "owner_id", value = dto.ownerId) { data -> serialize(dto = data) }
        put(key = "owner_address", string = dto.ownerAddress)
        put(key = "owner_name", string = dto.ownerName)
        put(key = "gift_address", string = dto.giftAddress)
        put(key = "model", value = dto.model) { data -> serialize(dto = data) }
        put(key = "symbol", value = dto.symbol) { data -> serialize(dto = data) }
        put(key = "backdrop", value = dto.backdrop) { data -> serialize(dto = data) }
        put(key = "original_details", value = dto.originalDetails) { data -> serialize(dto = data) }
        put(key = "colors", value = dto.colors) { data -> serialize(dto = data) }
        put(key = "resale_parameters", value = dto.resaleParameters) { data -> serialize(dto = data) }
        put(key = "can_send_purchase_offer", boolean = dto.canSendPurchaseOffer)
        put(key = "craft_probability_per_mille", int = dto.craftProbabilityPerMille)
        put(key = "value_currency", string = dto.valueCurrency)
        put(key = "value_amount", long = dto.valueAmount)
        put(key = "value_usd_amount", long = dto.valueUsdAmount)
    }
}

internal fun serialize(dto: UpgradedGiftValueInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "upgradedGiftValueInfo")
        put(key = "currency", string = dto.currency)
        put(key = "value", long = dto.value)
        put(key = "is_value_average", boolean = dto.isValueAverage)
        put(key = "initial_sale_date", int = dto.initialSaleDate)
        put(key = "initial_sale_star_count", long = dto.initialSaleStarCount)
        put(key = "initial_sale_price", long = dto.initialSalePrice)
        put(key = "last_sale_date", int = dto.lastSaleDate)
        put(key = "last_sale_price", long = dto.lastSalePrice)
        put(key = "is_last_sale_on_fragment", boolean = dto.isLastSaleOnFragment)
        put(key = "minimum_price", long = dto.minimumPrice)
        put(key = "average_sale_price", long = dto.averageSalePrice)
        put(key = "telegram_listed_gift_count", int = dto.telegramListedGiftCount)
        put(key = "fragment_listed_gift_count", int = dto.fragmentListedGiftCount)
        put(key = "fragment_url", string = dto.fragmentUrl)
    }
}

internal fun serialize(dto: UpgradeGiftResult): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "upgradeGiftResult")
        put(key = "gift", value = dto.gift) { data -> serialize(dto = data) }
        put(key = "received_gift_id", string = dto.receivedGiftId)
        put(key = "is_saved", boolean = dto.isSaved)
        put(key = "can_be_transferred", boolean = dto.canBeTransferred)
        put(key = "transfer_star_count", long = dto.transferStarCount)
        put(key = "drop_original_details_star_count", long = dto.dropOriginalDetailsStarCount)
        put(key = "next_transfer_date", int = dto.nextTransferDate)
        put(key = "next_resale_date", int = dto.nextResaleDate)
        put(key = "export_date", int = dto.exportDate)
    }
}

internal fun serialize(dto: CraftGiftResultSuccess): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "craftGiftResultSuccess")
        put(key = "gift", value = dto.gift) { data -> serialize(dto = data) }
        put(key = "received_gift_id", string = dto.receivedGiftId)
    }
}

internal fun serialize(dto: CraftGiftResultTooEarly): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "craftGiftResultTooEarly")
        put(key = "retry_after", int = dto.retryAfter)
    }
}

internal fun serialize(dto: CraftGiftResultInvalidGift): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "craftGiftResultInvalidGift")
    }
}

internal fun serialize(dto: CraftGiftResultFail): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "craftGiftResultFail")
    }
}

internal fun serialize(dto: AvailableGift): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "availableGift")
        put(key = "gift", value = dto.gift) { data -> serialize(dto = data) }
        put(key = "resale_count", int = dto.resaleCount)
        put(key = "min_resale_star_count", long = dto.minResaleStarCount)
        put(key = "title", string = dto.title)
    }
}

internal fun serialize(dto: AvailableGifts): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "availableGifts")
        put(key = "gifts", objects = dto.gifts) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: GiftUpgradePrice): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giftUpgradePrice")
        put(key = "date", int = dto.date)
        put(key = "star_count", long = dto.starCount)
    }
}

internal fun serialize(dto: UpgradedGiftAttributeIdModel): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "upgradedGiftAttributeIdModel")
        put(key = "sticker_id", long = dto.stickerId)
    }
}

internal fun serialize(dto: UpgradedGiftAttributeIdSymbol): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "upgradedGiftAttributeIdSymbol")
        put(key = "sticker_id", long = dto.stickerId)
    }
}

internal fun serialize(dto: UpgradedGiftAttributeIdBackdrop): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "upgradedGiftAttributeIdBackdrop")
        put(key = "backdrop_id", int = dto.backdropId)
    }
}

internal fun serialize(dto: UpgradedGiftModelCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "upgradedGiftModelCount")
        put(key = "model", value = dto.model) { data -> serialize(dto = data) }
        put(key = "total_count", int = dto.totalCount)
    }
}

internal fun serialize(dto: UpgradedGiftSymbolCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "upgradedGiftSymbolCount")
        put(key = "symbol", value = dto.symbol) { data -> serialize(dto = data) }
        put(key = "total_count", int = dto.totalCount)
    }
}

internal fun serialize(dto: UpgradedGiftBackdropCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "upgradedGiftBackdropCount")
        put(key = "backdrop", value = dto.backdrop) { data -> serialize(dto = data) }
        put(key = "total_count", int = dto.totalCount)
    }
}

internal fun serialize(dto: GiftForResaleOrderPrice): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giftForResaleOrderPrice")
    }
}

internal fun serialize(dto: GiftForResaleOrderPriceChangeDate): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giftForResaleOrderPriceChangeDate")
    }
}

internal fun serialize(dto: GiftForResaleOrderNumber): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giftForResaleOrderNumber")
    }
}

internal fun serialize(dto: GiftForResale): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giftForResale")
        put(key = "gift", value = dto.gift) { data -> serialize(dto = data) }
        put(key = "received_gift_id", string = dto.receivedGiftId)
    }
}

internal fun serialize(dto: GiftsForResale): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giftsForResale")
        put(key = "total_count", int = dto.totalCount)
        put(key = "gifts", objects = dto.gifts) { data -> serialize(dto = data) }
        put(key = "models", objects = dto.models) { data -> serialize(dto = data) }
        put(key = "symbols", objects = dto.symbols) { data -> serialize(dto = data) }
        put(key = "backdrops", objects = dto.backdrops) { data -> serialize(dto = data) }
        put(key = "next_offset", string = dto.nextOffset)
    }
}

internal fun serialize(dto: GiftResaleResultOk): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giftResaleResultOk")
        put(key = "received_gift_id", string = dto.receivedGiftId)
    }
}

internal fun serialize(dto: GiftResaleResultPriceIncreased): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giftResaleResultPriceIncreased")
        put(key = "price", value = dto.price) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: SentGiftRegular): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "sentGiftRegular")
        put(key = "gift", value = dto.gift) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: SentGiftUpgraded): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "sentGiftUpgraded")
        put(key = "gift", value = dto.gift) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ReceivedGift): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "receivedGift")
        put(key = "received_gift_id", string = dto.receivedGiftId)
        put(key = "sender_id", value = dto.senderId) { data -> serialize(dto = data) }
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "unique_gift_number", int = dto.uniqueGiftNumber)
        put(key = "is_private", boolean = dto.isPrivate)
        put(key = "is_saved", boolean = dto.isSaved)
        put(key = "is_pinned", boolean = dto.isPinned)
        put(key = "can_be_upgraded", boolean = dto.canBeUpgraded)
        put(key = "can_be_transferred", boolean = dto.canBeTransferred)
        put(key = "was_refunded", boolean = dto.wasRefunded)
        put(key = "date", int = dto.date)
        put(key = "gift", value = dto.gift) { data -> serialize(dto = data) }
        put(key = "collection_ids", ints = dto.collectionIds)
        put(key = "sell_star_count", long = dto.sellStarCount)
        put(key = "prepaid_upgrade_star_count", long = dto.prepaidUpgradeStarCount)
        put(key = "is_upgrade_separate", boolean = dto.isUpgradeSeparate)
        put(key = "transfer_star_count", long = dto.transferStarCount)
        put(key = "drop_original_details_star_count", long = dto.dropOriginalDetailsStarCount)
        put(key = "next_transfer_date", int = dto.nextTransferDate)
        put(key = "next_resale_date", int = dto.nextResaleDate)
        put(key = "export_date", int = dto.exportDate)
        put(key = "prepaid_upgrade_hash", string = dto.prepaidUpgradeHash)
        put(key = "craft_date", int = dto.craftDate)
    }
}

internal fun serialize(dto: ReceivedGifts): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "receivedGifts")
        put(key = "total_count", int = dto.totalCount)
        put(key = "gifts", objects = dto.gifts) { data -> serialize(dto = data) }
        put(key = "are_notifications_enabled", boolean = dto.areNotificationsEnabled)
        put(key = "next_offset", string = dto.nextOffset)
    }
}

internal fun serialize(dto: AttributeCraftPersistenceProbability): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "attributeCraftPersistenceProbability")
        put(key = "persistence_chance_per_mille", ints = dto.persistenceChancePerMille)
    }
}

internal fun serialize(dto: GiftsForCrafting): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giftsForCrafting")
        put(key = "total_count", int = dto.totalCount)
        put(key = "gifts", objects = dto.gifts) { data -> serialize(dto = data) }
        put(key = "attribute_persistence_probabilities", objects = dto.attributePersistenceProbabilities) { data -> serialize(dto = data) }
        put(key = "next_offset", string = dto.nextOffset)
    }
}

internal fun serialize(dto: GiftUpgradePreview): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giftUpgradePreview")
        put(key = "models", objects = dto.models) { data -> serialize(dto = data) }
        put(key = "symbols", objects = dto.symbols) { data -> serialize(dto = data) }
        put(key = "backdrops", objects = dto.backdrops) { data -> serialize(dto = data) }
        put(key = "prices", objects = dto.prices) { data -> serialize(dto = data) }
        put(key = "next_prices", objects = dto.nextPrices) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: GiftUpgradeVariants): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giftUpgradeVariants")
        put(key = "models", objects = dto.models) { data -> serialize(dto = data) }
        put(key = "symbols", objects = dto.symbols) { data -> serialize(dto = data) }
        put(key = "backdrops", objects = dto.backdrops) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: AuctionBid): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "auctionBid")
        put(key = "star_count", long = dto.starCount)
        put(key = "bid_date", int = dto.bidDate)
        put(key = "position", int = dto.position)
    }
}

internal fun serialize(dto: UserAuctionBid): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userAuctionBid")
        put(key = "star_count", long = dto.starCount)
        put(key = "bid_date", int = dto.bidDate)
        put(key = "next_bid_star_count", long = dto.nextBidStarCount)
        put(key = "owner_id", value = dto.ownerId) { data -> serialize(dto = data) }
        put(key = "was_returned", boolean = dto.wasReturned)
    }
}

internal fun serialize(dto: AuctionRound): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "auctionRound")
        put(key = "number", int = dto.number)
        put(key = "duration", int = dto.duration)
        put(key = "extend_time", int = dto.extendTime)
        put(key = "top_winner_count", int = dto.topWinnerCount)
    }
}

internal fun serialize(dto: AuctionStateActive): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "auctionStateActive")
        put(key = "start_date", int = dto.startDate)
        put(key = "end_date", int = dto.endDate)
        put(key = "min_bid", long = dto.minBid)
        put(key = "bid_levels", objects = dto.bidLevels) { data -> serialize(dto = data) }
        put(key = "top_bidder_user_ids", longs = dto.topBidderUserIds)
        put(key = "rounds", objects = dto.rounds) { data -> serialize(dto = data) }
        put(key = "current_round_end_date", int = dto.currentRoundEndDate)
        put(key = "current_round_number", int = dto.currentRoundNumber)
        put(key = "total_round_count", int = dto.totalRoundCount)
        put(key = "distributed_item_count", int = dto.distributedItemCount)
        put(key = "left_item_count", int = dto.leftItemCount)
        put(key = "acquired_item_count", int = dto.acquiredItemCount)
        put(key = "user_bid", value = dto.userBid) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: AuctionStateFinished): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "auctionStateFinished")
        put(key = "start_date", int = dto.startDate)
        put(key = "end_date", int = dto.endDate)
        put(key = "average_price", long = dto.averagePrice)
        put(key = "acquired_item_count", int = dto.acquiredItemCount)
        put(key = "telegram_listed_item_count", int = dto.telegramListedItemCount)
        put(key = "fragment_listed_item_count", int = dto.fragmentListedItemCount)
        put(key = "fragment_url", string = dto.fragmentUrl)
    }
}

internal fun serialize(dto: GiftAuctionState): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giftAuctionState")
        put(key = "gift", value = dto.gift) { data -> serialize(dto = data) }
        put(key = "state", value = dto.state) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: GiftAuctionAcquiredGift): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giftAuctionAcquiredGift")
        put(key = "receiver_id", value = dto.receiverId) { data -> serialize(dto = data) }
        put(key = "date", int = dto.date)
        put(key = "star_count", long = dto.starCount)
        put(key = "auction_round_number", int = dto.auctionRoundNumber)
        put(key = "auction_round_position", int = dto.auctionRoundPosition)
        put(key = "unique_gift_number", int = dto.uniqueGiftNumber)
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "is_private", boolean = dto.isPrivate)
    }
}

internal fun serialize(dto: GiftAuctionAcquiredGifts): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giftAuctionAcquiredGifts")
        put(key = "gifts", objects = dto.gifts) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: TransactionDirectionIncoming): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "transactionDirectionIncoming")
    }
}

internal fun serialize(dto: TransactionDirectionOutgoing): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "transactionDirectionOutgoing")
    }
}

internal fun serialize(dto: StarTransactionTypePremiumBotDeposit): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypePremiumBotDeposit")
    }
}

internal fun serialize(dto: StarTransactionTypeAppStoreDeposit): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeAppStoreDeposit")
    }
}

internal fun serialize(dto: StarTransactionTypeGooglePlayDeposit): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeGooglePlayDeposit")
    }
}

internal fun serialize(dto: StarTransactionTypeFragmentDeposit): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeFragmentDeposit")
    }
}

internal fun serialize(dto: StarTransactionTypeUserDeposit): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeUserDeposit")
        put(key = "user_id", long = dto.userId)
        put(key = "sticker", value = dto.sticker) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StarTransactionTypeGiveawayDeposit): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeGiveawayDeposit")
        put(key = "chat_id", long = dto.chatId)
        put(key = "giveaway_message_id", long = dto.giveawayMessageId)
    }
}

internal fun serialize(dto: StarTransactionTypeFragmentWithdrawal): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeFragmentWithdrawal")
        put(key = "withdrawal_state", value = dto.withdrawalState) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StarTransactionTypeTelegramAdsWithdrawal): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeTelegramAdsWithdrawal")
    }
}

internal fun serialize(dto: StarTransactionTypeTelegramApiUsage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeTelegramApiUsage")
        put(key = "request_count", int = dto.requestCount)
    }
}

internal fun serialize(dto: StarTransactionTypeBotPaidMediaPurchase): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeBotPaidMediaPurchase")
        put(key = "user_id", long = dto.userId)
        put(key = "media", objects = dto.media) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StarTransactionTypeBotPaidMediaSale): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeBotPaidMediaSale")
        put(key = "user_id", long = dto.userId)
        put(key = "media", objects = dto.media) { data -> serialize(dto = data) }
        put(key = "payload", string = dto.payload)
        put(key = "affiliate", value = dto.affiliate) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StarTransactionTypeChannelPaidMediaPurchase): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeChannelPaidMediaPurchase")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_id", long = dto.messageId)
        put(key = "media", objects = dto.media) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StarTransactionTypeChannelPaidMediaSale): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeChannelPaidMediaSale")
        put(key = "user_id", long = dto.userId)
        put(key = "message_id", long = dto.messageId)
        put(key = "media", objects = dto.media) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StarTransactionTypeBotInvoicePurchase): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeBotInvoicePurchase")
        put(key = "user_id", long = dto.userId)
        put(key = "product_info", value = dto.productInfo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StarTransactionTypeBotInvoiceSale): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeBotInvoiceSale")
        put(key = "user_id", long = dto.userId)
        put(key = "product_info", value = dto.productInfo) { data -> serialize(dto = data) }
        put(key = "invoice_payload", bytes = dto.invoicePayload)
        put(key = "affiliate", value = dto.affiliate) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StarTransactionTypeBotSubscriptionPurchase): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeBotSubscriptionPurchase")
        put(key = "user_id", long = dto.userId)
        put(key = "subscription_period", int = dto.subscriptionPeriod)
        put(key = "product_info", value = dto.productInfo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StarTransactionTypeBotSubscriptionSale): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeBotSubscriptionSale")
        put(key = "user_id", long = dto.userId)
        put(key = "subscription_period", int = dto.subscriptionPeriod)
        put(key = "product_info", value = dto.productInfo) { data -> serialize(dto = data) }
        put(key = "invoice_payload", bytes = dto.invoicePayload)
        put(key = "affiliate", value = dto.affiliate) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StarTransactionTypeChannelSubscriptionPurchase): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeChannelSubscriptionPurchase")
        put(key = "chat_id", long = dto.chatId)
        put(key = "subscription_period", int = dto.subscriptionPeriod)
    }
}

internal fun serialize(dto: StarTransactionTypeChannelSubscriptionSale): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeChannelSubscriptionSale")
        put(key = "user_id", long = dto.userId)
        put(key = "subscription_period", int = dto.subscriptionPeriod)
    }
}

internal fun serialize(dto: StarTransactionTypeGiftAuctionBid): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeGiftAuctionBid")
        put(key = "owner_id", value = dto.ownerId) { data -> serialize(dto = data) }
        put(key = "gift", value = dto.gift) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StarTransactionTypeGiftPurchase): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeGiftPurchase")
        put(key = "owner_id", value = dto.ownerId) { data -> serialize(dto = data) }
        put(key = "gift", value = dto.gift) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StarTransactionTypeGiftPurchaseOffer): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeGiftPurchaseOffer")
        put(key = "gift", value = dto.gift) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StarTransactionTypeGiftTransfer): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeGiftTransfer")
        put(key = "owner_id", value = dto.ownerId) { data -> serialize(dto = data) }
        put(key = "gift", value = dto.gift) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StarTransactionTypeGiftOriginalDetailsDrop): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeGiftOriginalDetailsDrop")
        put(key = "owner_id", value = dto.ownerId) { data -> serialize(dto = data) }
        put(key = "gift", value = dto.gift) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StarTransactionTypeGiftSale): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeGiftSale")
        put(key = "user_id", long = dto.userId)
        put(key = "gift", value = dto.gift) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StarTransactionTypeGiftUpgrade): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeGiftUpgrade")
        put(key = "user_id", long = dto.userId)
        put(key = "gift", value = dto.gift) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StarTransactionTypeGiftUpgradePurchase): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeGiftUpgradePurchase")
        put(key = "owner_id", value = dto.ownerId) { data -> serialize(dto = data) }
        put(key = "gift", value = dto.gift) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StarTransactionTypeUpgradedGiftPurchase): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeUpgradedGiftPurchase")
        put(key = "user_id", long = dto.userId)
        put(key = "gift", value = dto.gift) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StarTransactionTypeUpgradedGiftSale): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeUpgradedGiftSale")
        put(key = "user_id", long = dto.userId)
        put(key = "gift", value = dto.gift) { data -> serialize(dto = data) }
        put(key = "commission_per_mille", int = dto.commissionPerMille)
        put(key = "commission_star_amount", value = dto.commissionStarAmount) { data -> serialize(dto = data) }
        put(key = "via_offer", boolean = dto.viaOffer)
    }
}

internal fun serialize(dto: StarTransactionTypeChannelPaidReactionSend): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeChannelPaidReactionSend")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_id", long = dto.messageId)
    }
}

internal fun serialize(dto: StarTransactionTypeChannelPaidReactionReceive): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeChannelPaidReactionReceive")
        put(key = "user_id", long = dto.userId)
        put(key = "message_id", long = dto.messageId)
    }
}

internal fun serialize(dto: StarTransactionTypeAffiliateProgramCommission): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeAffiliateProgramCommission")
        put(key = "chat_id", long = dto.chatId)
        put(key = "commission_per_mille", int = dto.commissionPerMille)
    }
}

internal fun serialize(dto: StarTransactionTypePaidMessageSend): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypePaidMessageSend")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_count", int = dto.messageCount)
    }
}

internal fun serialize(dto: StarTransactionTypePaidMessageReceive): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypePaidMessageReceive")
        put(key = "sender_id", value = dto.senderId) { data -> serialize(dto = data) }
        put(key = "message_count", int = dto.messageCount)
        put(key = "commission_per_mille", int = dto.commissionPerMille)
        put(key = "commission_star_amount", value = dto.commissionStarAmount) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StarTransactionTypePaidGroupCallMessageSend): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypePaidGroupCallMessageSend")
        put(key = "chat_id", long = dto.chatId)
    }
}

internal fun serialize(dto: StarTransactionTypePaidGroupCallMessageReceive): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypePaidGroupCallMessageReceive")
        put(key = "sender_id", value = dto.senderId) { data -> serialize(dto = data) }
        put(key = "commission_per_mille", int = dto.commissionPerMille)
        put(key = "commission_star_amount", value = dto.commissionStarAmount) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StarTransactionTypePaidGroupCallReactionSend): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypePaidGroupCallReactionSend")
        put(key = "chat_id", long = dto.chatId)
    }
}

internal fun serialize(dto: StarTransactionTypePaidGroupCallReactionReceive): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypePaidGroupCallReactionReceive")
        put(key = "sender_id", value = dto.senderId) { data -> serialize(dto = data) }
        put(key = "commission_per_mille", int = dto.commissionPerMille)
        put(key = "commission_star_amount", value = dto.commissionStarAmount) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StarTransactionTypeSuggestedPostPaymentSend): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeSuggestedPostPaymentSend")
        put(key = "chat_id", long = dto.chatId)
    }
}

internal fun serialize(dto: StarTransactionTypeSuggestedPostPaymentReceive): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeSuggestedPostPaymentReceive")
        put(key = "user_id", long = dto.userId)
    }
}

internal fun serialize(dto: StarTransactionTypePremiumPurchase): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypePremiumPurchase")
        put(key = "user_id", long = dto.userId)
        put(key = "month_count", int = dto.monthCount)
        put(key = "sticker", value = dto.sticker) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StarTransactionTypeBusinessBotTransferSend): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeBusinessBotTransferSend")
        put(key = "user_id", long = dto.userId)
    }
}

internal fun serialize(dto: StarTransactionTypeBusinessBotTransferReceive): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeBusinessBotTransferReceive")
        put(key = "user_id", long = dto.userId)
    }
}

internal fun serialize(dto: StarTransactionTypePublicPostSearch): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypePublicPostSearch")
    }
}

internal fun serialize(dto: StarTransactionTypeUnsupported): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactionTypeUnsupported")
    }
}

internal fun serialize(dto: StarTransaction): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransaction")
        put(key = "id", string = dto.id)
        put(key = "star_amount", value = dto.starAmount) { data -> serialize(dto = data) }
        put(key = "is_refund", boolean = dto.isRefund)
        put(key = "date", int = dto.date)
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StarTransactions): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starTransactions")
        put(key = "star_amount", value = dto.starAmount) { data -> serialize(dto = data) }
        put(key = "transactions", objects = dto.transactions) { data -> serialize(dto = data) }
        put(key = "next_offset", string = dto.nextOffset)
    }
}

internal fun serialize(dto: TonTransactionTypeFragmentDeposit): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "tonTransactionTypeFragmentDeposit")
        put(key = "is_gift", boolean = dto.isGift)
        put(key = "sticker", value = dto.sticker) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: TonTransactionTypeFragmentWithdrawal): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "tonTransactionTypeFragmentWithdrawal")
        put(key = "withdrawal_state", value = dto.withdrawalState) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: TonTransactionTypeSuggestedPostPayment): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "tonTransactionTypeSuggestedPostPayment")
        put(key = "chat_id", long = dto.chatId)
    }
}

internal fun serialize(dto: TonTransactionTypeGiftPurchaseOffer): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "tonTransactionTypeGiftPurchaseOffer")
        put(key = "gift", value = dto.gift) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: TonTransactionTypeUpgradedGiftPurchase): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "tonTransactionTypeUpgradedGiftPurchase")
        put(key = "user_id", long = dto.userId)
        put(key = "gift", value = dto.gift) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: TonTransactionTypeUpgradedGiftSale): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "tonTransactionTypeUpgradedGiftSale")
        put(key = "user_id", long = dto.userId)
        put(key = "gift", value = dto.gift) { data -> serialize(dto = data) }
        put(key = "commission_per_mille", int = dto.commissionPerMille)
        put(key = "commission_gram_amount", long = dto.commissionGramAmount)
        put(key = "via_offer", boolean = dto.viaOffer)
    }
}

internal fun serialize(dto: TonTransactionTypeStakeDiceStake): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "tonTransactionTypeStakeDiceStake")
    }
}

internal fun serialize(dto: TonTransactionTypeStakeDicePayout): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "tonTransactionTypeStakeDicePayout")
    }
}

internal fun serialize(dto: TonTransactionTypeUnsupported): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "tonTransactionTypeUnsupported")
    }
}

internal fun serialize(dto: TonTransaction): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "tonTransaction")
        put(key = "id", string = dto.id)
        put(key = "gram_amount", long = dto.gramAmount)
        put(key = "is_refund", boolean = dto.isRefund)
        put(key = "date", int = dto.date)
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: TonTransactions): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "tonTransactions")
        put(key = "gram_amount", long = dto.gramAmount)
        put(key = "transactions", objects = dto.transactions) { data -> serialize(dto = data) }
        put(key = "next_offset", string = dto.nextOffset)
    }
}

internal fun serialize(dto: ActiveStoryStateLive): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "activeStoryStateLive")
        put(key = "story_id", int = dto.storyId)
    }
}

internal fun serialize(dto: ActiveStoryStateUnread): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "activeStoryStateUnread")
    }
}

internal fun serialize(dto: ActiveStoryStateRead): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "activeStoryStateRead")
    }
}

internal fun serialize(dto: GiveawayParticipantStatusEligible): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giveawayParticipantStatusEligible")
    }
}

internal fun serialize(dto: GiveawayParticipantStatusParticipating): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giveawayParticipantStatusParticipating")
    }
}

internal fun serialize(dto: GiveawayParticipantStatusAlreadyWasMember): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giveawayParticipantStatusAlreadyWasMember")
        put(key = "joined_chat_date", int = dto.joinedChatDate)
    }
}

internal fun serialize(dto: GiveawayParticipantStatusAdministrator): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giveawayParticipantStatusAdministrator")
        put(key = "chat_id", long = dto.chatId)
    }
}

internal fun serialize(dto: GiveawayParticipantStatusDisallowedCountry): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giveawayParticipantStatusDisallowedCountry")
        put(key = "user_country_code", string = dto.userCountryCode)
    }
}

internal fun serialize(dto: GiveawayInfoOngoing): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giveawayInfoOngoing")
        put(key = "creation_date", int = dto.creationDate)
        put(key = "status", value = dto.status) { data -> serialize(dto = data) }
        put(key = "is_ended", boolean = dto.isEnded)
    }
}

internal fun serialize(dto: GiveawayInfoCompleted): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giveawayInfoCompleted")
        put(key = "creation_date", int = dto.creationDate)
        put(key = "actual_winners_selection_date", int = dto.actualWinnersSelectionDate)
        put(key = "was_refunded", boolean = dto.wasRefunded)
        put(key = "is_winner", boolean = dto.isWinner)
        put(key = "winner_count", int = dto.winnerCount)
        put(key = "activation_count", int = dto.activationCount)
        put(key = "gift_code", string = dto.giftCode)
        put(key = "won_star_count", long = dto.wonStarCount)
    }
}

internal fun serialize(dto: GiveawayPrizePremium): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giveawayPrizePremium")
        put(key = "month_count", int = dto.monthCount)
    }
}

internal fun serialize(dto: GiveawayPrizeStars): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giveawayPrizeStars")
        put(key = "star_count", long = dto.starCount)
    }
}

internal fun serialize(dto: LinkPreviewOptions): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewOptions")
        put(key = "is_disabled", boolean = dto.isDisabled)
        put(key = "url", string = dto.url)
        put(key = "force_small_media", boolean = dto.forceSmallMedia)
        put(key = "force_large_media", boolean = dto.forceLargeMedia)
        put(key = "show_above_text", boolean = dto.showAboveText)
    }
}

internal fun serialize(dto: AccentColor): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "accentColor")
        put(key = "id", int = dto.id)
        put(key = "built_in_accent_color_id", int = dto.builtInAccentColorId)
        put(key = "light_theme_colors", ints = dto.lightThemeColors)
        put(key = "dark_theme_colors", ints = dto.darkThemeColors)
        put(key = "min_channel_chat_boost_level", int = dto.minChannelChatBoostLevel)
    }
}

internal fun serialize(dto: ProfileAccentColors): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "profileAccentColors")
        put(key = "palette_colors", ints = dto.paletteColors)
        put(key = "background_colors", ints = dto.backgroundColors)
        put(key = "story_colors", ints = dto.storyColors)
    }
}

internal fun serialize(dto: ProfileAccentColor): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "profileAccentColor")
        put(key = "id", int = dto.id)
        put(key = "light_theme_colors", value = dto.lightThemeColors) { data -> serialize(dto = data) }
        put(key = "dark_theme_colors", value = dto.darkThemeColors) { data -> serialize(dto = data) }
        put(key = "min_supergroup_chat_boost_level", int = dto.minSupergroupChatBoostLevel)
        put(key = "min_channel_chat_boost_level", int = dto.minChannelChatBoostLevel)
    }
}

internal fun serialize(dto: CommunityPermissions): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "communityPermissions")
        put(key = "can_edit_chat_list", boolean = dto.canEditChatList)
    }
}

internal fun serialize(dto: CommunityAdministratorRights): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "communityAdministratorRights")
        put(key = "can_manage_community", boolean = dto.canManageCommunity)
        put(key = "can_change_info", boolean = dto.canChangeInfo)
        put(key = "can_edit_chat_list", boolean = dto.canEditChatList)
        put(key = "can_promote_members", boolean = dto.canPromoteMembers)
        put(key = "can_ban_members", boolean = dto.canBanMembers)
    }
}

internal fun serialize(dto: CommunityMemberStatusCreator): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "communityMemberStatusCreator")
    }
}

internal fun serialize(dto: CommunityMemberStatusAdministrator): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "communityMemberStatusAdministrator")
        put(key = "can_be_edited", boolean = dto.canBeEdited)
        put(key = "rights", value = dto.rights) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: CommunityMemberStatusMember): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "communityMemberStatusMember")
    }
}

internal fun serialize(dto: CommunityMemberStatusLeft): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "communityMemberStatusLeft")
    }
}

internal fun serialize(dto: CommunityMemberStatusBanned): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "communityMemberStatusBanned")
    }
}

internal fun serialize(dto: Community): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "community")
        put(key = "id", long = dto.id)
        put(key = "have_access", boolean = dto.haveAccess)
        put(key = "name", string = dto.name)
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
        put(key = "date", int = dto.date)
        put(key = "status", value = dto.status) { data -> serialize(dto = data) }
        put(key = "permissions", value = dto.permissions) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UserRating): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userRating")
        put(key = "level", int = dto.level)
        put(key = "is_maximum_level_reached", boolean = dto.isMaximumLevelReached)
        put(key = "rating", long = dto.rating)
        put(key = "current_level_rating", long = dto.currentLevelRating)
        put(key = "next_level_rating", long = dto.nextLevelRating)
    }
}

internal fun serialize(dto: RestrictionInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "restrictionInfo")
        put(key = "restriction_reason", string = dto.restrictionReason)
        put(key = "has_sensitive_content", boolean = dto.hasSensitiveContent)
    }
}

internal fun serialize(dto: EmojiStatusTypeCustomEmoji): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "emojiStatusTypeCustomEmoji")
        put(key = "custom_emoji_id", long = dto.customEmojiId)
    }
}

internal fun serialize(dto: EmojiStatusTypeUpgradedGift): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "emojiStatusTypeUpgradedGift")
        put(key = "upgraded_gift_id", long = dto.upgradedGiftId)
        put(key = "gift_title", string = dto.giftTitle)
        put(key = "gift_name", string = dto.giftName)
        put(key = "model_custom_emoji_id", long = dto.modelCustomEmojiId)
        put(key = "symbol_custom_emoji_id", long = dto.symbolCustomEmojiId)
        put(key = "backdrop_colors", value = dto.backdropColors) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: EmojiStatus): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "emojiStatus")
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
        put(key = "expiration_date", int = dto.expirationDate)
    }
}

internal fun serialize(dto: EmojiStatuses): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "emojiStatuses")
        put(key = "emoji_statuses", objects = dto.emojiStatuses) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: EmojiStatusCustomEmojis): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "emojiStatusCustomEmojis")
        put(key = "custom_emoji_ids", longs = dto.customEmojiIds)
    }
}

internal fun serialize(dto: Usernames): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "usernames")
        put(key = "active_usernames", strings = dto.activeUsernames)
        put(key = "disabled_usernames", strings = dto.disabledUsernames)
        put(key = "editable_username", string = dto.editableUsername)
        put(key = "collectible_usernames", strings = dto.collectibleUsernames)
    }
}

internal fun serialize(dto: User): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "user")
        put(key = "id", long = dto.id)
        put(key = "first_name", string = dto.firstName)
        put(key = "last_name", string = dto.lastName)
        put(key = "usernames", value = dto.usernames) { data -> serialize(dto = data) }
        put(key = "phone_number", string = dto.phoneNumber)
        put(key = "status", value = dto.status) { data -> serialize(dto = data) }
        put(key = "profile_photo", value = dto.profilePhoto) { data -> serialize(dto = data) }
        put(key = "accent_color_id", int = dto.accentColorId)
        put(key = "background_custom_emoji_id", long = dto.backgroundCustomEmojiId)
        put(key = "upgraded_gift_colors", value = dto.upgradedGiftColors) { data -> serialize(dto = data) }
        put(key = "profile_accent_color_id", int = dto.profileAccentColorId)
        put(key = "profile_background_custom_emoji_id", long = dto.profileBackgroundCustomEmojiId)
        put(key = "emoji_status", value = dto.emojiStatus) { data -> serialize(dto = data) }
        put(key = "is_contact", boolean = dto.isContact)
        put(key = "is_mutual_contact", boolean = dto.isMutualContact)
        put(key = "is_close_friend", boolean = dto.isCloseFriend)
        put(key = "verification_status", value = dto.verificationStatus) { data -> serialize(dto = data) }
        put(key = "is_premium", boolean = dto.isPremium)
        put(key = "is_support", boolean = dto.isSupport)
        put(key = "restriction_info", value = dto.restrictionInfo) { data -> serialize(dto = data) }
        put(key = "active_story_state", value = dto.activeStoryState) { data -> serialize(dto = data) }
        put(key = "restricts_new_chats", boolean = dto.restrictsNewChats)
        put(key = "paid_message_star_count", long = dto.paidMessageStarCount)
        put(key = "have_access", boolean = dto.haveAccess)
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
        put(key = "language_code", string = dto.languageCode)
        put(key = "added_to_attachment_menu", boolean = dto.addedToAttachmentMenu)
    }
}

internal fun serialize(dto: BotInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "botInfo")
        put(key = "short_description", string = dto.shortDescription)
        put(key = "description", string = dto.description)
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
        put(key = "animation", value = dto.animation) { data -> serialize(dto = data) }
        put(key = "manager_bot_user_id", long = dto.managerBotUserId)
        put(key = "menu_button", value = dto.menuButton) { data -> serialize(dto = data) }
        put(key = "commands", objects = dto.commands) { data -> serialize(dto = data) }
        put(key = "privacy_policy_url", string = dto.privacyPolicyUrl)
        put(key = "default_group_administrator_rights", value = dto.defaultGroupAdministratorRights) { data -> serialize(dto = data) }
        put(key = "default_channel_administrator_rights", value = dto.defaultChannelAdministratorRights) { data -> serialize(dto = data) }
        put(key = "affiliate_program", value = dto.affiliateProgram) { data -> serialize(dto = data) }
        put(key = "web_app_background_light_color", int = dto.webAppBackgroundLightColor)
        put(key = "web_app_background_dark_color", int = dto.webAppBackgroundDarkColor)
        put(key = "web_app_header_light_color", int = dto.webAppHeaderLightColor)
        put(key = "web_app_header_dark_color", int = dto.webAppHeaderDarkColor)
        put(key = "verification_parameters", value = dto.verificationParameters) { data -> serialize(dto = data) }
        put(key = "can_get_revenue_statistics", boolean = dto.canGetRevenueStatistics)
        put(key = "can_manage_emoji_status", boolean = dto.canManageEmojiStatus)
        put(key = "has_media_previews", boolean = dto.hasMediaPreviews)
        put(key = "edit_commands_link", value = dto.editCommandsLink) { data -> serialize(dto = data) }
        put(key = "edit_description_link", value = dto.editDescriptionLink) { data -> serialize(dto = data) }
        put(key = "edit_description_media_link", value = dto.editDescriptionMediaLink) { data -> serialize(dto = data) }
        put(key = "edit_settings_link", value = dto.editSettingsLink) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UserFullInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userFullInfo")
        put(key = "personal_photo", value = dto.personalPhoto) { data -> serialize(dto = data) }
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
        put(key = "public_photo", value = dto.publicPhoto) { data -> serialize(dto = data) }
        put(key = "community_id", long = dto.communityId)
        put(key = "block_list", value = dto.blockList) { data -> serialize(dto = data) }
        put(key = "can_be_called", boolean = dto.canBeCalled)
        put(key = "supports_video_calls", boolean = dto.supportsVideoCalls)
        put(key = "has_private_calls", boolean = dto.hasPrivateCalls)
        put(key = "has_private_forwards", boolean = dto.hasPrivateForwards)
        put(key = "has_restricted_voice_and_video_note_messages", boolean = dto.hasRestrictedVoiceAndVideoNoteMessages)
        put(key = "has_posted_to_profile_stories", boolean = dto.hasPostedToProfileStories)
        put(key = "has_sponsored_messages_enabled", boolean = dto.hasSponsoredMessagesEnabled)
        put(key = "need_phone_number_privacy_exception", boolean = dto.needPhoneNumberPrivacyException)
        put(key = "set_chat_background", boolean = dto.setChatBackground)
        put(key = "uses_unofficial_app", boolean = dto.usesUnofficialApp)
        put(key = "bio", value = dto.bio) { data -> serialize(dto = data) }
        put(key = "birthdate", value = dto.birthdate) { data -> serialize(dto = data) }
        put(key = "personal_chat_id", long = dto.personalChatId)
        put(key = "gift_count", int = dto.giftCount)
        put(key = "group_in_common_count", int = dto.groupInCommonCount)
        put(key = "incoming_paid_message_star_count", long = dto.incomingPaidMessageStarCount)
        put(key = "outgoing_paid_message_star_count", long = dto.outgoingPaidMessageStarCount)
        put(key = "gift_settings", value = dto.giftSettings) { data -> serialize(dto = data) }
        put(key = "bot_verification", value = dto.botVerification) { data -> serialize(dto = data) }
        put(key = "main_profile_tab", value = dto.mainProfileTab) { data -> serialize(dto = data) }
        put(key = "first_profile_audio", value = dto.firstProfileAudio) { data -> serialize(dto = data) }
        put(key = "rating", value = dto.rating) { data -> serialize(dto = data) }
        put(key = "pending_rating", value = dto.pendingRating) { data -> serialize(dto = data) }
        put(key = "pending_rating_date", int = dto.pendingRatingDate)
        put(key = "note", value = dto.note) { data -> serialize(dto = data) }
        put(key = "business_info", value = dto.businessInfo) { data -> serialize(dto = data) }
        put(key = "bot_info", value = dto.botInfo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: Users): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "users")
        put(key = "total_count", int = dto.totalCount)
        put(key = "user_ids", longs = dto.userIds)
    }
}

internal fun serialize(dto: FoundUsers): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "foundUsers")
        put(key = "user_ids", longs = dto.userIds)
        put(key = "next_offset", string = dto.nextOffset)
    }
}

internal fun serialize(dto: ChatAdministrator): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatAdministrator")
        put(key = "user_id", long = dto.userId)
        put(key = "custom_title", string = dto.customTitle)
        put(key = "is_owner", boolean = dto.isOwner)
        put(key = "can_be_edited", boolean = dto.canBeEdited)
    }
}

internal fun serialize(dto: ChatAdministrators): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatAdministrators")
        put(key = "administrators", objects = dto.administrators) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatMemberStatusCreator): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatMemberStatusCreator")
        put(key = "is_anonymous", boolean = dto.isAnonymous)
        put(key = "is_member", boolean = dto.isMember)
    }
}

internal fun serialize(dto: ChatMemberStatusAdministrator): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatMemberStatusAdministrator")
        put(key = "can_be_edited", boolean = dto.canBeEdited)
        put(key = "rights", value = dto.rights) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatMemberStatusMember): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatMemberStatusMember")
        put(key = "member_until_date", int = dto.memberUntilDate)
    }
}

internal fun serialize(dto: ChatMemberStatusRestricted): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatMemberStatusRestricted")
        put(key = "is_member", boolean = dto.isMember)
        put(key = "restricted_until_date", int = dto.restrictedUntilDate)
        put(key = "permissions", value = dto.permissions) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatMemberStatusLeft): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatMemberStatusLeft")
    }
}

internal fun serialize(dto: ChatMemberStatusBanned): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatMemberStatusBanned")
        put(key = "banned_until_date", int = dto.bannedUntilDate)
    }
}

internal fun serialize(dto: ChatMember): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatMember")
        put(key = "member_id", value = dto.memberId) { data -> serialize(dto = data) }
        put(key = "tag", string = dto.tag)
        put(key = "inviter_user_id", long = dto.inviterUserId)
        put(key = "joined_chat_date", int = dto.joinedChatDate)
        put(key = "status", value = dto.status) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatMembers): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatMembers")
        put(key = "total_count", int = dto.totalCount)
        put(key = "members", objects = dto.members) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatMembersFilterContacts): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatMembersFilterContacts")
    }
}

internal fun serialize(dto: ChatMembersFilterAdministrators): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatMembersFilterAdministrators")
    }
}

internal fun serialize(dto: ChatMembersFilterMembers): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatMembersFilterMembers")
    }
}

internal fun serialize(dto: ChatMembersFilterMention): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatMembersFilterMention")
        put(key = "topic_id", value = dto.topicId) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatMembersFilterRestricted): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatMembersFilterRestricted")
    }
}

internal fun serialize(dto: ChatMembersFilterBanned): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatMembersFilterBanned")
    }
}

internal fun serialize(dto: ChatMembersFilterBots): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatMembersFilterBots")
    }
}

internal fun serialize(dto: SupergroupMembersFilterRecent): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "supergroupMembersFilterRecent")
    }
}

internal fun serialize(dto: SupergroupMembersFilterContacts): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "supergroupMembersFilterContacts")
        put(key = "query", string = dto.query)
    }
}

internal fun serialize(dto: SupergroupMembersFilterAdministrators): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "supergroupMembersFilterAdministrators")
    }
}

internal fun serialize(dto: SupergroupMembersFilterSearch): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "supergroupMembersFilterSearch")
        put(key = "query", string = dto.query)
    }
}

internal fun serialize(dto: SupergroupMembersFilterRestricted): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "supergroupMembersFilterRestricted")
        put(key = "query", string = dto.query)
    }
}

internal fun serialize(dto: SupergroupMembersFilterBanned): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "supergroupMembersFilterBanned")
        put(key = "query", string = dto.query)
    }
}

internal fun serialize(dto: SupergroupMembersFilterMention): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "supergroupMembersFilterMention")
        put(key = "query", string = dto.query)
        put(key = "topic_id", value = dto.topicId) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: SupergroupMembersFilterBots): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "supergroupMembersFilterBots")
    }
}

internal fun serialize(dto: ChatJoinResultSuccess): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatJoinResultSuccess")
        put(key = "chat_id", long = dto.chatId)
    }
}

internal fun serialize(dto: ChatJoinResultRequestSent): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatJoinResultRequestSent")
    }
}

internal fun serialize(dto: ChatJoinResultGuardBotApprovalRequired): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatJoinResultGuardBotApprovalRequired")
        put(key = "bot_user_id", long = dto.botUserId)
        put(key = "query_id", long = dto.queryId)
    }
}

internal fun serialize(dto: ChatJoinResultDeclined): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatJoinResultDeclined")
    }
}

internal fun serialize(dto: ChatJoinRequestResultApproved): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatJoinRequestResultApproved")
    }
}

internal fun serialize(dto: ChatJoinRequestResultDeclined): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatJoinRequestResultDeclined")
    }
}

internal fun serialize(dto: ChatJoinRequestResultQueued): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatJoinRequestResultQueued")
    }
}

internal fun serialize(dto: ChatInviteLink): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatInviteLink")
        put(key = "invite_link", string = dto.inviteLink)
        put(key = "name", string = dto.name)
        put(key = "creator_user_id", long = dto.creatorUserId)
        put(key = "date", int = dto.date)
        put(key = "edit_date", int = dto.editDate)
        put(key = "expiration_date", int = dto.expirationDate)
        put(key = "subscription_pricing", value = dto.subscriptionPricing) { data -> serialize(dto = data) }
        put(key = "member_limit", int = dto.memberLimit)
        put(key = "member_count", int = dto.memberCount)
        put(key = "expired_member_count", int = dto.expiredMemberCount)
        put(key = "pending_join_request_count", int = dto.pendingJoinRequestCount)
        put(key = "creates_join_request", boolean = dto.createsJoinRequest)
        put(key = "is_primary", boolean = dto.isPrimary)
        put(key = "is_revoked", boolean = dto.isRevoked)
    }
}

internal fun serialize(dto: ChatInviteLinks): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatInviteLinks")
        put(key = "total_count", int = dto.totalCount)
        put(key = "invite_links", objects = dto.inviteLinks) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatInviteLinkCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatInviteLinkCount")
        put(key = "user_id", long = dto.userId)
        put(key = "invite_link_count", int = dto.inviteLinkCount)
        put(key = "revoked_invite_link_count", int = dto.revokedInviteLinkCount)
    }
}

internal fun serialize(dto: ChatInviteLinkCounts): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatInviteLinkCounts")
        put(key = "invite_link_counts", objects = dto.inviteLinkCounts) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatInviteLinkMember): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatInviteLinkMember")
        put(key = "user_id", long = dto.userId)
        put(key = "joined_chat_date", int = dto.joinedChatDate)
        put(key = "via_chat_folder_invite_link", boolean = dto.viaChatFolderInviteLink)
        put(key = "approver_user_id", long = dto.approverUserId)
    }
}

internal fun serialize(dto: ChatInviteLinkMembers): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatInviteLinkMembers")
        put(key = "total_count", int = dto.totalCount)
        put(key = "members", objects = dto.members) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InviteLinkChatTypeBasicGroup): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inviteLinkChatTypeBasicGroup")
    }
}

internal fun serialize(dto: InviteLinkChatTypeSupergroup): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inviteLinkChatTypeSupergroup")
    }
}

internal fun serialize(dto: InviteLinkChatTypeChannel): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inviteLinkChatTypeChannel")
    }
}

internal fun serialize(dto: ChatInviteLinkSubscriptionInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatInviteLinkSubscriptionInfo")
        put(key = "pricing", value = dto.pricing) { data -> serialize(dto = data) }
        put(key = "can_reuse", boolean = dto.canReuse)
        put(key = "form_id", long = dto.formId)
    }
}

internal fun serialize(dto: ChatInviteLinkInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatInviteLinkInfo")
        put(key = "chat_id", long = dto.chatId)
        put(key = "accessible_for", int = dto.accessibleFor)
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
        put(key = "title", string = dto.title)
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
        put(key = "accent_color_id", int = dto.accentColorId)
        put(key = "description", string = dto.description)
        put(key = "member_count", int = dto.memberCount)
        put(key = "member_user_ids", longs = dto.memberUserIds)
        put(key = "subscription_info", value = dto.subscriptionInfo) { data -> serialize(dto = data) }
        put(key = "creates_join_request", boolean = dto.createsJoinRequest)
        put(key = "is_public", boolean = dto.isPublic)
        put(key = "verification_status", value = dto.verificationStatus) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatJoinRequest): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatJoinRequest")
        put(key = "user_id", long = dto.userId)
        put(key = "date", int = dto.date)
        put(key = "bio", string = dto.bio)
    }
}

internal fun serialize(dto: ChatJoinRequests): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatJoinRequests")
        put(key = "total_count", int = dto.totalCount)
        put(key = "requests", objects = dto.requests) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatJoinRequestsInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatJoinRequestsInfo")
        put(key = "total_count", int = dto.totalCount)
        put(key = "user_ids", longs = dto.userIds)
    }
}

internal fun serialize(dto: BasicGroup): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "basicGroup")
        put(key = "id", long = dto.id)
        put(key = "member_count", int = dto.memberCount)
        put(key = "status", value = dto.status) { data -> serialize(dto = data) }
        put(key = "is_active", boolean = dto.isActive)
        put(key = "upgraded_to_supergroup_id", long = dto.upgradedToSupergroupId)
    }
}

internal fun serialize(dto: BasicGroupFullInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "basicGroupFullInfo")
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
        put(key = "description", string = dto.description)
        put(key = "creator_user_id", long = dto.creatorUserId)
        put(key = "members", objects = dto.members) { data -> serialize(dto = data) }
        put(key = "can_hide_members", boolean = dto.canHideMembers)
        put(key = "can_toggle_aggressive_anti_spam", boolean = dto.canToggleAggressiveAntiSpam)
        put(key = "invite_link", value = dto.inviteLink) { data -> serialize(dto = data) }
        put(key = "bot_commands", objects = dto.botCommands) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: Supergroup): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "supergroup")
        put(key = "id", long = dto.id)
        put(key = "usernames", value = dto.usernames) { data -> serialize(dto = data) }
        put(key = "date", int = dto.date)
        put(key = "status", value = dto.status) { data -> serialize(dto = data) }
        put(key = "member_count", int = dto.memberCount)
        put(key = "boost_level", int = dto.boostLevel)
        put(key = "has_automatic_translation", boolean = dto.hasAutomaticTranslation)
        put(key = "has_linked_chat", boolean = dto.hasLinkedChat)
        put(key = "has_location", boolean = dto.hasLocation)
        put(key = "sign_messages", boolean = dto.signMessages)
        put(key = "show_message_sender", boolean = dto.showMessageSender)
        put(key = "join_to_send_messages", boolean = dto.joinToSendMessages)
        put(key = "join_by_request", boolean = dto.joinByRequest)
        put(key = "is_slow_mode_enabled", boolean = dto.isSlowModeEnabled)
        put(key = "is_channel", boolean = dto.isChannel)
        put(key = "is_broadcast_group", boolean = dto.isBroadcastGroup)
        put(key = "is_forum", boolean = dto.isForum)
        put(key = "is_direct_messages_group", boolean = dto.isDirectMessagesGroup)
        put(key = "is_administered_direct_messages_group", boolean = dto.isAdministeredDirectMessagesGroup)
        put(key = "verification_status", value = dto.verificationStatus) { data -> serialize(dto = data) }
        put(key = "has_direct_messages_group", boolean = dto.hasDirectMessagesGroup)
        put(key = "has_forum_tabs", boolean = dto.hasForumTabs)
        put(key = "restriction_info", value = dto.restrictionInfo) { data -> serialize(dto = data) }
        put(key = "paid_message_star_count", long = dto.paidMessageStarCount)
        put(key = "active_story_state", value = dto.activeStoryState) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: SupergroupFullInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "supergroupFullInfo")
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
        put(key = "community_id", long = dto.communityId)
        put(key = "description", string = dto.description)
        put(key = "member_count", int = dto.memberCount)
        put(key = "administrator_count", int = dto.administratorCount)
        put(key = "restricted_count", int = dto.restrictedCount)
        put(key = "banned_count", int = dto.bannedCount)
        put(key = "linked_chat_id", long = dto.linkedChatId)
        put(key = "direct_messages_chat_id", long = dto.directMessagesChatId)
        put(key = "slow_mode_delay", int = dto.slowModeDelay)
        put(key = "slow_mode_delay_expires_in", double = dto.slowModeDelayExpiresIn)
        put(key = "can_enable_paid_messages", boolean = dto.canEnablePaidMessages)
        put(key = "can_enable_paid_reaction", boolean = dto.canEnablePaidReaction)
        put(key = "can_get_members", boolean = dto.canGetMembers)
        put(key = "has_hidden_members", boolean = dto.hasHiddenMembers)
        put(key = "can_hide_members", boolean = dto.canHideMembers)
        put(key = "can_set_sticker_set", boolean = dto.canSetStickerSet)
        put(key = "can_set_location", boolean = dto.canSetLocation)
        put(key = "can_get_statistics", boolean = dto.canGetStatistics)
        put(key = "can_get_revenue_statistics", boolean = dto.canGetRevenueStatistics)
        put(key = "can_get_star_revenue_statistics", boolean = dto.canGetStarRevenueStatistics)
        put(key = "can_send_gift", boolean = dto.canSendGift)
        put(key = "can_toggle_aggressive_anti_spam", boolean = dto.canToggleAggressiveAntiSpam)
        put(key = "is_all_history_available", boolean = dto.isAllHistoryAvailable)
        put(key = "can_have_sponsored_messages", boolean = dto.canHaveSponsoredMessages)
        put(key = "has_aggressive_anti_spam_enabled", boolean = dto.hasAggressiveAntiSpamEnabled)
        put(key = "has_paid_media_allowed", boolean = dto.hasPaidMediaAllowed)
        put(key = "has_pinned_stories", boolean = dto.hasPinnedStories)
        put(key = "gift_count", int = dto.giftCount)
        put(key = "my_boost_count", int = dto.myBoostCount)
        put(key = "unrestrict_boost_count", int = dto.unrestrictBoostCount)
        put(key = "outgoing_paid_message_star_count", long = dto.outgoingPaidMessageStarCount)
        put(key = "sticker_set_id", long = dto.stickerSetId)
        put(key = "custom_emoji_sticker_set_id", long = dto.customEmojiStickerSetId)
        put(key = "location", value = dto.location) { data -> serialize(dto = data) }
        put(key = "invite_link", value = dto.inviteLink) { data -> serialize(dto = data) }
        put(key = "guard_bot_user_id", long = dto.guardBotUserId)
        put(key = "bot_commands", objects = dto.botCommands) { data -> serialize(dto = data) }
        put(key = "bot_verification", value = dto.botVerification) { data -> serialize(dto = data) }
        put(key = "main_profile_tab", value = dto.mainProfileTab) { data -> serialize(dto = data) }
        put(key = "upgraded_from_basic_group_id", long = dto.upgradedFromBasicGroupId)
        put(key = "upgraded_from_max_message_id", long = dto.upgradedFromMaxMessageId)
    }
}

internal fun serialize(dto: SecretChatStatePending): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "secretChatStatePending")
    }
}

internal fun serialize(dto: SecretChatStateReady): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "secretChatStateReady")
    }
}

internal fun serialize(dto: SecretChatStateClosed): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "secretChatStateClosed")
    }
}

internal fun serialize(dto: SecretChat): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "secretChat")
        put(key = "id", int = dto.id)
        put(key = "user_id", long = dto.userId)
        put(key = "state", value = dto.state) { data -> serialize(dto = data) }
        put(key = "is_outbound", boolean = dto.isOutbound)
        put(key = "key_hash", bytes = dto.keyHash)
        put(key = "layer", int = dto.layer)
    }
}

internal fun serialize(dto: PublicPostSearchLimits): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "publicPostSearchLimits")
        put(key = "daily_free_query_count", int = dto.dailyFreeQueryCount)
        put(key = "remaining_free_query_count", int = dto.remainingFreeQueryCount)
        put(key = "next_free_query_in", int = dto.nextFreeQueryIn)
        put(key = "star_count", long = dto.starCount)
        put(key = "is_current_query_free", boolean = dto.isCurrentQueryFree)
    }
}

internal fun serialize(dto: MessageSenderUser): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageSenderUser")
        put(key = "user_id", long = dto.userId)
    }
}

internal fun serialize(dto: MessageSenderChat): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageSenderChat")
        put(key = "chat_id", long = dto.chatId)
    }
}

internal fun serialize(dto: MessageSenders): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageSenders")
        put(key = "total_count", int = dto.totalCount)
        put(key = "senders", objects = dto.senders) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatMessageSender): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatMessageSender")
        put(key = "sender", value = dto.sender) { data -> serialize(dto = data) }
        put(key = "needs_premium", boolean = dto.needsPremium)
    }
}

internal fun serialize(dto: ChatMessageSenders): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatMessageSenders")
        put(key = "senders", objects = dto.senders) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PollVoter): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pollVoter")
        put(key = "voter_id", value = dto.voterId) { data -> serialize(dto = data) }
        put(key = "date", int = dto.date)
    }
}

internal fun serialize(dto: PollVoters): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pollVoters")
        put(key = "total_count", int = dto.totalCount)
        put(key = "voters", objects = dto.voters) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageReadDateRead): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageReadDateRead")
        put(key = "read_date", int = dto.readDate)
    }
}

internal fun serialize(dto: MessageReadDateUnread): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageReadDateUnread")
    }
}

internal fun serialize(dto: MessageReadDateTooOld): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageReadDateTooOld")
    }
}

internal fun serialize(dto: MessageReadDateUserPrivacyRestricted): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageReadDateUserPrivacyRestricted")
    }
}

internal fun serialize(dto: MessageReadDateMyPrivacyRestricted): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageReadDateMyPrivacyRestricted")
    }
}

internal fun serialize(dto: MessageViewer): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageViewer")
        put(key = "user_id", long = dto.userId)
        put(key = "view_date", int = dto.viewDate)
    }
}

internal fun serialize(dto: MessageViewers): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageViewers")
        put(key = "viewers", objects = dto.viewers) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageOriginUser): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageOriginUser")
        put(key = "sender_user_id", long = dto.senderUserId)
    }
}

internal fun serialize(dto: MessageOriginHiddenUser): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageOriginHiddenUser")
        put(key = "sender_name", string = dto.senderName)
    }
}

internal fun serialize(dto: MessageOriginChat): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageOriginChat")
        put(key = "sender_chat_id", long = dto.senderChatId)
        put(key = "author_signature", string = dto.authorSignature)
    }
}

internal fun serialize(dto: MessageOriginChannel): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageOriginChannel")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_id", long = dto.messageId)
        put(key = "author_signature", string = dto.authorSignature)
    }
}

internal fun serialize(dto: ForwardSource): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "forwardSource")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_id", long = dto.messageId)
        put(key = "sender_id", value = dto.senderId) { data -> serialize(dto = data) }
        put(key = "sender_name", string = dto.senderName)
        put(key = "date", int = dto.date)
        put(key = "is_outgoing", boolean = dto.isOutgoing)
    }
}

internal fun serialize(dto: ReactionTypeEmoji): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reactionTypeEmoji")
        put(key = "emoji", string = dto.emoji)
    }
}

internal fun serialize(dto: ReactionTypeCustomEmoji): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reactionTypeCustomEmoji")
        put(key = "custom_emoji_id", long = dto.customEmojiId)
    }
}

internal fun serialize(dto: ReactionTypePaid): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reactionTypePaid")
    }
}

internal fun serialize(dto: PaidReactionTypeRegular): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "paidReactionTypeRegular")
    }
}

internal fun serialize(dto: PaidReactionTypeAnonymous): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "paidReactionTypeAnonymous")
    }
}

internal fun serialize(dto: PaidReactionTypeChat): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "paidReactionTypeChat")
        put(key = "chat_id", long = dto.chatId)
    }
}

internal fun serialize(dto: PaidReactor): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "paidReactor")
        put(key = "sender_id", value = dto.senderId) { data -> serialize(dto = data) }
        put(key = "star_count", long = dto.starCount)
        put(key = "is_top", boolean = dto.isTop)
        put(key = "is_me", boolean = dto.isMe)
        put(key = "is_anonymous", boolean = dto.isAnonymous)
    }
}

internal fun serialize(dto: LiveStoryDonors): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "liveStoryDonors")
        put(key = "total_star_count", long = dto.totalStarCount)
        put(key = "top_donors", objects = dto.topDonors) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageForwardInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageForwardInfo")
        put(key = "origin", value = dto.origin) { data -> serialize(dto = data) }
        put(key = "date", int = dto.date)
        put(key = "source", value = dto.source) { data -> serialize(dto = data) }
        put(key = "public_service_announcement_type", string = dto.publicServiceAnnouncementType)
    }
}

internal fun serialize(dto: MessageImportInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageImportInfo")
        put(key = "sender_name", string = dto.senderName)
        put(key = "date", int = dto.date)
    }
}

internal fun serialize(dto: MessageReplyInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageReplyInfo")
        put(key = "reply_count", int = dto.replyCount)
        put(key = "recent_replier_ids", objects = dto.recentReplierIds) { data -> serialize(dto = data) }
        put(key = "last_read_inbox_message_id", long = dto.lastReadInboxMessageId)
        put(key = "last_read_outbox_message_id", long = dto.lastReadOutboxMessageId)
        put(key = "last_message_id", long = dto.lastMessageId)
    }
}

internal fun serialize(dto: MessageReaction): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageReaction")
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
        put(key = "total_count", int = dto.totalCount)
        put(key = "is_chosen", boolean = dto.isChosen)
        put(key = "used_sender_id", value = dto.usedSenderId) { data -> serialize(dto = data) }
        put(key = "recent_sender_ids", objects = dto.recentSenderIds) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageReactions): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageReactions")
        put(key = "reactions", objects = dto.reactions) { data -> serialize(dto = data) }
        put(key = "are_tags", boolean = dto.areTags)
        put(key = "paid_reactors", objects = dto.paidReactors) { data -> serialize(dto = data) }
        put(key = "can_get_added_reactions", boolean = dto.canGetAddedReactions)
    }
}

internal fun serialize(dto: MessageInteractionInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageInteractionInfo")
        put(key = "view_count", int = dto.viewCount)
        put(key = "forward_count", int = dto.forwardCount)
        put(key = "reply_info", value = dto.replyInfo) { data -> serialize(dto = data) }
        put(key = "reactions", value = dto.reactions) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UnreadReaction): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "unreadReaction")
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
        put(key = "sender_id", value = dto.senderId) { data -> serialize(dto = data) }
        put(key = "is_big", boolean = dto.isBig)
    }
}

internal fun serialize(dto: MessageTopicThread): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageTopicThread")
        put(key = "message_thread_id", long = dto.messageThreadId)
    }
}

internal fun serialize(dto: MessageTopicForum): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageTopicForum")
        put(key = "forum_topic_id", int = dto.forumTopicId)
    }
}

internal fun serialize(dto: MessageTopicDirectMessages): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageTopicDirectMessages")
        put(key = "direct_messages_chat_topic_id", long = dto.directMessagesChatTopicId)
    }
}

internal fun serialize(dto: MessageTopicSavedMessages): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageTopicSavedMessages")
        put(key = "saved_messages_topic_id", long = dto.savedMessagesTopicId)
    }
}

internal fun serialize(dto: MessageEffectTypeEmojiReaction): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageEffectTypeEmojiReaction")
        put(key = "select_animation", value = dto.selectAnimation) { data -> serialize(dto = data) }
        put(key = "effect_animation", value = dto.effectAnimation) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageEffectTypePremiumSticker): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageEffectTypePremiumSticker")
        put(key = "sticker", value = dto.sticker) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageEffect): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageEffect")
        put(key = "id", long = dto.id)
        put(key = "static_icon", value = dto.staticIcon) { data -> serialize(dto = data) }
        put(key = "emoji", string = dto.emoji)
        put(key = "is_premium", boolean = dto.isPremium)
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageSendingStatePending): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageSendingStatePending")
        put(key = "sending_id", int = dto.sendingId)
    }
}

internal fun serialize(dto: MessageSendingStateFailed): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageSendingStateFailed")
        put(key = "error", value = dto.error) { data -> serialize(dto = data) }
        put(key = "can_retry", boolean = dto.canRetry)
        put(key = "need_another_sender", boolean = dto.needAnotherSender)
        put(key = "need_another_reply_quote", boolean = dto.needAnotherReplyQuote)
        put(key = "need_drop_reply", boolean = dto.needDropReply)
        put(key = "required_paid_message_star_count", long = dto.requiredPaidMessageStarCount)
        put(key = "retry_after", double = dto.retryAfter)
    }
}

internal fun serialize(dto: TextQuote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "textQuote")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "position", int = dto.position)
        put(key = "is_manual", boolean = dto.isManual)
    }
}

internal fun serialize(dto: InputTextQuote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputTextQuote")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "position", int = dto.position)
    }
}

internal fun serialize(dto: MessageReplyToMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageReplyToMessage")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_id", long = dto.messageId)
        put(key = "quote", value = dto.quote) { data -> serialize(dto = data) }
        put(key = "checklist_task_id", int = dto.checklistTaskId)
        put(key = "poll_option_id", string = dto.pollOptionId)
        put(key = "origin", value = dto.origin) { data -> serialize(dto = data) }
        put(key = "origin_send_date", int = dto.originSendDate)
        put(key = "content", value = dto.content) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageReplyToStory): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageReplyToStory")
        put(key = "story_poster_chat_id", long = dto.storyPosterChatId)
        put(key = "story_id", int = dto.storyId)
    }
}

internal fun serialize(dto: InputMessageReplyToMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputMessageReplyToMessage")
        put(key = "message_id", long = dto.messageId)
        put(key = "quote", value = dto.quote) { data -> serialize(dto = data) }
        put(key = "checklist_task_id", int = dto.checklistTaskId)
        put(key = "poll_option_id", string = dto.pollOptionId)
    }
}

internal fun serialize(dto: InputMessageReplyToExternalMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputMessageReplyToExternalMessage")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_id", long = dto.messageId)
        put(key = "quote", value = dto.quote) { data -> serialize(dto = data) }
        put(key = "checklist_task_id", int = dto.checklistTaskId)
        put(key = "poll_option_id", string = dto.pollOptionId)
    }
}

internal fun serialize(dto: InputMessageReplyToStory): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputMessageReplyToStory")
        put(key = "story_poster_chat_id", long = dto.storyPosterChatId)
        put(key = "story_id", int = dto.storyId)
    }
}

internal fun serialize(dto: InputMessageReplyToEphemeralMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputMessageReplyToEphemeralMessage")
        put(key = "ephemeral_message_id", int = dto.ephemeralMessageId)
    }
}

internal fun serialize(dto: FactCheck): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "factCheck")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "country_code", string = dto.countryCode)
    }
}

internal fun serialize(dto: Message): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "message")
        put(key = "id", long = dto.id)
        put(key = "sender_id", value = dto.senderId) { data -> serialize(dto = data) }
        put(key = "receiver_id", value = dto.receiverId) { data -> serialize(dto = data) }
        put(key = "chat_id", long = dto.chatId)
        put(key = "sending_state", value = dto.sendingState) { data -> serialize(dto = data) }
        put(key = "scheduling_state", value = dto.schedulingState) { data -> serialize(dto = data) }
        put(key = "is_outgoing", boolean = dto.isOutgoing)
        put(key = "is_pinned", boolean = dto.isPinned)
        put(key = "is_from_offline", boolean = dto.isFromOffline)
        put(key = "can_be_saved", boolean = dto.canBeSaved)
        put(key = "has_timestamped_media", boolean = dto.hasTimestampedMedia)
        put(key = "is_channel_post", boolean = dto.isChannelPost)
        put(key = "is_paid_star_suggested_post", boolean = dto.isPaidStarSuggestedPost)
        put(key = "is_paid_gram_suggested_post", boolean = dto.isPaidGramSuggestedPost)
        put(key = "contains_unread_mention", boolean = dto.containsUnreadMention)
        put(key = "contains_unread_poll_votes", boolean = dto.containsUnreadPollVotes)
        put(key = "date", int = dto.date)
        put(key = "edit_date", int = dto.editDate)
        put(key = "forward_info", value = dto.forwardInfo) { data -> serialize(dto = data) }
        put(key = "import_info", value = dto.importInfo) { data -> serialize(dto = data) }
        put(key = "interaction_info", value = dto.interactionInfo) { data -> serialize(dto = data) }
        put(key = "unread_reactions", objects = dto.unreadReactions) { data -> serialize(dto = data) }
        put(key = "fact_check", value = dto.factCheck) { data -> serialize(dto = data) }
        put(key = "suggested_post_info", value = dto.suggestedPostInfo) { data -> serialize(dto = data) }
        put(key = "reply_to", value = dto.replyTo) { data -> serialize(dto = data) }
        put(key = "topic_id", value = dto.topicId) { data -> serialize(dto = data) }
        put(key = "self_destruct_type", value = dto.selfDestructType) { data -> serialize(dto = data) }
        put(key = "self_destruct_in", double = dto.selfDestructIn)
        put(key = "auto_delete_in", double = dto.autoDeleteIn)
        put(key = "via_bot_user_id", long = dto.viaBotUserId)
        put(key = "guest_bot_caller_id", value = dto.guestBotCallerId) { data -> serialize(dto = data) }
        put(key = "sender_business_bot_user_id", long = dto.senderBusinessBotUserId)
        put(key = "sender_boost_count", int = dto.senderBoostCount)
        put(key = "sender_tag", string = dto.senderTag)
        put(key = "paid_message_star_count", long = dto.paidMessageStarCount)
        put(key = "author_signature", string = dto.authorSignature)
        put(key = "media_album_id", long = dto.mediaAlbumId)
        put(key = "effect_id", long = dto.effectId)
        put(key = "restriction_info", value = dto.restrictionInfo) { data -> serialize(dto = data) }
        put(key = "summary_language_code", string = dto.summaryLanguageCode)
        put(key = "content", value = dto.content) { data -> serialize(dto = data) }
        put(key = "reply_markup", value = dto.replyMarkup) { data -> serialize(dto = data) }
        put(key = "ephemeral_message_id", int = dto.ephemeralMessageId)
    }
}

internal fun serialize(dto: Messages): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messages")
        put(key = "total_count", int = dto.totalCount)
        putNullable(key = "messages", objects = dto.messages) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: FoundMessages): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "foundMessages")
        put(key = "total_count", int = dto.totalCount)
        put(key = "messages", objects = dto.messages) { data -> serialize(dto = data) }
        put(key = "next_offset", string = dto.nextOffset)
    }
}

internal fun serialize(dto: FoundChatMessages): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "foundChatMessages")
        put(key = "total_count", int = dto.totalCount)
        put(key = "messages", objects = dto.messages) { data -> serialize(dto = data) }
        put(key = "next_from_message_id", long = dto.nextFromMessageId)
    }
}

internal fun serialize(dto: FoundPublicPosts): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "foundPublicPosts")
        put(key = "messages", objects = dto.messages) { data -> serialize(dto = data) }
        put(key = "next_offset", string = dto.nextOffset)
        put(key = "search_limits", value = dto.searchLimits) { data -> serialize(dto = data) }
        put(key = "are_limits_exceeded", boolean = dto.areLimitsExceeded)
    }
}

internal fun serialize(dto: MessagePosition): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messagePosition")
        put(key = "position", int = dto.position)
        put(key = "message_id", long = dto.messageId)
        put(key = "date", int = dto.date)
    }
}

internal fun serialize(dto: MessagePositions): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messagePositions")
        put(key = "total_count", int = dto.totalCount)
        put(key = "positions", objects = dto.positions) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageCalendarDay): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageCalendarDay")
        put(key = "total_count", int = dto.totalCount)
        put(key = "message", value = dto.message) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageCalendar): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageCalendar")
        put(key = "total_count", int = dto.totalCount)
        put(key = "days", objects = dto.days) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: BusinessMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessMessage")
        put(key = "message", value = dto.message) { data -> serialize(dto = data) }
        put(key = "reply_to_message", value = dto.replyToMessage) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: BusinessMessages): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessMessages")
        put(key = "messages", objects = dto.messages) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageSourceChatHistory): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageSourceChatHistory")
    }
}

internal fun serialize(dto: MessageSourceMessageThreadHistory): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageSourceMessageThreadHistory")
    }
}

internal fun serialize(dto: MessageSourceForumTopicHistory): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageSourceForumTopicHistory")
    }
}

internal fun serialize(dto: MessageSourceDirectMessagesChatTopicHistory): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageSourceDirectMessagesChatTopicHistory")
    }
}

internal fun serialize(dto: MessageSourceHistoryPreview): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageSourceHistoryPreview")
    }
}

internal fun serialize(dto: MessageSourceChatList): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageSourceChatList")
    }
}

internal fun serialize(dto: MessageSourceSearch): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageSourceSearch")
    }
}

internal fun serialize(dto: MessageSourceChatEventLog): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageSourceChatEventLog")
    }
}

internal fun serialize(dto: MessageSourceNotification): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageSourceNotification")
    }
}

internal fun serialize(dto: MessageSourceScreenshot): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageSourceScreenshot")
    }
}

internal fun serialize(dto: MessageSourceOther): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageSourceOther")
    }
}

internal fun serialize(dto: AdvertisementSponsor): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "advertisementSponsor")
        put(key = "url", string = dto.url)
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
        put(key = "info", string = dto.info)
    }
}

internal fun serialize(dto: SponsoredMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "sponsoredMessage")
        put(key = "message_id", long = dto.messageId)
        put(key = "is_recommended", boolean = dto.isRecommended)
        put(key = "can_be_reported", boolean = dto.canBeReported)
        put(key = "content", value = dto.content) { data -> serialize(dto = data) }
        put(key = "sponsor", value = dto.sponsor) { data -> serialize(dto = data) }
        put(key = "title", string = dto.title)
        put(key = "button_text", string = dto.buttonText)
        put(key = "accent_color_id", int = dto.accentColorId)
        put(key = "background_custom_emoji_id", long = dto.backgroundCustomEmojiId)
        put(key = "additional_info", string = dto.additionalInfo)
    }
}

internal fun serialize(dto: SponsoredMessages): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "sponsoredMessages")
        put(key = "messages", objects = dto.messages) { data -> serialize(dto = data) }
        put(key = "messages_between", int = dto.messagesBetween)
    }
}

internal fun serialize(dto: SponsoredChat): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "sponsoredChat")
        put(key = "unique_id", long = dto.uniqueId)
        put(key = "chat_id", long = dto.chatId)
        put(key = "sponsor_info", string = dto.sponsorInfo)
        put(key = "additional_info", string = dto.additionalInfo)
    }
}

internal fun serialize(dto: SponsoredChats): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "sponsoredChats")
        put(key = "chats", objects = dto.chats) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: VideoMessageAdvertisement): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "videoMessageAdvertisement")
        put(key = "unique_id", long = dto.uniqueId)
        put(key = "text", string = dto.text)
        put(key = "min_display_duration", int = dto.minDisplayDuration)
        put(key = "max_display_duration", int = dto.maxDisplayDuration)
        put(key = "can_be_reported", boolean = dto.canBeReported)
        put(key = "sponsor", value = dto.sponsor) { data -> serialize(dto = data) }
        put(key = "title", string = dto.title)
        put(key = "additional_info", string = dto.additionalInfo)
    }
}

internal fun serialize(dto: VideoMessageAdvertisements): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "videoMessageAdvertisements")
        put(key = "advertisements", objects = dto.advertisements) { data -> serialize(dto = data) }
        put(key = "start_delay", int = dto.startDelay)
        put(key = "between_delay", int = dto.betweenDelay)
    }
}

internal fun serialize(dto: ReportOption): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reportOption")
        put(key = "id", bytes = dto.id)
        put(key = "text", string = dto.text)
    }
}

internal fun serialize(dto: ReportSponsoredResultOk): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reportSponsoredResultOk")
    }
}

internal fun serialize(dto: ReportSponsoredResultFailed): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reportSponsoredResultFailed")
    }
}

internal fun serialize(dto: ReportSponsoredResultOptionRequired): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reportSponsoredResultOptionRequired")
        put(key = "title", string = dto.title)
        put(key = "options", objects = dto.options) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ReportSponsoredResultAdsHidden): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reportSponsoredResultAdsHidden")
    }
}

internal fun serialize(dto: ReportSponsoredResultPremiumRequired): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reportSponsoredResultPremiumRequired")
    }
}

internal fun serialize(dto: FileDownload): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "fileDownload")
        put(key = "file_id", int = dto.fileId)
        put(key = "message", value = dto.message) { data -> serialize(dto = data) }
        put(key = "add_date", int = dto.addDate)
        put(key = "complete_date", int = dto.completeDate)
        put(key = "is_paused", boolean = dto.isPaused)
    }
}

internal fun serialize(dto: DownloadedFileCounts): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "downloadedFileCounts")
        put(key = "active_count", int = dto.activeCount)
        put(key = "paused_count", int = dto.pausedCount)
        put(key = "completed_count", int = dto.completedCount)
    }
}

internal fun serialize(dto: FoundFileDownloads): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "foundFileDownloads")
        put(key = "total_counts", value = dto.totalCounts) { data -> serialize(dto = data) }
        put(key = "files", objects = dto.files) { data -> serialize(dto = data) }
        put(key = "next_offset", string = dto.nextOffset)
    }
}

internal fun serialize(dto: NotificationSettingsScopePrivateChats): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "notificationSettingsScopePrivateChats")
    }
}

internal fun serialize(dto: NotificationSettingsScopeGroupChats): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "notificationSettingsScopeGroupChats")
    }
}

internal fun serialize(dto: NotificationSettingsScopeChannelChats): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "notificationSettingsScopeChannelChats")
    }
}

internal fun serialize(dto: ChatNotificationSettings): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatNotificationSettings")
        put(key = "use_default_mute_for", boolean = dto.useDefaultMuteFor)
        put(key = "mute_for", int = dto.muteFor)
        put(key = "use_default_sound", boolean = dto.useDefaultSound)
        put(key = "sound_id", long = dto.soundId)
        put(key = "use_default_show_preview", boolean = dto.useDefaultShowPreview)
        put(key = "show_preview", boolean = dto.showPreview)
        put(key = "use_default_mute_stories", boolean = dto.useDefaultMuteStories)
        put(key = "mute_stories", boolean = dto.muteStories)
        put(key = "use_default_story_sound", boolean = dto.useDefaultStorySound)
        put(key = "story_sound_id", long = dto.storySoundId)
        put(key = "use_default_show_story_poster", boolean = dto.useDefaultShowStoryPoster)
        put(key = "show_story_poster", boolean = dto.showStoryPoster)
        put(key = "use_default_disable_pinned_message_notifications", boolean = dto.useDefaultDisablePinnedMessageNotifications)
        put(key = "disable_pinned_message_notifications", boolean = dto.disablePinnedMessageNotifications)
        put(key = "use_default_disable_mention_notifications", boolean = dto.useDefaultDisableMentionNotifications)
        put(key = "disable_mention_notifications", boolean = dto.disableMentionNotifications)
    }
}

internal fun serialize(dto: ScopeNotificationSettings): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "scopeNotificationSettings")
        put(key = "mute_for", int = dto.muteFor)
        put(key = "sound_id", long = dto.soundId)
        put(key = "show_preview", boolean = dto.showPreview)
        put(key = "use_default_mute_stories", boolean = dto.useDefaultMuteStories)
        put(key = "mute_stories", boolean = dto.muteStories)
        put(key = "story_sound_id", long = dto.storySoundId)
        put(key = "show_story_poster", boolean = dto.showStoryPoster)
        put(key = "disable_pinned_message_notifications", boolean = dto.disablePinnedMessageNotifications)
        put(key = "disable_mention_notifications", boolean = dto.disableMentionNotifications)
    }
}

internal fun serialize(dto: ReactionNotificationSourceNone): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reactionNotificationSourceNone")
    }
}

internal fun serialize(dto: ReactionNotificationSourceContacts): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reactionNotificationSourceContacts")
    }
}

internal fun serialize(dto: ReactionNotificationSourceAll): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reactionNotificationSourceAll")
    }
}

internal fun serialize(dto: ReactionNotificationSettings): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reactionNotificationSettings")
        put(key = "message_reaction_source", value = dto.messageReactionSource) { data -> serialize(dto = data) }
        put(key = "story_reaction_source", value = dto.storyReactionSource) { data -> serialize(dto = data) }
        put(key = "poll_vote_source", value = dto.pollVoteSource) { data -> serialize(dto = data) }
        put(key = "sound_id", long = dto.soundId)
        put(key = "show_preview", boolean = dto.showPreview)
    }
}

internal fun serialize(dto: DraftMessageContentText): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "draftMessageContentText")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "link_preview_options", value = dto.linkPreviewOptions) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: DraftMessageContentRichMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "draftMessageContentRichMessage")
        put(key = "message", value = dto.message) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: DraftMessageContentVideoNote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "draftMessageContentVideoNote")
        put(key = "file_path", string = dto.filePath)
        put(key = "duration", int = dto.duration)
        put(key = "length", int = dto.length)
        put(key = "self_destruct_type", value = dto.selfDestructType) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: DraftMessageContentVoiceNote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "draftMessageContentVoiceNote")
        put(key = "file_path", string = dto.filePath)
        put(key = "duration", int = dto.duration)
        put(key = "waveform", bytes = dto.waveform)
        put(key = "self_destruct_type", value = dto.selfDestructType) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: DraftMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "draftMessage")
        put(key = "reply_to", value = dto.replyTo) { data -> serialize(dto = data) }
        put(key = "date", int = dto.date)
        put(key = "content", value = dto.content) { data -> serialize(dto = data) }
        put(key = "effect_id", long = dto.effectId)
        put(key = "suggested_post_info", value = dto.suggestedPostInfo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatTypePrivate): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatTypePrivate")
        put(key = "user_id", long = dto.userId)
    }
}

internal fun serialize(dto: ChatTypeBasicGroup): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatTypeBasicGroup")
        put(key = "basic_group_id", long = dto.basicGroupId)
    }
}

internal fun serialize(dto: ChatTypeSupergroup): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatTypeSupergroup")
        put(key = "supergroup_id", long = dto.supergroupId)
        put(key = "is_channel", boolean = dto.isChannel)
    }
}

internal fun serialize(dto: ChatTypeSecret): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatTypeSecret")
        put(key = "secret_chat_id", int = dto.secretChatId)
        put(key = "user_id", long = dto.userId)
    }
}

internal fun serialize(dto: ChatFolderIcon): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatFolderIcon")
        put(key = "name", string = dto.name)
    }
}

internal fun serialize(dto: ChatFolderName): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatFolderName")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "animate_custom_emoji", boolean = dto.animateCustomEmoji)
    }
}

internal fun serialize(dto: ChatFolder): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatFolder")
        put(key = "name", value = dto.name) { data -> serialize(dto = data) }
        put(key = "icon", value = dto.icon) { data -> serialize(dto = data) }
        put(key = "color_id", int = dto.colorId)
        put(key = "is_shareable", boolean = dto.isShareable)
        put(key = "pinned_chat_ids", longs = dto.pinnedChatIds)
        put(key = "included_chat_ids", longs = dto.includedChatIds)
        put(key = "excluded_chat_ids", longs = dto.excludedChatIds)
        put(key = "exclude_muted", boolean = dto.excludeMuted)
        put(key = "exclude_read", boolean = dto.excludeRead)
        put(key = "exclude_archived", boolean = dto.excludeArchived)
        put(key = "include_contacts", boolean = dto.includeContacts)
        put(key = "include_non_contacts", boolean = dto.includeNonContacts)
        put(key = "include_bots", boolean = dto.includeBots)
        put(key = "include_groups", boolean = dto.includeGroups)
        put(key = "include_channels", boolean = dto.includeChannels)
    }
}

internal fun serialize(dto: ChatFolderInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatFolderInfo")
        put(key = "id", int = dto.id)
        put(key = "name", value = dto.name) { data -> serialize(dto = data) }
        put(key = "icon", value = dto.icon) { data -> serialize(dto = data) }
        put(key = "color_id", int = dto.colorId)
        put(key = "is_shareable", boolean = dto.isShareable)
        put(key = "has_my_invite_links", boolean = dto.hasMyInviteLinks)
    }
}

internal fun serialize(dto: ChatFolderInviteLink): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatFolderInviteLink")
        put(key = "invite_link", string = dto.inviteLink)
        put(key = "name", string = dto.name)
        put(key = "chat_ids", longs = dto.chatIds)
    }
}

internal fun serialize(dto: ChatFolderInviteLinks): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatFolderInviteLinks")
        put(key = "invite_links", objects = dto.inviteLinks) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatFolderInviteLinkInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatFolderInviteLinkInfo")
        put(key = "chat_folder_info", value = dto.chatFolderInfo) { data -> serialize(dto = data) }
        put(key = "missing_chat_ids", longs = dto.missingChatIds)
        put(key = "added_chat_ids", longs = dto.addedChatIds)
    }
}

internal fun serialize(dto: RecommendedChatFolder): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "recommendedChatFolder")
        put(key = "folder", value = dto.folder) { data -> serialize(dto = data) }
        put(key = "description", string = dto.description)
    }
}

internal fun serialize(dto: RecommendedChatFolders): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "recommendedChatFolders")
        put(key = "chat_folders", objects = dto.chatFolders) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ArchiveChatListSettings): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "archiveChatListSettings")
        put(key = "archive_and_mute_new_chats_from_unknown_users", boolean = dto.archiveAndMuteNewChatsFromUnknownUsers)
        put(key = "keep_unmuted_chats_archived", boolean = dto.keepUnmutedChatsArchived)
        put(key = "keep_chats_from_folders_archived", boolean = dto.keepChatsFromFoldersArchived)
    }
}

internal fun serialize(dto: ChatListMain): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatListMain")
    }
}

internal fun serialize(dto: ChatListArchive): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatListArchive")
    }
}

internal fun serialize(dto: ChatListFolder): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatListFolder")
        put(key = "chat_folder_id", int = dto.chatFolderId)
    }
}

internal fun serialize(dto: ChatLists): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatLists")
        put(key = "chat_lists", objects = dto.chatLists) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatSourceMtprotoProxy): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatSourceMtprotoProxy")
    }
}

internal fun serialize(dto: ChatSourcePublicServiceAnnouncement): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatSourcePublicServiceAnnouncement")
        put(key = "type", string = dto.type)
        put(key = "text", string = dto.text)
    }
}

internal fun serialize(dto: ChatPosition): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatPosition")
        put(key = "list", value = dto.list) { data -> serialize(dto = data) }
        put(key = "order", long = dto.order)
        put(key = "is_pinned", boolean = dto.isPinned)
        put(key = "source", value = dto.source) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatAvailableReactionsAll): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatAvailableReactionsAll")
        put(key = "max_reaction_count", int = dto.maxReactionCount)
    }
}

internal fun serialize(dto: ChatAvailableReactionsSome): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatAvailableReactionsSome")
        put(key = "reactions", objects = dto.reactions) { data -> serialize(dto = data) }
        put(key = "max_reaction_count", int = dto.maxReactionCount)
    }
}

internal fun serialize(dto: SavedMessagesTag): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "savedMessagesTag")
        put(key = "tag", value = dto.tag) { data -> serialize(dto = data) }
        put(key = "label", string = dto.label)
        put(key = "count", int = dto.count)
    }
}

internal fun serialize(dto: SavedMessagesTags): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "savedMessagesTags")
        put(key = "tags", objects = dto.tags) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: BusinessBotManageBar): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessBotManageBar")
        put(key = "bot_user_id", long = dto.botUserId)
        put(key = "manage_url", string = dto.manageUrl)
        put(key = "is_bot_paused", boolean = dto.isBotPaused)
        put(key = "can_bot_reply", boolean = dto.canBotReply)
    }
}

internal fun serialize(dto: VideoChat): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "videoChat")
        put(key = "group_call_id", int = dto.groupCallId)
        put(key = "has_participants", boolean = dto.hasParticipants)
        put(key = "default_participant_id", value = dto.defaultParticipantId) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: Chat): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chat")
        put(key = "id", long = dto.id)
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
        put(key = "title", string = dto.title)
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
        put(key = "accent_color_id", int = dto.accentColorId)
        put(key = "background_custom_emoji_id", long = dto.backgroundCustomEmojiId)
        put(key = "upgraded_gift_colors", value = dto.upgradedGiftColors) { data -> serialize(dto = data) }
        put(key = "profile_accent_color_id", int = dto.profileAccentColorId)
        put(key = "profile_background_custom_emoji_id", long = dto.profileBackgroundCustomEmojiId)
        put(key = "permissions", value = dto.permissions) { data -> serialize(dto = data) }
        put(key = "last_message", value = dto.lastMessage) { data -> serialize(dto = data) }
        put(key = "positions", objects = dto.positions) { data -> serialize(dto = data) }
        put(key = "chat_lists", objects = dto.chatLists) { data -> serialize(dto = data) }
        put(key = "message_sender_id", value = dto.messageSenderId) { data -> serialize(dto = data) }
        put(key = "block_list", value = dto.blockList) { data -> serialize(dto = data) }
        put(key = "has_protected_content", boolean = dto.hasProtectedContent)
        put(key = "is_translatable", boolean = dto.isTranslatable)
        put(key = "is_marked_as_unread", boolean = dto.isMarkedAsUnread)
        put(key = "view_as_topics", boolean = dto.viewAsTopics)
        put(key = "has_scheduled_messages", boolean = dto.hasScheduledMessages)
        put(key = "can_be_deleted_only_for_self", boolean = dto.canBeDeletedOnlyForSelf)
        put(key = "can_be_deleted_for_all_users", boolean = dto.canBeDeletedForAllUsers)
        put(key = "can_be_reported", boolean = dto.canBeReported)
        put(key = "default_disable_notification", boolean = dto.defaultDisableNotification)
        put(key = "unread_count", int = dto.unreadCount)
        put(key = "last_read_inbox_message_id", long = dto.lastReadInboxMessageId)
        put(key = "last_read_outbox_message_id", long = dto.lastReadOutboxMessageId)
        put(key = "unread_mention_count", int = dto.unreadMentionCount)
        put(key = "unread_reaction_count", int = dto.unreadReactionCount)
        put(key = "unread_poll_vote_count", int = dto.unreadPollVoteCount)
        put(key = "notification_settings", value = dto.notificationSettings) { data -> serialize(dto = data) }
        put(key = "available_reactions", value = dto.availableReactions) { data -> serialize(dto = data) }
        put(key = "message_auto_delete_time", int = dto.messageAutoDeleteTime)
        put(key = "emoji_status", value = dto.emojiStatus) { data -> serialize(dto = data) }
        put(key = "background", value = dto.background) { data -> serialize(dto = data) }
        put(key = "theme", value = dto.theme) { data -> serialize(dto = data) }
        put(key = "action_bar", value = dto.actionBar) { data -> serialize(dto = data) }
        put(key = "business_bot_manage_bar", value = dto.businessBotManageBar) { data -> serialize(dto = data) }
        put(key = "video_chat", value = dto.videoChat) { data -> serialize(dto = data) }
        put(key = "pending_join_requests", value = dto.pendingJoinRequests) { data -> serialize(dto = data) }
        put(key = "reply_markup_message_id", long = dto.replyMarkupMessageId)
        put(key = "draft_message", value = dto.draftMessage) { data -> serialize(dto = data) }
        put(key = "client_data", string = dto.clientData)
    }
}

internal fun serialize(dto: Chats): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chats")
        put(key = "total_count", int = dto.totalCount)
        put(key = "chat_ids", longs = dto.chatIds)
    }
}

internal fun serialize(dto: FailedToAddMember): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "failedToAddMember")
        put(key = "user_id", long = dto.userId)
        put(key = "premium_would_allow_invite", boolean = dto.premiumWouldAllowInvite)
        put(key = "premium_required_to_send_messages", boolean = dto.premiumRequiredToSendMessages)
    }
}

internal fun serialize(dto: FailedToAddMembers): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "failedToAddMembers")
        put(key = "failed_to_add_members", objects = dto.failedToAddMembers) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: CreatedBasicGroupChat): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "createdBasicGroupChat")
        put(key = "chat_id", long = dto.chatId)
        put(key = "failed_to_add_members", value = dto.failedToAddMembers) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PublicChatTypeHasUsername): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "publicChatTypeHasUsername")
    }
}

internal fun serialize(dto: PublicChatTypeIsLocationBased): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "publicChatTypeIsLocationBased")
    }
}

internal fun serialize(dto: AccountInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "accountInfo")
        put(key = "registration_month", int = dto.registrationMonth)
        put(key = "registration_year", int = dto.registrationYear)
        put(key = "phone_number_country_code", string = dto.phoneNumberCountryCode)
        put(key = "last_name_change_date", int = dto.lastNameChangeDate)
        put(key = "last_photo_change_date", int = dto.lastPhotoChangeDate)
    }
}

internal fun serialize(dto: ChatActionBarReportSpam): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatActionBarReportSpam")
        put(key = "can_unarchive", boolean = dto.canUnarchive)
    }
}

internal fun serialize(dto: ChatActionBarInviteMembers): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatActionBarInviteMembers")
    }
}

internal fun serialize(dto: ChatActionBarReportAddBlock): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatActionBarReportAddBlock")
        put(key = "can_unarchive", boolean = dto.canUnarchive)
        put(key = "account_info", value = dto.accountInfo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatActionBarAddContact): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatActionBarAddContact")
    }
}

internal fun serialize(dto: ChatActionBarSharePhoneNumber): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatActionBarSharePhoneNumber")
    }
}

internal fun serialize(dto: ChatActionBarJoinRequest): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatActionBarJoinRequest")
        put(key = "title", string = dto.title)
        put(key = "is_channel", boolean = dto.isChannel)
        put(key = "request_date", int = dto.requestDate)
    }
}

internal fun serialize(dto: ButtonStyleDefault): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "buttonStyleDefault")
    }
}

internal fun serialize(dto: ButtonStylePrimary): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "buttonStylePrimary")
    }
}

internal fun serialize(dto: ButtonStyleDanger): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "buttonStyleDanger")
    }
}

internal fun serialize(dto: ButtonStyleSuccess): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "buttonStyleSuccess")
    }
}

internal fun serialize(dto: KeyboardButtonTypeText): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "keyboardButtonTypeText")
    }
}

internal fun serialize(dto: KeyboardButtonTypeRequestPhoneNumber): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "keyboardButtonTypeRequestPhoneNumber")
    }
}

internal fun serialize(dto: KeyboardButtonTypeRequestLocation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "keyboardButtonTypeRequestLocation")
    }
}

internal fun serialize(dto: KeyboardButtonTypeRequestPoll): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "keyboardButtonTypeRequestPoll")
        put(key = "force_regular", boolean = dto.forceRegular)
        put(key = "force_quiz", boolean = dto.forceQuiz)
    }
}

internal fun serialize(dto: KeyboardButtonTypeRequestUsers): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "keyboardButtonTypeRequestUsers")
        put(key = "id", int = dto.id)
        put(key = "restrict_user_is_bot", boolean = dto.restrictUserIsBot)
        put(key = "user_is_bot", boolean = dto.userIsBot)
        put(key = "restrict_user_is_premium", boolean = dto.restrictUserIsPremium)
        put(key = "user_is_premium", boolean = dto.userIsPremium)
        put(key = "max_quantity", int = dto.maxQuantity)
        put(key = "request_name", boolean = dto.requestName)
        put(key = "request_username", boolean = dto.requestUsername)
        put(key = "request_photo", boolean = dto.requestPhoto)
    }
}

internal fun serialize(dto: KeyboardButtonTypeRequestChat): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "keyboardButtonTypeRequestChat")
        put(key = "id", int = dto.id)
        put(key = "chat_is_channel", boolean = dto.chatIsChannel)
        put(key = "restrict_chat_is_forum", boolean = dto.restrictChatIsForum)
        put(key = "chat_is_forum", boolean = dto.chatIsForum)
        put(key = "restrict_chat_has_username", boolean = dto.restrictChatHasUsername)
        put(key = "chat_has_username", boolean = dto.chatHasUsername)
        put(key = "chat_is_created", boolean = dto.chatIsCreated)
        put(key = "user_administrator_rights", value = dto.userAdministratorRights) { data -> serialize(dto = data) }
        put(key = "bot_administrator_rights", value = dto.botAdministratorRights) { data -> serialize(dto = data) }
        put(key = "bot_is_member", boolean = dto.botIsMember)
        put(key = "request_title", boolean = dto.requestTitle)
        put(key = "request_username", boolean = dto.requestUsername)
        put(key = "request_photo", boolean = dto.requestPhoto)
    }
}

internal fun serialize(dto: KeyboardButtonTypeRequestManagedBot): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "keyboardButtonTypeRequestManagedBot")
        put(key = "id", int = dto.id)
        put(key = "suggested_name", string = dto.suggestedName)
        put(key = "suggested_username", string = dto.suggestedUsername)
    }
}

internal fun serialize(dto: KeyboardButtonTypeWebApp): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "keyboardButtonTypeWebApp")
        put(key = "url", string = dto.url)
    }
}

internal fun serialize(dto: KeyboardButton): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "keyboardButton")
        put(key = "text", string = dto.text)
        put(key = "icon_custom_emoji_id", long = dto.iconCustomEmojiId)
        put(key = "style", value = dto.style) { data -> serialize(dto = data) }
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InlineKeyboardButtonTypeUrl): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inlineKeyboardButtonTypeUrl")
        put(key = "url", string = dto.url)
    }
}

internal fun serialize(dto: InlineKeyboardButtonTypeLoginUrl): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inlineKeyboardButtonTypeLoginUrl")
        put(key = "url", string = dto.url)
        put(key = "id", long = dto.id)
        put(key = "forward_text", string = dto.forwardText)
    }
}

internal fun serialize(dto: InlineKeyboardButtonTypeWebApp): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inlineKeyboardButtonTypeWebApp")
        put(key = "url", string = dto.url)
    }
}

internal fun serialize(dto: InlineKeyboardButtonTypeCallback): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inlineKeyboardButtonTypeCallback")
        put(key = "data", bytes = dto.data)
    }
}

internal fun serialize(dto: InlineKeyboardButtonTypeCallbackWithPassword): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inlineKeyboardButtonTypeCallbackWithPassword")
        put(key = "data", bytes = dto.data)
    }
}

internal fun serialize(dto: InlineKeyboardButtonTypeCallbackGame): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inlineKeyboardButtonTypeCallbackGame")
    }
}

internal fun serialize(dto: InlineKeyboardButtonTypeSwitchInline): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inlineKeyboardButtonTypeSwitchInline")
        put(key = "query", string = dto.query)
        put(key = "target_chat", value = dto.targetChat) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InlineKeyboardButtonTypeBuy): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inlineKeyboardButtonTypeBuy")
    }
}

internal fun serialize(dto: InlineKeyboardButtonTypeUser): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inlineKeyboardButtonTypeUser")
        put(key = "user_id", long = dto.userId)
    }
}

internal fun serialize(dto: InlineKeyboardButtonTypeCopyText): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inlineKeyboardButtonTypeCopyText")
        put(key = "text", string = dto.text)
    }
}

internal fun serialize(dto: KeyboardButtonSourceMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "keyboardButtonSourceMessage")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_id", long = dto.messageId)
    }
}

internal fun serialize(dto: KeyboardButtonSourceWebApp): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "keyboardButtonSourceWebApp")
        put(key = "bot_user_id", long = dto.botUserId)
        put(key = "prepared_button_id", string = dto.preparedButtonId)
    }
}

internal fun serialize(dto: InlineKeyboardButton): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inlineKeyboardButton")
        put(key = "text", string = dto.text)
        put(key = "icon_custom_emoji_id", long = dto.iconCustomEmojiId)
        put(key = "style", value = dto.style) { data -> serialize(dto = data) }
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ReplyMarkupRemoveKeyboard): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "replyMarkupRemoveKeyboard")
        put(key = "is_personal", boolean = dto.isPersonal)
    }
}

internal fun serialize(dto: ReplyMarkupForceReply): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "replyMarkupForceReply")
        put(key = "is_personal", boolean = dto.isPersonal)
        put(key = "input_field_placeholder", string = dto.inputFieldPlaceholder)
    }
}

internal fun serialize(dto: ReplyMarkupShowKeyboard): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "replyMarkupShowKeyboard")
        put(key = "rows", objectArrays = dto.rows) { data -> serialize(dto = data) }
        put(key = "is_persistent", boolean = dto.isPersistent)
        put(key = "resize_keyboard", boolean = dto.resizeKeyboard)
        put(key = "one_time", boolean = dto.oneTime)
        put(key = "is_personal", boolean = dto.isPersonal)
        put(key = "input_field_placeholder", string = dto.inputFieldPlaceholder)
    }
}

internal fun serialize(dto: ReplyMarkupInlineKeyboard): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "replyMarkupInlineKeyboard")
        put(key = "rows", objectArrays = dto.rows) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: LoginUrlInfoOpen): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "loginUrlInfoOpen")
        put(key = "url", string = dto.url)
        put(key = "skip_confirmation", boolean = dto.skipConfirmation)
    }
}

internal fun serialize(dto: LoginUrlInfoRequestConfirmation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "loginUrlInfoRequestConfirmation")
        put(key = "url", string = dto.url)
        put(key = "domain", string = dto.domain)
        put(key = "bot_user_id", long = dto.botUserId)
        put(key = "request_write_access", boolean = dto.requestWriteAccess)
    }
}

internal fun serialize(dto: OauthLinkInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "oauthLinkInfo")
        put(key = "user_id", long = dto.userId)
        put(key = "url", string = dto.url)
        put(key = "domain", string = dto.domain)
        put(key = "from_app", boolean = dto.fromApp)
        put(key = "verified_app_name", string = dto.verifiedAppName)
        put(key = "bot_user_id", long = dto.botUserId)
        put(key = "request_write_access", boolean = dto.requestWriteAccess)
        put(key = "request_phone_number_access", boolean = dto.requestPhoneNumberAccess)
        put(key = "browser", string = dto.browser)
        put(key = "platform", string = dto.platform)
        put(key = "ip_address", string = dto.ipAddress)
        put(key = "location", string = dto.location)
        put(key = "match_code_first", boolean = dto.matchCodeFirst)
        put(key = "match_codes", strings = dto.matchCodes)
    }
}

internal fun serialize(dto: MessageThreadInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageThreadInfo")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_thread_id", long = dto.messageThreadId)
        put(key = "reply_info", value = dto.replyInfo) { data -> serialize(dto = data) }
        put(key = "unread_message_count", int = dto.unreadMessageCount)
        put(key = "messages", objects = dto.messages) { data -> serialize(dto = data) }
        put(key = "draft_message", value = dto.draftMessage) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: SavedMessagesTopicTypeMyNotes): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "savedMessagesTopicTypeMyNotes")
    }
}

internal fun serialize(dto: SavedMessagesTopicTypeAuthorHidden): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "savedMessagesTopicTypeAuthorHidden")
    }
}

internal fun serialize(dto: SavedMessagesTopicTypeSavedFromChat): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "savedMessagesTopicTypeSavedFromChat")
        put(key = "chat_id", long = dto.chatId)
    }
}

internal fun serialize(dto: SavedMessagesTopic): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "savedMessagesTopic")
        put(key = "id", long = dto.id)
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
        put(key = "is_pinned", boolean = dto.isPinned)
        put(key = "order", long = dto.order)
        put(key = "last_message", value = dto.lastMessage) { data -> serialize(dto = data) }
        put(key = "draft_message", value = dto.draftMessage) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: DirectMessagesChatTopic): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "directMessagesChatTopic")
        put(key = "chat_id", long = dto.chatId)
        put(key = "id", long = dto.id)
        put(key = "sender_id", value = dto.senderId) { data -> serialize(dto = data) }
        put(key = "order", long = dto.order)
        put(key = "can_send_unpaid_messages", boolean = dto.canSendUnpaidMessages)
        put(key = "is_marked_as_unread", boolean = dto.isMarkedAsUnread)
        put(key = "unread_count", long = dto.unreadCount)
        put(key = "last_read_inbox_message_id", long = dto.lastReadInboxMessageId)
        put(key = "last_read_outbox_message_id", long = dto.lastReadOutboxMessageId)
        put(key = "unread_reaction_count", long = dto.unreadReactionCount)
        put(key = "last_message", value = dto.lastMessage) { data -> serialize(dto = data) }
        put(key = "draft_message", value = dto.draftMessage) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ForumTopicIcon): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "forumTopicIcon")
        put(key = "color", int = dto.color)
        put(key = "custom_emoji_id", long = dto.customEmojiId)
    }
}

internal fun serialize(dto: ForumTopicInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "forumTopicInfo")
        put(key = "chat_id", long = dto.chatId)
        put(key = "forum_topic_id", int = dto.forumTopicId)
        put(key = "name", string = dto.name)
        put(key = "icon", value = dto.icon) { data -> serialize(dto = data) }
        put(key = "creation_date", int = dto.creationDate)
        put(key = "creator_id", value = dto.creatorId) { data -> serialize(dto = data) }
        put(key = "is_general", boolean = dto.isGeneral)
        put(key = "is_outgoing", boolean = dto.isOutgoing)
        put(key = "is_closed", boolean = dto.isClosed)
        put(key = "is_hidden", boolean = dto.isHidden)
        put(key = "is_name_implicit", boolean = dto.isNameImplicit)
    }
}

internal fun serialize(dto: ForumTopic): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "forumTopic")
        put(key = "info", value = dto.info) { data -> serialize(dto = data) }
        put(key = "last_message", value = dto.lastMessage) { data -> serialize(dto = data) }
        put(key = "order", long = dto.order)
        put(key = "is_pinned", boolean = dto.isPinned)
        put(key = "unread_count", int = dto.unreadCount)
        put(key = "last_read_inbox_message_id", long = dto.lastReadInboxMessageId)
        put(key = "last_read_outbox_message_id", long = dto.lastReadOutboxMessageId)
        put(key = "unread_mention_count", int = dto.unreadMentionCount)
        put(key = "unread_reaction_count", int = dto.unreadReactionCount)
        put(key = "unread_poll_vote_count", int = dto.unreadPollVoteCount)
        put(key = "notification_settings", value = dto.notificationSettings) { data -> serialize(dto = data) }
        put(key = "draft_message", value = dto.draftMessage) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ForumTopics): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "forumTopics")
        put(key = "total_count", int = dto.totalCount)
        put(key = "topics", objects = dto.topics) { data -> serialize(dto = data) }
        put(key = "next_offset_date", int = dto.nextOffsetDate)
        put(key = "next_offset_message_id", long = dto.nextOffsetMessageId)
        put(key = "next_offset_forum_topic_id", int = dto.nextOffsetForumTopicId)
    }
}

internal fun serialize(dto: SharedUser): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "sharedUser")
        put(key = "user_id", long = dto.userId)
        put(key = "first_name", string = dto.firstName)
        put(key = "last_name", string = dto.lastName)
        put(key = "username", string = dto.username)
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: SharedChat): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "sharedChat")
        put(key = "chat_id", long = dto.chatId)
        put(key = "title", string = dto.title)
        put(key = "username", string = dto.username)
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: BuiltInThemeClassic): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "builtInThemeClassic")
    }
}

internal fun serialize(dto: BuiltInThemeDay): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "builtInThemeDay")
    }
}

internal fun serialize(dto: BuiltInThemeNight): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "builtInThemeNight")
    }
}

internal fun serialize(dto: BuiltInThemeTinted): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "builtInThemeTinted")
    }
}

internal fun serialize(dto: BuiltInThemeArctic): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "builtInThemeArctic")
    }
}

internal fun serialize(dto: ThemeSettings): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "themeSettings")
        put(key = "base_theme", value = dto.baseTheme) { data -> serialize(dto = data) }
        put(key = "accent_color", int = dto.accentColor)
        put(key = "background", value = dto.background) { data -> serialize(dto = data) }
        put(key = "outgoing_message_fill", value = dto.outgoingMessageFill) { data -> serialize(dto = data) }
        put(key = "animate_outgoing_message_fill", boolean = dto.animateOutgoingMessageFill)
        put(key = "outgoing_message_accent_color", int = dto.outgoingMessageAccentColor)
    }
}

internal fun serialize(dto: RichTextPlain): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richTextPlain")
        put(key = "text", string = dto.text)
    }
}

internal fun serialize(dto: RichTextBold): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richTextBold")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: RichTextItalic): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richTextItalic")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: RichTextUnderline): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richTextUnderline")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: RichTextStrikethrough): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richTextStrikethrough")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: RichTextSpoiler): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richTextSpoiler")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: RichTextSubscript): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richTextSubscript")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: RichTextSuperscript): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richTextSuperscript")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: RichTextMarked): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richTextMarked")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: RichTextDateTime): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richTextDateTime")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "unix_time", int = dto.unixTime)
        put(key = "formatting_type", value = dto.formattingType) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: RichTextMention): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richTextMention")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "username", string = dto.username)
    }
}

internal fun serialize(dto: RichTextHashtag): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richTextHashtag")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "hashtag", string = dto.hashtag)
    }
}

internal fun serialize(dto: RichTextCashtag): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richTextCashtag")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "cashtag", string = dto.cashtag)
    }
}

internal fun serialize(dto: RichTextBankCardNumber): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richTextBankCardNumber")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "bank_card_number", string = dto.bankCardNumber)
    }
}

internal fun serialize(dto: RichTextBotCommand): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richTextBotCommand")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "bot_command", string = dto.botCommand)
    }
}

internal fun serialize(dto: RichTextFixed): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richTextFixed")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: RichTextMentionName): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richTextMentionName")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "user_id", long = dto.userId)
    }
}

internal fun serialize(dto: RichTextUrl): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richTextUrl")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "url", string = dto.url)
        put(key = "is_cached", boolean = dto.isCached)
    }
}

internal fun serialize(dto: RichTextEmailAddress): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richTextEmailAddress")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "email_address", string = dto.emailAddress)
    }
}

internal fun serialize(dto: RichTextPhoneNumber): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richTextPhoneNumber")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "phone_number", string = dto.phoneNumber)
    }
}

internal fun serialize(dto: RichTextCustomEmoji): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richTextCustomEmoji")
        put(key = "custom_emoji_id", long = dto.customEmojiId)
        put(key = "alternative_text", string = dto.alternativeText)
    }
}

internal fun serialize(dto: RichTextIcon): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richTextIcon")
        put(key = "document", value = dto.document) { data -> serialize(dto = data) }
        put(key = "width", int = dto.width)
        put(key = "height", int = dto.height)
    }
}

internal fun serialize(dto: RichTextMathematicalExpression): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richTextMathematicalExpression")
        put(key = "expression", string = dto.expression)
    }
}

internal fun serialize(dto: RichTextDiff): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richTextDiff")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "old_text", value = dto.oldText) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: RichTextReference): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richTextReference")
        put(key = "name", string = dto.name)
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: RichTextReferenceLink): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richTextReferenceLink")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "reference_name", string = dto.referenceName)
        put(key = "url", string = dto.url)
    }
}

internal fun serialize(dto: RichTextAnchor): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richTextAnchor")
        put(key = "name", string = dto.name)
    }
}

internal fun serialize(dto: RichTextAnchorLink): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richTextAnchorLink")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "anchor_name", string = dto.anchorName)
        put(key = "url", string = dto.url)
    }
}

internal fun serialize(dto: RichTexts): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "richTexts")
        put(key = "texts", objects = dto.texts) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PageBlockCaption): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockCaption")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "credit", value = dto.credit) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PageBlockListItem): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockListItem")
        put(key = "label", string = dto.label)
        put(key = "blocks", objects = dto.blocks) { data -> serialize(dto = data) }
        put(key = "has_checkbox", boolean = dto.hasCheckbox)
        put(key = "is_checked", boolean = dto.isChecked)
        put(key = "value", int = dto.value)
        put(key = "type", string = dto.type)
    }
}

internal fun serialize(dto: InputPageBlockListItem): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPageBlockListItem")
        put(key = "blocks", objects = dto.blocks) { data -> serialize(dto = data) }
        put(key = "has_checkbox", boolean = dto.hasCheckbox)
        put(key = "is_checked", boolean = dto.isChecked)
        put(key = "value", int = dto.value)
        put(key = "type", string = dto.type)
    }
}

internal fun serialize(dto: PageBlockHorizontalAlignmentLeft): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockHorizontalAlignmentLeft")
    }
}

internal fun serialize(dto: PageBlockHorizontalAlignmentCenter): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockHorizontalAlignmentCenter")
    }
}

internal fun serialize(dto: PageBlockHorizontalAlignmentRight): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockHorizontalAlignmentRight")
    }
}

internal fun serialize(dto: PageBlockVerticalAlignmentTop): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockVerticalAlignmentTop")
    }
}

internal fun serialize(dto: PageBlockVerticalAlignmentMiddle): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockVerticalAlignmentMiddle")
    }
}

internal fun serialize(dto: PageBlockVerticalAlignmentBottom): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockVerticalAlignmentBottom")
    }
}

internal fun serialize(dto: PageBlockTableCell): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockTableCell")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "is_header", boolean = dto.isHeader)
        put(key = "colspan", int = dto.colspan)
        put(key = "rowspan", int = dto.rowspan)
        put(key = "align", value = dto.align) { data -> serialize(dto = data) }
        put(key = "valign", value = dto.valign) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PageBlockRelatedArticle): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockRelatedArticle")
        put(key = "url", string = dto.url)
        put(key = "title", string = dto.title)
        put(key = "description", string = dto.description)
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
        put(key = "author", string = dto.author)
        put(key = "publish_date", int = dto.publishDate)
    }
}

internal fun serialize(dto: PageBlockTitle): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockTitle")
        put(key = "title", value = dto.title) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PageBlockSubtitle): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockSubtitle")
        put(key = "subtitle", value = dto.subtitle) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PageBlockAuthorDate): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockAuthorDate")
        put(key = "author", value = dto.author) { data -> serialize(dto = data) }
        put(key = "publish_date", int = dto.publishDate)
    }
}

internal fun serialize(dto: PageBlockHeader): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockHeader")
        put(key = "header", value = dto.header) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PageBlockSubheader): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockSubheader")
        put(key = "subheader", value = dto.subheader) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PageBlockSectionHeading): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockSectionHeading")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "size", int = dto.size)
    }
}

internal fun serialize(dto: PageBlockKicker): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockKicker")
        put(key = "kicker", value = dto.kicker) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PageBlockParagraph): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockParagraph")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PageBlockPreformatted): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockPreformatted")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "language", string = dto.language)
    }
}

internal fun serialize(dto: PageBlockFooter): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockFooter")
        put(key = "footer", value = dto.footer) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PageBlockThinking): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockThinking")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PageBlockDivider): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockDivider")
    }
}

internal fun serialize(dto: PageBlockMathematicalExpression): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockMathematicalExpression")
        put(key = "expression", string = dto.expression)
    }
}

internal fun serialize(dto: PageBlockAnchor): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockAnchor")
        put(key = "name", string = dto.name)
    }
}

internal fun serialize(dto: PageBlockList): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockList")
        put(key = "items", objects = dto.items) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PageBlockBlockQuote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockBlockQuote")
        put(key = "blocks", objects = dto.blocks) { data -> serialize(dto = data) }
        put(key = "credit", value = dto.credit) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PageBlockPullQuote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockPullQuote")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "credit", value = dto.credit) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PageBlockAnimation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockAnimation")
        put(key = "animation", value = dto.animation) { data -> serialize(dto = data) }
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
        put(key = "need_autoplay", boolean = dto.needAutoplay)
        put(key = "has_spoiler", boolean = dto.hasSpoiler)
    }
}

internal fun serialize(dto: PageBlockAudio): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockAudio")
        put(key = "audio", value = dto.audio) { data -> serialize(dto = data) }
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PageBlockPhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockPhoto")
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
        put(key = "url", string = dto.url)
        put(key = "has_spoiler", boolean = dto.hasSpoiler)
    }
}

internal fun serialize(dto: PageBlockVideo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockVideo")
        put(key = "video", value = dto.video) { data -> serialize(dto = data) }
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
        put(key = "need_autoplay", boolean = dto.needAutoplay)
        put(key = "is_looped", boolean = dto.isLooped)
        put(key = "has_spoiler", boolean = dto.hasSpoiler)
    }
}

internal fun serialize(dto: PageBlockVoiceNote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockVoiceNote")
        put(key = "voice_note", value = dto.voiceNote) { data -> serialize(dto = data) }
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PageBlockCover): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockCover")
        put(key = "cover", value = dto.cover) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PageBlockEmbedded): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockEmbedded")
        put(key = "url", string = dto.url)
        put(key = "html", string = dto.html)
        put(key = "poster_photo", value = dto.posterPhoto) { data -> serialize(dto = data) }
        put(key = "width", int = dto.width)
        put(key = "height", int = dto.height)
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
        put(key = "is_full_width", boolean = dto.isFullWidth)
        put(key = "allow_scrolling", boolean = dto.allowScrolling)
    }
}

internal fun serialize(dto: PageBlockEmbeddedPost): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockEmbeddedPost")
        put(key = "url", string = dto.url)
        put(key = "author", string = dto.author)
        put(key = "author_photo", value = dto.authorPhoto) { data -> serialize(dto = data) }
        put(key = "date", int = dto.date)
        put(key = "blocks", objects = dto.blocks) { data -> serialize(dto = data) }
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PageBlockCollage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockCollage")
        put(key = "blocks", objects = dto.blocks) { data -> serialize(dto = data) }
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PageBlockSlideshow): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockSlideshow")
        put(key = "blocks", objects = dto.blocks) { data -> serialize(dto = data) }
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PageBlockChatLink): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockChatLink")
        put(key = "title", string = dto.title)
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
        put(key = "accent_color_id", int = dto.accentColorId)
        put(key = "username", string = dto.username)
    }
}

internal fun serialize(dto: PageBlockTable): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockTable")
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
        put(key = "cells", objectArrays = dto.cells) { data -> serialize(dto = data) }
        put(key = "is_bordered", boolean = dto.isBordered)
        put(key = "is_striped", boolean = dto.isStriped)
    }
}

internal fun serialize(dto: PageBlockDetails): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockDetails")
        put(key = "header", value = dto.header) { data -> serialize(dto = data) }
        put(key = "blocks", objects = dto.blocks) { data -> serialize(dto = data) }
        put(key = "is_open", boolean = dto.isOpen)
    }
}

internal fun serialize(dto: PageBlockRelatedArticles): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockRelatedArticles")
        put(key = "header", value = dto.header) { data -> serialize(dto = data) }
        put(key = "articles", objects = dto.articles) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PageBlockMap): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pageBlockMap")
        put(key = "location", value = dto.location) { data -> serialize(dto = data) }
        put(key = "zoom", int = dto.zoom)
        put(key = "width", int = dto.width)
        put(key = "height", int = dto.height)
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: WebPageInstantView): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "webPageInstantView")
        put(key = "blocks", objects = dto.blocks) { data -> serialize(dto = data) }
        put(key = "view_count", int = dto.viewCount)
        put(key = "version", int = dto.version)
        put(key = "is_rtl", boolean = dto.isRtl)
        put(key = "is_full", boolean = dto.isFull)
        put(key = "feedback_link", value = dto.feedbackLink) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: LinkPreviewAlbumMediaPhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewAlbumMediaPhoto")
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: LinkPreviewAlbumMediaVideo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewAlbumMediaVideo")
        put(key = "video", value = dto.video) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: LinkPreviewTypeAlbum): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeAlbum")
        put(key = "media", objects = dto.media) { data -> serialize(dto = data) }
        put(key = "caption", string = dto.caption)
    }
}

internal fun serialize(dto: LinkPreviewTypeAnimation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeAnimation")
        put(key = "animation", value = dto.animation) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: LinkPreviewTypeApp): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeApp")
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: LinkPreviewTypeArticle): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeArticle")
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: LinkPreviewTypeAudio): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeAudio")
        put(key = "audio", value = dto.audio) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: LinkPreviewTypeBackground): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeBackground")
        put(key = "document", value = dto.document) { data -> serialize(dto = data) }
        put(key = "background_type", value = dto.backgroundType) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: LinkPreviewTypeChannelBoost): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeChannelBoost")
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: LinkPreviewTypeChat): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeChat")
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
        put(key = "creates_join_request", boolean = dto.createsJoinRequest)
    }
}

internal fun serialize(dto: LinkPreviewTypeDirectMessagesChat): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeDirectMessagesChat")
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: LinkPreviewTypeDocument): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeDocument")
        put(key = "document", value = dto.document) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: LinkPreviewTypeEmbeddedAnimationPlayer): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeEmbeddedAnimationPlayer")
        put(key = "url", string = dto.url)
        put(key = "animation", value = dto.animation) { data -> serialize(dto = data) }
        put(key = "thumbnail", value = dto.thumbnail) { data -> serialize(dto = data) }
        put(key = "duration", int = dto.duration)
        put(key = "width", int = dto.width)
        put(key = "height", int = dto.height)
    }
}

internal fun serialize(dto: LinkPreviewTypeEmbeddedAudioPlayer): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeEmbeddedAudioPlayer")
        put(key = "url", string = dto.url)
        put(key = "audio", value = dto.audio) { data -> serialize(dto = data) }
        put(key = "thumbnail", value = dto.thumbnail) { data -> serialize(dto = data) }
        put(key = "duration", int = dto.duration)
        put(key = "width", int = dto.width)
        put(key = "height", int = dto.height)
    }
}

internal fun serialize(dto: LinkPreviewTypeEmbeddedVideoPlayer): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeEmbeddedVideoPlayer")
        put(key = "url", string = dto.url)
        put(key = "video", value = dto.video) { data -> serialize(dto = data) }
        put(key = "thumbnail", value = dto.thumbnail) { data -> serialize(dto = data) }
        put(key = "duration", int = dto.duration)
        put(key = "width", int = dto.width)
        put(key = "height", int = dto.height)
    }
}

internal fun serialize(dto: LinkPreviewTypeExternalAudio): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeExternalAudio")
        put(key = "url", string = dto.url)
        put(key = "mime_type", string = dto.mimeType)
        put(key = "duration", int = dto.duration)
    }
}

internal fun serialize(dto: LinkPreviewTypeExternalVideo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeExternalVideo")
        put(key = "url", string = dto.url)
        put(key = "mime_type", string = dto.mimeType)
        put(key = "width", int = dto.width)
        put(key = "height", int = dto.height)
        put(key = "duration", int = dto.duration)
    }
}

internal fun serialize(dto: LinkPreviewTypeGiftAuction): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeGiftAuction")
        put(key = "gift", value = dto.gift) { data -> serialize(dto = data) }
        put(key = "auction_end_date", int = dto.auctionEndDate)
    }
}

internal fun serialize(dto: LinkPreviewTypeGiftCollection): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeGiftCollection")
        put(key = "icons", objects = dto.icons) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: LinkPreviewTypeGroupCall): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeGroupCall")
    }
}

internal fun serialize(dto: LinkPreviewTypeInvoice): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeInvoice")
    }
}

internal fun serialize(dto: LinkPreviewTypeLiveStory): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeLiveStory")
        put(key = "story_poster_chat_id", long = dto.storyPosterChatId)
        put(key = "story_id", int = dto.storyId)
    }
}

internal fun serialize(dto: LinkPreviewTypeMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeMessage")
    }
}

internal fun serialize(dto: LinkPreviewTypePhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypePhoto")
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: LinkPreviewTypePremiumGiftCode): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypePremiumGiftCode")
    }
}

internal fun serialize(dto: LinkPreviewTypeRequestManagedBot): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeRequestManagedBot")
    }
}

internal fun serialize(dto: LinkPreviewTypeShareableChatFolder): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeShareableChatFolder")
    }
}

internal fun serialize(dto: LinkPreviewTypeSticker): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeSticker")
        put(key = "sticker", value = dto.sticker) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: LinkPreviewTypeStickerSet): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeStickerSet")
        put(key = "stickers", objects = dto.stickers) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: LinkPreviewTypeStory): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeStory")
        put(key = "story_poster_chat_id", long = dto.storyPosterChatId)
        put(key = "story_id", int = dto.storyId)
    }
}

internal fun serialize(dto: LinkPreviewTypeStoryAlbum): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeStoryAlbum")
        put(key = "photo_icon", value = dto.photoIcon) { data -> serialize(dto = data) }
        put(key = "video_icon", value = dto.videoIcon) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: LinkPreviewTypeSupergroupBoost): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeSupergroupBoost")
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: LinkPreviewTypeTextCompositionStyle): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeTextCompositionStyle")
        put(key = "custom_emoji_id", long = dto.customEmojiId)
    }
}

internal fun serialize(dto: LinkPreviewTypeTheme): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeTheme")
        put(key = "documents", objects = dto.documents) { data -> serialize(dto = data) }
        put(key = "settings", value = dto.settings) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: LinkPreviewTypeUnsupported): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeUnsupported")
    }
}

internal fun serialize(dto: LinkPreviewTypeUpgradedGift): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeUpgradedGift")
        put(key = "gift", value = dto.gift) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: LinkPreviewTypeUser): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeUser")
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
        put(key = "is_bot", boolean = dto.isBot)
    }
}

internal fun serialize(dto: LinkPreviewTypeVideo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeVideo")
        put(key = "video", value = dto.video) { data -> serialize(dto = data) }
        put(key = "cover", value = dto.cover) { data -> serialize(dto = data) }
        put(key = "start_timestamp", int = dto.startTimestamp)
    }
}

internal fun serialize(dto: LinkPreviewTypeVideoChat): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeVideoChat")
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
        put(key = "is_live_stream", boolean = dto.isLiveStream)
        put(key = "joins_as_speaker", boolean = dto.joinsAsSpeaker)
    }
}

internal fun serialize(dto: LinkPreviewTypeVideoNote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeVideoNote")
        put(key = "video_note", value = dto.videoNote) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: LinkPreviewTypeVoiceNote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeVoiceNote")
        put(key = "voice_note", value = dto.voiceNote) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: LinkPreviewTypeWebApp): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreviewTypeWebApp")
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: LinkPreview): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "linkPreview")
        put(key = "url", string = dto.url)
        put(key = "display_url", string = dto.displayUrl)
        put(key = "site_name", string = dto.siteName)
        put(key = "title", string = dto.title)
        put(key = "description", value = dto.description) { data -> serialize(dto = data) }
        put(key = "author", string = dto.author)
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
        put(key = "has_large_media", boolean = dto.hasLargeMedia)
        put(key = "show_large_media", boolean = dto.showLargeMedia)
        put(key = "show_media_above_description", boolean = dto.showMediaAboveDescription)
        put(key = "skip_confirmation", boolean = dto.skipConfirmation)
        put(key = "show_above_text", boolean = dto.showAboveText)
        put(key = "instant_view_version", int = dto.instantViewVersion)
    }
}

internal fun serialize(dto: CountryInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "countryInfo")
        put(key = "country_code", string = dto.countryCode)
        put(key = "name", string = dto.name)
        put(key = "english_name", string = dto.englishName)
        put(key = "flag_emoji", string = dto.flagEmoji)
        put(key = "is_hidden", boolean = dto.isHidden)
        put(key = "calling_codes", strings = dto.callingCodes)
    }
}

internal fun serialize(dto: Countries): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "countries")
        put(key = "countries", objects = dto.countries) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PhoneNumberInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "phoneNumberInfo")
        put(key = "country", value = dto.country) { data -> serialize(dto = data) }
        put(key = "country_calling_code", string = dto.countryCallingCode)
        put(key = "formatted_phone_number", string = dto.formattedPhoneNumber)
        put(key = "is_anonymous", boolean = dto.isAnonymous)
    }
}

internal fun serialize(dto: CollectibleItemTypeUsername): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "collectibleItemTypeUsername")
        put(key = "username", string = dto.username)
    }
}

internal fun serialize(dto: CollectibleItemTypePhoneNumber): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "collectibleItemTypePhoneNumber")
        put(key = "phone_number", string = dto.phoneNumber)
    }
}

internal fun serialize(dto: CollectibleItemInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "collectibleItemInfo")
        put(key = "purchase_date", int = dto.purchaseDate)
        put(key = "currency", string = dto.currency)
        put(key = "amount", long = dto.amount)
        put(key = "cryptocurrency", string = dto.cryptocurrency)
        put(key = "cryptocurrency_amount", long = dto.cryptocurrencyAmount)
        put(key = "url", string = dto.url)
    }
}

internal fun serialize(dto: BankCardActionOpenUrl): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "bankCardActionOpenUrl")
        put(key = "text", string = dto.text)
        put(key = "url", string = dto.url)
    }
}

internal fun serialize(dto: BankCardInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "bankCardInfo")
        put(key = "title", string = dto.title)
        put(key = "actions", objects = dto.actions) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: Address): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "address")
        put(key = "country_code", string = dto.countryCode)
        put(key = "state", string = dto.state)
        put(key = "city", string = dto.city)
        put(key = "street_line1", string = dto.streetLine1)
        put(key = "street_line2", string = dto.streetLine2)
        put(key = "postal_code", string = dto.postalCode)
    }
}

internal fun serialize(dto: LocationAddress): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "locationAddress")
        put(key = "country_code", string = dto.countryCode)
        put(key = "state", string = dto.state)
        put(key = "city", string = dto.city)
        put(key = "street", string = dto.street)
    }
}

internal fun serialize(dto: LabeledPricePart): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "labeledPricePart")
        put(key = "label", string = dto.label)
        put(key = "amount", long = dto.amount)
    }
}

internal fun serialize(dto: Invoice): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "invoice")
        put(key = "currency", string = dto.currency)
        put(key = "price_parts", objects = dto.priceParts) { data -> serialize(dto = data) }
        put(key = "subscription_period", int = dto.subscriptionPeriod)
        put(key = "max_tip_amount", long = dto.maxTipAmount)
        put(key = "suggested_tip_amounts", longs = dto.suggestedTipAmounts)
        put(key = "recurring_payment_terms_of_service_url", string = dto.recurringPaymentTermsOfServiceUrl)
        put(key = "terms_of_service_url", string = dto.termsOfServiceUrl)
        put(key = "is_test", boolean = dto.isTest)
        put(key = "need_name", boolean = dto.needName)
        put(key = "need_phone_number", boolean = dto.needPhoneNumber)
        put(key = "need_email_address", boolean = dto.needEmailAddress)
        put(key = "need_shipping_address", boolean = dto.needShippingAddress)
        put(key = "send_phone_number_to_provider", boolean = dto.sendPhoneNumberToProvider)
        put(key = "send_email_address_to_provider", boolean = dto.sendEmailAddressToProvider)
        put(key = "is_flexible", boolean = dto.isFlexible)
    }
}

internal fun serialize(dto: OrderInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "orderInfo")
        put(key = "name", string = dto.name)
        put(key = "phone_number", string = dto.phoneNumber)
        put(key = "email_address", string = dto.emailAddress)
        put(key = "shipping_address", value = dto.shippingAddress) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ShippingOption): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "shippingOption")
        put(key = "id", string = dto.id)
        put(key = "title", string = dto.title)
        put(key = "price_parts", objects = dto.priceParts) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: SavedCredentials): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "savedCredentials")
        put(key = "id", string = dto.id)
        put(key = "title", string = dto.title)
    }
}

internal fun serialize(dto: InputCredentialsSaved): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputCredentialsSaved")
        put(key = "saved_credentials_id", string = dto.savedCredentialsId)
    }
}

internal fun serialize(dto: InputCredentialsNew): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputCredentialsNew")
        put(key = "data", string = dto.data)
        put(key = "allow_save", boolean = dto.allowSave)
    }
}

internal fun serialize(dto: InputCredentialsApplePay): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputCredentialsApplePay")
        put(key = "data", string = dto.data)
    }
}

internal fun serialize(dto: InputCredentialsGooglePay): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputCredentialsGooglePay")
        put(key = "data", string = dto.data)
    }
}

internal fun serialize(dto: PaymentProviderSmartGlocal): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "paymentProviderSmartGlocal")
        put(key = "public_token", string = dto.publicToken)
        put(key = "tokenize_url", string = dto.tokenizeUrl)
    }
}

internal fun serialize(dto: PaymentProviderStripe): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "paymentProviderStripe")
        put(key = "publishable_key", string = dto.publishableKey)
        put(key = "need_country", boolean = dto.needCountry)
        put(key = "need_postal_code", boolean = dto.needPostalCode)
        put(key = "need_cardholder_name", boolean = dto.needCardholderName)
    }
}

internal fun serialize(dto: PaymentProviderOther): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "paymentProviderOther")
        put(key = "url", string = dto.url)
    }
}

internal fun serialize(dto: PaymentOption): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "paymentOption")
        put(key = "title", string = dto.title)
        put(key = "url", string = dto.url)
    }
}

internal fun serialize(dto: PaymentFormTypeRegular): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "paymentFormTypeRegular")
        put(key = "invoice", value = dto.invoice) { data -> serialize(dto = data) }
        put(key = "payment_provider_user_id", long = dto.paymentProviderUserId)
        put(key = "payment_provider", value = dto.paymentProvider) { data -> serialize(dto = data) }
        put(key = "additional_payment_options", objects = dto.additionalPaymentOptions) { data -> serialize(dto = data) }
        put(key = "saved_order_info", value = dto.savedOrderInfo) { data -> serialize(dto = data) }
        put(key = "saved_credentials", objects = dto.savedCredentials) { data -> serialize(dto = data) }
        put(key = "can_save_credentials", boolean = dto.canSaveCredentials)
        put(key = "need_password", boolean = dto.needPassword)
    }
}

internal fun serialize(dto: PaymentFormTypeStars): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "paymentFormTypeStars")
        put(key = "star_count", long = dto.starCount)
    }
}

internal fun serialize(dto: PaymentFormTypeStarSubscription): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "paymentFormTypeStarSubscription")
        put(key = "pricing", value = dto.pricing) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PaymentForm): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "paymentForm")
        put(key = "id", long = dto.id)
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
        put(key = "seller_bot_user_id", long = dto.sellerBotUserId)
        put(key = "product_info", value = dto.productInfo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ValidatedOrderInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "validatedOrderInfo")
        put(key = "order_info_id", string = dto.orderInfoId)
        put(key = "shipping_options", objects = dto.shippingOptions) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PaymentResult): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "paymentResult")
        put(key = "success", boolean = dto.success)
        put(key = "verification_url", string = dto.verificationUrl)
    }
}

internal fun serialize(dto: PaymentReceiptTypeRegular): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "paymentReceiptTypeRegular")
        put(key = "payment_provider_user_id", long = dto.paymentProviderUserId)
        put(key = "invoice", value = dto.invoice) { data -> serialize(dto = data) }
        put(key = "order_info", value = dto.orderInfo) { data -> serialize(dto = data) }
        put(key = "shipping_option", value = dto.shippingOption) { data -> serialize(dto = data) }
        put(key = "credentials_title", string = dto.credentialsTitle)
        put(key = "tip_amount", long = dto.tipAmount)
    }
}

internal fun serialize(dto: PaymentReceiptTypeStars): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "paymentReceiptTypeStars")
        put(key = "star_count", long = dto.starCount)
        put(key = "transaction_id", string = dto.transactionId)
    }
}

internal fun serialize(dto: PaymentReceipt): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "paymentReceipt")
        put(key = "product_info", value = dto.productInfo) { data -> serialize(dto = data) }
        put(key = "date", int = dto.date)
        put(key = "seller_bot_user_id", long = dto.sellerBotUserId)
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputInvoiceMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputInvoiceMessage")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_id", long = dto.messageId)
    }
}

internal fun serialize(dto: InputInvoiceName): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputInvoiceName")
        put(key = "name", string = dto.name)
    }
}

internal fun serialize(dto: InputInvoiceTelegram): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputInvoiceTelegram")
        put(key = "purpose", value = dto.purpose) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PaidMediaPreview): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "paidMediaPreview")
        put(key = "width", int = dto.width)
        put(key = "height", int = dto.height)
        put(key = "duration", int = dto.duration)
        put(key = "minithumbnail", value = dto.minithumbnail) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PaidMediaPhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "paidMediaPhoto")
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
        put(key = "video", value = dto.video) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PaidMediaVideo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "paidMediaVideo")
        put(key = "video", value = dto.video) { data -> serialize(dto = data) }
        put(key = "cover", value = dto.cover) { data -> serialize(dto = data) }
        put(key = "start_timestamp", int = dto.startTimestamp)
    }
}

internal fun serialize(dto: PaidMediaUnsupported): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "paidMediaUnsupported")
    }
}

internal fun serialize(dto: GiveawayParameters): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giveawayParameters")
        put(key = "boosted_chat_id", long = dto.boostedChatId)
        put(key = "additional_chat_ids", longs = dto.additionalChatIds)
        put(key = "winners_selection_date", int = dto.winnersSelectionDate)
        put(key = "only_new_members", boolean = dto.onlyNewMembers)
        put(key = "has_public_winners", boolean = dto.hasPublicWinners)
        put(key = "country_codes", strings = dto.countryCodes)
        put(key = "prize_description", string = dto.prizeDescription)
    }
}

internal fun serialize(dto: DatedFile): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "datedFile")
        put(key = "file", value = dto.file) { data -> serialize(dto = data) }
        put(key = "date", int = dto.date)
    }
}

internal fun serialize(dto: PassportElementTypePersonalDetails): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementTypePersonalDetails")
    }
}

internal fun serialize(dto: PassportElementTypePassport): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementTypePassport")
    }
}

internal fun serialize(dto: PassportElementTypeDriverLicense): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementTypeDriverLicense")
    }
}

internal fun serialize(dto: PassportElementTypeIdentityCard): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementTypeIdentityCard")
    }
}

internal fun serialize(dto: PassportElementTypeInternalPassport): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementTypeInternalPassport")
    }
}

internal fun serialize(dto: PassportElementTypeAddress): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementTypeAddress")
    }
}

internal fun serialize(dto: PassportElementTypeUtilityBill): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementTypeUtilityBill")
    }
}

internal fun serialize(dto: PassportElementTypeBankStatement): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementTypeBankStatement")
    }
}

internal fun serialize(dto: PassportElementTypeRentalAgreement): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementTypeRentalAgreement")
    }
}

internal fun serialize(dto: PassportElementTypePassportRegistration): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementTypePassportRegistration")
    }
}

internal fun serialize(dto: PassportElementTypeTemporaryRegistration): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementTypeTemporaryRegistration")
    }
}

internal fun serialize(dto: PassportElementTypePhoneNumber): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementTypePhoneNumber")
    }
}

internal fun serialize(dto: PassportElementTypeEmailAddress): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementTypeEmailAddress")
    }
}

internal fun serialize(dto: Date): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "date")
        put(key = "day", int = dto.day)
        put(key = "month", int = dto.month)
        put(key = "year", int = dto.year)
    }
}

internal fun serialize(dto: PersonalDetails): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "personalDetails")
        put(key = "first_name", string = dto.firstName)
        put(key = "middle_name", string = dto.middleName)
        put(key = "last_name", string = dto.lastName)
        put(key = "native_first_name", string = dto.nativeFirstName)
        put(key = "native_middle_name", string = dto.nativeMiddleName)
        put(key = "native_last_name", string = dto.nativeLastName)
        put(key = "birthdate", value = dto.birthdate) { data -> serialize(dto = data) }
        put(key = "gender", string = dto.gender)
        put(key = "country_code", string = dto.countryCode)
        put(key = "residence_country_code", string = dto.residenceCountryCode)
    }
}

internal fun serialize(dto: IdentityDocument): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "identityDocument")
        put(key = "number", string = dto.number)
        put(key = "expiration_date", value = dto.expirationDate) { data -> serialize(dto = data) }
        put(key = "front_side", value = dto.frontSide) { data -> serialize(dto = data) }
        put(key = "reverse_side", value = dto.reverseSide) { data -> serialize(dto = data) }
        put(key = "selfie", value = dto.selfie) { data -> serialize(dto = data) }
        put(key = "translation", objects = dto.translation) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputIdentityDocument): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputIdentityDocument")
        put(key = "number", string = dto.number)
        put(key = "expiration_date", value = dto.expirationDate) { data -> serialize(dto = data) }
        put(key = "front_side", value = dto.frontSide) { data -> serialize(dto = data) }
        put(key = "reverse_side", value = dto.reverseSide) { data -> serialize(dto = data) }
        put(key = "selfie", value = dto.selfie) { data -> serialize(dto = data) }
        put(key = "translation", objects = dto.translation) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PersonalDocument): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "personalDocument")
        put(key = "files", objects = dto.files) { data -> serialize(dto = data) }
        put(key = "translation", objects = dto.translation) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputPersonalDocument): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPersonalDocument")
        put(key = "files", objects = dto.files) { data -> serialize(dto = data) }
        put(key = "translation", objects = dto.translation) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PassportElementPersonalDetails): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementPersonalDetails")
        put(key = "personal_details", value = dto.personalDetails) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PassportElementPassport): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementPassport")
        put(key = "passport", value = dto.passport) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PassportElementDriverLicense): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementDriverLicense")
        put(key = "driver_license", value = dto.driverLicense) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PassportElementIdentityCard): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementIdentityCard")
        put(key = "identity_card", value = dto.identityCard) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PassportElementInternalPassport): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementInternalPassport")
        put(key = "internal_passport", value = dto.internalPassport) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PassportElementAddress): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementAddress")
        put(key = "address", value = dto.address) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PassportElementUtilityBill): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementUtilityBill")
        put(key = "utility_bill", value = dto.utilityBill) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PassportElementBankStatement): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementBankStatement")
        put(key = "bank_statement", value = dto.bankStatement) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PassportElementRentalAgreement): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementRentalAgreement")
        put(key = "rental_agreement", value = dto.rentalAgreement) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PassportElementPassportRegistration): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementPassportRegistration")
        put(key = "passport_registration", value = dto.passportRegistration) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PassportElementTemporaryRegistration): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementTemporaryRegistration")
        put(key = "temporary_registration", value = dto.temporaryRegistration) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PassportElementPhoneNumber): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementPhoneNumber")
        put(key = "phone_number", string = dto.phoneNumber)
    }
}

internal fun serialize(dto: PassportElementEmailAddress): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementEmailAddress")
        put(key = "email_address", string = dto.emailAddress)
    }
}

internal fun serialize(dto: InputPassportElementPersonalDetails): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPassportElementPersonalDetails")
        put(key = "personal_details", value = dto.personalDetails) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputPassportElementPassport): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPassportElementPassport")
        put(key = "passport", value = dto.passport) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputPassportElementDriverLicense): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPassportElementDriverLicense")
        put(key = "driver_license", value = dto.driverLicense) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputPassportElementIdentityCard): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPassportElementIdentityCard")
        put(key = "identity_card", value = dto.identityCard) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputPassportElementInternalPassport): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPassportElementInternalPassport")
        put(key = "internal_passport", value = dto.internalPassport) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputPassportElementAddress): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPassportElementAddress")
        put(key = "address", value = dto.address) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputPassportElementUtilityBill): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPassportElementUtilityBill")
        put(key = "utility_bill", value = dto.utilityBill) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputPassportElementBankStatement): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPassportElementBankStatement")
        put(key = "bank_statement", value = dto.bankStatement) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputPassportElementRentalAgreement): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPassportElementRentalAgreement")
        put(key = "rental_agreement", value = dto.rentalAgreement) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputPassportElementPassportRegistration): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPassportElementPassportRegistration")
        put(key = "passport_registration", value = dto.passportRegistration) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputPassportElementTemporaryRegistration): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPassportElementTemporaryRegistration")
        put(key = "temporary_registration", value = dto.temporaryRegistration) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputPassportElementPhoneNumber): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPassportElementPhoneNumber")
        put(key = "phone_number", string = dto.phoneNumber)
    }
}

internal fun serialize(dto: InputPassportElementEmailAddress): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPassportElementEmailAddress")
        put(key = "email_address", string = dto.emailAddress)
    }
}

internal fun serialize(dto: PassportElements): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElements")
        put(key = "elements", objects = dto.elements) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PassportElementErrorSourceUnspecified): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementErrorSourceUnspecified")
    }
}

internal fun serialize(dto: PassportElementErrorSourceDataField): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementErrorSourceDataField")
        put(key = "field_name", string = dto.fieldName)
    }
}

internal fun serialize(dto: PassportElementErrorSourceFrontSide): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementErrorSourceFrontSide")
    }
}

internal fun serialize(dto: PassportElementErrorSourceReverseSide): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementErrorSourceReverseSide")
    }
}

internal fun serialize(dto: PassportElementErrorSourceSelfie): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementErrorSourceSelfie")
    }
}

internal fun serialize(dto: PassportElementErrorSourceTranslationFile): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementErrorSourceTranslationFile")
        put(key = "file_index", int = dto.fileIndex)
    }
}

internal fun serialize(dto: PassportElementErrorSourceTranslationFiles): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementErrorSourceTranslationFiles")
    }
}

internal fun serialize(dto: PassportElementErrorSourceFile): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementErrorSourceFile")
        put(key = "file_index", int = dto.fileIndex)
    }
}

internal fun serialize(dto: PassportElementErrorSourceFiles): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementErrorSourceFiles")
    }
}

internal fun serialize(dto: PassportElementError): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementError")
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
        put(key = "message", string = dto.message)
        put(key = "source", value = dto.source) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PassportSuitableElement): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportSuitableElement")
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
        put(key = "is_selfie_required", boolean = dto.isSelfieRequired)
        put(key = "is_translation_required", boolean = dto.isTranslationRequired)
        put(key = "is_native_name_required", boolean = dto.isNativeNameRequired)
    }
}

internal fun serialize(dto: PassportRequiredElement): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportRequiredElement")
        put(key = "suitable_elements", objects = dto.suitableElements) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PassportAuthorizationForm): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportAuthorizationForm")
        put(key = "id", int = dto.id)
        put(key = "required_elements", objects = dto.requiredElements) { data -> serialize(dto = data) }
        put(key = "privacy_policy_url", string = dto.privacyPolicyUrl)
    }
}

internal fun serialize(dto: PassportElementsWithErrors): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "passportElementsWithErrors")
        put(key = "elements", objects = dto.elements) { data -> serialize(dto = data) }
        put(key = "errors", objects = dto.errors) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: EncryptedCredentials): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "encryptedCredentials")
        put(key = "data", bytes = dto.data)
        put(key = "hash", bytes = dto.hash)
        put(key = "secret", bytes = dto.secret)
    }
}

internal fun serialize(dto: EncryptedPassportElement): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "encryptedPassportElement")
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
        put(key = "data", bytes = dto.data)
        put(key = "front_side", value = dto.frontSide) { data -> serialize(dto = data) }
        put(key = "reverse_side", value = dto.reverseSide) { data -> serialize(dto = data) }
        put(key = "selfie", value = dto.selfie) { data -> serialize(dto = data) }
        put(key = "translation", objects = dto.translation) { data -> serialize(dto = data) }
        put(key = "files", objects = dto.files) { data -> serialize(dto = data) }
        put(key = "value", string = dto.value)
        put(key = "hash", string = dto.hash)
    }
}

internal fun serialize(dto: InputPassportElementErrorSourceUnspecified): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPassportElementErrorSourceUnspecified")
        put(key = "element_hash", bytes = dto.elementHash)
    }
}

internal fun serialize(dto: InputPassportElementErrorSourceDataField): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPassportElementErrorSourceDataField")
        put(key = "field_name", string = dto.fieldName)
        put(key = "data_hash", bytes = dto.dataHash)
    }
}

internal fun serialize(dto: InputPassportElementErrorSourceFrontSide): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPassportElementErrorSourceFrontSide")
        put(key = "file_hash", bytes = dto.fileHash)
    }
}

internal fun serialize(dto: InputPassportElementErrorSourceReverseSide): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPassportElementErrorSourceReverseSide")
        put(key = "file_hash", bytes = dto.fileHash)
    }
}

internal fun serialize(dto: InputPassportElementErrorSourceSelfie): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPassportElementErrorSourceSelfie")
        put(key = "file_hash", bytes = dto.fileHash)
    }
}

internal fun serialize(dto: InputPassportElementErrorSourceTranslationFile): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPassportElementErrorSourceTranslationFile")
        put(key = "file_hash", bytes = dto.fileHash)
    }
}

internal fun serialize(dto: InputPassportElementErrorSourceTranslationFiles): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPassportElementErrorSourceTranslationFiles")
        put(key = "file_hashes", bytes = dto.fileHashes)
    }
}

internal fun serialize(dto: InputPassportElementErrorSourceFile): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPassportElementErrorSourceFile")
        put(key = "file_hash", bytes = dto.fileHash)
    }
}

internal fun serialize(dto: InputPassportElementErrorSourceFiles): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPassportElementErrorSourceFiles")
        put(key = "file_hashes", bytes = dto.fileHashes)
    }
}

internal fun serialize(dto: InputPassportElementError): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPassportElementError")
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
        put(key = "message", string = dto.message)
        put(key = "source", value = dto.source) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PollMediaAnimation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pollMediaAnimation")
        put(key = "animation", value = dto.animation) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PollMediaAudio): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pollMediaAudio")
        put(key = "audio", value = dto.audio) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PollMediaDocument): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pollMediaDocument")
        put(key = "document", value = dto.document) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PollMediaLink): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pollMediaLink")
        put(key = "url", string = dto.url)
        put(key = "link_preview", value = dto.linkPreview) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PollMediaLocation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pollMediaLocation")
        put(key = "location", value = dto.location) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PollMediaPhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pollMediaPhoto")
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
        put(key = "video", value = dto.video) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PollMediaSticker): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pollMediaSticker")
        put(key = "sticker", value = dto.sticker) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PollMediaVenue): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pollMediaVenue")
        put(key = "venue", value = dto.venue) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PollMediaVideo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pollMediaVideo")
        put(key = "video", value = dto.video) { data -> serialize(dto = data) }
        put(key = "alternative_videos", objects = dto.alternativeVideos) { data -> serialize(dto = data) }
        put(key = "storyboards", objects = dto.storyboards) { data -> serialize(dto = data) }
        put(key = "cover", value = dto.cover) { data -> serialize(dto = data) }
        put(key = "start_timestamp", int = dto.startTimestamp)
    }
}

internal fun serialize(dto: MessageText): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageText")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "link_preview", value = dto.linkPreview) { data -> serialize(dto = data) }
        put(key = "link_preview_options", value = dto.linkPreviewOptions) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageRichMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageRichMessage")
        put(key = "message", value = dto.message) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageAnimation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageAnimation")
        put(key = "animation", value = dto.animation) { data -> serialize(dto = data) }
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
        put(key = "show_caption_above_media", boolean = dto.showCaptionAboveMedia)
        put(key = "has_spoiler", boolean = dto.hasSpoiler)
        put(key = "is_secret", boolean = dto.isSecret)
    }
}

internal fun serialize(dto: MessageAudio): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageAudio")
        put(key = "audio", value = dto.audio) { data -> serialize(dto = data) }
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageDocument): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageDocument")
        put(key = "document", value = dto.document) { data -> serialize(dto = data) }
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessagePaidMedia): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messagePaidMedia")
        put(key = "star_count", long = dto.starCount)
        put(key = "media", objects = dto.media) { data -> serialize(dto = data) }
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
        put(key = "show_caption_above_media", boolean = dto.showCaptionAboveMedia)
    }
}

internal fun serialize(dto: MessagePhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messagePhoto")
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
        put(key = "video", value = dto.video) { data -> serialize(dto = data) }
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
        put(key = "show_caption_above_media", boolean = dto.showCaptionAboveMedia)
        put(key = "has_spoiler", boolean = dto.hasSpoiler)
        put(key = "is_secret", boolean = dto.isSecret)
    }
}

internal fun serialize(dto: MessageSticker): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageSticker")
        put(key = "sticker", value = dto.sticker) { data -> serialize(dto = data) }
        put(key = "is_premium", boolean = dto.isPremium)
    }
}

internal fun serialize(dto: MessageVideo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageVideo")
        put(key = "video", value = dto.video) { data -> serialize(dto = data) }
        put(key = "alternative_videos", objects = dto.alternativeVideos) { data -> serialize(dto = data) }
        put(key = "storyboards", objects = dto.storyboards) { data -> serialize(dto = data) }
        put(key = "cover", value = dto.cover) { data -> serialize(dto = data) }
        put(key = "start_timestamp", int = dto.startTimestamp)
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
        put(key = "show_caption_above_media", boolean = dto.showCaptionAboveMedia)
        put(key = "has_spoiler", boolean = dto.hasSpoiler)
        put(key = "is_secret", boolean = dto.isSecret)
    }
}

internal fun serialize(dto: MessageVideoNote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageVideoNote")
        put(key = "video_note", value = dto.videoNote) { data -> serialize(dto = data) }
        put(key = "is_viewed", boolean = dto.isViewed)
        put(key = "is_secret", boolean = dto.isSecret)
    }
}

internal fun serialize(dto: MessageVoiceNote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageVoiceNote")
        put(key = "voice_note", value = dto.voiceNote) { data -> serialize(dto = data) }
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
        put(key = "is_listened", boolean = dto.isListened)
    }
}

internal fun serialize(dto: MessageExpiredPhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageExpiredPhoto")
    }
}

internal fun serialize(dto: MessageExpiredVideo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageExpiredVideo")
    }
}

internal fun serialize(dto: MessageExpiredVideoNote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageExpiredVideoNote")
    }
}

internal fun serialize(dto: MessageExpiredVoiceNote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageExpiredVoiceNote")
    }
}

internal fun serialize(dto: MessageLiveLocation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageLiveLocation")
        put(key = "location", value = dto.location) { data -> serialize(dto = data) }
        put(key = "expires_in", int = dto.expiresIn)
    }
}

internal fun serialize(dto: MessageLocation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageLocation")
        put(key = "location", value = dto.location) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageVenue): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageVenue")
        put(key = "venue", value = dto.venue) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageContact): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageContact")
        put(key = "contact", value = dto.contact) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageAnimatedEmoji): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageAnimatedEmoji")
        put(key = "animated_emoji", value = dto.animatedEmoji) { data -> serialize(dto = data) }
        put(key = "emoji", string = dto.emoji)
    }
}

internal fun serialize(dto: MessageDice): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageDice")
        put(key = "initial_state", value = dto.initialState) { data -> serialize(dto = data) }
        put(key = "final_state", value = dto.finalState) { data -> serialize(dto = data) }
        put(key = "emoji", string = dto.emoji)
        put(key = "value", int = dto.value)
        put(key = "success_animation_frame_number", int = dto.successAnimationFrameNumber)
    }
}

internal fun serialize(dto: MessageGame): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageGame")
        put(key = "game", value = dto.game) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessagePoll): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messagePoll")
        put(key = "poll", value = dto.poll) { data -> serialize(dto = data) }
        put(key = "description", value = dto.description) { data -> serialize(dto = data) }
        put(key = "media", value = dto.media) { data -> serialize(dto = data) }
        put(key = "can_add_option", boolean = dto.canAddOption)
    }
}

internal fun serialize(dto: MessageStakeDice): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageStakeDice")
        put(key = "initial_state", value = dto.initialState) { data -> serialize(dto = data) }
        put(key = "final_state", value = dto.finalState) { data -> serialize(dto = data) }
        put(key = "value", int = dto.value)
        put(key = "stake_gram_amount", long = dto.stakeGramAmount)
        put(key = "prize_gram_amount", long = dto.prizeGramAmount)
    }
}

internal fun serialize(dto: MessageStory): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageStory")
        put(key = "story_poster_chat_id", long = dto.storyPosterChatId)
        put(key = "story_id", int = dto.storyId)
        put(key = "via_mention", boolean = dto.viaMention)
    }
}

internal fun serialize(dto: MessageChecklist): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageChecklist")
        put(key = "list", value = dto.list) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageInvoice): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageInvoice")
        put(key = "product_info", value = dto.productInfo) { data -> serialize(dto = data) }
        put(key = "currency", string = dto.currency)
        put(key = "total_amount", long = dto.totalAmount)
        put(key = "start_parameter", string = dto.startParameter)
        put(key = "is_test", boolean = dto.isTest)
        put(key = "need_shipping_address", boolean = dto.needShippingAddress)
        put(key = "receipt_message_id", long = dto.receiptMessageId)
        put(key = "paid_media", value = dto.paidMedia) { data -> serialize(dto = data) }
        put(key = "paid_media_caption", value = dto.paidMediaCaption) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageCall): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageCall")
        put(key = "unique_id", long = dto.uniqueId)
        put(key = "is_video", boolean = dto.isVideo)
        put(key = "discard_reason", value = dto.discardReason) { data -> serialize(dto = data) }
        put(key = "duration", int = dto.duration)
    }
}

internal fun serialize(dto: MessageGroupCall): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageGroupCall")
        put(key = "unique_id", long = dto.uniqueId)
        put(key = "is_active", boolean = dto.isActive)
        put(key = "was_missed", boolean = dto.wasMissed)
        put(key = "is_video", boolean = dto.isVideo)
        put(key = "duration", int = dto.duration)
        put(key = "other_participant_ids", objects = dto.otherParticipantIds) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageVideoChatScheduled): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageVideoChatScheduled")
        put(key = "group_call_id", int = dto.groupCallId)
        put(key = "start_date", int = dto.startDate)
    }
}

internal fun serialize(dto: MessageVideoChatStarted): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageVideoChatStarted")
        put(key = "group_call_id", int = dto.groupCallId)
    }
}

internal fun serialize(dto: MessageVideoChatEnded): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageVideoChatEnded")
        put(key = "duration", int = dto.duration)
    }
}

internal fun serialize(dto: MessageInviteVideoChatParticipants): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageInviteVideoChatParticipants")
        put(key = "group_call_id", int = dto.groupCallId)
        put(key = "user_ids", longs = dto.userIds)
    }
}

internal fun serialize(dto: MessagePollOptionAdded): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messagePollOptionAdded")
        put(key = "poll_message_id", long = dto.pollMessageId)
        put(key = "option_id", string = dto.optionId)
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessagePollOptionDeleted): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messagePollOptionDeleted")
        put(key = "poll_message_id", long = dto.pollMessageId)
        put(key = "option_id", string = dto.optionId)
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageBasicGroupChatCreate): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageBasicGroupChatCreate")
        put(key = "title", string = dto.title)
        put(key = "member_user_ids", longs = dto.memberUserIds)
    }
}

internal fun serialize(dto: MessageSupergroupChatCreate): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageSupergroupChatCreate")
        put(key = "title", string = dto.title)
    }
}

internal fun serialize(dto: MessageChatChangeTitle): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageChatChangeTitle")
        put(key = "title", string = dto.title)
    }
}

internal fun serialize(dto: MessageChatChangePhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageChatChangePhoto")
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageChatDeletePhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageChatDeletePhoto")
    }
}

internal fun serialize(dto: MessageChatOwnerLeft): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageChatOwnerLeft")
        put(key = "new_owner_user_id", long = dto.newOwnerUserId)
    }
}

internal fun serialize(dto: MessageChatOwnerChanged): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageChatOwnerChanged")
        put(key = "new_owner_user_id", long = dto.newOwnerUserId)
    }
}

internal fun serialize(dto: MessageChatHasProtectedContentToggled): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageChatHasProtectedContentToggled")
        put(key = "request_message_id", long = dto.requestMessageId)
        put(key = "old_has_protected_content", boolean = dto.oldHasProtectedContent)
        put(key = "new_has_protected_content", boolean = dto.newHasProtectedContent)
    }
}

internal fun serialize(dto: MessageChatHasProtectedContentDisableRequested): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageChatHasProtectedContentDisableRequested")
        put(key = "is_expired", boolean = dto.isExpired)
    }
}

internal fun serialize(dto: MessageChatAddMembers): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageChatAddMembers")
        put(key = "member_user_ids", longs = dto.memberUserIds)
    }
}

internal fun serialize(dto: MessageChatJoinByLink): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageChatJoinByLink")
    }
}

internal fun serialize(dto: MessageChatJoinByRequest): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageChatJoinByRequest")
    }
}

internal fun serialize(dto: MessageChatDeleteMember): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageChatDeleteMember")
        put(key = "user_id", long = dto.userId)
    }
}

internal fun serialize(dto: MessageChatAddedToCommunity): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageChatAddedToCommunity")
        put(key = "community_id", long = dto.communityId)
    }
}

internal fun serialize(dto: MessageChatRemovedFromCommunity): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageChatRemovedFromCommunity")
    }
}

internal fun serialize(dto: MessageChatUpgradeTo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageChatUpgradeTo")
        put(key = "supergroup_id", long = dto.supergroupId)
    }
}

internal fun serialize(dto: MessageChatUpgradeFrom): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageChatUpgradeFrom")
        put(key = "title", string = dto.title)
        put(key = "basic_group_id", long = dto.basicGroupId)
    }
}

internal fun serialize(dto: MessagePinMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messagePinMessage")
        put(key = "message_id", long = dto.messageId)
    }
}

internal fun serialize(dto: MessageScreenshotTaken): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageScreenshotTaken")
    }
}

internal fun serialize(dto: MessageChatSetBackground): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageChatSetBackground")
        put(key = "old_background_message_id", long = dto.oldBackgroundMessageId)
        put(key = "background", value = dto.background) { data -> serialize(dto = data) }
        put(key = "only_for_self", boolean = dto.onlyForSelf)
    }
}

internal fun serialize(dto: MessageChatSetTheme): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageChatSetTheme")
        put(key = "theme", value = dto.theme) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageChatSetMessageAutoDeleteTime): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageChatSetMessageAutoDeleteTime")
        put(key = "message_auto_delete_time", int = dto.messageAutoDeleteTime)
        put(key = "from_user_id", long = dto.fromUserId)
    }
}

internal fun serialize(dto: MessageChatBoost): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageChatBoost")
        put(key = "boost_count", int = dto.boostCount)
    }
}

internal fun serialize(dto: MessageForumTopicCreated): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageForumTopicCreated")
        put(key = "name", string = dto.name)
        put(key = "is_name_implicit", boolean = dto.isNameImplicit)
        put(key = "icon", value = dto.icon) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageForumTopicEdited): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageForumTopicEdited")
        put(key = "name", string = dto.name)
        put(key = "edit_icon_custom_emoji_id", boolean = dto.editIconCustomEmojiId)
        put(key = "icon_custom_emoji_id", long = dto.iconCustomEmojiId)
    }
}

internal fun serialize(dto: MessageForumTopicIsClosedToggled): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageForumTopicIsClosedToggled")
        put(key = "is_closed", boolean = dto.isClosed)
    }
}

internal fun serialize(dto: MessageForumTopicIsHiddenToggled): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageForumTopicIsHiddenToggled")
        put(key = "is_hidden", boolean = dto.isHidden)
    }
}

internal fun serialize(dto: MessageSuggestProfilePhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageSuggestProfilePhoto")
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageSuggestBirthdate): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageSuggestBirthdate")
        put(key = "birthdate", value = dto.birthdate) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageCustomServiceAction): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageCustomServiceAction")
        put(key = "text", string = dto.text)
    }
}

internal fun serialize(dto: MessageGameScore): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageGameScore")
        put(key = "game_message_id", long = dto.gameMessageId)
        put(key = "game_id", long = dto.gameId)
        put(key = "score", int = dto.score)
    }
}

internal fun serialize(dto: MessageManagedBotCreated): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageManagedBotCreated")
        put(key = "bot_user_id", long = dto.botUserId)
    }
}

internal fun serialize(dto: MessagePaymentSuccessful): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messagePaymentSuccessful")
        put(key = "invoice_chat_id", long = dto.invoiceChatId)
        put(key = "invoice_message_id", long = dto.invoiceMessageId)
        put(key = "currency", string = dto.currency)
        put(key = "total_amount", long = dto.totalAmount)
        put(key = "subscription_until_date", int = dto.subscriptionUntilDate)
        put(key = "is_recurring", boolean = dto.isRecurring)
        put(key = "is_first_recurring", boolean = dto.isFirstRecurring)
        put(key = "invoice_name", string = dto.invoiceName)
    }
}

internal fun serialize(dto: MessagePaymentSuccessfulBot): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messagePaymentSuccessfulBot")
        put(key = "currency", string = dto.currency)
        put(key = "total_amount", long = dto.totalAmount)
        put(key = "subscription_until_date", int = dto.subscriptionUntilDate)
        put(key = "is_recurring", boolean = dto.isRecurring)
        put(key = "is_first_recurring", boolean = dto.isFirstRecurring)
        put(key = "invoice_payload", bytes = dto.invoicePayload)
        put(key = "shipping_option_id", string = dto.shippingOptionId)
        put(key = "order_info", value = dto.orderInfo) { data -> serialize(dto = data) }
        put(key = "telegram_payment_charge_id", string = dto.telegramPaymentChargeId)
        put(key = "provider_payment_charge_id", string = dto.providerPaymentChargeId)
    }
}

internal fun serialize(dto: MessagePaymentRefunded): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messagePaymentRefunded")
        put(key = "owner_id", value = dto.ownerId) { data -> serialize(dto = data) }
        put(key = "currency", string = dto.currency)
        put(key = "total_amount", long = dto.totalAmount)
        put(key = "invoice_payload", bytes = dto.invoicePayload)
        put(key = "telegram_payment_charge_id", string = dto.telegramPaymentChargeId)
        put(key = "provider_payment_charge_id", string = dto.providerPaymentChargeId)
    }
}

internal fun serialize(dto: MessageGiftedPremium): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageGiftedPremium")
        put(key = "gifter_user_id", long = dto.gifterUserId)
        put(key = "receiver_user_id", long = dto.receiverUserId)
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "currency", string = dto.currency)
        put(key = "amount", long = dto.amount)
        put(key = "cryptocurrency", string = dto.cryptocurrency)
        put(key = "cryptocurrency_amount", long = dto.cryptocurrencyAmount)
        put(key = "month_count", int = dto.monthCount)
        put(key = "day_count", int = dto.dayCount)
        put(key = "sticker", value = dto.sticker) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessagePremiumGiftCode): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messagePremiumGiftCode")
        put(key = "creator_id", value = dto.creatorId) { data -> serialize(dto = data) }
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "is_from_giveaway", boolean = dto.isFromGiveaway)
        put(key = "is_unclaimed", boolean = dto.isUnclaimed)
        put(key = "currency", string = dto.currency)
        put(key = "amount", long = dto.amount)
        put(key = "cryptocurrency", string = dto.cryptocurrency)
        put(key = "cryptocurrency_amount", long = dto.cryptocurrencyAmount)
        put(key = "month_count", int = dto.monthCount)
        put(key = "day_count", int = dto.dayCount)
        put(key = "sticker", value = dto.sticker) { data -> serialize(dto = data) }
        put(key = "code", string = dto.code)
    }
}

internal fun serialize(dto: MessageGiveawayCreated): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageGiveawayCreated")
        put(key = "star_count", long = dto.starCount)
    }
}

internal fun serialize(dto: MessageGiveaway): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageGiveaway")
        put(key = "parameters", value = dto.parameters) { data -> serialize(dto = data) }
        put(key = "winner_count", int = dto.winnerCount)
        put(key = "prize", value = dto.prize) { data -> serialize(dto = data) }
        put(key = "sticker", value = dto.sticker) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageGiveawayCompleted): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageGiveawayCompleted")
        put(key = "giveaway_message_id", long = dto.giveawayMessageId)
        put(key = "winner_count", int = dto.winnerCount)
        put(key = "is_star_giveaway", boolean = dto.isStarGiveaway)
        put(key = "unclaimed_prize_count", int = dto.unclaimedPrizeCount)
    }
}

internal fun serialize(dto: MessageGiveawayWinners): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageGiveawayWinners")
        put(key = "boosted_chat_id", long = dto.boostedChatId)
        put(key = "giveaway_message_id", long = dto.giveawayMessageId)
        put(key = "additional_chat_count", int = dto.additionalChatCount)
        put(key = "actual_winners_selection_date", int = dto.actualWinnersSelectionDate)
        put(key = "only_new_members", boolean = dto.onlyNewMembers)
        put(key = "was_refunded", boolean = dto.wasRefunded)
        put(key = "prize", value = dto.prize) { data -> serialize(dto = data) }
        put(key = "prize_description", string = dto.prizeDescription)
        put(key = "winner_count", int = dto.winnerCount)
        put(key = "winner_user_ids", longs = dto.winnerUserIds)
        put(key = "unclaimed_prize_count", int = dto.unclaimedPrizeCount)
    }
}

internal fun serialize(dto: MessageGiftedStars): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageGiftedStars")
        put(key = "gifter_user_id", long = dto.gifterUserId)
        put(key = "receiver_user_id", long = dto.receiverUserId)
        put(key = "currency", string = dto.currency)
        put(key = "amount", long = dto.amount)
        put(key = "cryptocurrency", string = dto.cryptocurrency)
        put(key = "cryptocurrency_amount", long = dto.cryptocurrencyAmount)
        put(key = "star_count", long = dto.starCount)
        put(key = "transaction_id", string = dto.transactionId)
        put(key = "sticker", value = dto.sticker) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageGiftedTon): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageGiftedTon")
        put(key = "gifter_user_id", long = dto.gifterUserId)
        put(key = "receiver_user_id", long = dto.receiverUserId)
        put(key = "gram_amount", long = dto.gramAmount)
        put(key = "transaction_id", string = dto.transactionId)
        put(key = "sticker", value = dto.sticker) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageGiveawayPrizeStars): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageGiveawayPrizeStars")
        put(key = "star_count", long = dto.starCount)
        put(key = "transaction_id", string = dto.transactionId)
        put(key = "boosted_chat_id", long = dto.boostedChatId)
        put(key = "giveaway_message_id", long = dto.giveawayMessageId)
        put(key = "is_unclaimed", boolean = dto.isUnclaimed)
        put(key = "sticker", value = dto.sticker) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageGift): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageGift")
        put(key = "gift", value = dto.gift) { data -> serialize(dto = data) }
        put(key = "sender_id", value = dto.senderId) { data -> serialize(dto = data) }
        put(key = "receiver_id", value = dto.receiverId) { data -> serialize(dto = data) }
        put(key = "received_gift_id", string = dto.receivedGiftId)
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "unique_gift_number", int = dto.uniqueGiftNumber)
        put(key = "sell_star_count", long = dto.sellStarCount)
        put(key = "prepaid_upgrade_star_count", long = dto.prepaidUpgradeStarCount)
        put(key = "is_upgrade_separate", boolean = dto.isUpgradeSeparate)
        put(key = "is_from_auction", boolean = dto.isFromAuction)
        put(key = "is_private", boolean = dto.isPrivate)
        put(key = "is_saved", boolean = dto.isSaved)
        put(key = "is_prepaid_upgrade", boolean = dto.isPrepaidUpgrade)
        put(key = "can_be_upgraded", boolean = dto.canBeUpgraded)
        put(key = "was_converted", boolean = dto.wasConverted)
        put(key = "was_upgraded", boolean = dto.wasUpgraded)
        put(key = "was_refunded", boolean = dto.wasRefunded)
        put(key = "upgraded_received_gift_id", string = dto.upgradedReceivedGiftId)
        put(key = "prepaid_upgrade_hash", string = dto.prepaidUpgradeHash)
    }
}

internal fun serialize(dto: MessageUpgradedGift): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageUpgradedGift")
        put(key = "gift", value = dto.gift) { data -> serialize(dto = data) }
        put(key = "sender_id", value = dto.senderId) { data -> serialize(dto = data) }
        put(key = "receiver_id", value = dto.receiverId) { data -> serialize(dto = data) }
        put(key = "origin", value = dto.origin) { data -> serialize(dto = data) }
        put(key = "received_gift_id", string = dto.receivedGiftId)
        put(key = "is_saved", boolean = dto.isSaved)
        put(key = "can_be_transferred", boolean = dto.canBeTransferred)
        put(key = "was_transferred", boolean = dto.wasTransferred)
        put(key = "transfer_star_count", long = dto.transferStarCount)
        put(key = "drop_original_details_star_count", long = dto.dropOriginalDetailsStarCount)
        put(key = "next_transfer_date", int = dto.nextTransferDate)
        put(key = "next_resale_date", int = dto.nextResaleDate)
        put(key = "export_date", int = dto.exportDate)
        put(key = "craft_date", int = dto.craftDate)
    }
}

internal fun serialize(dto: MessageRefundedUpgradedGift): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageRefundedUpgradedGift")
        put(key = "gift", value = dto.gift) { data -> serialize(dto = data) }
        put(key = "sender_id", value = dto.senderId) { data -> serialize(dto = data) }
        put(key = "receiver_id", value = dto.receiverId) { data -> serialize(dto = data) }
        put(key = "origin", value = dto.origin) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageUpgradedGiftPurchaseOffer): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageUpgradedGiftPurchaseOffer")
        put(key = "gift", value = dto.gift) { data -> serialize(dto = data) }
        put(key = "state", value = dto.state) { data -> serialize(dto = data) }
        put(key = "price", value = dto.price) { data -> serialize(dto = data) }
        put(key = "expiration_date", int = dto.expirationDate)
    }
}

internal fun serialize(dto: MessageUpgradedGiftPurchaseOfferRejected): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageUpgradedGiftPurchaseOfferRejected")
        put(key = "gift", value = dto.gift) { data -> serialize(dto = data) }
        put(key = "price", value = dto.price) { data -> serialize(dto = data) }
        put(key = "offer_message_id", long = dto.offerMessageId)
        put(key = "was_expired", boolean = dto.wasExpired)
    }
}

internal fun serialize(dto: MessagePaidMessagesRefunded): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messagePaidMessagesRefunded")
        put(key = "message_count", int = dto.messageCount)
        put(key = "star_count", long = dto.starCount)
    }
}

internal fun serialize(dto: MessagePaidMessagePriceChanged): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messagePaidMessagePriceChanged")
        put(key = "paid_message_star_count", long = dto.paidMessageStarCount)
    }
}

internal fun serialize(dto: MessageDirectMessagePriceChanged): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageDirectMessagePriceChanged")
        put(key = "is_enabled", boolean = dto.isEnabled)
        put(key = "paid_message_star_count", long = dto.paidMessageStarCount)
    }
}

internal fun serialize(dto: MessageChecklistTasksDone): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageChecklistTasksDone")
        put(key = "checklist_message_id", long = dto.checklistMessageId)
        put(key = "marked_as_done_task_ids", ints = dto.markedAsDoneTaskIds)
        put(key = "marked_as_not_done_task_ids", ints = dto.markedAsNotDoneTaskIds)
    }
}

internal fun serialize(dto: MessageChecklistTasksAdded): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageChecklistTasksAdded")
        put(key = "checklist_message_id", long = dto.checklistMessageId)
        put(key = "tasks", objects = dto.tasks) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageSuggestedPostApprovalFailed): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageSuggestedPostApprovalFailed")
        put(key = "suggested_post_message_id", long = dto.suggestedPostMessageId)
        put(key = "price", value = dto.price) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageSuggestedPostApproved): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageSuggestedPostApproved")
        put(key = "suggested_post_message_id", long = dto.suggestedPostMessageId)
        put(key = "price", value = dto.price) { data -> serialize(dto = data) }
        put(key = "send_date", int = dto.sendDate)
    }
}

internal fun serialize(dto: MessageSuggestedPostDeclined): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageSuggestedPostDeclined")
        put(key = "suggested_post_message_id", long = dto.suggestedPostMessageId)
        put(key = "comment", string = dto.comment)
    }
}

internal fun serialize(dto: MessageSuggestedPostPaid): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageSuggestedPostPaid")
        put(key = "suggested_post_message_id", long = dto.suggestedPostMessageId)
        put(key = "star_amount", value = dto.starAmount) { data -> serialize(dto = data) }
        put(key = "gram_amount", long = dto.gramAmount)
    }
}

internal fun serialize(dto: MessageSuggestedPostRefunded): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageSuggestedPostRefunded")
        put(key = "suggested_post_message_id", long = dto.suggestedPostMessageId)
        put(key = "reason", value = dto.reason) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageContactRegistered): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageContactRegistered")
    }
}

internal fun serialize(dto: MessageUsersShared): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageUsersShared")
        put(key = "users", objects = dto.users) { data -> serialize(dto = data) }
        put(key = "button_id", int = dto.buttonId)
    }
}

internal fun serialize(dto: MessageChatShared): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageChatShared")
        put(key = "chat", value = dto.chat) { data -> serialize(dto = data) }
        put(key = "button_id", int = dto.buttonId)
    }
}

internal fun serialize(dto: MessageBotWriteAccessAllowed): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageBotWriteAccessAllowed")
        put(key = "reason", value = dto.reason) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageWebAppDataSent): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageWebAppDataSent")
        put(key = "button_text", string = dto.buttonText)
    }
}

internal fun serialize(dto: MessageWebAppDataReceived): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageWebAppDataReceived")
        put(key = "button_text", string = dto.buttonText)
        put(key = "data", string = dto.data)
    }
}

internal fun serialize(dto: MessagePassportDataSent): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messagePassportDataSent")
        put(key = "types", objects = dto.types) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessagePassportDataReceived): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messagePassportDataReceived")
        put(key = "elements", objects = dto.elements) { data -> serialize(dto = data) }
        put(key = "credentials", value = dto.credentials) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageProximityAlertTriggered): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageProximityAlertTriggered")
        put(key = "traveler_id", value = dto.travelerId) { data -> serialize(dto = data) }
        put(key = "watcher_id", value = dto.watcherId) { data -> serialize(dto = data) }
        put(key = "distance", int = dto.distance)
    }
}

internal fun serialize(dto: MessageUnsupported): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageUnsupported")
    }
}

internal fun serialize(dto: DateTimePartPrecisionNone): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "dateTimePartPrecisionNone")
    }
}

internal fun serialize(dto: DateTimePartPrecisionShort): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "dateTimePartPrecisionShort")
    }
}

internal fun serialize(dto: DateTimePartPrecisionLong): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "dateTimePartPrecisionLong")
    }
}

internal fun serialize(dto: DateTimeFormattingTypeRelative): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "dateTimeFormattingTypeRelative")
    }
}

internal fun serialize(dto: DateTimeFormattingTypeAbsolute): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "dateTimeFormattingTypeAbsolute")
        put(key = "time_precision", value = dto.timePrecision) { data -> serialize(dto = data) }
        put(key = "date_precision", value = dto.datePrecision) { data -> serialize(dto = data) }
        put(key = "show_day_of_week", boolean = dto.showDayOfWeek)
    }
}

internal fun serialize(dto: TextEntityTypeMention): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "textEntityTypeMention")
    }
}

internal fun serialize(dto: TextEntityTypeHashtag): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "textEntityTypeHashtag")
    }
}

internal fun serialize(dto: TextEntityTypeCashtag): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "textEntityTypeCashtag")
    }
}

internal fun serialize(dto: TextEntityTypeBotCommand): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "textEntityTypeBotCommand")
    }
}

internal fun serialize(dto: TextEntityTypeUrl): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "textEntityTypeUrl")
    }
}

internal fun serialize(dto: TextEntityTypeEmailAddress): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "textEntityTypeEmailAddress")
    }
}

internal fun serialize(dto: TextEntityTypePhoneNumber): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "textEntityTypePhoneNumber")
    }
}

internal fun serialize(dto: TextEntityTypeBankCardNumber): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "textEntityTypeBankCardNumber")
    }
}

internal fun serialize(dto: TextEntityTypeBold): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "textEntityTypeBold")
    }
}

internal fun serialize(dto: TextEntityTypeItalic): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "textEntityTypeItalic")
    }
}

internal fun serialize(dto: TextEntityTypeUnderline): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "textEntityTypeUnderline")
    }
}

internal fun serialize(dto: TextEntityTypeStrikethrough): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "textEntityTypeStrikethrough")
    }
}

internal fun serialize(dto: TextEntityTypeSpoiler): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "textEntityTypeSpoiler")
    }
}

internal fun serialize(dto: TextEntityTypeCode): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "textEntityTypeCode")
    }
}

internal fun serialize(dto: TextEntityTypePre): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "textEntityTypePre")
    }
}

internal fun serialize(dto: TextEntityTypePreCode): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "textEntityTypePreCode")
        put(key = "language", string = dto.language)
    }
}

internal fun serialize(dto: TextEntityTypeBlockQuote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "textEntityTypeBlockQuote")
    }
}

internal fun serialize(dto: TextEntityTypeExpandableBlockQuote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "textEntityTypeExpandableBlockQuote")
    }
}

internal fun serialize(dto: TextEntityTypeTextUrl): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "textEntityTypeTextUrl")
        put(key = "url", string = dto.url)
    }
}

internal fun serialize(dto: TextEntityTypeMentionName): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "textEntityTypeMentionName")
        put(key = "user_id", long = dto.userId)
    }
}

internal fun serialize(dto: TextEntityTypeCustomEmoji): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "textEntityTypeCustomEmoji")
        put(key = "custom_emoji_id", long = dto.customEmojiId)
    }
}

internal fun serialize(dto: TextEntityTypeMediaTimestamp): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "textEntityTypeMediaTimestamp")
        put(key = "media_timestamp", int = dto.mediaTimestamp)
    }
}

internal fun serialize(dto: TextEntityTypeDateTime): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "textEntityTypeDateTime")
        put(key = "unix_time", int = dto.unixTime)
        put(key = "formatting_type", value = dto.formattingType) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: DiffEntityTypeInsert): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "diffEntityTypeInsert")
    }
}

internal fun serialize(dto: DiffEntityTypeReplace): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "diffEntityTypeReplace")
        put(key = "old_text", string = dto.oldText)
    }
}

internal fun serialize(dto: DiffEntityTypeDelete): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "diffEntityTypeDelete")
    }
}

internal fun serialize(dto: InputThumbnail): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputThumbnail")
        put(key = "thumbnail", value = dto.thumbnail) { data -> serialize(dto = data) }
        put(key = "width", int = dto.width)
        put(key = "height", int = dto.height)
    }
}

internal fun serialize(dto: InputAnimation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputAnimation")
        put(key = "animation", value = dto.animation) { data -> serialize(dto = data) }
        put(key = "thumbnail", value = dto.thumbnail) { data -> serialize(dto = data) }
        put(key = "added_sticker_file_ids", ints = dto.addedStickerFileIds)
        put(key = "duration", int = dto.duration)
        put(key = "width", int = dto.width)
        put(key = "height", int = dto.height)
    }
}

internal fun serialize(dto: InputAudio): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputAudio")
        put(key = "audio", value = dto.audio) { data -> serialize(dto = data) }
        put(key = "album_cover_thumbnail", value = dto.albumCoverThumbnail) { data -> serialize(dto = data) }
        put(key = "duration", int = dto.duration)
        put(key = "title", string = dto.title)
        put(key = "performer", string = dto.performer)
    }
}

internal fun serialize(dto: InputDocument): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputDocument")
        put(key = "document", value = dto.document) { data -> serialize(dto = data) }
        put(key = "thumbnail", value = dto.thumbnail) { data -> serialize(dto = data) }
        put(key = "disable_content_type_detection", boolean = dto.disableContentTypeDetection)
    }
}

internal fun serialize(dto: InputPhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPhoto")
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
        put(key = "thumbnail", value = dto.thumbnail) { data -> serialize(dto = data) }
        put(key = "video", value = dto.video) { data -> serialize(dto = data) }
        put(key = "added_sticker_file_ids", ints = dto.addedStickerFileIds)
        put(key = "width", int = dto.width)
        put(key = "height", int = dto.height)
    }
}

internal fun serialize(dto: InputSticker): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputSticker")
        put(key = "sticker", value = dto.sticker) { data -> serialize(dto = data) }
        put(key = "thumbnail", value = dto.thumbnail) { data -> serialize(dto = data) }
        put(key = "width", int = dto.width)
        put(key = "height", int = dto.height)
    }
}

internal fun serialize(dto: InputVideo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputVideo")
        put(key = "video", value = dto.video) { data -> serialize(dto = data) }
        put(key = "thumbnail", value = dto.thumbnail) { data -> serialize(dto = data) }
        put(key = "cover", value = dto.cover) { data -> serialize(dto = data) }
        put(key = "start_timestamp", int = dto.startTimestamp)
        put(key = "added_sticker_file_ids", ints = dto.addedStickerFileIds)
        put(key = "duration", int = dto.duration)
        put(key = "width", int = dto.width)
        put(key = "height", int = dto.height)
        put(key = "supports_streaming", boolean = dto.supportsStreaming)
    }
}

internal fun serialize(dto: InputVideoNote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputVideoNote")
        put(key = "video_note", value = dto.videoNote) { data -> serialize(dto = data) }
        put(key = "thumbnail", value = dto.thumbnail) { data -> serialize(dto = data) }
        put(key = "duration", int = dto.duration)
        put(key = "length", int = dto.length)
    }
}

internal fun serialize(dto: InputVoiceNote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputVoiceNote")
        put(key = "voice_note", value = dto.voiceNote) { data -> serialize(dto = data) }
        put(key = "duration", int = dto.duration)
        put(key = "waveform", bytes = dto.waveform)
    }
}

internal fun serialize(dto: InputPaidMediaTypePhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPaidMediaTypePhoto")
        put(key = "video", value = dto.video) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputPaidMediaTypeVideo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPaidMediaTypeVideo")
        put(key = "cover", value = dto.cover) { data -> serialize(dto = data) }
        put(key = "start_timestamp", int = dto.startTimestamp)
        put(key = "duration", int = dto.duration)
        put(key = "supports_streaming", boolean = dto.supportsStreaming)
    }
}

internal fun serialize(dto: InputPaidMedia): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPaidMedia")
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
        put(key = "media", value = dto.media) { data -> serialize(dto = data) }
        put(key = "thumbnail", value = dto.thumbnail) { data -> serialize(dto = data) }
        put(key = "added_sticker_file_ids", ints = dto.addedStickerFileIds)
        put(key = "width", int = dto.width)
        put(key = "height", int = dto.height)
    }
}

internal fun serialize(dto: MessageSchedulingStateSendAtDate): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageSchedulingStateSendAtDate")
        put(key = "send_date", int = dto.sendDate)
        put(key = "repeat_period", int = dto.repeatPeriod)
    }
}

internal fun serialize(dto: MessageSchedulingStateSendWhenOnline): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageSchedulingStateSendWhenOnline")
    }
}

internal fun serialize(dto: MessageSchedulingStateSendWhenVideoProcessed): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageSchedulingStateSendWhenVideoProcessed")
        put(key = "send_date", int = dto.sendDate)
    }
}

internal fun serialize(dto: MessageSelfDestructTypeTimer): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageSelfDestructTypeTimer")
        put(key = "self_destruct_time", int = dto.selfDestructTime)
    }
}

internal fun serialize(dto: MessageSelfDestructTypeImmediately): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageSelfDestructTypeImmediately")
    }
}

internal fun serialize(dto: MessageSendOptions): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageSendOptions")
        put(key = "suggested_post_info", value = dto.suggestedPostInfo) { data -> serialize(dto = data) }
        put(key = "disable_notification", boolean = dto.disableNotification)
        put(key = "from_background", boolean = dto.fromBackground)
        put(key = "protect_content", boolean = dto.protectContent)
        put(key = "allow_paid_broadcast", boolean = dto.allowPaidBroadcast)
        put(key = "paid_message_star_count", long = dto.paidMessageStarCount)
        put(key = "update_order_of_installed_sticker_sets", boolean = dto.updateOrderOfInstalledStickerSets)
        put(key = "scheduling_state", value = dto.schedulingState) { data -> serialize(dto = data) }
        put(key = "effect_id", long = dto.effectId)
        put(key = "sending_id", int = dto.sendingId)
        put(key = "only_preview", boolean = dto.onlyPreview)
    }
}

internal fun serialize(dto: MessageCopyOptions): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageCopyOptions")
        put(key = "send_copy", boolean = dto.sendCopy)
        put(key = "replace_caption", boolean = dto.replaceCaption)
        put(key = "new_caption", value = dto.newCaption) { data -> serialize(dto = data) }
        put(key = "new_show_caption_above_media", boolean = dto.newShowCaptionAboveMedia)
    }
}

internal fun serialize(dto: InputPollMediaAnimation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPollMediaAnimation")
        put(key = "animation", value = dto.animation) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputPollMediaAudio): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPollMediaAudio")
        put(key = "audio", value = dto.audio) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputPollMediaDocument): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPollMediaDocument")
        put(key = "document", value = dto.document) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputPollMediaLink): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPollMediaLink")
        put(key = "url", string = dto.url)
    }
}

internal fun serialize(dto: InputPollMediaLocation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPollMediaLocation")
        put(key = "location", value = dto.location) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputPollMediaPhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPollMediaPhoto")
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputPollMediaSticker): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPollMediaSticker")
        put(key = "sticker", value = dto.sticker) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputPollMediaVenue): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPollMediaVenue")
        put(key = "venue", value = dto.venue) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputPollMediaVideo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPollMediaVideo")
        put(key = "video", value = dto.video) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputPageBlockSectionHeading): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPageBlockSectionHeading")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "size", int = dto.size)
    }
}

internal fun serialize(dto: InputPageBlockParagraph): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPageBlockParagraph")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputPageBlockPreformatted): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPageBlockPreformatted")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "language", string = dto.language)
    }
}

internal fun serialize(dto: InputPageBlockFooter): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPageBlockFooter")
        put(key = "footer", value = dto.footer) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputPageBlockThinking): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPageBlockThinking")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputPageBlockDivider): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPageBlockDivider")
    }
}

internal fun serialize(dto: InputPageBlockMathematicalExpression): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPageBlockMathematicalExpression")
        put(key = "expression", string = dto.expression)
    }
}

internal fun serialize(dto: InputPageBlockAnchor): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPageBlockAnchor")
        put(key = "name", string = dto.name)
    }
}

internal fun serialize(dto: InputPageBlockList): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPageBlockList")
        put(key = "items", objects = dto.items) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputPageBlockBlockQuote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPageBlockBlockQuote")
        put(key = "blocks", objects = dto.blocks) { data -> serialize(dto = data) }
        put(key = "credit", value = dto.credit) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputPageBlockPullQuote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPageBlockPullQuote")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "credit", value = dto.credit) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputPageBlockAnimation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPageBlockAnimation")
        put(key = "animation", value = dto.animation) { data -> serialize(dto = data) }
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
        put(key = "has_spoiler", boolean = dto.hasSpoiler)
    }
}

internal fun serialize(dto: InputPageBlockAudio): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPageBlockAudio")
        put(key = "audio", value = dto.audio) { data -> serialize(dto = data) }
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputPageBlockPhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPageBlockPhoto")
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
        put(key = "has_spoiler", boolean = dto.hasSpoiler)
    }
}

internal fun serialize(dto: InputPageBlockVideo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPageBlockVideo")
        put(key = "video", value = dto.video) { data -> serialize(dto = data) }
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
        put(key = "has_spoiler", boolean = dto.hasSpoiler)
    }
}

internal fun serialize(dto: InputPageBlockVoiceNote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPageBlockVoiceNote")
        put(key = "voice_note", value = dto.voiceNote) { data -> serialize(dto = data) }
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputPageBlockCollage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPageBlockCollage")
        put(key = "blocks", objects = dto.blocks) { data -> serialize(dto = data) }
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputPageBlockSlideshow): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPageBlockSlideshow")
        put(key = "blocks", objects = dto.blocks) { data -> serialize(dto = data) }
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputPageBlockTable): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPageBlockTable")
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
        put(key = "cells", objectArrays = dto.cells) { data -> serialize(dto = data) }
        put(key = "is_bordered", boolean = dto.isBordered)
        put(key = "is_striped", boolean = dto.isStriped)
    }
}

internal fun serialize(dto: InputPageBlockDetails): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPageBlockDetails")
        put(key = "header", value = dto.header) { data -> serialize(dto = data) }
        put(key = "blocks", objects = dto.blocks) { data -> serialize(dto = data) }
        put(key = "is_open", boolean = dto.isOpen)
    }
}

internal fun serialize(dto: InputPageBlockMap): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputPageBlockMap")
        put(key = "location", value = dto.location) { data -> serialize(dto = data) }
        put(key = "zoom", int = dto.zoom)
        put(key = "width", int = dto.width)
        put(key = "height", int = dto.height)
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputMessageText): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputMessageText")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "link_preview_options", value = dto.linkPreviewOptions) { data -> serialize(dto = data) }
        put(key = "clear_draft", boolean = dto.clearDraft)
    }
}

internal fun serialize(dto: InputMessageRichMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputMessageRichMessage")
        put(key = "message", value = dto.message) { data -> serialize(dto = data) }
        put(key = "clear_draft", boolean = dto.clearDraft)
    }
}

internal fun serialize(dto: InputMessageAnimation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputMessageAnimation")
        put(key = "animation", value = dto.animation) { data -> serialize(dto = data) }
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
        put(key = "show_caption_above_media", boolean = dto.showCaptionAboveMedia)
        put(key = "has_spoiler", boolean = dto.hasSpoiler)
    }
}

internal fun serialize(dto: InputMessageAudio): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputMessageAudio")
        put(key = "audio", value = dto.audio) { data -> serialize(dto = data) }
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputMessageDocument): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputMessageDocument")
        put(key = "document", value = dto.document) { data -> serialize(dto = data) }
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputMessagePaidMedia): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputMessagePaidMedia")
        put(key = "star_count", long = dto.starCount)
        put(key = "paid_media", objects = dto.paidMedia) { data -> serialize(dto = data) }
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
        put(key = "show_caption_above_media", boolean = dto.showCaptionAboveMedia)
        put(key = "payload", string = dto.payload)
    }
}

internal fun serialize(dto: InputMessagePhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputMessagePhoto")
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
        put(key = "show_caption_above_media", boolean = dto.showCaptionAboveMedia)
        put(key = "self_destruct_type", value = dto.selfDestructType) { data -> serialize(dto = data) }
        put(key = "has_spoiler", boolean = dto.hasSpoiler)
    }
}

internal fun serialize(dto: InputMessageSticker): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputMessageSticker")
        put(key = "sticker", value = dto.sticker) { data -> serialize(dto = data) }
        put(key = "emoji", string = dto.emoji)
    }
}

internal fun serialize(dto: InputMessageVideo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputMessageVideo")
        put(key = "video", value = dto.video) { data -> serialize(dto = data) }
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
        put(key = "show_caption_above_media", boolean = dto.showCaptionAboveMedia)
        put(key = "self_destruct_type", value = dto.selfDestructType) { data -> serialize(dto = data) }
        put(key = "has_spoiler", boolean = dto.hasSpoiler)
    }
}

internal fun serialize(dto: InputMessageVideoNote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputMessageVideoNote")
        put(key = "video_note", value = dto.videoNote) { data -> serialize(dto = data) }
        put(key = "self_destruct_type", value = dto.selfDestructType) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputMessageVoiceNote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputMessageVoiceNote")
        put(key = "voice_note", value = dto.voiceNote) { data -> serialize(dto = data) }
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
        put(key = "self_destruct_type", value = dto.selfDestructType) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputMessageLiveLocation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputMessageLiveLocation")
        put(key = "location", value = dto.location) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputMessageLocation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputMessageLocation")
        put(key = "location", value = dto.location) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputMessageVenue): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputMessageVenue")
        put(key = "venue", value = dto.venue) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputMessageContact): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputMessageContact")
        put(key = "contact", value = dto.contact) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputMessageDice): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputMessageDice")
        put(key = "emoji", string = dto.emoji)
        put(key = "clear_draft", boolean = dto.clearDraft)
    }
}

internal fun serialize(dto: InputMessageGame): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputMessageGame")
        put(key = "bot_user_id", long = dto.botUserId)
        put(key = "game_short_name", string = dto.gameShortName)
    }
}

internal fun serialize(dto: InputMessageInvoice): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputMessageInvoice")
        put(key = "invoice", value = dto.invoice) { data -> serialize(dto = data) }
        put(key = "title", string = dto.title)
        put(key = "description", string = dto.description)
        put(key = "photo_url", string = dto.photoUrl)
        put(key = "photo_size", int = dto.photoSize)
        put(key = "photo_width", int = dto.photoWidth)
        put(key = "photo_height", int = dto.photoHeight)
        put(key = "payload", bytes = dto.payload)
        put(key = "provider_token", string = dto.providerToken)
        put(key = "provider_data", string = dto.providerData)
        put(key = "start_parameter", string = dto.startParameter)
        put(key = "paid_media", value = dto.paidMedia) { data -> serialize(dto = data) }
        put(key = "paid_media_caption", value = dto.paidMediaCaption) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputMessagePoll): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputMessagePoll")
        put(key = "question", value = dto.question) { data -> serialize(dto = data) }
        put(key = "options", objects = dto.options) { data -> serialize(dto = data) }
        put(key = "description", value = dto.description) { data -> serialize(dto = data) }
        put(key = "media", value = dto.media) { data -> serialize(dto = data) }
        put(key = "is_anonymous", boolean = dto.isAnonymous)
        put(key = "allows_multiple_answers", boolean = dto.allowsMultipleAnswers)
        put(key = "allows_revoting", boolean = dto.allowsRevoting)
        put(key = "members_only", boolean = dto.membersOnly)
        put(key = "country_codes", strings = dto.countryCodes)
        put(key = "shuffle_options", boolean = dto.shuffleOptions)
        put(key = "hide_results_until_closes", boolean = dto.hideResultsUntilCloses)
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
        put(key = "open_period", int = dto.openPeriod)
        put(key = "close_date", int = dto.closeDate)
        put(key = "is_closed", boolean = dto.isClosed)
    }
}

internal fun serialize(dto: InputMessageStakeDice): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputMessageStakeDice")
        put(key = "state_hash", string = dto.stateHash)
        put(key = "stake_gram_amount", long = dto.stakeGramAmount)
        put(key = "clear_draft", boolean = dto.clearDraft)
    }
}

internal fun serialize(dto: InputMessageStory): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputMessageStory")
        put(key = "story_poster_chat_id", long = dto.storyPosterChatId)
        put(key = "story_id", int = dto.storyId)
    }
}

internal fun serialize(dto: InputMessageChecklist): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputMessageChecklist")
        put(key = "checklist", value = dto.checklist) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputMessageForwarded): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputMessageForwarded")
        put(key = "from_chat_id", long = dto.fromChatId)
        put(key = "message_id", long = dto.messageId)
        put(key = "in_game_share", boolean = dto.inGameShare)
        put(key = "replace_video_start_timestamp", boolean = dto.replaceVideoStartTimestamp)
        put(key = "new_video_start_timestamp", int = dto.newVideoStartTimestamp)
        put(key = "copy_options", value = dto.copyOptions) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageProperties): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageProperties")
        put(key = "can_add_offer", boolean = dto.canAddOffer)
        put(key = "can_add_tasks", boolean = dto.canAddTasks)
        put(key = "can_be_approved", boolean = dto.canBeApproved)
        put(key = "can_be_copied", boolean = dto.canBeCopied)
        put(key = "can_be_copied_to_secret_chat", boolean = dto.canBeCopiedToSecretChat)
        put(key = "can_be_declined", boolean = dto.canBeDeclined)
        put(key = "can_be_deleted_only_for_self", boolean = dto.canBeDeletedOnlyForSelf)
        put(key = "can_be_deleted_for_all_users", boolean = dto.canBeDeletedForAllUsers)
        put(key = "can_be_edited", boolean = dto.canBeEdited)
        put(key = "can_be_forwarded", boolean = dto.canBeForwarded)
        put(key = "can_be_paid", boolean = dto.canBePaid)
        put(key = "can_be_pinned", boolean = dto.canBePinned)
        put(key = "can_be_replied", boolean = dto.canBeReplied)
        put(key = "can_be_replied_in_another_chat", boolean = dto.canBeRepliedInAnotherChat)
        put(key = "can_be_saved", boolean = dto.canBeSaved)
        put(key = "can_be_shared_in_story", boolean = dto.canBeSharedInStory)
        put(key = "can_delete_reactions", boolean = dto.canDeleteReactions)
        put(key = "can_edit_media", boolean = dto.canEditMedia)
        put(key = "can_edit_scheduling_state", boolean = dto.canEditSchedulingState)
        put(key = "can_edit_suggested_post_info", boolean = dto.canEditSuggestedPostInfo)
        put(key = "can_get_author", boolean = dto.canGetAuthor)
        put(key = "can_get_embedding_code", boolean = dto.canGetEmbeddingCode)
        put(key = "can_get_link", boolean = dto.canGetLink)
        put(key = "can_get_media_timestamp_links", boolean = dto.canGetMediaTimestampLinks)
        put(key = "can_get_message_thread", boolean = dto.canGetMessageThread)
        put(key = "can_get_poll_vote_statistics", boolean = dto.canGetPollVoteStatistics)
        put(key = "can_get_read_date", boolean = dto.canGetReadDate)
        put(key = "can_get_statistics", boolean = dto.canGetStatistics)
        put(key = "can_get_video_advertisements", boolean = dto.canGetVideoAdvertisements)
        put(key = "can_get_viewers", boolean = dto.canGetViewers)
        put(key = "can_mark_tasks_as_done", boolean = dto.canMarkTasksAsDone)
        put(key = "can_recognize_speech", boolean = dto.canRecognizeSpeech)
        put(key = "can_report_chat", boolean = dto.canReportChat)
        put(key = "can_report_reactions", boolean = dto.canReportReactions)
        put(key = "can_report_supergroup_spam", boolean = dto.canReportSupergroupSpam)
        put(key = "can_set_fact_check", boolean = dto.canSetFactCheck)
        put(key = "has_protected_content_by_current_user", boolean = dto.hasProtectedContentByCurrentUser)
        put(key = "has_protected_content_by_other_user", boolean = dto.hasProtectedContentByOtherUser)
        put(key = "need_show_statistics", boolean = dto.needShowStatistics)
    }
}

internal fun serialize(dto: PollOptionProperties): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pollOptionProperties")
        put(key = "can_be_deleted", boolean = dto.canBeDeleted)
        put(key = "can_be_replied", boolean = dto.canBeReplied)
        put(key = "can_be_replied_in_another_chat", boolean = dto.canBeRepliedInAnotherChat)
        put(key = "can_get_link", boolean = dto.canGetLink)
    }
}

internal fun serialize(dto: SearchMessagesFilterEmpty): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "searchMessagesFilterEmpty")
    }
}

internal fun serialize(dto: SearchMessagesFilterAnimation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "searchMessagesFilterAnimation")
    }
}

internal fun serialize(dto: SearchMessagesFilterAudio): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "searchMessagesFilterAudio")
    }
}

internal fun serialize(dto: SearchMessagesFilterDocument): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "searchMessagesFilterDocument")
    }
}

internal fun serialize(dto: SearchMessagesFilterPhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "searchMessagesFilterPhoto")
    }
}

internal fun serialize(dto: SearchMessagesFilterPoll): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "searchMessagesFilterPoll")
    }
}

internal fun serialize(dto: SearchMessagesFilterVideo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "searchMessagesFilterVideo")
    }
}

internal fun serialize(dto: SearchMessagesFilterVoiceNote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "searchMessagesFilterVoiceNote")
    }
}

internal fun serialize(dto: SearchMessagesFilterPhotoAndVideo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "searchMessagesFilterPhotoAndVideo")
    }
}

internal fun serialize(dto: SearchMessagesFilterUrl): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "searchMessagesFilterUrl")
    }
}

internal fun serialize(dto: SearchMessagesFilterChatPhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "searchMessagesFilterChatPhoto")
    }
}

internal fun serialize(dto: SearchMessagesFilterVideoNote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "searchMessagesFilterVideoNote")
    }
}

internal fun serialize(dto: SearchMessagesFilterVoiceAndVideoNote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "searchMessagesFilterVoiceAndVideoNote")
    }
}

internal fun serialize(dto: SearchMessagesFilterMention): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "searchMessagesFilterMention")
    }
}

internal fun serialize(dto: SearchMessagesFilterUnreadMention): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "searchMessagesFilterUnreadMention")
    }
}

internal fun serialize(dto: SearchMessagesFilterUnreadReaction): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "searchMessagesFilterUnreadReaction")
    }
}

internal fun serialize(dto: SearchMessagesFilterUnreadPollVote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "searchMessagesFilterUnreadPollVote")
    }
}

internal fun serialize(dto: SearchMessagesFilterFailedToSend): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "searchMessagesFilterFailedToSend")
    }
}

internal fun serialize(dto: SearchMessagesFilterPinned): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "searchMessagesFilterPinned")
    }
}

internal fun serialize(dto: SearchMessagesChatTypeFilterPrivate): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "searchMessagesChatTypeFilterPrivate")
    }
}

internal fun serialize(dto: SearchMessagesChatTypeFilterGroup): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "searchMessagesChatTypeFilterGroup")
    }
}

internal fun serialize(dto: SearchMessagesChatTypeFilterChannel): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "searchMessagesChatTypeFilterChannel")
    }
}

internal fun serialize(dto: SearchChatTypeFilterBot): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "searchChatTypeFilterBot")
    }
}

internal fun serialize(dto: SearchChatTypeFilterChannel): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "searchChatTypeFilterChannel")
    }
}

internal fun serialize(dto: ChatActionTyping): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatActionTyping")
    }
}

internal fun serialize(dto: ChatActionRecordingVideo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatActionRecordingVideo")
    }
}

internal fun serialize(dto: ChatActionUploadingVideo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatActionUploadingVideo")
        put(key = "progress", int = dto.progress)
    }
}

internal fun serialize(dto: ChatActionRecordingVoiceNote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatActionRecordingVoiceNote")
    }
}

internal fun serialize(dto: ChatActionUploadingVoiceNote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatActionUploadingVoiceNote")
        put(key = "progress", int = dto.progress)
    }
}

internal fun serialize(dto: ChatActionUploadingPhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatActionUploadingPhoto")
        put(key = "progress", int = dto.progress)
    }
}

internal fun serialize(dto: ChatActionUploadingDocument): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatActionUploadingDocument")
        put(key = "progress", int = dto.progress)
    }
}

internal fun serialize(dto: ChatActionChoosingSticker): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatActionChoosingSticker")
    }
}

internal fun serialize(dto: ChatActionChoosingLocation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatActionChoosingLocation")
    }
}

internal fun serialize(dto: ChatActionChoosingContact): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatActionChoosingContact")
    }
}

internal fun serialize(dto: ChatActionStartPlayingGame): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatActionStartPlayingGame")
    }
}

internal fun serialize(dto: ChatActionRecordingVideoNote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatActionRecordingVideoNote")
    }
}

internal fun serialize(dto: ChatActionUploadingVideoNote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatActionUploadingVideoNote")
        put(key = "progress", int = dto.progress)
    }
}

internal fun serialize(dto: ChatActionWatchingAnimations): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatActionWatchingAnimations")
        put(key = "emoji", string = dto.emoji)
    }
}

internal fun serialize(dto: ChatActionCancel): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatActionCancel")
    }
}

internal fun serialize(dto: UserStatusEmpty): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userStatusEmpty")
    }
}

internal fun serialize(dto: UserStatusOnline): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userStatusOnline")
        put(key = "expires", int = dto.expires)
    }
}

internal fun serialize(dto: UserStatusOffline): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userStatusOffline")
        put(key = "was_online", int = dto.wasOnline)
    }
}

internal fun serialize(dto: UserStatusRecently): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userStatusRecently")
        put(key = "by_my_privacy_settings", boolean = dto.byMyPrivacySettings)
    }
}

internal fun serialize(dto: UserStatusLastWeek): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userStatusLastWeek")
        put(key = "by_my_privacy_settings", boolean = dto.byMyPrivacySettings)
    }
}

internal fun serialize(dto: UserStatusLastMonth): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userStatusLastMonth")
        put(key = "by_my_privacy_settings", boolean = dto.byMyPrivacySettings)
    }
}

internal fun serialize(dto: EmojiKeyword): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "emojiKeyword")
        put(key = "emoji", string = dto.emoji)
        put(key = "keyword", string = dto.keyword)
    }
}

internal fun serialize(dto: EmojiKeywords): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "emojiKeywords")
        put(key = "emoji_keywords", objects = dto.emojiKeywords) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: Stickers): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "stickers")
        put(key = "stickers", objects = dto.stickers) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: Emojis): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "emojis")
        put(key = "emojis", strings = dto.emojis)
    }
}

internal fun serialize(dto: StickerSet): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "stickerSet")
        put(key = "id", long = dto.id)
        put(key = "title", string = dto.title)
        put(key = "name", string = dto.name)
        put(key = "thumbnail", value = dto.thumbnail) { data -> serialize(dto = data) }
        put(key = "thumbnail_outline", value = dto.thumbnailOutline) { data -> serialize(dto = data) }
        put(key = "is_owned", boolean = dto.isOwned)
        put(key = "is_installed", boolean = dto.isInstalled)
        put(key = "is_archived", boolean = dto.isArchived)
        put(key = "is_official", boolean = dto.isOfficial)
        put(key = "sticker_type", value = dto.stickerType) { data -> serialize(dto = data) }
        put(key = "needs_repainting", boolean = dto.needsRepainting)
        put(key = "is_allowed_as_chat_emoji_status", boolean = dto.isAllowedAsChatEmojiStatus)
        put(key = "is_viewed", boolean = dto.isViewed)
        put(key = "stickers", objects = dto.stickers) { data -> serialize(dto = data) }
        put(key = "emojis", objects = dto.emojis) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StickerSetInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "stickerSetInfo")
        put(key = "id", long = dto.id)
        put(key = "title", string = dto.title)
        put(key = "name", string = dto.name)
        put(key = "thumbnail", value = dto.thumbnail) { data -> serialize(dto = data) }
        put(key = "thumbnail_outline", value = dto.thumbnailOutline) { data -> serialize(dto = data) }
        put(key = "is_owned", boolean = dto.isOwned)
        put(key = "is_installed", boolean = dto.isInstalled)
        put(key = "is_archived", boolean = dto.isArchived)
        put(key = "is_official", boolean = dto.isOfficial)
        put(key = "sticker_type", value = dto.stickerType) { data -> serialize(dto = data) }
        put(key = "needs_repainting", boolean = dto.needsRepainting)
        put(key = "is_allowed_as_chat_emoji_status", boolean = dto.isAllowedAsChatEmojiStatus)
        put(key = "is_viewed", boolean = dto.isViewed)
        put(key = "size", int = dto.size)
        put(key = "covers", objects = dto.covers) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StickerSets): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "stickerSets")
        put(key = "total_count", int = dto.totalCount)
        put(key = "sets", objects = dto.sets) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: TrendingStickerSets): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "trendingStickerSets")
        put(key = "total_count", int = dto.totalCount)
        put(key = "sets", objects = dto.sets) { data -> serialize(dto = data) }
        put(key = "is_premium", boolean = dto.isPremium)
    }
}

internal fun serialize(dto: EmojiCategorySourceSearch): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "emojiCategorySourceSearch")
        put(key = "emojis", strings = dto.emojis)
    }
}

internal fun serialize(dto: EmojiCategorySourcePremium): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "emojiCategorySourcePremium")
    }
}

internal fun serialize(dto: EmojiCategory): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "emojiCategory")
        put(key = "name", string = dto.name)
        put(key = "icon", value = dto.icon) { data -> serialize(dto = data) }
        put(key = "source", value = dto.source) { data -> serialize(dto = data) }
        put(key = "is_greeting", boolean = dto.isGreeting)
    }
}

internal fun serialize(dto: EmojiCategories): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "emojiCategories")
        put(key = "categories", objects = dto.categories) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: EmojiCategoryTypeDefault): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "emojiCategoryTypeDefault")
    }
}

internal fun serialize(dto: EmojiCategoryTypeRegularStickers): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "emojiCategoryTypeRegularStickers")
    }
}

internal fun serialize(dto: EmojiCategoryTypeEmojiStatus): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "emojiCategoryTypeEmojiStatus")
    }
}

internal fun serialize(dto: EmojiCategoryTypeChatPhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "emojiCategoryTypeChatPhoto")
    }
}

internal fun serialize(dto: CurrentWeather): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "currentWeather")
        put(key = "temperature", double = dto.temperature)
        put(key = "emoji", string = dto.emoji)
    }
}

internal fun serialize(dto: StoryAreaPosition): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyAreaPosition")
        put(key = "x_percentage", double = dto.xPercentage)
        put(key = "y_percentage", double = dto.yPercentage)
        put(key = "width_percentage", double = dto.widthPercentage)
        put(key = "height_percentage", double = dto.heightPercentage)
        put(key = "rotation_angle", double = dto.rotationAngle)
        put(key = "corner_radius_percentage", double = dto.cornerRadiusPercentage)
    }
}

internal fun serialize(dto: StoryAreaTypeLocation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyAreaTypeLocation")
        put(key = "location", value = dto.location) { data -> serialize(dto = data) }
        put(key = "address", value = dto.address) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StoryAreaTypeVenue): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyAreaTypeVenue")
        put(key = "venue", value = dto.venue) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StoryAreaTypeSuggestedReaction): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyAreaTypeSuggestedReaction")
        put(key = "reaction_type", value = dto.reactionType) { data -> serialize(dto = data) }
        put(key = "total_count", int = dto.totalCount)
        put(key = "is_dark", boolean = dto.isDark)
        put(key = "is_flipped", boolean = dto.isFlipped)
    }
}

internal fun serialize(dto: StoryAreaTypeMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyAreaTypeMessage")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_id", long = dto.messageId)
    }
}

internal fun serialize(dto: StoryAreaTypeLink): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyAreaTypeLink")
        put(key = "url", string = dto.url)
    }
}

internal fun serialize(dto: StoryAreaTypeWeather): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyAreaTypeWeather")
        put(key = "temperature", double = dto.temperature)
        put(key = "emoji", string = dto.emoji)
        put(key = "background_color", int = dto.backgroundColor)
    }
}

internal fun serialize(dto: StoryAreaTypeUpgradedGift): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyAreaTypeUpgradedGift")
        put(key = "gift_name", string = dto.giftName)
    }
}

internal fun serialize(dto: StoryArea): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyArea")
        put(key = "position", value = dto.position) { data -> serialize(dto = data) }
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputStoryAreaTypeLocation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputStoryAreaTypeLocation")
        put(key = "location", value = dto.location) { data -> serialize(dto = data) }
        put(key = "address", value = dto.address) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputStoryAreaTypeFoundVenue): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputStoryAreaTypeFoundVenue")
        put(key = "query_id", long = dto.queryId)
        put(key = "result_id", string = dto.resultId)
    }
}

internal fun serialize(dto: InputStoryAreaTypePreviousVenue): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputStoryAreaTypePreviousVenue")
        put(key = "venue_provider", string = dto.venueProvider)
        put(key = "venue_id", string = dto.venueId)
    }
}

internal fun serialize(dto: InputStoryAreaTypeSuggestedReaction): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputStoryAreaTypeSuggestedReaction")
        put(key = "reaction_type", value = dto.reactionType) { data -> serialize(dto = data) }
        put(key = "is_dark", boolean = dto.isDark)
        put(key = "is_flipped", boolean = dto.isFlipped)
    }
}

internal fun serialize(dto: InputStoryAreaTypeMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputStoryAreaTypeMessage")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_id", long = dto.messageId)
    }
}

internal fun serialize(dto: InputStoryAreaTypeLink): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputStoryAreaTypeLink")
        put(key = "url", string = dto.url)
    }
}

internal fun serialize(dto: InputStoryAreaTypeWeather): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputStoryAreaTypeWeather")
        put(key = "temperature", double = dto.temperature)
        put(key = "emoji", string = dto.emoji)
        put(key = "background_color", int = dto.backgroundColor)
    }
}

internal fun serialize(dto: InputStoryAreaTypeUpgradedGift): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputStoryAreaTypeUpgradedGift")
        put(key = "gift_name", string = dto.giftName)
    }
}

internal fun serialize(dto: InputStoryArea): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputStoryArea")
        put(key = "position", value = dto.position) { data -> serialize(dto = data) }
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputStoryAreas): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputStoryAreas")
        put(key = "areas", objects = dto.areas) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StoryVideo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyVideo")
        put(key = "duration", double = dto.duration)
        put(key = "width", int = dto.width)
        put(key = "height", int = dto.height)
        put(key = "has_stickers", boolean = dto.hasStickers)
        put(key = "is_animation", boolean = dto.isAnimation)
        put(key = "minithumbnail", value = dto.minithumbnail) { data -> serialize(dto = data) }
        put(key = "thumbnail", value = dto.thumbnail) { data -> serialize(dto = data) }
        put(key = "preload_prefix_size", int = dto.preloadPrefixSize)
        put(key = "cover_frame_timestamp", double = dto.coverFrameTimestamp)
        put(key = "video", value = dto.video) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StoryContentTypePhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyContentTypePhoto")
    }
}

internal fun serialize(dto: StoryContentTypeVideo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyContentTypeVideo")
    }
}

internal fun serialize(dto: StoryContentTypeLive): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyContentTypeLive")
    }
}

internal fun serialize(dto: StoryContentTypeUnsupported): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyContentTypeUnsupported")
    }
}

internal fun serialize(dto: StoryContentPhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyContentPhoto")
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StoryContentVideo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyContentVideo")
        put(key = "video", value = dto.video) { data -> serialize(dto = data) }
        put(key = "alternative_video", value = dto.alternativeVideo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StoryContentLive): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyContentLive")
        put(key = "group_call_id", int = dto.groupCallId)
        put(key = "is_rtmp_stream", boolean = dto.isRtmpStream)
    }
}

internal fun serialize(dto: StoryContentUnsupported): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyContentUnsupported")
    }
}

internal fun serialize(dto: InputStoryContentPhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputStoryContentPhoto")
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
        put(key = "added_sticker_file_ids", ints = dto.addedStickerFileIds)
    }
}

internal fun serialize(dto: InputStoryContentVideo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputStoryContentVideo")
        put(key = "video", value = dto.video) { data -> serialize(dto = data) }
        put(key = "added_sticker_file_ids", ints = dto.addedStickerFileIds)
        put(key = "duration", double = dto.duration)
        put(key = "cover_frame_timestamp", double = dto.coverFrameTimestamp)
        put(key = "is_animation", boolean = dto.isAnimation)
    }
}

internal fun serialize(dto: StoryListMain): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyListMain")
    }
}

internal fun serialize(dto: StoryListArchive): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyListArchive")
    }
}

internal fun serialize(dto: StoryOriginPublicStory): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyOriginPublicStory")
        put(key = "chat_id", long = dto.chatId)
        put(key = "story_id", int = dto.storyId)
    }
}

internal fun serialize(dto: StoryOriginHiddenUser): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyOriginHiddenUser")
        put(key = "poster_name", string = dto.posterName)
    }
}

internal fun serialize(dto: StoryRepostInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyRepostInfo")
        put(key = "origin", value = dto.origin) { data -> serialize(dto = data) }
        put(key = "is_content_modified", boolean = dto.isContentModified)
    }
}

internal fun serialize(dto: StoryInteractionInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyInteractionInfo")
        put(key = "view_count", int = dto.viewCount)
        put(key = "forward_count", int = dto.forwardCount)
        put(key = "reaction_count", int = dto.reactionCount)
        put(key = "recent_viewer_user_ids", longs = dto.recentViewerUserIds)
    }
}

internal fun serialize(dto: Story): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "story")
        put(key = "id", int = dto.id)
        put(key = "poster_chat_id", long = dto.posterChatId)
        put(key = "poster_id", value = dto.posterId) { data -> serialize(dto = data) }
        put(key = "date", int = dto.date)
        put(key = "is_being_posted", boolean = dto.isBeingPosted)
        put(key = "is_being_edited", boolean = dto.isBeingEdited)
        put(key = "is_edited", boolean = dto.isEdited)
        put(key = "is_posted_to_chat_page", boolean = dto.isPostedToChatPage)
        put(key = "is_visible_only_for_self", boolean = dto.isVisibleOnlyForSelf)
        put(key = "can_be_added_to_album", boolean = dto.canBeAddedToAlbum)
        put(key = "can_be_deleted", boolean = dto.canBeDeleted)
        put(key = "can_be_edited", boolean = dto.canBeEdited)
        put(key = "can_be_forwarded", boolean = dto.canBeForwarded)
        put(key = "can_be_replied", boolean = dto.canBeReplied)
        put(key = "can_set_privacy_settings", boolean = dto.canSetPrivacySettings)
        put(key = "can_toggle_is_posted_to_chat_page", boolean = dto.canToggleIsPostedToChatPage)
        put(key = "can_get_statistics", boolean = dto.canGetStatistics)
        put(key = "can_get_interactions", boolean = dto.canGetInteractions)
        put(key = "has_expired_viewers", boolean = dto.hasExpiredViewers)
        put(key = "repost_info", value = dto.repostInfo) { data -> serialize(dto = data) }
        put(key = "interaction_info", value = dto.interactionInfo) { data -> serialize(dto = data) }
        put(key = "chosen_reaction_type", value = dto.chosenReactionType) { data -> serialize(dto = data) }
        put(key = "privacy_settings", value = dto.privacySettings) { data -> serialize(dto = data) }
        put(key = "content", value = dto.content) { data -> serialize(dto = data) }
        put(key = "areas", objects = dto.areas) { data -> serialize(dto = data) }
        put(key = "caption", value = dto.caption) { data -> serialize(dto = data) }
        put(key = "album_ids", ints = dto.albumIds)
    }
}

internal fun serialize(dto: Stories): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "stories")
        put(key = "total_count", int = dto.totalCount)
        put(key = "stories", objects = dto.stories) { data -> serialize(dto = data) }
        put(key = "pinned_story_ids", ints = dto.pinnedStoryIds)
    }
}

internal fun serialize(dto: FoundStories): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "foundStories")
        put(key = "total_count", int = dto.totalCount)
        put(key = "stories", objects = dto.stories) { data -> serialize(dto = data) }
        put(key = "next_offset", string = dto.nextOffset)
    }
}

internal fun serialize(dto: StoryAlbum): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyAlbum")
        put(key = "id", int = dto.id)
        put(key = "name", string = dto.name)
        put(key = "photo_icon", value = dto.photoIcon) { data -> serialize(dto = data) }
        put(key = "video_icon", value = dto.videoIcon) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StoryAlbums): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyAlbums")
        put(key = "albums", objects = dto.albums) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StoryFullId): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyFullId")
        put(key = "poster_chat_id", long = dto.posterChatId)
        put(key = "story_id", int = dto.storyId)
    }
}

internal fun serialize(dto: StoryInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyInfo")
        put(key = "story_id", int = dto.storyId)
        put(key = "date", int = dto.date)
        put(key = "is_for_close_friends", boolean = dto.isForCloseFriends)
        put(key = "is_live", boolean = dto.isLive)
    }
}

internal fun serialize(dto: ChatActiveStories): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatActiveStories")
        put(key = "chat_id", long = dto.chatId)
        put(key = "list", value = dto.list) { data -> serialize(dto = data) }
        put(key = "order", long = dto.order)
        put(key = "can_be_archived", boolean = dto.canBeArchived)
        put(key = "max_read_story_id", int = dto.maxReadStoryId)
        put(key = "stories", objects = dto.stories) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StoryInteractionTypeView): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyInteractionTypeView")
        put(key = "chosen_reaction_type", value = dto.chosenReactionType) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StoryInteractionTypeForward): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyInteractionTypeForward")
        put(key = "message", value = dto.message) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StoryInteractionTypeRepost): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyInteractionTypeRepost")
        put(key = "story", value = dto.story) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StoryInteraction): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyInteraction")
        put(key = "actor_id", value = dto.actorId) { data -> serialize(dto = data) }
        put(key = "interaction_date", int = dto.interactionDate)
        put(key = "block_list", value = dto.blockList) { data -> serialize(dto = data) }
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StoryInteractions): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyInteractions")
        put(key = "total_count", int = dto.totalCount)
        put(key = "total_forward_count", int = dto.totalForwardCount)
        put(key = "total_reaction_count", int = dto.totalReactionCount)
        put(key = "interactions", objects = dto.interactions) { data -> serialize(dto = data) }
        put(key = "next_offset", string = dto.nextOffset)
    }
}

internal fun serialize(dto: QuickReplyMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "quickReplyMessage")
        put(key = "id", long = dto.id)
        put(key = "sending_state", value = dto.sendingState) { data -> serialize(dto = data) }
        put(key = "can_be_edited", boolean = dto.canBeEdited)
        put(key = "reply_to_message_id", long = dto.replyToMessageId)
        put(key = "via_bot_user_id", long = dto.viaBotUserId)
        put(key = "media_album_id", long = dto.mediaAlbumId)
        put(key = "content", value = dto.content) { data -> serialize(dto = data) }
        put(key = "reply_markup", value = dto.replyMarkup) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: QuickReplyMessages): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "quickReplyMessages")
        putNullable(key = "messages", objects = dto.messages) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: QuickReplyShortcut): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "quickReplyShortcut")
        put(key = "id", int = dto.id)
        put(key = "name", string = dto.name)
        put(key = "first_message", value = dto.firstMessage) { data -> serialize(dto = data) }
        put(key = "message_count", int = dto.messageCount)
    }
}

internal fun serialize(dto: PublicForwardMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "publicForwardMessage")
        put(key = "message", value = dto.message) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PublicForwardStory): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "publicForwardStory")
        put(key = "story", value = dto.story) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PublicForwards): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "publicForwards")
        put(key = "total_count", int = dto.totalCount)
        put(key = "forwards", objects = dto.forwards) { data -> serialize(dto = data) }
        put(key = "next_offset", string = dto.nextOffset)
    }
}

internal fun serialize(dto: BotMediaPreview): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "botMediaPreview")
        put(key = "date", int = dto.date)
        put(key = "content", value = dto.content) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: BotMediaPreviews): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "botMediaPreviews")
        put(key = "previews", objects = dto.previews) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: BotMediaPreviewInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "botMediaPreviewInfo")
        put(key = "previews", objects = dto.previews) { data -> serialize(dto = data) }
        put(key = "language_codes", strings = dto.languageCodes)
    }
}

internal fun serialize(dto: ChatBoostLevelFeatures): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatBoostLevelFeatures")
        put(key = "level", int = dto.level)
        put(key = "story_per_day_count", int = dto.storyPerDayCount)
        put(key = "custom_emoji_reaction_count", int = dto.customEmojiReactionCount)
        put(key = "title_color_count", int = dto.titleColorCount)
        put(key = "profile_accent_color_count", int = dto.profileAccentColorCount)
        put(key = "can_set_profile_background_custom_emoji", boolean = dto.canSetProfileBackgroundCustomEmoji)
        put(key = "accent_color_count", int = dto.accentColorCount)
        put(key = "can_set_background_custom_emoji", boolean = dto.canSetBackgroundCustomEmoji)
        put(key = "can_set_emoji_status", boolean = dto.canSetEmojiStatus)
        put(key = "chat_theme_background_count", int = dto.chatThemeBackgroundCount)
        put(key = "can_set_custom_background", boolean = dto.canSetCustomBackground)
        put(key = "can_set_custom_emoji_sticker_set", boolean = dto.canSetCustomEmojiStickerSet)
        put(key = "can_enable_automatic_translation", boolean = dto.canEnableAutomaticTranslation)
        put(key = "can_recognize_speech", boolean = dto.canRecognizeSpeech)
        put(key = "can_disable_sponsored_messages", boolean = dto.canDisableSponsoredMessages)
    }
}

internal fun serialize(dto: ChatBoostFeatures): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatBoostFeatures")
        put(key = "features", objects = dto.features) { data -> serialize(dto = data) }
        put(key = "min_profile_background_custom_emoji_boost_level", int = dto.minProfileBackgroundCustomEmojiBoostLevel)
        put(key = "min_background_custom_emoji_boost_level", int = dto.minBackgroundCustomEmojiBoostLevel)
        put(key = "min_emoji_status_boost_level", int = dto.minEmojiStatusBoostLevel)
        put(key = "min_chat_theme_background_boost_level", int = dto.minChatThemeBackgroundBoostLevel)
        put(key = "min_custom_background_boost_level", int = dto.minCustomBackgroundBoostLevel)
        put(key = "min_custom_emoji_sticker_set_boost_level", int = dto.minCustomEmojiStickerSetBoostLevel)
        put(key = "min_automatic_translation_boost_level", int = dto.minAutomaticTranslationBoostLevel)
        put(key = "min_speech_recognition_boost_level", int = dto.minSpeechRecognitionBoostLevel)
        put(key = "min_sponsored_message_disable_boost_level", int = dto.minSponsoredMessageDisableBoostLevel)
    }
}

internal fun serialize(dto: ChatBoostSourceGiftCode): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatBoostSourceGiftCode")
        put(key = "user_id", long = dto.userId)
        put(key = "gift_code", string = dto.giftCode)
    }
}

internal fun serialize(dto: ChatBoostSourceGiveaway): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatBoostSourceGiveaway")
        put(key = "user_id", long = dto.userId)
        put(key = "gift_code", string = dto.giftCode)
        put(key = "star_count", long = dto.starCount)
        put(key = "giveaway_message_id", long = dto.giveawayMessageId)
        put(key = "is_unclaimed", boolean = dto.isUnclaimed)
    }
}

internal fun serialize(dto: ChatBoostSourcePremium): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatBoostSourcePremium")
        put(key = "user_id", long = dto.userId)
    }
}

internal fun serialize(dto: PrepaidGiveaway): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "prepaidGiveaway")
        put(key = "id", long = dto.id)
        put(key = "winner_count", int = dto.winnerCount)
        put(key = "prize", value = dto.prize) { data -> serialize(dto = data) }
        put(key = "boost_count", int = dto.boostCount)
        put(key = "payment_date", int = dto.paymentDate)
    }
}

internal fun serialize(dto: ChatBoostStatus): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatBoostStatus")
        put(key = "boost_url", string = dto.boostUrl)
        put(key = "applied_slot_ids", ints = dto.appliedSlotIds)
        put(key = "level", int = dto.level)
        put(key = "gift_code_boost_count", int = dto.giftCodeBoostCount)
        put(key = "boost_count", int = dto.boostCount)
        put(key = "current_level_boost_count", int = dto.currentLevelBoostCount)
        put(key = "next_level_boost_count", int = dto.nextLevelBoostCount)
        put(key = "premium_member_count", int = dto.premiumMemberCount)
        put(key = "premium_member_percentage", double = dto.premiumMemberPercentage)
        put(key = "prepaid_giveaways", objects = dto.prepaidGiveaways) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatBoost): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatBoost")
        put(key = "id", string = dto.id)
        put(key = "count", int = dto.count)
        put(key = "source", value = dto.source) { data -> serialize(dto = data) }
        put(key = "start_date", int = dto.startDate)
        put(key = "expiration_date", int = dto.expirationDate)
    }
}

internal fun serialize(dto: FoundChatBoosts): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "foundChatBoosts")
        put(key = "total_count", int = dto.totalCount)
        put(key = "boosts", objects = dto.boosts) { data -> serialize(dto = data) }
        put(key = "next_offset", string = dto.nextOffset)
    }
}

internal fun serialize(dto: ChatBoostSlot): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatBoostSlot")
        put(key = "slot_id", int = dto.slotId)
        put(key = "currently_boosted_chat_id", long = dto.currentlyBoostedChatId)
        put(key = "start_date", int = dto.startDate)
        put(key = "expiration_date", int = dto.expirationDate)
        put(key = "cooldown_until_date", int = dto.cooldownUntilDate)
    }
}

internal fun serialize(dto: ChatBoostSlots): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatBoostSlots")
        put(key = "slots", objects = dto.slots) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ResendCodeReasonUserRequest): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "resendCodeReasonUserRequest")
    }
}

internal fun serialize(dto: ResendCodeReasonVerificationFailed): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "resendCodeReasonVerificationFailed")
        put(key = "error_message", string = dto.errorMessage)
    }
}

internal fun serialize(dto: CallDiscardReasonEmpty): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "callDiscardReasonEmpty")
    }
}

internal fun serialize(dto: CallDiscardReasonMissed): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "callDiscardReasonMissed")
    }
}

internal fun serialize(dto: CallDiscardReasonDeclined): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "callDiscardReasonDeclined")
    }
}

internal fun serialize(dto: CallDiscardReasonDisconnected): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "callDiscardReasonDisconnected")
    }
}

internal fun serialize(dto: CallDiscardReasonHungUp): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "callDiscardReasonHungUp")
    }
}

internal fun serialize(dto: CallDiscardReasonUpgradeToGroupCall): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "callDiscardReasonUpgradeToGroupCall")
        put(key = "invite_link", string = dto.inviteLink)
    }
}

internal fun serialize(dto: CallProtocol): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "callProtocol")
        put(key = "udp_p2p", boolean = dto.udpP2p)
        put(key = "udp_reflector", boolean = dto.udpReflector)
        put(key = "min_layer", int = dto.minLayer)
        put(key = "max_layer", int = dto.maxLayer)
        put(key = "library_versions", strings = dto.libraryVersions)
    }
}

internal fun serialize(dto: CallServerTypeTelegramReflector): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "callServerTypeTelegramReflector")
        put(key = "peer_tag", bytes = dto.peerTag)
        put(key = "is_tcp", boolean = dto.isTcp)
    }
}

internal fun serialize(dto: CallServerTypeWebrtc): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "callServerTypeWebrtc")
        put(key = "username", string = dto.username)
        put(key = "password", string = dto.password)
        put(key = "supports_turn", boolean = dto.supportsTurn)
        put(key = "supports_stun", boolean = dto.supportsStun)
    }
}

internal fun serialize(dto: CallServer): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "callServer")
        put(key = "id", long = dto.id)
        put(key = "ip_address", string = dto.ipAddress)
        put(key = "ipv6_address", string = dto.ipv6Address)
        put(key = "port", int = dto.port)
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: CallId): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "callId")
        put(key = "id", int = dto.id)
    }
}

internal fun serialize(dto: GroupCallId): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "groupCallId")
        put(key = "id", int = dto.id)
    }
}

internal fun serialize(dto: InputCallDiscarded): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputCallDiscarded")
        put(key = "call_id", int = dto.callId)
    }
}

internal fun serialize(dto: InputCallFromMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputCallFromMessage")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_id", long = dto.messageId)
    }
}

internal fun serialize(dto: CallStatePending): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "callStatePending")
        put(key = "is_created", boolean = dto.isCreated)
        put(key = "is_received", boolean = dto.isReceived)
    }
}

internal fun serialize(dto: CallStateExchangingKeys): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "callStateExchangingKeys")
    }
}

internal fun serialize(dto: CallStateReady): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "callStateReady")
        put(key = "protocol", value = dto.protocol) { data -> serialize(dto = data) }
        put(key = "servers", objects = dto.servers) { data -> serialize(dto = data) }
        put(key = "config", string = dto.config)
        put(key = "encryption_key", bytes = dto.encryptionKey)
        put(key = "emojis", strings = dto.emojis)
        put(key = "allow_p2p", boolean = dto.allowP2p)
        put(key = "is_group_call_supported", boolean = dto.isGroupCallSupported)
        put(key = "custom_parameters", string = dto.customParameters)
    }
}

internal fun serialize(dto: CallStateHangingUp): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "callStateHangingUp")
    }
}

internal fun serialize(dto: CallStateDiscarded): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "callStateDiscarded")
        put(key = "reason", value = dto.reason) { data -> serialize(dto = data) }
        put(key = "need_rating", boolean = dto.needRating)
        put(key = "need_debug_information", boolean = dto.needDebugInformation)
        put(key = "need_log", boolean = dto.needLog)
    }
}

internal fun serialize(dto: CallStateError): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "callStateError")
        put(key = "error", value = dto.error) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: GroupCallJoinParameters): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "groupCallJoinParameters")
        put(key = "audio_source_id", int = dto.audioSourceId)
        put(key = "payload", string = dto.payload)
        put(key = "is_muted", boolean = dto.isMuted)
        put(key = "is_my_video_enabled", boolean = dto.isMyVideoEnabled)
    }
}

internal fun serialize(dto: GroupCallVideoQualityThumbnail): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "groupCallVideoQualityThumbnail")
    }
}

internal fun serialize(dto: GroupCallVideoQualityMedium): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "groupCallVideoQualityMedium")
    }
}

internal fun serialize(dto: GroupCallVideoQualityFull): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "groupCallVideoQualityFull")
    }
}

internal fun serialize(dto: GroupCallStream): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "groupCallStream")
        put(key = "channel_id", int = dto.channelId)
        put(key = "scale", int = dto.scale)
        put(key = "time_offset", long = dto.timeOffset)
    }
}

internal fun serialize(dto: GroupCallStreams): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "groupCallStreams")
        put(key = "streams", objects = dto.streams) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: RtmpUrl): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "rtmpUrl")
        put(key = "url", string = dto.url)
        put(key = "stream_key", string = dto.streamKey)
    }
}

internal fun serialize(dto: GroupCallRecentSpeaker): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "groupCallRecentSpeaker")
        put(key = "participant_id", value = dto.participantId) { data -> serialize(dto = data) }
        put(key = "is_speaking", boolean = dto.isSpeaking)
    }
}

internal fun serialize(dto: GroupCall): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "groupCall")
        put(key = "id", int = dto.id)
        put(key = "unique_id", long = dto.uniqueId)
        put(key = "title", string = dto.title)
        put(key = "invite_link", string = dto.inviteLink)
        put(key = "paid_message_star_count", long = dto.paidMessageStarCount)
        put(key = "scheduled_start_date", int = dto.scheduledStartDate)
        put(key = "enabled_start_notification", boolean = dto.enabledStartNotification)
        put(key = "is_active", boolean = dto.isActive)
        put(key = "is_video_chat", boolean = dto.isVideoChat)
        put(key = "is_live_story", boolean = dto.isLiveStory)
        put(key = "is_rtmp_stream", boolean = dto.isRtmpStream)
        put(key = "is_joined", boolean = dto.isJoined)
        put(key = "need_rejoin", boolean = dto.needRejoin)
        put(key = "is_owned", boolean = dto.isOwned)
        put(key = "can_be_managed", boolean = dto.canBeManaged)
        put(key = "participant_count", int = dto.participantCount)
        put(key = "has_hidden_listeners", boolean = dto.hasHiddenListeners)
        put(key = "loaded_all_participants", boolean = dto.loadedAllParticipants)
        put(key = "message_sender_id", value = dto.messageSenderId) { data -> serialize(dto = data) }
        put(key = "recent_speakers", objects = dto.recentSpeakers) { data -> serialize(dto = data) }
        put(key = "is_my_video_enabled", boolean = dto.isMyVideoEnabled)
        put(key = "is_my_video_paused", boolean = dto.isMyVideoPaused)
        put(key = "can_enable_video", boolean = dto.canEnableVideo)
        put(key = "mute_new_participants", boolean = dto.muteNewParticipants)
        put(key = "can_toggle_mute_new_participants", boolean = dto.canToggleMuteNewParticipants)
        put(key = "can_send_messages", boolean = dto.canSendMessages)
        put(key = "are_messages_allowed", boolean = dto.areMessagesAllowed)
        put(key = "can_toggle_are_messages_allowed", boolean = dto.canToggleAreMessagesAllowed)
        put(key = "can_delete_messages", boolean = dto.canDeleteMessages)
        put(key = "record_duration", int = dto.recordDuration)
        put(key = "is_video_recorded", boolean = dto.isVideoRecorded)
        put(key = "duration", int = dto.duration)
    }
}

internal fun serialize(dto: GroupCallVideoSourceGroup): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "groupCallVideoSourceGroup")
        put(key = "semantics", string = dto.semantics)
        put(key = "source_ids", ints = dto.sourceIds)
    }
}

internal fun serialize(dto: GroupCallParticipantVideoInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "groupCallParticipantVideoInfo")
        put(key = "source_groups", objects = dto.sourceGroups) { data -> serialize(dto = data) }
        put(key = "endpoint_id", string = dto.endpointId)
        put(key = "is_paused", boolean = dto.isPaused)
    }
}

internal fun serialize(dto: GroupCallParticipant): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "groupCallParticipant")
        put(key = "participant_id", value = dto.participantId) { data -> serialize(dto = data) }
        put(key = "audio_source_id", int = dto.audioSourceId)
        put(key = "screen_sharing_audio_source_id", int = dto.screenSharingAudioSourceId)
        put(key = "video_info", value = dto.videoInfo) { data -> serialize(dto = data) }
        put(key = "screen_sharing_video_info", value = dto.screenSharingVideoInfo) { data -> serialize(dto = data) }
        put(key = "bio", string = dto.bio)
        put(key = "is_current_user", boolean = dto.isCurrentUser)
        put(key = "is_speaking", boolean = dto.isSpeaking)
        put(key = "is_hand_raised", boolean = dto.isHandRaised)
        put(key = "can_be_muted_for_all_users", boolean = dto.canBeMutedForAllUsers)
        put(key = "can_be_unmuted_for_all_users", boolean = dto.canBeUnmutedForAllUsers)
        put(key = "can_be_muted_for_current_user", boolean = dto.canBeMutedForCurrentUser)
        put(key = "can_be_unmuted_for_current_user", boolean = dto.canBeUnmutedForCurrentUser)
        put(key = "is_muted_for_all_users", boolean = dto.isMutedForAllUsers)
        put(key = "is_muted_for_current_user", boolean = dto.isMutedForCurrentUser)
        put(key = "can_unmute_self", boolean = dto.canUnmuteSelf)
        put(key = "volume_level", int = dto.volumeLevel)
        put(key = "order", string = dto.order)
    }
}

internal fun serialize(dto: GroupCallParticipants): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "groupCallParticipants")
        put(key = "total_count", int = dto.totalCount)
        put(key = "participant_ids", objects = dto.participantIds) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: GroupCallInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "groupCallInfo")
        put(key = "group_call_id", int = dto.groupCallId)
        put(key = "join_payload", string = dto.joinPayload)
    }
}

internal fun serialize(dto: GroupCallMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "groupCallMessage")
        put(key = "message_id", int = dto.messageId)
        put(key = "sender_id", value = dto.senderId) { data -> serialize(dto = data) }
        put(key = "date", int = dto.date)
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "paid_message_star_count", long = dto.paidMessageStarCount)
        put(key = "is_from_owner", boolean = dto.isFromOwner)
        put(key = "can_be_deleted", boolean = dto.canBeDeleted)
    }
}

internal fun serialize(dto: GroupCallMessageLevel): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "groupCallMessageLevel")
        put(key = "min_star_count", long = dto.minStarCount)
        put(key = "pin_duration", int = dto.pinDuration)
        put(key = "max_text_length", int = dto.maxTextLength)
        put(key = "max_custom_emoji_count", int = dto.maxCustomEmojiCount)
        put(key = "first_color", int = dto.firstColor)
        put(key = "second_color", int = dto.secondColor)
        put(key = "background_color", int = dto.backgroundColor)
    }
}

internal fun serialize(dto: InviteGroupCallParticipantResultUserPrivacyRestricted): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inviteGroupCallParticipantResultUserPrivacyRestricted")
    }
}

internal fun serialize(dto: InviteGroupCallParticipantResultUserAlreadyParticipant): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inviteGroupCallParticipantResultUserAlreadyParticipant")
    }
}

internal fun serialize(dto: InviteGroupCallParticipantResultUserWasBanned): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inviteGroupCallParticipantResultUserWasBanned")
    }
}

internal fun serialize(dto: InviteGroupCallParticipantResultSuccess): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inviteGroupCallParticipantResultSuccess")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_id", long = dto.messageId)
    }
}

internal fun serialize(dto: GroupCallDataChannelMain): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "groupCallDataChannelMain")
    }
}

internal fun serialize(dto: GroupCallDataChannelScreenSharing): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "groupCallDataChannelScreenSharing")
    }
}

internal fun serialize(dto: InputGroupCallLink): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputGroupCallLink")
        put(key = "link", string = dto.link)
    }
}

internal fun serialize(dto: InputGroupCallMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputGroupCallMessage")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_id", long = dto.messageId)
    }
}

internal fun serialize(dto: CallProblemEcho): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "callProblemEcho")
    }
}

internal fun serialize(dto: CallProblemNoise): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "callProblemNoise")
    }
}

internal fun serialize(dto: CallProblemInterruptions): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "callProblemInterruptions")
    }
}

internal fun serialize(dto: CallProblemDistortedSpeech): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "callProblemDistortedSpeech")
    }
}

internal fun serialize(dto: CallProblemSilentLocal): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "callProblemSilentLocal")
    }
}

internal fun serialize(dto: CallProblemSilentRemote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "callProblemSilentRemote")
    }
}

internal fun serialize(dto: CallProblemDropped): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "callProblemDropped")
    }
}

internal fun serialize(dto: CallProblemDistortedVideo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "callProblemDistortedVideo")
    }
}

internal fun serialize(dto: CallProblemPixelatedVideo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "callProblemPixelatedVideo")
    }
}

internal fun serialize(dto: Call): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "call")
        put(key = "id", int = dto.id)
        put(key = "unique_id", long = dto.uniqueId)
        put(key = "user_id", long = dto.userId)
        put(key = "is_outgoing", boolean = dto.isOutgoing)
        put(key = "is_video", boolean = dto.isVideo)
        put(key = "state", value = dto.state) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: FirebaseAuthenticationSettingsAndroid): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "firebaseAuthenticationSettingsAndroid")
    }
}

internal fun serialize(dto: FirebaseAuthenticationSettingsIos): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "firebaseAuthenticationSettingsIos")
        put(key = "device_token", string = dto.deviceToken)
        put(key = "is_app_sandbox", boolean = dto.isAppSandbox)
    }
}

internal fun serialize(dto: PhoneNumberAuthenticationSettings): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "phoneNumberAuthenticationSettings")
        put(key = "allow_flash_call", boolean = dto.allowFlashCall)
        put(key = "allow_missed_call", boolean = dto.allowMissedCall)
        put(key = "is_current_phone_number", boolean = dto.isCurrentPhoneNumber)
        put(key = "has_unknown_phone_number", boolean = dto.hasUnknownPhoneNumber)
        put(key = "allow_sms_retriever_api", boolean = dto.allowSmsRetrieverApi)
        put(key = "firebase_authentication_settings", value = dto.firebaseAuthenticationSettings) { data -> serialize(dto = data) }
        put(key = "authentication_tokens", strings = dto.authenticationTokens)
    }
}

internal fun serialize(dto: AddedReaction): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "addedReaction")
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
        put(key = "sender_id", value = dto.senderId) { data -> serialize(dto = data) }
        put(key = "is_outgoing", boolean = dto.isOutgoing)
        put(key = "date", int = dto.date)
    }
}

internal fun serialize(dto: AddedReactions): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "addedReactions")
        put(key = "total_count", int = dto.totalCount)
        put(key = "reactions", objects = dto.reactions) { data -> serialize(dto = data) }
        put(key = "next_offset", string = dto.nextOffset)
    }
}

internal fun serialize(dto: AvailableReaction): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "availableReaction")
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
        put(key = "needs_premium", boolean = dto.needsPremium)
    }
}

internal fun serialize(dto: AvailableReactions): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "availableReactions")
        put(key = "top_reactions", objects = dto.topReactions) { data -> serialize(dto = data) }
        put(key = "recent_reactions", objects = dto.recentReactions) { data -> serialize(dto = data) }
        put(key = "popular_reactions", objects = dto.popularReactions) { data -> serialize(dto = data) }
        put(key = "allow_custom_emoji", boolean = dto.allowCustomEmoji)
        put(key = "are_tags", boolean = dto.areTags)
        put(key = "unavailability_reason", value = dto.unavailabilityReason) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: EmojiReaction): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "emojiReaction")
        put(key = "emoji", string = dto.emoji)
        put(key = "title", string = dto.title)
        put(key = "is_active", boolean = dto.isActive)
        put(key = "static_icon", value = dto.staticIcon) { data -> serialize(dto = data) }
        put(key = "appear_animation", value = dto.appearAnimation) { data -> serialize(dto = data) }
        put(key = "select_animation", value = dto.selectAnimation) { data -> serialize(dto = data) }
        put(key = "activate_animation", value = dto.activateAnimation) { data -> serialize(dto = data) }
        put(key = "effect_animation", value = dto.effectAnimation) { data -> serialize(dto = data) }
        put(key = "around_animation", value = dto.aroundAnimation) { data -> serialize(dto = data) }
        put(key = "center_animation", value = dto.centerAnimation) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ReactionUnavailabilityReasonAnonymousAdministrator): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reactionUnavailabilityReasonAnonymousAdministrator")
    }
}

internal fun serialize(dto: ReactionUnavailabilityReasonGuest): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reactionUnavailabilityReasonGuest")
    }
}

internal fun serialize(dto: ReactionUnavailabilityReasonRestricted): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reactionUnavailabilityReasonRestricted")
    }
}

internal fun serialize(dto: Animations): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "animations")
        put(key = "animations", objects = dto.animations) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: DiceStickersRegular): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "diceStickersRegular")
        put(key = "sticker", value = dto.sticker) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: DiceStickersSlotMachine): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "diceStickersSlotMachine")
        put(key = "background", value = dto.background) { data -> serialize(dto = data) }
        put(key = "lever", value = dto.lever) { data -> serialize(dto = data) }
        put(key = "left_reel", value = dto.leftReel) { data -> serialize(dto = data) }
        put(key = "center_reel", value = dto.centerReel) { data -> serialize(dto = data) }
        put(key = "right_reel", value = dto.rightReel) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ImportedContact): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "importedContact")
        put(key = "phone_number", string = dto.phoneNumber)
        put(key = "first_name", string = dto.firstName)
        put(key = "last_name", string = dto.lastName)
        put(key = "note", value = dto.note) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ImportedContacts): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "importedContacts")
        put(key = "user_ids", longs = dto.userIds)
        put(key = "importer_count", ints = dto.importerCount)
    }
}

internal fun serialize(dto: SpeechRecognitionResultPending): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "speechRecognitionResultPending")
        put(key = "partial_text", string = dto.partialText)
    }
}

internal fun serialize(dto: SpeechRecognitionResultText): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "speechRecognitionResultText")
        put(key = "text", string = dto.text)
    }
}

internal fun serialize(dto: SpeechRecognitionResultError): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "speechRecognitionResultError")
        put(key = "error", value = dto.error) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: BusinessConnection): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessConnection")
        put(key = "id", string = dto.id)
        put(key = "user_id", long = dto.userId)
        put(key = "user_chat_id", long = dto.userChatId)
        put(key = "date", int = dto.date)
        put(key = "rights", value = dto.rights) { data -> serialize(dto = data) }
        put(key = "is_enabled", boolean = dto.isEnabled)
    }
}

internal fun serialize(dto: AttachmentMenuBotColor): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "attachmentMenuBotColor")
        put(key = "light_color", int = dto.lightColor)
        put(key = "dark_color", int = dto.darkColor)
    }
}

internal fun serialize(dto: AttachmentMenuBot): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "attachmentMenuBot")
        put(key = "bot_user_id", long = dto.botUserId)
        put(key = "supports_self_chat", boolean = dto.supportsSelfChat)
        put(key = "supports_user_chats", boolean = dto.supportsUserChats)
        put(key = "supports_bot_chats", boolean = dto.supportsBotChats)
        put(key = "supports_group_chats", boolean = dto.supportsGroupChats)
        put(key = "supports_channel_chats", boolean = dto.supportsChannelChats)
        put(key = "request_write_access", boolean = dto.requestWriteAccess)
        put(key = "is_added", boolean = dto.isAdded)
        put(key = "show_in_attachment_menu", boolean = dto.showInAttachmentMenu)
        put(key = "show_in_side_menu", boolean = dto.showInSideMenu)
        put(key = "show_disclaimer_in_side_menu", boolean = dto.showDisclaimerInSideMenu)
        put(key = "name", string = dto.name)
        put(key = "name_color", value = dto.nameColor) { data -> serialize(dto = data) }
        put(key = "default_icon", value = dto.defaultIcon) { data -> serialize(dto = data) }
        put(key = "ios_static_icon", value = dto.iosStaticIcon) { data -> serialize(dto = data) }
        put(key = "ios_animated_icon", value = dto.iosAnimatedIcon) { data -> serialize(dto = data) }
        put(key = "ios_side_menu_icon", value = dto.iosSideMenuIcon) { data -> serialize(dto = data) }
        put(key = "android_icon", value = dto.androidIcon) { data -> serialize(dto = data) }
        put(key = "android_side_menu_icon", value = dto.androidSideMenuIcon) { data -> serialize(dto = data) }
        put(key = "macos_icon", value = dto.macosIcon) { data -> serialize(dto = data) }
        put(key = "macos_side_menu_icon", value = dto.macosSideMenuIcon) { data -> serialize(dto = data) }
        put(key = "icon_color", value = dto.iconColor) { data -> serialize(dto = data) }
        put(key = "web_app_placeholder", value = dto.webAppPlaceholder) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: BotWriteAccessAllowReasonConnectedWebsite): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "botWriteAccessAllowReasonConnectedWebsite")
        put(key = "domain_name", string = dto.domainName)
    }
}

internal fun serialize(dto: BotWriteAccessAllowReasonAddedToAttachmentMenu): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "botWriteAccessAllowReasonAddedToAttachmentMenu")
    }
}

internal fun serialize(dto: BotWriteAccessAllowReasonLaunchedWebApp): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "botWriteAccessAllowReasonLaunchedWebApp")
        put(key = "web_app", value = dto.webApp) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: BotWriteAccessAllowReasonAcceptedRequest): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "botWriteAccessAllowReasonAcceptedRequest")
    }
}

internal fun serialize(dto: HttpUrl): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "httpUrl")
        put(key = "url", string = dto.url)
    }
}

internal fun serialize(dto: UserLink): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userLink")
        put(key = "url", string = dto.url)
        put(key = "expires_in", int = dto.expiresIn)
    }
}

internal fun serialize(dto: TargetChatTypes): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "targetChatTypes")
        put(key = "allow_user_chats", boolean = dto.allowUserChats)
        put(key = "allow_bot_chats", boolean = dto.allowBotChats)
        put(key = "allow_group_chats", boolean = dto.allowGroupChats)
        put(key = "allow_channel_chats", boolean = dto.allowChannelChats)
    }
}

internal fun serialize(dto: TargetChatCurrent): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "targetChatCurrent")
    }
}

internal fun serialize(dto: TargetChatChosen): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "targetChatChosen")
        put(key = "types", value = dto.types) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: TargetChatInternalLink): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "targetChatInternalLink")
        put(key = "link", value = dto.link) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputInlineQueryResultAnimation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputInlineQueryResultAnimation")
        put(key = "id", string = dto.id)
        put(key = "title", string = dto.title)
        put(key = "thumbnail_url", string = dto.thumbnailUrl)
        put(key = "thumbnail_mime_type", string = dto.thumbnailMimeType)
        put(key = "video_url", string = dto.videoUrl)
        put(key = "video_mime_type", string = dto.videoMimeType)
        put(key = "video_duration", int = dto.videoDuration)
        put(key = "video_width", int = dto.videoWidth)
        put(key = "video_height", int = dto.videoHeight)
        put(key = "reply_markup", value = dto.replyMarkup) { data -> serialize(dto = data) }
        put(key = "input_message_content", value = dto.inputMessageContent) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputInlineQueryResultArticle): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputInlineQueryResultArticle")
        put(key = "id", string = dto.id)
        put(key = "url", string = dto.url)
        put(key = "title", string = dto.title)
        put(key = "description", string = dto.description)
        put(key = "thumbnail_url", string = dto.thumbnailUrl)
        put(key = "thumbnail_width", int = dto.thumbnailWidth)
        put(key = "thumbnail_height", int = dto.thumbnailHeight)
        put(key = "reply_markup", value = dto.replyMarkup) { data -> serialize(dto = data) }
        put(key = "input_message_content", value = dto.inputMessageContent) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputInlineQueryResultAudio): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputInlineQueryResultAudio")
        put(key = "id", string = dto.id)
        put(key = "title", string = dto.title)
        put(key = "performer", string = dto.performer)
        put(key = "audio_url", string = dto.audioUrl)
        put(key = "audio_duration", int = dto.audioDuration)
        put(key = "reply_markup", value = dto.replyMarkup) { data -> serialize(dto = data) }
        put(key = "input_message_content", value = dto.inputMessageContent) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputInlineQueryResultContact): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputInlineQueryResultContact")
        put(key = "id", string = dto.id)
        put(key = "contact", value = dto.contact) { data -> serialize(dto = data) }
        put(key = "thumbnail_url", string = dto.thumbnailUrl)
        put(key = "thumbnail_width", int = dto.thumbnailWidth)
        put(key = "thumbnail_height", int = dto.thumbnailHeight)
        put(key = "reply_markup", value = dto.replyMarkup) { data -> serialize(dto = data) }
        put(key = "input_message_content", value = dto.inputMessageContent) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputInlineQueryResultDocument): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputInlineQueryResultDocument")
        put(key = "id", string = dto.id)
        put(key = "title", string = dto.title)
        put(key = "description", string = dto.description)
        put(key = "document_url", string = dto.documentUrl)
        put(key = "mime_type", string = dto.mimeType)
        put(key = "thumbnail_url", string = dto.thumbnailUrl)
        put(key = "thumbnail_width", int = dto.thumbnailWidth)
        put(key = "thumbnail_height", int = dto.thumbnailHeight)
        put(key = "reply_markup", value = dto.replyMarkup) { data -> serialize(dto = data) }
        put(key = "input_message_content", value = dto.inputMessageContent) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputInlineQueryResultGame): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputInlineQueryResultGame")
        put(key = "id", string = dto.id)
        put(key = "game_short_name", string = dto.gameShortName)
        put(key = "reply_markup", value = dto.replyMarkup) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputInlineQueryResultLocation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputInlineQueryResultLocation")
        put(key = "id", string = dto.id)
        put(key = "location", value = dto.location) { data -> serialize(dto = data) }
        put(key = "live_period", int = dto.livePeriod)
        put(key = "title", string = dto.title)
        put(key = "thumbnail_url", string = dto.thumbnailUrl)
        put(key = "thumbnail_width", int = dto.thumbnailWidth)
        put(key = "thumbnail_height", int = dto.thumbnailHeight)
        put(key = "reply_markup", value = dto.replyMarkup) { data -> serialize(dto = data) }
        put(key = "input_message_content", value = dto.inputMessageContent) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputInlineQueryResultPhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputInlineQueryResultPhoto")
        put(key = "id", string = dto.id)
        put(key = "title", string = dto.title)
        put(key = "description", string = dto.description)
        put(key = "thumbnail_url", string = dto.thumbnailUrl)
        put(key = "photo_url", string = dto.photoUrl)
        put(key = "photo_width", int = dto.photoWidth)
        put(key = "photo_height", int = dto.photoHeight)
        put(key = "reply_markup", value = dto.replyMarkup) { data -> serialize(dto = data) }
        put(key = "input_message_content", value = dto.inputMessageContent) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputInlineQueryResultSticker): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputInlineQueryResultSticker")
        put(key = "id", string = dto.id)
        put(key = "thumbnail_url", string = dto.thumbnailUrl)
        put(key = "sticker_url", string = dto.stickerUrl)
        put(key = "sticker_width", int = dto.stickerWidth)
        put(key = "sticker_height", int = dto.stickerHeight)
        put(key = "reply_markup", value = dto.replyMarkup) { data -> serialize(dto = data) }
        put(key = "input_message_content", value = dto.inputMessageContent) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputInlineQueryResultVenue): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputInlineQueryResultVenue")
        put(key = "id", string = dto.id)
        put(key = "venue", value = dto.venue) { data -> serialize(dto = data) }
        put(key = "thumbnail_url", string = dto.thumbnailUrl)
        put(key = "thumbnail_width", int = dto.thumbnailWidth)
        put(key = "thumbnail_height", int = dto.thumbnailHeight)
        put(key = "reply_markup", value = dto.replyMarkup) { data -> serialize(dto = data) }
        put(key = "input_message_content", value = dto.inputMessageContent) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputInlineQueryResultVideo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputInlineQueryResultVideo")
        put(key = "id", string = dto.id)
        put(key = "title", string = dto.title)
        put(key = "description", string = dto.description)
        put(key = "thumbnail_url", string = dto.thumbnailUrl)
        put(key = "video_url", string = dto.videoUrl)
        put(key = "mime_type", string = dto.mimeType)
        put(key = "video_width", int = dto.videoWidth)
        put(key = "video_height", int = dto.videoHeight)
        put(key = "video_duration", int = dto.videoDuration)
        put(key = "reply_markup", value = dto.replyMarkup) { data -> serialize(dto = data) }
        put(key = "input_message_content", value = dto.inputMessageContent) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputInlineQueryResultVoiceNote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputInlineQueryResultVoiceNote")
        put(key = "id", string = dto.id)
        put(key = "title", string = dto.title)
        put(key = "voice_note_url", string = dto.voiceNoteUrl)
        put(key = "voice_note_duration", int = dto.voiceNoteDuration)
        put(key = "reply_markup", value = dto.replyMarkup) { data -> serialize(dto = data) }
        put(key = "input_message_content", value = dto.inputMessageContent) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InlineQueryResultArticle): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inlineQueryResultArticle")
        put(key = "id", string = dto.id)
        put(key = "url", string = dto.url)
        put(key = "title", string = dto.title)
        put(key = "description", string = dto.description)
        put(key = "thumbnail", value = dto.thumbnail) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InlineQueryResultContact): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inlineQueryResultContact")
        put(key = "id", string = dto.id)
        put(key = "contact", value = dto.contact) { data -> serialize(dto = data) }
        put(key = "thumbnail", value = dto.thumbnail) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InlineQueryResultLocation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inlineQueryResultLocation")
        put(key = "id", string = dto.id)
        put(key = "location", value = dto.location) { data -> serialize(dto = data) }
        put(key = "title", string = dto.title)
        put(key = "thumbnail", value = dto.thumbnail) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InlineQueryResultVenue): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inlineQueryResultVenue")
        put(key = "id", string = dto.id)
        put(key = "venue", value = dto.venue) { data -> serialize(dto = data) }
        put(key = "thumbnail", value = dto.thumbnail) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InlineQueryResultGame): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inlineQueryResultGame")
        put(key = "id", string = dto.id)
        put(key = "game", value = dto.game) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InlineQueryResultAnimation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inlineQueryResultAnimation")
        put(key = "id", string = dto.id)
        put(key = "animation", value = dto.animation) { data -> serialize(dto = data) }
        put(key = "title", string = dto.title)
    }
}

internal fun serialize(dto: InlineQueryResultAudio): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inlineQueryResultAudio")
        put(key = "id", string = dto.id)
        put(key = "audio", value = dto.audio) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InlineQueryResultDocument): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inlineQueryResultDocument")
        put(key = "id", string = dto.id)
        put(key = "document", value = dto.document) { data -> serialize(dto = data) }
        put(key = "title", string = dto.title)
        put(key = "description", string = dto.description)
    }
}

internal fun serialize(dto: InlineQueryResultPhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inlineQueryResultPhoto")
        put(key = "id", string = dto.id)
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
        put(key = "title", string = dto.title)
        put(key = "description", string = dto.description)
    }
}

internal fun serialize(dto: InlineQueryResultSticker): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inlineQueryResultSticker")
        put(key = "id", string = dto.id)
        put(key = "sticker", value = dto.sticker) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InlineQueryResultVideo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inlineQueryResultVideo")
        put(key = "id", string = dto.id)
        put(key = "video", value = dto.video) { data -> serialize(dto = data) }
        put(key = "title", string = dto.title)
        put(key = "description", string = dto.description)
    }
}

internal fun serialize(dto: InlineQueryResultVoiceNote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inlineQueryResultVoiceNote")
        put(key = "id", string = dto.id)
        put(key = "voice_note", value = dto.voiceNote) { data -> serialize(dto = data) }
        put(key = "title", string = dto.title)
    }
}

internal fun serialize(dto: InlineQueryResultsButtonTypeStartBot): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inlineQueryResultsButtonTypeStartBot")
        put(key = "parameter", string = dto.parameter)
    }
}

internal fun serialize(dto: InlineQueryResultsButtonTypeWebApp): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inlineQueryResultsButtonTypeWebApp")
        put(key = "url", string = dto.url)
    }
}

internal fun serialize(dto: InlineQueryResultsButton): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inlineQueryResultsButton")
        put(key = "text", string = dto.text)
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InlineQueryResults): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inlineQueryResults")
        put(key = "inline_query_id", long = dto.inlineQueryId)
        put(key = "button", value = dto.button) { data -> serialize(dto = data) }
        put(key = "results", objects = dto.results) { data -> serialize(dto = data) }
        put(key = "next_offset", string = dto.nextOffset)
    }
}

internal fun serialize(dto: InlineMessageId): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inlineMessageId")
        put(key = "id", string = dto.id)
    }
}

internal fun serialize(dto: PreparedInlineMessageId): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "preparedInlineMessageId")
        put(key = "id", string = dto.id)
        put(key = "expiration_date", int = dto.expirationDate)
    }
}

internal fun serialize(dto: PreparedInlineMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "preparedInlineMessage")
        put(key = "inline_query_id", long = dto.inlineQueryId)
        put(key = "result", value = dto.result) { data -> serialize(dto = data) }
        put(key = "chat_types", value = dto.chatTypes) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: CallbackQueryPayloadData): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "callbackQueryPayloadData")
        put(key = "data", bytes = dto.data)
    }
}

internal fun serialize(dto: CallbackQueryPayloadDataWithPassword): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "callbackQueryPayloadDataWithPassword")
        put(key = "password", string = dto.password)
        put(key = "data", bytes = dto.data)
    }
}

internal fun serialize(dto: CallbackQueryPayloadGame): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "callbackQueryPayloadGame")
        put(key = "game_short_name", string = dto.gameShortName)
    }
}

internal fun serialize(dto: CallbackQueryAnswer): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "callbackQueryAnswer")
        put(key = "text", string = dto.text)
        put(key = "show_alert", boolean = dto.showAlert)
        put(key = "url", string = dto.url)
    }
}

internal fun serialize(dto: CustomRequestResult): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "customRequestResult")
        put(key = "result", string = dto.result)
    }
}

internal fun serialize(dto: GameHighScore): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "gameHighScore")
        put(key = "position", int = dto.position)
        put(key = "user_id", long = dto.userId)
        put(key = "score", int = dto.score)
    }
}

internal fun serialize(dto: GameHighScores): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "gameHighScores")
        put(key = "scores", objects = dto.scores) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatEventMessageEdited): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventMessageEdited")
        put(key = "old_message", value = dto.oldMessage) { data -> serialize(dto = data) }
        put(key = "new_message", value = dto.newMessage) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatEventMessageDeleted): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventMessageDeleted")
        put(key = "message", value = dto.message) { data -> serialize(dto = data) }
        put(key = "can_report_anti_spam_false_positive", boolean = dto.canReportAntiSpamFalsePositive)
    }
}

internal fun serialize(dto: ChatEventMessagePinned): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventMessagePinned")
        put(key = "message", value = dto.message) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatEventMessageUnpinned): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventMessageUnpinned")
        put(key = "message", value = dto.message) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatEventPollStopped): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventPollStopped")
        put(key = "message", value = dto.message) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatEventMemberJoined): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventMemberJoined")
    }
}

internal fun serialize(dto: ChatEventMemberJoinedByInviteLink): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventMemberJoinedByInviteLink")
        put(key = "invite_link", value = dto.inviteLink) { data -> serialize(dto = data) }
        put(key = "via_chat_folder_invite_link", boolean = dto.viaChatFolderInviteLink)
    }
}

internal fun serialize(dto: ChatEventMemberJoinedByRequest): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventMemberJoinedByRequest")
        put(key = "approver_user_id", long = dto.approverUserId)
        put(key = "invite_link", value = dto.inviteLink) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatEventMemberInvited): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventMemberInvited")
        put(key = "user_id", long = dto.userId)
        put(key = "status", value = dto.status) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatEventMemberLeft): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventMemberLeft")
    }
}

internal fun serialize(dto: ChatEventMemberPromoted): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventMemberPromoted")
        put(key = "user_id", long = dto.userId)
        put(key = "old_status", value = dto.oldStatus) { data -> serialize(dto = data) }
        put(key = "new_status", value = dto.newStatus) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatEventMemberRestricted): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventMemberRestricted")
        put(key = "member_id", value = dto.memberId) { data -> serialize(dto = data) }
        put(key = "old_status", value = dto.oldStatus) { data -> serialize(dto = data) }
        put(key = "new_status", value = dto.newStatus) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatEventMemberTagChanged): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventMemberTagChanged")
        put(key = "user_id", long = dto.userId)
        put(key = "old_tag", string = dto.oldTag)
        put(key = "new_tag", string = dto.newTag)
    }
}

internal fun serialize(dto: ChatEventMemberSubscriptionExtended): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventMemberSubscriptionExtended")
        put(key = "user_id", long = dto.userId)
        put(key = "old_status", value = dto.oldStatus) { data -> serialize(dto = data) }
        put(key = "new_status", value = dto.newStatus) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatEventAvailableReactionsChanged): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventAvailableReactionsChanged")
        put(key = "old_available_reactions", value = dto.oldAvailableReactions) { data -> serialize(dto = data) }
        put(key = "new_available_reactions", value = dto.newAvailableReactions) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatEventBackgroundChanged): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventBackgroundChanged")
        put(key = "old_background", value = dto.oldBackground) { data -> serialize(dto = data) }
        put(key = "new_background", value = dto.newBackground) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatEventDescriptionChanged): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventDescriptionChanged")
        put(key = "old_description", string = dto.oldDescription)
        put(key = "new_description", string = dto.newDescription)
    }
}

internal fun serialize(dto: ChatEventEmojiStatusChanged): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventEmojiStatusChanged")
        put(key = "old_emoji_status", value = dto.oldEmojiStatus) { data -> serialize(dto = data) }
        put(key = "new_emoji_status", value = dto.newEmojiStatus) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatEventLinkedChatChanged): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventLinkedChatChanged")
        put(key = "old_linked_chat_id", long = dto.oldLinkedChatId)
        put(key = "new_linked_chat_id", long = dto.newLinkedChatId)
    }
}

internal fun serialize(dto: ChatEventLocationChanged): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventLocationChanged")
        put(key = "old_location", value = dto.oldLocation) { data -> serialize(dto = data) }
        put(key = "new_location", value = dto.newLocation) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatEventMessageAutoDeleteTimeChanged): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventMessageAutoDeleteTimeChanged")
        put(key = "old_message_auto_delete_time", int = dto.oldMessageAutoDeleteTime)
        put(key = "new_message_auto_delete_time", int = dto.newMessageAutoDeleteTime)
    }
}

internal fun serialize(dto: ChatEventPermissionsChanged): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventPermissionsChanged")
        put(key = "old_permissions", value = dto.oldPermissions) { data -> serialize(dto = data) }
        put(key = "new_permissions", value = dto.newPermissions) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatEventPhotoChanged): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventPhotoChanged")
        put(key = "old_photo", value = dto.oldPhoto) { data -> serialize(dto = data) }
        put(key = "new_photo", value = dto.newPhoto) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatEventSlowModeDelayChanged): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventSlowModeDelayChanged")
        put(key = "old_slow_mode_delay", int = dto.oldSlowModeDelay)
        put(key = "new_slow_mode_delay", int = dto.newSlowModeDelay)
    }
}

internal fun serialize(dto: ChatEventStickerSetChanged): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventStickerSetChanged")
        put(key = "old_sticker_set_id", long = dto.oldStickerSetId)
        put(key = "new_sticker_set_id", long = dto.newStickerSetId)
    }
}

internal fun serialize(dto: ChatEventCustomEmojiStickerSetChanged): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventCustomEmojiStickerSetChanged")
        put(key = "old_sticker_set_id", long = dto.oldStickerSetId)
        put(key = "new_sticker_set_id", long = dto.newStickerSetId)
    }
}

internal fun serialize(dto: ChatEventTitleChanged): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventTitleChanged")
        put(key = "old_title", string = dto.oldTitle)
        put(key = "new_title", string = dto.newTitle)
    }
}

internal fun serialize(dto: ChatEventUsernameChanged): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventUsernameChanged")
        put(key = "old_username", string = dto.oldUsername)
        put(key = "new_username", string = dto.newUsername)
    }
}

internal fun serialize(dto: ChatEventActiveUsernamesChanged): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventActiveUsernamesChanged")
        put(key = "old_usernames", strings = dto.oldUsernames)
        put(key = "new_usernames", strings = dto.newUsernames)
    }
}

internal fun serialize(dto: ChatEventAccentColorChanged): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventAccentColorChanged")
        put(key = "old_accent_color_id", int = dto.oldAccentColorId)
        put(key = "old_background_custom_emoji_id", long = dto.oldBackgroundCustomEmojiId)
        put(key = "new_accent_color_id", int = dto.newAccentColorId)
        put(key = "new_background_custom_emoji_id", long = dto.newBackgroundCustomEmojiId)
    }
}

internal fun serialize(dto: ChatEventProfileAccentColorChanged): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventProfileAccentColorChanged")
        put(key = "old_profile_accent_color_id", int = dto.oldProfileAccentColorId)
        put(key = "old_profile_background_custom_emoji_id", long = dto.oldProfileBackgroundCustomEmojiId)
        put(key = "new_profile_accent_color_id", int = dto.newProfileAccentColorId)
        put(key = "new_profile_background_custom_emoji_id", long = dto.newProfileBackgroundCustomEmojiId)
    }
}

internal fun serialize(dto: ChatEventHasProtectedContentToggled): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventHasProtectedContentToggled")
        put(key = "has_protected_content", boolean = dto.hasProtectedContent)
    }
}

internal fun serialize(dto: ChatEventInvitesToggled): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventInvitesToggled")
        put(key = "can_invite_users", boolean = dto.canInviteUsers)
    }
}

internal fun serialize(dto: ChatEventIsAllHistoryAvailableToggled): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventIsAllHistoryAvailableToggled")
        put(key = "is_all_history_available", boolean = dto.isAllHistoryAvailable)
    }
}

internal fun serialize(dto: ChatEventHasAggressiveAntiSpamEnabledToggled): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventHasAggressiveAntiSpamEnabledToggled")
        put(key = "has_aggressive_anti_spam_enabled", boolean = dto.hasAggressiveAntiSpamEnabled)
    }
}

internal fun serialize(dto: ChatEventSignMessagesToggled): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventSignMessagesToggled")
        put(key = "sign_messages", boolean = dto.signMessages)
    }
}

internal fun serialize(dto: ChatEventShowMessageSenderToggled): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventShowMessageSenderToggled")
        put(key = "show_message_sender", boolean = dto.showMessageSender)
    }
}

internal fun serialize(dto: ChatEventAutomaticTranslationToggled): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventAutomaticTranslationToggled")
        put(key = "has_automatic_translation", boolean = dto.hasAutomaticTranslation)
    }
}

internal fun serialize(dto: ChatEventInviteLinkEdited): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventInviteLinkEdited")
        put(key = "old_invite_link", value = dto.oldInviteLink) { data -> serialize(dto = data) }
        put(key = "new_invite_link", value = dto.newInviteLink) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatEventInviteLinkRevoked): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventInviteLinkRevoked")
        put(key = "invite_link", value = dto.inviteLink) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatEventInviteLinkDeleted): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventInviteLinkDeleted")
        put(key = "invite_link", value = dto.inviteLink) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatEventVideoChatCreated): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventVideoChatCreated")
        put(key = "group_call_id", int = dto.groupCallId)
    }
}

internal fun serialize(dto: ChatEventVideoChatEnded): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventVideoChatEnded")
        put(key = "group_call_id", int = dto.groupCallId)
    }
}

internal fun serialize(dto: ChatEventVideoChatMuteNewParticipantsToggled): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventVideoChatMuteNewParticipantsToggled")
        put(key = "mute_new_participants", boolean = dto.muteNewParticipants)
    }
}

internal fun serialize(dto: ChatEventVideoChatParticipantIsMutedToggled): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventVideoChatParticipantIsMutedToggled")
        put(key = "participant_id", value = dto.participantId) { data -> serialize(dto = data) }
        put(key = "is_muted", boolean = dto.isMuted)
    }
}

internal fun serialize(dto: ChatEventVideoChatParticipantVolumeLevelChanged): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventVideoChatParticipantVolumeLevelChanged")
        put(key = "participant_id", value = dto.participantId) { data -> serialize(dto = data) }
        put(key = "volume_level", int = dto.volumeLevel)
    }
}

internal fun serialize(dto: ChatEventIsForumToggled): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventIsForumToggled")
        put(key = "is_forum", boolean = dto.isForum)
    }
}

internal fun serialize(dto: ChatEventForumTopicCreated): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventForumTopicCreated")
        put(key = "topic_info", value = dto.topicInfo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatEventForumTopicEdited): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventForumTopicEdited")
        put(key = "old_topic_info", value = dto.oldTopicInfo) { data -> serialize(dto = data) }
        put(key = "new_topic_info", value = dto.newTopicInfo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatEventForumTopicToggleIsClosed): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventForumTopicToggleIsClosed")
        put(key = "topic_info", value = dto.topicInfo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatEventForumTopicToggleIsHidden): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventForumTopicToggleIsHidden")
        put(key = "topic_info", value = dto.topicInfo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatEventForumTopicDeleted): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventForumTopicDeleted")
        put(key = "topic_info", value = dto.topicInfo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatEventForumTopicPinned): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventForumTopicPinned")
        put(key = "old_topic_info", value = dto.oldTopicInfo) { data -> serialize(dto = data) }
        put(key = "new_topic_info", value = dto.newTopicInfo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatEvent): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEvent")
        put(key = "id", long = dto.id)
        put(key = "date", int = dto.date)
        put(key = "member_id", value = dto.memberId) { data -> serialize(dto = data) }
        put(key = "action", value = dto.action) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatEvents): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEvents")
        put(key = "events", objects = dto.events) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatEventLogFilters): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatEventLogFilters")
        put(key = "message_edits", boolean = dto.messageEdits)
        put(key = "message_deletions", boolean = dto.messageDeletions)
        put(key = "message_pins", boolean = dto.messagePins)
        put(key = "member_joins", boolean = dto.memberJoins)
        put(key = "member_leaves", boolean = dto.memberLeaves)
        put(key = "member_invites", boolean = dto.memberInvites)
        put(key = "member_promotions", boolean = dto.memberPromotions)
        put(key = "member_restrictions", boolean = dto.memberRestrictions)
        put(key = "member_tag_changes", boolean = dto.memberTagChanges)
        put(key = "info_changes", boolean = dto.infoChanges)
        put(key = "setting_changes", boolean = dto.settingChanges)
        put(key = "invite_link_changes", boolean = dto.inviteLinkChanges)
        put(key = "video_chat_changes", boolean = dto.videoChatChanges)
        put(key = "forum_changes", boolean = dto.forumChanges)
        put(key = "subscription_extensions", boolean = dto.subscriptionExtensions)
    }
}

internal fun serialize(dto: LanguagePackStringValueOrdinary): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "languagePackStringValueOrdinary")
        put(key = "value", string = dto.value)
    }
}

internal fun serialize(dto: LanguagePackStringValuePluralized): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "languagePackStringValuePluralized")
        put(key = "zero_value", string = dto.zeroValue)
        put(key = "one_value", string = dto.oneValue)
        put(key = "two_value", string = dto.twoValue)
        put(key = "few_value", string = dto.fewValue)
        put(key = "many_value", string = dto.manyValue)
        put(key = "other_value", string = dto.otherValue)
    }
}

internal fun serialize(dto: LanguagePackStringValueDeleted): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "languagePackStringValueDeleted")
    }
}

internal fun serialize(dto: LanguagePackString): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "languagePackString")
        put(key = "key", string = dto.key)
        put(key = "value", value = dto.value) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: LanguagePackStrings): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "languagePackStrings")
        put(key = "strings", objects = dto.strings) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: LanguagePackInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "languagePackInfo")
        put(key = "id", string = dto.id)
        put(key = "base_language_pack_id", string = dto.baseLanguagePackId)
        put(key = "name", string = dto.name)
        put(key = "native_name", string = dto.nativeName)
        put(key = "plural_code", string = dto.pluralCode)
        put(key = "is_official", boolean = dto.isOfficial)
        put(key = "is_rtl", boolean = dto.isRtl)
        put(key = "is_beta", boolean = dto.isBeta)
        put(key = "is_installed", boolean = dto.isInstalled)
        put(key = "total_string_count", int = dto.totalStringCount)
        put(key = "translated_string_count", int = dto.translatedStringCount)
        put(key = "local_string_count", int = dto.localStringCount)
        put(key = "translation_url", string = dto.translationUrl)
    }
}

internal fun serialize(dto: LocalizationTargetInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "localizationTargetInfo")
        put(key = "language_packs", objects = dto.languagePacks) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PremiumLimitTypeSupergroupCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumLimitTypeSupergroupCount")
    }
}

internal fun serialize(dto: PremiumLimitTypePinnedChatCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumLimitTypePinnedChatCount")
    }
}

internal fun serialize(dto: PremiumLimitTypeCreatedPublicChatCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumLimitTypeCreatedPublicChatCount")
    }
}

internal fun serialize(dto: PremiumLimitTypeSavedAnimationCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumLimitTypeSavedAnimationCount")
    }
}

internal fun serialize(dto: PremiumLimitTypeFavoriteStickerCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumLimitTypeFavoriteStickerCount")
    }
}

internal fun serialize(dto: PremiumLimitTypeChatFolderCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumLimitTypeChatFolderCount")
    }
}

internal fun serialize(dto: PremiumLimitTypeChatFolderChosenChatCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumLimitTypeChatFolderChosenChatCount")
    }
}

internal fun serialize(dto: PremiumLimitTypePinnedArchivedChatCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumLimitTypePinnedArchivedChatCount")
    }
}

internal fun serialize(dto: PremiumLimitTypePinnedSavedMessagesTopicCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumLimitTypePinnedSavedMessagesTopicCount")
    }
}

internal fun serialize(dto: PremiumLimitTypeMessageTextLength): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumLimitTypeMessageTextLength")
    }
}

internal fun serialize(dto: PremiumLimitTypeCaptionLength): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumLimitTypeCaptionLength")
    }
}

internal fun serialize(dto: PremiumLimitTypeBioLength): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumLimitTypeBioLength")
    }
}

internal fun serialize(dto: PremiumLimitTypeChatFolderInviteLinkCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumLimitTypeChatFolderInviteLinkCount")
    }
}

internal fun serialize(dto: PremiumLimitTypeShareableChatFolderCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumLimitTypeShareableChatFolderCount")
    }
}

internal fun serialize(dto: PremiumLimitTypeActiveStoryCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumLimitTypeActiveStoryCount")
    }
}

internal fun serialize(dto: PremiumLimitTypeWeeklyPostedStoryCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumLimitTypeWeeklyPostedStoryCount")
    }
}

internal fun serialize(dto: PremiumLimitTypeMonthlyPostedStoryCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumLimitTypeMonthlyPostedStoryCount")
    }
}

internal fun serialize(dto: PremiumLimitTypeStoryCaptionLength): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumLimitTypeStoryCaptionLength")
    }
}

internal fun serialize(dto: PremiumLimitTypeStorySuggestedReactionAreaCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumLimitTypeStorySuggestedReactionAreaCount")
    }
}

internal fun serialize(dto: PremiumLimitTypeSimilarChatCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumLimitTypeSimilarChatCount")
    }
}

internal fun serialize(dto: PremiumLimitTypeOwnedBotCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumLimitTypeOwnedBotCount")
    }
}

internal fun serialize(dto: PremiumLimitTypeCustomTextCompositionStyleCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumLimitTypeCustomTextCompositionStyleCount")
    }
}

internal fun serialize(dto: PremiumFeatureIncreasedLimits): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumFeatureIncreasedLimits")
    }
}

internal fun serialize(dto: PremiumFeatureIncreasedUploadFileSize): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumFeatureIncreasedUploadFileSize")
    }
}

internal fun serialize(dto: PremiumFeatureImprovedDownloadSpeed): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumFeatureImprovedDownloadSpeed")
    }
}

internal fun serialize(dto: PremiumFeatureVoiceRecognition): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumFeatureVoiceRecognition")
    }
}

internal fun serialize(dto: PremiumFeatureDisabledAds): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumFeatureDisabledAds")
    }
}

internal fun serialize(dto: PremiumFeatureUniqueReactions): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumFeatureUniqueReactions")
    }
}

internal fun serialize(dto: PremiumFeatureUniqueStickers): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumFeatureUniqueStickers")
    }
}

internal fun serialize(dto: PremiumFeatureCustomEmoji): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumFeatureCustomEmoji")
    }
}

internal fun serialize(dto: PremiumFeatureAdvancedChatManagement): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumFeatureAdvancedChatManagement")
    }
}

internal fun serialize(dto: PremiumFeatureProfileBadge): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumFeatureProfileBadge")
    }
}

internal fun serialize(dto: PremiumFeatureEmojiStatus): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumFeatureEmojiStatus")
    }
}

internal fun serialize(dto: PremiumFeatureAnimatedProfilePhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumFeatureAnimatedProfilePhoto")
    }
}

internal fun serialize(dto: PremiumFeatureForumTopicIcon): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumFeatureForumTopicIcon")
    }
}

internal fun serialize(dto: PremiumFeatureAppIcons): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumFeatureAppIcons")
    }
}

internal fun serialize(dto: PremiumFeatureRealTimeChatTranslation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumFeatureRealTimeChatTranslation")
    }
}

internal fun serialize(dto: PremiumFeatureUpgradedStories): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumFeatureUpgradedStories")
    }
}

internal fun serialize(dto: PremiumFeatureChatBoost): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumFeatureChatBoost")
    }
}

internal fun serialize(dto: PremiumFeatureAccentColor): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumFeatureAccentColor")
    }
}

internal fun serialize(dto: PremiumFeatureBackgroundForBoth): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumFeatureBackgroundForBoth")
    }
}

internal fun serialize(dto: PremiumFeatureSavedMessagesTags): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumFeatureSavedMessagesTags")
    }
}

internal fun serialize(dto: PremiumFeatureMessagePrivacy): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumFeatureMessagePrivacy")
    }
}

internal fun serialize(dto: PremiumFeatureLastSeenTimes): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumFeatureLastSeenTimes")
    }
}

internal fun serialize(dto: PremiumFeatureBusiness): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumFeatureBusiness")
    }
}

internal fun serialize(dto: PremiumFeatureMessageEffects): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumFeatureMessageEffects")
    }
}

internal fun serialize(dto: PremiumFeatureChecklists): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumFeatureChecklists")
    }
}

internal fun serialize(dto: PremiumFeaturePaidMessages): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumFeaturePaidMessages")
    }
}

internal fun serialize(dto: PremiumFeatureProtectPrivateChatContent): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumFeatureProtectPrivateChatContent")
    }
}

internal fun serialize(dto: PremiumFeatureTextComposition): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumFeatureTextComposition")
    }
}

internal fun serialize(dto: PremiumFeatureRichMessages): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumFeatureRichMessages")
    }
}

internal fun serialize(dto: BusinessFeatureLocation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessFeatureLocation")
    }
}

internal fun serialize(dto: BusinessFeatureOpeningHours): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessFeatureOpeningHours")
    }
}

internal fun serialize(dto: BusinessFeatureQuickReplies): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessFeatureQuickReplies")
    }
}

internal fun serialize(dto: BusinessFeatureGreetingMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessFeatureGreetingMessage")
    }
}

internal fun serialize(dto: BusinessFeatureAwayMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessFeatureAwayMessage")
    }
}

internal fun serialize(dto: BusinessFeatureAccountLinks): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessFeatureAccountLinks")
    }
}

internal fun serialize(dto: BusinessFeatureStartPage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessFeatureStartPage")
    }
}

internal fun serialize(dto: BusinessFeatureBots): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessFeatureBots")
    }
}

internal fun serialize(dto: BusinessFeatureEmojiStatus): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessFeatureEmojiStatus")
    }
}

internal fun serialize(dto: BusinessFeatureChatFolderTags): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessFeatureChatFolderTags")
    }
}

internal fun serialize(dto: BusinessFeatureUpgradedStories): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessFeatureUpgradedStories")
    }
}

internal fun serialize(dto: PremiumStoryFeaturePriorityOrder): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumStoryFeaturePriorityOrder")
    }
}

internal fun serialize(dto: PremiumStoryFeatureStealthMode): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumStoryFeatureStealthMode")
    }
}

internal fun serialize(dto: PremiumStoryFeaturePermanentViewsHistory): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumStoryFeaturePermanentViewsHistory")
    }
}

internal fun serialize(dto: PremiumStoryFeatureCustomExpirationDuration): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumStoryFeatureCustomExpirationDuration")
    }
}

internal fun serialize(dto: PremiumStoryFeatureSaveStories): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumStoryFeatureSaveStories")
    }
}

internal fun serialize(dto: PremiumStoryFeatureLinksAndFormatting): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumStoryFeatureLinksAndFormatting")
    }
}

internal fun serialize(dto: PremiumStoryFeatureVideoQuality): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumStoryFeatureVideoQuality")
    }
}

internal fun serialize(dto: PremiumLimit): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumLimit")
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
        put(key = "default_value", int = dto.defaultValue)
        put(key = "premium_value", int = dto.premiumValue)
    }
}

internal fun serialize(dto: PremiumFeatures): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumFeatures")
        put(key = "features", objects = dto.features) { data -> serialize(dto = data) }
        put(key = "limits", objects = dto.limits) { data -> serialize(dto = data) }
        put(key = "payment_link", value = dto.paymentLink) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: BusinessFeatures): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessFeatures")
        put(key = "features", objects = dto.features) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PremiumSourceLimitExceeded): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumSourceLimitExceeded")
        put(key = "limit_type", value = dto.limitType) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PremiumSourceFeature): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumSourceFeature")
        put(key = "feature", value = dto.feature) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PremiumSourceBusinessFeature): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumSourceBusinessFeature")
        put(key = "feature", value = dto.feature) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PremiumSourceStoryFeature): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumSourceStoryFeature")
        put(key = "feature", value = dto.feature) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PremiumSourceLink): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumSourceLink")
        put(key = "referrer", string = dto.referrer)
    }
}

internal fun serialize(dto: PremiumSourceSettings): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumSourceSettings")
    }
}

internal fun serialize(dto: PremiumFeaturePromotionAnimation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumFeaturePromotionAnimation")
        put(key = "feature", value = dto.feature) { data -> serialize(dto = data) }
        put(key = "animation", value = dto.animation) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: BusinessFeaturePromotionAnimation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "businessFeaturePromotionAnimation")
        put(key = "feature", value = dto.feature) { data -> serialize(dto = data) }
        put(key = "animation", value = dto.animation) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PremiumState): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "premiumState")
        put(key = "state", value = dto.state) { data -> serialize(dto = data) }
        put(key = "payment_options", objects = dto.paymentOptions) { data -> serialize(dto = data) }
        put(key = "animations", objects = dto.animations) { data -> serialize(dto = data) }
        put(key = "business_animations", objects = dto.businessAnimations) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StorePaymentPurposePremiumSubscription): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storePaymentPurposePremiumSubscription")
        put(key = "is_restore", boolean = dto.isRestore)
        put(key = "is_upgrade", boolean = dto.isUpgrade)
    }
}

internal fun serialize(dto: StorePaymentPurposePremiumGift): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storePaymentPurposePremiumGift")
        put(key = "currency", string = dto.currency)
        put(key = "amount", long = dto.amount)
        put(key = "user_id", long = dto.userId)
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StorePaymentPurposePremiumGiftCodes): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storePaymentPurposePremiumGiftCodes")
        put(key = "boosted_chat_id", long = dto.boostedChatId)
        put(key = "currency", string = dto.currency)
        put(key = "amount", long = dto.amount)
        put(key = "user_ids", longs = dto.userIds)
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StorePaymentPurposePremiumGiveaway): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storePaymentPurposePremiumGiveaway")
        put(key = "parameters", value = dto.parameters) { data -> serialize(dto = data) }
        put(key = "currency", string = dto.currency)
        put(key = "amount", long = dto.amount)
    }
}

internal fun serialize(dto: StorePaymentPurposeStarGiveaway): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storePaymentPurposeStarGiveaway")
        put(key = "parameters", value = dto.parameters) { data -> serialize(dto = data) }
        put(key = "currency", string = dto.currency)
        put(key = "amount", long = dto.amount)
        put(key = "winner_count", int = dto.winnerCount)
        put(key = "star_count", long = dto.starCount)
    }
}

internal fun serialize(dto: StorePaymentPurposeStars): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storePaymentPurposeStars")
        put(key = "currency", string = dto.currency)
        put(key = "amount", long = dto.amount)
        put(key = "star_count", long = dto.starCount)
        put(key = "chat_id", long = dto.chatId)
    }
}

internal fun serialize(dto: StorePaymentPurposeGiftedStars): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storePaymentPurposeGiftedStars")
        put(key = "user_id", long = dto.userId)
        put(key = "currency", string = dto.currency)
        put(key = "amount", long = dto.amount)
        put(key = "star_count", long = dto.starCount)
    }
}

internal fun serialize(dto: StoreTransactionAppStore): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storeTransactionAppStore")
        put(key = "receipt", bytes = dto.receipt)
    }
}

internal fun serialize(dto: StoreTransactionGooglePlay): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storeTransactionGooglePlay")
        put(key = "package_name", string = dto.packageName)
        put(key = "store_product_id", string = dto.storeProductId)
        put(key = "purchase_token", string = dto.purchaseToken)
    }
}

internal fun serialize(dto: TelegramPaymentPurposePremiumGift): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "telegramPaymentPurposePremiumGift")
        put(key = "currency", string = dto.currency)
        put(key = "amount", long = dto.amount)
        put(key = "user_id", long = dto.userId)
        put(key = "month_count", int = dto.monthCount)
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: TelegramPaymentPurposePremiumGiftCodes): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "telegramPaymentPurposePremiumGiftCodes")
        put(key = "boosted_chat_id", long = dto.boostedChatId)
        put(key = "currency", string = dto.currency)
        put(key = "amount", long = dto.amount)
        put(key = "user_ids", longs = dto.userIds)
        put(key = "month_count", int = dto.monthCount)
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: TelegramPaymentPurposePremiumGiveaway): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "telegramPaymentPurposePremiumGiveaway")
        put(key = "parameters", value = dto.parameters) { data -> serialize(dto = data) }
        put(key = "currency", string = dto.currency)
        put(key = "amount", long = dto.amount)
        put(key = "winner_count", int = dto.winnerCount)
        put(key = "month_count", int = dto.monthCount)
    }
}

internal fun serialize(dto: TelegramPaymentPurposeStars): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "telegramPaymentPurposeStars")
        put(key = "currency", string = dto.currency)
        put(key = "amount", long = dto.amount)
        put(key = "star_count", long = dto.starCount)
        put(key = "chat_id", long = dto.chatId)
    }
}

internal fun serialize(dto: TelegramPaymentPurposeGiftedStars): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "telegramPaymentPurposeGiftedStars")
        put(key = "user_id", long = dto.userId)
        put(key = "currency", string = dto.currency)
        put(key = "amount", long = dto.amount)
        put(key = "star_count", long = dto.starCount)
    }
}

internal fun serialize(dto: TelegramPaymentPurposeStarGiveaway): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "telegramPaymentPurposeStarGiveaway")
        put(key = "parameters", value = dto.parameters) { data -> serialize(dto = data) }
        put(key = "currency", string = dto.currency)
        put(key = "amount", long = dto.amount)
        put(key = "winner_count", int = dto.winnerCount)
        put(key = "star_count", long = dto.starCount)
    }
}

internal fun serialize(dto: TelegramPaymentPurposeJoinChat): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "telegramPaymentPurposeJoinChat")
        put(key = "invite_link", string = dto.inviteLink)
    }
}

internal fun serialize(dto: DeviceTokenFirebaseCloudMessaging): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "deviceTokenFirebaseCloudMessaging")
        put(key = "token", string = dto.token)
        put(key = "encrypt", boolean = dto.encrypt)
    }
}

internal fun serialize(dto: DeviceTokenApplePush): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "deviceTokenApplePush")
        put(key = "device_token", string = dto.deviceToken)
        put(key = "is_app_sandbox", boolean = dto.isAppSandbox)
    }
}

internal fun serialize(dto: DeviceTokenApplePushVoIP): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "deviceTokenApplePushVoIP")
        put(key = "device_token", string = dto.deviceToken)
        put(key = "is_app_sandbox", boolean = dto.isAppSandbox)
        put(key = "encrypt", boolean = dto.encrypt)
    }
}

internal fun serialize(dto: DeviceTokenWindowsPush): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "deviceTokenWindowsPush")
        put(key = "access_token", string = dto.accessToken)
    }
}

internal fun serialize(dto: DeviceTokenMicrosoftPush): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "deviceTokenMicrosoftPush")
        put(key = "channel_uri", string = dto.channelUri)
    }
}

internal fun serialize(dto: DeviceTokenMicrosoftPushVoIP): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "deviceTokenMicrosoftPushVoIP")
        put(key = "channel_uri", string = dto.channelUri)
    }
}

internal fun serialize(dto: DeviceTokenWebPush): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "deviceTokenWebPush")
        put(key = "endpoint", string = dto.endpoint)
        put(key = "p256dh_base64url", string = dto.p256dhBase64url)
        put(key = "auth_base64url", string = dto.authBase64url)
    }
}

internal fun serialize(dto: DeviceTokenSimplePush): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "deviceTokenSimplePush")
        put(key = "endpoint", string = dto.endpoint)
    }
}

internal fun serialize(dto: DeviceTokenUbuntuPush): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "deviceTokenUbuntuPush")
        put(key = "token", string = dto.token)
    }
}

internal fun serialize(dto: DeviceTokenBlackBerryPush): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "deviceTokenBlackBerryPush")
        put(key = "token", string = dto.token)
    }
}

internal fun serialize(dto: DeviceTokenTizenPush): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "deviceTokenTizenPush")
        put(key = "reg_id", string = dto.regId)
    }
}

internal fun serialize(dto: DeviceTokenHuaweiPush): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "deviceTokenHuaweiPush")
        put(key = "token", string = dto.token)
        put(key = "encrypt", boolean = dto.encrypt)
    }
}

internal fun serialize(dto: PushReceiverId): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushReceiverId")
        put(key = "id", long = dto.id)
    }
}

internal fun serialize(dto: BackgroundFillSolid): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "backgroundFillSolid")
        put(key = "color", int = dto.color)
    }
}

internal fun serialize(dto: BackgroundFillGradient): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "backgroundFillGradient")
        put(key = "top_color", int = dto.topColor)
        put(key = "bottom_color", int = dto.bottomColor)
        put(key = "rotation_angle", int = dto.rotationAngle)
    }
}

internal fun serialize(dto: BackgroundFillFreeformGradient): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "backgroundFillFreeformGradient")
        put(key = "colors", ints = dto.colors)
    }
}

internal fun serialize(dto: BackgroundTypeWallpaper): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "backgroundTypeWallpaper")
        put(key = "is_blurred", boolean = dto.isBlurred)
        put(key = "is_moving", boolean = dto.isMoving)
    }
}

internal fun serialize(dto: BackgroundTypePattern): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "backgroundTypePattern")
        put(key = "fill", value = dto.fill) { data -> serialize(dto = data) }
        put(key = "intensity", int = dto.intensity)
        put(key = "is_inverted", boolean = dto.isInverted)
        put(key = "is_moving", boolean = dto.isMoving)
    }
}

internal fun serialize(dto: BackgroundTypeFill): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "backgroundTypeFill")
        put(key = "fill", value = dto.fill) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: BackgroundTypeChatTheme): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "backgroundTypeChatTheme")
        put(key = "theme_name", string = dto.themeName)
    }
}

internal fun serialize(dto: InputBackgroundLocal): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputBackgroundLocal")
        put(key = "background", value = dto.background) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputBackgroundRemote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputBackgroundRemote")
        put(key = "background_id", long = dto.backgroundId)
    }
}

internal fun serialize(dto: InputBackgroundPrevious): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputBackgroundPrevious")
        put(key = "message_id", long = dto.messageId)
    }
}

internal fun serialize(dto: EmojiChatTheme): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "emojiChatTheme")
        put(key = "name", string = dto.name)
        put(key = "light_settings", value = dto.lightSettings) { data -> serialize(dto = data) }
        put(key = "dark_settings", value = dto.darkSettings) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: GiftChatTheme): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giftChatTheme")
        put(key = "gift", value = dto.gift) { data -> serialize(dto = data) }
        put(key = "light_settings", value = dto.lightSettings) { data -> serialize(dto = data) }
        put(key = "dark_settings", value = dto.darkSettings) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: GiftChatThemes): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "giftChatThemes")
        put(key = "themes", objects = dto.themes) { data -> serialize(dto = data) }
        put(key = "next_offset", string = dto.nextOffset)
    }
}

internal fun serialize(dto: ChatThemeEmoji): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatThemeEmoji")
        put(key = "name", string = dto.name)
    }
}

internal fun serialize(dto: ChatThemeGift): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatThemeGift")
        put(key = "gift_theme", value = dto.giftTheme) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InputChatThemeEmoji): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputChatThemeEmoji")
        put(key = "name", string = dto.name)
    }
}

internal fun serialize(dto: InputChatThemeGift): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "inputChatThemeGift")
        put(key = "name", string = dto.name)
    }
}

internal fun serialize(dto: TimeZone): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "timeZone")
        put(key = "id", string = dto.id)
        put(key = "name", string = dto.name)
        put(key = "utc_time_offset", int = dto.utcTimeOffset)
    }
}

internal fun serialize(dto: TimeZones): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "timeZones")
        put(key = "time_zones", objects = dto.timeZones) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: Hashtags): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "hashtags")
        put(key = "hashtags", strings = dto.hashtags)
    }
}

internal fun serialize(dto: CanPostStoryResultOk): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "canPostStoryResultOk")
        put(key = "story_count", int = dto.storyCount)
    }
}

internal fun serialize(dto: CanPostStoryResultPremiumNeeded): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "canPostStoryResultPremiumNeeded")
    }
}

internal fun serialize(dto: CanPostStoryResultBoostNeeded): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "canPostStoryResultBoostNeeded")
    }
}

internal fun serialize(dto: CanPostStoryResultActiveStoryLimitExceeded): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "canPostStoryResultActiveStoryLimitExceeded")
    }
}

internal fun serialize(dto: CanPostStoryResultWeeklyLimitExceeded): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "canPostStoryResultWeeklyLimitExceeded")
        put(key = "retry_after", int = dto.retryAfter)
    }
}

internal fun serialize(dto: CanPostStoryResultMonthlyLimitExceeded): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "canPostStoryResultMonthlyLimitExceeded")
        put(key = "retry_after", int = dto.retryAfter)
    }
}

internal fun serialize(dto: CanPostStoryResultLiveStoryIsActive): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "canPostStoryResultLiveStoryIsActive")
        put(key = "story_id", int = dto.storyId)
    }
}

internal fun serialize(dto: StartLiveStoryResultOk): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "startLiveStoryResultOk")
        put(key = "story", value = dto.story) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StartLiveStoryResultFail): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "startLiveStoryResultFail")
        put(key = "error_type", value = dto.errorType) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: CanTransferOwnershipResultOk): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "canTransferOwnershipResultOk")
    }
}

internal fun serialize(dto: CanTransferOwnershipResultPasswordNeeded): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "canTransferOwnershipResultPasswordNeeded")
    }
}

internal fun serialize(dto: CanTransferOwnershipResultPasswordTooFresh): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "canTransferOwnershipResultPasswordTooFresh")
        put(key = "retry_after", int = dto.retryAfter)
    }
}

internal fun serialize(dto: CanTransferOwnershipResultSessionTooFresh): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "canTransferOwnershipResultSessionTooFresh")
        put(key = "retry_after", int = dto.retryAfter)
    }
}

internal fun serialize(dto: CheckChatUsernameResultOk): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "checkChatUsernameResultOk")
    }
}

internal fun serialize(dto: CheckChatUsernameResultUsernameInvalid): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "checkChatUsernameResultUsernameInvalid")
    }
}

internal fun serialize(dto: CheckChatUsernameResultUsernameOccupied): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "checkChatUsernameResultUsernameOccupied")
    }
}

internal fun serialize(dto: CheckChatUsernameResultUsernamePurchasable): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "checkChatUsernameResultUsernamePurchasable")
    }
}

internal fun serialize(dto: CheckChatUsernameResultPublicChatsTooMany): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "checkChatUsernameResultPublicChatsTooMany")
    }
}

internal fun serialize(dto: CheckChatUsernameResultPublicGroupsUnavailable): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "checkChatUsernameResultPublicGroupsUnavailable")
    }
}

internal fun serialize(dto: CheckStickerSetNameResultOk): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "checkStickerSetNameResultOk")
    }
}

internal fun serialize(dto: CheckStickerSetNameResultNameInvalid): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "checkStickerSetNameResultNameInvalid")
    }
}

internal fun serialize(dto: CheckStickerSetNameResultNameOccupied): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "checkStickerSetNameResultNameOccupied")
    }
}

internal fun serialize(dto: ResetPasswordResultOk): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "resetPasswordResultOk")
    }
}

internal fun serialize(dto: ResetPasswordResultPending): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "resetPasswordResultPending")
        put(key = "pending_reset_date", int = dto.pendingResetDate)
    }
}

internal fun serialize(dto: ResetPasswordResultDeclined): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "resetPasswordResultDeclined")
        put(key = "retry_date", int = dto.retryDate)
    }
}

internal fun serialize(dto: MessageFileTypePrivate): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageFileTypePrivate")
        put(key = "name", string = dto.name)
    }
}

internal fun serialize(dto: MessageFileTypeGroup): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageFileTypeGroup")
        put(key = "title", string = dto.title)
    }
}

internal fun serialize(dto: MessageFileTypeUnknown): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageFileTypeUnknown")
    }
}

internal fun serialize(dto: PushMessageContentHidden): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentHidden")
        put(key = "is_pinned", boolean = dto.isPinned)
    }
}

internal fun serialize(dto: PushMessageContentAnimation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentAnimation")
        put(key = "animation", value = dto.animation) { data -> serialize(dto = data) }
        put(key = "caption", string = dto.caption)
        put(key = "is_pinned", boolean = dto.isPinned)
    }
}

internal fun serialize(dto: PushMessageContentAudio): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentAudio")
        put(key = "audio", value = dto.audio) { data -> serialize(dto = data) }
        put(key = "is_pinned", boolean = dto.isPinned)
    }
}

internal fun serialize(dto: PushMessageContentContact): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentContact")
        put(key = "name", string = dto.name)
        put(key = "is_pinned", boolean = dto.isPinned)
    }
}

internal fun serialize(dto: PushMessageContentContactRegistered): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentContactRegistered")
        put(key = "as_premium_account", boolean = dto.asPremiumAccount)
    }
}

internal fun serialize(dto: PushMessageContentDocument): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentDocument")
        put(key = "document", value = dto.document) { data -> serialize(dto = data) }
        put(key = "is_pinned", boolean = dto.isPinned)
    }
}

internal fun serialize(dto: PushMessageContentGame): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentGame")
        put(key = "title", string = dto.title)
        put(key = "is_pinned", boolean = dto.isPinned)
    }
}

internal fun serialize(dto: PushMessageContentGameScore): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentGameScore")
        put(key = "title", string = dto.title)
        put(key = "score", int = dto.score)
        put(key = "is_pinned", boolean = dto.isPinned)
    }
}

internal fun serialize(dto: PushMessageContentInvoice): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentInvoice")
        put(key = "price", string = dto.price)
        put(key = "is_pinned", boolean = dto.isPinned)
    }
}

internal fun serialize(dto: PushMessageContentLocation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentLocation")
        put(key = "is_live", boolean = dto.isLive)
        put(key = "is_pinned", boolean = dto.isPinned)
    }
}

internal fun serialize(dto: PushMessageContentPaidMedia): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentPaidMedia")
        put(key = "star_count", long = dto.starCount)
        put(key = "is_pinned", boolean = dto.isPinned)
    }
}

internal fun serialize(dto: PushMessageContentPhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentPhoto")
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
        put(key = "caption", string = dto.caption)
        put(key = "is_secret", boolean = dto.isSecret)
        put(key = "is_pinned", boolean = dto.isPinned)
    }
}

internal fun serialize(dto: PushMessageContentPoll): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentPoll")
        put(key = "question", string = dto.question)
        put(key = "is_regular", boolean = dto.isRegular)
        put(key = "is_pinned", boolean = dto.isPinned)
    }
}

internal fun serialize(dto: PushMessageContentPremiumGiftCode): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentPremiumGiftCode")
        put(key = "month_count", int = dto.monthCount)
    }
}

internal fun serialize(dto: PushMessageContentGiveaway): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentGiveaway")
        put(key = "winner_count", int = dto.winnerCount)
        put(key = "prize", value = dto.prize) { data -> serialize(dto = data) }
        put(key = "is_pinned", boolean = dto.isPinned)
    }
}

internal fun serialize(dto: PushMessageContentGift): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentGift")
        put(key = "star_count", long = dto.starCount)
        put(key = "is_prepaid_upgrade", boolean = dto.isPrepaidUpgrade)
    }
}

internal fun serialize(dto: PushMessageContentUpgradedGift): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentUpgradedGift")
        put(key = "is_upgrade", boolean = dto.isUpgrade)
        put(key = "is_prepaid_upgrade", boolean = dto.isPrepaidUpgrade)
    }
}

internal fun serialize(dto: PushMessageContentScreenshotTaken): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentScreenshotTaken")
    }
}

internal fun serialize(dto: PushMessageContentSticker): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentSticker")
        put(key = "sticker", value = dto.sticker) { data -> serialize(dto = data) }
        put(key = "emoji", string = dto.emoji)
        put(key = "is_pinned", boolean = dto.isPinned)
    }
}

internal fun serialize(dto: PushMessageContentStory): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentStory")
        put(key = "is_mention", boolean = dto.isMention)
        put(key = "is_pinned", boolean = dto.isPinned)
    }
}

internal fun serialize(dto: PushMessageContentText): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentText")
        put(key = "text", string = dto.text)
        put(key = "is_pinned", boolean = dto.isPinned)
    }
}

internal fun serialize(dto: PushMessageContentChecklist): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentChecklist")
        put(key = "title", string = dto.title)
        put(key = "is_pinned", boolean = dto.isPinned)
    }
}

internal fun serialize(dto: PushMessageContentVideo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentVideo")
        put(key = "video", value = dto.video) { data -> serialize(dto = data) }
        put(key = "caption", string = dto.caption)
        put(key = "is_secret", boolean = dto.isSecret)
        put(key = "is_pinned", boolean = dto.isPinned)
    }
}

internal fun serialize(dto: PushMessageContentVideoNote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentVideoNote")
        put(key = "video_note", value = dto.videoNote) { data -> serialize(dto = data) }
        put(key = "is_pinned", boolean = dto.isPinned)
    }
}

internal fun serialize(dto: PushMessageContentVoiceNote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentVoiceNote")
        put(key = "voice_note", value = dto.voiceNote) { data -> serialize(dto = data) }
        put(key = "is_pinned", boolean = dto.isPinned)
    }
}

internal fun serialize(dto: PushMessageContentBasicGroupChatCreate): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentBasicGroupChatCreate")
    }
}

internal fun serialize(dto: PushMessageContentVideoChatStarted): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentVideoChatStarted")
    }
}

internal fun serialize(dto: PushMessageContentVideoChatEnded): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentVideoChatEnded")
    }
}

internal fun serialize(dto: PushMessageContentInviteVideoChatParticipants): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentInviteVideoChatParticipants")
        put(key = "is_current_user", boolean = dto.isCurrentUser)
    }
}

internal fun serialize(dto: PushMessageContentChatAddMembers): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentChatAddMembers")
        put(key = "member_name", string = dto.memberName)
        put(key = "is_current_user", boolean = dto.isCurrentUser)
        put(key = "is_returned", boolean = dto.isReturned)
    }
}

internal fun serialize(dto: PushMessageContentChatChangePhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentChatChangePhoto")
    }
}

internal fun serialize(dto: PushMessageContentChatChangeTitle): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentChatChangeTitle")
        put(key = "title", string = dto.title)
    }
}

internal fun serialize(dto: PushMessageContentChatSetBackground): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentChatSetBackground")
        put(key = "is_same", boolean = dto.isSame)
    }
}

internal fun serialize(dto: PushMessageContentChatSetTheme): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentChatSetTheme")
        put(key = "name", string = dto.name)
    }
}

internal fun serialize(dto: PushMessageContentChatDeleteMember): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentChatDeleteMember")
        put(key = "member_name", string = dto.memberName)
        put(key = "is_current_user", boolean = dto.isCurrentUser)
        put(key = "is_left", boolean = dto.isLeft)
    }
}

internal fun serialize(dto: PushMessageContentChatJoinByLink): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentChatJoinByLink")
    }
}

internal fun serialize(dto: PushMessageContentChatJoinByRequest): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentChatJoinByRequest")
    }
}

internal fun serialize(dto: PushMessageContentRecurringPayment): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentRecurringPayment")
        put(key = "amount", string = dto.amount)
    }
}

internal fun serialize(dto: PushMessageContentSuggestProfilePhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentSuggestProfilePhoto")
    }
}

internal fun serialize(dto: PushMessageContentSuggestBirthdate): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentSuggestBirthdate")
    }
}

internal fun serialize(dto: PushMessageContentProximityAlertTriggered): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentProximityAlertTriggered")
        put(key = "distance", int = dto.distance)
    }
}

internal fun serialize(dto: PushMessageContentChecklistTasksAdded): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentChecklistTasksAdded")
        put(key = "task_count", int = dto.taskCount)
    }
}

internal fun serialize(dto: PushMessageContentChecklistTasksDone): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentChecklistTasksDone")
        put(key = "task_count", int = dto.taskCount)
    }
}

internal fun serialize(dto: PushMessageContentPollOptionAdded): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentPollOptionAdded")
        put(key = "text", string = dto.text)
    }
}

internal fun serialize(dto: PushMessageContentMessageForwards): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentMessageForwards")
        put(key = "total_count", int = dto.totalCount)
    }
}

internal fun serialize(dto: PushMessageContentMediaAlbum): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pushMessageContentMediaAlbum")
        put(key = "total_count", int = dto.totalCount)
        put(key = "has_photos", boolean = dto.hasPhotos)
        put(key = "has_videos", boolean = dto.hasVideos)
        put(key = "has_audios", boolean = dto.hasAudios)
        put(key = "has_documents", boolean = dto.hasDocuments)
    }
}

internal fun serialize(dto: NotificationTypeNewMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "notificationTypeNewMessage")
        put(key = "message", value = dto.message) { data -> serialize(dto = data) }
        put(key = "show_preview", boolean = dto.showPreview)
    }
}

internal fun serialize(dto: NotificationTypeNewSecretChat): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "notificationTypeNewSecretChat")
    }
}

internal fun serialize(dto: NotificationTypeNewCall): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "notificationTypeNewCall")
        put(key = "call_id", int = dto.callId)
    }
}

internal fun serialize(dto: NotificationTypeNewPushMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "notificationTypeNewPushMessage")
        put(key = "message_id", long = dto.messageId)
        put(key = "sender_id", value = dto.senderId) { data -> serialize(dto = data) }
        put(key = "sender_name", string = dto.senderName)
        put(key = "is_outgoing", boolean = dto.isOutgoing)
        put(key = "content", value = dto.content) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: NotificationGroupTypeMessages): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "notificationGroupTypeMessages")
    }
}

internal fun serialize(dto: NotificationGroupTypeMentions): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "notificationGroupTypeMentions")
    }
}

internal fun serialize(dto: NotificationGroupTypeSecretChat): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "notificationGroupTypeSecretChat")
    }
}

internal fun serialize(dto: NotificationGroupTypeCalls): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "notificationGroupTypeCalls")
    }
}

internal fun serialize(dto: NotificationSound): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "notificationSound")
        put(key = "id", long = dto.id)
        put(key = "duration", int = dto.duration)
        put(key = "date", int = dto.date)
        put(key = "title", string = dto.title)
        put(key = "data", string = dto.data)
        put(key = "sound", value = dto.sound) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: NotificationSounds): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "notificationSounds")
        put(key = "notification_sounds", objects = dto.notificationSounds) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: Notification): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "notification")
        put(key = "id", int = dto.id)
        put(key = "date", int = dto.date)
        put(key = "is_silent", boolean = dto.isSilent)
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: NotificationGroup): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "notificationGroup")
        put(key = "id", int = dto.id)
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
        put(key = "chat_id", long = dto.chatId)
        put(key = "total_count", int = dto.totalCount)
        put(key = "notifications", objects = dto.notifications) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: Proxy): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "proxy")
        put(key = "server", string = dto.server)
        put(key = "port", int = dto.port)
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: OptionValueBoolean): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "optionValueBoolean")
        put(key = "value", boolean = dto.value)
    }
}

internal fun serialize(dto: OptionValueEmpty): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "optionValueEmpty")
    }
}

internal fun serialize(dto: OptionValueInteger): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "optionValueInteger")
        put(key = "value", long = dto.value)
    }
}

internal fun serialize(dto: OptionValueString): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "optionValueString")
        put(key = "value", string = dto.value)
    }
}

internal fun serialize(dto: JsonObjectMember): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "jsonObjectMember")
        put(key = "key", string = dto.key)
        put(key = "value", value = dto.value) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: JsonValueNull): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "jsonValueNull")
    }
}

internal fun serialize(dto: JsonValueBoolean): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "jsonValueBoolean")
        put(key = "value", boolean = dto.value)
    }
}

internal fun serialize(dto: JsonValueNumber): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "jsonValueNumber")
        put(key = "value", double = dto.value)
    }
}

internal fun serialize(dto: JsonValueString): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "jsonValueString")
        put(key = "value", string = dto.value)
    }
}

internal fun serialize(dto: JsonValueArray): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "jsonValueArray")
        put(key = "values", objects = dto.values) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: JsonValueObject): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "jsonValueObject")
        put(key = "members", objects = dto.members) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StoryPrivacySettingsEveryone): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyPrivacySettingsEveryone")
        put(key = "except_user_ids", longs = dto.exceptUserIds)
    }
}

internal fun serialize(dto: StoryPrivacySettingsContacts): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyPrivacySettingsContacts")
        put(key = "except_user_ids", longs = dto.exceptUserIds)
    }
}

internal fun serialize(dto: StoryPrivacySettingsCloseFriends): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyPrivacySettingsCloseFriends")
    }
}

internal fun serialize(dto: StoryPrivacySettingsSelectedUsers): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyPrivacySettingsSelectedUsers")
        put(key = "user_ids", longs = dto.userIds)
    }
}

internal fun serialize(dto: UserPrivacySettingRuleAllowAll): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userPrivacySettingRuleAllowAll")
    }
}

internal fun serialize(dto: UserPrivacySettingRuleAllowContacts): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userPrivacySettingRuleAllowContacts")
    }
}

internal fun serialize(dto: UserPrivacySettingRuleAllowBots): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userPrivacySettingRuleAllowBots")
    }
}

internal fun serialize(dto: UserPrivacySettingRuleAllowPremiumUsers): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userPrivacySettingRuleAllowPremiumUsers")
    }
}

internal fun serialize(dto: UserPrivacySettingRuleAllowUsers): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userPrivacySettingRuleAllowUsers")
        put(key = "user_ids", longs = dto.userIds)
    }
}

internal fun serialize(dto: UserPrivacySettingRuleAllowChatMembers): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userPrivacySettingRuleAllowChatMembers")
        put(key = "chat_ids", longs = dto.chatIds)
    }
}

internal fun serialize(dto: UserPrivacySettingRuleRestrictAll): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userPrivacySettingRuleRestrictAll")
    }
}

internal fun serialize(dto: UserPrivacySettingRuleRestrictContacts): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userPrivacySettingRuleRestrictContacts")
    }
}

internal fun serialize(dto: UserPrivacySettingRuleRestrictBots): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userPrivacySettingRuleRestrictBots")
    }
}

internal fun serialize(dto: UserPrivacySettingRuleRestrictUsers): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userPrivacySettingRuleRestrictUsers")
        put(key = "user_ids", longs = dto.userIds)
    }
}

internal fun serialize(dto: UserPrivacySettingRuleRestrictChatMembers): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userPrivacySettingRuleRestrictChatMembers")
        put(key = "chat_ids", longs = dto.chatIds)
    }
}

internal fun serialize(dto: UserPrivacySettingRules): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userPrivacySettingRules")
        put(key = "rules", objects = dto.rules) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UserPrivacySettingShowStatus): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userPrivacySettingShowStatus")
    }
}

internal fun serialize(dto: UserPrivacySettingShowProfilePhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userPrivacySettingShowProfilePhoto")
    }
}

internal fun serialize(dto: UserPrivacySettingShowLinkInForwardedMessages): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userPrivacySettingShowLinkInForwardedMessages")
    }
}

internal fun serialize(dto: UserPrivacySettingShowPhoneNumber): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userPrivacySettingShowPhoneNumber")
    }
}

internal fun serialize(dto: UserPrivacySettingShowBio): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userPrivacySettingShowBio")
    }
}

internal fun serialize(dto: UserPrivacySettingShowBirthdate): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userPrivacySettingShowBirthdate")
    }
}

internal fun serialize(dto: UserPrivacySettingShowProfileAudio): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userPrivacySettingShowProfileAudio")
    }
}

internal fun serialize(dto: UserPrivacySettingAllowChatInvites): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userPrivacySettingAllowChatInvites")
    }
}

internal fun serialize(dto: UserPrivacySettingAllowCalls): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userPrivacySettingAllowCalls")
    }
}

internal fun serialize(dto: UserPrivacySettingAllowPeerToPeerCalls): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userPrivacySettingAllowPeerToPeerCalls")
    }
}

internal fun serialize(dto: UserPrivacySettingAllowFindingByPhoneNumber): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userPrivacySettingAllowFindingByPhoneNumber")
    }
}

internal fun serialize(dto: UserPrivacySettingAllowPrivateVoiceAndVideoNoteMessages): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userPrivacySettingAllowPrivateVoiceAndVideoNoteMessages")
    }
}

internal fun serialize(dto: UserPrivacySettingAutosaveGifts): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userPrivacySettingAutosaveGifts")
    }
}

internal fun serialize(dto: UserPrivacySettingAllowUnpaidMessages): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userPrivacySettingAllowUnpaidMessages")
    }
}

internal fun serialize(dto: ReadDatePrivacySettings): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "readDatePrivacySettings")
        put(key = "show_read_date", boolean = dto.showReadDate)
    }
}

internal fun serialize(dto: NewChatPrivacySettings): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "newChatPrivacySettings")
        put(key = "allow_new_chats_from_unknown_users", boolean = dto.allowNewChatsFromUnknownUsers)
        put(key = "incoming_paid_message_star_count", long = dto.incomingPaidMessageStarCount)
    }
}

internal fun serialize(dto: CanSendMessageToUserResultOk): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "canSendMessageToUserResultOk")
    }
}

internal fun serialize(dto: CanSendMessageToUserResultUserHasPaidMessages): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "canSendMessageToUserResultUserHasPaidMessages")
        put(key = "outgoing_paid_message_star_count", long = dto.outgoingPaidMessageStarCount)
    }
}

internal fun serialize(dto: CanSendMessageToUserResultUserIsDeleted): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "canSendMessageToUserResultUserIsDeleted")
    }
}

internal fun serialize(dto: CanSendMessageToUserResultUserRestrictsNewChats): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "canSendMessageToUserResultUserRestrictsNewChats")
    }
}

internal fun serialize(dto: AccountTtl): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "accountTtl")
        put(key = "days", int = dto.days)
    }
}

internal fun serialize(dto: MessageAutoDeleteTime): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageAutoDeleteTime")
        put(key = "time", int = dto.time)
    }
}

internal fun serialize(dto: SessionTypeDevice): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "sessionTypeDevice")
        put(key = "session_id", long = dto.sessionId)
    }
}

internal fun serialize(dto: SessionTypeConnectedBot): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "sessionTypeConnectedBot")
        put(key = "bot_user_id", long = dto.botUserId)
    }
}

internal fun serialize(dto: SessionDeviceTypeAndroid): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "sessionDeviceTypeAndroid")
    }
}

internal fun serialize(dto: SessionDeviceTypeApple): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "sessionDeviceTypeApple")
    }
}

internal fun serialize(dto: SessionDeviceTypeBrave): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "sessionDeviceTypeBrave")
    }
}

internal fun serialize(dto: SessionDeviceTypeChrome): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "sessionDeviceTypeChrome")
    }
}

internal fun serialize(dto: SessionDeviceTypeEdge): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "sessionDeviceTypeEdge")
    }
}

internal fun serialize(dto: SessionDeviceTypeFirefox): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "sessionDeviceTypeFirefox")
    }
}

internal fun serialize(dto: SessionDeviceTypeIpad): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "sessionDeviceTypeIpad")
    }
}

internal fun serialize(dto: SessionDeviceTypeIphone): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "sessionDeviceTypeIphone")
    }
}

internal fun serialize(dto: SessionDeviceTypeLinux): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "sessionDeviceTypeLinux")
    }
}

internal fun serialize(dto: SessionDeviceTypeMac): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "sessionDeviceTypeMac")
    }
}

internal fun serialize(dto: SessionDeviceTypeOpera): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "sessionDeviceTypeOpera")
    }
}

internal fun serialize(dto: SessionDeviceTypeSafari): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "sessionDeviceTypeSafari")
    }
}

internal fun serialize(dto: SessionDeviceTypeUbuntu): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "sessionDeviceTypeUbuntu")
    }
}

internal fun serialize(dto: SessionDeviceTypeUnknown): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "sessionDeviceTypeUnknown")
    }
}

internal fun serialize(dto: SessionDeviceTypeVivaldi): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "sessionDeviceTypeVivaldi")
    }
}

internal fun serialize(dto: SessionDeviceTypeWindows): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "sessionDeviceTypeWindows")
    }
}

internal fun serialize(dto: SessionDeviceTypeXbox): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "sessionDeviceTypeXbox")
    }
}

internal fun serialize(dto: Session): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "session")
        put(key = "id", long = dto.id)
        put(key = "is_current", boolean = dto.isCurrent)
        put(key = "is_password_pending", boolean = dto.isPasswordPending)
        put(key = "is_unconfirmed", boolean = dto.isUnconfirmed)
        put(key = "can_accept_secret_chats", boolean = dto.canAcceptSecretChats)
        put(key = "can_accept_calls", boolean = dto.canAcceptCalls)
        put(key = "device_type", value = dto.deviceType) { data -> serialize(dto = data) }
        put(key = "api_id", int = dto.apiId)
        put(key = "application_name", string = dto.applicationName)
        put(key = "application_version", string = dto.applicationVersion)
        put(key = "is_official_application", boolean = dto.isOfficialApplication)
        put(key = "device_model", string = dto.deviceModel)
        put(key = "platform", string = dto.platform)
        put(key = "system_version", string = dto.systemVersion)
        put(key = "log_in_date", int = dto.logInDate)
        put(key = "last_active_date", int = dto.lastActiveDate)
        put(key = "ip_address", string = dto.ipAddress)
        put(key = "location", string = dto.location)
    }
}

internal fun serialize(dto: Sessions): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "sessions")
        put(key = "sessions", objects = dto.sessions) { data -> serialize(dto = data) }
        put(key = "inactive_session_ttl_days", int = dto.inactiveSessionTtlDays)
    }
}

internal fun serialize(dto: UnconfirmedSession): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "unconfirmedSession")
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
        put(key = "date", int = dto.date)
        put(key = "device_model", string = dto.deviceModel)
        put(key = "location", string = dto.location)
    }
}

internal fun serialize(dto: ConnectedWebsite): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "connectedWebsite")
        put(key = "id", long = dto.id)
        put(key = "domain_name", string = dto.domainName)
        put(key = "bot_user_id", long = dto.botUserId)
        put(key = "browser", string = dto.browser)
        put(key = "platform", string = dto.platform)
        put(key = "log_in_date", int = dto.logInDate)
        put(key = "last_active_date", int = dto.lastActiveDate)
        put(key = "ip_address", string = dto.ipAddress)
        put(key = "location", string = dto.location)
    }
}

internal fun serialize(dto: ConnectedWebsites): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "connectedWebsites")
        put(key = "websites", objects = dto.websites) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ReportReasonSpam): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reportReasonSpam")
    }
}

internal fun serialize(dto: ReportReasonViolence): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reportReasonViolence")
    }
}

internal fun serialize(dto: ReportReasonPornography): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reportReasonPornography")
    }
}

internal fun serialize(dto: ReportReasonChildAbuse): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reportReasonChildAbuse")
    }
}

internal fun serialize(dto: ReportReasonCopyright): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reportReasonCopyright")
    }
}

internal fun serialize(dto: ReportReasonUnrelatedLocation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reportReasonUnrelatedLocation")
    }
}

internal fun serialize(dto: ReportReasonFake): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reportReasonFake")
    }
}

internal fun serialize(dto: ReportReasonIllegalDrugs): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reportReasonIllegalDrugs")
    }
}

internal fun serialize(dto: ReportReasonPersonalDetails): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reportReasonPersonalDetails")
    }
}

internal fun serialize(dto: ReportReasonCustom): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reportReasonCustom")
    }
}

internal fun serialize(dto: ReportChatResultOk): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reportChatResultOk")
    }
}

internal fun serialize(dto: ReportChatResultOptionRequired): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reportChatResultOptionRequired")
        put(key = "title", string = dto.title)
        put(key = "options", objects = dto.options) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ReportChatResultTextRequired): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reportChatResultTextRequired")
        put(key = "option_id", bytes = dto.optionId)
        put(key = "is_optional", boolean = dto.isOptional)
    }
}

internal fun serialize(dto: ReportChatResultMessagesRequired): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reportChatResultMessagesRequired")
    }
}

internal fun serialize(dto: ReportStoryResultOk): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reportStoryResultOk")
    }
}

internal fun serialize(dto: ReportStoryResultOptionRequired): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reportStoryResultOptionRequired")
        put(key = "title", string = dto.title)
        put(key = "options", objects = dto.options) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ReportStoryResultTextRequired): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "reportStoryResultTextRequired")
        put(key = "option_id", bytes = dto.optionId)
        put(key = "is_optional", boolean = dto.isOptional)
    }
}

internal fun serialize(dto: SettingsSectionAppearance): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "settingsSectionAppearance")
        put(key = "subsection", string = dto.subsection)
    }
}

internal fun serialize(dto: SettingsSectionAskQuestion): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "settingsSectionAskQuestion")
    }
}

internal fun serialize(dto: SettingsSectionBusiness): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "settingsSectionBusiness")
        put(key = "subsection", string = dto.subsection)
    }
}

internal fun serialize(dto: SettingsSectionChatFolders): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "settingsSectionChatFolders")
        put(key = "subsection", string = dto.subsection)
    }
}

internal fun serialize(dto: SettingsSectionDataAndStorage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "settingsSectionDataAndStorage")
        put(key = "subsection", string = dto.subsection)
    }
}

internal fun serialize(dto: SettingsSectionDevices): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "settingsSectionDevices")
        put(key = "subsection", string = dto.subsection)
    }
}

internal fun serialize(dto: SettingsSectionEditProfile): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "settingsSectionEditProfile")
        put(key = "subsection", string = dto.subsection)
    }
}

internal fun serialize(dto: SettingsSectionFaq): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "settingsSectionFaq")
    }
}

internal fun serialize(dto: SettingsSectionFeatures): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "settingsSectionFeatures")
    }
}

internal fun serialize(dto: SettingsSectionInAppBrowser): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "settingsSectionInAppBrowser")
        put(key = "subsection", string = dto.subsection)
    }
}

internal fun serialize(dto: SettingsSectionLanguage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "settingsSectionLanguage")
        put(key = "subsection", string = dto.subsection)
    }
}

internal fun serialize(dto: SettingsSectionMyStars): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "settingsSectionMyStars")
        put(key = "subsection", string = dto.subsection)
    }
}

internal fun serialize(dto: SettingsSectionMyGrams): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "settingsSectionMyGrams")
    }
}

internal fun serialize(dto: SettingsSectionNotifications): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "settingsSectionNotifications")
        put(key = "subsection", string = dto.subsection)
    }
}

internal fun serialize(dto: SettingsSectionPowerSaving): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "settingsSectionPowerSaving")
        put(key = "subsection", string = dto.subsection)
    }
}

internal fun serialize(dto: SettingsSectionPremium): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "settingsSectionPremium")
    }
}

internal fun serialize(dto: SettingsSectionPrivacyAndSecurity): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "settingsSectionPrivacyAndSecurity")
        put(key = "subsection", string = dto.subsection)
    }
}

internal fun serialize(dto: SettingsSectionPrivacyPolicy): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "settingsSectionPrivacyPolicy")
    }
}

internal fun serialize(dto: SettingsSectionQrCode): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "settingsSectionQrCode")
        put(key = "subsection", string = dto.subsection)
    }
}

internal fun serialize(dto: SettingsSectionSearch): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "settingsSectionSearch")
    }
}

internal fun serialize(dto: SettingsSectionSendGift): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "settingsSectionSendGift")
        put(key = "subsection", string = dto.subsection)
    }
}

internal fun serialize(dto: InternalLinkTypeAttachmentMenuBot): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeAttachmentMenuBot")
        put(key = "target_chat", value = dto.targetChat) { data -> serialize(dto = data) }
        put(key = "bot_username", string = dto.botUsername)
        put(key = "url", string = dto.url)
    }
}

internal fun serialize(dto: InternalLinkTypeAuthenticationCode): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeAuthenticationCode")
        put(key = "code", string = dto.code)
    }
}

internal fun serialize(dto: InternalLinkTypeBackground): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeBackground")
        put(key = "background_name", string = dto.backgroundName)
    }
}

internal fun serialize(dto: InternalLinkTypeBotAddToChannel): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeBotAddToChannel")
        put(key = "bot_username", string = dto.botUsername)
        put(key = "administrator_rights", value = dto.administratorRights) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InternalLinkTypeBotStart): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeBotStart")
        put(key = "bot_username", string = dto.botUsername)
        put(key = "start_parameter", string = dto.startParameter)
        put(key = "autostart", boolean = dto.autostart)
    }
}

internal fun serialize(dto: InternalLinkTypeBotStartInGroup): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeBotStartInGroup")
        put(key = "bot_username", string = dto.botUsername)
        put(key = "start_parameter", string = dto.startParameter)
        put(key = "administrator_rights", value = dto.administratorRights) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InternalLinkTypeBusinessChat): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeBusinessChat")
        put(key = "link_name", string = dto.linkName)
    }
}

internal fun serialize(dto: InternalLinkTypeCallsPage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeCallsPage")
        put(key = "section", string = dto.section)
    }
}

internal fun serialize(dto: InternalLinkTypeChatAffiliateProgram): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeChatAffiliateProgram")
        put(key = "username", string = dto.username)
        put(key = "referrer", string = dto.referrer)
    }
}

internal fun serialize(dto: InternalLinkTypeChatBoost): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeChatBoost")
        put(key = "url", string = dto.url)
    }
}

internal fun serialize(dto: InternalLinkTypeChatFolderInvite): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeChatFolderInvite")
        put(key = "invite_link", string = dto.inviteLink)
    }
}

internal fun serialize(dto: InternalLinkTypeChatInvite): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeChatInvite")
        put(key = "invite_link", string = dto.inviteLink)
    }
}

internal fun serialize(dto: InternalLinkTypeChatSelection): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeChatSelection")
    }
}

internal fun serialize(dto: InternalLinkTypeContactsPage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeContactsPage")
        put(key = "section", string = dto.section)
    }
}

internal fun serialize(dto: InternalLinkTypeDirectMessagesChat): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeDirectMessagesChat")
        put(key = "channel_username", string = dto.channelUsername)
    }
}

internal fun serialize(dto: InternalLinkTypeGame): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeGame")
        put(key = "bot_username", string = dto.botUsername)
        put(key = "game_short_name", string = dto.gameShortName)
    }
}

internal fun serialize(dto: InternalLinkTypeGiftAuction): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeGiftAuction")
        put(key = "auction_id", string = dto.auctionId)
    }
}

internal fun serialize(dto: InternalLinkTypeGiftCollection): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeGiftCollection")
        put(key = "gift_owner_username", string = dto.giftOwnerUsername)
        put(key = "collection_id", int = dto.collectionId)
    }
}

internal fun serialize(dto: InternalLinkTypeGroupCall): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeGroupCall")
        put(key = "invite_link", string = dto.inviteLink)
    }
}

internal fun serialize(dto: InternalLinkTypeInstantView): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeInstantView")
        put(key = "url", string = dto.url)
        put(key = "fallback_url", string = dto.fallbackUrl)
    }
}

internal fun serialize(dto: InternalLinkTypeInvoice): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeInvoice")
        put(key = "invoice_name", string = dto.invoiceName)
    }
}

internal fun serialize(dto: InternalLinkTypeLanguagePack): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeLanguagePack")
        put(key = "language_pack_id", string = dto.languagePackId)
    }
}

internal fun serialize(dto: InternalLinkTypeLiveStory): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeLiveStory")
        put(key = "story_poster_username", string = dto.storyPosterUsername)
    }
}

internal fun serialize(dto: InternalLinkTypeMainWebApp): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeMainWebApp")
        put(key = "bot_username", string = dto.botUsername)
        put(key = "start_parameter", string = dto.startParameter)
        put(key = "mode", value = dto.mode) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InternalLinkTypeMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeMessage")
        put(key = "url", string = dto.url)
    }
}

internal fun serialize(dto: InternalLinkTypeMessageDraft): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeMessageDraft")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "contains_link", boolean = dto.containsLink)
    }
}

internal fun serialize(dto: InternalLinkTypeMyProfilePage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeMyProfilePage")
        put(key = "section", string = dto.section)
    }
}

internal fun serialize(dto: InternalLinkTypeNewChannelChat): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeNewChannelChat")
    }
}

internal fun serialize(dto: InternalLinkTypeNewGroupChat): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeNewGroupChat")
    }
}

internal fun serialize(dto: InternalLinkTypeNewPrivateChat): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeNewPrivateChat")
    }
}

internal fun serialize(dto: InternalLinkTypeNewStory): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeNewStory")
        put(key = "content_type", value = dto.contentType) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InternalLinkTypeOauth): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeOauth")
        put(key = "url", string = dto.url)
    }
}

internal fun serialize(dto: InternalLinkTypePassportDataRequest): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypePassportDataRequest")
        put(key = "bot_user_id", long = dto.botUserId)
        put(key = "scope", string = dto.scope)
        put(key = "public_key", string = dto.publicKey)
        put(key = "nonce", string = dto.nonce)
        put(key = "callback_url", string = dto.callbackUrl)
    }
}

internal fun serialize(dto: InternalLinkTypePhoneNumberConfirmation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypePhoneNumberConfirmation")
        put(key = "hash", string = dto.hash)
        put(key = "phone_number", string = dto.phoneNumber)
    }
}

internal fun serialize(dto: InternalLinkTypePremiumFeaturesPage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypePremiumFeaturesPage")
        put(key = "referrer", string = dto.referrer)
    }
}

internal fun serialize(dto: InternalLinkTypePremiumGiftCode): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypePremiumGiftCode")
        put(key = "code", string = dto.code)
    }
}

internal fun serialize(dto: InternalLinkTypePremiumGiftPurchase): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypePremiumGiftPurchase")
        put(key = "referrer", string = dto.referrer)
    }
}

internal fun serialize(dto: InternalLinkTypeProxy): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeProxy")
        put(key = "proxy", value = dto.proxy) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InternalLinkTypePublicChat): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypePublicChat")
        put(key = "chat_username", string = dto.chatUsername)
        put(key = "draft_text", string = dto.draftText)
        put(key = "open_profile", boolean = dto.openProfile)
    }
}

internal fun serialize(dto: InternalLinkTypeQrCodeAuthentication): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeQrCodeAuthentication")
    }
}

internal fun serialize(dto: InternalLinkTypeRequestManagedBot): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeRequestManagedBot")
        put(key = "manager_bot_username", string = dto.managerBotUsername)
        put(key = "suggested_bot_username", string = dto.suggestedBotUsername)
        put(key = "suggested_bot_name", string = dto.suggestedBotName)
    }
}

internal fun serialize(dto: InternalLinkTypeRestorePurchases): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeRestorePurchases")
    }
}

internal fun serialize(dto: InternalLinkTypeSavedMessages): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeSavedMessages")
    }
}

internal fun serialize(dto: InternalLinkTypeSearch): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeSearch")
    }
}

internal fun serialize(dto: InternalLinkTypeSettings): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeSettings")
        put(key = "section", value = dto.section) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: InternalLinkTypeStarPurchase): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeStarPurchase")
        put(key = "star_count", long = dto.starCount)
        put(key = "purpose", string = dto.purpose)
    }
}

internal fun serialize(dto: InternalLinkTypeStickerSet): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeStickerSet")
        put(key = "sticker_set_name", string = dto.stickerSetName)
        put(key = "expect_custom_emoji", boolean = dto.expectCustomEmoji)
    }
}

internal fun serialize(dto: InternalLinkTypeStory): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeStory")
        put(key = "story_poster_username", string = dto.storyPosterUsername)
        put(key = "story_id", int = dto.storyId)
    }
}

internal fun serialize(dto: InternalLinkTypeStoryAlbum): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeStoryAlbum")
        put(key = "story_album_owner_username", string = dto.storyAlbumOwnerUsername)
        put(key = "story_album_id", int = dto.storyAlbumId)
    }
}

internal fun serialize(dto: InternalLinkTypeTextCompositionStyle): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeTextCompositionStyle")
        put(key = "style_name", string = dto.styleName)
    }
}

internal fun serialize(dto: InternalLinkTypeTheme): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeTheme")
        put(key = "theme_name", string = dto.themeName)
    }
}

internal fun serialize(dto: InternalLinkTypeUnknownDeepLink): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeUnknownDeepLink")
        put(key = "link", string = dto.link)
    }
}

internal fun serialize(dto: InternalLinkTypeUpgradedGift): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeUpgradedGift")
        put(key = "name", string = dto.name)
    }
}

internal fun serialize(dto: InternalLinkTypeUserPhoneNumber): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeUserPhoneNumber")
        put(key = "phone_number", string = dto.phoneNumber)
        put(key = "draft_text", string = dto.draftText)
        put(key = "open_profile", boolean = dto.openProfile)
    }
}

internal fun serialize(dto: InternalLinkTypeUserToken): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeUserToken")
        put(key = "token", string = dto.token)
    }
}

internal fun serialize(dto: InternalLinkTypeVideoChat): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeVideoChat")
        put(key = "chat_username", string = dto.chatUsername)
        put(key = "invite_hash", string = dto.inviteHash)
        put(key = "is_live_stream", boolean = dto.isLiveStream)
    }
}

internal fun serialize(dto: InternalLinkTypeWebApp): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "internalLinkTypeWebApp")
        put(key = "bot_username", string = dto.botUsername)
        put(key = "web_app_short_name", string = dto.webAppShortName)
        put(key = "start_parameter", string = dto.startParameter)
        put(key = "mode", value = dto.mode) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: MessageLink): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageLink")
        put(key = "link", string = dto.link)
        put(key = "is_public", boolean = dto.isPublic)
    }
}

internal fun serialize(dto: MessageLinkInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageLinkInfo")
        put(key = "is_public", boolean = dto.isPublic)
        put(key = "chat_id", long = dto.chatId)
        put(key = "topic_id", value = dto.topicId) { data -> serialize(dto = data) }
        put(key = "message", value = dto.message) { data -> serialize(dto = data) }
        put(key = "media_timestamp", int = dto.mediaTimestamp)
        put(key = "checklist_task_id", int = dto.checklistTaskId)
        put(key = "poll_option_id", string = dto.pollOptionId)
        put(key = "for_album", boolean = dto.forAlbum)
    }
}

internal fun serialize(dto: ChatBoostLink): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatBoostLink")
        put(key = "link", string = dto.link)
        put(key = "is_public", boolean = dto.isPublic)
    }
}

internal fun serialize(dto: ChatBoostLinkInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatBoostLinkInfo")
        put(key = "is_public", boolean = dto.isPublic)
        put(key = "chat_id", long = dto.chatId)
    }
}

internal fun serialize(dto: BlockListMain): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "blockListMain")
    }
}

internal fun serialize(dto: BlockListStories): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "blockListStories")
    }
}

internal fun serialize(dto: FileTypeNone): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "fileTypeNone")
    }
}

internal fun serialize(dto: FileTypeAnimation): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "fileTypeAnimation")
    }
}

internal fun serialize(dto: FileTypeAudio): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "fileTypeAudio")
    }
}

internal fun serialize(dto: FileTypeDocument): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "fileTypeDocument")
    }
}

internal fun serialize(dto: FileTypeLivePhotoVideo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "fileTypeLivePhotoVideo")
    }
}

internal fun serialize(dto: FileTypeNotificationSound): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "fileTypeNotificationSound")
    }
}

internal fun serialize(dto: FileTypePhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "fileTypePhoto")
    }
}

internal fun serialize(dto: FileTypePhotoStory): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "fileTypePhotoStory")
    }
}

internal fun serialize(dto: FileTypeProfilePhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "fileTypeProfilePhoto")
    }
}

internal fun serialize(dto: FileTypeSecret): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "fileTypeSecret")
    }
}

internal fun serialize(dto: FileTypeSecretThumbnail): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "fileTypeSecretThumbnail")
    }
}

internal fun serialize(dto: FileTypeSecure): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "fileTypeSecure")
    }
}

internal fun serialize(dto: FileTypeSelfDestructingLivePhotoVideo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "fileTypeSelfDestructingLivePhotoVideo")
    }
}

internal fun serialize(dto: FileTypeSelfDestructingPhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "fileTypeSelfDestructingPhoto")
    }
}

internal fun serialize(dto: FileTypeSelfDestructingVideo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "fileTypeSelfDestructingVideo")
    }
}

internal fun serialize(dto: FileTypeSelfDestructingVideoNote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "fileTypeSelfDestructingVideoNote")
    }
}

internal fun serialize(dto: FileTypeSelfDestructingVoiceNote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "fileTypeSelfDestructingVoiceNote")
    }
}

internal fun serialize(dto: FileTypeSticker): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "fileTypeSticker")
    }
}

internal fun serialize(dto: FileTypeThumbnail): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "fileTypeThumbnail")
    }
}

internal fun serialize(dto: FileTypeUnknown): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "fileTypeUnknown")
    }
}

internal fun serialize(dto: FileTypeVideo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "fileTypeVideo")
    }
}

internal fun serialize(dto: FileTypeVideoNote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "fileTypeVideoNote")
    }
}

internal fun serialize(dto: FileTypeVideoStory): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "fileTypeVideoStory")
    }
}

internal fun serialize(dto: FileTypeVoiceNote): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "fileTypeVoiceNote")
    }
}

internal fun serialize(dto: FileTypeWallpaper): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "fileTypeWallpaper")
    }
}

internal fun serialize(dto: StorageStatisticsByFileType): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storageStatisticsByFileType")
        put(key = "file_type", value = dto.fileType) { data -> serialize(dto = data) }
        put(key = "size", long = dto.size)
        put(key = "count", int = dto.count)
    }
}

internal fun serialize(dto: StorageStatisticsByChat): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storageStatisticsByChat")
        put(key = "chat_id", long = dto.chatId)
        put(key = "size", long = dto.size)
        put(key = "count", int = dto.count)
        put(key = "by_file_type", objects = dto.byFileType) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StorageStatistics): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storageStatistics")
        put(key = "size", long = dto.size)
        put(key = "count", int = dto.count)
        put(key = "by_chat", objects = dto.byChat) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StorageStatisticsFast): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storageStatisticsFast")
        put(key = "files_size", long = dto.filesSize)
        put(key = "file_count", int = dto.fileCount)
        put(key = "database_size", long = dto.databaseSize)
        put(key = "language_pack_database_size", long = dto.languagePackDatabaseSize)
        put(key = "log_size", long = dto.logSize)
    }
}

internal fun serialize(dto: DatabaseStatistics): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "databaseStatistics")
        put(key = "statistics", string = dto.statistics)
    }
}

internal fun serialize(dto: NetworkTypeNone): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "networkTypeNone")
    }
}

internal fun serialize(dto: NetworkTypeMobile): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "networkTypeMobile")
    }
}

internal fun serialize(dto: NetworkTypeMobileRoaming): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "networkTypeMobileRoaming")
    }
}

internal fun serialize(dto: NetworkTypeWiFi): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "networkTypeWiFi")
    }
}

internal fun serialize(dto: NetworkTypeOther): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "networkTypeOther")
    }
}

internal fun serialize(dto: NetworkStatisticsEntryFile): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "networkStatisticsEntryFile")
        put(key = "file_type", value = dto.fileType) { data -> serialize(dto = data) }
        put(key = "network_type", value = dto.networkType) { data -> serialize(dto = data) }
        put(key = "sent_bytes", long = dto.sentBytes)
        put(key = "received_bytes", long = dto.receivedBytes)
    }
}

internal fun serialize(dto: NetworkStatisticsEntryCall): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "networkStatisticsEntryCall")
        put(key = "network_type", value = dto.networkType) { data -> serialize(dto = data) }
        put(key = "sent_bytes", long = dto.sentBytes)
        put(key = "received_bytes", long = dto.receivedBytes)
        put(key = "duration", double = dto.duration)
    }
}

internal fun serialize(dto: NetworkStatistics): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "networkStatistics")
        put(key = "since_date", int = dto.sinceDate)
        put(key = "entries", objects = dto.entries) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: AutoDownloadSettings): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "autoDownloadSettings")
        put(key = "is_auto_download_enabled", boolean = dto.isAutoDownloadEnabled)
        put(key = "max_photo_file_size", int = dto.maxPhotoFileSize)
        put(key = "max_video_file_size", long = dto.maxVideoFileSize)
        put(key = "max_other_file_size", long = dto.maxOtherFileSize)
        put(key = "video_upload_bitrate", int = dto.videoUploadBitrate)
        put(key = "preload_large_videos", boolean = dto.preloadLargeVideos)
        put(key = "preload_next_audio", boolean = dto.preloadNextAudio)
        put(key = "preload_stories", boolean = dto.preloadStories)
        put(key = "use_less_data_for_calls", boolean = dto.useLessDataForCalls)
    }
}

internal fun serialize(dto: AutoDownloadSettingsPresets): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "autoDownloadSettingsPresets")
        put(key = "low", value = dto.low) { data -> serialize(dto = data) }
        put(key = "medium", value = dto.medium) { data -> serialize(dto = data) }
        put(key = "high", value = dto.high) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: AutosaveSettingsScopePrivateChats): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "autosaveSettingsScopePrivateChats")
    }
}

internal fun serialize(dto: AutosaveSettingsScopeGroupChats): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "autosaveSettingsScopeGroupChats")
    }
}

internal fun serialize(dto: AutosaveSettingsScopeChannelChats): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "autosaveSettingsScopeChannelChats")
    }
}

internal fun serialize(dto: AutosaveSettingsScopeChat): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "autosaveSettingsScopeChat")
        put(key = "chat_id", long = dto.chatId)
    }
}

internal fun serialize(dto: ScopeAutosaveSettings): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "scopeAutosaveSettings")
        put(key = "autosave_photos", boolean = dto.autosavePhotos)
        put(key = "autosave_videos", boolean = dto.autosaveVideos)
        put(key = "max_video_file_size", long = dto.maxVideoFileSize)
    }
}

internal fun serialize(dto: AutosaveSettingsException): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "autosaveSettingsException")
        put(key = "chat_id", long = dto.chatId)
        put(key = "settings", value = dto.settings) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: AutosaveSettings): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "autosaveSettings")
        put(key = "private_chat_settings", value = dto.privateChatSettings) { data -> serialize(dto = data) }
        put(key = "group_settings", value = dto.groupSettings) { data -> serialize(dto = data) }
        put(key = "channel_settings", value = dto.channelSettings) { data -> serialize(dto = data) }
        put(key = "exceptions", objects = dto.exceptions) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: WebDomainException): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "webDomainException")
        put(key = "url", string = dto.url)
        put(key = "domain", string = dto.domain)
        put(key = "title", string = dto.title)
        put(key = "favicon_custom_emoji_id", long = dto.faviconCustomEmojiId)
    }
}

internal fun serialize(dto: WebBrowserSettings): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "webBrowserSettings")
        put(key = "open_external_browser", boolean = dto.openExternalBrowser)
        put(key = "external_exceptions", objects = dto.externalExceptions) { data -> serialize(dto = data) }
        put(key = "in_app_exceptions", objects = dto.inAppExceptions) { data -> serialize(dto = data) }
        put(key = "display_close_button", boolean = dto.displayCloseButton)
    }
}

internal fun serialize(dto: WebBrowserTypeExternal): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "webBrowserTypeExternal")
    }
}

internal fun serialize(dto: WebBrowserTypeInApp): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "webBrowserTypeInApp")
    }
}

internal fun serialize(dto: ConnectionStateWaitingForNetwork): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "connectionStateWaitingForNetwork")
    }
}

internal fun serialize(dto: ConnectionStateConnectingToProxy): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "connectionStateConnectingToProxy")
    }
}

internal fun serialize(dto: ConnectionStateConnecting): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "connectionStateConnecting")
    }
}

internal fun serialize(dto: ConnectionStateUpdating): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "connectionStateUpdating")
    }
}

internal fun serialize(dto: ConnectionStateReady): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "connectionStateReady")
    }
}

internal fun serialize(dto: AgeVerificationParameters): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "ageVerificationParameters")
        put(key = "min_age", int = dto.minAge)
        put(key = "verification_bot_username", string = dto.verificationBotUsername)
        put(key = "country", string = dto.country)
    }
}

internal fun serialize(dto: TopChatCategoryUsers): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "topChatCategoryUsers")
    }
}

internal fun serialize(dto: TopChatCategoryBots): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "topChatCategoryBots")
    }
}

internal fun serialize(dto: TopChatCategoryGroups): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "topChatCategoryGroups")
    }
}

internal fun serialize(dto: TopChatCategoryChannels): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "topChatCategoryChannels")
    }
}

internal fun serialize(dto: TopChatCategoryInlineBots): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "topChatCategoryInlineBots")
    }
}

internal fun serialize(dto: TopChatCategoryGuestBots): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "topChatCategoryGuestBots")
    }
}

internal fun serialize(dto: TopChatCategoryWebAppBots): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "topChatCategoryWebAppBots")
    }
}

internal fun serialize(dto: TopChatCategoryCalls): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "topChatCategoryCalls")
    }
}

internal fun serialize(dto: TopChatCategoryForwardChats): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "topChatCategoryForwardChats")
    }
}

internal fun serialize(dto: FoundPosition): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "foundPosition")
        put(key = "position", int = dto.position)
    }
}

internal fun serialize(dto: FoundPositions): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "foundPositions")
        put(key = "total_count", int = dto.totalCount)
        put(key = "positions", ints = dto.positions)
    }
}

internal fun serialize(dto: TMeUrlTypeUser): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "tMeUrlTypeUser")
        put(key = "user_id", long = dto.userId)
    }
}

internal fun serialize(dto: TMeUrlTypeSupergroup): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "tMeUrlTypeSupergroup")
        put(key = "supergroup_id", long = dto.supergroupId)
    }
}

internal fun serialize(dto: TMeUrlTypeChatInvite): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "tMeUrlTypeChatInvite")
        put(key = "info", value = dto.info) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: TMeUrlTypeStickerSet): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "tMeUrlTypeStickerSet")
        put(key = "sticker_set_id", long = dto.stickerSetId)
    }
}

internal fun serialize(dto: TMeUrl): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "tMeUrl")
        put(key = "url", string = dto.url)
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: TMeUrls): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "tMeUrls")
        put(key = "urls", objects = dto.urls) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: SuggestedActionEnableArchiveAndMuteNewChats): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "suggestedActionEnableArchiveAndMuteNewChats")
    }
}

internal fun serialize(dto: SuggestedActionCheckPassword): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "suggestedActionCheckPassword")
    }
}

internal fun serialize(dto: SuggestedActionCheckPhoneNumber): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "suggestedActionCheckPhoneNumber")
    }
}

internal fun serialize(dto: SuggestedActionViewChecksHint): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "suggestedActionViewChecksHint")
    }
}

internal fun serialize(dto: SuggestedActionConvertToBroadcastGroup): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "suggestedActionConvertToBroadcastGroup")
        put(key = "supergroup_id", long = dto.supergroupId)
    }
}

internal fun serialize(dto: SuggestedActionSetPassword): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "suggestedActionSetPassword")
        put(key = "authorization_delay", int = dto.authorizationDelay)
    }
}

internal fun serialize(dto: SuggestedActionUpgradePremium): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "suggestedActionUpgradePremium")
    }
}

internal fun serialize(dto: SuggestedActionRestorePremium): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "suggestedActionRestorePremium")
    }
}

internal fun serialize(dto: SuggestedActionSubscribeToAnnualPremium): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "suggestedActionSubscribeToAnnualPremium")
    }
}

internal fun serialize(dto: SuggestedActionGiftPremiumForChristmas): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "suggestedActionGiftPremiumForChristmas")
    }
}

internal fun serialize(dto: SuggestedActionSetBirthdate): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "suggestedActionSetBirthdate")
    }
}

internal fun serialize(dto: SuggestedActionSetProfilePhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "suggestedActionSetProfilePhoto")
    }
}

internal fun serialize(dto: SuggestedActionExtendPremium): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "suggestedActionExtendPremium")
        put(key = "manage_premium_subscription_url", string = dto.managePremiumSubscriptionUrl)
    }
}

internal fun serialize(dto: SuggestedActionExtendStarSubscriptions): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "suggestedActionExtendStarSubscriptions")
    }
}

internal fun serialize(dto: SuggestedActionCustom): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "suggestedActionCustom")
        put(key = "name", string = dto.name)
        put(key = "title", value = dto.title) { data -> serialize(dto = data) }
        put(key = "description", value = dto.description) { data -> serialize(dto = data) }
        put(key = "url", string = dto.url)
    }
}

internal fun serialize(dto: SuggestedActionSetLoginEmailAddress): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "suggestedActionSetLoginEmailAddress")
        put(key = "can_be_hidden", boolean = dto.canBeHidden)
    }
}

internal fun serialize(dto: SuggestedActionAddLoginPasskey): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "suggestedActionAddLoginPasskey")
    }
}

internal fun serialize(dto: Count): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "count")
        put(key = "count", int = dto.count)
    }
}

internal fun serialize(dto: Text): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "text")
        put(key = "text", string = dto.text)
    }
}

internal fun serialize(dto: Data): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "data")
        put(key = "data", bytes = dto.data)
    }
}

internal fun serialize(dto: Seconds): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "seconds")
        put(key = "seconds", double = dto.seconds)
    }
}

internal fun serialize(dto: FileDownloadedPrefixSize): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "fileDownloadedPrefixSize")
        put(key = "size", long = dto.size)
    }
}

internal fun serialize(dto: StarCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starCount")
        put(key = "star_count", long = dto.starCount)
    }
}

internal fun serialize(dto: DeepLinkInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "deepLinkInfo")
        put(key = "text", value = dto.text) { data -> serialize(dto = data) }
        put(key = "need_update_application", boolean = dto.needUpdateApplication)
    }
}

internal fun serialize(dto: TextParseModeMarkdown): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "textParseModeMarkdown")
        put(key = "version", int = dto.version)
    }
}

internal fun serialize(dto: TextParseModeHTML): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "textParseModeHTML")
    }
}

internal fun serialize(dto: ProxyTypeSocks5): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "proxyTypeSocks5")
        put(key = "username", string = dto.username)
        put(key = "password", string = dto.password)
    }
}

internal fun serialize(dto: ProxyTypeHttp): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "proxyTypeHttp")
        put(key = "username", string = dto.username)
        put(key = "password", string = dto.password)
        put(key = "http_only", boolean = dto.httpOnly)
    }
}

internal fun serialize(dto: ProxyTypeMtproto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "proxyTypeMtproto")
        put(key = "secret", string = dto.secret)
    }
}

internal fun serialize(dto: AddedProxy): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "addedProxy")
        put(key = "id", int = dto.id)
        put(key = "last_used_date", int = dto.lastUsedDate)
        put(key = "is_enabled", boolean = dto.isEnabled)
        put(key = "comment", string = dto.comment)
        put(key = "proxy", value = dto.proxy) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: AddedProxies): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "addedProxies")
        put(key = "proxies", objects = dto.proxies) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: NewSticker): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "newSticker")
        put(key = "sticker", value = dto.sticker) { data -> serialize(dto = data) }
        put(key = "format", value = dto.format) { data -> serialize(dto = data) }
        put(key = "emojis", string = dto.emojis)
        put(key = "mask_position", value = dto.maskPosition) { data -> serialize(dto = data) }
        put(key = "keywords", strings = dto.keywords)
    }
}

internal fun serialize(dto: DateRange): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "dateRange")
        put(key = "start_date", int = dto.startDate)
        put(key = "end_date", int = dto.endDate)
    }
}

internal fun serialize(dto: StatisticalValue): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "statisticalValue")
        put(key = "value", double = dto.value)
        put(key = "previous_value", double = dto.previousValue)
        put(key = "growth_rate_percentage", double = dto.growthRatePercentage)
    }
}

internal fun serialize(dto: StatisticalGraphData): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "statisticalGraphData")
        put(key = "json_data", string = dto.jsonData)
        put(key = "zoom_token", string = dto.zoomToken)
    }
}

internal fun serialize(dto: StatisticalGraphAsync): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "statisticalGraphAsync")
        put(key = "token", string = dto.token)
    }
}

internal fun serialize(dto: StatisticalGraphError): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "statisticalGraphError")
        put(key = "error_message", string = dto.errorMessage)
    }
}

internal fun serialize(dto: ChatStatisticsObjectTypeMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatStatisticsObjectTypeMessage")
        put(key = "message_id", long = dto.messageId)
    }
}

internal fun serialize(dto: ChatStatisticsObjectTypeStory): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatStatisticsObjectTypeStory")
        put(key = "story_id", int = dto.storyId)
    }
}

internal fun serialize(dto: ChatStatisticsInteractionInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatStatisticsInteractionInfo")
        put(key = "object_type", value = dto.objectType) { data -> serialize(dto = data) }
        put(key = "view_count", int = dto.viewCount)
        put(key = "forward_count", int = dto.forwardCount)
        put(key = "reaction_count", int = dto.reactionCount)
    }
}

internal fun serialize(dto: ChatStatisticsMessageSenderInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatStatisticsMessageSenderInfo")
        put(key = "user_id", long = dto.userId)
        put(key = "sent_message_count", int = dto.sentMessageCount)
        put(key = "average_character_count", int = dto.averageCharacterCount)
    }
}

internal fun serialize(dto: ChatStatisticsAdministratorActionsInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatStatisticsAdministratorActionsInfo")
        put(key = "user_id", long = dto.userId)
        put(key = "deleted_message_count", int = dto.deletedMessageCount)
        put(key = "banned_user_count", int = dto.bannedUserCount)
        put(key = "restricted_user_count", int = dto.restrictedUserCount)
    }
}

internal fun serialize(dto: ChatStatisticsInviterInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatStatisticsInviterInfo")
        put(key = "user_id", long = dto.userId)
        put(key = "added_member_count", int = dto.addedMemberCount)
    }
}

internal fun serialize(dto: ChatStatisticsSupergroup): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatStatisticsSupergroup")
        put(key = "period", value = dto.period) { data -> serialize(dto = data) }
        put(key = "member_count", value = dto.memberCount) { data -> serialize(dto = data) }
        put(key = "message_count", value = dto.messageCount) { data -> serialize(dto = data) }
        put(key = "viewer_count", value = dto.viewerCount) { data -> serialize(dto = data) }
        put(key = "sender_count", value = dto.senderCount) { data -> serialize(dto = data) }
        put(key = "member_count_graph", value = dto.memberCountGraph) { data -> serialize(dto = data) }
        put(key = "join_graph", value = dto.joinGraph) { data -> serialize(dto = data) }
        put(key = "join_by_source_graph", value = dto.joinBySourceGraph) { data -> serialize(dto = data) }
        put(key = "language_graph", value = dto.languageGraph) { data -> serialize(dto = data) }
        put(key = "message_content_graph", value = dto.messageContentGraph) { data -> serialize(dto = data) }
        put(key = "action_graph", value = dto.actionGraph) { data -> serialize(dto = data) }
        put(key = "day_graph", value = dto.dayGraph) { data -> serialize(dto = data) }
        put(key = "week_graph", value = dto.weekGraph) { data -> serialize(dto = data) }
        put(key = "top_senders", objects = dto.topSenders) { data -> serialize(dto = data) }
        put(key = "top_administrators", objects = dto.topAdministrators) { data -> serialize(dto = data) }
        put(key = "top_inviters", objects = dto.topInviters) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatStatisticsChannel): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatStatisticsChannel")
        put(key = "period", value = dto.period) { data -> serialize(dto = data) }
        put(key = "member_count", value = dto.memberCount) { data -> serialize(dto = data) }
        put(key = "mean_message_view_count", value = dto.meanMessageViewCount) { data -> serialize(dto = data) }
        put(key = "mean_message_share_count", value = dto.meanMessageShareCount) { data -> serialize(dto = data) }
        put(key = "mean_message_reaction_count", value = dto.meanMessageReactionCount) { data -> serialize(dto = data) }
        put(key = "mean_story_view_count", value = dto.meanStoryViewCount) { data -> serialize(dto = data) }
        put(key = "mean_story_share_count", value = dto.meanStoryShareCount) { data -> serialize(dto = data) }
        put(key = "mean_story_reaction_count", value = dto.meanStoryReactionCount) { data -> serialize(dto = data) }
        put(key = "enabled_notifications_percentage", double = dto.enabledNotificationsPercentage)
        put(key = "member_count_graph", value = dto.memberCountGraph) { data -> serialize(dto = data) }
        put(key = "join_graph", value = dto.joinGraph) { data -> serialize(dto = data) }
        put(key = "mute_graph", value = dto.muteGraph) { data -> serialize(dto = data) }
        put(key = "view_count_by_hour_graph", value = dto.viewCountByHourGraph) { data -> serialize(dto = data) }
        put(key = "view_count_by_source_graph", value = dto.viewCountBySourceGraph) { data -> serialize(dto = data) }
        put(key = "join_by_source_graph", value = dto.joinBySourceGraph) { data -> serialize(dto = data) }
        put(key = "language_graph", value = dto.languageGraph) { data -> serialize(dto = data) }
        put(key = "message_interaction_graph", value = dto.messageInteractionGraph) { data -> serialize(dto = data) }
        put(key = "message_reaction_graph", value = dto.messageReactionGraph) { data -> serialize(dto = data) }
        put(key = "story_interaction_graph", value = dto.storyInteractionGraph) { data -> serialize(dto = data) }
        put(key = "story_reaction_graph", value = dto.storyReactionGraph) { data -> serialize(dto = data) }
        put(key = "instant_view_interaction_graph", value = dto.instantViewInteractionGraph) { data -> serialize(dto = data) }
        put(key = "recent_interactions", objects = dto.recentInteractions) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatRevenueAmount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatRevenueAmount")
        put(key = "cryptocurrency", string = dto.cryptocurrency)
        put(key = "total_amount", long = dto.totalAmount)
        put(key = "balance_amount", long = dto.balanceAmount)
        put(key = "available_amount", long = dto.availableAmount)
        put(key = "withdrawal_enabled", boolean = dto.withdrawalEnabled)
    }
}

internal fun serialize(dto: ChatRevenueStatistics): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatRevenueStatistics")
        put(key = "revenue_by_hour_graph", value = dto.revenueByHourGraph) { data -> serialize(dto = data) }
        put(key = "revenue_graph", value = dto.revenueGraph) { data -> serialize(dto = data) }
        put(key = "revenue_amount", value = dto.revenueAmount) { data -> serialize(dto = data) }
        put(key = "usd_rate", double = dto.usdRate)
    }
}

internal fun serialize(dto: MessageStatistics): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "messageStatistics")
        put(key = "message_interaction_graph", value = dto.messageInteractionGraph) { data -> serialize(dto = data) }
        put(key = "message_reaction_graph", value = dto.messageReactionGraph) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: StoryStatistics): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "storyStatistics")
        put(key = "story_interaction_graph", value = dto.storyInteractionGraph) { data -> serialize(dto = data) }
        put(key = "story_reaction_graph", value = dto.storyReactionGraph) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: PollVoteStatistics): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "pollVoteStatistics")
        put(key = "vote_graph", value = dto.voteGraph) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: RevenueWithdrawalStatePending): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "revenueWithdrawalStatePending")
    }
}

internal fun serialize(dto: RevenueWithdrawalStateSucceeded): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "revenueWithdrawalStateSucceeded")
        put(key = "date", int = dto.date)
        put(key = "url", string = dto.url)
    }
}

internal fun serialize(dto: RevenueWithdrawalStateFailed): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "revenueWithdrawalStateFailed")
    }
}

internal fun serialize(dto: ChatRevenueTransactionTypeUnsupported): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatRevenueTransactionTypeUnsupported")
    }
}

internal fun serialize(dto: ChatRevenueTransactionTypeSponsoredMessageEarnings): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatRevenueTransactionTypeSponsoredMessageEarnings")
        put(key = "start_date", int = dto.startDate)
        put(key = "end_date", int = dto.endDate)
    }
}

internal fun serialize(dto: ChatRevenueTransactionTypeSuggestedPostEarnings): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatRevenueTransactionTypeSuggestedPostEarnings")
        put(key = "user_id", long = dto.userId)
    }
}

internal fun serialize(dto: ChatRevenueTransactionTypeFragmentWithdrawal): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatRevenueTransactionTypeFragmentWithdrawal")
        put(key = "withdrawal_date", int = dto.withdrawalDate)
        put(key = "state", value = dto.state) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatRevenueTransactionTypeFragmentRefund): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatRevenueTransactionTypeFragmentRefund")
        put(key = "refund_date", int = dto.refundDate)
    }
}

internal fun serialize(dto: ChatRevenueTransaction): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatRevenueTransaction")
        put(key = "cryptocurrency", string = dto.cryptocurrency)
        put(key = "cryptocurrency_amount", long = dto.cryptocurrencyAmount)
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: ChatRevenueTransactions): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "chatRevenueTransactions")
        put(key = "gram_amount", long = dto.gramAmount)
        put(key = "transactions", objects = dto.transactions) { data -> serialize(dto = data) }
        put(key = "next_offset", string = dto.nextOffset)
    }
}

internal fun serialize(dto: StarRevenueStatus): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starRevenueStatus")
        put(key = "total_amount", value = dto.totalAmount) { data -> serialize(dto = data) }
        put(key = "current_amount", value = dto.currentAmount) { data -> serialize(dto = data) }
        put(key = "available_amount", value = dto.availableAmount) { data -> serialize(dto = data) }
        put(key = "withdrawal_enabled", boolean = dto.withdrawalEnabled)
        put(key = "next_withdrawal_in", int = dto.nextWithdrawalIn)
    }
}

internal fun serialize(dto: StarRevenueStatistics): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "starRevenueStatistics")
        put(key = "revenue_by_day_graph", value = dto.revenueByDayGraph) { data -> serialize(dto = data) }
        put(key = "status", value = dto.status) { data -> serialize(dto = data) }
        put(key = "usd_rate", double = dto.usdRate)
    }
}

internal fun serialize(dto: GramRevenueStatus): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "gramRevenueStatus")
        put(key = "total_amount", long = dto.totalAmount)
        put(key = "balance_amount", long = dto.balanceAmount)
        put(key = "available_amount", long = dto.availableAmount)
        put(key = "withdrawal_enabled", boolean = dto.withdrawalEnabled)
    }
}

internal fun serialize(dto: GramRevenueStatistics): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "gramRevenueStatistics")
        put(key = "revenue_by_day_graph", value = dto.revenueByDayGraph) { data -> serialize(dto = data) }
        put(key = "status", value = dto.status) { data -> serialize(dto = data) }
        put(key = "usd_rate", double = dto.usdRate)
    }
}

internal fun serialize(dto: Point): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "point")
        put(key = "x", double = dto.x)
        put(key = "y", double = dto.y)
    }
}

internal fun serialize(dto: VectorPathCommandLine): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "vectorPathCommandLine")
        put(key = "end_point", value = dto.endPoint) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: VectorPathCommandCubicBezierCurve): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "vectorPathCommandCubicBezierCurve")
        put(key = "start_control_point", value = dto.startControlPoint) { data -> serialize(dto = data) }
        put(key = "end_control_point", value = dto.endControlPoint) { data -> serialize(dto = data) }
        put(key = "end_point", value = dto.endPoint) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: BotCommandScopeDefault): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "botCommandScopeDefault")
    }
}

internal fun serialize(dto: BotCommandScopeAllPrivateChats): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "botCommandScopeAllPrivateChats")
    }
}

internal fun serialize(dto: BotCommandScopeAllGroupChats): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "botCommandScopeAllGroupChats")
    }
}

internal fun serialize(dto: BotCommandScopeAllChatAdministrators): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "botCommandScopeAllChatAdministrators")
    }
}

internal fun serialize(dto: BotCommandScopeChat): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "botCommandScopeChat")
        put(key = "chat_id", long = dto.chatId)
    }
}

internal fun serialize(dto: BotCommandScopeChatAdministrators): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "botCommandScopeChatAdministrators")
        put(key = "chat_id", long = dto.chatId)
    }
}

internal fun serialize(dto: BotCommandScopeChatMember): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "botCommandScopeChatMember")
        put(key = "chat_id", long = dto.chatId)
        put(key = "user_id", long = dto.userId)
    }
}

internal fun serialize(dto: PhoneNumberCodeTypeChange): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "phoneNumberCodeTypeChange")
    }
}

internal fun serialize(dto: PhoneNumberCodeTypeVerify): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "phoneNumberCodeTypeVerify")
    }
}

internal fun serialize(dto: PhoneNumberCodeTypeConfirmOwnership): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "phoneNumberCodeTypeConfirmOwnership")
        put(key = "hash", string = dto.hash)
    }
}

internal fun serialize(dto: UpdateAuthorizationState): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateAuthorizationState")
        put(key = "authorization_state", value = dto.authorizationState) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateNewMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateNewMessage")
        put(key = "message", value = dto.message) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateMessageSendAcknowledged): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateMessageSendAcknowledged")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_id", long = dto.messageId)
    }
}

internal fun serialize(dto: UpdateMessageSendSucceeded): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateMessageSendSucceeded")
        put(key = "message", value = dto.message) { data -> serialize(dto = data) }
        put(key = "old_message_id", long = dto.oldMessageId)
    }
}

internal fun serialize(dto: UpdateMessageSendFailed): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateMessageSendFailed")
        put(key = "message", value = dto.message) { data -> serialize(dto = data) }
        put(key = "old_message_id", long = dto.oldMessageId)
        put(key = "error", value = dto.error) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateMessageContent): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateMessageContent")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_id", long = dto.messageId)
        put(key = "new_content", value = dto.newContent) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateMessageEdited): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateMessageEdited")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_id", long = dto.messageId)
        put(key = "edit_date", int = dto.editDate)
        put(key = "reply_markup", value = dto.replyMarkup) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateMessageIsPinned): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateMessageIsPinned")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_id", long = dto.messageId)
        put(key = "is_pinned", boolean = dto.isPinned)
    }
}

internal fun serialize(dto: UpdateMessageInteractionInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateMessageInteractionInfo")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_id", long = dto.messageId)
        put(key = "interaction_info", value = dto.interactionInfo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateMessageContentOpened): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateMessageContentOpened")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_id", long = dto.messageId)
    }
}

internal fun serialize(dto: UpdateMessageMentionRead): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateMessageMentionRead")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_id", long = dto.messageId)
        put(key = "unread_mention_count", int = dto.unreadMentionCount)
    }
}

internal fun serialize(dto: UpdateMessageUnreadReactions): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateMessageUnreadReactions")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_id", long = dto.messageId)
        put(key = "unread_reactions", objects = dto.unreadReactions) { data -> serialize(dto = data) }
        put(key = "unread_reaction_count", int = dto.unreadReactionCount)
    }
}

internal fun serialize(dto: UpdateMessageContainsUnreadPollVotes): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateMessageContainsUnreadPollVotes")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_id", long = dto.messageId)
        put(key = "contains_unread_poll_votes", boolean = dto.containsUnreadPollVotes)
        put(key = "unread_poll_vote_count", int = dto.unreadPollVoteCount)
    }
}

internal fun serialize(dto: UpdateMessageFactCheck): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateMessageFactCheck")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_id", long = dto.messageId)
        put(key = "fact_check", value = dto.factCheck) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateMessageSuggestedPostInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateMessageSuggestedPostInfo")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_id", long = dto.messageId)
        put(key = "suggested_post_info", value = dto.suggestedPostInfo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateMessageLiveLocationViewed): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateMessageLiveLocationViewed")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_id", long = dto.messageId)
    }
}

internal fun serialize(dto: UpdateVideoPublished): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateVideoPublished")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_id", long = dto.messageId)
    }
}

internal fun serialize(dto: UpdateNewChat): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateNewChat")
        put(key = "chat", value = dto.chat) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateChatTitle): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatTitle")
        put(key = "chat_id", long = dto.chatId)
        put(key = "title", string = dto.title)
    }
}

internal fun serialize(dto: UpdateChatPhoto): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatPhoto")
        put(key = "chat_id", long = dto.chatId)
        put(key = "photo", value = dto.photo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateChatAccentColors): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatAccentColors")
        put(key = "chat_id", long = dto.chatId)
        put(key = "accent_color_id", int = dto.accentColorId)
        put(key = "background_custom_emoji_id", long = dto.backgroundCustomEmojiId)
        put(key = "upgraded_gift_colors", value = dto.upgradedGiftColors) { data -> serialize(dto = data) }
        put(key = "profile_accent_color_id", int = dto.profileAccentColorId)
        put(key = "profile_background_custom_emoji_id", long = dto.profileBackgroundCustomEmojiId)
    }
}

internal fun serialize(dto: UpdateChatPermissions): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatPermissions")
        put(key = "chat_id", long = dto.chatId)
        put(key = "permissions", value = dto.permissions) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateChatLastMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatLastMessage")
        put(key = "chat_id", long = dto.chatId)
        put(key = "last_message", value = dto.lastMessage) { data -> serialize(dto = data) }
        put(key = "positions", objects = dto.positions) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateChatPosition): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatPosition")
        put(key = "chat_id", long = dto.chatId)
        put(key = "position", value = dto.position) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateChatAddedToList): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatAddedToList")
        put(key = "chat_id", long = dto.chatId)
        put(key = "chat_list", value = dto.chatList) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateChatRemovedFromList): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatRemovedFromList")
        put(key = "chat_id", long = dto.chatId)
        put(key = "chat_list", value = dto.chatList) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateChatReadInbox): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatReadInbox")
        put(key = "chat_id", long = dto.chatId)
        put(key = "last_read_inbox_message_id", long = dto.lastReadInboxMessageId)
        put(key = "unread_count", int = dto.unreadCount)
    }
}

internal fun serialize(dto: UpdateChatReadOutbox): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatReadOutbox")
        put(key = "chat_id", long = dto.chatId)
        put(key = "last_read_outbox_message_id", long = dto.lastReadOutboxMessageId)
    }
}

internal fun serialize(dto: UpdateChatActionBar): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatActionBar")
        put(key = "chat_id", long = dto.chatId)
        put(key = "action_bar", value = dto.actionBar) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateChatBusinessBotManageBar): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatBusinessBotManageBar")
        put(key = "chat_id", long = dto.chatId)
        put(key = "business_bot_manage_bar", value = dto.businessBotManageBar) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateChatAvailableReactions): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatAvailableReactions")
        put(key = "chat_id", long = dto.chatId)
        put(key = "available_reactions", value = dto.availableReactions) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateChatDraftMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatDraftMessage")
        put(key = "chat_id", long = dto.chatId)
        put(key = "draft_message", value = dto.draftMessage) { data -> serialize(dto = data) }
        put(key = "positions", objects = dto.positions) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateChatEmojiStatus): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatEmojiStatus")
        put(key = "chat_id", long = dto.chatId)
        put(key = "emoji_status", value = dto.emojiStatus) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateChatMessageSender): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatMessageSender")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_sender_id", value = dto.messageSenderId) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateChatMessageAutoDeleteTime): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatMessageAutoDeleteTime")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_auto_delete_time", int = dto.messageAutoDeleteTime)
    }
}

internal fun serialize(dto: UpdateChatNotificationSettings): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatNotificationSettings")
        put(key = "chat_id", long = dto.chatId)
        put(key = "notification_settings", value = dto.notificationSettings) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateChatPendingJoinRequests): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatPendingJoinRequests")
        put(key = "chat_id", long = dto.chatId)
        put(key = "pending_join_requests", value = dto.pendingJoinRequests) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateChatReplyMarkup): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatReplyMarkup")
        put(key = "chat_id", long = dto.chatId)
        put(key = "reply_markup_message", value = dto.replyMarkupMessage) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateChatBackground): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatBackground")
        put(key = "chat_id", long = dto.chatId)
        put(key = "background", value = dto.background) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateChatTheme): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatTheme")
        put(key = "chat_id", long = dto.chatId)
        put(key = "theme", value = dto.theme) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateChatUnreadMentionCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatUnreadMentionCount")
        put(key = "chat_id", long = dto.chatId)
        put(key = "unread_mention_count", int = dto.unreadMentionCount)
    }
}

internal fun serialize(dto: UpdateChatUnreadReactionCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatUnreadReactionCount")
        put(key = "chat_id", long = dto.chatId)
        put(key = "unread_reaction_count", int = dto.unreadReactionCount)
    }
}

internal fun serialize(dto: UpdateChatUnreadPollVoteCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatUnreadPollVoteCount")
        put(key = "chat_id", long = dto.chatId)
        put(key = "unread_poll_vote_count", int = dto.unreadPollVoteCount)
    }
}

internal fun serialize(dto: UpdateChatVideoChat): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatVideoChat")
        put(key = "chat_id", long = dto.chatId)
        put(key = "video_chat", value = dto.videoChat) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateChatDefaultDisableNotification): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatDefaultDisableNotification")
        put(key = "chat_id", long = dto.chatId)
        put(key = "default_disable_notification", boolean = dto.defaultDisableNotification)
    }
}

internal fun serialize(dto: UpdateChatHasProtectedContent): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatHasProtectedContent")
        put(key = "chat_id", long = dto.chatId)
        put(key = "has_protected_content", boolean = dto.hasProtectedContent)
    }
}

internal fun serialize(dto: UpdateChatIsTranslatable): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatIsTranslatable")
        put(key = "chat_id", long = dto.chatId)
        put(key = "is_translatable", boolean = dto.isTranslatable)
    }
}

internal fun serialize(dto: UpdateChatIsMarkedAsUnread): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatIsMarkedAsUnread")
        put(key = "chat_id", long = dto.chatId)
        put(key = "is_marked_as_unread", boolean = dto.isMarkedAsUnread)
    }
}

internal fun serialize(dto: UpdateChatViewAsTopics): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatViewAsTopics")
        put(key = "chat_id", long = dto.chatId)
        put(key = "view_as_topics", boolean = dto.viewAsTopics)
    }
}

internal fun serialize(dto: UpdateChatBlockList): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatBlockList")
        put(key = "chat_id", long = dto.chatId)
        put(key = "block_list", value = dto.blockList) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateChatHasScheduledMessages): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatHasScheduledMessages")
        put(key = "chat_id", long = dto.chatId)
        put(key = "has_scheduled_messages", boolean = dto.hasScheduledMessages)
    }
}

internal fun serialize(dto: UpdateChatFolders): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatFolders")
        put(key = "chat_folders", objects = dto.chatFolders) { data -> serialize(dto = data) }
        put(key = "main_chat_list_position", int = dto.mainChatListPosition)
        put(key = "are_tags_enabled", boolean = dto.areTagsEnabled)
    }
}

internal fun serialize(dto: UpdateChatOnlineMemberCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatOnlineMemberCount")
        put(key = "chat_id", long = dto.chatId)
        put(key = "online_member_count", int = dto.onlineMemberCount)
    }
}

internal fun serialize(dto: UpdateSavedMessagesTopic): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateSavedMessagesTopic")
        put(key = "topic", value = dto.topic) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateSavedMessagesTopicCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateSavedMessagesTopicCount")
        put(key = "topic_count", int = dto.topicCount)
    }
}

internal fun serialize(dto: UpdateDirectMessagesChatTopic): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateDirectMessagesChatTopic")
        put(key = "topic", value = dto.topic) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateTopicMessageCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateTopicMessageCount")
        put(key = "chat_id", long = dto.chatId)
        put(key = "topic_id", value = dto.topicId) { data -> serialize(dto = data) }
        put(key = "message_count", int = dto.messageCount)
    }
}

internal fun serialize(dto: UpdateQuickReplyShortcut): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateQuickReplyShortcut")
        put(key = "shortcut", value = dto.shortcut) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateQuickReplyShortcutDeleted): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateQuickReplyShortcutDeleted")
        put(key = "shortcut_id", int = dto.shortcutId)
    }
}

internal fun serialize(dto: UpdateQuickReplyShortcuts): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateQuickReplyShortcuts")
        put(key = "shortcut_ids", ints = dto.shortcutIds)
    }
}

internal fun serialize(dto: UpdateQuickReplyShortcutMessages): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateQuickReplyShortcutMessages")
        put(key = "shortcut_id", int = dto.shortcutId)
        put(key = "messages", objects = dto.messages) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateForumTopicInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateForumTopicInfo")
        put(key = "info", value = dto.info) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateForumTopic): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateForumTopic")
        put(key = "chat_id", long = dto.chatId)
        put(key = "forum_topic_id", int = dto.forumTopicId)
        put(key = "is_pinned", boolean = dto.isPinned)
        put(key = "last_read_inbox_message_id", long = dto.lastReadInboxMessageId)
        put(key = "last_read_outbox_message_id", long = dto.lastReadOutboxMessageId)
        put(key = "unread_mention_count", int = dto.unreadMentionCount)
        put(key = "unread_reaction_count", int = dto.unreadReactionCount)
        put(key = "unread_poll_vote_count", int = dto.unreadPollVoteCount)
        put(key = "notification_settings", value = dto.notificationSettings) { data -> serialize(dto = data) }
        put(key = "draft_message", value = dto.draftMessage) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateScopeNotificationSettings): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateScopeNotificationSettings")
        put(key = "scope", value = dto.scope) { data -> serialize(dto = data) }
        put(key = "notification_settings", value = dto.notificationSettings) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateReactionNotificationSettings): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateReactionNotificationSettings")
        put(key = "notification_settings", value = dto.notificationSettings) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateNotification): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateNotification")
        put(key = "notification_group_id", int = dto.notificationGroupId)
        put(key = "notification", value = dto.notification) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateNotificationGroup): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateNotificationGroup")
        put(key = "notification_group_id", int = dto.notificationGroupId)
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
        put(key = "chat_id", long = dto.chatId)
        put(key = "notification_settings_chat_id", long = dto.notificationSettingsChatId)
        put(key = "notification_sound_id", long = dto.notificationSoundId)
        put(key = "total_count", int = dto.totalCount)
        put(key = "added_notifications", objects = dto.addedNotifications) { data -> serialize(dto = data) }
        put(key = "removed_notification_ids", ints = dto.removedNotificationIds)
    }
}

internal fun serialize(dto: UpdateActiveNotifications): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateActiveNotifications")
        put(key = "groups", objects = dto.groups) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateHavePendingNotifications): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateHavePendingNotifications")
        put(key = "have_delayed_notifications", boolean = dto.haveDelayedNotifications)
        put(key = "have_unreceived_notifications", boolean = dto.haveUnreceivedNotifications)
    }
}

internal fun serialize(dto: UpdateDeleteMessages): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateDeleteMessages")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_ids", longs = dto.messageIds)
        put(key = "is_permanent", boolean = dto.isPermanent)
        put(key = "from_cache", boolean = dto.fromCache)
    }
}

internal fun serialize(dto: UpdateChatAction): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatAction")
        put(key = "chat_id", long = dto.chatId)
        put(key = "topic_id", value = dto.topicId) { data -> serialize(dto = data) }
        put(key = "sender_id", value = dto.senderId) { data -> serialize(dto = data) }
        put(key = "action", value = dto.action) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdatePendingMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updatePendingMessage")
        put(key = "chat_id", long = dto.chatId)
        put(key = "forum_topic_id", int = dto.forumTopicId)
        put(key = "draft_id", long = dto.draftId)
        put(key = "content", value = dto.content) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateCommunity): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateCommunity")
        put(key = "community", value = dto.community) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateUserStatus): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateUserStatus")
        put(key = "user_id", long = dto.userId)
        put(key = "status", value = dto.status) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateUser): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateUser")
        put(key = "user", value = dto.user) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateBasicGroup): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateBasicGroup")
        put(key = "basic_group", value = dto.basicGroup) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateSupergroup): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateSupergroup")
        put(key = "supergroup", value = dto.supergroup) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateSecretChat): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateSecretChat")
        put(key = "secret_chat", value = dto.secretChat) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateUserFullInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateUserFullInfo")
        put(key = "user_id", long = dto.userId)
        put(key = "user_full_info", value = dto.userFullInfo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateBasicGroupFullInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateBasicGroupFullInfo")
        put(key = "basic_group_id", long = dto.basicGroupId)
        put(key = "basic_group_full_info", value = dto.basicGroupFullInfo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateSupergroupFullInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateSupergroupFullInfo")
        put(key = "supergroup_id", long = dto.supergroupId)
        put(key = "supergroup_full_info", value = dto.supergroupFullInfo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateServiceNotification): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateServiceNotification")
        put(key = "type", string = dto.type)
        put(key = "content", value = dto.content) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateNewOauthRequest): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateNewOauthRequest")
        put(key = "domain", string = dto.domain)
        put(key = "location", string = dto.location)
        put(key = "url", string = dto.url)
    }
}

internal fun serialize(dto: UpdateFile): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateFile")
        put(key = "file", value = dto.file) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateFileGenerationStart): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateFileGenerationStart")
        put(key = "generation_id", long = dto.generationId)
        put(key = "original_path", string = dto.originalPath)
        put(key = "destination_path", string = dto.destinationPath)
        put(key = "conversion", string = dto.conversion)
    }
}

internal fun serialize(dto: UpdateFileGenerationStop): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateFileGenerationStop")
        put(key = "generation_id", long = dto.generationId)
    }
}

internal fun serialize(dto: UpdateFileDownloads): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateFileDownloads")
        put(key = "total_size", long = dto.totalSize)
        put(key = "total_count", int = dto.totalCount)
        put(key = "downloaded_size", long = dto.downloadedSize)
    }
}

internal fun serialize(dto: UpdateFileAddedToDownloads): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateFileAddedToDownloads")
        put(key = "file_download", value = dto.fileDownload) { data -> serialize(dto = data) }
        put(key = "counts", value = dto.counts) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateFileDownload): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateFileDownload")
        put(key = "file_id", int = dto.fileId)
        put(key = "complete_date", int = dto.completeDate)
        put(key = "is_paused", boolean = dto.isPaused)
        put(key = "counts", value = dto.counts) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateFileRemovedFromDownloads): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateFileRemovedFromDownloads")
        put(key = "file_id", int = dto.fileId)
        put(key = "counts", value = dto.counts) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateApplicationVerificationRequired): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateApplicationVerificationRequired")
        put(key = "verification_id", long = dto.verificationId)
        put(key = "nonce", string = dto.nonce)
        put(key = "cloud_project_number", long = dto.cloudProjectNumber)
    }
}

internal fun serialize(dto: UpdateApplicationRecaptchaVerificationRequired): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateApplicationRecaptchaVerificationRequired")
        put(key = "verification_id", long = dto.verificationId)
        put(key = "action", string = dto.action)
        put(key = "recaptcha_key_id", string = dto.recaptchaKeyId)
    }
}

internal fun serialize(dto: UpdateCall): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateCall")
        put(key = "call", value = dto.call) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateGroupCall): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateGroupCall")
        put(key = "group_call", value = dto.groupCall) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateGroupCallParticipant): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateGroupCallParticipant")
        put(key = "group_call_id", int = dto.groupCallId)
        put(key = "participant", value = dto.participant) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateGroupCallParticipants): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateGroupCallParticipants")
        put(key = "group_call_id", int = dto.groupCallId)
        put(key = "participant_user_ids", longs = dto.participantUserIds)
    }
}

internal fun serialize(dto: UpdateGroupCallVerificationState): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateGroupCallVerificationState")
        put(key = "group_call_id", int = dto.groupCallId)
        put(key = "generation", int = dto.generation)
        put(key = "emojis", strings = dto.emojis)
    }
}

internal fun serialize(dto: UpdateNewGroupCallMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateNewGroupCallMessage")
        put(key = "group_call_id", int = dto.groupCallId)
        put(key = "message", value = dto.message) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateNewGroupCallPaidReaction): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateNewGroupCallPaidReaction")
        put(key = "group_call_id", int = dto.groupCallId)
        put(key = "sender_id", value = dto.senderId) { data -> serialize(dto = data) }
        put(key = "star_count", long = dto.starCount)
    }
}

internal fun serialize(dto: UpdateGroupCallMessageSendFailed): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateGroupCallMessageSendFailed")
        put(key = "group_call_id", int = dto.groupCallId)
        put(key = "message_id", int = dto.messageId)
        put(key = "error", value = dto.error) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateGroupCallMessagesDeleted): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateGroupCallMessagesDeleted")
        put(key = "group_call_id", int = dto.groupCallId)
        put(key = "message_ids", ints = dto.messageIds)
    }
}

internal fun serialize(dto: UpdateLiveStoryTopDonors): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateLiveStoryTopDonors")
        put(key = "group_call_id", int = dto.groupCallId)
        put(key = "donors", value = dto.donors) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateNewCallSignalingData): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateNewCallSignalingData")
        put(key = "call_id", int = dto.callId)
        put(key = "data", bytes = dto.data)
    }
}

internal fun serialize(dto: UpdateGiftAuctionState): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateGiftAuctionState")
        put(key = "state", value = dto.state) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateActiveGiftAuctions): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateActiveGiftAuctions")
        put(key = "states", objects = dto.states) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateUserPrivacySettingRules): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateUserPrivacySettingRules")
        put(key = "setting", value = dto.setting) { data -> serialize(dto = data) }
        put(key = "rules", value = dto.rules) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateUnreadMessageCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateUnreadMessageCount")
        put(key = "chat_list", value = dto.chatList) { data -> serialize(dto = data) }
        put(key = "unread_count", int = dto.unreadCount)
        put(key = "unread_unmuted_count", int = dto.unreadUnmutedCount)
    }
}

internal fun serialize(dto: UpdateUnreadChatCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateUnreadChatCount")
        put(key = "chat_list", value = dto.chatList) { data -> serialize(dto = data) }
        put(key = "total_count", int = dto.totalCount)
        put(key = "unread_count", int = dto.unreadCount)
        put(key = "unread_unmuted_count", int = dto.unreadUnmutedCount)
        put(key = "marked_as_unread_count", int = dto.markedAsUnreadCount)
        put(key = "marked_as_unread_unmuted_count", int = dto.markedAsUnreadUnmutedCount)
    }
}

internal fun serialize(dto: UpdateChatJoinResult): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatJoinResult")
        put(key = "query_id", long = dto.queryId)
        put(key = "chat_id", long = dto.chatId)
        put(key = "result", value = dto.result) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateStory): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateStory")
        put(key = "story", value = dto.story) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateStoryDeleted): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateStoryDeleted")
        put(key = "story_poster_chat_id", long = dto.storyPosterChatId)
        put(key = "story_id", int = dto.storyId)
    }
}

internal fun serialize(dto: UpdateStoryPostSucceeded): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateStoryPostSucceeded")
        put(key = "story", value = dto.story) { data -> serialize(dto = data) }
        put(key = "old_story_id", int = dto.oldStoryId)
    }
}

internal fun serialize(dto: UpdateStoryPostFailed): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateStoryPostFailed")
        put(key = "story", value = dto.story) { data -> serialize(dto = data) }
        put(key = "error", value = dto.error) { data -> serialize(dto = data) }
        put(key = "error_type", value = dto.errorType) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateChatActiveStories): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatActiveStories")
        put(key = "active_stories", value = dto.activeStories) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateStoryListChatCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateStoryListChatCount")
        put(key = "story_list", value = dto.storyList) { data -> serialize(dto = data) }
        put(key = "chat_count", int = dto.chatCount)
    }
}

internal fun serialize(dto: UpdateStoryStealthMode): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateStoryStealthMode")
        put(key = "active_until_date", int = dto.activeUntilDate)
        put(key = "cooldown_until_date", int = dto.cooldownUntilDate)
    }
}

internal fun serialize(dto: UpdateTrustedMiniAppBots): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateTrustedMiniAppBots")
        put(key = "bot_user_ids", longs = dto.botUserIds)
    }
}

internal fun serialize(dto: UpdateOption): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateOption")
        put(key = "name", string = dto.name)
        put(key = "value", value = dto.value) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateStickerSet): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateStickerSet")
        put(key = "sticker_set", value = dto.stickerSet) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateInstalledStickerSets): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateInstalledStickerSets")
        put(key = "sticker_type", value = dto.stickerType) { data -> serialize(dto = data) }
        put(key = "sticker_set_ids", longs = dto.stickerSetIds)
    }
}

internal fun serialize(dto: UpdateTrendingStickerSets): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateTrendingStickerSets")
        put(key = "sticker_type", value = dto.stickerType) { data -> serialize(dto = data) }
        put(key = "sticker_sets", value = dto.stickerSets) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateRecentStickers): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateRecentStickers")
        put(key = "is_attached", boolean = dto.isAttached)
        put(key = "sticker_ids", ints = dto.stickerIds)
    }
}

internal fun serialize(dto: UpdateFavoriteStickers): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateFavoriteStickers")
        put(key = "sticker_ids", ints = dto.stickerIds)
    }
}

internal fun serialize(dto: UpdateSavedAnimations): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateSavedAnimations")
        put(key = "animation_ids", ints = dto.animationIds)
    }
}

internal fun serialize(dto: UpdateSavedNotificationSounds): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateSavedNotificationSounds")
        put(key = "notification_sound_ids", longs = dto.notificationSoundIds)
    }
}

internal fun serialize(dto: UpdateDefaultBackground): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateDefaultBackground")
        put(key = "for_dark_theme", boolean = dto.forDarkTheme)
        put(key = "background", value = dto.background) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateEmojiChatThemes): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateEmojiChatThemes")
        put(key = "chat_themes", objects = dto.chatThemes) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateAccentColors): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateAccentColors")
        put(key = "colors", objects = dto.colors) { data -> serialize(dto = data) }
        put(key = "available_accent_color_ids", ints = dto.availableAccentColorIds)
    }
}

internal fun serialize(dto: UpdateProfileAccentColors): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateProfileAccentColors")
        put(key = "colors", objects = dto.colors) { data -> serialize(dto = data) }
        put(key = "available_accent_color_ids", ints = dto.availableAccentColorIds)
    }
}

internal fun serialize(dto: UpdateWebBrowserSettings): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateWebBrowserSettings")
        put(key = "settings", value = dto.settings) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateLanguagePackStrings): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateLanguagePackStrings")
        put(key = "localization_target", string = dto.localizationTarget)
        put(key = "language_pack_id", string = dto.languagePackId)
        put(key = "strings", objects = dto.strings) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateConnectionState): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateConnectionState")
        put(key = "state", value = dto.state) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateFreezeState): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateFreezeState")
        put(key = "is_frozen", boolean = dto.isFrozen)
        put(key = "freezing_date", int = dto.freezingDate)
        put(key = "deletion_date", int = dto.deletionDate)
        put(key = "appeal_link", string = dto.appealLink)
    }
}

internal fun serialize(dto: UpdateAgeVerificationParameters): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateAgeVerificationParameters")
        put(key = "parameters", value = dto.parameters) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateTermsOfService): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateTermsOfService")
        put(key = "terms_of_service_id", string = dto.termsOfServiceId)
        put(key = "terms_of_service", value = dto.termsOfService) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateUnconfirmedSession): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateUnconfirmedSession")
        put(key = "session", value = dto.session) { data -> serialize(dto = data) }
        put(key = "unconfirmed_session_count", int = dto.unconfirmedSessionCount)
    }
}

internal fun serialize(dto: UpdateAttachmentMenuBots): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateAttachmentMenuBots")
        put(key = "bots", objects = dto.bots) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateWebAppMessageSent): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateWebAppMessageSent")
        put(key = "web_app_launch_id", long = dto.webAppLaunchId)
    }
}

internal fun serialize(dto: UpdateActiveEmojiReactions): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateActiveEmojiReactions")
        put(key = "emojis", strings = dto.emojis)
    }
}

internal fun serialize(dto: UpdateAvailableMessageEffects): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateAvailableMessageEffects")
        put(key = "reaction_effect_ids", longs = dto.reactionEffectIds)
        put(key = "sticker_effect_ids", longs = dto.stickerEffectIds)
    }
}

internal fun serialize(dto: UpdateDefaultReactionType): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateDefaultReactionType")
        put(key = "reaction_type", value = dto.reactionType) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateDefaultPaidReactionType): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateDefaultPaidReactionType")
        put(key = "type", value = dto.type) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateSavedMessagesTags): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateSavedMessagesTags")
        put(key = "saved_messages_topic_id", long = dto.savedMessagesTopicId)
        put(key = "tags", value = dto.tags) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateActiveLiveLocationMessages): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateActiveLiveLocationMessages")
        put(key = "messages", objects = dto.messages) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateOwnedStarCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateOwnedStarCount")
        put(key = "star_amount", value = dto.starAmount) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateOwnedGramCount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateOwnedGramCount")
        put(key = "gram_amount", long = dto.gramAmount)
    }
}

internal fun serialize(dto: UpdateChatRevenueAmount): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatRevenueAmount")
        put(key = "chat_id", long = dto.chatId)
        put(key = "revenue_amount", value = dto.revenueAmount) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateStarRevenueStatus): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateStarRevenueStatus")
        put(key = "owner_id", value = dto.ownerId) { data -> serialize(dto = data) }
        put(key = "status", value = dto.status) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateGramRevenueStatus): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateGramRevenueStatus")
        put(key = "status", value = dto.status) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateSpeechRecognitionTrial): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateSpeechRecognitionTrial")
        put(key = "max_media_duration", int = dto.maxMediaDuration)
        put(key = "weekly_count", int = dto.weeklyCount)
        put(key = "left_count", int = dto.leftCount)
        put(key = "next_reset_date", int = dto.nextResetDate)
    }
}

internal fun serialize(dto: UpdateGroupCallMessageLevels): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateGroupCallMessageLevels")
        put(key = "levels", objects = dto.levels) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateDiceEmojis): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateDiceEmojis")
        put(key = "emojis", strings = dto.emojis)
    }
}

internal fun serialize(dto: UpdateStakeDiceState): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateStakeDiceState")
        put(key = "state", value = dto.state) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateAnimatedEmojiMessageClicked): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateAnimatedEmojiMessageClicked")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_id", long = dto.messageId)
        put(key = "sticker", value = dto.sticker) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateAnimationSearchParameters): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateAnimationSearchParameters")
        put(key = "provider", string = dto.provider)
        put(key = "emojis", strings = dto.emojis)
    }
}

internal fun serialize(dto: UpdateTextCompositionStyles): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateTextCompositionStyles")
        put(key = "styles", objects = dto.styles) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateSuggestedActions): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateSuggestedActions")
        put(key = "added_actions", objects = dto.addedActions) { data -> serialize(dto = data) }
        put(key = "removed_actions", objects = dto.removedActions) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateSpeedLimitNotification): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateSpeedLimitNotification")
        put(key = "is_upload", boolean = dto.isUpload)
    }
}

internal fun serialize(dto: UpdateContactCloseBirthdays): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateContactCloseBirthdays")
        put(key = "close_birthday_users", objects = dto.closeBirthdayUsers) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateAutosaveSettings): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateAutosaveSettings")
        put(key = "scope", value = dto.scope) { data -> serialize(dto = data) }
        put(key = "settings", value = dto.settings) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateBusinessConnection): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateBusinessConnection")
        put(key = "connection", value = dto.connection) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateNewBusinessMessage): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateNewBusinessMessage")
        put(key = "connection_id", string = dto.connectionId)
        put(key = "message", value = dto.message) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateBusinessMessageEdited): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateBusinessMessageEdited")
        put(key = "connection_id", string = dto.connectionId)
        put(key = "message", value = dto.message) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateBusinessMessagesDeleted): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateBusinessMessagesDeleted")
        put(key = "connection_id", string = dto.connectionId)
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_ids", longs = dto.messageIds)
    }
}

internal fun serialize(dto: UpdateNewInlineQuery): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateNewInlineQuery")
        put(key = "id", long = dto.id)
        put(key = "sender_user_id", long = dto.senderUserId)
        put(key = "user_location", value = dto.userLocation) { data -> serialize(dto = data) }
        put(key = "chat_type", value = dto.chatType) { data -> serialize(dto = data) }
        put(key = "query", string = dto.query)
        put(key = "offset", string = dto.offset)
    }
}

internal fun serialize(dto: UpdateNewChosenInlineResult): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateNewChosenInlineResult")
        put(key = "sender_user_id", long = dto.senderUserId)
        put(key = "user_location", value = dto.userLocation) { data -> serialize(dto = data) }
        put(key = "query", string = dto.query)
        put(key = "result_id", string = dto.resultId)
        put(key = "inline_message_id", string = dto.inlineMessageId)
    }
}

internal fun serialize(dto: UpdateNewGuestQuery): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateNewGuestQuery")
        put(key = "id", long = dto.id)
        put(key = "message", value = dto.message) { data -> serialize(dto = data) }
        put(key = "reference_messages", objects = dto.referenceMessages) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateNewCallbackQuery): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateNewCallbackQuery")
        put(key = "id", long = dto.id)
        put(key = "sender_user_id", long = dto.senderUserId)
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_id", long = dto.messageId)
        put(key = "chat_instance", long = dto.chatInstance)
        put(key = "payload", value = dto.payload) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateNewInlineCallbackQuery): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateNewInlineCallbackQuery")
        put(key = "id", long = dto.id)
        put(key = "sender_user_id", long = dto.senderUserId)
        put(key = "inline_message_id", string = dto.inlineMessageId)
        put(key = "chat_instance", long = dto.chatInstance)
        put(key = "payload", value = dto.payload) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateNewBusinessCallbackQuery): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateNewBusinessCallbackQuery")
        put(key = "id", long = dto.id)
        put(key = "sender_user_id", long = dto.senderUserId)
        put(key = "connection_id", string = dto.connectionId)
        put(key = "message", value = dto.message) { data -> serialize(dto = data) }
        put(key = "chat_instance", long = dto.chatInstance)
        put(key = "payload", value = dto.payload) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateNewShippingQuery): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateNewShippingQuery")
        put(key = "id", long = dto.id)
        put(key = "sender_user_id", long = dto.senderUserId)
        put(key = "invoice_payload", string = dto.invoicePayload)
        put(key = "shipping_address", value = dto.shippingAddress) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateNewPreCheckoutQuery): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateNewPreCheckoutQuery")
        put(key = "id", long = dto.id)
        put(key = "sender_user_id", long = dto.senderUserId)
        put(key = "currency", string = dto.currency)
        put(key = "total_amount", long = dto.totalAmount)
        put(key = "invoice_payload", bytes = dto.invoicePayload)
        put(key = "shipping_option_id", string = dto.shippingOptionId)
        put(key = "order_info", value = dto.orderInfo) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateNewCustomEvent): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateNewCustomEvent")
        put(key = "event", string = dto.event)
    }
}

internal fun serialize(dto: UpdateNewCustomQuery): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateNewCustomQuery")
        put(key = "id", long = dto.id)
        put(key = "data", string = dto.data)
        put(key = "timeout", int = dto.timeout)
    }
}

internal fun serialize(dto: UpdateUserSubscription): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateUserSubscription")
        put(key = "user_id", long = dto.userId)
        put(key = "payload", string = dto.payload)
        put(key = "is_canceled", boolean = dto.isCanceled)
        put(key = "is_restored", boolean = dto.isRestored)
        put(key = "is_payment_failed", boolean = dto.isPaymentFailed)
    }
}

internal fun serialize(dto: UpdatePoll): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updatePoll")
        put(key = "poll", value = dto.poll) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdatePollAnswer): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updatePollAnswer")
        put(key = "poll_id", long = dto.pollId)
        put(key = "voter_id", value = dto.voterId) { data -> serialize(dto = data) }
        put(key = "option_ids", strings = dto.optionIds)
        put(key = "option_positions", ints = dto.optionPositions)
    }
}

internal fun serialize(dto: UpdateManagedBot): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateManagedBot")
        put(key = "user_id", long = dto.userId)
        put(key = "bot_user_id", long = dto.botUserId)
    }
}

internal fun serialize(dto: UpdateChatMember): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatMember")
        put(key = "chat_id", long = dto.chatId)
        put(key = "actor_user_id", long = dto.actorUserId)
        put(key = "date", int = dto.date)
        put(key = "invite_link", value = dto.inviteLink) { data -> serialize(dto = data) }
        put(key = "via_join_request", boolean = dto.viaJoinRequest)
        put(key = "via_chat_folder_invite_link", boolean = dto.viaChatFolderInviteLink)
        put(key = "old_chat_member", value = dto.oldChatMember) { data -> serialize(dto = data) }
        put(key = "new_chat_member", value = dto.newChatMember) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateNewChatJoinRequest): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateNewChatJoinRequest")
        put(key = "chat_id", long = dto.chatId)
        put(key = "request", value = dto.request) { data -> serialize(dto = data) }
        put(key = "user_chat_id", long = dto.userChatId)
        put(key = "invite_link", value = dto.inviteLink) { data -> serialize(dto = data) }
        put(key = "query_id", long = dto.queryId)
    }
}

internal fun serialize(dto: UpdateChatBoost): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateChatBoost")
        put(key = "chat_id", long = dto.chatId)
        put(key = "boost", value = dto.boost) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateMessageReaction): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateMessageReaction")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_id", long = dto.messageId)
        put(key = "actor_id", value = dto.actorId) { data -> serialize(dto = data) }
        put(key = "date", int = dto.date)
        put(key = "old_reaction_types", objects = dto.oldReactionTypes) { data -> serialize(dto = data) }
        put(key = "new_reaction_types", objects = dto.newReactionTypes) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdateMessageReactions): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updateMessageReactions")
        put(key = "chat_id", long = dto.chatId)
        put(key = "message_id", long = dto.messageId)
        put(key = "date", int = dto.date)
        put(key = "reactions", objects = dto.reactions) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: UpdatePaidMediaPurchased): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updatePaidMediaPurchased")
        put(key = "user_id", long = dto.userId)
        put(key = "payload", string = dto.payload)
    }
}

internal fun serialize(dto: Updates): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "updates")
        put(key = "updates", objects = dto.updates) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: LogStreamDefault): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "logStreamDefault")
    }
}

internal fun serialize(dto: LogStreamFile): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "logStreamFile")
        put(key = "path", string = dto.path)
        put(key = "max_file_size", long = dto.maxFileSize)
        put(key = "redirect_stderr", boolean = dto.redirectStderr)
    }
}

internal fun serialize(dto: LogStreamEmpty): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "logStreamEmpty")
    }
}

internal fun serialize(dto: LogVerbosityLevel): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "logVerbosityLevel")
        put(key = "verbosity_level", int = dto.verbosityLevel)
    }
}

internal fun serialize(dto: LogTags): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "logTags")
        put(key = "tags", strings = dto.tags)
    }
}

internal fun serialize(dto: UserSupportInfo): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "userSupportInfo")
        put(key = "message", value = dto.message) { data -> serialize(dto = data) }
        put(key = "author", string = dto.author)
        put(key = "date", int = dto.date)
    }
}

internal fun serialize(dto: TestInt): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "testInt")
        put(key = "value", int = dto.value)
    }
}

internal fun serialize(dto: TestString): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "testString")
        put(key = "value", string = dto.value)
    }
}

internal fun serialize(dto: TestBytes): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "testBytes")
        put(key = "value", bytes = dto.value)
    }
}

internal fun serialize(dto: TestVectorInt): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "testVectorInt")
        put(key = "value", ints = dto.value)
    }
}

internal fun serialize(dto: TestVectorIntObject): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "testVectorIntObject")
        put(key = "value", objects = dto.value) { data -> serialize(dto = data) }
    }
}

internal fun serialize(dto: TestVectorString): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "testVectorString")
        put(key = "value", strings = dto.value)
    }
}

internal fun serialize(dto: TestVectorStringObject): JsonElement {
    return buildJsonObject {
        put(key = "@type", string = "testVectorStringObject")
        put(key = "value", objects = dto.value) { data -> serialize(dto = data) }
    }
}
