/*
 * Copyright 2025 Georgii Ippolitov (g000sha256)
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

package dev.g000sha256.tdl

import dev.g000sha256.tdl.dto.AccountTtl
import dev.g000sha256.tdl.dto.AddedReactions
import dev.g000sha256.tdl.dto.AffiliateProgramParameters
import dev.g000sha256.tdl.dto.AffiliateProgramSortOrder
import dev.g000sha256.tdl.dto.AffiliateType
import dev.g000sha256.tdl.dto.AnimatedEmoji
import dev.g000sha256.tdl.dto.Animations
import dev.g000sha256.tdl.dto.ArchiveChatListSettings
import dev.g000sha256.tdl.dto.AttachmentMenuBot
import dev.g000sha256.tdl.dto.AuthenticationCodeInfo
import dev.g000sha256.tdl.dto.AuthorizationState
import dev.g000sha256.tdl.dto.AutoDownloadSettings
import dev.g000sha256.tdl.dto.AutoDownloadSettingsPresets
import dev.g000sha256.tdl.dto.AutosaveSettings
import dev.g000sha256.tdl.dto.AutosaveSettingsScope
import dev.g000sha256.tdl.dto.AvailableGifts
import dev.g000sha256.tdl.dto.AvailableReactions
import dev.g000sha256.tdl.dto.Background
import dev.g000sha256.tdl.dto.BackgroundType
import dev.g000sha256.tdl.dto.Backgrounds
import dev.g000sha256.tdl.dto.BankCardInfo
import dev.g000sha256.tdl.dto.BasicGroup
import dev.g000sha256.tdl.dto.BasicGroupFullInfo
import dev.g000sha256.tdl.dto.Birthdate
import dev.g000sha256.tdl.dto.BlockList
import dev.g000sha256.tdl.dto.BotCommand
import dev.g000sha256.tdl.dto.BotCommandScope
import dev.g000sha256.tdl.dto.BotCommands
import dev.g000sha256.tdl.dto.BotMediaPreview
import dev.g000sha256.tdl.dto.BotMediaPreviewInfo
import dev.g000sha256.tdl.dto.BotMediaPreviews
import dev.g000sha256.tdl.dto.BotMenuButton
import dev.g000sha256.tdl.dto.BusinessAwayMessageSettings
import dev.g000sha256.tdl.dto.BusinessChatLink
import dev.g000sha256.tdl.dto.BusinessChatLinkInfo
import dev.g000sha256.tdl.dto.BusinessChatLinks
import dev.g000sha256.tdl.dto.BusinessConnectedBot
import dev.g000sha256.tdl.dto.BusinessConnection
import dev.g000sha256.tdl.dto.BusinessFeature
import dev.g000sha256.tdl.dto.BusinessFeatures
import dev.g000sha256.tdl.dto.BusinessGreetingMessageSettings
import dev.g000sha256.tdl.dto.BusinessLocation
import dev.g000sha256.tdl.dto.BusinessMessage
import dev.g000sha256.tdl.dto.BusinessMessages
import dev.g000sha256.tdl.dto.BusinessOpeningHours
import dev.g000sha256.tdl.dto.CallId
import dev.g000sha256.tdl.dto.CallProblem
import dev.g000sha256.tdl.dto.CallProtocol
import dev.g000sha256.tdl.dto.CallbackQueryAnswer
import dev.g000sha256.tdl.dto.CallbackQueryPayload
import dev.g000sha256.tdl.dto.CanPostStoryResult
import dev.g000sha256.tdl.dto.CanSendMessageToUserResult
import dev.g000sha256.tdl.dto.CanTransferOwnershipResult
import dev.g000sha256.tdl.dto.Chat
import dev.g000sha256.tdl.dto.ChatAction
import dev.g000sha256.tdl.dto.ChatActiveStories
import dev.g000sha256.tdl.dto.ChatAdministratorRights
import dev.g000sha256.tdl.dto.ChatAdministrators
import dev.g000sha256.tdl.dto.ChatAvailableReactions
import dev.g000sha256.tdl.dto.ChatBoostFeatures
import dev.g000sha256.tdl.dto.ChatBoostLevelFeatures
import dev.g000sha256.tdl.dto.ChatBoostLink
import dev.g000sha256.tdl.dto.ChatBoostLinkInfo
import dev.g000sha256.tdl.dto.ChatBoostSlots
import dev.g000sha256.tdl.dto.ChatBoostStatus
import dev.g000sha256.tdl.dto.ChatEventLogFilters
import dev.g000sha256.tdl.dto.ChatEvents
import dev.g000sha256.tdl.dto.ChatFolder
import dev.g000sha256.tdl.dto.ChatFolderIcon
import dev.g000sha256.tdl.dto.ChatFolderInfo
import dev.g000sha256.tdl.dto.ChatFolderInviteLink
import dev.g000sha256.tdl.dto.ChatFolderInviteLinkInfo
import dev.g000sha256.tdl.dto.ChatFolderInviteLinks
import dev.g000sha256.tdl.dto.ChatInviteLink
import dev.g000sha256.tdl.dto.ChatInviteLinkCounts
import dev.g000sha256.tdl.dto.ChatInviteLinkInfo
import dev.g000sha256.tdl.dto.ChatInviteLinkMember
import dev.g000sha256.tdl.dto.ChatInviteLinkMembers
import dev.g000sha256.tdl.dto.ChatInviteLinks
import dev.g000sha256.tdl.dto.ChatJoinRequest
import dev.g000sha256.tdl.dto.ChatJoinRequests
import dev.g000sha256.tdl.dto.ChatList
import dev.g000sha256.tdl.dto.ChatLists
import dev.g000sha256.tdl.dto.ChatLocation
import dev.g000sha256.tdl.dto.ChatMember
import dev.g000sha256.tdl.dto.ChatMemberStatus
import dev.g000sha256.tdl.dto.ChatMembers
import dev.g000sha256.tdl.dto.ChatMembersFilter
import dev.g000sha256.tdl.dto.ChatMessageSenders
import dev.g000sha256.tdl.dto.ChatNotificationSettings
import dev.g000sha256.tdl.dto.ChatPermissions
import dev.g000sha256.tdl.dto.ChatPhotos
import dev.g000sha256.tdl.dto.ChatRevenueStatistics
import dev.g000sha256.tdl.dto.ChatRevenueTransactions
import dev.g000sha256.tdl.dto.ChatStatistics
import dev.g000sha256.tdl.dto.Chats
import dev.g000sha256.tdl.dto.CheckChatUsernameResult
import dev.g000sha256.tdl.dto.CheckStickerSetNameResult
import dev.g000sha256.tdl.dto.CollectibleItemInfo
import dev.g000sha256.tdl.dto.CollectibleItemType
import dev.g000sha256.tdl.dto.ConnectedAffiliateProgram
import dev.g000sha256.tdl.dto.ConnectedAffiliatePrograms
import dev.g000sha256.tdl.dto.ConnectedWebsites
import dev.g000sha256.tdl.dto.Contact
import dev.g000sha256.tdl.dto.Count
import dev.g000sha256.tdl.dto.Countries
import dev.g000sha256.tdl.dto.CreatedBasicGroupChat
import dev.g000sha256.tdl.dto.CurrentWeather
import dev.g000sha256.tdl.dto.CustomRequestResult
import dev.g000sha256.tdl.dto.Data
import dev.g000sha256.tdl.dto.DatabaseStatistics
import dev.g000sha256.tdl.dto.DeepLinkInfo
import dev.g000sha256.tdl.dto.DeviceToken
import dev.g000sha256.tdl.dto.DirectMessagesChatTopic
import dev.g000sha256.tdl.dto.DraftMessage
import dev.g000sha256.tdl.dto.EmailAddressAuthentication
import dev.g000sha256.tdl.dto.EmailAddressAuthenticationCodeInfo
import dev.g000sha256.tdl.dto.EmojiCategories
import dev.g000sha256.tdl.dto.EmojiCategoryType
import dev.g000sha256.tdl.dto.EmojiKeywords
import dev.g000sha256.tdl.dto.EmojiReaction
import dev.g000sha256.tdl.dto.EmojiStatus
import dev.g000sha256.tdl.dto.EmojiStatusCustomEmojis
import dev.g000sha256.tdl.dto.EmojiStatuses
import dev.g000sha256.tdl.dto.Emojis
import dev.g000sha256.tdl.dto.Error
import dev.g000sha256.tdl.dto.FailedToAddMembers
import dev.g000sha256.tdl.dto.File
import dev.g000sha256.tdl.dto.FileDownloadedPrefixSize
import dev.g000sha256.tdl.dto.FileType
import dev.g000sha256.tdl.dto.FormattedText
import dev.g000sha256.tdl.dto.ForumTopic
import dev.g000sha256.tdl.dto.ForumTopicIcon
import dev.g000sha256.tdl.dto.ForumTopicInfo
import dev.g000sha256.tdl.dto.ForumTopics
import dev.g000sha256.tdl.dto.FoundAffiliatePrograms
import dev.g000sha256.tdl.dto.FoundChatBoosts
import dev.g000sha256.tdl.dto.FoundChatMessages
import dev.g000sha256.tdl.dto.FoundFileDownloads
import dev.g000sha256.tdl.dto.FoundMessages
import dev.g000sha256.tdl.dto.FoundPosition
import dev.g000sha256.tdl.dto.FoundPositions
import dev.g000sha256.tdl.dto.FoundStories
import dev.g000sha256.tdl.dto.FoundUsers
import dev.g000sha256.tdl.dto.FoundWebApp
import dev.g000sha256.tdl.dto.GameHighScores
import dev.g000sha256.tdl.dto.GiftForResaleOrder
import dev.g000sha256.tdl.dto.GiftSettings
import dev.g000sha256.tdl.dto.GiftUpgradePreview
import dev.g000sha256.tdl.dto.GiftsForResale
import dev.g000sha256.tdl.dto.GiveawayInfo
import dev.g000sha256.tdl.dto.GiveawayParameters
import dev.g000sha256.tdl.dto.GroupCall
import dev.g000sha256.tdl.dto.GroupCallDataChannel
import dev.g000sha256.tdl.dto.GroupCallId
import dev.g000sha256.tdl.dto.GroupCallInfo
import dev.g000sha256.tdl.dto.GroupCallJoinParameters
import dev.g000sha256.tdl.dto.GroupCallParticipants
import dev.g000sha256.tdl.dto.GroupCallVideoQuality
import dev.g000sha256.tdl.dto.Hashtags
import dev.g000sha256.tdl.dto.HttpUrl
import dev.g000sha256.tdl.dto.ImportedContacts
import dev.g000sha256.tdl.dto.InlineQueryResults
import dev.g000sha256.tdl.dto.InlineQueryResultsButton
import dev.g000sha256.tdl.dto.InputBackground
import dev.g000sha256.tdl.dto.InputBusinessChatLink
import dev.g000sha256.tdl.dto.InputBusinessStartPage
import dev.g000sha256.tdl.dto.InputChatPhoto
import dev.g000sha256.tdl.dto.InputCredentials
import dev.g000sha256.tdl.dto.InputFile
import dev.g000sha256.tdl.dto.InputGroupCall
import dev.g000sha256.tdl.dto.InputInlineQueryResult
import dev.g000sha256.tdl.dto.InputInvoice
import dev.g000sha256.tdl.dto.InputMessageContent
import dev.g000sha256.tdl.dto.InputMessageReplyTo
import dev.g000sha256.tdl.dto.InputPassportElement
import dev.g000sha256.tdl.dto.InputPassportElementError
import dev.g000sha256.tdl.dto.InputSticker
import dev.g000sha256.tdl.dto.InputStoryAreas
import dev.g000sha256.tdl.dto.InputStoryContent
import dev.g000sha256.tdl.dto.InputTextQuote
import dev.g000sha256.tdl.dto.InternalLinkType
import dev.g000sha256.tdl.dto.InviteGroupCallParticipantResult
import dev.g000sha256.tdl.dto.JsonValue
import dev.g000sha256.tdl.dto.LanguagePackInfo
import dev.g000sha256.tdl.dto.LanguagePackString
import dev.g000sha256.tdl.dto.LanguagePackStringValue
import dev.g000sha256.tdl.dto.LanguagePackStrings
import dev.g000sha256.tdl.dto.LinkPreview
import dev.g000sha256.tdl.dto.LinkPreviewOptions
import dev.g000sha256.tdl.dto.LocalizationTargetInfo
import dev.g000sha256.tdl.dto.Location
import dev.g000sha256.tdl.dto.LocationAddress
import dev.g000sha256.tdl.dto.LogStream
import dev.g000sha256.tdl.dto.LogTags
import dev.g000sha256.tdl.dto.LogVerbosityLevel
import dev.g000sha256.tdl.dto.LoginUrlInfo
import dev.g000sha256.tdl.dto.MainWebApp
import dev.g000sha256.tdl.dto.MaskPosition
import dev.g000sha256.tdl.dto.Message
import dev.g000sha256.tdl.dto.MessageAutoDeleteTime
import dev.g000sha256.tdl.dto.MessageCalendar
import dev.g000sha256.tdl.dto.MessageEffect
import dev.g000sha256.tdl.dto.MessageFileType
import dev.g000sha256.tdl.dto.MessageLink
import dev.g000sha256.tdl.dto.MessageLinkInfo
import dev.g000sha256.tdl.dto.MessagePositions
import dev.g000sha256.tdl.dto.MessageProperties
import dev.g000sha256.tdl.dto.MessageReadDate
import dev.g000sha256.tdl.dto.MessageSchedulingState
import dev.g000sha256.tdl.dto.MessageSendOptions
import dev.g000sha256.tdl.dto.MessageSender
import dev.g000sha256.tdl.dto.MessageSenders
import dev.g000sha256.tdl.dto.MessageSource
import dev.g000sha256.tdl.dto.MessageStatistics
import dev.g000sha256.tdl.dto.MessageThreadInfo
import dev.g000sha256.tdl.dto.MessageTopic
import dev.g000sha256.tdl.dto.MessageViewers
import dev.g000sha256.tdl.dto.Messages
import dev.g000sha256.tdl.dto.NetworkStatistics
import dev.g000sha256.tdl.dto.NetworkStatisticsEntry
import dev.g000sha256.tdl.dto.NetworkType
import dev.g000sha256.tdl.dto.NewChatPrivacySettings
import dev.g000sha256.tdl.dto.NotificationSettingsScope
import dev.g000sha256.tdl.dto.NotificationSound
import dev.g000sha256.tdl.dto.NotificationSounds
import dev.g000sha256.tdl.dto.Ok
import dev.g000sha256.tdl.dto.OptionValue
import dev.g000sha256.tdl.dto.OrderInfo
import dev.g000sha256.tdl.dto.Outline
import dev.g000sha256.tdl.dto.PaidReactionType
import dev.g000sha256.tdl.dto.PassportAuthorizationForm
import dev.g000sha256.tdl.dto.PassportElement
import dev.g000sha256.tdl.dto.PassportElementType
import dev.g000sha256.tdl.dto.PassportElements
import dev.g000sha256.tdl.dto.PassportElementsWithErrors
import dev.g000sha256.tdl.dto.PasswordState
import dev.g000sha256.tdl.dto.PaymentForm
import dev.g000sha256.tdl.dto.PaymentReceipt
import dev.g000sha256.tdl.dto.PaymentResult
import dev.g000sha256.tdl.dto.PhoneNumberAuthenticationSettings
import dev.g000sha256.tdl.dto.PhoneNumberCodeType
import dev.g000sha256.tdl.dto.PhoneNumberInfo
import dev.g000sha256.tdl.dto.PremiumFeature
import dev.g000sha256.tdl.dto.PremiumFeatures
import dev.g000sha256.tdl.dto.PremiumGiftCodeInfo
import dev.g000sha256.tdl.dto.PremiumGiftPaymentOptions
import dev.g000sha256.tdl.dto.PremiumGiveawayPaymentOptions
import dev.g000sha256.tdl.dto.PremiumLimit
import dev.g000sha256.tdl.dto.PremiumLimitType
import dev.g000sha256.tdl.dto.PremiumSource
import dev.g000sha256.tdl.dto.PremiumState
import dev.g000sha256.tdl.dto.PreparedInlineMessage
import dev.g000sha256.tdl.dto.PreparedInlineMessageId
import dev.g000sha256.tdl.dto.Proxies
import dev.g000sha256.tdl.dto.Proxy
import dev.g000sha256.tdl.dto.ProxyType
import dev.g000sha256.tdl.dto.PublicChatType
import dev.g000sha256.tdl.dto.PublicForwards
import dev.g000sha256.tdl.dto.PushReceiverId
import dev.g000sha256.tdl.dto.QuickReplyMessage
import dev.g000sha256.tdl.dto.QuickReplyMessages
import dev.g000sha256.tdl.dto.ReactionNotificationSettings
import dev.g000sha256.tdl.dto.ReactionType
import dev.g000sha256.tdl.dto.ReadDatePrivacySettings
import dev.g000sha256.tdl.dto.ReceivedGift
import dev.g000sha256.tdl.dto.ReceivedGifts
import dev.g000sha256.tdl.dto.RecommendedChatFolders
import dev.g000sha256.tdl.dto.RecoveryEmailAddress
import dev.g000sha256.tdl.dto.ReplyMarkup
import dev.g000sha256.tdl.dto.ReportChatResult
import dev.g000sha256.tdl.dto.ReportReason
import dev.g000sha256.tdl.dto.ReportSponsoredResult
import dev.g000sha256.tdl.dto.ReportStoryResult
import dev.g000sha256.tdl.dto.ResendCodeReason
import dev.g000sha256.tdl.dto.ResetPasswordResult
import dev.g000sha256.tdl.dto.RtmpUrl
import dev.g000sha256.tdl.dto.SavedMessagesTags
import dev.g000sha256.tdl.dto.ScopeAutosaveSettings
import dev.g000sha256.tdl.dto.ScopeNotificationSettings
import dev.g000sha256.tdl.dto.SearchMessagesChatTypeFilter
import dev.g000sha256.tdl.dto.SearchMessagesFilter
import dev.g000sha256.tdl.dto.Seconds
import dev.g000sha256.tdl.dto.SecretChat
import dev.g000sha256.tdl.dto.SentWebAppMessage
import dev.g000sha256.tdl.dto.Session
import dev.g000sha256.tdl.dto.Sessions
import dev.g000sha256.tdl.dto.ShippingOption
import dev.g000sha256.tdl.dto.SponsoredChats
import dev.g000sha256.tdl.dto.SponsoredMessages
import dev.g000sha256.tdl.dto.StarAmount
import dev.g000sha256.tdl.dto.StarCount
import dev.g000sha256.tdl.dto.StarGiveawayPaymentOptions
import dev.g000sha256.tdl.dto.StarPaymentOptions
import dev.g000sha256.tdl.dto.StarRevenueStatistics
import dev.g000sha256.tdl.dto.StarSubscriptionPricing
import dev.g000sha256.tdl.dto.StarSubscriptions
import dev.g000sha256.tdl.dto.StarTransactionDirection
import dev.g000sha256.tdl.dto.StarTransactions
import dev.g000sha256.tdl.dto.StatisticalGraph
import dev.g000sha256.tdl.dto.Sticker
import dev.g000sha256.tdl.dto.StickerFormat
import dev.g000sha256.tdl.dto.StickerSet
import dev.g000sha256.tdl.dto.StickerSets
import dev.g000sha256.tdl.dto.StickerType
import dev.g000sha256.tdl.dto.Stickers
import dev.g000sha256.tdl.dto.StorageStatistics
import dev.g000sha256.tdl.dto.StorageStatisticsFast
import dev.g000sha256.tdl.dto.StorePaymentPurpose
import dev.g000sha256.tdl.dto.StoreTransaction
import dev.g000sha256.tdl.dto.Stories
import dev.g000sha256.tdl.dto.Story
import dev.g000sha256.tdl.dto.StoryFullId
import dev.g000sha256.tdl.dto.StoryInteractions
import dev.g000sha256.tdl.dto.StoryList
import dev.g000sha256.tdl.dto.StoryPrivacySettings
import dev.g000sha256.tdl.dto.StoryStatistics
import dev.g000sha256.tdl.dto.SuggestedAction
import dev.g000sha256.tdl.dto.Supergroup
import dev.g000sha256.tdl.dto.SupergroupFullInfo
import dev.g000sha256.tdl.dto.SupergroupMembersFilter
import dev.g000sha256.tdl.dto.TMeUrls
import dev.g000sha256.tdl.dto.TargetChatTypes
import dev.g000sha256.tdl.dto.TemporaryPasswordState
import dev.g000sha256.tdl.dto.TestBytes
import dev.g000sha256.tdl.dto.TestInt
import dev.g000sha256.tdl.dto.TestString
import dev.g000sha256.tdl.dto.TestVectorInt
import dev.g000sha256.tdl.dto.TestVectorIntObject
import dev.g000sha256.tdl.dto.TestVectorString
import dev.g000sha256.tdl.dto.TestVectorStringObject
import dev.g000sha256.tdl.dto.Text
import dev.g000sha256.tdl.dto.TextEntities
import dev.g000sha256.tdl.dto.TextParseMode
import dev.g000sha256.tdl.dto.ThemeParameters
import dev.g000sha256.tdl.dto.TimeZones
import dev.g000sha256.tdl.dto.TopChatCategory
import dev.g000sha256.tdl.dto.TrendingStickerSets
import dev.g000sha256.tdl.dto.Update
import dev.g000sha256.tdl.dto.UpdateAccentColors
import dev.g000sha256.tdl.dto.UpdateActiveEmojiReactions
import dev.g000sha256.tdl.dto.UpdateActiveLiveLocationMessages
import dev.g000sha256.tdl.dto.UpdateActiveNotifications
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
import dev.g000sha256.tdl.dto.UpdateChatThemes
import dev.g000sha256.tdl.dto.UpdateChatTitle
import dev.g000sha256.tdl.dto.UpdateChatUnreadMentionCount
import dev.g000sha256.tdl.dto.UpdateChatUnreadReactionCount
import dev.g000sha256.tdl.dto.UpdateChatVideoChat
import dev.g000sha256.tdl.dto.UpdateChatViewAsTopics
import dev.g000sha256.tdl.dto.UpdateConnectionState
import dev.g000sha256.tdl.dto.UpdateContactCloseBirthdays
import dev.g000sha256.tdl.dto.UpdateDefaultBackground
import dev.g000sha256.tdl.dto.UpdateDefaultPaidReactionType
import dev.g000sha256.tdl.dto.UpdateDefaultReactionType
import dev.g000sha256.tdl.dto.UpdateDeleteMessages
import dev.g000sha256.tdl.dto.UpdateDiceEmojis
import dev.g000sha256.tdl.dto.UpdateDirectMessagesChatTopic
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
import dev.g000sha256.tdl.dto.UpdateGroupCall
import dev.g000sha256.tdl.dto.UpdateGroupCallParticipant
import dev.g000sha256.tdl.dto.UpdateGroupCallParticipants
import dev.g000sha256.tdl.dto.UpdateGroupCallVerificationState
import dev.g000sha256.tdl.dto.UpdateHavePendingNotifications
import dev.g000sha256.tdl.dto.UpdateInstalledStickerSets
import dev.g000sha256.tdl.dto.UpdateLanguagePackStrings
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
import dev.g000sha256.tdl.dto.UpdateNewInlineCallbackQuery
import dev.g000sha256.tdl.dto.UpdateNewInlineQuery
import dev.g000sha256.tdl.dto.UpdateNewMessage
import dev.g000sha256.tdl.dto.UpdateNewPreCheckoutQuery
import dev.g000sha256.tdl.dto.UpdateNewShippingQuery
import dev.g000sha256.tdl.dto.UpdateNotification
import dev.g000sha256.tdl.dto.UpdateNotificationGroup
import dev.g000sha256.tdl.dto.UpdateOption
import dev.g000sha256.tdl.dto.UpdateOwnedStarCount
import dev.g000sha256.tdl.dto.UpdatePaidMediaPurchased
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
import dev.g000sha256.tdl.dto.UpdateTopicMessageCount
import dev.g000sha256.tdl.dto.UpdateTrendingStickerSets
import dev.g000sha256.tdl.dto.UpdateUnconfirmedSession
import dev.g000sha256.tdl.dto.UpdateUnreadChatCount
import dev.g000sha256.tdl.dto.UpdateUnreadMessageCount
import dev.g000sha256.tdl.dto.UpdateUser
import dev.g000sha256.tdl.dto.UpdateUserFullInfo
import dev.g000sha256.tdl.dto.UpdateUserPrivacySettingRules
import dev.g000sha256.tdl.dto.UpdateUserStatus
import dev.g000sha256.tdl.dto.UpdateVideoPublished
import dev.g000sha256.tdl.dto.UpdateWebAppMessageSent
import dev.g000sha256.tdl.dto.Updates
import dev.g000sha256.tdl.dto.UpgradeGiftResult
import dev.g000sha256.tdl.dto.UpgradedGift
import dev.g000sha256.tdl.dto.UpgradedGiftAttributeId
import dev.g000sha256.tdl.dto.User
import dev.g000sha256.tdl.dto.UserFullInfo
import dev.g000sha256.tdl.dto.UserLink
import dev.g000sha256.tdl.dto.UserPrivacySetting
import dev.g000sha256.tdl.dto.UserPrivacySettingRules
import dev.g000sha256.tdl.dto.UserSupportInfo
import dev.g000sha256.tdl.dto.Users
import dev.g000sha256.tdl.dto.ValidatedOrderInfo
import dev.g000sha256.tdl.dto.VideoChatStreams
import dev.g000sha256.tdl.dto.WebAppInfo
import dev.g000sha256.tdl.dto.WebAppOpenParameters
import dev.g000sha256.tdl.dto.WebPageInstantView
import kotlin.Array
import kotlin.Boolean
import kotlin.ByteArray
import kotlin.Double
import kotlin.Int
import kotlin.IntArray
import kotlin.Long
import kotlin.LongArray
import kotlin.String
import kotlinx.coroutines.flow.Flow

/**
 * A Kotlin Coroutines client for the TDLib.
 *
 * You should subscribe to the primary update flows before calling requests to avoid missing initial updates.
 */
public abstract class TdlClient internal constructor() {
    /**
     * All updates.
     */
    public abstract val allUpdates: Flow<Update>

    /**
     * The user authorization state has changed.
     */
    public abstract val authorizationStateUpdates: Flow<UpdateAuthorizationState>

    /**
     * A new message was received; can also be an outgoing message.
     */
    public abstract val newMessageUpdates: Flow<UpdateNewMessage>

    /**
     * A request to send a message has reached the Telegram server. This doesn't mean that the message will be sent successfully. This update is sent only if the option &quot;use_quick_ack&quot; is set to true. This update may be sent multiple times for the same message.
     */
    public abstract val messageSendAcknowledgedUpdates: Flow<UpdateMessageSendAcknowledged>

    /**
     * A message has been successfully sent.
     */
    public abstract val messageSendSucceededUpdates: Flow<UpdateMessageSendSucceeded>

    /**
     * A message failed to send. Be aware that some messages being sent can be irrecoverably deleted, in which case updateDeleteMessages will be received instead of this update.
     */
    public abstract val messageSendFailedUpdates: Flow<UpdateMessageSendFailed>

    /**
     * The message content has changed.
     */
    public abstract val messageContentUpdates: Flow<UpdateMessageContent>

    /**
     * A message was edited. Changes in the message content will come in a separate updateMessageContent.
     */
    public abstract val messageEditedUpdates: Flow<UpdateMessageEdited>

    /**
     * The message pinned state was changed.
     */
    public abstract val messageIsPinnedUpdates: Flow<UpdateMessageIsPinned>

    /**
     * The information about interactions with a message has changed.
     */
    public abstract val messageInteractionInfoUpdates: Flow<UpdateMessageInteractionInfo>

    /**
     * The message content was opened. Updates voice note messages to &quot;listened&quot;, video note messages to &quot;viewed&quot; and starts the self-destruct timer.
     */
    public abstract val messageContentOpenedUpdates: Flow<UpdateMessageContentOpened>

    /**
     * A message with an unread mention was read.
     */
    public abstract val messageMentionReadUpdates: Flow<UpdateMessageMentionRead>

    /**
     * The list of unread reactions added to a message was changed.
     */
    public abstract val messageUnreadReactionsUpdates: Flow<UpdateMessageUnreadReactions>

    /**
     * A fact-check added to a message was changed.
     */
    public abstract val messageFactCheckUpdates: Flow<UpdateMessageFactCheck>

    /**
     * A message with a live location was viewed. When the update is received, the application is expected to update the live location.
     */
    public abstract val messageLiveLocationViewedUpdates: Flow<UpdateMessageLiveLocationViewed>

    /**
     * An automatically scheduled message with video has been successfully sent after conversion.
     */
    public abstract val videoPublishedUpdates: Flow<UpdateVideoPublished>

    /**
     * A new chat has been loaded/created. This update is guaranteed to come before the chat identifier is returned to the application. The chat field changes will be reported through separate updates.
     */
    public abstract val newChatUpdates: Flow<UpdateNewChat>

    /**
     * The title of a chat was changed.
     */
    public abstract val chatTitleUpdates: Flow<UpdateChatTitle>

    /**
     * A chat photo was changed.
     */
    public abstract val chatPhotoUpdates: Flow<UpdateChatPhoto>

    /**
     * Chat accent colors have changed.
     */
    public abstract val chatAccentColorsUpdates: Flow<UpdateChatAccentColors>

    /**
     * Chat permissions were changed.
     */
    public abstract val chatPermissionsUpdates: Flow<UpdateChatPermissions>

    /**
     * The last message of a chat was changed.
     */
    public abstract val chatLastMessageUpdates: Flow<UpdateChatLastMessage>

    /**
     * The position of a chat in a chat list has changed. An updateChatLastMessage or updateChatDraftMessage update might be sent instead of the update.
     */
    public abstract val chatPositionUpdates: Flow<UpdateChatPosition>

    /**
     * A chat was added to a chat list.
     */
    public abstract val chatAddedToListUpdates: Flow<UpdateChatAddedToList>

    /**
     * A chat was removed from a chat list.
     */
    public abstract val chatRemovedFromListUpdates: Flow<UpdateChatRemovedFromList>

    /**
     * Incoming messages were read or the number of unread messages has been changed.
     */
    public abstract val chatReadInboxUpdates: Flow<UpdateChatReadInbox>

    /**
     * Outgoing messages were read.
     */
    public abstract val chatReadOutboxUpdates: Flow<UpdateChatReadOutbox>

    /**
     * The chat action bar was changed.
     */
    public abstract val chatActionBarUpdates: Flow<UpdateChatActionBar>

    /**
     * The bar for managing business bot was changed in a chat.
     */
    public abstract val chatBusinessBotManageBarUpdates: Flow<UpdateChatBusinessBotManageBar>

    /**
     * The chat available reactions were changed.
     */
    public abstract val chatAvailableReactionsUpdates: Flow<UpdateChatAvailableReactions>

    /**
     * A chat draft has changed. Be aware that the update may come in the currently opened chat but with old content of the draft. If the user has changed the content of the draft, this update mustn't be applied.
     */
    public abstract val chatDraftMessageUpdates: Flow<UpdateChatDraftMessage>

    /**
     * Chat emoji status has changed.
     */
    public abstract val chatEmojiStatusUpdates: Flow<UpdateChatEmojiStatus>

    /**
     * The message sender that is selected to send messages in a chat has changed.
     */
    public abstract val chatMessageSenderUpdates: Flow<UpdateChatMessageSender>

    /**
     * The message auto-delete or self-destruct timer setting for a chat was changed.
     */
    public abstract val chatMessageAutoDeleteTimeUpdates: Flow<UpdateChatMessageAutoDeleteTime>

    /**
     * Notification settings for a chat were changed.
     */
    public abstract val chatNotificationSettingsUpdates: Flow<UpdateChatNotificationSettings>

    /**
     * The chat pending join requests were changed.
     */
    public abstract val chatPendingJoinRequestsUpdates: Flow<UpdateChatPendingJoinRequests>

    /**
     * The default chat reply markup was changed. Can occur because new messages with reply markup were received or because an old reply markup was hidden by the user.
     */
    public abstract val chatReplyMarkupUpdates: Flow<UpdateChatReplyMarkup>

    /**
     * The chat background was changed.
     */
    public abstract val chatBackgroundUpdates: Flow<UpdateChatBackground>

    /**
     * The chat theme was changed.
     */
    public abstract val chatThemeUpdates: Flow<UpdateChatTheme>

    /**
     * The chat unreadMentionCount has changed.
     */
    public abstract val chatUnreadMentionCountUpdates: Flow<UpdateChatUnreadMentionCount>

    /**
     * The chat unreadReactionCount has changed.
     */
    public abstract val chatUnreadReactionCountUpdates: Flow<UpdateChatUnreadReactionCount>

    /**
     * A chat video chat state has changed.
     */
    public abstract val chatVideoChatUpdates: Flow<UpdateChatVideoChat>

    /**
     * The value of the default disableNotification parameter, used when a message is sent to the chat, was changed.
     */
    public abstract val chatDefaultDisableNotificationUpdates:
            Flow<UpdateChatDefaultDisableNotification>

    /**
     * A chat content was allowed or restricted for saving.
     */
    public abstract val chatHasProtectedContentUpdates: Flow<UpdateChatHasProtectedContent>

    /**
     * Translation of chat messages was enabled or disabled.
     */
    public abstract val chatIsTranslatableUpdates: Flow<UpdateChatIsTranslatable>

    /**
     * A chat was marked as unread or was read.
     */
    public abstract val chatIsMarkedAsUnreadUpdates: Flow<UpdateChatIsMarkedAsUnread>

    /**
     * A chat default appearance has changed.
     */
    public abstract val chatViewAsTopicsUpdates: Flow<UpdateChatViewAsTopics>

    /**
     * A chat was blocked or unblocked.
     */
    public abstract val chatBlockListUpdates: Flow<UpdateChatBlockList>

    /**
     * A chat's hasScheduledMessages field has changed.
     */
    public abstract val chatHasScheduledMessagesUpdates: Flow<UpdateChatHasScheduledMessages>

    /**
     * The list of chat folders or a chat folder has changed.
     */
    public abstract val chatFoldersUpdates: Flow<UpdateChatFolders>

    /**
     * The number of online group members has changed. This update with non-zero number of online group members is sent only for currently opened chats. There is no guarantee that it is sent just after the number of online users has changed.
     */
    public abstract val chatOnlineMemberCountUpdates: Flow<UpdateChatOnlineMemberCount>

    /**
     * Basic information about a Saved Messages topic has changed. This update is guaranteed to come before the topic identifier is returned to the application.
     */
    public abstract val savedMessagesTopicUpdates: Flow<UpdateSavedMessagesTopic>

    /**
     * Number of Saved Messages topics has changed.
     */
    public abstract val savedMessagesTopicCountUpdates: Flow<UpdateSavedMessagesTopicCount>

    /**
     * Basic information about a topic in a channel direct messages chat administered by the current user has changed. This update is guaranteed to come before the topic identifier is returned to the application.
     */
    public abstract val directMessagesChatTopicUpdates: Flow<UpdateDirectMessagesChatTopic>

    /**
     * Number of messages in a topic has changed; for Saved Messages and channel direct messages chat topics only.
     */
    public abstract val topicMessageCountUpdates: Flow<UpdateTopicMessageCount>

    /**
     * Basic information about a quick reply shortcut has changed. This update is guaranteed to come before the quick shortcut name is returned to the application.
     */
    public abstract val quickReplyShortcutUpdates: Flow<UpdateQuickReplyShortcut>

    /**
     * A quick reply shortcut and all its messages were deleted.
     */
    public abstract val quickReplyShortcutDeletedUpdates: Flow<UpdateQuickReplyShortcutDeleted>

    /**
     * The list of quick reply shortcuts has changed.
     */
    public abstract val quickReplyShortcutsUpdates: Flow<UpdateQuickReplyShortcuts>

    /**
     * The list of quick reply shortcut messages has changed.
     */
    public abstract val quickReplyShortcutMessagesUpdates: Flow<UpdateQuickReplyShortcutMessages>

    /**
     * Basic information about a topic in a forum chat was changed.
     */
    public abstract val forumTopicInfoUpdates: Flow<UpdateForumTopicInfo>

    /**
     * Information about a topic in a forum chat was changed.
     */
    public abstract val forumTopicUpdates: Flow<UpdateForumTopic>

    /**
     * Notification settings for some type of chats were updated.
     */
    public abstract val scopeNotificationSettingsUpdates: Flow<UpdateScopeNotificationSettings>

    /**
     * Notification settings for reactions were updated.
     */
    public abstract val reactionNotificationSettingsUpdates:
            Flow<UpdateReactionNotificationSettings>

    /**
     * A notification was changed.
     */
    public abstract val notificationUpdates: Flow<UpdateNotification>

    /**
     * A list of active notifications in a notification group has changed.
     */
    public abstract val notificationGroupUpdates: Flow<UpdateNotificationGroup>

    /**
     * Contains active notifications that were shown on previous application launches. This update is sent only if the message database is used. In that case it comes once before any updateNotification and updateNotificationGroup update.
     */
    public abstract val activeNotificationsUpdates: Flow<UpdateActiveNotifications>

    /**
     * Describes whether there are some pending notification updates. Can be used to prevent application from killing, while there are some pending notifications.
     */
    public abstract val havePendingNotificationsUpdates: Flow<UpdateHavePendingNotifications>

    /**
     * Some messages were deleted.
     */
    public abstract val deleteMessagesUpdates: Flow<UpdateDeleteMessages>

    /**
     * A message sender activity in the chat has changed.
     */
    public abstract val chatActionUpdates: Flow<UpdateChatAction>

    /**
     * The user went online or offline.
     */
    public abstract val userStatusUpdates: Flow<UpdateUserStatus>

    /**
     * Some data of a user has changed. This update is guaranteed to come before the user identifier is returned to the application.
     */
    public abstract val userUpdates: Flow<UpdateUser>

    /**
     * Some data of a basic group has changed. This update is guaranteed to come before the basic group identifier is returned to the application.
     */
    public abstract val basicGroupUpdates: Flow<UpdateBasicGroup>

    /**
     * Some data of a supergroup or a channel has changed. This update is guaranteed to come before the supergroup identifier is returned to the application.
     */
    public abstract val supergroupUpdates: Flow<UpdateSupergroup>

    /**
     * Some data of a secret chat has changed. This update is guaranteed to come before the secret chat identifier is returned to the application.
     */
    public abstract val secretChatUpdates: Flow<UpdateSecretChat>

    /**
     * Some data in userFullInfo has been changed.
     */
    public abstract val userFullInfoUpdates: Flow<UpdateUserFullInfo>

    /**
     * Some data in basicGroupFullInfo has been changed.
     */
    public abstract val basicGroupFullInfoUpdates: Flow<UpdateBasicGroupFullInfo>

    /**
     * Some data in supergroupFullInfo has been changed.
     */
    public abstract val supergroupFullInfoUpdates: Flow<UpdateSupergroupFullInfo>

    /**
     * A service notification from the server was received. Upon receiving this the application must show a popup with the content of the notification.
     */
    public abstract val serviceNotificationUpdates: Flow<UpdateServiceNotification>

    /**
     * Information about a file was updated.
     */
    public abstract val fileUpdates: Flow<UpdateFile>

    /**
     * The file generation process needs to be started by the application. Use setFileGenerationProgress and finishFileGeneration to generate the file.
     */
    public abstract val fileGenerationStartUpdates: Flow<UpdateFileGenerationStart>

    /**
     * File generation is no longer needed.
     */
    public abstract val fileGenerationStopUpdates: Flow<UpdateFileGenerationStop>

    /**
     * The state of the file download list has changed.
     */
    public abstract val fileDownloadsUpdates: Flow<UpdateFileDownloads>

    /**
     * A file was added to the file download list. This update is sent only after file download list is loaded for the first time.
     */
    public abstract val fileAddedToDownloadsUpdates: Flow<UpdateFileAddedToDownloads>

    /**
     * A file download was changed. This update is sent only after file download list is loaded for the first time.
     */
    public abstract val fileDownloadUpdates: Flow<UpdateFileDownload>

    /**
     * A file was removed from the file download list. This update is sent only after file download list is loaded for the first time.
     */
    public abstract val fileRemovedFromDownloadsUpdates: Flow<UpdateFileRemovedFromDownloads>

    /**
     * A request can't be completed unless application verification is performed; for official mobile applications only. The method setApplicationVerificationToken must be called once the verification is completed or failed.
     */
    public abstract val applicationVerificationRequiredUpdates:
            Flow<UpdateApplicationVerificationRequired>

    /**
     * A request can't be completed unless reCAPTCHA verification is performed; for official mobile applications only. The method setApplicationVerificationToken must be called once the verification is completed or failed.
     */
    public abstract val applicationRecaptchaVerificationRequiredUpdates:
            Flow<UpdateApplicationRecaptchaVerificationRequired>

    /**
     * New call was created or information about a call was updated.
     */
    public abstract val callUpdates: Flow<UpdateCall>

    /**
     * Information about a group call was updated.
     */
    public abstract val groupCallUpdates: Flow<UpdateGroupCall>

    /**
     * Information about a group call participant was changed. The updates are sent only after the group call is received through getGroupCall and only if the call is joined or being joined.
     */
    public abstract val groupCallParticipantUpdates: Flow<UpdateGroupCallParticipant>

    /**
     * The list of group call participants that can send and receive encrypted call data has changed; for group calls not bound to a chat only.
     */
    public abstract val groupCallParticipantsUpdates: Flow<UpdateGroupCallParticipants>

    /**
     * The verification state of an encrypted group call has changed; for group calls not bound to a chat only.
     */
    public abstract val groupCallVerificationStateUpdates: Flow<UpdateGroupCallVerificationState>

    /**
     * New call signaling data arrived.
     */
    public abstract val newCallSignalingDataUpdates: Flow<UpdateNewCallSignalingData>

    /**
     * Some privacy setting rules have been changed.
     */
    public abstract val userPrivacySettingRulesUpdates: Flow<UpdateUserPrivacySettingRules>

    /**
     * Number of unread messages in a chat list has changed. This update is sent only if the message database is used.
     */
    public abstract val unreadMessageCountUpdates: Flow<UpdateUnreadMessageCount>

    /**
     * Number of unread chats, i.e. with unread messages or marked as unread, has changed. This update is sent only if the message database is used.
     */
    public abstract val unreadChatCountUpdates: Flow<UpdateUnreadChatCount>

    /**
     * A story was changed.
     */
    public abstract val storyUpdates: Flow<UpdateStory>

    /**
     * A story became inaccessible.
     */
    public abstract val storyDeletedUpdates: Flow<UpdateStoryDeleted>

    /**
     * A story has been successfully posted.
     */
    public abstract val storyPostSucceededUpdates: Flow<UpdateStoryPostSucceeded>

    /**
     * A story failed to post. If the story posting is canceled, then updateStoryDeleted will be received instead of this update.
     */
    public abstract val storyPostFailedUpdates: Flow<UpdateStoryPostFailed>

    /**
     * The list of active stories posted by a specific chat has changed.
     */
    public abstract val chatActiveStoriesUpdates: Flow<UpdateChatActiveStories>

    /**
     * Number of chats in a story list has changed.
     */
    public abstract val storyListChatCountUpdates: Flow<UpdateStoryListChatCount>

    /**
     * Story stealth mode settings have changed.
     */
    public abstract val storyStealthModeUpdates: Flow<UpdateStoryStealthMode>

    /**
     * An option changed its value.
     */
    public abstract val optionUpdates: Flow<UpdateOption>

    /**
     * A sticker set has changed.
     */
    public abstract val stickerSetUpdates: Flow<UpdateStickerSet>

    /**
     * The list of installed sticker sets was updated.
     */
    public abstract val installedStickerSetsUpdates: Flow<UpdateInstalledStickerSets>

    /**
     * The list of trending sticker sets was updated or some of them were viewed.
     */
    public abstract val trendingStickerSetsUpdates: Flow<UpdateTrendingStickerSets>

    /**
     * The list of recently used stickers was updated.
     */
    public abstract val recentStickersUpdates: Flow<UpdateRecentStickers>

    /**
     * The list of favorite stickers was updated.
     */
    public abstract val favoriteStickersUpdates: Flow<UpdateFavoriteStickers>

    /**
     * The list of saved animations was updated.
     */
    public abstract val savedAnimationsUpdates: Flow<UpdateSavedAnimations>

    /**
     * The list of saved notification sounds was updated. This update may not be sent until information about a notification sound was requested for the first time.
     */
    public abstract val savedNotificationSoundsUpdates: Flow<UpdateSavedNotificationSounds>

    /**
     * The default background has changed.
     */
    public abstract val defaultBackgroundUpdates: Flow<UpdateDefaultBackground>

    /**
     * The list of available chat themes has changed.
     */
    public abstract val chatThemesUpdates: Flow<UpdateChatThemes>

    /**
     * The list of supported accent colors has changed.
     */
    public abstract val accentColorsUpdates: Flow<UpdateAccentColors>

    /**
     * The list of supported accent colors for user profiles has changed.
     */
    public abstract val profileAccentColorsUpdates: Flow<UpdateProfileAccentColors>

    /**
     * Some language pack strings have been updated.
     */
    public abstract val languagePackStringsUpdates: Flow<UpdateLanguagePackStrings>

    /**
     * The connection state has changed. This update must be used only to show a human-readable description of the connection state.
     */
    public abstract val connectionStateUpdates: Flow<UpdateConnectionState>

    /**
     * The freeze state of the current user's account has changed.
     */
    public abstract val freezeStateUpdates: Flow<UpdateFreezeState>

    /**
     * New terms of service must be accepted by the user. If the terms of service are declined, then the deleteAccount method must be called with the reason &quot;Decline ToS update&quot;.
     */
    public abstract val termsOfServiceUpdates: Flow<UpdateTermsOfService>

    /**
     * The first unconfirmed session has changed.
     */
    public abstract val unconfirmedSessionUpdates: Flow<UpdateUnconfirmedSession>

    /**
     * The list of bots added to attachment or side menu has changed.
     */
    public abstract val attachmentMenuBotsUpdates: Flow<UpdateAttachmentMenuBots>

    /**
     * A message was sent by an opened Web App, so the Web App needs to be closed.
     */
    public abstract val webAppMessageSentUpdates: Flow<UpdateWebAppMessageSent>

    /**
     * The list of active emoji reactions has changed.
     */
    public abstract val activeEmojiReactionsUpdates: Flow<UpdateActiveEmojiReactions>

    /**
     * The list of available message effects has changed.
     */
    public abstract val availableMessageEffectsUpdates: Flow<UpdateAvailableMessageEffects>

    /**
     * The type of default reaction has changed.
     */
    public abstract val defaultReactionTypeUpdates: Flow<UpdateDefaultReactionType>

    /**
     * The type of default paid reaction has changed.
     */
    public abstract val defaultPaidReactionTypeUpdates: Flow<UpdateDefaultPaidReactionType>

    /**
     * Tags used in Saved Messages or a Saved Messages topic have changed.
     */
    public abstract val savedMessagesTagsUpdates: Flow<UpdateSavedMessagesTags>

    /**
     * The list of messages with active live location that need to be updated by the application has changed. The list is persistent across application restarts only if the message database is used.
     */
    public abstract val activeLiveLocationMessagesUpdates: Flow<UpdateActiveLiveLocationMessages>

    /**
     * The number of Telegram Stars owned by the current user has changed.
     */
    public abstract val ownedStarCountUpdates: Flow<UpdateOwnedStarCount>

    /**
     * The revenue earned from sponsored messages in a chat has changed. If chat revenue screen is opened, then getChatRevenueTransactions may be called to fetch new transactions.
     */
    public abstract val chatRevenueAmountUpdates: Flow<UpdateChatRevenueAmount>

    /**
     * The Telegram Star revenue earned by a bot or a chat has changed. If Telegram Star transaction screen of the chat is opened, then getStarTransactions may be called to fetch new transactions.
     */
    public abstract val starRevenueStatusUpdates: Flow<UpdateStarRevenueStatus>

    /**
     * The parameters of speech recognition without Telegram Premium subscription has changed.
     */
    public abstract val speechRecognitionTrialUpdates: Flow<UpdateSpeechRecognitionTrial>

    /**
     * The list of supported dice emojis has changed.
     */
    public abstract val diceEmojisUpdates: Flow<UpdateDiceEmojis>

    /**
     * Some animated emoji message was clicked and a big animated sticker must be played if the message is visible on the screen. chatActionWatchingAnimations with the text of the message needs to be sent if the sticker is played.
     */
    public abstract val animatedEmojiMessageClickedUpdates: Flow<UpdateAnimatedEmojiMessageClicked>

    /**
     * The parameters of animation search through getOption(&quot;animation_search_bot_username&quot;) bot has changed.
     */
    public abstract val animationSearchParametersUpdates: Flow<UpdateAnimationSearchParameters>

    /**
     * The list of suggested to the user actions has changed.
     */
    public abstract val suggestedActionsUpdates: Flow<UpdateSuggestedActions>

    /**
     * Download or upload file speed for the user was limited, but it can be restored by subscription to Telegram Premium. The notification can be postponed until a being downloaded or uploaded file is visible to the user. Use getOption(&quot;premium_download_speedup&quot;) or getOption(&quot;premium_upload_speedup&quot;) to get expected speedup after subscription to Telegram Premium.
     */
    public abstract val speedLimitNotificationUpdates: Flow<UpdateSpeedLimitNotification>

    /**
     * The list of contacts that had birthdays recently or will have birthday soon has changed.
     */
    public abstract val contactCloseBirthdaysUpdates: Flow<UpdateContactCloseBirthdays>

    /**
     * Autosave settings for some type of chats were updated.
     */
    public abstract val autosaveSettingsUpdates: Flow<UpdateAutosaveSettings>

    /**
     * A business connection has changed; for bots only.
     */
    public abstract val businessConnectionUpdates: Flow<UpdateBusinessConnection>

    /**
     * A new message was added to a business account; for bots only.
     */
    public abstract val newBusinessMessageUpdates: Flow<UpdateNewBusinessMessage>

    /**
     * A message in a business account was edited; for bots only.
     */
    public abstract val businessMessageEditedUpdates: Flow<UpdateBusinessMessageEdited>

    /**
     * Messages in a business account were deleted; for bots only.
     */
    public abstract val businessMessagesDeletedUpdates: Flow<UpdateBusinessMessagesDeleted>

    /**
     * A new incoming inline query; for bots only.
     */
    public abstract val newInlineQueryUpdates: Flow<UpdateNewInlineQuery>

    /**
     * The user has chosen a result of an inline query; for bots only.
     */
    public abstract val newChosenInlineResultUpdates: Flow<UpdateNewChosenInlineResult>

    /**
     * A new incoming callback query; for bots only.
     */
    public abstract val newCallbackQueryUpdates: Flow<UpdateNewCallbackQuery>

    /**
     * A new incoming callback query from a message sent via a bot; for bots only.
     */
    public abstract val newInlineCallbackQueryUpdates: Flow<UpdateNewInlineCallbackQuery>

    /**
     * A new incoming callback query from a business message; for bots only.
     */
    public abstract val newBusinessCallbackQueryUpdates: Flow<UpdateNewBusinessCallbackQuery>

    /**
     * A new incoming shipping query; for bots only. Only for invoices with flexible price.
     */
    public abstract val newShippingQueryUpdates: Flow<UpdateNewShippingQuery>

    /**
     * A new incoming pre-checkout query; for bots only. Contains full information about a checkout.
     */
    public abstract val newPreCheckoutQueryUpdates: Flow<UpdateNewPreCheckoutQuery>

    /**
     * A new incoming event; for bots only.
     */
    public abstract val newCustomEventUpdates: Flow<UpdateNewCustomEvent>

    /**
     * A new incoming query; for bots only.
     */
    public abstract val newCustomQueryUpdates: Flow<UpdateNewCustomQuery>

    /**
     * A poll was updated; for bots only.
     */
    public abstract val pollUpdates: Flow<UpdatePoll>

    /**
     * A user changed the answer to a poll; for bots only.
     */
    public abstract val pollAnswerUpdates: Flow<UpdatePollAnswer>

    /**
     * User rights changed in a chat; for bots only.
     */
    public abstract val chatMemberUpdates: Flow<UpdateChatMember>

    /**
     * A user sent a join request to a chat; for bots only.
     */
    public abstract val newChatJoinRequestUpdates: Flow<UpdateNewChatJoinRequest>

    /**
     * A chat boost has changed; for bots only.
     */
    public abstract val chatBoostUpdates: Flow<UpdateChatBoost>

    /**
     * User changed its reactions on a message with public reactions; for bots only.
     */
    public abstract val messageReactionUpdates: Flow<UpdateMessageReaction>

    /**
     * Reactions added to a message with anonymous reactions have changed; for bots only.
     */
    public abstract val messageReactionsUpdates: Flow<UpdateMessageReactions>

    /**
     * Paid media were purchased by a user; for bots only.
     */
    public abstract val paidMediaPurchasedUpdates: Flow<UpdatePaidMediaPurchased>

    /**
     * Accepts an incoming call.
     *
     * @param callId Call identifier.
     * @param protocol The call protocols supported by the application.
     */
    public abstract suspend fun acceptCall(callId: Int, protocol: CallProtocol): TdlResult<Ok>

    /**
     * Accepts Telegram terms of services.
     *
     * @param termsOfServiceId Terms of service identifier.
     */
    public abstract suspend fun acceptTermsOfService(termsOfServiceId: String): TdlResult<Ok>

    /**
     * Activates stealth mode for stories, which hides all views of stories from the current user in the last &quot;story_stealth_mode_past_period&quot; seconds and for the next &quot;story_stealth_mode_future_period&quot; seconds; for Telegram Premium users only.
     */
    public abstract suspend fun activateStoryStealthMode(): TdlResult<Ok>

    /**
     * Adds a new media preview to the beginning of the list of media previews of a bot. Returns the added preview after addition is completed server-side. The total number of previews must not exceed getOption(&quot;bot_media_preview_count_max&quot;) for the given language.
     *
     * @param botUserId Identifier of the target bot. The bot must be owned and must have the main Web App.
     * @param languageCode A two-letter ISO 639-1 language code for which preview is added. If empty, then the preview will be shown to all users for whose languages there are no dedicated previews. If non-empty, then there must be an official language pack of the same name, which is returned by getLocalizationTargetInfo.
     * @param content Content of the added preview.
     */
    public abstract suspend fun addBotMediaPreview(
        botUserId: Long,
        languageCode: String,
        content: InputStoryContent,
    ): TdlResult<BotMediaPreview>

    /**
     * Adds a chat folder by an invite link.
     *
     * @param inviteLink Invite link for the chat folder.
     * @param chatIds Identifiers of the chats added to the chat folder. The chats are automatically joined if they aren't joined yet.
     */
    public abstract suspend fun addChatFolderByInviteLink(inviteLink: String, chatIds: LongArray): TdlResult<Ok>

    /**
     * Adds a new member to a chat; requires canInviteUsers member right. Members can't be added to private or secret chats. Returns information about members that weren't added.
     *
     * @param chatId Chat identifier.
     * @param userId Identifier of the user.
     * @param forwardLimit The number of earlier messages from the chat to be forwarded to the new member; up to 100. Ignored for supergroups and channels, or if the added user is a bot.
     */
    public abstract suspend fun addChatMember(
        chatId: Long,
        userId: Long,
        forwardLimit: Int,
    ): TdlResult<FailedToAddMembers>

    /**
     * Adds multiple new members to a chat; requires canInviteUsers member right. Currently, this method is only available for supergroups and channels. This method can't be used to join a chat. Members can't be added to a channel if it has more than 200 members. Returns information about members that weren't added.
     *
     * @param chatId Chat identifier.
     * @param userIds Identifiers of the users to be added to the chat. The maximum number of added users is 20 for supergroups and 100 for channels.
     */
    public abstract suspend fun addChatMembers(chatId: Long, userIds: LongArray): TdlResult<FailedToAddMembers>

    /**
     * Adds a chat to a chat list. A chat can't be simultaneously in Main and Archive chat lists, so it is automatically removed from another one if needed.
     *
     * @param chatId Chat identifier.
     * @param chatList The chat list. Use getChatListsToAddChat to get suitable chat lists.
     */
    public abstract suspend fun addChatToList(chatId: Long, chatList: ChatList): TdlResult<Ok>

    /**
     * Adds a user to the contact list or edits an existing contact by their user identifier.
     *
     * @param contact The contact to add or edit; phone number may be empty and needs to be specified only if known, vCard is ignored.
     * @param sharePhoneNumber Pass true to share the current user's phone number with the new contact. A corresponding rule to userPrivacySettingShowPhoneNumber will be added if needed. Use the field userFullInfo.needPhoneNumberPrivacyException to check whether the current user needs to be asked to share their phone number.
     */
    public abstract suspend fun addContact(contact: Contact, sharePhoneNumber: Boolean): TdlResult<Ok>

    /**
     * Adds a custom server language pack to the list of installed language packs in current localization target. Can be called before authorization.
     *
     * @param languagePackId Identifier of a language pack to be added.
     */
    public abstract suspend fun addCustomServerLanguagePack(languagePackId: String): TdlResult<Ok>

    /**
     * Adds a new sticker to the list of favorite stickers. The new sticker is added to the top of the list. If the sticker was already in the list, it is removed from the list first. Only stickers belonging to a sticker set or in WEBP or WEBM format can be added to this list. Emoji stickers can't be added to favorite stickers.
     *
     * @param sticker Sticker file to add.
     */
    public abstract suspend fun addFavoriteSticker(sticker: InputFile): TdlResult<Ok>

    /**
     * Adds a file from a message to the list of file downloads. Download progress and completion of the download will be notified through updateFile updates. If message database is used, the list of file downloads is persistent across application restarts. The downloading is independent of download using downloadFile, i.e. it continues if downloadFile is canceled or is used to download a part of the file.
     *
     * @param fileId Identifier of the file to download.
     * @param chatId Chat identifier of the message with the file.
     * @param messageId Message identifier.
     * @param priority Priority of the download (1-32). The higher the priority, the earlier the file will be downloaded. If the priorities of two files are equal, then the last one for which downloadFile/addFileToDownloads was called will be downloaded first.
     */
    public abstract suspend fun addFileToDownloads(
        fileId: Int,
        chatId: Long,
        messageId: Long,
        priority: Int,
    ): TdlResult<File>

    /**
     * Adds a local message to a chat. The message is persistent across application restarts only if the message database is used. Returns the added message.
     *
     * @param chatId Target chat; channel direct messages chats aren't supported.
     * @param senderId Identifier of the sender of the message.
     * @param replyTo Information about the message or story to be replied; pass null if none.
     * @param disableNotification Pass true to disable notification for the message.
     * @param inputMessageContent The content of the message to be added.
     */
    public abstract suspend fun addLocalMessage(
        chatId: Long,
        senderId: MessageSender,
        replyTo: InputMessageReplyTo? = null,
        disableNotification: Boolean,
        inputMessageContent: InputMessageContent,
    ): TdlResult<Message>

    /**
     * Adds a message to TDLib internal log. Can be called synchronously.
     *
     * @param verbosityLevel The minimum verbosity level needed for the message to be logged; 0-1023.
     * @param text Text of a message to log.
     */
    public abstract suspend fun addLogMessage(verbosityLevel: Int, text: String): TdlResult<Ok>

    /**
     * Adds a reaction or a tag to a message. Use getMessageAvailableReactions to receive the list of available reactions for the message.
     *
     * @param chatId Identifier of the chat to which the message belongs.
     * @param messageId Identifier of the message.
     * @param reactionType Type of the reaction to add. Use addPendingPaidMessageReaction instead to add the paid reaction.
     * @param isBig Pass true if the reaction is added with a big animation.
     * @param updateRecentReactions Pass true if the reaction needs to be added to recent reactions; tags are never added to the list of recent reactions.
     */
    public abstract suspend fun addMessageReaction(
        chatId: Long,
        messageId: Long,
        reactionType: ReactionType,
        isBig: Boolean,
        updateRecentReactions: Boolean,
    ): TdlResult<Ok>

    /**
     * Adds the specified data to data usage statistics. Can be called before authorization.
     *
     * @param entry The network statistics entry with the data to be added to statistics.
     */
    public abstract suspend fun addNetworkStatistics(entry: NetworkStatisticsEntry): TdlResult<Ok>

    /**
     * Adds the paid message reaction to a message. Use getMessageAvailableReactions to check whether the reaction is available for the message.
     *
     * @param chatId Identifier of the chat to which the message belongs.
     * @param messageId Identifier of the message.
     * @param starCount Number of Telegram Stars to be used for the reaction. The total number of pending paid reactions must not exceed getOption(&quot;paid_reaction_star_count_max&quot;).
     * @param type Type of the paid reaction; pass null if the user didn't choose reaction type explicitly, for example, the reaction is set from the message bubble.
     */
    public abstract suspend fun addPendingPaidMessageReaction(
        chatId: Long,
        messageId: Long,
        starCount: Long,
        type: PaidReactionType? = null,
    ): TdlResult<Ok>

    /**
     * Adds a proxy server for network requests. Can be called before authorization.
     *
     * @param server Proxy server domain or IP address.
     * @param port Proxy server port.
     * @param enable Pass true to immediately enable the proxy.
     * @param type Proxy type.
     */
    public abstract suspend fun addProxy(
        server: String,
        port: Int,
        enable: Boolean,
        type: ProxyType,
    ): TdlResult<Proxy>

    /**
     * Adds a message to a quick reply shortcut via inline bot. If shortcut doesn't exist and there are less than getOption(&quot;quick_reply_shortcut_count_max&quot;) shortcuts, then a new shortcut is created. The shortcut must not contain more than getOption(&quot;quick_reply_shortcut_message_count_max&quot;) messages after adding the new message. Returns the added message.
     *
     * @param shortcutName Name of the target shortcut.
     * @param replyToMessageId Identifier of a quick reply message in the same shortcut to be replied; pass 0 if none.
     * @param queryId Identifier of the inline query.
     * @param resultId Identifier of the inline query result.
     * @param hideViaBot Pass true to hide the bot, via which the message is sent. Can be used only for bots getOption(&quot;animation_search_bot_username&quot;), getOption(&quot;photo_search_bot_username&quot;), and getOption(&quot;venue_search_bot_username&quot;).
     */
    public abstract suspend fun addQuickReplyShortcutInlineQueryResultMessage(
        shortcutName: String,
        replyToMessageId: Long,
        queryId: Long,
        resultId: String,
        hideViaBot: Boolean,
    ): TdlResult<QuickReplyMessage>

    /**
     * Adds a message to a quick reply shortcut. If shortcut doesn't exist and there are less than getOption(&quot;quick_reply_shortcut_count_max&quot;) shortcuts, then a new shortcut is created. The shortcut must not contain more than getOption(&quot;quick_reply_shortcut_message_count_max&quot;) messages after adding the new message. Returns the added message.
     *
     * @param shortcutName Name of the target shortcut.
     * @param replyToMessageId Identifier of a quick reply message in the same shortcut to be replied; pass 0 if none.
     * @param inputMessageContent The content of the message to be added; inputMessagePoll, inputMessageForwarded and inputMessageLocation with livePeriod aren't supported.
     */
    public abstract suspend fun addQuickReplyShortcutMessage(
        shortcutName: String,
        replyToMessageId: Long,
        inputMessageContent: InputMessageContent,
    ): TdlResult<QuickReplyMessage>

    /**
     * Adds 2-10 messages grouped together into an album to a quick reply shortcut. Currently, only audio, document, photo and video messages can be grouped into an album. Documents and audio files can be only grouped in an album with messages of the same type. Returns sent messages.
     *
     * @param shortcutName Name of the target shortcut.
     * @param replyToMessageId Identifier of a quick reply message in the same shortcut to be replied; pass 0 if none.
     * @param inputMessageContents Contents of messages to be sent. At most 10 messages can be added to an album. All messages must have the same value of showCaptionAboveMedia.
     */
    public abstract suspend fun addQuickReplyShortcutMessageAlbum(
        shortcutName: String,
        replyToMessageId: Long,
        inputMessageContents: Array<InputMessageContent>,
    ): TdlResult<QuickReplyMessages>

    /**
     * Manually adds a new sticker to the list of recently used stickers. The new sticker is added to the top of the list. If the sticker was already in the list, it is removed from the list first. Only stickers belonging to a sticker set or in WEBP or WEBM format can be added to this list. Emoji stickers can't be added to recent stickers.
     *
     * @param isAttached Pass true to add the sticker to the list of stickers recently attached to photo or video files; pass false to add the sticker to the list of recently sent stickers.
     * @param sticker Sticker file to add.
     */
    public abstract suspend fun addRecentSticker(isAttached: Boolean, sticker: InputFile): TdlResult<Stickers>

    /**
     * Adds a chat to the list of recently found chats. The chat is added to the beginning of the list. If the chat is already in the list, it will be removed from the list first.
     *
     * @param chatId Identifier of the chat to add.
     */
    public abstract suspend fun addRecentlyFoundChat(chatId: Long): TdlResult<Ok>

    /**
     * Manually adds a new animation to the list of saved animations. The new animation is added to the beginning of the list. If the animation was already in the list, it is removed first. Only non-secret video animations with MIME type &quot;video/mp4&quot; can be added to the list.
     *
     * @param animation The animation file to be added. Only animations known to the server (i.e., successfully sent via a message) can be added to the list.
     */
    public abstract suspend fun addSavedAnimation(animation: InputFile): TdlResult<Ok>

    /**
     * Adds a new notification sound to the list of saved notification sounds. The new notification sound is added to the top of the list. If it is already in the list, its position isn't changed.
     *
     * @param sound Notification sound file to add.
     */
    public abstract suspend fun addSavedNotificationSound(sound: InputFile): TdlResult<NotificationSound>

    /**
     * Adds a new sticker to a set.
     *
     * @param userId Sticker set owner; ignored for regular users.
     * @param name Sticker set name. The sticker set must be owned by the current user, and contain less than 200 stickers for custom emoji sticker sets and less than 120 otherwise.
     * @param sticker Sticker to add to the set.
     */
    public abstract suspend fun addStickerToSet(
        userId: Long,
        name: String,
        sticker: InputSticker,
    ): TdlResult<Ok>

    /**
     * Allows the specified bot to send messages to the user.
     *
     * @param botUserId Identifier of the target bot.
     */
    public abstract suspend fun allowBotToSendMessages(botUserId: Long): TdlResult<Ok>

    /**
     * Allows the specified user to send unpaid private messages to the current user by adding a rule to userPrivacySettingAllowUnpaidMessages.
     *
     * @param userId Identifier of the user.
     * @param refundPayments Pass true to refund the user previously paid messages.
     */
    public abstract suspend fun allowUnpaidMessagesFromUser(userId: Long, refundPayments: Boolean): TdlResult<Ok>

    /**
     * Sets the result of a callback query; for bots only.
     *
     * @param callbackQueryId Identifier of the callback query.
     * @param text Text of the answer.
     * @param showAlert Pass true to show an alert to the user instead of a toast notification.
     * @param url URL to be opened.
     * @param cacheTime Time during which the result of the query can be cached, in seconds.
     */
    public abstract suspend fun answerCallbackQuery(
        callbackQueryId: Long,
        text: String,
        showAlert: Boolean,
        url: String,
        cacheTime: Int,
    ): TdlResult<Ok>

    /**
     * Answers a custom query; for bots only.
     *
     * @param customQueryId Identifier of a custom query.
     * @param data JSON-serialized answer to the query.
     */
    public abstract suspend fun answerCustomQuery(customQueryId: Long, data: String): TdlResult<Ok>

    /**
     * Sets the result of an inline query; for bots only.
     *
     * @param inlineQueryId Identifier of the inline query.
     * @param isPersonal Pass true if results may be cached and returned only for the user that sent the query. By default, results may be returned to any user who sends the same query.
     * @param button Button to be shown above inline query results; pass null if none.
     * @param results The results of the query.
     * @param cacheTime Allowed time to cache the results of the query, in seconds.
     * @param nextOffset Offset for the next inline query; pass an empty string if there are no more results.
     */
    public abstract suspend fun answerInlineQuery(
        inlineQueryId: Long,
        isPersonal: Boolean,
        button: InlineQueryResultsButton? = null,
        results: Array<InputInlineQueryResult>,
        cacheTime: Int,
        nextOffset: String,
    ): TdlResult<Ok>

    /**
     * Sets the result of a pre-checkout query; for bots only.
     *
     * @param preCheckoutQueryId Identifier of the pre-checkout query.
     * @param errorMessage An error message, empty on success.
     */
    public abstract suspend fun answerPreCheckoutQuery(preCheckoutQueryId: Long, errorMessage: String): TdlResult<Ok>

    /**
     * Sets the result of a shipping query; for bots only.
     *
     * @param shippingQueryId Identifier of the shipping query.
     * @param shippingOptions Available shipping options.
     * @param errorMessage An error message, empty on success.
     */
    public abstract suspend fun answerShippingQuery(
        shippingQueryId: Long,
        shippingOptions: Array<ShippingOption>,
        errorMessage: String,
    ): TdlResult<Ok>

    /**
     * Sets the result of interaction with a Web App and sends corresponding message on behalf of the user to the chat from which the query originated; for bots only.
     *
     * @param webAppQueryId Identifier of the Web App query.
     * @param result The result of the query.
     */
    public abstract suspend fun answerWebAppQuery(webAppQueryId: String, result: InputInlineQueryResult): TdlResult<SentWebAppMessage>

    /**
     * Applies a Telegram Premium gift code.
     *
     * @param code The code to apply.
     */
    public abstract suspend fun applyPremiumGiftCode(code: String): TdlResult<Ok>

    /**
     * Informs server about an in-store purchase. For official applications only.
     *
     * @param transaction Information about the transaction.
     * @param purpose Transaction purpose.
     */
    public abstract suspend fun assignStoreTransaction(transaction: StoreTransaction, purpose: StorePaymentPurpose): TdlResult<Ok>

    /**
     * Bans a member in a chat; requires canRestrictMembers administrator right. Members can't be banned in private or secret chats. In supergroups and channels, the user will not be able to return to the group on their own using invite links, etc., unless unbanned first.
     *
     * @param chatId Chat identifier.
     * @param memberId Member identifier.
     * @param bannedUntilDate Point in time (Unix timestamp) when the user will be unbanned; 0 if never. If the user is banned for more than 366 days or for less than 30 seconds from the current time, the user is considered to be banned forever. Ignored in basic groups and if a chat is banned.
     * @param revokeMessages Pass true to delete all messages in the chat for the user that is being removed. Always true for supergroups and channels.
     */
    public abstract suspend fun banChatMember(
        chatId: Long,
        memberId: MessageSender,
        bannedUntilDate: Int,
        revokeMessages: Boolean,
    ): TdlResult<Ok>

    /**
     * Bans users from a group call not bound to a chat; requires groupCall.isOwned. Only the owner of the group call can invite the banned users back.
     *
     * @param groupCallId Group call identifier.
     * @param userIds Identifiers of group call participants to ban; identifiers of unknown users from the update updateGroupCallParticipants can be also passed to the method.
     */
    public abstract suspend fun banGroupCallParticipants(groupCallId: Int, userIds: LongArray): TdlResult<Ok>

    /**
     * Blocks an original sender of a message in the Replies chat.
     *
     * @param messageId The identifier of an incoming message in the Replies chat.
     * @param deleteMessage Pass true to delete the message.
     * @param deleteAllMessages Pass true to delete all messages from the same sender.
     * @param reportSpam Pass true to report the sender to the Telegram moderators.
     */
    public abstract suspend fun blockMessageSenderFromReplies(
        messageId: Long,
        deleteMessage: Boolean,
        deleteAllMessages: Boolean,
        reportSpam: Boolean,
    ): TdlResult<Ok>

    /**
     * Boosts a chat and returns the list of available chat boost slots for the current user after the boost.
     *
     * @param chatId Identifier of the chat.
     * @param slotIds Identifiers of boost slots of the current user from which to apply boosts to the chat.
     */
    public abstract suspend fun boostChat(chatId: Long, slotIds: IntArray): TdlResult<ChatBoostSlots>

    /**
     * Checks whether the specified bot can send messages to the user. Returns a 404 error if can't and the access can be granted by call to allowBotToSendMessages.
     *
     * @param botUserId Identifier of the target bot.
     */
    public abstract suspend fun canBotSendMessages(botUserId: Long): TdlResult<Ok>

    /**
     * Checks whether the current user can post a story on behalf of a chat; requires canPostStories right for supergroup and channel chats.
     *
     * @param chatId Chat identifier. Pass Saved Messages chat identifier when posting a story on behalf of the current user.
     */
    public abstract suspend fun canPostStory(chatId: Long): TdlResult<CanPostStoryResult>

    /**
     * Checks whether an in-store purchase is possible. Must be called before any in-store purchase. For official applications only.
     *
     * @param purpose Transaction purpose.
     */
    public abstract suspend fun canPurchaseFromStore(purpose: StorePaymentPurpose): TdlResult<Ok>

    /**
     * Check whether the current user can message another user or try to create a chat with them.
     *
     * @param userId Identifier of the other user.
     * @param onlyLocal Pass true to get only locally available information without sending network requests.
     */
    public abstract suspend fun canSendMessageToUser(userId: Long, onlyLocal: Boolean): TdlResult<CanSendMessageToUserResult>

    /**
     * Checks whether the current session can be used to transfer a chat ownership to another user.
     */
    public abstract suspend fun canTransferOwnership(): TdlResult<CanTransferOwnershipResult>

    /**
     * Stops the downloading of a file. If a file has already been downloaded, does nothing.
     *
     * @param fileId Identifier of a file to stop downloading.
     * @param onlyIfPending Pass true to stop downloading only if it hasn't been started, i.e. request hasn't been sent to server.
     */
    public abstract suspend fun cancelDownloadFile(fileId: Int, onlyIfPending: Boolean): TdlResult<Ok>

    /**
     * Cancels reset of 2-step verification password. The method can be called if passwordState.pendingResetDate &gt; 0.
     */
    public abstract suspend fun cancelPasswordReset(): TdlResult<Ok>

    /**
     * Stops the preliminary uploading of a file. Supported only for files uploaded by using preliminaryUploadFile.
     *
     * @param fileId Identifier of the file to stop uploading.
     */
    public abstract suspend fun cancelPreliminaryUploadFile(fileId: Int): TdlResult<Ok>

    /**
     * Cancels verification of the 2-step verification recovery email address.
     */
    public abstract suspend fun cancelRecoveryEmailAddressVerification(): TdlResult<PasswordState>

    /**
     * Changes imported contacts using the list of contacts saved on the device. Imports newly added contacts and, if at least the file database is enabled, deletes recently deleted contacts. Query result depends on the result of the previous query, so only one query is possible at the same time.
     *
     * @param contacts The new list of contacts, contact's vCard are ignored and are not imported.
     */
    public abstract suspend fun changeImportedContacts(contacts: Array<Contact>): TdlResult<ImportedContacts>

    /**
     * Installs/uninstalls or activates/archives a sticker set.
     *
     * @param setId Identifier of the sticker set.
     * @param isInstalled The new value of isInstalled.
     * @param isArchived The new value of isArchived. A sticker set can't be installed and archived simultaneously.
     */
    public abstract suspend fun changeStickerSet(
        setId: Long,
        isInstalled: Boolean,
        isArchived: Boolean,
    ): TdlResult<Ok>

    /**
     * Checks the authentication token of a bot; to log in as a bot. Works only when the current authorization state is authorizationStateWaitPhoneNumber. Can be used instead of setAuthenticationPhoneNumber and checkAuthenticationCode to log in.
     *
     * @param token The bot token.
     */
    public abstract suspend fun checkAuthenticationBotToken(token: String): TdlResult<Ok>

    /**
     * Checks the authentication code. Works only when the current authorization state is authorizationStateWaitCode.
     *
     * @param code Authentication code to check.
     */
    public abstract suspend fun checkAuthenticationCode(code: String): TdlResult<Ok>

    /**
     * Checks the authentication of an email address. Works only when the current authorization state is authorizationStateWaitEmailCode.
     *
     * @param code Email address authentication to check.
     */
    public abstract suspend fun checkAuthenticationEmailCode(code: EmailAddressAuthentication): TdlResult<Ok>

    /**
     * Checks the 2-step verification password for correctness. Works only when the current authorization state is authorizationStateWaitPassword.
     *
     * @param password The 2-step verification password to check.
     */
    public abstract suspend fun checkAuthenticationPassword(password: String): TdlResult<Ok>

    /**
     * Checks whether a 2-step verification password recovery code sent to an email address is valid. Works only when the current authorization state is authorizationStateWaitPassword.
     *
     * @param recoveryCode Recovery code to check.
     */
    public abstract suspend fun checkAuthenticationPasswordRecoveryCode(recoveryCode: String): TdlResult<Ok>

    /**
     * Checks whether an in-store purchase of Telegram Premium is possible before authorization. Works only when the current authorization state is authorizationStateWaitPremiumPurchase.
     *
     * @param currency ISO 4217 currency code of the payment currency.
     * @param amount Paid amount, in the smallest units of the currency.
     */
    public abstract suspend fun checkAuthenticationPremiumPurchase(currency: String, amount: Long): TdlResult<Ok>

    /**
     * Checks the validity of an invite link for a chat folder and returns information about the corresponding chat folder.
     *
     * @param inviteLink Invite link to be checked.
     */
    public abstract suspend fun checkChatFolderInviteLink(inviteLink: String): TdlResult<ChatFolderInviteLinkInfo>

    /**
     * Checks the validity of an invite link for a chat and returns information about the corresponding chat.
     *
     * @param inviteLink Invite link to be checked.
     */
    public abstract suspend fun checkChatInviteLink(inviteLink: String): TdlResult<ChatInviteLinkInfo>

    /**
     * Checks whether a username can be set for a chat.
     *
     * @param chatId Chat identifier; must be identifier of a supergroup chat, or a channel chat, or a private chat with self, or 0 if the chat is being created.
     * @param username Username to be checked.
     */
    public abstract suspend fun checkChatUsername(chatId: Long, username: String): TdlResult<CheckChatUsernameResult>

    /**
     * Checks whether the maximum number of owned public chats has been reached. Returns corresponding error if the limit was reached. The limit can be increased with Telegram Premium.
     *
     * @param type Type of the public chats, for which to check the limit.
     */
    public abstract suspend fun checkCreatedPublicChatsLimit(type: PublicChatType): TdlResult<Ok>

    /**
     * Checks the email address verification code for Telegram Passport.
     *
     * @param code Verification code to check.
     */
    public abstract suspend fun checkEmailAddressVerificationCode(code: String): TdlResult<Ok>

    /**
     * Checks the login email address authentication.
     *
     * @param code Email address authentication to check.
     */
    public abstract suspend fun checkLoginEmailAddressCode(code: EmailAddressAuthentication): TdlResult<Ok>

    /**
     * Checks whether a 2-step verification password recovery code sent to an email address is valid.
     *
     * @param recoveryCode Recovery code to check.
     */
    public abstract suspend fun checkPasswordRecoveryCode(recoveryCode: String): TdlResult<Ok>

    /**
     * Check the authentication code and completes the request for which the code was sent if appropriate.
     *
     * @param code Authentication code to check.
     */
    public abstract suspend fun checkPhoneNumberCode(code: String): TdlResult<Ok>

    /**
     * Return information about a Telegram Premium gift code.
     *
     * @param code The code to check.
     */
    public abstract suspend fun checkPremiumGiftCode(code: String): TdlResult<PremiumGiftCodeInfo>

    /**
     * Checks validness of a name for a quick reply shortcut. Can be called synchronously.
     *
     * @param name The name of the shortcut; 1-32 characters.
     */
    public abstract suspend fun checkQuickReplyShortcutName(name: String): TdlResult<Ok>

    /**
     * Checks the 2-step verification recovery email address verification code.
     *
     * @param code Verification code to check.
     */
    public abstract suspend fun checkRecoveryEmailAddressCode(code: String): TdlResult<PasswordState>

    /**
     * Checks whether a name can be used for a new sticker set.
     *
     * @param name Name to be checked.
     */
    public abstract suspend fun checkStickerSetName(name: String): TdlResult<CheckStickerSetNameResult>

    /**
     * Checks whether a file can be downloaded and saved locally by Web App request.
     *
     * @param botUserId Identifier of the bot, providing the Web App.
     * @param fileName Name of the file.
     * @param url URL of the file.
     */
    public abstract suspend fun checkWebAppFileDownload(
        botUserId: Long,
        fileName: String,
        url: String,
    ): TdlResult<Ok>

    /**
     * Removes potentially dangerous characters from the name of a file. Returns an empty string on failure. Can be called synchronously.
     *
     * @param fileName File name or path to the file.
     */
    public abstract suspend fun cleanFileName(fileName: String): TdlResult<Text>

    /**
     * Clears message drafts in all chats.
     *
     * @param excludeSecretChats Pass true to keep local message drafts in secret chats.
     */
    public abstract suspend fun clearAllDraftMessages(excludeSecretChats: Boolean): TdlResult<Ok>

    /**
     * Clears the list of all autosave settings exceptions. The method is guaranteed to work only after at least one call to getAutosaveSettings.
     */
    public abstract suspend fun clearAutosaveSettingsExceptions(): TdlResult<Ok>

    /**
     * Clears all imported contacts, contact list remains unchanged.
     */
    public abstract suspend fun clearImportedContacts(): TdlResult<Ok>

    /**
     * Clears the list of recently used emoji statuses for self status.
     */
    public abstract suspend fun clearRecentEmojiStatuses(): TdlResult<Ok>

    /**
     * Clears the list of recently used reactions.
     */
    public abstract suspend fun clearRecentReactions(): TdlResult<Ok>

    /**
     * Clears the list of recently used stickers.
     *
     * @param isAttached Pass true to clear the list of stickers recently attached to photo or video files; pass false to clear the list of recently sent stickers.
     */
    public abstract suspend fun clearRecentStickers(isAttached: Boolean): TdlResult<Ok>

    /**
     * Clears the list of recently found chats.
     */
    public abstract suspend fun clearRecentlyFoundChats(): TdlResult<Ok>

    /**
     * Clears the list of recently searched for hashtags or cashtags.
     *
     * @param clearCashtags Pass true to clear the list of recently searched for cashtags; otherwise, the list of recently searched for hashtags will be cleared.
     */
    public abstract suspend fun clearSearchedForTags(clearCashtags: Boolean): TdlResult<Ok>

    /**
     * Informs TDLib that a message with an animated emoji was clicked by the user. Returns a big animated sticker to be played or a 404 error if usual animation needs to be played.
     *
     * @param chatId Chat identifier of the message.
     * @param messageId Identifier of the clicked message.
     */
    public abstract suspend fun clickAnimatedEmojiMessage(chatId: Long, messageId: Long): TdlResult<Sticker>

    /**
     * Informs TDLib that the user opened the sponsored chat via the button, the name, the chat photo, a mention in the sponsored message text, or the media in the sponsored message.
     *
     * @param chatId Chat identifier of the sponsored message.
     * @param messageId Identifier of the sponsored message.
     * @param isMediaClick Pass true if the media was clicked in the sponsored message.
     * @param fromFullscreen Pass true if the user expanded the video from the sponsored message fullscreen before the click.
     */
    public abstract suspend fun clickChatSponsoredMessage(
        chatId: Long,
        messageId: Long,
        isMediaClick: Boolean,
        fromFullscreen: Boolean,
    ): TdlResult<Ok>

    /**
     * Informs TDLib that the user clicked Premium subscription button on the Premium features screen.
     */
    public abstract suspend fun clickPremiumSubscriptionButton(): TdlResult<Ok>

    /**
     * Closes the TDLib instance. All databases will be flushed to disk and properly closed. After the close completes, updateAuthorizationState with authorizationStateClosed will be sent. Can be called before initialization.
     */
    public abstract suspend fun close(): TdlResult<Ok>

    /**
     * Informs TDLib that the chat is closed by the user. Many useful activities depend on the chat being opened or closed.
     *
     * @param chatId Chat identifier.
     */
    public abstract suspend fun closeChat(chatId: Long): TdlResult<Ok>

    /**
     * Closes a secret chat, effectively transferring its state to secretChatStateClosed.
     *
     * @param secretChatId Secret chat identifier.
     */
    public abstract suspend fun closeSecretChat(secretChatId: Int): TdlResult<Ok>

    /**
     * Informs TDLib that a story is closed by the user.
     *
     * @param storyPosterChatId The identifier of the poster of the story to close.
     * @param storyId The identifier of the story.
     */
    public abstract suspend fun closeStory(storyPosterChatId: Long, storyId: Int): TdlResult<Ok>

    /**
     * Informs TDLib that a previously opened Web App was closed.
     *
     * @param webAppLaunchId Identifier of Web App launch, received from openWebApp.
     */
    public abstract suspend fun closeWebApp(webAppLaunchId: Long): TdlResult<Ok>

    /**
     * Applies all pending paid reactions on a message.
     *
     * @param chatId Identifier of the chat to which the message belongs.
     * @param messageId Identifier of the message.
     */
    public abstract suspend fun commitPendingPaidMessageReactions(chatId: Long, messageId: Long): TdlResult<Ok>

    /**
     * Confirms QR code authentication on another device. Returns created session on success.
     *
     * @param link A link from a QR code. The link must be scanned by the in-app camera.
     */
    public abstract suspend fun confirmQrCodeAuthentication(link: String): TdlResult<Session>

    /**
     * Confirms an unconfirmed session of the current user from another device.
     *
     * @param sessionId Session identifier.
     */
    public abstract suspend fun confirmSession(sessionId: Long): TdlResult<Ok>

    /**
     * Connects an affiliate program to the given affiliate. Returns information about the connected affiliate program.
     *
     * @param affiliate The affiliate to which the affiliate program will be connected.
     * @param botUserId Identifier of the bot, which affiliate program is connected.
     */
    public abstract suspend fun connectAffiliateProgram(affiliate: AffiliateType, botUserId: Long): TdlResult<ConnectedAffiliateProgram>

    /**
     * Returns an existing chat corresponding to a known basic group.
     *
     * @param basicGroupId Basic group identifier.
     * @param force Pass true to create the chat without a network request. In this case all information about the chat except its type, title and photo can be incorrect.
     */
    public abstract suspend fun createBasicGroupChat(basicGroupId: Long, force: Boolean): TdlResult<Chat>

    /**
     * Creates a business chat link for the current account. Requires Telegram Business subscription. There can be up to getOption(&quot;business_chat_link_count_max&quot;) links created. Returns the created link.
     *
     * @param linkInfo Information about the link to create.
     */
    public abstract suspend fun createBusinessChatLink(linkInfo: InputBusinessChatLink): TdlResult<BusinessChatLink>

    /**
     * Creates a new call.
     *
     * @param userId Identifier of the user to be called.
     * @param protocol The call protocols supported by the application.
     * @param isVideo Pass true to create a video call.
     */
    public abstract suspend fun createCall(
        userId: Long,
        protocol: CallProtocol,
        isVideo: Boolean,
    ): TdlResult<CallId>

    /**
     * Creates new chat folder. Returns information about the created chat folder. There can be up to getOption(&quot;chat_folder_count_max&quot;) chat folders, but the limit can be increased with Telegram Premium.
     *
     * @param folder The new chat folder.
     */
    public abstract suspend fun createChatFolder(folder: ChatFolder): TdlResult<ChatFolderInfo>

    /**
     * Creates a new invite link for a chat folder. A link can be created for a chat folder if it has only pinned and included chats.
     *
     * @param chatFolderId Chat folder identifier.
     * @param name Name of the link; 0-32 characters.
     * @param chatIds Identifiers of chats to be accessible by the invite link. Use getChatsForChatFolderInviteLink to get suitable chats. Basic groups will be automatically converted to supergroups before link creation.
     */
    public abstract suspend fun createChatFolderInviteLink(
        chatFolderId: Int,
        name: String,
        chatIds: LongArray,
    ): TdlResult<ChatFolderInviteLink>

    /**
     * Creates a new invite link for a chat. Available for basic groups, supergroups, and channels. Requires administrator privileges and canInviteUsers right in the chat.
     *
     * @param chatId Chat identifier.
     * @param name Invite link name; 0-32 characters.
     * @param expirationDate Point in time (Unix timestamp) when the link will expire; pass 0 if never.
     * @param memberLimit The maximum number of chat members that can join the chat via the link simultaneously; 0-99999; pass 0 if not limited.
     * @param createsJoinRequest Pass true if users joining the chat via the link need to be approved by chat administrators. In this case, memberLimit must be 0.
     */
    public abstract suspend fun createChatInviteLink(
        chatId: Long,
        name: String,
        expirationDate: Int,
        memberLimit: Int,
        createsJoinRequest: Boolean,
    ): TdlResult<ChatInviteLink>

    /**
     * Creates a new subscription invite link for a channel chat. Requires canInviteUsers right in the chat.
     *
     * @param chatId Chat identifier.
     * @param name Invite link name; 0-32 characters.
     * @param subscriptionPricing Information about subscription plan that will be applied to the users joining the chat via the link. Subscription period must be 2592000 in production environment, and 60 or 300 if Telegram test environment is used.
     */
    public abstract suspend fun createChatSubscriptionInviteLink(
        chatId: Long,
        name: String,
        subscriptionPricing: StarSubscriptionPricing,
    ): TdlResult<ChatInviteLink>

    /**
     * Creates a topic in a forum supergroup chat; requires canManageTopics administrator or canCreateTopics member right in the supergroup.
     *
     * @param chatId Identifier of the chat.
     * @param name Name of the topic; 1-128 characters.
     * @param icon Icon of the topic. Icon color must be one of 0x6FB9F0, 0xFFD67E, 0xCB86DB, 0x8EEE98, 0xFF93B2, or 0xFB6F5F. Telegram Premium users can use any custom emoji as topic icon, other users can use only a custom emoji returned by getForumTopicDefaultIcons.
     */
    public abstract suspend fun createForumTopic(
        chatId: Long,
        name: String,
        icon: ForumTopicIcon,
    ): TdlResult<ForumTopicInfo>

    /**
     * Creates a new group call that isn't bound to a chat.
     *
     * @param joinParameters Parameters to join the call; pass null to only create call link without joining the call.
     */
    public abstract suspend fun createGroupCall(joinParameters: GroupCallJoinParameters? = null): TdlResult<GroupCallInfo>

    /**
     * Creates a link for the given invoice; for bots only.
     *
     * @param businessConnectionId Unique identifier of business connection on behalf of which to send the request.
     * @param invoice Information about the invoice of the type inputMessageInvoice.
     */
    public abstract suspend fun createInvoiceLink(businessConnectionId: String, invoice: InputMessageContent): TdlResult<HttpUrl>

    /**
     * Creates a new basic group and sends a corresponding messageBasicGroupChatCreate. Returns information about the newly created chat.
     *
     * @param userIds Identifiers of users to be added to the basic group; may be empty to create a basic group without other members.
     * @param title Title of the new basic group; 1-128 characters.
     * @param messageAutoDeleteTime Message auto-delete time value, in seconds; must be from 0 up to 365 * 86400 and be divisible by 86400. If 0, then messages aren't deleted automatically.
     */
    public abstract suspend fun createNewBasicGroupChat(
        userIds: LongArray,
        title: String,
        messageAutoDeleteTime: Int,
    ): TdlResult<CreatedBasicGroupChat>

    /**
     * Creates a new secret chat. Returns the newly created chat.
     *
     * @param userId Identifier of the target user.
     */
    public abstract suspend fun createNewSecretChat(userId: Long): TdlResult<Chat>

    /**
     * Creates a new sticker set. Returns the newly created sticker set.
     *
     * @param userId Sticker set owner; ignored for regular users.
     * @param title Sticker set title; 1-64 characters.
     * @param name Sticker set name. Can contain only English letters, digits and underscores. Must end with *&quot;_by_&lt;bot username&gt;&quot;* (*&lt;botUsername&gt;* is case insensitive) for bots; 0-64 characters. If empty, then the name returned by getSuggestedStickerSetName will be used automatically.
     * @param stickerType Type of the stickers in the set.
     * @param needsRepainting Pass true if stickers in the sticker set must be repainted; for custom emoji sticker sets only.
     * @param stickers List of stickers to be added to the set; 1-200 stickers for custom emoji sticker sets, and 1-120 stickers otherwise. For TGS stickers, uploadStickerFile must be used before the sticker is shown.
     * @param source Source of the sticker set; may be empty if unknown.
     */
    public abstract suspend fun createNewStickerSet(
        userId: Long,
        title: String,
        name: String,
        stickerType: StickerType,
        needsRepainting: Boolean,
        stickers: Array<InputSticker>,
        source: String,
    ): TdlResult<StickerSet>

    /**
     * Creates a new supergroup or channel and sends a corresponding messageSupergroupChatCreate. Returns the newly created chat.
     *
     * @param title Title of the new chat; 1-128 characters.
     * @param isForum Pass true to create a forum supergroup chat.
     * @param isChannel Pass true to create a channel chat; ignored if a forum is created.
     * @param description Chat description; 0-255 characters.
     * @param location Chat location if a location-based supergroup is being created; pass null to create an ordinary supergroup chat.
     * @param messageAutoDeleteTime Message auto-delete time value, in seconds; must be from 0 up to 365 * 86400 and be divisible by 86400. If 0, then messages aren't deleted automatically.
     * @param forImport Pass true to create a supergroup for importing messages using importMessages.
     */
    public abstract suspend fun createNewSupergroupChat(
        title: String,
        isForum: Boolean,
        isChannel: Boolean,
        description: String,
        location: ChatLocation? = null,
        messageAutoDeleteTime: Int,
        forImport: Boolean,
    ): TdlResult<Chat>

    /**
     * Returns an existing chat corresponding to a given user.
     *
     * @param userId User identifier.
     * @param force Pass true to create the chat without a network request. In this case all information about the chat except its type, title and photo can be incorrect.
     */
    public abstract suspend fun createPrivateChat(userId: Long, force: Boolean): TdlResult<Chat>

    /**
     * Returns an existing chat corresponding to a known secret chat.
     *
     * @param secretChatId Secret chat identifier.
     */
    public abstract suspend fun createSecretChat(secretChatId: Int): TdlResult<Chat>

    /**
     * Returns an existing chat corresponding to a known supergroup or channel.
     *
     * @param supergroupId Supergroup or channel identifier.
     * @param force Pass true to create the chat without a network request. In this case all information about the chat except its type, title and photo can be incorrect.
     */
    public abstract suspend fun createSupergroupChat(supergroupId: Long, force: Boolean): TdlResult<Chat>

    /**
     * Creates a new temporary password for processing payments.
     *
     * @param password The 2-step verification password of the current user.
     * @param validFor Time during which the temporary password will be valid, in seconds; must be between 60 and 86400.
     */
    public abstract suspend fun createTemporaryPassword(password: String, validFor: Int): TdlResult<TemporaryPasswordState>

    /**
     * Creates a video chat (a group call bound to a chat). Available only for basic groups, supergroups and channels; requires canManageVideoChats administrator right.
     *
     * @param chatId Identifier of a chat in which the video chat will be created.
     * @param title Group call title; if empty, chat title will be used.
     * @param startDate Point in time (Unix timestamp) when the group call is expected to be started by an administrator; 0 to start the video chat immediately. The date must be at least 10 seconds and at most 8 days in the future.
     * @param isRtmpStream Pass true to create an RTMP stream instead of an ordinary video chat.
     */
    public abstract suspend fun createVideoChat(
        chatId: Long,
        title: String,
        startDate: Int,
        isRtmpStream: Boolean,
    ): TdlResult<GroupCallId>

    /**
     * Declines an invitation to an active group call via messageGroupCall. Can be called both by the sender and the receiver of the invitation.
     *
     * @param chatId Identifier of the chat with the message.
     * @param messageId Identifier of the message of the type messageGroupCall.
     */
    public abstract suspend fun declineGroupCallInvitation(chatId: Long, messageId: Long): TdlResult<Ok>

    /**
     * Decrypts group call data received by tgcalls.
     *
     * @param groupCallId Group call identifier. The call must not be a video chat.
     * @param participantId Identifier of the group call participant, which sent the data.
     * @param dataChannel Data channel for which data was encrypted; pass null if unknown.
     * @param data Data to decrypt.
     */
    public abstract suspend fun decryptGroupCallData(
        groupCallId: Int,
        participantId: MessageSender,
        dataChannel: GroupCallDataChannel? = null,
        data: ByteArray,
    ): TdlResult<Data>

    /**
     * Deletes the account of the current user, deleting all information associated with the user from the server. The phone number of the account can be used to create a new account. Can be called before authorization when the current authorization state is authorizationStateWaitPassword.
     *
     * @param reason The reason why the account was deleted; optional.
     * @param password The 2-step verification password of the current user. If the current user isn't authorized, then an empty string can be passed and account deletion can be canceled within one week.
     */
    public abstract suspend fun deleteAccount(reason: String, password: String): TdlResult<Ok>

    /**
     * Deletes all call messages.
     *
     * @param revoke Pass true to delete the messages for all users.
     */
    public abstract suspend fun deleteAllCallMessages(revoke: Boolean): TdlResult<Ok>

    /**
     * Deletes all revoked chat invite links created by a given chat administrator. Requires administrator privileges and canInviteUsers right in the chat for own links and owner privileges for other links.
     *
     * @param chatId Chat identifier.
     * @param creatorUserId User identifier of a chat administrator, which links will be deleted. Must be an identifier of the current user for non-owner.
     */
    public abstract suspend fun deleteAllRevokedChatInviteLinks(chatId: Long, creatorUserId: Long): TdlResult<Ok>

    /**
     * Delete media previews from the list of media previews of a bot.
     *
     * @param botUserId Identifier of the target bot. The bot must be owned and must have the main Web App.
     * @param languageCode Language code of the media previews to delete.
     * @param fileIds File identifiers of the media to delete.
     */
    public abstract suspend fun deleteBotMediaPreviews(
        botUserId: Long,
        languageCode: String,
        fileIds: IntArray,
    ): TdlResult<Ok>

    /**
     * Deletes a business chat link of the current account.
     *
     * @param link The link to delete.
     */
    public abstract suspend fun deleteBusinessChatLink(link: String): TdlResult<Ok>

    /**
     * Deletes the business bot that is connected to the current user account.
     *
     * @param botUserId Unique user identifier for the bot.
     */
    public abstract suspend fun deleteBusinessConnectedBot(botUserId: Long): TdlResult<Ok>

    /**
     * Deletes messages on behalf of a business account; for bots only.
     *
     * @param businessConnectionId Unique identifier of business connection through which the messages were received.
     * @param messageIds Identifier of the messages.
     */
    public abstract suspend fun deleteBusinessMessages(businessConnectionId: String, messageIds: LongArray): TdlResult<Ok>

    /**
     * Deletes a story posted by the bot on behalf of a business account; for bots only.
     *
     * @param businessConnectionId Unique identifier of business connection.
     * @param storyId Identifier of the story to delete.
     */
    public abstract suspend fun deleteBusinessStory(businessConnectionId: String, storyId: Int): TdlResult<Ok>

    /**
     * Deletes a chat along with all messages in the corresponding chat for all chat members. For group chats this will release the usernames and remove all members. Use the field chat.canBeDeletedForAllUsers to find whether the method can be applied to the chat.
     *
     * @param chatId Chat identifier.
     */
    public abstract suspend fun deleteChat(chatId: Long): TdlResult<Ok>

    /**
     * Deletes background in a specific chat.
     *
     * @param chatId Chat identifier.
     * @param restorePrevious Pass true to restore previously set background. Can be used only in private and secret chats with non-deleted users if userFullInfo.setChatBackground == true. Supposed to be used from messageChatSetBackground messages with the currently set background that was set for both sides by the other user.
     */
    public abstract suspend fun deleteChatBackground(chatId: Long, restorePrevious: Boolean): TdlResult<Ok>

    /**
     * Deletes existing chat folder.
     *
     * @param chatFolderId Chat folder identifier.
     * @param leaveChatIds Identifiers of the chats to leave. The chats must be pinned or always included in the folder.
     */
    public abstract suspend fun deleteChatFolder(chatFolderId: Int, leaveChatIds: LongArray): TdlResult<Ok>

    /**
     * Deletes an invite link for a chat folder.
     *
     * @param chatFolderId Chat folder identifier.
     * @param inviteLink Invite link to be deleted.
     */
    public abstract suspend fun deleteChatFolderInviteLink(chatFolderId: Int, inviteLink: String): TdlResult<Ok>

    /**
     * Deletes all messages in the chat. Use chat.canBeDeletedOnlyForSelf and chat.canBeDeletedForAllUsers fields to find whether and how the method can be applied to the chat.
     *
     * @param chatId Chat identifier.
     * @param removeFromChatList Pass true to remove the chat from all chat lists.
     * @param revoke Pass true to delete chat history for all users.
     */
    public abstract suspend fun deleteChatHistory(
        chatId: Long,
        removeFromChatList: Boolean,
        revoke: Boolean,
    ): TdlResult<Ok>

    /**
     * Deletes all messages between the specified dates in a chat. Supported only for private chats and basic groups. Messages sent in the last 30 seconds will not be deleted.
     *
     * @param chatId Chat identifier.
     * @param minDate The minimum date of the messages to delete.
     * @param maxDate The maximum date of the messages to delete.
     * @param revoke Pass true to delete chat messages for all users; private chats only.
     */
    public abstract suspend fun deleteChatMessagesByDate(
        chatId: Long,
        minDate: Int,
        maxDate: Int,
        revoke: Boolean,
    ): TdlResult<Ok>

    /**
     * Deletes all messages sent by the specified message sender in a chat. Supported only for supergroups; requires canDeleteMessages administrator right.
     *
     * @param chatId Chat identifier.
     * @param senderId Identifier of the sender of messages to delete.
     */
    public abstract suspend fun deleteChatMessagesBySender(chatId: Long, senderId: MessageSender): TdlResult<Ok>

    /**
     * Deletes the default reply markup from a chat. Must be called after a one-time keyboard or a replyMarkupForceReply reply markup has been used. An updateChatReplyMarkup update will be sent if the reply markup is changed.
     *
     * @param chatId Chat identifier.
     * @param messageId The message identifier of the used keyboard.
     */
    public abstract suspend fun deleteChatReplyMarkup(chatId: Long, messageId: Long): TdlResult<Ok>

    /**
     * Deletes commands supported by the bot for the given user scope and language; for bots only.
     *
     * @param scope The scope to which the commands are relevant; pass null to delete commands in the default bot command scope.
     * @param languageCode A two-letter ISO 639-1 language code or an empty string.
     */
    public abstract suspend fun deleteCommands(scope: BotCommandScope? = null, languageCode: String): TdlResult<Ok>

    /**
     * Deletes default background for chats.
     *
     * @param forDarkTheme Pass true if the background is deleted for a dark theme.
     */
    public abstract suspend fun deleteDefaultBackground(forDarkTheme: Boolean): TdlResult<Ok>

    /**
     * Deletes all messages in the topic in a channel direct messages chat administered by the current user.
     *
     * @param chatId Chat identifier of the channel direct messages chat.
     * @param topicId Identifier of the topic which messages will be deleted.
     */
    public abstract suspend fun deleteDirectMessagesChatTopicHistory(chatId: Long, topicId: Long): TdlResult<Ok>

    /**
     * Deletes all messages between the specified dates in the topic in a channel direct messages chat administered by the current user. Messages sent in the last 30 seconds will not be deleted.
     *
     * @param chatId Chat identifier of the channel direct messages chat.
     * @param topicId Identifier of the topic which messages will be deleted.
     * @param minDate The minimum date of the messages to delete.
     * @param maxDate The maximum date of the messages to delete.
     */
    public abstract suspend fun deleteDirectMessagesChatTopicMessagesByDate(
        chatId: Long,
        topicId: Long,
        minDate: Int,
        maxDate: Int,
    ): TdlResult<Ok>

    /**
     * Deletes a file from the TDLib file cache.
     *
     * @param fileId Identifier of the file to delete.
     */
    public abstract suspend fun deleteFile(fileId: Int): TdlResult<Ok>

    /**
     * Deletes all messages in a forum topic; requires canDeleteMessages administrator right in the supergroup unless the user is creator of the topic, the topic has no messages from other users and has at most 11 messages.
     *
     * @param chatId Identifier of the chat.
     * @param messageThreadId Message thread identifier of the forum topic.
     */
    public abstract suspend fun deleteForumTopic(chatId: Long, messageThreadId: Long): TdlResult<Ok>

    /**
     * Deletes all information about a language pack in the current localization target. The language pack which is currently in use (including base language pack) or is being synchronized can't be deleted. Can be called before authorization.
     *
     * @param languagePackId Identifier of the language pack to delete.
     */
    public abstract suspend fun deleteLanguagePack(languagePackId: String): TdlResult<Ok>

    /**
     * Deletes messages.
     *
     * @param chatId Chat identifier.
     * @param messageIds Identifiers of the messages to be deleted. Use messageProperties.canBeDeletedOnlyForSelf and messageProperties.canBeDeletedForAllUsers to get suitable messages.
     * @param revoke Pass true to delete messages for all chat members. Always true for supergroups, channels and secret chats.
     */
    public abstract suspend fun deleteMessages(
        chatId: Long,
        messageIds: LongArray,
        revoke: Boolean,
    ): TdlResult<Ok>

    /**
     * Deletes a Telegram Passport element.
     *
     * @param type Element type.
     */
    public abstract suspend fun deletePassportElement(type: PassportElementType): TdlResult<Ok>

    /**
     * Deletes a profile photo.
     *
     * @param profilePhotoId Identifier of the profile photo to delete.
     */
    public abstract suspend fun deleteProfilePhoto(profilePhotoId: Long): TdlResult<Ok>

    /**
     * Deletes a quick reply shortcut.
     *
     * @param shortcutId Unique identifier of the quick reply shortcut.
     */
    public abstract suspend fun deleteQuickReplyShortcut(shortcutId: Int): TdlResult<Ok>

    /**
     * Deletes specified quick reply messages.
     *
     * @param shortcutId Unique identifier of the quick reply shortcut to which the messages belong.
     * @param messageIds Unique identifiers of the messages.
     */
    public abstract suspend fun deleteQuickReplyShortcutMessages(shortcutId: Int, messageIds: LongArray): TdlResult<Ok>

    /**
     * Deletes revoked chat invite links. Requires administrator privileges and canInviteUsers right in the chat for own links and owner privileges for other links.
     *
     * @param chatId Chat identifier.
     * @param inviteLink Invite link to revoke.
     */
    public abstract suspend fun deleteRevokedChatInviteLink(chatId: Long, inviteLink: String): TdlResult<Ok>

    /**
     * Deletes saved credentials for all payment provider bots.
     */
    public abstract suspend fun deleteSavedCredentials(): TdlResult<Ok>

    /**
     * Deletes all messages in a Saved Messages topic.
     *
     * @param savedMessagesTopicId Identifier of Saved Messages topic which messages will be deleted.
     */
    public abstract suspend fun deleteSavedMessagesTopicHistory(savedMessagesTopicId: Long): TdlResult<Ok>

    /**
     * Deletes all messages between the specified dates in a Saved Messages topic. Messages sent in the last 30 seconds will not be deleted.
     *
     * @param savedMessagesTopicId Identifier of Saved Messages topic which messages will be deleted.
     * @param minDate The minimum date of the messages to delete.
     * @param maxDate The maximum date of the messages to delete.
     */
    public abstract suspend fun deleteSavedMessagesTopicMessagesByDate(
        savedMessagesTopicId: Long,
        minDate: Int,
        maxDate: Int,
    ): TdlResult<Ok>

    /**
     * Deletes saved order information.
     */
    public abstract suspend fun deleteSavedOrderInfo(): TdlResult<Ok>

    /**
     * Completely deletes a sticker set.
     *
     * @param name Sticker set name. The sticker set must be owned by the current user.
     */
    public abstract suspend fun deleteStickerSet(name: String): TdlResult<Ok>

    /**
     * Deletes a previously posted story. Can be called only if story.canBeDeleted == true.
     *
     * @param storyPosterChatId Identifier of the chat that posted the story.
     * @param storyId Identifier of the story to delete.
     */
    public abstract suspend fun deleteStory(storyPosterChatId: Long, storyId: Int): TdlResult<Ok>

    /**
     * Closes the TDLib instance, destroying all local data without a proper logout. The current user session will remain in the list of all active sessions. All local data will be destroyed. After the destruction completes updateAuthorizationState with authorizationStateClosed will be sent. Can be called before authorization.
     */
    public abstract suspend fun destroy(): TdlResult<Ok>

    /**
     * Disables all active non-editable usernames of a supergroup or channel, requires owner privileges in the supergroup or channel.
     *
     * @param supergroupId Identifier of the supergroup or channel.
     */
    public abstract suspend fun disableAllSupergroupUsernames(supergroupId: Long): TdlResult<Ok>

    /**
     * Disables the currently enabled proxy. Can be called before authorization.
     */
    public abstract suspend fun disableProxy(): TdlResult<Ok>

    /**
     * Discards a call.
     *
     * @param callId Call identifier.
     * @param isDisconnected Pass true if the user was disconnected.
     * @param inviteLink If the call was upgraded to a group call, pass invite link to the group call.
     * @param duration The call duration, in seconds.
     * @param isVideo Pass true if the call was a video call.
     * @param connectionId Identifier of the connection used during the call.
     */
    public abstract suspend fun discardCall(
        callId: Int,
        isDisconnected: Boolean,
        inviteLink: String,
        duration: Int,
        isVideo: Boolean,
        connectionId: Long,
    ): TdlResult<Ok>

    /**
     * Disconnects an affiliate program from the given affiliate and immediately deactivates its referral link. Returns updated information about the disconnected affiliate program.
     *
     * @param affiliate The affiliate to which the affiliate program is connected.
     * @param url The referral link of the affiliate program.
     */
    public abstract suspend fun disconnectAffiliateProgram(affiliate: AffiliateType, url: String): TdlResult<ConnectedAffiliateProgram>

    /**
     * Disconnects all websites from the current user's Telegram account.
     */
    public abstract suspend fun disconnectAllWebsites(): TdlResult<Ok>

    /**
     * Disconnects website from the current user's Telegram account.
     *
     * @param websiteId Website identifier.
     */
    public abstract suspend fun disconnectWebsite(websiteId: Long): TdlResult<Ok>

    /**
     * Downloads a file from the cloud. Download progress and completion of the download will be notified through updateFile updates.
     *
     * @param fileId Identifier of the file to download.
     * @param priority Priority of the download (1-32). The higher the priority, the earlier the file will be downloaded. If the priorities of two files are equal, then the last one for which downloadFile/addFileToDownloads was called will be downloaded first.
     * @param offset The starting position from which the file needs to be downloaded.
     * @param limit Number of bytes which need to be downloaded starting from the &quot;offset&quot; position before the download will automatically be canceled; use 0 to download without a limit.
     * @param synchronous Pass true to return response only after the file download has succeeded, has failed, has been canceled, or a new downloadFile request with different offset/limit parameters was sent; pass false to return file state immediately, just after the download has been started.
     */
    public abstract suspend fun downloadFile(
        fileId: Int,
        priority: Int,
        offset: Long,
        limit: Long,
        synchronous: Boolean,
    ): TdlResult<File>

    /**
     * Replaces media preview in the list of media previews of a bot. Returns the new preview after edit is completed server-side.
     *
     * @param botUserId Identifier of the target bot. The bot must be owned and must have the main Web App.
     * @param languageCode Language code of the media preview to edit.
     * @param fileId File identifier of the media to replace.
     * @param content Content of the new preview.
     */
    public abstract suspend fun editBotMediaPreview(
        botUserId: Long,
        languageCode: String,
        fileId: Int,
        content: InputStoryContent,
    ): TdlResult<BotMediaPreview>

    /**
     * Edits a business chat link of the current account. Requires Telegram Business subscription. Returns the edited link.
     *
     * @param link The link to edit.
     * @param linkInfo New description of the link.
     */
    public abstract suspend fun editBusinessChatLink(link: String, linkInfo: InputBusinessChatLink): TdlResult<BusinessChatLink>

    /**
     * Edits the caption of a message sent on behalf of a business account; for bots only.
     *
     * @param businessConnectionId Unique identifier of business connection on behalf of which the message was sent.
     * @param chatId The chat the message belongs to.
     * @param messageId Identifier of the message.
     * @param replyMarkup The new message reply markup; pass null if none.
     * @param caption New message content caption; pass null to remove caption; 0-getOption(&quot;message_caption_length_max&quot;) characters.
     * @param showCaptionAboveMedia Pass true to show the caption above the media; otherwise, the caption will be shown below the media. May be true only for animation, photo, and video messages.
     */
    public abstract suspend fun editBusinessMessageCaption(
        businessConnectionId: String,
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup? = null,
        caption: FormattedText? = null,
        showCaptionAboveMedia: Boolean,
    ): TdlResult<BusinessMessage>

    /**
     * Edits the content of a live location in a message sent on behalf of a business account; for bots only.
     *
     * @param businessConnectionId Unique identifier of business connection on behalf of which the message was sent.
     * @param chatId The chat the message belongs to.
     * @param messageId Identifier of the message.
     * @param replyMarkup The new message reply markup; pass null if none.
     * @param location New location content of the message; pass null to stop sharing the live location.
     * @param livePeriod New time relative to the message send date, for which the location can be updated, in seconds. If 0x7FFFFFFF specified, then the location can be updated forever. Otherwise, must not exceed the current livePeriod by more than a day, and the live location expiration date must remain in the next 90 days. Pass 0 to keep the current livePeriod.
     * @param heading The new direction in which the location moves, in degrees; 1-360. Pass 0 if unknown.
     * @param proximityAlertRadius The new maximum distance for proximity alerts, in meters (0-100000). Pass 0 if the notification is disabled.
     */
    public abstract suspend fun editBusinessMessageLiveLocation(
        businessConnectionId: String,
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup? = null,
        location: Location? = null,
        livePeriod: Int,
        heading: Int,
        proximityAlertRadius: Int,
    ): TdlResult<BusinessMessage>

    /**
     * Edits the media content of a message with a text, an animation, an audio, a document, a photo or a video in a message sent on behalf of a business account; for bots only.
     *
     * @param businessConnectionId Unique identifier of business connection on behalf of which the message was sent.
     * @param chatId The chat the message belongs to.
     * @param messageId Identifier of the message.
     * @param replyMarkup The new message reply markup; pass null if none; for bots only.
     * @param inputMessageContent New content of the message. Must be one of the following types: inputMessageAnimation, inputMessageAudio, inputMessageDocument, inputMessagePhoto or inputMessageVideo.
     */
    public abstract suspend fun editBusinessMessageMedia(
        businessConnectionId: String,
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup? = null,
        inputMessageContent: InputMessageContent,
    ): TdlResult<BusinessMessage>

    /**
     * Edits the reply markup of a message sent on behalf of a business account; for bots only.
     *
     * @param businessConnectionId Unique identifier of business connection on behalf of which the message was sent.
     * @param chatId The chat the message belongs to.
     * @param messageId Identifier of the message.
     * @param replyMarkup The new message reply markup; pass null if none.
     */
    public abstract suspend fun editBusinessMessageReplyMarkup(
        businessConnectionId: String,
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup? = null,
    ): TdlResult<BusinessMessage>

    /**
     * Edits the text of a text or game message sent on behalf of a business account; for bots only.
     *
     * @param businessConnectionId Unique identifier of business connection on behalf of which the message was sent.
     * @param chatId The chat the message belongs to.
     * @param messageId Identifier of the message.
     * @param replyMarkup The new message reply markup; pass null if none.
     * @param inputMessageContent New text content of the message. Must be of type inputMessageText.
     */
    public abstract suspend fun editBusinessMessageText(
        businessConnectionId: String,
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup? = null,
        inputMessageContent: InputMessageContent,
    ): TdlResult<BusinessMessage>

    /**
     * Changes a story posted by the bot on behalf of a business account; for bots only.
     *
     * @param storyPosterChatId Identifier of the chat that posted the story.
     * @param storyId Identifier of the story to edit.
     * @param content New content of the story.
     * @param areas New clickable rectangle areas to be shown on the story media.
     * @param caption New story caption.
     * @param privacySettings The new privacy settings for the story.
     */
    public abstract suspend fun editBusinessStory(
        storyPosterChatId: Long,
        storyId: Int,
        content: InputStoryContent,
        areas: InputStoryAreas,
        caption: FormattedText,
        privacySettings: StoryPrivacySettings,
    ): TdlResult<Story>

    /**
     * Edits existing chat folder. Returns information about the edited chat folder.
     *
     * @param chatFolderId Chat folder identifier.
     * @param folder The edited chat folder.
     */
    public abstract suspend fun editChatFolder(chatFolderId: Int, folder: ChatFolder): TdlResult<ChatFolderInfo>

    /**
     * Edits an invite link for a chat folder.
     *
     * @param chatFolderId Chat folder identifier.
     * @param inviteLink Invite link to be edited.
     * @param name New name of the link; 0-32 characters.
     * @param chatIds New identifiers of chats to be accessible by the invite link. Use getChatsForChatFolderInviteLink to get suitable chats. Basic groups will be automatically converted to supergroups before link editing.
     */
    public abstract suspend fun editChatFolderInviteLink(
        chatFolderId: Int,
        inviteLink: String,
        name: String,
        chatIds: LongArray,
    ): TdlResult<ChatFolderInviteLink>

    /**
     * Edits a non-primary invite link for a chat. Available for basic groups, supergroups, and channels. If the link creates a subscription, then expirationDate, memberLimit and createsJoinRequest must not be used. Requires administrator privileges and canInviteUsers right in the chat for own links and owner privileges for other links.
     *
     * @param chatId Chat identifier.
     * @param inviteLink Invite link to be edited.
     * @param name Invite link name; 0-32 characters.
     * @param expirationDate Point in time (Unix timestamp) when the link will expire; pass 0 if never.
     * @param memberLimit The maximum number of chat members that can join the chat via the link simultaneously; 0-99999; pass 0 if not limited.
     * @param createsJoinRequest Pass true if users joining the chat via the link need to be approved by chat administrators. In this case, memberLimit must be 0.
     */
    public abstract suspend fun editChatInviteLink(
        chatId: Long,
        inviteLink: String,
        name: String,
        expirationDate: Int,
        memberLimit: Int,
        createsJoinRequest: Boolean,
    ): TdlResult<ChatInviteLink>

    /**
     * Edits a subscription invite link for a channel chat. Requires canInviteUsers right in the chat for own links and owner privileges for other links.
     *
     * @param chatId Chat identifier.
     * @param inviteLink Invite link to be edited.
     * @param name Invite link name; 0-32 characters.
     */
    public abstract suspend fun editChatSubscriptionInviteLink(
        chatId: Long,
        inviteLink: String,
        name: String,
    ): TdlResult<ChatInviteLink>

    /**
     * Edits information about a custom local language pack in the current localization target. Can be called before authorization.
     *
     * @param info New information about the custom local language pack.
     */
    public abstract suspend fun editCustomLanguagePackInfo(info: LanguagePackInfo): TdlResult<Ok>

    /**
     * Edits title and icon of a topic in a forum supergroup chat; requires canManageTopics right in the supergroup unless the user is creator of the topic.
     *
     * @param chatId Identifier of the chat.
     * @param messageThreadId Message thread identifier of the forum topic.
     * @param name New name of the topic; 0-128 characters. If empty, the previous topic name is kept.
     * @param editIconCustomEmoji Pass true to edit the icon of the topic. Icon of the General topic can't be edited.
     * @param iconCustomEmojiId Identifier of the new custom emoji for topic icon; pass 0 to remove the custom emoji. Ignored if editIconCustomEmoji is false. Telegram Premium users can use any custom emoji, other users can use only a custom emoji returned by getForumTopicDefaultIcons.
     */
    public abstract suspend fun editForumTopic(
        chatId: Long,
        messageThreadId: Long,
        name: String,
        editIconCustomEmoji: Boolean,
        iconCustomEmojiId: Long,
    ): TdlResult<Ok>

    /**
     * Edits the caption of an inline message sent via a bot; for bots only.
     *
     * @param inlineMessageId Inline message identifier.
     * @param replyMarkup The new message reply markup; pass null if none.
     * @param caption New message content caption; pass null to remove caption; 0-getOption(&quot;message_caption_length_max&quot;) characters.
     * @param showCaptionAboveMedia Pass true to show the caption above the media; otherwise, the caption will be shown below the media. May be true only for animation, photo, and video messages.
     */
    public abstract suspend fun editInlineMessageCaption(
        inlineMessageId: String,
        replyMarkup: ReplyMarkup? = null,
        caption: FormattedText? = null,
        showCaptionAboveMedia: Boolean,
    ): TdlResult<Ok>

    /**
     * Edits the content of a live location in an inline message sent via a bot; for bots only.
     *
     * @param inlineMessageId Inline message identifier.
     * @param replyMarkup The new message reply markup; pass null if none.
     * @param location New location content of the message; pass null to stop sharing the live location.
     * @param livePeriod New time relative to the message send date, for which the location can be updated, in seconds. If 0x7FFFFFFF specified, then the location can be updated forever. Otherwise, must not exceed the current livePeriod by more than a day, and the live location expiration date must remain in the next 90 days. Pass 0 to keep the current livePeriod.
     * @param heading The new direction in which the location moves, in degrees; 1-360. Pass 0 if unknown.
     * @param proximityAlertRadius The new maximum distance for proximity alerts, in meters (0-100000). Pass 0 if the notification is disabled.
     */
    public abstract suspend fun editInlineMessageLiveLocation(
        inlineMessageId: String,
        replyMarkup: ReplyMarkup? = null,
        location: Location? = null,
        livePeriod: Int,
        heading: Int,
        proximityAlertRadius: Int,
    ): TdlResult<Ok>

    /**
     * Edits the media content of a message with a text, an animation, an audio, a document, a photo or a video in an inline message sent via a bot; for bots only.
     *
     * @param inlineMessageId Inline message identifier.
     * @param replyMarkup The new message reply markup; pass null if none; for bots only.
     * @param inputMessageContent New content of the message. Must be one of the following types: inputMessageAnimation, inputMessageAudio, inputMessageDocument, inputMessagePhoto or inputMessageVideo.
     */
    public abstract suspend fun editInlineMessageMedia(
        inlineMessageId: String,
        replyMarkup: ReplyMarkup? = null,
        inputMessageContent: InputMessageContent,
    ): TdlResult<Ok>

    /**
     * Edits the reply markup of an inline message sent via a bot; for bots only.
     *
     * @param inlineMessageId Inline message identifier.
     * @param replyMarkup The new message reply markup; pass null if none.
     */
    public abstract suspend fun editInlineMessageReplyMarkup(inlineMessageId: String, replyMarkup: ReplyMarkup? = null): TdlResult<Ok>

    /**
     * Edits the text of an inline text or game message sent via a bot; for bots only.
     *
     * @param inlineMessageId Inline message identifier.
     * @param replyMarkup The new message reply markup; pass null if none.
     * @param inputMessageContent New text content of the message. Must be of type inputMessageText.
     */
    public abstract suspend fun editInlineMessageText(
        inlineMessageId: String,
        replyMarkup: ReplyMarkup? = null,
        inputMessageContent: InputMessageContent,
    ): TdlResult<Ok>

    /**
     * Edits the message content caption. Returns the edited message after the edit is completed on the server side.
     *
     * @param chatId The chat the message belongs to.
     * @param messageId Identifier of the message. Use messageProperties.canBeEdited to check whether the message can be edited.
     * @param replyMarkup The new message reply markup; pass null if none; for bots only.
     * @param caption New message content caption; 0-getOption(&quot;message_caption_length_max&quot;) characters; pass null to remove caption.
     * @param showCaptionAboveMedia Pass true to show the caption above the media; otherwise, the caption will be shown below the media. May be true only for animation, photo, and video messages.
     */
    public abstract suspend fun editMessageCaption(
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup? = null,
        caption: FormattedText? = null,
        showCaptionAboveMedia: Boolean,
    ): TdlResult<Message>

    /**
     * Edits the message content of a live location. Messages can be edited for a limited period of time specified in the live location. Returns the edited message after the edit is completed on the server side.
     *
     * @param chatId The chat the message belongs to.
     * @param messageId Identifier of the message. Use messageProperties.canBeEdited to check whether the message can be edited.
     * @param replyMarkup The new message reply markup; pass null if none; for bots only.
     * @param location New location content of the message; pass null to stop sharing the live location.
     * @param livePeriod New time relative to the message send date, for which the location can be updated, in seconds. If 0x7FFFFFFF specified, then the location can be updated forever. Otherwise, must not exceed the current livePeriod by more than a day, and the live location expiration date must remain in the next 90 days. Pass 0 to keep the current livePeriod.
     * @param heading The new direction in which the location moves, in degrees; 1-360. Pass 0 if unknown.
     * @param proximityAlertRadius The new maximum distance for proximity alerts, in meters (0-100000). Pass 0 if the notification is disabled.
     */
    public abstract suspend fun editMessageLiveLocation(
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup? = null,
        location: Location? = null,
        livePeriod: Int,
        heading: Int,
        proximityAlertRadius: Int,
    ): TdlResult<Message>

    /**
     * Edits the media content of a message, including message caption. If only the caption needs to be edited, use editMessageCaption instead. The type of message content in an album can't be changed with exception of replacing a photo with a video or vice versa. Returns the edited message after the edit is completed on the server side.
     *
     * @param chatId The chat the message belongs to.
     * @param messageId Identifier of the message. Use messageProperties.canEditMedia to check whether the message can be edited.
     * @param replyMarkup The new message reply markup; pass null if none; for bots only.
     * @param inputMessageContent New content of the message. Must be one of the following types: inputMessageAnimation, inputMessageAudio, inputMessageDocument, inputMessagePhoto or inputMessageVideo.
     */
    public abstract suspend fun editMessageMedia(
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup? = null,
        inputMessageContent: InputMessageContent,
    ): TdlResult<Message>

    /**
     * Edits the message reply markup; for bots only. Returns the edited message after the edit is completed on the server side.
     *
     * @param chatId The chat the message belongs to.
     * @param messageId Identifier of the message. Use messageProperties.canBeEdited to check whether the message can be edited.
     * @param replyMarkup The new message reply markup; pass null if none.
     */
    public abstract suspend fun editMessageReplyMarkup(
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup? = null,
    ): TdlResult<Message>

    /**
     * Edits the time when a scheduled message will be sent. Scheduling state of all messages in the same album or forwarded together with the message will be also changed.
     *
     * @param chatId The chat the message belongs to.
     * @param messageId Identifier of the message. Use messageProperties.canEditSchedulingState to check whether the message is suitable.
     * @param schedulingState The new message scheduling state; pass null to send the message immediately. Must be null for messages in the state messageSchedulingStateSendWhenVideoProcessed.
     */
    public abstract suspend fun editMessageSchedulingState(
        chatId: Long,
        messageId: Long,
        schedulingState: MessageSchedulingState? = null,
    ): TdlResult<Ok>

    /**
     * Edits the text of a message (or a text of a game message). Returns the edited message after the edit is completed on the server side.
     *
     * @param chatId The chat the message belongs to.
     * @param messageId Identifier of the message. Use messageProperties.canBeEdited to check whether the message can be edited.
     * @param replyMarkup The new message reply markup; pass null if none; for bots only.
     * @param inputMessageContent New text content of the message. Must be of type inputMessageText.
     */
    public abstract suspend fun editMessageText(
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup? = null,
        inputMessageContent: InputMessageContent,
    ): TdlResult<Message>

    /**
     * Edits an existing proxy server for network requests. Can be called before authorization.
     *
     * @param proxyId Proxy identifier.
     * @param server Proxy server domain or IP address.
     * @param port Proxy server port.
     * @param enable Pass true to immediately enable the proxy.
     * @param type Proxy type.
     */
    public abstract suspend fun editProxy(
        proxyId: Int,
        server: String,
        port: Int,
        enable: Boolean,
        type: ProxyType,
    ): TdlResult<Proxy>

    /**
     * Asynchronously edits the text, media or caption of a quick reply message. Use quickReplyMessage.canBeEdited to check whether a message can be edited. Media message can be edited only to a media message. The type of message content in an album can't be changed with exception of replacing a photo with a video or vice versa.
     *
     * @param shortcutId Unique identifier of the quick reply shortcut with the message.
     * @param messageId Identifier of the message.
     * @param inputMessageContent New content of the message. Must be one of the following types: inputMessageText, inputMessageAnimation, inputMessageAudio, inputMessageDocument, inputMessagePhoto or inputMessageVideo.
     */
    public abstract suspend fun editQuickReplyMessage(
        shortcutId: Int,
        messageId: Long,
        inputMessageContent: InputMessageContent,
    ): TdlResult<Ok>

    /**
     * Cancels or re-enables Telegram Star subscription.
     *
     * @param subscriptionId Identifier of the subscription to change.
     * @param isCanceled New value of isCanceled.
     */
    public abstract suspend fun editStarSubscription(subscriptionId: String, isCanceled: Boolean): TdlResult<Ok>

    /**
     * Changes content and caption of a story. Can be called only if story.canBeEdited == true.
     *
     * @param storyPosterChatId Identifier of the chat that posted the story.
     * @param storyId Identifier of the story to edit.
     * @param content New content of the story; pass null to keep the current content.
     * @param areas New clickable rectangle areas to be shown on the story media; pass null to keep the current areas. Areas can't be edited if story content isn't changed.
     * @param caption New story caption; pass null to keep the current caption.
     */
    public abstract suspend fun editStory(
        storyPosterChatId: Long,
        storyId: Int,
        content: InputStoryContent? = null,
        areas: InputStoryAreas? = null,
        caption: FormattedText? = null,
    ): TdlResult<Ok>

    /**
     * Changes cover of a video story. Can be called only if story.canBeEdited == true and the story isn't being edited now.
     *
     * @param storyPosterChatId Identifier of the chat that posted the story.
     * @param storyId Identifier of the story to edit.
     * @param coverFrameTimestamp New timestamp of the frame, which will be used as video thumbnail.
     */
    public abstract suspend fun editStoryCover(
        storyPosterChatId: Long,
        storyId: Int,
        coverFrameTimestamp: Double,
    ): TdlResult<Ok>

    /**
     * Cancels or re-enables Telegram Star subscription for a user; for bots only.
     *
     * @param userId User identifier.
     * @param telegramPaymentChargeId Telegram payment identifier of the subscription.
     * @param isCanceled Pass true to cancel the subscription; pass false to allow the user to enable it.
     */
    public abstract suspend fun editUserStarSubscription(
        userId: Long,
        telegramPaymentChargeId: String,
        isCanceled: Boolean,
    ): TdlResult<Ok>

    /**
     * Enables a proxy. Only one proxy can be enabled at a time. Can be called before authorization.
     *
     * @param proxyId Proxy identifier.
     */
    public abstract suspend fun enableProxy(proxyId: Int): TdlResult<Ok>

    /**
     * Encrypts group call data before sending them over network using tgcalls.
     *
     * @param groupCallId Group call identifier. The call must not be a video chat.
     * @param dataChannel Data channel for which data is encrypted.
     * @param data Data to encrypt.
     * @param unencryptedPrefixSize Size of data prefix that must be kept unencrypted.
     */
    public abstract suspend fun encryptGroupCallData(
        groupCallId: Int,
        dataChannel: GroupCallDataChannel,
        data: ByteArray,
        unencryptedPrefixSize: Int,
    ): TdlResult<Data>

    /**
     * Ends a group call. Requires groupCall.canBeManaged right for video chats or groupCall.isOwned otherwise.
     *
     * @param groupCallId Group call identifier.
     */
    public abstract suspend fun endGroupCall(groupCallId: Int): TdlResult<Ok>

    /**
     * Ends recording of an active group call; for video chats only. Requires groupCall.canBeManaged right.
     *
     * @param groupCallId Group call identifier.
     */
    public abstract suspend fun endGroupCallRecording(groupCallId: Int): TdlResult<Ok>

    /**
     * Ends screen sharing in a joined group call.
     *
     * @param groupCallId Group call identifier.
     */
    public abstract suspend fun endGroupCallScreenSharing(groupCallId: Int): TdlResult<Ok>

    /**
     * Finishes the file generation.
     *
     * @param generationId The identifier of the generation process.
     * @param error If passed, the file generation has failed and must be terminated; pass null if the file generation succeeded.
     */
    public abstract suspend fun finishFileGeneration(generationId: Long, error: Error? = null): TdlResult<Ok>

    /**
     * Forwards previously sent messages. Returns the forwarded messages in the same order as the message identifiers passed in messageIds. If a message can't be forwarded, null will be returned instead of the message.
     *
     * @param chatId Identifier of the chat to which to forward messages.
     * @param messageThreadId If not 0, the message thread identifier in which the message will be sent; for forum threads only.
     * @param fromChatId Identifier of the chat from which to forward messages.
     * @param messageIds Identifiers of the messages to forward. Message identifiers must be in a strictly increasing order. At most 100 messages can be forwarded simultaneously. A message can be forwarded only if messageProperties.canBeForwarded.
     * @param options Options to be used to send the messages; pass null to use default options.
     * @param sendCopy Pass true to copy content of the messages without reference to the original sender. Always true if the messages are forwarded to a secret chat or are local. Use messageProperties.canBeCopied and messageProperties.canBeCopiedToSecretChat to check whether the message is suitable.
     * @param removeCaption Pass true to remove media captions of message copies. Ignored if sendCopy is false.
     */
    public abstract suspend fun forwardMessages(
        chatId: Long,
        messageThreadId: Long,
        fromChatId: Long,
        messageIds: LongArray,
        options: MessageSendOptions? = null,
        sendCopy: Boolean,
        removeCaption: Boolean,
    ): TdlResult<Messages>

    /**
     * Returns the period of inactivity after which the account of the current user will automatically be deleted.
     */
    public abstract suspend fun getAccountTtl(): TdlResult<AccountTtl>

    /**
     * Returns all active sessions of the current user.
     */
    public abstract suspend fun getActiveSessions(): TdlResult<Sessions>

    /**
     * Returns all available Telegram Passport elements.
     *
     * @param password The 2-step verification password of the current user.
     */
    public abstract suspend fun getAllPassportElements(password: String): TdlResult<PassportElements>

    /**
     * Returns unique emoji that correspond to stickers to be found by the getStickers(stickerType, query, 1000000, chatId).
     *
     * @param stickerType Type of the stickers to search for.
     * @param query Search query.
     * @param chatId Chat identifier for which to find stickers.
     * @param returnOnlyMainEmoji Pass true if only main emoji for each found sticker must be included in the result.
     */
    public abstract suspend fun getAllStickerEmojis(
        stickerType: StickerType,
        query: String,
        chatId: Long,
        returnOnlyMainEmoji: Boolean,
    ): TdlResult<Emojis>

    /**
     * Returns an animated emoji corresponding to a given emoji. Returns a 404 error if the emoji has no animated emoji.
     *
     * @param emoji The emoji.
     */
    public abstract suspend fun getAnimatedEmoji(emoji: String): TdlResult<AnimatedEmoji>

    /**
     * Returns application config, provided by the server. Can be called before authorization.
     */
    public abstract suspend fun getApplicationConfig(): TdlResult<JsonValue>

    /**
     * Returns the link for downloading official Telegram application to be used when the current user invites friends to Telegram.
     */
    public abstract suspend fun getApplicationDownloadLink(): TdlResult<HttpUrl>

    /**
     * Returns settings for automatic moving of chats to and from the Archive chat lists.
     */
    public abstract suspend fun getArchiveChatListSettings(): TdlResult<ArchiveChatListSettings>

    /**
     * Returns a list of archived sticker sets.
     *
     * @param stickerType Type of the sticker sets to return.
     * @param offsetStickerSetId Identifier of the sticker set from which to return the result; use 0 to get results from the beginning.
     * @param limit The maximum number of sticker sets to return; up to 100.
     */
    public abstract suspend fun getArchivedStickerSets(
        stickerType: StickerType,
        offsetStickerSetId: Long,
        limit: Int,
    ): TdlResult<StickerSets>

    /**
     * Returns a list of sticker sets attached to a file, including regular, mask, and emoji sticker sets. Currently, only animations, photos, and videos can have attached sticker sets.
     *
     * @param fileId File identifier.
     */
    public abstract suspend fun getAttachedStickerSets(fileId: Int): TdlResult<StickerSets>

    /**
     * Returns information about a bot that can be added to attachment or side menu.
     *
     * @param botUserId Bot's user identifier.
     */
    public abstract suspend fun getAttachmentMenuBot(botUserId: Long): TdlResult<AttachmentMenuBot>

    /**
     * Returns the current authorization state. This is an offline method. For informational purposes only. Use updateAuthorizationState instead to maintain the current authorization state. Can be called before initialization.
     */
    public abstract suspend fun getAuthorizationState(): TdlResult<AuthorizationState>

    /**
     * Returns auto-download settings presets for the current user.
     */
    public abstract suspend fun getAutoDownloadSettingsPresets(): TdlResult<AutoDownloadSettingsPresets>

    /**
     * Returns autosave settings for the current user.
     */
    public abstract suspend fun getAutosaveSettings(): TdlResult<AutosaveSettings>

    /**
     * Returns the list of available chat boost slots for the current user.
     */
    public abstract suspend fun getAvailableChatBoostSlots(): TdlResult<ChatBoostSlots>

    /**
     * Returns gifts that can be sent to other users and channel chats.
     */
    public abstract suspend fun getAvailableGifts(): TdlResult<AvailableGifts>

    /**
     * Constructs a persistent HTTP URL for a background.
     *
     * @param name Background name.
     * @param type Background type; backgroundTypeChatTheme isn't supported.
     */
    public abstract suspend fun getBackgroundUrl(name: String, type: BackgroundType): TdlResult<HttpUrl>

    /**
     * Returns information about a bank card.
     *
     * @param bankCardNumber The bank card number.
     */
    public abstract suspend fun getBankCardInfo(bankCardNumber: String): TdlResult<BankCardInfo>

    /**
     * Returns information about a basic group by its identifier. This is an offline method if the current user is not a bot.
     *
     * @param basicGroupId Basic group identifier.
     */
    public abstract suspend fun getBasicGroup(basicGroupId: Long): TdlResult<BasicGroup>

    /**
     * Returns full information about a basic group by its identifier.
     *
     * @param basicGroupId Basic group identifier.
     */
    public abstract suspend fun getBasicGroupFullInfo(basicGroupId: Long): TdlResult<BasicGroupFullInfo>

    /**
     * Returns users and chats that were blocked by the current user.
     *
     * @param blockList Block list from which to return users.
     * @param offset Number of users and chats to skip in the result; must be non-negative.
     * @param limit The maximum number of users and chats to return; up to 100.
     */
    public abstract suspend fun getBlockedMessageSenders(
        blockList: BlockList,
        offset: Int,
        limit: Int,
    ): TdlResult<MessageSenders>

    /**
     * Returns the text shown in the chat with a bot if the chat is empty in the given language. Can be called only if userTypeBot.canBeEdited == true.
     *
     * @param botUserId Identifier of the target bot.
     * @param languageCode A two-letter ISO 639-1 language code or an empty string.
     */
    public abstract suspend fun getBotInfoDescription(botUserId: Long, languageCode: String): TdlResult<Text>

    /**
     * Returns the text shown on a bot's profile page and sent together with the link when users share the bot in the given language. Can be called only if userTypeBot.canBeEdited == true.
     *
     * @param botUserId Identifier of the target bot.
     * @param languageCode A two-letter ISO 639-1 language code or an empty string.
     */
    public abstract suspend fun getBotInfoShortDescription(botUserId: Long, languageCode: String): TdlResult<Text>

    /**
     * Returns the list of media previews for the given language and the list of languages for which the bot has dedicated previews.
     *
     * @param botUserId Identifier of the target bot. The bot must be owned and must have the main Web App.
     * @param languageCode A two-letter ISO 639-1 language code for which to get previews. If empty, then default previews are returned.
     */
    public abstract suspend fun getBotMediaPreviewInfo(botUserId: Long, languageCode: String): TdlResult<BotMediaPreviewInfo>

    /**
     * Returns the list of media previews of a bot.
     *
     * @param botUserId Identifier of the target bot. The bot must have the main Web App.
     */
    public abstract suspend fun getBotMediaPreviews(botUserId: Long): TdlResult<BotMediaPreviews>

    /**
     * Returns the name of a bot in the given language. Can be called only if userTypeBot.canBeEdited == true.
     *
     * @param botUserId Identifier of the target bot.
     * @param languageCode A two-letter ISO 639-1 language code or an empty string.
     */
    public abstract suspend fun getBotName(botUserId: Long, languageCode: String): TdlResult<Text>

    /**
     * Returns approximate number of bots similar to the given bot.
     *
     * @param botUserId User identifier of the target bot.
     * @param returnLocal Pass true to get the number of bots without sending network requests, or -1 if the number of bots is unknown locally.
     */
    public abstract suspend fun getBotSimilarBotCount(botUserId: Long, returnLocal: Boolean): TdlResult<Count>

    /**
     * Returns a list of bots similar to the given bot.
     *
     * @param botUserId User identifier of the target bot.
     */
    public abstract suspend fun getBotSimilarBots(botUserId: Long): TdlResult<Users>

    /**
     * Returns the amount of Telegram Stars owned by a business account; for bots only.
     *
     * @param businessConnectionId Unique identifier of business connection.
     */
    public abstract suspend fun getBusinessAccountStarAmount(businessConnectionId: String): TdlResult<StarAmount>

    /**
     * Returns information about a business chat link.
     *
     * @param linkName Name of the link.
     */
    public abstract suspend fun getBusinessChatLinkInfo(linkName: String): TdlResult<BusinessChatLinkInfo>

    /**
     * Returns business chat links created for the current account.
     */
    public abstract suspend fun getBusinessChatLinks(): TdlResult<BusinessChatLinks>

    /**
     * Returns the business bot that is connected to the current user account. Returns a 404 error if there is no connected bot.
     */
    public abstract suspend fun getBusinessConnectedBot(): TdlResult<BusinessConnectedBot>

    /**
     * Returns information about a business connection by its identifier; for bots only.
     *
     * @param connectionId Identifier of the business connection to return.
     */
    public abstract suspend fun getBusinessConnection(connectionId: String): TdlResult<BusinessConnection>

    /**
     * Returns information about features, available to Business users.
     *
     * @param source Source of the request; pass null if the method is called from settings or some non-standard source.
     */
    public abstract suspend fun getBusinessFeatures(source: BusinessFeature? = null): TdlResult<BusinessFeatures>

    /**
     * Sends a callback query to a bot and returns an answer. Returns an error with code 502 if the bot fails to answer the query before the query timeout expires.
     *
     * @param chatId Identifier of the chat with the message.
     * @param messageId Identifier of the message from which the query originated. The message must not be scheduled.
     * @param payload Query payload.
     */
    public abstract suspend fun getCallbackQueryAnswer(
        chatId: Long,
        messageId: Long,
        payload: CallbackQueryPayload,
    ): TdlResult<CallbackQueryAnswer>

    /**
     * Returns information about a message with the callback button that originated a callback query; for bots only.
     *
     * @param chatId Identifier of the chat the message belongs to.
     * @param messageId Message identifier.
     * @param callbackQueryId Identifier of the callback query.
     */
    public abstract suspend fun getCallbackQueryMessage(
        chatId: Long,
        messageId: Long,
        callbackQueryId: Long,
    ): TdlResult<Message>

    /**
     * Returns information about a chat by its identifier. This is an offline method if the current user is not a bot.
     *
     * @param chatId Chat identifier.
     */
    public abstract suspend fun getChat(chatId: Long): TdlResult<Chat>

    /**
     * Returns the list of active stories posted by the given chat.
     *
     * @param chatId Chat identifier.
     */
    public abstract suspend fun getChatActiveStories(chatId: Long): TdlResult<ChatActiveStories>

    /**
     * Returns a list of administrators of the chat with their custom titles.
     *
     * @param chatId Chat identifier.
     */
    public abstract suspend fun getChatAdministrators(chatId: Long): TdlResult<ChatAdministrators>

    /**
     * Returns the list of all stories posted by the given chat; requires canEditStories right in the chat. The stories are returned in reverse chronological order (i.e., in order of decreasing storyId). For optimal performance, the number of returned stories is chosen by TDLib.
     *
     * @param chatId Chat identifier.
     * @param fromStoryId Identifier of the story starting from which stories must be returned; use 0 to get results from the last story.
     * @param limit The maximum number of stories to be returned. For optimal performance, the number of returned stories is chosen by TDLib and can be smaller than the specified limit.
     */
    public abstract suspend fun getChatArchivedStories(
        chatId: Long,
        fromStoryId: Int,
        limit: Int,
    ): TdlResult<Stories>

    /**
     * Returns the list of message sender identifiers, which can be used to send messages in a chat.
     *
     * @param chatId Chat identifier.
     */
    public abstract suspend fun getChatAvailableMessageSenders(chatId: Long): TdlResult<ChatMessageSenders>

    /**
     * Returns the list of message sender identifiers, which can be used to send a paid reaction in a chat.
     *
     * @param chatId Chat identifier.
     */
    public abstract suspend fun getChatAvailablePaidMessageReactionSenders(chatId: Long): TdlResult<MessageSenders>

    /**
     * Returns the list of features available for different chat boost levels. This is an offline method.
     *
     * @param isChannel Pass true to get the list of features for channels; pass false to get the list of features for supergroups.
     */
    public abstract suspend fun getChatBoostFeatures(isChannel: Boolean): TdlResult<ChatBoostFeatures>

    /**
     * Returns the list of features available on the specific chat boost level. This is an offline method.
     *
     * @param isChannel Pass true to get the list of features for channels; pass false to get the list of features for supergroups.
     * @param level Chat boost level.
     */
    public abstract suspend fun getChatBoostLevelFeatures(isChannel: Boolean, level: Int): TdlResult<ChatBoostLevelFeatures>

    /**
     * Returns an HTTPS link to boost the specified supergroup or channel chat.
     *
     * @param chatId Identifier of the chat.
     */
    public abstract suspend fun getChatBoostLink(chatId: Long): TdlResult<ChatBoostLink>

    /**
     * Returns information about a link to boost a chat. Can be called for any internal link of the type internalLinkTypeChatBoost.
     *
     * @param url The link to boost a chat.
     */
    public abstract suspend fun getChatBoostLinkInfo(url: String): TdlResult<ChatBoostLinkInfo>

    /**
     * Returns the current boost status for a supergroup or a channel chat.
     *
     * @param chatId Identifier of the chat.
     */
    public abstract suspend fun getChatBoostStatus(chatId: Long): TdlResult<ChatBoostStatus>

    /**
     * Returns the list of boosts applied to a chat; requires administrator rights in the chat.
     *
     * @param chatId Identifier of the chat.
     * @param onlyGiftCodes Pass true to receive only boosts received from gift codes and giveaways created by the chat.
     * @param offset Offset of the first entry to return as received from the previous request; use empty string to get the first chunk of results.
     * @param limit The maximum number of boosts to be returned; up to 100. For optimal performance, the number of returned boosts can be smaller than the specified limit.
     */
    public abstract suspend fun getChatBoosts(
        chatId: Long,
        onlyGiftCodes: Boolean,
        offset: String,
        limit: Int,
    ): TdlResult<FoundChatBoosts>

    /**
     * Returns a list of service actions taken by chat members and administrators in the last 48 hours. Available only for supergroups and channels. Requires administrator rights. Returns results in reverse chronological order (i.e., in order of decreasing eventId).
     *
     * @param chatId Chat identifier.
     * @param query Search query by which to filter events.
     * @param fromEventId Identifier of an event from which to return results. Use 0 to get results from the latest events.
     * @param limit The maximum number of events to return; up to 100.
     * @param filters The types of events to return; pass null to get chat events of all types.
     * @param userIds User identifiers by which to filter events. By default, events relating to all users will be returned.
     */
    public abstract suspend fun getChatEventLog(
        chatId: Long,
        query: String,
        fromEventId: Long,
        limit: Int,
        filters: ChatEventLogFilters? = null,
        userIds: LongArray,
    ): TdlResult<ChatEvents>

    /**
     * Returns information about a chat folder by its identifier.
     *
     * @param chatFolderId Chat folder identifier.
     */
    public abstract suspend fun getChatFolder(chatFolderId: Int): TdlResult<ChatFolder>

    /**
     * Returns approximate number of chats in a being created chat folder. Main and archive chat lists must be fully preloaded for this function to work correctly.
     *
     * @param folder The new chat folder.
     */
    public abstract suspend fun getChatFolderChatCount(folder: ChatFolder): TdlResult<Count>

    /**
     * Returns identifiers of pinned or always included chats from a chat folder, which are suggested to be left when the chat folder is deleted.
     *
     * @param chatFolderId Chat folder identifier.
     */
    public abstract suspend fun getChatFolderChatsToLeave(chatFolderId: Int): TdlResult<Chats>

    /**
     * Returns default icon name for a folder. Can be called synchronously.
     *
     * @param folder Chat folder.
     */
    public abstract suspend fun getChatFolderDefaultIconName(folder: ChatFolder): TdlResult<ChatFolderIcon>

    /**
     * Returns invite links created by the current user for a shareable chat folder.
     *
     * @param chatFolderId Chat folder identifier.
     */
    public abstract suspend fun getChatFolderInviteLinks(chatFolderId: Int): TdlResult<ChatFolderInviteLinks>

    /**
     * Returns new chats added to a shareable chat folder by its owner. The method must be called at most once in getOption(&quot;chat_folder_new_chats_update_period&quot;) for the given chat folder.
     *
     * @param chatFolderId Chat folder identifier.
     */
    public abstract suspend fun getChatFolderNewChats(chatFolderId: Int): TdlResult<Chats>

    /**
     * Returns messages in a chat. The messages are returned in reverse chronological order (i.e., in order of decreasing messageId). For optimal performance, the number of returned messages is chosen by TDLib. This is an offline method if onlyLocal is true.
     *
     * @param chatId Chat identifier.
     * @param fromMessageId Identifier of the message starting from which history must be fetched; use 0 to get results from the last message.
     * @param offset Specify 0 to get results from exactly the message fromMessageId or a negative offset up to 99 to get additionally some newer messages.
     * @param limit The maximum number of messages to be returned; must be positive and can't be greater than 100. If the offset is negative, the limit must be greater than or equal to -offset. For optimal performance, the number of returned messages is chosen by TDLib and can be smaller than the specified limit.
     * @param onlyLocal Pass true to get only messages that are available without sending network requests.
     */
    public abstract suspend fun getChatHistory(
        chatId: Long,
        fromMessageId: Long,
        offset: Int,
        limit: Int,
        onlyLocal: Boolean,
    ): TdlResult<Messages>

    /**
     * Returns information about an invite link. Requires administrator privileges and canInviteUsers right in the chat to get own links and owner privileges to get other links.
     *
     * @param chatId Chat identifier.
     * @param inviteLink Invite link to get.
     */
    public abstract suspend fun getChatInviteLink(chatId: Long, inviteLink: String): TdlResult<ChatInviteLink>

    /**
     * Returns the list of chat administrators with number of their invite links. Requires owner privileges in the chat.
     *
     * @param chatId Chat identifier.
     */
    public abstract suspend fun getChatInviteLinkCounts(chatId: Long): TdlResult<ChatInviteLinkCounts>

    /**
     * Returns chat members joined a chat via an invite link. Requires administrator privileges and canInviteUsers right in the chat for own links and owner privileges for other links.
     *
     * @param chatId Chat identifier.
     * @param inviteLink Invite link for which to return chat members.
     * @param onlyWithExpiredSubscription Pass true if the link is a subscription link and only members with expired subscription must be returned.
     * @param offsetMember A chat member from which to return next chat members; pass null to get results from the beginning.
     * @param limit The maximum number of chat members to return; up to 100.
     */
    public abstract suspend fun getChatInviteLinkMembers(
        chatId: Long,
        inviteLink: String,
        onlyWithExpiredSubscription: Boolean,
        offsetMember: ChatInviteLinkMember? = null,
        limit: Int,
    ): TdlResult<ChatInviteLinkMembers>

    /**
     * Returns invite links for a chat created by specified administrator. Requires administrator privileges and canInviteUsers right in the chat to get own links and owner privileges to get other links.
     *
     * @param chatId Chat identifier.
     * @param creatorUserId User identifier of a chat administrator. Must be an identifier of the current user for non-owner.
     * @param isRevoked Pass true if revoked links needs to be returned instead of active or expired.
     * @param offsetDate Creation date of an invite link starting after which to return invite links; use 0 to get results from the beginning.
     * @param offsetInviteLink Invite link starting after which to return invite links; use empty string to get results from the beginning.
     * @param limit The maximum number of invite links to return; up to 100.
     */
    public abstract suspend fun getChatInviteLinks(
        chatId: Long,
        creatorUserId: Long,
        isRevoked: Boolean,
        offsetDate: Int,
        offsetInviteLink: String,
        limit: Int,
    ): TdlResult<ChatInviteLinks>

    /**
     * Returns pending join requests in a chat.
     *
     * @param chatId Chat identifier.
     * @param inviteLink Invite link for which to return join requests. If empty, all join requests will be returned. Requires administrator privileges and canInviteUsers right in the chat for own links and owner privileges for other links.
     * @param query A query to search for in the first names, last names and usernames of the users to return.
     * @param offsetRequest A chat join request from which to return next requests; pass null to get results from the beginning.
     * @param limit The maximum number of requests to join the chat to return.
     */
    public abstract suspend fun getChatJoinRequests(
        chatId: Long,
        inviteLink: String,
        query: String,
        offsetRequest: ChatJoinRequest? = null,
        limit: Int,
    ): TdlResult<ChatJoinRequests>

    /**
     * Returns chat lists to which the chat can be added. This is an offline method.
     *
     * @param chatId Chat identifier.
     */
    public abstract suspend fun getChatListsToAddChat(chatId: Long): TdlResult<ChatLists>

    /**
     * Returns information about a single member of a chat.
     *
     * @param chatId Chat identifier.
     * @param memberId Member identifier.
     */
    public abstract suspend fun getChatMember(chatId: Long, memberId: MessageSender): TdlResult<ChatMember>

    /**
     * Returns the last message sent in a chat no later than the specified date. Returns a 404 error if such message doesn't exist.
     *
     * @param chatId Chat identifier.
     * @param date Point in time (Unix timestamp) relative to which to search for messages.
     */
    public abstract suspend fun getChatMessageByDate(chatId: Long, date: Int): TdlResult<Message>

    /**
     * Returns information about the next messages of the specified type in the chat split by days. Returns the results in reverse chronological order. Can return partial result for the last returned day. Behavior of this method depends on the value of the option &quot;utc_time_offset&quot;.
     *
     * @param chatId Identifier of the chat in which to return information about messages.
     * @param topicId Pass topic identifier to get the result only in specific topic; pass null to get the result in all topics; forum topics aren't supported.
     * @param filter Filter for message content. Filters searchMessagesFilterEmpty, searchMessagesFilterMention, searchMessagesFilterUnreadMention, and searchMessagesFilterUnreadReaction are unsupported in this function.
     * @param fromMessageId The message identifier from which to return information about messages; use 0 to get results from the last message.
     */
    public abstract suspend fun getChatMessageCalendar(
        chatId: Long,
        topicId: MessageTopic? = null,
        filter: SearchMessagesFilter,
        fromMessageId: Long,
    ): TdlResult<MessageCalendar>

    /**
     * Returns approximate number of messages of the specified type in the chat or its topic.
     *
     * @param chatId Identifier of the chat in which to count messages.
     * @param topicId Pass topic identifier to get number of messages only in specific topic; pass null to get number of messages in all topics.
     * @param filter Filter for message content; searchMessagesFilterEmpty is unsupported in this function.
     * @param returnLocal Pass true to get the number of messages without sending network requests, or -1 if the number of messages is unknown locally.
     */
    public abstract suspend fun getChatMessageCount(
        chatId: Long,
        topicId: MessageTopic? = null,
        filter: SearchMessagesFilter,
        returnLocal: Boolean,
    ): TdlResult<Count>

    /**
     * Returns approximate 1-based position of a message among messages, which can be found by the specified filter in the chat and topic. Cannot be used in secret chats.
     *
     * @param chatId Identifier of the chat in which to find message position.
     * @param topicId Pass topic identifier to get position among messages only in specific topic; pass null to get position among all chat messages.
     * @param filter Filter for message content; searchMessagesFilterEmpty, searchMessagesFilterUnreadMention, searchMessagesFilterUnreadReaction, and searchMessagesFilterFailedToSend are unsupported in this function.
     * @param messageId Message identifier.
     */
    public abstract suspend fun getChatMessagePosition(
        chatId: Long,
        topicId: MessageTopic? = null,
        filter: SearchMessagesFilter,
        messageId: Long,
    ): TdlResult<Count>

    /**
     * Returns the list of chats with non-default notification settings for new messages.
     *
     * @param scope If specified, only chats from the scope will be returned; pass null to return chats from all scopes.
     * @param compareSound Pass true to include in the response chats with only non-default sound.
     */
    public abstract suspend fun getChatNotificationSettingsExceptions(scope: NotificationSettingsScope? = null, compareSound: Boolean): TdlResult<Chats>

    /**
     * Returns information about a newest pinned message in the chat. Returns a 404 error if the message doesn't exist.
     *
     * @param chatId Identifier of the chat the message belongs to.
     */
    public abstract suspend fun getChatPinnedMessage(chatId: Long): TdlResult<Message>

    /**
     * Returns the list of stories that posted by the given chat to its chat page. If fromStoryId == 0, then pinned stories are returned first. Then, stories are returned in reverse chronological order (i.e., in order of decreasing storyId). For optimal performance, the number of returned stories is chosen by TDLib.
     *
     * @param chatId Chat identifier.
     * @param fromStoryId Identifier of the story starting from which stories must be returned; use 0 to get results from pinned and the newest story.
     * @param limit The maximum number of stories to be returned. For optimal performance, the number of returned stories is chosen by TDLib and can be smaller than the specified limit.
     */
    public abstract suspend fun getChatPostedToChatPageStories(
        chatId: Long,
        fromStoryId: Int,
        limit: Int,
    ): TdlResult<Stories>

    /**
     * Returns detailed revenue statistics about a chat. Currently, this method can be used only for channels if supergroupFullInfo.canGetRevenueStatistics == true or bots if userFullInfo.botInfo.canGetRevenueStatistics == true.
     *
     * @param chatId Chat identifier.
     * @param isDark Pass true if a dark theme is used by the application.
     */
    public abstract suspend fun getChatRevenueStatistics(chatId: Long, isDark: Boolean): TdlResult<ChatRevenueStatistics>

    /**
     * Returns the list of revenue transactions for a chat. Currently, this method can be used only for channels if supergroupFullInfo.canGetRevenueStatistics == true or bots if userFullInfo.botInfo.canGetRevenueStatistics == true.
     *
     * @param chatId Chat identifier.
     * @param offset Number of transactions to skip.
     * @param limit The maximum number of transactions to be returned; up to 200.
     */
    public abstract suspend fun getChatRevenueTransactions(
        chatId: Long,
        offset: Int,
        limit: Int,
    ): TdlResult<ChatRevenueTransactions>

    /**
     * Returns a URL for chat revenue withdrawal; requires owner privileges in the channel chat or the bot. Currently, this method can be used only if getOption(&quot;can_withdraw_chat_revenue&quot;) for channels with supergroupFullInfo.canGetRevenueStatistics == true or bots with userFullInfo.botInfo.canGetRevenueStatistics == true.
     *
     * @param chatId Chat identifier.
     * @param password The 2-step verification password of the current user.
     */
    public abstract suspend fun getChatRevenueWithdrawalUrl(chatId: Long, password: String): TdlResult<HttpUrl>

    /**
     * Returns all scheduled messages in a chat. The messages are returned in reverse chronological order (i.e., in order of decreasing messageId).
     *
     * @param chatId Chat identifier.
     */
    public abstract suspend fun getChatScheduledMessages(chatId: Long): TdlResult<Messages>

    /**
     * Returns approximate number of chats similar to the given chat.
     *
     * @param chatId Identifier of the target chat; must be an identifier of a channel chat.
     * @param returnLocal Pass true to get the number of chats without sending network requests, or -1 if the number of chats is unknown locally.
     */
    public abstract suspend fun getChatSimilarChatCount(chatId: Long, returnLocal: Boolean): TdlResult<Count>

    /**
     * Returns a list of chats similar to the given chat.
     *
     * @param chatId Identifier of the target chat; must be an identifier of a channel chat.
     */
    public abstract suspend fun getChatSimilarChats(chatId: Long): TdlResult<Chats>

    /**
     * Returns sparse positions of messages of the specified type in the chat to be used for shared media scroll implementation. Returns the results in reverse chronological order (i.e., in order of decreasing messageId). Cannot be used in secret chats or with searchMessagesFilterFailedToSend filter without an enabled message database.
     *
     * @param chatId Identifier of the chat in which to return information about message positions.
     * @param filter Filter for message content. Filters searchMessagesFilterEmpty, searchMessagesFilterMention, searchMessagesFilterUnreadMention, and searchMessagesFilterUnreadReaction are unsupported in this function.
     * @param fromMessageId The message identifier from which to return information about message positions.
     * @param limit The expected number of message positions to be returned; 50-2000. A smaller number of positions can be returned, if there are not enough appropriate messages.
     * @param savedMessagesTopicId If not 0, only messages in the specified Saved Messages topic will be considered; pass 0 to consider all messages, or for chats other than Saved Messages.
     */
    public abstract suspend fun getChatSparseMessagePositions(
        chatId: Long,
        filter: SearchMessagesFilter,
        fromMessageId: Long,
        limit: Int,
        savedMessagesTopicId: Long,
    ): TdlResult<MessagePositions>

    /**
     * Returns sponsored messages to be shown in a chat; for channel chats and chats with bots only.
     *
     * @param chatId Identifier of the chat.
     */
    public abstract suspend fun getChatSponsoredMessages(chatId: Long): TdlResult<SponsoredMessages>

    /**
     * Returns detailed statistics about a chat. Currently, this method can be used only for supergroups and channels. Can be used only if supergroupFullInfo.canGetStatistics == true.
     *
     * @param chatId Chat identifier.
     * @param isDark Pass true if a dark theme is used by the application.
     */
    public abstract suspend fun getChatStatistics(chatId: Long, isDark: Boolean): TdlResult<ChatStatistics>

    /**
     * Returns interactions with a story posted in a chat. Can be used only if story is posted on behalf of a chat and the user is an administrator in the chat.
     *
     * @param storyPosterChatId The identifier of the poster of the story.
     * @param storyId Story identifier.
     * @param reactionType Pass the default heart reaction or a suggested reaction type to receive only interactions with the specified reaction type; pass null to receive all interactions; reactionTypePaid isn't supported.
     * @param preferForwards Pass true to get forwards and reposts first, then reactions, then other views; pass false to get interactions sorted just by interaction date.
     * @param offset Offset of the first entry to return as received from the previous request; use empty string to get the first chunk of results.
     * @param limit The maximum number of story interactions to return.
     */
    public abstract suspend fun getChatStoryInteractions(
        storyPosterChatId: Long,
        storyId: Int,
        reactionType: ReactionType? = null,
        preferForwards: Boolean,
        offset: String,
        limit: Int,
    ): TdlResult<StoryInteractions>

    /**
     * Returns an ordered list of chats from the beginning of a chat list. For informational purposes only. Use loadChats and updates processing instead to maintain chat lists in a consistent state.
     *
     * @param chatList The chat list in which to return chats; pass null to get chats from the main chat list.
     * @param limit The maximum number of chats to be returned.
     */
    public abstract suspend fun getChats(chatList: ChatList? = null, limit: Int): TdlResult<Chats>

    /**
     * Returns identifiers of chats from a chat folder, suitable for adding to a chat folder invite link.
     *
     * @param chatFolderId Chat folder identifier.
     */
    public abstract suspend fun getChatsForChatFolderInviteLink(chatFolderId: Int): TdlResult<Chats>

    /**
     * Returns supergroup and channel chats in which the current user has the right to post stories. The chats must be rechecked with canPostStory before actually trying to post a story there.
     */
    public abstract suspend fun getChatsToPostStories(): TdlResult<Chats>

    /**
     * Returns all close friends of the current user.
     */
    public abstract suspend fun getCloseFriends(): TdlResult<Users>

    /**
     * Returns information about a given collectible item that was purchased at https://fragment.com.
     *
     * @param type Type of the collectible item. The item must be used by a user and must be visible to the current user.
     */
    public abstract suspend fun getCollectibleItemInfo(type: CollectibleItemType): TdlResult<CollectibleItemInfo>

    /**
     * Returns the list of commands supported by the bot for the given user scope and language; for bots only.
     *
     * @param scope The scope to which the commands are relevant; pass null to get commands in the default bot command scope.
     * @param languageCode A two-letter ISO 639-1 language code or an empty string.
     */
    public abstract suspend fun getCommands(scope: BotCommandScope? = null, languageCode: String): TdlResult<BotCommands>

    /**
     * Returns an affiliate program that were connected to the given affiliate by identifier of the bot that created the program.
     *
     * @param affiliate The affiliate to which the affiliate program will be connected.
     * @param botUserId Identifier of the bot that created the program.
     */
    public abstract suspend fun getConnectedAffiliateProgram(affiliate: AffiliateType, botUserId: Long): TdlResult<ConnectedAffiliateProgram>

    /**
     * Returns affiliate programs that were connected to the given affiliate.
     *
     * @param affiliate The affiliate to which the affiliate program were connected.
     * @param offset Offset of the first affiliate program to return as received from the previous request; use empty string to get the first chunk of results.
     * @param limit The maximum number of affiliate programs to return.
     */
    public abstract suspend fun getConnectedAffiliatePrograms(
        affiliate: AffiliateType,
        offset: String,
        limit: Int,
    ): TdlResult<ConnectedAffiliatePrograms>

    /**
     * Returns all website where the current user used Telegram to log in.
     */
    public abstract suspend fun getConnectedWebsites(): TdlResult<ConnectedWebsites>

    /**
     * Returns all contacts of the user.
     */
    public abstract suspend fun getContacts(): TdlResult<Users>

    /**
     * Returns information about existing countries. Can be called before authorization.
     */
    public abstract suspend fun getCountries(): TdlResult<Countries>

    /**
     * Uses the current IP address to find the current country. Returns two-letter ISO 3166-1 alpha-2 country code. Can be called before authorization.
     */
    public abstract suspend fun getCountryCode(): TdlResult<Text>

    /**
     * Returns an emoji for the given country. Returns an empty string on failure. Can be called synchronously.
     *
     * @param countryCode A two-letter ISO 3166-1 alpha-2 country code as received from getCountries.
     */
    public abstract suspend fun getCountryFlagEmoji(countryCode: String): TdlResult<Text>

    /**
     * Returns a list of public chats of the specified type, owned by the user.
     *
     * @param type Type of the public chats to return.
     */
    public abstract suspend fun getCreatedPublicChats(type: PublicChatType): TdlResult<Chats>

    /**
     * Returns all updates needed to restore current TDLib state, i.e. all actual updateAuthorizationState/updateUser/updateNewChat and others. This is especially useful if TDLib is run in a separate process. Can be called before initialization.
     */
    public abstract suspend fun getCurrentState(): TdlResult<Updates>

    /**
     * Returns the current weather in the given location.
     *
     * @param location The location.
     */
    public abstract suspend fun getCurrentWeather(location: Location): TdlResult<CurrentWeather>

    /**
     * Returns TGS stickers with generic animations for custom emoji reactions.
     */
    public abstract suspend fun getCustomEmojiReactionAnimations(): TdlResult<Stickers>

    /**
     * Returns the list of custom emoji stickers by their identifiers. Stickers are returned in arbitrary order. Only found stickers are returned.
     *
     * @param customEmojiIds Identifiers of custom emoji stickers. At most 200 custom emoji stickers can be received simultaneously.
     */
    public abstract suspend fun getCustomEmojiStickers(customEmojiIds: LongArray): TdlResult<Stickers>

    /**
     * Returns database statistics.
     */
    public abstract suspend fun getDatabaseStatistics(): TdlResult<DatabaseStatistics>

    /**
     * Returns information about a tg:// deep link. Use &quot;tg://need_update_for_some_feature&quot; or &quot;tg:someUnsupportedFeature&quot; for testing. Returns a 404 error for unknown links. Can be called before authorization.
     *
     * @param link The link.
     */
    public abstract suspend fun getDeepLinkInfo(link: String): TdlResult<DeepLinkInfo>

    /**
     * Returns default list of custom emoji stickers for reply background.
     */
    public abstract suspend fun getDefaultBackgroundCustomEmojiStickers(): TdlResult<Stickers>

    /**
     * Returns default emoji statuses for chats.
     */
    public abstract suspend fun getDefaultChatEmojiStatuses(): TdlResult<EmojiStatusCustomEmojis>

    /**
     * Returns default list of custom emoji stickers for placing on a chat photo.
     */
    public abstract suspend fun getDefaultChatPhotoCustomEmojiStickers(): TdlResult<Stickers>

    /**
     * Returns default emoji statuses for self status.
     */
    public abstract suspend fun getDefaultEmojiStatuses(): TdlResult<EmojiStatusCustomEmojis>

    /**
     * Returns default message auto-delete time setting for new chats.
     */
    public abstract suspend fun getDefaultMessageAutoDeleteTime(): TdlResult<MessageAutoDeleteTime>

    /**
     * Returns default list of custom emoji stickers for placing on a profile photo.
     */
    public abstract suspend fun getDefaultProfilePhotoCustomEmojiStickers(): TdlResult<Stickers>

    /**
     * Returns information about the topic in a channel direct messages chat administered by the current user.
     *
     * @param chatId Chat identifier of the channel direct messages chat.
     * @param topicId Identifier of the topic to get.
     */
    public abstract suspend fun getDirectMessagesChatTopic(chatId: Long, topicId: Long): TdlResult<DirectMessagesChatTopic>

    /**
     * Returns messages in the topic in a channel direct messages chat administered by the current user. The messages are returned in reverse chronological order (i.e., in order of decreasing messageId).
     *
     * @param chatId Chat identifier of the channel direct messages chat.
     * @param topicId Identifier of the topic which messages will be fetched.
     * @param fromMessageId Identifier of the message starting from which messages must be fetched; use 0 to get results from the last message.
     * @param offset Specify 0 to get results from exactly the message fromMessageId or a negative offset up to 99 to get additionally some newer messages.
     * @param limit The maximum number of messages to be returned; must be positive and can't be greater than 100. If the offset is negative, the limit must be greater than or equal to -offset. For optimal performance, the number of returned messages is chosen by TDLib and can be smaller than the specified limit.
     */
    public abstract suspend fun getDirectMessagesChatTopicHistory(
        chatId: Long,
        topicId: Long,
        fromMessageId: Long,
        offset: Int,
        limit: Int,
    ): TdlResult<Messages>

    /**
     * Returns the last message sent in the topic in a channel direct messages chat administered by the current user no later than the specified date.
     *
     * @param chatId Chat identifier of the channel direct messages chat.
     * @param topicId Identifier of the topic which messages will be fetched.
     * @param date Point in time (Unix timestamp) relative to which to search for messages.
     */
    public abstract suspend fun getDirectMessagesChatTopicMessageByDate(
        chatId: Long,
        topicId: Long,
        date: Int,
    ): TdlResult<Message>

    /**
     * Returns the list of emoji statuses, which can't be used as chat emoji status, even they are from a sticker set with isAllowedAsChatEmojiStatus == true.
     */
    public abstract suspend fun getDisallowedChatEmojiStatuses(): TdlResult<EmojiStatusCustomEmojis>

    /**
     * Returns available emoji categories.
     *
     * @param type Type of emoji categories to return; pass null to get default emoji categories.
     */
    public abstract suspend fun getEmojiCategories(type: EmojiCategoryType? = null): TdlResult<EmojiCategories>

    /**
     * Returns information about an emoji reaction. Returns a 404 error if the reaction is not found.
     *
     * @param emoji Text representation of the reaction.
     */
    public abstract suspend fun getEmojiReaction(emoji: String): TdlResult<EmojiReaction>

    /**
     * Returns an HTTP URL which can be used to automatically log in to the translation platform and suggest new emoji replacements. The URL will be valid for 30 seconds after generation.
     *
     * @param languageCode Language code for which the emoji replacements will be suggested.
     */
    public abstract suspend fun getEmojiSuggestionsUrl(languageCode: String): TdlResult<HttpUrl>

    /**
     * Returns an HTTP URL which can be used to automatically authorize the current user on a website after clicking an HTTP link. Use the method getExternalLinkInfo to find whether a prior user confirmation is needed.
     *
     * @param link The HTTP link.
     * @param allowWriteAccess Pass true if the current user allowed the bot, returned in getExternalLinkInfo, to send them messages.
     */
    public abstract suspend fun getExternalLink(link: String, allowWriteAccess: Boolean): TdlResult<HttpUrl>

    /**
     * Returns information about an action to be done when the current user clicks an external link. Don't use this method for links from secret chats if link preview is disabled in secret chats.
     *
     * @param link The link.
     */
    public abstract suspend fun getExternalLinkInfo(link: String): TdlResult<LoginUrlInfo>

    /**
     * Returns favorite stickers.
     */
    public abstract suspend fun getFavoriteStickers(): TdlResult<Stickers>

    /**
     * Returns information about a file. This is an offline method.
     *
     * @param fileId Identifier of the file to get.
     */
    public abstract suspend fun getFile(fileId: Int): TdlResult<File>

    /**
     * Returns file downloaded prefix size from a given offset, in bytes.
     *
     * @param fileId Identifier of the file.
     * @param offset Offset from which downloaded prefix size needs to be calculated.
     */
    public abstract suspend fun getFileDownloadedPrefixSize(fileId: Int, offset: Long): TdlResult<FileDownloadedPrefixSize>

    /**
     * Returns the extension of a file, guessed by its MIME type. Returns an empty string on failure. Can be called synchronously.
     *
     * @param mimeType The MIME type of the file.
     */
    public abstract suspend fun getFileExtension(mimeType: String): TdlResult<Text>

    /**
     * Returns the MIME type of a file, guessed by its extension. Returns an empty string on failure. Can be called synchronously.
     *
     * @param fileName The name of the file or path to the file.
     */
    public abstract suspend fun getFileMimeType(fileName: String): TdlResult<Text>

    /**
     * Returns information about a forum topic.
     *
     * @param chatId Identifier of the chat.
     * @param messageThreadId Message thread identifier of the forum topic.
     */
    public abstract suspend fun getForumTopic(chatId: Long, messageThreadId: Long): TdlResult<ForumTopic>

    /**
     * Returns the list of custom emoji, which can be used as forum topic icon by all users.
     */
    public abstract suspend fun getForumTopicDefaultIcons(): TdlResult<Stickers>

    /**
     * Returns an HTTPS link to a topic in a forum chat. This is an offline method.
     *
     * @param chatId Identifier of the chat.
     * @param messageThreadId Message thread identifier of the forum topic.
     */
    public abstract suspend fun getForumTopicLink(chatId: Long, messageThreadId: Long): TdlResult<MessageLink>

    /**
     * Returns found forum topics in a forum chat. This is a temporary method for getting information about topic list from the server.
     *
     * @param chatId Identifier of the forum chat.
     * @param query Query to search for in the forum topic's name.
     * @param offsetDate The date starting from which the results need to be fetched. Use 0 or any date in the future to get results from the last topic.
     * @param offsetMessageId The message identifier of the last message in the last found topic, or 0 for the first request.
     * @param offsetMessageThreadId The message thread identifier of the last found topic, or 0 for the first request.
     * @param limit The maximum number of forum topics to be returned; up to 100. For optimal performance, the number of returned forum topics is chosen by TDLib and can be smaller than the specified limit.
     */
    public abstract suspend fun getForumTopics(
        chatId: Long,
        query: String,
        offsetDate: Int,
        offsetMessageId: Long,
        offsetMessageThreadId: Long,
        limit: Int,
    ): TdlResult<ForumTopics>

    /**
     * Returns the high scores for a game and some part of the high score table in the range of the specified user; for bots only.
     *
     * @param chatId The chat that contains the message with the game.
     * @param messageId Identifier of the message.
     * @param userId User identifier.
     */
    public abstract suspend fun getGameHighScores(
        chatId: Long,
        messageId: Long,
        userId: Long,
    ): TdlResult<GameHighScores>

    /**
     * Returns examples of possible upgraded gifts for a regular gift.
     *
     * @param giftId Identifier of the gift.
     */
    public abstract suspend fun getGiftUpgradePreview(giftId: Long): TdlResult<GiftUpgradePreview>

    /**
     * Returns information about a giveaway.
     *
     * @param chatId Identifier of the channel chat which started the giveaway.
     * @param messageId Identifier of the giveaway or a giveaway winners message in the chat.
     */
    public abstract suspend fun getGiveawayInfo(chatId: Long, messageId: Long): TdlResult<GiveawayInfo>

    /**
     * Returns greeting stickers from regular sticker sets that can be used for the start page of other users.
     */
    public abstract suspend fun getGreetingStickers(): TdlResult<Stickers>

    /**
     * Returns the most grossing Web App bots.
     *
     * @param offset Offset of the first entry to return as received from the previous request; use empty string to get the first chunk of results.
     * @param limit The maximum number of bots to be returned; up to 100.
     */
    public abstract suspend fun getGrossingWebAppBots(offset: String, limit: Int): TdlResult<FoundUsers>

    /**
     * Returns information about a group call.
     *
     * @param groupCallId Group call identifier.
     */
    public abstract suspend fun getGroupCall(groupCallId: Int): TdlResult<GroupCall>

    /**
     * Returns information about participants of a non-joined group call that is not bound to a chat.
     *
     * @param inputGroupCall The group call which participants will be returned.
     * @param limit The maximum number of participants to return; must be positive.
     */
    public abstract suspend fun getGroupCallParticipants(inputGroupCall: InputGroupCall, limit: Int): TdlResult<GroupCallParticipants>

    /**
     * Returns a list of common group chats with a given user. Chats are sorted by their type and creation date.
     *
     * @param userId User identifier.
     * @param offsetChatId Chat identifier starting from which to return chats; use 0 for the first request.
     * @param limit The maximum number of chats to be returned; up to 100.
     */
    public abstract suspend fun getGroupsInCommon(
        userId: Long,
        offsetChatId: Long,
        limit: Int,
    ): TdlResult<Chats>

    /**
     * Returns the total number of imported contacts.
     */
    public abstract suspend fun getImportedContactCount(): TdlResult<Count>

    /**
     * Returns a list of recently inactive supergroups and channels. Can be used when user reaches limit on the number of joined supergroups and channels and receives the error &quot;CHANNELS_TOO_MUCH&quot;. Also, the limit can be increased with Telegram Premium.
     */
    public abstract suspend fun getInactiveSupergroupChats(): TdlResult<Chats>

    /**
     * Returns game high scores and some part of the high score table in the range of the specified user; for bots only.
     *
     * @param inlineMessageId Inline message identifier.
     * @param userId User identifier.
     */
    public abstract suspend fun getInlineGameHighScores(inlineMessageId: String, userId: Long): TdlResult<GameHighScores>

    /**
     * Sends an inline query to a bot and returns its results. Returns an error with code 502 if the bot fails to answer the query before the query timeout expires.
     *
     * @param botUserId Identifier of the target bot.
     * @param chatId Identifier of the chat where the query was sent.
     * @param userLocation Location of the user; pass null if unknown or the bot doesn't need user's location.
     * @param query Text of the query.
     * @param offset Offset of the first entry to return; use empty string to get the first chunk of results.
     */
    public abstract suspend fun getInlineQueryResults(
        botUserId: Long,
        chatId: Long,
        userLocation: Location? = null,
        query: String,
        offset: String,
    ): TdlResult<InlineQueryResults>

    /**
     * Returns backgrounds installed by the user.
     *
     * @param forDarkTheme Pass true to order returned backgrounds for a dark theme.
     */
    public abstract suspend fun getInstalledBackgrounds(forDarkTheme: Boolean): TdlResult<Backgrounds>

    /**
     * Returns a list of installed sticker sets.
     *
     * @param stickerType Type of the sticker sets to return.
     */
    public abstract suspend fun getInstalledStickerSets(stickerType: StickerType): TdlResult<StickerSets>

    /**
     * Returns an HTTPS or a tg: link with the given type. Can be called before authorization.
     *
     * @param type Expected type of the link.
     * @param isHttp Pass true to create an HTTPS link (only available for some link types); pass false to create a tg: link.
     */
    public abstract suspend fun getInternalLink(type: InternalLinkType, isHttp: Boolean): TdlResult<HttpUrl>

    /**
     * Returns information about the type of internal link. Returns a 404 error if the link is not internal. Can be called before authorization.
     *
     * @param link The link.
     */
    public abstract suspend fun getInternalLinkType(link: String): TdlResult<InternalLinkType>

    /**
     * Converts a JsonValue object to corresponding JSON-serialized string. Can be called synchronously.
     *
     * @param jsonValue The JsonValue object.
     */
    public abstract suspend fun getJsonString(jsonValue: JsonValue): TdlResult<Text>

    /**
     * Converts a JSON-serialized string to corresponding JsonValue object. Can be called synchronously.
     *
     * @param json The JSON-serialized string.
     */
    public abstract suspend fun getJsonValue(json: String): TdlResult<JsonValue>

    /**
     * Return emojis matching the keyword. Supported only if the file database is enabled. Order of results is unspecified.
     *
     * @param text Text to search for.
     * @param inputLanguageCodes List of possible IETF language tags of the user's input language; may be empty if unknown.
     */
    public abstract suspend fun getKeywordEmojis(text: String, inputLanguageCodes: Array<String>): TdlResult<Emojis>

    /**
     * Returns information about a language pack. Returned language pack identifier may be different from a provided one. Can be called before authorization.
     *
     * @param languagePackId Language pack identifier.
     */
    public abstract suspend fun getLanguagePackInfo(languagePackId: String): TdlResult<LanguagePackInfo>

    /**
     * Returns a string stored in the local database from the specified localization target and language pack by its key. Returns a 404 error if the string is not found. Can be called synchronously.
     *
     * @param languagePackDatabasePath Path to the language pack database in which strings are stored.
     * @param localizationTarget Localization target to which the language pack belongs.
     * @param languagePackId Language pack identifier.
     * @param key Language pack key of the string to be returned.
     */
    public abstract suspend fun getLanguagePackString(
        languagePackDatabasePath: String,
        localizationTarget: String,
        languagePackId: String,
        key: String,
    ): TdlResult<LanguagePackStringValue>

    /**
     * Returns strings from a language pack in the current localization target by their keys. Can be called before authorization.
     *
     * @param languagePackId Language pack identifier of the strings to be returned.
     * @param keys Language pack keys of the strings to be returned; leave empty to request all available strings.
     */
    public abstract suspend fun getLanguagePackStrings(languagePackId: String, keys: Array<String>): TdlResult<LanguagePackStrings>

    /**
     * Returns a link preview by the text of a message. Do not call this function too often. Returns a 404 error if the text has no link preview.
     *
     * @param text Message text with formatting.
     * @param linkPreviewOptions Options to be used for generation of the link preview; pass null to use default link preview options.
     */
    public abstract suspend fun getLinkPreview(text: FormattedText, linkPreviewOptions: LinkPreviewOptions? = null): TdlResult<LinkPreview>

    /**
     * Returns information about the current localization target. This is an offline method if onlyLocal is true. Can be called before authorization.
     *
     * @param onlyLocal Pass true to get only locally available information without sending network requests.
     */
    public abstract suspend fun getLocalizationTargetInfo(onlyLocal: Boolean): TdlResult<LocalizationTargetInfo>

    /**
     * Returns information about currently used log stream for internal logging of TDLib. Can be called synchronously.
     */
    public abstract suspend fun getLogStream(): TdlResult<LogStream>

    /**
     * Returns current verbosity level for a specified TDLib internal log tag. Can be called synchronously.
     *
     * @param tag Logging tag to change verbosity level.
     */
    public abstract suspend fun getLogTagVerbosityLevel(tag: String): TdlResult<LogVerbosityLevel>

    /**
     * Returns the list of available TDLib internal log tags, for example, [&quot;actor&quot;, &quot;binlog&quot;, &quot;connections&quot;, &quot;notifications&quot;, &quot;proxy&quot;]. Can be called synchronously.
     */
    public abstract suspend fun getLogTags(): TdlResult<LogTags>

    /**
     * Returns current verbosity level of the internal logging of TDLib. Can be called synchronously.
     */
    public abstract suspend fun getLogVerbosityLevel(): TdlResult<LogVerbosityLevel>

    /**
     * Returns an HTTP URL which can be used to automatically authorize the user on a website after clicking an inline button of type inlineKeyboardButtonTypeLoginUrl. Use the method getLoginUrlInfo to find whether a prior user confirmation is needed. If an error is returned, then the button must be handled as an ordinary URL button.
     *
     * @param chatId Chat identifier of the message with the button.
     * @param messageId Message identifier of the message with the button.
     * @param buttonId Button identifier.
     * @param allowWriteAccess Pass true to allow the bot to send messages to the current user.
     */
    public abstract suspend fun getLoginUrl(
        chatId: Long,
        messageId: Long,
        buttonId: Long,
        allowWriteAccess: Boolean,
    ): TdlResult<HttpUrl>

    /**
     * Returns information about a button of type inlineKeyboardButtonTypeLoginUrl. The method needs to be called when the user presses the button.
     *
     * @param chatId Chat identifier of the message with the button.
     * @param messageId Message identifier of the message with the button. The message must not be scheduled.
     * @param buttonId Button identifier.
     */
    public abstract suspend fun getLoginUrlInfo(
        chatId: Long,
        messageId: Long,
        buttonId: Long,
    ): TdlResult<LoginUrlInfo>

    /**
     * Returns information needed to open the main Web App of a bot.
     *
     * @param chatId Identifier of the chat in which the Web App is opened; pass 0 if none.
     * @param botUserId Identifier of the target bot. If the bot is restricted for the current user, then show an error instead of calling the method.
     * @param startParameter Start parameter from internalLinkTypeMainWebApp.
     * @param parameters Parameters to use to open the Web App.
     */
    public abstract suspend fun getMainWebApp(
        chatId: Long,
        botUserId: Long,
        startParameter: String,
        parameters: WebAppOpenParameters,
    ): TdlResult<MainWebApp>

    /**
     * Returns information about a file with a map thumbnail in PNG format. Only map thumbnail files with size less than 1MB can be downloaded.
     *
     * @param location Location of the map center.
     * @param zoom Map zoom level; 13-20.
     * @param width Map width in pixels before applying scale; 16-1024.
     * @param height Map height in pixels before applying scale; 16-1024.
     * @param scale Map scale; 1-3.
     * @param chatId Identifier of a chat in which the thumbnail will be shown. Use 0 if unknown.
     */
    public abstract suspend fun getMapThumbnailFile(
        location: Location,
        zoom: Int,
        width: Int,
        height: Int,
        scale: Int,
        chatId: Long,
    ): TdlResult<File>

    /**
     * Replaces text entities with Markdown formatting in a human-friendly format. Entities that can't be represented in Markdown unambiguously are kept as is. Can be called synchronously.
     *
     * @param text The text.
     */
    public abstract suspend fun getMarkdownText(text: FormattedText): TdlResult<FormattedText>

    /**
     * Returns the current user.
     */
    public abstract suspend fun getMe(): TdlResult<User>

    /**
     * Returns menu button set by the bot for the given user; for bots only.
     *
     * @param userId Identifier of the user or 0 to get the default menu button.
     */
    public abstract suspend fun getMenuButton(userId: Long): TdlResult<BotMenuButton>

    /**
     * Returns information about a message. Returns a 404 error if the message doesn't exist.
     *
     * @param chatId Identifier of the chat the message belongs to.
     * @param messageId Identifier of the message to get.
     */
    public abstract suspend fun getMessage(chatId: Long, messageId: Long): TdlResult<Message>

    /**
     * Returns reactions added for a message, along with their sender.
     *
     * @param chatId Identifier of the chat to which the message belongs.
     * @param messageId Identifier of the message. Use message.interactionInfo.reactions.canGetAddedReactions to check whether added reactions can be received for the message.
     * @param reactionType Type of the reactions to return; pass null to return all added reactions; reactionTypePaid isn't supported.
     * @param offset Offset of the first entry to return as received from the previous request; use empty string to get the first chunk of results.
     * @param limit The maximum number of reactions to be returned; must be positive and can't be greater than 100.
     */
    public abstract suspend fun getMessageAddedReactions(
        chatId: Long,
        messageId: Long,
        reactionType: ReactionType? = null,
        offset: String,
        limit: Int,
    ): TdlResult<AddedReactions>

    /**
     * Returns information about actual author of a message sent on behalf of a channel. The method can be called if messageProperties.canGetAuthor == true.
     *
     * @param chatId Chat identifier.
     * @param messageId Identifier of the message.
     */
    public abstract suspend fun getMessageAuthor(chatId: Long, messageId: Long): TdlResult<User>

    /**
     * Returns reactions, which can be added to a message. The list can change after updateActiveEmojiReactions, updateChatAvailableReactions for the chat, or updateMessageInteractionInfo for the message.
     *
     * @param chatId Identifier of the chat to which the message belongs.
     * @param messageId Identifier of the message.
     * @param rowSize Number of reaction per row, 5-25.
     */
    public abstract suspend fun getMessageAvailableReactions(
        chatId: Long,
        messageId: Long,
        rowSize: Int,
    ): TdlResult<AvailableReactions>

    /**
     * Returns information about a message effect. Returns a 404 error if the effect is not found.
     *
     * @param effectId Unique identifier of the effect.
     */
    public abstract suspend fun getMessageEffect(effectId: Long): TdlResult<MessageEffect>

    /**
     * Returns an HTML code for embedding the message. Available only if messageProperties.canGetEmbeddingCode.
     *
     * @param chatId Identifier of the chat to which the message belongs.
     * @param messageId Identifier of the message.
     * @param forAlbum Pass true to return an HTML code for embedding of the whole media album.
     */
    public abstract suspend fun getMessageEmbeddingCode(
        chatId: Long,
        messageId: Long,
        forAlbum: Boolean,
    ): TdlResult<Text>

    /**
     * Returns information about a file with messages exported from another application.
     *
     * @param messageFileHead Beginning of the message file; up to 100 first lines.
     */
    public abstract suspend fun getMessageFileType(messageFileHead: String): TdlResult<MessageFileType>

    /**
     * Returns a confirmation text to be shown to the user before starting message import.
     *
     * @param chatId Identifier of a chat to which the messages will be imported. It must be an identifier of a private chat with a mutual contact or an identifier of a supergroup chat with canChangeInfo member right.
     */
    public abstract suspend fun getMessageImportConfirmationText(chatId: Long): TdlResult<Text>

    /**
     * Returns an HTTPS link to a message in a chat. Available only if messageProperties.canGetLink, or if messageProperties.canGetMediaTimestampLinks and a media timestamp link is generated. This is an offline method.
     *
     * @param chatId Identifier of the chat to which the message belongs.
     * @param messageId Identifier of the message.
     * @param mediaTimestamp If not 0, timestamp from which the video/audio/video note/voice note/story playing must start, in seconds. The media can be in the message content or in its link preview.
     * @param forAlbum Pass true to create a link for the whole media album.
     * @param inMessageThread Pass true to create a link to the message as a channel post comment, in a message thread, or a forum topic.
     */
    public abstract suspend fun getMessageLink(
        chatId: Long,
        messageId: Long,
        mediaTimestamp: Int,
        forAlbum: Boolean,
        inMessageThread: Boolean,
    ): TdlResult<MessageLink>

    /**
     * Returns information about a public or private message link. Can be called for any internal link of the type internalLinkTypeMessage.
     *
     * @param url The message link.
     */
    public abstract suspend fun getMessageLinkInfo(url: String): TdlResult<MessageLinkInfo>

    /**
     * Returns information about a message, if it is available without sending network request. Returns a 404 error if message isn't available locally. This is an offline method.
     *
     * @param chatId Identifier of the chat the message belongs to.
     * @param messageId Identifier of the message to get.
     */
    public abstract suspend fun getMessageLocally(chatId: Long, messageId: Long): TdlResult<Message>

    /**
     * Returns properties of a message. This is an offline method.
     *
     * @param chatId Chat identifier.
     * @param messageId Identifier of the message.
     */
    public abstract suspend fun getMessageProperties(chatId: Long, messageId: Long): TdlResult<MessageProperties>

    /**
     * Returns forwarded copies of a channel message to different public channels and public reposts as a story. Can be used only if messageProperties.canGetStatistics == true. For optimal performance, the number of returned messages and stories is chosen by TDLib.
     *
     * @param chatId Chat identifier of the message.
     * @param messageId Message identifier.
     * @param offset Offset of the first entry to return as received from the previous request; use empty string to get the first chunk of results.
     * @param limit The maximum number of messages and stories to be returned; must be positive and can't be greater than 100. For optimal performance, the number of returned objects is chosen by TDLib and can be smaller than the specified limit.
     */
    public abstract suspend fun getMessagePublicForwards(
        chatId: Long,
        messageId: Long,
        offset: String,
        limit: Int,
    ): TdlResult<PublicForwards>

    /**
     * Returns read date of a recent outgoing message in a private chat. The method can be called if messageProperties.canGetReadDate == true.
     *
     * @param chatId Chat identifier.
     * @param messageId Identifier of the message.
     */
    public abstract suspend fun getMessageReadDate(chatId: Long, messageId: Long): TdlResult<MessageReadDate>

    /**
     * Returns detailed statistics about a message. Can be used only if messageProperties.canGetStatistics == true.
     *
     * @param chatId Chat identifier.
     * @param messageId Message identifier.
     * @param isDark Pass true if a dark theme is used by the application.
     */
    public abstract suspend fun getMessageStatistics(
        chatId: Long,
        messageId: Long,
        isDark: Boolean,
    ): TdlResult<MessageStatistics>

    /**
     * Returns information about a message thread. Can be used only if messageProperties.canGetMessageThread == true.
     *
     * @param chatId Chat identifier.
     * @param messageId Identifier of the message.
     */
    public abstract suspend fun getMessageThread(chatId: Long, messageId: Long): TdlResult<MessageThreadInfo>

    /**
     * Returns messages in a message thread of a message. Can be used only if messageProperties.canGetMessageThread == true. Message thread of a channel message is in the channel's linked supergroup. The messages are returned in reverse chronological order (i.e., in order of decreasing messageId). For optimal performance, the number of returned messages is chosen by TDLib.
     *
     * @param chatId Chat identifier.
     * @param messageId Message identifier, which thread history needs to be returned.
     * @param fromMessageId Identifier of the message starting from which history must be fetched; use 0 to get results from the last message.
     * @param offset Specify 0 to get results from exactly the message fromMessageId or a negative offset up to 99 to get additionally some newer messages.
     * @param limit The maximum number of messages to be returned; must be positive and can't be greater than 100. If the offset is negative, the limit must be greater than or equal to -offset. For optimal performance, the number of returned messages is chosen by TDLib and can be smaller than the specified limit.
     */
    public abstract suspend fun getMessageThreadHistory(
        chatId: Long,
        messageId: Long,
        fromMessageId: Long,
        offset: Int,
        limit: Int,
    ): TdlResult<Messages>

    /**
     * Returns viewers of a recent outgoing message in a basic group or a supergroup chat. For video notes and voice notes only users, opened content of the message, are returned. The method can be called if messageProperties.canGetViewers == true.
     *
     * @param chatId Chat identifier.
     * @param messageId Identifier of the message.
     */
    public abstract suspend fun getMessageViewers(chatId: Long, messageId: Long): TdlResult<MessageViewers>

    /**
     * Returns information about messages. If a message is not found, returns null on the corresponding position of the result.
     *
     * @param chatId Identifier of the chat the messages belong to.
     * @param messageIds Identifiers of the messages to get.
     */
    public abstract suspend fun getMessages(chatId: Long, messageIds: LongArray): TdlResult<Messages>

    /**
     * Returns network data usage statistics. Can be called before authorization.
     *
     * @param onlyCurrent Pass true to get statistics only for the current library launch.
     */
    public abstract suspend fun getNetworkStatistics(onlyCurrent: Boolean): TdlResult<NetworkStatistics>

    /**
     * Returns privacy settings for new chat creation.
     */
    public abstract suspend fun getNewChatPrivacySettings(): TdlResult<NewChatPrivacySettings>

    /**
     * Returns the value of an option by its name. (Check the list of available options on https://core.telegram.org/tdlib/options.) Can be called before authorization. Can be called synchronously for options &quot;version&quot; and &quot;commit_hash&quot;.
     *
     * @param name The name of the option.
     */
    public abstract suspend fun getOption(name: String): TdlResult<OptionValue>

    /**
     * Returns the list of bots owned by the current user.
     */
    public abstract suspend fun getOwnedBots(): TdlResult<Users>

    /**
     * Returns sticker sets owned by the current user.
     *
     * @param offsetStickerSetId Identifier of the sticker set from which to return owned sticker sets; use 0 to get results from the beginning.
     * @param limit The maximum number of sticker sets to be returned; must be positive and can't be greater than 100. For optimal performance, the number of returned objects is chosen by TDLib and can be smaller than the specified limit.
     */
    public abstract suspend fun getOwnedStickerSets(offsetStickerSetId: Long, limit: Int): TdlResult<StickerSets>

    /**
     * Returns the total number of Telegram Stars received by the current user for paid messages from the given user.
     *
     * @param userId Identifier of the user.
     */
    public abstract suspend fun getPaidMessageRevenue(userId: Long): TdlResult<StarCount>

    /**
     * Returns a Telegram Passport authorization form for sharing data with a service.
     *
     * @param botUserId User identifier of the service's bot.
     * @param scope Telegram Passport element types requested by the service.
     * @param publicKey Service's public key.
     * @param nonce Unique request identifier provided by the service.
     */
    public abstract suspend fun getPassportAuthorizationForm(
        botUserId: Long,
        scope: String,
        publicKey: String,
        nonce: String,
    ): TdlResult<PassportAuthorizationForm>

    /**
     * Returns already available Telegram Passport elements suitable for completing a Telegram Passport authorization form. Result can be received only once for each authorization form.
     *
     * @param authorizationFormId Authorization form identifier.
     * @param password The 2-step verification password of the current user.
     */
    public abstract suspend fun getPassportAuthorizationFormAvailableElements(authorizationFormId: Int, password: String): TdlResult<PassportElementsWithErrors>

    /**
     * Returns one of the available Telegram Passport elements.
     *
     * @param type Telegram Passport element type.
     * @param password The 2-step verification password of the current user.
     */
    public abstract suspend fun getPassportElement(type: PassportElementType, password: String): TdlResult<PassportElement>

    /**
     * Returns the current state of 2-step verification.
     */
    public abstract suspend fun getPasswordState(): TdlResult<PasswordState>

    /**
     * Returns an invoice payment form. This method must be called when the user presses inline button of the type inlineKeyboardButtonTypeBuy, or wants to buy access to media in a messagePaidMedia message.
     *
     * @param inputInvoice The invoice.
     * @param theme Preferred payment form theme; pass null to use the default theme.
     */
    public abstract suspend fun getPaymentForm(inputInvoice: InputInvoice, theme: ThemeParameters? = null): TdlResult<PaymentForm>

    /**
     * Returns information about a successful payment.
     *
     * @param chatId Chat identifier of the messagePaymentSuccessful message.
     * @param messageId Message identifier.
     */
    public abstract suspend fun getPaymentReceipt(chatId: Long, messageId: Long): TdlResult<PaymentReceipt>

    /**
     * Returns information about a phone number by its prefix. Can be called before authorization.
     *
     * @param phoneNumberPrefix The phone number prefix.
     */
    public abstract suspend fun getPhoneNumberInfo(phoneNumberPrefix: String): TdlResult<PhoneNumberInfo>

    /**
     * Returns information about a phone number by its prefix synchronously. getCountries must be called at least once after changing localization to the specified language if properly localized country information is expected. Can be called synchronously.
     *
     * @param languageCode A two-letter ISO 639-1 language code for country information localization.
     * @param phoneNumberPrefix The phone number prefix.
     */
    public abstract suspend fun getPhoneNumberInfoSync(languageCode: String, phoneNumberPrefix: String): TdlResult<PhoneNumberInfo>

    /**
     * Returns message senders voted for the specified option in a non-anonymous polls. For optimal performance, the number of returned users is chosen by TDLib.
     *
     * @param chatId Identifier of the chat to which the poll belongs.
     * @param messageId Identifier of the message containing the poll.
     * @param optionId 0-based identifier of the answer option.
     * @param offset Number of voters to skip in the result; must be non-negative.
     * @param limit The maximum number of voters to be returned; must be positive and can't be greater than 50. For optimal performance, the number of returned voters is chosen by TDLib and can be smaller than the specified limit, even if the end of the voter list has not been reached.
     */
    public abstract suspend fun getPollVoters(
        chatId: Long,
        messageId: Long,
        optionId: Int,
        offset: Int,
        limit: Int,
    ): TdlResult<MessageSenders>

    /**
     * Returns an IETF language tag of the language preferred in the country, which must be used to fill native fields in Telegram Passport personal details. Returns a 404 error if unknown.
     *
     * @param countryCode A two-letter ISO 3166-1 alpha-2 country code.
     */
    public abstract suspend fun getPreferredCountryLanguage(countryCode: String): TdlResult<Text>

    /**
     * Returns information about features, available to Premium users.
     *
     * @param source Source of the request; pass null if the method is called from some non-standard source.
     */
    public abstract suspend fun getPremiumFeatures(source: PremiumSource? = null): TdlResult<PremiumFeatures>

    /**
     * Returns available options for gifting Telegram Premium to a user.
     */
    public abstract suspend fun getPremiumGiftPaymentOptions(): TdlResult<PremiumGiftPaymentOptions>

    /**
     * Returns available options for creating of Telegram Premium giveaway or manual distribution of Telegram Premium among chat members.
     *
     * @param boostedChatId Identifier of the supergroup or channel chat, which will be automatically boosted by receivers of the gift codes and which is administered by the user.
     */
    public abstract suspend fun getPremiumGiveawayPaymentOptions(boostedChatId: Long): TdlResult<PremiumGiveawayPaymentOptions>

    /**
     * Returns the sticker to be used as representation of the Telegram Premium subscription.
     *
     * @param monthCount Number of months the Telegram Premium subscription will be active.
     */
    public abstract suspend fun getPremiumInfoSticker(monthCount: Int): TdlResult<Sticker>

    /**
     * Returns information about a limit, increased for Premium users. Returns a 404 error if the limit is unknown.
     *
     * @param limitType Type of the limit.
     */
    public abstract suspend fun getPremiumLimit(limitType: PremiumLimitType): TdlResult<PremiumLimit>

    /**
     * Returns state of Telegram Premium subscription and promotion videos for Premium features.
     */
    public abstract suspend fun getPremiumState(): TdlResult<PremiumState>

    /**
     * Returns examples of premium stickers for demonstration purposes.
     */
    public abstract suspend fun getPremiumStickerExamples(): TdlResult<Stickers>

    /**
     * Returns premium stickers from regular sticker sets.
     *
     * @param limit The maximum number of stickers to be returned; 0-100.
     */
    public abstract suspend fun getPremiumStickers(limit: Int): TdlResult<Stickers>

    /**
     * Saves an inline message to be sent by the given user.
     *
     * @param botUserId Identifier of the bot that created the message.
     * @param preparedMessageId Identifier of the prepared message.
     */
    public abstract suspend fun getPreparedInlineMessage(botUserId: Long, preparedMessageId: String): TdlResult<PreparedInlineMessage>

    /**
     * Returns the list of proxies that are currently set up. Can be called before authorization.
     */
    public abstract suspend fun getProxies(): TdlResult<Proxies>

    /**
     * Returns an HTTPS link, which can be used to add a proxy. Available only for SOCKS5 and MTProto proxies. Can be called before authorization.
     *
     * @param proxyId Proxy identifier.
     */
    public abstract suspend fun getProxyLink(proxyId: Int): TdlResult<HttpUrl>

    /**
     * Returns a globally unique push notification subscription identifier for identification of an account, which has received a push notification. Can be called synchronously.
     *
     * @param payload JSON-encoded push notification payload.
     */
    public abstract suspend fun getPushReceiverId(payload: String): TdlResult<PushReceiverId>

    /**
     * Returns privacy settings for message read date.
     */
    public abstract suspend fun getReadDatePrivacySettings(): TdlResult<ReadDatePrivacySettings>

    /**
     * Returns information about a received gift.
     *
     * @param receivedGiftId Identifier of the gift.
     */
    public abstract suspend fun getReceivedGift(receivedGiftId: String): TdlResult<ReceivedGift>

    /**
     * Returns gifts received by the given user or chat.
     *
     * @param businessConnectionId Unique identifier of business connection on behalf of which to send the request; for bots only.
     * @param ownerId Identifier of the gift receiver.
     * @param excludeUnsaved Pass true to exclude gifts that aren't saved to the chat's profile page. Always true for gifts received by other users and channel chats without canPostMessages administrator right.
     * @param excludeSaved Pass true to exclude gifts that are saved to the chat's profile page. Always false for gifts received by other users and channel chats without canPostMessages administrator right.
     * @param excludeUnlimited Pass true to exclude gifts that can be purchased unlimited number of times.
     * @param excludeLimited Pass true to exclude gifts that can be purchased limited number of times.
     * @param excludeUpgraded Pass true to exclude upgraded gifts.
     * @param sortByPrice Pass true to sort results by gift price instead of send date.
     * @param offset Offset of the first entry to return as received from the previous request; use empty string to get the first chunk of results.
     * @param limit The maximum number of gifts to be returned; must be positive and can't be greater than 100. For optimal performance, the number of returned objects is chosen by TDLib and can be smaller than the specified limit.
     */
    public abstract suspend fun getReceivedGifts(
        businessConnectionId: String,
        ownerId: MessageSender,
        excludeUnsaved: Boolean,
        excludeSaved: Boolean,
        excludeUnlimited: Boolean,
        excludeLimited: Boolean,
        excludeUpgraded: Boolean,
        sortByPrice: Boolean,
        offset: String,
        limit: Int,
    ): TdlResult<ReceivedGifts>

    /**
     * Returns recent emoji statuses for self status.
     */
    public abstract suspend fun getRecentEmojiStatuses(): TdlResult<EmojiStatuses>

    /**
     * Returns up to 20 recently used inline bots in the order of their last usage.
     */
    public abstract suspend fun getRecentInlineBots(): TdlResult<Users>

    /**
     * Returns a list of recently used stickers.
     *
     * @param isAttached Pass true to return stickers and masks that were recently attached to photos or video files; pass false to return recently sent stickers.
     */
    public abstract suspend fun getRecentStickers(isAttached: Boolean): TdlResult<Stickers>

    /**
     * Returns recently opened chats. This is an offline method. Returns chats in the order of last opening.
     *
     * @param limit The maximum number of chats to be returned.
     */
    public abstract suspend fun getRecentlyOpenedChats(limit: Int): TdlResult<Chats>

    /**
     * Returns t.me URLs recently visited by a newly registered user.
     *
     * @param referrer Google Play referrer to identify the user.
     */
    public abstract suspend fun getRecentlyVisitedTMeUrls(referrer: String): TdlResult<TMeUrls>

    /**
     * Returns recommended chat folders for the current user.
     */
    public abstract suspend fun getRecommendedChatFolders(): TdlResult<RecommendedChatFolders>

    /**
     * Returns a list of channel chats recommended to the current user.
     */
    public abstract suspend fun getRecommendedChats(): TdlResult<Chats>

    /**
     * Returns a 2-step verification recovery email address that was previously set up. This method can be used to verify a password provided by the user.
     *
     * @param password The 2-step verification password for the current user.
     */
    public abstract suspend fun getRecoveryEmailAddress(password: String): TdlResult<RecoveryEmailAddress>

    /**
     * Returns information about a file by its remote identifier. This is an offline method. Can be used to register a URL as a file for further uploading, or sending as a message. Even the request succeeds, the file can be used only if it is still accessible to the user. For example, if the file is from a message, then the message must be not deleted and accessible to the user. If the file database is disabled, then the corresponding object with the file must be preloaded by the application.
     *
     * @param remoteFileId Remote identifier of the file to get.
     * @param fileType File type; pass null if unknown.
     */
    public abstract suspend fun getRemoteFile(remoteFileId: String, fileType: FileType? = null): TdlResult<File>

    /**
     * Returns information about a non-bundled message that is replied by a given message. Also, returns the pinned message, the game message, the invoice message, the message with a previously set same background, the giveaway message, and the topic creation message for messages of the types messagePinMessage, messageGameScore, messagePaymentSuccessful, messageChatSetBackground, messageGiveawayCompleted and topic messages without non-bundled replied message respectively. Returns a 404 error if the message doesn't exist.
     *
     * @param chatId Identifier of the chat the message belongs to.
     * @param messageId Identifier of the reply message.
     */
    public abstract suspend fun getRepliedMessage(chatId: Long, messageId: Long): TdlResult<Message>

    /**
     * Returns saved animations.
     */
    public abstract suspend fun getSavedAnimations(): TdlResult<Animations>

    /**
     * Returns tags used in Saved Messages or a Saved Messages topic.
     *
     * @param savedMessagesTopicId Identifier of Saved Messages topic which tags will be returned; pass 0 to get all Saved Messages tags.
     */
    public abstract suspend fun getSavedMessagesTags(savedMessagesTopicId: Long): TdlResult<SavedMessagesTags>

    /**
     * Returns messages in a Saved Messages topic. The messages are returned in reverse chronological order (i.e., in order of decreasing messageId).
     *
     * @param savedMessagesTopicId Identifier of Saved Messages topic which messages will be fetched.
     * @param fromMessageId Identifier of the message starting from which messages must be fetched; use 0 to get results from the last message.
     * @param offset Specify 0 to get results from exactly the message fromMessageId or a negative offset up to 99 to get additionally some newer messages.
     * @param limit The maximum number of messages to be returned; must be positive and can't be greater than 100. If the offset is negative, the limit must be greater than or equal to -offset. For optimal performance, the number of returned messages is chosen by TDLib and can be smaller than the specified limit.
     */
    public abstract suspend fun getSavedMessagesTopicHistory(
        savedMessagesTopicId: Long,
        fromMessageId: Long,
        offset: Int,
        limit: Int,
    ): TdlResult<Messages>

    /**
     * Returns the last message sent in a Saved Messages topic no later than the specified date.
     *
     * @param savedMessagesTopicId Identifier of Saved Messages topic which message will be returned.
     * @param date Point in time (Unix timestamp) relative to which to search for messages.
     */
    public abstract suspend fun getSavedMessagesTopicMessageByDate(savedMessagesTopicId: Long, date: Int): TdlResult<Message>

    /**
     * Returns saved notification sound by its identifier. Returns a 404 error if there is no saved notification sound with the specified identifier.
     *
     * @param notificationSoundId Identifier of the notification sound.
     */
    public abstract suspend fun getSavedNotificationSound(notificationSoundId: Long): TdlResult<NotificationSounds>

    /**
     * Returns the list of saved notification sounds. If a sound isn't in the list, then default sound needs to be used.
     */
    public abstract suspend fun getSavedNotificationSounds(): TdlResult<NotificationSounds>

    /**
     * Returns saved order information. Returns a 404 error if there is no saved order information.
     */
    public abstract suspend fun getSavedOrderInfo(): TdlResult<OrderInfo>

    /**
     * Returns the notification settings for chats of a given type.
     *
     * @param scope Types of chats for which to return the notification settings information.
     */
    public abstract suspend fun getScopeNotificationSettings(scope: NotificationSettingsScope): TdlResult<ScopeNotificationSettings>

    /**
     * Returns sponsored chats to be shown in the search results.
     *
     * @param query Query the user searches for.
     */
    public abstract suspend fun getSearchSponsoredChats(query: String): TdlResult<SponsoredChats>

    /**
     * Returns recently searched for hashtags or cashtags by their prefix.
     *
     * @param tagPrefix Prefix of hashtags or cashtags to return.
     * @param limit The maximum number of items to be returned.
     */
    public abstract suspend fun getSearchedForTags(tagPrefix: String, limit: Int): TdlResult<Hashtags>

    /**
     * Returns information about a secret chat by its identifier. This is an offline method.
     *
     * @param secretChatId Secret chat identifier.
     */
    public abstract suspend fun getSecretChat(secretChatId: Int): TdlResult<SecretChat>

    /**
     * Returns a URL for a Telegram Ad platform account that can be used to set up advertisements for the chat paid in the owned Telegram Stars.
     *
     * @param ownerId Identifier of the owner of the Telegram Stars; can be identifier of an owned bot, or identifier of an owned channel chat.
     */
    public abstract suspend fun getStarAdAccountUrl(ownerId: MessageSender): TdlResult<HttpUrl>

    /**
     * Returns available options for Telegram Stars gifting.
     *
     * @param userId Identifier of the user that will receive Telegram Stars; pass 0 to get options for an unspecified user.
     */
    public abstract suspend fun getStarGiftPaymentOptions(userId: Long): TdlResult<StarPaymentOptions>

    /**
     * Returns available options for Telegram Star giveaway creation.
     */
    public abstract suspend fun getStarGiveawayPaymentOptions(): TdlResult<StarGiveawayPaymentOptions>

    /**
     * Returns available options for Telegram Stars purchase.
     */
    public abstract suspend fun getStarPaymentOptions(): TdlResult<StarPaymentOptions>

    /**
     * Returns detailed Telegram Star revenue statistics.
     *
     * @param ownerId Identifier of the owner of the Telegram Stars; can be identifier of the current user, an owned bot, or a supergroup or a channel chat with supergroupFullInfo.canGetStarRevenueStatistics == true.
     * @param isDark Pass true if a dark theme is used by the application.
     */
    public abstract suspend fun getStarRevenueStatistics(ownerId: MessageSender, isDark: Boolean): TdlResult<StarRevenueStatistics>

    /**
     * Returns the list of Telegram Star subscriptions for the current user.
     *
     * @param onlyExpiring Pass true to receive only expiring subscriptions for which there are no enough Telegram Stars to extend.
     * @param offset Offset of the first subscription to return as received from the previous request; use empty string to get the first chunk of results.
     */
    public abstract suspend fun getStarSubscriptions(onlyExpiring: Boolean, offset: String): TdlResult<StarSubscriptions>

    /**
     * Returns the list of Telegram Star transactions for the specified owner.
     *
     * @param ownerId Identifier of the owner of the Telegram Stars; can be the identifier of the current user, identifier of an owned bot, or identifier of a supergroup or a channel chat with supergroupFullInfo.canGetStarRevenueStatistics == true.
     * @param subscriptionId If non-empty, only transactions related to the Star Subscription will be returned.
     * @param direction Direction of the transactions to receive; pass null to get all transactions.
     * @param offset Offset of the first transaction to return as received from the previous request; use empty string to get the first chunk of results.
     * @param limit The maximum number of transactions to return.
     */
    public abstract suspend fun getStarTransactions(
        ownerId: MessageSender,
        subscriptionId: String,
        direction: StarTransactionDirection? = null,
        offset: String,
        limit: Int,
    ): TdlResult<StarTransactions>

    /**
     * Returns a URL for Telegram Star withdrawal.
     *
     * @param ownerId Identifier of the owner of the Telegram Stars; can be identifier of the current user, an owned bot, or an owned supergroup or channel chat.
     * @param starCount The number of Telegram Stars to withdraw. Must be at least getOption(&quot;star_withdrawal_count_min&quot;).
     * @param password The 2-step verification password of the current user.
     */
    public abstract suspend fun getStarWithdrawalUrl(
        ownerId: MessageSender,
        starCount: Long,
        password: String,
    ): TdlResult<HttpUrl>

    /**
     * Loads an asynchronous or a zoomed in statistical graph.
     *
     * @param chatId Chat identifier.
     * @param token The token for graph loading.
     * @param x X-value for zoomed in graph or 0 otherwise.
     */
    public abstract suspend fun getStatisticalGraph(
        chatId: Long,
        token: String,
        x: Long,
    ): TdlResult<StatisticalGraph>

    /**
     * Returns emoji corresponding to a sticker. The list is only for informational purposes, because a sticker is always sent with a fixed emoji from the corresponding Sticker object.
     *
     * @param sticker Sticker file identifier.
     */
    public abstract suspend fun getStickerEmojis(sticker: InputFile): TdlResult<Emojis>

    /**
     * Returns outline of a sticker. This is an offline method. Returns a 404 error if the outline isn't known.
     *
     * @param stickerFileId File identifier of the sticker.
     * @param forAnimatedEmoji Pass true to get the outline scaled for animated emoji.
     * @param forClickedAnimatedEmojiMessage Pass true to get the outline scaled for clicked animated emoji message.
     */
    public abstract suspend fun getStickerOutline(
        stickerFileId: Int,
        forAnimatedEmoji: Boolean,
        forClickedAnimatedEmojiMessage: Boolean,
    ): TdlResult<Outline>

    /**
     * Returns information about a sticker set by its identifier.
     *
     * @param setId Identifier of the sticker set.
     */
    public abstract suspend fun getStickerSet(setId: Long): TdlResult<StickerSet>

    /**
     * Returns name of a sticker set by its identifier.
     *
     * @param setId Identifier of the sticker set.
     */
    public abstract suspend fun getStickerSetName(setId: Long): TdlResult<Text>

    /**
     * Returns stickers from the installed sticker sets that correspond to any of the given emoji or can be found by sticker-specific keywords. If the query is non-empty, then favorite, recently used or trending stickers may also be returned.
     *
     * @param stickerType Type of the stickers to return.
     * @param query Search query; a space-separated list of emojis or a keyword prefix. If empty, returns all known installed stickers.
     * @param limit The maximum number of stickers to be returned.
     * @param chatId Chat identifier for which to return stickers. Available custom emoji stickers may be different for different chats.
     */
    public abstract suspend fun getStickers(
        stickerType: StickerType,
        query: String,
        limit: Int,
        chatId: Long,
    ): TdlResult<Stickers>

    /**
     * Returns storage usage statistics. Can be called before authorization.
     *
     * @param chatLimit The maximum number of chats with the largest storage usage for which separate statistics need to be returned. All other chats will be grouped in entries with chatId == 0. If the chat info database is not used, the chatLimit is ignored and is always set to 0.
     */
    public abstract suspend fun getStorageStatistics(chatLimit: Int): TdlResult<StorageStatistics>

    /**
     * Quickly returns approximate storage usage statistics. Can be called before authorization.
     */
    public abstract suspend fun getStorageStatisticsFast(): TdlResult<StorageStatisticsFast>

    /**
     * Returns a story.
     *
     * @param storyPosterChatId Identifier of the chat that posted the story.
     * @param storyId Story identifier.
     * @param onlyLocal Pass true to get only locally available information without sending network requests.
     */
    public abstract suspend fun getStory(
        storyPosterChatId: Long,
        storyId: Int,
        onlyLocal: Boolean,
    ): TdlResult<Story>

    /**
     * Returns reactions, which can be chosen for a story.
     *
     * @param rowSize Number of reaction per row, 5-25.
     */
    public abstract suspend fun getStoryAvailableReactions(rowSize: Int): TdlResult<AvailableReactions>

    /**
     * Returns interactions with a story. The method can be called only for stories posted on behalf of the current user.
     *
     * @param storyId Story identifier.
     * @param query Query to search for in names, usernames and titles; may be empty to get all relevant interactions.
     * @param onlyContacts Pass true to get only interactions by contacts; pass false to get all relevant interactions.
     * @param preferForwards Pass true to get forwards and reposts first, then reactions, then other views; pass false to get interactions sorted just by interaction date.
     * @param preferWithReaction Pass true to get interactions with reaction first; pass false to get interactions sorted just by interaction date. Ignored if preferForwards == true.
     * @param offset Offset of the first entry to return as received from the previous request; use empty string to get the first chunk of results.
     * @param limit The maximum number of story interactions to return.
     */
    public abstract suspend fun getStoryInteractions(
        storyId: Int,
        query: String,
        onlyContacts: Boolean,
        preferForwards: Boolean,
        preferWithReaction: Boolean,
        offset: String,
        limit: Int,
    ): TdlResult<StoryInteractions>

    /**
     * Returns the list of chats with non-default notification settings for stories.
     */
    public abstract suspend fun getStoryNotificationSettingsExceptions(): TdlResult<Chats>

    /**
     * Returns forwards of a story as a message to public chats and reposts by public channels. Can be used only if the story is posted on behalf of the current user or story.canGetStatistics == true. For optimal performance, the number of returned messages and stories is chosen by TDLib.
     *
     * @param storyPosterChatId The identifier of the poster of the story.
     * @param storyId The identifier of the story.
     * @param offset Offset of the first entry to return as received from the previous request; use empty string to get the first chunk of results.
     * @param limit The maximum number of messages and stories to be returned; must be positive and can't be greater than 100. For optimal performance, the number of returned objects is chosen by TDLib and can be smaller than the specified limit.
     */
    public abstract suspend fun getStoryPublicForwards(
        storyPosterChatId: Long,
        storyId: Int,
        offset: String,
        limit: Int,
    ): TdlResult<PublicForwards>

    /**
     * Returns detailed statistics about a story. Can be used only if story.canGetStatistics == true.
     *
     * @param chatId Chat identifier.
     * @param storyId Story identifier.
     * @param isDark Pass true if a dark theme is used by the application.
     */
    public abstract suspend fun getStoryStatistics(
        chatId: Long,
        storyId: Int,
        isDark: Boolean,
    ): TdlResult<StoryStatistics>

    /**
     * Returns suggested name for saving a file in a given directory.
     *
     * @param fileId Identifier of the file.
     * @param directory Directory in which the file is expected to be saved.
     */
    public abstract suspend fun getSuggestedFileName(fileId: Int, directory: String): TdlResult<Text>

    /**
     * Returns a suggested name for a new sticker set with a given title.
     *
     * @param title Sticker set title; 1-64 characters.
     */
    public abstract suspend fun getSuggestedStickerSetName(title: String): TdlResult<Text>

    /**
     * Returns a list of basic group and supergroup chats, which can be used as a discussion group for a channel. Returned basic group chats must be first upgraded to supergroups before they can be set as a discussion group. To set a returned supergroup as a discussion group, access to its old messages must be enabled using toggleSupergroupIsAllHistoryAvailable first.
     */
    public abstract suspend fun getSuitableDiscussionChats(): TdlResult<Chats>

    /**
     * Returns a list of channel chats, which can be used as a personal chat.
     */
    public abstract suspend fun getSuitablePersonalChats(): TdlResult<Chats>

    /**
     * Returns information about a supergroup or a channel by its identifier. This is an offline method if the current user is not a bot.
     *
     * @param supergroupId Supergroup or channel identifier.
     */
    public abstract suspend fun getSupergroup(supergroupId: Long): TdlResult<Supergroup>

    /**
     * Returns full information about a supergroup or a channel by its identifier, cached for up to 1 minute.
     *
     * @param supergroupId Supergroup or channel identifier.
     */
    public abstract suspend fun getSupergroupFullInfo(supergroupId: Long): TdlResult<SupergroupFullInfo>

    /**
     * Returns information about members or banned users in a supergroup or channel. Can be used only if supergroupFullInfo.canGetMembers == true; additionally, administrator privileges may be required for some filters.
     *
     * @param supergroupId Identifier of the supergroup or channel.
     * @param filter The type of users to return; pass null to use supergroupMembersFilterRecent.
     * @param offset Number of users to skip.
     * @param limit The maximum number of users to be returned; up to 200.
     */
    public abstract suspend fun getSupergroupMembers(
        supergroupId: Long,
        filter: SupergroupMembersFilter? = null,
        offset: Int,
        limit: Int,
    ): TdlResult<ChatMembers>

    /**
     * Returns localized name of the Telegram support user; for Telegram support only.
     */
    public abstract suspend fun getSupportName(): TdlResult<Text>

    /**
     * Returns a user that can be contacted to get support.
     */
    public abstract suspend fun getSupportUser(): TdlResult<User>

    /**
     * Returns information about the current temporary password.
     */
    public abstract suspend fun getTemporaryPasswordState(): TdlResult<TemporaryPasswordState>

    /**
     * Returns all entities (mentions, hashtags, cashtags, bot commands, bank card numbers, URLs, and email addresses) found in the text. Can be called synchronously.
     *
     * @param text The text in which to look for entities.
     */
    public abstract suspend fun getTextEntities(text: String): TdlResult<TextEntities>

    /**
     * Converts a themeParameters object to corresponding JSON-serialized string. Can be called synchronously.
     *
     * @param theme Theme parameters to convert to JSON.
     */
    public abstract suspend fun getThemeParametersJsonString(theme: ThemeParameters): TdlResult<Text>

    /**
     * Returns up to 8 emoji statuses, which must be shown in the emoji status list for chats.
     */
    public abstract suspend fun getThemedChatEmojiStatuses(): TdlResult<EmojiStatusCustomEmojis>

    /**
     * Returns up to 8 emoji statuses, which must be shown right after the default Premium Badge in the emoji status list for self status.
     */
    public abstract suspend fun getThemedEmojiStatuses(): TdlResult<EmojiStatusCustomEmojis>

    /**
     * Returns the list of supported time zones.
     */
    public abstract suspend fun getTimeZones(): TdlResult<TimeZones>

    /**
     * Returns a list of frequently used chats.
     *
     * @param category Category of chats to be returned.
     * @param limit The maximum number of chats to be returned; up to 30.
     */
    public abstract suspend fun getTopChats(category: TopChatCategory, limit: Int): TdlResult<Chats>

    /**
     * Returns a list of trending sticker sets. For optimal performance, the number of returned sticker sets is chosen by TDLib.
     *
     * @param stickerType Type of the sticker sets to return.
     * @param offset The offset from which to return the sticker sets; must be non-negative.
     * @param limit The maximum number of sticker sets to be returned; up to 100. For optimal performance, the number of returned sticker sets is chosen by TDLib and can be smaller than the specified limit, even if the end of the list has not been reached.
     */
    public abstract suspend fun getTrendingStickerSets(
        stickerType: StickerType,
        offset: Int,
        limit: Int,
    ): TdlResult<TrendingStickerSets>

    /**
     * Returns information about an upgraded gift by its name.
     *
     * @param name Unique name of the upgraded gift.
     */
    public abstract suspend fun getUpgradedGift(name: String): TdlResult<UpgradedGift>

    /**
     * Returns available upgraded gift emoji statuses for self status.
     */
    public abstract suspend fun getUpgradedGiftEmojiStatuses(): TdlResult<EmojiStatuses>

    /**
     * Returns a URL for upgraded gift withdrawal in the TON blockchain as an NFT; requires owner privileges for gifts owned by a chat.
     *
     * @param receivedGiftId Identifier of the gift.
     * @param password The 2-step verification password of the current user.
     */
    public abstract suspend fun getUpgradedGiftWithdrawalUrl(receivedGiftId: String, password: String): TdlResult<HttpUrl>

    /**
     * Returns information about a user by their identifier. This is an offline method if the current user is not a bot.
     *
     * @param userId User identifier.
     */
    public abstract suspend fun getUser(userId: Long): TdlResult<User>

    /**
     * Returns the list of boosts applied to a chat by a given user; requires administrator rights in the chat; for bots only.
     *
     * @param chatId Identifier of the chat.
     * @param userId Identifier of the user.
     */
    public abstract suspend fun getUserChatBoosts(chatId: Long, userId: Long): TdlResult<FoundChatBoosts>

    /**
     * Returns full information about a user by their identifier.
     *
     * @param userId User identifier.
     */
    public abstract suspend fun getUserFullInfo(userId: Long): TdlResult<UserFullInfo>

    /**
     * Returns an HTTPS link, which can be used to get information about the current user.
     */
    public abstract suspend fun getUserLink(): TdlResult<UserLink>

    /**
     * Returns the current privacy settings.
     *
     * @param setting The privacy setting.
     */
    public abstract suspend fun getUserPrivacySettingRules(setting: UserPrivacySetting): TdlResult<UserPrivacySettingRules>

    /**
     * Returns the profile photos of a user. Personal and public photo aren't returned.
     *
     * @param userId User identifier.
     * @param offset The number of photos to skip; must be non-negative.
     * @param limit The maximum number of photos to be returned; up to 100.
     */
    public abstract suspend fun getUserProfilePhotos(
        userId: Long,
        offset: Int,
        limit: Int,
    ): TdlResult<ChatPhotos>

    /**
     * Returns support information for the given user; for Telegram support only.
     *
     * @param userId User identifier.
     */
    public abstract suspend fun getUserSupportInfo(userId: Long): TdlResult<UserSupportInfo>

    /**
     * Returns the list of participant identifiers, on whose behalf a video chat in the chat can be joined.
     *
     * @param chatId Chat identifier.
     */
    public abstract suspend fun getVideoChatAvailableParticipants(chatId: Long): TdlResult<MessageSenders>

    /**
     * Returns invite link to a video chat in a public chat.
     *
     * @param groupCallId Group call identifier.
     * @param canSelfUnmute Pass true if the invite link needs to contain an invite hash, passing which to joinVideoChat would allow the invited user to unmute themselves. Requires groupCall.canBeManaged right.
     */
    public abstract suspend fun getVideoChatInviteLink(groupCallId: Int, canSelfUnmute: Boolean): TdlResult<HttpUrl>

    /**
     * Returns RTMP URL for streaming to the video chat of a chat; requires canManageVideoChats administrator right.
     *
     * @param chatId Chat identifier.
     */
    public abstract suspend fun getVideoChatRtmpUrl(chatId: Long): TdlResult<RtmpUrl>

    /**
     * Returns a file with a segment of a video chat stream in a modified OGG format for audio or MPEG-4 format for video.
     *
     * @param groupCallId Group call identifier.
     * @param timeOffset Point in time when the stream segment begins; Unix timestamp in milliseconds.
     * @param scale Segment duration scale; 0-1. Segment's duration is 1000/(2**scale) milliseconds.
     * @param channelId Identifier of an audio/video channel to get as received from tgcalls.
     * @param videoQuality Video quality as received from tgcalls; pass null to get the worst available quality.
     */
    public abstract suspend fun getVideoChatStreamSegment(
        groupCallId: Int,
        timeOffset: Long,
        scale: Int,
        channelId: Int,
        videoQuality: GroupCallVideoQuality? = null,
    ): TdlResult<Data>

    /**
     * Returns information about available video chat streams.
     *
     * @param groupCallId Group call identifier.
     */
    public abstract suspend fun getVideoChatStreams(groupCallId: Int): TdlResult<VideoChatStreams>

    /**
     * Returns an HTTPS URL of a Web App to open after a link of the type internalLinkTypeWebApp is clicked.
     *
     * @param chatId Identifier of the chat in which the link was clicked; pass 0 if none.
     * @param botUserId Identifier of the target bot.
     * @param webAppShortName Short name of the Web App.
     * @param startParameter Start parameter from internalLinkTypeWebApp.
     * @param allowWriteAccess Pass true if the current user allowed the bot to send them messages.
     * @param parameters Parameters to use to open the Web App.
     */
    public abstract suspend fun getWebAppLinkUrl(
        chatId: Long,
        botUserId: Long,
        webAppShortName: String,
        startParameter: String,
        allowWriteAccess: Boolean,
        parameters: WebAppOpenParameters,
    ): TdlResult<HttpUrl>

    /**
     * Returns a default placeholder for Web Apps of a bot. This is an offline method. Returns a 404 error if the placeholder isn't known.
     *
     * @param botUserId Identifier of the target bot.
     */
    public abstract suspend fun getWebAppPlaceholder(botUserId: Long): TdlResult<Outline>

    /**
     * Returns an HTTPS URL of a Web App to open from the side menu, a keyboardButtonTypeWebApp button, or an inlineQueryResultsButtonTypeWebApp button.
     *
     * @param botUserId Identifier of the target bot. If the bot is restricted for the current user, then show an error instead of calling the method.
     * @param url The URL from a keyboardButtonTypeWebApp button, inlineQueryResultsButtonTypeWebApp button, or an empty string when the bot is opened from the side menu.
     * @param parameters Parameters to use to open the Web App.
     */
    public abstract suspend fun getWebAppUrl(
        botUserId: Long,
        url: String,
        parameters: WebAppOpenParameters,
    ): TdlResult<HttpUrl>

    /**
     * Returns an instant view version of a web page if available. This is an offline method if onlyLocal is true. Returns a 404 error if the web page has no instant view page.
     *
     * @param url The web page URL.
     * @param onlyLocal Pass true to get only locally available information without sending network requests.
     */
    public abstract suspend fun getWebPageInstantView(url: String, onlyLocal: Boolean): TdlResult<WebPageInstantView>

    /**
     * Allows to buy a Telegram Premium subscription for another user with payment in Telegram Stars; for bots only.
     *
     * @param userId Identifier of the user which will receive Telegram Premium.
     * @param starCount The number of Telegram Stars to pay for subscription.
     * @param monthCount Number of months the Telegram Premium subscription will be active for the user.
     * @param text Text to show to the user receiving Telegram Premium; 0-getOption(&quot;gift_text_length_max&quot;) characters. Only Bold, Italic, Underline, Strikethrough, Spoiler, and CustomEmoji entities are allowed.
     */
    public abstract suspend fun giftPremiumWithStars(
        userId: Long,
        starCount: Long,
        monthCount: Int,
        text: FormattedText,
    ): TdlResult<Ok>

    /**
     * Hides the list of contacts that have close birthdays for 24 hours.
     */
    public abstract suspend fun hideContactCloseBirthdays(): TdlResult<Ok>

    /**
     * Hides a suggested action.
     *
     * @param action Suggested action to hide.
     */
    public abstract suspend fun hideSuggestedAction(action: SuggestedAction): TdlResult<Ok>

    /**
     * Adds new contacts or edits existing contacts by their phone numbers; contacts' user identifiers are ignored.
     *
     * @param contacts The list of contacts to import or edit; contacts' vCard are ignored and are not imported.
     */
    public abstract suspend fun importContacts(contacts: Array<Contact>): TdlResult<ImportedContacts>

    /**
     * Imports messages exported from another app.
     *
     * @param chatId Identifier of a chat to which the messages will be imported. It must be an identifier of a private chat with a mutual contact or an identifier of a supergroup chat with canChangeInfo member right.
     * @param messageFile File with messages to import. Only inputFileLocal and inputFileGenerated are supported. The file must not be previously uploaded.
     * @param attachedFiles Files used in the imported messages. Only inputFileLocal and inputFileGenerated are supported. The files must not be previously uploaded.
     */
    public abstract suspend fun importMessages(
        chatId: Long,
        messageFile: InputFile,
        attachedFiles: Array<InputFile>,
    ): TdlResult<Ok>

    /**
     * Invites a user to an active group call; for group calls not bound to a chat only. Sends a service message of the type messageGroupCall. The group call can have at most getOption(&quot;group_call_participant_count_max&quot;) participants.
     *
     * @param groupCallId Group call identifier.
     * @param userId User identifier.
     * @param isVideo Pass true if the group call is a video call.
     */
    public abstract suspend fun inviteGroupCallParticipant(
        groupCallId: Int,
        userId: Long,
        isVideo: Boolean,
    ): TdlResult<InviteGroupCallParticipantResult>

    /**
     * Invites users to an active video chat. Sends a service message of the type messageInviteVideoChatParticipants to the chat bound to the group call.
     *
     * @param groupCallId Group call identifier.
     * @param userIds User identifiers. At most 10 users can be invited simultaneously.
     */
    public abstract suspend fun inviteVideoChatParticipants(groupCallId: Int, userIds: LongArray): TdlResult<Ok>

    /**
     * Adds the current user as a new member to a chat. Private and secret chats can't be joined using this method. May return an error with a message &quot;INVITE_REQUEST_SENT&quot; if only a join request was created.
     *
     * @param chatId Chat identifier.
     */
    public abstract suspend fun joinChat(chatId: Long): TdlResult<Ok>

    /**
     * Uses an invite link to add the current user to the chat if possible. May return an error with a message &quot;INVITE_REQUEST_SENT&quot; if only a join request was created.
     *
     * @param inviteLink Invite link to use.
     */
    public abstract suspend fun joinChatByInviteLink(inviteLink: String): TdlResult<Chat>

    /**
     * Joins a group call that is not bound to a chat.
     *
     * @param inputGroupCall The group call to join.
     * @param joinParameters Parameters to join the call.
     */
    public abstract suspend fun joinGroupCall(inputGroupCall: InputGroupCall, joinParameters: GroupCallJoinParameters): TdlResult<GroupCallInfo>

    /**
     * Joins an active video chat. Returns join response payload for tgcalls.
     *
     * @param groupCallId Group call identifier.
     * @param participantId Identifier of a group call participant, which will be used to join the call; pass null to join as self; video chats only.
     * @param joinParameters Parameters to join the call.
     * @param inviteHash Invite hash as received from internalLinkTypeVideoChat.
     */
    public abstract suspend fun joinVideoChat(
        groupCallId: Int,
        participantId: MessageSender? = null,
        joinParameters: GroupCallJoinParameters,
        inviteHash: String,
    ): TdlResult<Text>

    /**
     * Launches a prepaid giveaway.
     *
     * @param giveawayId Unique identifier of the prepaid giveaway.
     * @param parameters Giveaway parameters.
     * @param winnerCount The number of users to receive giveaway prize.
     * @param starCount The number of Telegram Stars to be distributed through the giveaway; pass 0 for Telegram Premium giveaways.
     */
    public abstract suspend fun launchPrepaidGiveaway(
        giveawayId: Long,
        parameters: GiveawayParameters,
        winnerCount: Int,
        starCount: Long,
    ): TdlResult<Ok>

    /**
     * Removes the current user from chat members. Private and secret chats can't be left using this method.
     *
     * @param chatId Chat identifier.
     */
    public abstract suspend fun leaveChat(chatId: Long): TdlResult<Ok>

    /**
     * Leaves a group call.
     *
     * @param groupCallId Group call identifier.
     */
    public abstract suspend fun leaveGroupCall(groupCallId: Int): TdlResult<Ok>

    /**
     * Loads more active stories from a story list. The loaded stories will be sent through updates. Active stories are sorted by the pair (activeStories.order, activeStories.storyPosterChatId) in descending order. Returns a 404 error if all active stories have been loaded.
     *
     * @param storyList The story list in which to load active stories.
     */
    public abstract suspend fun loadActiveStories(storyList: StoryList): TdlResult<Ok>

    /**
     * Loads more chats from a chat list. The loaded chats and their positions in the chat list will be sent through updates. Chats are sorted by the pair (chat.position.order, chat.id) in descending order. Returns a 404 error if all chats have been loaded.
     *
     * @param chatList The chat list in which to load chats; pass null to load chats from the main chat list.
     * @param limit The maximum number of chats to be loaded. For optimal performance, the number of loaded chats is chosen by TDLib and can be smaller than the specified limit, even if the end of the list is not reached.
     */
    public abstract suspend fun loadChats(chatList: ChatList? = null, limit: Int): TdlResult<Ok>

    /**
     * Loads more topics in a channel direct messages chat administered by the current user. The loaded topics will be sent through updateDirectMessagesChatTopic. Topics are sorted by their topic.order in descending order. Returns a 404 error if all topics have been loaded.
     *
     * @param chatId Chat identifier of the channel direct messages chat.
     * @param limit The maximum number of topics to be loaded. For optimal performance, the number of loaded topics is chosen by TDLib and can be smaller than the specified limit, even if the end of the list is not reached.
     */
    public abstract suspend fun loadDirectMessagesChatTopics(chatId: Long, limit: Int): TdlResult<Ok>

    /**
     * Loads more participants of a group call. The loaded participants will be received through updates. Use the field groupCall.loadedAllParticipants to check whether all participants have already been loaded.
     *
     * @param groupCallId Group call identifier. The group call must be previously received through getGroupCall and must be joined or being joined.
     * @param limit The maximum number of participants to load; up to 100.
     */
    public abstract suspend fun loadGroupCallParticipants(groupCallId: Int, limit: Int): TdlResult<Ok>

    /**
     * Loads quick reply messages that can be sent by a given quick reply shortcut. The loaded messages will be sent through updateQuickReplyShortcutMessages.
     *
     * @param shortcutId Unique identifier of the quick reply shortcut.
     */
    public abstract suspend fun loadQuickReplyShortcutMessages(shortcutId: Int): TdlResult<Ok>

    /**
     * Loads quick reply shortcuts created by the current user. The loaded data will be sent through updateQuickReplyShortcut and updateQuickReplyShortcuts.
     */
    public abstract suspend fun loadQuickReplyShortcuts(): TdlResult<Ok>

    /**
     * Loads more Saved Messages topics. The loaded topics will be sent through updateSavedMessagesTopic. Topics are sorted by their topic.order in descending order. Returns a 404 error if all topics have been loaded.
     *
     * @param limit The maximum number of topics to be loaded. For optimal performance, the number of loaded topics is chosen by TDLib and can be smaller than the specified limit, even if the end of the list is not reached.
     */
    public abstract suspend fun loadSavedMessagesTopics(limit: Int): TdlResult<Ok>

    /**
     * Closes the TDLib instance after a proper logout. Requires an available network connection. All local data will be destroyed. After the logout completes, updateAuthorizationState with authorizationStateClosed will be sent.
     */
    public abstract suspend fun logOut(): TdlResult<Ok>

    /**
     * Informs TDLib that a bot was opened from the list of similar bots.
     *
     * @param botUserId Identifier of the original bot, which similar bots were requested.
     * @param openedBotUserId Identifier of the opened bot.
     */
    public abstract suspend fun openBotSimilarBot(botUserId: Long, openedBotUserId: Long): TdlResult<Ok>

    /**
     * Informs TDLib that the chat is opened by the user. Many useful activities depend on the chat being opened or closed (e.g., in supergroups and channels all updates are received only for opened chats).
     *
     * @param chatId Chat identifier.
     */
    public abstract suspend fun openChat(chatId: Long): TdlResult<Ok>

    /**
     * Informs TDLib that a chat was opened from the list of similar chats. The method is independent of openChat and closeChat methods.
     *
     * @param chatId Identifier of the original chat, which similar chats were requested.
     * @param openedChatId Identifier of the opened chat.
     */
    public abstract suspend fun openChatSimilarChat(chatId: Long, openedChatId: Long): TdlResult<Ok>

    /**
     * Informs TDLib that the message content has been opened (e.g., the user has opened a photo, video, document, location or venue, or has listened to an audio file or voice note message). An updateMessageContentOpened update will be generated if something has changed.
     *
     * @param chatId Chat identifier of the message.
     * @param messageId Identifier of the message with the opened content.
     */
    public abstract suspend fun openMessageContent(chatId: Long, messageId: Long): TdlResult<Ok>

    /**
     * Informs TDLib that the user opened a sponsored chat.
     *
     * @param sponsoredChatUniqueId Unique identifier of the sponsored chat.
     */
    public abstract suspend fun openSponsoredChat(sponsoredChatUniqueId: Long): TdlResult<Ok>

    /**
     * Informs TDLib that a story is opened and is being viewed by the user.
     *
     * @param storyPosterChatId The identifier of the chat that posted the opened story.
     * @param storyId The identifier of the story.
     */
    public abstract suspend fun openStory(storyPosterChatId: Long, storyId: Int): TdlResult<Ok>

    /**
     * Informs TDLib that a Web App is being opened from the attachment menu, a botMenuButton button, an internalLinkTypeAttachmentMenuBot link, or an inlineKeyboardButtonTypeWebApp button. For each bot, a confirmation alert about data sent to the bot must be shown once.
     *
     * @param chatId Identifier of the chat in which the Web App is opened. The Web App can't be opened in secret chats.
     * @param botUserId Identifier of the bot, providing the Web App. If the bot is restricted for the current user, then show an error instead of calling the method.
     * @param url The URL from an inlineKeyboardButtonTypeWebApp button, a botMenuButton button, an internalLinkTypeAttachmentMenuBot link, or an empty string otherwise.
     * @param messageThreadId If not 0, the message thread identifier to which the message will be sent.
     * @param directMessagesChatTopicId If not 0, unique identifier of the topic of channel direct messages chat to which the message will be sent.
     * @param replyTo Information about the message or story to be replied in the message sent by the Web App; pass null if none.
     * @param parameters Parameters to use to open the Web App.
     */
    public abstract suspend fun openWebApp(
        chatId: Long,
        botUserId: Long,
        url: String,
        messageThreadId: Long,
        directMessagesChatTopicId: Long,
        replyTo: InputMessageReplyTo? = null,
        parameters: WebAppOpenParameters,
    ): TdlResult<WebAppInfo>

    /**
     * Optimizes storage usage, i.e. deletes some files and returns new storage usage statistics. Secret thumbnails can't be deleted.
     *
     * @param size Limit on the total size of files after deletion, in bytes. Pass -1 to use the default limit.
     * @param ttl Limit on the time that has passed since the last time a file was accessed (or creation time for some filesystems). Pass -1 to use the default limit.
     * @param count Limit on the total number of files after deletion. Pass -1 to use the default limit.
     * @param immunityDelay The amount of time after the creation of a file during which it can't be deleted, in seconds. Pass -1 to use the default value.
     * @param fileTypes If non-empty, only files with the given types are considered. By default, all types except thumbnails, profile photos, stickers and wallpapers are deleted.
     * @param chatIds If non-empty, only files from the given chats are considered. Use 0 as chat identifier to delete files not belonging to any chat (e.g., profile photos).
     * @param excludeChatIds If non-empty, files from the given chats are excluded. Use 0 as chat identifier to exclude all files not belonging to any chat (e.g., profile photos).
     * @param returnDeletedFileStatistics Pass true if statistics about the files that were deleted must be returned instead of the whole storage usage statistics. Affects only returned statistics.
     * @param chatLimit Same as in getStorageStatistics. Affects only returned statistics.
     */
    public abstract suspend fun optimizeStorage(
        size: Long,
        ttl: Int,
        count: Int,
        immunityDelay: Int,
        fileTypes: Array<FileType>,
        chatIds: LongArray,
        excludeChatIds: LongArray,
        returnDeletedFileStatistics: Boolean,
        chatLimit: Int,
    ): TdlResult<StorageStatistics>

    /**
     * Parses Markdown entities in a human-friendly format, ignoring markup errors. Can be called synchronously.
     *
     * @param text The text to parse. For example, &quot;__italic__ ~~strikethrough~~ ||spoiler|| **bold** `code` ```pre``` __[italic__ textUrl](telegram.org) __italic**bold italic__bold**&quot;.
     */
    public abstract suspend fun parseMarkdown(text: FormattedText): TdlResult<FormattedText>

    /**
     * Parses Bold, Italic, Underline, Strikethrough, Spoiler, CustomEmoji, BlockQuote, ExpandableBlockQuote, Code, Pre, PreCode, TextUrl and MentionName entities from a marked-up text. Can be called synchronously.
     *
     * @param text The text to parse.
     * @param parseMode Text parse mode.
     */
    public abstract suspend fun parseTextEntities(text: String, parseMode: TextParseMode): TdlResult<FormattedText>

    /**
     * Pins a message in a chat. A message can be pinned only if messageProperties.canBePinned.
     *
     * @param chatId Identifier of the chat.
     * @param messageId Identifier of the new pinned message.
     * @param disableNotification Pass true to disable notification about the pinned message. Notifications are always disabled in channels and private chats.
     * @param onlyForSelf Pass true to pin the message only for self; private chats only.
     */
    public abstract suspend fun pinChatMessage(
        chatId: Long,
        messageId: Long,
        disableNotification: Boolean,
        onlyForSelf: Boolean,
    ): TdlResult<Ok>

    /**
     * Computes time needed to receive a response from a Telegram server through a proxy. Can be called before authorization.
     *
     * @param proxyId Proxy identifier. Use 0 to ping a Telegram server without a proxy.
     */
    public abstract suspend fun pingProxy(proxyId: Int): TdlResult<Seconds>

    /**
     * Posts a new story on behalf of a chat; requires canPostStories right for supergroup and channel chats. Returns a temporary story.
     *
     * @param chatId Identifier of the chat that will post the story. Pass Saved Messages chat identifier when posting a story on behalf of the current user.
     * @param content Content of the story.
     * @param areas Clickable rectangle areas to be shown on the story media; pass null if none.
     * @param caption Story caption; pass null to use an empty caption; 0-getOption(&quot;story_caption_length_max&quot;) characters; can have entities only if getOption(&quot;can_use_text_entities_in_story_caption&quot;).
     * @param privacySettings The privacy settings for the story; ignored for stories posted on behalf of supergroup and channel chats.
     * @param activePeriod Period after which the story is moved to archive, in seconds; must be one of 6 * 3600, 12 * 3600, 86400, or 2 * 86400 for Telegram Premium users, and 86400 otherwise.
     * @param fromStoryFullId Full identifier of the original story, which content was used to create the story; pass null if the story isn't repost of another story.
     * @param isPostedToChatPage Pass true to keep the story accessible after expiration.
     * @param protectContent Pass true if the content of the story must be protected from forwarding and screenshotting.
     */
    public abstract suspend fun postStory(
        chatId: Long,
        content: InputStoryContent,
        areas: InputStoryAreas? = null,
        caption: FormattedText? = null,
        privacySettings: StoryPrivacySettings,
        activePeriod: Int,
        fromStoryFullId: StoryFullId? = null,
        isPostedToChatPage: Boolean,
        protectContent: Boolean,
    ): TdlResult<Story>

    /**
     * Preliminary uploads a file to the cloud before sending it in a message, which can be useful for uploading of being recorded voice and video notes. In all other cases there is no need to preliminary upload a file. Updates updateFile will be used to notify about upload progress. The upload will not be completed until the file is sent in a message.
     *
     * @param file File to upload.
     * @param fileType File type; pass null if unknown.
     * @param priority Priority of the upload (1-32). The higher the priority, the earlier the file will be uploaded. If the priorities of two files are equal, then the first one for which preliminaryUploadFile was called will be uploaded first.
     */
    public abstract suspend fun preliminaryUploadFile(
        file: InputFile,
        fileType: FileType? = null,
        priority: Int,
    ): TdlResult<File>

    /**
     * Process new chats added to a shareable chat folder by its owner.
     *
     * @param chatFolderId Chat folder identifier.
     * @param addedChatIds Identifiers of the new chats, which are added to the chat folder. The chats are automatically joined if they aren't joined yet.
     */
    public abstract suspend fun processChatFolderNewChats(chatFolderId: Int, addedChatIds: LongArray): TdlResult<Ok>

    /**
     * Handles a pending join request in a chat.
     *
     * @param chatId Chat identifier.
     * @param userId Identifier of the user that sent the request.
     * @param approve Pass true to approve the request; pass false to decline it.
     */
    public abstract suspend fun processChatJoinRequest(
        chatId: Long,
        userId: Long,
        approve: Boolean,
    ): TdlResult<Ok>

    /**
     * Handles all pending join requests for a given link in a chat.
     *
     * @param chatId Chat identifier.
     * @param inviteLink Invite link for which to process join requests. If empty, all join requests will be processed. Requires administrator privileges and canInviteUsers right in the chat for own links and owner privileges for other links.
     * @param approve Pass true to approve all requests; pass false to decline them.
     */
    public abstract suspend fun processChatJoinRequests(
        chatId: Long,
        inviteLink: String,
        approve: Boolean,
    ): TdlResult<Ok>

    /**
     * Handles a push notification. Returns error with code 406 if the push notification is not supported and connection to the server is required to fetch new data. Can be called before authorization.
     *
     * @param payload JSON-encoded push notification payload with all fields sent by the server, and &quot;google.sentTime&quot; and &quot;google.notification.sound&quot; fields added.
     */
    public abstract suspend fun processPushNotification(payload: String): TdlResult<Ok>

    /**
     * Rates recognized speech in a video note or a voice note message.
     *
     * @param chatId Identifier of the chat to which the message belongs.
     * @param messageId Identifier of the message.
     * @param isGood Pass true if the speech recognition is good.
     */
    public abstract suspend fun rateSpeechRecognition(
        chatId: Long,
        messageId: Long,
        isGood: Boolean,
    ): TdlResult<Ok>

    /**
     * Marks all mentions in a chat as read.
     *
     * @param chatId Chat identifier.
     */
    public abstract suspend fun readAllChatMentions(chatId: Long): TdlResult<Ok>

    /**
     * Marks all reactions in a chat or a forum topic as read.
     *
     * @param chatId Chat identifier.
     */
    public abstract suspend fun readAllChatReactions(chatId: Long): TdlResult<Ok>

    /**
     * Removes all unread reactions in the topic in a channel direct messages chat administered by the current user.
     *
     * @param chatId Identifier of the chat.
     * @param topicId Topic identifier.
     */
    public abstract suspend fun readAllDirectMessagesChatTopicReactions(chatId: Long, topicId: Long): TdlResult<Ok>

    /**
     * Marks all mentions in a forum topic as read.
     *
     * @param chatId Chat identifier.
     * @param messageThreadId Message thread identifier in which mentions are marked as read.
     */
    public abstract suspend fun readAllMessageThreadMentions(chatId: Long, messageThreadId: Long): TdlResult<Ok>

    /**
     * Marks all reactions in a forum topic as read.
     *
     * @param chatId Chat identifier.
     * @param messageThreadId Message thread identifier in which reactions are marked as read.
     */
    public abstract suspend fun readAllMessageThreadReactions(chatId: Long, messageThreadId: Long): TdlResult<Ok>

    /**
     * Reads a message on behalf of a business account; for bots only.
     *
     * @param businessConnectionId Unique identifier of business connection through which the message was received.
     * @param chatId The chat the message belongs to.
     * @param messageId Identifier of the message.
     */
    public abstract suspend fun readBusinessMessage(
        businessConnectionId: String,
        chatId: Long,
        messageId: Long,
    ): TdlResult<Ok>

    /**
     * Traverse all chats in a chat list and marks all messages in the chats as read.
     *
     * @param chatList Chat list in which to mark all chats as read.
     */
    public abstract suspend fun readChatList(chatList: ChatList): TdlResult<Ok>

    /**
     * Reads a part of a file from the TDLib file cache and returns read bytes. This method is intended to be used only if the application has no direct access to TDLib's file system, because it is usually slower than a direct read from the file.
     *
     * @param fileId Identifier of the file. The file must be located in the TDLib file cache.
     * @param offset The offset from which to read the file.
     * @param count Number of bytes to read. An error will be returned if there are not enough bytes available in the file from the specified position. Pass 0 to read all available data from the specified position.
     */
    public abstract suspend fun readFilePart(
        fileId: Int,
        offset: Long,
        count: Long,
    ): TdlResult<Data>

    /**
     * Readds quick reply messages which failed to add. Can be called only for messages for which messageSendingStateFailed.canRetry is true and after specified in messageSendingStateFailed.retryAfter time passed. If a message is readded, the corresponding failed to send message is deleted. Returns the sent messages in the same order as the message identifiers passed in messageIds. If a message can't be readded, null will be returned instead of the message.
     *
     * @param shortcutName Name of the target shortcut.
     * @param messageIds Identifiers of the quick reply messages to readd. Message identifiers must be in a strictly increasing order.
     */
    public abstract suspend fun readdQuickReplyShortcutMessages(shortcutName: String, messageIds: LongArray): TdlResult<QuickReplyMessages>

    /**
     * Recognizes speech in a video note or a voice note message.
     *
     * @param chatId Identifier of the chat to which the message belongs.
     * @param messageId Identifier of the message. Use messageProperties.canRecognizeSpeech to check whether the message is suitable.
     */
    public abstract suspend fun recognizeSpeech(chatId: Long, messageId: Long): TdlResult<Ok>

    /**
     * Recovers the 2-step verification password with a password recovery code sent to an email address that was previously set up. Works only when the current authorization state is authorizationStateWaitPassword.
     *
     * @param recoveryCode Recovery code to check.
     * @param newPassword New 2-step verification password of the user; may be empty to remove the password.
     * @param newHint New password hint; may be empty.
     */
    public abstract suspend fun recoverAuthenticationPassword(
        recoveryCode: String,
        newPassword: String,
        newHint: String,
    ): TdlResult<Ok>

    /**
     * Recovers the 2-step verification password using a recovery code sent to an email address that was previously set up.
     *
     * @param recoveryCode Recovery code to check.
     * @param newPassword New 2-step verification password of the user; may be empty to remove the password.
     * @param newHint New password hint; may be empty.
     */
    public abstract suspend fun recoverPassword(
        recoveryCode: String,
        newPassword: String,
        newHint: String,
    ): TdlResult<PasswordState>

    /**
     * Refunds a previously done payment in Telegram Stars; for bots only.
     *
     * @param userId Identifier of the user that did the payment.
     * @param telegramPaymentChargeId Telegram payment identifier.
     */
    public abstract suspend fun refundStarPayment(userId: Long, telegramPaymentChargeId: String): TdlResult<Ok>

    /**
     * Registers the currently used device for receiving push notifications. Returns a globally unique identifier of the push notification subscription.
     *
     * @param deviceToken Device token.
     * @param otherUserIds List of user identifiers of other users currently using the application.
     */
    public abstract suspend fun registerDevice(deviceToken: DeviceToken, otherUserIds: LongArray): TdlResult<PushReceiverId>

    /**
     * Finishes user registration. Works only when the current authorization state is authorizationStateWaitRegistration.
     *
     * @param firstName The first name of the user; 1-64 characters.
     * @param lastName The last name of the user; 0-64 characters.
     * @param disableNotification Pass true to disable notification about the current user joining Telegram for other users that added them to contact list.
     */
    public abstract suspend fun registerUser(
        firstName: String,
        lastName: String,
        disableNotification: Boolean,
    ): TdlResult<Ok>

    /**
     * Removes all files from the file download list.
     *
     * @param onlyActive Pass true to remove only active downloads, including paused.
     * @param onlyCompleted Pass true to remove only completed downloads.
     * @param deleteFromCache Pass true to delete the file from the TDLib file cache.
     */
    public abstract suspend fun removeAllFilesFromDownloads(
        onlyActive: Boolean,
        onlyCompleted: Boolean,
        deleteFromCache: Boolean,
    ): TdlResult<Ok>

    /**
     * Removes the connected business bot from a specific chat by adding the chat to businessRecipients.excludedChatIds.
     *
     * @param chatId Chat identifier.
     */
    public abstract suspend fun removeBusinessConnectedBotFromChat(chatId: Long): TdlResult<Ok>

    /**
     * Removes a chat action bar without any other action.
     *
     * @param chatId Chat identifier.
     */
    public abstract suspend fun removeChatActionBar(chatId: Long): TdlResult<Ok>

    /**
     * Removes users from the contact list.
     *
     * @param userIds Identifiers of users to be deleted.
     */
    public abstract suspend fun removeContacts(userIds: LongArray): TdlResult<Ok>

    /**
     * Removes a sticker from the list of favorite stickers.
     *
     * @param sticker Sticker file to delete from the list.
     */
    public abstract suspend fun removeFavoriteSticker(sticker: InputFile): TdlResult<Ok>

    /**
     * Removes a file from the file download list.
     *
     * @param fileId Identifier of the downloaded file.
     * @param deleteFromCache Pass true to delete the file from the TDLib file cache.
     */
    public abstract suspend fun removeFileFromDownloads(fileId: Int, deleteFromCache: Boolean): TdlResult<Ok>

    /**
     * Removes background from the list of installed backgrounds.
     *
     * @param backgroundId The background identifier.
     */
    public abstract suspend fun removeInstalledBackground(backgroundId: Long): TdlResult<Ok>

    /**
     * Removes a reaction from a message. A chosen reaction can always be removed.
     *
     * @param chatId Identifier of the chat to which the message belongs.
     * @param messageId Identifier of the message.
     * @param reactionType Type of the reaction to remove. The paid reaction can't be removed.
     */
    public abstract suspend fun removeMessageReaction(
        chatId: Long,
        messageId: Long,
        reactionType: ReactionType,
    ): TdlResult<Ok>

    /**
     * Removes the verification status of a user or a chat by an owned bot.
     *
     * @param botUserId Identifier of the owned bot, which verified the user or the chat.
     * @param verifiedId Identifier of the user or the supergroup or channel chat, which verification is removed.
     */
    public abstract suspend fun removeMessageSenderBotVerification(botUserId: Long, verifiedId: MessageSender): TdlResult<Ok>

    /**
     * Removes an active notification from notification list. Needs to be called only if the notification is removed by the current user.
     *
     * @param notificationGroupId Identifier of notification group to which the notification belongs.
     * @param notificationId Identifier of removed notification.
     */
    public abstract suspend fun removeNotification(notificationGroupId: Int, notificationId: Int): TdlResult<Ok>

    /**
     * Removes a group of active notifications. Needs to be called only if the notification group is removed by the current user.
     *
     * @param notificationGroupId Notification group identifier.
     * @param maxNotificationId The maximum identifier of removed notifications.
     */
    public abstract suspend fun removeNotificationGroup(notificationGroupId: Int, maxNotificationId: Int): TdlResult<Ok>

    /**
     * Removes all pending paid reactions on a message.
     *
     * @param chatId Identifier of the chat to which the message belongs.
     * @param messageId Identifier of the message.
     */
    public abstract suspend fun removePendingPaidMessageReactions(chatId: Long, messageId: Long): TdlResult<Ok>

    /**
     * Removes a proxy server. Can be called before authorization.
     *
     * @param proxyId Proxy identifier.
     */
    public abstract suspend fun removeProxy(proxyId: Int): TdlResult<Ok>

    /**
     * Removes a hashtag from the list of recently used hashtags.
     *
     * @param hashtag Hashtag to delete.
     */
    public abstract suspend fun removeRecentHashtag(hashtag: String): TdlResult<Ok>

    /**
     * Removes a sticker from the list of recently used stickers.
     *
     * @param isAttached Pass true to remove the sticker from the list of stickers recently attached to photo or video files; pass false to remove the sticker from the list of recently sent stickers.
     * @param sticker Sticker file to delete.
     */
    public abstract suspend fun removeRecentSticker(isAttached: Boolean, sticker: InputFile): TdlResult<Ok>

    /**
     * Removes a chat from the list of recently found chats.
     *
     * @param chatId Identifier of the chat to be removed.
     */
    public abstract suspend fun removeRecentlyFoundChat(chatId: Long): TdlResult<Ok>

    /**
     * Removes an animation from the list of saved animations.
     *
     * @param animation Animation file to be removed.
     */
    public abstract suspend fun removeSavedAnimation(animation: InputFile): TdlResult<Ok>

    /**
     * Removes a notification sound from the list of saved notification sounds.
     *
     * @param notificationSoundId Identifier of the notification sound.
     */
    public abstract suspend fun removeSavedNotificationSound(notificationSoundId: Long): TdlResult<Ok>

    /**
     * Removes a hashtag or a cashtag from the list of recently searched for hashtags or cashtags.
     *
     * @param tag Hashtag or cashtag to delete.
     */
    public abstract suspend fun removeSearchedForTag(tag: String): TdlResult<Ok>

    /**
     * Removes a sticker from the set to which it belongs. The sticker set must be owned by the current user.
     *
     * @param sticker Sticker to remove from the set.
     */
    public abstract suspend fun removeStickerFromSet(sticker: InputFile): TdlResult<Ok>

    /**
     * Removes a chat from the list of frequently used chats. Supported only if the chat info database is enabled.
     *
     * @param category Category of frequently used chats.
     * @param chatId Chat identifier.
     */
    public abstract suspend fun removeTopChat(category: TopChatCategory, chatId: Long): TdlResult<Ok>

    /**
     * Changes order of active usernames of the current user.
     *
     * @param usernames The new order of active usernames. All currently active usernames must be specified.
     */
    public abstract suspend fun reorderActiveUsernames(usernames: Array<String>): TdlResult<Ok>

    /**
     * Changes order of active usernames of a bot. Can be called only if userTypeBot.canBeEdited == true.
     *
     * @param botUserId Identifier of the target bot.
     * @param usernames The new order of active usernames. All currently active usernames must be specified.
     */
    public abstract suspend fun reorderBotActiveUsernames(botUserId: Long, usernames: Array<String>): TdlResult<Ok>

    /**
     * Changes order of media previews in the list of media previews of a bot.
     *
     * @param botUserId Identifier of the target bot. The bot must be owned and must have the main Web App.
     * @param languageCode Language code of the media previews to reorder.
     * @param fileIds File identifiers of the media in the new order.
     */
    public abstract suspend fun reorderBotMediaPreviews(
        botUserId: Long,
        languageCode: String,
        fileIds: IntArray,
    ): TdlResult<Ok>

    /**
     * Changes the order of chat folders.
     *
     * @param chatFolderIds Identifiers of chat folders in the new correct order.
     * @param mainChatListPosition Position of the main chat list among chat folders, 0-based. Can be non-zero only for Premium users.
     */
    public abstract suspend fun reorderChatFolders(chatFolderIds: IntArray, mainChatListPosition: Int): TdlResult<Ok>

    /**
     * Changes the order of installed sticker sets.
     *
     * @param stickerType Type of the sticker sets to reorder.
     * @param stickerSetIds Identifiers of installed sticker sets in the new correct order.
     */
    public abstract suspend fun reorderInstalledStickerSets(stickerType: StickerType, stickerSetIds: LongArray): TdlResult<Ok>

    /**
     * Changes the order of quick reply shortcuts.
     *
     * @param shortcutIds The new order of quick reply shortcuts.
     */
    public abstract suspend fun reorderQuickReplyShortcuts(shortcutIds: IntArray): TdlResult<Ok>

    /**
     * Changes order of active usernames of a supergroup or channel, requires owner privileges in the supergroup or channel.
     *
     * @param supergroupId Identifier of the supergroup or channel.
     * @param usernames The new order of active usernames. All currently active usernames must be specified.
     */
    public abstract suspend fun reorderSupergroupActiveUsernames(supergroupId: Long, usernames: Array<String>): TdlResult<Ok>

    /**
     * Replaces current primary invite link for a chat with a new primary invite link. Available for basic groups, supergroups, and channels. Requires administrator privileges and canInviteUsers right.
     *
     * @param chatId Chat identifier.
     */
    public abstract suspend fun replacePrimaryChatInviteLink(chatId: Long): TdlResult<ChatInviteLink>

    /**
     * Replaces existing sticker in a set. The function is equivalent to removeStickerFromSet, then addStickerToSet, then setStickerPositionInSet.
     *
     * @param userId Sticker set owner; ignored for regular users.
     * @param name Sticker set name. The sticker set must be owned by the current user.
     * @param oldSticker Sticker to remove from the set.
     * @param newSticker Sticker to add to the set.
     */
    public abstract suspend fun replaceStickerInSet(
        userId: Long,
        name: String,
        oldSticker: InputFile,
        newSticker: InputSticker,
    ): TdlResult<Ok>

    /**
     * Replaces the current RTMP URL for streaming to the video chat of a chat; requires owner privileges in the chat.
     *
     * @param chatId Chat identifier.
     */
    public abstract suspend fun replaceVideoChatRtmpUrl(chatId: Long): TdlResult<RtmpUrl>

    /**
     * Reports that authentication code wasn't delivered via SMS; for official mobile applications only. Works only when the current authorization state is authorizationStateWaitCode.
     *
     * @param mobileNetworkCode Current mobile network code.
     */
    public abstract suspend fun reportAuthenticationCodeMissing(mobileNetworkCode: String): TdlResult<Ok>

    /**
     * Reports a chat to the Telegram moderators. A chat can be reported only from the chat action bar, or if chat.canBeReported.
     *
     * @param chatId Chat identifier.
     * @param optionId Option identifier chosen by the user; leave empty for the initial request.
     * @param messageIds Identifiers of reported messages. Use messageProperties.canReportChat to check whether the message can be reported.
     * @param text Additional report details if asked by the server; 0-1024 characters; leave empty for the initial request.
     */
    public abstract suspend fun reportChat(
        chatId: Long,
        optionId: ByteArray,
        messageIds: LongArray,
        text: String,
    ): TdlResult<ReportChatResult>

    /**
     * Reports a chat photo to the Telegram moderators. A chat photo can be reported only if chat.canBeReported.
     *
     * @param chatId Chat identifier.
     * @param fileId Identifier of the photo to report. Only full photos from chatPhoto can be reported.
     * @param reason The reason for reporting the chat photo.
     * @param text Additional report details; 0-1024 characters.
     */
    public abstract suspend fun reportChatPhoto(
        chatId: Long,
        fileId: Int,
        reason: ReportReason,
        text: String,
    ): TdlResult<Ok>

    /**
     * Reports a sponsored message to Telegram moderators.
     *
     * @param chatId Chat identifier of the sponsored message.
     * @param messageId Identifier of the sponsored message.
     * @param optionId Option identifier chosen by the user; leave empty for the initial request.
     */
    public abstract suspend fun reportChatSponsoredMessage(
        chatId: Long,
        messageId: Long,
        optionId: ByteArray,
    ): TdlResult<ReportSponsoredResult>

    /**
     * Reports reactions set on a message to the Telegram moderators. Reactions on a message can be reported only if messageProperties.canReportReactions.
     *
     * @param chatId Chat identifier.
     * @param messageId Message identifier.
     * @param senderId Identifier of the sender, which added the reaction.
     */
    public abstract suspend fun reportMessageReactions(
        chatId: Long,
        messageId: Long,
        senderId: MessageSender,
    ): TdlResult<Ok>

    /**
     * Reports that authentication code wasn't delivered via SMS to the specified phone number; for official mobile applications only.
     *
     * @param mobileNetworkCode Current mobile network code.
     */
    public abstract suspend fun reportPhoneNumberCodeMissing(mobileNetworkCode: String): TdlResult<Ok>

    /**
     * Reports a sponsored chat to Telegram moderators.
     *
     * @param sponsoredChatUniqueId Unique identifier of the sponsored chat.
     * @param optionId Option identifier chosen by the user; leave empty for the initial request.
     */
    public abstract suspend fun reportSponsoredChat(sponsoredChatUniqueId: Long, optionId: ByteArray): TdlResult<ReportSponsoredResult>

    /**
     * Reports a story to the Telegram moderators.
     *
     * @param storyPosterChatId The identifier of the poster of the story to report.
     * @param storyId The identifier of the story to report.
     * @param optionId Option identifier chosen by the user; leave empty for the initial request.
     * @param text Additional report details; 0-1024 characters; leave empty for the initial request.
     */
    public abstract suspend fun reportStory(
        storyPosterChatId: Long,
        storyId: Int,
        optionId: ByteArray,
        text: String,
    ): TdlResult<ReportStoryResult>

    /**
     * Reports a false deletion of a message by aggressive anti-spam checks; requires administrator rights in the supergroup. Can be called only for messages from chatEventMessageDeleted with canReportAntiSpamFalsePositive == true.
     *
     * @param supergroupId Supergroup identifier.
     * @param messageId Identifier of the erroneously deleted message from chatEventMessageDeleted.
     */
    public abstract suspend fun reportSupergroupAntiSpamFalsePositive(supergroupId: Long, messageId: Long): TdlResult<Ok>

    /**
     * Reports messages in a supergroup as spam; requires administrator rights in the supergroup.
     *
     * @param supergroupId Supergroup identifier.
     * @param messageIds Identifiers of messages to report. Use messageProperties.canReportSupergroupSpam to check whether the message can be reported.
     */
    public abstract suspend fun reportSupergroupSpam(supergroupId: Long, messageIds: LongArray): TdlResult<Ok>

    /**
     * Requests to send a 2-step verification password recovery code to an email address that was previously set up. Works only when the current authorization state is authorizationStateWaitPassword.
     */
    public abstract suspend fun requestAuthenticationPasswordRecovery(): TdlResult<Ok>

    /**
     * Requests to send a 2-step verification password recovery code to an email address that was previously set up.
     */
    public abstract suspend fun requestPasswordRecovery(): TdlResult<EmailAddressAuthenticationCodeInfo>

    /**
     * Requests QR code authentication by scanning a QR code on another logged in device. Works only when the current authorization state is authorizationStateWaitPhoneNumber, or if there is no pending authentication query and the current authorization state is authorizationStateWaitPremiumPurchase, authorizationStateWaitEmailAddress, authorizationStateWaitEmailCode, authorizationStateWaitCode, authorizationStateWaitRegistration, or authorizationStateWaitPassword.
     *
     * @param otherUserIds List of user identifiers of other users currently using the application.
     */
    public abstract suspend fun requestQrCodeAuthentication(otherUserIds: LongArray): TdlResult<Ok>

    /**
     * Resends an authentication code to the user. Works only when the current authorization state is authorizationStateWaitCode, the nextCodeType of the result is not null and the server-specified timeout has passed, or when the current authorization state is authorizationStateWaitEmailCode.
     *
     * @param reason Reason of code resending; pass null if unknown.
     */
    public abstract suspend fun resendAuthenticationCode(reason: ResendCodeReason? = null): TdlResult<Ok>

    /**
     * Resends the code to verify an email address to be added to a user's Telegram Passport.
     */
    public abstract suspend fun resendEmailAddressVerificationCode(): TdlResult<EmailAddressAuthenticationCodeInfo>

    /**
     * Resends the login email address verification code.
     */
    public abstract suspend fun resendLoginEmailAddressCode(): TdlResult<EmailAddressAuthenticationCodeInfo>

    /**
     * Resends messages which failed to send. Can be called only for messages for which messageSendingStateFailed.canRetry is true and after specified in messageSendingStateFailed.retryAfter time passed. If a message is re-sent, the corresponding failed to send message is deleted. Returns the sent messages in the same order as the message identifiers passed in messageIds. If a message can't be re-sent, null will be returned instead of the message.
     *
     * @param chatId Identifier of the chat to send messages.
     * @param messageIds Identifiers of the messages to resend. Message identifiers must be in a strictly increasing order.
     * @param quote New manually chosen quote from the message to be replied; pass null if none. Ignored if more than one message is re-sent, or if messageSendingStateFailed.needAnotherReplyQuote == false.
     * @param paidMessageStarCount The number of Telegram Stars the user agreed to pay to send the messages. Ignored if messageSendingStateFailed.requiredPaidMessageStarCount == 0.
     */
    public abstract suspend fun resendMessages(
        chatId: Long,
        messageIds: LongArray,
        quote: InputTextQuote? = null,
        paidMessageStarCount: Long,
    ): TdlResult<Messages>

    /**
     * Resends the authentication code sent to a phone number. Works only if the previously received authenticationCodeInfo nextCodeType was not null and the server-specified timeout has passed.
     *
     * @param reason Reason of code resending; pass null if unknown.
     */
    public abstract suspend fun resendPhoneNumberCode(reason: ResendCodeReason? = null): TdlResult<AuthenticationCodeInfo>

    /**
     * Resends the 2-step verification recovery email address verification code.
     */
    public abstract suspend fun resendRecoveryEmailAddressCode(): TdlResult<PasswordState>

    /**
     * Resets all chat and scope notification settings to their default values. By default, all chats are unmuted and message previews are shown.
     */
    public abstract suspend fun resetAllNotificationSettings(): TdlResult<Ok>

    /**
     * Resets the login email address. May return an error with a message &quot;TASK_ALREADY_EXISTS&quot; if reset is still pending. Works only when the current authorization state is authorizationStateWaitEmailCode and authorizationState.canResetEmailAddress == true.
     */
    public abstract suspend fun resetAuthenticationEmailAddress(): TdlResult<Ok>

    /**
     * Resets list of installed backgrounds to its default value.
     */
    public abstract suspend fun resetInstalledBackgrounds(): TdlResult<Ok>

    /**
     * Resets all network data usage statistics to zero. Can be called before authorization.
     */
    public abstract suspend fun resetNetworkStatistics(): TdlResult<Ok>

    /**
     * Removes 2-step verification password without previous password and access to recovery email address. The password can't be reset immediately and the request needs to be repeated after the specified time.
     */
    public abstract suspend fun resetPassword(): TdlResult<ResetPasswordResult>

    /**
     * Reuses an active Telegram Star subscription to a channel chat and joins the chat again.
     *
     * @param subscriptionId Identifier of the subscription.
     */
    public abstract suspend fun reuseStarSubscription(subscriptionId: String): TdlResult<Ok>

    /**
     * Revokes invite link for a chat. Available for basic groups, supergroups, and channels. Requires administrator privileges and canInviteUsers right in the chat for own links and owner privileges for other links. If a primary link is revoked, then additionally to the revoked link returns new primary link.
     *
     * @param chatId Chat identifier.
     * @param inviteLink Invite link to be revoked.
     */
    public abstract suspend fun revokeChatInviteLink(chatId: Long, inviteLink: String): TdlResult<ChatInviteLinks>

    /**
     * Revokes invite link for a group call. Requires groupCall.canBeManaged right for video chats or groupCall.isOwned otherwise.
     *
     * @param groupCallId Group call identifier.
     */
    public abstract suspend fun revokeGroupCallInviteLink(groupCallId: Int): TdlResult<Ok>

    /**
     * Saves application log event on the server. Can be called before authorization.
     *
     * @param type Event type.
     * @param chatId Optional chat identifier, associated with the event.
     * @param data The log event data.
     */
    public abstract suspend fun saveApplicationLogEvent(
        type: String,
        chatId: Long,
        data: JsonValue,
    ): TdlResult<Ok>

    /**
     * Saves an inline message to be sent by the given user; for bots only.
     *
     * @param userId Identifier of the user.
     * @param result The description of the message.
     * @param chatTypes Types of the chats to which the message can be sent.
     */
    public abstract suspend fun savePreparedInlineMessage(
        userId: Long,
        result: InputInlineQueryResult,
        chatTypes: TargetChatTypes,
    ): TdlResult<PreparedInlineMessageId>

    /**
     * Searches affiliate programs that can be connected to the given affiliate.
     *
     * @param affiliate The affiliate for which affiliate programs are searched for.
     * @param sortOrder Sort order for the results.
     * @param offset Offset of the first affiliate program to return as received from the previous request; use empty string to get the first chunk of results.
     * @param limit The maximum number of affiliate programs to return.
     */
    public abstract suspend fun searchAffiliatePrograms(
        affiliate: AffiliateType,
        sortOrder: AffiliateProgramSortOrder,
        offset: String,
        limit: Int,
    ): TdlResult<FoundAffiliatePrograms>

    /**
     * Searches for a background by its name.
     *
     * @param name The name of the background.
     */
    public abstract suspend fun searchBackground(name: String): TdlResult<Background>

    /**
     * Searches for call and group call messages. Returns the results in reverse chronological order (i.e., in order of decreasing messageId). For optimal performance, the number of returned messages is chosen by TDLib.
     *
     * @param offset Offset of the first entry to return as received from the previous request; use empty string to get the first chunk of results.
     * @param limit The maximum number of messages to be returned; up to 100. For optimal performance, the number of returned messages is chosen by TDLib and can be smaller than the specified limit.
     * @param onlyMissed Pass true to search only for messages with missed/declined calls.
     */
    public abstract suspend fun searchCallMessages(
        offset: String,
        limit: Int,
        onlyMissed: Boolean,
    ): TdlResult<FoundMessages>

    /**
     * Searches a chat with an affiliate program. Returns the chat if found and the program is active.
     *
     * @param username Username of the chat.
     * @param referrer The referrer from an internalLinkTypeChatAffiliateProgram link.
     */
    public abstract suspend fun searchChatAffiliateProgram(username: String, referrer: String): TdlResult<Chat>

    /**
     * Searches for a specified query in the first name, last name and usernames of the members of a specified chat. Requires administrator rights if the chat is a channel.
     *
     * @param chatId Chat identifier.
     * @param query Query to search for.
     * @param limit The maximum number of users to be returned; up to 200.
     * @param filter The type of users to search for; pass null to search among all chat members.
     */
    public abstract suspend fun searchChatMembers(
        chatId: Long,
        query: String,
        limit: Int,
        filter: ChatMembersFilter? = null,
    ): TdlResult<ChatMembers>

    /**
     * Searches for messages with given words in the chat. Returns the results in reverse chronological order, i.e. in order of decreasing messageId. Cannot be used in secret chats with a non-empty query (searchSecretMessages must be used instead), or without an enabled message database. For optimal performance, the number of returned messages is chosen by TDLib and can be smaller than the specified limit. A combination of query, senderId, filter and topicId search criteria is expected to be supported, only if it is required for Telegram official application implementation.
     *
     * @param chatId Identifier of the chat in which to search messages.
     * @param topicId Pass topic identifier to search messages only in specific topic; pass null to search for messages in all topics.
     * @param query Query to search for.
     * @param senderId Identifier of the sender of messages to search for; pass null to search for messages from any sender. Not supported in secret chats.
     * @param fromMessageId Identifier of the message starting from which history must be fetched; use 0 to get results from the last message.
     * @param offset Specify 0 to get results from exactly the message fromMessageId or a negative offset to get the specified message and some newer messages.
     * @param limit The maximum number of messages to be returned; must be positive and can't be greater than 100. If the offset is negative, the limit must be greater than -offset. For optimal performance, the number of returned messages is chosen by TDLib and can be smaller than the specified limit.
     * @param filter Additional filter for messages to search; pass null to search for all messages.
     */
    public abstract suspend fun searchChatMessages(
        chatId: Long,
        topicId: MessageTopic? = null,
        query: String,
        senderId: MessageSender? = null,
        fromMessageId: Long,
        offset: Int,
        limit: Int,
        filter: SearchMessagesFilter? = null,
    ): TdlResult<FoundChatMessages>

    /**
     * Returns information about the recent locations of chat members that were sent to the chat. Returns up to 1 location message per user.
     *
     * @param chatId Chat identifier.
     * @param limit The maximum number of messages to be returned.
     */
    public abstract suspend fun searchChatRecentLocationMessages(chatId: Long, limit: Int): TdlResult<Messages>

    /**
     * Searches for the specified query in the title and username of already known chats. This is an offline method. Returns chats in the order seen in the main chat list.
     *
     * @param query Query to search for. If the query is empty, returns up to 50 recently found chats.
     * @param limit The maximum number of chats to be returned.
     */
    public abstract suspend fun searchChats(query: String, limit: Int): TdlResult<Chats>

    /**
     * Searches for the specified query in the title and username of already known chats via request to the server. Returns chats in the order seen in the main chat list.
     *
     * @param query Query to search for.
     * @param limit The maximum number of chats to be returned.
     */
    public abstract suspend fun searchChatsOnServer(query: String, limit: Int): TdlResult<Chats>

    /**
     * Searches for the specified query in the first names, last names and usernames of the known user contacts.
     *
     * @param query Query to search for; may be empty to return all contacts.
     * @param limit The maximum number of users to be returned.
     */
    public abstract suspend fun searchContacts(query: String, limit: Int): TdlResult<Users>

    /**
     * Searches for emojis by keywords. Supported only if the file database is enabled. Order of results is unspecified.
     *
     * @param text Text to search for.
     * @param inputLanguageCodes List of possible IETF language tags of the user's input language; may be empty if unknown.
     */
    public abstract suspend fun searchEmojis(text: String, inputLanguageCodes: Array<String>): TdlResult<EmojiKeywords>

    /**
     * Searches for files in the file download list or recently downloaded files from the list.
     *
     * @param query Query to search for; may be empty to return all downloaded files.
     * @param onlyActive Pass true to search only for active downloads, including paused.
     * @param onlyCompleted Pass true to search only for completed downloads.
     * @param offset Offset of the first entry to return as received from the previous request; use empty string to get the first chunk of results.
     * @param limit The maximum number of files to be returned.
     */
    public abstract suspend fun searchFileDownloads(
        query: String,
        onlyActive: Boolean,
        onlyCompleted: Boolean,
        offset: String,
        limit: Int,
    ): TdlResult<FoundFileDownloads>

    /**
     * Returns upgraded gifts that can be bought from other owners.
     *
     * @param giftId Identifier of the regular gift that was upgraded to a unique gift.
     * @param order Order in which the results will be sorted.
     * @param attributes Attributes used to filter received gifts. If multiple attributes of the same type are specified, then all of them are allowed. If none attributes of specific type are specified, then all values for this attribute type are allowed.
     * @param offset Offset of the first entry to return as received from the previous request with the same order and attributes; use empty string to get the first chunk of results.
     * @param limit The maximum number of gifts to return.
     */
    public abstract suspend fun searchGiftsForResale(
        giftId: Long,
        order: GiftForResaleOrder,
        attributes: Array<UpgradedGiftAttributeId>,
        offset: String,
        limit: Int,
    ): TdlResult<GiftsForResale>

    /**
     * Searches for recently used hashtags by their prefix.
     *
     * @param prefix Hashtag prefix to search for.
     * @param limit The maximum number of hashtags to be returned.
     */
    public abstract suspend fun searchHashtags(prefix: String, limit: Int): TdlResult<Hashtags>

    /**
     * Searches for installed sticker sets by looking for specified query in their title and name.
     *
     * @param stickerType Type of the sticker sets to search for.
     * @param query Query to search for.
     * @param limit The maximum number of sticker sets to return.
     */
    public abstract suspend fun searchInstalledStickerSets(
        stickerType: StickerType,
        query: String,
        limit: Int,
    ): TdlResult<StickerSets>

    /**
     * Searches for messages in all chats except secret chats. Returns the results in reverse chronological order (i.e., in order of decreasing (date, chatId, messageId)). For optimal performance, the number of returned messages is chosen by TDLib and can be smaller than the specified limit.
     *
     * @param chatList Chat list in which to search messages; pass null to search in all chats regardless of their chat list. Only Main and Archive chat lists are supported.
     * @param query Query to search for.
     * @param offset Offset of the first entry to return as received from the previous request; use empty string to get the first chunk of results.
     * @param limit The maximum number of messages to be returned; up to 100. For optimal performance, the number of returned messages is chosen by TDLib and can be smaller than the specified limit.
     * @param filter Additional filter for messages to search; pass null to search for all messages. Filters searchMessagesFilterMention, searchMessagesFilterUnreadMention, searchMessagesFilterUnreadReaction, searchMessagesFilterFailedToSend, and searchMessagesFilterPinned are unsupported in this function.
     * @param chatTypeFilter Additional filter for type of the chat of the searched messages; pass null to search for messages in all chats.
     * @param minDate If not 0, the minimum date of the messages to return.
     * @param maxDate If not 0, the maximum date of the messages to return.
     */
    public abstract suspend fun searchMessages(
        chatList: ChatList? = null,
        query: String,
        offset: String,
        limit: Int,
        filter: SearchMessagesFilter? = null,
        chatTypeFilter: SearchMessagesChatTypeFilter? = null,
        minDate: Int,
        maxDate: Int,
    ): TdlResult<FoundMessages>

    /**
     * Searches for outgoing messages with content of the type messageDocument in all chats except secret chats. Returns the results in reverse chronological order.
     *
     * @param query Query to search for in document file name and message caption.
     * @param limit The maximum number of messages to be returned; up to 100.
     */
    public abstract suspend fun searchOutgoingDocumentMessages(query: String, limit: Int): TdlResult<FoundMessages>

    /**
     * Searches a public chat by its username. Currently, only private chats, supergroups and channels can be public. Returns the chat if found; otherwise, an error is returned.
     *
     * @param username Username to be resolved.
     */
    public abstract suspend fun searchPublicChat(username: String): TdlResult<Chat>

    /**
     * Searches public chats by looking for specified query in their username and title. Currently, only private chats, supergroups and channels can be public. Returns a meaningful number of results. Excludes private chats with contacts and chats from the chat list from the results.
     *
     * @param query Query to search for.
     */
    public abstract suspend fun searchPublicChats(query: String): TdlResult<Chats>

    /**
     * Searches for public channel posts containing the given hashtag or cashtag. For optimal performance, the number of returned messages is chosen by TDLib and can be smaller than the specified limit.
     *
     * @param tag Hashtag or cashtag to search for.
     * @param offset Offset of the first entry to return as received from the previous request; use empty string to get the first chunk of results.
     * @param limit The maximum number of messages to be returned; up to 100. For optimal performance, the number of returned messages is chosen by TDLib and can be smaller than the specified limit.
     */
    public abstract suspend fun searchPublicMessagesByTag(
        tag: String,
        offset: String,
        limit: Int,
    ): TdlResult<FoundMessages>

    /**
     * Searches for public stories by the given address location. For optimal performance, the number of returned stories is chosen by TDLib and can be smaller than the specified limit.
     *
     * @param address Address of the location.
     * @param offset Offset of the first entry to return as received from the previous request; use empty string to get the first chunk of results.
     * @param limit The maximum number of stories to be returned; up to 100. For optimal performance, the number of returned stories is chosen by TDLib and can be smaller than the specified limit.
     */
    public abstract suspend fun searchPublicStoriesByLocation(
        address: LocationAddress,
        offset: String,
        limit: Int,
    ): TdlResult<FoundStories>

    /**
     * Searches for public stories containing the given hashtag or cashtag. For optimal performance, the number of returned stories is chosen by TDLib and can be smaller than the specified limit.
     *
     * @param storyPosterChatId Identifier of the chat that posted the stories to search for; pass 0 to search stories in all chats.
     * @param tag Hashtag or cashtag to search for.
     * @param offset Offset of the first entry to return as received from the previous request; use empty string to get the first chunk of results.
     * @param limit The maximum number of stories to be returned; up to 100. For optimal performance, the number of returned stories is chosen by TDLib and can be smaller than the specified limit.
     */
    public abstract suspend fun searchPublicStoriesByTag(
        storyPosterChatId: Long,
        tag: String,
        offset: String,
        limit: Int,
    ): TdlResult<FoundStories>

    /**
     * Searches for public stories from the given venue. For optimal performance, the number of returned stories is chosen by TDLib and can be smaller than the specified limit.
     *
     * @param venueProvider Provider of the venue.
     * @param venueId Identifier of the venue in the provider database.
     * @param offset Offset of the first entry to return as received from the previous request; use empty string to get the first chunk of results.
     * @param limit The maximum number of stories to be returned; up to 100. For optimal performance, the number of returned stories is chosen by TDLib and can be smaller than the specified limit.
     */
    public abstract suspend fun searchPublicStoriesByVenue(
        venueProvider: String,
        venueId: String,
        offset: String,
        limit: Int,
    ): TdlResult<FoundStories>

    /**
     * Searches for a given quote in a text. Returns found quote start position in UTF-16 code units. Returns a 404 error if the quote is not found. Can be called synchronously.
     *
     * @param text Text in which to search for the quote.
     * @param quote Quote to search for.
     * @param quotePosition Approximate quote position in UTF-16 code units.
     */
    public abstract suspend fun searchQuote(
        text: FormattedText,
        quote: FormattedText,
        quotePosition: Int,
    ): TdlResult<FoundPosition>

    /**
     * Searches for the specified query in the title and username of up to 50 recently found chats. This is an offline method.
     *
     * @param query Query to search for.
     * @param limit The maximum number of chats to be returned.
     */
    public abstract suspend fun searchRecentlyFoundChats(query: String, limit: Int): TdlResult<Chats>

    /**
     * Searches for messages tagged by the given reaction and with the given words in the Saved Messages chat; for Telegram Premium users only. Returns the results in reverse chronological order, i.e. in order of decreasing messageId. For optimal performance, the number of returned messages is chosen by TDLib and can be smaller than the specified limit.
     *
     * @param savedMessagesTopicId If not 0, only messages in the specified Saved Messages topic will be considered; pass 0 to consider all messages.
     * @param tag Tag to search for; pass null to return all suitable messages.
     * @param query Query to search for.
     * @param fromMessageId Identifier of the message starting from which messages must be fetched; use 0 to get results from the last message.
     * @param offset Specify 0 to get results from exactly the message fromMessageId or a negative offset to get the specified message and some newer messages.
     * @param limit The maximum number of messages to be returned; must be positive and can't be greater than 100. If the offset is negative, the limit must be greater than -offset. For optimal performance, the number of returned messages is chosen by TDLib and can be smaller than the specified limit.
     */
    public abstract suspend fun searchSavedMessages(
        savedMessagesTopicId: Long,
        tag: ReactionType? = null,
        query: String,
        fromMessageId: Long,
        offset: Int,
        limit: Int,
    ): TdlResult<FoundChatMessages>

    /**
     * Searches for messages in secret chats. Returns the results in reverse chronological order. For optimal performance, the number of returned messages is chosen by TDLib.
     *
     * @param chatId Identifier of the chat in which to search. Specify 0 to search in all secret chats.
     * @param query Query to search for. If empty, searchChatMessages must be used instead.
     * @param offset Offset of the first entry to return as received from the previous request; use empty string to get the first chunk of results.
     * @param limit The maximum number of messages to be returned; up to 100. For optimal performance, the number of returned messages is chosen by TDLib and can be smaller than the specified limit.
     * @param filter Additional filter for messages to search; pass null to search for all messages.
     */
    public abstract suspend fun searchSecretMessages(
        chatId: Long,
        query: String,
        offset: String,
        limit: Int,
        filter: SearchMessagesFilter? = null,
    ): TdlResult<FoundMessages>

    /**
     * Searches for a sticker set by its name.
     *
     * @param name Name of the sticker set.
     * @param ignoreCache Pass true to ignore local cache of sticker sets and always send a network request.
     */
    public abstract suspend fun searchStickerSet(name: String, ignoreCache: Boolean): TdlResult<StickerSet>

    /**
     * Searches for sticker sets by looking for specified query in their title and name. Excludes installed sticker sets from the results.
     *
     * @param stickerType Type of the sticker sets to return.
     * @param query Query to search for.
     */
    public abstract suspend fun searchStickerSets(stickerType: StickerType, query: String): TdlResult<StickerSets>

    /**
     * Searches for stickers from public sticker sets that correspond to any of the given emoji.
     *
     * @param stickerType Type of the stickers to return.
     * @param emojis Space-separated list of emojis to search for.
     * @param query Query to search for; may be empty to search for emoji only.
     * @param inputLanguageCodes List of possible IETF language tags of the user's input language; may be empty if unknown.
     * @param offset The offset from which to return the stickers; must be non-negative.
     * @param limit The maximum number of stickers to be returned; 0-100.
     */
    public abstract suspend fun searchStickers(
        stickerType: StickerType,
        emojis: String,
        query: String,
        inputLanguageCodes: Array<String>,
        offset: Int,
        limit: Int,
    ): TdlResult<Stickers>

    /**
     * Searches specified query by word prefixes in the provided strings. Returns 0-based positions of strings that matched. Can be called synchronously.
     *
     * @param strings The strings to search in for the query.
     * @param query Query to search for.
     * @param limit The maximum number of objects to return.
     * @param returnNoneForEmptyQuery Pass true to receive no results for an empty query.
     */
    public abstract suspend fun searchStringsByPrefix(
        strings: Array<String>,
        query: String,
        limit: Int,
        returnNoneForEmptyQuery: Boolean,
    ): TdlResult<FoundPositions>

    /**
     * Searches a user by their phone number. Returns a 404 error if the user can't be found.
     *
     * @param phoneNumber Phone number to search for.
     * @param onlyLocal Pass true to get only locally available information without sending network requests.
     */
    public abstract suspend fun searchUserByPhoneNumber(phoneNumber: String, onlyLocal: Boolean): TdlResult<User>

    /**
     * Searches a user by a token from the user's link.
     *
     * @param token Token to search for.
     */
    public abstract suspend fun searchUserByToken(token: String): TdlResult<User>

    /**
     * Returns information about a Web App by its short name. Returns a 404 error if the Web App is not found.
     *
     * @param botUserId Identifier of the target bot.
     * @param webAppShortName Short name of the Web App.
     */
    public abstract suspend fun searchWebApp(botUserId: Long, webAppShortName: String): TdlResult<FoundWebApp>

    /**
     * Sells a gift for Telegram Stars.
     *
     * @param businessConnectionId Unique identifier of business connection on behalf of which to send the request; for bots only.
     * @param receivedGiftId Identifier of the gift.
     */
    public abstract suspend fun sellGift(businessConnectionId: String, receivedGiftId: String): TdlResult<Ok>

    /**
     * Sends Firebase Authentication SMS to the phone number of the user. Works only when the current authorization state is authorizationStateWaitCode and the server returned code of the type authenticationCodeTypeFirebaseAndroid or authenticationCodeTypeFirebaseIos.
     *
     * @param token Play Integrity API or SafetyNet Attestation API token for the Android application, or secret from push notification for the iOS application.
     */
    public abstract suspend fun sendAuthenticationFirebaseSms(token: String): TdlResult<Ok>

    /**
     * Invites a bot to a chat (if it is not yet a member) and sends it the /start command; requires canInviteUsers member right. Bots can't be invited to a private chat other than the chat with the bot. Bots can't be invited to channels (although they can be added as admins) and secret chats. Returns the sent message.
     *
     * @param botUserId Identifier of the bot.
     * @param chatId Identifier of the target chat.
     * @param parameter A hidden parameter sent to the bot for deep linking purposes (https://core.telegram.org/bots#deep-linking).
     */
    public abstract suspend fun sendBotStartMessage(
        botUserId: Long,
        chatId: Long,
        parameter: String,
    ): TdlResult<Message>

    /**
     * Sends a message on behalf of a business account; for bots only. Returns the message after it was sent.
     *
     * @param businessConnectionId Unique identifier of business connection on behalf of which to send the request.
     * @param chatId Target chat.
     * @param replyTo Information about the message to be replied; pass null if none.
     * @param disableNotification Pass true to disable notification for the message.
     * @param protectContent Pass true if the content of the message must be protected from forwarding and saving.
     * @param effectId Identifier of the effect to apply to the message.
     * @param replyMarkup Markup for replying to the message; pass null if none.
     * @param inputMessageContent The content of the message to be sent.
     */
    public abstract suspend fun sendBusinessMessage(
        businessConnectionId: String,
        chatId: Long,
        replyTo: InputMessageReplyTo? = null,
        disableNotification: Boolean,
        protectContent: Boolean,
        effectId: Long,
        replyMarkup: ReplyMarkup? = null,
        inputMessageContent: InputMessageContent,
    ): TdlResult<BusinessMessage>

    /**
     * Sends 2-10 messages grouped together into an album on behalf of a business account; for bots only. Currently, only audio, document, photo and video messages can be grouped into an album. Documents and audio files can be only grouped in an album with messages of the same type. Returns sent messages.
     *
     * @param businessConnectionId Unique identifier of business connection on behalf of which to send the request.
     * @param chatId Target chat.
     * @param replyTo Information about the message to be replied; pass null if none.
     * @param disableNotification Pass true to disable notification for the message.
     * @param protectContent Pass true if the content of the message must be protected from forwarding and saving.
     * @param effectId Identifier of the effect to apply to the message.
     * @param inputMessageContents Contents of messages to be sent. At most 10 messages can be added to an album. All messages must have the same value of showCaptionAboveMedia.
     */
    public abstract suspend fun sendBusinessMessageAlbum(
        businessConnectionId: String,
        chatId: Long,
        replyTo: InputMessageReplyTo? = null,
        disableNotification: Boolean,
        protectContent: Boolean,
        effectId: Long,
        inputMessageContents: Array<InputMessageContent>,
    ): TdlResult<BusinessMessages>

    /**
     * Sends debug information for a call to Telegram servers.
     *
     * @param callId Call identifier.
     * @param debugInformation Debug information in application-specific format.
     */
    public abstract suspend fun sendCallDebugInformation(callId: Int, debugInformation: String): TdlResult<Ok>

    /**
     * Sends log file for a call to Telegram servers.
     *
     * @param callId Call identifier.
     * @param logFile Call log file. Only inputFileLocal and inputFileGenerated are supported.
     */
    public abstract suspend fun sendCallLog(callId: Int, logFile: InputFile): TdlResult<Ok>

    /**
     * Sends a call rating.
     *
     * @param callId Call identifier.
     * @param rating Call rating; 1-5.
     * @param comment An optional user comment if the rating is less than 5.
     * @param problems List of the exact types of problems with the call, specified by the user.
     */
    public abstract suspend fun sendCallRating(
        callId: Int,
        rating: Int,
        comment: String,
        problems: Array<CallProblem>,
    ): TdlResult<Ok>

    /**
     * Sends call signaling data.
     *
     * @param callId Call identifier.
     * @param data The data.
     */
    public abstract suspend fun sendCallSignalingData(callId: Int, data: ByteArray): TdlResult<Ok>

    /**
     * Sends a notification about user activity in a chat.
     *
     * @param chatId Chat identifier.
     * @param messageThreadId If not 0, the message thread identifier in which the action was performed.
     * @param businessConnectionId Unique identifier of business connection on behalf of which to send the request; for bots only.
     * @param action The action description; pass null to cancel the currently active action.
     */
    public abstract suspend fun sendChatAction(
        chatId: Long,
        messageThreadId: Long,
        businessConnectionId: String,
        action: ChatAction? = null,
    ): TdlResult<Ok>

    /**
     * Sends a custom request; for bots only.
     *
     * @param method The method name.
     * @param parameters JSON-serialized method parameters.
     */
    public abstract suspend fun sendCustomRequest(method: String, parameters: String): TdlResult<CustomRequestResult>

    /**
     * Sends a code to verify an email address to be added to a user's Telegram Passport.
     *
     * @param emailAddress Email address.
     */
    public abstract suspend fun sendEmailAddressVerificationCode(emailAddress: String): TdlResult<EmailAddressAuthenticationCodeInfo>

    /**
     * Sends a gift to another user or channel chat. May return an error with a message &quot;STARGIFT_USAGE_LIMITED&quot; if the gift was sold out.
     *
     * @param giftId Identifier of the gift to send.
     * @param ownerId Identifier of the user or the channel chat that will receive the gift.
     * @param text Text to show along with the gift; 0-getOption(&quot;gift_text_length_max&quot;) characters. Only Bold, Italic, Underline, Strikethrough, Spoiler, and CustomEmoji entities are allowed. Must be empty if the receiver enabled paid messages.
     * @param isPrivate Pass true to show gift text and sender only to the gift receiver; otherwise, everyone will be able to see them.
     * @param payForUpgrade Pass true to additionally pay for the gift upgrade and allow the receiver to upgrade it for free.
     */
    public abstract suspend fun sendGift(
        giftId: Long,
        ownerId: MessageSender,
        text: FormattedText,
        isPrivate: Boolean,
        payForUpgrade: Boolean,
    ): TdlResult<Ok>

    /**
     * Sends the result of an inline query as a message. Returns the sent message. Always clears a chat draft message.
     *
     * @param chatId Target chat.
     * @param messageThreadId If not 0, the message thread identifier in which the message will be sent.
     * @param replyTo Information about the message or story to be replied; pass null if none.
     * @param options Options to be used to send the message; pass null to use default options.
     * @param queryId Identifier of the inline query.
     * @param resultId Identifier of the inline query result.
     * @param hideViaBot Pass true to hide the bot, via which the message is sent. Can be used only for bots getOption(&quot;animation_search_bot_username&quot;), getOption(&quot;photo_search_bot_username&quot;), and getOption(&quot;venue_search_bot_username&quot;).
     */
    public abstract suspend fun sendInlineQueryResultMessage(
        chatId: Long,
        messageThreadId: Long,
        replyTo: InputMessageReplyTo? = null,
        options: MessageSendOptions? = null,
        queryId: Long,
        resultId: String,
        hideViaBot: Boolean,
    ): TdlResult<Message>

    /**
     * Sends a message. Returns the sent message.
     *
     * @param chatId Target chat.
     * @param messageThreadId If not 0, the message thread identifier in which the message will be sent.
     * @param replyTo Information about the message or story to be replied; pass null if none.
     * @param options Options to be used to send the message; pass null to use default options.
     * @param replyMarkup Markup for replying to the message; pass null if none; for bots only.
     * @param inputMessageContent The content of the message to be sent.
     */
    public abstract suspend fun sendMessage(
        chatId: Long,
        messageThreadId: Long,
        replyTo: InputMessageReplyTo? = null,
        options: MessageSendOptions? = null,
        replyMarkup: ReplyMarkup? = null,
        inputMessageContent: InputMessageContent,
    ): TdlResult<Message>

    /**
     * Sends 2-10 messages grouped together into an album. Currently, only audio, document, photo and video messages can be grouped into an album. Documents and audio files can be only grouped in an album with messages of the same type. Returns sent messages.
     *
     * @param chatId Target chat.
     * @param messageThreadId If not 0, the message thread identifier in which the messages will be sent.
     * @param replyTo Information about the message or story to be replied; pass null if none.
     * @param options Options to be used to send the messages; pass null to use default options.
     * @param inputMessageContents Contents of messages to be sent. At most 10 messages can be added to an album. All messages must have the same value of showCaptionAboveMedia.
     */
    public abstract suspend fun sendMessageAlbum(
        chatId: Long,
        messageThreadId: Long,
        replyTo: InputMessageReplyTo? = null,
        options: MessageSendOptions? = null,
        inputMessageContents: Array<InputMessageContent>,
    ): TdlResult<Messages>

    /**
     * Sends a Telegram Passport authorization form, effectively sharing data with the service. This method must be called after getPassportAuthorizationFormAvailableElements if some previously available elements are going to be reused.
     *
     * @param authorizationFormId Authorization form identifier.
     * @param types Types of Telegram Passport elements chosen by user to complete the authorization form.
     */
    public abstract suspend fun sendPassportAuthorizationForm(authorizationFormId: Int, types: Array<PassportElementType>): TdlResult<Ok>

    /**
     * Sends a filled-out payment form to the bot for final verification.
     *
     * @param inputInvoice The invoice.
     * @param paymentFormId Payment form identifier returned by getPaymentForm.
     * @param orderInfoId Identifier returned by validateOrderInfo, or an empty string.
     * @param shippingOptionId Identifier of a chosen shipping option, if applicable.
     * @param credentials The credentials chosen by user for payment; pass null for a payment in Telegram Stars.
     * @param tipAmount Chosen by the user amount of tip in the smallest units of the currency.
     */
    public abstract suspend fun sendPaymentForm(
        inputInvoice: InputInvoice,
        paymentFormId: Long,
        orderInfoId: String,
        shippingOptionId: String,
        credentials: InputCredentials? = null,
        tipAmount: Long,
    ): TdlResult<PaymentResult>

    /**
     * Sends a code to the specified phone number. Aborts previous phone number verification if there was one. On success, returns information about the sent code.
     *
     * @param phoneNumber The phone number, in international format.
     * @param settings Settings for the authentication of the user's phone number; pass null to use default settings.
     * @param type Type of the request for which the code is sent.
     */
    public abstract suspend fun sendPhoneNumberCode(
        phoneNumber: String,
        settings: PhoneNumberAuthenticationSettings? = null,
        type: PhoneNumberCodeType,
    ): TdlResult<AuthenticationCodeInfo>

    /**
     * Sends Firebase Authentication SMS to the specified phone number. Works only when received a code of the type authenticationCodeTypeFirebaseAndroid or authenticationCodeTypeFirebaseIos.
     *
     * @param token Play Integrity API or SafetyNet Attestation API token for the Android application, or secret from push notification for the iOS application.
     */
    public abstract suspend fun sendPhoneNumberFirebaseSms(token: String): TdlResult<Ok>

    /**
     * Sends messages from a quick reply shortcut. Requires Telegram Business subscription. Can't be used to send paid messages.
     *
     * @param chatId Identifier of the chat to which to send messages. The chat must be a private chat with a regular user.
     * @param shortcutId Unique identifier of the quick reply shortcut.
     * @param sendingId Non-persistent identifier, which will be returned back in messageSendingStatePending object and can be used to match sent messages and corresponding updateNewMessage updates.
     */
    public abstract suspend fun sendQuickReplyShortcutMessages(
        chatId: Long,
        shortcutId: Int,
        sendingId: Int,
    ): TdlResult<Messages>

    /**
     * Sends an upgraded gift that is available for resale to another user or channel chat; gifts already owned by the current user must be transferred using transferGift and can't be passed to the method.
     *
     * @param giftName Name of the upgraded gift to send.
     * @param ownerId Identifier of the user or the channel chat that will receive the gift.
     * @param starCount The amount of Telegram Stars required to pay for the gift.
     */
    public abstract suspend fun sendResoldGift(
        giftName: String,
        ownerId: MessageSender,
        starCount: Long,
    ): TdlResult<Ok>

    /**
     * Sends a custom request from a Web App.
     *
     * @param botUserId Identifier of the bot.
     * @param method The method name.
     * @param parameters JSON-serialized method parameters.
     */
    public abstract suspend fun sendWebAppCustomRequest(
        botUserId: Long,
        method: String,
        parameters: String,
    ): TdlResult<CustomRequestResult>

    /**
     * Sends data received from a keyboardButtonTypeWebApp Web App to a bot.
     *
     * @param botUserId Identifier of the target bot.
     * @param buttonText Text of the keyboardButtonTypeWebApp button, which opened the Web App.
     * @param data The data.
     */
    public abstract suspend fun sendWebAppData(
        botUserId: Long,
        buttonText: String,
        data: String,
    ): TdlResult<Ok>

    /**
     * Changes accent color and background custom emoji for the current user; for Telegram Premium users only.
     *
     * @param accentColorId Identifier of the accent color to use.
     * @param backgroundCustomEmojiId Identifier of a custom emoji to be shown on the reply header and link preview background; 0 if none.
     */
    public abstract suspend fun setAccentColor(accentColorId: Int, backgroundCustomEmojiId: Long): TdlResult<Ok>

    /**
     * Changes the period of inactivity after which the account of the current user will automatically be deleted.
     *
     * @param ttl New account TTL.
     */
    public abstract suspend fun setAccountTtl(ttl: AccountTtl): TdlResult<Ok>

    /**
     * Succeeds after a specified amount of time has passed. Can be called before initialization.
     *
     * @param seconds Number of seconds before the function returns.
     */
    public abstract suspend fun setAlarm(seconds: Double): TdlResult<Ok>

    /**
     * Application or reCAPTCHA verification has been completed. Can be called before authorization.
     *
     * @param verificationId Unique identifier for the verification process as received from updateApplicationVerificationRequired or updateApplicationRecaptchaVerificationRequired.
     * @param token Play Integrity API token for the Android application, or secret from push notification for the iOS application for application verification, or reCAPTCHA token for reCAPTCHA verifications; pass an empty string to abort verification and receive the error &quot;VERIFICATION_FAILED&quot; for the request.
     */
    public abstract suspend fun setApplicationVerificationToken(verificationId: Long, token: String): TdlResult<Ok>

    /**
     * Changes settings for automatic moving of chats to and from the Archive chat lists.
     *
     * @param settings New settings.
     */
    public abstract suspend fun setArchiveChatListSettings(settings: ArchiveChatListSettings): TdlResult<Ok>

    /**
     * Sets the email address of the user and sends an authentication code to the email address. Works only when the current authorization state is authorizationStateWaitEmailAddress.
     *
     * @param emailAddress The email address of the user.
     */
    public abstract suspend fun setAuthenticationEmailAddress(emailAddress: String): TdlResult<Ok>

    /**
     * Sets the phone number of the user and sends an authentication code to the user. Works only when the current authorization state is authorizationStateWaitPhoneNumber, or if there is no pending authentication query and the current authorization state is authorizationStateWaitPremiumPurchase, authorizationStateWaitEmailAddress, authorizationStateWaitEmailCode, authorizationStateWaitCode, authorizationStateWaitRegistration, or authorizationStateWaitPassword.
     *
     * @param phoneNumber The phone number of the user, in international format.
     * @param settings Settings for the authentication of the user's phone number; pass null to use default settings.
     */
    public abstract suspend fun setAuthenticationPhoneNumber(phoneNumber: String, settings: PhoneNumberAuthenticationSettings? = null): TdlResult<Ok>

    /**
     * Informs server about an in-store purchase of Telegram Premium before authorization. Works only when the current authorization state is authorizationStateWaitPremiumPurchase.
     *
     * @param transaction Information about the transaction.
     * @param isRestore Pass true if this is a restore of a Telegram Premium purchase; only for App Store.
     * @param currency ISO 4217 currency code of the payment currency.
     * @param amount Paid amount, in the smallest units of the currency.
     */
    public abstract suspend fun setAuthenticationPremiumPurchaseTransaction(
        transaction: StoreTransaction,
        isRestore: Boolean,
        currency: String,
        amount: Long,
    ): TdlResult<Ok>

    /**
     * Sets auto-download settings.
     *
     * @param settings New user auto-download settings.
     * @param type Type of the network for which the new settings are relevant.
     */
    public abstract suspend fun setAutoDownloadSettings(settings: AutoDownloadSettings, type: NetworkType): TdlResult<Ok>

    /**
     * Sets autosave settings for the given scope. The method is guaranteed to work only after at least one call to getAutosaveSettings.
     *
     * @param scope Autosave settings scope.
     * @param settings New autosave settings for the scope; pass null to set autosave settings to default.
     */
    public abstract suspend fun setAutosaveSettings(scope: AutosaveSettingsScope, settings: ScopeAutosaveSettings? = null): TdlResult<Ok>

    /**
     * Changes the bio of the current user.
     *
     * @param bio The new value of the user bio; 0-getOption(&quot;bio_length_max&quot;) characters without line feeds.
     */
    public abstract suspend fun setBio(bio: String): TdlResult<Ok>

    /**
     * Changes the birthdate of the current user.
     *
     * @param birthdate The new value of the current user's birthdate; pass null to remove the birthdate.
     */
    public abstract suspend fun setBirthdate(birthdate: Birthdate? = null): TdlResult<Ok>

    /**
     * Sets the text shown in the chat with a bot if the chat is empty. Can be called only if userTypeBot.canBeEdited == true.
     *
     * @param botUserId Identifier of the target bot.
     * @param languageCode A two-letter ISO 639-1 language code. If empty, the description will be shown to all users for whose languages there is no dedicated description.
     * @param description New bot's description on the specified language.
     */
    public abstract suspend fun setBotInfoDescription(
        botUserId: Long,
        languageCode: String,
        description: String,
    ): TdlResult<Ok>

    /**
     * Sets the text shown on a bot's profile page and sent together with the link when users share the bot. Can be called only if userTypeBot.canBeEdited == true.
     *
     * @param botUserId Identifier of the target bot.
     * @param languageCode A two-letter ISO 639-1 language code. If empty, the short description will be shown to all users for whose languages there is no dedicated description.
     * @param shortDescription New bot's short description on the specified language.
     */
    public abstract suspend fun setBotInfoShortDescription(
        botUserId: Long,
        languageCode: String,
        shortDescription: String,
    ): TdlResult<Ok>

    /**
     * Sets the name of a bot. Can be called only if userTypeBot.canBeEdited == true.
     *
     * @param botUserId Identifier of the target bot.
     * @param languageCode A two-letter ISO 639-1 language code. If empty, the name will be shown to all users for whose languages there is no dedicated name.
     * @param name New bot's name on the specified language; 0-64 characters; must be non-empty if language code is empty.
     */
    public abstract suspend fun setBotName(
        botUserId: Long,
        languageCode: String,
        name: String,
    ): TdlResult<Ok>

    /**
     * Changes a profile photo for a bot.
     *
     * @param botUserId Identifier of the target bot.
     * @param photo Profile photo to set; pass null to delete the chat photo.
     */
    public abstract suspend fun setBotProfilePhoto(botUserId: Long, photo: InputChatPhoto? = null): TdlResult<Ok>

    /**
     * Informs the server about the number of pending bot updates if they haven't been processed for a long time; for bots only.
     *
     * @param pendingUpdateCount The number of pending updates.
     * @param errorMessage The last error message.
     */
    public abstract suspend fun setBotUpdatesStatus(pendingUpdateCount: Int, errorMessage: String): TdlResult<Ok>

    /**
     * Changes the bio of a business account; for bots only.
     *
     * @param businessConnectionId Unique identifier of business connection.
     * @param bio The new value of the bio; 0-getOption(&quot;bio_length_max&quot;) characters without line feeds.
     */
    public abstract suspend fun setBusinessAccountBio(businessConnectionId: String, bio: String): TdlResult<Ok>

    /**
     * Changes settings for gift receiving of a business account; for bots only.
     *
     * @param businessConnectionId Unique identifier of business connection.
     * @param settings The new settings.
     */
    public abstract suspend fun setBusinessAccountGiftSettings(businessConnectionId: String, settings: GiftSettings): TdlResult<Ok>

    /**
     * Changes the first and last name of a business account; for bots only.
     *
     * @param businessConnectionId Unique identifier of business connection.
     * @param firstName The new value of the first name for the business account; 1-64 characters.
     * @param lastName The new value of the optional last name for the business account; 0-64 characters.
     */
    public abstract suspend fun setBusinessAccountName(
        businessConnectionId: String,
        firstName: String,
        lastName: String,
    ): TdlResult<Ok>

    /**
     * Changes a profile photo of a business account; for bots only.
     *
     * @param businessConnectionId Unique identifier of business connection.
     * @param photo Profile photo to set; pass null to remove the photo.
     * @param isPublic Pass true to set the public photo, which will be visible even the main photo is hidden by privacy settings.
     */
    public abstract suspend fun setBusinessAccountProfilePhoto(
        businessConnectionId: String,
        photo: InputChatPhoto? = null,
        isPublic: Boolean,
    ): TdlResult<Ok>

    /**
     * Changes the editable username of a business account; for bots only.
     *
     * @param businessConnectionId Unique identifier of business connection.
     * @param username The new value of the username.
     */
    public abstract suspend fun setBusinessAccountUsername(businessConnectionId: String, username: String): TdlResult<Ok>

    /**
     * Changes the business away message settings of the current user. Requires Telegram Business subscription.
     *
     * @param awayMessageSettings The new settings for the away message of the business; pass null to disable the away message.
     */
    public abstract suspend fun setBusinessAwayMessageSettings(awayMessageSettings: BusinessAwayMessageSettings? = null): TdlResult<Ok>

    /**
     * Adds or changes business bot that is connected to the current user account.
     *
     * @param bot Connection settings for the bot.
     */
    public abstract suspend fun setBusinessConnectedBot(bot: BusinessConnectedBot): TdlResult<Ok>

    /**
     * Changes the business greeting message settings of the current user. Requires Telegram Business subscription.
     *
     * @param greetingMessageSettings The new settings for the greeting message of the business; pass null to disable the greeting message.
     */
    public abstract suspend fun setBusinessGreetingMessageSettings(greetingMessageSettings: BusinessGreetingMessageSettings? = null): TdlResult<Ok>

    /**
     * Changes the business location of the current user. Requires Telegram Business subscription.
     *
     * @param location The new location of the business; pass null to remove the location.
     */
    public abstract suspend fun setBusinessLocation(location: BusinessLocation? = null): TdlResult<Ok>

    /**
     * Pins or unpins a message sent on behalf of a business account; for bots only.
     *
     * @param businessConnectionId Unique identifier of business connection on behalf of which the message was sent.
     * @param chatId The chat the message belongs to.
     * @param messageId Identifier of the message.
     * @param isPinned Pass true to pin the message, pass false to unpin it.
     */
    public abstract suspend fun setBusinessMessageIsPinned(
        businessConnectionId: String,
        chatId: Long,
        messageId: Long,
        isPinned: Boolean,
    ): TdlResult<Ok>

    /**
     * Changes the business opening hours of the current user. Requires Telegram Business subscription.
     *
     * @param openingHours The new opening hours of the business; pass null to remove the opening hours; up to 28 time intervals can be specified.
     */
    public abstract suspend fun setBusinessOpeningHours(openingHours: BusinessOpeningHours? = null): TdlResult<Ok>

    /**
     * Changes the business start page of the current user. Requires Telegram Business subscription.
     *
     * @param startPage The new start page of the business; pass null to remove custom start page.
     */
    public abstract suspend fun setBusinessStartPage(startPage: InputBusinessStartPage? = null): TdlResult<Ok>

    /**
     * Changes accent color and background custom emoji of a channel chat. Requires canChangeInfo administrator right.
     *
     * @param chatId Chat identifier.
     * @param accentColorId Identifier of the accent color to use. The chat must have at least accentColor.minChannelChatBoostLevel boost level to pass the corresponding color.
     * @param backgroundCustomEmojiId Identifier of a custom emoji to be shown on the reply header and link preview background; 0 if none. Use chatBoostLevelFeatures.canSetBackgroundCustomEmoji to check whether a custom emoji can be set.
     */
    public abstract suspend fun setChatAccentColor(
        chatId: Long,
        accentColorId: Int,
        backgroundCustomEmojiId: Long,
    ): TdlResult<Ok>

    /**
     * Changes story list in which stories from the chat are shown.
     *
     * @param chatId Identifier of the chat that posted stories.
     * @param storyList New list for active stories posted by the chat.
     */
    public abstract suspend fun setChatActiveStoriesList(chatId: Long, storyList: StoryList): TdlResult<Ok>

    /**
     * Changes affiliate program for a bot.
     *
     * @param chatId Identifier of the chat with an owned bot for which affiliate program is changed.
     * @param parameters Parameters of the affiliate program; pass null to close the currently active program. If there is an active program, then commission and program duration can only be increased. If the active program is scheduled to be closed, then it can't be changed anymore.
     */
    public abstract suspend fun setChatAffiliateProgram(chatId: Long, parameters: AffiliateProgramParameters? = null): TdlResult<Ok>

    /**
     * Changes reactions, available in a chat. Available for basic groups, supergroups, and channels. Requires canChangeInfo member right.
     *
     * @param chatId Identifier of the chat.
     * @param availableReactions Reactions available in the chat. All explicitly specified emoji reactions must be active. In channel chats up to the chat's boost level custom emoji reactions can be explicitly specified.
     */
    public abstract suspend fun setChatAvailableReactions(chatId: Long, availableReactions: ChatAvailableReactions): TdlResult<Ok>

    /**
     * Sets the background in a specific chat. Supported only in private and secret chats with non-deleted users, and in chats with sufficient boost level and canChangeInfo administrator right.
     *
     * @param chatId Chat identifier.
     * @param background The input background to use; pass null to create a new filled or chat theme background.
     * @param type Background type; pass null to use default background type for the chosen background; backgroundTypeChatTheme isn't supported for private and secret chats. Use chatBoostLevelFeatures.chatThemeBackgroundCount and chatBoostLevelFeatures.canSetCustomBackground to check whether the background type can be set in the boosted chat.
     * @param darkThemeDimming Dimming of the background in dark themes, as a percentage; 0-100. Applied only to Wallpaper and Fill types of background.
     * @param onlyForSelf Pass true to set background only for self; pass false to set background for all chat users. Always false for backgrounds set in boosted chats. Background can be set for both users only by Telegram Premium users and if set background isn't of the type inputBackgroundPrevious.
     */
    public abstract suspend fun setChatBackground(
        chatId: Long,
        background: InputBackground? = null,
        type: BackgroundType? = null,
        darkThemeDimming: Int,
        onlyForSelf: Boolean,
    ): TdlResult<Ok>

    /**
     * Changes application-specific data associated with a chat.
     *
     * @param chatId Chat identifier.
     * @param clientData New value of clientData.
     */
    public abstract suspend fun setChatClientData(chatId: Long, clientData: String): TdlResult<Ok>

    /**
     * Changes information about a chat. Available for basic groups, supergroups, and channels. Requires canChangeInfo member right.
     *
     * @param chatId Identifier of the chat.
     * @param description New chat description; 0-255 characters.
     */
    public abstract suspend fun setChatDescription(chatId: Long, description: String): TdlResult<Ok>

    /**
     * Changes direct messages group settings for a channel chat; requires owner privileges in the chat.
     *
     * @param chatId Identifier of the channel chat.
     * @param isEnabled Pass true if the direct messages group is enabled for the channel chat; pass false otherwise.
     * @param paidMessageStarCount The new number of Telegram Stars that must be paid for each message that is sent to the direct messages chat unless the sender is an administrator of the channel chat; 0-getOption(&quot;paid_message_star_count_max&quot;). The channel will receive getOption(&quot;paid_message_earnings_per_mille&quot;) Telegram Stars for each 1000 Telegram Stars paid for message sending. Requires supergroupFullInfo.canEnablePaidMessages for positive amounts.
     */
    public abstract suspend fun setChatDirectMessagesGroup(
        chatId: Long,
        isEnabled: Boolean,
        paidMessageStarCount: Long,
    ): TdlResult<Ok>

    /**
     * Changes the discussion group of a channel chat; requires canChangeInfo administrator right in the channel if it is specified.
     *
     * @param chatId Identifier of the channel chat. Pass 0 to remove a link from the supergroup passed in the second argument to a linked channel chat (requires canPinMessages member right in the supergroup).
     * @param discussionChatId Identifier of a new channel's discussion group. Use 0 to remove the discussion group. Use the method getSuitableDiscussionChats to find all suitable groups. Basic group chats must be first upgraded to supergroup chats. If new chat members don't have access to old messages in the supergroup, then toggleSupergroupIsAllHistoryAvailable must be used first to change that.
     */
    public abstract suspend fun setChatDiscussionGroup(chatId: Long, discussionChatId: Long): TdlResult<Ok>

    /**
     * Changes the draft message in a chat.
     *
     * @param chatId Chat identifier.
     * @param messageThreadId If not 0, the message thread identifier in which the draft was changed.
     * @param draftMessage New draft message; pass null to remove the draft. All files in draft message content must be of the type inputFileLocal. Media thumbnails and captions are ignored.
     */
    public abstract suspend fun setChatDraftMessage(
        chatId: Long,
        messageThreadId: Long,
        draftMessage: DraftMessage? = null,
    ): TdlResult<Ok>

    /**
     * Changes the emoji status of a chat. Use chatBoostLevelFeatures.canSetEmojiStatus to check whether an emoji status can be set. Requires canChangeInfo administrator right.
     *
     * @param chatId Chat identifier.
     * @param emojiStatus New emoji status; pass null to remove emoji status.
     */
    public abstract suspend fun setChatEmojiStatus(chatId: Long, emojiStatus: EmojiStatus? = null): TdlResult<Ok>

    /**
     * Changes the location of a chat. Available only for some location-based supergroups, use supergroupFullInfo.canSetLocation to check whether the method is allowed to use.
     *
     * @param chatId Chat identifier.
     * @param location New location for the chat; must be valid and not null.
     */
    public abstract suspend fun setChatLocation(chatId: Long, location: ChatLocation): TdlResult<Ok>

    /**
     * Changes the status of a chat member; requires canInviteUsers member right to add a chat member, canPromoteMembers administrator right to change administrator rights of the member, and canRestrictMembers administrator right to change restrictions of a user. This function is currently not suitable for transferring chat ownership; use transferChatOwnership instead. Use addChatMember or banChatMember if some additional parameters needs to be passed.
     *
     * @param chatId Chat identifier.
     * @param memberId Member identifier. Chats can be only banned and unbanned in supergroups and channels.
     * @param status The new status of the member in the chat.
     */
    public abstract suspend fun setChatMemberStatus(
        chatId: Long,
        memberId: MessageSender,
        status: ChatMemberStatus,
    ): TdlResult<Ok>

    /**
     * Changes the message auto-delete or self-destruct (for secret chats) time in a chat. Requires changeInfo administrator right in basic groups, supergroups and channels. Message auto-delete time can't be changed in a chat with the current user (Saved Messages) and the chat 777000 (Telegram).
     *
     * @param chatId Chat identifier.
     * @param messageAutoDeleteTime New time value, in seconds; unless the chat is secret, it must be from 0 up to 365 * 86400 and be divisible by 86400. If 0, then messages aren't deleted automatically.
     */
    public abstract suspend fun setChatMessageAutoDeleteTime(chatId: Long, messageAutoDeleteTime: Int): TdlResult<Ok>

    /**
     * Selects a message sender to send messages in a chat.
     *
     * @param chatId Chat identifier.
     * @param messageSenderId New message sender for the chat.
     */
    public abstract suspend fun setChatMessageSender(chatId: Long, messageSenderId: MessageSender): TdlResult<Ok>

    /**
     * Changes the notification settings of a chat. Notification settings of a chat with the current user (Saved Messages) can't be changed.
     *
     * @param chatId Chat identifier.
     * @param notificationSettings New notification settings for the chat. If the chat is muted for more than 366 days, it is considered to be muted forever.
     */
    public abstract suspend fun setChatNotificationSettings(chatId: Long, notificationSettings: ChatNotificationSettings): TdlResult<Ok>

    /**
     * Changes the amount of Telegram Stars that must be paid to send a message to a supergroup chat; requires canRestrictMembers administrator right and supergroupFullInfo.canEnablePaidMessages.
     *
     * @param chatId Identifier of the supergroup chat.
     * @param paidMessageStarCount The new number of Telegram Stars that must be paid for each message that is sent to the supergroup chat unless the sender is an administrator of the chat; 0-getOption(&quot;paid_message_star_count_max&quot;). The supergroup will receive getOption(&quot;paid_message_earnings_per_mille&quot;) Telegram Stars for each 1000 Telegram Stars paid for message sending.
     */
    public abstract suspend fun setChatPaidMessageStarCount(chatId: Long, paidMessageStarCount: Long): TdlResult<Ok>

    /**
     * Changes the chat members permissions. Supported only for basic groups and supergroups. Requires canRestrictMembers administrator right.
     *
     * @param chatId Chat identifier.
     * @param permissions New non-administrator members permissions in the chat.
     */
    public abstract suspend fun setChatPermissions(chatId: Long, permissions: ChatPermissions): TdlResult<Ok>

    /**
     * Changes the photo of a chat. Supported only for basic groups, supergroups and channels. Requires canChangeInfo member right.
     *
     * @param chatId Chat identifier.
     * @param photo New chat photo; pass null to delete the chat photo.
     */
    public abstract suspend fun setChatPhoto(chatId: Long, photo: InputChatPhoto? = null): TdlResult<Ok>

    /**
     * Changes the list of pinned stories on a chat page; requires canEditStories right in the chat.
     *
     * @param chatId Identifier of the chat that posted the stories.
     * @param storyIds New list of pinned stories. All stories must be posted to the chat page first. There can be up to getOption(&quot;pinned_story_count_max&quot;) pinned stories on a chat page.
     */
    public abstract suspend fun setChatPinnedStories(chatId: Long, storyIds: IntArray): TdlResult<Ok>

    /**
     * Changes accent color and background custom emoji for profile of a supergroup or channel chat. Requires canChangeInfo administrator right.
     *
     * @param chatId Chat identifier.
     * @param profileAccentColorId Identifier of the accent color to use for profile; pass -1 if none. The chat must have at least profileAccentColor.minSupergroupChatBoostLevel for supergroups or profileAccentColor.minChannelChatBoostLevel for channels boost level to pass the corresponding color.
     * @param profileBackgroundCustomEmojiId Identifier of a custom emoji to be shown on the chat's profile photo background; 0 if none. Use chatBoostLevelFeatures.canSetProfileBackgroundCustomEmoji to check whether a custom emoji can be set.
     */
    public abstract suspend fun setChatProfileAccentColor(
        chatId: Long,
        profileAccentColorId: Int,
        profileBackgroundCustomEmojiId: Long,
    ): TdlResult<Ok>

    /**
     * Changes the slow mode delay of a chat. Available only for supergroups; requires canRestrictMembers right.
     *
     * @param chatId Chat identifier.
     * @param slowModeDelay New slow mode delay for the chat, in seconds; must be one of 0, 10, 30, 60, 300, 900, 3600.
     */
    public abstract suspend fun setChatSlowModeDelay(chatId: Long, slowModeDelay: Int): TdlResult<Ok>

    /**
     * Changes the chat theme. Supported only in private and secret chats.
     *
     * @param chatId Chat identifier.
     * @param themeName Name of the new chat theme; pass an empty string to return the default theme.
     */
    public abstract suspend fun setChatTheme(chatId: Long, themeName: String): TdlResult<Ok>

    /**
     * Changes the chat title. Supported only for basic groups, supergroups and channels. Requires canChangeInfo member right.
     *
     * @param chatId Chat identifier.
     * @param title New title of the chat; 1-128 characters.
     */
    public abstract suspend fun setChatTitle(chatId: Long, title: String): TdlResult<Ok>

    /**
     * Changes the list of close friends of the current user.
     *
     * @param userIds User identifiers of close friends; the users must be contacts of the current user.
     */
    public abstract suspend fun setCloseFriends(userIds: LongArray): TdlResult<Ok>

    /**
     * Sets the list of commands supported by the bot for the given user scope and language; for bots only.
     *
     * @param scope The scope to which the commands are relevant; pass null to change commands in the default bot command scope.
     * @param languageCode A two-letter ISO 639-1 language code. If empty, the commands will be applied to all users from the given scope, for which language there are no dedicated commands.
     * @param commands List of the bot's commands.
     */
    public abstract suspend fun setCommands(
        scope: BotCommandScope? = null,
        languageCode: String,
        commands: Array<BotCommand>,
    ): TdlResult<Ok>

    /**
     * Sets a custom emoji sticker set thumbnail.
     *
     * @param name Sticker set name. The sticker set must be owned by the current user.
     * @param customEmojiId Identifier of the custom emoji from the sticker set, which will be set as sticker set thumbnail; pass 0 to remove the sticker set thumbnail.
     */
    public abstract suspend fun setCustomEmojiStickerSetThumbnail(name: String, customEmojiId: Long): TdlResult<Ok>

    /**
     * Adds or changes a custom local language pack to the current localization target.
     *
     * @param info Information about the language pack. Language pack identifier must start with 'X', consist only of English letters, digits and hyphens, and must not exceed 64 characters. Can be called before authorization.
     * @param strings Strings of the new language pack.
     */
    public abstract suspend fun setCustomLanguagePack(info: LanguagePackInfo, strings: Array<LanguagePackString>): TdlResult<Ok>

    /**
     * Adds, edits or deletes a string in a custom local language pack. Can be called before authorization.
     *
     * @param languagePackId Identifier of a previously added custom local language pack in the current localization target.
     * @param newString New language pack string.
     */
    public abstract suspend fun setCustomLanguagePackString(languagePackId: String, newString: LanguagePackString): TdlResult<Ok>

    /**
     * Changes the database encryption key. Usually the encryption key is never changed and is stored in some OS keychain.
     *
     * @param newEncryptionKey New encryption key.
     */
    public abstract suspend fun setDatabaseEncryptionKey(newEncryptionKey: ByteArray): TdlResult<Ok>

    /**
     * Sets default background for chats; adds the background to the list of installed backgrounds.
     *
     * @param background The input background to use; pass null to create a new filled background.
     * @param type Background type; pass null to use the default type of the remote background; backgroundTypeChatTheme isn't supported.
     * @param forDarkTheme Pass true if the background is set for a dark theme.
     */
    public abstract suspend fun setDefaultBackground(
        background: InputBackground? = null,
        type: BackgroundType? = null,
        forDarkTheme: Boolean,
    ): TdlResult<Background>

    /**
     * Sets default administrator rights for adding the bot to channel chats; for bots only.
     *
     * @param defaultChannelAdministratorRights Default administrator rights for adding the bot to channels; pass null to remove default rights.
     */
    public abstract suspend fun setDefaultChannelAdministratorRights(defaultChannelAdministratorRights: ChatAdministratorRights? = null): TdlResult<Ok>

    /**
     * Sets default administrator rights for adding the bot to basic group and supergroup chats; for bots only.
     *
     * @param defaultGroupAdministratorRights Default administrator rights for adding the bot to basic group and supergroup chats; pass null to remove default rights.
     */
    public abstract suspend fun setDefaultGroupAdministratorRights(defaultGroupAdministratorRights: ChatAdministratorRights? = null): TdlResult<Ok>

    /**
     * Changes the default message auto-delete time for new chats.
     *
     * @param messageAutoDeleteTime New default message auto-delete time; must be from 0 up to 365 * 86400 and be divisible by 86400. If 0, then messages aren't deleted automatically.
     */
    public abstract suspend fun setDefaultMessageAutoDeleteTime(messageAutoDeleteTime: MessageAutoDeleteTime): TdlResult<Ok>

    /**
     * Changes type of default reaction for the current user.
     *
     * @param reactionType New type of the default reaction. The paid reaction can't be set as default.
     */
    public abstract suspend fun setDefaultReactionType(reactionType: ReactionType): TdlResult<Ok>

    /**
     * Changes the draft message in the topic in a channel direct messages chat administered by the current user.
     *
     * @param chatId Chat identifier.
     * @param topicId Topic identifier.
     * @param draftMessage New draft message; pass null to remove the draft. All files in draft message content must be of the type inputFileLocal. Media thumbnails and captions are ignored.
     */
    public abstract suspend fun setDirectMessagesChatTopicDraftMessage(
        chatId: Long,
        topicId: Long,
        draftMessage: DraftMessage? = null,
    ): TdlResult<Ok>

    /**
     * Changes the marked as unread state of the topic in a channel direct messages chat administered by the current user.
     *
     * @param chatId Chat identifier of the channel direct messages chat.
     * @param topicId Topic identifier.
     * @param isMarkedAsUnread New value of isMarkedAsUnread.
     */
    public abstract suspend fun setDirectMessagesChatTopicIsMarkedAsUnread(
        chatId: Long,
        topicId: Long,
        isMarkedAsUnread: Boolean,
    ): TdlResult<Ok>

    /**
     * Changes the emoji status of the current user; for Telegram Premium users only.
     *
     * @param emojiStatus New emoji status; pass null to switch to the default badge.
     */
    public abstract suspend fun setEmojiStatus(emojiStatus: EmojiStatus? = null): TdlResult<Ok>

    /**
     * Informs TDLib on a file generation progress.
     *
     * @param generationId The identifier of the generation process.
     * @param expectedSize Expected size of the generated file, in bytes; 0 if unknown.
     * @param localPrefixSize The number of bytes already generated.
     */
    public abstract suspend fun setFileGenerationProgress(
        generationId: Long,
        expectedSize: Long,
        localPrefixSize: Long,
    ): TdlResult<Ok>

    /**
     * Changes the notification settings of a forum topic.
     *
     * @param chatId Chat identifier.
     * @param messageThreadId Message thread identifier of the forum topic.
     * @param notificationSettings New notification settings for the forum topic. If the topic is muted for more than 366 days, it is considered to be muted forever.
     */
    public abstract suspend fun setForumTopicNotificationSettings(
        chatId: Long,
        messageThreadId: Long,
        notificationSettings: ChatNotificationSettings,
    ): TdlResult<Ok>

    /**
     * Updates the game score of the specified user in the game; for bots only.
     *
     * @param chatId The chat to which the message with the game belongs.
     * @param messageId Identifier of the message.
     * @param editMessage Pass true to edit the game message to include the current scoreboard.
     * @param userId User identifier.
     * @param score The new score.
     * @param force Pass true to update the score even if it decreases. If the score is 0, the user will be deleted from the high score table.
     */
    public abstract suspend fun setGameScore(
        chatId: Long,
        messageId: Long,
        editMessage: Boolean,
        userId: Long,
        score: Int,
        force: Boolean,
    ): TdlResult<Message>

    /**
     * Changes resale price of a unique gift owned by the current user.
     *
     * @param receivedGiftId Identifier of the unique gift.
     * @param resaleStarCount The new price for the unique gift; 0 or getOption(&quot;gift_resale_star_count_min&quot;)-getOption(&quot;gift_resale_star_count_max&quot;). Pass 0 to disallow gift resale. The current user will receive getOption(&quot;gift_resale_earnings_per_mille&quot;) Telegram Stars for each 1000 Telegram Stars paid for the gift.
     */
    public abstract suspend fun setGiftResalePrice(receivedGiftId: String, resaleStarCount: Long): TdlResult<Ok>

    /**
     * Changes settings for gift receiving for the current user.
     *
     * @param settings The new settings.
     */
    public abstract suspend fun setGiftSettings(settings: GiftSettings): TdlResult<Ok>

    /**
     * Informs TDLib that speaking state of a participant of an active group call has changed. Returns identifier of the participant if it is found.
     *
     * @param groupCallId Group call identifier.
     * @param audioSource Group call participant's synchronization audio source identifier, or 0 for the current user.
     * @param isSpeaking Pass true if the user is speaking.
     */
    public abstract suspend fun setGroupCallParticipantIsSpeaking(
        groupCallId: Int,
        audioSource: Int,
        isSpeaking: Boolean,
    ): TdlResult<MessageSender>

    /**
     * Changes volume level of a participant of an active group call. If the current user can manage the group call or is the owner of the group call, then the participant's volume level will be changed for all users with the default volume level.
     *
     * @param groupCallId Group call identifier.
     * @param participantId Participant identifier.
     * @param volumeLevel New participant's volume level; 1-20000 in hundreds of percents.
     */
    public abstract suspend fun setGroupCallParticipantVolumeLevel(
        groupCallId: Int,
        participantId: MessageSender,
        volumeLevel: Int,
    ): TdlResult<Ok>

    /**
     * Changes the period of inactivity after which sessions will automatically be terminated.
     *
     * @param inactiveSessionTtlDays New number of days of inactivity before sessions will be automatically terminated; 1-366 days.
     */
    public abstract suspend fun setInactiveSessionTtl(inactiveSessionTtlDays: Int): TdlResult<Ok>

    /**
     * Updates the game score of the specified user in a game; for bots only.
     *
     * @param inlineMessageId Inline message identifier.
     * @param editMessage Pass true to edit the game message to include the current scoreboard.
     * @param userId User identifier.
     * @param score The new score.
     * @param force Pass true to update the score even if it decreases. If the score is 0, the user will be deleted from the high score table.
     */
    public abstract suspend fun setInlineGameScore(
        inlineMessageId: String,
        editMessage: Boolean,
        userId: Long,
        score: Int,
        force: Boolean,
    ): TdlResult<Ok>

    /**
     * Sets new log stream for internal logging of TDLib. Can be called synchronously.
     *
     * @param logStream New log stream.
     */
    public abstract suspend fun setLogStream(logStream: LogStream): TdlResult<Ok>

    /**
     * Sets the verbosity level for a specified TDLib internal log tag. Can be called synchronously.
     *
     * @param tag Logging tag to change verbosity level.
     * @param newVerbosityLevel New verbosity level; 1-1024.
     */
    public abstract suspend fun setLogTagVerbosityLevel(tag: String, newVerbosityLevel: Int): TdlResult<Ok>

    /**
     * Sets the verbosity level of the internal logging of TDLib. Can be called synchronously.
     *
     * @param newVerbosityLevel New value of the verbosity level for logging. Value 0 corresponds to fatal errors, value 1 corresponds to errors, value 2 corresponds to warnings and debug warnings, value 3 corresponds to informational, value 4 corresponds to debug, value 5 corresponds to verbose debug, value greater than 5 and up to 1023 can be used to enable even more logging.
     */
    public abstract suspend fun setLogVerbosityLevel(newVerbosityLevel: Int): TdlResult<Ok>

    /**
     * Changes the login email address of the user. The email address can be changed only if the current user already has login email and passwordState.loginEmailAddressPattern is non-empty. The change will not be applied until the new login email address is confirmed with checkLoginEmailAddressCode. To use Apple ID/Google ID instead of an email address, call checkLoginEmailAddressCode directly.
     *
     * @param newLoginEmailAddress New login email address.
     */
    public abstract suspend fun setLoginEmailAddress(newLoginEmailAddress: String): TdlResult<EmailAddressAuthenticationCodeInfo>

    /**
     * Sets menu button for the given user or for all users; for bots only.
     *
     * @param userId Identifier of the user or 0 to set menu button for all users.
     * @param menuButton New menu button.
     */
    public abstract suspend fun setMenuButton(userId: Long, menuButton: BotMenuButton): TdlResult<Ok>

    /**
     * Changes the fact-check of a message. Can be only used if messageProperties.canSetFactCheck == true.
     *
     * @param chatId The channel chat the message belongs to.
     * @param messageId Identifier of the message.
     * @param text New text of the fact-check; 0-getOption(&quot;fact_check_length_max&quot;) characters; pass null to remove it. Only Bold, Italic, and TextUrl entities with https://t.me/ links are supported.
     */
    public abstract suspend fun setMessageFactCheck(
        chatId: Long,
        messageId: Long,
        text: FormattedText? = null,
    ): TdlResult<Ok>

    /**
     * Sets reactions on a message; for bots only.
     *
     * @param chatId Identifier of the chat to which the message belongs.
     * @param messageId Identifier of the message.
     * @param reactionTypes Types of the reaction to set; pass an empty list to remove the reactions.
     * @param isBig Pass true if the reactions are added with a big animation.
     */
    public abstract suspend fun setMessageReactions(
        chatId: Long,
        messageId: Long,
        reactionTypes: Array<ReactionType>,
        isBig: Boolean,
    ): TdlResult<Ok>

    /**
     * Changes the block list of a message sender. Currently, only users and supergroup chats can be blocked.
     *
     * @param senderId Identifier of a message sender to block/unblock.
     * @param blockList New block list for the message sender; pass null to unblock the message sender.
     */
    public abstract suspend fun setMessageSenderBlockList(senderId: MessageSender, blockList: BlockList? = null): TdlResult<Ok>

    /**
     * Changes the verification status of a user or a chat by an owned bot.
     *
     * @param botUserId Identifier of the owned bot, which will verify the user or the chat.
     * @param verifiedId Identifier of the user or the supergroup or channel chat, which will be verified by the bot.
     * @param customDescription Custom description of verification reason; 0-getOption(&quot;bot_verification_custom_description_length_max&quot;). If empty, then &quot;was verified by organization &quot;organization_name&quot;&quot; will be used as description. Can be specified only if the bot is allowed to provide custom description.
     */
    public abstract suspend fun setMessageSenderBotVerification(
        botUserId: Long,
        verifiedId: MessageSender,
        customDescription: String,
    ): TdlResult<Ok>

    /**
     * Changes the first and last name of the current user.
     *
     * @param firstName The new value of the first name for the current user; 1-64 characters.
     * @param lastName The new value of the optional last name for the current user; 0-64 characters.
     */
    public abstract suspend fun setName(firstName: String, lastName: String): TdlResult<Ok>

    /**
     * Sets the current network type. Can be called before authorization. Calling this method forces all network connections to reopen, mitigating the delay in switching between different networks, so it must be called whenever the network is changed, even if the network type remains the same. Network type is used to check whether the library can use the network at all and also for collecting detailed network data usage statistics.
     *
     * @param type The new network type; pass null to set network type to networkTypeOther.
     */
    public abstract suspend fun setNetworkType(type: NetworkType? = null): TdlResult<Ok>

    /**
     * Changes privacy settings for new chat creation; can be used only if getOption(&quot;can_set_new_chat_privacy_settings&quot;).
     *
     * @param settings New settings.
     */
    public abstract suspend fun setNewChatPrivacySettings(settings: NewChatPrivacySettings): TdlResult<Ok>

    /**
     * Sets the value of an option. (Check the list of available options on https://core.telegram.org/tdlib/options.) Only writable options can be set. Can be called before authorization.
     *
     * @param name The name of the option.
     * @param value The new value of the option; pass null to reset option value to a default value.
     */
    public abstract suspend fun setOption(name: String, value: OptionValue? = null): TdlResult<Ok>

    /**
     * Changes type of paid message reaction of the current user on a message. The message must have paid reaction added by the current user.
     *
     * @param chatId Identifier of the chat to which the message belongs.
     * @param messageId Identifier of the message.
     * @param type New type of the paid reaction.
     */
    public abstract suspend fun setPaidMessageReactionType(
        chatId: Long,
        messageId: Long,
        type: PaidReactionType,
    ): TdlResult<Ok>

    /**
     * Adds an element to the user's Telegram Passport. May return an error with a message &quot;PHONE_VERIFICATION_NEEDED&quot; or &quot;EMAIL_VERIFICATION_NEEDED&quot; if the chosen phone number or the chosen email address must be verified first.
     *
     * @param element Input Telegram Passport element.
     * @param password The 2-step verification password of the current user.
     */
    public abstract suspend fun setPassportElement(element: InputPassportElement, password: String): TdlResult<PassportElement>

    /**
     * Informs the user that some of the elements in their Telegram Passport contain errors; for bots only. The user will not be able to resend the elements, until the errors are fixed.
     *
     * @param userId User identifier.
     * @param errors The errors.
     */
    public abstract suspend fun setPassportElementErrors(userId: Long, errors: Array<InputPassportElementError>): TdlResult<Ok>

    /**
     * Changes the 2-step verification password for the current user. If a new recovery email address is specified, then the change will not be applied until the new recovery email address is confirmed.
     *
     * @param oldPassword Previous 2-step verification password of the user.
     * @param newPassword New 2-step verification password of the user; may be empty to remove the password.
     * @param newHint New password hint; may be empty.
     * @param setRecoveryEmailAddress Pass true to change also the recovery email address.
     * @param newRecoveryEmailAddress New recovery email address; may be empty.
     */
    public abstract suspend fun setPassword(
        oldPassword: String,
        newPassword: String,
        newHint: String,
        setRecoveryEmailAddress: Boolean,
        newRecoveryEmailAddress: String,
    ): TdlResult<PasswordState>

    /**
     * Changes the personal chat of the current user.
     *
     * @param chatId Identifier of the new personal chat; pass 0 to remove the chat. Use getSuitablePersonalChats to get suitable chats.
     */
    public abstract suspend fun setPersonalChat(chatId: Long): TdlResult<Ok>

    /**
     * Changes the order of pinned chats.
     *
     * @param chatList Chat list in which to change the order of pinned chats.
     * @param chatIds The new list of pinned chats.
     */
    public abstract suspend fun setPinnedChats(chatList: ChatList, chatIds: LongArray): TdlResult<Ok>

    /**
     * Changes the order of pinned forum topics; requires canManageTopics right in the supergroup.
     *
     * @param chatId Chat identifier.
     * @param messageThreadIds The new list of pinned forum topics.
     */
    public abstract suspend fun setPinnedForumTopics(chatId: Long, messageThreadIds: LongArray): TdlResult<Ok>

    /**
     * Changes the list of pinned gifts on the current user's or the channel's profile page; requires canPostMessages administrator right in the channel chat.
     *
     * @param ownerId Identifier of the user or the channel chat that received the gifts.
     * @param receivedGiftIds New list of pinned gifts. All gifts must be upgraded and saved on the profile page first. There can be up to getOption(&quot;pinned_gift_count_max&quot;) pinned gifts.
     */
    public abstract suspend fun setPinnedGifts(ownerId: MessageSender, receivedGiftIds: Array<String>): TdlResult<Ok>

    /**
     * Changes the order of pinned Saved Messages topics.
     *
     * @param savedMessagesTopicIds Identifiers of the new pinned Saved Messages topics.
     */
    public abstract suspend fun setPinnedSavedMessagesTopics(savedMessagesTopicIds: LongArray): TdlResult<Ok>

    /**
     * Changes the user answer to a poll. A poll in quiz mode can be answered only once.
     *
     * @param chatId Identifier of the chat to which the poll belongs.
     * @param messageId Identifier of the message containing the poll.
     * @param optionIds 0-based identifiers of answer options, chosen by the user. User can choose more than 1 answer option only is the poll allows multiple answers.
     */
    public abstract suspend fun setPollAnswer(
        chatId: Long,
        messageId: Long,
        optionIds: IntArray,
    ): TdlResult<Ok>

    /**
     * Changes accent color and background custom emoji for profile of the current user; for Telegram Premium users only.
     *
     * @param profileAccentColorId Identifier of the accent color to use for profile; pass -1 if none.
     * @param profileBackgroundCustomEmojiId Identifier of a custom emoji to be shown on the user's profile photo background; 0 if none.
     */
    public abstract suspend fun setProfileAccentColor(profileAccentColorId: Int, profileBackgroundCustomEmojiId: Long): TdlResult<Ok>

    /**
     * Changes a profile photo for the current user.
     *
     * @param photo Profile photo to set.
     * @param isPublic Pass true to set the public photo, which will be visible even the main photo is hidden by privacy settings.
     */
    public abstract suspend fun setProfilePhoto(photo: InputChatPhoto, isPublic: Boolean): TdlResult<Ok>

    /**
     * Changes name of a quick reply shortcut.
     *
     * @param shortcutId Unique identifier of the quick reply shortcut.
     * @param name New name for the shortcut. Use checkQuickReplyShortcutName to check its validness.
     */
    public abstract suspend fun setQuickReplyShortcutName(shortcutId: Int, name: String): TdlResult<Ok>

    /**
     * Changes notification settings for reactions.
     *
     * @param notificationSettings The new notification settings for reactions.
     */
    public abstract suspend fun setReactionNotificationSettings(notificationSettings: ReactionNotificationSettings): TdlResult<Ok>

    /**
     * Changes privacy settings for message read date.
     *
     * @param settings New settings.
     */
    public abstract suspend fun setReadDatePrivacySettings(settings: ReadDatePrivacySettings): TdlResult<Ok>

    /**
     * Changes the 2-step verification recovery email address of the user. If a new recovery email address is specified, then the change will not be applied until the new recovery email address is confirmed. If newRecoveryEmailAddress is the same as the email address that is currently set up, this call succeeds immediately and aborts all other requests waiting for an email confirmation.
     *
     * @param password The 2-step verification password of the current user.
     * @param newRecoveryEmailAddress New recovery email address.
     */
    public abstract suspend fun setRecoveryEmailAddress(password: String, newRecoveryEmailAddress: String): TdlResult<PasswordState>

    /**
     * Changes label of a Saved Messages tag; for Telegram Premium users only.
     *
     * @param tag The tag which label will be changed.
     * @param label New label for the tag; 0-12 characters.
     */
    public abstract suspend fun setSavedMessagesTagLabel(tag: ReactionType, label: String): TdlResult<Ok>

    /**
     * Changes notification settings for chats of a given type.
     *
     * @param scope Types of chats for which to change the notification settings.
     * @param notificationSettings The new notification settings for the given scope.
     */
    public abstract suspend fun setScopeNotificationSettings(scope: NotificationSettingsScope, notificationSettings: ScopeNotificationSettings): TdlResult<Ok>

    /**
     * Changes the list of emojis corresponding to a sticker. The sticker must belong to a regular or custom emoji sticker set that is owned by the current user.
     *
     * @param sticker Sticker.
     * @param emojis New string with 1-20 emoji corresponding to the sticker.
     */
    public abstract suspend fun setStickerEmojis(sticker: InputFile, emojis: String): TdlResult<Ok>

    /**
     * Changes the list of keywords of a sticker. The sticker must belong to a regular or custom emoji sticker set that is owned by the current user.
     *
     * @param sticker Sticker.
     * @param keywords List of up to 20 keywords with total length up to 64 characters, which can be used to find the sticker.
     */
    public abstract suspend fun setStickerKeywords(sticker: InputFile, keywords: Array<String>): TdlResult<Ok>

    /**
     * Changes the mask position of a mask sticker. The sticker must belong to a mask sticker set that is owned by the current user.
     *
     * @param sticker Sticker.
     * @param maskPosition Position where the mask is placed; pass null to remove mask position.
     */
    public abstract suspend fun setStickerMaskPosition(sticker: InputFile, maskPosition: MaskPosition? = null): TdlResult<Ok>

    /**
     * Changes the position of a sticker in the set to which it belongs. The sticker set must be owned by the current user.
     *
     * @param sticker Sticker.
     * @param position New position of the sticker in the set, 0-based.
     */
    public abstract suspend fun setStickerPositionInSet(sticker: InputFile, position: Int): TdlResult<Ok>

    /**
     * Sets a sticker set thumbnail.
     *
     * @param userId Sticker set owner; ignored for regular users.
     * @param name Sticker set name. The sticker set must be owned by the current user.
     * @param thumbnail Thumbnail to set; pass null to remove the sticker set thumbnail.
     * @param format Format of the thumbnail; pass null if thumbnail is removed.
     */
    public abstract suspend fun setStickerSetThumbnail(
        userId: Long,
        name: String,
        thumbnail: InputFile? = null,
        format: StickerFormat? = null,
    ): TdlResult<Ok>

    /**
     * Sets a sticker set title.
     *
     * @param name Sticker set name. The sticker set must be owned by the current user.
     * @param title New sticker set title.
     */
    public abstract suspend fun setStickerSetTitle(name: String, title: String): TdlResult<Ok>

    /**
     * Changes privacy settings of a story. The method can be called only for stories posted on behalf of the current user and if story.canBeEdited == true.
     *
     * @param storyId Identifier of the story.
     * @param privacySettings The new privacy settings for the story.
     */
    public abstract suspend fun setStoryPrivacySettings(storyId: Int, privacySettings: StoryPrivacySettings): TdlResult<Ok>

    /**
     * Changes chosen reaction on a story that has already been sent.
     *
     * @param storyPosterChatId The identifier of the poster of the story.
     * @param storyId The identifier of the story.
     * @param reactionType Type of the reaction to set; pass null to remove the reaction. Custom emoji reactions can be used only by Telegram Premium users. Paid reactions can't be set.
     * @param updateRecentReactions Pass true if the reaction needs to be added to recent reactions.
     */
    public abstract suspend fun setStoryReaction(
        storyPosterChatId: Long,
        storyId: Int,
        reactionType: ReactionType? = null,
        updateRecentReactions: Boolean,
    ): TdlResult<Ok>

    /**
     * Changes the custom emoji sticker set of a supergroup; requires canChangeInfo administrator right. The chat must have at least chatBoostFeatures.minCustomEmojiStickerSetBoostLevel boost level to pass the corresponding color.
     *
     * @param supergroupId Identifier of the supergroup.
     * @param customEmojiStickerSetId New value of the custom emoji sticker set identifier for the supergroup. Use 0 to remove the custom emoji sticker set in the supergroup.
     */
    public abstract suspend fun setSupergroupCustomEmojiStickerSet(supergroupId: Long, customEmojiStickerSetId: Long): TdlResult<Ok>

    /**
     * Changes the sticker set of a supergroup; requires canChangeInfo administrator right.
     *
     * @param supergroupId Identifier of the supergroup.
     * @param stickerSetId New value of the supergroup sticker set identifier. Use 0 to remove the supergroup sticker set.
     */
    public abstract suspend fun setSupergroupStickerSet(supergroupId: Long, stickerSetId: Long): TdlResult<Ok>

    /**
     * Changes the number of times the supergroup must be boosted by a user to ignore slow mode and chat permission restrictions; requires canRestrictMembers administrator right.
     *
     * @param supergroupId Identifier of the supergroup.
     * @param unrestrictBoostCount New value of the unrestrictBoostCount supergroup setting; 0-8. Use 0 to remove the setting.
     */
    public abstract suspend fun setSupergroupUnrestrictBoostCount(supergroupId: Long, unrestrictBoostCount: Int): TdlResult<Ok>

    /**
     * Changes the editable username of a supergroup or channel, requires owner privileges in the supergroup or channel.
     *
     * @param supergroupId Identifier of the supergroup or channel.
     * @param username New value of the username. Use an empty string to remove the username. The username can't be completely removed if there is another active or disabled username.
     */
    public abstract suspend fun setSupergroupUsername(supergroupId: Long, username: String): TdlResult<Ok>

    /**
     * Sets the parameters for TDLib initialization. Works only when the current authorization state is authorizationStateWaitTdlibParameters.
     *
     * @param useTestDc Pass true to use Telegram test environment instead of the production environment.
     * @param databaseDirectory The path to the directory for the persistent database; if empty, the current working directory will be used.
     * @param filesDirectory The path to the directory for storing files; if empty, databaseDirectory will be used.
     * @param databaseEncryptionKey Encryption key for the database. If the encryption key is invalid, then an error with code 401 will be returned.
     * @param useFileDatabase Pass true to keep information about downloaded and uploaded files between application restarts.
     * @param useChatInfoDatabase Pass true to keep cache of users, basic groups, supergroups, channels and secret chats between restarts. Implies useFileDatabase.
     * @param useMessageDatabase Pass true to keep cache of chats and messages between restarts. Implies useChatInfoDatabase.
     * @param useSecretChats Pass true to enable support for secret chats.
     * @param apiId Application identifier for Telegram API access, which can be obtained at https://my.telegram.org.
     * @param apiHash Application identifier hash for Telegram API access, which can be obtained at https://my.telegram.org.
     * @param systemLanguageCode IETF language tag of the user's operating system language; must be non-empty.
     * @param deviceModel Model of the device the application is being run on; must be non-empty.
     * @param systemVersion Version of the operating system the application is being run on. If empty, the version is automatically detected by TDLib.
     * @param applicationVersion Application version; must be non-empty.
     */
    public abstract suspend fun setTdlibParameters(
        useTestDc: Boolean,
        databaseDirectory: String,
        filesDirectory: String,
        databaseEncryptionKey: ByteArray,
        useFileDatabase: Boolean,
        useChatInfoDatabase: Boolean,
        useMessageDatabase: Boolean,
        useSecretChats: Boolean,
        apiId: Int,
        apiHash: String,
        systemLanguageCode: String,
        deviceModel: String,
        systemVersion: String,
        applicationVersion: String,
    ): TdlResult<Ok>

    /**
     * Changes the emoji status of a user; for bots only.
     *
     * @param userId Identifier of the user.
     * @param emojiStatus New emoji status; pass null to switch to the default badge.
     */
    public abstract suspend fun setUserEmojiStatus(userId: Long, emojiStatus: EmojiStatus? = null): TdlResult<Ok>

    /**
     * Changes a personal profile photo of a contact user.
     *
     * @param userId User identifier.
     * @param photo Profile photo to set; pass null to delete the photo; inputChatPhotoPrevious isn't supported in this function.
     */
    public abstract suspend fun setUserPersonalProfilePhoto(userId: Long, photo: InputChatPhoto? = null): TdlResult<Ok>

    /**
     * Changes user privacy settings.
     *
     * @param setting The privacy setting.
     * @param rules The new privacy rules.
     */
    public abstract suspend fun setUserPrivacySettingRules(setting: UserPrivacySetting, rules: UserPrivacySettingRules): TdlResult<Ok>

    /**
     * Sets support information for the given user; for Telegram support only.
     *
     * @param userId User identifier.
     * @param message New information message.
     */
    public abstract suspend fun setUserSupportInfo(userId: Long, message: FormattedText): TdlResult<UserSupportInfo>

    /**
     * Changes the editable username of the current user.
     *
     * @param username The new value of the username. Use an empty string to remove the username. The username can't be completely removed if there is another active or disabled username.
     */
    public abstract suspend fun setUsername(username: String): TdlResult<Ok>

    /**
     * Changes default participant identifier, on whose behalf a video chat in the chat will be joined.
     *
     * @param chatId Chat identifier.
     * @param defaultParticipantId Default group call participant identifier to join the video chats.
     */
    public abstract suspend fun setVideoChatDefaultParticipant(chatId: Long, defaultParticipantId: MessageSender): TdlResult<Ok>

    /**
     * Sets title of a video chat; requires groupCall.canBeManaged right.
     *
     * @param groupCallId Group call identifier.
     * @param title New group call title; 1-64 characters.
     */
    public abstract suspend fun setVideoChatTitle(groupCallId: Int, title: String): TdlResult<Ok>

    /**
     * Shares a chat after pressing a keyboardButtonTypeRequestChat button with the bot.
     *
     * @param chatId Identifier of the chat with the bot.
     * @param messageId Identifier of the message with the button.
     * @param buttonId Identifier of the button.
     * @param sharedChatId Identifier of the shared chat.
     * @param onlyCheck Pass true to check that the chat can be shared by the button instead of actually sharing it. Doesn't check botIsMember and botAdministratorRights restrictions. If the bot must be a member, then all chats from getGroupsInCommon and all chats, where the user can add the bot, are suitable. In the latter case the bot will be automatically added to the chat. If the bot must be an administrator, then all chats, where the bot already has requested rights or can be added to administrators by the user, are suitable. In the latter case the bot will be automatically granted requested rights.
     */
    public abstract suspend fun shareChatWithBot(
        chatId: Long,
        messageId: Long,
        buttonId: Int,
        sharedChatId: Long,
        onlyCheck: Boolean,
    ): TdlResult<Ok>

    /**
     * Shares the phone number of the current user with a mutual contact. Supposed to be called when the user clicks on chatActionBarSharePhoneNumber.
     *
     * @param userId Identifier of the user with whom to share the phone number. The user must be a mutual contact.
     */
    public abstract suspend fun sharePhoneNumber(userId: Long): TdlResult<Ok>

    /**
     * Shares users after pressing a keyboardButtonTypeRequestUsers button with the bot.
     *
     * @param chatId Identifier of the chat with the bot.
     * @param messageId Identifier of the message with the button.
     * @param buttonId Identifier of the button.
     * @param sharedUserIds Identifiers of the shared users.
     * @param onlyCheck Pass true to check that the users can be shared by the button instead of actually sharing them.
     */
    public abstract suspend fun shareUsersWithBot(
        chatId: Long,
        messageId: Long,
        buttonId: Int,
        sharedUserIds: LongArray,
        onlyCheck: Boolean,
    ): TdlResult<Ok>

    /**
     * Starts recording of an active group call; for video chats only. Requires groupCall.canBeManaged right.
     *
     * @param groupCallId Group call identifier.
     * @param title Group call recording title; 0-64 characters.
     * @param recordVideo Pass true to record a video file instead of an audio file.
     * @param usePortraitOrientation Pass true to use portrait orientation for video instead of landscape one.
     */
    public abstract suspend fun startGroupCallRecording(
        groupCallId: Int,
        title: String,
        recordVideo: Boolean,
        usePortraitOrientation: Boolean,
    ): TdlResult<Ok>

    /**
     * Starts screen sharing in a joined group call. Returns join response payload for tgcalls.
     *
     * @param groupCallId Group call identifier.
     * @param audioSourceId Screen sharing audio channel synchronization source identifier; received from tgcalls.
     * @param payload Group call join payload; received from tgcalls.
     */
    public abstract suspend fun startGroupCallScreenSharing(
        groupCallId: Int,
        audioSourceId: Int,
        payload: String,
    ): TdlResult<Text>

    /**
     * Starts a scheduled video chat.
     *
     * @param groupCallId Group call identifier of the video chat.
     */
    public abstract suspend fun startScheduledVideoChat(groupCallId: Int): TdlResult<Ok>

    /**
     * Stops a poll sent on behalf of a business account; for bots only.
     *
     * @param businessConnectionId Unique identifier of business connection on behalf of which the message with the poll was sent.
     * @param chatId The chat the message belongs to.
     * @param messageId Identifier of the message containing the poll.
     * @param replyMarkup The new message reply markup; pass null if none.
     */
    public abstract suspend fun stopBusinessPoll(
        businessConnectionId: String,
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup? = null,
    ): TdlResult<BusinessMessage>

    /**
     * Stops a poll.
     *
     * @param chatId Identifier of the chat to which the poll belongs.
     * @param messageId Identifier of the message containing the poll. Use messageProperties.canBeEdited to check whether the poll can be stopped.
     * @param replyMarkup The new message reply markup; pass null if none; for bots only.
     */
    public abstract suspend fun stopPoll(
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup? = null,
    ): TdlResult<Ok>

    /**
     * Suggests a profile photo to another regular user with common messages and allowing non-paid messages.
     *
     * @param userId User identifier.
     * @param photo Profile photo to suggest; inputChatPhotoPrevious isn't supported in this function.
     */
    public abstract suspend fun suggestUserProfilePhoto(userId: Long, photo: InputChatPhoto): TdlResult<Ok>

    /**
     * Fetches the latest versions of all strings from a language pack in the current localization target from the server. This method doesn't need to be called explicitly for the current used/base language packs. Can be called before authorization.
     *
     * @param languagePackId Language pack identifier.
     */
    public abstract suspend fun synchronizeLanguagePack(languagePackId: String): TdlResult<Ok>

    /**
     * Terminates all other sessions of the current user.
     */
    public abstract suspend fun terminateAllOtherSessions(): TdlResult<Ok>

    /**
     * Terminates a session of the current user.
     *
     * @param sessionId Session identifier.
     */
    public abstract suspend fun terminateSession(sessionId: Long): TdlResult<Ok>

    /**
     * Returns the received bytes; for testing only. This is an offline method. Can be called before authorization.
     *
     * @param x Bytes to return.
     */
    public abstract suspend fun testCallBytes(x: ByteArray): TdlResult<TestBytes>

    /**
     * Does nothing; for testing only. This is an offline method. Can be called before authorization.
     */
    public abstract suspend fun testCallEmpty(): TdlResult<Ok>

    /**
     * Returns the received string; for testing only. This is an offline method. Can be called before authorization.
     *
     * @param x String to return.
     */
    public abstract suspend fun testCallString(x: String): TdlResult<TestString>

    /**
     * Returns the received vector of numbers; for testing only. This is an offline method. Can be called before authorization.
     *
     * @param x Vector of numbers to return.
     */
    public abstract suspend fun testCallVectorInt(x: IntArray): TdlResult<TestVectorInt>

    /**
     * Returns the received vector of objects containing a number; for testing only. This is an offline method. Can be called before authorization.
     *
     * @param x Vector of objects to return.
     */
    public abstract suspend fun testCallVectorIntObject(x: Array<TestInt>): TdlResult<TestVectorIntObject>

    /**
     * Returns the received vector of strings; for testing only. This is an offline method. Can be called before authorization.
     *
     * @param x Vector of strings to return.
     */
    public abstract suspend fun testCallVectorString(x: Array<String>): TdlResult<TestVectorString>

    /**
     * Returns the received vector of objects containing a string; for testing only. This is an offline method. Can be called before authorization.
     *
     * @param x Vector of objects to return.
     */
    public abstract suspend fun testCallVectorStringObject(x: Array<TestString>): TdlResult<TestVectorStringObject>

    /**
     * Forces an updates.getDifference call to the Telegram servers; for testing only.
     */
    public abstract suspend fun testGetDifference(): TdlResult<Ok>

    /**
     * Sends a simple network request to the Telegram servers; for testing only. Can be called before authorization.
     */
    public abstract suspend fun testNetwork(): TdlResult<Ok>

    /**
     * Sends a simple network request to the Telegram servers via proxy; for testing only. Can be called before authorization.
     *
     * @param server Proxy server domain or IP address.
     * @param port Proxy server port.
     * @param type Proxy type.
     * @param dcId Identifier of a datacenter with which to test connection.
     * @param timeout The maximum overall timeout for the request.
     */
    public abstract suspend fun testProxy(
        server: String,
        port: Int,
        type: ProxyType,
        dcId: Int,
        timeout: Double,
    ): TdlResult<Ok>

    /**
     * Returns the specified error and ensures that the Error object is used; for testing only. Can be called synchronously.
     *
     * @param error The error to be returned.
     */
    public abstract suspend fun testReturnError(error: Error): TdlResult<Error>

    /**
     * Returns the squared received number; for testing only. This is an offline method. Can be called before authorization.
     *
     * @param x Number to square.
     */
    public abstract suspend fun testSquareInt(x: Int): TdlResult<TestInt>

    /**
     * Does nothing and ensures that the Update object is used; for testing only. This is an offline method. Can be called before authorization.
     */
    public abstract suspend fun testUseUpdate(): TdlResult<Update>

    /**
     * Changes pause state of all files in the file download list.
     *
     * @param arePaused Pass true to pause all downloads; pass false to unpause them.
     */
    public abstract suspend fun toggleAllDownloadsArePaused(arePaused: Boolean): TdlResult<Ok>

    /**
     * Toggles whether the bot can manage emoji status of the current user.
     *
     * @param botUserId User identifier of the bot.
     * @param canManageEmojiStatus Pass true if the bot is allowed to change emoji status of the user; pass false otherwise.
     */
    public abstract suspend fun toggleBotCanManageEmojiStatus(botUserId: Long, canManageEmojiStatus: Boolean): TdlResult<Ok>

    /**
     * Adds or removes a bot to attachment and side menu. Bot can be added to the menu, only if userTypeBot.canBeAddedToAttachmentMenu == true.
     *
     * @param botUserId Bot's user identifier.
     * @param isAdded Pass true to add the bot to attachment menu; pass false to remove the bot from attachment menu.
     * @param allowWriteAccess Pass true if the current user allowed the bot to send them messages. Ignored if isAdded is false.
     */
    public abstract suspend fun toggleBotIsAddedToAttachmentMenu(
        botUserId: Long,
        isAdded: Boolean,
        allowWriteAccess: Boolean,
    ): TdlResult<Ok>

    /**
     * Changes active state for a username of a bot. The editable username can't be disabled. May return an error with a message &quot;USERNAMES_ACTIVE_TOO_MUCH&quot; if the maximum number of active usernames has been reached. Can be called only if userTypeBot.canBeEdited == true.
     *
     * @param botUserId Identifier of the target bot.
     * @param username The username to change.
     * @param isActive Pass true to activate the username; pass false to disable it.
     */
    public abstract suspend fun toggleBotUsernameIsActive(
        botUserId: Long,
        username: String,
        isActive: Boolean,
    ): TdlResult<Ok>

    /**
     * Pauses or resumes the connected business bot in a specific chat.
     *
     * @param chatId Chat identifier.
     * @param isPaused Pass true to pause the connected bot in the chat; pass false to resume the bot.
     */
    public abstract suspend fun toggleBusinessConnectedBotChatIsPaused(chatId: Long, isPaused: Boolean): TdlResult<Ok>

    /**
     * Changes the value of the default disableNotification parameter, used when a message is sent to a chat.
     *
     * @param chatId Chat identifier.
     * @param defaultDisableNotification New value of defaultDisableNotification.
     */
    public abstract suspend fun toggleChatDefaultDisableNotification(chatId: Long, defaultDisableNotification: Boolean): TdlResult<Ok>

    /**
     * Toggles whether chat folder tags are enabled.
     *
     * @param areTagsEnabled Pass true to enable folder tags; pass false to disable them.
     */
    public abstract suspend fun toggleChatFolderTags(areTagsEnabled: Boolean): TdlResult<Ok>

    /**
     * Toggles whether notifications for new gifts received by a channel chat are sent to the current user; requires canPostMessages administrator right in the chat.
     *
     * @param chatId Identifier of the channel chat.
     * @param areEnabled Pass true to enable notifications about new gifts owned by the channel chat; pass false to disable the notifications.
     */
    public abstract suspend fun toggleChatGiftNotifications(chatId: Long, areEnabled: Boolean): TdlResult<Ok>

    /**
     * Changes the ability of users to save, forward, or copy chat content. Supported only for basic groups, supergroups and channels. Requires owner privileges.
     *
     * @param chatId Chat identifier.
     * @param hasProtectedContent New value of hasProtectedContent.
     */
    public abstract suspend fun toggleChatHasProtectedContent(chatId: Long, hasProtectedContent: Boolean): TdlResult<Ok>

    /**
     * Changes the marked as unread state of a chat.
     *
     * @param chatId Chat identifier.
     * @param isMarkedAsUnread New value of isMarkedAsUnread.
     */
    public abstract suspend fun toggleChatIsMarkedAsUnread(chatId: Long, isMarkedAsUnread: Boolean): TdlResult<Ok>

    /**
     * Changes the pinned state of a chat. There can be up to getOption(&quot;pinned_chat_count_max&quot;)/getOption(&quot;pinned_archived_chat_count_max&quot;) pinned non-secret chats and the same number of secret chats in the main/archive chat list. The limit can be increased with Telegram Premium.
     *
     * @param chatList Chat list in which to change the pinned state of the chat.
     * @param chatId Chat identifier.
     * @param isPinned Pass true to pin the chat; pass false to unpin it.
     */
    public abstract suspend fun toggleChatIsPinned(
        chatList: ChatList,
        chatId: Long,
        isPinned: Boolean,
    ): TdlResult<Ok>

    /**
     * Changes the translatable state of a chat.
     *
     * @param chatId Chat identifier.
     * @param isTranslatable New value of isTranslatable.
     */
    public abstract suspend fun toggleChatIsTranslatable(chatId: Long, isTranslatable: Boolean): TdlResult<Ok>

    /**
     * Changes the viewAsTopics setting of a forum chat or Saved Messages.
     *
     * @param chatId Chat identifier.
     * @param viewAsTopics New value of viewAsTopics.
     */
    public abstract suspend fun toggleChatViewAsTopics(chatId: Long, viewAsTopics: Boolean): TdlResult<Ok>

    /**
     * Changes pause state of a file in the file download list.
     *
     * @param fileId Identifier of the downloaded file.
     * @param isPaused Pass true if the download is paused.
     */
    public abstract suspend fun toggleDownloadIsPaused(fileId: Int, isPaused: Boolean): TdlResult<Ok>

    /**
     * Toggles whether a topic is closed in a forum supergroup chat; requires canManageTopics right in the supergroup unless the user is creator of the topic.
     *
     * @param chatId Identifier of the chat.
     * @param messageThreadId Message thread identifier of the forum topic.
     * @param isClosed Pass true to close the topic; pass false to reopen it.
     */
    public abstract suspend fun toggleForumTopicIsClosed(
        chatId: Long,
        messageThreadId: Long,
        isClosed: Boolean,
    ): TdlResult<Ok>

    /**
     * Changes the pinned state of a forum topic; requires canManageTopics right in the supergroup. There can be up to getOption(&quot;pinned_forum_topic_count_max&quot;) pinned forum topics.
     *
     * @param chatId Chat identifier.
     * @param messageThreadId Message thread identifier of the forum topic.
     * @param isPinned Pass true to pin the topic; pass false to unpin it.
     */
    public abstract suspend fun toggleForumTopicIsPinned(
        chatId: Long,
        messageThreadId: Long,
        isPinned: Boolean,
    ): TdlResult<Ok>

    /**
     * Toggles whether a General topic is hidden in a forum supergroup chat; requires canManageTopics right in the supergroup.
     *
     * @param chatId Identifier of the chat.
     * @param isHidden Pass true to hide and close the General topic; pass false to unhide it.
     */
    public abstract suspend fun toggleGeneralForumTopicIsHidden(chatId: Long, isHidden: Boolean): TdlResult<Ok>

    /**
     * Toggles whether a gift is shown on the current user's or the channel's profile page; requires canPostMessages administrator right in the channel chat.
     *
     * @param receivedGiftId Identifier of the gift.
     * @param isSaved Pass true to display the gift on the user's or the channel's profile page; pass false to remove it from the profile page.
     */
    public abstract suspend fun toggleGiftIsSaved(receivedGiftId: String, isSaved: Boolean): TdlResult<Ok>

    /**
     * Toggles whether current user's video is enabled.
     *
     * @param groupCallId Group call identifier.
     * @param isMyVideoEnabled Pass true if the current user's video is enabled.
     */
    public abstract suspend fun toggleGroupCallIsMyVideoEnabled(groupCallId: Int, isMyVideoEnabled: Boolean): TdlResult<Ok>

    /**
     * Toggles whether current user's video is paused.
     *
     * @param groupCallId Group call identifier.
     * @param isMyVideoPaused Pass true if the current user's video is paused.
     */
    public abstract suspend fun toggleGroupCallIsMyVideoPaused(groupCallId: Int, isMyVideoPaused: Boolean): TdlResult<Ok>

    /**
     * Toggles whether a group call participant hand is rased; for video chats only.
     *
     * @param groupCallId Group call identifier.
     * @param participantId Participant identifier.
     * @param isHandRaised Pass true if the user's hand needs to be raised. Only self hand can be raised. Requires groupCall.canBeManaged right to lower other's hand.
     */
    public abstract suspend fun toggleGroupCallParticipantIsHandRaised(
        groupCallId: Int,
        participantId: MessageSender,
        isHandRaised: Boolean,
    ): TdlResult<Ok>

    /**
     * Toggles whether a participant of an active group call is muted, unmuted, or allowed to unmute themselves.
     *
     * @param groupCallId Group call identifier.
     * @param participantId Participant identifier.
     * @param isMuted Pass true to mute the user; pass false to unmute them.
     */
    public abstract suspend fun toggleGroupCallParticipantIsMuted(
        groupCallId: Int,
        participantId: MessageSender,
        isMuted: Boolean,
    ): TdlResult<Ok>

    /**
     * Pauses or unpauses screen sharing in a joined group call.
     *
     * @param groupCallId Group call identifier.
     * @param isPaused Pass true to pause screen sharing; pass false to unpause it.
     */
    public abstract suspend fun toggleGroupCallScreenSharingIsPaused(groupCallId: Int, isPaused: Boolean): TdlResult<Ok>

    /**
     * Toggles whether the current user has sponsored messages enabled. The setting has no effect for users without Telegram Premium for which sponsored messages are always enabled.
     *
     * @param hasSponsoredMessagesEnabled Pass true to enable sponsored messages for the current user; false to disable them.
     */
    public abstract suspend fun toggleHasSponsoredMessagesEnabled(hasSponsoredMessagesEnabled: Boolean): TdlResult<Ok>

    /**
     * Changes the pinned state of a Saved Messages topic. There can be up to getOption(&quot;pinned_saved_messages_topic_count_max&quot;) pinned topics. The limit can be increased with Telegram Premium.
     *
     * @param savedMessagesTopicId Identifier of Saved Messages topic to pin or unpin.
     * @param isPinned Pass true to pin the topic; pass false to unpin it.
     */
    public abstract suspend fun toggleSavedMessagesTopicIsPinned(savedMessagesTopicId: Long, isPinned: Boolean): TdlResult<Ok>

    /**
     * Toggles whether a session can accept incoming calls.
     *
     * @param sessionId Session identifier.
     * @param canAcceptCalls Pass true to allow accepting incoming calls by the session; pass false otherwise.
     */
    public abstract suspend fun toggleSessionCanAcceptCalls(sessionId: Long, canAcceptCalls: Boolean): TdlResult<Ok>

    /**
     * Toggles whether a session can accept incoming secret chats.
     *
     * @param sessionId Session identifier.
     * @param canAcceptSecretChats Pass true to allow accepting secret chats by the session; pass false otherwise.
     */
    public abstract suspend fun toggleSessionCanAcceptSecretChats(sessionId: Long, canAcceptSecretChats: Boolean): TdlResult<Ok>

    /**
     * Toggles whether a story is accessible after expiration. Can be called only if story.canToggleIsPostedToChatPage == true.
     *
     * @param storyPosterChatId Identifier of the chat that posted the story.
     * @param storyId Identifier of the story.
     * @param isPostedToChatPage Pass true to make the story accessible after expiration; pass false to make it private.
     */
    public abstract suspend fun toggleStoryIsPostedToChatPage(
        storyPosterChatId: Long,
        storyId: Int,
        isPostedToChatPage: Boolean,
    ): TdlResult<Ok>

    /**
     * Toggles whether sponsored messages are shown in the channel chat; requires owner privileges in the channel. The chat must have at least chatBoostFeatures.minSponsoredMessageDisableBoostLevel boost level to disable sponsored messages.
     *
     * @param supergroupId The identifier of the channel.
     * @param canHaveSponsoredMessages The new value of canHaveSponsoredMessages.
     */
    public abstract suspend fun toggleSupergroupCanHaveSponsoredMessages(supergroupId: Long, canHaveSponsoredMessages: Boolean): TdlResult<Ok>

    /**
     * Toggles whether aggressive anti-spam checks are enabled in the supergroup. Can be called only if supergroupFullInfo.canToggleAggressiveAntiSpam == true.
     *
     * @param supergroupId The identifier of the supergroup, which isn't a broadcast group.
     * @param hasAggressiveAntiSpamEnabled The new value of hasAggressiveAntiSpamEnabled.
     */
    public abstract suspend fun toggleSupergroupHasAggressiveAntiSpamEnabled(supergroupId: Long, hasAggressiveAntiSpamEnabled: Boolean): TdlResult<Ok>

    /**
     * Toggles whether messages are automatically translated in the channel chat; requires canChangeInfo administrator right in the channel. The chat must have at least chatBoostFeatures.minAutomaticTranslationBoostLevel boost level to enable automatic translation.
     *
     * @param supergroupId The identifier of the channel.
     * @param hasAutomaticTranslation The new value of hasAutomaticTranslation.
     */
    public abstract suspend fun toggleSupergroupHasAutomaticTranslation(supergroupId: Long, hasAutomaticTranslation: Boolean): TdlResult<Ok>

    /**
     * Toggles whether non-administrators can receive only administrators and bots using getSupergroupMembers or searchChatMembers. Can be called only if supergroupFullInfo.canHideMembers == true.
     *
     * @param supergroupId Identifier of the supergroup.
     * @param hasHiddenMembers New value of hasHiddenMembers.
     */
    public abstract suspend fun toggleSupergroupHasHiddenMembers(supergroupId: Long, hasHiddenMembers: Boolean): TdlResult<Ok>

    /**
     * Toggles whether the message history of a supergroup is available to new members; requires canChangeInfo member right.
     *
     * @param supergroupId The identifier of the supergroup.
     * @param isAllHistoryAvailable The new value of isAllHistoryAvailable.
     */
    public abstract suspend fun toggleSupergroupIsAllHistoryAvailable(supergroupId: Long, isAllHistoryAvailable: Boolean): TdlResult<Ok>

    /**
     * Upgrades supergroup to a broadcast group; requires owner privileges in the supergroup.
     *
     * @param supergroupId Identifier of the supergroup.
     */
    public abstract suspend fun toggleSupergroupIsBroadcastGroup(supergroupId: Long): TdlResult<Ok>

    /**
     * Toggles whether the supergroup is a forum; requires owner privileges in the supergroup. Discussion supergroups can't be converted to forums.
     *
     * @param supergroupId Identifier of the supergroup.
     * @param isForum New value of isForum.
     * @param hasForumTabs New value of hasForumTabs; ignored if isForum is false.
     */
    public abstract suspend fun toggleSupergroupIsForum(
        supergroupId: Long,
        isForum: Boolean,
        hasForumTabs: Boolean,
    ): TdlResult<Ok>

    /**
     * Toggles whether all users directly joining the supergroup need to be approved by supergroup administrators; requires canRestrictMembers administrator right.
     *
     * @param supergroupId Identifier of the supergroup that isn't a broadcast group.
     * @param joinByRequest New value of joinByRequest.
     */
    public abstract suspend fun toggleSupergroupJoinByRequest(supergroupId: Long, joinByRequest: Boolean): TdlResult<Ok>

    /**
     * Toggles whether joining is mandatory to send messages to a discussion supergroup; requires canRestrictMembers administrator right.
     *
     * @param supergroupId Identifier of the supergroup that isn't a broadcast group.
     * @param joinToSendMessages New value of joinToSendMessages.
     */
    public abstract suspend fun toggleSupergroupJoinToSendMessages(supergroupId: Long, joinToSendMessages: Boolean): TdlResult<Ok>

    /**
     * Toggles whether sender signature or link to the account is added to sent messages in a channel; requires canChangeInfo member right.
     *
     * @param supergroupId Identifier of the channel.
     * @param signMessages New value of signMessages.
     * @param showMessageSender New value of showMessageSender.
     */
    public abstract suspend fun toggleSupergroupSignMessages(
        supergroupId: Long,
        signMessages: Boolean,
        showMessageSender: Boolean,
    ): TdlResult<Ok>

    /**
     * Changes active state for a username of a supergroup or channel, requires owner privileges in the supergroup or channel. The editable username can't be disabled. May return an error with a message &quot;USERNAMES_ACTIVE_TOO_MUCH&quot; if the maximum number of active usernames has been reached.
     *
     * @param supergroupId Identifier of the supergroup or channel.
     * @param username The username to change.
     * @param isActive Pass true to activate the username; pass false to disable it.
     */
    public abstract suspend fun toggleSupergroupUsernameIsActive(
        supergroupId: Long,
        username: String,
        isActive: Boolean,
    ): TdlResult<Ok>

    /**
     * Changes active state for a username of the current user. The editable username can't be disabled. May return an error with a message &quot;USERNAMES_ACTIVE_TOO_MUCH&quot; if the maximum number of active usernames has been reached.
     *
     * @param username The username to change.
     * @param isActive Pass true to activate the username; pass false to disable it.
     */
    public abstract suspend fun toggleUsernameIsActive(username: String, isActive: Boolean): TdlResult<Ok>

    /**
     * Toggles whether the current user will receive a notification when the video chat starts; for scheduled video chats only.
     *
     * @param groupCallId Group call identifier.
     * @param enabledStartNotification New value of the enabledStartNotification setting.
     */
    public abstract suspend fun toggleVideoChatEnabledStartNotification(groupCallId: Int, enabledStartNotification: Boolean): TdlResult<Ok>

    /**
     * Toggles whether new participants of a video chat can be unmuted only by administrators of the video chat. Requires groupCall.canToggleMuteNewParticipants right.
     *
     * @param groupCallId Group call identifier.
     * @param muteNewParticipants New value of the muteNewParticipants setting.
     */
    public abstract suspend fun toggleVideoChatMuteNewParticipants(groupCallId: Int, muteNewParticipants: Boolean): TdlResult<Ok>

    /**
     * Transfer Telegram Stars from the business account to the business bot; for bots only.
     *
     * @param businessConnectionId Unique identifier of business connection.
     * @param starCount Number of Telegram Stars to transfer.
     */
    public abstract suspend fun transferBusinessAccountStars(businessConnectionId: String, starCount: Long): TdlResult<Ok>

    /**
     * Changes the owner of a chat; requires owner privileges in the chat. Use the method canTransferOwnership to check whether the ownership can be transferred from the current session. Available only for supergroups and channel chats.
     *
     * @param chatId Chat identifier.
     * @param userId Identifier of the user to which transfer the ownership. The ownership can't be transferred to a bot or to a deleted user.
     * @param password The 2-step verification password of the current user.
     */
    public abstract suspend fun transferChatOwnership(
        chatId: Long,
        userId: Long,
        password: String,
    ): TdlResult<Ok>

    /**
     * Sends an upgraded gift to another user or a channel chat.
     *
     * @param businessConnectionId Unique identifier of business connection on behalf of which to send the request; for bots only.
     * @param receivedGiftId Identifier of the gift.
     * @param newOwnerId Identifier of the user or the channel chat that will receive the gift.
     * @param starCount The amount of Telegram Stars required to pay for the transfer.
     */
    public abstract suspend fun transferGift(
        businessConnectionId: String,
        receivedGiftId: String,
        newOwnerId: MessageSender,
        starCount: Long,
    ): TdlResult<Ok>

    /**
     * Extracts text or caption of the given message and translates it to the given language. If the current user is a Telegram Premium user, then text formatting is preserved.
     *
     * @param chatId Identifier of the chat to which the message belongs.
     * @param messageId Identifier of the message.
     * @param toLanguageCode Language code of the language to which the message is translated. Must be one of &quot;af&quot;, &quot;sq&quot;, &quot;am&quot;, &quot;ar&quot;, &quot;hy&quot;, &quot;az&quot;, &quot;eu&quot;, &quot;be&quot;, &quot;bn&quot;, &quot;bs&quot;, &quot;bg&quot;, &quot;ca&quot;, &quot;ceb&quot;, &quot;zh-CN&quot;, &quot;zh&quot;, &quot;zh-Hans&quot;, &quot;zh-TW&quot;, &quot;zh-Hant&quot;, &quot;co&quot;, &quot;hr&quot;, &quot;cs&quot;, &quot;da&quot;, &quot;nl&quot;, &quot;en&quot;, &quot;eo&quot;, &quot;et&quot;, &quot;fi&quot;, &quot;fr&quot;, &quot;fy&quot;, &quot;gl&quot;, &quot;ka&quot;, &quot;de&quot;, &quot;el&quot;, &quot;gu&quot;, &quot;ht&quot;, &quot;ha&quot;, &quot;haw&quot;, &quot;he&quot;, &quot;iw&quot;, &quot;hi&quot;, &quot;hmn&quot;, &quot;hu&quot;, &quot;is&quot;, &quot;ig&quot;, &quot;id&quot;, &quot;in&quot;, &quot;ga&quot;, &quot;it&quot;, &quot;ja&quot;, &quot;jv&quot;, &quot;kn&quot;, &quot;kk&quot;, &quot;km&quot;, &quot;rw&quot;, &quot;ko&quot;, &quot;ku&quot;, &quot;ky&quot;, &quot;lo&quot;, &quot;la&quot;, &quot;lv&quot;, &quot;lt&quot;, &quot;lb&quot;, &quot;mk&quot;, &quot;mg&quot;, &quot;ms&quot;, &quot;ml&quot;, &quot;mt&quot;, &quot;mi&quot;, &quot;mr&quot;, &quot;mn&quot;, &quot;my&quot;, &quot;ne&quot;, &quot;no&quot;, &quot;ny&quot;, &quot;or&quot;, &quot;ps&quot;, &quot;fa&quot;, &quot;pl&quot;, &quot;pt&quot;, &quot;pa&quot;, &quot;ro&quot;, &quot;ru&quot;, &quot;sm&quot;, &quot;gd&quot;, &quot;sr&quot;, &quot;st&quot;, &quot;sn&quot;, &quot;sd&quot;, &quot;si&quot;, &quot;sk&quot;, &quot;sl&quot;, &quot;so&quot;, &quot;es&quot;, &quot;su&quot;, &quot;sw&quot;, &quot;sv&quot;, &quot;tl&quot;, &quot;tg&quot;, &quot;ta&quot;, &quot;tt&quot;, &quot;te&quot;, &quot;th&quot;, &quot;tr&quot;, &quot;tk&quot;, &quot;uk&quot;, &quot;ur&quot;, &quot;ug&quot;, &quot;uz&quot;, &quot;vi&quot;, &quot;cy&quot;, &quot;xh&quot;, &quot;yi&quot;, &quot;ji&quot;, &quot;yo&quot;, &quot;zu&quot;.
     */
    public abstract suspend fun translateMessageText(
        chatId: Long,
        messageId: Long,
        toLanguageCode: String,
    ): TdlResult<FormattedText>

    /**
     * Translates a text to the given language. If the current user is a Telegram Premium user, then text formatting is preserved.
     *
     * @param text Text to translate.
     * @param toLanguageCode Language code of the language to which the message is translated. Must be one of &quot;af&quot;, &quot;sq&quot;, &quot;am&quot;, &quot;ar&quot;, &quot;hy&quot;, &quot;az&quot;, &quot;eu&quot;, &quot;be&quot;, &quot;bn&quot;, &quot;bs&quot;, &quot;bg&quot;, &quot;ca&quot;, &quot;ceb&quot;, &quot;zh-CN&quot;, &quot;zh&quot;, &quot;zh-Hans&quot;, &quot;zh-TW&quot;, &quot;zh-Hant&quot;, &quot;co&quot;, &quot;hr&quot;, &quot;cs&quot;, &quot;da&quot;, &quot;nl&quot;, &quot;en&quot;, &quot;eo&quot;, &quot;et&quot;, &quot;fi&quot;, &quot;fr&quot;, &quot;fy&quot;, &quot;gl&quot;, &quot;ka&quot;, &quot;de&quot;, &quot;el&quot;, &quot;gu&quot;, &quot;ht&quot;, &quot;ha&quot;, &quot;haw&quot;, &quot;he&quot;, &quot;iw&quot;, &quot;hi&quot;, &quot;hmn&quot;, &quot;hu&quot;, &quot;is&quot;, &quot;ig&quot;, &quot;id&quot;, &quot;in&quot;, &quot;ga&quot;, &quot;it&quot;, &quot;ja&quot;, &quot;jv&quot;, &quot;kn&quot;, &quot;kk&quot;, &quot;km&quot;, &quot;rw&quot;, &quot;ko&quot;, &quot;ku&quot;, &quot;ky&quot;, &quot;lo&quot;, &quot;la&quot;, &quot;lv&quot;, &quot;lt&quot;, &quot;lb&quot;, &quot;mk&quot;, &quot;mg&quot;, &quot;ms&quot;, &quot;ml&quot;, &quot;mt&quot;, &quot;mi&quot;, &quot;mr&quot;, &quot;mn&quot;, &quot;my&quot;, &quot;ne&quot;, &quot;no&quot;, &quot;ny&quot;, &quot;or&quot;, &quot;ps&quot;, &quot;fa&quot;, &quot;pl&quot;, &quot;pt&quot;, &quot;pa&quot;, &quot;ro&quot;, &quot;ru&quot;, &quot;sm&quot;, &quot;gd&quot;, &quot;sr&quot;, &quot;st&quot;, &quot;sn&quot;, &quot;sd&quot;, &quot;si&quot;, &quot;sk&quot;, &quot;sl&quot;, &quot;so&quot;, &quot;es&quot;, &quot;su&quot;, &quot;sw&quot;, &quot;sv&quot;, &quot;tl&quot;, &quot;tg&quot;, &quot;ta&quot;, &quot;tt&quot;, &quot;te&quot;, &quot;th&quot;, &quot;tr&quot;, &quot;tk&quot;, &quot;uk&quot;, &quot;ur&quot;, &quot;ug&quot;, &quot;uz&quot;, &quot;vi&quot;, &quot;cy&quot;, &quot;xh&quot;, &quot;yi&quot;, &quot;ji&quot;, &quot;yo&quot;, &quot;zu&quot;.
     */
    public abstract suspend fun translateText(text: FormattedText, toLanguageCode: String): TdlResult<FormattedText>

    /**
     * Removes all pinned messages from a chat; requires canPinMessages member right if the chat is a basic group or supergroup, or canEditMessages administrator right if the chat is a channel.
     *
     * @param chatId Identifier of the chat.
     */
    public abstract suspend fun unpinAllChatMessages(chatId: Long): TdlResult<Ok>

    /**
     * Removes all pinned messages from the topic in a channel direct messages chat administered by the current user.
     *
     * @param chatId Identifier of the chat.
     * @param topicId Topic identifier.
     */
    public abstract suspend fun unpinAllDirectMessagesChatTopicMessages(chatId: Long, topicId: Long): TdlResult<Ok>

    /**
     * Removes all pinned messages from a forum topic; requires canPinMessages member right in the supergroup.
     *
     * @param chatId Identifier of the chat.
     * @param messageThreadId Message thread identifier in which messages will be unpinned.
     */
    public abstract suspend fun unpinAllMessageThreadMessages(chatId: Long, messageThreadId: Long): TdlResult<Ok>

    /**
     * Removes a pinned message from a chat; requires canPinMessages member right if the chat is a basic group or supergroup, or canEditMessages administrator right if the chat is a channel.
     *
     * @param chatId Identifier of the chat.
     * @param messageId Identifier of the removed pinned message.
     */
    public abstract suspend fun unpinChatMessage(chatId: Long, messageId: Long): TdlResult<Ok>

    /**
     * Creates a new supergroup from an existing basic group and sends a corresponding messageChatUpgradeTo and messageChatUpgradeFrom; requires owner privileges. Deactivates the original basic group.
     *
     * @param chatId Identifier of the chat to upgrade.
     */
    public abstract suspend fun upgradeBasicGroupChatToSupergroupChat(chatId: Long): TdlResult<Chat>

    /**
     * Upgrades a regular gift.
     *
     * @param businessConnectionId Unique identifier of business connection on behalf of which to send the request; for bots only.
     * @param receivedGiftId Identifier of the gift.
     * @param keepOriginalDetails Pass true to keep the original gift text, sender and receiver in the upgraded gift.
     * @param starCount The amount of Telegram Stars required to pay for the upgrade. It the gift has prepaidUpgradeStarCount &gt; 0, then pass 0, otherwise, pass gift.upgradeStarCount.
     */
    public abstract suspend fun upgradeGift(
        businessConnectionId: String,
        receivedGiftId: String,
        keepOriginalDetails: Boolean,
        starCount: Long,
    ): TdlResult<UpgradeGiftResult>

    /**
     * Uploads a file with a sticker; returns the uploaded file.
     *
     * @param userId Sticker file owner; ignored for regular users.
     * @param stickerFormat Sticker format.
     * @param sticker File file to upload; must fit in a 512x512 square. For WEBP stickers the file must be in WEBP or PNG format, which will be converted to WEBP server-side. See https://core.telegram.org/animated_stickers#technical-requirements for technical requirements.
     */
    public abstract suspend fun uploadStickerFile(
        userId: Long,
        stickerFormat: StickerFormat,
        sticker: InputFile,
    ): TdlResult<File>

    /**
     * Validates the order information provided by a user and returns the available shipping options for a flexible invoice.
     *
     * @param inputInvoice The invoice.
     * @param orderInfo The order information, provided by the user; pass null if empty.
     * @param allowSave Pass true to save the order information.
     */
    public abstract suspend fun validateOrderInfo(
        inputInvoice: InputInvoice,
        orderInfo: OrderInfo? = null,
        allowSave: Boolean,
    ): TdlResult<ValidatedOrderInfo>

    /**
     * Informs TDLib that messages are being viewed by the user. Sponsored messages must be marked as viewed only when the entire text of the message is shown on the screen (excluding the button). Many useful activities depend on whether the messages are currently being viewed or not (e.g., marking messages as read, incrementing a view counter, updating a view counter, removing deleted messages in supergroups and channels).
     *
     * @param chatId Chat identifier.
     * @param messageIds The identifiers of the messages being viewed.
     * @param source Source of the message view; pass null to guess the source based on chat open state.
     * @param forceRead Pass true to mark as read the specified messages even the chat is closed.
     */
    public abstract suspend fun viewMessages(
        chatId: Long,
        messageIds: LongArray,
        source: MessageSource? = null,
        forceRead: Boolean,
    ): TdlResult<Ok>

    /**
     * Informs TDLib that the user viewed detailed information about a Premium feature on the Premium features screen.
     *
     * @param feature The viewed premium feature.
     */
    public abstract suspend fun viewPremiumFeature(feature: PremiumFeature): TdlResult<Ok>

    /**
     * Informs TDLib that the user fully viewed a sponsored chat.
     *
     * @param sponsoredChatUniqueId Unique identifier of the sponsored chat.
     */
    public abstract suspend fun viewSponsoredChat(sponsoredChatUniqueId: Long): TdlResult<Ok>

    /**
     * Informs the server that some trending sticker sets have been viewed by the user.
     *
     * @param stickerSetIds Identifiers of viewed trending sticker sets.
     */
    public abstract suspend fun viewTrendingStickerSets(stickerSetIds: LongArray): TdlResult<Ok>

    /**
     * Writes a part of a generated file. This method is intended to be used only if the application has no direct access to TDLib's file system, because it is usually slower than a direct write to the destination file.
     *
     * @param generationId The identifier of the generation process.
     * @param offset The offset from which to write the data to the file.
     * @param data The data to write.
     */
    public abstract suspend fun writeGeneratedFilePart(
        generationId: Long,
        offset: Long,
        data: ByteArray,
    ): TdlResult<Ok>

    public companion object {
        /**
         * The Git commit hash of the TDLib.
         */
        public const val TDL_GIT_COMMIT_HASH: String = TdlEngine.GIT_COMMIT_HASH

        /**
         * The version of the TDLib.
         */
        public const val TDL_VERSION: String = TdlEngine.VERSION

        /**
         * Creates a new instance of the [TdlClient].
         */
        public fun create(): TdlClient {
            return serviceLocator.createClient()
        }
    }
}
