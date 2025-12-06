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
import dev.g000sha256.tdl.dto.Audios
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
import dev.g000sha256.tdl.dto.CanSendGiftResult
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
import dev.g000sha256.tdl.dto.FoundPublicPosts
import dev.g000sha256.tdl.dto.FoundStories
import dev.g000sha256.tdl.dto.FoundUsers
import dev.g000sha256.tdl.dto.FoundWebApp
import dev.g000sha256.tdl.dto.GameHighScores
import dev.g000sha256.tdl.dto.GiftAuctionAcquiredGifts
import dev.g000sha256.tdl.dto.GiftAuctionState
import dev.g000sha256.tdl.dto.GiftChatThemes
import dev.g000sha256.tdl.dto.GiftCollection
import dev.g000sha256.tdl.dto.GiftCollections
import dev.g000sha256.tdl.dto.GiftForResaleOrder
import dev.g000sha256.tdl.dto.GiftResalePrice
import dev.g000sha256.tdl.dto.GiftResaleResult
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
import dev.g000sha256.tdl.dto.GroupCallParticipant
import dev.g000sha256.tdl.dto.GroupCallParticipants
import dev.g000sha256.tdl.dto.GroupCallStreams
import dev.g000sha256.tdl.dto.GroupCallVideoQuality
import dev.g000sha256.tdl.dto.Hashtags
import dev.g000sha256.tdl.dto.HttpUrl
import dev.g000sha256.tdl.dto.ImportedContact
import dev.g000sha256.tdl.dto.ImportedContacts
import dev.g000sha256.tdl.dto.InlineQueryResults
import dev.g000sha256.tdl.dto.InlineQueryResultsButton
import dev.g000sha256.tdl.dto.InputBackground
import dev.g000sha256.tdl.dto.InputBusinessChatLink
import dev.g000sha256.tdl.dto.InputBusinessStartPage
import dev.g000sha256.tdl.dto.InputChatPhoto
import dev.g000sha256.tdl.dto.InputChatTheme
import dev.g000sha256.tdl.dto.InputChecklist
import dev.g000sha256.tdl.dto.InputChecklistTask
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
import dev.g000sha256.tdl.dto.LiveStoryDonors
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
import dev.g000sha256.tdl.dto.ProfileTab
import dev.g000sha256.tdl.dto.Proxies
import dev.g000sha256.tdl.dto.Proxy
import dev.g000sha256.tdl.dto.ProxyType
import dev.g000sha256.tdl.dto.PublicChatType
import dev.g000sha256.tdl.dto.PublicForwards
import dev.g000sha256.tdl.dto.PublicPostSearchLimits
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
import dev.g000sha256.tdl.dto.StarTransactions
import dev.g000sha256.tdl.dto.StartLiveStoryResult
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
import dev.g000sha256.tdl.dto.StoryAlbum
import dev.g000sha256.tdl.dto.StoryAlbums
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
import dev.g000sha256.tdl.dto.TonRevenueStatistics
import dev.g000sha256.tdl.dto.TonTransactions
import dev.g000sha256.tdl.dto.TopChatCategory
import dev.g000sha256.tdl.dto.TransactionDirection
import dev.g000sha256.tdl.dto.TrendingStickerSets
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
import dev.g000sha256.tdl.dto.UpdateNewInlineCallbackQuery
import dev.g000sha256.tdl.dto.UpdateNewInlineQuery
import dev.g000sha256.tdl.dto.UpdateNewMessage
import dev.g000sha256.tdl.dto.UpdateNewPreCheckoutQuery
import dev.g000sha256.tdl.dto.UpdateNewShippingQuery
import dev.g000sha256.tdl.dto.UpdateNotification
import dev.g000sha256.tdl.dto.UpdateNotificationGroup
import dev.g000sha256.tdl.dto.UpdateOption
import dev.g000sha256.tdl.dto.UpdateOwnedStarCount
import dev.g000sha256.tdl.dto.UpdateOwnedTonCount
import dev.g000sha256.tdl.dto.UpdatePaidMediaPurchased
import dev.g000sha256.tdl.dto.UpdatePendingTextMessage
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
import dev.g000sha256.tdl.dto.UpdateTonRevenueStatus
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
import dev.g000sha256.tdl.dto.UpdateVideoPublished
import dev.g000sha256.tdl.dto.UpdateWebAppMessageSent
import dev.g000sha256.tdl.dto.Updates
import dev.g000sha256.tdl.dto.UpgradeGiftResult
import dev.g000sha256.tdl.dto.UpgradedGift
import dev.g000sha256.tdl.dto.UpgradedGiftAttributeId
import dev.g000sha256.tdl.dto.UpgradedGiftValueInfo
import dev.g000sha256.tdl.dto.User
import dev.g000sha256.tdl.dto.UserFullInfo
import dev.g000sha256.tdl.dto.UserLink
import dev.g000sha256.tdl.dto.UserPrivacySetting
import dev.g000sha256.tdl.dto.UserPrivacySettingRules
import dev.g000sha256.tdl.dto.UserSupportInfo
import dev.g000sha256.tdl.dto.Users
import dev.g000sha256.tdl.dto.ValidatedOrderInfo
import dev.g000sha256.tdl.dto.VideoMessageAdvertisements
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
import dev.g000sha256.tdl.function.AddChecklistTasks
import dev.g000sha256.tdl.function.AddContact
import dev.g000sha256.tdl.function.AddCustomServerLanguagePack
import dev.g000sha256.tdl.function.AddFavoriteSticker
import dev.g000sha256.tdl.function.AddFileToDownloads
import dev.g000sha256.tdl.function.AddGiftCollectionGifts
import dev.g000sha256.tdl.function.AddLocalMessage
import dev.g000sha256.tdl.function.AddLogMessage
import dev.g000sha256.tdl.function.AddMessageReaction
import dev.g000sha256.tdl.function.AddNetworkStatistics
import dev.g000sha256.tdl.function.AddOffer
import dev.g000sha256.tdl.function.AddPendingLiveStoryReaction
import dev.g000sha256.tdl.function.AddPendingPaidMessageReaction
import dev.g000sha256.tdl.function.AddProfileAudio
import dev.g000sha256.tdl.function.AddProxy
import dev.g000sha256.tdl.function.AddQuickReplyShortcutInlineQueryResultMessage
import dev.g000sha256.tdl.function.AddQuickReplyShortcutMessage
import dev.g000sha256.tdl.function.AddQuickReplyShortcutMessageAlbum
import dev.g000sha256.tdl.function.AddRecentSticker
import dev.g000sha256.tdl.function.AddRecentlyFoundChat
import dev.g000sha256.tdl.function.AddSavedAnimation
import dev.g000sha256.tdl.function.AddSavedNotificationSound
import dev.g000sha256.tdl.function.AddStickerToSet
import dev.g000sha256.tdl.function.AddStoryAlbumStories
import dev.g000sha256.tdl.function.AllowBotToSendMessages
import dev.g000sha256.tdl.function.AllowUnpaidMessagesFromUser
import dev.g000sha256.tdl.function.AnswerCallbackQuery
import dev.g000sha256.tdl.function.AnswerCustomQuery
import dev.g000sha256.tdl.function.AnswerInlineQuery
import dev.g000sha256.tdl.function.AnswerPreCheckoutQuery
import dev.g000sha256.tdl.function.AnswerShippingQuery
import dev.g000sha256.tdl.function.AnswerWebAppQuery
import dev.g000sha256.tdl.function.ApplyPremiumGiftCode
import dev.g000sha256.tdl.function.ApproveSuggestedPost
import dev.g000sha256.tdl.function.AssignStoreTransaction
import dev.g000sha256.tdl.function.BanChatMember
import dev.g000sha256.tdl.function.BanGroupCallParticipants
import dev.g000sha256.tdl.function.BlockMessageSenderFromReplies
import dev.g000sha256.tdl.function.BoostChat
import dev.g000sha256.tdl.function.BuyGiftUpgrade
import dev.g000sha256.tdl.function.CanBotSendMessages
import dev.g000sha256.tdl.function.CanPostStory
import dev.g000sha256.tdl.function.CanPurchaseFromStore
import dev.g000sha256.tdl.function.CanSendGift
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
import dev.g000sha256.tdl.function.ClickVideoMessageAdvertisement
import dev.g000sha256.tdl.function.Close
import dev.g000sha256.tdl.function.CloseChat
import dev.g000sha256.tdl.function.CloseGiftAuction
import dev.g000sha256.tdl.function.CloseSecretChat
import dev.g000sha256.tdl.function.CloseStory
import dev.g000sha256.tdl.function.CloseWebApp
import dev.g000sha256.tdl.function.CommitPendingLiveStoryReactions
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
import dev.g000sha256.tdl.function.CreateGiftCollection
import dev.g000sha256.tdl.function.CreateGroupCall
import dev.g000sha256.tdl.function.CreateInvoiceLink
import dev.g000sha256.tdl.function.CreateNewBasicGroupChat
import dev.g000sha256.tdl.function.CreateNewSecretChat
import dev.g000sha256.tdl.function.CreateNewStickerSet
import dev.g000sha256.tdl.function.CreateNewSupergroupChat
import dev.g000sha256.tdl.function.CreatePrivateChat
import dev.g000sha256.tdl.function.CreateSecretChat
import dev.g000sha256.tdl.function.CreateStoryAlbum
import dev.g000sha256.tdl.function.CreateSupergroupChat
import dev.g000sha256.tdl.function.CreateTemporaryPassword
import dev.g000sha256.tdl.function.CreateVideoChat
import dev.g000sha256.tdl.function.DeclineGroupCallInvitation
import dev.g000sha256.tdl.function.DeclineSuggestedPost
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
import dev.g000sha256.tdl.function.DeleteGiftCollection
import dev.g000sha256.tdl.function.DeleteGroupCallMessages
import dev.g000sha256.tdl.function.DeleteGroupCallMessagesBySender
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
import dev.g000sha256.tdl.function.DeleteStoryAlbum
import dev.g000sha256.tdl.function.Destroy
import dev.g000sha256.tdl.function.DisableAllSupergroupUsernames
import dev.g000sha256.tdl.function.DisableProxy
import dev.g000sha256.tdl.function.DiscardCall
import dev.g000sha256.tdl.function.DisconnectAffiliateProgram
import dev.g000sha256.tdl.function.DisconnectAllWebsites
import dev.g000sha256.tdl.function.DisconnectWebsite
import dev.g000sha256.tdl.function.DownloadFile
import dev.g000sha256.tdl.function.DropGiftOriginalDetails
import dev.g000sha256.tdl.function.EditBotMediaPreview
import dev.g000sha256.tdl.function.EditBusinessChatLink
import dev.g000sha256.tdl.function.EditBusinessMessageCaption
import dev.g000sha256.tdl.function.EditBusinessMessageChecklist
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
import dev.g000sha256.tdl.function.EditMessageChecklist
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
import dev.g000sha256.tdl.function.GetChatStoryAlbums
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
import dev.g000sha256.tdl.function.GetDirectMessagesChatTopicRevenue
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
import dev.g000sha256.tdl.function.GetForumTopicHistory
import dev.g000sha256.tdl.function.GetForumTopicLink
import dev.g000sha256.tdl.function.GetForumTopics
import dev.g000sha256.tdl.function.GetGameHighScores
import dev.g000sha256.tdl.function.GetGiftAuctionAcquiredGifts
import dev.g000sha256.tdl.function.GetGiftAuctionState
import dev.g000sha256.tdl.function.GetGiftChatThemes
import dev.g000sha256.tdl.function.GetGiftCollections
import dev.g000sha256.tdl.function.GetGiftUpgradePreview
import dev.g000sha256.tdl.function.GetGiveawayInfo
import dev.g000sha256.tdl.function.GetGreetingStickers
import dev.g000sha256.tdl.function.GetGrossingWebAppBots
import dev.g000sha256.tdl.function.GetGroupCall
import dev.g000sha256.tdl.function.GetGroupCallParticipants
import dev.g000sha256.tdl.function.GetGroupCallStreamSegment
import dev.g000sha256.tdl.function.GetGroupCallStreams
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
import dev.g000sha256.tdl.function.GetLiveStoryAvailableMessageSenders
import dev.g000sha256.tdl.function.GetLiveStoryRtmpUrl
import dev.g000sha256.tdl.function.GetLiveStoryStreamer
import dev.g000sha256.tdl.function.GetLiveStoryTopDonors
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
import dev.g000sha256.tdl.function.GetPublicPostSearchLimits
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
import dev.g000sha256.tdl.function.GetStoryAlbumStories
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
import dev.g000sha256.tdl.function.GetTonRevenueStatistics
import dev.g000sha256.tdl.function.GetTonTransactions
import dev.g000sha256.tdl.function.GetTonWithdrawalUrl
import dev.g000sha256.tdl.function.GetTopChats
import dev.g000sha256.tdl.function.GetTrendingStickerSets
import dev.g000sha256.tdl.function.GetUpgradedGift
import dev.g000sha256.tdl.function.GetUpgradedGiftEmojiStatuses
import dev.g000sha256.tdl.function.GetUpgradedGiftValueInfo
import dev.g000sha256.tdl.function.GetUpgradedGiftWithdrawalUrl
import dev.g000sha256.tdl.function.GetUser
import dev.g000sha256.tdl.function.GetUserChatBoosts
import dev.g000sha256.tdl.function.GetUserFullInfo
import dev.g000sha256.tdl.function.GetUserLink
import dev.g000sha256.tdl.function.GetUserPrivacySettingRules
import dev.g000sha256.tdl.function.GetUserProfileAudios
import dev.g000sha256.tdl.function.GetUserProfilePhotos
import dev.g000sha256.tdl.function.GetUserSupportInfo
import dev.g000sha256.tdl.function.GetVideoChatAvailableParticipants
import dev.g000sha256.tdl.function.GetVideoChatInviteLink
import dev.g000sha256.tdl.function.GetVideoChatRtmpUrl
import dev.g000sha256.tdl.function.GetVideoMessageAdvertisements
import dev.g000sha256.tdl.function.GetWebAppLinkUrl
import dev.g000sha256.tdl.function.GetWebAppPlaceholder
import dev.g000sha256.tdl.function.GetWebAppUrl
import dev.g000sha256.tdl.function.GetWebPageInstantView
import dev.g000sha256.tdl.function.GiftPremiumWithStars
import dev.g000sha256.tdl.function.HideContactCloseBirthdays
import dev.g000sha256.tdl.function.HideSuggestedAction
import dev.g000sha256.tdl.function.ImportContacts
import dev.g000sha256.tdl.function.ImportMessages
import dev.g000sha256.tdl.function.IncreaseGiftAuctionBid
import dev.g000sha256.tdl.function.InviteGroupCallParticipant
import dev.g000sha256.tdl.function.InviteVideoChatParticipants
import dev.g000sha256.tdl.function.IsLoginEmailAddressRequired
import dev.g000sha256.tdl.function.IsProfileAudio
import dev.g000sha256.tdl.function.JoinChat
import dev.g000sha256.tdl.function.JoinChatByInviteLink
import dev.g000sha256.tdl.function.JoinGroupCall
import dev.g000sha256.tdl.function.JoinLiveStory
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
import dev.g000sha256.tdl.function.MarkChecklistTasksAsDone
import dev.g000sha256.tdl.function.OpenBotSimilarBot
import dev.g000sha256.tdl.function.OpenChat
import dev.g000sha256.tdl.function.OpenChatSimilarChat
import dev.g000sha256.tdl.function.OpenGiftAuction
import dev.g000sha256.tdl.function.OpenMessageContent
import dev.g000sha256.tdl.function.OpenSponsoredChat
import dev.g000sha256.tdl.function.OpenStory
import dev.g000sha256.tdl.function.OpenWebApp
import dev.g000sha256.tdl.function.OptimizeStorage
import dev.g000sha256.tdl.function.ParseMarkdown
import dev.g000sha256.tdl.function.ParseTextEntities
import dev.g000sha256.tdl.function.PinChatMessage
import dev.g000sha256.tdl.function.PingProxy
import dev.g000sha256.tdl.function.PlaceGiftAuctionBid
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
import dev.g000sha256.tdl.function.ReadAllForumTopicMentions
import dev.g000sha256.tdl.function.ReadAllForumTopicReactions
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
import dev.g000sha256.tdl.function.RemoveGiftCollectionGifts
import dev.g000sha256.tdl.function.RemoveInstalledBackground
import dev.g000sha256.tdl.function.RemoveMessageReaction
import dev.g000sha256.tdl.function.RemoveMessageSenderBotVerification
import dev.g000sha256.tdl.function.RemoveNotification
import dev.g000sha256.tdl.function.RemoveNotificationGroup
import dev.g000sha256.tdl.function.RemovePendingLiveStoryReactions
import dev.g000sha256.tdl.function.RemovePendingPaidMessageReactions
import dev.g000sha256.tdl.function.RemoveProfileAudio
import dev.g000sha256.tdl.function.RemoveProxy
import dev.g000sha256.tdl.function.RemoveRecentHashtag
import dev.g000sha256.tdl.function.RemoveRecentSticker
import dev.g000sha256.tdl.function.RemoveRecentlyFoundChat
import dev.g000sha256.tdl.function.RemoveSavedAnimation
import dev.g000sha256.tdl.function.RemoveSavedNotificationSound
import dev.g000sha256.tdl.function.RemoveSearchedForTag
import dev.g000sha256.tdl.function.RemoveStickerFromSet
import dev.g000sha256.tdl.function.RemoveStoryAlbumStories
import dev.g000sha256.tdl.function.RemoveTopChat
import dev.g000sha256.tdl.function.ReorderActiveUsernames
import dev.g000sha256.tdl.function.ReorderBotActiveUsernames
import dev.g000sha256.tdl.function.ReorderBotMediaPreviews
import dev.g000sha256.tdl.function.ReorderChatFolders
import dev.g000sha256.tdl.function.ReorderGiftCollectionGifts
import dev.g000sha256.tdl.function.ReorderGiftCollections
import dev.g000sha256.tdl.function.ReorderInstalledStickerSets
import dev.g000sha256.tdl.function.ReorderQuickReplyShortcuts
import dev.g000sha256.tdl.function.ReorderStoryAlbumStories
import dev.g000sha256.tdl.function.ReorderStoryAlbums
import dev.g000sha256.tdl.function.ReorderSupergroupActiveUsernames
import dev.g000sha256.tdl.function.ReplaceLiveStoryRtmpUrl
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
import dev.g000sha256.tdl.function.ReportVideoMessageAdvertisement
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
import dev.g000sha256.tdl.function.SearchPublicPosts
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
import dev.g000sha256.tdl.function.SendGroupCallMessage
import dev.g000sha256.tdl.function.SendInlineQueryResultMessage
import dev.g000sha256.tdl.function.SendMessage
import dev.g000sha256.tdl.function.SendMessageAlbum
import dev.g000sha256.tdl.function.SendPassportAuthorizationForm
import dev.g000sha256.tdl.function.SendPaymentForm
import dev.g000sha256.tdl.function.SendPhoneNumberCode
import dev.g000sha256.tdl.function.SendPhoneNumberFirebaseSms
import dev.g000sha256.tdl.function.SendQuickReplyShortcutMessages
import dev.g000sha256.tdl.function.SendResoldGift
import dev.g000sha256.tdl.function.SendTextMessageDraft
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
import dev.g000sha256.tdl.function.SetDirectMessagesChatTopicIsMarkedAsUnread
import dev.g000sha256.tdl.function.SetEmojiStatus
import dev.g000sha256.tdl.function.SetFileGenerationProgress
import dev.g000sha256.tdl.function.SetForumTopicNotificationSettings
import dev.g000sha256.tdl.function.SetGameScore
import dev.g000sha256.tdl.function.SetGiftCollectionName
import dev.g000sha256.tdl.function.SetGiftResalePrice
import dev.g000sha256.tdl.function.SetGiftSettings
import dev.g000sha256.tdl.function.SetGroupCallPaidMessageStarCount
import dev.g000sha256.tdl.function.SetGroupCallParticipantIsSpeaking
import dev.g000sha256.tdl.function.SetGroupCallParticipantVolumeLevel
import dev.g000sha256.tdl.function.SetInactiveSessionTtl
import dev.g000sha256.tdl.function.SetInlineGameScore
import dev.g000sha256.tdl.function.SetLiveStoryMessageSender
import dev.g000sha256.tdl.function.SetLogStream
import dev.g000sha256.tdl.function.SetLogTagVerbosityLevel
import dev.g000sha256.tdl.function.SetLogVerbosityLevel
import dev.g000sha256.tdl.function.SetLoginEmailAddress
import dev.g000sha256.tdl.function.SetMainProfileTab
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
import dev.g000sha256.tdl.function.SetProfileAudioPosition
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
import dev.g000sha256.tdl.function.SetStoryAlbumName
import dev.g000sha256.tdl.function.SetStoryPrivacySettings
import dev.g000sha256.tdl.function.SetStoryReaction
import dev.g000sha256.tdl.function.SetSupergroupCustomEmojiStickerSet
import dev.g000sha256.tdl.function.SetSupergroupMainProfileTab
import dev.g000sha256.tdl.function.SetSupergroupStickerSet
import dev.g000sha256.tdl.function.SetSupergroupUnrestrictBoostCount
import dev.g000sha256.tdl.function.SetSupergroupUsername
import dev.g000sha256.tdl.function.SetTdlibParameters
import dev.g000sha256.tdl.function.SetUpgradedGiftColors
import dev.g000sha256.tdl.function.SetUserEmojiStatus
import dev.g000sha256.tdl.function.SetUserNote
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
import dev.g000sha256.tdl.function.StartLiveStory
import dev.g000sha256.tdl.function.StartScheduledVideoChat
import dev.g000sha256.tdl.function.StopBusinessPoll
import dev.g000sha256.tdl.function.StopPoll
import dev.g000sha256.tdl.function.SuggestUserBirthdate
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
import dev.g000sha256.tdl.function.ToggleDirectMessagesChatTopicCanSendUnpaidMessages
import dev.g000sha256.tdl.function.ToggleDownloadIsPaused
import dev.g000sha256.tdl.function.ToggleForumTopicIsClosed
import dev.g000sha256.tdl.function.ToggleForumTopicIsPinned
import dev.g000sha256.tdl.function.ToggleGeneralForumTopicIsHidden
import dev.g000sha256.tdl.function.ToggleGiftIsSaved
import dev.g000sha256.tdl.function.ToggleGroupCallAreMessagesAllowed
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
import dev.g000sha256.tdl.function.UnpinAllForumTopicMessages
import dev.g000sha256.tdl.function.UnpinChatMessage
import dev.g000sha256.tdl.function.UpgradeBasicGroupChatToSupergroupChat
import dev.g000sha256.tdl.function.UpgradeGift
import dev.g000sha256.tdl.function.UploadStickerFile
import dev.g000sha256.tdl.function.ValidateOrderInfo
import dev.g000sha256.tdl.function.ViewMessages
import dev.g000sha256.tdl.function.ViewPremiumFeature
import dev.g000sha256.tdl.function.ViewSponsoredChat
import dev.g000sha256.tdl.function.ViewTrendingStickerSets
import dev.g000sha256.tdl.function.ViewVideoMessageAdvertisement
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

internal class TdlClientImpl internal constructor(
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

    override val messageSuggestedPostInfoUpdates: Flow<UpdateMessageSuggestedPostInfo>
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

    override val pendingTextMessageUpdates: Flow<UpdatePendingTextMessage>
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

    override val newGroupCallMessageUpdates: Flow<UpdateNewGroupCallMessage>
        get() = repository.updates.filterIsInstance()

    override val newGroupCallPaidReactionUpdates: Flow<UpdateNewGroupCallPaidReaction>
        get() = repository.updates.filterIsInstance()

    override val groupCallMessageSendFailedUpdates: Flow<UpdateGroupCallMessageSendFailed>
        get() = repository.updates.filterIsInstance()

    override val groupCallMessagesDeletedUpdates: Flow<UpdateGroupCallMessagesDeleted>
        get() = repository.updates.filterIsInstance()

    override val liveStoryTopDonorsUpdates: Flow<UpdateLiveStoryTopDonors>
        get() = repository.updates.filterIsInstance()

    override val newCallSignalingDataUpdates: Flow<UpdateNewCallSignalingData>
        get() = repository.updates.filterIsInstance()

    override val giftAuctionStateUpdates: Flow<UpdateGiftAuctionState>
        get() = repository.updates.filterIsInstance()

    override val activeGiftAuctionsUpdates: Flow<UpdateActiveGiftAuctions>
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

    override val trustedMiniAppBotsUpdates: Flow<UpdateTrustedMiniAppBots>
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

    override val emojiChatThemesUpdates: Flow<UpdateEmojiChatThemes>
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

    override val ageVerificationParametersUpdates: Flow<UpdateAgeVerificationParameters>
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

    override val ownedTonCountUpdates: Flow<UpdateOwnedTonCount>
        get() = repository.updates.filterIsInstance()

    override val chatRevenueAmountUpdates: Flow<UpdateChatRevenueAmount>
        get() = repository.updates.filterIsInstance()

    override val starRevenueStatusUpdates: Flow<UpdateStarRevenueStatus>
        get() = repository.updates.filterIsInstance()

    override val tonRevenueStatusUpdates: Flow<UpdateTonRevenueStatus>
        get() = repository.updates.filterIsInstance()

    override val speechRecognitionTrialUpdates: Flow<UpdateSpeechRecognitionTrial>
        get() = repository.updates.filterIsInstance()

    override val groupCallMessageLevelsUpdates: Flow<UpdateGroupCallMessageLevels>
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
        val function = AcceptCall(
            callId = callId,
            protocol = protocol,
        )
        return repository.send(function = function)
    }

    override suspend fun acceptTermsOfService(termsOfServiceId: String): TdlResult<Ok> {
        val function = AcceptTermsOfService(
            termsOfServiceId = termsOfServiceId,
        )
        return repository.send(function = function)
    }

    override suspend fun activateStoryStealthMode(): TdlResult<Ok> {
        val function = ActivateStoryStealthMode()
        return repository.send(function = function)
    }

    override suspend fun addBotMediaPreview(
        botUserId: Long,
        languageCode: String,
        content: InputStoryContent,
    ): TdlResult<BotMediaPreview> {
        val function = AddBotMediaPreview(
            botUserId = botUserId,
            languageCode = languageCode,
            content = content,
        )
        return repository.send(function = function)
    }

    override suspend fun addChatFolderByInviteLink(inviteLink: String, chatIds: LongArray): TdlResult<Ok> {
        val function = AddChatFolderByInviteLink(
            inviteLink = inviteLink,
            chatIds = chatIds,
        )
        return repository.send(function = function)
    }

    override suspend fun addChatMember(
        chatId: Long,
        userId: Long,
        forwardLimit: Int,
    ): TdlResult<FailedToAddMembers> {
        val function = AddChatMember(
            chatId = chatId,
            userId = userId,
            forwardLimit = forwardLimit,
        )
        return repository.send(function = function)
    }

    override suspend fun addChatMembers(chatId: Long, userIds: LongArray): TdlResult<FailedToAddMembers> {
        val function = AddChatMembers(
            chatId = chatId,
            userIds = userIds,
        )
        return repository.send(function = function)
    }

    override suspend fun addChatToList(chatId: Long, chatList: ChatList): TdlResult<Ok> {
        val function = AddChatToList(
            chatId = chatId,
            chatList = chatList,
        )
        return repository.send(function = function)
    }

    override suspend fun addChecklistTasks(
        chatId: Long,
        messageId: Long,
        tasks: Array<InputChecklistTask>,
    ): TdlResult<Ok> {
        val function = AddChecklistTasks(
            chatId = chatId,
            messageId = messageId,
            tasks = tasks,
        )
        return repository.send(function = function)
    }

    override suspend fun addContact(
        userId: Long,
        contact: ImportedContact,
        sharePhoneNumber: Boolean,
    ): TdlResult<Ok> {
        val function = AddContact(
            userId = userId,
            contact = contact,
            sharePhoneNumber = sharePhoneNumber,
        )
        return repository.send(function = function)
    }

    override suspend fun addCustomServerLanguagePack(languagePackId: String): TdlResult<Ok> {
        val function = AddCustomServerLanguagePack(
            languagePackId = languagePackId,
        )
        return repository.send(function = function)
    }

    override suspend fun addFavoriteSticker(sticker: InputFile): TdlResult<Ok> {
        val function = AddFavoriteSticker(
            sticker = sticker,
        )
        return repository.send(function = function)
    }

    override suspend fun addFileToDownloads(
        fileId: Int,
        chatId: Long,
        messageId: Long,
        priority: Int,
    ): TdlResult<File> {
        val function = AddFileToDownloads(
            fileId = fileId,
            chatId = chatId,
            messageId = messageId,
            priority = priority,
        )
        return repository.send(function = function)
    }

    override suspend fun addGiftCollectionGifts(
        ownerId: MessageSender,
        collectionId: Int,
        receivedGiftIds: Array<String>,
    ): TdlResult<GiftCollection> {
        val function = AddGiftCollectionGifts(
            ownerId = ownerId,
            collectionId = collectionId,
            receivedGiftIds = receivedGiftIds,
        )
        return repository.send(function = function)
    }

    override suspend fun addLocalMessage(
        chatId: Long,
        senderId: MessageSender,
        replyTo: InputMessageReplyTo?,
        disableNotification: Boolean,
        inputMessageContent: InputMessageContent,
    ): TdlResult<Message> {
        val function = AddLocalMessage(
            chatId = chatId,
            senderId = senderId,
            replyTo = replyTo,
            disableNotification = disableNotification,
            inputMessageContent = inputMessageContent,
        )
        return repository.send(function = function)
    }

    override suspend fun addLogMessage(verbosityLevel: Int, text: String): TdlResult<Ok> {
        val function = AddLogMessage(
            verbosityLevel = verbosityLevel,
            text = text,
        )
        return repository.send(function = function)
    }

    override suspend fun addMessageReaction(
        chatId: Long,
        messageId: Long,
        reactionType: ReactionType,
        isBig: Boolean,
        updateRecentReactions: Boolean,
    ): TdlResult<Ok> {
        val function = AddMessageReaction(
            chatId = chatId,
            messageId = messageId,
            reactionType = reactionType,
            isBig = isBig,
            updateRecentReactions = updateRecentReactions,
        )
        return repository.send(function = function)
    }

    override suspend fun addNetworkStatistics(entry: NetworkStatisticsEntry): TdlResult<Ok> {
        val function = AddNetworkStatistics(
            entry = entry,
        )
        return repository.send(function = function)
    }

    override suspend fun addOffer(
        chatId: Long,
        messageId: Long,
        options: MessageSendOptions,
    ): TdlResult<Message> {
        val function = AddOffer(
            chatId = chatId,
            messageId = messageId,
            options = options,
        )
        return repository.send(function = function)
    }

    override suspend fun addPendingLiveStoryReaction(groupCallId: Int, starCount: Long): TdlResult<Ok> {
        val function = AddPendingLiveStoryReaction(
            groupCallId = groupCallId,
            starCount = starCount,
        )
        return repository.send(function = function)
    }

    override suspend fun addPendingPaidMessageReaction(
        chatId: Long,
        messageId: Long,
        starCount: Long,
        type: PaidReactionType?,
    ): TdlResult<Ok> {
        val function = AddPendingPaidMessageReaction(
            chatId = chatId,
            messageId = messageId,
            starCount = starCount,
            type = type,
        )
        return repository.send(function = function)
    }

    override suspend fun addProfileAudio(fileId: Int): TdlResult<Ok> {
        val function = AddProfileAudio(
            fileId = fileId,
        )
        return repository.send(function = function)
    }

    override suspend fun addProxy(
        server: String,
        port: Int,
        enable: Boolean,
        type: ProxyType,
    ): TdlResult<Proxy> {
        val function = AddProxy(
            server = server,
            port = port,
            enable = enable,
            type = type,
        )
        return repository.send(function = function)
    }

    override suspend fun addQuickReplyShortcutInlineQueryResultMessage(
        shortcutName: String,
        replyToMessageId: Long,
        queryId: Long,
        resultId: String,
        hideViaBot: Boolean,
    ): TdlResult<QuickReplyMessage> {
        val function = AddQuickReplyShortcutInlineQueryResultMessage(
            shortcutName = shortcutName,
            replyToMessageId = replyToMessageId,
            queryId = queryId,
            resultId = resultId,
            hideViaBot = hideViaBot,
        )
        return repository.send(function = function)
    }

    override suspend fun addQuickReplyShortcutMessage(
        shortcutName: String,
        replyToMessageId: Long,
        inputMessageContent: InputMessageContent,
    ): TdlResult<QuickReplyMessage> {
        val function = AddQuickReplyShortcutMessage(
            shortcutName = shortcutName,
            replyToMessageId = replyToMessageId,
            inputMessageContent = inputMessageContent,
        )
        return repository.send(function = function)
    }

    override suspend fun addQuickReplyShortcutMessageAlbum(
        shortcutName: String,
        replyToMessageId: Long,
        inputMessageContents: Array<InputMessageContent>,
    ): TdlResult<QuickReplyMessages> {
        val function = AddQuickReplyShortcutMessageAlbum(
            shortcutName = shortcutName,
            replyToMessageId = replyToMessageId,
            inputMessageContents = inputMessageContents,
        )
        return repository.send(function = function)
    }

    override suspend fun addRecentSticker(isAttached: Boolean, sticker: InputFile): TdlResult<Stickers> {
        val function = AddRecentSticker(
            isAttached = isAttached,
            sticker = sticker,
        )
        return repository.send(function = function)
    }

    override suspend fun addRecentlyFoundChat(chatId: Long): TdlResult<Ok> {
        val function = AddRecentlyFoundChat(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun addSavedAnimation(animation: InputFile): TdlResult<Ok> {
        val function = AddSavedAnimation(
            animation = animation,
        )
        return repository.send(function = function)
    }

    override suspend fun addSavedNotificationSound(sound: InputFile): TdlResult<NotificationSound> {
        val function = AddSavedNotificationSound(
            sound = sound,
        )
        return repository.send(function = function)
    }

    override suspend fun addStickerToSet(
        userId: Long,
        name: String,
        sticker: InputSticker,
    ): TdlResult<Ok> {
        val function = AddStickerToSet(
            userId = userId,
            name = name,
            sticker = sticker,
        )
        return repository.send(function = function)
    }

    override suspend fun addStoryAlbumStories(
        chatId: Long,
        storyAlbumId: Int,
        storyIds: IntArray,
    ): TdlResult<StoryAlbum> {
        val function = AddStoryAlbumStories(
            chatId = chatId,
            storyAlbumId = storyAlbumId,
            storyIds = storyIds,
        )
        return repository.send(function = function)
    }

    override suspend fun allowBotToSendMessages(botUserId: Long): TdlResult<Ok> {
        val function = AllowBotToSendMessages(
            botUserId = botUserId,
        )
        return repository.send(function = function)
    }

    override suspend fun allowUnpaidMessagesFromUser(userId: Long, refundPayments: Boolean): TdlResult<Ok> {
        val function = AllowUnpaidMessagesFromUser(
            userId = userId,
            refundPayments = refundPayments,
        )
        return repository.send(function = function)
    }

    override suspend fun answerCallbackQuery(
        callbackQueryId: Long,
        text: String,
        showAlert: Boolean,
        url: String,
        cacheTime: Int,
    ): TdlResult<Ok> {
        val function = AnswerCallbackQuery(
            callbackQueryId = callbackQueryId,
            text = text,
            showAlert = showAlert,
            url = url,
            cacheTime = cacheTime,
        )
        return repository.send(function = function)
    }

    override suspend fun answerCustomQuery(customQueryId: Long, data: String): TdlResult<Ok> {
        val function = AnswerCustomQuery(
            customQueryId = customQueryId,
            data = data,
        )
        return repository.send(function = function)
    }

    override suspend fun answerInlineQuery(
        inlineQueryId: Long,
        isPersonal: Boolean,
        button: InlineQueryResultsButton?,
        results: Array<InputInlineQueryResult>,
        cacheTime: Int,
        nextOffset: String,
    ): TdlResult<Ok> {
        val function = AnswerInlineQuery(
            inlineQueryId = inlineQueryId,
            isPersonal = isPersonal,
            button = button,
            results = results,
            cacheTime = cacheTime,
            nextOffset = nextOffset,
        )
        return repository.send(function = function)
    }

    override suspend fun answerPreCheckoutQuery(preCheckoutQueryId: Long, errorMessage: String): TdlResult<Ok> {
        val function = AnswerPreCheckoutQuery(
            preCheckoutQueryId = preCheckoutQueryId,
            errorMessage = errorMessage,
        )
        return repository.send(function = function)
    }

    override suspend fun answerShippingQuery(
        shippingQueryId: Long,
        shippingOptions: Array<ShippingOption>,
        errorMessage: String,
    ): TdlResult<Ok> {
        val function = AnswerShippingQuery(
            shippingQueryId = shippingQueryId,
            shippingOptions = shippingOptions,
            errorMessage = errorMessage,
        )
        return repository.send(function = function)
    }

    override suspend fun answerWebAppQuery(webAppQueryId: String, result: InputInlineQueryResult): TdlResult<SentWebAppMessage> {
        val function = AnswerWebAppQuery(
            webAppQueryId = webAppQueryId,
            result = result,
        )
        return repository.send(function = function)
    }

    override suspend fun applyPremiumGiftCode(code: String): TdlResult<Ok> {
        val function = ApplyPremiumGiftCode(
            code = code,
        )
        return repository.send(function = function)
    }

    override suspend fun approveSuggestedPost(
        chatId: Long,
        messageId: Long,
        sendDate: Int,
    ): TdlResult<Ok> {
        val function = ApproveSuggestedPost(
            chatId = chatId,
            messageId = messageId,
            sendDate = sendDate,
        )
        return repository.send(function = function)
    }

    override suspend fun assignStoreTransaction(transaction: StoreTransaction, purpose: StorePaymentPurpose): TdlResult<Ok> {
        val function = AssignStoreTransaction(
            transaction = transaction,
            purpose = purpose,
        )
        return repository.send(function = function)
    }

    override suspend fun banChatMember(
        chatId: Long,
        memberId: MessageSender,
        bannedUntilDate: Int,
        revokeMessages: Boolean,
    ): TdlResult<Ok> {
        val function = BanChatMember(
            chatId = chatId,
            memberId = memberId,
            bannedUntilDate = bannedUntilDate,
            revokeMessages = revokeMessages,
        )
        return repository.send(function = function)
    }

    override suspend fun banGroupCallParticipants(groupCallId: Int, userIds: LongArray): TdlResult<Ok> {
        val function = BanGroupCallParticipants(
            groupCallId = groupCallId,
            userIds = userIds,
        )
        return repository.send(function = function)
    }

    override suspend fun blockMessageSenderFromReplies(
        messageId: Long,
        deleteMessage: Boolean,
        deleteAllMessages: Boolean,
        reportSpam: Boolean,
    ): TdlResult<Ok> {
        val function = BlockMessageSenderFromReplies(
            messageId = messageId,
            deleteMessage = deleteMessage,
            deleteAllMessages = deleteAllMessages,
            reportSpam = reportSpam,
        )
        return repository.send(function = function)
    }

    override suspend fun boostChat(chatId: Long, slotIds: IntArray): TdlResult<ChatBoostSlots> {
        val function = BoostChat(
            chatId = chatId,
            slotIds = slotIds,
        )
        return repository.send(function = function)
    }

    override suspend fun buyGiftUpgrade(
        ownerId: MessageSender,
        prepaidUpgradeHash: String,
        starCount: Long,
    ): TdlResult<Ok> {
        val function = BuyGiftUpgrade(
            ownerId = ownerId,
            prepaidUpgradeHash = prepaidUpgradeHash,
            starCount = starCount,
        )
        return repository.send(function = function)
    }

    override suspend fun canBotSendMessages(botUserId: Long): TdlResult<Ok> {
        val function = CanBotSendMessages(
            botUserId = botUserId,
        )
        return repository.send(function = function)
    }

    override suspend fun canPostStory(chatId: Long): TdlResult<CanPostStoryResult> {
        val function = CanPostStory(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun canPurchaseFromStore(purpose: StorePaymentPurpose): TdlResult<Ok> {
        val function = CanPurchaseFromStore(
            purpose = purpose,
        )
        return repository.send(function = function)
    }

    override suspend fun canSendGift(giftId: Long): TdlResult<CanSendGiftResult> {
        val function = CanSendGift(
            giftId = giftId,
        )
        return repository.send(function = function)
    }

    override suspend fun canSendMessageToUser(userId: Long, onlyLocal: Boolean): TdlResult<CanSendMessageToUserResult> {
        val function = CanSendMessageToUser(
            userId = userId,
            onlyLocal = onlyLocal,
        )
        return repository.send(function = function)
    }

    override suspend fun canTransferOwnership(): TdlResult<CanTransferOwnershipResult> {
        val function = CanTransferOwnership()
        return repository.send(function = function)
    }

    override suspend fun cancelDownloadFile(fileId: Int, onlyIfPending: Boolean): TdlResult<Ok> {
        val function = CancelDownloadFile(
            fileId = fileId,
            onlyIfPending = onlyIfPending,
        )
        return repository.send(function = function)
    }

    override suspend fun cancelPasswordReset(): TdlResult<Ok> {
        val function = CancelPasswordReset()
        return repository.send(function = function)
    }

    override suspend fun cancelPreliminaryUploadFile(fileId: Int): TdlResult<Ok> {
        val function = CancelPreliminaryUploadFile(
            fileId = fileId,
        )
        return repository.send(function = function)
    }

    override suspend fun cancelRecoveryEmailAddressVerification(): TdlResult<PasswordState> {
        val function = CancelRecoveryEmailAddressVerification()
        return repository.send(function = function)
    }

    override suspend fun changeImportedContacts(contacts: Array<ImportedContact>): TdlResult<ImportedContacts> {
        val function = ChangeImportedContacts(
            contacts = contacts,
        )
        return repository.send(function = function)
    }

    override suspend fun changeStickerSet(
        setId: Long,
        isInstalled: Boolean,
        isArchived: Boolean,
    ): TdlResult<Ok> {
        val function = ChangeStickerSet(
            setId = setId,
            isInstalled = isInstalled,
            isArchived = isArchived,
        )
        return repository.send(function = function)
    }

    override suspend fun checkAuthenticationBotToken(token: String): TdlResult<Ok> {
        val function = CheckAuthenticationBotToken(
            token = token,
        )
        return repository.send(function = function)
    }

    override suspend fun checkAuthenticationCode(code: String): TdlResult<Ok> {
        val function = CheckAuthenticationCode(
            code = code,
        )
        return repository.send(function = function)
    }

    override suspend fun checkAuthenticationEmailCode(code: EmailAddressAuthentication): TdlResult<Ok> {
        val function = CheckAuthenticationEmailCode(
            code = code,
        )
        return repository.send(function = function)
    }

    override suspend fun checkAuthenticationPassword(password: String): TdlResult<Ok> {
        val function = CheckAuthenticationPassword(
            password = password,
        )
        return repository.send(function = function)
    }

    override suspend fun checkAuthenticationPasswordRecoveryCode(recoveryCode: String): TdlResult<Ok> {
        val function = CheckAuthenticationPasswordRecoveryCode(
            recoveryCode = recoveryCode,
        )
        return repository.send(function = function)
    }

    override suspend fun checkAuthenticationPremiumPurchase(currency: String, amount: Long): TdlResult<Ok> {
        val function = CheckAuthenticationPremiumPurchase(
            currency = currency,
            amount = amount,
        )
        return repository.send(function = function)
    }

    override suspend fun checkChatFolderInviteLink(inviteLink: String): TdlResult<ChatFolderInviteLinkInfo> {
        val function = CheckChatFolderInviteLink(
            inviteLink = inviteLink,
        )
        return repository.send(function = function)
    }

    override suspend fun checkChatInviteLink(inviteLink: String): TdlResult<ChatInviteLinkInfo> {
        val function = CheckChatInviteLink(
            inviteLink = inviteLink,
        )
        return repository.send(function = function)
    }

    override suspend fun checkChatUsername(chatId: Long, username: String): TdlResult<CheckChatUsernameResult> {
        val function = CheckChatUsername(
            chatId = chatId,
            username = username,
        )
        return repository.send(function = function)
    }

    override suspend fun checkCreatedPublicChatsLimit(type: PublicChatType): TdlResult<Ok> {
        val function = CheckCreatedPublicChatsLimit(
            type = type,
        )
        return repository.send(function = function)
    }

    override suspend fun checkEmailAddressVerificationCode(code: String): TdlResult<Ok> {
        val function = CheckEmailAddressVerificationCode(
            code = code,
        )
        return repository.send(function = function)
    }

    override suspend fun checkLoginEmailAddressCode(code: EmailAddressAuthentication): TdlResult<Ok> {
        val function = CheckLoginEmailAddressCode(
            code = code,
        )
        return repository.send(function = function)
    }

    override suspend fun checkPasswordRecoveryCode(recoveryCode: String): TdlResult<Ok> {
        val function = CheckPasswordRecoveryCode(
            recoveryCode = recoveryCode,
        )
        return repository.send(function = function)
    }

    override suspend fun checkPhoneNumberCode(code: String): TdlResult<Ok> {
        val function = CheckPhoneNumberCode(
            code = code,
        )
        return repository.send(function = function)
    }

    override suspend fun checkPremiumGiftCode(code: String): TdlResult<PremiumGiftCodeInfo> {
        val function = CheckPremiumGiftCode(
            code = code,
        )
        return repository.send(function = function)
    }

    override suspend fun checkQuickReplyShortcutName(name: String): TdlResult<Ok> {
        val function = CheckQuickReplyShortcutName(
            name = name,
        )
        return repository.send(function = function)
    }

    override suspend fun checkRecoveryEmailAddressCode(code: String): TdlResult<PasswordState> {
        val function = CheckRecoveryEmailAddressCode(
            code = code,
        )
        return repository.send(function = function)
    }

    override suspend fun checkStickerSetName(name: String): TdlResult<CheckStickerSetNameResult> {
        val function = CheckStickerSetName(
            name = name,
        )
        return repository.send(function = function)
    }

    override suspend fun checkWebAppFileDownload(
        botUserId: Long,
        fileName: String,
        url: String,
    ): TdlResult<Ok> {
        val function = CheckWebAppFileDownload(
            botUserId = botUserId,
            fileName = fileName,
            url = url,
        )
        return repository.send(function = function)
    }

    override suspend fun cleanFileName(fileName: String): TdlResult<Text> {
        val function = CleanFileName(
            fileName = fileName,
        )
        return repository.send(function = function)
    }

    override suspend fun clearAllDraftMessages(excludeSecretChats: Boolean): TdlResult<Ok> {
        val function = ClearAllDraftMessages(
            excludeSecretChats = excludeSecretChats,
        )
        return repository.send(function = function)
    }

    override suspend fun clearAutosaveSettingsExceptions(): TdlResult<Ok> {
        val function = ClearAutosaveSettingsExceptions()
        return repository.send(function = function)
    }

    override suspend fun clearImportedContacts(): TdlResult<Ok> {
        val function = ClearImportedContacts()
        return repository.send(function = function)
    }

    override suspend fun clearRecentEmojiStatuses(): TdlResult<Ok> {
        val function = ClearRecentEmojiStatuses()
        return repository.send(function = function)
    }

    override suspend fun clearRecentReactions(): TdlResult<Ok> {
        val function = ClearRecentReactions()
        return repository.send(function = function)
    }

    override suspend fun clearRecentStickers(isAttached: Boolean): TdlResult<Ok> {
        val function = ClearRecentStickers(
            isAttached = isAttached,
        )
        return repository.send(function = function)
    }

    override suspend fun clearRecentlyFoundChats(): TdlResult<Ok> {
        val function = ClearRecentlyFoundChats()
        return repository.send(function = function)
    }

    override suspend fun clearSearchedForTags(clearCashtags: Boolean): TdlResult<Ok> {
        val function = ClearSearchedForTags(
            clearCashtags = clearCashtags,
        )
        return repository.send(function = function)
    }

    override suspend fun clickAnimatedEmojiMessage(chatId: Long, messageId: Long): TdlResult<Sticker> {
        val function = ClickAnimatedEmojiMessage(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function = function)
    }

    override suspend fun clickChatSponsoredMessage(
        chatId: Long,
        messageId: Long,
        isMediaClick: Boolean,
        fromFullscreen: Boolean,
    ): TdlResult<Ok> {
        val function = ClickChatSponsoredMessage(
            chatId = chatId,
            messageId = messageId,
            isMediaClick = isMediaClick,
            fromFullscreen = fromFullscreen,
        )
        return repository.send(function = function)
    }

    override suspend fun clickPremiumSubscriptionButton(): TdlResult<Ok> {
        val function = ClickPremiumSubscriptionButton()
        return repository.send(function = function)
    }

    override suspend fun clickVideoMessageAdvertisement(advertisementUniqueId: Long): TdlResult<Ok> {
        val function = ClickVideoMessageAdvertisement(
            advertisementUniqueId = advertisementUniqueId,
        )
        return repository.send(function = function)
    }

    override suspend fun close(): TdlResult<Ok> {
        val function = Close()
        return repository.send(function = function)
    }

    override suspend fun closeChat(chatId: Long): TdlResult<Ok> {
        val function = CloseChat(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun closeGiftAuction(giftId: Long): TdlResult<Ok> {
        val function = CloseGiftAuction(
            giftId = giftId,
        )
        return repository.send(function = function)
    }

    override suspend fun closeSecretChat(secretChatId: Int): TdlResult<Ok> {
        val function = CloseSecretChat(
            secretChatId = secretChatId,
        )
        return repository.send(function = function)
    }

    override suspend fun closeStory(storyPosterChatId: Long, storyId: Int): TdlResult<Ok> {
        val function = CloseStory(
            storyPosterChatId = storyPosterChatId,
            storyId = storyId,
        )
        return repository.send(function = function)
    }

    override suspend fun closeWebApp(webAppLaunchId: Long): TdlResult<Ok> {
        val function = CloseWebApp(
            webAppLaunchId = webAppLaunchId,
        )
        return repository.send(function = function)
    }

    override suspend fun commitPendingLiveStoryReactions(groupCallId: Int): TdlResult<Ok> {
        val function = CommitPendingLiveStoryReactions(
            groupCallId = groupCallId,
        )
        return repository.send(function = function)
    }

    override suspend fun commitPendingPaidMessageReactions(chatId: Long, messageId: Long): TdlResult<Ok> {
        val function = CommitPendingPaidMessageReactions(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function = function)
    }

    override suspend fun confirmQrCodeAuthentication(link: String): TdlResult<Session> {
        val function = ConfirmQrCodeAuthentication(
            link = link,
        )
        return repository.send(function = function)
    }

    override suspend fun confirmSession(sessionId: Long): TdlResult<Ok> {
        val function = ConfirmSession(
            sessionId = sessionId,
        )
        return repository.send(function = function)
    }

    override suspend fun connectAffiliateProgram(affiliate: AffiliateType, botUserId: Long): TdlResult<ConnectedAffiliateProgram> {
        val function = ConnectAffiliateProgram(
            affiliate = affiliate,
            botUserId = botUserId,
        )
        return repository.send(function = function)
    }

    override suspend fun createBasicGroupChat(basicGroupId: Long, force: Boolean): TdlResult<Chat> {
        val function = CreateBasicGroupChat(
            basicGroupId = basicGroupId,
            force = force,
        )
        return repository.send(function = function)
    }

    override suspend fun createBusinessChatLink(linkInfo: InputBusinessChatLink): TdlResult<BusinessChatLink> {
        val function = CreateBusinessChatLink(
            linkInfo = linkInfo,
        )
        return repository.send(function = function)
    }

    override suspend fun createCall(
        userId: Long,
        protocol: CallProtocol,
        isVideo: Boolean,
    ): TdlResult<CallId> {
        val function = CreateCall(
            userId = userId,
            protocol = protocol,
            isVideo = isVideo,
        )
        return repository.send(function = function)
    }

    override suspend fun createChatFolder(folder: ChatFolder): TdlResult<ChatFolderInfo> {
        val function = CreateChatFolder(
            folder = folder,
        )
        return repository.send(function = function)
    }

    override suspend fun createChatFolderInviteLink(
        chatFolderId: Int,
        name: String,
        chatIds: LongArray,
    ): TdlResult<ChatFolderInviteLink> {
        val function = CreateChatFolderInviteLink(
            chatFolderId = chatFolderId,
            name = name,
            chatIds = chatIds,
        )
        return repository.send(function = function)
    }

    override suspend fun createChatInviteLink(
        chatId: Long,
        name: String,
        expirationDate: Int,
        memberLimit: Int,
        createsJoinRequest: Boolean,
    ): TdlResult<ChatInviteLink> {
        val function = CreateChatInviteLink(
            chatId = chatId,
            name = name,
            expirationDate = expirationDate,
            memberLimit = memberLimit,
            createsJoinRequest = createsJoinRequest,
        )
        return repository.send(function = function)
    }

    override suspend fun createChatSubscriptionInviteLink(
        chatId: Long,
        name: String,
        subscriptionPricing: StarSubscriptionPricing,
    ): TdlResult<ChatInviteLink> {
        val function = CreateChatSubscriptionInviteLink(
            chatId = chatId,
            name = name,
            subscriptionPricing = subscriptionPricing,
        )
        return repository.send(function = function)
    }

    override suspend fun createForumTopic(
        chatId: Long,
        name: String,
        isNameImplicit: Boolean,
        icon: ForumTopicIcon,
    ): TdlResult<ForumTopicInfo> {
        val function = CreateForumTopic(
            chatId = chatId,
            name = name,
            isNameImplicit = isNameImplicit,
            icon = icon,
        )
        return repository.send(function = function)
    }

    override suspend fun createGiftCollection(
        ownerId: MessageSender,
        name: String,
        receivedGiftIds: Array<String>,
    ): TdlResult<GiftCollection> {
        val function = CreateGiftCollection(
            ownerId = ownerId,
            name = name,
            receivedGiftIds = receivedGiftIds,
        )
        return repository.send(function = function)
    }

    override suspend fun createGroupCall(joinParameters: GroupCallJoinParameters?): TdlResult<GroupCallInfo> {
        val function = CreateGroupCall(
            joinParameters = joinParameters,
        )
        return repository.send(function = function)
    }

    override suspend fun createInvoiceLink(businessConnectionId: String, invoice: InputMessageContent): TdlResult<HttpUrl> {
        val function = CreateInvoiceLink(
            businessConnectionId = businessConnectionId,
            invoice = invoice,
        )
        return repository.send(function = function)
    }

    override suspend fun createNewBasicGroupChat(
        userIds: LongArray,
        title: String,
        messageAutoDeleteTime: Int,
    ): TdlResult<CreatedBasicGroupChat> {
        val function = CreateNewBasicGroupChat(
            userIds = userIds,
            title = title,
            messageAutoDeleteTime = messageAutoDeleteTime,
        )
        return repository.send(function = function)
    }

    override suspend fun createNewSecretChat(userId: Long): TdlResult<Chat> {
        val function = CreateNewSecretChat(
            userId = userId,
        )
        return repository.send(function = function)
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
        val function = CreateNewStickerSet(
            userId = userId,
            title = title,
            name = name,
            stickerType = stickerType,
            needsRepainting = needsRepainting,
            stickers = stickers,
            source = source,
        )
        return repository.send(function = function)
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
        val function = CreateNewSupergroupChat(
            title = title,
            isForum = isForum,
            isChannel = isChannel,
            description = description,
            location = location,
            messageAutoDeleteTime = messageAutoDeleteTime,
            forImport = forImport,
        )
        return repository.send(function = function)
    }

    override suspend fun createPrivateChat(userId: Long, force: Boolean): TdlResult<Chat> {
        val function = CreatePrivateChat(
            userId = userId,
            force = force,
        )
        return repository.send(function = function)
    }

    override suspend fun createSecretChat(secretChatId: Int): TdlResult<Chat> {
        val function = CreateSecretChat(
            secretChatId = secretChatId,
        )
        return repository.send(function = function)
    }

    override suspend fun createStoryAlbum(
        storyPosterChatId: Long,
        name: String,
        storyIds: IntArray,
    ): TdlResult<StoryAlbum> {
        val function = CreateStoryAlbum(
            storyPosterChatId = storyPosterChatId,
            name = name,
            storyIds = storyIds,
        )
        return repository.send(function = function)
    }

    override suspend fun createSupergroupChat(supergroupId: Long, force: Boolean): TdlResult<Chat> {
        val function = CreateSupergroupChat(
            supergroupId = supergroupId,
            force = force,
        )
        return repository.send(function = function)
    }

    override suspend fun createTemporaryPassword(password: String, validFor: Int): TdlResult<TemporaryPasswordState> {
        val function = CreateTemporaryPassword(
            password = password,
            validFor = validFor,
        )
        return repository.send(function = function)
    }

    override suspend fun createVideoChat(
        chatId: Long,
        title: String,
        startDate: Int,
        isRtmpStream: Boolean,
    ): TdlResult<GroupCallId> {
        val function = CreateVideoChat(
            chatId = chatId,
            title = title,
            startDate = startDate,
            isRtmpStream = isRtmpStream,
        )
        return repository.send(function = function)
    }

    override suspend fun declineGroupCallInvitation(chatId: Long, messageId: Long): TdlResult<Ok> {
        val function = DeclineGroupCallInvitation(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function = function)
    }

    override suspend fun declineSuggestedPost(
        chatId: Long,
        messageId: Long,
        comment: String,
    ): TdlResult<Ok> {
        val function = DeclineSuggestedPost(
            chatId = chatId,
            messageId = messageId,
            comment = comment,
        )
        return repository.send(function = function)
    }

    override suspend fun decryptGroupCallData(
        groupCallId: Int,
        participantId: MessageSender,
        dataChannel: GroupCallDataChannel?,
        data: ByteArray,
    ): TdlResult<Data> {
        val function = DecryptGroupCallData(
            groupCallId = groupCallId,
            participantId = participantId,
            dataChannel = dataChannel,
            data = data,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteAccount(reason: String, password: String): TdlResult<Ok> {
        val function = DeleteAccount(
            reason = reason,
            password = password,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteAllCallMessages(revoke: Boolean): TdlResult<Ok> {
        val function = DeleteAllCallMessages(
            revoke = revoke,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteAllRevokedChatInviteLinks(chatId: Long, creatorUserId: Long): TdlResult<Ok> {
        val function = DeleteAllRevokedChatInviteLinks(
            chatId = chatId,
            creatorUserId = creatorUserId,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteBotMediaPreviews(
        botUserId: Long,
        languageCode: String,
        fileIds: IntArray,
    ): TdlResult<Ok> {
        val function = DeleteBotMediaPreviews(
            botUserId = botUserId,
            languageCode = languageCode,
            fileIds = fileIds,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteBusinessChatLink(link: String): TdlResult<Ok> {
        val function = DeleteBusinessChatLink(
            link = link,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteBusinessConnectedBot(botUserId: Long): TdlResult<Ok> {
        val function = DeleteBusinessConnectedBot(
            botUserId = botUserId,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteBusinessMessages(businessConnectionId: String, messageIds: LongArray): TdlResult<Ok> {
        val function = DeleteBusinessMessages(
            businessConnectionId = businessConnectionId,
            messageIds = messageIds,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteBusinessStory(businessConnectionId: String, storyId: Int): TdlResult<Ok> {
        val function = DeleteBusinessStory(
            businessConnectionId = businessConnectionId,
            storyId = storyId,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteChat(chatId: Long): TdlResult<Ok> {
        val function = DeleteChat(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteChatBackground(chatId: Long, restorePrevious: Boolean): TdlResult<Ok> {
        val function = DeleteChatBackground(
            chatId = chatId,
            restorePrevious = restorePrevious,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteChatFolder(chatFolderId: Int, leaveChatIds: LongArray): TdlResult<Ok> {
        val function = DeleteChatFolder(
            chatFolderId = chatFolderId,
            leaveChatIds = leaveChatIds,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteChatFolderInviteLink(chatFolderId: Int, inviteLink: String): TdlResult<Ok> {
        val function = DeleteChatFolderInviteLink(
            chatFolderId = chatFolderId,
            inviteLink = inviteLink,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteChatHistory(
        chatId: Long,
        removeFromChatList: Boolean,
        revoke: Boolean,
    ): TdlResult<Ok> {
        val function = DeleteChatHistory(
            chatId = chatId,
            removeFromChatList = removeFromChatList,
            revoke = revoke,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteChatMessagesByDate(
        chatId: Long,
        minDate: Int,
        maxDate: Int,
        revoke: Boolean,
    ): TdlResult<Ok> {
        val function = DeleteChatMessagesByDate(
            chatId = chatId,
            minDate = minDate,
            maxDate = maxDate,
            revoke = revoke,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteChatMessagesBySender(chatId: Long, senderId: MessageSender): TdlResult<Ok> {
        val function = DeleteChatMessagesBySender(
            chatId = chatId,
            senderId = senderId,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteChatReplyMarkup(chatId: Long, messageId: Long): TdlResult<Ok> {
        val function = DeleteChatReplyMarkup(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteCommands(scope: BotCommandScope?, languageCode: String): TdlResult<Ok> {
        val function = DeleteCommands(
            scope = scope,
            languageCode = languageCode,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteDefaultBackground(forDarkTheme: Boolean): TdlResult<Ok> {
        val function = DeleteDefaultBackground(
            forDarkTheme = forDarkTheme,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteDirectMessagesChatTopicHistory(chatId: Long, topicId: Long): TdlResult<Ok> {
        val function = DeleteDirectMessagesChatTopicHistory(
            chatId = chatId,
            topicId = topicId,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteDirectMessagesChatTopicMessagesByDate(
        chatId: Long,
        topicId: Long,
        minDate: Int,
        maxDate: Int,
    ): TdlResult<Ok> {
        val function = DeleteDirectMessagesChatTopicMessagesByDate(
            chatId = chatId,
            topicId = topicId,
            minDate = minDate,
            maxDate = maxDate,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteFile(fileId: Int): TdlResult<Ok> {
        val function = DeleteFile(
            fileId = fileId,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteForumTopic(chatId: Long, forumTopicId: Int): TdlResult<Ok> {
        val function = DeleteForumTopic(
            chatId = chatId,
            forumTopicId = forumTopicId,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteGiftCollection(ownerId: MessageSender, collectionId: Int): TdlResult<Ok> {
        val function = DeleteGiftCollection(
            ownerId = ownerId,
            collectionId = collectionId,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteGroupCallMessages(
        groupCallId: Int,
        messageIds: IntArray,
        reportSpam: Boolean,
    ): TdlResult<Ok> {
        val function = DeleteGroupCallMessages(
            groupCallId = groupCallId,
            messageIds = messageIds,
            reportSpam = reportSpam,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteGroupCallMessagesBySender(
        groupCallId: Int,
        senderId: MessageSender,
        reportSpam: Boolean,
    ): TdlResult<Ok> {
        val function = DeleteGroupCallMessagesBySender(
            groupCallId = groupCallId,
            senderId = senderId,
            reportSpam = reportSpam,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteLanguagePack(languagePackId: String): TdlResult<Ok> {
        val function = DeleteLanguagePack(
            languagePackId = languagePackId,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteMessages(
        chatId: Long,
        messageIds: LongArray,
        revoke: Boolean,
    ): TdlResult<Ok> {
        val function = DeleteMessages(
            chatId = chatId,
            messageIds = messageIds,
            revoke = revoke,
        )
        return repository.send(function = function)
    }

    override suspend fun deletePassportElement(type: PassportElementType): TdlResult<Ok> {
        val function = DeletePassportElement(
            type = type,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteProfilePhoto(profilePhotoId: Long): TdlResult<Ok> {
        val function = DeleteProfilePhoto(
            profilePhotoId = profilePhotoId,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteQuickReplyShortcut(shortcutId: Int): TdlResult<Ok> {
        val function = DeleteQuickReplyShortcut(
            shortcutId = shortcutId,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteQuickReplyShortcutMessages(shortcutId: Int, messageIds: LongArray): TdlResult<Ok> {
        val function = DeleteQuickReplyShortcutMessages(
            shortcutId = shortcutId,
            messageIds = messageIds,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteRevokedChatInviteLink(chatId: Long, inviteLink: String): TdlResult<Ok> {
        val function = DeleteRevokedChatInviteLink(
            chatId = chatId,
            inviteLink = inviteLink,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteSavedCredentials(): TdlResult<Ok> {
        val function = DeleteSavedCredentials()
        return repository.send(function = function)
    }

    override suspend fun deleteSavedMessagesTopicHistory(savedMessagesTopicId: Long): TdlResult<Ok> {
        val function = DeleteSavedMessagesTopicHistory(
            savedMessagesTopicId = savedMessagesTopicId,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteSavedMessagesTopicMessagesByDate(
        savedMessagesTopicId: Long,
        minDate: Int,
        maxDate: Int,
    ): TdlResult<Ok> {
        val function = DeleteSavedMessagesTopicMessagesByDate(
            savedMessagesTopicId = savedMessagesTopicId,
            minDate = minDate,
            maxDate = maxDate,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteSavedOrderInfo(): TdlResult<Ok> {
        val function = DeleteSavedOrderInfo()
        return repository.send(function = function)
    }

    override suspend fun deleteStickerSet(name: String): TdlResult<Ok> {
        val function = DeleteStickerSet(
            name = name,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteStory(storyPosterChatId: Long, storyId: Int): TdlResult<Ok> {
        val function = DeleteStory(
            storyPosterChatId = storyPosterChatId,
            storyId = storyId,
        )
        return repository.send(function = function)
    }

    override suspend fun deleteStoryAlbum(chatId: Long, storyAlbumId: Int): TdlResult<Ok> {
        val function = DeleteStoryAlbum(
            chatId = chatId,
            storyAlbumId = storyAlbumId,
        )
        return repository.send(function = function)
    }

    override suspend fun destroy(): TdlResult<Ok> {
        val function = Destroy()
        return repository.send(function = function)
    }

    override suspend fun disableAllSupergroupUsernames(supergroupId: Long): TdlResult<Ok> {
        val function = DisableAllSupergroupUsernames(
            supergroupId = supergroupId,
        )
        return repository.send(function = function)
    }

    override suspend fun disableProxy(): TdlResult<Ok> {
        val function = DisableProxy()
        return repository.send(function = function)
    }

    override suspend fun discardCall(
        callId: Int,
        isDisconnected: Boolean,
        inviteLink: String,
        duration: Int,
        isVideo: Boolean,
        connectionId: Long,
    ): TdlResult<Ok> {
        val function = DiscardCall(
            callId = callId,
            isDisconnected = isDisconnected,
            inviteLink = inviteLink,
            duration = duration,
            isVideo = isVideo,
            connectionId = connectionId,
        )
        return repository.send(function = function)
    }

    override suspend fun disconnectAffiliateProgram(affiliate: AffiliateType, url: String): TdlResult<ConnectedAffiliateProgram> {
        val function = DisconnectAffiliateProgram(
            affiliate = affiliate,
            url = url,
        )
        return repository.send(function = function)
    }

    override suspend fun disconnectAllWebsites(): TdlResult<Ok> {
        val function = DisconnectAllWebsites()
        return repository.send(function = function)
    }

    override suspend fun disconnectWebsite(websiteId: Long): TdlResult<Ok> {
        val function = DisconnectWebsite(
            websiteId = websiteId,
        )
        return repository.send(function = function)
    }

    override suspend fun downloadFile(
        fileId: Int,
        priority: Int,
        offset: Long,
        limit: Long,
        synchronous: Boolean,
    ): TdlResult<File> {
        val function = DownloadFile(
            fileId = fileId,
            priority = priority,
            offset = offset,
            limit = limit,
            synchronous = synchronous,
        )
        return repository.send(function = function)
    }

    override suspend fun dropGiftOriginalDetails(receivedGiftId: String, starCount: Long): TdlResult<Ok> {
        val function = DropGiftOriginalDetails(
            receivedGiftId = receivedGiftId,
            starCount = starCount,
        )
        return repository.send(function = function)
    }

    override suspend fun editBotMediaPreview(
        botUserId: Long,
        languageCode: String,
        fileId: Int,
        content: InputStoryContent,
    ): TdlResult<BotMediaPreview> {
        val function = EditBotMediaPreview(
            botUserId = botUserId,
            languageCode = languageCode,
            fileId = fileId,
            content = content,
        )
        return repository.send(function = function)
    }

    override suspend fun editBusinessChatLink(link: String, linkInfo: InputBusinessChatLink): TdlResult<BusinessChatLink> {
        val function = EditBusinessChatLink(
            link = link,
            linkInfo = linkInfo,
        )
        return repository.send(function = function)
    }

    override suspend fun editBusinessMessageCaption(
        businessConnectionId: String,
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
        caption: FormattedText?,
        showCaptionAboveMedia: Boolean,
    ): TdlResult<BusinessMessage> {
        val function = EditBusinessMessageCaption(
            businessConnectionId = businessConnectionId,
            chatId = chatId,
            messageId = messageId,
            replyMarkup = replyMarkup,
            caption = caption,
            showCaptionAboveMedia = showCaptionAboveMedia,
        )
        return repository.send(function = function)
    }

    override suspend fun editBusinessMessageChecklist(
        businessConnectionId: String,
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
        checklist: InputChecklist,
    ): TdlResult<BusinessMessage> {
        val function = EditBusinessMessageChecklist(
            businessConnectionId = businessConnectionId,
            chatId = chatId,
            messageId = messageId,
            replyMarkup = replyMarkup,
            checklist = checklist,
        )
        return repository.send(function = function)
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
        val function = EditBusinessMessageLiveLocation(
            businessConnectionId = businessConnectionId,
            chatId = chatId,
            messageId = messageId,
            replyMarkup = replyMarkup,
            location = location,
            livePeriod = livePeriod,
            heading = heading,
            proximityAlertRadius = proximityAlertRadius,
        )
        return repository.send(function = function)
    }

    override suspend fun editBusinessMessageMedia(
        businessConnectionId: String,
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
        inputMessageContent: InputMessageContent,
    ): TdlResult<BusinessMessage> {
        val function = EditBusinessMessageMedia(
            businessConnectionId = businessConnectionId,
            chatId = chatId,
            messageId = messageId,
            replyMarkup = replyMarkup,
            inputMessageContent = inputMessageContent,
        )
        return repository.send(function = function)
    }

    override suspend fun editBusinessMessageReplyMarkup(
        businessConnectionId: String,
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
    ): TdlResult<BusinessMessage> {
        val function = EditBusinessMessageReplyMarkup(
            businessConnectionId = businessConnectionId,
            chatId = chatId,
            messageId = messageId,
            replyMarkup = replyMarkup,
        )
        return repository.send(function = function)
    }

    override suspend fun editBusinessMessageText(
        businessConnectionId: String,
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
        inputMessageContent: InputMessageContent,
    ): TdlResult<BusinessMessage> {
        val function = EditBusinessMessageText(
            businessConnectionId = businessConnectionId,
            chatId = chatId,
            messageId = messageId,
            replyMarkup = replyMarkup,
            inputMessageContent = inputMessageContent,
        )
        return repository.send(function = function)
    }

    override suspend fun editBusinessStory(
        storyPosterChatId: Long,
        storyId: Int,
        content: InputStoryContent,
        areas: InputStoryAreas,
        caption: FormattedText,
        privacySettings: StoryPrivacySettings,
    ): TdlResult<Story> {
        val function = EditBusinessStory(
            storyPosterChatId = storyPosterChatId,
            storyId = storyId,
            content = content,
            areas = areas,
            caption = caption,
            privacySettings = privacySettings,
        )
        return repository.send(function = function)
    }

    override suspend fun editChatFolder(chatFolderId: Int, folder: ChatFolder): TdlResult<ChatFolderInfo> {
        val function = EditChatFolder(
            chatFolderId = chatFolderId,
            folder = folder,
        )
        return repository.send(function = function)
    }

    override suspend fun editChatFolderInviteLink(
        chatFolderId: Int,
        inviteLink: String,
        name: String,
        chatIds: LongArray,
    ): TdlResult<ChatFolderInviteLink> {
        val function = EditChatFolderInviteLink(
            chatFolderId = chatFolderId,
            inviteLink = inviteLink,
            name = name,
            chatIds = chatIds,
        )
        return repository.send(function = function)
    }

    override suspend fun editChatInviteLink(
        chatId: Long,
        inviteLink: String,
        name: String,
        expirationDate: Int,
        memberLimit: Int,
        createsJoinRequest: Boolean,
    ): TdlResult<ChatInviteLink> {
        val function = EditChatInviteLink(
            chatId = chatId,
            inviteLink = inviteLink,
            name = name,
            expirationDate = expirationDate,
            memberLimit = memberLimit,
            createsJoinRequest = createsJoinRequest,
        )
        return repository.send(function = function)
    }

    override suspend fun editChatSubscriptionInviteLink(
        chatId: Long,
        inviteLink: String,
        name: String,
    ): TdlResult<ChatInviteLink> {
        val function = EditChatSubscriptionInviteLink(
            chatId = chatId,
            inviteLink = inviteLink,
            name = name,
        )
        return repository.send(function = function)
    }

    override suspend fun editCustomLanguagePackInfo(info: LanguagePackInfo): TdlResult<Ok> {
        val function = EditCustomLanguagePackInfo(
            info = info,
        )
        return repository.send(function = function)
    }

    override suspend fun editForumTopic(
        chatId: Long,
        forumTopicId: Int,
        name: String,
        editIconCustomEmoji: Boolean,
        iconCustomEmojiId: Long,
    ): TdlResult<Ok> {
        val function = EditForumTopic(
            chatId = chatId,
            forumTopicId = forumTopicId,
            name = name,
            editIconCustomEmoji = editIconCustomEmoji,
            iconCustomEmojiId = iconCustomEmojiId,
        )
        return repository.send(function = function)
    }

    override suspend fun editInlineMessageCaption(
        inlineMessageId: String,
        replyMarkup: ReplyMarkup?,
        caption: FormattedText?,
        showCaptionAboveMedia: Boolean,
    ): TdlResult<Ok> {
        val function = EditInlineMessageCaption(
            inlineMessageId = inlineMessageId,
            replyMarkup = replyMarkup,
            caption = caption,
            showCaptionAboveMedia = showCaptionAboveMedia,
        )
        return repository.send(function = function)
    }

    override suspend fun editInlineMessageLiveLocation(
        inlineMessageId: String,
        replyMarkup: ReplyMarkup?,
        location: Location?,
        livePeriod: Int,
        heading: Int,
        proximityAlertRadius: Int,
    ): TdlResult<Ok> {
        val function = EditInlineMessageLiveLocation(
            inlineMessageId = inlineMessageId,
            replyMarkup = replyMarkup,
            location = location,
            livePeriod = livePeriod,
            heading = heading,
            proximityAlertRadius = proximityAlertRadius,
        )
        return repository.send(function = function)
    }

    override suspend fun editInlineMessageMedia(
        inlineMessageId: String,
        replyMarkup: ReplyMarkup?,
        inputMessageContent: InputMessageContent,
    ): TdlResult<Ok> {
        val function = EditInlineMessageMedia(
            inlineMessageId = inlineMessageId,
            replyMarkup = replyMarkup,
            inputMessageContent = inputMessageContent,
        )
        return repository.send(function = function)
    }

    override suspend fun editInlineMessageReplyMarkup(inlineMessageId: String, replyMarkup: ReplyMarkup?): TdlResult<Ok> {
        val function = EditInlineMessageReplyMarkup(
            inlineMessageId = inlineMessageId,
            replyMarkup = replyMarkup,
        )
        return repository.send(function = function)
    }

    override suspend fun editInlineMessageText(
        inlineMessageId: String,
        replyMarkup: ReplyMarkup?,
        inputMessageContent: InputMessageContent,
    ): TdlResult<Ok> {
        val function = EditInlineMessageText(
            inlineMessageId = inlineMessageId,
            replyMarkup = replyMarkup,
            inputMessageContent = inputMessageContent,
        )
        return repository.send(function = function)
    }

    override suspend fun editMessageCaption(
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
        caption: FormattedText?,
        showCaptionAboveMedia: Boolean,
    ): TdlResult<Message> {
        val function = EditMessageCaption(
            chatId = chatId,
            messageId = messageId,
            replyMarkup = replyMarkup,
            caption = caption,
            showCaptionAboveMedia = showCaptionAboveMedia,
        )
        return repository.send(function = function)
    }

    override suspend fun editMessageChecklist(
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
        checklist: InputChecklist,
    ): TdlResult<Message> {
        val function = EditMessageChecklist(
            chatId = chatId,
            messageId = messageId,
            replyMarkup = replyMarkup,
            checklist = checklist,
        )
        return repository.send(function = function)
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
        val function = EditMessageLiveLocation(
            chatId = chatId,
            messageId = messageId,
            replyMarkup = replyMarkup,
            location = location,
            livePeriod = livePeriod,
            heading = heading,
            proximityAlertRadius = proximityAlertRadius,
        )
        return repository.send(function = function)
    }

    override suspend fun editMessageMedia(
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
        inputMessageContent: InputMessageContent,
    ): TdlResult<Message> {
        val function = EditMessageMedia(
            chatId = chatId,
            messageId = messageId,
            replyMarkup = replyMarkup,
            inputMessageContent = inputMessageContent,
        )
        return repository.send(function = function)
    }

    override suspend fun editMessageReplyMarkup(
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
    ): TdlResult<Message> {
        val function = EditMessageReplyMarkup(
            chatId = chatId,
            messageId = messageId,
            replyMarkup = replyMarkup,
        )
        return repository.send(function = function)
    }

    override suspend fun editMessageSchedulingState(
        chatId: Long,
        messageId: Long,
        schedulingState: MessageSchedulingState?,
    ): TdlResult<Ok> {
        val function = EditMessageSchedulingState(
            chatId = chatId,
            messageId = messageId,
            schedulingState = schedulingState,
        )
        return repository.send(function = function)
    }

    override suspend fun editMessageText(
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
        inputMessageContent: InputMessageContent,
    ): TdlResult<Message> {
        val function = EditMessageText(
            chatId = chatId,
            messageId = messageId,
            replyMarkup = replyMarkup,
            inputMessageContent = inputMessageContent,
        )
        return repository.send(function = function)
    }

    override suspend fun editProxy(
        proxyId: Int,
        server: String,
        port: Int,
        enable: Boolean,
        type: ProxyType,
    ): TdlResult<Proxy> {
        val function = EditProxy(
            proxyId = proxyId,
            server = server,
            port = port,
            enable = enable,
            type = type,
        )
        return repository.send(function = function)
    }

    override suspend fun editQuickReplyMessage(
        shortcutId: Int,
        messageId: Long,
        inputMessageContent: InputMessageContent,
    ): TdlResult<Ok> {
        val function = EditQuickReplyMessage(
            shortcutId = shortcutId,
            messageId = messageId,
            inputMessageContent = inputMessageContent,
        )
        return repository.send(function = function)
    }

    override suspend fun editStarSubscription(subscriptionId: String, isCanceled: Boolean): TdlResult<Ok> {
        val function = EditStarSubscription(
            subscriptionId = subscriptionId,
            isCanceled = isCanceled,
        )
        return repository.send(function = function)
    }

    override suspend fun editStory(
        storyPosterChatId: Long,
        storyId: Int,
        content: InputStoryContent?,
        areas: InputStoryAreas?,
        caption: FormattedText?,
    ): TdlResult<Ok> {
        val function = EditStory(
            storyPosterChatId = storyPosterChatId,
            storyId = storyId,
            content = content,
            areas = areas,
            caption = caption,
        )
        return repository.send(function = function)
    }

    override suspend fun editStoryCover(
        storyPosterChatId: Long,
        storyId: Int,
        coverFrameTimestamp: Double,
    ): TdlResult<Ok> {
        val function = EditStoryCover(
            storyPosterChatId = storyPosterChatId,
            storyId = storyId,
            coverFrameTimestamp = coverFrameTimestamp,
        )
        return repository.send(function = function)
    }

    override suspend fun editUserStarSubscription(
        userId: Long,
        telegramPaymentChargeId: String,
        isCanceled: Boolean,
    ): TdlResult<Ok> {
        val function = EditUserStarSubscription(
            userId = userId,
            telegramPaymentChargeId = telegramPaymentChargeId,
            isCanceled = isCanceled,
        )
        return repository.send(function = function)
    }

    override suspend fun enableProxy(proxyId: Int): TdlResult<Ok> {
        val function = EnableProxy(
            proxyId = proxyId,
        )
        return repository.send(function = function)
    }

    override suspend fun encryptGroupCallData(
        groupCallId: Int,
        dataChannel: GroupCallDataChannel,
        data: ByteArray,
        unencryptedPrefixSize: Int,
    ): TdlResult<Data> {
        val function = EncryptGroupCallData(
            groupCallId = groupCallId,
            dataChannel = dataChannel,
            data = data,
            unencryptedPrefixSize = unencryptedPrefixSize,
        )
        return repository.send(function = function)
    }

    override suspend fun endGroupCall(groupCallId: Int): TdlResult<Ok> {
        val function = EndGroupCall(
            groupCallId = groupCallId,
        )
        return repository.send(function = function)
    }

    override suspend fun endGroupCallRecording(groupCallId: Int): TdlResult<Ok> {
        val function = EndGroupCallRecording(
            groupCallId = groupCallId,
        )
        return repository.send(function = function)
    }

    override suspend fun endGroupCallScreenSharing(groupCallId: Int): TdlResult<Ok> {
        val function = EndGroupCallScreenSharing(
            groupCallId = groupCallId,
        )
        return repository.send(function = function)
    }

    override suspend fun finishFileGeneration(generationId: Long, error: Error?): TdlResult<Ok> {
        val function = FinishFileGeneration(
            generationId = generationId,
            error = error,
        )
        return repository.send(function = function)
    }

    override suspend fun forwardMessages(
        chatId: Long,
        topicId: MessageTopic?,
        fromChatId: Long,
        messageIds: LongArray,
        options: MessageSendOptions?,
        sendCopy: Boolean,
        removeCaption: Boolean,
    ): TdlResult<Messages> {
        val function = ForwardMessages(
            chatId = chatId,
            topicId = topicId,
            fromChatId = fromChatId,
            messageIds = messageIds,
            options = options,
            sendCopy = sendCopy,
            removeCaption = removeCaption,
        )
        return repository.send(function = function)
    }

    override suspend fun getAccountTtl(): TdlResult<AccountTtl> {
        val function = GetAccountTtl()
        return repository.send(function = function)
    }

    override suspend fun getActiveSessions(): TdlResult<Sessions> {
        val function = GetActiveSessions()
        return repository.send(function = function)
    }

    override suspend fun getAllPassportElements(password: String): TdlResult<PassportElements> {
        val function = GetAllPassportElements(
            password = password,
        )
        return repository.send(function = function)
    }

    override suspend fun getAllStickerEmojis(
        stickerType: StickerType,
        query: String,
        chatId: Long,
        returnOnlyMainEmoji: Boolean,
    ): TdlResult<Emojis> {
        val function = GetAllStickerEmojis(
            stickerType = stickerType,
            query = query,
            chatId = chatId,
            returnOnlyMainEmoji = returnOnlyMainEmoji,
        )
        return repository.send(function = function)
    }

    override suspend fun getAnimatedEmoji(emoji: String): TdlResult<AnimatedEmoji> {
        val function = GetAnimatedEmoji(
            emoji = emoji,
        )
        return repository.send(function = function)
    }

    override suspend fun getApplicationConfig(): TdlResult<JsonValue> {
        val function = GetApplicationConfig()
        return repository.send(function = function)
    }

    override suspend fun getApplicationDownloadLink(): TdlResult<HttpUrl> {
        val function = GetApplicationDownloadLink()
        return repository.send(function = function)
    }

    override suspend fun getArchiveChatListSettings(): TdlResult<ArchiveChatListSettings> {
        val function = GetArchiveChatListSettings()
        return repository.send(function = function)
    }

    override suspend fun getArchivedStickerSets(
        stickerType: StickerType,
        offsetStickerSetId: Long,
        limit: Int,
    ): TdlResult<StickerSets> {
        val function = GetArchivedStickerSets(
            stickerType = stickerType,
            offsetStickerSetId = offsetStickerSetId,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getAttachedStickerSets(fileId: Int): TdlResult<StickerSets> {
        val function = GetAttachedStickerSets(
            fileId = fileId,
        )
        return repository.send(function = function)
    }

    override suspend fun getAttachmentMenuBot(botUserId: Long): TdlResult<AttachmentMenuBot> {
        val function = GetAttachmentMenuBot(
            botUserId = botUserId,
        )
        return repository.send(function = function)
    }

    override suspend fun getAuthorizationState(): TdlResult<AuthorizationState> {
        val function = GetAuthorizationState()
        return repository.send(function = function)
    }

    override suspend fun getAutoDownloadSettingsPresets(): TdlResult<AutoDownloadSettingsPresets> {
        val function = GetAutoDownloadSettingsPresets()
        return repository.send(function = function)
    }

    override suspend fun getAutosaveSettings(): TdlResult<AutosaveSettings> {
        val function = GetAutosaveSettings()
        return repository.send(function = function)
    }

    override suspend fun getAvailableChatBoostSlots(): TdlResult<ChatBoostSlots> {
        val function = GetAvailableChatBoostSlots()
        return repository.send(function = function)
    }

    override suspend fun getAvailableGifts(): TdlResult<AvailableGifts> {
        val function = GetAvailableGifts()
        return repository.send(function = function)
    }

    override suspend fun getBackgroundUrl(name: String, type: BackgroundType): TdlResult<HttpUrl> {
        val function = GetBackgroundUrl(
            name = name,
            type = type,
        )
        return repository.send(function = function)
    }

    override suspend fun getBankCardInfo(bankCardNumber: String): TdlResult<BankCardInfo> {
        val function = GetBankCardInfo(
            bankCardNumber = bankCardNumber,
        )
        return repository.send(function = function)
    }

    override suspend fun getBasicGroup(basicGroupId: Long): TdlResult<BasicGroup> {
        val function = GetBasicGroup(
            basicGroupId = basicGroupId,
        )
        return repository.send(function = function)
    }

    override suspend fun getBasicGroupFullInfo(basicGroupId: Long): TdlResult<BasicGroupFullInfo> {
        val function = GetBasicGroupFullInfo(
            basicGroupId = basicGroupId,
        )
        return repository.send(function = function)
    }

    override suspend fun getBlockedMessageSenders(
        blockList: BlockList,
        offset: Int,
        limit: Int,
    ): TdlResult<MessageSenders> {
        val function = GetBlockedMessageSenders(
            blockList = blockList,
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getBotInfoDescription(botUserId: Long, languageCode: String): TdlResult<Text> {
        val function = GetBotInfoDescription(
            botUserId = botUserId,
            languageCode = languageCode,
        )
        return repository.send(function = function)
    }

    override suspend fun getBotInfoShortDescription(botUserId: Long, languageCode: String): TdlResult<Text> {
        val function = GetBotInfoShortDescription(
            botUserId = botUserId,
            languageCode = languageCode,
        )
        return repository.send(function = function)
    }

    override suspend fun getBotMediaPreviewInfo(botUserId: Long, languageCode: String): TdlResult<BotMediaPreviewInfo> {
        val function = GetBotMediaPreviewInfo(
            botUserId = botUserId,
            languageCode = languageCode,
        )
        return repository.send(function = function)
    }

    override suspend fun getBotMediaPreviews(botUserId: Long): TdlResult<BotMediaPreviews> {
        val function = GetBotMediaPreviews(
            botUserId = botUserId,
        )
        return repository.send(function = function)
    }

    override suspend fun getBotName(botUserId: Long, languageCode: String): TdlResult<Text> {
        val function = GetBotName(
            botUserId = botUserId,
            languageCode = languageCode,
        )
        return repository.send(function = function)
    }

    override suspend fun getBotSimilarBotCount(botUserId: Long, returnLocal: Boolean): TdlResult<Count> {
        val function = GetBotSimilarBotCount(
            botUserId = botUserId,
            returnLocal = returnLocal,
        )
        return repository.send(function = function)
    }

    override suspend fun getBotSimilarBots(botUserId: Long): TdlResult<Users> {
        val function = GetBotSimilarBots(
            botUserId = botUserId,
        )
        return repository.send(function = function)
    }

    override suspend fun getBusinessAccountStarAmount(businessConnectionId: String): TdlResult<StarAmount> {
        val function = GetBusinessAccountStarAmount(
            businessConnectionId = businessConnectionId,
        )
        return repository.send(function = function)
    }

    override suspend fun getBusinessChatLinkInfo(linkName: String): TdlResult<BusinessChatLinkInfo> {
        val function = GetBusinessChatLinkInfo(
            linkName = linkName,
        )
        return repository.send(function = function)
    }

    override suspend fun getBusinessChatLinks(): TdlResult<BusinessChatLinks> {
        val function = GetBusinessChatLinks()
        return repository.send(function = function)
    }

    override suspend fun getBusinessConnectedBot(): TdlResult<BusinessConnectedBot> {
        val function = GetBusinessConnectedBot()
        return repository.send(function = function)
    }

    override suspend fun getBusinessConnection(connectionId: String): TdlResult<BusinessConnection> {
        val function = GetBusinessConnection(
            connectionId = connectionId,
        )
        return repository.send(function = function)
    }

    override suspend fun getBusinessFeatures(source: BusinessFeature?): TdlResult<BusinessFeatures> {
        val function = GetBusinessFeatures(
            source = source,
        )
        return repository.send(function = function)
    }

    override suspend fun getCallbackQueryAnswer(
        chatId: Long,
        messageId: Long,
        payload: CallbackQueryPayload,
    ): TdlResult<CallbackQueryAnswer> {
        val function = GetCallbackQueryAnswer(
            chatId = chatId,
            messageId = messageId,
            payload = payload,
        )
        return repository.send(function = function)
    }

    override suspend fun getCallbackQueryMessage(
        chatId: Long,
        messageId: Long,
        callbackQueryId: Long,
    ): TdlResult<Message> {
        val function = GetCallbackQueryMessage(
            chatId = chatId,
            messageId = messageId,
            callbackQueryId = callbackQueryId,
        )
        return repository.send(function = function)
    }

    override suspend fun getChat(chatId: Long): TdlResult<Chat> {
        val function = GetChat(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatActiveStories(chatId: Long): TdlResult<ChatActiveStories> {
        val function = GetChatActiveStories(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatAdministrators(chatId: Long): TdlResult<ChatAdministrators> {
        val function = GetChatAdministrators(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatArchivedStories(
        chatId: Long,
        fromStoryId: Int,
        limit: Int,
    ): TdlResult<Stories> {
        val function = GetChatArchivedStories(
            chatId = chatId,
            fromStoryId = fromStoryId,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatAvailableMessageSenders(chatId: Long): TdlResult<ChatMessageSenders> {
        val function = GetChatAvailableMessageSenders(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatAvailablePaidMessageReactionSenders(chatId: Long): TdlResult<MessageSenders> {
        val function = GetChatAvailablePaidMessageReactionSenders(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatBoostFeatures(isChannel: Boolean): TdlResult<ChatBoostFeatures> {
        val function = GetChatBoostFeatures(
            isChannel = isChannel,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatBoostLevelFeatures(isChannel: Boolean, level: Int): TdlResult<ChatBoostLevelFeatures> {
        val function = GetChatBoostLevelFeatures(
            isChannel = isChannel,
            level = level,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatBoostLink(chatId: Long): TdlResult<ChatBoostLink> {
        val function = GetChatBoostLink(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatBoostLinkInfo(url: String): TdlResult<ChatBoostLinkInfo> {
        val function = GetChatBoostLinkInfo(
            url = url,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatBoostStatus(chatId: Long): TdlResult<ChatBoostStatus> {
        val function = GetChatBoostStatus(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatBoosts(
        chatId: Long,
        onlyGiftCodes: Boolean,
        offset: String,
        limit: Int,
    ): TdlResult<FoundChatBoosts> {
        val function = GetChatBoosts(
            chatId = chatId,
            onlyGiftCodes = onlyGiftCodes,
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatEventLog(
        chatId: Long,
        query: String,
        fromEventId: Long,
        limit: Int,
        filters: ChatEventLogFilters?,
        userIds: LongArray,
    ): TdlResult<ChatEvents> {
        val function = GetChatEventLog(
            chatId = chatId,
            query = query,
            fromEventId = fromEventId,
            limit = limit,
            filters = filters,
            userIds = userIds,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatFolder(chatFolderId: Int): TdlResult<ChatFolder> {
        val function = GetChatFolder(
            chatFolderId = chatFolderId,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatFolderChatCount(folder: ChatFolder): TdlResult<Count> {
        val function = GetChatFolderChatCount(
            folder = folder,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatFolderChatsToLeave(chatFolderId: Int): TdlResult<Chats> {
        val function = GetChatFolderChatsToLeave(
            chatFolderId = chatFolderId,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatFolderDefaultIconName(folder: ChatFolder): TdlResult<ChatFolderIcon> {
        val function = GetChatFolderDefaultIconName(
            folder = folder,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatFolderInviteLinks(chatFolderId: Int): TdlResult<ChatFolderInviteLinks> {
        val function = GetChatFolderInviteLinks(
            chatFolderId = chatFolderId,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatFolderNewChats(chatFolderId: Int): TdlResult<Chats> {
        val function = GetChatFolderNewChats(
            chatFolderId = chatFolderId,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatHistory(
        chatId: Long,
        fromMessageId: Long,
        offset: Int,
        limit: Int,
        onlyLocal: Boolean,
    ): TdlResult<Messages> {
        val function = GetChatHistory(
            chatId = chatId,
            fromMessageId = fromMessageId,
            offset = offset,
            limit = limit,
            onlyLocal = onlyLocal,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatInviteLink(chatId: Long, inviteLink: String): TdlResult<ChatInviteLink> {
        val function = GetChatInviteLink(
            chatId = chatId,
            inviteLink = inviteLink,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatInviteLinkCounts(chatId: Long): TdlResult<ChatInviteLinkCounts> {
        val function = GetChatInviteLinkCounts(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatInviteLinkMembers(
        chatId: Long,
        inviteLink: String,
        onlyWithExpiredSubscription: Boolean,
        offsetMember: ChatInviteLinkMember?,
        limit: Int,
    ): TdlResult<ChatInviteLinkMembers> {
        val function = GetChatInviteLinkMembers(
            chatId = chatId,
            inviteLink = inviteLink,
            onlyWithExpiredSubscription = onlyWithExpiredSubscription,
            offsetMember = offsetMember,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatInviteLinks(
        chatId: Long,
        creatorUserId: Long,
        isRevoked: Boolean,
        offsetDate: Int,
        offsetInviteLink: String,
        limit: Int,
    ): TdlResult<ChatInviteLinks> {
        val function = GetChatInviteLinks(
            chatId = chatId,
            creatorUserId = creatorUserId,
            isRevoked = isRevoked,
            offsetDate = offsetDate,
            offsetInviteLink = offsetInviteLink,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatJoinRequests(
        chatId: Long,
        inviteLink: String,
        query: String,
        offsetRequest: ChatJoinRequest?,
        limit: Int,
    ): TdlResult<ChatJoinRequests> {
        val function = GetChatJoinRequests(
            chatId = chatId,
            inviteLink = inviteLink,
            query = query,
            offsetRequest = offsetRequest,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatListsToAddChat(chatId: Long): TdlResult<ChatLists> {
        val function = GetChatListsToAddChat(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatMember(chatId: Long, memberId: MessageSender): TdlResult<ChatMember> {
        val function = GetChatMember(
            chatId = chatId,
            memberId = memberId,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatMessageByDate(chatId: Long, date: Int): TdlResult<Message> {
        val function = GetChatMessageByDate(
            chatId = chatId,
            date = date,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatMessageCalendar(
        chatId: Long,
        topicId: MessageTopic?,
        filter: SearchMessagesFilter,
        fromMessageId: Long,
    ): TdlResult<MessageCalendar> {
        val function = GetChatMessageCalendar(
            chatId = chatId,
            topicId = topicId,
            filter = filter,
            fromMessageId = fromMessageId,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatMessageCount(
        chatId: Long,
        topicId: MessageTopic?,
        filter: SearchMessagesFilter,
        returnLocal: Boolean,
    ): TdlResult<Count> {
        val function = GetChatMessageCount(
            chatId = chatId,
            topicId = topicId,
            filter = filter,
            returnLocal = returnLocal,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatMessagePosition(
        chatId: Long,
        topicId: MessageTopic?,
        filter: SearchMessagesFilter,
        messageId: Long,
    ): TdlResult<Count> {
        val function = GetChatMessagePosition(
            chatId = chatId,
            topicId = topicId,
            filter = filter,
            messageId = messageId,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatNotificationSettingsExceptions(scope: NotificationSettingsScope?, compareSound: Boolean): TdlResult<Chats> {
        val function = GetChatNotificationSettingsExceptions(
            scope = scope,
            compareSound = compareSound,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatPinnedMessage(chatId: Long): TdlResult<Message> {
        val function = GetChatPinnedMessage(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatPostedToChatPageStories(
        chatId: Long,
        fromStoryId: Int,
        limit: Int,
    ): TdlResult<Stories> {
        val function = GetChatPostedToChatPageStories(
            chatId = chatId,
            fromStoryId = fromStoryId,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatRevenueStatistics(chatId: Long, isDark: Boolean): TdlResult<ChatRevenueStatistics> {
        val function = GetChatRevenueStatistics(
            chatId = chatId,
            isDark = isDark,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatRevenueTransactions(
        chatId: Long,
        offset: String,
        limit: Int,
    ): TdlResult<ChatRevenueTransactions> {
        val function = GetChatRevenueTransactions(
            chatId = chatId,
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatRevenueWithdrawalUrl(chatId: Long, password: String): TdlResult<HttpUrl> {
        val function = GetChatRevenueWithdrawalUrl(
            chatId = chatId,
            password = password,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatScheduledMessages(chatId: Long): TdlResult<Messages> {
        val function = GetChatScheduledMessages(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatSimilarChatCount(chatId: Long, returnLocal: Boolean): TdlResult<Count> {
        val function = GetChatSimilarChatCount(
            chatId = chatId,
            returnLocal = returnLocal,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatSimilarChats(chatId: Long): TdlResult<Chats> {
        val function = GetChatSimilarChats(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatSparseMessagePositions(
        chatId: Long,
        filter: SearchMessagesFilter,
        fromMessageId: Long,
        limit: Int,
        savedMessagesTopicId: Long,
    ): TdlResult<MessagePositions> {
        val function = GetChatSparseMessagePositions(
            chatId = chatId,
            filter = filter,
            fromMessageId = fromMessageId,
            limit = limit,
            savedMessagesTopicId = savedMessagesTopicId,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatSponsoredMessages(chatId: Long): TdlResult<SponsoredMessages> {
        val function = GetChatSponsoredMessages(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatStatistics(chatId: Long, isDark: Boolean): TdlResult<ChatStatistics> {
        val function = GetChatStatistics(
            chatId = chatId,
            isDark = isDark,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatStoryAlbums(chatId: Long): TdlResult<StoryAlbums> {
        val function = GetChatStoryAlbums(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatStoryInteractions(
        storyPosterChatId: Long,
        storyId: Int,
        reactionType: ReactionType?,
        preferForwards: Boolean,
        offset: String,
        limit: Int,
    ): TdlResult<StoryInteractions> {
        val function = GetChatStoryInteractions(
            storyPosterChatId = storyPosterChatId,
            storyId = storyId,
            reactionType = reactionType,
            preferForwards = preferForwards,
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getChats(chatList: ChatList?, limit: Int): TdlResult<Chats> {
        val function = GetChats(
            chatList = chatList,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatsForChatFolderInviteLink(chatFolderId: Int): TdlResult<Chats> {
        val function = GetChatsForChatFolderInviteLink(
            chatFolderId = chatFolderId,
        )
        return repository.send(function = function)
    }

    override suspend fun getChatsToPostStories(): TdlResult<Chats> {
        val function = GetChatsToPostStories()
        return repository.send(function = function)
    }

    override suspend fun getCloseFriends(): TdlResult<Users> {
        val function = GetCloseFriends()
        return repository.send(function = function)
    }

    override suspend fun getCollectibleItemInfo(type: CollectibleItemType): TdlResult<CollectibleItemInfo> {
        val function = GetCollectibleItemInfo(
            type = type,
        )
        return repository.send(function = function)
    }

    override suspend fun getCommands(scope: BotCommandScope?, languageCode: String): TdlResult<BotCommands> {
        val function = GetCommands(
            scope = scope,
            languageCode = languageCode,
        )
        return repository.send(function = function)
    }

    override suspend fun getConnectedAffiliateProgram(affiliate: AffiliateType, botUserId: Long): TdlResult<ConnectedAffiliateProgram> {
        val function = GetConnectedAffiliateProgram(
            affiliate = affiliate,
            botUserId = botUserId,
        )
        return repository.send(function = function)
    }

    override suspend fun getConnectedAffiliatePrograms(
        affiliate: AffiliateType,
        offset: String,
        limit: Int,
    ): TdlResult<ConnectedAffiliatePrograms> {
        val function = GetConnectedAffiliatePrograms(
            affiliate = affiliate,
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getConnectedWebsites(): TdlResult<ConnectedWebsites> {
        val function = GetConnectedWebsites()
        return repository.send(function = function)
    }

    override suspend fun getContacts(): TdlResult<Users> {
        val function = GetContacts()
        return repository.send(function = function)
    }

    override suspend fun getCountries(): TdlResult<Countries> {
        val function = GetCountries()
        return repository.send(function = function)
    }

    override suspend fun getCountryCode(): TdlResult<Text> {
        val function = GetCountryCode()
        return repository.send(function = function)
    }

    override suspend fun getCountryFlagEmoji(countryCode: String): TdlResult<Text> {
        val function = GetCountryFlagEmoji(
            countryCode = countryCode,
        )
        return repository.send(function = function)
    }

    override suspend fun getCreatedPublicChats(type: PublicChatType): TdlResult<Chats> {
        val function = GetCreatedPublicChats(
            type = type,
        )
        return repository.send(function = function)
    }

    override suspend fun getCurrentState(): TdlResult<Updates> {
        val function = GetCurrentState()
        return repository.send(function = function)
    }

    override suspend fun getCurrentWeather(location: Location): TdlResult<CurrentWeather> {
        val function = GetCurrentWeather(
            location = location,
        )
        return repository.send(function = function)
    }

    override suspend fun getCustomEmojiReactionAnimations(): TdlResult<Stickers> {
        val function = GetCustomEmojiReactionAnimations()
        return repository.send(function = function)
    }

    override suspend fun getCustomEmojiStickers(customEmojiIds: LongArray): TdlResult<Stickers> {
        val function = GetCustomEmojiStickers(
            customEmojiIds = customEmojiIds,
        )
        return repository.send(function = function)
    }

    override suspend fun getDatabaseStatistics(): TdlResult<DatabaseStatistics> {
        val function = GetDatabaseStatistics()
        return repository.send(function = function)
    }

    override suspend fun getDeepLinkInfo(link: String): TdlResult<DeepLinkInfo> {
        val function = GetDeepLinkInfo(
            link = link,
        )
        return repository.send(function = function)
    }

    override suspend fun getDefaultBackgroundCustomEmojiStickers(): TdlResult<Stickers> {
        val function = GetDefaultBackgroundCustomEmojiStickers()
        return repository.send(function = function)
    }

    override suspend fun getDefaultChatEmojiStatuses(): TdlResult<EmojiStatusCustomEmojis> {
        val function = GetDefaultChatEmojiStatuses()
        return repository.send(function = function)
    }

    override suspend fun getDefaultChatPhotoCustomEmojiStickers(): TdlResult<Stickers> {
        val function = GetDefaultChatPhotoCustomEmojiStickers()
        return repository.send(function = function)
    }

    override suspend fun getDefaultEmojiStatuses(): TdlResult<EmojiStatusCustomEmojis> {
        val function = GetDefaultEmojiStatuses()
        return repository.send(function = function)
    }

    override suspend fun getDefaultMessageAutoDeleteTime(): TdlResult<MessageAutoDeleteTime> {
        val function = GetDefaultMessageAutoDeleteTime()
        return repository.send(function = function)
    }

    override suspend fun getDefaultProfilePhotoCustomEmojiStickers(): TdlResult<Stickers> {
        val function = GetDefaultProfilePhotoCustomEmojiStickers()
        return repository.send(function = function)
    }

    override suspend fun getDirectMessagesChatTopic(chatId: Long, topicId: Long): TdlResult<DirectMessagesChatTopic> {
        val function = GetDirectMessagesChatTopic(
            chatId = chatId,
            topicId = topicId,
        )
        return repository.send(function = function)
    }

    override suspend fun getDirectMessagesChatTopicHistory(
        chatId: Long,
        topicId: Long,
        fromMessageId: Long,
        offset: Int,
        limit: Int,
    ): TdlResult<Messages> {
        val function = GetDirectMessagesChatTopicHistory(
            chatId = chatId,
            topicId = topicId,
            fromMessageId = fromMessageId,
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getDirectMessagesChatTopicMessageByDate(
        chatId: Long,
        topicId: Long,
        date: Int,
    ): TdlResult<Message> {
        val function = GetDirectMessagesChatTopicMessageByDate(
            chatId = chatId,
            topicId = topicId,
            date = date,
        )
        return repository.send(function = function)
    }

    override suspend fun getDirectMessagesChatTopicRevenue(chatId: Long, topicId: Long): TdlResult<StarCount> {
        val function = GetDirectMessagesChatTopicRevenue(
            chatId = chatId,
            topicId = topicId,
        )
        return repository.send(function = function)
    }

    override suspend fun getDisallowedChatEmojiStatuses(): TdlResult<EmojiStatusCustomEmojis> {
        val function = GetDisallowedChatEmojiStatuses()
        return repository.send(function = function)
    }

    override suspend fun getEmojiCategories(type: EmojiCategoryType?): TdlResult<EmojiCategories> {
        val function = GetEmojiCategories(
            type = type,
        )
        return repository.send(function = function)
    }

    override suspend fun getEmojiReaction(emoji: String): TdlResult<EmojiReaction> {
        val function = GetEmojiReaction(
            emoji = emoji,
        )
        return repository.send(function = function)
    }

    override suspend fun getEmojiSuggestionsUrl(languageCode: String): TdlResult<HttpUrl> {
        val function = GetEmojiSuggestionsUrl(
            languageCode = languageCode,
        )
        return repository.send(function = function)
    }

    override suspend fun getExternalLink(link: String, allowWriteAccess: Boolean): TdlResult<HttpUrl> {
        val function = GetExternalLink(
            link = link,
            allowWriteAccess = allowWriteAccess,
        )
        return repository.send(function = function)
    }

    override suspend fun getExternalLinkInfo(link: String): TdlResult<LoginUrlInfo> {
        val function = GetExternalLinkInfo(
            link = link,
        )
        return repository.send(function = function)
    }

    override suspend fun getFavoriteStickers(): TdlResult<Stickers> {
        val function = GetFavoriteStickers()
        return repository.send(function = function)
    }

    override suspend fun getFile(fileId: Int): TdlResult<File> {
        val function = GetFile(
            fileId = fileId,
        )
        return repository.send(function = function)
    }

    override suspend fun getFileDownloadedPrefixSize(fileId: Int, offset: Long): TdlResult<FileDownloadedPrefixSize> {
        val function = GetFileDownloadedPrefixSize(
            fileId = fileId,
            offset = offset,
        )
        return repository.send(function = function)
    }

    override suspend fun getFileExtension(mimeType: String): TdlResult<Text> {
        val function = GetFileExtension(
            mimeType = mimeType,
        )
        return repository.send(function = function)
    }

    override suspend fun getFileMimeType(fileName: String): TdlResult<Text> {
        val function = GetFileMimeType(
            fileName = fileName,
        )
        return repository.send(function = function)
    }

    override suspend fun getForumTopic(chatId: Long, forumTopicId: Int): TdlResult<ForumTopic> {
        val function = GetForumTopic(
            chatId = chatId,
            forumTopicId = forumTopicId,
        )
        return repository.send(function = function)
    }

    override suspend fun getForumTopicDefaultIcons(): TdlResult<Stickers> {
        val function = GetForumTopicDefaultIcons()
        return repository.send(function = function)
    }

    override suspend fun getForumTopicHistory(
        chatId: Long,
        forumTopicId: Int,
        fromMessageId: Long,
        offset: Int,
        limit: Int,
    ): TdlResult<Messages> {
        val function = GetForumTopicHistory(
            chatId = chatId,
            forumTopicId = forumTopicId,
            fromMessageId = fromMessageId,
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getForumTopicLink(chatId: Long, forumTopicId: Int): TdlResult<MessageLink> {
        val function = GetForumTopicLink(
            chatId = chatId,
            forumTopicId = forumTopicId,
        )
        return repository.send(function = function)
    }

    override suspend fun getForumTopics(
        chatId: Long,
        query: String,
        offsetDate: Int,
        offsetMessageId: Long,
        offsetForumTopicId: Int,
        limit: Int,
    ): TdlResult<ForumTopics> {
        val function = GetForumTopics(
            chatId = chatId,
            query = query,
            offsetDate = offsetDate,
            offsetMessageId = offsetMessageId,
            offsetForumTopicId = offsetForumTopicId,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getGameHighScores(
        chatId: Long,
        messageId: Long,
        userId: Long,
    ): TdlResult<GameHighScores> {
        val function = GetGameHighScores(
            chatId = chatId,
            messageId = messageId,
            userId = userId,
        )
        return repository.send(function = function)
    }

    override suspend fun getGiftAuctionAcquiredGifts(giftId: Long): TdlResult<GiftAuctionAcquiredGifts> {
        val function = GetGiftAuctionAcquiredGifts(
            giftId = giftId,
        )
        return repository.send(function = function)
    }

    override suspend fun getGiftAuctionState(auctionId: String): TdlResult<GiftAuctionState> {
        val function = GetGiftAuctionState(
            auctionId = auctionId,
        )
        return repository.send(function = function)
    }

    override suspend fun getGiftChatThemes(offset: String, limit: Int): TdlResult<GiftChatThemes> {
        val function = GetGiftChatThemes(
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getGiftCollections(ownerId: MessageSender): TdlResult<GiftCollections> {
        val function = GetGiftCollections(
            ownerId = ownerId,
        )
        return repository.send(function = function)
    }

    override suspend fun getGiftUpgradePreview(giftId: Long): TdlResult<GiftUpgradePreview> {
        val function = GetGiftUpgradePreview(
            giftId = giftId,
        )
        return repository.send(function = function)
    }

    override suspend fun getGiveawayInfo(chatId: Long, messageId: Long): TdlResult<GiveawayInfo> {
        val function = GetGiveawayInfo(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function = function)
    }

    override suspend fun getGreetingStickers(): TdlResult<Stickers> {
        val function = GetGreetingStickers()
        return repository.send(function = function)
    }

    override suspend fun getGrossingWebAppBots(offset: String, limit: Int): TdlResult<FoundUsers> {
        val function = GetGrossingWebAppBots(
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getGroupCall(groupCallId: Int): TdlResult<GroupCall> {
        val function = GetGroupCall(
            groupCallId = groupCallId,
        )
        return repository.send(function = function)
    }

    override suspend fun getGroupCallParticipants(inputGroupCall: InputGroupCall, limit: Int): TdlResult<GroupCallParticipants> {
        val function = GetGroupCallParticipants(
            inputGroupCall = inputGroupCall,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getGroupCallStreamSegment(
        groupCallId: Int,
        timeOffset: Long,
        scale: Int,
        channelId: Int,
        videoQuality: GroupCallVideoQuality?,
    ): TdlResult<Data> {
        val function = GetGroupCallStreamSegment(
            groupCallId = groupCallId,
            timeOffset = timeOffset,
            scale = scale,
            channelId = channelId,
            videoQuality = videoQuality,
        )
        return repository.send(function = function)
    }

    override suspend fun getGroupCallStreams(groupCallId: Int): TdlResult<GroupCallStreams> {
        val function = GetGroupCallStreams(
            groupCallId = groupCallId,
        )
        return repository.send(function = function)
    }

    override suspend fun getGroupsInCommon(
        userId: Long,
        offsetChatId: Long,
        limit: Int,
    ): TdlResult<Chats> {
        val function = GetGroupsInCommon(
            userId = userId,
            offsetChatId = offsetChatId,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getImportedContactCount(): TdlResult<Count> {
        val function = GetImportedContactCount()
        return repository.send(function = function)
    }

    override suspend fun getInactiveSupergroupChats(): TdlResult<Chats> {
        val function = GetInactiveSupergroupChats()
        return repository.send(function = function)
    }

    override suspend fun getInlineGameHighScores(inlineMessageId: String, userId: Long): TdlResult<GameHighScores> {
        val function = GetInlineGameHighScores(
            inlineMessageId = inlineMessageId,
            userId = userId,
        )
        return repository.send(function = function)
    }

    override suspend fun getInlineQueryResults(
        botUserId: Long,
        chatId: Long,
        userLocation: Location?,
        query: String,
        offset: String,
    ): TdlResult<InlineQueryResults> {
        val function = GetInlineQueryResults(
            botUserId = botUserId,
            chatId = chatId,
            userLocation = userLocation,
            query = query,
            offset = offset,
        )
        return repository.send(function = function)
    }

    override suspend fun getInstalledBackgrounds(forDarkTheme: Boolean): TdlResult<Backgrounds> {
        val function = GetInstalledBackgrounds(
            forDarkTheme = forDarkTheme,
        )
        return repository.send(function = function)
    }

    override suspend fun getInstalledStickerSets(stickerType: StickerType): TdlResult<StickerSets> {
        val function = GetInstalledStickerSets(
            stickerType = stickerType,
        )
        return repository.send(function = function)
    }

    override suspend fun getInternalLink(type: InternalLinkType, isHttp: Boolean): TdlResult<HttpUrl> {
        val function = GetInternalLink(
            type = type,
            isHttp = isHttp,
        )
        return repository.send(function = function)
    }

    override suspend fun getInternalLinkType(link: String): TdlResult<InternalLinkType> {
        val function = GetInternalLinkType(
            link = link,
        )
        return repository.send(function = function)
    }

    override suspend fun getJsonString(jsonValue: JsonValue): TdlResult<Text> {
        val function = GetJsonString(
            jsonValue = jsonValue,
        )
        return repository.send(function = function)
    }

    override suspend fun getJsonValue(json: String): TdlResult<JsonValue> {
        val function = GetJsonValue(
            json = json,
        )
        return repository.send(function = function)
    }

    override suspend fun getKeywordEmojis(text: String, inputLanguageCodes: Array<String>): TdlResult<Emojis> {
        val function = GetKeywordEmojis(
            text = text,
            inputLanguageCodes = inputLanguageCodes,
        )
        return repository.send(function = function)
    }

    override suspend fun getLanguagePackInfo(languagePackId: String): TdlResult<LanguagePackInfo> {
        val function = GetLanguagePackInfo(
            languagePackId = languagePackId,
        )
        return repository.send(function = function)
    }

    override suspend fun getLanguagePackString(
        languagePackDatabasePath: String,
        localizationTarget: String,
        languagePackId: String,
        key: String,
    ): TdlResult<LanguagePackStringValue> {
        val function = GetLanguagePackString(
            languagePackDatabasePath = languagePackDatabasePath,
            localizationTarget = localizationTarget,
            languagePackId = languagePackId,
            key = key,
        )
        return repository.send(function = function)
    }

    override suspend fun getLanguagePackStrings(languagePackId: String, keys: Array<String>): TdlResult<LanguagePackStrings> {
        val function = GetLanguagePackStrings(
            languagePackId = languagePackId,
            keys = keys,
        )
        return repository.send(function = function)
    }

    override suspend fun getLinkPreview(text: FormattedText, linkPreviewOptions: LinkPreviewOptions?): TdlResult<LinkPreview> {
        val function = GetLinkPreview(
            text = text,
            linkPreviewOptions = linkPreviewOptions,
        )
        return repository.send(function = function)
    }

    override suspend fun getLiveStoryAvailableMessageSenders(groupCallId: Int): TdlResult<ChatMessageSenders> {
        val function = GetLiveStoryAvailableMessageSenders(
            groupCallId = groupCallId,
        )
        return repository.send(function = function)
    }

    override suspend fun getLiveStoryRtmpUrl(chatId: Long): TdlResult<RtmpUrl> {
        val function = GetLiveStoryRtmpUrl(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun getLiveStoryStreamer(groupCallId: Int): TdlResult<GroupCallParticipant> {
        val function = GetLiveStoryStreamer(
            groupCallId = groupCallId,
        )
        return repository.send(function = function)
    }

    override suspend fun getLiveStoryTopDonors(groupCallId: Int): TdlResult<LiveStoryDonors> {
        val function = GetLiveStoryTopDonors(
            groupCallId = groupCallId,
        )
        return repository.send(function = function)
    }

    override suspend fun getLocalizationTargetInfo(onlyLocal: Boolean): TdlResult<LocalizationTargetInfo> {
        val function = GetLocalizationTargetInfo(
            onlyLocal = onlyLocal,
        )
        return repository.send(function = function)
    }

    override suspend fun getLogStream(): TdlResult<LogStream> {
        val function = GetLogStream()
        return repository.send(function = function)
    }

    override suspend fun getLogTagVerbosityLevel(tag: String): TdlResult<LogVerbosityLevel> {
        val function = GetLogTagVerbosityLevel(
            tag = tag,
        )
        return repository.send(function = function)
    }

    override suspend fun getLogTags(): TdlResult<LogTags> {
        val function = GetLogTags()
        return repository.send(function = function)
    }

    override suspend fun getLogVerbosityLevel(): TdlResult<LogVerbosityLevel> {
        val function = GetLogVerbosityLevel()
        return repository.send(function = function)
    }

    override suspend fun getLoginUrl(
        chatId: Long,
        messageId: Long,
        buttonId: Long,
        allowWriteAccess: Boolean,
    ): TdlResult<HttpUrl> {
        val function = GetLoginUrl(
            chatId = chatId,
            messageId = messageId,
            buttonId = buttonId,
            allowWriteAccess = allowWriteAccess,
        )
        return repository.send(function = function)
    }

    override suspend fun getLoginUrlInfo(
        chatId: Long,
        messageId: Long,
        buttonId: Long,
    ): TdlResult<LoginUrlInfo> {
        val function = GetLoginUrlInfo(
            chatId = chatId,
            messageId = messageId,
            buttonId = buttonId,
        )
        return repository.send(function = function)
    }

    override suspend fun getMainWebApp(
        chatId: Long,
        botUserId: Long,
        startParameter: String,
        parameters: WebAppOpenParameters,
    ): TdlResult<MainWebApp> {
        val function = GetMainWebApp(
            chatId = chatId,
            botUserId = botUserId,
            startParameter = startParameter,
            parameters = parameters,
        )
        return repository.send(function = function)
    }

    override suspend fun getMapThumbnailFile(
        location: Location,
        zoom: Int,
        width: Int,
        height: Int,
        scale: Int,
        chatId: Long,
    ): TdlResult<File> {
        val function = GetMapThumbnailFile(
            location = location,
            zoom = zoom,
            width = width,
            height = height,
            scale = scale,
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun getMarkdownText(text: FormattedText): TdlResult<FormattedText> {
        val function = GetMarkdownText(
            text = text,
        )
        return repository.send(function = function)
    }

    override suspend fun getMe(): TdlResult<User> {
        val function = GetMe()
        return repository.send(function = function)
    }

    override suspend fun getMenuButton(userId: Long): TdlResult<BotMenuButton> {
        val function = GetMenuButton(
            userId = userId,
        )
        return repository.send(function = function)
    }

    override suspend fun getMessage(chatId: Long, messageId: Long): TdlResult<Message> {
        val function = GetMessage(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function = function)
    }

    override suspend fun getMessageAddedReactions(
        chatId: Long,
        messageId: Long,
        reactionType: ReactionType?,
        offset: String,
        limit: Int,
    ): TdlResult<AddedReactions> {
        val function = GetMessageAddedReactions(
            chatId = chatId,
            messageId = messageId,
            reactionType = reactionType,
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getMessageAuthor(chatId: Long, messageId: Long): TdlResult<User> {
        val function = GetMessageAuthor(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function = function)
    }

    override suspend fun getMessageAvailableReactions(
        chatId: Long,
        messageId: Long,
        rowSize: Int,
    ): TdlResult<AvailableReactions> {
        val function = GetMessageAvailableReactions(
            chatId = chatId,
            messageId = messageId,
            rowSize = rowSize,
        )
        return repository.send(function = function)
    }

    override suspend fun getMessageEffect(effectId: Long): TdlResult<MessageEffect> {
        val function = GetMessageEffect(
            effectId = effectId,
        )
        return repository.send(function = function)
    }

    override suspend fun getMessageEmbeddingCode(
        chatId: Long,
        messageId: Long,
        forAlbum: Boolean,
    ): TdlResult<Text> {
        val function = GetMessageEmbeddingCode(
            chatId = chatId,
            messageId = messageId,
            forAlbum = forAlbum,
        )
        return repository.send(function = function)
    }

    override suspend fun getMessageFileType(messageFileHead: String): TdlResult<MessageFileType> {
        val function = GetMessageFileType(
            messageFileHead = messageFileHead,
        )
        return repository.send(function = function)
    }

    override suspend fun getMessageImportConfirmationText(chatId: Long): TdlResult<Text> {
        val function = GetMessageImportConfirmationText(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun getMessageLink(
        chatId: Long,
        messageId: Long,
        mediaTimestamp: Int,
        forAlbum: Boolean,
        inMessageThread: Boolean,
    ): TdlResult<MessageLink> {
        val function = GetMessageLink(
            chatId = chatId,
            messageId = messageId,
            mediaTimestamp = mediaTimestamp,
            forAlbum = forAlbum,
            inMessageThread = inMessageThread,
        )
        return repository.send(function = function)
    }

    override suspend fun getMessageLinkInfo(url: String): TdlResult<MessageLinkInfo> {
        val function = GetMessageLinkInfo(
            url = url,
        )
        return repository.send(function = function)
    }

    override suspend fun getMessageLocally(chatId: Long, messageId: Long): TdlResult<Message> {
        val function = GetMessageLocally(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function = function)
    }

    override suspend fun getMessageProperties(chatId: Long, messageId: Long): TdlResult<MessageProperties> {
        val function = GetMessageProperties(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function = function)
    }

    override suspend fun getMessagePublicForwards(
        chatId: Long,
        messageId: Long,
        offset: String,
        limit: Int,
    ): TdlResult<PublicForwards> {
        val function = GetMessagePublicForwards(
            chatId = chatId,
            messageId = messageId,
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getMessageReadDate(chatId: Long, messageId: Long): TdlResult<MessageReadDate> {
        val function = GetMessageReadDate(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function = function)
    }

    override suspend fun getMessageStatistics(
        chatId: Long,
        messageId: Long,
        isDark: Boolean,
    ): TdlResult<MessageStatistics> {
        val function = GetMessageStatistics(
            chatId = chatId,
            messageId = messageId,
            isDark = isDark,
        )
        return repository.send(function = function)
    }

    override suspend fun getMessageThread(chatId: Long, messageId: Long): TdlResult<MessageThreadInfo> {
        val function = GetMessageThread(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function = function)
    }

    override suspend fun getMessageThreadHistory(
        chatId: Long,
        messageId: Long,
        fromMessageId: Long,
        offset: Int,
        limit: Int,
    ): TdlResult<Messages> {
        val function = GetMessageThreadHistory(
            chatId = chatId,
            messageId = messageId,
            fromMessageId = fromMessageId,
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getMessageViewers(chatId: Long, messageId: Long): TdlResult<MessageViewers> {
        val function = GetMessageViewers(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function = function)
    }

    override suspend fun getMessages(chatId: Long, messageIds: LongArray): TdlResult<Messages> {
        val function = GetMessages(
            chatId = chatId,
            messageIds = messageIds,
        )
        return repository.send(function = function)
    }

    override suspend fun getNetworkStatistics(onlyCurrent: Boolean): TdlResult<NetworkStatistics> {
        val function = GetNetworkStatistics(
            onlyCurrent = onlyCurrent,
        )
        return repository.send(function = function)
    }

    override suspend fun getNewChatPrivacySettings(): TdlResult<NewChatPrivacySettings> {
        val function = GetNewChatPrivacySettings()
        return repository.send(function = function)
    }

    override suspend fun getOption(name: String): TdlResult<OptionValue> {
        val function = GetOption(
            name = name,
        )
        return repository.send(function = function)
    }

    override suspend fun getOwnedBots(): TdlResult<Users> {
        val function = GetOwnedBots()
        return repository.send(function = function)
    }

    override suspend fun getOwnedStickerSets(offsetStickerSetId: Long, limit: Int): TdlResult<StickerSets> {
        val function = GetOwnedStickerSets(
            offsetStickerSetId = offsetStickerSetId,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getPaidMessageRevenue(userId: Long): TdlResult<StarCount> {
        val function = GetPaidMessageRevenue(
            userId = userId,
        )
        return repository.send(function = function)
    }

    override suspend fun getPassportAuthorizationForm(
        botUserId: Long,
        scope: String,
        publicKey: String,
        nonce: String,
    ): TdlResult<PassportAuthorizationForm> {
        val function = GetPassportAuthorizationForm(
            botUserId = botUserId,
            scope = scope,
            publicKey = publicKey,
            nonce = nonce,
        )
        return repository.send(function = function)
    }

    override suspend fun getPassportAuthorizationFormAvailableElements(authorizationFormId: Int, password: String): TdlResult<PassportElementsWithErrors> {
        val function = GetPassportAuthorizationFormAvailableElements(
            authorizationFormId = authorizationFormId,
            password = password,
        )
        return repository.send(function = function)
    }

    override suspend fun getPassportElement(type: PassportElementType, password: String): TdlResult<PassportElement> {
        val function = GetPassportElement(
            type = type,
            password = password,
        )
        return repository.send(function = function)
    }

    override suspend fun getPasswordState(): TdlResult<PasswordState> {
        val function = GetPasswordState()
        return repository.send(function = function)
    }

    override suspend fun getPaymentForm(inputInvoice: InputInvoice, theme: ThemeParameters?): TdlResult<PaymentForm> {
        val function = GetPaymentForm(
            inputInvoice = inputInvoice,
            theme = theme,
        )
        return repository.send(function = function)
    }

    override suspend fun getPaymentReceipt(chatId: Long, messageId: Long): TdlResult<PaymentReceipt> {
        val function = GetPaymentReceipt(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function = function)
    }

    override suspend fun getPhoneNumberInfo(phoneNumberPrefix: String): TdlResult<PhoneNumberInfo> {
        val function = GetPhoneNumberInfo(
            phoneNumberPrefix = phoneNumberPrefix,
        )
        return repository.send(function = function)
    }

    override suspend fun getPhoneNumberInfoSync(languageCode: String, phoneNumberPrefix: String): TdlResult<PhoneNumberInfo> {
        val function = GetPhoneNumberInfoSync(
            languageCode = languageCode,
            phoneNumberPrefix = phoneNumberPrefix,
        )
        return repository.send(function = function)
    }

    override suspend fun getPollVoters(
        chatId: Long,
        messageId: Long,
        optionId: Int,
        offset: Int,
        limit: Int,
    ): TdlResult<MessageSenders> {
        val function = GetPollVoters(
            chatId = chatId,
            messageId = messageId,
            optionId = optionId,
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getPreferredCountryLanguage(countryCode: String): TdlResult<Text> {
        val function = GetPreferredCountryLanguage(
            countryCode = countryCode,
        )
        return repository.send(function = function)
    }

    override suspend fun getPremiumFeatures(source: PremiumSource?): TdlResult<PremiumFeatures> {
        val function = GetPremiumFeatures(
            source = source,
        )
        return repository.send(function = function)
    }

    override suspend fun getPremiumGiftPaymentOptions(): TdlResult<PremiumGiftPaymentOptions> {
        val function = GetPremiumGiftPaymentOptions()
        return repository.send(function = function)
    }

    override suspend fun getPremiumGiveawayPaymentOptions(boostedChatId: Long): TdlResult<PremiumGiveawayPaymentOptions> {
        val function = GetPremiumGiveawayPaymentOptions(
            boostedChatId = boostedChatId,
        )
        return repository.send(function = function)
    }

    override suspend fun getPremiumInfoSticker(monthCount: Int): TdlResult<Sticker> {
        val function = GetPremiumInfoSticker(
            monthCount = monthCount,
        )
        return repository.send(function = function)
    }

    override suspend fun getPremiumLimit(limitType: PremiumLimitType): TdlResult<PremiumLimit> {
        val function = GetPremiumLimit(
            limitType = limitType,
        )
        return repository.send(function = function)
    }

    override suspend fun getPremiumState(): TdlResult<PremiumState> {
        val function = GetPremiumState()
        return repository.send(function = function)
    }

    override suspend fun getPremiumStickerExamples(): TdlResult<Stickers> {
        val function = GetPremiumStickerExamples()
        return repository.send(function = function)
    }

    override suspend fun getPremiumStickers(limit: Int): TdlResult<Stickers> {
        val function = GetPremiumStickers(
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getPreparedInlineMessage(botUserId: Long, preparedMessageId: String): TdlResult<PreparedInlineMessage> {
        val function = GetPreparedInlineMessage(
            botUserId = botUserId,
            preparedMessageId = preparedMessageId,
        )
        return repository.send(function = function)
    }

    override suspend fun getProxies(): TdlResult<Proxies> {
        val function = GetProxies()
        return repository.send(function = function)
    }

    override suspend fun getProxyLink(proxyId: Int): TdlResult<HttpUrl> {
        val function = GetProxyLink(
            proxyId = proxyId,
        )
        return repository.send(function = function)
    }

    override suspend fun getPublicPostSearchLimits(query: String): TdlResult<PublicPostSearchLimits> {
        val function = GetPublicPostSearchLimits(
            query = query,
        )
        return repository.send(function = function)
    }

    override suspend fun getPushReceiverId(payload: String): TdlResult<PushReceiverId> {
        val function = GetPushReceiverId(
            payload = payload,
        )
        return repository.send(function = function)
    }

    override suspend fun getReadDatePrivacySettings(): TdlResult<ReadDatePrivacySettings> {
        val function = GetReadDatePrivacySettings()
        return repository.send(function = function)
    }

    override suspend fun getReceivedGift(receivedGiftId: String): TdlResult<ReceivedGift> {
        val function = GetReceivedGift(
            receivedGiftId = receivedGiftId,
        )
        return repository.send(function = function)
    }

    override suspend fun getReceivedGifts(
        businessConnectionId: String,
        ownerId: MessageSender,
        collectionId: Int,
        excludeUnsaved: Boolean,
        excludeSaved: Boolean,
        excludeUnlimited: Boolean,
        excludeUpgradable: Boolean,
        excludeNonUpgradable: Boolean,
        excludeUpgraded: Boolean,
        excludeWithoutColors: Boolean,
        excludeHosted: Boolean,
        sortByPrice: Boolean,
        offset: String,
        limit: Int,
    ): TdlResult<ReceivedGifts> {
        val function = GetReceivedGifts(
            businessConnectionId = businessConnectionId,
            ownerId = ownerId,
            collectionId = collectionId,
            excludeUnsaved = excludeUnsaved,
            excludeSaved = excludeSaved,
            excludeUnlimited = excludeUnlimited,
            excludeUpgradable = excludeUpgradable,
            excludeNonUpgradable = excludeNonUpgradable,
            excludeUpgraded = excludeUpgraded,
            excludeWithoutColors = excludeWithoutColors,
            excludeHosted = excludeHosted,
            sortByPrice = sortByPrice,
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getRecentEmojiStatuses(): TdlResult<EmojiStatuses> {
        val function = GetRecentEmojiStatuses()
        return repository.send(function = function)
    }

    override suspend fun getRecentInlineBots(): TdlResult<Users> {
        val function = GetRecentInlineBots()
        return repository.send(function = function)
    }

    override suspend fun getRecentStickers(isAttached: Boolean): TdlResult<Stickers> {
        val function = GetRecentStickers(
            isAttached = isAttached,
        )
        return repository.send(function = function)
    }

    override suspend fun getRecentlyOpenedChats(limit: Int): TdlResult<Chats> {
        val function = GetRecentlyOpenedChats(
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getRecentlyVisitedTMeUrls(referrer: String): TdlResult<TMeUrls> {
        val function = GetRecentlyVisitedTMeUrls(
            referrer = referrer,
        )
        return repository.send(function = function)
    }

    override suspend fun getRecommendedChatFolders(): TdlResult<RecommendedChatFolders> {
        val function = GetRecommendedChatFolders()
        return repository.send(function = function)
    }

    override suspend fun getRecommendedChats(): TdlResult<Chats> {
        val function = GetRecommendedChats()
        return repository.send(function = function)
    }

    override suspend fun getRecoveryEmailAddress(password: String): TdlResult<RecoveryEmailAddress> {
        val function = GetRecoveryEmailAddress(
            password = password,
        )
        return repository.send(function = function)
    }

    override suspend fun getRemoteFile(remoteFileId: String, fileType: FileType?): TdlResult<File> {
        val function = GetRemoteFile(
            remoteFileId = remoteFileId,
            fileType = fileType,
        )
        return repository.send(function = function)
    }

    override suspend fun getRepliedMessage(chatId: Long, messageId: Long): TdlResult<Message> {
        val function = GetRepliedMessage(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function = function)
    }

    override suspend fun getSavedAnimations(): TdlResult<Animations> {
        val function = GetSavedAnimations()
        return repository.send(function = function)
    }

    override suspend fun getSavedMessagesTags(savedMessagesTopicId: Long): TdlResult<SavedMessagesTags> {
        val function = GetSavedMessagesTags(
            savedMessagesTopicId = savedMessagesTopicId,
        )
        return repository.send(function = function)
    }

    override suspend fun getSavedMessagesTopicHistory(
        savedMessagesTopicId: Long,
        fromMessageId: Long,
        offset: Int,
        limit: Int,
    ): TdlResult<Messages> {
        val function = GetSavedMessagesTopicHistory(
            savedMessagesTopicId = savedMessagesTopicId,
            fromMessageId = fromMessageId,
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getSavedMessagesTopicMessageByDate(savedMessagesTopicId: Long, date: Int): TdlResult<Message> {
        val function = GetSavedMessagesTopicMessageByDate(
            savedMessagesTopicId = savedMessagesTopicId,
            date = date,
        )
        return repository.send(function = function)
    }

    override suspend fun getSavedNotificationSound(notificationSoundId: Long): TdlResult<NotificationSounds> {
        val function = GetSavedNotificationSound(
            notificationSoundId = notificationSoundId,
        )
        return repository.send(function = function)
    }

    override suspend fun getSavedNotificationSounds(): TdlResult<NotificationSounds> {
        val function = GetSavedNotificationSounds()
        return repository.send(function = function)
    }

    override suspend fun getSavedOrderInfo(): TdlResult<OrderInfo> {
        val function = GetSavedOrderInfo()
        return repository.send(function = function)
    }

    override suspend fun getScopeNotificationSettings(scope: NotificationSettingsScope): TdlResult<ScopeNotificationSettings> {
        val function = GetScopeNotificationSettings(
            scope = scope,
        )
        return repository.send(function = function)
    }

    override suspend fun getSearchSponsoredChats(query: String): TdlResult<SponsoredChats> {
        val function = GetSearchSponsoredChats(
            query = query,
        )
        return repository.send(function = function)
    }

    override suspend fun getSearchedForTags(tagPrefix: String, limit: Int): TdlResult<Hashtags> {
        val function = GetSearchedForTags(
            tagPrefix = tagPrefix,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getSecretChat(secretChatId: Int): TdlResult<SecretChat> {
        val function = GetSecretChat(
            secretChatId = secretChatId,
        )
        return repository.send(function = function)
    }

    override suspend fun getStarAdAccountUrl(ownerId: MessageSender): TdlResult<HttpUrl> {
        val function = GetStarAdAccountUrl(
            ownerId = ownerId,
        )
        return repository.send(function = function)
    }

    override suspend fun getStarGiftPaymentOptions(userId: Long): TdlResult<StarPaymentOptions> {
        val function = GetStarGiftPaymentOptions(
            userId = userId,
        )
        return repository.send(function = function)
    }

    override suspend fun getStarGiveawayPaymentOptions(): TdlResult<StarGiveawayPaymentOptions> {
        val function = GetStarGiveawayPaymentOptions()
        return repository.send(function = function)
    }

    override suspend fun getStarPaymentOptions(): TdlResult<StarPaymentOptions> {
        val function = GetStarPaymentOptions()
        return repository.send(function = function)
    }

    override suspend fun getStarRevenueStatistics(ownerId: MessageSender, isDark: Boolean): TdlResult<StarRevenueStatistics> {
        val function = GetStarRevenueStatistics(
            ownerId = ownerId,
            isDark = isDark,
        )
        return repository.send(function = function)
    }

    override suspend fun getStarSubscriptions(onlyExpiring: Boolean, offset: String): TdlResult<StarSubscriptions> {
        val function = GetStarSubscriptions(
            onlyExpiring = onlyExpiring,
            offset = offset,
        )
        return repository.send(function = function)
    }

    override suspend fun getStarTransactions(
        ownerId: MessageSender,
        subscriptionId: String,
        direction: TransactionDirection?,
        offset: String,
        limit: Int,
    ): TdlResult<StarTransactions> {
        val function = GetStarTransactions(
            ownerId = ownerId,
            subscriptionId = subscriptionId,
            direction = direction,
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getStarWithdrawalUrl(
        ownerId: MessageSender,
        starCount: Long,
        password: String,
    ): TdlResult<HttpUrl> {
        val function = GetStarWithdrawalUrl(
            ownerId = ownerId,
            starCount = starCount,
            password = password,
        )
        return repository.send(function = function)
    }

    override suspend fun getStatisticalGraph(
        chatId: Long,
        token: String,
        x: Long,
    ): TdlResult<StatisticalGraph> {
        val function = GetStatisticalGraph(
            chatId = chatId,
            token = token,
            x = x,
        )
        return repository.send(function = function)
    }

    override suspend fun getStickerEmojis(sticker: InputFile): TdlResult<Emojis> {
        val function = GetStickerEmojis(
            sticker = sticker,
        )
        return repository.send(function = function)
    }

    override suspend fun getStickerOutline(
        stickerFileId: Int,
        forAnimatedEmoji: Boolean,
        forClickedAnimatedEmojiMessage: Boolean,
    ): TdlResult<Outline> {
        val function = GetStickerOutline(
            stickerFileId = stickerFileId,
            forAnimatedEmoji = forAnimatedEmoji,
            forClickedAnimatedEmojiMessage = forClickedAnimatedEmojiMessage,
        )
        return repository.send(function = function)
    }

    override suspend fun getStickerSet(setId: Long): TdlResult<StickerSet> {
        val function = GetStickerSet(
            setId = setId,
        )
        return repository.send(function = function)
    }

    override suspend fun getStickerSetName(setId: Long): TdlResult<Text> {
        val function = GetStickerSetName(
            setId = setId,
        )
        return repository.send(function = function)
    }

    override suspend fun getStickers(
        stickerType: StickerType,
        query: String,
        limit: Int,
        chatId: Long,
    ): TdlResult<Stickers> {
        val function = GetStickers(
            stickerType = stickerType,
            query = query,
            limit = limit,
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun getStorageStatistics(chatLimit: Int): TdlResult<StorageStatistics> {
        val function = GetStorageStatistics(
            chatLimit = chatLimit,
        )
        return repository.send(function = function)
    }

    override suspend fun getStorageStatisticsFast(): TdlResult<StorageStatisticsFast> {
        val function = GetStorageStatisticsFast()
        return repository.send(function = function)
    }

    override suspend fun getStory(
        storyPosterChatId: Long,
        storyId: Int,
        onlyLocal: Boolean,
    ): TdlResult<Story> {
        val function = GetStory(
            storyPosterChatId = storyPosterChatId,
            storyId = storyId,
            onlyLocal = onlyLocal,
        )
        return repository.send(function = function)
    }

    override suspend fun getStoryAlbumStories(
        chatId: Long,
        storyAlbumId: Int,
        offset: Int,
        limit: Int,
    ): TdlResult<Stories> {
        val function = GetStoryAlbumStories(
            chatId = chatId,
            storyAlbumId = storyAlbumId,
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getStoryAvailableReactions(rowSize: Int): TdlResult<AvailableReactions> {
        val function = GetStoryAvailableReactions(
            rowSize = rowSize,
        )
        return repository.send(function = function)
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
        val function = GetStoryInteractions(
            storyId = storyId,
            query = query,
            onlyContacts = onlyContacts,
            preferForwards = preferForwards,
            preferWithReaction = preferWithReaction,
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getStoryNotificationSettingsExceptions(): TdlResult<Chats> {
        val function = GetStoryNotificationSettingsExceptions()
        return repository.send(function = function)
    }

    override suspend fun getStoryPublicForwards(
        storyPosterChatId: Long,
        storyId: Int,
        offset: String,
        limit: Int,
    ): TdlResult<PublicForwards> {
        val function = GetStoryPublicForwards(
            storyPosterChatId = storyPosterChatId,
            storyId = storyId,
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getStoryStatistics(
        chatId: Long,
        storyId: Int,
        isDark: Boolean,
    ): TdlResult<StoryStatistics> {
        val function = GetStoryStatistics(
            chatId = chatId,
            storyId = storyId,
            isDark = isDark,
        )
        return repository.send(function = function)
    }

    override suspend fun getSuggestedFileName(fileId: Int, directory: String): TdlResult<Text> {
        val function = GetSuggestedFileName(
            fileId = fileId,
            directory = directory,
        )
        return repository.send(function = function)
    }

    override suspend fun getSuggestedStickerSetName(title: String): TdlResult<Text> {
        val function = GetSuggestedStickerSetName(
            title = title,
        )
        return repository.send(function = function)
    }

    override suspend fun getSuitableDiscussionChats(): TdlResult<Chats> {
        val function = GetSuitableDiscussionChats()
        return repository.send(function = function)
    }

    override suspend fun getSuitablePersonalChats(): TdlResult<Chats> {
        val function = GetSuitablePersonalChats()
        return repository.send(function = function)
    }

    override suspend fun getSupergroup(supergroupId: Long): TdlResult<Supergroup> {
        val function = GetSupergroup(
            supergroupId = supergroupId,
        )
        return repository.send(function = function)
    }

    override suspend fun getSupergroupFullInfo(supergroupId: Long): TdlResult<SupergroupFullInfo> {
        val function = GetSupergroupFullInfo(
            supergroupId = supergroupId,
        )
        return repository.send(function = function)
    }

    override suspend fun getSupergroupMembers(
        supergroupId: Long,
        filter: SupergroupMembersFilter?,
        offset: Int,
        limit: Int,
    ): TdlResult<ChatMembers> {
        val function = GetSupergroupMembers(
            supergroupId = supergroupId,
            filter = filter,
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getSupportName(): TdlResult<Text> {
        val function = GetSupportName()
        return repository.send(function = function)
    }

    override suspend fun getSupportUser(): TdlResult<User> {
        val function = GetSupportUser()
        return repository.send(function = function)
    }

    override suspend fun getTemporaryPasswordState(): TdlResult<TemporaryPasswordState> {
        val function = GetTemporaryPasswordState()
        return repository.send(function = function)
    }

    override suspend fun getTextEntities(text: String): TdlResult<TextEntities> {
        val function = GetTextEntities(
            text = text,
        )
        return repository.send(function = function)
    }

    override suspend fun getThemeParametersJsonString(theme: ThemeParameters): TdlResult<Text> {
        val function = GetThemeParametersJsonString(
            theme = theme,
        )
        return repository.send(function = function)
    }

    override suspend fun getThemedChatEmojiStatuses(): TdlResult<EmojiStatusCustomEmojis> {
        val function = GetThemedChatEmojiStatuses()
        return repository.send(function = function)
    }

    override suspend fun getThemedEmojiStatuses(): TdlResult<EmojiStatusCustomEmojis> {
        val function = GetThemedEmojiStatuses()
        return repository.send(function = function)
    }

    override suspend fun getTimeZones(): TdlResult<TimeZones> {
        val function = GetTimeZones()
        return repository.send(function = function)
    }

    override suspend fun getTonRevenueStatistics(isDark: Boolean): TdlResult<TonRevenueStatistics> {
        val function = GetTonRevenueStatistics(
            isDark = isDark,
        )
        return repository.send(function = function)
    }

    override suspend fun getTonTransactions(
        direction: TransactionDirection?,
        offset: String,
        limit: Int,
    ): TdlResult<TonTransactions> {
        val function = GetTonTransactions(
            direction = direction,
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getTonWithdrawalUrl(password: String): TdlResult<HttpUrl> {
        val function = GetTonWithdrawalUrl(
            password = password,
        )
        return repository.send(function = function)
    }

    override suspend fun getTopChats(category: TopChatCategory, limit: Int): TdlResult<Chats> {
        val function = GetTopChats(
            category = category,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getTrendingStickerSets(
        stickerType: StickerType,
        offset: Int,
        limit: Int,
    ): TdlResult<TrendingStickerSets> {
        val function = GetTrendingStickerSets(
            stickerType = stickerType,
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getUpgradedGift(name: String): TdlResult<UpgradedGift> {
        val function = GetUpgradedGift(
            name = name,
        )
        return repository.send(function = function)
    }

    override suspend fun getUpgradedGiftEmojiStatuses(): TdlResult<EmojiStatuses> {
        val function = GetUpgradedGiftEmojiStatuses()
        return repository.send(function = function)
    }

    override suspend fun getUpgradedGiftValueInfo(name: String): TdlResult<UpgradedGiftValueInfo> {
        val function = GetUpgradedGiftValueInfo(
            name = name,
        )
        return repository.send(function = function)
    }

    override suspend fun getUpgradedGiftWithdrawalUrl(receivedGiftId: String, password: String): TdlResult<HttpUrl> {
        val function = GetUpgradedGiftWithdrawalUrl(
            receivedGiftId = receivedGiftId,
            password = password,
        )
        return repository.send(function = function)
    }

    override suspend fun getUser(userId: Long): TdlResult<User> {
        val function = GetUser(
            userId = userId,
        )
        return repository.send(function = function)
    }

    override suspend fun getUserChatBoosts(chatId: Long, userId: Long): TdlResult<FoundChatBoosts> {
        val function = GetUserChatBoosts(
            chatId = chatId,
            userId = userId,
        )
        return repository.send(function = function)
    }

    override suspend fun getUserFullInfo(userId: Long): TdlResult<UserFullInfo> {
        val function = GetUserFullInfo(
            userId = userId,
        )
        return repository.send(function = function)
    }

    override suspend fun getUserLink(): TdlResult<UserLink> {
        val function = GetUserLink()
        return repository.send(function = function)
    }

    override suspend fun getUserPrivacySettingRules(setting: UserPrivacySetting): TdlResult<UserPrivacySettingRules> {
        val function = GetUserPrivacySettingRules(
            setting = setting,
        )
        return repository.send(function = function)
    }

    override suspend fun getUserProfileAudios(
        userId: Long,
        offset: Int,
        limit: Int,
    ): TdlResult<Audios> {
        val function = GetUserProfileAudios(
            userId = userId,
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getUserProfilePhotos(
        userId: Long,
        offset: Int,
        limit: Int,
    ): TdlResult<ChatPhotos> {
        val function = GetUserProfilePhotos(
            userId = userId,
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun getUserSupportInfo(userId: Long): TdlResult<UserSupportInfo> {
        val function = GetUserSupportInfo(
            userId = userId,
        )
        return repository.send(function = function)
    }

    override suspend fun getVideoChatAvailableParticipants(chatId: Long): TdlResult<MessageSenders> {
        val function = GetVideoChatAvailableParticipants(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun getVideoChatInviteLink(groupCallId: Int, canSelfUnmute: Boolean): TdlResult<HttpUrl> {
        val function = GetVideoChatInviteLink(
            groupCallId = groupCallId,
            canSelfUnmute = canSelfUnmute,
        )
        return repository.send(function = function)
    }

    override suspend fun getVideoChatRtmpUrl(chatId: Long): TdlResult<RtmpUrl> {
        val function = GetVideoChatRtmpUrl(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun getVideoMessageAdvertisements(chatId: Long, messageId: Long): TdlResult<VideoMessageAdvertisements> {
        val function = GetVideoMessageAdvertisements(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function = function)
    }

    override suspend fun getWebAppLinkUrl(
        chatId: Long,
        botUserId: Long,
        webAppShortName: String,
        startParameter: String,
        allowWriteAccess: Boolean,
        parameters: WebAppOpenParameters,
    ): TdlResult<HttpUrl> {
        val function = GetWebAppLinkUrl(
            chatId = chatId,
            botUserId = botUserId,
            webAppShortName = webAppShortName,
            startParameter = startParameter,
            allowWriteAccess = allowWriteAccess,
            parameters = parameters,
        )
        return repository.send(function = function)
    }

    override suspend fun getWebAppPlaceholder(botUserId: Long): TdlResult<Outline> {
        val function = GetWebAppPlaceholder(
            botUserId = botUserId,
        )
        return repository.send(function = function)
    }

    override suspend fun getWebAppUrl(
        botUserId: Long,
        url: String,
        parameters: WebAppOpenParameters,
    ): TdlResult<HttpUrl> {
        val function = GetWebAppUrl(
            botUserId = botUserId,
            url = url,
            parameters = parameters,
        )
        return repository.send(function = function)
    }

    override suspend fun getWebPageInstantView(url: String, onlyLocal: Boolean): TdlResult<WebPageInstantView> {
        val function = GetWebPageInstantView(
            url = url,
            onlyLocal = onlyLocal,
        )
        return repository.send(function = function)
    }

    override suspend fun giftPremiumWithStars(
        userId: Long,
        starCount: Long,
        monthCount: Int,
        text: FormattedText,
    ): TdlResult<Ok> {
        val function = GiftPremiumWithStars(
            userId = userId,
            starCount = starCount,
            monthCount = monthCount,
            text = text,
        )
        return repository.send(function = function)
    }

    override suspend fun hideContactCloseBirthdays(): TdlResult<Ok> {
        val function = HideContactCloseBirthdays()
        return repository.send(function = function)
    }

    override suspend fun hideSuggestedAction(action: SuggestedAction): TdlResult<Ok> {
        val function = HideSuggestedAction(
            action = action,
        )
        return repository.send(function = function)
    }

    override suspend fun importContacts(contacts: Array<ImportedContact>): TdlResult<ImportedContacts> {
        val function = ImportContacts(
            contacts = contacts,
        )
        return repository.send(function = function)
    }

    override suspend fun importMessages(
        chatId: Long,
        messageFile: InputFile,
        attachedFiles: Array<InputFile>,
    ): TdlResult<Ok> {
        val function = ImportMessages(
            chatId = chatId,
            messageFile = messageFile,
            attachedFiles = attachedFiles,
        )
        return repository.send(function = function)
    }

    override suspend fun increaseGiftAuctionBid(giftId: Long, starCount: Long): TdlResult<Ok> {
        val function = IncreaseGiftAuctionBid(
            giftId = giftId,
            starCount = starCount,
        )
        return repository.send(function = function)
    }

    override suspend fun inviteGroupCallParticipant(
        groupCallId: Int,
        userId: Long,
        isVideo: Boolean,
    ): TdlResult<InviteGroupCallParticipantResult> {
        val function = InviteGroupCallParticipant(
            groupCallId = groupCallId,
            userId = userId,
            isVideo = isVideo,
        )
        return repository.send(function = function)
    }

    override suspend fun inviteVideoChatParticipants(groupCallId: Int, userIds: LongArray): TdlResult<Ok> {
        val function = InviteVideoChatParticipants(
            groupCallId = groupCallId,
            userIds = userIds,
        )
        return repository.send(function = function)
    }

    override suspend fun isLoginEmailAddressRequired(): TdlResult<Ok> {
        val function = IsLoginEmailAddressRequired()
        return repository.send(function = function)
    }

    override suspend fun isProfileAudio(fileId: Int): TdlResult<Ok> {
        val function = IsProfileAudio(
            fileId = fileId,
        )
        return repository.send(function = function)
    }

    override suspend fun joinChat(chatId: Long): TdlResult<Ok> {
        val function = JoinChat(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun joinChatByInviteLink(inviteLink: String): TdlResult<Chat> {
        val function = JoinChatByInviteLink(
            inviteLink = inviteLink,
        )
        return repository.send(function = function)
    }

    override suspend fun joinGroupCall(inputGroupCall: InputGroupCall, joinParameters: GroupCallJoinParameters): TdlResult<GroupCallInfo> {
        val function = JoinGroupCall(
            inputGroupCall = inputGroupCall,
            joinParameters = joinParameters,
        )
        return repository.send(function = function)
    }

    override suspend fun joinLiveStory(groupCallId: Int, joinParameters: GroupCallJoinParameters): TdlResult<Text> {
        val function = JoinLiveStory(
            groupCallId = groupCallId,
            joinParameters = joinParameters,
        )
        return repository.send(function = function)
    }

    override suspend fun joinVideoChat(
        groupCallId: Int,
        participantId: MessageSender?,
        joinParameters: GroupCallJoinParameters,
        inviteHash: String,
    ): TdlResult<Text> {
        val function = JoinVideoChat(
            groupCallId = groupCallId,
            participantId = participantId,
            joinParameters = joinParameters,
            inviteHash = inviteHash,
        )
        return repository.send(function = function)
    }

    override suspend fun launchPrepaidGiveaway(
        giveawayId: Long,
        parameters: GiveawayParameters,
        winnerCount: Int,
        starCount: Long,
    ): TdlResult<Ok> {
        val function = LaunchPrepaidGiveaway(
            giveawayId = giveawayId,
            parameters = parameters,
            winnerCount = winnerCount,
            starCount = starCount,
        )
        return repository.send(function = function)
    }

    override suspend fun leaveChat(chatId: Long): TdlResult<Ok> {
        val function = LeaveChat(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun leaveGroupCall(groupCallId: Int): TdlResult<Ok> {
        val function = LeaveGroupCall(
            groupCallId = groupCallId,
        )
        return repository.send(function = function)
    }

    override suspend fun loadActiveStories(storyList: StoryList): TdlResult<Ok> {
        val function = LoadActiveStories(
            storyList = storyList,
        )
        return repository.send(function = function)
    }

    override suspend fun loadChats(chatList: ChatList?, limit: Int): TdlResult<Ok> {
        val function = LoadChats(
            chatList = chatList,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun loadDirectMessagesChatTopics(chatId: Long, limit: Int): TdlResult<Ok> {
        val function = LoadDirectMessagesChatTopics(
            chatId = chatId,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun loadGroupCallParticipants(groupCallId: Int, limit: Int): TdlResult<Ok> {
        val function = LoadGroupCallParticipants(
            groupCallId = groupCallId,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun loadQuickReplyShortcutMessages(shortcutId: Int): TdlResult<Ok> {
        val function = LoadQuickReplyShortcutMessages(
            shortcutId = shortcutId,
        )
        return repository.send(function = function)
    }

    override suspend fun loadQuickReplyShortcuts(): TdlResult<Ok> {
        val function = LoadQuickReplyShortcuts()
        return repository.send(function = function)
    }

    override suspend fun loadSavedMessagesTopics(limit: Int): TdlResult<Ok> {
        val function = LoadSavedMessagesTopics(
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun logOut(): TdlResult<Ok> {
        val function = LogOut()
        return repository.send(function = function)
    }

    override suspend fun markChecklistTasksAsDone(
        chatId: Long,
        messageId: Long,
        markedAsDoneTaskIds: IntArray,
        markedAsNotDoneTaskIds: IntArray,
    ): TdlResult<Ok> {
        val function = MarkChecklistTasksAsDone(
            chatId = chatId,
            messageId = messageId,
            markedAsDoneTaskIds = markedAsDoneTaskIds,
            markedAsNotDoneTaskIds = markedAsNotDoneTaskIds,
        )
        return repository.send(function = function)
    }

    override suspend fun openBotSimilarBot(botUserId: Long, openedBotUserId: Long): TdlResult<Ok> {
        val function = OpenBotSimilarBot(
            botUserId = botUserId,
            openedBotUserId = openedBotUserId,
        )
        return repository.send(function = function)
    }

    override suspend fun openChat(chatId: Long): TdlResult<Ok> {
        val function = OpenChat(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun openChatSimilarChat(chatId: Long, openedChatId: Long): TdlResult<Ok> {
        val function = OpenChatSimilarChat(
            chatId = chatId,
            openedChatId = openedChatId,
        )
        return repository.send(function = function)
    }

    override suspend fun openGiftAuction(giftId: Long): TdlResult<Ok> {
        val function = OpenGiftAuction(
            giftId = giftId,
        )
        return repository.send(function = function)
    }

    override suspend fun openMessageContent(chatId: Long, messageId: Long): TdlResult<Ok> {
        val function = OpenMessageContent(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function = function)
    }

    override suspend fun openSponsoredChat(sponsoredChatUniqueId: Long): TdlResult<Ok> {
        val function = OpenSponsoredChat(
            sponsoredChatUniqueId = sponsoredChatUniqueId,
        )
        return repository.send(function = function)
    }

    override suspend fun openStory(storyPosterChatId: Long, storyId: Int): TdlResult<Ok> {
        val function = OpenStory(
            storyPosterChatId = storyPosterChatId,
            storyId = storyId,
        )
        return repository.send(function = function)
    }

    override suspend fun openWebApp(
        chatId: Long,
        botUserId: Long,
        url: String,
        topicId: MessageTopic?,
        replyTo: InputMessageReplyTo?,
        parameters: WebAppOpenParameters,
    ): TdlResult<WebAppInfo> {
        val function = OpenWebApp(
            chatId = chatId,
            botUserId = botUserId,
            url = url,
            topicId = topicId,
            replyTo = replyTo,
            parameters = parameters,
        )
        return repository.send(function = function)
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
        val function = OptimizeStorage(
            size = size,
            ttl = ttl,
            count = count,
            immunityDelay = immunityDelay,
            fileTypes = fileTypes,
            chatIds = chatIds,
            excludeChatIds = excludeChatIds,
            returnDeletedFileStatistics = returnDeletedFileStatistics,
            chatLimit = chatLimit,
        )
        return repository.send(function = function)
    }

    override suspend fun parseMarkdown(text: FormattedText): TdlResult<FormattedText> {
        val function = ParseMarkdown(
            text = text,
        )
        return repository.send(function = function)
    }

    override suspend fun parseTextEntities(text: String, parseMode: TextParseMode): TdlResult<FormattedText> {
        val function = ParseTextEntities(
            text = text,
            parseMode = parseMode,
        )
        return repository.send(function = function)
    }

    override suspend fun pinChatMessage(
        chatId: Long,
        messageId: Long,
        disableNotification: Boolean,
        onlyForSelf: Boolean,
    ): TdlResult<Ok> {
        val function = PinChatMessage(
            chatId = chatId,
            messageId = messageId,
            disableNotification = disableNotification,
            onlyForSelf = onlyForSelf,
        )
        return repository.send(function = function)
    }

    override suspend fun pingProxy(proxyId: Int): TdlResult<Seconds> {
        val function = PingProxy(
            proxyId = proxyId,
        )
        return repository.send(function = function)
    }

    override suspend fun placeGiftAuctionBid(
        giftId: Long,
        starCount: Long,
        userId: Long,
        text: FormattedText,
        isPrivate: Boolean,
    ): TdlResult<Ok> {
        val function = PlaceGiftAuctionBid(
            giftId = giftId,
            starCount = starCount,
            userId = userId,
            text = text,
            isPrivate = isPrivate,
        )
        return repository.send(function = function)
    }

    override suspend fun postStory(
        chatId: Long,
        content: InputStoryContent,
        areas: InputStoryAreas?,
        caption: FormattedText?,
        privacySettings: StoryPrivacySettings,
        albumIds: IntArray,
        activePeriod: Int,
        fromStoryFullId: StoryFullId?,
        isPostedToChatPage: Boolean,
        protectContent: Boolean,
    ): TdlResult<Story> {
        val function = PostStory(
            chatId = chatId,
            content = content,
            areas = areas,
            caption = caption,
            privacySettings = privacySettings,
            albumIds = albumIds,
            activePeriod = activePeriod,
            fromStoryFullId = fromStoryFullId,
            isPostedToChatPage = isPostedToChatPage,
            protectContent = protectContent,
        )
        return repository.send(function = function)
    }

    override suspend fun preliminaryUploadFile(
        file: InputFile,
        fileType: FileType?,
        priority: Int,
    ): TdlResult<File> {
        val function = PreliminaryUploadFile(
            file = file,
            fileType = fileType,
            priority = priority,
        )
        return repository.send(function = function)
    }

    override suspend fun processChatFolderNewChats(chatFolderId: Int, addedChatIds: LongArray): TdlResult<Ok> {
        val function = ProcessChatFolderNewChats(
            chatFolderId = chatFolderId,
            addedChatIds = addedChatIds,
        )
        return repository.send(function = function)
    }

    override suspend fun processChatJoinRequest(
        chatId: Long,
        userId: Long,
        approve: Boolean,
    ): TdlResult<Ok> {
        val function = ProcessChatJoinRequest(
            chatId = chatId,
            userId = userId,
            approve = approve,
        )
        return repository.send(function = function)
    }

    override suspend fun processChatJoinRequests(
        chatId: Long,
        inviteLink: String,
        approve: Boolean,
    ): TdlResult<Ok> {
        val function = ProcessChatJoinRequests(
            chatId = chatId,
            inviteLink = inviteLink,
            approve = approve,
        )
        return repository.send(function = function)
    }

    override suspend fun processPushNotification(payload: String): TdlResult<Ok> {
        val function = ProcessPushNotification(
            payload = payload,
        )
        return repository.send(function = function)
    }

    override suspend fun rateSpeechRecognition(
        chatId: Long,
        messageId: Long,
        isGood: Boolean,
    ): TdlResult<Ok> {
        val function = RateSpeechRecognition(
            chatId = chatId,
            messageId = messageId,
            isGood = isGood,
        )
        return repository.send(function = function)
    }

    override suspend fun readAllChatMentions(chatId: Long): TdlResult<Ok> {
        val function = ReadAllChatMentions(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun readAllChatReactions(chatId: Long): TdlResult<Ok> {
        val function = ReadAllChatReactions(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun readAllDirectMessagesChatTopicReactions(chatId: Long, topicId: Long): TdlResult<Ok> {
        val function = ReadAllDirectMessagesChatTopicReactions(
            chatId = chatId,
            topicId = topicId,
        )
        return repository.send(function = function)
    }

    override suspend fun readAllForumTopicMentions(chatId: Long, forumTopicId: Int): TdlResult<Ok> {
        val function = ReadAllForumTopicMentions(
            chatId = chatId,
            forumTopicId = forumTopicId,
        )
        return repository.send(function = function)
    }

    override suspend fun readAllForumTopicReactions(chatId: Long, forumTopicId: Int): TdlResult<Ok> {
        val function = ReadAllForumTopicReactions(
            chatId = chatId,
            forumTopicId = forumTopicId,
        )
        return repository.send(function = function)
    }

    override suspend fun readBusinessMessage(
        businessConnectionId: String,
        chatId: Long,
        messageId: Long,
    ): TdlResult<Ok> {
        val function = ReadBusinessMessage(
            businessConnectionId = businessConnectionId,
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function = function)
    }

    override suspend fun readChatList(chatList: ChatList): TdlResult<Ok> {
        val function = ReadChatList(
            chatList = chatList,
        )
        return repository.send(function = function)
    }

    override suspend fun readFilePart(
        fileId: Int,
        offset: Long,
        count: Long,
    ): TdlResult<Data> {
        val function = ReadFilePart(
            fileId = fileId,
            offset = offset,
            count = count,
        )
        return repository.send(function = function)
    }

    override suspend fun readdQuickReplyShortcutMessages(shortcutName: String, messageIds: LongArray): TdlResult<QuickReplyMessages> {
        val function = ReaddQuickReplyShortcutMessages(
            shortcutName = shortcutName,
            messageIds = messageIds,
        )
        return repository.send(function = function)
    }

    override suspend fun recognizeSpeech(chatId: Long, messageId: Long): TdlResult<Ok> {
        val function = RecognizeSpeech(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function = function)
    }

    override suspend fun recoverAuthenticationPassword(
        recoveryCode: String,
        newPassword: String,
        newHint: String,
    ): TdlResult<Ok> {
        val function = RecoverAuthenticationPassword(
            recoveryCode = recoveryCode,
            newPassword = newPassword,
            newHint = newHint,
        )
        return repository.send(function = function)
    }

    override suspend fun recoverPassword(
        recoveryCode: String,
        newPassword: String,
        newHint: String,
    ): TdlResult<PasswordState> {
        val function = RecoverPassword(
            recoveryCode = recoveryCode,
            newPassword = newPassword,
            newHint = newHint,
        )
        return repository.send(function = function)
    }

    override suspend fun refundStarPayment(userId: Long, telegramPaymentChargeId: String): TdlResult<Ok> {
        val function = RefundStarPayment(
            userId = userId,
            telegramPaymentChargeId = telegramPaymentChargeId,
        )
        return repository.send(function = function)
    }

    override suspend fun registerDevice(deviceToken: DeviceToken, otherUserIds: LongArray): TdlResult<PushReceiverId> {
        val function = RegisterDevice(
            deviceToken = deviceToken,
            otherUserIds = otherUserIds,
        )
        return repository.send(function = function)
    }

    override suspend fun registerUser(
        firstName: String,
        lastName: String,
        disableNotification: Boolean,
    ): TdlResult<Ok> {
        val function = RegisterUser(
            firstName = firstName,
            lastName = lastName,
            disableNotification = disableNotification,
        )
        return repository.send(function = function)
    }

    override suspend fun removeAllFilesFromDownloads(
        onlyActive: Boolean,
        onlyCompleted: Boolean,
        deleteFromCache: Boolean,
    ): TdlResult<Ok> {
        val function = RemoveAllFilesFromDownloads(
            onlyActive = onlyActive,
            onlyCompleted = onlyCompleted,
            deleteFromCache = deleteFromCache,
        )
        return repository.send(function = function)
    }

    override suspend fun removeBusinessConnectedBotFromChat(chatId: Long): TdlResult<Ok> {
        val function = RemoveBusinessConnectedBotFromChat(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun removeChatActionBar(chatId: Long): TdlResult<Ok> {
        val function = RemoveChatActionBar(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun removeContacts(userIds: LongArray): TdlResult<Ok> {
        val function = RemoveContacts(
            userIds = userIds,
        )
        return repository.send(function = function)
    }

    override suspend fun removeFavoriteSticker(sticker: InputFile): TdlResult<Ok> {
        val function = RemoveFavoriteSticker(
            sticker = sticker,
        )
        return repository.send(function = function)
    }

    override suspend fun removeFileFromDownloads(fileId: Int, deleteFromCache: Boolean): TdlResult<Ok> {
        val function = RemoveFileFromDownloads(
            fileId = fileId,
            deleteFromCache = deleteFromCache,
        )
        return repository.send(function = function)
    }

    override suspend fun removeGiftCollectionGifts(
        ownerId: MessageSender,
        collectionId: Int,
        receivedGiftIds: Array<String>,
    ): TdlResult<GiftCollection> {
        val function = RemoveGiftCollectionGifts(
            ownerId = ownerId,
            collectionId = collectionId,
            receivedGiftIds = receivedGiftIds,
        )
        return repository.send(function = function)
    }

    override suspend fun removeInstalledBackground(backgroundId: Long): TdlResult<Ok> {
        val function = RemoveInstalledBackground(
            backgroundId = backgroundId,
        )
        return repository.send(function = function)
    }

    override suspend fun removeMessageReaction(
        chatId: Long,
        messageId: Long,
        reactionType: ReactionType,
    ): TdlResult<Ok> {
        val function = RemoveMessageReaction(
            chatId = chatId,
            messageId = messageId,
            reactionType = reactionType,
        )
        return repository.send(function = function)
    }

    override suspend fun removeMessageSenderBotVerification(botUserId: Long, verifiedId: MessageSender): TdlResult<Ok> {
        val function = RemoveMessageSenderBotVerification(
            botUserId = botUserId,
            verifiedId = verifiedId,
        )
        return repository.send(function = function)
    }

    override suspend fun removeNotification(notificationGroupId: Int, notificationId: Int): TdlResult<Ok> {
        val function = RemoveNotification(
            notificationGroupId = notificationGroupId,
            notificationId = notificationId,
        )
        return repository.send(function = function)
    }

    override suspend fun removeNotificationGroup(notificationGroupId: Int, maxNotificationId: Int): TdlResult<Ok> {
        val function = RemoveNotificationGroup(
            notificationGroupId = notificationGroupId,
            maxNotificationId = maxNotificationId,
        )
        return repository.send(function = function)
    }

    override suspend fun removePendingLiveStoryReactions(groupCallId: Int): TdlResult<Ok> {
        val function = RemovePendingLiveStoryReactions(
            groupCallId = groupCallId,
        )
        return repository.send(function = function)
    }

    override suspend fun removePendingPaidMessageReactions(chatId: Long, messageId: Long): TdlResult<Ok> {
        val function = RemovePendingPaidMessageReactions(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function = function)
    }

    override suspend fun removeProfileAudio(fileId: Int): TdlResult<Ok> {
        val function = RemoveProfileAudio(
            fileId = fileId,
        )
        return repository.send(function = function)
    }

    override suspend fun removeProxy(proxyId: Int): TdlResult<Ok> {
        val function = RemoveProxy(
            proxyId = proxyId,
        )
        return repository.send(function = function)
    }

    override suspend fun removeRecentHashtag(hashtag: String): TdlResult<Ok> {
        val function = RemoveRecentHashtag(
            hashtag = hashtag,
        )
        return repository.send(function = function)
    }

    override suspend fun removeRecentSticker(isAttached: Boolean, sticker: InputFile): TdlResult<Ok> {
        val function = RemoveRecentSticker(
            isAttached = isAttached,
            sticker = sticker,
        )
        return repository.send(function = function)
    }

    override suspend fun removeRecentlyFoundChat(chatId: Long): TdlResult<Ok> {
        val function = RemoveRecentlyFoundChat(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun removeSavedAnimation(animation: InputFile): TdlResult<Ok> {
        val function = RemoveSavedAnimation(
            animation = animation,
        )
        return repository.send(function = function)
    }

    override suspend fun removeSavedNotificationSound(notificationSoundId: Long): TdlResult<Ok> {
        val function = RemoveSavedNotificationSound(
            notificationSoundId = notificationSoundId,
        )
        return repository.send(function = function)
    }

    override suspend fun removeSearchedForTag(tag: String): TdlResult<Ok> {
        val function = RemoveSearchedForTag(
            tag = tag,
        )
        return repository.send(function = function)
    }

    override suspend fun removeStickerFromSet(sticker: InputFile): TdlResult<Ok> {
        val function = RemoveStickerFromSet(
            sticker = sticker,
        )
        return repository.send(function = function)
    }

    override suspend fun removeStoryAlbumStories(
        chatId: Long,
        storyAlbumId: Int,
        storyIds: IntArray,
    ): TdlResult<StoryAlbum> {
        val function = RemoveStoryAlbumStories(
            chatId = chatId,
            storyAlbumId = storyAlbumId,
            storyIds = storyIds,
        )
        return repository.send(function = function)
    }

    override suspend fun removeTopChat(category: TopChatCategory, chatId: Long): TdlResult<Ok> {
        val function = RemoveTopChat(
            category = category,
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun reorderActiveUsernames(usernames: Array<String>): TdlResult<Ok> {
        val function = ReorderActiveUsernames(
            usernames = usernames,
        )
        return repository.send(function = function)
    }

    override suspend fun reorderBotActiveUsernames(botUserId: Long, usernames: Array<String>): TdlResult<Ok> {
        val function = ReorderBotActiveUsernames(
            botUserId = botUserId,
            usernames = usernames,
        )
        return repository.send(function = function)
    }

    override suspend fun reorderBotMediaPreviews(
        botUserId: Long,
        languageCode: String,
        fileIds: IntArray,
    ): TdlResult<Ok> {
        val function = ReorderBotMediaPreviews(
            botUserId = botUserId,
            languageCode = languageCode,
            fileIds = fileIds,
        )
        return repository.send(function = function)
    }

    override suspend fun reorderChatFolders(chatFolderIds: IntArray, mainChatListPosition: Int): TdlResult<Ok> {
        val function = ReorderChatFolders(
            chatFolderIds = chatFolderIds,
            mainChatListPosition = mainChatListPosition,
        )
        return repository.send(function = function)
    }

    override suspend fun reorderGiftCollectionGifts(
        ownerId: MessageSender,
        collectionId: Int,
        receivedGiftIds: Array<String>,
    ): TdlResult<GiftCollection> {
        val function = ReorderGiftCollectionGifts(
            ownerId = ownerId,
            collectionId = collectionId,
            receivedGiftIds = receivedGiftIds,
        )
        return repository.send(function = function)
    }

    override suspend fun reorderGiftCollections(ownerId: MessageSender, collectionIds: IntArray): TdlResult<Ok> {
        val function = ReorderGiftCollections(
            ownerId = ownerId,
            collectionIds = collectionIds,
        )
        return repository.send(function = function)
    }

    override suspend fun reorderInstalledStickerSets(stickerType: StickerType, stickerSetIds: LongArray): TdlResult<Ok> {
        val function = ReorderInstalledStickerSets(
            stickerType = stickerType,
            stickerSetIds = stickerSetIds,
        )
        return repository.send(function = function)
    }

    override suspend fun reorderQuickReplyShortcuts(shortcutIds: IntArray): TdlResult<Ok> {
        val function = ReorderQuickReplyShortcuts(
            shortcutIds = shortcutIds,
        )
        return repository.send(function = function)
    }

    override suspend fun reorderStoryAlbumStories(
        chatId: Long,
        storyAlbumId: Int,
        storyIds: IntArray,
    ): TdlResult<StoryAlbum> {
        val function = ReorderStoryAlbumStories(
            chatId = chatId,
            storyAlbumId = storyAlbumId,
            storyIds = storyIds,
        )
        return repository.send(function = function)
    }

    override suspend fun reorderStoryAlbums(chatId: Long, storyAlbumIds: IntArray): TdlResult<Ok> {
        val function = ReorderStoryAlbums(
            chatId = chatId,
            storyAlbumIds = storyAlbumIds,
        )
        return repository.send(function = function)
    }

    override suspend fun reorderSupergroupActiveUsernames(supergroupId: Long, usernames: Array<String>): TdlResult<Ok> {
        val function = ReorderSupergroupActiveUsernames(
            supergroupId = supergroupId,
            usernames = usernames,
        )
        return repository.send(function = function)
    }

    override suspend fun replaceLiveStoryRtmpUrl(chatId: Long): TdlResult<RtmpUrl> {
        val function = ReplaceLiveStoryRtmpUrl(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun replacePrimaryChatInviteLink(chatId: Long): TdlResult<ChatInviteLink> {
        val function = ReplacePrimaryChatInviteLink(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun replaceStickerInSet(
        userId: Long,
        name: String,
        oldSticker: InputFile,
        newSticker: InputSticker,
    ): TdlResult<Ok> {
        val function = ReplaceStickerInSet(
            userId = userId,
            name = name,
            oldSticker = oldSticker,
            newSticker = newSticker,
        )
        return repository.send(function = function)
    }

    override suspend fun replaceVideoChatRtmpUrl(chatId: Long): TdlResult<RtmpUrl> {
        val function = ReplaceVideoChatRtmpUrl(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun reportAuthenticationCodeMissing(mobileNetworkCode: String): TdlResult<Ok> {
        val function = ReportAuthenticationCodeMissing(
            mobileNetworkCode = mobileNetworkCode,
        )
        return repository.send(function = function)
    }

    override suspend fun reportChat(
        chatId: Long,
        optionId: ByteArray,
        messageIds: LongArray,
        text: String,
    ): TdlResult<ReportChatResult> {
        val function = ReportChat(
            chatId = chatId,
            optionId = optionId,
            messageIds = messageIds,
            text = text,
        )
        return repository.send(function = function)
    }

    override suspend fun reportChatPhoto(
        chatId: Long,
        fileId: Int,
        reason: ReportReason,
        text: String,
    ): TdlResult<Ok> {
        val function = ReportChatPhoto(
            chatId = chatId,
            fileId = fileId,
            reason = reason,
            text = text,
        )
        return repository.send(function = function)
    }

    override suspend fun reportChatSponsoredMessage(
        chatId: Long,
        messageId: Long,
        optionId: ByteArray,
    ): TdlResult<ReportSponsoredResult> {
        val function = ReportChatSponsoredMessage(
            chatId = chatId,
            messageId = messageId,
            optionId = optionId,
        )
        return repository.send(function = function)
    }

    override suspend fun reportMessageReactions(
        chatId: Long,
        messageId: Long,
        senderId: MessageSender,
    ): TdlResult<Ok> {
        val function = ReportMessageReactions(
            chatId = chatId,
            messageId = messageId,
            senderId = senderId,
        )
        return repository.send(function = function)
    }

    override suspend fun reportPhoneNumberCodeMissing(mobileNetworkCode: String): TdlResult<Ok> {
        val function = ReportPhoneNumberCodeMissing(
            mobileNetworkCode = mobileNetworkCode,
        )
        return repository.send(function = function)
    }

    override suspend fun reportSponsoredChat(sponsoredChatUniqueId: Long, optionId: ByteArray): TdlResult<ReportSponsoredResult> {
        val function = ReportSponsoredChat(
            sponsoredChatUniqueId = sponsoredChatUniqueId,
            optionId = optionId,
        )
        return repository.send(function = function)
    }

    override suspend fun reportStory(
        storyPosterChatId: Long,
        storyId: Int,
        optionId: ByteArray,
        text: String,
    ): TdlResult<ReportStoryResult> {
        val function = ReportStory(
            storyPosterChatId = storyPosterChatId,
            storyId = storyId,
            optionId = optionId,
            text = text,
        )
        return repository.send(function = function)
    }

    override suspend fun reportSupergroupAntiSpamFalsePositive(supergroupId: Long, messageId: Long): TdlResult<Ok> {
        val function = ReportSupergroupAntiSpamFalsePositive(
            supergroupId = supergroupId,
            messageId = messageId,
        )
        return repository.send(function = function)
    }

    override suspend fun reportSupergroupSpam(supergroupId: Long, messageIds: LongArray): TdlResult<Ok> {
        val function = ReportSupergroupSpam(
            supergroupId = supergroupId,
            messageIds = messageIds,
        )
        return repository.send(function = function)
    }

    override suspend fun reportVideoMessageAdvertisement(advertisementUniqueId: Long, optionId: ByteArray): TdlResult<ReportSponsoredResult> {
        val function = ReportVideoMessageAdvertisement(
            advertisementUniqueId = advertisementUniqueId,
            optionId = optionId,
        )
        return repository.send(function = function)
    }

    override suspend fun requestAuthenticationPasswordRecovery(): TdlResult<Ok> {
        val function = RequestAuthenticationPasswordRecovery()
        return repository.send(function = function)
    }

    override suspend fun requestPasswordRecovery(): TdlResult<EmailAddressAuthenticationCodeInfo> {
        val function = RequestPasswordRecovery()
        return repository.send(function = function)
    }

    override suspend fun requestQrCodeAuthentication(otherUserIds: LongArray): TdlResult<Ok> {
        val function = RequestQrCodeAuthentication(
            otherUserIds = otherUserIds,
        )
        return repository.send(function = function)
    }

    override suspend fun resendAuthenticationCode(reason: ResendCodeReason?): TdlResult<Ok> {
        val function = ResendAuthenticationCode(
            reason = reason,
        )
        return repository.send(function = function)
    }

    override suspend fun resendEmailAddressVerificationCode(): TdlResult<EmailAddressAuthenticationCodeInfo> {
        val function = ResendEmailAddressVerificationCode()
        return repository.send(function = function)
    }

    override suspend fun resendLoginEmailAddressCode(): TdlResult<EmailAddressAuthenticationCodeInfo> {
        val function = ResendLoginEmailAddressCode()
        return repository.send(function = function)
    }

    override suspend fun resendMessages(
        chatId: Long,
        messageIds: LongArray,
        quote: InputTextQuote?,
        paidMessageStarCount: Long,
    ): TdlResult<Messages> {
        val function = ResendMessages(
            chatId = chatId,
            messageIds = messageIds,
            quote = quote,
            paidMessageStarCount = paidMessageStarCount,
        )
        return repository.send(function = function)
    }

    override suspend fun resendPhoneNumberCode(reason: ResendCodeReason?): TdlResult<AuthenticationCodeInfo> {
        val function = ResendPhoneNumberCode(
            reason = reason,
        )
        return repository.send(function = function)
    }

    override suspend fun resendRecoveryEmailAddressCode(): TdlResult<PasswordState> {
        val function = ResendRecoveryEmailAddressCode()
        return repository.send(function = function)
    }

    override suspend fun resetAllNotificationSettings(): TdlResult<Ok> {
        val function = ResetAllNotificationSettings()
        return repository.send(function = function)
    }

    override suspend fun resetAuthenticationEmailAddress(): TdlResult<Ok> {
        val function = ResetAuthenticationEmailAddress()
        return repository.send(function = function)
    }

    override suspend fun resetInstalledBackgrounds(): TdlResult<Ok> {
        val function = ResetInstalledBackgrounds()
        return repository.send(function = function)
    }

    override suspend fun resetNetworkStatistics(): TdlResult<Ok> {
        val function = ResetNetworkStatistics()
        return repository.send(function = function)
    }

    override suspend fun resetPassword(): TdlResult<ResetPasswordResult> {
        val function = ResetPassword()
        return repository.send(function = function)
    }

    override suspend fun reuseStarSubscription(subscriptionId: String): TdlResult<Ok> {
        val function = ReuseStarSubscription(
            subscriptionId = subscriptionId,
        )
        return repository.send(function = function)
    }

    override suspend fun revokeChatInviteLink(chatId: Long, inviteLink: String): TdlResult<ChatInviteLinks> {
        val function = RevokeChatInviteLink(
            chatId = chatId,
            inviteLink = inviteLink,
        )
        return repository.send(function = function)
    }

    override suspend fun revokeGroupCallInviteLink(groupCallId: Int): TdlResult<Ok> {
        val function = RevokeGroupCallInviteLink(
            groupCallId = groupCallId,
        )
        return repository.send(function = function)
    }

    override suspend fun saveApplicationLogEvent(
        type: String,
        chatId: Long,
        data: JsonValue,
    ): TdlResult<Ok> {
        val function = SaveApplicationLogEvent(
            type = type,
            chatId = chatId,
            data = data,
        )
        return repository.send(function = function)
    }

    override suspend fun savePreparedInlineMessage(
        userId: Long,
        result: InputInlineQueryResult,
        chatTypes: TargetChatTypes,
    ): TdlResult<PreparedInlineMessageId> {
        val function = SavePreparedInlineMessage(
            userId = userId,
            result = result,
            chatTypes = chatTypes,
        )
        return repository.send(function = function)
    }

    override suspend fun searchAffiliatePrograms(
        affiliate: AffiliateType,
        sortOrder: AffiliateProgramSortOrder,
        offset: String,
        limit: Int,
    ): TdlResult<FoundAffiliatePrograms> {
        val function = SearchAffiliatePrograms(
            affiliate = affiliate,
            sortOrder = sortOrder,
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun searchBackground(name: String): TdlResult<Background> {
        val function = SearchBackground(
            name = name,
        )
        return repository.send(function = function)
    }

    override suspend fun searchCallMessages(
        offset: String,
        limit: Int,
        onlyMissed: Boolean,
    ): TdlResult<FoundMessages> {
        val function = SearchCallMessages(
            offset = offset,
            limit = limit,
            onlyMissed = onlyMissed,
        )
        return repository.send(function = function)
    }

    override suspend fun searchChatAffiliateProgram(username: String, referrer: String): TdlResult<Chat> {
        val function = SearchChatAffiliateProgram(
            username = username,
            referrer = referrer,
        )
        return repository.send(function = function)
    }

    override suspend fun searchChatMembers(
        chatId: Long,
        query: String,
        limit: Int,
        filter: ChatMembersFilter?,
    ): TdlResult<ChatMembers> {
        val function = SearchChatMembers(
            chatId = chatId,
            query = query,
            limit = limit,
            filter = filter,
        )
        return repository.send(function = function)
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
        val function = SearchChatMessages(
            chatId = chatId,
            topicId = topicId,
            query = query,
            senderId = senderId,
            fromMessageId = fromMessageId,
            offset = offset,
            limit = limit,
            filter = filter,
        )
        return repository.send(function = function)
    }

    override suspend fun searchChatRecentLocationMessages(chatId: Long, limit: Int): TdlResult<Messages> {
        val function = SearchChatRecentLocationMessages(
            chatId = chatId,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun searchChats(query: String, limit: Int): TdlResult<Chats> {
        val function = SearchChats(
            query = query,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun searchChatsOnServer(query: String, limit: Int): TdlResult<Chats> {
        val function = SearchChatsOnServer(
            query = query,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun searchContacts(query: String, limit: Int): TdlResult<Users> {
        val function = SearchContacts(
            query = query,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun searchEmojis(text: String, inputLanguageCodes: Array<String>): TdlResult<EmojiKeywords> {
        val function = SearchEmojis(
            text = text,
            inputLanguageCodes = inputLanguageCodes,
        )
        return repository.send(function = function)
    }

    override suspend fun searchFileDownloads(
        query: String,
        onlyActive: Boolean,
        onlyCompleted: Boolean,
        offset: String,
        limit: Int,
    ): TdlResult<FoundFileDownloads> {
        val function = SearchFileDownloads(
            query = query,
            onlyActive = onlyActive,
            onlyCompleted = onlyCompleted,
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun searchGiftsForResale(
        giftId: Long,
        order: GiftForResaleOrder,
        attributes: Array<UpgradedGiftAttributeId>,
        offset: String,
        limit: Int,
    ): TdlResult<GiftsForResale> {
        val function = SearchGiftsForResale(
            giftId = giftId,
            order = order,
            attributes = attributes,
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun searchHashtags(prefix: String, limit: Int): TdlResult<Hashtags> {
        val function = SearchHashtags(
            prefix = prefix,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun searchInstalledStickerSets(
        stickerType: StickerType,
        query: String,
        limit: Int,
    ): TdlResult<StickerSets> {
        val function = SearchInstalledStickerSets(
            stickerType = stickerType,
            query = query,
            limit = limit,
        )
        return repository.send(function = function)
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
        val function = SearchMessages(
            chatList = chatList,
            query = query,
            offset = offset,
            limit = limit,
            filter = filter,
            chatTypeFilter = chatTypeFilter,
            minDate = minDate,
            maxDate = maxDate,
        )
        return repository.send(function = function)
    }

    override suspend fun searchOutgoingDocumentMessages(query: String, limit: Int): TdlResult<FoundMessages> {
        val function = SearchOutgoingDocumentMessages(
            query = query,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun searchPublicChat(username: String): TdlResult<Chat> {
        val function = SearchPublicChat(
            username = username,
        )
        return repository.send(function = function)
    }

    override suspend fun searchPublicChats(query: String): TdlResult<Chats> {
        val function = SearchPublicChats(
            query = query,
        )
        return repository.send(function = function)
    }

    override suspend fun searchPublicMessagesByTag(
        tag: String,
        offset: String,
        limit: Int,
    ): TdlResult<FoundMessages> {
        val function = SearchPublicMessagesByTag(
            tag = tag,
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun searchPublicPosts(
        query: String,
        offset: String,
        limit: Int,
        starCount: Long,
    ): TdlResult<FoundPublicPosts> {
        val function = SearchPublicPosts(
            query = query,
            offset = offset,
            limit = limit,
            starCount = starCount,
        )
        return repository.send(function = function)
    }

    override suspend fun searchPublicStoriesByLocation(
        address: LocationAddress,
        offset: String,
        limit: Int,
    ): TdlResult<FoundStories> {
        val function = SearchPublicStoriesByLocation(
            address = address,
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun searchPublicStoriesByTag(
        storyPosterChatId: Long,
        tag: String,
        offset: String,
        limit: Int,
    ): TdlResult<FoundStories> {
        val function = SearchPublicStoriesByTag(
            storyPosterChatId = storyPosterChatId,
            tag = tag,
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun searchPublicStoriesByVenue(
        venueProvider: String,
        venueId: String,
        offset: String,
        limit: Int,
    ): TdlResult<FoundStories> {
        val function = SearchPublicStoriesByVenue(
            venueProvider = venueProvider,
            venueId = venueId,
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun searchQuote(
        text: FormattedText,
        quote: FormattedText,
        quotePosition: Int,
    ): TdlResult<FoundPosition> {
        val function = SearchQuote(
            text = text,
            quote = quote,
            quotePosition = quotePosition,
        )
        return repository.send(function = function)
    }

    override suspend fun searchRecentlyFoundChats(query: String, limit: Int): TdlResult<Chats> {
        val function = SearchRecentlyFoundChats(
            query = query,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun searchSavedMessages(
        savedMessagesTopicId: Long,
        tag: ReactionType?,
        query: String,
        fromMessageId: Long,
        offset: Int,
        limit: Int,
    ): TdlResult<FoundChatMessages> {
        val function = SearchSavedMessages(
            savedMessagesTopicId = savedMessagesTopicId,
            tag = tag,
            query = query,
            fromMessageId = fromMessageId,
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun searchSecretMessages(
        chatId: Long,
        query: String,
        offset: String,
        limit: Int,
        filter: SearchMessagesFilter?,
    ): TdlResult<FoundMessages> {
        val function = SearchSecretMessages(
            chatId = chatId,
            query = query,
            offset = offset,
            limit = limit,
            filter = filter,
        )
        return repository.send(function = function)
    }

    override suspend fun searchStickerSet(name: String, ignoreCache: Boolean): TdlResult<StickerSet> {
        val function = SearchStickerSet(
            name = name,
            ignoreCache = ignoreCache,
        )
        return repository.send(function = function)
    }

    override suspend fun searchStickerSets(stickerType: StickerType, query: String): TdlResult<StickerSets> {
        val function = SearchStickerSets(
            stickerType = stickerType,
            query = query,
        )
        return repository.send(function = function)
    }

    override suspend fun searchStickers(
        stickerType: StickerType,
        emojis: String,
        query: String,
        inputLanguageCodes: Array<String>,
        offset: Int,
        limit: Int,
    ): TdlResult<Stickers> {
        val function = SearchStickers(
            stickerType = stickerType,
            emojis = emojis,
            query = query,
            inputLanguageCodes = inputLanguageCodes,
            offset = offset,
            limit = limit,
        )
        return repository.send(function = function)
    }

    override suspend fun searchStringsByPrefix(
        strings: Array<String>,
        query: String,
        limit: Int,
        returnNoneForEmptyQuery: Boolean,
    ): TdlResult<FoundPositions> {
        val function = SearchStringsByPrefix(
            strings = strings,
            query = query,
            limit = limit,
            returnNoneForEmptyQuery = returnNoneForEmptyQuery,
        )
        return repository.send(function = function)
    }

    override suspend fun searchUserByPhoneNumber(phoneNumber: String, onlyLocal: Boolean): TdlResult<User> {
        val function = SearchUserByPhoneNumber(
            phoneNumber = phoneNumber,
            onlyLocal = onlyLocal,
        )
        return repository.send(function = function)
    }

    override suspend fun searchUserByToken(token: String): TdlResult<User> {
        val function = SearchUserByToken(
            token = token,
        )
        return repository.send(function = function)
    }

    override suspend fun searchWebApp(botUserId: Long, webAppShortName: String): TdlResult<FoundWebApp> {
        val function = SearchWebApp(
            botUserId = botUserId,
            webAppShortName = webAppShortName,
        )
        return repository.send(function = function)
    }

    override suspend fun sellGift(businessConnectionId: String, receivedGiftId: String): TdlResult<Ok> {
        val function = SellGift(
            businessConnectionId = businessConnectionId,
            receivedGiftId = receivedGiftId,
        )
        return repository.send(function = function)
    }

    override suspend fun sendAuthenticationFirebaseSms(token: String): TdlResult<Ok> {
        val function = SendAuthenticationFirebaseSms(
            token = token,
        )
        return repository.send(function = function)
    }

    override suspend fun sendBotStartMessage(
        botUserId: Long,
        chatId: Long,
        parameter: String,
    ): TdlResult<Message> {
        val function = SendBotStartMessage(
            botUserId = botUserId,
            chatId = chatId,
            parameter = parameter,
        )
        return repository.send(function = function)
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
        val function = SendBusinessMessage(
            businessConnectionId = businessConnectionId,
            chatId = chatId,
            replyTo = replyTo,
            disableNotification = disableNotification,
            protectContent = protectContent,
            effectId = effectId,
            replyMarkup = replyMarkup,
            inputMessageContent = inputMessageContent,
        )
        return repository.send(function = function)
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
        val function = SendBusinessMessageAlbum(
            businessConnectionId = businessConnectionId,
            chatId = chatId,
            replyTo = replyTo,
            disableNotification = disableNotification,
            protectContent = protectContent,
            effectId = effectId,
            inputMessageContents = inputMessageContents,
        )
        return repository.send(function = function)
    }

    override suspend fun sendCallDebugInformation(callId: Int, debugInformation: String): TdlResult<Ok> {
        val function = SendCallDebugInformation(
            callId = callId,
            debugInformation = debugInformation,
        )
        return repository.send(function = function)
    }

    override suspend fun sendCallLog(callId: Int, logFile: InputFile): TdlResult<Ok> {
        val function = SendCallLog(
            callId = callId,
            logFile = logFile,
        )
        return repository.send(function = function)
    }

    override suspend fun sendCallRating(
        callId: Int,
        rating: Int,
        comment: String,
        problems: Array<CallProblem>,
    ): TdlResult<Ok> {
        val function = SendCallRating(
            callId = callId,
            rating = rating,
            comment = comment,
            problems = problems,
        )
        return repository.send(function = function)
    }

    override suspend fun sendCallSignalingData(callId: Int, data: ByteArray): TdlResult<Ok> {
        val function = SendCallSignalingData(
            callId = callId,
            data = data,
        )
        return repository.send(function = function)
    }

    override suspend fun sendChatAction(
        chatId: Long,
        topicId: MessageTopic,
        businessConnectionId: String,
        action: ChatAction?,
    ): TdlResult<Ok> {
        val function = SendChatAction(
            chatId = chatId,
            topicId = topicId,
            businessConnectionId = businessConnectionId,
            action = action,
        )
        return repository.send(function = function)
    }

    override suspend fun sendCustomRequest(method: String, parameters: String): TdlResult<CustomRequestResult> {
        val function = SendCustomRequest(
            method = method,
            parameters = parameters,
        )
        return repository.send(function = function)
    }

    override suspend fun sendEmailAddressVerificationCode(emailAddress: String): TdlResult<EmailAddressAuthenticationCodeInfo> {
        val function = SendEmailAddressVerificationCode(
            emailAddress = emailAddress,
        )
        return repository.send(function = function)
    }

    override suspend fun sendGift(
        giftId: Long,
        ownerId: MessageSender,
        text: FormattedText,
        isPrivate: Boolean,
        payForUpgrade: Boolean,
    ): TdlResult<Ok> {
        val function = SendGift(
            giftId = giftId,
            ownerId = ownerId,
            text = text,
            isPrivate = isPrivate,
            payForUpgrade = payForUpgrade,
        )
        return repository.send(function = function)
    }

    override suspend fun sendGroupCallMessage(
        groupCallId: Int,
        text: FormattedText,
        paidMessageStarCount: Long,
    ): TdlResult<Ok> {
        val function = SendGroupCallMessage(
            groupCallId = groupCallId,
            text = text,
            paidMessageStarCount = paidMessageStarCount,
        )
        return repository.send(function = function)
    }

    override suspend fun sendInlineQueryResultMessage(
        chatId: Long,
        topicId: MessageTopic?,
        replyTo: InputMessageReplyTo?,
        options: MessageSendOptions?,
        queryId: Long,
        resultId: String,
        hideViaBot: Boolean,
    ): TdlResult<Message> {
        val function = SendInlineQueryResultMessage(
            chatId = chatId,
            topicId = topicId,
            replyTo = replyTo,
            options = options,
            queryId = queryId,
            resultId = resultId,
            hideViaBot = hideViaBot,
        )
        return repository.send(function = function)
    }

    override suspend fun sendMessage(
        chatId: Long,
        topicId: MessageTopic?,
        replyTo: InputMessageReplyTo?,
        options: MessageSendOptions?,
        replyMarkup: ReplyMarkup?,
        inputMessageContent: InputMessageContent,
    ): TdlResult<Message> {
        val function = SendMessage(
            chatId = chatId,
            topicId = topicId,
            replyTo = replyTo,
            options = options,
            replyMarkup = replyMarkup,
            inputMessageContent = inputMessageContent,
        )
        return repository.send(function = function)
    }

    override suspend fun sendMessageAlbum(
        chatId: Long,
        topicId: MessageTopic?,
        replyTo: InputMessageReplyTo?,
        options: MessageSendOptions?,
        inputMessageContents: Array<InputMessageContent>,
    ): TdlResult<Messages> {
        val function = SendMessageAlbum(
            chatId = chatId,
            topicId = topicId,
            replyTo = replyTo,
            options = options,
            inputMessageContents = inputMessageContents,
        )
        return repository.send(function = function)
    }

    override suspend fun sendPassportAuthorizationForm(authorizationFormId: Int, types: Array<PassportElementType>): TdlResult<Ok> {
        val function = SendPassportAuthorizationForm(
            authorizationFormId = authorizationFormId,
            types = types,
        )
        return repository.send(function = function)
    }

    override suspend fun sendPaymentForm(
        inputInvoice: InputInvoice,
        paymentFormId: Long,
        orderInfoId: String,
        shippingOptionId: String,
        credentials: InputCredentials?,
        tipAmount: Long,
    ): TdlResult<PaymentResult> {
        val function = SendPaymentForm(
            inputInvoice = inputInvoice,
            paymentFormId = paymentFormId,
            orderInfoId = orderInfoId,
            shippingOptionId = shippingOptionId,
            credentials = credentials,
            tipAmount = tipAmount,
        )
        return repository.send(function = function)
    }

    override suspend fun sendPhoneNumberCode(
        phoneNumber: String,
        settings: PhoneNumberAuthenticationSettings?,
        type: PhoneNumberCodeType,
    ): TdlResult<AuthenticationCodeInfo> {
        val function = SendPhoneNumberCode(
            phoneNumber = phoneNumber,
            settings = settings,
            type = type,
        )
        return repository.send(function = function)
    }

    override suspend fun sendPhoneNumberFirebaseSms(token: String): TdlResult<Ok> {
        val function = SendPhoneNumberFirebaseSms(
            token = token,
        )
        return repository.send(function = function)
    }

    override suspend fun sendQuickReplyShortcutMessages(
        chatId: Long,
        shortcutId: Int,
        sendingId: Int,
    ): TdlResult<Messages> {
        val function = SendQuickReplyShortcutMessages(
            chatId = chatId,
            shortcutId = shortcutId,
            sendingId = sendingId,
        )
        return repository.send(function = function)
    }

    override suspend fun sendResoldGift(
        giftName: String,
        ownerId: MessageSender,
        price: GiftResalePrice,
    ): TdlResult<GiftResaleResult> {
        val function = SendResoldGift(
            giftName = giftName,
            ownerId = ownerId,
            price = price,
        )
        return repository.send(function = function)
    }

    override suspend fun sendTextMessageDraft(
        chatId: Long,
        forumTopicId: Int,
        draftId: Long,
        text: FormattedText,
    ): TdlResult<Ok> {
        val function = SendTextMessageDraft(
            chatId = chatId,
            forumTopicId = forumTopicId,
            draftId = draftId,
            text = text,
        )
        return repository.send(function = function)
    }

    override suspend fun sendWebAppCustomRequest(
        botUserId: Long,
        method: String,
        parameters: String,
    ): TdlResult<CustomRequestResult> {
        val function = SendWebAppCustomRequest(
            botUserId = botUserId,
            method = method,
            parameters = parameters,
        )
        return repository.send(function = function)
    }

    override suspend fun sendWebAppData(
        botUserId: Long,
        buttonText: String,
        data: String,
    ): TdlResult<Ok> {
        val function = SendWebAppData(
            botUserId = botUserId,
            buttonText = buttonText,
            data = data,
        )
        return repository.send(function = function)
    }

    override suspend fun setAccentColor(accentColorId: Int, backgroundCustomEmojiId: Long): TdlResult<Ok> {
        val function = SetAccentColor(
            accentColorId = accentColorId,
            backgroundCustomEmojiId = backgroundCustomEmojiId,
        )
        return repository.send(function = function)
    }

    override suspend fun setAccountTtl(ttl: AccountTtl): TdlResult<Ok> {
        val function = SetAccountTtl(
            ttl = ttl,
        )
        return repository.send(function = function)
    }

    override suspend fun setAlarm(seconds: Double): TdlResult<Ok> {
        val function = SetAlarm(
            seconds = seconds,
        )
        return repository.send(function = function)
    }

    override suspend fun setApplicationVerificationToken(verificationId: Long, token: String): TdlResult<Ok> {
        val function = SetApplicationVerificationToken(
            verificationId = verificationId,
            token = token,
        )
        return repository.send(function = function)
    }

    override suspend fun setArchiveChatListSettings(settings: ArchiveChatListSettings): TdlResult<Ok> {
        val function = SetArchiveChatListSettings(
            settings = settings,
        )
        return repository.send(function = function)
    }

    override suspend fun setAuthenticationEmailAddress(emailAddress: String): TdlResult<Ok> {
        val function = SetAuthenticationEmailAddress(
            emailAddress = emailAddress,
        )
        return repository.send(function = function)
    }

    override suspend fun setAuthenticationPhoneNumber(phoneNumber: String, settings: PhoneNumberAuthenticationSettings?): TdlResult<Ok> {
        val function = SetAuthenticationPhoneNumber(
            phoneNumber = phoneNumber,
            settings = settings,
        )
        return repository.send(function = function)
    }

    override suspend fun setAuthenticationPremiumPurchaseTransaction(
        transaction: StoreTransaction,
        isRestore: Boolean,
        currency: String,
        amount: Long,
    ): TdlResult<Ok> {
        val function = SetAuthenticationPremiumPurchaseTransaction(
            transaction = transaction,
            isRestore = isRestore,
            currency = currency,
            amount = amount,
        )
        return repository.send(function = function)
    }

    override suspend fun setAutoDownloadSettings(settings: AutoDownloadSettings, type: NetworkType): TdlResult<Ok> {
        val function = SetAutoDownloadSettings(
            settings = settings,
            type = type,
        )
        return repository.send(function = function)
    }

    override suspend fun setAutosaveSettings(scope: AutosaveSettingsScope, settings: ScopeAutosaveSettings?): TdlResult<Ok> {
        val function = SetAutosaveSettings(
            scope = scope,
            settings = settings,
        )
        return repository.send(function = function)
    }

    override suspend fun setBio(bio: String): TdlResult<Ok> {
        val function = SetBio(
            bio = bio,
        )
        return repository.send(function = function)
    }

    override suspend fun setBirthdate(birthdate: Birthdate?): TdlResult<Ok> {
        val function = SetBirthdate(
            birthdate = birthdate,
        )
        return repository.send(function = function)
    }

    override suspend fun setBotInfoDescription(
        botUserId: Long,
        languageCode: String,
        description: String,
    ): TdlResult<Ok> {
        val function = SetBotInfoDescription(
            botUserId = botUserId,
            languageCode = languageCode,
            description = description,
        )
        return repository.send(function = function)
    }

    override suspend fun setBotInfoShortDescription(
        botUserId: Long,
        languageCode: String,
        shortDescription: String,
    ): TdlResult<Ok> {
        val function = SetBotInfoShortDescription(
            botUserId = botUserId,
            languageCode = languageCode,
            shortDescription = shortDescription,
        )
        return repository.send(function = function)
    }

    override suspend fun setBotName(
        botUserId: Long,
        languageCode: String,
        name: String,
    ): TdlResult<Ok> {
        val function = SetBotName(
            botUserId = botUserId,
            languageCode = languageCode,
            name = name,
        )
        return repository.send(function = function)
    }

    override suspend fun setBotProfilePhoto(botUserId: Long, photo: InputChatPhoto?): TdlResult<Ok> {
        val function = SetBotProfilePhoto(
            botUserId = botUserId,
            photo = photo,
        )
        return repository.send(function = function)
    }

    override suspend fun setBotUpdatesStatus(pendingUpdateCount: Int, errorMessage: String): TdlResult<Ok> {
        val function = SetBotUpdatesStatus(
            pendingUpdateCount = pendingUpdateCount,
            errorMessage = errorMessage,
        )
        return repository.send(function = function)
    }

    override suspend fun setBusinessAccountBio(businessConnectionId: String, bio: String): TdlResult<Ok> {
        val function = SetBusinessAccountBio(
            businessConnectionId = businessConnectionId,
            bio = bio,
        )
        return repository.send(function = function)
    }

    override suspend fun setBusinessAccountGiftSettings(businessConnectionId: String, settings: GiftSettings): TdlResult<Ok> {
        val function = SetBusinessAccountGiftSettings(
            businessConnectionId = businessConnectionId,
            settings = settings,
        )
        return repository.send(function = function)
    }

    override suspend fun setBusinessAccountName(
        businessConnectionId: String,
        firstName: String,
        lastName: String,
    ): TdlResult<Ok> {
        val function = SetBusinessAccountName(
            businessConnectionId = businessConnectionId,
            firstName = firstName,
            lastName = lastName,
        )
        return repository.send(function = function)
    }

    override suspend fun setBusinessAccountProfilePhoto(
        businessConnectionId: String,
        photo: InputChatPhoto?,
        isPublic: Boolean,
    ): TdlResult<Ok> {
        val function = SetBusinessAccountProfilePhoto(
            businessConnectionId = businessConnectionId,
            photo = photo,
            isPublic = isPublic,
        )
        return repository.send(function = function)
    }

    override suspend fun setBusinessAccountUsername(businessConnectionId: String, username: String): TdlResult<Ok> {
        val function = SetBusinessAccountUsername(
            businessConnectionId = businessConnectionId,
            username = username,
        )
        return repository.send(function = function)
    }

    override suspend fun setBusinessAwayMessageSettings(awayMessageSettings: BusinessAwayMessageSettings?): TdlResult<Ok> {
        val function = SetBusinessAwayMessageSettings(
            awayMessageSettings = awayMessageSettings,
        )
        return repository.send(function = function)
    }

    override suspend fun setBusinessConnectedBot(bot: BusinessConnectedBot): TdlResult<Ok> {
        val function = SetBusinessConnectedBot(
            bot = bot,
        )
        return repository.send(function = function)
    }

    override suspend fun setBusinessGreetingMessageSettings(greetingMessageSettings: BusinessGreetingMessageSettings?): TdlResult<Ok> {
        val function = SetBusinessGreetingMessageSettings(
            greetingMessageSettings = greetingMessageSettings,
        )
        return repository.send(function = function)
    }

    override suspend fun setBusinessLocation(location: BusinessLocation?): TdlResult<Ok> {
        val function = SetBusinessLocation(
            location = location,
        )
        return repository.send(function = function)
    }

    override suspend fun setBusinessMessageIsPinned(
        businessConnectionId: String,
        chatId: Long,
        messageId: Long,
        isPinned: Boolean,
    ): TdlResult<Ok> {
        val function = SetBusinessMessageIsPinned(
            businessConnectionId = businessConnectionId,
            chatId = chatId,
            messageId = messageId,
            isPinned = isPinned,
        )
        return repository.send(function = function)
    }

    override suspend fun setBusinessOpeningHours(openingHours: BusinessOpeningHours?): TdlResult<Ok> {
        val function = SetBusinessOpeningHours(
            openingHours = openingHours,
        )
        return repository.send(function = function)
    }

    override suspend fun setBusinessStartPage(startPage: InputBusinessStartPage?): TdlResult<Ok> {
        val function = SetBusinessStartPage(
            startPage = startPage,
        )
        return repository.send(function = function)
    }

    override suspend fun setChatAccentColor(
        chatId: Long,
        accentColorId: Int,
        backgroundCustomEmojiId: Long,
    ): TdlResult<Ok> {
        val function = SetChatAccentColor(
            chatId = chatId,
            accentColorId = accentColorId,
            backgroundCustomEmojiId = backgroundCustomEmojiId,
        )
        return repository.send(function = function)
    }

    override suspend fun setChatActiveStoriesList(chatId: Long, storyList: StoryList): TdlResult<Ok> {
        val function = SetChatActiveStoriesList(
            chatId = chatId,
            storyList = storyList,
        )
        return repository.send(function = function)
    }

    override suspend fun setChatAffiliateProgram(chatId: Long, parameters: AffiliateProgramParameters?): TdlResult<Ok> {
        val function = SetChatAffiliateProgram(
            chatId = chatId,
            parameters = parameters,
        )
        return repository.send(function = function)
    }

    override suspend fun setChatAvailableReactions(chatId: Long, availableReactions: ChatAvailableReactions): TdlResult<Ok> {
        val function = SetChatAvailableReactions(
            chatId = chatId,
            availableReactions = availableReactions,
        )
        return repository.send(function = function)
    }

    override suspend fun setChatBackground(
        chatId: Long,
        background: InputBackground?,
        type: BackgroundType?,
        darkThemeDimming: Int,
        onlyForSelf: Boolean,
    ): TdlResult<Ok> {
        val function = SetChatBackground(
            chatId = chatId,
            background = background,
            type = type,
            darkThemeDimming = darkThemeDimming,
            onlyForSelf = onlyForSelf,
        )
        return repository.send(function = function)
    }

    override suspend fun setChatClientData(chatId: Long, clientData: String): TdlResult<Ok> {
        val function = SetChatClientData(
            chatId = chatId,
            clientData = clientData,
        )
        return repository.send(function = function)
    }

    override suspend fun setChatDescription(chatId: Long, description: String): TdlResult<Ok> {
        val function = SetChatDescription(
            chatId = chatId,
            description = description,
        )
        return repository.send(function = function)
    }

    override suspend fun setChatDirectMessagesGroup(
        chatId: Long,
        isEnabled: Boolean,
        paidMessageStarCount: Long,
    ): TdlResult<Ok> {
        val function = SetChatDirectMessagesGroup(
            chatId = chatId,
            isEnabled = isEnabled,
            paidMessageStarCount = paidMessageStarCount,
        )
        return repository.send(function = function)
    }

    override suspend fun setChatDiscussionGroup(chatId: Long, discussionChatId: Long): TdlResult<Ok> {
        val function = SetChatDiscussionGroup(
            chatId = chatId,
            discussionChatId = discussionChatId,
        )
        return repository.send(function = function)
    }

    override suspend fun setChatDraftMessage(
        chatId: Long,
        topicId: MessageTopic?,
        draftMessage: DraftMessage?,
    ): TdlResult<Ok> {
        val function = SetChatDraftMessage(
            chatId = chatId,
            topicId = topicId,
            draftMessage = draftMessage,
        )
        return repository.send(function = function)
    }

    override suspend fun setChatEmojiStatus(chatId: Long, emojiStatus: EmojiStatus?): TdlResult<Ok> {
        val function = SetChatEmojiStatus(
            chatId = chatId,
            emojiStatus = emojiStatus,
        )
        return repository.send(function = function)
    }

    override suspend fun setChatLocation(chatId: Long, location: ChatLocation): TdlResult<Ok> {
        val function = SetChatLocation(
            chatId = chatId,
            location = location,
        )
        return repository.send(function = function)
    }

    override suspend fun setChatMemberStatus(
        chatId: Long,
        memberId: MessageSender,
        status: ChatMemberStatus,
    ): TdlResult<Ok> {
        val function = SetChatMemberStatus(
            chatId = chatId,
            memberId = memberId,
            status = status,
        )
        return repository.send(function = function)
    }

    override suspend fun setChatMessageAutoDeleteTime(chatId: Long, messageAutoDeleteTime: Int): TdlResult<Ok> {
        val function = SetChatMessageAutoDeleteTime(
            chatId = chatId,
            messageAutoDeleteTime = messageAutoDeleteTime,
        )
        return repository.send(function = function)
    }

    override suspend fun setChatMessageSender(chatId: Long, messageSenderId: MessageSender): TdlResult<Ok> {
        val function = SetChatMessageSender(
            chatId = chatId,
            messageSenderId = messageSenderId,
        )
        return repository.send(function = function)
    }

    override suspend fun setChatNotificationSettings(chatId: Long, notificationSettings: ChatNotificationSettings): TdlResult<Ok> {
        val function = SetChatNotificationSettings(
            chatId = chatId,
            notificationSettings = notificationSettings,
        )
        return repository.send(function = function)
    }

    override suspend fun setChatPaidMessageStarCount(chatId: Long, paidMessageStarCount: Long): TdlResult<Ok> {
        val function = SetChatPaidMessageStarCount(
            chatId = chatId,
            paidMessageStarCount = paidMessageStarCount,
        )
        return repository.send(function = function)
    }

    override suspend fun setChatPermissions(chatId: Long, permissions: ChatPermissions): TdlResult<Ok> {
        val function = SetChatPermissions(
            chatId = chatId,
            permissions = permissions,
        )
        return repository.send(function = function)
    }

    override suspend fun setChatPhoto(chatId: Long, photo: InputChatPhoto?): TdlResult<Ok> {
        val function = SetChatPhoto(
            chatId = chatId,
            photo = photo,
        )
        return repository.send(function = function)
    }

    override suspend fun setChatPinnedStories(chatId: Long, storyIds: IntArray): TdlResult<Ok> {
        val function = SetChatPinnedStories(
            chatId = chatId,
            storyIds = storyIds,
        )
        return repository.send(function = function)
    }

    override suspend fun setChatProfileAccentColor(
        chatId: Long,
        profileAccentColorId: Int,
        profileBackgroundCustomEmojiId: Long,
    ): TdlResult<Ok> {
        val function = SetChatProfileAccentColor(
            chatId = chatId,
            profileAccentColorId = profileAccentColorId,
            profileBackgroundCustomEmojiId = profileBackgroundCustomEmojiId,
        )
        return repository.send(function = function)
    }

    override suspend fun setChatSlowModeDelay(chatId: Long, slowModeDelay: Int): TdlResult<Ok> {
        val function = SetChatSlowModeDelay(
            chatId = chatId,
            slowModeDelay = slowModeDelay,
        )
        return repository.send(function = function)
    }

    override suspend fun setChatTheme(chatId: Long, theme: InputChatTheme?): TdlResult<Ok> {
        val function = SetChatTheme(
            chatId = chatId,
            theme = theme,
        )
        return repository.send(function = function)
    }

    override suspend fun setChatTitle(chatId: Long, title: String): TdlResult<Ok> {
        val function = SetChatTitle(
            chatId = chatId,
            title = title,
        )
        return repository.send(function = function)
    }

    override suspend fun setCloseFriends(userIds: LongArray): TdlResult<Ok> {
        val function = SetCloseFriends(
            userIds = userIds,
        )
        return repository.send(function = function)
    }

    override suspend fun setCommands(
        scope: BotCommandScope?,
        languageCode: String,
        commands: Array<BotCommand>,
    ): TdlResult<Ok> {
        val function = SetCommands(
            scope = scope,
            languageCode = languageCode,
            commands = commands,
        )
        return repository.send(function = function)
    }

    override suspend fun setCustomEmojiStickerSetThumbnail(name: String, customEmojiId: Long): TdlResult<Ok> {
        val function = SetCustomEmojiStickerSetThumbnail(
            name = name,
            customEmojiId = customEmojiId,
        )
        return repository.send(function = function)
    }

    override suspend fun setCustomLanguagePack(info: LanguagePackInfo, strings: Array<LanguagePackString>): TdlResult<Ok> {
        val function = SetCustomLanguagePack(
            info = info,
            strings = strings,
        )
        return repository.send(function = function)
    }

    override suspend fun setCustomLanguagePackString(languagePackId: String, newString: LanguagePackString): TdlResult<Ok> {
        val function = SetCustomLanguagePackString(
            languagePackId = languagePackId,
            newString = newString,
        )
        return repository.send(function = function)
    }

    override suspend fun setDatabaseEncryptionKey(newEncryptionKey: ByteArray): TdlResult<Ok> {
        val function = SetDatabaseEncryptionKey(
            newEncryptionKey = newEncryptionKey,
        )
        return repository.send(function = function)
    }

    override suspend fun setDefaultBackground(
        background: InputBackground?,
        type: BackgroundType?,
        forDarkTheme: Boolean,
    ): TdlResult<Background> {
        val function = SetDefaultBackground(
            background = background,
            type = type,
            forDarkTheme = forDarkTheme,
        )
        return repository.send(function = function)
    }

    override suspend fun setDefaultChannelAdministratorRights(defaultChannelAdministratorRights: ChatAdministratorRights?): TdlResult<Ok> {
        val function = SetDefaultChannelAdministratorRights(
            defaultChannelAdministratorRights = defaultChannelAdministratorRights,
        )
        return repository.send(function = function)
    }

    override suspend fun setDefaultGroupAdministratorRights(defaultGroupAdministratorRights: ChatAdministratorRights?): TdlResult<Ok> {
        val function = SetDefaultGroupAdministratorRights(
            defaultGroupAdministratorRights = defaultGroupAdministratorRights,
        )
        return repository.send(function = function)
    }

    override suspend fun setDefaultMessageAutoDeleteTime(messageAutoDeleteTime: MessageAutoDeleteTime): TdlResult<Ok> {
        val function = SetDefaultMessageAutoDeleteTime(
            messageAutoDeleteTime = messageAutoDeleteTime,
        )
        return repository.send(function = function)
    }

    override suspend fun setDefaultReactionType(reactionType: ReactionType): TdlResult<Ok> {
        val function = SetDefaultReactionType(
            reactionType = reactionType,
        )
        return repository.send(function = function)
    }

    override suspend fun setDirectMessagesChatTopicIsMarkedAsUnread(
        chatId: Long,
        topicId: Long,
        isMarkedAsUnread: Boolean,
    ): TdlResult<Ok> {
        val function = SetDirectMessagesChatTopicIsMarkedAsUnread(
            chatId = chatId,
            topicId = topicId,
            isMarkedAsUnread = isMarkedAsUnread,
        )
        return repository.send(function = function)
    }

    override suspend fun setEmojiStatus(emojiStatus: EmojiStatus?): TdlResult<Ok> {
        val function = SetEmojiStatus(
            emojiStatus = emojiStatus,
        )
        return repository.send(function = function)
    }

    override suspend fun setFileGenerationProgress(
        generationId: Long,
        expectedSize: Long,
        localPrefixSize: Long,
    ): TdlResult<Ok> {
        val function = SetFileGenerationProgress(
            generationId = generationId,
            expectedSize = expectedSize,
            localPrefixSize = localPrefixSize,
        )
        return repository.send(function = function)
    }

    override suspend fun setForumTopicNotificationSettings(
        chatId: Long,
        forumTopicId: Int,
        notificationSettings: ChatNotificationSettings,
    ): TdlResult<Ok> {
        val function = SetForumTopicNotificationSettings(
            chatId = chatId,
            forumTopicId = forumTopicId,
            notificationSettings = notificationSettings,
        )
        return repository.send(function = function)
    }

    override suspend fun setGameScore(
        chatId: Long,
        messageId: Long,
        editMessage: Boolean,
        userId: Long,
        score: Int,
        force: Boolean,
    ): TdlResult<Message> {
        val function = SetGameScore(
            chatId = chatId,
            messageId = messageId,
            editMessage = editMessage,
            userId = userId,
            score = score,
            force = force,
        )
        return repository.send(function = function)
    }

    override suspend fun setGiftCollectionName(
        ownerId: MessageSender,
        collectionId: Int,
        name: String,
    ): TdlResult<GiftCollection> {
        val function = SetGiftCollectionName(
            ownerId = ownerId,
            collectionId = collectionId,
            name = name,
        )
        return repository.send(function = function)
    }

    override suspend fun setGiftResalePrice(receivedGiftId: String, price: GiftResalePrice?): TdlResult<Ok> {
        val function = SetGiftResalePrice(
            receivedGiftId = receivedGiftId,
            price = price,
        )
        return repository.send(function = function)
    }

    override suspend fun setGiftSettings(settings: GiftSettings): TdlResult<Ok> {
        val function = SetGiftSettings(
            settings = settings,
        )
        return repository.send(function = function)
    }

    override suspend fun setGroupCallPaidMessageStarCount(groupCallId: Int, paidMessageStarCount: Long): TdlResult<Ok> {
        val function = SetGroupCallPaidMessageStarCount(
            groupCallId = groupCallId,
            paidMessageStarCount = paidMessageStarCount,
        )
        return repository.send(function = function)
    }

    override suspend fun setGroupCallParticipantIsSpeaking(
        groupCallId: Int,
        audioSource: Int,
        isSpeaking: Boolean,
    ): TdlResult<MessageSender> {
        val function = SetGroupCallParticipantIsSpeaking(
            groupCallId = groupCallId,
            audioSource = audioSource,
            isSpeaking = isSpeaking,
        )
        return repository.send(function = function)
    }

    override suspend fun setGroupCallParticipantVolumeLevel(
        groupCallId: Int,
        participantId: MessageSender,
        volumeLevel: Int,
    ): TdlResult<Ok> {
        val function = SetGroupCallParticipantVolumeLevel(
            groupCallId = groupCallId,
            participantId = participantId,
            volumeLevel = volumeLevel,
        )
        return repository.send(function = function)
    }

    override suspend fun setInactiveSessionTtl(inactiveSessionTtlDays: Int): TdlResult<Ok> {
        val function = SetInactiveSessionTtl(
            inactiveSessionTtlDays = inactiveSessionTtlDays,
        )
        return repository.send(function = function)
    }

    override suspend fun setInlineGameScore(
        inlineMessageId: String,
        editMessage: Boolean,
        userId: Long,
        score: Int,
        force: Boolean,
    ): TdlResult<Ok> {
        val function = SetInlineGameScore(
            inlineMessageId = inlineMessageId,
            editMessage = editMessage,
            userId = userId,
            score = score,
            force = force,
        )
        return repository.send(function = function)
    }

    override suspend fun setLiveStoryMessageSender(groupCallId: Int, messageSenderId: MessageSender): TdlResult<Ok> {
        val function = SetLiveStoryMessageSender(
            groupCallId = groupCallId,
            messageSenderId = messageSenderId,
        )
        return repository.send(function = function)
    }

    override suspend fun setLogStream(logStream: LogStream): TdlResult<Ok> {
        val function = SetLogStream(
            logStream = logStream,
        )
        return repository.send(function = function)
    }

    override suspend fun setLogTagVerbosityLevel(tag: String, newVerbosityLevel: Int): TdlResult<Ok> {
        val function = SetLogTagVerbosityLevel(
            tag = tag,
            newVerbosityLevel = newVerbosityLevel,
        )
        return repository.send(function = function)
    }

    override suspend fun setLogVerbosityLevel(newVerbosityLevel: Int): TdlResult<Ok> {
        val function = SetLogVerbosityLevel(
            newVerbosityLevel = newVerbosityLevel,
        )
        return repository.send(function = function)
    }

    override suspend fun setLoginEmailAddress(newLoginEmailAddress: String): TdlResult<EmailAddressAuthenticationCodeInfo> {
        val function = SetLoginEmailAddress(
            newLoginEmailAddress = newLoginEmailAddress,
        )
        return repository.send(function = function)
    }

    override suspend fun setMainProfileTab(mainProfileTab: ProfileTab): TdlResult<Ok> {
        val function = SetMainProfileTab(
            mainProfileTab = mainProfileTab,
        )
        return repository.send(function = function)
    }

    override suspend fun setMenuButton(userId: Long, menuButton: BotMenuButton): TdlResult<Ok> {
        val function = SetMenuButton(
            userId = userId,
            menuButton = menuButton,
        )
        return repository.send(function = function)
    }

    override suspend fun setMessageFactCheck(
        chatId: Long,
        messageId: Long,
        text: FormattedText?,
    ): TdlResult<Ok> {
        val function = SetMessageFactCheck(
            chatId = chatId,
            messageId = messageId,
            text = text,
        )
        return repository.send(function = function)
    }

    override suspend fun setMessageReactions(
        chatId: Long,
        messageId: Long,
        reactionTypes: Array<ReactionType>,
        isBig: Boolean,
    ): TdlResult<Ok> {
        val function = SetMessageReactions(
            chatId = chatId,
            messageId = messageId,
            reactionTypes = reactionTypes,
            isBig = isBig,
        )
        return repository.send(function = function)
    }

    override suspend fun setMessageSenderBlockList(senderId: MessageSender, blockList: BlockList?): TdlResult<Ok> {
        val function = SetMessageSenderBlockList(
            senderId = senderId,
            blockList = blockList,
        )
        return repository.send(function = function)
    }

    override suspend fun setMessageSenderBotVerification(
        botUserId: Long,
        verifiedId: MessageSender,
        customDescription: String,
    ): TdlResult<Ok> {
        val function = SetMessageSenderBotVerification(
            botUserId = botUserId,
            verifiedId = verifiedId,
            customDescription = customDescription,
        )
        return repository.send(function = function)
    }

    override suspend fun setName(firstName: String, lastName: String): TdlResult<Ok> {
        val function = SetName(
            firstName = firstName,
            lastName = lastName,
        )
        return repository.send(function = function)
    }

    override suspend fun setNetworkType(type: NetworkType?): TdlResult<Ok> {
        val function = SetNetworkType(
            type = type,
        )
        return repository.send(function = function)
    }

    override suspend fun setNewChatPrivacySettings(settings: NewChatPrivacySettings): TdlResult<Ok> {
        val function = SetNewChatPrivacySettings(
            settings = settings,
        )
        return repository.send(function = function)
    }

    override suspend fun setOption(name: String, value: OptionValue?): TdlResult<Ok> {
        val function = SetOption(
            name = name,
            value = value,
        )
        return repository.send(function = function)
    }

    override suspend fun setPaidMessageReactionType(
        chatId: Long,
        messageId: Long,
        type: PaidReactionType,
    ): TdlResult<Ok> {
        val function = SetPaidMessageReactionType(
            chatId = chatId,
            messageId = messageId,
            type = type,
        )
        return repository.send(function = function)
    }

    override suspend fun setPassportElement(element: InputPassportElement, password: String): TdlResult<PassportElement> {
        val function = SetPassportElement(
            element = element,
            password = password,
        )
        return repository.send(function = function)
    }

    override suspend fun setPassportElementErrors(userId: Long, errors: Array<InputPassportElementError>): TdlResult<Ok> {
        val function = SetPassportElementErrors(
            userId = userId,
            errors = errors,
        )
        return repository.send(function = function)
    }

    override suspend fun setPassword(
        oldPassword: String,
        newPassword: String,
        newHint: String,
        setRecoveryEmailAddress: Boolean,
        newRecoveryEmailAddress: String,
    ): TdlResult<PasswordState> {
        val function = SetPassword(
            oldPassword = oldPassword,
            newPassword = newPassword,
            newHint = newHint,
            setRecoveryEmailAddress = setRecoveryEmailAddress,
            newRecoveryEmailAddress = newRecoveryEmailAddress,
        )
        return repository.send(function = function)
    }

    override suspend fun setPersonalChat(chatId: Long): TdlResult<Ok> {
        val function = SetPersonalChat(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun setPinnedChats(chatList: ChatList, chatIds: LongArray): TdlResult<Ok> {
        val function = SetPinnedChats(
            chatList = chatList,
            chatIds = chatIds,
        )
        return repository.send(function = function)
    }

    override suspend fun setPinnedForumTopics(chatId: Long, forumTopicIds: IntArray): TdlResult<Ok> {
        val function = SetPinnedForumTopics(
            chatId = chatId,
            forumTopicIds = forumTopicIds,
        )
        return repository.send(function = function)
    }

    override suspend fun setPinnedGifts(ownerId: MessageSender, receivedGiftIds: Array<String>): TdlResult<Ok> {
        val function = SetPinnedGifts(
            ownerId = ownerId,
            receivedGiftIds = receivedGiftIds,
        )
        return repository.send(function = function)
    }

    override suspend fun setPinnedSavedMessagesTopics(savedMessagesTopicIds: LongArray): TdlResult<Ok> {
        val function = SetPinnedSavedMessagesTopics(
            savedMessagesTopicIds = savedMessagesTopicIds,
        )
        return repository.send(function = function)
    }

    override suspend fun setPollAnswer(
        chatId: Long,
        messageId: Long,
        optionIds: IntArray,
    ): TdlResult<Ok> {
        val function = SetPollAnswer(
            chatId = chatId,
            messageId = messageId,
            optionIds = optionIds,
        )
        return repository.send(function = function)
    }

    override suspend fun setProfileAccentColor(profileAccentColorId: Int, profileBackgroundCustomEmojiId: Long): TdlResult<Ok> {
        val function = SetProfileAccentColor(
            profileAccentColorId = profileAccentColorId,
            profileBackgroundCustomEmojiId = profileBackgroundCustomEmojiId,
        )
        return repository.send(function = function)
    }

    override suspend fun setProfileAudioPosition(fileId: Int, afterFileId: Int): TdlResult<Ok> {
        val function = SetProfileAudioPosition(
            fileId = fileId,
            afterFileId = afterFileId,
        )
        return repository.send(function = function)
    }

    override suspend fun setProfilePhoto(photo: InputChatPhoto, isPublic: Boolean): TdlResult<Ok> {
        val function = SetProfilePhoto(
            photo = photo,
            isPublic = isPublic,
        )
        return repository.send(function = function)
    }

    override suspend fun setQuickReplyShortcutName(shortcutId: Int, name: String): TdlResult<Ok> {
        val function = SetQuickReplyShortcutName(
            shortcutId = shortcutId,
            name = name,
        )
        return repository.send(function = function)
    }

    override suspend fun setReactionNotificationSettings(notificationSettings: ReactionNotificationSettings): TdlResult<Ok> {
        val function = SetReactionNotificationSettings(
            notificationSettings = notificationSettings,
        )
        return repository.send(function = function)
    }

    override suspend fun setReadDatePrivacySettings(settings: ReadDatePrivacySettings): TdlResult<Ok> {
        val function = SetReadDatePrivacySettings(
            settings = settings,
        )
        return repository.send(function = function)
    }

    override suspend fun setRecoveryEmailAddress(password: String, newRecoveryEmailAddress: String): TdlResult<PasswordState> {
        val function = SetRecoveryEmailAddress(
            password = password,
            newRecoveryEmailAddress = newRecoveryEmailAddress,
        )
        return repository.send(function = function)
    }

    override suspend fun setSavedMessagesTagLabel(tag: ReactionType, label: String): TdlResult<Ok> {
        val function = SetSavedMessagesTagLabel(
            tag = tag,
            label = label,
        )
        return repository.send(function = function)
    }

    override suspend fun setScopeNotificationSettings(scope: NotificationSettingsScope, notificationSettings: ScopeNotificationSettings): TdlResult<Ok> {
        val function = SetScopeNotificationSettings(
            scope = scope,
            notificationSettings = notificationSettings,
        )
        return repository.send(function = function)
    }

    override suspend fun setStickerEmojis(sticker: InputFile, emojis: String): TdlResult<Ok> {
        val function = SetStickerEmojis(
            sticker = sticker,
            emojis = emojis,
        )
        return repository.send(function = function)
    }

    override suspend fun setStickerKeywords(sticker: InputFile, keywords: Array<String>): TdlResult<Ok> {
        val function = SetStickerKeywords(
            sticker = sticker,
            keywords = keywords,
        )
        return repository.send(function = function)
    }

    override suspend fun setStickerMaskPosition(sticker: InputFile, maskPosition: MaskPosition?): TdlResult<Ok> {
        val function = SetStickerMaskPosition(
            sticker = sticker,
            maskPosition = maskPosition,
        )
        return repository.send(function = function)
    }

    override suspend fun setStickerPositionInSet(sticker: InputFile, position: Int): TdlResult<Ok> {
        val function = SetStickerPositionInSet(
            sticker = sticker,
            position = position,
        )
        return repository.send(function = function)
    }

    override suspend fun setStickerSetThumbnail(
        userId: Long,
        name: String,
        thumbnail: InputFile?,
        format: StickerFormat?,
    ): TdlResult<Ok> {
        val function = SetStickerSetThumbnail(
            userId = userId,
            name = name,
            thumbnail = thumbnail,
            format = format,
        )
        return repository.send(function = function)
    }

    override suspend fun setStickerSetTitle(name: String, title: String): TdlResult<Ok> {
        val function = SetStickerSetTitle(
            name = name,
            title = title,
        )
        return repository.send(function = function)
    }

    override suspend fun setStoryAlbumName(
        chatId: Long,
        storyAlbumId: Int,
        name: String,
    ): TdlResult<StoryAlbum> {
        val function = SetStoryAlbumName(
            chatId = chatId,
            storyAlbumId = storyAlbumId,
            name = name,
        )
        return repository.send(function = function)
    }

    override suspend fun setStoryPrivacySettings(storyId: Int, privacySettings: StoryPrivacySettings): TdlResult<Ok> {
        val function = SetStoryPrivacySettings(
            storyId = storyId,
            privacySettings = privacySettings,
        )
        return repository.send(function = function)
    }

    override suspend fun setStoryReaction(
        storyPosterChatId: Long,
        storyId: Int,
        reactionType: ReactionType?,
        updateRecentReactions: Boolean,
    ): TdlResult<Ok> {
        val function = SetStoryReaction(
            storyPosterChatId = storyPosterChatId,
            storyId = storyId,
            reactionType = reactionType,
            updateRecentReactions = updateRecentReactions,
        )
        return repository.send(function = function)
    }

    override suspend fun setSupergroupCustomEmojiStickerSet(supergroupId: Long, customEmojiStickerSetId: Long): TdlResult<Ok> {
        val function = SetSupergroupCustomEmojiStickerSet(
            supergroupId = supergroupId,
            customEmojiStickerSetId = customEmojiStickerSetId,
        )
        return repository.send(function = function)
    }

    override suspend fun setSupergroupMainProfileTab(supergroupId: Long, mainProfileTab: ProfileTab): TdlResult<Ok> {
        val function = SetSupergroupMainProfileTab(
            supergroupId = supergroupId,
            mainProfileTab = mainProfileTab,
        )
        return repository.send(function = function)
    }

    override suspend fun setSupergroupStickerSet(supergroupId: Long, stickerSetId: Long): TdlResult<Ok> {
        val function = SetSupergroupStickerSet(
            supergroupId = supergroupId,
            stickerSetId = stickerSetId,
        )
        return repository.send(function = function)
    }

    override suspend fun setSupergroupUnrestrictBoostCount(supergroupId: Long, unrestrictBoostCount: Int): TdlResult<Ok> {
        val function = SetSupergroupUnrestrictBoostCount(
            supergroupId = supergroupId,
            unrestrictBoostCount = unrestrictBoostCount,
        )
        return repository.send(function = function)
    }

    override suspend fun setSupergroupUsername(supergroupId: Long, username: String): TdlResult<Ok> {
        val function = SetSupergroupUsername(
            supergroupId = supergroupId,
            username = username,
        )
        return repository.send(function = function)
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
        val function = SetTdlibParameters(
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
        return repository.send(function = function)
    }

    override suspend fun setUpgradedGiftColors(upgradedGiftColorsId: Long): TdlResult<Ok> {
        val function = SetUpgradedGiftColors(
            upgradedGiftColorsId = upgradedGiftColorsId,
        )
        return repository.send(function = function)
    }

    override suspend fun setUserEmojiStatus(userId: Long, emojiStatus: EmojiStatus?): TdlResult<Ok> {
        val function = SetUserEmojiStatus(
            userId = userId,
            emojiStatus = emojiStatus,
        )
        return repository.send(function = function)
    }

    override suspend fun setUserNote(userId: Long, note: FormattedText): TdlResult<Ok> {
        val function = SetUserNote(
            userId = userId,
            note = note,
        )
        return repository.send(function = function)
    }

    override suspend fun setUserPersonalProfilePhoto(userId: Long, photo: InputChatPhoto?): TdlResult<Ok> {
        val function = SetUserPersonalProfilePhoto(
            userId = userId,
            photo = photo,
        )
        return repository.send(function = function)
    }

    override suspend fun setUserPrivacySettingRules(setting: UserPrivacySetting, rules: UserPrivacySettingRules): TdlResult<Ok> {
        val function = SetUserPrivacySettingRules(
            setting = setting,
            rules = rules,
        )
        return repository.send(function = function)
    }

    override suspend fun setUserSupportInfo(userId: Long, message: FormattedText): TdlResult<UserSupportInfo> {
        val function = SetUserSupportInfo(
            userId = userId,
            message = message,
        )
        return repository.send(function = function)
    }

    override suspend fun setUsername(username: String): TdlResult<Ok> {
        val function = SetUsername(
            username = username,
        )
        return repository.send(function = function)
    }

    override suspend fun setVideoChatDefaultParticipant(chatId: Long, defaultParticipantId: MessageSender): TdlResult<Ok> {
        val function = SetVideoChatDefaultParticipant(
            chatId = chatId,
            defaultParticipantId = defaultParticipantId,
        )
        return repository.send(function = function)
    }

    override suspend fun setVideoChatTitle(groupCallId: Int, title: String): TdlResult<Ok> {
        val function = SetVideoChatTitle(
            groupCallId = groupCallId,
            title = title,
        )
        return repository.send(function = function)
    }

    override suspend fun shareChatWithBot(
        chatId: Long,
        messageId: Long,
        buttonId: Int,
        sharedChatId: Long,
        onlyCheck: Boolean,
    ): TdlResult<Ok> {
        val function = ShareChatWithBot(
            chatId = chatId,
            messageId = messageId,
            buttonId = buttonId,
            sharedChatId = sharedChatId,
            onlyCheck = onlyCheck,
        )
        return repository.send(function = function)
    }

    override suspend fun sharePhoneNumber(userId: Long): TdlResult<Ok> {
        val function = SharePhoneNumber(
            userId = userId,
        )
        return repository.send(function = function)
    }

    override suspend fun shareUsersWithBot(
        chatId: Long,
        messageId: Long,
        buttonId: Int,
        sharedUserIds: LongArray,
        onlyCheck: Boolean,
    ): TdlResult<Ok> {
        val function = ShareUsersWithBot(
            chatId = chatId,
            messageId = messageId,
            buttonId = buttonId,
            sharedUserIds = sharedUserIds,
            onlyCheck = onlyCheck,
        )
        return repository.send(function = function)
    }

    override suspend fun startGroupCallRecording(
        groupCallId: Int,
        title: String,
        recordVideo: Boolean,
        usePortraitOrientation: Boolean,
    ): TdlResult<Ok> {
        val function = StartGroupCallRecording(
            groupCallId = groupCallId,
            title = title,
            recordVideo = recordVideo,
            usePortraitOrientation = usePortraitOrientation,
        )
        return repository.send(function = function)
    }

    override suspend fun startGroupCallScreenSharing(
        groupCallId: Int,
        audioSourceId: Int,
        payload: String,
    ): TdlResult<Text> {
        val function = StartGroupCallScreenSharing(
            groupCallId = groupCallId,
            audioSourceId = audioSourceId,
            payload = payload,
        )
        return repository.send(function = function)
    }

    override suspend fun startLiveStory(
        chatId: Long,
        privacySettings: StoryPrivacySettings,
        protectContent: Boolean,
        isRtmpStream: Boolean,
        enableMessages: Boolean,
        paidMessageStarCount: Long,
    ): TdlResult<StartLiveStoryResult> {
        val function = StartLiveStory(
            chatId = chatId,
            privacySettings = privacySettings,
            protectContent = protectContent,
            isRtmpStream = isRtmpStream,
            enableMessages = enableMessages,
            paidMessageStarCount = paidMessageStarCount,
        )
        return repository.send(function = function)
    }

    override suspend fun startScheduledVideoChat(groupCallId: Int): TdlResult<Ok> {
        val function = StartScheduledVideoChat(
            groupCallId = groupCallId,
        )
        return repository.send(function = function)
    }

    override suspend fun stopBusinessPoll(
        businessConnectionId: String,
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
    ): TdlResult<BusinessMessage> {
        val function = StopBusinessPoll(
            businessConnectionId = businessConnectionId,
            chatId = chatId,
            messageId = messageId,
            replyMarkup = replyMarkup,
        )
        return repository.send(function = function)
    }

    override suspend fun stopPoll(
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkup?,
    ): TdlResult<Ok> {
        val function = StopPoll(
            chatId = chatId,
            messageId = messageId,
            replyMarkup = replyMarkup,
        )
        return repository.send(function = function)
    }

    override suspend fun suggestUserBirthdate(userId: Long, birthdate: Birthdate): TdlResult<Ok> {
        val function = SuggestUserBirthdate(
            userId = userId,
            birthdate = birthdate,
        )
        return repository.send(function = function)
    }

    override suspend fun suggestUserProfilePhoto(userId: Long, photo: InputChatPhoto): TdlResult<Ok> {
        val function = SuggestUserProfilePhoto(
            userId = userId,
            photo = photo,
        )
        return repository.send(function = function)
    }

    override suspend fun synchronizeLanguagePack(languagePackId: String): TdlResult<Ok> {
        val function = SynchronizeLanguagePack(
            languagePackId = languagePackId,
        )
        return repository.send(function = function)
    }

    override suspend fun terminateAllOtherSessions(): TdlResult<Ok> {
        val function = TerminateAllOtherSessions()
        return repository.send(function = function)
    }

    override suspend fun terminateSession(sessionId: Long): TdlResult<Ok> {
        val function = TerminateSession(
            sessionId = sessionId,
        )
        return repository.send(function = function)
    }

    override suspend fun testCallBytes(x: ByteArray): TdlResult<TestBytes> {
        val function = TestCallBytes(
            x = x,
        )
        return repository.send(function = function)
    }

    override suspend fun testCallEmpty(): TdlResult<Ok> {
        val function = TestCallEmpty()
        return repository.send(function = function)
    }

    override suspend fun testCallString(x: String): TdlResult<TestString> {
        val function = TestCallString(
            x = x,
        )
        return repository.send(function = function)
    }

    override suspend fun testCallVectorInt(x: IntArray): TdlResult<TestVectorInt> {
        val function = TestCallVectorInt(
            x = x,
        )
        return repository.send(function = function)
    }

    override suspend fun testCallVectorIntObject(x: Array<TestInt>): TdlResult<TestVectorIntObject> {
        val function = TestCallVectorIntObject(
            x = x,
        )
        return repository.send(function = function)
    }

    override suspend fun testCallVectorString(x: Array<String>): TdlResult<TestVectorString> {
        val function = TestCallVectorString(
            x = x,
        )
        return repository.send(function = function)
    }

    override suspend fun testCallVectorStringObject(x: Array<TestString>): TdlResult<TestVectorStringObject> {
        val function = TestCallVectorStringObject(
            x = x,
        )
        return repository.send(function = function)
    }

    override suspend fun testGetDifference(): TdlResult<Ok> {
        val function = TestGetDifference()
        return repository.send(function = function)
    }

    override suspend fun testNetwork(): TdlResult<Ok> {
        val function = TestNetwork()
        return repository.send(function = function)
    }

    override suspend fun testProxy(
        server: String,
        port: Int,
        type: ProxyType,
        dcId: Int,
        timeout: Double,
    ): TdlResult<Ok> {
        val function = TestProxy(
            server = server,
            port = port,
            type = type,
            dcId = dcId,
            timeout = timeout,
        )
        return repository.send(function = function)
    }

    override suspend fun testReturnError(error: Error): TdlResult<Error> {
        val function = TestReturnError(
            error = error,
        )
        return repository.send(function = function)
    }

    override suspend fun testSquareInt(x: Int): TdlResult<TestInt> {
        val function = TestSquareInt(
            x = x,
        )
        return repository.send(function = function)
    }

    override suspend fun testUseUpdate(): TdlResult<Update> {
        val function = TestUseUpdate()
        return repository.send(function = function)
    }

    override suspend fun toggleAllDownloadsArePaused(arePaused: Boolean): TdlResult<Ok> {
        val function = ToggleAllDownloadsArePaused(
            arePaused = arePaused,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleBotCanManageEmojiStatus(botUserId: Long, canManageEmojiStatus: Boolean): TdlResult<Ok> {
        val function = ToggleBotCanManageEmojiStatus(
            botUserId = botUserId,
            canManageEmojiStatus = canManageEmojiStatus,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleBotIsAddedToAttachmentMenu(
        botUserId: Long,
        isAdded: Boolean,
        allowWriteAccess: Boolean,
    ): TdlResult<Ok> {
        val function = ToggleBotIsAddedToAttachmentMenu(
            botUserId = botUserId,
            isAdded = isAdded,
            allowWriteAccess = allowWriteAccess,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleBotUsernameIsActive(
        botUserId: Long,
        username: String,
        isActive: Boolean,
    ): TdlResult<Ok> {
        val function = ToggleBotUsernameIsActive(
            botUserId = botUserId,
            username = username,
            isActive = isActive,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleBusinessConnectedBotChatIsPaused(chatId: Long, isPaused: Boolean): TdlResult<Ok> {
        val function = ToggleBusinessConnectedBotChatIsPaused(
            chatId = chatId,
            isPaused = isPaused,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleChatDefaultDisableNotification(chatId: Long, defaultDisableNotification: Boolean): TdlResult<Ok> {
        val function = ToggleChatDefaultDisableNotification(
            chatId = chatId,
            defaultDisableNotification = defaultDisableNotification,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleChatFolderTags(areTagsEnabled: Boolean): TdlResult<Ok> {
        val function = ToggleChatFolderTags(
            areTagsEnabled = areTagsEnabled,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleChatGiftNotifications(chatId: Long, areEnabled: Boolean): TdlResult<Ok> {
        val function = ToggleChatGiftNotifications(
            chatId = chatId,
            areEnabled = areEnabled,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleChatHasProtectedContent(chatId: Long, hasProtectedContent: Boolean): TdlResult<Ok> {
        val function = ToggleChatHasProtectedContent(
            chatId = chatId,
            hasProtectedContent = hasProtectedContent,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleChatIsMarkedAsUnread(chatId: Long, isMarkedAsUnread: Boolean): TdlResult<Ok> {
        val function = ToggleChatIsMarkedAsUnread(
            chatId = chatId,
            isMarkedAsUnread = isMarkedAsUnread,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleChatIsPinned(
        chatList: ChatList,
        chatId: Long,
        isPinned: Boolean,
    ): TdlResult<Ok> {
        val function = ToggleChatIsPinned(
            chatList = chatList,
            chatId = chatId,
            isPinned = isPinned,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleChatIsTranslatable(chatId: Long, isTranslatable: Boolean): TdlResult<Ok> {
        val function = ToggleChatIsTranslatable(
            chatId = chatId,
            isTranslatable = isTranslatable,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleChatViewAsTopics(chatId: Long, viewAsTopics: Boolean): TdlResult<Ok> {
        val function = ToggleChatViewAsTopics(
            chatId = chatId,
            viewAsTopics = viewAsTopics,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleDirectMessagesChatTopicCanSendUnpaidMessages(
        chatId: Long,
        topicId: Long,
        canSendUnpaidMessages: Boolean,
        refundPayments: Boolean,
    ): TdlResult<Ok> {
        val function = ToggleDirectMessagesChatTopicCanSendUnpaidMessages(
            chatId = chatId,
            topicId = topicId,
            canSendUnpaidMessages = canSendUnpaidMessages,
            refundPayments = refundPayments,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleDownloadIsPaused(fileId: Int, isPaused: Boolean): TdlResult<Ok> {
        val function = ToggleDownloadIsPaused(
            fileId = fileId,
            isPaused = isPaused,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleForumTopicIsClosed(
        chatId: Long,
        forumTopicId: Int,
        isClosed: Boolean,
    ): TdlResult<Ok> {
        val function = ToggleForumTopicIsClosed(
            chatId = chatId,
            forumTopicId = forumTopicId,
            isClosed = isClosed,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleForumTopicIsPinned(
        chatId: Long,
        forumTopicId: Int,
        isPinned: Boolean,
    ): TdlResult<Ok> {
        val function = ToggleForumTopicIsPinned(
            chatId = chatId,
            forumTopicId = forumTopicId,
            isPinned = isPinned,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleGeneralForumTopicIsHidden(chatId: Long, isHidden: Boolean): TdlResult<Ok> {
        val function = ToggleGeneralForumTopicIsHidden(
            chatId = chatId,
            isHidden = isHidden,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleGiftIsSaved(receivedGiftId: String, isSaved: Boolean): TdlResult<Ok> {
        val function = ToggleGiftIsSaved(
            receivedGiftId = receivedGiftId,
            isSaved = isSaved,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleGroupCallAreMessagesAllowed(groupCallId: Int, areMessagesAllowed: Boolean): TdlResult<Ok> {
        val function = ToggleGroupCallAreMessagesAllowed(
            groupCallId = groupCallId,
            areMessagesAllowed = areMessagesAllowed,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleGroupCallIsMyVideoEnabled(groupCallId: Int, isMyVideoEnabled: Boolean): TdlResult<Ok> {
        val function = ToggleGroupCallIsMyVideoEnabled(
            groupCallId = groupCallId,
            isMyVideoEnabled = isMyVideoEnabled,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleGroupCallIsMyVideoPaused(groupCallId: Int, isMyVideoPaused: Boolean): TdlResult<Ok> {
        val function = ToggleGroupCallIsMyVideoPaused(
            groupCallId = groupCallId,
            isMyVideoPaused = isMyVideoPaused,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleGroupCallParticipantIsHandRaised(
        groupCallId: Int,
        participantId: MessageSender,
        isHandRaised: Boolean,
    ): TdlResult<Ok> {
        val function = ToggleGroupCallParticipantIsHandRaised(
            groupCallId = groupCallId,
            participantId = participantId,
            isHandRaised = isHandRaised,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleGroupCallParticipantIsMuted(
        groupCallId: Int,
        participantId: MessageSender,
        isMuted: Boolean,
    ): TdlResult<Ok> {
        val function = ToggleGroupCallParticipantIsMuted(
            groupCallId = groupCallId,
            participantId = participantId,
            isMuted = isMuted,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleGroupCallScreenSharingIsPaused(groupCallId: Int, isPaused: Boolean): TdlResult<Ok> {
        val function = ToggleGroupCallScreenSharingIsPaused(
            groupCallId = groupCallId,
            isPaused = isPaused,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleHasSponsoredMessagesEnabled(hasSponsoredMessagesEnabled: Boolean): TdlResult<Ok> {
        val function = ToggleHasSponsoredMessagesEnabled(
            hasSponsoredMessagesEnabled = hasSponsoredMessagesEnabled,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleSavedMessagesTopicIsPinned(savedMessagesTopicId: Long, isPinned: Boolean): TdlResult<Ok> {
        val function = ToggleSavedMessagesTopicIsPinned(
            savedMessagesTopicId = savedMessagesTopicId,
            isPinned = isPinned,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleSessionCanAcceptCalls(sessionId: Long, canAcceptCalls: Boolean): TdlResult<Ok> {
        val function = ToggleSessionCanAcceptCalls(
            sessionId = sessionId,
            canAcceptCalls = canAcceptCalls,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleSessionCanAcceptSecretChats(sessionId: Long, canAcceptSecretChats: Boolean): TdlResult<Ok> {
        val function = ToggleSessionCanAcceptSecretChats(
            sessionId = sessionId,
            canAcceptSecretChats = canAcceptSecretChats,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleStoryIsPostedToChatPage(
        storyPosterChatId: Long,
        storyId: Int,
        isPostedToChatPage: Boolean,
    ): TdlResult<Ok> {
        val function = ToggleStoryIsPostedToChatPage(
            storyPosterChatId = storyPosterChatId,
            storyId = storyId,
            isPostedToChatPage = isPostedToChatPage,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleSupergroupCanHaveSponsoredMessages(supergroupId: Long, canHaveSponsoredMessages: Boolean): TdlResult<Ok> {
        val function = ToggleSupergroupCanHaveSponsoredMessages(
            supergroupId = supergroupId,
            canHaveSponsoredMessages = canHaveSponsoredMessages,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleSupergroupHasAggressiveAntiSpamEnabled(supergroupId: Long, hasAggressiveAntiSpamEnabled: Boolean): TdlResult<Ok> {
        val function = ToggleSupergroupHasAggressiveAntiSpamEnabled(
            supergroupId = supergroupId,
            hasAggressiveAntiSpamEnabled = hasAggressiveAntiSpamEnabled,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleSupergroupHasAutomaticTranslation(supergroupId: Long, hasAutomaticTranslation: Boolean): TdlResult<Ok> {
        val function = ToggleSupergroupHasAutomaticTranslation(
            supergroupId = supergroupId,
            hasAutomaticTranslation = hasAutomaticTranslation,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleSupergroupHasHiddenMembers(supergroupId: Long, hasHiddenMembers: Boolean): TdlResult<Ok> {
        val function = ToggleSupergroupHasHiddenMembers(
            supergroupId = supergroupId,
            hasHiddenMembers = hasHiddenMembers,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleSupergroupIsAllHistoryAvailable(supergroupId: Long, isAllHistoryAvailable: Boolean): TdlResult<Ok> {
        val function = ToggleSupergroupIsAllHistoryAvailable(
            supergroupId = supergroupId,
            isAllHistoryAvailable = isAllHistoryAvailable,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleSupergroupIsBroadcastGroup(supergroupId: Long): TdlResult<Ok> {
        val function = ToggleSupergroupIsBroadcastGroup(
            supergroupId = supergroupId,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleSupergroupIsForum(
        supergroupId: Long,
        isForum: Boolean,
        hasForumTabs: Boolean,
    ): TdlResult<Ok> {
        val function = ToggleSupergroupIsForum(
            supergroupId = supergroupId,
            isForum = isForum,
            hasForumTabs = hasForumTabs,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleSupergroupJoinByRequest(supergroupId: Long, joinByRequest: Boolean): TdlResult<Ok> {
        val function = ToggleSupergroupJoinByRequest(
            supergroupId = supergroupId,
            joinByRequest = joinByRequest,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleSupergroupJoinToSendMessages(supergroupId: Long, joinToSendMessages: Boolean): TdlResult<Ok> {
        val function = ToggleSupergroupJoinToSendMessages(
            supergroupId = supergroupId,
            joinToSendMessages = joinToSendMessages,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleSupergroupSignMessages(
        supergroupId: Long,
        signMessages: Boolean,
        showMessageSender: Boolean,
    ): TdlResult<Ok> {
        val function = ToggleSupergroupSignMessages(
            supergroupId = supergroupId,
            signMessages = signMessages,
            showMessageSender = showMessageSender,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleSupergroupUsernameIsActive(
        supergroupId: Long,
        username: String,
        isActive: Boolean,
    ): TdlResult<Ok> {
        val function = ToggleSupergroupUsernameIsActive(
            supergroupId = supergroupId,
            username = username,
            isActive = isActive,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleUsernameIsActive(username: String, isActive: Boolean): TdlResult<Ok> {
        val function = ToggleUsernameIsActive(
            username = username,
            isActive = isActive,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleVideoChatEnabledStartNotification(groupCallId: Int, enabledStartNotification: Boolean): TdlResult<Ok> {
        val function = ToggleVideoChatEnabledStartNotification(
            groupCallId = groupCallId,
            enabledStartNotification = enabledStartNotification,
        )
        return repository.send(function = function)
    }

    override suspend fun toggleVideoChatMuteNewParticipants(groupCallId: Int, muteNewParticipants: Boolean): TdlResult<Ok> {
        val function = ToggleVideoChatMuteNewParticipants(
            groupCallId = groupCallId,
            muteNewParticipants = muteNewParticipants,
        )
        return repository.send(function = function)
    }

    override suspend fun transferBusinessAccountStars(businessConnectionId: String, starCount: Long): TdlResult<Ok> {
        val function = TransferBusinessAccountStars(
            businessConnectionId = businessConnectionId,
            starCount = starCount,
        )
        return repository.send(function = function)
    }

    override suspend fun transferChatOwnership(
        chatId: Long,
        userId: Long,
        password: String,
    ): TdlResult<Ok> {
        val function = TransferChatOwnership(
            chatId = chatId,
            userId = userId,
            password = password,
        )
        return repository.send(function = function)
    }

    override suspend fun transferGift(
        businessConnectionId: String,
        receivedGiftId: String,
        newOwnerId: MessageSender,
        starCount: Long,
    ): TdlResult<Ok> {
        val function = TransferGift(
            businessConnectionId = businessConnectionId,
            receivedGiftId = receivedGiftId,
            newOwnerId = newOwnerId,
            starCount = starCount,
        )
        return repository.send(function = function)
    }

    override suspend fun translateMessageText(
        chatId: Long,
        messageId: Long,
        toLanguageCode: String,
    ): TdlResult<FormattedText> {
        val function = TranslateMessageText(
            chatId = chatId,
            messageId = messageId,
            toLanguageCode = toLanguageCode,
        )
        return repository.send(function = function)
    }

    override suspend fun translateText(text: FormattedText, toLanguageCode: String): TdlResult<FormattedText> {
        val function = TranslateText(
            text = text,
            toLanguageCode = toLanguageCode,
        )
        return repository.send(function = function)
    }

    override suspend fun unpinAllChatMessages(chatId: Long): TdlResult<Ok> {
        val function = UnpinAllChatMessages(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun unpinAllDirectMessagesChatTopicMessages(chatId: Long, topicId: Long): TdlResult<Ok> {
        val function = UnpinAllDirectMessagesChatTopicMessages(
            chatId = chatId,
            topicId = topicId,
        )
        return repository.send(function = function)
    }

    override suspend fun unpinAllForumTopicMessages(chatId: Long, forumTopicId: Int): TdlResult<Ok> {
        val function = UnpinAllForumTopicMessages(
            chatId = chatId,
            forumTopicId = forumTopicId,
        )
        return repository.send(function = function)
    }

    override suspend fun unpinChatMessage(chatId: Long, messageId: Long): TdlResult<Ok> {
        val function = UnpinChatMessage(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function = function)
    }

    override suspend fun upgradeBasicGroupChatToSupergroupChat(chatId: Long): TdlResult<Chat> {
        val function = UpgradeBasicGroupChatToSupergroupChat(
            chatId = chatId,
        )
        return repository.send(function = function)
    }

    override suspend fun upgradeGift(
        businessConnectionId: String,
        receivedGiftId: String,
        keepOriginalDetails: Boolean,
        starCount: Long,
    ): TdlResult<UpgradeGiftResult> {
        val function = UpgradeGift(
            businessConnectionId = businessConnectionId,
            receivedGiftId = receivedGiftId,
            keepOriginalDetails = keepOriginalDetails,
            starCount = starCount,
        )
        return repository.send(function = function)
    }

    override suspend fun uploadStickerFile(
        userId: Long,
        stickerFormat: StickerFormat,
        sticker: InputFile,
    ): TdlResult<File> {
        val function = UploadStickerFile(
            userId = userId,
            stickerFormat = stickerFormat,
            sticker = sticker,
        )
        return repository.send(function = function)
    }

    override suspend fun validateOrderInfo(
        inputInvoice: InputInvoice,
        orderInfo: OrderInfo?,
        allowSave: Boolean,
    ): TdlResult<ValidatedOrderInfo> {
        val function = ValidateOrderInfo(
            inputInvoice = inputInvoice,
            orderInfo = orderInfo,
            allowSave = allowSave,
        )
        return repository.send(function = function)
    }

    override suspend fun viewMessages(
        chatId: Long,
        messageIds: LongArray,
        source: MessageSource?,
        forceRead: Boolean,
    ): TdlResult<Ok> {
        val function = ViewMessages(
            chatId = chatId,
            messageIds = messageIds,
            source = source,
            forceRead = forceRead,
        )
        return repository.send(function = function)
    }

    override suspend fun viewPremiumFeature(feature: PremiumFeature): TdlResult<Ok> {
        val function = ViewPremiumFeature(
            feature = feature,
        )
        return repository.send(function = function)
    }

    override suspend fun viewSponsoredChat(sponsoredChatUniqueId: Long): TdlResult<Ok> {
        val function = ViewSponsoredChat(
            sponsoredChatUniqueId = sponsoredChatUniqueId,
        )
        return repository.send(function = function)
    }

    override suspend fun viewTrendingStickerSets(stickerSetIds: LongArray): TdlResult<Ok> {
        val function = ViewTrendingStickerSets(
            stickerSetIds = stickerSetIds,
        )
        return repository.send(function = function)
    }

    override suspend fun viewVideoMessageAdvertisement(advertisementUniqueId: Long): TdlResult<Ok> {
        val function = ViewVideoMessageAdvertisement(
            advertisementUniqueId = advertisementUniqueId,
        )
        return repository.send(function = function)
    }

    override suspend fun writeGeneratedFilePart(
        generationId: Long,
        offset: Long,
        data: ByteArray,
    ): TdlResult<Ok> {
        val function = WriteGeneratedFilePart(
            generationId = generationId,
            offset = offset,
            data = data,
        )
        return repository.send(function = function)
    }
}
