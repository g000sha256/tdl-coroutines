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
import org.drinkless.tdlib.TdApi

internal class TdlClientImpl(
    private val mapper: TdlMapper,
    private val repository: TdlRepository,
) : TdlClient() {
    override val allUpdates: Flow<Update>
        get() = repository.getUpdates(TdApi.Update::class) { mapper.map(it) }

    override val authorizationStateUpdates: Flow<UpdateAuthorizationState>
        get() = repository.getUpdates(TdApi.UpdateAuthorizationState::class) { mapper.map(it) }

    override val newMessageUpdates: Flow<UpdateNewMessage>
        get() = repository.getUpdates(TdApi.UpdateNewMessage::class) { mapper.map(it) }

    override val messageSendAcknowledgedUpdates: Flow<UpdateMessageSendAcknowledged>
        get() = repository.getUpdates(TdApi.UpdateMessageSendAcknowledged::class) { mapper.map(it) }

    override val messageSendSucceededUpdates: Flow<UpdateMessageSendSucceeded>
        get() = repository.getUpdates(TdApi.UpdateMessageSendSucceeded::class) { mapper.map(it) }

    override val messageSendFailedUpdates: Flow<UpdateMessageSendFailed>
        get() = repository.getUpdates(TdApi.UpdateMessageSendFailed::class) { mapper.map(it) }

    override val messageContentUpdates: Flow<UpdateMessageContent>
        get() = repository.getUpdates(TdApi.UpdateMessageContent::class) { mapper.map(it) }

    override val messageEditedUpdates: Flow<UpdateMessageEdited>
        get() = repository.getUpdates(TdApi.UpdateMessageEdited::class) { mapper.map(it) }

    override val messageIsPinnedUpdates: Flow<UpdateMessageIsPinned>
        get() = repository.getUpdates(TdApi.UpdateMessageIsPinned::class) { mapper.map(it) }

    override val messageInteractionInfoUpdates: Flow<UpdateMessageInteractionInfo>
        get() = repository.getUpdates(TdApi.UpdateMessageInteractionInfo::class) { mapper.map(it) }

    override val messageContentOpenedUpdates: Flow<UpdateMessageContentOpened>
        get() = repository.getUpdates(TdApi.UpdateMessageContentOpened::class) { mapper.map(it) }

    override val messageMentionReadUpdates: Flow<UpdateMessageMentionRead>
        get() = repository.getUpdates(TdApi.UpdateMessageMentionRead::class) { mapper.map(it) }

    override val messageUnreadReactionsUpdates: Flow<UpdateMessageUnreadReactions>
        get() = repository.getUpdates(TdApi.UpdateMessageUnreadReactions::class) { mapper.map(it) }

    override val messageFactCheckUpdates: Flow<UpdateMessageFactCheck>
        get() = repository.getUpdates(TdApi.UpdateMessageFactCheck::class) { mapper.map(it) }

    override val messageLiveLocationViewedUpdates: Flow<UpdateMessageLiveLocationViewed>
        get() = repository.getUpdates(TdApi.UpdateMessageLiveLocationViewed::class) { mapper.map(it) }

    override val videoPublishedUpdates: Flow<UpdateVideoPublished>
        get() = repository.getUpdates(TdApi.UpdateVideoPublished::class) { mapper.map(it) }

    override val newChatUpdates: Flow<UpdateNewChat>
        get() = repository.getUpdates(TdApi.UpdateNewChat::class) { mapper.map(it) }

    override val chatTitleUpdates: Flow<UpdateChatTitle>
        get() = repository.getUpdates(TdApi.UpdateChatTitle::class) { mapper.map(it) }

    override val chatPhotoUpdates: Flow<UpdateChatPhoto>
        get() = repository.getUpdates(TdApi.UpdateChatPhoto::class) { mapper.map(it) }

    override val chatAccentColorsUpdates: Flow<UpdateChatAccentColors>
        get() = repository.getUpdates(TdApi.UpdateChatAccentColors::class) { mapper.map(it) }

    override val chatPermissionsUpdates: Flow<UpdateChatPermissions>
        get() = repository.getUpdates(TdApi.UpdateChatPermissions::class) { mapper.map(it) }

    override val chatLastMessageUpdates: Flow<UpdateChatLastMessage>
        get() = repository.getUpdates(TdApi.UpdateChatLastMessage::class) { mapper.map(it) }

    override val chatPositionUpdates: Flow<UpdateChatPosition>
        get() = repository.getUpdates(TdApi.UpdateChatPosition::class) { mapper.map(it) }

    override val chatAddedToListUpdates: Flow<UpdateChatAddedToList>
        get() = repository.getUpdates(TdApi.UpdateChatAddedToList::class) { mapper.map(it) }

    override val chatRemovedFromListUpdates: Flow<UpdateChatRemovedFromList>
        get() = repository.getUpdates(TdApi.UpdateChatRemovedFromList::class) { mapper.map(it) }

    override val chatReadInboxUpdates: Flow<UpdateChatReadInbox>
        get() = repository.getUpdates(TdApi.UpdateChatReadInbox::class) { mapper.map(it) }

    override val chatReadOutboxUpdates: Flow<UpdateChatReadOutbox>
        get() = repository.getUpdates(TdApi.UpdateChatReadOutbox::class) { mapper.map(it) }

    override val chatActionBarUpdates: Flow<UpdateChatActionBar>
        get() = repository.getUpdates(TdApi.UpdateChatActionBar::class) { mapper.map(it) }

    override val chatBusinessBotManageBarUpdates: Flow<UpdateChatBusinessBotManageBar>
        get() = repository.getUpdates(TdApi.UpdateChatBusinessBotManageBar::class) { mapper.map(it) }

    override val chatAvailableReactionsUpdates: Flow<UpdateChatAvailableReactions>
        get() = repository.getUpdates(TdApi.UpdateChatAvailableReactions::class) { mapper.map(it) }

    override val chatDraftMessageUpdates: Flow<UpdateChatDraftMessage>
        get() = repository.getUpdates(TdApi.UpdateChatDraftMessage::class) { mapper.map(it) }

    override val chatEmojiStatusUpdates: Flow<UpdateChatEmojiStatus>
        get() = repository.getUpdates(TdApi.UpdateChatEmojiStatus::class) { mapper.map(it) }

    override val chatMessageSenderUpdates: Flow<UpdateChatMessageSender>
        get() = repository.getUpdates(TdApi.UpdateChatMessageSender::class) { mapper.map(it) }

    override val chatMessageAutoDeleteTimeUpdates: Flow<UpdateChatMessageAutoDeleteTime>
        get() = repository.getUpdates(TdApi.UpdateChatMessageAutoDeleteTime::class) { mapper.map(it) }

    override val chatNotificationSettingsUpdates: Flow<UpdateChatNotificationSettings>
        get() = repository.getUpdates(TdApi.UpdateChatNotificationSettings::class) { mapper.map(it) }

    override val chatPendingJoinRequestsUpdates: Flow<UpdateChatPendingJoinRequests>
        get() = repository.getUpdates(TdApi.UpdateChatPendingJoinRequests::class) { mapper.map(it) }

    override val chatReplyMarkupUpdates: Flow<UpdateChatReplyMarkup>
        get() = repository.getUpdates(TdApi.UpdateChatReplyMarkup::class) { mapper.map(it) }

    override val chatBackgroundUpdates: Flow<UpdateChatBackground>
        get() = repository.getUpdates(TdApi.UpdateChatBackground::class) { mapper.map(it) }

    override val chatThemeUpdates: Flow<UpdateChatTheme>
        get() = repository.getUpdates(TdApi.UpdateChatTheme::class) { mapper.map(it) }

    override val chatUnreadMentionCountUpdates: Flow<UpdateChatUnreadMentionCount>
        get() = repository.getUpdates(TdApi.UpdateChatUnreadMentionCount::class) { mapper.map(it) }

    override val chatUnreadReactionCountUpdates: Flow<UpdateChatUnreadReactionCount>
        get() = repository.getUpdates(TdApi.UpdateChatUnreadReactionCount::class) { mapper.map(it) }

    override val chatVideoChatUpdates: Flow<UpdateChatVideoChat>
        get() = repository.getUpdates(TdApi.UpdateChatVideoChat::class) { mapper.map(it) }

    override val chatDefaultDisableNotificationUpdates: Flow<UpdateChatDefaultDisableNotification>
        get() = repository.getUpdates(TdApi.UpdateChatDefaultDisableNotification::class) { mapper.map(it) }

    override val chatHasProtectedContentUpdates: Flow<UpdateChatHasProtectedContent>
        get() = repository.getUpdates(TdApi.UpdateChatHasProtectedContent::class) { mapper.map(it) }

    override val chatIsTranslatableUpdates: Flow<UpdateChatIsTranslatable>
        get() = repository.getUpdates(TdApi.UpdateChatIsTranslatable::class) { mapper.map(it) }

    override val chatIsMarkedAsUnreadUpdates: Flow<UpdateChatIsMarkedAsUnread>
        get() = repository.getUpdates(TdApi.UpdateChatIsMarkedAsUnread::class) { mapper.map(it) }

    override val chatViewAsTopicsUpdates: Flow<UpdateChatViewAsTopics>
        get() = repository.getUpdates(TdApi.UpdateChatViewAsTopics::class) { mapper.map(it) }

    override val chatBlockListUpdates: Flow<UpdateChatBlockList>
        get() = repository.getUpdates(TdApi.UpdateChatBlockList::class) { mapper.map(it) }

    override val chatHasScheduledMessagesUpdates: Flow<UpdateChatHasScheduledMessages>
        get() = repository.getUpdates(TdApi.UpdateChatHasScheduledMessages::class) { mapper.map(it) }

    override val chatFoldersUpdates: Flow<UpdateChatFolders>
        get() = repository.getUpdates(TdApi.UpdateChatFolders::class) { mapper.map(it) }

    override val chatOnlineMemberCountUpdates: Flow<UpdateChatOnlineMemberCount>
        get() = repository.getUpdates(TdApi.UpdateChatOnlineMemberCount::class) { mapper.map(it) }

    override val savedMessagesTopicUpdates: Flow<UpdateSavedMessagesTopic>
        get() = repository.getUpdates(TdApi.UpdateSavedMessagesTopic::class) { mapper.map(it) }

    override val savedMessagesTopicCountUpdates: Flow<UpdateSavedMessagesTopicCount>
        get() = repository.getUpdates(TdApi.UpdateSavedMessagesTopicCount::class) { mapper.map(it) }

    override val directMessagesChatTopicUpdates: Flow<UpdateDirectMessagesChatTopic>
        get() = repository.getUpdates(TdApi.UpdateDirectMessagesChatTopic::class) { mapper.map(it) }

    override val topicMessageCountUpdates: Flow<UpdateTopicMessageCount>
        get() = repository.getUpdates(TdApi.UpdateTopicMessageCount::class) { mapper.map(it) }

    override val quickReplyShortcutUpdates: Flow<UpdateQuickReplyShortcut>
        get() = repository.getUpdates(TdApi.UpdateQuickReplyShortcut::class) { mapper.map(it) }

    override val quickReplyShortcutDeletedUpdates: Flow<UpdateQuickReplyShortcutDeleted>
        get() = repository.getUpdates(TdApi.UpdateQuickReplyShortcutDeleted::class) { mapper.map(it) }

    override val quickReplyShortcutsUpdates: Flow<UpdateQuickReplyShortcuts>
        get() = repository.getUpdates(TdApi.UpdateQuickReplyShortcuts::class) { mapper.map(it) }

    override val quickReplyShortcutMessagesUpdates: Flow<UpdateQuickReplyShortcutMessages>
        get() = repository.getUpdates(TdApi.UpdateQuickReplyShortcutMessages::class) { mapper.map(it) }

    override val forumTopicInfoUpdates: Flow<UpdateForumTopicInfo>
        get() = repository.getUpdates(TdApi.UpdateForumTopicInfo::class) { mapper.map(it) }

    override val forumTopicUpdates: Flow<UpdateForumTopic>
        get() = repository.getUpdates(TdApi.UpdateForumTopic::class) { mapper.map(it) }

    override val scopeNotificationSettingsUpdates: Flow<UpdateScopeNotificationSettings>
        get() = repository.getUpdates(TdApi.UpdateScopeNotificationSettings::class) { mapper.map(it) }

    override val reactionNotificationSettingsUpdates: Flow<UpdateReactionNotificationSettings>
        get() = repository.getUpdates(TdApi.UpdateReactionNotificationSettings::class) { mapper.map(it) }

    override val notificationUpdates: Flow<UpdateNotification>
        get() = repository.getUpdates(TdApi.UpdateNotification::class) { mapper.map(it) }

    override val notificationGroupUpdates: Flow<UpdateNotificationGroup>
        get() = repository.getUpdates(TdApi.UpdateNotificationGroup::class) { mapper.map(it) }

    override val activeNotificationsUpdates: Flow<UpdateActiveNotifications>
        get() = repository.getUpdates(TdApi.UpdateActiveNotifications::class) { mapper.map(it) }

    override val havePendingNotificationsUpdates: Flow<UpdateHavePendingNotifications>
        get() = repository.getUpdates(TdApi.UpdateHavePendingNotifications::class) { mapper.map(it) }

    override val deleteMessagesUpdates: Flow<UpdateDeleteMessages>
        get() = repository.getUpdates(TdApi.UpdateDeleteMessages::class) { mapper.map(it) }

    override val chatActionUpdates: Flow<UpdateChatAction>
        get() = repository.getUpdates(TdApi.UpdateChatAction::class) { mapper.map(it) }

    override val userStatusUpdates: Flow<UpdateUserStatus>
        get() = repository.getUpdates(TdApi.UpdateUserStatus::class) { mapper.map(it) }

    override val userUpdates: Flow<UpdateUser>
        get() = repository.getUpdates(TdApi.UpdateUser::class) { mapper.map(it) }

    override val basicGroupUpdates: Flow<UpdateBasicGroup>
        get() = repository.getUpdates(TdApi.UpdateBasicGroup::class) { mapper.map(it) }

    override val supergroupUpdates: Flow<UpdateSupergroup>
        get() = repository.getUpdates(TdApi.UpdateSupergroup::class) { mapper.map(it) }

    override val secretChatUpdates: Flow<UpdateSecretChat>
        get() = repository.getUpdates(TdApi.UpdateSecretChat::class) { mapper.map(it) }

    override val userFullInfoUpdates: Flow<UpdateUserFullInfo>
        get() = repository.getUpdates(TdApi.UpdateUserFullInfo::class) { mapper.map(it) }

    override val basicGroupFullInfoUpdates: Flow<UpdateBasicGroupFullInfo>
        get() = repository.getUpdates(TdApi.UpdateBasicGroupFullInfo::class) { mapper.map(it) }

    override val supergroupFullInfoUpdates: Flow<UpdateSupergroupFullInfo>
        get() = repository.getUpdates(TdApi.UpdateSupergroupFullInfo::class) { mapper.map(it) }

    override val serviceNotificationUpdates: Flow<UpdateServiceNotification>
        get() = repository.getUpdates(TdApi.UpdateServiceNotification::class) { mapper.map(it) }

    override val fileUpdates: Flow<UpdateFile>
        get() = repository.getUpdates(TdApi.UpdateFile::class) { mapper.map(it) }

    override val fileGenerationStartUpdates: Flow<UpdateFileGenerationStart>
        get() = repository.getUpdates(TdApi.UpdateFileGenerationStart::class) { mapper.map(it) }

    override val fileGenerationStopUpdates: Flow<UpdateFileGenerationStop>
        get() = repository.getUpdates(TdApi.UpdateFileGenerationStop::class) { mapper.map(it) }

    override val fileDownloadsUpdates: Flow<UpdateFileDownloads>
        get() = repository.getUpdates(TdApi.UpdateFileDownloads::class) { mapper.map(it) }

    override val fileAddedToDownloadsUpdates: Flow<UpdateFileAddedToDownloads>
        get() = repository.getUpdates(TdApi.UpdateFileAddedToDownloads::class) { mapper.map(it) }

    override val fileDownloadUpdates: Flow<UpdateFileDownload>
        get() = repository.getUpdates(TdApi.UpdateFileDownload::class) { mapper.map(it) }

    override val fileRemovedFromDownloadsUpdates: Flow<UpdateFileRemovedFromDownloads>
        get() = repository.getUpdates(TdApi.UpdateFileRemovedFromDownloads::class) { mapper.map(it) }

    override val applicationVerificationRequiredUpdates: Flow<UpdateApplicationVerificationRequired>
        get() = repository.getUpdates(TdApi.UpdateApplicationVerificationRequired::class) { mapper.map(it) }

    override val applicationRecaptchaVerificationRequiredUpdates:
            Flow<UpdateApplicationRecaptchaVerificationRequired>
        get() = repository.getUpdates(TdApi.UpdateApplicationRecaptchaVerificationRequired::class) { mapper.map(it) }

    override val callUpdates: Flow<UpdateCall>
        get() = repository.getUpdates(TdApi.UpdateCall::class) { mapper.map(it) }

    override val groupCallUpdates: Flow<UpdateGroupCall>
        get() = repository.getUpdates(TdApi.UpdateGroupCall::class) { mapper.map(it) }

    override val groupCallParticipantUpdates: Flow<UpdateGroupCallParticipant>
        get() = repository.getUpdates(TdApi.UpdateGroupCallParticipant::class) { mapper.map(it) }

    override val groupCallParticipantsUpdates: Flow<UpdateGroupCallParticipants>
        get() = repository.getUpdates(TdApi.UpdateGroupCallParticipants::class) { mapper.map(it) }

    override val groupCallVerificationStateUpdates: Flow<UpdateGroupCallVerificationState>
        get() = repository.getUpdates(TdApi.UpdateGroupCallVerificationState::class) { mapper.map(it) }

    override val newCallSignalingDataUpdates: Flow<UpdateNewCallSignalingData>
        get() = repository.getUpdates(TdApi.UpdateNewCallSignalingData::class) { mapper.map(it) }

    override val userPrivacySettingRulesUpdates: Flow<UpdateUserPrivacySettingRules>
        get() = repository.getUpdates(TdApi.UpdateUserPrivacySettingRules::class) { mapper.map(it) }

    override val unreadMessageCountUpdates: Flow<UpdateUnreadMessageCount>
        get() = repository.getUpdates(TdApi.UpdateUnreadMessageCount::class) { mapper.map(it) }

    override val unreadChatCountUpdates: Flow<UpdateUnreadChatCount>
        get() = repository.getUpdates(TdApi.UpdateUnreadChatCount::class) { mapper.map(it) }

    override val storyUpdates: Flow<UpdateStory>
        get() = repository.getUpdates(TdApi.UpdateStory::class) { mapper.map(it) }

    override val storyDeletedUpdates: Flow<UpdateStoryDeleted>
        get() = repository.getUpdates(TdApi.UpdateStoryDeleted::class) { mapper.map(it) }

    override val storyPostSucceededUpdates: Flow<UpdateStoryPostSucceeded>
        get() = repository.getUpdates(TdApi.UpdateStoryPostSucceeded::class) { mapper.map(it) }

    override val storyPostFailedUpdates: Flow<UpdateStoryPostFailed>
        get() = repository.getUpdates(TdApi.UpdateStoryPostFailed::class) { mapper.map(it) }

    override val chatActiveStoriesUpdates: Flow<UpdateChatActiveStories>
        get() = repository.getUpdates(TdApi.UpdateChatActiveStories::class) { mapper.map(it) }

    override val storyListChatCountUpdates: Flow<UpdateStoryListChatCount>
        get() = repository.getUpdates(TdApi.UpdateStoryListChatCount::class) { mapper.map(it) }

    override val storyStealthModeUpdates: Flow<UpdateStoryStealthMode>
        get() = repository.getUpdates(TdApi.UpdateStoryStealthMode::class) { mapper.map(it) }

    override val optionUpdates: Flow<UpdateOption>
        get() = repository.getUpdates(TdApi.UpdateOption::class) { mapper.map(it) }

    override val stickerSetUpdates: Flow<UpdateStickerSet>
        get() = repository.getUpdates(TdApi.UpdateStickerSet::class) { mapper.map(it) }

    override val installedStickerSetsUpdates: Flow<UpdateInstalledStickerSets>
        get() = repository.getUpdates(TdApi.UpdateInstalledStickerSets::class) { mapper.map(it) }

    override val trendingStickerSetsUpdates: Flow<UpdateTrendingStickerSets>
        get() = repository.getUpdates(TdApi.UpdateTrendingStickerSets::class) { mapper.map(it) }

    override val recentStickersUpdates: Flow<UpdateRecentStickers>
        get() = repository.getUpdates(TdApi.UpdateRecentStickers::class) { mapper.map(it) }

    override val favoriteStickersUpdates: Flow<UpdateFavoriteStickers>
        get() = repository.getUpdates(TdApi.UpdateFavoriteStickers::class) { mapper.map(it) }

    override val savedAnimationsUpdates: Flow<UpdateSavedAnimations>
        get() = repository.getUpdates(TdApi.UpdateSavedAnimations::class) { mapper.map(it) }

    override val savedNotificationSoundsUpdates: Flow<UpdateSavedNotificationSounds>
        get() = repository.getUpdates(TdApi.UpdateSavedNotificationSounds::class) { mapper.map(it) }

    override val defaultBackgroundUpdates: Flow<UpdateDefaultBackground>
        get() = repository.getUpdates(TdApi.UpdateDefaultBackground::class) { mapper.map(it) }

    override val chatThemesUpdates: Flow<UpdateChatThemes>
        get() = repository.getUpdates(TdApi.UpdateChatThemes::class) { mapper.map(it) }

    override val accentColorsUpdates: Flow<UpdateAccentColors>
        get() = repository.getUpdates(TdApi.UpdateAccentColors::class) { mapper.map(it) }

    override val profileAccentColorsUpdates: Flow<UpdateProfileAccentColors>
        get() = repository.getUpdates(TdApi.UpdateProfileAccentColors::class) { mapper.map(it) }

    override val languagePackStringsUpdates: Flow<UpdateLanguagePackStrings>
        get() = repository.getUpdates(TdApi.UpdateLanguagePackStrings::class) { mapper.map(it) }

    override val connectionStateUpdates: Flow<UpdateConnectionState>
        get() = repository.getUpdates(TdApi.UpdateConnectionState::class) { mapper.map(it) }

    override val freezeStateUpdates: Flow<UpdateFreezeState>
        get() = repository.getUpdates(TdApi.UpdateFreezeState::class) { mapper.map(it) }

    override val termsOfServiceUpdates: Flow<UpdateTermsOfService>
        get() = repository.getUpdates(TdApi.UpdateTermsOfService::class) { mapper.map(it) }

    override val unconfirmedSessionUpdates: Flow<UpdateUnconfirmedSession>
        get() = repository.getUpdates(TdApi.UpdateUnconfirmedSession::class) { mapper.map(it) }

    override val attachmentMenuBotsUpdates: Flow<UpdateAttachmentMenuBots>
        get() = repository.getUpdates(TdApi.UpdateAttachmentMenuBots::class) { mapper.map(it) }

    override val webAppMessageSentUpdates: Flow<UpdateWebAppMessageSent>
        get() = repository.getUpdates(TdApi.UpdateWebAppMessageSent::class) { mapper.map(it) }

    override val activeEmojiReactionsUpdates: Flow<UpdateActiveEmojiReactions>
        get() = repository.getUpdates(TdApi.UpdateActiveEmojiReactions::class) { mapper.map(it) }

    override val availableMessageEffectsUpdates: Flow<UpdateAvailableMessageEffects>
        get() = repository.getUpdates(TdApi.UpdateAvailableMessageEffects::class) { mapper.map(it) }

    override val defaultReactionTypeUpdates: Flow<UpdateDefaultReactionType>
        get() = repository.getUpdates(TdApi.UpdateDefaultReactionType::class) { mapper.map(it) }

    override val defaultPaidReactionTypeUpdates: Flow<UpdateDefaultPaidReactionType>
        get() = repository.getUpdates(TdApi.UpdateDefaultPaidReactionType::class) { mapper.map(it) }

    override val savedMessagesTagsUpdates: Flow<UpdateSavedMessagesTags>
        get() = repository.getUpdates(TdApi.UpdateSavedMessagesTags::class) { mapper.map(it) }

    override val activeLiveLocationMessagesUpdates: Flow<UpdateActiveLiveLocationMessages>
        get() = repository.getUpdates(TdApi.UpdateActiveLiveLocationMessages::class) { mapper.map(it) }

    override val ownedStarCountUpdates: Flow<UpdateOwnedStarCount>
        get() = repository.getUpdates(TdApi.UpdateOwnedStarCount::class) { mapper.map(it) }

    override val chatRevenueAmountUpdates: Flow<UpdateChatRevenueAmount>
        get() = repository.getUpdates(TdApi.UpdateChatRevenueAmount::class) { mapper.map(it) }

    override val starRevenueStatusUpdates: Flow<UpdateStarRevenueStatus>
        get() = repository.getUpdates(TdApi.UpdateStarRevenueStatus::class) { mapper.map(it) }

    override val speechRecognitionTrialUpdates: Flow<UpdateSpeechRecognitionTrial>
        get() = repository.getUpdates(TdApi.UpdateSpeechRecognitionTrial::class) { mapper.map(it) }

    override val diceEmojisUpdates: Flow<UpdateDiceEmojis>
        get() = repository.getUpdates(TdApi.UpdateDiceEmojis::class) { mapper.map(it) }

    override val animatedEmojiMessageClickedUpdates: Flow<UpdateAnimatedEmojiMessageClicked>
        get() = repository.getUpdates(TdApi.UpdateAnimatedEmojiMessageClicked::class) { mapper.map(it) }

    override val animationSearchParametersUpdates: Flow<UpdateAnimationSearchParameters>
        get() = repository.getUpdates(TdApi.UpdateAnimationSearchParameters::class) { mapper.map(it) }

    override val suggestedActionsUpdates: Flow<UpdateSuggestedActions>
        get() = repository.getUpdates(TdApi.UpdateSuggestedActions::class) { mapper.map(it) }

    override val speedLimitNotificationUpdates: Flow<UpdateSpeedLimitNotification>
        get() = repository.getUpdates(TdApi.UpdateSpeedLimitNotification::class) { mapper.map(it) }

    override val contactCloseBirthdaysUpdates: Flow<UpdateContactCloseBirthdays>
        get() = repository.getUpdates(TdApi.UpdateContactCloseBirthdays::class) { mapper.map(it) }

    override val autosaveSettingsUpdates: Flow<UpdateAutosaveSettings>
        get() = repository.getUpdates(TdApi.UpdateAutosaveSettings::class) { mapper.map(it) }

    override val businessConnectionUpdates: Flow<UpdateBusinessConnection>
        get() = repository.getUpdates(TdApi.UpdateBusinessConnection::class) { mapper.map(it) }

    override val newBusinessMessageUpdates: Flow<UpdateNewBusinessMessage>
        get() = repository.getUpdates(TdApi.UpdateNewBusinessMessage::class) { mapper.map(it) }

    override val businessMessageEditedUpdates: Flow<UpdateBusinessMessageEdited>
        get() = repository.getUpdates(TdApi.UpdateBusinessMessageEdited::class) { mapper.map(it) }

    override val businessMessagesDeletedUpdates: Flow<UpdateBusinessMessagesDeleted>
        get() = repository.getUpdates(TdApi.UpdateBusinessMessagesDeleted::class) { mapper.map(it) }

    override val newInlineQueryUpdates: Flow<UpdateNewInlineQuery>
        get() = repository.getUpdates(TdApi.UpdateNewInlineQuery::class) { mapper.map(it) }

    override val newChosenInlineResultUpdates: Flow<UpdateNewChosenInlineResult>
        get() = repository.getUpdates(TdApi.UpdateNewChosenInlineResult::class) { mapper.map(it) }

    override val newCallbackQueryUpdates: Flow<UpdateNewCallbackQuery>
        get() = repository.getUpdates(TdApi.UpdateNewCallbackQuery::class) { mapper.map(it) }

    override val newInlineCallbackQueryUpdates: Flow<UpdateNewInlineCallbackQuery>
        get() = repository.getUpdates(TdApi.UpdateNewInlineCallbackQuery::class) { mapper.map(it) }

    override val newBusinessCallbackQueryUpdates: Flow<UpdateNewBusinessCallbackQuery>
        get() = repository.getUpdates(TdApi.UpdateNewBusinessCallbackQuery::class) { mapper.map(it) }

    override val newShippingQueryUpdates: Flow<UpdateNewShippingQuery>
        get() = repository.getUpdates(TdApi.UpdateNewShippingQuery::class) { mapper.map(it) }

    override val newPreCheckoutQueryUpdates: Flow<UpdateNewPreCheckoutQuery>
        get() = repository.getUpdates(TdApi.UpdateNewPreCheckoutQuery::class) { mapper.map(it) }

    override val newCustomEventUpdates: Flow<UpdateNewCustomEvent>
        get() = repository.getUpdates(TdApi.UpdateNewCustomEvent::class) { mapper.map(it) }

    override val newCustomQueryUpdates: Flow<UpdateNewCustomQuery>
        get() = repository.getUpdates(TdApi.UpdateNewCustomQuery::class) { mapper.map(it) }

    override val pollUpdates: Flow<UpdatePoll>
        get() = repository.getUpdates(TdApi.UpdatePoll::class) { mapper.map(it) }

    override val pollAnswerUpdates: Flow<UpdatePollAnswer>
        get() = repository.getUpdates(TdApi.UpdatePollAnswer::class) { mapper.map(it) }

    override val chatMemberUpdates: Flow<UpdateChatMember>
        get() = repository.getUpdates(TdApi.UpdateChatMember::class) { mapper.map(it) }

    override val newChatJoinRequestUpdates: Flow<UpdateNewChatJoinRequest>
        get() = repository.getUpdates(TdApi.UpdateNewChatJoinRequest::class) { mapper.map(it) }

    override val chatBoostUpdates: Flow<UpdateChatBoost>
        get() = repository.getUpdates(TdApi.UpdateChatBoost::class) { mapper.map(it) }

    override val messageReactionUpdates: Flow<UpdateMessageReaction>
        get() = repository.getUpdates(TdApi.UpdateMessageReaction::class) { mapper.map(it) }

    override val messageReactionsUpdates: Flow<UpdateMessageReactions>
        get() = repository.getUpdates(TdApi.UpdateMessageReactions::class) { mapper.map(it) }

    override val paidMediaPurchasedUpdates: Flow<UpdatePaidMediaPurchased>
        get() = repository.getUpdates(TdApi.UpdatePaidMediaPurchased::class) { mapper.map(it) }

    override suspend fun acceptCall(callId: Int, protocol: CallProtocol): TdlResult<Ok> {
        val function = TdApi.AcceptCall(
            callId = callId,
            protocol = mapper.map(protocol),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun acceptTermsOfService(termsOfServiceId: String): TdlResult<Ok> {
        val function = TdApi.AcceptTermsOfService(
            termsOfServiceId = termsOfServiceId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun activateStoryStealthMode(): TdlResult<Ok> {
        val function = TdApi.ActivateStoryStealthMode()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addBotMediaPreview(
        botUserId: Long,
        languageCode: String,
        content: InputStoryContent,
    ): TdlResult<BotMediaPreview> {
        val function = TdApi.AddBotMediaPreview(
            botUserId = botUserId,
            languageCode = languageCode,
            content = mapper.map(content),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addChatFolderByInviteLink(inviteLink: String, chatIds: LongArray): TdlResult<Ok> {
        val function = TdApi.AddChatFolderByInviteLink(
            inviteLink = inviteLink,
            chatIds = chatIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addChatMember(
        chatId: Long,
        userId: Long,
        forwardLimit: Int,
    ): TdlResult<FailedToAddMembers> {
        val function = TdApi.AddChatMember(
            chatId = chatId,
            userId = userId,
            forwardLimit = forwardLimit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addChatMembers(chatId: Long, userIds: LongArray): TdlResult<FailedToAddMembers> {
        val function = TdApi.AddChatMembers(
            chatId = chatId,
            userIds = userIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addChatToList(chatId: Long, chatList: ChatList): TdlResult<Ok> {
        val function = TdApi.AddChatToList(
            chatId = chatId,
            chatList = mapper.map(chatList),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addContact(contact: Contact, sharePhoneNumber: Boolean): TdlResult<Ok> {
        val function = TdApi.AddContact(
            contact = mapper.map(contact),
            sharePhoneNumber = sharePhoneNumber,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addCustomServerLanguagePack(languagePackId: String): TdlResult<Ok> {
        val function = TdApi.AddCustomServerLanguagePack(
            languagePackId = languagePackId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addFavoriteSticker(sticker: InputFile): TdlResult<Ok> {
        val function = TdApi.AddFavoriteSticker(
            sticker = mapper.map(sticker),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addFileToDownloads(
        fileId: Int,
        chatId: Long,
        messageId: Long,
        priority: Int,
    ): TdlResult<File> {
        val function = TdApi.AddFileToDownloads(
            fileId = fileId,
            chatId = chatId,
            messageId = messageId,
            priority = priority,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addLocalMessage(
        chatId: Long,
        senderId: MessageSender,
        replyTo: InputMessageReplyTo?,
        disableNotification: Boolean,
        inputMessageContent: InputMessageContent,
    ): TdlResult<Message> {
        val function = TdApi.AddLocalMessage(
            chatId = chatId,
            senderId = mapper.map(senderId),
            replyTo = replyTo?.let { mapper.map(it) },
            disableNotification = disableNotification,
            inputMessageContent = mapper.map(inputMessageContent),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addLogMessage(verbosityLevel: Int, text: String): TdlResult<Ok> {
        val function = TdApi.AddLogMessage(
            verbosityLevel = verbosityLevel,
            text = text,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addMessageReaction(
        chatId: Long,
        messageId: Long,
        reactionType: ReactionType,
        isBig: Boolean,
        updateRecentReactions: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.AddMessageReaction(
            chatId = chatId,
            messageId = messageId,
            reactionType = mapper.map(reactionType),
            isBig = isBig,
            updateRecentReactions = updateRecentReactions,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addNetworkStatistics(entry: NetworkStatisticsEntry): TdlResult<Ok> {
        val function = TdApi.AddNetworkStatistics(
            entry = mapper.map(entry),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addPendingPaidMessageReaction(
        chatId: Long,
        messageId: Long,
        starCount: Long,
        type: PaidReactionType?,
    ): TdlResult<Ok> {
        val function = TdApi.AddPendingPaidMessageReaction(
            chatId = chatId,
            messageId = messageId,
            starCount = starCount,
            type = type?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addProxy(
        server: String,
        port: Int,
        enable: Boolean,
        type: ProxyType,
    ): TdlResult<Proxy> {
        val function = TdApi.AddProxy(
            server = server,
            port = port,
            enable = enable,
            type = mapper.map(type),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addQuickReplyShortcutInlineQueryResultMessage(
        shortcutName: String,
        replyToMessageId: Long,
        queryId: Long,
        resultId: String,
        hideViaBot: Boolean,
    ): TdlResult<QuickReplyMessage> {
        val function = TdApi.AddQuickReplyShortcutInlineQueryResultMessage(
            shortcutName = shortcutName,
            replyToMessageId = replyToMessageId,
            queryId = queryId,
            resultId = resultId,
            hideViaBot = hideViaBot,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addQuickReplyShortcutMessage(
        shortcutName: String,
        replyToMessageId: Long,
        inputMessageContent: InputMessageContent,
    ): TdlResult<QuickReplyMessage> {
        val function = TdApi.AddQuickReplyShortcutMessage(
            shortcutName = shortcutName,
            replyToMessageId = replyToMessageId,
            inputMessageContent = mapper.map(inputMessageContent),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addQuickReplyShortcutMessageAlbum(
        shortcutName: String,
        replyToMessageId: Long,
        inputMessageContents: Array<InputMessageContent>,
    ): TdlResult<QuickReplyMessages> {
        val function = TdApi.AddQuickReplyShortcutMessageAlbum(
            shortcutName = shortcutName,
            replyToMessageId = replyToMessageId,
            inputMessageContents = inputMessageContents.mapArray { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addRecentSticker(isAttached: Boolean, sticker: InputFile): TdlResult<Stickers> {
        val function = TdApi.AddRecentSticker(
            isAttached = isAttached,
            sticker = mapper.map(sticker),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addRecentlyFoundChat(chatId: Long): TdlResult<Ok> {
        val function = TdApi.AddRecentlyFoundChat(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addSavedAnimation(animation: InputFile): TdlResult<Ok> {
        val function = TdApi.AddSavedAnimation(
            animation = mapper.map(animation),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addSavedNotificationSound(sound: InputFile): TdlResult<NotificationSound> {
        val function = TdApi.AddSavedNotificationSound(
            sound = mapper.map(sound),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addStickerToSet(
        userId: Long,
        name: String,
        sticker: InputSticker,
    ): TdlResult<Ok> {
        val function = TdApi.AddStickerToSet(
            userId = userId,
            name = name,
            sticker = mapper.map(sticker),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun allowBotToSendMessages(botUserId: Long): TdlResult<Ok> {
        val function = TdApi.AllowBotToSendMessages(
            botUserId = botUserId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun allowUnpaidMessagesFromUser(userId: Long, refundPayments: Boolean): TdlResult<Ok> {
        val function = TdApi.AllowUnpaidMessagesFromUser(
            userId = userId,
            refundPayments = refundPayments,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun answerCallbackQuery(
        callbackQueryId: Long,
        text: String,
        showAlert: Boolean,
        url: String,
        cacheTime: Int,
    ): TdlResult<Ok> {
        val function = TdApi.AnswerCallbackQuery(
            callbackQueryId = callbackQueryId,
            text = text,
            showAlert = showAlert,
            url = url,
            cacheTime = cacheTime,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun answerCustomQuery(customQueryId: Long, data: String): TdlResult<Ok> {
        val function = TdApi.AnswerCustomQuery(
            customQueryId = customQueryId,
            data = data,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun answerInlineQuery(
        inlineQueryId: Long,
        isPersonal: Boolean,
        button: InlineQueryResultsButton?,
        results: Array<InputInlineQueryResult>,
        cacheTime: Int,
        nextOffset: String,
    ): TdlResult<Ok> {
        val function = TdApi.AnswerInlineQuery(
            inlineQueryId = inlineQueryId,
            isPersonal = isPersonal,
            button = button?.let { mapper.map(it) },
            results = results.mapArray { mapper.map(it) },
            cacheTime = cacheTime,
            nextOffset = nextOffset,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun answerPreCheckoutQuery(preCheckoutQueryId: Long, errorMessage: String): TdlResult<Ok> {
        val function = TdApi.AnswerPreCheckoutQuery(
            preCheckoutQueryId = preCheckoutQueryId,
            errorMessage = errorMessage,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun answerShippingQuery(
        shippingQueryId: Long,
        shippingOptions: Array<ShippingOption>,
        errorMessage: String,
    ): TdlResult<Ok> {
        val function = TdApi.AnswerShippingQuery(
            shippingQueryId = shippingQueryId,
            shippingOptions = shippingOptions.mapArray { mapper.map(it) },
            errorMessage = errorMessage,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun answerWebAppQuery(webAppQueryId: String, result: InputInlineQueryResult): TdlResult<SentWebAppMessage> {
        val function = TdApi.AnswerWebAppQuery(
            webAppQueryId = webAppQueryId,
            result = mapper.map(result),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun applyPremiumGiftCode(code: String): TdlResult<Ok> {
        val function = TdApi.ApplyPremiumGiftCode(
            code = code,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun assignStoreTransaction(transaction: StoreTransaction, purpose: StorePaymentPurpose): TdlResult<Ok> {
        val function = TdApi.AssignStoreTransaction(
            transaction = mapper.map(transaction),
            purpose = mapper.map(purpose),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun banChatMember(
        chatId: Long,
        memberId: MessageSender,
        bannedUntilDate: Int,
        revokeMessages: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.BanChatMember(
            chatId = chatId,
            memberId = mapper.map(memberId),
            bannedUntilDate = bannedUntilDate,
            revokeMessages = revokeMessages,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun banGroupCallParticipants(groupCallId: Int, userIds: LongArray): TdlResult<Ok> {
        val function = TdApi.BanGroupCallParticipants(
            groupCallId = groupCallId,
            userIds = userIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun blockMessageSenderFromReplies(
        messageId: Long,
        deleteMessage: Boolean,
        deleteAllMessages: Boolean,
        reportSpam: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.BlockMessageSenderFromReplies(
            messageId = messageId,
            deleteMessage = deleteMessage,
            deleteAllMessages = deleteAllMessages,
            reportSpam = reportSpam,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun boostChat(chatId: Long, slotIds: IntArray): TdlResult<ChatBoostSlots> {
        val function = TdApi.BoostChat(
            chatId = chatId,
            slotIds = slotIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun canBotSendMessages(botUserId: Long): TdlResult<Ok> {
        val function = TdApi.CanBotSendMessages(
            botUserId = botUserId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun canPostStory(chatId: Long): TdlResult<CanPostStoryResult> {
        val function = TdApi.CanPostStory(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun canPurchaseFromStore(purpose: StorePaymentPurpose): TdlResult<Ok> {
        val function = TdApi.CanPurchaseFromStore(
            purpose = mapper.map(purpose),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun canSendMessageToUser(userId: Long, onlyLocal: Boolean): TdlResult<CanSendMessageToUserResult> {
        val function = TdApi.CanSendMessageToUser(
            userId = userId,
            onlyLocal = onlyLocal,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun canTransferOwnership(): TdlResult<CanTransferOwnershipResult> {
        val function = TdApi.CanTransferOwnership()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun cancelDownloadFile(fileId: Int, onlyIfPending: Boolean): TdlResult<Ok> {
        val function = TdApi.CancelDownloadFile(
            fileId = fileId,
            onlyIfPending = onlyIfPending,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun cancelPasswordReset(): TdlResult<Ok> {
        val function = TdApi.CancelPasswordReset()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun cancelPreliminaryUploadFile(fileId: Int): TdlResult<Ok> {
        val function = TdApi.CancelPreliminaryUploadFile(
            fileId = fileId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun cancelRecoveryEmailAddressVerification(): TdlResult<PasswordState> {
        val function = TdApi.CancelRecoveryEmailAddressVerification()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun changeImportedContacts(contacts: Array<Contact>): TdlResult<ImportedContacts> {
        val function = TdApi.ChangeImportedContacts(
            contacts = contacts.mapArray { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun changeStickerSet(
        setId: Long,
        isInstalled: Boolean,
        isArchived: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.ChangeStickerSet(
            setId = setId,
            isInstalled = isInstalled,
            isArchived = isArchived,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkAuthenticationBotToken(token: String): TdlResult<Ok> {
        val function = TdApi.CheckAuthenticationBotToken(
            token = token,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkAuthenticationCode(code: String): TdlResult<Ok> {
        val function = TdApi.CheckAuthenticationCode(
            code = code,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkAuthenticationEmailCode(code: EmailAddressAuthentication): TdlResult<Ok> {
        val function = TdApi.CheckAuthenticationEmailCode(
            code = mapper.map(code),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkAuthenticationPassword(password: String): TdlResult<Ok> {
        val function = TdApi.CheckAuthenticationPassword(
            password = password,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkAuthenticationPasswordRecoveryCode(recoveryCode: String): TdlResult<Ok> {
        val function = TdApi.CheckAuthenticationPasswordRecoveryCode(
            recoveryCode = recoveryCode,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkAuthenticationPremiumPurchase(currency: String, amount: Long): TdlResult<Ok> {
        val function = TdApi.CheckAuthenticationPremiumPurchase(
            currency = currency,
            amount = amount,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkChatFolderInviteLink(inviteLink: String): TdlResult<ChatFolderInviteLinkInfo> {
        val function = TdApi.CheckChatFolderInviteLink(
            inviteLink = inviteLink,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkChatInviteLink(inviteLink: String): TdlResult<ChatInviteLinkInfo> {
        val function = TdApi.CheckChatInviteLink(
            inviteLink = inviteLink,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkChatUsername(chatId: Long, username: String): TdlResult<CheckChatUsernameResult> {
        val function = TdApi.CheckChatUsername(
            chatId = chatId,
            username = username,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkCreatedPublicChatsLimit(type: PublicChatType): TdlResult<Ok> {
        val function = TdApi.CheckCreatedPublicChatsLimit(
            type = mapper.map(type),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkEmailAddressVerificationCode(code: String): TdlResult<Ok> {
        val function = TdApi.CheckEmailAddressVerificationCode(
            code = code,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkLoginEmailAddressCode(code: EmailAddressAuthentication): TdlResult<Ok> {
        val function = TdApi.CheckLoginEmailAddressCode(
            code = mapper.map(code),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkPasswordRecoveryCode(recoveryCode: String): TdlResult<Ok> {
        val function = TdApi.CheckPasswordRecoveryCode(
            recoveryCode = recoveryCode,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkPhoneNumberCode(code: String): TdlResult<Ok> {
        val function = TdApi.CheckPhoneNumberCode(
            code = code,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkPremiumGiftCode(code: String): TdlResult<PremiumGiftCodeInfo> {
        val function = TdApi.CheckPremiumGiftCode(
            code = code,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkQuickReplyShortcutName(name: String): TdlResult<Ok> {
        val function = TdApi.CheckQuickReplyShortcutName(
            name = name,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkRecoveryEmailAddressCode(code: String): TdlResult<PasswordState> {
        val function = TdApi.CheckRecoveryEmailAddressCode(
            code = code,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkStickerSetName(name: String): TdlResult<CheckStickerSetNameResult> {
        val function = TdApi.CheckStickerSetName(
            name = name,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkWebAppFileDownload(
        botUserId: Long,
        fileName: String,
        url: String,
    ): TdlResult<Ok> {
        val function = TdApi.CheckWebAppFileDownload(
            botUserId = botUserId,
            fileName = fileName,
            url = url,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun cleanFileName(fileName: String): TdlResult<Text> {
        val function = TdApi.CleanFileName(
            fileName = fileName,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun clearAllDraftMessages(excludeSecretChats: Boolean): TdlResult<Ok> {
        val function = TdApi.ClearAllDraftMessages(
            excludeSecretChats = excludeSecretChats,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun clearAutosaveSettingsExceptions(): TdlResult<Ok> {
        val function = TdApi.ClearAutosaveSettingsExceptions()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun clearImportedContacts(): TdlResult<Ok> {
        val function = TdApi.ClearImportedContacts()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun clearRecentEmojiStatuses(): TdlResult<Ok> {
        val function = TdApi.ClearRecentEmojiStatuses()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun clearRecentReactions(): TdlResult<Ok> {
        val function = TdApi.ClearRecentReactions()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun clearRecentStickers(isAttached: Boolean): TdlResult<Ok> {
        val function = TdApi.ClearRecentStickers(
            isAttached = isAttached,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun clearRecentlyFoundChats(): TdlResult<Ok> {
        val function = TdApi.ClearRecentlyFoundChats()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun clearSearchedForTags(clearCashtags: Boolean): TdlResult<Ok> {
        val function = TdApi.ClearSearchedForTags(
            clearCashtags = clearCashtags,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun clickAnimatedEmojiMessage(chatId: Long, messageId: Long): TdlResult<Sticker> {
        val function = TdApi.ClickAnimatedEmojiMessage(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun clickChatSponsoredMessage(
        chatId: Long,
        messageId: Long,
        isMediaClick: Boolean,
        fromFullscreen: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.ClickChatSponsoredMessage(
            chatId = chatId,
            messageId = messageId,
            isMediaClick = isMediaClick,
            fromFullscreen = fromFullscreen,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun clickPremiumSubscriptionButton(): TdlResult<Ok> {
        val function = TdApi.ClickPremiumSubscriptionButton()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun close(): TdlResult<Ok> {
        val function = TdApi.Close()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun closeChat(chatId: Long): TdlResult<Ok> {
        val function = TdApi.CloseChat(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun closeSecretChat(secretChatId: Int): TdlResult<Ok> {
        val function = TdApi.CloseSecretChat(
            secretChatId = secretChatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun closeStory(storyPosterChatId: Long, storyId: Int): TdlResult<Ok> {
        val function = TdApi.CloseStory(
            storyPosterChatId = storyPosterChatId,
            storyId = storyId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun closeWebApp(webAppLaunchId: Long): TdlResult<Ok> {
        val function = TdApi.CloseWebApp(
            webAppLaunchId = webAppLaunchId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun commitPendingPaidMessageReactions(chatId: Long, messageId: Long): TdlResult<Ok> {
        val function = TdApi.CommitPendingPaidMessageReactions(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun confirmQrCodeAuthentication(link: String): TdlResult<Session> {
        val function = TdApi.ConfirmQrCodeAuthentication(
            link = link,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun confirmSession(sessionId: Long): TdlResult<Ok> {
        val function = TdApi.ConfirmSession(
            sessionId = sessionId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun connectAffiliateProgram(affiliate: AffiliateType, botUserId: Long): TdlResult<ConnectedAffiliateProgram> {
        val function = TdApi.ConnectAffiliateProgram(
            affiliate = mapper.map(affiliate),
            botUserId = botUserId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun createBasicGroupChat(basicGroupId: Long, force: Boolean): TdlResult<Chat> {
        val function = TdApi.CreateBasicGroupChat(
            basicGroupId = basicGroupId,
            force = force,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun createBusinessChatLink(linkInfo: InputBusinessChatLink): TdlResult<BusinessChatLink> {
        val function = TdApi.CreateBusinessChatLink(
            linkInfo = mapper.map(linkInfo),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun createCall(
        userId: Long,
        protocol: CallProtocol,
        isVideo: Boolean,
    ): TdlResult<CallId> {
        val function = TdApi.CreateCall(
            userId = userId,
            protocol = mapper.map(protocol),
            isVideo = isVideo,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun createChatFolder(folder: ChatFolder): TdlResult<ChatFolderInfo> {
        val function = TdApi.CreateChatFolder(
            folder = mapper.map(folder),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun createChatFolderInviteLink(
        chatFolderId: Int,
        name: String,
        chatIds: LongArray,
    ): TdlResult<ChatFolderInviteLink> {
        val function = TdApi.CreateChatFolderInviteLink(
            chatFolderId = chatFolderId,
            name = name,
            chatIds = chatIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun createChatInviteLink(
        chatId: Long,
        name: String,
        expirationDate: Int,
        memberLimit: Int,
        createsJoinRequest: Boolean,
    ): TdlResult<ChatInviteLink> {
        val function = TdApi.CreateChatInviteLink(
            chatId = chatId,
            name = name,
            expirationDate = expirationDate,
            memberLimit = memberLimit,
            createsJoinRequest = createsJoinRequest,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun createChatSubscriptionInviteLink(
        chatId: Long,
        name: String,
        subscriptionPricing: StarSubscriptionPricing,
    ): TdlResult<ChatInviteLink> {
        val function = TdApi.CreateChatSubscriptionInviteLink(
            chatId = chatId,
            name = name,
            subscriptionPricing = mapper.map(subscriptionPricing),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun createForumTopic(
        chatId: Long,
        name: String,
        icon: ForumTopicIcon,
    ): TdlResult<ForumTopicInfo> {
        val function = TdApi.CreateForumTopic(
            chatId = chatId,
            name = name,
            icon = mapper.map(icon),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun createGroupCall(joinParameters: GroupCallJoinParameters?): TdlResult<GroupCallInfo> {
        val function = TdApi.CreateGroupCall(
            joinParameters = joinParameters?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun createInvoiceLink(businessConnectionId: String, invoice: InputMessageContent): TdlResult<HttpUrl> {
        val function = TdApi.CreateInvoiceLink(
            businessConnectionId = businessConnectionId,
            invoice = mapper.map(invoice),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun createNewBasicGroupChat(
        userIds: LongArray,
        title: String,
        messageAutoDeleteTime: Int,
    ): TdlResult<CreatedBasicGroupChat> {
        val function = TdApi.CreateNewBasicGroupChat(
            userIds = userIds,
            title = title,
            messageAutoDeleteTime = messageAutoDeleteTime,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun createNewSecretChat(userId: Long): TdlResult<Chat> {
        val function = TdApi.CreateNewSecretChat(
            userId = userId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun createNewStickerSet(
        userId: Long,
        title: String,
        name: String,
        stickerType: StickerType,
        needsRepainting: Boolean,
        stickers: Array<InputSticker>,
        source: String,
    ): TdlResult<StickerSet> {
        val function = TdApi.CreateNewStickerSet(
            userId = userId,
            title = title,
            name = name,
            stickerType = mapper.map(stickerType),
            needsRepainting = needsRepainting,
            stickers = stickers.mapArray { mapper.map(it) },
            source = source,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun createNewSupergroupChat(
        title: String,
        isForum: Boolean,
        isChannel: Boolean,
        description: String,
        location: ChatLocation?,
        messageAutoDeleteTime: Int,
        forImport: Boolean,
    ): TdlResult<Chat> {
        val function = TdApi.CreateNewSupergroupChat(
            title = title,
            isForum = isForum,
            isChannel = isChannel,
            description = description,
            location = location?.let { mapper.map(it) },
            messageAutoDeleteTime = messageAutoDeleteTime,
            forImport = forImport,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun createPrivateChat(userId: Long, force: Boolean): TdlResult<Chat> {
        val function = TdApi.CreatePrivateChat(
            userId = userId,
            force = force,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun createSecretChat(secretChatId: Int): TdlResult<Chat> {
        val function = TdApi.CreateSecretChat(
            secretChatId = secretChatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun createSupergroupChat(supergroupId: Long, force: Boolean): TdlResult<Chat> {
        val function = TdApi.CreateSupergroupChat(
            supergroupId = supergroupId,
            force = force,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun createTemporaryPassword(password: String, validFor: Int): TdlResult<TemporaryPasswordState> {
        val function = TdApi.CreateTemporaryPassword(
            password = password,
            validFor = validFor,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun createVideoChat(
        chatId: Long,
        title: String,
        startDate: Int,
        isRtmpStream: Boolean,
    ): TdlResult<GroupCallId> {
        val function = TdApi.CreateVideoChat(
            chatId = chatId,
            title = title,
            startDate = startDate,
            isRtmpStream = isRtmpStream,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun declineGroupCallInvitation(chatId: Long, messageId: Long): TdlResult<Ok> {
        val function = TdApi.DeclineGroupCallInvitation(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun decryptGroupCallData(
        groupCallId: Int,
        participantId: MessageSender,
        dataChannel: GroupCallDataChannel?,
        data: ByteArray,
    ): TdlResult<Data> {
        val function = TdApi.DecryptGroupCallData(
            groupCallId = groupCallId,
            participantId = mapper.map(participantId),
            dataChannel = dataChannel?.let { mapper.map(it) },
            data = data,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteAccount(reason: String, password: String): TdlResult<Ok> {
        val function = TdApi.DeleteAccount(
            reason = reason,
            password = password,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteAllCallMessages(revoke: Boolean): TdlResult<Ok> {
        val function = TdApi.DeleteAllCallMessages(
            revoke = revoke,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteAllRevokedChatInviteLinks(chatId: Long, creatorUserId: Long): TdlResult<Ok> {
        val function = TdApi.DeleteAllRevokedChatInviteLinks(
            chatId = chatId,
            creatorUserId = creatorUserId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteBotMediaPreviews(
        botUserId: Long,
        languageCode: String,
        fileIds: IntArray,
    ): TdlResult<Ok> {
        val function = TdApi.DeleteBotMediaPreviews(
            botUserId = botUserId,
            languageCode = languageCode,
            fileIds = fileIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteBusinessChatLink(link: String): TdlResult<Ok> {
        val function = TdApi.DeleteBusinessChatLink(
            link = link,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteBusinessConnectedBot(botUserId: Long): TdlResult<Ok> {
        val function = TdApi.DeleteBusinessConnectedBot(
            botUserId = botUserId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteBusinessMessages(businessConnectionId: String, messageIds: LongArray): TdlResult<Ok> {
        val function = TdApi.DeleteBusinessMessages(
            businessConnectionId = businessConnectionId,
            messageIds = messageIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteBusinessStory(businessConnectionId: String, storyId: Int): TdlResult<Ok> {
        val function = TdApi.DeleteBusinessStory(
            businessConnectionId = businessConnectionId,
            storyId = storyId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteChat(chatId: Long): TdlResult<Ok> {
        val function = TdApi.DeleteChat(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteChatBackground(chatId: Long, restorePrevious: Boolean): TdlResult<Ok> {
        val function = TdApi.DeleteChatBackground(
            chatId = chatId,
            restorePrevious = restorePrevious,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteChatFolder(chatFolderId: Int, leaveChatIds: LongArray): TdlResult<Ok> {
        val function = TdApi.DeleteChatFolder(
            chatFolderId = chatFolderId,
            leaveChatIds = leaveChatIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteChatFolderInviteLink(chatFolderId: Int, inviteLink: String): TdlResult<Ok> {
        val function = TdApi.DeleteChatFolderInviteLink(
            chatFolderId = chatFolderId,
            inviteLink = inviteLink,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteChatHistory(
        chatId: Long,
        removeFromChatList: Boolean,
        revoke: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.DeleteChatHistory(
            chatId = chatId,
            removeFromChatList = removeFromChatList,
            revoke = revoke,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteChatMessagesByDate(
        chatId: Long,
        minDate: Int,
        maxDate: Int,
        revoke: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.DeleteChatMessagesByDate(
            chatId = chatId,
            minDate = minDate,
            maxDate = maxDate,
            revoke = revoke,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteChatMessagesBySender(chatId: Long, senderId: MessageSender): TdlResult<Ok> {
        val function = TdApi.DeleteChatMessagesBySender(
            chatId = chatId,
            senderId = mapper.map(senderId),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteChatReplyMarkup(chatId: Long, messageId: Long): TdlResult<Ok> {
        val function = TdApi.DeleteChatReplyMarkup(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteCommands(scope: BotCommandScope?, languageCode: String): TdlResult<Ok> {
        val function = TdApi.DeleteCommands(
            scope = scope?.let { mapper.map(it) },
            languageCode = languageCode,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteDefaultBackground(forDarkTheme: Boolean): TdlResult<Ok> {
        val function = TdApi.DeleteDefaultBackground(
            forDarkTheme = forDarkTheme,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteDirectMessagesChatTopicHistory(chatId: Long, topicId: Long): TdlResult<Ok> {
        val function = TdApi.DeleteDirectMessagesChatTopicHistory(
            chatId = chatId,
            topicId = topicId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteDirectMessagesChatTopicMessagesByDate(
        chatId: Long,
        topicId: Long,
        minDate: Int,
        maxDate: Int,
    ): TdlResult<Ok> {
        val function = TdApi.DeleteDirectMessagesChatTopicMessagesByDate(
            chatId = chatId,
            topicId = topicId,
            minDate = minDate,
            maxDate = maxDate,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteFile(fileId: Int): TdlResult<Ok> {
        val function = TdApi.DeleteFile(
            fileId = fileId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteForumTopic(chatId: Long, messageThreadId: Long): TdlResult<Ok> {
        val function = TdApi.DeleteForumTopic(
            chatId = chatId,
            messageThreadId = messageThreadId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteLanguagePack(languagePackId: String): TdlResult<Ok> {
        val function = TdApi.DeleteLanguagePack(
            languagePackId = languagePackId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteMessages(
        chatId: Long,
        messageIds: LongArray,
        revoke: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.DeleteMessages(
            chatId = chatId,
            messageIds = messageIds,
            revoke = revoke,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deletePassportElement(type: PassportElementType): TdlResult<Ok> {
        val function = TdApi.DeletePassportElement(
            type = mapper.map(type),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteProfilePhoto(profilePhotoId: Long): TdlResult<Ok> {
        val function = TdApi.DeleteProfilePhoto(
            profilePhotoId = profilePhotoId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteQuickReplyShortcut(shortcutId: Int): TdlResult<Ok> {
        val function = TdApi.DeleteQuickReplyShortcut(
            shortcutId = shortcutId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteQuickReplyShortcutMessages(shortcutId: Int, messageIds: LongArray): TdlResult<Ok> {
        val function = TdApi.DeleteQuickReplyShortcutMessages(
            shortcutId = shortcutId,
            messageIds = messageIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteRevokedChatInviteLink(chatId: Long, inviteLink: String): TdlResult<Ok> {
        val function = TdApi.DeleteRevokedChatInviteLink(
            chatId = chatId,
            inviteLink = inviteLink,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteSavedCredentials(): TdlResult<Ok> {
        val function = TdApi.DeleteSavedCredentials()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteSavedMessagesTopicHistory(savedMessagesTopicId: Long): TdlResult<Ok> {
        val function = TdApi.DeleteSavedMessagesTopicHistory(
            savedMessagesTopicId = savedMessagesTopicId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteSavedMessagesTopicMessagesByDate(
        savedMessagesTopicId: Long,
        minDate: Int,
        maxDate: Int,
    ): TdlResult<Ok> {
        val function = TdApi.DeleteSavedMessagesTopicMessagesByDate(
            savedMessagesTopicId = savedMessagesTopicId,
            minDate = minDate,
            maxDate = maxDate,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteSavedOrderInfo(): TdlResult<Ok> {
        val function = TdApi.DeleteSavedOrderInfo()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteStickerSet(name: String): TdlResult<Ok> {
        val function = TdApi.DeleteStickerSet(
            name = name,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteStory(storyPosterChatId: Long, storyId: Int): TdlResult<Ok> {
        val function = TdApi.DeleteStory(
            storyPosterChatId = storyPosterChatId,
            storyId = storyId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun destroy(): TdlResult<Ok> {
        val function = TdApi.Destroy()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun disableAllSupergroupUsernames(supergroupId: Long): TdlResult<Ok> {
        val function = TdApi.DisableAllSupergroupUsernames(
            supergroupId = supergroupId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun disableProxy(): TdlResult<Ok> {
        val function = TdApi.DisableProxy()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun discardCall(
        callId: Int,
        isDisconnected: Boolean,
        inviteLink: String,
        duration: Int,
        isVideo: Boolean,
        connectionId: Long,
    ): TdlResult<Ok> {
        val function = TdApi.DiscardCall(
            callId = callId,
            isDisconnected = isDisconnected,
            inviteLink = inviteLink,
            duration = duration,
            isVideo = isVideo,
            connectionId = connectionId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun disconnectAffiliateProgram(affiliate: AffiliateType, url: String): TdlResult<ConnectedAffiliateProgram> {
        val function = TdApi.DisconnectAffiliateProgram(
            affiliate = mapper.map(affiliate),
            url = url,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun disconnectAllWebsites(): TdlResult<Ok> {
        val function = TdApi.DisconnectAllWebsites()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun disconnectWebsite(websiteId: Long): TdlResult<Ok> {
        val function = TdApi.DisconnectWebsite(
            websiteId = websiteId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun downloadFile(
        fileId: Int,
        priority: Int,
        offset: Long,
        limit: Long,
        synchronous: Boolean,
    ): TdlResult<File> {
        val function = TdApi.DownloadFile(
            fileId = fileId,
            priority = priority,
            offset = offset,
            limit = limit,
            synchronous = synchronous,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editBotMediaPreview(
        botUserId: Long,
        languageCode: String,
        fileId: Int,
        content: InputStoryContent,
    ): TdlResult<BotMediaPreview> {
        val function = TdApi.EditBotMediaPreview(
            botUserId = botUserId,
            languageCode = languageCode,
            fileId = fileId,
            content = mapper.map(content),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editBusinessChatLink(link: String, linkInfo: InputBusinessChatLink): TdlResult<BusinessChatLink> {
        val function = TdApi.EditBusinessChatLink(
            link = link,
            linkInfo = mapper.map(linkInfo),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editBusinessMessageCaption(
        businessConnectionId: String,
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
        caption: FormattedText?,
        showCaptionAboveMedia: Boolean,
    ): TdlResult<BusinessMessage> {
        val function = TdApi.EditBusinessMessageCaption(
            businessConnectionId = businessConnectionId,
            chatId = chatId,
            messageId = messageId,
            replyMarkup = replyMarkup?.let { mapper.map(it) },
            caption = caption?.let { mapper.map(it) },
            showCaptionAboveMedia = showCaptionAboveMedia,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editBusinessMessageLiveLocation(
        businessConnectionId: String,
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
        location: Location?,
        livePeriod: Int,
        heading: Int,
        proximityAlertRadius: Int,
    ): TdlResult<BusinessMessage> {
        val function = TdApi.EditBusinessMessageLiveLocation(
            businessConnectionId = businessConnectionId,
            chatId = chatId,
            messageId = messageId,
            replyMarkup = replyMarkup?.let { mapper.map(it) },
            location = location?.let { mapper.map(it) },
            livePeriod = livePeriod,
            heading = heading,
            proximityAlertRadius = proximityAlertRadius,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editBusinessMessageMedia(
        businessConnectionId: String,
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
        inputMessageContent: InputMessageContent,
    ): TdlResult<BusinessMessage> {
        val function = TdApi.EditBusinessMessageMedia(
            businessConnectionId = businessConnectionId,
            chatId = chatId,
            messageId = messageId,
            replyMarkup = replyMarkup?.let { mapper.map(it) },
            inputMessageContent = mapper.map(inputMessageContent),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editBusinessMessageReplyMarkup(
        businessConnectionId: String,
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
    ): TdlResult<BusinessMessage> {
        val function = TdApi.EditBusinessMessageReplyMarkup(
            businessConnectionId = businessConnectionId,
            chatId = chatId,
            messageId = messageId,
            replyMarkup = replyMarkup?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editBusinessMessageText(
        businessConnectionId: String,
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
        inputMessageContent: InputMessageContent,
    ): TdlResult<BusinessMessage> {
        val function = TdApi.EditBusinessMessageText(
            businessConnectionId = businessConnectionId,
            chatId = chatId,
            messageId = messageId,
            replyMarkup = replyMarkup?.let { mapper.map(it) },
            inputMessageContent = mapper.map(inputMessageContent),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editBusinessStory(
        storyPosterChatId: Long,
        storyId: Int,
        content: InputStoryContent,
        areas: InputStoryAreas,
        caption: FormattedText,
        privacySettings: StoryPrivacySettings,
    ): TdlResult<Story> {
        val function = TdApi.EditBusinessStory(
            storyPosterChatId = storyPosterChatId,
            storyId = storyId,
            content = mapper.map(content),
            areas = mapper.map(areas),
            caption = mapper.map(caption),
            privacySettings = mapper.map(privacySettings),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editChatFolder(chatFolderId: Int, folder: ChatFolder): TdlResult<ChatFolderInfo> {
        val function = TdApi.EditChatFolder(
            chatFolderId = chatFolderId,
            folder = mapper.map(folder),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editChatFolderInviteLink(
        chatFolderId: Int,
        inviteLink: String,
        name: String,
        chatIds: LongArray,
    ): TdlResult<ChatFolderInviteLink> {
        val function = TdApi.EditChatFolderInviteLink(
            chatFolderId = chatFolderId,
            inviteLink = inviteLink,
            name = name,
            chatIds = chatIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editChatInviteLink(
        chatId: Long,
        inviteLink: String,
        name: String,
        expirationDate: Int,
        memberLimit: Int,
        createsJoinRequest: Boolean,
    ): TdlResult<ChatInviteLink> {
        val function = TdApi.EditChatInviteLink(
            chatId = chatId,
            inviteLink = inviteLink,
            name = name,
            expirationDate = expirationDate,
            memberLimit = memberLimit,
            createsJoinRequest = createsJoinRequest,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editChatSubscriptionInviteLink(
        chatId: Long,
        inviteLink: String,
        name: String,
    ): TdlResult<ChatInviteLink> {
        val function = TdApi.EditChatSubscriptionInviteLink(
            chatId = chatId,
            inviteLink = inviteLink,
            name = name,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editCustomLanguagePackInfo(info: LanguagePackInfo): TdlResult<Ok> {
        val function = TdApi.EditCustomLanguagePackInfo(
            info = mapper.map(info),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editForumTopic(
        chatId: Long,
        messageThreadId: Long,
        name: String,
        editIconCustomEmoji: Boolean,
        iconCustomEmojiId: Long,
    ): TdlResult<Ok> {
        val function = TdApi.EditForumTopic(
            chatId = chatId,
            messageThreadId = messageThreadId,
            name = name,
            editIconCustomEmoji = editIconCustomEmoji,
            iconCustomEmojiId = iconCustomEmojiId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editInlineMessageCaption(
        inlineMessageId: String,
        replyMarkup: ReplyMarkup?,
        caption: FormattedText?,
        showCaptionAboveMedia: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.EditInlineMessageCaption(
            inlineMessageId = inlineMessageId,
            replyMarkup = replyMarkup?.let { mapper.map(it) },
            caption = caption?.let { mapper.map(it) },
            showCaptionAboveMedia = showCaptionAboveMedia,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editInlineMessageLiveLocation(
        inlineMessageId: String,
        replyMarkup: ReplyMarkup?,
        location: Location?,
        livePeriod: Int,
        heading: Int,
        proximityAlertRadius: Int,
    ): TdlResult<Ok> {
        val function = TdApi.EditInlineMessageLiveLocation(
            inlineMessageId = inlineMessageId,
            replyMarkup = replyMarkup?.let { mapper.map(it) },
            location = location?.let { mapper.map(it) },
            livePeriod = livePeriod,
            heading = heading,
            proximityAlertRadius = proximityAlertRadius,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editInlineMessageMedia(
        inlineMessageId: String,
        replyMarkup: ReplyMarkup?,
        inputMessageContent: InputMessageContent,
    ): TdlResult<Ok> {
        val function = TdApi.EditInlineMessageMedia(
            inlineMessageId = inlineMessageId,
            replyMarkup = replyMarkup?.let { mapper.map(it) },
            inputMessageContent = mapper.map(inputMessageContent),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editInlineMessageReplyMarkup(inlineMessageId: String, replyMarkup: ReplyMarkup?): TdlResult<Ok> {
        val function = TdApi.EditInlineMessageReplyMarkup(
            inlineMessageId = inlineMessageId,
            replyMarkup = replyMarkup?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editInlineMessageText(
        inlineMessageId: String,
        replyMarkup: ReplyMarkup?,
        inputMessageContent: InputMessageContent,
    ): TdlResult<Ok> {
        val function = TdApi.EditInlineMessageText(
            inlineMessageId = inlineMessageId,
            replyMarkup = replyMarkup?.let { mapper.map(it) },
            inputMessageContent = mapper.map(inputMessageContent),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editMessageCaption(
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
        caption: FormattedText?,
        showCaptionAboveMedia: Boolean,
    ): TdlResult<Message> {
        val function = TdApi.EditMessageCaption(
            chatId = chatId,
            messageId = messageId,
            replyMarkup = replyMarkup?.let { mapper.map(it) },
            caption = caption?.let { mapper.map(it) },
            showCaptionAboveMedia = showCaptionAboveMedia,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editMessageLiveLocation(
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
        location: Location?,
        livePeriod: Int,
        heading: Int,
        proximityAlertRadius: Int,
    ): TdlResult<Message> {
        val function = TdApi.EditMessageLiveLocation(
            chatId = chatId,
            messageId = messageId,
            replyMarkup = replyMarkup?.let { mapper.map(it) },
            location = location?.let { mapper.map(it) },
            livePeriod = livePeriod,
            heading = heading,
            proximityAlertRadius = proximityAlertRadius,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editMessageMedia(
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
        inputMessageContent: InputMessageContent,
    ): TdlResult<Message> {
        val function = TdApi.EditMessageMedia(
            chatId = chatId,
            messageId = messageId,
            replyMarkup = replyMarkup?.let { mapper.map(it) },
            inputMessageContent = mapper.map(inputMessageContent),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editMessageReplyMarkup(
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
    ): TdlResult<Message> {
        val function = TdApi.EditMessageReplyMarkup(
            chatId = chatId,
            messageId = messageId,
            replyMarkup = replyMarkup?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editMessageSchedulingState(
        chatId: Long,
        messageId: Long,
        schedulingState: MessageSchedulingState?,
    ): TdlResult<Ok> {
        val function = TdApi.EditMessageSchedulingState(
            chatId = chatId,
            messageId = messageId,
            schedulingState = schedulingState?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editMessageText(
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
        inputMessageContent: InputMessageContent,
    ): TdlResult<Message> {
        val function = TdApi.EditMessageText(
            chatId = chatId,
            messageId = messageId,
            replyMarkup = replyMarkup?.let { mapper.map(it) },
            inputMessageContent = mapper.map(inputMessageContent),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editProxy(
        proxyId: Int,
        server: String,
        port: Int,
        enable: Boolean,
        type: ProxyType,
    ): TdlResult<Proxy> {
        val function = TdApi.EditProxy(
            proxyId = proxyId,
            server = server,
            port = port,
            enable = enable,
            type = mapper.map(type),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editQuickReplyMessage(
        shortcutId: Int,
        messageId: Long,
        inputMessageContent: InputMessageContent,
    ): TdlResult<Ok> {
        val function = TdApi.EditQuickReplyMessage(
            shortcutId = shortcutId,
            messageId = messageId,
            inputMessageContent = mapper.map(inputMessageContent),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editStarSubscription(subscriptionId: String, isCanceled: Boolean): TdlResult<Ok> {
        val function = TdApi.EditStarSubscription(
            subscriptionId = subscriptionId,
            isCanceled = isCanceled,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editStory(
        storyPosterChatId: Long,
        storyId: Int,
        content: InputStoryContent?,
        areas: InputStoryAreas?,
        caption: FormattedText?,
    ): TdlResult<Ok> {
        val function = TdApi.EditStory(
            storyPosterChatId = storyPosterChatId,
            storyId = storyId,
            content = content?.let { mapper.map(it) },
            areas = areas?.let { mapper.map(it) },
            caption = caption?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editStoryCover(
        storyPosterChatId: Long,
        storyId: Int,
        coverFrameTimestamp: Double,
    ): TdlResult<Ok> {
        val function = TdApi.EditStoryCover(
            storyPosterChatId = storyPosterChatId,
            storyId = storyId,
            coverFrameTimestamp = coverFrameTimestamp,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editUserStarSubscription(
        userId: Long,
        telegramPaymentChargeId: String,
        isCanceled: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.EditUserStarSubscription(
            userId = userId,
            telegramPaymentChargeId = telegramPaymentChargeId,
            isCanceled = isCanceled,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun enableProxy(proxyId: Int): TdlResult<Ok> {
        val function = TdApi.EnableProxy(
            proxyId = proxyId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun encryptGroupCallData(
        groupCallId: Int,
        dataChannel: GroupCallDataChannel,
        data: ByteArray,
        unencryptedPrefixSize: Int,
    ): TdlResult<Data> {
        val function = TdApi.EncryptGroupCallData(
            groupCallId = groupCallId,
            dataChannel = mapper.map(dataChannel),
            data = data,
            unencryptedPrefixSize = unencryptedPrefixSize,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun endGroupCall(groupCallId: Int): TdlResult<Ok> {
        val function = TdApi.EndGroupCall(
            groupCallId = groupCallId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun endGroupCallRecording(groupCallId: Int): TdlResult<Ok> {
        val function = TdApi.EndGroupCallRecording(
            groupCallId = groupCallId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun endGroupCallScreenSharing(groupCallId: Int): TdlResult<Ok> {
        val function = TdApi.EndGroupCallScreenSharing(
            groupCallId = groupCallId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun finishFileGeneration(generationId: Long, error: Error?): TdlResult<Ok> {
        val function = TdApi.FinishFileGeneration(
            generationId = generationId,
            error = error?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun forwardMessages(
        chatId: Long,
        messageThreadId: Long,
        fromChatId: Long,
        messageIds: LongArray,
        options: MessageSendOptions?,
        sendCopy: Boolean,
        removeCaption: Boolean,
    ): TdlResult<Messages> {
        val function = TdApi.ForwardMessages(
            chatId = chatId,
            messageThreadId = messageThreadId,
            fromChatId = fromChatId,
            messageIds = messageIds,
            options = options?.let { mapper.map(it) },
            sendCopy = sendCopy,
            removeCaption = removeCaption,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getAccountTtl(): TdlResult<AccountTtl> {
        val function = TdApi.GetAccountTtl()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getActiveSessions(): TdlResult<Sessions> {
        val function = TdApi.GetActiveSessions()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getAllPassportElements(password: String): TdlResult<PassportElements> {
        val function = TdApi.GetAllPassportElements(
            password = password,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getAllStickerEmojis(
        stickerType: StickerType,
        query: String,
        chatId: Long,
        returnOnlyMainEmoji: Boolean,
    ): TdlResult<Emojis> {
        val function = TdApi.GetAllStickerEmojis(
            stickerType = mapper.map(stickerType),
            query = query,
            chatId = chatId,
            returnOnlyMainEmoji = returnOnlyMainEmoji,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getAnimatedEmoji(emoji: String): TdlResult<AnimatedEmoji> {
        val function = TdApi.GetAnimatedEmoji(
            emoji = emoji,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getApplicationConfig(): TdlResult<JsonValue> {
        val function = TdApi.GetApplicationConfig()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getApplicationDownloadLink(): TdlResult<HttpUrl> {
        val function = TdApi.GetApplicationDownloadLink()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getArchiveChatListSettings(): TdlResult<ArchiveChatListSettings> {
        val function = TdApi.GetArchiveChatListSettings()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getArchivedStickerSets(
        stickerType: StickerType,
        offsetStickerSetId: Long,
        limit: Int,
    ): TdlResult<StickerSets> {
        val function = TdApi.GetArchivedStickerSets(
            stickerType = mapper.map(stickerType),
            offsetStickerSetId = offsetStickerSetId,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getAttachedStickerSets(fileId: Int): TdlResult<StickerSets> {
        val function = TdApi.GetAttachedStickerSets(
            fileId = fileId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getAttachmentMenuBot(botUserId: Long): TdlResult<AttachmentMenuBot> {
        val function = TdApi.GetAttachmentMenuBot(
            botUserId = botUserId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getAuthorizationState(): TdlResult<AuthorizationState> {
        val function = TdApi.GetAuthorizationState()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getAutoDownloadSettingsPresets(): TdlResult<AutoDownloadSettingsPresets> {
        val function = TdApi.GetAutoDownloadSettingsPresets()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getAutosaveSettings(): TdlResult<AutosaveSettings> {
        val function = TdApi.GetAutosaveSettings()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getAvailableChatBoostSlots(): TdlResult<ChatBoostSlots> {
        val function = TdApi.GetAvailableChatBoostSlots()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getAvailableGifts(): TdlResult<AvailableGifts> {
        val function = TdApi.GetAvailableGifts()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBackgroundUrl(name: String, type: BackgroundType): TdlResult<HttpUrl> {
        val function = TdApi.GetBackgroundUrl(
            name = name,
            type = mapper.map(type),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBankCardInfo(bankCardNumber: String): TdlResult<BankCardInfo> {
        val function = TdApi.GetBankCardInfo(
            bankCardNumber = bankCardNumber,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBasicGroup(basicGroupId: Long): TdlResult<BasicGroup> {
        val function = TdApi.GetBasicGroup(
            basicGroupId = basicGroupId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBasicGroupFullInfo(basicGroupId: Long): TdlResult<BasicGroupFullInfo> {
        val function = TdApi.GetBasicGroupFullInfo(
            basicGroupId = basicGroupId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBlockedMessageSenders(
        blockList: BlockList,
        offset: Int,
        limit: Int,
    ): TdlResult<MessageSenders> {
        val function = TdApi.GetBlockedMessageSenders(
            blockList = mapper.map(blockList),
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBotInfoDescription(botUserId: Long, languageCode: String): TdlResult<Text> {
        val function = TdApi.GetBotInfoDescription(
            botUserId = botUserId,
            languageCode = languageCode,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBotInfoShortDescription(botUserId: Long, languageCode: String): TdlResult<Text> {
        val function = TdApi.GetBotInfoShortDescription(
            botUserId = botUserId,
            languageCode = languageCode,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBotMediaPreviewInfo(botUserId: Long, languageCode: String): TdlResult<BotMediaPreviewInfo> {
        val function = TdApi.GetBotMediaPreviewInfo(
            botUserId = botUserId,
            languageCode = languageCode,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBotMediaPreviews(botUserId: Long): TdlResult<BotMediaPreviews> {
        val function = TdApi.GetBotMediaPreviews(
            botUserId = botUserId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBotName(botUserId: Long, languageCode: String): TdlResult<Text> {
        val function = TdApi.GetBotName(
            botUserId = botUserId,
            languageCode = languageCode,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBotSimilarBotCount(botUserId: Long, returnLocal: Boolean): TdlResult<Count> {
        val function = TdApi.GetBotSimilarBotCount(
            botUserId = botUserId,
            returnLocal = returnLocal,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBotSimilarBots(botUserId: Long): TdlResult<Users> {
        val function = TdApi.GetBotSimilarBots(
            botUserId = botUserId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBusinessAccountStarAmount(businessConnectionId: String): TdlResult<StarAmount> {
        val function = TdApi.GetBusinessAccountStarAmount(
            businessConnectionId = businessConnectionId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBusinessChatLinkInfo(linkName: String): TdlResult<BusinessChatLinkInfo> {
        val function = TdApi.GetBusinessChatLinkInfo(
            linkName = linkName,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBusinessChatLinks(): TdlResult<BusinessChatLinks> {
        val function = TdApi.GetBusinessChatLinks()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBusinessConnectedBot(): TdlResult<BusinessConnectedBot> {
        val function = TdApi.GetBusinessConnectedBot()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBusinessConnection(connectionId: String): TdlResult<BusinessConnection> {
        val function = TdApi.GetBusinessConnection(
            connectionId = connectionId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBusinessFeatures(source: BusinessFeature?): TdlResult<BusinessFeatures> {
        val function = TdApi.GetBusinessFeatures(
            source = source?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getCallbackQueryAnswer(
        chatId: Long,
        messageId: Long,
        payload: CallbackQueryPayload,
    ): TdlResult<CallbackQueryAnswer> {
        val function = TdApi.GetCallbackQueryAnswer(
            chatId = chatId,
            messageId = messageId,
            payload = mapper.map(payload),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getCallbackQueryMessage(
        chatId: Long,
        messageId: Long,
        callbackQueryId: Long,
    ): TdlResult<Message> {
        val function = TdApi.GetCallbackQueryMessage(
            chatId = chatId,
            messageId = messageId,
            callbackQueryId = callbackQueryId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChat(chatId: Long): TdlResult<Chat> {
        val function = TdApi.GetChat(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatActiveStories(chatId: Long): TdlResult<ChatActiveStories> {
        val function = TdApi.GetChatActiveStories(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatAdministrators(chatId: Long): TdlResult<ChatAdministrators> {
        val function = TdApi.GetChatAdministrators(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatArchivedStories(
        chatId: Long,
        fromStoryId: Int,
        limit: Int,
    ): TdlResult<Stories> {
        val function = TdApi.GetChatArchivedStories(
            chatId = chatId,
            fromStoryId = fromStoryId,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatAvailableMessageSenders(chatId: Long): TdlResult<ChatMessageSenders> {
        val function = TdApi.GetChatAvailableMessageSenders(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatAvailablePaidMessageReactionSenders(chatId: Long): TdlResult<MessageSenders> {
        val function = TdApi.GetChatAvailablePaidMessageReactionSenders(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatBoostFeatures(isChannel: Boolean): TdlResult<ChatBoostFeatures> {
        val function = TdApi.GetChatBoostFeatures(
            isChannel = isChannel,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatBoostLevelFeatures(isChannel: Boolean, level: Int): TdlResult<ChatBoostLevelFeatures> {
        val function = TdApi.GetChatBoostLevelFeatures(
            isChannel = isChannel,
            level = level,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatBoostLink(chatId: Long): TdlResult<ChatBoostLink> {
        val function = TdApi.GetChatBoostLink(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatBoostLinkInfo(url: String): TdlResult<ChatBoostLinkInfo> {
        val function = TdApi.GetChatBoostLinkInfo(
            url = url,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatBoostStatus(chatId: Long): TdlResult<ChatBoostStatus> {
        val function = TdApi.GetChatBoostStatus(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatBoosts(
        chatId: Long,
        onlyGiftCodes: Boolean,
        offset: String,
        limit: Int,
    ): TdlResult<FoundChatBoosts> {
        val function = TdApi.GetChatBoosts(
            chatId = chatId,
            onlyGiftCodes = onlyGiftCodes,
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatEventLog(
        chatId: Long,
        query: String,
        fromEventId: Long,
        limit: Int,
        filters: ChatEventLogFilters?,
        userIds: LongArray,
    ): TdlResult<ChatEvents> {
        val function = TdApi.GetChatEventLog(
            chatId = chatId,
            query = query,
            fromEventId = fromEventId,
            limit = limit,
            filters = filters?.let { mapper.map(it) },
            userIds = userIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatFolder(chatFolderId: Int): TdlResult<ChatFolder> {
        val function = TdApi.GetChatFolder(
            chatFolderId = chatFolderId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatFolderChatCount(folder: ChatFolder): TdlResult<Count> {
        val function = TdApi.GetChatFolderChatCount(
            folder = mapper.map(folder),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatFolderChatsToLeave(chatFolderId: Int): TdlResult<Chats> {
        val function = TdApi.GetChatFolderChatsToLeave(
            chatFolderId = chatFolderId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatFolderDefaultIconName(folder: ChatFolder): TdlResult<ChatFolderIcon> {
        val function = TdApi.GetChatFolderDefaultIconName(
            folder = mapper.map(folder),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatFolderInviteLinks(chatFolderId: Int): TdlResult<ChatFolderInviteLinks> {
        val function = TdApi.GetChatFolderInviteLinks(
            chatFolderId = chatFolderId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatFolderNewChats(chatFolderId: Int): TdlResult<Chats> {
        val function = TdApi.GetChatFolderNewChats(
            chatFolderId = chatFolderId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatHistory(
        chatId: Long,
        fromMessageId: Long,
        offset: Int,
        limit: Int,
        onlyLocal: Boolean,
    ): TdlResult<Messages> {
        val function = TdApi.GetChatHistory(
            chatId = chatId,
            fromMessageId = fromMessageId,
            offset = offset,
            limit = limit,
            onlyLocal = onlyLocal,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatInviteLink(chatId: Long, inviteLink: String): TdlResult<ChatInviteLink> {
        val function = TdApi.GetChatInviteLink(
            chatId = chatId,
            inviteLink = inviteLink,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatInviteLinkCounts(chatId: Long): TdlResult<ChatInviteLinkCounts> {
        val function = TdApi.GetChatInviteLinkCounts(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatInviteLinkMembers(
        chatId: Long,
        inviteLink: String,
        onlyWithExpiredSubscription: Boolean,
        offsetMember: ChatInviteLinkMember?,
        limit: Int,
    ): TdlResult<ChatInviteLinkMembers> {
        val function = TdApi.GetChatInviteLinkMembers(
            chatId = chatId,
            inviteLink = inviteLink,
            onlyWithExpiredSubscription = onlyWithExpiredSubscription,
            offsetMember = offsetMember?.let { mapper.map(it) },
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatInviteLinks(
        chatId: Long,
        creatorUserId: Long,
        isRevoked: Boolean,
        offsetDate: Int,
        offsetInviteLink: String,
        limit: Int,
    ): TdlResult<ChatInviteLinks> {
        val function = TdApi.GetChatInviteLinks(
            chatId = chatId,
            creatorUserId = creatorUserId,
            isRevoked = isRevoked,
            offsetDate = offsetDate,
            offsetInviteLink = offsetInviteLink,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatJoinRequests(
        chatId: Long,
        inviteLink: String,
        query: String,
        offsetRequest: ChatJoinRequest?,
        limit: Int,
    ): TdlResult<ChatJoinRequests> {
        val function = TdApi.GetChatJoinRequests(
            chatId = chatId,
            inviteLink = inviteLink,
            query = query,
            offsetRequest = offsetRequest?.let { mapper.map(it) },
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatListsToAddChat(chatId: Long): TdlResult<ChatLists> {
        val function = TdApi.GetChatListsToAddChat(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatMember(chatId: Long, memberId: MessageSender): TdlResult<ChatMember> {
        val function = TdApi.GetChatMember(
            chatId = chatId,
            memberId = mapper.map(memberId),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatMessageByDate(chatId: Long, date: Int): TdlResult<Message> {
        val function = TdApi.GetChatMessageByDate(
            chatId = chatId,
            date = date,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatMessageCalendar(
        chatId: Long,
        topicId: MessageTopic?,
        filter: SearchMessagesFilter,
        fromMessageId: Long,
    ): TdlResult<MessageCalendar> {
        val function = TdApi.GetChatMessageCalendar(
            chatId = chatId,
            topicId = topicId?.let { mapper.map(it) },
            filter = mapper.map(filter),
            fromMessageId = fromMessageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatMessageCount(
        chatId: Long,
        topicId: MessageTopic?,
        filter: SearchMessagesFilter,
        returnLocal: Boolean,
    ): TdlResult<Count> {
        val function = TdApi.GetChatMessageCount(
            chatId = chatId,
            topicId = topicId?.let { mapper.map(it) },
            filter = mapper.map(filter),
            returnLocal = returnLocal,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatMessagePosition(
        chatId: Long,
        topicId: MessageTopic?,
        filter: SearchMessagesFilter,
        messageId: Long,
    ): TdlResult<Count> {
        val function = TdApi.GetChatMessagePosition(
            chatId = chatId,
            topicId = topicId?.let { mapper.map(it) },
            filter = mapper.map(filter),
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatNotificationSettingsExceptions(scope: NotificationSettingsScope?, compareSound: Boolean): TdlResult<Chats> {
        val function = TdApi.GetChatNotificationSettingsExceptions(
            scope = scope?.let { mapper.map(it) },
            compareSound = compareSound,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatPinnedMessage(chatId: Long): TdlResult<Message> {
        val function = TdApi.GetChatPinnedMessage(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatPostedToChatPageStories(
        chatId: Long,
        fromStoryId: Int,
        limit: Int,
    ): TdlResult<Stories> {
        val function = TdApi.GetChatPostedToChatPageStories(
            chatId = chatId,
            fromStoryId = fromStoryId,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatRevenueStatistics(chatId: Long, isDark: Boolean): TdlResult<ChatRevenueStatistics> {
        val function = TdApi.GetChatRevenueStatistics(
            chatId = chatId,
            isDark = isDark,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatRevenueTransactions(
        chatId: Long,
        offset: Int,
        limit: Int,
    ): TdlResult<ChatRevenueTransactions> {
        val function = TdApi.GetChatRevenueTransactions(
            chatId = chatId,
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatRevenueWithdrawalUrl(chatId: Long, password: String): TdlResult<HttpUrl> {
        val function = TdApi.GetChatRevenueWithdrawalUrl(
            chatId = chatId,
            password = password,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatScheduledMessages(chatId: Long): TdlResult<Messages> {
        val function = TdApi.GetChatScheduledMessages(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatSimilarChatCount(chatId: Long, returnLocal: Boolean): TdlResult<Count> {
        val function = TdApi.GetChatSimilarChatCount(
            chatId = chatId,
            returnLocal = returnLocal,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatSimilarChats(chatId: Long): TdlResult<Chats> {
        val function = TdApi.GetChatSimilarChats(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatSparseMessagePositions(
        chatId: Long,
        filter: SearchMessagesFilter,
        fromMessageId: Long,
        limit: Int,
        savedMessagesTopicId: Long,
    ): TdlResult<MessagePositions> {
        val function = TdApi.GetChatSparseMessagePositions(
            chatId = chatId,
            filter = mapper.map(filter),
            fromMessageId = fromMessageId,
            limit = limit,
            savedMessagesTopicId = savedMessagesTopicId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatSponsoredMessages(chatId: Long): TdlResult<SponsoredMessages> {
        val function = TdApi.GetChatSponsoredMessages(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatStatistics(chatId: Long, isDark: Boolean): TdlResult<ChatStatistics> {
        val function = TdApi.GetChatStatistics(
            chatId = chatId,
            isDark = isDark,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatStoryInteractions(
        storyPosterChatId: Long,
        storyId: Int,
        reactionType: ReactionType?,
        preferForwards: Boolean,
        offset: String,
        limit: Int,
    ): TdlResult<StoryInteractions> {
        val function = TdApi.GetChatStoryInteractions(
            storyPosterChatId = storyPosterChatId,
            storyId = storyId,
            reactionType = reactionType?.let { mapper.map(it) },
            preferForwards = preferForwards,
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChats(chatList: ChatList?, limit: Int): TdlResult<Chats> {
        val function = TdApi.GetChats(
            chatList = chatList?.let { mapper.map(it) },
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatsForChatFolderInviteLink(chatFolderId: Int): TdlResult<Chats> {
        val function = TdApi.GetChatsForChatFolderInviteLink(
            chatFolderId = chatFolderId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatsToPostStories(): TdlResult<Chats> {
        val function = TdApi.GetChatsToPostStories()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getCloseFriends(): TdlResult<Users> {
        val function = TdApi.GetCloseFriends()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getCollectibleItemInfo(type: CollectibleItemType): TdlResult<CollectibleItemInfo> {
        val function = TdApi.GetCollectibleItemInfo(
            type = mapper.map(type),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getCommands(scope: BotCommandScope?, languageCode: String): TdlResult<BotCommands> {
        val function = TdApi.GetCommands(
            scope = scope?.let { mapper.map(it) },
            languageCode = languageCode,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getConnectedAffiliateProgram(affiliate: AffiliateType, botUserId: Long): TdlResult<ConnectedAffiliateProgram> {
        val function = TdApi.GetConnectedAffiliateProgram(
            affiliate = mapper.map(affiliate),
            botUserId = botUserId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getConnectedAffiliatePrograms(
        affiliate: AffiliateType,
        offset: String,
        limit: Int,
    ): TdlResult<ConnectedAffiliatePrograms> {
        val function = TdApi.GetConnectedAffiliatePrograms(
            affiliate = mapper.map(affiliate),
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getConnectedWebsites(): TdlResult<ConnectedWebsites> {
        val function = TdApi.GetConnectedWebsites()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getContacts(): TdlResult<Users> {
        val function = TdApi.GetContacts()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getCountries(): TdlResult<Countries> {
        val function = TdApi.GetCountries()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getCountryCode(): TdlResult<Text> {
        val function = TdApi.GetCountryCode()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getCountryFlagEmoji(countryCode: String): TdlResult<Text> {
        val function = TdApi.GetCountryFlagEmoji(
            countryCode = countryCode,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getCreatedPublicChats(type: PublicChatType): TdlResult<Chats> {
        val function = TdApi.GetCreatedPublicChats(
            type = mapper.map(type),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getCurrentState(): TdlResult<Updates> {
        val function = TdApi.GetCurrentState()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getCurrentWeather(location: Location): TdlResult<CurrentWeather> {
        val function = TdApi.GetCurrentWeather(
            location = mapper.map(location),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getCustomEmojiReactionAnimations(): TdlResult<Stickers> {
        val function = TdApi.GetCustomEmojiReactionAnimations()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getCustomEmojiStickers(customEmojiIds: LongArray): TdlResult<Stickers> {
        val function = TdApi.GetCustomEmojiStickers(
            customEmojiIds = customEmojiIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getDatabaseStatistics(): TdlResult<DatabaseStatistics> {
        val function = TdApi.GetDatabaseStatistics()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getDeepLinkInfo(link: String): TdlResult<DeepLinkInfo> {
        val function = TdApi.GetDeepLinkInfo(
            link = link,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getDefaultBackgroundCustomEmojiStickers(): TdlResult<Stickers> {
        val function = TdApi.GetDefaultBackgroundCustomEmojiStickers()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getDefaultChatEmojiStatuses(): TdlResult<EmojiStatusCustomEmojis> {
        val function = TdApi.GetDefaultChatEmojiStatuses()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getDefaultChatPhotoCustomEmojiStickers(): TdlResult<Stickers> {
        val function = TdApi.GetDefaultChatPhotoCustomEmojiStickers()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getDefaultEmojiStatuses(): TdlResult<EmojiStatusCustomEmojis> {
        val function = TdApi.GetDefaultEmojiStatuses()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getDefaultMessageAutoDeleteTime(): TdlResult<MessageAutoDeleteTime> {
        val function = TdApi.GetDefaultMessageAutoDeleteTime()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getDefaultProfilePhotoCustomEmojiStickers(): TdlResult<Stickers> {
        val function = TdApi.GetDefaultProfilePhotoCustomEmojiStickers()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getDirectMessagesChatTopic(chatId: Long, topicId: Long): TdlResult<DirectMessagesChatTopic> {
        val function = TdApi.GetDirectMessagesChatTopic(
            chatId = chatId,
            topicId = topicId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getDirectMessagesChatTopicHistory(
        chatId: Long,
        topicId: Long,
        fromMessageId: Long,
        offset: Int,
        limit: Int,
    ): TdlResult<Messages> {
        val function = TdApi.GetDirectMessagesChatTopicHistory(
            chatId = chatId,
            topicId = topicId,
            fromMessageId = fromMessageId,
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getDirectMessagesChatTopicMessageByDate(
        chatId: Long,
        topicId: Long,
        date: Int,
    ): TdlResult<Message> {
        val function = TdApi.GetDirectMessagesChatTopicMessageByDate(
            chatId = chatId,
            topicId = topicId,
            date = date,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getDisallowedChatEmojiStatuses(): TdlResult<EmojiStatusCustomEmojis> {
        val function = TdApi.GetDisallowedChatEmojiStatuses()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getEmojiCategories(type: EmojiCategoryType?): TdlResult<EmojiCategories> {
        val function = TdApi.GetEmojiCategories(
            type = type?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getEmojiReaction(emoji: String): TdlResult<EmojiReaction> {
        val function = TdApi.GetEmojiReaction(
            emoji = emoji,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getEmojiSuggestionsUrl(languageCode: String): TdlResult<HttpUrl> {
        val function = TdApi.GetEmojiSuggestionsUrl(
            languageCode = languageCode,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getExternalLink(link: String, allowWriteAccess: Boolean): TdlResult<HttpUrl> {
        val function = TdApi.GetExternalLink(
            link = link,
            allowWriteAccess = allowWriteAccess,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getExternalLinkInfo(link: String): TdlResult<LoginUrlInfo> {
        val function = TdApi.GetExternalLinkInfo(
            link = link,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getFavoriteStickers(): TdlResult<Stickers> {
        val function = TdApi.GetFavoriteStickers()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getFile(fileId: Int): TdlResult<File> {
        val function = TdApi.GetFile(
            fileId = fileId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getFileDownloadedPrefixSize(fileId: Int, offset: Long): TdlResult<FileDownloadedPrefixSize> {
        val function = TdApi.GetFileDownloadedPrefixSize(
            fileId = fileId,
            offset = offset,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getFileExtension(mimeType: String): TdlResult<Text> {
        val function = TdApi.GetFileExtension(
            mimeType = mimeType,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getFileMimeType(fileName: String): TdlResult<Text> {
        val function = TdApi.GetFileMimeType(
            fileName = fileName,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getForumTopic(chatId: Long, messageThreadId: Long): TdlResult<ForumTopic> {
        val function = TdApi.GetForumTopic(
            chatId = chatId,
            messageThreadId = messageThreadId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getForumTopicDefaultIcons(): TdlResult<Stickers> {
        val function = TdApi.GetForumTopicDefaultIcons()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getForumTopicLink(chatId: Long, messageThreadId: Long): TdlResult<MessageLink> {
        val function = TdApi.GetForumTopicLink(
            chatId = chatId,
            messageThreadId = messageThreadId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getForumTopics(
        chatId: Long,
        query: String,
        offsetDate: Int,
        offsetMessageId: Long,
        offsetMessageThreadId: Long,
        limit: Int,
    ): TdlResult<ForumTopics> {
        val function = TdApi.GetForumTopics(
            chatId = chatId,
            query = query,
            offsetDate = offsetDate,
            offsetMessageId = offsetMessageId,
            offsetMessageThreadId = offsetMessageThreadId,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getGameHighScores(
        chatId: Long,
        messageId: Long,
        userId: Long,
    ): TdlResult<GameHighScores> {
        val function = TdApi.GetGameHighScores(
            chatId = chatId,
            messageId = messageId,
            userId = userId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getGiftUpgradePreview(giftId: Long): TdlResult<GiftUpgradePreview> {
        val function = TdApi.GetGiftUpgradePreview(
            giftId = giftId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getGiveawayInfo(chatId: Long, messageId: Long): TdlResult<GiveawayInfo> {
        val function = TdApi.GetGiveawayInfo(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getGreetingStickers(): TdlResult<Stickers> {
        val function = TdApi.GetGreetingStickers()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getGrossingWebAppBots(offset: String, limit: Int): TdlResult<FoundUsers> {
        val function = TdApi.GetGrossingWebAppBots(
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getGroupCall(groupCallId: Int): TdlResult<GroupCall> {
        val function = TdApi.GetGroupCall(
            groupCallId = groupCallId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getGroupCallParticipants(inputGroupCall: InputGroupCall, limit: Int): TdlResult<GroupCallParticipants> {
        val function = TdApi.GetGroupCallParticipants(
            inputGroupCall = mapper.map(inputGroupCall),
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getGroupsInCommon(
        userId: Long,
        offsetChatId: Long,
        limit: Int,
    ): TdlResult<Chats> {
        val function = TdApi.GetGroupsInCommon(
            userId = userId,
            offsetChatId = offsetChatId,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getImportedContactCount(): TdlResult<Count> {
        val function = TdApi.GetImportedContactCount()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getInactiveSupergroupChats(): TdlResult<Chats> {
        val function = TdApi.GetInactiveSupergroupChats()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getInlineGameHighScores(inlineMessageId: String, userId: Long): TdlResult<GameHighScores> {
        val function = TdApi.GetInlineGameHighScores(
            inlineMessageId = inlineMessageId,
            userId = userId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getInlineQueryResults(
        botUserId: Long,
        chatId: Long,
        userLocation: Location?,
        query: String,
        offset: String,
    ): TdlResult<InlineQueryResults> {
        val function = TdApi.GetInlineQueryResults(
            botUserId = botUserId,
            chatId = chatId,
            userLocation = userLocation?.let { mapper.map(it) },
            query = query,
            offset = offset,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getInstalledBackgrounds(forDarkTheme: Boolean): TdlResult<Backgrounds> {
        val function = TdApi.GetInstalledBackgrounds(
            forDarkTheme = forDarkTheme,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getInstalledStickerSets(stickerType: StickerType): TdlResult<StickerSets> {
        val function = TdApi.GetInstalledStickerSets(
            stickerType = mapper.map(stickerType),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getInternalLink(type: InternalLinkType, isHttp: Boolean): TdlResult<HttpUrl> {
        val function = TdApi.GetInternalLink(
            type = mapper.map(type),
            isHttp = isHttp,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getInternalLinkType(link: String): TdlResult<InternalLinkType> {
        val function = TdApi.GetInternalLinkType(
            link = link,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getJsonString(jsonValue: JsonValue): TdlResult<Text> {
        val function = TdApi.GetJsonString(
            jsonValue = mapper.map(jsonValue),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getJsonValue(json: String): TdlResult<JsonValue> {
        val function = TdApi.GetJsonValue(
            json = json,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getKeywordEmojis(text: String, inputLanguageCodes: Array<String>): TdlResult<Emojis> {
        val function = TdApi.GetKeywordEmojis(
            text = text,
            inputLanguageCodes = inputLanguageCodes,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getLanguagePackInfo(languagePackId: String): TdlResult<LanguagePackInfo> {
        val function = TdApi.GetLanguagePackInfo(
            languagePackId = languagePackId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getLanguagePackString(
        languagePackDatabasePath: String,
        localizationTarget: String,
        languagePackId: String,
        key: String,
    ): TdlResult<LanguagePackStringValue> {
        val function = TdApi.GetLanguagePackString(
            languagePackDatabasePath = languagePackDatabasePath,
            localizationTarget = localizationTarget,
            languagePackId = languagePackId,
            key = key,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getLanguagePackStrings(languagePackId: String, keys: Array<String>): TdlResult<LanguagePackStrings> {
        val function = TdApi.GetLanguagePackStrings(
            languagePackId = languagePackId,
            keys = keys,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getLinkPreview(text: FormattedText, linkPreviewOptions: LinkPreviewOptions?): TdlResult<LinkPreview> {
        val function = TdApi.GetLinkPreview(
            text = mapper.map(text),
            linkPreviewOptions = linkPreviewOptions?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getLocalizationTargetInfo(onlyLocal: Boolean): TdlResult<LocalizationTargetInfo> {
        val function = TdApi.GetLocalizationTargetInfo(
            onlyLocal = onlyLocal,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getLogStream(): TdlResult<LogStream> {
        val function = TdApi.GetLogStream()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getLogTagVerbosityLevel(tag: String): TdlResult<LogVerbosityLevel> {
        val function = TdApi.GetLogTagVerbosityLevel(
            tag = tag,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getLogTags(): TdlResult<LogTags> {
        val function = TdApi.GetLogTags()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getLogVerbosityLevel(): TdlResult<LogVerbosityLevel> {
        val function = TdApi.GetLogVerbosityLevel()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getLoginUrl(
        chatId: Long,
        messageId: Long,
        buttonId: Long,
        allowWriteAccess: Boolean,
    ): TdlResult<HttpUrl> {
        val function = TdApi.GetLoginUrl(
            chatId = chatId,
            messageId = messageId,
            buttonId = buttonId,
            allowWriteAccess = allowWriteAccess,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getLoginUrlInfo(
        chatId: Long,
        messageId: Long,
        buttonId: Long,
    ): TdlResult<LoginUrlInfo> {
        val function = TdApi.GetLoginUrlInfo(
            chatId = chatId,
            messageId = messageId,
            buttonId = buttonId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMainWebApp(
        chatId: Long,
        botUserId: Long,
        startParameter: String,
        parameters: WebAppOpenParameters,
    ): TdlResult<MainWebApp> {
        val function = TdApi.GetMainWebApp(
            chatId = chatId,
            botUserId = botUserId,
            startParameter = startParameter,
            parameters = mapper.map(parameters),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMapThumbnailFile(
        location: Location,
        zoom: Int,
        width: Int,
        height: Int,
        scale: Int,
        chatId: Long,
    ): TdlResult<File> {
        val function = TdApi.GetMapThumbnailFile(
            location = mapper.map(location),
            zoom = zoom,
            width = width,
            height = height,
            scale = scale,
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMarkdownText(text: FormattedText): TdlResult<FormattedText> {
        val function = TdApi.GetMarkdownText(
            text = mapper.map(text),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMe(): TdlResult<User> {
        val function = TdApi.GetMe()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMenuButton(userId: Long): TdlResult<BotMenuButton> {
        val function = TdApi.GetMenuButton(
            userId = userId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessage(chatId: Long, messageId: Long): TdlResult<Message> {
        val function = TdApi.GetMessage(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessageAddedReactions(
        chatId: Long,
        messageId: Long,
        reactionType: ReactionType?,
        offset: String,
        limit: Int,
    ): TdlResult<AddedReactions> {
        val function = TdApi.GetMessageAddedReactions(
            chatId = chatId,
            messageId = messageId,
            reactionType = reactionType?.let { mapper.map(it) },
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessageAuthor(chatId: Long, messageId: Long): TdlResult<User> {
        val function = TdApi.GetMessageAuthor(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessageAvailableReactions(
        chatId: Long,
        messageId: Long,
        rowSize: Int,
    ): TdlResult<AvailableReactions> {
        val function = TdApi.GetMessageAvailableReactions(
            chatId = chatId,
            messageId = messageId,
            rowSize = rowSize,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessageEffect(effectId: Long): TdlResult<MessageEffect> {
        val function = TdApi.GetMessageEffect(
            effectId = effectId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessageEmbeddingCode(
        chatId: Long,
        messageId: Long,
        forAlbum: Boolean,
    ): TdlResult<Text> {
        val function = TdApi.GetMessageEmbeddingCode(
            chatId = chatId,
            messageId = messageId,
            forAlbum = forAlbum,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessageFileType(messageFileHead: String): TdlResult<MessageFileType> {
        val function = TdApi.GetMessageFileType(
            messageFileHead = messageFileHead,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessageImportConfirmationText(chatId: Long): TdlResult<Text> {
        val function = TdApi.GetMessageImportConfirmationText(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessageLink(
        chatId: Long,
        messageId: Long,
        mediaTimestamp: Int,
        forAlbum: Boolean,
        inMessageThread: Boolean,
    ): TdlResult<MessageLink> {
        val function = TdApi.GetMessageLink(
            chatId = chatId,
            messageId = messageId,
            mediaTimestamp = mediaTimestamp,
            forAlbum = forAlbum,
            inMessageThread = inMessageThread,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessageLinkInfo(url: String): TdlResult<MessageLinkInfo> {
        val function = TdApi.GetMessageLinkInfo(
            url = url,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessageLocally(chatId: Long, messageId: Long): TdlResult<Message> {
        val function = TdApi.GetMessageLocally(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessageProperties(chatId: Long, messageId: Long): TdlResult<MessageProperties> {
        val function = TdApi.GetMessageProperties(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessagePublicForwards(
        chatId: Long,
        messageId: Long,
        offset: String,
        limit: Int,
    ): TdlResult<PublicForwards> {
        val function = TdApi.GetMessagePublicForwards(
            chatId = chatId,
            messageId = messageId,
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessageReadDate(chatId: Long, messageId: Long): TdlResult<MessageReadDate> {
        val function = TdApi.GetMessageReadDate(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessageStatistics(
        chatId: Long,
        messageId: Long,
        isDark: Boolean,
    ): TdlResult<MessageStatistics> {
        val function = TdApi.GetMessageStatistics(
            chatId = chatId,
            messageId = messageId,
            isDark = isDark,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessageThread(chatId: Long, messageId: Long): TdlResult<MessageThreadInfo> {
        val function = TdApi.GetMessageThread(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessageThreadHistory(
        chatId: Long,
        messageId: Long,
        fromMessageId: Long,
        offset: Int,
        limit: Int,
    ): TdlResult<Messages> {
        val function = TdApi.GetMessageThreadHistory(
            chatId = chatId,
            messageId = messageId,
            fromMessageId = fromMessageId,
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessageViewers(chatId: Long, messageId: Long): TdlResult<MessageViewers> {
        val function = TdApi.GetMessageViewers(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessages(chatId: Long, messageIds: LongArray): TdlResult<Messages> {
        val function = TdApi.GetMessages(
            chatId = chatId,
            messageIds = messageIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getNetworkStatistics(onlyCurrent: Boolean): TdlResult<NetworkStatistics> {
        val function = TdApi.GetNetworkStatistics(
            onlyCurrent = onlyCurrent,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getNewChatPrivacySettings(): TdlResult<NewChatPrivacySettings> {
        val function = TdApi.GetNewChatPrivacySettings()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getOption(name: String): TdlResult<OptionValue> {
        val function = TdApi.GetOption(
            name = name,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getOwnedBots(): TdlResult<Users> {
        val function = TdApi.GetOwnedBots()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getOwnedStickerSets(offsetStickerSetId: Long, limit: Int): TdlResult<StickerSets> {
        val function = TdApi.GetOwnedStickerSets(
            offsetStickerSetId = offsetStickerSetId,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPaidMessageRevenue(userId: Long): TdlResult<StarCount> {
        val function = TdApi.GetPaidMessageRevenue(
            userId = userId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPassportAuthorizationForm(
        botUserId: Long,
        scope: String,
        publicKey: String,
        nonce: String,
    ): TdlResult<PassportAuthorizationForm> {
        val function = TdApi.GetPassportAuthorizationForm(
            botUserId = botUserId,
            scope = scope,
            publicKey = publicKey,
            nonce = nonce,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPassportAuthorizationFormAvailableElements(authorizationFormId: Int, password: String): TdlResult<PassportElementsWithErrors> {
        val function = TdApi.GetPassportAuthorizationFormAvailableElements(
            authorizationFormId = authorizationFormId,
            password = password,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPassportElement(type: PassportElementType, password: String): TdlResult<PassportElement> {
        val function = TdApi.GetPassportElement(
            type = mapper.map(type),
            password = password,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPasswordState(): TdlResult<PasswordState> {
        val function = TdApi.GetPasswordState()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPaymentForm(inputInvoice: InputInvoice, theme: ThemeParameters?): TdlResult<PaymentForm> {
        val function = TdApi.GetPaymentForm(
            inputInvoice = mapper.map(inputInvoice),
            theme = theme?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPaymentReceipt(chatId: Long, messageId: Long): TdlResult<PaymentReceipt> {
        val function = TdApi.GetPaymentReceipt(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPhoneNumberInfo(phoneNumberPrefix: String): TdlResult<PhoneNumberInfo> {
        val function = TdApi.GetPhoneNumberInfo(
            phoneNumberPrefix = phoneNumberPrefix,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPhoneNumberInfoSync(languageCode: String, phoneNumberPrefix: String): TdlResult<PhoneNumberInfo> {
        val function = TdApi.GetPhoneNumberInfoSync(
            languageCode = languageCode,
            phoneNumberPrefix = phoneNumberPrefix,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPollVoters(
        chatId: Long,
        messageId: Long,
        optionId: Int,
        offset: Int,
        limit: Int,
    ): TdlResult<MessageSenders> {
        val function = TdApi.GetPollVoters(
            chatId = chatId,
            messageId = messageId,
            optionId = optionId,
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPreferredCountryLanguage(countryCode: String): TdlResult<Text> {
        val function = TdApi.GetPreferredCountryLanguage(
            countryCode = countryCode,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPremiumFeatures(source: PremiumSource?): TdlResult<PremiumFeatures> {
        val function = TdApi.GetPremiumFeatures(
            source = source?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPremiumGiftPaymentOptions(): TdlResult<PremiumGiftPaymentOptions> {
        val function = TdApi.GetPremiumGiftPaymentOptions()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPremiumGiveawayPaymentOptions(boostedChatId: Long): TdlResult<PremiumGiveawayPaymentOptions> {
        val function = TdApi.GetPremiumGiveawayPaymentOptions(
            boostedChatId = boostedChatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPremiumInfoSticker(monthCount: Int): TdlResult<Sticker> {
        val function = TdApi.GetPremiumInfoSticker(
            monthCount = monthCount,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPremiumLimit(limitType: PremiumLimitType): TdlResult<PremiumLimit> {
        val function = TdApi.GetPremiumLimit(
            limitType = mapper.map(limitType),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPremiumState(): TdlResult<PremiumState> {
        val function = TdApi.GetPremiumState()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPremiumStickerExamples(): TdlResult<Stickers> {
        val function = TdApi.GetPremiumStickerExamples()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPremiumStickers(limit: Int): TdlResult<Stickers> {
        val function = TdApi.GetPremiumStickers(
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPreparedInlineMessage(botUserId: Long, preparedMessageId: String): TdlResult<PreparedInlineMessage> {
        val function = TdApi.GetPreparedInlineMessage(
            botUserId = botUserId,
            preparedMessageId = preparedMessageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getProxies(): TdlResult<Proxies> {
        val function = TdApi.GetProxies()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getProxyLink(proxyId: Int): TdlResult<HttpUrl> {
        val function = TdApi.GetProxyLink(
            proxyId = proxyId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPushReceiverId(payload: String): TdlResult<PushReceiverId> {
        val function = TdApi.GetPushReceiverId(
            payload = payload,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getReadDatePrivacySettings(): TdlResult<ReadDatePrivacySettings> {
        val function = TdApi.GetReadDatePrivacySettings()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getReceivedGift(receivedGiftId: String): TdlResult<ReceivedGift> {
        val function = TdApi.GetReceivedGift(
            receivedGiftId = receivedGiftId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getReceivedGifts(
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
    ): TdlResult<ReceivedGifts> {
        val function = TdApi.GetReceivedGifts(
            businessConnectionId = businessConnectionId,
            ownerId = mapper.map(ownerId),
            excludeUnsaved = excludeUnsaved,
            excludeSaved = excludeSaved,
            excludeUnlimited = excludeUnlimited,
            excludeLimited = excludeLimited,
            excludeUpgraded = excludeUpgraded,
            sortByPrice = sortByPrice,
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getRecentEmojiStatuses(): TdlResult<EmojiStatuses> {
        val function = TdApi.GetRecentEmojiStatuses()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getRecentInlineBots(): TdlResult<Users> {
        val function = TdApi.GetRecentInlineBots()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getRecentStickers(isAttached: Boolean): TdlResult<Stickers> {
        val function = TdApi.GetRecentStickers(
            isAttached = isAttached,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getRecentlyOpenedChats(limit: Int): TdlResult<Chats> {
        val function = TdApi.GetRecentlyOpenedChats(
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getRecentlyVisitedTMeUrls(referrer: String): TdlResult<TMeUrls> {
        val function = TdApi.GetRecentlyVisitedTMeUrls(
            referrer = referrer,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getRecommendedChatFolders(): TdlResult<RecommendedChatFolders> {
        val function = TdApi.GetRecommendedChatFolders()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getRecommendedChats(): TdlResult<Chats> {
        val function = TdApi.GetRecommendedChats()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getRecoveryEmailAddress(password: String): TdlResult<RecoveryEmailAddress> {
        val function = TdApi.GetRecoveryEmailAddress(
            password = password,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getRemoteFile(remoteFileId: String, fileType: FileType?): TdlResult<File> {
        val function = TdApi.GetRemoteFile(
            remoteFileId = remoteFileId,
            fileType = fileType?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getRepliedMessage(chatId: Long, messageId: Long): TdlResult<Message> {
        val function = TdApi.GetRepliedMessage(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSavedAnimations(): TdlResult<Animations> {
        val function = TdApi.GetSavedAnimations()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSavedMessagesTags(savedMessagesTopicId: Long): TdlResult<SavedMessagesTags> {
        val function = TdApi.GetSavedMessagesTags(
            savedMessagesTopicId = savedMessagesTopicId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSavedMessagesTopicHistory(
        savedMessagesTopicId: Long,
        fromMessageId: Long,
        offset: Int,
        limit: Int,
    ): TdlResult<Messages> {
        val function = TdApi.GetSavedMessagesTopicHistory(
            savedMessagesTopicId = savedMessagesTopicId,
            fromMessageId = fromMessageId,
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSavedMessagesTopicMessageByDate(savedMessagesTopicId: Long, date: Int): TdlResult<Message> {
        val function = TdApi.GetSavedMessagesTopicMessageByDate(
            savedMessagesTopicId = savedMessagesTopicId,
            date = date,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSavedNotificationSound(notificationSoundId: Long): TdlResult<NotificationSounds> {
        val function = TdApi.GetSavedNotificationSound(
            notificationSoundId = notificationSoundId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSavedNotificationSounds(): TdlResult<NotificationSounds> {
        val function = TdApi.GetSavedNotificationSounds()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSavedOrderInfo(): TdlResult<OrderInfo> {
        val function = TdApi.GetSavedOrderInfo()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getScopeNotificationSettings(scope: NotificationSettingsScope): TdlResult<ScopeNotificationSettings> {
        val function = TdApi.GetScopeNotificationSettings(
            scope = mapper.map(scope),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSearchSponsoredChats(query: String): TdlResult<SponsoredChats> {
        val function = TdApi.GetSearchSponsoredChats(
            query = query,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSearchedForTags(tagPrefix: String, limit: Int): TdlResult<Hashtags> {
        val function = TdApi.GetSearchedForTags(
            tagPrefix = tagPrefix,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSecretChat(secretChatId: Int): TdlResult<SecretChat> {
        val function = TdApi.GetSecretChat(
            secretChatId = secretChatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStarAdAccountUrl(ownerId: MessageSender): TdlResult<HttpUrl> {
        val function = TdApi.GetStarAdAccountUrl(
            ownerId = mapper.map(ownerId),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStarGiftPaymentOptions(userId: Long): TdlResult<StarPaymentOptions> {
        val function = TdApi.GetStarGiftPaymentOptions(
            userId = userId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStarGiveawayPaymentOptions(): TdlResult<StarGiveawayPaymentOptions> {
        val function = TdApi.GetStarGiveawayPaymentOptions()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStarPaymentOptions(): TdlResult<StarPaymentOptions> {
        val function = TdApi.GetStarPaymentOptions()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStarRevenueStatistics(ownerId: MessageSender, isDark: Boolean): TdlResult<StarRevenueStatistics> {
        val function = TdApi.GetStarRevenueStatistics(
            ownerId = mapper.map(ownerId),
            isDark = isDark,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStarSubscriptions(onlyExpiring: Boolean, offset: String): TdlResult<StarSubscriptions> {
        val function = TdApi.GetStarSubscriptions(
            onlyExpiring = onlyExpiring,
            offset = offset,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStarTransactions(
        ownerId: MessageSender,
        subscriptionId: String,
        direction: StarTransactionDirection?,
        offset: String,
        limit: Int,
    ): TdlResult<StarTransactions> {
        val function = TdApi.GetStarTransactions(
            ownerId = mapper.map(ownerId),
            subscriptionId = subscriptionId,
            direction = direction?.let { mapper.map(it) },
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStarWithdrawalUrl(
        ownerId: MessageSender,
        starCount: Long,
        password: String,
    ): TdlResult<HttpUrl> {
        val function = TdApi.GetStarWithdrawalUrl(
            ownerId = mapper.map(ownerId),
            starCount = starCount,
            password = password,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStatisticalGraph(
        chatId: Long,
        token: String,
        x: Long,
    ): TdlResult<StatisticalGraph> {
        val function = TdApi.GetStatisticalGraph(
            chatId = chatId,
            token = token,
            x = x,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStickerEmojis(sticker: InputFile): TdlResult<Emojis> {
        val function = TdApi.GetStickerEmojis(
            sticker = mapper.map(sticker),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStickerOutline(
        stickerFileId: Int,
        forAnimatedEmoji: Boolean,
        forClickedAnimatedEmojiMessage: Boolean,
    ): TdlResult<Outline> {
        val function = TdApi.GetStickerOutline(
            stickerFileId = stickerFileId,
            forAnimatedEmoji = forAnimatedEmoji,
            forClickedAnimatedEmojiMessage = forClickedAnimatedEmojiMessage,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStickerSet(setId: Long): TdlResult<StickerSet> {
        val function = TdApi.GetStickerSet(
            setId = setId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStickerSetName(setId: Long): TdlResult<Text> {
        val function = TdApi.GetStickerSetName(
            setId = setId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStickers(
        stickerType: StickerType,
        query: String,
        limit: Int,
        chatId: Long,
    ): TdlResult<Stickers> {
        val function = TdApi.GetStickers(
            stickerType = mapper.map(stickerType),
            query = query,
            limit = limit,
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStorageStatistics(chatLimit: Int): TdlResult<StorageStatistics> {
        val function = TdApi.GetStorageStatistics(
            chatLimit = chatLimit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStorageStatisticsFast(): TdlResult<StorageStatisticsFast> {
        val function = TdApi.GetStorageStatisticsFast()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStory(
        storyPosterChatId: Long,
        storyId: Int,
        onlyLocal: Boolean,
    ): TdlResult<Story> {
        val function = TdApi.GetStory(
            storyPosterChatId = storyPosterChatId,
            storyId = storyId,
            onlyLocal = onlyLocal,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStoryAvailableReactions(rowSize: Int): TdlResult<AvailableReactions> {
        val function = TdApi.GetStoryAvailableReactions(
            rowSize = rowSize,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStoryInteractions(
        storyId: Int,
        query: String,
        onlyContacts: Boolean,
        preferForwards: Boolean,
        preferWithReaction: Boolean,
        offset: String,
        limit: Int,
    ): TdlResult<StoryInteractions> {
        val function = TdApi.GetStoryInteractions(
            storyId = storyId,
            query = query,
            onlyContacts = onlyContacts,
            preferForwards = preferForwards,
            preferWithReaction = preferWithReaction,
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStoryNotificationSettingsExceptions(): TdlResult<Chats> {
        val function = TdApi.GetStoryNotificationSettingsExceptions()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStoryPublicForwards(
        storyPosterChatId: Long,
        storyId: Int,
        offset: String,
        limit: Int,
    ): TdlResult<PublicForwards> {
        val function = TdApi.GetStoryPublicForwards(
            storyPosterChatId = storyPosterChatId,
            storyId = storyId,
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStoryStatistics(
        chatId: Long,
        storyId: Int,
        isDark: Boolean,
    ): TdlResult<StoryStatistics> {
        val function = TdApi.GetStoryStatistics(
            chatId = chatId,
            storyId = storyId,
            isDark = isDark,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSuggestedFileName(fileId: Int, directory: String): TdlResult<Text> {
        val function = TdApi.GetSuggestedFileName(
            fileId = fileId,
            directory = directory,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSuggestedStickerSetName(title: String): TdlResult<Text> {
        val function = TdApi.GetSuggestedStickerSetName(
            title = title,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSuitableDiscussionChats(): TdlResult<Chats> {
        val function = TdApi.GetSuitableDiscussionChats()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSuitablePersonalChats(): TdlResult<Chats> {
        val function = TdApi.GetSuitablePersonalChats()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSupergroup(supergroupId: Long): TdlResult<Supergroup> {
        val function = TdApi.GetSupergroup(
            supergroupId = supergroupId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSupergroupFullInfo(supergroupId: Long): TdlResult<SupergroupFullInfo> {
        val function = TdApi.GetSupergroupFullInfo(
            supergroupId = supergroupId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSupergroupMembers(
        supergroupId: Long,
        filter: SupergroupMembersFilter?,
        offset: Int,
        limit: Int,
    ): TdlResult<ChatMembers> {
        val function = TdApi.GetSupergroupMembers(
            supergroupId = supergroupId,
            filter = filter?.let { mapper.map(it) },
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSupportName(): TdlResult<Text> {
        val function = TdApi.GetSupportName()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSupportUser(): TdlResult<User> {
        val function = TdApi.GetSupportUser()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getTemporaryPasswordState(): TdlResult<TemporaryPasswordState> {
        val function = TdApi.GetTemporaryPasswordState()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getTextEntities(text: String): TdlResult<TextEntities> {
        val function = TdApi.GetTextEntities(
            text = text,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getThemeParametersJsonString(theme: ThemeParameters): TdlResult<Text> {
        val function = TdApi.GetThemeParametersJsonString(
            theme = mapper.map(theme),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getThemedChatEmojiStatuses(): TdlResult<EmojiStatusCustomEmojis> {
        val function = TdApi.GetThemedChatEmojiStatuses()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getThemedEmojiStatuses(): TdlResult<EmojiStatusCustomEmojis> {
        val function = TdApi.GetThemedEmojiStatuses()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getTimeZones(): TdlResult<TimeZones> {
        val function = TdApi.GetTimeZones()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getTopChats(category: TopChatCategory, limit: Int): TdlResult<Chats> {
        val function = TdApi.GetTopChats(
            category = mapper.map(category),
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getTrendingStickerSets(
        stickerType: StickerType,
        offset: Int,
        limit: Int,
    ): TdlResult<TrendingStickerSets> {
        val function = TdApi.GetTrendingStickerSets(
            stickerType = mapper.map(stickerType),
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getUpgradedGift(name: String): TdlResult<UpgradedGift> {
        val function = TdApi.GetUpgradedGift(
            name = name,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getUpgradedGiftEmojiStatuses(): TdlResult<EmojiStatuses> {
        val function = TdApi.GetUpgradedGiftEmojiStatuses()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getUpgradedGiftWithdrawalUrl(receivedGiftId: String, password: String): TdlResult<HttpUrl> {
        val function = TdApi.GetUpgradedGiftWithdrawalUrl(
            receivedGiftId = receivedGiftId,
            password = password,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getUser(userId: Long): TdlResult<User> {
        val function = TdApi.GetUser(
            userId = userId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getUserChatBoosts(chatId: Long, userId: Long): TdlResult<FoundChatBoosts> {
        val function = TdApi.GetUserChatBoosts(
            chatId = chatId,
            userId = userId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getUserFullInfo(userId: Long): TdlResult<UserFullInfo> {
        val function = TdApi.GetUserFullInfo(
            userId = userId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getUserLink(): TdlResult<UserLink> {
        val function = TdApi.GetUserLink()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getUserPrivacySettingRules(setting: UserPrivacySetting): TdlResult<UserPrivacySettingRules> {
        val function = TdApi.GetUserPrivacySettingRules(
            setting = mapper.map(setting),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getUserProfilePhotos(
        userId: Long,
        offset: Int,
        limit: Int,
    ): TdlResult<ChatPhotos> {
        val function = TdApi.GetUserProfilePhotos(
            userId = userId,
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getUserSupportInfo(userId: Long): TdlResult<UserSupportInfo> {
        val function = TdApi.GetUserSupportInfo(
            userId = userId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getVideoChatAvailableParticipants(chatId: Long): TdlResult<MessageSenders> {
        val function = TdApi.GetVideoChatAvailableParticipants(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getVideoChatInviteLink(groupCallId: Int, canSelfUnmute: Boolean): TdlResult<HttpUrl> {
        val function = TdApi.GetVideoChatInviteLink(
            groupCallId = groupCallId,
            canSelfUnmute = canSelfUnmute,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getVideoChatRtmpUrl(chatId: Long): TdlResult<RtmpUrl> {
        val function = TdApi.GetVideoChatRtmpUrl(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getVideoChatStreamSegment(
        groupCallId: Int,
        timeOffset: Long,
        scale: Int,
        channelId: Int,
        videoQuality: GroupCallVideoQuality?,
    ): TdlResult<Data> {
        val function = TdApi.GetVideoChatStreamSegment(
            groupCallId = groupCallId,
            timeOffset = timeOffset,
            scale = scale,
            channelId = channelId,
            videoQuality = videoQuality?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getVideoChatStreams(groupCallId: Int): TdlResult<VideoChatStreams> {
        val function = TdApi.GetVideoChatStreams(
            groupCallId = groupCallId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getWebAppLinkUrl(
        chatId: Long,
        botUserId: Long,
        webAppShortName: String,
        startParameter: String,
        allowWriteAccess: Boolean,
        parameters: WebAppOpenParameters,
    ): TdlResult<HttpUrl> {
        val function = TdApi.GetWebAppLinkUrl(
            chatId = chatId,
            botUserId = botUserId,
            webAppShortName = webAppShortName,
            startParameter = startParameter,
            allowWriteAccess = allowWriteAccess,
            parameters = mapper.map(parameters),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getWebAppPlaceholder(botUserId: Long): TdlResult<Outline> {
        val function = TdApi.GetWebAppPlaceholder(
            botUserId = botUserId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getWebAppUrl(
        botUserId: Long,
        url: String,
        parameters: WebAppOpenParameters,
    ): TdlResult<HttpUrl> {
        val function = TdApi.GetWebAppUrl(
            botUserId = botUserId,
            url = url,
            parameters = mapper.map(parameters),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getWebPageInstantView(url: String, onlyLocal: Boolean): TdlResult<WebPageInstantView> {
        val function = TdApi.GetWebPageInstantView(
            url = url,
            onlyLocal = onlyLocal,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun giftPremiumWithStars(
        userId: Long,
        starCount: Long,
        monthCount: Int,
        text: FormattedText,
    ): TdlResult<Ok> {
        val function = TdApi.GiftPremiumWithStars(
            userId = userId,
            starCount = starCount,
            monthCount = monthCount,
            text = mapper.map(text),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun hideContactCloseBirthdays(): TdlResult<Ok> {
        val function = TdApi.HideContactCloseBirthdays()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun hideSuggestedAction(action: SuggestedAction): TdlResult<Ok> {
        val function = TdApi.HideSuggestedAction(
            action = mapper.map(action),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun importContacts(contacts: Array<Contact>): TdlResult<ImportedContacts> {
        val function = TdApi.ImportContacts(
            contacts = contacts.mapArray { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun importMessages(
        chatId: Long,
        messageFile: InputFile,
        attachedFiles: Array<InputFile>,
    ): TdlResult<Ok> {
        val function = TdApi.ImportMessages(
            chatId = chatId,
            messageFile = mapper.map(messageFile),
            attachedFiles = attachedFiles.mapArray { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun inviteGroupCallParticipant(
        groupCallId: Int,
        userId: Long,
        isVideo: Boolean,
    ): TdlResult<InviteGroupCallParticipantResult> {
        val function = TdApi.InviteGroupCallParticipant(
            groupCallId = groupCallId,
            userId = userId,
            isVideo = isVideo,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun inviteVideoChatParticipants(groupCallId: Int, userIds: LongArray): TdlResult<Ok> {
        val function = TdApi.InviteVideoChatParticipants(
            groupCallId = groupCallId,
            userIds = userIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun joinChat(chatId: Long): TdlResult<Ok> {
        val function = TdApi.JoinChat(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun joinChatByInviteLink(inviteLink: String): TdlResult<Chat> {
        val function = TdApi.JoinChatByInviteLink(
            inviteLink = inviteLink,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun joinGroupCall(inputGroupCall: InputGroupCall, joinParameters: GroupCallJoinParameters): TdlResult<GroupCallInfo> {
        val function = TdApi.JoinGroupCall(
            inputGroupCall = mapper.map(inputGroupCall),
            joinParameters = mapper.map(joinParameters),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun joinVideoChat(
        groupCallId: Int,
        participantId: MessageSender?,
        joinParameters: GroupCallJoinParameters,
        inviteHash: String,
    ): TdlResult<Text> {
        val function = TdApi.JoinVideoChat(
            groupCallId = groupCallId,
            participantId = participantId?.let { mapper.map(it) },
            joinParameters = mapper.map(joinParameters),
            inviteHash = inviteHash,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun launchPrepaidGiveaway(
        giveawayId: Long,
        parameters: GiveawayParameters,
        winnerCount: Int,
        starCount: Long,
    ): TdlResult<Ok> {
        val function = TdApi.LaunchPrepaidGiveaway(
            giveawayId = giveawayId,
            parameters = mapper.map(parameters),
            winnerCount = winnerCount,
            starCount = starCount,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun leaveChat(chatId: Long): TdlResult<Ok> {
        val function = TdApi.LeaveChat(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun leaveGroupCall(groupCallId: Int): TdlResult<Ok> {
        val function = TdApi.LeaveGroupCall(
            groupCallId = groupCallId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun loadActiveStories(storyList: StoryList): TdlResult<Ok> {
        val function = TdApi.LoadActiveStories(
            storyList = mapper.map(storyList),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun loadChats(chatList: ChatList?, limit: Int): TdlResult<Ok> {
        val function = TdApi.LoadChats(
            chatList = chatList?.let { mapper.map(it) },
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun loadDirectMessagesChatTopics(chatId: Long, limit: Int): TdlResult<Ok> {
        val function = TdApi.LoadDirectMessagesChatTopics(
            chatId = chatId,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun loadGroupCallParticipants(groupCallId: Int, limit: Int): TdlResult<Ok> {
        val function = TdApi.LoadGroupCallParticipants(
            groupCallId = groupCallId,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun loadQuickReplyShortcutMessages(shortcutId: Int): TdlResult<Ok> {
        val function = TdApi.LoadQuickReplyShortcutMessages(
            shortcutId = shortcutId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun loadQuickReplyShortcuts(): TdlResult<Ok> {
        val function = TdApi.LoadQuickReplyShortcuts()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun loadSavedMessagesTopics(limit: Int): TdlResult<Ok> {
        val function = TdApi.LoadSavedMessagesTopics(
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun logOut(): TdlResult<Ok> {
        val function = TdApi.LogOut()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun openBotSimilarBot(botUserId: Long, openedBotUserId: Long): TdlResult<Ok> {
        val function = TdApi.OpenBotSimilarBot(
            botUserId = botUserId,
            openedBotUserId = openedBotUserId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun openChat(chatId: Long): TdlResult<Ok> {
        val function = TdApi.OpenChat(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun openChatSimilarChat(chatId: Long, openedChatId: Long): TdlResult<Ok> {
        val function = TdApi.OpenChatSimilarChat(
            chatId = chatId,
            openedChatId = openedChatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun openMessageContent(chatId: Long, messageId: Long): TdlResult<Ok> {
        val function = TdApi.OpenMessageContent(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun openSponsoredChat(sponsoredChatUniqueId: Long): TdlResult<Ok> {
        val function = TdApi.OpenSponsoredChat(
            sponsoredChatUniqueId = sponsoredChatUniqueId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun openStory(storyPosterChatId: Long, storyId: Int): TdlResult<Ok> {
        val function = TdApi.OpenStory(
            storyPosterChatId = storyPosterChatId,
            storyId = storyId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun openWebApp(
        chatId: Long,
        botUserId: Long,
        url: String,
        messageThreadId: Long,
        directMessagesChatTopicId: Long,
        replyTo: InputMessageReplyTo?,
        parameters: WebAppOpenParameters,
    ): TdlResult<WebAppInfo> {
        val function = TdApi.OpenWebApp(
            chatId = chatId,
            botUserId = botUserId,
            url = url,
            messageThreadId = messageThreadId,
            directMessagesChatTopicId = directMessagesChatTopicId,
            replyTo = replyTo?.let { mapper.map(it) },
            parameters = mapper.map(parameters),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun optimizeStorage(
        size: Long,
        ttl: Int,
        count: Int,
        immunityDelay: Int,
        fileTypes: Array<FileType>,
        chatIds: LongArray,
        excludeChatIds: LongArray,
        returnDeletedFileStatistics: Boolean,
        chatLimit: Int,
    ): TdlResult<StorageStatistics> {
        val function = TdApi.OptimizeStorage(
            size = size,
            ttl = ttl,
            count = count,
            immunityDelay = immunityDelay,
            fileTypes = fileTypes.mapArray { mapper.map(it) },
            chatIds = chatIds,
            excludeChatIds = excludeChatIds,
            returnDeletedFileStatistics = returnDeletedFileStatistics,
            chatLimit = chatLimit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun parseMarkdown(text: FormattedText): TdlResult<FormattedText> {
        val function = TdApi.ParseMarkdown(
            text = mapper.map(text),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun parseTextEntities(text: String, parseMode: TextParseMode): TdlResult<FormattedText> {
        val function = TdApi.ParseTextEntities(
            text = text,
            parseMode = mapper.map(parseMode),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun pinChatMessage(
        chatId: Long,
        messageId: Long,
        disableNotification: Boolean,
        onlyForSelf: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.PinChatMessage(
            chatId = chatId,
            messageId = messageId,
            disableNotification = disableNotification,
            onlyForSelf = onlyForSelf,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun pingProxy(proxyId: Int): TdlResult<Seconds> {
        val function = TdApi.PingProxy(
            proxyId = proxyId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun postStory(
        chatId: Long,
        content: InputStoryContent,
        areas: InputStoryAreas?,
        caption: FormattedText?,
        privacySettings: StoryPrivacySettings,
        activePeriod: Int,
        fromStoryFullId: StoryFullId?,
        isPostedToChatPage: Boolean,
        protectContent: Boolean,
    ): TdlResult<Story> {
        val function = TdApi.PostStory(
            chatId = chatId,
            content = mapper.map(content),
            areas = areas?.let { mapper.map(it) },
            caption = caption?.let { mapper.map(it) },
            privacySettings = mapper.map(privacySettings),
            activePeriod = activePeriod,
            fromStoryFullId = fromStoryFullId?.let { mapper.map(it) },
            isPostedToChatPage = isPostedToChatPage,
            protectContent = protectContent,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun preliminaryUploadFile(
        file: InputFile,
        fileType: FileType?,
        priority: Int,
    ): TdlResult<File> {
        val function = TdApi.PreliminaryUploadFile(
            file = mapper.map(file),
            fileType = fileType?.let { mapper.map(it) },
            priority = priority,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun processChatFolderNewChats(chatFolderId: Int, addedChatIds: LongArray): TdlResult<Ok> {
        val function = TdApi.ProcessChatFolderNewChats(
            chatFolderId = chatFolderId,
            addedChatIds = addedChatIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun processChatJoinRequest(
        chatId: Long,
        userId: Long,
        approve: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.ProcessChatJoinRequest(
            chatId = chatId,
            userId = userId,
            approve = approve,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun processChatJoinRequests(
        chatId: Long,
        inviteLink: String,
        approve: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.ProcessChatJoinRequests(
            chatId = chatId,
            inviteLink = inviteLink,
            approve = approve,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun processPushNotification(payload: String): TdlResult<Ok> {
        val function = TdApi.ProcessPushNotification(
            payload = payload,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun rateSpeechRecognition(
        chatId: Long,
        messageId: Long,
        isGood: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.RateSpeechRecognition(
            chatId = chatId,
            messageId = messageId,
            isGood = isGood,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun readAllChatMentions(chatId: Long): TdlResult<Ok> {
        val function = TdApi.ReadAllChatMentions(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun readAllChatReactions(chatId: Long): TdlResult<Ok> {
        val function = TdApi.ReadAllChatReactions(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun readAllDirectMessagesChatTopicReactions(chatId: Long, topicId: Long): TdlResult<Ok> {
        val function = TdApi.ReadAllDirectMessagesChatTopicReactions(
            chatId = chatId,
            topicId = topicId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun readAllMessageThreadMentions(chatId: Long, messageThreadId: Long): TdlResult<Ok> {
        val function = TdApi.ReadAllMessageThreadMentions(
            chatId = chatId,
            messageThreadId = messageThreadId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun readAllMessageThreadReactions(chatId: Long, messageThreadId: Long): TdlResult<Ok> {
        val function = TdApi.ReadAllMessageThreadReactions(
            chatId = chatId,
            messageThreadId = messageThreadId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun readBusinessMessage(
        businessConnectionId: String,
        chatId: Long,
        messageId: Long,
    ): TdlResult<Ok> {
        val function = TdApi.ReadBusinessMessage(
            businessConnectionId = businessConnectionId,
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun readChatList(chatList: ChatList): TdlResult<Ok> {
        val function = TdApi.ReadChatList(
            chatList = mapper.map(chatList),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun readFilePart(
        fileId: Int,
        offset: Long,
        count: Long,
    ): TdlResult<Data> {
        val function = TdApi.ReadFilePart(
            fileId = fileId,
            offset = offset,
            count = count,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun readdQuickReplyShortcutMessages(shortcutName: String, messageIds: LongArray): TdlResult<QuickReplyMessages> {
        val function = TdApi.ReaddQuickReplyShortcutMessages(
            shortcutName = shortcutName,
            messageIds = messageIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun recognizeSpeech(chatId: Long, messageId: Long): TdlResult<Ok> {
        val function = TdApi.RecognizeSpeech(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun recoverAuthenticationPassword(
        recoveryCode: String,
        newPassword: String,
        newHint: String,
    ): TdlResult<Ok> {
        val function = TdApi.RecoverAuthenticationPassword(
            recoveryCode = recoveryCode,
            newPassword = newPassword,
            newHint = newHint,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun recoverPassword(
        recoveryCode: String,
        newPassword: String,
        newHint: String,
    ): TdlResult<PasswordState> {
        val function = TdApi.RecoverPassword(
            recoveryCode = recoveryCode,
            newPassword = newPassword,
            newHint = newHint,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun refundStarPayment(userId: Long, telegramPaymentChargeId: String): TdlResult<Ok> {
        val function = TdApi.RefundStarPayment(
            userId = userId,
            telegramPaymentChargeId = telegramPaymentChargeId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun registerDevice(deviceToken: DeviceToken, otherUserIds: LongArray): TdlResult<PushReceiverId> {
        val function = TdApi.RegisterDevice(
            deviceToken = mapper.map(deviceToken),
            otherUserIds = otherUserIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun registerUser(
        firstName: String,
        lastName: String,
        disableNotification: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.RegisterUser(
            firstName = firstName,
            lastName = lastName,
            disableNotification = disableNotification,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeAllFilesFromDownloads(
        onlyActive: Boolean,
        onlyCompleted: Boolean,
        deleteFromCache: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.RemoveAllFilesFromDownloads(
            onlyActive = onlyActive,
            onlyCompleted = onlyCompleted,
            deleteFromCache = deleteFromCache,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeBusinessConnectedBotFromChat(chatId: Long): TdlResult<Ok> {
        val function = TdApi.RemoveBusinessConnectedBotFromChat(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeChatActionBar(chatId: Long): TdlResult<Ok> {
        val function = TdApi.RemoveChatActionBar(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeContacts(userIds: LongArray): TdlResult<Ok> {
        val function = TdApi.RemoveContacts(
            userIds = userIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeFavoriteSticker(sticker: InputFile): TdlResult<Ok> {
        val function = TdApi.RemoveFavoriteSticker(
            sticker = mapper.map(sticker),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeFileFromDownloads(fileId: Int, deleteFromCache: Boolean): TdlResult<Ok> {
        val function = TdApi.RemoveFileFromDownloads(
            fileId = fileId,
            deleteFromCache = deleteFromCache,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeInstalledBackground(backgroundId: Long): TdlResult<Ok> {
        val function = TdApi.RemoveInstalledBackground(
            backgroundId = backgroundId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeMessageReaction(
        chatId: Long,
        messageId: Long,
        reactionType: ReactionType,
    ): TdlResult<Ok> {
        val function = TdApi.RemoveMessageReaction(
            chatId = chatId,
            messageId = messageId,
            reactionType = mapper.map(reactionType),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeMessageSenderBotVerification(botUserId: Long, verifiedId: MessageSender): TdlResult<Ok> {
        val function = TdApi.RemoveMessageSenderBotVerification(
            botUserId = botUserId,
            verifiedId = mapper.map(verifiedId),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeNotification(notificationGroupId: Int, notificationId: Int): TdlResult<Ok> {
        val function = TdApi.RemoveNotification(
            notificationGroupId = notificationGroupId,
            notificationId = notificationId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeNotificationGroup(notificationGroupId: Int, maxNotificationId: Int): TdlResult<Ok> {
        val function = TdApi.RemoveNotificationGroup(
            notificationGroupId = notificationGroupId,
            maxNotificationId = maxNotificationId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removePendingPaidMessageReactions(chatId: Long, messageId: Long): TdlResult<Ok> {
        val function = TdApi.RemovePendingPaidMessageReactions(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeProxy(proxyId: Int): TdlResult<Ok> {
        val function = TdApi.RemoveProxy(
            proxyId = proxyId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeRecentHashtag(hashtag: String): TdlResult<Ok> {
        val function = TdApi.RemoveRecentHashtag(
            hashtag = hashtag,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeRecentSticker(isAttached: Boolean, sticker: InputFile): TdlResult<Ok> {
        val function = TdApi.RemoveRecentSticker(
            isAttached = isAttached,
            sticker = mapper.map(sticker),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeRecentlyFoundChat(chatId: Long): TdlResult<Ok> {
        val function = TdApi.RemoveRecentlyFoundChat(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeSavedAnimation(animation: InputFile): TdlResult<Ok> {
        val function = TdApi.RemoveSavedAnimation(
            animation = mapper.map(animation),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeSavedNotificationSound(notificationSoundId: Long): TdlResult<Ok> {
        val function = TdApi.RemoveSavedNotificationSound(
            notificationSoundId = notificationSoundId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeSearchedForTag(tag: String): TdlResult<Ok> {
        val function = TdApi.RemoveSearchedForTag(
            tag = tag,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeStickerFromSet(sticker: InputFile): TdlResult<Ok> {
        val function = TdApi.RemoveStickerFromSet(
            sticker = mapper.map(sticker),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeTopChat(category: TopChatCategory, chatId: Long): TdlResult<Ok> {
        val function = TdApi.RemoveTopChat(
            category = mapper.map(category),
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun reorderActiveUsernames(usernames: Array<String>): TdlResult<Ok> {
        val function = TdApi.ReorderActiveUsernames(
            usernames = usernames,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun reorderBotActiveUsernames(botUserId: Long, usernames: Array<String>): TdlResult<Ok> {
        val function = TdApi.ReorderBotActiveUsernames(
            botUserId = botUserId,
            usernames = usernames,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun reorderBotMediaPreviews(
        botUserId: Long,
        languageCode: String,
        fileIds: IntArray,
    ): TdlResult<Ok> {
        val function = TdApi.ReorderBotMediaPreviews(
            botUserId = botUserId,
            languageCode = languageCode,
            fileIds = fileIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun reorderChatFolders(chatFolderIds: IntArray, mainChatListPosition: Int): TdlResult<Ok> {
        val function = TdApi.ReorderChatFolders(
            chatFolderIds = chatFolderIds,
            mainChatListPosition = mainChatListPosition,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun reorderInstalledStickerSets(stickerType: StickerType, stickerSetIds: LongArray): TdlResult<Ok> {
        val function = TdApi.ReorderInstalledStickerSets(
            stickerType = mapper.map(stickerType),
            stickerSetIds = stickerSetIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun reorderQuickReplyShortcuts(shortcutIds: IntArray): TdlResult<Ok> {
        val function = TdApi.ReorderQuickReplyShortcuts(
            shortcutIds = shortcutIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun reorderSupergroupActiveUsernames(supergroupId: Long, usernames: Array<String>): TdlResult<Ok> {
        val function = TdApi.ReorderSupergroupActiveUsernames(
            supergroupId = supergroupId,
            usernames = usernames,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun replacePrimaryChatInviteLink(chatId: Long): TdlResult<ChatInviteLink> {
        val function = TdApi.ReplacePrimaryChatInviteLink(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun replaceStickerInSet(
        userId: Long,
        name: String,
        oldSticker: InputFile,
        newSticker: InputSticker,
    ): TdlResult<Ok> {
        val function = TdApi.ReplaceStickerInSet(
            userId = userId,
            name = name,
            oldSticker = mapper.map(oldSticker),
            newSticker = mapper.map(newSticker),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun replaceVideoChatRtmpUrl(chatId: Long): TdlResult<RtmpUrl> {
        val function = TdApi.ReplaceVideoChatRtmpUrl(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun reportAuthenticationCodeMissing(mobileNetworkCode: String): TdlResult<Ok> {
        val function = TdApi.ReportAuthenticationCodeMissing(
            mobileNetworkCode = mobileNetworkCode,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun reportChat(
        chatId: Long,
        optionId: ByteArray,
        messageIds: LongArray,
        text: String,
    ): TdlResult<ReportChatResult> {
        val function = TdApi.ReportChat(
            chatId = chatId,
            optionId = optionId,
            messageIds = messageIds,
            text = text,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun reportChatPhoto(
        chatId: Long,
        fileId: Int,
        reason: ReportReason,
        text: String,
    ): TdlResult<Ok> {
        val function = TdApi.ReportChatPhoto(
            chatId = chatId,
            fileId = fileId,
            reason = mapper.map(reason),
            text = text,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun reportChatSponsoredMessage(
        chatId: Long,
        messageId: Long,
        optionId: ByteArray,
    ): TdlResult<ReportSponsoredResult> {
        val function = TdApi.ReportChatSponsoredMessage(
            chatId = chatId,
            messageId = messageId,
            optionId = optionId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun reportMessageReactions(
        chatId: Long,
        messageId: Long,
        senderId: MessageSender,
    ): TdlResult<Ok> {
        val function = TdApi.ReportMessageReactions(
            chatId = chatId,
            messageId = messageId,
            senderId = mapper.map(senderId),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun reportPhoneNumberCodeMissing(mobileNetworkCode: String): TdlResult<Ok> {
        val function = TdApi.ReportPhoneNumberCodeMissing(
            mobileNetworkCode = mobileNetworkCode,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun reportSponsoredChat(sponsoredChatUniqueId: Long, optionId: ByteArray): TdlResult<ReportSponsoredResult> {
        val function = TdApi.ReportSponsoredChat(
            sponsoredChatUniqueId = sponsoredChatUniqueId,
            optionId = optionId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun reportStory(
        storyPosterChatId: Long,
        storyId: Int,
        optionId: ByteArray,
        text: String,
    ): TdlResult<ReportStoryResult> {
        val function = TdApi.ReportStory(
            storyPosterChatId = storyPosterChatId,
            storyId = storyId,
            optionId = optionId,
            text = text,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun reportSupergroupAntiSpamFalsePositive(supergroupId: Long, messageId: Long): TdlResult<Ok> {
        val function = TdApi.ReportSupergroupAntiSpamFalsePositive(
            supergroupId = supergroupId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun reportSupergroupSpam(supergroupId: Long, messageIds: LongArray): TdlResult<Ok> {
        val function = TdApi.ReportSupergroupSpam(
            supergroupId = supergroupId,
            messageIds = messageIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun requestAuthenticationPasswordRecovery(): TdlResult<Ok> {
        val function = TdApi.RequestAuthenticationPasswordRecovery()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun requestPasswordRecovery(): TdlResult<EmailAddressAuthenticationCodeInfo> {
        val function = TdApi.RequestPasswordRecovery()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun requestQrCodeAuthentication(otherUserIds: LongArray): TdlResult<Ok> {
        val function = TdApi.RequestQrCodeAuthentication(
            otherUserIds = otherUserIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun resendAuthenticationCode(reason: ResendCodeReason?): TdlResult<Ok> {
        val function = TdApi.ResendAuthenticationCode(
            reason = reason?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun resendEmailAddressVerificationCode(): TdlResult<EmailAddressAuthenticationCodeInfo> {
        val function = TdApi.ResendEmailAddressVerificationCode()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun resendLoginEmailAddressCode(): TdlResult<EmailAddressAuthenticationCodeInfo> {
        val function = TdApi.ResendLoginEmailAddressCode()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun resendMessages(
        chatId: Long,
        messageIds: LongArray,
        quote: InputTextQuote?,
        paidMessageStarCount: Long,
    ): TdlResult<Messages> {
        val function = TdApi.ResendMessages(
            chatId = chatId,
            messageIds = messageIds,
            quote = quote?.let { mapper.map(it) },
            paidMessageStarCount = paidMessageStarCount,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun resendPhoneNumberCode(reason: ResendCodeReason?): TdlResult<AuthenticationCodeInfo> {
        val function = TdApi.ResendPhoneNumberCode(
            reason = reason?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun resendRecoveryEmailAddressCode(): TdlResult<PasswordState> {
        val function = TdApi.ResendRecoveryEmailAddressCode()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun resetAllNotificationSettings(): TdlResult<Ok> {
        val function = TdApi.ResetAllNotificationSettings()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun resetAuthenticationEmailAddress(): TdlResult<Ok> {
        val function = TdApi.ResetAuthenticationEmailAddress()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun resetInstalledBackgrounds(): TdlResult<Ok> {
        val function = TdApi.ResetInstalledBackgrounds()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun resetNetworkStatistics(): TdlResult<Ok> {
        val function = TdApi.ResetNetworkStatistics()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun resetPassword(): TdlResult<ResetPasswordResult> {
        val function = TdApi.ResetPassword()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun reuseStarSubscription(subscriptionId: String): TdlResult<Ok> {
        val function = TdApi.ReuseStarSubscription(
            subscriptionId = subscriptionId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun revokeChatInviteLink(chatId: Long, inviteLink: String): TdlResult<ChatInviteLinks> {
        val function = TdApi.RevokeChatInviteLink(
            chatId = chatId,
            inviteLink = inviteLink,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun revokeGroupCallInviteLink(groupCallId: Int): TdlResult<Ok> {
        val function = TdApi.RevokeGroupCallInviteLink(
            groupCallId = groupCallId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun saveApplicationLogEvent(
        type: String,
        chatId: Long,
        data: JsonValue,
    ): TdlResult<Ok> {
        val function = TdApi.SaveApplicationLogEvent(
            type = type,
            chatId = chatId,
            data = mapper.map(data),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun savePreparedInlineMessage(
        userId: Long,
        result: InputInlineQueryResult,
        chatTypes: TargetChatTypes,
    ): TdlResult<PreparedInlineMessageId> {
        val function = TdApi.SavePreparedInlineMessage(
            userId = userId,
            result = mapper.map(result),
            chatTypes = mapper.map(chatTypes),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchAffiliatePrograms(
        affiliate: AffiliateType,
        sortOrder: AffiliateProgramSortOrder,
        offset: String,
        limit: Int,
    ): TdlResult<FoundAffiliatePrograms> {
        val function = TdApi.SearchAffiliatePrograms(
            affiliate = mapper.map(affiliate),
            sortOrder = mapper.map(sortOrder),
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchBackground(name: String): TdlResult<Background> {
        val function = TdApi.SearchBackground(
            name = name,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchCallMessages(
        offset: String,
        limit: Int,
        onlyMissed: Boolean,
    ): TdlResult<FoundMessages> {
        val function = TdApi.SearchCallMessages(
            offset = offset,
            limit = limit,
            onlyMissed = onlyMissed,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchChatAffiliateProgram(username: String, referrer: String): TdlResult<Chat> {
        val function = TdApi.SearchChatAffiliateProgram(
            username = username,
            referrer = referrer,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchChatMembers(
        chatId: Long,
        query: String,
        limit: Int,
        filter: ChatMembersFilter?,
    ): TdlResult<ChatMembers> {
        val function = TdApi.SearchChatMembers(
            chatId = chatId,
            query = query,
            limit = limit,
            filter = filter?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchChatMessages(
        chatId: Long,
        topicId: MessageTopic?,
        query: String,
        senderId: MessageSender?,
        fromMessageId: Long,
        offset: Int,
        limit: Int,
        filter: SearchMessagesFilter?,
    ): TdlResult<FoundChatMessages> {
        val function = TdApi.SearchChatMessages(
            chatId = chatId,
            topicId = topicId?.let { mapper.map(it) },
            query = query,
            senderId = senderId?.let { mapper.map(it) },
            fromMessageId = fromMessageId,
            offset = offset,
            limit = limit,
            filter = filter?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchChatRecentLocationMessages(chatId: Long, limit: Int): TdlResult<Messages> {
        val function = TdApi.SearchChatRecentLocationMessages(
            chatId = chatId,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchChats(query: String, limit: Int): TdlResult<Chats> {
        val function = TdApi.SearchChats(
            query = query,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchChatsOnServer(query: String, limit: Int): TdlResult<Chats> {
        val function = TdApi.SearchChatsOnServer(
            query = query,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchContacts(query: String, limit: Int): TdlResult<Users> {
        val function = TdApi.SearchContacts(
            query = query,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchEmojis(text: String, inputLanguageCodes: Array<String>): TdlResult<EmojiKeywords> {
        val function = TdApi.SearchEmojis(
            text = text,
            inputLanguageCodes = inputLanguageCodes,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchFileDownloads(
        query: String,
        onlyActive: Boolean,
        onlyCompleted: Boolean,
        offset: String,
        limit: Int,
    ): TdlResult<FoundFileDownloads> {
        val function = TdApi.SearchFileDownloads(
            query = query,
            onlyActive = onlyActive,
            onlyCompleted = onlyCompleted,
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchGiftsForResale(
        giftId: Long,
        order: GiftForResaleOrder,
        attributes: Array<UpgradedGiftAttributeId>,
        offset: String,
        limit: Int,
    ): TdlResult<GiftsForResale> {
        val function = TdApi.SearchGiftsForResale(
            giftId = giftId,
            order = mapper.map(order),
            attributes = attributes.mapArray { mapper.map(it) },
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchHashtags(prefix: String, limit: Int): TdlResult<Hashtags> {
        val function = TdApi.SearchHashtags(
            prefix = prefix,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchInstalledStickerSets(
        stickerType: StickerType,
        query: String,
        limit: Int,
    ): TdlResult<StickerSets> {
        val function = TdApi.SearchInstalledStickerSets(
            stickerType = mapper.map(stickerType),
            query = query,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchMessages(
        chatList: ChatList?,
        query: String,
        offset: String,
        limit: Int,
        filter: SearchMessagesFilter?,
        chatTypeFilter: SearchMessagesChatTypeFilter?,
        minDate: Int,
        maxDate: Int,
    ): TdlResult<FoundMessages> {
        val function = TdApi.SearchMessages(
            chatList = chatList?.let { mapper.map(it) },
            query = query,
            offset = offset,
            limit = limit,
            filter = filter?.let { mapper.map(it) },
            chatTypeFilter = chatTypeFilter?.let { mapper.map(it) },
            minDate = minDate,
            maxDate = maxDate,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchOutgoingDocumentMessages(query: String, limit: Int): TdlResult<FoundMessages> {
        val function = TdApi.SearchOutgoingDocumentMessages(
            query = query,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchPublicChat(username: String): TdlResult<Chat> {
        val function = TdApi.SearchPublicChat(
            username = username,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchPublicChats(query: String): TdlResult<Chats> {
        val function = TdApi.SearchPublicChats(
            query = query,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchPublicMessagesByTag(
        tag: String,
        offset: String,
        limit: Int,
    ): TdlResult<FoundMessages> {
        val function = TdApi.SearchPublicMessagesByTag(
            tag = tag,
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchPublicStoriesByLocation(
        address: LocationAddress,
        offset: String,
        limit: Int,
    ): TdlResult<FoundStories> {
        val function = TdApi.SearchPublicStoriesByLocation(
            address = mapper.map(address),
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchPublicStoriesByTag(
        storyPosterChatId: Long,
        tag: String,
        offset: String,
        limit: Int,
    ): TdlResult<FoundStories> {
        val function = TdApi.SearchPublicStoriesByTag(
            storyPosterChatId = storyPosterChatId,
            tag = tag,
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchPublicStoriesByVenue(
        venueProvider: String,
        venueId: String,
        offset: String,
        limit: Int,
    ): TdlResult<FoundStories> {
        val function = TdApi.SearchPublicStoriesByVenue(
            venueProvider = venueProvider,
            venueId = venueId,
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchQuote(
        text: FormattedText,
        quote: FormattedText,
        quotePosition: Int,
    ): TdlResult<FoundPosition> {
        val function = TdApi.SearchQuote(
            text = mapper.map(text),
            quote = mapper.map(quote),
            quotePosition = quotePosition,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchRecentlyFoundChats(query: String, limit: Int): TdlResult<Chats> {
        val function = TdApi.SearchRecentlyFoundChats(
            query = query,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchSavedMessages(
        savedMessagesTopicId: Long,
        tag: ReactionType?,
        query: String,
        fromMessageId: Long,
        offset: Int,
        limit: Int,
    ): TdlResult<FoundChatMessages> {
        val function = TdApi.SearchSavedMessages(
            savedMessagesTopicId = savedMessagesTopicId,
            tag = tag?.let { mapper.map(it) },
            query = query,
            fromMessageId = fromMessageId,
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchSecretMessages(
        chatId: Long,
        query: String,
        offset: String,
        limit: Int,
        filter: SearchMessagesFilter?,
    ): TdlResult<FoundMessages> {
        val function = TdApi.SearchSecretMessages(
            chatId = chatId,
            query = query,
            offset = offset,
            limit = limit,
            filter = filter?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchStickerSet(name: String, ignoreCache: Boolean): TdlResult<StickerSet> {
        val function = TdApi.SearchStickerSet(
            name = name,
            ignoreCache = ignoreCache,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchStickerSets(stickerType: StickerType, query: String): TdlResult<StickerSets> {
        val function = TdApi.SearchStickerSets(
            stickerType = mapper.map(stickerType),
            query = query,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchStickers(
        stickerType: StickerType,
        emojis: String,
        query: String,
        inputLanguageCodes: Array<String>,
        offset: Int,
        limit: Int,
    ): TdlResult<Stickers> {
        val function = TdApi.SearchStickers(
            stickerType = mapper.map(stickerType),
            emojis = emojis,
            query = query,
            inputLanguageCodes = inputLanguageCodes,
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchStringsByPrefix(
        strings: Array<String>,
        query: String,
        limit: Int,
        returnNoneForEmptyQuery: Boolean,
    ): TdlResult<FoundPositions> {
        val function = TdApi.SearchStringsByPrefix(
            strings = strings,
            query = query,
            limit = limit,
            returnNoneForEmptyQuery = returnNoneForEmptyQuery,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchUserByPhoneNumber(phoneNumber: String, onlyLocal: Boolean): TdlResult<User> {
        val function = TdApi.SearchUserByPhoneNumber(
            phoneNumber = phoneNumber,
            onlyLocal = onlyLocal,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchUserByToken(token: String): TdlResult<User> {
        val function = TdApi.SearchUserByToken(
            token = token,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchWebApp(botUserId: Long, webAppShortName: String): TdlResult<FoundWebApp> {
        val function = TdApi.SearchWebApp(
            botUserId = botUserId,
            webAppShortName = webAppShortName,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sellGift(businessConnectionId: String, receivedGiftId: String): TdlResult<Ok> {
        val function = TdApi.SellGift(
            businessConnectionId = businessConnectionId,
            receivedGiftId = receivedGiftId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendAuthenticationFirebaseSms(token: String): TdlResult<Ok> {
        val function = TdApi.SendAuthenticationFirebaseSms(
            token = token,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendBotStartMessage(
        botUserId: Long,
        chatId: Long,
        parameter: String,
    ): TdlResult<Message> {
        val function = TdApi.SendBotStartMessage(
            botUserId = botUserId,
            chatId = chatId,
            parameter = parameter,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendBusinessMessage(
        businessConnectionId: String,
        chatId: Long,
        replyTo: InputMessageReplyTo?,
        disableNotification: Boolean,
        protectContent: Boolean,
        effectId: Long,
        replyMarkup: ReplyMarkup?,
        inputMessageContent: InputMessageContent,
    ): TdlResult<BusinessMessage> {
        val function = TdApi.SendBusinessMessage(
            businessConnectionId = businessConnectionId,
            chatId = chatId,
            replyTo = replyTo?.let { mapper.map(it) },
            disableNotification = disableNotification,
            protectContent = protectContent,
            effectId = effectId,
            replyMarkup = replyMarkup?.let { mapper.map(it) },
            inputMessageContent = mapper.map(inputMessageContent),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendBusinessMessageAlbum(
        businessConnectionId: String,
        chatId: Long,
        replyTo: InputMessageReplyTo?,
        disableNotification: Boolean,
        protectContent: Boolean,
        effectId: Long,
        inputMessageContents: Array<InputMessageContent>,
    ): TdlResult<BusinessMessages> {
        val function = TdApi.SendBusinessMessageAlbum(
            businessConnectionId = businessConnectionId,
            chatId = chatId,
            replyTo = replyTo?.let { mapper.map(it) },
            disableNotification = disableNotification,
            protectContent = protectContent,
            effectId = effectId,
            inputMessageContents = inputMessageContents.mapArray { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendCallDebugInformation(callId: Int, debugInformation: String): TdlResult<Ok> {
        val function = TdApi.SendCallDebugInformation(
            callId = callId,
            debugInformation = debugInformation,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendCallLog(callId: Int, logFile: InputFile): TdlResult<Ok> {
        val function = TdApi.SendCallLog(
            callId = callId,
            logFile = mapper.map(logFile),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendCallRating(
        callId: Int,
        rating: Int,
        comment: String,
        problems: Array<CallProblem>,
    ): TdlResult<Ok> {
        val function = TdApi.SendCallRating(
            callId = callId,
            rating = rating,
            comment = comment,
            problems = problems.mapArray { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendCallSignalingData(callId: Int, data: ByteArray): TdlResult<Ok> {
        val function = TdApi.SendCallSignalingData(
            callId = callId,
            data = data,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendChatAction(
        chatId: Long,
        messageThreadId: Long,
        businessConnectionId: String,
        action: ChatAction?,
    ): TdlResult<Ok> {
        val function = TdApi.SendChatAction(
            chatId = chatId,
            messageThreadId = messageThreadId,
            businessConnectionId = businessConnectionId,
            action = action?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendCustomRequest(method: String, parameters: String): TdlResult<CustomRequestResult> {
        val function = TdApi.SendCustomRequest(
            method = method,
            parameters = parameters,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendEmailAddressVerificationCode(emailAddress: String): TdlResult<EmailAddressAuthenticationCodeInfo> {
        val function = TdApi.SendEmailAddressVerificationCode(
            emailAddress = emailAddress,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendGift(
        giftId: Long,
        ownerId: MessageSender,
        text: FormattedText,
        isPrivate: Boolean,
        payForUpgrade: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.SendGift(
            giftId = giftId,
            ownerId = mapper.map(ownerId),
            text = mapper.map(text),
            isPrivate = isPrivate,
            payForUpgrade = payForUpgrade,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendInlineQueryResultMessage(
        chatId: Long,
        messageThreadId: Long,
        replyTo: InputMessageReplyTo?,
        options: MessageSendOptions?,
        queryId: Long,
        resultId: String,
        hideViaBot: Boolean,
    ): TdlResult<Message> {
        val function = TdApi.SendInlineQueryResultMessage(
            chatId = chatId,
            messageThreadId = messageThreadId,
            replyTo = replyTo?.let { mapper.map(it) },
            options = options?.let { mapper.map(it) },
            queryId = queryId,
            resultId = resultId,
            hideViaBot = hideViaBot,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendMessage(
        chatId: Long,
        messageThreadId: Long,
        replyTo: InputMessageReplyTo?,
        options: MessageSendOptions?,
        replyMarkup: ReplyMarkup?,
        inputMessageContent: InputMessageContent,
    ): TdlResult<Message> {
        val function = TdApi.SendMessage(
            chatId = chatId,
            messageThreadId = messageThreadId,
            replyTo = replyTo?.let { mapper.map(it) },
            options = options?.let { mapper.map(it) },
            replyMarkup = replyMarkup?.let { mapper.map(it) },
            inputMessageContent = mapper.map(inputMessageContent),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendMessageAlbum(
        chatId: Long,
        messageThreadId: Long,
        replyTo: InputMessageReplyTo?,
        options: MessageSendOptions?,
        inputMessageContents: Array<InputMessageContent>,
    ): TdlResult<Messages> {
        val function = TdApi.SendMessageAlbum(
            chatId = chatId,
            messageThreadId = messageThreadId,
            replyTo = replyTo?.let { mapper.map(it) },
            options = options?.let { mapper.map(it) },
            inputMessageContents = inputMessageContents.mapArray { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendPassportAuthorizationForm(authorizationFormId: Int, types: Array<PassportElementType>): TdlResult<Ok> {
        val function = TdApi.SendPassportAuthorizationForm(
            authorizationFormId = authorizationFormId,
            types = types.mapArray { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendPaymentForm(
        inputInvoice: InputInvoice,
        paymentFormId: Long,
        orderInfoId: String,
        shippingOptionId: String,
        credentials: InputCredentials?,
        tipAmount: Long,
    ): TdlResult<PaymentResult> {
        val function = TdApi.SendPaymentForm(
            inputInvoice = mapper.map(inputInvoice),
            paymentFormId = paymentFormId,
            orderInfoId = orderInfoId,
            shippingOptionId = shippingOptionId,
            credentials = credentials?.let { mapper.map(it) },
            tipAmount = tipAmount,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendPhoneNumberCode(
        phoneNumber: String,
        settings: PhoneNumberAuthenticationSettings?,
        type: PhoneNumberCodeType,
    ): TdlResult<AuthenticationCodeInfo> {
        val function = TdApi.SendPhoneNumberCode(
            phoneNumber = phoneNumber,
            settings = settings?.let { mapper.map(it) },
            type = mapper.map(type),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendPhoneNumberFirebaseSms(token: String): TdlResult<Ok> {
        val function = TdApi.SendPhoneNumberFirebaseSms(
            token = token,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendQuickReplyShortcutMessages(
        chatId: Long,
        shortcutId: Int,
        sendingId: Int,
    ): TdlResult<Messages> {
        val function = TdApi.SendQuickReplyShortcutMessages(
            chatId = chatId,
            shortcutId = shortcutId,
            sendingId = sendingId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendResoldGift(
        giftName: String,
        ownerId: MessageSender,
        starCount: Long,
    ): TdlResult<Ok> {
        val function = TdApi.SendResoldGift(
            giftName = giftName,
            ownerId = mapper.map(ownerId),
            starCount = starCount,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendWebAppCustomRequest(
        botUserId: Long,
        method: String,
        parameters: String,
    ): TdlResult<CustomRequestResult> {
        val function = TdApi.SendWebAppCustomRequest(
            botUserId = botUserId,
            method = method,
            parameters = parameters,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendWebAppData(
        botUserId: Long,
        buttonText: String,
        data: String,
    ): TdlResult<Ok> {
        val function = TdApi.SendWebAppData(
            botUserId = botUserId,
            buttonText = buttonText,
            data = data,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setAccentColor(accentColorId: Int, backgroundCustomEmojiId: Long): TdlResult<Ok> {
        val function = TdApi.SetAccentColor(
            accentColorId = accentColorId,
            backgroundCustomEmojiId = backgroundCustomEmojiId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setAccountTtl(ttl: AccountTtl): TdlResult<Ok> {
        val function = TdApi.SetAccountTtl(
            ttl = mapper.map(ttl),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setAlarm(seconds: Double): TdlResult<Ok> {
        val function = TdApi.SetAlarm(
            seconds = seconds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setApplicationVerificationToken(verificationId: Long, token: String): TdlResult<Ok> {
        val function = TdApi.SetApplicationVerificationToken(
            verificationId = verificationId,
            token = token,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setArchiveChatListSettings(settings: ArchiveChatListSettings): TdlResult<Ok> {
        val function = TdApi.SetArchiveChatListSettings(
            settings = mapper.map(settings),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setAuthenticationEmailAddress(emailAddress: String): TdlResult<Ok> {
        val function = TdApi.SetAuthenticationEmailAddress(
            emailAddress = emailAddress,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setAuthenticationPhoneNumber(phoneNumber: String, settings: PhoneNumberAuthenticationSettings?): TdlResult<Ok> {
        val function = TdApi.SetAuthenticationPhoneNumber(
            phoneNumber = phoneNumber,
            settings = settings?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setAuthenticationPremiumPurchaseTransaction(
        transaction: StoreTransaction,
        isRestore: Boolean,
        currency: String,
        amount: Long,
    ): TdlResult<Ok> {
        val function = TdApi.SetAuthenticationPremiumPurchaseTransaction(
            transaction = mapper.map(transaction),
            isRestore = isRestore,
            currency = currency,
            amount = amount,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setAutoDownloadSettings(settings: AutoDownloadSettings, type: NetworkType): TdlResult<Ok> {
        val function = TdApi.SetAutoDownloadSettings(
            settings = mapper.map(settings),
            type = mapper.map(type),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setAutosaveSettings(scope: AutosaveSettingsScope, settings: ScopeAutosaveSettings?): TdlResult<Ok> {
        val function = TdApi.SetAutosaveSettings(
            scope = mapper.map(scope),
            settings = settings?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBio(bio: String): TdlResult<Ok> {
        val function = TdApi.SetBio(
            bio = bio,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBirthdate(birthdate: Birthdate?): TdlResult<Ok> {
        val function = TdApi.SetBirthdate(
            birthdate = birthdate?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBotInfoDescription(
        botUserId: Long,
        languageCode: String,
        description: String,
    ): TdlResult<Ok> {
        val function = TdApi.SetBotInfoDescription(
            botUserId = botUserId,
            languageCode = languageCode,
            description = description,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBotInfoShortDescription(
        botUserId: Long,
        languageCode: String,
        shortDescription: String,
    ): TdlResult<Ok> {
        val function = TdApi.SetBotInfoShortDescription(
            botUserId = botUserId,
            languageCode = languageCode,
            shortDescription = shortDescription,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBotName(
        botUserId: Long,
        languageCode: String,
        name: String,
    ): TdlResult<Ok> {
        val function = TdApi.SetBotName(
            botUserId = botUserId,
            languageCode = languageCode,
            name = name,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBotProfilePhoto(botUserId: Long, photo: InputChatPhoto?): TdlResult<Ok> {
        val function = TdApi.SetBotProfilePhoto(
            botUserId = botUserId,
            photo = photo?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBotUpdatesStatus(pendingUpdateCount: Int, errorMessage: String): TdlResult<Ok> {
        val function = TdApi.SetBotUpdatesStatus(
            pendingUpdateCount = pendingUpdateCount,
            errorMessage = errorMessage,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBusinessAccountBio(businessConnectionId: String, bio: String): TdlResult<Ok> {
        val function = TdApi.SetBusinessAccountBio(
            businessConnectionId = businessConnectionId,
            bio = bio,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBusinessAccountGiftSettings(businessConnectionId: String, settings: GiftSettings): TdlResult<Ok> {
        val function = TdApi.SetBusinessAccountGiftSettings(
            businessConnectionId = businessConnectionId,
            settings = mapper.map(settings),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBusinessAccountName(
        businessConnectionId: String,
        firstName: String,
        lastName: String,
    ): TdlResult<Ok> {
        val function = TdApi.SetBusinessAccountName(
            businessConnectionId = businessConnectionId,
            firstName = firstName,
            lastName = lastName,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBusinessAccountProfilePhoto(
        businessConnectionId: String,
        photo: InputChatPhoto?,
        isPublic: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.SetBusinessAccountProfilePhoto(
            businessConnectionId = businessConnectionId,
            photo = photo?.let { mapper.map(it) },
            isPublic = isPublic,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBusinessAccountUsername(businessConnectionId: String, username: String): TdlResult<Ok> {
        val function = TdApi.SetBusinessAccountUsername(
            businessConnectionId = businessConnectionId,
            username = username,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBusinessAwayMessageSettings(awayMessageSettings: BusinessAwayMessageSettings?): TdlResult<Ok> {
        val function = TdApi.SetBusinessAwayMessageSettings(
            awayMessageSettings = awayMessageSettings?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBusinessConnectedBot(bot: BusinessConnectedBot): TdlResult<Ok> {
        val function = TdApi.SetBusinessConnectedBot(
            bot = mapper.map(bot),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBusinessGreetingMessageSettings(greetingMessageSettings: BusinessGreetingMessageSettings?): TdlResult<Ok> {
        val function = TdApi.SetBusinessGreetingMessageSettings(
            greetingMessageSettings = greetingMessageSettings?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBusinessLocation(location: BusinessLocation?): TdlResult<Ok> {
        val function = TdApi.SetBusinessLocation(
            location = location?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBusinessMessageIsPinned(
        businessConnectionId: String,
        chatId: Long,
        messageId: Long,
        isPinned: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.SetBusinessMessageIsPinned(
            businessConnectionId = businessConnectionId,
            chatId = chatId,
            messageId = messageId,
            isPinned = isPinned,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBusinessOpeningHours(openingHours: BusinessOpeningHours?): TdlResult<Ok> {
        val function = TdApi.SetBusinessOpeningHours(
            openingHours = openingHours?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBusinessStartPage(startPage: InputBusinessStartPage?): TdlResult<Ok> {
        val function = TdApi.SetBusinessStartPage(
            startPage = startPage?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatAccentColor(
        chatId: Long,
        accentColorId: Int,
        backgroundCustomEmojiId: Long,
    ): TdlResult<Ok> {
        val function = TdApi.SetChatAccentColor(
            chatId = chatId,
            accentColorId = accentColorId,
            backgroundCustomEmojiId = backgroundCustomEmojiId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatActiveStoriesList(chatId: Long, storyList: StoryList): TdlResult<Ok> {
        val function = TdApi.SetChatActiveStoriesList(
            chatId = chatId,
            storyList = mapper.map(storyList),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatAffiliateProgram(chatId: Long, parameters: AffiliateProgramParameters?): TdlResult<Ok> {
        val function = TdApi.SetChatAffiliateProgram(
            chatId = chatId,
            parameters = parameters?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatAvailableReactions(chatId: Long, availableReactions: ChatAvailableReactions): TdlResult<Ok> {
        val function = TdApi.SetChatAvailableReactions(
            chatId = chatId,
            availableReactions = mapper.map(availableReactions),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatBackground(
        chatId: Long,
        background: InputBackground?,
        type: BackgroundType?,
        darkThemeDimming: Int,
        onlyForSelf: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.SetChatBackground(
            chatId = chatId,
            background = background?.let { mapper.map(it) },
            type = type?.let { mapper.map(it) },
            darkThemeDimming = darkThemeDimming,
            onlyForSelf = onlyForSelf,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatClientData(chatId: Long, clientData: String): TdlResult<Ok> {
        val function = TdApi.SetChatClientData(
            chatId = chatId,
            clientData = clientData,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatDescription(chatId: Long, description: String): TdlResult<Ok> {
        val function = TdApi.SetChatDescription(
            chatId = chatId,
            description = description,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatDirectMessagesGroup(
        chatId: Long,
        isEnabled: Boolean,
        paidMessageStarCount: Long,
    ): TdlResult<Ok> {
        val function = TdApi.SetChatDirectMessagesGroup(
            chatId = chatId,
            isEnabled = isEnabled,
            paidMessageStarCount = paidMessageStarCount,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatDiscussionGroup(chatId: Long, discussionChatId: Long): TdlResult<Ok> {
        val function = TdApi.SetChatDiscussionGroup(
            chatId = chatId,
            discussionChatId = discussionChatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatDraftMessage(
        chatId: Long,
        messageThreadId: Long,
        draftMessage: DraftMessage?,
    ): TdlResult<Ok> {
        val function = TdApi.SetChatDraftMessage(
            chatId = chatId,
            messageThreadId = messageThreadId,
            draftMessage = draftMessage?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatEmojiStatus(chatId: Long, emojiStatus: EmojiStatus?): TdlResult<Ok> {
        val function = TdApi.SetChatEmojiStatus(
            chatId = chatId,
            emojiStatus = emojiStatus?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatLocation(chatId: Long, location: ChatLocation): TdlResult<Ok> {
        val function = TdApi.SetChatLocation(
            chatId = chatId,
            location = mapper.map(location),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatMemberStatus(
        chatId: Long,
        memberId: MessageSender,
        status: ChatMemberStatus,
    ): TdlResult<Ok> {
        val function = TdApi.SetChatMemberStatus(
            chatId = chatId,
            memberId = mapper.map(memberId),
            status = mapper.map(status),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatMessageAutoDeleteTime(chatId: Long, messageAutoDeleteTime: Int): TdlResult<Ok> {
        val function = TdApi.SetChatMessageAutoDeleteTime(
            chatId = chatId,
            messageAutoDeleteTime = messageAutoDeleteTime,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatMessageSender(chatId: Long, messageSenderId: MessageSender): TdlResult<Ok> {
        val function = TdApi.SetChatMessageSender(
            chatId = chatId,
            messageSenderId = mapper.map(messageSenderId),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatNotificationSettings(chatId: Long, notificationSettings: ChatNotificationSettings): TdlResult<Ok> {
        val function = TdApi.SetChatNotificationSettings(
            chatId = chatId,
            notificationSettings = mapper.map(notificationSettings),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatPaidMessageStarCount(chatId: Long, paidMessageStarCount: Long): TdlResult<Ok> {
        val function = TdApi.SetChatPaidMessageStarCount(
            chatId = chatId,
            paidMessageStarCount = paidMessageStarCount,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatPermissions(chatId: Long, permissions: ChatPermissions): TdlResult<Ok> {
        val function = TdApi.SetChatPermissions(
            chatId = chatId,
            permissions = mapper.map(permissions),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatPhoto(chatId: Long, photo: InputChatPhoto?): TdlResult<Ok> {
        val function = TdApi.SetChatPhoto(
            chatId = chatId,
            photo = photo?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatPinnedStories(chatId: Long, storyIds: IntArray): TdlResult<Ok> {
        val function = TdApi.SetChatPinnedStories(
            chatId = chatId,
            storyIds = storyIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatProfileAccentColor(
        chatId: Long,
        profileAccentColorId: Int,
        profileBackgroundCustomEmojiId: Long,
    ): TdlResult<Ok> {
        val function = TdApi.SetChatProfileAccentColor(
            chatId = chatId,
            profileAccentColorId = profileAccentColorId,
            profileBackgroundCustomEmojiId = profileBackgroundCustomEmojiId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatSlowModeDelay(chatId: Long, slowModeDelay: Int): TdlResult<Ok> {
        val function = TdApi.SetChatSlowModeDelay(
            chatId = chatId,
            slowModeDelay = slowModeDelay,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatTheme(chatId: Long, themeName: String): TdlResult<Ok> {
        val function = TdApi.SetChatTheme(
            chatId = chatId,
            themeName = themeName,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatTitle(chatId: Long, title: String): TdlResult<Ok> {
        val function = TdApi.SetChatTitle(
            chatId = chatId,
            title = title,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setCloseFriends(userIds: LongArray): TdlResult<Ok> {
        val function = TdApi.SetCloseFriends(
            userIds = userIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setCommands(
        scope: BotCommandScope?,
        languageCode: String,
        commands: Array<BotCommand>,
    ): TdlResult<Ok> {
        val function = TdApi.SetCommands(
            scope = scope?.let { mapper.map(it) },
            languageCode = languageCode,
            commands = commands.mapArray { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setCustomEmojiStickerSetThumbnail(name: String, customEmojiId: Long): TdlResult<Ok> {
        val function = TdApi.SetCustomEmojiStickerSetThumbnail(
            name = name,
            customEmojiId = customEmojiId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setCustomLanguagePack(info: LanguagePackInfo, strings: Array<LanguagePackString>): TdlResult<Ok> {
        val function = TdApi.SetCustomLanguagePack(
            info = mapper.map(info),
            strings = strings.mapArray { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setCustomLanguagePackString(languagePackId: String, newString: LanguagePackString): TdlResult<Ok> {
        val function = TdApi.SetCustomLanguagePackString(
            languagePackId = languagePackId,
            newString = mapper.map(newString),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setDatabaseEncryptionKey(newEncryptionKey: ByteArray): TdlResult<Ok> {
        val function = TdApi.SetDatabaseEncryptionKey(
            newEncryptionKey = newEncryptionKey,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setDefaultBackground(
        background: InputBackground?,
        type: BackgroundType?,
        forDarkTheme: Boolean,
    ): TdlResult<Background> {
        val function = TdApi.SetDefaultBackground(
            background = background?.let { mapper.map(it) },
            type = type?.let { mapper.map(it) },
            forDarkTheme = forDarkTheme,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setDefaultChannelAdministratorRights(defaultChannelAdministratorRights: ChatAdministratorRights?): TdlResult<Ok> {
        val function = TdApi.SetDefaultChannelAdministratorRights(
            defaultChannelAdministratorRights = defaultChannelAdministratorRights?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setDefaultGroupAdministratorRights(defaultGroupAdministratorRights: ChatAdministratorRights?): TdlResult<Ok> {
        val function = TdApi.SetDefaultGroupAdministratorRights(
            defaultGroupAdministratorRights = defaultGroupAdministratorRights?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setDefaultMessageAutoDeleteTime(messageAutoDeleteTime: MessageAutoDeleteTime): TdlResult<Ok> {
        val function = TdApi.SetDefaultMessageAutoDeleteTime(
            messageAutoDeleteTime = mapper.map(messageAutoDeleteTime),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setDefaultReactionType(reactionType: ReactionType): TdlResult<Ok> {
        val function = TdApi.SetDefaultReactionType(
            reactionType = mapper.map(reactionType),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setDirectMessagesChatTopicDraftMessage(
        chatId: Long,
        topicId: Long,
        draftMessage: DraftMessage?,
    ): TdlResult<Ok> {
        val function = TdApi.SetDirectMessagesChatTopicDraftMessage(
            chatId = chatId,
            topicId = topicId,
            draftMessage = draftMessage?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setDirectMessagesChatTopicIsMarkedAsUnread(
        chatId: Long,
        topicId: Long,
        isMarkedAsUnread: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.SetDirectMessagesChatTopicIsMarkedAsUnread(
            chatId = chatId,
            topicId = topicId,
            isMarkedAsUnread = isMarkedAsUnread,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setEmojiStatus(emojiStatus: EmojiStatus?): TdlResult<Ok> {
        val function = TdApi.SetEmojiStatus(
            emojiStatus = emojiStatus?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setFileGenerationProgress(
        generationId: Long,
        expectedSize: Long,
        localPrefixSize: Long,
    ): TdlResult<Ok> {
        val function = TdApi.SetFileGenerationProgress(
            generationId = generationId,
            expectedSize = expectedSize,
            localPrefixSize = localPrefixSize,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setForumTopicNotificationSettings(
        chatId: Long,
        messageThreadId: Long,
        notificationSettings: ChatNotificationSettings,
    ): TdlResult<Ok> {
        val function = TdApi.SetForumTopicNotificationSettings(
            chatId = chatId,
            messageThreadId = messageThreadId,
            notificationSettings = mapper.map(notificationSettings),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setGameScore(
        chatId: Long,
        messageId: Long,
        editMessage: Boolean,
        userId: Long,
        score: Int,
        force: Boolean,
    ): TdlResult<Message> {
        val function = TdApi.SetGameScore(
            chatId = chatId,
            messageId = messageId,
            editMessage = editMessage,
            userId = userId,
            score = score,
            force = force,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setGiftResalePrice(receivedGiftId: String, resaleStarCount: Long): TdlResult<Ok> {
        val function = TdApi.SetGiftResalePrice(
            receivedGiftId = receivedGiftId,
            resaleStarCount = resaleStarCount,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setGiftSettings(settings: GiftSettings): TdlResult<Ok> {
        val function = TdApi.SetGiftSettings(
            settings = mapper.map(settings),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setGroupCallParticipantIsSpeaking(
        groupCallId: Int,
        audioSource: Int,
        isSpeaking: Boolean,
    ): TdlResult<MessageSender> {
        val function = TdApi.SetGroupCallParticipantIsSpeaking(
            groupCallId = groupCallId,
            audioSource = audioSource,
            isSpeaking = isSpeaking,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setGroupCallParticipantVolumeLevel(
        groupCallId: Int,
        participantId: MessageSender,
        volumeLevel: Int,
    ): TdlResult<Ok> {
        val function = TdApi.SetGroupCallParticipantVolumeLevel(
            groupCallId = groupCallId,
            participantId = mapper.map(participantId),
            volumeLevel = volumeLevel,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setInactiveSessionTtl(inactiveSessionTtlDays: Int): TdlResult<Ok> {
        val function = TdApi.SetInactiveSessionTtl(
            inactiveSessionTtlDays = inactiveSessionTtlDays,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setInlineGameScore(
        inlineMessageId: String,
        editMessage: Boolean,
        userId: Long,
        score: Int,
        force: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.SetInlineGameScore(
            inlineMessageId = inlineMessageId,
            editMessage = editMessage,
            userId = userId,
            score = score,
            force = force,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setLogStream(logStream: LogStream): TdlResult<Ok> {
        val function = TdApi.SetLogStream(
            logStream = mapper.map(logStream),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setLogTagVerbosityLevel(tag: String, newVerbosityLevel: Int): TdlResult<Ok> {
        val function = TdApi.SetLogTagVerbosityLevel(
            tag = tag,
            newVerbosityLevel = newVerbosityLevel,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setLogVerbosityLevel(newVerbosityLevel: Int): TdlResult<Ok> {
        val function = TdApi.SetLogVerbosityLevel(
            newVerbosityLevel = newVerbosityLevel,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setLoginEmailAddress(newLoginEmailAddress: String): TdlResult<EmailAddressAuthenticationCodeInfo> {
        val function = TdApi.SetLoginEmailAddress(
            newLoginEmailAddress = newLoginEmailAddress,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setMenuButton(userId: Long, menuButton: BotMenuButton): TdlResult<Ok> {
        val function = TdApi.SetMenuButton(
            userId = userId,
            menuButton = mapper.map(menuButton),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setMessageFactCheck(
        chatId: Long,
        messageId: Long,
        text: FormattedText?,
    ): TdlResult<Ok> {
        val function = TdApi.SetMessageFactCheck(
            chatId = chatId,
            messageId = messageId,
            text = text?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setMessageReactions(
        chatId: Long,
        messageId: Long,
        reactionTypes: Array<ReactionType>,
        isBig: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.SetMessageReactions(
            chatId = chatId,
            messageId = messageId,
            reactionTypes = reactionTypes.mapArray { mapper.map(it) },
            isBig = isBig,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setMessageSenderBlockList(senderId: MessageSender, blockList: BlockList?): TdlResult<Ok> {
        val function = TdApi.SetMessageSenderBlockList(
            senderId = mapper.map(senderId),
            blockList = blockList?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setMessageSenderBotVerification(
        botUserId: Long,
        verifiedId: MessageSender,
        customDescription: String,
    ): TdlResult<Ok> {
        val function = TdApi.SetMessageSenderBotVerification(
            botUserId = botUserId,
            verifiedId = mapper.map(verifiedId),
            customDescription = customDescription,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setName(firstName: String, lastName: String): TdlResult<Ok> {
        val function = TdApi.SetName(
            firstName = firstName,
            lastName = lastName,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setNetworkType(type: NetworkType?): TdlResult<Ok> {
        val function = TdApi.SetNetworkType(
            type = type?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setNewChatPrivacySettings(settings: NewChatPrivacySettings): TdlResult<Ok> {
        val function = TdApi.SetNewChatPrivacySettings(
            settings = mapper.map(settings),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setOption(name: String, value: OptionValue?): TdlResult<Ok> {
        val function = TdApi.SetOption(
            name = name,
            value = value?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setPaidMessageReactionType(
        chatId: Long,
        messageId: Long,
        type: PaidReactionType,
    ): TdlResult<Ok> {
        val function = TdApi.SetPaidMessageReactionType(
            chatId = chatId,
            messageId = messageId,
            type = mapper.map(type),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setPassportElement(element: InputPassportElement, password: String): TdlResult<PassportElement> {
        val function = TdApi.SetPassportElement(
            element = mapper.map(element),
            password = password,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setPassportElementErrors(userId: Long, errors: Array<InputPassportElementError>): TdlResult<Ok> {
        val function = TdApi.SetPassportElementErrors(
            userId = userId,
            errors = errors.mapArray { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setPassword(
        oldPassword: String,
        newPassword: String,
        newHint: String,
        setRecoveryEmailAddress: Boolean,
        newRecoveryEmailAddress: String,
    ): TdlResult<PasswordState> {
        val function = TdApi.SetPassword(
            oldPassword = oldPassword,
            newPassword = newPassword,
            newHint = newHint,
            setRecoveryEmailAddress = setRecoveryEmailAddress,
            newRecoveryEmailAddress = newRecoveryEmailAddress,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setPersonalChat(chatId: Long): TdlResult<Ok> {
        val function = TdApi.SetPersonalChat(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setPinnedChats(chatList: ChatList, chatIds: LongArray): TdlResult<Ok> {
        val function = TdApi.SetPinnedChats(
            chatList = mapper.map(chatList),
            chatIds = chatIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setPinnedForumTopics(chatId: Long, messageThreadIds: LongArray): TdlResult<Ok> {
        val function = TdApi.SetPinnedForumTopics(
            chatId = chatId,
            messageThreadIds = messageThreadIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setPinnedGifts(ownerId: MessageSender, receivedGiftIds: Array<String>): TdlResult<Ok> {
        val function = TdApi.SetPinnedGifts(
            ownerId = mapper.map(ownerId),
            receivedGiftIds = receivedGiftIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setPinnedSavedMessagesTopics(savedMessagesTopicIds: LongArray): TdlResult<Ok> {
        val function = TdApi.SetPinnedSavedMessagesTopics(
            savedMessagesTopicIds = savedMessagesTopicIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setPollAnswer(
        chatId: Long,
        messageId: Long,
        optionIds: IntArray,
    ): TdlResult<Ok> {
        val function = TdApi.SetPollAnswer(
            chatId = chatId,
            messageId = messageId,
            optionIds = optionIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setProfileAccentColor(profileAccentColorId: Int, profileBackgroundCustomEmojiId: Long): TdlResult<Ok> {
        val function = TdApi.SetProfileAccentColor(
            profileAccentColorId = profileAccentColorId,
            profileBackgroundCustomEmojiId = profileBackgroundCustomEmojiId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setProfilePhoto(photo: InputChatPhoto, isPublic: Boolean): TdlResult<Ok> {
        val function = TdApi.SetProfilePhoto(
            photo = mapper.map(photo),
            isPublic = isPublic,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setQuickReplyShortcutName(shortcutId: Int, name: String): TdlResult<Ok> {
        val function = TdApi.SetQuickReplyShortcutName(
            shortcutId = shortcutId,
            name = name,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setReactionNotificationSettings(notificationSettings: ReactionNotificationSettings): TdlResult<Ok> {
        val function = TdApi.SetReactionNotificationSettings(
            notificationSettings = mapper.map(notificationSettings),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setReadDatePrivacySettings(settings: ReadDatePrivacySettings): TdlResult<Ok> {
        val function = TdApi.SetReadDatePrivacySettings(
            settings = mapper.map(settings),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setRecoveryEmailAddress(password: String, newRecoveryEmailAddress: String): TdlResult<PasswordState> {
        val function = TdApi.SetRecoveryEmailAddress(
            password = password,
            newRecoveryEmailAddress = newRecoveryEmailAddress,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setSavedMessagesTagLabel(tag: ReactionType, label: String): TdlResult<Ok> {
        val function = TdApi.SetSavedMessagesTagLabel(
            tag = mapper.map(tag),
            label = label,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setScopeNotificationSettings(scope: NotificationSettingsScope, notificationSettings: ScopeNotificationSettings): TdlResult<Ok> {
        val function = TdApi.SetScopeNotificationSettings(
            scope = mapper.map(scope),
            notificationSettings = mapper.map(notificationSettings),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setStickerEmojis(sticker: InputFile, emojis: String): TdlResult<Ok> {
        val function = TdApi.SetStickerEmojis(
            sticker = mapper.map(sticker),
            emojis = emojis,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setStickerKeywords(sticker: InputFile, keywords: Array<String>): TdlResult<Ok> {
        val function = TdApi.SetStickerKeywords(
            sticker = mapper.map(sticker),
            keywords = keywords,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setStickerMaskPosition(sticker: InputFile, maskPosition: MaskPosition?): TdlResult<Ok> {
        val function = TdApi.SetStickerMaskPosition(
            sticker = mapper.map(sticker),
            maskPosition = maskPosition?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setStickerPositionInSet(sticker: InputFile, position: Int): TdlResult<Ok> {
        val function = TdApi.SetStickerPositionInSet(
            sticker = mapper.map(sticker),
            position = position,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setStickerSetThumbnail(
        userId: Long,
        name: String,
        thumbnail: InputFile?,
        format: StickerFormat?,
    ): TdlResult<Ok> {
        val function = TdApi.SetStickerSetThumbnail(
            userId = userId,
            name = name,
            thumbnail = thumbnail?.let { mapper.map(it) },
            format = format?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setStickerSetTitle(name: String, title: String): TdlResult<Ok> {
        val function = TdApi.SetStickerSetTitle(
            name = name,
            title = title,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setStoryPrivacySettings(storyId: Int, privacySettings: StoryPrivacySettings): TdlResult<Ok> {
        val function = TdApi.SetStoryPrivacySettings(
            storyId = storyId,
            privacySettings = mapper.map(privacySettings),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setStoryReaction(
        storyPosterChatId: Long,
        storyId: Int,
        reactionType: ReactionType?,
        updateRecentReactions: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.SetStoryReaction(
            storyPosterChatId = storyPosterChatId,
            storyId = storyId,
            reactionType = reactionType?.let { mapper.map(it) },
            updateRecentReactions = updateRecentReactions,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setSupergroupCustomEmojiStickerSet(supergroupId: Long, customEmojiStickerSetId: Long): TdlResult<Ok> {
        val function = TdApi.SetSupergroupCustomEmojiStickerSet(
            supergroupId = supergroupId,
            customEmojiStickerSetId = customEmojiStickerSetId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setSupergroupStickerSet(supergroupId: Long, stickerSetId: Long): TdlResult<Ok> {
        val function = TdApi.SetSupergroupStickerSet(
            supergroupId = supergroupId,
            stickerSetId = stickerSetId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setSupergroupUnrestrictBoostCount(supergroupId: Long, unrestrictBoostCount: Int): TdlResult<Ok> {
        val function = TdApi.SetSupergroupUnrestrictBoostCount(
            supergroupId = supergroupId,
            unrestrictBoostCount = unrestrictBoostCount,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setSupergroupUsername(supergroupId: Long, username: String): TdlResult<Ok> {
        val function = TdApi.SetSupergroupUsername(
            supergroupId = supergroupId,
            username = username,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setTdlibParameters(
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
    ): TdlResult<Ok> {
        val function = TdApi.SetTdlibParameters(
            useTestDc = useTestDc,
            databaseDirectory = databaseDirectory,
            filesDirectory = filesDirectory,
            databaseEncryptionKey = databaseEncryptionKey,
            useFileDatabase = useFileDatabase,
            useChatInfoDatabase = useChatInfoDatabase,
            useMessageDatabase = useMessageDatabase,
            useSecretChats = useSecretChats,
            apiId = apiId,
            apiHash = apiHash,
            systemLanguageCode = systemLanguageCode,
            deviceModel = deviceModel,
            systemVersion = systemVersion,
            applicationVersion = applicationVersion,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setUserEmojiStatus(userId: Long, emojiStatus: EmojiStatus?): TdlResult<Ok> {
        val function = TdApi.SetUserEmojiStatus(
            userId = userId,
            emojiStatus = emojiStatus?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setUserPersonalProfilePhoto(userId: Long, photo: InputChatPhoto?): TdlResult<Ok> {
        val function = TdApi.SetUserPersonalProfilePhoto(
            userId = userId,
            photo = photo?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setUserPrivacySettingRules(setting: UserPrivacySetting, rules: UserPrivacySettingRules): TdlResult<Ok> {
        val function = TdApi.SetUserPrivacySettingRules(
            setting = mapper.map(setting),
            rules = mapper.map(rules),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setUserSupportInfo(userId: Long, message: FormattedText): TdlResult<UserSupportInfo> {
        val function = TdApi.SetUserSupportInfo(
            userId = userId,
            message = mapper.map(message),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setUsername(username: String): TdlResult<Ok> {
        val function = TdApi.SetUsername(
            username = username,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setVideoChatDefaultParticipant(chatId: Long, defaultParticipantId: MessageSender): TdlResult<Ok> {
        val function = TdApi.SetVideoChatDefaultParticipant(
            chatId = chatId,
            defaultParticipantId = mapper.map(defaultParticipantId),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setVideoChatTitle(groupCallId: Int, title: String): TdlResult<Ok> {
        val function = TdApi.SetVideoChatTitle(
            groupCallId = groupCallId,
            title = title,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun shareChatWithBot(
        chatId: Long,
        messageId: Long,
        buttonId: Int,
        sharedChatId: Long,
        onlyCheck: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.ShareChatWithBot(
            chatId = chatId,
            messageId = messageId,
            buttonId = buttonId,
            sharedChatId = sharedChatId,
            onlyCheck = onlyCheck,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sharePhoneNumber(userId: Long): TdlResult<Ok> {
        val function = TdApi.SharePhoneNumber(
            userId = userId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun shareUsersWithBot(
        chatId: Long,
        messageId: Long,
        buttonId: Int,
        sharedUserIds: LongArray,
        onlyCheck: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.ShareUsersWithBot(
            chatId = chatId,
            messageId = messageId,
            buttonId = buttonId,
            sharedUserIds = sharedUserIds,
            onlyCheck = onlyCheck,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun startGroupCallRecording(
        groupCallId: Int,
        title: String,
        recordVideo: Boolean,
        usePortraitOrientation: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.StartGroupCallRecording(
            groupCallId = groupCallId,
            title = title,
            recordVideo = recordVideo,
            usePortraitOrientation = usePortraitOrientation,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun startGroupCallScreenSharing(
        groupCallId: Int,
        audioSourceId: Int,
        payload: String,
    ): TdlResult<Text> {
        val function = TdApi.StartGroupCallScreenSharing(
            groupCallId = groupCallId,
            audioSourceId = audioSourceId,
            payload = payload,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun startScheduledVideoChat(groupCallId: Int): TdlResult<Ok> {
        val function = TdApi.StartScheduledVideoChat(
            groupCallId = groupCallId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun stopBusinessPoll(
        businessConnectionId: String,
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
    ): TdlResult<BusinessMessage> {
        val function = TdApi.StopBusinessPoll(
            businessConnectionId = businessConnectionId,
            chatId = chatId,
            messageId = messageId,
            replyMarkup = replyMarkup?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun stopPoll(
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
    ): TdlResult<Ok> {
        val function = TdApi.StopPoll(
            chatId = chatId,
            messageId = messageId,
            replyMarkup = replyMarkup?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun suggestUserProfilePhoto(userId: Long, photo: InputChatPhoto): TdlResult<Ok> {
        val function = TdApi.SuggestUserProfilePhoto(
            userId = userId,
            photo = mapper.map(photo),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun synchronizeLanguagePack(languagePackId: String): TdlResult<Ok> {
        val function = TdApi.SynchronizeLanguagePack(
            languagePackId = languagePackId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun terminateAllOtherSessions(): TdlResult<Ok> {
        val function = TdApi.TerminateAllOtherSessions()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun terminateSession(sessionId: Long): TdlResult<Ok> {
        val function = TdApi.TerminateSession(
            sessionId = sessionId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun testCallBytes(x: ByteArray): TdlResult<TestBytes> {
        val function = TdApi.TestCallBytes(
            x = x,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun testCallEmpty(): TdlResult<Ok> {
        val function = TdApi.TestCallEmpty()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun testCallString(x: String): TdlResult<TestString> {
        val function = TdApi.TestCallString(
            x = x,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun testCallVectorInt(x: IntArray): TdlResult<TestVectorInt> {
        val function = TdApi.TestCallVectorInt(
            x = x,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun testCallVectorIntObject(x: Array<TestInt>): TdlResult<TestVectorIntObject> {
        val function = TdApi.TestCallVectorIntObject(
            x = x.mapArray { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun testCallVectorString(x: Array<String>): TdlResult<TestVectorString> {
        val function = TdApi.TestCallVectorString(
            x = x,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun testCallVectorStringObject(x: Array<TestString>): TdlResult<TestVectorStringObject> {
        val function = TdApi.TestCallVectorStringObject(
            x = x.mapArray { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun testGetDifference(): TdlResult<Ok> {
        val function = TdApi.TestGetDifference()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun testNetwork(): TdlResult<Ok> {
        val function = TdApi.TestNetwork()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun testProxy(
        server: String,
        port: Int,
        type: ProxyType,
        dcId: Int,
        timeout: Double,
    ): TdlResult<Ok> {
        val function = TdApi.TestProxy(
            server = server,
            port = port,
            type = mapper.map(type),
            dcId = dcId,
            timeout = timeout,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun testReturnError(error: Error): TdlResult<Error> {
        val function = TdApi.TestReturnError(
            error = mapper.map(error),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun testSquareInt(x: Int): TdlResult<TestInt> {
        val function = TdApi.TestSquareInt(
            x = x,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun testUseUpdate(): TdlResult<Update> {
        val function = TdApi.TestUseUpdate()
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleAllDownloadsArePaused(arePaused: Boolean): TdlResult<Ok> {
        val function = TdApi.ToggleAllDownloadsArePaused(
            arePaused = arePaused,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleBotCanManageEmojiStatus(botUserId: Long, canManageEmojiStatus: Boolean): TdlResult<Ok> {
        val function = TdApi.ToggleBotCanManageEmojiStatus(
            botUserId = botUserId,
            canManageEmojiStatus = canManageEmojiStatus,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleBotIsAddedToAttachmentMenu(
        botUserId: Long,
        isAdded: Boolean,
        allowWriteAccess: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.ToggleBotIsAddedToAttachmentMenu(
            botUserId = botUserId,
            isAdded = isAdded,
            allowWriteAccess = allowWriteAccess,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleBotUsernameIsActive(
        botUserId: Long,
        username: String,
        isActive: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.ToggleBotUsernameIsActive(
            botUserId = botUserId,
            username = username,
            isActive = isActive,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleBusinessConnectedBotChatIsPaused(chatId: Long, isPaused: Boolean): TdlResult<Ok> {
        val function = TdApi.ToggleBusinessConnectedBotChatIsPaused(
            chatId = chatId,
            isPaused = isPaused,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleChatDefaultDisableNotification(chatId: Long, defaultDisableNotification: Boolean): TdlResult<Ok> {
        val function = TdApi.ToggleChatDefaultDisableNotification(
            chatId = chatId,
            defaultDisableNotification = defaultDisableNotification,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleChatFolderTags(areTagsEnabled: Boolean): TdlResult<Ok> {
        val function = TdApi.ToggleChatFolderTags(
            areTagsEnabled = areTagsEnabled,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleChatGiftNotifications(chatId: Long, areEnabled: Boolean): TdlResult<Ok> {
        val function = TdApi.ToggleChatGiftNotifications(
            chatId = chatId,
            areEnabled = areEnabled,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleChatHasProtectedContent(chatId: Long, hasProtectedContent: Boolean): TdlResult<Ok> {
        val function = TdApi.ToggleChatHasProtectedContent(
            chatId = chatId,
            hasProtectedContent = hasProtectedContent,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleChatIsMarkedAsUnread(chatId: Long, isMarkedAsUnread: Boolean): TdlResult<Ok> {
        val function = TdApi.ToggleChatIsMarkedAsUnread(
            chatId = chatId,
            isMarkedAsUnread = isMarkedAsUnread,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleChatIsPinned(
        chatList: ChatList,
        chatId: Long,
        isPinned: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.ToggleChatIsPinned(
            chatList = mapper.map(chatList),
            chatId = chatId,
            isPinned = isPinned,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleChatIsTranslatable(chatId: Long, isTranslatable: Boolean): TdlResult<Ok> {
        val function = TdApi.ToggleChatIsTranslatable(
            chatId = chatId,
            isTranslatable = isTranslatable,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleChatViewAsTopics(chatId: Long, viewAsTopics: Boolean): TdlResult<Ok> {
        val function = TdApi.ToggleChatViewAsTopics(
            chatId = chatId,
            viewAsTopics = viewAsTopics,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleDownloadIsPaused(fileId: Int, isPaused: Boolean): TdlResult<Ok> {
        val function = TdApi.ToggleDownloadIsPaused(
            fileId = fileId,
            isPaused = isPaused,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleForumTopicIsClosed(
        chatId: Long,
        messageThreadId: Long,
        isClosed: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.ToggleForumTopicIsClosed(
            chatId = chatId,
            messageThreadId = messageThreadId,
            isClosed = isClosed,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleForumTopicIsPinned(
        chatId: Long,
        messageThreadId: Long,
        isPinned: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.ToggleForumTopicIsPinned(
            chatId = chatId,
            messageThreadId = messageThreadId,
            isPinned = isPinned,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleGeneralForumTopicIsHidden(chatId: Long, isHidden: Boolean): TdlResult<Ok> {
        val function = TdApi.ToggleGeneralForumTopicIsHidden(
            chatId = chatId,
            isHidden = isHidden,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleGiftIsSaved(receivedGiftId: String, isSaved: Boolean): TdlResult<Ok> {
        val function = TdApi.ToggleGiftIsSaved(
            receivedGiftId = receivedGiftId,
            isSaved = isSaved,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleGroupCallIsMyVideoEnabled(groupCallId: Int, isMyVideoEnabled: Boolean): TdlResult<Ok> {
        val function = TdApi.ToggleGroupCallIsMyVideoEnabled(
            groupCallId = groupCallId,
            isMyVideoEnabled = isMyVideoEnabled,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleGroupCallIsMyVideoPaused(groupCallId: Int, isMyVideoPaused: Boolean): TdlResult<Ok> {
        val function = TdApi.ToggleGroupCallIsMyVideoPaused(
            groupCallId = groupCallId,
            isMyVideoPaused = isMyVideoPaused,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleGroupCallParticipantIsHandRaised(
        groupCallId: Int,
        participantId: MessageSender,
        isHandRaised: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.ToggleGroupCallParticipantIsHandRaised(
            groupCallId = groupCallId,
            participantId = mapper.map(participantId),
            isHandRaised = isHandRaised,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleGroupCallParticipantIsMuted(
        groupCallId: Int,
        participantId: MessageSender,
        isMuted: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.ToggleGroupCallParticipantIsMuted(
            groupCallId = groupCallId,
            participantId = mapper.map(participantId),
            isMuted = isMuted,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleGroupCallScreenSharingIsPaused(groupCallId: Int, isPaused: Boolean): TdlResult<Ok> {
        val function = TdApi.ToggleGroupCallScreenSharingIsPaused(
            groupCallId = groupCallId,
            isPaused = isPaused,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleHasSponsoredMessagesEnabled(hasSponsoredMessagesEnabled: Boolean): TdlResult<Ok> {
        val function = TdApi.ToggleHasSponsoredMessagesEnabled(
            hasSponsoredMessagesEnabled = hasSponsoredMessagesEnabled,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleSavedMessagesTopicIsPinned(savedMessagesTopicId: Long, isPinned: Boolean): TdlResult<Ok> {
        val function = TdApi.ToggleSavedMessagesTopicIsPinned(
            savedMessagesTopicId = savedMessagesTopicId,
            isPinned = isPinned,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleSessionCanAcceptCalls(sessionId: Long, canAcceptCalls: Boolean): TdlResult<Ok> {
        val function = TdApi.ToggleSessionCanAcceptCalls(
            sessionId = sessionId,
            canAcceptCalls = canAcceptCalls,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleSessionCanAcceptSecretChats(sessionId: Long, canAcceptSecretChats: Boolean): TdlResult<Ok> {
        val function = TdApi.ToggleSessionCanAcceptSecretChats(
            sessionId = sessionId,
            canAcceptSecretChats = canAcceptSecretChats,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleStoryIsPostedToChatPage(
        storyPosterChatId: Long,
        storyId: Int,
        isPostedToChatPage: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.ToggleStoryIsPostedToChatPage(
            storyPosterChatId = storyPosterChatId,
            storyId = storyId,
            isPostedToChatPage = isPostedToChatPage,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleSupergroupCanHaveSponsoredMessages(supergroupId: Long, canHaveSponsoredMessages: Boolean): TdlResult<Ok> {
        val function = TdApi.ToggleSupergroupCanHaveSponsoredMessages(
            supergroupId = supergroupId,
            canHaveSponsoredMessages = canHaveSponsoredMessages,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleSupergroupHasAggressiveAntiSpamEnabled(supergroupId: Long, hasAggressiveAntiSpamEnabled: Boolean): TdlResult<Ok> {
        val function = TdApi.ToggleSupergroupHasAggressiveAntiSpamEnabled(
            supergroupId = supergroupId,
            hasAggressiveAntiSpamEnabled = hasAggressiveAntiSpamEnabled,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleSupergroupHasAutomaticTranslation(supergroupId: Long, hasAutomaticTranslation: Boolean): TdlResult<Ok> {
        val function = TdApi.ToggleSupergroupHasAutomaticTranslation(
            supergroupId = supergroupId,
            hasAutomaticTranslation = hasAutomaticTranslation,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleSupergroupHasHiddenMembers(supergroupId: Long, hasHiddenMembers: Boolean): TdlResult<Ok> {
        val function = TdApi.ToggleSupergroupHasHiddenMembers(
            supergroupId = supergroupId,
            hasHiddenMembers = hasHiddenMembers,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleSupergroupIsAllHistoryAvailable(supergroupId: Long, isAllHistoryAvailable: Boolean): TdlResult<Ok> {
        val function = TdApi.ToggleSupergroupIsAllHistoryAvailable(
            supergroupId = supergroupId,
            isAllHistoryAvailable = isAllHistoryAvailable,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleSupergroupIsBroadcastGroup(supergroupId: Long): TdlResult<Ok> {
        val function = TdApi.ToggleSupergroupIsBroadcastGroup(
            supergroupId = supergroupId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleSupergroupIsForum(
        supergroupId: Long,
        isForum: Boolean,
        hasForumTabs: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.ToggleSupergroupIsForum(
            supergroupId = supergroupId,
            isForum = isForum,
            hasForumTabs = hasForumTabs,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleSupergroupJoinByRequest(supergroupId: Long, joinByRequest: Boolean): TdlResult<Ok> {
        val function = TdApi.ToggleSupergroupJoinByRequest(
            supergroupId = supergroupId,
            joinByRequest = joinByRequest,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleSupergroupJoinToSendMessages(supergroupId: Long, joinToSendMessages: Boolean): TdlResult<Ok> {
        val function = TdApi.ToggleSupergroupJoinToSendMessages(
            supergroupId = supergroupId,
            joinToSendMessages = joinToSendMessages,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleSupergroupSignMessages(
        supergroupId: Long,
        signMessages: Boolean,
        showMessageSender: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.ToggleSupergroupSignMessages(
            supergroupId = supergroupId,
            signMessages = signMessages,
            showMessageSender = showMessageSender,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleSupergroupUsernameIsActive(
        supergroupId: Long,
        username: String,
        isActive: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.ToggleSupergroupUsernameIsActive(
            supergroupId = supergroupId,
            username = username,
            isActive = isActive,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleUsernameIsActive(username: String, isActive: Boolean): TdlResult<Ok> {
        val function = TdApi.ToggleUsernameIsActive(
            username = username,
            isActive = isActive,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleVideoChatEnabledStartNotification(groupCallId: Int, enabledStartNotification: Boolean): TdlResult<Ok> {
        val function = TdApi.ToggleVideoChatEnabledStartNotification(
            groupCallId = groupCallId,
            enabledStartNotification = enabledStartNotification,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleVideoChatMuteNewParticipants(groupCallId: Int, muteNewParticipants: Boolean): TdlResult<Ok> {
        val function = TdApi.ToggleVideoChatMuteNewParticipants(
            groupCallId = groupCallId,
            muteNewParticipants = muteNewParticipants,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun transferBusinessAccountStars(businessConnectionId: String, starCount: Long): TdlResult<Ok> {
        val function = TdApi.TransferBusinessAccountStars(
            businessConnectionId = businessConnectionId,
            starCount = starCount,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun transferChatOwnership(
        chatId: Long,
        userId: Long,
        password: String,
    ): TdlResult<Ok> {
        val function = TdApi.TransferChatOwnership(
            chatId = chatId,
            userId = userId,
            password = password,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun transferGift(
        businessConnectionId: String,
        receivedGiftId: String,
        newOwnerId: MessageSender,
        starCount: Long,
    ): TdlResult<Ok> {
        val function = TdApi.TransferGift(
            businessConnectionId = businessConnectionId,
            receivedGiftId = receivedGiftId,
            newOwnerId = mapper.map(newOwnerId),
            starCount = starCount,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun translateMessageText(
        chatId: Long,
        messageId: Long,
        toLanguageCode: String,
    ): TdlResult<FormattedText> {
        val function = TdApi.TranslateMessageText(
            chatId = chatId,
            messageId = messageId,
            toLanguageCode = toLanguageCode,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun translateText(text: FormattedText, toLanguageCode: String): TdlResult<FormattedText> {
        val function = TdApi.TranslateText(
            text = mapper.map(text),
            toLanguageCode = toLanguageCode,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun unpinAllChatMessages(chatId: Long): TdlResult<Ok> {
        val function = TdApi.UnpinAllChatMessages(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun unpinAllDirectMessagesChatTopicMessages(chatId: Long, topicId: Long): TdlResult<Ok> {
        val function = TdApi.UnpinAllDirectMessagesChatTopicMessages(
            chatId = chatId,
            topicId = topicId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun unpinAllMessageThreadMessages(chatId: Long, messageThreadId: Long): TdlResult<Ok> {
        val function = TdApi.UnpinAllMessageThreadMessages(
            chatId = chatId,
            messageThreadId = messageThreadId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun unpinChatMessage(chatId: Long, messageId: Long): TdlResult<Ok> {
        val function = TdApi.UnpinChatMessage(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun upgradeBasicGroupChatToSupergroupChat(chatId: Long): TdlResult<Chat> {
        val function = TdApi.UpgradeBasicGroupChatToSupergroupChat(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun upgradeGift(
        businessConnectionId: String,
        receivedGiftId: String,
        keepOriginalDetails: Boolean,
        starCount: Long,
    ): TdlResult<UpgradeGiftResult> {
        val function = TdApi.UpgradeGift(
            businessConnectionId = businessConnectionId,
            receivedGiftId = receivedGiftId,
            keepOriginalDetails = keepOriginalDetails,
            starCount = starCount,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun uploadStickerFile(
        userId: Long,
        stickerFormat: StickerFormat,
        sticker: InputFile,
    ): TdlResult<File> {
        val function = TdApi.UploadStickerFile(
            userId = userId,
            stickerFormat = mapper.map(stickerFormat),
            sticker = mapper.map(sticker),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun validateOrderInfo(
        inputInvoice: InputInvoice,
        orderInfo: OrderInfo?,
        allowSave: Boolean,
    ): TdlResult<ValidatedOrderInfo> {
        val function = TdApi.ValidateOrderInfo(
            inputInvoice = mapper.map(inputInvoice),
            orderInfo = orderInfo?.let { mapper.map(it) },
            allowSave = allowSave,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun viewMessages(
        chatId: Long,
        messageIds: LongArray,
        source: MessageSource?,
        forceRead: Boolean,
    ): TdlResult<Ok> {
        val function = TdApi.ViewMessages(
            chatId = chatId,
            messageIds = messageIds,
            source = source?.let { mapper.map(it) },
            forceRead = forceRead,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun viewPremiumFeature(feature: PremiumFeature): TdlResult<Ok> {
        val function = TdApi.ViewPremiumFeature(
            feature = mapper.map(feature),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun viewSponsoredChat(sponsoredChatUniqueId: Long): TdlResult<Ok> {
        val function = TdApi.ViewSponsoredChat(
            sponsoredChatUniqueId = sponsoredChatUniqueId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun viewTrendingStickerSets(stickerSetIds: LongArray): TdlResult<Ok> {
        val function = TdApi.ViewTrendingStickerSets(
            stickerSetIds = stickerSetIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun writeGeneratedFilePart(
        generationId: Long,
        offset: Long,
        data: ByteArray,
    ): TdlResult<Ok> {
        val function = TdApi.WriteGeneratedFilePart(
            generationId = generationId,
            offset = offset,
            data = data,
        )
        return repository.send(function) { mapper.map(it) }
    }
}
