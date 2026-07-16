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

import dev.g000sha256.tdl.function.AcceptCall
import dev.g000sha256.tdl.function.AcceptOauthRequest
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
import dev.g000sha256.tdl.function.AddLoginPasskey
import dev.g000sha256.tdl.function.AddMessageReaction
import dev.g000sha256.tdl.function.AddNetworkStatistics
import dev.g000sha256.tdl.function.AddOffer
import dev.g000sha256.tdl.function.AddPendingLiveStoryReaction
import dev.g000sha256.tdl.function.AddPendingPaidMessageReaction
import dev.g000sha256.tdl.function.AddPollOption
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
import dev.g000sha256.tdl.function.AddTextCompositionStyle
import dev.g000sha256.tdl.function.AddWebBrowserSettingsException
import dev.g000sha256.tdl.function.AllowBotToSendMessages
import dev.g000sha256.tdl.function.AllowUnpaidMessagesFromUser
import dev.g000sha256.tdl.function.AnswerCallbackQuery
import dev.g000sha256.tdl.function.AnswerChatJoinRequestQuery
import dev.g000sha256.tdl.function.AnswerCustomQuery
import dev.g000sha256.tdl.function.AnswerGuestQuery
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
import dev.g000sha256.tdl.function.ChangeWebBrowserSettings
import dev.g000sha256.tdl.function.CheckAuthenticationBotToken
import dev.g000sha256.tdl.function.CheckAuthenticationCode
import dev.g000sha256.tdl.function.CheckAuthenticationEmailCode
import dev.g000sha256.tdl.function.CheckAuthenticationPasskey
import dev.g000sha256.tdl.function.CheckAuthenticationPassword
import dev.g000sha256.tdl.function.CheckAuthenticationPasswordRecoveryCode
import dev.g000sha256.tdl.function.CheckAuthenticationPremiumPurchase
import dev.g000sha256.tdl.function.CheckAuthenticationWebToken
import dev.g000sha256.tdl.function.CheckBotUsername
import dev.g000sha256.tdl.function.CheckChatFolderInviteLink
import dev.g000sha256.tdl.function.CheckChatInviteLink
import dev.g000sha256.tdl.function.CheckChatUsername
import dev.g000sha256.tdl.function.CheckCreatedPublicChatsLimit
import dev.g000sha256.tdl.function.CheckEmailAddressVerificationCode
import dev.g000sha256.tdl.function.CheckLoginEmailAddressCode
import dev.g000sha256.tdl.function.CheckOauthRequestMatchCode
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
import dev.g000sha256.tdl.function.ComposeRichMessageWithAi
import dev.g000sha256.tdl.function.ComposeTextWithAi
import dev.g000sha256.tdl.function.ConfirmBusinessConnectedBot
import dev.g000sha256.tdl.function.ConfirmQrCodeAuthentication
import dev.g000sha256.tdl.function.ConfirmSession
import dev.g000sha256.tdl.function.ConnectAffiliateProgram
import dev.g000sha256.tdl.function.CraftGift
import dev.g000sha256.tdl.function.CreateBasicGroupChat
import dev.g000sha256.tdl.function.CreateBot
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
import dev.g000sha256.tdl.function.CreateRichMessageWithAi
import dev.g000sha256.tdl.function.CreateSecretChat
import dev.g000sha256.tdl.function.CreateStoryAlbum
import dev.g000sha256.tdl.function.CreateSupergroupChat
import dev.g000sha256.tdl.function.CreateTemporaryPassword
import dev.g000sha256.tdl.function.CreateTextCompositionStyle
import dev.g000sha256.tdl.function.CreateVideoChat
import dev.g000sha256.tdl.function.DeclineGroupCallInvitation
import dev.g000sha256.tdl.function.DeclineOauthRequest
import dev.g000sha256.tdl.function.DeclineSuggestedPost
import dev.g000sha256.tdl.function.DecryptGroupCallData
import dev.g000sha256.tdl.function.DeleteAccount
import dev.g000sha256.tdl.function.DeleteAllCallMessages
import dev.g000sha256.tdl.function.DeleteAllRecentMessageReactionsFromSender
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
import dev.g000sha256.tdl.function.DeleteEphemeralMessage
import dev.g000sha256.tdl.function.DeleteFile
import dev.g000sha256.tdl.function.DeleteForumTopic
import dev.g000sha256.tdl.function.DeleteGiftCollection
import dev.g000sha256.tdl.function.DeleteGroupCallMessages
import dev.g000sha256.tdl.function.DeleteGroupCallMessagesBySender
import dev.g000sha256.tdl.function.DeleteLanguagePack
import dev.g000sha256.tdl.function.DeleteMessageReactionsFromSender
import dev.g000sha256.tdl.function.DeleteMessages
import dev.g000sha256.tdl.function.DeletePassportElement
import dev.g000sha256.tdl.function.DeletePollOption
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
import dev.g000sha256.tdl.function.DeleteTextCompositionStyle
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
import dev.g000sha256.tdl.function.EditEphemeralMessage
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
import dev.g000sha256.tdl.function.EditTextCompositionStyle
import dev.g000sha256.tdl.function.EditUserStarSubscription
import dev.g000sha256.tdl.function.EnableProxy
import dev.g000sha256.tdl.function.EncryptGroupCallData
import dev.g000sha256.tdl.function.EndGroupCall
import dev.g000sha256.tdl.function.EndGroupCallRecording
import dev.g000sha256.tdl.function.EndGroupCallScreenSharing
import dev.g000sha256.tdl.function.FinishFileGeneration
import dev.g000sha256.tdl.function.FixRichMessageWithAi
import dev.g000sha256.tdl.function.FixTextWithAi
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
import dev.g000sha256.tdl.function.GetAuthenticationPasskeyParameters
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
import dev.g000sha256.tdl.function.GetChatOwnerAfterLeaving
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
import dev.g000sha256.tdl.function.GetCountry
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
import dev.g000sha256.tdl.function.GetFullRichMessage
import dev.g000sha256.tdl.function.GetGameHighScores
import dev.g000sha256.tdl.function.GetGiftAuctionAcquiredGifts
import dev.g000sha256.tdl.function.GetGiftAuctionState
import dev.g000sha256.tdl.function.GetGiftChatThemes
import dev.g000sha256.tdl.function.GetGiftCollections
import dev.g000sha256.tdl.function.GetGiftUpgradePreview
import dev.g000sha256.tdl.function.GetGiftsForCrafting
import dev.g000sha256.tdl.function.GetGiveawayInfo
import dev.g000sha256.tdl.function.GetGramRevenueStatistics
import dev.g000sha256.tdl.function.GetGramWithdrawalUrl
import dev.g000sha256.tdl.function.GetGreetingStickers
import dev.g000sha256.tdl.function.GetGrossingWebAppBots
import dev.g000sha256.tdl.function.GetGroupCall
import dev.g000sha256.tdl.function.GetGroupCallParticipants
import dev.g000sha256.tdl.function.GetGroupCallStreamSegment
import dev.g000sha256.tdl.function.GetGroupCallStreams
import dev.g000sha256.tdl.function.GetGroupsInCommon
import dev.g000sha256.tdl.function.GetGuardBotWebAppUrl
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
import dev.g000sha256.tdl.function.GetLinkWebBrowserType
import dev.g000sha256.tdl.function.GetLiveStoryAvailableMessageSenders
import dev.g000sha256.tdl.function.GetLiveStoryRtmpUrl
import dev.g000sha256.tdl.function.GetLiveStoryStreamer
import dev.g000sha256.tdl.function.GetLiveStoryTopDonors
import dev.g000sha256.tdl.function.GetLocalizationTargetInfo
import dev.g000sha256.tdl.function.GetLogStream
import dev.g000sha256.tdl.function.GetLogTagVerbosityLevel
import dev.g000sha256.tdl.function.GetLogTags
import dev.g000sha256.tdl.function.GetLogVerbosityLevel
import dev.g000sha256.tdl.function.GetLoginPasskeys
import dev.g000sha256.tdl.function.GetLoginUrl
import dev.g000sha256.tdl.function.GetLoginUrlInfo
import dev.g000sha256.tdl.function.GetMainWebApp
import dev.g000sha256.tdl.function.GetManagedBotAccessSettings
import dev.g000sha256.tdl.function.GetManagedBotToken
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
import dev.g000sha256.tdl.function.GetOauthLinkInfo
import dev.g000sha256.tdl.function.GetOption
import dev.g000sha256.tdl.function.GetOwnedBots
import dev.g000sha256.tdl.function.GetOwnedStickerSets
import dev.g000sha256.tdl.function.GetPaidMessageRevenue
import dev.g000sha256.tdl.function.GetPasskeyParameters
import dev.g000sha256.tdl.function.GetPassportAuthorizationForm
import dev.g000sha256.tdl.function.GetPassportAuthorizationFormAvailableElements
import dev.g000sha256.tdl.function.GetPassportElement
import dev.g000sha256.tdl.function.GetPasswordState
import dev.g000sha256.tdl.function.GetPaymentForm
import dev.g000sha256.tdl.function.GetPaymentReceipt
import dev.g000sha256.tdl.function.GetPersonalChatHistory
import dev.g000sha256.tdl.function.GetPhoneNumberInfo
import dev.g000sha256.tdl.function.GetPhoneNumberInfoSync
import dev.g000sha256.tdl.function.GetPollOptionProperties
import dev.g000sha256.tdl.function.GetPollVoteStatistics
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
import dev.g000sha256.tdl.function.GetPreparedKeyboardButton
import dev.g000sha256.tdl.function.GetProxies
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
import dev.g000sha256.tdl.function.GetStakeDiceState
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
import dev.g000sha256.tdl.function.GetStickerOutlineSvgPath
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
import dev.g000sha256.tdl.function.GetTextCompositionStyleExample
import dev.g000sha256.tdl.function.GetTextEntities
import dev.g000sha256.tdl.function.GetThemeParametersJsonString
import dev.g000sha256.tdl.function.GetThemedChatEmojiStatuses
import dev.g000sha256.tdl.function.GetThemedEmojiStatuses
import dev.g000sha256.tdl.function.GetTimeZones
import dev.g000sha256.tdl.function.GetTonTransactions
import dev.g000sha256.tdl.function.GetTopChats
import dev.g000sha256.tdl.function.GetTrendingStickerSets
import dev.g000sha256.tdl.function.GetUpgradedGift
import dev.g000sha256.tdl.function.GetUpgradedGiftEmojiStatuses
import dev.g000sha256.tdl.function.GetUpgradedGiftValueInfo
import dev.g000sha256.tdl.function.GetUpgradedGiftVariants
import dev.g000sha256.tdl.function.GetUpgradedGiftWithdrawalUrl
import dev.g000sha256.tdl.function.GetUpgradedGiftsPromotionalAnimation
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
import dev.g000sha256.tdl.function.ListenToAudio
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
import dev.g000sha256.tdl.function.ProcessChatHasProtectedContentDisableRequest
import dev.g000sha256.tdl.function.ProcessChatJoinRequest
import dev.g000sha256.tdl.function.ProcessChatJoinRequests
import dev.g000sha256.tdl.function.ProcessGiftPurchaseOffer
import dev.g000sha256.tdl.function.ProcessPushNotification
import dev.g000sha256.tdl.function.RateSpeechRecognition
import dev.g000sha256.tdl.function.ReadAllChatMentions
import dev.g000sha256.tdl.function.ReadAllChatPollVotes
import dev.g000sha256.tdl.function.ReadAllChatReactions
import dev.g000sha256.tdl.function.ReadAllDirectMessagesChatTopicReactions
import dev.g000sha256.tdl.function.ReadAllForumTopicMentions
import dev.g000sha256.tdl.function.ReadAllForumTopicPollVotes
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
import dev.g000sha256.tdl.function.RemoveAllWebBrowserSettingsExceptions
import dev.g000sha256.tdl.function.RemoveBusinessConnectedBotFromChat
import dev.g000sha256.tdl.function.RemoveChatActionBar
import dev.g000sha256.tdl.function.RemoveContacts
import dev.g000sha256.tdl.function.RemoveFavoriteSticker
import dev.g000sha256.tdl.function.RemoveFileFromDownloads
import dev.g000sha256.tdl.function.RemoveGiftCollectionGifts
import dev.g000sha256.tdl.function.RemoveInstalledBackground
import dev.g000sha256.tdl.function.RemoveLoginPasskey
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
import dev.g000sha256.tdl.function.RemoveTextCompositionStyle
import dev.g000sha256.tdl.function.RemoveTopChat
import dev.g000sha256.tdl.function.RemoveWebBrowserSettingsException
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
import dev.g000sha256.tdl.function.SavePreparedKeyboardButton
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
import dev.g000sha256.tdl.function.SearchTextCompositionStyle
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
import dev.g000sha256.tdl.function.SendEphemeralMessage
import dev.g000sha256.tdl.function.SendGift
import dev.g000sha256.tdl.function.SendGiftPurchaseOffer
import dev.g000sha256.tdl.function.SendGroupCallMessage
import dev.g000sha256.tdl.function.SendInlineQueryResultMessage
import dev.g000sha256.tdl.function.SendMessage
import dev.g000sha256.tdl.function.SendMessageAlbum
import dev.g000sha256.tdl.function.SendMessageViewMetrics
import dev.g000sha256.tdl.function.SendPassportAuthorizationForm
import dev.g000sha256.tdl.function.SendPaymentForm
import dev.g000sha256.tdl.function.SendPhoneNumberCode
import dev.g000sha256.tdl.function.SendPhoneNumberFirebaseSms
import dev.g000sha256.tdl.function.SendQuickReplyShortcutMessages
import dev.g000sha256.tdl.function.SendResoldGift
import dev.g000sha256.tdl.function.SendRichMessageDraft
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
import dev.g000sha256.tdl.function.SetChatMemberTag
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
import dev.g000sha256.tdl.function.SetManagedBotAccessSettings
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
import dev.g000sha256.tdl.function.SummarizeMessage
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
import dev.g000sha256.tdl.function.TranslateMessageRichMessage
import dev.g000sha256.tdl.function.TranslateMessageText
import dev.g000sha256.tdl.function.TranslateRichMessage
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
import dev.g000sha256.tdl.util.buildJsonObjectString
import dev.g000sha256.tdl.util.put
import kotlin.Any
import kotlin.Long
import kotlin.String

internal fun serialize(function: Any, requestId: Long): String {
    when(function) {
        is AcceptCall -> return serialize(requestId = requestId, function = function)
        is AcceptOauthRequest -> return serialize(requestId = requestId, function = function)
        is AcceptTermsOfService -> return serialize(requestId = requestId, function = function)
        is ActivateStoryStealthMode -> return serialize(requestId = requestId, function = function)
        is AddBotMediaPreview -> return serialize(requestId = requestId, function = function)
        is AddChatFolderByInviteLink -> return serialize(requestId = requestId, function = function)
        is AddChatMember -> return serialize(requestId = requestId, function = function)
        is AddChatMembers -> return serialize(requestId = requestId, function = function)
        is AddChatToList -> return serialize(requestId = requestId, function = function)
        is AddChecklistTasks -> return serialize(requestId = requestId, function = function)
        is AddContact -> return serialize(requestId = requestId, function = function)
        is AddCustomServerLanguagePack -> return serialize(requestId = requestId, function = function)
        is AddFavoriteSticker -> return serialize(requestId = requestId, function = function)
        is AddFileToDownloads -> return serialize(requestId = requestId, function = function)
        is AddGiftCollectionGifts -> return serialize(requestId = requestId, function = function)
        is AddLocalMessage -> return serialize(requestId = requestId, function = function)
        is AddLogMessage -> return serialize(requestId = requestId, function = function)
        is AddLoginPasskey -> return serialize(requestId = requestId, function = function)
        is AddMessageReaction -> return serialize(requestId = requestId, function = function)
        is AddNetworkStatistics -> return serialize(requestId = requestId, function = function)
        is AddOffer -> return serialize(requestId = requestId, function = function)
        is AddPendingLiveStoryReaction -> return serialize(requestId = requestId, function = function)
        is AddPendingPaidMessageReaction -> return serialize(requestId = requestId, function = function)
        is AddPollOption -> return serialize(requestId = requestId, function = function)
        is AddProfileAudio -> return serialize(requestId = requestId, function = function)
        is AddProxy -> return serialize(requestId = requestId, function = function)
        is AddQuickReplyShortcutInlineQueryResultMessage -> return serialize(requestId = requestId, function = function)
        is AddQuickReplyShortcutMessage -> return serialize(requestId = requestId, function = function)
        is AddQuickReplyShortcutMessageAlbum -> return serialize(requestId = requestId, function = function)
        is AddRecentSticker -> return serialize(requestId = requestId, function = function)
        is AddRecentlyFoundChat -> return serialize(requestId = requestId, function = function)
        is AddSavedAnimation -> return serialize(requestId = requestId, function = function)
        is AddSavedNotificationSound -> return serialize(requestId = requestId, function = function)
        is AddStickerToSet -> return serialize(requestId = requestId, function = function)
        is AddStoryAlbumStories -> return serialize(requestId = requestId, function = function)
        is AddTextCompositionStyle -> return serialize(requestId = requestId, function = function)
        is AddWebBrowserSettingsException -> return serialize(requestId = requestId, function = function)
        is AllowBotToSendMessages -> return serialize(requestId = requestId, function = function)
        is AllowUnpaidMessagesFromUser -> return serialize(requestId = requestId, function = function)
        is AnswerCallbackQuery -> return serialize(requestId = requestId, function = function)
        is AnswerChatJoinRequestQuery -> return serialize(requestId = requestId, function = function)
        is AnswerCustomQuery -> return serialize(requestId = requestId, function = function)
        is AnswerGuestQuery -> return serialize(requestId = requestId, function = function)
        is AnswerInlineQuery -> return serialize(requestId = requestId, function = function)
        is AnswerPreCheckoutQuery -> return serialize(requestId = requestId, function = function)
        is AnswerShippingQuery -> return serialize(requestId = requestId, function = function)
        is AnswerWebAppQuery -> return serialize(requestId = requestId, function = function)
        is ApplyPremiumGiftCode -> return serialize(requestId = requestId, function = function)
        is ApproveSuggestedPost -> return serialize(requestId = requestId, function = function)
        is AssignStoreTransaction -> return serialize(requestId = requestId, function = function)
        is BanChatMember -> return serialize(requestId = requestId, function = function)
        is BanGroupCallParticipants -> return serialize(requestId = requestId, function = function)
        is BlockMessageSenderFromReplies -> return serialize(requestId = requestId, function = function)
        is BoostChat -> return serialize(requestId = requestId, function = function)
        is BuyGiftUpgrade -> return serialize(requestId = requestId, function = function)
        is CanBotSendMessages -> return serialize(requestId = requestId, function = function)
        is CanPostStory -> return serialize(requestId = requestId, function = function)
        is CanPurchaseFromStore -> return serialize(requestId = requestId, function = function)
        is CanSendGift -> return serialize(requestId = requestId, function = function)
        is CanSendMessageToUser -> return serialize(requestId = requestId, function = function)
        is CanTransferOwnership -> return serialize(requestId = requestId, function = function)
        is CancelDownloadFile -> return serialize(requestId = requestId, function = function)
        is CancelPasswordReset -> return serialize(requestId = requestId, function = function)
        is CancelPreliminaryUploadFile -> return serialize(requestId = requestId, function = function)
        is CancelRecoveryEmailAddressVerification -> return serialize(requestId = requestId, function = function)
        is ChangeImportedContacts -> return serialize(requestId = requestId, function = function)
        is ChangeStickerSet -> return serialize(requestId = requestId, function = function)
        is ChangeWebBrowserSettings -> return serialize(requestId = requestId, function = function)
        is CheckAuthenticationBotToken -> return serialize(requestId = requestId, function = function)
        is CheckAuthenticationCode -> return serialize(requestId = requestId, function = function)
        is CheckAuthenticationEmailCode -> return serialize(requestId = requestId, function = function)
        is CheckAuthenticationPasskey -> return serialize(requestId = requestId, function = function)
        is CheckAuthenticationPassword -> return serialize(requestId = requestId, function = function)
        is CheckAuthenticationPasswordRecoveryCode -> return serialize(requestId = requestId, function = function)
        is CheckAuthenticationPremiumPurchase -> return serialize(requestId = requestId, function = function)
        is CheckAuthenticationWebToken -> return serialize(requestId = requestId, function = function)
        is CheckBotUsername -> return serialize(requestId = requestId, function = function)
        is CheckChatFolderInviteLink -> return serialize(requestId = requestId, function = function)
        is CheckChatInviteLink -> return serialize(requestId = requestId, function = function)
        is CheckChatUsername -> return serialize(requestId = requestId, function = function)
        is CheckCreatedPublicChatsLimit -> return serialize(requestId = requestId, function = function)
        is CheckEmailAddressVerificationCode -> return serialize(requestId = requestId, function = function)
        is CheckLoginEmailAddressCode -> return serialize(requestId = requestId, function = function)
        is CheckOauthRequestMatchCode -> return serialize(requestId = requestId, function = function)
        is CheckPasswordRecoveryCode -> return serialize(requestId = requestId, function = function)
        is CheckPhoneNumberCode -> return serialize(requestId = requestId, function = function)
        is CheckPremiumGiftCode -> return serialize(requestId = requestId, function = function)
        is CheckQuickReplyShortcutName -> return serialize(requestId = requestId, function = function)
        is CheckRecoveryEmailAddressCode -> return serialize(requestId = requestId, function = function)
        is CheckStickerSetName -> return serialize(requestId = requestId, function = function)
        is CheckWebAppFileDownload -> return serialize(requestId = requestId, function = function)
        is CleanFileName -> return serialize(requestId = requestId, function = function)
        is ClearAllDraftMessages -> return serialize(requestId = requestId, function = function)
        is ClearAutosaveSettingsExceptions -> return serialize(requestId = requestId, function = function)
        is ClearImportedContacts -> return serialize(requestId = requestId, function = function)
        is ClearRecentEmojiStatuses -> return serialize(requestId = requestId, function = function)
        is ClearRecentReactions -> return serialize(requestId = requestId, function = function)
        is ClearRecentStickers -> return serialize(requestId = requestId, function = function)
        is ClearRecentlyFoundChats -> return serialize(requestId = requestId, function = function)
        is ClearSearchedForTags -> return serialize(requestId = requestId, function = function)
        is ClickAnimatedEmojiMessage -> return serialize(requestId = requestId, function = function)
        is ClickChatSponsoredMessage -> return serialize(requestId = requestId, function = function)
        is ClickPremiumSubscriptionButton -> return serialize(requestId = requestId, function = function)
        is ClickVideoMessageAdvertisement -> return serialize(requestId = requestId, function = function)
        is Close -> return serialize(requestId = requestId, function = function)
        is CloseChat -> return serialize(requestId = requestId, function = function)
        is CloseGiftAuction -> return serialize(requestId = requestId, function = function)
        is CloseSecretChat -> return serialize(requestId = requestId, function = function)
        is CloseStory -> return serialize(requestId = requestId, function = function)
        is CloseWebApp -> return serialize(requestId = requestId, function = function)
        is CommitPendingLiveStoryReactions -> return serialize(requestId = requestId, function = function)
        is CommitPendingPaidMessageReactions -> return serialize(requestId = requestId, function = function)
        is ComposeRichMessageWithAi -> return serialize(requestId = requestId, function = function)
        is ComposeTextWithAi -> return serialize(requestId = requestId, function = function)
        is ConfirmBusinessConnectedBot -> return serialize(requestId = requestId, function = function)
        is ConfirmQrCodeAuthentication -> return serialize(requestId = requestId, function = function)
        is ConfirmSession -> return serialize(requestId = requestId, function = function)
        is ConnectAffiliateProgram -> return serialize(requestId = requestId, function = function)
        is CraftGift -> return serialize(requestId = requestId, function = function)
        is CreateBasicGroupChat -> return serialize(requestId = requestId, function = function)
        is CreateBot -> return serialize(requestId = requestId, function = function)
        is CreateBusinessChatLink -> return serialize(requestId = requestId, function = function)
        is CreateCall -> return serialize(requestId = requestId, function = function)
        is CreateChatFolder -> return serialize(requestId = requestId, function = function)
        is CreateChatFolderInviteLink -> return serialize(requestId = requestId, function = function)
        is CreateChatInviteLink -> return serialize(requestId = requestId, function = function)
        is CreateChatSubscriptionInviteLink -> return serialize(requestId = requestId, function = function)
        is CreateForumTopic -> return serialize(requestId = requestId, function = function)
        is CreateGiftCollection -> return serialize(requestId = requestId, function = function)
        is CreateGroupCall -> return serialize(requestId = requestId, function = function)
        is CreateInvoiceLink -> return serialize(requestId = requestId, function = function)
        is CreateNewBasicGroupChat -> return serialize(requestId = requestId, function = function)
        is CreateNewSecretChat -> return serialize(requestId = requestId, function = function)
        is CreateNewStickerSet -> return serialize(requestId = requestId, function = function)
        is CreateNewSupergroupChat -> return serialize(requestId = requestId, function = function)
        is CreatePrivateChat -> return serialize(requestId = requestId, function = function)
        is CreateRichMessageWithAi -> return serialize(requestId = requestId, function = function)
        is CreateSecretChat -> return serialize(requestId = requestId, function = function)
        is CreateStoryAlbum -> return serialize(requestId = requestId, function = function)
        is CreateSupergroupChat -> return serialize(requestId = requestId, function = function)
        is CreateTemporaryPassword -> return serialize(requestId = requestId, function = function)
        is CreateTextCompositionStyle -> return serialize(requestId = requestId, function = function)
        is CreateVideoChat -> return serialize(requestId = requestId, function = function)
        is DeclineGroupCallInvitation -> return serialize(requestId = requestId, function = function)
        is DeclineOauthRequest -> return serialize(requestId = requestId, function = function)
        is DeclineSuggestedPost -> return serialize(requestId = requestId, function = function)
        is DecryptGroupCallData -> return serialize(requestId = requestId, function = function)
        is DeleteAccount -> return serialize(requestId = requestId, function = function)
        is DeleteAllCallMessages -> return serialize(requestId = requestId, function = function)
        is DeleteAllRecentMessageReactionsFromSender -> return serialize(requestId = requestId, function = function)
        is DeleteAllRevokedChatInviteLinks -> return serialize(requestId = requestId, function = function)
        is DeleteBotMediaPreviews -> return serialize(requestId = requestId, function = function)
        is DeleteBusinessChatLink -> return serialize(requestId = requestId, function = function)
        is DeleteBusinessConnectedBot -> return serialize(requestId = requestId, function = function)
        is DeleteBusinessMessages -> return serialize(requestId = requestId, function = function)
        is DeleteBusinessStory -> return serialize(requestId = requestId, function = function)
        is DeleteChat -> return serialize(requestId = requestId, function = function)
        is DeleteChatBackground -> return serialize(requestId = requestId, function = function)
        is DeleteChatFolder -> return serialize(requestId = requestId, function = function)
        is DeleteChatFolderInviteLink -> return serialize(requestId = requestId, function = function)
        is DeleteChatHistory -> return serialize(requestId = requestId, function = function)
        is DeleteChatMessagesByDate -> return serialize(requestId = requestId, function = function)
        is DeleteChatMessagesBySender -> return serialize(requestId = requestId, function = function)
        is DeleteChatReplyMarkup -> return serialize(requestId = requestId, function = function)
        is DeleteCommands -> return serialize(requestId = requestId, function = function)
        is DeleteDefaultBackground -> return serialize(requestId = requestId, function = function)
        is DeleteDirectMessagesChatTopicHistory -> return serialize(requestId = requestId, function = function)
        is DeleteDirectMessagesChatTopicMessagesByDate -> return serialize(requestId = requestId, function = function)
        is DeleteEphemeralMessage -> return serialize(requestId = requestId, function = function)
        is DeleteFile -> return serialize(requestId = requestId, function = function)
        is DeleteForumTopic -> return serialize(requestId = requestId, function = function)
        is DeleteGiftCollection -> return serialize(requestId = requestId, function = function)
        is DeleteGroupCallMessages -> return serialize(requestId = requestId, function = function)
        is DeleteGroupCallMessagesBySender -> return serialize(requestId = requestId, function = function)
        is DeleteLanguagePack -> return serialize(requestId = requestId, function = function)
        is DeleteMessageReactionsFromSender -> return serialize(requestId = requestId, function = function)
        is DeleteMessages -> return serialize(requestId = requestId, function = function)
        is DeletePassportElement -> return serialize(requestId = requestId, function = function)
        is DeletePollOption -> return serialize(requestId = requestId, function = function)
        is DeleteProfilePhoto -> return serialize(requestId = requestId, function = function)
        is DeleteQuickReplyShortcut -> return serialize(requestId = requestId, function = function)
        is DeleteQuickReplyShortcutMessages -> return serialize(requestId = requestId, function = function)
        is DeleteRevokedChatInviteLink -> return serialize(requestId = requestId, function = function)
        is DeleteSavedCredentials -> return serialize(requestId = requestId, function = function)
        is DeleteSavedMessagesTopicHistory -> return serialize(requestId = requestId, function = function)
        is DeleteSavedMessagesTopicMessagesByDate -> return serialize(requestId = requestId, function = function)
        is DeleteSavedOrderInfo -> return serialize(requestId = requestId, function = function)
        is DeleteStickerSet -> return serialize(requestId = requestId, function = function)
        is DeleteStory -> return serialize(requestId = requestId, function = function)
        is DeleteStoryAlbum -> return serialize(requestId = requestId, function = function)
        is DeleteTextCompositionStyle -> return serialize(requestId = requestId, function = function)
        is Destroy -> return serialize(requestId = requestId, function = function)
        is DisableAllSupergroupUsernames -> return serialize(requestId = requestId, function = function)
        is DisableProxy -> return serialize(requestId = requestId, function = function)
        is DiscardCall -> return serialize(requestId = requestId, function = function)
        is DisconnectAffiliateProgram -> return serialize(requestId = requestId, function = function)
        is DisconnectAllWebsites -> return serialize(requestId = requestId, function = function)
        is DisconnectWebsite -> return serialize(requestId = requestId, function = function)
        is DownloadFile -> return serialize(requestId = requestId, function = function)
        is DropGiftOriginalDetails -> return serialize(requestId = requestId, function = function)
        is EditBotMediaPreview -> return serialize(requestId = requestId, function = function)
        is EditBusinessChatLink -> return serialize(requestId = requestId, function = function)
        is EditBusinessMessageCaption -> return serialize(requestId = requestId, function = function)
        is EditBusinessMessageChecklist -> return serialize(requestId = requestId, function = function)
        is EditBusinessMessageLiveLocation -> return serialize(requestId = requestId, function = function)
        is EditBusinessMessageMedia -> return serialize(requestId = requestId, function = function)
        is EditBusinessMessageReplyMarkup -> return serialize(requestId = requestId, function = function)
        is EditBusinessMessageText -> return serialize(requestId = requestId, function = function)
        is EditBusinessStory -> return serialize(requestId = requestId, function = function)
        is EditChatFolder -> return serialize(requestId = requestId, function = function)
        is EditChatFolderInviteLink -> return serialize(requestId = requestId, function = function)
        is EditChatInviteLink -> return serialize(requestId = requestId, function = function)
        is EditChatSubscriptionInviteLink -> return serialize(requestId = requestId, function = function)
        is EditCustomLanguagePackInfo -> return serialize(requestId = requestId, function = function)
        is EditEphemeralMessage -> return serialize(requestId = requestId, function = function)
        is EditForumTopic -> return serialize(requestId = requestId, function = function)
        is EditInlineMessageCaption -> return serialize(requestId = requestId, function = function)
        is EditInlineMessageLiveLocation -> return serialize(requestId = requestId, function = function)
        is EditInlineMessageMedia -> return serialize(requestId = requestId, function = function)
        is EditInlineMessageReplyMarkup -> return serialize(requestId = requestId, function = function)
        is EditInlineMessageText -> return serialize(requestId = requestId, function = function)
        is EditMessageCaption -> return serialize(requestId = requestId, function = function)
        is EditMessageChecklist -> return serialize(requestId = requestId, function = function)
        is EditMessageLiveLocation -> return serialize(requestId = requestId, function = function)
        is EditMessageMedia -> return serialize(requestId = requestId, function = function)
        is EditMessageReplyMarkup -> return serialize(requestId = requestId, function = function)
        is EditMessageSchedulingState -> return serialize(requestId = requestId, function = function)
        is EditMessageText -> return serialize(requestId = requestId, function = function)
        is EditProxy -> return serialize(requestId = requestId, function = function)
        is EditQuickReplyMessage -> return serialize(requestId = requestId, function = function)
        is EditStarSubscription -> return serialize(requestId = requestId, function = function)
        is EditStory -> return serialize(requestId = requestId, function = function)
        is EditStoryCover -> return serialize(requestId = requestId, function = function)
        is EditTextCompositionStyle -> return serialize(requestId = requestId, function = function)
        is EditUserStarSubscription -> return serialize(requestId = requestId, function = function)
        is EnableProxy -> return serialize(requestId = requestId, function = function)
        is EncryptGroupCallData -> return serialize(requestId = requestId, function = function)
        is EndGroupCall -> return serialize(requestId = requestId, function = function)
        is EndGroupCallRecording -> return serialize(requestId = requestId, function = function)
        is EndGroupCallScreenSharing -> return serialize(requestId = requestId, function = function)
        is FinishFileGeneration -> return serialize(requestId = requestId, function = function)
        is FixRichMessageWithAi -> return serialize(requestId = requestId, function = function)
        is FixTextWithAi -> return serialize(requestId = requestId, function = function)
        is ForwardMessages -> return serialize(requestId = requestId, function = function)
        is GetAccountTtl -> return serialize(requestId = requestId, function = function)
        is GetActiveSessions -> return serialize(requestId = requestId, function = function)
        is GetAllPassportElements -> return serialize(requestId = requestId, function = function)
        is GetAllStickerEmojis -> return serialize(requestId = requestId, function = function)
        is GetAnimatedEmoji -> return serialize(requestId = requestId, function = function)
        is GetApplicationConfig -> return serialize(requestId = requestId, function = function)
        is GetApplicationDownloadLink -> return serialize(requestId = requestId, function = function)
        is GetArchiveChatListSettings -> return serialize(requestId = requestId, function = function)
        is GetArchivedStickerSets -> return serialize(requestId = requestId, function = function)
        is GetAttachedStickerSets -> return serialize(requestId = requestId, function = function)
        is GetAttachmentMenuBot -> return serialize(requestId = requestId, function = function)
        is GetAuthenticationPasskeyParameters -> return serialize(requestId = requestId, function = function)
        is GetAuthorizationState -> return serialize(requestId = requestId, function = function)
        is GetAutoDownloadSettingsPresets -> return serialize(requestId = requestId, function = function)
        is GetAutosaveSettings -> return serialize(requestId = requestId, function = function)
        is GetAvailableChatBoostSlots -> return serialize(requestId = requestId, function = function)
        is GetAvailableGifts -> return serialize(requestId = requestId, function = function)
        is GetBackgroundUrl -> return serialize(requestId = requestId, function = function)
        is GetBankCardInfo -> return serialize(requestId = requestId, function = function)
        is GetBasicGroup -> return serialize(requestId = requestId, function = function)
        is GetBasicGroupFullInfo -> return serialize(requestId = requestId, function = function)
        is GetBlockedMessageSenders -> return serialize(requestId = requestId, function = function)
        is GetBotInfoDescription -> return serialize(requestId = requestId, function = function)
        is GetBotInfoShortDescription -> return serialize(requestId = requestId, function = function)
        is GetBotMediaPreviewInfo -> return serialize(requestId = requestId, function = function)
        is GetBotMediaPreviews -> return serialize(requestId = requestId, function = function)
        is GetBotName -> return serialize(requestId = requestId, function = function)
        is GetBotSimilarBotCount -> return serialize(requestId = requestId, function = function)
        is GetBotSimilarBots -> return serialize(requestId = requestId, function = function)
        is GetBusinessAccountStarAmount -> return serialize(requestId = requestId, function = function)
        is GetBusinessChatLinkInfo -> return serialize(requestId = requestId, function = function)
        is GetBusinessChatLinks -> return serialize(requestId = requestId, function = function)
        is GetBusinessConnectedBot -> return serialize(requestId = requestId, function = function)
        is GetBusinessConnection -> return serialize(requestId = requestId, function = function)
        is GetBusinessFeatures -> return serialize(requestId = requestId, function = function)
        is GetCallbackQueryAnswer -> return serialize(requestId = requestId, function = function)
        is GetCallbackQueryMessage -> return serialize(requestId = requestId, function = function)
        is GetChat -> return serialize(requestId = requestId, function = function)
        is GetChatActiveStories -> return serialize(requestId = requestId, function = function)
        is GetChatAdministrators -> return serialize(requestId = requestId, function = function)
        is GetChatArchivedStories -> return serialize(requestId = requestId, function = function)
        is GetChatAvailableMessageSenders -> return serialize(requestId = requestId, function = function)
        is GetChatAvailablePaidMessageReactionSenders -> return serialize(requestId = requestId, function = function)
        is GetChatBoostFeatures -> return serialize(requestId = requestId, function = function)
        is GetChatBoostLevelFeatures -> return serialize(requestId = requestId, function = function)
        is GetChatBoostLink -> return serialize(requestId = requestId, function = function)
        is GetChatBoostLinkInfo -> return serialize(requestId = requestId, function = function)
        is GetChatBoostStatus -> return serialize(requestId = requestId, function = function)
        is GetChatBoosts -> return serialize(requestId = requestId, function = function)
        is GetChatEventLog -> return serialize(requestId = requestId, function = function)
        is GetChatFolder -> return serialize(requestId = requestId, function = function)
        is GetChatFolderChatCount -> return serialize(requestId = requestId, function = function)
        is GetChatFolderChatsToLeave -> return serialize(requestId = requestId, function = function)
        is GetChatFolderDefaultIconName -> return serialize(requestId = requestId, function = function)
        is GetChatFolderInviteLinks -> return serialize(requestId = requestId, function = function)
        is GetChatFolderNewChats -> return serialize(requestId = requestId, function = function)
        is GetChatHistory -> return serialize(requestId = requestId, function = function)
        is GetChatInviteLink -> return serialize(requestId = requestId, function = function)
        is GetChatInviteLinkCounts -> return serialize(requestId = requestId, function = function)
        is GetChatInviteLinkMembers -> return serialize(requestId = requestId, function = function)
        is GetChatInviteLinks -> return serialize(requestId = requestId, function = function)
        is GetChatJoinRequests -> return serialize(requestId = requestId, function = function)
        is GetChatListsToAddChat -> return serialize(requestId = requestId, function = function)
        is GetChatMember -> return serialize(requestId = requestId, function = function)
        is GetChatMessageByDate -> return serialize(requestId = requestId, function = function)
        is GetChatMessageCalendar -> return serialize(requestId = requestId, function = function)
        is GetChatMessageCount -> return serialize(requestId = requestId, function = function)
        is GetChatMessagePosition -> return serialize(requestId = requestId, function = function)
        is GetChatNotificationSettingsExceptions -> return serialize(requestId = requestId, function = function)
        is GetChatOwnerAfterLeaving -> return serialize(requestId = requestId, function = function)
        is GetChatPinnedMessage -> return serialize(requestId = requestId, function = function)
        is GetChatPostedToChatPageStories -> return serialize(requestId = requestId, function = function)
        is GetChatRevenueStatistics -> return serialize(requestId = requestId, function = function)
        is GetChatRevenueTransactions -> return serialize(requestId = requestId, function = function)
        is GetChatRevenueWithdrawalUrl -> return serialize(requestId = requestId, function = function)
        is GetChatScheduledMessages -> return serialize(requestId = requestId, function = function)
        is GetChatSimilarChatCount -> return serialize(requestId = requestId, function = function)
        is GetChatSimilarChats -> return serialize(requestId = requestId, function = function)
        is GetChatSparseMessagePositions -> return serialize(requestId = requestId, function = function)
        is GetChatSponsoredMessages -> return serialize(requestId = requestId, function = function)
        is GetChatStatistics -> return serialize(requestId = requestId, function = function)
        is GetChatStoryAlbums -> return serialize(requestId = requestId, function = function)
        is GetChatStoryInteractions -> return serialize(requestId = requestId, function = function)
        is GetChats -> return serialize(requestId = requestId, function = function)
        is GetChatsForChatFolderInviteLink -> return serialize(requestId = requestId, function = function)
        is GetChatsToPostStories -> return serialize(requestId = requestId, function = function)
        is GetCloseFriends -> return serialize(requestId = requestId, function = function)
        is GetCollectibleItemInfo -> return serialize(requestId = requestId, function = function)
        is GetCommands -> return serialize(requestId = requestId, function = function)
        is GetConnectedAffiliateProgram -> return serialize(requestId = requestId, function = function)
        is GetConnectedAffiliatePrograms -> return serialize(requestId = requestId, function = function)
        is GetConnectedWebsites -> return serialize(requestId = requestId, function = function)
        is GetContacts -> return serialize(requestId = requestId, function = function)
        is GetCountries -> return serialize(requestId = requestId, function = function)
        is GetCountry -> return serialize(requestId = requestId, function = function)
        is GetCountryCode -> return serialize(requestId = requestId, function = function)
        is GetCountryFlagEmoji -> return serialize(requestId = requestId, function = function)
        is GetCreatedPublicChats -> return serialize(requestId = requestId, function = function)
        is GetCurrentState -> return serialize(requestId = requestId, function = function)
        is GetCurrentWeather -> return serialize(requestId = requestId, function = function)
        is GetCustomEmojiReactionAnimations -> return serialize(requestId = requestId, function = function)
        is GetCustomEmojiStickers -> return serialize(requestId = requestId, function = function)
        is GetDatabaseStatistics -> return serialize(requestId = requestId, function = function)
        is GetDeepLinkInfo -> return serialize(requestId = requestId, function = function)
        is GetDefaultBackgroundCustomEmojiStickers -> return serialize(requestId = requestId, function = function)
        is GetDefaultChatEmojiStatuses -> return serialize(requestId = requestId, function = function)
        is GetDefaultChatPhotoCustomEmojiStickers -> return serialize(requestId = requestId, function = function)
        is GetDefaultEmojiStatuses -> return serialize(requestId = requestId, function = function)
        is GetDefaultMessageAutoDeleteTime -> return serialize(requestId = requestId, function = function)
        is GetDefaultProfilePhotoCustomEmojiStickers -> return serialize(requestId = requestId, function = function)
        is GetDirectMessagesChatTopic -> return serialize(requestId = requestId, function = function)
        is GetDirectMessagesChatTopicHistory -> return serialize(requestId = requestId, function = function)
        is GetDirectMessagesChatTopicMessageByDate -> return serialize(requestId = requestId, function = function)
        is GetDirectMessagesChatTopicRevenue -> return serialize(requestId = requestId, function = function)
        is GetDisallowedChatEmojiStatuses -> return serialize(requestId = requestId, function = function)
        is GetEmojiCategories -> return serialize(requestId = requestId, function = function)
        is GetEmojiReaction -> return serialize(requestId = requestId, function = function)
        is GetEmojiSuggestionsUrl -> return serialize(requestId = requestId, function = function)
        is GetExternalLink -> return serialize(requestId = requestId, function = function)
        is GetExternalLinkInfo -> return serialize(requestId = requestId, function = function)
        is GetFavoriteStickers -> return serialize(requestId = requestId, function = function)
        is GetFile -> return serialize(requestId = requestId, function = function)
        is GetFileDownloadedPrefixSize -> return serialize(requestId = requestId, function = function)
        is GetFileExtension -> return serialize(requestId = requestId, function = function)
        is GetFileMimeType -> return serialize(requestId = requestId, function = function)
        is GetForumTopic -> return serialize(requestId = requestId, function = function)
        is GetForumTopicDefaultIcons -> return serialize(requestId = requestId, function = function)
        is GetForumTopicHistory -> return serialize(requestId = requestId, function = function)
        is GetForumTopicLink -> return serialize(requestId = requestId, function = function)
        is GetForumTopics -> return serialize(requestId = requestId, function = function)
        is GetFullRichMessage -> return serialize(requestId = requestId, function = function)
        is GetGameHighScores -> return serialize(requestId = requestId, function = function)
        is GetGiftAuctionAcquiredGifts -> return serialize(requestId = requestId, function = function)
        is GetGiftAuctionState -> return serialize(requestId = requestId, function = function)
        is GetGiftChatThemes -> return serialize(requestId = requestId, function = function)
        is GetGiftCollections -> return serialize(requestId = requestId, function = function)
        is GetGiftUpgradePreview -> return serialize(requestId = requestId, function = function)
        is GetGiftsForCrafting -> return serialize(requestId = requestId, function = function)
        is GetGiveawayInfo -> return serialize(requestId = requestId, function = function)
        is GetGramRevenueStatistics -> return serialize(requestId = requestId, function = function)
        is GetGramWithdrawalUrl -> return serialize(requestId = requestId, function = function)
        is GetGreetingStickers -> return serialize(requestId = requestId, function = function)
        is GetGrossingWebAppBots -> return serialize(requestId = requestId, function = function)
        is GetGroupCall -> return serialize(requestId = requestId, function = function)
        is GetGroupCallParticipants -> return serialize(requestId = requestId, function = function)
        is GetGroupCallStreamSegment -> return serialize(requestId = requestId, function = function)
        is GetGroupCallStreams -> return serialize(requestId = requestId, function = function)
        is GetGroupsInCommon -> return serialize(requestId = requestId, function = function)
        is GetGuardBotWebAppUrl -> return serialize(requestId = requestId, function = function)
        is GetImportedContactCount -> return serialize(requestId = requestId, function = function)
        is GetInactiveSupergroupChats -> return serialize(requestId = requestId, function = function)
        is GetInlineGameHighScores -> return serialize(requestId = requestId, function = function)
        is GetInlineQueryResults -> return serialize(requestId = requestId, function = function)
        is GetInstalledBackgrounds -> return serialize(requestId = requestId, function = function)
        is GetInstalledStickerSets -> return serialize(requestId = requestId, function = function)
        is GetInternalLink -> return serialize(requestId = requestId, function = function)
        is GetInternalLinkType -> return serialize(requestId = requestId, function = function)
        is GetJsonString -> return serialize(requestId = requestId, function = function)
        is GetJsonValue -> return serialize(requestId = requestId, function = function)
        is GetKeywordEmojis -> return serialize(requestId = requestId, function = function)
        is GetLanguagePackInfo -> return serialize(requestId = requestId, function = function)
        is GetLanguagePackString -> return serialize(requestId = requestId, function = function)
        is GetLanguagePackStrings -> return serialize(requestId = requestId, function = function)
        is GetLinkPreview -> return serialize(requestId = requestId, function = function)
        is GetLinkWebBrowserType -> return serialize(requestId = requestId, function = function)
        is GetLiveStoryAvailableMessageSenders -> return serialize(requestId = requestId, function = function)
        is GetLiveStoryRtmpUrl -> return serialize(requestId = requestId, function = function)
        is GetLiveStoryStreamer -> return serialize(requestId = requestId, function = function)
        is GetLiveStoryTopDonors -> return serialize(requestId = requestId, function = function)
        is GetLocalizationTargetInfo -> return serialize(requestId = requestId, function = function)
        is GetLogStream -> return serialize(requestId = requestId, function = function)
        is GetLogTagVerbosityLevel -> return serialize(requestId = requestId, function = function)
        is GetLogTags -> return serialize(requestId = requestId, function = function)
        is GetLogVerbosityLevel -> return serialize(requestId = requestId, function = function)
        is GetLoginPasskeys -> return serialize(requestId = requestId, function = function)
        is GetLoginUrl -> return serialize(requestId = requestId, function = function)
        is GetLoginUrlInfo -> return serialize(requestId = requestId, function = function)
        is GetMainWebApp -> return serialize(requestId = requestId, function = function)
        is GetManagedBotAccessSettings -> return serialize(requestId = requestId, function = function)
        is GetManagedBotToken -> return serialize(requestId = requestId, function = function)
        is GetMapThumbnailFile -> return serialize(requestId = requestId, function = function)
        is GetMarkdownText -> return serialize(requestId = requestId, function = function)
        is GetMe -> return serialize(requestId = requestId, function = function)
        is GetMenuButton -> return serialize(requestId = requestId, function = function)
        is GetMessage -> return serialize(requestId = requestId, function = function)
        is GetMessageAddedReactions -> return serialize(requestId = requestId, function = function)
        is GetMessageAuthor -> return serialize(requestId = requestId, function = function)
        is GetMessageAvailableReactions -> return serialize(requestId = requestId, function = function)
        is GetMessageEffect -> return serialize(requestId = requestId, function = function)
        is GetMessageEmbeddingCode -> return serialize(requestId = requestId, function = function)
        is GetMessageFileType -> return serialize(requestId = requestId, function = function)
        is GetMessageImportConfirmationText -> return serialize(requestId = requestId, function = function)
        is GetMessageLink -> return serialize(requestId = requestId, function = function)
        is GetMessageLinkInfo -> return serialize(requestId = requestId, function = function)
        is GetMessageLocally -> return serialize(requestId = requestId, function = function)
        is GetMessageProperties -> return serialize(requestId = requestId, function = function)
        is GetMessagePublicForwards -> return serialize(requestId = requestId, function = function)
        is GetMessageReadDate -> return serialize(requestId = requestId, function = function)
        is GetMessageStatistics -> return serialize(requestId = requestId, function = function)
        is GetMessageThread -> return serialize(requestId = requestId, function = function)
        is GetMessageThreadHistory -> return serialize(requestId = requestId, function = function)
        is GetMessageViewers -> return serialize(requestId = requestId, function = function)
        is GetMessages -> return serialize(requestId = requestId, function = function)
        is GetNetworkStatistics -> return serialize(requestId = requestId, function = function)
        is GetNewChatPrivacySettings -> return serialize(requestId = requestId, function = function)
        is GetOauthLinkInfo -> return serialize(requestId = requestId, function = function)
        is GetOption -> return serialize(requestId = requestId, function = function)
        is GetOwnedBots -> return serialize(requestId = requestId, function = function)
        is GetOwnedStickerSets -> return serialize(requestId = requestId, function = function)
        is GetPaidMessageRevenue -> return serialize(requestId = requestId, function = function)
        is GetPasskeyParameters -> return serialize(requestId = requestId, function = function)
        is GetPassportAuthorizationForm -> return serialize(requestId = requestId, function = function)
        is GetPassportAuthorizationFormAvailableElements -> return serialize(requestId = requestId, function = function)
        is GetPassportElement -> return serialize(requestId = requestId, function = function)
        is GetPasswordState -> return serialize(requestId = requestId, function = function)
        is GetPaymentForm -> return serialize(requestId = requestId, function = function)
        is GetPaymentReceipt -> return serialize(requestId = requestId, function = function)
        is GetPersonalChatHistory -> return serialize(requestId = requestId, function = function)
        is GetPhoneNumberInfo -> return serialize(requestId = requestId, function = function)
        is GetPhoneNumberInfoSync -> return serialize(requestId = requestId, function = function)
        is GetPollOptionProperties -> return serialize(requestId = requestId, function = function)
        is GetPollVoteStatistics -> return serialize(requestId = requestId, function = function)
        is GetPollVoters -> return serialize(requestId = requestId, function = function)
        is GetPreferredCountryLanguage -> return serialize(requestId = requestId, function = function)
        is GetPremiumFeatures -> return serialize(requestId = requestId, function = function)
        is GetPremiumGiftPaymentOptions -> return serialize(requestId = requestId, function = function)
        is GetPremiumGiveawayPaymentOptions -> return serialize(requestId = requestId, function = function)
        is GetPremiumInfoSticker -> return serialize(requestId = requestId, function = function)
        is GetPremiumLimit -> return serialize(requestId = requestId, function = function)
        is GetPremiumState -> return serialize(requestId = requestId, function = function)
        is GetPremiumStickerExamples -> return serialize(requestId = requestId, function = function)
        is GetPremiumStickers -> return serialize(requestId = requestId, function = function)
        is GetPreparedInlineMessage -> return serialize(requestId = requestId, function = function)
        is GetPreparedKeyboardButton -> return serialize(requestId = requestId, function = function)
        is GetProxies -> return serialize(requestId = requestId, function = function)
        is GetPublicPostSearchLimits -> return serialize(requestId = requestId, function = function)
        is GetPushReceiverId -> return serialize(requestId = requestId, function = function)
        is GetReadDatePrivacySettings -> return serialize(requestId = requestId, function = function)
        is GetReceivedGift -> return serialize(requestId = requestId, function = function)
        is GetReceivedGifts -> return serialize(requestId = requestId, function = function)
        is GetRecentEmojiStatuses -> return serialize(requestId = requestId, function = function)
        is GetRecentInlineBots -> return serialize(requestId = requestId, function = function)
        is GetRecentStickers -> return serialize(requestId = requestId, function = function)
        is GetRecentlyOpenedChats -> return serialize(requestId = requestId, function = function)
        is GetRecentlyVisitedTMeUrls -> return serialize(requestId = requestId, function = function)
        is GetRecommendedChatFolders -> return serialize(requestId = requestId, function = function)
        is GetRecommendedChats -> return serialize(requestId = requestId, function = function)
        is GetRecoveryEmailAddress -> return serialize(requestId = requestId, function = function)
        is GetRemoteFile -> return serialize(requestId = requestId, function = function)
        is GetRepliedMessage -> return serialize(requestId = requestId, function = function)
        is GetSavedAnimations -> return serialize(requestId = requestId, function = function)
        is GetSavedMessagesTags -> return serialize(requestId = requestId, function = function)
        is GetSavedMessagesTopicHistory -> return serialize(requestId = requestId, function = function)
        is GetSavedMessagesTopicMessageByDate -> return serialize(requestId = requestId, function = function)
        is GetSavedNotificationSound -> return serialize(requestId = requestId, function = function)
        is GetSavedNotificationSounds -> return serialize(requestId = requestId, function = function)
        is GetSavedOrderInfo -> return serialize(requestId = requestId, function = function)
        is GetScopeNotificationSettings -> return serialize(requestId = requestId, function = function)
        is GetSearchSponsoredChats -> return serialize(requestId = requestId, function = function)
        is GetSearchedForTags -> return serialize(requestId = requestId, function = function)
        is GetSecretChat -> return serialize(requestId = requestId, function = function)
        is GetStakeDiceState -> return serialize(requestId = requestId, function = function)
        is GetStarAdAccountUrl -> return serialize(requestId = requestId, function = function)
        is GetStarGiftPaymentOptions -> return serialize(requestId = requestId, function = function)
        is GetStarGiveawayPaymentOptions -> return serialize(requestId = requestId, function = function)
        is GetStarPaymentOptions -> return serialize(requestId = requestId, function = function)
        is GetStarRevenueStatistics -> return serialize(requestId = requestId, function = function)
        is GetStarSubscriptions -> return serialize(requestId = requestId, function = function)
        is GetStarTransactions -> return serialize(requestId = requestId, function = function)
        is GetStarWithdrawalUrl -> return serialize(requestId = requestId, function = function)
        is GetStatisticalGraph -> return serialize(requestId = requestId, function = function)
        is GetStickerEmojis -> return serialize(requestId = requestId, function = function)
        is GetStickerOutline -> return serialize(requestId = requestId, function = function)
        is GetStickerOutlineSvgPath -> return serialize(requestId = requestId, function = function)
        is GetStickerSet -> return serialize(requestId = requestId, function = function)
        is GetStickerSetName -> return serialize(requestId = requestId, function = function)
        is GetStickers -> return serialize(requestId = requestId, function = function)
        is GetStorageStatistics -> return serialize(requestId = requestId, function = function)
        is GetStorageStatisticsFast -> return serialize(requestId = requestId, function = function)
        is GetStory -> return serialize(requestId = requestId, function = function)
        is GetStoryAlbumStories -> return serialize(requestId = requestId, function = function)
        is GetStoryAvailableReactions -> return serialize(requestId = requestId, function = function)
        is GetStoryInteractions -> return serialize(requestId = requestId, function = function)
        is GetStoryNotificationSettingsExceptions -> return serialize(requestId = requestId, function = function)
        is GetStoryPublicForwards -> return serialize(requestId = requestId, function = function)
        is GetStoryStatistics -> return serialize(requestId = requestId, function = function)
        is GetSuggestedFileName -> return serialize(requestId = requestId, function = function)
        is GetSuggestedStickerSetName -> return serialize(requestId = requestId, function = function)
        is GetSuitableDiscussionChats -> return serialize(requestId = requestId, function = function)
        is GetSuitablePersonalChats -> return serialize(requestId = requestId, function = function)
        is GetSupergroup -> return serialize(requestId = requestId, function = function)
        is GetSupergroupFullInfo -> return serialize(requestId = requestId, function = function)
        is GetSupergroupMembers -> return serialize(requestId = requestId, function = function)
        is GetSupportName -> return serialize(requestId = requestId, function = function)
        is GetSupportUser -> return serialize(requestId = requestId, function = function)
        is GetTemporaryPasswordState -> return serialize(requestId = requestId, function = function)
        is GetTextCompositionStyleExample -> return serialize(requestId = requestId, function = function)
        is GetTextEntities -> return serialize(requestId = requestId, function = function)
        is GetThemeParametersJsonString -> return serialize(requestId = requestId, function = function)
        is GetThemedChatEmojiStatuses -> return serialize(requestId = requestId, function = function)
        is GetThemedEmojiStatuses -> return serialize(requestId = requestId, function = function)
        is GetTimeZones -> return serialize(requestId = requestId, function = function)
        is GetTonTransactions -> return serialize(requestId = requestId, function = function)
        is GetTopChats -> return serialize(requestId = requestId, function = function)
        is GetTrendingStickerSets -> return serialize(requestId = requestId, function = function)
        is GetUpgradedGift -> return serialize(requestId = requestId, function = function)
        is GetUpgradedGiftEmojiStatuses -> return serialize(requestId = requestId, function = function)
        is GetUpgradedGiftValueInfo -> return serialize(requestId = requestId, function = function)
        is GetUpgradedGiftVariants -> return serialize(requestId = requestId, function = function)
        is GetUpgradedGiftWithdrawalUrl -> return serialize(requestId = requestId, function = function)
        is GetUpgradedGiftsPromotionalAnimation -> return serialize(requestId = requestId, function = function)
        is GetUser -> return serialize(requestId = requestId, function = function)
        is GetUserChatBoosts -> return serialize(requestId = requestId, function = function)
        is GetUserFullInfo -> return serialize(requestId = requestId, function = function)
        is GetUserLink -> return serialize(requestId = requestId, function = function)
        is GetUserPrivacySettingRules -> return serialize(requestId = requestId, function = function)
        is GetUserProfileAudios -> return serialize(requestId = requestId, function = function)
        is GetUserProfilePhotos -> return serialize(requestId = requestId, function = function)
        is GetUserSupportInfo -> return serialize(requestId = requestId, function = function)
        is GetVideoChatAvailableParticipants -> return serialize(requestId = requestId, function = function)
        is GetVideoChatInviteLink -> return serialize(requestId = requestId, function = function)
        is GetVideoChatRtmpUrl -> return serialize(requestId = requestId, function = function)
        is GetVideoMessageAdvertisements -> return serialize(requestId = requestId, function = function)
        is GetWebAppLinkUrl -> return serialize(requestId = requestId, function = function)
        is GetWebAppPlaceholder -> return serialize(requestId = requestId, function = function)
        is GetWebAppUrl -> return serialize(requestId = requestId, function = function)
        is GetWebPageInstantView -> return serialize(requestId = requestId, function = function)
        is GiftPremiumWithStars -> return serialize(requestId = requestId, function = function)
        is HideContactCloseBirthdays -> return serialize(requestId = requestId, function = function)
        is HideSuggestedAction -> return serialize(requestId = requestId, function = function)
        is ImportContacts -> return serialize(requestId = requestId, function = function)
        is ImportMessages -> return serialize(requestId = requestId, function = function)
        is IncreaseGiftAuctionBid -> return serialize(requestId = requestId, function = function)
        is InviteGroupCallParticipant -> return serialize(requestId = requestId, function = function)
        is InviteVideoChatParticipants -> return serialize(requestId = requestId, function = function)
        is IsLoginEmailAddressRequired -> return serialize(requestId = requestId, function = function)
        is IsProfileAudio -> return serialize(requestId = requestId, function = function)
        is JoinChat -> return serialize(requestId = requestId, function = function)
        is JoinChatByInviteLink -> return serialize(requestId = requestId, function = function)
        is JoinGroupCall -> return serialize(requestId = requestId, function = function)
        is JoinLiveStory -> return serialize(requestId = requestId, function = function)
        is JoinVideoChat -> return serialize(requestId = requestId, function = function)
        is LaunchPrepaidGiveaway -> return serialize(requestId = requestId, function = function)
        is LeaveChat -> return serialize(requestId = requestId, function = function)
        is LeaveGroupCall -> return serialize(requestId = requestId, function = function)
        is ListenToAudio -> return serialize(requestId = requestId, function = function)
        is LoadActiveStories -> return serialize(requestId = requestId, function = function)
        is LoadChats -> return serialize(requestId = requestId, function = function)
        is LoadDirectMessagesChatTopics -> return serialize(requestId = requestId, function = function)
        is LoadGroupCallParticipants -> return serialize(requestId = requestId, function = function)
        is LoadQuickReplyShortcutMessages -> return serialize(requestId = requestId, function = function)
        is LoadQuickReplyShortcuts -> return serialize(requestId = requestId, function = function)
        is LoadSavedMessagesTopics -> return serialize(requestId = requestId, function = function)
        is LogOut -> return serialize(requestId = requestId, function = function)
        is MarkChecklistTasksAsDone -> return serialize(requestId = requestId, function = function)
        is OpenBotSimilarBot -> return serialize(requestId = requestId, function = function)
        is OpenChat -> return serialize(requestId = requestId, function = function)
        is OpenChatSimilarChat -> return serialize(requestId = requestId, function = function)
        is OpenGiftAuction -> return serialize(requestId = requestId, function = function)
        is OpenMessageContent -> return serialize(requestId = requestId, function = function)
        is OpenSponsoredChat -> return serialize(requestId = requestId, function = function)
        is OpenStory -> return serialize(requestId = requestId, function = function)
        is OpenWebApp -> return serialize(requestId = requestId, function = function)
        is OptimizeStorage -> return serialize(requestId = requestId, function = function)
        is ParseMarkdown -> return serialize(requestId = requestId, function = function)
        is ParseTextEntities -> return serialize(requestId = requestId, function = function)
        is PinChatMessage -> return serialize(requestId = requestId, function = function)
        is PingProxy -> return serialize(requestId = requestId, function = function)
        is PlaceGiftAuctionBid -> return serialize(requestId = requestId, function = function)
        is PostStory -> return serialize(requestId = requestId, function = function)
        is PreliminaryUploadFile -> return serialize(requestId = requestId, function = function)
        is ProcessChatFolderNewChats -> return serialize(requestId = requestId, function = function)
        is ProcessChatHasProtectedContentDisableRequest -> return serialize(requestId = requestId, function = function)
        is ProcessChatJoinRequest -> return serialize(requestId = requestId, function = function)
        is ProcessChatJoinRequests -> return serialize(requestId = requestId, function = function)
        is ProcessGiftPurchaseOffer -> return serialize(requestId = requestId, function = function)
        is ProcessPushNotification -> return serialize(requestId = requestId, function = function)
        is RateSpeechRecognition -> return serialize(requestId = requestId, function = function)
        is ReadAllChatMentions -> return serialize(requestId = requestId, function = function)
        is ReadAllChatPollVotes -> return serialize(requestId = requestId, function = function)
        is ReadAllChatReactions -> return serialize(requestId = requestId, function = function)
        is ReadAllDirectMessagesChatTopicReactions -> return serialize(requestId = requestId, function = function)
        is ReadAllForumTopicMentions -> return serialize(requestId = requestId, function = function)
        is ReadAllForumTopicPollVotes -> return serialize(requestId = requestId, function = function)
        is ReadAllForumTopicReactions -> return serialize(requestId = requestId, function = function)
        is ReadBusinessMessage -> return serialize(requestId = requestId, function = function)
        is ReadChatList -> return serialize(requestId = requestId, function = function)
        is ReadFilePart -> return serialize(requestId = requestId, function = function)
        is ReaddQuickReplyShortcutMessages -> return serialize(requestId = requestId, function = function)
        is RecognizeSpeech -> return serialize(requestId = requestId, function = function)
        is RecoverAuthenticationPassword -> return serialize(requestId = requestId, function = function)
        is RecoverPassword -> return serialize(requestId = requestId, function = function)
        is RefundStarPayment -> return serialize(requestId = requestId, function = function)
        is RegisterDevice -> return serialize(requestId = requestId, function = function)
        is RegisterUser -> return serialize(requestId = requestId, function = function)
        is RemoveAllFilesFromDownloads -> return serialize(requestId = requestId, function = function)
        is RemoveAllWebBrowserSettingsExceptions -> return serialize(requestId = requestId, function = function)
        is RemoveBusinessConnectedBotFromChat -> return serialize(requestId = requestId, function = function)
        is RemoveChatActionBar -> return serialize(requestId = requestId, function = function)
        is RemoveContacts -> return serialize(requestId = requestId, function = function)
        is RemoveFavoriteSticker -> return serialize(requestId = requestId, function = function)
        is RemoveFileFromDownloads -> return serialize(requestId = requestId, function = function)
        is RemoveGiftCollectionGifts -> return serialize(requestId = requestId, function = function)
        is RemoveInstalledBackground -> return serialize(requestId = requestId, function = function)
        is RemoveLoginPasskey -> return serialize(requestId = requestId, function = function)
        is RemoveMessageReaction -> return serialize(requestId = requestId, function = function)
        is RemoveMessageSenderBotVerification -> return serialize(requestId = requestId, function = function)
        is RemoveNotification -> return serialize(requestId = requestId, function = function)
        is RemoveNotificationGroup -> return serialize(requestId = requestId, function = function)
        is RemovePendingLiveStoryReactions -> return serialize(requestId = requestId, function = function)
        is RemovePendingPaidMessageReactions -> return serialize(requestId = requestId, function = function)
        is RemoveProfileAudio -> return serialize(requestId = requestId, function = function)
        is RemoveProxy -> return serialize(requestId = requestId, function = function)
        is RemoveRecentHashtag -> return serialize(requestId = requestId, function = function)
        is RemoveRecentSticker -> return serialize(requestId = requestId, function = function)
        is RemoveRecentlyFoundChat -> return serialize(requestId = requestId, function = function)
        is RemoveSavedAnimation -> return serialize(requestId = requestId, function = function)
        is RemoveSavedNotificationSound -> return serialize(requestId = requestId, function = function)
        is RemoveSearchedForTag -> return serialize(requestId = requestId, function = function)
        is RemoveStickerFromSet -> return serialize(requestId = requestId, function = function)
        is RemoveStoryAlbumStories -> return serialize(requestId = requestId, function = function)
        is RemoveTextCompositionStyle -> return serialize(requestId = requestId, function = function)
        is RemoveTopChat -> return serialize(requestId = requestId, function = function)
        is RemoveWebBrowserSettingsException -> return serialize(requestId = requestId, function = function)
        is ReorderActiveUsernames -> return serialize(requestId = requestId, function = function)
        is ReorderBotActiveUsernames -> return serialize(requestId = requestId, function = function)
        is ReorderBotMediaPreviews -> return serialize(requestId = requestId, function = function)
        is ReorderChatFolders -> return serialize(requestId = requestId, function = function)
        is ReorderGiftCollectionGifts -> return serialize(requestId = requestId, function = function)
        is ReorderGiftCollections -> return serialize(requestId = requestId, function = function)
        is ReorderInstalledStickerSets -> return serialize(requestId = requestId, function = function)
        is ReorderQuickReplyShortcuts -> return serialize(requestId = requestId, function = function)
        is ReorderStoryAlbumStories -> return serialize(requestId = requestId, function = function)
        is ReorderStoryAlbums -> return serialize(requestId = requestId, function = function)
        is ReorderSupergroupActiveUsernames -> return serialize(requestId = requestId, function = function)
        is ReplaceLiveStoryRtmpUrl -> return serialize(requestId = requestId, function = function)
        is ReplacePrimaryChatInviteLink -> return serialize(requestId = requestId, function = function)
        is ReplaceStickerInSet -> return serialize(requestId = requestId, function = function)
        is ReplaceVideoChatRtmpUrl -> return serialize(requestId = requestId, function = function)
        is ReportAuthenticationCodeMissing -> return serialize(requestId = requestId, function = function)
        is ReportChat -> return serialize(requestId = requestId, function = function)
        is ReportChatPhoto -> return serialize(requestId = requestId, function = function)
        is ReportChatSponsoredMessage -> return serialize(requestId = requestId, function = function)
        is ReportMessageReactions -> return serialize(requestId = requestId, function = function)
        is ReportPhoneNumberCodeMissing -> return serialize(requestId = requestId, function = function)
        is ReportSponsoredChat -> return serialize(requestId = requestId, function = function)
        is ReportStory -> return serialize(requestId = requestId, function = function)
        is ReportSupergroupAntiSpamFalsePositive -> return serialize(requestId = requestId, function = function)
        is ReportSupergroupSpam -> return serialize(requestId = requestId, function = function)
        is ReportVideoMessageAdvertisement -> return serialize(requestId = requestId, function = function)
        is RequestAuthenticationPasswordRecovery -> return serialize(requestId = requestId, function = function)
        is RequestPasswordRecovery -> return serialize(requestId = requestId, function = function)
        is RequestQrCodeAuthentication -> return serialize(requestId = requestId, function = function)
        is ResendAuthenticationCode -> return serialize(requestId = requestId, function = function)
        is ResendEmailAddressVerificationCode -> return serialize(requestId = requestId, function = function)
        is ResendLoginEmailAddressCode -> return serialize(requestId = requestId, function = function)
        is ResendMessages -> return serialize(requestId = requestId, function = function)
        is ResendPhoneNumberCode -> return serialize(requestId = requestId, function = function)
        is ResendRecoveryEmailAddressCode -> return serialize(requestId = requestId, function = function)
        is ResetAllNotificationSettings -> return serialize(requestId = requestId, function = function)
        is ResetAuthenticationEmailAddress -> return serialize(requestId = requestId, function = function)
        is ResetInstalledBackgrounds -> return serialize(requestId = requestId, function = function)
        is ResetNetworkStatistics -> return serialize(requestId = requestId, function = function)
        is ResetPassword -> return serialize(requestId = requestId, function = function)
        is ReuseStarSubscription -> return serialize(requestId = requestId, function = function)
        is RevokeChatInviteLink -> return serialize(requestId = requestId, function = function)
        is RevokeGroupCallInviteLink -> return serialize(requestId = requestId, function = function)
        is SaveApplicationLogEvent -> return serialize(requestId = requestId, function = function)
        is SavePreparedInlineMessage -> return serialize(requestId = requestId, function = function)
        is SavePreparedKeyboardButton -> return serialize(requestId = requestId, function = function)
        is SearchAffiliatePrograms -> return serialize(requestId = requestId, function = function)
        is SearchBackground -> return serialize(requestId = requestId, function = function)
        is SearchCallMessages -> return serialize(requestId = requestId, function = function)
        is SearchChatAffiliateProgram -> return serialize(requestId = requestId, function = function)
        is SearchChatMembers -> return serialize(requestId = requestId, function = function)
        is SearchChatMessages -> return serialize(requestId = requestId, function = function)
        is SearchChatRecentLocationMessages -> return serialize(requestId = requestId, function = function)
        is SearchChats -> return serialize(requestId = requestId, function = function)
        is SearchChatsOnServer -> return serialize(requestId = requestId, function = function)
        is SearchContacts -> return serialize(requestId = requestId, function = function)
        is SearchEmojis -> return serialize(requestId = requestId, function = function)
        is SearchFileDownloads -> return serialize(requestId = requestId, function = function)
        is SearchGiftsForResale -> return serialize(requestId = requestId, function = function)
        is SearchHashtags -> return serialize(requestId = requestId, function = function)
        is SearchInstalledStickerSets -> return serialize(requestId = requestId, function = function)
        is SearchMessages -> return serialize(requestId = requestId, function = function)
        is SearchOutgoingDocumentMessages -> return serialize(requestId = requestId, function = function)
        is SearchPublicChat -> return serialize(requestId = requestId, function = function)
        is SearchPublicChats -> return serialize(requestId = requestId, function = function)
        is SearchPublicMessagesByTag -> return serialize(requestId = requestId, function = function)
        is SearchPublicPosts -> return serialize(requestId = requestId, function = function)
        is SearchPublicStoriesByLocation -> return serialize(requestId = requestId, function = function)
        is SearchPublicStoriesByTag -> return serialize(requestId = requestId, function = function)
        is SearchPublicStoriesByVenue -> return serialize(requestId = requestId, function = function)
        is SearchQuote -> return serialize(requestId = requestId, function = function)
        is SearchRecentlyFoundChats -> return serialize(requestId = requestId, function = function)
        is SearchSavedMessages -> return serialize(requestId = requestId, function = function)
        is SearchSecretMessages -> return serialize(requestId = requestId, function = function)
        is SearchStickerSet -> return serialize(requestId = requestId, function = function)
        is SearchStickerSets -> return serialize(requestId = requestId, function = function)
        is SearchStickers -> return serialize(requestId = requestId, function = function)
        is SearchStringsByPrefix -> return serialize(requestId = requestId, function = function)
        is SearchTextCompositionStyle -> return serialize(requestId = requestId, function = function)
        is SearchUserByPhoneNumber -> return serialize(requestId = requestId, function = function)
        is SearchUserByToken -> return serialize(requestId = requestId, function = function)
        is SearchWebApp -> return serialize(requestId = requestId, function = function)
        is SellGift -> return serialize(requestId = requestId, function = function)
        is SendAuthenticationFirebaseSms -> return serialize(requestId = requestId, function = function)
        is SendBotStartMessage -> return serialize(requestId = requestId, function = function)
        is SendBusinessMessage -> return serialize(requestId = requestId, function = function)
        is SendBusinessMessageAlbum -> return serialize(requestId = requestId, function = function)
        is SendCallDebugInformation -> return serialize(requestId = requestId, function = function)
        is SendCallLog -> return serialize(requestId = requestId, function = function)
        is SendCallRating -> return serialize(requestId = requestId, function = function)
        is SendCallSignalingData -> return serialize(requestId = requestId, function = function)
        is SendChatAction -> return serialize(requestId = requestId, function = function)
        is SendCustomRequest -> return serialize(requestId = requestId, function = function)
        is SendEmailAddressVerificationCode -> return serialize(requestId = requestId, function = function)
        is SendEphemeralMessage -> return serialize(requestId = requestId, function = function)
        is SendGift -> return serialize(requestId = requestId, function = function)
        is SendGiftPurchaseOffer -> return serialize(requestId = requestId, function = function)
        is SendGroupCallMessage -> return serialize(requestId = requestId, function = function)
        is SendInlineQueryResultMessage -> return serialize(requestId = requestId, function = function)
        is SendMessage -> return serialize(requestId = requestId, function = function)
        is SendMessageAlbum -> return serialize(requestId = requestId, function = function)
        is SendMessageViewMetrics -> return serialize(requestId = requestId, function = function)
        is SendPassportAuthorizationForm -> return serialize(requestId = requestId, function = function)
        is SendPaymentForm -> return serialize(requestId = requestId, function = function)
        is SendPhoneNumberCode -> return serialize(requestId = requestId, function = function)
        is SendPhoneNumberFirebaseSms -> return serialize(requestId = requestId, function = function)
        is SendQuickReplyShortcutMessages -> return serialize(requestId = requestId, function = function)
        is SendResoldGift -> return serialize(requestId = requestId, function = function)
        is SendRichMessageDraft -> return serialize(requestId = requestId, function = function)
        is SendTextMessageDraft -> return serialize(requestId = requestId, function = function)
        is SendWebAppCustomRequest -> return serialize(requestId = requestId, function = function)
        is SendWebAppData -> return serialize(requestId = requestId, function = function)
        is SetAccentColor -> return serialize(requestId = requestId, function = function)
        is SetAccountTtl -> return serialize(requestId = requestId, function = function)
        is SetAlarm -> return serialize(requestId = requestId, function = function)
        is SetApplicationVerificationToken -> return serialize(requestId = requestId, function = function)
        is SetArchiveChatListSettings -> return serialize(requestId = requestId, function = function)
        is SetAuthenticationEmailAddress -> return serialize(requestId = requestId, function = function)
        is SetAuthenticationPhoneNumber -> return serialize(requestId = requestId, function = function)
        is SetAuthenticationPremiumPurchaseTransaction -> return serialize(requestId = requestId, function = function)
        is SetAutoDownloadSettings -> return serialize(requestId = requestId, function = function)
        is SetAutosaveSettings -> return serialize(requestId = requestId, function = function)
        is SetBio -> return serialize(requestId = requestId, function = function)
        is SetBirthdate -> return serialize(requestId = requestId, function = function)
        is SetBotInfoDescription -> return serialize(requestId = requestId, function = function)
        is SetBotInfoShortDescription -> return serialize(requestId = requestId, function = function)
        is SetBotName -> return serialize(requestId = requestId, function = function)
        is SetBotProfilePhoto -> return serialize(requestId = requestId, function = function)
        is SetBotUpdatesStatus -> return serialize(requestId = requestId, function = function)
        is SetBusinessAccountBio -> return serialize(requestId = requestId, function = function)
        is SetBusinessAccountGiftSettings -> return serialize(requestId = requestId, function = function)
        is SetBusinessAccountName -> return serialize(requestId = requestId, function = function)
        is SetBusinessAccountProfilePhoto -> return serialize(requestId = requestId, function = function)
        is SetBusinessAccountUsername -> return serialize(requestId = requestId, function = function)
        is SetBusinessAwayMessageSettings -> return serialize(requestId = requestId, function = function)
        is SetBusinessConnectedBot -> return serialize(requestId = requestId, function = function)
        is SetBusinessGreetingMessageSettings -> return serialize(requestId = requestId, function = function)
        is SetBusinessLocation -> return serialize(requestId = requestId, function = function)
        is SetBusinessMessageIsPinned -> return serialize(requestId = requestId, function = function)
        is SetBusinessOpeningHours -> return serialize(requestId = requestId, function = function)
        is SetBusinessStartPage -> return serialize(requestId = requestId, function = function)
        is SetChatAccentColor -> return serialize(requestId = requestId, function = function)
        is SetChatActiveStoriesList -> return serialize(requestId = requestId, function = function)
        is SetChatAffiliateProgram -> return serialize(requestId = requestId, function = function)
        is SetChatAvailableReactions -> return serialize(requestId = requestId, function = function)
        is SetChatBackground -> return serialize(requestId = requestId, function = function)
        is SetChatClientData -> return serialize(requestId = requestId, function = function)
        is SetChatDescription -> return serialize(requestId = requestId, function = function)
        is SetChatDirectMessagesGroup -> return serialize(requestId = requestId, function = function)
        is SetChatDiscussionGroup -> return serialize(requestId = requestId, function = function)
        is SetChatDraftMessage -> return serialize(requestId = requestId, function = function)
        is SetChatEmojiStatus -> return serialize(requestId = requestId, function = function)
        is SetChatLocation -> return serialize(requestId = requestId, function = function)
        is SetChatMemberStatus -> return serialize(requestId = requestId, function = function)
        is SetChatMemberTag -> return serialize(requestId = requestId, function = function)
        is SetChatMessageAutoDeleteTime -> return serialize(requestId = requestId, function = function)
        is SetChatMessageSender -> return serialize(requestId = requestId, function = function)
        is SetChatNotificationSettings -> return serialize(requestId = requestId, function = function)
        is SetChatPaidMessageStarCount -> return serialize(requestId = requestId, function = function)
        is SetChatPermissions -> return serialize(requestId = requestId, function = function)
        is SetChatPhoto -> return serialize(requestId = requestId, function = function)
        is SetChatPinnedStories -> return serialize(requestId = requestId, function = function)
        is SetChatProfileAccentColor -> return serialize(requestId = requestId, function = function)
        is SetChatSlowModeDelay -> return serialize(requestId = requestId, function = function)
        is SetChatTheme -> return serialize(requestId = requestId, function = function)
        is SetChatTitle -> return serialize(requestId = requestId, function = function)
        is SetCloseFriends -> return serialize(requestId = requestId, function = function)
        is SetCommands -> return serialize(requestId = requestId, function = function)
        is SetCustomEmojiStickerSetThumbnail -> return serialize(requestId = requestId, function = function)
        is SetCustomLanguagePack -> return serialize(requestId = requestId, function = function)
        is SetCustomLanguagePackString -> return serialize(requestId = requestId, function = function)
        is SetDatabaseEncryptionKey -> return serialize(requestId = requestId, function = function)
        is SetDefaultBackground -> return serialize(requestId = requestId, function = function)
        is SetDefaultChannelAdministratorRights -> return serialize(requestId = requestId, function = function)
        is SetDefaultGroupAdministratorRights -> return serialize(requestId = requestId, function = function)
        is SetDefaultMessageAutoDeleteTime -> return serialize(requestId = requestId, function = function)
        is SetDefaultReactionType -> return serialize(requestId = requestId, function = function)
        is SetDirectMessagesChatTopicIsMarkedAsUnread -> return serialize(requestId = requestId, function = function)
        is SetEmojiStatus -> return serialize(requestId = requestId, function = function)
        is SetFileGenerationProgress -> return serialize(requestId = requestId, function = function)
        is SetForumTopicNotificationSettings -> return serialize(requestId = requestId, function = function)
        is SetGameScore -> return serialize(requestId = requestId, function = function)
        is SetGiftCollectionName -> return serialize(requestId = requestId, function = function)
        is SetGiftResalePrice -> return serialize(requestId = requestId, function = function)
        is SetGiftSettings -> return serialize(requestId = requestId, function = function)
        is SetGroupCallPaidMessageStarCount -> return serialize(requestId = requestId, function = function)
        is SetGroupCallParticipantIsSpeaking -> return serialize(requestId = requestId, function = function)
        is SetGroupCallParticipantVolumeLevel -> return serialize(requestId = requestId, function = function)
        is SetInactiveSessionTtl -> return serialize(requestId = requestId, function = function)
        is SetInlineGameScore -> return serialize(requestId = requestId, function = function)
        is SetLiveStoryMessageSender -> return serialize(requestId = requestId, function = function)
        is SetLogStream -> return serialize(requestId = requestId, function = function)
        is SetLogTagVerbosityLevel -> return serialize(requestId = requestId, function = function)
        is SetLogVerbosityLevel -> return serialize(requestId = requestId, function = function)
        is SetLoginEmailAddress -> return serialize(requestId = requestId, function = function)
        is SetMainProfileTab -> return serialize(requestId = requestId, function = function)
        is SetManagedBotAccessSettings -> return serialize(requestId = requestId, function = function)
        is SetMenuButton -> return serialize(requestId = requestId, function = function)
        is SetMessageFactCheck -> return serialize(requestId = requestId, function = function)
        is SetMessageReactions -> return serialize(requestId = requestId, function = function)
        is SetMessageSenderBlockList -> return serialize(requestId = requestId, function = function)
        is SetMessageSenderBotVerification -> return serialize(requestId = requestId, function = function)
        is SetName -> return serialize(requestId = requestId, function = function)
        is SetNetworkType -> return serialize(requestId = requestId, function = function)
        is SetNewChatPrivacySettings -> return serialize(requestId = requestId, function = function)
        is SetOption -> return serialize(requestId = requestId, function = function)
        is SetPaidMessageReactionType -> return serialize(requestId = requestId, function = function)
        is SetPassportElement -> return serialize(requestId = requestId, function = function)
        is SetPassportElementErrors -> return serialize(requestId = requestId, function = function)
        is SetPassword -> return serialize(requestId = requestId, function = function)
        is SetPersonalChat -> return serialize(requestId = requestId, function = function)
        is SetPinnedChats -> return serialize(requestId = requestId, function = function)
        is SetPinnedForumTopics -> return serialize(requestId = requestId, function = function)
        is SetPinnedGifts -> return serialize(requestId = requestId, function = function)
        is SetPinnedSavedMessagesTopics -> return serialize(requestId = requestId, function = function)
        is SetPollAnswer -> return serialize(requestId = requestId, function = function)
        is SetProfileAccentColor -> return serialize(requestId = requestId, function = function)
        is SetProfileAudioPosition -> return serialize(requestId = requestId, function = function)
        is SetProfilePhoto -> return serialize(requestId = requestId, function = function)
        is SetQuickReplyShortcutName -> return serialize(requestId = requestId, function = function)
        is SetReactionNotificationSettings -> return serialize(requestId = requestId, function = function)
        is SetReadDatePrivacySettings -> return serialize(requestId = requestId, function = function)
        is SetRecoveryEmailAddress -> return serialize(requestId = requestId, function = function)
        is SetSavedMessagesTagLabel -> return serialize(requestId = requestId, function = function)
        is SetScopeNotificationSettings -> return serialize(requestId = requestId, function = function)
        is SetStickerEmojis -> return serialize(requestId = requestId, function = function)
        is SetStickerKeywords -> return serialize(requestId = requestId, function = function)
        is SetStickerMaskPosition -> return serialize(requestId = requestId, function = function)
        is SetStickerPositionInSet -> return serialize(requestId = requestId, function = function)
        is SetStickerSetThumbnail -> return serialize(requestId = requestId, function = function)
        is SetStickerSetTitle -> return serialize(requestId = requestId, function = function)
        is SetStoryAlbumName -> return serialize(requestId = requestId, function = function)
        is SetStoryPrivacySettings -> return serialize(requestId = requestId, function = function)
        is SetStoryReaction -> return serialize(requestId = requestId, function = function)
        is SetSupergroupCustomEmojiStickerSet -> return serialize(requestId = requestId, function = function)
        is SetSupergroupMainProfileTab -> return serialize(requestId = requestId, function = function)
        is SetSupergroupStickerSet -> return serialize(requestId = requestId, function = function)
        is SetSupergroupUnrestrictBoostCount -> return serialize(requestId = requestId, function = function)
        is SetSupergroupUsername -> return serialize(requestId = requestId, function = function)
        is SetTdlibParameters -> return serialize(requestId = requestId, function = function)
        is SetUpgradedGiftColors -> return serialize(requestId = requestId, function = function)
        is SetUserEmojiStatus -> return serialize(requestId = requestId, function = function)
        is SetUserNote -> return serialize(requestId = requestId, function = function)
        is SetUserPersonalProfilePhoto -> return serialize(requestId = requestId, function = function)
        is SetUserPrivacySettingRules -> return serialize(requestId = requestId, function = function)
        is SetUserSupportInfo -> return serialize(requestId = requestId, function = function)
        is SetUsername -> return serialize(requestId = requestId, function = function)
        is SetVideoChatDefaultParticipant -> return serialize(requestId = requestId, function = function)
        is SetVideoChatTitle -> return serialize(requestId = requestId, function = function)
        is ShareChatWithBot -> return serialize(requestId = requestId, function = function)
        is SharePhoneNumber -> return serialize(requestId = requestId, function = function)
        is ShareUsersWithBot -> return serialize(requestId = requestId, function = function)
        is StartGroupCallRecording -> return serialize(requestId = requestId, function = function)
        is StartGroupCallScreenSharing -> return serialize(requestId = requestId, function = function)
        is StartLiveStory -> return serialize(requestId = requestId, function = function)
        is StartScheduledVideoChat -> return serialize(requestId = requestId, function = function)
        is StopBusinessPoll -> return serialize(requestId = requestId, function = function)
        is StopPoll -> return serialize(requestId = requestId, function = function)
        is SuggestUserBirthdate -> return serialize(requestId = requestId, function = function)
        is SuggestUserProfilePhoto -> return serialize(requestId = requestId, function = function)
        is SummarizeMessage -> return serialize(requestId = requestId, function = function)
        is SynchronizeLanguagePack -> return serialize(requestId = requestId, function = function)
        is TerminateAllOtherSessions -> return serialize(requestId = requestId, function = function)
        is TerminateSession -> return serialize(requestId = requestId, function = function)
        is TestCallBytes -> return serialize(requestId = requestId, function = function)
        is TestCallEmpty -> return serialize(requestId = requestId, function = function)
        is TestCallString -> return serialize(requestId = requestId, function = function)
        is TestCallVectorInt -> return serialize(requestId = requestId, function = function)
        is TestCallVectorIntObject -> return serialize(requestId = requestId, function = function)
        is TestCallVectorString -> return serialize(requestId = requestId, function = function)
        is TestCallVectorStringObject -> return serialize(requestId = requestId, function = function)
        is TestGetDifference -> return serialize(requestId = requestId, function = function)
        is TestNetwork -> return serialize(requestId = requestId, function = function)
        is TestProxy -> return serialize(requestId = requestId, function = function)
        is TestReturnError -> return serialize(requestId = requestId, function = function)
        is TestSquareInt -> return serialize(requestId = requestId, function = function)
        is TestUseUpdate -> return serialize(requestId = requestId, function = function)
        is ToggleAllDownloadsArePaused -> return serialize(requestId = requestId, function = function)
        is ToggleBotCanManageEmojiStatus -> return serialize(requestId = requestId, function = function)
        is ToggleBotIsAddedToAttachmentMenu -> return serialize(requestId = requestId, function = function)
        is ToggleBotUsernameIsActive -> return serialize(requestId = requestId, function = function)
        is ToggleBusinessConnectedBotChatIsPaused -> return serialize(requestId = requestId, function = function)
        is ToggleChatDefaultDisableNotification -> return serialize(requestId = requestId, function = function)
        is ToggleChatFolderTags -> return serialize(requestId = requestId, function = function)
        is ToggleChatGiftNotifications -> return serialize(requestId = requestId, function = function)
        is ToggleChatHasProtectedContent -> return serialize(requestId = requestId, function = function)
        is ToggleChatIsMarkedAsUnread -> return serialize(requestId = requestId, function = function)
        is ToggleChatIsPinned -> return serialize(requestId = requestId, function = function)
        is ToggleChatIsTranslatable -> return serialize(requestId = requestId, function = function)
        is ToggleChatViewAsTopics -> return serialize(requestId = requestId, function = function)
        is ToggleDirectMessagesChatTopicCanSendUnpaidMessages -> return serialize(requestId = requestId, function = function)
        is ToggleDownloadIsPaused -> return serialize(requestId = requestId, function = function)
        is ToggleForumTopicIsClosed -> return serialize(requestId = requestId, function = function)
        is ToggleForumTopicIsPinned -> return serialize(requestId = requestId, function = function)
        is ToggleGeneralForumTopicIsHidden -> return serialize(requestId = requestId, function = function)
        is ToggleGiftIsSaved -> return serialize(requestId = requestId, function = function)
        is ToggleGroupCallAreMessagesAllowed -> return serialize(requestId = requestId, function = function)
        is ToggleGroupCallIsMyVideoEnabled -> return serialize(requestId = requestId, function = function)
        is ToggleGroupCallIsMyVideoPaused -> return serialize(requestId = requestId, function = function)
        is ToggleGroupCallParticipantIsHandRaised -> return serialize(requestId = requestId, function = function)
        is ToggleGroupCallParticipantIsMuted -> return serialize(requestId = requestId, function = function)
        is ToggleGroupCallScreenSharingIsPaused -> return serialize(requestId = requestId, function = function)
        is ToggleHasSponsoredMessagesEnabled -> return serialize(requestId = requestId, function = function)
        is ToggleSavedMessagesTopicIsPinned -> return serialize(requestId = requestId, function = function)
        is ToggleSessionCanAcceptCalls -> return serialize(requestId = requestId, function = function)
        is ToggleSessionCanAcceptSecretChats -> return serialize(requestId = requestId, function = function)
        is ToggleStoryIsPostedToChatPage -> return serialize(requestId = requestId, function = function)
        is ToggleSupergroupCanHaveSponsoredMessages -> return serialize(requestId = requestId, function = function)
        is ToggleSupergroupHasAggressiveAntiSpamEnabled -> return serialize(requestId = requestId, function = function)
        is ToggleSupergroupHasAutomaticTranslation -> return serialize(requestId = requestId, function = function)
        is ToggleSupergroupHasHiddenMembers -> return serialize(requestId = requestId, function = function)
        is ToggleSupergroupIsAllHistoryAvailable -> return serialize(requestId = requestId, function = function)
        is ToggleSupergroupIsBroadcastGroup -> return serialize(requestId = requestId, function = function)
        is ToggleSupergroupIsForum -> return serialize(requestId = requestId, function = function)
        is ToggleSupergroupJoinByRequest -> return serialize(requestId = requestId, function = function)
        is ToggleSupergroupJoinToSendMessages -> return serialize(requestId = requestId, function = function)
        is ToggleSupergroupSignMessages -> return serialize(requestId = requestId, function = function)
        is ToggleSupergroupUsernameIsActive -> return serialize(requestId = requestId, function = function)
        is ToggleUsernameIsActive -> return serialize(requestId = requestId, function = function)
        is ToggleVideoChatEnabledStartNotification -> return serialize(requestId = requestId, function = function)
        is ToggleVideoChatMuteNewParticipants -> return serialize(requestId = requestId, function = function)
        is TransferBusinessAccountStars -> return serialize(requestId = requestId, function = function)
        is TransferChatOwnership -> return serialize(requestId = requestId, function = function)
        is TransferGift -> return serialize(requestId = requestId, function = function)
        is TranslateMessageRichMessage -> return serialize(requestId = requestId, function = function)
        is TranslateMessageText -> return serialize(requestId = requestId, function = function)
        is TranslateRichMessage -> return serialize(requestId = requestId, function = function)
        is TranslateText -> return serialize(requestId = requestId, function = function)
        is UnpinAllChatMessages -> return serialize(requestId = requestId, function = function)
        is UnpinAllDirectMessagesChatTopicMessages -> return serialize(requestId = requestId, function = function)
        is UnpinAllForumTopicMessages -> return serialize(requestId = requestId, function = function)
        is UnpinChatMessage -> return serialize(requestId = requestId, function = function)
        is UpgradeBasicGroupChatToSupergroupChat -> return serialize(requestId = requestId, function = function)
        is UpgradeGift -> return serialize(requestId = requestId, function = function)
        is UploadStickerFile -> return serialize(requestId = requestId, function = function)
        is ValidateOrderInfo -> return serialize(requestId = requestId, function = function)
        is ViewMessages -> return serialize(requestId = requestId, function = function)
        is ViewPremiumFeature -> return serialize(requestId = requestId, function = function)
        is ViewSponsoredChat -> return serialize(requestId = requestId, function = function)
        is ViewTrendingStickerSets -> return serialize(requestId = requestId, function = function)
        is ViewVideoMessageAdvertisement -> return serialize(requestId = requestId, function = function)
        is WriteGeneratedFilePart -> return serialize(requestId = requestId, function = function)
        else -> error(message = "Unknown function type: ${function.toString()}")
    }
}

private fun serialize(requestId: Long, function: AcceptCall): String {
    return buildJsonObjectString {
        put(key = "@type", string = "acceptCall")
        put(key = "@extra", long = requestId)
        put(key = "call_id", int = function.callId)
        put(key = "protocol", value = function.protocol) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: AcceptOauthRequest): String {
    return buildJsonObjectString {
        put(key = "@type", string = "acceptOauthRequest")
        put(key = "@extra", long = requestId)
        put(key = "url", string = function.url)
        put(key = "match_code", string = function.matchCode)
        put(key = "allow_write_access", boolean = function.allowWriteAccess)
        put(key = "allow_phone_number_access", boolean = function.allowPhoneNumberAccess)
    }
}

private fun serialize(requestId: Long, function: AcceptTermsOfService): String {
    return buildJsonObjectString {
        put(key = "@type", string = "acceptTermsOfService")
        put(key = "@extra", long = requestId)
        put(key = "terms_of_service_id", string = function.termsOfServiceId)
    }
}

private fun serialize(requestId: Long, function: ActivateStoryStealthMode): String {
    return buildJsonObjectString {
        put(key = "@type", string = "activateStoryStealthMode")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: AddBotMediaPreview): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addBotMediaPreview")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "language_code", string = function.languageCode)
        put(key = "content", value = function.content) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: AddChatFolderByInviteLink): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addChatFolderByInviteLink")
        put(key = "@extra", long = requestId)
        put(key = "invite_link", string = function.inviteLink)
        put(key = "chat_ids", longs = function.chatIds)
    }
}

private fun serialize(requestId: Long, function: AddChatMember): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addChatMember")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "user_id", long = function.userId)
        put(key = "forward_limit", int = function.forwardLimit)
    }
}

private fun serialize(requestId: Long, function: AddChatMembers): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addChatMembers")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "user_ids", longs = function.userIds)
    }
}

private fun serialize(requestId: Long, function: AddChatToList): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addChatToList")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "chat_list", value = function.chatList) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: AddChecklistTasks): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addChecklistTasks")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "tasks", objects = function.tasks) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: AddContact): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addContact")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
        put(key = "contact", value = function.contact) { data -> serialize(dto = data) }
        put(key = "share_phone_number", boolean = function.sharePhoneNumber)
    }
}

private fun serialize(requestId: Long, function: AddCustomServerLanguagePack): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addCustomServerLanguagePack")
        put(key = "@extra", long = requestId)
        put(key = "language_pack_id", string = function.languagePackId)
    }
}

private fun serialize(requestId: Long, function: AddFavoriteSticker): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addFavoriteSticker")
        put(key = "@extra", long = requestId)
        put(key = "sticker", value = function.sticker) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: AddFileToDownloads): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addFileToDownloads")
        put(key = "@extra", long = requestId)
        put(key = "file_id", int = function.fileId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "priority", int = function.priority)
    }
}

private fun serialize(requestId: Long, function: AddGiftCollectionGifts): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addGiftCollectionGifts")
        put(key = "@extra", long = requestId)
        put(key = "owner_id", value = function.ownerId) { data -> serialize(dto = data) }
        put(key = "collection_id", int = function.collectionId)
        put(key = "received_gift_ids", strings = function.receivedGiftIds)
    }
}

private fun serialize(requestId: Long, function: AddLocalMessage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addLocalMessage")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "sender_id", value = function.senderId) { data -> serialize(dto = data) }
        put(key = "reply_to", value = function.replyTo) { data -> serialize(dto = data) }
        put(key = "disable_notification", boolean = function.disableNotification)
        put(key = "input_message_content", value = function.inputMessageContent) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: AddLogMessage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addLogMessage")
        put(key = "@extra", long = requestId)
        put(key = "verbosity_level", int = function.verbosityLevel)
        put(key = "text", string = function.text)
    }
}

private fun serialize(requestId: Long, function: AddLoginPasskey): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addLoginPasskey")
        put(key = "@extra", long = requestId)
        put(key = "client_data", string = function.clientData)
        put(key = "attestation_object", bytes = function.attestationObject)
    }
}

private fun serialize(requestId: Long, function: AddMessageReaction): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addMessageReaction")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "reaction_type", value = function.reactionType) { data -> serialize(dto = data) }
        put(key = "is_big", boolean = function.isBig)
        put(key = "update_recent_reactions", boolean = function.updateRecentReactions)
    }
}

private fun serialize(requestId: Long, function: AddNetworkStatistics): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addNetworkStatistics")
        put(key = "@extra", long = requestId)
        put(key = "entry", value = function.entry) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: AddOffer): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addOffer")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "options", value = function.options) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: AddPendingLiveStoryReaction): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addPendingLiveStoryReaction")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
        put(key = "star_count", long = function.starCount)
    }
}

private fun serialize(requestId: Long, function: AddPendingPaidMessageReaction): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addPendingPaidMessageReaction")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "star_count", long = function.starCount)
        put(key = "type", value = function.type) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: AddPollOption): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addPollOption")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "option", value = function.option) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: AddProfileAudio): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addProfileAudio")
        put(key = "@extra", long = requestId)
        put(key = "audio", value = function.audio) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: AddProxy): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addProxy")
        put(key = "@extra", long = requestId)
        put(key = "proxy", value = function.proxy) { data -> serialize(dto = data) }
        put(key = "enable", boolean = function.enable)
        put(key = "comment", string = function.comment)
    }
}

private fun serialize(requestId: Long, function: AddQuickReplyShortcutInlineQueryResultMessage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addQuickReplyShortcutInlineQueryResultMessage")
        put(key = "@extra", long = requestId)
        put(key = "shortcut_name", string = function.shortcutName)
        put(key = "reply_to_message_id", long = function.replyToMessageId)
        put(key = "query_id", long = function.queryId)
        put(key = "result_id", string = function.resultId)
        put(key = "hide_via_bot", boolean = function.hideViaBot)
    }
}

private fun serialize(requestId: Long, function: AddQuickReplyShortcutMessage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addQuickReplyShortcutMessage")
        put(key = "@extra", long = requestId)
        put(key = "shortcut_name", string = function.shortcutName)
        put(key = "reply_to_message_id", long = function.replyToMessageId)
        put(key = "input_message_content", value = function.inputMessageContent) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: AddQuickReplyShortcutMessageAlbum): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addQuickReplyShortcutMessageAlbum")
        put(key = "@extra", long = requestId)
        put(key = "shortcut_name", string = function.shortcutName)
        put(key = "reply_to_message_id", long = function.replyToMessageId)
        put(key = "input_message_contents", objects = function.inputMessageContents) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: AddRecentSticker): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addRecentSticker")
        put(key = "@extra", long = requestId)
        put(key = "is_attached", boolean = function.isAttached)
        put(key = "sticker", value = function.sticker) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: AddRecentlyFoundChat): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addRecentlyFoundChat")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: AddSavedAnimation): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addSavedAnimation")
        put(key = "@extra", long = requestId)
        put(key = "animation", value = function.animation) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: AddSavedNotificationSound): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addSavedNotificationSound")
        put(key = "@extra", long = requestId)
        put(key = "sound", value = function.sound) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: AddStickerToSet): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addStickerToSet")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
        put(key = "name", string = function.name)
        put(key = "sticker", value = function.sticker) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: AddStoryAlbumStories): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addStoryAlbumStories")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "story_album_id", int = function.storyAlbumId)
        put(key = "story_ids", ints = function.storyIds)
    }
}

private fun serialize(requestId: Long, function: AddTextCompositionStyle): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addTextCompositionStyle")
        put(key = "@extra", long = requestId)
        put(key = "name", string = function.name)
    }
}

private fun serialize(requestId: Long, function: AddWebBrowserSettingsException): String {
    return buildJsonObjectString {
        put(key = "@type", string = "addWebBrowserSettingsException")
        put(key = "@extra", long = requestId)
        put(key = "open_external_browser", boolean = function.openExternalBrowser)
        put(key = "url", string = function.url)
    }
}

private fun serialize(requestId: Long, function: AllowBotToSendMessages): String {
    return buildJsonObjectString {
        put(key = "@type", string = "allowBotToSendMessages")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
    }
}

private fun serialize(requestId: Long, function: AllowUnpaidMessagesFromUser): String {
    return buildJsonObjectString {
        put(key = "@type", string = "allowUnpaidMessagesFromUser")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
        put(key = "refund_payments", boolean = function.refundPayments)
    }
}

private fun serialize(requestId: Long, function: AnswerCallbackQuery): String {
    return buildJsonObjectString {
        put(key = "@type", string = "answerCallbackQuery")
        put(key = "@extra", long = requestId)
        put(key = "callback_query_id", long = function.callbackQueryId)
        put(key = "text", string = function.text)
        put(key = "show_alert", boolean = function.showAlert)
        put(key = "url", string = function.url)
        put(key = "cache_time", int = function.cacheTime)
    }
}

private fun serialize(requestId: Long, function: AnswerChatJoinRequestQuery): String {
    return buildJsonObjectString {
        put(key = "@type", string = "answerChatJoinRequestQuery")
        put(key = "@extra", long = requestId)
        put(key = "query_id", long = function.queryId)
        put(key = "result", value = function.result) { data -> serialize(dto = data) }
        put(key = "url", string = function.url)
    }
}

private fun serialize(requestId: Long, function: AnswerCustomQuery): String {
    return buildJsonObjectString {
        put(key = "@type", string = "answerCustomQuery")
        put(key = "@extra", long = requestId)
        put(key = "custom_query_id", long = function.customQueryId)
        put(key = "data", string = function.data)
    }
}

private fun serialize(requestId: Long, function: AnswerGuestQuery): String {
    return buildJsonObjectString {
        put(key = "@type", string = "answerGuestQuery")
        put(key = "@extra", long = requestId)
        put(key = "guest_query_id", long = function.guestQueryId)
        put(key = "result", value = function.result) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: AnswerInlineQuery): String {
    return buildJsonObjectString {
        put(key = "@type", string = "answerInlineQuery")
        put(key = "@extra", long = requestId)
        put(key = "inline_query_id", long = function.inlineQueryId)
        put(key = "is_personal", boolean = function.isPersonal)
        put(key = "button", value = function.button) { data -> serialize(dto = data) }
        put(key = "results", objects = function.results) { data -> serialize(dto = data) }
        put(key = "cache_time", int = function.cacheTime)
        put(key = "next_offset", string = function.nextOffset)
    }
}

private fun serialize(requestId: Long, function: AnswerPreCheckoutQuery): String {
    return buildJsonObjectString {
        put(key = "@type", string = "answerPreCheckoutQuery")
        put(key = "@extra", long = requestId)
        put(key = "pre_checkout_query_id", long = function.preCheckoutQueryId)
        put(key = "error_message", string = function.errorMessage)
    }
}

private fun serialize(requestId: Long, function: AnswerShippingQuery): String {
    return buildJsonObjectString {
        put(key = "@type", string = "answerShippingQuery")
        put(key = "@extra", long = requestId)
        put(key = "shipping_query_id", long = function.shippingQueryId)
        put(key = "shipping_options", objects = function.shippingOptions) { data -> serialize(dto = data) }
        put(key = "error_message", string = function.errorMessage)
    }
}

private fun serialize(requestId: Long, function: AnswerWebAppQuery): String {
    return buildJsonObjectString {
        put(key = "@type", string = "answerWebAppQuery")
        put(key = "@extra", long = requestId)
        put(key = "web_app_query_id", string = function.webAppQueryId)
        put(key = "result", value = function.result) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: ApplyPremiumGiftCode): String {
    return buildJsonObjectString {
        put(key = "@type", string = "applyPremiumGiftCode")
        put(key = "@extra", long = requestId)
        put(key = "code", string = function.code)
    }
}

private fun serialize(requestId: Long, function: ApproveSuggestedPost): String {
    return buildJsonObjectString {
        put(key = "@type", string = "approveSuggestedPost")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "send_date", int = function.sendDate)
    }
}

private fun serialize(requestId: Long, function: AssignStoreTransaction): String {
    return buildJsonObjectString {
        put(key = "@type", string = "assignStoreTransaction")
        put(key = "@extra", long = requestId)
        put(key = "transaction", value = function.transaction) { data -> serialize(dto = data) }
        put(key = "purpose", value = function.purpose) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: BanChatMember): String {
    return buildJsonObjectString {
        put(key = "@type", string = "banChatMember")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "member_id", value = function.memberId) { data -> serialize(dto = data) }
        put(key = "banned_until_date", int = function.bannedUntilDate)
        put(key = "revoke_messages", boolean = function.revokeMessages)
    }
}

private fun serialize(requestId: Long, function: BanGroupCallParticipants): String {
    return buildJsonObjectString {
        put(key = "@type", string = "banGroupCallParticipants")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
        put(key = "user_ids", longs = function.userIds)
    }
}

private fun serialize(requestId: Long, function: BlockMessageSenderFromReplies): String {
    return buildJsonObjectString {
        put(key = "@type", string = "blockMessageSenderFromReplies")
        put(key = "@extra", long = requestId)
        put(key = "message_id", long = function.messageId)
        put(key = "delete_message", boolean = function.deleteMessage)
        put(key = "delete_all_messages", boolean = function.deleteAllMessages)
        put(key = "report_spam", boolean = function.reportSpam)
    }
}

private fun serialize(requestId: Long, function: BoostChat): String {
    return buildJsonObjectString {
        put(key = "@type", string = "boostChat")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "slot_ids", ints = function.slotIds)
    }
}

private fun serialize(requestId: Long, function: BuyGiftUpgrade): String {
    return buildJsonObjectString {
        put(key = "@type", string = "buyGiftUpgrade")
        put(key = "@extra", long = requestId)
        put(key = "owner_id", value = function.ownerId) { data -> serialize(dto = data) }
        put(key = "prepaid_upgrade_hash", string = function.prepaidUpgradeHash)
        put(key = "star_count", long = function.starCount)
    }
}

private fun serialize(requestId: Long, function: CanBotSendMessages): String {
    return buildJsonObjectString {
        put(key = "@type", string = "canBotSendMessages")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
    }
}

private fun serialize(requestId: Long, function: CanPostStory): String {
    return buildJsonObjectString {
        put(key = "@type", string = "canPostStory")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: CanPurchaseFromStore): String {
    return buildJsonObjectString {
        put(key = "@type", string = "canPurchaseFromStore")
        put(key = "@extra", long = requestId)
        put(key = "purpose", value = function.purpose) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: CanSendGift): String {
    return buildJsonObjectString {
        put(key = "@type", string = "canSendGift")
        put(key = "@extra", long = requestId)
        put(key = "gift_id", long = function.giftId)
    }
}

private fun serialize(requestId: Long, function: CanSendMessageToUser): String {
    return buildJsonObjectString {
        put(key = "@type", string = "canSendMessageToUser")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
        put(key = "only_local", boolean = function.onlyLocal)
    }
}

private fun serialize(requestId: Long, function: CanTransferOwnership): String {
    return buildJsonObjectString {
        put(key = "@type", string = "canTransferOwnership")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: CancelDownloadFile): String {
    return buildJsonObjectString {
        put(key = "@type", string = "cancelDownloadFile")
        put(key = "@extra", long = requestId)
        put(key = "file_id", int = function.fileId)
        put(key = "only_if_pending", boolean = function.onlyIfPending)
    }
}

private fun serialize(requestId: Long, function: CancelPasswordReset): String {
    return buildJsonObjectString {
        put(key = "@type", string = "cancelPasswordReset")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: CancelPreliminaryUploadFile): String {
    return buildJsonObjectString {
        put(key = "@type", string = "cancelPreliminaryUploadFile")
        put(key = "@extra", long = requestId)
        put(key = "file_id", int = function.fileId)
    }
}

private fun serialize(requestId: Long, function: CancelRecoveryEmailAddressVerification): String {
    return buildJsonObjectString {
        put(key = "@type", string = "cancelRecoveryEmailAddressVerification")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: ChangeImportedContacts): String {
    return buildJsonObjectString {
        put(key = "@type", string = "changeImportedContacts")
        put(key = "@extra", long = requestId)
        put(key = "contacts", objects = function.contacts) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: ChangeStickerSet): String {
    return buildJsonObjectString {
        put(key = "@type", string = "changeStickerSet")
        put(key = "@extra", long = requestId)
        put(key = "set_id", long = function.setId)
        put(key = "is_installed", boolean = function.isInstalled)
        put(key = "is_archived", boolean = function.isArchived)
    }
}

private fun serialize(requestId: Long, function: ChangeWebBrowserSettings): String {
    return buildJsonObjectString {
        put(key = "@type", string = "changeWebBrowserSettings")
        put(key = "@extra", long = requestId)
        put(key = "open_external_browser", boolean = function.openExternalBrowser)
        put(key = "display_close_button", boolean = function.displayCloseButton)
    }
}

private fun serialize(requestId: Long, function: CheckAuthenticationBotToken): String {
    return buildJsonObjectString {
        put(key = "@type", string = "checkAuthenticationBotToken")
        put(key = "@extra", long = requestId)
        put(key = "token", string = function.token)
    }
}

private fun serialize(requestId: Long, function: CheckAuthenticationCode): String {
    return buildJsonObjectString {
        put(key = "@type", string = "checkAuthenticationCode")
        put(key = "@extra", long = requestId)
        put(key = "code", string = function.code)
    }
}

private fun serialize(requestId: Long, function: CheckAuthenticationEmailCode): String {
    return buildJsonObjectString {
        put(key = "@type", string = "checkAuthenticationEmailCode")
        put(key = "@extra", long = requestId)
        put(key = "code", value = function.code) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: CheckAuthenticationPasskey): String {
    return buildJsonObjectString {
        put(key = "@type", string = "checkAuthenticationPasskey")
        put(key = "@extra", long = requestId)
        put(key = "credential_id", string = function.credentialId)
        put(key = "client_data", string = function.clientData)
        put(key = "authenticator_data", bytes = function.authenticatorData)
        put(key = "signature", bytes = function.signature)
        put(key = "user_handle", bytes = function.userHandle)
    }
}

private fun serialize(requestId: Long, function: CheckAuthenticationPassword): String {
    return buildJsonObjectString {
        put(key = "@type", string = "checkAuthenticationPassword")
        put(key = "@extra", long = requestId)
        put(key = "password", string = function.password)
    }
}

private fun serialize(requestId: Long, function: CheckAuthenticationPasswordRecoveryCode): String {
    return buildJsonObjectString {
        put(key = "@type", string = "checkAuthenticationPasswordRecoveryCode")
        put(key = "@extra", long = requestId)
        put(key = "recovery_code", string = function.recoveryCode)
    }
}

private fun serialize(requestId: Long, function: CheckAuthenticationPremiumPurchase): String {
    return buildJsonObjectString {
        put(key = "@type", string = "checkAuthenticationPremiumPurchase")
        put(key = "@extra", long = requestId)
        put(key = "premium_day_count", int = function.premiumDayCount)
        put(key = "currency", string = function.currency)
        put(key = "amount", long = function.amount)
    }
}

private fun serialize(requestId: Long, function: CheckAuthenticationWebToken): String {
    return buildJsonObjectString {
        put(key = "@type", string = "checkAuthenticationWebToken")
        put(key = "@extra", long = requestId)
        put(key = "token", string = function.token)
        put(key = "dc_id", int = function.dcId)
    }
}

private fun serialize(requestId: Long, function: CheckBotUsername): String {
    return buildJsonObjectString {
        put(key = "@type", string = "checkBotUsername")
        put(key = "@extra", long = requestId)
        put(key = "username", string = function.username)
    }
}

private fun serialize(requestId: Long, function: CheckChatFolderInviteLink): String {
    return buildJsonObjectString {
        put(key = "@type", string = "checkChatFolderInviteLink")
        put(key = "@extra", long = requestId)
        put(key = "invite_link", string = function.inviteLink)
    }
}

private fun serialize(requestId: Long, function: CheckChatInviteLink): String {
    return buildJsonObjectString {
        put(key = "@type", string = "checkChatInviteLink")
        put(key = "@extra", long = requestId)
        put(key = "invite_link", string = function.inviteLink)
    }
}

private fun serialize(requestId: Long, function: CheckChatUsername): String {
    return buildJsonObjectString {
        put(key = "@type", string = "checkChatUsername")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "username", string = function.username)
    }
}

private fun serialize(requestId: Long, function: CheckCreatedPublicChatsLimit): String {
    return buildJsonObjectString {
        put(key = "@type", string = "checkCreatedPublicChatsLimit")
        put(key = "@extra", long = requestId)
        put(key = "type", value = function.type) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: CheckEmailAddressVerificationCode): String {
    return buildJsonObjectString {
        put(key = "@type", string = "checkEmailAddressVerificationCode")
        put(key = "@extra", long = requestId)
        put(key = "code", string = function.code)
    }
}

private fun serialize(requestId: Long, function: CheckLoginEmailAddressCode): String {
    return buildJsonObjectString {
        put(key = "@type", string = "checkLoginEmailAddressCode")
        put(key = "@extra", long = requestId)
        put(key = "code", value = function.code) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: CheckOauthRequestMatchCode): String {
    return buildJsonObjectString {
        put(key = "@type", string = "checkOauthRequestMatchCode")
        put(key = "@extra", long = requestId)
        put(key = "url", string = function.url)
        put(key = "match_code", string = function.matchCode)
    }
}

private fun serialize(requestId: Long, function: CheckPasswordRecoveryCode): String {
    return buildJsonObjectString {
        put(key = "@type", string = "checkPasswordRecoveryCode")
        put(key = "@extra", long = requestId)
        put(key = "recovery_code", string = function.recoveryCode)
    }
}

private fun serialize(requestId: Long, function: CheckPhoneNumberCode): String {
    return buildJsonObjectString {
        put(key = "@type", string = "checkPhoneNumberCode")
        put(key = "@extra", long = requestId)
        put(key = "code", string = function.code)
    }
}

private fun serialize(requestId: Long, function: CheckPremiumGiftCode): String {
    return buildJsonObjectString {
        put(key = "@type", string = "checkPremiumGiftCode")
        put(key = "@extra", long = requestId)
        put(key = "code", string = function.code)
    }
}

private fun serialize(requestId: Long, function: CheckQuickReplyShortcutName): String {
    return buildJsonObjectString {
        put(key = "@type", string = "checkQuickReplyShortcutName")
        put(key = "@extra", long = requestId)
        put(key = "name", string = function.name)
    }
}

private fun serialize(requestId: Long, function: CheckRecoveryEmailAddressCode): String {
    return buildJsonObjectString {
        put(key = "@type", string = "checkRecoveryEmailAddressCode")
        put(key = "@extra", long = requestId)
        put(key = "code", string = function.code)
    }
}

private fun serialize(requestId: Long, function: CheckStickerSetName): String {
    return buildJsonObjectString {
        put(key = "@type", string = "checkStickerSetName")
        put(key = "@extra", long = requestId)
        put(key = "name", string = function.name)
    }
}

private fun serialize(requestId: Long, function: CheckWebAppFileDownload): String {
    return buildJsonObjectString {
        put(key = "@type", string = "checkWebAppFileDownload")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "file_name", string = function.fileName)
        put(key = "url", string = function.url)
    }
}

private fun serialize(requestId: Long, function: CleanFileName): String {
    return buildJsonObjectString {
        put(key = "@type", string = "cleanFileName")
        put(key = "@extra", long = requestId)
        put(key = "file_name", string = function.fileName)
    }
}

private fun serialize(requestId: Long, function: ClearAllDraftMessages): String {
    return buildJsonObjectString {
        put(key = "@type", string = "clearAllDraftMessages")
        put(key = "@extra", long = requestId)
        put(key = "exclude_secret_chats", boolean = function.excludeSecretChats)
    }
}

private fun serialize(requestId: Long, function: ClearAutosaveSettingsExceptions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "clearAutosaveSettingsExceptions")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: ClearImportedContacts): String {
    return buildJsonObjectString {
        put(key = "@type", string = "clearImportedContacts")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: ClearRecentEmojiStatuses): String {
    return buildJsonObjectString {
        put(key = "@type", string = "clearRecentEmojiStatuses")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: ClearRecentReactions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "clearRecentReactions")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: ClearRecentStickers): String {
    return buildJsonObjectString {
        put(key = "@type", string = "clearRecentStickers")
        put(key = "@extra", long = requestId)
        put(key = "is_attached", boolean = function.isAttached)
    }
}

private fun serialize(requestId: Long, function: ClearRecentlyFoundChats): String {
    return buildJsonObjectString {
        put(key = "@type", string = "clearRecentlyFoundChats")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: ClearSearchedForTags): String {
    return buildJsonObjectString {
        put(key = "@type", string = "clearSearchedForTags")
        put(key = "@extra", long = requestId)
        put(key = "clear_cashtags", boolean = function.clearCashtags)
    }
}

private fun serialize(requestId: Long, function: ClickAnimatedEmojiMessage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "clickAnimatedEmojiMessage")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
    }
}

private fun serialize(requestId: Long, function: ClickChatSponsoredMessage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "clickChatSponsoredMessage")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "is_media_click", boolean = function.isMediaClick)
        put(key = "from_fullscreen", boolean = function.fromFullscreen)
    }
}

private fun serialize(requestId: Long, function: ClickPremiumSubscriptionButton): String {
    return buildJsonObjectString {
        put(key = "@type", string = "clickPremiumSubscriptionButton")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: ClickVideoMessageAdvertisement): String {
    return buildJsonObjectString {
        put(key = "@type", string = "clickVideoMessageAdvertisement")
        put(key = "@extra", long = requestId)
        put(key = "advertisement_unique_id", long = function.advertisementUniqueId)
    }
}

private fun serialize(requestId: Long, function: Close): String {
    return buildJsonObjectString {
        put(key = "@type", string = "close")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: CloseChat): String {
    return buildJsonObjectString {
        put(key = "@type", string = "closeChat")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: CloseGiftAuction): String {
    return buildJsonObjectString {
        put(key = "@type", string = "closeGiftAuction")
        put(key = "@extra", long = requestId)
        put(key = "gift_id", long = function.giftId)
    }
}

private fun serialize(requestId: Long, function: CloseSecretChat): String {
    return buildJsonObjectString {
        put(key = "@type", string = "closeSecretChat")
        put(key = "@extra", long = requestId)
        put(key = "secret_chat_id", int = function.secretChatId)
    }
}

private fun serialize(requestId: Long, function: CloseStory): String {
    return buildJsonObjectString {
        put(key = "@type", string = "closeStory")
        put(key = "@extra", long = requestId)
        put(key = "story_poster_chat_id", long = function.storyPosterChatId)
        put(key = "story_id", int = function.storyId)
    }
}

private fun serialize(requestId: Long, function: CloseWebApp): String {
    return buildJsonObjectString {
        put(key = "@type", string = "closeWebApp")
        put(key = "@extra", long = requestId)
        put(key = "web_app_launch_id", long = function.webAppLaunchId)
    }
}

private fun serialize(requestId: Long, function: CommitPendingLiveStoryReactions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "commitPendingLiveStoryReactions")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
    }
}

private fun serialize(requestId: Long, function: CommitPendingPaidMessageReactions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "commitPendingPaidMessageReactions")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
    }
}

private fun serialize(requestId: Long, function: ComposeRichMessageWithAi): String {
    return buildJsonObjectString {
        put(key = "@type", string = "composeRichMessageWithAi")
        put(key = "@extra", long = requestId)
        put(key = "message", value = function.message) { data -> serialize(dto = data) }
        put(key = "translate_to_language_code", string = function.translateToLanguageCode)
        put(key = "style_name", string = function.styleName)
        put(key = "custom_prompt", string = function.customPrompt)
        put(key = "add_emojis", boolean = function.addEmojis)
    }
}

private fun serialize(requestId: Long, function: ComposeTextWithAi): String {
    return buildJsonObjectString {
        put(key = "@type", string = "composeTextWithAi")
        put(key = "@extra", long = requestId)
        put(key = "text", value = function.text) { data -> serialize(dto = data) }
        put(key = "translate_to_language_code", string = function.translateToLanguageCode)
        put(key = "style_name", string = function.styleName)
        put(key = "add_emojis", boolean = function.addEmojis)
    }
}

private fun serialize(requestId: Long, function: ConfirmBusinessConnectedBot): String {
    return buildJsonObjectString {
        put(key = "@type", string = "confirmBusinessConnectedBot")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
    }
}

private fun serialize(requestId: Long, function: ConfirmQrCodeAuthentication): String {
    return buildJsonObjectString {
        put(key = "@type", string = "confirmQrCodeAuthentication")
        put(key = "@extra", long = requestId)
        put(key = "link", string = function.link)
    }
}

private fun serialize(requestId: Long, function: ConfirmSession): String {
    return buildJsonObjectString {
        put(key = "@type", string = "confirmSession")
        put(key = "@extra", long = requestId)
        put(key = "session_id", long = function.sessionId)
    }
}

private fun serialize(requestId: Long, function: ConnectAffiliateProgram): String {
    return buildJsonObjectString {
        put(key = "@type", string = "connectAffiliateProgram")
        put(key = "@extra", long = requestId)
        put(key = "affiliate", value = function.affiliate) { data -> serialize(dto = data) }
        put(key = "bot_user_id", long = function.botUserId)
    }
}

private fun serialize(requestId: Long, function: CraftGift): String {
    return buildJsonObjectString {
        put(key = "@type", string = "craftGift")
        put(key = "@extra", long = requestId)
        put(key = "received_gift_ids", strings = function.receivedGiftIds)
    }
}

private fun serialize(requestId: Long, function: CreateBasicGroupChat): String {
    return buildJsonObjectString {
        put(key = "@type", string = "createBasicGroupChat")
        put(key = "@extra", long = requestId)
        put(key = "basic_group_id", long = function.basicGroupId)
        put(key = "force", boolean = function.force)
    }
}

private fun serialize(requestId: Long, function: CreateBot): String {
    return buildJsonObjectString {
        put(key = "@type", string = "createBot")
        put(key = "@extra", long = requestId)
        put(key = "manager_bot_user_id", long = function.managerBotUserId)
        put(key = "name", string = function.name)
        put(key = "username", string = function.username)
        put(key = "via_link", boolean = function.viaLink)
    }
}

private fun serialize(requestId: Long, function: CreateBusinessChatLink): String {
    return buildJsonObjectString {
        put(key = "@type", string = "createBusinessChatLink")
        put(key = "@extra", long = requestId)
        put(key = "link_info", value = function.linkInfo) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: CreateCall): String {
    return buildJsonObjectString {
        put(key = "@type", string = "createCall")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
        put(key = "protocol", value = function.protocol) { data -> serialize(dto = data) }
        put(key = "is_video", boolean = function.isVideo)
    }
}

private fun serialize(requestId: Long, function: CreateChatFolder): String {
    return buildJsonObjectString {
        put(key = "@type", string = "createChatFolder")
        put(key = "@extra", long = requestId)
        put(key = "folder", value = function.folder) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: CreateChatFolderInviteLink): String {
    return buildJsonObjectString {
        put(key = "@type", string = "createChatFolderInviteLink")
        put(key = "@extra", long = requestId)
        put(key = "chat_folder_id", int = function.chatFolderId)
        put(key = "name", string = function.name)
        put(key = "chat_ids", longs = function.chatIds)
    }
}

private fun serialize(requestId: Long, function: CreateChatInviteLink): String {
    return buildJsonObjectString {
        put(key = "@type", string = "createChatInviteLink")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "name", string = function.name)
        put(key = "expiration_date", int = function.expirationDate)
        put(key = "member_limit", int = function.memberLimit)
        put(key = "creates_join_request", boolean = function.createsJoinRequest)
    }
}

private fun serialize(requestId: Long, function: CreateChatSubscriptionInviteLink): String {
    return buildJsonObjectString {
        put(key = "@type", string = "createChatSubscriptionInviteLink")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "name", string = function.name)
        put(key = "subscription_pricing", value = function.subscriptionPricing) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: CreateForumTopic): String {
    return buildJsonObjectString {
        put(key = "@type", string = "createForumTopic")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "name", string = function.name)
        put(key = "is_name_implicit", boolean = function.isNameImplicit)
        put(key = "icon", value = function.icon) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: CreateGiftCollection): String {
    return buildJsonObjectString {
        put(key = "@type", string = "createGiftCollection")
        put(key = "@extra", long = requestId)
        put(key = "owner_id", value = function.ownerId) { data -> serialize(dto = data) }
        put(key = "name", string = function.name)
        put(key = "received_gift_ids", strings = function.receivedGiftIds)
    }
}

private fun serialize(requestId: Long, function: CreateGroupCall): String {
    return buildJsonObjectString {
        put(key = "@type", string = "createGroupCall")
        put(key = "@extra", long = requestId)
        put(key = "join_parameters", value = function.joinParameters) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: CreateInvoiceLink): String {
    return buildJsonObjectString {
        put(key = "@type", string = "createInvoiceLink")
        put(key = "@extra", long = requestId)
        put(key = "business_connection_id", string = function.businessConnectionId)
        put(key = "invoice", value = function.invoice) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: CreateNewBasicGroupChat): String {
    return buildJsonObjectString {
        put(key = "@type", string = "createNewBasicGroupChat")
        put(key = "@extra", long = requestId)
        put(key = "user_ids", longs = function.userIds)
        put(key = "title", string = function.title)
        put(key = "message_auto_delete_time", int = function.messageAutoDeleteTime)
    }
}

private fun serialize(requestId: Long, function: CreateNewSecretChat): String {
    return buildJsonObjectString {
        put(key = "@type", string = "createNewSecretChat")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
    }
}

private fun serialize(requestId: Long, function: CreateNewStickerSet): String {
    return buildJsonObjectString {
        put(key = "@type", string = "createNewStickerSet")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
        put(key = "title", string = function.title)
        put(key = "name", string = function.name)
        put(key = "sticker_type", value = function.stickerType) { data -> serialize(dto = data) }
        put(key = "needs_repainting", boolean = function.needsRepainting)
        put(key = "stickers", objects = function.stickers) { data -> serialize(dto = data) }
        put(key = "source", string = function.source)
    }
}

private fun serialize(requestId: Long, function: CreateNewSupergroupChat): String {
    return buildJsonObjectString {
        put(key = "@type", string = "createNewSupergroupChat")
        put(key = "@extra", long = requestId)
        put(key = "title", string = function.title)
        put(key = "is_forum", boolean = function.isForum)
        put(key = "is_channel", boolean = function.isChannel)
        put(key = "description", string = function.description)
        put(key = "location", value = function.location) { data -> serialize(dto = data) }
        put(key = "message_auto_delete_time", int = function.messageAutoDeleteTime)
        put(key = "for_import", boolean = function.forImport)
    }
}

private fun serialize(requestId: Long, function: CreatePrivateChat): String {
    return buildJsonObjectString {
        put(key = "@type", string = "createPrivateChat")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
        put(key = "force", boolean = function.force)
    }
}

private fun serialize(requestId: Long, function: CreateRichMessageWithAi): String {
    return buildJsonObjectString {
        put(key = "@type", string = "createRichMessageWithAi")
        put(key = "@extra", long = requestId)
        put(key = "prompt", string = function.prompt)
        put(key = "language_code", string = function.languageCode)
        put(key = "add_emojis", boolean = function.addEmojis)
    }
}

private fun serialize(requestId: Long, function: CreateSecretChat): String {
    return buildJsonObjectString {
        put(key = "@type", string = "createSecretChat")
        put(key = "@extra", long = requestId)
        put(key = "secret_chat_id", int = function.secretChatId)
    }
}

private fun serialize(requestId: Long, function: CreateStoryAlbum): String {
    return buildJsonObjectString {
        put(key = "@type", string = "createStoryAlbum")
        put(key = "@extra", long = requestId)
        put(key = "story_poster_chat_id", long = function.storyPosterChatId)
        put(key = "name", string = function.name)
        put(key = "story_ids", ints = function.storyIds)
    }
}

private fun serialize(requestId: Long, function: CreateSupergroupChat): String {
    return buildJsonObjectString {
        put(key = "@type", string = "createSupergroupChat")
        put(key = "@extra", long = requestId)
        put(key = "supergroup_id", long = function.supergroupId)
        put(key = "force", boolean = function.force)
    }
}

private fun serialize(requestId: Long, function: CreateTemporaryPassword): String {
    return buildJsonObjectString {
        put(key = "@type", string = "createTemporaryPassword")
        put(key = "@extra", long = requestId)
        put(key = "password", string = function.password)
        put(key = "valid_for", int = function.validFor)
    }
}

private fun serialize(requestId: Long, function: CreateTextCompositionStyle): String {
    return buildJsonObjectString {
        put(key = "@type", string = "createTextCompositionStyle")
        put(key = "@extra", long = requestId)
        put(key = "title", string = function.title)
        put(key = "custom_emoji_id", long = function.customEmojiId)
        put(key = "prompt", string = function.prompt)
        put(key = "show_creator", boolean = function.showCreator)
    }
}

private fun serialize(requestId: Long, function: CreateVideoChat): String {
    return buildJsonObjectString {
        put(key = "@type", string = "createVideoChat")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "title", string = function.title)
        put(key = "start_date", int = function.startDate)
        put(key = "is_rtmp_stream", boolean = function.isRtmpStream)
    }
}

private fun serialize(requestId: Long, function: DeclineGroupCallInvitation): String {
    return buildJsonObjectString {
        put(key = "@type", string = "declineGroupCallInvitation")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
    }
}

private fun serialize(requestId: Long, function: DeclineOauthRequest): String {
    return buildJsonObjectString {
        put(key = "@type", string = "declineOauthRequest")
        put(key = "@extra", long = requestId)
        put(key = "url", string = function.url)
    }
}

private fun serialize(requestId: Long, function: DeclineSuggestedPost): String {
    return buildJsonObjectString {
        put(key = "@type", string = "declineSuggestedPost")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "comment", string = function.comment)
    }
}

private fun serialize(requestId: Long, function: DecryptGroupCallData): String {
    return buildJsonObjectString {
        put(key = "@type", string = "decryptGroupCallData")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
        put(key = "participant_id", value = function.participantId) { data -> serialize(dto = data) }
        put(key = "data_channel", value = function.dataChannel) { data -> serialize(dto = data) }
        put(key = "data", bytes = function.data)
    }
}

private fun serialize(requestId: Long, function: DeleteAccount): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteAccount")
        put(key = "@extra", long = requestId)
        put(key = "reason", string = function.reason)
        put(key = "password", string = function.password)
    }
}

private fun serialize(requestId: Long, function: DeleteAllCallMessages): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteAllCallMessages")
        put(key = "@extra", long = requestId)
        put(key = "revoke", boolean = function.revoke)
    }
}

private fun serialize(requestId: Long, function: DeleteAllRecentMessageReactionsFromSender): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteAllRecentMessageReactionsFromSender")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "sender_id", value = function.senderId) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: DeleteAllRevokedChatInviteLinks): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteAllRevokedChatInviteLinks")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "creator_user_id", long = function.creatorUserId)
    }
}

private fun serialize(requestId: Long, function: DeleteBotMediaPreviews): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteBotMediaPreviews")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "language_code", string = function.languageCode)
        put(key = "file_ids", ints = function.fileIds)
    }
}

private fun serialize(requestId: Long, function: DeleteBusinessChatLink): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteBusinessChatLink")
        put(key = "@extra", long = requestId)
        put(key = "link", string = function.link)
    }
}

private fun serialize(requestId: Long, function: DeleteBusinessConnectedBot): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteBusinessConnectedBot")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
    }
}

private fun serialize(requestId: Long, function: DeleteBusinessMessages): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteBusinessMessages")
        put(key = "@extra", long = requestId)
        put(key = "business_connection_id", string = function.businessConnectionId)
        put(key = "message_ids", longs = function.messageIds)
    }
}

private fun serialize(requestId: Long, function: DeleteBusinessStory): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteBusinessStory")
        put(key = "@extra", long = requestId)
        put(key = "business_connection_id", string = function.businessConnectionId)
        put(key = "story_id", int = function.storyId)
    }
}

private fun serialize(requestId: Long, function: DeleteChat): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteChat")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: DeleteChatBackground): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteChatBackground")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "restore_previous", boolean = function.restorePrevious)
    }
}

private fun serialize(requestId: Long, function: DeleteChatFolder): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteChatFolder")
        put(key = "@extra", long = requestId)
        put(key = "chat_folder_id", int = function.chatFolderId)
        put(key = "leave_chat_ids", longs = function.leaveChatIds)
    }
}

private fun serialize(requestId: Long, function: DeleteChatFolderInviteLink): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteChatFolderInviteLink")
        put(key = "@extra", long = requestId)
        put(key = "chat_folder_id", int = function.chatFolderId)
        put(key = "invite_link", string = function.inviteLink)
    }
}

private fun serialize(requestId: Long, function: DeleteChatHistory): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteChatHistory")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "remove_from_chat_list", boolean = function.removeFromChatList)
        put(key = "revoke", boolean = function.revoke)
    }
}

private fun serialize(requestId: Long, function: DeleteChatMessagesByDate): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteChatMessagesByDate")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "min_date", int = function.minDate)
        put(key = "max_date", int = function.maxDate)
        put(key = "revoke", boolean = function.revoke)
    }
}

private fun serialize(requestId: Long, function: DeleteChatMessagesBySender): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteChatMessagesBySender")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "sender_id", value = function.senderId) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: DeleteChatReplyMarkup): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteChatReplyMarkup")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
    }
}

private fun serialize(requestId: Long, function: DeleteCommands): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteCommands")
        put(key = "@extra", long = requestId)
        put(key = "scope", value = function.scope) { data -> serialize(dto = data) }
        put(key = "language_code", string = function.languageCode)
    }
}

private fun serialize(requestId: Long, function: DeleteDefaultBackground): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteDefaultBackground")
        put(key = "@extra", long = requestId)
        put(key = "for_dark_theme", boolean = function.forDarkTheme)
    }
}

private fun serialize(requestId: Long, function: DeleteDirectMessagesChatTopicHistory): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteDirectMessagesChatTopicHistory")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "topic_id", long = function.topicId)
    }
}

private fun serialize(requestId: Long, function: DeleteDirectMessagesChatTopicMessagesByDate): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteDirectMessagesChatTopicMessagesByDate")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "topic_id", long = function.topicId)
        put(key = "min_date", int = function.minDate)
        put(key = "max_date", int = function.maxDate)
    }
}

private fun serialize(requestId: Long, function: DeleteEphemeralMessage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteEphemeralMessage")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "receiver_user_id", long = function.receiverUserId)
        put(key = "ephemeral_message_id", int = function.ephemeralMessageId)
    }
}

private fun serialize(requestId: Long, function: DeleteFile): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteFile")
        put(key = "@extra", long = requestId)
        put(key = "file_id", int = function.fileId)
    }
}

private fun serialize(requestId: Long, function: DeleteForumTopic): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteForumTopic")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "forum_topic_id", int = function.forumTopicId)
    }
}

private fun serialize(requestId: Long, function: DeleteGiftCollection): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteGiftCollection")
        put(key = "@extra", long = requestId)
        put(key = "owner_id", value = function.ownerId) { data -> serialize(dto = data) }
        put(key = "collection_id", int = function.collectionId)
    }
}

private fun serialize(requestId: Long, function: DeleteGroupCallMessages): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteGroupCallMessages")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
        put(key = "message_ids", ints = function.messageIds)
        put(key = "report_spam", boolean = function.reportSpam)
    }
}

private fun serialize(requestId: Long, function: DeleteGroupCallMessagesBySender): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteGroupCallMessagesBySender")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
        put(key = "sender_id", value = function.senderId) { data -> serialize(dto = data) }
        put(key = "report_spam", boolean = function.reportSpam)
    }
}

private fun serialize(requestId: Long, function: DeleteLanguagePack): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteLanguagePack")
        put(key = "@extra", long = requestId)
        put(key = "language_pack_id", string = function.languagePackId)
    }
}

private fun serialize(requestId: Long, function: DeleteMessageReactionsFromSender): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteMessageReactionsFromSender")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "sender_id", value = function.senderId) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: DeleteMessages): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteMessages")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_ids", longs = function.messageIds)
        put(key = "revoke", boolean = function.revoke)
    }
}

private fun serialize(requestId: Long, function: DeletePassportElement): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deletePassportElement")
        put(key = "@extra", long = requestId)
        put(key = "type", value = function.type) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: DeletePollOption): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deletePollOption")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "option_id", string = function.optionId)
    }
}

private fun serialize(requestId: Long, function: DeleteProfilePhoto): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteProfilePhoto")
        put(key = "@extra", long = requestId)
        put(key = "profile_photo_id", long = function.profilePhotoId)
    }
}

private fun serialize(requestId: Long, function: DeleteQuickReplyShortcut): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteQuickReplyShortcut")
        put(key = "@extra", long = requestId)
        put(key = "shortcut_id", int = function.shortcutId)
    }
}

private fun serialize(requestId: Long, function: DeleteQuickReplyShortcutMessages): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteQuickReplyShortcutMessages")
        put(key = "@extra", long = requestId)
        put(key = "shortcut_id", int = function.shortcutId)
        put(key = "message_ids", longs = function.messageIds)
    }
}

private fun serialize(requestId: Long, function: DeleteRevokedChatInviteLink): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteRevokedChatInviteLink")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "invite_link", string = function.inviteLink)
    }
}

private fun serialize(requestId: Long, function: DeleteSavedCredentials): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteSavedCredentials")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: DeleteSavedMessagesTopicHistory): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteSavedMessagesTopicHistory")
        put(key = "@extra", long = requestId)
        put(key = "saved_messages_topic_id", long = function.savedMessagesTopicId)
    }
}

private fun serialize(requestId: Long, function: DeleteSavedMessagesTopicMessagesByDate): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteSavedMessagesTopicMessagesByDate")
        put(key = "@extra", long = requestId)
        put(key = "saved_messages_topic_id", long = function.savedMessagesTopicId)
        put(key = "min_date", int = function.minDate)
        put(key = "max_date", int = function.maxDate)
    }
}

private fun serialize(requestId: Long, function: DeleteSavedOrderInfo): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteSavedOrderInfo")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: DeleteStickerSet): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteStickerSet")
        put(key = "@extra", long = requestId)
        put(key = "name", string = function.name)
    }
}

private fun serialize(requestId: Long, function: DeleteStory): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteStory")
        put(key = "@extra", long = requestId)
        put(key = "story_poster_chat_id", long = function.storyPosterChatId)
        put(key = "story_id", int = function.storyId)
    }
}

private fun serialize(requestId: Long, function: DeleteStoryAlbum): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteStoryAlbum")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "story_album_id", int = function.storyAlbumId)
    }
}

private fun serialize(requestId: Long, function: DeleteTextCompositionStyle): String {
    return buildJsonObjectString {
        put(key = "@type", string = "deleteTextCompositionStyle")
        put(key = "@extra", long = requestId)
        put(key = "name", string = function.name)
    }
}

private fun serialize(requestId: Long, function: Destroy): String {
    return buildJsonObjectString {
        put(key = "@type", string = "destroy")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: DisableAllSupergroupUsernames): String {
    return buildJsonObjectString {
        put(key = "@type", string = "disableAllSupergroupUsernames")
        put(key = "@extra", long = requestId)
        put(key = "supergroup_id", long = function.supergroupId)
    }
}

private fun serialize(requestId: Long, function: DisableProxy): String {
    return buildJsonObjectString {
        put(key = "@type", string = "disableProxy")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: DiscardCall): String {
    return buildJsonObjectString {
        put(key = "@type", string = "discardCall")
        put(key = "@extra", long = requestId)
        put(key = "call_id", int = function.callId)
        put(key = "is_disconnected", boolean = function.isDisconnected)
        put(key = "invite_link", string = function.inviteLink)
        put(key = "duration", int = function.duration)
        put(key = "is_video", boolean = function.isVideo)
        put(key = "connection_id", long = function.connectionId)
    }
}

private fun serialize(requestId: Long, function: DisconnectAffiliateProgram): String {
    return buildJsonObjectString {
        put(key = "@type", string = "disconnectAffiliateProgram")
        put(key = "@extra", long = requestId)
        put(key = "affiliate", value = function.affiliate) { data -> serialize(dto = data) }
        put(key = "url", string = function.url)
    }
}

private fun serialize(requestId: Long, function: DisconnectAllWebsites): String {
    return buildJsonObjectString {
        put(key = "@type", string = "disconnectAllWebsites")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: DisconnectWebsite): String {
    return buildJsonObjectString {
        put(key = "@type", string = "disconnectWebsite")
        put(key = "@extra", long = requestId)
        put(key = "website_id", long = function.websiteId)
    }
}

private fun serialize(requestId: Long, function: DownloadFile): String {
    return buildJsonObjectString {
        put(key = "@type", string = "downloadFile")
        put(key = "@extra", long = requestId)
        put(key = "file_id", int = function.fileId)
        put(key = "priority", int = function.priority)
        put(key = "offset", long = function.offset)
        put(key = "limit", long = function.limit)
        put(key = "synchronous", boolean = function.synchronous)
    }
}

private fun serialize(requestId: Long, function: DropGiftOriginalDetails): String {
    return buildJsonObjectString {
        put(key = "@type", string = "dropGiftOriginalDetails")
        put(key = "@extra", long = requestId)
        put(key = "received_gift_id", string = function.receivedGiftId)
        put(key = "star_count", long = function.starCount)
    }
}

private fun serialize(requestId: Long, function: EditBotMediaPreview): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editBotMediaPreview")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "language_code", string = function.languageCode)
        put(key = "file_id", int = function.fileId)
        put(key = "content", value = function.content) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: EditBusinessChatLink): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editBusinessChatLink")
        put(key = "@extra", long = requestId)
        put(key = "link", string = function.link)
        put(key = "link_info", value = function.linkInfo) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: EditBusinessMessageCaption): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editBusinessMessageCaption")
        put(key = "@extra", long = requestId)
        put(key = "business_connection_id", string = function.businessConnectionId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "reply_markup", value = function.replyMarkup) { data -> serialize(dto = data) }
        put(key = "caption", value = function.caption) { data -> serialize(dto = data) }
        put(key = "show_caption_above_media", boolean = function.showCaptionAboveMedia)
    }
}

private fun serialize(requestId: Long, function: EditBusinessMessageChecklist): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editBusinessMessageChecklist")
        put(key = "@extra", long = requestId)
        put(key = "business_connection_id", string = function.businessConnectionId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "reply_markup", value = function.replyMarkup) { data -> serialize(dto = data) }
        put(key = "checklist", value = function.checklist) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: EditBusinessMessageLiveLocation): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editBusinessMessageLiveLocation")
        put(key = "@extra", long = requestId)
        put(key = "business_connection_id", string = function.businessConnectionId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "reply_markup", value = function.replyMarkup) { data -> serialize(dto = data) }
        put(key = "location", value = function.location) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: EditBusinessMessageMedia): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editBusinessMessageMedia")
        put(key = "@extra", long = requestId)
        put(key = "business_connection_id", string = function.businessConnectionId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "reply_markup", value = function.replyMarkup) { data -> serialize(dto = data) }
        put(key = "input_message_content", value = function.inputMessageContent) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: EditBusinessMessageReplyMarkup): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editBusinessMessageReplyMarkup")
        put(key = "@extra", long = requestId)
        put(key = "business_connection_id", string = function.businessConnectionId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "reply_markup", value = function.replyMarkup) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: EditBusinessMessageText): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editBusinessMessageText")
        put(key = "@extra", long = requestId)
        put(key = "business_connection_id", string = function.businessConnectionId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "reply_markup", value = function.replyMarkup) { data -> serialize(dto = data) }
        put(key = "input_message_content", value = function.inputMessageContent) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: EditBusinessStory): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editBusinessStory")
        put(key = "@extra", long = requestId)
        put(key = "story_poster_chat_id", long = function.storyPosterChatId)
        put(key = "story_id", int = function.storyId)
        put(key = "content", value = function.content) { data -> serialize(dto = data) }
        put(key = "areas", value = function.areas) { data -> serialize(dto = data) }
        put(key = "caption", value = function.caption) { data -> serialize(dto = data) }
        put(key = "privacy_settings", value = function.privacySettings) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: EditChatFolder): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editChatFolder")
        put(key = "@extra", long = requestId)
        put(key = "chat_folder_id", int = function.chatFolderId)
        put(key = "folder", value = function.folder) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: EditChatFolderInviteLink): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editChatFolderInviteLink")
        put(key = "@extra", long = requestId)
        put(key = "chat_folder_id", int = function.chatFolderId)
        put(key = "invite_link", string = function.inviteLink)
        put(key = "name", string = function.name)
        put(key = "chat_ids", longs = function.chatIds)
    }
}

private fun serialize(requestId: Long, function: EditChatInviteLink): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editChatInviteLink")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "invite_link", string = function.inviteLink)
        put(key = "name", string = function.name)
        put(key = "expiration_date", int = function.expirationDate)
        put(key = "member_limit", int = function.memberLimit)
        put(key = "creates_join_request", boolean = function.createsJoinRequest)
    }
}

private fun serialize(requestId: Long, function: EditChatSubscriptionInviteLink): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editChatSubscriptionInviteLink")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "invite_link", string = function.inviteLink)
        put(key = "name", string = function.name)
    }
}

private fun serialize(requestId: Long, function: EditCustomLanguagePackInfo): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editCustomLanguagePackInfo")
        put(key = "@extra", long = requestId)
        put(key = "info", value = function.info) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: EditEphemeralMessage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editEphemeralMessage")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "receiver_user_id", long = function.receiverUserId)
        put(key = "ephemeral_message_id", int = function.ephemeralMessageId)
        put(key = "reply_markup", value = function.replyMarkup) { data -> serialize(dto = data) }
        put(key = "input_message_content", value = function.inputMessageContent) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: EditForumTopic): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editForumTopic")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "forum_topic_id", int = function.forumTopicId)
        put(key = "name", string = function.name)
        put(key = "edit_icon_custom_emoji", boolean = function.editIconCustomEmoji)
        put(key = "icon_custom_emoji_id", long = function.iconCustomEmojiId)
    }
}

private fun serialize(requestId: Long, function: EditInlineMessageCaption): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editInlineMessageCaption")
        put(key = "@extra", long = requestId)
        put(key = "inline_message_id", string = function.inlineMessageId)
        put(key = "reply_markup", value = function.replyMarkup) { data -> serialize(dto = data) }
        put(key = "caption", value = function.caption) { data -> serialize(dto = data) }
        put(key = "show_caption_above_media", boolean = function.showCaptionAboveMedia)
    }
}

private fun serialize(requestId: Long, function: EditInlineMessageLiveLocation): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editInlineMessageLiveLocation")
        put(key = "@extra", long = requestId)
        put(key = "inline_message_id", string = function.inlineMessageId)
        put(key = "reply_markup", value = function.replyMarkup) { data -> serialize(dto = data) }
        put(key = "location", value = function.location) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: EditInlineMessageMedia): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editInlineMessageMedia")
        put(key = "@extra", long = requestId)
        put(key = "inline_message_id", string = function.inlineMessageId)
        put(key = "reply_markup", value = function.replyMarkup) { data -> serialize(dto = data) }
        put(key = "input_message_content", value = function.inputMessageContent) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: EditInlineMessageReplyMarkup): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editInlineMessageReplyMarkup")
        put(key = "@extra", long = requestId)
        put(key = "inline_message_id", string = function.inlineMessageId)
        put(key = "reply_markup", value = function.replyMarkup) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: EditInlineMessageText): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editInlineMessageText")
        put(key = "@extra", long = requestId)
        put(key = "inline_message_id", string = function.inlineMessageId)
        put(key = "reply_markup", value = function.replyMarkup) { data -> serialize(dto = data) }
        put(key = "input_message_content", value = function.inputMessageContent) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: EditMessageCaption): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editMessageCaption")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "reply_markup", value = function.replyMarkup) { data -> serialize(dto = data) }
        put(key = "caption", value = function.caption) { data -> serialize(dto = data) }
        put(key = "show_caption_above_media", boolean = function.showCaptionAboveMedia)
    }
}

private fun serialize(requestId: Long, function: EditMessageChecklist): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editMessageChecklist")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "reply_markup", value = function.replyMarkup) { data -> serialize(dto = data) }
        put(key = "checklist", value = function.checklist) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: EditMessageLiveLocation): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editMessageLiveLocation")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "reply_markup", value = function.replyMarkup) { data -> serialize(dto = data) }
        put(key = "location", value = function.location) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: EditMessageMedia): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editMessageMedia")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "reply_markup", value = function.replyMarkup) { data -> serialize(dto = data) }
        put(key = "input_message_content", value = function.inputMessageContent) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: EditMessageReplyMarkup): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editMessageReplyMarkup")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "reply_markup", value = function.replyMarkup) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: EditMessageSchedulingState): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editMessageSchedulingState")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "scheduling_state", value = function.schedulingState) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: EditMessageText): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editMessageText")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "reply_markup", value = function.replyMarkup) { data -> serialize(dto = data) }
        put(key = "input_message_content", value = function.inputMessageContent) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: EditProxy): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editProxy")
        put(key = "@extra", long = requestId)
        put(key = "proxy_id", int = function.proxyId)
        put(key = "proxy", value = function.proxy) { data -> serialize(dto = data) }
        put(key = "enable", boolean = function.enable)
        put(key = "comment", string = function.comment)
    }
}

private fun serialize(requestId: Long, function: EditQuickReplyMessage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editQuickReplyMessage")
        put(key = "@extra", long = requestId)
        put(key = "shortcut_id", int = function.shortcutId)
        put(key = "message_id", long = function.messageId)
        put(key = "input_message_content", value = function.inputMessageContent) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: EditStarSubscription): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editStarSubscription")
        put(key = "@extra", long = requestId)
        put(key = "subscription_id", string = function.subscriptionId)
        put(key = "is_canceled", boolean = function.isCanceled)
    }
}

private fun serialize(requestId: Long, function: EditStory): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editStory")
        put(key = "@extra", long = requestId)
        put(key = "story_poster_chat_id", long = function.storyPosterChatId)
        put(key = "story_id", int = function.storyId)
        put(key = "content", value = function.content) { data -> serialize(dto = data) }
        put(key = "areas", value = function.areas) { data -> serialize(dto = data) }
        put(key = "caption", value = function.caption) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: EditStoryCover): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editStoryCover")
        put(key = "@extra", long = requestId)
        put(key = "story_poster_chat_id", long = function.storyPosterChatId)
        put(key = "story_id", int = function.storyId)
        put(key = "cover_frame_timestamp", double = function.coverFrameTimestamp)
    }
}

private fun serialize(requestId: Long, function: EditTextCompositionStyle): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editTextCompositionStyle")
        put(key = "@extra", long = requestId)
        put(key = "name", string = function.name)
        put(key = "title", string = function.title)
        put(key = "custom_emoji_id", long = function.customEmojiId)
        put(key = "prompt", string = function.prompt)
        put(key = "show_creator", boolean = function.showCreator)
    }
}

private fun serialize(requestId: Long, function: EditUserStarSubscription): String {
    return buildJsonObjectString {
        put(key = "@type", string = "editUserStarSubscription")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
        put(key = "telegram_payment_charge_id", string = function.telegramPaymentChargeId)
        put(key = "is_canceled", boolean = function.isCanceled)
    }
}

private fun serialize(requestId: Long, function: EnableProxy): String {
    return buildJsonObjectString {
        put(key = "@type", string = "enableProxy")
        put(key = "@extra", long = requestId)
        put(key = "proxy_id", int = function.proxyId)
    }
}

private fun serialize(requestId: Long, function: EncryptGroupCallData): String {
    return buildJsonObjectString {
        put(key = "@type", string = "encryptGroupCallData")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
        put(key = "data_channel", value = function.dataChannel) { data -> serialize(dto = data) }
        put(key = "data", bytes = function.data)
        put(key = "unencrypted_prefix_size", int = function.unencryptedPrefixSize)
    }
}

private fun serialize(requestId: Long, function: EndGroupCall): String {
    return buildJsonObjectString {
        put(key = "@type", string = "endGroupCall")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
    }
}

private fun serialize(requestId: Long, function: EndGroupCallRecording): String {
    return buildJsonObjectString {
        put(key = "@type", string = "endGroupCallRecording")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
    }
}

private fun serialize(requestId: Long, function: EndGroupCallScreenSharing): String {
    return buildJsonObjectString {
        put(key = "@type", string = "endGroupCallScreenSharing")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
    }
}

private fun serialize(requestId: Long, function: FinishFileGeneration): String {
    return buildJsonObjectString {
        put(key = "@type", string = "finishFileGeneration")
        put(key = "@extra", long = requestId)
        put(key = "generation_id", long = function.generationId)
        put(key = "error", value = function.error) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: FixRichMessageWithAi): String {
    return buildJsonObjectString {
        put(key = "@type", string = "fixRichMessageWithAi")
        put(key = "@extra", long = requestId)
        put(key = "message", value = function.message) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: FixTextWithAi): String {
    return buildJsonObjectString {
        put(key = "@type", string = "fixTextWithAi")
        put(key = "@extra", long = requestId)
        put(key = "text", value = function.text) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: ForwardMessages): String {
    return buildJsonObjectString {
        put(key = "@type", string = "forwardMessages")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "topic_id", value = function.topicId) { data -> serialize(dto = data) }
        put(key = "from_chat_id", long = function.fromChatId)
        put(key = "message_ids", longs = function.messageIds)
        put(key = "options", value = function.options) { data -> serialize(dto = data) }
        put(key = "send_copy", boolean = function.sendCopy)
        put(key = "remove_caption", boolean = function.removeCaption)
    }
}

private fun serialize(requestId: Long, function: GetAccountTtl): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getAccountTtl")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetActiveSessions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getActiveSessions")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetAllPassportElements): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getAllPassportElements")
        put(key = "@extra", long = requestId)
        put(key = "password", string = function.password)
    }
}

private fun serialize(requestId: Long, function: GetAllStickerEmojis): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getAllStickerEmojis")
        put(key = "@extra", long = requestId)
        put(key = "sticker_type", value = function.stickerType) { data -> serialize(dto = data) }
        put(key = "query", string = function.query)
        put(key = "chat_id", long = function.chatId)
        put(key = "return_only_main_emoji", boolean = function.returnOnlyMainEmoji)
    }
}

private fun serialize(requestId: Long, function: GetAnimatedEmoji): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getAnimatedEmoji")
        put(key = "@extra", long = requestId)
        put(key = "emoji", string = function.emoji)
    }
}

private fun serialize(requestId: Long, function: GetApplicationConfig): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getApplicationConfig")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetApplicationDownloadLink): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getApplicationDownloadLink")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetArchiveChatListSettings): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getArchiveChatListSettings")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetArchivedStickerSets): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getArchivedStickerSets")
        put(key = "@extra", long = requestId)
        put(key = "sticker_type", value = function.stickerType) { data -> serialize(dto = data) }
        put(key = "offset_sticker_set_id", long = function.offsetStickerSetId)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetAttachedStickerSets): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getAttachedStickerSets")
        put(key = "@extra", long = requestId)
        put(key = "file_id", int = function.fileId)
    }
}

private fun serialize(requestId: Long, function: GetAttachmentMenuBot): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getAttachmentMenuBot")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
    }
}

private fun serialize(requestId: Long, function: GetAuthenticationPasskeyParameters): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getAuthenticationPasskeyParameters")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetAuthorizationState): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getAuthorizationState")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetAutoDownloadSettingsPresets): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getAutoDownloadSettingsPresets")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetAutosaveSettings): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getAutosaveSettings")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetAvailableChatBoostSlots): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getAvailableChatBoostSlots")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetAvailableGifts): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getAvailableGifts")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetBackgroundUrl): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getBackgroundUrl")
        put(key = "@extra", long = requestId)
        put(key = "name", string = function.name)
        put(key = "type", value = function.type) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: GetBankCardInfo): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getBankCardInfo")
        put(key = "@extra", long = requestId)
        put(key = "bank_card_number", string = function.bankCardNumber)
    }
}

private fun serialize(requestId: Long, function: GetBasicGroup): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getBasicGroup")
        put(key = "@extra", long = requestId)
        put(key = "basic_group_id", long = function.basicGroupId)
    }
}

private fun serialize(requestId: Long, function: GetBasicGroupFullInfo): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getBasicGroupFullInfo")
        put(key = "@extra", long = requestId)
        put(key = "basic_group_id", long = function.basicGroupId)
    }
}

private fun serialize(requestId: Long, function: GetBlockedMessageSenders): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getBlockedMessageSenders")
        put(key = "@extra", long = requestId)
        put(key = "block_list", value = function.blockList) { data -> serialize(dto = data) }
        put(key = "offset", int = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetBotInfoDescription): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getBotInfoDescription")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "language_code", string = function.languageCode)
    }
}

private fun serialize(requestId: Long, function: GetBotInfoShortDescription): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getBotInfoShortDescription")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "language_code", string = function.languageCode)
    }
}

private fun serialize(requestId: Long, function: GetBotMediaPreviewInfo): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getBotMediaPreviewInfo")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "language_code", string = function.languageCode)
    }
}

private fun serialize(requestId: Long, function: GetBotMediaPreviews): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getBotMediaPreviews")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
    }
}

private fun serialize(requestId: Long, function: GetBotName): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getBotName")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "language_code", string = function.languageCode)
    }
}

private fun serialize(requestId: Long, function: GetBotSimilarBotCount): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getBotSimilarBotCount")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "return_local", boolean = function.returnLocal)
    }
}

private fun serialize(requestId: Long, function: GetBotSimilarBots): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getBotSimilarBots")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
    }
}

private fun serialize(requestId: Long, function: GetBusinessAccountStarAmount): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getBusinessAccountStarAmount")
        put(key = "@extra", long = requestId)
        put(key = "business_connection_id", string = function.businessConnectionId)
    }
}

private fun serialize(requestId: Long, function: GetBusinessChatLinkInfo): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getBusinessChatLinkInfo")
        put(key = "@extra", long = requestId)
        put(key = "link_name", string = function.linkName)
    }
}

private fun serialize(requestId: Long, function: GetBusinessChatLinks): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getBusinessChatLinks")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetBusinessConnectedBot): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getBusinessConnectedBot")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetBusinessConnection): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getBusinessConnection")
        put(key = "@extra", long = requestId)
        put(key = "connection_id", string = function.connectionId)
    }
}

private fun serialize(requestId: Long, function: GetBusinessFeatures): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getBusinessFeatures")
        put(key = "@extra", long = requestId)
        put(key = "source", value = function.source) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: GetCallbackQueryAnswer): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getCallbackQueryAnswer")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "payload", value = function.payload) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: GetCallbackQueryMessage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getCallbackQueryMessage")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "callback_query_id", long = function.callbackQueryId)
    }
}

private fun serialize(requestId: Long, function: GetChat): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChat")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: GetChatActiveStories): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatActiveStories")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: GetChatAdministrators): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatAdministrators")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: GetChatArchivedStories): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatArchivedStories")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "from_story_id", int = function.fromStoryId)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetChatAvailableMessageSenders): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatAvailableMessageSenders")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: GetChatAvailablePaidMessageReactionSenders): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatAvailablePaidMessageReactionSenders")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: GetChatBoostFeatures): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatBoostFeatures")
        put(key = "@extra", long = requestId)
        put(key = "is_channel", boolean = function.isChannel)
    }
}

private fun serialize(requestId: Long, function: GetChatBoostLevelFeatures): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatBoostLevelFeatures")
        put(key = "@extra", long = requestId)
        put(key = "is_channel", boolean = function.isChannel)
        put(key = "level", int = function.level)
    }
}

private fun serialize(requestId: Long, function: GetChatBoostLink): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatBoostLink")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: GetChatBoostLinkInfo): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatBoostLinkInfo")
        put(key = "@extra", long = requestId)
        put(key = "url", string = function.url)
    }
}

private fun serialize(requestId: Long, function: GetChatBoostStatus): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatBoostStatus")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: GetChatBoosts): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatBoosts")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "only_gift_codes", boolean = function.onlyGiftCodes)
        put(key = "offset", string = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetChatEventLog): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatEventLog")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "query", string = function.query)
        put(key = "from_event_id", long = function.fromEventId)
        put(key = "limit", int = function.limit)
        put(key = "filters", value = function.filters) { data -> serialize(dto = data) }
        put(key = "user_ids", longs = function.userIds)
    }
}

private fun serialize(requestId: Long, function: GetChatFolder): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatFolder")
        put(key = "@extra", long = requestId)
        put(key = "chat_folder_id", int = function.chatFolderId)
    }
}

private fun serialize(requestId: Long, function: GetChatFolderChatCount): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatFolderChatCount")
        put(key = "@extra", long = requestId)
        put(key = "folder", value = function.folder) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: GetChatFolderChatsToLeave): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatFolderChatsToLeave")
        put(key = "@extra", long = requestId)
        put(key = "chat_folder_id", int = function.chatFolderId)
    }
}

private fun serialize(requestId: Long, function: GetChatFolderDefaultIconName): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatFolderDefaultIconName")
        put(key = "@extra", long = requestId)
        put(key = "folder", value = function.folder) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: GetChatFolderInviteLinks): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatFolderInviteLinks")
        put(key = "@extra", long = requestId)
        put(key = "chat_folder_id", int = function.chatFolderId)
    }
}

private fun serialize(requestId: Long, function: GetChatFolderNewChats): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatFolderNewChats")
        put(key = "@extra", long = requestId)
        put(key = "chat_folder_id", int = function.chatFolderId)
    }
}

private fun serialize(requestId: Long, function: GetChatHistory): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatHistory")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "from_message_id", long = function.fromMessageId)
        put(key = "offset", int = function.offset)
        put(key = "limit", int = function.limit)
        put(key = "only_local", boolean = function.onlyLocal)
    }
}

private fun serialize(requestId: Long, function: GetChatInviteLink): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatInviteLink")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "invite_link", string = function.inviteLink)
    }
}

private fun serialize(requestId: Long, function: GetChatInviteLinkCounts): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatInviteLinkCounts")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: GetChatInviteLinkMembers): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatInviteLinkMembers")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "invite_link", string = function.inviteLink)
        put(key = "only_with_expired_subscription", boolean = function.onlyWithExpiredSubscription)
        put(key = "offset_member", value = function.offsetMember) { data -> serialize(dto = data) }
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetChatInviteLinks): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatInviteLinks")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "creator_user_id", long = function.creatorUserId)
        put(key = "is_revoked", boolean = function.isRevoked)
        put(key = "offset_date", int = function.offsetDate)
        put(key = "offset_invite_link", string = function.offsetInviteLink)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetChatJoinRequests): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatJoinRequests")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "invite_link", string = function.inviteLink)
        put(key = "query", string = function.query)
        put(key = "offset_request", value = function.offsetRequest) { data -> serialize(dto = data) }
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetChatListsToAddChat): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatListsToAddChat")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: GetChatMember): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatMember")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "member_id", value = function.memberId) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: GetChatMessageByDate): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatMessageByDate")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "date", int = function.date)
    }
}

private fun serialize(requestId: Long, function: GetChatMessageCalendar): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatMessageCalendar")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "topic_id", value = function.topicId) { data -> serialize(dto = data) }
        put(key = "filter", value = function.filter) { data -> serialize(dto = data) }
        put(key = "from_message_id", long = function.fromMessageId)
    }
}

private fun serialize(requestId: Long, function: GetChatMessageCount): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatMessageCount")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "topic_id", value = function.topicId) { data -> serialize(dto = data) }
        put(key = "filter", value = function.filter) { data -> serialize(dto = data) }
        put(key = "return_local", boolean = function.returnLocal)
    }
}

private fun serialize(requestId: Long, function: GetChatMessagePosition): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatMessagePosition")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "topic_id", value = function.topicId) { data -> serialize(dto = data) }
        put(key = "filter", value = function.filter) { data -> serialize(dto = data) }
        put(key = "message_id", long = function.messageId)
    }
}

private fun serialize(requestId: Long, function: GetChatNotificationSettingsExceptions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatNotificationSettingsExceptions")
        put(key = "@extra", long = requestId)
        put(key = "scope", value = function.scope) { data -> serialize(dto = data) }
        put(key = "compare_sound", boolean = function.compareSound)
    }
}

private fun serialize(requestId: Long, function: GetChatOwnerAfterLeaving): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatOwnerAfterLeaving")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: GetChatPinnedMessage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatPinnedMessage")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: GetChatPostedToChatPageStories): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatPostedToChatPageStories")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "from_story_id", int = function.fromStoryId)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetChatRevenueStatistics): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatRevenueStatistics")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "is_dark", boolean = function.isDark)
    }
}

private fun serialize(requestId: Long, function: GetChatRevenueTransactions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatRevenueTransactions")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "offset", string = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetChatRevenueWithdrawalUrl): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatRevenueWithdrawalUrl")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "password", string = function.password)
    }
}

private fun serialize(requestId: Long, function: GetChatScheduledMessages): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatScheduledMessages")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: GetChatSimilarChatCount): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatSimilarChatCount")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "return_local", boolean = function.returnLocal)
    }
}

private fun serialize(requestId: Long, function: GetChatSimilarChats): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatSimilarChats")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: GetChatSparseMessagePositions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatSparseMessagePositions")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "filter", value = function.filter) { data -> serialize(dto = data) }
        put(key = "from_message_id", long = function.fromMessageId)
        put(key = "limit", int = function.limit)
        put(key = "saved_messages_topic_id", long = function.savedMessagesTopicId)
    }
}

private fun serialize(requestId: Long, function: GetChatSponsoredMessages): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatSponsoredMessages")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: GetChatStatistics): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatStatistics")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "is_dark", boolean = function.isDark)
    }
}

private fun serialize(requestId: Long, function: GetChatStoryAlbums): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatStoryAlbums")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: GetChatStoryInteractions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatStoryInteractions")
        put(key = "@extra", long = requestId)
        put(key = "story_poster_chat_id", long = function.storyPosterChatId)
        put(key = "story_id", int = function.storyId)
        put(key = "reaction_type", value = function.reactionType) { data -> serialize(dto = data) }
        put(key = "prefer_forwards", boolean = function.preferForwards)
        put(key = "offset", string = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetChats): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChats")
        put(key = "@extra", long = requestId)
        put(key = "chat_list", value = function.chatList) { data -> serialize(dto = data) }
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetChatsForChatFolderInviteLink): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatsForChatFolderInviteLink")
        put(key = "@extra", long = requestId)
        put(key = "chat_folder_id", int = function.chatFolderId)
    }
}

private fun serialize(requestId: Long, function: GetChatsToPostStories): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getChatsToPostStories")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetCloseFriends): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getCloseFriends")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetCollectibleItemInfo): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getCollectibleItemInfo")
        put(key = "@extra", long = requestId)
        put(key = "type", value = function.type) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: GetCommands): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getCommands")
        put(key = "@extra", long = requestId)
        put(key = "scope", value = function.scope) { data -> serialize(dto = data) }
        put(key = "language_code", string = function.languageCode)
    }
}

private fun serialize(requestId: Long, function: GetConnectedAffiliateProgram): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getConnectedAffiliateProgram")
        put(key = "@extra", long = requestId)
        put(key = "affiliate", value = function.affiliate) { data -> serialize(dto = data) }
        put(key = "bot_user_id", long = function.botUserId)
    }
}

private fun serialize(requestId: Long, function: GetConnectedAffiliatePrograms): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getConnectedAffiliatePrograms")
        put(key = "@extra", long = requestId)
        put(key = "affiliate", value = function.affiliate) { data -> serialize(dto = data) }
        put(key = "offset", string = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetConnectedWebsites): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getConnectedWebsites")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetContacts): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getContacts")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetCountries): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getCountries")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetCountry): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getCountry")
        put(key = "@extra", long = requestId)
        put(key = "country_code", string = function.countryCode)
    }
}

private fun serialize(requestId: Long, function: GetCountryCode): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getCountryCode")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetCountryFlagEmoji): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getCountryFlagEmoji")
        put(key = "@extra", long = requestId)
        put(key = "country_code", string = function.countryCode)
    }
}

private fun serialize(requestId: Long, function: GetCreatedPublicChats): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getCreatedPublicChats")
        put(key = "@extra", long = requestId)
        put(key = "type", value = function.type) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: GetCurrentState): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getCurrentState")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetCurrentWeather): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getCurrentWeather")
        put(key = "@extra", long = requestId)
        put(key = "location", value = function.location) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: GetCustomEmojiReactionAnimations): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getCustomEmojiReactionAnimations")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetCustomEmojiStickers): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getCustomEmojiStickers")
        put(key = "@extra", long = requestId)
        put(key = "custom_emoji_ids", longs = function.customEmojiIds)
    }
}

private fun serialize(requestId: Long, function: GetDatabaseStatistics): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getDatabaseStatistics")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetDeepLinkInfo): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getDeepLinkInfo")
        put(key = "@extra", long = requestId)
        put(key = "link", string = function.link)
    }
}

private fun serialize(requestId: Long, function: GetDefaultBackgroundCustomEmojiStickers): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getDefaultBackgroundCustomEmojiStickers")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetDefaultChatEmojiStatuses): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getDefaultChatEmojiStatuses")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetDefaultChatPhotoCustomEmojiStickers): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getDefaultChatPhotoCustomEmojiStickers")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetDefaultEmojiStatuses): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getDefaultEmojiStatuses")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetDefaultMessageAutoDeleteTime): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getDefaultMessageAutoDeleteTime")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetDefaultProfilePhotoCustomEmojiStickers): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getDefaultProfilePhotoCustomEmojiStickers")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetDirectMessagesChatTopic): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getDirectMessagesChatTopic")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "topic_id", long = function.topicId)
    }
}

private fun serialize(requestId: Long, function: GetDirectMessagesChatTopicHistory): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getDirectMessagesChatTopicHistory")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "topic_id", long = function.topicId)
        put(key = "from_message_id", long = function.fromMessageId)
        put(key = "offset", int = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetDirectMessagesChatTopicMessageByDate): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getDirectMessagesChatTopicMessageByDate")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "topic_id", long = function.topicId)
        put(key = "date", int = function.date)
    }
}

private fun serialize(requestId: Long, function: GetDirectMessagesChatTopicRevenue): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getDirectMessagesChatTopicRevenue")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "topic_id", long = function.topicId)
    }
}

private fun serialize(requestId: Long, function: GetDisallowedChatEmojiStatuses): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getDisallowedChatEmojiStatuses")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetEmojiCategories): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getEmojiCategories")
        put(key = "@extra", long = requestId)
        put(key = "type", value = function.type) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: GetEmojiReaction): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getEmojiReaction")
        put(key = "@extra", long = requestId)
        put(key = "emoji", string = function.emoji)
    }
}

private fun serialize(requestId: Long, function: GetEmojiSuggestionsUrl): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getEmojiSuggestionsUrl")
        put(key = "@extra", long = requestId)
        put(key = "language_code", string = function.languageCode)
    }
}

private fun serialize(requestId: Long, function: GetExternalLink): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getExternalLink")
        put(key = "@extra", long = requestId)
        put(key = "link", string = function.link)
        put(key = "allow_write_access", boolean = function.allowWriteAccess)
    }
}

private fun serialize(requestId: Long, function: GetExternalLinkInfo): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getExternalLinkInfo")
        put(key = "@extra", long = requestId)
        put(key = "link", string = function.link)
    }
}

private fun serialize(requestId: Long, function: GetFavoriteStickers): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getFavoriteStickers")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetFile): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getFile")
        put(key = "@extra", long = requestId)
        put(key = "file_id", int = function.fileId)
    }
}

private fun serialize(requestId: Long, function: GetFileDownloadedPrefixSize): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getFileDownloadedPrefixSize")
        put(key = "@extra", long = requestId)
        put(key = "file_id", int = function.fileId)
        put(key = "offset", long = function.offset)
    }
}

private fun serialize(requestId: Long, function: GetFileExtension): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getFileExtension")
        put(key = "@extra", long = requestId)
        put(key = "mime_type", string = function.mimeType)
    }
}

private fun serialize(requestId: Long, function: GetFileMimeType): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getFileMimeType")
        put(key = "@extra", long = requestId)
        put(key = "file_name", string = function.fileName)
    }
}

private fun serialize(requestId: Long, function: GetForumTopic): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getForumTopic")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "forum_topic_id", int = function.forumTopicId)
    }
}

private fun serialize(requestId: Long, function: GetForumTopicDefaultIcons): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getForumTopicDefaultIcons")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetForumTopicHistory): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getForumTopicHistory")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "forum_topic_id", int = function.forumTopicId)
        put(key = "from_message_id", long = function.fromMessageId)
        put(key = "offset", int = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetForumTopicLink): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getForumTopicLink")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "forum_topic_id", int = function.forumTopicId)
    }
}

private fun serialize(requestId: Long, function: GetForumTopics): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getForumTopics")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "query", string = function.query)
        put(key = "offset_date", int = function.offsetDate)
        put(key = "offset_message_id", long = function.offsetMessageId)
        put(key = "offset_forum_topic_id", int = function.offsetForumTopicId)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetFullRichMessage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getFullRichMessage")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
    }
}

private fun serialize(requestId: Long, function: GetGameHighScores): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getGameHighScores")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "user_id", long = function.userId)
    }
}

private fun serialize(requestId: Long, function: GetGiftAuctionAcquiredGifts): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getGiftAuctionAcquiredGifts")
        put(key = "@extra", long = requestId)
        put(key = "gift_id", long = function.giftId)
    }
}

private fun serialize(requestId: Long, function: GetGiftAuctionState): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getGiftAuctionState")
        put(key = "@extra", long = requestId)
        put(key = "auction_id", string = function.auctionId)
    }
}

private fun serialize(requestId: Long, function: GetGiftChatThemes): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getGiftChatThemes")
        put(key = "@extra", long = requestId)
        put(key = "offset", string = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetGiftCollections): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getGiftCollections")
        put(key = "@extra", long = requestId)
        put(key = "owner_id", value = function.ownerId) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: GetGiftUpgradePreview): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getGiftUpgradePreview")
        put(key = "@extra", long = requestId)
        put(key = "regular_gift_id", long = function.regularGiftId)
    }
}

private fun serialize(requestId: Long, function: GetGiftsForCrafting): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getGiftsForCrafting")
        put(key = "@extra", long = requestId)
        put(key = "regular_gift_id", long = function.regularGiftId)
        put(key = "offset", string = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetGiveawayInfo): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getGiveawayInfo")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
    }
}

private fun serialize(requestId: Long, function: GetGramRevenueStatistics): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getGramRevenueStatistics")
        put(key = "@extra", long = requestId)
        put(key = "is_dark", boolean = function.isDark)
    }
}

private fun serialize(requestId: Long, function: GetGramWithdrawalUrl): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getGramWithdrawalUrl")
        put(key = "@extra", long = requestId)
        put(key = "password", string = function.password)
    }
}

private fun serialize(requestId: Long, function: GetGreetingStickers): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getGreetingStickers")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetGrossingWebAppBots): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getGrossingWebAppBots")
        put(key = "@extra", long = requestId)
        put(key = "offset", string = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetGroupCall): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getGroupCall")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
    }
}

private fun serialize(requestId: Long, function: GetGroupCallParticipants): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getGroupCallParticipants")
        put(key = "@extra", long = requestId)
        put(key = "input_group_call", value = function.inputGroupCall) { data -> serialize(dto = data) }
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetGroupCallStreamSegment): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getGroupCallStreamSegment")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
        put(key = "time_offset", long = function.timeOffset)
        put(key = "scale", int = function.scale)
        put(key = "channel_id", int = function.channelId)
        put(key = "video_quality", value = function.videoQuality) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: GetGroupCallStreams): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getGroupCallStreams")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
    }
}

private fun serialize(requestId: Long, function: GetGroupsInCommon): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getGroupsInCommon")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
        put(key = "offset_chat_id", long = function.offsetChatId)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetGuardBotWebAppUrl): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getGuardBotWebAppUrl")
        put(key = "@extra", long = requestId)
        put(key = "query_id", long = function.queryId)
        put(key = "parameters", value = function.parameters) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: GetImportedContactCount): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getImportedContactCount")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetInactiveSupergroupChats): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getInactiveSupergroupChats")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetInlineGameHighScores): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getInlineGameHighScores")
        put(key = "@extra", long = requestId)
        put(key = "inline_message_id", string = function.inlineMessageId)
        put(key = "user_id", long = function.userId)
    }
}

private fun serialize(requestId: Long, function: GetInlineQueryResults): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getInlineQueryResults")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "chat_id", long = function.chatId)
        put(key = "user_location", value = function.userLocation) { data -> serialize(dto = data) }
        put(key = "query", string = function.query)
        put(key = "offset", string = function.offset)
    }
}

private fun serialize(requestId: Long, function: GetInstalledBackgrounds): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getInstalledBackgrounds")
        put(key = "@extra", long = requestId)
        put(key = "for_dark_theme", boolean = function.forDarkTheme)
    }
}

private fun serialize(requestId: Long, function: GetInstalledStickerSets): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getInstalledStickerSets")
        put(key = "@extra", long = requestId)
        put(key = "sticker_type", value = function.stickerType) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: GetInternalLink): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getInternalLink")
        put(key = "@extra", long = requestId)
        put(key = "type", value = function.type) { data -> serialize(dto = data) }
        put(key = "is_http", boolean = function.isHttp)
    }
}

private fun serialize(requestId: Long, function: GetInternalLinkType): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getInternalLinkType")
        put(key = "@extra", long = requestId)
        put(key = "link", string = function.link)
    }
}

private fun serialize(requestId: Long, function: GetJsonString): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getJsonString")
        put(key = "@extra", long = requestId)
        put(key = "json_value", value = function.jsonValue) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: GetJsonValue): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getJsonValue")
        put(key = "@extra", long = requestId)
        put(key = "json", string = function.json)
    }
}

private fun serialize(requestId: Long, function: GetKeywordEmojis): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getKeywordEmojis")
        put(key = "@extra", long = requestId)
        put(key = "text", string = function.text)
        put(key = "input_language_codes", strings = function.inputLanguageCodes)
    }
}

private fun serialize(requestId: Long, function: GetLanguagePackInfo): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getLanguagePackInfo")
        put(key = "@extra", long = requestId)
        put(key = "language_pack_id", string = function.languagePackId)
    }
}

private fun serialize(requestId: Long, function: GetLanguagePackString): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getLanguagePackString")
        put(key = "@extra", long = requestId)
        put(key = "language_pack_database_path", string = function.languagePackDatabasePath)
        put(key = "localization_target", string = function.localizationTarget)
        put(key = "language_pack_id", string = function.languagePackId)
        put(key = "key", string = function.key)
    }
}

private fun serialize(requestId: Long, function: GetLanguagePackStrings): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getLanguagePackStrings")
        put(key = "@extra", long = requestId)
        put(key = "language_pack_id", string = function.languagePackId)
        put(key = "keys", strings = function.keys)
    }
}

private fun serialize(requestId: Long, function: GetLinkPreview): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getLinkPreview")
        put(key = "@extra", long = requestId)
        put(key = "text", value = function.text) { data -> serialize(dto = data) }
        put(key = "link_preview_options", value = function.linkPreviewOptions) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: GetLinkWebBrowserType): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getLinkWebBrowserType")
        put(key = "@extra", long = requestId)
        put(key = "link", string = function.link)
    }
}

private fun serialize(requestId: Long, function: GetLiveStoryAvailableMessageSenders): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getLiveStoryAvailableMessageSenders")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
    }
}

private fun serialize(requestId: Long, function: GetLiveStoryRtmpUrl): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getLiveStoryRtmpUrl")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: GetLiveStoryStreamer): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getLiveStoryStreamer")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
    }
}

private fun serialize(requestId: Long, function: GetLiveStoryTopDonors): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getLiveStoryTopDonors")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
    }
}

private fun serialize(requestId: Long, function: GetLocalizationTargetInfo): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getLocalizationTargetInfo")
        put(key = "@extra", long = requestId)
        put(key = "only_local", boolean = function.onlyLocal)
    }
}

private fun serialize(requestId: Long, function: GetLogStream): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getLogStream")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetLogTagVerbosityLevel): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getLogTagVerbosityLevel")
        put(key = "@extra", long = requestId)
        put(key = "tag", string = function.tag)
    }
}

private fun serialize(requestId: Long, function: GetLogTags): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getLogTags")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetLogVerbosityLevel): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getLogVerbosityLevel")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetLoginPasskeys): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getLoginPasskeys")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetLoginUrl): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getLoginUrl")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "button_id", long = function.buttonId)
        put(key = "allow_write_access", boolean = function.allowWriteAccess)
    }
}

private fun serialize(requestId: Long, function: GetLoginUrlInfo): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getLoginUrlInfo")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "button_id", long = function.buttonId)
    }
}

private fun serialize(requestId: Long, function: GetMainWebApp): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getMainWebApp")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "start_parameter", string = function.startParameter)
        put(key = "parameters", value = function.parameters) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: GetManagedBotAccessSettings): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getManagedBotAccessSettings")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
    }
}

private fun serialize(requestId: Long, function: GetManagedBotToken): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getManagedBotToken")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "revoke", boolean = function.revoke)
    }
}

private fun serialize(requestId: Long, function: GetMapThumbnailFile): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getMapThumbnailFile")
        put(key = "@extra", long = requestId)
        put(key = "location", value = function.location) { data -> serialize(dto = data) }
        put(key = "zoom", int = function.zoom)
        put(key = "width", int = function.width)
        put(key = "height", int = function.height)
        put(key = "scale", int = function.scale)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: GetMarkdownText): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getMarkdownText")
        put(key = "@extra", long = requestId)
        put(key = "text", value = function.text) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: GetMe): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getMe")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetMenuButton): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getMenuButton")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
    }
}

private fun serialize(requestId: Long, function: GetMessage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getMessage")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
    }
}

private fun serialize(requestId: Long, function: GetMessageAddedReactions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getMessageAddedReactions")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "reaction_type", value = function.reactionType) { data -> serialize(dto = data) }
        put(key = "offset", string = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetMessageAuthor): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getMessageAuthor")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
    }
}

private fun serialize(requestId: Long, function: GetMessageAvailableReactions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getMessageAvailableReactions")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "row_size", int = function.rowSize)
    }
}

private fun serialize(requestId: Long, function: GetMessageEffect): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getMessageEffect")
        put(key = "@extra", long = requestId)
        put(key = "effect_id", long = function.effectId)
    }
}

private fun serialize(requestId: Long, function: GetMessageEmbeddingCode): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getMessageEmbeddingCode")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "for_album", boolean = function.forAlbum)
    }
}

private fun serialize(requestId: Long, function: GetMessageFileType): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getMessageFileType")
        put(key = "@extra", long = requestId)
        put(key = "message_file_head", string = function.messageFileHead)
    }
}

private fun serialize(requestId: Long, function: GetMessageImportConfirmationText): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getMessageImportConfirmationText")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: GetMessageLink): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getMessageLink")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "media_timestamp", int = function.mediaTimestamp)
        put(key = "checklist_task_id", int = function.checklistTaskId)
        put(key = "poll_option_id", string = function.pollOptionId)
        put(key = "for_album", boolean = function.forAlbum)
        put(key = "in_message_thread", boolean = function.inMessageThread)
    }
}

private fun serialize(requestId: Long, function: GetMessageLinkInfo): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getMessageLinkInfo")
        put(key = "@extra", long = requestId)
        put(key = "url", string = function.url)
    }
}

private fun serialize(requestId: Long, function: GetMessageLocally): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getMessageLocally")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
    }
}

private fun serialize(requestId: Long, function: GetMessageProperties): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getMessageProperties")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
    }
}

private fun serialize(requestId: Long, function: GetMessagePublicForwards): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getMessagePublicForwards")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "offset", string = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetMessageReadDate): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getMessageReadDate")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
    }
}

private fun serialize(requestId: Long, function: GetMessageStatistics): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getMessageStatistics")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "is_dark", boolean = function.isDark)
    }
}

private fun serialize(requestId: Long, function: GetMessageThread): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getMessageThread")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
    }
}

private fun serialize(requestId: Long, function: GetMessageThreadHistory): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getMessageThreadHistory")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "from_message_id", long = function.fromMessageId)
        put(key = "offset", int = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetMessageViewers): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getMessageViewers")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
    }
}

private fun serialize(requestId: Long, function: GetMessages): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getMessages")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_ids", longs = function.messageIds)
    }
}

private fun serialize(requestId: Long, function: GetNetworkStatistics): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getNetworkStatistics")
        put(key = "@extra", long = requestId)
        put(key = "only_current", boolean = function.onlyCurrent)
    }
}

private fun serialize(requestId: Long, function: GetNewChatPrivacySettings): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getNewChatPrivacySettings")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetOauthLinkInfo): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getOauthLinkInfo")
        put(key = "@extra", long = requestId)
        put(key = "url", string = function.url)
        put(key = "in_app_origin", string = function.inAppOrigin)
    }
}

private fun serialize(requestId: Long, function: GetOption): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getOption")
        put(key = "@extra", long = requestId)
        put(key = "name", string = function.name)
    }
}

private fun serialize(requestId: Long, function: GetOwnedBots): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getOwnedBots")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetOwnedStickerSets): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getOwnedStickerSets")
        put(key = "@extra", long = requestId)
        put(key = "offset_sticker_set_id", long = function.offsetStickerSetId)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetPaidMessageRevenue): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getPaidMessageRevenue")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
    }
}

private fun serialize(requestId: Long, function: GetPasskeyParameters): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getPasskeyParameters")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetPassportAuthorizationForm): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getPassportAuthorizationForm")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "scope", string = function.scope)
        put(key = "public_key", string = function.publicKey)
        put(key = "nonce", string = function.nonce)
    }
}

private fun serialize(requestId: Long, function: GetPassportAuthorizationFormAvailableElements): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getPassportAuthorizationFormAvailableElements")
        put(key = "@extra", long = requestId)
        put(key = "authorization_form_id", int = function.authorizationFormId)
        put(key = "password", string = function.password)
    }
}

private fun serialize(requestId: Long, function: GetPassportElement): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getPassportElement")
        put(key = "@extra", long = requestId)
        put(key = "type", value = function.type) { data -> serialize(dto = data) }
        put(key = "password", string = function.password)
    }
}

private fun serialize(requestId: Long, function: GetPasswordState): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getPasswordState")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetPaymentForm): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getPaymentForm")
        put(key = "@extra", long = requestId)
        put(key = "input_invoice", value = function.inputInvoice) { data -> serialize(dto = data) }
        put(key = "theme", value = function.theme) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: GetPaymentReceipt): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getPaymentReceipt")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
    }
}

private fun serialize(requestId: Long, function: GetPersonalChatHistory): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getPersonalChatHistory")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetPhoneNumberInfo): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getPhoneNumberInfo")
        put(key = "@extra", long = requestId)
        put(key = "phone_number_prefix", string = function.phoneNumberPrefix)
    }
}

private fun serialize(requestId: Long, function: GetPhoneNumberInfoSync): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getPhoneNumberInfoSync")
        put(key = "@extra", long = requestId)
        put(key = "language_code", string = function.languageCode)
        put(key = "phone_number_prefix", string = function.phoneNumberPrefix)
    }
}

private fun serialize(requestId: Long, function: GetPollOptionProperties): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getPollOptionProperties")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "poll_option_id", string = function.pollOptionId)
    }
}

private fun serialize(requestId: Long, function: GetPollVoteStatistics): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getPollVoteStatistics")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "is_dark", boolean = function.isDark)
    }
}

private fun serialize(requestId: Long, function: GetPollVoters): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getPollVoters")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "option_id", int = function.optionId)
        put(key = "offset", int = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetPreferredCountryLanguage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getPreferredCountryLanguage")
        put(key = "@extra", long = requestId)
        put(key = "country_code", string = function.countryCode)
    }
}

private fun serialize(requestId: Long, function: GetPremiumFeatures): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getPremiumFeatures")
        put(key = "@extra", long = requestId)
        put(key = "source", value = function.source) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: GetPremiumGiftPaymentOptions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getPremiumGiftPaymentOptions")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetPremiumGiveawayPaymentOptions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getPremiumGiveawayPaymentOptions")
        put(key = "@extra", long = requestId)
        put(key = "boosted_chat_id", long = function.boostedChatId)
    }
}

private fun serialize(requestId: Long, function: GetPremiumInfoSticker): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getPremiumInfoSticker")
        put(key = "@extra", long = requestId)
        put(key = "month_count", int = function.monthCount)
    }
}

private fun serialize(requestId: Long, function: GetPremiumLimit): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getPremiumLimit")
        put(key = "@extra", long = requestId)
        put(key = "limit_type", value = function.limitType) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: GetPremiumState): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getPremiumState")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetPremiumStickerExamples): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getPremiumStickerExamples")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetPremiumStickers): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getPremiumStickers")
        put(key = "@extra", long = requestId)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetPreparedInlineMessage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getPreparedInlineMessage")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "prepared_message_id", string = function.preparedMessageId)
    }
}

private fun serialize(requestId: Long, function: GetPreparedKeyboardButton): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getPreparedKeyboardButton")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "prepared_button_id", string = function.preparedButtonId)
    }
}

private fun serialize(requestId: Long, function: GetProxies): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getProxies")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetPublicPostSearchLimits): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getPublicPostSearchLimits")
        put(key = "@extra", long = requestId)
        put(key = "query", string = function.query)
    }
}

private fun serialize(requestId: Long, function: GetPushReceiverId): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getPushReceiverId")
        put(key = "@extra", long = requestId)
        put(key = "payload", string = function.payload)
    }
}

private fun serialize(requestId: Long, function: GetReadDatePrivacySettings): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getReadDatePrivacySettings")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetReceivedGift): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getReceivedGift")
        put(key = "@extra", long = requestId)
        put(key = "received_gift_id", string = function.receivedGiftId)
    }
}

private fun serialize(requestId: Long, function: GetReceivedGifts): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getReceivedGifts")
        put(key = "@extra", long = requestId)
        put(key = "business_connection_id", string = function.businessConnectionId)
        put(key = "owner_id", value = function.ownerId) { data -> serialize(dto = data) }
        put(key = "collection_id", int = function.collectionId)
        put(key = "exclude_unsaved", boolean = function.excludeUnsaved)
        put(key = "exclude_saved", boolean = function.excludeSaved)
        put(key = "exclude_unlimited", boolean = function.excludeUnlimited)
        put(key = "exclude_upgradable", boolean = function.excludeUpgradable)
        put(key = "exclude_non_upgradable", boolean = function.excludeNonUpgradable)
        put(key = "exclude_upgraded", boolean = function.excludeUpgraded)
        put(key = "exclude_without_colors", boolean = function.excludeWithoutColors)
        put(key = "exclude_hosted", boolean = function.excludeHosted)
        put(key = "sort_by_price", boolean = function.sortByPrice)
        put(key = "offset", string = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetRecentEmojiStatuses): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getRecentEmojiStatuses")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetRecentInlineBots): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getRecentInlineBots")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetRecentStickers): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getRecentStickers")
        put(key = "@extra", long = requestId)
        put(key = "is_attached", boolean = function.isAttached)
    }
}

private fun serialize(requestId: Long, function: GetRecentlyOpenedChats): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getRecentlyOpenedChats")
        put(key = "@extra", long = requestId)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetRecentlyVisitedTMeUrls): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getRecentlyVisitedTMeUrls")
        put(key = "@extra", long = requestId)
        put(key = "referrer", string = function.referrer)
    }
}

private fun serialize(requestId: Long, function: GetRecommendedChatFolders): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getRecommendedChatFolders")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetRecommendedChats): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getRecommendedChats")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetRecoveryEmailAddress): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getRecoveryEmailAddress")
        put(key = "@extra", long = requestId)
        put(key = "password", string = function.password)
    }
}

private fun serialize(requestId: Long, function: GetRemoteFile): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getRemoteFile")
        put(key = "@extra", long = requestId)
        put(key = "remote_file_id", string = function.remoteFileId)
        put(key = "file_type", value = function.fileType) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: GetRepliedMessage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getRepliedMessage")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
    }
}

private fun serialize(requestId: Long, function: GetSavedAnimations): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getSavedAnimations")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetSavedMessagesTags): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getSavedMessagesTags")
        put(key = "@extra", long = requestId)
        put(key = "saved_messages_topic_id", long = function.savedMessagesTopicId)
    }
}

private fun serialize(requestId: Long, function: GetSavedMessagesTopicHistory): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getSavedMessagesTopicHistory")
        put(key = "@extra", long = requestId)
        put(key = "saved_messages_topic_id", long = function.savedMessagesTopicId)
        put(key = "from_message_id", long = function.fromMessageId)
        put(key = "offset", int = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetSavedMessagesTopicMessageByDate): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getSavedMessagesTopicMessageByDate")
        put(key = "@extra", long = requestId)
        put(key = "saved_messages_topic_id", long = function.savedMessagesTopicId)
        put(key = "date", int = function.date)
    }
}

private fun serialize(requestId: Long, function: GetSavedNotificationSound): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getSavedNotificationSound")
        put(key = "@extra", long = requestId)
        put(key = "notification_sound_id", long = function.notificationSoundId)
    }
}

private fun serialize(requestId: Long, function: GetSavedNotificationSounds): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getSavedNotificationSounds")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetSavedOrderInfo): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getSavedOrderInfo")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetScopeNotificationSettings): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getScopeNotificationSettings")
        put(key = "@extra", long = requestId)
        put(key = "scope", value = function.scope) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: GetSearchSponsoredChats): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getSearchSponsoredChats")
        put(key = "@extra", long = requestId)
        put(key = "query", string = function.query)
    }
}

private fun serialize(requestId: Long, function: GetSearchedForTags): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getSearchedForTags")
        put(key = "@extra", long = requestId)
        put(key = "tag_prefix", string = function.tagPrefix)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetSecretChat): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getSecretChat")
        put(key = "@extra", long = requestId)
        put(key = "secret_chat_id", int = function.secretChatId)
    }
}

private fun serialize(requestId: Long, function: GetStakeDiceState): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getStakeDiceState")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetStarAdAccountUrl): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getStarAdAccountUrl")
        put(key = "@extra", long = requestId)
        put(key = "owner_id", value = function.ownerId) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: GetStarGiftPaymentOptions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getStarGiftPaymentOptions")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
    }
}

private fun serialize(requestId: Long, function: GetStarGiveawayPaymentOptions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getStarGiveawayPaymentOptions")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetStarPaymentOptions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getStarPaymentOptions")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetStarRevenueStatistics): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getStarRevenueStatistics")
        put(key = "@extra", long = requestId)
        put(key = "owner_id", value = function.ownerId) { data -> serialize(dto = data) }
        put(key = "is_dark", boolean = function.isDark)
    }
}

private fun serialize(requestId: Long, function: GetStarSubscriptions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getStarSubscriptions")
        put(key = "@extra", long = requestId)
        put(key = "only_expiring", boolean = function.onlyExpiring)
        put(key = "offset", string = function.offset)
    }
}

private fun serialize(requestId: Long, function: GetStarTransactions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getStarTransactions")
        put(key = "@extra", long = requestId)
        put(key = "owner_id", value = function.ownerId) { data -> serialize(dto = data) }
        put(key = "subscription_id", string = function.subscriptionId)
        put(key = "direction", value = function.direction) { data -> serialize(dto = data) }
        put(key = "offset", string = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetStarWithdrawalUrl): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getStarWithdrawalUrl")
        put(key = "@extra", long = requestId)
        put(key = "owner_id", value = function.ownerId) { data -> serialize(dto = data) }
        put(key = "star_count", long = function.starCount)
        put(key = "password", string = function.password)
    }
}

private fun serialize(requestId: Long, function: GetStatisticalGraph): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getStatisticalGraph")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "token", string = function.token)
        put(key = "x", long = function.x)
    }
}

private fun serialize(requestId: Long, function: GetStickerEmojis): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getStickerEmojis")
        put(key = "@extra", long = requestId)
        put(key = "sticker", value = function.sticker) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: GetStickerOutline): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getStickerOutline")
        put(key = "@extra", long = requestId)
        put(key = "sticker_file_id", int = function.stickerFileId)
        put(key = "for_animated_emoji", boolean = function.forAnimatedEmoji)
        put(key = "for_clicked_animated_emoji_message", boolean = function.forClickedAnimatedEmojiMessage)
    }
}

private fun serialize(requestId: Long, function: GetStickerOutlineSvgPath): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getStickerOutlineSvgPath")
        put(key = "@extra", long = requestId)
        put(key = "sticker_file_id", int = function.stickerFileId)
        put(key = "for_animated_emoji", boolean = function.forAnimatedEmoji)
        put(key = "for_clicked_animated_emoji_message", boolean = function.forClickedAnimatedEmojiMessage)
    }
}

private fun serialize(requestId: Long, function: GetStickerSet): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getStickerSet")
        put(key = "@extra", long = requestId)
        put(key = "set_id", long = function.setId)
    }
}

private fun serialize(requestId: Long, function: GetStickerSetName): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getStickerSetName")
        put(key = "@extra", long = requestId)
        put(key = "set_id", long = function.setId)
    }
}

private fun serialize(requestId: Long, function: GetStickers): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getStickers")
        put(key = "@extra", long = requestId)
        put(key = "sticker_type", value = function.stickerType) { data -> serialize(dto = data) }
        put(key = "query", string = function.query)
        put(key = "limit", int = function.limit)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: GetStorageStatistics): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getStorageStatistics")
        put(key = "@extra", long = requestId)
        put(key = "chat_limit", int = function.chatLimit)
    }
}

private fun serialize(requestId: Long, function: GetStorageStatisticsFast): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getStorageStatisticsFast")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetStory): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getStory")
        put(key = "@extra", long = requestId)
        put(key = "story_poster_chat_id", long = function.storyPosterChatId)
        put(key = "story_id", int = function.storyId)
        put(key = "only_local", boolean = function.onlyLocal)
    }
}

private fun serialize(requestId: Long, function: GetStoryAlbumStories): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getStoryAlbumStories")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "story_album_id", int = function.storyAlbumId)
        put(key = "offset", int = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetStoryAvailableReactions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getStoryAvailableReactions")
        put(key = "@extra", long = requestId)
        put(key = "row_size", int = function.rowSize)
    }
}

private fun serialize(requestId: Long, function: GetStoryInteractions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getStoryInteractions")
        put(key = "@extra", long = requestId)
        put(key = "story_id", int = function.storyId)
        put(key = "query", string = function.query)
        put(key = "only_contacts", boolean = function.onlyContacts)
        put(key = "prefer_forwards", boolean = function.preferForwards)
        put(key = "prefer_with_reaction", boolean = function.preferWithReaction)
        put(key = "offset", string = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetStoryNotificationSettingsExceptions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getStoryNotificationSettingsExceptions")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetStoryPublicForwards): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getStoryPublicForwards")
        put(key = "@extra", long = requestId)
        put(key = "story_poster_chat_id", long = function.storyPosterChatId)
        put(key = "story_id", int = function.storyId)
        put(key = "offset", string = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetStoryStatistics): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getStoryStatistics")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "story_id", int = function.storyId)
        put(key = "is_dark", boolean = function.isDark)
    }
}

private fun serialize(requestId: Long, function: GetSuggestedFileName): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getSuggestedFileName")
        put(key = "@extra", long = requestId)
        put(key = "file_id", int = function.fileId)
        put(key = "directory", string = function.directory)
    }
}

private fun serialize(requestId: Long, function: GetSuggestedStickerSetName): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getSuggestedStickerSetName")
        put(key = "@extra", long = requestId)
        put(key = "title", string = function.title)
    }
}

private fun serialize(requestId: Long, function: GetSuitableDiscussionChats): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getSuitableDiscussionChats")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetSuitablePersonalChats): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getSuitablePersonalChats")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetSupergroup): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getSupergroup")
        put(key = "@extra", long = requestId)
        put(key = "supergroup_id", long = function.supergroupId)
    }
}

private fun serialize(requestId: Long, function: GetSupergroupFullInfo): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getSupergroupFullInfo")
        put(key = "@extra", long = requestId)
        put(key = "supergroup_id", long = function.supergroupId)
    }
}

private fun serialize(requestId: Long, function: GetSupergroupMembers): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getSupergroupMembers")
        put(key = "@extra", long = requestId)
        put(key = "supergroup_id", long = function.supergroupId)
        put(key = "filter", value = function.filter) { data -> serialize(dto = data) }
        put(key = "offset", int = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetSupportName): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getSupportName")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetSupportUser): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getSupportUser")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetTemporaryPasswordState): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getTemporaryPasswordState")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetTextCompositionStyleExample): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getTextCompositionStyleExample")
        put(key = "@extra", long = requestId)
        put(key = "name", string = function.name)
        put(key = "example_number", int = function.exampleNumber)
    }
}

private fun serialize(requestId: Long, function: GetTextEntities): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getTextEntities")
        put(key = "@extra", long = requestId)
        put(key = "text", string = function.text)
    }
}

private fun serialize(requestId: Long, function: GetThemeParametersJsonString): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getThemeParametersJsonString")
        put(key = "@extra", long = requestId)
        put(key = "theme", value = function.theme) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: GetThemedChatEmojiStatuses): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getThemedChatEmojiStatuses")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetThemedEmojiStatuses): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getThemedEmojiStatuses")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetTimeZones): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getTimeZones")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetTonTransactions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getTonTransactions")
        put(key = "@extra", long = requestId)
        put(key = "direction", value = function.direction) { data -> serialize(dto = data) }
        put(key = "offset", string = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetTopChats): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getTopChats")
        put(key = "@extra", long = requestId)
        put(key = "category", value = function.category) { data -> serialize(dto = data) }
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetTrendingStickerSets): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getTrendingStickerSets")
        put(key = "@extra", long = requestId)
        put(key = "sticker_type", value = function.stickerType) { data -> serialize(dto = data) }
        put(key = "offset", int = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetUpgradedGift): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getUpgradedGift")
        put(key = "@extra", long = requestId)
        put(key = "name", string = function.name)
    }
}

private fun serialize(requestId: Long, function: GetUpgradedGiftEmojiStatuses): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getUpgradedGiftEmojiStatuses")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetUpgradedGiftValueInfo): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getUpgradedGiftValueInfo")
        put(key = "@extra", long = requestId)
        put(key = "name", string = function.name)
    }
}

private fun serialize(requestId: Long, function: GetUpgradedGiftVariants): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getUpgradedGiftVariants")
        put(key = "@extra", long = requestId)
        put(key = "regular_gift_id", long = function.regularGiftId)
        put(key = "return_upgrade_models", boolean = function.returnUpgradeModels)
        put(key = "return_craft_models", boolean = function.returnCraftModels)
    }
}

private fun serialize(requestId: Long, function: GetUpgradedGiftWithdrawalUrl): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getUpgradedGiftWithdrawalUrl")
        put(key = "@extra", long = requestId)
        put(key = "received_gift_id", string = function.receivedGiftId)
        put(key = "password", string = function.password)
    }
}

private fun serialize(requestId: Long, function: GetUpgradedGiftsPromotionalAnimation): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getUpgradedGiftsPromotionalAnimation")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetUser): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getUser")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
    }
}

private fun serialize(requestId: Long, function: GetUserChatBoosts): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getUserChatBoosts")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "user_id", long = function.userId)
    }
}

private fun serialize(requestId: Long, function: GetUserFullInfo): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getUserFullInfo")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
    }
}

private fun serialize(requestId: Long, function: GetUserLink): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getUserLink")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: GetUserPrivacySettingRules): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getUserPrivacySettingRules")
        put(key = "@extra", long = requestId)
        put(key = "setting", value = function.setting) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: GetUserProfileAudios): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getUserProfileAudios")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
        put(key = "offset", int = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetUserProfilePhotos): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getUserProfilePhotos")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
        put(key = "offset", int = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: GetUserSupportInfo): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getUserSupportInfo")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
    }
}

private fun serialize(requestId: Long, function: GetVideoChatAvailableParticipants): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getVideoChatAvailableParticipants")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: GetVideoChatInviteLink): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getVideoChatInviteLink")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
        put(key = "can_self_unmute", boolean = function.canSelfUnmute)
    }
}

private fun serialize(requestId: Long, function: GetVideoChatRtmpUrl): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getVideoChatRtmpUrl")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: GetVideoMessageAdvertisements): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getVideoMessageAdvertisements")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
    }
}

private fun serialize(requestId: Long, function: GetWebAppLinkUrl): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getWebAppLinkUrl")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "web_app_short_name", string = function.webAppShortName)
        put(key = "start_parameter", string = function.startParameter)
        put(key = "allow_write_access", boolean = function.allowWriteAccess)
        put(key = "parameters", value = function.parameters) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: GetWebAppPlaceholder): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getWebAppPlaceholder")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
    }
}

private fun serialize(requestId: Long, function: GetWebAppUrl): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getWebAppUrl")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "url", string = function.url)
        put(key = "parameters", value = function.parameters) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: GetWebPageInstantView): String {
    return buildJsonObjectString {
        put(key = "@type", string = "getWebPageInstantView")
        put(key = "@extra", long = requestId)
        put(key = "url", string = function.url)
        put(key = "only_local", boolean = function.onlyLocal)
    }
}

private fun serialize(requestId: Long, function: GiftPremiumWithStars): String {
    return buildJsonObjectString {
        put(key = "@type", string = "giftPremiumWithStars")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
        put(key = "star_count", long = function.starCount)
        put(key = "month_count", int = function.monthCount)
        put(key = "text", value = function.text) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: HideContactCloseBirthdays): String {
    return buildJsonObjectString {
        put(key = "@type", string = "hideContactCloseBirthdays")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: HideSuggestedAction): String {
    return buildJsonObjectString {
        put(key = "@type", string = "hideSuggestedAction")
        put(key = "@extra", long = requestId)
        put(key = "action", value = function.action) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: ImportContacts): String {
    return buildJsonObjectString {
        put(key = "@type", string = "importContacts")
        put(key = "@extra", long = requestId)
        put(key = "contacts", objects = function.contacts) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: ImportMessages): String {
    return buildJsonObjectString {
        put(key = "@type", string = "importMessages")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_file", value = function.messageFile) { data -> serialize(dto = data) }
        put(key = "attached_files", objects = function.attachedFiles) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: IncreaseGiftAuctionBid): String {
    return buildJsonObjectString {
        put(key = "@type", string = "increaseGiftAuctionBid")
        put(key = "@extra", long = requestId)
        put(key = "gift_id", long = function.giftId)
        put(key = "star_count", long = function.starCount)
    }
}

private fun serialize(requestId: Long, function: InviteGroupCallParticipant): String {
    return buildJsonObjectString {
        put(key = "@type", string = "inviteGroupCallParticipant")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
        put(key = "user_id", long = function.userId)
        put(key = "is_video", boolean = function.isVideo)
    }
}

private fun serialize(requestId: Long, function: InviteVideoChatParticipants): String {
    return buildJsonObjectString {
        put(key = "@type", string = "inviteVideoChatParticipants")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
        put(key = "user_ids", longs = function.userIds)
    }
}

private fun serialize(requestId: Long, function: IsLoginEmailAddressRequired): String {
    return buildJsonObjectString {
        put(key = "@type", string = "isLoginEmailAddressRequired")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: IsProfileAudio): String {
    return buildJsonObjectString {
        put(key = "@type", string = "isProfileAudio")
        put(key = "@extra", long = requestId)
        put(key = "file_id", int = function.fileId)
    }
}

private fun serialize(requestId: Long, function: JoinChat): String {
    return buildJsonObjectString {
        put(key = "@type", string = "joinChat")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: JoinChatByInviteLink): String {
    return buildJsonObjectString {
        put(key = "@type", string = "joinChatByInviteLink")
        put(key = "@extra", long = requestId)
        put(key = "invite_link", string = function.inviteLink)
    }
}

private fun serialize(requestId: Long, function: JoinGroupCall): String {
    return buildJsonObjectString {
        put(key = "@type", string = "joinGroupCall")
        put(key = "@extra", long = requestId)
        put(key = "input_group_call", value = function.inputGroupCall) { data -> serialize(dto = data) }
        put(key = "join_parameters", value = function.joinParameters) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: JoinLiveStory): String {
    return buildJsonObjectString {
        put(key = "@type", string = "joinLiveStory")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
        put(key = "join_parameters", value = function.joinParameters) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: JoinVideoChat): String {
    return buildJsonObjectString {
        put(key = "@type", string = "joinVideoChat")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
        put(key = "participant_id", value = function.participantId) { data -> serialize(dto = data) }
        put(key = "join_parameters", value = function.joinParameters) { data -> serialize(dto = data) }
        put(key = "invite_hash", string = function.inviteHash)
    }
}

private fun serialize(requestId: Long, function: LaunchPrepaidGiveaway): String {
    return buildJsonObjectString {
        put(key = "@type", string = "launchPrepaidGiveaway")
        put(key = "@extra", long = requestId)
        put(key = "giveaway_id", long = function.giveawayId)
        put(key = "parameters", value = function.parameters) { data -> serialize(dto = data) }
        put(key = "winner_count", int = function.winnerCount)
        put(key = "star_count", long = function.starCount)
    }
}

private fun serialize(requestId: Long, function: LeaveChat): String {
    return buildJsonObjectString {
        put(key = "@type", string = "leaveChat")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: LeaveGroupCall): String {
    return buildJsonObjectString {
        put(key = "@type", string = "leaveGroupCall")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
    }
}

private fun serialize(requestId: Long, function: ListenToAudio): String {
    return buildJsonObjectString {
        put(key = "@type", string = "listenToAudio")
        put(key = "@extra", long = requestId)
        put(key = "audio_file_id", int = function.audioFileId)
        put(key = "duration", int = function.duration)
    }
}

private fun serialize(requestId: Long, function: LoadActiveStories): String {
    return buildJsonObjectString {
        put(key = "@type", string = "loadActiveStories")
        put(key = "@extra", long = requestId)
        put(key = "story_list", value = function.storyList) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: LoadChats): String {
    return buildJsonObjectString {
        put(key = "@type", string = "loadChats")
        put(key = "@extra", long = requestId)
        put(key = "chat_list", value = function.chatList) { data -> serialize(dto = data) }
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: LoadDirectMessagesChatTopics): String {
    return buildJsonObjectString {
        put(key = "@type", string = "loadDirectMessagesChatTopics")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: LoadGroupCallParticipants): String {
    return buildJsonObjectString {
        put(key = "@type", string = "loadGroupCallParticipants")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: LoadQuickReplyShortcutMessages): String {
    return buildJsonObjectString {
        put(key = "@type", string = "loadQuickReplyShortcutMessages")
        put(key = "@extra", long = requestId)
        put(key = "shortcut_id", int = function.shortcutId)
    }
}

private fun serialize(requestId: Long, function: LoadQuickReplyShortcuts): String {
    return buildJsonObjectString {
        put(key = "@type", string = "loadQuickReplyShortcuts")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: LoadSavedMessagesTopics): String {
    return buildJsonObjectString {
        put(key = "@type", string = "loadSavedMessagesTopics")
        put(key = "@extra", long = requestId)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: LogOut): String {
    return buildJsonObjectString {
        put(key = "@type", string = "logOut")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: MarkChecklistTasksAsDone): String {
    return buildJsonObjectString {
        put(key = "@type", string = "markChecklistTasksAsDone")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "marked_as_done_task_ids", ints = function.markedAsDoneTaskIds)
        put(key = "marked_as_not_done_task_ids", ints = function.markedAsNotDoneTaskIds)
    }
}

private fun serialize(requestId: Long, function: OpenBotSimilarBot): String {
    return buildJsonObjectString {
        put(key = "@type", string = "openBotSimilarBot")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "opened_bot_user_id", long = function.openedBotUserId)
    }
}

private fun serialize(requestId: Long, function: OpenChat): String {
    return buildJsonObjectString {
        put(key = "@type", string = "openChat")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: OpenChatSimilarChat): String {
    return buildJsonObjectString {
        put(key = "@type", string = "openChatSimilarChat")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "opened_chat_id", long = function.openedChatId)
    }
}

private fun serialize(requestId: Long, function: OpenGiftAuction): String {
    return buildJsonObjectString {
        put(key = "@type", string = "openGiftAuction")
        put(key = "@extra", long = requestId)
        put(key = "gift_id", long = function.giftId)
    }
}

private fun serialize(requestId: Long, function: OpenMessageContent): String {
    return buildJsonObjectString {
        put(key = "@type", string = "openMessageContent")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
    }
}

private fun serialize(requestId: Long, function: OpenSponsoredChat): String {
    return buildJsonObjectString {
        put(key = "@type", string = "openSponsoredChat")
        put(key = "@extra", long = requestId)
        put(key = "sponsored_chat_unique_id", long = function.sponsoredChatUniqueId)
    }
}

private fun serialize(requestId: Long, function: OpenStory): String {
    return buildJsonObjectString {
        put(key = "@type", string = "openStory")
        put(key = "@extra", long = requestId)
        put(key = "story_poster_chat_id", long = function.storyPosterChatId)
        put(key = "story_id", int = function.storyId)
    }
}

private fun serialize(requestId: Long, function: OpenWebApp): String {
    return buildJsonObjectString {
        put(key = "@type", string = "openWebApp")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "url", string = function.url)
        put(key = "topic_id", value = function.topicId) { data -> serialize(dto = data) }
        put(key = "reply_to", value = function.replyTo) { data -> serialize(dto = data) }
        put(key = "parameters", value = function.parameters) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: OptimizeStorage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "optimizeStorage")
        put(key = "@extra", long = requestId)
        put(key = "size", long = function.size)
        put(key = "ttl", int = function.ttl)
        put(key = "count", int = function.count)
        put(key = "immunity_delay", int = function.immunityDelay)
        put(key = "file_types", objects = function.fileTypes) { data -> serialize(dto = data) }
        put(key = "chat_ids", longs = function.chatIds)
        put(key = "exclude_chat_ids", longs = function.excludeChatIds)
        put(key = "return_deleted_file_statistics", boolean = function.returnDeletedFileStatistics)
        put(key = "chat_limit", int = function.chatLimit)
    }
}

private fun serialize(requestId: Long, function: ParseMarkdown): String {
    return buildJsonObjectString {
        put(key = "@type", string = "parseMarkdown")
        put(key = "@extra", long = requestId)
        put(key = "text", value = function.text) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: ParseTextEntities): String {
    return buildJsonObjectString {
        put(key = "@type", string = "parseTextEntities")
        put(key = "@extra", long = requestId)
        put(key = "text", string = function.text)
        put(key = "parse_mode", value = function.parseMode) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: PinChatMessage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "pinChatMessage")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "disable_notification", boolean = function.disableNotification)
        put(key = "only_for_self", boolean = function.onlyForSelf)
    }
}

private fun serialize(requestId: Long, function: PingProxy): String {
    return buildJsonObjectString {
        put(key = "@type", string = "pingProxy")
        put(key = "@extra", long = requestId)
        put(key = "proxy", value = function.proxy) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: PlaceGiftAuctionBid): String {
    return buildJsonObjectString {
        put(key = "@type", string = "placeGiftAuctionBid")
        put(key = "@extra", long = requestId)
        put(key = "gift_id", long = function.giftId)
        put(key = "star_count", long = function.starCount)
        put(key = "user_id", long = function.userId)
        put(key = "text", value = function.text) { data -> serialize(dto = data) }
        put(key = "is_private", boolean = function.isPrivate)
    }
}

private fun serialize(requestId: Long, function: PostStory): String {
    return buildJsonObjectString {
        put(key = "@type", string = "postStory")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "content", value = function.content) { data -> serialize(dto = data) }
        put(key = "areas", value = function.areas) { data -> serialize(dto = data) }
        put(key = "caption", value = function.caption) { data -> serialize(dto = data) }
        put(key = "privacy_settings", value = function.privacySettings) { data -> serialize(dto = data) }
        put(key = "album_ids", ints = function.albumIds)
        put(key = "active_period", int = function.activePeriod)
        put(key = "from_story_full_id", value = function.fromStoryFullId) { data -> serialize(dto = data) }
        put(key = "is_posted_to_chat_page", boolean = function.isPostedToChatPage)
        put(key = "protect_content", boolean = function.protectContent)
    }
}

private fun serialize(requestId: Long, function: PreliminaryUploadFile): String {
    return buildJsonObjectString {
        put(key = "@type", string = "preliminaryUploadFile")
        put(key = "@extra", long = requestId)
        put(key = "file", value = function.file) { data -> serialize(dto = data) }
        put(key = "file_type", value = function.fileType) { data -> serialize(dto = data) }
        put(key = "priority", int = function.priority)
    }
}

private fun serialize(requestId: Long, function: ProcessChatFolderNewChats): String {
    return buildJsonObjectString {
        put(key = "@type", string = "processChatFolderNewChats")
        put(key = "@extra", long = requestId)
        put(key = "chat_folder_id", int = function.chatFolderId)
        put(key = "added_chat_ids", longs = function.addedChatIds)
    }
}

private fun serialize(requestId: Long, function: ProcessChatHasProtectedContentDisableRequest): String {
    return buildJsonObjectString {
        put(key = "@type", string = "processChatHasProtectedContentDisableRequest")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "request_message_id", long = function.requestMessageId)
        put(key = "approve", boolean = function.approve)
    }
}

private fun serialize(requestId: Long, function: ProcessChatJoinRequest): String {
    return buildJsonObjectString {
        put(key = "@type", string = "processChatJoinRequest")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "user_id", long = function.userId)
        put(key = "approve", boolean = function.approve)
    }
}

private fun serialize(requestId: Long, function: ProcessChatJoinRequests): String {
    return buildJsonObjectString {
        put(key = "@type", string = "processChatJoinRequests")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "invite_link", string = function.inviteLink)
        put(key = "approve", boolean = function.approve)
    }
}

private fun serialize(requestId: Long, function: ProcessGiftPurchaseOffer): String {
    return buildJsonObjectString {
        put(key = "@type", string = "processGiftPurchaseOffer")
        put(key = "@extra", long = requestId)
        put(key = "message_id", long = function.messageId)
        put(key = "accept", boolean = function.accept)
    }
}

private fun serialize(requestId: Long, function: ProcessPushNotification): String {
    return buildJsonObjectString {
        put(key = "@type", string = "processPushNotification")
        put(key = "@extra", long = requestId)
        put(key = "payload", string = function.payload)
    }
}

private fun serialize(requestId: Long, function: RateSpeechRecognition): String {
    return buildJsonObjectString {
        put(key = "@type", string = "rateSpeechRecognition")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "is_good", boolean = function.isGood)
    }
}

private fun serialize(requestId: Long, function: ReadAllChatMentions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "readAllChatMentions")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: ReadAllChatPollVotes): String {
    return buildJsonObjectString {
        put(key = "@type", string = "readAllChatPollVotes")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: ReadAllChatReactions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "readAllChatReactions")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: ReadAllDirectMessagesChatTopicReactions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "readAllDirectMessagesChatTopicReactions")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "topic_id", long = function.topicId)
    }
}

private fun serialize(requestId: Long, function: ReadAllForumTopicMentions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "readAllForumTopicMentions")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "forum_topic_id", int = function.forumTopicId)
    }
}

private fun serialize(requestId: Long, function: ReadAllForumTopicPollVotes): String {
    return buildJsonObjectString {
        put(key = "@type", string = "readAllForumTopicPollVotes")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "forum_topic_id", int = function.forumTopicId)
    }
}

private fun serialize(requestId: Long, function: ReadAllForumTopicReactions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "readAllForumTopicReactions")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "forum_topic_id", int = function.forumTopicId)
    }
}

private fun serialize(requestId: Long, function: ReadBusinessMessage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "readBusinessMessage")
        put(key = "@extra", long = requestId)
        put(key = "business_connection_id", string = function.businessConnectionId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
    }
}

private fun serialize(requestId: Long, function: ReadChatList): String {
    return buildJsonObjectString {
        put(key = "@type", string = "readChatList")
        put(key = "@extra", long = requestId)
        put(key = "chat_list", value = function.chatList) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: ReadFilePart): String {
    return buildJsonObjectString {
        put(key = "@type", string = "readFilePart")
        put(key = "@extra", long = requestId)
        put(key = "file_id", int = function.fileId)
        put(key = "offset", long = function.offset)
        put(key = "count", long = function.count)
    }
}

private fun serialize(requestId: Long, function: ReaddQuickReplyShortcutMessages): String {
    return buildJsonObjectString {
        put(key = "@type", string = "readdQuickReplyShortcutMessages")
        put(key = "@extra", long = requestId)
        put(key = "shortcut_name", string = function.shortcutName)
        put(key = "message_ids", longs = function.messageIds)
    }
}

private fun serialize(requestId: Long, function: RecognizeSpeech): String {
    return buildJsonObjectString {
        put(key = "@type", string = "recognizeSpeech")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
    }
}

private fun serialize(requestId: Long, function: RecoverAuthenticationPassword): String {
    return buildJsonObjectString {
        put(key = "@type", string = "recoverAuthenticationPassword")
        put(key = "@extra", long = requestId)
        put(key = "recovery_code", string = function.recoveryCode)
        put(key = "new_password", string = function.newPassword)
        put(key = "new_hint", string = function.newHint)
    }
}

private fun serialize(requestId: Long, function: RecoverPassword): String {
    return buildJsonObjectString {
        put(key = "@type", string = "recoverPassword")
        put(key = "@extra", long = requestId)
        put(key = "recovery_code", string = function.recoveryCode)
        put(key = "new_password", string = function.newPassword)
        put(key = "new_hint", string = function.newHint)
    }
}

private fun serialize(requestId: Long, function: RefundStarPayment): String {
    return buildJsonObjectString {
        put(key = "@type", string = "refundStarPayment")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
        put(key = "telegram_payment_charge_id", string = function.telegramPaymentChargeId)
    }
}

private fun serialize(requestId: Long, function: RegisterDevice): String {
    return buildJsonObjectString {
        put(key = "@type", string = "registerDevice")
        put(key = "@extra", long = requestId)
        put(key = "device_token", value = function.deviceToken) { data -> serialize(dto = data) }
        put(key = "other_user_ids", longs = function.otherUserIds)
    }
}

private fun serialize(requestId: Long, function: RegisterUser): String {
    return buildJsonObjectString {
        put(key = "@type", string = "registerUser")
        put(key = "@extra", long = requestId)
        put(key = "first_name", string = function.firstName)
        put(key = "last_name", string = function.lastName)
        put(key = "disable_notification", boolean = function.disableNotification)
    }
}

private fun serialize(requestId: Long, function: RemoveAllFilesFromDownloads): String {
    return buildJsonObjectString {
        put(key = "@type", string = "removeAllFilesFromDownloads")
        put(key = "@extra", long = requestId)
        put(key = "only_active", boolean = function.onlyActive)
        put(key = "only_completed", boolean = function.onlyCompleted)
        put(key = "delete_from_cache", boolean = function.deleteFromCache)
    }
}

private fun serialize(requestId: Long, function: RemoveAllWebBrowserSettingsExceptions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "removeAllWebBrowserSettingsExceptions")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: RemoveBusinessConnectedBotFromChat): String {
    return buildJsonObjectString {
        put(key = "@type", string = "removeBusinessConnectedBotFromChat")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: RemoveChatActionBar): String {
    return buildJsonObjectString {
        put(key = "@type", string = "removeChatActionBar")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: RemoveContacts): String {
    return buildJsonObjectString {
        put(key = "@type", string = "removeContacts")
        put(key = "@extra", long = requestId)
        put(key = "user_ids", longs = function.userIds)
    }
}

private fun serialize(requestId: Long, function: RemoveFavoriteSticker): String {
    return buildJsonObjectString {
        put(key = "@type", string = "removeFavoriteSticker")
        put(key = "@extra", long = requestId)
        put(key = "sticker", value = function.sticker) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: RemoveFileFromDownloads): String {
    return buildJsonObjectString {
        put(key = "@type", string = "removeFileFromDownloads")
        put(key = "@extra", long = requestId)
        put(key = "file_id", int = function.fileId)
        put(key = "delete_from_cache", boolean = function.deleteFromCache)
    }
}

private fun serialize(requestId: Long, function: RemoveGiftCollectionGifts): String {
    return buildJsonObjectString {
        put(key = "@type", string = "removeGiftCollectionGifts")
        put(key = "@extra", long = requestId)
        put(key = "owner_id", value = function.ownerId) { data -> serialize(dto = data) }
        put(key = "collection_id", int = function.collectionId)
        put(key = "received_gift_ids", strings = function.receivedGiftIds)
    }
}

private fun serialize(requestId: Long, function: RemoveInstalledBackground): String {
    return buildJsonObjectString {
        put(key = "@type", string = "removeInstalledBackground")
        put(key = "@extra", long = requestId)
        put(key = "background_id", long = function.backgroundId)
    }
}

private fun serialize(requestId: Long, function: RemoveLoginPasskey): String {
    return buildJsonObjectString {
        put(key = "@type", string = "removeLoginPasskey")
        put(key = "@extra", long = requestId)
        put(key = "passkey_id", string = function.passkeyId)
    }
}

private fun serialize(requestId: Long, function: RemoveMessageReaction): String {
    return buildJsonObjectString {
        put(key = "@type", string = "removeMessageReaction")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "reaction_type", value = function.reactionType) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: RemoveMessageSenderBotVerification): String {
    return buildJsonObjectString {
        put(key = "@type", string = "removeMessageSenderBotVerification")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "verified_id", value = function.verifiedId) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: RemoveNotification): String {
    return buildJsonObjectString {
        put(key = "@type", string = "removeNotification")
        put(key = "@extra", long = requestId)
        put(key = "notification_group_id", int = function.notificationGroupId)
        put(key = "notification_id", int = function.notificationId)
    }
}

private fun serialize(requestId: Long, function: RemoveNotificationGroup): String {
    return buildJsonObjectString {
        put(key = "@type", string = "removeNotificationGroup")
        put(key = "@extra", long = requestId)
        put(key = "notification_group_id", int = function.notificationGroupId)
        put(key = "max_notification_id", int = function.maxNotificationId)
    }
}

private fun serialize(requestId: Long, function: RemovePendingLiveStoryReactions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "removePendingLiveStoryReactions")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
    }
}

private fun serialize(requestId: Long, function: RemovePendingPaidMessageReactions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "removePendingPaidMessageReactions")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
    }
}

private fun serialize(requestId: Long, function: RemoveProfileAudio): String {
    return buildJsonObjectString {
        put(key = "@type", string = "removeProfileAudio")
        put(key = "@extra", long = requestId)
        put(key = "file_id", int = function.fileId)
    }
}

private fun serialize(requestId: Long, function: RemoveProxy): String {
    return buildJsonObjectString {
        put(key = "@type", string = "removeProxy")
        put(key = "@extra", long = requestId)
        put(key = "proxy_id", int = function.proxyId)
    }
}

private fun serialize(requestId: Long, function: RemoveRecentHashtag): String {
    return buildJsonObjectString {
        put(key = "@type", string = "removeRecentHashtag")
        put(key = "@extra", long = requestId)
        put(key = "hashtag", string = function.hashtag)
    }
}

private fun serialize(requestId: Long, function: RemoveRecentSticker): String {
    return buildJsonObjectString {
        put(key = "@type", string = "removeRecentSticker")
        put(key = "@extra", long = requestId)
        put(key = "is_attached", boolean = function.isAttached)
        put(key = "sticker", value = function.sticker) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: RemoveRecentlyFoundChat): String {
    return buildJsonObjectString {
        put(key = "@type", string = "removeRecentlyFoundChat")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: RemoveSavedAnimation): String {
    return buildJsonObjectString {
        put(key = "@type", string = "removeSavedAnimation")
        put(key = "@extra", long = requestId)
        put(key = "animation", value = function.animation) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: RemoveSavedNotificationSound): String {
    return buildJsonObjectString {
        put(key = "@type", string = "removeSavedNotificationSound")
        put(key = "@extra", long = requestId)
        put(key = "notification_sound_id", long = function.notificationSoundId)
    }
}

private fun serialize(requestId: Long, function: RemoveSearchedForTag): String {
    return buildJsonObjectString {
        put(key = "@type", string = "removeSearchedForTag")
        put(key = "@extra", long = requestId)
        put(key = "tag", string = function.tag)
    }
}

private fun serialize(requestId: Long, function: RemoveStickerFromSet): String {
    return buildJsonObjectString {
        put(key = "@type", string = "removeStickerFromSet")
        put(key = "@extra", long = requestId)
        put(key = "sticker", value = function.sticker) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: RemoveStoryAlbumStories): String {
    return buildJsonObjectString {
        put(key = "@type", string = "removeStoryAlbumStories")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "story_album_id", int = function.storyAlbumId)
        put(key = "story_ids", ints = function.storyIds)
    }
}

private fun serialize(requestId: Long, function: RemoveTextCompositionStyle): String {
    return buildJsonObjectString {
        put(key = "@type", string = "removeTextCompositionStyle")
        put(key = "@extra", long = requestId)
        put(key = "name", string = function.name)
    }
}

private fun serialize(requestId: Long, function: RemoveTopChat): String {
    return buildJsonObjectString {
        put(key = "@type", string = "removeTopChat")
        put(key = "@extra", long = requestId)
        put(key = "category", value = function.category) { data -> serialize(dto = data) }
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: RemoveWebBrowserSettingsException): String {
    return buildJsonObjectString {
        put(key = "@type", string = "removeWebBrowserSettingsException")
        put(key = "@extra", long = requestId)
        put(key = "url", string = function.url)
    }
}

private fun serialize(requestId: Long, function: ReorderActiveUsernames): String {
    return buildJsonObjectString {
        put(key = "@type", string = "reorderActiveUsernames")
        put(key = "@extra", long = requestId)
        put(key = "usernames", strings = function.usernames)
    }
}

private fun serialize(requestId: Long, function: ReorderBotActiveUsernames): String {
    return buildJsonObjectString {
        put(key = "@type", string = "reorderBotActiveUsernames")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "usernames", strings = function.usernames)
    }
}

private fun serialize(requestId: Long, function: ReorderBotMediaPreviews): String {
    return buildJsonObjectString {
        put(key = "@type", string = "reorderBotMediaPreviews")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "language_code", string = function.languageCode)
        put(key = "file_ids", ints = function.fileIds)
    }
}

private fun serialize(requestId: Long, function: ReorderChatFolders): String {
    return buildJsonObjectString {
        put(key = "@type", string = "reorderChatFolders")
        put(key = "@extra", long = requestId)
        put(key = "chat_folder_ids", ints = function.chatFolderIds)
        put(key = "main_chat_list_position", int = function.mainChatListPosition)
    }
}

private fun serialize(requestId: Long, function: ReorderGiftCollectionGifts): String {
    return buildJsonObjectString {
        put(key = "@type", string = "reorderGiftCollectionGifts")
        put(key = "@extra", long = requestId)
        put(key = "owner_id", value = function.ownerId) { data -> serialize(dto = data) }
        put(key = "collection_id", int = function.collectionId)
        put(key = "received_gift_ids", strings = function.receivedGiftIds)
    }
}

private fun serialize(requestId: Long, function: ReorderGiftCollections): String {
    return buildJsonObjectString {
        put(key = "@type", string = "reorderGiftCollections")
        put(key = "@extra", long = requestId)
        put(key = "owner_id", value = function.ownerId) { data -> serialize(dto = data) }
        put(key = "collection_ids", ints = function.collectionIds)
    }
}

private fun serialize(requestId: Long, function: ReorderInstalledStickerSets): String {
    return buildJsonObjectString {
        put(key = "@type", string = "reorderInstalledStickerSets")
        put(key = "@extra", long = requestId)
        put(key = "sticker_type", value = function.stickerType) { data -> serialize(dto = data) }
        put(key = "sticker_set_ids", longs = function.stickerSetIds)
    }
}

private fun serialize(requestId: Long, function: ReorderQuickReplyShortcuts): String {
    return buildJsonObjectString {
        put(key = "@type", string = "reorderQuickReplyShortcuts")
        put(key = "@extra", long = requestId)
        put(key = "shortcut_ids", ints = function.shortcutIds)
    }
}

private fun serialize(requestId: Long, function: ReorderStoryAlbumStories): String {
    return buildJsonObjectString {
        put(key = "@type", string = "reorderStoryAlbumStories")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "story_album_id", int = function.storyAlbumId)
        put(key = "story_ids", ints = function.storyIds)
    }
}

private fun serialize(requestId: Long, function: ReorderStoryAlbums): String {
    return buildJsonObjectString {
        put(key = "@type", string = "reorderStoryAlbums")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "story_album_ids", ints = function.storyAlbumIds)
    }
}

private fun serialize(requestId: Long, function: ReorderSupergroupActiveUsernames): String {
    return buildJsonObjectString {
        put(key = "@type", string = "reorderSupergroupActiveUsernames")
        put(key = "@extra", long = requestId)
        put(key = "supergroup_id", long = function.supergroupId)
        put(key = "usernames", strings = function.usernames)
    }
}

private fun serialize(requestId: Long, function: ReplaceLiveStoryRtmpUrl): String {
    return buildJsonObjectString {
        put(key = "@type", string = "replaceLiveStoryRtmpUrl")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: ReplacePrimaryChatInviteLink): String {
    return buildJsonObjectString {
        put(key = "@type", string = "replacePrimaryChatInviteLink")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: ReplaceStickerInSet): String {
    return buildJsonObjectString {
        put(key = "@type", string = "replaceStickerInSet")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
        put(key = "name", string = function.name)
        put(key = "old_sticker", value = function.oldSticker) { data -> serialize(dto = data) }
        put(key = "new_sticker", value = function.newSticker) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: ReplaceVideoChatRtmpUrl): String {
    return buildJsonObjectString {
        put(key = "@type", string = "replaceVideoChatRtmpUrl")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: ReportAuthenticationCodeMissing): String {
    return buildJsonObjectString {
        put(key = "@type", string = "reportAuthenticationCodeMissing")
        put(key = "@extra", long = requestId)
        put(key = "mobile_network_code", string = function.mobileNetworkCode)
    }
}

private fun serialize(requestId: Long, function: ReportChat): String {
    return buildJsonObjectString {
        put(key = "@type", string = "reportChat")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "option_id", bytes = function.optionId)
        put(key = "message_ids", longs = function.messageIds)
        put(key = "text", string = function.text)
    }
}

private fun serialize(requestId: Long, function: ReportChatPhoto): String {
    return buildJsonObjectString {
        put(key = "@type", string = "reportChatPhoto")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "file_id", int = function.fileId)
        put(key = "reason", value = function.reason) { data -> serialize(dto = data) }
        put(key = "text", string = function.text)
    }
}

private fun serialize(requestId: Long, function: ReportChatSponsoredMessage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "reportChatSponsoredMessage")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "option_id", bytes = function.optionId)
    }
}

private fun serialize(requestId: Long, function: ReportMessageReactions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "reportMessageReactions")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "sender_id", value = function.senderId) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: ReportPhoneNumberCodeMissing): String {
    return buildJsonObjectString {
        put(key = "@type", string = "reportPhoneNumberCodeMissing")
        put(key = "@extra", long = requestId)
        put(key = "mobile_network_code", string = function.mobileNetworkCode)
    }
}

private fun serialize(requestId: Long, function: ReportSponsoredChat): String {
    return buildJsonObjectString {
        put(key = "@type", string = "reportSponsoredChat")
        put(key = "@extra", long = requestId)
        put(key = "sponsored_chat_unique_id", long = function.sponsoredChatUniqueId)
        put(key = "option_id", bytes = function.optionId)
    }
}

private fun serialize(requestId: Long, function: ReportStory): String {
    return buildJsonObjectString {
        put(key = "@type", string = "reportStory")
        put(key = "@extra", long = requestId)
        put(key = "story_poster_chat_id", long = function.storyPosterChatId)
        put(key = "story_id", int = function.storyId)
        put(key = "option_id", bytes = function.optionId)
        put(key = "text", string = function.text)
    }
}

private fun serialize(requestId: Long, function: ReportSupergroupAntiSpamFalsePositive): String {
    return buildJsonObjectString {
        put(key = "@type", string = "reportSupergroupAntiSpamFalsePositive")
        put(key = "@extra", long = requestId)
        put(key = "supergroup_id", long = function.supergroupId)
        put(key = "message_id", long = function.messageId)
    }
}

private fun serialize(requestId: Long, function: ReportSupergroupSpam): String {
    return buildJsonObjectString {
        put(key = "@type", string = "reportSupergroupSpam")
        put(key = "@extra", long = requestId)
        put(key = "supergroup_id", long = function.supergroupId)
        put(key = "message_ids", longs = function.messageIds)
    }
}

private fun serialize(requestId: Long, function: ReportVideoMessageAdvertisement): String {
    return buildJsonObjectString {
        put(key = "@type", string = "reportVideoMessageAdvertisement")
        put(key = "@extra", long = requestId)
        put(key = "advertisement_unique_id", long = function.advertisementUniqueId)
        put(key = "option_id", bytes = function.optionId)
    }
}

private fun serialize(requestId: Long, function: RequestAuthenticationPasswordRecovery): String {
    return buildJsonObjectString {
        put(key = "@type", string = "requestAuthenticationPasswordRecovery")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: RequestPasswordRecovery): String {
    return buildJsonObjectString {
        put(key = "@type", string = "requestPasswordRecovery")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: RequestQrCodeAuthentication): String {
    return buildJsonObjectString {
        put(key = "@type", string = "requestQrCodeAuthentication")
        put(key = "@extra", long = requestId)
        put(key = "other_user_ids", longs = function.otherUserIds)
    }
}

private fun serialize(requestId: Long, function: ResendAuthenticationCode): String {
    return buildJsonObjectString {
        put(key = "@type", string = "resendAuthenticationCode")
        put(key = "@extra", long = requestId)
        put(key = "reason", value = function.reason) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: ResendEmailAddressVerificationCode): String {
    return buildJsonObjectString {
        put(key = "@type", string = "resendEmailAddressVerificationCode")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: ResendLoginEmailAddressCode): String {
    return buildJsonObjectString {
        put(key = "@type", string = "resendLoginEmailAddressCode")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: ResendMessages): String {
    return buildJsonObjectString {
        put(key = "@type", string = "resendMessages")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_ids", longs = function.messageIds)
        put(key = "quote", value = function.quote) { data -> serialize(dto = data) }
        put(key = "paid_message_star_count", long = function.paidMessageStarCount)
    }
}

private fun serialize(requestId: Long, function: ResendPhoneNumberCode): String {
    return buildJsonObjectString {
        put(key = "@type", string = "resendPhoneNumberCode")
        put(key = "@extra", long = requestId)
        put(key = "reason", value = function.reason) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: ResendRecoveryEmailAddressCode): String {
    return buildJsonObjectString {
        put(key = "@type", string = "resendRecoveryEmailAddressCode")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: ResetAllNotificationSettings): String {
    return buildJsonObjectString {
        put(key = "@type", string = "resetAllNotificationSettings")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: ResetAuthenticationEmailAddress): String {
    return buildJsonObjectString {
        put(key = "@type", string = "resetAuthenticationEmailAddress")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: ResetInstalledBackgrounds): String {
    return buildJsonObjectString {
        put(key = "@type", string = "resetInstalledBackgrounds")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: ResetNetworkStatistics): String {
    return buildJsonObjectString {
        put(key = "@type", string = "resetNetworkStatistics")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: ResetPassword): String {
    return buildJsonObjectString {
        put(key = "@type", string = "resetPassword")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: ReuseStarSubscription): String {
    return buildJsonObjectString {
        put(key = "@type", string = "reuseStarSubscription")
        put(key = "@extra", long = requestId)
        put(key = "subscription_id", string = function.subscriptionId)
    }
}

private fun serialize(requestId: Long, function: RevokeChatInviteLink): String {
    return buildJsonObjectString {
        put(key = "@type", string = "revokeChatInviteLink")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "invite_link", string = function.inviteLink)
    }
}

private fun serialize(requestId: Long, function: RevokeGroupCallInviteLink): String {
    return buildJsonObjectString {
        put(key = "@type", string = "revokeGroupCallInviteLink")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
    }
}

private fun serialize(requestId: Long, function: SaveApplicationLogEvent): String {
    return buildJsonObjectString {
        put(key = "@type", string = "saveApplicationLogEvent")
        put(key = "@extra", long = requestId)
        put(key = "type", string = function.type)
        put(key = "chat_id", long = function.chatId)
        put(key = "data", value = function.data) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SavePreparedInlineMessage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "savePreparedInlineMessage")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
        put(key = "result", value = function.result) { data -> serialize(dto = data) }
        put(key = "chat_types", value = function.chatTypes) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SavePreparedKeyboardButton): String {
    return buildJsonObjectString {
        put(key = "@type", string = "savePreparedKeyboardButton")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
        put(key = "button", value = function.button) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SearchAffiliatePrograms): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchAffiliatePrograms")
        put(key = "@extra", long = requestId)
        put(key = "affiliate", value = function.affiliate) { data -> serialize(dto = data) }
        put(key = "sort_order", value = function.sortOrder) { data -> serialize(dto = data) }
        put(key = "offset", string = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: SearchBackground): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchBackground")
        put(key = "@extra", long = requestId)
        put(key = "name", string = function.name)
    }
}

private fun serialize(requestId: Long, function: SearchCallMessages): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchCallMessages")
        put(key = "@extra", long = requestId)
        put(key = "offset", string = function.offset)
        put(key = "limit", int = function.limit)
        put(key = "only_missed", boolean = function.onlyMissed)
    }
}

private fun serialize(requestId: Long, function: SearchChatAffiliateProgram): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchChatAffiliateProgram")
        put(key = "@extra", long = requestId)
        put(key = "username", string = function.username)
        put(key = "referrer", string = function.referrer)
    }
}

private fun serialize(requestId: Long, function: SearchChatMembers): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchChatMembers")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "query", string = function.query)
        put(key = "limit", int = function.limit)
        put(key = "filter", value = function.filter) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SearchChatMessages): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchChatMessages")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "topic_id", value = function.topicId) { data -> serialize(dto = data) }
        put(key = "query", string = function.query)
        put(key = "sender_id", value = function.senderId) { data -> serialize(dto = data) }
        put(key = "from_message_id", long = function.fromMessageId)
        put(key = "offset", int = function.offset)
        put(key = "limit", int = function.limit)
        put(key = "filter", value = function.filter) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SearchChatRecentLocationMessages): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchChatRecentLocationMessages")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: SearchChats): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchChats")
        put(key = "@extra", long = requestId)
        put(key = "query", string = function.query)
        put(key = "type_filter", value = function.typeFilter) { data -> serialize(dto = data) }
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: SearchChatsOnServer): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchChatsOnServer")
        put(key = "@extra", long = requestId)
        put(key = "query", string = function.query)
        put(key = "type_filter", value = function.typeFilter) { data -> serialize(dto = data) }
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: SearchContacts): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchContacts")
        put(key = "@extra", long = requestId)
        put(key = "query", string = function.query)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: SearchEmojis): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchEmojis")
        put(key = "@extra", long = requestId)
        put(key = "text", string = function.text)
        put(key = "input_language_codes", strings = function.inputLanguageCodes)
    }
}

private fun serialize(requestId: Long, function: SearchFileDownloads): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchFileDownloads")
        put(key = "@extra", long = requestId)
        put(key = "query", string = function.query)
        put(key = "only_active", boolean = function.onlyActive)
        put(key = "only_completed", boolean = function.onlyCompleted)
        put(key = "offset", string = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: SearchGiftsForResale): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchGiftsForResale")
        put(key = "@extra", long = requestId)
        put(key = "gift_id", long = function.giftId)
        put(key = "order", value = function.order) { data -> serialize(dto = data) }
        put(key = "for_crafting", boolean = function.forCrafting)
        put(key = "for_stars", boolean = function.forStars)
        put(key = "attributes", objects = function.attributes) { data -> serialize(dto = data) }
        put(key = "offset", string = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: SearchHashtags): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchHashtags")
        put(key = "@extra", long = requestId)
        put(key = "prefix", string = function.prefix)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: SearchInstalledStickerSets): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchInstalledStickerSets")
        put(key = "@extra", long = requestId)
        put(key = "sticker_type", value = function.stickerType) { data -> serialize(dto = data) }
        put(key = "query", string = function.query)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: SearchMessages): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchMessages")
        put(key = "@extra", long = requestId)
        put(key = "chat_list", value = function.chatList) { data -> serialize(dto = data) }
        put(key = "query", string = function.query)
        put(key = "offset", string = function.offset)
        put(key = "limit", int = function.limit)
        put(key = "filter", value = function.filter) { data -> serialize(dto = data) }
        put(key = "chat_type_filter", value = function.chatTypeFilter) { data -> serialize(dto = data) }
        put(key = "min_date", int = function.minDate)
        put(key = "max_date", int = function.maxDate)
    }
}

private fun serialize(requestId: Long, function: SearchOutgoingDocumentMessages): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchOutgoingDocumentMessages")
        put(key = "@extra", long = requestId)
        put(key = "query", string = function.query)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: SearchPublicChat): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchPublicChat")
        put(key = "@extra", long = requestId)
        put(key = "username", string = function.username)
    }
}

private fun serialize(requestId: Long, function: SearchPublicChats): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchPublicChats")
        put(key = "@extra", long = requestId)
        put(key = "query", string = function.query)
        put(key = "type_filter", value = function.typeFilter) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SearchPublicMessagesByTag): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchPublicMessagesByTag")
        put(key = "@extra", long = requestId)
        put(key = "tag", string = function.tag)
        put(key = "offset", string = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: SearchPublicPosts): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchPublicPosts")
        put(key = "@extra", long = requestId)
        put(key = "query", string = function.query)
        put(key = "offset", string = function.offset)
        put(key = "limit", int = function.limit)
        put(key = "star_count", long = function.starCount)
    }
}

private fun serialize(requestId: Long, function: SearchPublicStoriesByLocation): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchPublicStoriesByLocation")
        put(key = "@extra", long = requestId)
        put(key = "address", value = function.address) { data -> serialize(dto = data) }
        put(key = "offset", string = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: SearchPublicStoriesByTag): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchPublicStoriesByTag")
        put(key = "@extra", long = requestId)
        put(key = "story_poster_chat_id", long = function.storyPosterChatId)
        put(key = "tag", string = function.tag)
        put(key = "offset", string = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: SearchPublicStoriesByVenue): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchPublicStoriesByVenue")
        put(key = "@extra", long = requestId)
        put(key = "venue_provider", string = function.venueProvider)
        put(key = "venue_id", string = function.venueId)
        put(key = "offset", string = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: SearchQuote): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchQuote")
        put(key = "@extra", long = requestId)
        put(key = "text", value = function.text) { data -> serialize(dto = data) }
        put(key = "quote", value = function.quote) { data -> serialize(dto = data) }
        put(key = "quote_position", int = function.quotePosition)
    }
}

private fun serialize(requestId: Long, function: SearchRecentlyFoundChats): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchRecentlyFoundChats")
        put(key = "@extra", long = requestId)
        put(key = "query", string = function.query)
        put(key = "type_filter", value = function.typeFilter) { data -> serialize(dto = data) }
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: SearchSavedMessages): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchSavedMessages")
        put(key = "@extra", long = requestId)
        put(key = "saved_messages_topic_id", long = function.savedMessagesTopicId)
        put(key = "tag", value = function.tag) { data -> serialize(dto = data) }
        put(key = "query", string = function.query)
        put(key = "from_message_id", long = function.fromMessageId)
        put(key = "offset", int = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: SearchSecretMessages): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchSecretMessages")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "query", string = function.query)
        put(key = "offset", string = function.offset)
        put(key = "limit", int = function.limit)
        put(key = "filter", value = function.filter) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SearchStickerSet): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchStickerSet")
        put(key = "@extra", long = requestId)
        put(key = "name", string = function.name)
        put(key = "ignore_cache", boolean = function.ignoreCache)
    }
}

private fun serialize(requestId: Long, function: SearchStickerSets): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchStickerSets")
        put(key = "@extra", long = requestId)
        put(key = "sticker_type", value = function.stickerType) { data -> serialize(dto = data) }
        put(key = "query", string = function.query)
    }
}

private fun serialize(requestId: Long, function: SearchStickers): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchStickers")
        put(key = "@extra", long = requestId)
        put(key = "sticker_type", value = function.stickerType) { data -> serialize(dto = data) }
        put(key = "emojis", string = function.emojis)
        put(key = "query", string = function.query)
        put(key = "input_language_codes", strings = function.inputLanguageCodes)
        put(key = "offset", int = function.offset)
        put(key = "limit", int = function.limit)
    }
}

private fun serialize(requestId: Long, function: SearchStringsByPrefix): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchStringsByPrefix")
        put(key = "@extra", long = requestId)
        put(key = "strings", strings = function.strings)
        put(key = "query", string = function.query)
        put(key = "limit", int = function.limit)
        put(key = "return_none_for_empty_query", boolean = function.returnNoneForEmptyQuery)
    }
}

private fun serialize(requestId: Long, function: SearchTextCompositionStyle): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchTextCompositionStyle")
        put(key = "@extra", long = requestId)
        put(key = "name", string = function.name)
    }
}

private fun serialize(requestId: Long, function: SearchUserByPhoneNumber): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchUserByPhoneNumber")
        put(key = "@extra", long = requestId)
        put(key = "phone_number", string = function.phoneNumber)
        put(key = "only_local", boolean = function.onlyLocal)
    }
}

private fun serialize(requestId: Long, function: SearchUserByToken): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchUserByToken")
        put(key = "@extra", long = requestId)
        put(key = "token", string = function.token)
    }
}

private fun serialize(requestId: Long, function: SearchWebApp): String {
    return buildJsonObjectString {
        put(key = "@type", string = "searchWebApp")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "web_app_short_name", string = function.webAppShortName)
    }
}

private fun serialize(requestId: Long, function: SellGift): String {
    return buildJsonObjectString {
        put(key = "@type", string = "sellGift")
        put(key = "@extra", long = requestId)
        put(key = "business_connection_id", string = function.businessConnectionId)
        put(key = "received_gift_id", string = function.receivedGiftId)
    }
}

private fun serialize(requestId: Long, function: SendAuthenticationFirebaseSms): String {
    return buildJsonObjectString {
        put(key = "@type", string = "sendAuthenticationFirebaseSms")
        put(key = "@extra", long = requestId)
        put(key = "token", string = function.token)
    }
}

private fun serialize(requestId: Long, function: SendBotStartMessage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "sendBotStartMessage")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "chat_id", long = function.chatId)
        put(key = "parameter", string = function.parameter)
    }
}

private fun serialize(requestId: Long, function: SendBusinessMessage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "sendBusinessMessage")
        put(key = "@extra", long = requestId)
        put(key = "business_connection_id", string = function.businessConnectionId)
        put(key = "chat_id", long = function.chatId)
        put(key = "reply_to", value = function.replyTo) { data -> serialize(dto = data) }
        put(key = "disable_notification", boolean = function.disableNotification)
        put(key = "protect_content", boolean = function.protectContent)
        put(key = "effect_id", long = function.effectId)
        put(key = "reply_markup", value = function.replyMarkup) { data -> serialize(dto = data) }
        put(key = "input_message_content", value = function.inputMessageContent) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SendBusinessMessageAlbum): String {
    return buildJsonObjectString {
        put(key = "@type", string = "sendBusinessMessageAlbum")
        put(key = "@extra", long = requestId)
        put(key = "business_connection_id", string = function.businessConnectionId)
        put(key = "chat_id", long = function.chatId)
        put(key = "reply_to", value = function.replyTo) { data -> serialize(dto = data) }
        put(key = "disable_notification", boolean = function.disableNotification)
        put(key = "protect_content", boolean = function.protectContent)
        put(key = "effect_id", long = function.effectId)
        put(key = "input_message_contents", objects = function.inputMessageContents) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SendCallDebugInformation): String {
    return buildJsonObjectString {
        put(key = "@type", string = "sendCallDebugInformation")
        put(key = "@extra", long = requestId)
        put(key = "call_id", value = function.callId) { data -> serialize(dto = data) }
        put(key = "debug_information", string = function.debugInformation)
    }
}

private fun serialize(requestId: Long, function: SendCallLog): String {
    return buildJsonObjectString {
        put(key = "@type", string = "sendCallLog")
        put(key = "@extra", long = requestId)
        put(key = "call_id", value = function.callId) { data -> serialize(dto = data) }
        put(key = "log_file", value = function.logFile) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SendCallRating): String {
    return buildJsonObjectString {
        put(key = "@type", string = "sendCallRating")
        put(key = "@extra", long = requestId)
        put(key = "call_id", value = function.callId) { data -> serialize(dto = data) }
        put(key = "rating", int = function.rating)
        put(key = "comment", string = function.comment)
        put(key = "problems", objects = function.problems) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SendCallSignalingData): String {
    return buildJsonObjectString {
        put(key = "@type", string = "sendCallSignalingData")
        put(key = "@extra", long = requestId)
        put(key = "call_id", int = function.callId)
        put(key = "data", bytes = function.data)
    }
}

private fun serialize(requestId: Long, function: SendChatAction): String {
    return buildJsonObjectString {
        put(key = "@type", string = "sendChatAction")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "topic_id", value = function.topicId) { data -> serialize(dto = data) }
        put(key = "business_connection_id", string = function.businessConnectionId)
        put(key = "action", value = function.action) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SendCustomRequest): String {
    return buildJsonObjectString {
        put(key = "@type", string = "sendCustomRequest")
        put(key = "@extra", long = requestId)
        put(key = "method", string = function.method)
        put(key = "parameters", string = function.parameters)
    }
}

private fun serialize(requestId: Long, function: SendEmailAddressVerificationCode): String {
    return buildJsonObjectString {
        put(key = "@type", string = "sendEmailAddressVerificationCode")
        put(key = "@extra", long = requestId)
        put(key = "email_address", string = function.emailAddress)
    }
}

private fun serialize(requestId: Long, function: SendEphemeralMessage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "sendEphemeralMessage")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "topic_id", value = function.topicId) { data -> serialize(dto = data) }
        put(key = "receiver_user_id", long = function.receiverUserId)
        put(key = "callback_query_id", long = function.callbackQueryId)
        put(key = "reply_to", value = function.replyTo) { data -> serialize(dto = data) }
        put(key = "sending_id", int = function.sendingId)
        put(key = "only_preview", boolean = function.onlyPreview)
        put(key = "reply_markup", value = function.replyMarkup) { data -> serialize(dto = data) }
        put(key = "input_message_content", value = function.inputMessageContent) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SendGift): String {
    return buildJsonObjectString {
        put(key = "@type", string = "sendGift")
        put(key = "@extra", long = requestId)
        put(key = "gift_id", long = function.giftId)
        put(key = "owner_id", value = function.ownerId) { data -> serialize(dto = data) }
        put(key = "text", value = function.text) { data -> serialize(dto = data) }
        put(key = "is_private", boolean = function.isPrivate)
        put(key = "pay_for_upgrade", boolean = function.payForUpgrade)
    }
}

private fun serialize(requestId: Long, function: SendGiftPurchaseOffer): String {
    return buildJsonObjectString {
        put(key = "@type", string = "sendGiftPurchaseOffer")
        put(key = "@extra", long = requestId)
        put(key = "owner_id", value = function.ownerId) { data -> serialize(dto = data) }
        put(key = "gift_name", string = function.giftName)
        put(key = "price", value = function.price) { data -> serialize(dto = data) }
        put(key = "duration", int = function.duration)
        put(key = "paid_message_star_count", long = function.paidMessageStarCount)
    }
}

private fun serialize(requestId: Long, function: SendGroupCallMessage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "sendGroupCallMessage")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
        put(key = "text", value = function.text) { data -> serialize(dto = data) }
        put(key = "paid_message_star_count", long = function.paidMessageStarCount)
    }
}

private fun serialize(requestId: Long, function: SendInlineQueryResultMessage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "sendInlineQueryResultMessage")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "topic_id", value = function.topicId) { data -> serialize(dto = data) }
        put(key = "reply_to", value = function.replyTo) { data -> serialize(dto = data) }
        put(key = "options", value = function.options) { data -> serialize(dto = data) }
        put(key = "query_id", long = function.queryId)
        put(key = "result_id", string = function.resultId)
        put(key = "hide_via_bot", boolean = function.hideViaBot)
    }
}

private fun serialize(requestId: Long, function: SendMessage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "sendMessage")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "topic_id", value = function.topicId) { data -> serialize(dto = data) }
        put(key = "reply_to", value = function.replyTo) { data -> serialize(dto = data) }
        put(key = "options", value = function.options) { data -> serialize(dto = data) }
        put(key = "reply_markup", value = function.replyMarkup) { data -> serialize(dto = data) }
        put(key = "input_message_content", value = function.inputMessageContent) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SendMessageAlbum): String {
    return buildJsonObjectString {
        put(key = "@type", string = "sendMessageAlbum")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "topic_id", value = function.topicId) { data -> serialize(dto = data) }
        put(key = "reply_to", value = function.replyTo) { data -> serialize(dto = data) }
        put(key = "options", value = function.options) { data -> serialize(dto = data) }
        put(key = "input_message_contents", objects = function.inputMessageContents) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SendMessageViewMetrics): String {
    return buildJsonObjectString {
        put(key = "@type", string = "sendMessageViewMetrics")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "time_in_view_ms", int = function.timeInViewMs)
        put(key = "active_time_in_view_ms", int = function.activeTimeInViewMs)
        put(key = "height_to_viewport_ratio_per_mille", int = function.heightToViewportRatioPerMille)
        put(key = "seen_range_ratio_per_mille", int = function.seenRangeRatioPerMille)
    }
}

private fun serialize(requestId: Long, function: SendPassportAuthorizationForm): String {
    return buildJsonObjectString {
        put(key = "@type", string = "sendPassportAuthorizationForm")
        put(key = "@extra", long = requestId)
        put(key = "authorization_form_id", int = function.authorizationFormId)
        put(key = "types", objects = function.types) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SendPaymentForm): String {
    return buildJsonObjectString {
        put(key = "@type", string = "sendPaymentForm")
        put(key = "@extra", long = requestId)
        put(key = "input_invoice", value = function.inputInvoice) { data -> serialize(dto = data) }
        put(key = "payment_form_id", long = function.paymentFormId)
        put(key = "order_info_id", string = function.orderInfoId)
        put(key = "shipping_option_id", string = function.shippingOptionId)
        put(key = "credentials", value = function.credentials) { data -> serialize(dto = data) }
        put(key = "tip_amount", long = function.tipAmount)
    }
}

private fun serialize(requestId: Long, function: SendPhoneNumberCode): String {
    return buildJsonObjectString {
        put(key = "@type", string = "sendPhoneNumberCode")
        put(key = "@extra", long = requestId)
        put(key = "phone_number", string = function.phoneNumber)
        put(key = "settings", value = function.settings) { data -> serialize(dto = data) }
        put(key = "type", value = function.type) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SendPhoneNumberFirebaseSms): String {
    return buildJsonObjectString {
        put(key = "@type", string = "sendPhoneNumberFirebaseSms")
        put(key = "@extra", long = requestId)
        put(key = "token", string = function.token)
    }
}

private fun serialize(requestId: Long, function: SendQuickReplyShortcutMessages): String {
    return buildJsonObjectString {
        put(key = "@type", string = "sendQuickReplyShortcutMessages")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "shortcut_id", int = function.shortcutId)
        put(key = "sending_id", int = function.sendingId)
    }
}

private fun serialize(requestId: Long, function: SendResoldGift): String {
    return buildJsonObjectString {
        put(key = "@type", string = "sendResoldGift")
        put(key = "@extra", long = requestId)
        put(key = "gift_name", string = function.giftName)
        put(key = "owner_id", value = function.ownerId) { data -> serialize(dto = data) }
        put(key = "price", value = function.price) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SendRichMessageDraft): String {
    return buildJsonObjectString {
        put(key = "@type", string = "sendRichMessageDraft")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "forum_topic_id", int = function.forumTopicId)
        put(key = "draft_id", long = function.draftId)
        put(key = "message", value = function.message) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SendTextMessageDraft): String {
    return buildJsonObjectString {
        put(key = "@type", string = "sendTextMessageDraft")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "forum_topic_id", int = function.forumTopicId)
        put(key = "draft_id", long = function.draftId)
        put(key = "text", value = function.text) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SendWebAppCustomRequest): String {
    return buildJsonObjectString {
        put(key = "@type", string = "sendWebAppCustomRequest")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "method", string = function.method)
        put(key = "parameters", string = function.parameters)
    }
}

private fun serialize(requestId: Long, function: SendWebAppData): String {
    return buildJsonObjectString {
        put(key = "@type", string = "sendWebAppData")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "button_text", string = function.buttonText)
        put(key = "data", string = function.data)
    }
}

private fun serialize(requestId: Long, function: SetAccentColor): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setAccentColor")
        put(key = "@extra", long = requestId)
        put(key = "accent_color_id", int = function.accentColorId)
        put(key = "background_custom_emoji_id", long = function.backgroundCustomEmojiId)
    }
}

private fun serialize(requestId: Long, function: SetAccountTtl): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setAccountTtl")
        put(key = "@extra", long = requestId)
        put(key = "ttl", value = function.ttl) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetAlarm): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setAlarm")
        put(key = "@extra", long = requestId)
        put(key = "seconds", double = function.seconds)
    }
}

private fun serialize(requestId: Long, function: SetApplicationVerificationToken): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setApplicationVerificationToken")
        put(key = "@extra", long = requestId)
        put(key = "verification_id", long = function.verificationId)
        put(key = "token", string = function.token)
    }
}

private fun serialize(requestId: Long, function: SetArchiveChatListSettings): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setArchiveChatListSettings")
        put(key = "@extra", long = requestId)
        put(key = "settings", value = function.settings) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetAuthenticationEmailAddress): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setAuthenticationEmailAddress")
        put(key = "@extra", long = requestId)
        put(key = "email_address", string = function.emailAddress)
    }
}

private fun serialize(requestId: Long, function: SetAuthenticationPhoneNumber): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setAuthenticationPhoneNumber")
        put(key = "@extra", long = requestId)
        put(key = "phone_number", string = function.phoneNumber)
        put(key = "settings", value = function.settings) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetAuthenticationPremiumPurchaseTransaction): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setAuthenticationPremiumPurchaseTransaction")
        put(key = "@extra", long = requestId)
        put(key = "transaction", value = function.transaction) { data -> serialize(dto = data) }
        put(key = "is_restore", boolean = function.isRestore)
        put(key = "premium_day_count", int = function.premiumDayCount)
        put(key = "currency", string = function.currency)
        put(key = "amount", long = function.amount)
    }
}

private fun serialize(requestId: Long, function: SetAutoDownloadSettings): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setAutoDownloadSettings")
        put(key = "@extra", long = requestId)
        put(key = "settings", value = function.settings) { data -> serialize(dto = data) }
        put(key = "type", value = function.type) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetAutosaveSettings): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setAutosaveSettings")
        put(key = "@extra", long = requestId)
        put(key = "scope", value = function.scope) { data -> serialize(dto = data) }
        put(key = "settings", value = function.settings) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetBio): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setBio")
        put(key = "@extra", long = requestId)
        put(key = "bio", string = function.bio)
    }
}

private fun serialize(requestId: Long, function: SetBirthdate): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setBirthdate")
        put(key = "@extra", long = requestId)
        put(key = "birthdate", value = function.birthdate) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetBotInfoDescription): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setBotInfoDescription")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "language_code", string = function.languageCode)
        put(key = "description", string = function.description)
    }
}

private fun serialize(requestId: Long, function: SetBotInfoShortDescription): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setBotInfoShortDescription")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "language_code", string = function.languageCode)
        put(key = "short_description", string = function.shortDescription)
    }
}

private fun serialize(requestId: Long, function: SetBotName): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setBotName")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "language_code", string = function.languageCode)
        put(key = "name", string = function.name)
    }
}

private fun serialize(requestId: Long, function: SetBotProfilePhoto): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setBotProfilePhoto")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "photo", value = function.photo) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetBotUpdatesStatus): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setBotUpdatesStatus")
        put(key = "@extra", long = requestId)
        put(key = "pending_update_count", int = function.pendingUpdateCount)
        put(key = "error_message", string = function.errorMessage)
    }
}

private fun serialize(requestId: Long, function: SetBusinessAccountBio): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setBusinessAccountBio")
        put(key = "@extra", long = requestId)
        put(key = "business_connection_id", string = function.businessConnectionId)
        put(key = "bio", string = function.bio)
    }
}

private fun serialize(requestId: Long, function: SetBusinessAccountGiftSettings): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setBusinessAccountGiftSettings")
        put(key = "@extra", long = requestId)
        put(key = "business_connection_id", string = function.businessConnectionId)
        put(key = "settings", value = function.settings) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetBusinessAccountName): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setBusinessAccountName")
        put(key = "@extra", long = requestId)
        put(key = "business_connection_id", string = function.businessConnectionId)
        put(key = "first_name", string = function.firstName)
        put(key = "last_name", string = function.lastName)
    }
}

private fun serialize(requestId: Long, function: SetBusinessAccountProfilePhoto): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setBusinessAccountProfilePhoto")
        put(key = "@extra", long = requestId)
        put(key = "business_connection_id", string = function.businessConnectionId)
        put(key = "photo", value = function.photo) { data -> serialize(dto = data) }
        put(key = "is_public", boolean = function.isPublic)
    }
}

private fun serialize(requestId: Long, function: SetBusinessAccountUsername): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setBusinessAccountUsername")
        put(key = "@extra", long = requestId)
        put(key = "business_connection_id", string = function.businessConnectionId)
        put(key = "username", string = function.username)
    }
}

private fun serialize(requestId: Long, function: SetBusinessAwayMessageSettings): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setBusinessAwayMessageSettings")
        put(key = "@extra", long = requestId)
        put(key = "away_message_settings", value = function.awayMessageSettings) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetBusinessConnectedBot): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setBusinessConnectedBot")
        put(key = "@extra", long = requestId)
        put(key = "bot", value = function.bot) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetBusinessGreetingMessageSettings): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setBusinessGreetingMessageSettings")
        put(key = "@extra", long = requestId)
        put(key = "greeting_message_settings", value = function.greetingMessageSettings) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetBusinessLocation): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setBusinessLocation")
        put(key = "@extra", long = requestId)
        put(key = "location", value = function.location) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetBusinessMessageIsPinned): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setBusinessMessageIsPinned")
        put(key = "@extra", long = requestId)
        put(key = "business_connection_id", string = function.businessConnectionId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "is_pinned", boolean = function.isPinned)
    }
}

private fun serialize(requestId: Long, function: SetBusinessOpeningHours): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setBusinessOpeningHours")
        put(key = "@extra", long = requestId)
        put(key = "opening_hours", value = function.openingHours) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetBusinessStartPage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setBusinessStartPage")
        put(key = "@extra", long = requestId)
        put(key = "start_page", value = function.startPage) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetChatAccentColor): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setChatAccentColor")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "accent_color_id", int = function.accentColorId)
        put(key = "background_custom_emoji_id", long = function.backgroundCustomEmojiId)
    }
}

private fun serialize(requestId: Long, function: SetChatActiveStoriesList): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setChatActiveStoriesList")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "story_list", value = function.storyList) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetChatAffiliateProgram): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setChatAffiliateProgram")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "parameters", value = function.parameters) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetChatAvailableReactions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setChatAvailableReactions")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "available_reactions", value = function.availableReactions) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetChatBackground): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setChatBackground")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "background", value = function.background) { data -> serialize(dto = data) }
        put(key = "type", value = function.type) { data -> serialize(dto = data) }
        put(key = "dark_theme_dimming", int = function.darkThemeDimming)
        put(key = "only_for_self", boolean = function.onlyForSelf)
    }
}

private fun serialize(requestId: Long, function: SetChatClientData): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setChatClientData")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "client_data", string = function.clientData)
    }
}

private fun serialize(requestId: Long, function: SetChatDescription): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setChatDescription")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "description", string = function.description)
    }
}

private fun serialize(requestId: Long, function: SetChatDirectMessagesGroup): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setChatDirectMessagesGroup")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "is_enabled", boolean = function.isEnabled)
        put(key = "paid_message_star_count", long = function.paidMessageStarCount)
    }
}

private fun serialize(requestId: Long, function: SetChatDiscussionGroup): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setChatDiscussionGroup")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "discussion_chat_id", long = function.discussionChatId)
    }
}

private fun serialize(requestId: Long, function: SetChatDraftMessage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setChatDraftMessage")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "topic_id", value = function.topicId) { data -> serialize(dto = data) }
        put(key = "draft_message", value = function.draftMessage) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetChatEmojiStatus): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setChatEmojiStatus")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "emoji_status", value = function.emojiStatus) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetChatLocation): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setChatLocation")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "location", value = function.location) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetChatMemberStatus): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setChatMemberStatus")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "member_id", value = function.memberId) { data -> serialize(dto = data) }
        put(key = "status", value = function.status) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetChatMemberTag): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setChatMemberTag")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "user_id", long = function.userId)
        put(key = "tag", string = function.tag)
    }
}

private fun serialize(requestId: Long, function: SetChatMessageAutoDeleteTime): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setChatMessageAutoDeleteTime")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_auto_delete_time", int = function.messageAutoDeleteTime)
    }
}

private fun serialize(requestId: Long, function: SetChatMessageSender): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setChatMessageSender")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_sender_id", value = function.messageSenderId) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetChatNotificationSettings): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setChatNotificationSettings")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "notification_settings", value = function.notificationSettings) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetChatPaidMessageStarCount): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setChatPaidMessageStarCount")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "paid_message_star_count", long = function.paidMessageStarCount)
    }
}

private fun serialize(requestId: Long, function: SetChatPermissions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setChatPermissions")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "permissions", value = function.permissions) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetChatPhoto): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setChatPhoto")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "photo", value = function.photo) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetChatPinnedStories): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setChatPinnedStories")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "story_ids", ints = function.storyIds)
    }
}

private fun serialize(requestId: Long, function: SetChatProfileAccentColor): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setChatProfileAccentColor")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "profile_accent_color_id", int = function.profileAccentColorId)
        put(key = "profile_background_custom_emoji_id", long = function.profileBackgroundCustomEmojiId)
    }
}

private fun serialize(requestId: Long, function: SetChatSlowModeDelay): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setChatSlowModeDelay")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "slow_mode_delay", int = function.slowModeDelay)
    }
}

private fun serialize(requestId: Long, function: SetChatTheme): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setChatTheme")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "theme", value = function.theme) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetChatTitle): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setChatTitle")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "title", string = function.title)
    }
}

private fun serialize(requestId: Long, function: SetCloseFriends): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setCloseFriends")
        put(key = "@extra", long = requestId)
        put(key = "user_ids", longs = function.userIds)
    }
}

private fun serialize(requestId: Long, function: SetCommands): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setCommands")
        put(key = "@extra", long = requestId)
        put(key = "scope", value = function.scope) { data -> serialize(dto = data) }
        put(key = "language_code", string = function.languageCode)
        put(key = "commands", objects = function.commands) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetCustomEmojiStickerSetThumbnail): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setCustomEmojiStickerSetThumbnail")
        put(key = "@extra", long = requestId)
        put(key = "name", string = function.name)
        put(key = "custom_emoji_id", long = function.customEmojiId)
    }
}

private fun serialize(requestId: Long, function: SetCustomLanguagePack): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setCustomLanguagePack")
        put(key = "@extra", long = requestId)
        put(key = "info", value = function.info) { data -> serialize(dto = data) }
        put(key = "strings", objects = function.strings) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetCustomLanguagePackString): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setCustomLanguagePackString")
        put(key = "@extra", long = requestId)
        put(key = "language_pack_id", string = function.languagePackId)
        put(key = "new_string", value = function.newString) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetDatabaseEncryptionKey): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setDatabaseEncryptionKey")
        put(key = "@extra", long = requestId)
        put(key = "new_encryption_key", bytes = function.newEncryptionKey)
    }
}

private fun serialize(requestId: Long, function: SetDefaultBackground): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setDefaultBackground")
        put(key = "@extra", long = requestId)
        put(key = "background", value = function.background) { data -> serialize(dto = data) }
        put(key = "type", value = function.type) { data -> serialize(dto = data) }
        put(key = "for_dark_theme", boolean = function.forDarkTheme)
    }
}

private fun serialize(requestId: Long, function: SetDefaultChannelAdministratorRights): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setDefaultChannelAdministratorRights")
        put(key = "@extra", long = requestId)
        put(key = "default_channel_administrator_rights", value = function.defaultChannelAdministratorRights) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetDefaultGroupAdministratorRights): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setDefaultGroupAdministratorRights")
        put(key = "@extra", long = requestId)
        put(key = "default_group_administrator_rights", value = function.defaultGroupAdministratorRights) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetDefaultMessageAutoDeleteTime): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setDefaultMessageAutoDeleteTime")
        put(key = "@extra", long = requestId)
        put(key = "message_auto_delete_time", value = function.messageAutoDeleteTime) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetDefaultReactionType): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setDefaultReactionType")
        put(key = "@extra", long = requestId)
        put(key = "reaction_type", value = function.reactionType) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetDirectMessagesChatTopicIsMarkedAsUnread): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setDirectMessagesChatTopicIsMarkedAsUnread")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "topic_id", long = function.topicId)
        put(key = "is_marked_as_unread", boolean = function.isMarkedAsUnread)
    }
}

private fun serialize(requestId: Long, function: SetEmojiStatus): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setEmojiStatus")
        put(key = "@extra", long = requestId)
        put(key = "emoji_status", value = function.emojiStatus) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetFileGenerationProgress): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setFileGenerationProgress")
        put(key = "@extra", long = requestId)
        put(key = "generation_id", long = function.generationId)
        put(key = "expected_size", long = function.expectedSize)
        put(key = "local_prefix_size", long = function.localPrefixSize)
    }
}

private fun serialize(requestId: Long, function: SetForumTopicNotificationSettings): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setForumTopicNotificationSettings")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "forum_topic_id", int = function.forumTopicId)
        put(key = "notification_settings", value = function.notificationSettings) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetGameScore): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setGameScore")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "edit_message", boolean = function.editMessage)
        put(key = "user_id", long = function.userId)
        put(key = "score", int = function.score)
        put(key = "force", boolean = function.force)
    }
}

private fun serialize(requestId: Long, function: SetGiftCollectionName): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setGiftCollectionName")
        put(key = "@extra", long = requestId)
        put(key = "owner_id", value = function.ownerId) { data -> serialize(dto = data) }
        put(key = "collection_id", int = function.collectionId)
        put(key = "name", string = function.name)
    }
}

private fun serialize(requestId: Long, function: SetGiftResalePrice): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setGiftResalePrice")
        put(key = "@extra", long = requestId)
        put(key = "received_gift_id", string = function.receivedGiftId)
        put(key = "price", value = function.price) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetGiftSettings): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setGiftSettings")
        put(key = "@extra", long = requestId)
        put(key = "settings", value = function.settings) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetGroupCallPaidMessageStarCount): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setGroupCallPaidMessageStarCount")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
        put(key = "paid_message_star_count", long = function.paidMessageStarCount)
    }
}

private fun serialize(requestId: Long, function: SetGroupCallParticipantIsSpeaking): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setGroupCallParticipantIsSpeaking")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
        put(key = "audio_source", int = function.audioSource)
        put(key = "is_speaking", boolean = function.isSpeaking)
    }
}

private fun serialize(requestId: Long, function: SetGroupCallParticipantVolumeLevel): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setGroupCallParticipantVolumeLevel")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
        put(key = "participant_id", value = function.participantId) { data -> serialize(dto = data) }
        put(key = "volume_level", int = function.volumeLevel)
    }
}

private fun serialize(requestId: Long, function: SetInactiveSessionTtl): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setInactiveSessionTtl")
        put(key = "@extra", long = requestId)
        put(key = "inactive_session_ttl_days", int = function.inactiveSessionTtlDays)
    }
}

private fun serialize(requestId: Long, function: SetInlineGameScore): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setInlineGameScore")
        put(key = "@extra", long = requestId)
        put(key = "inline_message_id", string = function.inlineMessageId)
        put(key = "edit_message", boolean = function.editMessage)
        put(key = "user_id", long = function.userId)
        put(key = "score", int = function.score)
        put(key = "force", boolean = function.force)
    }
}

private fun serialize(requestId: Long, function: SetLiveStoryMessageSender): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setLiveStoryMessageSender")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
        put(key = "message_sender_id", value = function.messageSenderId) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetLogStream): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setLogStream")
        put(key = "@extra", long = requestId)
        put(key = "log_stream", value = function.logStream) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetLogTagVerbosityLevel): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setLogTagVerbosityLevel")
        put(key = "@extra", long = requestId)
        put(key = "tag", string = function.tag)
        put(key = "new_verbosity_level", int = function.newVerbosityLevel)
    }
}

private fun serialize(requestId: Long, function: SetLogVerbosityLevel): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setLogVerbosityLevel")
        put(key = "@extra", long = requestId)
        put(key = "new_verbosity_level", int = function.newVerbosityLevel)
    }
}

private fun serialize(requestId: Long, function: SetLoginEmailAddress): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setLoginEmailAddress")
        put(key = "@extra", long = requestId)
        put(key = "new_login_email_address", string = function.newLoginEmailAddress)
    }
}

private fun serialize(requestId: Long, function: SetMainProfileTab): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setMainProfileTab")
        put(key = "@extra", long = requestId)
        put(key = "main_profile_tab", value = function.mainProfileTab) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetManagedBotAccessSettings): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setManagedBotAccessSettings")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "settings", value = function.settings) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetMenuButton): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setMenuButton")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
        put(key = "menu_button", value = function.menuButton) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetMessageFactCheck): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setMessageFactCheck")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "text", value = function.text) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetMessageReactions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setMessageReactions")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "reaction_types", objects = function.reactionTypes) { data -> serialize(dto = data) }
        put(key = "is_big", boolean = function.isBig)
    }
}

private fun serialize(requestId: Long, function: SetMessageSenderBlockList): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setMessageSenderBlockList")
        put(key = "@extra", long = requestId)
        put(key = "sender_id", value = function.senderId) { data -> serialize(dto = data) }
        put(key = "block_list", value = function.blockList) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetMessageSenderBotVerification): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setMessageSenderBotVerification")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "verified_id", value = function.verifiedId) { data -> serialize(dto = data) }
        put(key = "custom_description", string = function.customDescription)
    }
}

private fun serialize(requestId: Long, function: SetName): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setName")
        put(key = "@extra", long = requestId)
        put(key = "first_name", string = function.firstName)
        put(key = "last_name", string = function.lastName)
    }
}

private fun serialize(requestId: Long, function: SetNetworkType): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setNetworkType")
        put(key = "@extra", long = requestId)
        put(key = "type", value = function.type) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetNewChatPrivacySettings): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setNewChatPrivacySettings")
        put(key = "@extra", long = requestId)
        put(key = "settings", value = function.settings) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetOption): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setOption")
        put(key = "@extra", long = requestId)
        put(key = "name", string = function.name)
        put(key = "value", value = function.value) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetPaidMessageReactionType): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setPaidMessageReactionType")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "type", value = function.type) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetPassportElement): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setPassportElement")
        put(key = "@extra", long = requestId)
        put(key = "element", value = function.element) { data -> serialize(dto = data) }
        put(key = "password", string = function.password)
    }
}

private fun serialize(requestId: Long, function: SetPassportElementErrors): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setPassportElementErrors")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
        put(key = "errors", objects = function.errors) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetPassword): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setPassword")
        put(key = "@extra", long = requestId)
        put(key = "old_password", string = function.oldPassword)
        put(key = "new_password", string = function.newPassword)
        put(key = "new_hint", string = function.newHint)
        put(key = "set_recovery_email_address", boolean = function.setRecoveryEmailAddress)
        put(key = "new_recovery_email_address", string = function.newRecoveryEmailAddress)
    }
}

private fun serialize(requestId: Long, function: SetPersonalChat): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setPersonalChat")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: SetPinnedChats): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setPinnedChats")
        put(key = "@extra", long = requestId)
        put(key = "chat_list", value = function.chatList) { data -> serialize(dto = data) }
        put(key = "chat_ids", longs = function.chatIds)
    }
}

private fun serialize(requestId: Long, function: SetPinnedForumTopics): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setPinnedForumTopics")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "forum_topic_ids", ints = function.forumTopicIds)
    }
}

private fun serialize(requestId: Long, function: SetPinnedGifts): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setPinnedGifts")
        put(key = "@extra", long = requestId)
        put(key = "owner_id", value = function.ownerId) { data -> serialize(dto = data) }
        put(key = "received_gift_ids", strings = function.receivedGiftIds)
    }
}

private fun serialize(requestId: Long, function: SetPinnedSavedMessagesTopics): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setPinnedSavedMessagesTopics")
        put(key = "@extra", long = requestId)
        put(key = "saved_messages_topic_ids", longs = function.savedMessagesTopicIds)
    }
}

private fun serialize(requestId: Long, function: SetPollAnswer): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setPollAnswer")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "option_ids", ints = function.optionIds)
    }
}

private fun serialize(requestId: Long, function: SetProfileAccentColor): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setProfileAccentColor")
        put(key = "@extra", long = requestId)
        put(key = "profile_accent_color_id", int = function.profileAccentColorId)
        put(key = "profile_background_custom_emoji_id", long = function.profileBackgroundCustomEmojiId)
    }
}

private fun serialize(requestId: Long, function: SetProfileAudioPosition): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setProfileAudioPosition")
        put(key = "@extra", long = requestId)
        put(key = "file_id", int = function.fileId)
        put(key = "after_file_id", int = function.afterFileId)
    }
}

private fun serialize(requestId: Long, function: SetProfilePhoto): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setProfilePhoto")
        put(key = "@extra", long = requestId)
        put(key = "photo", value = function.photo) { data -> serialize(dto = data) }
        put(key = "is_public", boolean = function.isPublic)
    }
}

private fun serialize(requestId: Long, function: SetQuickReplyShortcutName): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setQuickReplyShortcutName")
        put(key = "@extra", long = requestId)
        put(key = "shortcut_id", int = function.shortcutId)
        put(key = "name", string = function.name)
    }
}

private fun serialize(requestId: Long, function: SetReactionNotificationSettings): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setReactionNotificationSettings")
        put(key = "@extra", long = requestId)
        put(key = "notification_settings", value = function.notificationSettings) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetReadDatePrivacySettings): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setReadDatePrivacySettings")
        put(key = "@extra", long = requestId)
        put(key = "settings", value = function.settings) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetRecoveryEmailAddress): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setRecoveryEmailAddress")
        put(key = "@extra", long = requestId)
        put(key = "password", string = function.password)
        put(key = "new_recovery_email_address", string = function.newRecoveryEmailAddress)
    }
}

private fun serialize(requestId: Long, function: SetSavedMessagesTagLabel): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setSavedMessagesTagLabel")
        put(key = "@extra", long = requestId)
        put(key = "tag", value = function.tag) { data -> serialize(dto = data) }
        put(key = "label", string = function.label)
    }
}

private fun serialize(requestId: Long, function: SetScopeNotificationSettings): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setScopeNotificationSettings")
        put(key = "@extra", long = requestId)
        put(key = "scope", value = function.scope) { data -> serialize(dto = data) }
        put(key = "notification_settings", value = function.notificationSettings) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetStickerEmojis): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setStickerEmojis")
        put(key = "@extra", long = requestId)
        put(key = "sticker", value = function.sticker) { data -> serialize(dto = data) }
        put(key = "emojis", string = function.emojis)
    }
}

private fun serialize(requestId: Long, function: SetStickerKeywords): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setStickerKeywords")
        put(key = "@extra", long = requestId)
        put(key = "sticker", value = function.sticker) { data -> serialize(dto = data) }
        put(key = "keywords", strings = function.keywords)
    }
}

private fun serialize(requestId: Long, function: SetStickerMaskPosition): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setStickerMaskPosition")
        put(key = "@extra", long = requestId)
        put(key = "sticker", value = function.sticker) { data -> serialize(dto = data) }
        put(key = "mask_position", value = function.maskPosition) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetStickerPositionInSet): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setStickerPositionInSet")
        put(key = "@extra", long = requestId)
        put(key = "sticker", value = function.sticker) { data -> serialize(dto = data) }
        put(key = "position", int = function.position)
    }
}

private fun serialize(requestId: Long, function: SetStickerSetThumbnail): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setStickerSetThumbnail")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
        put(key = "name", string = function.name)
        put(key = "thumbnail", value = function.thumbnail) { data -> serialize(dto = data) }
        put(key = "format", value = function.format) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetStickerSetTitle): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setStickerSetTitle")
        put(key = "@extra", long = requestId)
        put(key = "name", string = function.name)
        put(key = "title", string = function.title)
    }
}

private fun serialize(requestId: Long, function: SetStoryAlbumName): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setStoryAlbumName")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "story_album_id", int = function.storyAlbumId)
        put(key = "name", string = function.name)
    }
}

private fun serialize(requestId: Long, function: SetStoryPrivacySettings): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setStoryPrivacySettings")
        put(key = "@extra", long = requestId)
        put(key = "story_id", int = function.storyId)
        put(key = "privacy_settings", value = function.privacySettings) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetStoryReaction): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setStoryReaction")
        put(key = "@extra", long = requestId)
        put(key = "story_poster_chat_id", long = function.storyPosterChatId)
        put(key = "story_id", int = function.storyId)
        put(key = "reaction_type", value = function.reactionType) { data -> serialize(dto = data) }
        put(key = "update_recent_reactions", boolean = function.updateRecentReactions)
    }
}

private fun serialize(requestId: Long, function: SetSupergroupCustomEmojiStickerSet): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setSupergroupCustomEmojiStickerSet")
        put(key = "@extra", long = requestId)
        put(key = "supergroup_id", long = function.supergroupId)
        put(key = "custom_emoji_sticker_set_id", long = function.customEmojiStickerSetId)
    }
}

private fun serialize(requestId: Long, function: SetSupergroupMainProfileTab): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setSupergroupMainProfileTab")
        put(key = "@extra", long = requestId)
        put(key = "supergroup_id", long = function.supergroupId)
        put(key = "main_profile_tab", value = function.mainProfileTab) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetSupergroupStickerSet): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setSupergroupStickerSet")
        put(key = "@extra", long = requestId)
        put(key = "supergroup_id", long = function.supergroupId)
        put(key = "sticker_set_id", long = function.stickerSetId)
    }
}

private fun serialize(requestId: Long, function: SetSupergroupUnrestrictBoostCount): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setSupergroupUnrestrictBoostCount")
        put(key = "@extra", long = requestId)
        put(key = "supergroup_id", long = function.supergroupId)
        put(key = "unrestrict_boost_count", int = function.unrestrictBoostCount)
    }
}

private fun serialize(requestId: Long, function: SetSupergroupUsername): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setSupergroupUsername")
        put(key = "@extra", long = requestId)
        put(key = "supergroup_id", long = function.supergroupId)
        put(key = "username", string = function.username)
    }
}

private fun serialize(requestId: Long, function: SetTdlibParameters): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setTdlibParameters")
        put(key = "@extra", long = requestId)
        put(key = "use_test_dc", boolean = function.useTestDc)
        put(key = "database_directory", string = function.databaseDirectory)
        put(key = "files_directory", string = function.filesDirectory)
        put(key = "database_encryption_key", bytes = function.databaseEncryptionKey)
        put(key = "use_file_database", boolean = function.useFileDatabase)
        put(key = "use_chat_info_database", boolean = function.useChatInfoDatabase)
        put(key = "use_message_database", boolean = function.useMessageDatabase)
        put(key = "use_secret_chats", boolean = function.useSecretChats)
        put(key = "api_id", int = function.apiId)
        put(key = "api_hash", string = function.apiHash)
        put(key = "system_language_code", string = function.systemLanguageCode)
        put(key = "device_model", string = function.deviceModel)
        put(key = "system_version", string = function.systemVersion)
        put(key = "application_version", string = function.applicationVersion)
    }
}

private fun serialize(requestId: Long, function: SetUpgradedGiftColors): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setUpgradedGiftColors")
        put(key = "@extra", long = requestId)
        put(key = "upgraded_gift_colors_id", long = function.upgradedGiftColorsId)
    }
}

private fun serialize(requestId: Long, function: SetUserEmojiStatus): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setUserEmojiStatus")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
        put(key = "emoji_status", value = function.emojiStatus) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetUserNote): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setUserNote")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
        put(key = "note", value = function.note) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetUserPersonalProfilePhoto): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setUserPersonalProfilePhoto")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
        put(key = "photo", value = function.photo) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetUserPrivacySettingRules): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setUserPrivacySettingRules")
        put(key = "@extra", long = requestId)
        put(key = "setting", value = function.setting) { data -> serialize(dto = data) }
        put(key = "rules", value = function.rules) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetUserSupportInfo): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setUserSupportInfo")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
        put(key = "message", value = function.message) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetUsername): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setUsername")
        put(key = "@extra", long = requestId)
        put(key = "username", string = function.username)
    }
}

private fun serialize(requestId: Long, function: SetVideoChatDefaultParticipant): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setVideoChatDefaultParticipant")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "default_participant_id", value = function.defaultParticipantId) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SetVideoChatTitle): String {
    return buildJsonObjectString {
        put(key = "@type", string = "setVideoChatTitle")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
        put(key = "title", string = function.title)
    }
}

private fun serialize(requestId: Long, function: ShareChatWithBot): String {
    return buildJsonObjectString {
        put(key = "@type", string = "shareChatWithBot")
        put(key = "@extra", long = requestId)
        put(key = "source", value = function.source) { data -> serialize(dto = data) }
        put(key = "button_id", int = function.buttonId)
        put(key = "shared_chat_id", long = function.sharedChatId)
        put(key = "only_check", boolean = function.onlyCheck)
    }
}

private fun serialize(requestId: Long, function: SharePhoneNumber): String {
    return buildJsonObjectString {
        put(key = "@type", string = "sharePhoneNumber")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
    }
}

private fun serialize(requestId: Long, function: ShareUsersWithBot): String {
    return buildJsonObjectString {
        put(key = "@type", string = "shareUsersWithBot")
        put(key = "@extra", long = requestId)
        put(key = "source", value = function.source) { data -> serialize(dto = data) }
        put(key = "button_id", int = function.buttonId)
        put(key = "shared_user_ids", longs = function.sharedUserIds)
        put(key = "only_check", boolean = function.onlyCheck)
    }
}

private fun serialize(requestId: Long, function: StartGroupCallRecording): String {
    return buildJsonObjectString {
        put(key = "@type", string = "startGroupCallRecording")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
        put(key = "title", string = function.title)
        put(key = "record_video", boolean = function.recordVideo)
        put(key = "use_portrait_orientation", boolean = function.usePortraitOrientation)
    }
}

private fun serialize(requestId: Long, function: StartGroupCallScreenSharing): String {
    return buildJsonObjectString {
        put(key = "@type", string = "startGroupCallScreenSharing")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
        put(key = "audio_source_id", int = function.audioSourceId)
        put(key = "payload", string = function.payload)
    }
}

private fun serialize(requestId: Long, function: StartLiveStory): String {
    return buildJsonObjectString {
        put(key = "@type", string = "startLiveStory")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "privacy_settings", value = function.privacySettings) { data -> serialize(dto = data) }
        put(key = "protect_content", boolean = function.protectContent)
        put(key = "is_rtmp_stream", boolean = function.isRtmpStream)
        put(key = "enable_messages", boolean = function.enableMessages)
        put(key = "paid_message_star_count", long = function.paidMessageStarCount)
    }
}

private fun serialize(requestId: Long, function: StartScheduledVideoChat): String {
    return buildJsonObjectString {
        put(key = "@type", string = "startScheduledVideoChat")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
    }
}

private fun serialize(requestId: Long, function: StopBusinessPoll): String {
    return buildJsonObjectString {
        put(key = "@type", string = "stopBusinessPoll")
        put(key = "@extra", long = requestId)
        put(key = "business_connection_id", string = function.businessConnectionId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "reply_markup", value = function.replyMarkup) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: StopPoll): String {
    return buildJsonObjectString {
        put(key = "@type", string = "stopPoll")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "reply_markup", value = function.replyMarkup) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SuggestUserBirthdate): String {
    return buildJsonObjectString {
        put(key = "@type", string = "suggestUserBirthdate")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
        put(key = "birthdate", value = function.birthdate) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SuggestUserProfilePhoto): String {
    return buildJsonObjectString {
        put(key = "@type", string = "suggestUserProfilePhoto")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
        put(key = "photo", value = function.photo) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: SummarizeMessage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "summarizeMessage")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "translate_to_language_code", string = function.translateToLanguageCode)
        put(key = "tone", string = function.tone)
    }
}

private fun serialize(requestId: Long, function: SynchronizeLanguagePack): String {
    return buildJsonObjectString {
        put(key = "@type", string = "synchronizeLanguagePack")
        put(key = "@extra", long = requestId)
        put(key = "language_pack_id", string = function.languagePackId)
    }
}

private fun serialize(requestId: Long, function: TerminateAllOtherSessions): String {
    return buildJsonObjectString {
        put(key = "@type", string = "terminateAllOtherSessions")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: TerminateSession): String {
    return buildJsonObjectString {
        put(key = "@type", string = "terminateSession")
        put(key = "@extra", long = requestId)
        put(key = "session_id", long = function.sessionId)
    }
}

private fun serialize(requestId: Long, function: TestCallBytes): String {
    return buildJsonObjectString {
        put(key = "@type", string = "testCallBytes")
        put(key = "@extra", long = requestId)
        put(key = "x", bytes = function.x)
    }
}

private fun serialize(requestId: Long, function: TestCallEmpty): String {
    return buildJsonObjectString {
        put(key = "@type", string = "testCallEmpty")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: TestCallString): String {
    return buildJsonObjectString {
        put(key = "@type", string = "testCallString")
        put(key = "@extra", long = requestId)
        put(key = "x", string = function.x)
    }
}

private fun serialize(requestId: Long, function: TestCallVectorInt): String {
    return buildJsonObjectString {
        put(key = "@type", string = "testCallVectorInt")
        put(key = "@extra", long = requestId)
        put(key = "x", ints = function.x)
    }
}

private fun serialize(requestId: Long, function: TestCallVectorIntObject): String {
    return buildJsonObjectString {
        put(key = "@type", string = "testCallVectorIntObject")
        put(key = "@extra", long = requestId)
        put(key = "x", objects = function.x) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: TestCallVectorString): String {
    return buildJsonObjectString {
        put(key = "@type", string = "testCallVectorString")
        put(key = "@extra", long = requestId)
        put(key = "x", strings = function.x)
    }
}

private fun serialize(requestId: Long, function: TestCallVectorStringObject): String {
    return buildJsonObjectString {
        put(key = "@type", string = "testCallVectorStringObject")
        put(key = "@extra", long = requestId)
        put(key = "x", objects = function.x) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: TestGetDifference): String {
    return buildJsonObjectString {
        put(key = "@type", string = "testGetDifference")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: TestNetwork): String {
    return buildJsonObjectString {
        put(key = "@type", string = "testNetwork")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: TestProxy): String {
    return buildJsonObjectString {
        put(key = "@type", string = "testProxy")
        put(key = "@extra", long = requestId)
        put(key = "proxy", value = function.proxy) { data -> serialize(dto = data) }
        put(key = "dc_id", int = function.dcId)
        put(key = "timeout", double = function.timeout)
    }
}

private fun serialize(requestId: Long, function: TestReturnError): String {
    return buildJsonObjectString {
        put(key = "@type", string = "testReturnError")
        put(key = "@extra", long = requestId)
        put(key = "error", value = function.error) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: TestSquareInt): String {
    return buildJsonObjectString {
        put(key = "@type", string = "testSquareInt")
        put(key = "@extra", long = requestId)
        put(key = "x", int = function.x)
    }
}

private fun serialize(requestId: Long, function: TestUseUpdate): String {
    return buildJsonObjectString {
        put(key = "@type", string = "testUseUpdate")
        put(key = "@extra", long = requestId)
    }
}

private fun serialize(requestId: Long, function: ToggleAllDownloadsArePaused): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleAllDownloadsArePaused")
        put(key = "@extra", long = requestId)
        put(key = "are_paused", boolean = function.arePaused)
    }
}

private fun serialize(requestId: Long, function: ToggleBotCanManageEmojiStatus): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleBotCanManageEmojiStatus")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "can_manage_emoji_status", boolean = function.canManageEmojiStatus)
    }
}

private fun serialize(requestId: Long, function: ToggleBotIsAddedToAttachmentMenu): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleBotIsAddedToAttachmentMenu")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "is_added", boolean = function.isAdded)
        put(key = "allow_write_access", boolean = function.allowWriteAccess)
    }
}

private fun serialize(requestId: Long, function: ToggleBotUsernameIsActive): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleBotUsernameIsActive")
        put(key = "@extra", long = requestId)
        put(key = "bot_user_id", long = function.botUserId)
        put(key = "username", string = function.username)
        put(key = "is_active", boolean = function.isActive)
    }
}

private fun serialize(requestId: Long, function: ToggleBusinessConnectedBotChatIsPaused): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleBusinessConnectedBotChatIsPaused")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "is_paused", boolean = function.isPaused)
    }
}

private fun serialize(requestId: Long, function: ToggleChatDefaultDisableNotification): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleChatDefaultDisableNotification")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "default_disable_notification", boolean = function.defaultDisableNotification)
    }
}

private fun serialize(requestId: Long, function: ToggleChatFolderTags): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleChatFolderTags")
        put(key = "@extra", long = requestId)
        put(key = "are_tags_enabled", boolean = function.areTagsEnabled)
    }
}

private fun serialize(requestId: Long, function: ToggleChatGiftNotifications): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleChatGiftNotifications")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "are_enabled", boolean = function.areEnabled)
    }
}

private fun serialize(requestId: Long, function: ToggleChatHasProtectedContent): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleChatHasProtectedContent")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "has_protected_content", boolean = function.hasProtectedContent)
    }
}

private fun serialize(requestId: Long, function: ToggleChatIsMarkedAsUnread): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleChatIsMarkedAsUnread")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "is_marked_as_unread", boolean = function.isMarkedAsUnread)
    }
}

private fun serialize(requestId: Long, function: ToggleChatIsPinned): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleChatIsPinned")
        put(key = "@extra", long = requestId)
        put(key = "chat_list", value = function.chatList) { data -> serialize(dto = data) }
        put(key = "chat_id", long = function.chatId)
        put(key = "is_pinned", boolean = function.isPinned)
    }
}

private fun serialize(requestId: Long, function: ToggleChatIsTranslatable): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleChatIsTranslatable")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "is_translatable", boolean = function.isTranslatable)
    }
}

private fun serialize(requestId: Long, function: ToggleChatViewAsTopics): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleChatViewAsTopics")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "view_as_topics", boolean = function.viewAsTopics)
    }
}

private fun serialize(requestId: Long, function: ToggleDirectMessagesChatTopicCanSendUnpaidMessages): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleDirectMessagesChatTopicCanSendUnpaidMessages")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "topic_id", long = function.topicId)
        put(key = "can_send_unpaid_messages", boolean = function.canSendUnpaidMessages)
        put(key = "refund_payments", boolean = function.refundPayments)
    }
}

private fun serialize(requestId: Long, function: ToggleDownloadIsPaused): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleDownloadIsPaused")
        put(key = "@extra", long = requestId)
        put(key = "file_id", int = function.fileId)
        put(key = "is_paused", boolean = function.isPaused)
    }
}

private fun serialize(requestId: Long, function: ToggleForumTopicIsClosed): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleForumTopicIsClosed")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "forum_topic_id", int = function.forumTopicId)
        put(key = "is_closed", boolean = function.isClosed)
    }
}

private fun serialize(requestId: Long, function: ToggleForumTopicIsPinned): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleForumTopicIsPinned")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "forum_topic_id", int = function.forumTopicId)
        put(key = "is_pinned", boolean = function.isPinned)
    }
}

private fun serialize(requestId: Long, function: ToggleGeneralForumTopicIsHidden): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleGeneralForumTopicIsHidden")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "is_hidden", boolean = function.isHidden)
    }
}

private fun serialize(requestId: Long, function: ToggleGiftIsSaved): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleGiftIsSaved")
        put(key = "@extra", long = requestId)
        put(key = "received_gift_id", string = function.receivedGiftId)
        put(key = "is_saved", boolean = function.isSaved)
    }
}

private fun serialize(requestId: Long, function: ToggleGroupCallAreMessagesAllowed): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleGroupCallAreMessagesAllowed")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
        put(key = "are_messages_allowed", boolean = function.areMessagesAllowed)
    }
}

private fun serialize(requestId: Long, function: ToggleGroupCallIsMyVideoEnabled): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleGroupCallIsMyVideoEnabled")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
        put(key = "is_my_video_enabled", boolean = function.isMyVideoEnabled)
    }
}

private fun serialize(requestId: Long, function: ToggleGroupCallIsMyVideoPaused): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleGroupCallIsMyVideoPaused")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
        put(key = "is_my_video_paused", boolean = function.isMyVideoPaused)
    }
}

private fun serialize(requestId: Long, function: ToggleGroupCallParticipantIsHandRaised): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleGroupCallParticipantIsHandRaised")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
        put(key = "participant_id", value = function.participantId) { data -> serialize(dto = data) }
        put(key = "is_hand_raised", boolean = function.isHandRaised)
    }
}

private fun serialize(requestId: Long, function: ToggleGroupCallParticipantIsMuted): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleGroupCallParticipantIsMuted")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
        put(key = "participant_id", value = function.participantId) { data -> serialize(dto = data) }
        put(key = "is_muted", boolean = function.isMuted)
    }
}

private fun serialize(requestId: Long, function: ToggleGroupCallScreenSharingIsPaused): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleGroupCallScreenSharingIsPaused")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
        put(key = "is_paused", boolean = function.isPaused)
    }
}

private fun serialize(requestId: Long, function: ToggleHasSponsoredMessagesEnabled): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleHasSponsoredMessagesEnabled")
        put(key = "@extra", long = requestId)
        put(key = "has_sponsored_messages_enabled", boolean = function.hasSponsoredMessagesEnabled)
    }
}

private fun serialize(requestId: Long, function: ToggleSavedMessagesTopicIsPinned): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleSavedMessagesTopicIsPinned")
        put(key = "@extra", long = requestId)
        put(key = "saved_messages_topic_id", long = function.savedMessagesTopicId)
        put(key = "is_pinned", boolean = function.isPinned)
    }
}

private fun serialize(requestId: Long, function: ToggleSessionCanAcceptCalls): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleSessionCanAcceptCalls")
        put(key = "@extra", long = requestId)
        put(key = "session_id", long = function.sessionId)
        put(key = "can_accept_calls", boolean = function.canAcceptCalls)
    }
}

private fun serialize(requestId: Long, function: ToggleSessionCanAcceptSecretChats): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleSessionCanAcceptSecretChats")
        put(key = "@extra", long = requestId)
        put(key = "session_id", long = function.sessionId)
        put(key = "can_accept_secret_chats", boolean = function.canAcceptSecretChats)
    }
}

private fun serialize(requestId: Long, function: ToggleStoryIsPostedToChatPage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleStoryIsPostedToChatPage")
        put(key = "@extra", long = requestId)
        put(key = "story_poster_chat_id", long = function.storyPosterChatId)
        put(key = "story_id", int = function.storyId)
        put(key = "is_posted_to_chat_page", boolean = function.isPostedToChatPage)
    }
}

private fun serialize(requestId: Long, function: ToggleSupergroupCanHaveSponsoredMessages): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleSupergroupCanHaveSponsoredMessages")
        put(key = "@extra", long = requestId)
        put(key = "supergroup_id", long = function.supergroupId)
        put(key = "can_have_sponsored_messages", boolean = function.canHaveSponsoredMessages)
    }
}

private fun serialize(requestId: Long, function: ToggleSupergroupHasAggressiveAntiSpamEnabled): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleSupergroupHasAggressiveAntiSpamEnabled")
        put(key = "@extra", long = requestId)
        put(key = "supergroup_id", long = function.supergroupId)
        put(key = "has_aggressive_anti_spam_enabled", boolean = function.hasAggressiveAntiSpamEnabled)
    }
}

private fun serialize(requestId: Long, function: ToggleSupergroupHasAutomaticTranslation): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleSupergroupHasAutomaticTranslation")
        put(key = "@extra", long = requestId)
        put(key = "supergroup_id", long = function.supergroupId)
        put(key = "has_automatic_translation", boolean = function.hasAutomaticTranslation)
    }
}

private fun serialize(requestId: Long, function: ToggleSupergroupHasHiddenMembers): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleSupergroupHasHiddenMembers")
        put(key = "@extra", long = requestId)
        put(key = "supergroup_id", long = function.supergroupId)
        put(key = "has_hidden_members", boolean = function.hasHiddenMembers)
    }
}

private fun serialize(requestId: Long, function: ToggleSupergroupIsAllHistoryAvailable): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleSupergroupIsAllHistoryAvailable")
        put(key = "@extra", long = requestId)
        put(key = "supergroup_id", long = function.supergroupId)
        put(key = "is_all_history_available", boolean = function.isAllHistoryAvailable)
    }
}

private fun serialize(requestId: Long, function: ToggleSupergroupIsBroadcastGroup): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleSupergroupIsBroadcastGroup")
        put(key = "@extra", long = requestId)
        put(key = "supergroup_id", long = function.supergroupId)
    }
}

private fun serialize(requestId: Long, function: ToggleSupergroupIsForum): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleSupergroupIsForum")
        put(key = "@extra", long = requestId)
        put(key = "supergroup_id", long = function.supergroupId)
        put(key = "is_forum", boolean = function.isForum)
        put(key = "has_forum_tabs", boolean = function.hasForumTabs)
    }
}

private fun serialize(requestId: Long, function: ToggleSupergroupJoinByRequest): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleSupergroupJoinByRequest")
        put(key = "@extra", long = requestId)
        put(key = "supergroup_id", long = function.supergroupId)
        put(key = "join_by_request", boolean = function.joinByRequest)
        put(key = "guard_bot_user_id", long = function.guardBotUserId)
        put(key = "apply_to_invite_links", boolean = function.applyToInviteLinks)
    }
}

private fun serialize(requestId: Long, function: ToggleSupergroupJoinToSendMessages): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleSupergroupJoinToSendMessages")
        put(key = "@extra", long = requestId)
        put(key = "supergroup_id", long = function.supergroupId)
        put(key = "join_to_send_messages", boolean = function.joinToSendMessages)
    }
}

private fun serialize(requestId: Long, function: ToggleSupergroupSignMessages): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleSupergroupSignMessages")
        put(key = "@extra", long = requestId)
        put(key = "supergroup_id", long = function.supergroupId)
        put(key = "sign_messages", boolean = function.signMessages)
        put(key = "show_message_sender", boolean = function.showMessageSender)
    }
}

private fun serialize(requestId: Long, function: ToggleSupergroupUsernameIsActive): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleSupergroupUsernameIsActive")
        put(key = "@extra", long = requestId)
        put(key = "supergroup_id", long = function.supergroupId)
        put(key = "username", string = function.username)
        put(key = "is_active", boolean = function.isActive)
    }
}

private fun serialize(requestId: Long, function: ToggleUsernameIsActive): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleUsernameIsActive")
        put(key = "@extra", long = requestId)
        put(key = "username", string = function.username)
        put(key = "is_active", boolean = function.isActive)
    }
}

private fun serialize(requestId: Long, function: ToggleVideoChatEnabledStartNotification): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleVideoChatEnabledStartNotification")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
        put(key = "enabled_start_notification", boolean = function.enabledStartNotification)
    }
}

private fun serialize(requestId: Long, function: ToggleVideoChatMuteNewParticipants): String {
    return buildJsonObjectString {
        put(key = "@type", string = "toggleVideoChatMuteNewParticipants")
        put(key = "@extra", long = requestId)
        put(key = "group_call_id", int = function.groupCallId)
        put(key = "mute_new_participants", boolean = function.muteNewParticipants)
    }
}

private fun serialize(requestId: Long, function: TransferBusinessAccountStars): String {
    return buildJsonObjectString {
        put(key = "@type", string = "transferBusinessAccountStars")
        put(key = "@extra", long = requestId)
        put(key = "business_connection_id", string = function.businessConnectionId)
        put(key = "star_count", long = function.starCount)
    }
}

private fun serialize(requestId: Long, function: TransferChatOwnership): String {
    return buildJsonObjectString {
        put(key = "@type", string = "transferChatOwnership")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "user_id", long = function.userId)
        put(key = "password", string = function.password)
    }
}

private fun serialize(requestId: Long, function: TransferGift): String {
    return buildJsonObjectString {
        put(key = "@type", string = "transferGift")
        put(key = "@extra", long = requestId)
        put(key = "business_connection_id", string = function.businessConnectionId)
        put(key = "received_gift_id", string = function.receivedGiftId)
        put(key = "new_owner_id", value = function.newOwnerId) { data -> serialize(dto = data) }
        put(key = "star_count", long = function.starCount)
    }
}

private fun serialize(requestId: Long, function: TranslateMessageRichMessage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "translateMessageRichMessage")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "to_language_code", string = function.toLanguageCode)
        put(key = "tone", string = function.tone)
    }
}

private fun serialize(requestId: Long, function: TranslateMessageText): String {
    return buildJsonObjectString {
        put(key = "@type", string = "translateMessageText")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
        put(key = "to_language_code", string = function.toLanguageCode)
        put(key = "tone", string = function.tone)
    }
}

private fun serialize(requestId: Long, function: TranslateRichMessage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "translateRichMessage")
        put(key = "@extra", long = requestId)
        put(key = "message", value = function.message) { data -> serialize(dto = data) }
        put(key = "to_language_code", string = function.toLanguageCode)
        put(key = "tone", string = function.tone)
    }
}

private fun serialize(requestId: Long, function: TranslateText): String {
    return buildJsonObjectString {
        put(key = "@type", string = "translateText")
        put(key = "@extra", long = requestId)
        put(key = "text", value = function.text) { data -> serialize(dto = data) }
        put(key = "to_language_code", string = function.toLanguageCode)
        put(key = "tone", string = function.tone)
    }
}

private fun serialize(requestId: Long, function: UnpinAllChatMessages): String {
    return buildJsonObjectString {
        put(key = "@type", string = "unpinAllChatMessages")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: UnpinAllDirectMessagesChatTopicMessages): String {
    return buildJsonObjectString {
        put(key = "@type", string = "unpinAllDirectMessagesChatTopicMessages")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "topic_id", long = function.topicId)
    }
}

private fun serialize(requestId: Long, function: UnpinAllForumTopicMessages): String {
    return buildJsonObjectString {
        put(key = "@type", string = "unpinAllForumTopicMessages")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "forum_topic_id", int = function.forumTopicId)
    }
}

private fun serialize(requestId: Long, function: UnpinChatMessage): String {
    return buildJsonObjectString {
        put(key = "@type", string = "unpinChatMessage")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_id", long = function.messageId)
    }
}

private fun serialize(requestId: Long, function: UpgradeBasicGroupChatToSupergroupChat): String {
    return buildJsonObjectString {
        put(key = "@type", string = "upgradeBasicGroupChatToSupergroupChat")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
    }
}

private fun serialize(requestId: Long, function: UpgradeGift): String {
    return buildJsonObjectString {
        put(key = "@type", string = "upgradeGift")
        put(key = "@extra", long = requestId)
        put(key = "business_connection_id", string = function.businessConnectionId)
        put(key = "received_gift_id", string = function.receivedGiftId)
        put(key = "keep_original_details", boolean = function.keepOriginalDetails)
        put(key = "star_count", long = function.starCount)
    }
}

private fun serialize(requestId: Long, function: UploadStickerFile): String {
    return buildJsonObjectString {
        put(key = "@type", string = "uploadStickerFile")
        put(key = "@extra", long = requestId)
        put(key = "user_id", long = function.userId)
        put(key = "sticker_format", value = function.stickerFormat) { data -> serialize(dto = data) }
        put(key = "sticker", value = function.sticker) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: ValidateOrderInfo): String {
    return buildJsonObjectString {
        put(key = "@type", string = "validateOrderInfo")
        put(key = "@extra", long = requestId)
        put(key = "input_invoice", value = function.inputInvoice) { data -> serialize(dto = data) }
        put(key = "order_info", value = function.orderInfo) { data -> serialize(dto = data) }
        put(key = "allow_save", boolean = function.allowSave)
    }
}

private fun serialize(requestId: Long, function: ViewMessages): String {
    return buildJsonObjectString {
        put(key = "@type", string = "viewMessages")
        put(key = "@extra", long = requestId)
        put(key = "chat_id", long = function.chatId)
        put(key = "message_ids", longs = function.messageIds)
        put(key = "source", value = function.source) { data -> serialize(dto = data) }
        put(key = "force_read", boolean = function.forceRead)
    }
}

private fun serialize(requestId: Long, function: ViewPremiumFeature): String {
    return buildJsonObjectString {
        put(key = "@type", string = "viewPremiumFeature")
        put(key = "@extra", long = requestId)
        put(key = "feature", value = function.feature) { data -> serialize(dto = data) }
    }
}

private fun serialize(requestId: Long, function: ViewSponsoredChat): String {
    return buildJsonObjectString {
        put(key = "@type", string = "viewSponsoredChat")
        put(key = "@extra", long = requestId)
        put(key = "sponsored_chat_unique_id", long = function.sponsoredChatUniqueId)
    }
}

private fun serialize(requestId: Long, function: ViewTrendingStickerSets): String {
    return buildJsonObjectString {
        put(key = "@type", string = "viewTrendingStickerSets")
        put(key = "@extra", long = requestId)
        put(key = "sticker_set_ids", longs = function.stickerSetIds)
    }
}

private fun serialize(requestId: Long, function: ViewVideoMessageAdvertisement): String {
    return buildJsonObjectString {
        put(key = "@type", string = "viewVideoMessageAdvertisement")
        put(key = "@extra", long = requestId)
        put(key = "advertisement_unique_id", long = function.advertisementUniqueId)
    }
}

private fun serialize(requestId: Long, function: WriteGeneratedFilePart): String {
    return buildJsonObjectString {
        put(key = "@type", string = "writeGeneratedFilePart")
        put(key = "@extra", long = requestId)
        put(key = "generation_id", long = function.generationId)
        put(key = "offset", long = function.offset)
        put(key = "data", bytes = function.data)
    }
}
