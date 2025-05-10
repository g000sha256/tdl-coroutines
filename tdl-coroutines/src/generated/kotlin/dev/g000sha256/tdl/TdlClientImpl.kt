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

import dev.g000sha256.tdl.dto.AccountTtlDto
import dev.g000sha256.tdl.dto.AddedReactionsDto
import dev.g000sha256.tdl.dto.AffiliateProgramParametersDto
import dev.g000sha256.tdl.dto.AffiliateProgramSortOrderDto
import dev.g000sha256.tdl.dto.AffiliateTypeDto
import dev.g000sha256.tdl.dto.AnimatedEmojiDto
import dev.g000sha256.tdl.dto.AnimationsDto
import dev.g000sha256.tdl.dto.ArchiveChatListSettingsDto
import dev.g000sha256.tdl.dto.AttachmentMenuBotDto
import dev.g000sha256.tdl.dto.AuthenticationCodeInfoDto
import dev.g000sha256.tdl.dto.AuthorizationStateDto
import dev.g000sha256.tdl.dto.AutoDownloadSettingsDto
import dev.g000sha256.tdl.dto.AutoDownloadSettingsPresetsDto
import dev.g000sha256.tdl.dto.AutosaveSettingsDto
import dev.g000sha256.tdl.dto.AutosaveSettingsScopeDto
import dev.g000sha256.tdl.dto.AvailableReactionsDto
import dev.g000sha256.tdl.dto.BackgroundDto
import dev.g000sha256.tdl.dto.BackgroundTypeDto
import dev.g000sha256.tdl.dto.BackgroundsDto
import dev.g000sha256.tdl.dto.BankCardInfoDto
import dev.g000sha256.tdl.dto.BasicGroupDto
import dev.g000sha256.tdl.dto.BasicGroupFullInfoDto
import dev.g000sha256.tdl.dto.BirthdateDto
import dev.g000sha256.tdl.dto.BlockListDto
import dev.g000sha256.tdl.dto.BotCommandDto
import dev.g000sha256.tdl.dto.BotCommandScopeDto
import dev.g000sha256.tdl.dto.BotCommandsDto
import dev.g000sha256.tdl.dto.BotMediaPreviewDto
import dev.g000sha256.tdl.dto.BotMediaPreviewInfoDto
import dev.g000sha256.tdl.dto.BotMediaPreviewsDto
import dev.g000sha256.tdl.dto.BotMenuButtonDto
import dev.g000sha256.tdl.dto.BusinessAwayMessageSettingsDto
import dev.g000sha256.tdl.dto.BusinessChatLinkDto
import dev.g000sha256.tdl.dto.BusinessChatLinkInfoDto
import dev.g000sha256.tdl.dto.BusinessChatLinksDto
import dev.g000sha256.tdl.dto.BusinessConnectedBotDto
import dev.g000sha256.tdl.dto.BusinessConnectionDto
import dev.g000sha256.tdl.dto.BusinessFeatureDto
import dev.g000sha256.tdl.dto.BusinessFeaturesDto
import dev.g000sha256.tdl.dto.BusinessGreetingMessageSettingsDto
import dev.g000sha256.tdl.dto.BusinessLocationDto
import dev.g000sha256.tdl.dto.BusinessMessageDto
import dev.g000sha256.tdl.dto.BusinessMessagesDto
import dev.g000sha256.tdl.dto.BusinessOpeningHoursDto
import dev.g000sha256.tdl.dto.CallIdDto
import dev.g000sha256.tdl.dto.CallProblemDto
import dev.g000sha256.tdl.dto.CallProtocolDto
import dev.g000sha256.tdl.dto.CallbackQueryAnswerDto
import dev.g000sha256.tdl.dto.CallbackQueryPayloadDto
import dev.g000sha256.tdl.dto.CanPostStoryResultDto
import dev.g000sha256.tdl.dto.CanSendMessageToUserResultDto
import dev.g000sha256.tdl.dto.CanTransferOwnershipResultDto
import dev.g000sha256.tdl.dto.ChatActionDto
import dev.g000sha256.tdl.dto.ChatActiveStoriesDto
import dev.g000sha256.tdl.dto.ChatAdministratorRightsDto
import dev.g000sha256.tdl.dto.ChatAdministratorsDto
import dev.g000sha256.tdl.dto.ChatAvailableReactionsDto
import dev.g000sha256.tdl.dto.ChatBoostFeaturesDto
import dev.g000sha256.tdl.dto.ChatBoostLevelFeaturesDto
import dev.g000sha256.tdl.dto.ChatBoostLinkDto
import dev.g000sha256.tdl.dto.ChatBoostLinkInfoDto
import dev.g000sha256.tdl.dto.ChatBoostSlotsDto
import dev.g000sha256.tdl.dto.ChatBoostStatusDto
import dev.g000sha256.tdl.dto.ChatDto
import dev.g000sha256.tdl.dto.ChatEventLogFiltersDto
import dev.g000sha256.tdl.dto.ChatEventsDto
import dev.g000sha256.tdl.dto.ChatFolderDto
import dev.g000sha256.tdl.dto.ChatFolderIconDto
import dev.g000sha256.tdl.dto.ChatFolderInfoDto
import dev.g000sha256.tdl.dto.ChatFolderInviteLinkDto
import dev.g000sha256.tdl.dto.ChatFolderInviteLinkInfoDto
import dev.g000sha256.tdl.dto.ChatFolderInviteLinksDto
import dev.g000sha256.tdl.dto.ChatInviteLinkCountsDto
import dev.g000sha256.tdl.dto.ChatInviteLinkDto
import dev.g000sha256.tdl.dto.ChatInviteLinkInfoDto
import dev.g000sha256.tdl.dto.ChatInviteLinkMemberDto
import dev.g000sha256.tdl.dto.ChatInviteLinkMembersDto
import dev.g000sha256.tdl.dto.ChatInviteLinksDto
import dev.g000sha256.tdl.dto.ChatJoinRequestDto
import dev.g000sha256.tdl.dto.ChatJoinRequestsDto
import dev.g000sha256.tdl.dto.ChatListDto
import dev.g000sha256.tdl.dto.ChatListsDto
import dev.g000sha256.tdl.dto.ChatLocationDto
import dev.g000sha256.tdl.dto.ChatMemberDto
import dev.g000sha256.tdl.dto.ChatMemberStatusDto
import dev.g000sha256.tdl.dto.ChatMembersDto
import dev.g000sha256.tdl.dto.ChatMembersFilterDto
import dev.g000sha256.tdl.dto.ChatMessageSendersDto
import dev.g000sha256.tdl.dto.ChatNotificationSettingsDto
import dev.g000sha256.tdl.dto.ChatPermissionsDto
import dev.g000sha256.tdl.dto.ChatPhotosDto
import dev.g000sha256.tdl.dto.ChatRevenueStatisticsDto
import dev.g000sha256.tdl.dto.ChatRevenueTransactionsDto
import dev.g000sha256.tdl.dto.ChatStatisticsDto
import dev.g000sha256.tdl.dto.ChatsDto
import dev.g000sha256.tdl.dto.CheckChatUsernameResultDto
import dev.g000sha256.tdl.dto.CheckStickerSetNameResultDto
import dev.g000sha256.tdl.dto.CollectibleItemInfoDto
import dev.g000sha256.tdl.dto.CollectibleItemTypeDto
import dev.g000sha256.tdl.dto.ConnectedAffiliateProgramDto
import dev.g000sha256.tdl.dto.ConnectedAffiliateProgramsDto
import dev.g000sha256.tdl.dto.ConnectedWebsitesDto
import dev.g000sha256.tdl.dto.ContactDto
import dev.g000sha256.tdl.dto.CountDto
import dev.g000sha256.tdl.dto.CountriesDto
import dev.g000sha256.tdl.dto.CreatedBasicGroupChatDto
import dev.g000sha256.tdl.dto.CurrentWeatherDto
import dev.g000sha256.tdl.dto.CustomRequestResultDto
import dev.g000sha256.tdl.dto.DataDto
import dev.g000sha256.tdl.dto.DatabaseStatisticsDto
import dev.g000sha256.tdl.dto.DeepLinkInfoDto
import dev.g000sha256.tdl.dto.DeviceTokenDto
import dev.g000sha256.tdl.dto.DraftMessageDto
import dev.g000sha256.tdl.dto.EmailAddressAuthenticationCodeInfoDto
import dev.g000sha256.tdl.dto.EmailAddressAuthenticationDto
import dev.g000sha256.tdl.dto.EmojiCategoriesDto
import dev.g000sha256.tdl.dto.EmojiCategoryTypeDto
import dev.g000sha256.tdl.dto.EmojiKeywordsDto
import dev.g000sha256.tdl.dto.EmojiReactionDto
import dev.g000sha256.tdl.dto.EmojiStatusCustomEmojisDto
import dev.g000sha256.tdl.dto.EmojiStatusDto
import dev.g000sha256.tdl.dto.EmojiStatusesDto
import dev.g000sha256.tdl.dto.EmojisDto
import dev.g000sha256.tdl.dto.ErrorDto
import dev.g000sha256.tdl.dto.FailedToAddMembersDto
import dev.g000sha256.tdl.dto.FileDownloadedPrefixSizeDto
import dev.g000sha256.tdl.dto.FileDto
import dev.g000sha256.tdl.dto.FileTypeDto
import dev.g000sha256.tdl.dto.FormattedTextDto
import dev.g000sha256.tdl.dto.ForumTopicDto
import dev.g000sha256.tdl.dto.ForumTopicIconDto
import dev.g000sha256.tdl.dto.ForumTopicInfoDto
import dev.g000sha256.tdl.dto.ForumTopicsDto
import dev.g000sha256.tdl.dto.FoundAffiliateProgramsDto
import dev.g000sha256.tdl.dto.FoundChatBoostsDto
import dev.g000sha256.tdl.dto.FoundChatMessagesDto
import dev.g000sha256.tdl.dto.FoundFileDownloadsDto
import dev.g000sha256.tdl.dto.FoundMessagesDto
import dev.g000sha256.tdl.dto.FoundPositionDto
import dev.g000sha256.tdl.dto.FoundPositionsDto
import dev.g000sha256.tdl.dto.FoundStoriesDto
import dev.g000sha256.tdl.dto.FoundUsersDto
import dev.g000sha256.tdl.dto.FoundWebAppDto
import dev.g000sha256.tdl.dto.GameHighScoresDto
import dev.g000sha256.tdl.dto.GiftSettingsDto
import dev.g000sha256.tdl.dto.GiftUpgradePreviewDto
import dev.g000sha256.tdl.dto.GiftsDto
import dev.g000sha256.tdl.dto.GiveawayInfoDto
import dev.g000sha256.tdl.dto.GiveawayParametersDto
import dev.g000sha256.tdl.dto.GroupCallDataChannelDto
import dev.g000sha256.tdl.dto.GroupCallDto
import dev.g000sha256.tdl.dto.GroupCallIdDto
import dev.g000sha256.tdl.dto.GroupCallInfoDto
import dev.g000sha256.tdl.dto.GroupCallJoinParametersDto
import dev.g000sha256.tdl.dto.GroupCallParticipantsDto
import dev.g000sha256.tdl.dto.GroupCallVideoQualityDto
import dev.g000sha256.tdl.dto.HashtagsDto
import dev.g000sha256.tdl.dto.HttpUrlDto
import dev.g000sha256.tdl.dto.ImportedContactsDto
import dev.g000sha256.tdl.dto.InlineQueryResultsButtonDto
import dev.g000sha256.tdl.dto.InlineQueryResultsDto
import dev.g000sha256.tdl.dto.InputBackgroundDto
import dev.g000sha256.tdl.dto.InputBusinessChatLinkDto
import dev.g000sha256.tdl.dto.InputBusinessStartPageDto
import dev.g000sha256.tdl.dto.InputChatPhotoDto
import dev.g000sha256.tdl.dto.InputCredentialsDto
import dev.g000sha256.tdl.dto.InputFileDto
import dev.g000sha256.tdl.dto.InputGroupCallDto
import dev.g000sha256.tdl.dto.InputInlineQueryResultDto
import dev.g000sha256.tdl.dto.InputInvoiceDto
import dev.g000sha256.tdl.dto.InputMessageContentDto
import dev.g000sha256.tdl.dto.InputMessageReplyToDto
import dev.g000sha256.tdl.dto.InputPassportElementDto
import dev.g000sha256.tdl.dto.InputPassportElementErrorDto
import dev.g000sha256.tdl.dto.InputStickerDto
import dev.g000sha256.tdl.dto.InputStoryAreasDto
import dev.g000sha256.tdl.dto.InputStoryContentDto
import dev.g000sha256.tdl.dto.InputTextQuoteDto
import dev.g000sha256.tdl.dto.InternalLinkTypeDto
import dev.g000sha256.tdl.dto.InviteGroupCallParticipantResultDto
import dev.g000sha256.tdl.dto.JsonValueDto
import dev.g000sha256.tdl.dto.LanguagePackInfoDto
import dev.g000sha256.tdl.dto.LanguagePackStringDto
import dev.g000sha256.tdl.dto.LanguagePackStringValueDto
import dev.g000sha256.tdl.dto.LanguagePackStringsDto
import dev.g000sha256.tdl.dto.LinkPreviewDto
import dev.g000sha256.tdl.dto.LinkPreviewOptionsDto
import dev.g000sha256.tdl.dto.LocalizationTargetInfoDto
import dev.g000sha256.tdl.dto.LocationAddressDto
import dev.g000sha256.tdl.dto.LocationDto
import dev.g000sha256.tdl.dto.LogStreamDto
import dev.g000sha256.tdl.dto.LogTagsDto
import dev.g000sha256.tdl.dto.LogVerbosityLevelDto
import dev.g000sha256.tdl.dto.LoginUrlInfoDto
import dev.g000sha256.tdl.dto.MainWebAppDto
import dev.g000sha256.tdl.dto.MaskPositionDto
import dev.g000sha256.tdl.dto.MessageAutoDeleteTimeDto
import dev.g000sha256.tdl.dto.MessageCalendarDto
import dev.g000sha256.tdl.dto.MessageDto
import dev.g000sha256.tdl.dto.MessageEffectDto
import dev.g000sha256.tdl.dto.MessageFileTypeDto
import dev.g000sha256.tdl.dto.MessageLinkDto
import dev.g000sha256.tdl.dto.MessageLinkInfoDto
import dev.g000sha256.tdl.dto.MessagePositionsDto
import dev.g000sha256.tdl.dto.MessagePropertiesDto
import dev.g000sha256.tdl.dto.MessageReadDateDto
import dev.g000sha256.tdl.dto.MessageSchedulingStateDto
import dev.g000sha256.tdl.dto.MessageSendOptionsDto
import dev.g000sha256.tdl.dto.MessageSenderDto
import dev.g000sha256.tdl.dto.MessageSendersDto
import dev.g000sha256.tdl.dto.MessageSourceDto
import dev.g000sha256.tdl.dto.MessageStatisticsDto
import dev.g000sha256.tdl.dto.MessageThreadInfoDto
import dev.g000sha256.tdl.dto.MessageViewersDto
import dev.g000sha256.tdl.dto.MessagesDto
import dev.g000sha256.tdl.dto.NetworkStatisticsDto
import dev.g000sha256.tdl.dto.NetworkStatisticsEntryDto
import dev.g000sha256.tdl.dto.NetworkTypeDto
import dev.g000sha256.tdl.dto.NewChatPrivacySettingsDto
import dev.g000sha256.tdl.dto.NotificationSettingsScopeDto
import dev.g000sha256.tdl.dto.NotificationSoundDto
import dev.g000sha256.tdl.dto.NotificationSoundsDto
import dev.g000sha256.tdl.dto.OkDto
import dev.g000sha256.tdl.dto.OptionValueDto
import dev.g000sha256.tdl.dto.OrderInfoDto
import dev.g000sha256.tdl.dto.OutlineDto
import dev.g000sha256.tdl.dto.PaidReactionTypeDto
import dev.g000sha256.tdl.dto.PassportAuthorizationFormDto
import dev.g000sha256.tdl.dto.PassportElementDto
import dev.g000sha256.tdl.dto.PassportElementTypeDto
import dev.g000sha256.tdl.dto.PassportElementsDto
import dev.g000sha256.tdl.dto.PassportElementsWithErrorsDto
import dev.g000sha256.tdl.dto.PasswordStateDto
import dev.g000sha256.tdl.dto.PaymentFormDto
import dev.g000sha256.tdl.dto.PaymentReceiptDto
import dev.g000sha256.tdl.dto.PaymentResultDto
import dev.g000sha256.tdl.dto.PhoneNumberAuthenticationSettingsDto
import dev.g000sha256.tdl.dto.PhoneNumberCodeTypeDto
import dev.g000sha256.tdl.dto.PhoneNumberInfoDto
import dev.g000sha256.tdl.dto.PremiumFeatureDto
import dev.g000sha256.tdl.dto.PremiumFeaturesDto
import dev.g000sha256.tdl.dto.PremiumGiftCodeInfoDto
import dev.g000sha256.tdl.dto.PremiumGiftPaymentOptionsDto
import dev.g000sha256.tdl.dto.PremiumGiveawayPaymentOptionsDto
import dev.g000sha256.tdl.dto.PremiumLimitDto
import dev.g000sha256.tdl.dto.PremiumLimitTypeDto
import dev.g000sha256.tdl.dto.PremiumSourceDto
import dev.g000sha256.tdl.dto.PremiumStateDto
import dev.g000sha256.tdl.dto.PreparedInlineMessageDto
import dev.g000sha256.tdl.dto.PreparedInlineMessageIdDto
import dev.g000sha256.tdl.dto.ProxiesDto
import dev.g000sha256.tdl.dto.ProxyDto
import dev.g000sha256.tdl.dto.ProxyTypeDto
import dev.g000sha256.tdl.dto.PublicChatTypeDto
import dev.g000sha256.tdl.dto.PublicForwardsDto
import dev.g000sha256.tdl.dto.PushReceiverIdDto
import dev.g000sha256.tdl.dto.QuickReplyMessageDto
import dev.g000sha256.tdl.dto.QuickReplyMessagesDto
import dev.g000sha256.tdl.dto.ReactionNotificationSettingsDto
import dev.g000sha256.tdl.dto.ReactionTypeDto
import dev.g000sha256.tdl.dto.ReadDatePrivacySettingsDto
import dev.g000sha256.tdl.dto.ReceivedGiftDto
import dev.g000sha256.tdl.dto.ReceivedGiftsDto
import dev.g000sha256.tdl.dto.RecommendedChatFoldersDto
import dev.g000sha256.tdl.dto.RecoveryEmailAddressDto
import dev.g000sha256.tdl.dto.ReplyMarkupDto
import dev.g000sha256.tdl.dto.ReportChatResultDto
import dev.g000sha256.tdl.dto.ReportReasonDto
import dev.g000sha256.tdl.dto.ReportSponsoredResultDto
import dev.g000sha256.tdl.dto.ReportStoryResultDto
import dev.g000sha256.tdl.dto.ResendCodeReasonDto
import dev.g000sha256.tdl.dto.ResetPasswordResultDto
import dev.g000sha256.tdl.dto.RtmpUrlDto
import dev.g000sha256.tdl.dto.SavedMessagesTagsDto
import dev.g000sha256.tdl.dto.ScopeAutosaveSettingsDto
import dev.g000sha256.tdl.dto.ScopeNotificationSettingsDto
import dev.g000sha256.tdl.dto.SearchMessagesChatTypeFilterDto
import dev.g000sha256.tdl.dto.SearchMessagesFilterDto
import dev.g000sha256.tdl.dto.SecondsDto
import dev.g000sha256.tdl.dto.SecretChatDto
import dev.g000sha256.tdl.dto.SentWebAppMessageDto
import dev.g000sha256.tdl.dto.SessionDto
import dev.g000sha256.tdl.dto.SessionsDto
import dev.g000sha256.tdl.dto.ShippingOptionDto
import dev.g000sha256.tdl.dto.SponsoredChatsDto
import dev.g000sha256.tdl.dto.SponsoredMessagesDto
import dev.g000sha256.tdl.dto.StarAmountDto
import dev.g000sha256.tdl.dto.StarCountDto
import dev.g000sha256.tdl.dto.StarGiveawayPaymentOptionsDto
import dev.g000sha256.tdl.dto.StarPaymentOptionsDto
import dev.g000sha256.tdl.dto.StarRevenueStatisticsDto
import dev.g000sha256.tdl.dto.StarSubscriptionPricingDto
import dev.g000sha256.tdl.dto.StarSubscriptionsDto
import dev.g000sha256.tdl.dto.StarTransactionDirectionDto
import dev.g000sha256.tdl.dto.StarTransactionsDto
import dev.g000sha256.tdl.dto.StatisticalGraphDto
import dev.g000sha256.tdl.dto.StickerDto
import dev.g000sha256.tdl.dto.StickerFormatDto
import dev.g000sha256.tdl.dto.StickerSetDto
import dev.g000sha256.tdl.dto.StickerSetsDto
import dev.g000sha256.tdl.dto.StickerTypeDto
import dev.g000sha256.tdl.dto.StickersDto
import dev.g000sha256.tdl.dto.StorageStatisticsDto
import dev.g000sha256.tdl.dto.StorageStatisticsFastDto
import dev.g000sha256.tdl.dto.StorePaymentPurposeDto
import dev.g000sha256.tdl.dto.StoreTransactionDto
import dev.g000sha256.tdl.dto.StoriesDto
import dev.g000sha256.tdl.dto.StoryDto
import dev.g000sha256.tdl.dto.StoryFullIdDto
import dev.g000sha256.tdl.dto.StoryInteractionsDto
import dev.g000sha256.tdl.dto.StoryListDto
import dev.g000sha256.tdl.dto.StoryPrivacySettingsDto
import dev.g000sha256.tdl.dto.StoryStatisticsDto
import dev.g000sha256.tdl.dto.SuggestedActionDto
import dev.g000sha256.tdl.dto.SupergroupDto
import dev.g000sha256.tdl.dto.SupergroupFullInfoDto
import dev.g000sha256.tdl.dto.SupergroupMembersFilterDto
import dev.g000sha256.tdl.dto.TMeUrlsDto
import dev.g000sha256.tdl.dto.TargetChatTypesDto
import dev.g000sha256.tdl.dto.TemporaryPasswordStateDto
import dev.g000sha256.tdl.dto.TestBytesDto
import dev.g000sha256.tdl.dto.TestIntDto
import dev.g000sha256.tdl.dto.TestStringDto
import dev.g000sha256.tdl.dto.TestVectorIntDto
import dev.g000sha256.tdl.dto.TestVectorIntObjectDto
import dev.g000sha256.tdl.dto.TestVectorStringDto
import dev.g000sha256.tdl.dto.TestVectorStringObjectDto
import dev.g000sha256.tdl.dto.TextDto
import dev.g000sha256.tdl.dto.TextEntitiesDto
import dev.g000sha256.tdl.dto.TextParseModeDto
import dev.g000sha256.tdl.dto.ThemeParametersDto
import dev.g000sha256.tdl.dto.TimeZonesDto
import dev.g000sha256.tdl.dto.TopChatCategoryDto
import dev.g000sha256.tdl.dto.TrendingStickerSetsDto
import dev.g000sha256.tdl.dto.UpdatesDto
import dev.g000sha256.tdl.dto.UpgradeGiftResultDto
import dev.g000sha256.tdl.dto.UpgradedGiftDto
import dev.g000sha256.tdl.dto.UserDto
import dev.g000sha256.tdl.dto.UserFullInfoDto
import dev.g000sha256.tdl.dto.UserLinkDto
import dev.g000sha256.tdl.dto.UserPrivacySettingDto
import dev.g000sha256.tdl.dto.UserPrivacySettingRulesDto
import dev.g000sha256.tdl.dto.UserSupportInfoDto
import dev.g000sha256.tdl.dto.UsersDto
import dev.g000sha256.tdl.dto.ValidatedOrderInfoDto
import dev.g000sha256.tdl.dto.VideoChatStreamsDto
import dev.g000sha256.tdl.dto.WebAppInfoDto
import dev.g000sha256.tdl.dto.WebAppOpenParametersDto
import dev.g000sha256.tdl.dto.WebPageInstantViewDto
import dev.g000sha256.tdl.dto.update.AccentColorsUpdateDto
import dev.g000sha256.tdl.dto.update.ActiveEmojiReactionsUpdateDto
import dev.g000sha256.tdl.dto.update.ActiveLiveLocationMessagesUpdateDto
import dev.g000sha256.tdl.dto.update.ActiveNotificationsUpdateDto
import dev.g000sha256.tdl.dto.update.AnimatedEmojiMessageClickedUpdateDto
import dev.g000sha256.tdl.dto.update.AnimationSearchParametersUpdateDto
import dev.g000sha256.tdl.dto.update.ApplicationRecaptchaVerificationRequiredUpdateDto
import dev.g000sha256.tdl.dto.update.ApplicationVerificationRequiredUpdateDto
import dev.g000sha256.tdl.dto.update.AttachmentMenuBotsUpdateDto
import dev.g000sha256.tdl.dto.update.AuthorizationStateUpdateDto
import dev.g000sha256.tdl.dto.update.AutosaveSettingsUpdateDto
import dev.g000sha256.tdl.dto.update.AvailableMessageEffectsUpdateDto
import dev.g000sha256.tdl.dto.update.BasicGroupFullInfoUpdateDto
import dev.g000sha256.tdl.dto.update.BasicGroupUpdateDto
import dev.g000sha256.tdl.dto.update.BusinessConnectionUpdateDto
import dev.g000sha256.tdl.dto.update.BusinessMessageEditedUpdateDto
import dev.g000sha256.tdl.dto.update.BusinessMessagesDeletedUpdateDto
import dev.g000sha256.tdl.dto.update.CallUpdateDto
import dev.g000sha256.tdl.dto.update.ChatAccentColorsUpdateDto
import dev.g000sha256.tdl.dto.update.ChatActionBarUpdateDto
import dev.g000sha256.tdl.dto.update.ChatActionUpdateDto
import dev.g000sha256.tdl.dto.update.ChatActiveStoriesUpdateDto
import dev.g000sha256.tdl.dto.update.ChatAddedToListUpdateDto
import dev.g000sha256.tdl.dto.update.ChatAvailableReactionsUpdateDto
import dev.g000sha256.tdl.dto.update.ChatBackgroundUpdateDto
import dev.g000sha256.tdl.dto.update.ChatBlockListUpdateDto
import dev.g000sha256.tdl.dto.update.ChatBoostUpdateDto
import dev.g000sha256.tdl.dto.update.ChatBusinessBotManageBarUpdateDto
import dev.g000sha256.tdl.dto.update.ChatDefaultDisableNotificationUpdateDto
import dev.g000sha256.tdl.dto.update.ChatDraftMessageUpdateDto
import dev.g000sha256.tdl.dto.update.ChatEmojiStatusUpdateDto
import dev.g000sha256.tdl.dto.update.ChatFoldersUpdateDto
import dev.g000sha256.tdl.dto.update.ChatHasProtectedContentUpdateDto
import dev.g000sha256.tdl.dto.update.ChatHasScheduledMessagesUpdateDto
import dev.g000sha256.tdl.dto.update.ChatIsMarkedAsUnreadUpdateDto
import dev.g000sha256.tdl.dto.update.ChatIsTranslatableUpdateDto
import dev.g000sha256.tdl.dto.update.ChatLastMessageUpdateDto
import dev.g000sha256.tdl.dto.update.ChatMemberUpdateDto
import dev.g000sha256.tdl.dto.update.ChatMessageAutoDeleteTimeUpdateDto
import dev.g000sha256.tdl.dto.update.ChatMessageSenderUpdateDto
import dev.g000sha256.tdl.dto.update.ChatNotificationSettingsUpdateDto
import dev.g000sha256.tdl.dto.update.ChatOnlineMemberCountUpdateDto
import dev.g000sha256.tdl.dto.update.ChatPendingJoinRequestsUpdateDto
import dev.g000sha256.tdl.dto.update.ChatPermissionsUpdateDto
import dev.g000sha256.tdl.dto.update.ChatPhotoUpdateDto
import dev.g000sha256.tdl.dto.update.ChatPositionUpdateDto
import dev.g000sha256.tdl.dto.update.ChatReadInboxUpdateDto
import dev.g000sha256.tdl.dto.update.ChatReadOutboxUpdateDto
import dev.g000sha256.tdl.dto.update.ChatRemovedFromListUpdateDto
import dev.g000sha256.tdl.dto.update.ChatReplyMarkupUpdateDto
import dev.g000sha256.tdl.dto.update.ChatRevenueAmountUpdateDto
import dev.g000sha256.tdl.dto.update.ChatThemeUpdateDto
import dev.g000sha256.tdl.dto.update.ChatThemesUpdateDto
import dev.g000sha256.tdl.dto.update.ChatTitleUpdateDto
import dev.g000sha256.tdl.dto.update.ChatUnreadMentionCountUpdateDto
import dev.g000sha256.tdl.dto.update.ChatUnreadReactionCountUpdateDto
import dev.g000sha256.tdl.dto.update.ChatVideoChatUpdateDto
import dev.g000sha256.tdl.dto.update.ChatViewAsTopicsUpdateDto
import dev.g000sha256.tdl.dto.update.ConnectionStateUpdateDto
import dev.g000sha256.tdl.dto.update.ContactCloseBirthdaysUpdateDto
import dev.g000sha256.tdl.dto.update.DefaultBackgroundUpdateDto
import dev.g000sha256.tdl.dto.update.DefaultPaidReactionTypeUpdateDto
import dev.g000sha256.tdl.dto.update.DefaultReactionTypeUpdateDto
import dev.g000sha256.tdl.dto.update.DeleteMessagesUpdateDto
import dev.g000sha256.tdl.dto.update.DiceEmojisUpdateDto
import dev.g000sha256.tdl.dto.update.FavoriteStickersUpdateDto
import dev.g000sha256.tdl.dto.update.FileAddedToDownloadsUpdateDto
import dev.g000sha256.tdl.dto.update.FileDownloadUpdateDto
import dev.g000sha256.tdl.dto.update.FileDownloadsUpdateDto
import dev.g000sha256.tdl.dto.update.FileGenerationStartUpdateDto
import dev.g000sha256.tdl.dto.update.FileGenerationStopUpdateDto
import dev.g000sha256.tdl.dto.update.FileRemovedFromDownloadsUpdateDto
import dev.g000sha256.tdl.dto.update.FileUpdateDto
import dev.g000sha256.tdl.dto.update.ForumTopicInfoUpdateDto
import dev.g000sha256.tdl.dto.update.ForumTopicUpdateDto
import dev.g000sha256.tdl.dto.update.FreezeStateUpdateDto
import dev.g000sha256.tdl.dto.update.GroupCallParticipantUpdateDto
import dev.g000sha256.tdl.dto.update.GroupCallParticipantsUpdateDto
import dev.g000sha256.tdl.dto.update.GroupCallUpdateDto
import dev.g000sha256.tdl.dto.update.GroupCallVerificationStateUpdateDto
import dev.g000sha256.tdl.dto.update.HavePendingNotificationsUpdateDto
import dev.g000sha256.tdl.dto.update.InstalledStickerSetsUpdateDto
import dev.g000sha256.tdl.dto.update.LanguagePackStringsUpdateDto
import dev.g000sha256.tdl.dto.update.MessageContentOpenedUpdateDto
import dev.g000sha256.tdl.dto.update.MessageContentUpdateDto
import dev.g000sha256.tdl.dto.update.MessageEditedUpdateDto
import dev.g000sha256.tdl.dto.update.MessageFactCheckUpdateDto
import dev.g000sha256.tdl.dto.update.MessageInteractionInfoUpdateDto
import dev.g000sha256.tdl.dto.update.MessageIsPinnedUpdateDto
import dev.g000sha256.tdl.dto.update.MessageLiveLocationViewedUpdateDto
import dev.g000sha256.tdl.dto.update.MessageMentionReadUpdateDto
import dev.g000sha256.tdl.dto.update.MessageReactionUpdateDto
import dev.g000sha256.tdl.dto.update.MessageReactionsUpdateDto
import dev.g000sha256.tdl.dto.update.MessageSendAcknowledgedUpdateDto
import dev.g000sha256.tdl.dto.update.MessageSendFailedUpdateDto
import dev.g000sha256.tdl.dto.update.MessageSendSucceededUpdateDto
import dev.g000sha256.tdl.dto.update.MessageUnreadReactionsUpdateDto
import dev.g000sha256.tdl.dto.update.NewBusinessCallbackQueryUpdateDto
import dev.g000sha256.tdl.dto.update.NewBusinessMessageUpdateDto
import dev.g000sha256.tdl.dto.update.NewCallSignalingDataUpdateDto
import dev.g000sha256.tdl.dto.update.NewCallbackQueryUpdateDto
import dev.g000sha256.tdl.dto.update.NewChatJoinRequestUpdateDto
import dev.g000sha256.tdl.dto.update.NewChatUpdateDto
import dev.g000sha256.tdl.dto.update.NewChosenInlineResultUpdateDto
import dev.g000sha256.tdl.dto.update.NewCustomEventUpdateDto
import dev.g000sha256.tdl.dto.update.NewCustomQueryUpdateDto
import dev.g000sha256.tdl.dto.update.NewInlineCallbackQueryUpdateDto
import dev.g000sha256.tdl.dto.update.NewInlineQueryUpdateDto
import dev.g000sha256.tdl.dto.update.NewMessageUpdateDto
import dev.g000sha256.tdl.dto.update.NewPreCheckoutQueryUpdateDto
import dev.g000sha256.tdl.dto.update.NewShippingQueryUpdateDto
import dev.g000sha256.tdl.dto.update.NotificationGroupUpdateDto
import dev.g000sha256.tdl.dto.update.NotificationUpdateDto
import dev.g000sha256.tdl.dto.update.OptionUpdateDto
import dev.g000sha256.tdl.dto.update.OwnedStarCountUpdateDto
import dev.g000sha256.tdl.dto.update.PaidMediaPurchasedUpdateDto
import dev.g000sha256.tdl.dto.update.PollAnswerUpdateDto
import dev.g000sha256.tdl.dto.update.PollUpdateDto
import dev.g000sha256.tdl.dto.update.ProfileAccentColorsUpdateDto
import dev.g000sha256.tdl.dto.update.QuickReplyShortcutDeletedUpdateDto
import dev.g000sha256.tdl.dto.update.QuickReplyShortcutMessagesUpdateDto
import dev.g000sha256.tdl.dto.update.QuickReplyShortcutUpdateDto
import dev.g000sha256.tdl.dto.update.QuickReplyShortcutsUpdateDto
import dev.g000sha256.tdl.dto.update.ReactionNotificationSettingsUpdateDto
import dev.g000sha256.tdl.dto.update.RecentStickersUpdateDto
import dev.g000sha256.tdl.dto.update.SavedAnimationsUpdateDto
import dev.g000sha256.tdl.dto.update.SavedMessagesTagsUpdateDto
import dev.g000sha256.tdl.dto.update.SavedMessagesTopicCountUpdateDto
import dev.g000sha256.tdl.dto.update.SavedMessagesTopicUpdateDto
import dev.g000sha256.tdl.dto.update.SavedNotificationSoundsUpdateDto
import dev.g000sha256.tdl.dto.update.ScopeNotificationSettingsUpdateDto
import dev.g000sha256.tdl.dto.update.SecretChatUpdateDto
import dev.g000sha256.tdl.dto.update.ServiceNotificationUpdateDto
import dev.g000sha256.tdl.dto.update.SpeechRecognitionTrialUpdateDto
import dev.g000sha256.tdl.dto.update.SpeedLimitNotificationUpdateDto
import dev.g000sha256.tdl.dto.update.StarRevenueStatusUpdateDto
import dev.g000sha256.tdl.dto.update.StickerSetUpdateDto
import dev.g000sha256.tdl.dto.update.StoryDeletedUpdateDto
import dev.g000sha256.tdl.dto.update.StoryListChatCountUpdateDto
import dev.g000sha256.tdl.dto.update.StoryPostFailedUpdateDto
import dev.g000sha256.tdl.dto.update.StoryPostSucceededUpdateDto
import dev.g000sha256.tdl.dto.update.StoryStealthModeUpdateDto
import dev.g000sha256.tdl.dto.update.StoryUpdateDto
import dev.g000sha256.tdl.dto.update.SuggestedActionsUpdateDto
import dev.g000sha256.tdl.dto.update.SupergroupFullInfoUpdateDto
import dev.g000sha256.tdl.dto.update.SupergroupUpdateDto
import dev.g000sha256.tdl.dto.update.TermsOfServiceUpdateDto
import dev.g000sha256.tdl.dto.update.TrendingStickerSetsUpdateDto
import dev.g000sha256.tdl.dto.update.UnconfirmedSessionUpdateDto
import dev.g000sha256.tdl.dto.update.UnreadChatCountUpdateDto
import dev.g000sha256.tdl.dto.update.UnreadMessageCountUpdateDto
import dev.g000sha256.tdl.dto.update.UpdateDto
import dev.g000sha256.tdl.dto.update.UserFullInfoUpdateDto
import dev.g000sha256.tdl.dto.update.UserPrivacySettingRulesUpdateDto
import dev.g000sha256.tdl.dto.update.UserStatusUpdateDto
import dev.g000sha256.tdl.dto.update.UserUpdateDto
import dev.g000sha256.tdl.dto.update.VideoPublishedUpdateDto
import dev.g000sha256.tdl.dto.update.WebAppMessageSentUpdateDto
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
    override val authorizationStateUpdates: Flow<AuthorizationStateUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateAuthorizationState::class) { mapper.map(it) }

    override val newMessageUpdates: Flow<NewMessageUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateNewMessage::class) { mapper.map(it) }

    override val messageSendAcknowledgedUpdates: Flow<MessageSendAcknowledgedUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateMessageSendAcknowledged::class) { mapper.map(it) }

    override val messageSendSucceededUpdates: Flow<MessageSendSucceededUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateMessageSendSucceeded::class) { mapper.map(it) }

    override val messageSendFailedUpdates: Flow<MessageSendFailedUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateMessageSendFailed::class) { mapper.map(it) }

    override val messageContentUpdates: Flow<MessageContentUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateMessageContent::class) { mapper.map(it) }

    override val messageEditedUpdates: Flow<MessageEditedUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateMessageEdited::class) { mapper.map(it) }

    override val messageIsPinnedUpdates: Flow<MessageIsPinnedUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateMessageIsPinned::class) { mapper.map(it) }

    override val messageInteractionInfoUpdates: Flow<MessageInteractionInfoUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateMessageInteractionInfo::class) { mapper.map(it) }

    override val messageContentOpenedUpdates: Flow<MessageContentOpenedUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateMessageContentOpened::class) { mapper.map(it) }

    override val messageMentionReadUpdates: Flow<MessageMentionReadUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateMessageMentionRead::class) { mapper.map(it) }

    override val messageUnreadReactionsUpdates: Flow<MessageUnreadReactionsUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateMessageUnreadReactions::class) { mapper.map(it) }

    override val messageFactCheckUpdates: Flow<MessageFactCheckUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateMessageFactCheck::class) { mapper.map(it) }

    override val messageLiveLocationViewedUpdates: Flow<MessageLiveLocationViewedUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateMessageLiveLocationViewed::class) { mapper.map(it) }

    override val videoPublishedUpdates: Flow<VideoPublishedUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateVideoPublished::class) { mapper.map(it) }

    override val newChatUpdates: Flow<NewChatUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateNewChat::class) { mapper.map(it) }

    override val chatTitleUpdates: Flow<ChatTitleUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatTitle::class) { mapper.map(it) }

    override val chatPhotoUpdates: Flow<ChatPhotoUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatPhoto::class) { mapper.map(it) }

    override val chatAccentColorsUpdates: Flow<ChatAccentColorsUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatAccentColors::class) { mapper.map(it) }

    override val chatPermissionsUpdates: Flow<ChatPermissionsUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatPermissions::class) { mapper.map(it) }

    override val chatLastMessageUpdates: Flow<ChatLastMessageUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatLastMessage::class) { mapper.map(it) }

    override val chatPositionUpdates: Flow<ChatPositionUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatPosition::class) { mapper.map(it) }

    override val chatAddedToListUpdates: Flow<ChatAddedToListUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatAddedToList::class) { mapper.map(it) }

    override val chatRemovedFromListUpdates: Flow<ChatRemovedFromListUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatRemovedFromList::class) { mapper.map(it) }

    override val chatReadInboxUpdates: Flow<ChatReadInboxUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatReadInbox::class) { mapper.map(it) }

    override val chatReadOutboxUpdates: Flow<ChatReadOutboxUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatReadOutbox::class) { mapper.map(it) }

    override val chatActionBarUpdates: Flow<ChatActionBarUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatActionBar::class) { mapper.map(it) }

    override val chatBusinessBotManageBarUpdates: Flow<ChatBusinessBotManageBarUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatBusinessBotManageBar::class) { mapper.map(it) }

    override val chatAvailableReactionsUpdates: Flow<ChatAvailableReactionsUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatAvailableReactions::class) { mapper.map(it) }

    override val chatDraftMessageUpdates: Flow<ChatDraftMessageUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatDraftMessage::class) { mapper.map(it) }

    override val chatEmojiStatusUpdates: Flow<ChatEmojiStatusUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatEmojiStatus::class) { mapper.map(it) }

    override val chatMessageSenderUpdates: Flow<ChatMessageSenderUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatMessageSender::class) { mapper.map(it) }

    override val chatMessageAutoDeleteTimeUpdates: Flow<ChatMessageAutoDeleteTimeUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatMessageAutoDeleteTime::class) { mapper.map(it) }

    override val chatNotificationSettingsUpdates: Flow<ChatNotificationSettingsUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatNotificationSettings::class) { mapper.map(it) }

    override val chatPendingJoinRequestsUpdates: Flow<ChatPendingJoinRequestsUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatPendingJoinRequests::class) { mapper.map(it) }

    override val chatReplyMarkupUpdates: Flow<ChatReplyMarkupUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatReplyMarkup::class) { mapper.map(it) }

    override val chatBackgroundUpdates: Flow<ChatBackgroundUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatBackground::class) { mapper.map(it) }

    override val chatThemeUpdates: Flow<ChatThemeUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatTheme::class) { mapper.map(it) }

    override val chatUnreadMentionCountUpdates: Flow<ChatUnreadMentionCountUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatUnreadMentionCount::class) { mapper.map(it) }

    override val chatUnreadReactionCountUpdates: Flow<ChatUnreadReactionCountUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatUnreadReactionCount::class) { mapper.map(it) }

    override val chatVideoChatUpdates: Flow<ChatVideoChatUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatVideoChat::class) { mapper.map(it) }

    override val chatDefaultDisableNotificationUpdates:
            Flow<ChatDefaultDisableNotificationUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatDefaultDisableNotification::class) { mapper.map(it) }

    override val chatHasProtectedContentUpdates: Flow<ChatHasProtectedContentUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatHasProtectedContent::class) { mapper.map(it) }

    override val chatIsTranslatableUpdates: Flow<ChatIsTranslatableUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatIsTranslatable::class) { mapper.map(it) }

    override val chatIsMarkedAsUnreadUpdates: Flow<ChatIsMarkedAsUnreadUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatIsMarkedAsUnread::class) { mapper.map(it) }

    override val chatViewAsTopicsUpdates: Flow<ChatViewAsTopicsUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatViewAsTopics::class) { mapper.map(it) }

    override val chatBlockListUpdates: Flow<ChatBlockListUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatBlockList::class) { mapper.map(it) }

    override val chatHasScheduledMessagesUpdates: Flow<ChatHasScheduledMessagesUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatHasScheduledMessages::class) { mapper.map(it) }

    override val chatFoldersUpdates: Flow<ChatFoldersUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatFolders::class) { mapper.map(it) }

    override val chatOnlineMemberCountUpdates: Flow<ChatOnlineMemberCountUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatOnlineMemberCount::class) { mapper.map(it) }

    override val savedMessagesTopicUpdates: Flow<SavedMessagesTopicUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateSavedMessagesTopic::class) { mapper.map(it) }

    override val savedMessagesTopicCountUpdates: Flow<SavedMessagesTopicCountUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateSavedMessagesTopicCount::class) { mapper.map(it) }

    override val quickReplyShortcutUpdates: Flow<QuickReplyShortcutUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateQuickReplyShortcut::class) { mapper.map(it) }

    override val quickReplyShortcutDeletedUpdates: Flow<QuickReplyShortcutDeletedUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateQuickReplyShortcutDeleted::class) { mapper.map(it) }

    override val quickReplyShortcutsUpdates: Flow<QuickReplyShortcutsUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateQuickReplyShortcuts::class) { mapper.map(it) }

    override val quickReplyShortcutMessagesUpdates: Flow<QuickReplyShortcutMessagesUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateQuickReplyShortcutMessages::class) { mapper.map(it) }

    override val forumTopicInfoUpdates: Flow<ForumTopicInfoUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateForumTopicInfo::class) { mapper.map(it) }

    override val forumTopicUpdates: Flow<ForumTopicUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateForumTopic::class) { mapper.map(it) }

    override val scopeNotificationSettingsUpdates: Flow<ScopeNotificationSettingsUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateScopeNotificationSettings::class) { mapper.map(it) }

    override val reactionNotificationSettingsUpdates: Flow<ReactionNotificationSettingsUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateReactionNotificationSettings::class) { mapper.map(it) }

    override val notificationUpdates: Flow<NotificationUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateNotification::class) { mapper.map(it) }

    override val notificationGroupUpdates: Flow<NotificationGroupUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateNotificationGroup::class) { mapper.map(it) }

    override val activeNotificationsUpdates: Flow<ActiveNotificationsUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateActiveNotifications::class) { mapper.map(it) }

    override val havePendingNotificationsUpdates: Flow<HavePendingNotificationsUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateHavePendingNotifications::class) { mapper.map(it) }

    override val deleteMessagesUpdates: Flow<DeleteMessagesUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateDeleteMessages::class) { mapper.map(it) }

    override val chatActionUpdates: Flow<ChatActionUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatAction::class) { mapper.map(it) }

    override val userStatusUpdates: Flow<UserStatusUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateUserStatus::class) { mapper.map(it) }

    override val userUpdates: Flow<UserUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateUser::class) { mapper.map(it) }

    override val basicGroupUpdates: Flow<BasicGroupUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateBasicGroup::class) { mapper.map(it) }

    override val supergroupUpdates: Flow<SupergroupUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateSupergroup::class) { mapper.map(it) }

    override val secretChatUpdates: Flow<SecretChatUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateSecretChat::class) { mapper.map(it) }

    override val userFullInfoUpdates: Flow<UserFullInfoUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateUserFullInfo::class) { mapper.map(it) }

    override val basicGroupFullInfoUpdates: Flow<BasicGroupFullInfoUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateBasicGroupFullInfo::class) { mapper.map(it) }

    override val supergroupFullInfoUpdates: Flow<SupergroupFullInfoUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateSupergroupFullInfo::class) { mapper.map(it) }

    override val serviceNotificationUpdates: Flow<ServiceNotificationUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateServiceNotification::class) { mapper.map(it) }

    override val fileUpdates: Flow<FileUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateFile::class) { mapper.map(it) }

    override val fileGenerationStartUpdates: Flow<FileGenerationStartUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateFileGenerationStart::class) { mapper.map(it) }

    override val fileGenerationStopUpdates: Flow<FileGenerationStopUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateFileGenerationStop::class) { mapper.map(it) }

    override val fileDownloadsUpdates: Flow<FileDownloadsUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateFileDownloads::class) { mapper.map(it) }

    override val fileAddedToDownloadsUpdates: Flow<FileAddedToDownloadsUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateFileAddedToDownloads::class) { mapper.map(it) }

    override val fileDownloadUpdates: Flow<FileDownloadUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateFileDownload::class) { mapper.map(it) }

    override val fileRemovedFromDownloadsUpdates: Flow<FileRemovedFromDownloadsUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateFileRemovedFromDownloads::class) { mapper.map(it) }

    override val applicationVerificationRequiredUpdates:
            Flow<ApplicationVerificationRequiredUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateApplicationVerificationRequired::class) { mapper.map(it) }

    override val applicationRecaptchaVerificationRequiredUpdates:
            Flow<ApplicationRecaptchaVerificationRequiredUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateApplicationRecaptchaVerificationRequired::class) { mapper.map(it) }

    override val callUpdates: Flow<CallUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateCall::class) { mapper.map(it) }

    override val groupCallUpdates: Flow<GroupCallUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateGroupCall::class) { mapper.map(it) }

    override val groupCallParticipantUpdates: Flow<GroupCallParticipantUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateGroupCallParticipant::class) { mapper.map(it) }

    override val groupCallParticipantsUpdates: Flow<GroupCallParticipantsUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateGroupCallParticipants::class) { mapper.map(it) }

    override val groupCallVerificationStateUpdates: Flow<GroupCallVerificationStateUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateGroupCallVerificationState::class) { mapper.map(it) }

    override val newCallSignalingDataUpdates: Flow<NewCallSignalingDataUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateNewCallSignalingData::class) { mapper.map(it) }

    override val userPrivacySettingRulesUpdates: Flow<UserPrivacySettingRulesUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateUserPrivacySettingRules::class) { mapper.map(it) }

    override val unreadMessageCountUpdates: Flow<UnreadMessageCountUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateUnreadMessageCount::class) { mapper.map(it) }

    override val unreadChatCountUpdates: Flow<UnreadChatCountUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateUnreadChatCount::class) { mapper.map(it) }

    override val storyUpdates: Flow<StoryUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateStory::class) { mapper.map(it) }

    override val storyDeletedUpdates: Flow<StoryDeletedUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateStoryDeleted::class) { mapper.map(it) }

    override val storyPostSucceededUpdates: Flow<StoryPostSucceededUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateStoryPostSucceeded::class) { mapper.map(it) }

    override val storyPostFailedUpdates: Flow<StoryPostFailedUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateStoryPostFailed::class) { mapper.map(it) }

    override val chatActiveStoriesUpdates: Flow<ChatActiveStoriesUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatActiveStories::class) { mapper.map(it) }

    override val storyListChatCountUpdates: Flow<StoryListChatCountUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateStoryListChatCount::class) { mapper.map(it) }

    override val storyStealthModeUpdates: Flow<StoryStealthModeUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateStoryStealthMode::class) { mapper.map(it) }

    override val optionUpdates: Flow<OptionUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateOption::class) { mapper.map(it) }

    override val stickerSetUpdates: Flow<StickerSetUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateStickerSet::class) { mapper.map(it) }

    override val installedStickerSetsUpdates: Flow<InstalledStickerSetsUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateInstalledStickerSets::class) { mapper.map(it) }

    override val trendingStickerSetsUpdates: Flow<TrendingStickerSetsUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateTrendingStickerSets::class) { mapper.map(it) }

    override val recentStickersUpdates: Flow<RecentStickersUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateRecentStickers::class) { mapper.map(it) }

    override val favoriteStickersUpdates: Flow<FavoriteStickersUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateFavoriteStickers::class) { mapper.map(it) }

    override val savedAnimationsUpdates: Flow<SavedAnimationsUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateSavedAnimations::class) { mapper.map(it) }

    override val savedNotificationSoundsUpdates: Flow<SavedNotificationSoundsUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateSavedNotificationSounds::class) { mapper.map(it) }

    override val defaultBackgroundUpdates: Flow<DefaultBackgroundUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateDefaultBackground::class) { mapper.map(it) }

    override val chatThemesUpdates: Flow<ChatThemesUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatThemes::class) { mapper.map(it) }

    override val accentColorsUpdates: Flow<AccentColorsUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateAccentColors::class) { mapper.map(it) }

    override val profileAccentColorsUpdates: Flow<ProfileAccentColorsUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateProfileAccentColors::class) { mapper.map(it) }

    override val languagePackStringsUpdates: Flow<LanguagePackStringsUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateLanguagePackStrings::class) { mapper.map(it) }

    override val connectionStateUpdates: Flow<ConnectionStateUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateConnectionState::class) { mapper.map(it) }

    override val freezeStateUpdates: Flow<FreezeStateUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateFreezeState::class) { mapper.map(it) }

    override val termsOfServiceUpdates: Flow<TermsOfServiceUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateTermsOfService::class) { mapper.map(it) }

    override val unconfirmedSessionUpdates: Flow<UnconfirmedSessionUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateUnconfirmedSession::class) { mapper.map(it) }

    override val attachmentMenuBotsUpdates: Flow<AttachmentMenuBotsUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateAttachmentMenuBots::class) { mapper.map(it) }

    override val webAppMessageSentUpdates: Flow<WebAppMessageSentUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateWebAppMessageSent::class) { mapper.map(it) }

    override val activeEmojiReactionsUpdates: Flow<ActiveEmojiReactionsUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateActiveEmojiReactions::class) { mapper.map(it) }

    override val availableMessageEffectsUpdates: Flow<AvailableMessageEffectsUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateAvailableMessageEffects::class) { mapper.map(it) }

    override val defaultReactionTypeUpdates: Flow<DefaultReactionTypeUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateDefaultReactionType::class) { mapper.map(it) }

    override val defaultPaidReactionTypeUpdates: Flow<DefaultPaidReactionTypeUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateDefaultPaidReactionType::class) { mapper.map(it) }

    override val savedMessagesTagsUpdates: Flow<SavedMessagesTagsUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateSavedMessagesTags::class) { mapper.map(it) }

    override val activeLiveLocationMessagesUpdates: Flow<ActiveLiveLocationMessagesUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateActiveLiveLocationMessages::class) { mapper.map(it) }

    override val ownedStarCountUpdates: Flow<OwnedStarCountUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateOwnedStarCount::class) { mapper.map(it) }

    override val chatRevenueAmountUpdates: Flow<ChatRevenueAmountUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatRevenueAmount::class) { mapper.map(it) }

    override val starRevenueStatusUpdates: Flow<StarRevenueStatusUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateStarRevenueStatus::class) { mapper.map(it) }

    override val speechRecognitionTrialUpdates: Flow<SpeechRecognitionTrialUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateSpeechRecognitionTrial::class) { mapper.map(it) }

    override val diceEmojisUpdates: Flow<DiceEmojisUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateDiceEmojis::class) { mapper.map(it) }

    override val animatedEmojiMessageClickedUpdates: Flow<AnimatedEmojiMessageClickedUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateAnimatedEmojiMessageClicked::class) { mapper.map(it) }

    override val animationSearchParametersUpdates: Flow<AnimationSearchParametersUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateAnimationSearchParameters::class) { mapper.map(it) }

    override val suggestedActionsUpdates: Flow<SuggestedActionsUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateSuggestedActions::class) { mapper.map(it) }

    override val speedLimitNotificationUpdates: Flow<SpeedLimitNotificationUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateSpeedLimitNotification::class) { mapper.map(it) }

    override val contactCloseBirthdaysUpdates: Flow<ContactCloseBirthdaysUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateContactCloseBirthdays::class) { mapper.map(it) }

    override val autosaveSettingsUpdates: Flow<AutosaveSettingsUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateAutosaveSettings::class) { mapper.map(it) }

    override val businessConnectionUpdates: Flow<BusinessConnectionUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateBusinessConnection::class) { mapper.map(it) }

    override val newBusinessMessageUpdates: Flow<NewBusinessMessageUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateNewBusinessMessage::class) { mapper.map(it) }

    override val businessMessageEditedUpdates: Flow<BusinessMessageEditedUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateBusinessMessageEdited::class) { mapper.map(it) }

    override val businessMessagesDeletedUpdates: Flow<BusinessMessagesDeletedUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateBusinessMessagesDeleted::class) { mapper.map(it) }

    override val newInlineQueryUpdates: Flow<NewInlineQueryUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateNewInlineQuery::class) { mapper.map(it) }

    override val newChosenInlineResultUpdates: Flow<NewChosenInlineResultUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateNewChosenInlineResult::class) { mapper.map(it) }

    override val newCallbackQueryUpdates: Flow<NewCallbackQueryUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateNewCallbackQuery::class) { mapper.map(it) }

    override val newInlineCallbackQueryUpdates: Flow<NewInlineCallbackQueryUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateNewInlineCallbackQuery::class) { mapper.map(it) }

    override val newBusinessCallbackQueryUpdates: Flow<NewBusinessCallbackQueryUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateNewBusinessCallbackQuery::class) { mapper.map(it) }

    override val newShippingQueryUpdates: Flow<NewShippingQueryUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateNewShippingQuery::class) { mapper.map(it) }

    override val newPreCheckoutQueryUpdates: Flow<NewPreCheckoutQueryUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateNewPreCheckoutQuery::class) { mapper.map(it) }

    override val newCustomEventUpdates: Flow<NewCustomEventUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateNewCustomEvent::class) { mapper.map(it) }

    override val newCustomQueryUpdates: Flow<NewCustomQueryUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateNewCustomQuery::class) { mapper.map(it) }

    override val pollUpdates: Flow<PollUpdateDto>
        get() = repository.getUpdates(TdApi.UpdatePoll::class) { mapper.map(it) }

    override val pollAnswerUpdates: Flow<PollAnswerUpdateDto>
        get() = repository.getUpdates(TdApi.UpdatePollAnswer::class) { mapper.map(it) }

    override val chatMemberUpdates: Flow<ChatMemberUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatMember::class) { mapper.map(it) }

    override val newChatJoinRequestUpdates: Flow<NewChatJoinRequestUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateNewChatJoinRequest::class) { mapper.map(it) }

    override val chatBoostUpdates: Flow<ChatBoostUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateChatBoost::class) { mapper.map(it) }

    override val messageReactionUpdates: Flow<MessageReactionUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateMessageReaction::class) { mapper.map(it) }

    override val messageReactionsUpdates: Flow<MessageReactionsUpdateDto>
        get() = repository.getUpdates(TdApi.UpdateMessageReactions::class) { mapper.map(it) }

    override val paidMediaPurchasedUpdates: Flow<PaidMediaPurchasedUpdateDto>
        get() = repository.getUpdates(TdApi.UpdatePaidMediaPurchased::class) { mapper.map(it) }

    override suspend fun acceptCall(callId: Int, protocol: CallProtocolDto): TdlResult<OkDto> {
        val function = TdApi.AcceptCall(
            callId = callId,
            protocol = mapper.map(protocol),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun acceptTermsOfService(termsOfServiceId: String): TdlResult<OkDto> {
        val function = TdApi.AcceptTermsOfService(
            termsOfServiceId = termsOfServiceId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun activateStoryStealthMode(): TdlResult<OkDto> {
        val function = TdApi.ActivateStoryStealthMode(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addBotMediaPreview(
        botUserId: Long,
        languageCode: String,
        content: InputStoryContentDto,
    ): TdlResult<BotMediaPreviewDto> {
        val function = TdApi.AddBotMediaPreview(
            botUserId = botUserId,
            languageCode = languageCode,
            content = mapper.map(content),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addChatFolderByInviteLink(inviteLink: String, chatIds: LongArray): TdlResult<OkDto> {
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
    ): TdlResult<FailedToAddMembersDto> {
        val function = TdApi.AddChatMember(
            chatId = chatId,
            userId = userId,
            forwardLimit = forwardLimit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addChatMembers(chatId: Long, userIds: LongArray): TdlResult<FailedToAddMembersDto> {
        val function = TdApi.AddChatMembers(
            chatId = chatId,
            userIds = userIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addChatToList(chatId: Long, chatList: ChatListDto): TdlResult<OkDto> {
        val function = TdApi.AddChatToList(
            chatId = chatId,
            chatList = mapper.map(chatList),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addContact(contact: ContactDto, sharePhoneNumber: Boolean): TdlResult<OkDto> {
        val function = TdApi.AddContact(
            contact = mapper.map(contact),
            sharePhoneNumber = sharePhoneNumber,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addCustomServerLanguagePack(languagePackId: String): TdlResult<OkDto> {
        val function = TdApi.AddCustomServerLanguagePack(
            languagePackId = languagePackId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addFavoriteSticker(sticker: InputFileDto): TdlResult<OkDto> {
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
    ): TdlResult<FileDto> {
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
        senderId: MessageSenderDto,
        replyTo: InputMessageReplyToDto?,
        disableNotification: Boolean,
        inputMessageContent: InputMessageContentDto,
    ): TdlResult<MessageDto> {
        val function = TdApi.AddLocalMessage(
            chatId = chatId,
            senderId = mapper.map(senderId),
            replyTo = replyTo?.let { mapper.map(it) },
            disableNotification = disableNotification,
            inputMessageContent = mapper.map(inputMessageContent),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addLogMessage(verbosityLevel: Int, text: String): TdlResult<OkDto> {
        val function = TdApi.AddLogMessage(
            verbosityLevel = verbosityLevel,
            text = text,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addMessageReaction(
        chatId: Long,
        messageId: Long,
        reactionType: ReactionTypeDto,
        isBig: Boolean,
        updateRecentReactions: Boolean,
    ): TdlResult<OkDto> {
        val function = TdApi.AddMessageReaction(
            chatId = chatId,
            messageId = messageId,
            reactionType = mapper.map(reactionType),
            isBig = isBig,
            updateRecentReactions = updateRecentReactions,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addNetworkStatistics(entry: NetworkStatisticsEntryDto): TdlResult<OkDto> {
        val function = TdApi.AddNetworkStatistics(
            entry = mapper.map(entry),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addPendingPaidMessageReaction(
        chatId: Long,
        messageId: Long,
        starCount: Long,
        type: PaidReactionTypeDto?,
    ): TdlResult<OkDto> {
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
        type: ProxyTypeDto,
    ): TdlResult<ProxyDto> {
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
    ): TdlResult<QuickReplyMessageDto> {
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
        inputMessageContent: InputMessageContentDto,
    ): TdlResult<QuickReplyMessageDto> {
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
        inputMessageContents: Array<InputMessageContentDto>,
    ): TdlResult<QuickReplyMessagesDto> {
        val function = TdApi.AddQuickReplyShortcutMessageAlbum(
            shortcutName = shortcutName,
            replyToMessageId = replyToMessageId,
            inputMessageContents = inputMessageContents.mapArray { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addRecentSticker(isAttached: Boolean, sticker: InputFileDto): TdlResult<StickersDto> {
        val function = TdApi.AddRecentSticker(
            isAttached = isAttached,
            sticker = mapper.map(sticker),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addRecentlyFoundChat(chatId: Long): TdlResult<OkDto> {
        val function = TdApi.AddRecentlyFoundChat(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addSavedAnimation(animation: InputFileDto): TdlResult<OkDto> {
        val function = TdApi.AddSavedAnimation(
            animation = mapper.map(animation),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addSavedNotificationSound(sound: InputFileDto): TdlResult<NotificationSoundDto> {
        val function = TdApi.AddSavedNotificationSound(
            sound = mapper.map(sound),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun addStickerToSet(
        userId: Long,
        name: String,
        sticker: InputStickerDto,
    ): TdlResult<OkDto> {
        val function = TdApi.AddStickerToSet(
            userId = userId,
            name = name,
            sticker = mapper.map(sticker),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun allowBotToSendMessages(botUserId: Long): TdlResult<OkDto> {
        val function = TdApi.AllowBotToSendMessages(
            botUserId = botUserId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun allowUnpaidMessagesFromUser(userId: Long, refundPayments: Boolean): TdlResult<OkDto> {
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
    ): TdlResult<OkDto> {
        val function = TdApi.AnswerCallbackQuery(
            callbackQueryId = callbackQueryId,
            text = text,
            showAlert = showAlert,
            url = url,
            cacheTime = cacheTime,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun answerCustomQuery(customQueryId: Long, data: String): TdlResult<OkDto> {
        val function = TdApi.AnswerCustomQuery(
            customQueryId = customQueryId,
            data = data,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun answerInlineQuery(
        inlineQueryId: Long,
        isPersonal: Boolean,
        button: InlineQueryResultsButtonDto?,
        results: Array<InputInlineQueryResultDto>,
        cacheTime: Int,
        nextOffset: String,
    ): TdlResult<OkDto> {
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

    override suspend fun answerPreCheckoutQuery(preCheckoutQueryId: Long, errorMessage: String): TdlResult<OkDto> {
        val function = TdApi.AnswerPreCheckoutQuery(
            preCheckoutQueryId = preCheckoutQueryId,
            errorMessage = errorMessage,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun answerShippingQuery(
        shippingQueryId: Long,
        shippingOptions: Array<ShippingOptionDto>,
        errorMessage: String,
    ): TdlResult<OkDto> {
        val function = TdApi.AnswerShippingQuery(
            shippingQueryId = shippingQueryId,
            shippingOptions = shippingOptions.mapArray { mapper.map(it) },
            errorMessage = errorMessage,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun answerWebAppQuery(webAppQueryId: String, result: InputInlineQueryResultDto): TdlResult<SentWebAppMessageDto> {
        val function = TdApi.AnswerWebAppQuery(
            webAppQueryId = webAppQueryId,
            result = mapper.map(result),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun applyPremiumGiftCode(code: String): TdlResult<OkDto> {
        val function = TdApi.ApplyPremiumGiftCode(
            code = code,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun assignStoreTransaction(transaction: StoreTransactionDto, purpose: StorePaymentPurposeDto): TdlResult<OkDto> {
        val function = TdApi.AssignStoreTransaction(
            transaction = mapper.map(transaction),
            purpose = mapper.map(purpose),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun banChatMember(
        chatId: Long,
        memberId: MessageSenderDto,
        bannedUntilDate: Int,
        revokeMessages: Boolean,
    ): TdlResult<OkDto> {
        val function = TdApi.BanChatMember(
            chatId = chatId,
            memberId = mapper.map(memberId),
            bannedUntilDate = bannedUntilDate,
            revokeMessages = revokeMessages,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun banGroupCallParticipants(groupCallId: Int, userIds: LongArray): TdlResult<OkDto> {
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
    ): TdlResult<OkDto> {
        val function = TdApi.BlockMessageSenderFromReplies(
            messageId = messageId,
            deleteMessage = deleteMessage,
            deleteAllMessages = deleteAllMessages,
            reportSpam = reportSpam,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun boostChat(chatId: Long, slotIds: IntArray): TdlResult<ChatBoostSlotsDto> {
        val function = TdApi.BoostChat(
            chatId = chatId,
            slotIds = slotIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun canBotSendMessages(botUserId: Long): TdlResult<OkDto> {
        val function = TdApi.CanBotSendMessages(
            botUserId = botUserId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun canPostStory(chatId: Long): TdlResult<CanPostStoryResultDto> {
        val function = TdApi.CanPostStory(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun canPurchaseFromStore(purpose: StorePaymentPurposeDto): TdlResult<OkDto> {
        val function = TdApi.CanPurchaseFromStore(
            purpose = mapper.map(purpose),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun canSendMessageToUser(userId: Long, onlyLocal: Boolean): TdlResult<CanSendMessageToUserResultDto> {
        val function = TdApi.CanSendMessageToUser(
            userId = userId,
            onlyLocal = onlyLocal,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun canTransferOwnership(): TdlResult<CanTransferOwnershipResultDto> {
        val function = TdApi.CanTransferOwnership(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun cancelDownloadFile(fileId: Int, onlyIfPending: Boolean): TdlResult<OkDto> {
        val function = TdApi.CancelDownloadFile(
            fileId = fileId,
            onlyIfPending = onlyIfPending,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun cancelPasswordReset(): TdlResult<OkDto> {
        val function = TdApi.CancelPasswordReset(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun cancelPreliminaryUploadFile(fileId: Int): TdlResult<OkDto> {
        val function = TdApi.CancelPreliminaryUploadFile(
            fileId = fileId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun cancelRecoveryEmailAddressVerification(): TdlResult<PasswordStateDto> {
        val function = TdApi.CancelRecoveryEmailAddressVerification(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun changeImportedContacts(contacts: Array<ContactDto>): TdlResult<ImportedContactsDto> {
        val function = TdApi.ChangeImportedContacts(
            contacts = contacts.mapArray { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun changeStickerSet(
        setId: Long,
        isInstalled: Boolean,
        isArchived: Boolean,
    ): TdlResult<OkDto> {
        val function = TdApi.ChangeStickerSet(
            setId = setId,
            isInstalled = isInstalled,
            isArchived = isArchived,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkAuthenticationBotToken(token: String): TdlResult<OkDto> {
        val function = TdApi.CheckAuthenticationBotToken(
            token = token,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkAuthenticationCode(code: String): TdlResult<OkDto> {
        val function = TdApi.CheckAuthenticationCode(
            code = code,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkAuthenticationEmailCode(code: EmailAddressAuthenticationDto): TdlResult<OkDto> {
        val function = TdApi.CheckAuthenticationEmailCode(
            code = mapper.map(code),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkAuthenticationPassword(password: String): TdlResult<OkDto> {
        val function = TdApi.CheckAuthenticationPassword(
            password = password,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkAuthenticationPasswordRecoveryCode(recoveryCode: String): TdlResult<OkDto> {
        val function = TdApi.CheckAuthenticationPasswordRecoveryCode(
            recoveryCode = recoveryCode,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkAuthenticationPremiumPurchase(currency: String, amount: Long): TdlResult<OkDto> {
        val function = TdApi.CheckAuthenticationPremiumPurchase(
            currency = currency,
            amount = amount,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkChatFolderInviteLink(inviteLink: String): TdlResult<ChatFolderInviteLinkInfoDto> {
        val function = TdApi.CheckChatFolderInviteLink(
            inviteLink = inviteLink,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkChatInviteLink(inviteLink: String): TdlResult<ChatInviteLinkInfoDto> {
        val function = TdApi.CheckChatInviteLink(
            inviteLink = inviteLink,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkChatUsername(chatId: Long, username: String): TdlResult<CheckChatUsernameResultDto> {
        val function = TdApi.CheckChatUsername(
            chatId = chatId,
            username = username,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkCreatedPublicChatsLimit(type: PublicChatTypeDto): TdlResult<OkDto> {
        val function = TdApi.CheckCreatedPublicChatsLimit(
            type = mapper.map(type),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkEmailAddressVerificationCode(code: String): TdlResult<OkDto> {
        val function = TdApi.CheckEmailAddressVerificationCode(
            code = code,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkLoginEmailAddressCode(code: EmailAddressAuthenticationDto): TdlResult<OkDto> {
        val function = TdApi.CheckLoginEmailAddressCode(
            code = mapper.map(code),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkPasswordRecoveryCode(recoveryCode: String): TdlResult<OkDto> {
        val function = TdApi.CheckPasswordRecoveryCode(
            recoveryCode = recoveryCode,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkPhoneNumberCode(code: String): TdlResult<OkDto> {
        val function = TdApi.CheckPhoneNumberCode(
            code = code,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkPremiumGiftCode(code: String): TdlResult<PremiumGiftCodeInfoDto> {
        val function = TdApi.CheckPremiumGiftCode(
            code = code,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkQuickReplyShortcutName(name: String): TdlResult<OkDto> {
        val function = TdApi.CheckQuickReplyShortcutName(
            name = name,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkRecoveryEmailAddressCode(code: String): TdlResult<PasswordStateDto> {
        val function = TdApi.CheckRecoveryEmailAddressCode(
            code = code,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkStickerSetName(name: String): TdlResult<CheckStickerSetNameResultDto> {
        val function = TdApi.CheckStickerSetName(
            name = name,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun checkWebAppFileDownload(
        botUserId: Long,
        fileName: String,
        url: String,
    ): TdlResult<OkDto> {
        val function = TdApi.CheckWebAppFileDownload(
            botUserId = botUserId,
            fileName = fileName,
            url = url,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun cleanFileName(fileName: String): TdlResult<TextDto> {
        val function = TdApi.CleanFileName(
            fileName = fileName,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun clearAllDraftMessages(excludeSecretChats: Boolean): TdlResult<OkDto> {
        val function = TdApi.ClearAllDraftMessages(
            excludeSecretChats = excludeSecretChats,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun clearAutosaveSettingsExceptions(): TdlResult<OkDto> {
        val function = TdApi.ClearAutosaveSettingsExceptions(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun clearImportedContacts(): TdlResult<OkDto> {
        val function = TdApi.ClearImportedContacts(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun clearRecentEmojiStatuses(): TdlResult<OkDto> {
        val function = TdApi.ClearRecentEmojiStatuses(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun clearRecentReactions(): TdlResult<OkDto> {
        val function = TdApi.ClearRecentReactions(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun clearRecentStickers(isAttached: Boolean): TdlResult<OkDto> {
        val function = TdApi.ClearRecentStickers(
            isAttached = isAttached,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun clearRecentlyFoundChats(): TdlResult<OkDto> {
        val function = TdApi.ClearRecentlyFoundChats(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun clearSearchedForTags(clearCashtags: Boolean): TdlResult<OkDto> {
        val function = TdApi.ClearSearchedForTags(
            clearCashtags = clearCashtags,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun clickAnimatedEmojiMessage(chatId: Long, messageId: Long): TdlResult<StickerDto> {
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
    ): TdlResult<OkDto> {
        val function = TdApi.ClickChatSponsoredMessage(
            chatId = chatId,
            messageId = messageId,
            isMediaClick = isMediaClick,
            fromFullscreen = fromFullscreen,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun clickPremiumSubscriptionButton(): TdlResult<OkDto> {
        val function = TdApi.ClickPremiumSubscriptionButton(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun close(): TdlResult<OkDto> {
        val function = TdApi.Close(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun closeChat(chatId: Long): TdlResult<OkDto> {
        val function = TdApi.CloseChat(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun closeSecretChat(secretChatId: Int): TdlResult<OkDto> {
        val function = TdApi.CloseSecretChat(
            secretChatId = secretChatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun closeStory(storyPosterChatId: Long, storyId: Int): TdlResult<OkDto> {
        val function = TdApi.CloseStory(
            storyPosterChatId = storyPosterChatId,
            storyId = storyId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun closeWebApp(webAppLaunchId: Long): TdlResult<OkDto> {
        val function = TdApi.CloseWebApp(
            webAppLaunchId = webAppLaunchId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun commitPendingPaidMessageReactions(chatId: Long, messageId: Long): TdlResult<OkDto> {
        val function = TdApi.CommitPendingPaidMessageReactions(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun confirmQrCodeAuthentication(link: String): TdlResult<SessionDto> {
        val function = TdApi.ConfirmQrCodeAuthentication(
            link = link,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun confirmSession(sessionId: Long): TdlResult<OkDto> {
        val function = TdApi.ConfirmSession(
            sessionId = sessionId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun connectAffiliateProgram(affiliate: AffiliateTypeDto, botUserId: Long): TdlResult<ConnectedAffiliateProgramDto> {
        val function = TdApi.ConnectAffiliateProgram(
            affiliate = mapper.map(affiliate),
            botUserId = botUserId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun createBasicGroupChat(basicGroupId: Long, force: Boolean): TdlResult<ChatDto> {
        val function = TdApi.CreateBasicGroupChat(
            basicGroupId = basicGroupId,
            force = force,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun createBusinessChatLink(linkInfo: InputBusinessChatLinkDto): TdlResult<BusinessChatLinkDto> {
        val function = TdApi.CreateBusinessChatLink(
            linkInfo = mapper.map(linkInfo),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun createCall(
        userId: Long,
        protocol: CallProtocolDto,
        isVideo: Boolean,
    ): TdlResult<CallIdDto> {
        val function = TdApi.CreateCall(
            userId = userId,
            protocol = mapper.map(protocol),
            isVideo = isVideo,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun createChatFolder(folder: ChatFolderDto): TdlResult<ChatFolderInfoDto> {
        val function = TdApi.CreateChatFolder(
            folder = mapper.map(folder),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun createChatFolderInviteLink(
        chatFolderId: Int,
        name: String,
        chatIds: LongArray,
    ): TdlResult<ChatFolderInviteLinkDto> {
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
    ): TdlResult<ChatInviteLinkDto> {
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
        subscriptionPricing: StarSubscriptionPricingDto,
    ): TdlResult<ChatInviteLinkDto> {
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
        icon: ForumTopicIconDto,
    ): TdlResult<ForumTopicInfoDto> {
        val function = TdApi.CreateForumTopic(
            chatId = chatId,
            name = name,
            icon = mapper.map(icon),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun createGroupCall(joinParameters: GroupCallJoinParametersDto?): TdlResult<GroupCallInfoDto> {
        val function = TdApi.CreateGroupCall(
            joinParameters = joinParameters?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun createInvoiceLink(businessConnectionId: String, invoice: InputMessageContentDto): TdlResult<HttpUrlDto> {
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
    ): TdlResult<CreatedBasicGroupChatDto> {
        val function = TdApi.CreateNewBasicGroupChat(
            userIds = userIds,
            title = title,
            messageAutoDeleteTime = messageAutoDeleteTime,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun createNewSecretChat(userId: Long): TdlResult<ChatDto> {
        val function = TdApi.CreateNewSecretChat(
            userId = userId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun createNewStickerSet(
        userId: Long,
        title: String,
        name: String,
        stickerType: StickerTypeDto,
        needsRepainting: Boolean,
        stickers: Array<InputStickerDto>,
        source: String,
    ): TdlResult<StickerSetDto> {
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
        location: ChatLocationDto?,
        messageAutoDeleteTime: Int,
        forImport: Boolean,
    ): TdlResult<ChatDto> {
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

    override suspend fun createPrivateChat(userId: Long, force: Boolean): TdlResult<ChatDto> {
        val function = TdApi.CreatePrivateChat(
            userId = userId,
            force = force,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun createSecretChat(secretChatId: Int): TdlResult<ChatDto> {
        val function = TdApi.CreateSecretChat(
            secretChatId = secretChatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun createSupergroupChat(supergroupId: Long, force: Boolean): TdlResult<ChatDto> {
        val function = TdApi.CreateSupergroupChat(
            supergroupId = supergroupId,
            force = force,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun createTemporaryPassword(password: String, validFor: Int): TdlResult<TemporaryPasswordStateDto> {
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
    ): TdlResult<GroupCallIdDto> {
        val function = TdApi.CreateVideoChat(
            chatId = chatId,
            title = title,
            startDate = startDate,
            isRtmpStream = isRtmpStream,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun declineGroupCallInvitation(chatId: Long, messageId: Long): TdlResult<OkDto> {
        val function = TdApi.DeclineGroupCallInvitation(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun decryptGroupCallData(
        groupCallId: Int,
        participantId: MessageSenderDto,
        dataChannel: GroupCallDataChannelDto?,
        data: ByteArray,
    ): TdlResult<DataDto> {
        val function = TdApi.DecryptGroupCallData(
            groupCallId = groupCallId,
            participantId = mapper.map(participantId),
            dataChannel = dataChannel?.let { mapper.map(it) },
            data = data,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteAccount(reason: String, password: String): TdlResult<OkDto> {
        val function = TdApi.DeleteAccount(
            reason = reason,
            password = password,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteAllCallMessages(revoke: Boolean): TdlResult<OkDto> {
        val function = TdApi.DeleteAllCallMessages(
            revoke = revoke,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteAllRevokedChatInviteLinks(chatId: Long, creatorUserId: Long): TdlResult<OkDto> {
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
    ): TdlResult<OkDto> {
        val function = TdApi.DeleteBotMediaPreviews(
            botUserId = botUserId,
            languageCode = languageCode,
            fileIds = fileIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteBusinessChatLink(link: String): TdlResult<OkDto> {
        val function = TdApi.DeleteBusinessChatLink(
            link = link,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteBusinessConnectedBot(botUserId: Long): TdlResult<OkDto> {
        val function = TdApi.DeleteBusinessConnectedBot(
            botUserId = botUserId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteBusinessMessages(businessConnectionId: String, messageIds: LongArray): TdlResult<OkDto> {
        val function = TdApi.DeleteBusinessMessages(
            businessConnectionId = businessConnectionId,
            messageIds = messageIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteBusinessStory(businessConnectionId: String, storyId: Int): TdlResult<OkDto> {
        val function = TdApi.DeleteBusinessStory(
            businessConnectionId = businessConnectionId,
            storyId = storyId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteChat(chatId: Long): TdlResult<OkDto> {
        val function = TdApi.DeleteChat(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteChatBackground(chatId: Long, restorePrevious: Boolean): TdlResult<OkDto> {
        val function = TdApi.DeleteChatBackground(
            chatId = chatId,
            restorePrevious = restorePrevious,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteChatFolder(chatFolderId: Int, leaveChatIds: LongArray): TdlResult<OkDto> {
        val function = TdApi.DeleteChatFolder(
            chatFolderId = chatFolderId,
            leaveChatIds = leaveChatIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteChatFolderInviteLink(chatFolderId: Int, inviteLink: String): TdlResult<OkDto> {
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
    ): TdlResult<OkDto> {
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
    ): TdlResult<OkDto> {
        val function = TdApi.DeleteChatMessagesByDate(
            chatId = chatId,
            minDate = minDate,
            maxDate = maxDate,
            revoke = revoke,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteChatMessagesBySender(chatId: Long, senderId: MessageSenderDto): TdlResult<OkDto> {
        val function = TdApi.DeleteChatMessagesBySender(
            chatId = chatId,
            senderId = mapper.map(senderId),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteChatReplyMarkup(chatId: Long, messageId: Long): TdlResult<OkDto> {
        val function = TdApi.DeleteChatReplyMarkup(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteCommands(scope: BotCommandScopeDto?, languageCode: String): TdlResult<OkDto> {
        val function = TdApi.DeleteCommands(
            scope = scope?.let { mapper.map(it) },
            languageCode = languageCode,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteDefaultBackground(forDarkTheme: Boolean): TdlResult<OkDto> {
        val function = TdApi.DeleteDefaultBackground(
            forDarkTheme = forDarkTheme,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteFile(fileId: Int): TdlResult<OkDto> {
        val function = TdApi.DeleteFile(
            fileId = fileId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteForumTopic(chatId: Long, messageThreadId: Long): TdlResult<OkDto> {
        val function = TdApi.DeleteForumTopic(
            chatId = chatId,
            messageThreadId = messageThreadId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteLanguagePack(languagePackId: String): TdlResult<OkDto> {
        val function = TdApi.DeleteLanguagePack(
            languagePackId = languagePackId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteMessages(
        chatId: Long,
        messageIds: LongArray,
        revoke: Boolean,
    ): TdlResult<OkDto> {
        val function = TdApi.DeleteMessages(
            chatId = chatId,
            messageIds = messageIds,
            revoke = revoke,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deletePassportElement(type: PassportElementTypeDto): TdlResult<OkDto> {
        val function = TdApi.DeletePassportElement(
            type = mapper.map(type),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteProfilePhoto(profilePhotoId: Long): TdlResult<OkDto> {
        val function = TdApi.DeleteProfilePhoto(
            profilePhotoId = profilePhotoId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteQuickReplyShortcut(shortcutId: Int): TdlResult<OkDto> {
        val function = TdApi.DeleteQuickReplyShortcut(
            shortcutId = shortcutId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteQuickReplyShortcutMessages(shortcutId: Int, messageIds: LongArray): TdlResult<OkDto> {
        val function = TdApi.DeleteQuickReplyShortcutMessages(
            shortcutId = shortcutId,
            messageIds = messageIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteRevokedChatInviteLink(chatId: Long, inviteLink: String): TdlResult<OkDto> {
        val function = TdApi.DeleteRevokedChatInviteLink(
            chatId = chatId,
            inviteLink = inviteLink,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteSavedCredentials(): TdlResult<OkDto> {
        val function = TdApi.DeleteSavedCredentials(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteSavedMessagesTopicHistory(savedMessagesTopicId: Long): TdlResult<OkDto> {
        val function = TdApi.DeleteSavedMessagesTopicHistory(
            savedMessagesTopicId = savedMessagesTopicId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteSavedMessagesTopicMessagesByDate(
        savedMessagesTopicId: Long,
        minDate: Int,
        maxDate: Int,
    ): TdlResult<OkDto> {
        val function = TdApi.DeleteSavedMessagesTopicMessagesByDate(
            savedMessagesTopicId = savedMessagesTopicId,
            minDate = minDate,
            maxDate = maxDate,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteSavedOrderInfo(): TdlResult<OkDto> {
        val function = TdApi.DeleteSavedOrderInfo(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteStickerSet(name: String): TdlResult<OkDto> {
        val function = TdApi.DeleteStickerSet(
            name = name,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun deleteStory(storyPosterChatId: Long, storyId: Int): TdlResult<OkDto> {
        val function = TdApi.DeleteStory(
            storyPosterChatId = storyPosterChatId,
            storyId = storyId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun destroy(): TdlResult<OkDto> {
        val function = TdApi.Destroy(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun disableAllSupergroupUsernames(supergroupId: Long): TdlResult<OkDto> {
        val function = TdApi.DisableAllSupergroupUsernames(
            supergroupId = supergroupId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun disableProxy(): TdlResult<OkDto> {
        val function = TdApi.DisableProxy(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun discardCall(
        callId: Int,
        isDisconnected: Boolean,
        inviteLink: String,
        duration: Int,
        isVideo: Boolean,
        connectionId: Long,
    ): TdlResult<OkDto> {
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

    override suspend fun disconnectAffiliateProgram(affiliate: AffiliateTypeDto, url: String): TdlResult<ConnectedAffiliateProgramDto> {
        val function = TdApi.DisconnectAffiliateProgram(
            affiliate = mapper.map(affiliate),
            url = url,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun disconnectAllWebsites(): TdlResult<OkDto> {
        val function = TdApi.DisconnectAllWebsites(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun disconnectWebsite(websiteId: Long): TdlResult<OkDto> {
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
    ): TdlResult<FileDto> {
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
        content: InputStoryContentDto,
    ): TdlResult<BotMediaPreviewDto> {
        val function = TdApi.EditBotMediaPreview(
            botUserId = botUserId,
            languageCode = languageCode,
            fileId = fileId,
            content = mapper.map(content),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editBusinessChatLink(link: String, linkInfo: InputBusinessChatLinkDto): TdlResult<BusinessChatLinkDto> {
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
        replyMarkup: ReplyMarkupDto?,
        caption: FormattedTextDto?,
        showCaptionAboveMedia: Boolean,
    ): TdlResult<BusinessMessageDto> {
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
        replyMarkup: ReplyMarkupDto?,
        location: LocationDto?,
        livePeriod: Int,
        heading: Int,
        proximityAlertRadius: Int,
    ): TdlResult<BusinessMessageDto> {
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
        replyMarkup: ReplyMarkupDto?,
        inputMessageContent: InputMessageContentDto,
    ): TdlResult<BusinessMessageDto> {
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
        replyMarkup: ReplyMarkupDto?,
    ): TdlResult<BusinessMessageDto> {
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
        replyMarkup: ReplyMarkupDto?,
        inputMessageContent: InputMessageContentDto,
    ): TdlResult<BusinessMessageDto> {
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
        content: InputStoryContentDto,
        areas: InputStoryAreasDto,
        caption: FormattedTextDto,
        privacySettings: StoryPrivacySettingsDto,
    ): TdlResult<StoryDto> {
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

    override suspend fun editChatFolder(chatFolderId: Int, folder: ChatFolderDto): TdlResult<ChatFolderInfoDto> {
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
    ): TdlResult<ChatFolderInviteLinkDto> {
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
    ): TdlResult<ChatInviteLinkDto> {
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
    ): TdlResult<ChatInviteLinkDto> {
        val function = TdApi.EditChatSubscriptionInviteLink(
            chatId = chatId,
            inviteLink = inviteLink,
            name = name,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editCustomLanguagePackInfo(info: LanguagePackInfoDto): TdlResult<OkDto> {
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
    ): TdlResult<OkDto> {
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
        replyMarkup: ReplyMarkupDto?,
        caption: FormattedTextDto?,
        showCaptionAboveMedia: Boolean,
    ): TdlResult<OkDto> {
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
        replyMarkup: ReplyMarkupDto?,
        location: LocationDto?,
        livePeriod: Int,
        heading: Int,
        proximityAlertRadius: Int,
    ): TdlResult<OkDto> {
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
        replyMarkup: ReplyMarkupDto?,
        inputMessageContent: InputMessageContentDto,
    ): TdlResult<OkDto> {
        val function = TdApi.EditInlineMessageMedia(
            inlineMessageId = inlineMessageId,
            replyMarkup = replyMarkup?.let { mapper.map(it) },
            inputMessageContent = mapper.map(inputMessageContent),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editInlineMessageReplyMarkup(inlineMessageId: String, replyMarkup: ReplyMarkupDto?): TdlResult<OkDto> {
        val function = TdApi.EditInlineMessageReplyMarkup(
            inlineMessageId = inlineMessageId,
            replyMarkup = replyMarkup?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editInlineMessageText(
        inlineMessageId: String,
        replyMarkup: ReplyMarkupDto?,
        inputMessageContent: InputMessageContentDto,
    ): TdlResult<OkDto> {
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
        replyMarkup: ReplyMarkupDto?,
        caption: FormattedTextDto?,
        showCaptionAboveMedia: Boolean,
    ): TdlResult<MessageDto> {
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
        replyMarkup: ReplyMarkupDto?,
        location: LocationDto?,
        livePeriod: Int,
        heading: Int,
        proximityAlertRadius: Int,
    ): TdlResult<MessageDto> {
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
        replyMarkup: ReplyMarkupDto?,
        inputMessageContent: InputMessageContentDto,
    ): TdlResult<MessageDto> {
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
        replyMarkup: ReplyMarkupDto?,
    ): TdlResult<MessageDto> {
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
        schedulingState: MessageSchedulingStateDto?,
    ): TdlResult<OkDto> {
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
        replyMarkup: ReplyMarkupDto?,
        inputMessageContent: InputMessageContentDto,
    ): TdlResult<MessageDto> {
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
        type: ProxyTypeDto,
    ): TdlResult<ProxyDto> {
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
        inputMessageContent: InputMessageContentDto,
    ): TdlResult<OkDto> {
        val function = TdApi.EditQuickReplyMessage(
            shortcutId = shortcutId,
            messageId = messageId,
            inputMessageContent = mapper.map(inputMessageContent),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editStarSubscription(subscriptionId: String, isCanceled: Boolean): TdlResult<OkDto> {
        val function = TdApi.EditStarSubscription(
            subscriptionId = subscriptionId,
            isCanceled = isCanceled,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun editStory(
        storyPosterChatId: Long,
        storyId: Int,
        content: InputStoryContentDto?,
        areas: InputStoryAreasDto?,
        caption: FormattedTextDto?,
    ): TdlResult<OkDto> {
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
    ): TdlResult<OkDto> {
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
    ): TdlResult<OkDto> {
        val function = TdApi.EditUserStarSubscription(
            userId = userId,
            telegramPaymentChargeId = telegramPaymentChargeId,
            isCanceled = isCanceled,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun enableProxy(proxyId: Int): TdlResult<OkDto> {
        val function = TdApi.EnableProxy(
            proxyId = proxyId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun encryptGroupCallData(
        groupCallId: Int,
        dataChannel: GroupCallDataChannelDto,
        data: ByteArray,
        unencryptedPrefixSize: Int,
    ): TdlResult<DataDto> {
        val function = TdApi.EncryptGroupCallData(
            groupCallId = groupCallId,
            dataChannel = mapper.map(dataChannel),
            data = data,
            unencryptedPrefixSize = unencryptedPrefixSize,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun endGroupCall(groupCallId: Int): TdlResult<OkDto> {
        val function = TdApi.EndGroupCall(
            groupCallId = groupCallId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun endGroupCallRecording(groupCallId: Int): TdlResult<OkDto> {
        val function = TdApi.EndGroupCallRecording(
            groupCallId = groupCallId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun endGroupCallScreenSharing(groupCallId: Int): TdlResult<OkDto> {
        val function = TdApi.EndGroupCallScreenSharing(
            groupCallId = groupCallId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun finishFileGeneration(generationId: Long, error: ErrorDto?): TdlResult<OkDto> {
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
        options: MessageSendOptionsDto?,
        sendCopy: Boolean,
        removeCaption: Boolean,
    ): TdlResult<MessagesDto> {
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

    override suspend fun getAccountTtl(): TdlResult<AccountTtlDto> {
        val function = TdApi.GetAccountTtl(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getActiveSessions(): TdlResult<SessionsDto> {
        val function = TdApi.GetActiveSessions(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getAllPassportElements(password: String): TdlResult<PassportElementsDto> {
        val function = TdApi.GetAllPassportElements(
            password = password,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getAllStickerEmojis(
        stickerType: StickerTypeDto,
        query: String,
        chatId: Long,
        returnOnlyMainEmoji: Boolean,
    ): TdlResult<EmojisDto> {
        val function = TdApi.GetAllStickerEmojis(
            stickerType = mapper.map(stickerType),
            query = query,
            chatId = chatId,
            returnOnlyMainEmoji = returnOnlyMainEmoji,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getAnimatedEmoji(emoji: String): TdlResult<AnimatedEmojiDto> {
        val function = TdApi.GetAnimatedEmoji(
            emoji = emoji,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getApplicationConfig(): TdlResult<JsonValueDto> {
        val function = TdApi.GetApplicationConfig(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getApplicationDownloadLink(): TdlResult<HttpUrlDto> {
        val function = TdApi.GetApplicationDownloadLink(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getArchiveChatListSettings(): TdlResult<ArchiveChatListSettingsDto> {
        val function = TdApi.GetArchiveChatListSettings(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getArchivedStickerSets(
        stickerType: StickerTypeDto,
        offsetStickerSetId: Long,
        limit: Int,
    ): TdlResult<StickerSetsDto> {
        val function = TdApi.GetArchivedStickerSets(
            stickerType = mapper.map(stickerType),
            offsetStickerSetId = offsetStickerSetId,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getAttachedStickerSets(fileId: Int): TdlResult<StickerSetsDto> {
        val function = TdApi.GetAttachedStickerSets(
            fileId = fileId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getAttachmentMenuBot(botUserId: Long): TdlResult<AttachmentMenuBotDto> {
        val function = TdApi.GetAttachmentMenuBot(
            botUserId = botUserId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getAuthorizationState(): TdlResult<AuthorizationStateDto> {
        val function = TdApi.GetAuthorizationState(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getAutoDownloadSettingsPresets(): TdlResult<AutoDownloadSettingsPresetsDto> {
        val function = TdApi.GetAutoDownloadSettingsPresets(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getAutosaveSettings(): TdlResult<AutosaveSettingsDto> {
        val function = TdApi.GetAutosaveSettings(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getAvailableChatBoostSlots(): TdlResult<ChatBoostSlotsDto> {
        val function = TdApi.GetAvailableChatBoostSlots(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getAvailableGifts(): TdlResult<GiftsDto> {
        val function = TdApi.GetAvailableGifts(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBackgroundUrl(name: String, type: BackgroundTypeDto): TdlResult<HttpUrlDto> {
        val function = TdApi.GetBackgroundUrl(
            name = name,
            type = mapper.map(type),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBankCardInfo(bankCardNumber: String): TdlResult<BankCardInfoDto> {
        val function = TdApi.GetBankCardInfo(
            bankCardNumber = bankCardNumber,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBasicGroup(basicGroupId: Long): TdlResult<BasicGroupDto> {
        val function = TdApi.GetBasicGroup(
            basicGroupId = basicGroupId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBasicGroupFullInfo(basicGroupId: Long): TdlResult<BasicGroupFullInfoDto> {
        val function = TdApi.GetBasicGroupFullInfo(
            basicGroupId = basicGroupId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBlockedMessageSenders(
        blockList: BlockListDto,
        offset: Int,
        limit: Int,
    ): TdlResult<MessageSendersDto> {
        val function = TdApi.GetBlockedMessageSenders(
            blockList = mapper.map(blockList),
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBotInfoDescription(botUserId: Long, languageCode: String): TdlResult<TextDto> {
        val function = TdApi.GetBotInfoDescription(
            botUserId = botUserId,
            languageCode = languageCode,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBotInfoShortDescription(botUserId: Long, languageCode: String): TdlResult<TextDto> {
        val function = TdApi.GetBotInfoShortDescription(
            botUserId = botUserId,
            languageCode = languageCode,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBotMediaPreviewInfo(botUserId: Long, languageCode: String): TdlResult<BotMediaPreviewInfoDto> {
        val function = TdApi.GetBotMediaPreviewInfo(
            botUserId = botUserId,
            languageCode = languageCode,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBotMediaPreviews(botUserId: Long): TdlResult<BotMediaPreviewsDto> {
        val function = TdApi.GetBotMediaPreviews(
            botUserId = botUserId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBotName(botUserId: Long, languageCode: String): TdlResult<TextDto> {
        val function = TdApi.GetBotName(
            botUserId = botUserId,
            languageCode = languageCode,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBotSimilarBotCount(botUserId: Long, returnLocal: Boolean): TdlResult<CountDto> {
        val function = TdApi.GetBotSimilarBotCount(
            botUserId = botUserId,
            returnLocal = returnLocal,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBotSimilarBots(botUserId: Long): TdlResult<UsersDto> {
        val function = TdApi.GetBotSimilarBots(
            botUserId = botUserId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBusinessAccountStarAmount(businessConnectionId: String): TdlResult<StarAmountDto> {
        val function = TdApi.GetBusinessAccountStarAmount(
            businessConnectionId = businessConnectionId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBusinessChatLinkInfo(linkName: String): TdlResult<BusinessChatLinkInfoDto> {
        val function = TdApi.GetBusinessChatLinkInfo(
            linkName = linkName,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBusinessChatLinks(): TdlResult<BusinessChatLinksDto> {
        val function = TdApi.GetBusinessChatLinks(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBusinessConnectedBot(): TdlResult<BusinessConnectedBotDto> {
        val function = TdApi.GetBusinessConnectedBot(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBusinessConnection(connectionId: String): TdlResult<BusinessConnectionDto> {
        val function = TdApi.GetBusinessConnection(
            connectionId = connectionId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getBusinessFeatures(source: BusinessFeatureDto?): TdlResult<BusinessFeaturesDto> {
        val function = TdApi.GetBusinessFeatures(
            source = source?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getCallbackQueryAnswer(
        chatId: Long,
        messageId: Long,
        payload: CallbackQueryPayloadDto,
    ): TdlResult<CallbackQueryAnswerDto> {
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
    ): TdlResult<MessageDto> {
        val function = TdApi.GetCallbackQueryMessage(
            chatId = chatId,
            messageId = messageId,
            callbackQueryId = callbackQueryId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChat(chatId: Long): TdlResult<ChatDto> {
        val function = TdApi.GetChat(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatActiveStories(chatId: Long): TdlResult<ChatActiveStoriesDto> {
        val function = TdApi.GetChatActiveStories(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatAdministrators(chatId: Long): TdlResult<ChatAdministratorsDto> {
        val function = TdApi.GetChatAdministrators(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatArchivedStories(
        chatId: Long,
        fromStoryId: Int,
        limit: Int,
    ): TdlResult<StoriesDto> {
        val function = TdApi.GetChatArchivedStories(
            chatId = chatId,
            fromStoryId = fromStoryId,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatAvailableMessageSenders(chatId: Long): TdlResult<ChatMessageSendersDto> {
        val function = TdApi.GetChatAvailableMessageSenders(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatAvailablePaidMessageReactionSenders(chatId: Long): TdlResult<MessageSendersDto> {
        val function = TdApi.GetChatAvailablePaidMessageReactionSenders(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatBoostFeatures(isChannel: Boolean): TdlResult<ChatBoostFeaturesDto> {
        val function = TdApi.GetChatBoostFeatures(
            isChannel = isChannel,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatBoostLevelFeatures(isChannel: Boolean, level: Int): TdlResult<ChatBoostLevelFeaturesDto> {
        val function = TdApi.GetChatBoostLevelFeatures(
            isChannel = isChannel,
            level = level,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatBoostLink(chatId: Long): TdlResult<ChatBoostLinkDto> {
        val function = TdApi.GetChatBoostLink(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatBoostLinkInfo(url: String): TdlResult<ChatBoostLinkInfoDto> {
        val function = TdApi.GetChatBoostLinkInfo(
            url = url,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatBoostStatus(chatId: Long): TdlResult<ChatBoostStatusDto> {
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
    ): TdlResult<FoundChatBoostsDto> {
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
        filters: ChatEventLogFiltersDto?,
        userIds: LongArray,
    ): TdlResult<ChatEventsDto> {
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

    override suspend fun getChatFolder(chatFolderId: Int): TdlResult<ChatFolderDto> {
        val function = TdApi.GetChatFolder(
            chatFolderId = chatFolderId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatFolderChatCount(folder: ChatFolderDto): TdlResult<CountDto> {
        val function = TdApi.GetChatFolderChatCount(
            folder = mapper.map(folder),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatFolderChatsToLeave(chatFolderId: Int): TdlResult<ChatsDto> {
        val function = TdApi.GetChatFolderChatsToLeave(
            chatFolderId = chatFolderId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatFolderDefaultIconName(folder: ChatFolderDto): TdlResult<ChatFolderIconDto> {
        val function = TdApi.GetChatFolderDefaultIconName(
            folder = mapper.map(folder),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatFolderInviteLinks(chatFolderId: Int): TdlResult<ChatFolderInviteLinksDto> {
        val function = TdApi.GetChatFolderInviteLinks(
            chatFolderId = chatFolderId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatFolderNewChats(chatFolderId: Int): TdlResult<ChatsDto> {
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
    ): TdlResult<MessagesDto> {
        val function = TdApi.GetChatHistory(
            chatId = chatId,
            fromMessageId = fromMessageId,
            offset = offset,
            limit = limit,
            onlyLocal = onlyLocal,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatInviteLink(chatId: Long, inviteLink: String): TdlResult<ChatInviteLinkDto> {
        val function = TdApi.GetChatInviteLink(
            chatId = chatId,
            inviteLink = inviteLink,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatInviteLinkCounts(chatId: Long): TdlResult<ChatInviteLinkCountsDto> {
        val function = TdApi.GetChatInviteLinkCounts(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatInviteLinkMembers(
        chatId: Long,
        inviteLink: String,
        onlyWithExpiredSubscription: Boolean,
        offsetMember: ChatInviteLinkMemberDto?,
        limit: Int,
    ): TdlResult<ChatInviteLinkMembersDto> {
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
    ): TdlResult<ChatInviteLinksDto> {
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
        offsetRequest: ChatJoinRequestDto?,
        limit: Int,
    ): TdlResult<ChatJoinRequestsDto> {
        val function = TdApi.GetChatJoinRequests(
            chatId = chatId,
            inviteLink = inviteLink,
            query = query,
            offsetRequest = offsetRequest?.let { mapper.map(it) },
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatListsToAddChat(chatId: Long): TdlResult<ChatListsDto> {
        val function = TdApi.GetChatListsToAddChat(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatMember(chatId: Long, memberId: MessageSenderDto): TdlResult<ChatMemberDto> {
        val function = TdApi.GetChatMember(
            chatId = chatId,
            memberId = mapper.map(memberId),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatMessageByDate(chatId: Long, date: Int): TdlResult<MessageDto> {
        val function = TdApi.GetChatMessageByDate(
            chatId = chatId,
            date = date,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatMessageCalendar(
        chatId: Long,
        filter: SearchMessagesFilterDto,
        fromMessageId: Long,
        savedMessagesTopicId: Long,
    ): TdlResult<MessageCalendarDto> {
        val function = TdApi.GetChatMessageCalendar(
            chatId = chatId,
            filter = mapper.map(filter),
            fromMessageId = fromMessageId,
            savedMessagesTopicId = savedMessagesTopicId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatMessageCount(
        chatId: Long,
        filter: SearchMessagesFilterDto,
        savedMessagesTopicId: Long,
        returnLocal: Boolean,
    ): TdlResult<CountDto> {
        val function = TdApi.GetChatMessageCount(
            chatId = chatId,
            filter = mapper.map(filter),
            savedMessagesTopicId = savedMessagesTopicId,
            returnLocal = returnLocal,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatMessagePosition(
        chatId: Long,
        messageId: Long,
        filter: SearchMessagesFilterDto,
        messageThreadId: Long,
        savedMessagesTopicId: Long,
    ): TdlResult<CountDto> {
        val function = TdApi.GetChatMessagePosition(
            chatId = chatId,
            messageId = messageId,
            filter = mapper.map(filter),
            messageThreadId = messageThreadId,
            savedMessagesTopicId = savedMessagesTopicId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatNotificationSettingsExceptions(scope: NotificationSettingsScopeDto?, compareSound: Boolean): TdlResult<ChatsDto> {
        val function = TdApi.GetChatNotificationSettingsExceptions(
            scope = scope?.let { mapper.map(it) },
            compareSound = compareSound,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatPinnedMessage(chatId: Long): TdlResult<MessageDto> {
        val function = TdApi.GetChatPinnedMessage(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatPostedToChatPageStories(
        chatId: Long,
        fromStoryId: Int,
        limit: Int,
    ): TdlResult<StoriesDto> {
        val function = TdApi.GetChatPostedToChatPageStories(
            chatId = chatId,
            fromStoryId = fromStoryId,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatRevenueStatistics(chatId: Long, isDark: Boolean): TdlResult<ChatRevenueStatisticsDto> {
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
    ): TdlResult<ChatRevenueTransactionsDto> {
        val function = TdApi.GetChatRevenueTransactions(
            chatId = chatId,
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatRevenueWithdrawalUrl(chatId: Long, password: String): TdlResult<HttpUrlDto> {
        val function = TdApi.GetChatRevenueWithdrawalUrl(
            chatId = chatId,
            password = password,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatScheduledMessages(chatId: Long): TdlResult<MessagesDto> {
        val function = TdApi.GetChatScheduledMessages(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatSimilarChatCount(chatId: Long, returnLocal: Boolean): TdlResult<CountDto> {
        val function = TdApi.GetChatSimilarChatCount(
            chatId = chatId,
            returnLocal = returnLocal,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatSimilarChats(chatId: Long): TdlResult<ChatsDto> {
        val function = TdApi.GetChatSimilarChats(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatSparseMessagePositions(
        chatId: Long,
        filter: SearchMessagesFilterDto,
        fromMessageId: Long,
        limit: Int,
        savedMessagesTopicId: Long,
    ): TdlResult<MessagePositionsDto> {
        val function = TdApi.GetChatSparseMessagePositions(
            chatId = chatId,
            filter = mapper.map(filter),
            fromMessageId = fromMessageId,
            limit = limit,
            savedMessagesTopicId = savedMessagesTopicId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatSponsoredMessages(chatId: Long): TdlResult<SponsoredMessagesDto> {
        val function = TdApi.GetChatSponsoredMessages(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatStatistics(chatId: Long, isDark: Boolean): TdlResult<ChatStatisticsDto> {
        val function = TdApi.GetChatStatistics(
            chatId = chatId,
            isDark = isDark,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatStoryInteractions(
        storyPosterChatId: Long,
        storyId: Int,
        reactionType: ReactionTypeDto?,
        preferForwards: Boolean,
        offset: String,
        limit: Int,
    ): TdlResult<StoryInteractionsDto> {
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

    override suspend fun getChats(chatList: ChatListDto?, limit: Int): TdlResult<ChatsDto> {
        val function = TdApi.GetChats(
            chatList = chatList?.let { mapper.map(it) },
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatsForChatFolderInviteLink(chatFolderId: Int): TdlResult<ChatsDto> {
        val function = TdApi.GetChatsForChatFolderInviteLink(
            chatFolderId = chatFolderId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getChatsToPostStories(): TdlResult<ChatsDto> {
        val function = TdApi.GetChatsToPostStories(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getCloseFriends(): TdlResult<UsersDto> {
        val function = TdApi.GetCloseFriends(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getCollectibleItemInfo(type: CollectibleItemTypeDto): TdlResult<CollectibleItemInfoDto> {
        val function = TdApi.GetCollectibleItemInfo(
            type = mapper.map(type),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getCommands(scope: BotCommandScopeDto?, languageCode: String): TdlResult<BotCommandsDto> {
        val function = TdApi.GetCommands(
            scope = scope?.let { mapper.map(it) },
            languageCode = languageCode,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getConnectedAffiliateProgram(affiliate: AffiliateTypeDto, botUserId: Long): TdlResult<ConnectedAffiliateProgramDto> {
        val function = TdApi.GetConnectedAffiliateProgram(
            affiliate = mapper.map(affiliate),
            botUserId = botUserId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getConnectedAffiliatePrograms(
        affiliate: AffiliateTypeDto,
        offset: String,
        limit: Int,
    ): TdlResult<ConnectedAffiliateProgramsDto> {
        val function = TdApi.GetConnectedAffiliatePrograms(
            affiliate = mapper.map(affiliate),
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getConnectedWebsites(): TdlResult<ConnectedWebsitesDto> {
        val function = TdApi.GetConnectedWebsites(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getContacts(): TdlResult<UsersDto> {
        val function = TdApi.GetContacts(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getCountries(): TdlResult<CountriesDto> {
        val function = TdApi.GetCountries(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getCountryCode(): TdlResult<TextDto> {
        val function = TdApi.GetCountryCode(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getCountryFlagEmoji(countryCode: String): TdlResult<TextDto> {
        val function = TdApi.GetCountryFlagEmoji(
            countryCode = countryCode,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getCreatedPublicChats(type: PublicChatTypeDto): TdlResult<ChatsDto> {
        val function = TdApi.GetCreatedPublicChats(
            type = mapper.map(type),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getCurrentState(): TdlResult<UpdatesDto> {
        val function = TdApi.GetCurrentState(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getCurrentWeather(location: LocationDto): TdlResult<CurrentWeatherDto> {
        val function = TdApi.GetCurrentWeather(
            location = mapper.map(location),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getCustomEmojiReactionAnimations(): TdlResult<StickersDto> {
        val function = TdApi.GetCustomEmojiReactionAnimations(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getCustomEmojiStickers(customEmojiIds: LongArray): TdlResult<StickersDto> {
        val function = TdApi.GetCustomEmojiStickers(
            customEmojiIds = customEmojiIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getDatabaseStatistics(): TdlResult<DatabaseStatisticsDto> {
        val function = TdApi.GetDatabaseStatistics(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getDeepLinkInfo(link: String): TdlResult<DeepLinkInfoDto> {
        val function = TdApi.GetDeepLinkInfo(
            link = link,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getDefaultBackgroundCustomEmojiStickers(): TdlResult<StickersDto> {
        val function = TdApi.GetDefaultBackgroundCustomEmojiStickers(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getDefaultChatEmojiStatuses(): TdlResult<EmojiStatusCustomEmojisDto> {
        val function = TdApi.GetDefaultChatEmojiStatuses(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getDefaultChatPhotoCustomEmojiStickers(): TdlResult<StickersDto> {
        val function = TdApi.GetDefaultChatPhotoCustomEmojiStickers(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getDefaultEmojiStatuses(): TdlResult<EmojiStatusCustomEmojisDto> {
        val function = TdApi.GetDefaultEmojiStatuses(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getDefaultMessageAutoDeleteTime(): TdlResult<MessageAutoDeleteTimeDto> {
        val function = TdApi.GetDefaultMessageAutoDeleteTime(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getDefaultProfilePhotoCustomEmojiStickers(): TdlResult<StickersDto> {
        val function = TdApi.GetDefaultProfilePhotoCustomEmojiStickers(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getDisallowedChatEmojiStatuses(): TdlResult<EmojiStatusCustomEmojisDto> {
        val function = TdApi.GetDisallowedChatEmojiStatuses(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getEmojiCategories(type: EmojiCategoryTypeDto?): TdlResult<EmojiCategoriesDto> {
        val function = TdApi.GetEmojiCategories(
            type = type?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getEmojiReaction(emoji: String): TdlResult<EmojiReactionDto> {
        val function = TdApi.GetEmojiReaction(
            emoji = emoji,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getEmojiSuggestionsUrl(languageCode: String): TdlResult<HttpUrlDto> {
        val function = TdApi.GetEmojiSuggestionsUrl(
            languageCode = languageCode,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getExternalLink(link: String, allowWriteAccess: Boolean): TdlResult<HttpUrlDto> {
        val function = TdApi.GetExternalLink(
            link = link,
            allowWriteAccess = allowWriteAccess,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getExternalLinkInfo(link: String): TdlResult<LoginUrlInfoDto> {
        val function = TdApi.GetExternalLinkInfo(
            link = link,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getFavoriteStickers(): TdlResult<StickersDto> {
        val function = TdApi.GetFavoriteStickers(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getFile(fileId: Int): TdlResult<FileDto> {
        val function = TdApi.GetFile(
            fileId = fileId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getFileDownloadedPrefixSize(fileId: Int, offset: Long): TdlResult<FileDownloadedPrefixSizeDto> {
        val function = TdApi.GetFileDownloadedPrefixSize(
            fileId = fileId,
            offset = offset,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getFileExtension(mimeType: String): TdlResult<TextDto> {
        val function = TdApi.GetFileExtension(
            mimeType = mimeType,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getFileMimeType(fileName: String): TdlResult<TextDto> {
        val function = TdApi.GetFileMimeType(
            fileName = fileName,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getForumTopic(chatId: Long, messageThreadId: Long): TdlResult<ForumTopicDto> {
        val function = TdApi.GetForumTopic(
            chatId = chatId,
            messageThreadId = messageThreadId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getForumTopicDefaultIcons(): TdlResult<StickersDto> {
        val function = TdApi.GetForumTopicDefaultIcons(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getForumTopicLink(chatId: Long, messageThreadId: Long): TdlResult<MessageLinkDto> {
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
    ): TdlResult<ForumTopicsDto> {
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
    ): TdlResult<GameHighScoresDto> {
        val function = TdApi.GetGameHighScores(
            chatId = chatId,
            messageId = messageId,
            userId = userId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getGiftUpgradePreview(giftId: Long): TdlResult<GiftUpgradePreviewDto> {
        val function = TdApi.GetGiftUpgradePreview(
            giftId = giftId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getGiveawayInfo(chatId: Long, messageId: Long): TdlResult<GiveawayInfoDto> {
        val function = TdApi.GetGiveawayInfo(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getGreetingStickers(): TdlResult<StickersDto> {
        val function = TdApi.GetGreetingStickers(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getGrossingWebAppBots(offset: String, limit: Int): TdlResult<FoundUsersDto> {
        val function = TdApi.GetGrossingWebAppBots(
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getGroupCall(groupCallId: Int): TdlResult<GroupCallDto> {
        val function = TdApi.GetGroupCall(
            groupCallId = groupCallId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getGroupCallParticipants(inputGroupCall: InputGroupCallDto, limit: Int): TdlResult<GroupCallParticipantsDto> {
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
    ): TdlResult<ChatsDto> {
        val function = TdApi.GetGroupsInCommon(
            userId = userId,
            offsetChatId = offsetChatId,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getImportedContactCount(): TdlResult<CountDto> {
        val function = TdApi.GetImportedContactCount(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getInactiveSupergroupChats(): TdlResult<ChatsDto> {
        val function = TdApi.GetInactiveSupergroupChats(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getInlineGameHighScores(inlineMessageId: String, userId: Long): TdlResult<GameHighScoresDto> {
        val function = TdApi.GetInlineGameHighScores(
            inlineMessageId = inlineMessageId,
            userId = userId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getInlineQueryResults(
        botUserId: Long,
        chatId: Long,
        userLocation: LocationDto?,
        query: String,
        offset: String,
    ): TdlResult<InlineQueryResultsDto> {
        val function = TdApi.GetInlineQueryResults(
            botUserId = botUserId,
            chatId = chatId,
            userLocation = userLocation?.let { mapper.map(it) },
            query = query,
            offset = offset,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getInstalledBackgrounds(forDarkTheme: Boolean): TdlResult<BackgroundsDto> {
        val function = TdApi.GetInstalledBackgrounds(
            forDarkTheme = forDarkTheme,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getInstalledStickerSets(stickerType: StickerTypeDto): TdlResult<StickerSetsDto> {
        val function = TdApi.GetInstalledStickerSets(
            stickerType = mapper.map(stickerType),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getInternalLink(type: InternalLinkTypeDto, isHttp: Boolean): TdlResult<HttpUrlDto> {
        val function = TdApi.GetInternalLink(
            type = mapper.map(type),
            isHttp = isHttp,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getInternalLinkType(link: String): TdlResult<InternalLinkTypeDto> {
        val function = TdApi.GetInternalLinkType(
            link = link,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getJsonString(jsonValue: JsonValueDto): TdlResult<TextDto> {
        val function = TdApi.GetJsonString(
            jsonValue = mapper.map(jsonValue),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getJsonValue(json: String): TdlResult<JsonValueDto> {
        val function = TdApi.GetJsonValue(
            json = json,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getKeywordEmojis(text: String, inputLanguageCodes: Array<String>): TdlResult<EmojisDto> {
        val function = TdApi.GetKeywordEmojis(
            text = text,
            inputLanguageCodes = inputLanguageCodes,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getLanguagePackInfo(languagePackId: String): TdlResult<LanguagePackInfoDto> {
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
    ): TdlResult<LanguagePackStringValueDto> {
        val function = TdApi.GetLanguagePackString(
            languagePackDatabasePath = languagePackDatabasePath,
            localizationTarget = localizationTarget,
            languagePackId = languagePackId,
            key = key,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getLanguagePackStrings(languagePackId: String, keys: Array<String>): TdlResult<LanguagePackStringsDto> {
        val function = TdApi.GetLanguagePackStrings(
            languagePackId = languagePackId,
            keys = keys,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getLinkPreview(text: FormattedTextDto, linkPreviewOptions: LinkPreviewOptionsDto?): TdlResult<LinkPreviewDto> {
        val function = TdApi.GetLinkPreview(
            text = mapper.map(text),
            linkPreviewOptions = linkPreviewOptions?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getLocalizationTargetInfo(onlyLocal: Boolean): TdlResult<LocalizationTargetInfoDto> {
        val function = TdApi.GetLocalizationTargetInfo(
            onlyLocal = onlyLocal,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getLogStream(): TdlResult<LogStreamDto> {
        val function = TdApi.GetLogStream(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getLogTagVerbosityLevel(tag: String): TdlResult<LogVerbosityLevelDto> {
        val function = TdApi.GetLogTagVerbosityLevel(
            tag = tag,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getLogTags(): TdlResult<LogTagsDto> {
        val function = TdApi.GetLogTags(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getLogVerbosityLevel(): TdlResult<LogVerbosityLevelDto> {
        val function = TdApi.GetLogVerbosityLevel(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getLoginUrl(
        chatId: Long,
        messageId: Long,
        buttonId: Long,
        allowWriteAccess: Boolean,
    ): TdlResult<HttpUrlDto> {
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
    ): TdlResult<LoginUrlInfoDto> {
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
        parameters: WebAppOpenParametersDto,
    ): TdlResult<MainWebAppDto> {
        val function = TdApi.GetMainWebApp(
            chatId = chatId,
            botUserId = botUserId,
            startParameter = startParameter,
            parameters = mapper.map(parameters),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMapThumbnailFile(
        location: LocationDto,
        zoom: Int,
        width: Int,
        height: Int,
        scale: Int,
        chatId: Long,
    ): TdlResult<FileDto> {
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

    override suspend fun getMarkdownText(text: FormattedTextDto): TdlResult<FormattedTextDto> {
        val function = TdApi.GetMarkdownText(
            text = mapper.map(text),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMe(): TdlResult<UserDto> {
        val function = TdApi.GetMe(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMenuButton(userId: Long): TdlResult<BotMenuButtonDto> {
        val function = TdApi.GetMenuButton(
            userId = userId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessage(chatId: Long, messageId: Long): TdlResult<MessageDto> {
        val function = TdApi.GetMessage(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessageAddedReactions(
        chatId: Long,
        messageId: Long,
        reactionType: ReactionTypeDto?,
        offset: String,
        limit: Int,
    ): TdlResult<AddedReactionsDto> {
        val function = TdApi.GetMessageAddedReactions(
            chatId = chatId,
            messageId = messageId,
            reactionType = reactionType?.let { mapper.map(it) },
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessageAvailableReactions(
        chatId: Long,
        messageId: Long,
        rowSize: Int,
    ): TdlResult<AvailableReactionsDto> {
        val function = TdApi.GetMessageAvailableReactions(
            chatId = chatId,
            messageId = messageId,
            rowSize = rowSize,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessageEffect(effectId: Long): TdlResult<MessageEffectDto> {
        val function = TdApi.GetMessageEffect(
            effectId = effectId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessageEmbeddingCode(
        chatId: Long,
        messageId: Long,
        forAlbum: Boolean,
    ): TdlResult<TextDto> {
        val function = TdApi.GetMessageEmbeddingCode(
            chatId = chatId,
            messageId = messageId,
            forAlbum = forAlbum,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessageFileType(messageFileHead: String): TdlResult<MessageFileTypeDto> {
        val function = TdApi.GetMessageFileType(
            messageFileHead = messageFileHead,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessageImportConfirmationText(chatId: Long): TdlResult<TextDto> {
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
    ): TdlResult<MessageLinkDto> {
        val function = TdApi.GetMessageLink(
            chatId = chatId,
            messageId = messageId,
            mediaTimestamp = mediaTimestamp,
            forAlbum = forAlbum,
            inMessageThread = inMessageThread,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessageLinkInfo(url: String): TdlResult<MessageLinkInfoDto> {
        val function = TdApi.GetMessageLinkInfo(
            url = url,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessageLocally(chatId: Long, messageId: Long): TdlResult<MessageDto> {
        val function = TdApi.GetMessageLocally(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessageProperties(chatId: Long, messageId: Long): TdlResult<MessagePropertiesDto> {
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
    ): TdlResult<PublicForwardsDto> {
        val function = TdApi.GetMessagePublicForwards(
            chatId = chatId,
            messageId = messageId,
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessageReadDate(chatId: Long, messageId: Long): TdlResult<MessageReadDateDto> {
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
    ): TdlResult<MessageStatisticsDto> {
        val function = TdApi.GetMessageStatistics(
            chatId = chatId,
            messageId = messageId,
            isDark = isDark,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessageThread(chatId: Long, messageId: Long): TdlResult<MessageThreadInfoDto> {
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
    ): TdlResult<MessagesDto> {
        val function = TdApi.GetMessageThreadHistory(
            chatId = chatId,
            messageId = messageId,
            fromMessageId = fromMessageId,
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessageViewers(chatId: Long, messageId: Long): TdlResult<MessageViewersDto> {
        val function = TdApi.GetMessageViewers(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getMessages(chatId: Long, messageIds: LongArray): TdlResult<MessagesDto> {
        val function = TdApi.GetMessages(
            chatId = chatId,
            messageIds = messageIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getNetworkStatistics(onlyCurrent: Boolean): TdlResult<NetworkStatisticsDto> {
        val function = TdApi.GetNetworkStatistics(
            onlyCurrent = onlyCurrent,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getNewChatPrivacySettings(): TdlResult<NewChatPrivacySettingsDto> {
        val function = TdApi.GetNewChatPrivacySettings(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getOption(name: String): TdlResult<OptionValueDto> {
        val function = TdApi.GetOption(
            name = name,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getOwnedBots(): TdlResult<UsersDto> {
        val function = TdApi.GetOwnedBots(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getOwnedStickerSets(offsetStickerSetId: Long, limit: Int): TdlResult<StickerSetsDto> {
        val function = TdApi.GetOwnedStickerSets(
            offsetStickerSetId = offsetStickerSetId,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPaidMessageRevenue(userId: Long): TdlResult<StarCountDto> {
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
    ): TdlResult<PassportAuthorizationFormDto> {
        val function = TdApi.GetPassportAuthorizationForm(
            botUserId = botUserId,
            scope = scope,
            publicKey = publicKey,
            nonce = nonce,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPassportAuthorizationFormAvailableElements(authorizationFormId: Int, password: String): TdlResult<PassportElementsWithErrorsDto> {
        val function = TdApi.GetPassportAuthorizationFormAvailableElements(
            authorizationFormId = authorizationFormId,
            password = password,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPassportElement(type: PassportElementTypeDto, password: String): TdlResult<PassportElementDto> {
        val function = TdApi.GetPassportElement(
            type = mapper.map(type),
            password = password,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPasswordState(): TdlResult<PasswordStateDto> {
        val function = TdApi.GetPasswordState(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPaymentForm(inputInvoice: InputInvoiceDto, theme: ThemeParametersDto?): TdlResult<PaymentFormDto> {
        val function = TdApi.GetPaymentForm(
            inputInvoice = mapper.map(inputInvoice),
            theme = theme?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPaymentReceipt(chatId: Long, messageId: Long): TdlResult<PaymentReceiptDto> {
        val function = TdApi.GetPaymentReceipt(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPhoneNumberInfo(phoneNumberPrefix: String): TdlResult<PhoneNumberInfoDto> {
        val function = TdApi.GetPhoneNumberInfo(
            phoneNumberPrefix = phoneNumberPrefix,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPhoneNumberInfoSync(languageCode: String, phoneNumberPrefix: String): TdlResult<PhoneNumberInfoDto> {
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
    ): TdlResult<MessageSendersDto> {
        val function = TdApi.GetPollVoters(
            chatId = chatId,
            messageId = messageId,
            optionId = optionId,
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPreferredCountryLanguage(countryCode: String): TdlResult<TextDto> {
        val function = TdApi.GetPreferredCountryLanguage(
            countryCode = countryCode,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPremiumFeatures(source: PremiumSourceDto?): TdlResult<PremiumFeaturesDto> {
        val function = TdApi.GetPremiumFeatures(
            source = source?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPremiumGiftPaymentOptions(): TdlResult<PremiumGiftPaymentOptionsDto> {
        val function = TdApi.GetPremiumGiftPaymentOptions(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPremiumGiveawayPaymentOptions(boostedChatId: Long): TdlResult<PremiumGiveawayPaymentOptionsDto> {
        val function = TdApi.GetPremiumGiveawayPaymentOptions(
            boostedChatId = boostedChatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPremiumInfoSticker(monthCount: Int): TdlResult<StickerDto> {
        val function = TdApi.GetPremiumInfoSticker(
            monthCount = monthCount,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPremiumLimit(limitType: PremiumLimitTypeDto): TdlResult<PremiumLimitDto> {
        val function = TdApi.GetPremiumLimit(
            limitType = mapper.map(limitType),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPremiumState(): TdlResult<PremiumStateDto> {
        val function = TdApi.GetPremiumState(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPremiumStickerExamples(): TdlResult<StickersDto> {
        val function = TdApi.GetPremiumStickerExamples(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPremiumStickers(limit: Int): TdlResult<StickersDto> {
        val function = TdApi.GetPremiumStickers(
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPreparedInlineMessage(botUserId: Long, preparedMessageId: String): TdlResult<PreparedInlineMessageDto> {
        val function = TdApi.GetPreparedInlineMessage(
            botUserId = botUserId,
            preparedMessageId = preparedMessageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getProxies(): TdlResult<ProxiesDto> {
        val function = TdApi.GetProxies(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getProxyLink(proxyId: Int): TdlResult<HttpUrlDto> {
        val function = TdApi.GetProxyLink(
            proxyId = proxyId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getPushReceiverId(payload: String): TdlResult<PushReceiverIdDto> {
        val function = TdApi.GetPushReceiverId(
            payload = payload,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getReadDatePrivacySettings(): TdlResult<ReadDatePrivacySettingsDto> {
        val function = TdApi.GetReadDatePrivacySettings(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getReceivedGift(receivedGiftId: String): TdlResult<ReceivedGiftDto> {
        val function = TdApi.GetReceivedGift(
            receivedGiftId = receivedGiftId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getReceivedGifts(
        businessConnectionId: String,
        ownerId: MessageSenderDto,
        excludeUnsaved: Boolean,
        excludeSaved: Boolean,
        excludeUnlimited: Boolean,
        excludeLimited: Boolean,
        excludeUpgraded: Boolean,
        sortByPrice: Boolean,
        offset: String,
        limit: Int,
    ): TdlResult<ReceivedGiftsDto> {
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

    override suspend fun getRecentEmojiStatuses(): TdlResult<EmojiStatusesDto> {
        val function = TdApi.GetRecentEmojiStatuses(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getRecentInlineBots(): TdlResult<UsersDto> {
        val function = TdApi.GetRecentInlineBots(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getRecentStickers(isAttached: Boolean): TdlResult<StickersDto> {
        val function = TdApi.GetRecentStickers(
            isAttached = isAttached,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getRecentlyOpenedChats(limit: Int): TdlResult<ChatsDto> {
        val function = TdApi.GetRecentlyOpenedChats(
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getRecentlyVisitedTMeUrls(referrer: String): TdlResult<TMeUrlsDto> {
        val function = TdApi.GetRecentlyVisitedTMeUrls(
            referrer = referrer,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getRecommendedChatFolders(): TdlResult<RecommendedChatFoldersDto> {
        val function = TdApi.GetRecommendedChatFolders(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getRecommendedChats(): TdlResult<ChatsDto> {
        val function = TdApi.GetRecommendedChats(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getRecoveryEmailAddress(password: String): TdlResult<RecoveryEmailAddressDto> {
        val function = TdApi.GetRecoveryEmailAddress(
            password = password,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getRemoteFile(remoteFileId: String, fileType: FileTypeDto?): TdlResult<FileDto> {
        val function = TdApi.GetRemoteFile(
            remoteFileId = remoteFileId,
            fileType = fileType?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getRepliedMessage(chatId: Long, messageId: Long): TdlResult<MessageDto> {
        val function = TdApi.GetRepliedMessage(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSavedAnimations(): TdlResult<AnimationsDto> {
        val function = TdApi.GetSavedAnimations(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSavedMessagesTags(savedMessagesTopicId: Long): TdlResult<SavedMessagesTagsDto> {
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
    ): TdlResult<MessagesDto> {
        val function = TdApi.GetSavedMessagesTopicHistory(
            savedMessagesTopicId = savedMessagesTopicId,
            fromMessageId = fromMessageId,
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSavedMessagesTopicMessageByDate(savedMessagesTopicId: Long, date: Int): TdlResult<MessageDto> {
        val function = TdApi.GetSavedMessagesTopicMessageByDate(
            savedMessagesTopicId = savedMessagesTopicId,
            date = date,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSavedNotificationSound(notificationSoundId: Long): TdlResult<NotificationSoundsDto> {
        val function = TdApi.GetSavedNotificationSound(
            notificationSoundId = notificationSoundId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSavedNotificationSounds(): TdlResult<NotificationSoundsDto> {
        val function = TdApi.GetSavedNotificationSounds(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSavedOrderInfo(): TdlResult<OrderInfoDto> {
        val function = TdApi.GetSavedOrderInfo(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getScopeNotificationSettings(scope: NotificationSettingsScopeDto): TdlResult<ScopeNotificationSettingsDto> {
        val function = TdApi.GetScopeNotificationSettings(
            scope = mapper.map(scope),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSearchSponsoredChats(query: String): TdlResult<SponsoredChatsDto> {
        val function = TdApi.GetSearchSponsoredChats(
            query = query,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSearchedForTags(tagPrefix: String, limit: Int): TdlResult<HashtagsDto> {
        val function = TdApi.GetSearchedForTags(
            tagPrefix = tagPrefix,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSecretChat(secretChatId: Int): TdlResult<SecretChatDto> {
        val function = TdApi.GetSecretChat(
            secretChatId = secretChatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStarAdAccountUrl(ownerId: MessageSenderDto): TdlResult<HttpUrlDto> {
        val function = TdApi.GetStarAdAccountUrl(
            ownerId = mapper.map(ownerId),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStarGiftPaymentOptions(userId: Long): TdlResult<StarPaymentOptionsDto> {
        val function = TdApi.GetStarGiftPaymentOptions(
            userId = userId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStarGiveawayPaymentOptions(): TdlResult<StarGiveawayPaymentOptionsDto> {
        val function = TdApi.GetStarGiveawayPaymentOptions(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStarPaymentOptions(): TdlResult<StarPaymentOptionsDto> {
        val function = TdApi.GetStarPaymentOptions(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStarRevenueStatistics(ownerId: MessageSenderDto, isDark: Boolean): TdlResult<StarRevenueStatisticsDto> {
        val function = TdApi.GetStarRevenueStatistics(
            ownerId = mapper.map(ownerId),
            isDark = isDark,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStarSubscriptions(onlyExpiring: Boolean, offset: String): TdlResult<StarSubscriptionsDto> {
        val function = TdApi.GetStarSubscriptions(
            onlyExpiring = onlyExpiring,
            offset = offset,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStarTransactions(
        ownerId: MessageSenderDto,
        subscriptionId: String,
        direction: StarTransactionDirectionDto?,
        offset: String,
        limit: Int,
    ): TdlResult<StarTransactionsDto> {
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
        ownerId: MessageSenderDto,
        starCount: Long,
        password: String,
    ): TdlResult<HttpUrlDto> {
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
    ): TdlResult<StatisticalGraphDto> {
        val function = TdApi.GetStatisticalGraph(
            chatId = chatId,
            token = token,
            x = x,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStickerEmojis(sticker: InputFileDto): TdlResult<EmojisDto> {
        val function = TdApi.GetStickerEmojis(
            sticker = mapper.map(sticker),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStickerOutline(
        stickerFileId: Int,
        forAnimatedEmoji: Boolean,
        forClickedAnimatedEmojiMessage: Boolean,
    ): TdlResult<OutlineDto> {
        val function = TdApi.GetStickerOutline(
            stickerFileId = stickerFileId,
            forAnimatedEmoji = forAnimatedEmoji,
            forClickedAnimatedEmojiMessage = forClickedAnimatedEmojiMessage,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStickerSet(setId: Long): TdlResult<StickerSetDto> {
        val function = TdApi.GetStickerSet(
            setId = setId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStickerSetName(setId: Long): TdlResult<TextDto> {
        val function = TdApi.GetStickerSetName(
            setId = setId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStickers(
        stickerType: StickerTypeDto,
        query: String,
        limit: Int,
        chatId: Long,
    ): TdlResult<StickersDto> {
        val function = TdApi.GetStickers(
            stickerType = mapper.map(stickerType),
            query = query,
            limit = limit,
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStorageStatistics(chatLimit: Int): TdlResult<StorageStatisticsDto> {
        val function = TdApi.GetStorageStatistics(
            chatLimit = chatLimit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStorageStatisticsFast(): TdlResult<StorageStatisticsFastDto> {
        val function = TdApi.GetStorageStatisticsFast(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStory(
        storyPosterChatId: Long,
        storyId: Int,
        onlyLocal: Boolean,
    ): TdlResult<StoryDto> {
        val function = TdApi.GetStory(
            storyPosterChatId = storyPosterChatId,
            storyId = storyId,
            onlyLocal = onlyLocal,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStoryAvailableReactions(rowSize: Int): TdlResult<AvailableReactionsDto> {
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
    ): TdlResult<StoryInteractionsDto> {
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

    override suspend fun getStoryNotificationSettingsExceptions(): TdlResult<ChatsDto> {
        val function = TdApi.GetStoryNotificationSettingsExceptions(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getStoryPublicForwards(
        storyPosterChatId: Long,
        storyId: Int,
        offset: String,
        limit: Int,
    ): TdlResult<PublicForwardsDto> {
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
    ): TdlResult<StoryStatisticsDto> {
        val function = TdApi.GetStoryStatistics(
            chatId = chatId,
            storyId = storyId,
            isDark = isDark,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSuggestedFileName(fileId: Int, directory: String): TdlResult<TextDto> {
        val function = TdApi.GetSuggestedFileName(
            fileId = fileId,
            directory = directory,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSuggestedStickerSetName(title: String): TdlResult<TextDto> {
        val function = TdApi.GetSuggestedStickerSetName(
            title = title,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSuitableDiscussionChats(): TdlResult<ChatsDto> {
        val function = TdApi.GetSuitableDiscussionChats(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSuitablePersonalChats(): TdlResult<ChatsDto> {
        val function = TdApi.GetSuitablePersonalChats(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSupergroup(supergroupId: Long): TdlResult<SupergroupDto> {
        val function = TdApi.GetSupergroup(
            supergroupId = supergroupId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSupergroupFullInfo(supergroupId: Long): TdlResult<SupergroupFullInfoDto> {
        val function = TdApi.GetSupergroupFullInfo(
            supergroupId = supergroupId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSupergroupMembers(
        supergroupId: Long,
        filter: SupergroupMembersFilterDto?,
        offset: Int,
        limit: Int,
    ): TdlResult<ChatMembersDto> {
        val function = TdApi.GetSupergroupMembers(
            supergroupId = supergroupId,
            filter = filter?.let { mapper.map(it) },
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSupportName(): TdlResult<TextDto> {
        val function = TdApi.GetSupportName(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getSupportUser(): TdlResult<UserDto> {
        val function = TdApi.GetSupportUser(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getTemporaryPasswordState(): TdlResult<TemporaryPasswordStateDto> {
        val function = TdApi.GetTemporaryPasswordState(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getTextEntities(text: String): TdlResult<TextEntitiesDto> {
        val function = TdApi.GetTextEntities(
            text = text,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getThemeParametersJsonString(theme: ThemeParametersDto): TdlResult<TextDto> {
        val function = TdApi.GetThemeParametersJsonString(
            theme = mapper.map(theme),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getThemedChatEmojiStatuses(): TdlResult<EmojiStatusCustomEmojisDto> {
        val function = TdApi.GetThemedChatEmojiStatuses(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getThemedEmojiStatuses(): TdlResult<EmojiStatusCustomEmojisDto> {
        val function = TdApi.GetThemedEmojiStatuses(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getTimeZones(): TdlResult<TimeZonesDto> {
        val function = TdApi.GetTimeZones(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getTopChats(category: TopChatCategoryDto, limit: Int): TdlResult<ChatsDto> {
        val function = TdApi.GetTopChats(
            category = mapper.map(category),
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getTrendingStickerSets(
        stickerType: StickerTypeDto,
        offset: Int,
        limit: Int,
    ): TdlResult<TrendingStickerSetsDto> {
        val function = TdApi.GetTrendingStickerSets(
            stickerType = mapper.map(stickerType),
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getUpgradedGift(name: String): TdlResult<UpgradedGiftDto> {
        val function = TdApi.GetUpgradedGift(
            name = name,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getUpgradedGiftEmojiStatuses(): TdlResult<EmojiStatusesDto> {
        val function = TdApi.GetUpgradedGiftEmojiStatuses(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getUpgradedGiftWithdrawalUrl(receivedGiftId: String, password: String): TdlResult<HttpUrlDto> {
        val function = TdApi.GetUpgradedGiftWithdrawalUrl(
            receivedGiftId = receivedGiftId,
            password = password,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getUser(userId: Long): TdlResult<UserDto> {
        val function = TdApi.GetUser(
            userId = userId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getUserChatBoosts(chatId: Long, userId: Long): TdlResult<FoundChatBoostsDto> {
        val function = TdApi.GetUserChatBoosts(
            chatId = chatId,
            userId = userId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getUserFullInfo(userId: Long): TdlResult<UserFullInfoDto> {
        val function = TdApi.GetUserFullInfo(
            userId = userId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getUserLink(): TdlResult<UserLinkDto> {
        val function = TdApi.GetUserLink(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getUserPrivacySettingRules(setting: UserPrivacySettingDto): TdlResult<UserPrivacySettingRulesDto> {
        val function = TdApi.GetUserPrivacySettingRules(
            setting = mapper.map(setting),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getUserProfilePhotos(
        userId: Long,
        offset: Int,
        limit: Int,
    ): TdlResult<ChatPhotosDto> {
        val function = TdApi.GetUserProfilePhotos(
            userId = userId,
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getUserSupportInfo(userId: Long): TdlResult<UserSupportInfoDto> {
        val function = TdApi.GetUserSupportInfo(
            userId = userId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getVideoChatAvailableParticipants(chatId: Long): TdlResult<MessageSendersDto> {
        val function = TdApi.GetVideoChatAvailableParticipants(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getVideoChatInviteLink(groupCallId: Int, canSelfUnmute: Boolean): TdlResult<HttpUrlDto> {
        val function = TdApi.GetVideoChatInviteLink(
            groupCallId = groupCallId,
            canSelfUnmute = canSelfUnmute,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getVideoChatRtmpUrl(chatId: Long): TdlResult<RtmpUrlDto> {
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
        videoQuality: GroupCallVideoQualityDto?,
    ): TdlResult<DataDto> {
        val function = TdApi.GetVideoChatStreamSegment(
            groupCallId = groupCallId,
            timeOffset = timeOffset,
            scale = scale,
            channelId = channelId,
            videoQuality = videoQuality?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getVideoChatStreams(groupCallId: Int): TdlResult<VideoChatStreamsDto> {
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
        parameters: WebAppOpenParametersDto,
    ): TdlResult<HttpUrlDto> {
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

    override suspend fun getWebAppPlaceholder(botUserId: Long): TdlResult<OutlineDto> {
        val function = TdApi.GetWebAppPlaceholder(
            botUserId = botUserId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getWebAppUrl(
        botUserId: Long,
        url: String,
        parameters: WebAppOpenParametersDto,
    ): TdlResult<HttpUrlDto> {
        val function = TdApi.GetWebAppUrl(
            botUserId = botUserId,
            url = url,
            parameters = mapper.map(parameters),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun getWebPageInstantView(url: String, onlyLocal: Boolean): TdlResult<WebPageInstantViewDto> {
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
        text: FormattedTextDto,
    ): TdlResult<OkDto> {
        val function = TdApi.GiftPremiumWithStars(
            userId = userId,
            starCount = starCount,
            monthCount = monthCount,
            text = mapper.map(text),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun hideContactCloseBirthdays(): TdlResult<OkDto> {
        val function = TdApi.HideContactCloseBirthdays(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun hideSuggestedAction(action: SuggestedActionDto): TdlResult<OkDto> {
        val function = TdApi.HideSuggestedAction(
            action = mapper.map(action),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun importContacts(contacts: Array<ContactDto>): TdlResult<ImportedContactsDto> {
        val function = TdApi.ImportContacts(
            contacts = contacts.mapArray { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun importMessages(
        chatId: Long,
        messageFile: InputFileDto,
        attachedFiles: Array<InputFileDto>,
    ): TdlResult<OkDto> {
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
    ): TdlResult<InviteGroupCallParticipantResultDto> {
        val function = TdApi.InviteGroupCallParticipant(
            groupCallId = groupCallId,
            userId = userId,
            isVideo = isVideo,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun inviteVideoChatParticipants(groupCallId: Int, userIds: LongArray): TdlResult<OkDto> {
        val function = TdApi.InviteVideoChatParticipants(
            groupCallId = groupCallId,
            userIds = userIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun joinChat(chatId: Long): TdlResult<OkDto> {
        val function = TdApi.JoinChat(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun joinChatByInviteLink(inviteLink: String): TdlResult<ChatDto> {
        val function = TdApi.JoinChatByInviteLink(
            inviteLink = inviteLink,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun joinGroupCall(inputGroupCall: InputGroupCallDto, joinParameters: GroupCallJoinParametersDto): TdlResult<GroupCallInfoDto> {
        val function = TdApi.JoinGroupCall(
            inputGroupCall = mapper.map(inputGroupCall),
            joinParameters = mapper.map(joinParameters),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun joinVideoChat(
        groupCallId: Int,
        participantId: MessageSenderDto?,
        joinParameters: GroupCallJoinParametersDto,
        inviteHash: String,
    ): TdlResult<TextDto> {
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
        parameters: GiveawayParametersDto,
        winnerCount: Int,
        starCount: Long,
    ): TdlResult<OkDto> {
        val function = TdApi.LaunchPrepaidGiveaway(
            giveawayId = giveawayId,
            parameters = mapper.map(parameters),
            winnerCount = winnerCount,
            starCount = starCount,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun leaveChat(chatId: Long): TdlResult<OkDto> {
        val function = TdApi.LeaveChat(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun leaveGroupCall(groupCallId: Int): TdlResult<OkDto> {
        val function = TdApi.LeaveGroupCall(
            groupCallId = groupCallId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun loadActiveStories(storyList: StoryListDto): TdlResult<OkDto> {
        val function = TdApi.LoadActiveStories(
            storyList = mapper.map(storyList),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun loadChats(chatList: ChatListDto?, limit: Int): TdlResult<OkDto> {
        val function = TdApi.LoadChats(
            chatList = chatList?.let { mapper.map(it) },
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun loadGroupCallParticipants(groupCallId: Int, limit: Int): TdlResult<OkDto> {
        val function = TdApi.LoadGroupCallParticipants(
            groupCallId = groupCallId,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun loadQuickReplyShortcutMessages(shortcutId: Int): TdlResult<OkDto> {
        val function = TdApi.LoadQuickReplyShortcutMessages(
            shortcutId = shortcutId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun loadQuickReplyShortcuts(): TdlResult<OkDto> {
        val function = TdApi.LoadQuickReplyShortcuts(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun loadSavedMessagesTopics(limit: Int): TdlResult<OkDto> {
        val function = TdApi.LoadSavedMessagesTopics(
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun logOut(): TdlResult<OkDto> {
        val function = TdApi.LogOut(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun openBotSimilarBot(botUserId: Long, openedBotUserId: Long): TdlResult<OkDto> {
        val function = TdApi.OpenBotSimilarBot(
            botUserId = botUserId,
            openedBotUserId = openedBotUserId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun openChat(chatId: Long): TdlResult<OkDto> {
        val function = TdApi.OpenChat(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun openChatSimilarChat(chatId: Long, openedChatId: Long): TdlResult<OkDto> {
        val function = TdApi.OpenChatSimilarChat(
            chatId = chatId,
            openedChatId = openedChatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun openMessageContent(chatId: Long, messageId: Long): TdlResult<OkDto> {
        val function = TdApi.OpenMessageContent(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun openSponsoredChat(sponsoredChatUniqueId: Long): TdlResult<OkDto> {
        val function = TdApi.OpenSponsoredChat(
            sponsoredChatUniqueId = sponsoredChatUniqueId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun openStory(storyPosterChatId: Long, storyId: Int): TdlResult<OkDto> {
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
        replyTo: InputMessageReplyToDto?,
        parameters: WebAppOpenParametersDto,
    ): TdlResult<WebAppInfoDto> {
        val function = TdApi.OpenWebApp(
            chatId = chatId,
            botUserId = botUserId,
            url = url,
            messageThreadId = messageThreadId,
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
        fileTypes: Array<FileTypeDto>,
        chatIds: LongArray,
        excludeChatIds: LongArray,
        returnDeletedFileStatistics: Boolean,
        chatLimit: Int,
    ): TdlResult<StorageStatisticsDto> {
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

    override suspend fun parseMarkdown(text: FormattedTextDto): TdlResult<FormattedTextDto> {
        val function = TdApi.ParseMarkdown(
            text = mapper.map(text),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun parseTextEntities(text: String, parseMode: TextParseModeDto): TdlResult<FormattedTextDto> {
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
    ): TdlResult<OkDto> {
        val function = TdApi.PinChatMessage(
            chatId = chatId,
            messageId = messageId,
            disableNotification = disableNotification,
            onlyForSelf = onlyForSelf,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun pingProxy(proxyId: Int): TdlResult<SecondsDto> {
        val function = TdApi.PingProxy(
            proxyId = proxyId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun postStory(
        chatId: Long,
        content: InputStoryContentDto,
        areas: InputStoryAreasDto?,
        caption: FormattedTextDto?,
        privacySettings: StoryPrivacySettingsDto,
        activePeriod: Int,
        fromStoryFullId: StoryFullIdDto?,
        isPostedToChatPage: Boolean,
        protectContent: Boolean,
    ): TdlResult<StoryDto> {
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
        file: InputFileDto,
        fileType: FileTypeDto?,
        priority: Int,
    ): TdlResult<FileDto> {
        val function = TdApi.PreliminaryUploadFile(
            file = mapper.map(file),
            fileType = fileType?.let { mapper.map(it) },
            priority = priority,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun processChatFolderNewChats(chatFolderId: Int, addedChatIds: LongArray): TdlResult<OkDto> {
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
    ): TdlResult<OkDto> {
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
    ): TdlResult<OkDto> {
        val function = TdApi.ProcessChatJoinRequests(
            chatId = chatId,
            inviteLink = inviteLink,
            approve = approve,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun processPushNotification(payload: String): TdlResult<OkDto> {
        val function = TdApi.ProcessPushNotification(
            payload = payload,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun rateSpeechRecognition(
        chatId: Long,
        messageId: Long,
        isGood: Boolean,
    ): TdlResult<OkDto> {
        val function = TdApi.RateSpeechRecognition(
            chatId = chatId,
            messageId = messageId,
            isGood = isGood,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun readAllChatMentions(chatId: Long): TdlResult<OkDto> {
        val function = TdApi.ReadAllChatMentions(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun readAllChatReactions(chatId: Long): TdlResult<OkDto> {
        val function = TdApi.ReadAllChatReactions(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun readAllMessageThreadMentions(chatId: Long, messageThreadId: Long): TdlResult<OkDto> {
        val function = TdApi.ReadAllMessageThreadMentions(
            chatId = chatId,
            messageThreadId = messageThreadId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun readAllMessageThreadReactions(chatId: Long, messageThreadId: Long): TdlResult<OkDto> {
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
    ): TdlResult<OkDto> {
        val function = TdApi.ReadBusinessMessage(
            businessConnectionId = businessConnectionId,
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun readChatList(chatList: ChatListDto): TdlResult<OkDto> {
        val function = TdApi.ReadChatList(
            chatList = mapper.map(chatList),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun readFilePart(
        fileId: Int,
        offset: Long,
        count: Long,
    ): TdlResult<DataDto> {
        val function = TdApi.ReadFilePart(
            fileId = fileId,
            offset = offset,
            count = count,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun readdQuickReplyShortcutMessages(shortcutName: String, messageIds: LongArray): TdlResult<QuickReplyMessagesDto> {
        val function = TdApi.ReaddQuickReplyShortcutMessages(
            shortcutName = shortcutName,
            messageIds = messageIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun recognizeSpeech(chatId: Long, messageId: Long): TdlResult<OkDto> {
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
    ): TdlResult<OkDto> {
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
    ): TdlResult<PasswordStateDto> {
        val function = TdApi.RecoverPassword(
            recoveryCode = recoveryCode,
            newPassword = newPassword,
            newHint = newHint,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun refundStarPayment(userId: Long, telegramPaymentChargeId: String): TdlResult<OkDto> {
        val function = TdApi.RefundStarPayment(
            userId = userId,
            telegramPaymentChargeId = telegramPaymentChargeId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun registerDevice(deviceToken: DeviceTokenDto, otherUserIds: LongArray): TdlResult<PushReceiverIdDto> {
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
    ): TdlResult<OkDto> {
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
    ): TdlResult<OkDto> {
        val function = TdApi.RemoveAllFilesFromDownloads(
            onlyActive = onlyActive,
            onlyCompleted = onlyCompleted,
            deleteFromCache = deleteFromCache,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeBusinessConnectedBotFromChat(chatId: Long): TdlResult<OkDto> {
        val function = TdApi.RemoveBusinessConnectedBotFromChat(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeChatActionBar(chatId: Long): TdlResult<OkDto> {
        val function = TdApi.RemoveChatActionBar(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeContacts(userIds: LongArray): TdlResult<OkDto> {
        val function = TdApi.RemoveContacts(
            userIds = userIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeFavoriteSticker(sticker: InputFileDto): TdlResult<OkDto> {
        val function = TdApi.RemoveFavoriteSticker(
            sticker = mapper.map(sticker),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeFileFromDownloads(fileId: Int, deleteFromCache: Boolean): TdlResult<OkDto> {
        val function = TdApi.RemoveFileFromDownloads(
            fileId = fileId,
            deleteFromCache = deleteFromCache,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeInstalledBackground(backgroundId: Long): TdlResult<OkDto> {
        val function = TdApi.RemoveInstalledBackground(
            backgroundId = backgroundId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeMessageReaction(
        chatId: Long,
        messageId: Long,
        reactionType: ReactionTypeDto,
    ): TdlResult<OkDto> {
        val function = TdApi.RemoveMessageReaction(
            chatId = chatId,
            messageId = messageId,
            reactionType = mapper.map(reactionType),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeMessageSenderBotVerification(botUserId: Long, verifiedId: MessageSenderDto): TdlResult<OkDto> {
        val function = TdApi.RemoveMessageSenderBotVerification(
            botUserId = botUserId,
            verifiedId = mapper.map(verifiedId),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeNotification(notificationGroupId: Int, notificationId: Int): TdlResult<OkDto> {
        val function = TdApi.RemoveNotification(
            notificationGroupId = notificationGroupId,
            notificationId = notificationId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeNotificationGroup(notificationGroupId: Int, maxNotificationId: Int): TdlResult<OkDto> {
        val function = TdApi.RemoveNotificationGroup(
            notificationGroupId = notificationGroupId,
            maxNotificationId = maxNotificationId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removePendingPaidMessageReactions(chatId: Long, messageId: Long): TdlResult<OkDto> {
        val function = TdApi.RemovePendingPaidMessageReactions(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeProxy(proxyId: Int): TdlResult<OkDto> {
        val function = TdApi.RemoveProxy(
            proxyId = proxyId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeRecentHashtag(hashtag: String): TdlResult<OkDto> {
        val function = TdApi.RemoveRecentHashtag(
            hashtag = hashtag,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeRecentSticker(isAttached: Boolean, sticker: InputFileDto): TdlResult<OkDto> {
        val function = TdApi.RemoveRecentSticker(
            isAttached = isAttached,
            sticker = mapper.map(sticker),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeRecentlyFoundChat(chatId: Long): TdlResult<OkDto> {
        val function = TdApi.RemoveRecentlyFoundChat(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeSavedAnimation(animation: InputFileDto): TdlResult<OkDto> {
        val function = TdApi.RemoveSavedAnimation(
            animation = mapper.map(animation),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeSavedNotificationSound(notificationSoundId: Long): TdlResult<OkDto> {
        val function = TdApi.RemoveSavedNotificationSound(
            notificationSoundId = notificationSoundId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeSearchedForTag(tag: String): TdlResult<OkDto> {
        val function = TdApi.RemoveSearchedForTag(
            tag = tag,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeStickerFromSet(sticker: InputFileDto): TdlResult<OkDto> {
        val function = TdApi.RemoveStickerFromSet(
            sticker = mapper.map(sticker),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun removeTopChat(category: TopChatCategoryDto, chatId: Long): TdlResult<OkDto> {
        val function = TdApi.RemoveTopChat(
            category = mapper.map(category),
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun reorderActiveUsernames(usernames: Array<String>): TdlResult<OkDto> {
        val function = TdApi.ReorderActiveUsernames(
            usernames = usernames,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun reorderBotActiveUsernames(botUserId: Long, usernames: Array<String>): TdlResult<OkDto> {
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
    ): TdlResult<OkDto> {
        val function = TdApi.ReorderBotMediaPreviews(
            botUserId = botUserId,
            languageCode = languageCode,
            fileIds = fileIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun reorderChatFolders(chatFolderIds: IntArray, mainChatListPosition: Int): TdlResult<OkDto> {
        val function = TdApi.ReorderChatFolders(
            chatFolderIds = chatFolderIds,
            mainChatListPosition = mainChatListPosition,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun reorderInstalledStickerSets(stickerType: StickerTypeDto, stickerSetIds: LongArray): TdlResult<OkDto> {
        val function = TdApi.ReorderInstalledStickerSets(
            stickerType = mapper.map(stickerType),
            stickerSetIds = stickerSetIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun reorderQuickReplyShortcuts(shortcutIds: IntArray): TdlResult<OkDto> {
        val function = TdApi.ReorderQuickReplyShortcuts(
            shortcutIds = shortcutIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun reorderSupergroupActiveUsernames(supergroupId: Long, usernames: Array<String>): TdlResult<OkDto> {
        val function = TdApi.ReorderSupergroupActiveUsernames(
            supergroupId = supergroupId,
            usernames = usernames,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun replacePrimaryChatInviteLink(chatId: Long): TdlResult<ChatInviteLinkDto> {
        val function = TdApi.ReplacePrimaryChatInviteLink(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun replaceStickerInSet(
        userId: Long,
        name: String,
        oldSticker: InputFileDto,
        newSticker: InputStickerDto,
    ): TdlResult<OkDto> {
        val function = TdApi.ReplaceStickerInSet(
            userId = userId,
            name = name,
            oldSticker = mapper.map(oldSticker),
            newSticker = mapper.map(newSticker),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun replaceVideoChatRtmpUrl(chatId: Long): TdlResult<RtmpUrlDto> {
        val function = TdApi.ReplaceVideoChatRtmpUrl(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun reportAuthenticationCodeMissing(mobileNetworkCode: String): TdlResult<OkDto> {
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
    ): TdlResult<ReportChatResultDto> {
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
        reason: ReportReasonDto,
        text: String,
    ): TdlResult<OkDto> {
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
    ): TdlResult<ReportSponsoredResultDto> {
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
        senderId: MessageSenderDto,
    ): TdlResult<OkDto> {
        val function = TdApi.ReportMessageReactions(
            chatId = chatId,
            messageId = messageId,
            senderId = mapper.map(senderId),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun reportPhoneNumberCodeMissing(mobileNetworkCode: String): TdlResult<OkDto> {
        val function = TdApi.ReportPhoneNumberCodeMissing(
            mobileNetworkCode = mobileNetworkCode,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun reportSponsoredChat(sponsoredChatUniqueId: Long, optionId: ByteArray): TdlResult<ReportSponsoredResultDto> {
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
    ): TdlResult<ReportStoryResultDto> {
        val function = TdApi.ReportStory(
            storyPosterChatId = storyPosterChatId,
            storyId = storyId,
            optionId = optionId,
            text = text,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun reportSupergroupAntiSpamFalsePositive(supergroupId: Long, messageId: Long): TdlResult<OkDto> {
        val function = TdApi.ReportSupergroupAntiSpamFalsePositive(
            supergroupId = supergroupId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun reportSupergroupSpam(supergroupId: Long, messageIds: LongArray): TdlResult<OkDto> {
        val function = TdApi.ReportSupergroupSpam(
            supergroupId = supergroupId,
            messageIds = messageIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun requestAuthenticationPasswordRecovery(): TdlResult<OkDto> {
        val function = TdApi.RequestAuthenticationPasswordRecovery(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun requestPasswordRecovery(): TdlResult<EmailAddressAuthenticationCodeInfoDto> {
        val function = TdApi.RequestPasswordRecovery(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun requestQrCodeAuthentication(otherUserIds: LongArray): TdlResult<OkDto> {
        val function = TdApi.RequestQrCodeAuthentication(
            otherUserIds = otherUserIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun resendAuthenticationCode(reason: ResendCodeReasonDto?): TdlResult<OkDto> {
        val function = TdApi.ResendAuthenticationCode(
            reason = reason?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun resendEmailAddressVerificationCode(): TdlResult<EmailAddressAuthenticationCodeInfoDto> {
        val function = TdApi.ResendEmailAddressVerificationCode(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun resendLoginEmailAddressCode(): TdlResult<EmailAddressAuthenticationCodeInfoDto> {
        val function = TdApi.ResendLoginEmailAddressCode(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun resendMessages(
        chatId: Long,
        messageIds: LongArray,
        quote: InputTextQuoteDto?,
        paidMessageStarCount: Long,
    ): TdlResult<MessagesDto> {
        val function = TdApi.ResendMessages(
            chatId = chatId,
            messageIds = messageIds,
            quote = quote?.let { mapper.map(it) },
            paidMessageStarCount = paidMessageStarCount,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun resendPhoneNumberCode(reason: ResendCodeReasonDto?): TdlResult<AuthenticationCodeInfoDto> {
        val function = TdApi.ResendPhoneNumberCode(
            reason = reason?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun resendRecoveryEmailAddressCode(): TdlResult<PasswordStateDto> {
        val function = TdApi.ResendRecoveryEmailAddressCode(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun resetAllNotificationSettings(): TdlResult<OkDto> {
        val function = TdApi.ResetAllNotificationSettings(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun resetAuthenticationEmailAddress(): TdlResult<OkDto> {
        val function = TdApi.ResetAuthenticationEmailAddress(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun resetInstalledBackgrounds(): TdlResult<OkDto> {
        val function = TdApi.ResetInstalledBackgrounds(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun resetNetworkStatistics(): TdlResult<OkDto> {
        val function = TdApi.ResetNetworkStatistics(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun resetPassword(): TdlResult<ResetPasswordResultDto> {
        val function = TdApi.ResetPassword(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun reuseStarSubscription(subscriptionId: String): TdlResult<OkDto> {
        val function = TdApi.ReuseStarSubscription(
            subscriptionId = subscriptionId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun revokeChatInviteLink(chatId: Long, inviteLink: String): TdlResult<ChatInviteLinksDto> {
        val function = TdApi.RevokeChatInviteLink(
            chatId = chatId,
            inviteLink = inviteLink,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun revokeGroupCallInviteLink(groupCallId: Int): TdlResult<OkDto> {
        val function = TdApi.RevokeGroupCallInviteLink(
            groupCallId = groupCallId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun saveApplicationLogEvent(
        type: String,
        chatId: Long,
        data: JsonValueDto,
    ): TdlResult<OkDto> {
        val function = TdApi.SaveApplicationLogEvent(
            type = type,
            chatId = chatId,
            data = mapper.map(data),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun savePreparedInlineMessage(
        userId: Long,
        result: InputInlineQueryResultDto,
        chatTypes: TargetChatTypesDto,
    ): TdlResult<PreparedInlineMessageIdDto> {
        val function = TdApi.SavePreparedInlineMessage(
            userId = userId,
            result = mapper.map(result),
            chatTypes = mapper.map(chatTypes),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchAffiliatePrograms(
        affiliate: AffiliateTypeDto,
        sortOrder: AffiliateProgramSortOrderDto,
        offset: String,
        limit: Int,
    ): TdlResult<FoundAffiliateProgramsDto> {
        val function = TdApi.SearchAffiliatePrograms(
            affiliate = mapper.map(affiliate),
            sortOrder = mapper.map(sortOrder),
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchBackground(name: String): TdlResult<BackgroundDto> {
        val function = TdApi.SearchBackground(
            name = name,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchCallMessages(
        offset: String,
        limit: Int,
        onlyMissed: Boolean,
    ): TdlResult<FoundMessagesDto> {
        val function = TdApi.SearchCallMessages(
            offset = offset,
            limit = limit,
            onlyMissed = onlyMissed,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchChatAffiliateProgram(username: String, referrer: String): TdlResult<ChatDto> {
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
        filter: ChatMembersFilterDto?,
    ): TdlResult<ChatMembersDto> {
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
        query: String,
        senderId: MessageSenderDto?,
        fromMessageId: Long,
        offset: Int,
        limit: Int,
        filter: SearchMessagesFilterDto?,
        messageThreadId: Long,
        savedMessagesTopicId: Long,
    ): TdlResult<FoundChatMessagesDto> {
        val function = TdApi.SearchChatMessages(
            chatId = chatId,
            query = query,
            senderId = senderId?.let { mapper.map(it) },
            fromMessageId = fromMessageId,
            offset = offset,
            limit = limit,
            filter = filter?.let { mapper.map(it) },
            messageThreadId = messageThreadId,
            savedMessagesTopicId = savedMessagesTopicId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchChatRecentLocationMessages(chatId: Long, limit: Int): TdlResult<MessagesDto> {
        val function = TdApi.SearchChatRecentLocationMessages(
            chatId = chatId,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchChats(query: String, limit: Int): TdlResult<ChatsDto> {
        val function = TdApi.SearchChats(
            query = query,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchChatsOnServer(query: String, limit: Int): TdlResult<ChatsDto> {
        val function = TdApi.SearchChatsOnServer(
            query = query,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchContacts(query: String, limit: Int): TdlResult<UsersDto> {
        val function = TdApi.SearchContacts(
            query = query,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchEmojis(text: String, inputLanguageCodes: Array<String>): TdlResult<EmojiKeywordsDto> {
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
    ): TdlResult<FoundFileDownloadsDto> {
        val function = TdApi.SearchFileDownloads(
            query = query,
            onlyActive = onlyActive,
            onlyCompleted = onlyCompleted,
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchHashtags(prefix: String, limit: Int): TdlResult<HashtagsDto> {
        val function = TdApi.SearchHashtags(
            prefix = prefix,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchInstalledStickerSets(
        stickerType: StickerTypeDto,
        query: String,
        limit: Int,
    ): TdlResult<StickerSetsDto> {
        val function = TdApi.SearchInstalledStickerSets(
            stickerType = mapper.map(stickerType),
            query = query,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchMessages(
        chatList: ChatListDto?,
        query: String,
        offset: String,
        limit: Int,
        filter: SearchMessagesFilterDto?,
        chatTypeFilter: SearchMessagesChatTypeFilterDto?,
        minDate: Int,
        maxDate: Int,
    ): TdlResult<FoundMessagesDto> {
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

    override suspend fun searchOutgoingDocumentMessages(query: String, limit: Int): TdlResult<FoundMessagesDto> {
        val function = TdApi.SearchOutgoingDocumentMessages(
            query = query,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchPublicChat(username: String): TdlResult<ChatDto> {
        val function = TdApi.SearchPublicChat(
            username = username,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchPublicChats(query: String): TdlResult<ChatsDto> {
        val function = TdApi.SearchPublicChats(
            query = query,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchPublicMessagesByTag(
        tag: String,
        offset: String,
        limit: Int,
    ): TdlResult<FoundMessagesDto> {
        val function = TdApi.SearchPublicMessagesByTag(
            tag = tag,
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchPublicStoriesByLocation(
        address: LocationAddressDto,
        offset: String,
        limit: Int,
    ): TdlResult<FoundStoriesDto> {
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
    ): TdlResult<FoundStoriesDto> {
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
    ): TdlResult<FoundStoriesDto> {
        val function = TdApi.SearchPublicStoriesByVenue(
            venueProvider = venueProvider,
            venueId = venueId,
            offset = offset,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchQuote(
        text: FormattedTextDto,
        quote: FormattedTextDto,
        quotePosition: Int,
    ): TdlResult<FoundPositionDto> {
        val function = TdApi.SearchQuote(
            text = mapper.map(text),
            quote = mapper.map(quote),
            quotePosition = quotePosition,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchRecentlyFoundChats(query: String, limit: Int): TdlResult<ChatsDto> {
        val function = TdApi.SearchRecentlyFoundChats(
            query = query,
            limit = limit,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchSavedMessages(
        savedMessagesTopicId: Long,
        tag: ReactionTypeDto?,
        query: String,
        fromMessageId: Long,
        offset: Int,
        limit: Int,
    ): TdlResult<FoundChatMessagesDto> {
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
        filter: SearchMessagesFilterDto?,
    ): TdlResult<FoundMessagesDto> {
        val function = TdApi.SearchSecretMessages(
            chatId = chatId,
            query = query,
            offset = offset,
            limit = limit,
            filter = filter?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchStickerSet(name: String, ignoreCache: Boolean): TdlResult<StickerSetDto> {
        val function = TdApi.SearchStickerSet(
            name = name,
            ignoreCache = ignoreCache,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchStickerSets(stickerType: StickerTypeDto, query: String): TdlResult<StickerSetsDto> {
        val function = TdApi.SearchStickerSets(
            stickerType = mapper.map(stickerType),
            query = query,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchStickers(
        stickerType: StickerTypeDto,
        emojis: String,
        query: String,
        inputLanguageCodes: Array<String>,
        offset: Int,
        limit: Int,
    ): TdlResult<StickersDto> {
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
    ): TdlResult<FoundPositionsDto> {
        val function = TdApi.SearchStringsByPrefix(
            strings = strings,
            query = query,
            limit = limit,
            returnNoneForEmptyQuery = returnNoneForEmptyQuery,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchUserByPhoneNumber(phoneNumber: String, onlyLocal: Boolean): TdlResult<UserDto> {
        val function = TdApi.SearchUserByPhoneNumber(
            phoneNumber = phoneNumber,
            onlyLocal = onlyLocal,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchUserByToken(token: String): TdlResult<UserDto> {
        val function = TdApi.SearchUserByToken(
            token = token,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun searchWebApp(botUserId: Long, webAppShortName: String): TdlResult<FoundWebAppDto> {
        val function = TdApi.SearchWebApp(
            botUserId = botUserId,
            webAppShortName = webAppShortName,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sellGift(businessConnectionId: String, receivedGiftId: String): TdlResult<OkDto> {
        val function = TdApi.SellGift(
            businessConnectionId = businessConnectionId,
            receivedGiftId = receivedGiftId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendAuthenticationFirebaseSms(token: String): TdlResult<OkDto> {
        val function = TdApi.SendAuthenticationFirebaseSms(
            token = token,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendBotStartMessage(
        botUserId: Long,
        chatId: Long,
        parameter: String,
    ): TdlResult<MessageDto> {
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
        replyTo: InputMessageReplyToDto?,
        disableNotification: Boolean,
        protectContent: Boolean,
        effectId: Long,
        replyMarkup: ReplyMarkupDto?,
        inputMessageContent: InputMessageContentDto,
    ): TdlResult<BusinessMessageDto> {
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
        replyTo: InputMessageReplyToDto?,
        disableNotification: Boolean,
        protectContent: Boolean,
        effectId: Long,
        inputMessageContents: Array<InputMessageContentDto>,
    ): TdlResult<BusinessMessagesDto> {
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

    override suspend fun sendCallDebugInformation(callId: Int, debugInformation: String): TdlResult<OkDto> {
        val function = TdApi.SendCallDebugInformation(
            callId = callId,
            debugInformation = debugInformation,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendCallLog(callId: Int, logFile: InputFileDto): TdlResult<OkDto> {
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
        problems: Array<CallProblemDto>,
    ): TdlResult<OkDto> {
        val function = TdApi.SendCallRating(
            callId = callId,
            rating = rating,
            comment = comment,
            problems = problems.mapArray { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendCallSignalingData(callId: Int, data: ByteArray): TdlResult<OkDto> {
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
        action: ChatActionDto?,
    ): TdlResult<OkDto> {
        val function = TdApi.SendChatAction(
            chatId = chatId,
            messageThreadId = messageThreadId,
            businessConnectionId = businessConnectionId,
            action = action?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendCustomRequest(method: String, parameters: String): TdlResult<CustomRequestResultDto> {
        val function = TdApi.SendCustomRequest(
            method = method,
            parameters = parameters,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendEmailAddressVerificationCode(emailAddress: String): TdlResult<EmailAddressAuthenticationCodeInfoDto> {
        val function = TdApi.SendEmailAddressVerificationCode(
            emailAddress = emailAddress,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendGift(
        giftId: Long,
        ownerId: MessageSenderDto,
        text: FormattedTextDto,
        isPrivate: Boolean,
        payForUpgrade: Boolean,
    ): TdlResult<OkDto> {
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
        replyTo: InputMessageReplyToDto?,
        options: MessageSendOptionsDto?,
        queryId: Long,
        resultId: String,
        hideViaBot: Boolean,
    ): TdlResult<MessageDto> {
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
        replyTo: InputMessageReplyToDto?,
        options: MessageSendOptionsDto?,
        replyMarkup: ReplyMarkupDto?,
        inputMessageContent: InputMessageContentDto,
    ): TdlResult<MessageDto> {
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
        replyTo: InputMessageReplyToDto?,
        options: MessageSendOptionsDto?,
        inputMessageContents: Array<InputMessageContentDto>,
    ): TdlResult<MessagesDto> {
        val function = TdApi.SendMessageAlbum(
            chatId = chatId,
            messageThreadId = messageThreadId,
            replyTo = replyTo?.let { mapper.map(it) },
            options = options?.let { mapper.map(it) },
            inputMessageContents = inputMessageContents.mapArray { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendPassportAuthorizationForm(authorizationFormId: Int, types: Array<PassportElementTypeDto>): TdlResult<OkDto> {
        val function = TdApi.SendPassportAuthorizationForm(
            authorizationFormId = authorizationFormId,
            types = types.mapArray { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendPaymentForm(
        inputInvoice: InputInvoiceDto,
        paymentFormId: Long,
        orderInfoId: String,
        shippingOptionId: String,
        credentials: InputCredentialsDto?,
        tipAmount: Long,
    ): TdlResult<PaymentResultDto> {
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
        settings: PhoneNumberAuthenticationSettingsDto?,
        type: PhoneNumberCodeTypeDto,
    ): TdlResult<AuthenticationCodeInfoDto> {
        val function = TdApi.SendPhoneNumberCode(
            phoneNumber = phoneNumber,
            settings = settings?.let { mapper.map(it) },
            type = mapper.map(type),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendPhoneNumberFirebaseSms(token: String): TdlResult<OkDto> {
        val function = TdApi.SendPhoneNumberFirebaseSms(
            token = token,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendQuickReplyShortcutMessages(
        chatId: Long,
        shortcutId: Int,
        sendingId: Int,
    ): TdlResult<MessagesDto> {
        val function = TdApi.SendQuickReplyShortcutMessages(
            chatId = chatId,
            shortcutId = shortcutId,
            sendingId = sendingId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sendWebAppCustomRequest(
        botUserId: Long,
        method: String,
        parameters: String,
    ): TdlResult<CustomRequestResultDto> {
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
    ): TdlResult<OkDto> {
        val function = TdApi.SendWebAppData(
            botUserId = botUserId,
            buttonText = buttonText,
            data = data,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setAccentColor(accentColorId: Int, backgroundCustomEmojiId: Long): TdlResult<OkDto> {
        val function = TdApi.SetAccentColor(
            accentColorId = accentColorId,
            backgroundCustomEmojiId = backgroundCustomEmojiId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setAccountTtl(ttl: AccountTtlDto): TdlResult<OkDto> {
        val function = TdApi.SetAccountTtl(
            ttl = mapper.map(ttl),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setAlarm(seconds: Double): TdlResult<OkDto> {
        val function = TdApi.SetAlarm(
            seconds = seconds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setApplicationVerificationToken(verificationId: Long, token: String): TdlResult<OkDto> {
        val function = TdApi.SetApplicationVerificationToken(
            verificationId = verificationId,
            token = token,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setArchiveChatListSettings(settings: ArchiveChatListSettingsDto): TdlResult<OkDto> {
        val function = TdApi.SetArchiveChatListSettings(
            settings = mapper.map(settings),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setAuthenticationEmailAddress(emailAddress: String): TdlResult<OkDto> {
        val function = TdApi.SetAuthenticationEmailAddress(
            emailAddress = emailAddress,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setAuthenticationPhoneNumber(phoneNumber: String, settings: PhoneNumberAuthenticationSettingsDto?): TdlResult<OkDto> {
        val function = TdApi.SetAuthenticationPhoneNumber(
            phoneNumber = phoneNumber,
            settings = settings?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setAuthenticationPremiumPurchaseTransaction(
        transaction: StoreTransactionDto,
        isRestore: Boolean,
        currency: String,
        amount: Long,
    ): TdlResult<OkDto> {
        val function = TdApi.SetAuthenticationPremiumPurchaseTransaction(
            transaction = mapper.map(transaction),
            isRestore = isRestore,
            currency = currency,
            amount = amount,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setAutoDownloadSettings(settings: AutoDownloadSettingsDto, type: NetworkTypeDto): TdlResult<OkDto> {
        val function = TdApi.SetAutoDownloadSettings(
            settings = mapper.map(settings),
            type = mapper.map(type),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setAutosaveSettings(scope: AutosaveSettingsScopeDto, settings: ScopeAutosaveSettingsDto?): TdlResult<OkDto> {
        val function = TdApi.SetAutosaveSettings(
            scope = mapper.map(scope),
            settings = settings?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBio(bio: String): TdlResult<OkDto> {
        val function = TdApi.SetBio(
            bio = bio,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBirthdate(birthdate: BirthdateDto?): TdlResult<OkDto> {
        val function = TdApi.SetBirthdate(
            birthdate = birthdate?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBotInfoDescription(
        botUserId: Long,
        languageCode: String,
        description: String,
    ): TdlResult<OkDto> {
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
    ): TdlResult<OkDto> {
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
    ): TdlResult<OkDto> {
        val function = TdApi.SetBotName(
            botUserId = botUserId,
            languageCode = languageCode,
            name = name,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBotProfilePhoto(botUserId: Long, photo: InputChatPhotoDto?): TdlResult<OkDto> {
        val function = TdApi.SetBotProfilePhoto(
            botUserId = botUserId,
            photo = photo?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBotUpdatesStatus(pendingUpdateCount: Int, errorMessage: String): TdlResult<OkDto> {
        val function = TdApi.SetBotUpdatesStatus(
            pendingUpdateCount = pendingUpdateCount,
            errorMessage = errorMessage,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBusinessAccountBio(businessConnectionId: String, bio: String): TdlResult<OkDto> {
        val function = TdApi.SetBusinessAccountBio(
            businessConnectionId = businessConnectionId,
            bio = bio,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBusinessAccountGiftSettings(businessConnectionId: String, settings: GiftSettingsDto): TdlResult<OkDto> {
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
    ): TdlResult<OkDto> {
        val function = TdApi.SetBusinessAccountName(
            businessConnectionId = businessConnectionId,
            firstName = firstName,
            lastName = lastName,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBusinessAccountProfilePhoto(
        businessConnectionId: String,
        photo: InputChatPhotoDto?,
        isPublic: Boolean,
    ): TdlResult<OkDto> {
        val function = TdApi.SetBusinessAccountProfilePhoto(
            businessConnectionId = businessConnectionId,
            photo = photo?.let { mapper.map(it) },
            isPublic = isPublic,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBusinessAccountUsername(businessConnectionId: String, username: String): TdlResult<OkDto> {
        val function = TdApi.SetBusinessAccountUsername(
            businessConnectionId = businessConnectionId,
            username = username,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBusinessAwayMessageSettings(awayMessageSettings: BusinessAwayMessageSettingsDto?): TdlResult<OkDto> {
        val function = TdApi.SetBusinessAwayMessageSettings(
            awayMessageSettings = awayMessageSettings?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBusinessConnectedBot(bot: BusinessConnectedBotDto): TdlResult<OkDto> {
        val function = TdApi.SetBusinessConnectedBot(
            bot = mapper.map(bot),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBusinessGreetingMessageSettings(greetingMessageSettings: BusinessGreetingMessageSettingsDto?): TdlResult<OkDto> {
        val function = TdApi.SetBusinessGreetingMessageSettings(
            greetingMessageSettings = greetingMessageSettings?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBusinessLocation(location: BusinessLocationDto?): TdlResult<OkDto> {
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
    ): TdlResult<OkDto> {
        val function = TdApi.SetBusinessMessageIsPinned(
            businessConnectionId = businessConnectionId,
            chatId = chatId,
            messageId = messageId,
            isPinned = isPinned,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBusinessOpeningHours(openingHours: BusinessOpeningHoursDto?): TdlResult<OkDto> {
        val function = TdApi.SetBusinessOpeningHours(
            openingHours = openingHours?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setBusinessStartPage(startPage: InputBusinessStartPageDto?): TdlResult<OkDto> {
        val function = TdApi.SetBusinessStartPage(
            startPage = startPage?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatAccentColor(
        chatId: Long,
        accentColorId: Int,
        backgroundCustomEmojiId: Long,
    ): TdlResult<OkDto> {
        val function = TdApi.SetChatAccentColor(
            chatId = chatId,
            accentColorId = accentColorId,
            backgroundCustomEmojiId = backgroundCustomEmojiId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatActiveStoriesList(chatId: Long, storyList: StoryListDto): TdlResult<OkDto> {
        val function = TdApi.SetChatActiveStoriesList(
            chatId = chatId,
            storyList = mapper.map(storyList),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatAffiliateProgram(chatId: Long, parameters: AffiliateProgramParametersDto?): TdlResult<OkDto> {
        val function = TdApi.SetChatAffiliateProgram(
            chatId = chatId,
            parameters = parameters?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatAvailableReactions(chatId: Long, availableReactions: ChatAvailableReactionsDto): TdlResult<OkDto> {
        val function = TdApi.SetChatAvailableReactions(
            chatId = chatId,
            availableReactions = mapper.map(availableReactions),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatBackground(
        chatId: Long,
        background: InputBackgroundDto?,
        type: BackgroundTypeDto?,
        darkThemeDimming: Int,
        onlyForSelf: Boolean,
    ): TdlResult<OkDto> {
        val function = TdApi.SetChatBackground(
            chatId = chatId,
            background = background?.let { mapper.map(it) },
            type = type?.let { mapper.map(it) },
            darkThemeDimming = darkThemeDimming,
            onlyForSelf = onlyForSelf,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatClientData(chatId: Long, clientData: String): TdlResult<OkDto> {
        val function = TdApi.SetChatClientData(
            chatId = chatId,
            clientData = clientData,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatDescription(chatId: Long, description: String): TdlResult<OkDto> {
        val function = TdApi.SetChatDescription(
            chatId = chatId,
            description = description,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatDiscussionGroup(chatId: Long, discussionChatId: Long): TdlResult<OkDto> {
        val function = TdApi.SetChatDiscussionGroup(
            chatId = chatId,
            discussionChatId = discussionChatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatDraftMessage(
        chatId: Long,
        messageThreadId: Long,
        draftMessage: DraftMessageDto?,
    ): TdlResult<OkDto> {
        val function = TdApi.SetChatDraftMessage(
            chatId = chatId,
            messageThreadId = messageThreadId,
            draftMessage = draftMessage?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatEmojiStatus(chatId: Long, emojiStatus: EmojiStatusDto?): TdlResult<OkDto> {
        val function = TdApi.SetChatEmojiStatus(
            chatId = chatId,
            emojiStatus = emojiStatus?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatLocation(chatId: Long, location: ChatLocationDto): TdlResult<OkDto> {
        val function = TdApi.SetChatLocation(
            chatId = chatId,
            location = mapper.map(location),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatMemberStatus(
        chatId: Long,
        memberId: MessageSenderDto,
        status: ChatMemberStatusDto,
    ): TdlResult<OkDto> {
        val function = TdApi.SetChatMemberStatus(
            chatId = chatId,
            memberId = mapper.map(memberId),
            status = mapper.map(status),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatMessageAutoDeleteTime(chatId: Long, messageAutoDeleteTime: Int): TdlResult<OkDto> {
        val function = TdApi.SetChatMessageAutoDeleteTime(
            chatId = chatId,
            messageAutoDeleteTime = messageAutoDeleteTime,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatMessageSender(chatId: Long, messageSenderId: MessageSenderDto): TdlResult<OkDto> {
        val function = TdApi.SetChatMessageSender(
            chatId = chatId,
            messageSenderId = mapper.map(messageSenderId),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatNotificationSettings(chatId: Long, notificationSettings: ChatNotificationSettingsDto): TdlResult<OkDto> {
        val function = TdApi.SetChatNotificationSettings(
            chatId = chatId,
            notificationSettings = mapper.map(notificationSettings),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatPaidMessageStarCount(chatId: Long, paidMessageStarCount: Long): TdlResult<OkDto> {
        val function = TdApi.SetChatPaidMessageStarCount(
            chatId = chatId,
            paidMessageStarCount = paidMessageStarCount,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatPermissions(chatId: Long, permissions: ChatPermissionsDto): TdlResult<OkDto> {
        val function = TdApi.SetChatPermissions(
            chatId = chatId,
            permissions = mapper.map(permissions),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatPhoto(chatId: Long, photo: InputChatPhotoDto?): TdlResult<OkDto> {
        val function = TdApi.SetChatPhoto(
            chatId = chatId,
            photo = photo?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatPinnedStories(chatId: Long, storyIds: IntArray): TdlResult<OkDto> {
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
    ): TdlResult<OkDto> {
        val function = TdApi.SetChatProfileAccentColor(
            chatId = chatId,
            profileAccentColorId = profileAccentColorId,
            profileBackgroundCustomEmojiId = profileBackgroundCustomEmojiId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatSlowModeDelay(chatId: Long, slowModeDelay: Int): TdlResult<OkDto> {
        val function = TdApi.SetChatSlowModeDelay(
            chatId = chatId,
            slowModeDelay = slowModeDelay,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatTheme(chatId: Long, themeName: String): TdlResult<OkDto> {
        val function = TdApi.SetChatTheme(
            chatId = chatId,
            themeName = themeName,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setChatTitle(chatId: Long, title: String): TdlResult<OkDto> {
        val function = TdApi.SetChatTitle(
            chatId = chatId,
            title = title,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setCloseFriends(userIds: LongArray): TdlResult<OkDto> {
        val function = TdApi.SetCloseFriends(
            userIds = userIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setCommands(
        scope: BotCommandScopeDto?,
        languageCode: String,
        commands: Array<BotCommandDto>,
    ): TdlResult<OkDto> {
        val function = TdApi.SetCommands(
            scope = scope?.let { mapper.map(it) },
            languageCode = languageCode,
            commands = commands.mapArray { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setCustomEmojiStickerSetThumbnail(name: String, customEmojiId: Long): TdlResult<OkDto> {
        val function = TdApi.SetCustomEmojiStickerSetThumbnail(
            name = name,
            customEmojiId = customEmojiId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setCustomLanguagePack(info: LanguagePackInfoDto, strings: Array<LanguagePackStringDto>): TdlResult<OkDto> {
        val function = TdApi.SetCustomLanguagePack(
            info = mapper.map(info),
            strings = strings.mapArray { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setCustomLanguagePackString(languagePackId: String, newString: LanguagePackStringDto): TdlResult<OkDto> {
        val function = TdApi.SetCustomLanguagePackString(
            languagePackId = languagePackId,
            newString = mapper.map(newString),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setDatabaseEncryptionKey(newEncryptionKey: ByteArray): TdlResult<OkDto> {
        val function = TdApi.SetDatabaseEncryptionKey(
            newEncryptionKey = newEncryptionKey,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setDefaultBackground(
        background: InputBackgroundDto?,
        type: BackgroundTypeDto?,
        forDarkTheme: Boolean,
    ): TdlResult<BackgroundDto> {
        val function = TdApi.SetDefaultBackground(
            background = background?.let { mapper.map(it) },
            type = type?.let { mapper.map(it) },
            forDarkTheme = forDarkTheme,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setDefaultChannelAdministratorRights(defaultChannelAdministratorRights: ChatAdministratorRightsDto?): TdlResult<OkDto> {
        val function = TdApi.SetDefaultChannelAdministratorRights(
            defaultChannelAdministratorRights = defaultChannelAdministratorRights?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setDefaultGroupAdministratorRights(defaultGroupAdministratorRights: ChatAdministratorRightsDto?): TdlResult<OkDto> {
        val function = TdApi.SetDefaultGroupAdministratorRights(
            defaultGroupAdministratorRights = defaultGroupAdministratorRights?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setDefaultMessageAutoDeleteTime(messageAutoDeleteTime: MessageAutoDeleteTimeDto): TdlResult<OkDto> {
        val function = TdApi.SetDefaultMessageAutoDeleteTime(
            messageAutoDeleteTime = mapper.map(messageAutoDeleteTime),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setDefaultReactionType(reactionType: ReactionTypeDto): TdlResult<OkDto> {
        val function = TdApi.SetDefaultReactionType(
            reactionType = mapper.map(reactionType),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setEmojiStatus(emojiStatus: EmojiStatusDto?): TdlResult<OkDto> {
        val function = TdApi.SetEmojiStatus(
            emojiStatus = emojiStatus?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setFileGenerationProgress(
        generationId: Long,
        expectedSize: Long,
        localPrefixSize: Long,
    ): TdlResult<OkDto> {
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
        notificationSettings: ChatNotificationSettingsDto,
    ): TdlResult<OkDto> {
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
    ): TdlResult<MessageDto> {
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

    override suspend fun setGiftSettings(settings: GiftSettingsDto): TdlResult<OkDto> {
        val function = TdApi.SetGiftSettings(
            settings = mapper.map(settings),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setGroupCallParticipantIsSpeaking(
        groupCallId: Int,
        audioSource: Int,
        isSpeaking: Boolean,
    ): TdlResult<OkDto> {
        val function = TdApi.SetGroupCallParticipantIsSpeaking(
            groupCallId = groupCallId,
            audioSource = audioSource,
            isSpeaking = isSpeaking,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setGroupCallParticipantVolumeLevel(
        groupCallId: Int,
        participantId: MessageSenderDto,
        volumeLevel: Int,
    ): TdlResult<OkDto> {
        val function = TdApi.SetGroupCallParticipantVolumeLevel(
            groupCallId = groupCallId,
            participantId = mapper.map(participantId),
            volumeLevel = volumeLevel,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setInactiveSessionTtl(inactiveSessionTtlDays: Int): TdlResult<OkDto> {
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
    ): TdlResult<OkDto> {
        val function = TdApi.SetInlineGameScore(
            inlineMessageId = inlineMessageId,
            editMessage = editMessage,
            userId = userId,
            score = score,
            force = force,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setLogStream(logStream: LogStreamDto): TdlResult<OkDto> {
        val function = TdApi.SetLogStream(
            logStream = mapper.map(logStream),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setLogTagVerbosityLevel(tag: String, newVerbosityLevel: Int): TdlResult<OkDto> {
        val function = TdApi.SetLogTagVerbosityLevel(
            tag = tag,
            newVerbosityLevel = newVerbosityLevel,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setLogVerbosityLevel(newVerbosityLevel: Int): TdlResult<OkDto> {
        val function = TdApi.SetLogVerbosityLevel(
            newVerbosityLevel = newVerbosityLevel,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setLoginEmailAddress(newLoginEmailAddress: String): TdlResult<EmailAddressAuthenticationCodeInfoDto> {
        val function = TdApi.SetLoginEmailAddress(
            newLoginEmailAddress = newLoginEmailAddress,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setMenuButton(userId: Long, menuButton: BotMenuButtonDto): TdlResult<OkDto> {
        val function = TdApi.SetMenuButton(
            userId = userId,
            menuButton = mapper.map(menuButton),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setMessageFactCheck(
        chatId: Long,
        messageId: Long,
        text: FormattedTextDto?,
    ): TdlResult<OkDto> {
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
        reactionTypes: Array<ReactionTypeDto>,
        isBig: Boolean,
    ): TdlResult<OkDto> {
        val function = TdApi.SetMessageReactions(
            chatId = chatId,
            messageId = messageId,
            reactionTypes = reactionTypes.mapArray { mapper.map(it) },
            isBig = isBig,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setMessageSenderBlockList(senderId: MessageSenderDto, blockList: BlockListDto?): TdlResult<OkDto> {
        val function = TdApi.SetMessageSenderBlockList(
            senderId = mapper.map(senderId),
            blockList = blockList?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setMessageSenderBotVerification(
        botUserId: Long,
        verifiedId: MessageSenderDto,
        customDescription: String,
    ): TdlResult<OkDto> {
        val function = TdApi.SetMessageSenderBotVerification(
            botUserId = botUserId,
            verifiedId = mapper.map(verifiedId),
            customDescription = customDescription,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setName(firstName: String, lastName: String): TdlResult<OkDto> {
        val function = TdApi.SetName(
            firstName = firstName,
            lastName = lastName,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setNetworkType(type: NetworkTypeDto?): TdlResult<OkDto> {
        val function = TdApi.SetNetworkType(
            type = type?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setNewChatPrivacySettings(settings: NewChatPrivacySettingsDto): TdlResult<OkDto> {
        val function = TdApi.SetNewChatPrivacySettings(
            settings = mapper.map(settings),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setOption(name: String, value: OptionValueDto?): TdlResult<OkDto> {
        val function = TdApi.SetOption(
            name = name,
            value = value?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setPaidMessageReactionType(
        chatId: Long,
        messageId: Long,
        type: PaidReactionTypeDto,
    ): TdlResult<OkDto> {
        val function = TdApi.SetPaidMessageReactionType(
            chatId = chatId,
            messageId = messageId,
            type = mapper.map(type),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setPassportElement(element: InputPassportElementDto, password: String): TdlResult<PassportElementDto> {
        val function = TdApi.SetPassportElement(
            element = mapper.map(element),
            password = password,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setPassportElementErrors(userId: Long, errors: Array<InputPassportElementErrorDto>): TdlResult<OkDto> {
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
    ): TdlResult<PasswordStateDto> {
        val function = TdApi.SetPassword(
            oldPassword = oldPassword,
            newPassword = newPassword,
            newHint = newHint,
            setRecoveryEmailAddress = setRecoveryEmailAddress,
            newRecoveryEmailAddress = newRecoveryEmailAddress,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setPersonalChat(chatId: Long): TdlResult<OkDto> {
        val function = TdApi.SetPersonalChat(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setPinnedChats(chatList: ChatListDto, chatIds: LongArray): TdlResult<OkDto> {
        val function = TdApi.SetPinnedChats(
            chatList = mapper.map(chatList),
            chatIds = chatIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setPinnedForumTopics(chatId: Long, messageThreadIds: LongArray): TdlResult<OkDto> {
        val function = TdApi.SetPinnedForumTopics(
            chatId = chatId,
            messageThreadIds = messageThreadIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setPinnedGifts(ownerId: MessageSenderDto, receivedGiftIds: Array<String>): TdlResult<OkDto> {
        val function = TdApi.SetPinnedGifts(
            ownerId = mapper.map(ownerId),
            receivedGiftIds = receivedGiftIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setPinnedSavedMessagesTopics(savedMessagesTopicIds: LongArray): TdlResult<OkDto> {
        val function = TdApi.SetPinnedSavedMessagesTopics(
            savedMessagesTopicIds = savedMessagesTopicIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setPollAnswer(
        chatId: Long,
        messageId: Long,
        optionIds: IntArray,
    ): TdlResult<OkDto> {
        val function = TdApi.SetPollAnswer(
            chatId = chatId,
            messageId = messageId,
            optionIds = optionIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setProfileAccentColor(profileAccentColorId: Int, profileBackgroundCustomEmojiId: Long): TdlResult<OkDto> {
        val function = TdApi.SetProfileAccentColor(
            profileAccentColorId = profileAccentColorId,
            profileBackgroundCustomEmojiId = profileBackgroundCustomEmojiId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setProfilePhoto(photo: InputChatPhotoDto, isPublic: Boolean): TdlResult<OkDto> {
        val function = TdApi.SetProfilePhoto(
            photo = mapper.map(photo),
            isPublic = isPublic,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setQuickReplyShortcutName(shortcutId: Int, name: String): TdlResult<OkDto> {
        val function = TdApi.SetQuickReplyShortcutName(
            shortcutId = shortcutId,
            name = name,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setReactionNotificationSettings(notificationSettings: ReactionNotificationSettingsDto): TdlResult<OkDto> {
        val function = TdApi.SetReactionNotificationSettings(
            notificationSettings = mapper.map(notificationSettings),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setReadDatePrivacySettings(settings: ReadDatePrivacySettingsDto): TdlResult<OkDto> {
        val function = TdApi.SetReadDatePrivacySettings(
            settings = mapper.map(settings),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setRecoveryEmailAddress(password: String, newRecoveryEmailAddress: String): TdlResult<PasswordStateDto> {
        val function = TdApi.SetRecoveryEmailAddress(
            password = password,
            newRecoveryEmailAddress = newRecoveryEmailAddress,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setSavedMessagesTagLabel(tag: ReactionTypeDto, label: String): TdlResult<OkDto> {
        val function = TdApi.SetSavedMessagesTagLabel(
            tag = mapper.map(tag),
            label = label,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setScopeNotificationSettings(scope: NotificationSettingsScopeDto, notificationSettings: ScopeNotificationSettingsDto): TdlResult<OkDto> {
        val function = TdApi.SetScopeNotificationSettings(
            scope = mapper.map(scope),
            notificationSettings = mapper.map(notificationSettings),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setStickerEmojis(sticker: InputFileDto, emojis: String): TdlResult<OkDto> {
        val function = TdApi.SetStickerEmojis(
            sticker = mapper.map(sticker),
            emojis = emojis,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setStickerKeywords(sticker: InputFileDto, keywords: Array<String>): TdlResult<OkDto> {
        val function = TdApi.SetStickerKeywords(
            sticker = mapper.map(sticker),
            keywords = keywords,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setStickerMaskPosition(sticker: InputFileDto, maskPosition: MaskPositionDto?): TdlResult<OkDto> {
        val function = TdApi.SetStickerMaskPosition(
            sticker = mapper.map(sticker),
            maskPosition = maskPosition?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setStickerPositionInSet(sticker: InputFileDto, position: Int): TdlResult<OkDto> {
        val function = TdApi.SetStickerPositionInSet(
            sticker = mapper.map(sticker),
            position = position,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setStickerSetThumbnail(
        userId: Long,
        name: String,
        thumbnail: InputFileDto?,
        format: StickerFormatDto?,
    ): TdlResult<OkDto> {
        val function = TdApi.SetStickerSetThumbnail(
            userId = userId,
            name = name,
            thumbnail = thumbnail?.let { mapper.map(it) },
            format = format?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setStickerSetTitle(name: String, title: String): TdlResult<OkDto> {
        val function = TdApi.SetStickerSetTitle(
            name = name,
            title = title,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setStoryPrivacySettings(storyId: Int, privacySettings: StoryPrivacySettingsDto): TdlResult<OkDto> {
        val function = TdApi.SetStoryPrivacySettings(
            storyId = storyId,
            privacySettings = mapper.map(privacySettings),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setStoryReaction(
        storyPosterChatId: Long,
        storyId: Int,
        reactionType: ReactionTypeDto?,
        updateRecentReactions: Boolean,
    ): TdlResult<OkDto> {
        val function = TdApi.SetStoryReaction(
            storyPosterChatId = storyPosterChatId,
            storyId = storyId,
            reactionType = reactionType?.let { mapper.map(it) },
            updateRecentReactions = updateRecentReactions,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setSupergroupCustomEmojiStickerSet(supergroupId: Long, customEmojiStickerSetId: Long): TdlResult<OkDto> {
        val function = TdApi.SetSupergroupCustomEmojiStickerSet(
            supergroupId = supergroupId,
            customEmojiStickerSetId = customEmojiStickerSetId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setSupergroupStickerSet(supergroupId: Long, stickerSetId: Long): TdlResult<OkDto> {
        val function = TdApi.SetSupergroupStickerSet(
            supergroupId = supergroupId,
            stickerSetId = stickerSetId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setSupergroupUnrestrictBoostCount(supergroupId: Long, unrestrictBoostCount: Int): TdlResult<OkDto> {
        val function = TdApi.SetSupergroupUnrestrictBoostCount(
            supergroupId = supergroupId,
            unrestrictBoostCount = unrestrictBoostCount,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setSupergroupUsername(supergroupId: Long, username: String): TdlResult<OkDto> {
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
    ): TdlResult<OkDto> {
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

    override suspend fun setUserEmojiStatus(userId: Long, emojiStatus: EmojiStatusDto?): TdlResult<OkDto> {
        val function = TdApi.SetUserEmojiStatus(
            userId = userId,
            emojiStatus = emojiStatus?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setUserPersonalProfilePhoto(userId: Long, photo: InputChatPhotoDto?): TdlResult<OkDto> {
        val function = TdApi.SetUserPersonalProfilePhoto(
            userId = userId,
            photo = photo?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setUserPrivacySettingRules(setting: UserPrivacySettingDto, rules: UserPrivacySettingRulesDto): TdlResult<OkDto> {
        val function = TdApi.SetUserPrivacySettingRules(
            setting = mapper.map(setting),
            rules = mapper.map(rules),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setUserSupportInfo(userId: Long, message: FormattedTextDto): TdlResult<UserSupportInfoDto> {
        val function = TdApi.SetUserSupportInfo(
            userId = userId,
            message = mapper.map(message),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setUsername(username: String): TdlResult<OkDto> {
        val function = TdApi.SetUsername(
            username = username,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setVideoChatDefaultParticipant(chatId: Long, defaultParticipantId: MessageSenderDto): TdlResult<OkDto> {
        val function = TdApi.SetVideoChatDefaultParticipant(
            chatId = chatId,
            defaultParticipantId = mapper.map(defaultParticipantId),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun setVideoChatTitle(groupCallId: Int, title: String): TdlResult<OkDto> {
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
    ): TdlResult<OkDto> {
        val function = TdApi.ShareChatWithBot(
            chatId = chatId,
            messageId = messageId,
            buttonId = buttonId,
            sharedChatId = sharedChatId,
            onlyCheck = onlyCheck,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun sharePhoneNumber(userId: Long): TdlResult<OkDto> {
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
    ): TdlResult<OkDto> {
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
    ): TdlResult<OkDto> {
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
    ): TdlResult<TextDto> {
        val function = TdApi.StartGroupCallScreenSharing(
            groupCallId = groupCallId,
            audioSourceId = audioSourceId,
            payload = payload,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun startScheduledVideoChat(groupCallId: Int): TdlResult<OkDto> {
        val function = TdApi.StartScheduledVideoChat(
            groupCallId = groupCallId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun stopBusinessPoll(
        businessConnectionId: String,
        chatId: Long,
        messageId: Long,
        replyMarkup: ReplyMarkupDto?,
    ): TdlResult<BusinessMessageDto> {
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
        replyMarkup: ReplyMarkupDto?,
    ): TdlResult<OkDto> {
        val function = TdApi.StopPoll(
            chatId = chatId,
            messageId = messageId,
            replyMarkup = replyMarkup?.let { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun suggestUserProfilePhoto(userId: Long, photo: InputChatPhotoDto): TdlResult<OkDto> {
        val function = TdApi.SuggestUserProfilePhoto(
            userId = userId,
            photo = mapper.map(photo),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun synchronizeLanguagePack(languagePackId: String): TdlResult<OkDto> {
        val function = TdApi.SynchronizeLanguagePack(
            languagePackId = languagePackId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun terminateAllOtherSessions(): TdlResult<OkDto> {
        val function = TdApi.TerminateAllOtherSessions(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun terminateSession(sessionId: Long): TdlResult<OkDto> {
        val function = TdApi.TerminateSession(
            sessionId = sessionId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun testCallBytes(x: ByteArray): TdlResult<TestBytesDto> {
        val function = TdApi.TestCallBytes(
            x = x,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun testCallEmpty(): TdlResult<OkDto> {
        val function = TdApi.TestCallEmpty(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun testCallString(x: String): TdlResult<TestStringDto> {
        val function = TdApi.TestCallString(
            x = x,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun testCallVectorInt(x: IntArray): TdlResult<TestVectorIntDto> {
        val function = TdApi.TestCallVectorInt(
            x = x,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun testCallVectorIntObject(x: Array<TestIntDto>): TdlResult<TestVectorIntObjectDto> {
        val function = TdApi.TestCallVectorIntObject(
            x = x.mapArray { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun testCallVectorString(x: Array<String>): TdlResult<TestVectorStringDto> {
        val function = TdApi.TestCallVectorString(
            x = x,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun testCallVectorStringObject(x: Array<TestStringDto>): TdlResult<TestVectorStringObjectDto> {
        val function = TdApi.TestCallVectorStringObject(
            x = x.mapArray { mapper.map(it) },
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun testGetDifference(): TdlResult<OkDto> {
        val function = TdApi.TestGetDifference(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun testNetwork(): TdlResult<OkDto> {
        val function = TdApi.TestNetwork(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun testProxy(
        server: String,
        port: Int,
        type: ProxyTypeDto,
        dcId: Int,
        timeout: Double,
    ): TdlResult<OkDto> {
        val function = TdApi.TestProxy(
            server = server,
            port = port,
            type = mapper.map(type),
            dcId = dcId,
            timeout = timeout,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun testReturnError(error: ErrorDto): TdlResult<ErrorDto> {
        val function = TdApi.TestReturnError(
            error = mapper.map(error),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun testSquareInt(x: Int): TdlResult<TestIntDto> {
        val function = TdApi.TestSquareInt(
            x = x,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun testUseUpdate(): TdlResult<UpdateDto> {
        val function = TdApi.TestUseUpdate(
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleAllDownloadsArePaused(arePaused: Boolean): TdlResult<OkDto> {
        val function = TdApi.ToggleAllDownloadsArePaused(
            arePaused = arePaused,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleBotCanManageEmojiStatus(botUserId: Long, canManageEmojiStatus: Boolean): TdlResult<OkDto> {
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
    ): TdlResult<OkDto> {
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
    ): TdlResult<OkDto> {
        val function = TdApi.ToggleBotUsernameIsActive(
            botUserId = botUserId,
            username = username,
            isActive = isActive,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleBusinessConnectedBotChatIsPaused(chatId: Long, isPaused: Boolean): TdlResult<OkDto> {
        val function = TdApi.ToggleBusinessConnectedBotChatIsPaused(
            chatId = chatId,
            isPaused = isPaused,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleChatDefaultDisableNotification(chatId: Long, defaultDisableNotification: Boolean): TdlResult<OkDto> {
        val function = TdApi.ToggleChatDefaultDisableNotification(
            chatId = chatId,
            defaultDisableNotification = defaultDisableNotification,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleChatFolderTags(areTagsEnabled: Boolean): TdlResult<OkDto> {
        val function = TdApi.ToggleChatFolderTags(
            areTagsEnabled = areTagsEnabled,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleChatGiftNotifications(chatId: Long, areEnabled: Boolean): TdlResult<OkDto> {
        val function = TdApi.ToggleChatGiftNotifications(
            chatId = chatId,
            areEnabled = areEnabled,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleChatHasProtectedContent(chatId: Long, hasProtectedContent: Boolean): TdlResult<OkDto> {
        val function = TdApi.ToggleChatHasProtectedContent(
            chatId = chatId,
            hasProtectedContent = hasProtectedContent,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleChatIsMarkedAsUnread(chatId: Long, isMarkedAsUnread: Boolean): TdlResult<OkDto> {
        val function = TdApi.ToggleChatIsMarkedAsUnread(
            chatId = chatId,
            isMarkedAsUnread = isMarkedAsUnread,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleChatIsPinned(
        chatList: ChatListDto,
        chatId: Long,
        isPinned: Boolean,
    ): TdlResult<OkDto> {
        val function = TdApi.ToggleChatIsPinned(
            chatList = mapper.map(chatList),
            chatId = chatId,
            isPinned = isPinned,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleChatIsTranslatable(chatId: Long, isTranslatable: Boolean): TdlResult<OkDto> {
        val function = TdApi.ToggleChatIsTranslatable(
            chatId = chatId,
            isTranslatable = isTranslatable,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleChatViewAsTopics(chatId: Long, viewAsTopics: Boolean): TdlResult<OkDto> {
        val function = TdApi.ToggleChatViewAsTopics(
            chatId = chatId,
            viewAsTopics = viewAsTopics,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleDownloadIsPaused(fileId: Int, isPaused: Boolean): TdlResult<OkDto> {
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
    ): TdlResult<OkDto> {
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
    ): TdlResult<OkDto> {
        val function = TdApi.ToggleForumTopicIsPinned(
            chatId = chatId,
            messageThreadId = messageThreadId,
            isPinned = isPinned,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleGeneralForumTopicIsHidden(chatId: Long, isHidden: Boolean): TdlResult<OkDto> {
        val function = TdApi.ToggleGeneralForumTopicIsHidden(
            chatId = chatId,
            isHidden = isHidden,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleGiftIsSaved(receivedGiftId: String, isSaved: Boolean): TdlResult<OkDto> {
        val function = TdApi.ToggleGiftIsSaved(
            receivedGiftId = receivedGiftId,
            isSaved = isSaved,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleGroupCallIsMyVideoEnabled(groupCallId: Int, isMyVideoEnabled: Boolean): TdlResult<OkDto> {
        val function = TdApi.ToggleGroupCallIsMyVideoEnabled(
            groupCallId = groupCallId,
            isMyVideoEnabled = isMyVideoEnabled,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleGroupCallIsMyVideoPaused(groupCallId: Int, isMyVideoPaused: Boolean): TdlResult<OkDto> {
        val function = TdApi.ToggleGroupCallIsMyVideoPaused(
            groupCallId = groupCallId,
            isMyVideoPaused = isMyVideoPaused,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleGroupCallParticipantIsHandRaised(
        groupCallId: Int,
        participantId: MessageSenderDto,
        isHandRaised: Boolean,
    ): TdlResult<OkDto> {
        val function = TdApi.ToggleGroupCallParticipantIsHandRaised(
            groupCallId = groupCallId,
            participantId = mapper.map(participantId),
            isHandRaised = isHandRaised,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleGroupCallParticipantIsMuted(
        groupCallId: Int,
        participantId: MessageSenderDto,
        isMuted: Boolean,
    ): TdlResult<OkDto> {
        val function = TdApi.ToggleGroupCallParticipantIsMuted(
            groupCallId = groupCallId,
            participantId = mapper.map(participantId),
            isMuted = isMuted,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleGroupCallScreenSharingIsPaused(groupCallId: Int, isPaused: Boolean): TdlResult<OkDto> {
        val function = TdApi.ToggleGroupCallScreenSharingIsPaused(
            groupCallId = groupCallId,
            isPaused = isPaused,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleHasSponsoredMessagesEnabled(hasSponsoredMessagesEnabled: Boolean): TdlResult<OkDto> {
        val function = TdApi.ToggleHasSponsoredMessagesEnabled(
            hasSponsoredMessagesEnabled = hasSponsoredMessagesEnabled,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleSavedMessagesTopicIsPinned(savedMessagesTopicId: Long, isPinned: Boolean): TdlResult<OkDto> {
        val function = TdApi.ToggleSavedMessagesTopicIsPinned(
            savedMessagesTopicId = savedMessagesTopicId,
            isPinned = isPinned,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleSessionCanAcceptCalls(sessionId: Long, canAcceptCalls: Boolean): TdlResult<OkDto> {
        val function = TdApi.ToggleSessionCanAcceptCalls(
            sessionId = sessionId,
            canAcceptCalls = canAcceptCalls,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleSessionCanAcceptSecretChats(sessionId: Long, canAcceptSecretChats: Boolean): TdlResult<OkDto> {
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
    ): TdlResult<OkDto> {
        val function = TdApi.ToggleStoryIsPostedToChatPage(
            storyPosterChatId = storyPosterChatId,
            storyId = storyId,
            isPostedToChatPage = isPostedToChatPage,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleSupergroupCanHaveSponsoredMessages(supergroupId: Long, canHaveSponsoredMessages: Boolean): TdlResult<OkDto> {
        val function = TdApi.ToggleSupergroupCanHaveSponsoredMessages(
            supergroupId = supergroupId,
            canHaveSponsoredMessages = canHaveSponsoredMessages,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleSupergroupHasAggressiveAntiSpamEnabled(supergroupId: Long, hasAggressiveAntiSpamEnabled: Boolean): TdlResult<OkDto> {
        val function = TdApi.ToggleSupergroupHasAggressiveAntiSpamEnabled(
            supergroupId = supergroupId,
            hasAggressiveAntiSpamEnabled = hasAggressiveAntiSpamEnabled,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleSupergroupHasHiddenMembers(supergroupId: Long, hasHiddenMembers: Boolean): TdlResult<OkDto> {
        val function = TdApi.ToggleSupergroupHasHiddenMembers(
            supergroupId = supergroupId,
            hasHiddenMembers = hasHiddenMembers,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleSupergroupIsAllHistoryAvailable(supergroupId: Long, isAllHistoryAvailable: Boolean): TdlResult<OkDto> {
        val function = TdApi.ToggleSupergroupIsAllHistoryAvailable(
            supergroupId = supergroupId,
            isAllHistoryAvailable = isAllHistoryAvailable,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleSupergroupIsBroadcastGroup(supergroupId: Long): TdlResult<OkDto> {
        val function = TdApi.ToggleSupergroupIsBroadcastGroup(
            supergroupId = supergroupId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleSupergroupIsForum(supergroupId: Long, isForum: Boolean): TdlResult<OkDto> {
        val function = TdApi.ToggleSupergroupIsForum(
            supergroupId = supergroupId,
            isForum = isForum,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleSupergroupJoinByRequest(supergroupId: Long, joinByRequest: Boolean): TdlResult<OkDto> {
        val function = TdApi.ToggleSupergroupJoinByRequest(
            supergroupId = supergroupId,
            joinByRequest = joinByRequest,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleSupergroupJoinToSendMessages(supergroupId: Long, joinToSendMessages: Boolean): TdlResult<OkDto> {
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
    ): TdlResult<OkDto> {
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
    ): TdlResult<OkDto> {
        val function = TdApi.ToggleSupergroupUsernameIsActive(
            supergroupId = supergroupId,
            username = username,
            isActive = isActive,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleUsernameIsActive(username: String, isActive: Boolean): TdlResult<OkDto> {
        val function = TdApi.ToggleUsernameIsActive(
            username = username,
            isActive = isActive,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleVideoChatEnabledStartNotification(groupCallId: Int, enabledStartNotification: Boolean): TdlResult<OkDto> {
        val function = TdApi.ToggleVideoChatEnabledStartNotification(
            groupCallId = groupCallId,
            enabledStartNotification = enabledStartNotification,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun toggleVideoChatMuteNewParticipants(groupCallId: Int, muteNewParticipants: Boolean): TdlResult<OkDto> {
        val function = TdApi.ToggleVideoChatMuteNewParticipants(
            groupCallId = groupCallId,
            muteNewParticipants = muteNewParticipants,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun transferBusinessAccountStars(businessConnectionId: String, starCount: Long): TdlResult<OkDto> {
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
    ): TdlResult<OkDto> {
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
        newOwnerId: MessageSenderDto,
        starCount: Long,
    ): TdlResult<OkDto> {
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
    ): TdlResult<FormattedTextDto> {
        val function = TdApi.TranslateMessageText(
            chatId = chatId,
            messageId = messageId,
            toLanguageCode = toLanguageCode,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun translateText(text: FormattedTextDto, toLanguageCode: String): TdlResult<FormattedTextDto> {
        val function = TdApi.TranslateText(
            text = mapper.map(text),
            toLanguageCode = toLanguageCode,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun unpinAllChatMessages(chatId: Long): TdlResult<OkDto> {
        val function = TdApi.UnpinAllChatMessages(
            chatId = chatId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun unpinAllMessageThreadMessages(chatId: Long, messageThreadId: Long): TdlResult<OkDto> {
        val function = TdApi.UnpinAllMessageThreadMessages(
            chatId = chatId,
            messageThreadId = messageThreadId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun unpinChatMessage(chatId: Long, messageId: Long): TdlResult<OkDto> {
        val function = TdApi.UnpinChatMessage(
            chatId = chatId,
            messageId = messageId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun upgradeBasicGroupChatToSupergroupChat(chatId: Long): TdlResult<ChatDto> {
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
    ): TdlResult<UpgradeGiftResultDto> {
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
        stickerFormat: StickerFormatDto,
        sticker: InputFileDto,
    ): TdlResult<FileDto> {
        val function = TdApi.UploadStickerFile(
            userId = userId,
            stickerFormat = mapper.map(stickerFormat),
            sticker = mapper.map(sticker),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun validateOrderInfo(
        inputInvoice: InputInvoiceDto,
        orderInfo: OrderInfoDto?,
        allowSave: Boolean,
    ): TdlResult<ValidatedOrderInfoDto> {
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
        source: MessageSourceDto?,
        forceRead: Boolean,
    ): TdlResult<OkDto> {
        val function = TdApi.ViewMessages(
            chatId = chatId,
            messageIds = messageIds,
            source = source?.let { mapper.map(it) },
            forceRead = forceRead,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun viewPremiumFeature(feature: PremiumFeatureDto): TdlResult<OkDto> {
        val function = TdApi.ViewPremiumFeature(
            feature = mapper.map(feature),
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun viewSponsoredChat(sponsoredChatUniqueId: Long): TdlResult<OkDto> {
        val function = TdApi.ViewSponsoredChat(
            sponsoredChatUniqueId = sponsoredChatUniqueId,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun viewTrendingStickerSets(stickerSetIds: LongArray): TdlResult<OkDto> {
        val function = TdApi.ViewTrendingStickerSets(
            stickerSetIds = stickerSetIds,
        )
        return repository.send(function) { mapper.map(it) }
    }

    override suspend fun writeGeneratedFilePart(
        generationId: Long,
        offset: Long,
        data: ByteArray,
    ): TdlResult<OkDto> {
        val function = TdApi.WriteGeneratedFilePart(
            generationId = generationId,
            offset = offset,
            data = data,
        )
        return repository.send(function) { mapper.map(it) }
    }
}
