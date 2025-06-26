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
import dev.g000sha256.tdl.function.AcceptCall
import dev.g000sha256.tdl.function.AcceptTermsOfService
import dev.g000sha256.tdl.function.ActivateStoryStealthMode
import dev.g000sha256.tdl.function.AddBotMediaPreview
import dev.g000sha256.tdl.function.AddChatFolderByInviteLink
import dev.g000sha256.tdl.function.AddChatMember
import dev.g000sha256.tdl.function.AddChatMembers
import dev.g000sha256.tdl.function.AddChatToList
import dev.g000sha256.tdl.function.AddContact
import dev.g000sha256.tdl.function.AddCustomServerLanguagePack
import dev.g000sha256.tdl.function.AddFavoriteSticker
import dev.g000sha256.tdl.function.AddFileToDownloads
import dev.g000sha256.tdl.function.AddLocalMessage
import dev.g000sha256.tdl.function.AddLogMessage
import dev.g000sha256.tdl.function.AddMessageReaction
import dev.g000sha256.tdl.function.AddNetworkStatistics
import dev.g000sha256.tdl.function.AddPendingPaidMessageReaction
import dev.g000sha256.tdl.function.AddProxy
import dev.g000sha256.tdl.function.AddQuickReplyShortcutInlineQueryResultMessage
import dev.g000sha256.tdl.function.AddQuickReplyShortcutMessage
import dev.g000sha256.tdl.function.AddQuickReplyShortcutMessageAlbum
import dev.g000sha256.tdl.function.AddRecentSticker
import dev.g000sha256.tdl.function.AddRecentlyFoundChat
import dev.g000sha256.tdl.function.AddSavedAnimation
import dev.g000sha256.tdl.function.AddSavedNotificationSound
import dev.g000sha256.tdl.function.AddStickerToSet
import dev.g000sha256.tdl.function.AllowBotToSendMessages
import dev.g000sha256.tdl.function.AllowUnpaidMessagesFromUser
import dev.g000sha256.tdl.function.AnswerCallbackQuery
import dev.g000sha256.tdl.function.AnswerCustomQuery
import dev.g000sha256.tdl.function.AnswerInlineQuery
import dev.g000sha256.tdl.function.AnswerPreCheckoutQuery
import dev.g000sha256.tdl.function.AnswerShippingQuery
import dev.g000sha256.tdl.function.AnswerWebAppQuery
import dev.g000sha256.tdl.function.ApplyPremiumGiftCode
import dev.g000sha256.tdl.function.AssignStoreTransaction
import dev.g000sha256.tdl.function.BanChatMember
import dev.g000sha256.tdl.function.BanGroupCallParticipants
import dev.g000sha256.tdl.function.BlockMessageSenderFromReplies
import dev.g000sha256.tdl.function.BoostChat
import dev.g000sha256.tdl.function.CanBotSendMessages
import dev.g000sha256.tdl.function.CanPostStory
import dev.g000sha256.tdl.function.CanPurchaseFromStore
import dev.g000sha256.tdl.function.CanSendMessageToUser
import dev.g000sha256.tdl.function.CanTransferOwnership
import dev.g000sha256.tdl.function.CancelDownloadFile
import dev.g000sha256.tdl.function.CancelPasswordReset
import dev.g000sha256.tdl.function.CancelPreliminaryUploadFile
import dev.g000sha256.tdl.function.CancelRecoveryEmailAddressVerification
import dev.g000sha256.tdl.function.ChangeImportedContacts
import dev.g000sha256.tdl.function.ChangeStickerSet
import dev.g000sha256.tdl.function.CheckAuthenticationBotToken
import dev.g000sha256.tdl.function.CheckAuthenticationCode
import dev.g000sha256.tdl.function.CheckAuthenticationEmailCode
import dev.g000sha256.tdl.function.CheckAuthenticationPassword
import dev.g000sha256.tdl.function.CheckAuthenticationPasswordRecoveryCode
import dev.g000sha256.tdl.function.CheckAuthenticationPremiumPurchase
import dev.g000sha256.tdl.function.CheckChatFolderInviteLink
import dev.g000sha256.tdl.function.CheckChatInviteLink
import dev.g000sha256.tdl.function.CheckChatUsername
import dev.g000sha256.tdl.function.CheckCreatedPublicChatsLimit
import dev.g000sha256.tdl.function.CheckEmailAddressVerificationCode
import dev.g000sha256.tdl.function.CheckLoginEmailAddressCode
import dev.g000sha256.tdl.function.CheckPasswordRecoveryCode
import dev.g000sha256.tdl.function.CheckPhoneNumberCode
import dev.g000sha256.tdl.function.CheckPremiumGiftCode
import dev.g000sha256.tdl.function.CheckQuickReplyShortcutName
import dev.g000sha256.tdl.function.CheckRecoveryEmailAddressCode
import dev.g000sha256.tdl.function.CheckStickerSetName
import dev.g000sha256.tdl.function.CheckWebAppFileDownload
import dev.g000sha256.tdl.function.CleanFileName
import dev.g000sha256.tdl.function.ClearAllDraftMessages
import dev.g000sha256.tdl.function.ClearAutosaveSettingsExceptions
import dev.g000sha256.tdl.function.ClearImportedContacts
import dev.g000sha256.tdl.function.ClearRecentEmojiStatuses
import dev.g000sha256.tdl.function.ClearRecentReactions
import dev.g000sha256.tdl.function.ClearRecentStickers
import dev.g000sha256.tdl.function.ClearRecentlyFoundChats
import dev.g000sha256.tdl.function.ClearSearchedForTags
import dev.g000sha256.tdl.function.ClickAnimatedEmojiMessage
import dev.g000sha256.tdl.function.ClickChatSponsoredMessage
import dev.g000sha256.tdl.function.ClickPremiumSubscriptionButton
import dev.g000sha256.tdl.function.Close
import dev.g000sha256.tdl.function.CloseChat
import dev.g000sha256.tdl.function.CloseSecretChat
import dev.g000sha256.tdl.function.CloseStory
import dev.g000sha256.tdl.function.CloseWebApp
import dev.g000sha256.tdl.function.CommitPendingPaidMessageReactions
import dev.g000sha256.tdl.function.ConfirmQrCodeAuthentication
import dev.g000sha256.tdl.function.ConfirmSession
import dev.g000sha256.tdl.function.ConnectAffiliateProgram
import dev.g000sha256.tdl.function.CreateBasicGroupChat
import dev.g000sha256.tdl.function.CreateBusinessChatLink
import dev.g000sha256.tdl.function.CreateCall
import dev.g000sha256.tdl.function.CreateChatFolder
import dev.g000sha256.tdl.function.CreateChatFolderInviteLink
import dev.g000sha256.tdl.function.CreateChatInviteLink
import dev.g000sha256.tdl.function.CreateChatSubscriptionInviteLink
import dev.g000sha256.tdl.function.CreateForumTopic
import dev.g000sha256.tdl.function.CreateGroupCall
import dev.g000sha256.tdl.function.CreateInvoiceLink
import dev.g000sha256.tdl.function.CreateNewBasicGroupChat
import dev.g000sha256.tdl.function.CreateNewSecretChat
import dev.g000sha256.tdl.function.CreateNewStickerSet
import dev.g000sha256.tdl.function.CreateNewSupergroupChat
import dev.g000sha256.tdl.function.CreatePrivateChat
import dev.g000sha256.tdl.function.CreateSecretChat
import dev.g000sha256.tdl.function.CreateSupergroupChat
import dev.g000sha256.tdl.function.CreateTemporaryPassword
import dev.g000sha256.tdl.function.CreateVideoChat
import dev.g000sha256.tdl.function.DeclineGroupCallInvitation
import dev.g000sha256.tdl.function.DecryptGroupCallData
import dev.g000sha256.tdl.function.DeleteAccount
import dev.g000sha256.tdl.function.DeleteAllCallMessages
import dev.g000sha256.tdl.function.DeleteAllRevokedChatInviteLinks
import dev.g000sha256.tdl.function.DeleteBotMediaPreviews
import dev.g000sha256.tdl.function.DeleteBusinessChatLink
import dev.g000sha256.tdl.function.DeleteBusinessConnectedBot
import dev.g000sha256.tdl.function.DeleteBusinessMessages
import dev.g000sha256.tdl.function.DeleteBusinessStory
import dev.g000sha256.tdl.function.DeleteChat
import dev.g000sha256.tdl.function.DeleteChatBackground
import dev.g000sha256.tdl.function.DeleteChatFolder
import dev.g000sha256.tdl.function.DeleteChatFolderInviteLink
import dev.g000sha256.tdl.function.DeleteChatHistory
import dev.g000sha256.tdl.function.DeleteChatMessagesByDate
import dev.g000sha256.tdl.function.DeleteChatMessagesBySender
import dev.g000sha256.tdl.function.DeleteChatReplyMarkup
import dev.g000sha256.tdl.function.DeleteCommands
import dev.g000sha256.tdl.function.DeleteDefaultBackground
import dev.g000sha256.tdl.function.DeleteDirectMessagesChatTopicHistory
import dev.g000sha256.tdl.function.DeleteDirectMessagesChatTopicMessagesByDate
import dev.g000sha256.tdl.function.DeleteFile
import dev.g000sha256.tdl.function.DeleteForumTopic
import dev.g000sha256.tdl.function.DeleteLanguagePack
import dev.g000sha256.tdl.function.DeleteMessages
import dev.g000sha256.tdl.function.DeletePassportElement
import dev.g000sha256.tdl.function.DeleteProfilePhoto
import dev.g000sha256.tdl.function.DeleteQuickReplyShortcut
import dev.g000sha256.tdl.function.DeleteQuickReplyShortcutMessages
import dev.g000sha256.tdl.function.DeleteRevokedChatInviteLink
import dev.g000sha256.tdl.function.DeleteSavedCredentials
import dev.g000sha256.tdl.function.DeleteSavedMessagesTopicHistory
import dev.g000sha256.tdl.function.DeleteSavedMessagesTopicMessagesByDate
import dev.g000sha256.tdl.function.DeleteSavedOrderInfo
import dev.g000sha256.tdl.function.DeleteStickerSet
import dev.g000sha256.tdl.function.DeleteStory
import dev.g000sha256.tdl.function.Destroy
import dev.g000sha256.tdl.function.DisableAllSupergroupUsernames
import dev.g000sha256.tdl.function.DisableProxy
import dev.g000sha256.tdl.function.DiscardCall
import dev.g000sha256.tdl.function.DisconnectAffiliateProgram
import dev.g000sha256.tdl.function.DisconnectAllWebsites
import dev.g000sha256.tdl.function.DisconnectWebsite
import dev.g000sha256.tdl.function.DownloadFile
import dev.g000sha256.tdl.function.EditBotMediaPreview
import dev.g000sha256.tdl.function.EditBusinessChatLink
import dev.g000sha256.tdl.function.EditBusinessMessageCaption
import dev.g000sha256.tdl.function.EditBusinessMessageLiveLocation
import dev.g000sha256.tdl.function.EditBusinessMessageMedia
import dev.g000sha256.tdl.function.EditBusinessMessageReplyMarkup
import dev.g000sha256.tdl.function.EditBusinessMessageText
import dev.g000sha256.tdl.function.EditBusinessStory
import dev.g000sha256.tdl.function.EditChatFolder
import dev.g000sha256.tdl.function.EditChatFolderInviteLink
import dev.g000sha256.tdl.function.EditChatInviteLink
import dev.g000sha256.tdl.function.EditChatSubscriptionInviteLink
import dev.g000sha256.tdl.function.EditCustomLanguagePackInfo
import dev.g000sha256.tdl.function.EditForumTopic
import dev.g000sha256.tdl.function.EditInlineMessageCaption
import dev.g000sha256.tdl.function.EditInlineMessageLiveLocation
import dev.g000sha256.tdl.function.EditInlineMessageMedia
import dev.g000sha256.tdl.function.EditInlineMessageReplyMarkup
import dev.g000sha256.tdl.function.EditInlineMessageText
import dev.g000sha256.tdl.function.EditMessageCaption
import dev.g000sha256.tdl.function.EditMessageLiveLocation
import dev.g000sha256.tdl.function.EditMessageMedia
import dev.g000sha256.tdl.function.EditMessageReplyMarkup
import dev.g000sha256.tdl.function.EditMessageSchedulingState
import dev.g000sha256.tdl.function.EditMessageText
import dev.g000sha256.tdl.function.EditProxy
import dev.g000sha256.tdl.function.EditQuickReplyMessage
import dev.g000sha256.tdl.function.EditStarSubscription
import dev.g000sha256.tdl.function.EditStory
import dev.g000sha256.tdl.function.EditStoryCover
import dev.g000sha256.tdl.function.EditUserStarSubscription
import dev.g000sha256.tdl.function.EnableProxy
import dev.g000sha256.tdl.function.EncryptGroupCallData
import dev.g000sha256.tdl.function.EndGroupCall
import dev.g000sha256.tdl.function.EndGroupCallRecording
import dev.g000sha256.tdl.function.EndGroupCallScreenSharing
import dev.g000sha256.tdl.function.FinishFileGeneration
import dev.g000sha256.tdl.function.ForwardMessages
import dev.g000sha256.tdl.function.GetAccountTtl
import dev.g000sha256.tdl.function.GetActiveSessions
import dev.g000sha256.tdl.function.GetAllPassportElements
import dev.g000sha256.tdl.function.GetAllStickerEmojis
import dev.g000sha256.tdl.function.GetAnimatedEmoji
import dev.g000sha256.tdl.function.GetApplicationConfig
import dev.g000sha256.tdl.function.GetApplicationDownloadLink
import dev.g000sha256.tdl.function.GetArchiveChatListSettings
import dev.g000sha256.tdl.function.GetArchivedStickerSets
import dev.g000sha256.tdl.function.GetAttachedStickerSets
import dev.g000sha256.tdl.function.GetAttachmentMenuBot
import dev.g000sha256.tdl.function.GetAuthorizationState
import dev.g000sha256.tdl.function.GetAutoDownloadSettingsPresets
import dev.g000sha256.tdl.function.GetAutosaveSettings
import dev.g000sha256.tdl.function.GetAvailableChatBoostSlots
import dev.g000sha256.tdl.function.GetAvailableGifts
import dev.g000sha256.tdl.function.GetBackgroundUrl
import dev.g000sha256.tdl.function.GetBankCardInfo
import dev.g000sha256.tdl.function.GetBasicGroup
import dev.g000sha256.tdl.function.GetBasicGroupFullInfo
import dev.g000sha256.tdl.function.GetBlockedMessageSenders
import dev.g000sha256.tdl.function.GetBotInfoDescription
import dev.g000sha256.tdl.function.GetBotInfoShortDescription
import dev.g000sha256.tdl.function.GetBotMediaPreviewInfo
import dev.g000sha256.tdl.function.GetBotMediaPreviews
import dev.g000sha256.tdl.function.GetBotName
import dev.g000sha256.tdl.function.GetBotSimilarBotCount
import dev.g000sha256.tdl.function.GetBotSimilarBots
import dev.g000sha256.tdl.function.GetBusinessAccountStarAmount
import dev.g000sha256.tdl.function.GetBusinessChatLinkInfo
import dev.g000sha256.tdl.function.GetBusinessChatLinks
import dev.g000sha256.tdl.function.GetBusinessConnectedBot
import dev.g000sha256.tdl.function.GetBusinessConnection
import dev.g000sha256.tdl.function.GetBusinessFeatures
import dev.g000sha256.tdl.function.GetCallbackQueryAnswer
import dev.g000sha256.tdl.function.GetCallbackQueryMessage
import dev.g000sha256.tdl.function.GetChat
import dev.g000sha256.tdl.function.GetChatActiveStories
import dev.g000sha256.tdl.function.GetChatAdministrators
import dev.g000sha256.tdl.function.GetChatArchivedStories
import dev.g000sha256.tdl.function.GetChatAvailableMessageSenders
import dev.g000sha256.tdl.function.GetChatAvailablePaidMessageReactionSenders
import dev.g000sha256.tdl.function.GetChatBoostFeatures
import dev.g000sha256.tdl.function.GetChatBoostLevelFeatures
import dev.g000sha256.tdl.function.GetChatBoostLink
import dev.g000sha256.tdl.function.GetChatBoostLinkInfo
import dev.g000sha256.tdl.function.GetChatBoostStatus
import dev.g000sha256.tdl.function.GetChatBoosts
import dev.g000sha256.tdl.function.GetChatEventLog
import dev.g000sha256.tdl.function.GetChatFolder
import dev.g000sha256.tdl.function.GetChatFolderChatCount
import dev.g000sha256.tdl.function.GetChatFolderChatsToLeave
import dev.g000sha256.tdl.function.GetChatFolderDefaultIconName
import dev.g000sha256.tdl.function.GetChatFolderInviteLinks
import dev.g000sha256.tdl.function.GetChatFolderNewChats
import dev.g000sha256.tdl.function.GetChatHistory
import dev.g000sha256.tdl.function.GetChatInviteLink
import dev.g000sha256.tdl.function.GetChatInviteLinkCounts
import dev.g000sha256.tdl.function.GetChatInviteLinkMembers
import dev.g000sha256.tdl.function.GetChatInviteLinks
import dev.g000sha256.tdl.function.GetChatJoinRequests
import dev.g000sha256.tdl.function.GetChatListsToAddChat
import dev.g000sha256.tdl.function.GetChatMember
import dev.g000sha256.tdl.function.GetChatMessageByDate
import dev.g000sha256.tdl.function.GetChatMessageCalendar
import dev.g000sha256.tdl.function.GetChatMessageCount
import dev.g000sha256.tdl.function.GetChatMessagePosition
import dev.g000sha256.tdl.function.GetChatNotificationSettingsExceptions
import dev.g000sha256.tdl.function.GetChatPinnedMessage
import dev.g000sha256.tdl.function.GetChatPostedToChatPageStories
import dev.g000sha256.tdl.function.GetChatRevenueStatistics
import dev.g000sha256.tdl.function.GetChatRevenueTransactions
import dev.g000sha256.tdl.function.GetChatRevenueWithdrawalUrl
import dev.g000sha256.tdl.function.GetChatScheduledMessages
import dev.g000sha256.tdl.function.GetChatSimilarChatCount
import dev.g000sha256.tdl.function.GetChatSimilarChats
import dev.g000sha256.tdl.function.GetChatSparseMessagePositions
import dev.g000sha256.tdl.function.GetChatSponsoredMessages
import dev.g000sha256.tdl.function.GetChatStatistics
import dev.g000sha256.tdl.function.GetChatStoryInteractions
import dev.g000sha256.tdl.function.GetChats
import dev.g000sha256.tdl.function.GetChatsForChatFolderInviteLink
import dev.g000sha256.tdl.function.GetChatsToPostStories
import dev.g000sha256.tdl.function.GetCloseFriends
import dev.g000sha256.tdl.function.GetCollectibleItemInfo
import dev.g000sha256.tdl.function.GetCommands
import dev.g000sha256.tdl.function.GetConnectedAffiliateProgram
import dev.g000sha256.tdl.function.GetConnectedAffiliatePrograms
import dev.g000sha256.tdl.function.GetConnectedWebsites
import dev.g000sha256.tdl.function.GetContacts
import dev.g000sha256.tdl.function.GetCountries
import dev.g000sha256.tdl.function.GetCountryCode
import dev.g000sha256.tdl.function.GetCountryFlagEmoji
import dev.g000sha256.tdl.function.GetCreatedPublicChats
import dev.g000sha256.tdl.function.GetCurrentState
import dev.g000sha256.tdl.function.GetCurrentWeather
import dev.g000sha256.tdl.function.GetCustomEmojiReactionAnimations
import dev.g000sha256.tdl.function.GetCustomEmojiStickers
import dev.g000sha256.tdl.function.GetDatabaseStatistics
import dev.g000sha256.tdl.function.GetDeepLinkInfo
import dev.g000sha256.tdl.function.GetDefaultBackgroundCustomEmojiStickers
import dev.g000sha256.tdl.function.GetDefaultChatEmojiStatuses
import dev.g000sha256.tdl.function.GetDefaultChatPhotoCustomEmojiStickers
import dev.g000sha256.tdl.function.GetDefaultEmojiStatuses
import dev.g000sha256.tdl.function.GetDefaultMessageAutoDeleteTime
import dev.g000sha256.tdl.function.GetDefaultProfilePhotoCustomEmojiStickers
import dev.g000sha256.tdl.function.GetDirectMessagesChatTopic
import dev.g000sha256.tdl.function.GetDirectMessagesChatTopicHistory
import dev.g000sha256.tdl.function.GetDirectMessagesChatTopicMessageByDate
import dev.g000sha256.tdl.function.GetDisallowedChatEmojiStatuses
import dev.g000sha256.tdl.function.GetEmojiCategories
import dev.g000sha256.tdl.function.GetEmojiReaction
import dev.g000sha256.tdl.function.GetEmojiSuggestionsUrl
import dev.g000sha256.tdl.function.GetExternalLink
import dev.g000sha256.tdl.function.GetExternalLinkInfo
import dev.g000sha256.tdl.function.GetFavoriteStickers
import dev.g000sha256.tdl.function.GetFile
import dev.g000sha256.tdl.function.GetFileDownloadedPrefixSize
import dev.g000sha256.tdl.function.GetFileExtension
import dev.g000sha256.tdl.function.GetFileMimeType
import dev.g000sha256.tdl.function.GetForumTopic
import dev.g000sha256.tdl.function.GetForumTopicDefaultIcons
import dev.g000sha256.tdl.function.GetForumTopicLink
import dev.g000sha256.tdl.function.GetForumTopics
import dev.g000sha256.tdl.function.GetGameHighScores
import dev.g000sha256.tdl.function.GetGiftUpgradePreview
import dev.g000sha256.tdl.function.GetGiveawayInfo
import dev.g000sha256.tdl.function.GetGreetingStickers
import dev.g000sha256.tdl.function.GetGrossingWebAppBots
import dev.g000sha256.tdl.function.GetGroupCall
import dev.g000sha256.tdl.function.GetGroupCallParticipants
import dev.g000sha256.tdl.function.GetGroupsInCommon
import dev.g000sha256.tdl.function.GetImportedContactCount
import dev.g000sha256.tdl.function.GetInactiveSupergroupChats
import dev.g000sha256.tdl.function.GetInlineGameHighScores
import dev.g000sha256.tdl.function.GetInlineQueryResults
import dev.g000sha256.tdl.function.GetInstalledBackgrounds
import dev.g000sha256.tdl.function.GetInstalledStickerSets
import dev.g000sha256.tdl.function.GetInternalLink
import dev.g000sha256.tdl.function.GetInternalLinkType
import dev.g000sha256.tdl.function.GetJsonString
import dev.g000sha256.tdl.function.GetJsonValue
import dev.g000sha256.tdl.function.GetKeywordEmojis
import dev.g000sha256.tdl.function.GetLanguagePackInfo
import dev.g000sha256.tdl.function.GetLanguagePackString
import dev.g000sha256.tdl.function.GetLanguagePackStrings
import dev.g000sha256.tdl.function.GetLinkPreview
import dev.g000sha256.tdl.function.GetLocalizationTargetInfo
import dev.g000sha256.tdl.function.GetLogStream
import dev.g000sha256.tdl.function.GetLogTagVerbosityLevel
import dev.g000sha256.tdl.function.GetLogTags
import dev.g000sha256.tdl.function.GetLogVerbosityLevel
import dev.g000sha256.tdl.function.GetLoginUrl
import dev.g000sha256.tdl.function.GetLoginUrlInfo
import dev.g000sha256.tdl.function.GetMainWebApp
import dev.g000sha256.tdl.function.GetMapThumbnailFile
import dev.g000sha256.tdl.function.GetMarkdownText
import dev.g000sha256.tdl.function.GetMe
import dev.g000sha256.tdl.function.GetMenuButton
import dev.g000sha256.tdl.function.GetMessage
import dev.g000sha256.tdl.function.GetMessageAddedReactions
import dev.g000sha256.tdl.function.GetMessageAuthor
import dev.g000sha256.tdl.function.GetMessageAvailableReactions
import dev.g000sha256.tdl.function.GetMessageEffect
import dev.g000sha256.tdl.function.GetMessageEmbeddingCode
import dev.g000sha256.tdl.function.GetMessageFileType
import dev.g000sha256.tdl.function.GetMessageImportConfirmationText
import dev.g000sha256.tdl.function.GetMessageLink
import dev.g000sha256.tdl.function.GetMessageLinkInfo
import dev.g000sha256.tdl.function.GetMessageLocally
import dev.g000sha256.tdl.function.GetMessageProperties
import dev.g000sha256.tdl.function.GetMessagePublicForwards
import dev.g000sha256.tdl.function.GetMessageReadDate
import dev.g000sha256.tdl.function.GetMessageStatistics
import dev.g000sha256.tdl.function.GetMessageThread
import dev.g000sha256.tdl.function.GetMessageThreadHistory
import dev.g000sha256.tdl.function.GetMessageViewers
import dev.g000sha256.tdl.function.GetMessages
import dev.g000sha256.tdl.function.GetNetworkStatistics
import dev.g000sha256.tdl.function.GetNewChatPrivacySettings
import dev.g000sha256.tdl.function.GetOption
import dev.g000sha256.tdl.function.GetOwnedBots
import dev.g000sha256.tdl.function.GetOwnedStickerSets
import dev.g000sha256.tdl.function.GetPaidMessageRevenue
import dev.g000sha256.tdl.function.GetPassportAuthorizationForm
import dev.g000sha256.tdl.function.GetPassportAuthorizationFormAvailableElements
import dev.g000sha256.tdl.function.GetPassportElement
import dev.g000sha256.tdl.function.GetPasswordState
import dev.g000sha256.tdl.function.GetPaymentForm
import dev.g000sha256.tdl.function.GetPaymentReceipt
import dev.g000sha256.tdl.function.GetPhoneNumberInfo
import dev.g000sha256.tdl.function.GetPhoneNumberInfoSync
import dev.g000sha256.tdl.function.GetPollVoters
import dev.g000sha256.tdl.function.GetPreferredCountryLanguage
import dev.g000sha256.tdl.function.GetPremiumFeatures
import dev.g000sha256.tdl.function.GetPremiumGiftPaymentOptions
import dev.g000sha256.tdl.function.GetPremiumGiveawayPaymentOptions
import dev.g000sha256.tdl.function.GetPremiumInfoSticker
import dev.g000sha256.tdl.function.GetPremiumLimit
import dev.g000sha256.tdl.function.GetPremiumState
import dev.g000sha256.tdl.function.GetPremiumStickerExamples
import dev.g000sha256.tdl.function.GetPremiumStickers
import dev.g000sha256.tdl.function.GetPreparedInlineMessage
import dev.g000sha256.tdl.function.GetProxies
import dev.g000sha256.tdl.function.GetProxyLink
import dev.g000sha256.tdl.function.GetPushReceiverId
import dev.g000sha256.tdl.function.GetReadDatePrivacySettings
import dev.g000sha256.tdl.function.GetReceivedGift
import dev.g000sha256.tdl.function.GetReceivedGifts
import dev.g000sha256.tdl.function.GetRecentEmojiStatuses
import dev.g000sha256.tdl.function.GetRecentInlineBots
import dev.g000sha256.tdl.function.GetRecentStickers
import dev.g000sha256.tdl.function.GetRecentlyOpenedChats
import dev.g000sha256.tdl.function.GetRecentlyVisitedTMeUrls
import dev.g000sha256.tdl.function.GetRecommendedChatFolders
import dev.g000sha256.tdl.function.GetRecommendedChats
import dev.g000sha256.tdl.function.GetRecoveryEmailAddress
import dev.g000sha256.tdl.function.GetRemoteFile
import dev.g000sha256.tdl.function.GetRepliedMessage
import dev.g000sha256.tdl.function.GetSavedAnimations
import dev.g000sha256.tdl.function.GetSavedMessagesTags
import dev.g000sha256.tdl.function.GetSavedMessagesTopicHistory
import dev.g000sha256.tdl.function.GetSavedMessagesTopicMessageByDate
import dev.g000sha256.tdl.function.GetSavedNotificationSound
import dev.g000sha256.tdl.function.GetSavedNotificationSounds
import dev.g000sha256.tdl.function.GetSavedOrderInfo
import dev.g000sha256.tdl.function.GetScopeNotificationSettings
import dev.g000sha256.tdl.function.GetSearchSponsoredChats
import dev.g000sha256.tdl.function.GetSearchedForTags
import dev.g000sha256.tdl.function.GetSecretChat
import dev.g000sha256.tdl.function.GetStarAdAccountUrl
import dev.g000sha256.tdl.function.GetStarGiftPaymentOptions
import dev.g000sha256.tdl.function.GetStarGiveawayPaymentOptions
import dev.g000sha256.tdl.function.GetStarPaymentOptions
import dev.g000sha256.tdl.function.GetStarRevenueStatistics
import dev.g000sha256.tdl.function.GetStarSubscriptions
import dev.g000sha256.tdl.function.GetStarTransactions
import dev.g000sha256.tdl.function.GetStarWithdrawalUrl
import dev.g000sha256.tdl.function.GetStatisticalGraph
import dev.g000sha256.tdl.function.GetStickerEmojis
import dev.g000sha256.tdl.function.GetStickerOutline
import dev.g000sha256.tdl.function.GetStickerSet
import dev.g000sha256.tdl.function.GetStickerSetName
import dev.g000sha256.tdl.function.GetStickers
import dev.g000sha256.tdl.function.GetStorageStatistics
import dev.g000sha256.tdl.function.GetStorageStatisticsFast
import dev.g000sha256.tdl.function.GetStory
import dev.g000sha256.tdl.function.GetStoryAvailableReactions
import dev.g000sha256.tdl.function.GetStoryInteractions
import dev.g000sha256.tdl.function.GetStoryNotificationSettingsExceptions
import dev.g000sha256.tdl.function.GetStoryPublicForwards
import dev.g000sha256.tdl.function.GetStoryStatistics
import dev.g000sha256.tdl.function.GetSuggestedFileName
import dev.g000sha256.tdl.function.GetSuggestedStickerSetName
import dev.g000sha256.tdl.function.GetSuitableDiscussionChats
import dev.g000sha256.tdl.function.GetSuitablePersonalChats
import dev.g000sha256.tdl.function.GetSupergroup
import dev.g000sha256.tdl.function.GetSupergroupFullInfo
import dev.g000sha256.tdl.function.GetSupergroupMembers
import dev.g000sha256.tdl.function.GetSupportName
import dev.g000sha256.tdl.function.GetSupportUser
import dev.g000sha256.tdl.function.GetTemporaryPasswordState
import dev.g000sha256.tdl.function.GetTextEntities
import dev.g000sha256.tdl.function.GetThemeParametersJsonString
import dev.g000sha256.tdl.function.GetThemedChatEmojiStatuses
import dev.g000sha256.tdl.function.GetThemedEmojiStatuses
import dev.g000sha256.tdl.function.GetTimeZones
import dev.g000sha256.tdl.function.GetTopChats
import dev.g000sha256.tdl.function.GetTrendingStickerSets
import dev.g000sha256.tdl.function.GetUpgradedGift
import dev.g000sha256.tdl.function.GetUpgradedGiftEmojiStatuses
import dev.g000sha256.tdl.function.GetUpgradedGiftWithdrawalUrl
import dev.g000sha256.tdl.function.GetUser
import dev.g000sha256.tdl.function.GetUserChatBoosts
import dev.g000sha256.tdl.function.GetUserFullInfo
import dev.g000sha256.tdl.function.GetUserLink
import dev.g000sha256.tdl.function.GetUserPrivacySettingRules
import dev.g000sha256.tdl.function.GetUserProfilePhotos
import dev.g000sha256.tdl.function.GetUserSupportInfo
import dev.g000sha256.tdl.function.GetVideoChatAvailableParticipants
import dev.g000sha256.tdl.function.GetVideoChatInviteLink
import dev.g000sha256.tdl.function.GetVideoChatRtmpUrl
import dev.g000sha256.tdl.function.GetVideoChatStreamSegment
import dev.g000sha256.tdl.function.GetVideoChatStreams
import dev.g000sha256.tdl.function.GetWebAppLinkUrl
import dev.g000sha256.tdl.function.GetWebAppPlaceholder
import dev.g000sha256.tdl.function.GetWebAppUrl
import dev.g000sha256.tdl.function.GetWebPageInstantView
import dev.g000sha256.tdl.function.GiftPremiumWithStars
import dev.g000sha256.tdl.function.HideContactCloseBirthdays
import dev.g000sha256.tdl.function.HideSuggestedAction
import dev.g000sha256.tdl.function.ImportContacts
import dev.g000sha256.tdl.function.ImportMessages
import dev.g000sha256.tdl.function.InviteGroupCallParticipant
import dev.g000sha256.tdl.function.InviteVideoChatParticipants
import dev.g000sha256.tdl.function.JoinChat
import dev.g000sha256.tdl.function.JoinChatByInviteLink
import dev.g000sha256.tdl.function.JoinGroupCall
import dev.g000sha256.tdl.function.JoinVideoChat
import dev.g000sha256.tdl.function.LaunchPrepaidGiveaway
import dev.g000sha256.tdl.function.LeaveChat
import dev.g000sha256.tdl.function.LeaveGroupCall
import dev.g000sha256.tdl.function.LoadActiveStories
import dev.g000sha256.tdl.function.LoadChats
import dev.g000sha256.tdl.function.LoadDirectMessagesChatTopics
import dev.g000sha256.tdl.function.LoadGroupCallParticipants
import dev.g000sha256.tdl.function.LoadQuickReplyShortcutMessages
import dev.g000sha256.tdl.function.LoadQuickReplyShortcuts
import dev.g000sha256.tdl.function.LoadSavedMessagesTopics
import dev.g000sha256.tdl.function.LogOut
import dev.g000sha256.tdl.function.OpenBotSimilarBot
import dev.g000sha256.tdl.function.OpenChat
import dev.g000sha256.tdl.function.OpenChatSimilarChat
import dev.g000sha256.tdl.function.OpenMessageContent
import dev.g000sha256.tdl.function.OpenSponsoredChat
import dev.g000sha256.tdl.function.OpenStory
import dev.g000sha256.tdl.function.OpenWebApp
import dev.g000sha256.tdl.function.OptimizeStorage
import dev.g000sha256.tdl.function.ParseMarkdown
import dev.g000sha256.tdl.function.ParseTextEntities
import dev.g000sha256.tdl.function.PinChatMessage
import dev.g000sha256.tdl.function.PingProxy
import dev.g000sha256.tdl.function.PostStory
import dev.g000sha256.tdl.function.PreliminaryUploadFile
import dev.g000sha256.tdl.function.ProcessChatFolderNewChats
import dev.g000sha256.tdl.function.ProcessChatJoinRequest
import dev.g000sha256.tdl.function.ProcessChatJoinRequests
import dev.g000sha256.tdl.function.ProcessPushNotification
import dev.g000sha256.tdl.function.RateSpeechRecognition
import dev.g000sha256.tdl.function.ReadAllChatMentions
import dev.g000sha256.tdl.function.ReadAllChatReactions
import dev.g000sha256.tdl.function.ReadAllDirectMessagesChatTopicReactions
import dev.g000sha256.tdl.function.ReadAllMessageThreadMentions
import dev.g000sha256.tdl.function.ReadAllMessageThreadReactions
import dev.g000sha256.tdl.function.ReadBusinessMessage
import dev.g000sha256.tdl.function.ReadChatList
import dev.g000sha256.tdl.function.ReadFilePart
import dev.g000sha256.tdl.function.ReaddQuickReplyShortcutMessages
import dev.g000sha256.tdl.function.RecognizeSpeech
import dev.g000sha256.tdl.function.RecoverAuthenticationPassword
import dev.g000sha256.tdl.function.RecoverPassword
import dev.g000sha256.tdl.function.RefundStarPayment
import dev.g000sha256.tdl.function.RegisterDevice
import dev.g000sha256.tdl.function.RegisterUser
import dev.g000sha256.tdl.function.RemoveAllFilesFromDownloads
import dev.g000sha256.tdl.function.RemoveBusinessConnectedBotFromChat
import dev.g000sha256.tdl.function.RemoveChatActionBar
import dev.g000sha256.tdl.function.RemoveContacts
import dev.g000sha256.tdl.function.RemoveFavoriteSticker
import dev.g000sha256.tdl.function.RemoveFileFromDownloads
import dev.g000sha256.tdl.function.RemoveInstalledBackground
import dev.g000sha256.tdl.function.RemoveMessageReaction
import dev.g000sha256.tdl.function.RemoveMessageSenderBotVerification
import dev.g000sha256.tdl.function.RemoveNotification
import dev.g000sha256.tdl.function.RemoveNotificationGroup
import dev.g000sha256.tdl.function.RemovePendingPaidMessageReactions
import dev.g000sha256.tdl.function.RemoveProxy
import dev.g000sha256.tdl.function.RemoveRecentHashtag
import dev.g000sha256.tdl.function.RemoveRecentSticker
import dev.g000sha256.tdl.function.RemoveRecentlyFoundChat
import dev.g000sha256.tdl.function.RemoveSavedAnimation
import dev.g000sha256.tdl.function.RemoveSavedNotificationSound
import dev.g000sha256.tdl.function.RemoveSearchedForTag
import dev.g000sha256.tdl.function.RemoveStickerFromSet
import dev.g000sha256.tdl.function.RemoveTopChat
import dev.g000sha256.tdl.function.ReorderActiveUsernames
import dev.g000sha256.tdl.function.ReorderBotActiveUsernames
import dev.g000sha256.tdl.function.ReorderBotMediaPreviews
import dev.g000sha256.tdl.function.ReorderChatFolders
import dev.g000sha256.tdl.function.ReorderInstalledStickerSets
import dev.g000sha256.tdl.function.ReorderQuickReplyShortcuts
import dev.g000sha256.tdl.function.ReorderSupergroupActiveUsernames
import dev.g000sha256.tdl.function.ReplacePrimaryChatInviteLink
import dev.g000sha256.tdl.function.ReplaceStickerInSet
import dev.g000sha256.tdl.function.ReplaceVideoChatRtmpUrl
import dev.g000sha256.tdl.function.ReportAuthenticationCodeMissing
import dev.g000sha256.tdl.function.ReportChat
import dev.g000sha256.tdl.function.ReportChatPhoto
import dev.g000sha256.tdl.function.ReportChatSponsoredMessage
import dev.g000sha256.tdl.function.ReportMessageReactions
import dev.g000sha256.tdl.function.ReportPhoneNumberCodeMissing
import dev.g000sha256.tdl.function.ReportSponsoredChat
import dev.g000sha256.tdl.function.ReportStory
import dev.g000sha256.tdl.function.ReportSupergroupAntiSpamFalsePositive
import dev.g000sha256.tdl.function.ReportSupergroupSpam
import dev.g000sha256.tdl.function.RequestAuthenticationPasswordRecovery
import dev.g000sha256.tdl.function.RequestPasswordRecovery
import dev.g000sha256.tdl.function.RequestQrCodeAuthentication
import dev.g000sha256.tdl.function.ResendAuthenticationCode
import dev.g000sha256.tdl.function.ResendEmailAddressVerificationCode
import dev.g000sha256.tdl.function.ResendLoginEmailAddressCode
import dev.g000sha256.tdl.function.ResendMessages
import dev.g000sha256.tdl.function.ResendPhoneNumberCode
import dev.g000sha256.tdl.function.ResendRecoveryEmailAddressCode
import dev.g000sha256.tdl.function.ResetAllNotificationSettings
import dev.g000sha256.tdl.function.ResetAuthenticationEmailAddress
import dev.g000sha256.tdl.function.ResetInstalledBackgrounds
import dev.g000sha256.tdl.function.ResetNetworkStatistics
import dev.g000sha256.tdl.function.ResetPassword
import dev.g000sha256.tdl.function.ReuseStarSubscription
import dev.g000sha256.tdl.function.RevokeChatInviteLink
import dev.g000sha256.tdl.function.RevokeGroupCallInviteLink
import dev.g000sha256.tdl.function.SaveApplicationLogEvent
import dev.g000sha256.tdl.function.SavePreparedInlineMessage
import dev.g000sha256.tdl.function.SearchAffiliatePrograms
import dev.g000sha256.tdl.function.SearchBackground
import dev.g000sha256.tdl.function.SearchCallMessages
import dev.g000sha256.tdl.function.SearchChatAffiliateProgram
import dev.g000sha256.tdl.function.SearchChatMembers
import dev.g000sha256.tdl.function.SearchChatMessages
import dev.g000sha256.tdl.function.SearchChatRecentLocationMessages
import dev.g000sha256.tdl.function.SearchChats
import dev.g000sha256.tdl.function.SearchChatsOnServer
import dev.g000sha256.tdl.function.SearchContacts
import dev.g000sha256.tdl.function.SearchEmojis
import dev.g000sha256.tdl.function.SearchFileDownloads
import dev.g000sha256.tdl.function.SearchGiftsForResale
import dev.g000sha256.tdl.function.SearchHashtags
import dev.g000sha256.tdl.function.SearchInstalledStickerSets
import dev.g000sha256.tdl.function.SearchMessages
import dev.g000sha256.tdl.function.SearchOutgoingDocumentMessages
import dev.g000sha256.tdl.function.SearchPublicChat
import dev.g000sha256.tdl.function.SearchPublicChats
import dev.g000sha256.tdl.function.SearchPublicMessagesByTag
import dev.g000sha256.tdl.function.SearchPublicStoriesByLocation
import dev.g000sha256.tdl.function.SearchPublicStoriesByTag
import dev.g000sha256.tdl.function.SearchPublicStoriesByVenue
import dev.g000sha256.tdl.function.SearchQuote
import dev.g000sha256.tdl.function.SearchRecentlyFoundChats
import dev.g000sha256.tdl.function.SearchSavedMessages
import dev.g000sha256.tdl.function.SearchSecretMessages
import dev.g000sha256.tdl.function.SearchStickerSet
import dev.g000sha256.tdl.function.SearchStickerSets
import dev.g000sha256.tdl.function.SearchStickers
import dev.g000sha256.tdl.function.SearchStringsByPrefix
import dev.g000sha256.tdl.function.SearchUserByPhoneNumber
import dev.g000sha256.tdl.function.SearchUserByToken
import dev.g000sha256.tdl.function.SearchWebApp
import dev.g000sha256.tdl.function.SellGift
import dev.g000sha256.tdl.function.SendAuthenticationFirebaseSms
import dev.g000sha256.tdl.function.SendBotStartMessage
import dev.g000sha256.tdl.function.SendBusinessMessage
import dev.g000sha256.tdl.function.SendBusinessMessageAlbum
import dev.g000sha256.tdl.function.SendCallDebugInformation
import dev.g000sha256.tdl.function.SendCallLog
import dev.g000sha256.tdl.function.SendCallRating
import dev.g000sha256.tdl.function.SendCallSignalingData
import dev.g000sha256.tdl.function.SendChatAction
import dev.g000sha256.tdl.function.SendCustomRequest
import dev.g000sha256.tdl.function.SendEmailAddressVerificationCode
import dev.g000sha256.tdl.function.SendGift
import dev.g000sha256.tdl.function.SendInlineQueryResultMessage
import dev.g000sha256.tdl.function.SendMessage
import dev.g000sha256.tdl.function.SendMessageAlbum
import dev.g000sha256.tdl.function.SendPassportAuthorizationForm
import dev.g000sha256.tdl.function.SendPaymentForm
import dev.g000sha256.tdl.function.SendPhoneNumberCode
import dev.g000sha256.tdl.function.SendPhoneNumberFirebaseSms
import dev.g000sha256.tdl.function.SendQuickReplyShortcutMessages
import dev.g000sha256.tdl.function.SendResoldGift
import dev.g000sha256.tdl.function.SendWebAppCustomRequest
import dev.g000sha256.tdl.function.SendWebAppData
import dev.g000sha256.tdl.function.SetAccentColor
import dev.g000sha256.tdl.function.SetAccountTtl
import dev.g000sha256.tdl.function.SetAlarm
import dev.g000sha256.tdl.function.SetApplicationVerificationToken
import dev.g000sha256.tdl.function.SetArchiveChatListSettings
import dev.g000sha256.tdl.function.SetAuthenticationEmailAddress
import dev.g000sha256.tdl.function.SetAuthenticationPhoneNumber
import dev.g000sha256.tdl.function.SetAuthenticationPremiumPurchaseTransaction
import dev.g000sha256.tdl.function.SetAutoDownloadSettings
import dev.g000sha256.tdl.function.SetAutosaveSettings
import dev.g000sha256.tdl.function.SetBio
import dev.g000sha256.tdl.function.SetBirthdate
import dev.g000sha256.tdl.function.SetBotInfoDescription
import dev.g000sha256.tdl.function.SetBotInfoShortDescription
import dev.g000sha256.tdl.function.SetBotName
import dev.g000sha256.tdl.function.SetBotProfilePhoto
import dev.g000sha256.tdl.function.SetBotUpdatesStatus
import dev.g000sha256.tdl.function.SetBusinessAccountBio
import dev.g000sha256.tdl.function.SetBusinessAccountGiftSettings
import dev.g000sha256.tdl.function.SetBusinessAccountName
import dev.g000sha256.tdl.function.SetBusinessAccountProfilePhoto
import dev.g000sha256.tdl.function.SetBusinessAccountUsername
import dev.g000sha256.tdl.function.SetBusinessAwayMessageSettings
import dev.g000sha256.tdl.function.SetBusinessConnectedBot
import dev.g000sha256.tdl.function.SetBusinessGreetingMessageSettings
import dev.g000sha256.tdl.function.SetBusinessLocation
import dev.g000sha256.tdl.function.SetBusinessMessageIsPinned
import dev.g000sha256.tdl.function.SetBusinessOpeningHours
import dev.g000sha256.tdl.function.SetBusinessStartPage
import dev.g000sha256.tdl.function.SetChatAccentColor
import dev.g000sha256.tdl.function.SetChatActiveStoriesList
import dev.g000sha256.tdl.function.SetChatAffiliateProgram
import dev.g000sha256.tdl.function.SetChatAvailableReactions
import dev.g000sha256.tdl.function.SetChatBackground
import dev.g000sha256.tdl.function.SetChatClientData
import dev.g000sha256.tdl.function.SetChatDescription
import dev.g000sha256.tdl.function.SetChatDirectMessagesGroup
import dev.g000sha256.tdl.function.SetChatDiscussionGroup
import dev.g000sha256.tdl.function.SetChatDraftMessage
import dev.g000sha256.tdl.function.SetChatEmojiStatus
import dev.g000sha256.tdl.function.SetChatLocation
import dev.g000sha256.tdl.function.SetChatMemberStatus
import dev.g000sha256.tdl.function.SetChatMessageAutoDeleteTime
import dev.g000sha256.tdl.function.SetChatMessageSender
import dev.g000sha256.tdl.function.SetChatNotificationSettings
import dev.g000sha256.tdl.function.SetChatPaidMessageStarCount
import dev.g000sha256.tdl.function.SetChatPermissions
import dev.g000sha256.tdl.function.SetChatPhoto
import dev.g000sha256.tdl.function.SetChatPinnedStories
import dev.g000sha256.tdl.function.SetChatProfileAccentColor
import dev.g000sha256.tdl.function.SetChatSlowModeDelay
import dev.g000sha256.tdl.function.SetChatTheme
import dev.g000sha256.tdl.function.SetChatTitle
import dev.g000sha256.tdl.function.SetCloseFriends
import dev.g000sha256.tdl.function.SetCommands
import dev.g000sha256.tdl.function.SetCustomEmojiStickerSetThumbnail
import dev.g000sha256.tdl.function.SetCustomLanguagePack
import dev.g000sha256.tdl.function.SetCustomLanguagePackString
import dev.g000sha256.tdl.function.SetDatabaseEncryptionKey
import dev.g000sha256.tdl.function.SetDefaultBackground
import dev.g000sha256.tdl.function.SetDefaultChannelAdministratorRights
import dev.g000sha256.tdl.function.SetDefaultGroupAdministratorRights
import dev.g000sha256.tdl.function.SetDefaultMessageAutoDeleteTime
import dev.g000sha256.tdl.function.SetDefaultReactionType
import dev.g000sha256.tdl.function.SetDirectMessagesChatTopicDraftMessage
import dev.g000sha256.tdl.function.SetDirectMessagesChatTopicIsMarkedAsUnread
import dev.g000sha256.tdl.function.SetEmojiStatus
import dev.g000sha256.tdl.function.SetFileGenerationProgress
import dev.g000sha256.tdl.function.SetForumTopicNotificationSettings
import dev.g000sha256.tdl.function.SetGameScore
import dev.g000sha256.tdl.function.SetGiftResalePrice
import dev.g000sha256.tdl.function.SetGiftSettings
import dev.g000sha256.tdl.function.SetGroupCallParticipantIsSpeaking
import dev.g000sha256.tdl.function.SetGroupCallParticipantVolumeLevel
import dev.g000sha256.tdl.function.SetInactiveSessionTtl
import dev.g000sha256.tdl.function.SetInlineGameScore
import dev.g000sha256.tdl.function.SetLogStream
import dev.g000sha256.tdl.function.SetLogTagVerbosityLevel
import dev.g000sha256.tdl.function.SetLogVerbosityLevel
import dev.g000sha256.tdl.function.SetLoginEmailAddress
import dev.g000sha256.tdl.function.SetMenuButton
import dev.g000sha256.tdl.function.SetMessageFactCheck
import dev.g000sha256.tdl.function.SetMessageReactions
import dev.g000sha256.tdl.function.SetMessageSenderBlockList
import dev.g000sha256.tdl.function.SetMessageSenderBotVerification
import dev.g000sha256.tdl.function.SetName
import dev.g000sha256.tdl.function.SetNetworkType
import dev.g000sha256.tdl.function.SetNewChatPrivacySettings
import dev.g000sha256.tdl.function.SetOption
import dev.g000sha256.tdl.function.SetPaidMessageReactionType
import dev.g000sha256.tdl.function.SetPassportElement
import dev.g000sha256.tdl.function.SetPassportElementErrors
import dev.g000sha256.tdl.function.SetPassword
import dev.g000sha256.tdl.function.SetPersonalChat
import dev.g000sha256.tdl.function.SetPinnedChats
import dev.g000sha256.tdl.function.SetPinnedForumTopics
import dev.g000sha256.tdl.function.SetPinnedGifts
import dev.g000sha256.tdl.function.SetPinnedSavedMessagesTopics
import dev.g000sha256.tdl.function.SetPollAnswer
import dev.g000sha256.tdl.function.SetProfileAccentColor
import dev.g000sha256.tdl.function.SetProfilePhoto
import dev.g000sha256.tdl.function.SetQuickReplyShortcutName
import dev.g000sha256.tdl.function.SetReactionNotificationSettings
import dev.g000sha256.tdl.function.SetReadDatePrivacySettings
import dev.g000sha256.tdl.function.SetRecoveryEmailAddress
import dev.g000sha256.tdl.function.SetSavedMessagesTagLabel
import dev.g000sha256.tdl.function.SetScopeNotificationSettings
import dev.g000sha256.tdl.function.SetStickerEmojis
import dev.g000sha256.tdl.function.SetStickerKeywords
import dev.g000sha256.tdl.function.SetStickerMaskPosition
import dev.g000sha256.tdl.function.SetStickerPositionInSet
import dev.g000sha256.tdl.function.SetStickerSetThumbnail
import dev.g000sha256.tdl.function.SetStickerSetTitle
import dev.g000sha256.tdl.function.SetStoryPrivacySettings
import dev.g000sha256.tdl.function.SetStoryReaction
import dev.g000sha256.tdl.function.SetSupergroupCustomEmojiStickerSet
import dev.g000sha256.tdl.function.SetSupergroupStickerSet
import dev.g000sha256.tdl.function.SetSupergroupUnrestrictBoostCount
import dev.g000sha256.tdl.function.SetSupergroupUsername
import dev.g000sha256.tdl.function.SetTdlibParameters
import dev.g000sha256.tdl.function.SetUserEmojiStatus
import dev.g000sha256.tdl.function.SetUserPersonalProfilePhoto
import dev.g000sha256.tdl.function.SetUserPrivacySettingRules
import dev.g000sha256.tdl.function.SetUserSupportInfo
import dev.g000sha256.tdl.function.SetUsername
import dev.g000sha256.tdl.function.SetVideoChatDefaultParticipant
import dev.g000sha256.tdl.function.SetVideoChatTitle
import dev.g000sha256.tdl.function.ShareChatWithBot
import dev.g000sha256.tdl.function.SharePhoneNumber
import dev.g000sha256.tdl.function.ShareUsersWithBot
import dev.g000sha256.tdl.function.StartGroupCallRecording
import dev.g000sha256.tdl.function.StartGroupCallScreenSharing
import dev.g000sha256.tdl.function.StartScheduledVideoChat
import dev.g000sha256.tdl.function.StopBusinessPoll
import dev.g000sha256.tdl.function.StopPoll
import dev.g000sha256.tdl.function.SuggestUserProfilePhoto
import dev.g000sha256.tdl.function.SynchronizeLanguagePack
import dev.g000sha256.tdl.function.TerminateAllOtherSessions
import dev.g000sha256.tdl.function.TerminateSession
import dev.g000sha256.tdl.function.TestCallBytes
import dev.g000sha256.tdl.function.TestCallEmpty
import dev.g000sha256.tdl.function.TestCallString
import dev.g000sha256.tdl.function.TestCallVectorInt
import dev.g000sha256.tdl.function.TestCallVectorIntObject
import dev.g000sha256.tdl.function.TestCallVectorString
import dev.g000sha256.tdl.function.TestCallVectorStringObject
import dev.g000sha256.tdl.function.TestGetDifference
import dev.g000sha256.tdl.function.TestNetwork
import dev.g000sha256.tdl.function.TestProxy
import dev.g000sha256.tdl.function.TestReturnError
import dev.g000sha256.tdl.function.TestSquareInt
import dev.g000sha256.tdl.function.TestUseUpdate
import dev.g000sha256.tdl.function.ToggleAllDownloadsArePaused
import dev.g000sha256.tdl.function.ToggleBotCanManageEmojiStatus
import dev.g000sha256.tdl.function.ToggleBotIsAddedToAttachmentMenu
import dev.g000sha256.tdl.function.ToggleBotUsernameIsActive
import dev.g000sha256.tdl.function.ToggleBusinessConnectedBotChatIsPaused
import dev.g000sha256.tdl.function.ToggleChatDefaultDisableNotification
import dev.g000sha256.tdl.function.ToggleChatFolderTags
import dev.g000sha256.tdl.function.ToggleChatGiftNotifications
import dev.g000sha256.tdl.function.ToggleChatHasProtectedContent
import dev.g000sha256.tdl.function.ToggleChatIsMarkedAsUnread
import dev.g000sha256.tdl.function.ToggleChatIsPinned
import dev.g000sha256.tdl.function.ToggleChatIsTranslatable
import dev.g000sha256.tdl.function.ToggleChatViewAsTopics
import dev.g000sha256.tdl.function.ToggleDownloadIsPaused
import dev.g000sha256.tdl.function.ToggleForumTopicIsClosed
import dev.g000sha256.tdl.function.ToggleForumTopicIsPinned
import dev.g000sha256.tdl.function.ToggleGeneralForumTopicIsHidden
import dev.g000sha256.tdl.function.ToggleGiftIsSaved
import dev.g000sha256.tdl.function.ToggleGroupCallIsMyVideoEnabled
import dev.g000sha256.tdl.function.ToggleGroupCallIsMyVideoPaused
import dev.g000sha256.tdl.function.ToggleGroupCallParticipantIsHandRaised
import dev.g000sha256.tdl.function.ToggleGroupCallParticipantIsMuted
import dev.g000sha256.tdl.function.ToggleGroupCallScreenSharingIsPaused
import dev.g000sha256.tdl.function.ToggleHasSponsoredMessagesEnabled
import dev.g000sha256.tdl.function.ToggleSavedMessagesTopicIsPinned
import dev.g000sha256.tdl.function.ToggleSessionCanAcceptCalls
import dev.g000sha256.tdl.function.ToggleSessionCanAcceptSecretChats
import dev.g000sha256.tdl.function.ToggleStoryIsPostedToChatPage
import dev.g000sha256.tdl.function.ToggleSupergroupCanHaveSponsoredMessages
import dev.g000sha256.tdl.function.ToggleSupergroupHasAggressiveAntiSpamEnabled
import dev.g000sha256.tdl.function.ToggleSupergroupHasAutomaticTranslation
import dev.g000sha256.tdl.function.ToggleSupergroupHasHiddenMembers
import dev.g000sha256.tdl.function.ToggleSupergroupIsAllHistoryAvailable
import dev.g000sha256.tdl.function.ToggleSupergroupIsBroadcastGroup
import dev.g000sha256.tdl.function.ToggleSupergroupIsForum
import dev.g000sha256.tdl.function.ToggleSupergroupJoinByRequest
import dev.g000sha256.tdl.function.ToggleSupergroupJoinToSendMessages
import dev.g000sha256.tdl.function.ToggleSupergroupSignMessages
import dev.g000sha256.tdl.function.ToggleSupergroupUsernameIsActive
import dev.g000sha256.tdl.function.ToggleUsernameIsActive
import dev.g000sha256.tdl.function.ToggleVideoChatEnabledStartNotification
import dev.g000sha256.tdl.function.ToggleVideoChatMuteNewParticipants
import dev.g000sha256.tdl.function.TransferBusinessAccountStars
import dev.g000sha256.tdl.function.TransferChatOwnership
import dev.g000sha256.tdl.function.TransferGift
import dev.g000sha256.tdl.function.TranslateMessageText
import dev.g000sha256.tdl.function.TranslateText
import dev.g000sha256.tdl.function.UnpinAllChatMessages
import dev.g000sha256.tdl.function.UnpinAllDirectMessagesChatTopicMessages
import dev.g000sha256.tdl.function.UnpinAllMessageThreadMessages
import dev.g000sha256.tdl.function.UnpinChatMessage
import dev.g000sha256.tdl.function.UpgradeBasicGroupChatToSupergroupChat
import dev.g000sha256.tdl.function.UpgradeGift
import dev.g000sha256.tdl.function.UploadStickerFile
import dev.g000sha256.tdl.function.ValidateOrderInfo
import dev.g000sha256.tdl.function.ViewMessages
import dev.g000sha256.tdl.function.ViewPremiumFeature
import dev.g000sha256.tdl.function.ViewSponsoredChat
import dev.g000sha256.tdl.function.ViewTrendingStickerSets
import dev.g000sha256.tdl.function.WriteGeneratedFilePart
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
import kotlinx.coroutines.flow.filterIsInstance

internal class TdlClientImpl(
    private val repository: TdlRepository,
) : TdlClient() {
    override val allUpdates: Flow<Update>
        get() = repository.updates

    override val authorizationStateUpdates: Flow<UpdateAuthorizationState>
        get() = repository.updates.filterIsInstance()

    override val newMessageUpdates: Flow<UpdateNewMessage>
        get() = repository.updates.filterIsInstance()

    override val messageSendAcknowledgedUpdates: Flow<UpdateMessageSendAcknowledged>
        get() = repository.updates.filterIsInstance()

    override val messageSendSucceededUpdates: Flow<UpdateMessageSendSucceeded>
        get() = repository.updates.filterIsInstance()

    override val messageSendFailedUpdates: Flow<UpdateMessageSendFailed>
        get() = repository.updates.filterIsInstance()

    override val messageContentUpdates: Flow<UpdateMessageContent>
        get() = repository.updates.filterIsInstance()

    override val messageEditedUpdates: Flow<UpdateMessageEdited>
        get() = repository.updates.filterIsInstance()

    override val messageIsPinnedUpdates: Flow<UpdateMessageIsPinned>
        get() = repository.updates.filterIsInstance()

    override val messageInteractionInfoUpdates: Flow<UpdateMessageInteractionInfo>
        get() = repository.updates.filterIsInstance()

    override val messageContentOpenedUpdates: Flow<UpdateMessageContentOpened>
        get() = repository.updates.filterIsInstance()

    override val messageMentionReadUpdates: Flow<UpdateMessageMentionRead>
        get() = repository.updates.filterIsInstance()

    override val messageUnreadReactionsUpdates: Flow<UpdateMessageUnreadReactions>
        get() = repository.updates.filterIsInstance()

    override val messageFactCheckUpdates: Flow<UpdateMessageFactCheck>
        get() = repository.updates.filterIsInstance()

    override val messageLiveLocationViewedUpdates: Flow<UpdateMessageLiveLocationViewed>
        get() = repository.updates.filterIsInstance()

    override val videoPublishedUpdates: Flow<UpdateVideoPublished>
        get() = repository.updates.filterIsInstance()

    override val newChatUpdates: Flow<UpdateNewChat>
        get() = repository.updates.filterIsInstance()

    override val chatTitleUpdates: Flow<UpdateChatTitle>
        get() = repository.updates.filterIsInstance()

    override val chatPhotoUpdates: Flow<UpdateChatPhoto>
        get() = repository.updates.filterIsInstance()

    override val chatAccentColorsUpdates: Flow<UpdateChatAccentColors>
        get() = repository.updates.filterIsInstance()

    override val chatPermissionsUpdates: Flow<UpdateChatPermissions>
        get() = repository.updates.filterIsInstance()

    override val chatLastMessageUpdates: Flow<UpdateChatLastMessage>
        get() = repository.updates.filterIsInstance()

    override val chatPositionUpdates: Flow<UpdateChatPosition>
        get() = repository.updates.filterIsInstance()

    override val chatAddedToListUpdates: Flow<UpdateChatAddedToList>
        get() = repository.updates.filterIsInstance()

    override val chatRemovedFromListUpdates: Flow<UpdateChatRemovedFromList>
        get() = repository.updates.filterIsInstance()

    override val chatReadInboxUpdates: Flow<UpdateChatReadInbox>
        get() = repository.updates.filterIsInstance()

    override val chatReadOutboxUpdates: Flow<UpdateChatReadOutbox>
        get() = repository.updates.filterIsInstance()

    override val chatActionBarUpdates: Flow<UpdateChatActionBar>
        get() = repository.updates.filterIsInstance()

    override val chatBusinessBotManageBarUpdates: Flow<UpdateChatBusinessBotManageBar>
        get() = repository.updates.filterIsInstance()

    override val chatAvailableReactionsUpdates: Flow<UpdateChatAvailableReactions>
        get() = repository.updates.filterIsInstance()

    override val chatDraftMessageUpdates: Flow<UpdateChatDraftMessage>
        get() = repository.updates.filterIsInstance()

    override val chatEmojiStatusUpdates: Flow<UpdateChatEmojiStatus>
        get() = repository.updates.filterIsInstance()

    override val chatMessageSenderUpdates: Flow<UpdateChatMessageSender>
        get() = repository.updates.filterIsInstance()

    override val chatMessageAutoDeleteTimeUpdates: Flow<UpdateChatMessageAutoDeleteTime>
        get() = repository.updates.filterIsInstance()

    override val chatNotificationSettingsUpdates: Flow<UpdateChatNotificationSettings>
        get() = repository.updates.filterIsInstance()

    override val chatPendingJoinRequestsUpdates: Flow<UpdateChatPendingJoinRequests>
        get() = repository.updates.filterIsInstance()

    override val chatReplyMarkupUpdates: Flow<UpdateChatReplyMarkup>
        get() = repository.updates.filterIsInstance()

    override val chatBackgroundUpdates: Flow<UpdateChatBackground>
        get() = repository.updates.filterIsInstance()

    override val chatThemeUpdates: Flow<UpdateChatTheme>
        get() = repository.updates.filterIsInstance()

    override val chatUnreadMentionCountUpdates: Flow<UpdateChatUnreadMentionCount>
        get() = repository.updates.filterIsInstance()

    override val chatUnreadReactionCountUpdates: Flow<UpdateChatUnreadReactionCount>
        get() = repository.updates.filterIsInstance()

    override val chatVideoChatUpdates: Flow<UpdateChatVideoChat>
        get() = repository.updates.filterIsInstance()

    override val chatDefaultDisableNotificationUpdates: Flow<UpdateChatDefaultDisableNotification>
        get() = repository.updates.filterIsInstance()

    override val chatHasProtectedContentUpdates: Flow<UpdateChatHasProtectedContent>
        get() = repository.updates.filterIsInstance()

    override val chatIsTranslatableUpdates: Flow<UpdateChatIsTranslatable>
        get() = repository.updates.filterIsInstance()

    override val chatIsMarkedAsUnreadUpdates: Flow<UpdateChatIsMarkedAsUnread>
        get() = repository.updates.filterIsInstance()

    override val chatViewAsTopicsUpdates: Flow<UpdateChatViewAsTopics>
        get() = repository.updates.filterIsInstance()

    override val chatBlockListUpdates: Flow<UpdateChatBlockList>
        get() = repository.updates.filterIsInstance()

    override val chatHasScheduledMessagesUpdates: Flow<UpdateChatHasScheduledMessages>
        get() = repository.updates.filterIsInstance()

    override val chatFoldersUpdates: Flow<UpdateChatFolders>
        get() = repository.updates.filterIsInstance()

    override val chatOnlineMemberCountUpdates: Flow<UpdateChatOnlineMemberCount>
        get() = repository.updates.filterIsInstance()

    override val savedMessagesTopicUpdates: Flow<UpdateSavedMessagesTopic>
        get() = repository.updates.filterIsInstance()

    override val savedMessagesTopicCountUpdates: Flow<UpdateSavedMessagesTopicCount>
        get() = repository.updates.filterIsInstance()

    override val directMessagesChatTopicUpdates: Flow<UpdateDirectMessagesChatTopic>
        get() = repository.updates.filterIsInstance()

    override val topicMessageCountUpdates: Flow<UpdateTopicMessageCount>
        get() = repository.updates.filterIsInstance()

    override val quickReplyShortcutUpdates: Flow<UpdateQuickReplyShortcut>
        get() = repository.updates.filterIsInstance()

    override val quickReplyShortcutDeletedUpdates: Flow<UpdateQuickReplyShortcutDeleted>
        get() = repository.updates.filterIsInstance()

    override val quickReplyShortcutsUpdates: Flow<UpdateQuickReplyShortcuts>
        get() = repository.updates.filterIsInstance()

    override val quickReplyShortcutMessagesUpdates: Flow<UpdateQuickReplyShortcutMessages>
        get() = repository.updates.filterIsInstance()

    override val forumTopicInfoUpdates: Flow<UpdateForumTopicInfo>
        get() = repository.updates.filterIsInstance()

    override val forumTopicUpdates: Flow<UpdateForumTopic>
        get() = repository.updates.filterIsInstance()

    override val scopeNotificationSettingsUpdates: Flow<UpdateScopeNotificationSettings>
        get() = repository.updates.filterIsInstance()

    override val reactionNotificationSettingsUpdates: Flow<UpdateReactionNotificationSettings>
        get() = repository.updates.filterIsInstance()

    override val notificationUpdates: Flow<UpdateNotification>
        get() = repository.updates.filterIsInstance()

    override val notificationGroupUpdates: Flow<UpdateNotificationGroup>
        get() = repository.updates.filterIsInstance()

    override val activeNotificationsUpdates: Flow<UpdateActiveNotifications>
        get() = repository.updates.filterIsInstance()

    override val havePendingNotificationsUpdates: Flow<UpdateHavePendingNotifications>
        get() = repository.updates.filterIsInstance()

    override val deleteMessagesUpdates: Flow<UpdateDeleteMessages>
        get() = repository.updates.filterIsInstance()

    override val chatActionUpdates: Flow<UpdateChatAction>
        get() = repository.updates.filterIsInstance()

    override val userStatusUpdates: Flow<UpdateUserStatus>
        get() = repository.updates.filterIsInstance()

    override val userUpdates: Flow<UpdateUser>
        get() = repository.updates.filterIsInstance()

    override val basicGroupUpdates: Flow<UpdateBasicGroup>
        get() = repository.updates.filterIsInstance()

    override val supergroupUpdates: Flow<UpdateSupergroup>
        get() = repository.updates.filterIsInstance()

    override val secretChatUpdates: Flow<UpdateSecretChat>
        get() = repository.updates.filterIsInstance()

    override val userFullInfoUpdates: Flow<UpdateUserFullInfo>
        get() = repository.updates.filterIsInstance()

    override val basicGroupFullInfoUpdates: Flow<UpdateBasicGroupFullInfo>
        get() = repository.updates.filterIsInstance()

    override val supergroupFullInfoUpdates: Flow<UpdateSupergroupFullInfo>
        get() = repository.updates.filterIsInstance()

    override val serviceNotificationUpdates: Flow<UpdateServiceNotification>
        get() = repository.updates.filterIsInstance()

    override val fileUpdates: Flow<UpdateFile>
        get() = repository.updates.filterIsInstance()

    override val fileGenerationStartUpdates: Flow<UpdateFileGenerationStart>
        get() = repository.updates.filterIsInstance()

    override val fileGenerationStopUpdates: Flow<UpdateFileGenerationStop>
        get() = repository.updates.filterIsInstance()

    override val fileDownloadsUpdates: Flow<UpdateFileDownloads>
        get() = repository.updates.filterIsInstance()

    override val fileAddedToDownloadsUpdates: Flow<UpdateFileAddedToDownloads>
        get() = repository.updates.filterIsInstance()

    override val fileDownloadUpdates: Flow<UpdateFileDownload>
        get() = repository.updates.filterIsInstance()

    override val fileRemovedFromDownloadsUpdates: Flow<UpdateFileRemovedFromDownloads>
        get() = repository.updates.filterIsInstance()

    override val applicationVerificationRequiredUpdates: Flow<UpdateApplicationVerificationRequired>
        get() = repository.updates.filterIsInstance()

    override val applicationRecaptchaVerificationRequiredUpdates:
            Flow<UpdateApplicationRecaptchaVerificationRequired>
        get() = repository.updates.filterIsInstance()

    override val callUpdates: Flow<UpdateCall>
        get() = repository.updates.filterIsInstance()

    override val groupCallUpdates: Flow<UpdateGroupCall>
        get() = repository.updates.filterIsInstance()

    override val groupCallParticipantUpdates: Flow<UpdateGroupCallParticipant>
        get() = repository.updates.filterIsInstance()

    override val groupCallParticipantsUpdates: Flow<UpdateGroupCallParticipants>
        get() = repository.updates.filterIsInstance()

    override val groupCallVerificationStateUpdates: Flow<UpdateGroupCallVerificationState>
        get() = repository.updates.filterIsInstance()

    override val newCallSignalingDataUpdates: Flow<UpdateNewCallSignalingData>
        get() = repository.updates.filterIsInstance()

    override val userPrivacySettingRulesUpdates: Flow<UpdateUserPrivacySettingRules>
        get() = repository.updates.filterIsInstance()

    override val unreadMessageCountUpdates: Flow<UpdateUnreadMessageCount>
        get() = repository.updates.filterIsInstance()

    override val unreadChatCountUpdates: Flow<UpdateUnreadChatCount>
        get() = repository.updates.filterIsInstance()

    override val storyUpdates: Flow<UpdateStory>
        get() = repository.updates.filterIsInstance()

    override val storyDeletedUpdates: Flow<UpdateStoryDeleted>
        get() = repository.updates.filterIsInstance()

    override val storyPostSucceededUpdates: Flow<UpdateStoryPostSucceeded>
        get() = repository.updates.filterIsInstance()

    override val storyPostFailedUpdates: Flow<UpdateStoryPostFailed>
        get() = repository.updates.filterIsInstance()

    override val chatActiveStoriesUpdates: Flow<UpdateChatActiveStories>
        get() = repository.updates.filterIsInstance()

    override val storyListChatCountUpdates: Flow<UpdateStoryListChatCount>
        get() = repository.updates.filterIsInstance()

    override val storyStealthModeUpdates: Flow<UpdateStoryStealthMode>
        get() = repository.updates.filterIsInstance()

    override val optionUpdates: Flow<UpdateOption>
        get() = repository.updates.filterIsInstance()

    override val stickerSetUpdates: Flow<UpdateStickerSet>
        get() = repository.updates.filterIsInstance()

    override val installedStickerSetsUpdates: Flow<UpdateInstalledStickerSets>
        get() = repository.updates.filterIsInstance()

    override val trendingStickerSetsUpdates: Flow<UpdateTrendingStickerSets>
        get() = repository.updates.filterIsInstance()

    override val recentStickersUpdates: Flow<UpdateRecentStickers>
        get() = repository.updates.filterIsInstance()

    override val favoriteStickersUpdates: Flow<UpdateFavoriteStickers>
        get() = repository.updates.filterIsInstance()

    override val savedAnimationsUpdates: Flow<UpdateSavedAnimations>
        get() = repository.updates.filterIsInstance()

    override val savedNotificationSoundsUpdates: Flow<UpdateSavedNotificationSounds>
        get() = repository.updates.filterIsInstance()

    override val defaultBackgroundUpdates: Flow<UpdateDefaultBackground>
        get() = repository.updates.filterIsInstance()

    override val chatThemesUpdates: Flow<UpdateChatThemes>
        get() = repository.updates.filterIsInstance()

    override val accentColorsUpdates: Flow<UpdateAccentColors>
        get() = repository.updates.filterIsInstance()

    override val profileAccentColorsUpdates: Flow<UpdateProfileAccentColors>
        get() = repository.updates.filterIsInstance()

    override val languagePackStringsUpdates: Flow<UpdateLanguagePackStrings>
        get() = repository.updates.filterIsInstance()

    override val connectionStateUpdates: Flow<UpdateConnectionState>
        get() = repository.updates.filterIsInstance()

    override val freezeStateUpdates: Flow<UpdateFreezeState>
        get() = repository.updates.filterIsInstance()

    override val termsOfServiceUpdates: Flow<UpdateTermsOfService>
        get() = repository.updates.filterIsInstance()

    override val unconfirmedSessionUpdates: Flow<UpdateUnconfirmedSession>
        get() = repository.updates.filterIsInstance()

    override val attachmentMenuBotsUpdates: Flow<UpdateAttachmentMenuBots>
        get() = repository.updates.filterIsInstance()

    override val webAppMessageSentUpdates: Flow<UpdateWebAppMessageSent>
        get() = repository.updates.filterIsInstance()

    override val activeEmojiReactionsUpdates: Flow<UpdateActiveEmojiReactions>
        get() = repository.updates.filterIsInstance()

    override val availableMessageEffectsUpdates: Flow<UpdateAvailableMessageEffects>
        get() = repository.updates.filterIsInstance()

    override val defaultReactionTypeUpdates: Flow<UpdateDefaultReactionType>
        get() = repository.updates.filterIsInstance()

    override val defaultPaidReactionTypeUpdates: Flow<UpdateDefaultPaidReactionType>
        get() = repository.updates.filterIsInstance()

    override val savedMessagesTagsUpdates: Flow<UpdateSavedMessagesTags>
        get() = repository.updates.filterIsInstance()

    override val activeLiveLocationMessagesUpdates: Flow<UpdateActiveLiveLocationMessages>
        get() = repository.updates.filterIsInstance()

    override val ownedStarCountUpdates: Flow<UpdateOwnedStarCount>
        get() = repository.updates.filterIsInstance()

    override val chatRevenueAmountUpdates: Flow<UpdateChatRevenueAmount>
        get() = repository.updates.filterIsInstance()

    override val starRevenueStatusUpdates: Flow<UpdateStarRevenueStatus>
        get() = repository.updates.filterIsInstance()

    override val speechRecognitionTrialUpdates: Flow<UpdateSpeechRecognitionTrial>
        get() = repository.updates.filterIsInstance()

    override val diceEmojisUpdates: Flow<UpdateDiceEmojis>
        get() = repository.updates.filterIsInstance()

    override val animatedEmojiMessageClickedUpdates: Flow<UpdateAnimatedEmojiMessageClicked>
        get() = repository.updates.filterIsInstance()

    override val animationSearchParametersUpdates: Flow<UpdateAnimationSearchParameters>
        get() = repository.updates.filterIsInstance()

    override val suggestedActionsUpdates: Flow<UpdateSuggestedActions>
        get() = repository.updates.filterIsInstance()

    override val speedLimitNotificationUpdates: Flow<UpdateSpeedLimitNotification>
        get() = repository.updates.filterIsInstance()

    override val contactCloseBirthdaysUpdates: Flow<UpdateContactCloseBirthdays>
        get() = repository.updates.filterIsInstance()

    override val autosaveSettingsUpdates: Flow<UpdateAutosaveSettings>
        get() = repository.updates.filterIsInstance()

    override val businessConnectionUpdates: Flow<UpdateBusinessConnection>
        get() = repository.updates.filterIsInstance()

    override val newBusinessMessageUpdates: Flow<UpdateNewBusinessMessage>
        get() = repository.updates.filterIsInstance()

    override val businessMessageEditedUpdates: Flow<UpdateBusinessMessageEdited>
        get() = repository.updates.filterIsInstance()

    override val businessMessagesDeletedUpdates: Flow<UpdateBusinessMessagesDeleted>
        get() = repository.updates.filterIsInstance()

    override val newInlineQueryUpdates: Flow<UpdateNewInlineQuery>
        get() = repository.updates.filterIsInstance()

    override val newChosenInlineResultUpdates: Flow<UpdateNewChosenInlineResult>
        get() = repository.updates.filterIsInstance()

    override val newCallbackQueryUpdates: Flow<UpdateNewCallbackQuery>
        get() = repository.updates.filterIsInstance()

    override val newInlineCallbackQueryUpdates: Flow<UpdateNewInlineCallbackQuery>
        get() = repository.updates.filterIsInstance()

    override val newBusinessCallbackQueryUpdates: Flow<UpdateNewBusinessCallbackQuery>
        get() = repository.updates.filterIsInstance()

    override val newShippingQueryUpdates: Flow<UpdateNewShippingQuery>
        get() = repository.updates.filterIsInstance()

    override val newPreCheckoutQueryUpdates: Flow<UpdateNewPreCheckoutQuery>
        get() = repository.updates.filterIsInstance()

    override val newCustomEventUpdates: Flow<UpdateNewCustomEvent>
        get() = repository.updates.filterIsInstance()

    override val newCustomQueryUpdates: Flow<UpdateNewCustomQuery>
        get() = repository.updates.filterIsInstance()

    override val pollUpdates: Flow<UpdatePoll>
        get() = repository.updates.filterIsInstance()

    override val pollAnswerUpdates: Flow<UpdatePollAnswer>
        get() = repository.updates.filterIsInstance()

    override val chatMemberUpdates: Flow<UpdateChatMember>
        get() = repository.updates.filterIsInstance()

    override val newChatJoinRequestUpdates: Flow<UpdateNewChatJoinRequest>
        get() = repository.updates.filterIsInstance()

    override val chatBoostUpdates: Flow<UpdateChatBoost>
        get() = repository.updates.filterIsInstance()

    override val messageReactionUpdates: Flow<UpdateMessageReaction>
        get() = repository.updates.filterIsInstance()

    override val messageReactionsUpdates: Flow<UpdateMessageReactions>
        get() = repository.updates.filterIsInstance()

    override val paidMediaPurchasedUpdates: Flow<UpdatePaidMediaPurchased>
        get() = repository.updates.filterIsInstance()

    override suspend fun acceptCall(callId: Int, protocol: CallProtocol): TdlResult<Ok> {
        return repository.send(
            function = AcceptCall(
                callId = callId,
                protocol = protocol,
            ),
        )
    }

    override suspend fun acceptTermsOfService(termsOfServiceId: String): TdlResult<Ok> {
        return repository.send(
            function = AcceptTermsOfService(
                termsOfServiceId = termsOfServiceId,
            ),
        )
    }

    override suspend fun activateStoryStealthMode(): TdlResult<Ok> {
        return repository.send(
            function = ActivateStoryStealthMode(),
        )
    }

    override suspend fun addBotMediaPreview(
        botUserId: Long,
        languageCode: String,
        content: InputStoryContent,
    ): TdlResult<BotMediaPreview> {
        return repository.send(
            function = AddBotMediaPreview(
                botUserId = botUserId,
                languageCode = languageCode,
                content = content,
            ),
        )
    }

    override suspend fun addChatFolderByInviteLink(inviteLink: String, chatIds: LongArray): TdlResult<Ok> {
        return repository.send(
            function = AddChatFolderByInviteLink(
                inviteLink = inviteLink,
                chatIds = chatIds,
            ),
        )
    }

    override suspend fun addChatMember(
        chatId: Long,
        userId: Long,
        forwardLimit: Int,
    ): TdlResult<FailedToAddMembers> {
        return repository.send(
            function = AddChatMember(
                chatId = chatId,
                userId = userId,
                forwardLimit = forwardLimit,
            ),
        )
    }

    override suspend fun addChatMembers(chatId: Long, userIds: LongArray): TdlResult<FailedToAddMembers> {
        return repository.send(
            function = AddChatMembers(
                chatId = chatId,
                userIds = userIds,
            ),
        )
    }

    override suspend fun addChatToList(chatId: Long, chatList: ChatList): TdlResult<Ok> {
        return repository.send(
            function = AddChatToList(
                chatId = chatId,
                chatList = chatList,
            ),
        )
    }

    override suspend fun addContact(contact: Contact, sharePhoneNumber: Boolean): TdlResult<Ok> {
        return repository.send(
            function = AddContact(
                contact = contact,
                sharePhoneNumber = sharePhoneNumber,
            ),
        )
    }

    override suspend fun addCustomServerLanguagePack(languagePackId: String): TdlResult<Ok> {
        return repository.send(
            function = AddCustomServerLanguagePack(
                languagePackId = languagePackId,
            ),
        )
    }

    override suspend fun addFavoriteSticker(sticker: InputFile): TdlResult<Ok> {
        return repository.send(
            function = AddFavoriteSticker(
                sticker = sticker,
            ),
        )
    }

    override suspend fun addFileToDownloads(
        fileId: Int,
        chatId: Long,
        messageId: Long,
        priority: Int,
    ): TdlResult<File> {
        return repository.send(
            function = AddFileToDownloads(
                fileId = fileId,
                chatId = chatId,
                messageId = messageId,
                priority = priority,
            ),
        )
    }

    override suspend fun addLocalMessage(
        chatId: Long,
        senderId: MessageSender,
        replyTo: InputMessageReplyTo?,
        disableNotification: Boolean,
        inputMessageContent: InputMessageContent,
    ): TdlResult<Message> {
        return repository.send(
            function = AddLocalMessage(
                chatId = chatId,
                senderId = senderId,
                replyTo = replyTo,
                disableNotification = disableNotification,
                inputMessageContent = inputMessageContent,
            ),
        )
    }

    override suspend fun addLogMessage(verbosityLevel: Int, text: String): TdlResult<Ok> {
        return repository.send(
            function = AddLogMessage(
                verbosityLevel = verbosityLevel,
                text = text,
            ),
        )
    }

    override suspend fun addMessageReaction(
        chatId: Long,
        messageId: Long,
        reactionType: ReactionType,
        isBig: Boolean,
        updateRecentReactions: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = AddMessageReaction(
                chatId = chatId,
                messageId = messageId,
                reactionType = reactionType,
                isBig = isBig,
                updateRecentReactions = updateRecentReactions,
            ),
        )
    }

    override suspend fun addNetworkStatistics(entry: NetworkStatisticsEntry): TdlResult<Ok> {
        return repository.send(
            function = AddNetworkStatistics(
                entry = entry,
            ),
        )
    }

    override suspend fun addPendingPaidMessageReaction(
        chatId: Long,
        messageId: Long,
        starCount: Long,
        type: PaidReactionType?,
    ): TdlResult<Ok> {
        return repository.send(
            function = AddPendingPaidMessageReaction(
                chatId = chatId,
                messageId = messageId,
                starCount = starCount,
                type = type,
            ),
        )
    }

    override suspend fun addProxy(
        server: String,
        port: Int,
        enable: Boolean,
        type: ProxyType,
    ): TdlResult<Proxy> {
        return repository.send(
            function = AddProxy(
                server = server,
                port = port,
                enable = enable,
                type = type,
            ),
        )
    }

    override suspend fun addQuickReplyShortcutInlineQueryResultMessage(
        shortcutName: String,
        replyToMessageId: Long,
        queryId: Long,
        resultId: String,
        hideViaBot: Boolean,
    ): TdlResult<QuickReplyMessage> {
        return repository.send(
            function = AddQuickReplyShortcutInlineQueryResultMessage(
                shortcutName = shortcutName,
                replyToMessageId = replyToMessageId,
                queryId = queryId,
                resultId = resultId,
                hideViaBot = hideViaBot,
            ),
        )
    }

    override suspend fun addQuickReplyShortcutMessage(
        shortcutName: String,
        replyToMessageId: Long,
        inputMessageContent: InputMessageContent,
    ): TdlResult<QuickReplyMessage> {
        return repository.send(
            function = AddQuickReplyShortcutMessage(
                shortcutName = shortcutName,
                replyToMessageId = replyToMessageId,
                inputMessageContent = inputMessageContent,
            ),
        )
    }

    override suspend fun addQuickReplyShortcutMessageAlbum(
        shortcutName: String,
        replyToMessageId: Long,
        inputMessageContents: Array<InputMessageContent>,
    ): TdlResult<QuickReplyMessages> {
        return repository.send(
            function = AddQuickReplyShortcutMessageAlbum(
                shortcutName = shortcutName,
                replyToMessageId = replyToMessageId,
                inputMessageContents = inputMessageContents,
            ),
        )
    }

    override suspend fun addRecentSticker(isAttached: Boolean, sticker: InputFile): TdlResult<Stickers> {
        return repository.send(
            function = AddRecentSticker(
                isAttached = isAttached,
                sticker = sticker,
            ),
        )
    }

    override suspend fun addRecentlyFoundChat(chatId: Long): TdlResult<Ok> {
        return repository.send(
            function = AddRecentlyFoundChat(
                chatId = chatId,
            ),
        )
    }

    override suspend fun addSavedAnimation(animation: InputFile): TdlResult<Ok> {
        return repository.send(
            function = AddSavedAnimation(
                animation = animation,
            ),
        )
    }

    override suspend fun addSavedNotificationSound(sound: InputFile): TdlResult<NotificationSound> {
        return repository.send(
            function = AddSavedNotificationSound(
                sound = sound,
            ),
        )
    }

    override suspend fun addStickerToSet(
        userId: Long,
        name: String,
        sticker: InputSticker,
    ): TdlResult<Ok> {
        return repository.send(
            function = AddStickerToSet(
                userId = userId,
                name = name,
                sticker = sticker,
            ),
        )
    }

    override suspend fun allowBotToSendMessages(botUserId: Long): TdlResult<Ok> {
        return repository.send(
            function = AllowBotToSendMessages(
                botUserId = botUserId,
            ),
        )
    }

    override suspend fun allowUnpaidMessagesFromUser(userId: Long, refundPayments: Boolean): TdlResult<Ok> {
        return repository.send(
            function = AllowUnpaidMessagesFromUser(
                userId = userId,
                refundPayments = refundPayments,
            ),
        )
    }

    override suspend fun answerCallbackQuery(
        callbackQueryId: Long,
        text: String,
        showAlert: Boolean,
        url: String,
        cacheTime: Int,
    ): TdlResult<Ok> {
        return repository.send(
            function = AnswerCallbackQuery(
                callbackQueryId = callbackQueryId,
                text = text,
                showAlert = showAlert,
                url = url,
                cacheTime = cacheTime,
            ),
        )
    }

    override suspend fun answerCustomQuery(customQueryId: Long, data: String): TdlResult<Ok> {
        return repository.send(
            function = AnswerCustomQuery(
                customQueryId = customQueryId,
                data = data,
            ),
        )
    }

    override suspend fun answerInlineQuery(
        inlineQueryId: Long,
        isPersonal: Boolean,
        button: InlineQueryResultsButton?,
        results: Array<InputInlineQueryResult>,
        cacheTime: Int,
        nextOffset: String,
    ): TdlResult<Ok> {
        return repository.send(
            function = AnswerInlineQuery(
                inlineQueryId = inlineQueryId,
                isPersonal = isPersonal,
                button = button,
                results = results,
                cacheTime = cacheTime,
                nextOffset = nextOffset,
            ),
        )
    }

    override suspend fun answerPreCheckoutQuery(preCheckoutQueryId: Long, errorMessage: String): TdlResult<Ok> {
        return repository.send(
            function = AnswerPreCheckoutQuery(
                preCheckoutQueryId = preCheckoutQueryId,
                errorMessage = errorMessage,
            ),
        )
    }

    override suspend fun answerShippingQuery(
        shippingQueryId: Long,
        shippingOptions: Array<ShippingOption>,
        errorMessage: String,
    ): TdlResult<Ok> {
        return repository.send(
            function = AnswerShippingQuery(
                shippingQueryId = shippingQueryId,
                shippingOptions = shippingOptions,
                errorMessage = errorMessage,
            ),
        )
    }

    override suspend fun answerWebAppQuery(webAppQueryId: String, result: InputInlineQueryResult): TdlResult<SentWebAppMessage> {
        return repository.send(
            function = AnswerWebAppQuery(
                webAppQueryId = webAppQueryId,
                result = result,
            ),
        )
    }

    override suspend fun applyPremiumGiftCode(code: String): TdlResult<Ok> {
        return repository.send(
            function = ApplyPremiumGiftCode(
                code = code,
            ),
        )
    }

    override suspend fun assignStoreTransaction(transaction: StoreTransaction, purpose: StorePaymentPurpose): TdlResult<Ok> {
        return repository.send(
            function = AssignStoreTransaction(
                transaction = transaction,
                purpose = purpose,
            ),
        )
    }

    override suspend fun banChatMember(
        chatId: Long,
        memberId: MessageSender,
        bannedUntilDate: Int,
        revokeMessages: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = BanChatMember(
                chatId = chatId,
                memberId = memberId,
                bannedUntilDate = bannedUntilDate,
                revokeMessages = revokeMessages,
            ),
        )
    }

    override suspend fun banGroupCallParticipants(groupCallId: Int, userIds: LongArray): TdlResult<Ok> {
        return repository.send(
            function = BanGroupCallParticipants(
                groupCallId = groupCallId,
                userIds = userIds,
            ),
        )
    }

    override suspend fun blockMessageSenderFromReplies(
        messageId: Long,
        deleteMessage: Boolean,
        deleteAllMessages: Boolean,
        reportSpam: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = BlockMessageSenderFromReplies(
                messageId = messageId,
                deleteMessage = deleteMessage,
                deleteAllMessages = deleteAllMessages,
                reportSpam = reportSpam,
            ),
        )
    }

    override suspend fun boostChat(chatId: Long, slotIds: IntArray): TdlResult<ChatBoostSlots> {
        return repository.send(
            function = BoostChat(
                chatId = chatId,
                slotIds = slotIds,
            ),
        )
    }

    override suspend fun canBotSendMessages(botUserId: Long): TdlResult<Ok> {
        return repository.send(
            function = CanBotSendMessages(
                botUserId = botUserId,
            ),
        )
    }

    override suspend fun canPostStory(chatId: Long): TdlResult<CanPostStoryResult> {
        return repository.send(
            function = CanPostStory(
                chatId = chatId,
            ),
        )
    }

    override suspend fun canPurchaseFromStore(purpose: StorePaymentPurpose): TdlResult<Ok> {
        return repository.send(
            function = CanPurchaseFromStore(
                purpose = purpose,
            ),
        )
    }

    override suspend fun canSendMessageToUser(userId: Long, onlyLocal: Boolean): TdlResult<CanSendMessageToUserResult> {
        return repository.send(
            function = CanSendMessageToUser(
                userId = userId,
                onlyLocal = onlyLocal,
            ),
        )
    }

    override suspend fun canTransferOwnership(): TdlResult<CanTransferOwnershipResult> {
        return repository.send(
            function = CanTransferOwnership(),
        )
    }

    override suspend fun cancelDownloadFile(fileId: Int, onlyIfPending: Boolean): TdlResult<Ok> {
        return repository.send(
            function = CancelDownloadFile(
                fileId = fileId,
                onlyIfPending = onlyIfPending,
            ),
        )
    }

    override suspend fun cancelPasswordReset(): TdlResult<Ok> {
        return repository.send(
            function = CancelPasswordReset(),
        )
    }

    override suspend fun cancelPreliminaryUploadFile(fileId: Int): TdlResult<Ok> {
        return repository.send(
            function = CancelPreliminaryUploadFile(
                fileId = fileId,
            ),
        )
    }

    override suspend fun cancelRecoveryEmailAddressVerification(): TdlResult<PasswordState> {
        return repository.send(
            function = CancelRecoveryEmailAddressVerification(),
        )
    }

    override suspend fun changeImportedContacts(contacts: Array<Contact>): TdlResult<ImportedContacts> {
        return repository.send(
            function = ChangeImportedContacts(
                contacts = contacts,
            ),
        )
    }

    override suspend fun changeStickerSet(
        setId: Long,
        isInstalled: Boolean,
        isArchived: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = ChangeStickerSet(
                setId = setId,
                isInstalled = isInstalled,
                isArchived = isArchived,
            ),
        )
    }

    override suspend fun checkAuthenticationBotToken(token: String): TdlResult<Ok> {
        return repository.send(
            function = CheckAuthenticationBotToken(
                token = token,
            ),
        )
    }

    override suspend fun checkAuthenticationCode(code: String): TdlResult<Ok> {
        return repository.send(
            function = CheckAuthenticationCode(
                code = code,
            ),
        )
    }

    override suspend fun checkAuthenticationEmailCode(code: EmailAddressAuthentication): TdlResult<Ok> {
        return repository.send(
            function = CheckAuthenticationEmailCode(
                code = code,
            ),
        )
    }

    override suspend fun checkAuthenticationPassword(password: String): TdlResult<Ok> {
        return repository.send(
            function = CheckAuthenticationPassword(
                password = password,
            ),
        )
    }

    override suspend fun checkAuthenticationPasswordRecoveryCode(recoveryCode: String): TdlResult<Ok> {
        return repository.send(
            function = CheckAuthenticationPasswordRecoveryCode(
                recoveryCode = recoveryCode,
            ),
        )
    }

    override suspend fun checkAuthenticationPremiumPurchase(currency: String, amount: Long): TdlResult<Ok> {
        return repository.send(
            function = CheckAuthenticationPremiumPurchase(
                currency = currency,
                amount = amount,
            ),
        )
    }

    override suspend fun checkChatFolderInviteLink(inviteLink: String): TdlResult<ChatFolderInviteLinkInfo> {
        return repository.send(
            function = CheckChatFolderInviteLink(
                inviteLink = inviteLink,
            ),
        )
    }

    override suspend fun checkChatInviteLink(inviteLink: String): TdlResult<ChatInviteLinkInfo> {
        return repository.send(
            function = CheckChatInviteLink(
                inviteLink = inviteLink,
            ),
        )
    }

    override suspend fun checkChatUsername(chatId: Long, username: String): TdlResult<CheckChatUsernameResult> {
        return repository.send(
            function = CheckChatUsername(
                chatId = chatId,
                username = username,
            ),
        )
    }

    override suspend fun checkCreatedPublicChatsLimit(type: PublicChatType): TdlResult<Ok> {
        return repository.send(
            function = CheckCreatedPublicChatsLimit(
                type = type,
            ),
        )
    }

    override suspend fun checkEmailAddressVerificationCode(code: String): TdlResult<Ok> {
        return repository.send(
            function = CheckEmailAddressVerificationCode(
                code = code,
            ),
        )
    }

    override suspend fun checkLoginEmailAddressCode(code: EmailAddressAuthentication): TdlResult<Ok> {
        return repository.send(
            function = CheckLoginEmailAddressCode(
                code = code,
            ),
        )
    }

    override suspend fun checkPasswordRecoveryCode(recoveryCode: String): TdlResult<Ok> {
        return repository.send(
            function = CheckPasswordRecoveryCode(
                recoveryCode = recoveryCode,
            ),
        )
    }

    override suspend fun checkPhoneNumberCode(code: String): TdlResult<Ok> {
        return repository.send(
            function = CheckPhoneNumberCode(
                code = code,
            ),
        )
    }

    override suspend fun checkPremiumGiftCode(code: String): TdlResult<PremiumGiftCodeInfo> {
        return repository.send(
            function = CheckPremiumGiftCode(
                code = code,
            ),
        )
    }

    override suspend fun checkQuickReplyShortcutName(name: String): TdlResult<Ok> {
        return repository.send(
            function = CheckQuickReplyShortcutName(
                name = name,
            ),
        )
    }

    override suspend fun checkRecoveryEmailAddressCode(code: String): TdlResult<PasswordState> {
        return repository.send(
            function = CheckRecoveryEmailAddressCode(
                code = code,
            ),
        )
    }

    override suspend fun checkStickerSetName(name: String): TdlResult<CheckStickerSetNameResult> {
        return repository.send(
            function = CheckStickerSetName(
                name = name,
            ),
        )
    }

    override suspend fun checkWebAppFileDownload(
        botUserId: Long,
        fileName: String,
        url: String,
    ): TdlResult<Ok> {
        return repository.send(
            function = CheckWebAppFileDownload(
                botUserId = botUserId,
                fileName = fileName,
                url = url,
            ),
        )
    }

    override suspend fun cleanFileName(fileName: String): TdlResult<Text> {
        return repository.send(
            function = CleanFileName(
                fileName = fileName,
            ),
        )
    }

    override suspend fun clearAllDraftMessages(excludeSecretChats: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ClearAllDraftMessages(
                excludeSecretChats = excludeSecretChats,
            ),
        )
    }

    override suspend fun clearAutosaveSettingsExceptions(): TdlResult<Ok> {
        return repository.send(
            function = ClearAutosaveSettingsExceptions(),
        )
    }

    override suspend fun clearImportedContacts(): TdlResult<Ok> {
        return repository.send(
            function = ClearImportedContacts(),
        )
    }

    override suspend fun clearRecentEmojiStatuses(): TdlResult<Ok> {
        return repository.send(
            function = ClearRecentEmojiStatuses(),
        )
    }

    override suspend fun clearRecentReactions(): TdlResult<Ok> {
        return repository.send(
            function = ClearRecentReactions(),
        )
    }

    override suspend fun clearRecentStickers(isAttached: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ClearRecentStickers(
                isAttached = isAttached,
            ),
        )
    }

    override suspend fun clearRecentlyFoundChats(): TdlResult<Ok> {
        return repository.send(
            function = ClearRecentlyFoundChats(),
        )
    }

    override suspend fun clearSearchedForTags(clearCashtags: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ClearSearchedForTags(
                clearCashtags = clearCashtags,
            ),
        )
    }

    override suspend fun clickAnimatedEmojiMessage(chatId: Long, messageId: Long): TdlResult<Sticker> {
        return repository.send(
            function = ClickAnimatedEmojiMessage(
                chatId = chatId,
                messageId = messageId,
            ),
        )
    }

    override suspend fun clickChatSponsoredMessage(
        chatId: Long,
        messageId: Long,
        isMediaClick: Boolean,
        fromFullscreen: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = ClickChatSponsoredMessage(
                chatId = chatId,
                messageId = messageId,
                isMediaClick = isMediaClick,
                fromFullscreen = fromFullscreen,
            ),
        )
    }

    override suspend fun clickPremiumSubscriptionButton(): TdlResult<Ok> {
        return repository.send(
            function = ClickPremiumSubscriptionButton(),
        )
    }

    override suspend fun close(): TdlResult<Ok> {
        return repository.send(
            function = Close(),
        )
    }

    override suspend fun closeChat(chatId: Long): TdlResult<Ok> {
        return repository.send(
            function = CloseChat(
                chatId = chatId,
            ),
        )
    }

    override suspend fun closeSecretChat(secretChatId: Int): TdlResult<Ok> {
        return repository.send(
            function = CloseSecretChat(
                secretChatId = secretChatId,
            ),
        )
    }

    override suspend fun closeStory(storyPosterChatId: Long, storyId: Int): TdlResult<Ok> {
        return repository.send(
            function = CloseStory(
                storyPosterChatId = storyPosterChatId,
                storyId = storyId,
            ),
        )
    }

    override suspend fun closeWebApp(webAppLaunchId: Long): TdlResult<Ok> {
        return repository.send(
            function = CloseWebApp(
                webAppLaunchId = webAppLaunchId,
            ),
        )
    }

    override suspend fun commitPendingPaidMessageReactions(chatId: Long, messageId: Long): TdlResult<Ok> {
        return repository.send(
            function = CommitPendingPaidMessageReactions(
                chatId = chatId,
                messageId = messageId,
            ),
        )
    }

    override suspend fun confirmQrCodeAuthentication(link: String): TdlResult<Session> {
        return repository.send(
            function = ConfirmQrCodeAuthentication(
                link = link,
            ),
        )
    }

    override suspend fun confirmSession(sessionId: Long): TdlResult<Ok> {
        return repository.send(
            function = ConfirmSession(
                sessionId = sessionId,
            ),
        )
    }

    override suspend fun connectAffiliateProgram(affiliate: AffiliateType, botUserId: Long): TdlResult<ConnectedAffiliateProgram> {
        return repository.send(
            function = ConnectAffiliateProgram(
                affiliate = affiliate,
                botUserId = botUserId,
            ),
        )
    }

    override suspend fun createBasicGroupChat(basicGroupId: Long, force: Boolean): TdlResult<Chat> {
        return repository.send(
            function = CreateBasicGroupChat(
                basicGroupId = basicGroupId,
                force = force,
            ),
        )
    }

    override suspend fun createBusinessChatLink(linkInfo: InputBusinessChatLink): TdlResult<BusinessChatLink> {
        return repository.send(
            function = CreateBusinessChatLink(
                linkInfo = linkInfo,
            ),
        )
    }

    override suspend fun createCall(
        userId: Long,
        protocol: CallProtocol,
        isVideo: Boolean,
    ): TdlResult<CallId> {
        return repository.send(
            function = CreateCall(
                userId = userId,
                protocol = protocol,
                isVideo = isVideo,
            ),
        )
    }

    override suspend fun createChatFolder(folder: ChatFolder): TdlResult<ChatFolderInfo> {
        return repository.send(
            function = CreateChatFolder(
                folder = folder,
            ),
        )
    }

    override suspend fun createChatFolderInviteLink(
        chatFolderId: Int,
        name: String,
        chatIds: LongArray,
    ): TdlResult<ChatFolderInviteLink> {
        return repository.send(
            function = CreateChatFolderInviteLink(
                chatFolderId = chatFolderId,
                name = name,
                chatIds = chatIds,
            ),
        )
    }

    override suspend fun createChatInviteLink(
        chatId: Long,
        name: String,
        expirationDate: Int,
        memberLimit: Int,
        createsJoinRequest: Boolean,
    ): TdlResult<ChatInviteLink> {
        return repository.send(
            function = CreateChatInviteLink(
                chatId = chatId,
                name = name,
                expirationDate = expirationDate,
                memberLimit = memberLimit,
                createsJoinRequest = createsJoinRequest,
            ),
        )
    }

    override suspend fun createChatSubscriptionInviteLink(
        chatId: Long,
        name: String,
        subscriptionPricing: StarSubscriptionPricing,
    ): TdlResult<ChatInviteLink> {
        return repository.send(
            function = CreateChatSubscriptionInviteLink(
                chatId = chatId,
                name = name,
                subscriptionPricing = subscriptionPricing,
            ),
        )
    }

    override suspend fun createForumTopic(
        chatId: Long,
        name: String,
        icon: ForumTopicIcon,
    ): TdlResult<ForumTopicInfo> {
        return repository.send(
            function = CreateForumTopic(
                chatId = chatId,
                name = name,
                icon = icon,
            ),
        )
    }

    override suspend fun createGroupCall(joinParameters: GroupCallJoinParameters?): TdlResult<GroupCallInfo> {
        return repository.send(
            function = CreateGroupCall(
                joinParameters = joinParameters,
            ),
        )
    }

    override suspend fun createInvoiceLink(businessConnectionId: String, invoice: InputMessageContent): TdlResult<HttpUrl> {
        return repository.send(
            function = CreateInvoiceLink(
                businessConnectionId = businessConnectionId,
                invoice = invoice,
            ),
        )
    }

    override suspend fun createNewBasicGroupChat(
        userIds: LongArray,
        title: String,
        messageAutoDeleteTime: Int,
    ): TdlResult<CreatedBasicGroupChat> {
        return repository.send(
            function = CreateNewBasicGroupChat(
                userIds = userIds,
                title = title,
                messageAutoDeleteTime = messageAutoDeleteTime,
            ),
        )
    }

    override suspend fun createNewSecretChat(userId: Long): TdlResult<Chat> {
        return repository.send(
            function = CreateNewSecretChat(
                userId = userId,
            ),
        )
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
        return repository.send(
            function = CreateNewStickerSet(
                userId = userId,
                title = title,
                name = name,
                stickerType = stickerType,
                needsRepainting = needsRepainting,
                stickers = stickers,
                source = source,
            ),
        )
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
        return repository.send(
            function = CreateNewSupergroupChat(
                title = title,
                isForum = isForum,
                isChannel = isChannel,
                description = description,
                location = location,
                messageAutoDeleteTime = messageAutoDeleteTime,
                forImport = forImport,
            ),
        )
    }

    override suspend fun createPrivateChat(userId: Long, force: Boolean): TdlResult<Chat> {
        return repository.send(
            function = CreatePrivateChat(
                userId = userId,
                force = force,
            ),
        )
    }

    override suspend fun createSecretChat(secretChatId: Int): TdlResult<Chat> {
        return repository.send(
            function = CreateSecretChat(
                secretChatId = secretChatId,
            ),
        )
    }

    override suspend fun createSupergroupChat(supergroupId: Long, force: Boolean): TdlResult<Chat> {
        return repository.send(
            function = CreateSupergroupChat(
                supergroupId = supergroupId,
                force = force,
            ),
        )
    }

    override suspend fun createTemporaryPassword(password: String, validFor: Int): TdlResult<TemporaryPasswordState> {
        return repository.send(
            function = CreateTemporaryPassword(
                password = password,
                validFor = validFor,
            ),
        )
    }

    override suspend fun createVideoChat(
        chatId: Long,
        title: String,
        startDate: Int,
        isRtmpStream: Boolean,
    ): TdlResult<GroupCallId> {
        return repository.send(
            function = CreateVideoChat(
                chatId = chatId,
                title = title,
                startDate = startDate,
                isRtmpStream = isRtmpStream,
            ),
        )
    }

    override suspend fun declineGroupCallInvitation(chatId: Long, messageId: Long): TdlResult<Ok> {
        return repository.send(
            function = DeclineGroupCallInvitation(
                chatId = chatId,
                messageId = messageId,
            ),
        )
    }

    override suspend fun decryptGroupCallData(
        groupCallId: Int,
        participantId: MessageSender,
        dataChannel: GroupCallDataChannel?,
        data: ByteArray,
    ): TdlResult<Data> {
        return repository.send(
            function = DecryptGroupCallData(
                groupCallId = groupCallId,
                participantId = participantId,
                dataChannel = dataChannel,
                data = data,
            ),
        )
    }

    override suspend fun deleteAccount(reason: String, password: String): TdlResult<Ok> {
        return repository.send(
            function = DeleteAccount(
                reason = reason,
                password = password,
            ),
        )
    }

    override suspend fun deleteAllCallMessages(revoke: Boolean): TdlResult<Ok> {
        return repository.send(
            function = DeleteAllCallMessages(
                revoke = revoke,
            ),
        )
    }

    override suspend fun deleteAllRevokedChatInviteLinks(chatId: Long, creatorUserId: Long): TdlResult<Ok> {
        return repository.send(
            function = DeleteAllRevokedChatInviteLinks(
                chatId = chatId,
                creatorUserId = creatorUserId,
            ),
        )
    }

    override suspend fun deleteBotMediaPreviews(
        botUserId: Long,
        languageCode: String,
        fileIds: IntArray,
    ): TdlResult<Ok> {
        return repository.send(
            function = DeleteBotMediaPreviews(
                botUserId = botUserId,
                languageCode = languageCode,
                fileIds = fileIds,
            ),
        )
    }

    override suspend fun deleteBusinessChatLink(link: String): TdlResult<Ok> {
        return repository.send(
            function = DeleteBusinessChatLink(
                link = link,
            ),
        )
    }

    override suspend fun deleteBusinessConnectedBot(botUserId: Long): TdlResult<Ok> {
        return repository.send(
            function = DeleteBusinessConnectedBot(
                botUserId = botUserId,
            ),
        )
    }

    override suspend fun deleteBusinessMessages(businessConnectionId: String, messageIds: LongArray): TdlResult<Ok> {
        return repository.send(
            function = DeleteBusinessMessages(
                businessConnectionId = businessConnectionId,
                messageIds = messageIds,
            ),
        )
    }

    override suspend fun deleteBusinessStory(businessConnectionId: String, storyId: Int): TdlResult<Ok> {
        return repository.send(
            function = DeleteBusinessStory(
                businessConnectionId = businessConnectionId,
                storyId = storyId,
            ),
        )
    }

    override suspend fun deleteChat(chatId: Long): TdlResult<Ok> {
        return repository.send(
            function = DeleteChat(
                chatId = chatId,
            ),
        )
    }

    override suspend fun deleteChatBackground(chatId: Long, restorePrevious: Boolean): TdlResult<Ok> {
        return repository.send(
            function = DeleteChatBackground(
                chatId = chatId,
                restorePrevious = restorePrevious,
            ),
        )
    }

    override suspend fun deleteChatFolder(chatFolderId: Int, leaveChatIds: LongArray): TdlResult<Ok> {
        return repository.send(
            function = DeleteChatFolder(
                chatFolderId = chatFolderId,
                leaveChatIds = leaveChatIds,
            ),
        )
    }

    override suspend fun deleteChatFolderInviteLink(chatFolderId: Int, inviteLink: String): TdlResult<Ok> {
        return repository.send(
            function = DeleteChatFolderInviteLink(
                chatFolderId = chatFolderId,
                inviteLink = inviteLink,
            ),
        )
    }

    override suspend fun deleteChatHistory(
        chatId: Long,
        removeFromChatList: Boolean,
        revoke: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = DeleteChatHistory(
                chatId = chatId,
                removeFromChatList = removeFromChatList,
                revoke = revoke,
            ),
        )
    }

    override suspend fun deleteChatMessagesByDate(
        chatId: Long,
        minDate: Int,
        maxDate: Int,
        revoke: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = DeleteChatMessagesByDate(
                chatId = chatId,
                minDate = minDate,
                maxDate = maxDate,
                revoke = revoke,
            ),
        )
    }

    override suspend fun deleteChatMessagesBySender(chatId: Long, senderId: MessageSender): TdlResult<Ok> {
        return repository.send(
            function = DeleteChatMessagesBySender(
                chatId = chatId,
                senderId = senderId,
            ),
        )
    }

    override suspend fun deleteChatReplyMarkup(chatId: Long, messageId: Long): TdlResult<Ok> {
        return repository.send(
            function = DeleteChatReplyMarkup(
                chatId = chatId,
                messageId = messageId,
            ),
        )
    }

    override suspend fun deleteCommands(scope: BotCommandScope?, languageCode: String): TdlResult<Ok> {
        return repository.send(
            function = DeleteCommands(
                scope = scope,
                languageCode = languageCode,
            ),
        )
    }

    override suspend fun deleteDefaultBackground(forDarkTheme: Boolean): TdlResult<Ok> {
        return repository.send(
            function = DeleteDefaultBackground(
                forDarkTheme = forDarkTheme,
            ),
        )
    }

    override suspend fun deleteDirectMessagesChatTopicHistory(chatId: Long, topicId: Long): TdlResult<Ok> {
        return repository.send(
            function = DeleteDirectMessagesChatTopicHistory(
                chatId = chatId,
                topicId = topicId,
            ),
        )
    }

    override suspend fun deleteDirectMessagesChatTopicMessagesByDate(
        chatId: Long,
        topicId: Long,
        minDate: Int,
        maxDate: Int,
    ): TdlResult<Ok> {
        return repository.send(
            function = DeleteDirectMessagesChatTopicMessagesByDate(
                chatId = chatId,
                topicId = topicId,
                minDate = minDate,
                maxDate = maxDate,
            ),
        )
    }

    override suspend fun deleteFile(fileId: Int): TdlResult<Ok> {
        return repository.send(
            function = DeleteFile(
                fileId = fileId,
            ),
        )
    }

    override suspend fun deleteForumTopic(chatId: Long, messageThreadId: Long): TdlResult<Ok> {
        return repository.send(
            function = DeleteForumTopic(
                chatId = chatId,
                messageThreadId = messageThreadId,
            ),
        )
    }

    override suspend fun deleteLanguagePack(languagePackId: String): TdlResult<Ok> {
        return repository.send(
            function = DeleteLanguagePack(
                languagePackId = languagePackId,
            ),
        )
    }

    override suspend fun deleteMessages(
        chatId: Long,
        messageIds: LongArray,
        revoke: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = DeleteMessages(
                chatId = chatId,
                messageIds = messageIds,
                revoke = revoke,
            ),
        )
    }

    override suspend fun deletePassportElement(type: PassportElementType): TdlResult<Ok> {
        return repository.send(
            function = DeletePassportElement(
                type = type,
            ),
        )
    }

    override suspend fun deleteProfilePhoto(profilePhotoId: Long): TdlResult<Ok> {
        return repository.send(
            function = DeleteProfilePhoto(
                profilePhotoId = profilePhotoId,
            ),
        )
    }

    override suspend fun deleteQuickReplyShortcut(shortcutId: Int): TdlResult<Ok> {
        return repository.send(
            function = DeleteQuickReplyShortcut(
                shortcutId = shortcutId,
            ),
        )
    }

    override suspend fun deleteQuickReplyShortcutMessages(shortcutId: Int, messageIds: LongArray): TdlResult<Ok> {
        return repository.send(
            function = DeleteQuickReplyShortcutMessages(
                shortcutId = shortcutId,
                messageIds = messageIds,
            ),
        )
    }

    override suspend fun deleteRevokedChatInviteLink(chatId: Long, inviteLink: String): TdlResult<Ok> {
        return repository.send(
            function = DeleteRevokedChatInviteLink(
                chatId = chatId,
                inviteLink = inviteLink,
            ),
        )
    }

    override suspend fun deleteSavedCredentials(): TdlResult<Ok> {
        return repository.send(
            function = DeleteSavedCredentials(),
        )
    }

    override suspend fun deleteSavedMessagesTopicHistory(savedMessagesTopicId: Long): TdlResult<Ok> {
        return repository.send(
            function = DeleteSavedMessagesTopicHistory(
                savedMessagesTopicId = savedMessagesTopicId,
            ),
        )
    }

    override suspend fun deleteSavedMessagesTopicMessagesByDate(
        savedMessagesTopicId: Long,
        minDate: Int,
        maxDate: Int,
    ): TdlResult<Ok> {
        return repository.send(
            function = DeleteSavedMessagesTopicMessagesByDate(
                savedMessagesTopicId = savedMessagesTopicId,
                minDate = minDate,
                maxDate = maxDate,
            ),
        )
    }

    override suspend fun deleteSavedOrderInfo(): TdlResult<Ok> {
        return repository.send(
            function = DeleteSavedOrderInfo(),
        )
    }

    override suspend fun deleteStickerSet(name: String): TdlResult<Ok> {
        return repository.send(
            function = DeleteStickerSet(
                name = name,
            ),
        )
    }

    override suspend fun deleteStory(storyPosterChatId: Long, storyId: Int): TdlResult<Ok> {
        return repository.send(
            function = DeleteStory(
                storyPosterChatId = storyPosterChatId,
                storyId = storyId,
            ),
        )
    }

    override suspend fun destroy(): TdlResult<Ok> {
        return repository.send(
            function = Destroy(),
        )
    }

    override suspend fun disableAllSupergroupUsernames(supergroupId: Long): TdlResult<Ok> {
        return repository.send(
            function = DisableAllSupergroupUsernames(
                supergroupId = supergroupId,
            ),
        )
    }

    override suspend fun disableProxy(): TdlResult<Ok> {
        return repository.send(
            function = DisableProxy(),
        )
    }

    override suspend fun discardCall(
        callId: Int,
        isDisconnected: Boolean,
        inviteLink: String,
        duration: Int,
        isVideo: Boolean,
        connectionId: Long,
    ): TdlResult<Ok> {
        return repository.send(
            function = DiscardCall(
                callId = callId,
                isDisconnected = isDisconnected,
                inviteLink = inviteLink,
                duration = duration,
                isVideo = isVideo,
                connectionId = connectionId,
            ),
        )
    }

    override suspend fun disconnectAffiliateProgram(affiliate: AffiliateType, url: String): TdlResult<ConnectedAffiliateProgram> {
        return repository.send(
            function = DisconnectAffiliateProgram(
                affiliate = affiliate,
                url = url,
            ),
        )
    }

    override suspend fun disconnectAllWebsites(): TdlResult<Ok> {
        return repository.send(
            function = DisconnectAllWebsites(),
        )
    }

    override suspend fun disconnectWebsite(websiteId: Long): TdlResult<Ok> {
        return repository.send(
            function = DisconnectWebsite(
                websiteId = websiteId,
            ),
        )
    }

    override suspend fun downloadFile(
        fileId: Int,
        priority: Int,
        offset: Long,
        limit: Long,
        synchronous: Boolean,
    ): TdlResult<File> {
        return repository.send(
            function = DownloadFile(
                fileId = fileId,
                priority = priority,
                offset = offset,
                limit = limit,
                synchronous = synchronous,
            ),
        )
    }

    override suspend fun editBotMediaPreview(
        botUserId: Long,
        languageCode: String,
        fileId: Int,
        content: InputStoryContent,
    ): TdlResult<BotMediaPreview> {
        return repository.send(
            function = EditBotMediaPreview(
                botUserId = botUserId,
                languageCode = languageCode,
                fileId = fileId,
                content = content,
            ),
        )
    }

    override suspend fun editBusinessChatLink(link: String, linkInfo: InputBusinessChatLink): TdlResult<BusinessChatLink> {
        return repository.send(
            function = EditBusinessChatLink(
                link = link,
                linkInfo = linkInfo,
            ),
        )
    }

    override suspend fun editBusinessMessageCaption(
        businessConnectionId: String,
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
        caption: FormattedText?,
        showCaptionAboveMedia: Boolean,
    ): TdlResult<BusinessMessage> {
        return repository.send(
            function = EditBusinessMessageCaption(
                businessConnectionId = businessConnectionId,
                chatId = chatId,
                messageId = messageId,
                replyMarkup = replyMarkup,
                caption = caption,
                showCaptionAboveMedia = showCaptionAboveMedia,
            ),
        )
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
        return repository.send(
            function = EditBusinessMessageLiveLocation(
                businessConnectionId = businessConnectionId,
                chatId = chatId,
                messageId = messageId,
                replyMarkup = replyMarkup,
                location = location,
                livePeriod = livePeriod,
                heading = heading,
                proximityAlertRadius = proximityAlertRadius,
            ),
        )
    }

    override suspend fun editBusinessMessageMedia(
        businessConnectionId: String,
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
        inputMessageContent: InputMessageContent,
    ): TdlResult<BusinessMessage> {
        return repository.send(
            function = EditBusinessMessageMedia(
                businessConnectionId = businessConnectionId,
                chatId = chatId,
                messageId = messageId,
                replyMarkup = replyMarkup,
                inputMessageContent = inputMessageContent,
            ),
        )
    }

    override suspend fun editBusinessMessageReplyMarkup(
        businessConnectionId: String,
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
    ): TdlResult<BusinessMessage> {
        return repository.send(
            function = EditBusinessMessageReplyMarkup(
                businessConnectionId = businessConnectionId,
                chatId = chatId,
                messageId = messageId,
                replyMarkup = replyMarkup,
            ),
        )
    }

    override suspend fun editBusinessMessageText(
        businessConnectionId: String,
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
        inputMessageContent: InputMessageContent,
    ): TdlResult<BusinessMessage> {
        return repository.send(
            function = EditBusinessMessageText(
                businessConnectionId = businessConnectionId,
                chatId = chatId,
                messageId = messageId,
                replyMarkup = replyMarkup,
                inputMessageContent = inputMessageContent,
            ),
        )
    }

    override suspend fun editBusinessStory(
        storyPosterChatId: Long,
        storyId: Int,
        content: InputStoryContent,
        areas: InputStoryAreas,
        caption: FormattedText,
        privacySettings: StoryPrivacySettings,
    ): TdlResult<Story> {
        return repository.send(
            function = EditBusinessStory(
                storyPosterChatId = storyPosterChatId,
                storyId = storyId,
                content = content,
                areas = areas,
                caption = caption,
                privacySettings = privacySettings,
            ),
        )
    }

    override suspend fun editChatFolder(chatFolderId: Int, folder: ChatFolder): TdlResult<ChatFolderInfo> {
        return repository.send(
            function = EditChatFolder(
                chatFolderId = chatFolderId,
                folder = folder,
            ),
        )
    }

    override suspend fun editChatFolderInviteLink(
        chatFolderId: Int,
        inviteLink: String,
        name: String,
        chatIds: LongArray,
    ): TdlResult<ChatFolderInviteLink> {
        return repository.send(
            function = EditChatFolderInviteLink(
                chatFolderId = chatFolderId,
                inviteLink = inviteLink,
                name = name,
                chatIds = chatIds,
            ),
        )
    }

    override suspend fun editChatInviteLink(
        chatId: Long,
        inviteLink: String,
        name: String,
        expirationDate: Int,
        memberLimit: Int,
        createsJoinRequest: Boolean,
    ): TdlResult<ChatInviteLink> {
        return repository.send(
            function = EditChatInviteLink(
                chatId = chatId,
                inviteLink = inviteLink,
                name = name,
                expirationDate = expirationDate,
                memberLimit = memberLimit,
                createsJoinRequest = createsJoinRequest,
            ),
        )
    }

    override suspend fun editChatSubscriptionInviteLink(
        chatId: Long,
        inviteLink: String,
        name: String,
    ): TdlResult<ChatInviteLink> {
        return repository.send(
            function = EditChatSubscriptionInviteLink(
                chatId = chatId,
                inviteLink = inviteLink,
                name = name,
            ),
        )
    }

    override suspend fun editCustomLanguagePackInfo(info: LanguagePackInfo): TdlResult<Ok> {
        return repository.send(
            function = EditCustomLanguagePackInfo(
                info = info,
            ),
        )
    }

    override suspend fun editForumTopic(
        chatId: Long,
        messageThreadId: Long,
        name: String,
        editIconCustomEmoji: Boolean,
        iconCustomEmojiId: Long,
    ): TdlResult<Ok> {
        return repository.send(
            function = EditForumTopic(
                chatId = chatId,
                messageThreadId = messageThreadId,
                name = name,
                editIconCustomEmoji = editIconCustomEmoji,
                iconCustomEmojiId = iconCustomEmojiId,
            ),
        )
    }

    override suspend fun editInlineMessageCaption(
        inlineMessageId: String,
        replyMarkup: ReplyMarkup?,
        caption: FormattedText?,
        showCaptionAboveMedia: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = EditInlineMessageCaption(
                inlineMessageId = inlineMessageId,
                replyMarkup = replyMarkup,
                caption = caption,
                showCaptionAboveMedia = showCaptionAboveMedia,
            ),
        )
    }

    override suspend fun editInlineMessageLiveLocation(
        inlineMessageId: String,
        replyMarkup: ReplyMarkup?,
        location: Location?,
        livePeriod: Int,
        heading: Int,
        proximityAlertRadius: Int,
    ): TdlResult<Ok> {
        return repository.send(
            function = EditInlineMessageLiveLocation(
                inlineMessageId = inlineMessageId,
                replyMarkup = replyMarkup,
                location = location,
                livePeriod = livePeriod,
                heading = heading,
                proximityAlertRadius = proximityAlertRadius,
            ),
        )
    }

    override suspend fun editInlineMessageMedia(
        inlineMessageId: String,
        replyMarkup: ReplyMarkup?,
        inputMessageContent: InputMessageContent,
    ): TdlResult<Ok> {
        return repository.send(
            function = EditInlineMessageMedia(
                inlineMessageId = inlineMessageId,
                replyMarkup = replyMarkup,
                inputMessageContent = inputMessageContent,
            ),
        )
    }

    override suspend fun editInlineMessageReplyMarkup(inlineMessageId: String, replyMarkup: ReplyMarkup?): TdlResult<Ok> {
        return repository.send(
            function = EditInlineMessageReplyMarkup(
                inlineMessageId = inlineMessageId,
                replyMarkup = replyMarkup,
            ),
        )
    }

    override suspend fun editInlineMessageText(
        inlineMessageId: String,
        replyMarkup: ReplyMarkup?,
        inputMessageContent: InputMessageContent,
    ): TdlResult<Ok> {
        return repository.send(
            function = EditInlineMessageText(
                inlineMessageId = inlineMessageId,
                replyMarkup = replyMarkup,
                inputMessageContent = inputMessageContent,
            ),
        )
    }

    override suspend fun editMessageCaption(
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
        caption: FormattedText?,
        showCaptionAboveMedia: Boolean,
    ): TdlResult<Message> {
        return repository.send(
            function = EditMessageCaption(
                chatId = chatId,
                messageId = messageId,
                replyMarkup = replyMarkup,
                caption = caption,
                showCaptionAboveMedia = showCaptionAboveMedia,
            ),
        )
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
        return repository.send(
            function = EditMessageLiveLocation(
                chatId = chatId,
                messageId = messageId,
                replyMarkup = replyMarkup,
                location = location,
                livePeriod = livePeriod,
                heading = heading,
                proximityAlertRadius = proximityAlertRadius,
            ),
        )
    }

    override suspend fun editMessageMedia(
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
        inputMessageContent: InputMessageContent,
    ): TdlResult<Message> {
        return repository.send(
            function = EditMessageMedia(
                chatId = chatId,
                messageId = messageId,
                replyMarkup = replyMarkup,
                inputMessageContent = inputMessageContent,
            ),
        )
    }

    override suspend fun editMessageReplyMarkup(
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
    ): TdlResult<Message> {
        return repository.send(
            function = EditMessageReplyMarkup(
                chatId = chatId,
                messageId = messageId,
                replyMarkup = replyMarkup,
            ),
        )
    }

    override suspend fun editMessageSchedulingState(
        chatId: Long,
        messageId: Long,
        schedulingState: MessageSchedulingState?,
    ): TdlResult<Ok> {
        return repository.send(
            function = EditMessageSchedulingState(
                chatId = chatId,
                messageId = messageId,
                schedulingState = schedulingState,
            ),
        )
    }

    override suspend fun editMessageText(
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
        inputMessageContent: InputMessageContent,
    ): TdlResult<Message> {
        return repository.send(
            function = EditMessageText(
                chatId = chatId,
                messageId = messageId,
                replyMarkup = replyMarkup,
                inputMessageContent = inputMessageContent,
            ),
        )
    }

    override suspend fun editProxy(
        proxyId: Int,
        server: String,
        port: Int,
        enable: Boolean,
        type: ProxyType,
    ): TdlResult<Proxy> {
        return repository.send(
            function = EditProxy(
                proxyId = proxyId,
                server = server,
                port = port,
                enable = enable,
                type = type,
            ),
        )
    }

    override suspend fun editQuickReplyMessage(
        shortcutId: Int,
        messageId: Long,
        inputMessageContent: InputMessageContent,
    ): TdlResult<Ok> {
        return repository.send(
            function = EditQuickReplyMessage(
                shortcutId = shortcutId,
                messageId = messageId,
                inputMessageContent = inputMessageContent,
            ),
        )
    }

    override suspend fun editStarSubscription(subscriptionId: String, isCanceled: Boolean): TdlResult<Ok> {
        return repository.send(
            function = EditStarSubscription(
                subscriptionId = subscriptionId,
                isCanceled = isCanceled,
            ),
        )
    }

    override suspend fun editStory(
        storyPosterChatId: Long,
        storyId: Int,
        content: InputStoryContent?,
        areas: InputStoryAreas?,
        caption: FormattedText?,
    ): TdlResult<Ok> {
        return repository.send(
            function = EditStory(
                storyPosterChatId = storyPosterChatId,
                storyId = storyId,
                content = content,
                areas = areas,
                caption = caption,
            ),
        )
    }

    override suspend fun editStoryCover(
        storyPosterChatId: Long,
        storyId: Int,
        coverFrameTimestamp: Double,
    ): TdlResult<Ok> {
        return repository.send(
            function = EditStoryCover(
                storyPosterChatId = storyPosterChatId,
                storyId = storyId,
                coverFrameTimestamp = coverFrameTimestamp,
            ),
        )
    }

    override suspend fun editUserStarSubscription(
        userId: Long,
        telegramPaymentChargeId: String,
        isCanceled: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = EditUserStarSubscription(
                userId = userId,
                telegramPaymentChargeId = telegramPaymentChargeId,
                isCanceled = isCanceled,
            ),
        )
    }

    override suspend fun enableProxy(proxyId: Int): TdlResult<Ok> {
        return repository.send(
            function = EnableProxy(
                proxyId = proxyId,
            ),
        )
    }

    override suspend fun encryptGroupCallData(
        groupCallId: Int,
        dataChannel: GroupCallDataChannel,
        data: ByteArray,
        unencryptedPrefixSize: Int,
    ): TdlResult<Data> {
        return repository.send(
            function = EncryptGroupCallData(
                groupCallId = groupCallId,
                dataChannel = dataChannel,
                data = data,
                unencryptedPrefixSize = unencryptedPrefixSize,
            ),
        )
    }

    override suspend fun endGroupCall(groupCallId: Int): TdlResult<Ok> {
        return repository.send(
            function = EndGroupCall(
                groupCallId = groupCallId,
            ),
        )
    }

    override suspend fun endGroupCallRecording(groupCallId: Int): TdlResult<Ok> {
        return repository.send(
            function = EndGroupCallRecording(
                groupCallId = groupCallId,
            ),
        )
    }

    override suspend fun endGroupCallScreenSharing(groupCallId: Int): TdlResult<Ok> {
        return repository.send(
            function = EndGroupCallScreenSharing(
                groupCallId = groupCallId,
            ),
        )
    }

    override suspend fun finishFileGeneration(generationId: Long, error: Error?): TdlResult<Ok> {
        return repository.send(
            function = FinishFileGeneration(
                generationId = generationId,
                error = error,
            ),
        )
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
        return repository.send(
            function = ForwardMessages(
                chatId = chatId,
                messageThreadId = messageThreadId,
                fromChatId = fromChatId,
                messageIds = messageIds,
                options = options,
                sendCopy = sendCopy,
                removeCaption = removeCaption,
            ),
        )
    }

    override suspend fun getAccountTtl(): TdlResult<AccountTtl> {
        return repository.send(
            function = GetAccountTtl(),
        )
    }

    override suspend fun getActiveSessions(): TdlResult<Sessions> {
        return repository.send(
            function = GetActiveSessions(),
        )
    }

    override suspend fun getAllPassportElements(password: String): TdlResult<PassportElements> {
        return repository.send(
            function = GetAllPassportElements(
                password = password,
            ),
        )
    }

    override suspend fun getAllStickerEmojis(
        stickerType: StickerType,
        query: String,
        chatId: Long,
        returnOnlyMainEmoji: Boolean,
    ): TdlResult<Emojis> {
        return repository.send(
            function = GetAllStickerEmojis(
                stickerType = stickerType,
                query = query,
                chatId = chatId,
                returnOnlyMainEmoji = returnOnlyMainEmoji,
            ),
        )
    }

    override suspend fun getAnimatedEmoji(emoji: String): TdlResult<AnimatedEmoji> {
        return repository.send(
            function = GetAnimatedEmoji(
                emoji = emoji,
            ),
        )
    }

    override suspend fun getApplicationConfig(): TdlResult<JsonValue> {
        return repository.send(
            function = GetApplicationConfig(),
        )
    }

    override suspend fun getApplicationDownloadLink(): TdlResult<HttpUrl> {
        return repository.send(
            function = GetApplicationDownloadLink(),
        )
    }

    override suspend fun getArchiveChatListSettings(): TdlResult<ArchiveChatListSettings> {
        return repository.send(
            function = GetArchiveChatListSettings(),
        )
    }

    override suspend fun getArchivedStickerSets(
        stickerType: StickerType,
        offsetStickerSetId: Long,
        limit: Int,
    ): TdlResult<StickerSets> {
        return repository.send(
            function = GetArchivedStickerSets(
                stickerType = stickerType,
                offsetStickerSetId = offsetStickerSetId,
                limit = limit,
            ),
        )
    }

    override suspend fun getAttachedStickerSets(fileId: Int): TdlResult<StickerSets> {
        return repository.send(
            function = GetAttachedStickerSets(
                fileId = fileId,
            ),
        )
    }

    override suspend fun getAttachmentMenuBot(botUserId: Long): TdlResult<AttachmentMenuBot> {
        return repository.send(
            function = GetAttachmentMenuBot(
                botUserId = botUserId,
            ),
        )
    }

    override suspend fun getAuthorizationState(): TdlResult<AuthorizationState> {
        return repository.send(
            function = GetAuthorizationState(),
        )
    }

    override suspend fun getAutoDownloadSettingsPresets(): TdlResult<AutoDownloadSettingsPresets> {
        return repository.send(
            function = GetAutoDownloadSettingsPresets(),
        )
    }

    override suspend fun getAutosaveSettings(): TdlResult<AutosaveSettings> {
        return repository.send(
            function = GetAutosaveSettings(),
        )
    }

    override suspend fun getAvailableChatBoostSlots(): TdlResult<ChatBoostSlots> {
        return repository.send(
            function = GetAvailableChatBoostSlots(),
        )
    }

    override suspend fun getAvailableGifts(): TdlResult<AvailableGifts> {
        return repository.send(
            function = GetAvailableGifts(),
        )
    }

    override suspend fun getBackgroundUrl(name: String, type: BackgroundType): TdlResult<HttpUrl> {
        return repository.send(
            function = GetBackgroundUrl(
                name = name,
                type = type,
            ),
        )
    }

    override suspend fun getBankCardInfo(bankCardNumber: String): TdlResult<BankCardInfo> {
        return repository.send(
            function = GetBankCardInfo(
                bankCardNumber = bankCardNumber,
            ),
        )
    }

    override suspend fun getBasicGroup(basicGroupId: Long): TdlResult<BasicGroup> {
        return repository.send(
            function = GetBasicGroup(
                basicGroupId = basicGroupId,
            ),
        )
    }

    override suspend fun getBasicGroupFullInfo(basicGroupId: Long): TdlResult<BasicGroupFullInfo> {
        return repository.send(
            function = GetBasicGroupFullInfo(
                basicGroupId = basicGroupId,
            ),
        )
    }

    override suspend fun getBlockedMessageSenders(
        blockList: BlockList,
        offset: Int,
        limit: Int,
    ): TdlResult<MessageSenders> {
        return repository.send(
            function = GetBlockedMessageSenders(
                blockList = blockList,
                offset = offset,
                limit = limit,
            ),
        )
    }

    override suspend fun getBotInfoDescription(botUserId: Long, languageCode: String): TdlResult<Text> {
        return repository.send(
            function = GetBotInfoDescription(
                botUserId = botUserId,
                languageCode = languageCode,
            ),
        )
    }

    override suspend fun getBotInfoShortDescription(botUserId: Long, languageCode: String): TdlResult<Text> {
        return repository.send(
            function = GetBotInfoShortDescription(
                botUserId = botUserId,
                languageCode = languageCode,
            ),
        )
    }

    override suspend fun getBotMediaPreviewInfo(botUserId: Long, languageCode: String): TdlResult<BotMediaPreviewInfo> {
        return repository.send(
            function = GetBotMediaPreviewInfo(
                botUserId = botUserId,
                languageCode = languageCode,
            ),
        )
    }

    override suspend fun getBotMediaPreviews(botUserId: Long): TdlResult<BotMediaPreviews> {
        return repository.send(
            function = GetBotMediaPreviews(
                botUserId = botUserId,
            ),
        )
    }

    override suspend fun getBotName(botUserId: Long, languageCode: String): TdlResult<Text> {
        return repository.send(
            function = GetBotName(
                botUserId = botUserId,
                languageCode = languageCode,
            ),
        )
    }

    override suspend fun getBotSimilarBotCount(botUserId: Long, returnLocal: Boolean): TdlResult<Count> {
        return repository.send(
            function = GetBotSimilarBotCount(
                botUserId = botUserId,
                returnLocal = returnLocal,
            ),
        )
    }

    override suspend fun getBotSimilarBots(botUserId: Long): TdlResult<Users> {
        return repository.send(
            function = GetBotSimilarBots(
                botUserId = botUserId,
            ),
        )
    }

    override suspend fun getBusinessAccountStarAmount(businessConnectionId: String): TdlResult<StarAmount> {
        return repository.send(
            function = GetBusinessAccountStarAmount(
                businessConnectionId = businessConnectionId,
            ),
        )
    }

    override suspend fun getBusinessChatLinkInfo(linkName: String): TdlResult<BusinessChatLinkInfo> {
        return repository.send(
            function = GetBusinessChatLinkInfo(
                linkName = linkName,
            ),
        )
    }

    override suspend fun getBusinessChatLinks(): TdlResult<BusinessChatLinks> {
        return repository.send(
            function = GetBusinessChatLinks(),
        )
    }

    override suspend fun getBusinessConnectedBot(): TdlResult<BusinessConnectedBot> {
        return repository.send(
            function = GetBusinessConnectedBot(),
        )
    }

    override suspend fun getBusinessConnection(connectionId: String): TdlResult<BusinessConnection> {
        return repository.send(
            function = GetBusinessConnection(
                connectionId = connectionId,
            ),
        )
    }

    override suspend fun getBusinessFeatures(source: BusinessFeature?): TdlResult<BusinessFeatures> {
        return repository.send(
            function = GetBusinessFeatures(
                source = source,
            ),
        )
    }

    override suspend fun getCallbackQueryAnswer(
        chatId: Long,
        messageId: Long,
        payload: CallbackQueryPayload,
    ): TdlResult<CallbackQueryAnswer> {
        return repository.send(
            function = GetCallbackQueryAnswer(
                chatId = chatId,
                messageId = messageId,
                payload = payload,
            ),
        )
    }

    override suspend fun getCallbackQueryMessage(
        chatId: Long,
        messageId: Long,
        callbackQueryId: Long,
    ): TdlResult<Message> {
        return repository.send(
            function = GetCallbackQueryMessage(
                chatId = chatId,
                messageId = messageId,
                callbackQueryId = callbackQueryId,
            ),
        )
    }

    override suspend fun getChat(chatId: Long): TdlResult<Chat> {
        return repository.send(
            function = GetChat(
                chatId = chatId,
            ),
        )
    }

    override suspend fun getChatActiveStories(chatId: Long): TdlResult<ChatActiveStories> {
        return repository.send(
            function = GetChatActiveStories(
                chatId = chatId,
            ),
        )
    }

    override suspend fun getChatAdministrators(chatId: Long): TdlResult<ChatAdministrators> {
        return repository.send(
            function = GetChatAdministrators(
                chatId = chatId,
            ),
        )
    }

    override suspend fun getChatArchivedStories(
        chatId: Long,
        fromStoryId: Int,
        limit: Int,
    ): TdlResult<Stories> {
        return repository.send(
            function = GetChatArchivedStories(
                chatId = chatId,
                fromStoryId = fromStoryId,
                limit = limit,
            ),
        )
    }

    override suspend fun getChatAvailableMessageSenders(chatId: Long): TdlResult<ChatMessageSenders> {
        return repository.send(
            function = GetChatAvailableMessageSenders(
                chatId = chatId,
            ),
        )
    }

    override suspend fun getChatAvailablePaidMessageReactionSenders(chatId: Long): TdlResult<MessageSenders> {
        return repository.send(
            function = GetChatAvailablePaidMessageReactionSenders(
                chatId = chatId,
            ),
        )
    }

    override suspend fun getChatBoostFeatures(isChannel: Boolean): TdlResult<ChatBoostFeatures> {
        return repository.send(
            function = GetChatBoostFeatures(
                isChannel = isChannel,
            ),
        )
    }

    override suspend fun getChatBoostLevelFeatures(isChannel: Boolean, level: Int): TdlResult<ChatBoostLevelFeatures> {
        return repository.send(
            function = GetChatBoostLevelFeatures(
                isChannel = isChannel,
                level = level,
            ),
        )
    }

    override suspend fun getChatBoostLink(chatId: Long): TdlResult<ChatBoostLink> {
        return repository.send(
            function = GetChatBoostLink(
                chatId = chatId,
            ),
        )
    }

    override suspend fun getChatBoostLinkInfo(url: String): TdlResult<ChatBoostLinkInfo> {
        return repository.send(
            function = GetChatBoostLinkInfo(
                url = url,
            ),
        )
    }

    override suspend fun getChatBoostStatus(chatId: Long): TdlResult<ChatBoostStatus> {
        return repository.send(
            function = GetChatBoostStatus(
                chatId = chatId,
            ),
        )
    }

    override suspend fun getChatBoosts(
        chatId: Long,
        onlyGiftCodes: Boolean,
        offset: String,
        limit: Int,
    ): TdlResult<FoundChatBoosts> {
        return repository.send(
            function = GetChatBoosts(
                chatId = chatId,
                onlyGiftCodes = onlyGiftCodes,
                offset = offset,
                limit = limit,
            ),
        )
    }

    override suspend fun getChatEventLog(
        chatId: Long,
        query: String,
        fromEventId: Long,
        limit: Int,
        filters: ChatEventLogFilters?,
        userIds: LongArray,
    ): TdlResult<ChatEvents> {
        return repository.send(
            function = GetChatEventLog(
                chatId = chatId,
                query = query,
                fromEventId = fromEventId,
                limit = limit,
                filters = filters,
                userIds = userIds,
            ),
        )
    }

    override suspend fun getChatFolder(chatFolderId: Int): TdlResult<ChatFolder> {
        return repository.send(
            function = GetChatFolder(
                chatFolderId = chatFolderId,
            ),
        )
    }

    override suspend fun getChatFolderChatCount(folder: ChatFolder): TdlResult<Count> {
        return repository.send(
            function = GetChatFolderChatCount(
                folder = folder,
            ),
        )
    }

    override suspend fun getChatFolderChatsToLeave(chatFolderId: Int): TdlResult<Chats> {
        return repository.send(
            function = GetChatFolderChatsToLeave(
                chatFolderId = chatFolderId,
            ),
        )
    }

    override suspend fun getChatFolderDefaultIconName(folder: ChatFolder): TdlResult<ChatFolderIcon> {
        return repository.send(
            function = GetChatFolderDefaultIconName(
                folder = folder,
            ),
        )
    }

    override suspend fun getChatFolderInviteLinks(chatFolderId: Int): TdlResult<ChatFolderInviteLinks> {
        return repository.send(
            function = GetChatFolderInviteLinks(
                chatFolderId = chatFolderId,
            ),
        )
    }

    override suspend fun getChatFolderNewChats(chatFolderId: Int): TdlResult<Chats> {
        return repository.send(
            function = GetChatFolderNewChats(
                chatFolderId = chatFolderId,
            ),
        )
    }

    override suspend fun getChatHistory(
        chatId: Long,
        fromMessageId: Long,
        offset: Int,
        limit: Int,
        onlyLocal: Boolean,
    ): TdlResult<Messages> {
        return repository.send(
            function = GetChatHistory(
                chatId = chatId,
                fromMessageId = fromMessageId,
                offset = offset,
                limit = limit,
                onlyLocal = onlyLocal,
            ),
        )
    }

    override suspend fun getChatInviteLink(chatId: Long, inviteLink: String): TdlResult<ChatInviteLink> {
        return repository.send(
            function = GetChatInviteLink(
                chatId = chatId,
                inviteLink = inviteLink,
            ),
        )
    }

    override suspend fun getChatInviteLinkCounts(chatId: Long): TdlResult<ChatInviteLinkCounts> {
        return repository.send(
            function = GetChatInviteLinkCounts(
                chatId = chatId,
            ),
        )
    }

    override suspend fun getChatInviteLinkMembers(
        chatId: Long,
        inviteLink: String,
        onlyWithExpiredSubscription: Boolean,
        offsetMember: ChatInviteLinkMember?,
        limit: Int,
    ): TdlResult<ChatInviteLinkMembers> {
        return repository.send(
            function = GetChatInviteLinkMembers(
                chatId = chatId,
                inviteLink = inviteLink,
                onlyWithExpiredSubscription = onlyWithExpiredSubscription,
                offsetMember = offsetMember,
                limit = limit,
            ),
        )
    }

    override suspend fun getChatInviteLinks(
        chatId: Long,
        creatorUserId: Long,
        isRevoked: Boolean,
        offsetDate: Int,
        offsetInviteLink: String,
        limit: Int,
    ): TdlResult<ChatInviteLinks> {
        return repository.send(
            function = GetChatInviteLinks(
                chatId = chatId,
                creatorUserId = creatorUserId,
                isRevoked = isRevoked,
                offsetDate = offsetDate,
                offsetInviteLink = offsetInviteLink,
                limit = limit,
            ),
        )
    }

    override suspend fun getChatJoinRequests(
        chatId: Long,
        inviteLink: String,
        query: String,
        offsetRequest: ChatJoinRequest?,
        limit: Int,
    ): TdlResult<ChatJoinRequests> {
        return repository.send(
            function = GetChatJoinRequests(
                chatId = chatId,
                inviteLink = inviteLink,
                query = query,
                offsetRequest = offsetRequest,
                limit = limit,
            ),
        )
    }

    override suspend fun getChatListsToAddChat(chatId: Long): TdlResult<ChatLists> {
        return repository.send(
            function = GetChatListsToAddChat(
                chatId = chatId,
            ),
        )
    }

    override suspend fun getChatMember(chatId: Long, memberId: MessageSender): TdlResult<ChatMember> {
        return repository.send(
            function = GetChatMember(
                chatId = chatId,
                memberId = memberId,
            ),
        )
    }

    override suspend fun getChatMessageByDate(chatId: Long, date: Int): TdlResult<Message> {
        return repository.send(
            function = GetChatMessageByDate(
                chatId = chatId,
                date = date,
            ),
        )
    }

    override suspend fun getChatMessageCalendar(
        chatId: Long,
        topicId: MessageTopic?,
        filter: SearchMessagesFilter,
        fromMessageId: Long,
    ): TdlResult<MessageCalendar> {
        return repository.send(
            function = GetChatMessageCalendar(
                chatId = chatId,
                topicId = topicId,
                filter = filter,
                fromMessageId = fromMessageId,
            ),
        )
    }

    override suspend fun getChatMessageCount(
        chatId: Long,
        topicId: MessageTopic?,
        filter: SearchMessagesFilter,
        returnLocal: Boolean,
    ): TdlResult<Count> {
        return repository.send(
            function = GetChatMessageCount(
                chatId = chatId,
                topicId = topicId,
                filter = filter,
                returnLocal = returnLocal,
            ),
        )
    }

    override suspend fun getChatMessagePosition(
        chatId: Long,
        topicId: MessageTopic?,
        filter: SearchMessagesFilter,
        messageId: Long,
    ): TdlResult<Count> {
        return repository.send(
            function = GetChatMessagePosition(
                chatId = chatId,
                topicId = topicId,
                filter = filter,
                messageId = messageId,
            ),
        )
    }

    override suspend fun getChatNotificationSettingsExceptions(scope: NotificationSettingsScope?, compareSound: Boolean): TdlResult<Chats> {
        return repository.send(
            function = GetChatNotificationSettingsExceptions(
                scope = scope,
                compareSound = compareSound,
            ),
        )
    }

    override suspend fun getChatPinnedMessage(chatId: Long): TdlResult<Message> {
        return repository.send(
            function = GetChatPinnedMessage(
                chatId = chatId,
            ),
        )
    }

    override suspend fun getChatPostedToChatPageStories(
        chatId: Long,
        fromStoryId: Int,
        limit: Int,
    ): TdlResult<Stories> {
        return repository.send(
            function = GetChatPostedToChatPageStories(
                chatId = chatId,
                fromStoryId = fromStoryId,
                limit = limit,
            ),
        )
    }

    override suspend fun getChatRevenueStatistics(chatId: Long, isDark: Boolean): TdlResult<ChatRevenueStatistics> {
        return repository.send(
            function = GetChatRevenueStatistics(
                chatId = chatId,
                isDark = isDark,
            ),
        )
    }

    override suspend fun getChatRevenueTransactions(
        chatId: Long,
        offset: Int,
        limit: Int,
    ): TdlResult<ChatRevenueTransactions> {
        return repository.send(
            function = GetChatRevenueTransactions(
                chatId = chatId,
                offset = offset,
                limit = limit,
            ),
        )
    }

    override suspend fun getChatRevenueWithdrawalUrl(chatId: Long, password: String): TdlResult<HttpUrl> {
        return repository.send(
            function = GetChatRevenueWithdrawalUrl(
                chatId = chatId,
                password = password,
            ),
        )
    }

    override suspend fun getChatScheduledMessages(chatId: Long): TdlResult<Messages> {
        return repository.send(
            function = GetChatScheduledMessages(
                chatId = chatId,
            ),
        )
    }

    override suspend fun getChatSimilarChatCount(chatId: Long, returnLocal: Boolean): TdlResult<Count> {
        return repository.send(
            function = GetChatSimilarChatCount(
                chatId = chatId,
                returnLocal = returnLocal,
            ),
        )
    }

    override suspend fun getChatSimilarChats(chatId: Long): TdlResult<Chats> {
        return repository.send(
            function = GetChatSimilarChats(
                chatId = chatId,
            ),
        )
    }

    override suspend fun getChatSparseMessagePositions(
        chatId: Long,
        filter: SearchMessagesFilter,
        fromMessageId: Long,
        limit: Int,
        savedMessagesTopicId: Long,
    ): TdlResult<MessagePositions> {
        return repository.send(
            function = GetChatSparseMessagePositions(
                chatId = chatId,
                filter = filter,
                fromMessageId = fromMessageId,
                limit = limit,
                savedMessagesTopicId = savedMessagesTopicId,
            ),
        )
    }

    override suspend fun getChatSponsoredMessages(chatId: Long): TdlResult<SponsoredMessages> {
        return repository.send(
            function = GetChatSponsoredMessages(
                chatId = chatId,
            ),
        )
    }

    override suspend fun getChatStatistics(chatId: Long, isDark: Boolean): TdlResult<ChatStatistics> {
        return repository.send(
            function = GetChatStatistics(
                chatId = chatId,
                isDark = isDark,
            ),
        )
    }

    override suspend fun getChatStoryInteractions(
        storyPosterChatId: Long,
        storyId: Int,
        reactionType: ReactionType?,
        preferForwards: Boolean,
        offset: String,
        limit: Int,
    ): TdlResult<StoryInteractions> {
        return repository.send(
            function = GetChatStoryInteractions(
                storyPosterChatId = storyPosterChatId,
                storyId = storyId,
                reactionType = reactionType,
                preferForwards = preferForwards,
                offset = offset,
                limit = limit,
            ),
        )
    }

    override suspend fun getChats(chatList: ChatList?, limit: Int): TdlResult<Chats> {
        return repository.send(
            function = GetChats(
                chatList = chatList,
                limit = limit,
            ),
        )
    }

    override suspend fun getChatsForChatFolderInviteLink(chatFolderId: Int): TdlResult<Chats> {
        return repository.send(
            function = GetChatsForChatFolderInviteLink(
                chatFolderId = chatFolderId,
            ),
        )
    }

    override suspend fun getChatsToPostStories(): TdlResult<Chats> {
        return repository.send(
            function = GetChatsToPostStories(),
        )
    }

    override suspend fun getCloseFriends(): TdlResult<Users> {
        return repository.send(
            function = GetCloseFriends(),
        )
    }

    override suspend fun getCollectibleItemInfo(type: CollectibleItemType): TdlResult<CollectibleItemInfo> {
        return repository.send(
            function = GetCollectibleItemInfo(
                type = type,
            ),
        )
    }

    override suspend fun getCommands(scope: BotCommandScope?, languageCode: String): TdlResult<BotCommands> {
        return repository.send(
            function = GetCommands(
                scope = scope,
                languageCode = languageCode,
            ),
        )
    }

    override suspend fun getConnectedAffiliateProgram(affiliate: AffiliateType, botUserId: Long): TdlResult<ConnectedAffiliateProgram> {
        return repository.send(
            function = GetConnectedAffiliateProgram(
                affiliate = affiliate,
                botUserId = botUserId,
            ),
        )
    }

    override suspend fun getConnectedAffiliatePrograms(
        affiliate: AffiliateType,
        offset: String,
        limit: Int,
    ): TdlResult<ConnectedAffiliatePrograms> {
        return repository.send(
            function = GetConnectedAffiliatePrograms(
                affiliate = affiliate,
                offset = offset,
                limit = limit,
            ),
        )
    }

    override suspend fun getConnectedWebsites(): TdlResult<ConnectedWebsites> {
        return repository.send(
            function = GetConnectedWebsites(),
        )
    }

    override suspend fun getContacts(): TdlResult<Users> {
        return repository.send(
            function = GetContacts(),
        )
    }

    override suspend fun getCountries(): TdlResult<Countries> {
        return repository.send(
            function = GetCountries(),
        )
    }

    override suspend fun getCountryCode(): TdlResult<Text> {
        return repository.send(
            function = GetCountryCode(),
        )
    }

    override suspend fun getCountryFlagEmoji(countryCode: String): TdlResult<Text> {
        return repository.send(
            function = GetCountryFlagEmoji(
                countryCode = countryCode,
            ),
        )
    }

    override suspend fun getCreatedPublicChats(type: PublicChatType): TdlResult<Chats> {
        return repository.send(
            function = GetCreatedPublicChats(
                type = type,
            ),
        )
    }

    override suspend fun getCurrentState(): TdlResult<Updates> {
        return repository.send(
            function = GetCurrentState(),
        )
    }

    override suspend fun getCurrentWeather(location: Location): TdlResult<CurrentWeather> {
        return repository.send(
            function = GetCurrentWeather(
                location = location,
            ),
        )
    }

    override suspend fun getCustomEmojiReactionAnimations(): TdlResult<Stickers> {
        return repository.send(
            function = GetCustomEmojiReactionAnimations(),
        )
    }

    override suspend fun getCustomEmojiStickers(customEmojiIds: LongArray): TdlResult<Stickers> {
        return repository.send(
            function = GetCustomEmojiStickers(
                customEmojiIds = customEmojiIds,
            ),
        )
    }

    override suspend fun getDatabaseStatistics(): TdlResult<DatabaseStatistics> {
        return repository.send(
            function = GetDatabaseStatistics(),
        )
    }

    override suspend fun getDeepLinkInfo(link: String): TdlResult<DeepLinkInfo> {
        return repository.send(
            function = GetDeepLinkInfo(
                link = link,
            ),
        )
    }

    override suspend fun getDefaultBackgroundCustomEmojiStickers(): TdlResult<Stickers> {
        return repository.send(
            function = GetDefaultBackgroundCustomEmojiStickers(),
        )
    }

    override suspend fun getDefaultChatEmojiStatuses(): TdlResult<EmojiStatusCustomEmojis> {
        return repository.send(
            function = GetDefaultChatEmojiStatuses(),
        )
    }

    override suspend fun getDefaultChatPhotoCustomEmojiStickers(): TdlResult<Stickers> {
        return repository.send(
            function = GetDefaultChatPhotoCustomEmojiStickers(),
        )
    }

    override suspend fun getDefaultEmojiStatuses(): TdlResult<EmojiStatusCustomEmojis> {
        return repository.send(
            function = GetDefaultEmojiStatuses(),
        )
    }

    override suspend fun getDefaultMessageAutoDeleteTime(): TdlResult<MessageAutoDeleteTime> {
        return repository.send(
            function = GetDefaultMessageAutoDeleteTime(),
        )
    }

    override suspend fun getDefaultProfilePhotoCustomEmojiStickers(): TdlResult<Stickers> {
        return repository.send(
            function = GetDefaultProfilePhotoCustomEmojiStickers(),
        )
    }

    override suspend fun getDirectMessagesChatTopic(chatId: Long, topicId: Long): TdlResult<DirectMessagesChatTopic> {
        return repository.send(
            function = GetDirectMessagesChatTopic(
                chatId = chatId,
                topicId = topicId,
            ),
        )
    }

    override suspend fun getDirectMessagesChatTopicHistory(
        chatId: Long,
        topicId: Long,
        fromMessageId: Long,
        offset: Int,
        limit: Int,
    ): TdlResult<Messages> {
        return repository.send(
            function = GetDirectMessagesChatTopicHistory(
                chatId = chatId,
                topicId = topicId,
                fromMessageId = fromMessageId,
                offset = offset,
                limit = limit,
            ),
        )
    }

    override suspend fun getDirectMessagesChatTopicMessageByDate(
        chatId: Long,
        topicId: Long,
        date: Int,
    ): TdlResult<Message> {
        return repository.send(
            function = GetDirectMessagesChatTopicMessageByDate(
                chatId = chatId,
                topicId = topicId,
                date = date,
            ),
        )
    }

    override suspend fun getDisallowedChatEmojiStatuses(): TdlResult<EmojiStatusCustomEmojis> {
        return repository.send(
            function = GetDisallowedChatEmojiStatuses(),
        )
    }

    override suspend fun getEmojiCategories(type: EmojiCategoryType?): TdlResult<EmojiCategories> {
        return repository.send(
            function = GetEmojiCategories(
                type = type,
            ),
        )
    }

    override suspend fun getEmojiReaction(emoji: String): TdlResult<EmojiReaction> {
        return repository.send(
            function = GetEmojiReaction(
                emoji = emoji,
            ),
        )
    }

    override suspend fun getEmojiSuggestionsUrl(languageCode: String): TdlResult<HttpUrl> {
        return repository.send(
            function = GetEmojiSuggestionsUrl(
                languageCode = languageCode,
            ),
        )
    }

    override suspend fun getExternalLink(link: String, allowWriteAccess: Boolean): TdlResult<HttpUrl> {
        return repository.send(
            function = GetExternalLink(
                link = link,
                allowWriteAccess = allowWriteAccess,
            ),
        )
    }

    override suspend fun getExternalLinkInfo(link: String): TdlResult<LoginUrlInfo> {
        return repository.send(
            function = GetExternalLinkInfo(
                link = link,
            ),
        )
    }

    override suspend fun getFavoriteStickers(): TdlResult<Stickers> {
        return repository.send(
            function = GetFavoriteStickers(),
        )
    }

    override suspend fun getFile(fileId: Int): TdlResult<File> {
        return repository.send(
            function = GetFile(
                fileId = fileId,
            ),
        )
    }

    override suspend fun getFileDownloadedPrefixSize(fileId: Int, offset: Long): TdlResult<FileDownloadedPrefixSize> {
        return repository.send(
            function = GetFileDownloadedPrefixSize(
                fileId = fileId,
                offset = offset,
            ),
        )
    }

    override suspend fun getFileExtension(mimeType: String): TdlResult<Text> {
        return repository.send(
            function = GetFileExtension(
                mimeType = mimeType,
            ),
        )
    }

    override suspend fun getFileMimeType(fileName: String): TdlResult<Text> {
        return repository.send(
            function = GetFileMimeType(
                fileName = fileName,
            ),
        )
    }

    override suspend fun getForumTopic(chatId: Long, messageThreadId: Long): TdlResult<ForumTopic> {
        return repository.send(
            function = GetForumTopic(
                chatId = chatId,
                messageThreadId = messageThreadId,
            ),
        )
    }

    override suspend fun getForumTopicDefaultIcons(): TdlResult<Stickers> {
        return repository.send(
            function = GetForumTopicDefaultIcons(),
        )
    }

    override suspend fun getForumTopicLink(chatId: Long, messageThreadId: Long): TdlResult<MessageLink> {
        return repository.send(
            function = GetForumTopicLink(
                chatId = chatId,
                messageThreadId = messageThreadId,
            ),
        )
    }

    override suspend fun getForumTopics(
        chatId: Long,
        query: String,
        offsetDate: Int,
        offsetMessageId: Long,
        offsetMessageThreadId: Long,
        limit: Int,
    ): TdlResult<ForumTopics> {
        return repository.send(
            function = GetForumTopics(
                chatId = chatId,
                query = query,
                offsetDate = offsetDate,
                offsetMessageId = offsetMessageId,
                offsetMessageThreadId = offsetMessageThreadId,
                limit = limit,
            ),
        )
    }

    override suspend fun getGameHighScores(
        chatId: Long,
        messageId: Long,
        userId: Long,
    ): TdlResult<GameHighScores> {
        return repository.send(
            function = GetGameHighScores(
                chatId = chatId,
                messageId = messageId,
                userId = userId,
            ),
        )
    }

    override suspend fun getGiftUpgradePreview(giftId: Long): TdlResult<GiftUpgradePreview> {
        return repository.send(
            function = GetGiftUpgradePreview(
                giftId = giftId,
            ),
        )
    }

    override suspend fun getGiveawayInfo(chatId: Long, messageId: Long): TdlResult<GiveawayInfo> {
        return repository.send(
            function = GetGiveawayInfo(
                chatId = chatId,
                messageId = messageId,
            ),
        )
    }

    override suspend fun getGreetingStickers(): TdlResult<Stickers> {
        return repository.send(
            function = GetGreetingStickers(),
        )
    }

    override suspend fun getGrossingWebAppBots(offset: String, limit: Int): TdlResult<FoundUsers> {
        return repository.send(
            function = GetGrossingWebAppBots(
                offset = offset,
                limit = limit,
            ),
        )
    }

    override suspend fun getGroupCall(groupCallId: Int): TdlResult<GroupCall> {
        return repository.send(
            function = GetGroupCall(
                groupCallId = groupCallId,
            ),
        )
    }

    override suspend fun getGroupCallParticipants(inputGroupCall: InputGroupCall, limit: Int): TdlResult<GroupCallParticipants> {
        return repository.send(
            function = GetGroupCallParticipants(
                inputGroupCall = inputGroupCall,
                limit = limit,
            ),
        )
    }

    override suspend fun getGroupsInCommon(
        userId: Long,
        offsetChatId: Long,
        limit: Int,
    ): TdlResult<Chats> {
        return repository.send(
            function = GetGroupsInCommon(
                userId = userId,
                offsetChatId = offsetChatId,
                limit = limit,
            ),
        )
    }

    override suspend fun getImportedContactCount(): TdlResult<Count> {
        return repository.send(
            function = GetImportedContactCount(),
        )
    }

    override suspend fun getInactiveSupergroupChats(): TdlResult<Chats> {
        return repository.send(
            function = GetInactiveSupergroupChats(),
        )
    }

    override suspend fun getInlineGameHighScores(inlineMessageId: String, userId: Long): TdlResult<GameHighScores> {
        return repository.send(
            function = GetInlineGameHighScores(
                inlineMessageId = inlineMessageId,
                userId = userId,
            ),
        )
    }

    override suspend fun getInlineQueryResults(
        botUserId: Long,
        chatId: Long,
        userLocation: Location?,
        query: String,
        offset: String,
    ): TdlResult<InlineQueryResults> {
        return repository.send(
            function = GetInlineQueryResults(
                botUserId = botUserId,
                chatId = chatId,
                userLocation = userLocation,
                query = query,
                offset = offset,
            ),
        )
    }

    override suspend fun getInstalledBackgrounds(forDarkTheme: Boolean): TdlResult<Backgrounds> {
        return repository.send(
            function = GetInstalledBackgrounds(
                forDarkTheme = forDarkTheme,
            ),
        )
    }

    override suspend fun getInstalledStickerSets(stickerType: StickerType): TdlResult<StickerSets> {
        return repository.send(
            function = GetInstalledStickerSets(
                stickerType = stickerType,
            ),
        )
    }

    override suspend fun getInternalLink(type: InternalLinkType, isHttp: Boolean): TdlResult<HttpUrl> {
        return repository.send(
            function = GetInternalLink(
                type = type,
                isHttp = isHttp,
            ),
        )
    }

    override suspend fun getInternalLinkType(link: String): TdlResult<InternalLinkType> {
        return repository.send(
            function = GetInternalLinkType(
                link = link,
            ),
        )
    }

    override suspend fun getJsonString(jsonValue: JsonValue): TdlResult<Text> {
        return repository.send(
            function = GetJsonString(
                jsonValue = jsonValue,
            ),
        )
    }

    override suspend fun getJsonValue(json: String): TdlResult<JsonValue> {
        return repository.send(
            function = GetJsonValue(
                json = json,
            ),
        )
    }

    override suspend fun getKeywordEmojis(text: String, inputLanguageCodes: Array<String>): TdlResult<Emojis> {
        return repository.send(
            function = GetKeywordEmojis(
                text = text,
                inputLanguageCodes = inputLanguageCodes,
            ),
        )
    }

    override suspend fun getLanguagePackInfo(languagePackId: String): TdlResult<LanguagePackInfo> {
        return repository.send(
            function = GetLanguagePackInfo(
                languagePackId = languagePackId,
            ),
        )
    }

    override suspend fun getLanguagePackString(
        languagePackDatabasePath: String,
        localizationTarget: String,
        languagePackId: String,
        key: String,
    ): TdlResult<LanguagePackStringValue> {
        return repository.send(
            function = GetLanguagePackString(
                languagePackDatabasePath = languagePackDatabasePath,
                localizationTarget = localizationTarget,
                languagePackId = languagePackId,
                key = key,
            ),
        )
    }

    override suspend fun getLanguagePackStrings(languagePackId: String, keys: Array<String>): TdlResult<LanguagePackStrings> {
        return repository.send(
            function = GetLanguagePackStrings(
                languagePackId = languagePackId,
                keys = keys,
            ),
        )
    }

    override suspend fun getLinkPreview(text: FormattedText, linkPreviewOptions: LinkPreviewOptions?): TdlResult<LinkPreview> {
        return repository.send(
            function = GetLinkPreview(
                text = text,
                linkPreviewOptions = linkPreviewOptions,
            ),
        )
    }

    override suspend fun getLocalizationTargetInfo(onlyLocal: Boolean): TdlResult<LocalizationTargetInfo> {
        return repository.send(
            function = GetLocalizationTargetInfo(
                onlyLocal = onlyLocal,
            ),
        )
    }

    override suspend fun getLogStream(): TdlResult<LogStream> {
        return repository.send(
            function = GetLogStream(),
        )
    }

    override suspend fun getLogTagVerbosityLevel(tag: String): TdlResult<LogVerbosityLevel> {
        return repository.send(
            function = GetLogTagVerbosityLevel(
                tag = tag,
            ),
        )
    }

    override suspend fun getLogTags(): TdlResult<LogTags> {
        return repository.send(
            function = GetLogTags(),
        )
    }

    override suspend fun getLogVerbosityLevel(): TdlResult<LogVerbosityLevel> {
        return repository.send(
            function = GetLogVerbosityLevel(),
        )
    }

    override suspend fun getLoginUrl(
        chatId: Long,
        messageId: Long,
        buttonId: Long,
        allowWriteAccess: Boolean,
    ): TdlResult<HttpUrl> {
        return repository.send(
            function = GetLoginUrl(
                chatId = chatId,
                messageId = messageId,
                buttonId = buttonId,
                allowWriteAccess = allowWriteAccess,
            ),
        )
    }

    override suspend fun getLoginUrlInfo(
        chatId: Long,
        messageId: Long,
        buttonId: Long,
    ): TdlResult<LoginUrlInfo> {
        return repository.send(
            function = GetLoginUrlInfo(
                chatId = chatId,
                messageId = messageId,
                buttonId = buttonId,
            ),
        )
    }

    override suspend fun getMainWebApp(
        chatId: Long,
        botUserId: Long,
        startParameter: String,
        parameters: WebAppOpenParameters,
    ): TdlResult<MainWebApp> {
        return repository.send(
            function = GetMainWebApp(
                chatId = chatId,
                botUserId = botUserId,
                startParameter = startParameter,
                parameters = parameters,
            ),
        )
    }

    override suspend fun getMapThumbnailFile(
        location: Location,
        zoom: Int,
        width: Int,
        height: Int,
        scale: Int,
        chatId: Long,
    ): TdlResult<File> {
        return repository.send(
            function = GetMapThumbnailFile(
                location = location,
                zoom = zoom,
                width = width,
                height = height,
                scale = scale,
                chatId = chatId,
            ),
        )
    }

    override suspend fun getMarkdownText(text: FormattedText): TdlResult<FormattedText> {
        return repository.send(
            function = GetMarkdownText(
                text = text,
            ),
        )
    }

    override suspend fun getMe(): TdlResult<User> {
        return repository.send(
            function = GetMe(),
        )
    }

    override suspend fun getMenuButton(userId: Long): TdlResult<BotMenuButton> {
        return repository.send(
            function = GetMenuButton(
                userId = userId,
            ),
        )
    }

    override suspend fun getMessage(chatId: Long, messageId: Long): TdlResult<Message> {
        return repository.send(
            function = GetMessage(
                chatId = chatId,
                messageId = messageId,
            ),
        )
    }

    override suspend fun getMessageAddedReactions(
        chatId: Long,
        messageId: Long,
        reactionType: ReactionType?,
        offset: String,
        limit: Int,
    ): TdlResult<AddedReactions> {
        return repository.send(
            function = GetMessageAddedReactions(
                chatId = chatId,
                messageId = messageId,
                reactionType = reactionType,
                offset = offset,
                limit = limit,
            ),
        )
    }

    override suspend fun getMessageAuthor(chatId: Long, messageId: Long): TdlResult<User> {
        return repository.send(
            function = GetMessageAuthor(
                chatId = chatId,
                messageId = messageId,
            ),
        )
    }

    override suspend fun getMessageAvailableReactions(
        chatId: Long,
        messageId: Long,
        rowSize: Int,
    ): TdlResult<AvailableReactions> {
        return repository.send(
            function = GetMessageAvailableReactions(
                chatId = chatId,
                messageId = messageId,
                rowSize = rowSize,
            ),
        )
    }

    override suspend fun getMessageEffect(effectId: Long): TdlResult<MessageEffect> {
        return repository.send(
            function = GetMessageEffect(
                effectId = effectId,
            ),
        )
    }

    override suspend fun getMessageEmbeddingCode(
        chatId: Long,
        messageId: Long,
        forAlbum: Boolean,
    ): TdlResult<Text> {
        return repository.send(
            function = GetMessageEmbeddingCode(
                chatId = chatId,
                messageId = messageId,
                forAlbum = forAlbum,
            ),
        )
    }

    override suspend fun getMessageFileType(messageFileHead: String): TdlResult<MessageFileType> {
        return repository.send(
            function = GetMessageFileType(
                messageFileHead = messageFileHead,
            ),
        )
    }

    override suspend fun getMessageImportConfirmationText(chatId: Long): TdlResult<Text> {
        return repository.send(
            function = GetMessageImportConfirmationText(
                chatId = chatId,
            ),
        )
    }

    override suspend fun getMessageLink(
        chatId: Long,
        messageId: Long,
        mediaTimestamp: Int,
        forAlbum: Boolean,
        inMessageThread: Boolean,
    ): TdlResult<MessageLink> {
        return repository.send(
            function = GetMessageLink(
                chatId = chatId,
                messageId = messageId,
                mediaTimestamp = mediaTimestamp,
                forAlbum = forAlbum,
                inMessageThread = inMessageThread,
            ),
        )
    }

    override suspend fun getMessageLinkInfo(url: String): TdlResult<MessageLinkInfo> {
        return repository.send(
            function = GetMessageLinkInfo(
                url = url,
            ),
        )
    }

    override suspend fun getMessageLocally(chatId: Long, messageId: Long): TdlResult<Message> {
        return repository.send(
            function = GetMessageLocally(
                chatId = chatId,
                messageId = messageId,
            ),
        )
    }

    override suspend fun getMessageProperties(chatId: Long, messageId: Long): TdlResult<MessageProperties> {
        return repository.send(
            function = GetMessageProperties(
                chatId = chatId,
                messageId = messageId,
            ),
        )
    }

    override suspend fun getMessagePublicForwards(
        chatId: Long,
        messageId: Long,
        offset: String,
        limit: Int,
    ): TdlResult<PublicForwards> {
        return repository.send(
            function = GetMessagePublicForwards(
                chatId = chatId,
                messageId = messageId,
                offset = offset,
                limit = limit,
            ),
        )
    }

    override suspend fun getMessageReadDate(chatId: Long, messageId: Long): TdlResult<MessageReadDate> {
        return repository.send(
            function = GetMessageReadDate(
                chatId = chatId,
                messageId = messageId,
            ),
        )
    }

    override suspend fun getMessageStatistics(
        chatId: Long,
        messageId: Long,
        isDark: Boolean,
    ): TdlResult<MessageStatistics> {
        return repository.send(
            function = GetMessageStatistics(
                chatId = chatId,
                messageId = messageId,
                isDark = isDark,
            ),
        )
    }

    override suspend fun getMessageThread(chatId: Long, messageId: Long): TdlResult<MessageThreadInfo> {
        return repository.send(
            function = GetMessageThread(
                chatId = chatId,
                messageId = messageId,
            ),
        )
    }

    override suspend fun getMessageThreadHistory(
        chatId: Long,
        messageId: Long,
        fromMessageId: Long,
        offset: Int,
        limit: Int,
    ): TdlResult<Messages> {
        return repository.send(
            function = GetMessageThreadHistory(
                chatId = chatId,
                messageId = messageId,
                fromMessageId = fromMessageId,
                offset = offset,
                limit = limit,
            ),
        )
    }

    override suspend fun getMessageViewers(chatId: Long, messageId: Long): TdlResult<MessageViewers> {
        return repository.send(
            function = GetMessageViewers(
                chatId = chatId,
                messageId = messageId,
            ),
        )
    }

    override suspend fun getMessages(chatId: Long, messageIds: LongArray): TdlResult<Messages> {
        return repository.send(
            function = GetMessages(
                chatId = chatId,
                messageIds = messageIds,
            ),
        )
    }

    override suspend fun getNetworkStatistics(onlyCurrent: Boolean): TdlResult<NetworkStatistics> {
        return repository.send(
            function = GetNetworkStatistics(
                onlyCurrent = onlyCurrent,
            ),
        )
    }

    override suspend fun getNewChatPrivacySettings(): TdlResult<NewChatPrivacySettings> {
        return repository.send(
            function = GetNewChatPrivacySettings(),
        )
    }

    override suspend fun getOption(name: String): TdlResult<OptionValue> {
        return repository.send(
            function = GetOption(
                name = name,
            ),
        )
    }

    override suspend fun getOwnedBots(): TdlResult<Users> {
        return repository.send(
            function = GetOwnedBots(),
        )
    }

    override suspend fun getOwnedStickerSets(offsetStickerSetId: Long, limit: Int): TdlResult<StickerSets> {
        return repository.send(
            function = GetOwnedStickerSets(
                offsetStickerSetId = offsetStickerSetId,
                limit = limit,
            ),
        )
    }

    override suspend fun getPaidMessageRevenue(userId: Long): TdlResult<StarCount> {
        return repository.send(
            function = GetPaidMessageRevenue(
                userId = userId,
            ),
        )
    }

    override suspend fun getPassportAuthorizationForm(
        botUserId: Long,
        scope: String,
        publicKey: String,
        nonce: String,
    ): TdlResult<PassportAuthorizationForm> {
        return repository.send(
            function = GetPassportAuthorizationForm(
                botUserId = botUserId,
                scope = scope,
                publicKey = publicKey,
                nonce = nonce,
            ),
        )
    }

    override suspend fun getPassportAuthorizationFormAvailableElements(authorizationFormId: Int, password: String): TdlResult<PassportElementsWithErrors> {
        return repository.send(
            function = GetPassportAuthorizationFormAvailableElements(
                authorizationFormId = authorizationFormId,
                password = password,
            ),
        )
    }

    override suspend fun getPassportElement(type: PassportElementType, password: String): TdlResult<PassportElement> {
        return repository.send(
            function = GetPassportElement(
                type = type,
                password = password,
            ),
        )
    }

    override suspend fun getPasswordState(): TdlResult<PasswordState> {
        return repository.send(
            function = GetPasswordState(),
        )
    }

    override suspend fun getPaymentForm(inputInvoice: InputInvoice, theme: ThemeParameters?): TdlResult<PaymentForm> {
        return repository.send(
            function = GetPaymentForm(
                inputInvoice = inputInvoice,
                theme = theme,
            ),
        )
    }

    override suspend fun getPaymentReceipt(chatId: Long, messageId: Long): TdlResult<PaymentReceipt> {
        return repository.send(
            function = GetPaymentReceipt(
                chatId = chatId,
                messageId = messageId,
            ),
        )
    }

    override suspend fun getPhoneNumberInfo(phoneNumberPrefix: String): TdlResult<PhoneNumberInfo> {
        return repository.send(
            function = GetPhoneNumberInfo(
                phoneNumberPrefix = phoneNumberPrefix,
            ),
        )
    }

    override suspend fun getPhoneNumberInfoSync(languageCode: String, phoneNumberPrefix: String): TdlResult<PhoneNumberInfo> {
        return repository.send(
            function = GetPhoneNumberInfoSync(
                languageCode = languageCode,
                phoneNumberPrefix = phoneNumberPrefix,
            ),
        )
    }

    override suspend fun getPollVoters(
        chatId: Long,
        messageId: Long,
        optionId: Int,
        offset: Int,
        limit: Int,
    ): TdlResult<MessageSenders> {
        return repository.send(
            function = GetPollVoters(
                chatId = chatId,
                messageId = messageId,
                optionId = optionId,
                offset = offset,
                limit = limit,
            ),
        )
    }

    override suspend fun getPreferredCountryLanguage(countryCode: String): TdlResult<Text> {
        return repository.send(
            function = GetPreferredCountryLanguage(
                countryCode = countryCode,
            ),
        )
    }

    override suspend fun getPremiumFeatures(source: PremiumSource?): TdlResult<PremiumFeatures> {
        return repository.send(
            function = GetPremiumFeatures(
                source = source,
            ),
        )
    }

    override suspend fun getPremiumGiftPaymentOptions(): TdlResult<PremiumGiftPaymentOptions> {
        return repository.send(
            function = GetPremiumGiftPaymentOptions(),
        )
    }

    override suspend fun getPremiumGiveawayPaymentOptions(boostedChatId: Long): TdlResult<PremiumGiveawayPaymentOptions> {
        return repository.send(
            function = GetPremiumGiveawayPaymentOptions(
                boostedChatId = boostedChatId,
            ),
        )
    }

    override suspend fun getPremiumInfoSticker(monthCount: Int): TdlResult<Sticker> {
        return repository.send(
            function = GetPremiumInfoSticker(
                monthCount = monthCount,
            ),
        )
    }

    override suspend fun getPremiumLimit(limitType: PremiumLimitType): TdlResult<PremiumLimit> {
        return repository.send(
            function = GetPremiumLimit(
                limitType = limitType,
            ),
        )
    }

    override suspend fun getPremiumState(): TdlResult<PremiumState> {
        return repository.send(
            function = GetPremiumState(),
        )
    }

    override suspend fun getPremiumStickerExamples(): TdlResult<Stickers> {
        return repository.send(
            function = GetPremiumStickerExamples(),
        )
    }

    override suspend fun getPremiumStickers(limit: Int): TdlResult<Stickers> {
        return repository.send(
            function = GetPremiumStickers(
                limit = limit,
            ),
        )
    }

    override suspend fun getPreparedInlineMessage(botUserId: Long, preparedMessageId: String): TdlResult<PreparedInlineMessage> {
        return repository.send(
            function = GetPreparedInlineMessage(
                botUserId = botUserId,
                preparedMessageId = preparedMessageId,
            ),
        )
    }

    override suspend fun getProxies(): TdlResult<Proxies> {
        return repository.send(
            function = GetProxies(),
        )
    }

    override suspend fun getProxyLink(proxyId: Int): TdlResult<HttpUrl> {
        return repository.send(
            function = GetProxyLink(
                proxyId = proxyId,
            ),
        )
    }

    override suspend fun getPushReceiverId(payload: String): TdlResult<PushReceiverId> {
        return repository.send(
            function = GetPushReceiverId(
                payload = payload,
            ),
        )
    }

    override suspend fun getReadDatePrivacySettings(): TdlResult<ReadDatePrivacySettings> {
        return repository.send(
            function = GetReadDatePrivacySettings(),
        )
    }

    override suspend fun getReceivedGift(receivedGiftId: String): TdlResult<ReceivedGift> {
        return repository.send(
            function = GetReceivedGift(
                receivedGiftId = receivedGiftId,
            ),
        )
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
        return repository.send(
            function = GetReceivedGifts(
                businessConnectionId = businessConnectionId,
                ownerId = ownerId,
                excludeUnsaved = excludeUnsaved,
                excludeSaved = excludeSaved,
                excludeUnlimited = excludeUnlimited,
                excludeLimited = excludeLimited,
                excludeUpgraded = excludeUpgraded,
                sortByPrice = sortByPrice,
                offset = offset,
                limit = limit,
            ),
        )
    }

    override suspend fun getRecentEmojiStatuses(): TdlResult<EmojiStatuses> {
        return repository.send(
            function = GetRecentEmojiStatuses(),
        )
    }

    override suspend fun getRecentInlineBots(): TdlResult<Users> {
        return repository.send(
            function = GetRecentInlineBots(),
        )
    }

    override suspend fun getRecentStickers(isAttached: Boolean): TdlResult<Stickers> {
        return repository.send(
            function = GetRecentStickers(
                isAttached = isAttached,
            ),
        )
    }

    override suspend fun getRecentlyOpenedChats(limit: Int): TdlResult<Chats> {
        return repository.send(
            function = GetRecentlyOpenedChats(
                limit = limit,
            ),
        )
    }

    override suspend fun getRecentlyVisitedTMeUrls(referrer: String): TdlResult<TMeUrls> {
        return repository.send(
            function = GetRecentlyVisitedTMeUrls(
                referrer = referrer,
            ),
        )
    }

    override suspend fun getRecommendedChatFolders(): TdlResult<RecommendedChatFolders> {
        return repository.send(
            function = GetRecommendedChatFolders(),
        )
    }

    override suspend fun getRecommendedChats(): TdlResult<Chats> {
        return repository.send(
            function = GetRecommendedChats(),
        )
    }

    override suspend fun getRecoveryEmailAddress(password: String): TdlResult<RecoveryEmailAddress> {
        return repository.send(
            function = GetRecoveryEmailAddress(
                password = password,
            ),
        )
    }

    override suspend fun getRemoteFile(remoteFileId: String, fileType: FileType?): TdlResult<File> {
        return repository.send(
            function = GetRemoteFile(
                remoteFileId = remoteFileId,
                fileType = fileType,
            ),
        )
    }

    override suspend fun getRepliedMessage(chatId: Long, messageId: Long): TdlResult<Message> {
        return repository.send(
            function = GetRepliedMessage(
                chatId = chatId,
                messageId = messageId,
            ),
        )
    }

    override suspend fun getSavedAnimations(): TdlResult<Animations> {
        return repository.send(
            function = GetSavedAnimations(),
        )
    }

    override suspend fun getSavedMessagesTags(savedMessagesTopicId: Long): TdlResult<SavedMessagesTags> {
        return repository.send(
            function = GetSavedMessagesTags(
                savedMessagesTopicId = savedMessagesTopicId,
            ),
        )
    }

    override suspend fun getSavedMessagesTopicHistory(
        savedMessagesTopicId: Long,
        fromMessageId: Long,
        offset: Int,
        limit: Int,
    ): TdlResult<Messages> {
        return repository.send(
            function = GetSavedMessagesTopicHistory(
                savedMessagesTopicId = savedMessagesTopicId,
                fromMessageId = fromMessageId,
                offset = offset,
                limit = limit,
            ),
        )
    }

    override suspend fun getSavedMessagesTopicMessageByDate(savedMessagesTopicId: Long, date: Int): TdlResult<Message> {
        return repository.send(
            function = GetSavedMessagesTopicMessageByDate(
                savedMessagesTopicId = savedMessagesTopicId,
                date = date,
            ),
        )
    }

    override suspend fun getSavedNotificationSound(notificationSoundId: Long): TdlResult<NotificationSounds> {
        return repository.send(
            function = GetSavedNotificationSound(
                notificationSoundId = notificationSoundId,
            ),
        )
    }

    override suspend fun getSavedNotificationSounds(): TdlResult<NotificationSounds> {
        return repository.send(
            function = GetSavedNotificationSounds(),
        )
    }

    override suspend fun getSavedOrderInfo(): TdlResult<OrderInfo> {
        return repository.send(
            function = GetSavedOrderInfo(),
        )
    }

    override suspend fun getScopeNotificationSettings(scope: NotificationSettingsScope): TdlResult<ScopeNotificationSettings> {
        return repository.send(
            function = GetScopeNotificationSettings(
                scope = scope,
            ),
        )
    }

    override suspend fun getSearchSponsoredChats(query: String): TdlResult<SponsoredChats> {
        return repository.send(
            function = GetSearchSponsoredChats(
                query = query,
            ),
        )
    }

    override suspend fun getSearchedForTags(tagPrefix: String, limit: Int): TdlResult<Hashtags> {
        return repository.send(
            function = GetSearchedForTags(
                tagPrefix = tagPrefix,
                limit = limit,
            ),
        )
    }

    override suspend fun getSecretChat(secretChatId: Int): TdlResult<SecretChat> {
        return repository.send(
            function = GetSecretChat(
                secretChatId = secretChatId,
            ),
        )
    }

    override suspend fun getStarAdAccountUrl(ownerId: MessageSender): TdlResult<HttpUrl> {
        return repository.send(
            function = GetStarAdAccountUrl(
                ownerId = ownerId,
            ),
        )
    }

    override suspend fun getStarGiftPaymentOptions(userId: Long): TdlResult<StarPaymentOptions> {
        return repository.send(
            function = GetStarGiftPaymentOptions(
                userId = userId,
            ),
        )
    }

    override suspend fun getStarGiveawayPaymentOptions(): TdlResult<StarGiveawayPaymentOptions> {
        return repository.send(
            function = GetStarGiveawayPaymentOptions(),
        )
    }

    override suspend fun getStarPaymentOptions(): TdlResult<StarPaymentOptions> {
        return repository.send(
            function = GetStarPaymentOptions(),
        )
    }

    override suspend fun getStarRevenueStatistics(ownerId: MessageSender, isDark: Boolean): TdlResult<StarRevenueStatistics> {
        return repository.send(
            function = GetStarRevenueStatistics(
                ownerId = ownerId,
                isDark = isDark,
            ),
        )
    }

    override suspend fun getStarSubscriptions(onlyExpiring: Boolean, offset: String): TdlResult<StarSubscriptions> {
        return repository.send(
            function = GetStarSubscriptions(
                onlyExpiring = onlyExpiring,
                offset = offset,
            ),
        )
    }

    override suspend fun getStarTransactions(
        ownerId: MessageSender,
        subscriptionId: String,
        direction: StarTransactionDirection?,
        offset: String,
        limit: Int,
    ): TdlResult<StarTransactions> {
        return repository.send(
            function = GetStarTransactions(
                ownerId = ownerId,
                subscriptionId = subscriptionId,
                direction = direction,
                offset = offset,
                limit = limit,
            ),
        )
    }

    override suspend fun getStarWithdrawalUrl(
        ownerId: MessageSender,
        starCount: Long,
        password: String,
    ): TdlResult<HttpUrl> {
        return repository.send(
            function = GetStarWithdrawalUrl(
                ownerId = ownerId,
                starCount = starCount,
                password = password,
            ),
        )
    }

    override suspend fun getStatisticalGraph(
        chatId: Long,
        token: String,
        x: Long,
    ): TdlResult<StatisticalGraph> {
        return repository.send(
            function = GetStatisticalGraph(
                chatId = chatId,
                token = token,
                x = x,
            ),
        )
    }

    override suspend fun getStickerEmojis(sticker: InputFile): TdlResult<Emojis> {
        return repository.send(
            function = GetStickerEmojis(
                sticker = sticker,
            ),
        )
    }

    override suspend fun getStickerOutline(
        stickerFileId: Int,
        forAnimatedEmoji: Boolean,
        forClickedAnimatedEmojiMessage: Boolean,
    ): TdlResult<Outline> {
        return repository.send(
            function = GetStickerOutline(
                stickerFileId = stickerFileId,
                forAnimatedEmoji = forAnimatedEmoji,
                forClickedAnimatedEmojiMessage = forClickedAnimatedEmojiMessage,
            ),
        )
    }

    override suspend fun getStickerSet(setId: Long): TdlResult<StickerSet> {
        return repository.send(
            function = GetStickerSet(
                setId = setId,
            ),
        )
    }

    override suspend fun getStickerSetName(setId: Long): TdlResult<Text> {
        return repository.send(
            function = GetStickerSetName(
                setId = setId,
            ),
        )
    }

    override suspend fun getStickers(
        stickerType: StickerType,
        query: String,
        limit: Int,
        chatId: Long,
    ): TdlResult<Stickers> {
        return repository.send(
            function = GetStickers(
                stickerType = stickerType,
                query = query,
                limit = limit,
                chatId = chatId,
            ),
        )
    }

    override suspend fun getStorageStatistics(chatLimit: Int): TdlResult<StorageStatistics> {
        return repository.send(
            function = GetStorageStatistics(
                chatLimit = chatLimit,
            ),
        )
    }

    override suspend fun getStorageStatisticsFast(): TdlResult<StorageStatisticsFast> {
        return repository.send(
            function = GetStorageStatisticsFast(),
        )
    }

    override suspend fun getStory(
        storyPosterChatId: Long,
        storyId: Int,
        onlyLocal: Boolean,
    ): TdlResult<Story> {
        return repository.send(
            function = GetStory(
                storyPosterChatId = storyPosterChatId,
                storyId = storyId,
                onlyLocal = onlyLocal,
            ),
        )
    }

    override suspend fun getStoryAvailableReactions(rowSize: Int): TdlResult<AvailableReactions> {
        return repository.send(
            function = GetStoryAvailableReactions(
                rowSize = rowSize,
            ),
        )
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
        return repository.send(
            function = GetStoryInteractions(
                storyId = storyId,
                query = query,
                onlyContacts = onlyContacts,
                preferForwards = preferForwards,
                preferWithReaction = preferWithReaction,
                offset = offset,
                limit = limit,
            ),
        )
    }

    override suspend fun getStoryNotificationSettingsExceptions(): TdlResult<Chats> {
        return repository.send(
            function = GetStoryNotificationSettingsExceptions(),
        )
    }

    override suspend fun getStoryPublicForwards(
        storyPosterChatId: Long,
        storyId: Int,
        offset: String,
        limit: Int,
    ): TdlResult<PublicForwards> {
        return repository.send(
            function = GetStoryPublicForwards(
                storyPosterChatId = storyPosterChatId,
                storyId = storyId,
                offset = offset,
                limit = limit,
            ),
        )
    }

    override suspend fun getStoryStatistics(
        chatId: Long,
        storyId: Int,
        isDark: Boolean,
    ): TdlResult<StoryStatistics> {
        return repository.send(
            function = GetStoryStatistics(
                chatId = chatId,
                storyId = storyId,
                isDark = isDark,
            ),
        )
    }

    override suspend fun getSuggestedFileName(fileId: Int, directory: String): TdlResult<Text> {
        return repository.send(
            function = GetSuggestedFileName(
                fileId = fileId,
                directory = directory,
            ),
        )
    }

    override suspend fun getSuggestedStickerSetName(title: String): TdlResult<Text> {
        return repository.send(
            function = GetSuggestedStickerSetName(
                title = title,
            ),
        )
    }

    override suspend fun getSuitableDiscussionChats(): TdlResult<Chats> {
        return repository.send(
            function = GetSuitableDiscussionChats(),
        )
    }

    override suspend fun getSuitablePersonalChats(): TdlResult<Chats> {
        return repository.send(
            function = GetSuitablePersonalChats(),
        )
    }

    override suspend fun getSupergroup(supergroupId: Long): TdlResult<Supergroup> {
        return repository.send(
            function = GetSupergroup(
                supergroupId = supergroupId,
            ),
        )
    }

    override suspend fun getSupergroupFullInfo(supergroupId: Long): TdlResult<SupergroupFullInfo> {
        return repository.send(
            function = GetSupergroupFullInfo(
                supergroupId = supergroupId,
            ),
        )
    }

    override suspend fun getSupergroupMembers(
        supergroupId: Long,
        filter: SupergroupMembersFilter?,
        offset: Int,
        limit: Int,
    ): TdlResult<ChatMembers> {
        return repository.send(
            function = GetSupergroupMembers(
                supergroupId = supergroupId,
                filter = filter,
                offset = offset,
                limit = limit,
            ),
        )
    }

    override suspend fun getSupportName(): TdlResult<Text> {
        return repository.send(
            function = GetSupportName(),
        )
    }

    override suspend fun getSupportUser(): TdlResult<User> {
        return repository.send(
            function = GetSupportUser(),
        )
    }

    override suspend fun getTemporaryPasswordState(): TdlResult<TemporaryPasswordState> {
        return repository.send(
            function = GetTemporaryPasswordState(),
        )
    }

    override suspend fun getTextEntities(text: String): TdlResult<TextEntities> {
        return repository.send(
            function = GetTextEntities(
                text = text,
            ),
        )
    }

    override suspend fun getThemeParametersJsonString(theme: ThemeParameters): TdlResult<Text> {
        return repository.send(
            function = GetThemeParametersJsonString(
                theme = theme,
            ),
        )
    }

    override suspend fun getThemedChatEmojiStatuses(): TdlResult<EmojiStatusCustomEmojis> {
        return repository.send(
            function = GetThemedChatEmojiStatuses(),
        )
    }

    override suspend fun getThemedEmojiStatuses(): TdlResult<EmojiStatusCustomEmojis> {
        return repository.send(
            function = GetThemedEmojiStatuses(),
        )
    }

    override suspend fun getTimeZones(): TdlResult<TimeZones> {
        return repository.send(
            function = GetTimeZones(),
        )
    }

    override suspend fun getTopChats(category: TopChatCategory, limit: Int): TdlResult<Chats> {
        return repository.send(
            function = GetTopChats(
                category = category,
                limit = limit,
            ),
        )
    }

    override suspend fun getTrendingStickerSets(
        stickerType: StickerType,
        offset: Int,
        limit: Int,
    ): TdlResult<TrendingStickerSets> {
        return repository.send(
            function = GetTrendingStickerSets(
                stickerType = stickerType,
                offset = offset,
                limit = limit,
            ),
        )
    }

    override suspend fun getUpgradedGift(name: String): TdlResult<UpgradedGift> {
        return repository.send(
            function = GetUpgradedGift(
                name = name,
            ),
        )
    }

    override suspend fun getUpgradedGiftEmojiStatuses(): TdlResult<EmojiStatuses> {
        return repository.send(
            function = GetUpgradedGiftEmojiStatuses(),
        )
    }

    override suspend fun getUpgradedGiftWithdrawalUrl(receivedGiftId: String, password: String): TdlResult<HttpUrl> {
        return repository.send(
            function = GetUpgradedGiftWithdrawalUrl(
                receivedGiftId = receivedGiftId,
                password = password,
            ),
        )
    }

    override suspend fun getUser(userId: Long): TdlResult<User> {
        return repository.send(
            function = GetUser(
                userId = userId,
            ),
        )
    }

    override suspend fun getUserChatBoosts(chatId: Long, userId: Long): TdlResult<FoundChatBoosts> {
        return repository.send(
            function = GetUserChatBoosts(
                chatId = chatId,
                userId = userId,
            ),
        )
    }

    override suspend fun getUserFullInfo(userId: Long): TdlResult<UserFullInfo> {
        return repository.send(
            function = GetUserFullInfo(
                userId = userId,
            ),
        )
    }

    override suspend fun getUserLink(): TdlResult<UserLink> {
        return repository.send(
            function = GetUserLink(),
        )
    }

    override suspend fun getUserPrivacySettingRules(setting: UserPrivacySetting): TdlResult<UserPrivacySettingRules> {
        return repository.send(
            function = GetUserPrivacySettingRules(
                setting = setting,
            ),
        )
    }

    override suspend fun getUserProfilePhotos(
        userId: Long,
        offset: Int,
        limit: Int,
    ): TdlResult<ChatPhotos> {
        return repository.send(
            function = GetUserProfilePhotos(
                userId = userId,
                offset = offset,
                limit = limit,
            ),
        )
    }

    override suspend fun getUserSupportInfo(userId: Long): TdlResult<UserSupportInfo> {
        return repository.send(
            function = GetUserSupportInfo(
                userId = userId,
            ),
        )
    }

    override suspend fun getVideoChatAvailableParticipants(chatId: Long): TdlResult<MessageSenders> {
        return repository.send(
            function = GetVideoChatAvailableParticipants(
                chatId = chatId,
            ),
        )
    }

    override suspend fun getVideoChatInviteLink(groupCallId: Int, canSelfUnmute: Boolean): TdlResult<HttpUrl> {
        return repository.send(
            function = GetVideoChatInviteLink(
                groupCallId = groupCallId,
                canSelfUnmute = canSelfUnmute,
            ),
        )
    }

    override suspend fun getVideoChatRtmpUrl(chatId: Long): TdlResult<RtmpUrl> {
        return repository.send(
            function = GetVideoChatRtmpUrl(
                chatId = chatId,
            ),
        )
    }

    override suspend fun getVideoChatStreamSegment(
        groupCallId: Int,
        timeOffset: Long,
        scale: Int,
        channelId: Int,
        videoQuality: GroupCallVideoQuality?,
    ): TdlResult<Data> {
        return repository.send(
            function = GetVideoChatStreamSegment(
                groupCallId = groupCallId,
                timeOffset = timeOffset,
                scale = scale,
                channelId = channelId,
                videoQuality = videoQuality,
            ),
        )
    }

    override suspend fun getVideoChatStreams(groupCallId: Int): TdlResult<VideoChatStreams> {
        return repository.send(
            function = GetVideoChatStreams(
                groupCallId = groupCallId,
            ),
        )
    }

    override suspend fun getWebAppLinkUrl(
        chatId: Long,
        botUserId: Long,
        webAppShortName: String,
        startParameter: String,
        allowWriteAccess: Boolean,
        parameters: WebAppOpenParameters,
    ): TdlResult<HttpUrl> {
        return repository.send(
            function = GetWebAppLinkUrl(
                chatId = chatId,
                botUserId = botUserId,
                webAppShortName = webAppShortName,
                startParameter = startParameter,
                allowWriteAccess = allowWriteAccess,
                parameters = parameters,
            ),
        )
    }

    override suspend fun getWebAppPlaceholder(botUserId: Long): TdlResult<Outline> {
        return repository.send(
            function = GetWebAppPlaceholder(
                botUserId = botUserId,
            ),
        )
    }

    override suspend fun getWebAppUrl(
        botUserId: Long,
        url: String,
        parameters: WebAppOpenParameters,
    ): TdlResult<HttpUrl> {
        return repository.send(
            function = GetWebAppUrl(
                botUserId = botUserId,
                url = url,
                parameters = parameters,
            ),
        )
    }

    override suspend fun getWebPageInstantView(url: String, onlyLocal: Boolean): TdlResult<WebPageInstantView> {
        return repository.send(
            function = GetWebPageInstantView(
                url = url,
                onlyLocal = onlyLocal,
            ),
        )
    }

    override suspend fun giftPremiumWithStars(
        userId: Long,
        starCount: Long,
        monthCount: Int,
        text: FormattedText,
    ): TdlResult<Ok> {
        return repository.send(
            function = GiftPremiumWithStars(
                userId = userId,
                starCount = starCount,
                monthCount = monthCount,
                text = text,
            ),
        )
    }

    override suspend fun hideContactCloseBirthdays(): TdlResult<Ok> {
        return repository.send(
            function = HideContactCloseBirthdays(),
        )
    }

    override suspend fun hideSuggestedAction(action: SuggestedAction): TdlResult<Ok> {
        return repository.send(
            function = HideSuggestedAction(
                action = action,
            ),
        )
    }

    override suspend fun importContacts(contacts: Array<Contact>): TdlResult<ImportedContacts> {
        return repository.send(
            function = ImportContacts(
                contacts = contacts,
            ),
        )
    }

    override suspend fun importMessages(
        chatId: Long,
        messageFile: InputFile,
        attachedFiles: Array<InputFile>,
    ): TdlResult<Ok> {
        return repository.send(
            function = ImportMessages(
                chatId = chatId,
                messageFile = messageFile,
                attachedFiles = attachedFiles,
            ),
        )
    }

    override suspend fun inviteGroupCallParticipant(
        groupCallId: Int,
        userId: Long,
        isVideo: Boolean,
    ): TdlResult<InviteGroupCallParticipantResult> {
        return repository.send(
            function = InviteGroupCallParticipant(
                groupCallId = groupCallId,
                userId = userId,
                isVideo = isVideo,
            ),
        )
    }

    override suspend fun inviteVideoChatParticipants(groupCallId: Int, userIds: LongArray): TdlResult<Ok> {
        return repository.send(
            function = InviteVideoChatParticipants(
                groupCallId = groupCallId,
                userIds = userIds,
            ),
        )
    }

    override suspend fun joinChat(chatId: Long): TdlResult<Ok> {
        return repository.send(
            function = JoinChat(
                chatId = chatId,
            ),
        )
    }

    override suspend fun joinChatByInviteLink(inviteLink: String): TdlResult<Chat> {
        return repository.send(
            function = JoinChatByInviteLink(
                inviteLink = inviteLink,
            ),
        )
    }

    override suspend fun joinGroupCall(inputGroupCall: InputGroupCall, joinParameters: GroupCallJoinParameters): TdlResult<GroupCallInfo> {
        return repository.send(
            function = JoinGroupCall(
                inputGroupCall = inputGroupCall,
                joinParameters = joinParameters,
            ),
        )
    }

    override suspend fun joinVideoChat(
        groupCallId: Int,
        participantId: MessageSender?,
        joinParameters: GroupCallJoinParameters,
        inviteHash: String,
    ): TdlResult<Text> {
        return repository.send(
            function = JoinVideoChat(
                groupCallId = groupCallId,
                participantId = participantId,
                joinParameters = joinParameters,
                inviteHash = inviteHash,
            ),
        )
    }

    override suspend fun launchPrepaidGiveaway(
        giveawayId: Long,
        parameters: GiveawayParameters,
        winnerCount: Int,
        starCount: Long,
    ): TdlResult<Ok> {
        return repository.send(
            function = LaunchPrepaidGiveaway(
                giveawayId = giveawayId,
                parameters = parameters,
                winnerCount = winnerCount,
                starCount = starCount,
            ),
        )
    }

    override suspend fun leaveChat(chatId: Long): TdlResult<Ok> {
        return repository.send(
            function = LeaveChat(
                chatId = chatId,
            ),
        )
    }

    override suspend fun leaveGroupCall(groupCallId: Int): TdlResult<Ok> {
        return repository.send(
            function = LeaveGroupCall(
                groupCallId = groupCallId,
            ),
        )
    }

    override suspend fun loadActiveStories(storyList: StoryList): TdlResult<Ok> {
        return repository.send(
            function = LoadActiveStories(
                storyList = storyList,
            ),
        )
    }

    override suspend fun loadChats(chatList: ChatList?, limit: Int): TdlResult<Ok> {
        return repository.send(
            function = LoadChats(
                chatList = chatList,
                limit = limit,
            ),
        )
    }

    override suspend fun loadDirectMessagesChatTopics(chatId: Long, limit: Int): TdlResult<Ok> {
        return repository.send(
            function = LoadDirectMessagesChatTopics(
                chatId = chatId,
                limit = limit,
            ),
        )
    }

    override suspend fun loadGroupCallParticipants(groupCallId: Int, limit: Int): TdlResult<Ok> {
        return repository.send(
            function = LoadGroupCallParticipants(
                groupCallId = groupCallId,
                limit = limit,
            ),
        )
    }

    override suspend fun loadQuickReplyShortcutMessages(shortcutId: Int): TdlResult<Ok> {
        return repository.send(
            function = LoadQuickReplyShortcutMessages(
                shortcutId = shortcutId,
            ),
        )
    }

    override suspend fun loadQuickReplyShortcuts(): TdlResult<Ok> {
        return repository.send(
            function = LoadQuickReplyShortcuts(),
        )
    }

    override suspend fun loadSavedMessagesTopics(limit: Int): TdlResult<Ok> {
        return repository.send(
            function = LoadSavedMessagesTopics(
                limit = limit,
            ),
        )
    }

    override suspend fun logOut(): TdlResult<Ok> {
        return repository.send(
            function = LogOut(),
        )
    }

    override suspend fun openBotSimilarBot(botUserId: Long, openedBotUserId: Long): TdlResult<Ok> {
        return repository.send(
            function = OpenBotSimilarBot(
                botUserId = botUserId,
                openedBotUserId = openedBotUserId,
            ),
        )
    }

    override suspend fun openChat(chatId: Long): TdlResult<Ok> {
        return repository.send(
            function = OpenChat(
                chatId = chatId,
            ),
        )
    }

    override suspend fun openChatSimilarChat(chatId: Long, openedChatId: Long): TdlResult<Ok> {
        return repository.send(
            function = OpenChatSimilarChat(
                chatId = chatId,
                openedChatId = openedChatId,
            ),
        )
    }

    override suspend fun openMessageContent(chatId: Long, messageId: Long): TdlResult<Ok> {
        return repository.send(
            function = OpenMessageContent(
                chatId = chatId,
                messageId = messageId,
            ),
        )
    }

    override suspend fun openSponsoredChat(sponsoredChatUniqueId: Long): TdlResult<Ok> {
        return repository.send(
            function = OpenSponsoredChat(
                sponsoredChatUniqueId = sponsoredChatUniqueId,
            ),
        )
    }

    override suspend fun openStory(storyPosterChatId: Long, storyId: Int): TdlResult<Ok> {
        return repository.send(
            function = OpenStory(
                storyPosterChatId = storyPosterChatId,
                storyId = storyId,
            ),
        )
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
        return repository.send(
            function = OpenWebApp(
                chatId = chatId,
                botUserId = botUserId,
                url = url,
                messageThreadId = messageThreadId,
                directMessagesChatTopicId = directMessagesChatTopicId,
                replyTo = replyTo,
                parameters = parameters,
            ),
        )
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
        return repository.send(
            function = OptimizeStorage(
                size = size,
                ttl = ttl,
                count = count,
                immunityDelay = immunityDelay,
                fileTypes = fileTypes,
                chatIds = chatIds,
                excludeChatIds = excludeChatIds,
                returnDeletedFileStatistics = returnDeletedFileStatistics,
                chatLimit = chatLimit,
            ),
        )
    }

    override suspend fun parseMarkdown(text: FormattedText): TdlResult<FormattedText> {
        return repository.send(
            function = ParseMarkdown(
                text = text,
            ),
        )
    }

    override suspend fun parseTextEntities(text: String, parseMode: TextParseMode): TdlResult<FormattedText> {
        return repository.send(
            function = ParseTextEntities(
                text = text,
                parseMode = parseMode,
            ),
        )
    }

    override suspend fun pinChatMessage(
        chatId: Long,
        messageId: Long,
        disableNotification: Boolean,
        onlyForSelf: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = PinChatMessage(
                chatId = chatId,
                messageId = messageId,
                disableNotification = disableNotification,
                onlyForSelf = onlyForSelf,
            ),
        )
    }

    override suspend fun pingProxy(proxyId: Int): TdlResult<Seconds> {
        return repository.send(
            function = PingProxy(
                proxyId = proxyId,
            ),
        )
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
        return repository.send(
            function = PostStory(
                chatId = chatId,
                content = content,
                areas = areas,
                caption = caption,
                privacySettings = privacySettings,
                activePeriod = activePeriod,
                fromStoryFullId = fromStoryFullId,
                isPostedToChatPage = isPostedToChatPage,
                protectContent = protectContent,
            ),
        )
    }

    override suspend fun preliminaryUploadFile(
        file: InputFile,
        fileType: FileType?,
        priority: Int,
    ): TdlResult<File> {
        return repository.send(
            function = PreliminaryUploadFile(
                file = file,
                fileType = fileType,
                priority = priority,
            ),
        )
    }

    override suspend fun processChatFolderNewChats(chatFolderId: Int, addedChatIds: LongArray): TdlResult<Ok> {
        return repository.send(
            function = ProcessChatFolderNewChats(
                chatFolderId = chatFolderId,
                addedChatIds = addedChatIds,
            ),
        )
    }

    override suspend fun processChatJoinRequest(
        chatId: Long,
        userId: Long,
        approve: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = ProcessChatJoinRequest(
                chatId = chatId,
                userId = userId,
                approve = approve,
            ),
        )
    }

    override suspend fun processChatJoinRequests(
        chatId: Long,
        inviteLink: String,
        approve: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = ProcessChatJoinRequests(
                chatId = chatId,
                inviteLink = inviteLink,
                approve = approve,
            ),
        )
    }

    override suspend fun processPushNotification(payload: String): TdlResult<Ok> {
        return repository.send(
            function = ProcessPushNotification(
                payload = payload,
            ),
        )
    }

    override suspend fun rateSpeechRecognition(
        chatId: Long,
        messageId: Long,
        isGood: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = RateSpeechRecognition(
                chatId = chatId,
                messageId = messageId,
                isGood = isGood,
            ),
        )
    }

    override suspend fun readAllChatMentions(chatId: Long): TdlResult<Ok> {
        return repository.send(
            function = ReadAllChatMentions(
                chatId = chatId,
            ),
        )
    }

    override suspend fun readAllChatReactions(chatId: Long): TdlResult<Ok> {
        return repository.send(
            function = ReadAllChatReactions(
                chatId = chatId,
            ),
        )
    }

    override suspend fun readAllDirectMessagesChatTopicReactions(chatId: Long, topicId: Long): TdlResult<Ok> {
        return repository.send(
            function = ReadAllDirectMessagesChatTopicReactions(
                chatId = chatId,
                topicId = topicId,
            ),
        )
    }

    override suspend fun readAllMessageThreadMentions(chatId: Long, messageThreadId: Long): TdlResult<Ok> {
        return repository.send(
            function = ReadAllMessageThreadMentions(
                chatId = chatId,
                messageThreadId = messageThreadId,
            ),
        )
    }

    override suspend fun readAllMessageThreadReactions(chatId: Long, messageThreadId: Long): TdlResult<Ok> {
        return repository.send(
            function = ReadAllMessageThreadReactions(
                chatId = chatId,
                messageThreadId = messageThreadId,
            ),
        )
    }

    override suspend fun readBusinessMessage(
        businessConnectionId: String,
        chatId: Long,
        messageId: Long,
    ): TdlResult<Ok> {
        return repository.send(
            function = ReadBusinessMessage(
                businessConnectionId = businessConnectionId,
                chatId = chatId,
                messageId = messageId,
            ),
        )
    }

    override suspend fun readChatList(chatList: ChatList): TdlResult<Ok> {
        return repository.send(
            function = ReadChatList(
                chatList = chatList,
            ),
        )
    }

    override suspend fun readFilePart(
        fileId: Int,
        offset: Long,
        count: Long,
    ): TdlResult<Data> {
        return repository.send(
            function = ReadFilePart(
                fileId = fileId,
                offset = offset,
                count = count,
            ),
        )
    }

    override suspend fun readdQuickReplyShortcutMessages(shortcutName: String, messageIds: LongArray): TdlResult<QuickReplyMessages> {
        return repository.send(
            function = ReaddQuickReplyShortcutMessages(
                shortcutName = shortcutName,
                messageIds = messageIds,
            ),
        )
    }

    override suspend fun recognizeSpeech(chatId: Long, messageId: Long): TdlResult<Ok> {
        return repository.send(
            function = RecognizeSpeech(
                chatId = chatId,
                messageId = messageId,
            ),
        )
    }

    override suspend fun recoverAuthenticationPassword(
        recoveryCode: String,
        newPassword: String,
        newHint: String,
    ): TdlResult<Ok> {
        return repository.send(
            function = RecoverAuthenticationPassword(
                recoveryCode = recoveryCode,
                newPassword = newPassword,
                newHint = newHint,
            ),
        )
    }

    override suspend fun recoverPassword(
        recoveryCode: String,
        newPassword: String,
        newHint: String,
    ): TdlResult<PasswordState> {
        return repository.send(
            function = RecoverPassword(
                recoveryCode = recoveryCode,
                newPassword = newPassword,
                newHint = newHint,
            ),
        )
    }

    override suspend fun refundStarPayment(userId: Long, telegramPaymentChargeId: String): TdlResult<Ok> {
        return repository.send(
            function = RefundStarPayment(
                userId = userId,
                telegramPaymentChargeId = telegramPaymentChargeId,
            ),
        )
    }

    override suspend fun registerDevice(deviceToken: DeviceToken, otherUserIds: LongArray): TdlResult<PushReceiverId> {
        return repository.send(
            function = RegisterDevice(
                deviceToken = deviceToken,
                otherUserIds = otherUserIds,
            ),
        )
    }

    override suspend fun registerUser(
        firstName: String,
        lastName: String,
        disableNotification: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = RegisterUser(
                firstName = firstName,
                lastName = lastName,
                disableNotification = disableNotification,
            ),
        )
    }

    override suspend fun removeAllFilesFromDownloads(
        onlyActive: Boolean,
        onlyCompleted: Boolean,
        deleteFromCache: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = RemoveAllFilesFromDownloads(
                onlyActive = onlyActive,
                onlyCompleted = onlyCompleted,
                deleteFromCache = deleteFromCache,
            ),
        )
    }

    override suspend fun removeBusinessConnectedBotFromChat(chatId: Long): TdlResult<Ok> {
        return repository.send(
            function = RemoveBusinessConnectedBotFromChat(
                chatId = chatId,
            ),
        )
    }

    override suspend fun removeChatActionBar(chatId: Long): TdlResult<Ok> {
        return repository.send(
            function = RemoveChatActionBar(
                chatId = chatId,
            ),
        )
    }

    override suspend fun removeContacts(userIds: LongArray): TdlResult<Ok> {
        return repository.send(
            function = RemoveContacts(
                userIds = userIds,
            ),
        )
    }

    override suspend fun removeFavoriteSticker(sticker: InputFile): TdlResult<Ok> {
        return repository.send(
            function = RemoveFavoriteSticker(
                sticker = sticker,
            ),
        )
    }

    override suspend fun removeFileFromDownloads(fileId: Int, deleteFromCache: Boolean): TdlResult<Ok> {
        return repository.send(
            function = RemoveFileFromDownloads(
                fileId = fileId,
                deleteFromCache = deleteFromCache,
            ),
        )
    }

    override suspend fun removeInstalledBackground(backgroundId: Long): TdlResult<Ok> {
        return repository.send(
            function = RemoveInstalledBackground(
                backgroundId = backgroundId,
            ),
        )
    }

    override suspend fun removeMessageReaction(
        chatId: Long,
        messageId: Long,
        reactionType: ReactionType,
    ): TdlResult<Ok> {
        return repository.send(
            function = RemoveMessageReaction(
                chatId = chatId,
                messageId = messageId,
                reactionType = reactionType,
            ),
        )
    }

    override suspend fun removeMessageSenderBotVerification(botUserId: Long, verifiedId: MessageSender): TdlResult<Ok> {
        return repository.send(
            function = RemoveMessageSenderBotVerification(
                botUserId = botUserId,
                verifiedId = verifiedId,
            ),
        )
    }

    override suspend fun removeNotification(notificationGroupId: Int, notificationId: Int): TdlResult<Ok> {
        return repository.send(
            function = RemoveNotification(
                notificationGroupId = notificationGroupId,
                notificationId = notificationId,
            ),
        )
    }

    override suspend fun removeNotificationGroup(notificationGroupId: Int, maxNotificationId: Int): TdlResult<Ok> {
        return repository.send(
            function = RemoveNotificationGroup(
                notificationGroupId = notificationGroupId,
                maxNotificationId = maxNotificationId,
            ),
        )
    }

    override suspend fun removePendingPaidMessageReactions(chatId: Long, messageId: Long): TdlResult<Ok> {
        return repository.send(
            function = RemovePendingPaidMessageReactions(
                chatId = chatId,
                messageId = messageId,
            ),
        )
    }

    override suspend fun removeProxy(proxyId: Int): TdlResult<Ok> {
        return repository.send(
            function = RemoveProxy(
                proxyId = proxyId,
            ),
        )
    }

    override suspend fun removeRecentHashtag(hashtag: String): TdlResult<Ok> {
        return repository.send(
            function = RemoveRecentHashtag(
                hashtag = hashtag,
            ),
        )
    }

    override suspend fun removeRecentSticker(isAttached: Boolean, sticker: InputFile): TdlResult<Ok> {
        return repository.send(
            function = RemoveRecentSticker(
                isAttached = isAttached,
                sticker = sticker,
            ),
        )
    }

    override suspend fun removeRecentlyFoundChat(chatId: Long): TdlResult<Ok> {
        return repository.send(
            function = RemoveRecentlyFoundChat(
                chatId = chatId,
            ),
        )
    }

    override suspend fun removeSavedAnimation(animation: InputFile): TdlResult<Ok> {
        return repository.send(
            function = RemoveSavedAnimation(
                animation = animation,
            ),
        )
    }

    override suspend fun removeSavedNotificationSound(notificationSoundId: Long): TdlResult<Ok> {
        return repository.send(
            function = RemoveSavedNotificationSound(
                notificationSoundId = notificationSoundId,
            ),
        )
    }

    override suspend fun removeSearchedForTag(tag: String): TdlResult<Ok> {
        return repository.send(
            function = RemoveSearchedForTag(
                tag = tag,
            ),
        )
    }

    override suspend fun removeStickerFromSet(sticker: InputFile): TdlResult<Ok> {
        return repository.send(
            function = RemoveStickerFromSet(
                sticker = sticker,
            ),
        )
    }

    override suspend fun removeTopChat(category: TopChatCategory, chatId: Long): TdlResult<Ok> {
        return repository.send(
            function = RemoveTopChat(
                category = category,
                chatId = chatId,
            ),
        )
    }

    override suspend fun reorderActiveUsernames(usernames: Array<String>): TdlResult<Ok> {
        return repository.send(
            function = ReorderActiveUsernames(
                usernames = usernames,
            ),
        )
    }

    override suspend fun reorderBotActiveUsernames(botUserId: Long, usernames: Array<String>): TdlResult<Ok> {
        return repository.send(
            function = ReorderBotActiveUsernames(
                botUserId = botUserId,
                usernames = usernames,
            ),
        )
    }

    override suspend fun reorderBotMediaPreviews(
        botUserId: Long,
        languageCode: String,
        fileIds: IntArray,
    ): TdlResult<Ok> {
        return repository.send(
            function = ReorderBotMediaPreviews(
                botUserId = botUserId,
                languageCode = languageCode,
                fileIds = fileIds,
            ),
        )
    }

    override suspend fun reorderChatFolders(chatFolderIds: IntArray, mainChatListPosition: Int): TdlResult<Ok> {
        return repository.send(
            function = ReorderChatFolders(
                chatFolderIds = chatFolderIds,
                mainChatListPosition = mainChatListPosition,
            ),
        )
    }

    override suspend fun reorderInstalledStickerSets(stickerType: StickerType, stickerSetIds: LongArray): TdlResult<Ok> {
        return repository.send(
            function = ReorderInstalledStickerSets(
                stickerType = stickerType,
                stickerSetIds = stickerSetIds,
            ),
        )
    }

    override suspend fun reorderQuickReplyShortcuts(shortcutIds: IntArray): TdlResult<Ok> {
        return repository.send(
            function = ReorderQuickReplyShortcuts(
                shortcutIds = shortcutIds,
            ),
        )
    }

    override suspend fun reorderSupergroupActiveUsernames(supergroupId: Long, usernames: Array<String>): TdlResult<Ok> {
        return repository.send(
            function = ReorderSupergroupActiveUsernames(
                supergroupId = supergroupId,
                usernames = usernames,
            ),
        )
    }

    override suspend fun replacePrimaryChatInviteLink(chatId: Long): TdlResult<ChatInviteLink> {
        return repository.send(
            function = ReplacePrimaryChatInviteLink(
                chatId = chatId,
            ),
        )
    }

    override suspend fun replaceStickerInSet(
        userId: Long,
        name: String,
        oldSticker: InputFile,
        newSticker: InputSticker,
    ): TdlResult<Ok> {
        return repository.send(
            function = ReplaceStickerInSet(
                userId = userId,
                name = name,
                oldSticker = oldSticker,
                newSticker = newSticker,
            ),
        )
    }

    override suspend fun replaceVideoChatRtmpUrl(chatId: Long): TdlResult<RtmpUrl> {
        return repository.send(
            function = ReplaceVideoChatRtmpUrl(
                chatId = chatId,
            ),
        )
    }

    override suspend fun reportAuthenticationCodeMissing(mobileNetworkCode: String): TdlResult<Ok> {
        return repository.send(
            function = ReportAuthenticationCodeMissing(
                mobileNetworkCode = mobileNetworkCode,
            ),
        )
    }

    override suspend fun reportChat(
        chatId: Long,
        optionId: ByteArray,
        messageIds: LongArray,
        text: String,
    ): TdlResult<ReportChatResult> {
        return repository.send(
            function = ReportChat(
                chatId = chatId,
                optionId = optionId,
                messageIds = messageIds,
                text = text,
            ),
        )
    }

    override suspend fun reportChatPhoto(
        chatId: Long,
        fileId: Int,
        reason: ReportReason,
        text: String,
    ): TdlResult<Ok> {
        return repository.send(
            function = ReportChatPhoto(
                chatId = chatId,
                fileId = fileId,
                reason = reason,
                text = text,
            ),
        )
    }

    override suspend fun reportChatSponsoredMessage(
        chatId: Long,
        messageId: Long,
        optionId: ByteArray,
    ): TdlResult<ReportSponsoredResult> {
        return repository.send(
            function = ReportChatSponsoredMessage(
                chatId = chatId,
                messageId = messageId,
                optionId = optionId,
            ),
        )
    }

    override suspend fun reportMessageReactions(
        chatId: Long,
        messageId: Long,
        senderId: MessageSender,
    ): TdlResult<Ok> {
        return repository.send(
            function = ReportMessageReactions(
                chatId = chatId,
                messageId = messageId,
                senderId = senderId,
            ),
        )
    }

    override suspend fun reportPhoneNumberCodeMissing(mobileNetworkCode: String): TdlResult<Ok> {
        return repository.send(
            function = ReportPhoneNumberCodeMissing(
                mobileNetworkCode = mobileNetworkCode,
            ),
        )
    }

    override suspend fun reportSponsoredChat(sponsoredChatUniqueId: Long, optionId: ByteArray): TdlResult<ReportSponsoredResult> {
        return repository.send(
            function = ReportSponsoredChat(
                sponsoredChatUniqueId = sponsoredChatUniqueId,
                optionId = optionId,
            ),
        )
    }

    override suspend fun reportStory(
        storyPosterChatId: Long,
        storyId: Int,
        optionId: ByteArray,
        text: String,
    ): TdlResult<ReportStoryResult> {
        return repository.send(
            function = ReportStory(
                storyPosterChatId = storyPosterChatId,
                storyId = storyId,
                optionId = optionId,
                text = text,
            ),
        )
    }

    override suspend fun reportSupergroupAntiSpamFalsePositive(supergroupId: Long, messageId: Long): TdlResult<Ok> {
        return repository.send(
            function = ReportSupergroupAntiSpamFalsePositive(
                supergroupId = supergroupId,
                messageId = messageId,
            ),
        )
    }

    override suspend fun reportSupergroupSpam(supergroupId: Long, messageIds: LongArray): TdlResult<Ok> {
        return repository.send(
            function = ReportSupergroupSpam(
                supergroupId = supergroupId,
                messageIds = messageIds,
            ),
        )
    }

    override suspend fun requestAuthenticationPasswordRecovery(): TdlResult<Ok> {
        return repository.send(
            function = RequestAuthenticationPasswordRecovery(),
        )
    }

    override suspend fun requestPasswordRecovery(): TdlResult<EmailAddressAuthenticationCodeInfo> {
        return repository.send(
            function = RequestPasswordRecovery(),
        )
    }

    override suspend fun requestQrCodeAuthentication(otherUserIds: LongArray): TdlResult<Ok> {
        return repository.send(
            function = RequestQrCodeAuthentication(
                otherUserIds = otherUserIds,
            ),
        )
    }

    override suspend fun resendAuthenticationCode(reason: ResendCodeReason?): TdlResult<Ok> {
        return repository.send(
            function = ResendAuthenticationCode(
                reason = reason,
            ),
        )
    }

    override suspend fun resendEmailAddressVerificationCode(): TdlResult<EmailAddressAuthenticationCodeInfo> {
        return repository.send(
            function = ResendEmailAddressVerificationCode(),
        )
    }

    override suspend fun resendLoginEmailAddressCode(): TdlResult<EmailAddressAuthenticationCodeInfo> {
        return repository.send(
            function = ResendLoginEmailAddressCode(),
        )
    }

    override suspend fun resendMessages(
        chatId: Long,
        messageIds: LongArray,
        quote: InputTextQuote?,
        paidMessageStarCount: Long,
    ): TdlResult<Messages> {
        return repository.send(
            function = ResendMessages(
                chatId = chatId,
                messageIds = messageIds,
                quote = quote,
                paidMessageStarCount = paidMessageStarCount,
            ),
        )
    }

    override suspend fun resendPhoneNumberCode(reason: ResendCodeReason?): TdlResult<AuthenticationCodeInfo> {
        return repository.send(
            function = ResendPhoneNumberCode(
                reason = reason,
            ),
        )
    }

    override suspend fun resendRecoveryEmailAddressCode(): TdlResult<PasswordState> {
        return repository.send(
            function = ResendRecoveryEmailAddressCode(),
        )
    }

    override suspend fun resetAllNotificationSettings(): TdlResult<Ok> {
        return repository.send(
            function = ResetAllNotificationSettings(),
        )
    }

    override suspend fun resetAuthenticationEmailAddress(): TdlResult<Ok> {
        return repository.send(
            function = ResetAuthenticationEmailAddress(),
        )
    }

    override suspend fun resetInstalledBackgrounds(): TdlResult<Ok> {
        return repository.send(
            function = ResetInstalledBackgrounds(),
        )
    }

    override suspend fun resetNetworkStatistics(): TdlResult<Ok> {
        return repository.send(
            function = ResetNetworkStatistics(),
        )
    }

    override suspend fun resetPassword(): TdlResult<ResetPasswordResult> {
        return repository.send(
            function = ResetPassword(),
        )
    }

    override suspend fun reuseStarSubscription(subscriptionId: String): TdlResult<Ok> {
        return repository.send(
            function = ReuseStarSubscription(
                subscriptionId = subscriptionId,
            ),
        )
    }

    override suspend fun revokeChatInviteLink(chatId: Long, inviteLink: String): TdlResult<ChatInviteLinks> {
        return repository.send(
            function = RevokeChatInviteLink(
                chatId = chatId,
                inviteLink = inviteLink,
            ),
        )
    }

    override suspend fun revokeGroupCallInviteLink(groupCallId: Int): TdlResult<Ok> {
        return repository.send(
            function = RevokeGroupCallInviteLink(
                groupCallId = groupCallId,
            ),
        )
    }

    override suspend fun saveApplicationLogEvent(
        type: String,
        chatId: Long,
        data: JsonValue,
    ): TdlResult<Ok> {
        return repository.send(
            function = SaveApplicationLogEvent(
                type = type,
                chatId = chatId,
                data = data,
            ),
        )
    }

    override suspend fun savePreparedInlineMessage(
        userId: Long,
        result: InputInlineQueryResult,
        chatTypes: TargetChatTypes,
    ): TdlResult<PreparedInlineMessageId> {
        return repository.send(
            function = SavePreparedInlineMessage(
                userId = userId,
                result = result,
                chatTypes = chatTypes,
            ),
        )
    }

    override suspend fun searchAffiliatePrograms(
        affiliate: AffiliateType,
        sortOrder: AffiliateProgramSortOrder,
        offset: String,
        limit: Int,
    ): TdlResult<FoundAffiliatePrograms> {
        return repository.send(
            function = SearchAffiliatePrograms(
                affiliate = affiliate,
                sortOrder = sortOrder,
                offset = offset,
                limit = limit,
            ),
        )
    }

    override suspend fun searchBackground(name: String): TdlResult<Background> {
        return repository.send(
            function = SearchBackground(
                name = name,
            ),
        )
    }

    override suspend fun searchCallMessages(
        offset: String,
        limit: Int,
        onlyMissed: Boolean,
    ): TdlResult<FoundMessages> {
        return repository.send(
            function = SearchCallMessages(
                offset = offset,
                limit = limit,
                onlyMissed = onlyMissed,
            ),
        )
    }

    override suspend fun searchChatAffiliateProgram(username: String, referrer: String): TdlResult<Chat> {
        return repository.send(
            function = SearchChatAffiliateProgram(
                username = username,
                referrer = referrer,
            ),
        )
    }

    override suspend fun searchChatMembers(
        chatId: Long,
        query: String,
        limit: Int,
        filter: ChatMembersFilter?,
    ): TdlResult<ChatMembers> {
        return repository.send(
            function = SearchChatMembers(
                chatId = chatId,
                query = query,
                limit = limit,
                filter = filter,
            ),
        )
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
        return repository.send(
            function = SearchChatMessages(
                chatId = chatId,
                topicId = topicId,
                query = query,
                senderId = senderId,
                fromMessageId = fromMessageId,
                offset = offset,
                limit = limit,
                filter = filter,
            ),
        )
    }

    override suspend fun searchChatRecentLocationMessages(chatId: Long, limit: Int): TdlResult<Messages> {
        return repository.send(
            function = SearchChatRecentLocationMessages(
                chatId = chatId,
                limit = limit,
            ),
        )
    }

    override suspend fun searchChats(query: String, limit: Int): TdlResult<Chats> {
        return repository.send(
            function = SearchChats(
                query = query,
                limit = limit,
            ),
        )
    }

    override suspend fun searchChatsOnServer(query: String, limit: Int): TdlResult<Chats> {
        return repository.send(
            function = SearchChatsOnServer(
                query = query,
                limit = limit,
            ),
        )
    }

    override suspend fun searchContacts(query: String, limit: Int): TdlResult<Users> {
        return repository.send(
            function = SearchContacts(
                query = query,
                limit = limit,
            ),
        )
    }

    override suspend fun searchEmojis(text: String, inputLanguageCodes: Array<String>): TdlResult<EmojiKeywords> {
        return repository.send(
            function = SearchEmojis(
                text = text,
                inputLanguageCodes = inputLanguageCodes,
            ),
        )
    }

    override suspend fun searchFileDownloads(
        query: String,
        onlyActive: Boolean,
        onlyCompleted: Boolean,
        offset: String,
        limit: Int,
    ): TdlResult<FoundFileDownloads> {
        return repository.send(
            function = SearchFileDownloads(
                query = query,
                onlyActive = onlyActive,
                onlyCompleted = onlyCompleted,
                offset = offset,
                limit = limit,
            ),
        )
    }

    override suspend fun searchGiftsForResale(
        giftId: Long,
        order: GiftForResaleOrder,
        attributes: Array<UpgradedGiftAttributeId>,
        offset: String,
        limit: Int,
    ): TdlResult<GiftsForResale> {
        return repository.send(
            function = SearchGiftsForResale(
                giftId = giftId,
                order = order,
                attributes = attributes,
                offset = offset,
                limit = limit,
            ),
        )
    }

    override suspend fun searchHashtags(prefix: String, limit: Int): TdlResult<Hashtags> {
        return repository.send(
            function = SearchHashtags(
                prefix = prefix,
                limit = limit,
            ),
        )
    }

    override suspend fun searchInstalledStickerSets(
        stickerType: StickerType,
        query: String,
        limit: Int,
    ): TdlResult<StickerSets> {
        return repository.send(
            function = SearchInstalledStickerSets(
                stickerType = stickerType,
                query = query,
                limit = limit,
            ),
        )
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
        return repository.send(
            function = SearchMessages(
                chatList = chatList,
                query = query,
                offset = offset,
                limit = limit,
                filter = filter,
                chatTypeFilter = chatTypeFilter,
                minDate = minDate,
                maxDate = maxDate,
            ),
        )
    }

    override suspend fun searchOutgoingDocumentMessages(query: String, limit: Int): TdlResult<FoundMessages> {
        return repository.send(
            function = SearchOutgoingDocumentMessages(
                query = query,
                limit = limit,
            ),
        )
    }

    override suspend fun searchPublicChat(username: String): TdlResult<Chat> {
        return repository.send(
            function = SearchPublicChat(
                username = username,
            ),
        )
    }

    override suspend fun searchPublicChats(query: String): TdlResult<Chats> {
        return repository.send(
            function = SearchPublicChats(
                query = query,
            ),
        )
    }

    override suspend fun searchPublicMessagesByTag(
        tag: String,
        offset: String,
        limit: Int,
    ): TdlResult<FoundMessages> {
        return repository.send(
            function = SearchPublicMessagesByTag(
                tag = tag,
                offset = offset,
                limit = limit,
            ),
        )
    }

    override suspend fun searchPublicStoriesByLocation(
        address: LocationAddress,
        offset: String,
        limit: Int,
    ): TdlResult<FoundStories> {
        return repository.send(
            function = SearchPublicStoriesByLocation(
                address = address,
                offset = offset,
                limit = limit,
            ),
        )
    }

    override suspend fun searchPublicStoriesByTag(
        storyPosterChatId: Long,
        tag: String,
        offset: String,
        limit: Int,
    ): TdlResult<FoundStories> {
        return repository.send(
            function = SearchPublicStoriesByTag(
                storyPosterChatId = storyPosterChatId,
                tag = tag,
                offset = offset,
                limit = limit,
            ),
        )
    }

    override suspend fun searchPublicStoriesByVenue(
        venueProvider: String,
        venueId: String,
        offset: String,
        limit: Int,
    ): TdlResult<FoundStories> {
        return repository.send(
            function = SearchPublicStoriesByVenue(
                venueProvider = venueProvider,
                venueId = venueId,
                offset = offset,
                limit = limit,
            ),
        )
    }

    override suspend fun searchQuote(
        text: FormattedText,
        quote: FormattedText,
        quotePosition: Int,
    ): TdlResult<FoundPosition> {
        return repository.send(
            function = SearchQuote(
                text = text,
                quote = quote,
                quotePosition = quotePosition,
            ),
        )
    }

    override suspend fun searchRecentlyFoundChats(query: String, limit: Int): TdlResult<Chats> {
        return repository.send(
            function = SearchRecentlyFoundChats(
                query = query,
                limit = limit,
            ),
        )
    }

    override suspend fun searchSavedMessages(
        savedMessagesTopicId: Long,
        tag: ReactionType?,
        query: String,
        fromMessageId: Long,
        offset: Int,
        limit: Int,
    ): TdlResult<FoundChatMessages> {
        return repository.send(
            function = SearchSavedMessages(
                savedMessagesTopicId = savedMessagesTopicId,
                tag = tag,
                query = query,
                fromMessageId = fromMessageId,
                offset = offset,
                limit = limit,
            ),
        )
    }

    override suspend fun searchSecretMessages(
        chatId: Long,
        query: String,
        offset: String,
        limit: Int,
        filter: SearchMessagesFilter?,
    ): TdlResult<FoundMessages> {
        return repository.send(
            function = SearchSecretMessages(
                chatId = chatId,
                query = query,
                offset = offset,
                limit = limit,
                filter = filter,
            ),
        )
    }

    override suspend fun searchStickerSet(name: String, ignoreCache: Boolean): TdlResult<StickerSet> {
        return repository.send(
            function = SearchStickerSet(
                name = name,
                ignoreCache = ignoreCache,
            ),
        )
    }

    override suspend fun searchStickerSets(stickerType: StickerType, query: String): TdlResult<StickerSets> {
        return repository.send(
            function = SearchStickerSets(
                stickerType = stickerType,
                query = query,
            ),
        )
    }

    override suspend fun searchStickers(
        stickerType: StickerType,
        emojis: String,
        query: String,
        inputLanguageCodes: Array<String>,
        offset: Int,
        limit: Int,
    ): TdlResult<Stickers> {
        return repository.send(
            function = SearchStickers(
                stickerType = stickerType,
                emojis = emojis,
                query = query,
                inputLanguageCodes = inputLanguageCodes,
                offset = offset,
                limit = limit,
            ),
        )
    }

    override suspend fun searchStringsByPrefix(
        strings: Array<String>,
        query: String,
        limit: Int,
        returnNoneForEmptyQuery: Boolean,
    ): TdlResult<FoundPositions> {
        return repository.send(
            function = SearchStringsByPrefix(
                strings = strings,
                query = query,
                limit = limit,
                returnNoneForEmptyQuery = returnNoneForEmptyQuery,
            ),
        )
    }

    override suspend fun searchUserByPhoneNumber(phoneNumber: String, onlyLocal: Boolean): TdlResult<User> {
        return repository.send(
            function = SearchUserByPhoneNumber(
                phoneNumber = phoneNumber,
                onlyLocal = onlyLocal,
            ),
        )
    }

    override suspend fun searchUserByToken(token: String): TdlResult<User> {
        return repository.send(
            function = SearchUserByToken(
                token = token,
            ),
        )
    }

    override suspend fun searchWebApp(botUserId: Long, webAppShortName: String): TdlResult<FoundWebApp> {
        return repository.send(
            function = SearchWebApp(
                botUserId = botUserId,
                webAppShortName = webAppShortName,
            ),
        )
    }

    override suspend fun sellGift(businessConnectionId: String, receivedGiftId: String): TdlResult<Ok> {
        return repository.send(
            function = SellGift(
                businessConnectionId = businessConnectionId,
                receivedGiftId = receivedGiftId,
            ),
        )
    }

    override suspend fun sendAuthenticationFirebaseSms(token: String): TdlResult<Ok> {
        return repository.send(
            function = SendAuthenticationFirebaseSms(
                token = token,
            ),
        )
    }

    override suspend fun sendBotStartMessage(
        botUserId: Long,
        chatId: Long,
        parameter: String,
    ): TdlResult<Message> {
        return repository.send(
            function = SendBotStartMessage(
                botUserId = botUserId,
                chatId = chatId,
                parameter = parameter,
            ),
        )
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
        return repository.send(
            function = SendBusinessMessage(
                businessConnectionId = businessConnectionId,
                chatId = chatId,
                replyTo = replyTo,
                disableNotification = disableNotification,
                protectContent = protectContent,
                effectId = effectId,
                replyMarkup = replyMarkup,
                inputMessageContent = inputMessageContent,
            ),
        )
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
        return repository.send(
            function = SendBusinessMessageAlbum(
                businessConnectionId = businessConnectionId,
                chatId = chatId,
                replyTo = replyTo,
                disableNotification = disableNotification,
                protectContent = protectContent,
                effectId = effectId,
                inputMessageContents = inputMessageContents,
            ),
        )
    }

    override suspend fun sendCallDebugInformation(callId: Int, debugInformation: String): TdlResult<Ok> {
        return repository.send(
            function = SendCallDebugInformation(
                callId = callId,
                debugInformation = debugInformation,
            ),
        )
    }

    override suspend fun sendCallLog(callId: Int, logFile: InputFile): TdlResult<Ok> {
        return repository.send(
            function = SendCallLog(
                callId = callId,
                logFile = logFile,
            ),
        )
    }

    override suspend fun sendCallRating(
        callId: Int,
        rating: Int,
        comment: String,
        problems: Array<CallProblem>,
    ): TdlResult<Ok> {
        return repository.send(
            function = SendCallRating(
                callId = callId,
                rating = rating,
                comment = comment,
                problems = problems,
            ),
        )
    }

    override suspend fun sendCallSignalingData(callId: Int, data: ByteArray): TdlResult<Ok> {
        return repository.send(
            function = SendCallSignalingData(
                callId = callId,
                data = data,
            ),
        )
    }

    override suspend fun sendChatAction(
        chatId: Long,
        messageThreadId: Long,
        businessConnectionId: String,
        action: ChatAction?,
    ): TdlResult<Ok> {
        return repository.send(
            function = SendChatAction(
                chatId = chatId,
                messageThreadId = messageThreadId,
                businessConnectionId = businessConnectionId,
                action = action,
            ),
        )
    }

    override suspend fun sendCustomRequest(method: String, parameters: String): TdlResult<CustomRequestResult> {
        return repository.send(
            function = SendCustomRequest(
                method = method,
                parameters = parameters,
            ),
        )
    }

    override suspend fun sendEmailAddressVerificationCode(emailAddress: String): TdlResult<EmailAddressAuthenticationCodeInfo> {
        return repository.send(
            function = SendEmailAddressVerificationCode(
                emailAddress = emailAddress,
            ),
        )
    }

    override suspend fun sendGift(
        giftId: Long,
        ownerId: MessageSender,
        text: FormattedText,
        isPrivate: Boolean,
        payForUpgrade: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = SendGift(
                giftId = giftId,
                ownerId = ownerId,
                text = text,
                isPrivate = isPrivate,
                payForUpgrade = payForUpgrade,
            ),
        )
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
        return repository.send(
            function = SendInlineQueryResultMessage(
                chatId = chatId,
                messageThreadId = messageThreadId,
                replyTo = replyTo,
                options = options,
                queryId = queryId,
                resultId = resultId,
                hideViaBot = hideViaBot,
            ),
        )
    }

    override suspend fun sendMessage(
        chatId: Long,
        messageThreadId: Long,
        replyTo: InputMessageReplyTo?,
        options: MessageSendOptions?,
        replyMarkup: ReplyMarkup?,
        inputMessageContent: InputMessageContent,
    ): TdlResult<Message> {
        return repository.send(
            function = SendMessage(
                chatId = chatId,
                messageThreadId = messageThreadId,
                replyTo = replyTo,
                options = options,
                replyMarkup = replyMarkup,
                inputMessageContent = inputMessageContent,
            ),
        )
    }

    override suspend fun sendMessageAlbum(
        chatId: Long,
        messageThreadId: Long,
        replyTo: InputMessageReplyTo?,
        options: MessageSendOptions?,
        inputMessageContents: Array<InputMessageContent>,
    ): TdlResult<Messages> {
        return repository.send(
            function = SendMessageAlbum(
                chatId = chatId,
                messageThreadId = messageThreadId,
                replyTo = replyTo,
                options = options,
                inputMessageContents = inputMessageContents,
            ),
        )
    }

    override suspend fun sendPassportAuthorizationForm(authorizationFormId: Int, types: Array<PassportElementType>): TdlResult<Ok> {
        return repository.send(
            function = SendPassportAuthorizationForm(
                authorizationFormId = authorizationFormId,
                types = types,
            ),
        )
    }

    override suspend fun sendPaymentForm(
        inputInvoice: InputInvoice,
        paymentFormId: Long,
        orderInfoId: String,
        shippingOptionId: String,
        credentials: InputCredentials?,
        tipAmount: Long,
    ): TdlResult<PaymentResult> {
        return repository.send(
            function = SendPaymentForm(
                inputInvoice = inputInvoice,
                paymentFormId = paymentFormId,
                orderInfoId = orderInfoId,
                shippingOptionId = shippingOptionId,
                credentials = credentials,
                tipAmount = tipAmount,
            ),
        )
    }

    override suspend fun sendPhoneNumberCode(
        phoneNumber: String,
        settings: PhoneNumberAuthenticationSettings?,
        type: PhoneNumberCodeType,
    ): TdlResult<AuthenticationCodeInfo> {
        return repository.send(
            function = SendPhoneNumberCode(
                phoneNumber = phoneNumber,
                settings = settings,
                type = type,
            ),
        )
    }

    override suspend fun sendPhoneNumberFirebaseSms(token: String): TdlResult<Ok> {
        return repository.send(
            function = SendPhoneNumberFirebaseSms(
                token = token,
            ),
        )
    }

    override suspend fun sendQuickReplyShortcutMessages(
        chatId: Long,
        shortcutId: Int,
        sendingId: Int,
    ): TdlResult<Messages> {
        return repository.send(
            function = SendQuickReplyShortcutMessages(
                chatId = chatId,
                shortcutId = shortcutId,
                sendingId = sendingId,
            ),
        )
    }

    override suspend fun sendResoldGift(
        giftName: String,
        ownerId: MessageSender,
        starCount: Long,
    ): TdlResult<Ok> {
        return repository.send(
            function = SendResoldGift(
                giftName = giftName,
                ownerId = ownerId,
                starCount = starCount,
            ),
        )
    }

    override suspend fun sendWebAppCustomRequest(
        botUserId: Long,
        method: String,
        parameters: String,
    ): TdlResult<CustomRequestResult> {
        return repository.send(
            function = SendWebAppCustomRequest(
                botUserId = botUserId,
                method = method,
                parameters = parameters,
            ),
        )
    }

    override suspend fun sendWebAppData(
        botUserId: Long,
        buttonText: String,
        data: String,
    ): TdlResult<Ok> {
        return repository.send(
            function = SendWebAppData(
                botUserId = botUserId,
                buttonText = buttonText,
                data = data,
            ),
        )
    }

    override suspend fun setAccentColor(accentColorId: Int, backgroundCustomEmojiId: Long): TdlResult<Ok> {
        return repository.send(
            function = SetAccentColor(
                accentColorId = accentColorId,
                backgroundCustomEmojiId = backgroundCustomEmojiId,
            ),
        )
    }

    override suspend fun setAccountTtl(ttl: AccountTtl): TdlResult<Ok> {
        return repository.send(
            function = SetAccountTtl(
                ttl = ttl,
            ),
        )
    }

    override suspend fun setAlarm(seconds: Double): TdlResult<Ok> {
        return repository.send(
            function = SetAlarm(
                seconds = seconds,
            ),
        )
    }

    override suspend fun setApplicationVerificationToken(verificationId: Long, token: String): TdlResult<Ok> {
        return repository.send(
            function = SetApplicationVerificationToken(
                verificationId = verificationId,
                token = token,
            ),
        )
    }

    override suspend fun setArchiveChatListSettings(settings: ArchiveChatListSettings): TdlResult<Ok> {
        return repository.send(
            function = SetArchiveChatListSettings(
                settings = settings,
            ),
        )
    }

    override suspend fun setAuthenticationEmailAddress(emailAddress: String): TdlResult<Ok> {
        return repository.send(
            function = SetAuthenticationEmailAddress(
                emailAddress = emailAddress,
            ),
        )
    }

    override suspend fun setAuthenticationPhoneNumber(phoneNumber: String, settings: PhoneNumberAuthenticationSettings?): TdlResult<Ok> {
        return repository.send(
            function = SetAuthenticationPhoneNumber(
                phoneNumber = phoneNumber,
                settings = settings,
            ),
        )
    }

    override suspend fun setAuthenticationPremiumPurchaseTransaction(
        transaction: StoreTransaction,
        isRestore: Boolean,
        currency: String,
        amount: Long,
    ): TdlResult<Ok> {
        return repository.send(
            function = SetAuthenticationPremiumPurchaseTransaction(
                transaction = transaction,
                isRestore = isRestore,
                currency = currency,
                amount = amount,
            ),
        )
    }

    override suspend fun setAutoDownloadSettings(settings: AutoDownloadSettings, type: NetworkType): TdlResult<Ok> {
        return repository.send(
            function = SetAutoDownloadSettings(
                settings = settings,
                type = type,
            ),
        )
    }

    override suspend fun setAutosaveSettings(scope: AutosaveSettingsScope, settings: ScopeAutosaveSettings?): TdlResult<Ok> {
        return repository.send(
            function = SetAutosaveSettings(
                scope = scope,
                settings = settings,
            ),
        )
    }

    override suspend fun setBio(bio: String): TdlResult<Ok> {
        return repository.send(
            function = SetBio(
                bio = bio,
            ),
        )
    }

    override suspend fun setBirthdate(birthdate: Birthdate?): TdlResult<Ok> {
        return repository.send(
            function = SetBirthdate(
                birthdate = birthdate,
            ),
        )
    }

    override suspend fun setBotInfoDescription(
        botUserId: Long,
        languageCode: String,
        description: String,
    ): TdlResult<Ok> {
        return repository.send(
            function = SetBotInfoDescription(
                botUserId = botUserId,
                languageCode = languageCode,
                description = description,
            ),
        )
    }

    override suspend fun setBotInfoShortDescription(
        botUserId: Long,
        languageCode: String,
        shortDescription: String,
    ): TdlResult<Ok> {
        return repository.send(
            function = SetBotInfoShortDescription(
                botUserId = botUserId,
                languageCode = languageCode,
                shortDescription = shortDescription,
            ),
        )
    }

    override suspend fun setBotName(
        botUserId: Long,
        languageCode: String,
        name: String,
    ): TdlResult<Ok> {
        return repository.send(
            function = SetBotName(
                botUserId = botUserId,
                languageCode = languageCode,
                name = name,
            ),
        )
    }

    override suspend fun setBotProfilePhoto(botUserId: Long, photo: InputChatPhoto?): TdlResult<Ok> {
        return repository.send(
            function = SetBotProfilePhoto(
                botUserId = botUserId,
                photo = photo,
            ),
        )
    }

    override suspend fun setBotUpdatesStatus(pendingUpdateCount: Int, errorMessage: String): TdlResult<Ok> {
        return repository.send(
            function = SetBotUpdatesStatus(
                pendingUpdateCount = pendingUpdateCount,
                errorMessage = errorMessage,
            ),
        )
    }

    override suspend fun setBusinessAccountBio(businessConnectionId: String, bio: String): TdlResult<Ok> {
        return repository.send(
            function = SetBusinessAccountBio(
                businessConnectionId = businessConnectionId,
                bio = bio,
            ),
        )
    }

    override suspend fun setBusinessAccountGiftSettings(businessConnectionId: String, settings: GiftSettings): TdlResult<Ok> {
        return repository.send(
            function = SetBusinessAccountGiftSettings(
                businessConnectionId = businessConnectionId,
                settings = settings,
            ),
        )
    }

    override suspend fun setBusinessAccountName(
        businessConnectionId: String,
        firstName: String,
        lastName: String,
    ): TdlResult<Ok> {
        return repository.send(
            function = SetBusinessAccountName(
                businessConnectionId = businessConnectionId,
                firstName = firstName,
                lastName = lastName,
            ),
        )
    }

    override suspend fun setBusinessAccountProfilePhoto(
        businessConnectionId: String,
        photo: InputChatPhoto?,
        isPublic: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = SetBusinessAccountProfilePhoto(
                businessConnectionId = businessConnectionId,
                photo = photo,
                isPublic = isPublic,
            ),
        )
    }

    override suspend fun setBusinessAccountUsername(businessConnectionId: String, username: String): TdlResult<Ok> {
        return repository.send(
            function = SetBusinessAccountUsername(
                businessConnectionId = businessConnectionId,
                username = username,
            ),
        )
    }

    override suspend fun setBusinessAwayMessageSettings(awayMessageSettings: BusinessAwayMessageSettings?): TdlResult<Ok> {
        return repository.send(
            function = SetBusinessAwayMessageSettings(
                awayMessageSettings = awayMessageSettings,
            ),
        )
    }

    override suspend fun setBusinessConnectedBot(bot: BusinessConnectedBot): TdlResult<Ok> {
        return repository.send(
            function = SetBusinessConnectedBot(
                bot = bot,
            ),
        )
    }

    override suspend fun setBusinessGreetingMessageSettings(greetingMessageSettings: BusinessGreetingMessageSettings?): TdlResult<Ok> {
        return repository.send(
            function = SetBusinessGreetingMessageSettings(
                greetingMessageSettings = greetingMessageSettings,
            ),
        )
    }

    override suspend fun setBusinessLocation(location: BusinessLocation?): TdlResult<Ok> {
        return repository.send(
            function = SetBusinessLocation(
                location = location,
            ),
        )
    }

    override suspend fun setBusinessMessageIsPinned(
        businessConnectionId: String,
        chatId: Long,
        messageId: Long,
        isPinned: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = SetBusinessMessageIsPinned(
                businessConnectionId = businessConnectionId,
                chatId = chatId,
                messageId = messageId,
                isPinned = isPinned,
            ),
        )
    }

    override suspend fun setBusinessOpeningHours(openingHours: BusinessOpeningHours?): TdlResult<Ok> {
        return repository.send(
            function = SetBusinessOpeningHours(
                openingHours = openingHours,
            ),
        )
    }

    override suspend fun setBusinessStartPage(startPage: InputBusinessStartPage?): TdlResult<Ok> {
        return repository.send(
            function = SetBusinessStartPage(
                startPage = startPage,
            ),
        )
    }

    override suspend fun setChatAccentColor(
        chatId: Long,
        accentColorId: Int,
        backgroundCustomEmojiId: Long,
    ): TdlResult<Ok> {
        return repository.send(
            function = SetChatAccentColor(
                chatId = chatId,
                accentColorId = accentColorId,
                backgroundCustomEmojiId = backgroundCustomEmojiId,
            ),
        )
    }

    override suspend fun setChatActiveStoriesList(chatId: Long, storyList: StoryList): TdlResult<Ok> {
        return repository.send(
            function = SetChatActiveStoriesList(
                chatId = chatId,
                storyList = storyList,
            ),
        )
    }

    override suspend fun setChatAffiliateProgram(chatId: Long, parameters: AffiliateProgramParameters?): TdlResult<Ok> {
        return repository.send(
            function = SetChatAffiliateProgram(
                chatId = chatId,
                parameters = parameters,
            ),
        )
    }

    override suspend fun setChatAvailableReactions(chatId: Long, availableReactions: ChatAvailableReactions): TdlResult<Ok> {
        return repository.send(
            function = SetChatAvailableReactions(
                chatId = chatId,
                availableReactions = availableReactions,
            ),
        )
    }

    override suspend fun setChatBackground(
        chatId: Long,
        background: InputBackground?,
        type: BackgroundType?,
        darkThemeDimming: Int,
        onlyForSelf: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = SetChatBackground(
                chatId = chatId,
                background = background,
                type = type,
                darkThemeDimming = darkThemeDimming,
                onlyForSelf = onlyForSelf,
            ),
        )
    }

    override suspend fun setChatClientData(chatId: Long, clientData: String): TdlResult<Ok> {
        return repository.send(
            function = SetChatClientData(
                chatId = chatId,
                clientData = clientData,
            ),
        )
    }

    override suspend fun setChatDescription(chatId: Long, description: String): TdlResult<Ok> {
        return repository.send(
            function = SetChatDescription(
                chatId = chatId,
                description = description,
            ),
        )
    }

    override suspend fun setChatDirectMessagesGroup(
        chatId: Long,
        isEnabled: Boolean,
        paidMessageStarCount: Long,
    ): TdlResult<Ok> {
        return repository.send(
            function = SetChatDirectMessagesGroup(
                chatId = chatId,
                isEnabled = isEnabled,
                paidMessageStarCount = paidMessageStarCount,
            ),
        )
    }

    override suspend fun setChatDiscussionGroup(chatId: Long, discussionChatId: Long): TdlResult<Ok> {
        return repository.send(
            function = SetChatDiscussionGroup(
                chatId = chatId,
                discussionChatId = discussionChatId,
            ),
        )
    }

    override suspend fun setChatDraftMessage(
        chatId: Long,
        messageThreadId: Long,
        draftMessage: DraftMessage?,
    ): TdlResult<Ok> {
        return repository.send(
            function = SetChatDraftMessage(
                chatId = chatId,
                messageThreadId = messageThreadId,
                draftMessage = draftMessage,
            ),
        )
    }

    override suspend fun setChatEmojiStatus(chatId: Long, emojiStatus: EmojiStatus?): TdlResult<Ok> {
        return repository.send(
            function = SetChatEmojiStatus(
                chatId = chatId,
                emojiStatus = emojiStatus,
            ),
        )
    }

    override suspend fun setChatLocation(chatId: Long, location: ChatLocation): TdlResult<Ok> {
        return repository.send(
            function = SetChatLocation(
                chatId = chatId,
                location = location,
            ),
        )
    }

    override suspend fun setChatMemberStatus(
        chatId: Long,
        memberId: MessageSender,
        status: ChatMemberStatus,
    ): TdlResult<Ok> {
        return repository.send(
            function = SetChatMemberStatus(
                chatId = chatId,
                memberId = memberId,
                status = status,
            ),
        )
    }

    override suspend fun setChatMessageAutoDeleteTime(chatId: Long, messageAutoDeleteTime: Int): TdlResult<Ok> {
        return repository.send(
            function = SetChatMessageAutoDeleteTime(
                chatId = chatId,
                messageAutoDeleteTime = messageAutoDeleteTime,
            ),
        )
    }

    override suspend fun setChatMessageSender(chatId: Long, messageSenderId: MessageSender): TdlResult<Ok> {
        return repository.send(
            function = SetChatMessageSender(
                chatId = chatId,
                messageSenderId = messageSenderId,
            ),
        )
    }

    override suspend fun setChatNotificationSettings(chatId: Long, notificationSettings: ChatNotificationSettings): TdlResult<Ok> {
        return repository.send(
            function = SetChatNotificationSettings(
                chatId = chatId,
                notificationSettings = notificationSettings,
            ),
        )
    }

    override suspend fun setChatPaidMessageStarCount(chatId: Long, paidMessageStarCount: Long): TdlResult<Ok> {
        return repository.send(
            function = SetChatPaidMessageStarCount(
                chatId = chatId,
                paidMessageStarCount = paidMessageStarCount,
            ),
        )
    }

    override suspend fun setChatPermissions(chatId: Long, permissions: ChatPermissions): TdlResult<Ok> {
        return repository.send(
            function = SetChatPermissions(
                chatId = chatId,
                permissions = permissions,
            ),
        )
    }

    override suspend fun setChatPhoto(chatId: Long, photo: InputChatPhoto?): TdlResult<Ok> {
        return repository.send(
            function = SetChatPhoto(
                chatId = chatId,
                photo = photo,
            ),
        )
    }

    override suspend fun setChatPinnedStories(chatId: Long, storyIds: IntArray): TdlResult<Ok> {
        return repository.send(
            function = SetChatPinnedStories(
                chatId = chatId,
                storyIds = storyIds,
            ),
        )
    }

    override suspend fun setChatProfileAccentColor(
        chatId: Long,
        profileAccentColorId: Int,
        profileBackgroundCustomEmojiId: Long,
    ): TdlResult<Ok> {
        return repository.send(
            function = SetChatProfileAccentColor(
                chatId = chatId,
                profileAccentColorId = profileAccentColorId,
                profileBackgroundCustomEmojiId = profileBackgroundCustomEmojiId,
            ),
        )
    }

    override suspend fun setChatSlowModeDelay(chatId: Long, slowModeDelay: Int): TdlResult<Ok> {
        return repository.send(
            function = SetChatSlowModeDelay(
                chatId = chatId,
                slowModeDelay = slowModeDelay,
            ),
        )
    }

    override suspend fun setChatTheme(chatId: Long, themeName: String): TdlResult<Ok> {
        return repository.send(
            function = SetChatTheme(
                chatId = chatId,
                themeName = themeName,
            ),
        )
    }

    override suspend fun setChatTitle(chatId: Long, title: String): TdlResult<Ok> {
        return repository.send(
            function = SetChatTitle(
                chatId = chatId,
                title = title,
            ),
        )
    }

    override suspend fun setCloseFriends(userIds: LongArray): TdlResult<Ok> {
        return repository.send(
            function = SetCloseFriends(
                userIds = userIds,
            ),
        )
    }

    override suspend fun setCommands(
        scope: BotCommandScope?,
        languageCode: String,
        commands: Array<BotCommand>,
    ): TdlResult<Ok> {
        return repository.send(
            function = SetCommands(
                scope = scope,
                languageCode = languageCode,
                commands = commands,
            ),
        )
    }

    override suspend fun setCustomEmojiStickerSetThumbnail(name: String, customEmojiId: Long): TdlResult<Ok> {
        return repository.send(
            function = SetCustomEmojiStickerSetThumbnail(
                name = name,
                customEmojiId = customEmojiId,
            ),
        )
    }

    override suspend fun setCustomLanguagePack(info: LanguagePackInfo, strings: Array<LanguagePackString>): TdlResult<Ok> {
        return repository.send(
            function = SetCustomLanguagePack(
                info = info,
                strings = strings,
            ),
        )
    }

    override suspend fun setCustomLanguagePackString(languagePackId: String, newString: LanguagePackString): TdlResult<Ok> {
        return repository.send(
            function = SetCustomLanguagePackString(
                languagePackId = languagePackId,
                newString = newString,
            ),
        )
    }

    override suspend fun setDatabaseEncryptionKey(newEncryptionKey: ByteArray): TdlResult<Ok> {
        return repository.send(
            function = SetDatabaseEncryptionKey(
                newEncryptionKey = newEncryptionKey,
            ),
        )
    }

    override suspend fun setDefaultBackground(
        background: InputBackground?,
        type: BackgroundType?,
        forDarkTheme: Boolean,
    ): TdlResult<Background> {
        return repository.send(
            function = SetDefaultBackground(
                background = background,
                type = type,
                forDarkTheme = forDarkTheme,
            ),
        )
    }

    override suspend fun setDefaultChannelAdministratorRights(defaultChannelAdministratorRights: ChatAdministratorRights?): TdlResult<Ok> {
        return repository.send(
            function = SetDefaultChannelAdministratorRights(
                defaultChannelAdministratorRights = defaultChannelAdministratorRights,
            ),
        )
    }

    override suspend fun setDefaultGroupAdministratorRights(defaultGroupAdministratorRights: ChatAdministratorRights?): TdlResult<Ok> {
        return repository.send(
            function = SetDefaultGroupAdministratorRights(
                defaultGroupAdministratorRights = defaultGroupAdministratorRights,
            ),
        )
    }

    override suspend fun setDefaultMessageAutoDeleteTime(messageAutoDeleteTime: MessageAutoDeleteTime): TdlResult<Ok> {
        return repository.send(
            function = SetDefaultMessageAutoDeleteTime(
                messageAutoDeleteTime = messageAutoDeleteTime,
            ),
        )
    }

    override suspend fun setDefaultReactionType(reactionType: ReactionType): TdlResult<Ok> {
        return repository.send(
            function = SetDefaultReactionType(
                reactionType = reactionType,
            ),
        )
    }

    override suspend fun setDirectMessagesChatTopicDraftMessage(
        chatId: Long,
        topicId: Long,
        draftMessage: DraftMessage?,
    ): TdlResult<Ok> {
        return repository.send(
            function = SetDirectMessagesChatTopicDraftMessage(
                chatId = chatId,
                topicId = topicId,
                draftMessage = draftMessage,
            ),
        )
    }

    override suspend fun setDirectMessagesChatTopicIsMarkedAsUnread(
        chatId: Long,
        topicId: Long,
        isMarkedAsUnread: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = SetDirectMessagesChatTopicIsMarkedAsUnread(
                chatId = chatId,
                topicId = topicId,
                isMarkedAsUnread = isMarkedAsUnread,
            ),
        )
    }

    override suspend fun setEmojiStatus(emojiStatus: EmojiStatus?): TdlResult<Ok> {
        return repository.send(
            function = SetEmojiStatus(
                emojiStatus = emojiStatus,
            ),
        )
    }

    override suspend fun setFileGenerationProgress(
        generationId: Long,
        expectedSize: Long,
        localPrefixSize: Long,
    ): TdlResult<Ok> {
        return repository.send(
            function = SetFileGenerationProgress(
                generationId = generationId,
                expectedSize = expectedSize,
                localPrefixSize = localPrefixSize,
            ),
        )
    }

    override suspend fun setForumTopicNotificationSettings(
        chatId: Long,
        messageThreadId: Long,
        notificationSettings: ChatNotificationSettings,
    ): TdlResult<Ok> {
        return repository.send(
            function = SetForumTopicNotificationSettings(
                chatId = chatId,
                messageThreadId = messageThreadId,
                notificationSettings = notificationSettings,
            ),
        )
    }

    override suspend fun setGameScore(
        chatId: Long,
        messageId: Long,
        editMessage: Boolean,
        userId: Long,
        score: Int,
        force: Boolean,
    ): TdlResult<Message> {
        return repository.send(
            function = SetGameScore(
                chatId = chatId,
                messageId = messageId,
                editMessage = editMessage,
                userId = userId,
                score = score,
                force = force,
            ),
        )
    }

    override suspend fun setGiftResalePrice(receivedGiftId: String, resaleStarCount: Long): TdlResult<Ok> {
        return repository.send(
            function = SetGiftResalePrice(
                receivedGiftId = receivedGiftId,
                resaleStarCount = resaleStarCount,
            ),
        )
    }

    override suspend fun setGiftSettings(settings: GiftSettings): TdlResult<Ok> {
        return repository.send(
            function = SetGiftSettings(
                settings = settings,
            ),
        )
    }

    override suspend fun setGroupCallParticipantIsSpeaking(
        groupCallId: Int,
        audioSource: Int,
        isSpeaking: Boolean,
    ): TdlResult<MessageSender> {
        return repository.send(
            function = SetGroupCallParticipantIsSpeaking(
                groupCallId = groupCallId,
                audioSource = audioSource,
                isSpeaking = isSpeaking,
            ),
        )
    }

    override suspend fun setGroupCallParticipantVolumeLevel(
        groupCallId: Int,
        participantId: MessageSender,
        volumeLevel: Int,
    ): TdlResult<Ok> {
        return repository.send(
            function = SetGroupCallParticipantVolumeLevel(
                groupCallId = groupCallId,
                participantId = participantId,
                volumeLevel = volumeLevel,
            ),
        )
    }

    override suspend fun setInactiveSessionTtl(inactiveSessionTtlDays: Int): TdlResult<Ok> {
        return repository.send(
            function = SetInactiveSessionTtl(
                inactiveSessionTtlDays = inactiveSessionTtlDays,
            ),
        )
    }

    override suspend fun setInlineGameScore(
        inlineMessageId: String,
        editMessage: Boolean,
        userId: Long,
        score: Int,
        force: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = SetInlineGameScore(
                inlineMessageId = inlineMessageId,
                editMessage = editMessage,
                userId = userId,
                score = score,
                force = force,
            ),
        )
    }

    override suspend fun setLogStream(logStream: LogStream): TdlResult<Ok> {
        return repository.send(
            function = SetLogStream(
                logStream = logStream,
            ),
        )
    }

    override suspend fun setLogTagVerbosityLevel(tag: String, newVerbosityLevel: Int): TdlResult<Ok> {
        return repository.send(
            function = SetLogTagVerbosityLevel(
                tag = tag,
                newVerbosityLevel = newVerbosityLevel,
            ),
        )
    }

    override suspend fun setLogVerbosityLevel(newVerbosityLevel: Int): TdlResult<Ok> {
        return repository.send(
            function = SetLogVerbosityLevel(
                newVerbosityLevel = newVerbosityLevel,
            ),
        )
    }

    override suspend fun setLoginEmailAddress(newLoginEmailAddress: String): TdlResult<EmailAddressAuthenticationCodeInfo> {
        return repository.send(
            function = SetLoginEmailAddress(
                newLoginEmailAddress = newLoginEmailAddress,
            ),
        )
    }

    override suspend fun setMenuButton(userId: Long, menuButton: BotMenuButton): TdlResult<Ok> {
        return repository.send(
            function = SetMenuButton(
                userId = userId,
                menuButton = menuButton,
            ),
        )
    }

    override suspend fun setMessageFactCheck(
        chatId: Long,
        messageId: Long,
        text: FormattedText?,
    ): TdlResult<Ok> {
        return repository.send(
            function = SetMessageFactCheck(
                chatId = chatId,
                messageId = messageId,
                text = text,
            ),
        )
    }

    override suspend fun setMessageReactions(
        chatId: Long,
        messageId: Long,
        reactionTypes: Array<ReactionType>,
        isBig: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = SetMessageReactions(
                chatId = chatId,
                messageId = messageId,
                reactionTypes = reactionTypes,
                isBig = isBig,
            ),
        )
    }

    override suspend fun setMessageSenderBlockList(senderId: MessageSender, blockList: BlockList?): TdlResult<Ok> {
        return repository.send(
            function = SetMessageSenderBlockList(
                senderId = senderId,
                blockList = blockList,
            ),
        )
    }

    override suspend fun setMessageSenderBotVerification(
        botUserId: Long,
        verifiedId: MessageSender,
        customDescription: String,
    ): TdlResult<Ok> {
        return repository.send(
            function = SetMessageSenderBotVerification(
                botUserId = botUserId,
                verifiedId = verifiedId,
                customDescription = customDescription,
            ),
        )
    }

    override suspend fun setName(firstName: String, lastName: String): TdlResult<Ok> {
        return repository.send(
            function = SetName(
                firstName = firstName,
                lastName = lastName,
            ),
        )
    }

    override suspend fun setNetworkType(type: NetworkType?): TdlResult<Ok> {
        return repository.send(
            function = SetNetworkType(
                type = type,
            ),
        )
    }

    override suspend fun setNewChatPrivacySettings(settings: NewChatPrivacySettings): TdlResult<Ok> {
        return repository.send(
            function = SetNewChatPrivacySettings(
                settings = settings,
            ),
        )
    }

    override suspend fun setOption(name: String, value: OptionValue?): TdlResult<Ok> {
        return repository.send(
            function = SetOption(
                name = name,
                value = value,
            ),
        )
    }

    override suspend fun setPaidMessageReactionType(
        chatId: Long,
        messageId: Long,
        type: PaidReactionType,
    ): TdlResult<Ok> {
        return repository.send(
            function = SetPaidMessageReactionType(
                chatId = chatId,
                messageId = messageId,
                type = type,
            ),
        )
    }

    override suspend fun setPassportElement(element: InputPassportElement, password: String): TdlResult<PassportElement> {
        return repository.send(
            function = SetPassportElement(
                element = element,
                password = password,
            ),
        )
    }

    override suspend fun setPassportElementErrors(userId: Long, errors: Array<InputPassportElementError>): TdlResult<Ok> {
        return repository.send(
            function = SetPassportElementErrors(
                userId = userId,
                errors = errors,
            ),
        )
    }

    override suspend fun setPassword(
        oldPassword: String,
        newPassword: String,
        newHint: String,
        setRecoveryEmailAddress: Boolean,
        newRecoveryEmailAddress: String,
    ): TdlResult<PasswordState> {
        return repository.send(
            function = SetPassword(
                oldPassword = oldPassword,
                newPassword = newPassword,
                newHint = newHint,
                setRecoveryEmailAddress = setRecoveryEmailAddress,
                newRecoveryEmailAddress = newRecoveryEmailAddress,
            ),
        )
    }

    override suspend fun setPersonalChat(chatId: Long): TdlResult<Ok> {
        return repository.send(
            function = SetPersonalChat(
                chatId = chatId,
            ),
        )
    }

    override suspend fun setPinnedChats(chatList: ChatList, chatIds: LongArray): TdlResult<Ok> {
        return repository.send(
            function = SetPinnedChats(
                chatList = chatList,
                chatIds = chatIds,
            ),
        )
    }

    override suspend fun setPinnedForumTopics(chatId: Long, messageThreadIds: LongArray): TdlResult<Ok> {
        return repository.send(
            function = SetPinnedForumTopics(
                chatId = chatId,
                messageThreadIds = messageThreadIds,
            ),
        )
    }

    override suspend fun setPinnedGifts(ownerId: MessageSender, receivedGiftIds: Array<String>): TdlResult<Ok> {
        return repository.send(
            function = SetPinnedGifts(
                ownerId = ownerId,
                receivedGiftIds = receivedGiftIds,
            ),
        )
    }

    override suspend fun setPinnedSavedMessagesTopics(savedMessagesTopicIds: LongArray): TdlResult<Ok> {
        return repository.send(
            function = SetPinnedSavedMessagesTopics(
                savedMessagesTopicIds = savedMessagesTopicIds,
            ),
        )
    }

    override suspend fun setPollAnswer(
        chatId: Long,
        messageId: Long,
        optionIds: IntArray,
    ): TdlResult<Ok> {
        return repository.send(
            function = SetPollAnswer(
                chatId = chatId,
                messageId = messageId,
                optionIds = optionIds,
            ),
        )
    }

    override suspend fun setProfileAccentColor(profileAccentColorId: Int, profileBackgroundCustomEmojiId: Long): TdlResult<Ok> {
        return repository.send(
            function = SetProfileAccentColor(
                profileAccentColorId = profileAccentColorId,
                profileBackgroundCustomEmojiId = profileBackgroundCustomEmojiId,
            ),
        )
    }

    override suspend fun setProfilePhoto(photo: InputChatPhoto, isPublic: Boolean): TdlResult<Ok> {
        return repository.send(
            function = SetProfilePhoto(
                photo = photo,
                isPublic = isPublic,
            ),
        )
    }

    override suspend fun setQuickReplyShortcutName(shortcutId: Int, name: String): TdlResult<Ok> {
        return repository.send(
            function = SetQuickReplyShortcutName(
                shortcutId = shortcutId,
                name = name,
            ),
        )
    }

    override suspend fun setReactionNotificationSettings(notificationSettings: ReactionNotificationSettings): TdlResult<Ok> {
        return repository.send(
            function = SetReactionNotificationSettings(
                notificationSettings = notificationSettings,
            ),
        )
    }

    override suspend fun setReadDatePrivacySettings(settings: ReadDatePrivacySettings): TdlResult<Ok> {
        return repository.send(
            function = SetReadDatePrivacySettings(
                settings = settings,
            ),
        )
    }

    override suspend fun setRecoveryEmailAddress(password: String, newRecoveryEmailAddress: String): TdlResult<PasswordState> {
        return repository.send(
            function = SetRecoveryEmailAddress(
                password = password,
                newRecoveryEmailAddress = newRecoveryEmailAddress,
            ),
        )
    }

    override suspend fun setSavedMessagesTagLabel(tag: ReactionType, label: String): TdlResult<Ok> {
        return repository.send(
            function = SetSavedMessagesTagLabel(
                tag = tag,
                label = label,
            ),
        )
    }

    override suspend fun setScopeNotificationSettings(scope: NotificationSettingsScope, notificationSettings: ScopeNotificationSettings): TdlResult<Ok> {
        return repository.send(
            function = SetScopeNotificationSettings(
                scope = scope,
                notificationSettings = notificationSettings,
            ),
        )
    }

    override suspend fun setStickerEmojis(sticker: InputFile, emojis: String): TdlResult<Ok> {
        return repository.send(
            function = SetStickerEmojis(
                sticker = sticker,
                emojis = emojis,
            ),
        )
    }

    override suspend fun setStickerKeywords(sticker: InputFile, keywords: Array<String>): TdlResult<Ok> {
        return repository.send(
            function = SetStickerKeywords(
                sticker = sticker,
                keywords = keywords,
            ),
        )
    }

    override suspend fun setStickerMaskPosition(sticker: InputFile, maskPosition: MaskPosition?): TdlResult<Ok> {
        return repository.send(
            function = SetStickerMaskPosition(
                sticker = sticker,
                maskPosition = maskPosition,
            ),
        )
    }

    override suspend fun setStickerPositionInSet(sticker: InputFile, position: Int): TdlResult<Ok> {
        return repository.send(
            function = SetStickerPositionInSet(
                sticker = sticker,
                position = position,
            ),
        )
    }

    override suspend fun setStickerSetThumbnail(
        userId: Long,
        name: String,
        thumbnail: InputFile?,
        format: StickerFormat?,
    ): TdlResult<Ok> {
        return repository.send(
            function = SetStickerSetThumbnail(
                userId = userId,
                name = name,
                thumbnail = thumbnail,
                format = format,
            ),
        )
    }

    override suspend fun setStickerSetTitle(name: String, title: String): TdlResult<Ok> {
        return repository.send(
            function = SetStickerSetTitle(
                name = name,
                title = title,
            ),
        )
    }

    override suspend fun setStoryPrivacySettings(storyId: Int, privacySettings: StoryPrivacySettings): TdlResult<Ok> {
        return repository.send(
            function = SetStoryPrivacySettings(
                storyId = storyId,
                privacySettings = privacySettings,
            ),
        )
    }

    override suspend fun setStoryReaction(
        storyPosterChatId: Long,
        storyId: Int,
        reactionType: ReactionType?,
        updateRecentReactions: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = SetStoryReaction(
                storyPosterChatId = storyPosterChatId,
                storyId = storyId,
                reactionType = reactionType,
                updateRecentReactions = updateRecentReactions,
            ),
        )
    }

    override suspend fun setSupergroupCustomEmojiStickerSet(supergroupId: Long, customEmojiStickerSetId: Long): TdlResult<Ok> {
        return repository.send(
            function = SetSupergroupCustomEmojiStickerSet(
                supergroupId = supergroupId,
                customEmojiStickerSetId = customEmojiStickerSetId,
            ),
        )
    }

    override suspend fun setSupergroupStickerSet(supergroupId: Long, stickerSetId: Long): TdlResult<Ok> {
        return repository.send(
            function = SetSupergroupStickerSet(
                supergroupId = supergroupId,
                stickerSetId = stickerSetId,
            ),
        )
    }

    override suspend fun setSupergroupUnrestrictBoostCount(supergroupId: Long, unrestrictBoostCount: Int): TdlResult<Ok> {
        return repository.send(
            function = SetSupergroupUnrestrictBoostCount(
                supergroupId = supergroupId,
                unrestrictBoostCount = unrestrictBoostCount,
            ),
        )
    }

    override suspend fun setSupergroupUsername(supergroupId: Long, username: String): TdlResult<Ok> {
        return repository.send(
            function = SetSupergroupUsername(
                supergroupId = supergroupId,
                username = username,
            ),
        )
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
        return repository.send(
            function = SetTdlibParameters(
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
            ),
        )
    }

    override suspend fun setUserEmojiStatus(userId: Long, emojiStatus: EmojiStatus?): TdlResult<Ok> {
        return repository.send(
            function = SetUserEmojiStatus(
                userId = userId,
                emojiStatus = emojiStatus,
            ),
        )
    }

    override suspend fun setUserPersonalProfilePhoto(userId: Long, photo: InputChatPhoto?): TdlResult<Ok> {
        return repository.send(
            function = SetUserPersonalProfilePhoto(
                userId = userId,
                photo = photo,
            ),
        )
    }

    override suspend fun setUserPrivacySettingRules(setting: UserPrivacySetting, rules: UserPrivacySettingRules): TdlResult<Ok> {
        return repository.send(
            function = SetUserPrivacySettingRules(
                setting = setting,
                rules = rules,
            ),
        )
    }

    override suspend fun setUserSupportInfo(userId: Long, message: FormattedText): TdlResult<UserSupportInfo> {
        return repository.send(
            function = SetUserSupportInfo(
                userId = userId,
                message = message,
            ),
        )
    }

    override suspend fun setUsername(username: String): TdlResult<Ok> {
        return repository.send(
            function = SetUsername(
                username = username,
            ),
        )
    }

    override suspend fun setVideoChatDefaultParticipant(chatId: Long, defaultParticipantId: MessageSender): TdlResult<Ok> {
        return repository.send(
            function = SetVideoChatDefaultParticipant(
                chatId = chatId,
                defaultParticipantId = defaultParticipantId,
            ),
        )
    }

    override suspend fun setVideoChatTitle(groupCallId: Int, title: String): TdlResult<Ok> {
        return repository.send(
            function = SetVideoChatTitle(
                groupCallId = groupCallId,
                title = title,
            ),
        )
    }

    override suspend fun shareChatWithBot(
        chatId: Long,
        messageId: Long,
        buttonId: Int,
        sharedChatId: Long,
        onlyCheck: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = ShareChatWithBot(
                chatId = chatId,
                messageId = messageId,
                buttonId = buttonId,
                sharedChatId = sharedChatId,
                onlyCheck = onlyCheck,
            ),
        )
    }

    override suspend fun sharePhoneNumber(userId: Long): TdlResult<Ok> {
        return repository.send(
            function = SharePhoneNumber(
                userId = userId,
            ),
        )
    }

    override suspend fun shareUsersWithBot(
        chatId: Long,
        messageId: Long,
        buttonId: Int,
        sharedUserIds: LongArray,
        onlyCheck: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = ShareUsersWithBot(
                chatId = chatId,
                messageId = messageId,
                buttonId = buttonId,
                sharedUserIds = sharedUserIds,
                onlyCheck = onlyCheck,
            ),
        )
    }

    override suspend fun startGroupCallRecording(
        groupCallId: Int,
        title: String,
        recordVideo: Boolean,
        usePortraitOrientation: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = StartGroupCallRecording(
                groupCallId = groupCallId,
                title = title,
                recordVideo = recordVideo,
                usePortraitOrientation = usePortraitOrientation,
            ),
        )
    }

    override suspend fun startGroupCallScreenSharing(
        groupCallId: Int,
        audioSourceId: Int,
        payload: String,
    ): TdlResult<Text> {
        return repository.send(
            function = StartGroupCallScreenSharing(
                groupCallId = groupCallId,
                audioSourceId = audioSourceId,
                payload = payload,
            ),
        )
    }

    override suspend fun startScheduledVideoChat(groupCallId: Int): TdlResult<Ok> {
        return repository.send(
            function = StartScheduledVideoChat(
                groupCallId = groupCallId,
            ),
        )
    }

    override suspend fun stopBusinessPoll(
        businessConnectionId: String,
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
    ): TdlResult<BusinessMessage> {
        return repository.send(
            function = StopBusinessPoll(
                businessConnectionId = businessConnectionId,
                chatId = chatId,
                messageId = messageId,
                replyMarkup = replyMarkup,
            ),
        )
    }

    override suspend fun stopPoll(
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
    ): TdlResult<Ok> {
        return repository.send(
            function = StopPoll(
                chatId = chatId,
                messageId = messageId,
                replyMarkup = replyMarkup,
            ),
        )
    }

    override suspend fun suggestUserProfilePhoto(userId: Long, photo: InputChatPhoto): TdlResult<Ok> {
        return repository.send(
            function = SuggestUserProfilePhoto(
                userId = userId,
                photo = photo,
            ),
        )
    }

    override suspend fun synchronizeLanguagePack(languagePackId: String): TdlResult<Ok> {
        return repository.send(
            function = SynchronizeLanguagePack(
                languagePackId = languagePackId,
            ),
        )
    }

    override suspend fun terminateAllOtherSessions(): TdlResult<Ok> {
        return repository.send(
            function = TerminateAllOtherSessions(),
        )
    }

    override suspend fun terminateSession(sessionId: Long): TdlResult<Ok> {
        return repository.send(
            function = TerminateSession(
                sessionId = sessionId,
            ),
        )
    }

    override suspend fun testCallBytes(x: ByteArray): TdlResult<TestBytes> {
        return repository.send(
            function = TestCallBytes(
                x = x,
            ),
        )
    }

    override suspend fun testCallEmpty(): TdlResult<Ok> {
        return repository.send(
            function = TestCallEmpty(),
        )
    }

    override suspend fun testCallString(x: String): TdlResult<TestString> {
        return repository.send(
            function = TestCallString(
                x = x,
            ),
        )
    }

    override suspend fun testCallVectorInt(x: IntArray): TdlResult<TestVectorInt> {
        return repository.send(
            function = TestCallVectorInt(
                x = x,
            ),
        )
    }

    override suspend fun testCallVectorIntObject(x: Array<TestInt>): TdlResult<TestVectorIntObject> {
        return repository.send(
            function = TestCallVectorIntObject(
                x = x,
            ),
        )
    }

    override suspend fun testCallVectorString(x: Array<String>): TdlResult<TestVectorString> {
        return repository.send(
            function = TestCallVectorString(
                x = x,
            ),
        )
    }

    override suspend fun testCallVectorStringObject(x: Array<TestString>): TdlResult<TestVectorStringObject> {
        return repository.send(
            function = TestCallVectorStringObject(
                x = x,
            ),
        )
    }

    override suspend fun testGetDifference(): TdlResult<Ok> {
        return repository.send(
            function = TestGetDifference(),
        )
    }

    override suspend fun testNetwork(): TdlResult<Ok> {
        return repository.send(
            function = TestNetwork(),
        )
    }

    override suspend fun testProxy(
        server: String,
        port: Int,
        type: ProxyType,
        dcId: Int,
        timeout: Double,
    ): TdlResult<Ok> {
        return repository.send(
            function = TestProxy(
                server = server,
                port = port,
                type = type,
                dcId = dcId,
                timeout = timeout,
            ),
        )
    }

    override suspend fun testReturnError(error: Error): TdlResult<Error> {
        return repository.send(
            function = TestReturnError(
                error = error,
            ),
        )
    }

    override suspend fun testSquareInt(x: Int): TdlResult<TestInt> {
        return repository.send(
            function = TestSquareInt(
                x = x,
            ),
        )
    }

    override suspend fun testUseUpdate(): TdlResult<Update> {
        return repository.send(
            function = TestUseUpdate(),
        )
    }

    override suspend fun toggleAllDownloadsArePaused(arePaused: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ToggleAllDownloadsArePaused(
                arePaused = arePaused,
            ),
        )
    }

    override suspend fun toggleBotCanManageEmojiStatus(botUserId: Long, canManageEmojiStatus: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ToggleBotCanManageEmojiStatus(
                botUserId = botUserId,
                canManageEmojiStatus = canManageEmojiStatus,
            ),
        )
    }

    override suspend fun toggleBotIsAddedToAttachmentMenu(
        botUserId: Long,
        isAdded: Boolean,
        allowWriteAccess: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = ToggleBotIsAddedToAttachmentMenu(
                botUserId = botUserId,
                isAdded = isAdded,
                allowWriteAccess = allowWriteAccess,
            ),
        )
    }

    override suspend fun toggleBotUsernameIsActive(
        botUserId: Long,
        username: String,
        isActive: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = ToggleBotUsernameIsActive(
                botUserId = botUserId,
                username = username,
                isActive = isActive,
            ),
        )
    }

    override suspend fun toggleBusinessConnectedBotChatIsPaused(chatId: Long, isPaused: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ToggleBusinessConnectedBotChatIsPaused(
                chatId = chatId,
                isPaused = isPaused,
            ),
        )
    }

    override suspend fun toggleChatDefaultDisableNotification(chatId: Long, defaultDisableNotification: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ToggleChatDefaultDisableNotification(
                chatId = chatId,
                defaultDisableNotification = defaultDisableNotification,
            ),
        )
    }

    override suspend fun toggleChatFolderTags(areTagsEnabled: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ToggleChatFolderTags(
                areTagsEnabled = areTagsEnabled,
            ),
        )
    }

    override suspend fun toggleChatGiftNotifications(chatId: Long, areEnabled: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ToggleChatGiftNotifications(
                chatId = chatId,
                areEnabled = areEnabled,
            ),
        )
    }

    override suspend fun toggleChatHasProtectedContent(chatId: Long, hasProtectedContent: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ToggleChatHasProtectedContent(
                chatId = chatId,
                hasProtectedContent = hasProtectedContent,
            ),
        )
    }

    override suspend fun toggleChatIsMarkedAsUnread(chatId: Long, isMarkedAsUnread: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ToggleChatIsMarkedAsUnread(
                chatId = chatId,
                isMarkedAsUnread = isMarkedAsUnread,
            ),
        )
    }

    override suspend fun toggleChatIsPinned(
        chatList: ChatList,
        chatId: Long,
        isPinned: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = ToggleChatIsPinned(
                chatList = chatList,
                chatId = chatId,
                isPinned = isPinned,
            ),
        )
    }

    override suspend fun toggleChatIsTranslatable(chatId: Long, isTranslatable: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ToggleChatIsTranslatable(
                chatId = chatId,
                isTranslatable = isTranslatable,
            ),
        )
    }

    override suspend fun toggleChatViewAsTopics(chatId: Long, viewAsTopics: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ToggleChatViewAsTopics(
                chatId = chatId,
                viewAsTopics = viewAsTopics,
            ),
        )
    }

    override suspend fun toggleDownloadIsPaused(fileId: Int, isPaused: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ToggleDownloadIsPaused(
                fileId = fileId,
                isPaused = isPaused,
            ),
        )
    }

    override suspend fun toggleForumTopicIsClosed(
        chatId: Long,
        messageThreadId: Long,
        isClosed: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = ToggleForumTopicIsClosed(
                chatId = chatId,
                messageThreadId = messageThreadId,
                isClosed = isClosed,
            ),
        )
    }

    override suspend fun toggleForumTopicIsPinned(
        chatId: Long,
        messageThreadId: Long,
        isPinned: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = ToggleForumTopicIsPinned(
                chatId = chatId,
                messageThreadId = messageThreadId,
                isPinned = isPinned,
            ),
        )
    }

    override suspend fun toggleGeneralForumTopicIsHidden(chatId: Long, isHidden: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ToggleGeneralForumTopicIsHidden(
                chatId = chatId,
                isHidden = isHidden,
            ),
        )
    }

    override suspend fun toggleGiftIsSaved(receivedGiftId: String, isSaved: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ToggleGiftIsSaved(
                receivedGiftId = receivedGiftId,
                isSaved = isSaved,
            ),
        )
    }

    override suspend fun toggleGroupCallIsMyVideoEnabled(groupCallId: Int, isMyVideoEnabled: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ToggleGroupCallIsMyVideoEnabled(
                groupCallId = groupCallId,
                isMyVideoEnabled = isMyVideoEnabled,
            ),
        )
    }

    override suspend fun toggleGroupCallIsMyVideoPaused(groupCallId: Int, isMyVideoPaused: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ToggleGroupCallIsMyVideoPaused(
                groupCallId = groupCallId,
                isMyVideoPaused = isMyVideoPaused,
            ),
        )
    }

    override suspend fun toggleGroupCallParticipantIsHandRaised(
        groupCallId: Int,
        participantId: MessageSender,
        isHandRaised: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = ToggleGroupCallParticipantIsHandRaised(
                groupCallId = groupCallId,
                participantId = participantId,
                isHandRaised = isHandRaised,
            ),
        )
    }

    override suspend fun toggleGroupCallParticipantIsMuted(
        groupCallId: Int,
        participantId: MessageSender,
        isMuted: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = ToggleGroupCallParticipantIsMuted(
                groupCallId = groupCallId,
                participantId = participantId,
                isMuted = isMuted,
            ),
        )
    }

    override suspend fun toggleGroupCallScreenSharingIsPaused(groupCallId: Int, isPaused: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ToggleGroupCallScreenSharingIsPaused(
                groupCallId = groupCallId,
                isPaused = isPaused,
            ),
        )
    }

    override suspend fun toggleHasSponsoredMessagesEnabled(hasSponsoredMessagesEnabled: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ToggleHasSponsoredMessagesEnabled(
                hasSponsoredMessagesEnabled = hasSponsoredMessagesEnabled,
            ),
        )
    }

    override suspend fun toggleSavedMessagesTopicIsPinned(savedMessagesTopicId: Long, isPinned: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ToggleSavedMessagesTopicIsPinned(
                savedMessagesTopicId = savedMessagesTopicId,
                isPinned = isPinned,
            ),
        )
    }

    override suspend fun toggleSessionCanAcceptCalls(sessionId: Long, canAcceptCalls: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ToggleSessionCanAcceptCalls(
                sessionId = sessionId,
                canAcceptCalls = canAcceptCalls,
            ),
        )
    }

    override suspend fun toggleSessionCanAcceptSecretChats(sessionId: Long, canAcceptSecretChats: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ToggleSessionCanAcceptSecretChats(
                sessionId = sessionId,
                canAcceptSecretChats = canAcceptSecretChats,
            ),
        )
    }

    override suspend fun toggleStoryIsPostedToChatPage(
        storyPosterChatId: Long,
        storyId: Int,
        isPostedToChatPage: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = ToggleStoryIsPostedToChatPage(
                storyPosterChatId = storyPosterChatId,
                storyId = storyId,
                isPostedToChatPage = isPostedToChatPage,
            ),
        )
    }

    override suspend fun toggleSupergroupCanHaveSponsoredMessages(supergroupId: Long, canHaveSponsoredMessages: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ToggleSupergroupCanHaveSponsoredMessages(
                supergroupId = supergroupId,
                canHaveSponsoredMessages = canHaveSponsoredMessages,
            ),
        )
    }

    override suspend fun toggleSupergroupHasAggressiveAntiSpamEnabled(supergroupId: Long, hasAggressiveAntiSpamEnabled: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ToggleSupergroupHasAggressiveAntiSpamEnabled(
                supergroupId = supergroupId,
                hasAggressiveAntiSpamEnabled = hasAggressiveAntiSpamEnabled,
            ),
        )
    }

    override suspend fun toggleSupergroupHasAutomaticTranslation(supergroupId: Long, hasAutomaticTranslation: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ToggleSupergroupHasAutomaticTranslation(
                supergroupId = supergroupId,
                hasAutomaticTranslation = hasAutomaticTranslation,
            ),
        )
    }

    override suspend fun toggleSupergroupHasHiddenMembers(supergroupId: Long, hasHiddenMembers: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ToggleSupergroupHasHiddenMembers(
                supergroupId = supergroupId,
                hasHiddenMembers = hasHiddenMembers,
            ),
        )
    }

    override suspend fun toggleSupergroupIsAllHistoryAvailable(supergroupId: Long, isAllHistoryAvailable: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ToggleSupergroupIsAllHistoryAvailable(
                supergroupId = supergroupId,
                isAllHistoryAvailable = isAllHistoryAvailable,
            ),
        )
    }

    override suspend fun toggleSupergroupIsBroadcastGroup(supergroupId: Long): TdlResult<Ok> {
        return repository.send(
            function = ToggleSupergroupIsBroadcastGroup(
                supergroupId = supergroupId,
            ),
        )
    }

    override suspend fun toggleSupergroupIsForum(
        supergroupId: Long,
        isForum: Boolean,
        hasForumTabs: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = ToggleSupergroupIsForum(
                supergroupId = supergroupId,
                isForum = isForum,
                hasForumTabs = hasForumTabs,
            ),
        )
    }

    override suspend fun toggleSupergroupJoinByRequest(supergroupId: Long, joinByRequest: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ToggleSupergroupJoinByRequest(
                supergroupId = supergroupId,
                joinByRequest = joinByRequest,
            ),
        )
    }

    override suspend fun toggleSupergroupJoinToSendMessages(supergroupId: Long, joinToSendMessages: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ToggleSupergroupJoinToSendMessages(
                supergroupId = supergroupId,
                joinToSendMessages = joinToSendMessages,
            ),
        )
    }

    override suspend fun toggleSupergroupSignMessages(
        supergroupId: Long,
        signMessages: Boolean,
        showMessageSender: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = ToggleSupergroupSignMessages(
                supergroupId = supergroupId,
                signMessages = signMessages,
                showMessageSender = showMessageSender,
            ),
        )
    }

    override suspend fun toggleSupergroupUsernameIsActive(
        supergroupId: Long,
        username: String,
        isActive: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = ToggleSupergroupUsernameIsActive(
                supergroupId = supergroupId,
                username = username,
                isActive = isActive,
            ),
        )
    }

    override suspend fun toggleUsernameIsActive(username: String, isActive: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ToggleUsernameIsActive(
                username = username,
                isActive = isActive,
            ),
        )
    }

    override suspend fun toggleVideoChatEnabledStartNotification(groupCallId: Int, enabledStartNotification: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ToggleVideoChatEnabledStartNotification(
                groupCallId = groupCallId,
                enabledStartNotification = enabledStartNotification,
            ),
        )
    }

    override suspend fun toggleVideoChatMuteNewParticipants(groupCallId: Int, muteNewParticipants: Boolean): TdlResult<Ok> {
        return repository.send(
            function = ToggleVideoChatMuteNewParticipants(
                groupCallId = groupCallId,
                muteNewParticipants = muteNewParticipants,
            ),
        )
    }

    override suspend fun transferBusinessAccountStars(businessConnectionId: String, starCount: Long): TdlResult<Ok> {
        return repository.send(
            function = TransferBusinessAccountStars(
                businessConnectionId = businessConnectionId,
                starCount = starCount,
            ),
        )
    }

    override suspend fun transferChatOwnership(
        chatId: Long,
        userId: Long,
        password: String,
    ): TdlResult<Ok> {
        return repository.send(
            function = TransferChatOwnership(
                chatId = chatId,
                userId = userId,
                password = password,
            ),
        )
    }

    override suspend fun transferGift(
        businessConnectionId: String,
        receivedGiftId: String,
        newOwnerId: MessageSender,
        starCount: Long,
    ): TdlResult<Ok> {
        return repository.send(
            function = TransferGift(
                businessConnectionId = businessConnectionId,
                receivedGiftId = receivedGiftId,
                newOwnerId = newOwnerId,
                starCount = starCount,
            ),
        )
    }

    override suspend fun translateMessageText(
        chatId: Long,
        messageId: Long,
        toLanguageCode: String,
    ): TdlResult<FormattedText> {
        return repository.send(
            function = TranslateMessageText(
                chatId = chatId,
                messageId = messageId,
                toLanguageCode = toLanguageCode,
            ),
        )
    }

    override suspend fun translateText(text: FormattedText, toLanguageCode: String): TdlResult<FormattedText> {
        return repository.send(
            function = TranslateText(
                text = text,
                toLanguageCode = toLanguageCode,
            ),
        )
    }

    override suspend fun unpinAllChatMessages(chatId: Long): TdlResult<Ok> {
        return repository.send(
            function = UnpinAllChatMessages(
                chatId = chatId,
            ),
        )
    }

    override suspend fun unpinAllDirectMessagesChatTopicMessages(chatId: Long, topicId: Long): TdlResult<Ok> {
        return repository.send(
            function = UnpinAllDirectMessagesChatTopicMessages(
                chatId = chatId,
                topicId = topicId,
            ),
        )
    }

    override suspend fun unpinAllMessageThreadMessages(chatId: Long, messageThreadId: Long): TdlResult<Ok> {
        return repository.send(
            function = UnpinAllMessageThreadMessages(
                chatId = chatId,
                messageThreadId = messageThreadId,
            ),
        )
    }

    override suspend fun unpinChatMessage(chatId: Long, messageId: Long): TdlResult<Ok> {
        return repository.send(
            function = UnpinChatMessage(
                chatId = chatId,
                messageId = messageId,
            ),
        )
    }

    override suspend fun upgradeBasicGroupChatToSupergroupChat(chatId: Long): TdlResult<Chat> {
        return repository.send(
            function = UpgradeBasicGroupChatToSupergroupChat(
                chatId = chatId,
            ),
        )
    }

    override suspend fun upgradeGift(
        businessConnectionId: String,
        receivedGiftId: String,
        keepOriginalDetails: Boolean,
        starCount: Long,
    ): TdlResult<UpgradeGiftResult> {
        return repository.send(
            function = UpgradeGift(
                businessConnectionId = businessConnectionId,
                receivedGiftId = receivedGiftId,
                keepOriginalDetails = keepOriginalDetails,
                starCount = starCount,
            ),
        )
    }

    override suspend fun uploadStickerFile(
        userId: Long,
        stickerFormat: StickerFormat,
        sticker: InputFile,
    ): TdlResult<File> {
        return repository.send(
            function = UploadStickerFile(
                userId = userId,
                stickerFormat = stickerFormat,
                sticker = sticker,
            ),
        )
    }

    override suspend fun validateOrderInfo(
        inputInvoice: InputInvoice,
        orderInfo: OrderInfo?,
        allowSave: Boolean,
    ): TdlResult<ValidatedOrderInfo> {
        return repository.send(
            function = ValidateOrderInfo(
                inputInvoice = inputInvoice,
                orderInfo = orderInfo,
                allowSave = allowSave,
            ),
        )
    }

    override suspend fun viewMessages(
        chatId: Long,
        messageIds: LongArray,
        source: MessageSource?,
        forceRead: Boolean,
    ): TdlResult<Ok> {
        return repository.send(
            function = ViewMessages(
                chatId = chatId,
                messageIds = messageIds,
                source = source,
                forceRead = forceRead,
            ),
        )
    }

    override suspend fun viewPremiumFeature(feature: PremiumFeature): TdlResult<Ok> {
        return repository.send(
            function = ViewPremiumFeature(
                feature = feature,
            ),
        )
    }

    override suspend fun viewSponsoredChat(sponsoredChatUniqueId: Long): TdlResult<Ok> {
        return repository.send(
            function = ViewSponsoredChat(
                sponsoredChatUniqueId = sponsoredChatUniqueId,
            ),
        )
    }

    override suspend fun viewTrendingStickerSets(stickerSetIds: LongArray): TdlResult<Ok> {
        return repository.send(
            function = ViewTrendingStickerSets(
                stickerSetIds = stickerSetIds,
            ),
        )
    }

    override suspend fun writeGeneratedFilePart(
        generationId: Long,
        offset: Long,
        data: ByteArray,
    ): TdlResult<Ok> {
        return repository.send(
            function = WriteGeneratedFilePart(
                generationId = generationId,
                offset = offset,
                data = data,
            ),
        )
    }
}
